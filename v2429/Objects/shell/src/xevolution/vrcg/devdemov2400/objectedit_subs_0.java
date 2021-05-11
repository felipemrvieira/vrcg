package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class objectedit_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,221);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","activity_create", _firsttime);}
RemoteObject _where = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 221;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 223;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(1073741824);
if ((objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 224;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(-2147483648);
objectedit._device.runVoidMethod ("SetScreenOrientation",objectedit.processBA,(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 225;BA.debugLine="Activity.LoadLayout(\"phone_object_editlayout\")";
Debug.ShouldStop(1);
objectedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("phone_object_editlayout")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 226;BA.debugLine="MenuPanelButtonList.Initialize";
Debug.ShouldStop(2);
objectedit.mostCurrent._menupanelbuttonlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 227;BA.debugLine="MenuPanelButtonList.Add(MenuPanelButtonOne)";
Debug.ShouldStop(4);
objectedit.mostCurrent._menupanelbuttonlist.runVoidMethod ("Add",(Object)((objectedit.mostCurrent._menupanelbuttonone.getObject())));
 BA.debugLineNum = 228;BA.debugLine="MenuPanelButtonList.Add(MenuPanelButtomTwo)";
Debug.ShouldStop(8);
objectedit.mostCurrent._menupanelbuttonlist.runVoidMethod ("Add",(Object)((objectedit.mostCurrent._menupanelbuttomtwo.getObject())));
 BA.debugLineNum = 229;BA.debugLine="MenuPanelButtonList.Add(MenuPanelButtonThree)";
Debug.ShouldStop(16);
objectedit.mostCurrent._menupanelbuttonlist.runVoidMethod ("Add",(Object)((objectedit.mostCurrent._menupanelbuttonthree.getObject())));
 BA.debugLineNum = 230;BA.debugLine="MenuPanelButtonList.Add(MenuPanelButtonFour)";
Debug.ShouldStop(32);
objectedit.mostCurrent._menupanelbuttonlist.runVoidMethod ("Add",(Object)((objectedit.mostCurrent._menupanelbuttonfour.getObject())));
 }else {
 BA.debugLineNum = 232;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(128);
objectedit._device.runVoidMethod ("SetScreenOrientation",objectedit.processBA,(Object)(objectedit.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 BA.debugLineNum = 233;BA.debugLine="Activity.LoadLayout(\"object_editLayout\")";
Debug.ShouldStop(256);
objectedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("object_editLayout")),objectedit.mostCurrent.activityBA);
 };
 BA.debugLineNum = 236;BA.debugLine="MenuPanelPagesTitle.Initialize";
Debug.ShouldStop(2048);
objectedit.mostCurrent._menupanelpagestitle.runVoidMethod ("Initialize");
 BA.debugLineNum = 239;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(16384);
objectedit.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objectedit.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 241;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(65536);
objectedit.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = objectedit.getObject();
 BA.debugLineNum = 242;BA.debugLine="TypeAddressList.Initialize";
Debug.ShouldStop(131072);
objectedit.mostCurrent._typeaddresslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 243;BA.debugLine="TypeAddressList = DBStructures.GetListOfAddresseT";
Debug.ShouldStop(262144);
objectedit.mostCurrent._typeaddresslist = objectedit.mostCurrent._dbstructures.runMethod(false,"_getlistofaddressetypesevc" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 244;BA.debugLine="TypeContactsList.Initialize";
Debug.ShouldStop(524288);
objectedit.mostCurrent._typecontactslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 245;BA.debugLine="TypeContactsList = DBStructures.GetListOfContactT";
Debug.ShouldStop(1048576);
objectedit.mostCurrent._typecontactslist = objectedit.mostCurrent._dbstructures.runMethod(false,"_getlistofcontacttypesevc" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 246;BA.debugLine="TypePeriodicity.Initialize";
Debug.ShouldStop(2097152);
objectedit.mostCurrent._typeperiodicity.runVoidMethod ("Initialize");
 BA.debugLineNum = 247;BA.debugLine="TypePeriodicity = DBStructures.GetListOfPeriodici";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._typeperiodicity = objectedit.mostCurrent._dbstructures.runMethod(false,"_getlistofperiodicitytypesevc" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 248;BA.debugLine="TypeDayPeriod.Initialize";
Debug.ShouldStop(8388608);
objectedit.mostCurrent._typedayperiod.runVoidMethod ("Initialize");
 BA.debugLineNum = 249;BA.debugLine="TypeDayPeriod = DBStructures.GetListOfDayPeriodTy";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._typedayperiod = objectedit.mostCurrent._dbstructures.runMethod(false,"_getlistofdayperiodtypesevc" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 251;BA.debugLine="Dim where As String = $\"select distinct b.object";
Debug.ShouldStop(67108864);
_where = (RemoteObject.concat(RemoteObject.createImmutable("select distinct b.object from requests as a inner join requests_objects as b on (b.tagcode=a.tagcode) where a.request_date='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._sharecode._current_appdate /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("where", _where);Debug.locals.put("where", _where);
 BA.debugLineNum = 252;BA.debugLine="ObjRequests = DBStructures.GetListOfFromScript(\"o";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._objrequests = objectedit.mostCurrent._dbstructures.runMethod(false,"_getlistoffromscript" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("object")),(Object)(_where));
 BA.debugLineNum = 254;BA.debugLine="Dim s As String = Utils.StrList2SQLArray(ObjReque";
Debug.ShouldStop(536870912);
_s = objectedit.mostCurrent._utils.runMethod(true,"_strlist2sqlarray" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._objrequests));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 255;BA.debugLine="Dim where As String = $\"Select distinct b.object";
Debug.ShouldStop(1073741824);
_where = (RemoteObject.concat(RemoteObject.createImmutable("Select distinct b.object from requests As a inner join requests_objects As b on (b.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("							where a.request_date<>'"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._sharecode._current_appdate /*RemoteObject*/ ))),RemoteObject.createImmutable("' and b.object not in "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s))),RemoteObject.createImmutable("")));Debug.locals.put("where", _where);Debug.locals.put("where", _where);
 BA.debugLineNum = 257;BA.debugLine="ObjRequestsNotToday = DBStructures.GetListOfFromS";
Debug.ShouldStop(1);
objectedit.mostCurrent._objrequestsnottoday = objectedit.mostCurrent._dbstructures.runMethod(false,"_getlistoffromscript" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("object")),(Object)(_where));
 BA.debugLineNum = 259;BA.debugLine="UpdateMainLayout";
Debug.ShouldStop(4);
_updatemainlayout();
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,296);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 296;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 297;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, objectedit.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 298;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(512);
if ((objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 299;BA.debugLine="Return PhoneBackButtonTab";
Debug.ShouldStop(1024);
if (true) return _phonebackbuttontab();
 };
 BA.debugLineNum = 301;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(4096);
_listsbuttonclose_click();
 };
 BA.debugLineNum = 303;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return objectedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,292);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 292;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,285);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","activity_resume");}
 BA.debugLineNum = 285;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonaddobjectcontact_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAddobjectContact_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1060);
if (RapidSub.canDelegate("buttonaddobjectcontact_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","buttonaddobjectcontact_click");}
 BA.debugLineNum = 1060;BA.debugLine="Sub ButtonAddobjectContact_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1062;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonuserunavailable_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUserUnavailable_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1056);
if (RapidSub.canDelegate("buttonuserunavailable_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","buttonuserunavailable_click");}
 BA.debugLineNum = 1056;BA.debugLine="Sub ButtonUserUnavailable_Click";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _collapseitem(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("CollapseItem (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1150);
if (RapidSub.canDelegate("collapseitem")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","collapseitem", _index);}
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
Debug.locals.put("index", _index);
 BA.debugLineNum = 1150;BA.debugLine="Sub CollapseItem(index As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1151;BA.debugLine="Dim id As ItemData = objectListView.GetValue(inde";
Debug.ShouldStop(1073741824);
_id = (objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1152;BA.debugLine="objectListView.ResizeItem(index, id.CollapsedHeig";
Debug.ShouldStop(-2147483648);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_resizeitem" /*RemoteObject*/ ,(Object)(_index),(Object)(_id.getField(true,"CollapsedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 1153;BA.debugLine="objectListView.GetPanel(index).Tag = False";
Debug.ShouldStop(1);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"setTag",(objectedit.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1156;BA.debugLine="If (pnlGroupCurrenIndex <> index) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("!",objectedit._pnlgroupcurrenindex,BA.numberCast(double.class, _index)))) { 
 BA.debugLineNum = 1159;BA.debugLine="objectListView.GetPanel(index).GetView(0).GetVie";
Debug.ShouldStop(64);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._types._expand_icon /*RemoteObject*/ ));
 BA.debugLineNum = 1160;BA.debugLine="pnlGroupCurrenIndex = index";
Debug.ShouldStop(128);
objectedit._pnlgroupcurrenindex = _index;
 };
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
public static RemoteObject  _collapseitemprop(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("CollapseItemProp (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1182);
if (RapidSub.canDelegate("collapseitemprop")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","collapseitemprop", _index);}
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
Debug.locals.put("index", _index);
 BA.debugLineNum = 1182;BA.debugLine="Sub CollapseItemProp(index As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1183;BA.debugLine="Dim id As ItemData = objectPropertyListView.GetVa";
Debug.ShouldStop(1073741824);
_id = (objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1184;BA.debugLine="objectPropertyListView.ResizeItem(index, id.Colla";
Debug.ShouldStop(-2147483648);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_resizeitem" /*RemoteObject*/ ,(Object)(_index),(Object)(_id.getField(true,"CollapsedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 1185;BA.debugLine="objectPropertyListView.GetPanel(index).Tag = Fals";
Debug.ShouldStop(1);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"setTag",(objectedit.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1188;BA.debugLine="If (pnlGroupCurrenPropIndex <> index) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("!",objectedit._pnlgroupcurrenpropindex,BA.numberCast(double.class, _index)))) { 
 BA.debugLineNum = 1189;BA.debugLine="objectPropertyListView.GetPanel(pnlGroupCurrenPr";
Debug.ShouldStop(16);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(objectedit._pnlgroupcurrenpropindex)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setColor",objectedit.mostCurrent._consts._nocolor /*RemoteObject*/ );
 BA.debugLineNum = 1190;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
Debug.ShouldStop(32);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setColor",objectedit.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 1192;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
Debug.ShouldStop(128);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._types._expand_icon /*RemoteObject*/ ));
 BA.debugLineNum = 1193;BA.debugLine="pnlGroupCurrenPropIndex = index";
Debug.ShouldStop(256);
objectedit._pnlgroupcurrenpropindex = _index;
 }else {
 BA.debugLineNum = 1196;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
Debug.ShouldStop(2048);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._types._expand_icon /*RemoteObject*/ ));
 };
 BA.debugLineNum = 1199;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchapter(RemoteObject _clr,RemoteObject _title,RemoteObject _id,RemoteObject _idx,RemoteObject _width,RemoteObject _expanded) throws Exception{
try {
		Debug.PushSubsStack("CreateChapter (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1013);
if (RapidSub.canDelegate("createchapter")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createchapter", _clr, _title, _id, _idx, _width, _expanded);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("clr", _clr);
Debug.locals.put("Title", _title);
Debug.locals.put("id", _id);
Debug.locals.put("idx", _idx);
Debug.locals.put("width", _width);
Debug.locals.put("Expanded", _expanded);
 BA.debugLineNum = 1013;BA.debugLine="Sub CreateChapter(clr As Int, Title As String, id";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1014;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = objectedit.mostCurrent._xui.runMethod(false,"CreatePanel",objectedit.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1015;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, id.ExpandedHe";
Debug.ShouldStop(4194304);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_id.getField(true,"ExpandedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 1016;BA.debugLine="p.LoadLayout(\"ListCollapseGroup\")";
Debug.ShouldStop(8388608);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListCollapseGroup")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 1017;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, p.Width,id.Collapsed";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_id.getField(true,"CollapsedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 1018;BA.debugLine="lblGroupTitle.Text = Title";
Debug.ShouldStop(33554432);
objectedit.mostCurrent._lblgrouptitle.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1019;BA.debugLine="lblGroupTitle.Tag = idx";
Debug.ShouldStop(67108864);
objectedit.mostCurrent._lblgrouptitle.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1020;BA.debugLine="pnlGroupTitle.Tag = idx";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._pnlgrouptitle.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1021;BA.debugLine="butGroupCollpseExpand.Tag = idx";
Debug.ShouldStop(268435456);
objectedit.mostCurrent._butgroupcollpseexpand.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1022;BA.debugLine="p.Tag = Expanded 'collapsed";
Debug.ShouldStop(536870912);
_p.runMethod(false,"setTag",(_expanded));
 BA.debugLineNum = 1023;BA.debugLine="Return p";
Debug.ShouldStop(1073741824);
if (true) return _p;
 BA.debugLineNum = 1024;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchapterprop(RemoteObject _clr,RemoteObject _title,RemoteObject _id,RemoteObject _idx,RemoteObject _width,RemoteObject _expanded) throws Exception{
try {
		Debug.PushSubsStack("CreateChapterProp (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1026);
if (RapidSub.canDelegate("createchapterprop")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createchapterprop", _clr, _title, _id, _idx, _width, _expanded);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("clr", _clr);
Debug.locals.put("Title", _title);
Debug.locals.put("id", _id);
Debug.locals.put("idx", _idx);
Debug.locals.put("width", _width);
Debug.locals.put("Expanded", _expanded);
 BA.debugLineNum = 1026;BA.debugLine="Sub CreateChapterProp(clr As Int, Title As String,";
Debug.ShouldStop(2);
 BA.debugLineNum = 1027;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = objectedit.mostCurrent._xui.runMethod(false,"CreatePanel",objectedit.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1028;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, id.ExpandedHe";
Debug.ShouldStop(8);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_id.getField(true,"ExpandedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 1030;BA.debugLine="p.LoadLayout(\"ListCollapseGroupProp\")";
Debug.ShouldStop(32);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListCollapseGroupProp")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 1031;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, p.Width,id.Collapsed";
Debug.ShouldStop(64);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_id.getField(true,"CollapsedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 1032;BA.debugLine="lblGroupTitleProp.Text = Title";
Debug.ShouldStop(128);
objectedit.mostCurrent._lblgrouptitleprop.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1033;BA.debugLine="lblGroupTitleProp.Tag = idx";
Debug.ShouldStop(256);
objectedit.mostCurrent._lblgrouptitleprop.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1034;BA.debugLine="pnlGroupTitleProp.Tag = idx";
Debug.ShouldStop(512);
objectedit.mostCurrent._pnlgrouptitleprop.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1035;BA.debugLine="butGroupCollpseExpandProp.Tag = idx";
Debug.ShouldStop(1024);
objectedit.mostCurrent._butgroupcollpseexpandprop.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1036;BA.debugLine="p.Tag = Expanded 'collapsed";
Debug.ShouldStop(2048);
_p.runMethod(false,"setTag",(_expanded));
 BA.debugLineNum = 1037;BA.debugLine="Return p";
Debug.ShouldStop(4096);
if (true) return _p;
 BA.debugLineNum = 1038;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcontractfromobject(RemoteObject _clear,RemoteObject _filter) throws Exception{
try {
		Debug.PushSubsStack("CreateContractFromobject (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,698);
if (RapidSub.canDelegate("createcontractfromobject")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createcontractfromobject", _clear, _filter);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _currentcontract = RemoteObject.createImmutable("");
RemoteObject _dwv = RemoteObject.createImmutable("");
RemoteObject _bbw = null;
RemoteObject _weeklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _dayslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _bbd = null;
Debug.locals.put("Clear", _clear);
Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 698;BA.debugLine="Sub CreateContractFromobject(Clear As Boolean, Fil";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 699;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(67108864);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 700;BA.debugLine="Dim SQL As String = DBStructures.SQL_ALL_OBJECT_C";
Debug.ShouldStop(134217728);
_sql = objectedit.mostCurrent._dbstructures._sql_all_object_contracts /*RemoteObject*/ ;Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 701;BA.debugLine="If (Filter <> \"\") Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 702;BA.debugLine="SQL = $\"${SQL} where ${Filter}\"$";
Debug.ShouldStop(536870912);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" where "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("")));Debug.locals.put("SQL", _sql);
 };
 BA.debugLineNum = 704;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(-2147483648);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 705;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 706;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(2);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 707;BA.debugLine="Dim CurrentContract As String = Record.GetString";
Debug.ShouldStop(4);
_currentcontract = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("CurrentContract", _currentcontract);Debug.locals.put("CurrentContract", _currentcontract);
 BA.debugLineNum = 713;BA.debugLine="objectContractName.Text = Record.GetString(\"titl";
Debug.ShouldStop(256);
objectedit.mostCurrent._objectcontractname.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))));
 BA.debugLineNum = 714;BA.debugLine="objectContractStart.text = Record.GetString(\"val";
Debug.ShouldStop(512);
objectedit.mostCurrent._objectcontractstart.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valid_from")))));
 BA.debugLineNum = 715;BA.debugLine="objectContractEnd.text = Record.GetString(\"valid";
Debug.ShouldStop(1024);
objectedit.mostCurrent._objectcontractend.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valid_to")))));
 BA.debugLineNum = 717;BA.debugLine="objectContractDaysPeriod.text = Record.GetInt(\"p";
Debug.ShouldStop(4096);
objectedit.mostCurrent._objectcontractdaysperiod.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("periodvisits")))));
 BA.debugLineNum = 718;BA.debugLine="objectContractDuration.text = Record.GetInt(\"dur";
Debug.ShouldStop(8192);
objectedit.mostCurrent._objectcontractduration.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("duration")))));
 BA.debugLineNum = 719;BA.debugLine="objectContractDaysNotice.text = Record.GetInt(\"c";
Debug.ShouldStop(16384);
objectedit.mostCurrent._objectcontractdaysnotice.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("confirmdays")))));
 BA.debugLineNum = 721;BA.debugLine="objectContractPeriod.text = TypePeriodicity.Get(";
Debug.ShouldStop(65536);
objectedit.mostCurrent._objectcontractperiod.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._typeperiodicity.runMethod(false,"Get",(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("periodicity")))))));
 BA.debugLineNum = 722;BA.debugLine="objectContractHours.text = Record.GetInt(\"hoursp";
Debug.ShouldStop(131072);
objectedit.mostCurrent._objectcontracthours.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("hourspervisit")))));
 BA.debugLineNum = 723;BA.debugLine="objectContractHourPeriod.text = TypeDayPeriod.Ge";
Debug.ShouldStop(262144);
objectedit.mostCurrent._objectcontracthourperiod.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._typedayperiod.runMethod(false,"Get",(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("dayperiod")))))));
 BA.debugLineNum = 725;BA.debugLine="Dim dwv As String = Record.GetString(\"daysweekvi";
Debug.ShouldStop(1048576);
_dwv = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("daysweekvisit")));Debug.locals.put("dwv", _dwv);Debug.locals.put("dwv", _dwv);
 BA.debugLineNum = 726;BA.debugLine="If Not( Utils.isNullOrEmpty(dwv)) Then";
