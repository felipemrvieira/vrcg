package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class user_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,165);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","activity_create", _firsttime);}
RemoteObject _layoutview = RemoteObject.createImmutable("");
RemoteObject _userpage = RemoteObject.createImmutable("");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 165;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(32);
user.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = user.getObject();
 BA.debugLineNum = 167;BA.debugLine="IsFirstTime	 = FirstTime";
Debug.ShouldStop(64);
user._isfirsttime = _firsttime;
 BA.debugLineNum = 168;BA.debugLine="Dim LayOutView As String = \"userLayout\"";
Debug.ShouldStop(128);
_layoutview = BA.ObjectToString("userLayout");Debug.locals.put("LayOutView", _layoutview);Debug.locals.put("LayOutView", _layoutview);
 BA.debugLineNum = 169;BA.debugLine="Dim userPage As String = \"UserViewLayout\"";
Debug.ShouldStop(256);
_userpage = BA.ObjectToString("UserViewLayout");Debug.locals.put("userPage", _userpage);Debug.locals.put("userPage", _userpage);
 BA.debugLineNum = 171;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(1024);
if ((user.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 172;BA.debugLine="LayOutView = \"mobile_user_layout\"";
Debug.ShouldStop(2048);
_layoutview = BA.ObjectToString("mobile_user_layout");Debug.locals.put("LayOutView", _layoutview);
 BA.debugLineNum = 179;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(262144);
user._device.runVoidMethod ("SetScreenOrientation",user.processBA,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 181;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(1048576);
user._device.runVoidMethod ("SetScreenOrientation",user.processBA,(Object)(user.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 };
 BA.debugLineNum = 184;BA.debugLine="Activity.LoadLayout(LayOutView)";
Debug.ShouldStop(8388608);
user.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(_layoutview),user.mostCurrent.activityBA);
 BA.debugLineNum = 186;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(33554432);
if ((user.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 188;BA.debugLine="listsTabPanel.LoadLayout(\"phone_user_layout\", \"\"";
Debug.ShouldStop(134217728);
user.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("phone_user_layout")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 189;BA.debugLine="listsTabPanel.LoadLayout(\"UserDocumentsViewLayou";
Debug.ShouldStop(268435456);
user.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("UserDocumentsViewLayout")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 190;BA.debugLine="listsTabPanel.LoadLayout(\"UserEquipmentsViewLayo";
Debug.ShouldStop(536870912);
user.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("UserEquipmentsViewLayout")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 191;BA.debugLine="listsTabPanel.LoadLayout(\"phone_user_operators_l";
Debug.ShouldStop(1073741824);
user.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("phone_user_operators_layout")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 193;BA.debugLine="MenuPanelUserButton.Color = Consts.ColorMain";
Debug.ShouldStop(1);
user.mostCurrent._menupaneluserbutton.runVoidMethod ("setColor",user.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="MenuPanelDocsButtom.Color = Consts.ColorMain";
Debug.ShouldStop(2);
user.mostCurrent._menupaneldocsbuttom.runVoidMethod ("setColor",user.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="MenuPanelConsumablesButton.Color  = Consts.Color";
Debug.ShouldStop(4);
user.mostCurrent._menupanelconsumablesbutton.runVoidMethod ("setColor",user.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 196;BA.debugLine="MenuPanelOperatorsButton.Color  = Consts.ColorMa";
Debug.ShouldStop(8);
user.mostCurrent._menupaneloperatorsbutton.runVoidMethod ("setColor",user.mostCurrent._consts._colormain /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 199;BA.debugLine="listsTabPanel.LoadLayout(userPage, ShareCode.use";
Debug.ShouldStop(64);
user.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(_userpage),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._userlayoutpaneloper /*RemoteObject*/ )));
 BA.debugLineNum = 200;BA.debugLine="listsTabPanel.LoadLayout(\"UserDocumentsViewLayou";
Debug.ShouldStop(128);
user.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("UserDocumentsViewLayout")),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._userlayoutpaneldocsorg /*RemoteObject*/ )));
 BA.debugLineNum = 201;BA.debugLine="listsTabPanel.LoadLayout(\"UserEquipmentsViewLayo";
Debug.ShouldStop(256);
user.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("UserEquipmentsViewLayout")),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._userlayoutpanelconsum /*RemoteObject*/ )));
 };
 BA.debugLineNum = 206;BA.debugLine="If userPage = \"UserViewLayout\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_userpage,BA.ObjectToString("UserViewLayout"))) { 
 BA.debugLineNum = 207;BA.debugLine="userLabelFoto.Text = ShareCode.useruserLabelFoto";
Debug.ShouldStop(16384);
user.mostCurrent._userlabelfoto.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._useruserlabelfoto /*RemoteObject*/ ));
 BA.debugLineNum = 208;BA.debugLine="userLabelNome.Text = ShareCode.useruserLabelNome";
Debug.ShouldStop(32768);
user.mostCurrent._userlabelnome.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._useruserlabelnome /*RemoteObject*/ ));
 BA.debugLineNum = 209;BA.debugLine="userLabelOrganizacao.Text = ShareCode.useruserLa";
Debug.ShouldStop(65536);
user.mostCurrent._userlabelorganizacao.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._useruserlabelorganizacao /*RemoteObject*/ ));
 BA.debugLineNum = 210;BA.debugLine="userLabelCategoria.Text = ShareCode.useruserLabe";
Debug.ShouldStop(131072);
user.mostCurrent._userlabelcategoria.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._useruserlabelcategoria /*RemoteObject*/ ));
 BA.debugLineNum = 211;BA.debugLine="userLabelCodigoUser.text = ShareCode.useruserLab";
Debug.ShouldStop(262144);
user.mostCurrent._userlabelcodigouser.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._useruserlabelcodigouser /*RemoteObject*/ ));
 };
 BA.debugLineNum = 214;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(UserDocum";
Debug.ShouldStop(2097152);
user.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,user.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), user.mostCurrent._userdocumentsviewlayoutpanel.getObject()));
 BA.debugLineNum = 215;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(UserEquip";
Debug.ShouldStop(4194304);
user.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,user.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), user.mostCurrent._userequipmentsviewlayoutpanel.getObject()));
 BA.debugLineNum = 216;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(8388608);
if ((user.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 221;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(l";
Debug.ShouldStop(268435456);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group37 = user.mostCurrent._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._liststabpanel));
final int groupLen37 = group37.runMethod(true,"getSize").<Integer>get()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group37.runMethod(false,"Get",index37));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 222;BA.debugLine="lbl.Width = 33.33%x";
Debug.ShouldStop(536870912);
_lbl.runMethod(true,"setWidth",user.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33.33)),user.mostCurrent.activityBA));
 }
}Debug.locals.put("lbl", _lbl);
;
 };
 BA.debugLineNum = 226;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
Debug.ShouldStop(2);
user.mostCurrent._utils.runVoidMethod ("_maketabpaneleffect" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._colortabpanel),(Object)(user.mostCurrent._consts._colormaindarker /*RemoteObject*/ ),(Object)(user.mostCurrent._consts._colorsub /*RemoteObject*/ ));
 BA.debugLineNum = 227;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(4);
