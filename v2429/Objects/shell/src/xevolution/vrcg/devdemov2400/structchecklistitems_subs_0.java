package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class structchecklistitems_subs_0 {


public static RemoteObject  _butactions_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butActions_Click (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("butactions_click")) { return __ref.runUserSub(false, "structchecklistitems","butactions_click", __ref);}
 BA.debugLineNum = 353;BA.debugLine="Sub butActions_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butactionsclose_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butActionsClose_Click (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,359);
if (RapidSub.canDelegate("butactionsclose_click")) { return __ref.runUserSub(false, "structchecklistitems","butactionsclose_click", __ref);}
 BA.debugLineNum = 359;BA.debugLine="Sub butActionsClose_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butphoto_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butPhoto_Click (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,345);
if (RapidSub.canDelegate("butphoto_click")) { return __ref.runUserSub(false, "structchecklistitems","butphoto_click", __ref);}
 BA.debugLineNum = 345;BA.debugLine="Sub butPhoto_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttask_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butTask_Click (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("buttask_click")) { return __ref.runUserSub(false, "structchecklistitems","buttask_click", __ref);}
 BA.debugLineNum = 349;BA.debugLine="Sub butTask_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonconfigmake(RemoteObject __ref,RemoteObject _color,RemoteObject _valueok,RemoteObject _jump) throws Exception{
try {
		Debug.PushSubsStack("ButtonConfigMake (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("buttonconfigmake")) { return __ref.runUserSub(false, "structchecklistitems","buttonconfigmake", __ref, _color, _valueok, _jump);}
RemoteObject _opts = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption");
Debug.locals.put("Color", _color);
Debug.locals.put("ValueOk", _valueok);
Debug.locals.put("Jump", _jump);
 BA.debugLineNum = 181;BA.debugLine="Sub ButtonConfigMake(Color As Int, ValueOk As Int,";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Dim opts As BtnCfgOption";
Debug.ShouldStop(2097152);
_opts = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption");Debug.locals.put("opts", _opts);
 BA.debugLineNum = 183;BA.debugLine="opts.Color = Color";
Debug.ShouldStop(4194304);
_opts.setField ("Color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 184;BA.debugLine="opts.ValueOk = ValueOk";
Debug.ShouldStop(8388608);
_opts.setField ("ValueOk" /*RemoteObject*/ ,_valueok);
 BA.debugLineNum = 185;BA.debugLine="opts.Jump = Jump";
Debug.ShouldStop(16777216);
_opts.setField ("Jump" /*RemoteObject*/ ,_jump);
 BA.debugLineNum = 186;BA.debugLine="Return opts";
Debug.ShouldStop(33554432);
if (true) return _opts;
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Type CLTypeOptions( Tagcode As String, Title() As";
;
 //BA.debugLineNum = 7;BA.debugLine="Type BtnCfgOption(Color As Int, ValueOk As Int, J";
;
 //BA.debugLineNum = 8;BA.debugLine="Type PanCfgOption(TagCode As String, Multi As Boo";
;
 //BA.debugLineNum = 10;BA.debugLine="Private CLItem_Title As Label";
structchecklistitems._clitem_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_clitem_title",structchecklistitems._clitem_title);
 //BA.debugLineNum = 11;BA.debugLine="Private CLItem_Description As Label";
structchecklistitems._clitem_description = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_clitem_description",structchecklistitems._clitem_description);
 //BA.debugLineNum = 12;BA.debugLine="Private CLItem_Tagcode As Label";
structchecklistitems._clitem_tagcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_clitem_tagcode",structchecklistitems._clitem_tagcode);
 //BA.debugLineNum = 14;BA.debugLine="Private CLItem_EditText As EditText";
structchecklistitems._clitem_edittext = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_clitem_edittext",structchecklistitems._clitem_edittext);
 //BA.debugLineNum = 15;BA.debugLine="Private CLItem_Button As Button";
structchecklistitems._clitem_button = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_clitem_button",structchecklistitems._clitem_button);
 //BA.debugLineNum = 16;BA.debugLine="Private CLItem_Selection As B4XComboBox2";
structchecklistitems._clitem_selection = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xcombobox2");__ref.setField("_clitem_selection",structchecklistitems._clitem_selection);
 //BA.debugLineNum = 17;BA.debugLine="Private CLItem_RepeatBnt As Button";
structchecklistitems._clitem_repeatbnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_clitem_repeatbnt",structchecklistitems._clitem_repeatbnt);
 //BA.debugLineNum = 18;BA.debugLine="Private CLItem_DateSelect As AnotherDatePicker";
structchecklistitems._clitem_dateselect = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.anotherdatepicker");__ref.setField("_clitem_dateselect",structchecklistitems._clitem_dateselect);
 //BA.debugLineNum = 22;BA.debugLine="Public FirstOptionCheck As String			' Datetime of";
structchecklistitems._firstoptioncheck = RemoteObject.createImmutable("");__ref.setField("_firstoptioncheck",structchecklistitems._firstoptioncheck);
 //BA.debugLineNum = 23;BA.debugLine="Public FirstOptionSelect As String 			' Date of f";
structchecklistitems._firstoptionselect = RemoteObject.createImmutable("");__ref.setField("_firstoptionselect",structchecklistitems._firstoptionselect);
 //BA.debugLineNum = 24;BA.debugLine="Public OptionLatitude As String";
structchecklistitems._optionlatitude = RemoteObject.createImmutable("");__ref.setField("_optionlatitude",structchecklistitems._optionlatitude);
 //BA.debugLineNum = 25;BA.debugLine="Public OptionLongitude As String";
structchecklistitems._optionlongitude = RemoteObject.createImmutable("");__ref.setField("_optionlongitude",structchecklistitems._optionlongitude);
 //BA.debugLineNum = 27;BA.debugLine="Private OptionsCount As Int = 0";
structchecklistitems._optionscount = BA.numberCast(int.class, 0);__ref.setField("_optionscount",structchecklistitems._optionscount);
 //BA.debugLineNum = 28;BA.debugLine="Private OptionsType As Int = 0				' Edit, Button,";
structchecklistitems._optionstype = BA.numberCast(int.class, 0);__ref.setField("_optionstype",structchecklistitems._optionstype);
 //BA.debugLineNum = 29;BA.debugLine="Private	OptionsMulti As Boolean = False		' Single";
structchecklistitems._optionsmulti = structchecklistitems.__c.getField(true,"False");__ref.setField("_optionsmulti",structchecklistitems._optionsmulti);
 //BA.debugLineNum = 30;BA.debugLine="Private OptionJumpTo As String = \"\"";
structchecklistitems._optionjumpto = BA.ObjectToString("");__ref.setField("_optionjumpto",structchecklistitems._optionjumpto);
 //BA.debugLineNum = 32;BA.debugLine="Private BaseActivity As Activity";
structchecklistitems._baseactivity = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_baseactivity",structchecklistitems._baseactivity);
 //BA.debugLineNum = 33;BA.debugLine="Private BaseView As B4XView";
structchecklistitems._baseview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_baseview",structchecklistitems._baseview);
 //BA.debugLineNum = 34;BA.debugLine="Private BaseDesigner As String";
structchecklistitems._basedesigner = RemoteObject.createImmutable("");__ref.setField("_basedesigner",structchecklistitems._basedesigner);
 //BA.debugLineNum = 35;BA.debugLine="Private BaseOptions As CLTypeOptions";
structchecklistitems._baseoptions = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions");__ref.setField("_baseoptions",structchecklistitems._baseoptions);
 //BA.debugLineNum = 36;BA.debugLine="Private BaseHeight As Int";
structchecklistitems._baseheight = RemoteObject.createImmutable(0);__ref.setField("_baseheight",structchecklistitems._baseheight);
 //BA.debugLineNum = 37;BA.debugLine="Private ForceRound As Boolean = False";
structchecklistitems._forceround = structchecklistitems.__c.getField(true,"False");__ref.setField("_forceround",structchecklistitems._forceround);
 //BA.debugLineNum = 38;BA.debugLine="Private IsNoAsk As Boolean = False";
structchecklistitems._isnoask = structchecklistitems.__c.getField(true,"False");__ref.setField("_isnoask",structchecklistitems._isnoask);
 //BA.debugLineNum = 39;BA.debugLine="Private butActionsClose As Button";
structchecklistitems._butactionsclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butactionsclose",structchecklistitems._butactionsclose);
 //BA.debugLineNum = 40;BA.debugLine="Private butActions As Button";
structchecklistitems._butactions = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butactions",structchecklistitems._butactions);
 //BA.debugLineNum = 41;BA.debugLine="Private butTask As Button";
structchecklistitems._buttask = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttask",structchecklistitems._buttask);
 //BA.debugLineNum = 42;BA.debugLine="Private butPhoto As Button";
structchecklistitems._butphoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butphoto",structchecklistitems._butphoto);
 //BA.debugLineNum = 43;BA.debugLine="Private panelActionOptions As Panel";
structchecklistitems._panelactionoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panelactionoptions",structchecklistitems._panelactionoptions);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clitembutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CLItemButton_Click (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("clitembutton_click")) { return __ref.runUserSub(false, "structchecklistitems","clitembutton_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _cfgcolor = RemoteObject.createImmutable(0);
RemoteObject _cfgvalue = RemoteObject.createImmutable(0);
RemoteObject _cfgjump = RemoteObject.createImmutable("");
 BA.debugLineNum = 210;BA.debugLine="Sub CLItemButton_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Log(\"Clicked\")";
Debug.ShouldStop(262144);
structchecklistitems.__c.runVoidMethod ("LogImpl","6177995777",RemoteObject.createImmutable("Clicked"),0);
 BA.debugLineNum = 212;BA.debugLine="Dim btn As Button = Sender";
Debug.ShouldStop(524288);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), structchecklistitems.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 213;BA.debugLine="Dim cfgColor As Int = getCfgColor(btn.Tag)";
Debug.ShouldStop(1048576);
_cfgcolor = __ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getcfgcolor" /*RemoteObject*/ ,(Object)((_btn.runMethod(false,"getTag"))));Debug.locals.put("cfgColor", _cfgcolor);Debug.locals.put("cfgColor", _cfgcolor);
 BA.debugLineNum = 214;BA.debugLine="Dim cfgValue As Int = getCfgValueOk(btn.Tag)";
Debug.ShouldStop(2097152);
_cfgvalue = __ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getcfgvalueok" /*RemoteObject*/ ,(Object)((_btn.runMethod(false,"getTag"))));Debug.locals.put("cfgValue", _cfgvalue);Debug.locals.put("cfgValue", _cfgvalue);
 BA.debugLineNum = 215;BA.debugLine="Dim cfgJump As String = getCfgJump(btn.Tag)";
Debug.ShouldStop(4194304);
_cfgjump = __ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getcfgjump" /*RemoteObject*/ ,(Object)((_btn.runMethod(false,"getTag"))));Debug.locals.put("cfgJump", _cfgjump);Debug.locals.put("cfgJump", _cfgjump);
 BA.debugLineNum = 216;BA.debugLine="If cfgValue=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_cfgvalue,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 217;BA.debugLine="If (getPanelMulti(btn.Parent)) Then";
Debug.ShouldStop(16777216);
if ((__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getpanelmulti" /*RemoteObject*/ ,(Object)(_btn.runMethod(false,"getParent")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 218;BA.debugLine="cfgValue = 1";
Debug.ShouldStop(33554432);
_cfgvalue = BA.numberCast(int.class, 1);Debug.locals.put("cfgValue", _cfgvalue);
 BA.debugLineNum = 219;BA.debugLine="btn.Color = cfgColor";
Debug.ShouldStop(67108864);
_btn.runVoidMethod ("setColor",_cfgcolor);
 BA.debugLineNum = 220;BA.debugLine="btn.Tag = ButtonConfigMake(cfgColor, cfgValue,";
Debug.ShouldStop(134217728);
_btn.runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_buttonconfigmake" /*RemoteObject*/ ,(Object)(_cfgcolor),(Object)(_cfgvalue),(Object)(_cfgjump))));
 }else {
 BA.debugLineNum = 222;BA.debugLine="MakeButtonAction(btn, cfgColor, cfgJump)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_makebuttonaction" /*void*/ ,(Object)(_btn),(Object)(_cfgcolor),(Object)(_cfgjump));
 };
 BA.debugLineNum = 225;BA.debugLine="If (cfgJump <> \"\") Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("!",_cfgjump,RemoteObject.createImmutable("")))) { 
 };
 }else {
 BA.debugLineNum = 229;BA.debugLine="cfgValue = 0";
Debug.ShouldStop(16);
_cfgvalue = BA.numberCast(int.class, 0);Debug.locals.put("cfgValue", _cfgvalue);
 BA.debugLineNum = 230;BA.debugLine="btn.Color = Consts.ColorBlue";
Debug.ShouldStop(32);
_btn.runVoidMethod ("setColor",structchecklistitems._consts._colorblue /*RemoteObject*/ );
 };
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cllineclick_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLLineClick_ItemClick (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("cllineclick_itemclick")) { return __ref.runUserSub(false, "structchecklistitems","cllineclick_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 330;BA.debugLine="Sub CLLineClick_ItemClick (Index As Int, Value As";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="panelActionOptions.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_panelactionoptions" /*RemoteObject*/ ).runMethod(true,"setVisible",structchecklistitems.__c.getField(true,"False"));
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
public static RemoteObject  _cllineclick_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLLineClick_ItemLongClick (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("cllineclick_itemlongclick")) { return __ref.runUserSub(false, "structchecklistitems","cllineclick_itemlongclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 340;BA.debugLine="Sub CLLineClick_ItemLongClick (Index As Int, Value";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="panelActionOptions.Visible = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_panelactionoptions" /*RemoteObject*/ ).runMethod(true,"setVisible",structchecklistitems.__c.getField(true,"True"));
 BA.debugLineNum = 342;BA.debugLine="Log(\"Eu pressionei\")";
Debug.ShouldStop(2097152);
structchecklistitems.__c.runVoidMethod ("LogImpl","6178782210",RemoteObject.createImmutable("Eu pressionei"),0);
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlineoptions(RemoteObject __ref,RemoteObject _opts,RemoteObject _expviews) throws Exception{
try {
		Debug.PushSubsStack("CreateLineOptions (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("createlineoptions")) { return __ref.runUserSub(false, "structchecklistitems","createlineoptions", __ref, _opts, _expviews);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _titlesin = RemoteObject.createImmutable(0);
RemoteObject _icount = RemoteObject.createImmutable(0);
RemoteObject _ocount = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _nclitem_button = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _v = RemoteObject.createImmutable(0);
RemoteObject _optionsadd = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("opts", _opts);
Debug.locals.put("expViews", _expviews);
 BA.debugLineNum = 55;BA.debugLine="Public Sub CreateLineOptions(opts As CLTypeOptions";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="BaseOptions = opts";
Debug.ShouldStop(8388608);
__ref.setField ("_baseoptions" /*RemoteObject*/ ,_opts);
 BA.debugLineNum = 57;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 58;BA.debugLine="p.Initialize(\"CLLineClick\")";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CLLineClick")));
 BA.debugLineNum = 59;BA.debugLine="BaseActivity.AddView(p, 0, 0, 100%x, BaseHeight)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_baseactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(structchecklistitems.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(__ref.getField(true,"_baseheight" /*RemoteObject*/ )));
 BA.debugLineNum = 60;BA.debugLine="p.LoadLayout(BaseDesigner)";
Debug.ShouldStop(134217728);
_p.runMethodAndSync(false,"LoadLayout",(Object)(__ref.getField(true,"_basedesigner" /*RemoteObject*/ )),__ref.getField(false, "ba"));
 BA.debugLineNum = 61;BA.debugLine="p.RemoveView";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 62;BA.debugLine="p.Tag = PanelConfigMake(opts.Tagcode, opts.oMulti";
Debug.ShouldStop(536870912);
_p.runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_panelconfigmake" /*RemoteObject*/ ,(Object)(_opts.getField(true,"Tagcode" /*RemoteObject*/ )),(Object)(_opts.getField(true,"oMulti" /*RemoteObject*/ )),(Object)(_opts.getField(true,"NoAsk" /*RemoteObject*/ )))));
 BA.debugLineNum = 63;BA.debugLine="IsNoAsk = opts.NoAsk";
Debug.ShouldStop(1073741824);
__ref.setField ("_isnoask" /*RemoteObject*/ ,_opts.getField(true,"NoAsk" /*RemoteObject*/ ));
 BA.debugLineNum = 65;BA.debugLine="Select BaseOptions.oType";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(__ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(true,"oType" /*RemoteObject*/ ),structchecklistitems._consts._cloptiontype_buttons /*RemoteObject*/ )) {
case 0: {
 BA.debugLineNum = 67;BA.debugLine="Dim lst As List = BaseOptions.Title";
Debug.ShouldStop(4);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = structchecklistitems.__c.runMethod(false, "ArrayToList", (Object)(__ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(false,"Title" /*RemoteObject*/ )));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 68;BA.debugLine="Dim TitlesIn As Int = lst.Size 'BaseOptions.Tit";
Debug.ShouldStop(8);
_titlesin = _lst.runMethod(true,"getSize");Debug.locals.put("TitlesIn", _titlesin);Debug.locals.put("TitlesIn", _titlesin);
 BA.debugLineNum = 69;BA.debugLine="Dim iCount As Int = p.NumberOfViews-(TitlesIn+e";
Debug.ShouldStop(16);
_icount = RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfViews"),(RemoteObject.solve(new RemoteObject[] {_titlesin,_expviews}, "+",1, 1))}, "-",1, 1);Debug.locals.put("iCount", _icount);Debug.locals.put("iCount", _icount);
 BA.debugLineNum = 70;BA.debugLine="Dim oCount As Int = BaseOptions.oCount";
Debug.ShouldStop(32);
_ocount = __ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(true,"oCount" /*RemoteObject*/ );Debug.locals.put("oCount", _ocount);Debug.locals.put("oCount", _ocount);
 BA.debugLineNum = 71;BA.debugLine="If (iCount = oCount) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",_icount,BA.numberCast(double.class, _ocount)))) { 
 BA.debugLineNum = 72;BA.debugLine="Dim CLItem_Title As Label = p.GetView(Consts.A";
Debug.ShouldStop(128);
structchecklistitems._clitem_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
structchecklistitems._clitem_title = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(structchecklistitems._consts._arr_firstitem /*RemoteObject*/ )).getObject());__ref.setField("_clitem_title",structchecklistitems._clitem_title);
 BA.debugLineNum = 73;BA.debugLine="CLItem_Title.Text = BaseOptions.Title(Consts.A";
Debug.ShouldStop(256);
__ref.getField(false,"_clitem_title" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(false,"Title" /*RemoteObject*/ ).getArrayElement(true,structchecklistitems._consts._arr_firstitem /*RemoteObject*/ )));
 BA.debugLineNum = 74;BA.debugLine="For i = Consts.ARR_SECONDITEM To iCount 'p.Num";
Debug.ShouldStop(512);
{
final int step18 = 1;
final int limit18 = _icount.<Integer>get().intValue();
_i = structchecklistitems._consts._arr_seconditem /*RemoteObject*/ .<Integer>get().intValue() ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 75;BA.debugLine="Dim nCLItem_Button As Button = p.GetView(i)";
Debug.ShouldStop(1024);
_nclitem_button = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_nclitem_button = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());Debug.locals.put("nCLItem_Button", _nclitem_button);
 BA.debugLineNum = 78;BA.debugLine="nCLItem_Button.Text = BaseOptions.oNames(i-1)";
Debug.ShouldStop(8192);
_nclitem_button.runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(false,"oNames" /*RemoteObject*/ ).getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 79;BA.debugLine="nCLItem_Button.Color = Consts.ColorBlue";
Debug.ShouldStop(16384);
_nclitem_button.runVoidMethod ("setColor",structchecklistitems._consts._colorblue /*RemoteObject*/ );
 BA.debugLineNum = 80;BA.debugLine="If ForceRound Then";
Debug.ShouldStop(32768);
if (__ref.getField(true,"_forceround" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(65536);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 82;BA.debugLine="cd.Initialize(Consts.ColorBlue, 1000dip)";
Debug.ShouldStop(131072);
_cd.runVoidMethod ("Initialize",(Object)(structchecklistitems._consts._colorblue /*RemoteObject*/ ),(Object)(structchecklistitems.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))));
 BA.debugLineNum = 83;BA.debugLine="nCLItem_Button.Background = cd";
Debug.ShouldStop(262144);
_nclitem_button.runMethod(false,"setBackground",(_cd.getObject()));
 };
 BA.debugLineNum = 85;BA.debugLine="Dim m As Map = BaseOptions.oValues(i-1)";
Debug.ShouldStop(1048576);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = __ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(false,"oValues" /*RemoteObject*/ ).getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 86;BA.debugLine="Dim v As Int = m.Get(\"value\")";
Debug.ShouldStop(2097152);
_v = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 87;BA.debugLine="If (v = 1) Then nCLItem_Button.Color = BaseOp";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",_v,BA.numberCast(double.class, 1)))) { 
_nclitem_button.runVoidMethod ("setColor",__ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(false,"oColors" /*RemoteObject*/ ).getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)));};
 BA.debugLineNum = 88;BA.debugLine="nCLItem_Button.Tag = ButtonConfigMake(BaseOpt";
Debug.ShouldStop(8388608);
_nclitem_button.runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_buttonconfigmake" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(false,"oColors" /*RemoteObject*/ ).getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(_v),(Object)(__ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(false,"oJump" /*RemoteObject*/ ).getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 92;BA.debugLine="Log(\"Added to button : \" & nCLItem_Button.Tex";
Debug.ShouldStop(134217728);
structchecklistitems.__c.runVoidMethod ("LogImpl","6177537061",RemoteObject.concat(RemoteObject.createImmutable("Added to button : "),_nclitem_button.runMethod(true,"getText")),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 95;BA.debugLine="Dim OptionsAdd As List = BaseOptions.oOptions";
Debug.ShouldStop(1073741824);
_optionsadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_optionsadd = structchecklistitems.__c.runMethod(false, "ArrayToList", (Object)(__ref.getField(false,"_baseoptions" /*RemoteObject*/ ).getField(false,"oOptions" /*RemoteObject*/ )));Debug.locals.put("OptionsAdd", _optionsadd);Debug.locals.put("OptionsAdd", _optionsadd);
 BA.debugLineNum = 96;BA.debugLine="If (OptionsAdd.Get(Consts.POSOPTION_REPEAT) =";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_optionsadd.runMethod(false,"Get",(Object)(structchecklistitems._consts._posoption_repeat /*RemoteObject*/ )),RemoteObject.createImmutable((1))))) { 
 };
 }else {
 BA.debugLineNum = 105;BA.debugLine="Log($\"Error: Número de Views (${iCount}) difer";
Debug.ShouldStop(256);
structchecklistitems.__c.runVoidMethod ("LogImpl","6177537074",(RemoteObject.concat(RemoteObject.createImmutable("Error: Número de Views ("),structchecklistitems.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icount))),RemoteObject.createImmutable(") diferente do número de objectos ("),structchecklistitems.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ocount))),RemoteObject.createImmutable(")"))),0);
 };
 break; }
}
;
 BA.debugLineNum = 159;BA.debugLine="Return p";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextfield_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EditTextField_EnterPressed (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("edittextfield_enterpressed")) { return __ref.runUserSub(false, "structchecklistitems","edittextfield_enterpressed", __ref);}
 BA.debugLineNum = 202;BA.debugLine="Sub EditTextField_EnterPressed";