Debug.ShouldStop(2097152);
if (objectedit.mostCurrent.__c.runMethod(true,"Not",(Object)(objectedit.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_dwv)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 727;BA.debugLine="Dim bbw(8) As Button = Array As Button(w0,w1,w2";
Debug.ShouldStop(4194304);
_bbw = RemoteObject.createNewArray("anywheresoftware.b4a.objects.ButtonWrapper",new int[] {8},new Object[] {objectedit.mostCurrent._w0,objectedit.mostCurrent._w1,objectedit.mostCurrent._w2,objectedit.mostCurrent._w3,objectedit.mostCurrent._w4,objectedit.mostCurrent._w5,objectedit.mostCurrent._w6,objectedit.mostCurrent._w7});Debug.locals.put("bbw", _bbw);Debug.locals.put("bbw", _bbw);
 BA.debugLineNum = 728;BA.debugLine="Dim weekList As List = Regex.Split(\"\\|\", Record";
Debug.ShouldStop(8388608);
_weeklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_weeklist = objectedit.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(objectedit.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("daysweekvisit")))))));Debug.locals.put("weekList", _weeklist);Debug.locals.put("weekList", _weeklist);
 BA.debugLineNum = 729;BA.debugLine="For n=0 To weekList.Size-1";
Debug.ShouldStop(16777216);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_weeklist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step23 > 0 && _n <= limit23) || (step23 < 0 && _n >= limit23) ;_n = ((int)(0 + _n + step23))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 730;BA.debugLine="bbw(weekList.Get(n)-1).Color = Colors.ARGB(255";
Debug.ShouldStop(33554432);
_bbw.getArrayElement(false,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _weeklist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n)))),RemoteObject.createImmutable(1)}, "-",1, 0))).runVoidMethod ("setColor",objectedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 115)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 155))));
 }
}Debug.locals.put("n", _n);
;
 };
 BA.debugLineNum = 734;BA.debugLine="Dim dwv As String = Record.GetString(\"daismonthv";
Debug.ShouldStop(536870912);
_dwv = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("daismonthvisit")));Debug.locals.put("dwv", _dwv);Debug.locals.put("dwv", _dwv);
 BA.debugLineNum = 735;BA.debugLine="If Not( Utils.isNullOrEmpty(dwv)) Then";
Debug.ShouldStop(1073741824);
if (objectedit.mostCurrent.__c.runMethod(true,"Not",(Object)(objectedit.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_dwv)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 736;BA.debugLine="Dim daysList As List = Regex.Split(\"\\|\", Record";
Debug.ShouldStop(-2147483648);
_dayslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dayslist = objectedit.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(objectedit.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("daismonthvisit")))))));Debug.locals.put("daysList", _dayslist);Debug.locals.put("daysList", _dayslist);
 BA.debugLineNum = 737;BA.debugLine="Dim bbd(33) As Button = Array As Button(d1,d2,d";
Debug.ShouldStop(1);
_bbd = RemoteObject.createNewArray("anywheresoftware.b4a.objects.ButtonWrapper",new int[] {33},new Object[] {objectedit.mostCurrent._d1,objectedit.mostCurrent._d2,objectedit.mostCurrent._d3,objectedit.mostCurrent._d4,objectedit.mostCurrent._d5,objectedit.mostCurrent._d6,objectedit.mostCurrent._d7,objectedit.mostCurrent._d8,objectedit.mostCurrent._d9,objectedit.mostCurrent._d10,objectedit.mostCurrent._d11,objectedit.mostCurrent._d12,objectedit.mostCurrent._d13,objectedit.mostCurrent._d14,objectedit.mostCurrent._d15,objectedit.mostCurrent._d16,objectedit.mostCurrent._d17,objectedit.mostCurrent._d18,objectedit.mostCurrent._d19,objectedit.mostCurrent._d20,objectedit.mostCurrent._d30,objectedit.mostCurrent._d29,objectedit.mostCurrent._d28,objectedit.mostCurrent._d27,objectedit.mostCurrent._d26,objectedit.mostCurrent._d25,objectedit.mostCurrent._d24,objectedit.mostCurrent._d23,objectedit.mostCurrent._d22,objectedit.mostCurrent._d21,objectedit.mostCurrent._d31,objectedit.mostCurrent._d32,objectedit.mostCurrent._d33});Debug.locals.put("bbd", _bbd);Debug.locals.put("bbd", _bbd);
 BA.debugLineNum = 740;BA.debugLine="For n=0 To daysList.Size-1";
Debug.ShouldStop(8);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_dayslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step31 > 0 && _n <= limit31) || (step31 < 0 && _n >= limit31) ;_n = ((int)(0 + _n + step31))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 741;BA.debugLine="bbd(daysList.Get(n)-1).Color = Colors.ARGB(255";
Debug.ShouldStop(16);
_bbd.getArrayElement(false,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _dayslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n)))),RemoteObject.createImmutable(1)}, "-",1, 0))).runVoidMethod ("setColor",objectedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 115)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 155))));
 }
}Debug.locals.put("n", _n);
;
 };
 BA.debugLineNum = 745;BA.debugLine="contractPanel.Tag = CurrentContract";
Debug.ShouldStop(256);
objectedit.mostCurrent._contractpanel.runMethod(false,"setTag",(_currentcontract));
 }else {
 BA.debugLineNum = 747;BA.debugLine="If (contractPanel.IsInitialized) Then  contractP";
Debug.ShouldStop(1024);
if ((objectedit.mostCurrent._contractpanel.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
objectedit.mostCurrent._contractpanel.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));};
 BA.debugLineNum = 748;BA.debugLine="If (WareHousePanel.IsInitialized) Then  WareHous";
Debug.ShouldStop(2048);
if ((objectedit.mostCurrent._warehousepanel.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
objectedit.mostCurrent._warehousepanel.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));};
 };
 BA.debugLineNum = 750;BA.debugLine="Record.Close";
Debug.ShouldStop(8192);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 751;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdocumentlistitem(RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateDocumentListItem (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,562);
if (RapidSub.canDelegate("createdocumentlistitem")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createdocumentlistitem", _cnt, _colitems, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _file2setext = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 562;BA.debugLine="Sub CreateDocumentListItem(cnt As Int, colitems As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 563;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 564;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(524288);
_p.runVoidMethod ("Initialize",objectedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 565;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(1048576);
objectedit.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 566;BA.debugLine="If (Utils.isNullOrEmpty(ThisObjectType.doctemplat";
Debug.ShouldStop(2097152);
if ((objectedit.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._thisobjecttype.getField(true,"doctemplate" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 567;BA.debugLine="p.LoadLayout(\"ListItemDocument\")";
Debug.ShouldStop(4194304);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListItemDocument")),objectedit.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 569;BA.debugLine="p.LoadLayout(\"ListItemDocumentValidate\")";
Debug.ShouldStop(16777216);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListItemDocumentValidate")),objectedit.mostCurrent.activityBA);
 };
 BA.debugLineNum = 571;BA.debugLine="p.RemoveView";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 573;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(268435456);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 574;BA.debugLine="ListItemTitle.Text = colitems.GetString(\"title\")";
Debug.ShouldStop(536870912);
objectedit.mostCurrent._listitemtitle.runMethod(true,"setText",BA.ObjectToCharSequence(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))));
 BA.debugLineNum = 575;BA.debugLine="ListItemCategory.Text = \"\"'colitems.GetString(\"ca";
Debug.ShouldStop(1073741824);
objectedit.mostCurrent._listitemcategory.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 576;BA.debugLine="ListItemSDate.Text = Utils.IfNullOrEmpty(colitems";
Debug.ShouldStop(-2147483648);
objectedit.mostCurrent._listitemsdate.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valid_from")))),(Object)(RemoteObject.createImmutable("----------")))));
 BA.debugLineNum = 577;BA.debugLine="ListItemEDate.Text = Utils.IfNullOrEmpty(colitems";
Debug.ShouldStop(1);
objectedit.mostCurrent._listitemedate.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valid_to")))),(Object)(RemoteObject.createImmutable("----------")))));
 BA.debugLineNum = 579;BA.debugLine="ListItemDocButton.Tag = colitems.GetString(\"doc_f";
Debug.ShouldStop(4);
objectedit.mostCurrent._listitemdocbutton.runMethod(false,"setTag",(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("doc_filename")))));
 BA.debugLineNum = 580;BA.debugLine="ListItemTitle.Tag = colitems.GetString(\"doc_filen";
Debug.ShouldStop(8);
objectedit.mostCurrent._listitemtitle.runMethod(false,"setTag",(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("doc_filename")))));
 BA.debugLineNum = 582;BA.debugLine="Dim File2setExt As String = ListItemDocButton.Tag";
Debug.ShouldStop(32);
_file2setext = BA.ObjectToString(objectedit.mostCurrent._listitemdocbutton.runMethod(false,"getTag"));Debug.locals.put("File2setExt", _file2setext);Debug.locals.put("File2setExt", _file2setext);
 BA.debugLineNum = 583;BA.debugLine="If File2setExt.EndsWith(\"pdf\") Then";
Debug.ShouldStop(64);
if (_file2setext.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("pdf"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 584;BA.debugLine="ListItemDocButton.text = Chr(0xF1C1)";
Debug.ShouldStop(128);
objectedit.mostCurrent._listitemdocbutton.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1c1)))));
 }else 
{ BA.debugLineNum = 585;BA.debugLine="else if File2setExt.EndsWith (\"xls\") Or File2setE";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(".",_file2setext.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("xls")))) || RemoteObject.solveBoolean(".",_file2setext.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("xlsx"))))) { 
 BA.debugLineNum = 586;BA.debugLine="ListItemDocButton.Text = Chr(0xF1C3)";
Debug.ShouldStop(512);
objectedit.mostCurrent._listitemdocbutton.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1c3)))));
 }else 
{ BA.debugLineNum = 587;BA.debugLine="Else If File2setExt.EndsWith (\"doc\") Or File2setE";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",_file2setext.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("doc")))) || RemoteObject.solveBoolean(".",_file2setext.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("docx"))))) { 
 BA.debugLineNum = 588;BA.debugLine="ListItemDocButton.Text = Chr(0xF1C2)";
Debug.ShouldStop(2048);
objectedit.mostCurrent._listitemdocbutton.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1c2)))));
 }else 
{ BA.debugLineNum = 589;BA.debugLine="Else If File2setExt.EndsWith (\"jpg\") Or File2setE";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",_file2setext.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("jpg")))) || RemoteObject.solveBoolean(".",_file2setext.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("png"))))) { 
 BA.debugLineNum = 590;BA.debugLine="ListItemDocButton.Text = Chr(0xF1C5)";
Debug.ShouldStop(8192);
objectedit.mostCurrent._listitemdocbutton.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1c5)))));
 }else {
 BA.debugLineNum = 592;BA.debugLine="ListItemDocButton.Text = Chr(0xF016)";
Debug.ShouldStop(32768);
objectedit.mostCurrent._listitemdocbutton.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf016)))));
 }}}}
;
 BA.debugLineNum = 595;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(262144);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 596;BA.debugLine="Return p";
Debug.ShouldStop(524288);
if (true) return _p;
 BA.debugLineNum = 597;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdocumentsfromobject(RemoteObject _clear,RemoteObject _filter) throws Exception{
try {
		Debug.PushSubsStack("CreateDocumentsFromobject (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,523);
if (RapidSub.canDelegate("createdocumentsfromobject")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createdocumentsfromobject", _clear, _filter);}
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _itemscounter = RemoteObject.createImmutable(0);
RemoteObject _sql = RemoteObject.createImmutable("");
int _row = 0;
Debug.locals.put("Clear", _clear);
Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 523;BA.debugLine="Sub CreateDocumentsFromobject(Clear As Boolean, Fi";
Debug.ShouldStop(1024);
 BA.debugLineNum = 524;BA.debugLine="If Clear Then";
Debug.ShouldStop(2048);
if (_clear.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 525;BA.debugLine="listDocuments.Clear";
Debug.ShouldStop(4096);
objectedit.mostCurrent._listdocuments.runVoidMethod ("_clear");
 };
 BA.debugLineNum = 528;BA.debugLine="Dim height As Int = 70dip";
Debug.ShouldStop(32768);
_height = objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 529;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(65536);
if ((objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 530;BA.debugLine="height = 135dip";
Debug.ShouldStop(131072);
_height = objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 135)));Debug.locals.put("height", _height);
 };
 BA.debugLineNum = 532;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(524288);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 533;BA.debugLine="Dim ItemsCounter As Int = 0";
Debug.ShouldStop(1048576);
_itemscounter = BA.numberCast(int.class, 0);Debug.locals.put("ItemsCounter", _itemscounter);Debug.locals.put("ItemsCounter", _itemscounter);
 BA.debugLineNum = 545;BA.debugLine="Dim SQL As String = $\"${ DBStructures.EVC_SQL_OBJ";
Debug.ShouldStop(1);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._dbstructures._evc_sql_obj_documents /*RemoteObject*/ ))),RemoteObject.createImmutable("  WHERE o.tagcode='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 547;BA.debugLine="SQL = $\"${SQL} order by a.title\"$";
Debug.ShouldStop(4);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" order by a.title")));Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 548;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(8);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 549;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 550;BA.debugLine="Log(\"Docs:\" & Record.RowCount)";
Debug.ShouldStop(32);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6147521563",RemoteObject.concat(RemoteObject.createImmutable("Docs:"),_record.runMethod(true,"getRowCount")),0);
 BA.debugLineNum = 551;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(64);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step15 > 0 && _row <= limit15) || (step15 < 0 && _row >= limit15) ;_row = ((int)(0 + _row + step15))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 552;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(128);
_itemscounter = RemoteObject.solve(new RemoteObject[] {_itemscounter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ItemsCounter", _itemscounter);
 BA.debugLineNum = 553;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(256);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 554;BA.debugLine="listDocuments.Add( CreateDocumentListItem(Items";
Debug.ShouldStop(512);
objectedit.mostCurrent._listdocuments.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createdocumentlistitem(_itemscounter,_record,objectedit.mostCurrent._listdocuments.runMethod(false,"_asview").runMethod(true,"getWidth"),_height).getObject()),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("Row", _row);
;
 }else {
 BA.debugLineNum = 557;BA.debugLine="listDocuments.Add( CreateNoRecordListItem(ItemsC";
Debug.ShouldStop(4096);
objectedit.mostCurrent._listdocuments.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createnorecordlistitem(_itemscounter,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent.__c.getField(false,"Null")),objectedit.mostCurrent._listdocuments.runMethod(false,"_asview").runMethod(true,"getWidth"),RemoteObject.solve(new RemoteObject[] {_height,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)).getObject()),(Object)((RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 559;BA.debugLine="Record.Close";
Debug.ShouldStop(16384);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 560;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnorecordlistitem(RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateNoRecordListItem (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,599);
if (RapidSub.canDelegate("createnorecordlistitem")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createnorecordlistitem", _cnt, _colitems, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 599;BA.debugLine="Sub CreateNoRecordListItem(cnt As Int, colitems As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 600;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(8388608);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 601;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("Initialize",objectedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 602;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(33554432);
objectedit.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 603;BA.debugLine="p.LoadLayout(\"ItemNORecords\")";
Debug.ShouldStop(67108864);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemNORecords")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 604;BA.debugLine="p.RemoveView";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 605;BA.debugLine="listButRefresh.Tag = CurrentobjectTagcode";
Debug.ShouldStop(268435456);
objectedit.mostCurrent._listbutrefresh.runMethod(false,"setTag",(objectedit.mostCurrent._currentobjecttagcode));
 BA.debugLineNum = 606;BA.debugLine="Return p";
Debug.ShouldStop(536870912);
if (true) return _p;
 BA.debugLineNum = 607;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjectdetailsdata(RemoteObject _clear,RemoteObject _record) throws Exception{
try {
		Debug.PushSubsStack("CreateobjectDetailsData (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,770);
if (RapidSub.canDelegate("createobjectdetailsdata")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createobjectdetailsdata", _clear, _record);}
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
RemoteObject _rcontact = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _chapter1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _i = 0;
Debug.locals.put("clear", _clear);
Debug.locals.put("Record", _record);
 BA.debugLineNum = 770;BA.debugLine="Sub CreateobjectDetailsData(clear As Boolean, Reco";
Debug.ShouldStop(2);
 BA.debugLineNum = 771;BA.debugLine="If clear Then";
Debug.ShouldStop(4);
if (_clear.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 772;BA.debugLine="objectListView.Clear";
Debug.ShouldStop(8);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_clear" /*RemoteObject*/ );
 };
 BA.debugLineNum = 774;BA.debugLine="Dim idx As Int = objectListView.Size";
Debug.ShouldStop(32);
_idx = objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getsize" /*RemoteObject*/ );Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 775;BA.debugLine="If idx >0 Then idx = idx-1";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_idx,BA.numberCast(double.class, 0))) { 
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("idx", _idx);};
 BA.debugLineNum = 777;BA.debugLine="MakeAddressesFolder(idx, Record, \"Moradas\")";
Debug.ShouldStop(256);
_makeaddressesfolder(_idx,_record,RemoteObject.createImmutable("Moradas"));
 BA.debugLineNum = 778;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(512);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 780;BA.debugLine="Dim sSQL As String = $\"${DBStructures.EVC_SQL_CUR";
Debug.ShouldStop(2048);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._dbstructures._evc_sql_current_contacts /*RemoteObject*/ ))),RemoteObject.createImmutable("  where a.tagcode in (select contact_tagcode from dta_objects_contacts where object_tagcode='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._currentobjecttagcode))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 781;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(4096);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6147980299",_ssql,0);
 BA.debugLineNum = 782;BA.debugLine="Dim id As ItemData";
Debug.ShouldStop(8192);
_id = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.checklist3._itemdata");Debug.locals.put("id", _id);
 BA.debugLineNum = 783;BA.debugLine="id.Initialize";
Debug.ShouldStop(16384);
_id.runVoidMethod ("Initialize");
 BA.debugLineNum = 784;BA.debugLine="id.CollapsedHeight = 50dip";
Debug.ShouldStop(32768);
_id.setField ("CollapsedHeight" /*RemoteObject*/ ,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 785;BA.debugLine="Private rContact As Cursor";
Debug.ShouldStop(65536);
_rcontact = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("rContact", _rcontact);
 BA.debugLineNum = 786;BA.debugLine="rContact = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(131072);
_rcontact = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 787;BA.debugLine="If rContact.RowCount > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_rcontact.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 788;BA.debugLine="id.ExpandedHeight = 50dip + (rContact.RowCount *";
Debug.ShouldStop(524288);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),(RemoteObject.solve(new RemoteObject[] {_rcontact.runMethod(true,"getRowCount"),objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))}, "*",0, 1))}, "+",1, 1));
 BA.debugLineNum = 789;BA.debugLine="Dim chapter1 As B4XView = CreateChapter(Colors.G";
Debug.ShouldStop(1048576);
_chapter1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter1 = _createchapter(objectedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),objectedit.mostCurrent._sharecode._checklistdadosobjectocontactos /*RemoteObject*/ ,_id,_idx,objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),objectedit.mostCurrent.__c.getField(true,"False"));Debug.locals.put("chapter1", _chapter1);Debug.locals.put("chapter1", _chapter1);
 BA.debugLineNum = 790;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(2097152);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 792;BA.debugLine="For i=0 To rContact.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step19 = 1;
