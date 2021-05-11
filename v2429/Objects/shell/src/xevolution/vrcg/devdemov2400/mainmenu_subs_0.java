package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mainmenu_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,121);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 121;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="mainLayout = \"MainMenuLayout\"";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._mainlayout = BA.ObjectToString("MainMenuLayout");
 BA.debugLineNum = 123;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(67108864);
if ((mainmenu.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 124;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(134217728);
mainmenu._device.runVoidMethod ("SetScreenOrientation",mainmenu.processBA,(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 125;BA.debugLine="mainLayout = \"phone_mainmenulayout\"";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._mainlayout = BA.ObjectToString("phone_mainmenulayout");
 }else {
 BA.debugLineNum = 127;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(1073741824);
mainmenu._device.runVoidMethod ("SetScreenOrientation",mainmenu.processBA,(Object)(mainmenu.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 };
 BA.debugLineNum = 130;BA.debugLine="If (FirstTime = True) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_firsttime,mainmenu.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 131;BA.debugLine="IsFirsttime = FirstTime";
Debug.ShouldStop(4);
mainmenu._isfirsttime = _firsttime;
 };
 BA.debugLineNum = 133;BA.debugLine="Activity.LoadLayout(mainLayout)";
Debug.ShouldStop(16);
mainmenu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(mainmenu.mostCurrent._mainlayout),mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 135;BA.debugLine="butSearch.Visible = Utils.Int2Bool(ShareCode.DEVI";
Debug.ShouldStop(64);
mainmenu.mostCurrent._butsearch.runMethod(true,"setVisible",mainmenu.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._device_show_global_search /*RemoteObject*/ )));
 BA.debugLineNum = 136;BA.debugLine="EditSearch.Visible = Utils.Int2Bool(ShareCode.DEV";
Debug.ShouldStop(128);
mainmenu.mostCurrent._editsearch.runMethod(true,"setVisible",mainmenu.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._device_show_global_search /*RemoteObject*/ )));
 BA.debugLineNum = 138;BA.debugLine="LabelAvisoProcessamento.Text = ShareCode.mainmenu";
Debug.ShouldStop(512);
mainmenu.mostCurrent._labelavisoprocessamento.runMethod(true,"setText",BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._mainmenulabelavisoprocessamento /*RemoteObject*/ ));
 BA.debugLineNum = 141;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(4096);
if ((mainmenu.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 142;BA.debugLine="MainMenuTabStrip.LoadLayout(\"main_menu_first_tab";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._mainmenutabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("main_menu_first_tab")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 143;BA.debugLine="MainMenuTabStrip.LoadLayout(\"main_menu_second_ta";
Debug.ShouldStop(16384);
mainmenu.mostCurrent._mainmenutabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("main_menu_second_tab")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 146;BA.debugLine="If Not(Comms.AlreadyStarted) Then";
Debug.ShouldStop(131072);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent._comms._alreadystarted /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 147;BA.debugLine="StartService(Comms)";
Debug.ShouldStop(262144);
mainmenu.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((mainmenu.mostCurrent._comms.getObject())));
 };
 BA.debugLineNum = 150;BA.debugLine="Utils.SetButtonBackgroundColorToMainColorWithRadi";
Debug.ShouldStop(2097152);
mainmenu.mostCurrent._utils.runVoidMethod ("_setbuttonbackgroundcolortomaincolorwithradius" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), mainmenu.mostCurrent._butquickaction.getObject()),(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 152;BA.debugLine="AfterCreateOrPause(IsFirsttime)";
Debug.ShouldStop(8388608);
_aftercreateorpause(mainmenu._isfirsttime);
 BA.debugLineNum = 153;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = mainmenu.getObject();
 BA.debugLineNum = 172;BA.debugLine="ShareCode.DEVICE_ONLY_TECHORUSER 			= Utils.IfNul";
Debug.ShouldStop(2048);
mainmenu.mostCurrent._sharecode._device_only_techoruser /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_ONLY_TECHORUSER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 173;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ID 			= Utils.IfNul";
Debug.ShouldStop(4096);
mainmenu.mostCurrent._sharecode._device_show_request_id /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_SHOW_REQUEST_ID"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 174;BA.debugLine="ShareCode.DEVICE_PARAM_DATA_CONFIRM 		= Utils.IfN";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._sharecode._device_param_data_confirm /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DATA_CONFIRM"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 175;BA.debugLine="ShareCode.DEVICE_PARAM_AVAILABILITY 		= Utils.IfN";
Debug.ShouldStop(16384);
mainmenu.mostCurrent._sharecode._device_param_availability /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_AVAILABILITY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 176;BA.debugLine="ShareCode.DEVICE_PARAM_FAVORITES 			= Utils.IfNul";
Debug.ShouldStop(32768);
mainmenu.mostCurrent._sharecode._device_param_favorites /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_FAVORITES"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 177;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_REQUEST 		= Utils.If";
Debug.ShouldStop(65536);
mainmenu.mostCurrent._sharecode._device_param_pause_request /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PAUSE_REQUEST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 178;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_TECH 			= Utils.IfNu";
Debug.ShouldStop(131072);
mainmenu.mostCurrent._sharecode._device_param_pause_tech /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PAUSE_TECH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 179;BA.debugLine="ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION = Uti";
Debug.ShouldStop(262144);
mainmenu.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_UPLOAD_ONEXECUTION"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 180;BA.debugLine="ShareCode.DEVICE_REQUEST_AUTOUPDT_ONALERT 	= Util";
Debug.ShouldStop(524288);
mainmenu.mostCurrent._sharecode._device_request_autoupdt_onalert /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_AUTOUPDT_ONALERT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 181;BA.debugLine="ShareCode.DEVICE_AS_SEND_IMMEDIATLY 		= Utils.IfN";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._sharecode._device_as_send_immediatly /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AS_SEND_IMMEDIATLY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 182;BA.debugLine="ShareCode.DEVICE_REQUEST_HIDECANCELED 		= Utils.I";
Debug.ShouldStop(2097152);
mainmenu.mostCurrent._sharecode._device_request_hidecanceled /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_HIDECANCELED"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 183;BA.debugLine="ShareCode.DEVICE_AUTOUPDATE_ONLOGIN 		= Utils.IfN";
Debug.ShouldStop(4194304);
mainmenu.mostCurrent._sharecode._device_autoupdate_onlogin /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AUTOUPDATE_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 184;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_FIRST 			= Utils.IfN";
Debug.ShouldStop(8388608);
mainmenu.mostCurrent._sharecode._device_auto_expand_first /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AUTO_EXPAND_FIRST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 185;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_CHECKLIST 		= Utils.";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._sharecode._device_auto_expand_checklist /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AUTO_EXPAND_CHECKLIST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 186;BA.debugLine="ShareCode.DEVICE_DEFAULT_ROUTE 				= Utils.IfNull";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._sharecode._device_default_route /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_DEFAULT_ROUTE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 187;BA.debugLine="ShareCode.DEVICE_AS_INCLUDE_OBS_FIRST 		= Utils.I";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._sharecode._device_as_include_obs_first /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AS_INCLUDE_OBS_FIRST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 188;BA.debugLine="ShareCode.DEVICE_PARAM_PRINT_DRAFT 			= Utils.IfN";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._sharecode._device_param_print_draft /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PRINT_DRAFT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 189;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ROUTE 		= Utils.IfN";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._sharecode._device_show_request_route /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_SHOW_REQUEST_ROUTE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 190;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER 		= Utils.IfN";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._sharecode._device_request_push_other /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_PUSH_OTHER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 191;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_QUALITY 		= Utils.If";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent._sharecode._device_param_photo_quality /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PHOTO_QUALITY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 193;BA.debugLine="ShareCode.DEVICE_REOPEN_CHECKLISTS 			= Utils.IfN";
Debug.ShouldStop(1);
mainmenu.mostCurrent._sharecode._device_reopen_checklists /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REOPEN_CHECKLISTS"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 196;BA.debugLine="ShareCode.DEVICE_REQUEST_SIGNATURE_TRG 		= Utils.";
Debug.ShouldStop(8);
mainmenu.mostCurrent._sharecode._device_request_signature_trg /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SIGNATURE_TRG"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 197;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER_AUTH 	= Utils";
Debug.ShouldStop(16);
mainmenu.mostCurrent._sharecode._device_request_push_other_auth /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_PUSH_OTHER_AUTH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 198;BA.debugLine="ShareCode.DEVICE_PARAM_ORIENTATION 			= Utils.IfN";
Debug.ShouldStop(32);
mainmenu.mostCurrent._sharecode._device_param_orientation /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ORIENTATION"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 199;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE 		= Utils.I";
Debug.ShouldStop(64);
mainmenu.mostCurrent._sharecode._device_param_photo_fontsize /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_FONTSIZE")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(12))));
 BA.debugLineNum = 200;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_HEIGHT 		= Utils.IfN";
Debug.ShouldStop(128);
mainmenu.mostCurrent._sharecode._device_param_photo_height /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_HEIGHT")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(615))));
 BA.debugLineNum = 201;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_WIDTH 			= Utils.IfN";
Debug.ShouldStop(256);
mainmenu.mostCurrent._sharecode._device_param_photo_width /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_WIDTH")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(820))));
 BA.debugLineNum = 202;BA.debugLine="ShareCode.DEVICE_REQUEST_CAN_DELETE_OWNED 	= Util";
Debug.ShouldStop(512);
mainmenu.mostCurrent._sharecode._device_request_can_delete_owned /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_CAN_DELETE_OWNED"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 203;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FILETYPE 		= Utils.I";
Debug.ShouldStop(1024);
mainmenu.mostCurrent._sharecode._device_param_photo_filetype /*RemoteObject*/  = mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_FILETYPE")),(Object)(RemoteObject.createImmutable("value")))),(Object)(RemoteObject.createImmutable("PNG")));
 BA.debugLineNum = 204;BA.debugLine="ShareCode.DEVICE_PARAM_PULL 				= Utils.IfNullOrE";
Debug.ShouldStop(2048);
mainmenu.mostCurrent._sharecode._device_param_pull /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PULL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 205;BA.debugLine="ShareCode.DEVICE_PARAM_ROUTES 				= Utils.IfNullO";
Debug.ShouldStop(4096);
mainmenu.mostCurrent._sharecode._device_param_routes /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ROUTES"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 207;BA.debugLine="ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.I";
Debug.ShouldStop(16384);
mainmenu.mostCurrent._sharecode._device_param_generatereport /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_GENERATEREPORT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 208;BA.debugLine="ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.";
Debug.ShouldStop(32768);
mainmenu.mostCurrent._sharecode._device_param_resync_requests /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_RESYNC_REQUESTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 209;BA.debugLine="ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Uti";
Debug.ShouldStop(65536);
mainmenu.mostCurrent._sharecode._device_param_runcl_notyperequest /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_RUNCL_NOTYPEREQUEST"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 210;BA.debugLine="ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.If";
Debug.ShouldStop(131072);
mainmenu.mostCurrent._sharecode._device_param_foto_evidence /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_FOTO_EVIDENCE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 211;BA.debugLine="ShareCode.DEVICE_PARAM_DRAW_EVIDENCE 		= Utils.If";
Debug.ShouldStop(262144);
mainmenu.mostCurrent._sharecode._device_param_draw_evidence /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DRAW_EVIDENCE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 213;BA.debugLine="ShareCode.DEVICE_PARAM_SENDREPORT 					= Utils.if";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._sharecode._device_param_sendreport /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_SENDREPORT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 214;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_OBJECT 			= Util";
Debug.ShouldStop(2097152);
mainmenu.mostCurrent._sharecode._device_param_canchange_object /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_CANCHANGE_OBJECT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 215;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_ENTITY 			= Util";
Debug.ShouldStop(4194304);
mainmenu.mostCurrent._sharecode._device_param_canchange_entity /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_CANCHANGE_ENTITY"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 216;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CANDUPLICATE 		= U";
Debug.ShouldStop(8388608);
mainmenu.mostCurrent._sharecode._device_param_request_canduplicate /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_CANDUPLICATE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 217;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSIGNTO 			= Util";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._sharecode._device_param_request_assignto /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ASSIGNTO"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 218;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._sharecode._device_param_request_assto_mustaccept /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 219;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANG";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._sharecode._device_param_request_infotitle_canchange /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 220;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._sharecode._device_param_request_cltitle_canchange /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 221;BA.debugLine="ShareCode.DEVICE_PARAM_ADDITIONAL_USERS_REGISTER";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._sharecode._device_param_additional_users_register /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ADDITIONAL_USERS_REGISTER"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 222;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._sharecode._device_param_login_mustselect_comapny /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 223;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONME";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent._sharecode._device_param_login_mustselect_environment /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 224;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRST";
Debug.ShouldStop(-2147483648);
mainmenu.mostCurrent._sharecode._device_param_login_passwordchange_firsttime /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 225;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL";
Debug.ShouldStop(1);
mainmenu.mostCurrent._sharecode._device_param_login_allow_qrcode_control /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 226;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL";
Debug.ShouldStop(2);
mainmenu.mostCurrent._sharecode._device_param_login_allow_facial_control /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 227;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL";
Debug.ShouldStop(4);
mainmenu.mostCurrent._sharecode._device_param_request_enddate_control /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ENDDATE_CONTROL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 228;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW";
Debug.ShouldStop(8);
mainmenu.mostCurrent._sharecode._device_param_request_enddate_inday_show /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 230;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOWNEWICON_ONALERT 		=";
Debug.ShouldStop(32);
mainmenu.mostCurrent._sharecode._device_request_shownewicon_onalert /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SHOWNEWICON_ONALERT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 231;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST";
Debug.ShouldStop(64);
mainmenu.mostCurrent._sharecode._device_param_object_allow_new_request /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 232;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL 		=";
Debug.ShouldStop(128);
mainmenu.mostCurrent._sharecode._device_param_object_allow_view_all /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 233;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSO";
Debug.ShouldStop(256);
mainmenu.mostCurrent._sharecode._device_param_object_allow_evidence_associate /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 234;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB";
Debug.ShouldStop(512);
mainmenu.mostCurrent._sharecode._device_param_object_allow_requests_tab /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 235;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUM";
Debug.ShouldStop(1024);
mainmenu.mostCurrent._sharecode._device_param_object_allow_relations_jump /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 236;BA.debugLine="ShareCode.DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE";
Debug.ShouldStop(2048);
mainmenu.mostCurrent._sharecode._device_request_update_server_onclose /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 237;BA.debugLine="ShareCode.DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT 		=";
Debug.ShouldStop(4096);
mainmenu.mostCurrent._sharecode._device_checklist_alldocs_in_object /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 238;BA.debugLine="ShareCode.DEVICE_PARAM_DEFAULT_DATE_PERIOD 			= U";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._sharecode._device_param_default_date_period /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DEFAULT_DATE_PERIOD"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 239;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER 			= U";
Debug.ShouldStop(16384);
mainmenu.mostCurrent._sharecode._device_request_show_date_divider /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SHOW_DATE_DIVIDER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 241;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE 		=";
Debug.ShouldStop(65536);
mainmenu.mostCurrent._sharecode._device_checklist_svrimgudp_onclose /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 242;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGE";
Debug.ShouldStop(131072);
mainmenu.mostCurrent._sharecode._device_checklist_svrimgudp_width_trigger /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 243;BA.debugLine="ShareCode.DEVICE_ASKTOUPDATE_ONLOGIN 				= Utils.";
Debug.ShouldStop(262144);
mainmenu.mostCurrent._sharecode._device_asktoupdate_onlogin /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_ASKTOUPDATE_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 244;BA.debugLine="ShareCode.DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY";
Debug.ShouldStop(524288);
mainmenu.mostCurrent._sharecode._device_checklist_include_public_gallery /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 245;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REQUESTS 				= Util";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._sharecode._device_param_access_requests /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_REQUESTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 246;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REPORTS 				= Utils";
Debug.ShouldStop(2097152);
mainmenu.mostCurrent._sharecode._device_param_access_reports /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_REPORTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 247;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_ALERTS 				= Utils.";
Debug.ShouldStop(4194304);
mainmenu.mostCurrent._sharecode._device_param_access_alerts /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_ALERTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 248;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_OBJECTS 				= Utils";
Debug.ShouldStop(8388608);
mainmenu.mostCurrent._sharecode._device_param_access_objects /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_OBJECTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 249;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_TASKS 				= Utils.i";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._sharecode._device_param_access_tasks /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_TASKS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 250;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_MYDATA 				= Utils.";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._sharecode._device_param_access_mydata /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_MYDATA"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 251;BA.debugLine="ShareCode.DEVICE_REQUEST_CUSTOMORDER 				= Utils.";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._sharecode._device_request_customorder /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_CUSTOMORDER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 253;BA.debugLine="ShareCode.DEVICE_CHECKLIST_STARTON_MYDATA 			= Ut";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._sharecode._device_checklist_starton_mydata /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_STARTON_MYDATA"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 254;BA.debugLine="ShareCode.DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP 		=";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._sharecode._device_checklist_mydata_docs_ontop /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 256;BA.debugLine="ShareCode.DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND";
Debug.ShouldStop(-2147483648);
mainmenu.mostCurrent._sharecode._device_checklist_objectmandatory_onend /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 257;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONE";
Debug.ShouldStop(1);
mainmenu.mostCurrent._sharecode._device_checklist_siganturemandatory_onend /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 258;BA.debugLine="ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE 		= U";
Debug.ShouldStop(2);
mainmenu.mostCurrent._sharecode._device_param_activate_printmodule /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACTIVATE_PRINTMODULE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 259;BA.debugLine="ShareCode.DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGI";
Debug.ShouldStop(4);
mainmenu.mostCurrent._sharecode._device_param_testconnected_print_onlogin /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 260;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOS";
Debug.ShouldStop(8);
mainmenu.mostCurrent._sharecode._device_checklist_autoreturn_after_fotoshot /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 261;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSA";
Debug.ShouldStop(16);
mainmenu.mostCurrent._sharecode._device_checklist_autoreturn_after_subsaction /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 262;BA.debugLine="ShareCode.DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS";
Debug.ShouldStop(32);
mainmenu.mostCurrent._sharecode._device_checklist_copy_asdetails_to_obs /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 263;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNA";
Debug.ShouldStop(64);
mainmenu.mostCurrent._sharecode._device_checklist_autoreturn_after_signature /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 265;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE = Uti";
Debug.ShouldStop(256);
mainmenu.mostCurrent._sharecode._device_param_inverted_foto_device /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_INVERTED_FOTO_DEVICE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 266;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE";
Debug.ShouldStop(512);
mainmenu.mostCurrent._sharecode._device_param_inverted_horiz_foto_device /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 268;BA.debugLine="ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = Uti";
Debug.ShouldStop(2048);
mainmenu.mostCurrent._sharecode._device_report_date_from_checklist /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REPORT_DATE_FROM_CHECKLIST"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 270;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_START_NEWWAY = Utils";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._sharecode._device_typerequest_start_newway /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_TYPEREQUEST_START_NEWWAY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 271;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY";
Debug.ShouldStop(16384);
mainmenu.mostCurrent._sharecode._device_typerequest_define_start_newway /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 273;BA.debugLine="ShareCode.DEVICE_EMAIL_OLD_MODEL = Utils.ifnullor";
Debug.ShouldStop(65536);
mainmenu.mostCurrent._sharecode._device_email_old_model /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_EMAIL_OLD_MODEL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 274;BA.debugLine="ShareCode.EmailOldModel = Utils.Int2Bool(ShareCod";
Debug.ShouldStop(131072);
mainmenu.mostCurrent._sharecode._emailoldmodel /*RemoteObject*/  = mainmenu.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._device_email_old_model /*RemoteObject*/ ));
 BA.debugLineNum = 275;BA.debugLine="ShareCode.DEVICE_SHOW_GLOBAL_SEARCH = Utils.ifnul";
Debug.ShouldStop(262144);
mainmenu.mostCurrent._sharecode._device_show_global_search /*RemoteObject*/  = BA.numberCast(int.class, mainmenu.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.NumberToString(mainmenu.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_SHOW_GLOBAL_SEARCH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 279;BA.debugLine="ShareCode.STS005 = Utils.Int2Bool(ShareCode.DEVIC";
Debug.ShouldStop(4194304);
mainmenu.mostCurrent._sharecode._sts005 /*RemoteObject*/  = mainmenu.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._device_request_hidecanceled /*RemoteObject*/ ));
 BA.debugLineNum = 282;BA.debugLine="ShareCode.DEVICE_DEF_FONT_SIZE = ShareCode.DEVICE";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/  = mainmenu.mostCurrent._sharecode._device_param_photo_fontsize /*RemoteObject*/ ;
 BA.debugLineNum = 283;BA.debugLine="ShareCode.DEVICE_DEF_QUALITY = ShareCode.DEVICE_P";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._sharecode._device_def_quality /*RemoteObject*/  = mainmenu.mostCurrent._sharecode._device_param_photo_quality /*RemoteObject*/ ;
 BA.debugLineNum = 284;BA.debugLine="ShareCode.DEVICE_DEF_IMG_FILETYPE = ShareCode.DEV";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/  = mainmenu.mostCurrent._sharecode._device_param_photo_filetype /*RemoteObject*/ ;
 BA.debugLineNum = 285;BA.debugLine="ShareCode.DEVICE_DEF_IMG_WIDTH = ShareCode.DEVICE";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/  = mainmenu.mostCurrent._sharecode._device_param_photo_width /*RemoteObject*/ ;
 BA.debugLineNum = 286;BA.debugLine="ShareCode.DEVICE_DEF_IMG_HEIGHT = ShareCode.DEVIC";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/  = mainmenu.mostCurrent._sharecode._device_param_photo_height /*RemoteObject*/ ;
 BA.debugLineNum = 288;BA.debugLine="If (Not(ShareCode.APP_DOMAIN.ToLowerCase = \"demo\"";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean(".",mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("demo")))))) && RemoteObject.solveBoolean(".",mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("brasfone")))))) && RemoteObject.solveBoolean(".",mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("grandative")))))))) { 
 BA.debugLineNum = 289;BA.debugLine="butCallActions.Visible = False";
Debug.ShouldStop(1);
mainmenu.mostCurrent._butcallactions.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 290;BA.debugLine="butCallActions.Enabled = False";
Debug.ShouldStop(2);
mainmenu.mostCurrent._butcallactions.runMethod(true,"setEnabled",mainmenu.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 296;BA.debugLine="Printer.Initialize(Me,\"Printer\",Encoding.Windows1";
Debug.ShouldStop(128);
mainmenu.mostCurrent._printer.runVoidMethod ("_initialize",mainmenu.mostCurrent.activityBA,(Object)(mainmenu.getObject()),(Object)(BA.ObjectToString("Printer")),(Object)(mainmenu.mostCurrent._encoding.getField(true,"_v5")));
 BA.debugLineNum = 300;BA.debugLine="StartService(BackgroundUpdateService)";
Debug.ShouldStop(2048);
mainmenu.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((mainmenu.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 301;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_KeyPress (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,340);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","activity_keypress", _keycode);}
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 340;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, mainmenu.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 342;BA.debugLine="Dim Result As Int";
Debug.ShouldStop(2097152);
_result = RemoteObject.createImmutable(0);Debug.locals.put("Result", _result);
 BA.debugLineNum = 343;BA.debugLine="Result = Msgbox2(ShareCode.ApplicationExit, Shar";
Debug.ShouldStop(4194304);
_result = mainmenu.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._applicationexit /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(mainmenu.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(mainmenu.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent.__c.getField(false,"Null"))),mainmenu.mostCurrent.activityBA);Debug.locals.put("Result", _result);
 BA.debugLineNum = 344;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, mainmenu.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 345;BA.debugLine="CallSubDelayed(Main, \"ActivityFinish\")";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mainmenu.processBA,(Object)((mainmenu.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("ActivityFinish")));
 BA.debugLineNum = 346;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._activity.runVoidMethod ("Finish");
 };
 };
 BA.debugLineNum = 349;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return mainmenu.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,336);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 336;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 337;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(65536);
mainmenu.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,325);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","activity_resume");}
 BA.debugLineNum = 325;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="LockPanel.Visible = False";
Debug.ShouldStop(32);
mainmenu.mostCurrent._lockpanel.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 327;BA.debugLine="mainLabelInfo.Text = \"\"";
Debug.ShouldStop(64);
mainmenu.mostCurrent._mainlabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 328;BA.debugLine="If (Starter.APP_FINE_LOCATION_ACCESS) Then";
Debug.ShouldStop(128);
if ((mainmenu.mostCurrent._starter._app_fine_location_access /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 329;BA.debugLine="If Not(LocationService.FusedLocationProvider1.Is";
Debug.ShouldStop(256);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent._locationservice._fusedlocationprovider1 /*RemoteObject*/ .runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 330;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(512);
mainmenu.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((mainmenu.mostCurrent._locationservice.getObject())));
 };
 };
 BA.debugLineNum = 333;BA.debugLine="UpdateServiceTimer.Initialize(\"UpdateServiceTimer";
Debug.ShouldStop(4096);
mainmenu.mostCurrent._updateservicetimer.runVoidMethod ("Initialize",mainmenu.processBA,(Object)(BA.ObjectToString("UpdateServiceTimer")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _aftercreateorpause(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("AfterCreateOrPause (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,352);
if (RapidSub.canDelegate("aftercreateorpause")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","aftercreateorpause", _firsttime);}
RemoteObject _thisbutton = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._composedbuttondefs");
RemoteObject _lbllistnomemenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbllistopcaomenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 352;BA.debugLine="Sub AfterCreateOrPause(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="Log($\"Starter.MakingLogin = ${Starter.MakingLogin";
Debug.ShouldStop(1);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","623855105",(RemoteObject.concat(RemoteObject.createImmutable("Starter.MakingLogin = "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent._starter._makinglogin /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 354;BA.debugLine="If (Starter.MakingLogin = True) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._starter._makinglogin /*RemoteObject*/ ,mainmenu.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 355;BA.debugLine="Starter.MakingLogin = False";
Debug.ShouldStop(4);
mainmenu.mostCurrent._starter._makinglogin /*RemoteObject*/  = mainmenu.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 356;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(8);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 359;BA.debugLine="LockPanel.Visible = False";
Debug.ShouldStop(64);
mainmenu.mostCurrent._lockpanel.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 360;BA.debugLine="ShareCode.MainLockPanel = LockPanel.Visible";
Debug.ShouldStop(128);
mainmenu.mostCurrent._sharecode._mainlockpanel /*RemoteObject*/  = mainmenu.mostCurrent._lockpanel.runMethod(true,"getVisible");
 };
 };
 BA.debugLineNum = 370;BA.debugLine="If Not(Requestauth) Then";
Debug.ShouldStop(131072);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu._requestauth)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 371;BA.debugLine="Consts.ColorMain = Starter.KeepColorMain";
Debug.ShouldStop(262144);
mainmenu.mostCurrent._consts._colormain /*RemoteObject*/  = mainmenu.mostCurrent._starter._keepcolormain /*RemoteObject*/ ;
 BA.debugLineNum = 372;BA.debugLine="Consts.ColorSub = Starter.KeepColorSub";
Debug.ShouldStop(524288);
mainmenu.mostCurrent._consts._colorsub /*RemoteObject*/  = mainmenu.mostCurrent._starter._keepcolorsub /*RemoteObject*/ ;
 BA.debugLineNum = 374;BA.debugLine="If Not(ShareCode.APP_ComboValues.IsInitialized)";
Debug.ShouldStop(2097152);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent._sharecode._app_combovalues /*RemoteObject*/ .runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
mainmenu.mostCurrent._sharecode._app_combovalues /*RemoteObject*/ .runVoidMethod ("Initialize");};
 BA.debugLineNum = 375;BA.debugLine="If Not(BadgerItems.IsInitialized) Then BadgerIte";
Debug.ShouldStop(4194304);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent._badgeritems.runMethod(true,"IsInitialized" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
mainmenu.mostCurrent._badgeritems.runClassMethod (xevolution.vrcg.devdemov2400.badger.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);};
 BA.debugLineNum = 377;BA.debugLine="UpdateMainLayout";
Debug.ShouldStop(16777216);
_updatemainlayout();
 BA.debugLineNum = 378;BA.debugLine="WaitToConfirm = False";
Debug.ShouldStop(33554432);
mainmenu._waittoconfirm = mainmenu.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 379;BA.debugLine="DBStructures.getCurrentConfigValues";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._dbstructures.runVoidMethod ("_getcurrentconfigvalues" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 380;BA.debugLine="Started = True";
Debug.ShouldStop(134217728);
mainmenu._started = mainmenu.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 381;BA.debugLine="Starter.FirstInstall = False";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._starter._firstinstall /*RemoteObject*/  = mainmenu.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 384;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
Debug.ShouldStop(-2147483648);
_thisbutton = mainmenu.mostCurrent._starter._cpbuttons /*RemoteObject*/ ;Debug.locals.put("ThisButton", _thisbutton);Debug.locals.put("ThisButton", _thisbutton);
 BA.debugLineNum = 386;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonRequests, Ch";
Debug.ShouldStop(2);
mainmenu.mostCurrent._utils.runVoidMethod ("_makecomposedbuttonext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._cpbuttonrequests),(Object)(BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf046))))),(Object)(mainmenu.mostCurrent._sharecode._mainoption_request /*RemoteObject*/ ),(Object)(_thisbutton));
 BA.debugLineNum = 388;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
Debug.ShouldStop(8);
_thisbutton = mainmenu.mostCurrent._starter._cpbuttons /*RemoteObject*/ ;Debug.locals.put("ThisButton", _thisbutton);Debug.locals.put("ThisButton", _thisbutton);
 BA.debugLineNum = 390;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonAlerts, Chr(";
Debug.ShouldStop(32);
mainmenu.mostCurrent._utils.runVoidMethod ("_makecomposedbuttonext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._cpbuttonalerts),(Object)(BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf16c))))),(Object)(mainmenu.mostCurrent._sharecode._mainoption_alerts /*RemoteObject*/ ),(Object)(_thisbutton));
 BA.debugLineNum = 392;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
Debug.ShouldStop(128);
_thisbutton = mainmenu.mostCurrent._starter._cpbuttons /*RemoteObject*/ ;Debug.locals.put("ThisButton", _thisbutton);Debug.locals.put("ThisButton", _thisbutton);
 BA.debugLineNum = 394;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonKPI, Chr(0xF";
Debug.ShouldStop(512);
mainmenu.mostCurrent._utils.runVoidMethod ("_makecomposedbuttonext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._cpbuttonkpi),(Object)(BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf080))))),(Object)(mainmenu.mostCurrent._sharecode._mainoption_kpi /*RemoteObject*/ ),(Object)(_thisbutton));
 BA.debugLineNum = 396;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
Debug.ShouldStop(2048);
_thisbutton = mainmenu.mostCurrent._starter._cpbuttons /*RemoteObject*/ ;Debug.locals.put("ThisButton", _thisbutton);Debug.locals.put("ThisButton", _thisbutton);
 BA.debugLineNum = 398;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonTasks, Chr(0";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._utils.runVoidMethod ("_makecomposedbuttonext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._cpbuttontasks),(Object)(BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf0b1))))),(Object)(mainmenu.mostCurrent._sharecode._mainoption_tasks /*RemoteObject*/ ),(Object)(_thisbutton));
 BA.debugLineNum = 400;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
Debug.ShouldStop(32768);
_thisbutton = mainmenu.mostCurrent._starter._cpbuttons /*RemoteObject*/ ;Debug.locals.put("ThisButton", _thisbutton);Debug.locals.put("ThisButton", _thisbutton);
 BA.debugLineNum = 402;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(131072);
if ((mainmenu.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 403;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonObjects, Ch";
Debug.ShouldStop(262144);
mainmenu.mostCurrent._utils.runVoidMethod ("_makecomposedbuttonext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._cpbuttonobjects),(Object)(BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1b3))))),(Object)(mainmenu.mostCurrent._sharecode._mainoption_planning /*RemoteObject*/ ),(Object)(_thisbutton));
 }else {
 BA.debugLineNum = 405;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonObjects, Ch";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._utils.runVoidMethod ("_makecomposedbuttonext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._cpbuttonobjects),(Object)(BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1b3))))),(Object)(mainmenu.mostCurrent._sharecode._mainoption_objects /*RemoteObject*/ ),(Object)(_thisbutton));
 };
 BA.debugLineNum = 408;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
Debug.ShouldStop(8388608);
_thisbutton = mainmenu.mostCurrent._starter._cpbuttons /*RemoteObject*/ ;Debug.locals.put("ThisButton", _thisbutton);Debug.locals.put("ThisButton", _thisbutton);
 BA.debugLineNum = 410;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonUser, Chr(0x";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._utils.runVoidMethod ("_makecomposedbuttonext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._cpbuttonuser),(Object)(BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf2bc))))),(Object)(mainmenu.mostCurrent._sharecode._mainoption_user /*RemoteObject*/ ),(Object)(_thisbutton));
 BA.debugLineNum = 412;BA.debugLine="MainPopMenu.Initialize(Activity, Me, mainButtonM";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_initialize",mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._activity),(Object)(mainmenu.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), mainmenu.mostCurrent._mainbuttonmenu.getObject()),(Object)(mainmenu.mostCurrent._consts._colormain /*RemoteObject*/ ),(Object)(mainmenu.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(mainmenu.mostCurrent._consts._colorsub /*RemoteObject*/ ),(Object)(mainmenu.mostCurrent.__c.getField(true,"True")),(Object)(mainmenu.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 414;BA.debugLine="Dim LblListNomeMenu As Label";
Debug.ShouldStop(536870912);
_lbllistnomemenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("LblListNomeMenu", _lbllistnomemenu);
 BA.debugLineNum = 415;BA.debugLine="Dim LblListOpcaoMenu As Label";
Debug.ShouldStop(1073741824);
_lbllistopcaomenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("LblListOpcaoMenu", _lbllistopcaomenu);
 BA.debugLineNum = 416;BA.debugLine="MainPopMenuList.Color = Consts.ColorMain";
Debug.ShouldStop(-2147483648);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("setColor",mainmenu.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 417;BA.debugLine="MainPopMenuList.Height = Activity.Height / 2 + 5";
Debug.ShouldStop(1);
mainmenu.mostCurrent._mainpopmenulist.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {mainmenu.mostCurrent._activity.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(50)}, "/+",1, 0)));
 BA.debugLineNum = 418;BA.debugLine="MainPopMenuList.SingleLineLayout.Label.TextSize";
Debug.ShouldStop(2);
mainmenu.mostCurrent._mainpopmenulist.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 419;BA.debugLine="MainPopMenuList.SingleLineLayout.Label.TextColor";
Debug.ShouldStop(4);
mainmenu.mostCurrent._mainpopmenulist.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",mainmenu.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 421;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
Debug.ShouldStop(16);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenusync /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainPopMenuSync")));
 BA.debugLineNum = 422;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
Debug.ShouldStop(32);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenusync /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainPopMenuSync"))));
 BA.debugLineNum = 424;BA.debugLine="If (ShareCode.SESS_UserProfile = \"PRF_ADMIN\") Or";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._sess_userprofile /*RemoteObject*/ ,RemoteObject.createImmutable("PRF_ADMIN"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._sess_userprofile /*RemoteObject*/ ,RemoteObject.createImmutable("PRF_SUPER")))))) { 
 BA.debugLineNum = 425;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Mai";
Debug.ShouldStop(256);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_maindatavalidation /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainDataValidation")));
 BA.debugLineNum = 426;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Mai";
Debug.ShouldStop(512);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenucompany /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainPopMenuCompany")));
 BA.debugLineNum = 427;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPM";
Debug.ShouldStop(1024);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_maindatavalidation /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainDataValidation"))));
 BA.debugLineNum = 428;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPM";
Debug.ShouldStop(2048);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenucompany /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainPopMenuCompany"))));
 };
 BA.debugLineNum = 431;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"scms\")";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("scms")))) { 
 BA.debugLineNum = 432;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Mai";
Debug.ShouldStop(32768);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenupushrequest /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainPopMenuPushRequest")));
 BA.debugLineNum = 433;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPM";
Debug.ShouldStop(65536);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenupushrequest /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainPopMenuPushRequest"))));
 };
 BA.debugLineNum = 440;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