if (_firsttime.<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 232;BA.debugLine="ConfirmProducts = (ShareCode.UWDUKEY_PRODUCTS = 0";
Debug.ShouldStop(128);
user._confirmproducts = BA.ObjectToBoolean((RemoteObject.solveBoolean("=",user.mostCurrent._sharecode._uwdukey_products /*RemoteObject*/ ,BA.numberCast(double.class, 0))));
 BA.debugLineNum = 233;BA.debugLine="FirstDataLoad = True";
Debug.ShouldStop(256);
user._firstdataload = user.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 235;BA.debugLine="If Not(DialogLogin.IsInitialized) Then DialogLogi";
Debug.ShouldStop(1024);
if (user.mostCurrent.__c.runMethod(true,"Not",(Object)(user.mostCurrent._dialoglogin.runMethod(true,"IsInitialized" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
user.mostCurrent._dialoglogin.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);};
 BA.debugLineNum = 241;BA.debugLine="UpdateMainLayout";
Debug.ShouldStop(65536);
_updatemainlayout();
 BA.debugLineNum = 242;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(131072);
_windowstatusupdate();
 BA.debugLineNum = 243;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_KeyPress (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,267);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 267;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 268;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 269;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(4096);
if ((user.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 270;BA.debugLine="Return PhoneBackButtonTab";
Debug.ShouldStop(8192);
if (true) return _phonebackbuttontab();
 };
 BA.debugLineNum = 272;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(32768);
_listsbuttonclose_click();
 };
 BA.debugLineNum = 274;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return user.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Pause (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,262);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 262;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Resume (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,245);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","activity_resume");}
 BA.debugLineNum = 245;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="If (ShareCode.ISPHONE And IsFirstTime) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean(".",user.mostCurrent._sharecode._isphone /*RemoteObject*/ ) && RemoteObject.solveBoolean(".",user._isfirsttime))) { 
 BA.debugLineNum = 247;BA.debugLine="Panel1.Visible = False";
Debug.ShouldStop(4194304);
user.mostCurrent._panel1.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 248;BA.debugLine="MenuPanel.Visible = True";
Debug.ShouldStop(8388608);
user.mostCurrent._menupanel.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 249;BA.debugLine="IsFirstTime = False";
Debug.ShouldStop(16777216);
user._isfirsttime = user.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcarrunning_click() throws Exception{
try {
		Debug.PushSubsStack("butCarRunning_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1258);
if (RapidSub.canDelegate("butcarrunning_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butcarrunning_click");}
 BA.debugLineNum = 1258;BA.debugLine="Sub butCarRunning_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 1260;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butdocfilter_click() throws Exception{
try {
		Debug.PushSubsStack("butDocFilter_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1254);
if (RapidSub.canDelegate("butdocfilter_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butdocfilter_click");}
 BA.debugLineNum = 1254;BA.debugLine="Sub butDocFilter_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 1255;BA.debugLine="mDocPopMenu.OpenMenu()";
Debug.ShouldStop(64);
user.mostCurrent._mdocpopmenu.runVoidMethod ("_openmenu");
 BA.debugLineNum = 1256;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butequipfilter_click() throws Exception{
try {
		Debug.PushSubsStack("butEquipFilter_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1250);
if (RapidSub.canDelegate("butequipfilter_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butequipfilter_click");}
 BA.debugLineNum = 1250;BA.debugLine="Sub butEquipFilter_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1251;BA.debugLine="mEqipPopMenu.OpenMenu()";
Debug.ShouldStop(4);
user.mostCurrent._meqippopmenu.runVoidMethod ("_openmenu");
 BA.debugLineNum = 1252;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butequipsearch_click() throws Exception{
try {
		Debug.PushSubsStack("butEquipSearch_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1757);
if (RapidSub.canDelegate("butequipsearch_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butequipsearch_click");}
 BA.debugLineNum = 1757;BA.debugLine="Sub butEquipSearch_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1758;BA.debugLine="MakeEquipmentListSearch(EditEquipSearch.Text)";
Debug.ShouldStop(536870912);
_makeequipmentlistsearch(user.mostCurrent._editequipsearch.runMethod(true,"getText"));
 BA.debugLineNum = 1759;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butgroupcarchange_click() throws Exception{
try {
		Debug.PushSubsStack("butGroupCarChange_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2340);
if (RapidSub.canDelegate("butgroupcarchange_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butgroupcarchange_click");}
 BA.debugLineNum = 2340;BA.debugLine="Sub butGroupCarChange_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 2341;BA.debugLine="ListOfVehicles";
Debug.ShouldStop(16);
_listofvehicles();
 BA.debugLineNum = 2342;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butgroupceadd_click() throws Exception{
try {
		Debug.PushSubsStack("butGroupCEAdd_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1847);
if (RapidSub.canDelegate("butgroupceadd_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butgroupceadd_click");}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 1847;BA.debugLine="Sub butGroupCEAdd_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1848;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(8388608);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1849;BA.debugLine="Dim SQL As String = $\"select title, serialnumber,";
Debug.ShouldStop(16777216);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode not in (select equipment_tagcode from dta_equipments_technicals where technical_tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("')")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 1851;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(67108864);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 1852;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1853;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(268435456);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1854;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(536870912);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1855;BA.debugLine="Filter.getDoubleLineEquipmentsDialog(Activity, \"";
Debug.ShouldStop(1073741824);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getdoublelineequipmentsdialog" /*void*/ ,(Object)(user.mostCurrent._activity),(Object)(RemoteObject.createImmutable(("User"))),(Object)(BA.ObjectToString("Lista de equipamentos")),(Object)(_record),(Object)(RemoteObject.createImmutable("")));
 }else {
 BA.debugLineNum = 1857;BA.debugLine="MsgboxAsync(ShareCode.userNoEquipmentsReplace, S";
Debug.ShouldStop(1);
user.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._usernoequipmentsreplace /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),user.processBA);
 BA.debugLineNum = 1858;BA.debugLine="Record.Close";
Debug.ShouldStop(2);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 1860;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butgroupuregisteradd_click() throws Exception{
try {
		Debug.PushSubsStack("butGroupURegisterAdd_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2050);
if (RapidSub.canDelegate("butgroupuregisteradd_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butgroupuregisteradd_click");}
 BA.debugLineNum = 2050;BA.debugLine="Sub butGroupURegisterAdd_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 2051;BA.debugLine="DialogLogin.getLoginDialog2(\"User\")";
Debug.ShouldStop(4);
user.mostCurrent._dialoglogin.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getlogindialog2" /*void*/ ,(Object)((RemoteObject.createImmutable("User"))));
 BA.debugLineNum = 2052;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("ButtonActionPause_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1951);
if (RapidSub.canDelegate("buttonactionpause_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","buttonactionpause_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1951;BA.debugLine="Sub ButtonActionPause_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1952;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",user.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1954;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
Debug.ShouldStop(2);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._avisopararpausa /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1955;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1956;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(8);
user.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1957;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
Debug.ShouldStop(16);
user.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(user.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ));
 BA.debugLineNum = 1958;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(32);
user.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 1960;BA.debugLine="butUserPauseAction.TextColor = Consts.ColorOran";
Debug.ShouldStop(128);
user.mostCurrent._butuserpauseaction.runMethod(true,"setTextColor",user.mostCurrent._consts._colororange /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 1963;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(1024);
_windowstatusupdate();
 BA.debugLineNum = 1964;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonlistconfirm_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonListConfirm_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1695);
if (RapidSub.canDelegate("buttonlistconfirm_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","buttonlistconfirm_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 1695;BA.debugLine="Sub ButtonListConfirm_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1696;BA.debugLine="If (ShareCode.UWDUKEY_PRODUCTS =0) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",user.mostCurrent._sharecode._uwdukey_products /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1697;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(1);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 1698;BA.debugLine="Dim p As Panel = b.Parent";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _b.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 1699;BA.debugLine="If (b.Tag = 0) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",_b.runMethod(false,"getTag"),RemoteObject.createImmutable((0))))) { 
 BA.debugLineNum = 1700;BA.debugLine="b.Tag = 1";
Debug.ShouldStop(8);
_b.runMethod(false,"setTag",RemoteObject.createImmutable((1)));
 BA.debugLineNum = 1701;BA.debugLine="b.TextColor = Consts.ColorGreen";
Debug.ShouldStop(16);
_b.runMethod(true,"setTextColor",user.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1703;BA.debugLine="b.Tag = 0";
Debug.ShouldStop(64);
_b.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1704;BA.debugLine="b.TextColor = Consts.ColorLightSilver";
Debug.ShouldStop(128);
_b.runMethod(true,"setTextColor",user.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 };
 BA.debugLineNum = 1706;BA.debugLine="DBStructures.UpdateOrCreateWorkDayProduct(ShareC";
Debug.ShouldStop(512);
user.mostCurrent._dbstructures.runVoidMethod ("_updateorcreateworkdayproduct" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ),(Object)(BA.ObjectToString(_p.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag"))),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 1708;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonlistnotconfirm_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonListNotConfirm_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1710);
if (RapidSub.canDelegate("buttonlistnotconfirm_click")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","buttonlistnotconfirm_click"); return;}
ResumableSub_ButtonListNotConfirm_Click rsub = new ResumableSub_ButtonListNotConfirm_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonListNotConfirm_Click extends BA.ResumableSub {
public ResumableSub_ButtonListNotConfirm_Click(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _n = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonListNotConfirm_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1710);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1711;BA.debugLine="If (ShareCode.UWDUKEY_PRODUCTS =0) Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 18;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._uwdukey_products /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1712;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(32768);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), parent.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 1713;BA.debugLine="Dim p As Panel = b.Parent";
Debug.ShouldStop(65536);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _b.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 1714;BA.debugLine="Dim n As String = \"\"";
Debug.ShouldStop(131072);
_n = BA.ObjectToString("");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 1715;BA.debugLine="If (b.Tag = 0) Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 17;
if ((RemoteObject.solveBoolean("=",_b.runMethod(false,"getTag"),RemoteObject.createImmutable((0))))) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1716;BA.debugLine="b.Tag = 2";
Debug.ShouldStop(524288);
_b.runMethod(false,"setTag",RemoteObject.createImmutable((2)));
 BA.debugLineNum = 1717;BA.debugLine="b.TextColor = Consts.ColorRed";
Debug.ShouldStop(1048576);
_b.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 1719;BA.debugLine="Msgbox2Async(ShareCode.userAskProductAusente, S";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useraskproductausente /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._useroptionsimausente /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._useroptionoutrasrazoes /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),user.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1720;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", user.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "buttonlistnotconfirm_click"), null);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1721;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 1723;BA.debugLine="Else If (DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(67108864);
if (BA.ObjectToBoolean((parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")).<Integer>get().intValue()).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 1722;BA.debugLine="n = \"Produto ausente\"";
Debug.ShouldStop(33554432);
_n = BA.ObjectToString("Produto ausente");Debug.locals.put("n", _n);
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 1724;BA.debugLine="n = \"Outras razões\"";
Debug.ShouldStop(134217728);
_n = BA.ObjectToString("Outras razões");Debug.locals.put("n", _n);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1726;BA.debugLine="n = \"Sem justificação\"";
Debug.ShouldStop(536870912);
_n = BA.ObjectToString("Sem justificação");Debug.locals.put("n", _n);
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1729;BA.debugLine="b.Tag = 0";
Debug.ShouldStop(1);
_b.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1730;BA.debugLine="b.TextColor = Consts.ColorLightSilver";
Debug.ShouldStop(2);
_b.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 1732;BA.debugLine="DBStructures.UpdateOrCreateWorkDayProduct(ShareC";
Debug.ShouldStop(8);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateorcreateworkdayproduct" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ),(Object)(BA.ObjectToString(_p.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag"))),(Object)(_n));
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1734;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _buttonuserunavailable_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUserUnavailable_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1676);
if (RapidSub.canDelegate("buttonuserunavailable_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","buttonuserunavailable_click");}
 BA.debugLineNum = 1676;BA.debugLine="Sub ButtonUserUnavailable_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1677;BA.debugLine="CallUnavailableChange";
Debug.ShouldStop(4096);
_callunavailablechange();
 BA.debugLineNum = 1678;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butuserconfirmdata_click() throws Exception{
try {
		Debug.PushSubsStack("butUserConfirmData_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1461);
if (RapidSub.canDelegate("butuserconfirmdata_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butuserconfirmdata_click");}
RemoteObject _remainingitems = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1461;BA.debugLine="Sub butUserConfirmData_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1462;BA.debugLine="Dim remainingItems As Int = ProductsToConfirm-Con";
Debug.ShouldStop(2097152);
_remainingitems = RemoteObject.solve(new RemoteObject[] {user._productstoconfirm,_confirmedproducts()}, "-",1, 1);Debug.locals.put("remainingItems", _remainingitems);Debug.locals.put("remainingItems", _remainingitems);
 BA.debugLineNum = 1463;BA.debugLine="If (remainingItems > 0) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean(">",_remainingitems,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1464;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8388608);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1465;BA.debugLine="i = Msgbox2(ShareCode.userAskConfirmProducts, Sh";
Debug.ShouldStop(16777216);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._useraskconfirmproducts /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._option_continue /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._useroptionconfirmproduct /*RemoteObject*/ ),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1466;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1467;BA.debugLine="DBStructures.UpdateWorkingDayStatus(ShareCode.S";
Debug.ShouldStop(67108864);
user.mostCurrent._dbstructures.runVoidMethod ("_updateworkingdaystatus" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)));
 }else 
{ BA.debugLineNum = 1468;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
 BA.debugLineNum = 1469;BA.debugLine="DBStructures.UpdateWorkingDayStatus(ShareCode.S";
Debug.ShouldStop(268435456);
user.mostCurrent._dbstructures.runVoidMethod ("_updateworkingdaystatus" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));
 }else {
 }}
;
 }else {
 BA.debugLineNum = 1473;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1474;BA.debugLine="i = Msgbox2(ShareCode.userAskConfirmUserData, Sh";
Debug.ShouldStop(2);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._useraskconfirmuserdata /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._option_continue /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1475;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1476;BA.debugLine="DBStructures.UpdateWorkingDayStatus(ShareCode.S";
Debug.ShouldStop(8);
user.mostCurrent._dbstructures.runVoidMethod ("_updateworkingdaystatus" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));
 };
 };
 BA.debugLineNum = 1479;BA.debugLine="DBStructures.CheckWorkingDayTasks";
Debug.ShouldStop(64);
user.mostCurrent._dbstructures.runVoidMethod ("_checkworkingdaytasks" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1480;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(128);
_windowstatusupdate();
 BA.debugLineNum = 1481;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butuserestadoaction_click() throws Exception{
try {
		Debug.PushSubsStack("butUserEstadoAction_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2465);
if (RapidSub.canDelegate("butuserestadoaction_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butuserestadoaction_click");}
RemoteObject _reasons = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _causes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tipodlg = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 2465;BA.debugLine="Sub butUserEstadoAction_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 2467;BA.debugLine="Dim reasons As List";
Debug.ShouldStop(4);
_reasons = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("reasons", _reasons);
 BA.debugLineNum = 2468;BA.debugLine="reasons.Initialize";
Debug.ShouldStop(8);
_reasons.runVoidMethod ("Initialize");
 BA.debugLineNum = 2469;BA.debugLine="reasons.Addall(Array As String(\"Inicio Jornada\",\"";
Debug.ShouldStop(16);
_reasons.runVoidMethod ("AddAll",(Object)(user.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("Inicio Jornada"),BA.ObjectToString("Fim Jornada"),BA.ObjectToString("Inicio Pausa"),BA.ObjectToString("Fim Pausa"),RemoteObject.createImmutable("Indisponibilidade")})))));
 BA.debugLineNum = 2471;BA.debugLine="Dim causes As List";
Debug.ShouldStop(64);
_causes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("causes", _causes);
 BA.debugLineNum = 2472;BA.debugLine="causes.Initialize";
Debug.ShouldStop(128);
_causes.runVoidMethod ("Initialize");
 BA.debugLineNum = 2473;BA.debugLine="causes.AddAll(Array As String(\"Avaria/Atraso Tran";
Debug.ShouldStop(256);
_causes.runVoidMethod ("AddAll",(Object)(user.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString("Avaria/Atraso Transporte"),user.mostCurrent._sharecode._userreasonsdoente /*RemoteObject*/ ,user.mostCurrent._sharecode._userreasonsmedico /*RemoteObject*/ ,BA.ObjectToString("Tribunal"),user.mostCurrent._sharecode._userreasonsassist /*RemoteObject*/ ,BA.ObjectToString("Tribunal"),BA.ObjectToString("Luto"),BA.ObjectToString("FÉRIAS"),user.mostCurrent._sharecode._userreasonsoutras /*RemoteObject*/ })))));
 BA.debugLineNum = 2476;BA.debugLine="Dim TipoDlg As Int = 0";
Debug.ShouldStop(2048);
_tipodlg = BA.numberCast(int.class, 0);Debug.locals.put("TipoDlg", _tipodlg);Debug.locals.put("TipoDlg", _tipodlg);
 BA.debugLineNum = 2478;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(8192);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 2480;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(32768);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 2481;BA.debugLine="Filter.getuserRegistoManualJornada(\"User\", reason";
Debug.ShouldStop(65536);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getuserregistomanualjornada" /*void*/ ,(Object)(RemoteObject.createImmutable(("User"))),(Object)(_reasons),(Object)(_causes),(Object)(_tipodlg));
 BA.debugLineNum = 2483;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _butuserpauseaction_click() throws Exception{
try {
		Debug.PushSubsStack("butUserPauseAction_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2344);
if (RapidSub.canDelegate("butuserpauseaction_click")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butuserpauseaction_click"); return;}
ResumableSub_butUserPauseAction_Click rsub = new ResumableSub_butUserPauseAction_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butUserPauseAction_Click extends BA.ResumableSub {
public ResumableSub_butUserPauseAction_Click(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butUserPauseAction_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2344);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2345;BA.debugLine="If ShareCode.SESS_IN_PAUSE = 1 Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2346;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
Debug.ShouldStop(512);
_i = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisopararpausa /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 2347;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 13;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2348;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(2048);
parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2349;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ));
 BA.debugLineNum = 2350;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 2352;BA.debugLine="If ShareCode.PREVIOUS_STATUS = \"ON\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._previous_status /*RemoteObject*/ ,BA.ObjectToString("ON"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2353;BA.debugLine="butUserStartWork.TextColor = Consts.ColorGreen";
Debug.ShouldStop(65536);
parent.mostCurrent._butuserstartwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 BA.debugLineNum = 2354;BA.debugLine="ButtonUserUnavailable.Color = Consts.ColorGree";
Debug.ShouldStop(131072);
parent.mostCurrent._buttonuserunavailable.runVoidMethod ("setColor",parent.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2356;BA.debugLine="butUserStartWork.TextColor = Consts.ColorRed";
Debug.ShouldStop(524288);
parent.mostCurrent._butuserstartwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 2357;BA.debugLine="ButtonUserUnavailable.Color = Consts.ColorRed";
Debug.ShouldStop(1048576);
parent.mostCurrent._buttonuserunavailable.runVoidMethod ("setColor",parent.mostCurrent._consts._colorred /*RemoteObject*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 20;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2361;BA.debugLine="Msgbox2Async(ShareCode.AvisoIniciarPausa, ShareC";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoiniciarpausa /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),user.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2362;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", user.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "butuserpauseaction_click"), null);
this.state = 21;
return;
case 21:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2363;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2364;BA.debugLine="ShareCode.SESS_IN_PAUSE = 1";
Debug.ShouldStop(134217728);
parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 2365;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ));
 BA.debugLineNum = 2366;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(536870912);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 2370;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(2);
_windowstatusupdate();
 BA.debugLineNum = 2371;BA.debugLine="End Sub";
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
public static void  _butuserstartwork_click() throws Exception{
try {
		Debug.PushSubsStack("butUserStartWork_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2422);
if (RapidSub.canDelegate("butuserstartwork_click")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butuserstartwork_click"); return;}
ResumableSub_butUserStartWork_Click rsub = new ResumableSub_butUserStartWork_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butUserStartWork_Click extends BA.ResumableSub {
public ResumableSub_butUserStartWork_Click(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butUserStartWork_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2422);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2424;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_ON"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2425;BA.debugLine="MsgboxAsync(\"A Jornada já foi iniciada\",ShareCod";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("A Jornada já foi iniciada")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),user.processBA);
 BA.debugLineNum = 2426;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2429;BA.debugLine="Msgbox2Async(ShareCode.MsgUserStartJornada, \"JORN";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msguserstartjornada /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence("JORNADA")),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),user.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2430;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", user.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "butuserstartwork_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2431;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2432;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_20\", Me)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_20")),(Object)(user.getObject()));
 BA.debugLineNum = 2433;BA.debugLine="Sleep(250)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "butuserstartwork_click"),BA.numberCast(int.class, 250));
this.state = 10;
return;
case 10:
//C
this.state = 8;
;
 BA.debugLineNum = 2434;BA.debugLine="butUserStartWork.TextColor = Consts.ColorGreen";
Debug.ShouldStop(2);
parent.mostCurrent._butuserstartwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 BA.debugLineNum = 2435;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorGr";
Debug.ShouldStop(4);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 BA.debugLineNum = 2436;BA.debugLine="butUserStopWork.TextColor = Colors.Black";
Debug.ShouldStop(8);
parent.mostCurrent._butuserstopwork.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 2437;BA.debugLine="lblEstadoUserJornada.Text = ShareCode.MsgUserMes";
Debug.ShouldStop(16);
parent.mostCurrent._lblestadouserjornada.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgusermessagejornadaactivo /*RemoteObject*/ ));
 BA.debugLineNum = 2438;BA.debugLine="ShareCode.PREVIOUS_STATUS = \"ON\"";
Debug.ShouldStop(32);
parent.mostCurrent._sharecode._previous_status /*RemoteObject*/  = BA.ObjectToString("ON");
 BA.debugLineNum = 2439;BA.debugLine="File.WriteString(Starter.InternalFolder,$\"${Shar";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_ON")))),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,user.mostCurrent.activityBA)));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 2441;BA.debugLine="End Sub";
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
public static void  _butuserstopwork_click() throws Exception{
try {
		Debug.PushSubsStack("butUserStopWork_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2443);
if (RapidSub.canDelegate("butuserstopwork_click")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butuserstopwork_click"); return;}
ResumableSub_butUserStopWork_Click rsub = new ResumableSub_butUserStopWork_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butUserStopWork_Click extends BA.ResumableSub {
public ResumableSub_butUserStopWork_Click(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butUserStopWork_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2443);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2444;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_ON"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2445;BA.debugLine="File.Delete(Starter.InternalFolder,$\"${ShareCode";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_ON")))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2447;BA.debugLine="MsgboxAsync(\"A Jornada ainda nao foi iniciada\",S";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("A Jornada ainda nao foi iniciada")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),user.processBA);
 BA.debugLineNum = 2448;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2451;BA.debugLine="Msgbox2Async(ShareCode.MsgUserStopJornada, \"JORNA";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msguserstopjornada /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence("JORNADA")),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),user.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2452;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", user.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "butuserstopwork_click"), null);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2453;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2454;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_21\", Me)";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_21")),(Object)(user.getObject()));
 BA.debugLineNum = 2455;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "butuserstopwork_click"),BA.numberCast(int.class, 250));
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 2456;BA.debugLine="butUserStartWork.TextColor = Colors.Black";
Debug.ShouldStop(8388608);
parent.mostCurrent._butuserstartwork.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 2457;BA.debugLine="butUserStopWork.TextColor = Consts.ColorRed";
Debug.ShouldStop(16777216);
parent.mostCurrent._butuserstopwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 2458;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
Debug.ShouldStop(33554432);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 2459;BA.debugLine="lblEstadoUserJornada.Text = ShareCode.MsgUserMes";
Debug.ShouldStop(67108864);
parent.mostCurrent._lblestadouserjornada.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgusermessagejornadainactivo /*RemoteObject*/ ));
 BA.debugLineNum = 2460;BA.debugLine="ShareCode.PREVIOUS_STATUS = \"OFF\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._sharecode._previous_status /*RemoteObject*/  = BA.ObjectToString("OFF");
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 2463;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _butuserunavailable_click() throws Exception{
try {
		Debug.PushSubsStack("butUserUnavailable_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1483);
if (RapidSub.canDelegate("butuserunavailable_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butuserunavailable_click");}
RemoteObject _durations = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _reasons = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 1483;BA.debugLine="Sub butUserUnavailable_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1485;BA.debugLine="If (ShareCode.USR_STATE = 1) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",user.mostCurrent._sharecode._usr_state /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1486;BA.debugLine="Dim durations As List";
Debug.ShouldStop(8192);
_durations = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("durations", _durations);
 BA.debugLineNum = 1487;BA.debugLine="durations.Initialize";
Debug.ShouldStop(16384);
_durations.runVoidMethod ("Initialize");
 BA.debugLineNum = 1488;BA.debugLine="durations.Add(ShareCode.userdurationsHoje)";
Debug.ShouldStop(32768);
_durations.runVoidMethod ("Add",(Object)((user.mostCurrent._sharecode._userdurationshoje /*RemoteObject*/ )));
 BA.debugLineNum = 1489;BA.debugLine="durations.Add(ShareCode.userdurationsVarios)";
Debug.ShouldStop(65536);
_durations.runVoidMethod ("Add",(Object)((user.mostCurrent._sharecode._userdurationsvarios /*RemoteObject*/ )));
 BA.debugLineNum = 1491;BA.debugLine="Dim reasons As List";
Debug.ShouldStop(262144);
_reasons = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("reasons", _reasons);
 BA.debugLineNum = 1492;BA.debugLine="reasons.Initialize";
Debug.ShouldStop(524288);
_reasons.runVoidMethod ("Initialize");
 BA.debugLineNum = 1493;BA.debugLine="reasons.Add(ShareCode.userreasonsMedico)";
Debug.ShouldStop(1048576);
_reasons.runVoidMethod ("Add",(Object)((user.mostCurrent._sharecode._userreasonsmedico /*RemoteObject*/ )));
 BA.debugLineNum = 1494;BA.debugLine="reasons.Add(ShareCode.userreasonsAssist)";
Debug.ShouldStop(2097152);
_reasons.runVoidMethod ("Add",(Object)((user.mostCurrent._sharecode._userreasonsassist /*RemoteObject*/ )));
 BA.debugLineNum = 1495;BA.debugLine="reasons.Add(ShareCode.userreasonsDoente)";
Debug.ShouldStop(4194304);
_reasons.runVoidMethod ("Add",(Object)((user.mostCurrent._sharecode._userreasonsdoente /*RemoteObject*/ )));
 BA.debugLineNum = 1496;BA.debugLine="reasons.Add(ShareCode.userreasonsOutras)";
Debug.ShouldStop(8388608);
_reasons.runVoidMethod ("Add",(Object)((user.mostCurrent._sharecode._userreasonsoutras /*RemoteObject*/ )));
 BA.debugLineNum = 1498;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(33554432);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1499;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(67108864);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1500;BA.debugLine="Filter.getUserUnavailableDialog(\"User\", duration";
Debug.ShouldStop(134217728);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getuserunavailabledialog" /*void*/ ,(Object)(RemoteObject.createImmutable(("User"))),(Object)(_durations),(Object)(_reasons));
 }else {
 BA.debugLineNum = 1507;BA.debugLine="CallUnavailableChange";
Debug.ShouldStop(4);
_callunavailablechange();
 };
 BA.debugLineNum = 1509;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butwarehouses_click() throws Exception{
try {
		Debug.PushSubsStack("butWareHouses_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1246);
if (RapidSub.canDelegate("butwarehouses_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","butwarehouses_click");}
 BA.debugLineNum = 1246;BA.debugLine="Sub butWareHouses_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1247;BA.debugLine="mPopMenu.OpenMenu()";
Debug.ShouldStop(1073741824);
user.mostCurrent._mpopmenu.runVoidMethod ("_openmenu");
 BA.debugLineNum = 1248;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callmoreactionsagain(RemoteObject _currentclaitem) throws Exception{
try {
		Debug.PushSubsStack("CallMOREActionsAgain (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1862);
if (RapidSub.canDelegate("callmoreactionsagain")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","callmoreactionsagain", _currentclaitem);}
RemoteObject _tgo = RemoteObject.createImmutable("");
RemoteObject _carobj = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._carobject");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _itemstatus = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
Debug.locals.put("CurrentCLAItem", _currentclaitem);
 BA.debugLineNum = 1862;BA.debugLine="Public Sub CallMOREActionsAgain(CurrentCLAItem As";
Debug.ShouldStop(32);
 BA.debugLineNum = 1863;BA.debugLine="GoBackMOREActions = True";
Debug.ShouldStop(64);
user._gobackmoreactions = user.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1865;BA.debugLine="Dim tgo As String = \"TSKT-0003\"";
Debug.ShouldStop(256);
_tgo = BA.ObjectToString("TSKT-0003");Debug.locals.put("tgo", _tgo);Debug.locals.put("tgo", _tgo);
 BA.debugLineNum = 1867;BA.debugLine="If (ShareCode.SESS_CurrentCarObject.IsInitialized";
Debug.ShouldStop(1024);
if ((user.mostCurrent._sharecode._sess_currentcarobject /*RemoteObject*/ .getField(true,"IsInitialized" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1868;BA.debugLine="Dim CarObj As CarObject = ShareCode.SESS_Current";
Debug.ShouldStop(2048);
_carobj = user.mostCurrent._sharecode._sess_currentcarobject /*RemoteObject*/ ;Debug.locals.put("CarObj", _carobj);Debug.locals.put("CarObj", _carobj);
 }else {
 BA.debugLineNum = 1870;BA.debugLine="Dim CarObj As CarObject = Types.ClearedCarObject";
Debug.ShouldStop(8192);
_carobj = user.mostCurrent._types.runMethod(false,"_clearedcarobject" /*RemoteObject*/ ,user.mostCurrent.activityBA);Debug.locals.put("CarObj", _carobj);Debug.locals.put("CarObj", _carobj);
 };
 BA.debugLineNum = 1873;BA.debugLine="Dim sSQL As String = $\"select * from alerts where";
Debug.ShouldStop(65536);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select * from alerts where tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tgo))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1874;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(131072);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1875;BA.debugLine="Record = Starter.LocalSQL.ExecQuery($\"${sSQL}\"$)";
Debug.ShouldStop(262144);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1876;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1877;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(1048576);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1878;BA.debugLine="Dim ItemStatus As Int = Record.GetInt(\"itemstatu";
Debug.ShouldStop(2097152);
_itemstatus = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("itemstatus")));Debug.locals.put("ItemStatus", _itemstatus);Debug.locals.put("ItemStatus", _itemstatus);
 BA.debugLineNum = 1879;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(4194304);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1881;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(16777216);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1882;BA.debugLine="Filter.GetFastActionDialog(Activity, CurrentCLAI";
Debug.ShouldStop(33554432);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getfastactiondialog" /*void*/ ,(Object)(user.mostCurrent._activity),(Object)(_currentclaitem),(Object)(BA.ObjectToString("Verificação de viatura")),(Object)(_currentclaitem.getField(true,"Answer" /*RemoteObject*/ )),(Object)(_tgo),(Object)(_itemstatus),(Object)(user.mostCurrent.__c.getField(true,"False")),(Object)(_carobj));
 }else {
 BA.debugLineNum = 1884;BA.debugLine="Record.Close";
Debug.ShouldStop(134217728);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 1886;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _callunavailablechange() throws Exception{
try {
		Debug.PushSubsStack("CallUnavailableChange (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1680);
if (RapidSub.canDelegate("callunavailablechange")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","callunavailablechange"); return;}
ResumableSub_CallUnavailableChange rsub = new ResumableSub_CallUnavailableChange(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CallUnavailableChange extends BA.ResumableSub {
public ResumableSub_CallUnavailableChange(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cli = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CallUnavailableChange (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1680);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1682;BA.debugLine="Msgbox2Async(ShareCode.UserGoAvailableMessage, Sh";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usergoavailablemessage /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),user.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1683;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", user.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "callunavailablechange"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1684;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 1685;BA.debugLine="Dim cli As AppDialogs";
Debug.ShouldStop(1048576);
_cli = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 1686;BA.debugLine="cli.Initialize";
Debug.ShouldStop(2097152);
_cli.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1687;BA.debugLine="cli.MakeUserAvailable(\"User\")";
Debug.ShouldStop(4194304);
_cli.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_makeuseravailable" /*void*/ ,(Object)((RemoteObject.createImmutable("User"))));
 BA.debugLineNum = 1688;BA.debugLine="butUserUnavailable.TextColor = Colors.Black";
Debug.ShouldStop(8388608);
parent.mostCurrent._butuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 1689;BA.debugLine="butUserEstadoAction.TextColor = Colors.Black";
Debug.ShouldStop(16777216);
parent.mostCurrent._butuserestadoaction.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 1690;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLi";
Debug.ShouldStop(33554432);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1691;BA.debugLine="lblEstadoUserJornada.Text = \"Disponível\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._lblestadouserjornada.runMethod(true,"setText",BA.ObjectToCharSequence("Disponível"));
 if (true) break;

case 4:
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
public static RemoteObject  _cancelunavailable() throws Exception{
try {
		Debug.PushSubsStack("CancelUnavailable (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1672);
if (RapidSub.canDelegate("cancelunavailable")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","cancelunavailable");}
 BA.debugLineNum = 1672;BA.debugLine="Sub CancelUnavailable";
Debug.ShouldStop(128);
 BA.debugLineNum = 1673;BA.debugLine="Log(\"Canceled\")";
Debug.ShouldStop(256);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6196870145",RemoteObject.createImmutable("Canceled"),0);
 BA.debugLineNum = 1674;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _catitems_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("catitems_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1024);
if (RapidSub.canDelegate("catitems_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","catitems_click", _menuname);}
RemoteObject _filtername = RemoteObject.createImmutable("");
RemoteObject _filterid = RemoteObject.createImmutable(0);
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1024;BA.debugLine="Sub catitems_Click(MenuName As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1025;BA.debugLine="listEquipments.Clear";
Debug.ShouldStop(1);
user.mostCurrent._listequipments.runVoidMethod ("_clear");
 BA.debugLineNum = 1026;BA.debugLine="Dim FilterName As String = MenuName";
Debug.ShouldStop(2);
_filtername = _menuname;Debug.locals.put("FilterName", _filtername);Debug.locals.put("FilterName", _filtername);
 BA.debugLineNum = 1027;BA.debugLine="Dim FilterID As Int = 0";
Debug.ShouldStop(4);
_filterid = BA.numberCast(int.class, 0);Debug.locals.put("FilterID", _filterid);Debug.locals.put("FilterID", _filterid);
 BA.debugLineNum = 1028;BA.debugLine="If Not(FilterName.ToUpperCase = \"TODOS\") Then";
Debug.ShouldStop(8);
if (user.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_filtername.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("TODOS"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1029;BA.debugLine="FilterID = DBStructures.GetIDFrom(\"warehouses_ca";
Debug.ShouldStop(16);
_filterid = user.mostCurrent._dbstructures.runMethod(true,"_getidfrom" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("warehouses_categories")),(Object)(BA.ObjectToString("title")),(Object)(_filtername));Debug.locals.put("FilterID", _filterid);
 };
 BA.debugLineNum = 1031;BA.debugLine="MakeEquipmentsList(FilterID)";
Debug.ShouldStop(64);
_makeequipmentslist(_filterid);
 BA.debugLineNum = 1032;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changeuserequipment(RemoteObject _oldtagcode,RemoteObject _newtagcode) throws Exception{
try {
		Debug.PushSubsStack("ChangeUserEquipment (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1368);
if (RapidSub.canDelegate("changeuserequipment")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","changeuserequipment", _oldtagcode, _newtagcode);}
Debug.locals.put("oldtagcode", _oldtagcode);
Debug.locals.put("newtagcode", _newtagcode);
 BA.debugLineNum = 1368;BA.debugLine="Sub ChangeUserEquipment(oldtagcode As String, newt";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1369;BA.debugLine="If oldtagcode = \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_oldtagcode,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1370;BA.debugLine="DBStructures.insertUserEquipment(ShareCode.SESS_";
Debug.ShouldStop(33554432);
user.mostCurrent._dbstructures.runVoidMethod ("_insertuserequipment" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_newtagcode));
 }else {
 BA.debugLineNum = 1372;BA.debugLine="DBStructures.updateUserEquipment(ShareCode.SESS_";
Debug.ShouldStop(134217728);
user.mostCurrent._dbstructures.runVoidMethod ("_updateuserequipment" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_newtagcode),(Object)(_oldtagcode));
 };
 BA.debugLineNum = 1375;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
Debug.ShouldStop(1073741824);
_createuserdetailsdata(user.mostCurrent.__c.getField(true,"True"),user.mostCurrent._currentcarid);
 BA.debugLineNum = 1377;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changeuseroperation(RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("ChangeUserOperation (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1979);
if (RapidSub.canDelegate("changeuseroperation")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","changeuseroperation", _tagcode);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _nsql = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _usercodename = RemoteObject.createImmutable("");
RemoteObject _photo = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
 BA.debugLineNum = 1979;BA.debugLine="Sub ChangeUserOperation(tagcode As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1981;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.UserWorkSessionC";
Debug.ShouldStop(268435456);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._userworksessionchange /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalnotetitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1982;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1984;BA.debugLine="userPhoto.Background = Null";
Debug.ShouldStop(-2147483648);
user.mostCurrent._userphoto.runMethod(false,"setBackground",(user.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 1986;BA.debugLine="Dim nSQL As String = $\"select a.*, ifnull(c.phot";
Debug.ShouldStop(2);
_nsql = (RemoteObject.concat(RemoteObject.createImmutable("select a.*, ifnull(c.photo, ifnull(a.foto, '')) as photo \n"),RemoteObject.createImmutable("			from dta_technicals as a\n"),RemoteObject.createImmutable("			inner join aut_users as b on (b.tagcode=a.user_tagcode)\n"),RemoteObject.createImmutable("			inner join aut_users_details as c on (c.user_tagcode=a.user_tagcode)\n"),RemoteObject.createImmutable("			where a.tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("nSQL", _nsql);Debug.locals.put("nSQL", _nsql);
 BA.debugLineNum = 1991;BA.debugLine="Log(nSQL)";
Debug.ShouldStop(64);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6198049804",_nsql,0);
 BA.debugLineNum = 1992;BA.debugLine="Private Row As Int = 0";
Debug.ShouldStop(128);
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 1993;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(256);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1994;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(nSQL)";
Debug.ShouldStop(512);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_nsql)));
 BA.debugLineNum = 1995;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1996;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(2048);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 1997;BA.debugLine="Dim userCodeName As String = Utils.IfNullOrEmpt";
Debug.ShouldStop(4096);
_usercodename = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("userCodeName", _usercodename);Debug.locals.put("userCodeName", _usercodename);
 BA.debugLineNum = 1998;BA.debugLine="Dim photo As String = Utils.IfNullOrEmpty(Recor";
Debug.ShouldStop(8192);
_photo = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("photo")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("photo", _photo);Debug.locals.put("photo", _photo);
 BA.debugLineNum = 1999;BA.debugLine="Dim title As String = Utils.IfNullOrEmpty(Recor";
Debug.ShouldStop(16384);
_title = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("jobtitle")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 2000;BA.debugLine="Dim tagcode As String = Utils.IfNullOrEmpty(Rec";
Debug.ShouldStop(32768);
_tagcode = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 2001;BA.debugLine="Dim name As String = Utils.IfNullOrEmpty(Record";
Debug.ShouldStop(65536);
_name = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 };
 BA.debugLineNum = 2003;BA.debugLine="Record.Close";
Debug.ShouldStop(262144);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2005;BA.debugLine="userCategory.text = title";
Debug.ShouldStop(1048576);
user.mostCurrent._usercategory.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 2006;BA.debugLine="userCode.Text = userCodeName";
Debug.ShouldStop(2097152);
user.mostCurrent._usercode.runMethod(true,"setText",BA.ObjectToCharSequence(_usercodename));
 BA.debugLineNum = 2008;BA.debugLine="userName.text = name";
Debug.ShouldStop(8388608);
user.mostCurrent._username.runMethod(true,"setText",BA.ObjectToCharSequence(_name));
 BA.debugLineNum = 2009;BA.debugLine="userTagcode.text = tagcode";
Debug.ShouldStop(16777216);
user.mostCurrent._usertagcode.runMethod(true,"setText",BA.ObjectToCharSequence(_tagcode));
 BA.debugLineNum = 2010;BA.debugLine="If Not(Utils.isNullOrEmpty(photo)) Then";
Debug.ShouldStop(33554432);
if (user.mostCurrent.__c.runMethod(true,"Not",(Object)(user.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_photo)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2011;BA.debugLine="photo = photo.Replace(\"data:image/png;base64,\",";
Debug.ShouldStop(67108864);
_photo = _photo.runMethod(true,"replace",(Object)(BA.ObjectToString("data:image/png;base64,")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("photo", _photo);
 BA.debugLineNum = 2012;BA.debugLine="userPhoto.SetBackgroundImage(Utils.B64ToBitmap(";
Debug.ShouldStop(134217728);
user.mostCurrent._userphoto.runVoidMethod ("SetBackgroundImageNew",(Object)((user.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_photo)).getObject())));
 };
 BA.debugLineNum = 2042;BA.debugLine="ShareCode.SESS_OPER_User = tagcode";
Debug.ShouldStop(33554432);
user.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/  = _tagcode;
 BA.debugLineNum = 2043;BA.debugLine="ShareCode.SESS_OPER_UserName = name";
Debug.ShouldStop(67108864);
user.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/  = _name;
 BA.debugLineNum = 2044;BA.debugLine="ShareCode.SESS_OPER_UWDUKEY = userCodeName";
Debug.ShouldStop(134217728);
user.mostCurrent._sharecode._sess_oper_uwdukey /*RemoteObject*/  = _usercodename;
 BA.debugLineNum = 2045;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(268435456);
_windowstatusupdate();
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
public static void  _changeuservehicle(RemoteObject _oldtagcode,RemoteObject _newtagcode) throws Exception{
try {
		Debug.PushSubsStack("ChangeUserVehicle (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1380);
if (RapidSub.canDelegate("changeuservehicle")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","changeuservehicle", _oldtagcode, _newtagcode); return;}
ResumableSub_ChangeUserVehicle rsub = new ResumableSub_ChangeUserVehicle(null,_oldtagcode,_newtagcode);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ChangeUserVehicle extends BA.ResumableSub {
public ResumableSub_ChangeUserVehicle(xevolution.vrcg.devdemov2400.user parent,RemoteObject _oldtagcode,RemoteObject _newtagcode) {
this.parent = parent;
this._oldtagcode = _oldtagcode;
this._newtagcode = _newtagcode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _oldtagcode;
RemoteObject _newtagcode;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _confuser = RemoteObject.createImmutable("");
RemoteObject _nsql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _vehicleplate = RemoteObject.createImmutable("");
RemoteObject _vehicle = RemoteObject.createImmutable("");
RemoteObject _vmodel = RemoteObject.createImmutable("");
RemoteObject _vehicle_tagcode = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ChangeUserVehicle (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1380);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("oldtagcode", _oldtagcode);
Debug.locals.put("newtagcode", _newtagcode);
 BA.debugLineNum = 1382;BA.debugLine="DBStructures.updateUserVehicle(ShareCode.SESS_Use";
Debug.ShouldStop(32);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateuservehicle" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_newtagcode));
 BA.debugLineNum = 1383;BA.debugLine="Sleep(200)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "changeuservehicle"),BA.numberCast(int.class, 200));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
 BA.debugLineNum = 1385;BA.debugLine="Dim params As Map";
Debug.ShouldStop(256);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1386;BA.debugLine="params.Initialize";
Debug.ShouldStop(512);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1387;BA.debugLine="params.Clear";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1388;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1389;BA.debugLine="params.Put(\"_user\",ShareCode.SESS_OPER_User)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 1390;BA.debugLine="params.Put(\"_keyCar\",newtagcode)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_keyCar"))),(Object)((_newtagcode)));
 BA.debugLineNum = 1391;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1392;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1393;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1394;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1395;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1396;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1398;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(2097152);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1399;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(4194304);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1400;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(8388608);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1401;BA.debugLine="Log(data)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196345877",_data,0);
 BA.debugLineNum = 1402;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(33554432);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1403;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,user.processBA,(Object)(BA.ObjectToString("")),(Object)(user.getObject()));
 BA.debugLineNum = 1406;BA.debugLine="Dim ConfUser As String = $\"https://${ShareCode.AP";
Debug.ShouldStop(536870912);
_confuser = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/mobile/user/carchange")));Debug.locals.put("ConfUser", _confuser);Debug.locals.put("ConfUser", _confuser);
 BA.debugLineNum = 1407;BA.debugLine="Log(ConfUser)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196345883",_confuser,0);
 BA.debugLineNum = 1408;BA.debugLine="Job.PostString(ConfUser, data )";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_confuser),(Object)(_data));
 BA.debugLineNum = 1409;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(1);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1411;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", user.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "changeuservehicle"), (_job));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1412;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 1413;BA.debugLine="Log($\"Carro alterado: ${newtagcode}\"$)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196345889",(RemoteObject.concat(RemoteObject.createImmutable("Carro alterado: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newtagcode))),RemoteObject.createImmutable(""))),0);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1415;BA.debugLine="Job.Release";
Debug.ShouldStop(64);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1417;BA.debugLine="Dim nSQL As String = $\"Select ifnull(e1.value, ''";
Debug.ShouldStop(256);
_nsql = (RemoteObject.concat(RemoteObject.createImmutable("Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo,  ifnull(a.vehicle_tagcode,'') As vehicle_tagcode,\n"),RemoteObject.createImmutable("			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, a.*\n"),RemoteObject.createImmutable("			from dta_technicals as a\n"),RemoteObject.createImmutable("			left join dta_objects as d on (d.tagcode=a.vehicle_tagcode)\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e1 on (e1.object_tagcode=d.tagcode and e1.field_tagcode='FIELD_MARCA')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e2 on (e2.object_tagcode=d.tagcode and e2.field_tagcode='FIELD_MODELO')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e3 on (e3.object_tagcode=d.tagcode and e3.field_tagcode='FIELD_MATRICULA')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e4 on (e4.object_tagcode=d.tagcode and e4.field_tagcode='FIELD_KM')\n"),RemoteObject.createImmutable("			where a.tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("nSQL", _nsql);Debug.locals.put("nSQL", _nsql);
 BA.debugLineNum = 1426;BA.debugLine="Log(nSQL)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196345902",_nsql,0);
 BA.debugLineNum = 1427;BA.debugLine="Dim Record As Cursor = Starter.LocalSQLEVC.ExecQu";
Debug.ShouldStop(262144);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_nsql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1428;BA.debugLine="Dim tagcode As String = \"\"";
Debug.ShouldStop(524288);
_tagcode = BA.ObjectToString("");Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1429;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1430;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(2097152);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1431;BA.debugLine="Dim vehicleplate As String = Utils.IfNullOrEmpty";
Debug.ShouldStop(4194304);
_vehicleplate = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmatricula")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicleplate", _vehicleplate);Debug.locals.put("vehicleplate", _vehicleplate);
 BA.debugLineNum = 1432;BA.debugLine="Dim vehicle As String = Utils.IfNullOrEmpty(Reco";
Debug.ShouldStop(8388608);
_vehicle = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmarca")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicle", _vehicle);Debug.locals.put("vehicle", _vehicle);
 BA.debugLineNum = 1433;BA.debugLine="Dim vmodel As String = Utils.IfNullOrEmpty(Recor";
Debug.ShouldStop(16777216);
_vmodel = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmodelo")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vmodel", _vmodel);Debug.locals.put("vmodel", _vmodel);
 BA.debugLineNum = 1434;BA.debugLine="Dim tagcode As String = Utils.IfNullOrEmpty(Reco";
Debug.ShouldStop(33554432);
_tagcode = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1435;BA.debugLine="Dim vehicle_tagcode As String = Utils.IfNullOrEm";
Debug.ShouldStop(67108864);
_vehicle_tagcode = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vehicle_tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicle_tagcode", _vehicle_tagcode);Debug.locals.put("vehicle_tagcode", _vehicle_tagcode);
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1438;BA.debugLine="Record.Close";
Debug.ShouldStop(536870912);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1440;BA.debugLine="If (Utils.NNE(tagcode)) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//if
this.state = 12;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_tagcode))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1441;BA.debugLine="CurrentCarID = Types.NewAutoIdentification(tagco";
Debug.ShouldStop(1);
parent.mostCurrent._currentcarid = parent.mostCurrent._types.runMethod(false,"_newautoidentification" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_vehicle_tagcode),(Object)(_vehicleplate),(Object)(_vehicle),(Object)(_vmodel));
 BA.debugLineNum = 1442;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
Debug.ShouldStop(2);
_createuserdetailsdata(parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent._currentcarid);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1446;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static RemoteObject  _confirmedproducts() throws Exception{
try {
		Debug.PushSubsStack("ConfirmedProducts (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1736);
if (RapidSub.canDelegate("confirmedproducts")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","confirmedproducts");}
RemoteObject _ret = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _b1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _b2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 1736;BA.debugLine="Sub ConfirmedProducts As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 1737;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(256);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1738;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(512);
if (user.mostCurrent.__c.runMethod(true,"Not",(Object)(user.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1739;BA.debugLine="For i=0 To listEquipments.GetSize-1";
Debug.ShouldStop(1024);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {user.mostCurrent._listequipments.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1740;BA.debugLine="Dim p As Panel = listEquipments.GetPanel(i)";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), user.mostCurrent._listequipments.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 1741;BA.debugLine="Dim b1 As Button = p.GetView(7) 'ButtonListConf";
Debug.ShouldStop(4096);
_b1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 7))).getObject());Debug.locals.put("b1", _b1);
 BA.debugLineNum = 1742;BA.debugLine="Dim b2 As Button = p.GetView(8) 'ButtonListNotC";
Debug.ShouldStop(8192);
_b2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 8))).getObject());Debug.locals.put("b2", _b2);
 BA.debugLineNum = 1743;BA.debugLine="If (b1.Tag > 0) Or (b2.Tag > 0) Then ret = ret";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",BA.numberCast(double.class, _b1.runMethod(false,"getTag")),BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",BA.numberCast(double.class, _b2.runMethod(false,"getTag")),BA.numberCast(double.class, 0)))))) { 
_ret = RemoteObject.solve(new RemoteObject[] {_ret,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ret", _ret);};
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1746;BA.debugLine="Return ret";
Debug.ShouldStop(131072);
if (true) return _ret;
 BA.debugLineNum = 1747;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchapter(RemoteObject _clr,RemoteObject _title,RemoteObject _layout,RemoteObject _id,RemoteObject _idx,RemoteObject _expanded,RemoteObject _iscar,RemoteObject _showbut,RemoteObject _carobj) throws Exception{
try {
		Debug.PushSubsStack("CreateChapter (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,668);
if (RapidSub.canDelegate("createchapter")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","createchapter", _clr, _title, _layout, _id, _idx, _expanded, _iscar, _showbut, _carobj);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("clr", _clr);
Debug.locals.put("Title", _title);
Debug.locals.put("layout", _layout);
Debug.locals.put("id", _id);
Debug.locals.put("idx", _idx);
Debug.locals.put("Expanded", _expanded);
Debug.locals.put("isCar", _iscar);
Debug.locals.put("showBut", _showbut);
Debug.locals.put("carObj", _carobj);
 BA.debugLineNum = 668;BA.debugLine="Sub CreateChapter(clr As Int, Title As String, lay";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 669;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = user.mostCurrent._xui.runMethod(false,"CreatePanel",user.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 670;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, UserListView.sv.widt";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(user.mostCurrent._userlistview.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_id.getField(true,"ExpandedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 671;BA.debugLine="p.LoadLayout(layout)";
Debug.ShouldStop(1073741824);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(_layout),user.mostCurrent.activityBA);
 BA.debugLineNum = 672;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, p.Width,id.Collapsed";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_id.getField(true,"CollapsedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 673;BA.debugLine="lblGroupTitle.Text = Title";
Debug.ShouldStop(1);
user.mostCurrent._lblgrouptitle.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 674;BA.debugLine="lblGroupTitle.Tag = idx";
Debug.ShouldStop(2);
user.mostCurrent._lblgrouptitle.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 675;BA.debugLine="pnlGroupTitle.Tag = idx";
Debug.ShouldStop(4);
user.mostCurrent._pnlgrouptitle.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 676;BA.debugLine="butGroupCollpseExpand.Tag = idx";
Debug.ShouldStop(8);
user.mostCurrent._butgroupcollpseexpand.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 677;BA.debugLine="If (isCar) Then";
Debug.ShouldStop(16);
if ((_iscar).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 678;BA.debugLine="butGroupCarChange.Tag = carObj";
Debug.ShouldStop(32);
user.mostCurrent._butgroupcarchange.runMethod(false,"setTag",(_carobj));
 BA.debugLineNum = 679;BA.debugLine="butGroupCarChange.Visible = showBut";
Debug.ShouldStop(64);
user.mostCurrent._butgroupcarchange.runMethod(true,"setVisible",_showbut);
 };
 BA.debugLineNum = 681;BA.debugLine="p.Tag = Expanded 'collapsed";
Debug.ShouldStop(256);
_p.runMethod(false,"setTag",(_expanded));
 BA.debugLineNum = 682;BA.debugLine="Return p";
Debug.ShouldStop(512);
if (true) return _p;
 BA.debugLineNum = 683;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdoclistitem(RemoteObject _cnt,RemoteObject _recordr,RemoteObject _width,RemoteObject _height,RemoteObject _bd) throws Exception{
try {
		Debug.PushSubsStack("CreateDocListItem (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,826);
if (RapidSub.canDelegate("createdoclistitem")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","createdoclistitem", _cnt, _recordr, _width, _height, _bd);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _document = RemoteObject.createImmutable("");
RemoteObject _valid = RemoteObject.createImmutable("");
RemoteObject _grouptype = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("Recordr", _recordr);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("bd", _bd);
 BA.debugLineNum = 826;BA.debugLine="Sub CreateDocListItem(cnt As Int, Recordr As Curso";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 827;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(67108864);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 828;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("Initialize",user.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 829;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(268435456);
user.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 830;BA.debugLine="p.LoadLayout(\"user_DocumentItem\")";
Debug.ShouldStop(536870912);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("user_DocumentItem")),user.mostCurrent.activityBA);
 BA.debugLineNum = 831;BA.debugLine="p.RemoveView";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 833;BA.debugLine="Dim Document As String = Utils.IfNullOrEmpty(Reco";
Debug.ShouldStop(1);
_document = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_recordr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Document", _document);Debug.locals.put("Document", _document);
 BA.debugLineNum = 834;BA.debugLine="Dim Valid As String = Utils.IfNullOrEmpty(Recordr";
Debug.ShouldStop(2);
_valid = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_recordr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valid_to")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Valid", _valid);Debug.locals.put("Valid", _valid);
 BA.debugLineNum = 835;BA.debugLine="Dim GroupType As String = Utils.IfNullOrEmpty(Rec";
Debug.ShouldStop(4);
_grouptype = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_recordr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("doctype_title")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("GroupType", _grouptype);Debug.locals.put("GroupType", _grouptype);
 BA.debugLineNum = 836;BA.debugLine="Dim tagcode As String = Recordr.GetString(\"tagcod";
Debug.ShouldStop(8);
_tagcode = _recordr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 837;BA.debugLine="Dim FileName As String = Utils.IfNullOrEmpty(Reco";
Debug.ShouldStop(16);
_filename = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_recordr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("doc_filename")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 838;BA.debugLine="p.Tag = FileName";
Debug.ShouldStop(32);
_p.runMethod(false,"setTag",(_filename));
 BA.debugLineNum = 839;BA.debugLine="ListItemTitle.text = Document";
Debug.ShouldStop(64);
user.mostCurrent._listitemtitle.runMethod(true,"setText",BA.ObjectToCharSequence(_document));
 BA.debugLineNum = 840;BA.debugLine="ListItemInformation.text =  $\"${GroupType} - ${Fi";
Debug.ShouldStop(128);
user.mostCurrent._listiteminformation.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_grouptype))),RemoteObject.createImmutable(" - "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 841;BA.debugLine="ListItemDates.text = Valid";
Debug.ShouldStop(256);
user.mostCurrent._listitemdates.runMethod(true,"setText",BA.ObjectToCharSequence(_valid));
 BA.debugLineNum = 842;BA.debugLine="ListItemDocView.Tag = FileName";
Debug.ShouldStop(512);
user.mostCurrent._listitemdocview.runMethod(false,"setTag",(_filename));
 BA.debugLineNum = 843;BA.debugLine="ListItemRefresh.Tag = tagcode";
Debug.ShouldStop(1024);
user.mostCurrent._listitemrefresh.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 844;BA.debugLine="If FileName.EndsWith(\"pdf\") Then";
Debug.ShouldStop(2048);
if (_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("pdf"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 845;BA.debugLine="ListItemDocView.text = Chr(0xF1C1)";
Debug.ShouldStop(4096);
user.mostCurrent._listitemdocview.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1c1)))));
 }else 
{ BA.debugLineNum = 846;BA.debugLine="else if FileName.EndsWith (\"xls\") Or FileName.End";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("xls")))) || RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("xlsx"))))) { 
 BA.debugLineNum = 847;BA.debugLine="ListItemDocView.Text = Chr(0xF1C3)";
Debug.ShouldStop(16384);
user.mostCurrent._listitemdocview.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1c3)))));
 }else 
{ BA.debugLineNum = 848;BA.debugLine="Else If FileName.EndsWith (\"doc\") Or FileName.End";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("doc")))) || RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("docx"))))) { 
 BA.debugLineNum = 849;BA.debugLine="ListItemDocView.Text = Chr(0xF1C2)";
Debug.ShouldStop(65536);
user.mostCurrent._listitemdocview.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1c2)))));
 }else 
{ BA.debugLineNum = 850;BA.debugLine="Else If FileName.EndsWith (\"jpg\") Or FileName.End";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("jpg")))) || RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("png"))))) { 
 BA.debugLineNum = 851;BA.debugLine="ListItemDocView.Text = Chr(0xF1C5)";
Debug.ShouldStop(262144);
user.mostCurrent._listitemdocview.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1c5)))));
 }else {
 BA.debugLineNum = 853;BA.debugLine="ListItemDocView.Text = Chr(0xF016)";
Debug.ShouldStop(1048576);
user.mostCurrent._listitemdocview.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf016)))));
 }}}}
