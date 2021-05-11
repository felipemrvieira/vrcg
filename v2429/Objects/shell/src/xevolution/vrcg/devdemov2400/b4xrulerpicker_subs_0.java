package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xrulerpicker_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xrulerpicker","base_resize", __ref, _width, _height);}
RemoteObject _w = RemoteObject.createImmutable(0);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 64;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Widt";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 66;BA.debugLine="Dim w As Int = Width";
Debug.ShouldStop(2);
_w = BA.numberCast(int.class, _width);Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 67;BA.debugLine="If w Mod 2 = 1 Then w = w + 1";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 1))) { 
_w = RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("w", _w);};
 BA.debugLineNum = 68;BA.debugLine="cvs.Resize(w, Height)";
Debug.ShouldStop(8);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(BA.numberCast(float.class, _w)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 69;BA.debugLine="TrianglePath.Initialize(w / 2 - 10dip, 0)";
Debug.ShouldStop(16);
__ref.getField(false,"_trianglepath" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(2),b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "/-",1, 0))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 70;BA.debugLine="TrianglePath.LineTo(w / 2 + 10dip, 0)";
Debug.ShouldStop(32);
__ref.getField(false,"_trianglepath" /*RemoteObject*/ ).runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(2),b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "/+",1, 0))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 71;BA.debugLine="TrianglePath.LineTo(w / 2, 20dip)";
Debug.ShouldStop(64);
__ref.getField(false,"_trianglepath" /*RemoteObject*/ ).runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))));
 BA.debugLineNum = 72;BA.debugLine="ShortLineLength = Height / 4";
Debug.ShouldStop(128);
__ref.setField ("_shortlinelength" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(4)}, "/",0, 0)));
 BA.debugLineNum = 73;BA.debugLine="LongLineLength = Height / 2";
Debug.ShouldStop(256);
__ref.setField ("_longlinelength" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 74;BA.debugLine="draw";
Debug.ShouldStop(512);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
b4xrulerpicker._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xrulerpicker._meventname);
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
b4xrulerpicker._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xrulerpicker._mcallback);
 //BA.debugLineNum = 13;BA.debugLine="Private mBase As B4XView 'ignore";
b4xrulerpicker._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xrulerpicker._mbase);
 //BA.debugLineNum = 14;BA.debugLine="Private xui As XUI 'ignore";
b4xrulerpicker._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xrulerpicker._xui);
 //BA.debugLineNum = 15;BA.debugLine="Private cvs As B4XCanvas";
b4xrulerpicker._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",b4xrulerpicker._cvs);
 //BA.debugLineNum = 16;BA.debugLine="Private mValue As Float = 0";
b4xrulerpicker._mvalue = BA.numberCast(float.class, 0);__ref.setField("_mvalue",b4xrulerpicker._mvalue);
 //BA.debugLineNum = 17;BA.debugLine="Private touchXposition As Int";
b4xrulerpicker._touchxposition = RemoteObject.createImmutable(0);__ref.setField("_touchxposition",b4xrulerpicker._touchxposition);
 //BA.debugLineNum = 18;BA.debugLine="Private touchXValue As Float";
b4xrulerpicker._touchxvalue = RemoteObject.createImmutable(0f);__ref.setField("_touchxvalue",b4xrulerpicker._touchxvalue);
 //BA.debugLineNum = 19;BA.debugLine="Private LinesColor As Int";
b4xrulerpicker._linescolor = RemoteObject.createImmutable(0);__ref.setField("_linescolor",b4xrulerpicker._linescolor);
 //BA.debugLineNum = 20;BA.debugLine="Private BackgroundColor As Int";
b4xrulerpicker._backgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_backgroundcolor",b4xrulerpicker._backgroundcolor);
 //BA.debugLineNum = 21;BA.debugLine="Private GapsWidth As Int";
b4xrulerpicker._gapswidth = RemoteObject.createImmutable(0);__ref.setField("_gapswidth",b4xrulerpicker._gapswidth);
 //BA.debugLineNum = 22;BA.debugLine="Private StepValue As Int";
b4xrulerpicker._stepvalue = RemoteObject.createImmutable(0);__ref.setField("_stepvalue",b4xrulerpicker._stepvalue);
 //BA.debugLineNum = 23;BA.debugLine="Private RulerScale As Float";