final int limit19 = RemoteObject.solve(new RemoteObject[] {_rcontact.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19) ;_i = ((int)(0 + _i + step19))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 793;BA.debugLine="rContact.Position = i";
Debug.ShouldStop(16777216);
_rcontact.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 794;BA.debugLine="MakeContactsFolder(idx, chapter1, rContact, id,";
Debug.ShouldStop(33554432);
_makecontactsfolder(_idx,_chapter1,_rcontact,_id,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))}, "*",0, 1)));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 797;BA.debugLine="id.ExpandedHeight = 50dip";
Debug.ShouldStop(268435456);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 798;BA.debugLine="Dim chapter1 As B4XView = CreateChapter(Colors.G";
Debug.ShouldStop(536870912);
_chapter1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter1 = _createchapter(objectedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),objectedit.mostCurrent._sharecode._checklistdadosobjectocontactos /*RemoteObject*/ ,_id,_idx,objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),objectedit.mostCurrent.__c.getField(true,"False"));Debug.locals.put("chapter1", _chapter1);Debug.locals.put("chapter1", _chapter1);
 BA.debugLineNum = 799;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(1073741824);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 };
 BA.debugLineNum = 801;BA.debugLine="rContact.Close";
Debug.ShouldStop(1);
_rcontact.runVoidMethod ("Close");
 BA.debugLineNum = 802;BA.debugLine="objectListView.Add(chapter1, id)";
Debug.ShouldStop(2);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_add" /*RemoteObject*/ ,(Object)(_chapter1),(Object)((_id)));
 BA.debugLineNum = 804;BA.debugLine="ExpandItem(1)";
Debug.ShouldStop(8);
_expanditem(BA.numberCast(int.class, 1));
 BA.debugLineNum = 808;BA.debugLine="Record.Close";
Debug.ShouldStop(128);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 809;BA.debugLine="Return idx";
Debug.ShouldStop(256);
if (true) return _idx;
 BA.debugLineNum = 810;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjectdetailsdataprop(RemoteObject _idx,RemoteObject _clear,RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("CreateobjectDetailsDataProp (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,812);
if (RapidSub.canDelegate("createobjectdetailsdataprop")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createobjectdetailsdataprop", _idx, _clear, _tagcode);}
Debug.locals.put("idx", _idx);
Debug.locals.put("clear", _clear);
Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 812;BA.debugLine="Sub CreateobjectDetailsDataProp(idx As Int, clear";
Debug.ShouldStop(2048);
 BA.debugLineNum = 814;BA.debugLine="objectPropertyListView.Clear";
Debug.ShouldStop(8192);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 821;BA.debugLine="MakePropertiesFolder(idx, Tagcode, ShareCode.chec";
Debug.ShouldStop(1048576);
_makepropertiesfolder(_idx,_tagcode,objectedit.mostCurrent._sharecode._checklistdadosobjectocamposobjecto /*RemoteObject*/ );
 BA.debugLineNum = 825;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjectsfromobject(RemoteObject _clear,RemoteObject _filter) throws Exception{
try {
		Debug.PushSubsStack("CreateObjectsFromObject (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,609);
if (RapidSub.canDelegate("createobjectsfromobject")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createobjectsfromobject", _clear, _filter);}
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _itemscounter = RemoteObject.createImmutable(0);
RemoteObject _sql = RemoteObject.createImmutable("");
int _row = 0;
Debug.locals.put("Clear", _clear);
Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 609;BA.debugLine="Sub CreateObjectsFromObject(Clear As Boolean, Filt";
Debug.ShouldStop(1);
 BA.debugLineNum = 610;BA.debugLine="If Clear Then";
Debug.ShouldStop(2);
if (_clear.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 611;BA.debugLine="listObjects.Clear";
Debug.ShouldStop(4);
objectedit.mostCurrent._listobjects.runVoidMethod ("_clear");
 };
 BA.debugLineNum = 614;BA.debugLine="Log(Filter)";
Debug.ShouldStop(32);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6147718149",_filter,0);
 BA.debugLineNum = 616;BA.debugLine="Dim height As Int = 85dip '65dip";
Debug.ShouldStop(128);
_height = objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 617;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(256);
if ((objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 618;BA.debugLine="height =  135dip";
Debug.ShouldStop(512);
_height = objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 135)));Debug.locals.put("height", _height);
 };
 BA.debugLineNum = 620;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(2048);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 621;BA.debugLine="Dim ItemsCounter As Int = 0";
Debug.ShouldStop(4096);
_itemscounter = BA.numberCast(int.class, 0);Debug.locals.put("ItemsCounter", _itemscounter);Debug.locals.put("ItemsCounter", _itemscounter);
 BA.debugLineNum = 622;BA.debugLine="Dim SQL As String = DBStructures.EVC_SQL_CURRENT_";
Debug.ShouldStop(8192);
_sql = objectedit.mostCurrent._dbstructures._evc_sql_current_objects /*RemoteObject*/ ;Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 623;BA.debugLine="If (Filter <> \"\") Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 624;BA.debugLine="SQL = $\"${SQL} where ${Filter}\"$";
Debug.ShouldStop(32768);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" where "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("")));Debug.locals.put("SQL", _sql);
 };
 BA.debugLineNum = 626;BA.debugLine="SQL = $\"${SQL} order by a.title_import\"$";
Debug.ShouldStop(131072);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" order by a.title_import")));Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 627;BA.debugLine="Log(SQL)";
Debug.ShouldStop(262144);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6147718162",_sql,0);
 BA.debugLineNum = 628;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(524288);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 629;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 630;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(2097152);
{
final int step19 = 1;
final int limit19 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step19 > 0 && _row <= limit19) || (step19 < 0 && _row >= limit19) ;_row = ((int)(0 + _row + step19))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 631;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(4194304);
_itemscounter = RemoteObject.solve(new RemoteObject[] {_itemscounter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ItemsCounter", _itemscounter);
 BA.debugLineNum = 632;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(8388608);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 633;BA.debugLine="listObjects.Add( CreateObjListItem(ItemsCounter";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._listobjects.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createobjlistitem(_itemscounter,_record,objectedit.mostCurrent._listobjects.runMethod(false,"_asview").runMethod(true,"getWidth"),_height).getObject()),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("Row", _row);
;
 }else {
 BA.debugLineNum = 636;BA.debugLine="listObjects.Add( CreateNoRecordListItem(ItemsCou";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._listobjects.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createnorecordlistitem(_itemscounter,_record,objectedit.mostCurrent._listobjects.runMethod(false,"_asview").runMethod(true,"getWidth"),RemoteObject.solve(new RemoteObject[] {_height,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)).getObject()),(Object)((RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 638;BA.debugLine="Record.Close";
Debug.ShouldStop(536870912);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 639;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjecttabs(RemoteObject _tobj) throws Exception{
try {
		Debug.PushSubsStack("CreateObjectTABS (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,364);
if (RapidSub.canDelegate("createobjecttabs")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createobjecttabs", _tobj);}
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tObj", _tobj);
 BA.debugLineNum = 364;BA.debugLine="Sub CreateObjectTABS(tObj As ObjectType)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 366;BA.debugLine="Dim Counter As Int = 2";
Debug.ShouldStop(8192);
_counter = BA.numberCast(int.class, 2);Debug.locals.put("Counter", _counter);Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 367;BA.debugLine="listsTabPanel.LoadLayout(\"object_generalView2\", S";
Debug.ShouldStop(16384);
objectedit.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("object_generalView2")),(Object)(BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutsgeral /*RemoteObject*/ )));
 BA.debugLineNum = 368;BA.debugLine="MenuPanelPagesTitle.Add(\"Geral\")";
Debug.ShouldStop(32768);
objectedit.mostCurrent._menupanelpagestitle.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Geral"))));
 BA.debugLineNum = 369;BA.debugLine="If tObj.isgroup = 1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_tobj.getField(true,"isgroup" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 370;BA.debugLine="Counter = Counter+1";
Debug.ShouldStop(131072);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 371;BA.debugLine="listsTabPanel.LoadLayout(\"objects_listview\", Sha";
Debug.ShouldStop(262144);
objectedit.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("objects_listview")),(Object)(BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutsrelacoes /*RemoteObject*/ )));
 BA.debugLineNum = 372;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(objectsL";
Debug.ShouldStop(524288);
objectedit.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objectedit.mostCurrent._objectslistviewpanel.getObject()));
 BA.debugLineNum = 373;BA.debugLine="MenuPanelPagesTitle.Add(\"Relações\")";
Debug.ShouldStop(1048576);
objectedit.mostCurrent._menupanelpagestitle.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Relações"))));
 };
 BA.debugLineNum = 376;BA.debugLine="objGV2LabelTipoObj.Text = ShareCode.checklistLabe";
Debug.ShouldStop(8388608);
objectedit.mostCurrent._objgv2labeltipoobj.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._checklistlabeltipoobjecto /*RemoteObject*/ ));
 BA.debugLineNum = 377;BA.debugLine="objGV2LabelCodInterno.Text = ShareCode.checklistL";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._objgv2labelcodinterno.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._checklistlabelcodigointernobjecto /*RemoteObject*/ ));
 BA.debugLineNum = 378;BA.debugLine="objGV2LabelObs.Text = ShareCode.checklistlFinalOb";
Debug.ShouldStop(33554432);
objectedit.mostCurrent._objgv2labelobs.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._checklistlfinalobshint /*RemoteObject*/ ));
 BA.debugLineNum = 379;BA.debugLine="objGV2LabelRef.text = ShareCode.checklistLabelRef";
Debug.ShouldStop(67108864);
objectedit.mostCurrent._objgv2labelref.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._checklistlabelreferenciaobjecto /*RemoteObject*/ ));
 BA.debugLineNum = 380;BA.debugLine="objGV2LabelRelacao.Text = \"Relacao\"";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._objgv2labelrelacao.runMethod(true,"setText",BA.ObjectToCharSequence("Relacao"));
 BA.debugLineNum = 395;BA.debugLine="If tObj.have_documents = 1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_tobj.getField(true,"have_documents" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 396;BA.debugLine="Counter = Counter+1";
Debug.ShouldStop(2048);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 397;BA.debugLine="MenuPanelPagesTitle.Add(\"Documentos\")";
Debug.ShouldStop(4096);
objectedit.mostCurrent._menupanelpagestitle.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Documentos"))));
 BA.debugLineNum = 398;BA.debugLine="If (Utils.isNullOrEmpty(tObj.doctemplate)) Then";
Debug.ShouldStop(8192);
if ((objectedit.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_tobj.getField(true,"doctemplate" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 399;BA.debugLine="listsTabPanel.LoadLayout(\"object_documentsView\"";
Debug.ShouldStop(16384);
objectedit.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("object_documentsView")),(Object)(BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutsdocumentos /*RemoteObject*/ )));
 BA.debugLineNum = 400;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(objects";
Debug.ShouldStop(32768);
objectedit.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objectedit.mostCurrent._objectsdocumentsviewpanel.getObject()));
 BA.debugLineNum = 401;BA.debugLine="LabelObjDocsDescritivo.Text = ShareCode.ObjLayo";
Debug.ShouldStop(65536);
objectedit.mostCurrent._labelobjdocsdescritivo.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutdocsdescritivo /*RemoteObject*/ ));
 BA.debugLineNum = 402;BA.debugLine="LabelObjDocsValidade.text = ShareCode.ObjLayout";
Debug.ShouldStop(131072);
objectedit.mostCurrent._labelobjdocsvalidade.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutdocsvalidade /*RemoteObject*/ ));
 BA.debugLineNum = 403;BA.debugLine="labelTypeObjectFilter.Text = ShareCode.ObjLayou";
Debug.ShouldStop(262144);
objectedit.mostCurrent._labeltypeobjectfilter.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutdocsdataalerta /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 406;BA.debugLine="listsTabPanel.LoadLayout(\"object_documentsViewV";
Debug.ShouldStop(2097152);
objectedit.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("object_documentsViewValidate")),(Object)(BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutsdocumentos /*RemoteObject*/ )));
 BA.debugLineNum = 407;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(objectD";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objectedit.mostCurrent._objectdocumentsviewpanel.getObject()));
 BA.debugLineNum = 408;BA.debugLine="LabelObjVVDescritivo.Text = ShareCode.ObjLayout";
Debug.ShouldStop(8388608);
objectedit.mostCurrent._labelobjvvdescritivo.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutdocsdescritivo /*RemoteObject*/ ));
 BA.debugLineNum = 409;BA.debugLine="LabelObjVVValidade.Text = ShareCode.ObjLayoutDo";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._labelobjvvvalidade.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutdocsvalidade /*RemoteObject*/ ));
 BA.debugLineNum = 410;BA.debugLine="LabelObjVVAccao.Text = ShareCode.ObjLayoutDocsD";
Debug.ShouldStop(33554432);
objectedit.mostCurrent._labelobjvvaccao.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutdocsdataalerta /*RemoteObject*/ ));
 BA.debugLineNum = 411;BA.debugLine="labelTypeObjectFilter.Text = ShareCode.ObjLayou";
Debug.ShouldStop(67108864);
objectedit.mostCurrent._labeltypeobjectfilter.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutdocsdataalerta /*RemoteObject*/ ));
 };
 };
 BA.debugLineNum = 415;BA.debugLine="listsTabPanel.LoadLayout(\"listviewlayout\", ShareC";
Debug.ShouldStop(1073741824);
objectedit.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("listviewlayout")),(Object)(BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._objlayoutsintervencoes /*RemoteObject*/ )));
 BA.debugLineNum = 416;BA.debugLine="MenuPanelPagesTitle.Add(\"Intervenções\")";
Debug.ShouldStop(-2147483648);
objectedit.mostCurrent._menupanelpagestitle.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Intervenções"))));
 BA.debugLineNum = 419;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(4);
if (objectedit.mostCurrent.__c.runMethod(true,"Not",(Object)(objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 420;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(l";
Debug.ShouldStop(8);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group36 = objectedit.mostCurrent._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._liststabpanel));
final int groupLen36 = group36.runMethod(true,"getSize").<Integer>get()
;int index36 = 0;
;
for (; index36 < groupLen36;index36++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group36.runMethod(false,"Get",index36));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 421;BA.debugLine="lbl.Width = 100%x / Counter";
Debug.ShouldStop(16);
_lbl.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {objectedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objectedit.mostCurrent.activityBA),_counter}, "/",0, 0)));
 }
}Debug.locals.put("lbl", _lbl);
;
 };
 BA.debugLineNum = 424;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
Debug.ShouldStop(128);
objectedit.mostCurrent._utils.runVoidMethod ("_maketabpaneleffect" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._colortabpanel),(Object)(objectedit.mostCurrent._consts._colormaindarker /*RemoteObject*/ ),(Object)(objectedit.mostCurrent._consts._colorsub /*RemoteObject*/ ));
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjlistitem(RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateObjListItem (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,641);
if (RapidSub.canDelegate("createobjlistitem")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","createobjlistitem", _cnt, _colitems, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _status_desc = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _latitude = RemoteObject.createImmutable("");
RemoteObject _longitude = RemoteObject.createImmutable("");
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _parent = RemoteObject.createImmutable("");
RemoteObject _parent_name = RemoteObject.createImmutable("");
RemoteObject _address = RemoteObject.createImmutable("");
RemoteObject _postalcode = RemoteObject.createImmutable("");
RemoteObject _typedesc = RemoteObject.createImmutable("");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _stat = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 641;BA.debugLine="Sub CreateObjListItem(cnt As Int, colitems As Curs";
Debug.ShouldStop(1);
 BA.debugLineNum = 642;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 643;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4);
_p.runVoidMethod ("Initialize",objectedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 644;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(8);
objectedit.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 645;BA.debugLine="p.LoadLayout(\"objects_itemView\")";
Debug.ShouldStop(16);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("objects_itemView")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 646;BA.debugLine="p.RemoveView";
Debug.ShouldStop(32);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 648;BA.debugLine="Dim status_desc As String = colitems.GetString(\"s";
Debug.ShouldStop(128);
_status_desc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_desc")));Debug.locals.put("status_desc", _status_desc);Debug.locals.put("status_desc", _status_desc);
 BA.debugLineNum = 650;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(512);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 651;BA.debugLine="Dim latitude As String = colitems.GetString(\"lati";
Debug.ShouldStop(1024);
_latitude = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("latitude")));Debug.locals.put("latitude", _latitude);Debug.locals.put("latitude", _latitude);
 BA.debugLineNum = 652;BA.debugLine="Dim longitude As String = colitems.GetString(\"lon";
Debug.ShouldStop(2048);
_longitude = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("longitude")));Debug.locals.put("longitude", _longitude);Debug.locals.put("longitude", _longitude);
 BA.debugLineNum = 653;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
Debug.ShouldStop(4096);
_status_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 654;BA.debugLine="Dim name As String = colitems.GetString(\"name\")";
Debug.ShouldStop(8192);
_name = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 655;BA.debugLine="Dim parent As String = colitems.GetString(\"parent";
Debug.ShouldStop(16384);
_parent = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("parent")));Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 656;BA.debugLine="Dim parent_name As String = colitems.GetString(\"p";
Debug.ShouldStop(32768);
_parent_name = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("parent_name")));Debug.locals.put("parent_name", _parent_name);Debug.locals.put("parent_name", _parent_name);
 BA.debugLineNum = 657;BA.debugLine="Dim address As String = colitems.GetString(\"addre";
Debug.ShouldStop(65536);
_address = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address")));Debug.locals.put("address", _address);Debug.locals.put("address", _address);
 BA.debugLineNum = 658;BA.debugLine="Dim postalcode As String = colitems.GetString(\"po";
Debug.ShouldStop(131072);
_postalcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("postal_code")));Debug.locals.put("postalcode", _postalcode);Debug.locals.put("postalcode", _postalcode);
 BA.debugLineNum = 659;BA.debugLine="Dim typedesc As String = colitems.GetString(\"type";
Debug.ShouldStop(262144);
_typedesc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("typedesc")));Debug.locals.put("typedesc", _typedesc);Debug.locals.put("typedesc", _typedesc);
 BA.debugLineNum = 660;BA.debugLine="Dim city As String = colitems.GetString(\"city\")";
Debug.ShouldStop(524288);
_city = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("city")));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 661;BA.debugLine="ListItemFullName.text = $\"#${cnt} - ${name}\"$";
Debug.ShouldStop(1048576);
objectedit.mostCurrent._listitemfullname.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("#"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt))),RemoteObject.createImmutable(" - "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 662;BA.debugLine="Dim stat As String = $\"${status_desc}\"$";
Debug.ShouldStop(2097152);
_stat = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status_desc))),RemoteObject.createImmutable("")));Debug.locals.put("stat", _stat);Debug.locals.put("stat", _stat);
 BA.debugLineNum = 663;BA.debugLine="ListItemReference.text = $\"${tagcode} - ${stat}\"$";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._listitemreference.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable(" - "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stat))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 664;BA.debugLine="ListItemReference.Tag = tagcode";
