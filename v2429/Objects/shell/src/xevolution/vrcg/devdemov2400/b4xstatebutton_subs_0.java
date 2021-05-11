package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xstatebutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xstatebutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 146;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(131072);
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
public static RemoteObject  _changegroupstates(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("changeGroupStates (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("changegroupstates")) { return __ref.runUserSub(false, "b4xstatebutton","changegroupstates", __ref);}
RemoteObject _par = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _par2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _st = RemoteObject.declareNull("Object");
RemoteObject _bgrp = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
RemoteObject _bm2 = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
 BA.debugLineNum = 314;BA.debugLine="Sub changeGroupStates";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="If mButtonGroup > 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mbuttongroup" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 316;BA.debugLine="Dim par As B4XView = mButton.Parent";
Debug.ShouldStop(134217728);
_par = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_par = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getParent"));Debug.locals.put("par", _par);
 BA.debugLineNum = 317;BA.debugLine="Dim par2 As B4XView = par.Parent";
Debug.ShouldStop(268435456);
_par2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_par2 = _par.runMethod(false,"getParent");Debug.locals.put("par2", _par2);Debug.locals.put("par2", _par2);
 BA.debugLineNum = 318;BA.debugLine="For Each pan As B4XView In par2.GetAllViewsRecur";
Debug.ShouldStop(536870912);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group4 = _par2.runMethod(false,"GetAllViewsRecursive");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group4.runMethod(false,"Get",index4));
Debug.locals.put("pan", _pan);
 BA.debugLineNum = 320;BA.debugLine="If (pan Is Button) And (pan.Text <> mButton.Tex";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("i",_pan.getObjectOrNull(), RemoteObject.createImmutable("android.widget.Button"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_pan.runMethod(true,"getText"),__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"getText")))))) { 
 BA.debugLineNum = 321;BA.debugLine="Dim st As Object = pan.Tag";
Debug.ShouldStop(1);
_st = _pan.runMethod(false,"getTag");Debug.locals.put("st", _st);Debug.locals.put("st", _st);
 BA.debugLineNum = 322;BA.debugLine="If (st Is SBG) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("i",_st, RemoteObject.createImmutable("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg")))) { 
 BA.debugLineNum = 324;BA.debugLine="Dim bgrp As SBG = pan.Tag";
Debug.ShouldStop(8);
_bgrp = (_pan.runMethod(false,"getTag"));Debug.locals.put("bgrp", _bgrp);Debug.locals.put("bgrp", _bgrp);
 BA.debugLineNum = 325;BA.debugLine="Dim bm2 As SBG = mButton.Tag";
Debug.ShouldStop(16);
_bm2 = (__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("bm2", _bm2);Debug.locals.put("bm2", _bm2);
 BA.debugLineNum = 326;BA.debugLine="If (bgrp.Group = bm2.Group) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",_bgrp.getField(true,"Group" /*RemoteObject*/ ),BA.numberCast(double.class, _bm2.getField(true,"Group" /*RemoteObject*/ ))))) { 
 BA.debugLineNum = 328;BA.debugLine="If (bgrp.State=1) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",_bgrp.getField(true,"State" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 329;BA.debugLine="LastButton = pan";
Debug.ShouldStop(256);
__ref.getField(false,"_lastbutton" /*RemoteObject*/ ).setObject (_pan.getObject());
 };
 BA.debugLineNum = 332;BA.debugLine="ResetButtonGroup( pan )";
Debug.ShouldStop(2048);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_resetbuttongroup" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _pan.getObject()));
 };
 };
 };
 }
}Debug.locals.put("pan", _pan);
;
 };
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 49;BA.debugLine="Type SBG(State As Int, Group As Int, Reference As";
;
 //BA.debugLineNum = 50;BA.debugLine="Private mEventName As String 'ignore";
b4xstatebutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xstatebutton._meventname);
 //BA.debugLineNum = 51;BA.debugLine="Private mCallBack As Object 'ignore";
b4xstatebutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xstatebutton._mcallback);
 //BA.debugLineNum = 52;BA.debugLine="Private mBase As B4XView 'ignore";
b4xstatebutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xstatebutton._mbase);
 //BA.debugLineNum = 53;BA.debugLine="Private mBaseLabel As Label 'ignore";
b4xstatebutton._mbaselabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_mbaselabel",b4xstatebutton._mbaselabel);
 //BA.debugLineNum = 54;BA.debugLine="Private mParent As B4XView 'ignore";
b4xstatebutton._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",b4xstatebutton._mparent);
 //BA.debugLineNum = 55;BA.debugLine="Private xui As XUI 'ignore";
b4xstatebutton._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xstatebutton._xui);
 //BA.debugLineNum = 56;BA.debugLine="Private mButton As Button";
b4xstatebutton._mbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_mbutton",b4xstatebutton._mbutton);
 //BA.debugLineNum = 57;BA.debugLine="Private mState As Int";
b4xstatebutton._mstate = RemoteObject.createImmutable(0);__ref.setField("_mstate",b4xstatebutton._mstate);
 //BA.debugLineNum = 59;BA.debugLine="Private mReference As String";
b4xstatebutton._mreference = RemoteObject.createImmutable("");__ref.setField("_mreference",b4xstatebutton._mreference);
 //BA.debugLineNum = 60;BA.debugLine="Private mConformity As Int = 0";
b4xstatebutton._mconformity = BA.numberCast(int.class, 0);__ref.setField("_mconformity",b4xstatebutton._mconformity);
 //BA.debugLineNum = 62;BA.debugLine="Private mBooleanState As Boolean";
b4xstatebutton._mbooleanstate = RemoteObject.createImmutable(false);__ref.setField("_mbooleanstate",b4xstatebutton._mbooleanstate);
 //BA.debugLineNum = 69;BA.debugLine="Private mDefaultColor As Int";
b4xstatebutton._mdefaultcolor = RemoteObject.createImmutable(0);__ref.setField("_mdefaultcolor",b4xstatebutton._mdefaultcolor);
 //BA.debugLineNum = 70;BA.debugLine="Private mTextStateColor As Int";
b4xstatebutton._mtextstatecolor = RemoteObject.createImmutable(0);__ref.setField("_mtextstatecolor",b4xstatebutton._mtextstatecolor);
 //BA.debugLineNum = 71;BA.debugLine="Private mFirstStateColor As Int";
b4xstatebutton._mfirststatecolor = RemoteObject.createImmutable(0);__ref.setField("_mfirststatecolor",b4xstatebutton._mfirststatecolor);
 //BA.debugLineNum = 72;BA.debugLine="Private mSecondStateColor As Int";
b4xstatebutton._msecondstatecolor = RemoteObject.createImmutable(0);__ref.setField("_msecondstatecolor",b4xstatebutton._msecondstatecolor);
 //BA.debugLineNum = 73;BA.debugLine="Private mThirdStateColor As Int";
b4xstatebutton._mthirdstatecolor = RemoteObject.createImmutable(0);__ref.setField("_mthirdstatecolor",b4xstatebutton._mthirdstatecolor);
 //BA.debugLineNum = 74;BA.debugLine="Private mBorderColor As Int";
b4xstatebutton._mbordercolor = RemoteObject.createImmutable(0);__ref.setField("_mbordercolor",b4xstatebutton._mbordercolor);
 //BA.debugLineNum = 75;BA.debugLine="Private mBorderSize As Int";
b4xstatebutton._mbordersize = RemoteObject.createImmutable(0);__ref.setField("_mbordersize",b4xstatebutton._mbordersize);
 //BA.debugLineNum = 76;BA.debugLine="Private mShowBorder As Boolean";
b4xstatebutton._mshowborder = RemoteObject.createImmutable(false);__ref.setField("_mshowborder",b4xstatebutton._mshowborder);
 //BA.debugLineNum = 77;BA.debugLine="Private mRadiusSize As Int";
b4xstatebutton._mradiussize = RemoteObject.createImmutable(0);__ref.setField("_mradiussize",b4xstatebutton._mradiussize);
 //BA.debugLineNum = 78;BA.debugLine="Private mUseDIP As Boolean";
b4xstatebutton._musedip = RemoteObject.createImmutable(false);__ref.setField("_musedip",b4xstatebutton._musedip);
 //BA.debugLineNum = 80;BA.debugLine="Private mButtonGroup As Int";
b4xstatebutton._mbuttongroup = RemoteObject.createImmutable(0);__ref.setField("_mbuttongroup",b4xstatebutton._mbuttongroup);
 //BA.debugLineNum = 81;BA.debugLine="Private mTag As Object";
b4xstatebutton._mtag = RemoteObject.createNew ("Object");__ref.setField("_mtag",b4xstatebutton._mtag);
 //BA.debugLineNum = 82;BA.debugLine="Private mEnabled As Boolean = True";
b4xstatebutton._menabled = b4xstatebutton.__c.getField(true,"True");__ref.setField("_menabled",b4xstatebutton._menabled);
 //BA.debugLineNum = 83;BA.debugLine="Private mAllowClick As Boolean = True";