;
 BA.debugLineNum = 859;BA.debugLine="Return p";
Debug.ShouldStop(67108864);
if (true) return _p;
 BA.debugLineNum = 860;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createequiplistitem(RemoteObject _cnt,RemoteObject _record,RemoteObject _width,RemoteObject _height,RemoteObject _bd) throws Exception{
try {
		Debug.PushSubsStack("CreateEquipListItem (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1043);
if (RapidSub.canDelegate("createequiplistitem")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","createequiplistitem", _cnt, _record, _width, _height, _bd);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _qtd = RemoteObject.createImmutable(0);
RemoteObject _notes = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _category = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _minqtd = RemoteObject.createImmutable(0);
Debug.locals.put("cnt", _cnt);
Debug.locals.put("Record", _record);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("bd", _bd);
 BA.debugLineNum = 1043;BA.debugLine="Sub CreateEquipListItem(cnt As Int, Record As Curs";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1044;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1045;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1048576);
_p.runVoidMethod ("Initialize",user.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1046;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(2097152);
user.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 1047;BA.debugLine="p.LoadLayout(\"user_EquipmentItem\")";
Debug.ShouldStop(4194304);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("user_EquipmentItem")),user.mostCurrent.activityBA);
 BA.debugLineNum = 1048;BA.debugLine="p.RemoveView";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1051;BA.debugLine="Dim Status As Int = Record.GetInt(\"active\")";
Debug.ShouldStop(67108864);
_status = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("active")));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 1052;BA.debugLine="ButtonListConfirm.Tag = 0";
Debug.ShouldStop(134217728);
user.mostCurrent._buttonlistconfirm.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1053;BA.debugLine="ButtonListNotConfirm.Tag = 0";
Debug.ShouldStop(268435456);
user.mostCurrent._buttonlistnotconfirm.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1054;BA.debugLine="If Status = 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1055;BA.debugLine="ButtonListConfirm.TextColor = Consts.ColorGreen";
Debug.ShouldStop(1073741824);
user.mostCurrent._buttonlistconfirm.runMethod(true,"setTextColor",user.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 BA.debugLineNum = 1056;BA.debugLine="ButtonListConfirm.Tag = Status";
Debug.ShouldStop(-2147483648);
user.mostCurrent._buttonlistconfirm.runMethod(false,"setTag",(_status));
 }else 
{ BA.debugLineNum = 1057;BA.debugLine="else if Status = 2 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1058;BA.debugLine="ButtonListNotConfirm.TextColor = Consts.ColorRed";
Debug.ShouldStop(2);
user.mostCurrent._buttonlistnotconfirm.runMethod(true,"setTextColor",user.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 1059;BA.debugLine="ButtonListNotConfirm.Tag = Status";
Debug.ShouldStop(4);
user.mostCurrent._buttonlistnotconfirm.runMethod(false,"setTag",(_status));
 }}
;
 BA.debugLineNum = 1062;BA.debugLine="Dim qtd As Int = Record.GetInt(\"qtdw\")";
Debug.ShouldStop(32);
_qtd = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("qtdw")));Debug.locals.put("qtd", _qtd);Debug.locals.put("qtd", _qtd);
 BA.debugLineNum = 1063;BA.debugLine="Dim notes As String = Utils.IfNullOrEmpty(Record.";
Debug.ShouldStop(64);
_notes = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("notes", _notes);Debug.locals.put("notes", _notes);
 BA.debugLineNum = 1064;BA.debugLine="Dim tagcode As String = Record.GetString(\"tagcode";
Debug.ShouldStop(128);
_tagcode = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1065;BA.debugLine="Dim category As String = Utils.IfNullOrEmpty(Reco";
Debug.ShouldStop(256);
_category = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("group_title")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("category", _category);Debug.locals.put("category", _category);
 BA.debugLineNum = 1066;BA.debugLine="Dim title As String = Utils.IfNullOrEmpty(Record.";
Debug.ShouldStop(512);
_title = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 1067;BA.debugLine="Dim MinQtd As Int = Record.GetInt(\"minqtd\")";
Debug.ShouldStop(1024);
_minqtd = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("minqtd")));Debug.locals.put("MinQtd", _minqtd);Debug.locals.put("MinQtd", _minqtd);
 BA.debugLineNum = 1069;BA.debugLine="ListItemCategory.text = category";
Debug.ShouldStop(4096);
user.mostCurrent._listitemcategory.runMethod(true,"setText",BA.ObjectToCharSequence(_category));
 BA.debugLineNum = 1070;BA.debugLine="ListItemNotes.text = notes";
Debug.ShouldStop(8192);
user.mostCurrent._listitemnotes.runMethod(true,"setText",BA.ObjectToCharSequence(_notes));
 BA.debugLineNum = 1071;BA.debugLine="ListItemReference.text = tagcode";
Debug.ShouldStop(16384);
user.mostCurrent._listitemreference.runMethod(true,"setText",BA.ObjectToCharSequence(_tagcode));
 BA.debugLineNum = 1072;BA.debugLine="ListItemTitle.text = title";
Debug.ShouldStop(32768);
user.mostCurrent._listitemtitle.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1073;BA.debugLine="ListItemQtd.text = qtd";
Debug.ShouldStop(65536);
user.mostCurrent._listitemqtd.runMethod(true,"setText",BA.ObjectToCharSequence(_qtd));
 BA.debugLineNum = 1074;BA.debugLine="ListItemMinQtd.Text = MinQtd";
Debug.ShouldStop(131072);
user.mostCurrent._listitemminqtd.runMethod(true,"setText",BA.ObjectToCharSequence(_minqtd));
 BA.debugLineNum = 1076;BA.debugLine="p.Tag = tagcode 'id";
Debug.ShouldStop(524288);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1078;BA.debugLine="Return p";
Debug.ShouldStop(2097152);
if (true) return _p;
 BA.debugLineNum = 1079;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creategrouplineauto(RemoteObject _title,RemoteObject _model,RemoteObject _plate,RemoteObject _tagcode,RemoteObject _top,RemoteObject _height,RemoteObject _idx,RemoteObject _carobj) throws Exception{
try {
		Debug.PushSubsStack("CreateGroupLineAuto (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,731);
if (RapidSub.canDelegate("creategrouplineauto")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","creategrouplineauto", _title, _model, _plate, _tagcode, _top, _height, _idx, _carobj);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Title", _title);
Debug.locals.put("Model", _model);
Debug.locals.put("Plate", _plate);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("top", _top);
Debug.locals.put("height", _height);
Debug.locals.put("idx", _idx);
Debug.locals.put("CarObj", _carobj);
 BA.debugLineNum = 731;BA.debugLine="Sub CreateGroupLineAuto(Title As String, Model As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 732;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 733;BA.debugLine="p.Initialize(\"GroupLineClick\")";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("Initialize",user.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("GroupLineClick")));
 BA.debugLineNum = 734;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(536870912);
user.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(user.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),user.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 735;BA.debugLine="p.LoadLayout(VIEW_ItemUserAuto)";
Debug.ShouldStop(1073741824);
_p.runMethodAndSync(false,"LoadLayout",(Object)(user.mostCurrent._view_itemuserauto),user.mostCurrent.activityBA);
 BA.debugLineNum = 736;BA.debugLine="p.RemoveView";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 739;BA.debugLine="butGrpLineChange.Tag = Tagcode";
Debug.ShouldStop(4);
user.mostCurrent._butgrplinechange.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 740;BA.debugLine="lblGroupLineDesc.Text = Title";
Debug.ShouldStop(8);
user.mostCurrent._lblgrouplinedesc.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 741;BA.debugLine="lblGroupLineModel.text = Model";
Debug.ShouldStop(16);
user.mostCurrent._lblgrouplinemodel.runMethod(true,"setText",BA.ObjectToCharSequence(_model));
 BA.debugLineNum = 742;BA.debugLine="lblGroupLinePlate.Text = Plate";
Debug.ShouldStop(32);
user.mostCurrent._lblgrouplineplate.runMethod(true,"setText",BA.ObjectToCharSequence(_plate));
 BA.debugLineNum = 745;BA.debugLine="butGrpLineChange.Tag = CarObj '$\"${Tagcode}|${Pla";
Debug.ShouldStop(256);
user.mostCurrent._butgrplinechange.runMethod(false,"setTag",(_carobj));
 BA.debugLineNum = 746;BA.debugLine="p.Tag = idx";
Debug.ShouldStop(512);
_p.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 748;BA.debugLine="pnlGroupExpanded.AddView(p, 0, top, p.Width, heig";
Debug.ShouldStop(2048);
user.mostCurrent._pnlgroupexpanded.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(_p.runMethod(true,"getWidth")),(Object)(_height));
 BA.debugLineNum = 749;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creategrouplineitems(RemoteObject _colitems,RemoteObject _top,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateGroupLineItems (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,686);
if (RapidSub.canDelegate("creategrouplineitems")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","creategrouplineitems", _colitems, _top, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _equipment = RemoteObject.createImmutable("");
RemoteObject _serial = RemoteObject.createImmutable("");
RemoteObject _valid = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
Debug.locals.put("colitems", _colitems);
Debug.locals.put("top", _top);
Debug.locals.put("height", _height);
 BA.debugLineNum = 686;BA.debugLine="Sub CreateGroupLineItems(colitems As Cursor, top A";
Debug.ShouldStop(8192);
 BA.debugLineNum = 687;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 688;BA.debugLine="p.Initialize(\"GroupLineClick\")";
Debug.ShouldStop(32768);
_p.runVoidMethod ("Initialize",user.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("GroupLineClick")));
 BA.debugLineNum = 689;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(65536);
user.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(user.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),user.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 690;BA.debugLine="p.LoadLayout(VIEW_ItemUserEquipment)";
Debug.ShouldStop(131072);
_p.runMethodAndSync(false,"LoadLayout",(Object)(user.mostCurrent._view_itemuserequipment),user.mostCurrent.activityBA);
 BA.debugLineNum = 691;BA.debugLine="p.RemoveView";
Debug.ShouldStop(262144);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 693;BA.debugLine="Dim Equipment As String = colitems.GetString(\"tit";
Debug.ShouldStop(1048576);
_equipment = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("Equipment", _equipment);Debug.locals.put("Equipment", _equipment);
 BA.debugLineNum = 694;BA.debugLine="Dim Serial As String = Utils.IfNullOrEmpty(colite";
Debug.ShouldStop(2097152);
_serial = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("serialnumber")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Serial", _serial);Debug.locals.put("Serial", _serial);
 BA.debugLineNum = 695;BA.debugLine="Dim Valid As String = Utils.IfNullOrEmpty(colitem";
Debug.ShouldStop(4194304);
_valid = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valid_to")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Valid", _valid);Debug.locals.put("Valid", _valid);
 BA.debugLineNum = 696;BA.debugLine="Dim Tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(8388608);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("Tagcode", _tagcode);Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 699;BA.debugLine="butGrpLineChange.Tag = Tagcode";
Debug.ShouldStop(67108864);
user.mostCurrent._butgrplinechange.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 701;BA.debugLine="lblGroupLineDesc.Text = Equipment";
Debug.ShouldStop(268435456);
user.mostCurrent._lblgrouplinedesc.runMethod(true,"setText",BA.ObjectToCharSequence(_equipment));
 BA.debugLineNum = 702;BA.debugLine="lblGroupLineValidate.Text = Valid";
Debug.ShouldStop(536870912);
user.mostCurrent._lblgrouplinevalidate.runMethod(true,"setText",BA.ObjectToCharSequence(_valid));
 BA.debugLineNum = 703;BA.debugLine="lblGroupLineSerial.Text = Serial";
Debug.ShouldStop(1073741824);
user.mostCurrent._lblgrouplineserial.runMethod(true,"setText",BA.ObjectToCharSequence(_serial));
 BA.debugLineNum = 704;BA.debugLine="p.Tag = 0";
Debug.ShouldStop(-2147483648);
_p.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 706;BA.debugLine="pnlGroupExpanded.AddView(p, 0, top, p.Width, heig";
Debug.ShouldStop(2);
user.mostCurrent._pnlgroupexpanded.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(_p.runMethod(true,"getWidth")),(Object)(_height));
 BA.debugLineNum = 707;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creategrouplineitemsauto(RemoteObject _colitems,RemoteObject _top,RemoteObject _height,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("CreateGroupLineItemsAuto (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,751);
if (RapidSub.canDelegate("creategrouplineitemsauto")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","creategrouplineitemsauto", _colitems, _top, _height, _idx);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _equipment = RemoteObject.createImmutable("");
RemoteObject _valid = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("colitems", _colitems);
Debug.locals.put("top", _top);
Debug.locals.put("height", _height);
Debug.locals.put("idx", _idx);
 BA.debugLineNum = 751;BA.debugLine="Sub CreateGroupLineItemsAuto(colitems As Cursor, t";
Debug.ShouldStop(16384);
 BA.debugLineNum = 752;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 753;BA.debugLine="p.Initialize(\"GroupLineClick\")";
Debug.ShouldStop(65536);
_p.runVoidMethod ("Initialize",user.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("GroupLineClick")));
 BA.debugLineNum = 754;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(131072);
user.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(user.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),user.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 755;BA.debugLine="p.LoadLayout(VIEW_ItemUserAutoLine)";
Debug.ShouldStop(262144);
_p.runMethodAndSync(false,"LoadLayout",(Object)(user.mostCurrent._view_itemuserautoline),user.mostCurrent.activityBA);
 BA.debugLineNum = 756;BA.debugLine="p.RemoveView";
Debug.ShouldStop(524288);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 758;BA.debugLine="Dim Equipment As String = Utils.IfNullOrEmpty(col";
Debug.ShouldStop(2097152);
_equipment = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Equipment", _equipment);Debug.locals.put("Equipment", _equipment);
 BA.debugLineNum = 760;BA.debugLine="Dim Valid As String = Utils.IfNullOrEmpty(colitem";
Debug.ShouldStop(8388608);
_valid = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valid_to")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Valid", _valid);Debug.locals.put("Valid", _valid);
 BA.debugLineNum = 761;BA.debugLine="If (Utils.isNull(Valid )) Then Valid = \"\"";
Debug.ShouldStop(16777216);
if ((user.mostCurrent._utils.runMethod(true,"_isnull" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_valid))).<Boolean>get().booleanValue()) { 
_valid = BA.ObjectToString("");Debug.locals.put("Valid", _valid);};
 BA.debugLineNum = 762;BA.debugLine="Dim Tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(33554432);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("Tagcode", _tagcode);Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 763;BA.debugLine="Dim FileName As String = Utils.IfNullOrEmpty(coli";
Debug.ShouldStop(67108864);
_filename = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("docfilename")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 766;BA.debugLine="lblGroupLineDesc.Text = Equipment";
Debug.ShouldStop(536870912);
user.mostCurrent._lblgrouplinedesc.runMethod(true,"setText",BA.ObjectToCharSequence(_equipment));
 BA.debugLineNum = 767;BA.debugLine="lblGroupLineDesc.Tag = FileName";
Debug.ShouldStop(1073741824);
user.mostCurrent._lblgrouplinedesc.runMethod(false,"setTag",(_filename));
 BA.debugLineNum = 769;BA.debugLine="lblGroupLineValidate.Text = Valid";
Debug.ShouldStop(1);
user.mostCurrent._lblgrouplinevalidate.runMethod(true,"setText",BA.ObjectToCharSequence(_valid));
 BA.debugLineNum = 770;BA.debugLine="lblGroupLineValidate.Tag = Tagcode";
Debug.ShouldStop(2);
user.mostCurrent._lblgrouplinevalidate.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 773;BA.debugLine="p.Tag = idx";
Debug.ShouldStop(16);
_p.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 774;BA.debugLine="pnlGroupExpanded.AddView(p, 0, top, p.Width, heig";
Debug.ShouldStop(32);
user.mostCurrent._pnlgroupexpanded.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(_p.runMethod(true,"getWidth")),(Object)(_height));
 BA.debugLineNum = 775;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creategrouplineitemsuserregister(RemoteObject _colitems,RemoteObject _top,RemoteObject _height,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("CreateGroupLineItemsUserRegister (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,710);
if (RapidSub.canDelegate("creategrouplineitemsuserregister")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","creategrouplineitemsuserregister", _colitems, _top, _height, _width);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
Debug.locals.put("colitems", _colitems);
Debug.locals.put("top", _top);
Debug.locals.put("height", _height);
Debug.locals.put("width", _width);
 BA.debugLineNum = 710;BA.debugLine="Sub CreateGroupLineItemsUserRegister(colitems As C";
Debug.ShouldStop(32);
 BA.debugLineNum = 711;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 712;BA.debugLine="p.Initialize(\"GroupLineClickUser\")";
Debug.ShouldStop(128);
_p.runVoidMethod ("Initialize",user.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("GroupLineClickUser")));
 BA.debugLineNum = 713;BA.debugLine="Activity.AddView(p, 0, 0, width, height)";
Debug.ShouldStop(256);
user.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 714;BA.debugLine="p.LoadLayout(VIEW_ItemUserRegister)";
Debug.ShouldStop(512);
_p.runMethodAndSync(false,"LoadLayout",(Object)(user.mostCurrent._view_itemuserregister),user.mostCurrent.activityBA);
 BA.debugLineNum = 715;BA.debugLine="p.RemoveView";
Debug.ShouldStop(1024);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 717;BA.debugLine="Dim code As String = colitems.GetString(\"username";
Debug.ShouldStop(4096);
_code = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 718;BA.debugLine="Dim name As String = colitems.GetString(\"name\")";
Debug.ShouldStop(8192);
_name = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 719;BA.debugLine="Dim Tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(16384);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("Tagcode", _tagcode);Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 721;BA.debugLine="lblGroupLineCode.Text = code";
Debug.ShouldStop(65536);
user.mostCurrent._lblgrouplinecode.runMethod(true,"setText",BA.ObjectToCharSequence(_code));
 BA.debugLineNum = 722;BA.debugLine="lblGroupLineName.Text = name";
Debug.ShouldStop(131072);
user.mostCurrent._lblgrouplinename.runMethod(true,"setText",BA.ObjectToCharSequence(_name));
 BA.debugLineNum = 723;BA.debugLine="lblGroupLineCode.tag = Tagcode";
Debug.ShouldStop(262144);
user.mostCurrent._lblgrouplinecode.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 724;BA.debugLine="lblGroupLineName.tag = Tagcode";
Debug.ShouldStop(524288);
user.mostCurrent._lblgrouplinename.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 725;BA.debugLine="butGrpLineChange.Tag = Tagcode";
Debug.ShouldStop(1048576);
user.mostCurrent._butgrplinechange.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 726;BA.debugLine="p.Tag = 0";
Debug.ShouldStop(2097152);
_p.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 727;BA.debugLine="pnlGroupExpanded4.AddView(p, 0, top, p.Width, hei";
Debug.ShouldStop(4194304);
user.mostCurrent._pnlgroupexpanded4.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(_p.runMethod(true,"getWidth")),(Object)(_height));
 BA.debugLineNum = 728;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createuserdetailsdata(RemoteObject _clear,RemoteObject _car) throws Exception{
try {
		Debug.PushSubsStack("CreateUserDetailsData (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,532);
if (RapidSub.canDelegate("createuserdetailsdata")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","createuserdetailsdata", _clear, _car);}
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
RemoteObject _t = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _chapter = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _row = 0;
RemoteObject _carobj = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._carobject");
RemoteObject _record1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("clear", _clear);
Debug.locals.put("car", _car);
 BA.debugLineNum = 532;BA.debugLine="Sub CreateUserDetailsData(clear As Boolean, car As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 533;BA.debugLine="If clear Then";
Debug.ShouldStop(1048576);
if (_clear.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 534;BA.debugLine="UserListView.Clear";
Debug.ShouldStop(2097152);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_clear" /*RemoteObject*/ );
 };
 BA.debugLineNum = 536;BA.debugLine="Dim idx As Int = UserListView.Size";
Debug.ShouldStop(8388608);
_idx = user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getsize" /*RemoteObject*/ );Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 537;BA.debugLine="If idx >0 Then idx = idx-1";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_idx,BA.numberCast(double.class, 0))) { 
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("idx", _idx);};
 BA.debugLineNum = 540;BA.debugLine="Dim id As ItemData";
Debug.ShouldStop(134217728);
_id = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.checklist3._itemdata");Debug.locals.put("id", _id);
 BA.debugLineNum = 541;BA.debugLine="Dim t As Int = 0";
Debug.ShouldStop(268435456);
_t = BA.numberCast(int.class, 0);Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 542;BA.debugLine="Dim h As Int = 60dip";
Debug.ShouldStop(536870912);
_h = user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 543;BA.debugLine="id.Initialize";
Debug.ShouldStop(1073741824);
_id.runVoidMethod ("Initialize");
 BA.debugLineNum = 544;BA.debugLine="id.CollapsedHeight = 50dip";
Debug.ShouldStop(-2147483648);
_id.setField ("CollapsedHeight" /*RemoteObject*/ ,user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 545;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(1);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 552;BA.debugLine="Dim SQL As String = $\"select title, serialnumber,";
Debug.ShouldStop(128);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode in (Select equipment_tagcode from dta_equipments_technicals where technical_tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("')")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 554;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(512);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 555;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 556;BA.debugLine="id.ExpandedHeight = 50dip + 40dip + (60dip * Rec";
Debug.ShouldStop(2048);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))),(RemoteObject.solve(new RemoteObject[] {user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))),_record.runMethod(true,"getRowCount")}, "*",0, 1))}, "++",2, 1));
 BA.debugLineNum = 557;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
Debug.ShouldStop(4096);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapter(user.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),user.mostCurrent._sharecode._userchapterequip /*RemoteObject*/ ,user.mostCurrent._view_listcollapsegroup_userequip,_id,_idx,user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"False"),user.mostCurrent._types.runMethod(false,"_clearedcarobject" /*RemoteObject*/ ,user.mostCurrent.activityBA));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 558;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(8192);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step17 > 0 && _row <= limit17) || (step17 < 0 && _row >= limit17) ;_row = ((int)(0 + _row + step17))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 559;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(16384);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 561;BA.debugLine="CreateGroupLineItems(Record, t,  h)";
Debug.ShouldStop(65536);
_creategrouplineitems(_record,_t,_h);
 BA.debugLineNum = 562;BA.debugLine="t = t + 60dip";
Debug.ShouldStop(131072);
_t = RemoteObject.solve(new RemoteObject[] {_t,user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "+",1, 1);Debug.locals.put("t", _t);
 }
}Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 564;BA.debugLine="UserListView.Add(chapter, id)";
Debug.ShouldStop(524288);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 565;BA.debugLine="UserListView.ExpandItem(idx)";
Debug.ShouldStop(1048576);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_expanditem" /*RemoteObject*/ ,(Object)(_idx));
 BA.debugLineNum = 566;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(2097152);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 }else {
 BA.debugLineNum = 568;BA.debugLine="id.ExpandedHeight = 50dip";
Debug.ShouldStop(8388608);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 569;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
Debug.ShouldStop(16777216);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapter(user.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),user.mostCurrent._sharecode._userchapterequip /*RemoteObject*/ ,user.mostCurrent._view_listcollapsegroup_userequip,_id,_idx,user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"False"),user.mostCurrent._types.runMethod(false,"_clearedcarobject" /*RemoteObject*/ ,user.mostCurrent.activityBA));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 570;BA.debugLine="UserListView.Add(chapter, id)";
Debug.ShouldStop(33554432);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 571;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(67108864);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 };
 BA.debugLineNum = 573;BA.debugLine="Record.Close";
Debug.ShouldStop(268435456);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 575;BA.debugLine="Dim id As ItemData";
Debug.ShouldStop(1073741824);
_id = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.checklist3._itemdata");Debug.locals.put("id", _id);
 BA.debugLineNum = 576;BA.debugLine="Dim t As Int = 0";
Debug.ShouldStop(-2147483648);
_t = BA.numberCast(int.class, 0);Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 577;BA.debugLine="Dim h As Int = 60dip";
Debug.ShouldStop(1);
_h = user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 578;BA.debugLine="id.Initialize";
Debug.ShouldStop(2);
_id.runVoidMethod ("Initialize");
 BA.debugLineNum = 579;BA.debugLine="id.CollapsedHeight = 50dip";