Debug.ShouldStop(8388608);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenuloginchange /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainPopMenuLoginChange")));
 BA.debugLineNum = 441;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenuloginchange /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainPopMenuLoginChange"))));
 BA.debugLineNum = 443;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_maindeviceinfopopmenu /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainDeviceInfoPopMenu")));
 BA.debugLineNum = 444;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_maindeviceinfopopmenu /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainDeviceInfoPopMenu"))));
 BA.debugLineNum = 446;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_maininstallapk /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainUpdateAPK")));
 BA.debugLineNum = 447;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_maininstallapk /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainUpdateAPK"))));
 BA.debugLineNum = 452;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACTIVA";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(".",(mainmenu.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._device_param_activate_printmodule /*RemoteObject*/ )))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("demo"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("erguelop"))))) || RemoteObject.solveBoolean(".",(mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("transgrua"))))))))) { 
 BA.debugLineNum = 454;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Mai";
Debug.ShouldStop(32);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_maindeviceprint /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainDevicePrint")));
 BA.debugLineNum = 455;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPM";
Debug.ShouldStop(64);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_maindeviceprint /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainDevicePrint"))));
 };
 BA.debugLineNum = 458;BA.debugLine="If ((ShareCode.APP_DOMAIN.ToLowerCase = \"devdemo";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("devdemo"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("demo"))))))) { 
 BA.debugLineNum = 459;BA.debugLine="MainPopMenu.AddMenuItem(\"Codigo Barras\", \"BCQR\"";
Debug.ShouldStop(1024);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(BA.ObjectToString("Codigo Barras")),(Object)(RemoteObject.createImmutable("BCQR")));
 };
 BA.debugLineNum = 462;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_addmenuitem",(Object)(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenuexit /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MainPopMenuExit")));
 BA.debugLineNum = 463;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
Debug.ShouldStop(16384);
mainmenu.mostCurrent._mainpopmenulist.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._popupmenu_mainpopmenuexit /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("MainPopMenuExit"))));
 BA.debugLineNum = 464;BA.debugLine="AppStart";
Debug.ShouldStop(32768);
_appstart();
 };
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart() throws Exception{
try {
		Debug.PushSubsStack("AppStart (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,485);
if (RapidSub.canDelegate("appstart")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","appstart");}
RemoteObject _mlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _ffile = RemoteObject.createImmutable("");
 BA.debugLineNum = 485;BA.debugLine="Sub AppStart";
Debug.ShouldStop(16);
 BA.debugLineNum = 486;BA.debugLine="If (ShareCode.DEVICE_ORIENTATION = 1) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 487;BA.debugLine="ShareCode.DEVICE_DEF_IMG_WIDTH = 615";
Debug.ShouldStop(64);
mainmenu.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/  = BA.numberCast(int.class, 615);
 BA.debugLineNum = 488;BA.debugLine="ShareCode.DEVICE_DEF_IMG_HEIGHT  = 820";
Debug.ShouldStop(128);
mainmenu.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/  = BA.numberCast(int.class, 820);
 };
 BA.debugLineNum = 490;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
Debug.ShouldStop(512);
if (mainmenu.mostCurrent._sharecode._app_working_local /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 491;BA.debugLine="If (ShareCode.APPL_CONFIRMED = 0) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 492;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoConne";
Debug.ShouldStop(2048);
mainmenu.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._authorizationdata_noconnection_validate /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),mainmenu.processBA);
 BA.debugLineNum = 493;BA.debugLine="CallSubDelayed(Main, \"ActivityFinish\")";
Debug.ShouldStop(4096);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mainmenu.processBA,(Object)((mainmenu.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("ActivityFinish")));
 BA.debugLineNum = 494;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._activity.runVoidMethod ("Finish");
 };
 };
 BA.debugLineNum = 498;BA.debugLine="mainBasePanel.Visible = True";
Debug.ShouldStop(131072);
mainmenu.mostCurrent._mainbasepanel.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 499;BA.debugLine="LabelDateTime.Text =  $\"${Main.AppBuildVersionDat";
Debug.ShouldStop(262144);
mainmenu.mostCurrent._labeldatetime.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent._main._appbuildversiondate /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 500;BA.debugLine="UpdateMainLayout";
Debug.ShouldStop(524288);
_updatemainlayout();
 BA.debugLineNum = 502;BA.debugLine="BadgeCheckUpdate";
Debug.ShouldStop(2097152);
_badgecheckupdate();
 BA.debugLineNum = 503;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(4194304);
_windowstatusupdate();
 BA.debugLineNum = 505;BA.debugLine="Dim mList As List = File.ListFiles(Starter.Intern";
Debug.ShouldStop(16777216);
_mlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_mlist = mainmenu.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(mainmenu.mostCurrent._starter._internalfolder /*RemoteObject*/ ));Debug.locals.put("mList", _mlist);Debug.locals.put("mList", _mlist);
 BA.debugLineNum = 506;BA.debugLine="For n = 0 To mList.Size-1";
Debug.ShouldStop(33554432);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_mlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step18 > 0 && _n <= limit18) || (step18 < 0 && _n >= limit18) ;_n = ((int)(0 + _n + step18))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 507;BA.debugLine="Dim ffile As String =  mList.Get(n)";
Debug.ShouldStop(67108864);
_ffile = BA.ObjectToString(_mlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("ffile", _ffile);Debug.locals.put("ffile", _ffile);
 BA.debugLineNum = 508;BA.debugLine="If (ffile.EndsWith(\"html\")) Then";
Debug.ShouldStop(134217728);
if ((_ffile.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("html")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 509;BA.debugLine="Log(\"Ficheiro: \" & ffile & \": \" & File.Size(Sta";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","623986200",RemoteObject.concat(RemoteObject.createImmutable("Ficheiro: "),_ffile,RemoteObject.createImmutable(": "),mainmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"Size",(Object)(mainmenu.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ffile))),0);
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badgecheckupdate() throws Exception{
try {
		Debug.PushSubsStack("BadgeCheckUpdate (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,533);
if (RapidSub.canDelegate("badgecheckupdate")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","badgecheckupdate");}
RemoteObject _ori = RemoteObject.createImmutable(0);
RemoteObject _userbadge = RemoteObject.createImmutable(0);
RemoteObject _alertbadge = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
 BA.debugLineNum = 533;BA.debugLine="Public Sub BadgeCheckUpdate";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 534;BA.debugLine="Dim Ori As Int = 0";
Debug.ShouldStop(2097152);
_ori = BA.numberCast(int.class, 0);Debug.locals.put("Ori", _ori);Debug.locals.put("Ori", _ori);
 BA.debugLineNum = 535;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(4194304);
if ((mainmenu.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 536;BA.debugLine="Ori = 1";
Debug.ShouldStop(8388608);
_ori = BA.numberCast(int.class, 1);Debug.locals.put("Ori", _ori);
 };
 BA.debugLineNum = 538;BA.debugLine="If Not(BadgerItems.IsInitialized) Then";
Debug.ShouldStop(33554432);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent._badgeritems.runMethod(true,"IsInitialized" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 539;BA.debugLine="BadgerItems.Initialize";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._badgeritems.runClassMethod (xevolution.vrcg.devdemov2400.badger.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 };
 BA.debugLineNum = 544;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 545;BA.debugLine="Dim userBadge As Int = 0";
Debug.ShouldStop(1);
_userbadge = BA.numberCast(int.class, 0);Debug.locals.put("userBadge", _userbadge);Debug.locals.put("userBadge", _userbadge);
 BA.debugLineNum = 546;BA.debugLine="If (ShareCode.UWDUKEY_DETAILS = 0) Then userBadg";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._uwdukey_details /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
_userbadge = RemoteObject.solve(new RemoteObject[] {_userbadge,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("userBadge", _userbadge);};
 BA.debugLineNum = 547;BA.debugLine="If (ShareCode.UWDUKEY_PRODUCTS = 0) Then userBad";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._uwdukey_products /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
_userbadge = RemoteObject.solve(new RemoteObject[] {_userbadge,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("userBadge", _userbadge);};
 BA.debugLineNum = 548;BA.debugLine="If (CPButtonUser.IsInitialized) Then";
Debug.ShouldStop(8);
if ((mainmenu.mostCurrent._cpbuttonuser.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 549;BA.debugLine="If (userBadge >= 1) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("g",_userbadge,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 550;BA.debugLine="BadgerItems.SetBadge(CPButtonUser, userBadge,";
Debug.ShouldStop(32);
mainmenu.mostCurrent._badgeritems.runClassMethod (xevolution.vrcg.devdemov2400.badger.class, "_setbadge" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mainmenu.mostCurrent._cpbuttonuser.getObject()),(Object)(_userbadge),(Object)(_ori));
 }else {
 BA.debugLineNum = 555;BA.debugLine="BadgerItems.SetBadge(CPButtonUser, 0, Ori)";
Debug.ShouldStop(1024);
mainmenu.mostCurrent._badgeritems.runClassMethod (xevolution.vrcg.devdemov2400.badger.class, "_setbadge" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mainmenu.mostCurrent._cpbuttonuser.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(_ori));
 };
 BA.debugLineNum = 560;BA.debugLine="BadgerItems.SetBadge(CPButtonUser, 0, Ori)";
Debug.ShouldStop(32768);
mainmenu.mostCurrent._badgeritems.runClassMethod (xevolution.vrcg.devdemov2400.badger.class, "_setbadge" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mainmenu.mostCurrent._cpbuttonuser.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(_ori));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e21.toString()); BA.debugLineNum = 563;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","624117278",BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 570;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 571;BA.debugLine="Dim alertBadge As Int = 0";
Debug.ShouldStop(67108864);
_alertbadge = BA.numberCast(int.class, 0);Debug.locals.put("alertBadge", _alertbadge);Debug.locals.put("alertBadge", _alertbadge);
 BA.debugLineNum = 572;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(134217728);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 574;BA.debugLine="Dim sSQL As String = $\"select count(0) as total";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select count(0) as total from dta_alerts where alert_visible=1 \n"),RemoteObject.createImmutable("								and user_tagcode='"),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("								and active=1 and date_alert>='"),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent._utils.runMethod(true,"_getlastweekdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA)))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 577;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(1);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mainmenu.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 578;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 579;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(4);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 580;BA.debugLine="alertBadge = Record.GetInt(\"total\")";
Debug.ShouldStop(8);
_alertbadge = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("total")));Debug.locals.put("alertBadge", _alertbadge);
 };
 BA.debugLineNum = 582;BA.debugLine="Record.Close";
Debug.ShouldStop(32);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 583;BA.debugLine="If (CPButtonAlerts.IsInitialized) Then";
Debug.ShouldStop(64);
if ((mainmenu.mostCurrent._cpbuttonalerts.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 584;BA.debugLine="If (alertBadge >= 1) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("g",_alertbadge,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 585;BA.debugLine="BadgerItems.SetBadge(CPButtonAlerts, alertBadg";
Debug.ShouldStop(256);
mainmenu.mostCurrent._badgeritems.runClassMethod (xevolution.vrcg.devdemov2400.badger.class, "_setbadge" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mainmenu.mostCurrent._cpbuttonalerts.getObject()),(Object)(_alertbadge),(Object)(_ori));
 }else {
 BA.debugLineNum = 588;BA.debugLine="BadgerItems.SetBadge(CPButtonAlerts, 0, Ori)";
Debug.ShouldStop(2048);
mainmenu.mostCurrent._badgeritems.runClassMethod (xevolution.vrcg.devdemov2400.badger.class, "_setbadge" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mainmenu.mostCurrent._cpbuttonalerts.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(_ori));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e41) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e41.toString()); BA.debugLineNum = 592;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","624117307",BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 594;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bcqr_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("BCQR_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2129);
if (RapidSub.canDelegate("bcqr_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","bcqr_click", _menuname);}
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 2129;BA.debugLine="Sub BCQR_Click(MenuName As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2130;BA.debugLine="ShareCode.SingleScan = False";
Debug.ShouldStop(131072);
mainmenu.mostCurrent._sharecode._singlescan /*RemoteObject*/  = mainmenu.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2131;BA.debugLine="CallSubDelayed2(BarcodeScanner,\"StarScanningMulti";
Debug.ShouldStop(262144);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",mainmenu.processBA,(Object)((mainmenu.mostCurrent._barcodescanner.getObject())),(Object)(BA.ObjectToString("StarScanningMulti")),(Object)((RemoteObject.createImmutable("MainMenu"))));
 BA.debugLineNum = 2132;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butactionsearch_click() throws Exception{
try {
		Debug.PushSubsStack("butActionSearch_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3332);
if (RapidSub.canDelegate("butactionsearch_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butactionsearch_click");}
RemoteObject _bbut = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 3332;BA.debugLine="Sub butActionSearch_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 3334;BA.debugLine="Dim bbut As Button = Sender";
Debug.ShouldStop(32);
_bbut = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_bbut = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), mainmenu.mostCurrent.__c.runMethod(false,"Sender",mainmenu.mostCurrent.activityBA));Debug.locals.put("bbut", _bbut);
 BA.debugLineNum = 3335;BA.debugLine="If Utils.NNE(bbut.Tag) Then";
Debug.ShouldStop(64);
if (mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString(_bbut.runMethod(false,"getTag")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3336;BA.debugLine="Dim lst As List = Regex.Split(\"\\|\", bbut.tag )";
Debug.ShouldStop(128);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = mainmenu.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(mainmenu.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_bbut.runMethod(false,"getTag"))))));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 3337;BA.debugLine="If (lst.Size > 1) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 3338;BA.debugLine="If (lst.Get(0)=\"1\") Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),(RemoteObject.createImmutable("1"))))) { 
 BA.debugLineNum = 3340;BA.debugLine="Log(lst.Get(1))";
Debug.ShouldStop(2048);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","629687816",BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))),0);
 }else 
{ BA.debugLineNum = 3341;BA.debugLine="else if (lst.Get(0)=\"2\") Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),(RemoteObject.createImmutable("2"))))) { 
 BA.debugLineNum = 3343;BA.debugLine="Log(lst.Get(1))";
Debug.ShouldStop(16384);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","629687819",BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))),0);
 }else 
{ BA.debugLineNum = 3344;BA.debugLine="else if (lst.Get(0)=\"3\") Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),(RemoteObject.createImmutable("3"))))) { 
 BA.debugLineNum = 3346;BA.debugLine="Log(lst.Get(1))";
Debug.ShouldStop(131072);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","629687822",BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))),0);
 }}}
;
 };
 };
 BA.debugLineNum = 3350;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _butcallactions_bf() throws Exception{
try {
		Debug.PushSubsStack("butCallActions_BF (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1203);
if (RapidSub.canDelegate("butcallactions_bf")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallactions_bf"); return;}
ResumableSub_butCallActions_BF rsub = new ResumableSub_butCallActions_BF(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butCallActions_BF extends BA.ResumableSub {
public ResumableSub_butCallActions_BF(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newrequesttype = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _newrequest = RemoteObject.createImmutable("");
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _reqcounter = RemoteObject.createImmutable(0);
RemoteObject _incolitems = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _tasktype = RemoteObject.createImmutable(0);
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _actionkey = RemoteObject.createImmutable("");
RemoteObject _task = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _sdate = RemoteObject.createImmutable("");
RemoteObject _stime = RemoteObject.createImmutable("");
RemoteObject _close_type = RemoteObject.createImmutable(0);
RemoteObject _result_type = RemoteObject.createImmutable(0);
RemoteObject _result_values = RemoteObject.createImmutable("");
RemoteObject _clainfo = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requesttaskinfo");
RemoteObject _cla = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestcla");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butCallActions_BF (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1203);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1204;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(524288);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1206;BA.debugLine="Dim tagcode As String = \"TSKS_20190911_135559\"";
Debug.ShouldStop(2097152);
_tagcode = BA.ObjectToString("TSKS_20190911_135559");Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1207;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*RemoteObject*/ )));
 BA.debugLineNum = 1208;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//try
this.state = 32;
this.catchState = 31;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 31;
 BA.debugLineNum = 1209;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(16777216);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 1210;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(33554432);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 1211;BA.debugLine="Dim newRequestType As String = \"\"";
Debug.ShouldStop(67108864);
_newrequesttype = BA.ObjectToString("");Debug.locals.put("newRequestType", _newrequesttype);Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 1212;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode,";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct tagcode, title\n"),RemoteObject.createImmutable("				from dta_typerequests \n"),RemoteObject.createImmutable("				where tagcode in (select distinct typerequest_tagcode \n"),RemoteObject.createImmutable("					from dta_typerequests_tasks where task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("') limit 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1217;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(1);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1218;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(2);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1219;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1220;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(8);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1221;BA.debugLine="newRequestType = Record.GetString(\"tagcode\")";
Debug.ShouldStop(16);
_newrequesttype = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("newRequestType", _newrequesttype);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1223;BA.debugLine="Record.Close";
Debug.ShouldStop(64);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1224;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagc";
Debug.ShouldStop(128);
_newrequest = parent.mostCurrent._utils.runMethod(true,"_makerequesttagcode" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newRequest", _newrequest);Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 1225;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(256);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 1226;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(512);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 1228;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(2048);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 1229;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 1230;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 1231;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("route_tagcode"))),(Object)((RemoteObject.createImmutable("ROUTE__NONE__"))));
 BA.debugLineNum = 1232;BA.debugLine="newExecution.Put(\"is_child\", 0)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_child"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1233;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("prerequest"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1234;BA.debugLine="newExecution.Put(\"status_id\", 2)";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1235;BA.debugLine="newExecution.Put(\"state_id\", 4)";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state_id"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 1236;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_date"))),(Object)((_newdate)));
 BA.debugLineNum = 1237;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_time"))),(Object)((_newtime)));
 BA.debugLineNum = 1238;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execdate_type"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1239;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dayweekmonth"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1240;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 1241;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 1242;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 1243;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNA";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin_tagcode"))),(Object)((RemoteObject.createImmutable("TORI_INTERNAL"))));
 BA.debugLineNum = 1244;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"OBJECT_20190";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_tagcode"))),(Object)((RemoteObject.createImmutable("OBJECT_20190911_122437"))));
 BA.debugLineNum = 1245;BA.debugLine="newExecution.Put(\"object_tagcode\", \"OBJECT_20190";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("OBJECT_20190911_122437"))));
 BA.debugLineNum = 1246;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("technical_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 1247;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("team_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1248;BA.debugLine="newExecution.Put(\"local_tagcode\", \"ADRSS_2019091";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("local_tagcode"))),(Object)((RemoteObject.createImmutable("ADRSS_20190911_122437"))));
 BA.debugLineNum = 1249;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newReque";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("typerequest_tagcode"))),(Object)((_newrequesttype)));
 BA.debugLineNum = 1250;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SE";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vehicle_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_vehicle_object /*RemoteObject*/ )));
 BA.debugLineNum = 1251;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("confirmed"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1252;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1253;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(16);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 1254;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(32);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 1255;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(64);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 1256;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
Debug.ShouldStop(128);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 1258;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1261;BA.debugLine="Dim ReqCounter As Int = DBStructures.GetCountOfE";
Debug.ShouldStop(4096);
_reqcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getcountofevc" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(" and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")))));Debug.locals.put("ReqCounter", _reqcounter);Debug.locals.put("ReqCounter", _reqcounter);
 BA.debugLineNum = 1263;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(16384);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 1264;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 1265;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 1266;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode)";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 1267;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1268;BA.debugLine="newExecution.Put(\"position\", 0)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1269;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1270;BA.debugLine="newExecution.Put(\"status_id\", 2)";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1271;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1272;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1273;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1274;BA.debugLine="newExecution.Put(\"object_tagcode\", \"OBJECT_20190";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("OBJECT_20190911_122437"))));
 BA.debugLineNum = 1275;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 1276;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 1277;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 1278;BA.debugLine="newExecution.Put(\"repeatcounter\", ReqCounter)";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_reqcounter)));
 BA.debugLineNum = 1279;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1280;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(-2147483648);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 1281;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(1);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 1282;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(2);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 1283;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
Debug.ShouldStop(4);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 1285;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1312;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(-2147483648);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"),RemoteObject.createImmutable("				select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"),RemoteObject.createImmutable("				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("				x.execute_value, x.execute_format_title,x.confirmed, x.changed_value, x.repeatcounter\n"),RemoteObject.createImmutable("				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"),RemoteObject.createImmutable("				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, \n"),RemoteObject.createImmutable("				'' as execute_value, \n"),RemoteObject.createImmutable("				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("				0 as confirmed, '' as changed_value, a.repeatcounter\n"),RemoteObject.createImmutable("				from dta_requests_relations as a\n"),RemoteObject.createImmutable("				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("				where a.type_relation=0 and a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and a.relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and a.repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				) as x\n"),RemoteObject.createImmutable("				order by  x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1329;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641662",_ssql,0);
 BA.debugLineNum = 1330;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL, n";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions_DEMO")),(Object)(_ssql),(Object)(_newrequest));
 BA.debugLineNum = 1333;BA.debugLine="UploadNewRequest2Server(newRequest, newRequestIt";
Debug.ShouldStop(1048576);
_uploadnewrequest2server(_newrequest,_newrequestitem,RemoteObject.createImmutable("0"));
 BA.debugLineNum = 1334;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "butcallactions_bf"),BA.numberCast(int.class, 1000));
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 1336;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETREQ";
Debug.ShouldStop(8388608);
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*RemoteObject*/ ;Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1337;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newReq";
Debug.ShouldStop(16777216);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" and z.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and z.repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqcounter))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1338;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641671",_ssql,0);
 BA.debugLineNum = 1339;BA.debugLine="Log(newRequest)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641672",_newrequest,0);
 BA.debugLineNum = 1340;BA.debugLine="Private incolitems As Cursor";
Debug.ShouldStop(134217728);
_incolitems = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("incolitems", _incolitems);
 BA.debugLineNum = 1341;BA.debugLine="incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(268435456);
_incolitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1342;BA.debugLine="If (incolitems.RowCount >= 1) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 8:
//if
this.state = 29;
if ((RemoteObject.solveBoolean("g",_incolitems.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1343;BA.debugLine="incolitems.Position = 0";
Debug.ShouldStop(1073741824);
_incolitems.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1345;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
Debug.ShouldStop(1);
_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 1346;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\")";
Debug.ShouldStop(2);
_tasktype = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type")));Debug.locals.put("tasktype", _tasktype);Debug.locals.put("tasktype", _tasktype);
 BA.debugLineNum = 1347;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"statu";
Debug.ShouldStop(4);
_status_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 1348;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"t";
Debug.ShouldStop(8);
_tagcode = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1349;BA.debugLine="Dim actionkey As String = incolitems.GetString(";
Debug.ShouldStop(16);
_actionkey = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("action_tagcode")));Debug.locals.put("actionkey", _actionkey);Debug.locals.put("actionkey", _actionkey);
 BA.debugLineNum = 1350;BA.debugLine="Dim task As String = incolitems.GetString(\"task";
Debug.ShouldStop(32);
_task = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")));Debug.locals.put("task", _task);Debug.locals.put("task", _task);
 BA.debugLineNum = 1351;BA.debugLine="Dim name As String = incolitems.GetString(\"name";
Debug.ShouldStop(64);
_name = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1354;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDate";
Debug.ShouldStop(512);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 1355;BA.debugLine="Private sACLALatitude As String = Utils.IfNullO";
Debug.ShouldStop(1024);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1356;BA.debugLine="Private sACLALongitude As String = Utils.IfNull";
Debug.ShouldStop(2048);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1358;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(8192);
_sdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("sDate", _sdate);Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 1359;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(16384);
_stime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("sTime", _stime);Debug.locals.put("sTime", _stime);
 BA.debugLineNum = 1361;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"clos";
Debug.ShouldStop(65536);
_close_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("close_type")));Debug.locals.put("close_type", _close_type);Debug.locals.put("close_type", _close_type);
 BA.debugLineNum = 1362;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"res";
Debug.ShouldStop(131072);
_result_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("result_type")));Debug.locals.put("result_type", _result_type);Debug.locals.put("result_type", _result_type);
 BA.debugLineNum = 1363;BA.debugLine="Dim result_values As String = incolitems.GetStr";
Debug.ShouldStop(262144);
_result_values = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("result_values")));Debug.locals.put("result_values", _result_values);Debug.locals.put("result_values", _result_values);
 BA.debugLineNum = 1365;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeRequ";
Debug.ShouldStop(1048576);
_clainfo = parent.mostCurrent._types.runMethod(false,"_makerequesttaskinfo" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 2)),(Object)(_close_type),(Object)(_result_type),(Object)(_result_values),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));Debug.locals.put("CLAInfo", _clainfo);Debug.locals.put("CLAInfo", _clainfo);
 BA.debugLineNum = 1366;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(ta";
Debug.ShouldStop(2097152);
_cla = parent.mostCurrent._types.runMethod(false,"_makerequestcla" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_actionkey),(Object)(_task),(Object)(_reqcounter),(Object)(_tasktype),(Object)(parent.mostCurrent._types.runMethod(false,"_makeinterv" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_id),(Object)(_tagcode),(Object)(_status_id),(Object)(parent.mostCurrent._utils.runMethod(true,"_colorint" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_status_id))))),(Object)(_clainfo),(Object)(parent.mostCurrent._types.runMethod(false,"_makeothercla" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("CLA", _cla);Debug.locals.put("CLA", _cla);
 BA.debugLineNum = 1370;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("' where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1371;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL,";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions_DEMO")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1373;BA.debugLine="Log(\"Grava Status na BD local Request\")";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641706",RemoteObject.createImmutable("Grava Status na BD local Request"),0);
 BA.debugLineNum = 1374;BA.debugLine="Dim params As Map";
Debug.ShouldStop(536870912);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1375;BA.debugLine="params.Initialize";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1376;BA.debugLine="params.Clear";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1377;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1378;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 1379;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1380;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1381;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1382;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 1383;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 1384;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1385;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1386;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1387;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1388;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1389;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1390;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1391;BA.debugLine="Try";
Debug.ShouldStop(16384);
if (true) break;

case 11:
//try
this.state = 16;
this.catchState = 15;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 16;
this.catchState = 15;
 BA.debugLineNum = 1392;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1393;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 31;
 BA.debugLineNum = 1395;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641728",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1396;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1397;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1398;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 31;
;
 BA.debugLineNum = 1400;BA.debugLine="CLA.Info.Map1 = params";
Debug.ShouldStop(8388608);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map1" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 1402;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rela";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'  \n"),RemoteObject.createImmutable("						where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("' and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqcounter))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1404;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL,";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions_DEMO")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1406;BA.debugLine="Log(\"Grava Status na BD local Request-Relation\"";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641739",RemoteObject.createImmutable("Grava Status na BD local Request-Relation"),0);
 BA.debugLineNum = 1408;BA.debugLine="Dim params As Map";
Debug.ShouldStop(-2147483648);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1409;BA.debugLine="params.Initialize";
Debug.ShouldStop(1);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1410;BA.debugLine="params.Clear";
Debug.ShouldStop(2);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1411;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1412;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 1413;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_actionkey)));
 BA.debugLineNum = 1414;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1415;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1416;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1417;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 1418;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 1419;BA.debugLine="params.Put(\"ACLAReqCounter\", ReqCounter)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_reqcounter)));
 BA.debugLineNum = 1420;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1421;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1422;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1423;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1424;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1425;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1426;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1427;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 17:
//try
this.state = 22;
this.catchState = 21;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 22;
this.catchState = 21;
 BA.debugLineNum = 1428;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1429;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 1430;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 31;
 BA.debugLineNum = 1432;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641765",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1433;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1434;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 31;
;
 BA.debugLineNum = 1436;BA.debugLine="CLA.Info.Map2 = params";
Debug.ShouldStop(134217728);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map2" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 1437;BA.debugLine="CLA.Status.status = 2";
Debug.ShouldStop(268435456);
_cla.getField(false,"Status" /*RemoteObject*/ ).setField ("status" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 1438;BA.debugLine="Try";
Debug.ShouldStop(536870912);
if (true) break;

case 23:
//try
this.state = 28;
this.catchState = 27;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 27;
 BA.debugLineNum = 1439;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activity";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",mainmenu.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("StartCLA_ActivityMain")),(Object)((_cla)),(Object)((_name)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 31;
 BA.debugLineNum = 1441;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641774",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1442;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Share";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("Call StartCLA_Activity")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 31;
;
 if (true) break;

case 29:
//C
this.state = 32;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 1446;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624641779",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1470;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1472;BA.debugLine="panelOptions.Visible = False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._paneloptions.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1473;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1474;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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
public static RemoteObject  _butcallactions_click() throws Exception{
try {
		Debug.PushSubsStack("butCallActions_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,696);
if (RapidSub.canDelegate("butcallactions_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallactions_click");}
 BA.debugLineNum = 696;BA.debugLine="Sub butCallActions_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 697;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 698;BA.debugLine="If (ShareCode.APP_DOMAIN.ToLowerCase = \"demo\") Th";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("demo")))) { 
 BA.debugLineNum = 699;BA.debugLine="butCallActions_DEMO";
Debug.ShouldStop(67108864);
_butcallactions_demo();
 }else 
{ BA.debugLineNum = 700;BA.debugLine="else if  (ShareCode.APP_DOMAIN.ToLowerCase.Contai";
Debug.ShouldStop(134217728);
if ((mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("grandative")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 701;BA.debugLine="butCallActions_GA";
Debug.ShouldStop(268435456);
_butcallactions_ga();
 }else 
{ BA.debugLineNum = 702;BA.debugLine="else if  (ShareCode.APP_DOMAIN.ToLowerCase = \"bra";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("brasfone")))) { 
 BA.debugLineNum = 703;BA.debugLine="butCallActions_BF";
Debug.ShouldStop(1073741824);
_butcallactions_bf();
 }}}
;
 BA.debugLineNum = 705;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _butcallactions_demo() throws Exception{
try {
		Debug.PushSubsStack("butCallActions_DEMO (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,920);
if (RapidSub.canDelegate("butcallactions_demo")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallactions_demo"); return;}
ResumableSub_butCallActions_DEMO rsub = new ResumableSub_butCallActions_DEMO(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butCallActions_DEMO extends BA.ResumableSub {
public ResumableSub_butCallActions_DEMO(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newrequesttype = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _newrequest = RemoteObject.createImmutable("");
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _reqcounter = RemoteObject.createImmutable(0);
RemoteObject _incolitems = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _tasktype = RemoteObject.createImmutable(0);
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _actionkey = RemoteObject.createImmutable("");
RemoteObject _task = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _sdate = RemoteObject.createImmutable("");
RemoteObject _stime = RemoteObject.createImmutable("");
RemoteObject _close_type = RemoteObject.createImmutable(0);
RemoteObject _result_type = RemoteObject.createImmutable(0);
RemoteObject _result_values = RemoteObject.createImmutable("");
RemoteObject _clainfo = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requesttaskinfo");
RemoteObject _cla = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestcla");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butCallActions_DEMO (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,920);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 921;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(16777216);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 928;BA.debugLine="Dim tagcode As String = \"TSKS_20191002_193834\" '\"";
Debug.ShouldStop(-2147483648);
_tagcode = BA.ObjectToString("TSKS_20191002_193834");Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 929;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*RemoteObject*/ )));
 BA.debugLineNum = 930;BA.debugLine="Try";
Debug.ShouldStop(2);
if (true) break;

case 1:
//try
this.state = 32;
this.catchState = 31;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 31;
 BA.debugLineNum = 931;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(4);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 932;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(8);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 933;BA.debugLine="Dim newRequestType As String = \"\"";
Debug.ShouldStop(16);
_newrequesttype = BA.ObjectToString("");Debug.locals.put("newRequestType", _newrequesttype);Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 934;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode,";
Debug.ShouldStop(32);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct tagcode, title\n"),RemoteObject.createImmutable("				from dta_typerequests \n"),RemoteObject.createImmutable("				where tagcode in (select distinct typerequest_tagcode \n"),RemoteObject.createImmutable("					from dta_typerequests_tasks where task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("') and tr_is_model=0 limit 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 939;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(1024);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 940;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(2048);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 941;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 942;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(8192);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 943;BA.debugLine="newRequestType = Utils.IfNullOrEmpty(Record.Get";
Debug.ShouldStop(16384);
_newrequesttype = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(RemoteObject.createImmutable("TSKS_20191002_232135")));Debug.locals.put("newRequestType", _newrequesttype);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 945;BA.debugLine="Record.Close";
Debug.ShouldStop(65536);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 946;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagc";
Debug.ShouldStop(131072);
_newrequest = parent.mostCurrent._utils.runMethod(true,"_makerequesttagcode" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newRequest", _newrequest);Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 947;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(262144);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 948;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(524288);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 950;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(2097152);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 951;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 952;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 953;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("route_tagcode"))),(Object)((RemoteObject.createImmutable("ROUTE__NONE__"))));
 BA.debugLineNum = 954;BA.debugLine="newExecution.Put(\"is_child\", 0)";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_child"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 955;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("prerequest"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 956;BA.debugLine="newExecution.Put(\"status_id\", 2)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 957;BA.debugLine="newExecution.Put(\"state_id\", 4)";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state_id"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 958;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_date"))),(Object)((_newdate)));
 BA.debugLineNum = 959;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_time"))),(Object)((_newtime)));
 BA.debugLineNum = 960;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execdate_type"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 961;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dayweekmonth"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 962;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 963;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 964;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 965;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNA";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin_tagcode"))),(Object)((RemoteObject.createImmutable("TORI_INTERNAL"))));
 BA.debugLineNum = 966;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"OBJECT_2019_";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_tagcode"))),(Object)((RemoteObject.createImmutable("OBJECT_2019_091642"))));
 BA.debugLineNum = 967;BA.debugLine="newExecution.Put(\"object_tagcode\", \"OBJECT_20191";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("OBJECT_20191002_193449"))));
 BA.debugLineNum = 968;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("technical_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 969;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("team_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 970;BA.debugLine="newExecution.Put(\"local_tagcode\", \"ADRSS_2019100";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("local_tagcode"))),(Object)((RemoteObject.createImmutable("ADRSS_20191002_193449"))));
 BA.debugLineNum = 971;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newReque";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("typerequest_tagcode"))),(Object)((_newrequesttype)));
 BA.debugLineNum = 972;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SE";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vehicle_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_vehicle_object /*RemoteObject*/ )));
 BA.debugLineNum = 973;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("confirmed"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 974;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 975;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(16384);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 976;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(32768);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 977;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(65536);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 978;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
Debug.ShouldStop(131072);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 980;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 983;BA.debugLine="Dim ReqCounter As Int = DBStructures.GetCountOfE";
Debug.ShouldStop(4194304);
_reqcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getcountofevc" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(" and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")))));Debug.locals.put("ReqCounter", _reqcounter);Debug.locals.put("ReqCounter", _reqcounter);
 BA.debugLineNum = 985;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(16777216);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 986;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 987;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 988;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 989;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 990;BA.debugLine="newExecution.Put(\"position\", 0)";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 991;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 992;BA.debugLine="newExecution.Put(\"status_id\", 2)";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 993;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 994;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 995;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 996;BA.debugLine="newExecution.Put(\"object_tagcode\", \"OBJECT_20191";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("OBJECT_20191002_193449"))));
 BA.debugLineNum = 997;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 998;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 999;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 1000;BA.debugLine="newExecution.Put(\"repeatcounter\", ReqCounter)";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_reqcounter)));
 BA.debugLineNum = 1001;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1002;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(512);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 1003;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(1024);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 1004;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(2048);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 1005;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