b4xstatebutton._mallowclick = b4xstatebutton.__c.getField(true,"True");__ref.setField("_mallowclick",b4xstatebutton._mallowclick);
 //BA.debugLineNum = 84;BA.debugLine="Private LastButton As Button";
b4xstatebutton._lastbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_lastbutton",b4xstatebutton._lastbutton);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createbutton(RemoteObject __ref,RemoteObject _base,RemoteObject _stitle,RemoteObject _sreference,RemoteObject _istate,RemoteObject _bbooleanstate,RemoteObject _ifirststatecolor,RemoteObject _isecondstatecolor,RemoteObject _ithirdstatecolor,RemoteObject _ibordercolor,RemoteObject _ibordersize,RemoteObject _bshowborder,RemoteObject _iradiussize,RemoteObject _busedip,RemoteObject _ibuttongroup) throws Exception{
try {
		Debug.PushSubsStack("CreateButton (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("createbutton")) { return __ref.runUserSub(false, "b4xstatebutton","createbutton", __ref, _base, _stitle, _sreference, _istate, _bbooleanstate, _ifirststatecolor, _isecondstatecolor, _ithirdstatecolor, _ibordercolor, _ibordersize, _bshowborder, _iradiussize, _busedip, _ibuttongroup);}
RemoteObject _thiscolor = RemoteObject.createImmutable(0);
RemoteObject _thisradius = RemoteObject.createImmutable(0);
RemoteObject _thisbordercolor = RemoteObject.createImmutable(0);
RemoteObject _thisborder = RemoteObject.createImmutable(0);
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("Base", _base);
Debug.locals.put("sTitle", _stitle);
Debug.locals.put("sReference", _sreference);
Debug.locals.put("iState", _istate);
Debug.locals.put("bBooleanState", _bbooleanstate);
Debug.locals.put("iFirstStateColor", _ifirststatecolor);
Debug.locals.put("iSecondStateColor", _isecondstatecolor);
Debug.locals.put("iThirdStateColor", _ithirdstatecolor);
Debug.locals.put("iBorderColor", _ibordercolor);
Debug.locals.put("iBorderSize", _ibordersize);
Debug.locals.put("bShowBorder", _bshowborder);
Debug.locals.put("iRadiusSize", _iradiussize);
Debug.locals.put("bUseDIP", _busedip);
Debug.locals.put("iButtonGroup", _ibuttongroup);
 BA.debugLineNum = 418;BA.debugLine="Public Sub CreateButton(Base As Object, sTitle As";
Debug.ShouldStop(2);
 BA.debugLineNum = 423;BA.debugLine="mBase = Base";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 424;BA.debugLine="mBase.Color = xui.Color_ARGB(0,255,255,255)";
Debug.ShouldStop(128);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 425;BA.debugLine="mButton.Initialize(\"ThisButtonClick\")";
Debug.ShouldStop(256);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ThisButtonClick")));
 BA.debugLineNum = 426;BA.debugLine="mBase.AddView(mButton, 0, 0, mBase.Width, mBase.H";
Debug.ShouldStop(512);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbutton" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 427;BA.debugLine="mBooleanState = bBooleanState";
Debug.ShouldStop(1024);
__ref.setField ("_mbooleanstate" /*RemoteObject*/ ,_bbooleanstate);
 BA.debugLineNum = 428;BA.debugLine="mState = iState";
Debug.ShouldStop(2048);
__ref.setField ("_mstate" /*RemoteObject*/ ,_istate);
 BA.debugLineNum = 429;BA.debugLine="mReference = sReference";
Debug.ShouldStop(4096);
__ref.setField ("_mreference" /*RemoteObject*/ ,_sreference);
 BA.debugLineNum = 430;BA.debugLine="mButtonGroup = iButtonGroup";
Debug.ShouldStop(8192);
__ref.setField ("_mbuttongroup" /*RemoteObject*/ ,_ibuttongroup);
 BA.debugLineNum = 448;BA.debugLine="mFirstStateColor = xui.PaintOrColorToColor(iFirst";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mfirststatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_ifirststatecolor))));
 BA.debugLineNum = 449;BA.debugLine="mSecondStateColor = xui.PaintOrColorToColor(iSeco";