Debug.ShouldStop(8388608);
objectedit.mostCurrent._listitemreference.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 665;BA.debugLine="ListItemLocation.text = $\"${address}, ${postalcod";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._listitemlocation.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_address))),RemoteObject.createImmutable(", "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_postalcode))),RemoteObject.createImmutable(" "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_city))),RemoteObject.createImmutable(", "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_latitude))),RemoteObject.createImmutable("|"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_longitude))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 666;BA.debugLine="ListItemType.text = typedesc";
Debug.ShouldStop(33554432);
objectedit.mostCurrent._listitemtype.runMethod(true,"setText",BA.ObjectToCharSequence(_typedesc));
 BA.debugLineNum = 668;BA.debugLine="listButMap.Enabled = False";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._listbutmap.runMethod(true,"setEnabled",objectedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 669;BA.debugLine="listButMap.TextColor = Consts.ColorLightSilver";
Debug.ShouldStop(268435456);
objectedit.mostCurrent._listbutmap.runMethod(true,"setTextColor",objectedit.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 671;BA.debugLine="ListItemFullName.Tag = parent";
Debug.ShouldStop(1073741824);
objectedit.mostCurrent._listitemfullname.runMethod(false,"setTag",(_parent));
 BA.debugLineNum = 675;BA.debugLine="If (status_id = 0) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 676;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorGr";
Debug.ShouldStop(8);
objectedit.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objectedit.mostCurrent._consts._colorgray /*RemoteObject*/ );
 BA.debugLineNum = 677;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF088)";
Debug.ShouldStop(16);
objectedit.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf088)))));
 }else {
 BA.debugLineNum = 680;BA.debugLine="If (ObjRequests.IndexOf(tagcode) >= 0) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("g",objectedit.mostCurrent._objrequests.runMethod(true,"IndexOf",(Object)((_tagcode))),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 681;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorG";
Debug.ShouldStop(256);
objectedit.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objectedit.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 BA.debugLineNum = 682;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF017)";
Debug.ShouldStop(512);
objectedit.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf017)))));
 }else {
 BA.debugLineNum = 684;BA.debugLine="If (ObjRequestsNotToday.IndexOf(tagcode) >= 0)";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("g",objectedit.mostCurrent._objrequestsnottoday.runMethod(true,"IndexOf",(Object)((_tagcode))),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 685;BA.debugLine="ListItemTodayRequests.TextColor = Consts.Color";
Debug.ShouldStop(4096);
objectedit.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objectedit.mostCurrent._consts._colorblue /*RemoteObject*/ );
 BA.debugLineNum = 686;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF073)";
Debug.ShouldStop(8192);
objectedit.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf073)))));
 }else {
 BA.debugLineNum = 688;BA.debugLine="ListItemTodayRequests.Visible = False";
Debug.ShouldStop(32768);
objectedit.mostCurrent._listitemtodayrequests.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 };
 };
 };
 BA.debugLineNum = 693;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(1048576);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 695;BA.debugLine="Return p";
Debug.ShouldStop(4194304);
if (true) return _p;
 BA.debugLineNum = 696;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expanditem(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ExpandItem (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1167);
if (RapidSub.canDelegate("expanditem")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","expanditem", _index);}
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
Debug.locals.put("index", _index);
 BA.debugLineNum = 1167;BA.debugLine="Sub ExpandItem (index As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1168;BA.debugLine="Dim id As ItemData = objectListView.GetValue(inde";
Debug.ShouldStop(32768);
_id = (objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1169;BA.debugLine="objectListView.ResizeItem(index, id.ExpandedHeigh";
Debug.ShouldStop(65536);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_resizeitem" /*RemoteObject*/ ,(Object)(_index),(Object)(_id.getField(true,"ExpandedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 1170;BA.debugLine="objectListView.GetPanel(index).Tag = True";
Debug.ShouldStop(131072);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"setTag",(objectedit.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1172;BA.debugLine="If (pnlGroupCurrenIndex <> index) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("!",objectedit._pnlgroupcurrenindex,BA.numberCast(double.class, _index)))) { 
 BA.debugLineNum = 1175;BA.debugLine="objectListView.GetPanel(index).GetView(0).GetVie";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._types._collapse_icon /*RemoteObject*/ ));
 BA.debugLineNum = 1176;BA.debugLine="pnlGroupCurrenIndex = index";
Debug.ShouldStop(8388608);
objectedit._pnlgroupcurrenindex = _index;
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
public static RemoteObject  _expanditemprop(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ExpandItemProp (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1201);
if (RapidSub.canDelegate("expanditemprop")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","expanditemprop", _index);}
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
Debug.locals.put("index", _index);
 BA.debugLineNum = 1201;BA.debugLine="Sub ExpandItemProp(index As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1202;BA.debugLine="Dim id As ItemData = objectPropertyListView.GetVa";
Debug.ShouldStop(131072);
_id = (objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1203;BA.debugLine="objectPropertyListView.ResizeItem(index, id.Expan";
Debug.ShouldStop(262144);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_resizeitem" /*RemoteObject*/ ,(Object)(_index),(Object)(_id.getField(true,"ExpandedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 1204;BA.debugLine="objectPropertyListView.GetPanel(index).Tag = True";
Debug.ShouldStop(524288);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"setTag",(objectedit.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1206;BA.debugLine="If (pnlGroupCurrenPropIndex <> index) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("!",objectedit._pnlgroupcurrenpropindex,BA.numberCast(double.class, _index)))) { 
 BA.debugLineNum = 1207;BA.debugLine="objectPropertyListView.GetPanel(pnlGroupCurrenPr";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(objectedit._pnlgroupcurrenpropindex)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setColor",objectedit.mostCurrent._consts._nocolor /*RemoteObject*/ );
 BA.debugLineNum = 1208;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
Debug.ShouldStop(8388608);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setColor",objectedit.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 1209;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._types._collapse_icon /*RemoteObject*/ ));
 BA.debugLineNum = 1210;BA.debugLine="pnlGroupCurrenPropIndex = index";
Debug.ShouldStop(33554432);
objectedit._pnlgroupcurrenpropindex = _index;
 }else {
 BA.debugLineNum = 1212;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._types._collapse_icon /*RemoteObject*/ ));
 };
 BA.debugLineNum = 1214;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmissingdocument(RemoteObject _docname) throws Exception{
try {
		Debug.PushSubsStack("GetMissingDocument (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1388);
if (RapidSub.canDelegate("getmissingdocument")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","getmissingdocument", _docname);}
ResumableSub_GetMissingDocument rsub = new ResumableSub_GetMissingDocument(null,_docname);
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
public static class ResumableSub_GetMissingDocument extends BA.ResumableSub {
public ResumableSub_GetMissingDocument(xevolution.vrcg.devdemov2400.objectedit parent,RemoteObject _docname) {
this.parent = parent;
this._docname = _docname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objectedit parent;
RemoteObject _docname;
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetMissingDocument (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1388);
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
Debug.locals.put("DocName", _docname);
 BA.debugLineNum = 1390;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(8192);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 1391;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(16384);
_globalftp.runVoidMethod ("Initialize",objectedit.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1392;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(32768);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1393;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(65536);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1394;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 1395;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(262144);
_sf = _globalftp.runMethod(false,"DownloadFile",objectedit.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_docname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_docname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1396;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", objectedit.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objectedit", "getmissingdocument"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1398;BA.debugLine="If Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1399;BA.debugLine="Log($\"/docs/${DocName} : file was download succ";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6150077451",(RemoteObject.concat(RemoteObject.createImmutable("/docs/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_docname))),RemoteObject.createImmutable(" : file was download successfully"))),0);
 BA.debugLineNum = 1400;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(8388608);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 1401;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1403;BA.debugLine="Log($\"/docs/${DocName} : Error downloading file";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6150077455",(RemoteObject.concat(RemoteObject.createImmutable("/docs/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_docname))),RemoteObject.createImmutable(" : Error downloading file"))),0);
 BA.debugLineNum = 1404;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(134217728);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 1405;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 1408;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6150077460",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objectedit.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1409;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(1);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 1410;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1413;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",objectedit.processBA, e0.toString());}
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim xui As XUI";
objectedit.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonUserUnavailable As Button";
objectedit.mostCurrent._buttonuserunavailable = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private LabelAppInfo As Label";
objectedit.mostCurrent._labelappinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelCopyright As Label";
objectedit.mostCurrent._labelcopyright = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelDateTime As Label";
objectedit.mostCurrent._labeldatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LabelVersion As Label";
objectedit.mostCurrent._labelversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private listsButtonAdd As Button";
objectedit.mostCurrent._listsbuttonadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private listsButtonClose As Button";
objectedit.mostCurrent._listsbuttonclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private listsLabelInfo As Label";
objectedit.mostCurrent._listslabelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private listsTabPanel As TabStrip";
objectedit.mostCurrent._liststabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 28;BA.debugLine="Private mainLabelOptLists As Label";
objectedit.mostCurrent._mainlabeloptlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private objectListView As CustomListViewCollapse";
objectedit.mostCurrent._objectlistview = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.customlistviewcollapse");
 //BA.debugLineNum = 34;BA.debugLine="Private objectNotes As Label";
objectedit.mostCurrent._objectnotes = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private objectCode As Label";
objectedit.mostCurrent._objectcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private objectType As Label";
objectedit.mostCurrent._objecttype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private objectTagcode As Label";
objectedit.mostCurrent._objecttagcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private lblContactName As Label";
objectedit.mostCurrent._lblcontactname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private butContactEdit As Button";
objectedit.mostCurrent._butcontactedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private lblTypeContact As Label";
objectedit.mostCurrent._lbltypecontact = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private lblContactEmail As Label";
objectedit.mostCurrent._lblcontactemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private lblContactPhone As Label";
objectedit.mostCurrent._lblcontactphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private lblAddressType As Label";
objectedit.mostCurrent._lbladdresstype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private lblAddressName As Label";
objectedit.mostCurrent._lbladdressname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private lblAddressName2 As Label";
objectedit.mostCurrent._lbladdressname2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private lblAddressPostalCode As Label";
objectedit.mostCurrent._lbladdresspostalcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private lblAddressLatitude As Label";
objectedit.mostCurrent._lbladdresslatitude = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private lblAddressLongitude As Label";
objectedit.mostCurrent._lbladdresslongitude = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private lblAddressCity As Label";
objectedit.mostCurrent._lbladdresscity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private butAddressMap As Button";
objectedit.mostCurrent._butaddressmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private butAddressEdit As Button";
objectedit.mostCurrent._butaddressedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private lblPropertyValue As Label";
objectedit.mostCurrent._lblpropertyvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private butPropertyEdit As Button";
objectedit.mostCurrent._butpropertyedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private lblPropertyName As Label";
objectedit.mostCurrent._lblpropertyname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private pnlGroupExpanded As Panel";
objectedit.mostCurrent._pnlgroupexpanded = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private lblGroupTitle As Label";
objectedit.mostCurrent._lblgrouptitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private pnlCurrent As Panel";
objectedit.mostCurrent._pnlcurrent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private butGroupCollpseExpand As Button";
objectedit.mostCurrent._butgroupcollpseexpand = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private pnlGroupTitle As Panel";
objectedit.mostCurrent._pnlgrouptitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private CurrentGroupItem As Int = 0";
objectedit._currentgroupitem = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 80;BA.debugLine="Private CurrentGroupItemProp As Int = 0";
objectedit._currentgroupitemprop = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 81;BA.debugLine="Private pnlGroupCurrenIndex As Int";
objectedit._pnlgroupcurrenindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 82;BA.debugLine="Private pnlGroupCurrenPropIndex As Int";
objectedit._pnlgroupcurrenpropindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 87;BA.debugLine="Private objectContractName As Label";
objectedit.mostCurrent._objectcontractname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private objectContractStart As Label";
objectedit.mostCurrent._objectcontractstart = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private objectContractEnd As Label";
objectedit.mostCurrent._objectcontractend = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private objectContractDaysPeriod As Label";
objectedit.mostCurrent._objectcontractdaysperiod = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private objectContractDuration As Label";
objectedit.mostCurrent._objectcontractduration = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private objectContractDaysNotice As Label";
objectedit.mostCurrent._objectcontractdaysnotice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private w0,w1,w2,w3,w4,w5,w6,w7 As Button";
objectedit.mostCurrent._w0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._w1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._w2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._w3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._w4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._w5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._w6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._w7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d1";
objectedit.mostCurrent._d1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private d16,d17,d18,d19,d20,d30,d29,d28,d27,d26,d";
objectedit.mostCurrent._d16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d30 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d29 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d28 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d27 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d26 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private d22,d21,d31,d32,d33 As Button";
objectedit.mostCurrent._d22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d31 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d32 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
objectedit.mostCurrent._d33 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private contractPanel As Panel";
objectedit.mostCurrent._contractpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private TypePeriodicity As List";
objectedit.mostCurrent._typeperiodicity = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 99;BA.debugLine="Private TypeDayPeriod As List";
objectedit.mostCurrent._typedayperiod = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 104;BA.debugLine="Private butContractTask As Button";
objectedit.mostCurrent._butcontracttask = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private lblContractTask As Label";
objectedit.mostCurrent._lblcontracttask = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private objectContractHourPeriod As Label";
objectedit.mostCurrent._objectcontracthourperiod = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private objectContractHours As Label";
objectedit.mostCurrent._objectcontracthours = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private objectContractPeriod As Label";
objectedit.mostCurrent._objectcontractperiod = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private objectWHName As Label";
objectedit.mostCurrent._objectwhname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private objectWHItemsCheck As CustomListViewColla";
objectedit.mostCurrent._objectwhitemscheck = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.customlistviewcollapse");
 //BA.debugLineNum = 114;BA.debugLine="Private objectWHItemsTaken As CustomListViewColla";
objectedit.mostCurrent._objectwhitemstaken = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.customlistviewcollapse");
 //BA.debugLineNum = 117;BA.debugLine="Private CurrentAddressTagcode As String";
objectedit.mostCurrent._currentaddresstagcode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 118;BA.debugLine="Private CurrentobjectTagcode As String";
objectedit.mostCurrent._currentobjecttagcode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 119;BA.debugLine="Private TypeAddressList As List";
objectedit.mostCurrent._typeaddresslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 120;BA.debugLine="Private CurrentContactTagcode As String";
objectedit.mostCurrent._currentcontacttagcode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 121;BA.debugLine="Private TypeContactsList As List";
objectedit.mostCurrent._typecontactslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 126;BA.debugLine="Private listObjects As CustomListView";
objectedit.mostCurrent._listobjects = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 128;BA.debugLine="Private ListItemReference As Label";
objectedit.mostCurrent._listitemreference = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Private ListItemLocation As Label";
objectedit.mostCurrent._listitemlocation = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 136;BA.debugLine="Private noRecordsPanel As Panel";
objectedit.mostCurrent._norecordspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 137;BA.debugLine="Private noRecordsLabel As Label";
objectedit.mostCurrent._norecordslabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 138;BA.debugLine="Private listButRefresh As Button";
objectedit.mostCurrent._listbutrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 143;BA.debugLine="Private listDocuments As CustomListView";
objectedit.mostCurrent._listdocuments = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 144;BA.debugLine="Private ListItemDocButton As Label";
objectedit.mostCurrent._listitemdocbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 145;BA.debugLine="Private ListItemTitle As Label";
objectedit.mostCurrent._listitemtitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 146;BA.debugLine="Private ListItemCategory As Label";
objectedit.mostCurrent._listitemcategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 147;BA.debugLine="Private ListItemSDate As Label";
objectedit.mostCurrent._listitemsdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 148;BA.debugLine="Private ListItemEDate As Label";
objectedit.mostCurrent._listitemedate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 151;BA.debugLine="Private WareHousePanel As Panel";
objectedit.mostCurrent._warehousepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 152;BA.debugLine="Private ListItemFullName As Label";
objectedit.mostCurrent._listitemfullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 153;BA.debugLine="Private objectPropertyListView As CustomListViewC";
objectedit.mostCurrent._objectpropertylistview = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.customlistviewcollapse");
 //BA.debugLineNum = 154;BA.debugLine="Private pnlGroupTitle2 As Panel";
objectedit.mostCurrent._pnlgrouptitle2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 155;BA.debugLine="Private lblGroupTitle2 As Label";
objectedit.mostCurrent._lblgrouptitle2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 156;BA.debugLine="Private butGroupCollpseExpand2 As Button";
objectedit.mostCurrent._butgroupcollpseexpand2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 157;BA.debugLine="Private pnlGroupExpanded2 As Panel";
objectedit.mostCurrent._pnlgroupexpanded2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 158;BA.debugLine="Private butGroupCollpseExpandProp As Button";
objectedit.mostCurrent._butgroupcollpseexpandprop = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 159;BA.debugLine="Private lblGroupTitleProp As Label";
objectedit.mostCurrent._lblgrouptitleprop = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 160;BA.debugLine="Private pnlCurrentProp As Panel";
objectedit.mostCurrent._pnlcurrentprop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 161;BA.debugLine="Private pnlGroupExpandedProp As Panel";
objectedit.mostCurrent._pnlgroupexpandedprop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 162;BA.debugLine="Private pnlGroupTitleProp As Panel";
objectedit.mostCurrent._pnlgrouptitleprop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 164;BA.debugLine="Private ThisObjectType As ObjectType";
objectedit.mostCurrent._thisobjecttype = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._objecttype");
 //BA.debugLineNum = 165;BA.debugLine="Private ListItemType As Label";
objectedit.mostCurrent._listitemtype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 166;BA.debugLine="Private ListItemTodayRequests As Label";
objectedit.mostCurrent._listitemtodayrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 167;BA.debugLine="Private listButMap As Button";
objectedit.mostCurrent._listbutmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 168;BA.debugLine="Private ObjRequests, ObjRequestsNotToday As List";
objectedit.mostCurrent._objrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
objectedit.mostCurrent._objrequestsnottoday = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 169;BA.debugLine="Private ColorTabPanel As Panel";
objectedit.mostCurrent._colortabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 170;BA.debugLine="Private mainActiveUser As Label";
objectedit.mostCurrent._mainactiveuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 171;BA.debugLine="Private mainLogo As ImageView";
objectedit.mostCurrent._mainlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 173;BA.debugLine="Private objectsListViewPanel As Panel";
objectedit.mostCurrent._objectslistviewpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 174;BA.debugLine="Private objectsDocumentsViewPanel As Panel";
objectedit.mostCurrent._objectsdocumentsviewpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 175;BA.debugLine="Private objectDocumentsViewPanel As Panel";
objectedit.mostCurrent._objectdocumentsviewpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 177;BA.debugLine="Private MenuPanelButtonOne As Button";
objectedit.mostCurrent._menupanelbuttonone = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 178;BA.debugLine="Private MenuPanelButtomTwo As Button";
objectedit.mostCurrent._menupanelbuttomtwo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 179;BA.debugLine="Private MenuPanelButtonThree As Button";
objectedit.mostCurrent._menupanelbuttonthree = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 180;BA.debugLine="Private MenuPanelButtonFour As Button";
objectedit.mostCurrent._menupanelbuttonfour = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 181;BA.debugLine="Private MenuPanelButtonList As List";
objectedit.mostCurrent._menupanelbuttonlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 182;BA.debugLine="Private MenuPanelPagesTitle As List";
objectedit.mostCurrent._menupanelpagestitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 184;BA.debugLine="Private ButtonOneLayoutIndex As Int";
objectedit._buttononelayoutindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 185;BA.debugLine="Private ButtonOneLayoutTwo As Int";
objectedit._buttononelayouttwo = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 186;BA.debugLine="Private ButtonOneLayoutThree As Int";
objectedit._buttononelayoutthree = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 187;BA.debugLine="Private ButtonOneLayoutFour As Int";
objectedit._buttononelayoutfour = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 188;BA.debugLine="Private ObjectEditSelectedName As String";
objectedit.mostCurrent._objecteditselectedname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 189;BA.debugLine="private ObjectParent as String";
objectedit.mostCurrent._objectparent = RemoteObject.createImmutable("");
 //BA.debugLineNum = 191;BA.debugLine="Private Panel1 As Panel";