b4xrulerpicker._rulerscale = RemoteObject.createImmutable(0f);__ref.setField("_rulerscale",b4xrulerpicker._rulerscale);
 //BA.debugLineNum = 24;BA.debugLine="Private fnt As B4XFont";
b4xrulerpicker._fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_fnt",b4xrulerpicker._fnt);
 //BA.debugLineNum = 25;BA.debugLine="Private LongLineInterval As Int = 5";
b4xrulerpicker._longlineinterval = BA.numberCast(int.class, 5);__ref.setField("_longlineinterval",b4xrulerpicker._longlineinterval);
 //BA.debugLineNum = 26;BA.debugLine="Private TrianglePath As B4XPath";
b4xrulerpicker._trianglepath = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");__ref.setField("_trianglepath",b4xrulerpicker._trianglepath);
 //BA.debugLineNum = 27;BA.debugLine="Private ShortLineLength, LongLineLength As Int";
b4xrulerpicker._shortlinelength = RemoteObject.createImmutable(0);__ref.setField("_shortlinelength",b4xrulerpicker._shortlinelength);
b4xrulerpicker._longlinelength = RemoteObject.createImmutable(0);__ref.setField("_longlinelength",b4xrulerpicker._longlinelength);
 //BA.debugLineNum = 28;BA.debugLine="Private SnapToGrid As Boolean";
b4xrulerpicker._snaptogrid = RemoteObject.createImmutable(false);__ref.setField("_snaptogrid",b4xrulerpicker._snaptogrid);
 //BA.debugLineNum = 29;BA.debugLine="Private TextOffset As Int";
b4xrulerpicker._textoffset = RemoteObject.createImmutable(0);__ref.setField("_textoffset",b4xrulerpicker._textoffset);
 //BA.debugLineNum = 30;BA.debugLine="Private MinValue, MaxValue As Int";
b4xrulerpicker._minvalue = RemoteObject.createImmutable(0);__ref.setField("_minvalue",b4xrulerpicker._minvalue);
b4xrulerpicker._maxvalue = RemoteObject.createImmutable(0);__ref.setField("_maxvalue",b4xrulerpicker._maxvalue);
 //BA.debugLineNum = 31;BA.debugLine="Private mTag As Object";
b4xrulerpicker._mtag = RemoteObject.createNew ("Object");__ref.setField("_mtag",b4xrulerpicker._mtag);
 //BA.debugLineNum = 33;BA.debugLine="Private StubPanel As Panel 'ignore";
b4xrulerpicker._stubpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_stubpanel",b4xrulerpicker._stubpanel);
 //BA.debugLineNum = 34;BA.debugLine="Type MouseEvent (X As Int, Y As Int)";
;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xrulerpicker","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _pnl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 44;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="mBase = Base";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 46;BA.debugLine="Dim pnl1 As B4XView = xui.CreatePanel(\"pnl1\")";
Debug.ShouldStop(8192);
_pnl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl1 = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl1")));Debug.locals.put("pnl1", _pnl1);Debug.locals.put("pnl1", _pnl1);
 BA.debugLineNum = 47;BA.debugLine="mBase.AddView(pnl1, 0, 0, 1dip, 1dip)";
Debug.ShouldStop(16384);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_pnl1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 48;BA.debugLine="cvs.Initialize(pnl1)";
Debug.ShouldStop(32768);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_pnl1));
 BA.debugLineNum = 49;BA.debugLine="LinesColor = xui.PaintOrColorToColor(Props.Get(\"L";
Debug.ShouldStop(65536);
__ref.setField ("_linescolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LinesColor")))))));
 BA.debugLineNum = 50;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
Debug.ShouldStop(131072);
__ref.setField ("_backgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BackgroundColor")))))));
 BA.debugLineNum = 51;BA.debugLine="GapsWidth = DipToCurrent(Props.Get(\"GapsWidth\"))";
Debug.ShouldStop(262144);
__ref.setField ("_gapswidth" /*RemoteObject*/ ,b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("GapsWidth"))))))));
 BA.debugLineNum = 52;BA.debugLine="StepValue = Props.Get(\"StepValue\")";