Debug.ShouldStop(1);
__ref.setField ("_msecondstatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_isecondstatecolor))));
 BA.debugLineNum = 450;BA.debugLine="mThirdStateColor = xui.PaintOrColorToColor(iThird";
Debug.ShouldStop(2);
__ref.setField ("_mthirdstatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_ithirdstatecolor))));
 BA.debugLineNum = 451;BA.debugLine="mBorderColor = xui.PaintOrColorToColor(iBorderCol";
Debug.ShouldStop(4);
__ref.setField ("_mbordercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_ibordercolor))));
 BA.debugLineNum = 452;BA.debugLine="mShowBorder = bShowBorder";
Debug.ShouldStop(8);
__ref.setField ("_mshowborder" /*RemoteObject*/ ,_bshowborder);
 BA.debugLineNum = 453;BA.debugLine="mBorderSize = iBorderSize";
Debug.ShouldStop(16);
__ref.setField ("_mbordersize" /*RemoteObject*/ ,_ibordersize);
 BA.debugLineNum = 454;BA.debugLine="mRadiusSize = iRadiusSize";
Debug.ShouldStop(32);
__ref.setField ("_mradiussize" /*RemoteObject*/ ,_iradiussize);
 BA.debugLineNum = 455;BA.debugLine="mUseDIP = bUseDIP";
Debug.ShouldStop(64);
__ref.setField ("_musedip" /*RemoteObject*/ ,_busedip);
 BA.debugLineNum = 456;BA.debugLine="If (mUseDIP) Then";
Debug.ShouldStop(128);
if ((__ref.getField(true,"_musedip" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 457;BA.debugLine="mBorderSize = mBorderSize * 1dip";
Debug.ShouldStop(256);
__ref.setField ("_mbordersize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mbordersize" /*RemoteObject*/ ),b4xstatebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 1));
 BA.debugLineNum = 458;BA.debugLine="mRadiusSize = mRadiusSize * 1dip";
Debug.ShouldStop(512);
__ref.setField ("_mradiussize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mradiussize" /*RemoteObject*/ ),b4xstatebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 1));
 };
 BA.debugLineNum = 461;BA.debugLine="Dim thisColor As Int";
Debug.ShouldStop(4096);
_thiscolor = RemoteObject.createImmutable(0);Debug.locals.put("thisColor", _thiscolor);
 BA.debugLineNum = 462;BA.debugLine="If mState = 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 463;BA.debugLine="thisColor = mFirstStateColor";
Debug.ShouldStop(16384);
_thiscolor = __ref.getField(true,"_mfirststatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }else 
{ BA.debugLineNum = 464;BA.debugLine="else if mState = 1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 465;BA.debugLine="thisColor = mSecondStateColor";
Debug.ShouldStop(65536);
_thiscolor = __ref.getField(true,"_msecondstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }else 
{ BA.debugLineNum = 466;BA.debugLine="else if mState = 2 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 467;BA.debugLine="thisColor = mThirdStateColor";
Debug.ShouldStop(262144);
_thiscolor = __ref.getField(true,"_mthirdstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }}}
;
 BA.debugLineNum = 469;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
Debug.ShouldStop(1048576);
_thisradius = __ref.getField(true,"_mradiussize" /*RemoteObject*/ );Debug.locals.put("thisRadius", _thisradius);Debug.locals.put("thisRadius", _thisradius);
 BA.debugLineNum = 470;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
Debug.ShouldStop(2097152);
_thisbordercolor = __ref.getField(true,"_mbordercolor" /*RemoteObject*/ );Debug.locals.put("thisBorderColor", _thisbordercolor);Debug.locals.put("thisBorderColor", _thisbordercolor);
 BA.debugLineNum = 471;BA.debugLine="Dim thisBorder As Int = 0";
Debug.ShouldStop(4194304);
_thisborder = BA.numberCast(int.class, 0);Debug.locals.put("thisBorder", _thisborder);Debug.locals.put("thisBorder", _thisborder);
 BA.debugLineNum = 472;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
Debug.ShouldStop(8388608);
if (__ref.getField(true,"_mshowborder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_thisborder = __ref.getField(true,"_mbordersize" /*RemoteObject*/ );Debug.locals.put("thisBorder", _thisborder);};
 BA.debugLineNum = 473;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(16777216);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 474;BA.debugLine="cd.initialize2(thisColor, thisRadius, thisBorder,";
Debug.ShouldStop(33554432);
_cd.runVoidMethod ("Initialize2",(Object)(_thiscolor),(Object)(_thisradius),(Object)(_thisborder),(Object)(_thisbordercolor));
 BA.debugLineNum = 475;BA.debugLine="mButton.background = cd";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 477;BA.debugLine="mButton.Text = sTitle";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_stitle));
 BA.debugLineNum = 478;BA.debugLine="mButton.tag = CreateSBG(mState, mButtonGroup, mRe";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_createsbg" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mstate" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mbuttongroup" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mreference" /*RemoteObject*/ )),(Object)(BA.ObjectToString(__ref.getField(false,"_mtag" /*RemoteObject*/ ))))));
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
public static RemoteObject  _createsbg(RemoteObject __ref,RemoteObject _state,RemoteObject _group,RemoteObject _reference,RemoteObject _maintag) throws Exception{
try {
		Debug.PushSubsStack("CreateSBG (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("createsbg")) { return __ref.runUserSub(false, "b4xstatebutton","createsbg", __ref, _state, _group, _reference, _maintag);}
RemoteObject _thissbg = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
Debug.locals.put("State", _state);
Debug.locals.put("Group", _group);
Debug.locals.put("Reference", _reference);
Debug.locals.put("mainTag", _maintag);
 BA.debugLineNum = 150;BA.debugLine="Sub CreateSBG(State As Int, Group As Int, Referenc";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Dim thisSBG As SBG";
Debug.ShouldStop(4194304);
_thissbg = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");Debug.locals.put("thisSBG", _thissbg);
 BA.debugLineNum = 152;BA.debugLine="thisSBG.Initialize";
Debug.ShouldStop(8388608);
_thissbg.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="thisSBG.State = State";
Debug.ShouldStop(16777216);
_thissbg.setField ("State" /*RemoteObject*/ ,_state);
 BA.debugLineNum = 154;BA.debugLine="thisSBG.Group = Group";
Debug.ShouldStop(33554432);
_thissbg.setField ("Group" /*RemoteObject*/ ,_group);
 BA.debugLineNum = 155;BA.debugLine="thisSBG.Reference = Reference";
Debug.ShouldStop(67108864);
_thissbg.setField ("Reference" /*RemoteObject*/ ,_reference);
 BA.debugLineNum = 156;BA.debugLine="thisSBG.MainTag = mainTag";
Debug.ShouldStop(134217728);
_thissbg.setField ("mainTag" /*RemoteObject*/ ,_maintag);
 BA.debugLineNum = 157;BA.debugLine="Return thisSBG";
Debug.ShouldStop(268435456);
if (true) return _thissbg;
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xstatebutton","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _thiscolor = RemoteObject.createImmutable(0);
RemoteObject _thisradius = RemoteObject.createImmutable(0);
RemoteObject _thisbordercolor = RemoteObject.createImmutable(0);
RemoteObject _thisborder = RemoteObject.createImmutable(0);
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 94;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="mAllowClick = True";
Debug.ShouldStop(1073741824);
__ref.setField ("_mallowclick" /*RemoteObject*/ ,b4xstatebutton.__c.getField(true,"True"));
 BA.debugLineNum = 96;BA.debugLine="mBase = Base";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 97;BA.debugLine="mBase.Color = xui.Color_ARGB(0,255,255,255)";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 98;BA.debugLine="mButton.Initialize(\"ThisButtonClick\")";
Debug.ShouldStop(2);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ThisButtonClick")));
 BA.debugLineNum = 99;BA.debugLine="mBase.AddView(mButton, 0, 0, mBase.Width, mBase.H";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbutton" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 100;BA.debugLine="getDesignProperties(Props)";
Debug.ShouldStop(8);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getdesignproperties" /*RemoteObject*/ ,(Object)(_props));
 BA.debugLineNum = 102;BA.debugLine="mButton.Text = Lbl.Text";
Debug.ShouldStop(32);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_lbl.runMethod(true,"getText")));
 BA.debugLineNum = 103;BA.debugLine="mButton.TextColor = Lbl.TextColor";
Debug.ShouldStop(64);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setTextColor",_lbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 104;BA.debugLine="mButton.TextSize = Lbl.TextSize";
Debug.ShouldStop(128);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setTextSize",_lbl.runMethod(true,"getTextSize"));
 BA.debugLineNum = 105;BA.debugLine="mParent = mBase.Parent";
Debug.ShouldStop(256);
__ref.setField ("_mparent" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent"));
 BA.debugLineNum = 106;BA.debugLine="mEnabled = True";
Debug.ShouldStop(512);
__ref.setField ("_menabled" /*RemoteObject*/ ,b4xstatebutton.__c.getField(true,"True"));
 BA.debugLineNum = 107;BA.debugLine="mBaseLabel = Lbl";
Debug.ShouldStop(1024);
__ref.setField ("_mbaselabel" /*RemoteObject*/ ,_lbl);
 BA.debugLineNum = 108;BA.debugLine="mDefaultColor = mBaseLabel.TextColor";
Debug.ShouldStop(2048);
__ref.setField ("_mdefaultcolor" /*RemoteObject*/ ,__ref.getField(false,"_mbaselabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 109;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 126;BA.debugLine="Dim thisColor As Int";
Debug.ShouldStop(536870912);
_thiscolor = RemoteObject.createImmutable(0);Debug.locals.put("thisColor", _thiscolor);
 BA.debugLineNum = 127;BA.debugLine="If mState = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 128;BA.debugLine="thisColor = mFirstStateColor";
Debug.ShouldStop(-2147483648);
_thiscolor = __ref.getField(true,"_mfirststatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }else 
{ BA.debugLineNum = 129;BA.debugLine="else if mState = 1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 130;BA.debugLine="thisColor = mSecondStateColor";
Debug.ShouldStop(2);
_thiscolor = __ref.getField(true,"_msecondstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }else 
{ BA.debugLineNum = 131;BA.debugLine="else if mState = 2 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 132;BA.debugLine="thisColor = mThirdStateColor";
Debug.ShouldStop(8);
_thiscolor = __ref.getField(true,"_mthirdstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }}}
;
 BA.debugLineNum = 134;BA.debugLine="mButton.Typeface = Lbl.Typeface";
Debug.ShouldStop(32);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setTypeface",_lbl.runMethod(false,"getTypeface"));
 BA.debugLineNum = 135;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
Debug.ShouldStop(64);
_thisradius = __ref.getField(true,"_mradiussize" /*RemoteObject*/ );Debug.locals.put("thisRadius", _thisradius);Debug.locals.put("thisRadius", _thisradius);
 BA.debugLineNum = 136;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
Debug.ShouldStop(128);
_thisbordercolor = __ref.getField(true,"_mbordercolor" /*RemoteObject*/ );Debug.locals.put("thisBorderColor", _thisbordercolor);Debug.locals.put("thisBorderColor", _thisbordercolor);
 BA.debugLineNum = 137;BA.debugLine="Dim thisBorder As Int = 0";
Debug.ShouldStop(256);
_thisborder = BA.numberCast(int.class, 0);Debug.locals.put("thisBorder", _thisborder);Debug.locals.put("thisBorder", _thisborder);
 BA.debugLineNum = 138;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
Debug.ShouldStop(512);
if (__ref.getField(true,"_mshowborder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_thisborder = __ref.getField(true,"_mbordersize" /*RemoteObject*/ );Debug.locals.put("thisBorder", _thisborder);};
 BA.debugLineNum = 139;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(1024);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 140;BA.debugLine="cd.initialize2(thisColor, thisRadius, thisBorder,";
Debug.ShouldStop(2048);
_cd.runVoidMethod ("Initialize2",(Object)(_thiscolor),(Object)(_thisradius),(Object)(_thisborder),(Object)(_thisbordercolor));
 BA.debugLineNum = 141;BA.debugLine="mButton.background = cd";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 143;BA.debugLine="mButton.tag = CreateSBG(mState, mButtonGroup, mRe";
Debug.ShouldStop(16384);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_createsbg" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mstate" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mbuttongroup" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mreference" /*RemoteObject*/ )),(Object)(BA.ObjectToString(__ref.getField(false,"_mtag" /*RemoteObject*/ ))))));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getallowclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAllowClick (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,489);
if (RapidSub.canDelegate("getallowclick")) { return __ref.runUserSub(false, "b4xstatebutton","getallowclick", __ref);}
 BA.debugLineNum = 489;BA.debugLine="Public Sub getAllowClick As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 490;BA.debugLine="Return mAllowClick";
Debug.ShouldStop(512);
if (true) return __ref.getField(true,"_mallowclick" /*RemoteObject*/ );
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbuttongroup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getButtonGroup (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("getbuttongroup")) { return __ref.runUserSub(false, "b4xstatebutton","getbuttongroup", __ref);}
RemoteObject _bs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
 BA.debugLineNum = 529;BA.debugLine="Public Sub getButtonGroup As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 530;BA.debugLine="Dim bs As SBG = mButton.Tag";
Debug.ShouldStop(131072);
_bs = (__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("bs", _bs);Debug.locals.put("bs", _bs);
 BA.debugLineNum = 531;BA.debugLine="Return bs.Group";
Debug.ShouldStop(262144);
if (true) return _bs.getField(true,"Group" /*RemoteObject*/ );
 BA.debugLineNum = 532;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getconformity(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getConformity (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,541);
if (RapidSub.canDelegate("getconformity")) { return __ref.runUserSub(false, "b4xstatebutton","getconformity", __ref);}
 BA.debugLineNum = 541;BA.debugLine="Public Sub getConformity As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 542;BA.debugLine="Return mConformity";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(true,"_mconformity" /*RemoteObject*/ );
 BA.debugLineNum = 543;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdesignproperties(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("getDesignProperties (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("getdesignproperties")) { return __ref.runUserSub(false, "b4xstatebutton","getdesignproperties", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 160;BA.debugLine="Sub getDesignProperties(Props As Map)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="mConformity = Props.Get(\"Conformity\")";
Debug.ShouldStop(1);
__ref.setField ("_mconformity" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Conformity"))))));
 BA.debugLineNum = 162;BA.debugLine="mReference = Props.Get(\"Reference\")";
Debug.ShouldStop(2);
__ref.setField ("_mreference" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Reference"))))));
 BA.debugLineNum = 163;BA.debugLine="mBooleanState = Props.Get(\"BooleanState\")";
Debug.ShouldStop(4);
__ref.setField ("_mbooleanstate" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BooleanState"))))));
 BA.debugLineNum = 164;BA.debugLine="mState = Props.Get(\"State\")";
Debug.ShouldStop(8);
__ref.setField ("_mstate" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("State"))))));
 BA.debugLineNum = 171;BA.debugLine="mTextStateColor = xui.PaintOrColorToColor(Props.G";
Debug.ShouldStop(1024);
__ref.setField ("_mtextstatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextStateColor")))))));
 BA.debugLineNum = 172;BA.debugLine="mFirstStateColor = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(2048);
__ref.setField ("_mfirststatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstStateColor")))))));
 BA.debugLineNum = 173;BA.debugLine="mSecondStateColor = xui.PaintOrColorToColor(Props";