Debug.ShouldStop(4096);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 1007;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1034;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(512);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"),RemoteObject.createImmutable("				select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode,\n"),RemoteObject.createImmutable("				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("				x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter\n"),RemoteObject.createImmutable("				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"),RemoteObject.createImmutable("				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, \n"),RemoteObject.createImmutable("				'' as execute_value, \n"),RemoteObject.createImmutable("				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("				0 as confirmed, '' as changed_value, a.repeatcounter\n"),RemoteObject.createImmutable("				from dta_requests_relations as a\n"),RemoteObject.createImmutable("				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("				where a.type_relation=0 and a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and a.relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and a.repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				) as x\n"),RemoteObject.createImmutable("				order by  x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1051;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576131",_ssql,0);
 BA.debugLineNum = 1052;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL, n";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions_DEMO")),(Object)(_ssql),(Object)(_newrequest));
 BA.debugLineNum = 1055;BA.debugLine="UploadNewRequest2Server(newRequest, newRequestIt";
Debug.ShouldStop(1073741824);
_uploadnewrequest2server(_newrequest,_newrequestitem,RemoteObject.createImmutable("0"));
 BA.debugLineNum = 1056;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "butcallactions_demo"),BA.numberCast(int.class, 1000));
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 1058;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETREQ";
Debug.ShouldStop(2);
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*RemoteObject*/ ;Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1059;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newReq";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" and z.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and z.repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqcounter))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1060;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576140",_ssql,0);
 BA.debugLineNum = 1061;BA.debugLine="Log(newRequest)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576141",_newrequest,0);
 BA.debugLineNum = 1062;BA.debugLine="Private incolitems As Cursor";
Debug.ShouldStop(32);
_incolitems = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("incolitems", _incolitems);
 BA.debugLineNum = 1063;BA.debugLine="incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(64);
_incolitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1064;BA.debugLine="If (incolitems.RowCount >= 1) Then";
Debug.ShouldStop(128);
if (true) break;

case 8:
//if
this.state = 29;
if ((RemoteObject.solveBoolean("g",_incolitems.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1065;BA.debugLine="incolitems.Position = 0";
Debug.ShouldStop(256);
_incolitems.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1067;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
Debug.ShouldStop(1024);
_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 1068;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\")";
Debug.ShouldStop(2048);
_tasktype = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type")));Debug.locals.put("tasktype", _tasktype);Debug.locals.put("tasktype", _tasktype);
 BA.debugLineNum = 1069;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"statu";
Debug.ShouldStop(4096);
_status_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 1070;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"t";
Debug.ShouldStop(8192);
_tagcode = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1071;BA.debugLine="Dim actionkey As String = incolitems.GetString(";
Debug.ShouldStop(16384);
_actionkey = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("action_tagcode")));Debug.locals.put("actionkey", _actionkey);Debug.locals.put("actionkey", _actionkey);
 BA.debugLineNum = 1072;BA.debugLine="Dim task As String = incolitems.GetString(\"task";
Debug.ShouldStop(32768);
_task = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")));Debug.locals.put("task", _task);Debug.locals.put("task", _task);
 BA.debugLineNum = 1073;BA.debugLine="Dim name As String = incolitems.GetString(\"name";
Debug.ShouldStop(65536);
_name = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1076;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDate";
Debug.ShouldStop(524288);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 1077;BA.debugLine="Private sACLALatitude As String = Utils.IfNullO";
Debug.ShouldStop(1048576);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1078;BA.debugLine="Private sACLALongitude As String = Utils.IfNull";
Debug.ShouldStop(2097152);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1080;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(8388608);
_sdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("sDate", _sdate);Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 1081;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(16777216);
_stime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("sTime", _stime);Debug.locals.put("sTime", _stime);
 BA.debugLineNum = 1083;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"clos";
Debug.ShouldStop(67108864);
_close_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("close_type")));Debug.locals.put("close_type", _close_type);Debug.locals.put("close_type", _close_type);
 BA.debugLineNum = 1084;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"res";
Debug.ShouldStop(134217728);
_result_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("result_type")));Debug.locals.put("result_type", _result_type);Debug.locals.put("result_type", _result_type);
 BA.debugLineNum = 1085;BA.debugLine="Dim result_values As String = incolitems.GetStr";
Debug.ShouldStop(268435456);
_result_values = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("result_values")));Debug.locals.put("result_values", _result_values);Debug.locals.put("result_values", _result_values);
 BA.debugLineNum = 1087;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeRequ";
Debug.ShouldStop(1073741824);
_clainfo = parent.mostCurrent._types.runMethod(false,"_makerequesttaskinfo" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 2)),(Object)(_close_type),(Object)(_result_type),(Object)(_result_values),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));Debug.locals.put("CLAInfo", _clainfo);Debug.locals.put("CLAInfo", _clainfo);
 BA.debugLineNum = 1088;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(ta";
Debug.ShouldStop(-2147483648);
_cla = parent.mostCurrent._types.runMethod(false,"_makerequestcla" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_actionkey),(Object)(_task),(Object)(_reqcounter),(Object)(_tasktype),(Object)(parent.mostCurrent._types.runMethod(false,"_makeinterv" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_id),(Object)(_tagcode),(Object)(_status_id),(Object)(parent.mostCurrent._utils.runMethod(true,"_colorint" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_status_id))))),(Object)(_clainfo),(Object)(parent.mostCurrent._types.runMethod(false,"_makeothercla" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("CLA", _cla);Debug.locals.put("CLA", _cla);
 BA.debugLineNum = 1092;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
Debug.ShouldStop(8);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("' where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1093;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL,";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions_DEMO")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1095;BA.debugLine="Log(\"Grava Status na BD local Request\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576175",RemoteObject.createImmutable("Grava Status na BD local Request"),0);
 BA.debugLineNum = 1096;BA.debugLine="Dim params As Map";
Debug.ShouldStop(128);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1097;BA.debugLine="params.Initialize";
Debug.ShouldStop(256);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1098;BA.debugLine="params.Clear";
Debug.ShouldStop(512);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1099;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1100;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 1101;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1102;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1103;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1104;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 1105;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 1106;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1107;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1108;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1109;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1110;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1111;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1112;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1113;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1114;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 11:
//try
this.state = 16;
this.catchState = 15;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 16;
this.catchState = 15;
 BA.debugLineNum = 1115;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1116;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 31;
 BA.debugLineNum = 1118;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576198",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1119;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1120;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1121;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 31;
;
 BA.debugLineNum = 1123;BA.debugLine="CLA.Info.Map1 = params";
Debug.ShouldStop(4);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map1" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 1125;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rela";
Debug.ShouldStop(16);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'  \n"),RemoteObject.createImmutable("						where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("' and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqcounter))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1127;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL,";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions_DEMO")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1129;BA.debugLine="Log(\"Grava Status na BD local Request-Relation\"";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576209",RemoteObject.createImmutable("Grava Status na BD local Request-Relation"),0);
 BA.debugLineNum = 1131;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1024);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1132;BA.debugLine="params.Initialize";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1133;BA.debugLine="params.Clear";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1134;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1135;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 1136;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_actionkey)));
 BA.debugLineNum = 1137;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1138;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1139;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1140;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 1141;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 1142;BA.debugLine="params.Put(\"ACLAReqCounter\", ReqCounter)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_reqcounter)));
 BA.debugLineNum = 1143;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1144;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1145;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1146;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1147;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1148;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1149;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1150;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1151;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
if (true) break;

case 17:
//try
this.state = 22;
this.catchState = 21;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 22;
this.catchState = 21;
 BA.debugLineNum = 1152;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1153;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 1154;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 31;
 BA.debugLineNum = 1156;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576236",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1157;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1158;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 31;
;
 BA.debugLineNum = 1160;BA.debugLine="CLA.Info.Map2 = params";
Debug.ShouldStop(128);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map2" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 1161;BA.debugLine="CLA.Status.status = 2";
Debug.ShouldStop(256);
_cla.getField(false,"Status" /*RemoteObject*/ ).setField ("status" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 1162;BA.debugLine="Try";
Debug.ShouldStop(512);
if (true) break;

case 23:
//try
this.state = 28;
this.catchState = 27;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 27;
 BA.debugLineNum = 1163;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activity";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",mainmenu.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("StartCLA_ActivityMain")),(Object)((_cla)),(Object)((_name)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 31;
 BA.debugLineNum = 1165;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576245",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1166;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Share";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("Call StartCLA_Activity")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 31;
;
 if (true) break;

case 29:
//C
this.state = 32;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 1170;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624576250",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1194;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1196;BA.debugLine="panelOptions.Visible = False";
Debug.ShouldStop(2048);
parent.mostCurrent._paneloptions.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1197;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1198;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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
public static void  _butcallactions_ga() throws Exception{
try {
		Debug.PushSubsStack("butCallActions_GA (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,710);
if (RapidSub.canDelegate("butcallactions_ga")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallactions_ga"); return;}
ResumableSub_butCallActions_GA rsub = new ResumableSub_butCallActions_GA(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butCallActions_GA extends BA.ResumableSub {
public ResumableSub_butCallActions_GA(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _tagcode0 = RemoteObject.createImmutable("");
RemoteObject _tagcode1 = RemoteObject.createImmutable("");
RemoteObject _tagcode2 = RemoteObject.createImmutable("");
RemoteObject _tagcode3 = RemoteObject.createImmutable("");
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newrequestitem2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newrequestitem3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newrequesttype = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _newrequest = RemoteObject.createImmutable("");
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butCallActions_GA (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,710);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 711;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(64);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 715;BA.debugLine="Dim tagcode0 As String = \"TSKS_EJRFO\"";
Debug.ShouldStop(1024);
_tagcode0 = BA.ObjectToString("TSKS_EJRFO");Debug.locals.put("tagcode0", _tagcode0);Debug.locals.put("tagcode0", _tagcode0);
 BA.debugLineNum = 716;BA.debugLine="Dim tagcode1 As String = \"TSKS_PROSPECT\"";
Debug.ShouldStop(2048);
_tagcode1 = BA.ObjectToString("TSKS_PROSPECT");Debug.locals.put("tagcode1", _tagcode1);Debug.locals.put("tagcode1", _tagcode1);
 BA.debugLineNum = 717;BA.debugLine="Dim tagcode2 As String = \"TSKS_EJREGERAL\"";
Debug.ShouldStop(4096);
_tagcode2 = BA.ObjectToString("TSKS_EJREGERAL");Debug.locals.put("tagcode2", _tagcode2);Debug.locals.put("tagcode2", _tagcode2);
 BA.debugLineNum = 718;BA.debugLine="Dim tagcode3 As String = \"TSKS_EJREQUIPMENT\"";
Debug.ShouldStop(8192);
_tagcode3 = BA.ObjectToString("TSKS_EJREQUIPMENT");Debug.locals.put("tagcode3", _tagcode3);Debug.locals.put("tagcode3", _tagcode3);
 BA.debugLineNum = 720;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*RemoteObject*/ )));
 BA.debugLineNum = 721;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 BA.debugLineNum = 722;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(131072);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 723;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(262144);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 725;BA.debugLine="Dim newRequestItem2 As Map";
Debug.ShouldStop(1048576);
_newrequestitem2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem2", _newrequestitem2);
 BA.debugLineNum = 726;BA.debugLine="newRequestItem2.Initialize";
Debug.ShouldStop(2097152);
_newrequestitem2.runVoidMethod ("Initialize");
 BA.debugLineNum = 728;BA.debugLine="Dim newRequestItem3 As Map";
Debug.ShouldStop(8388608);
_newrequestitem3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem3", _newrequestitem3);
 BA.debugLineNum = 729;BA.debugLine="newRequestItem3.Initialize";
Debug.ShouldStop(16777216);
_newrequestitem3.runVoidMethod ("Initialize");
 BA.debugLineNum = 731;BA.debugLine="Dim newRequestType As String = \"\"";
Debug.ShouldStop(67108864);
_newrequesttype = BA.ObjectToString("");Debug.locals.put("newRequestType", _newrequesttype);Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 732;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode,";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct tagcode, title\n"),RemoteObject.createImmutable("				from dta_typerequests  where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode0))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 737;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(1);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 738;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(2);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 739;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 740;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(8);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 741;BA.debugLine="newRequestType = Record.GetString(\"tagcode\")";
Debug.ShouldStop(16);
_newrequesttype = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("newRequestType", _newrequesttype);
 if (true) break;

case 7:
//C
this.state = 10;
;
 BA.debugLineNum = 743;BA.debugLine="Record.Close";
Debug.ShouldStop(64);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 744;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagc";
Debug.ShouldStop(128);
_newrequest = parent.mostCurrent._utils.runMethod(true,"_makerequesttagcode" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newRequest", _newrequest);Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 745;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(256);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 746;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(512);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 748;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(2048);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 751;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(16384);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 752;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 753;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 754;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 755;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("route_tagcode"))),(Object)((RemoteObject.createImmutable("ROUTE__NONE__"))));
 BA.debugLineNum = 756;BA.debugLine="newExecution.Put(\"is_child\", 0)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_child"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 757;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("prerequest"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 758;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 759;BA.debugLine="newExecution.Put(\"state_id\", 4)";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state_id"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 760;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_date"))),(Object)((_newdate)));
 BA.debugLineNum = 761;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_time"))),(Object)((_newtime)));
 BA.debugLineNum = 762;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execdate_type"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 763;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dayweekmonth"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 764;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 765;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 766;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 767;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNA";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin_tagcode"))),(Object)((RemoteObject.createImmutable("TORI_INTERNAL"))));
 BA.debugLineNum = 768;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"OBJECT_DESIG";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_tagcode"))),(Object)((RemoteObject.createImmutable("OBJECT_DESIGNATE"))));
 BA.debugLineNum = 769;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 770;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("technical_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 771;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("team_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 772;BA.debugLine="newExecution.Put(\"local_tagcode\", \"ADRSS_2019052";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("local_tagcode"))),(Object)((RemoteObject.createImmutable("ADRSS_20190522105322"))));
 BA.debugLineNum = 773;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", tagcode0";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("typerequest_tagcode"))),(Object)((_tagcode0)));
 BA.debugLineNum = 774;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SE";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vehicle_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_vehicle_object /*RemoteObject*/ )));
 BA.debugLineNum = 775;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("confirmed"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 776;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 777;BA.debugLine="newExecution.Put(\"cbr_id\", 0)";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cbr_id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 778;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(512);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 779;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(1024);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 780;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(2048);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 781;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
Debug.ShouldStop(4096);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 783;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 786;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(131072);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 787;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(262144);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 788;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 789;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 790;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 791;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode1)";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tagcode1)));
 BA.debugLineNum = 792;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 793;BA.debugLine="newExecution.Put(\"position\", 0)";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 794;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 795;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 796;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 797;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 798;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 799;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 800;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 801;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 802;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 803;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 804;BA.debugLine="newExecution.Put(\"cbr_id\", 0)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cbr_id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 805;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(16);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 806;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(32);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 807;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(64);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 808;BA.debugLine="newRequestItem2.Put(\"0\", ListOfMaps)";
Debug.ShouldStop(128);
_newrequestitem2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("0"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 810;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 812;BA.debugLine="maxID = maxID + 1 + 100000";
Debug.ShouldStop(2048);
_maxid = RemoteObject.solve(new RemoteObject[] {_maxid,RemoteObject.createImmutable(1),RemoteObject.createImmutable(100000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 813;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(4096);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 814;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 815;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 816;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 817;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode2)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tagcode2)));
 BA.debugLineNum = 818;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 819;BA.debugLine="newExecution.Put(\"position\", 0)";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 820;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 821;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 822;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 823;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 824;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 825;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 826;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 827;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 828;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 829;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 830;BA.debugLine="newExecution.Put(\"cbr_id\", 0)";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cbr_id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 831;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(1073741824);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 832;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(-2147483648);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 833;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(1);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 834;BA.debugLine="newRequestItem2.Put(\"1\", ListOfMaps)";
Debug.ShouldStop(2);
_newrequestitem2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("1"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 836;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 838;BA.debugLine="maxID = maxID + 1 + 100000";
Debug.ShouldStop(32);
_maxid = RemoteObject.solve(new RemoteObject[] {_maxid,RemoteObject.createImmutable(1),RemoteObject.createImmutable(100000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 839;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(64);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 840;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 841;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 842;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 843;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode3)";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tagcode3)));
 BA.debugLineNum = 844;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 845;BA.debugLine="newExecution.Put(\"position\", 0)";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 846;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 847;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 848;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 849;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 850;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 851;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 852;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 853;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 854;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 855;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 856;BA.debugLine="newExecution.Put(\"cbr_id\", 0)";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cbr_id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 857;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(16777216);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 858;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(33554432);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 859;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(67108864);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 860;BA.debugLine="newRequestItem2.Put(\"2\", ListOfMaps)";
Debug.ShouldStop(134217728);
_newrequestitem2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("2"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 861;BA.debugLine="newRequestItem.Put(\"relation\", newRequestItem2)";
Debug.ShouldStop(268435456);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_newrequestitem2.getObject())));
 BA.debugLineNum = 863;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 865;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(1);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1000000)}, "+",1, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 867;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("				tagcode,position,execute_value,execute_format_title,confirmed,changed_value,cbr_id)\n"),RemoteObject.createImmutable("				select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"),RemoteObject.createImmutable("				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("				x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, 0 As cbr_id\n"),RemoteObject.createImmutable("				from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode, \n"),RemoteObject.createImmutable("				c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position, \n"),RemoteObject.createImmutable("				a.position As relposition, '' as execute_value, \n"),RemoteObject.createImmutable("				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("				0 as confirmed, '' as changed_value\n"),RemoteObject.createImmutable("				from dta_requests_relations As a\n"),RemoteObject.createImmutable("				inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("				where a.type_relation=0 and a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				union\n"),RemoteObject.createImmutable("				select d.id, '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"),RemoteObject.createImmutable("				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) As position,\n"),RemoteObject.createImmutable("				a.position as relposition, '' as execute_value, \n"),RemoteObject.createImmutable("				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("				0 as confirmed, '' as changed_value\n"),RemoteObject.createImmutable("				from dta_requests_relations as a\n"),RemoteObject.createImmutable("				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode \n"),RemoteObject.createImmutable("				from dta_requests_relations where request_tagcode ='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("')) as x\n"),RemoteObject.createImmutable("				order by  x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 896;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624510650",_ssql,0);
 BA.debugLineNum = 897;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_GA\",sSQL, new";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions_GA")),(Object)(_ssql),(Object)(_newrequest));
 BA.debugLineNum = 901;BA.debugLine="UploadNewRequest2Server(newRequest, newRequestIt";
Debug.ShouldStop(16);
_uploadnewrequest2server(_newrequest,_newrequestitem,RemoteObject.createImmutable("1"));
 BA.debugLineNum = 903;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "butcallactions_ga"),BA.numberCast(int.class, 1000));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
 BA.debugLineNum = 905;BA.debugLine="CallRequests";