objectedit.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 192;BA.debugLine="Private MenuPanel As Panel";
objectedit.mostCurrent._menupanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 193;BA.debugLine="Private ShowImage As ImageView";
objectedit.mostCurrent._showimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 194;BA.debugLine="Private ImageFilename As Label";
objectedit.mostCurrent._imagefilename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 195;BA.debugLine="Private ImageStateName As Label";
objectedit.mostCurrent._imagestatename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 197;BA.debugLine="Private LabelObjDocsDescritivo As Label";
objectedit.mostCurrent._labelobjdocsdescritivo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 198;BA.debugLine="Private LabelObjDocsValidade As Label";
objectedit.mostCurrent._labelobjdocsvalidade = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 199;BA.debugLine="Private labelTypeObjectFilter As Label";
objectedit.mostCurrent._labeltypeobjectfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 200;BA.debugLine="Private LabelObjVVDescritivo As Label";
objectedit.mostCurrent._labelobjvvdescritivo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 201;BA.debugLine="Private LabelObjVVValidade As Label";
objectedit.mostCurrent._labelobjvvvalidade = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 202;BA.debugLine="Private LabelObjVVAccao As Label";
objectedit.mostCurrent._labelobjvvaccao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 203;BA.debugLine="Private objGV2LabelTipoObj As Label";
objectedit.mostCurrent._objgv2labeltipoobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 204;BA.debugLine="Private objGV2LabelCodInterno As Label";
objectedit.mostCurrent._objgv2labelcodinterno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 205;BA.debugLine="Private objGV2LabelObs As Label";
objectedit.mostCurrent._objgv2labelobs = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 206;BA.debugLine="Private objGV2LabelRef As Label";
objectedit.mostCurrent._objgv2labelref = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 210;BA.debugLine="Private ItemAddress_TipoMorada As Label";
objectedit.mostCurrent._itemaddress_tipomorada = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 211;BA.debugLine="Private ItemAddress_Endereco As Label";
objectedit.mostCurrent._itemaddress_endereco = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 212;BA.debugLine="Private ItemAddress_Continua As Label";
objectedit.mostCurrent._itemaddress_continua = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 213;BA.debugLine="Private ItemAddress_CPostal As Label";
objectedit.mostCurrent._itemaddress_cpostal = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 214;BA.debugLine="Private ItemAddress_Latitude As Label";
objectedit.mostCurrent._itemaddress_latitude = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 215;BA.debugLine="Private ItemAddress_Longitude As Label";
objectedit.mostCurrent._itemaddress_longitude = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 216;BA.debugLine="Private ItemAddress_Localidade As Label";
objectedit.mostCurrent._itemaddress_localidade = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 217;BA.debugLine="Private objGV2LabelRelacao As Label";
objectedit.mostCurrent._objgv2labelrelacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 218;BA.debugLine="Private ObjParent As Label";
objectedit.mostCurrent._objparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _groupcollpseexpand_click() throws Exception{
try {
		Debug.PushSubsStack("GroupCollpseExpand_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1139);
if (RapidSub.canDelegate("groupcollpseexpand_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","groupcollpseexpand_click");}
RemoteObject _this = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1139;BA.debugLine="Sub GroupCollpseExpand_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1140;BA.debugLine="Dim this As B4XView = Sender";
Debug.ShouldStop(524288);
_this = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_this = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), objectedit.mostCurrent.__c.runMethod(false,"Sender",objectedit.mostCurrent.activityBA));Debug.locals.put("this", _this);
 BA.debugLineNum = 1141;BA.debugLine="If (CurrentGroupItem <> this.Tag) Then CurrentGro";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("!",objectedit._currentgroupitem,BA.numberCast(double.class, _this.runMethod(false,"getTag"))))) { 
objectedit._currentgroupitem = BA.numberCast(int.class, _this.runMethod(false,"getTag"));};
 BA.debugLineNum = 1142;BA.debugLine="Dim p As B4XView = objectListView.GetPanel(Curren";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(objectedit._currentgroupitem));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1143;BA.debugLine="If p.Tag = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),(objectedit.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 1144;BA.debugLine="CollapseItem(CurrentGroupItem)";
Debug.ShouldStop(8388608);
_collapseitem(objectedit._currentgroupitem);
 }else {
 BA.debugLineNum = 1146;BA.debugLine="ExpandItem(CurrentGroupItem)";
Debug.ShouldStop(33554432);
_expanditem(objectedit._currentgroupitem);
 };
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
public static RemoteObject  _grouppropcollpseexpand_click() throws Exception{
try {
		Debug.PushSubsStack("GroupPropCollpseExpand_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1434);
if (RapidSub.canDelegate("grouppropcollpseexpand_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","grouppropcollpseexpand_click");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1434;BA.debugLine="Sub GroupPropCollpseExpand_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1436;BA.debugLine="Dim p As B4XView = objectPropertyListView.GetPane";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(objectedit._currentgroupitemprop));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1437;BA.debugLine="If p.Tag = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),(objectedit.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 1438;BA.debugLine="CollapseItemProp(CurrentGroupItemProp)";
Debug.ShouldStop(536870912);
_collapseitemprop(objectedit._currentgroupitemprop);
 }else {
 BA.debugLineNum = 1440;BA.debugLine="ExpandItemProp(CurrentGroupItemProp)";
Debug.ShouldStop(-2147483648);
_expanditemprop(objectedit._currentgroupitemprop);
 };
 BA.debugLineNum = 1442;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("listButRefresh_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1294);
if (RapidSub.canDelegate("listbutrefresh_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","listbutrefresh_click");}
 BA.debugLineNum = 1294;BA.debugLine="Sub listButRefresh_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1296;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listitemdocbutton_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemDocButton_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1342);
if (RapidSub.canDelegate("listitemdocbutton_click")) { xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","listitemdocbutton_click"); return;}
ResumableSub_ListItemDocButton_Click rsub = new ResumableSub_ListItemDocButton_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListItemDocButton_Click extends BA.ResumableSub {
public ResumableSub_ListItemDocButton_Click(xevolution.vrcg.devdemov2400.objectedit parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objectedit parent;
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _downloaded = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListItemDocButton_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1342);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1343;BA.debugLine="Dim b As Label = Sender";
Debug.ShouldStop(1073741824);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), parent.mostCurrent.__c.runMethod(false,"Sender",objectedit.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 1344;BA.debugLine="Dim FileName As String = b.tag";
Debug.ShouldStop(-2147483648);
_filename = BA.ObjectToString(_b.runMethod(false,"getTag"));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1345;BA.debugLine="Dim Continua As Boolean = False";
Debug.ShouldStop(1);
_continua = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 1346;BA.debugLine="Dim theFile As String = File.Combine(Starter.Inte";
Debug.ShouldStop(2);
_thefile = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 1353;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,FileNam";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 30;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 22;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1354;BA.debugLine="Dim result As Int";
Debug.ShouldStop(512);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1355;BA.debugLine="result = Msgbox2(ShareCode.userfilenoindentified";
Debug.ShouldStop(1024);
_result = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfilenoindentified /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),objectedit.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 1356;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1357;BA.debugLine="Dim res As ResumableSub = GetMissingDocument(Fi";
Debug.ShouldStop(4096);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _getmissingdocument(_filename);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1358;BA.debugLine="Wait For(res) Complete (Downloaded As Boolean)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objectedit.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objectedit", "listitemdocbutton_click"), _res);
this.state = 31;
return;
case 31:
//C
this.state = 7;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Downloaded", _downloaded);
;
 BA.debugLineNum = 1359;BA.debugLine="If(Downloaded) Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 19;
if ((_downloaded).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 18;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1360;BA.debugLine="Log($\"Missing File downloaded\"$)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6150011922",(RemoteObject.createImmutable("Missing File downloaded")),0);
 BA.debugLineNum = 1361;BA.debugLine="Log(theFile)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6150011923",_thefile,0);
 BA.debugLineNum = 1362;BA.debugLine="If File.Exists(Starter.InternalFolder, FileNam";
Debug.ShouldStop(131072);
if (true) break;

case 10:
//if
this.state = 13;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1363;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, S";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename));
 BA.debugLineNum = 1364;BA.debugLine="Continua = True";
Debug.ShouldStop(524288);
_continua = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);
 if (true) break;
;
 BA.debugLineNum = 1366;BA.debugLine="If Continua Then";
Debug.ShouldStop(2097152);

case 13:
//if
this.state = 16;
if (_continua.<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1367;BA.debugLine="Utils.ViewPDFFile(FileName)";
Debug.ShouldStop(4194304);
parent.mostCurrent._utils.runVoidMethod ("_viewpdffile" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_filename));
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1371;BA.debugLine="MsgboxAsync(ShareCode.userfileunavailable,Shar";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfileunavailable /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),objectedit.processBA);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 30;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1375;BA.debugLine="Log(theFile)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6150011937",_thefile,0);
 BA.debugLineNum = 1376;BA.debugLine="If File.Exists(Starter.InternalFolder, FileName)";
Debug.ShouldStop(-2147483648);
if (true) break;

case 23:
//if
this.state = 26;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1377;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, Sta";
Debug.ShouldStop(1);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename));
 BA.debugLineNum = 1378;BA.debugLine="Continua = True";
Debug.ShouldStop(2);
_continua = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);
 if (true) break;
;
 BA.debugLineNum = 1380;BA.debugLine="If Continua Then";
Debug.ShouldStop(8);

case 26:
//if
this.state = 29;
if (_continua.<Boolean>get().booleanValue()) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1381;BA.debugLine="Utils.ViewPDFFile(FileName)";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_viewpdffile" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_filename));
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 1384;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _downloaded) throws Exception{
}
public static void  _listitemtitle_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemTitle_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1298);
if (RapidSub.canDelegate("listitemtitle_click")) { xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","listitemtitle_click"); return;}
ResumableSub_ListItemTitle_Click rsub = new ResumableSub_ListItemTitle_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListItemTitle_Click extends BA.ResumableSub {
public ResumableSub_ListItemTitle_Click(xevolution.vrcg.devdemov2400.objectedit parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objectedit parent;
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _downloaded = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListItemTitle_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1298);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1299;BA.debugLine="Dim b As Label = Sender";
Debug.ShouldStop(262144);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), parent.mostCurrent.__c.runMethod(false,"Sender",objectedit.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 1300;BA.debugLine="Dim FileName As String = b.tag";
Debug.ShouldStop(524288);
_filename = BA.ObjectToString(_b.runMethod(false,"getTag"));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1301;BA.debugLine="Dim Continua As Boolean = False";
Debug.ShouldStop(1048576);
_continua = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 1302;BA.debugLine="Dim theFile As String = File.Combine(Starter.Inte";
Debug.ShouldStop(2097152);
_thefile = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 1309;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,FileNam";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 30;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 22;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1310;BA.debugLine="Dim result As Int";
Debug.ShouldStop(536870912);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1311;BA.debugLine="result = Msgbox2(ShareCode.userfilenoindentified";
Debug.ShouldStop(1073741824);
_result = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfilenoindentified /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),objectedit.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 1312;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1313;BA.debugLine="Dim res As ResumableSub = GetMissingDocument(Fi";
Debug.ShouldStop(1);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _getmissingdocument(_filename);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1314;BA.debugLine="Wait For(res) Complete (Downloaded As Boolean)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objectedit.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objectedit", "listitemtitle_click"), _res);
this.state = 31;
return;
case 31:
//C
this.state = 7;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Downloaded", _downloaded);
;
 BA.debugLineNum = 1315;BA.debugLine="If(Downloaded) Then";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 19;
if ((_downloaded).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 18;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1316;BA.debugLine="Log($\"Missing File downloaded\"$)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6149946386",(RemoteObject.createImmutable("Missing File downloaded")),0);
 BA.debugLineNum = 1317;BA.debugLine="Log(theFile)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6149946387",_thefile,0);
 BA.debugLineNum = 1318;BA.debugLine="If File.Exists(Starter.InternalFolder, FileNam";
Debug.ShouldStop(32);
if (true) break;

case 10:
//if
this.state = 13;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1319;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, S";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename));
 BA.debugLineNum = 1320;BA.debugLine="Continua = True";
Debug.ShouldStop(128);
_continua = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);
 if (true) break;
;
 BA.debugLineNum = 1322;BA.debugLine="If Continua Then";
Debug.ShouldStop(512);

case 13:
//if
this.state = 16;
if (_continua.<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1323;BA.debugLine="Utils.ViewPDFFile(FileName)";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_viewpdffile" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_filename));
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1327;BA.debugLine="MsgboxAsync(ShareCode.userfileunavailable,Shar";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfileunavailable /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),objectedit.processBA);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 30;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1331;BA.debugLine="Log(theFile)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6149946401",_thefile,0);
 BA.debugLineNum = 1332;BA.debugLine="If File.Exists(Starter.InternalFolder, FileName)";
Debug.ShouldStop(524288);
if (true) break;

case 23:
//if
this.state = 26;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1333;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, Sta";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename));
 BA.debugLineNum = 1334;BA.debugLine="Continua = True";
Debug.ShouldStop(2097152);
_continua = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);
 if (true) break;
;
 BA.debugLineNum = 1336;BA.debugLine="If Continua Then";
Debug.ShouldStop(8388608);

case 26:
//if
this.state = 29;
if (_continua.<Boolean>get().booleanValue()) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1337;BA.debugLine="Utils.ViewPDFFile(FileName)";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_viewpdffile" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_filename));
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 1340;BA.debugLine="End Sub";
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
public static RemoteObject  _listsbuttonadd_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonAdd_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1052);
if (RapidSub.canDelegate("listsbuttonadd_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","listsbuttonadd_click");}
 BA.debugLineNum = 1052;BA.debugLine="Sub listsButtonAdd_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1054;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("listsButtonClose_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1040);
if (RapidSub.canDelegate("listsbuttonclose_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","listsbuttonclose_click");}
 BA.debugLineNum = 1040;BA.debugLine="Sub listsButtonClose_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1041;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(65536);
if ((objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1042;BA.debugLine="If(PhoneBackButtonTab) Then";
Debug.ShouldStop(131072);
if ((_phonebackbuttontab()).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1043;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 1047;BA.debugLine="CallSubDelayed2(Objects, \"EditReturn\", \"\")";
Debug.ShouldStop(4194304);
objectedit.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",objectedit.processBA,(Object)((objectedit.mostCurrent._objects.getObject())),(Object)(BA.ObjectToString("EditReturn")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1048;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
objectedit.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1049;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
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
public static RemoteObject  _liststabpanel_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1473);
if (RapidSub.canDelegate("liststabpanel_pageselected")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","liststabpanel_pageselected", _position);}
RemoteObject _title = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1473;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1474;BA.debugLine="If(ShareCode.ISPHONE And MenuPanel.Visible = Fals";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean(".",objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",objectedit.mostCurrent._menupanel.runMethod(true,"getVisible"),objectedit.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 1475;BA.debugLine="Dim title As String";
Debug.ShouldStop(4);
_title = RemoteObject.createImmutable("");Debug.locals.put("title", _title);
 BA.debugLineNum = 1476;BA.debugLine="title = MenuPanelPagesTitle.Get(Position)";
Debug.ShouldStop(8);
_title = BA.ObjectToString(objectedit.mostCurrent._menupanelpagestitle.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("title", _title);
 BA.debugLineNum = 1477;BA.debugLine="mainLabelOptLists.Text = title";
Debug.ShouldStop(16);
objectedit.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 };
 BA.debugLineNum = 1490;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("mainLogo_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1415);
if (RapidSub.canDelegate("mainlogo_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","mainlogo_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1415;BA.debugLine="Sub mainLogo_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 1416;BA.debugLine="Dim i As Int";
Debug.ShouldStop(128);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1417;BA.debugLine="i = Msgbox2(\"Deseja voltar directamente para o in";
Debug.ShouldStop(256);
_i = objectedit.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Deseja voltar directamente para o início?")),(Object)(BA.ObjectToCharSequence("Alerta!")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent.__c.getField(false,"Null"))),objectedit.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1418;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, objectedit.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1419;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
Debug.ShouldStop(1024);
objectedit.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",objectedit.processBA,(Object)((objectedit.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturn")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1420;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
objectedit.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1421;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\"";
Debug.ShouldStop(4096);
objectedit.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 };
 BA.debugLineNum = 1423;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeaddressesfolder(RemoteObject _idx,RemoteObject _record,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("MakeAddressesFolder (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,845);
if (RapidSub.canDelegate("makeaddressesfolder")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","makeaddressesfolder", _idx, _record, _title);}
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
RemoteObject _chapter = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("idx", _idx);
Debug.locals.put("Record", _record);
Debug.locals.put("title", _title);
 BA.debugLineNum = 845;BA.debugLine="Sub MakeAddressesFolder(idx As Int, Record As Curs";
Debug.ShouldStop(4096);
 BA.debugLineNum = 846;BA.debugLine="Dim id As ItemData";
Debug.ShouldStop(8192);
_id = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.checklist3._itemdata");Debug.locals.put("id", _id);
 BA.debugLineNum = 847;BA.debugLine="id.Initialize";
Debug.ShouldStop(16384);
_id.runVoidMethod ("Initialize");
 BA.debugLineNum = 848;BA.debugLine="id.CollapsedHeight = 50dip";
Debug.ShouldStop(32768);
_id.setField ("CollapsedHeight" /*RemoteObject*/ ,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 849;BA.debugLine="id.ExpandedHeight = 50dip + 225dip";
Debug.ShouldStop(65536);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 225)))}, "+",1, 1));
 BA.debugLineNum = 850;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gra";
Debug.ShouldStop(131072);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapter(objectedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),_title,_id,_idx,objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),objectedit.mostCurrent.__c.getField(true,"False"));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 851;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 852;BA.debugLine="p.Initialize(\"GroupLineClick\")";
Debug.ShouldStop(524288);
_p.runVoidMethod ("Initialize",objectedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("GroupLineClick")));
 BA.debugLineNum = 853;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, 275dip)";
Debug.ShouldStop(1048576);
objectedit.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objectedit.mostCurrent.activityBA)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 275)))));
 BA.debugLineNum = 854;BA.debugLine="p.LoadLayout(\"ItemAddress\")'3pontinhos objectos (";