Debug.ShouldStop(4096);
__ref.setField ("_msecondstatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SecondStateColor")))))));
 BA.debugLineNum = 174;BA.debugLine="mThirdStateColor = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(8192);
__ref.setField ("_mthirdstatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ThirdStateColor")))))));
 BA.debugLineNum = 175;BA.debugLine="mBorderColor = xui.PaintOrColorToColor(Props.Get(";
Debug.ShouldStop(16384);
__ref.setField ("_mbordercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BorderColor")))))));
 BA.debugLineNum = 176;BA.debugLine="mShowBorder = Props.Get(\"ShowBorder\")";
Debug.ShouldStop(32768);
__ref.setField ("_mshowborder" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowBorder"))))));
 BA.debugLineNum = 177;BA.debugLine="mBorderSize = Props.Get(\"BorderSize\")";
Debug.ShouldStop(65536);
__ref.setField ("_mbordersize" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BorderSize"))))));
 BA.debugLineNum = 178;BA.debugLine="mRadiusSize = Props.Get(\"RadiusSize\")";
Debug.ShouldStop(131072);
__ref.setField ("_mradiussize" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RadiusSize"))))));
 BA.debugLineNum = 179;BA.debugLine="mUseDIP = Props.Get(\"UseDIP\")";
Debug.ShouldStop(262144);
__ref.setField ("_musedip" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UseDIP"))))));
 BA.debugLineNum = 180;BA.debugLine="If (mUseDIP) Then";
Debug.ShouldStop(524288);
if ((__ref.getField(true,"_musedip" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 181;BA.debugLine="mBorderSize = mBorderSize * 1dip";
Debug.ShouldStop(1048576);
__ref.setField ("_mbordersize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mbordersize" /*RemoteObject*/ ),b4xstatebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 1));
 BA.debugLineNum = 182;BA.debugLine="mRadiusSize = mRadiusSize * 1dip";
Debug.ShouldStop(2097152);
__ref.setField ("_mradiussize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mradiussize" /*RemoteObject*/ ),b4xstatebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 1));
 };
 BA.debugLineNum = 185;BA.debugLine="mButtonGroup = Props.Get(\"ButtonGroup\")";
Debug.ShouldStop(16777216);
__ref.setField ("_mbuttongroup" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ButtonGroup"))))));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnabled (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,497);
if (RapidSub.canDelegate("getenabled")) { return __ref.runUserSub(false, "b4xstatebutton","getenabled", __ref);}
 BA.debugLineNum = 497;BA.debugLine="Public Sub getEnabled As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 498;BA.debugLine="Return mEnabled";
Debug.ShouldStop(131072);
if (true) return __ref.getField(true,"_menabled" /*RemoteObject*/ );
 BA.debugLineNum = 499;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirststatecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFirstStateColor (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,679);
if (RapidSub.canDelegate("getfirststatecolor")) { return __ref.runUserSub(false, "b4xstatebutton","getfirststatecolor", __ref);}
 BA.debugLineNum = 679;BA.debugLine="public Sub getFirstStateColor As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 680;BA.debugLine="Return mFirstStateColor";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_mfirststatecolor" /*RemoteObject*/ );
 BA.debugLineNum = 681;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getParent (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("getparent")) { return __ref.runUserSub(false, "b4xstatebutton","getparent", __ref);}
 BA.debugLineNum = 481;BA.debugLine="Public Sub getParent As B4XView";
Debug.ShouldStop(1);
 BA.debugLineNum = 482;BA.debugLine="Return mParent";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_mparent" /*RemoteObject*/ );
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreference(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getReference (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,515);
if (RapidSub.canDelegate("getreference")) { return __ref.runUserSub(false, "b4xstatebutton","getreference", __ref);}
RemoteObject _bs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
 BA.debugLineNum = 515;BA.debugLine="Public Sub getReference As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 516;BA.debugLine="Dim bs As SBG = mButton.Tag";
Debug.ShouldStop(8);
_bs = (__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("bs", _bs);Debug.locals.put("bs", _bs);
 BA.debugLineNum = 517;BA.debugLine="If (bs.Reference = Null) Or (bs.Reference.ToLower";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("n",_bs.getField(true,"Reference" /*RemoteObject*/ ))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_bs.getField(true,"Reference" /*RemoteObject*/ ).runMethod(true,"toLowerCase"),RemoteObject.createImmutable("null"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_bs.getField(true,"Reference" /*RemoteObject*/ ).runMethod(true,"trim"),RemoteObject.createImmutable("")))))) { 
 BA.debugLineNum = 518;BA.debugLine="bs.Reference = \"0\"";
Debug.ShouldStop(32);
_bs.setField ("Reference" /*RemoteObject*/ ,BA.ObjectToString("0"));
 };
 BA.debugLineNum = 520;BA.debugLine="Return bs.Reference";
Debug.ShouldStop(128);
if (true) return _bs.getField(true,"Reference" /*RemoteObject*/ );
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
public static RemoteObject  _getsbg(RemoteObject __ref,RemoteObject _thissbg,RemoteObject _field) throws Exception{
try {
		Debug.PushSubsStack("GetSBG (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,377);
if (RapidSub.canDelegate("getsbg")) { return __ref.runUserSub(false, "b4xstatebutton","getsbg", __ref, _thissbg, _field);}
Debug.locals.put("thisSBG", _thissbg);
Debug.locals.put("field", _field);
 BA.debugLineNum = 377;BA.debugLine="Sub GetSBG(thisSBG As SBG, field As Int) As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 378;BA.debugLine="If (thisSBG.IsInitialized) Then";
Debug.ShouldStop(33554432);
if ((_thissbg.getField(true,"IsInitialized" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 379;BA.debugLine="If (field = 1) Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_field,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 380;BA.debugLine="Return thisSBG.State";
Debug.ShouldStop(134217728);
if (true) return BA.NumberToString(_thissbg.getField(true,"State" /*RemoteObject*/ ));
 }else 
{ BA.debugLineNum = 381;BA.debugLine="else if (field = 2) Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",_field,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 382;BA.debugLine="Return thisSBG.Group";
Debug.ShouldStop(536870912);
if (true) return BA.NumberToString(_thissbg.getField(true,"Group" /*RemoteObject*/ ));
 }else 
{ BA.debugLineNum = 383;BA.debugLine="else if (field = 3) Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",_field,BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 384;BA.debugLine="Return thisSBG.Reference";
Debug.ShouldStop(-2147483648);
if (true) return _thissbg.getField(true,"Reference" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 386;BA.debugLine="Return thisSBG.MainTag";
Debug.ShouldStop(2);
if (true) return _thissbg.getField(true,"mainTag" /*RemoteObject*/ );
 }}}
;
 }else {
 BA.debugLineNum = 389;BA.debugLine="Return \"\"";
Debug.ShouldStop(16);
if (true) return BA.ObjectToString("");
 };
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
public static RemoteObject  _getsecondstatecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSecondStateColor (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,697);
if (RapidSub.canDelegate("getsecondstatecolor")) { return __ref.runUserSub(false, "b4xstatebutton","getsecondstatecolor", __ref);}
 BA.debugLineNum = 697;BA.debugLine="public Sub getSecondStateColor As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 698;BA.debugLine="Return mSecondStateColor";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(true,"_msecondstatecolor" /*RemoteObject*/ );
 BA.debugLineNum = 699;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getState (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,563);
if (RapidSub.canDelegate("getstate")) { return __ref.runUserSub(false, "b4xstatebutton","getstate", __ref);}
RemoteObject _bs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
 BA.debugLineNum = 563;BA.debugLine="Public Sub getState As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 564;BA.debugLine="Dim bs As SBG = mButton.Tag";
Debug.ShouldStop(524288);
_bs = (__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("bs", _bs);Debug.locals.put("bs", _bs);
 BA.debugLineNum = 565;BA.debugLine="Return bs.State";
Debug.ShouldStop(1048576);
if (true) return _bs.getField(true,"State" /*RemoteObject*/ );
 BA.debugLineNum = 566;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettag(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTag (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,506);
if (RapidSub.canDelegate("gettag")) { return __ref.runUserSub(false, "b4xstatebutton","gettag", __ref);}
 BA.debugLineNum = 506;BA.debugLine="Public Sub getTag As Object";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 507;BA.debugLine="Return mTag";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_mtag" /*RemoteObject*/ );
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "b4xstatebutton","gettext", __ref);}
 BA.debugLineNum = 549;BA.debugLine="Public Sub getText As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="Return mButton.Text";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextColor (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,587);
if (RapidSub.canDelegate("gettextcolor")) { return __ref.runUserSub(false, "b4xstatebutton","gettextcolor", __ref);}
 BA.debugLineNum = 587;BA.debugLine="public Sub getTextColor As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 588;BA.debugLine="Return mButton.TextColor";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"getTextColor");
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextSize (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,596);
if (RapidSub.canDelegate("gettextsize")) { return __ref.runUserSub(false, "b4xstatebutton","gettextsize", __ref);}
 BA.debugLineNum = 596;BA.debugLine="public Sub getTextSize As Int";
Debug.ShouldStop(524288);
 BA.debugLineNum = 597;BA.debugLine="Return mButton.TextSize";
Debug.ShouldStop(1048576);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"getTextSize"));
 BA.debugLineNum = 598;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getthirdstatecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getThirdStateColor (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,715);
if (RapidSub.canDelegate("getthirdstatecolor")) { return __ref.runUserSub(false, "b4xstatebutton","getthirdstatecolor", __ref);}
 BA.debugLineNum = 715;BA.debugLine="public Sub getThirdStateColor As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 716;BA.debugLine="Return mThirdStateColor";
Debug.ShouldStop(2048);
if (true) return __ref.getField(true,"_mthirdstatecolor" /*RemoteObject*/ );
 BA.debugLineNum = 717;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettypeface(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTypeface (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,614);
if (RapidSub.canDelegate("gettypeface")) { return __ref.runUserSub(false, "b4xstatebutton","gettypeface", __ref);}
 BA.debugLineNum = 614;BA.debugLine="public Sub getTypeface As Typeface";
Debug.ShouldStop(32);
 BA.debugLineNum = 615;BA.debugLine="Return mButton.Typeface";
Debug.ShouldStop(64);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), __ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTypeface"));
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xstatebutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 88;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16777216);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 90;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(33554432);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
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
public static RemoteObject  _makeclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MakeClick (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("makeclick")) { return __ref.runUserSub(false, "b4xstatebutton","makeclick", __ref);}
RemoteObject _bs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
 BA.debugLineNum = 209;BA.debugLine="Sub MakeClick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="If (mAllowClick) Then";