Debug.ShouldStop(256);
_callrequests();
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 908;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624510662",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 911;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 913;BA.debugLine="panelOptions.Visible = False";
Debug.ShouldStop(65536);
parent.mostCurrent._paneloptions.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 914;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 915;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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
public static RemoteObject  _butcallcamera_click() throws Exception{
try {
		Debug.PushSubsStack("butCallCamera_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,668);
if (RapidSub.canDelegate("butcallcamera_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallcamera_click");}
 BA.debugLineNum = 668;BA.debugLine="Sub butCallCamera_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 669;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 670;BA.debugLine="If Utils.Int2Bool(ShareCode.DEVICE_PARAM_FOTO_EVI";
Debug.ShouldStop(536870912);
if (mainmenu.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._device_param_foto_evidence /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 671;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessa";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )));
 BA.debugLineNum = 672;BA.debugLine="CallSubDelayed2(CameraActivity2, \"StartCamera\",";
Debug.ShouldStop(-2147483648);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",mainmenu.processBA,(Object)((mainmenu.mostCurrent._cameraactivity2.getObject())),(Object)(BA.ObjectToString("StartCamera")),(Object)((RemoteObject.createImmutable("MainMenu"))));
 BA.debugLineNum = 673;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 675;BA.debugLine="panelOptions.Visible = False";
Debug.ShouldStop(4);
mainmenu.mostCurrent._paneloptions.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 676;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcallimage_click() throws Exception{
try {
		Debug.PushSubsStack("butCallImage_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,678);
if (RapidSub.canDelegate("butcallimage_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallimage_click");}
RemoteObject _currentclaitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
 BA.debugLineNum = 678;BA.debugLine="Sub butCallImage_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 679;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(64);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 680;BA.debugLine="If Utils.Int2Bool(ShareCode.DEVICE_PARAM_DRAW_EVI";
Debug.ShouldStop(128);
if (mainmenu.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._device_param_draw_evidence /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 681;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessa";
Debug.ShouldStop(256);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )));
 BA.debugLineNum = 682;BA.debugLine="Dim CurrentCLAItem As RequestCLAItem = Types.Mak";
Debug.ShouldStop(512);
_currentclaitem = mainmenu.mostCurrent._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(mainmenu.mostCurrent._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("CurrentCLAItem", _currentclaitem);Debug.locals.put("CurrentCLAItem", _currentclaitem);
 BA.debugLineNum = 684;BA.debugLine="CallSubDelayed3(ImageEdit, \"StartDraw\", Me, Curr";
Debug.ShouldStop(2048);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",mainmenu.processBA,(Object)((mainmenu.mostCurrent._imageedit.getObject())),(Object)(BA.ObjectToString("StartDraw")),(Object)(mainmenu.getObject()),(Object)((_currentclaitem)));
 BA.debugLineNum = 685;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 687;BA.debugLine="panelOptions.Visible = False";
Debug.ShouldStop(16384);
mainmenu.mostCurrent._paneloptions.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _butcallshort1_click() throws Exception{
try {
		Debug.PushSubsStack("butCallShort1_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2291);
if (RapidSub.canDelegate("butcallshort1_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallshort1_click");}
 BA.debugLineNum = 2291;BA.debugLine="Sub butCallShort1_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2293;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcallshort2_click() throws Exception{
try {
		Debug.PushSubsStack("butCallShort2_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2295);
if (RapidSub.canDelegate("butcallshort2_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallshort2_click");}
 BA.debugLineNum = 2295;BA.debugLine="Sub butCallShort2_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 2297;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcallshort3_click() throws Exception{
try {
		Debug.PushSubsStack("butCallShort3_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2299);
if (RapidSub.canDelegate("butcallshort3_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butcallshort3_click");}
 BA.debugLineNum = 2299;BA.debugLine="Sub butCallShort3_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2301;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butclosesearchpanel_click() throws Exception{
try {
		Debug.PushSubsStack("butCloseSearchPanel_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3365);
if (RapidSub.canDelegate("butclosesearchpanel_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butclosesearchpanel_click");}
 BA.debugLineNum = 3365;BA.debugLine="Sub butCloseSearchPanel_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 3366;BA.debugLine="SearchPanel.Visible = False";
Debug.ShouldStop(32);
mainmenu.mostCurrent._searchpanel.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3367;BA.debugLine="butActionSearch.Tag = \"\"";
Debug.ShouldStop(64);
mainmenu.mostCurrent._butactionsearch.runMethod(false,"setTag",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 3368;BA.debugLine="EditSearch.Text=\"\"";
Debug.ShouldStop(128);
mainmenu.mostCurrent._editsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 3369;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butquickaction_click() throws Exception{
try {
		Debug.PushSubsStack("butQuickAction_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,654);
if (RapidSub.canDelegate("butquickaction_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butquickaction_click");}
 BA.debugLineNum = 654;BA.debugLine="Sub butQuickAction_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 656;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(32768);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 657;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 658;BA.debugLine="If panelOptions.Visible Then";
Debug.ShouldStop(131072);
if (mainmenu.mostCurrent._paneloptions.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 659;BA.debugLine="panelOptions.Visible = False";
Debug.ShouldStop(262144);
mainmenu.mostCurrent._paneloptions.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 661;BA.debugLine="panelOptions.Visible = True";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._paneloptions.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"True"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e9.toString()); BA.debugLineNum = 664;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(8388608);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","624248330",mainmenu.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _butsearch_click() throws Exception{
try {
		Debug.PushSubsStack("butSearch_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3169);
if (RapidSub.canDelegate("butsearch_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butsearch_click"); return;}
ResumableSub_butSearch_Click rsub = new ResumableSub_butSearch_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butSearch_Click extends BA.ResumableSub {
public ResumableSub_butSearch_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _upl = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butSearch_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3169);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3184;BA.debugLine="If Utils.NNE(EditSearch.Text) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._editsearch.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3185;BA.debugLine="SearchPanel.visible = True";
Debug.ShouldStop(65536);
parent.mostCurrent._searchpanel.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3186;BA.debugLine="ExpandListSearch.Clear";
Debug.ShouldStop(131072);
parent.mostCurrent._expandlistsearch.runVoidMethod ("_clear");
 BA.debugLineNum = 3187;BA.debugLine="EditSearchSearch.Text = EditSearch.Text";
Debug.ShouldStop(262144);
parent.mostCurrent._editsearchsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._editsearch.runMethod(true,"getText")));
 BA.debugLineNum = 3189;BA.debugLine="Dim upl  As ResumableSub = MakeGlobalSearchData(";
Debug.ShouldStop(1048576);
_upl = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_upl = _makeglobalsearchdata(parent.mostCurrent._editsearch.runMethod(true,"getText"));Debug.locals.put("upl", _upl);Debug.locals.put("upl", _upl);
 BA.debugLineNum = 3190;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "butsearch_click"), _upl);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 3202;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _complete(RemoteObject _finish) throws Exception{
}
public static RemoteObject  _butsearchclear_click() throws Exception{
try {
		Debug.PushSubsStack("butSearchClear_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3386);
if (RapidSub.canDelegate("butsearchclear_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butsearchclear_click");}
 BA.debugLineNum = 3386;BA.debugLine="Sub butSearchClear_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3387;BA.debugLine="ExpandListSearch.Clear";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._expandlistsearch.runVoidMethod ("_clear");
 BA.debugLineNum = 3388;BA.debugLine="EditSearchSearch.Text = \"\"";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._editsearchsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 3389;BA.debugLine="EditSearch.Text = \"\"";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._editsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 3390;BA.debugLine="butActionSearch.Tag = \"\"";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._butactionsearch.runMethod(false,"setTag",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 3391;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _butsearchsearch_click() throws Exception{
try {
		Debug.PushSubsStack("butSearchSearch_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3356);
if (RapidSub.canDelegate("butsearchsearch_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butsearchsearch_click"); return;}
ResumableSub_butSearchSearch_Click rsub = new ResumableSub_butSearchSearch_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butSearchSearch_Click extends BA.ResumableSub {
public ResumableSub_butSearchSearch_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _upl = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butSearchSearch_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3356);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3357;BA.debugLine="If Utils.NNE(EditSearchSearch.Text) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._editsearchsearch.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3358;BA.debugLine="ExpandListSearch.Clear";
Debug.ShouldStop(536870912);
parent.mostCurrent._expandlistsearch.runVoidMethod ("_clear");
 BA.debugLineNum = 3359;BA.debugLine="Dim upl  As ResumableSub = MakeGlobalSearchData(";
Debug.ShouldStop(1073741824);
_upl = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_upl = _makeglobalsearchdata(parent.mostCurrent._editsearchsearch.runMethod(true,"getText"));Debug.locals.put("upl", _upl);Debug.locals.put("upl", _upl);
 BA.debugLineNum = 3360;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "butsearchsearch_click"), _upl);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 3362;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static RemoteObject  _butsearchserver_click() throws Exception{
try {
		Debug.PushSubsStack("butSearchServer_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3352);
if (RapidSub.canDelegate("butsearchserver_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","butsearchserver_click");}
 BA.debugLineNum = 3352;BA.debugLine="Sub butSearchServer_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 3354;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonactionpause_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonActionPause_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2164);
if (RapidSub.canDelegate("buttonactionpause_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","buttonactionpause_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2164;BA.debugLine="Sub ButtonActionPause_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2165;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 2167;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
Debug.ShouldStop(4194304);
_i = mainmenu.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._avisopararpausa /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(mainmenu.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(mainmenu.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent.__c.getField(false,"Null"))),mainmenu.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 2168;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, mainmenu.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 2169;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2170;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(mainmenu.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ));
 BA.debugLineNum = 2171;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 2174;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(536870912);
_windowstatusupdate();
 BA.debugLineNum = 2175;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonappnetwork_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAppNetwork_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2177);
if (RapidSub.canDelegate("buttonappnetwork_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","buttonappnetwork_click");}
 BA.debugLineNum = 2177;BA.debugLine="Sub ButtonAppNetwork_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 2178;BA.debugLine="MsgboxAsync(ShareCode.ConnectionBreak, ShareCode.";
Debug.ShouldStop(2);
mainmenu.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._connectionbreak /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalnotetitle /*RemoteObject*/ )),mainmenu.processBA);
 BA.debugLineNum = 2179;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonassociated_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAssociated_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3089);
if (RapidSub.canDelegate("buttonassociated_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","buttonassociated_click");}
 BA.debugLineNum = 3089;BA.debugLine="Sub ButtonAssociated_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 3091;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 3092;BA.debugLine="ListViewBluetoothDevices.Clear";
Debug.ShouldStop(524288);
mainmenu.mostCurrent._listviewbluetoothdevices.runVoidMethod ("Clear");
 BA.debugLineNum = 3093;BA.debugLine="Printer.SelectFromAssociatedPrinter";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._printer.runVoidMethod ("_vvvv6");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e5.toString()); BA.debugLineNum = 3095;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","629032454",BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 3097;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonprint_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPrint_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3129);
if (RapidSub.canDelegate("buttonprint_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","buttonprint_click"); return;}
ResumableSub_ButtonPrint_Click rsub = new ResumableSub_ButtonPrint_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonPrint_Click extends BA.ResumableSub {
public ResumableSub_ButtonPrint_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonPrint_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3129);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3131;BA.debugLine="Try";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 BA.debugLineNum = 3132;BA.debugLine="If Not(Printer.Connected) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._printer.runMethod(true,"_vvv5"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3133;BA.debugLine="PrinterMessage = \"A Processar.....\"";
Debug.ShouldStop(268435456);
parent.mostCurrent._printermessage = BA.ObjectToString("A Processar.....");
 BA.debugLineNum = 3134;BA.debugLine="Printer.ClearBuffer";
Debug.ShouldStop(536870912);
parent.mostCurrent._printer.runVoidMethod ("_vvv3");
 BA.debugLineNum = 3135;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.BoldOn & \"X";
Debug.ShouldStop(1073741824);
parent.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.concat(parent.mostCurrent._esc_pos.getField(true,"_vv1"),RemoteObject.createImmutable("X-Evolution"),parent.mostCurrent._esc_pos.getField(true,"_vv4"))));
 BA.debugLineNum = 3137;BA.debugLine="Printer.AddBuffer_Writeline(\"VRCG\")";
Debug.ShouldStop(1);
parent.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("VRCG")));
 BA.debugLineNum = 3138;BA.debugLine="Printer.AddBuffer_Writeline(\"VRCG\")";
Debug.ShouldStop(2);
parent.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("VRCG")));
 BA.debugLineNum = 3142;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
Debug.ShouldStop(32);
parent.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3143;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
Debug.ShouldStop(64);
parent.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3144;BA.debugLine="Printer.SelectFromMac(CurrentPrinterConnected)";
Debug.ShouldStop(128);
parent.mostCurrent._printer.runVoidMethod ("_vvvv7",(Object)(BA.ObjectToString(parent.mostCurrent._currentprinterconnected)));
 BA.debugLineNum = 3145;BA.debugLine="Sleep(2500)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "buttonprint_click"),BA.numberCast(int.class, 2500));
this.state = 11;
return;
case 11:
//C
this.state = 7;
;
 if (true) break;

case 7:
//C
this.state = 10;
;
 BA.debugLineNum = 3148;BA.debugLine="Printer.flushAllAndClose";
Debug.ShouldStop(2048);
parent.mostCurrent._printer.runVoidMethod ("_vvv7");
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 3150;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","629229077",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 3153;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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
public static void  _buttonscanprinter_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonScanPrinter_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3100);
if (RapidSub.canDelegate("buttonscanprinter_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","buttonscanprinter_click"); return;}
ResumableSub_ButtonScanPrinter_Click rsub = new ResumableSub_ButtonScanPrinter_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonScanPrinter_Click extends BA.ResumableSub {
public ResumableSub_ButtonScanPrinter_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonScanPrinter_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3100);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3101;BA.debugLine="Private rp As RuntimePermissions";
Debug.ShouldStop(268435456);
_rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rp", _rp);
 BA.debugLineNum = 3103;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 BA.debugLineNum = 3104;BA.debugLine="ListViewBluetoothDevices.Clear";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._listviewbluetoothdevices.runVoidMethod ("Clear");
 BA.debugLineNum = 3105;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_L";
Debug.ShouldStop(1);
_rp.runVoidMethod ("CheckAndRequest",mainmenu.processBA,(Object)(_rp.getField(true,"PERMISSION_ACCESS_COARSE_LOCATION")));
 BA.debugLineNum = 3106;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "buttonscanprinter_click"), null);
this.state = 16;
return;
case 16:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3107;BA.debugLine="If Result = False Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3108;BA.debugLine="ToastMessageShow(\"No permission...\", False)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No permission...")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3109;BA.debugLine="Return";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 7:
//C
this.state = 10;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 3113;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","629097997",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 3116;BA.debugLine="Try";
Debug.ShouldStop(2048);

case 10:
//try
this.state = 15;
this.catchState = 0;
this.catchState = 14;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 14;
 BA.debugLineNum = 3117;BA.debugLine="FindPrintersBT";
Debug.ShouldStop(4096);
_findprintersbt();
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 3119;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","629098003",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 3122;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _buttonuserunavailable_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUserUnavailable_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1574);
if (RapidSub.canDelegate("buttonuserunavailable_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","buttonuserunavailable_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _cli = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 1574;BA.debugLine="Sub ButtonUserUnavailable_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 1575;BA.debugLine="Dim i As Int";
Debug.ShouldStop(64);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1576;BA.debugLine="i = Msgbox2(ShareCode.UserGoAvailableMessage, Sha";
Debug.ShouldStop(128);
_i = mainmenu.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._usergoavailablemessage /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(mainmenu.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(mainmenu.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent.__c.getField(false,"Null"))),mainmenu.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1577;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, mainmenu.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1578;BA.debugLine="Dim cli As AppDialogs";
Debug.ShouldStop(512);
_cli = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 1579;BA.debugLine="cli.Initialize";
Debug.ShouldStop(1024);
_cli.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 1580;BA.debugLine="cli.MakeUserAvailable(\"MainMenu\")";
Debug.ShouldStop(2048);
_cli.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_makeuseravailable" /*void*/ ,(Object)((RemoteObject.createImmutable("MainMenu"))));
 };
 BA.debugLineNum = 1582;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callalerts() throws Exception{
try {
		Debug.PushSubsStack("CallAlerts (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1696);
if (RapidSub.canDelegate("callalerts")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","callalerts");}
 BA.debugLineNum = 1696;BA.debugLine="Sub CallAlerts";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1697;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(1);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1698;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
Debug.ShouldStop(2);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )));
 BA.debugLineNum = 1699;BA.debugLine="CallSubDelayed2(Alerts, \"StartTasksActivity\", \"\")";
Debug.ShouldStop(4);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",mainmenu.processBA,(Object)((mainmenu.mostCurrent._alerts.getObject())),(Object)(BA.ObjectToString("StartTasksActivity")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1700;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(8);
mainmenu.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 1702;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callchecklisttest() throws Exception{
try {
		Debug.PushSubsStack("CallChecklistTest (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1853);
if (RapidSub.canDelegate("callchecklisttest")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","callchecklisttest");}
 BA.debugLineNum = 1853;BA.debugLine="Sub CallChecklistTest";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1854;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1855;BA.debugLine="CallSubDelayed(CheckListNew, \"CreateRowsToList\")";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mainmenu.processBA,(Object)((mainmenu.mostCurrent._checklistnew.getObject())),(Object)(RemoteObject.createImmutable("CreateRowsToList")));
 BA.debugLineNum = 1856;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callobjects() throws Exception{
try {
		Debug.PushSubsStack("CallObjects (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1712);
if (RapidSub.canDelegate("callobjects")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","callobjects");}
 BA.debugLineNum = 1712;BA.debugLine="Sub CallObjects";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1713;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(65536);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1716;BA.debugLine="CallSubDelayed3(Objects, \"StartObjectsActivity\",";
Debug.ShouldStop(524288);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",mainmenu.processBA,(Object)((mainmenu.mostCurrent._objects.getObject())),(Object)(BA.ObjectToString("StartObjectsActivity")),(Object)((mainmenu.mostCurrent.__c.getField(true,"False"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1717;BA.debugLine="ShareCode.FadeInFadeOutAnimation";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._sharecode.runVoidMethod ("_fadeinfadeoutanimation" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 1720;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callreports() throws Exception{
try {
		Debug.PushSubsStack("CallReports (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1704);
if (RapidSub.canDelegate("callreports")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","callreports");}
 BA.debugLineNum = 1704;BA.debugLine="Sub CallReports";
Debug.ShouldStop(128);
 BA.debugLineNum = 1705;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(256);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1706;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
Debug.ShouldStop(512);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )));
 BA.debugLineNum = 1707;BA.debugLine="CallSubDelayed2(Report, \"StartReportActivity\", 0)";
Debug.ShouldStop(1024);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",mainmenu.processBA,(Object)((mainmenu.mostCurrent._report.getObject())),(Object)(BA.ObjectToString("StartReportActivity")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1710;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callrequests() throws Exception{
try {
		Debug.PushSubsStack("CallRequests (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1731);
if (RapidSub.canDelegate("callrequests")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","callrequests");}
 BA.debugLineNum = 1731;BA.debugLine="Sub CallRequests";
Debug.ShouldStop(4);
 BA.debugLineNum = 1732;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(8);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1733;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
Debug.ShouldStop(16);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )));
 BA.debugLineNum = 1735;BA.debugLine="If ShareCode.APP_DOMAIN.ToLowerCase.Contains(\"gra";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(".",mainmenu.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("grandative")))) && RemoteObject.solveBoolean("=",mainmenu.mostCurrent._sharecode._currentrequestfilter /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 1736;BA.debugLine="ShareCode.CurrentRequestFilter = \" and  a.status";
Debug.ShouldStop(128);
mainmenu.mostCurrent._sharecode._currentrequestfilter /*RemoteObject*/  = BA.ObjectToString(" and  a.status_id in (1,2,3,4)");
 BA.debugLineNum = 1737;BA.debugLine="ShareCode.STS005 = False";
Debug.ShouldStop(256);
mainmenu.mostCurrent._sharecode._sts005 /*RemoteObject*/  = mainmenu.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 1740;BA.debugLine="CallSubDelayed3(requests3, \"StartRequestActivity\"";
Debug.ShouldStop(2048);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",mainmenu.processBA,(Object)((mainmenu.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("StartRequestActivity")),(Object)((mainmenu.mostCurrent.__c.getField(true,"False"))),(Object)((mainmenu.mostCurrent._sharecode._currentrequestfilter /*RemoteObject*/ )));
 BA.debugLineNum = 1741;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(4096);
mainmenu.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 1742;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8192);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1743;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calltasks() throws Exception{
try {
		Debug.PushSubsStack("CallTasks (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1722);
if (RapidSub.canDelegate("calltasks")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","calltasks");}
 BA.debugLineNum = 1722;BA.debugLine="Sub CallTasks";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1723;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1724;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )));
 BA.debugLineNum = 1726;BA.debugLine="CallSubDelayed3(TasksCL2, \"StartTasksActivityFirs";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",mainmenu.processBA,(Object)((mainmenu.mostCurrent._taskscl2.getObject())),(Object)(BA.ObjectToString("StartTasksActivityFirst")),(Object)((mainmenu.mostCurrent.__c.getField(true,"False"))),(Object)((RemoteObject.createImmutable("CalledFromMenu"))));
 BA.debugLineNum = 1729;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calluser() throws Exception{
try {
		Debug.PushSubsStack("CallUser (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1745);
if (RapidSub.canDelegate("calluser")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","calluser");}
 BA.debugLineNum = 1745;BA.debugLine="Sub CallUser";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1746;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(131072);
mainmenu.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1747;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
Debug.ShouldStop(262144);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )));
 BA.debugLineNum = 1748;BA.debugLine="CallSubDelayed2(User, \"StartUserActivity\", \"user.";
Debug.ShouldStop(524288);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",mainmenu.processBA,(Object)((mainmenu.mostCurrent._user.getObject())),(Object)(BA.ObjectToString("StartUserActivity")),(Object)((RemoteObject.createImmutable("user.json"))));
 BA.debugLineNum = 1749;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 1750;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2097152);
mainmenu.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1751;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closeallservicesfrommenu() throws Exception{
try {
		Debug.PushSubsStack("CloseAllServicesFromMenu (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2064);
if (RapidSub.canDelegate("closeallservicesfrommenu")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","closeallservicesfrommenu");}
ResumableSub_CloseAllServicesFromMenu rsub = new ResumableSub_CloseAllServicesFromMenu(null);
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
public static class ResumableSub_CloseAllServicesFromMenu extends BA.ResumableSub {
public ResumableSub_CloseAllServicesFromMenu(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CloseAllServicesFromMenu (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2064);
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
 BA.debugLineNum = 2065;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 2066;BA.debugLine="CancelScheduledService(Comms)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("CancelScheduledService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 2067;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 2068;BA.debugLine="CancelScheduledService(BackgroundUpdateService)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("CancelScheduledService",mainmenu.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 2069;BA.debugLine="StopService(BackgroundUpdateService)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 2070;BA.debugLine="CancelScheduledService(LocationService)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("CancelScheduledService",mainmenu.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 2071;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 2072;BA.debugLine="CancelScheduledService(Logs)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("CancelScheduledService",mainmenu.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 2073;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 2074;BA.debugLine="CancelScheduledService(Starter)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("CancelScheduledService",mainmenu.processBA,(Object)((parent.mostCurrent._starter.getObject())));
 BA.debugLineNum = 2075;BA.debugLine="StopService(Starter)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._starter.getObject())));
 BA.debugLineNum = 2076;BA.debugLine="CancelScheduledService(UpdateService)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("CancelScheduledService",mainmenu.processBA,(Object)((parent.mostCurrent._updateservice.getObject())));
 BA.debugLineNum = 2077;BA.debugLine="StopService(UpdateService)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._updateservice.getObject())));
 BA.debugLineNum = 2078;BA.debugLine="CancelScheduledService(UserService)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("CancelScheduledService",mainmenu.processBA,(Object)((parent.mostCurrent._userservice.getObject())));
 BA.debugLineNum = 2079;BA.debugLine="StopService(UserService)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._userservice.getObject())));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 2081;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627000849",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2082;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 2084;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2085;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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
public static RemoteObject  _compactdb_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("CompactDB_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2125);
if (RapidSub.canDelegate("compactdb_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","compactdb_click", _menuname);}
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 2125;BA.debugLine="Sub CompactDB_Click(MenuName As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 2126;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(\"vacuum;\")";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("vacuum;")));
 BA.debugLineNum = 2127;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cpbuttonalerts_click() throws Exception{
try {
		Debug.PushSubsStack("CPButtonAlerts_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1602);
if (RapidSub.canDelegate("cpbuttonalerts_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","cpbuttonalerts_click"); return;}
ResumableSub_CPButtonAlerts_Click rsub = new ResumableSub_CPButtonAlerts_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CPButtonAlerts_Click extends BA.ResumableSub {
public ResumableSub_CPButtonAlerts_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CPButtonAlerts_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1602);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1606;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )));
 BA.debugLineNum = 1607;BA.debugLine="Sleep(250)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "cpbuttonalerts_click"),BA.numberCast(int.class, 250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 BA.debugLineNum = 1608;BA.debugLine="If IsPaused(Comms) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"IsPaused",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject()))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1609;BA.debugLine="StartService(Comms)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 if (true) break;
;
 BA.debugLineNum = 1611;BA.debugLine="If (Not(ShareCode.SESS_BLOCK_OPTIONS)) Then";
Debug.ShouldStop(1024);

case 4:
//if
this.state = 7;
if ((parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._sess_block_options /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1612;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Alerts";
Debug.ShouldStop(2048);
parent.mostCurrent._mainlabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_alerts /*RemoteObject*/ ));
 BA.debugLineNum = 1616;BA.debugLine="CallAlerts '";
Debug.ShouldStop(32768);
_callalerts();
 if (true) break;

case 7:
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
public static void  _cpbuttonkpi_click() throws Exception{
try {
		Debug.PushSubsStack("CPButtonKPI_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1622);
if (RapidSub.canDelegate("cpbuttonkpi_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","cpbuttonkpi_click"); return;}
ResumableSub_CPButtonKPI_Click rsub = new ResumableSub_CPButtonKPI_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CPButtonKPI_Click extends BA.ResumableSub {
public ResumableSub_CPButtonKPI_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CPButtonKPI_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1622);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1626;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )));
 BA.debugLineNum = 1627;BA.debugLine="Sleep(250)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "cpbuttonkpi_click"),BA.numberCast(int.class, 250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 BA.debugLineNum = 1628;BA.debugLine="If IsPaused(Comms) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"IsPaused",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject()))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1629;BA.debugLine="StartService(Comms)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 if (true) break;
;
 BA.debugLineNum = 1631;BA.debugLine="If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(Shar";
Debug.ShouldStop(1073741824);

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._sess_block_options /*RemoteObject*/ ))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1632;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_KPI";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mainlabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_kpi /*RemoteObject*/ ));
 BA.debugLineNum = 1636;BA.debugLine="CallReports";
Debug.ShouldStop(8);
_callreports();
 if (true) break;

case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 1639;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _cpbuttonobjects_click() throws Exception{
try {
		Debug.PushSubsStack("CPButtonObjects_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1651);
if (RapidSub.canDelegate("cpbuttonobjects_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","cpbuttonobjects_click"); return;}
ResumableSub_CPButtonObjects_Click rsub = new ResumableSub_CPButtonObjects_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CPButtonObjects_Click extends BA.ResumableSub {
public ResumableSub_CPButtonObjects_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CPButtonObjects_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1651);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1655;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )));
 BA.debugLineNum = 1656;BA.debugLine="Sleep(250)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "cpbuttonobjects_click"),BA.numberCast(int.class, 250));
this.state = 14;
return;
case 14:
//C
this.state = 1;
;
 BA.debugLineNum = 1657;BA.debugLine="If IsPaused(Comms) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"IsPaused",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject()))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1658;BA.debugLine="StartService(Comms)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 if (true) break;
;
 BA.debugLineNum = 1660;BA.debugLine="If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(Shar";
Debug.ShouldStop(134217728);

case 4:
//if
this.state = 13;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._sess_block_options /*RemoteObject*/ ))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1661;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 12;
if ((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1662;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Plann";
Debug.ShouldStop(536870912);
parent.mostCurrent._mainlabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_planning /*RemoteObject*/ ));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1664;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Objec";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mainlabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_objects /*RemoteObject*/ ));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1668;BA.debugLine="CallObjects";
Debug.ShouldStop(8);
_callobjects();
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 1671;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _cpbuttonrequests_click() throws Exception{
try {
		Debug.PushSubsStack("CPButtonRequests_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1673);
if (RapidSub.canDelegate("cpbuttonrequests_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","cpbuttonrequests_click"); return;}
ResumableSub_CPButtonRequests_Click rsub = new ResumableSub_CPButtonRequests_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CPButtonRequests_Click extends BA.ResumableSub {
public ResumableSub_CPButtonRequests_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _susp = RemoteObject.declareNull("uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper.SuspendedCause");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CPButtonRequests_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1673);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1675;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )));
 BA.debugLineNum = 1676;BA.debugLine="Sleep(250)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "cpbuttonrequests_click"),BA.numberCast(int.class, 250));
this.state = 20;
return;
case 20:
//C
this.state = 1;
;
 BA.debugLineNum = 1677;BA.debugLine="If IsPaused(Comms) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"IsPaused",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject()))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1678;BA.debugLine="StartService(Comms)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 if (true) break;
;
 BA.debugLineNum = 1680;BA.debugLine="If Not(ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(32768);

case 4:
//if
this.state = 19;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1681;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Reques";
Debug.ShouldStop(65536);
parent.mostCurrent._mainlabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_request /*RemoteObject*/ ));
 BA.debugLineNum = 1682;BA.debugLine="If LocationService.FusedLocationProvider1.IsInit";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//if
this.state = 18;
if (parent.mostCurrent._locationservice._fusedlocationprovider1 /*RemoteObject*/ .runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1683;BA.debugLine="If Not(LocationService.FusedLocationProvider1.I";
Debug.ShouldStop(262144);
if (true) break;

case 10:
//if
this.state = 17;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._locationservice._fusedlocationprovider1 /*RemoteObject*/ .runMethod(true,"IsConnected"))).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1684;BA.debugLine="LocationService.FusedLocationProvider1.Connect";
Debug.ShouldStop(524288);
parent.mostCurrent._locationservice._fusedlocationprovider1 /*RemoteObject*/ .runVoidMethod ("Connect");
 BA.debugLineNum = 1685;BA.debugLine="If (LocationService.FusedLocationProvider1.IsC";
Debug.ShouldStop(1048576);
if (true) break;

case 13:
//if
this.state = 16;
if ((parent.mostCurrent._locationservice._fusedlocationprovider1 /*RemoteObject*/ .runMethod(true,"IsConnecting")).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1686;BA.debugLine="Dim susp As SuspendedCause = LocationService.";
Debug.ShouldStop(2097152);
_susp = parent.mostCurrent._locationservice._fusedlocationprovider1 /*RemoteObject*/ .getField(false,"SuspendedCause");Debug.locals.put("susp", _susp);Debug.locals.put("susp", _susp);
 BA.debugLineNum = 1687;BA.debugLine="Log( $\"${susp.CAUSE_NETWORK_LOST}:${susp.CAUS";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","625296910",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_susp.getField(true,"CAUSE_NETWORK_LOST")))),RemoteObject.createImmutable(":"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_susp.getField(true,"CAUSE_NETWORK_LOST")))),RemoteObject.createImmutable(""))),0);
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 1690;BA.debugLine="CallRequests";
Debug.ShouldStop(33554432);
_callrequests();
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 1693;BA.debugLine="End Sub";
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
public static void  _cpbuttontasks_click() throws Exception{
try {
		Debug.PushSubsStack("CPButtonTasks_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1585);
if (RapidSub.canDelegate("cpbuttontasks_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","cpbuttontasks_click"); return;}
ResumableSub_CPButtonTasks_Click rsub = new ResumableSub_CPButtonTasks_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CPButtonTasks_Click extends BA.ResumableSub {
public ResumableSub_CPButtonTasks_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CPButtonTasks_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1585);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1589;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )));
 BA.debugLineNum = 1590;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "cpbuttontasks_click"),BA.numberCast(int.class, 100));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 BA.debugLineNum = 1591;BA.debugLine="If IsPaused(Comms) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"IsPaused",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject()))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1592;BA.debugLine="StartService(Comms)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 if (true) break;
;
 BA.debugLineNum = 1594;BA.debugLine="If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(Shar";
Debug.ShouldStop(33554432);

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._sess_block_options /*RemoteObject*/ ))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1595;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Tasks";
Debug.ShouldStop(67108864);
parent.mostCurrent._mainlabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_tasks /*RemoteObject*/ ));
 BA.debugLineNum = 1597;BA.debugLine="CallTasks";
Debug.ShouldStop(268435456);
_calltasks();
 if (true) break;

case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 1600;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static void  _cpbuttonuser_click() throws Exception{
try {
		Debug.PushSubsStack("CPButtonUser_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1641);
if (RapidSub.canDelegate("cpbuttonuser_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","cpbuttonuser_click"); return;}
ResumableSub_CPButtonUser_Click rsub = new ResumableSub_CPButtonUser_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CPButtonUser_Click extends BA.ResumableSub {
public ResumableSub_CPButtonUser_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CPButtonUser_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1641);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1643;BA.debugLine="CallSub(Starter, \"CheckWebAccess\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",mainmenu.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("CheckWebAccess")));
 BA.debugLineNum = 1645;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )));
 BA.debugLineNum = 1646;BA.debugLine="Sleep(250)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "cpbuttonuser_click"),BA.numberCast(int.class, 250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1647;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_User";
Debug.ShouldStop(16384);
parent.mostCurrent._mainlabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_user /*RemoteObject*/ ));
 BA.debugLineNum = 1648;BA.debugLine="CallUser";
Debug.ShouldStop(32768);
_calluser();
 BA.debugLineNum = 1649;BA.debugLine="End Sub";
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
public static RemoteObject  _createchapter(RemoteObject _idx,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("CreateChapter (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3256);
if (RapidSub.canDelegate("createchapter")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","createchapter", _idx, _title);}
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("idx", _idx);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 3256;BA.debugLine="Sub CreateChapter(idx As Int, Title As String) As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 3257;BA.debugLine="Dim height As Int = Utils.IntToDIP(70)";
Debug.ShouldStop(16777216);
_height = mainmenu.mostCurrent._utils.runMethod(true,"_inttodip" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 70)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 3258;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3259;BA.debugLine="p.Initialize(\"CLALineClick\")";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("Initialize",mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("CLALineClick")));
 BA.debugLineNum = 3260;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height) '115dip)";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mainmenu.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),mainmenu.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 3261;BA.debugLine="p.LoadLayout(\"RecordGroupTitle\")";
Debug.ShouldStop(268435456);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("RecordGroupTitle")),mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 3262;BA.debugLine="p.RemoveView";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 3263;BA.debugLine="RecordLineTitle.Text = $\"${Title}\"$";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent._recordlinetitle.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3264;BA.debugLine="p.Tag = $\"${idx}\"$";
Debug.ShouldStop(-2147483648);
_p.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idx))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3265;BA.debugLine="Return p";
Debug.ShouldStop(1);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 3266;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchapteritem(RemoteObject _idx,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("CreateChapterItem (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3271);
if (RapidSub.canDelegate("createchapteritem")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","createchapteritem", _idx, _result);}
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _execute_date = RemoteObject.createImmutable("");
RemoteObject _execute_start = RemoteObject.createImmutable("");
RemoteObject _reference = RemoteObject.createImmutable("");
RemoteObject _entidade = RemoteObject.createImmutable("");
RemoteObject _objecto = RemoteObject.createImmutable("");
RemoteObject _tipointervencao = RemoteObject.createImmutable("");
RemoteObject _tecnico = RemoteObject.createImmutable("");
RemoteObject _tipoobjecto = RemoteObject.createImmutable("");
RemoteObject _morada1 = RemoteObject.createImmutable("");
RemoteObject _concelhodistrito1 = RemoteObject.createImmutable("");
RemoteObject _georef1 = RemoteObject.createImmutable("");
RemoteObject _morada2 = RemoteObject.createImmutable("");
RemoteObject _concelhodistrito2 = RemoteObject.createImmutable("");
RemoteObject _georef2 = RemoteObject.createImmutable("");
RemoteObject _morada3 = RemoteObject.createImmutable("");
RemoteObject _concelhodistrito3 = RemoteObject.createImmutable("");
RemoteObject _georef3 = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _subtitle = RemoteObject.createImmutable("");
RemoteObject _aaa = RemoteObject.createImmutable("");
Debug.locals.put("idx", _idx);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 3271;BA.debugLine="Sub CreateChapterItem(idx As Int, Result As Result";
Debug.ShouldStop(64);
 BA.debugLineNum = 3272;BA.debugLine="Dim height As Int = Utils.IntToDIP(70)";
Debug.ShouldStop(128);
_height = mainmenu.mostCurrent._utils.runMethod(true,"_inttodip" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 70)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 3273;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3274;BA.debugLine="p.Initialize(\"CLALineClick\")";
Debug.ShouldStop(512);
_p.runVoidMethod ("Initialize",mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("CLALineClick")));
 BA.debugLineNum = 3275;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height) '115dip)";
Debug.ShouldStop(1024);
mainmenu.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mainmenu.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),mainmenu.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 3276;BA.debugLine="p.LoadLayout(\"RecordGroupItemRequest\")";
Debug.ShouldStop(2048);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("RecordGroupItemRequest")),mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 3277;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4096);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 3279;BA.debugLine="Dim tagcode As String = Result.GetString(\"tagcode";
Debug.ShouldStop(16384);
_tagcode = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 3280;BA.debugLine="Dim execute_date As String = Result.GetString(\"ex";
Debug.ShouldStop(32768);
_execute_date = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("execute_date")));Debug.locals.put("execute_date", _execute_date);Debug.locals.put("execute_date", _execute_date);
 BA.debugLineNum = 3281;BA.debugLine="Dim execute_start As String = Result.GetString(\"e";
Debug.ShouldStop(65536);
_execute_start = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("execute_start")));Debug.locals.put("execute_start", _execute_start);Debug.locals.put("execute_start", _execute_start);
 BA.debugLineNum = 3282;BA.debugLine="Dim reference As String = Result.GetString(\"refer";
Debug.ShouldStop(131072);
_reference = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reference")));Debug.locals.put("reference", _reference);Debug.locals.put("reference", _reference);
 BA.debugLineNum = 3283;BA.debugLine="Dim entidade As String = Result.GetString(\"entida";
Debug.ShouldStop(262144);
_entidade = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("entidade")));Debug.locals.put("entidade", _entidade);Debug.locals.put("entidade", _entidade);
 BA.debugLineNum = 3284;BA.debugLine="Dim objecto As String = Result.GetString(\"objecto";
Debug.ShouldStop(524288);
_objecto = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("objecto")));Debug.locals.put("objecto", _objecto);Debug.locals.put("objecto", _objecto);
 BA.debugLineNum = 3285;BA.debugLine="Dim tipointervencao As String = Result.GetString(";
Debug.ShouldStop(1048576);
_tipointervencao = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipointervencao")));Debug.locals.put("tipointervencao", _tipointervencao);Debug.locals.put("tipointervencao", _tipointervencao);
 BA.debugLineNum = 3286;BA.debugLine="Dim tecnico As String = Result.GetString(\"tecnico";
Debug.ShouldStop(2097152);
_tecnico = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tecnico")));Debug.locals.put("tecnico", _tecnico);Debug.locals.put("tecnico", _tecnico);
 BA.debugLineNum = 3287;BA.debugLine="Dim tipoobjecto As String = Result.GetString(\"tip";
Debug.ShouldStop(4194304);
_tipoobjecto = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipoobjecto")));Debug.locals.put("tipoobjecto", _tipoobjecto);Debug.locals.put("tipoobjecto", _tipoobjecto);
 BA.debugLineNum = 3288;BA.debugLine="Dim morada1 As String = Result.GetString(\"morada1";
Debug.ShouldStop(8388608);
_morada1 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("morada1")));Debug.locals.put("morada1", _morada1);Debug.locals.put("morada1", _morada1);
 BA.debugLineNum = 3289;BA.debugLine="Dim concelhodistrito1 As String = Result.GetStrin";
Debug.ShouldStop(16777216);
_concelhodistrito1 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("concelhodistrito1")));Debug.locals.put("concelhodistrito1", _concelhodistrito1);Debug.locals.put("concelhodistrito1", _concelhodistrito1);
 BA.debugLineNum = 3290;BA.debugLine="Dim georef1 As String = Result.GetString(\"georef1";
Debug.ShouldStop(33554432);
_georef1 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("georef1")));Debug.locals.put("georef1", _georef1);Debug.locals.put("georef1", _georef1);
 BA.debugLineNum = 3291;BA.debugLine="Dim morada2 As String = Result.GetString(\"morada2";
Debug.ShouldStop(67108864);
_morada2 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("morada2")));Debug.locals.put("morada2", _morada2);Debug.locals.put("morada2", _morada2);
 BA.debugLineNum = 3292;BA.debugLine="Dim concelhodistrito2 As String = Result.GetStrin";
Debug.ShouldStop(134217728);
_concelhodistrito2 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("concelhodistrito2")));Debug.locals.put("concelhodistrito2", _concelhodistrito2);Debug.locals.put("concelhodistrito2", _concelhodistrito2);
 BA.debugLineNum = 3293;BA.debugLine="Dim georef2 As String = Result.GetString(\"georef2";
Debug.ShouldStop(268435456);
_georef2 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("georef2")));Debug.locals.put("georef2", _georef2);Debug.locals.put("georef2", _georef2);
 BA.debugLineNum = 3294;BA.debugLine="Dim morada3 As String = Result.GetString(\"morada3";
Debug.ShouldStop(536870912);
_morada3 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("morada3")));Debug.locals.put("morada3", _morada3);Debug.locals.put("morada3", _morada3);
 BA.debugLineNum = 3295;BA.debugLine="Dim concelhodistrito3 As String = Result.GetStrin";
Debug.ShouldStop(1073741824);
_concelhodistrito3 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("concelhodistrito3")));Debug.locals.put("concelhodistrito3", _concelhodistrito3);Debug.locals.put("concelhodistrito3", _concelhodistrito3);
 BA.debugLineNum = 3296;BA.debugLine="Dim georef3 As String = Result.GetString(\"georef3";
Debug.ShouldStop(-2147483648);
_georef3 = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("georef3")));Debug.locals.put("georef3", _georef3);Debug.locals.put("georef3", _georef3);
 BA.debugLineNum = 3298;BA.debugLine="Dim Title As String = $\"\"$";
Debug.ShouldStop(2);
_title = (RemoteObject.createImmutable(""));Debug.locals.put("Title", _title);Debug.locals.put("Title", _title);
 BA.debugLineNum = 3299;BA.debugLine="Dim SubTitle As String = $\"\"$";
Debug.ShouldStop(4);
_subtitle = (RemoteObject.createImmutable(""));Debug.locals.put("SubTitle", _subtitle);Debug.locals.put("SubTitle", _subtitle);
 BA.debugLineNum = 3300;BA.debugLine="If (idx =1) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",_idx,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 3301;BA.debugLine="Title = $\"${execute_date} ${execute_start} - ${t";
Debug.ShouldStop(16);
_title = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_execute_date))),RemoteObject.createImmutable(" "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_execute_start))),RemoteObject.createImmutable(" - "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tipointervencao))),RemoteObject.createImmutable(", "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecto))),RemoteObject.createImmutable(", "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reference))),RemoteObject.createImmutable(", ("),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable(") ")));Debug.locals.put("Title", _title);
 BA.debugLineNum = 3302;BA.debugLine="If Utils.NNE(morada1) Then";
Debug.ShouldStop(32);
if (mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_morada1)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3303;BA.debugLine="SubTitle = $\"${morada1} ${concelhodistrito1} -";
Debug.ShouldStop(64);
_subtitle = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_morada1))),RemoteObject.createImmutable(" "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_concelhodistrito1))),RemoteObject.createImmutable(" - ("),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_georef1))),RemoteObject.createImmutable(")")));Debug.locals.put("SubTitle", _subtitle);
 }else 
{ BA.debugLineNum = 3304;BA.debugLine="else If Utils.NNE(morada2) Then";
Debug.ShouldStop(128);
if (mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_morada2)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3305;BA.debugLine="SubTitle = $\"${morada2} ${concelhodistrito2} -";
Debug.ShouldStop(256);
_subtitle = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_morada2))),RemoteObject.createImmutable(" "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_concelhodistrito2))),RemoteObject.createImmutable(" - ("),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_georef2))),RemoteObject.createImmutable(")")));Debug.locals.put("SubTitle", _subtitle);
 }else 
{ BA.debugLineNum = 3306;BA.debugLine="else If Utils.NNE(morada3) Then";
Debug.ShouldStop(512);
if (mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_morada3)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3307;BA.debugLine="SubTitle = $\"${morada3} ${concelhodistrito3} -";
Debug.ShouldStop(1024);
_subtitle = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_morada3))),RemoteObject.createImmutable(" "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_concelhodistrito3))),RemoteObject.createImmutable(" - ("),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_georef3))),RemoteObject.createImmutable(")")));Debug.locals.put("SubTitle", _subtitle);
 }}}
;
 }else 
{ BA.debugLineNum = 3309;BA.debugLine="else if (idx=2) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",_idx,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 3310;BA.debugLine="Title = $\"${objecto} - ${tipoobjecto}, ${referen";
Debug.ShouldStop(8192);
_title = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecto))),RemoteObject.createImmutable(" - "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tipoobjecto))),RemoteObject.createImmutable(", "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reference))),RemoteObject.createImmutable(", ("),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable(")")));Debug.locals.put("Title", _title);
 BA.debugLineNum = 3311;BA.debugLine="SubTitle = $\"${morada1} ${concelhodistrito1} - (";
Debug.ShouldStop(16384);
_subtitle = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_morada1))),RemoteObject.createImmutable(" "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_concelhodistrito1))),RemoteObject.createImmutable(" - ("),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_georef1))),RemoteObject.createImmutable(")")));Debug.locals.put("SubTitle", _subtitle);
 }else {
 BA.debugLineNum = 3313;BA.debugLine="Title = $\"(${tagcode}) ${objecto}, ${reference}\"";
Debug.ShouldStop(65536);
_title = (RemoteObject.concat(RemoteObject.createImmutable("("),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable(") "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecto))),RemoteObject.createImmutable(", "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reference))),RemoteObject.createImmutable("")));Debug.locals.put("Title", _title);
 }}
;
 BA.debugLineNum = 3315;BA.debugLine="If Utils.NNE(SubTitle) Then";
Debug.ShouldStop(262144);
if (mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_subtitle)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3316;BA.debugLine="Dim aaa As String = SubTitle.ToLowerCase";
Debug.ShouldStop(524288);
_aaa = _subtitle.runMethod(true,"toLowerCase");Debug.locals.put("aaa", _aaa);Debug.locals.put("aaa", _aaa);
 BA.debugLineNum = 3317;BA.debugLine="If Not(aaa.Contains(\"a\") Or aaa.Contains(\"e\") Or";
Debug.ShouldStop(1048576);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_aaa.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("a")))) || RemoteObject.solveBoolean(".",_aaa.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("e")))) || RemoteObject.solveBoolean(".",_aaa.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("i")))) || RemoteObject.solveBoolean(".",_aaa.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("o")))) || RemoteObject.solveBoolean(".",_aaa.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("u"))))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3318;BA.debugLine="SubTitle = \"\"";
Debug.ShouldStop(2097152);
_subtitle = BA.ObjectToString("");Debug.locals.put("SubTitle", _subtitle);
 };
 };
 BA.debugLineNum = 3322;BA.debugLine="RecordLineMoreOptions.Tag = $\"${tagcode}\"$";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._recordlinemoreoptions.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3324;BA.debugLine="RecordLineTitle.Text = $\"${Title}\"$";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._recordlinetitle.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3325;BA.debugLine="RecordLineTitle.tag = $\"${tagcode}\"$";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._recordlinetitle.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3326;BA.debugLine="RecordLineTitleSecond.Text = $\"${SubTitle}\"$";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._recordlinetitlesecond.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_subtitle))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3327;BA.debugLine="RecordLineTitleSecond.tag = $\"${tagcode}\"$";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent._recordlinetitlesecond.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3328;BA.debugLine="p.Tag = $\"${idx}|${tagcode}\"$";