Debug.ShouldStop(512);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextfield_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EditTextField_FocusChanged (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("edittextfield_focuschanged")) { return __ref.runUserSub(false, "structchecklistitems","edittextfield_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 206;BA.debugLine="Sub EditTextField_FocusChanged (HasFocus As Boolea";
Debug.ShouldStop(8192);
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
public static RemoteObject  _edittextfield_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextField_TextChanged (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("edittextfield_textchanged")) { return __ref.runUserSub(false, "structchecklistitems","edittextfield_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 198;BA.debugLine="Sub EditTextField_TextChanged (Old As String, New";
Debug.ShouldStop(32);
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getallpressed(RemoteObject __ref,RemoteObject _obutton,RemoteObject _oparent) throws Exception{
try {
		Debug.PushSubsStack("getAllPressed (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("getallpressed")) { return __ref.runUserSub(false, "structchecklistitems","getallpressed", __ref, _obutton, _oparent);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _prnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _val = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
Debug.locals.put("obutton", _obutton);
Debug.locals.put("oparent", _oparent);
 BA.debugLineNum = 269;BA.debugLine="Sub getAllPressed(obutton As Object, oparent As Ob";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Dim ret As List";
Debug.ShouldStop(8192);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 271;BA.debugLine="ret.Initialize";
Debug.ShouldStop(16384);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 272;BA.debugLine="Dim prnt As Panel = oparent";
Debug.ShouldStop(32768);
_prnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_prnt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _oparent);Debug.locals.put("prnt", _prnt);
 BA.debugLineNum = 273;BA.debugLine="Dim btn As Button = obutton";
Debug.ShouldStop(65536);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _obutton);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 274;BA.debugLine="For Each v As View In prnt.GetAllViewsRecursive";
Debug.ShouldStop(131072);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group5 = _prnt.runMethod(false,"GetAllViewsRecursive");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), group5.runMethod(false,"Get",index5));
Debug.locals.put("v", _v);
 BA.debugLineNum = 275;BA.debugLine="If v Is Button Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.Button"))) { 
 BA.debugLineNum = 276;BA.debugLine="Dim val As Button = v";
Debug.ShouldStop(524288);
_val = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_val = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _v.getObject());Debug.locals.put("val", _val);
 BA.debugLineNum = 277;BA.debugLine="If Not(val = btn) Then";
Debug.ShouldStop(1048576);
if (structchecklistitems.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_val,_btn)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 278;BA.debugLine="If (getCfgValueOk(val.Tag) = 1) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getcfgvalueok" /*RemoteObject*/ ,(Object)((_val.runMethod(false,"getTag")))),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 279;BA.debugLine="ret.Add(v)";
Debug.ShouldStop(4194304);
_ret.runVoidMethod ("Add",(Object)((_v.getObject())));
 };
 };
 }else 
{ BA.debugLineNum = 283;BA.debugLine="Else If v Is CheckBox Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.CheckBox"))) { 
 }else 
{ BA.debugLineNum = 285;BA.debugLine="Else If v Is Label Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.TextView"))) { 
 }}}