Debug.ShouldStop(131072);
if ((__ref.getField(true,"_mallowclick" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 211;BA.debugLine="Dim bs As SBG = mButton.Tag";
Debug.ShouldStop(262144);
_bs = (__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("bs", _bs);Debug.locals.put("bs", _bs);
 BA.debugLineNum = 212;BA.debugLine="mState = bs.State";
Debug.ShouldStop(524288);
__ref.setField ("_mstate" /*RemoteObject*/ ,_bs.getField(true,"State" /*RemoteObject*/ ));
 BA.debugLineNum = 213;BA.debugLine="If mState = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 214;BA.debugLine="If mBooleanState Then";
Debug.ShouldStop(2097152);
if (__ref.getField(true,"_mbooleanstate" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 215;BA.debugLine="setState(1)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 217;BA.debugLine="setState(NextSate)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_nextsate" /*RemoteObject*/ )));
 };
 }else {
 BA.debugLineNum = 220;BA.debugLine="If mBooleanState Then";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_mbooleanstate" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 221;BA.debugLine="setState(0)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 223;BA.debugLine="setState(NextSate)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_nextsate" /*RemoteObject*/ )));
 };
 };
 };
 BA.debugLineNum = 227;BA.debugLine="CallSub2(mCallBack, mEventName & \"_StateClick\", g";
Debug.ShouldStop(4);
b4xstatebutton.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_StateClick"))),(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getstate" /*RemoteObject*/ ))));
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nextsate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextSate (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("nextsate")) { return __ref.runUserSub(false, "b4xstatebutton","nextsate", __ref);}
RemoteObject _rnext = RemoteObject.createImmutable(0);
 BA.debugLineNum = 557;BA.debugLine="Public Sub NextSate As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="Dim rNext As Int = mState +1";
Debug.ShouldStop(8192);
_rnext = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mstate" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("rNext", _rnext);Debug.locals.put("rNext", _rnext);
 BA.debugLineNum = 559;BA.debugLine="If rNext >= 3 Then rNext = 0";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("g",_rnext,BA.numberCast(double.class, 3))) { 
_rnext = BA.numberCast(int.class, 0);Debug.locals.put("rNext", _rnext);};
 BA.debugLineNum = 560;BA.debugLine="Return rNext";
Debug.ShouldStop(32768);
if (true) return _rnext;
 BA.debugLineNum = 561;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetbuttongroup(RemoteObject __ref,RemoteObject _bbut_) throws Exception{
try {
		Debug.PushSubsStack("ResetButtonGroup (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("resetbuttongroup")) { return __ref.runUserSub(false, "b4xstatebutton","resetbuttongroup", __ref, _bbut_);}
RemoteObject _bgrp = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
RemoteObject _thisradius = RemoteObject.createImmutable(0);
RemoteObject _thisbordercolor = RemoteObject.createImmutable(0);
RemoteObject _thisborder = RemoteObject.createImmutable(0);
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("BBut_", _bbut_);
 BA.debugLineNum = 393;BA.debugLine="Public Sub ResetButtonGroup (BBut_ As Button)";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="Dim bgrp As SBG = BBut_.Tag";
Debug.ShouldStop(512);
_bgrp = (_bbut_.runMethod(false,"getTag"));Debug.locals.put("bgrp", _bgrp);Debug.locals.put("bgrp", _bgrp);
 BA.debugLineNum = 395;BA.debugLine="bgrp.State = 0";
Debug.ShouldStop(1024);
_bgrp.setField ("State" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 399;BA.debugLine="mDefaultColor = mBaseLabel.TextColor";
Debug.ShouldStop(16384);
__ref.setField ("_mdefaultcolor" /*RemoteObject*/ ,__ref.getField(false,"_mbaselabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 400;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
Debug.ShouldStop(32768);
_thisradius = __ref.getField(true,"_mradiussize" /*RemoteObject*/ );Debug.locals.put("thisRadius", _thisradius);Debug.locals.put("thisRadius", _thisradius);
 BA.debugLineNum = 401;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
Debug.ShouldStop(65536);
_thisbordercolor = __ref.getField(true,"_mbordercolor" /*RemoteObject*/ );Debug.locals.put("thisBorderColor", _thisbordercolor);Debug.locals.put("thisBorderColor", _thisbordercolor);
 BA.debugLineNum = 402;BA.debugLine="Dim thisBorder As Int = 0";
Debug.ShouldStop(131072);
_thisborder = BA.numberCast(int.class, 0);Debug.locals.put("thisBorder", _thisborder);Debug.locals.put("thisBorder", _thisborder);
 BA.debugLineNum = 403;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
Debug.ShouldStop(262144);
if (__ref.getField(true,"_mshowborder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_thisborder = __ref.getField(true,"_mbordersize" /*RemoteObject*/ );Debug.locals.put("thisBorder", _thisborder);};
 BA.debugLineNum = 404;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(524288);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 405;BA.debugLine="cd.initialize2(mFirstStateColor, thisRadius, this";
Debug.ShouldStop(1048576);
_cd.runVoidMethod ("Initialize2",(Object)(__ref.getField(true,"_mfirststatecolor" /*RemoteObject*/ )),(Object)(_thisradius),(Object)(_thisborder),(Object)(_thisbordercolor));
 BA.debugLineNum = 406;BA.debugLine="BBut_.background = cd";
Debug.ShouldStop(2097152);
_bbut_.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 407;BA.debugLine="BBut_.TextColor = mDefaultColor";
Debug.ShouldStop(4194304);
_bbut_.runMethod(true,"setTextColor",__ref.getField(true,"_mdefaultcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 409;BA.debugLine="BBut_.tag = bgrp";
Debug.ShouldStop(16777216);
_bbut_.runMethod(false,"setTag",(_bgrp));
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
public static RemoteObject  _reverttolastbutton(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RevertToLastButton (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("reverttolastbutton")) { return __ref.runUserSub(false, "b4xstatebutton","reverttolastbutton", __ref);}
RemoteObject _par = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _par2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 349;BA.debugLine="Sub RevertToLastButton";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 351;BA.debugLine="If LastButton.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(false,"_lastbutton" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 354;BA.debugLine="If (mButton.Text = LastButton.Text) And (GetSBG(";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"getText"),__ref.getField(false,"_lastbutton" /*RemoteObject*/ ).runMethod(true,"getText"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getsbg" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 2))),__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getsbg" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_lastbutton" /*RemoteObject*/ ).runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 2))))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getsbg" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 3))),__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getsbg" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_lastbutton" /*RemoteObject*/ ).runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 3)))))))) { 
 BA.debugLineNum = 356;BA.debugLine="mButton = LastButton";
Debug.ShouldStop(8);
__ref.setField ("_mbutton" /*RemoteObject*/ ,__ref.getField(false,"_lastbutton" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 360;BA.debugLine="If mButtonGroup > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_mbuttongroup" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 361;BA.debugLine="Dim par As B4XView = mButton.Parent";
Debug.ShouldStop(256);
_par = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_par = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getParent"));Debug.locals.put("par", _par);
 BA.debugLineNum = 362;BA.debugLine="Dim par2 As B4XView = par.Parent";
Debug.ShouldStop(512);
_par2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_par2 = _par.runMethod(false,"getParent");Debug.locals.put("par2", _par2);Debug.locals.put("par2", _par2);
 BA.debugLineNum = 363;BA.debugLine="For Each pan As B4XView In par2.GetAllViewsRec";
Debug.ShouldStop(1024);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group8 = _par2.runMethod(false,"GetAllViewsRecursive");
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group8.runMethod(false,"Get",index8));
Debug.locals.put("pan", _pan);
 BA.debugLineNum = 364;BA.debugLine="If (pan Is Button) And (pan.Text = LastButton";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("i",_pan.getObjectOrNull(), RemoteObject.createImmutable("android.widget.Button"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_pan.runMethod(true,"getText"),__ref.getField(false,"_lastbutton" /*RemoteObject*/ ).runMethod(true,"getText"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getsbg" /*RemoteObject*/ ,(Object)((_pan.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 2))),__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getsbg" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_lastbutton" /*RemoteObject*/ ).runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 2))))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getsbg" /*RemoteObject*/ ,(Object)((_pan.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 3))),__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getsbg" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_lastbutton" /*RemoteObject*/ ).runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 3)))))))) { 
 BA.debugLineNum = 367;BA.debugLine="pan = LastButton";
Debug.ShouldStop(16384);
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_lastbutton" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 368;BA.debugLine="Exit";
Debug.ShouldStop(32768);
if (true) break;
 };
 }
}Debug.locals.put("pan", _pan);
;
 BA.debugLineNum = 371;BA.debugLine="ResetButtonGroup( mButton )";