Debug.ShouldStop(4);
_id.setField ("CollapsedHeight" /*RemoteObject*/ ,user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 580;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(8);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 587;BA.debugLine="Dim SQL As String = $\"Select ifnull(e1.value, '')";
Debug.ShouldStop(1024);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo, \n"),RemoteObject.createImmutable("			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '0') as vkm, a.*\n"),RemoteObject.createImmutable("			from  dta_objects as a \n"),RemoteObject.createImmutable("			left join dta_objects_fields as e1 on (e1.object_tagcode=a.tagcode and e1.field_tagcode='FIELD_MARCA')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e2 on (e2.object_tagcode=a.tagcode and e2.field_tagcode='FIELD_MODELO')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e3 on (e3.object_tagcode=a.tagcode and e3.field_tagcode='FIELD_MATRICULA')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e4 on (e4.object_tagcode=a.tagcode and e4.field_tagcode='FIELD_KM')\n"),RemoteObject.createImmutable("			-- left join dta_fields as f on (f.tagcode=e.field_tagcode)\n"),RemoteObject.createImmutable("			where a.tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_car.getField(true,"objTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 596;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(524288);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 600;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 601;BA.debugLine="t = t + 150dip";
Debug.ShouldStop(16777216);
_t = RemoteObject.solve(new RemoteObject[] {_t,user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "+",1, 1);Debug.locals.put("t", _t);
 BA.debugLineNum = 603;BA.debugLine="id.ExpandedHeight = 50dip + t + (20dip * Record.";
Debug.ShouldStop(67108864);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),_t,(RemoteObject.solve(new RemoteObject[] {user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))),_record.runMethod(true,"getRowCount")}, "*",0, 1))}, "++",2, 1));
 BA.debugLineNum = 604;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(134217728);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 605;BA.debugLine="Dim CarObj As CarObject = Types.MakeCarObject(ca";
Debug.ShouldStop(268435456);
_carobj = user.mostCurrent._types.runMethod(false,"_makecarobject" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_car.getField(true,"objTagcode" /*RemoteObject*/ )),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmarca")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmodelo")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmatricula")))),(Object)(_record.runMethod(true,"GetLong",(Object)(RemoteObject.createImmutable("vkm")))));Debug.locals.put("CarObj", _carobj);Debug.locals.put("CarObj", _carobj);
 BA.debugLineNum = 610;BA.debugLine="CurrentCarObject = CarObj";
Debug.ShouldStop(2);
user.mostCurrent._currentcarobject = _carobj;
 BA.debugLineNum = 611;BA.debugLine="ShareCode.SESS_CurrentCarObject = CurrentCarObje";
Debug.ShouldStop(4);
user.mostCurrent._sharecode._sess_currentcarobject /*RemoteObject*/  = user.mostCurrent._currentcarobject;
 BA.debugLineNum = 612;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
Debug.ShouldStop(8);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapter(user.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),user.mostCurrent._sharecode._userchapterviatura /*RemoteObject*/ ,BA.ObjectToString("ListCollapseGroup_UserCar"),_id,_idx,user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"True"),user.mostCurrent.__c.getField(true,"True"),_carobj);Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 615;BA.debugLine="CreateGroupLineAuto(car.Name, car.model, car.Pla";
Debug.ShouldStop(64);
_creategrouplineauto(_car.getField(true,"Name" /*RemoteObject*/ ),_car.getField(true,"Model" /*RemoteObject*/ ),_car.getField(true,"Plate" /*RemoteObject*/ ),_car.getField(true,"Tag" /*RemoteObject*/ ),BA.numberCast(int.class, 0),_t,_idx,_carobj);
 BA.debugLineNum = 622;BA.debugLine="UserListView.Add(chapter, id)";
Debug.ShouldStop(8192);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 623;BA.debugLine="UserListView.ExpandItem(idx)";
Debug.ShouldStop(16384);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_expanditem" /*RemoteObject*/ ,(Object)(_idx));
 BA.debugLineNum = 624;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(32768);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 }else {
 BA.debugLineNum = 626;BA.debugLine="id.ExpandedHeight = 50dip + t";
Debug.ShouldStop(131072);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),_t}, "+",1, 1));
 BA.debugLineNum = 627;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
Debug.ShouldStop(262144);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapter(user.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),user.mostCurrent._sharecode._userchapterviatura /*RemoteObject*/ ,BA.ObjectToString("ListCollapseGroup_UserCar"),_id,_idx,user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"True"),user.mostCurrent.__c.getField(true,"True"),user.mostCurrent._types.runMethod(false,"_clearedcarobject" /*RemoteObject*/ ,user.mostCurrent.activityBA));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 628;BA.debugLine="UserListView.Add(chapter, id)";
Debug.ShouldStop(524288);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 629;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(1048576);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 };
 BA.debugLineNum = 631;BA.debugLine="Record.Close";
Debug.ShouldStop(4194304);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 633;BA.debugLine="Dim id As ItemData";
Debug.ShouldStop(16777216);
_id = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.checklist3._itemdata");Debug.locals.put("id", _id);
 BA.debugLineNum = 634;BA.debugLine="Dim t As Int = 0";
Debug.ShouldStop(33554432);
_t = BA.numberCast(int.class, 0);Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 635;BA.debugLine="Dim h As Int = 60dip";
Debug.ShouldStop(67108864);
_h = user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 636;BA.debugLine="id.Initialize";
Debug.ShouldStop(134217728);
_id.runVoidMethod ("Initialize");
 BA.debugLineNum = 637;BA.debugLine="id.CollapsedHeight = 50dip";
Debug.ShouldStop(268435456);
_id.setField ("CollapsedHeight" /*RemoteObject*/ ,user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 638;BA.debugLine="Private Record1 As Cursor";
Debug.ShouldStop(536870912);
_record1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record1", _record1);
 BA.debugLineNum = 642;BA.debugLine="Dim SQL As String = $\"select * from loc_userssess";
Debug.ShouldStop(2);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select * from loc_userssession where session='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._starter._localsessioncode /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 643;BA.debugLine="Record1 = Starter.LocalSQLWRK.ExecQuery(SQL)";
Debug.ShouldStop(4);
_record1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 644;BA.debugLine="If Record1.RowCount > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_record1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 646;BA.debugLine="id.ExpandedHeight = 50dip + 40dip + t + (60dip *";
Debug.ShouldStop(32);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))),_t,(RemoteObject.solve(new RemoteObject[] {user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))),_record1.runMethod(true,"getRowCount")}, "*",0, 1))}, "+++",3, 1));
 BA.debugLineNum = 647;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
Debug.ShouldStop(64);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapter(user.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),user.mostCurrent._sharecode._userchapterusers /*RemoteObject*/ ,user.mostCurrent._view_listcollapsegroup_userregister,_id,_idx,user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"False"),user.mostCurrent._types.runMethod(false,"_clearedcarobject" /*RemoteObject*/ ,user.mostCurrent.activityBA));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 648;BA.debugLine="For Row = 0 To Record1.RowCount-1";
Debug.ShouldStop(128);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_record1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step70 > 0 && _row <= limit70) || (step70 < 0 && _row >= limit70) ;_row = ((int)(0 + _row + step70))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 649;BA.debugLine="Record1.Position = Row";
Debug.ShouldStop(256);
_record1.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 650;BA.debugLine="CreateGroupLineItemsUserRegister(Record1, t,  h";
Debug.ShouldStop(512);
_creategrouplineitemsuserregister(_record1,_t,_h,_chapter.runMethod(true,"getWidth"));
 BA.debugLineNum = 651;BA.debugLine="t = t + 60dip";
Debug.ShouldStop(1024);
_t = RemoteObject.solve(new RemoteObject[] {_t,user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "+",1, 1);Debug.locals.put("t", _t);
 }
}Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 653;BA.debugLine="UserListView.Add(chapter, id)";
Debug.ShouldStop(4096);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 654;BA.debugLine="UserListView.ExpandItem(idx)";
Debug.ShouldStop(8192);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_expanditem" /*RemoteObject*/ ,(Object)(_idx));
 BA.debugLineNum = 655;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(16384);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 }else {
 BA.debugLineNum = 657;BA.debugLine="id.ExpandedHeight = 50dip + t";
Debug.ShouldStop(65536);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),_t}, "+",1, 1));
 BA.debugLineNum = 658;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
Debug.ShouldStop(131072);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapter(user.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),user.mostCurrent._sharecode._userchapterusers /*RemoteObject*/ ,BA.ObjectToString("VIEW_ListCollapseGroup_UserRegister"),_id,_idx,user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"False"),user.mostCurrent.__c.getField(true,"False"),user.mostCurrent._types.runMethod(false,"_clearedcarobject" /*RemoteObject*/ ,user.mostCurrent.activityBA));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 659;BA.debugLine="UserListView.Add(chapter, id)";
Debug.ShouldStop(262144);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 660;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(524288);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 };
 BA.debugLineNum = 662;BA.debugLine="Record1.Close";
Debug.ShouldStop(2097152);
_record1.runVoidMethod ("Close");
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
public static RemoteObject  _doccategories_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("doccategories_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,777);
if (RapidSub.canDelegate("doccategories_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","doccategories_click", _menuname);}
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 777;BA.debugLine="Sub doccategories_Click(MenuName As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 787;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadfileswithftp(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,958);
if (RapidSub.canDelegate("downloadfileswithftp")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","downloadfileswithftp", _filename); return;}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,_filename);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.user parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _filename;
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _path = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,958);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 959;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(1073741824);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 960;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(-2147483648);
_myftp.runVoidMethod ("Initialize",user.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 961;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(1);
_myftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 965;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(16);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 966;BA.debugLine="Dim path As String = \"/\" & ShareCode.APP_DOMAIN &";
Debug.ShouldStop(32);
_path = RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_filename);Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 967;BA.debugLine="Log($\"file ${filename}, caminho:  ${path}\"$)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6194445321",(RemoteObject.concat(RemoteObject.createImmutable("file "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(", caminho:  "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_path))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 968;BA.debugLine="Dim sf As Object = myFTP.DownloadFile(path, False";
Debug.ShouldStop(128);
_sf = _myftp.runMethod(false,"DownloadFile",user.processBA,(Object)(_path),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 969;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath A";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", user.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "downloadfileswithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 970;BA.debugLine="If Success Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 971;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6194445325",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 973;BA.debugLine="Log($\"Error downloading file ${ServerPath}\"$)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6194445327",(RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_serverpath))),RemoteObject.createImmutable(""))),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 983;BA.debugLine="myFTP.Close";
Debug.ShouldStop(4194304);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 984;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _editequipsearch_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditEquipSearch_EnterPressed (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1753);
if (RapidSub.canDelegate("editequipsearch_enterpressed")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","editequipsearch_enterpressed");}
 BA.debugLineNum = 1753;BA.debugLine="Sub EditEquipSearch_EnterPressed";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1754;BA.debugLine="MakeEquipmentListSearch(EditEquipSearch.Text)";
Debug.ShouldStop(33554432);
_makeequipmentlistsearch(user.mostCurrent._editequipsearch.runMethod(true,"getText"));
 BA.debugLineNum = 1755;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editequipsearch_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditEquipSearch_TextChanged (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1749);
if (RapidSub.canDelegate("editequipsearch_textchanged")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","editequipsearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1749;BA.debugLine="Sub EditEquipSearch_TextChanged (Old As String, Ne";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim Icon As BitmapDrawable";
user.mostCurrent._icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
 //BA.debugLineNum = 17;BA.debugLine="Dim xui As XUI";
user.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Private GoBackMOREActions As Boolean = False";
user._gobackmoreactions = user.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 21;BA.debugLine="Private listsBackground As ImageView";
user.mostCurrent._listsbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private listsBasePanel As Panel";
user.mostCurrent._listsbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private listsBottomLine As Panel";
user.mostCurrent._listsbottomline = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private listsBottomPanel As Panel";
user.mostCurrent._listsbottompanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private listsButtonAdd As Button";
user.mostCurrent._listsbuttonadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private listsButtonClose As Button";
user.mostCurrent._listsbuttonclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private listsLabelInfo As Label";
user.mostCurrent._listslabelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private listsTabPanel As TabStrip";
user.mostCurrent._liststabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 29;BA.debugLine="Private listsTopBar As Panel";
user.mostCurrent._liststopbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ItemsCounter As Int = 0";
user._itemscounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 33;BA.debugLine="Private userCategory As Label";
user.mostCurrent._usercategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private userCertDate As Label";
user.mostCurrent._usercertdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private userCertificate As Label";
user.mostCurrent._usercertificate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private userName As Label";
user.mostCurrent._username = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private userNotes As Label";
user.mostCurrent._usernotes = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private userPhoto As ImageView";
user.mostCurrent._userphoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private usersPanel As Panel";
user.mostCurrent._userspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private userTagcode As Label";
user.mostCurrent._usertagcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private userVehicle As Label";
user.mostCurrent._uservehicle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private userVehiclePlate As Label";
user.mostCurrent._uservehicleplate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private userShowCertificate As Button";
user.mostCurrent._usershowcertificate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private ButtonListNotConfirm As Button";
user.mostCurrent._buttonlistnotconfirm = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private ButtonListConfirm As Button";
user.mostCurrent._buttonlistconfirm = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private butEquipSearch As Button";
user.mostCurrent._butequipsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private listDocuments As CustomListView";
user.mostCurrent._listdocuments = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 51;BA.debugLine="Private listEquipments As CustomListView";
user.mostCurrent._listequipments = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 55;BA.debugLine="Private butWareHouses As Button";
user.mostCurrent._butwarehouses = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Dim mPopMenu As MenuOnAnyView";
user.mostCurrent._mpopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 58;BA.debugLine="Dim mDocPopMenu As MenuOnAnyView";
user.mostCurrent._mdocpopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 59;BA.debugLine="Dim mEqipPopMenu As MenuOnAnyView";
user.mostCurrent._meqippopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 60;BA.debugLine="Private butDocFilter As Button";
user.mostCurrent._butdocfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private butEquipFilter As Button";
user.mostCurrent._butequipfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private UserDocuments As List";
user.mostCurrent._userdocuments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 64;BA.debugLine="Private UserEquipments As List";
user.mostCurrent._userequipments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 65;BA.debugLine="Private butCarRunning As Button";
user.mostCurrent._butcarrunning = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private LabelCopyright As Label";
user.mostCurrent._labelcopyright = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private LabelVersion As Label";
user.mostCurrent._labelversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private LabelDateTime As Label";
user.mostCurrent._labeldatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private CurrentEquipItem As Int = 0";
user._currentequipitem = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 71;BA.debugLine="Private TotalLineItems As Int = 0";
user._totallineitems = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 72;BA.debugLine="Private CurrentDocItem As Int = 0";
user._currentdocitem = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 73;BA.debugLine="Private CurrentGroupItem As Int = 0";
user._currentgroupitem = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 74;BA.debugLine="Private pnlGroupCurrenIndex As Int";
user._pnlgroupcurrenindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 76;BA.debugLine="Private userCompany As Label";
user.mostCurrent._usercompany = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private UserListView As ExpandedListView";
user.mostCurrent._userlistview = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.expandedlistview");
 //BA.debugLineNum = 79;BA.debugLine="Private lblGroupTitle As Label";
user.mostCurrent._lblgrouptitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private butGroupCollpseExpand As Button";
user.mostCurrent._butgroupcollpseexpand = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private pnlGroupTitle As Panel";
user.mostCurrent._pnlgrouptitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private pnlGroupExpanded As Panel";
user.mostCurrent._pnlgroupexpanded = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private butGrpLineChange As Button";
user.mostCurrent._butgrplinechange = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private lblGroupLineValidate As Label";
user.mostCurrent._lblgrouplinevalidate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private lblGroupLineDesc As Label";
user.mostCurrent._lblgrouplinedesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private lblGroupLineModel As Label";
user.mostCurrent._lblgrouplinemodel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private lblGroupLineSerial As Label";
user.mostCurrent._lblgrouplineserial = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private lblGroupLinePlate As Label";
user.mostCurrent._lblgrouplineplate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private butUserUnavailable As Button";
user.mostCurrent._butuserunavailable = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private ButtonUserUnavailable As Button";
user.mostCurrent._buttonuserunavailable = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private EditEquipSearch As EditText";
user.mostCurrent._editequipsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private butGrpLineRemove As Button";
user.mostCurrent._butgrplineremove = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private ConfirmProducts As Boolean = (ShareCode.U";
user._confirmproducts = BA.ObjectToBoolean((RemoteObject.solveBoolean("=",user.mostCurrent._sharecode._uwdukey_products /*RemoteObject*/ ,BA.numberCast(double.class, 0))));
 //BA.debugLineNum = 96;BA.debugLine="Private ProductsToConfirm As Int = 0";
user._productstoconfirm = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 97;BA.debugLine="Private FirstDataLoad As Boolean = True";
user._firstdataload = user.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 98;BA.debugLine="Private butUserConfirmData As Button";
user.mostCurrent._butuserconfirmdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Private ColorTabPanel As Panel";
user.mostCurrent._colortabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private SecondPanel As Panel";
user.mostCurrent._secondpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private butGroupCEAdd As Button";
user.mostCurrent._butgroupceadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private mainLogo As ImageView";
user.mostCurrent._mainlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private mainLabelOptLists As Label";
user.mostCurrent._mainlabeloptlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private ListItemDocView As Label";
user.mostCurrent._listitemdocview = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private ListItemDates As Label";
user.mostCurrent._listitemdates = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private ListItemInformation As Label";
user.mostCurrent._listiteminformation = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private ListItemRefresh As Label";
user.mostCurrent._listitemrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Private ListItemCategory As Label";
user.mostCurrent._listitemcategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 110;BA.debugLine="Private ListItemDocButton As Label";
user.mostCurrent._listitemdocbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private ListItemNotes As Label";
user.mostCurrent._listitemnotes = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private ListItemReference As Label";
user.mostCurrent._listitemreference = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private ListItemTitle As Label";
user.mostCurrent._listitemtitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 114;BA.debugLine="Private ListItemQtd As Label";
user.mostCurrent._listitemqtd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private ListItemMinQtd As Label";
user.mostCurrent._listitemminqtd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private ListItemPrice As Label";
user.mostCurrent._listitemprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private VIEW_ItemUserAuto As String = \"ItemUserAu";
user.mostCurrent._view_itemuserauto = BA.ObjectToString("ItemUserAuto");
 //BA.debugLineNum = 119;BA.debugLine="Private VIEW_ItemUserAutoLine As String = \"ItemUs";
user.mostCurrent._view_itemuserautoline = BA.ObjectToString("ItemUserAutoLine");
 //BA.debugLineNum = 120;BA.debugLine="Private VIEW_ItemUserEquipment As String = \"ItemU";
user.mostCurrent._view_itemuserequipment = BA.ObjectToString("ItemUserEquipment");
 //BA.debugLineNum = 121;BA.debugLine="Private VIEW_ListCollapseGroup_UserEquip As Strin";
user.mostCurrent._view_listcollapsegroup_userequip = BA.ObjectToString("ListCollapseGroup_UserEquip");
 //BA.debugLineNum = 122;BA.debugLine="Private VIEW_ListCollapseGroup_UserRegister As St";
user.mostCurrent._view_listcollapsegroup_userregister = BA.ObjectToString("ListCollapseGroup_UserRegister");
 //BA.debugLineNum = 124;BA.debugLine="Private VIEW_ItemUserRegister As String = \"ItemUs";
user.mostCurrent._view_itemuserregister = BA.ObjectToString("ItemUserRegister");
 //BA.debugLineNum = 127;BA.debugLine="Private DialogLogin As AppDialogs";
user.mostCurrent._dialoglogin = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");
 //BA.debugLineNum = 128;BA.debugLine="Private userCode As Label";
user.mostCurrent._usercode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private ButtonActionPause As Button";
user.mostCurrent._buttonactionpause = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 130;BA.debugLine="Private butGroupURegisterAdd As Button";
user.mostCurrent._butgroupuregisteradd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Private lblGroupLineCode As Label";
user.mostCurrent._lblgrouplinecode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Private lblGroupLineName As Label";
user.mostCurrent._lblgrouplinename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private pnlGroupExpanded4 As Panel";
user.mostCurrent._pnlgroupexpanded4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private ButtonAppNetwork As Button";
user.mostCurrent._buttonappnetwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 135;BA.debugLine="Private mainActiveUser As Label";
user.mostCurrent._mainactiveuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 136;BA.debugLine="Private butGroupCarChange As Button";
user.mostCurrent._butgroupcarchange = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 137;BA.debugLine="Private CurrentCarID As AutoIdentification";
user.mostCurrent._currentcarid = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._autoidentification");
 //BA.debugLineNum = 138;BA.debugLine="Private CurrentCarObject As CarObject";
user.mostCurrent._currentcarobject = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._carobject");
 //BA.debugLineNum = 139;BA.debugLine="Private ShowImageView As ImageView";
user.mostCurrent._showimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 140;BA.debugLine="Private butUserPauseAction As Button";
user.mostCurrent._butuserpauseaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 141;BA.debugLine="Private UserDocumentsViewLayoutPanel As Panel";
user.mostCurrent._userdocumentsviewlayoutpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 142;BA.debugLine="Private UserEquipmentsViewLayoutPanel As Panel";
user.mostCurrent._userequipmentsviewlayoutpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 143;BA.debugLine="Private MenuPanel As Panel";
user.mostCurrent._menupanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 144;BA.debugLine="Private MenuPanelUserButton As Button";
user.mostCurrent._menupaneluserbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 145;BA.debugLine="Private MenuPanelDocsButtom As Button";
user.mostCurrent._menupaneldocsbuttom = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 146;BA.debugLine="Private MenuPanelConsumablesButton As Button";
user.mostCurrent._menupanelconsumablesbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 147;BA.debugLine="Private MenuPanelOperatorsButton As Button";
user.mostCurrent._menupaneloperatorsbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 148;BA.debugLine="Private Panel1 As Panel";
user.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 149;BA.debugLine="Private IsFirstTime As Boolean";
user._isfirsttime = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 150;BA.debugLine="Private userLabelFoto As Label";
user.mostCurrent._userlabelfoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 151;BA.debugLine="Private userLabelNome As Label";
user.mostCurrent._userlabelnome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 152;BA.debugLine="Private userLabelOrganizacao As Label";
user.mostCurrent._userlabelorganizacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 153;BA.debugLine="Private userLabelCategoria As Label";
user.mostCurrent._userlabelcategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 154;BA.debugLine="Private userLabelCodigoUser As Label";
user.mostCurrent._userlabelcodigouser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 155;BA.debugLine="Private USERWAREHOUSE As String = \"\"";
user.mostCurrent._userwarehouse = BA.ObjectToString("");
 //BA.debugLineNum = 156;BA.debugLine="Private ButtonListAddAccion As Button";
user.mostCurrent._buttonlistaddaccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 157;BA.debugLine="Private butUserEstadoAction As Button";
user.mostCurrent._butuserestadoaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 158;BA.debugLine="Private butUserStopWork As Button";
user.mostCurrent._butuserstopwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 159;BA.debugLine="Private butUserStartWork As Button";
user.mostCurrent._butuserstartwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 160;BA.debugLine="Private lblEstadoUserJornada As Label";
user.mostCurrent._lblestadouserjornada = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 162;BA.debugLine="Private EditTextJustificacaoRMJ As EditText";
user.mostCurrent._edittextjustificacaormj = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _groupcollpseexpand_click() throws Exception{
try {
		Debug.PushSubsStack("GroupCollpseExpand_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1448);
if (RapidSub.canDelegate("groupcollpseexpand_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","groupcollpseexpand_click");}
RemoteObject _this = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1448;BA.debugLine="Sub GroupCollpseExpand_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1449;BA.debugLine="Dim this As B4XView = Sender";
Debug.ShouldStop(256);
_this = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_this = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("this", _this);
 BA.debugLineNum = 1450;BA.debugLine="If (CurrentGroupItem <> this.Tag) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("!",user._currentgroupitem,BA.numberCast(double.class, _this.runMethod(false,"getTag"))))) { 
 BA.debugLineNum = 1451;BA.debugLine="If Not(Utils.isNullOrEmpty(this.tag)) Then Curre";
Debug.ShouldStop(1024);
if (user.mostCurrent.__c.runMethod(true,"Not",(Object)(user.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString(_this.runMethod(false,"getTag")))))).<Boolean>get().booleanValue()) { 
user._currentgroupitem = BA.numberCast(int.class, _this.runMethod(false,"getTag"));};
 };
 BA.debugLineNum = 1453;BA.debugLine="Dim p As B4XView = UserListView.GetPanel(CurrentG";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getpanel" /*RemoteObject*/ ,(Object)(user._currentgroupitem));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1454;BA.debugLine="If p.Tag = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),(user.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 1455;BA.debugLine="UserListView.CollapseItem(CurrentGroupItem)";
Debug.ShouldStop(16384);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_collapseitem" /*RemoteObject*/ ,(Object)(user._currentgroupitem));
 }else {
 BA.debugLineNum = 1457;BA.debugLine="UserListView.ExpandItem(CurrentGroupItem)";
Debug.ShouldStop(65536);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_expanditem" /*RemoteObject*/ ,(Object)(user._currentgroupitem));
 };
 BA.debugLineNum = 1459;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grouplineautochange_click() throws Exception{
try {
		Debug.PushSubsStack("GroupLineAutoChange_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1888);
if (RapidSub.canDelegate("grouplineautochange_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","grouplineautochange_click");}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _carobj = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._carobject");
RemoteObject _tgo = RemoteObject.createImmutable("");
RemoteObject _claitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
RemoteObject _itemstatus = RemoteObject.createImmutable(0);
RemoteObject _itemdesc = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1888;BA.debugLine="Sub GroupLineAutoChange_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1891;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(4);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1892;BA.debugLine="Dim SQL As String = $\"Select ifnull(a.value, '0')";
Debug.ShouldStop(8);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("Select ifnull(a.value, '0') as vkm \n"),RemoteObject.createImmutable("			from dta_objects_fields as a  where a.field_tagcode='FIELD_KM' and object_tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._currentcarobject.getField(true,"obj" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 1894;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(32);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 1895;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1896;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(128);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1897;BA.debugLine="CurrentCarObject.km = Record.GetLong(\"vkm\")";
Debug.ShouldStop(256);
user.mostCurrent._currentcarobject.setField ("km" /*RemoteObject*/ ,_record.runMethod(true,"GetLong",(Object)(RemoteObject.createImmutable("vkm"))));
 };
 BA.debugLineNum = 1899;BA.debugLine="Record.Close";
Debug.ShouldStop(1024);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1900;BA.debugLine="Dim CarObj As CarObject = CurrentCarObject 'btn.t";
Debug.ShouldStop(2048);
_carobj = user.mostCurrent._currentcarobject;Debug.locals.put("CarObj", _carobj);Debug.locals.put("CarObj", _carobj);
 BA.debugLineNum = 1903;BA.debugLine="Dim tgo As String = \"TSKT-0003\"";
Debug.ShouldStop(16384);
_tgo = BA.ObjectToString("TSKT-0003");Debug.locals.put("tgo", _tgo);Debug.locals.put("tgo", _tgo);
 BA.debugLineNum = 1904;BA.debugLine="If (GoBackMOREActions) Then";
Debug.ShouldStop(32768);
if ((user._gobackmoreactions).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1905;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeReques";
Debug.ShouldStop(65536);
_claitem = user.mostCurrent._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_tgo),(Object)(_tgo),(Object)(_tgo),(Object)(_tgo),(Object)(_tgo),(Object)(_tgo),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("Verificação de viatura")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("GET_MORE_ACTIONS")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(user.mostCurrent._currentcarobject.getField(true,"obj" /*RemoteObject*/ )),(Object)(user.mostCurrent._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("CLAItem", _claitem);Debug.locals.put("CLAItem", _claitem);
 }else {
 BA.debugLineNum = 1909;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeReques";
Debug.ShouldStop(1048576);
_claitem = user.mostCurrent._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_tgo),(Object)(_tgo),(Object)(_tgo),(Object)(_tgo),(Object)(_tgo),(Object)(_tgo),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("Verificação de viatura")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(user.mostCurrent._currentcarobject.getField(true,"obj" /*RemoteObject*/ )),(Object)(user.mostCurrent._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("CLAItem", _claitem);Debug.locals.put("CLAItem", _claitem);
 };
 BA.debugLineNum = 1914;BA.debugLine="Dim sSQL As String = $\"select * from alerts where";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select * from alerts where tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tgo))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1915;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(67108864);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1916;BA.debugLine="Record = Starter.LocalSQL.ExecQuery($\"${sSQL}\"$)";
Debug.ShouldStop(134217728);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1917;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1918;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(536870912);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1920;BA.debugLine="Dim Status As Int = Record.GetInt(\"status_id\")";
Debug.ShouldStop(-2147483648);
_status = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 1921;BA.debugLine="If (Status=1) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1922;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(2);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1923;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(4);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1925;BA.debugLine="Filter.GetFastActionDialog(Activity, CLAItem, \"";
Debug.ShouldStop(16);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getfastactiondialog" /*void*/ ,(Object)(user.mostCurrent._activity),(Object)(_claitem),(Object)(BA.ObjectToString("Verificação de viatura")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Viatura com matricula "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_carobj.getField(true,"plate" /*RemoteObject*/ )))),RemoteObject.createImmutable(" sem danos a registar?")))),(Object)(_tgo),(Object)(BA.numberCast(int.class, 0)),(Object)(user.mostCurrent.__c.getField(true,"False")),(Object)(_carobj));
 }else {
 BA.debugLineNum = 1927;BA.debugLine="Dim ItemStatus As Int = Record.GetInt(\"itemstat";
Debug.ShouldStop(64);
_itemstatus = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("itemstatus")));Debug.locals.put("ItemStatus", _itemstatus);Debug.locals.put("ItemStatus", _itemstatus);
 BA.debugLineNum = 1928;BA.debugLine="Dim ItemDesc As String = \"A verificação da viat";
Debug.ShouldStop(128);
_itemdesc = BA.ObjectToString("A verificação da viatura já foi realizada, sem registo de danos!");Debug.locals.put("ItemDesc", _itemdesc);Debug.locals.put("ItemDesc", _itemdesc);
 BA.debugLineNum = 1929;BA.debugLine="If (ItemStatus = 2) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_itemstatus,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 1930;BA.debugLine="ItemDesc = \"A verificação da viatura já foi re";
Debug.ShouldStop(512);
_itemdesc = BA.ObjectToString("A verificação da viatura já foi realizada, com registo de danos!");Debug.locals.put("ItemDesc", _itemdesc);
 };
 BA.debugLineNum = 1932;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2048);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1933;BA.debugLine="i = Msgbox2($\"${ItemDesc} ${ShareCode.userChoic";