Debug.ShouldStop(-2147483648);
_p.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idx))),RemoteObject.createImmutable("|"),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3329;BA.debugLine="Return p";
Debug.ShouldStop(1);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 3330;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deviceinfoorientationchange(RemoteObject _newori) throws Exception{
try {
		Debug.PushSubsStack("DeviceInfoOrientationChange (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2156);
if (RapidSub.canDelegate("deviceinfoorientationchange")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","deviceinfoorientationchange", _newori);}
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("newOri", _newori);
 BA.debugLineNum = 2156;BA.debugLine="Sub DeviceInfoOrientationChange(newOri As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2157;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.OrientationChang";
Debug.ShouldStop(4096);
_i = mainmenu.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._orientationchange /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(mainmenu.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(mainmenu.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent.__c.getField(false,"Null"))),mainmenu.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 2158;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, mainmenu.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 2159;BA.debugLine="CallSubDelayed2(Main, \"RestartApp\", newOri)";
Debug.ShouldStop(16384);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",mainmenu.processBA,(Object)((mainmenu.mostCurrent._main.getObject())),(Object)(BA.ObjectToString("RestartApp")),(Object)((_newori)));
 BA.debugLineNum = 2160;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
mainmenu.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 2162;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqroute_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DialogReqRoute_ItemClick (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3009);
if (RapidSub.canDelegate("dialogreqroute_itemclick")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","dialogreqroute_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3009;BA.debugLine="Sub DialogReqRoute_ItemClick (Position As Int, Val";
Debug.ShouldStop(1);
 BA.debugLineNum = 3011;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editsearch_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditSearch_EnterPressed (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3158);
if (RapidSub.canDelegate("editsearch_enterpressed")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","editsearch_enterpressed");}
 BA.debugLineNum = 3158;BA.debugLine="Sub EditSearch_EnterPressed";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 3160;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editsearch_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EditSearch_FocusChanged (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3162);
if (RapidSub.canDelegate("editsearch_focuschanged")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","editsearch_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 3162;BA.debugLine="Sub EditSearch_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3164;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expandlistsearch_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ExpandListSearch_ItemClick (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3371);
if (RapidSub.canDelegate("expandlistsearch_itemclick")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","expandlistsearch_itemclick", _index, _value);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _valstr = RemoteObject.createImmutable("");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3371;BA.debugLine="Sub ExpandListSearch_ItemClick (Index As Int, Valu";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3372;BA.debugLine="Dim panel As B4XView = ExpandListSearch.GetPanel(";
Debug.ShouldStop(2048);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = mainmenu.mostCurrent._expandlistsearch.runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 3373;BA.debugLine="Dim valStr As String = panel.Tag";
Debug.ShouldStop(4096);
_valstr = BA.ObjectToString(_panel.runMethod(false,"getTag"));Debug.locals.put("valStr", _valstr);Debug.locals.put("valStr", _valstr);
 BA.debugLineNum = 3374;BA.debugLine="If Utils.NNE(valStr) Then";
Debug.ShouldStop(8192);
if (mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_valstr)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3375;BA.debugLine="If (Not(valStr = \"1\") And Not(valStr = \"2\") And";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean(".",mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_valstr,RemoteObject.createImmutable("1")))))) && RemoteObject.solveBoolean(".",mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_valstr,RemoteObject.createImmutable("2")))))) && RemoteObject.solveBoolean(".",mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_valstr,RemoteObject.createImmutable("3")))))))) { 
 BA.debugLineNum = 3376;BA.debugLine="butActionSearch.Tag = valStr";
Debug.ShouldStop(32768);
mainmenu.mostCurrent._butactionsearch.runMethod(false,"setTag",(_valstr));
 };
 };
 BA.debugLineNum = 3380;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findprintersbt() throws Exception{
try {
		Debug.PushSubsStack("FindPrintersBT (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3124);
if (RapidSub.canDelegate("findprintersbt")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","findprintersbt");}
 BA.debugLineNum = 3124;BA.debugLine="Sub FindPrintersBT";
Debug.ShouldStop(524288);
 BA.debugLineNum = 3125;BA.debugLine="Printer.SearchNewPrinter";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._printer.runVoidMethod ("_vvvv5");
 BA.debugLineNum = 3126;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _firstinstallcompleteprocedure(RemoteObject _reinstall) throws Exception{
try {
		Debug.PushSubsStack("FirstInstallCompleteProcedure (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2352);
if (RapidSub.canDelegate("firstinstallcompleteprocedure")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","firstinstallcompleteprocedure", _reinstall);}
ResumableSub_FirstInstallCompleteProcedure rsub = new ResumableSub_FirstInstallCompleteProcedure(null,_reinstall);
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
public ResumableSub_FirstInstallCompleteProcedure(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _reinstall) {
this.parent = parent;
this._reinstall = _reinstall;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _reinstall;
RemoteObject _totallinesofscripts = RemoteObject.createImmutable(0);
RemoteObject _exceptionerror = RemoteObject.createImmutable("");
RemoteObject _first_install_info = RemoteObject.createImmutable("");
RemoteObject _firstinstallfilesname = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _jsonstruct = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datahora = RemoteObject.createImmutable("");
RemoteObject _sqlfilestotal = RemoteObject.createImmutable(0);
RemoteObject _inserts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _trycount = RemoteObject.createImmutable(0);
RemoteObject _dotry = RemoteObject.createImmutable(false);
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _ctm = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _testejson = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _msgfatal = RemoteObject.createImmutable("");
int _n = 0;
RemoteObject _script2execute = RemoteObject.createImmutable("");
RemoteObject _ftpinternolist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totaltemplates = RemoteObject.createImmutable(0);
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _fname2 = RemoteObject.createImmutable("");
int step154;
int limit154;
int step185;
int limit185;
int step204;
int limit204;
int step240;
int limit240;
int step251;
int limit251;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FirstInstallCompleteProcedure (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2352);
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
Debug.locals.put("Reinstall", _reinstall);
 BA.debugLineNum = 2357;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(1048576);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2358;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(2097152);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2359;BA.debugLine="StopService(BackgroundUpdateService)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 2360;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 2362;BA.debugLine="LabelTarefa.Visible = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._labeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2363;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(67108864);
_updateprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2364;BA.debugLine="UpdateProgressBar2(100,0)";
Debug.ShouldStop(134217728);
_updateprogressbar2(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2365;BA.debugLine="Dim TotalLinesOfScripts As Int = 0";
Debug.ShouldStop(268435456);
_totallinesofscripts = BA.numberCast(int.class, 0);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 BA.debugLineNum = 2366;BA.debugLine="Private ExceptionError As String = \"\"";
Debug.ShouldStop(536870912);
_exceptionerror = BA.ObjectToString("");Debug.locals.put("ExceptionError", _exceptionerror);Debug.locals.put("ExceptionError", _exceptionerror);
 BA.debugLineNum = 2375;BA.debugLine="PanelFirstInstallConfig.Visible = True";
Debug.ShouldStop(64);
parent.mostCurrent._panelfirstinstallconfig.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2378;BA.debugLine="ShareCode.AwakeDevice(True)";
Debug.ShouldStop(512);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2380;BA.debugLine="If ShareCode.IsDevelopment Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._sharecode._isdevelopment /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2381;BA.debugLine="ShareCode.APP_FTP_USER = \"DevEvolutionCheck\"";
Debug.ShouldStop(4096);
parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/  = BA.ObjectToString("DevEvolutionCheck");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2383;BA.debugLine="ShareCode.APP_FTP_USER = \"EvolutionCheck\"";
Debug.ShouldStop(16384);
parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/  = BA.ObjectToString("EvolutionCheck");
 if (true) break;
;
 BA.debugLineNum = 2387;BA.debugLine="Try";
Debug.ShouldStop(262144);

case 6:
//try
this.state = 185;
this.catchState = 184;
this.state = 8;
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 184;
 BA.debugLineNum = 2388;BA.debugLine="LabelDownloadInicialTitle.Text = ShareCode.MsgUp";
Debug.ShouldStop(524288);
parent.mostCurrent._labeldownloadinicialtitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlepasso1primeirainstalacao /*RemoteObject*/ ));
 BA.debugLineNum = 2390;BA.debugLine="Dim FIRST_INSTALL_INFO As String = \"FIRSTINSTALL";
Debug.ShouldStop(2097152);
_first_install_info = BA.ObjectToString("FIRSTINSTALL.INFO");Debug.locals.put("FIRST_INSTALL_INFO", _first_install_info);Debug.locals.put("FIRST_INSTALL_INFO", _first_install_info);
 BA.debugLineNum = 2391;BA.debugLine="Dim firstInstallFilesName As String = \"FIRSTINST";
Debug.ShouldStop(4194304);
_firstinstallfilesname = BA.ObjectToString("FIRSTINSTALL");Debug.locals.put("firstInstallFilesName", _firstinstallfilesname);Debug.locals.put("firstInstallFilesName", _firstinstallfilesname);
 BA.debugLineNum = 2393;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstInstallComplete";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("FirstInstallCompleteProc")),(Object)((RemoteObject.createImmutable("DOWNLOAD MESTRES"))));
 BA.debugLineNum = 2400;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTAL";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//if
this.state = 16;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FIRSTINSTALL_IN_PROGRESS"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2403;BA.debugLine="Msgbox2Async($\"O sistema detectou uma instalaçã";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("O sistema detectou uma instalação anterior incompleta !"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("A instalação vai Reiniciar."))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),mainmenu.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2404;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"), null);
this.state = 186;
return;
case 186:
//C
this.state = 12;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2405;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 2411;BA.debugLine="File.writestring(Starter.SharedFolder,\"FIRSTINST";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("FIRSTINSTALL_IN_PROGRESS")),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA)));
 BA.debugLineNum = 2415;BA.debugLine="If File.Exists(Starter.SharedFolder, FIRST_INSTA";
Debug.ShouldStop(16384);
if (true) break;

case 17:
//if
this.state = 113;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_first_install_info))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_reinstall)))) { 
this.state = 19;
}else {
this.state = 47;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2416;BA.debugLine="Log(\"FIRSTINSTALL JA EXISTE\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180544",RemoteObject.createImmutable("FIRSTINSTALL JA EXISTE"),0);
 BA.debugLineNum = 2419;BA.debugLine="Starter.LocalSQLEVC.Close";
Debug.ShouldStop(262144);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 2420;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolution";
Debug.ShouldStop(524288);
if (true) break;

case 20:
//if
this.state = 23;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))).<Boolean>get().booleanValue()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2421;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionch";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 2423;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"),BA.numberCast(int.class, 250));
this.state = 187;
return;
case 187:
//C
this.state = 24;
;
 BA.debugLineNum = 2425;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evolu";
Debug.ShouldStop(16777216);
if (true) break;

case 24:
//if
this.state = 27;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))))).<Boolean>get().booleanValue()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2426;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\"";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 2428;BA.debugLine="Sleep(250)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"),BA.numberCast(int.class, 250));
this.state = 188;
return;
case 188:
//C
this.state = 28;
;
 BA.debugLineNum = 2430;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 28:
//if
this.state = 33;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 2431;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"),BA.numberCast(int.class, 100));
this.state = 189;
return;
case 189:
//C
this.state = 34;
;
 BA.debugLineNum = 2434;BA.debugLine="Dim JsonStruct As String = File.readstring(Star";
Debug.ShouldStop(2);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 2435;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2436;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 2437;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(16);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2438;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
Debug.ShouldStop(32);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 2439;BA.debugLine="File.writeString(Starter.SharedFolder,$\"date_in";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))),(Object)(_datahora));
 BA.debugLineNum = 2440;BA.debugLine="ShareCode.Installed_Date = DataHora";
Debug.ShouldStop(128);
parent.mostCurrent._sharecode._installed_date /*RemoteObject*/  = _datahora;
 BA.debugLineNum = 2441;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Sha";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log")))),(Object)(_datahora));
 BA.debugLineNum = 2442;BA.debugLine="Dim SqlFilesTotal As Int = root.Get(\"files\")";
Debug.ShouldStop(512);
_sqlfilestotal = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("SqlFilesTotal", _sqlfilestotal);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2443;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(1024);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 2444;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(2048);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2445;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(4096);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2446;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(8192);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2448;BA.debugLine="If SqlFilesTotal = 0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 34:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_sqlfilestotal,BA.numberCast(double.class, 0))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 2450;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_ins";
Debug.ShouldStop(131072);
if (true) break;

case 37:
//if
this.state = 40;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log")))).<Boolean>get().booleanValue()) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2451;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_insta";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))));
 BA.debugLineNum = 2452;BA.debugLine="ShareCode.Installed_Date = \"\"";
Debug.ShouldStop(524288);
parent.mostCurrent._sharecode._installed_date /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 2455;BA.debugLine="Msgbox2Async($\"UM OU MAIS FICHEIROS DE INSTALA";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!"))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),mainmenu.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2456;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"), null);
this.state = 190;
return;
case 190:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2457;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (true) break;

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 2458;BA.debugLine="ExitApplication";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 113;
;
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 2462;BA.debugLine="Log(\"FIRSTINSTALL NAO EXISTE\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180590",RemoteObject.createImmutable("FIRSTINSTALL NAO EXISTE"),0);
 BA.debugLineNum = 2466;BA.debugLine="Dim SqlFilesTotal As Int = 0";
Debug.ShouldStop(2);
_sqlfilestotal = BA.numberCast(int.class, 0);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2467;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(4);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2468;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(8);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2469;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(16);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2471;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_";
Debug.ShouldStop(64);
_globalftp.runVoidMethod ("Initialize",mainmenu.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2472;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(128);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2473;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(256);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 2474;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(512);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 2475;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(1024);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 2476;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(2048);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2477;BA.debugLine="Do While (dotry And (trycount <3))";
Debug.ShouldStop(4096);
if (true) break;

case 48:
//do while
this.state = 75;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 50;
if (true) break;
}
if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 2479;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(16384);
_sf = _globalftp.runMethod(false,"DownloadFile",mainmenu.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_first_install_info)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2480;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"), _sf);
this.state = 191;
return;
case 191:
//C
this.state = 51;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2482;BA.debugLine="If Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 51:
//if
this.state = 74;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 53;
}else {
this.state = 73;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 2484;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 54:
//try
this.state = 71;
this.catchState = 70;
this.state = 56;
if (true) break;

case 56:
//C
this.state = 57;
this.catchState = 70;
 BA.debugLineNum = 2485;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.M";
Debug.ShouldStop(1048576);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*RemoteObject*/ ));
 BA.debugLineNum = 2487;BA.debugLine="Log(FIRST_INSTALL_INFO & \" file was download";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180615",RemoteObject.concat(_first_install_info,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 2494;BA.debugLine="Dim TesteJson As String = File.readstring(St";
Debug.ShouldStop(536870912);
_testejson = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("TesteJson", _testejson);Debug.locals.put("TesteJson", _testejson);
 BA.debugLineNum = 2496;BA.debugLine="If ShareCode.newReturn = 1 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 57:
//if
this.state = 68;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 59;
}else {
this.state = 67;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 2497;BA.debugLine="If TesteJson.Contains(\"{\") Then";
Debug.ShouldStop(1);
if (true) break;

case 60:
//if
this.state = 65;
if (_testejson.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("{"))).<Boolean>get().booleanValue()) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 65;
 BA.debugLineNum = 2498;BA.debugLine="Dim JsonStruct As String = File.readstring";
Debug.ShouldStop(2);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 2499;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2500;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 2501;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(16);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2502;BA.debugLine="Dim DataHora As String = root.Get(\"datetim";
Debug.ShouldStop(32);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 2503;BA.debugLine="File.writeString(Starter.SharedFolder,$\"da";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))),(Object)(_datahora));
 BA.debugLineNum = 2504;BA.debugLine="File.writeString(Starter.InternalFolder,$\"";
Debug.ShouldStop(128);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log")))),(Object)(_datahora));
 BA.debugLineNum = 2505;BA.debugLine="Dim SqlFilesTotal As Int = root.Get(\"files";
Debug.ShouldStop(256);
_sqlfilestotal = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("SqlFilesTotal", _sqlfilestotal);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2506;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(512);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 2507;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(1024);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2508;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2509;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date";
Debug.ShouldStop(4096);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2510;BA.debugLine="dotry = False";
Debug.ShouldStop(8192);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2511;BA.debugLine="trycount = 3";
Debug.ShouldStop(16384);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2512;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(32768);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 2514;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(131072);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2515;BA.debugLine="List1 = File.ReadList(Starter.Provider.Sha";
Debug.ShouldStop(262144);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2516;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de f";
Debug.ShouldStop(524288);
_sqlfilestotal = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2517;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(1048576);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2518;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2519;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date";
Debug.ShouldStop(4194304);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2520;BA.debugLine="dotry = False";
Debug.ShouldStop(8388608);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2521;BA.debugLine="trycount = 3";
Debug.ShouldStop(16777216);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2522;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(33554432);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 65:
//C
this.state = 68;
;
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 2526;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(536870912);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2527;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shar";
Debug.ShouldStop(1073741824);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2528;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de fi";
Debug.ShouldStop(-2147483648);
_sqlfilestotal = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2529;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(1);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2530;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2531;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(4);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2532;BA.debugLine="dotry = False";
Debug.ShouldStop(8);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2533;BA.debugLine="trycount = 3";
Debug.ShouldStop(16);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2534;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(32);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 68:
//C
this.state = 71;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 70:
//C
this.state = 71;
this.catchState = 184;
 BA.debugLineNum = 2538;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180666",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2539;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(1024);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;
if (true) break;

case 71:
//C
this.state = 74;
this.catchState = 184;
;
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 2542;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180670",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2543;BA.debugLine="Log(\"Error downloading file \" & FIRST_INSTALL";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180671",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_first_install_info),0);
 BA.debugLineNum = 2544;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(32768);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2545;BA.debugLine="ExceptionError = LastException";
Debug.ShouldStop(65536);
_exceptionerror = BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA));Debug.locals.put("ExceptionError", _exceptionerror);
 if (true) break;

case 74:
//C
this.state = 48;
;
 if (true) break;

case 75:
//C
this.state = 76;
;
 BA.debugLineNum = 2548;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(524288);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2550;BA.debugLine="If SqlFilesTotal = 0 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 76:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",_sqlfilestotal,BA.numberCast(double.class, 0))) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 2552;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_ins";
Debug.ShouldStop(8388608);
if (true) break;

case 79:
//if
this.state = 82;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log")))).<Boolean>get().booleanValue()) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 2553;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_insta";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))));
 BA.debugLineNum = 2554;BA.debugLine="ShareCode.Installed_Date = \"\"";
Debug.ShouldStop(33554432);
parent.mostCurrent._sharecode._installed_date /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 82:
//C
this.state = 83;
;
 BA.debugLineNum = 2557;BA.debugLine="Msgbox2Async($\"UM OU MAIS FICHEIROS DE INSTALA";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!"))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),mainmenu.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2558;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"), null);
this.state = 192;
return;
case 192:
//C
this.state = 83;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2559;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 83:
//if
this.state = 86;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 85;
}if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 2560;BA.debugLine="ExitApplication";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;
;
 BA.debugLineNum = 2569;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(256);

case 87:
//if
this.state = 112;
if ((RemoteObject.solveBoolean(">",_sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 2570;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
Debug.ShouldStop(512);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ));
 BA.debugLineNum = 2572;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(2048);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2573;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL";
Debug.ShouldStop(4096);
_globalftp.runVoidMethod ("Initialize",mainmenu.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2574;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(8192);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2576;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(32768);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2578;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(131072);
if (true) break;

case 90:
//for
this.state = 111;
step154 = 1;
limit154 = _sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 193;
if (true) break;

case 193:
//C
this.state = 111;
if ((step154 > 0 && _i <= limit154) || (step154 < 0 && _i >= limit154)) this.state = 92;
if (true) break;

case 194:
//C
this.state = 193;
_i = ((int)(0 + _i + step154)) ;
Debug.locals.put("i", _i);
if (true) break;

case 92:
//C
this.state = 93;
 BA.debugLineNum = 2579;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Ms";
Debug.ShouldStop(262144);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2580;BA.debugLine="Dim fileN As String = $\"${firstInstallFilesNa";
Debug.ShouldStop(524288);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_firstinstallfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 2582;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder,";
Debug.ShouldStop(2097152);
if (true) break;

case 93:
//if
this.state = 96;
if ((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen))).<Boolean>get().booleanValue()) { 
this.state = 95;
}if (true) break;

case 95:
//C
this.state = 96;
 BA.debugLineNum = 2583;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, f";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));
 if (true) break;

case 96:
//C
this.state = 97;
;
 BA.debugLineNum = 2588;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(134217728);
_sf = _globalftp.runMethod(false,"DownloadFile",mainmenu.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filen)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2589;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"), _sf);
this.state = 195;
return;
case 195:
//C
this.state = 97;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2591;BA.debugLine="If Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 97:
//if
this.state = 110;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 99;
}else {
this.state = 101;
}if (true) break;

case 99:
//C
this.state = 110;
 BA.debugLineNum = 2592;BA.debugLine="Log(fileN & \" file was download successfully";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180720",RemoteObject.concat(_filen,RemoteObject.createImmutable(" file was download successfully")),0);
 if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 2594;BA.debugLine="Log(\"Error downloading file \" & fileN)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180722",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filen),0);
 BA.debugLineNum = 2596;BA.debugLine="Dim MsgFatal As String = $\"Ocorreu um Erro a";
Debug.ShouldStop(8);
_msgfatal = (RemoteObject.concat(RemoteObject.createImmutable("Ocorreu um Erro ao descarregar um dos ficheiros mestres."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Ficheiro FIRSTINTALL"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".SQL"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("A aplicação vai terminar !"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Por favor verifique o acesso à internet e reinstale a aplicação, depois de desinstalar a actual !")));Debug.locals.put("MsgFatal", _msgfatal);Debug.locals.put("MsgFatal", _msgfatal);
 BA.debugLineNum = 2597;BA.debugLine="Msgbox2Async(MsgFatal, ShareCode.GeneralAler";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_msgfatal)),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),mainmenu.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2599;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_i";
Debug.ShouldStop(64);
if (true) break;

case 102:
//if
this.state = 105;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log")))).<Boolean>get().booleanValue()) { 
this.state = 104;
}if (true) break;

case 104:
//C
this.state = 105;
 BA.debugLineNum = 2600;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_ins";
Debug.ShouldStop(128);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))));
 BA.debugLineNum = 2601;BA.debugLine="ShareCode.Installed_Date = \"\"";
Debug.ShouldStop(256);
parent.mostCurrent._sharecode._installed_date /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 105:
//C
this.state = 106;
;
 BA.debugLineNum = 2604;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"), null);
this.state = 196;
return;
case 196:
//C
this.state = 106;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2606;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8192);
if (true) break;

case 106:
//if
this.state = 109;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 108;
}if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 2607;BA.debugLine="ExitApplication";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 109:
//C
this.state = 110;
;
 if (true) break;

case 110:
//C
this.state = 194;
;
 BA.debugLineNum = 2612;BA.debugLine="UpdateProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(524288);
_updateprogressbar(_sqlfilestotal,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 111:
//C
this.state = 112;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2615;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(4194304);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 112:
//C
this.state = 113;
;
 BA.debugLineNum = 2620;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(134217728);
_updateprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2621;BA.debugLine="Sleep(500)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"),BA.numberCast(int.class, 500));
this.state = 197;
return;
case 197:
//C
this.state = 113;
;
 if (true) break;
;
 BA.debugLineNum = 2628;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(8);

case 113:
//if
this.state = 135;
if ((RemoteObject.solveBoolean(">",_sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 115;
}if (true) break;

case 115:
//C
this.state = 116;
 BA.debugLineNum = 2630;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(32);
if (true) break;

case 116:
//for
this.state = 134;
step185 = 1;
limit185 = _sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 198;
if (true) break;

case 198:
//C
this.state = 134;
if ((step185 > 0 && _i <= limit185) || (step185 < 0 && _i >= limit185)) this.state = 118;
if (true) break;

case 199:
//C
this.state = 198;
_i = ((int)(0 + _i + step185)) ;
Debug.locals.put("i", _i);
if (true) break;

case 118:
//C
this.state = 119;
 BA.debugLineNum = 2631;BA.debugLine="TotalLinesOfScripts = 0";
Debug.ShouldStop(64);
_totallinesofscripts = BA.numberCast(int.class, 0);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 BA.debugLineNum = 2632;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
Debug.ShouldStop(128);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2633;BA.debugLine="Dim fileN As String = $\"${firstInstallFilesNam";
Debug.ShouldStop(256);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_firstinstallfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 2635;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(1024);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2637;BA.debugLine="If (List1.IsInitialized) Then";
Debug.ShouldStop(4096);
if (true) break;

case 119:
//if
this.state = 124;
if ((_list1.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 121;
}else {
this.state = 123;
}if (true) break;

case 121:
//C
this.state = 124;
 BA.debugLineNum = 2638;BA.debugLine="List1.Clear";
Debug.ShouldStop(8192);
_list1.runVoidMethod ("Clear");
 if (true) break;

case 123:
//C
this.state = 124;
 BA.debugLineNum = 2640;BA.debugLine="List1.Initialize";
Debug.ShouldStop(32768);
_list1.runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 2643;BA.debugLine="Try";
Debug.ShouldStop(262144);

case 124:
//try
this.state = 129;
this.catchState = 128;
this.state = 126;
if (true) break;

case 126:
//C
this.state = 129;
this.catchState = 128;
 BA.debugLineNum = 2644;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
Debug.ShouldStop(524288);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2645;BA.debugLine="TotalLinesOfScripts = List1.Size";
Debug.ShouldStop(1048576);
_totallinesofscripts = _list1.runMethod(true,"getSize");Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 Debug.CheckDeviceExceptions();
if (true) break;

case 128:
//C
this.state = 129;
this.catchState = 184;
 BA.debugLineNum = 2647;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180775",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 129:
//C
this.state = 130;
this.catchState = 184;
;
 BA.debugLineNum = 2650;BA.debugLine="UpdateProgressBar2(100,0)";
Debug.ShouldStop(33554432);
_updateprogressbar2(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2651;BA.debugLine="ProgressoInicial2.visible = True";
Debug.ShouldStop(67108864);
parent.mostCurrent._progressoinicial2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2652;BA.debugLine="LabelTarefa.Visible = True";
Debug.ShouldStop(134217728);
parent.mostCurrent._labeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2653;BA.debugLine="For n = 0 To List1.Size -1";
Debug.ShouldStop(268435456);
if (true) break;

case 130:
//for
this.state = 133;
step204 = 1;
limit204 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 200;
if (true) break;

case 200:
//C
this.state = 133;
if ((step204 > 0 && _n <= limit204) || (step204 < 0 && _n >= limit204)) this.state = 132;
if (true) break;

case 201:
//C
this.state = 200;
_n = ((int)(0 + _n + step204)) ;
Debug.locals.put("n", _n);
if (true) break;

case 132:
//C
this.state = 201;
 BA.debugLineNum = 2654;BA.debugLine="LabelTarefa.Text = ShareCode.MsgExecProcAct &";
Debug.ShouldStop(536870912);
parent.mostCurrent._labeltarefa.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgexecprocact /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totallinesofscripts))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2655;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
Debug.ShouldStop(1073741824);
_script2execute = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("Script2Execute", _script2execute);Debug.locals.put("Script2Execute", _script2execute);
 BA.debugLineNum = 2656;BA.debugLine="Utils.SaveSQLToLog(\"Main\",Script2Execute, \"\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(_script2execute),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2657;BA.debugLine="UpdateProgressBar2(TotalLinesOfScripts,n)";
Debug.ShouldStop(1);
_updateprogressbar2(_totallinesofscripts,BA.numberCast(int.class, _n));
 BA.debugLineNum = 2658;BA.debugLine="Sleep(1)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"),BA.numberCast(int.class, 1));
this.state = 202;
return;
case 202:
//C
this.state = 201;
;
 if (true) break;
if (true) break;

case 133:
//C
this.state = 199;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2661;BA.debugLine="ProgressoInicial2.visible = False";
Debug.ShouldStop(16);
parent.mostCurrent._progressoinicial2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2662;BA.debugLine="LabelTarefa.Visible = False";
Debug.ShouldStop(32);
parent.mostCurrent._labeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2663;BA.debugLine="UpdateProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(64);
_updateprogressbar(_sqlfilestotal,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2664;BA.debugLine="Sleep(1)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"),BA.numberCast(int.class, 1));
this.state = 203;
return;
case 203:
//C
this.state = 199;
;
 if (true) break;
if (true) break;

case 134:
//C
this.state = 135;
Debug.locals.put("i", _i);
;
 if (true) break;

case 135:
//C
this.state = 136;
;
 BA.debugLineNum = 2669;BA.debugLine="UpdateProgressBar2(100,0)";
Debug.ShouldStop(4096);
_updateprogressbar2(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2670;BA.debugLine="ProgressoInicial2.visible = False";
Debug.ShouldStop(8192);
parent.mostCurrent._progressoinicial2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2671;BA.debugLine="LabelTarefa.Visible = False";
Debug.ShouldStop(16384);
parent.mostCurrent._labeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2672;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(32768);
_updateprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2682;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTAL";
Debug.ShouldStop(33554432);
if (true) break;

case 136:
//if
this.state = 139;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FIRSTINSTALL_IN_PROGRESS"))).<Boolean>get().booleanValue()) { 
this.state = 138;
}if (true) break;

case 138:
//C
this.state = 139;
 BA.debugLineNum = 2683;BA.debugLine="File.Delete(Starter.SharedFolder,\"FIRSTINSTALL_";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FIRSTINSTALL_IN_PROGRESS")));
 if (true) break;

case 139:
//C
this.state = 140;
;
 BA.debugLineNum = 2828;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180956",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2829;BA.debugLine="Log(\"/interno\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180957",RemoteObject.createImmutable("/interno"),0);
 BA.debugLineNum = 2830;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180958",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2831;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(16384);
_updateprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2832;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUp";
Debug.ShouldStop(32768);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 2833;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(65536);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2834;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(131072);
_globalftp.runVoidMethod ("Initialize",mainmenu.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2835;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(262144);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2836;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(524288);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2837;BA.debugLine="Dim FTPINTERNOLIST As List";
Debug.ShouldStop(1048576);
_ftpinternolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPINTERNOLIST", _ftpinternolist);
 BA.debugLineNum = 2838;BA.debugLine="Dim TotalTemplates As Int = 0";
Debug.ShouldStop(2097152);
_totaltemplates = BA.numberCast(int.class, 0);Debug.locals.put("TotalTemplates", _totaltemplates);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 2840;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/interno/\")";
Debug.ShouldStop(8388608);
_sfl = _globalftp.runMethod(false,"List",mainmenu.processBA,(Object)(RemoteObject.createImmutable("/interno/")));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 2841;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"), _sfl);
this.state = 204;
return;
case 204:
//C
this.state = 140;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 2842;BA.debugLine="If Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 140:
//if
this.state = 153;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 142;
}else {
this.state = 152;
}if (true) break;

case 142:
//C
this.state = 143;
 BA.debugLineNum = 2844;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 143:
//if
this.state = 150;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 145;
}if (true) break;

case 145:
//C
this.state = 146;
 BA.debugLineNum = 2845;BA.debugLine="FTPINTERNOLIST.Initialize";
Debug.ShouldStop(268435456);
_ftpinternolist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2846;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(536870912);
if (true) break;

case 146:
//for
this.state = 149;
step240 = 1;
limit240 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 205;
if (true) break;

case 205:
//C
this.state = 149;
if ((step240 > 0 && _i <= limit240) || (step240 < 0 && _i >= limit240)) this.state = 148;
if (true) break;

case 206:
//C
this.state = 205;
_i = ((int)(0 + _i + step240)) ;
Debug.locals.put("i", _i);
if (true) break;

case 148:
//C
this.state = 206;
 BA.debugLineNum = 2847;BA.debugLine="Dim fName2 As String = files(i).Name";
Debug.ShouldStop(1073741824);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2848;BA.debugLine="FTPINTERNOLIST.Add(files(i).Name)";
Debug.ShouldStop(-2147483648);
_ftpinternolist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;
if (true) break;

case 149:
//C
this.state = 150;
Debug.locals.put("i", _i);
;
 if (true) break;

case 150:
//C
this.state = 153;
;
 if (true) break;

case 152:
//C
this.state = 153;
 BA.debugLineNum = 2852;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallComplete";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("FirstIntallCompleteProcedure")),(Object)(RemoteObject.createImmutable("error getting files list from /interno/")));
 if (true) break;
;
 BA.debugLineNum = 2855;BA.debugLine="If (FTPINTERNOLIST.IsInitialized) Then";
Debug.ShouldStop(64);

case 153:
//if
this.state = 176;
if ((_ftpinternolist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 2856;BA.debugLine="If (FTPINTERNOLIST.Size>=1) Then";
Debug.ShouldStop(128);
if (true) break;

case 156:
//if
this.state = 175;
if ((RemoteObject.solveBoolean("g",_ftpinternolist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 158;
}if (true) break;

case 158:
//C
this.state = 159;
 BA.debugLineNum = 2857;BA.debugLine="TotalTemplates = FTPINTERNOLIST.Size-1";
Debug.ShouldStop(256);
_totaltemplates = RemoteObject.solve(new RemoteObject[] {_ftpinternolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 2858;BA.debugLine="For i=0 To FTPINTERNOLIST.Size-1";
Debug.ShouldStop(512);
if (true) break;

case 159:
//for
this.state = 174;
step251 = 1;
limit251 = RemoteObject.solve(new RemoteObject[] {_ftpinternolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 207;
if (true) break;

case 207:
//C
this.state = 174;
if ((step251 > 0 && _i <= limit251) || (step251 < 0 && _i >= limit251)) this.state = 161;
if (true) break;

case 208:
//C
this.state = 207;
_i = ((int)(0 + _i + step251)) ;
Debug.locals.put("i", _i);
if (true) break;

case 161:
//C
this.state = 162;
 BA.debugLineNum = 2859;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Ms";
Debug.ShouldStop(1024);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/interno/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaltemplates))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2860;BA.debugLine="Dim fName2 As String = FTPINTERNOLIST.Get(i)";
Debug.ShouldStop(2048);
_fname2 = BA.ObjectToString(_ftpinternolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2861;BA.debugLine="Log(fName2)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180989",_fname2,0);
 BA.debugLineNum = 2862;BA.debugLine="Try";
Debug.ShouldStop(8192);
if (true) break;

case 162:
//try
this.state = 173;
this.catchState = 172;
this.state = 164;
if (true) break;

case 164:
//C
this.state = 165;
this.catchState = 172;
 BA.debugLineNum = 2863;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(16384);
_sf = _globalftp.runMethod(false,"DownloadFile",mainmenu.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/interno/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2864;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "firstinstallcompleteprocedure"), _sf);
this.state = 209;
return;
case 209:
//C
this.state = 165;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2866;BA.debugLine="If Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 165:
//if
this.state = 170;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 167;
}else {
this.state = 169;
}if (true) break;

case 167:
//C
this.state = 170;
 BA.debugLineNum = 2867;BA.debugLine="Log(\"/interno/ : file was download successf";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180995",RemoteObject.createImmutable("/interno/ : file was download successfully"),0);
 if (true) break;

case 169:
//C
this.state = 170;
 BA.debugLineNum = 2870;BA.debugLine="Log(\"/interno/ : Error downloading file\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628180998",RemoteObject.createImmutable("/interno/ : Error downloading file"),0);
 if (true) break;

case 170:
//C
this.state = 173;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 172:
//C
this.state = 173;
this.catchState = 184;
 BA.debugLineNum = 2874;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628181002",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 173:
//C
this.state = 208;
this.catchState = 184;
;
 BA.debugLineNum = 2876;BA.debugLine="UpdateProgressBar(TotalTemplates,i)";
Debug.ShouldStop(134217728);
_updateprogressbar(_totaltemplates,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 174:
//C
this.state = 175;
Debug.locals.put("i", _i);
;
 if (true) break;

case 175:
//C
this.state = 176;
;
 if (true) break;

case 176:
//C
this.state = 177;
;
 BA.debugLineNum = 2880;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(-2147483648);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2888;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
Debug.ShouldStop(128);
if (true) break;

case 177:
//if
this.state = 182;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 179;
}else {
this.state = 181;
}if (true) break;

case 179:
//C
this.state = 182;
 BA.debugLineNum = 2889;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangu";
Debug.ShouldStop(256);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ ));
 if (true) break;

case 181:
//C
this.state = 182;
 BA.debugLineNum = 2891;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
Debug.ShouldStop(1024);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PT")));
 if (true) break;

case 182:
//C
this.state = 185;
;
 BA.debugLineNum = 2896;BA.debugLine="ShareCode.AwakeDevice(False)";
Debug.ShouldStop(32768);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2897;BA.debugLine="PanelFirstInstallConfig.Visible = False";
Debug.ShouldStop(65536);
parent.mostCurrent._panelfirstinstallconfig.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2898;BA.debugLine="Return True";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 184:
//C
this.state = 185;
this.catchState = 0;
 BA.debugLineNum = 2904;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(8388608);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2905;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 2906;BA.debugLine="StartService(BackgroundUpdateService)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartService",mainmenu.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 2908;BA.debugLine="Starter.FirstInstall = True";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._firstinstall /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2909;BA.debugLine="MsgboxAsync(LastException.Message, ShareCode.Gen";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA).runMethod(true,"getMessage"))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ )),mainmenu.processBA);
 BA.debugLineNum = 2910;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","628181038",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2913;BA.debugLine="ShareCode.AwakeDevice(False)";
Debug.ShouldStop(1);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2914;BA.debugLine="PanelFirstInstallConfig.Visible = False";
Debug.ShouldStop(2);
parent.mostCurrent._panelfirstinstallconfig.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2915;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 185:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 2917;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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
public static void  _ftp_downloadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static void  _ftp_listcompleted(RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) throws Exception{
}
public static void  _getbluetoothdeviceslistdialog(RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("GetBluetoothDevicesListDialog (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2963);
if (RapidSub.canDelegate("getbluetoothdeviceslistdialog")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","getbluetoothdeviceslistdialog", _title); return;}
ResumableSub_GetBluetoothDevicesListDialog rsub = new ResumableSub_GetBluetoothDevicesListDialog(null,_title);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetBluetoothDevicesListDialog extends BA.ResumableSub {
public ResumableSub_GetBluetoothDevicesListDialog(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _title) {
this.parent = parent;
this._title = _title;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _title;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetBluetoothDevicesListDialog (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2963);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("title", _title);
 BA.debugLineNum = 2966;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
Debug.ShouldStop(2097152);
_sf = parent.mostCurrent._appldialog.runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),mainmenu.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2968;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_sf),(Object)(parent.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent.mostCurrent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2969;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2970;BA.debugLine="ApplDialog.SetSize(80%x, 80%y)";
Debug.ShouldStop(33554432);
parent.mostCurrent._appldialog.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),mainmenu.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),mainmenu.mostCurrent.activityBA)));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2973;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(268435456);
parent.mostCurrent._currentcld = parent.mostCurrent._appldialog;
 BA.debugLineNum = 2974;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "getbluetoothdeviceslistdialog"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 2975;BA.debugLine="DialogPanel.LoadLayout(\"dialog_bluetooth_devices\"";
