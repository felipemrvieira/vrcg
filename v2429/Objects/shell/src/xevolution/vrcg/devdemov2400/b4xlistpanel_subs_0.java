package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xlistpanel_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xlistpanel","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 93;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 34;BA.debugLine="Private mEventName As String 'ignore";
b4xlistpanel._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xlistpanel._meventname);
 //BA.debugLineNum = 35;BA.debugLine="Private mCallBack As Object 'ignore";
b4xlistpanel._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xlistpanel._mcallback);
 //BA.debugLineNum = 36;BA.debugLine="Private xui As XUI 'ignore";
b4xlistpanel._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xlistpanel._xui);
 //BA.debugLineNum = 37;BA.debugLine="Public mBase As B4XView";
b4xlistpanel._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xlistpanel._mbase);
 //BA.debugLineNum = 38;BA.debugLine="Public Tag As Object";
b4xlistpanel._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xlistpanel._tag);
 //BA.debugLineNum = 40;BA.debugLine="Private mLeft, mTop, mWidth, mHeight, mRadius As";
b4xlistpanel._mleft = RemoteObject.createImmutable(0);__ref.setField("_mleft",b4xlistpanel._mleft);
b4xlistpanel._mtop = RemoteObject.createImmutable(0);__ref.setField("_mtop",b4xlistpanel._mtop);
b4xlistpanel._mwidth = RemoteObject.createImmutable(0);__ref.setField("_mwidth",b4xlistpanel._mwidth);
b4xlistpanel._mheight = RemoteObject.createImmutable(0);__ref.setField("_mheight",b4xlistpanel._mheight);
b4xlistpanel._mradius = RemoteObject.createImmutable(0);__ref.setField("_mradius",b4xlistpanel._mradius);
 //BA.debugLineNum = 43;BA.debugLine="Public IsGroup As Boolean = True";
b4xlistpanel._isgroup = b4xlistpanel.__c.getField(true,"True");__ref.setField("_isgroup",b4xlistpanel._isgroup);
 //BA.debugLineNum = 44;BA.debugLine="Public IsSubGroup As Boolean = True";
b4xlistpanel._issubgroup = b4xlistpanel.__c.getField(true,"True");__ref.setField("_issubgroup",b4xlistpanel._issubgroup);
 //BA.debugLineNum = 45;BA.debugLine="Public IsActive As Boolean = True";
b4xlistpanel._isactive = b4xlistpanel.__c.getField(true,"True");__ref.setField("_isactive",b4xlistpanel._isactive);
 //BA.debugLineNum = 46;BA.debugLine="Public IsVisible As Boolean = True";
b4xlistpanel._isvisible = b4xlistpanel.__c.getField(true,"True");__ref.setField("_isvisible",b4xlistpanel._isvisible);
 //BA.debugLineNum = 47;BA.debugLine="Public IsExpanded As Boolean = True";
b4xlistpanel._isexpanded = b4xlistpanel.__c.getField(true,"True");__ref.setField("_isexpanded",b4xlistpanel._isexpanded);
 //BA.debugLineNum = 48;BA.debugLine="Public IsReadOnly As Boolean = False";
b4xlistpanel._isreadonly = b4xlistpanel.__c.getField(true,"False");__ref.setField("_isreadonly",b4xlistpanel._isreadonly);
 //BA.debugLineNum = 49;BA.debugLine="Public IsRepeated As Boolean = False";
b4xlistpanel._isrepeated = b4xlistpanel.__c.getField(true,"False");__ref.setField("_isrepeated",b4xlistpanel._isrepeated);
 //BA.debugLineNum = 50;BA.debugLine="Private mID As Int = 0";
b4xlistpanel._mid = BA.numberCast(int.class, 0);__ref.setField("_mid",b4xlistpanel._mid);
 //BA.debugLineNum = 51;BA.debugLine="Private mGroup As Int = 0";