Debug.ShouldStop(4096);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemdesc))),RemoteObject.createImmutable(" "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._userchoiceoptionavailable /*RemoteObject*/ ))),RemoteObject.createImmutable(""))))),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalnotetitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._useroptionveraccao /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._useroptionreexecuteaccao /*RemoteObject*/ ),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1934;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1935;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(16384);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1936;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(32768);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1937;BA.debugLine="Filter.GetFastActionDialog(Activity, CLAItem,";
Debug.ShouldStop(65536);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getfastactiondialog" /*void*/ ,(Object)(user.mostCurrent._activity),(Object)(_claitem),(Object)(BA.ObjectToString("Verificação de viatura")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Viatura com matricula "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_carobj.getField(true,"plate" /*RemoteObject*/ )))),RemoteObject.createImmutable(" sem danos a registar?")))),(Object)(_tgo),(Object)(_itemstatus),(Object)(user.mostCurrent.__c.getField(true,"True")),(Object)(_carobj));
 }else 
{ BA.debugLineNum = 1938;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
 BA.debugLineNum = 1939;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(262144);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1940;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(524288);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1941;BA.debugLine="Filter.GetFastActionDialog(Activity, CLAItem,";
Debug.ShouldStop(1048576);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getfastactiondialog" /*void*/ ,(Object)(user.mostCurrent._activity),(Object)(_claitem),(Object)(BA.ObjectToString("Verificação de viatura")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Viatura com matricula "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_carobj.getField(true,"plate" /*RemoteObject*/ )))),RemoteObject.createImmutable(" sem danos a registar?")))),(Object)(_tgo),(Object)(_itemstatus),(Object)(user.mostCurrent.__c.getField(true,"False")),(Object)(_carobj));
 }}