Debug.ShouldStop(262144);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_resetbuttongroup" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbutton" /*RemoteObject*/ )));
 };
 };
 };
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setallowclick(RemoteObject __ref,RemoteObject _theobj) throws Exception{
try {
		Debug.PushSubsStack("setAllowClick (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,493);
if (RapidSub.canDelegate("setallowclick")) { return __ref.runUserSub(false, "b4xstatebutton","setallowclick", __ref, _theobj);}
Debug.locals.put("theObj", _theobj);
 BA.debugLineNum = 493;BA.debugLine="Public Sub setAllowClick(theObj As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 494;BA.debugLine="mAllowClick = theObj";
Debug.ShouldStop(8192);
__ref.setField ("_mallowclick" /*RemoteObject*/ ,_theobj);
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbuttongroup(RemoteObject __ref,RemoteObject _group) throws Exception{
try {
		Debug.PushSubsStack("setButtonGroup (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,534);
if (RapidSub.canDelegate("setbuttongroup")) { return __ref.runUserSub(false, "b4xstatebutton","setbuttongroup", __ref, _group);}
RemoteObject _bs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
Debug.locals.put("group", _group);
 BA.debugLineNum = 534;BA.debugLine="Public Sub setButtonGroup(group As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 535;BA.debugLine="Dim bs As SBG = mButton.Tag";
Debug.ShouldStop(4194304);
_bs = (__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("bs", _bs);Debug.locals.put("bs", _bs);
 BA.debugLineNum = 536;BA.debugLine="bs.Group = group";
Debug.ShouldStop(8388608);
_bs.setField ("Group" /*RemoteObject*/ ,_group);
 BA.debugLineNum = 537;BA.debugLine="mButtonGroup = group";
Debug.ShouldStop(16777216);
__ref.setField ("_mbuttongroup" /*RemoteObject*/ ,_group);
 BA.debugLineNum = 538;BA.debugLine="mButton.Tag = bs";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setTag",(_bs));
 BA.debugLineNum = 539;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolormanual(RemoteObject __ref,RemoteObject _color2set) throws Exception{
try {
		Debug.PushSubsStack("SetColorManual (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("setcolormanual")) { return __ref.runUserSub(false, "b4xstatebutton","setcolormanual", __ref, _color2set);}
Debug.locals.put("color2Set", _color2set);
 BA.debugLineNum = 340;BA.debugLine="Sub SetColorManual(color2Set As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="mButton.Color = color2Set";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runVoidMethod ("setColor",_color2set);
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setconformity(RemoteObject __ref,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("setConformity (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,545);
if (RapidSub.canDelegate("setconformity")) { return __ref.runUserSub(false, "b4xstatebutton","setconformity", __ref, _val);}
Debug.locals.put("val", _val);
 BA.debugLineNum = 545;BA.debugLine="Public Sub setConformity(val As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 546;BA.debugLine="mConformity = val";
Debug.ShouldStop(2);
__ref.setField ("_mconformity" /*RemoteObject*/ ,_val);
 BA.debugLineNum = 547;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setconformitymanual(RemoteObject __ref,RemoteObject _val2set) throws Exception{
try {
		Debug.PushSubsStack("SetConformityManual (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("setconformitymanual")) { return __ref.runUserSub(false, "b4xstatebutton","setconformitymanual", __ref, _val2set);}
Debug.locals.put("val2set", _val2set);
 BA.debugLineNum = 344;BA.debugLine="Sub SetConformityManual(val2set As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="mConformity = val2set";
Debug.ShouldStop(16777216);
__ref.setField ("_mconformity" /*RemoteObject*/ ,_val2set);
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _theobj) throws Exception{
try {
		Debug.PushSubsStack("setEnabled (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,501);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "b4xstatebutton","setenabled", __ref, _theobj);}
Debug.locals.put("theObj", _theobj);
 BA.debugLineNum = 501;BA.debugLine="Public Sub setEnabled(theObj As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 502;BA.debugLine="mEnabled = theObj";
Debug.ShouldStop(2097152);
__ref.setField ("_menabled" /*RemoteObject*/ ,_theobj);
 BA.debugLineNum = 503;BA.debugLine="mButton.Enabled = mEnabled";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setEnabled",__ref.getField(true,"_menabled" /*RemoteObject*/ ));
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfirststate(RemoteObject __ref,RemoteObject _thisstate) throws Exception{
try {
		Debug.PushSubsStack("setFirstState (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,573);
if (RapidSub.canDelegate("setfirststate")) { return __ref.runUserSub(false, "b4xstatebutton","setfirststate", __ref, _thisstate);}
Debug.locals.put("thisState", _thisstate);
 BA.debugLineNum = 573;BA.debugLine="Public Sub setFirstState(thisState As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 574;BA.debugLine="mState = thisState";
Debug.ShouldStop(536870912);
__ref.setField ("_mstate" /*RemoteObject*/ ,_thisstate);
 BA.debugLineNum = 575;BA.debugLine="updateButtonStateFirst(mState)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_updatebuttonstatefirst" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mstate" /*RemoteObject*/ )));
 BA.debugLineNum = 576;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfirststatecolor(RemoteObject __ref,RemoteObject _parm) throws Exception{
try {
		Debug.PushSubsStack("setFirstStateColor (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,683);
if (RapidSub.canDelegate("setfirststatecolor")) { return __ref.runUserSub(false, "b4xstatebutton","setfirststatecolor", __ref, _parm);}
Debug.locals.put("parm", _parm);
 BA.debugLineNum = 683;BA.debugLine="public Sub setFirstStateColor(parm As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 684;BA.debugLine="mFirstStateColor = xui.PaintOrColorToColor(parm)";
Debug.ShouldStop(2048);
__ref.setField ("_mfirststatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_parm))));
 BA.debugLineNum = 685;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setreference(RemoteObject __ref,RemoteObject _thetext) throws Exception{
try {
		Debug.PushSubsStack("setReference (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,523);
if (RapidSub.canDelegate("setreference")) { return __ref.runUserSub(false, "b4xstatebutton","setreference", __ref, _thetext);}
RemoteObject _bs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
Debug.locals.put("theText", _thetext);
 BA.debugLineNum = 523;BA.debugLine="Public Sub setReference(theText As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 524;BA.debugLine="Dim bs As SBG = mButton.Tag";
Debug.ShouldStop(2048);
_bs = (__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("bs", _bs);Debug.locals.put("bs", _bs);
 BA.debugLineNum = 525;BA.debugLine="bs.Reference = theText";
Debug.ShouldStop(4096);
_bs.setField ("Reference" /*RemoteObject*/ ,_thetext);
 BA.debugLineNum = 526;BA.debugLine="mButton.Tag = bs";
Debug.ShouldStop(8192);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setTag",(_bs));
 BA.debugLineNum = 527;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsecondstatecolor(RemoteObject __ref,RemoteObject _parm) throws Exception{
try {
		Debug.PushSubsStack("setSecondStateColor (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,701);
if (RapidSub.canDelegate("setsecondstatecolor")) { return __ref.runUserSub(false, "b4xstatebutton","setsecondstatecolor", __ref, _parm);}
Debug.locals.put("parm", _parm);
 BA.debugLineNum = 701;BA.debugLine="public Sub setSecondStateColor(parm As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 702;BA.debugLine="mSecondStateColor = xui.PaintOrColorToColor(parm)";
Debug.ShouldStop(536870912);
__ref.setField ("_msecondstatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_parm))));
 BA.debugLineNum = 703;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("setState (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,568);
if (RapidSub.canDelegate("setstate")) { return __ref.runUserSub(false, "b4xstatebutton","setstate", __ref, _thisstate);}
Debug.locals.put("thisState", _thisstate);
 BA.debugLineNum = 568;BA.debugLine="Public Sub setState(thisState As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 569;BA.debugLine="mState = thisState";
Debug.ShouldStop(16777216);
__ref.setField ("_mstate" /*RemoteObject*/ ,_thisstate);
 BA.debugLineNum = 570;BA.debugLine="updateButtonState(mState)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_updatebuttonstate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mstate" /*RemoteObject*/ )));
 BA.debugLineNum = 571;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _theobj) throws Exception{
try {
		Debug.PushSubsStack("setTag (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,510);
if (RapidSub.canDelegate("settag")) { return __ref.runUserSub(false, "b4xstatebutton","settag", __ref, _theobj);}
Debug.locals.put("theObj", _theobj);
 BA.debugLineNum = 510;BA.debugLine="Public Sub setTag(theObj As Object)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 511;BA.debugLine="mTag = theObj";
Debug.ShouldStop(1073741824);
__ref.setField ("_mtag" /*RemoteObject*/ ,_theobj);
 BA.debugLineNum = 512;BA.debugLine="mButton.tag = CreateSBG(mState, mButtonGroup, mRe";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_createsbg" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mstate" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mbuttongroup" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mreference" /*RemoteObject*/ )),(Object)(BA.ObjectToString(__ref.getField(false,"_mtag" /*RemoteObject*/ ))))));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _thetext) throws Exception{
try {
		Debug.PushSubsStack("setText (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,553);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "b4xstatebutton","settext", __ref, _thetext);}
Debug.locals.put("theText", _thetext);
 BA.debugLineNum = 553;BA.debugLine="Public Sub setText(theText As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 554;BA.debugLine="mButton.Text = theText";
Debug.ShouldStop(512);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_thetext));
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _parm) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,591);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "b4xstatebutton","settextcolor", __ref, _parm);}
Debug.locals.put("parm", _parm);
 BA.debugLineNum = 591;BA.debugLine="public Sub setTextColor(parm As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 592;BA.debugLine="mButton.TextColor = parm";
Debug.ShouldStop(32768);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setTextColor",_parm);
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextsize(RemoteObject __ref,RemoteObject _parm) throws Exception{
try {
		Debug.PushSubsStack("setTextSize (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,600);
if (RapidSub.canDelegate("settextsize")) { return __ref.runUserSub(false, "b4xstatebutton","settextsize", __ref, _parm);}
Debug.locals.put("parm", _parm);
 BA.debugLineNum = 600;BA.debugLine="public Sub setTextSize(parm As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 601;BA.debugLine="mButton.TextSize = parm";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, _parm));
 BA.debugLineNum = 602;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthirdstatecolor(RemoteObject __ref,RemoteObject _parm) throws Exception{
try {
		Debug.PushSubsStack("setThirdStateColor (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,719);
if (RapidSub.canDelegate("setthirdstatecolor")) { return __ref.runUserSub(false, "b4xstatebutton","setthirdstatecolor", __ref, _parm);}
Debug.locals.put("parm", _parm);
 BA.debugLineNum = 719;BA.debugLine="public Sub setThirdStateColor(parm As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 720;BA.debugLine="mThirdStateColor = xui.PaintOrColorToColor(parm)";
Debug.ShouldStop(32768);
__ref.setField ("_mthirdstatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_parm))));
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypeface(RemoteObject __ref,RemoteObject _parm) throws Exception{
try {
		Debug.PushSubsStack("setTypeface (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,618);
if (RapidSub.canDelegate("settypeface")) { return __ref.runUserSub(false, "b4xstatebutton","settypeface", __ref, _parm);}
Debug.locals.put("parm", _parm);
 BA.debugLineNum = 618;BA.debugLine="public Sub setTypeface(parm As Typeface)";
Debug.ShouldStop(512);
 BA.debugLineNum = 619;BA.debugLine="mButton.Typeface = parm";
Debug.ShouldStop(1024);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setTypeface",(_parm.getObject()));
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _thisbuttonclick_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ThisButtonClick_Click (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("thisbuttonclick_click")) { return __ref.runUserSub(false, "b4xstatebutton","thisbuttonclick_click", __ref);}
RemoteObject _bs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton._sbg");
 BA.debugLineNum = 188;BA.debugLine="Private Sub ThisButtonClick_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="If (mAllowClick) Then";
Debug.ShouldStop(268435456);
if ((__ref.getField(true,"_mallowclick" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 190;BA.debugLine="Dim bs As SBG = mButton.Tag";
Debug.ShouldStop(536870912);
_bs = (__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("bs", _bs);Debug.locals.put("bs", _bs);
 BA.debugLineNum = 191;BA.debugLine="mState = bs.State";
Debug.ShouldStop(1073741824);
__ref.setField ("_mstate" /*RemoteObject*/ ,_bs.getField(true,"State" /*RemoteObject*/ ));
 BA.debugLineNum = 192;BA.debugLine="If mState = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 193;BA.debugLine="If mBooleanState Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_mbooleanstate" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 194;BA.debugLine="setState(1)";
Debug.ShouldStop(2);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 196;BA.debugLine="setState(NextSate)";
Debug.ShouldStop(8);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_nextsate" /*RemoteObject*/ )));
 };
 }else {
 BA.debugLineNum = 199;BA.debugLine="If mBooleanState Then";
Debug.ShouldStop(64);
if (__ref.getField(true,"_mbooleanstate" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 200;BA.debugLine="setState(0)";
Debug.ShouldStop(128);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 202;BA.debugLine="setState(NextSate)";
Debug.ShouldStop(512);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_nextsate" /*RemoteObject*/ )));
 };
 };
 };
 BA.debugLineNum = 206;BA.debugLine="CallSub2(mCallBack, mEventName & \"_StateClick\", g";
Debug.ShouldStop(8192);
b4xstatebutton.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_StateClick"))),(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getstate" /*RemoteObject*/ ))));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatebuttonstate(RemoteObject __ref,RemoteObject _thisstate) throws Exception{
try {
		Debug.PushSubsStack("updateButtonState (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("updatebuttonstate")) { return __ref.runUserSub(false, "b4xstatebutton","updatebuttonstate", __ref, _thisstate);}
Debug.locals.put("thisState", _thisstate);
 BA.debugLineNum = 230;BA.debugLine="Sub updateButtonState(thisState As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="changeGroupStates";
Debug.ShouldStop(64);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_changegroupstates" /*RemoteObject*/ );
 BA.debugLineNum = 232;BA.debugLine="updateButtonStateFirst(thisState)";
Debug.ShouldStop(128);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_updatebuttonstatefirst" /*RemoteObject*/ ,(Object)(_thisstate));
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatebuttonstatefirst(RemoteObject __ref,RemoteObject _thisstate) throws Exception{
try {
		Debug.PushSubsStack("updateButtonStateFirst (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("updatebuttonstatefirst")) { return __ref.runUserSub(false, "b4xstatebutton","updatebuttonstatefirst", __ref, _thisstate);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
RemoteObject _thiscolor = RemoteObject.createImmutable(0);
RemoteObject _thisradius = RemoteObject.createImmutable(0);
RemoteObject _thisbordercolor = RemoteObject.createImmutable(0);
RemoteObject _thisborder = RemoteObject.createImmutable(0);
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("thisState", _thisstate);
 BA.debugLineNum = 273;BA.debugLine="Sub updateButtonStateFirst(thisState As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 287;BA.debugLine="mDefaultColor = mBaseLabel.TextColor";
Debug.ShouldStop(1073741824);
__ref.setField ("_mdefaultcolor" /*RemoteObject*/ ,__ref.getField(false,"_mbaselabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 288;BA.debugLine="Dim textColor As Int";
Debug.ShouldStop(-2147483648);
_textcolor = RemoteObject.createImmutable(0);Debug.locals.put("textColor", _textcolor);
 BA.debugLineNum = 289;BA.debugLine="Dim thisColor As Int";
Debug.ShouldStop(1);
_thiscolor = RemoteObject.createImmutable(0);Debug.locals.put("thisColor", _thiscolor);
 BA.debugLineNum = 290;BA.debugLine="If thisState = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_thisstate,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 291;BA.debugLine="thisColor = mFirstStateColor";
Debug.ShouldStop(4);
_thiscolor = __ref.getField(true,"_mfirststatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 BA.debugLineNum = 292;BA.debugLine="textColor = mDefaultColor";
Debug.ShouldStop(8);
_textcolor = __ref.getField(true,"_mdefaultcolor" /*RemoteObject*/ );Debug.locals.put("textColor", _textcolor);
 }else 
{ BA.debugLineNum = 293;BA.debugLine="else if thisState = 1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_thisstate,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 294;BA.debugLine="textColor = mTextStateColor";
Debug.ShouldStop(32);
_textcolor = __ref.getField(true,"_mtextstatecolor" /*RemoteObject*/ );Debug.locals.put("textColor", _textcolor);
 BA.debugLineNum = 295;BA.debugLine="thisColor = mSecondStateColor";
Debug.ShouldStop(64);
_thiscolor = __ref.getField(true,"_msecondstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }else 
{ BA.debugLineNum = 296;BA.debugLine="else if thisState = 2 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_thisstate,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 297;BA.debugLine="textColor = mTextStateColor";
Debug.ShouldStop(256);
_textcolor = __ref.getField(true,"_mtextstatecolor" /*RemoteObject*/ );Debug.locals.put("textColor", _textcolor);
 BA.debugLineNum = 298;BA.debugLine="thisColor = mThirdStateColor";
Debug.ShouldStop(512);
_thiscolor = __ref.getField(true,"_mthirdstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }else {
 BA.debugLineNum = 300;BA.debugLine="textColor = mDefaultColor";
Debug.ShouldStop(2048);
_textcolor = __ref.getField(true,"_mdefaultcolor" /*RemoteObject*/ );Debug.locals.put("textColor", _textcolor);
 }}}
;
 BA.debugLineNum = 302;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
Debug.ShouldStop(8192);
_thisradius = __ref.getField(true,"_mradiussize" /*RemoteObject*/ );Debug.locals.put("thisRadius", _thisradius);Debug.locals.put("thisRadius", _thisradius);
 BA.debugLineNum = 303;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
Debug.ShouldStop(16384);
_thisbordercolor = __ref.getField(true,"_mbordercolor" /*RemoteObject*/ );Debug.locals.put("thisBorderColor", _thisbordercolor);Debug.locals.put("thisBorderColor", _thisbordercolor);
 BA.debugLineNum = 304;BA.debugLine="Dim thisBorder As Int = 0";
Debug.ShouldStop(32768);
_thisborder = BA.numberCast(int.class, 0);Debug.locals.put("thisBorder", _thisborder);Debug.locals.put("thisBorder", _thisborder);
 BA.debugLineNum = 305;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_mshowborder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_thisborder = __ref.getField(true,"_mbordersize" /*RemoteObject*/ );Debug.locals.put("thisBorder", _thisborder);};
 BA.debugLineNum = 306;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(131072);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 307;BA.debugLine="cd.initialize2(thisColor, thisRadius, thisBorder,";
Debug.ShouldStop(262144);
_cd.runVoidMethod ("Initialize2",(Object)(_thiscolor),(Object)(_thisradius),(Object)(_thisborder),(Object)(_thisbordercolor));
 BA.debugLineNum = 308;BA.debugLine="mButton.background = cd";
Debug.ShouldStop(524288);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 309;BA.debugLine="mButton.TextColor = textColor";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 311;BA.debugLine="mButton.tag = CreateSBG(mState, mButtonGroup, mRe";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setTag",(__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_createsbg" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mstate" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mbuttongroup" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mreference" /*RemoteObject*/ )),(Object)(BA.ObjectToString(__ref.getField(false,"_mtag" /*RemoteObject*/ ))))));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatecontrol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateControl (b4xstatebutton) ","b4xstatebutton",21,__ref.getField(false, "ba"),__ref,625);
if (RapidSub.canDelegate("updatecontrol")) { return __ref.runUserSub(false, "b4xstatebutton","updatecontrol", __ref);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
RemoteObject _thiscolor = RemoteObject.createImmutable(0);
RemoteObject _thisradius = RemoteObject.createImmutable(0);
RemoteObject _thisbordercolor = RemoteObject.createImmutable(0);
RemoteObject _thisborder = RemoteObject.createImmutable(0);
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 BA.debugLineNum = 625;BA.debugLine="public Sub UpdateControl";
Debug.ShouldStop(65536);
 BA.debugLineNum = 638;BA.debugLine="If (mUseDIP) Then";
Debug.ShouldStop(536870912);
if ((__ref.getField(true,"_musedip" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 639;BA.debugLine="mBorderSize = mBorderSize * 1dip";
Debug.ShouldStop(1073741824);
__ref.setField ("_mbordersize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mbordersize" /*RemoteObject*/ ),b4xstatebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 1));
 BA.debugLineNum = 640;BA.debugLine="mRadiusSize = mRadiusSize * 1dip";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mradiussize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mradiussize" /*RemoteObject*/ ),b4xstatebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 1));
 };
 BA.debugLineNum = 643;BA.debugLine="mDefaultColor = mBaseLabel.TextColor";
Debug.ShouldStop(4);
__ref.setField ("_mdefaultcolor" /*RemoteObject*/ ,__ref.getField(false,"_mbaselabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 644;BA.debugLine="Dim textColor As Int";
Debug.ShouldStop(8);
_textcolor = RemoteObject.createImmutable(0);Debug.locals.put("textColor", _textcolor);
 BA.debugLineNum = 645;BA.debugLine="Dim thisColor As Int";
Debug.ShouldStop(16);
_thiscolor = RemoteObject.createImmutable(0);Debug.locals.put("thisColor", _thiscolor);
 BA.debugLineNum = 646;BA.debugLine="If mState = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 647;BA.debugLine="thisColor = mFirstStateColor";
Debug.ShouldStop(64);
_thiscolor = __ref.getField(true,"_mfirststatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 BA.debugLineNum = 648;BA.debugLine="textColor = mDefaultColor";
Debug.ShouldStop(128);
_textcolor = __ref.getField(true,"_mdefaultcolor" /*RemoteObject*/ );Debug.locals.put("textColor", _textcolor);
 }else 
{ BA.debugLineNum = 649;BA.debugLine="else if mState = 1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 650;BA.debugLine="thisColor = mSecondStateColor";
Debug.ShouldStop(512);
_thiscolor = __ref.getField(true,"_msecondstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 BA.debugLineNum = 651;BA.debugLine="thisColor = mSecondStateColor";
Debug.ShouldStop(1024);
_thiscolor = __ref.getField(true,"_msecondstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }else 
{ BA.debugLineNum = 652;BA.debugLine="else if mState = 2 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mstate" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 653;BA.debugLine="thisColor = mThirdStateColor";
Debug.ShouldStop(4096);
_thiscolor = __ref.getField(true,"_mthirdstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 BA.debugLineNum = 654;BA.debugLine="thisColor = mThirdStateColor";
Debug.ShouldStop(8192);
_thiscolor = __ref.getField(true,"_mthirdstatecolor" /*RemoteObject*/ );Debug.locals.put("thisColor", _thiscolor);
 }else {
 BA.debugLineNum = 656;BA.debugLine="textColor = mDefaultColor";
Debug.ShouldStop(32768);
_textcolor = __ref.getField(true,"_mdefaultcolor" /*RemoteObject*/ );Debug.locals.put("textColor", _textcolor);
 }}}
;
 BA.debugLineNum = 658;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
Debug.ShouldStop(131072);
_thisradius = __ref.getField(true,"_mradiussize" /*RemoteObject*/ );Debug.locals.put("thisRadius", _thisradius);Debug.locals.put("thisRadius", _thisradius);
 BA.debugLineNum = 659;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
Debug.ShouldStop(262144);
_thisbordercolor = __ref.getField(true,"_mbordercolor" /*RemoteObject*/ );Debug.locals.put("thisBorderColor", _thisbordercolor);Debug.locals.put("thisBorderColor", _thisbordercolor);
 BA.debugLineNum = 660;BA.debugLine="Dim thisBorder As Int = 0";
Debug.ShouldStop(524288);
_thisborder = BA.numberCast(int.class, 0);Debug.locals.put("thisBorder", _thisborder);Debug.locals.put("thisBorder", _thisborder);
 BA.debugLineNum = 661;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
Debug.ShouldStop(1048576);
if (__ref.getField(true,"_mshowborder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_thisborder = __ref.getField(true,"_mbordersize" /*RemoteObject*/ );Debug.locals.put("thisBorder", _thisborder);};
 BA.debugLineNum = 662;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(2097152);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 663;BA.debugLine="cd.initialize2(thisColor, thisRadius, thisBorder,";
Debug.ShouldStop(4194304);
_cd.runVoidMethod ("Initialize2",(Object)(_thiscolor),(Object)(_thisradius),(Object)(_thisborder),(Object)(_thisbordercolor));
 BA.debugLineNum = 664;BA.debugLine="mButton.background = cd";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 665;BA.debugLine="mButton.TextColor = textColor";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbutton" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}