;
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 289;BA.debugLine="Return ret";
Debug.ShouldStop(1);
if (true) return _ret;
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcfgcolor(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("getCfgColor (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("getcfgcolor")) { return __ref.runUserSub(false, "structchecklistitems","getcfgcolor", __ref, _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 314;BA.debugLine="Sub getCfgColor(obj As BtnCfgOption) As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="Return obj.Color";
Debug.ShouldStop(67108864);
if (true) return _obj.getField(true,"Color" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcfgjump(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("getCfgJump (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("getcfgjump")) { return __ref.runUserSub(false, "structchecklistitems","getcfgjump", __ref, _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 322;BA.debugLine="Sub getCfgJump(obj As BtnCfgOption) As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="Return obj.Jump";
Debug.ShouldStop(4);
if (true) return _obj.getField(true,"Jump" /*RemoteObject*/ );
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcfgvalueok(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("getCfgValueOk (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("getcfgvalueok")) { return __ref.runUserSub(false, "structchecklistitems","getcfgvalueok", __ref, _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 318;BA.debugLine="Sub getCfgValueOk(obj As BtnCfgOption) As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Return obj.ValueOk";
Debug.ShouldStop(1073741824);
if (true) return _obj.getField(true,"ValueOk" /*RemoteObject*/ );
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanelmulti(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("getPanelMulti (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("getpanelmulti")) { return __ref.runUserSub(false, "structchecklistitems","getpanelmulti", __ref, _obj);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cfg = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption");
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 299;BA.debugLine="Sub getPanelMulti(obj As Object) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 301;BA.debugLine="Dim pnl As Panel = obj";
Debug.ShouldStop(4096);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _obj);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 302;BA.debugLine="Dim cfg As PanCfgOption = pnl.Tag";
Debug.ShouldStop(8192);
_cfg = (_pnl.runMethod(false,"getTag"));Debug.locals.put("cfg", _cfg);Debug.locals.put("cfg", _cfg);
 BA.debugLineNum = 303;BA.debugLine="Return cfg.Multi";
Debug.ShouldStop(16384);
if (true) return _cfg.getField(true,"Multi" /*RemoteObject*/ );
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
public static RemoteObject  _getpanelnoask(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("getPanelNoAsk (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("getpanelnoask")) { return __ref.runUserSub(false, "structchecklistitems","getpanelnoask", __ref, _obj);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cfg = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption");
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 306;BA.debugLine="Sub getPanelNoAsk(obj As Object) As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 308;BA.debugLine="Dim pnl As Panel = obj";
Debug.ShouldStop(524288);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _obj);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 309;BA.debugLine="Dim cfg As PanCfgOption = pnl.Tag";
Debug.ShouldStop(1048576);
_cfg = (_pnl.runMethod(false,"getTag"));Debug.locals.put("cfg", _cfg);Debug.locals.put("cfg", _cfg);
 BA.debugLineNum = 310;BA.debugLine="Return cfg.NoAsk";
Debug.ShouldStop(2097152);
if (true) return _cfg.getField(true,"NoAsk" /*RemoteObject*/ );
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpaneltagcode(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("getPanelTagcode (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("getpaneltagcode")) { return __ref.runUserSub(false, "structchecklistitems","getpaneltagcode", __ref, _obj);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cfg = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption");
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 292;BA.debugLine="Sub getPanelTagcode(obj As Object) As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 294;BA.debugLine="Dim pnl As Panel = obj";
Debug.ShouldStop(32);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _obj);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 295;BA.debugLine="Dim cfg As PanCfgOption = pnl.Tag";
Debug.ShouldStop(64);
_cfg = (_pnl.runMethod(false,"getTag"));Debug.locals.put("cfg", _cfg);Debug.locals.put("cfg", _cfg);
 BA.debugLineNum = 296;BA.debugLine="Return cfg.TagCode";
Debug.ShouldStop(128);
if (true) return _cfg.getField(true,"TagCode" /*RemoteObject*/ );
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _activity,RemoteObject _view,RemoteObject _designer,RemoteObject _height,RemoteObject _rounded) throws Exception{
try {
		Debug.PushSubsStack("Initialize (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "structchecklistitems","initialize", __ref, _ba, _activity, _view, _designer, _height, _rounded);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Activity", _activity);
Debug.locals.put("View", _view);
Debug.locals.put("Designer", _designer);
Debug.locals.put("Height", _height);
Debug.locals.put("Rounded", _rounded);
 BA.debugLineNum = 47;BA.debugLine="Public Sub Initialize(Activity As Activity, View A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="BaseActivity = Activity";
Debug.ShouldStop(32768);
__ref.setField ("_baseactivity" /*RemoteObject*/ ,_activity);
 BA.debugLineNum = 49;BA.debugLine="BaseView = View";
Debug.ShouldStop(65536);
__ref.setField ("_baseview" /*RemoteObject*/ ,_view);
 BA.debugLineNum = 50;BA.debugLine="BaseDesigner = Designer";
Debug.ShouldStop(131072);
__ref.setField ("_basedesigner" /*RemoteObject*/ ,_designer);
 BA.debugLineNum = 51;BA.debugLine="BaseHeight = Height";
Debug.ShouldStop(262144);
__ref.setField ("_baseheight" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 52;BA.debugLine="ForceRound = Rounded";
Debug.ShouldStop(524288);
__ref.setField ("_forceround" /*RemoteObject*/ ,_rounded);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitems_selectedindexchanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ListItems_SelectedIndexChanged (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("listitems_selectedindexchanged")) { return __ref.runUserSub(false, "structchecklistitems","listitems_selectedindexchanged", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 326;BA.debugLine="Sub ListItems_SelectedIndexChanged (Index As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeallpressedup(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("MakeAllPressedUp (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("makeallpressedup")) { return __ref.runUserSub(false, "structchecklistitems","makeallpressedup", __ref, _lst);}
int _i = 0;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 256;BA.debugLine="Sub MakeAllPressedUp(lst As List)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="For i=0 To lst.Size-1";
Debug.ShouldStop(1);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 258;BA.debugLine="Dim btn As Button = lst.Get(i)";
Debug.ShouldStop(2);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 259;BA.debugLine="btn.Tag = ButtonConfigMake(getCfgColor(btn.Tag),";
Debug.ShouldStop(4);
_btn.runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_buttonconfigmake" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getcfgcolor" /*RemoteObject*/ ,(Object)((_btn.runMethod(false,"getTag"))))),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getcfgjump" /*RemoteObject*/ ,(Object)((_btn.runMethod(false,"getTag"))))))));
 BA.debugLineNum = 260;BA.debugLine="btn.Color = Consts.ColorBlue";
Debug.ShouldStop(8);
_btn.runVoidMethod ("setColor",structchecklistitems._consts._colorblue /*RemoteObject*/ );
 }
}Debug.locals.put("i", _i);
;
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
public static void  _makebuttonaction(RemoteObject __ref,RemoteObject _btn,RemoteObject _cfgcolor,RemoteObject _cfgjump) throws Exception{
try {
		Debug.PushSubsStack("MakeButtonAction (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("makebuttonaction")) { __ref.runUserSub(false, "structchecklistitems","makebuttonaction", __ref, _btn, _cfgcolor, _cfgjump); return;}
ResumableSub_MakeButtonAction rsub = new ResumableSub_MakeButtonAction(null,__ref,_btn,_cfgcolor,_cfgjump);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MakeButtonAction extends BA.ResumableSub {
public ResumableSub_MakeButtonAction(xevolution.vrcg.devdemov2400.structchecklistitems parent,RemoteObject __ref,RemoteObject _btn,RemoteObject _cfgcolor,RemoteObject _cfgjump) {
this.parent = parent;
this.__ref = __ref;
this._btn = _btn;
this._cfgcolor = _cfgcolor;
this._cfgjump = _cfgjump;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.structchecklistitems parent;
RemoteObject _btn;
RemoteObject _cfgcolor;
RemoteObject _cfgjump;
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _iresult = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeButtonAction (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,234);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("btn", _btn);
Debug.locals.put("cfgColor", _cfgcolor);
Debug.locals.put("cfgJump", _cfgjump);
 BA.debugLineNum = 235;BA.debugLine="Dim lst As List = getAllPressed(btn, btn.Parent)";
Debug.ShouldStop(1024);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = __ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getallpressed" /*RemoteObject*/ ,(Object)((_btn.getObject())),(Object)(_btn.runMethod(false,"getParent")));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 236;BA.debugLine="If (lst.Size > 0) Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 16;
if ((RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 237;BA.debugLine="If Not(getPanelNoAsk(btn.Parent)) Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 13;
if (parent.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_getpanelnoask" /*RemoteObject*/ ,(Object)(_btn.runMethod(false,"getParent"))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 238;BA.debugLine="Msgbox2(\"Já existe uma opção como resposta! Des";
Debug.ShouldStop(8192);
parent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Já existe uma opção como resposta! Deseja substituir a resposta dada pela opção seleccionada?")),(Object)(BA.ObjectToCharSequence("Alerta!")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("Não")),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 239;BA.debugLine="Wait For Msgbox_Result(iResult As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structchecklistitems", "makebuttonaction"), null);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_iresult = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("iResult", _iresult);
;
 BA.debugLineNum = 240;BA.debugLine="If ((-iResult) = 1) Then";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 10;
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable((-(double) (0 + _iresult.<Integer>get().intValue()))),BA.numberCast(double.class, 1)))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 241;BA.debugLine="MakeAllPressedUp(lst)";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_makeallpressedup" /*RemoteObject*/ ,(Object)(_lst));
 BA.debugLineNum = 242;BA.debugLine="btn.Color = cfgColor";
Debug.ShouldStop(131072);
_btn.runVoidMethod ("setColor",_cfgcolor);
 BA.debugLineNum = 243;BA.debugLine="btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJum";
Debug.ShouldStop(262144);
_btn.runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_buttonconfigmake" /*RemoteObject*/ ,(Object)(_cfgcolor),(Object)(BA.numberCast(int.class, 1)),(Object)(_cfgjump))));
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 246;BA.debugLine="MakeAllPressedUp(lst)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_makeallpressedup" /*RemoteObject*/ ,(Object)(_lst));
 BA.debugLineNum = 247;BA.debugLine="btn.Color = cfgColor";
Debug.ShouldStop(4194304);
_btn.runVoidMethod ("setColor",_cfgcolor);
 BA.debugLineNum = 248;BA.debugLine="btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJump";
Debug.ShouldStop(8388608);
_btn.runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_buttonconfigmake" /*RemoteObject*/ ,(Object)(_cfgcolor),(Object)(BA.numberCast(int.class, 1)),(Object)(_cfgjump))));
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 251;BA.debugLine="btn.Color = cfgColor";
Debug.ShouldStop(67108864);
_btn.runVoidMethod ("setColor",_cfgcolor);
 BA.debugLineNum = 252;BA.debugLine="btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJump)";
Debug.ShouldStop(134217728);
_btn.runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structchecklistitems.class, "_buttonconfigmake" /*RemoteObject*/ ,(Object)(_cfgcolor),(Object)(BA.numberCast(int.class, 1)),(Object)(_cfgjump))));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 254;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _iresult) throws Exception{
}
public static RemoteObject  _otionstypemake(RemoteObject __ref,RemoteObject _tagcode,RemoteObject _title,RemoteObject _description,RemoteObject _ocount,RemoteObject _otype,RemoteObject _omulti,RemoteObject _ojump,RemoteObject _onames,RemoteObject _ocolors,RemoteObject _ovalues,RemoteObject _ooptions,RemoteObject _noask) throws Exception{
try {
		Debug.PushSubsStack("OtionsTypeMake (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("otionstypemake")) { return __ref.runUserSub(false, "structchecklistitems","otionstypemake", __ref, _tagcode, _title, _description, _ocount, _otype, _omulti, _ojump, _onames, _ocolors, _ovalues, _ooptions, _noask);}
RemoteObject _opts = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions");
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("Title", _title);
Debug.locals.put("Description", _description);
Debug.locals.put("oCount", _ocount);
Debug.locals.put("oType", _otype);
Debug.locals.put("oMulti", _omulti);
Debug.locals.put("oJump", _ojump);
Debug.locals.put("oNames", _onames);
Debug.locals.put("oColors", _ocolors);
Debug.locals.put("oValues", _ovalues);
Debug.locals.put("oOptions", _ooptions);
Debug.locals.put("NoAsk", _noask);
 BA.debugLineNum = 162;BA.debugLine="Public Sub OtionsTypeMake(Tagcode As String, Title";
Debug.ShouldStop(2);
 BA.debugLineNum = 165;BA.debugLine="Dim opts As CLTypeOptions";
Debug.ShouldStop(16);
_opts = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions");Debug.locals.put("opts", _opts);
 BA.debugLineNum = 166;BA.debugLine="opts.Title = Title";
Debug.ShouldStop(32);
_opts.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 167;BA.debugLine="opts.Description = Description";
Debug.ShouldStop(64);
_opts.setField ("Description" /*RemoteObject*/ ,_description);
 BA.debugLineNum = 168;BA.debugLine="opts.Tagcode = Tagcode";
Debug.ShouldStop(128);
_opts.setField ("Tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 169;BA.debugLine="opts.oCount = oCount";
Debug.ShouldStop(256);
_opts.setField ("oCount" /*RemoteObject*/ ,_ocount);
 BA.debugLineNum = 170;BA.debugLine="opts.oType = oType";
Debug.ShouldStop(512);
_opts.setField ("oType" /*RemoteObject*/ ,_otype);
 BA.debugLineNum = 171;BA.debugLine="opts.oMulti = oMulti";
Debug.ShouldStop(1024);
_opts.setField ("oMulti" /*RemoteObject*/ ,_omulti);
 BA.debugLineNum = 172;BA.debugLine="opts.oJump = oJump";
Debug.ShouldStop(2048);
_opts.setField ("oJump" /*RemoteObject*/ ,_ojump);
 BA.debugLineNum = 173;BA.debugLine="opts.oNames = oNames";
Debug.ShouldStop(4096);
_opts.setField ("oNames" /*RemoteObject*/ ,_onames);
 BA.debugLineNum = 174;BA.debugLine="opts.oColors = oColors";
Debug.ShouldStop(8192);
_opts.setField ("oColors" /*RemoteObject*/ ,_ocolors);
 BA.debugLineNum = 175;BA.debugLine="opts.oValues = oValues";
Debug.ShouldStop(16384);
_opts.setField ("oValues" /*RemoteObject*/ ,_ovalues);
 BA.debugLineNum = 176;BA.debugLine="opts.oOptions = oOptions";
Debug.ShouldStop(32768);
_opts.setField ("oOptions" /*RemoteObject*/ ,_ooptions);
 BA.debugLineNum = 177;BA.debugLine="opts.NoAsk = NoAsk";
Debug.ShouldStop(65536);
_opts.setField ("NoAsk" /*RemoteObject*/ ,_noask);
 BA.debugLineNum = 178;BA.debugLine="Return opts";
Debug.ShouldStop(131072);
if (true) return _opts;
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelconfigmake(RemoteObject __ref,RemoteObject _tagcode,RemoteObject _multi,RemoteObject _noask) throws Exception{
try {
		Debug.PushSubsStack("PanelConfigMake (structchecklistitems) ","structchecklistitems",55,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("panelconfigmake")) { return __ref.runUserSub(false, "structchecklistitems","panelconfigmake", __ref, _tagcode, _multi, _noask);}
RemoteObject _opts = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption");
Debug.locals.put("TagCode", _tagcode);
Debug.locals.put("Multi", _multi);
Debug.locals.put("NoAsk", _noask);
 BA.debugLineNum = 190;BA.debugLine="Sub PanelConfigMake(TagCode As String, Multi As Bo";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="Dim opts As PanCfgOption";
Debug.ShouldStop(1073741824);
_opts = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption");Debug.locals.put("opts", _opts);
 BA.debugLineNum = 192;BA.debugLine="opts.TagCode = TagCode";
Debug.ShouldStop(-2147483648);
_opts.setField ("TagCode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 193;BA.debugLine="opts.Multi = Multi";
Debug.ShouldStop(1);
_opts.setField ("Multi" /*RemoteObject*/ ,_multi);
 BA.debugLineNum = 194;BA.debugLine="opts.NoAsk = NoAsk";
Debug.ShouldStop(2);
_opts.setField ("NoAsk" /*RemoteObject*/ ,_noask);
 BA.debugLineNum = 195;BA.debugLine="Return opts";
Debug.ShouldStop(4);
if (true) return _opts;
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}