Debug.ShouldStop(524288);
__ref.setField ("_stepvalue" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StepValue"))))));
 BA.debugLineNum = 53;BA.debugLine="MinValue = Props.GetDefault(\"MinValue\", 0) 'using";
Debug.ShouldStop(1048576);
__ref.setField ("_minvalue" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("MinValue"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 54;BA.debugLine="MaxValue = Props.GetDefault(\"MaxValue\", 100)";
Debug.ShouldStop(2097152);
__ref.setField ("_maxvalue" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("MaxValue"))),(Object)(RemoteObject.createImmutable((100))))));
 BA.debugLineNum = 55;BA.debugLine="SnapToGrid = Props.Get(\"SnapToGrid\")";
Debug.ShouldStop(4194304);
__ref.setField ("_snaptogrid" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SnapToGrid"))))));
 BA.debugLineNum = 56;BA.debugLine="RulerScale = StepValue / GapsWidth";
Debug.ShouldStop(8388608);
__ref.setField ("_rulerscale" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_stepvalue" /*RemoteObject*/ ),__ref.getField(true,"_gapswidth" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 57;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.ShouldStop(16777216);
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 58;BA.debugLine="fnt = xlbl.Font";
Debug.ShouldStop(33554432);
__ref.setField ("_fnt" /*RemoteObject*/ ,_xlbl.runMethod(false,"getFont"));
 BA.debugLineNum = 59;BA.debugLine="TextOffset = 15dip";
Debug.ShouldStop(67108864);
__ref.setField ("_textoffset" /*RemoteObject*/ ,b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))));
 BA.debugLineNum = 60;BA.debugLine="If xui.IsB4i Then TextOffset = 25dip";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i").<Boolean>get().booleanValue()) { 