Debug.ShouldStop(1073741824);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_bluetooth_devices")),mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 2976;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.Label.T";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._listviewbluetoothdevices.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 2977;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.Label.T";
Debug.ShouldStop(1);
parent.mostCurrent._listviewbluetoothdevices.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 2978;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.ItemHei";
Debug.ShouldStop(2);
parent.mostCurrent._listviewbluetoothdevices.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 2980;BA.debugLine="ButtonAssociated.Color = Consts.ColorMain";
Debug.ShouldStop(8);
parent.mostCurrent._buttonassociated.runVoidMethod ("setColor",parent.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 2981;BA.debugLine="ButtonScanPrinter.Color = Consts.ColorMain";
Debug.ShouldStop(16);
parent.mostCurrent._buttonscanprinter.runVoidMethod ("setColor",parent.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 2982;BA.debugLine="ButtonPrint.Color = Consts.ColorMain";
Debug.ShouldStop(32);
parent.mostCurrent._buttonprint.runVoidMethod ("setColor",parent.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 2986;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_result", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "getbluetoothdeviceslistdialog"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2987;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1024);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 if (true) break;

case 9:
//C
this.state = 10;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 2994;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _dialog_ready(RemoteObject _dialogpanel) throws Exception{
}
public static void  _dialog_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Public BadgerItems As Badger";
mainmenu.mostCurrent._badgeritems = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.badger");
 //BA.debugLineNum = 29;BA.debugLine="Private mainBasePanel As Panel";
mainmenu.mostCurrent._mainbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private mainBottomPanel As Panel";
mainmenu.mostCurrent._mainbottompanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private mainButtonMenu As Button";
mainmenu.mostCurrent._mainbuttonmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private mainTopBar As Panel";
mainmenu.mostCurrent._maintopbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private mainBottomLine As Panel";
mainmenu.mostCurrent._mainbottomline = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private mainLogo As ImageView";
mainmenu.mostCurrent._mainlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private mainTopLine As Panel";
mainmenu.mostCurrent._maintopline = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private mainLabelInfo As Label";
mainmenu.mostCurrent._mainlabelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private panelOptions As Panel";
mainmenu.mostCurrent._paneloptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private butQuickAction As Button";
mainmenu.mostCurrent._butquickaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private butCallCamera As Button";
mainmenu.mostCurrent._butcallcamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private butCallActions As Button";
mainmenu.mostCurrent._butcallactions = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private LabelVersion As Label";
mainmenu.mostCurrent._labelversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private LabelDateTime As Label";
mainmenu.mostCurrent._labeldatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LabelAppInfo As Label";
mainmenu.mostCurrent._labelappinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LabelCopyright As Label";
mainmenu.mostCurrent._labelcopyright = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private DialogLogin As AppDialogs";
mainmenu.mostCurrent._dialoglogin = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");
 //BA.debugLineNum = 49;BA.debugLine="Private DialogAuthorization As AppDialogs";
mainmenu.mostCurrent._dialogauthorization = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");
 //BA.debugLineNum = 50;BA.debugLine="Private ButtonUserUnavailable As Button";
mainmenu.mostCurrent._buttonuserunavailable = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private AuthVersionsList As List";
mainmenu.mostCurrent._authversionslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 53;BA.debugLine="Private CPButtonTasks As Panel";
mainmenu.mostCurrent._cpbuttontasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private CPButtonRequests As Panel";
mainmenu.mostCurrent._cpbuttonrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private CPButtonObjects As Panel";
mainmenu.mostCurrent._cpbuttonobjects = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private CPButtonUser As Panel";
mainmenu.mostCurrent._cpbuttonuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private CPButtonKPI As Panel";
mainmenu.mostCurrent._cpbuttonkpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private CPButtonAlerts As Panel";
mainmenu.mostCurrent._cpbuttonalerts = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private MainPopMenu As MenuOnAnyView";
mainmenu.mostCurrent._mainpopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 61;BA.debugLine="Private MainPopMenuList As ListView";
mainmenu.mostCurrent._mainpopmenulist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Public LGO_PasswordMode As Boolean = True";
mainmenu._lgo_passwordmode = mainmenu.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 63;BA.debugLine="Private NetErrorTryCount As Int = 0";
mainmenu._neterrortrycount = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 65;BA.debugLine="Private CustomListView1 As CustomListView";
mainmenu.mostCurrent._customlistview1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 66;BA.debugLine="Private ButtonActionPause As Button";
mainmenu.mostCurrent._buttonactionpause = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private ButtonAppNetwork As Button";
mainmenu.mostCurrent._buttonappnetwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private ButtonAppLatency As Button";
mainmenu.mostCurrent._buttonapplatency = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private mainActiveUser As Label";
mainmenu.mostCurrent._mainactiveuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private mainLayout As String = \"\"";
mainmenu.mostCurrent._mainlayout = BA.ObjectToString("");
 //BA.debugLineNum = 73;BA.debugLine="Private LockPanel As Panel";
mainmenu.mostCurrent._lockpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private MainMenuTabStrip As TabStrip";
mainmenu.mostCurrent._mainmenutabstrip = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 75;BA.debugLine="Private butCallShort3 As Button";
mainmenu.mostCurrent._butcallshort3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private butCallShort2 As Button";
mainmenu.mostCurrent._butcallshort2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private butCallShort1 As Button";
mainmenu.mostCurrent._butcallshort1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private Printer As BT_Printer";
mainmenu.mostCurrent._printer = RemoteObject.createNew ("b4a.example.bt_printer");
 //BA.debugLineNum = 80;BA.debugLine="Private UpdateServiceTimer As Timer";
mainmenu.mostCurrent._updateservicetimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 81;BA.debugLine="Private LabelAvisoProcessamento As Label";
mainmenu.mostCurrent._labelavisoprocessamento = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private PanelFirstInstallConfig As Panel";
mainmenu.mostCurrent._panelfirstinstallconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private ProgressoInicial2 As ProgressBar";
mainmenu.mostCurrent._progressoinicial2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private LabelTarefa As Label";
mainmenu.mostCurrent._labeltarefa = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private ProgressoInicial As ProgressBar";
mainmenu.mostCurrent._progressoinicial = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private LabelDownloadInicialFases As Label";
mainmenu.mostCurrent._labeldownloadinicialfases = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private LabelDownloadInicialTitle As Label";
mainmenu.mostCurrent._labeldownloadinicialtitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private PanelDownloadInicial As Panel";
mainmenu.mostCurrent._paneldownloadinicial = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private DataSyncManual As AnotherDatePicker";
mainmenu.mostCurrent._datasyncmanual = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.anotherdatepicker");
 //BA.debugLineNum = 92;BA.debugLine="Private CurrentCLD As CustomLayoutDialog";
mainmenu.mostCurrent._currentcld = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
 //BA.debugLineNum = 93;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
mainmenu.mostCurrent._appldialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
 //BA.debugLineNum = 95;BA.debugLine="Private ButtonAssociated As Button";
mainmenu.mostCurrent._buttonassociated = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private ButtonScanPrinter As Button";
mainmenu.mostCurrent._buttonscanprinter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private ListViewBluetoothDevices As ListView";
mainmenu.mostCurrent._listviewbluetoothdevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private ButtonPrint As Button";
mainmenu.mostCurrent._buttonprint = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Private PrinterMessage As String";
mainmenu.mostCurrent._printermessage = RemoteObject.createImmutable("");
 //BA.debugLineNum = 100;BA.debugLine="Private CurrentPrinterConnected As Object";
mainmenu.mostCurrent._currentprinterconnected = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 101;BA.debugLine="Private butSearch As Button";
mainmenu.mostCurrent._butsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private EditSearch As EditText";
mainmenu.mostCurrent._editsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private SearchPanel As Panel";
mainmenu.mostCurrent._searchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private EditSearchSearch As EditText";
mainmenu.mostCurrent._editsearchsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private butSearchSearch As Button";
mainmenu.mostCurrent._butsearchsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private butSearchServer As Button";
mainmenu.mostCurrent._butsearchserver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private mainActiveUserSearch As Label";
mainmenu.mostCurrent._mainactiveusersearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Private mainLogoSearch As ImageView";
mainmenu.mostCurrent._mainlogosearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 110;BA.debugLine="Private ProgressSearch As ProgressBar";
mainmenu.mostCurrent._progresssearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private butActionSearch As Button";
mainmenu.mostCurrent._butactionsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private butCloseSearchPanel As Button";
mainmenu.mostCurrent._butclosesearchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private ExpandListSearch As CustomListView";
mainmenu.mostCurrent._expandlistsearch = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 114;BA.debugLine="Private RecordLinePanel As Panel";
mainmenu.mostCurrent._recordlinepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private RecordLineTitle As Label";
mainmenu.mostCurrent._recordlinetitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private RecordLineMoreOptions As Button";
mainmenu.mostCurrent._recordlinemoreoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private RecordLineTitleSecond As Label";
mainmenu.mostCurrent._recordlinetitlesecond = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private butSearchClear As Button";
mainmenu.mostCurrent._butsearchclear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _listsreturn(RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("ListsReturn (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1753);
if (RapidSub.canDelegate("listsreturn")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","listsreturn", _arg); return;}
ResumableSub_ListsReturn rsub = new ResumableSub_ListsReturn(null,_arg);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListsReturn extends BA.ResumableSub {
public ResumableSub_ListsReturn(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _arg) {
this.parent = parent;
this._arg = _arg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _arg;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListsReturn (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1753);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Arg", _arg);
 BA.debugLineNum = 1754;BA.debugLine="Sleep(500)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "listsreturn"),BA.numberCast(int.class, 500));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 1755;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = mainmenu.getObject();
 BA.debugLineNum = 1756;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(134217728);
_windowstatusupdate();
 BA.debugLineNum = 1757;BA.debugLine="BadgeCheckUpdate";
Debug.ShouldStop(268435456);
_badgecheckupdate();
 BA.debugLineNum = 1759;BA.debugLine="If (Arg = \"ImageEdit\") Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean("=",_arg,RemoteObject.createImmutable("ImageEdit")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1760;BA.debugLine="CallSub(ImageEdit, \"ForceClose\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",mainmenu.processBA,(Object)((parent.mostCurrent._imageedit.getObject())),(Object)(RemoteObject.createImmutable("ForceClose")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1762;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static RemoteObject  _listsreturnnoaction() throws Exception{
try {
		Debug.PushSubsStack("ListsReturnNoAction (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1823);
if (RapidSub.canDelegate("listsreturnnoaction")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","listsreturnnoaction");}
 BA.debugLineNum = 1823;BA.debugLine="Sub ListsReturnNoAction";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1824;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(-2147483648);
mainmenu.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = mainmenu.getObject();
 BA.debugLineNum = 1825;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(1);
_windowstatusupdate();
 BA.debugLineNum = 1826;BA.debugLine="BadgeCheckUpdate";
Debug.ShouldStop(2);
_badgecheckupdate();
 BA.debugLineNum = 1827;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listsreturnupdateserver(RemoteObject _url,RemoteObject _mappings) throws Exception{
try {
		Debug.PushSubsStack("ListsReturnUpdateServer (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1764);
if (RapidSub.canDelegate("listsreturnupdateserver")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","listsreturnupdateserver", _url, _mappings); return;}
ResumableSub_ListsReturnUpdateServer rsub = new ResumableSub_ListsReturnUpdateServer(null,_url,_mappings);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListsReturnUpdateServer extends BA.ResumableSub {
public ResumableSub_ListsReturnUpdateServer(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _url,RemoteObject _mappings) {
this.parent = parent;
this._url = _url;
this._mappings = _mappings;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _url;
RemoteObject _mappings;
RemoteObject _countuploadfiles = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _upl = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
RemoteObject _serverlocation = RemoteObject.createImmutable("");
int step4;
int limit4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListsReturnUpdateServer (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1764);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Url", _url);
Debug.locals.put("mappings", _mappings);
 BA.debugLineNum = 1765;BA.debugLine="ProgressDialogShow2(ShareCode.AvisoAguarde, False";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoaguarde /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1766;BA.debugLine="Sleep(100)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "listsreturnupdateserver"),BA.numberCast(int.class, 100));
this.state = 25;
return;
case 25:
//C
this.state = 1;
;
 BA.debugLineNum = 1767;BA.debugLine="Dim CountUploadFiles As Int = 0";
Debug.ShouldStop(64);
_countuploadfiles = BA.numberCast(int.class, 0);Debug.locals.put("CountUploadFiles", _countuploadfiles);Debug.locals.put("CountUploadFiles", _countuploadfiles);
 BA.debugLineNum = 1768;BA.debugLine="For i=0 To mappings.Size-1";
Debug.ShouldStop(128);
if (true) break;

case 1:
//for
this.state = 24;
step4 = 1;
limit4 = RemoteObject.solve(new RemoteObject[] {_mappings.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 26;
if (true) break;

case 26:
//C
this.state = 24;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 27:
//C
this.state = 26;
_i = ((int)(0 + _i + step4)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1769;BA.debugLine="Dim params As Map = mappings.Get(i)";
Debug.ShouldStop(256);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_params = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mappings.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("params", _params);
 BA.debugLineNum = 1770;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1771;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(mainmenu.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1773;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(4096);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1774;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 1776;BA.debugLine="Dim Filename As String = params.Get(\"imagename\")";
Debug.ShouldStop(32768);
_filename = BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imagename")))));Debug.locals.put("Filename", _filename);Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 1777;BA.debugLine="If Utils.NNE(Filename) Then";
Debug.ShouldStop(65536);
if (true) break;

case 10:
//if
this.state = 23;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1778;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 22;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1779;BA.debugLine="Dim upl  As ResumableSub = UploadFilesWithFTP(";
Debug.ShouldStop(262144);
_upl = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_upl = _uploadfileswithftp(_filename);Debug.locals.put("upl", _upl);Debug.locals.put("upl", _upl);
 BA.debugLineNum = 1780;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "listsreturnupdateserver"), _upl);
this.state = 28;
return;
case 28:
//C
this.state = 16;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 1781;BA.debugLine="If(finish = False)Then";
Debug.ShouldStop(1048576);
if (true) break;

case 16:
//if
this.state = 19;
if ((RemoteObject.solveBoolean("=",_finish,parent.mostCurrent.__c.getField(true,"False")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1782;BA.debugLine="CountUploadFiles = CountUploadFiles + 1";
Debug.ShouldStop(2097152);
_countuploadfiles = RemoteObject.solve(new RemoteObject[] {_countuploadfiles,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CountUploadFiles", _countuploadfiles);
 if (true) break;

case 19:
//C
this.state = 22;
;
 BA.debugLineNum = 1784;BA.debugLine="Sleep(500)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "listsreturnupdateserver"),BA.numberCast(int.class, 500));
this.state = 29;
return;
case 29:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1786;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.";
Debug.ShouldStop(33554432);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 1787;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(67108864);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1788;BA.debugLine="Utils.save2update(ServerLocation, Filename, 1,";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1792;BA.debugLine="Sleep(500)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "listsreturnupdateserver"),BA.numberCast(int.class, 500));
this.state = 30;
return;
case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 1793;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1794;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(2);
parent.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = mainmenu.getObject();
 BA.debugLineNum = 1795;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(4);
_windowstatusupdate();
 BA.debugLineNum = 1796;BA.debugLine="BadgeCheckUpdate";
Debug.ShouldStop(8);
_badgecheckupdate();
 BA.debugLineNum = 1797;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _listviewbluetoothdevices_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewBluetoothDevices_ItemClick (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3049);
if (RapidSub.canDelegate("listviewbluetoothdevices_itemclick")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","listviewbluetoothdevices_itemclick", _position, _value);}
int _n = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3049;BA.debugLine="Sub ListViewBluetoothDevices_ItemClick (Position A";
Debug.ShouldStop(256);
 BA.debugLineNum = 3050;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 3051;BA.debugLine="CurrentPrinterConnected = Value";
Debug.ShouldStop(1024);
mainmenu.mostCurrent._currentprinterconnected = _value;
 BA.debugLineNum = 3052;BA.debugLine="PrinterMessage = \"Impressora Conectada\"";
Debug.ShouldStop(2048);
mainmenu.mostCurrent._printermessage = BA.ObjectToString("Impressora Conectada");
 BA.debugLineNum = 3053;BA.debugLine="Printer.ClearBuffer";
Debug.ShouldStop(4096);
mainmenu.mostCurrent._printer.runVoidMethod ("_vvv3");
 BA.debugLineNum = 3055;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,\"xevol";
Debug.ShouldStop(16384);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mainmenu.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("xevolution_mono_logo.png"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3056;BA.debugLine="If File.Exists(Starter.AssetsFolder,\"xevolution";
Debug.ShouldStop(32768);
if (mainmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mainmenu.mostCurrent._starter._assetsfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("xevolution_mono_logo.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3057;BA.debugLine="File.Copy(Starter.AssetsFolder,\"xevolution_mon";
Debug.ShouldStop(65536);
mainmenu.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(mainmenu.mostCurrent._starter._assetsfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("xevolution_mono_logo.png")),(Object)(mainmenu.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("xevolution_mono_logo.png")));
 };
 };
 BA.debugLineNum = 3061;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 3062;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(Starter.Int";
Debug.ShouldStop(2097152);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_bitmap",(Object)(mainmenu.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(mainmenu.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("xevolution_mono_logo.png")))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3063;BA.debugLine="Printer.SendBufferToPrinter";
Debug.ShouldStop(4194304);
mainmenu.mostCurrent._printer.runVoidMethod ("_vvvv0");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e14.toString()); };
 BA.debugLineNum = 3070;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.BoldOn & \"XE";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.concat(mainmenu.mostCurrent._esc_pos.getField(true,"_vv1"),RemoteObject.createImmutable("XEVOLUTION LDA"),mainmenu.mostCurrent._esc_pos.getField(true,"_vv4"))));
 BA.debugLineNum = 3071;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.concat(mainmenu.mostCurrent._esc_pos.getField(true,"_fontb_normal"),RemoteObject.createImmutable("- VRCG -"),mainmenu.mostCurrent._esc_pos.getField(true,"_fonta_normal"))));
 BA.debugLineNum = 3072;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
Debug.ShouldStop(-2147483648);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_bitmap",(Object)(mainmenu.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(mainmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("barra_cinza.png")))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3073;BA.debugLine="For n=0 To 10";
Debug.ShouldStop(1);
{
final int step18 = 1;
final int limit18 = 10;
_n = 0 ;
for (;(step18 > 0 && _n <= limit18) || (step18 < 0 && _n >= limit18) ;_n = ((int)(0 + _n + step18))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 3074;BA.debugLine="Printer.AddBuffer_Writeline($\"Linha de Teste ${";
Debug.ShouldStop(2);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Linha de Teste "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 3078;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
Debug.ShouldStop(32);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_bitmap",(Object)(mainmenu.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(mainmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("barra_cinza.png")))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3079;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
Debug.ShouldStop(64);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3080;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
Debug.ShouldStop(128);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3081;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
Debug.ShouldStop(256);
mainmenu.mostCurrent._printer.runVoidMethod ("_addbuffer_bitmap",(Object)(mainmenu.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(mainmenu.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("barra_cinza.png")))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3082;BA.debugLine="Printer.SelectFromMac(Value)";
Debug.ShouldStop(512);
mainmenu.mostCurrent._printer.runVoidMethod ("_vvvv7",(Object)(BA.ObjectToString(_value)));
 BA.debugLineNum = 3083;BA.debugLine="File.WriteString(Starter.InternalFolder,$\"defult";
Debug.ShouldStop(1024);
mainmenu.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(mainmenu.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("defultprinter.set"))),(Object)(BA.ObjectToString(_value)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e28.toString()); BA.debugLineNum = 3085;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","628966948",BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 3087;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lockscreen(RemoteObject _nextsetp,RemoteObject _counter) throws Exception{
try {
		Debug.PushSubsStack("LockScreen (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,315);
if (RapidSub.canDelegate("lockscreen")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","lockscreen", _nextsetp, _counter);}
Debug.locals.put("nextSetp", _nextsetp);
Debug.locals.put("counter", _counter);
 BA.debugLineNum = 315;BA.debugLine="Sub LockScreen(nextSetp As Int, counter As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="LockPanel.Visible = False";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._lockpanel.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 317;BA.debugLine="ShareCode.MainLockPanel = LockPanel.Visible";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._sharecode._mainlockpanel /*RemoteObject*/  = mainmenu.mostCurrent._lockpanel.runMethod(true,"getVisible");
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainbuttonmenu_click() throws Exception{
try {
		Debug.PushSubsStack("mainButtonMenu_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,515);
if (RapidSub.canDelegate("mainbuttonmenu_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainbuttonmenu_click");}
 BA.debugLineNum = 515;BA.debugLine="Sub mainButtonMenu_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 516;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 517;BA.debugLine="If(MainPopMenu.MenuIsOpen) Then";
Debug.ShouldStop(16);
if ((mainmenu.mostCurrent._mainpopmenu.getField(true,"_menuisopen")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 518;BA.debugLine="MainPopMenu.CloseMenu";
Debug.ShouldStop(32);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_closemenu");
 }else {
 BA.debugLineNum = 520;BA.debugLine="MainPopMenu.OpenMenu";
Debug.ShouldStop(128);
mainmenu.mostCurrent._mainpopmenu.runVoidMethod ("_openmenu");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e8.toString()); BA.debugLineNum = 523;BA.debugLine="MainPopMenuList.Left = mainButtonMenu.Left - Mai";
Debug.ShouldStop(1024);
mainmenu.mostCurrent._mainpopmenulist.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {mainmenu.mostCurrent._mainbuttonmenu.runMethod(true,"getLeft"),mainmenu.mostCurrent._mainpopmenulist.runMethod(true,"getWidth"),mainmenu.mostCurrent._mainbuttonmenu.runMethod(true,"getWidth")}, "-+",2, 1));
 BA.debugLineNum = 524;BA.debugLine="MainPopMenuList.top = mainButtonMenu.top + mainB";
Debug.ShouldStop(2048);
mainmenu.mostCurrent._mainpopmenulist.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mainmenu.mostCurrent._mainbuttonmenu.runMethod(true,"getTop"),mainmenu.mostCurrent._mainbuttonmenu.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 525;BA.debugLine="If MainPopMenuList.Visible = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",mainmenu.mostCurrent._mainpopmenulist.runMethod(true,"getVisible"),mainmenu.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 526;BA.debugLine="MainPopMenuList.Visible = False";
Debug.ShouldStop(8192);
mainmenu.mostCurrent._mainpopmenulist.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 528;BA.debugLine="MainPopMenuList.Visible = True";
Debug.ShouldStop(32768);
mainmenu.mostCurrent._mainpopmenulist.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"True"));
 };
 };
 BA.debugLineNum = 531;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maindatavalidation_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainDataValidation_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1835);
if (RapidSub.canDelegate("maindatavalidation_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","maindatavalidation_click", _menuname);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1835;BA.debugLine="Sub MainDataValidation_Click(MenuName As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1836;BA.debugLine="Private this As AppDialogs";
Debug.ShouldStop(2048);
_this = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("this", _this);
 BA.debugLineNum = 1837;BA.debugLine="this.Initialize";
Debug.ShouldStop(4096);
_this.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 1838;BA.debugLine="this.GetDataInfoDialog(\"MainMenu\")";
Debug.ShouldStop(8192);
_this.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getdatainfodialog" /*void*/ ,(Object)((RemoteObject.createImmutable("MainMenu"))));
 BA.debugLineNum = 1839;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maindeviceinfopopmenu_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainDeviceInfoPopMenu_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2110);
if (RapidSub.canDelegate("maindeviceinfopopmenu_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","maindeviceinfopopmenu_click", _menuname);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 2110;BA.debugLine="Sub MainDeviceInfoPopMenu_Click(MenuName As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2112;BA.debugLine="Private this As AppDialogs";
Debug.ShouldStop(-2147483648);
_this = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("this", _this);
 BA.debugLineNum = 2113;BA.debugLine="this.Initialize";
Debug.ShouldStop(1);
_this.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 2114;BA.debugLine="this.GetDeviceInfoDialog(\"MainMenu\", Starter.DevI";
Debug.ShouldStop(2);
_this.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getdeviceinfodialog" /*void*/ ,(Object)(RemoteObject.createImmutable(("MainMenu"))),(Object)(mainmenu.mostCurrent._starter._devinfo /*RemoteObject*/ ));
 BA.debugLineNum = 2115;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maindeviceprint_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainDevicePrint_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2118);
if (RapidSub.canDelegate("maindeviceprint_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","maindeviceprint_click", _menuname);}
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 2118;BA.debugLine="Sub MainDevicePrint_Click(MenuName As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 2122;BA.debugLine="GetBluetoothDevicesListDialog(\"Escolha o Disposit";
Debug.ShouldStop(512);
_getbluetoothdeviceslistdialog(RemoteObject.createImmutable("Escolha o Dispositívo"));
 BA.debugLineNum = 2123;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainpopmenuchecklisttest_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuChecklistTest_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1848);
if (RapidSub.canDelegate("mainpopmenuchecklisttest_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainpopmenuchecklisttest_click", _menuname);}
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1848;BA.debugLine="Sub MainPopMenuChecklistTest_Click(MenuName As Str";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1849;BA.debugLine="Log(\"MainPopMenuChecklistTest\")";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","626214401",RemoteObject.createImmutable("MainPopMenuChecklistTest"),0);
 BA.debugLineNum = 1851;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainpopmenucompany_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuCompany_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1829);
if (RapidSub.canDelegate("mainpopmenucompany_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainpopmenucompany_click", _menuname);}
RemoteObject _filterparams = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1829;BA.debugLine="Sub MainPopMenuCompany_Click(MenuName As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1830;BA.debugLine="Dim FilterParams As AppDialogs";
Debug.ShouldStop(32);
_filterparams = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("FilterParams", _filterparams);
 BA.debugLineNum = 1831;BA.debugLine="FilterParams.Initialize";
Debug.ShouldStop(64);
_filterparams.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 1832;BA.debugLine="FilterParams.getDeviceParamsDialog(Activity, \"Mai";
Debug.ShouldStop(128);
_filterparams.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getdeviceparamsdialog" /*void*/ ,(Object)(mainmenu.mostCurrent._activity),(Object)(RemoteObject.createImmutable(("MainMenu"))),(Object)(_menuname));
 BA.debugLineNum = 1833;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mainpopmenuexit_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuExit_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2044);
if (RapidSub.canDelegate("mainpopmenuexit_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainpopmenuexit_click", _menuname); return;}
ResumableSub_MainPopMenuExit_Click rsub = new ResumableSub_MainPopMenuExit_Click(null,_menuname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MainPopMenuExit_Click extends BA.ResumableSub {
public ResumableSub_MainPopMenuExit_Click(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _menuname) {
this.parent = parent;
this._menuname = _menuname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _menuname;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuExit_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2044);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 2046;BA.debugLine="Msgbox2Async(ShareCode.mainlayoutAskSair, ShareCo";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainlayoutasksair /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),mainmenu.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2047;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainpopmenuexit_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2048;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2049;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_2\", Me)";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_2")),(Object)(mainmenu.getObject()));
 BA.debugLineNum = 2050;BA.debugLine="Sleep(250)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainpopmenuexit_click"),BA.numberCast(int.class, 250));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 BA.debugLineNum = 2052;BA.debugLine="DBUtils.ClearTable(Starter.LocalSQLWRK, \"loc_use";
Debug.ShouldStop(8);
parent.mostCurrent._dbutils.runVoidMethod ("_cleartable" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("loc_userssession")));
 BA.debugLineNum = 2053;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"LAST_";
Debug.ShouldStop(16);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("LAST_USER")),(Object)(parent.mostCurrent._sharecode._app_last_user /*RemoteObject*/ ));
 BA.debugLineNum = 2054;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(32);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 2056;BA.debugLine="Dim res As ResumableSub = CloseAllServicesFromMe";
Debug.ShouldStop(128);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _closeallservicesfrommenu();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2057;BA.debugLine="Wait For(res) Complete (finished As Boolean)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainpopmenuexit_click"), _res);
this.state = 7;
return;
case 7:
//C
this.state = 4;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 2059;BA.debugLine="CallSubDelayed(Main, \"ActivityFinish\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mainmenu.processBA,(Object)((parent.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("ActivityFinish")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2061;BA.debugLine="End Sub";
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
public static RemoteObject  _mainpopmenulist_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuList_ItemClick (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3393);
if (RapidSub.canDelegate("mainpopmenulist_itemclick")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainpopmenulist_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3393;BA.debugLine="Sub MainPopMenuList_ItemClick (Position As Int, Va";
Debug.ShouldStop(1);
 BA.debugLineNum = 3395;BA.debugLine="MainPopMenuList.Visible = False";
Debug.ShouldStop(4);
mainmenu.mostCurrent._mainpopmenulist.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3396;BA.debugLine="Select Case Value";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_value,RemoteObject.createImmutable(("MainPopMenuSync")),RemoteObject.createImmutable(("MainDataValidation")),RemoteObject.createImmutable(("MainPopMenuCompany")),RemoteObject.createImmutable(("MainPopMenuPushRequest")),RemoteObject.createImmutable(("MainPopMenuLoginChange")),RemoteObject.createImmutable(("MainDeviceInfoPopMenu")),RemoteObject.createImmutable(("MainUpdateAPK")),RemoteObject.createImmutable(("MainDevicePrint")),RemoteObject.createImmutable(("MainPopMenuExit")))) {
case 0: {
 BA.debugLineNum = 3398;BA.debugLine="MainPopMenuSync_Click(Value)";
Debug.ShouldStop(32);
_mainpopmenusync_click(BA.ObjectToString(_value));
 break; }
case 1: {
 BA.debugLineNum = 3400;BA.debugLine="MainDataValidation_Click(Value)";
Debug.ShouldStop(128);
_maindatavalidation_click(BA.ObjectToString(_value));
 break; }
case 2: {
 BA.debugLineNum = 3402;BA.debugLine="MainPopMenuCompany_Click(Value)";
Debug.ShouldStop(512);
_mainpopmenucompany_click(BA.ObjectToString(_value));
 break; }
case 3: {
 BA.debugLineNum = 3404;BA.debugLine="MainPopMenuPushRequest_Click(Value)";
Debug.ShouldStop(2048);
_mainpopmenupushrequest_click(BA.ObjectToString(_value));
 break; }
case 4: {
 BA.debugLineNum = 3406;BA.debugLine="MainPopMenuLoginChange_Click(Value)";
Debug.ShouldStop(8192);
_mainpopmenuloginchange_click(BA.ObjectToString(_value));
 break; }
case 5: {
 BA.debugLineNum = 3408;BA.debugLine="MainDeviceInfoPopMenu_Click(Value)";
Debug.ShouldStop(32768);
_maindeviceinfopopmenu_click(BA.ObjectToString(_value));
 break; }
case 6: {
 BA.debugLineNum = 3410;BA.debugLine="MainUpdateAPK_Click(Value)";
Debug.ShouldStop(131072);
_mainupdateapk_click(BA.ObjectToString(_value));
 break; }
case 7: {
 BA.debugLineNum = 3412;BA.debugLine="MainDevicePrint_Click(Value)";
Debug.ShouldStop(524288);
_maindeviceprint_click(BA.ObjectToString(_value));
 break; }
case 8: {
 BA.debugLineNum = 3414;BA.debugLine="MainPopMenuExit_Click(Value)";
Debug.ShouldStop(2097152);
_mainpopmenuexit_click(BA.ObjectToString(_value));
 break; }
}
;
 BA.debugLineNum = 3417;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mainpopmenuloginchange_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuLoginChange_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2087);
if (RapidSub.canDelegate("mainpopmenuloginchange_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainpopmenuloginchange_click", _menuname); return;}
ResumableSub_MainPopMenuLoginChange_Click rsub = new ResumableSub_MainPopMenuLoginChange_Click(null,_menuname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MainPopMenuLoginChange_Click extends BA.ResumableSub {
public ResumableSub_MainPopMenuLoginChange_Click(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _menuname) {
this.parent = parent;
this._menuname = _menuname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _menuname;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuLoginChange_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2087);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 2088;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_2\", Me)";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_2")),(Object)(mainmenu.getObject()));
 BA.debugLineNum = 2089;BA.debugLine="Sleep(250)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainpopmenuloginchange_click"),BA.numberCast(int.class, 250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 2091;BA.debugLine="DBUtils.ClearTable(Starter.LocalSQLWRK, \"loc_user";
Debug.ShouldStop(1024);
parent.mostCurrent._dbutils.runVoidMethod ("_cleartable" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("loc_userssession")));
 BA.debugLineNum = 2092;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"LAST_U";
Debug.ShouldStop(2048);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("LAST_USER")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2093;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 2095;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 2096;BA.debugLine="Log($\"Stop service : LocationService\"$)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627066377",(RemoteObject.createImmutable("Stop service : LocationService")),0);
 BA.debugLineNum = 2097;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 2098;BA.debugLine="Log($\"Stop service : Comms\"$)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627066379",(RemoteObject.createImmutable("Stop service : Comms")),0);
 BA.debugLineNum = 2099;BA.debugLine="StopService(UserService)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._userservice.getObject())));
 BA.debugLineNum = 2100;BA.debugLine="Log($\"Stop service : UserService\"$)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627066381",(RemoteObject.createImmutable("Stop service : UserService")),0);
 BA.debugLineNum = 2101;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 2102;BA.debugLine="Log($\"Stop service : Logs\"$)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627066383",(RemoteObject.createImmutable("Stop service : Logs")),0);
 BA.debugLineNum = 2103;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainpopmenuloginchange_click"),BA.numberCast(int.class, 1000));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 2104;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mainmenu.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 2105;BA.debugLine="Sleep(500)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainpopmenuloginchange_click"),BA.numberCast(int.class, 500));
this.state = 3;
return;
case 3:
//C
this.state = -1;
;
 BA.debugLineNum = 2106;BA.debugLine="Log(\"Voltou do StartActivity(Main)\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627066387",RemoteObject.createImmutable("Voltou do StartActivity(Main)"),0);
 BA.debugLineNum = 2107;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 2108;BA.debugLine="End Sub";
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
public static RemoteObject  _mainpopmenupushrequest_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuPushRequest_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1841);
if (RapidSub.canDelegate("mainpopmenupushrequest_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainpopmenupushrequest_click", _menuname);}
RemoteObject _filterparams = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1841;BA.debugLine="Sub MainPopMenuPushRequest_Click(MenuName As Strin";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1842;BA.debugLine="Log(\"MainPopMenuPushRequest\")";
Debug.ShouldStop(131072);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","626148865",RemoteObject.createImmutable("MainPopMenuPushRequest"),0);
 BA.debugLineNum = 1843;BA.debugLine="Dim FilterParams As AppDialogs";
Debug.ShouldStop(262144);
_filterparams = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("FilterParams", _filterparams);
 BA.debugLineNum = 1844;BA.debugLine="FilterParams.Initialize";
Debug.ShouldStop(524288);
_filterparams.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 1845;BA.debugLine="FilterParams.getPushRequestCode(Activity, \"MainMe";
Debug.ShouldStop(1048576);
_filterparams.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getpushrequestcode" /*void*/ ,(Object)((mainmenu.mostCurrent._activity.getObject())),(Object)(BA.ObjectToString("MainMenu")),(Object)(RemoteObject.createImmutable("Puxar intervenção")));
 BA.debugLineNum = 1846;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mainpopmenusync_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuSync_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1933);
if (RapidSub.canDelegate("mainpopmenusync_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainpopmenusync_click", _menuname); return;}
ResumableSub_MainPopMenuSync_Click rsub = new ResumableSub_MainPopMenuSync_Click(null,_menuname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MainPopMenuSync_Click extends BA.ResumableSub {
public ResumableSub_MainPopMenuSync_Click(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _menuname) {
this.parent = parent;
this._menuname = _menuname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _menuname;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _tipodlg = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MainPopMenuSync_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1933);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1934;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1937;BA.debugLine="Msgbox2Async(ShareCode.POPUPMENU_SyncManual,Sha";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._popupmenu_syncmanual /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._popupmenu_mainpopmenusync /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_automatico /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_manual /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),mainmenu.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1938;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainpopmenusync_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1940;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 1945;BA.debugLine="Else If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1941;BA.debugLine="ShareCode.SyncManualComponents.Initialize";
Debug.ShouldStop(1048576);
parent.mostCurrent._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 1942;BA.debugLine="ShareCode.SYNC_COMPONENTS = \"\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._sharecode._sync_components /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 1943;BA.debugLine="ShareCode.DownloadDocsFromFTP = True";
Debug.ShouldStop(4194304);
parent.mostCurrent._sharecode._downloaddocsfromftp /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1944;BA.debugLine="CallSubDelayed3(DataUpdate, \"RunSync\",\"\",False";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",mainmenu.processBA,(Object)((parent.mostCurrent._dataupdate.getObject())),(Object)(BA.ObjectToString("RunSync")),(Object)(RemoteObject.createImmutable((""))),(Object)((parent.mostCurrent.__c.getField(true,"False"))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1946;BA.debugLine="ShareCode.DownloadDocsFromFTP = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._sharecode._downloaddocsfromftp /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1947;BA.debugLine="Dim TipoDlg As Int = 0";
Debug.ShouldStop(67108864);
_tipodlg = BA.numberCast(int.class, 0);Debug.locals.put("TipoDlg", _tipodlg);Debug.locals.put("TipoDlg", _tipodlg);
 BA.debugLineNum = 1948;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(134217728);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1949;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(268435456);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 1950;BA.debugLine="ShareCode.SyncManualComponents.Initialize";
Debug.ShouldStop(536870912);
parent.mostCurrent._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 1951;BA.debugLine="ShareCode.SYNC_COMPONENTS = \"\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._sharecode._sync_components /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 1952;BA.debugLine="Filter.getSyncManual(Me, TipoDlg)";
Debug.ShouldStop(-2147483648);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getsyncmanual" /*void*/ ,(Object)(mainmenu.getObject()),(Object)(_tipodlg));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1959;BA.debugLine="MsgboxAsync(ShareCode.AvisoNoSync, ShareCode.Gen";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisonosync /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),mainmenu.processBA);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1961;BA.debugLine="End Sub";
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
public static void  _mainrestartconfig_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainRestartConfig_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2304);
if (RapidSub.canDelegate("mainrestartconfig_click")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainrestartconfig_click", _menuname); return;}
ResumableSub_MainRestartConfig_Click rsub = new ResumableSub_MainRestartConfig_Click(null,_menuname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MainRestartConfig_Click extends BA.ResumableSub {
public ResumableSub_MainRestartConfig_Click(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _menuname) {
this.parent = parent;
this._menuname = _menuname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _menuname;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MainRestartConfig_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2304);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 2305;BA.debugLine="Msgbox2Async(\"Confirma o procedimento de re-inici";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Confirma o procedimento de re-inicialização da configuração do equipamento?")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),mainmenu.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2306;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainrestartconfig_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2307;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2308;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_2\", Me)";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_2")),(Object)(mainmenu.getObject()));
 BA.debugLineNum = 2309;BA.debugLine="Sleep(250)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "mainrestartconfig_click"),BA.numberCast(int.class, 250));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 BA.debugLineNum = 2311;BA.debugLine="MakeRestartConfig";
Debug.ShouldStop(64);
_makerestartconfig();
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2313;BA.debugLine="End Sub";
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
public static RemoteObject  _mainupdateapk_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("MainUpdateAPK_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1985);
if (RapidSub.canDelegate("mainupdateapk_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","mainupdateapk_click", _menuname);}
Debug.locals.put("Menuname", _menuname);
 BA.debugLineNum = 1985;BA.debugLine="Sub MainUpdateAPK_Click(Menuname As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1987;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeglobalsearchdata(RemoteObject _textdata) throws Exception{
try {
		Debug.PushSubsStack("MakeGlobalSearchData (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3204);
if (RapidSub.canDelegate("makeglobalsearchdata")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","makeglobalsearchdata", _textdata);}
ResumableSub_MakeGlobalSearchData rsub = new ResumableSub_MakeGlobalSearchData(null,_textdata);
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
public static class ResumableSub_MakeGlobalSearchData extends BA.ResumableSub {
public ResumableSub_MakeGlobalSearchData(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _textdata) {
this.parent = parent;
this._textdata = _textdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _textdata;
RemoteObject _daischeck = RemoteObject.createImmutable(0);
RemoteObject _clientdb = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _lastgrupo = RemoteObject.createImmutable(0);
RemoteObject _chapter = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _grupo = RemoteObject.createImmutable(0);
RemoteObject _otitle = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeGlobalSearchData (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3204);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("textdata", _textdata);
 BA.debugLineNum = 3206;BA.debugLine="ProgressDialogShow2(\"A pesquisar! Aguarde por fav";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("A pesquisar! Aguarde por favor ...")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3207;BA.debugLine="Sleep(50)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "makeglobalsearchdata"),BA.numberCast(int.class, 50));
this.state = 17;
return;
case 17:
//C
this.state = 1;
;
 BA.debugLineNum = 3208;BA.debugLine="Dim DaisCheck As Int = 15";
Debug.ShouldStop(128);
_daischeck = BA.numberCast(int.class, 15);Debug.locals.put("DaisCheck", _daischeck);Debug.locals.put("DaisCheck", _daischeck);
 BA.debugLineNum = 3209;BA.debugLine="Dim ClientDB As String = \"\"";
Debug.ShouldStop(256);
_clientdb = BA.ObjectToString("");Debug.locals.put("ClientDB", _clientdb);Debug.locals.put("ClientDB", _clientdb);
 BA.debugLineNum = 3210;BA.debugLine="ProgressSearch.Visible= True";
Debug.ShouldStop(512);
parent.mostCurrent._progresssearch.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3212;BA.debugLine="Dim SSQL As String = DBStructures.EVC_SQL_GLOBAL_";
Debug.ShouldStop(2048);
_ssql = parent.mostCurrent._dbstructures._evc_sql_global_search /*RemoteObject*/ ;Debug.locals.put("SSQL", _ssql);Debug.locals.put("SSQL", _ssql);
 BA.debugLineNum = 3213;BA.debugLine="SSQL = SSQL.Replace(\":CLIENTDB.\", ClientDB).Repla";
Debug.ShouldStop(4096);
_ssql = _ssql.runMethod(true,"replace",(Object)(BA.ObjectToString(":CLIENTDB.")),(Object)(_clientdb)).runMethod(true,"replace",(Object)(BA.ObjectToString(":DAYSCHECK")),(Object)(BA.NumberToString(_daischeck))).runMethod(true,"replace",(Object)(BA.ObjectToString(":FINDTEXT")),(Object)(_textdata));Debug.locals.put("SSQL", _ssql);
 BA.debugLineNum = 3214;BA.debugLine="Dim Result As ResultSet = Starter.LocalSQLEVC.Exe";
Debug.ShouldStop(8192);
_result = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("Result", _result);
 BA.debugLineNum = 3215;BA.debugLine="Dim LastGrupo As Int = 0";
Debug.ShouldStop(16384);
_lastgrupo = BA.numberCast(int.class, 0);Debug.locals.put("LastGrupo", _lastgrupo);Debug.locals.put("LastGrupo", _lastgrupo);
 BA.debugLineNum = 3216;BA.debugLine="Dim chapter As B4XView";
Debug.ShouldStop(32768);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 3217;BA.debugLine="Do While Result.NextRow";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//do while
this.state = 16;
while (_result.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3218;BA.debugLine="Dim grupo As Int = Result.GetInt(\"grupo\")";
Debug.ShouldStop(131072);
_grupo = _result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("grupo")));Debug.locals.put("grupo", _grupo);Debug.locals.put("grupo", _grupo);
 BA.debugLineNum = 3219;BA.debugLine="If (Not(LastGrupo = grupo)) Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 15;
if ((parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_lastgrupo,BA.numberCast(double.class, _grupo)))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3220;BA.debugLine="LastGrupo = grupo";
Debug.ShouldStop(524288);
_lastgrupo = _grupo;Debug.locals.put("LastGrupo", _lastgrupo);
 BA.debugLineNum = 3221;BA.debugLine="Dim oTitle As String = $\"Registos\"$";
Debug.ShouldStop(1048576);
_otitle = (RemoteObject.createImmutable("Registos"));Debug.locals.put("oTitle", _otitle);Debug.locals.put("oTitle", _otitle);
 BA.debugLineNum = 3223;BA.debugLine="If (grupo =1) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 14;
if ((RemoteObject.solveBoolean("=",_grupo,BA.numberCast(double.class, 1)))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 3225;BA.debugLine="else if (grupo=2) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_grupo,BA.numberCast(double.class, 2)))) { 
this.state = 11;
}else {
this.state = 13;
}}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 3224;BA.debugLine="Dim oTitle As String = $\"Intervenções\"$";
Debug.ShouldStop(8388608);
_otitle = (RemoteObject.createImmutable("Intervenções"));Debug.locals.put("oTitle", _otitle);Debug.locals.put("oTitle", _otitle);
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 3226;BA.debugLine="Dim oTitle As String = $\"Objectos\"$";
Debug.ShouldStop(33554432);
_otitle = (RemoteObject.createImmutable("Objectos"));Debug.locals.put("oTitle", _otitle);Debug.locals.put("oTitle", _otitle);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 3228;BA.debugLine="Dim oTitle As String = $\"Tarefas\"$";
Debug.ShouldStop(134217728);
_otitle = (RemoteObject.createImmutable("Tarefas"));Debug.locals.put("oTitle", _otitle);Debug.locals.put("oTitle", _otitle);
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 3231;BA.debugLine="Dim chapter As B4XView = CreateChapter(grupo, o";
Debug.ShouldStop(1073741824);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapter(_grupo,_otitle);Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 3232;BA.debugLine="ExpandListSearch.Add(chapter, grupo)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._expandlistsearch.runVoidMethod ("_add",(Object)(_chapter),(Object)((_grupo)));
 if (true) break;

case 15:
//C
this.state = 1;
;
 BA.debugLineNum = 3235;BA.debugLine="Dim Item As B4XView = CreateChapterItem(grupo, R";
Debug.ShouldStop(4);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_item = _createchapteritem(_grupo,_result);Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 3236;BA.debugLine="ExpandListSearch.Add(Item, grupo)";
Debug.ShouldStop(8);
parent.mostCurrent._expandlistsearch.runVoidMethod ("_add",(Object)(_item),(Object)((_grupo)));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 3239;BA.debugLine="Result.Close";
Debug.ShouldStop(64);
_result.runVoidMethod ("Close");
 BA.debugLineNum = 3240;BA.debugLine="ProgressSearch.Visible= False";
Debug.ShouldStop(128);
parent.mostCurrent._progresssearch.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3241;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3242;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3244;BA.debugLine="End Sub";
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
public static void  _makerestartconfig() throws Exception{
try {
		Debug.PushSubsStack("MakeRestartConfig (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2315);
if (RapidSub.canDelegate("makerestartconfig")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","makerestartconfig"); return;}
ResumableSub_MakeRestartConfig rsub = new ResumableSub_MakeRestartConfig(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MakeRestartConfig extends BA.ResumableSub {
public ResumableSub_MakeRestartConfig(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeRestartConfig (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2315);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2316;BA.debugLine="Starter.LocalSQLEVC.Close";
Debug.ShouldStop(2048);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 2317;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolutionch";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 2318;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionchec";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2320;BA.debugLine="Sleep(250)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "makerestartconfig"),BA.numberCast(int.class, 250));
this.state = 19;
return;
case 19:
//C
this.state = 5;
;
 BA.debugLineNum = 2322;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evoluti";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 2323;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\",";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2325;BA.debugLine="Sleep(250)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "makerestartconfig"),BA.numberCast(int.class, 250));
this.state = 20;
return;
case 20:
//C
this.state = 9;
;
 BA.debugLineNum = 2327;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then St";
Debug.ShouldStop(4194304);
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
this.state = 15;
;
 BA.debugLineNum = 2328;BA.debugLine="Dim res As ResumableSub = FirstInstallCompletePro";
Debug.ShouldStop(8388608);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _firstinstallcompleteprocedure(parent.mostCurrent.__c.getField(true,"False"));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2329;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "makerestartconfig"), _res);
this.state = 21;
return;
case 21:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2330;BA.debugLine="If Not(result)Then";
Debug.ShouldStop(33554432);
if (true) break;

case 15:
//if
this.state = 18;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_result)).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2331;BA.debugLine="MsgboxAsync(ShareCode.AvisoErroComms,ShareCode.G";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoerrocomms /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),mainmenu.processBA);
 BA.debugLineNum = 2332;BA.debugLine="Starter.APP_IN_EXECUTION = False";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._app_in_execution /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 2335;BA.debugLine="MainPopMenuLoginChange_Click(\"\")";
Debug.ShouldStop(1073741824);
_mainpopmenuloginchange_click(RemoteObject.createImmutable(""));
 BA.debugLineNum = 2336;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _printer_connectedtoprint(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Printer_ConnectedToPrint (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3032);
if (RapidSub.canDelegate("printer_connectedtoprint")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","printer_connectedtoprint", _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 3032;BA.debugLine="Sub Printer_ConnectedToPrint (Success As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 3034;BA.debugLine="If Success Then";
Debug.ShouldStop(33554432);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3035;BA.debugLine="ButtonPrint.Visible = True";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._buttonprint.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3036;BA.debugLine="ToastMessageShow(PrinterMessage,False)";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(mainmenu.mostCurrent._printermessage)),(Object)(mainmenu.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3037;BA.debugLine="ListViewBluetoothDevices.Clear";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent._listviewbluetoothdevices.runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 3039;BA.debugLine="ButtonPrint.Visible = False";
Debug.ShouldStop(1073741824);
mainmenu.mostCurrent._buttonprint.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3040;BA.debugLine="ToastMessageShow(\"Erro ao conectar a Impressora\"";
Debug.ShouldStop(-2147483648);
mainmenu.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Erro ao conectar a Impressora")),(Object)(mainmenu.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 3042;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_discoveryfinished() throws Exception{
try {
		Debug.PushSubsStack("Printer_DiscoveryFinished (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3023);
if (RapidSub.canDelegate("printer_discoveryfinished")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","printer_discoveryfinished");}
 BA.debugLineNum = 3023;BA.debugLine="Sub Printer_DiscoveryFinished";
Debug.ShouldStop(16384);
 BA.debugLineNum = 3024;BA.debugLine="Log(\"Search End\")";
Debug.ShouldStop(32768);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","628704769",RemoteObject.createImmutable("Search End"),0);
 BA.debugLineNum = 3025;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_discoverynewprinter(RemoteObject _printerfound,RemoteObject _deviceclass) throws Exception{
try {
		Debug.PushSubsStack("Printer_DiscoveryNewPrinter (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3013);
if (RapidSub.canDelegate("printer_discoverynewprinter")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","printer_discoverynewprinter", _printerfound, _deviceclass);}
Debug.locals.put("PrinterFound", _printerfound);
Debug.locals.put("DeviceClass", _deviceclass);
 BA.debugLineNum = 3013;BA.debugLine="Sub Printer_DiscoveryNewPrinter (PrinterFound As M";
Debug.ShouldStop(16);
 BA.debugLineNum = 3015;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 3016;BA.debugLine="Log(\"DEVICE Class:\" & DeviceClass)";
Debug.ShouldStop(128);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","628639235",RemoteObject.concat(RemoteObject.createImmutable("DEVICE Class:"),_deviceclass),0);
 BA.debugLineNum = 3017;BA.debugLine="ListViewBluetoothDevices.AddSingleLine2(PrinterF";
Debug.ShouldStop(256);
mainmenu.mostCurrent._listviewbluetoothdevices.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_printerfound.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))))),(Object)(_printerfound.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e5.toString()); BA.debugLineNum = 3019;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","628639238",BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 3021;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_discoverynodevicefound() throws Exception{
try {
		Debug.PushSubsStack("Printer_DiscoveryNoDeviceFound (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3027);
if (RapidSub.canDelegate("printer_discoverynodevicefound")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","printer_discoverynodevicefound");}
 BA.debugLineNum = 3027;BA.debugLine="Sub Printer_DiscoveryNoDeviceFound";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3028;BA.debugLine="ToastMessageShow(\"Device not found\",True)";
Debug.ShouldStop(524288);
mainmenu.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Device not found")),(Object)(mainmenu.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 3029;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_listprinterassociated(RemoteObject _listnameandmac) throws Exception{
try {
		Debug.PushSubsStack("Printer_ListPrinterAssociated (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2996);
if (RapidSub.canDelegate("printer_listprinterassociated")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","printer_listprinterassociated", _listnameandmac);}
int _i = 0;
Debug.locals.put("ListNameAndMac", _listnameandmac);
 BA.debugLineNum = 2996;BA.debugLine="Sub Printer_ListPrinterAssociated (ListNameAndMac";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2998;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 2999;BA.debugLine="ListViewBluetoothDevices.Clear";
Debug.ShouldStop(4194304);
mainmenu.mostCurrent._listviewbluetoothdevices.runVoidMethod ("Clear");
 BA.debugLineNum = 3000;BA.debugLine="For I=0 To ListNameAndMac.Size-1";
Debug.ShouldStop(8388608);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_listnameandmac.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 3001;BA.debugLine="ListViewBluetoothDevices.AddSingleLine2(ListNam";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._listviewbluetoothdevices.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_listnameandmac.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))),(Object)(_listnameandmac.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 3002;BA.debugLine="Log($\"${ListNameAndMac.GetKeyAt(I)}, ${ListName";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","628508166",(RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_listnameandmac.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(", "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_listnameandmac.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(""))),0);
 }
}Debug.locals.put("I", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e8.toString()); BA.debugLineNum = 3005;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","628508169",BA.ObjectToString(mainmenu.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 3007;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_sendterminated() throws Exception{
try {
		Debug.PushSubsStack("Printer_SendTerminated (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3044);
if (RapidSub.canDelegate("printer_sendterminated")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","printer_sendterminated");}
 BA.debugLineNum = 3044;BA.debugLine="Sub Printer_SendTerminated";
Debug.ShouldStop(8);
 BA.debugLineNum = 3045;BA.debugLine="Log(\"Finish!!\")";
Debug.ShouldStop(16);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","628901377",RemoteObject.createImmutable("Finish!!"),0);
 BA.debugLineNum = 3047;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private TimeStart As Timer";
mainmenu._timestart = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 14;BA.debugLine="Public AppStarted As Boolean";
mainmenu._appstarted = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 15;BA.debugLine="Public mainShowDialogResult As Int = 0";
mainmenu._mainshowdialogresult = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 16;BA.debugLine="Public Started As Boolean = False";
mainmenu._started = mainmenu.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 17;BA.debugLine="Public WaitToConfirm As Boolean = False";
mainmenu._waittoconfirm = mainmenu.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 18;BA.debugLine="Private CurrentLoginUser As String = \"\"";
mainmenu._currentloginuser = BA.ObjectToString("");
 //BA.debugLineNum = 19;BA.debugLine="Public isLoginDone As Boolean = False";
mainmenu._islogindone = mainmenu.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 20;BA.debugLine="Public isMainScreen As Boolean = False";
mainmenu._ismainscreen = mainmenu.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 21;BA.debugLine="Public Device As Phone";
mainmenu._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 22;BA.debugLine="Public IsFirsttime As Boolean = False";
mainmenu._isfirsttime = mainmenu.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 23;BA.debugLine="Public Requestauth As Boolean = False";
mainmenu._requestauth = mainmenu.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 24;BA.debugLine="Private xui As XUI";
mainmenu._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _recordlinemoreoptions_click() throws Exception{
try {
		Debug.PushSubsStack("RecordLineMoreOptions_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,3382);
if (RapidSub.canDelegate("recordlinemoreoptions_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","recordlinemoreoptions_click");}
 BA.debugLineNum = 3382;BA.debugLine="Sub RecordLineMoreOptions_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 3384;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _reinstallation(RemoteObject _download) throws Exception{
try {
		Debug.PushSubsStack("Reinstallation (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2338);
if (RapidSub.canDelegate("reinstallation")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","reinstallation", _download); return;}
ResumableSub_Reinstallation rsub = new ResumableSub_Reinstallation(null,_download);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Reinstallation extends BA.ResumableSub {
public ResumableSub_Reinstallation(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _download) {
this.parent = parent;
this._download = _download;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _download;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Reinstallation (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2338);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Download", _download);
 BA.debugLineNum = 2339;BA.debugLine="PanelDownloadInicial.Visible = True";
Debug.ShouldStop(4);
parent.mostCurrent._paneldownloadinicial.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2340;BA.debugLine="Dim res As ResumableSub = FirstInstallCompletePro";
Debug.ShouldStop(8);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _firstinstallcompleteprocedure(_download);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2341;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "reinstallation"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2342;BA.debugLine="If Not(result)Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_result)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2343;BA.debugLine="MsgboxAsync(ShareCode.AvisoErroComms,ShareCode.G";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoerrocomms /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),mainmenu.processBA);
 BA.debugLineNum = 2344;BA.debugLine="Starter.APP_IN_EXECUTION = False";
Debug.ShouldStop(128);
parent.mostCurrent._starter._app_in_execution /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2347;BA.debugLine="MainPopMenuLoginChange_Click(\"\")";
Debug.ShouldStop(1024);
_mainpopmenuloginchange_click(RemoteObject.createImmutable(""));
 BA.debugLineNum = 2349;BA.debugLine="End Sub";
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
public static RemoteObject  _releasedeviceauthorization() throws Exception{
try {
		Debug.PushSubsStack("ReleaseDeviceAuthorization (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1971);
if (RapidSub.canDelegate("releasedeviceauthorization")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","releasedeviceauthorization");}
 BA.debugLineNum = 1971;BA.debugLine="Sub ReleaseDeviceAuthorization";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1977;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removealllocalinfoandsqlfiles() throws Exception{
try {
		Debug.PushSubsStack("RemoveAllLocalInfoAndSqlFiles (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2932);
if (RapidSub.canDelegate("removealllocalinfoandsqlfiles")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","removealllocalinfoandsqlfiles");}
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
public ResumableSub_RemoveAllLocalInfoAndSqlFiles(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
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
		Debug.PushSubsStack("RemoveAllLocalInfoAndSqlFiles (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2932);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 2933;BA.debugLine="Dim LocaRes As Boolean = False";
Debug.ShouldStop(1048576);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);Debug.locals.put("LocaRes", _locares);
 BA.debugLineNum = 2934;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "removealllocalinfoandsqlfiles"), parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",mainmenu.processBA,(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ ))));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 2935;BA.debugLine="If Success Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 2936;BA.debugLine="For Each F As String In Files";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 2937;BA.debugLine="If F.ToLowerCase.EndsWith(\".info\") And Not(F.To";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 2938;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_f));
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
 BA.debugLineNum = 2941;BA.debugLine="LocaRes = True";
Debug.ShouldStop(268435456);
_locares = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2943;BA.debugLine="LocaRes = False";
Debug.ShouldStop(1073741824);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 2946;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "removealllocalinfoandsqlfiles"), parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",mainmenu.processBA,(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ ))));
this.state = 32;
return;
case 32:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 2947;BA.debugLine="If Success Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 2948;BA.debugLine="For Each F As String In Files";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 2949;BA.debugLine="If F.ToLowerCase.EndsWith(\".sql\") And Not(F.ToL";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 2950;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_f));
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
 BA.debugLineNum = 2953;BA.debugLine="LocaRes = True";
Debug.ShouldStop(256);
_locares = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2955;BA.debugLine="LocaRes = False";
Debug.ShouldStop(1024);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 2957;BA.debugLine="Return LocaRes";
Debug.ShouldStop(4096);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_locares));return;};
 BA.debugLineNum = 2959;BA.debugLine="End Sub";
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
public static void  _resetapplication() throws Exception{
try {
		Debug.PushSubsStack("ResetApplication (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2141);
if (RapidSub.canDelegate("resetapplication")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","resetapplication"); return;}
ResumableSub_ResetApplication rsub = new ResumableSub_ResetApplication(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ResetApplication extends BA.ResumableSub {
public ResumableSub_ResetApplication(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ResetApplication (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2141);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2142;BA.debugLine="Starter.RunUpdate = True";
Debug.ShouldStop(536870912);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2143;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgEnviarDadosVe";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._pg2msgenviardadosverificacao /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2144;BA.debugLine="Sleep(500)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "resetapplication"),BA.numberCast(int.class, 500));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 2146;BA.debugLine="Dim res As ResumableSub = UploadFilesWithFTPLocal";
Debug.ShouldStop(2);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _uploadfileswithftplocaldata();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2147;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "resetapplication"), _res);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 2148;BA.debugLine="If(finish = False)Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean("=",_finish,parent.mostCurrent.__c.getField(true,"False")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2149;BA.debugLine="MsgboxAsync(\"Erro ao enviar dados de verificação";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Erro ao enviar dados de verificação Tente Novamente.... ")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Erro"))),mainmenu.processBA);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2151;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2153;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(256);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2154;BA.debugLine="End Sub";
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
public static RemoteObject  _returnedfromscanner() throws Exception{
try {
		Debug.PushSubsStack("returnedFromScanner (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2134);
if (RapidSub.canDelegate("returnedfromscanner")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","returnedfromscanner");}
int _i = 0;
 BA.debugLineNum = 2134;BA.debugLine="Sub returnedFromScanner";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 2135;BA.debugLine="Log(\"returnedFromScanner\")";
Debug.ShouldStop(4194304);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","627394049",RemoteObject.createImmutable("returnedFromScanner"),0);
 BA.debugLineNum = 2136;BA.debugLine="For i=0 To ShareCode.ScanList.Size -1";
Debug.ShouldStop(8388608);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {mainmenu.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2137;BA.debugLine="If Utils.NNE(ShareCode.ScanList.Get(i)) Then Log";
Debug.ShouldStop(16777216);
if (mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.ObjectToString(mainmenu.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))).<Boolean>get().booleanValue()) { 
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","627394051",BA.ObjectToString(mainmenu.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2139;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _returnfrompushrequest(RemoteObject _status,RemoteObject _thecode) throws Exception{
try {
		Debug.PushSubsStack("ReturnFromPushRequest (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1859);
if (RapidSub.canDelegate("returnfrompushrequest")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","returnfrompushrequest", _status, _thecode);}
RemoteObject _filterparams1 = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("status", _status);
Debug.locals.put("theCode", _thecode);
 BA.debugLineNum = 1859;BA.debugLine="Sub ReturnFromPushRequest(status As Int, theCode A";
Debug.ShouldStop(4);
 BA.debugLineNum = 1860;BA.debugLine="Log(\"ReturnFromPushRequest\")";
Debug.ShouldStop(8);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","626345473",RemoteObject.createImmutable("ReturnFromPushRequest"),0);
 BA.debugLineNum = 1861;BA.debugLine="If (status = 1) And Utils.NNE(theCode) Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1))))) && RemoteObject.solveBoolean(".",mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_thecode)))) { 
 BA.debugLineNum = 1862;BA.debugLine="Dim FilterParams1 As AppDialogs";
Debug.ShouldStop(32);
_filterparams1 = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("FilterParams1", _filterparams1);
 BA.debugLineNum = 1863;BA.debugLine="FilterParams1.Initialize";
Debug.ShouldStop(64);
_filterparams1.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 1864;BA.debugLine="FilterParams1.getRequestSelectDialog(Activity, \"";
Debug.ShouldStop(128);
_filterparams1.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getrequestselectdialog" /*void*/ ,(Object)(mainmenu.mostCurrent._activity),(Object)(RemoteObject.createImmutable(("MainMenu"))),(Object)(BA.ObjectToString("Seleccionar intervenção")),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1866;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _returnfrompushrequestselect(RemoteObject _status,RemoteObject _thecode) throws Exception{
try {
		Debug.PushSubsStack("ReturnFromPushRequestSelect (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1868);
if (RapidSub.canDelegate("returnfrompushrequestselect")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","returnfrompushrequestselect", _status, _thecode); return;}
ResumableSub_ReturnFromPushRequestSelect rsub = new ResumableSub_ReturnFromPushRequestSelect(null,_status,_thecode);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReturnFromPushRequestSelect extends BA.ResumableSub {
public ResumableSub_ReturnFromPushRequestSelect(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _status,RemoteObject _thecode) {
this.parent = parent;
this._status = _status;
this._thecode = _thecode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _status;
RemoteObject _thecode;
RemoteObject _updsql = RemoteObject.createImmutable("");
RemoteObject _updtype = RemoteObject.createImmutable(0);
RemoteObject _updtag = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReturnFromPushRequestSelect (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1868);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("status", _status);
Debug.locals.put("theCode", _thecode);
 BA.debugLineNum = 1869;BA.debugLine="If (status = 1) And Utils.NNE(theCode) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 27;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1))))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_thecode)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1872;BA.debugLine="Dim updSQL As String = \"\"";
Debug.ShouldStop(32768);
_updsql = BA.ObjectToString("");Debug.locals.put("updSQL", _updsql);Debug.locals.put("updSQL", _updsql);
 BA.debugLineNum = 1873;BA.debugLine="Dim updType As Int = 0";
Debug.ShouldStop(65536);
_updtype = BA.numberCast(int.class, 0);Debug.locals.put("updType", _updtype);Debug.locals.put("updType", _updtype);
 BA.debugLineNum = 1874;BA.debugLine="Dim updTag As String = Utils.IfNullOrEmpty(Share";
Debug.ShouldStop(131072);
_updtag = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_userteam /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ));Debug.locals.put("updTag", _updtag);Debug.locals.put("updTag", _updtag);
 BA.debugLineNum = 1875;BA.debugLine="If (Utils.NNE(ShareCode.SESS_UserTeam)) Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_userteam /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1876;BA.debugLine="Dim updSQL As String = $\"Update dta_requests se";
Debug.ShouldStop(524288);
_updsql = (RemoteObject.concat(RemoteObject.createImmutable("Update dta_requests set team_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_userteam /*RemoteObject*/ ))),RemoteObject.createImmutable("' where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thecode))),RemoteObject.createImmutable("'")));Debug.locals.put("updSQL", _updsql);Debug.locals.put("updSQL", _updsql);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1878;BA.debugLine="Dim updSQL As String = $\"Update dta_requests se";
Debug.ShouldStop(2097152);
_updsql = (RemoteObject.concat(RemoteObject.createImmutable("Update dta_requests set technical_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("' where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thecode))),RemoteObject.createImmutable("'")));Debug.locals.put("updSQL", _updsql);Debug.locals.put("updSQL", _updsql);
 BA.debugLineNum = 1879;BA.debugLine="updType = 1";
Debug.ShouldStop(4194304);
_updtype = BA.numberCast(int.class, 1);Debug.locals.put("updType", _updtype);
 if (true) break;
;
 BA.debugLineNum = 1881;BA.debugLine="If Utils.NNE(updSQL) Then";
Debug.ShouldStop(16777216);

case 9:
//if
this.state = 26;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_updsql)).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 25;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1882;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(updSQL)";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_updsql));
 BA.debugLineNum = 1885;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDate";
Debug.ShouldStop(268435456);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 1886;BA.debugLine="Private sACLALatitude As String = Utils.IfNullO";
Debug.ShouldStop(536870912);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1887;BA.debugLine="Private sACLALongitude As String = Utils.IfNull";
Debug.ShouldStop(1073741824);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1889;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1890;BA.debugLine="params.Initialize";
Debug.ShouldStop(2);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1891;BA.debugLine="params.Clear";
Debug.ShouldStop(4);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1892;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1893;BA.debugLine="params.Put(\"ACLARequest\", theCode)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_thecode)));
 BA.debugLineNum = 1894;BA.debugLine="params.Put(\"ACLARelation\", updType)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARelation"))),(Object)((_updtype)));
 BA.debugLineNum = 1895;BA.debugLine="params.Put(\"ACLATagcode\", updTag)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_updtag)));
 BA.debugLineNum = 1897;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1898;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1899;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 1900;BA.debugLine="params.Put(\"ACLSessUser\", ShareCode.SESS_User)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLSessUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1901;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1902;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1903;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1904;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1905;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1906;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1907;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1909;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_D";
Debug.ShouldStop(1048576);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/request/owner/change")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1910;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPL";
Debug.ShouldStop(2097152);
if (true) break;

case 12:
//if
this.state = 23;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 22;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1911;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 15:
//if
this.state = 20;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 1912;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", theCode";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(mainmenu.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_thecode));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1914;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(33554432);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1915;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 20:
//C
this.state = 23;
;
 BA.debugLineNum = 1917;BA.debugLine="Sleep(250)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "returnfrompushrequestselect"),BA.numberCast(int.class, 250));
this.state = 28;
return;
case 28:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1919;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(1073741824);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1920;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 23:
//C
this.state = 26;
;
 BA.debugLineNum = 1923;BA.debugLine="MsgboxAsync(ShareCode.AvisoOperacaoConcluida, S";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisooperacaoconcluida /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalnotetitle /*RemoteObject*/ )),mainmenu.processBA);
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1926;BA.debugLine="MsgboxAsync(ShareCode.maimenuproblemaatribuicao";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._maimenuproblemaatribuicao /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),mainmenu.processBA);
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 1931;BA.debugLine="End Sub";
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
public static RemoteObject  _runsyncmanual(RemoteObject _date2watch,RemoteObject _syncdates) throws Exception{
try {
		Debug.PushSubsStack("RunSyncManual (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1979);
if (RapidSub.canDelegate("runsyncmanual")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","runsyncmanual", _date2watch, _syncdates);}
Debug.locals.put("date2watch", _date2watch);
Debug.locals.put("SyncDates", _syncdates);
 BA.debugLineNum = 1979;BA.debugLine="Sub RunSyncManual(date2watch As String, SyncDates";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1981;BA.debugLine="CallSubDelayed3(DataUpdate,\"RunSync\",date2watch,";
Debug.ShouldStop(268435456);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",mainmenu.processBA,(Object)((mainmenu.mostCurrent._dataupdate.getObject())),(Object)(BA.ObjectToString("RunSync")),(Object)((_date2watch)),(Object)((_syncdates)));
 BA.debugLineNum = 1983;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendlargesms(RemoteObject _destination,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("SendLargeSms (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2005);
if (RapidSub.canDelegate("sendlargesms")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","sendlargesms", _destination, _message);}
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _extra = RemoteObject.createImmutable("");
RemoteObject _smsmanager = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _size = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pi = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _i2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pi2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _al = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _al2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
int _ii = 0;
Debug.locals.put("Destination", _destination);
Debug.locals.put("Message", _message);
 BA.debugLineNum = 2005;BA.debugLine="Sub SendLargeSms(Destination As String, Message As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2007;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(4194304);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 2008;BA.debugLine="Dim Extra As String = \"extra\"";
Debug.ShouldStop(8388608);
_extra = BA.ObjectToString("extra");Debug.locals.put("Extra", _extra);Debug.locals.put("Extra", _extra);
 BA.debugLineNum = 2009;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(16777216);
_ctxt.runVoidMethod ("InitializeContext",mainmenu.processBA);
 BA.debugLineNum = 2010;BA.debugLine="Dim smsManager As JavaObject";
Debug.ShouldStop(33554432);
_smsmanager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("smsManager", _smsmanager);
 BA.debugLineNum = 2011;BA.debugLine="smsManager = smsManager.InitializeStatic(\"android";
Debug.ShouldStop(67108864);
_smsmanager = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _smsmanager.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.telephony.SmsManager"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDefault")),(Object)((mainmenu.mostCurrent.__c.getField(false,"Null")))));
 BA.debugLineNum = 2012;BA.debugLine="Dim parts As JavaObject = smsManager.RunMethod(\"d";
Debug.ShouldStop(134217728);
_parts = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_parts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _smsmanager.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("divideMessage")),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {_message})))));Debug.locals.put("parts", _parts);
 BA.debugLineNum = 2013;BA.debugLine="Dim size As Int = parts.RunMethod(\"size\", Null)";
Debug.ShouldStop(268435456);
_size = BA.numberCast(int.class, _parts.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("size")),(Object)((mainmenu.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 2015;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(1073741824);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 2016;BA.debugLine="i.Initialize(\"b4a.smssent\", \"\")";
Debug.ShouldStop(-2147483648);
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("b4a.smssent")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2017;BA.debugLine="i.PutExtra(\"phone\", Destination)";
Debug.ShouldStop(1);
_i.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("phone")),(Object)((_destination)));
 BA.debugLineNum = 2018;BA.debugLine="i.PutExtra(\"message_id\", Extra)";
Debug.ShouldStop(2);
_i.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("message_id")),(Object)((_extra)));
 BA.debugLineNum = 2019;BA.debugLine="Dim pi As JavaObject";
Debug.ShouldStop(4);
_pi = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("pi", _pi);
 BA.debugLineNum = 2020;BA.debugLine="pi = pi.InitializeStatic(\"android.app.PendingInte";
Debug.ShouldStop(8);
_pi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pi.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.app.PendingIntent"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBroadcast")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_ctxt.getObject()),RemoteObject.createImmutable((0)),(_i.getObject()),RemoteObject.createImmutable((134217728))}))));
 BA.debugLineNum = 2023;BA.debugLine="Dim i2 As Intent";
Debug.ShouldStop(64);
_i2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i2", _i2);
 BA.debugLineNum = 2024;BA.debugLine="i2.Initialize(\"b4a.smsdelivered\", \"\")";
Debug.ShouldStop(128);
_i2.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("b4a.smsdelivered")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2025;BA.debugLine="i2.PutExtra(\"phone\", Destination)";
Debug.ShouldStop(256);
_i2.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("phone")),(Object)((_destination)));
 BA.debugLineNum = 2026;BA.debugLine="i2.PutExtra(\"message_id\", Extra)";
Debug.ShouldStop(512);
_i2.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("message_id")),(Object)((_extra)));
 BA.debugLineNum = 2027;BA.debugLine="Dim pi2 As JavaObject";
Debug.ShouldStop(1024);
_pi2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("pi2", _pi2);
 BA.debugLineNum = 2028;BA.debugLine="pi2 = pi2.InitializeStatic(\"android.app.PendingIn";
Debug.ShouldStop(2048);
_pi2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pi2.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.app.PendingIntent"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBroadcast")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_ctxt.getObject()),RemoteObject.createImmutable((0)),(_i2.getObject()),RemoteObject.createImmutable((134217728))}))));
 BA.debugLineNum = 2031;BA.debugLine="Dim al, al2 As JavaObject";
Debug.ShouldStop(16384);
_al = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("al", _al);
_al2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("al2", _al2);
 BA.debugLineNum = 2032;BA.debugLine="al.InitializeNewInstance(\"java.util.ArrayList\", N";
Debug.ShouldStop(32768);
_al.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.util.ArrayList")),(Object)((mainmenu.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 2033;BA.debugLine="al2.InitializeNewInstance(\"java.util.ArrayList\",";
Debug.ShouldStop(65536);
_al2.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.util.ArrayList")),(Object)((mainmenu.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 2034;BA.debugLine="For ii = 0 To size - 2";
Debug.ShouldStop(131072);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_ii = 0 ;
for (;(step23 > 0 && _ii <= limit23) || (step23 < 0 && _ii >= limit23) ;_ii = ((int)(0 + _ii + step23))  ) {
Debug.locals.put("ii", _ii);
 BA.debugLineNum = 2035;BA.debugLine="al.RunMethod(\"add\", Array(Null))";
Debug.ShouldStop(262144);
_al.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("add")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {mainmenu.mostCurrent.__c.getField(false,"Null")})));
 BA.debugLineNum = 2036;BA.debugLine="al2.RunMethod(\"add\", Array(Null))";
Debug.ShouldStop(524288);
_al2.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("add")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {mainmenu.mostCurrent.__c.getField(false,"Null")})));
 }
}Debug.locals.put("ii", _ii);
;
 BA.debugLineNum = 2038;BA.debugLine="al.RunMethod(\"add\", Array(pi))";
Debug.ShouldStop(2097152);
_al.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("add")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pi.getObject())})));
 BA.debugLineNum = 2039;BA.debugLine="al2.RunMethod(\"add\", Array(pi2))";
Debug.ShouldStop(4194304);
_al2.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("add")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pi2.getObject())})));
 BA.debugLineNum = 2040;BA.debugLine="smsManager.RunMethod(\"sendMultipartTextMessage\",";
Debug.ShouldStop(8388608);
_smsmanager.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("sendMultipartTextMessage")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_destination),mainmenu.mostCurrent.__c.getField(false,"Null"),(_parts.getObject()),(_al.getObject()),(_al2.getObject())})));
 BA.debugLineNum = 2041;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendsms(RemoteObject _sms_2number,RemoteObject _sms_body) throws Exception{
try {
		Debug.PushSubsStack("SendSMS (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1998);
if (RapidSub.canDelegate("sendsms")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","sendsms", _sms_2number, _sms_body);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("sms_2number", _sms_2number);
Debug.locals.put("sms_body", _sms_body);
 BA.debugLineNum = 1998;BA.debugLine="Sub SendSMS(sms_2number As String,sms_body As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1999;BA.debugLine="Dim In As Intent";
Debug.ShouldStop(16384);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 2000;BA.debugLine="In.Initialize(In.ACTION_VIEW, \"sms:\" & sms_2numbe";
Debug.ShouldStop(32768);
_in.runVoidMethod ("Initialize",(Object)(_in.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("sms:"),_sms_2number)));
 BA.debugLineNum = 2001;BA.debugLine="In.PutExtra(\"sms_body\", sms_body)";
Debug.ShouldStop(65536);
_in.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("sms_body")),(Object)((_sms_body)));
 BA.debugLineNum = 2002;BA.debugLine="StartActivity(In)";
Debug.ShouldStop(131072);
mainmenu.mostCurrent.__c.runVoidMethod ("StartActivity",mainmenu.processBA,(Object)((_in.getObject())));
 BA.debugLineNum = 2003;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttheactivity(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("StartTheActivity (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,311);
if (RapidSub.canDelegate("starttheactivity")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","starttheactivity", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 311;BA.debugLine="Sub StartTheActivity(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="Log(\"chegou\")";
Debug.ShouldStop(8388608);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","623461889",RemoteObject.createImmutable("chegou"),0);
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _testsms_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("TestSMS_Click (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1989);
if (RapidSub.canDelegate("testsms_click")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","testsms_click", _menuname);}
RemoteObject _extradata2send = RemoteObject.createImmutable("");
Debug.locals.put("Menuname", _menuname);
 BA.debugLineNum = 1989;BA.debugLine="Sub TestSMS_Click(Menuname As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1990;BA.debugLine="Dim ExtraData2Send As String = $\"${ShareCode.APPL";
Debug.ShouldStop(32);
_extradata2send = (RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ))),RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("")));Debug.locals.put("ExtraData2Send", _extradata2send);Debug.locals.put("ExtraData2Send", _extradata2send);
 BA.debugLineNum = 1993;BA.debugLine="CallSub3(Me, \"SendLargeSms\",\"912193296\",$\"${Extra";
Debug.ShouldStop(256);
mainmenu.mostCurrent.__c.runMethodAndSync(false,"CallSubNew3",mainmenu.processBA,(Object)(mainmenu.getObject()),(Object)(BA.ObjectToString("SendLargeSms")),(Object)(RemoteObject.createImmutable(("912193296"))),(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_extradata2send))),RemoteObject.createImmutable("Boa tarde."),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Hora de chegada aproximada em cerca de 15 minutos."),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Obrigado!"))))));
 BA.debugLineNum = 1995;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unlockscreen(RemoteObject _nextsetp,RemoteObject _counter) throws Exception{
try {
		Debug.PushSubsStack("UnlockScreen (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,320);
if (RapidSub.canDelegate("unlockscreen")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","unlockscreen", _nextsetp, _counter);}
Debug.locals.put("nextSetp", _nextsetp);
Debug.locals.put("counter", _counter);
 BA.debugLineNum = 320;BA.debugLine="Sub UnlockScreen(nextSetp As Int, counter As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="LockPanel.Visible = False";
Debug.ShouldStop(1);
mainmenu.mostCurrent._lockpanel.runMethod(true,"setVisible",mainmenu.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 322;BA.debugLine="ShareCode.MainLockPanel = LockPanel.Visible";
Debug.ShouldStop(2);
mainmenu.mostCurrent._sharecode._mainlockpanel /*RemoteObject*/  = mainmenu.mostCurrent._lockpanel.runMethod(true,"getVisible");
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
public static RemoteObject  _updatemainlayout() throws Exception{
try {
		Debug.PushSubsStack("UpdateMainLayout (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,471);
if (RapidSub.canDelegate("updatemainlayout")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","updatemainlayout");}
 BA.debugLineNum = 471;BA.debugLine="Sub UpdateMainLayout";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 472;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(8388608);
if (mainmenu.mostCurrent.__c.runMethod(true,"Not",(Object)(mainmenu.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 473;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
Debug.ShouldStop(16777216);
mainmenu.mostCurrent._mainlogo.runMethod(true,"setGravity",mainmenu.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 474;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
Debug.ShouldStop(33554432);
mainmenu.mostCurrent._mainlogo.runMethod(true,"setWidth",mainmenu.mostCurrent._consts._logowidth /*RemoteObject*/ );
 BA.debugLineNum = 475;BA.debugLine="mainLogoSearch.Gravity = Gravity.FILL";
Debug.ShouldStop(67108864);
mainmenu.mostCurrent._mainlogosearch.runMethod(true,"setGravity",mainmenu.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 476;BA.debugLine="mainLogoSearch.Width = Consts.LogoWidth";
Debug.ShouldStop(134217728);
mainmenu.mostCurrent._mainlogosearch.runMethod(true,"setWidth",mainmenu.mostCurrent._consts._logowidth /*RemoteObject*/ );
 };
 BA.debugLineNum = 478;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
Debug.ShouldStop(536870912);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","623920647",(RemoteObject.concat(RemoteObject.createImmutable("Inicialização de BMP: "),mainmenu.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mainmenu.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 479;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
Debug.ShouldStop(1073741824);
if ((mainmenu.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 480;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
Debug.ShouldStop(-2147483648);
mainmenu.mostCurrent._mainlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((mainmenu.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 BA.debugLineNum = 481;BA.debugLine="mainLogoSearch.SetBackgroundImage(Utils.B64ToBit";
Debug.ShouldStop(1);
mainmenu.mostCurrent._mainlogosearch.runVoidMethod ("SetBackgroundImageNew",(Object)((mainmenu.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(mainmenu.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 };
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemedata(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("UpdateMeData (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1570);
if (RapidSub.canDelegate("updatemedata")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","updatemedata", _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 1570;BA.debugLine="Sub UpdateMeData(data As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1571;BA.debugLine="If (LabelAppInfo.IsInitialized) Then LabelAppInfo";
Debug.ShouldStop(4);
if ((mainmenu.mostCurrent._labelappinfo.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
mainmenu.mostCurrent._labelappinfo.runMethod(true,"setText",BA.ObjectToCharSequence(_data));};
 BA.debugLineNum = 1572;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateprogressbar(RemoteObject _maxval,RemoteObject _currentval) throws Exception{
try {
		Debug.PushSubsStack("UpdateProgressBar (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2920);
if (RapidSub.canDelegate("updateprogressbar")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","updateprogressbar", _maxval, _currentval);}
Debug.locals.put("MaxVal", _maxval);
 BA.debugLineNum = 2920;BA.debugLine="Sub UpdateProgressBar(MaxVal As Int, CurrentVal As";
Debug.ShouldStop(128);
 BA.debugLineNum = 2921;BA.debugLine="Dim CurrentVal As Int = (100 * CurrentVal / MaxVa";
Debug.ShouldStop(256);
_currentval = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_currentval,_maxval}, "*/",0, 0)));Debug.locals.put("CurrentVal", _currentval);Debug.locals.put("CurrentVal", _currentval);
 BA.debugLineNum = 2922;BA.debugLine="ProgressoInicial.Progress = CurrentVal";
Debug.ShouldStop(512);
mainmenu.mostCurrent._progressoinicial.runMethod(true,"setProgress",_currentval);
 BA.debugLineNum = 2923;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("UpdateProgressBar2 (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2925);
if (RapidSub.canDelegate("updateprogressbar2")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","updateprogressbar2", _maxval, _currentval);}
Debug.locals.put("MaxVal", _maxval);
 BA.debugLineNum = 2925;BA.debugLine="Sub UpdateProgressBar2(MaxVal As Int, CurrentVal A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 2926;BA.debugLine="Dim CurrentVal As Int = (100 * CurrentVal / MaxVa";
Debug.ShouldStop(8192);
_currentval = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_currentval,_maxval}, "*/",0, 0)));Debug.locals.put("CurrentVal", _currentval);Debug.locals.put("CurrentVal", _currentval);
 BA.debugLineNum = 2927;BA.debugLine="ProgressoInicial2.Progress = CurrentVal";
Debug.ShouldStop(16384);
mainmenu.mostCurrent._progressoinicial2.runMethod(true,"setProgress",_currentval);
 BA.debugLineNum = 2928;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateservicetimer_tick() throws Exception{
try {
		Debug.PushSubsStack("UpdateServiceTimer_Tick (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,307);
if (RapidSub.canDelegate("updateservicetimer_tick")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","updateservicetimer_tick");}
 BA.debugLineNum = 307;BA.debugLine="Sub UpdateServiceTimer_Tick";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="Log(\"UpdateServiceTimer_Tick\")";
Debug.ShouldStop(524288);
mainmenu.mostCurrent.__c.runVoidMethod ("LogImpl","623396353",RemoteObject.createImmutable("UpdateServiceTimer_Tick"),0);
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _uploadfileswithftp(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTP (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1799);
if (RapidSub.canDelegate("uploadfileswithftp")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","uploadfileswithftp", _filename);}
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
public ResumableSub_UploadFilesWithFTP(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _filename;
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _serverlocation = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTP (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1799);
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
 BA.debugLineNum = 1800;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(128);
_ret = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1801;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(256);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 1802;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(512);
_myftp.runVoidMethod ("Initialize",mainmenu.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1803;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(1024);
_myftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1807;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(16384);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1808;BA.debugLine="Log(filename)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","625886729",_filename,0);
 BA.debugLineNum = 1809;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.APP";
Debug.ShouldStop(65536);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 1810;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
Debug.ShouldStop(131072);
_sf = _myftp.runMethod(false,"UploadFile",mainmenu.processBA,(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_serverlocation,_filename)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1811;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadfileswithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1812;BA.debugLine="If Success Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 1813;BA.debugLine="Log(\"file was uploaded successfully\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","625886734",RemoteObject.createImmutable("file was uploaded successfully"),0);
 BA.debugLineNum = 1814;BA.debugLine="ret = True";
Debug.ShouldStop(2097152);
_ret = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1816;BA.debugLine="Log(\"Error uploading file\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","625886737",RemoteObject.createImmutable("Error uploading file"),0);
 BA.debugLineNum = 1817;BA.debugLine="ret = False";
Debug.ShouldStop(16777216);
_ret = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1819;BA.debugLine="myFTP.Close";
Debug.ShouldStop(67108864);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 1820;BA.debugLine="Return ret";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ret));return;};
 BA.debugLineNum = 1821;BA.debugLine="End Sub";
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
public static void  _ftp_uploadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _uploadfileswithftplocaldata() throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTPLocalData (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2181);
if (RapidSub.canDelegate("uploadfileswithftplocaldata")) { return xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","uploadfileswithftplocaldata");}
ResumableSub_UploadFilesWithFTPLocalData rsub = new ResumableSub_UploadFilesWithFTPLocalData(null);
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
public static class ResumableSub_UploadFilesWithFTPLocalData extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTPLocalData(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _myfolder = RemoteObject.createImmutable("");
RemoteObject _command = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _replycode = RemoteObject.createImmutable(0);
RemoteObject _replystring = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _floglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n1 = 0;
RemoteObject _ff = RemoteObject.createImmutable("");
RemoteObject _flist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
int step39;
int limit39;
int step53;
int limit53;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTPLocalData (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,2181);
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
 BA.debugLineNum = 2182;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(32);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 2183;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(64);
_myftp.runVoidMethod ("Initialize",mainmenu.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2184;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(128);
_myftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2185;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(256);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2187;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(1024);
_continua = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 2188;BA.debugLine="Try";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 2189;BA.debugLine="Dim myFolder As String = $\"/${ShareCode.APP_DOMA";
Debug.ShouldStop(4096);
_myfolder = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/import/internal/D"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA)))),RemoteObject.createImmutable("")));Debug.locals.put("myFolder", _myfolder);Debug.locals.put("myFolder", _myfolder);
 BA.debugLineNum = 2190;BA.debugLine="myFTP.SendCommand(\"MKD\", myFolder)";
Debug.ShouldStop(8192);
_myftp.runVoidMethod ("SendCommand",mainmenu.processBA,(Object)(BA.ObjectToString("MKD")),(Object)(_myfolder));
 BA.debugLineNum = 2191;BA.debugLine="Wait For ftp_CommandCompleted (Command As String";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_commandcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadfileswithftplocaldata"), null);
this.state = 67;
return;
case 67:
//C
this.state = 6;
_command = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Command", _command);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_replycode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ReplyCode", _replycode);
_replystring = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("ReplyString", _replystring);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 2193;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721740",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2194;BA.debugLine="Continua = False";
Debug.ShouldStop(131072);
_continua = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Continua", _continua);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2197;BA.debugLine="If (Continua) Then";
Debug.ShouldStop(1048576);

case 6:
//if
this.state = 66;
this.catchState = 0;
if ((_continua).<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 65;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2198;BA.debugLine="Log(myFolder)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721745",_myfolder,0);
 BA.debugLineNum = 2199;BA.debugLine="Log(Success)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721746",BA.ObjectToString(_success),0);
 BA.debugLineNum = 2200;BA.debugLine="Log(Command)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721747",_command,0);
 BA.debugLineNum = 2201;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 9:
//if
this.state = 14;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 2202;BA.debugLine="Dim myFolder As String = $\"/${ShareCode.APP_DOM";
Debug.ShouldStop(33554432);
_myfolder = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/import/internal/")));Debug.locals.put("myFolder", _myfolder);Debug.locals.put("myFolder", _myfolder);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2204;BA.debugLine="myFolder = $\"${myFolder}/\"$";
Debug.ShouldStop(134217728);
_myfolder = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_myfolder))),RemoteObject.createImmutable("/")));Debug.locals.put("myFolder", _myfolder);
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 2206;BA.debugLine="Log(myFolder)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721753",_myfolder,0);
 BA.debugLineNum = 2209;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 15:
//try
this.state = 20;
this.catchState = 19;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 20;
this.catchState = 19;
 BA.debugLineNum = 2210;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sha";
Debug.ShouldStop(2);
_sf = _myftp.runMethod(false,"UploadFile",mainmenu.processBA,(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_myfolder,RemoteObject.createImmutable("evolutioncheck.db3"))));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2211;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath A";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 68;
return;
case 68:
//C
this.state = 20;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2212;BA.debugLine="Log(\"ftp_UploadCompleted Success = \" & Success)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721759",RemoteObject.concat(RemoteObject.createImmutable("ftp_UploadCompleted Success = "),_success),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 2214;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721761",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2217;BA.debugLine="Try";
Debug.ShouldStop(256);

case 20:
//try
this.state = 25;
this.catchState = 0;
this.catchState = 24;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 25;
this.catchState = 24;
 BA.debugLineNum = 2218;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sha";
Debug.ShouldStop(512);
_sf = _myftp.runMethod(false,"UploadFile",mainmenu.processBA,(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("worker.db")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_myfolder,RemoteObject.createImmutable("worker.db"))));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2219;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath A";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 69;
return;
case 69:
//C
this.state = 25;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2220;BA.debugLine="Log(\"ftp_UploadCompleted Success = \" & Success";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721767",RemoteObject.concat(RemoteObject.createImmutable("ftp_UploadCompleted Success = "),_success),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
 BA.debugLineNum = 2222;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721769",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
;
 BA.debugLineNum = 2225;BA.debugLine="Dim fLogList As List = File.ListFiles(Starter.Sh";
Debug.ShouldStop(65536);
_floglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_floglist = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ));Debug.locals.put("fLogList", _floglist);Debug.locals.put("fLogList", _floglist);
 BA.debugLineNum = 2226;BA.debugLine="For n1=0 To fLogList.Size-1";
Debug.ShouldStop(131072);
if (true) break;

case 26:
//for
this.state = 39;
step39 = 1;
limit39 = RemoteObject.solve(new RemoteObject[] {_floglist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n1 = 0 ;
Debug.locals.put("n1", _n1);
this.state = 70;
if (true) break;

case 70:
//C
this.state = 39;
if ((step39 > 0 && _n1 <= limit39) || (step39 < 0 && _n1 >= limit39)) this.state = 28;
if (true) break;

case 71:
//C
this.state = 70;
_n1 = ((int)(0 + _n1 + step39)) ;
Debug.locals.put("n1", _n1);
if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 2227;BA.debugLine="Dim ff As String = fLogList.Get(n1)";
Debug.ShouldStop(262144);
_ff = BA.ObjectToString(_floglist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n1))));Debug.locals.put("ff", _ff);Debug.locals.put("ff", _ff);
 BA.debugLineNum = 2229;BA.debugLine="If (ff.EndsWith(\".log\")) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 29:
//if
this.state = 38;
if ((_ff.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".log")))).<Boolean>get().booleanValue()) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 2230;BA.debugLine="Try";
Debug.ShouldStop(2097152);
if (true) break;

case 32:
//try
this.state = 37;
this.catchState = 36;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 37;
this.catchState = 36;
 BA.debugLineNum = 2231;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.S";
Debug.ShouldStop(4194304);
_sf = _myftp.runMethod(false,"UploadFile",mainmenu.processBA,(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_ff),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_myfolder,_ff)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2232;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 72;
return;
case 72:
//C
this.state = 37;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2233;BA.debugLine="Log($\"ftp_UploadCompleted  FileName = ${ff}$";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721780",(RemoteObject.concat(RemoteObject.createImmutable("ftp_UploadCompleted  FileName = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ff))),RemoteObject.createImmutable("$ \" Success = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("$ "))),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
 BA.debugLineNum = 2236;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 2237;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721784",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
;
 if (true) break;

case 38:
//C
this.state = 71;
;
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
Debug.locals.put("n1", _n1);
;
 BA.debugLineNum = 2242;BA.debugLine="Dim fList As List = File.ListFiles(Starter.Inter";
Debug.ShouldStop(2);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_flist = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ));Debug.locals.put("fList", _flist);Debug.locals.put("fList", _flist);
 BA.debugLineNum = 2243;BA.debugLine="For n=0 To fList.Size-1";
Debug.ShouldStop(4);
if (true) break;

case 40:
//for
this.state = 53;
step53 = 1;
limit53 = RemoteObject.solve(new RemoteObject[] {_flist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 73;
if (true) break;

case 73:
//C
this.state = 53;
if ((step53 > 0 && _n <= limit53) || (step53 < 0 && _n >= limit53)) this.state = 42;
if (true) break;

case 74:
//C
this.state = 73;
_n = ((int)(0 + _n + step53)) ;
Debug.locals.put("n", _n);
if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2244;BA.debugLine="Dim ff As String = fList.Get(n)";
Debug.ShouldStop(8);
_ff = BA.ObjectToString(_flist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("ff", _ff);Debug.locals.put("ff", _ff);
 BA.debugLineNum = 2245;BA.debugLine="If (ff.EndsWith(\".png\")) Then";
Debug.ShouldStop(16);
if (true) break;

case 43:
//if
this.state = 52;
if ((_ff.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png")))).<Boolean>get().booleanValue()) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 2246;BA.debugLine="Try";
Debug.ShouldStop(32);
if (true) break;

case 46:
//try
this.state = 51;
this.catchState = 50;
this.state = 48;
if (true) break;

case 48:
//C
this.state = 51;
this.catchState = 50;
 BA.debugLineNum = 2247;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.I";
Debug.ShouldStop(64);
_sf = _myftp.runMethod(false,"UploadFile",mainmenu.processBA,(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ff),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_myfolder,_ff)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2248;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 75;
return;
case 75:
//C
this.state = 51;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2249;BA.debugLine="Log($\"ftp_UploadCompleted  FileName = ${ff}$";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721796",(RemoteObject.concat(RemoteObject.createImmutable("ftp_UploadCompleted  FileName = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ff))),RemoteObject.createImmutable("$ \" Success = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("$ "))),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 50:
//C
this.state = 51;
this.catchState = 0;
 BA.debugLineNum = 2251;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 2252;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721799",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
;
 if (true) break;

case 52:
//C
this.state = 74;
;
 if (true) break;
if (true) break;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2256;BA.debugLine="Try";
Debug.ShouldStop(32768);

case 53:
//try
this.state = 58;
this.catchState = 57;
this.state = 55;
if (true) break;

case 55:
//C
this.state = 58;
this.catchState = 57;
 BA.debugLineNum = 2257;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sha";
Debug.ShouldStop(65536);
_sf = _myftp.runMethod(false,"UploadFile",mainmenu.processBA,(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_myfolder,RemoteObject.createImmutable("evolutioncheck.db3"))));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2258;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath A";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 76;
return;
case 76:
//C
this.state = 58;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2259;BA.debugLine="Log(\"ftp_UploadCompleted Success = \" & Success)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721806",RemoteObject.concat(RemoteObject.createImmutable("ftp_UploadCompleted Success = "),_success),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
 BA.debugLineNum = 2261;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721808",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2264;BA.debugLine="Try";
Debug.ShouldStop(8388608);

case 58:
//try
this.state = 63;
this.catchState = 0;
this.catchState = 62;
this.state = 60;
if (true) break;

case 60:
//C
this.state = 63;
this.catchState = 62;
 BA.debugLineNum = 2265;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sha";
Debug.ShouldStop(16777216);
_sf = _myftp.runMethod(false,"UploadFile",mainmenu.processBA,(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("worker.db")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_myfolder,RemoteObject.createImmutable("worker.db"))));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2266;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath A";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 77;
return;
case 77:
//C
this.state = 63;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2267;BA.debugLine="Log(\"ftp_UploadCompleted Success = \" & Success";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721814",RemoteObject.concat(RemoteObject.createImmutable("ftp_UploadCompleted Success = "),_success),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 62:
//C
this.state = 63;
this.catchState = 0;
 BA.debugLineNum = 2269;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","627721816",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",mainmenu.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 63:
//C
this.state = 66;
this.catchState = 0;
;
 BA.debugLineNum = 2271;BA.debugLine="myFTP.Close";
Debug.ShouldStop(1073741824);
_myftp.runVoidMethod ("Close");
 if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 2273;BA.debugLine="myFTP.Close";
Debug.ShouldStop(1);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 2274;BA.debugLine="MsgboxAsync(\"Erro de comunicação! Operação cance";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Erro de comunicação! Operação cancelada.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta"))),mainmenu.processBA);
 BA.debugLineNum = 2275;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 66:
//C
this.state = -1;
;
 BA.debugLineNum = 2278;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2279;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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
public static void  _ftp_commandcompleted(RemoteObject _command,RemoteObject _success,RemoteObject _replycode,RemoteObject _replystring) throws Exception{
}
public static void  _uploadnewrequest2server(RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1476);
if (RapidSub.canDelegate("uploadnewrequest2server")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","uploadnewrequest2server", _tagcode, _items, _origin); return;}
ResumableSub_UploadNewRequest2Server rsub = new ResumableSub_UploadNewRequest2Server(null,_tagcode,_items,_origin);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UploadNewRequest2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _tagcode;
RemoteObject _items;
RemoteObject _origin;
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1476);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("items", _items);
Debug.locals.put("origin", _origin);
 BA.debugLineNum = 1477;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(16);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 1478;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(32);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 1479;BA.debugLine="ListOfMaps.Add(items)";
Debug.ShouldStop(64);
_listofmaps.runVoidMethod ("Add",(Object)((_items.getObject())));
 BA.debugLineNum = 1481;BA.debugLine="Dim params As Map";
Debug.ShouldStop(256);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1482;BA.debugLine="params.Initialize";
Debug.ShouldStop(512);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1483;BA.debugLine="params.Clear";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1484;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1485;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1486;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1487;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 1488;BA.debugLine="params.Put(\"origin\", origin)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)((_origin)));
 BA.debugLineNum = 1489;BA.debugLine="params.Put(\"data\", ListOfMaps)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 1490;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1491;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1492;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1493;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1494;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1495;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1496;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1498;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(33554432);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1499;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(67108864);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1500;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(134217728);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1502;BA.debugLine="Log(data)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624707098",_data,0);
 BA.debugLineNum = 1504;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(-2147483648);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/upload/request/new")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 1505;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1506;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(2);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1507;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(4);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,mainmenu.processBA,(Object)(BA.ObjectToString("")),(Object)(mainmenu.getObject()));
 BA.debugLineNum = 1508;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(8);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 1509;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(16);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1510;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadnewrequest2server"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1511;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 1512;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624707108",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1514;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(512);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1515;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 1517;BA.debugLine="Job.Release";
Debug.ShouldStop(4096);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1519;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(16384);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1520;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
Debug.ShouldStop(32768);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1523;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static void  _uploadnewrequestrel2server(RemoteObject _tagcode,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequestRel2Server (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1525);
if (RapidSub.canDelegate("uploadnewrequestrel2server")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","uploadnewrequestrel2server", _tagcode, _items); return;}
ResumableSub_UploadNewRequestRel2Server rsub = new ResumableSub_UploadNewRequestRel2Server(null,_tagcode,_items);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UploadNewRequestRel2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequestRel2Server(xevolution.vrcg.devdemov2400.mainmenu parent,RemoteObject _tagcode,RemoteObject _items) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;
RemoteObject _tagcode;
RemoteObject _items;
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequestRel2Server (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,1525);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("items", _items);
 BA.debugLineNum = 1526;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(2097152);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 1527;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(4194304);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 1528;BA.debugLine="ListOfMaps.Add(items)";
Debug.ShouldStop(8388608);
_listofmaps.runVoidMethod ("Add",(Object)((_items.getObject())));
 BA.debugLineNum = 1530;BA.debugLine="Dim params As Map";
Debug.ShouldStop(33554432);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1531;BA.debugLine="params.Initialize";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1532;BA.debugLine="params.Clear";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1533;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1534;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1535;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1536;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 1537;BA.debugLine="params.Put(\"data\", ListOfMaps)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 1538;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1539;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1540;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1541;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1542;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1543;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1544;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1546;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(512);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1547;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(1024);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1548;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(2048);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1550;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(8192);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/upload/request/rel-new")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 1551;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1552;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(32768);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1553;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(65536);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,mainmenu.processBA,(Object)(BA.ObjectToString("")),(Object)(mainmenu.getObject()));
 BA.debugLineNum = 1554;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(131072);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 1555;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(262144);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1556;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", mainmenu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "uploadnewrequestrel2server"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1557;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 1558;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624772641",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1560;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(8388608);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1561;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 1563;BA.debugLine="Job.Release";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1565;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(268435456);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1566;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1568;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static void  _windowstatusupdate() throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,596);
if (RapidSub.canDelegate("windowstatusupdate")) { xevolution.vrcg.devdemov2400.mainmenu.remoteMe.runUserSub(false, "mainmenu","windowstatusupdate"); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (mainmenu) ","mainmenu",6,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,596);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 597;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,mainmenu.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 598;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 599;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 600;BA.debugLine="StopService(UserService)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._userservice.getObject())));
 BA.debugLineNum = 601;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StopService",mainmenu.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 602;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mainmenu.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 603;BA.debugLine="Sleep(500)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mainmenu.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mainmenu", "windowstatusupdate"),BA.numberCast(int.class, 500));
this.state = 38;
return;
case 38:
//C
this.state = 4;
;
 BA.debugLineNum = 604;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 607;BA.debugLine="LockPanel.Visible = False   'ShareCode.MainLockPa";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lockpanel.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 608;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//try
this.state = 10;
this.catchState = 9;
this.state = 7;
if (true) break;

case 7:
//C
this.state = 10;
this.catchState = 9;
 BA.debugLineNum = 609;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeN";
Debug.ShouldStop(1);
parent.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 610;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
Debug.ShouldStop(2);
parent.mostCurrent._labelcopyright.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/ ));
 BA.debugLineNum = 611;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNa";
Debug.ShouldStop(4);
parent.mostCurrent._mainactiveuser.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ));
 BA.debugLineNum = 613;BA.debugLine="mainActiveUserSearch.Text = ShareCode.SESS_OPER_";
Debug.ShouldStop(16);
parent.mostCurrent._mainactiveusersearch.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ));
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 615;BA.debugLine="Log(\"Labels\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624182803",RemoteObject.createImmutable("Labels"),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 618;BA.debugLine="Try";
Debug.ShouldStop(512);

case 10:
//try
this.state = 19;
this.catchState = 0;
this.catchState = 18;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 18;
 BA.debugLineNum = 619;BA.debugLine="ButtonAppNetwork.Enabled = False";
Debug.ShouldStop(1024);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 620;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSi";
Debug.ShouldStop(2048);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 621;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(4096);
if (true) break;

case 13:
//if
this.state = 16;
if ((parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 622;BA.debugLine="ButtonAppNetwork.Enabled = True";
Debug.ShouldStop(8192);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 623;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOra";
Debug.ShouldStop(16384);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 16:
//C
this.state = 19;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
 BA.debugLineNum = 626;BA.debugLine="Log(\"ButtonAppNetwork\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624182814",RemoteObject.createImmutable("ButtonAppNetwork"),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 629;BA.debugLine="Try";
Debug.ShouldStop(1048576);

case 19:
//try
this.state = 28;
this.catchState = 0;
this.catchState = 27;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 27;
 BA.debugLineNum = 630;BA.debugLine="ButtonUserUnavailable.Enabled = False";
Debug.ShouldStop(2097152);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 631;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLi";
Debug.ShouldStop(4194304);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 632;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 22:
//if
this.state = 25;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._usr_state /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 633;BA.debugLine="ButtonUserUnavailable.Enabled = True";
Debug.ShouldStop(16777216);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 634;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorO";
Debug.ShouldStop(33554432);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colororange /*RemoteObject*/ );
 if (true) break;

case 25:
//C
this.state = 28;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
 BA.debugLineNum = 637;BA.debugLine="Log(\"ButtonUserUnavailable\")";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624182825",RemoteObject.createImmutable("ButtonUserUnavailable"),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 640;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);

case 28:
//try
this.state = 37;
this.catchState = 0;
this.catchState = 36;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 36;
 BA.debugLineNum = 642;BA.debugLine="ButtonActionPause.Enabled = False";
Debug.ShouldStop(2);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 643;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightS";
Debug.ShouldStop(4);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 645;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(16);
if (true) break;

case 31:
//if
this.state = 34;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 646;BA.debugLine="ButtonActionPause.Enabled = True";
Debug.ShouldStop(32);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 647;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorOrang";
Debug.ShouldStop(64);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colororange /*RemoteObject*/ );
 if (true) break;

case 34:
//C
this.state = 37;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
 BA.debugLineNum = 650;BA.debugLine="Log(\"ButtonActionPause\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","624182838",RemoteObject.createImmutable("ButtonActionPause"),0);
 if (true) break;
if (true) break;

case 37:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",mainmenu.processBA, e0.toString());}
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