Debug.ShouldStop(2097152);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemAddress")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 856;BA.debugLine="ItemAddress_TipoMorada.text = ShareCode.ItemAddre";
Debug.ShouldStop(8388608);
objectedit.mostCurrent._itemaddress_tipomorada.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._itemaddresstipomorada /*RemoteObject*/ ));
 BA.debugLineNum = 857;BA.debugLine="ItemAddress_Endereco.text = ShareCode.ItemAddress";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._itemaddress_endereco.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._itemaddressendereco /*RemoteObject*/ ));
 BA.debugLineNum = 858;BA.debugLine="ItemAddress_Continua.text = ShareCode.ItemAddress";
Debug.ShouldStop(33554432);
objectedit.mostCurrent._itemaddress_continua.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._itemaddresscontinua /*RemoteObject*/ ));
 BA.debugLineNum = 859;BA.debugLine="ItemAddress_CPostal.text = ShareCode.ItemAddressC";
Debug.ShouldStop(67108864);
objectedit.mostCurrent._itemaddress_cpostal.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._itemaddresscpostal /*RemoteObject*/ ));
 BA.debugLineNum = 860;BA.debugLine="ItemAddress_Latitude.text = ShareCode.ItemAddress";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._itemaddress_latitude.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._itemaddresslatitude /*RemoteObject*/ ));
 BA.debugLineNum = 861;BA.debugLine="ItemAddress_Longitude.text = ShareCode.ItemAddres";
Debug.ShouldStop(268435456);
objectedit.mostCurrent._itemaddress_longitude.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._itemaddresslongitude /*RemoteObject*/ ));
 BA.debugLineNum = 862;BA.debugLine="ItemAddress_Localidade.text = ShareCode.ItemAddre";
Debug.ShouldStop(536870912);
objectedit.mostCurrent._itemaddress_localidade.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._sharecode._itemaddresslocalidade /*RemoteObject*/ ));
 BA.debugLineNum = 864;BA.debugLine="p.RemoveView";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 865;BA.debugLine="p.Tag = idx";
Debug.ShouldStop(1);
_p.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 866;BA.debugLine="lblAddressName.Text = Record.GetString(\"address\")";
Debug.ShouldStop(2);
objectedit.mostCurrent._lbladdressname.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address")))));
 BA.debugLineNum = 867;BA.debugLine="lblAddressName2.Text = Record.GetString(\"address2";
Debug.ShouldStop(4);
objectedit.mostCurrent._lbladdressname2.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address2")))));
 BA.debugLineNum = 868;BA.debugLine="lblAddressPostalCode.Text = Record.GetString(\"pos";
Debug.ShouldStop(8);
objectedit.mostCurrent._lbladdresspostalcode.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("postal_code")))));
 BA.debugLineNum = 869;BA.debugLine="lblAddressCity.Text = Record.GetString(\"city\")";
Debug.ShouldStop(16);
objectedit.mostCurrent._lbladdresscity.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("city")))));
 BA.debugLineNum = 870;BA.debugLine="lblAddressLatitude.Text = Record.GetString(\"latit";
Debug.ShouldStop(32);
objectedit.mostCurrent._lbladdresslatitude.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 871;BA.debugLine="lblAddressLongitude.Text = Record.GetString(\"long";
Debug.ShouldStop(64);
objectedit.mostCurrent._lbladdresslongitude.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 872;BA.debugLine="lblAddressType.Text = \"Sede/Facturação\"";
Debug.ShouldStop(128);
objectedit.mostCurrent._lbladdresstype.runMethod(true,"setText",BA.ObjectToCharSequence("Sede/Facturação"));
 BA.debugLineNum = 873;BA.debugLine="butAddressEdit.Tag = Record.GetString(\"local\")";
Debug.ShouldStop(256);
objectedit.mostCurrent._butaddressedit.runMethod(false,"setTag",(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("local")))));
 BA.debugLineNum = 874;BA.debugLine="butAddressMap.Tag = Record.GetString(\"local\")";
Debug.ShouldStop(512);
objectedit.mostCurrent._butaddressmap.runMethod(false,"setTag",(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("local")))));
 BA.debugLineNum = 875;BA.debugLine="pnlGroupExpanded.AddView(p, 0, 0, 100%x, 225dip)";
Debug.ShouldStop(1024);
objectedit.mostCurrent._pnlgroupexpanded.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objectedit.mostCurrent.activityBA)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 225)))));
 BA.debugLineNum = 877;BA.debugLine="objectListView.Add(chapter, id)";
Debug.ShouldStop(4096);
objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 878;BA.debugLine="ExpandItem(idx)";
Debug.ShouldStop(8192);
_expanditem(_idx);
 BA.debugLineNum = 880;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecontactsfolder(RemoteObject _idx,RemoteObject _chapter1,RemoteObject _record,RemoteObject _id,RemoteObject _top) throws Exception{
try {
		Debug.PushSubsStack("MakeContactsFolder (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,827);
if (RapidSub.canDelegate("makecontactsfolder")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","makecontactsfolder", _idx, _chapter1, _record, _id, _top);}
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("idx", _idx);
Debug.locals.put("chapter1", _chapter1);
Debug.locals.put("Record", _record);
Debug.locals.put("id", _id);
Debug.locals.put("top", _top);
 BA.debugLineNum = 827;BA.debugLine="Sub MakeContactsFolder(idx As Int, chapter1 As B4X";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 829;BA.debugLine="Dim p1 As Panel";
Debug.ShouldStop(268435456);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 830;BA.debugLine="p1.Initialize(\"GroupLineClick\")";
Debug.ShouldStop(536870912);
_p1.runVoidMethod ("Initialize",objectedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("GroupLineClick")));
 BA.debugLineNum = 831;BA.debugLine="Activity.AddView(p1, 0, 0, 100%x, 200dip)";
Debug.ShouldStop(1073741824);
objectedit.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objectedit.mostCurrent.activityBA)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 832;BA.debugLine="p1.LoadLayout(\"ItemContact\")'3pontinhos objectos";
Debug.ShouldStop(-2147483648);
_p1.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemContact")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 833;BA.debugLine="p1.RemoveView";
Debug.ShouldStop(1);
_p1.runVoidMethod ("RemoveView");
 BA.debugLineNum = 834;BA.debugLine="p1.Tag = idx";
Debug.ShouldStop(2);
_p1.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 835;BA.debugLine="lblContactName.Text = Record.GetString(\"name\")";
Debug.ShouldStop(4);
objectedit.mostCurrent._lblcontactname.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 836;BA.debugLine="lblContactPhone.Text = Record.GetString(\"phone\")";
Debug.ShouldStop(8);
objectedit.mostCurrent._lblcontactphone.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("phone")))));
 BA.debugLineNum = 837;BA.debugLine="lblContactEmail.Text = Record.GetString(\"email\")";
Debug.ShouldStop(16);
objectedit.mostCurrent._lblcontactemail.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("email")))));
 BA.debugLineNum = 838;BA.debugLine="lblTypeContact.Text = Record.GetString(\"typedesc\"";
Debug.ShouldStop(32);
objectedit.mostCurrent._lbltypecontact.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("typedesc")))));
 BA.debugLineNum = 840;BA.debugLine="butContactEdit.Tag = Record.GetString(\"tagcode\")";
Debug.ShouldStop(128);
objectedit.mostCurrent._butcontactedit.runMethod(false,"setTag",(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))));
 BA.debugLineNum = 841;BA.debugLine="pnlGroupExpanded.AddView(p1, 0, top, p1.Width, 20";
Debug.ShouldStop(256);
objectedit.mostCurrent._pnlgroupexpanded.runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(_p1.runMethod(true,"getWidth")),(Object)(objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 843;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makepropertiesfolder(RemoteObject _idx,RemoteObject _tagcode,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("MakePropertiesFolder (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,883);
if (RapidSub.canDelegate("makepropertiesfolder")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","makepropertiesfolder", _idx, _tagcode, _title);}
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
RemoteObject _expandthis = RemoteObject.createImmutable(false);
RemoteObject _record2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _chapter = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _btm = RemoteObject.createImmutable("");
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _fileok = RemoteObject.createImmutable(false);
Debug.locals.put("idx", _idx);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
 BA.debugLineNum = 883;BA.debugLine="Sub MakePropertiesFolder(idx As Int, tagcode As St";
Debug.ShouldStop(262144);
 BA.debugLineNum = 884;BA.debugLine="Dim id As ItemData";
Debug.ShouldStop(524288);
_id = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.checklist3._itemdata");Debug.locals.put("id", _id);
 BA.debugLineNum = 885;BA.debugLine="id.Initialize";
Debug.ShouldStop(1048576);
_id.runVoidMethod ("Initialize");
 BA.debugLineNum = 886;BA.debugLine="id.CollapsedHeight = 50dip";
Debug.ShouldStop(2097152);
_id.setField ("CollapsedHeight" /*RemoteObject*/ ,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 887;BA.debugLine="Dim ExpandThis As Boolean = False";
Debug.ShouldStop(4194304);
_expandthis = objectedit.mostCurrent.__c.getField(true,"False");Debug.locals.put("ExpandThis", _expandthis);Debug.locals.put("ExpandThis", _expandthis);
 BA.debugLineNum = 889;BA.debugLine="Private Record2 As Cursor";
Debug.ShouldStop(16777216);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 891;BA.debugLine="Dim SQL As String = $\"${DBStructures.EVC_QL_CURRE";
Debug.ShouldStop(67108864);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._dbstructures._evc_ql_current_objects_properties /*RemoteObject*/ ))),RemoteObject.createImmutable(" and a.object_tagcode='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 892;BA.debugLine="Log(SQL)";
Debug.ShouldStop(134217728);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6148242441",_sql,0);
 BA.debugLineNum = 893;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(268435456);
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 894;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 895;BA.debugLine="Dim row As Int = 0";
Debug.ShouldStop(1073741824);
_row = BA.numberCast(int.class, 0);Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 896;BA.debugLine="id.ExpandedHeight = 50dip + (60dip * Record2.Row";
Debug.ShouldStop(-2147483648);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),(RemoteObject.solve(new RemoteObject[] {objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))),_record2.runMethod(true,"getRowCount")}, "*",0, 1))}, "+",1, 1));
 BA.debugLineNum = 897;BA.debugLine="Dim chapter As B4XView = CreateChapterProp(Color";
Debug.ShouldStop(1);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapterprop(objectedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),_title,_id,_idx,objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),objectedit.mostCurrent.__c.getField(true,"False"));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 898;BA.debugLine="ExpandThis = True";
Debug.ShouldStop(2);
_expandthis = objectedit.mostCurrent.__c.getField(true,"True");Debug.locals.put("ExpandThis", _expandthis);
 BA.debugLineNum = 899;BA.debugLine="For i=0 To Record2.RowCount-1";
Debug.ShouldStop(4);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_record2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 900;BA.debugLine="Record2.Position = row";
Debug.ShouldStop(8);
_record2.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 902;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 903;BA.debugLine="p.Initialize( \"GroupLineClickProp\")";
Debug.ShouldStop(64);
_p.runVoidMethod ("Initialize",objectedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("GroupLineClickProp")));
 BA.debugLineNum = 904;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, id.ExpandedHei";
Debug.ShouldStop(128);
objectedit.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objectedit.mostCurrent.activityBA)),(Object)(_id.getField(true,"ExpandedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 905;BA.debugLine="p.LoadLayout(\"ItemProperty\") '3pontinhos object";
Debug.ShouldStop(256);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemProperty")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 906;BA.debugLine="p.RemoveView";
Debug.ShouldStop(512);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 907;BA.debugLine="p.Tag = idx";
Debug.ShouldStop(1024);
_p.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 908;BA.debugLine="lblPropertyValue.Text = Record2.GetString(\"valu";
Debug.ShouldStop(2048);
objectedit.mostCurrent._lblpropertyvalue.runMethod(true,"setText",BA.ObjectToCharSequence(_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value")))));
 BA.debugLineNum = 909;BA.debugLine="lblPropertyName.Text = Record2.GetString(\"title";
Debug.ShouldStop(4096);
objectedit.mostCurrent._lblpropertyname.runMethod(true,"setText",BA.ObjectToCharSequence(_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))));
 BA.debugLineNum = 910;BA.debugLine="lblPropertyName.tag = Record2.GetString(\"object";
Debug.ShouldStop(8192);
objectedit.mostCurrent._lblpropertyname.runMethod(false,"setTag",(_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("object_tagcode")))));
 BA.debugLineNum = 911;BA.debugLine="butPropertyEdit.tag = Record2.GetString(\"field_";
Debug.ShouldStop(16384);
objectedit.mostCurrent._butpropertyedit.runMethod(false,"setTag",(_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("field_tagcode")))));
 BA.debugLineNum = 912;BA.debugLine="Dim Height As Int = ((i+1)*60dip)-60dip";
Debug.ShouldStop(32768);
_height = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "*",0, 1)),objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "-",1, 1);Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 913;BA.debugLine="pnlGroupExpandedProp.AddView(p, 0, Height, 100%";
Debug.ShouldStop(65536);
objectedit.mostCurrent._pnlgroupexpandedprop.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_height),(Object)(objectedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objectedit.mostCurrent.activityBA)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 914;BA.debugLine="row = row +1";
Debug.ShouldStop(131072);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 917;BA.debugLine="id.ExpandedHeight = 50dip";
Debug.ShouldStop(1048576);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 918;BA.debugLine="Dim chapter As B4XView = CreateChapterProp(Color";
Debug.ShouldStop(2097152);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapterprop(objectedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),_title,_id,_idx,objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),objectedit.mostCurrent.__c.getField(true,"False"));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 };
 BA.debugLineNum = 920;BA.debugLine="Record2.Close";
Debug.ShouldStop(8388608);
_record2.runVoidMethod ("Close");
 BA.debugLineNum = 922;BA.debugLine="objectPropertyListView.Add(chapter, id)";
Debug.ShouldStop(33554432);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 923;BA.debugLine="If ExpandThis Then ExpandItemProp(idx)";
Debug.ShouldStop(67108864);
if (_expandthis.<Boolean>get().booleanValue()) { 
_expanditemprop(_idx);};
 BA.debugLineNum = 928;BA.debugLine="idx = idx+1";
Debug.ShouldStop(-2147483648);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 929;BA.debugLine="Dim id As ItemData";
Debug.ShouldStop(1);
_id = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.checklist3._itemdata");Debug.locals.put("id", _id);
 BA.debugLineNum = 930;BA.debugLine="id.Initialize";
Debug.ShouldStop(2);
_id.runVoidMethod ("Initialize");
 BA.debugLineNum = 931;BA.debugLine="id.CollapsedHeight = 50dip";
Debug.ShouldStop(4);
_id.setField ("CollapsedHeight" /*RemoteObject*/ ,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 932;BA.debugLine="Dim ExpandThis As Boolean = False";
Debug.ShouldStop(8);
_expandthis = objectedit.mostCurrent.__c.getField(true,"False");Debug.locals.put("ExpandThis", _expandthis);Debug.locals.put("ExpandThis", _expandthis);
 BA.debugLineNum = 934;BA.debugLine="Private Record2 As Cursor";
Debug.ShouldStop(32);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 938;BA.debugLine="Dim SQL As String = $\"select 1 as child, object_t";
Debug.ShouldStop(512);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select 1 as child, object_tagcode as tagcode, image, filename, title, sess_user, created_at\n"),RemoteObject.createImmutable("						from dta_objects_images where object_tagcode='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and (filename is not null and filename<>'')\n"),RemoteObject.createImmutable("						union\n"),RemoteObject.createImmutable("						select 0 as child, tagcode, image, filename, title_import as title, '' as sess_user, created_at\n"),RemoteObject.createImmutable("						from dta_objects where tagcode='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and (filename is not null and filename<>'')\n"),RemoteObject.createImmutable("						order by child")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 944;BA.debugLine="Log(SQL)";
Debug.ShouldStop(32768);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6148242493",_sql,0);
 BA.debugLineNum = 945;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(65536);
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 946;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 947;BA.debugLine="Dim row As Int = 0";
Debug.ShouldStop(262144);
_row = BA.numberCast(int.class, 0);Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 948;BA.debugLine="id.ExpandedHeight = 50dip + (130dip * Record2.Ro";
Debug.ShouldStop(524288);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),(RemoteObject.solve(new RemoteObject[] {objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_record2.runMethod(true,"getRowCount")}, "*",0, 1))}, "+",1, 1));
 BA.debugLineNum = 949;BA.debugLine="Dim chapter As B4XView = CreateChapterProp(Color";
Debug.ShouldStop(1048576);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapterprop(objectedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),BA.ObjectToString("Galeria"),_id,_idx,objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),objectedit.mostCurrent.__c.getField(true,"False"));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 BA.debugLineNum = 950;BA.debugLine="ExpandThis = True";
Debug.ShouldStop(2097152);
_expandthis = objectedit.mostCurrent.__c.getField(true,"True");Debug.locals.put("ExpandThis", _expandthis);
 BA.debugLineNum = 951;BA.debugLine="For i=0 To Record2.RowCount-1";