__ref.setField ("_textoffset" /*RemoteObject*/ ,b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))));};
 BA.debugLineNum = 61;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
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
public static RemoteObject  _draw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("draw (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "b4xrulerpicker","draw", __ref);}
RemoteObject _centerposition = RemoteObject.createImmutable(0);
RemoteObject _minposition = RemoteObject.createImmutable(0);
RemoteObject _maxposition = RemoteObject.createImmutable(0);
RemoteObject _x0position = RemoteObject.createImmutable(0);
RemoteObject _firstlineposition = RemoteObject.createImmutable(0);
RemoteObject _firstlinevalue = RemoteObject.createImmutable(0);
RemoteObject _counter = RemoteObject.createImmutable(0);
int _x = 0;
RemoteObject _v = RemoteObject.createImmutable(0);
 BA.debugLineNum = 77;BA.debugLine="Private Sub draw";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="Dim CenterPosition As Int = Round(mValue / RulerS";
Debug.ShouldStop(16384);
_centerposition = BA.numberCast(int.class, b4xrulerpicker.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_rulerscale" /*RemoteObject*/ )}, "/",0, 0))));Debug.locals.put("CenterPosition", _centerposition);Debug.locals.put("CenterPosition", _centerposition);
 BA.debugLineNum = 80;BA.debugLine="Dim MinPosition As Int = Round(MinValue / RulerSc";
Debug.ShouldStop(32768);
_minposition = BA.numberCast(int.class, b4xrulerpicker.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_minvalue" /*RemoteObject*/ ),__ref.getField(true,"_rulerscale" /*RemoteObject*/ )}, "/",0, 0))));Debug.locals.put("MinPosition", _minposition);Debug.locals.put("MinPosition", _minposition);
 BA.debugLineNum = 81;BA.debugLine="Dim MaxPosition As Int = Round(MaxValue / RulerSc";
Debug.ShouldStop(65536);
_maxposition = BA.numberCast(int.class, b4xrulerpicker.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_rulerscale" /*RemoteObject*/ )}, "/",0, 0))));Debug.locals.put("MaxPosition", _maxposition);Debug.locals.put("MaxPosition", _maxposition);
 BA.debugLineNum = 82;BA.debugLine="Dim x0position As Int = CenterPosition - cvs.Targ";
Debug.ShouldStop(131072);
_x0position = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centerposition,__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0));Debug.locals.put("x0position", _x0position);Debug.locals.put("x0position", _x0position);
 BA.debugLineNum = 83;BA.debugLine="Dim FirstLinePosition As Int = Floor(x0position /";
Debug.ShouldStop(262144);
_firstlineposition = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xrulerpicker.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_x0position,__ref.getField(true,"_gapswidth" /*RemoteObject*/ )}, "/",0, 0))),__ref.getField(true,"_gapswidth" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("FirstLinePosition", _firstlineposition);Debug.locals.put("FirstLinePosition", _firstlineposition);
 BA.debugLineNum = 84;BA.debugLine="If FirstLinePosition < x0position Then FirstLineP";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",_firstlineposition,BA.numberCast(double.class, _x0position))) { 
_firstlineposition = RemoteObject.solve(new RemoteObject[] {_firstlineposition,__ref.getField(true,"_gapswidth" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("FirstLinePosition", _firstlineposition);};
 BA.debugLineNum = 85;BA.debugLine="Dim FirstLineValue As Int = FirstLinePosition * R";
Debug.ShouldStop(1048576);
_firstlinevalue = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_firstlineposition,__ref.getField(true,"_rulerscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("FirstLineValue", _firstlinevalue);Debug.locals.put("FirstLineValue", _firstlinevalue);
 BA.debugLineNum = 86;BA.debugLine="cvs.DrawRect(cvs.TargetRect, BackgroundColor, Tru";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_backgroundcolor" /*RemoteObject*/ )),(Object)(b4xrulerpicker.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 87;BA.debugLine="Dim counter As Int = FirstLineValue / StepValue";
Debug.ShouldStop(4194304);
_counter = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_firstlinevalue,__ref.getField(true,"_stepvalue" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("counter", _counter);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 88;BA.debugLine="For x = FirstLinePosition To x0position + cvs.Tar";
Debug.ShouldStop(8388608);
{
final int step10 = __ref.getField(true,"_gapswidth" /*RemoteObject*/ ).<Integer>get().intValue();
final int limit10 = (int) (0 + RemoteObject.solve(new RemoteObject[] {_x0position,__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth")}, "+",1, 0).<Double>get().doubleValue());
_x = _firstlineposition.<Integer>get().intValue() ;
for (;(step10 > 0 && _x <= limit10) || (step10 < 0 && _x >= limit10) ;_x = ((int)(0 + _x + step10))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 89;BA.debugLine="If x >= MinPosition And x <= MaxPosition Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("g",RemoteObject.createImmutable(_x),BA.numberCast(double.class, _minposition)) && RemoteObject.solveBoolean("k",RemoteObject.createImmutable(_x),BA.numberCast(double.class, _maxposition))) { 
 BA.debugLineNum = 90;BA.debugLine="If counter Mod LongLineInterval = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_counter,__ref.getField(true,"_longlineinterval" /*RemoteObject*/ )}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 91;BA.debugLine="Dim v As Int = x * RulerScale";
Debug.ShouldStop(67108864);
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),__ref.getField(true,"_rulerscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 92;BA.debugLine="cvs.DrawLine(x - x0position, 0, x - x0position";
Debug.ShouldStop(134217728);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_x0position}, "-",1, 1))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_x0position}, "-",1, 1))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_longlinelength" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_linescolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 93;BA.debugLine="cvs.DrawText(v, x - x0position, LongLineLength";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(BA.NumberToString(_v)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_x0position}, "-",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_longlinelength" /*RemoteObject*/ ),__ref.getField(true,"_textoffset" /*RemoteObject*/ )}, "+",1, 1))),(Object)(__ref.getField(false,"_fnt" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_linescolor" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 }else {
 BA.debugLineNum = 95;BA.debugLine="cvs.DrawLine(x - x0position, 0, x-x0position,";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_x0position}, "-",1, 1))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_x0position}, "-",1, 1))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_shortlinelength" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_linescolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, b4xrulerpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 };
 };
 BA.debugLineNum = 98;BA.debugLine="counter = counter + 1";
Debug.ShouldStop(2);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("counter", _counter);
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 100;BA.debugLine="cvs.ClipPath(TrianglePath)";
Debug.ShouldStop(8);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(__ref.getField(false,"_trianglepath" /*RemoteObject*/ )));
 BA.debugLineNum = 101;BA.debugLine="cvs.DrawRect(cvs.TargetRect, LinesColor, True, 0)";