b4xlistpanel._mgroup = BA.numberCast(int.class, 0);__ref.setField("_mgroup",b4xlistpanel._mgroup);
 //BA.debugLineNum = 52;BA.debugLine="Private mSubGroup As Int = 0";
b4xlistpanel._msubgroup = BA.numberCast(int.class, 0);__ref.setField("_msubgroup",b4xlistpanel._msubgroup);
 //BA.debugLineNum = 53;BA.debugLine="Private mLevel As Int = 0";
b4xlistpanel._mlevel = BA.numberCast(int.class, 0);__ref.setField("_mlevel",b4xlistpanel._mlevel);
 //BA.debugLineNum = 54;BA.debugLine="Private mPosition As Int = 0";
b4xlistpanel._mposition = BA.numberCast(int.class, 0);__ref.setField("_mposition",b4xlistpanel._mposition);
 //BA.debugLineNum = 55;BA.debugLine="Private mRepeatCount As Int = 0";
b4xlistpanel._mrepeatcount = BA.numberCast(int.class, 0);__ref.setField("_mrepeatcount",b4xlistpanel._mrepeatcount);
 //BA.debugLineNum = 56;BA.debugLine="Private mRepeatItemCount As Int = 0";
b4xlistpanel._mrepeatitemcount = BA.numberCast(int.class, 0);__ref.setField("_mrepeatitemcount",b4xlistpanel._mrepeatitemcount);
 //BA.debugLineNum = 57;BA.debugLine="Private mRepeatFieldCount As Int = 0";
b4xlistpanel._mrepeatfieldcount = BA.numberCast(int.class, 0);__ref.setField("_mrepeatfieldcount",b4xlistpanel._mrepeatfieldcount);
 //BA.debugLineNum = 58;BA.debugLine="Private mBulletMaster As Int = 0";
b4xlistpanel._mbulletmaster = BA.numberCast(int.class, 0);__ref.setField("_mbulletmaster",b4xlistpanel._mbulletmaster);
 //BA.debugLineNum = 59;BA.debugLine="Private mBulletChild As Int = 0";
b4xlistpanel._mbulletchild = BA.numberCast(int.class, 0);__ref.setField("_mbulletchild",b4xlistpanel._mbulletchild);
 //BA.debugLineNum = 60;BA.debugLine="Private mBulletInner As Int = 0";
b4xlistpanel._mbulletinner = BA.numberCast(int.class, 0);__ref.setField("_mbulletinner",b4xlistpanel._mbulletinner);
 //BA.debugLineNum = 61;BA.debugLine="Private mBulletLevel As Int = 0";
b4xlistpanel._mbulletlevel = BA.numberCast(int.class, 0);__ref.setField("_mbulletlevel",b4xlistpanel._mbulletlevel);
 //BA.debugLineNum = 62;BA.debugLine="Private mCodeId As Int = 0";
b4xlistpanel._mcodeid = BA.numberCast(int.class, 0);__ref.setField("_mcodeid",b4xlistpanel._mcodeid);
 //BA.debugLineNum = 63;BA.debugLine="Public Reference As String = \"\"";
b4xlistpanel._reference = BA.ObjectToString("");__ref.setField("_reference",b4xlistpanel._reference);
 //BA.debugLineNum = 64;BA.debugLine="Public Tagcode1 As String = \"\"";
b4xlistpanel._tagcode1 = BA.ObjectToString("");__ref.setField("_tagcode1",b4xlistpanel._tagcode1);
 //BA.debugLineNum = 65;BA.debugLine="Public Tagcode2 As String = \"\"";
b4xlistpanel._tagcode2 = BA.ObjectToString("");__ref.setField("_tagcode2",b4xlistpanel._tagcode2);
 //BA.debugLineNum = 66;BA.debugLine="Public Tagcode3 As String = \"\"";
b4xlistpanel._tagcode3 = BA.ObjectToString("");__ref.setField("_tagcode3",b4xlistpanel._tagcode3);
 //BA.debugLineNum = 67;BA.debugLine="Public Tagcode4 As String = \"\"";