Debug.ShouldStop(4194304);
{
final int step51 = 1;
final int limit51 = RemoteObject.solve(new RemoteObject[] {_record2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51) ;_i = ((int)(0 + _i + step51))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 952;BA.debugLine="Record2.Position = i";
Debug.ShouldStop(8388608);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 954;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 955;BA.debugLine="p.Initialize( \"\")";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("Initialize",objectedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 956;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, 130dip)";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objectedit.mostCurrent.activityBA)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 957;BA.debugLine="p.LoadLayout(\"ItemImageGallery\")";
Debug.ShouldStop(268435456);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemImageGallery")),objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 958;BA.debugLine="p.RemoveView";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 959;BA.debugLine="p.Tag = idx";
Debug.ShouldStop(1073741824);
_p.runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 961;BA.debugLine="Dim Filename As String = Utils.IfNullOrEmpty(Re";
Debug.ShouldStop(1);
_filename = objectedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("filename")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Filename", _filename);Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 962;BA.debugLine="Dim btm As String = Utils.IfNullOrEmpty(Record2";
Debug.ShouldStop(2);
_btm = objectedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("image")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("btm", _btm);Debug.locals.put("btm", _btm);
 BA.debugLineNum = 963;BA.debugLine="Dim created_at As String = Utils.IfNullOrEmpty(";
Debug.ShouldStop(4);
_created_at = objectedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("created_at")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 964;BA.debugLine="Dim FileOK As Boolean = True";
Debug.ShouldStop(8);
_fileok = objectedit.mostCurrent.__c.getField(true,"True");Debug.locals.put("FileOK", _fileok);Debug.locals.put("FileOK", _fileok);
 BA.debugLineNum = 966;BA.debugLine="If Utils.NNE(Filename) Then";
Debug.ShouldStop(32);
if (objectedit.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 967;BA.debugLine="If File.Exists(Starter.InternalFolder, Filenam";
Debug.ShouldStop(64);
if (objectedit.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(objectedit.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 968;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 969;BA.debugLine="ShowImage.SetBackgroundImage(LoadBitmapSampl";
Debug.ShouldStop(256);
objectedit.mostCurrent._showimage.runVoidMethod ("SetBackgroundImageNew",(Object)((objectedit.mostCurrent.__c.runMethod(false,"LoadBitmapSample",(Object)(objectedit.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(objectedit.mostCurrent._showimage.runMethod(true,"getWidth")),(Object)(objectedit.mostCurrent._showimage.runMethod(true,"getHeight"))).getObject())));
 BA.debugLineNum = 970;BA.debugLine="ShowImage.Tag = Types.MakeImageViewData(btm,";
Debug.ShouldStop(512);
objectedit.mostCurrent._showimage.runMethod(false,"setTag",(objectedit.mostCurrent._types.runMethod(false,"_makeimageviewdata" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_btm),(Object)(_filename))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e69) {
			BA.rdebugUtils.runVoidMethod("setLastException",objectedit.processBA, e69.toString()); BA.debugLineNum = 972;BA.debugLine="FileOK = False";
Debug.ShouldStop(2048);
_fileok = objectedit.mostCurrent.__c.getField(true,"False");Debug.locals.put("FileOK", _fileok);
 };
 };
 }else {
 BA.debugLineNum = 976;BA.debugLine="FileOK = False";
Debug.ShouldStop(32768);
_fileok = objectedit.mostCurrent.__c.getField(true,"False");Debug.locals.put("FileOK", _fileok);
 };
 BA.debugLineNum = 979;BA.debugLine="If Not(FileOK) Then";
Debug.ShouldStop(262144);
if (objectedit.mostCurrent.__c.runMethod(true,"Not",(Object)(_fileok)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 980;BA.debugLine="If Utils.NNE(btm) Then";
Debug.ShouldStop(524288);
if (objectedit.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_btm)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 981;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 982;BA.debugLine="ShowImage.SetBackgroundImage(Utils.B64ToBitm";
Debug.ShouldStop(2097152);
objectedit.mostCurrent._showimage.runVoidMethod ("SetBackgroundImageNew",(Object)((objectedit.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_btm)).getObject())));
 BA.debugLineNum = 983;BA.debugLine="ShowImage.Tag = Types.MakeImageViewData(btm,";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._showimage.runMethod(false,"setTag",(objectedit.mostCurrent._types.runMethod(false,"_makeimageviewdata" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_btm),(Object)(_filename))));
 BA.debugLineNum = 984;BA.debugLine="FileOK = True";
Debug.ShouldStop(8388608);
_fileok = objectedit.mostCurrent.__c.getField(true,"True");Debug.locals.put("FileOK", _fileok);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e82) {
			BA.rdebugUtils.runVoidMethod("setLastException",objectedit.processBA, e82.toString()); BA.debugLineNum = 986;BA.debugLine="FileOK = False";
Debug.ShouldStop(33554432);
_fileok = objectedit.mostCurrent.__c.getField(true,"False");Debug.locals.put("FileOK", _fileok);
 };
 }else {
 BA.debugLineNum = 989;BA.debugLine="FileOK = False";
Debug.ShouldStop(268435456);
_fileok = objectedit.mostCurrent.__c.getField(true,"False");Debug.locals.put("FileOK", _fileok);
 };
 };
 BA.debugLineNum = 993;BA.debugLine="If (FileOK) Then";
Debug.ShouldStop(1);
if ((_fileok).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 994;BA.debugLine="ImageFilename.Text = Filename";
Debug.ShouldStop(2);
objectedit.mostCurrent._imagefilename.runMethod(true,"setText",BA.ObjectToCharSequence(_filename));
 BA.debugLineNum = 995;BA.debugLine="ImageFilename.Tag = Filename";
Debug.ShouldStop(4);
objectedit.mostCurrent._imagefilename.runMethod(false,"setTag",(_filename));
 BA.debugLineNum = 996;BA.debugLine="ImageStateName.Text = created_at";
Debug.ShouldStop(8);
objectedit.mostCurrent._imagestatename.runMethod(true,"setText",BA.ObjectToCharSequence(_created_at));
 BA.debugLineNum = 997;BA.debugLine="ImageStateName.Tag = tagcode";
Debug.ShouldStop(16);
objectedit.mostCurrent._imagestatename.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 998;BA.debugLine="Dim Height As Int = ((i+1)*130dip)-130dip";
Debug.ShouldStop(32);
_height = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))}, "*",0, 1)),objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))}, "-",1, 1);Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 999;BA.debugLine="pnlGroupExpandedProp.AddView(p, 0, Height, 100";
Debug.ShouldStop(64);
objectedit.mostCurrent._pnlgroupexpandedprop.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_height),(Object)(objectedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objectedit.mostCurrent.activityBA)),(Object)(objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 1000;BA.debugLine="row = row +1";
Debug.ShouldStop(128);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 1004;BA.debugLine="id.ExpandedHeight = 50dip";
Debug.ShouldStop(2048);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,objectedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 1005;BA.debugLine="Dim chapter As B4XView = CreateChapterProp(Color";
Debug.ShouldStop(4096);
_chapter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chapter = _createchapterprop(objectedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),BA.ObjectToString("Galeria"),_id,_idx,objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),objectedit.mostCurrent.__c.getField(true,"False"));Debug.locals.put("chapter", _chapter);Debug.locals.put("chapter", _chapter);
 };
 BA.debugLineNum = 1007;BA.debugLine="Record2.Close";
Debug.ShouldStop(16384);
_record2.runVoidMethod ("Close");
 BA.debugLineNum = 1009;BA.debugLine="objectPropertyListView.Add(chapter, id)";
Debug.ShouldStop(65536);
objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_add" /*RemoteObject*/ ,(Object)(_chapter),(Object)((_id)));
 BA.debugLineNum = 1010;BA.debugLine="If ExpandThis Then ExpandItemProp(idx)";