;
 };
 }else {
 BA.debugLineNum = 1945;BA.debugLine="Record.Close";
Debug.ShouldStop(16777216);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 1947;BA.debugLine="Record.Close";
Debug.ShouldStop(67108864);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1949;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grouplinechange_click() throws Exception{
try {
		Debug.PushSubsStack("GroupLineChange_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1267);
if (RapidSub.canDelegate("grouplinechange_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","grouplinechange_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _itemtagcode = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _listtype = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1267;BA.debugLine="Sub GroupLineChange_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1268;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(524288);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 1269;BA.debugLine="Dim ItemTagCode As String = b.Tag";
Debug.ShouldStop(1048576);
_itemtagcode = BA.ObjectToString(_b.runMethod(false,"getTag"));Debug.locals.put("ItemTagCode", _itemtagcode);Debug.locals.put("ItemTagCode", _itemtagcode);
 BA.debugLineNum = 1270;BA.debugLine="Dim p As Panel = b.Parent";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _b.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 1271;BA.debugLine="Dim ListType As Int = p.Tag";
Debug.ShouldStop(4194304);
_listtype = BA.numberCast(int.class, _p.runMethod(false,"getTag"));Debug.locals.put("ListType", _listtype);Debug.locals.put("ListType", _listtype);
 BA.debugLineNum = 1273;BA.debugLine="If (ListType = 0) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_listtype,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1274;BA.debugLine="ListOfUserEquipments(ItemTagCode)";
Debug.ShouldStop(33554432);
_listofuserequipments(_itemtagcode);
 };
 BA.debugLineNum = 1276;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grouplineclickuser_click() throws Exception{
try {
		Debug.PushSubsStack("GroupLineClickUser_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1967);
if (RapidSub.canDelegate("grouplineclickuser_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","grouplineclickuser_click");}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pnl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1967;BA.debugLine="Sub GroupLineClickUser_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1968;BA.debugLine="Dim pnl As Panel = Sender";
Debug.ShouldStop(32768);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1969;BA.debugLine="Dim pnl1 As Label = pnl.GetView(0)";
Debug.ShouldStop(65536);
_pnl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_pnl1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("pnl1", _pnl1);
 BA.debugLineNum = 1971;BA.debugLine="If (Utils.DBDataCount(Starter.LocalSQLWRK, $\"sele";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean(">",user.mostCurrent._utils.runMethod(true,"_dbdatacount" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable("select count(0) as COUNTER from loc_userssession where session='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._starter._localsessioncode /*RemoteObject*/ ))),RemoteObject.createImmutable("'"))))),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1973;BA.debugLine="If (ShareCode.SESS_OPER_User <> pnl1.Tag) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("!",user.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ,BA.ObjectToString(_pnl1.runMethod(false,"getTag"))))) { 
 BA.debugLineNum = 1974;BA.debugLine="ChangeUserOperation(pnl1.tag)";
Debug.ShouldStop(2097152);
_changeuseroperation(BA.ObjectToString(_pnl1.runMethod(false,"getTag")));
 };
 };
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
public static RemoteObject  _grouplinedesc_click() throws Exception{
try {
		Debug.PushSubsStack("GroupLineDesc_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1798);
if (RapidSub.canDelegate("grouplinedesc_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","grouplinedesc_click");}
 BA.debugLineNum = 1798;BA.debugLine="Sub GroupLineDesc_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 1800;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grouplinedesc_longclick() throws Exception{
try {
		Debug.PushSubsStack("GroupLineDesc_LongClick (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1802);
if (RapidSub.canDelegate("grouplinedesc_longclick")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","grouplinedesc_longclick");}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pdfappslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1802;BA.debugLine="Sub GroupLineDesc_LongClick";
Debug.ShouldStop(512);
 BA.debugLineNum = 1803;BA.debugLine="Dim lbl As Label = Sender";
Debug.ShouldStop(1024);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1804;BA.debugLine="Dim FileName As String = lbl.Tag";
Debug.ShouldStop(2048);
_filename = BA.ObjectToString(_lbl.runMethod(false,"getTag"));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1805;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(4096);
_continua = user.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 1806;BA.debugLine="If Continua Then";
Debug.ShouldStop(8192);
if (_continua.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1812;BA.debugLine="Dim intent1 As Intent";
Debug.ShouldStop(524288);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent1", _intent1);
 BA.debugLineNum = 1813;BA.debugLine="intent1.Initialize(intent1.ACTION_VIEW, Starter.";
Debug.ShouldStop(1048576);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(BA.ObjectToString(user.mostCurrent._starter._provider /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename)))));
 BA.debugLineNum = 1814;BA.debugLine="intent1.SetType(\"application/pdf\")";
Debug.ShouldStop(2097152);
_intent1.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/pdf")));
 BA.debugLineNum = 1815;BA.debugLine="intent1.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSIO";
Debug.ShouldStop(4194304);
_intent1.runMethod(true,"setFlags",BA.numberCast(int.class, 1));
 BA.debugLineNum = 1832;BA.debugLine="Dim pdfAppsList As List";
Debug.ShouldStop(128);
_pdfappslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1833;BA.debugLine="pdfAppsList = Utils.QueryIntent(intent1)";
Debug.ShouldStop(256);
_pdfappslist = user.mostCurrent._utils.runMethod(false,"_queryintent" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_intent1));Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1834;BA.debugLine="If pdfAppsList.size>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_pdfappslist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1835;BA.debugLine="StartActivity(intent1)";
Debug.ShouldStop(1024);
user.mostCurrent.__c.runVoidMethod ("StartActivity",user.processBA,(Object)((_intent1.getObject())));
 };
 };
 BA.debugLineNum = 1838;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grouplineremove_click() throws Exception{
try {
		Debug.PushSubsStack("GroupLineRemove_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1309);
if (RapidSub.canDelegate("grouplineremove_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","grouplineremove_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _itemtagcode = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _listtype = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1309;BA.debugLine="Sub GroupLineRemove_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1310;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(536870912);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 1311;BA.debugLine="Dim ItemTagCode As String = b.Tag";
Debug.ShouldStop(1073741824);
_itemtagcode = BA.ObjectToString(_b.runMethod(false,"getTag"));Debug.locals.put("ItemTagCode", _itemtagcode);Debug.locals.put("ItemTagCode", _itemtagcode);
 BA.debugLineNum = 1312;BA.debugLine="Dim p As Panel = b.Parent";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _b.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 1313;BA.debugLine="Dim ListType As Int = p.Tag";
Debug.ShouldStop(1);
_listtype = BA.numberCast(int.class, _p.runMethod(false,"getTag"));Debug.locals.put("ListType", _listtype);Debug.locals.put("ListType", _listtype);
 BA.debugLineNum = 1315;BA.debugLine="If (ListType = 0) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",_listtype,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1316;BA.debugLine="RemoveUserEquipments(ItemTagCode)";
Debug.ShouldStop(8);
_removeuserequipments(_itemtagcode);
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
public static void  _listdocuments_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listDocuments_ItemClick (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1182);
if (RapidSub.canDelegate("listdocuments_itemclick")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listdocuments_itemclick", _index, _value); return;}
ResumableSub_listDocuments_ItemClick rsub = new ResumableSub_listDocuments_ItemClick(null,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_listDocuments_ItemClick extends BA.ResumableSub {
public ResumableSub_listDocuments_ItemClick(xevolution.vrcg.devdemov2400.user parent,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("listDocuments_ItemClick (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1182);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1183;BA.debugLine="Dim pnl As Panel = listDocuments.GetPanel(Index)";
Debug.ShouldStop(1073741824);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), parent.mostCurrent._listdocuments.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1184;BA.debugLine="Dim FileName As String = \"\"";
Debug.ShouldStop(-2147483648);
_filename = BA.ObjectToString("");Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1185;BA.debugLine="FileName = pnl.Tag";
Debug.ShouldStop(1);
_filename = BA.ObjectToString(_pnl.runMethod(false,"getTag"));Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1187;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
 BA.debugLineNum = 1188;BA.debugLine="If File.Exists(Starter.InternalFolder, FileName)";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 13;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1189;BA.debugLine="If Not(File.IsDirectory(Starter.SharedFolder, F";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename)))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1191;BA.debugLine="File.Copy(Starter.InternalFolder, FileName,Sta";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename));
 BA.debugLineNum = 1192;BA.debugLine="Utils.ViewPDFFile(FileName)";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_viewpdffile" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_filename));
 BA.debugLineNum = 1194;BA.debugLine="Sleep(20000)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "listdocuments_itemclick"),BA.numberCast(int.class, 20000));
this.state = 17;
return;
case 17:
//C
this.state = 12;
;
 BA.debugLineNum = 1195;BA.debugLine="File.Delete(Starter.SharedFolder, FileName)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1197;BA.debugLine="MsgboxAsync(ShareCode.userfileunavailable, Sha";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfileunavailable /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ )),user.processBA);
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 16;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 BA.debugLineNum = 1201;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6195297299",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1208;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",user.processBA, e0.toString());}
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
public static RemoteObject  _listequipments_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listEquipments_ItemClick (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1222);
if (RapidSub.canDelegate("listequipments_itemclick")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listequipments_itemclick", _index, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _qtd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _dlg = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1222;BA.debugLine="Sub listEquipments_ItemClick (Index As Int, Value";
Debug.ShouldStop(32);
 BA.debugLineNum = 1224;BA.debugLine="CurrentEquipItem = Index +1";
Debug.ShouldStop(128);
user._currentequipitem = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 1225;BA.debugLine="Dim pnl As Panel = listEquipments.GetPanel(Curren";
Debug.ShouldStop(256);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), user.mostCurrent._listequipments.runMethod(false,"_getpanel",(Object)(RemoteObject.solve(new RemoteObject[] {user._currentequipitem,RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1226;BA.debugLine="Dim qtd As Label = pnl.GetView(3)";
Debug.ShouldStop(512);
_qtd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_qtd = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("qtd", _qtd);
 BA.debugLineNum = 1227;BA.debugLine="Dim dlg As AppDialogs";
Debug.ShouldStop(1024);
_dlg = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 1228;BA.debugLine="dlg.Initialize";
Debug.ShouldStop(2048);
_dlg.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1229;BA.debugLine="dlg.GetUserQuantityDialog(\"User\", pnl.tag, qtd.Te";
Debug.ShouldStop(4096);
_dlg.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getuserquantitydialog" /*void*/ ,(Object)(RemoteObject.createImmutable(("User"))),(Object)(BA.ObjectToString(_pnl.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, _qtd.runMethod(true,"getText"))));
 BA.debugLineNum = 1233;BA.debugLine="CurrentDocItem = 0";
Debug.ShouldStop(65536);
user._currentdocitem = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1234;BA.debugLine="ListItemSelected(pnl)";
Debug.ShouldStop(131072);
_listitemselected(_pnl);
 BA.debugLineNum = 1235;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemdocbutton_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemDocButton_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1145);
if (RapidSub.canDelegate("listitemdocbutton_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listitemdocbutton_click");}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lidb = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lidb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lidb2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lidb3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lidb4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _provider = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.fileprovider");
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pdfappslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1145;BA.debugLine="Sub ListItemDocButton_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1147;BA.debugLine="Dim l As Label = Sender";
Debug.ShouldStop(67108864);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("l", _l);
 BA.debugLineNum = 1149;BA.debugLine="Log(l.Tag)";
Debug.ShouldStop(268435456);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6195231748",BA.ObjectToString(_l.runMethod(false,"getTag")),0);
 BA.debugLineNum = 1150;BA.debugLine="Dim p As Panel  = l.Parent";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _l.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 1152;BA.debugLine="Dim lidb As Label = p.GetView(0)";
Debug.ShouldStop(-2147483648);
_lidb = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lidb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lidb", _lidb);
 BA.debugLineNum = 1153;BA.debugLine="Dim lidb1 As Label = p.GetView(1)";
Debug.ShouldStop(1);
_lidb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lidb1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lidb1", _lidb1);
 BA.debugLineNum = 1154;BA.debugLine="Dim lidb2 As Label = p.GetView(2)";
Debug.ShouldStop(2);
_lidb2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lidb2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lidb2", _lidb2);
 BA.debugLineNum = 1155;BA.debugLine="Dim lidb3 As Label = p.GetView(3)";
Debug.ShouldStop(4);
_lidb3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lidb3 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("lidb3", _lidb3);
 BA.debugLineNum = 1156;BA.debugLine="Dim lidb4 As Label = p.GetView(4)";
Debug.ShouldStop(8);
_lidb4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lidb4 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).getObject());Debug.locals.put("lidb4", _lidb4);
 BA.debugLineNum = 1157;BA.debugLine="Log($\"${lidb.tag}, ${lidb1.tag}, ${lidb2.tag}, ${";
Debug.ShouldStop(16);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6195231756",(RemoteObject.concat(RemoteObject.createImmutable(""),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lidb.runMethod(false,"getTag"))),RemoteObject.createImmutable(", "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lidb1.runMethod(false,"getTag"))),RemoteObject.createImmutable(", "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lidb2.runMethod(false,"getTag"))),RemoteObject.createImmutable(", "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lidb3.runMethod(false,"getTag"))),RemoteObject.createImmutable(", "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lidb4.runMethod(false,"getTag"))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 1160;BA.debugLine="Dim Filename As String = lidb.Tag";
Debug.ShouldStop(128);
_filename = BA.ObjectToString(_lidb.runMethod(false,"getTag"));Debug.locals.put("Filename", _filename);Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 1161;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(256);
_continua = user.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 1162;BA.debugLine="If Continua Then";
Debug.ShouldStop(512);
if (_continua.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1163;BA.debugLine="Private Provider As FileProvider";
Debug.ShouldStop(1024);
_provider = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.fileprovider");Debug.locals.put("Provider", _provider);
 BA.debugLineNum = 1164;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(2048);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initialize" /*RemoteObject*/ ,user.processBA);
 BA.debugLineNum = 1165;BA.debugLine="Provider.InitializeSafeDir";
Debug.ShouldStop(4096);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initializesafedir" /*RemoteObject*/ );
 BA.debugLineNum = 1166;BA.debugLine="Dim theFile As String = Provider.GetFileUri(File";
Debug.ShouldStop(8192);
_thefile = BA.ObjectToString(_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename)));Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 1168;BA.debugLine="Log(theFile)";
Debug.ShouldStop(32768);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6195231767",_thefile,0);
 BA.debugLineNum = 1169;BA.debugLine="Dim Intent1 As Intent";
Debug.ShouldStop(65536);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 1170;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"file://";
Debug.ShouldStop(131072);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("file://"),_thefile)));
 BA.debugLineNum = 1171;BA.debugLine="Intent1.SetType(\"application/pdf\")";
Debug.ShouldStop(262144);
_intent1.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/pdf")));
 BA.debugLineNum = 1172;BA.debugLine="Dim pdfAppsList As List";
Debug.ShouldStop(524288);
_pdfappslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1173;BA.debugLine="pdfAppsList = Utils.QueryIntent(Intent1)";
Debug.ShouldStop(1048576);
_pdfappslist = user.mostCurrent._utils.runMethod(false,"_queryintent" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_intent1));Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1174;BA.debugLine="If pdfAppsList.size>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_pdfappslist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1176;BA.debugLine="Log(\"pdf viewer(s) exists\")";
Debug.ShouldStop(8388608);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6195231775",RemoteObject.createImmutable("pdf viewer(s) exists"),0);
 BA.debugLineNum = 1177;BA.debugLine="StartActivity(Intent1)";
Debug.ShouldStop(16777216);
user.mostCurrent.__c.runVoidMethod ("StartActivity",user.processBA,(Object)((_intent1.getObject())));
 };
 };
 BA.debugLineNum = 1180;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemdocview_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemDocView_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,867);
if (RapidSub.canDelegate("listitemdocview_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listitemdocview_click");}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 867;BA.debugLine="Sub ListItemDocView_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 868;BA.debugLine="Dim lbl As Label = Sender";
Debug.ShouldStop(8);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 869;BA.debugLine="Dim FileName As String = lbl.Tag";
Debug.ShouldStop(16);
_filename = BA.ObjectToString(_lbl.runMethod(false,"getTag"));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 870;BA.debugLine="If File.Exists(Starter.InternalFolder, FileName)";
Debug.ShouldStop(32);
if (user.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(user.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 871;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 872;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, Sta";
Debug.ShouldStop(128);
user.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(user.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(user.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",user.processBA, e7.toString()); BA.debugLineNum = 874;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6194379783",BA.ObjectToString(user.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 };
 }else {
 BA.debugLineNum = 883;BA.debugLine="If File.Exists(Starter.SharedFolder, FileName) T";
Debug.ShouldStop(262144);
if (user.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(user.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 884;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 885;BA.debugLine="File.Copy(Starter.SharedFolder, FileName, Star";
Debug.ShouldStop(1048576);
user.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(user.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(user.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",user.processBA, e14.toString()); BA.debugLineNum = 887;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6194379796",BA.ObjectToString(user.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 };
 }else {
 BA.debugLineNum = 891;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.userfilenoinde";
Debug.ShouldStop(67108864);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._userfilenoindentified /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 892;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 893;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 894;BA.debugLine="DownloadFilesWithFTP(FileName)";
Debug.ShouldStop(536870912);
_downloadfileswithftp(_filename);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",user.processBA, e22.toString()); BA.debugLineNum = 896;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6194379805",BA.ObjectToString(user.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 };
 }else {
 BA.debugLineNum = 899;BA.debugLine="FileName = \"\"";
Debug.ShouldStop(4);
_filename = BA.ObjectToString("");Debug.locals.put("FileName", _filename);
 };
 };
 };
 BA.debugLineNum = 910;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 911;BA.debugLine="If Utils.NNE(FileName) Then";
Debug.ShouldStop(16384);
if (user.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 912;BA.debugLine="Utils.ViewPDFFile(FileName)";
Debug.ShouldStop(32768);
user.mostCurrent._utils.runVoidMethod ("_viewpdffile" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_filename));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e34) {
			BA.rdebugUtils.runVoidMethod("setLastException",user.processBA, e34.toString()); BA.debugLineNum = 915;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6194379824",BA.ObjectToString(user.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 BA.debugLineNum = 916;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.userfilewithpro";
Debug.ShouldStop(524288);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._userfilewithproblems /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 917;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 918;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 919;BA.debugLine="DownloadFilesWithFTP(FileName)";
Debug.ShouldStop(4194304);
_downloadfileswithftp(_filename);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e40) {
			BA.rdebugUtils.runVoidMethod("setLastException",user.processBA, e40.toString()); BA.debugLineNum = 921;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6194379830",BA.ObjectToString(user.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 };
 }else {
 BA.debugLineNum = 924;BA.debugLine="FileName = \"\"";
Debug.ShouldStop(134217728);
_filename = BA.ObjectToString("");Debug.locals.put("FileName", _filename);
 };
 BA.debugLineNum = 926;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 927;BA.debugLine="If Utils.NNE(FileName) Then";
Debug.ShouldStop(1073741824);
if (user.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 928;BA.debugLine="Utils.ViewPDFFile(FileName)";
Debug.ShouldStop(-2147483648);
user.mostCurrent._utils.runVoidMethod ("_viewpdffile" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_filename));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e50) {
			BA.rdebugUtils.runVoidMethod("setLastException",user.processBA, e50.toString()); BA.debugLineNum = 931;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6194379840",BA.ObjectToString(user.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 };
 };
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
public static RemoteObject  _listitempanel_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemPanel_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1106);
if (RapidSub.canDelegate("listitempanel_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listitempanel_click");}
 BA.debugLineNum = 1106;BA.debugLine="Sub ListItemPanel_Click";
Debug.ShouldStop(131072);
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
public static RemoteObject  _listitempanel_longclick() throws Exception{
try {
		Debug.PushSubsStack("ListItemPanel_LongClick (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1110);
if (RapidSub.canDelegate("listitempanel_longclick")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listitempanel_longclick");}
 BA.debugLineNum = 1110;BA.debugLine="Sub ListItemPanel_LongClick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1112;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemRefresh_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,862);
if (RapidSub.canDelegate("listitemrefresh_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listitemrefresh_click");}
 BA.debugLineNum = 862;BA.debugLine="Sub ListItemRefresh_Click";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _listitemselected(RemoteObject _pan) throws Exception{
try {
		Debug.PushSubsStack("ListItemSelected (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1213);
if (RapidSub.canDelegate("listitemselected")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listitemselected", _pan);}
int _index = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1213;BA.debugLine="Sub ListItemSelected(pan As Panel)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1214;BA.debugLine="For index= 0 To listEquipments.GetSize-1";
Debug.ShouldStop(536870912);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {user.mostCurrent._listequipments.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_index = 0 ;
for (;(step1 > 0 && _index <= limit1) || (step1 < 0 && _index >= limit1) ;_index = ((int)(0 + _index + step1))  ) {
Debug.locals.put("index", _index);
 BA.debugLineNum = 1215;BA.debugLine="Dim p As Panel = listEquipments.GetPanel(index)";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), user.mostCurrent._listequipments.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _index))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 1216;BA.debugLine="p.Color = Consts.ColorWhite";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("setColor",user.mostCurrent._consts._colorwhite /*RemoteObject*/ );
 }
}Debug.locals.put("index", _index);
;
 BA.debugLineNum = 1218;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
Debug.ShouldStop(2);
_pan.runVoidMethod ("setColor",user.mostCurrent._consts._colorciansoftlight /*RemoteObject*/ );
 BA.debugLineNum = 1219;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(4);
_windowstatusupdate();
 BA.debugLineNum = 1220;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listofuserequipments(RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("ListOfUserEquipments (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1321);
if (RapidSub.canDelegate("listofuserequipments")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listofuserequipments", _tagcode);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1321;BA.debugLine="Sub ListOfUserEquipments(tagcode As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1322;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(512);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1324;BA.debugLine="Dim SQL As String = $\"select title, serialnumber,";
Debug.ShouldStop(2048);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode not in (select equipment_tagcode from dta_equipments_technicals where technical_tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("')")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 1326;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(8192);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 1327;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1328;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(32768);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1329;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(65536);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1330;BA.debugLine="Filter.getDoubleLineEquipmentsDialog(Activity, \"";
Debug.ShouldStop(131072);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getdoublelineequipmentsdialog" /*void*/ ,(Object)(user.mostCurrent._activity),(Object)(RemoteObject.createImmutable(("User"))),(Object)(BA.ObjectToString("Lista de equipamentos")),(Object)(_record),(Object)(_tagcode));
 }else {
 BA.debugLineNum = 1332;BA.debugLine="MsgboxAsync(ShareCode.userNoEquipments, ShareCod";
Debug.ShouldStop(524288);
user.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._usernoequipments /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),user.processBA);
 BA.debugLineNum = 1333;BA.debugLine="Record.Close";
Debug.ShouldStop(1048576);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 1335;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listofvehicles() throws Exception{
try {
		Debug.PushSubsStack("ListOfVehicles (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1337);
if (RapidSub.canDelegate("listofvehicles")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listofvehicles");}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 1337;BA.debugLine="Sub ListOfVehicles()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1338;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(33554432);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1340;BA.debugLine="Dim SQL As String = $\"Select a.tagcode , a.title_";
Debug.ShouldStop(134217728);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("Select a.tagcode , a.title_import from dta_objects As a\n"),RemoteObject.createImmutable(" 														INNER JOIN dta_objecttypes As b on \n"),RemoteObject.createImmutable(" 															(b.tagcode = a.object_type And b.inout_tagcode = 'TINOUT_VEHICLES')\n"),RemoteObject.createImmutable("								where a.active=1")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 1344;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(-2147483648);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 1345;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1346;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(2);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1347;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(4);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,user.mostCurrent.activityBA);
 BA.debugLineNum = 1348;BA.debugLine="Filter.getVehiclesListDialog(Activity, \"User\", \"";
Debug.ShouldStop(8);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getvehicleslistdialog" /*void*/ ,(Object)(user.mostCurrent._activity),(Object)(RemoteObject.createImmutable(("User"))),(Object)(BA.ObjectToString("Lista de Veículos")),(Object)(_record));
 }else {
 BA.debugLineNum = 1350;BA.debugLine="MsgboxAsync(ShareCode.userNoVehicles, ShareCode.";
Debug.ShouldStop(32);
user.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._usernovehicles /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),user.processBA);
 BA.debugLineNum = 1351;BA.debugLine="Record.Close";
Debug.ShouldStop(64);
_record.runVoidMethod ("Close");
 };
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
public static RemoteObject  _listpedidos_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listPedidos_ItemClick (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1100);
if (RapidSub.canDelegate("listpedidos_itemclick")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listpedidos_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1100;BA.debugLine="Sub listPedidos_ItemClick (Index As Int, Value As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1104;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonadd_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonAdd_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1096);
if (RapidSub.canDelegate("listsbuttonadd_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listsbuttonadd_click");}
 BA.debugLineNum = 1096;BA.debugLine="Sub listsButtonAdd_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1098;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonclose_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonClose_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1084);
if (RapidSub.canDelegate("listsbuttonclose_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","listsbuttonclose_click");}
 BA.debugLineNum = 1084;BA.debugLine="Sub listsButtonClose_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1085;BA.debugLine="Log(\"Back USER\")";
Debug.ShouldStop(268435456);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6194772993",RemoteObject.createImmutable("Back USER"),0);
 BA.debugLineNum = 1086;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(536870912);
if ((user.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1087;BA.debugLine="If(PhoneBackButtonTab) Then";
Debug.ShouldStop(1073741824);
if ((_phonebackbuttontab()).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1088;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 1091;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
Debug.ShouldStop(4);
user.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",user.processBA,(Object)((user.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturn")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1092;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
user.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1093;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(16);
user.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 1094;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _liststabpanel_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2407);
if (RapidSub.canDelegate("liststabpanel_pageselected")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","liststabpanel_pageselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 2407;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 2408;BA.debugLine="If(ShareCode.ISPHONE And MenuPanel.Visible = Fals";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean(".",user.mostCurrent._sharecode._isphone /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",user.mostCurrent._menupanel.runMethod(true,"getVisible"),user.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 2409;BA.debugLine="If(Position = 0) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 2410;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabe";
Debug.ShouldStop(512);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._usermainlabeloptlistsuser /*RemoteObject*/ ));
 }else 
{ BA.debugLineNum = 2411;BA.debugLine="Else If	(Position = 1) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 2412;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabe";
Debug.ShouldStop(2048);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._usermainlabeloptlistsdocs /*RemoteObject*/ ));
 }else 
{ BA.debugLineNum = 2413;BA.debugLine="Else If	(Position = 2) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 2414;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabe";
Debug.ShouldStop(8192);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._usermainlabeloptlistscons /*RemoteObject*/ ));
 }else 
{ BA.debugLineNum = 2415;BA.debugLine="Else If	(Position = 3) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 2416;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabe";
Debug.ShouldStop(32768);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._usermainlabeloptlistsoper /*RemoteObject*/ ));
 }}}}
;
 };
 BA.debugLineNum = 2420;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainlogo_click() throws Exception{
try {
		Debug.PushSubsStack("mainLogo_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1842);
if (RapidSub.canDelegate("mainlogo_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","mainlogo_click");}
 BA.debugLineNum = 1842;BA.debugLine="Sub mainLogo_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1843;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(262144);
_listsbuttonclose_click();
 BA.debugLineNum = 1844;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedocumentslist(RemoteObject _filter) throws Exception{
try {
		Debug.PushSubsStack("MakeDocumentsList (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,789);
if (RapidSub.canDelegate("makedocumentslist")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","makedocumentslist", _filter);}
RemoteObject _thisrecord = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
int _row = 0;
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _height = RemoteObject.createImmutable(0);
Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 789;BA.debugLine="Sub MakeDocumentsList(Filter As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 790;BA.debugLine="Private ThisRecord As Cursor";
Debug.ShouldStop(2097152);
_thisrecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("ThisRecord", _thisrecord);
 BA.debugLineNum = 796;BA.debugLine="Dim sSQL As String = $\"Select b.tagdesc As doctyp";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("Select b.tagdesc As doctype_title, a.title, a.valid_to, a.tagcode, a.doc_filename\n"),RemoteObject.createImmutable("						from dta_documents As a\n"),RemoteObject.createImmutable("						left join type_documenttypes As b on (b.tagcode=a.document_type)\n"),RemoteObject.createImmutable("						where a.is_from=0 ")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 802;BA.debugLine="ThisRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(2);
_thisrecord = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 803;BA.debugLine="If ThisRecord.RowCount > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_thisrecord.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 804;BA.debugLine="CurrentDocItem = 0";
Debug.ShouldStop(8);
user._currentdocitem = BA.numberCast(int.class, 0);
 BA.debugLineNum = 805;BA.debugLine="TotalLineItems = ThisRecord.RowCount";
Debug.ShouldStop(16);
user._totallineitems = _thisrecord.runMethod(true,"getRowCount");
 BA.debugLineNum = 806;BA.debugLine="For Row = 0 To TotalLineItems-1";
Debug.ShouldStop(32);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {user._totallineitems,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step7 > 0 && _row <= limit7) || (step7 < 0 && _row >= limit7) ;_row = ((int)(0 + _row + step7))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 807;BA.debugLine="ThisRecord.Position = Row";
Debug.ShouldStop(64);
_thisrecord.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 808;BA.debugLine="Dim Continua As Boolean = True ' ((Filter = 0)";
Debug.ShouldStop(128);
_continua = user.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 809;BA.debugLine="Dim Height As Int =100dip";
Debug.ShouldStop(256);
_height = user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)));Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 811;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1024);
if ((user.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 812;BA.debugLine="Height = 135dip";
Debug.ShouldStop(2048);
_height = user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 135)));Debug.locals.put("Height", _height);
 };
 BA.debugLineNum = 815;BA.debugLine="If (Continua) Then";
Debug.ShouldStop(16384);
if ((_continua).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 816;BA.debugLine="listDocuments.Add(CreateDocListItem(Row, ThisR";
Debug.ShouldStop(32768);
user.mostCurrent._listdocuments.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createdoclistitem(BA.numberCast(int.class, _row),_thisrecord,user.mostCurrent._listdocuments.runMethod(false,"_asview").runMethod(true,"getWidth"),_height,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.BitmapDrawable"), user.mostCurrent.__c.getField(false,"Null"))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 };
 }
}Debug.locals.put("Row", _row);
;
 }else {
 BA.debugLineNum = 820;BA.debugLine="ThisRecord.Close";
Debug.ShouldStop(524288);
_thisrecord.runVoidMethod ("Close");
 };
 BA.debugLineNum = 822;BA.debugLine="ThisRecord.Close";
Debug.ShouldStop(2097152);
_thisrecord.runVoidMethod ("Close");
 BA.debugLineNum = 823;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeequipmentlistsearch(RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("MakeEquipmentListSearch (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1761);
if (RapidSub.canDelegate("makeequipmentlistsearch")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","makeequipmentlistsearch", _search);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
int _row = 0;
Debug.locals.put("search", _search);
 BA.debugLineNum = 1761;BA.debugLine="Sub MakeEquipmentListSearch(search As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1762;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(2);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1763;BA.debugLine="Dim sSQL As String = $\"select a.*, ifnull(b.statu";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select a.*, ifnull(b.status, 0) as status from warehouses_items as a left join userinnertasksnolines as b on (b.product_tagcode=a.tagcode and b.tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable(" 							where a.warehouse='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._sess_warehouse /*RemoteObject*/ ))),RemoteObject.createImmutable("' ")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1766;BA.debugLine="If (search <> \"\") Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("!",_search,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 1767;BA.debugLine="sSQL = $\"${sSQL} and a.title||a.value||a.notes l";
Debug.ShouldStop(64);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" and a.title||a.value||a.notes like '%"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%'")));Debug.locals.put("sSQL", _ssql);
 };
 BA.debugLineNum = 1770;BA.debugLine="Record = Starter.LocalSQL.ExecQuery(sSQL)";
Debug.ShouldStop(512);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1771;BA.debugLine="listEquipments.Clear";
Debug.ShouldStop(1024);
user.mostCurrent._listequipments.runVoidMethod ("_clear");
 BA.debugLineNum = 1772;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1773;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(4096);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step9 > 0 && _row <= limit9) || (step9 < 0 && _row >= limit9) ;_row = ((int)(0 + _row + step9))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1774;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(8192);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 1775;BA.debugLine="listEquipments.Add( CreateEquipListItem(Row, Re";
Debug.ShouldStop(16384);
user.mostCurrent._listequipments.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createequiplistitem(BA.numberCast(int.class, _row),_record,user.mostCurrent._listequipments.runMethod(false,"_asview").runMethod(true,"getWidth"),user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.BitmapDrawable"), user.mostCurrent.__c.getField(false,"Null"))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 1778;BA.debugLine="Record.Close";
Debug.ShouldStop(131072);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1779;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeequipmentslist(RemoteObject _filter) throws Exception{
try {
		Debug.PushSubsStack("MakeEquipmentsList (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,986);
if (RapidSub.canDelegate("makeequipmentslist")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","makeequipmentslist", _filter);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _height = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _continua = RemoteObject.createImmutable(false);
Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 986;BA.debugLine="Sub MakeEquipmentsList(Filter As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 987;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(67108864);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 988;BA.debugLine="Dim sSQL As String = $\"select ifnull(b.title,'')";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(b.title,'') as group_title, d.qtd AS qtdw, ifnull(c.tagdesc,'') as type_title, a.*, d.warehouse_tagcode \n"),RemoteObject.createImmutable("							from dta_articles as a\n"),RemoteObject.createImmutable("							left join dta_articles_groups as b on (b.tagcode=a.article_group)\n"),RemoteObject.createImmutable("							left join type_articlestypes as c on (c.tagcode=a.article_type)\n"),RemoteObject.createImmutable("							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and\n"),RemoteObject.createImmutable("								d.warehouse_tagcode in (select tagcode from dta_warehouses \n"),RemoteObject.createImmutable("										where object_tagcode in (select tagcode from dta_objects \n"),RemoteObject.createImmutable("											where tagcode in (select vehicle_tagcode from dta_technicals where tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("'))))")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 996;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(8);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 997;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 998;BA.debugLine="CurrentEquipItem = 0";
Debug.ShouldStop(32);
user._currentequipitem = BA.numberCast(int.class, 0);
 BA.debugLineNum = 999;BA.debugLine="TotalLineItems = Record.RowCount";
Debug.ShouldStop(64);
user._totallineitems = _record.runMethod(true,"getRowCount");
 BA.debugLineNum = 1000;BA.debugLine="Dim Height As Int = 100dip";
Debug.ShouldStop(128);
_height = user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)));Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 1002;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(512);
if ((user.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1003;BA.debugLine="Height = 140dip";
Debug.ShouldStop(1024);
_height = user.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)));Debug.locals.put("Height", _height);
 };
 BA.debugLineNum = 1007;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(16384);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step11 > 0 && _row <= limit11) || (step11 < 0 && _row >= limit11) ;_row = ((int)(0 + _row + step11))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1008;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(32768);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 1009;BA.debugLine="If Row = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_row),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1010;BA.debugLine="USERWAREHOUSE = Utils.IfNullOrEmpty(Record.get";
Debug.ShouldStop(131072);
user.mostCurrent._userwarehouse = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("warehouse_tagcode")))),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 1012;BA.debugLine="Dim Continua As Boolean = True '((Filter = 0) O";
Debug.ShouldStop(524288);
_continua = user.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 1013;BA.debugLine="If (Continua) Then";
Debug.ShouldStop(1048576);
if ((_continua).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1014;BA.debugLine="listEquipments.Add(CreateEquipListItem(Row, Re";
Debug.ShouldStop(2097152);
user.mostCurrent._listequipments.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createequiplistitem(BA.numberCast(int.class, _row),_record,user.mostCurrent._listequipments.runMethod(false,"_asview").runMethod(true,"getWidth"),_height,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.BitmapDrawable"), user.mostCurrent.__c.getField(false,"Null"))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1015;BA.debugLine="If ConfirmProducts And FirstDataLoad Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(".",user._confirmproducts) && RemoteObject.solveBoolean(".",user._firstdataload)) { 
 BA.debugLineNum = 1016;BA.debugLine="ProductsToConfirm = ProductsToConfirm + 1";
Debug.ShouldStop(8388608);
user._productstoconfirm = RemoteObject.solve(new RemoteObject[] {user._productstoconfirm,RemoteObject.createImmutable(1)}, "+",1, 1);
 };
 };
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 1021;BA.debugLine="Record.Close";
Debug.ShouldStop(268435456);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1022;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _makeunavailable(RemoteObject _unv) throws Exception{
try {
		Debug.PushSubsStack("MakeUnavailable (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1512);
if (RapidSub.canDelegate("makeunavailable")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","makeunavailable", _unv); return;}
ResumableSub_MakeUnavailable rsub = new ResumableSub_MakeUnavailable(null,_unv);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MakeUnavailable extends BA.ResumableSub {
public ResumableSub_MakeUnavailable(xevolution.vrcg.devdemov2400.user parent,RemoteObject _unv) {
this.parent = parent;
this._unv = _unv;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _unv;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeUnavailable (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1512);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("unv", _unv);
 BA.debugLineNum = 1513;BA.debugLine="ProgressDialogShow(ShareCode.userAguardeumMomento";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",user.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useraguardeummomento /*RemoteObject*/ )));
 BA.debugLineNum = 1515;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196608003",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 1516;BA.debugLine="Log(\"	GRAVA INDISPONIBILIDADE\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196608004",RemoteObject.createImmutable("	GRAVA INDISPONIBILIDADE"),0);
 BA.debugLineNum = 1517;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196608005",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 1518;BA.debugLine="ShareCode.USR_STATE = 0";
Debug.ShouldStop(8192);
parent.mostCurrent._sharecode._usr_state /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1519;BA.debugLine="DBStructures.updateUserAvailableState(ShareCode.S";
Debug.ShouldStop(16384);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateuseravailablestate" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._usr_state /*RemoteObject*/ ));
 BA.debugLineNum = 1520;BA.debugLine="DBStructures.insertUserUnavailable(ShareCode.SESS";
Debug.ShouldStop(32768);
parent.mostCurrent._dbstructures.runVoidMethod ("_insertuserunavailable" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(_unv.getField(true,"StartDate" /*RemoteObject*/ )),(Object)(_unv.getField(true,"EndDate" /*RemoteObject*/ )),(Object)(_unv.getField(true,"Reason" /*RemoteObject*/ )));
 BA.debugLineNum = 1522;BA.debugLine="Dim params As Map";
Debug.ShouldStop(131072);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1523;BA.debugLine="params.Initialize";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1524;BA.debugLine="params.Clear";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1525;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1526;BA.debugLine="params.Put(\"_tagcode\", ShareCode.SESS_OPER_User)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 1527;BA.debugLine="params.Put(\"_state\", 0)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_state"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1528;BA.debugLine="params.Put(\"start_date\", unv.StartDate)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("start_date"))),(Object)((_unv.getField(true,"StartDate" /*RemoteObject*/ ))));
 BA.debugLineNum = 1529;BA.debugLine="params.Put(\"end_date\", unv.EndDate)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("end_date"))),(Object)((_unv.getField(true,"EndDate" /*RemoteObject*/ ))));
 BA.debugLineNum = 1530;BA.debugLine="params.Put(\"reason\", unv.Reason)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((_unv.getField(true,"Reason" /*RemoteObject*/ ))));
 BA.debugLineNum = 1531;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1532;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1533;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1534;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1535;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1536;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1537;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1538;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196608026",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 1539;BA.debugLine="Log(\"	CHAMA API\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196608027",RemoteObject.createImmutable("	CHAMA API"),0);
 BA.debugLineNum = 1540;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196608028",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 1543;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(64);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/mobile/user/available")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1544;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1545;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"UnavReturn\",";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(user.getObject()),(Object)(_url),(Object)(BA.ObjectToString("UnavReturn")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1547;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(1024);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1548;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1550;BA.debugLine="Sleep(250)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "makeunavailable"),BA.numberCast(int.class, 250));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 1552;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_5\", Me)";
Debug.ShouldStop(32768);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_5")),(Object)(user.getObject()));
 BA.debugLineNum = 1579;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(1024);
_windowstatusupdate();
 BA.debugLineNum = 1580;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1581;BA.debugLine="End Sub";
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
public static void  _makeunavailable2(RemoteObject _unv) throws Exception{
try {
		Debug.PushSubsStack("MakeUnavailable2 (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1584);
if (RapidSub.canDelegate("makeunavailable2")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","makeunavailable2", _unv); return;}
ResumableSub_MakeUnavailable2 rsub = new ResumableSub_MakeUnavailable2(null,_unv);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MakeUnavailable2 extends BA.ResumableSub {
public ResumableSub_MakeUnavailable2(xevolution.vrcg.devdemov2400.user parent,RemoteObject _unv) {
this.parent = parent;
this._unv = _unv;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _unv;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeUnavailable2 (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1584);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("unv", _unv);
 BA.debugLineNum = 1585;BA.debugLine="ProgressDialogShow(ShareCode.userAguardeumMomento";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",user.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useraguardeummomento /*RemoteObject*/ )));
 BA.debugLineNum = 1587;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196673539",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 1588;BA.debugLine="Log(\"	GRAVA INDISPONIBILIDADE\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196673540",RemoteObject.createImmutable("	GRAVA INDISPONIBILIDADE"),0);
 BA.debugLineNum = 1589;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196673541",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 1590;BA.debugLine="ShareCode.USR_STATE = 0";
Debug.ShouldStop(2097152);
parent.mostCurrent._sharecode._usr_state /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1591;BA.debugLine="DBStructures.updateUserAvailableState(ShareCode.S";
Debug.ShouldStop(4194304);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateuseravailablestate" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._usr_state /*RemoteObject*/ ));
 BA.debugLineNum = 1592;BA.debugLine="DBStructures.insertUserUnavailable(ShareCode.SESS";
Debug.ShouldStop(8388608);
parent.mostCurrent._dbstructures.runVoidMethod ("_insertuserunavailable" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(_unv.getField(true,"StartDate" /*RemoteObject*/ )),(Object)(_unv.getField(true,"EndDate" /*RemoteObject*/ )),(Object)(_unv.getField(true,"Reason" /*RemoteObject*/ )));
 BA.debugLineNum = 1594;BA.debugLine="Dim params As Map";
Debug.ShouldStop(33554432);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1595;BA.debugLine="params.Initialize";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1596;BA.debugLine="params.Clear";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1597;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1598;BA.debugLine="params.Put(\"_tagcode\", ShareCode.SESS_OPER_User)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 1599;BA.debugLine="params.Put(\"_state\", 0)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_state"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1600;BA.debugLine="params.Put(\"start_date\", unv.StartDate)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("start_date"))),(Object)((_unv.getField(true,"StartDate" /*RemoteObject*/ ))));
 BA.debugLineNum = 1601;BA.debugLine="params.Put(\"end_date\", unv.EndDate)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("end_date"))),(Object)((_unv.getField(true,"EndDate" /*RemoteObject*/ ))));
 BA.debugLineNum = 1602;BA.debugLine="params.Put(\"reason\", unv.Reason)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((_unv.getField(true,"Reason" /*RemoteObject*/ ))));
 BA.debugLineNum = 1603;BA.debugLine="params.Put(\"cause\", unv.Cause)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cause"))),(Object)((_unv.getField(true,"Cause" /*RemoteObject*/ ))));
 BA.debugLineNum = 1604;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1605;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1606;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1607;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1608;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1609;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1610;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1611;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196673563",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 1612;BA.debugLine="Log(\"	CHAMA API\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196673564",RemoteObject.createImmutable("	CHAMA API"),0);
 BA.debugLineNum = 1613;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6196673565",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 1616;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(32768);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/mobile/user/available")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1617;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1618;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"UnavReturn\",";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(user.getObject()),(Object)(_url),(Object)(BA.ObjectToString("UnavReturn")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1620;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(524288);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1621;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1623;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "makeunavailable2"),BA.numberCast(int.class, 250));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 1625;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_5\", Me)";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_5")),(Object)(user.getObject()));
 BA.debugLineNum = 1626;BA.debugLine="Sleep(500)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "makeunavailable2"),BA.numberCast(int.class, 500));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1627;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(67108864);
_windowstatusupdate();
 BA.debugLineNum = 1628;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1629;BA.debugLine="End Sub";
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
public static RemoteObject  _menupanelconsumablesbutton_click() throws Exception{
try {
		Debug.PushSubsStack("MenuPanelConsumablesButton_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2392);
if (RapidSub.canDelegate("menupanelconsumablesbutton_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","menupanelconsumablesbutton_click");}
 BA.debugLineNum = 2392;BA.debugLine="Sub MenuPanelConsumablesButton_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2393;BA.debugLine="listsTabPanel.ScrollTo(2,False)";
Debug.ShouldStop(16777216);
user.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 2)),(Object)(user.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2394;BA.debugLine="MenuPanel.Visible = False";
Debug.ShouldStop(33554432);
user.mostCurrent._menupanel.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2395;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(67108864);
user.mostCurrent._panel1.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2396;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabelO";
Debug.ShouldStop(134217728);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._usermainlabeloptlistscons /*RemoteObject*/ ));
 BA.debugLineNum = 2397;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menupaneldocsbuttom_click() throws Exception{
try {
		Debug.PushSubsStack("MenuPanelDocsButtom_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2385);
if (RapidSub.canDelegate("menupaneldocsbuttom_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","menupaneldocsbuttom_click");}
 BA.debugLineNum = 2385;BA.debugLine="Sub MenuPanelDocsButtom_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2386;BA.debugLine="listsTabPanel.ScrollTo(1,False)";
Debug.ShouldStop(131072);
user.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 1)),(Object)(user.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2387;BA.debugLine="MenuPanel.Visible = False";
Debug.ShouldStop(262144);
user.mostCurrent._menupanel.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2388;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(524288);
user.mostCurrent._panel1.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2389;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabelO";
Debug.ShouldStop(1048576);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._usermainlabeloptlistsdocs /*RemoteObject*/ ));
 BA.debugLineNum = 2390;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menupaneloperatorsbutton_click() throws Exception{
try {
		Debug.PushSubsStack("MenuPanelOperatorsButton_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2399);
if (RapidSub.canDelegate("menupaneloperatorsbutton_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","menupaneloperatorsbutton_click");}
 BA.debugLineNum = 2399;BA.debugLine="Sub MenuPanelOperatorsButton_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 2400;BA.debugLine="listsTabPanel.ScrollTo(3,False)";
Debug.ShouldStop(-2147483648);
user.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 3)),(Object)(user.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2401;BA.debugLine="MenuPanel.Visible = False";
Debug.ShouldStop(1);
user.mostCurrent._menupanel.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2402;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(2);
user.mostCurrent._panel1.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2403;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabelO";
Debug.ShouldStop(4);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._usermainlabeloptlistsoper /*RemoteObject*/ ));
 BA.debugLineNum = 2404;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menupaneluserbutton_click() throws Exception{
try {
		Debug.PushSubsStack("MenuPanelUserButton_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2377);
if (RapidSub.canDelegate("menupaneluserbutton_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","menupaneluserbutton_click");}
 BA.debugLineNum = 2377;BA.debugLine="Sub MenuPanelUserButton_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 2378;BA.debugLine="listsTabPanel.ScrollTo(0,False)";
Debug.ShouldStop(512);
user.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 0)),(Object)(user.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2379;BA.debugLine="MenuPanel.Visible = False";
Debug.ShouldStop(1024);
user.mostCurrent._menupanel.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2380;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(2048);
user.mostCurrent._panel1.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2381;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabelO";
Debug.ShouldStop(4096);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._usermainlabeloptlistsuser /*RemoteObject*/ ));
 BA.debugLineNum = 2383;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagechangelistener_event(RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("PageChangeListener_Event (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,289);
if (RapidSub.canDelegate("pagechangelistener_event")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","pagechangelistener_event", _methodname, _args);}
RemoteObject _thistab = RemoteObject.createImmutable(0);
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 289;BA.debugLine="Sub PageChangeListener_Event (MethodName As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="If (MethodName = \"onPageScrolled\") Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_methodname,RemoteObject.createImmutable("onPageScrolled")))) { 
 BA.debugLineNum = 291;BA.debugLine="Dim thisTab As Int = Args(0)";
Debug.ShouldStop(4);
_thistab = BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("thisTab", _thistab);Debug.locals.put("thisTab", _thistab);
 BA.debugLineNum = 292;BA.debugLine="SecondPanel.Visible = thisTab > 0";
Debug.ShouldStop(8);
user.mostCurrent._secondpanel.runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_thistab,BA.numberCast(double.class, 0))));
 };
 BA.debugLineNum = 294;BA.debugLine="Return Null";
Debug.ShouldStop(32);
if (true) return user.mostCurrent.__c.getField(false,"Null");
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pdfreturn(RemoteObject _info) throws Exception{
try {
		Debug.PushSubsStack("PDFReturn (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1141);
if (RapidSub.canDelegate("pdfreturn")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","pdfreturn", _info);}
Debug.locals.put("info", _info);
 BA.debugLineNum = 1141;BA.debugLine="Public Sub PDFReturn(info As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1142;BA.debugLine="Log( \"Return\" )";
Debug.ShouldStop(2097152);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6195166209",RemoteObject.createImmutable("Return"),0);
 BA.debugLineNum = 1143;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _phonebackbuttontab() throws Exception{
try {
		Debug.PushSubsStack("PhoneBackButtonTab (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,277);
if (RapidSub.canDelegate("phonebackbuttontab")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","phonebackbuttontab");}
 BA.debugLineNum = 277;BA.debugLine="Sub PhoneBackButtonTab As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(2097152);
if ((user.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 279;BA.debugLine="If (MenuPanel.Visible = False) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",user.mostCurrent._menupanel.runMethod(true,"getVisible"),user.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 280;BA.debugLine="Panel1.Visible = False";
Debug.ShouldStop(8388608);
user.mostCurrent._panel1.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 281;BA.debugLine="MenuPanel.Visible = True";
Debug.ShouldStop(16777216);
user.mostCurrent._menupanel.runMethod(true,"setVisible",user.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 282;BA.debugLine="mainLabelOptLists.Text = ShareCode.MainOption_U";
Debug.ShouldStop(33554432);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(user.mostCurrent._sharecode._mainoption_user /*RemoteObject*/ ));
 BA.debugLineNum = 283;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return user.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 286;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return user.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private MyPositionLat, MyPositionLon As String";
user._mypositionlat = RemoteObject.createImmutable("");
user._mypositionlon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Public Device As Phone";
user._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _quantitydialogreturn(RemoteObject _code,RemoteObject _qtd) throws Exception{
try {
		Debug.PushSubsStack("QuantityDialogReturn (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1237);
if (RapidSub.canDelegate("quantitydialogreturn")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","quantitydialogreturn", _code, _qtd);}
RemoteObject _warehouse = RemoteObject.createImmutable("");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _qtdlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("code", _code);
Debug.locals.put("qtd", _qtd);
 BA.debugLineNum = 1237;BA.debugLine="Sub QuantityDialogReturn(code As String, qtd As In";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1238;BA.debugLine="Dim warehouse As String = USERWAREHOUSE";
Debug.ShouldStop(2097152);
_warehouse = user.mostCurrent._userwarehouse;Debug.locals.put("warehouse", _warehouse);Debug.locals.put("warehouse", _warehouse);
 BA.debugLineNum = 1239;BA.debugLine="DBStructures.updateNotifyUserStock(code, qtd, war";
Debug.ShouldStop(4194304);
user.mostCurrent._dbstructures.runVoidMethod ("_updatenotifyuserstock" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_code),(Object)(_qtd),(Object)(_warehouse));
 BA.debugLineNum = 1240;BA.debugLine="Dim pnl As Panel = listEquipments.GetPanel(Curren";
Debug.ShouldStop(8388608);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), user.mostCurrent._listequipments.runMethod(false,"_getpanel",(Object)(RemoteObject.solve(new RemoteObject[] {user._currentequipitem,RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1241;BA.debugLine="Dim qtdlbl As Label = pnl.GetView(3)";
Debug.ShouldStop(16777216);
_qtdlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_qtdlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("qtdlbl", _qtdlbl);
 BA.debugLineNum = 1242;BA.debugLine="qtdlbl.Text = qtd";
Debug.ShouldStop(33554432);
_qtdlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_qtd));
 BA.debugLineNum = 1244;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeuserequipments(RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("RemoveUserEquipments (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1359);
if (RapidSub.canDelegate("removeuserequipments")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","removeuserequipments", _tagcode);}
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1359;BA.debugLine="Sub RemoveUserEquipments(tagcode As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1360;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32768);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1361;BA.debugLine="i = Msgbox2(ShareCode.userAskRemoveEquipment, Sha";
Debug.ShouldStop(65536);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._useraskremoveequipment /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1362;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1363;BA.debugLine="DBStructures.deleteUserEquipment(ShareCode.SESS_";
Debug.ShouldStop(262144);
user.mostCurrent._dbstructures.runVoidMethod ("_deleteuserequipment" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_tagcode));
 BA.debugLineNum = 1364;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
Debug.ShouldStop(524288);
_createuserdetailsdata(user.mostCurrent.__c.getField(true,"True"),user.mostCurrent._currentcarid);
 };
 BA.debugLineNum = 1366;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _returnfromclai() throws Exception{
try {
		Debug.PushSubsStack("ReturnFromCLAI (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2373);
if (RapidSub.canDelegate("returnfromclai")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","returnfromclai");}
 BA.debugLineNum = 2373;BA.debugLine="Sub ReturnFromCLAI";
Debug.ShouldStop(16);
 BA.debugLineNum = 2374;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(32);
_windowstatusupdate();
 BA.debugLineNum = 2375;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setloginregister(RemoteObject _uname,RemoteObject _upass) throws Exception{
try {
		Debug.PushSubsStack("SetLoginRegister (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2054);
if (RapidSub.canDelegate("setloginregister")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","setloginregister", _uname, _upass); return;}
ResumableSub_SetLoginRegister rsub = new ResumableSub_SetLoginRegister(null,_uname,_upass);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetLoginRegister extends BA.ResumableSub {
public ResumableSub_SetLoginRegister(xevolution.vrcg.devdemov2400.user parent,RemoteObject _uname,RemoteObject _upass) {
this.parent = parent;
this._uname = _uname;
this._upass = _upass;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;
RemoteObject _uname;
RemoteObject _upass;
RemoteObject _ok = RemoteObject.createImmutable(false);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sqlscript = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _callagain = RemoteObject.createImmutable(false);
RemoteObject _sccommand = RemoteObject.createImmutable("");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _confuser = RemoteObject.createImmutable("");
RemoteObject _resultstr = RemoteObject.createImmutable("");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _active = RemoteObject.createImmutable(0);
RemoteObject _userin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _warehouse = RemoteObject.createImmutable("");
RemoteObject _update_at = RemoteObject.createImmutable("");
RemoteObject _available = RemoteObject.createImmutable(0);
RemoteObject _pwdrequest = RemoteObject.createImmutable(0);
RemoteObject _tech = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _utech = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _udtech = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _recordtech = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _datacheck = RemoteObject.createImmutable("");
RemoteObject _gravalocal = RemoteObject.createImmutable(0);
RemoteObject _insertlistm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tgcode = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetLoginRegister (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2054);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("uname", _uname);
Debug.locals.put("upass", _upass);
 BA.debugLineNum = 2056;BA.debugLine="Dim OK As Boolean = False";
Debug.ShouldStop(128);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);Debug.locals.put("OK", _ok);
 BA.debugLineNum = 2057;BA.debugLine="ShareCode.APP_URL  = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(256);
parent.mostCurrent._sharecode._app_url /*RemoteObject*/  = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/")));
 BA.debugLineNum = 2062;BA.debugLine="If ((uname <> \"\") And (upass <> \"\")) Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 128;
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_uname,RemoteObject.createImmutable(""))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_upass,RemoteObject.createImmutable(""))))))) { 
this.state = 3;
}else {
this.state = 127;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2063;BA.debugLine="If (uname <> ShareCode.SESS_UWDUKEY) Then";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//if
this.state = 125;
if ((RemoteObject.solveBoolean("!",_uname,parent.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ))) { 
this.state = 6;
}else {
this.state = 124;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2064;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 122;
if (parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 33;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2066;BA.debugLine="Private Row As Int = 0";
Debug.ShouldStop(131072);
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 2067;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(262144);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 2068;BA.debugLine="Dim SQLScript As String = $\"Select name, tagco";
Debug.ShouldStop(524288);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("Select name, tagcode, warehouse, available from User where username='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable("' and password='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_upass))),RemoteObject.createImmutable("'")));Debug.locals.put("SQLScript", _sqlscript);Debug.locals.put("SQLScript", _sqlscript);
 BA.debugLineNum = 2069;BA.debugLine="Record = Starter.LocalSQL.ExecQuery(SQLScript)";
Debug.ShouldStop(1048576);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlscript)));
 BA.debugLineNum = 2070;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 10:
//if
this.state = 31;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 26;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2071;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(4194304);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 2072;BA.debugLine="If (Record.GetString(\"name\") <> \"\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 13:
//if
this.state = 24;
if ((RemoteObject.solveBoolean("!",_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name"))),RemoteObject.createImmutable("")))) { 
this.state = 15;
}else {
this.state = 23;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2075;BA.debugLine="If Not(Utils.DBDataExists(Starter.LocalSQLWR";
Debug.ShouldStop(67108864);
if (true) break;

case 16:
//if
this.state = 21;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_dbdataexists" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable("select * from loc_userssession where session='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._starter._localsessioncode /*RemoteObject*/ ))),RemoteObject.createImmutable("' and username='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable("'"))))))).<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 2076;BA.debugLine="OK = True";
Debug.ShouldStop(134217728);
_ok = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OK", _ok);
 BA.debugLineNum = 2077;BA.debugLine="Dim params As Map";
Debug.ShouldStop(268435456);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2078;BA.debugLine="params.Initialize";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2079;BA.debugLine="params.Put(\"session\", Starter.LocalSessionC";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("session"))),(Object)((parent.mostCurrent._starter._localsessioncode /*RemoteObject*/ )));
 BA.debugLineNum = 2080;BA.debugLine="params.Put(\"username\", uname)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_uname)));
 BA.debugLineNum = 2081;BA.debugLine="params.Put(\"tagcode\", Record.GetString(\"tag";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode"))))));
 BA.debugLineNum = 2082;BA.debugLine="params.Put(\"name\", Record.GetString(\"name\")";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 2083;BA.debugLine="params.Put(\"active\", 1)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2084;BA.debugLine="params.Put(\"login\", 0)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("login"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2085;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(16);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2086;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(32);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2087;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(64);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 2088;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"lo";
Debug.ShouldStop(128);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("loc_userssession")),(Object)(_insertlist));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2090;BA.debugLine="MsgboxAsync(ShareCode.userAlreadyRegistered";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useralreadyregistered /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),user.processBA);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2093;BA.debugLine="MsgboxAsync(ShareCode.userIncorrectInfo, Sha";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userincorrectinfo /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),user.processBA);
 if (true) break;

case 24:
//C
this.state = 31;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2096;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.userInvalidL";
Debug.ShouldStop(32768);
_i = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userinvalidlogin /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_try /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 2097;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(65536);
if (true) break;

case 27:
//if
this.state = 30;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 2098;BA.debugLine="DialogLogin.getLoginDialog2(\"User\")";
Debug.ShouldStop(131072);
parent.mostCurrent._dialoglogin.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getlogindialog2" /*void*/ ,(Object)((RemoteObject.createImmutable("User"))));
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 122;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2102;BA.debugLine="If Not(Utils.DBDataExists(Starter.LocalSQLWRK,";
Debug.ShouldStop(2097152);
if (true) break;

case 34:
//if
this.state = 121;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_dbdataexists" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable("select * from loc_userssession where session='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._starter._localsessioncode /*RemoteObject*/ ))),RemoteObject.createImmutable("' and username='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable("'"))))))).<Boolean>get().booleanValue()) { 
this.state = 36;
}else {
this.state = 120;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 2105;BA.debugLine="Dim CallAgain As Boolean = False";
Debug.ShouldStop(16777216);
_callagain = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("CallAgain", _callagain);Debug.locals.put("CallAgain", _callagain);
 BA.debugLineNum = 2107;BA.debugLine="Dim params As Map";
Debug.ShouldStop(67108864);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2108;BA.debugLine="params.Initialize";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2109;BA.debugLine="params.Clear";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2110;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2111;BA.debugLine="params.Put(\"_user\", uname)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((_uname)));
 BA.debugLineNum = 2112;BA.debugLine="params.Put(\"_key\", upass)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_key"))),(Object)((_upass)));
 BA.debugLineNum = 2113;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagc";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2114;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAutho";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2115;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2116;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2117;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2118;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMa";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2119;BA.debugLine="Dim sccommand As String = $\"username='${uname";
Debug.ShouldStop(64);
_sccommand = (RemoteObject.concat(RemoteObject.createImmutable("username='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable("', password='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_upass))),RemoteObject.createImmutable("'")));Debug.locals.put("sccommand", _sccommand);Debug.locals.put("sccommand", _sccommand);
 BA.debugLineNum = 2120;BA.debugLine="Log(sccommand)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180930",_sccommand,0);
 BA.debugLineNum = 2122;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(512);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 2123;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(1024);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 2124;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(2048);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2125;BA.debugLine="Log(data)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180935",_data,0);
 BA.debugLineNum = 2126;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8192);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 2127;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(16384);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,user.processBA,(Object)(BA.ObjectToString("")),(Object)(user.getObject()));
 BA.debugLineNum = 2130;BA.debugLine="Dim ConfUser As String = ShareCode.APP_URL &";
Debug.ShouldStop(131072);
_confuser = RemoteObject.concat(parent.mostCurrent._sharecode._app_url /*RemoteObject*/ ,parent.mostCurrent._sharecode._app_confirmuser /*RemoteObject*/ );Debug.locals.put("ConfUser", _confuser);Debug.locals.put("ConfUser", _confuser);
 BA.debugLineNum = 2131;BA.debugLine="Log(ConfUser)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180941",_confuser,0);
 BA.debugLineNum = 2132;BA.debugLine="Job.PostString(ConfUser, data )";
Debug.ShouldStop(524288);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_confuser),(Object)(_data));
 BA.debugLineNum = 2133;BA.debugLine="Job.GetRequest.SetContentType(\"application/js";
Debug.ShouldStop(1048576);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2135;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", user.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "setloginregister"), (_job));
this.state = 132;
return;
case 132:
//C
this.state = 37;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 2136;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 37:
//if
this.state = 114;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 39;
}else {
this.state = 105;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2138;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180948",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2139;BA.debugLine="Dim ResultStr As String = Job.GetString";
Debug.ShouldStop(67108864);
_resultstr = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("ResultStr", _resultstr);Debug.locals.put("ResultStr", _resultstr);
 BA.debugLineNum = 2140;BA.debugLine="Log(\"=======================================";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180950",RemoteObject.createImmutable("================================================================"),0);
 BA.debugLineNum = 2141;BA.debugLine="Log(\"                          AUTENTICAÇÃO";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180951",RemoteObject.createImmutable("                          AUTENTICAÇÃO                          "),0);
 BA.debugLineNum = 2142;BA.debugLine="Log(\"=======================================";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180952",RemoteObject.createImmutable("================================================================"),0);
 BA.debugLineNum = 2143;BA.debugLine="Log(ResultStr)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180953",_resultstr,0);
 BA.debugLineNum = 2144;BA.debugLine="Log(\"=======================================";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180954",RemoteObject.createImmutable("================================================================"),0);
 BA.debugLineNum = 2146;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(2);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 2147;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\"";
Debug.ShouldStop(4);
if (true) break;

case 40:
//if
this.state = 43;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv6",(Object)(_resultstr),(Object)(BA.numberCast(long.class, 1))),RemoteObject.createImmutable("[")))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2148;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.St";
Debug.ShouldStop(8);
_resultstr = parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvvvvv4",(Object)(parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvv5",(Object)(_resultstr),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv7",(Object)(_resultstr)),RemoteObject.createImmutable(1)}, "-",1, 2))))));Debug.locals.put("ResultStr", _resultstr);
 if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 2150;BA.debugLine="JSON1.Initialize(ResultStr)";
Debug.ShouldStop(32);
_json1.runVoidMethod ("Initialize",(Object)(_resultstr));
 BA.debugLineNum = 2151;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(64);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 2152;BA.debugLine="Dim Active As Int = MapJSON.Get(\"status\")";
Debug.ShouldStop(128);
_active = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("Active", _active);Debug.locals.put("Active", _active);
 BA.debugLineNum = 2154;BA.debugLine="If (Active = 1) Then";
Debug.ShouldStop(512);
if (true) break;

case 44:
//if
this.state = 103;
if ((RemoteObject.solveBoolean("=",_active,BA.numberCast(double.class, 1)))) { 
this.state = 46;
}else {
this.state = 94;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 2160;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(32768);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 2161;BA.debugLine="Dim UserIn As Map = MapJSON.Get(\"user\")";
Debug.ShouldStop(65536);
_userin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_userin = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user")))));Debug.locals.put("UserIn", _userin);
 BA.debugLineNum = 2162;BA.debugLine="Dim Name As String = UserIn.Get(\"title\")";
Debug.ShouldStop(131072);
_name = BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 2163;BA.debugLine="Dim Tagcode As String = UserIn.Get(\"tagcode";
Debug.ShouldStop(262144);
_tagcode = BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcode")))));Debug.locals.put("Tagcode", _tagcode);Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 2164;BA.debugLine="Dim WareHouse As String = Utils.IfNullOrEmp";
Debug.ShouldStop(524288);
_warehouse = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("warehouse")))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WareHouse", _warehouse);Debug.locals.put("WareHouse", _warehouse);
 BA.debugLineNum = 2165;BA.debugLine="Dim update_at As String = Utils.IfNullOrEmp";
Debug.ShouldStop(1048576);
_update_at = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("update_at")))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("update_at", _update_at);Debug.locals.put("update_at", _update_at);
 BA.debugLineNum = 2166;BA.debugLine="Dim Available As Int = UserIn.Get(\"availabl";
Debug.ShouldStop(2097152);
_available = BA.numberCast(int.class, _userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("available")))));Debug.locals.put("Available", _available);Debug.locals.put("Available", _available);
 BA.debugLineNum = 2167;BA.debugLine="Dim pwdrequest As Int = UserIn.Get(\"pwdrequ";
Debug.ShouldStop(4194304);
_pwdrequest = BA.numberCast(int.class, _userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pwdrequest")))));Debug.locals.put("pwdrequest", _pwdrequest);Debug.locals.put("pwdrequest", _pwdrequest);
 BA.debugLineNum = 2169;BA.debugLine="Dim tech As Map = MapJSON.Get(\"tech\")";
Debug.ShouldStop(16777216);
_tech = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tech")))));Debug.locals.put("tech", _tech);
 BA.debugLineNum = 2170;BA.debugLine="Dim utech As Map = MapJSON.Get(\"utech\")";
Debug.ShouldStop(33554432);
_utech = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_utech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("utech")))));Debug.locals.put("utech", _utech);
 BA.debugLineNum = 2171;BA.debugLine="Dim udtech As Map = MapJSON.Get(\"udtech\")";
Debug.ShouldStop(67108864);
_udtech = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_udtech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("udtech")))));Debug.locals.put("udtech", _udtech);
 BA.debugLineNum = 2172;BA.debugLine="Private RecordTech As Cursor";
Debug.ShouldStop(134217728);
_recordtech = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("RecordTech", _recordtech);
 BA.debugLineNum = 2173;BA.debugLine="RecordTech = Starter.LocalSQLEVC.ExecQuery(";
Debug.ShouldStop(268435456);
_recordtech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select * from dta_technicals where username='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable("'"))))));
 BA.debugLineNum = 2174;BA.debugLine="If RecordTech.RowCount > 0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 47:
//if
this.state = 92;
if (RemoteObject.solveBoolean(">",_recordtech.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 49;
}else {
this.state = 73;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 2175;BA.debugLine="RecordTech.Position = 0";
Debug.ShouldStop(1073741824);
_recordtech.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2176;BA.debugLine="Log(\"... Updating\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180986",RemoteObject.createImmutable("... Updating"),0);
 BA.debugLineNum = 2177;BA.debugLine="Dim datacheck As String = RecordTech.GetSt";
Debug.ShouldStop(1);
_datacheck = _recordtech.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("updated_at")));Debug.locals.put("datacheck", _datacheck);Debug.locals.put("datacheck", _datacheck);
 BA.debugLineNum = 2178;BA.debugLine="Dim GravaLocal As Int = 0";
Debug.ShouldStop(2);
_gravalocal = BA.numberCast(int.class, 0);Debug.locals.put("GravaLocal", _gravalocal);Debug.locals.put("GravaLocal", _gravalocal);
 BA.debugLineNum = 2179;BA.debugLine="If (Utils.IfNullOrEmpty(datacheck, \"\") <>";
Debug.ShouldStop(4);
if (true) break;

case 50:
//if
this.state = 71;
if ((RemoteObject.solveBoolean("!",parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_datacheck),(Object)(RemoteObject.createImmutable(""))),_update_at))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 2180;BA.debugLine="Log(\"... Make update\")";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198180990",RemoteObject.createImmutable("... Make update"),0);
 BA.debugLineNum = 2181;BA.debugLine="Dim InsertListm As Map";
Debug.ShouldStop(16);
_insertlistm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("InsertListm", _insertlistm);
 BA.debugLineNum = 2182;BA.debugLine="InsertListm.Initialize";
Debug.ShouldStop(32);
_insertlistm.runVoidMethod ("Initialize");
 BA.debugLineNum = 2183;BA.debugLine="InsertListm.Put(\"username\", uname)";
Debug.ShouldStop(64);
_insertlistm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_uname)));
 BA.debugLineNum = 2184;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

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
 BA.debugLineNum = 2186;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.Local";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("dta_technicals")),(Object)(_tech),(Object)(_insertlistm),(Object)(_uname),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2187;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "setloginregister"),BA.numberCast(int.class, 100));