b4xlistpanel._tagcode4 = BA.ObjectToString("");__ref.setField("_tagcode4",b4xlistpanel._tagcode4);
 //BA.debugLineNum = 68;BA.debugLine="Public Tagcode5 As String = \"\"";
b4xlistpanel._tagcode5 = BA.ObjectToString("");__ref.setField("_tagcode5",b4xlistpanel._tagcode5);
 //BA.debugLineNum = 69;BA.debugLine="Public Tagcode6 As String = \"\"";
b4xlistpanel._tagcode6 = BA.ObjectToString("");__ref.setField("_tagcode6",b4xlistpanel._tagcode6);
 //BA.debugLineNum = 70;BA.debugLine="Public Tagcode7 As String = \"\"";
b4xlistpanel._tagcode7 = BA.ObjectToString("");__ref.setField("_tagcode7",b4xlistpanel._tagcode7);
 //BA.debugLineNum = 71;BA.debugLine="Public Value As String = \"\"";
b4xlistpanel._value = BA.ObjectToString("");__ref.setField("_value",b4xlistpanel._value);
 //BA.debugLineNum = 72;BA.debugLine="Private mLastValue As String = \"\"";
b4xlistpanel._mlastvalue = BA.ObjectToString("");__ref.setField("_mlastvalue",b4xlistpanel._mlastvalue);
 //BA.debugLineNum = 73;BA.debugLine="Public AllowClick As Boolean = True";
b4xlistpanel._allowclick = b4xlistpanel.__c.getField(true,"True");__ref.setField("_allowclick",b4xlistpanel._allowclick);
 //BA.debugLineNum = 74;BA.debugLine="Public AllowHide As Boolean = True";
b4xlistpanel._allowhide = b4xlistpanel.__c.getField(true,"True");__ref.setField("_allowhide",b4xlistpanel._allowhide);
 //BA.debugLineNum = 76;BA.debugLine="Public Other As Object";
b4xlistpanel._other = RemoteObject.createNew ("Object");__ref.setField("_other",b4xlistpanel._other);
 //BA.debugLineNum = 77;BA.debugLine="Private mState As Int = 0";