Debug.ShouldStop(131072);
if (_expandthis.<Boolean>get().booleanValue()) { 
_expanditemprop(_idx);};
 BA.debugLineNum = 1011;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menupanelbuttomtwo_click() throws Exception{
try {
		Debug.PushSubsStack("MenuPanelButtomTwo_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1452);
if (RapidSub.canDelegate("menupanelbuttomtwo_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","menupanelbuttomtwo_click");}
 BA.debugLineNum = 1452;BA.debugLine="Sub MenuPanelButtomTwo_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1453;BA.debugLine="listsTabPanel.ScrollTo(1,False)";
Debug.ShouldStop(4096);
objectedit.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 1)),(Object)(objectedit.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1454;BA.debugLine="MenuPanel.Visible = False";
Debug.ShouldStop(8192);
objectedit.mostCurrent._menupanel.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1455;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(16384);
objectedit.mostCurrent._panel1.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1456;BA.debugLine="mainLabelOptLists.Text = MenuPanelPagesTitle.Get(";
Debug.ShouldStop(32768);
objectedit.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._menupanelpagestitle.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 1457;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menupanelbuttonfour_click() throws Exception{
try {
		Debug.PushSubsStack("MenuPanelButtonFour_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1466);
if (RapidSub.canDelegate("menupanelbuttonfour_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","menupanelbuttonfour_click");}
 BA.debugLineNum = 1466;BA.debugLine="Sub MenuPanelButtonFour_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1467;BA.debugLine="listsTabPanel.ScrollTo(3,False)";
Debug.ShouldStop(67108864);
objectedit.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 3)),(Object)(objectedit.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1468;BA.debugLine="MenuPanel.Visible = False";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._menupanel.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1469;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(268435456);
objectedit.mostCurrent._panel1.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1470;BA.debugLine="mainLabelOptLists.Text = MenuPanelPagesTitle.Get(";
Debug.ShouldStop(536870912);
objectedit.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._menupanelpagestitle.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 1471;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menupanelbuttonone_click() throws Exception{
try {
		Debug.PushSubsStack("MenuPanelButtonOne_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1444);
if (RapidSub.canDelegate("menupanelbuttonone_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","menupanelbuttonone_click");}
 BA.debugLineNum = 1444;BA.debugLine="Sub MenuPanelButtonOne_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1445;BA.debugLine="listsTabPanel.ScrollTo(0,False)";
Debug.ShouldStop(16);
objectedit.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 0)),(Object)(objectedit.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1446;BA.debugLine="MenuPanel.Visible = False";
Debug.ShouldStop(32);
objectedit.mostCurrent._menupanel.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1447;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(64);
objectedit.mostCurrent._panel1.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1448;BA.debugLine="mainLabelOptLists.Text = MenuPanelPagesTitle.Get(";
Debug.ShouldStop(128);
objectedit.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._menupanelpagestitle.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1450;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menupanelbuttonthree_click() throws Exception{
try {
		Debug.PushSubsStack("MenuPanelButtonThree_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1459);
if (RapidSub.canDelegate("menupanelbuttonthree_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","menupanelbuttonthree_click");}
 BA.debugLineNum = 1459;BA.debugLine="Sub MenuPanelButtonThree_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1460;BA.debugLine="listsTabPanel.ScrollTo(2,False)";
Debug.ShouldStop(524288);
objectedit.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 2)),(Object)(objectedit.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1461;BA.debugLine="MenuPanel.Visible = False";
Debug.ShouldStop(1048576);
objectedit.mostCurrent._menupanel.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1462;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(2097152);
objectedit.mostCurrent._panel1.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1463;BA.debugLine="mainLabelOptLists.Text = MenuPanelPagesTitle.Get(";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._menupanelpagestitle.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 1464;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objectlistview_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("objectListView_ItemClick (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1217);
if (RapidSub.canDelegate("objectlistview_itemclick")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","objectlistview_itemclick", _index, _value);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1217;BA.debugLine="Sub objectListView_ItemClick (Index As Int, Value";
Debug.ShouldStop(1);
 BA.debugLineNum = 1218;BA.debugLine="CurrentGroupItem = Index";
Debug.ShouldStop(2);
objectedit._currentgroupitem = _index;
 BA.debugLineNum = 1219;BA.debugLine="Log(CurrentGroupItem)";
Debug.ShouldStop(4);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6149291010",BA.NumberToString(objectedit._currentgroupitem),0);
 BA.debugLineNum = 1221;BA.debugLine="Dim p As B4XView = objectListView.GetPanel(Curren";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = objectedit.mostCurrent._objectlistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(objectedit._currentgroupitem));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1222;BA.debugLine="If p.Tag = True Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),(objectedit.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 1223;BA.debugLine="CollapseItem(CurrentGroupItem)";
Debug.ShouldStop(64);
_collapseitem(objectedit._currentgroupitem);
 }else {
 BA.debugLineNum = 1225;BA.debugLine="ExpandItem(CurrentGroupItem)";
Debug.ShouldStop(256);
_expanditem(objectedit._currentgroupitem);
 };
 BA.debugLineNum = 1227;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objectlistviewprop_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("objectListViewProp_ItemClick (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1229);
if (RapidSub.canDelegate("objectlistviewprop_itemclick")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","objectlistviewprop_itemclick", _index, _value);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1229;BA.debugLine="Sub objectListViewProp_ItemClick (Index As Int, Va";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1230;BA.debugLine="CurrentGroupItemProp = Index";
Debug.ShouldStop(8192);
objectedit._currentgroupitemprop = _index;
 BA.debugLineNum = 1231;BA.debugLine="Log(CurrentGroupItemProp)";
Debug.ShouldStop(16384);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6149356546",BA.NumberToString(objectedit._currentgroupitemprop),0);
 BA.debugLineNum = 1233;BA.debugLine="Dim p As B4XView = objectPropertyListView.GetPane";
Debug.ShouldStop(65536);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = objectedit.mostCurrent._objectpropertylistview.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(objectedit._currentgroupitemprop));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1234;BA.debugLine="If p.Tag = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),(objectedit.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 1235;BA.debugLine="CollapseItemProp(CurrentGroupItemProp)";
Debug.ShouldStop(262144);
_collapseitemprop(objectedit._currentgroupitemprop);
 }else {
 BA.debugLineNum = 1237;BA.debugLine="ExpandItemProp(CurrentGroupItemProp)";
Debug.ShouldStop(1048576);
_expanditemprop(objectedit._currentgroupitemprop);
 };
 BA.debugLineNum = 1239;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objectpropertylistview_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("objectPropertyListView_ItemClick (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1425);
if (RapidSub.canDelegate("objectpropertylistview_itemclick")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","objectpropertylistview_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1425;BA.debugLine="Sub objectPropertyListView_ItemClick (Index As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1427;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objectwhitemscheck_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("objectWHItemsCheck_ItemClick (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1245);
if (RapidSub.canDelegate("objectwhitemscheck_itemclick")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","objectwhitemscheck_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1245;BA.debugLine="Sub objectWHItemsCheck_ItemClick (Index As Int, Va";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1247;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objectwhitemstaken_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("objectWHItemsTaken_ItemClick (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1241);
if (RapidSub.canDelegate("objectwhitemstaken_itemclick")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","objectwhitemstaken_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1241;BA.debugLine="Sub objectWHItemsTaken_ItemClick (Index As Int, Va";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1243;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("PhoneBackButtonTab (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,306);
if (RapidSub.canDelegate("phonebackbuttontab")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","phonebackbuttontab");}
 BA.debugLineNum = 306;BA.debugLine="Sub PhoneBackButtonTab As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(262144);
if ((objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 308;BA.debugLine="If (MenuPanel.Visible = False) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",objectedit.mostCurrent._menupanel.runMethod(true,"getVisible"),objectedit.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 309;BA.debugLine="Panel1.Visible = False";
Debug.ShouldStop(1048576);
objectedit.mostCurrent._panel1.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 310;BA.debugLine="MenuPanel.Visible = True";
Debug.ShouldStop(2097152);
objectedit.mostCurrent._menupanel.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 311;BA.debugLine="mainLabelOptLists.Text = ObjectEditSelectedName";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._objecteditselectedname));
 BA.debugLineNum = 312;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return objectedit.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 315;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) return objectedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlgroupexpandedprop_click() throws Exception{
try {
		Debug.PushSubsStack("pnlGroupExpandedProp_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1430);
if (RapidSub.canDelegate("pnlgroupexpandedprop_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","pnlgroupexpandedprop_click");}
 BA.debugLineNum = 1430;BA.debugLine="Sub pnlGroupExpandedProp_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1432;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public Device As Phone";
objectedit._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _settheaddress(RemoteObject _theaddress) throws Exception{
try {
		Debug.PushSubsStack("SetTheAddress (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1249);
if (RapidSub.canDelegate("settheaddress")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","settheaddress", _theaddress);}
Debug.locals.put("theAddress", _theaddress);
 BA.debugLineNum = 1249;BA.debugLine="Sub SetTheAddress(theAddress As Address)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1252;BA.debugLine="If (theAddress.asNew = False) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",_theaddress.getField(true,"asNew" /*RemoteObject*/ ),objectedit.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 1253;BA.debugLine="DBStructures.UpdateAddress(CurrentobjectTagcode,";
Debug.ShouldStop(16);
objectedit.mostCurrent._dbstructures.runVoidMethod ("_updateaddress" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._currentobjecttagcode),(Object)(objectedit.mostCurrent._currentaddresstagcode),(Object)(_theaddress));
 }else {
 BA.debugLineNum = 1256;BA.debugLine="CurrentAddressTagcode = \"ADRSS_\" & Utils.GetCurr";
Debug.ShouldStop(128);
objectedit.mostCurrent._currentaddresstagcode = RemoteObject.concat(RemoteObject.createImmutable("ADRSS_"),objectedit.mostCurrent._utils.runMethod(true,"_getcurrdatetimeformat" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("MMdd")),(Object)(BA.ObjectToString("HHmmss")),(Object)(objectedit.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 1257;BA.debugLine="DBStructures.InsertAddress(CurrentobjectTagcode,";
Debug.ShouldStop(256);
objectedit.mostCurrent._dbstructures.runVoidMethod ("_insertaddress" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._currentobjecttagcode),(Object)(objectedit.mostCurrent._currentaddresstagcode),(Object)(_theaddress));
 };
 BA.debugLineNum = 1259;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
Debug.ShouldStop(1024);
_updateobjectform(objectedit.mostCurrent._currentobjecttagcode);
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
public static RemoteObject  _setthecontact(RemoteObject _thecontact) throws Exception{
try {
		Debug.PushSubsStack("SetTheContact (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1273);
if (RapidSub.canDelegate("setthecontact")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","setthecontact", _thecontact);}
Debug.locals.put("theContact", _thecontact);
 BA.debugLineNum = 1273;BA.debugLine="Sub SetTheContact(theContact As ContactRecord)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1274;BA.debugLine="If (theContact.asNew = False) Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",_thecontact.getField(true,"asNew" /*RemoteObject*/ ),objectedit.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 1275;BA.debugLine="DBStructures.UpdateContact(theContact)";
Debug.ShouldStop(67108864);
objectedit.mostCurrent._dbstructures.runVoidMethod ("_updatecontact" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_thecontact));
 };
 BA.debugLineNum = 1281;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
Debug.ShouldStop(1);
_updateobjectform(objectedit.mostCurrent._currentobjecttagcode);
 BA.debugLineNum = 1282;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthegeoreference(RemoteObject _thegeo) throws Exception{
try {
		Debug.PushSubsStack("SetTheGeoReference (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1262);
if (RapidSub.canDelegate("setthegeoreference")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","setthegeoreference", _thegeo);}
Debug.locals.put("theGeo", _thegeo);
 BA.debugLineNum = 1262;BA.debugLine="Sub SetTheGeoReference(theGeo As GeoReference)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1263;BA.debugLine="If (theGeo.asNew = False) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_thegeo.getField(true,"asNew" /*RemoteObject*/ ),objectedit.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 1264;BA.debugLine="DBStructures.UpdateAddressGeoReference(Currentob";
Debug.ShouldStop(32768);
objectedit.mostCurrent._dbstructures.runVoidMethod ("_updateaddressgeoreference" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._currentobjecttagcode),(Object)(objectedit.mostCurrent._currentaddresstagcode),(Object)(_thegeo));
 };
 BA.debugLineNum = 1270;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
Debug.ShouldStop(2097152);
_updateobjectform(objectedit.mostCurrent._currentobjecttagcode);
 BA.debugLineNum = 1271;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthepropertyinsert(RemoteObject _property,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetThePropertyInsert (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1284);
if (RapidSub.canDelegate("setthepropertyinsert")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","setthepropertyinsert", _property, _value);}
Debug.locals.put("property", _property);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1284;BA.debugLine="Sub SetThePropertyInsert(property As String, value";
Debug.ShouldStop(8);
 BA.debugLineNum = 1285;BA.debugLine="DBStructures.InsertobjectProperty(CurrentobjectTa";
Debug.ShouldStop(16);
objectedit.mostCurrent._dbstructures.runVoidMethod ("_insertobjectproperty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._currentobjecttagcode),(Object)(_property),(Object)(_value));
 BA.debugLineNum = 1286;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
Debug.ShouldStop(32);
_updateobjectform(objectedit.mostCurrent._currentobjecttagcode);
 BA.debugLineNum = 1287;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthepropertyupdate(RemoteObject _property,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetThePropertyUpdate (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1289);
if (RapidSub.canDelegate("setthepropertyupdate")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","setthepropertyupdate", _property, _value);}
Debug.locals.put("property", _property);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1289;BA.debugLine="Sub SetThePropertyUpdate(property As String, value";
Debug.ShouldStop(256);
 BA.debugLineNum = 1290;BA.debugLine="DBStructures.UpdateobjectProperty(CurrentobjectTa";
Debug.ShouldStop(512);
objectedit.mostCurrent._dbstructures.runVoidMethod ("_updateobjectproperty" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._currentobjecttagcode),(Object)(_property),(Object)(_value));
 BA.debugLineNum = 1291;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
Debug.ShouldStop(1024);
_updateobjectform(objectedit.mostCurrent._currentobjecttagcode);
 BA.debugLineNum = 1292;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupmobilebuttons() throws Exception{
try {
		Debug.PushSubsStack("SetupMobileButtons (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,428);
if (RapidSub.canDelegate("setupmobilebuttons")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","setupmobilebuttons");}
int _i = 0;
RemoteObject _button = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 428;BA.debugLine="Sub SetupMobileButtons";
Debug.ShouldStop(2048);
 BA.debugLineNum = 430;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(8192);
if ((objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 432;BA.debugLine="For i = 0 To MenuPanelPagesTitle.Size-1";
Debug.ShouldStop(32768);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {objectedit.mostCurrent._menupanelpagestitle.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 433;BA.debugLine="Dim Button As Button = MenuPanelButtonList.Get(i";
Debug.ShouldStop(65536);
_button = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_button = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), objectedit.mostCurrent._menupanelbuttonlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Button", _button);
 BA.debugLineNum = 434;BA.debugLine="Button.Text = MenuPanelPagesTitle.Get(i)";
Debug.ShouldStop(131072);
_button.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._menupanelpagestitle.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 438;BA.debugLine="If(MenuPanelPagesTitle.Size > 3) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean(">",objectedit.mostCurrent._menupanelpagestitle.runMethod(true,"getSize"),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 439;BA.debugLine="MenuPanelButtonThree.Visible = True";
Debug.ShouldStop(4194304);
objectedit.mostCurrent._menupanelbuttonthree.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 440;BA.debugLine="MenuPanelButtonFour.Visible = True";
Debug.ShouldStop(8388608);
objectedit.mostCurrent._menupanelbuttonfour.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 441;BA.debugLine="Else If(MenuPanelPagesTitle.Size > 2) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean(">",objectedit.mostCurrent._menupanelpagestitle.runMethod(true,"getSize"),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 442;BA.debugLine="MenuPanelButtonThree.Visible = True";
Debug.ShouldStop(33554432);
objectedit.mostCurrent._menupanelbuttonthree.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 444;BA.debugLine="MenuPanelButtonThree.Visible = False";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._menupanelbuttonthree.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 445;BA.debugLine="MenuPanelButtonFour.Visible = False";
Debug.ShouldStop(268435456);
objectedit.mostCurrent._menupanelbuttonfour.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 }}
;
 BA.debugLineNum = 447;BA.debugLine="Panel1.Visible = False";
Debug.ShouldStop(1073741824);
objectedit.mostCurrent._panel1.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 448;BA.debugLine="MenuPanel.Visible = True";
Debug.ShouldStop(-2147483648);
objectedit.mostCurrent._menupanel.runMethod(true,"setVisible",objectedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 449;BA.debugLine="MenuPanelButtonOne.Color = Consts.ColorMain";
Debug.ShouldStop(1);
objectedit.mostCurrent._menupanelbuttonone.runVoidMethod ("setColor",objectedit.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 450;BA.debugLine="MenuPanelButtomTwo.Color = Consts.ColorMain";
Debug.ShouldStop(2);
objectedit.mostCurrent._menupanelbuttomtwo.runVoidMethod ("setColor",objectedit.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 451;BA.debugLine="MenuPanelButtonThree.Color  = Consts.ColorMain";
Debug.ShouldStop(4);
objectedit.mostCurrent._menupanelbuttonthree.runVoidMethod ("setColor",objectedit.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 452;BA.debugLine="MenuPanelButtonFour.Color  = Consts.ColorMain";
Debug.ShouldStop(8);
objectedit.mostCurrent._menupanelbuttonfour.runVoidMethod ("setColor",objectedit.mostCurrent._consts._colormain /*RemoteObject*/ );
 };
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startobjectactivity(RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("StartObjectActivity (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,459);
if (RapidSub.canDelegate("startobjectactivity")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","startobjectactivity", _tagcode);}
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _obtagcode = RemoteObject.createImmutable("");
RemoteObject _parentname = RemoteObject.createImmutable("");
Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 459;BA.debugLine="Sub StartObjectActivity(Tagcode As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 461;BA.debugLine="Dim SQL As String = DBStructures.EVC_SQL_CURRENT_";
Debug.ShouldStop(4096);
_sql = objectedit.mostCurrent._dbstructures._evc_sql_current_objects /*RemoteObject*/ ;Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 462;BA.debugLine="If (Tagcode <> \"\") Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("!",_tagcode,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 463;BA.debugLine="SQL = $\"${SQL} where a.tagcode='${Tagcode}'\"$";
Debug.ShouldStop(16384);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" where a.tagcode='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 464;BA.debugLine="Log(SQL)";
Debug.ShouldStop(32768);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6147456005",_sql,0);
 BA.debugLineNum = 465;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(65536);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 466;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(131072);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 467;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 468;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(524288);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 470;BA.debugLine="ThisObjectType = DBStructures.getDBObjectTypeEV";
Debug.ShouldStop(2097152);
objectedit.mostCurrent._thisobjecttype = objectedit.mostCurrent._dbstructures.runMethod(false,"_getdbobjecttypeevc" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type_tagcode")))));
 BA.debugLineNum = 471;BA.debugLine="CreateObjectTABS(ThisObjectType)";
Debug.ShouldStop(4194304);
_createobjecttabs(objectedit.mostCurrent._thisobjecttype);
 BA.debugLineNum = 472;BA.debugLine="Dim obTagCode As String = Record.GetString(\"tag";
Debug.ShouldStop(8388608);
_obtagcode = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("obTagCode", _obtagcode);Debug.locals.put("obTagCode", _obtagcode);
 BA.debugLineNum = 473;BA.debugLine="objectType.text = Record.GetString(\"typedesc\")";
Debug.ShouldStop(16777216);
objectedit.mostCurrent._objecttype.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("typedesc")))));
 BA.debugLineNum = 475;BA.debugLine="objectCode.Text = Record.GetString(\"reference\")";
Debug.ShouldStop(67108864);
objectedit.mostCurrent._objectcode.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reference")))));
 BA.debugLineNum = 476;BA.debugLine="objectNotes.text = Record.GetString(\"notes\")";
Debug.ShouldStop(134217728);
objectedit.mostCurrent._objectnotes.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("notes")))));
 BA.debugLineNum = 477;BA.debugLine="mainLabelOptLists.text = Record.GetString(\"name";
Debug.ShouldStop(268435456);
objectedit.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 478;BA.debugLine="ObjectEditSelectedName = Record.GetString(\"name";
Debug.ShouldStop(536870912);
objectedit.mostCurrent._objecteditselectedname = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));
 BA.debugLineNum = 479;BA.debugLine="ObjectParent = Record.GetString(\"parent\")";
Debug.ShouldStop(1073741824);
objectedit.mostCurrent._objectparent = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("parent")));
 BA.debugLineNum = 480;BA.debugLine="objectTagcode.text = ObjectEditSelectedName";
Debug.ShouldStop(-2147483648);
objectedit.mostCurrent._objecttagcode.runMethod(true,"setText",BA.ObjectToCharSequence(objectedit.mostCurrent._objecteditselectedname));
 BA.debugLineNum = 481;BA.debugLine="CurrentobjectTagcode = obTagCode.Trim 'objectTa";
Debug.ShouldStop(1);
objectedit.mostCurrent._currentobjecttagcode = _obtagcode.runMethod(true,"trim");
 BA.debugLineNum = 483;BA.debugLine="Dim ParentName As String = DBStructures.GetScri";
Debug.ShouldStop(4);
_parentname = objectedit.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select title_import from dta_objects where 1=1\n"),RemoteObject.createImmutable("																	and tagcode = '"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._objectparent))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("title_import")));Debug.locals.put("ParentName", _parentname);Debug.locals.put("ParentName", _parentname);
 BA.debugLineNum = 486;BA.debugLine="If Utils.NNE(ParentName) Then";
Debug.ShouldStop(32);
if (objectedit.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(_parentname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 487;BA.debugLine="ObjParent.Text = ParentName";
Debug.ShouldStop(64);
objectedit.mostCurrent._objparent.runMethod(true,"setText",BA.ObjectToCharSequence(_parentname));
 }else {
 BA.debugLineNum = 489;BA.debugLine="ObjParent.Text = \"\"";
Debug.ShouldStop(256);
objectedit.mostCurrent._objparent.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 492;BA.debugLine="CreateobjectDetailsData(False, Record)";
Debug.ShouldStop(2048);
_createobjectdetailsdata(objectedit.mostCurrent.__c.getField(true,"False"),_record);
 BA.debugLineNum = 493;BA.debugLine="CreateobjectDetailsDataProp(0, False, Tagcode)";
Debug.ShouldStop(4096);
_createobjectdetailsdataprop(BA.numberCast(int.class, 0),objectedit.mostCurrent.__c.getField(true,"False"),_tagcode);
 BA.debugLineNum = 495;BA.debugLine="If ThisObjectType.isgroup = 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",objectedit.mostCurrent._thisobjecttype.getField(true,"isgroup" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 496;BA.debugLine="CreateObjectsFromObject(True, $\"a.parent_tagco";
Debug.ShouldStop(32768);
_createobjectsfromobject(objectedit.mostCurrent.__c.getField(true,"True"),(RemoteObject.concat(RemoteObject.createImmutable("a.parent_tagcode='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._currentobjecttagcode))),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 507;BA.debugLine="If ThisObjectType.have_documents = 1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",objectedit.mostCurrent._thisobjecttype.getField(true,"have_documents" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 508;BA.debugLine="CreateDocumentsFromobject(False, Currentobject";
Debug.ShouldStop(134217728);
_createdocumentsfromobject(objectedit.mostCurrent.__c.getField(true,"False"),objectedit.mostCurrent._currentobjecttagcode);
 };
 }else {
 BA.debugLineNum = 512;BA.debugLine="Record.Close";
Debug.ShouldStop(-2147483648);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 513;BA.debugLine="MsgboxAsync( \"Não foi encontrado qualquer regis";
Debug.ShouldStop(1);
objectedit.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Não foi encontrado qualquer registo em BD com o código interno do objecto seleccionado. Actualize os dados do Tablet e tente novamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta!"))),objectedit.processBA);
 BA.debugLineNum = 514;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(2);
_listsbuttonclose_click();
 };
 }else {
 BA.debugLineNum = 517;BA.debugLine="MsgboxAsync( \"Não foi identificado o código inte";
Debug.ShouldStop(16);
objectedit.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Não foi identificado o código interno do objecto seleccionado. Actualize os dados do Tablet e tente novamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta!"))),objectedit.processBA);
 BA.debugLineNum = 518;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(32);
_listsbuttonclose_click();
 };
 BA.debugLineNum = 520;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(128);
_windowstatusupdate();
 BA.debugLineNum = 521;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _thisaddressedit_click() throws Exception{
try {
		Debug.PushSubsStack("thisAddressEdit_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1064);
if (RapidSub.canDelegate("thisaddressedit_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","thisaddressedit_click");}
 BA.debugLineNum = 1064;BA.debugLine="Sub thisAddressEdit_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1084;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _thiscontactedit_click() throws Exception{
try {
		Debug.PushSubsStack("ThisContactEdit_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1106);
if (RapidSub.canDelegate("thiscontactedit_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","thiscontactedit_click");}
 BA.debugLineNum = 1106;BA.debugLine="Sub ThisContactEdit_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1126;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _thisgeoreferenceedit_click() throws Exception{
try {
		Debug.PushSubsStack("ThisGeoReferenceEdit_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1086);
if (RapidSub.canDelegate("thisgeoreferenceedit_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","thisgeoreferenceedit_click");}
 BA.debugLineNum = 1086;BA.debugLine="Sub ThisGeoReferenceEdit_Click";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _thispropertyedit_click() throws Exception{
try {
		Debug.PushSubsStack("ThisPropertyEdit_Click (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,1128);
if (RapidSub.canDelegate("thispropertyedit_click")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","thispropertyedit_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _changeproperty = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 1128;BA.debugLine="Sub ThisPropertyEdit_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1129;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(256);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), objectedit.mostCurrent.__c.runMethod(false,"Sender",objectedit.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 1130;BA.debugLine="Dim p As Panel = b.Parent";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _b.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 1131;BA.debugLine="Dim lv As Label = p.GetView(0)";
Debug.ShouldStop(1024);
_lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lv", _lv);
 BA.debugLineNum = 1132;BA.debugLine="Dim lt As Label = p.GetView(1)";
Debug.ShouldStop(2048);
_lt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lt", _lt);
 BA.debugLineNum = 1134;BA.debugLine="Dim ChangeProperty As AppDialogs";
Debug.ShouldStop(8192);
_changeproperty = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("ChangeProperty", _changeproperty);
 BA.debugLineNum = 1135;BA.debugLine="ChangeProperty.Initialize";
Debug.ShouldStop(16384);
_changeproperty.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA);
 BA.debugLineNum = 1136;BA.debugLine="ChangeProperty.GetPropertyDialog(\"ObjectEdit\", lt";
Debug.ShouldStop(32768);
_changeproperty.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getpropertydialog" /*void*/ ,(Object)(RemoteObject.createImmutable(("ObjectEdit"))),(Object)(_lt.runMethod(true,"getText")),(Object)(_lv.runMethod(true,"getText")),(Object)(BA.ObjectToString(_b.runMethod(false,"getTag"))),(Object)(objectedit.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1137;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("UpdateMainLayout (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,262);
if (RapidSub.canDelegate("updatemainlayout")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","updatemainlayout");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 262;BA.debugLine="Sub UpdateMainLayout";
Debug.ShouldStop(32);
 BA.debugLineNum = 263;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
Debug.ShouldStop(64);
objectedit.mostCurrent._mainlabeloptlists.runMethod(true,"setTextColor",objectedit.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 264;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(128);
if (objectedit.mostCurrent.__c.runMethod(true,"Not",(Object)(objectedit.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 265;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
Debug.ShouldStop(256);
objectedit.mostCurrent._mainlogo.runMethod(true,"setGravity",objectedit.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 266;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
Debug.ShouldStop(512);
objectedit.mostCurrent._mainlogo.runMethod(true,"setWidth",objectedit.mostCurrent._consts._logowidth /*RemoteObject*/ );
 };
 BA.debugLineNum = 268;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
Debug.ShouldStop(2048);
objectedit.mostCurrent.__c.runVoidMethod ("LogImpl","6146931718",(RemoteObject.concat(RemoteObject.createImmutable("Inicialização de BMP: "),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objectedit.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 270;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
Debug.ShouldStop(8192);
if ((objectedit.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 271;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
Debug.ShouldStop(16384);
objectedit.mostCurrent._mainlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((objectedit.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(objectedit.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 };
 BA.debugLineNum = 278;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(2097152);
objectedit.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objectedit.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 279;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
Debug.ShouldStop(4194304);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), objectedit.mostCurrent._liststabpanel);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 280;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(8388608);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 282;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
Debug.ShouldStop(33554432);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndicatorColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(objectedit.mostCurrent._consts._colormain /*RemoteObject*/ )})));
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateobjectform(RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("UpdateobjectForm (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,753);
if (RapidSub.canDelegate("updateobjectform")) { return xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","updateobjectform", _tagcode);}
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 753;BA.debugLine="Sub UpdateobjectForm(Tagcode As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 754;BA.debugLine="Dim SQL As String = DBStructures.SQL_CURRENT_OBJE";
Debug.ShouldStop(131072);
_sql = objectedit.mostCurrent._dbstructures._sql_current_objects /*RemoteObject*/ ;Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 755;BA.debugLine="If (Tagcode <> \"\") Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("!",_tagcode,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 756;BA.debugLine="SQL = $\"${SQL} where a.tagcode='${Tagcode}'\"$";
Debug.ShouldStop(524288);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" where a.tagcode='"),objectedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 757;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(1048576);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 758;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(2097152);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objectedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 759;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 760;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(8388608);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 761;BA.debugLine="CreateobjectDetailsData(True, Record)";
Debug.ShouldStop(16777216);
_createobjectdetailsdata(objectedit.mostCurrent.__c.getField(true,"True"),_record);
 BA.debugLineNum = 762;BA.debugLine="CreateobjectDetailsDataProp(0, True, Tagcode) '";
Debug.ShouldStop(33554432);
_createobjectdetailsdataprop(BA.numberCast(int.class, 0),objectedit.mostCurrent.__c.getField(true,"True"),_tagcode);
 }else {
 BA.debugLineNum = 764;BA.debugLine="Record.Close";
Debug.ShouldStop(134217728);
_record.runVoidMethod ("Close");
 };
 };
 BA.debugLineNum = 768;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("WindowStatusUpdate (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,318);
if (RapidSub.canDelegate("windowstatusupdate")) { xevolution.vrcg.devdemov2400.objectedit.remoteMe.runUserSub(false, "objectedit","windowstatusupdate"); return;}
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
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.objectedit parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objectedit parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (objectedit) ","objectedit",47,objectedit.mostCurrent.activityBA,objectedit.mostCurrent,318);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 319;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 320;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("StopService",objectedit.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 321;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("StopService",objectedit.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 322;BA.debugLine="StopService(UserService)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("StopService",objectedit.processBA,(Object)((parent.mostCurrent._userservice.getObject())));
 BA.debugLineNum = 323;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("StopService",objectedit.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 324;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",objectedit.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 325;BA.debugLine="Sleep(500)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objectedit.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objectedit", "windowstatusupdate"),BA.numberCast(int.class, 500));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
 BA.debugLineNum = 326;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 328;BA.debugLine="SetupMobileButtons";
Debug.ShouldStop(128);
_setupmobilebuttons();
 BA.debugLineNum = 329;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(256);
parent.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 330;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
Debug.ShouldStop(512);
parent.mostCurrent._labelcopyright.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/ ));
 BA.debugLineNum = 331;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
Debug.ShouldStop(1024);
parent.mostCurrent._mainactiveuser.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ));
 BA.debugLineNum = 332;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 333;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
Debug.ShouldStop(4096);
parent.mostCurrent._mainlogo.runMethod(true,"setGravity",parent.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 334;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
Debug.ShouldStop(8192);
parent.mostCurrent._mainlogo.runMethod(true,"setWidth",parent.mostCurrent._consts._logowidth /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 336;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6147259410",(RemoteObject.concat(RemoteObject.createImmutable("Inicialização de BMP: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 337;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
Debug.ShouldStop(65536);
if (true) break;

case 9:
//if
this.state = 12;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 338;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
Debug.ShouldStop(131072);
parent.mostCurrent._mainlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,objectedit.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 362;BA.debugLine="End Sub";
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
}