this.state = 133;
return;
case 133:
//C
this.state = 58;
;
 BA.debugLineNum = 2188;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(2048);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
 BA.debugLineNum = 2190;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198181000",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2191;BA.debugLine="Utils.logError(\"Actualizar Técnicos\", Sh";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("Actualizar Técnicos")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 58:
//C
this.state = 59;
this.catchState = 0;
;
 BA.debugLineNum = 2194;BA.debugLine="Dim tgcode As String = tech.Get(\"user_tag";
Debug.ShouldStop(131072);
_tgcode = BA.ObjectToString(_tech.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_tagcode")))));Debug.locals.put("tgcode", _tgcode);Debug.locals.put("tgcode", _tgcode);
 BA.debugLineNum = 2196;BA.debugLine="Dim InsertListm As Map";
Debug.ShouldStop(524288);
_insertlistm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("InsertListm", _insertlistm);
 BA.debugLineNum = 2197;BA.debugLine="InsertListm.Initialize";
Debug.ShouldStop(1048576);
_insertlistm.runVoidMethod ("Initialize");
 BA.debugLineNum = 2198;BA.debugLine="InsertListm.Put(\"tagcode\", tgcode)";
Debug.ShouldStop(2097152);
_insertlistm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_tgcode)));
 BA.debugLineNum = 2199;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 59:
//try
this.state = 64;
this.catchState = 63;
this.state = 61;
if (true) break;

case 61:
//C
this.state = 64;
this.catchState = 63;
 BA.debugLineNum = 2201;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.Local";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("aut_users")),(Object)(_utech),(Object)(_insertlistm),(Object)(_uname),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2202;BA.debugLine="Sleep(100)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "setloginregister"),BA.numberCast(int.class, 100));
this.state = 134;
return;
case 134:
//C
this.state = 64;
;
 BA.debugLineNum = 2203;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(67108864);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 63:
//C
this.state = 64;
this.catchState = 0;
 BA.debugLineNum = 2205;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198181015",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2206;BA.debugLine="Utils.logError(\"Actualizar Utilizadores\"";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("Actualizar Utilizadores")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 64:
//C
this.state = 65;
this.catchState = 0;
;
 BA.debugLineNum = 2209;BA.debugLine="Dim InsertListm As Map";
Debug.ShouldStop(1);
_insertlistm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("InsertListm", _insertlistm);
 BA.debugLineNum = 2210;BA.debugLine="InsertListm.Initialize";
Debug.ShouldStop(2);
_insertlistm.runVoidMethod ("Initialize");
 BA.debugLineNum = 2211;BA.debugLine="InsertListm.Put(\"user_tagcode\", tgcode)";
Debug.ShouldStop(4);
_insertlistm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user_tagcode"))),(Object)((_tgcode)));
 BA.debugLineNum = 2212;BA.debugLine="Try";
Debug.ShouldStop(8);
if (true) break;

case 65:
//try
this.state = 70;
this.catchState = 69;
this.state = 67;
if (true) break;

case 67:
//C
this.state = 70;
this.catchState = 69;
 BA.debugLineNum = 2214;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.Local";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("aut_users_details")),(Object)(_udtech),(Object)(_insertlistm),(Object)(_uname),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2215;BA.debugLine="Sleep(100)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "setloginregister"),BA.numberCast(int.class, 100));
this.state = 135;
return;
case 135:
//C
this.state = 70;
;
 BA.debugLineNum = 2216;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(128);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 69:
//C
this.state = 70;
this.catchState = 0;
 BA.debugLineNum = 2218;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198181028",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2219;BA.debugLine="Utils.logError(\"Actualizar Detalhes Util";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("Actualizar Detalhes Utilizador")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 70:
//C
this.state = 71;
this.catchState = 0;
;
 if (true) break;

case 71:
//C
this.state = 92;
;
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 2224;BA.debugLine="Log(\"... Inserting\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198181034",RemoteObject.createImmutable("... Inserting"),0);
 BA.debugLineNum = 2225;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(65536);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2226;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(131072);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2227;BA.debugLine="InsertList.Add(tech)";
Debug.ShouldStop(262144);
_insertlist.runVoidMethod ("Add",(Object)((_tech.getObject())));
 BA.debugLineNum = 2228;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 74:
//try
this.state = 79;
this.catchState = 78;
this.state = 76;
if (true) break;

case 76:
//C
this.state = 79;
this.catchState = 78;
 BA.debugLineNum = 2229;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(1048576);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("dta_technicals")),(Object)(_insertlist));
 BA.debugLineNum = 2230;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "setloginregister"),BA.numberCast(int.class, 100));
this.state = 136;
return;
case 136:
//C
this.state = 79;
;
 BA.debugLineNum = 2231;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(4194304);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 78:
//C
this.state = 79;
this.catchState = 0;
 BA.debugLineNum = 2233;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198181043",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2234;BA.debugLine="Utils.logError(\"Inserir Técnicos\", ShareC";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("Inserir Técnicos")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 0;
;
 BA.debugLineNum = 2238;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(536870912);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2239;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(1073741824);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2240;BA.debugLine="InsertList.Add(utech)";
Debug.ShouldStop(-2147483648);
_insertlist.runVoidMethod ("Add",(Object)((_utech.getObject())));
 BA.debugLineNum = 2241;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 80:
//try
this.state = 85;
this.catchState = 84;
this.state = 82;
if (true) break;

case 82:
//C
this.state = 85;
this.catchState = 84;
 BA.debugLineNum = 2242;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(2);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("aut_users")),(Object)(_insertlist));
 BA.debugLineNum = 2243;BA.debugLine="Sleep(100)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "setloginregister"),BA.numberCast(int.class, 100));
this.state = 137;
return;
case 137:
//C
this.state = 85;
;
 BA.debugLineNum = 2244;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(8);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 84:
//C
this.state = 85;
this.catchState = 0;
 BA.debugLineNum = 2246;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198181056",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2247;BA.debugLine="Utils.logError(\"Inserir Utilizadores\", Sh";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("Inserir Utilizadores")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 85:
//C
this.state = 86;
this.catchState = 0;
;
 BA.debugLineNum = 2250;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(512);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2251;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(1024);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2252;BA.debugLine="InsertList.Add(udtech)";
Debug.ShouldStop(2048);
_insertlist.runVoidMethod ("Add",(Object)((_udtech.getObject())));
 BA.debugLineNum = 2253;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 86:
//try
this.state = 91;
this.catchState = 90;
this.state = 88;
if (true) break;

case 88:
//C
this.state = 91;
this.catchState = 90;
 BA.debugLineNum = 2254;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(8192);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("aut_users_details")),(Object)(_insertlist));
 BA.debugLineNum = 2255;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "setloginregister"),BA.numberCast(int.class, 100));
this.state = 138;
return;
case 138:
//C
this.state = 91;
;
 BA.debugLineNum = 2256;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(32768);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 90:
//C
this.state = 91;
this.catchState = 0;
 BA.debugLineNum = 2258;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6198181068",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2259;BA.debugLine="Utils.logError(\"Inserir Detalhes Utilizad";
Debug.ShouldStop(262144);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("Inserir Detalhes Utilizador")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",user.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
;
 if (true) break;

case 92:
//C
this.state = 103;
;
 BA.debugLineNum = 2262;BA.debugLine="RecordTech.Close";
Debug.ShouldStop(2097152);
_recordtech.runVoidMethod ("Close");
 BA.debugLineNum = 2264;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8388608);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2265;BA.debugLine="params.Initialize";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2266;BA.debugLine="params.Put(\"session\", Starter.LocalSessionC";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("session"))),(Object)((parent.mostCurrent._starter._localsessioncode /*RemoteObject*/ )));
 BA.debugLineNum = 2267;BA.debugLine="params.Put(\"username\", uname)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_uname)));
 BA.debugLineNum = 2268;BA.debugLine="params.Put(\"tagcode\", Tagcode)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 2269;BA.debugLine="params.Put(\"name\", Name)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_name)));
 BA.debugLineNum = 2270;BA.debugLine="params.Put(\"active\", 1)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2271;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(1073741824);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2272;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(-2147483648);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2273;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(1);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 2274;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"lo";
Debug.ShouldStop(2);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("loc_userssession")),(Object)(_insertlist));
 BA.debugLineNum = 2276;BA.debugLine="OK = True";
Debug.ShouldStop(8);
_ok = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OK", _ok);
 if (true) break;

case 94:
//C
this.state = 95;
 BA.debugLineNum = 2278;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2279;BA.debugLine="i = Msgbox2(ShareCode.LoginMessage_NOTOK, S";
Debug.ShouldStop(64);
_i = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginmessage_notok /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_try /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 2280;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(128);
if (true) break;

case 95:
//if
this.state = 102;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 97;
}else 
{ BA.debugLineNum = 2282;BA.debugLine="Else If (i=DialogResponse.CANCEL) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL"))))) { 
this.state = 99;
}else {
this.state = 101;
}}
if (true) break;

case 97:
//C
this.state = 102;
 BA.debugLineNum = 2281;BA.debugLine="CallAgain = True";
Debug.ShouldStop(256);
_callagain = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("CallAgain", _callagain);
 if (true) break;

case 99:
//C
this.state = 102;
 BA.debugLineNum = 2283;BA.debugLine="OK = False";
Debug.ShouldStop(1024);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);
 if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 2286;BA.debugLine="OK = False";
Debug.ShouldStop(8192);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);
 if (true) break;

case 102:
//C
this.state = 103;
;
 if (true) break;

case 103:
//C
this.state = 114;
;
 if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 2291;BA.debugLine="Dim i As Int";
Debug.ShouldStop(262144);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2292;BA.debugLine="i = Msgbox2(ShareCode.LoginServerError, Shar";
Debug.ShouldStop(524288);
_i = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginservererror /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_try /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 2293;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 106:
//if
this.state = 113;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 108;
}else 
{ BA.debugLineNum = 2296;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
this.state = 110;
}else 
{ BA.debugLineNum = 2298;BA.debugLine="Else If (i=DialogResponse.CANCEL) Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL"))))) { 
this.state = 112;
}}}
if (true) break;

case 108:
//C
this.state = 113;
 BA.debugLineNum = 2294;BA.debugLine="OK = True";
Debug.ShouldStop(2097152);
_ok = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OK", _ok);
 BA.debugLineNum = 2295;BA.debugLine="CallAgain = True";
Debug.ShouldStop(4194304);
_callagain = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("CallAgain", _callagain);
 if (true) break;

case 110:
//C
this.state = 113;
 BA.debugLineNum = 2297;BA.debugLine="OK = False";
Debug.ShouldStop(16777216);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);
 if (true) break;

case 112:
//C
this.state = 113;
 BA.debugLineNum = 2299;BA.debugLine="OK = False";
Debug.ShouldStop(67108864);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);
 if (true) break;

case 113:
//C
this.state = 114;
;
 if (true) break;

case 114:
//C
this.state = 115;
;
 BA.debugLineNum = 2302;BA.debugLine="Job.Release";
Debug.ShouldStop(536870912);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2304;BA.debugLine="If (CallAgain) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 115:
//if
this.state = 118;
if ((_callagain).<Boolean>get().booleanValue()) { 
this.state = 117;
}if (true) break;

case 117:
//C
this.state = 118;
 BA.debugLineNum = 2305;BA.debugLine="DialogLogin.getLoginDialog2(\"User\")";
Debug.ShouldStop(1);
parent.mostCurrent._dialoglogin.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getlogindialog2" /*void*/ ,(Object)((RemoteObject.createImmutable("User"))));
 if (true) break;

case 118:
//C
this.state = 121;
;
 if (true) break;

case 120:
//C
this.state = 121;
 BA.debugLineNum = 2309;BA.debugLine="MsgboxAsync(ShareCode.userAlreadyRegistered,";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useralreadyregistered /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),user.processBA);
 if (true) break;

case 121:
//C
this.state = 122;
;
 if (true) break;

case 122:
//C
this.state = 125;
;
 if (true) break;

case 124:
//C
this.state = 125;
 BA.debugLineNum = 2314;BA.debugLine="MsgboxAsync(ShareCode.userAlreadyRegistered, Sh";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useralreadyregistered /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),user.processBA);
 if (true) break;

case 125:
//C
this.state = 128;
;
 if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 2317;BA.debugLine="MsgboxAsync(ShareCode.userCodeandPasswordMandato";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usercodeandpasswordmandatory /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),user.processBA);
 if (true) break;
;
 BA.debugLineNum = 2320;BA.debugLine="If (OK) Then";
Debug.ShouldStop(32768);

case 128:
//if
this.state = 131;
if ((_ok).<Boolean>get().booleanValue()) { 
this.state = 130;
}if (true) break;

case 130:
//C
this.state = 131;
 BA.debugLineNum = 2332;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
Debug.ShouldStop(134217728);
_createuserdetailsdata(parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent._currentcarid);
 if (true) break;

case 131:
//C
this.state = -1;
;
 BA.debugLineNum = 2334;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",user.processBA, e0.toString());}
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
public static RemoteObject  _setloginregistercancel() throws Exception{
try {
		Debug.PushSubsStack("SetLoginRegisterCancel (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,2336);
if (RapidSub.canDelegate("setloginregistercancel")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","setloginregistercancel");}
 BA.debugLineNum = 2336;BA.debugLine="Sub SetLoginRegisterCancel";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2338;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startuseractivity(RemoteObject _filearg) throws Exception{
try {
		Debug.PushSubsStack("StartUserActivity (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,395);
if (RapidSub.canDelegate("startuseractivity")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","startuseractivity", _filearg);}
RemoteObject _vehicleplate = RemoteObject.createImmutable("");
RemoteObject _photo = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _vehicle = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _usercodename = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _nsql = RemoteObject.createImmutable("");
RemoteObject _vmodel = RemoteObject.createImmutable("");
RemoteObject _vehicle_tagcode = RemoteObject.createImmutable("");
RemoteObject _drecord = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _cptitle = RemoteObject.createImmutable("");
RemoteObject _ssql1 = RemoteObject.createImmutable("");
RemoteObject _drecord11 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _whtitle = RemoteObject.createImmutable("");
RemoteObject _ctitle = RemoteObject.createImmutable("");
Debug.locals.put("FileArg", _filearg);
 BA.debugLineNum = 395;BA.debugLine="Sub StartUserActivity(FileArg As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 397;BA.debugLine="Dim vehicleplate As String = \"\"";
Debug.ShouldStop(4096);
_vehicleplate = BA.ObjectToString("");Debug.locals.put("vehicleplate", _vehicleplate);Debug.locals.put("vehicleplate", _vehicleplate);
 BA.debugLineNum = 398;BA.debugLine="Dim photo As String = \"\"";
Debug.ShouldStop(8192);
_photo = BA.ObjectToString("");Debug.locals.put("photo", _photo);Debug.locals.put("photo", _photo);
 BA.debugLineNum = 399;BA.debugLine="Dim title As String = \"\"";
Debug.ShouldStop(16384);
_title = BA.ObjectToString("");Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 400;BA.debugLine="Dim vehicle As String = \"\"";
Debug.ShouldStop(32768);
_vehicle = BA.ObjectToString("");Debug.locals.put("vehicle", _vehicle);Debug.locals.put("vehicle", _vehicle);
 BA.debugLineNum = 401;BA.debugLine="Dim tagcode As String = \"\"";
Debug.ShouldStop(65536);
_tagcode = BA.ObjectToString("");Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 402;BA.debugLine="Dim name As String = \"\"";
Debug.ShouldStop(131072);
_name = BA.ObjectToString("");Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 403;BA.debugLine="Dim userCodeName As String = \"\"";
Debug.ShouldStop(262144);
_usercodename = BA.ObjectToString("");Debug.locals.put("userCodeName", _usercodename);Debug.locals.put("userCodeName", _usercodename);
 BA.debugLineNum = 405;BA.debugLine="Private Row As Int = 0";
Debug.ShouldStop(1048576);
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 406;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(2097152);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 408;BA.debugLine="Dim nSQL As String = $\"Select ifnull(e1.value, ''";
Debug.ShouldStop(8388608);
_nsql = (RemoteObject.concat(RemoteObject.createImmutable("Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo,  ifnull(a.vehicle_tagcode,'') As vehicle_tagcode,\n"),RemoteObject.createImmutable("			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, a.*, ifnull(c.photo,ifnull(a.foto,'')) as photo\n"),RemoteObject.createImmutable("			from dta_technicals as a\n"),RemoteObject.createImmutable("			inner join aut_users as b on (b.tagcode=a.user_tagcode)\n"),RemoteObject.createImmutable("			inner join aut_users_details as c on (c.user_tagcode=a.user_tagcode)\n"),RemoteObject.createImmutable("			left join dta_objects as d on (d.tagcode=a.vehicle_tagcode)\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e1 on (e1.object_tagcode=d.tagcode and e1.field_tagcode='FIELD_MARCA')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e2 on (e2.object_tagcode=d.tagcode and e2.field_tagcode='FIELD_MODELO')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e3 on (e3.object_tagcode=d.tagcode and e3.field_tagcode='FIELD_MATRICULA')\n"),RemoteObject.createImmutable("			left join dta_objects_fields as e4 on (e4.object_tagcode=d.tagcode and e4.field_tagcode='FIELD_KM')\n"),RemoteObject.createImmutable("			where a.tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("nSQL", _nsql);Debug.locals.put("nSQL", _nsql);
 BA.debugLineNum = 419;BA.debugLine="Log(nSQL)";
Debug.ShouldStop(4);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6193658904",_nsql,0);
 BA.debugLineNum = 420;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(nSQL)";
Debug.ShouldStop(8);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_nsql)));
 BA.debugLineNum = 421;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 422;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(32);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 423;BA.debugLine="Dim vehicleplate As String = Utils.IfNullOrEmpty";
Debug.ShouldStop(64);
_vehicleplate = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmatricula")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicleplate", _vehicleplate);Debug.locals.put("vehicleplate", _vehicleplate);
 BA.debugLineNum = 424;BA.debugLine="Dim userCodeName As String = Utils.IfNullOrEmpty";
Debug.ShouldStop(128);
_usercodename = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("userCodeName", _usercodename);Debug.locals.put("userCodeName", _usercodename);
 BA.debugLineNum = 427;BA.debugLine="Dim photo As String = Utils.IfNullOrEmpty(Record";
Debug.ShouldStop(1024);
_photo = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("photo")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("photo", _photo);Debug.locals.put("photo", _photo);
 BA.debugLineNum = 429;BA.debugLine="Dim title As String = Utils.IfNullOrEmpty(Record";
Debug.ShouldStop(4096);
_title = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("jobtitle")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 430;BA.debugLine="Dim vehicle As String = Utils.IfNullOrEmpty(Reco";
Debug.ShouldStop(8192);
_vehicle = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmarca")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicle", _vehicle);Debug.locals.put("vehicle", _vehicle);
 BA.debugLineNum = 431;BA.debugLine="Dim vmodel As String = Utils.IfNullOrEmpty(Recor";
Debug.ShouldStop(16384);
_vmodel = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmodelo")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vmodel", _vmodel);Debug.locals.put("vmodel", _vmodel);
 BA.debugLineNum = 432;BA.debugLine="Dim tagcode As String = Utils.IfNullOrEmpty(Reco";
Debug.ShouldStop(32768);
_tagcode = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 433;BA.debugLine="Dim name As String = Utils.IfNullOrEmpty(Record.";
Debug.ShouldStop(65536);
_name = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 434;BA.debugLine="Dim vehicle_tagcode As String = Utils.IfNullOrEm";
Debug.ShouldStop(131072);
_vehicle_tagcode = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vehicle_tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicle_tagcode", _vehicle_tagcode);Debug.locals.put("vehicle_tagcode", _vehicle_tagcode);
 };
 BA.debugLineNum = 439;BA.debugLine="Record.Close";
Debug.ShouldStop(4194304);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 440;BA.debugLine="Log(name)";
Debug.ShouldStop(8388608);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6193658925",_name,0);
 BA.debugLineNum = 442;BA.debugLine="If (vehicleplate= \"\") Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",_vehicleplate,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 443;BA.debugLine="Dim nSQL As String = $\"Select ifnull(e1.value, '";
Debug.ShouldStop(67108864);
_nsql = (RemoteObject.concat(RemoteObject.createImmutable("Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo, d.tagcode,\n"),RemoteObject.createImmutable("			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, ifnull(d.image,'') as photo, ifnull(d.filename,'') as filename\n"),RemoteObject.createImmutable("			from  dta_objects As d \n"),RemoteObject.createImmutable("			left join dta_objects_fields As e1 on (e1.object_tagcode=d.tagcode And e1.field_tagcode='FIELD_MARCA')\n"),RemoteObject.createImmutable("			left join dta_objects_fields As e2 on (e2.object_tagcode=d.tagcode And e2.field_tagcode='FIELD_MODELO')\n"),RemoteObject.createImmutable("			left join dta_objects_fields As e3 on (e3.object_tagcode=d.tagcode And e3.field_tagcode='FIELD_MATRICULA')\n"),RemoteObject.createImmutable("			left join dta_objects_fields As e4 on (e4.object_tagcode=d.tagcode And e4.field_tagcode='FIELD_KM')\n"),RemoteObject.createImmutable("			where d.tagcode in (Select distinct vehicle_tagcode from dta_teams where tagcode in (\n"),RemoteObject.createImmutable("					Select tagcode from dta_teams_relations where relation_tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("'))")));Debug.locals.put("nSQL", _nsql);Debug.locals.put("nSQL", _nsql);
 BA.debugLineNum = 452;BA.debugLine="Dim dRecord As Cursor";
Debug.ShouldStop(8);
_drecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("dRecord", _drecord);
 BA.debugLineNum = 453;BA.debugLine="dRecord = Starter.LocalSQLEVC.ExecQuery(nSQL)";
Debug.ShouldStop(16);
_drecord = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_nsql)));
 BA.debugLineNum = 454;BA.debugLine="If dRecord.RowCount > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_drecord.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 455;BA.debugLine="dRecord.Position = 0";
Debug.ShouldStop(64);
_drecord.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 456;BA.debugLine="Dim vehicleplate As String = Utils.IfNullOrEmpt";
Debug.ShouldStop(128);
_vehicleplate = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_drecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmatricula")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicleplate", _vehicleplate);Debug.locals.put("vehicleplate", _vehicleplate);
 BA.debugLineNum = 457;BA.debugLine="Dim vehicle As String = Utils.IfNullOrEmpty(dRe";
Debug.ShouldStop(256);
_vehicle = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_drecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmarca")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicle", _vehicle);Debug.locals.put("vehicle", _vehicle);
 BA.debugLineNum = 458;BA.debugLine="Dim vmodel As String = Utils.IfNullOrEmpty(dRec";
Debug.ShouldStop(512);
_vmodel = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_drecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vmodelo")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vmodel", _vmodel);Debug.locals.put("vmodel", _vmodel);
 BA.debugLineNum = 459;BA.debugLine="Dim vehicle_tagcode As String = Utils.IfNullOrE";
Debug.ShouldStop(1024);
_vehicle_tagcode = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_drecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vehicle_tagcode", _vehicle_tagcode);Debug.locals.put("vehicle_tagcode", _vehicle_tagcode);
 };
 BA.debugLineNum = 463;BA.debugLine="dRecord.close";