Debug.ShouldStop(16);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_linescolor" /*RemoteObject*/ )),(Object)(b4xrulerpicker.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 102;BA.debugLine="cvs.RemoveClip";
Debug.ShouldStop(32);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 BA.debugLineNum = 103;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(64);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmax(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMax (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("getmax")) { return __ref.runUserSub(false, "b4xrulerpicker","getmax", __ref);}
 BA.debugLineNum = 163;BA.debugLine="Public Sub getMax As Float";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Return MaxValue";
Debug.ShouldStop(8);
if (true) return BA.numberCast(float.class, __ref.getField(true,"_maxvalue" /*RemoteObject*/ ));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmin(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMin (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("getmin")) { return __ref.runUserSub(false, "b4xrulerpicker","getmin", __ref);}
 BA.debugLineNum = 153;BA.debugLine="Public Sub getMin As Float";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Return MinValue";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(float.class, __ref.getField(true,"_minvalue" /*RemoteObject*/ ));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettag(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTag (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("gettag")) { return __ref.runUserSub(false, "b4xrulerpicker","gettag", __ref);}
 BA.debugLineNum = 172;BA.debugLine="Public Sub getTag As Object";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="Return mTag";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_mtag" /*RemoteObject*/ );
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "b4xrulerpicker","getvalue", __ref);}
 BA.debugLineNum = 144;BA.debugLine="Public Sub getValue As Float";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="Return mValue";
Debug.ShouldStop(65536);
if (true) return __ref.getField(true,"_mvalue" /*RemoteObject*/ );
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xrulerpicker","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(64);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 40;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(128);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl1_mousedragged(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnl1_MouseDragged (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("pnl1_mousedragged")) { return __ref.runUserSub(false, "b4xrulerpicker","pnl1_mousedragged", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 125;BA.debugLine="Private Sub pnl1_MouseDragged (EventData As MouseE";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="setValue(touchXValue - (EventData.X - touchXposit";
Debug.ShouldStop(536870912);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_touchxvalue" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_eventdata.getField(true,"X" /*RemoteObject*/ ),__ref.getField(true,"_touchxposition" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_rulerscale" /*RemoteObject*/ )}, "-*",1, 0))));
 BA.debugLineNum = 127;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_valuech";
Debug.ShouldStop(1073741824);
b4xrulerpicker.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_valuechanged"))),(Object)((__ref.getField(true,"_mvalue" /*RemoteObject*/ ))));
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
public static RemoteObject  _pnl1_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnl1_MousePressed (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("pnl1_mousepressed")) { return __ref.runUserSub(false, "b4xrulerpicker","pnl1_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 119;BA.debugLine="Private Sub pnl1_MousePressed (EventData As MouseE";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 121;BA.debugLine="touchXposition = EventData.X";
Debug.ShouldStop(16777216);
__ref.setField ("_touchxposition" /*RemoteObject*/ ,_eventdata.getField(true,"X" /*RemoteObject*/ ));
 BA.debugLineNum = 122;BA.debugLine="touchXValue = mValue";
Debug.ShouldStop(33554432);
__ref.setField ("_touchxvalue" /*RemoteObject*/ ,__ref.getField(true,"_mvalue" /*RemoteObject*/ ));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl1_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnl1_MouseReleased (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("pnl1_mousereleased")) { return __ref.runUserSub(false, "b4xrulerpicker","pnl1_mousereleased", __ref, _eventdata);}
RemoteObject _x1 = RemoteObject.createImmutable(0);
RemoteObject _x2 = RemoteObject.createImmutable(0);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 130;BA.debugLine="Private Sub pnl1_MouseReleased (EventData As Mouse";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="If SnapToGrid Then";
Debug.ShouldStop(4);
if (__ref.getField(true,"_snaptogrid" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 132;BA.debugLine="Dim x1 As Int = Floor(mValue / StepValue) * Step";
Debug.ShouldStop(8);
_x1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xrulerpicker.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_stepvalue" /*RemoteObject*/ )}, "/",0, 0))),__ref.getField(true,"_stepvalue" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("x1", _x1);Debug.locals.put("x1", _x1);
 BA.debugLineNum = 133;BA.debugLine="Dim x2 As Int = x1 + StepValue";
Debug.ShouldStop(16);
_x2 = RemoteObject.solve(new RemoteObject[] {_x1,__ref.getField(true,"_stepvalue" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("x2", _x2);Debug.locals.put("x2", _x2);
 BA.debugLineNum = 134;BA.debugLine="If mValue - x1 < x2 - mValue Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),_x1}, "-",1, 0),RemoteObject.solve(new RemoteObject[] {_x2,__ref.getField(true,"_mvalue" /*RemoteObject*/ )}, "-",1, 0))) { 
 BA.debugLineNum = 135;BA.debugLine="setValue(x1)";
Debug.ShouldStop(64);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, _x1)));
 }else {
 BA.debugLineNum = 137;BA.debugLine="setValue(x2)";
Debug.ShouldStop(256);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, _x2)));
 };
 BA.debugLineNum = 139;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_valuec";
Debug.ShouldStop(1024);
b4xrulerpicker.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_valuechanged"))),(Object)((__ref.getField(true,"_mvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 140;BA.debugLine="draw";
Debug.ShouldStop(2048);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_draw" /*RemoteObject*/ );
 };
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl1_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("pnl1_Touch (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("pnl1_touch")) { return __ref.runUserSub(false, "b4xrulerpicker","pnl1_touch", __ref, _action, _x, _y);}
RemoteObject _ed = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xrulerpicker._mouseevent");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 106;BA.debugLine="Private Sub pnl1_Touch (Action As Int, X As Float,";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Private ed As MouseEvent";
Debug.ShouldStop(1024);
_ed = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xrulerpicker._mouseevent");Debug.locals.put("ed", _ed);
 BA.debugLineNum = 108;BA.debugLine="ed.X = X";
Debug.ShouldStop(2048);
_ed.setField ("X" /*RemoteObject*/ ,BA.numberCast(int.class, _x));
 BA.debugLineNum = 109;BA.debugLine="ed.Y = Y";
Debug.ShouldStop(4096);
_ed.setField ("Y" /*RemoteObject*/ ,BA.numberCast(int.class, _y));
 BA.debugLineNum = 110;BA.debugLine="If Action = StubPanel.ACTION_DOWN Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_stubpanel" /*RemoteObject*/ ).getField(true,"ACTION_DOWN")))) { 
 BA.debugLineNum = 111;BA.debugLine="pnl1_MousePressed(ed)";
Debug.ShouldStop(16384);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_pnl1_mousepressed" /*RemoteObject*/ ,(Object)(_ed));
 }else 
{ BA.debugLineNum = 112;BA.debugLine="Else if Action = StubPanel.ACTION_MOVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_stubpanel" /*RemoteObject*/ ).getField(true,"ACTION_MOVE")))) { 
 BA.debugLineNum = 113;BA.debugLine="pnl1_MouseDragged(ed)";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_pnl1_mousedragged" /*RemoteObject*/ ,(Object)(_ed));
 }else {
 BA.debugLineNum = 115;BA.debugLine="pnl1_MouseReleased(ed)";
Debug.ShouldStop(262144);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_pnl1_mousereleased" /*RemoteObject*/ ,(Object)(_ed));
 }}