b4xlistpanel._mstate = BA.numberCast(int.class, 0);__ref.setField("_mstate",b4xlistpanel._mstate);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xlistpanel","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 86;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="mBase = Base";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 88;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(8388608);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 89;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 90;BA.debugLine="getDesignProperties(Props)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xlistpanel.class, "_getdesignproperties" /*RemoteObject*/ ,(Object)(_props));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdesignproperties(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("getDesignProperties (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("getdesignproperties")) { return __ref.runUserSub(false, "b4xlistpanel","getdesignproperties", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 97;BA.debugLine="Sub getDesignProperties(Props As Map)";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="IsGroup = Props.Get(\"IsGroup\")";
Debug.ShouldStop(2);
__ref.setField ("_isgroup" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IsGroup"))))));
 BA.debugLineNum = 99;BA.debugLine="IsSubGroup = Props.Get(\"IsSubGroup\")";
Debug.ShouldStop(4);
__ref.setField ("_issubgroup" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IsSubGroup"))))));
 BA.debugLineNum = 100;BA.debugLine="IsActive = Props.Get(\"IsActive\")";
Debug.ShouldStop(8);
__ref.setField ("_isactive" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IsActive"))))));
 BA.debugLineNum = 101;BA.debugLine="IsVisible = Props.Get(\"IsVisible\")";
Debug.ShouldStop(16);
__ref.setField ("_isvisible" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IsVisible"))))));
 BA.debugLineNum = 102;BA.debugLine="IsExpanded = Props.Get(\"IsExpanded\")";
Debug.ShouldStop(32);
__ref.setField ("_isexpanded" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IsExpanded"))))));
 BA.debugLineNum = 103;BA.debugLine="IsReadOnly = Props.Get(\"IsReadOnly\")";
Debug.ShouldStop(64);
__ref.setField ("_isreadonly" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IsReadOnly"))))));
 BA.debugLineNum = 104;BA.debugLine="IsRepeated = Props.Get(\"IsRepeated\")";
Debug.ShouldStop(128);
__ref.setField ("_isrepeated" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IsRepeated"))))));
 BA.debugLineNum = 105;BA.debugLine="Reference = Props.Get(\"Reference\")";
Debug.ShouldStop(256);
__ref.setField ("_reference" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Reference"))))));
 BA.debugLineNum = 106;BA.debugLine="Tagcode1 = Props.Get(\"Tagcode1\")";
Debug.ShouldStop(512);
__ref.setField ("_tagcode1" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tagcode1"))))));
 BA.debugLineNum = 107;BA.debugLine="Tagcode2 = Props.Get(\"Tagcode2\")";
Debug.ShouldStop(1024);
__ref.setField ("_tagcode2" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tagcode2"))))));
 BA.debugLineNum = 108;BA.debugLine="Tagcode3 = Props.Get(\"Tagcode3\")";
Debug.ShouldStop(2048);
__ref.setField ("_tagcode3" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tagcode3"))))));
 BA.debugLineNum = 109;BA.debugLine="Tagcode4 = Props.Get(\"Tagcode4\")";
Debug.ShouldStop(4096);
__ref.setField ("_tagcode4" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tagcode4"))))));
 BA.debugLineNum = 110;BA.debugLine="Tagcode5 = Props.Get(\"Tagcode5\")";
Debug.ShouldStop(8192);
__ref.setField ("_tagcode5" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tagcode5"))))));
 BA.debugLineNum = 111;BA.debugLine="Tagcode6 = Props.Get(\"Tagcode6\")";
Debug.ShouldStop(16384);
__ref.setField ("_tagcode6" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tagcode6"))))));
 BA.debugLineNum = 112;BA.debugLine="Tagcode7 = Props.Get(\"Tagcode7\")";
Debug.ShouldStop(32768);
__ref.setField ("_tagcode7" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tagcode7"))))));
 BA.debugLineNum = 113;BA.debugLine="Value = Props.Get(\"Value\")";
Debug.ShouldStop(65536);
__ref.setField ("_value" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value"))))));
 BA.debugLineNum = 114;BA.debugLine="AllowClick = Props.Get(\"AllowClick\")";
Debug.ShouldStop(131072);
__ref.setField ("_allowclick" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AllowClick"))))));
 BA.debugLineNum = 115;BA.debugLine="AllowHide = Props.Get(\"AllowHide\")";
Debug.ShouldStop(262144);
__ref.setField ("_allowhide" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AllowHide"))))));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getParent (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("getparent")) { return __ref.runUserSub(false, "b4xlistpanel","getparent", __ref);}
 BA.debugLineNum = 118;BA.debugLine="Public Sub getParent As B4XView";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Return mBase.Parent";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent");
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getState (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("getstate")) { return __ref.runUserSub(false, "b4xlistpanel","getstate", __ref);}
 BA.debugLineNum = 122;BA.debugLine="Public Sub getState As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Return mState";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(true,"_mstate" /*RemoteObject*/ );
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xlistpanel","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 80;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(65536);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 82;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(131072);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setexpandstate(RemoteObject __ref,RemoteObject _thisstate) throws Exception{
try {
		Debug.PushSubsStack("setExpandState (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("setexpandstate")) { return __ref.runUserSub(false, "b4xlistpanel","setexpandstate", __ref, _thisstate);}
Debug.locals.put("thisState", _thisstate);
 BA.debugLineNum = 150;BA.debugLine="Public Sub setExpandState(thisState As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="IsExpanded = thisState";
Debug.ShouldStop(4194304);
__ref.setField ("_isexpanded" /*RemoteObject*/ ,_thisstate);
 BA.debugLineNum = 152;BA.debugLine="If IsExpanded Then";
Debug.ShouldStop(8388608);
if (__ref.getField(true,"_isexpanded" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 153;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnExpand\"";
Debug.ShouldStop(16777216);
if (b4xlistpanel.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnExpand")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 154;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnExpand\", m";
Debug.ShouldStop(33554432);
b4xlistpanel.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnExpand"))),(Object)((__ref.getField(true,"_mstate" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mid" /*RemoteObject*/ ))));
 };
 }else {
 BA.debugLineNum = 157;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnCollaps";
Debug.ShouldStop(268435456);
if (b4xlistpanel.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnCollapse")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 158;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnCollapse\",";
Debug.ShouldStop(536870912);
b4xlistpanel.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnCollapse"))),(Object)((__ref.getField(true,"_mstate" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mid" /*RemoteObject*/ ))));
 };
 };
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setreadonlystate(RemoteObject __ref,RemoteObject _thisstate) throws Exception{
try {
		Debug.PushSubsStack("setReadOnlyState (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("setreadonlystate")) { return __ref.runUserSub(false, "b4xlistpanel","setreadonlystate", __ref, _thisstate);}
Debug.locals.put("thisState", _thisstate);
 BA.debugLineNum = 143;BA.debugLine="Public Sub setReadOnlyState(thisState As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="IsReadOnly = thisState";
Debug.ShouldStop(32768);
__ref.setField ("_isreadonly" /*RemoteObject*/ ,_thisstate);
 BA.debugLineNum = 145;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnReadOnly";
Debug.ShouldStop(65536);
if (b4xlistpanel.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnReadOnly")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 146;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnReadOnly\",";
Debug.ShouldStop(131072);
b4xlistpanel.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnReadOnly"))),(Object)((__ref.getField(true,"_mstate" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mid" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstate(RemoteObject __ref,RemoteObject _thisstate) throws Exception{
try {
		Debug.PushSubsStack("setState (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setstate")) { return __ref.runUserSub(false, "b4xlistpanel","setstate", __ref, _thisstate);}
Debug.locals.put("thisState", _thisstate);
 BA.debugLineNum = 126;BA.debugLine="Public Sub setState(thisState As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="mState = thisState";
Debug.ShouldStop(1073741824);
__ref.setField ("_mstate" /*RemoteObject*/ ,_thisstate);
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisiblestate(RemoteObject __ref,RemoteObject _thisstate) throws Exception{
try {
		Debug.PushSubsStack("setVisibleState (b4xlistpanel) ","b4xlistpanel",19,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("setvisiblestate")) { return __ref.runUserSub(false, "b4xlistpanel","setvisiblestate", __ref, _thisstate);}
Debug.locals.put("thisState", _thisstate);
 BA.debugLineNum = 130;BA.debugLine="Public Sub setVisibleState(thisState As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="IsVisible = thisState";
Debug.ShouldStop(4);
__ref.setField ("_isvisible" /*RemoteObject*/ ,_thisstate);
 BA.debugLineNum = 132;BA.debugLine="If IsVisible Then";
Debug.ShouldStop(8);
if (__ref.getField(true,"_isvisible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 133;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnVisible";
Debug.ShouldStop(16);
if (b4xlistpanel.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnVisible")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 134;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnVisible\",";
Debug.ShouldStop(32);
b4xlistpanel.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnVisible"))),(Object)((__ref.getField(true,"_mstate" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mid" /*RemoteObject*/ ))));
 };
 }else {
 BA.debugLineNum = 137;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnHide\")";
Debug.ShouldStop(256);
if (b4xlistpanel.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnHide")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 138;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnHide\", mSt";
Debug.ShouldStop(512);
b4xlistpanel.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_OnHide"))),(Object)((__ref.getField(true,"_mstate" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mid" /*RemoteObject*/ ))));
 };
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}