Debug.ShouldStop(16384);
_drecord.runVoidMethod ("Close");
 };
 BA.debugLineNum = 466;BA.debugLine="ShareCode.SESS_VEHICLE_OBJECT = vehicle_tagcode";
Debug.ShouldStop(131072);
user.mostCurrent._sharecode._sess_vehicle_object /*RemoteObject*/  = _vehicle_tagcode;
 BA.debugLineNum = 467;BA.debugLine="ShareCode.SESS_VEHICLE_PLATE = vehicleplate";
Debug.ShouldStop(262144);
user.mostCurrent._sharecode._sess_vehicle_plate /*RemoteObject*/  = _vehicleplate;
 BA.debugLineNum = 469;BA.debugLine="Dim cptitle As String = \"\"";
Debug.ShouldStop(1048576);
_cptitle = BA.ObjectToString("");Debug.locals.put("cptitle", _cptitle);Debug.locals.put("cptitle", _cptitle);
 BA.debugLineNum = 471;BA.debugLine="Dim sSQL1 As String = $\"select a.* from dta_compa";
Debug.ShouldStop(4194304);
_ssql1 = (RemoteObject.createImmutable("select a.* from dta_companies as a"));Debug.locals.put("sSQL1", _ssql1);Debug.locals.put("sSQL1", _ssql1);
 BA.debugLineNum = 472;BA.debugLine="Dim dRecord11 As Cursor";
Debug.ShouldStop(8388608);
_drecord11 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("dRecord11", _drecord11);
 BA.debugLineNum = 473;BA.debugLine="dRecord11 = Starter.LocalSQLEVC.ExecQuery(sSQL1)";
Debug.ShouldStop(16777216);
_drecord11 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql1)));
 BA.debugLineNum = 474;BA.debugLine="If dRecord11.RowCount > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_drecord11.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 475;BA.debugLine="dRecord11.Position = 0";
Debug.ShouldStop(67108864);
_drecord11.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 476;BA.debugLine="Dim cptitle As String = Utils.IfNullOrEmpty(dRec";
Debug.ShouldStop(134217728);
_cptitle = user.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_drecord11.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("cptitle", _cptitle);Debug.locals.put("cptitle", _cptitle);
 };
 BA.debugLineNum = 479;BA.debugLine="dRecord11.close";
Debug.ShouldStop(1073741824);
_drecord11.runVoidMethod ("Close");
 BA.debugLineNum = 481;BA.debugLine="userCategory.text = title";
Debug.ShouldStop(1);
user.mostCurrent._usercategory.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 482;BA.debugLine="userCode.Text = userCodeName";
Debug.ShouldStop(2);
user.mostCurrent._usercode.runMethod(true,"setText",BA.ObjectToCharSequence(_usercodename));
 BA.debugLineNum = 483;BA.debugLine="userCompany.text = cptitle";
Debug.ShouldStop(4);
user.mostCurrent._usercompany.runMethod(true,"setText",BA.ObjectToCharSequence(_cptitle));
 BA.debugLineNum = 484;BA.debugLine="userName.text = name";
Debug.ShouldStop(8);
user.mostCurrent._username.runMethod(true,"setText",BA.ObjectToCharSequence(_name));
 BA.debugLineNum = 486;BA.debugLine="userTagcode.text = tagcode";
Debug.ShouldStop(32);
user.mostCurrent._usertagcode.runMethod(true,"setText",BA.ObjectToCharSequence(_tagcode));
 BA.debugLineNum = 487;BA.debugLine="If Not(Utils.isNullOrEmpty(photo)) Then";
Debug.ShouldStop(64);
if (user.mostCurrent.__c.runMethod(true,"Not",(Object)(user.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_photo)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 488;BA.debugLine="photo = photo.Replace(\"data:image/png;base64,\",";
Debug.ShouldStop(128);
_photo = _photo.runMethod(true,"replace",(Object)(BA.ObjectToString("data:image/png;base64,")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("photo", _photo);
 BA.debugLineNum = 489;BA.debugLine="userPhoto.SetBackgroundImage(Utils.B64ToBitmap(p";
Debug.ShouldStop(256);
user.mostCurrent._userphoto.runVoidMethod ("SetBackgroundImageNew",(Object)((user.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_photo)).getObject())));
 };
 BA.debugLineNum = 493;BA.debugLine="CurrentCarID = Types.NewAutoIdentification(tagcod";
Debug.ShouldStop(4096);
user.mostCurrent._currentcarid = user.mostCurrent._types.runMethod(false,"_newautoidentification" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_vehicle_tagcode),(Object)(_vehicleplate),(Object)(_vehicle),(Object)(_vmodel));
 BA.debugLineNum = 494;BA.debugLine="UserListView.UpDownIconExists = True";
Debug.ShouldStop(8192);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setupdowniconexists" /*RemoteObject*/ ,user.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 495;BA.debugLine="UserListView.UpDownIconIndex = 1";
Debug.ShouldStop(16384);
user.mostCurrent._userlistview.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setupdowniconindex" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 497;BA.debugLine="CreateUserDetailsData(False, CurrentCarID)";
Debug.ShouldStop(65536);
_createuserdetailsdata(user.mostCurrent.__c.getField(true,"False"),user.mostCurrent._currentcarid);
 BA.debugLineNum = 500;BA.debugLine="MakeDocumentsList(0)";
Debug.ShouldStop(524288);
_makedocumentslist(BA.numberCast(int.class, 0));
 BA.debugLineNum = 501;BA.debugLine="MakeEquipmentsList(0)";
Debug.ShouldStop(1048576);
_makeequipmentslist(BA.numberCast(int.class, 0));
 BA.debugLineNum = 502;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(2097152);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 503;BA.debugLine="mPopMenu.Initialize(Activity, Me, butWareHouses,";
Debug.ShouldStop(4194304);
user.mostCurrent._mpopmenu.runVoidMethod ("_initialize",user.mostCurrent.activityBA,(Object)(user.mostCurrent._activity),(Object)(user.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), user.mostCurrent._butwarehouses.getObject()),(Object)(user.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(user.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(user.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(user.mostCurrent.__c.getField(true,"True")),(Object)(user.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 504;BA.debugLine="Record = Starter.LocalSQL.ExecQuery($\"select * f";
Debug.ShouldStop(8388608);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("select * from warehouses")))));
 BA.debugLineNum = 505;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 506;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(33554432);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step70 > 0 && _row.<Integer>get().intValue() <= limit70) || (step70 < 0 && _row.<Integer>get().intValue() >= limit70) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step70))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 507;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(67108864);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 508;BA.debugLine="Dim whtitle As String = Record.GetString(\"titl";
Debug.ShouldStop(134217728);
_whtitle = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("whtitle", _whtitle);Debug.locals.put("whtitle", _whtitle);
 BA.debugLineNum = 509;BA.debugLine="mPopMenu.AddMenuItem(whtitle, \"whouses\")";
Debug.ShouldStop(268435456);
user.mostCurrent._mpopmenu.runVoidMethod ("_addmenuitem",(Object)(_whtitle),(Object)(RemoteObject.createImmutable("whouses")));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 512;BA.debugLine="Record.Close";
Debug.ShouldStop(-2147483648);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 514;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(2);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 515;BA.debugLine="mEqipPopMenu.Initialize(Activity, Me, butEquipFi";
Debug.ShouldStop(4);
user.mostCurrent._meqippopmenu.runVoidMethod ("_initialize",user.mostCurrent.activityBA,(Object)(user.mostCurrent._activity),(Object)(user.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), user.mostCurrent._butequipfilter.getObject()),(Object)(user.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(user.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(user.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(user.mostCurrent.__c.getField(true,"True")),(Object)(user.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 516;BA.debugLine="mEqipPopMenu.AddMenuItem(\"Todos\", \"catitems\")";
Debug.ShouldStop(8);
user.mostCurrent._meqippopmenu.runVoidMethod ("_addmenuitem",(Object)(BA.ObjectToString("Todos")),(Object)(RemoteObject.createImmutable("catitems")));
 BA.debugLineNum = 517;BA.debugLine="Record = Starter.LocalSQL.ExecQuery($\"select * f";
Debug.ShouldStop(16);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("select * from warehouses_categories")))));
 BA.debugLineNum = 518;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 519;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(64);
{
final int step82 = 1;
final int limit82 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step82 > 0 && _row.<Integer>get().intValue() <= limit82) || (step82 < 0 && _row.<Integer>get().intValue() >= limit82) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step82))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 520;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(128);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 521;BA.debugLine="Dim ctitle As String = Record.GetString(\"title";
Debug.ShouldStop(256);
_ctitle = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("ctitle", _ctitle);Debug.locals.put("ctitle", _ctitle);
 BA.debugLineNum = 522;BA.debugLine="mEqipPopMenu.AddMenuItem(ctitle, \"catitems\")";
Debug.ShouldStop(512);
user.mostCurrent._meqippopmenu.runVoidMethod ("_addmenuitem",(Object)(_ctitle),(Object)(RemoteObject.createImmutable("catitems")));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 525;BA.debugLine="Record.Close";
Debug.ShouldStop(4096);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 528;BA.debugLine="FirstDataLoad = False";
Debug.ShouldStop(32768);
user._firstdataload = user.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unavailable(RemoteObject _status) throws Exception{
try {
		Debug.PushSubsStack("Unavailable (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1641);
if (RapidSub.canDelegate("unavailable")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","unavailable", _status);}
Debug.locals.put("status", _status);
 BA.debugLineNum = 1641;BA.debugLine="Sub Unavailable(status As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1642;BA.debugLine="If status = 1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1643;BA.debugLine="ShareCode.USR_STATE = 1";
Debug.ShouldStop(1024);
user.mostCurrent._sharecode._usr_state /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 1644;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(2048);
_windowstatusupdate();
 }else {
 BA.debugLineNum = 1646;BA.debugLine="ToastMessageShow(ShareCode.AvisoToastNoUpdateSer";
Debug.ShouldStop(8192);
user.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._avisotoastnoupdateserver /*RemoteObject*/ )),(Object)(user.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1648;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unavreturn(RemoteObject _status) throws Exception{
try {
		Debug.PushSubsStack("UnavReturn (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1631);
if (RapidSub.canDelegate("unavreturn")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","unavreturn", _status);}
Debug.locals.put("status", _status);
 BA.debugLineNum = 1631;BA.debugLine="Sub UnavReturn(status As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1632;BA.debugLine="If status = 1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1634;BA.debugLine="ShareCode.USR_STATE = 0";
Debug.ShouldStop(2);
user.mostCurrent._sharecode._usr_state /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1635;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(4);
_windowstatusupdate();
 }else {
 BA.debugLineNum = 1637;BA.debugLine="ToastMessageShow(ShareCode.AvisoToastNoUpdateSer";
Debug.ShouldStop(16);
user.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._avisotoastnoupdateserver /*RemoteObject*/ )),(Object)(user.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1639;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("UpdateMainLayout (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,297);
if (RapidSub.canDelegate("updatemainlayout")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","updatemainlayout");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 297;BA.debugLine="Sub UpdateMainLayout";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
Debug.ShouldStop(512);
user.mostCurrent._mainlabeloptlists.runMethod(true,"setTextColor",user.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 299;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1024);
if (user.mostCurrent.__c.runMethod(true,"Not",(Object)(user.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 300;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
Debug.ShouldStop(2048);
user.mostCurrent._mainlogo.runMethod(true,"setGravity",user.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 301;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
Debug.ShouldStop(4096);
user.mostCurrent._mainlogo.runMethod(true,"setWidth",user.mostCurrent._consts._logowidth /*RemoteObject*/ );
 };
 BA.debugLineNum = 304;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
Debug.ShouldStop(32768);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6193527815",(RemoteObject.concat(RemoteObject.createImmutable("Inicialização de BMP: "),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 306;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
Debug.ShouldStop(131072);
if ((user.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 307;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
Debug.ShouldStop(262144);
user.mostCurrent._mainlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((user.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(user.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 };
 BA.debugLineNum = 313;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(16777216);
user.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,user.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), user.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 314;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
Debug.ShouldStop(33554432);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), user.mostCurrent._liststabpanel);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 315;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(67108864);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 317;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
Debug.ShouldStop(268435456);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndicatorColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(user.mostCurrent._consts._colormain /*RemoteObject*/ )})));
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
public static RemoteObject  _userlinechange_click() throws Exception{
try {
		Debug.PushSubsStack("UserLineChange_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1278);
if (RapidSub.canDelegate("userlinechange_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","userlinechange_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _itemtagcode = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _qq = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _hasdata = RemoteObject.createImmutable(false);
RemoteObject _sqlscript = RemoteObject.createImmutable("");
 BA.debugLineNum = 1278;BA.debugLine="Sub UserLineChange_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1279;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(1073741824);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), user.mostCurrent.__c.runMethod(false,"Sender",user.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 1280;BA.debugLine="Dim ItemTagCode As String = b.Tag";
Debug.ShouldStop(-2147483648);
_itemtagcode = BA.ObjectToString(_b.runMethod(false,"getTag"));Debug.locals.put("ItemTagCode", _itemtagcode);Debug.locals.put("ItemTagCode", _itemtagcode);
 BA.debugLineNum = 1281;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1282;BA.debugLine="Dim QQ As String = $\"select * from loc_userssessi";
Debug.ShouldStop(2);
_qq = (RemoteObject.concat(RemoteObject.createImmutable("select * from loc_userssession where session='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._starter._localsessioncode /*RemoteObject*/ ))),RemoteObject.createImmutable("' and tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemtagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("QQ", _qq);Debug.locals.put("QQ", _qq);
 BA.debugLineNum = 1283;BA.debugLine="Dim Record As Cursor";
Debug.ShouldStop(4);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1284;BA.debugLine="Record = Starter.LocalSQLWRK.ExecQuery(QQ)";
Debug.ShouldStop(8);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), user.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_qq)));
 BA.debugLineNum = 1285;BA.debugLine="Dim hasData As Boolean = Record.RowCount >= 1";
Debug.ShouldStop(16);
_hasdata = BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)));Debug.locals.put("hasData", _hasdata);Debug.locals.put("hasData", _hasdata);
 BA.debugLineNum = 1286;BA.debugLine="If (hasData) Then";
Debug.ShouldStop(32);
if ((_hasdata).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1287;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(64);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1288;BA.debugLine="If (Record.GetString(\"username\") = ShareCode.SES";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username"))),user.mostCurrent._sharecode._sess_oper_uwdukey /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1289;BA.debugLine="MsgboxAsync(ShareCode.userErroRemoveOwnUser, Sh";
Debug.ShouldStop(256);
user.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._usererroremoveownuser /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),user.processBA);
 }else {
 BA.debugLineNum = 1291;BA.debugLine="If (Record.GetInt(\"login\") = 1) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("login"))),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1292;BA.debugLine="MsgboxAsync(ShareCode.userSelectedUserNoRemove";
Debug.ShouldStop(2048);
user.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._userselectedusernoremove /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),user.processBA);
 }else {
 BA.debugLineNum = 1294;BA.debugLine="i = Msgbox2(ShareCode.userAskRemoveUser, Share";
Debug.ShouldStop(8192);
_i = user.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._useraskremoveuser /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(user.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(user.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(user.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent.__c.getField(false,"Null"))),user.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1295;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, user.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1296;BA.debugLine="Dim sqlScript As String = $\"delete from loc_u";
Debug.ShouldStop(32768);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("delete from loc_userssession where session='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((user.mostCurrent._starter._localsessioncode /*RemoteObject*/ ))),RemoteObject.createImmutable("' and tagcode='"),user.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemtagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 1297;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(sqlScript)";
Debug.ShouldStop(65536);
user.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 1298;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
Debug.ShouldStop(131072);
_createuserdetailsdata(user.mostCurrent.__c.getField(true,"True"),user.mostCurrent._currentcarid);
 };
 };
 };
 };
 BA.debugLineNum = 1304;BA.debugLine="Record.Close";
Debug.ShouldStop(8388608);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1306;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _userlistview_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("UserListView_ItemClick (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1262);
if (RapidSub.canDelegate("userlistview_itemclick")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","userlistview_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1262;BA.debugLine="Sub UserListView_ItemClick (Index As Int, Value As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1263;BA.debugLine="CurrentGroupItem = Index";
Debug.ShouldStop(16384);
user._currentgroupitem = _index;
 BA.debugLineNum = 1264;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _usershowcertificate_click() throws Exception{
try {
		Debug.PushSubsStack("userShowCertificate_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1114);
if (RapidSub.canDelegate("usershowcertificate_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","usershowcertificate_click");}
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _provider = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.fileprovider");
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pdfappslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1114;BA.debugLine="Sub userShowCertificate_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1115;BA.debugLine="Dim Filename As String = userCertificate.Tag";
Debug.ShouldStop(67108864);
_filename = BA.ObjectToString(user.mostCurrent._usercertificate.runMethod(false,"getTag"));Debug.locals.put("Filename", _filename);Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 1116;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(134217728);
_continua = user.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 1117;BA.debugLine="If Continua Then";
Debug.ShouldStop(268435456);
if (_continua.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1118;BA.debugLine="Private Provider As FileProvider";
Debug.ShouldStop(536870912);
_provider = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.fileprovider");Debug.locals.put("Provider", _provider);
 BA.debugLineNum = 1119;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(1073741824);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initialize" /*RemoteObject*/ ,user.processBA);
 BA.debugLineNum = 1120;BA.debugLine="Provider.InitializeSafeDir";
Debug.ShouldStop(-2147483648);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initializesafedir" /*RemoteObject*/ );
 BA.debugLineNum = 1121;BA.debugLine="Dim theFile As String = Provider.GetFileUri(File";
Debug.ShouldStop(1);
_thefile = BA.ObjectToString(_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename)));Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 1125;BA.debugLine="Log(theFile)";
Debug.ShouldStop(16);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6195100683",_thefile,0);
 BA.debugLineNum = 1126;BA.debugLine="Dim Intent1 As Intent";
Debug.ShouldStop(32);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 1127;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"file://";
Debug.ShouldStop(64);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("file://"),_thefile)));
 BA.debugLineNum = 1128;BA.debugLine="Intent1.SetType(\"application/pdf\")";
Debug.ShouldStop(128);
_intent1.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/pdf")));
 BA.debugLineNum = 1129;BA.debugLine="Dim pdfAppsList As List";
Debug.ShouldStop(256);
_pdfappslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1130;BA.debugLine="pdfAppsList = Utils.QueryIntent(Intent1)";
Debug.ShouldStop(512);
_pdfappslist = user.mostCurrent._utils.runMethod(false,"_queryintent" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(_intent1));Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1131;BA.debugLine="If pdfAppsList.size>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_pdfappslist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1133;BA.debugLine="Log(\"pdf viewer(s) exists\")";
Debug.ShouldStop(4096);
user.mostCurrent.__c.runVoidMethod ("LogImpl","6195100691",RemoteObject.createImmutable("pdf viewer(s) exists"),0);
 BA.debugLineNum = 1134;BA.debugLine="StartActivity(Intent1)";
Debug.ShouldStop(8192);
user.mostCurrent.__c.runVoidMethod ("StartActivity",user.processBA,(Object)((_intent1.getObject())));
 };
 };
 BA.debugLineNum = 1138;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _whouses_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("whouses_Click (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,1034);
if (RapidSub.canDelegate("whouses_click")) { return xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","whouses_click", _menuname);}
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1034;BA.debugLine="Sub whouses_Click(MenuName As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 1040;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _windowstatusupdate() throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,320);
if (RapidSub.canDelegate("windowstatusupdate")) { xevolution.vrcg.devdemov2400.user.remoteMe.runUserSub(false, "user","windowstatusupdate"); return;}
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
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.user parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (user) ","user",63,user.mostCurrent.activityBA,user.mostCurrent,320);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 322;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,user.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 323;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("StopService",user.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 324;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("StopService",user.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 326;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("StopService",user.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 327;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",user.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 328;BA.debugLine="Sleep(500)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "windowstatusupdate"),BA.numberCast(int.class, 500));
this.state = 19;
return;
case 19:
//C
this.state = 4;
;
 BA.debugLineNum = 329;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 332;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(2048);
parent.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 333;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
Debug.ShouldStop(4096);
parent.mostCurrent._labelcopyright.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/ ));
 BA.debugLineNum = 334;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
Debug.ShouldStop(8192);
parent.mostCurrent._mainactiveuser.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ));
 BA.debugLineNum = 335;BA.debugLine="ButtonUserUnavailable.Enabled = False";
Debug.ShouldStop(16384);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 336;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
Debug.ShouldStop(32768);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 337;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
Debug.ShouldStop(65536);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 338;BA.debugLine="butUserPauseAction.textColor = Colors.black";
Debug.ShouldStop(131072);
parent.mostCurrent._butuserpauseaction.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 339;BA.debugLine="butUserUnavailable.TextColor = Colors.black";
Debug.ShouldStop(262144);
parent.mostCurrent._butuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 340;BA.debugLine="butUserEstadoAction.TextColor = Colors.black";
Debug.ShouldStop(524288);
parent.mostCurrent._butuserestadoaction.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 342;BA.debugLine="mainLabelOptLists.Text = ShareCode.MainOption_Use";
Debug.ShouldStop(2097152);
parent.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_user /*RemoteObject*/ .runMethod(true,"toUpperCase")));
 BA.debugLineNum = 343;BA.debugLine="MenuPanelUserButton.Text = ShareCode.usermainLabe";
Debug.ShouldStop(4194304);
parent.mostCurrent._menupaneluserbutton.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usermainlabeloptlistsuser /*RemoteObject*/ ));
 BA.debugLineNum = 344;BA.debugLine="MenuPanelDocsButtom.Text = ShareCode.usermainLabe";
Debug.ShouldStop(8388608);
parent.mostCurrent._menupaneldocsbuttom.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usermainlabeloptlistsdocs /*RemoteObject*/ ));
 BA.debugLineNum = 345;BA.debugLine="MenuPanelConsumablesButton.Text = ShareCode.userm";
Debug.ShouldStop(16777216);
parent.mostCurrent._menupanelconsumablesbutton.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usermainlabeloptlistscons /*RemoteObject*/ ));
 BA.debugLineNum = 346;BA.debugLine="MenuPanelOperatorsButton.Text = ShareCode.usermai";
Debug.ShouldStop(33554432);
parent.mostCurrent._menupaneloperatorsbutton.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usermainlabeloptlistsoper /*RemoteObject*/ ));
 BA.debugLineNum = 348;BA.debugLine="ButtonAppNetwork.Enabled = False";
Debug.ShouldStop(134217728);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 349;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
Debug.ShouldStop(268435456);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 351;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 5:
//if
this.state = 8;
if ((parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 352;BA.debugLine="ButtonAppNetwork.Enabled = True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 353;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
Debug.ShouldStop(1);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 356;BA.debugLine="If ShareCode.USR_STATE = 0 Then";
Debug.ShouldStop(8);

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._usr_state /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 357;BA.debugLine="butUserUnavailable.TextColor = Consts.ColorRed";
Debug.ShouldStop(16);
parent.mostCurrent._butuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 358;BA.debugLine="butUserEstadoAction.TextColor = Consts.ColorRed";
Debug.ShouldStop(32);
parent.mostCurrent._butuserestadoaction.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 359;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
Debug.ShouldStop(64);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 360;BA.debugLine="ButtonUserUnavailable.Enabled = True";
Debug.ShouldStop(128);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 362;BA.debugLine="butUserUnavailable.TextColor = Colors.black";
Debug.ShouldStop(512);
parent.mostCurrent._butuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 363;BA.debugLine="butUserEstadoAction.TextColor = Colors.black";
Debug.ShouldStop(1024);
parent.mostCurrent._butuserestadoaction.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 364;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLi";
Debug.ShouldStop(2048);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 375;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(4194304);

case 13:
//if
this.state = 18;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 376;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_3\", Me)";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_3")),(Object)(user.getObject()));
 BA.debugLineNum = 377;BA.debugLine="Sleep(250)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "windowstatusupdate"),BA.numberCast(int.class, 250));
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 378;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorOrange";
Debug.ShouldStop(33554432);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colororange /*RemoteObject*/ );
 BA.debugLineNum = 379;BA.debugLine="butUserPauseAction.TextColor = Consts.ColorOrang";
Debug.ShouldStop(67108864);
parent.mostCurrent._butuserpauseaction.runMethod(true,"setTextColor",parent.mostCurrent._consts._colororange /*RemoteObject*/ );
 BA.debugLineNum = 381;BA.debugLine="lblEstadoUserJornada.Text = ShareCode.MsgUserMes";
Debug.ShouldStop(268435456);
parent.mostCurrent._lblestadouserjornada.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgusermessagejornadaindisponivel /*RemoteObject*/ ));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 383;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_4\", Me)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,user.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_4")),(Object)(user.getObject()));
 BA.debugLineNum = 384;BA.debugLine="Sleep(250)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Sleep",user.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "user", "windowstatusupdate"),BA.numberCast(int.class, 250));
this.state = 21;
return;
case 21:
//C
this.state = 18;
;
 BA.debugLineNum = 385;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightS";
Debug.ShouldStop(1);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 386;BA.debugLine="butUserPauseAction.TextColor = Colors.Black";
Debug.ShouldStop(2);
parent.mostCurrent._butuserpauseaction.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 388;BA.debugLine="lblEstadoUserJornada.Text = ShareCode.MsgUserMes";
Debug.ShouldStop(8);
parent.mostCurrent._lblestadouserjornada.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgusermessagejornadaactivo /*RemoteObject*/ ));
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 391;BA.debugLine="listsLabelInfo.Text = $\"${CurrentEquipItem} / ${T";
Debug.ShouldStop(64);
parent.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._currentequipitem))),RemoteObject.createImmutable(" / "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._totallineitems))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 393;BA.debugLine="End Sub";
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
}