;
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
public static RemoteObject  _setmax(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("setMax (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("setmax")) { return __ref.runUserSub(false, "b4xrulerpicker","setmax", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 167;BA.debugLine="Public Sub setMax (f As Float)";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="MaxValue = f";
Debug.ShouldStop(128);
__ref.setField ("_maxvalue" /*RemoteObject*/ ,BA.numberCast(int.class, _f));
 BA.debugLineNum = 169;BA.debugLine="draw";
Debug.ShouldStop(256);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_draw" /*RemoteObject*/ );
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
public static RemoteObject  _setmin(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("setMin (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("setmin")) { return __ref.runUserSub(false, "b4xrulerpicker","setmin", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 157;BA.debugLine="Public Sub setMin (f As Float)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="MinValue = f";
Debug.ShouldStop(536870912);
__ref.setField ("_minvalue" /*RemoteObject*/ ,BA.numberCast(int.class, _f));
 BA.debugLineNum = 159;BA.debugLine="draw";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("setTag (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("settag")) { return __ref.runUserSub(false, "b4xrulerpicker","settag", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 176;BA.debugLine="Public Sub setTag (f As Object)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="mTag = f";
Debug.ShouldStop(65536);
__ref.setField ("_mtag" /*RemoteObject*/ ,_f);
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("setValue (b4xrulerpicker) ","b4xrulerpicker",20,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "b4xrulerpicker","setvalue", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 148;BA.debugLine="Public Sub setValue (f As Float)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="mValue = Min(MaxValue, Max(MinValue, f))";
Debug.ShouldStop(1048576);
__ref.setField ("_mvalue" /*RemoteObject*/ ,BA.numberCast(float.class, b4xrulerpicker.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvalue" /*RemoteObject*/ ))),(Object)(b4xrulerpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvalue" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _f)))))));
 BA.debugLineNum = 150;BA.debugLine="draw";
Debug.ShouldStop(2097152);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xrulerpicker.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}