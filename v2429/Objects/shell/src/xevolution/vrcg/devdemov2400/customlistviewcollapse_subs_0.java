package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class customlistviewcollapse_subs_0 {


public static RemoteObject  _add(RemoteObject __ref,RemoteObject _pnl,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Add (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("add")) { return __ref.runUserSub(false, "customlistviewcollapse","add", __ref, _pnl, _value);}
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 403;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 404;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_insertat" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_pnl),(Object)(_value));
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtextitem(RemoteObject __ref,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddTextItem (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("addtextitem")) { return __ref.runUserSub(false, "customlistviewcollapse","addtextitem", __ref, _text, _value);}
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 196;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
Debug.ShouldStop(16);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_insertattextitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_text),(Object)(_value));
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "customlistviewcollapse","asview", __ref);}
 BA.debugLineNum = 126;BA.debugLine="Public Sub AsView As B4XView";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="Return mBase";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "customlistviewcollapse","base_resize", __ref, _width, _height);}
RemoteObject _scrollbar = RemoteObject.createImmutable(0);
RemoteObject _it = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 102;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.ShouldStop(64);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 104;BA.debugLine="Dim scrollbar As Int";
Debug.ShouldStop(128);
_scrollbar = RemoteObject.createImmutable(0);Debug.locals.put("scrollbar", _scrollbar);
 BA.debugLineNum = 105;BA.debugLine="If xui.IsB4J And ScrollBarsVisible Then scrollbar";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J")) && RemoteObject.solveBoolean(".",__ref.getField(true,"_scrollbarsvisible" /*RemoteObject*/ ))) { 
_scrollbar = BA.numberCast(int.class, 20);Debug.locals.put("scrollbar", _scrollbar);};
 BA.debugLineNum = 106;BA.debugLine="If horizontal Then";
Debug.ShouldStop(512);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 107;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
Debug.ShouldStop(1024);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,_scrollbar}, "-",1, 0)));
 BA.debugLineNum = 108;BA.debugLine="For Each it As CLVItem In items";
Debug.ShouldStop(2048);
{
final RemoteObject group6 = __ref.getField(false,"_items" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (group6.runMethod(false,"Get",index6));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 109;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
Debug.ShouldStop(4096);
_it.getField(false,"Panel").runMethod(true,"setHeight",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight"));
 BA.debugLineNum = 110;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
Debug.ShouldStop(8192);
_it.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setHeight",_it.getField(false,"Panel").runMethod(true,"getHeight"));
 }
}Debug.locals.put("it", _it);
;
 }else {
 BA.debugLineNum = 113;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
Debug.ShouldStop(65536);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,_scrollbar}, "-",1, 0)));
 BA.debugLineNum = 114;BA.debugLine="For Each it As CLVItem In items";
Debug.ShouldStop(131072);
{
final RemoteObject group12 = __ref.getField(false,"_items" /*RemoteObject*/ );
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (group12.runMethod(false,"Get",index12));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 115;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
Debug.ShouldStop(262144);
_it.getField(false,"Panel").runMethod(true,"setWidth",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"));
 BA.debugLineNum = 116;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
Debug.ShouldStop(524288);
_it.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setWidth",_it.getField(false,"Panel").runMethod(true,"getWidth"));
 BA.debugLineNum = 117;BA.debugLine="If it.TextItem Then";
Debug.ShouldStop(1048576);
if (_it.getField(true,"TextItem").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 118;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
Debug.ShouldStop(2097152);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = _it.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 119;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
Debug.ShouldStop(4194304);
_lbl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(_lbl.runMethod(true,"getLeft")),(Object)(_lbl.runMethod(true,"getTop")),(Object)(RemoteObject.solve(new RemoteObject[] {_it.getField(false,"Panel").runMethod(true,"getWidth"),_lbl.runMethod(true,"getLeft")}, "-",1, 1)),(Object)(_lbl.runMethod(true,"getHeight")));
 };
 }
}Debug.locals.put("it", _it);
;
 };
 BA.debugLineNum = 123;BA.debugLine="If items.Size > 0 Then UpdateVisibleRange";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_updatevisiblerange" /*RemoteObject*/ );};
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private mBase As B4XView";
customlistviewcollapse._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",customlistviewcollapse._mbase);
 //BA.debugLineNum = 15;BA.debugLine="Private mParent As B4XView";
customlistviewcollapse._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",customlistviewcollapse._mparent);
 //BA.debugLineNum = 16;BA.debugLine="Public sv As B4XView";
customlistviewcollapse._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_sv",customlistviewcollapse._sv);
 //BA.debugLineNum = 17;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
 //BA.debugLineNum = 19;BA.debugLine="Private items As List";
customlistviewcollapse._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_items",customlistviewcollapse._items);
 //BA.debugLineNum = 20;BA.debugLine="Private mDividerSize As Float";
customlistviewcollapse._mdividersize = RemoteObject.createImmutable(0f);__ref.setField("_mdividersize",customlistviewcollapse._mdividersize);
 //BA.debugLineNum = 21;BA.debugLine="Private EventName As String";
customlistviewcollapse._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",customlistviewcollapse._eventname);
 //BA.debugLineNum = 22;BA.debugLine="Private CallBack As Object";
customlistviewcollapse._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",customlistviewcollapse._callback);
 //BA.debugLineNum = 23;BA.debugLine="Public DefaultTextColor As Int";
customlistviewcollapse._defaulttextcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextcolor",customlistviewcollapse._defaulttextcolor);
 //BA.debugLineNum = 24;BA.debugLine="Public DefaultTextBackgroundColor As Int";
customlistviewcollapse._defaulttextbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextbackgroundcolor",customlistviewcollapse._defaulttextbackgroundcolor);
 //BA.debugLineNum = 25;BA.debugLine="Public AnimationDuration As Int = 300";
customlistviewcollapse._animationduration = BA.numberCast(int.class, 300);__ref.setField("_animationduration",customlistviewcollapse._animationduration);
 //BA.debugLineNum = 26;BA.debugLine="Private LastReachEndEvent As Long";
customlistviewcollapse._lastreachendevent = RemoteObject.createImmutable(0L);__ref.setField("_lastreachendevent",customlistviewcollapse._lastreachendevent);
 //BA.debugLineNum = 27;BA.debugLine="Private PressedColor As Int";
customlistviewcollapse._pressedcolor = RemoteObject.createImmutable(0);__ref.setField("_pressedcolor",customlistviewcollapse._pressedcolor);
 //BA.debugLineNum = 28;BA.debugLine="Private xui As XUI";
customlistviewcollapse._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",customlistviewcollapse._xui);
 //BA.debugLineNum = 29;BA.debugLine="Private DesignerLabel As Label";
customlistviewcollapse._designerlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_designerlabel",customlistviewcollapse._designerlabel);
 //BA.debugLineNum = 30;BA.debugLine="Private horizontal As Boolean";
customlistviewcollapse._horizontal = RemoteObject.createImmutable(false);__ref.setField("_horizontal",customlistviewcollapse._horizontal);
 //BA.debugLineNum = 34;BA.debugLine="Private su As StringUtils";
customlistviewcollapse._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_su",customlistviewcollapse._su);
 //BA.debugLineNum = 38;BA.debugLine="Private mFirstVisibleIndex, mLastVisibleIndex As";
customlistviewcollapse._mfirstvisibleindex = RemoteObject.createImmutable(0);__ref.setField("_mfirstvisibleindex",customlistviewcollapse._mfirstvisibleindex);
customlistviewcollapse._mlastvisibleindex = RemoteObject.createImmutable(0);__ref.setField("_mlastvisibleindex",customlistviewcollapse._mlastvisibleindex);
 //BA.debugLineNum = 39;BA.debugLine="Private MonitorVisibleRange As Boolean";
customlistviewcollapse._monitorvisiblerange = RemoteObject.createImmutable(false);__ref.setField("_monitorvisiblerange",customlistviewcollapse._monitorvisiblerange);
 //BA.debugLineNum = 40;BA.debugLine="Private FireScrollChanged As Boolean";
customlistviewcollapse._firescrollchanged = RemoteObject.createImmutable(false);__ref.setField("_firescrollchanged",customlistviewcollapse._firescrollchanged);
 //BA.debugLineNum = 41;BA.debugLine="Private ScrollBarsVisible As Boolean";
customlistviewcollapse._scrollbarsvisible = RemoteObject.createImmutable(false);__ref.setField("_scrollbarsvisible",customlistviewcollapse._scrollbarsvisible);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "customlistviewcollapse","clear", __ref);}
 BA.debugLineNum = 131;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="items.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 133;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
Debug.ShouldStop(16);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 134;BA.debugLine="SetScrollViewContentSize(0)";
Debug.ShouldStop(32);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_setscrollviewcontentsize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 135;BA.debugLine="ResetVisibles";
Debug.ShouldStop(64);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_resetvisibles" /*RemoteObject*/ );
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,573);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "customlistviewcollapse","createlabel", __ref, _txt);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 573;BA.debugLine="Private Sub CreateLabel(txt As Object) As B4XView";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 574;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(536870912);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 575;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 576;BA.debugLine="lbl.Gravity = DesignerLabel.Gravity";
Debug.ShouldStop(-2147483648);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_designerlabel" /*RemoteObject*/ ).runMethod(true,"getGravity"));
 BA.debugLineNum = 577;BA.debugLine="lbl.TextSize = DesignerLabel.TextSize";
Debug.ShouldStop(1);
_lbl.runMethod(true,"setTextSize",__ref.getField(false,"_designerlabel" /*RemoteObject*/ ).runMethod(true,"getTextSize"));
 BA.debugLineNum = 578;BA.debugLine="lbl.SingleLine = False";
Debug.ShouldStop(2);
_lbl.runVoidMethod ("setSingleLine",customlistviewcollapse.__c.getField(true,"False"));
 BA.debugLineNum = 579;BA.debugLine="lbl.Text = txt";
Debug.ShouldStop(4);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_txt));
 BA.debugLineNum = 580;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
Debug.ShouldStop(8);
_lbl.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"),customlistviewcollapse.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1));
 BA.debugLineNum = 581;BA.debugLine="lbl.Height = su.MeasureMultilineTextHeight(lbl, t";
Debug.ShouldStop(16);
_lbl.runMethod(true,"setHeight",__ref.getField(false,"_su" /*RemoteObject*/ ).runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_txt))));
 BA.debugLineNum = 582;BA.debugLine="Return lbl";
Debug.ShouldStop(32);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 583;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanel(RemoteObject __ref,RemoteObject _paneleventname) throws Exception{
try {
		Debug.PushSubsStack("CreatePanel (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,532);
if (RapidSub.canDelegate("createpanel")) { return __ref.runUserSub(false, "customlistviewcollapse","createpanel", __ref, _paneleventname);}
Debug.locals.put("PanelEventName", _paneleventname);
 BA.debugLineNum = 532;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 533;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(_paneleventname));
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createscrollview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateScrollView (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("createscrollview")) { return __ref.runUserSub(false, "customlistviewcollapse","createscrollview", __ref);}
RemoteObject _hv = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
RemoteObject _nsv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
 BA.debugLineNum = 549;BA.debugLine="Private Sub CreateScrollView As B4XView";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="If horizontal Then";
Debug.ShouldStop(32);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 551;BA.debugLine="Dim hv As HorizontalScrollView";
Debug.ShouldStop(64);
_hv = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");Debug.locals.put("hv", _hv);
 BA.debugLineNum = 552;BA.debugLine="hv.Initialize(0, \"sv\")";
Debug.ShouldStop(128);
_hv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 553;BA.debugLine="Return hv";
Debug.ShouldStop(256);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _hv.getObject());
 }else {
 BA.debugLineNum = 555;BA.debugLine="Dim nsv As ScrollView";
Debug.ShouldStop(1024);
_nsv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 556;BA.debugLine="nsv.Initialize2(0, \"sv\")";
Debug.ShouldStop(2048);
_nsv.runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 557;BA.debugLine="Return nsv";
Debug.ShouldStop(4096);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _nsv.getObject());
 };
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("DesignerCreateView (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "customlistviewcollapse","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _o = RemoteObject.createImmutable("");
RemoteObject _jsv = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 66;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="mBase = Base";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 68;BA.debugLine="mParent = mBase.Parent";
Debug.ShouldStop(8);
__ref.setField ("_mparent" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent"));
 BA.debugLineNum = 69;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
Debug.ShouldStop(16);
_o = BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ListOrientation"))),(Object)((RemoteObject.createImmutable("Vertical")))));Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 70;BA.debugLine="horizontal = o = \"Horizontal\"";
Debug.ShouldStop(32);
__ref.setField ("_horizontal" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_o,BA.ObjectToString("Horizontal"))));
 BA.debugLineNum = 71;BA.debugLine="sv = CreateScrollView";
Debug.ShouldStop(64);
__ref.setField ("_sv" /*RemoteObject*/ ,__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_createscrollview" /*RemoteObject*/ ));
 BA.debugLineNum = 72;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
Debug.ShouldStop(128);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 73;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
Debug.ShouldStop(256);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DividerColor")))))));
 BA.debugLineNum = 74;BA.debugLine="mDividerSize = DipToCurrent(Props.Get(\"DividerHei";
Debug.ShouldStop(512);
__ref.setField ("_mdividersize" /*RemoteObject*/ ,BA.numberCast(float.class, customlistviewcollapse.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DividerHeight")))))))));
 BA.debugLineNum = 75;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
Debug.ShouldStop(1024);
__ref.setField ("_pressedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PressedColor")))))));
 BA.debugLineNum = 76;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
Debug.ShouldStop(2048);
__ref.setField ("_animationduration" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("InsertAnimationDuration"))),(Object)((__ref.getField(true,"_animationduration" /*RemoteObject*/ ))))));
 BA.debugLineNum = 77;BA.debugLine="ScrollBarsVisible = Props.GetDefault(\"ShowScrollB";
Debug.ShouldStop(4096);
__ref.setField ("_scrollbarsvisible" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ShowScrollBar"))),(Object)((customlistviewcollapse.__c.getField(true,"True"))))));
 BA.debugLineNum = 78;BA.debugLine="If ScrollBarsVisible = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_scrollbarsvisible" /*RemoteObject*/ ),customlistviewcollapse.__c.getField(true,"False"))) { 
 BA.debugLineNum = 84;BA.debugLine="Dim jsv As JavaObject = sv";
Debug.ShouldStop(524288);
_jsv = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jsv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject());Debug.locals.put("jsv", _jsv);
 BA.debugLineNum = 85;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1048576);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="jsv.RunMethod(\"setHorizontalScrollBarEnabled\",";
Debug.ShouldStop(2097152);
_jsv.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHorizontalScrollBarEnabled")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(customlistviewcollapse.__c.getField(true,"False"))})));
 }else {
 BA.debugLineNum = 88;BA.debugLine="jsv.RunMethod(\"setVerticalScrollBarEnabled\", Ar";
Debug.ShouldStop(8388608);
_jsv.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVerticalScrollBarEnabled")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(customlistviewcollapse.__c.getField(true,"False"))})));
 };
 };
 BA.debugLineNum = 96;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
Debug.ShouldStop(-2147483648);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_lbl.runMethod(true,"getTextColor")))));
 BA.debugLineNum = 97;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
Debug.ShouldStop(1);
__ref.setField ("_defaulttextbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 98;BA.debugLine="DesignerLabel = Lbl";
Debug.ShouldStop(2);
__ref.setField ("_designerlabel" /*RemoteObject*/ ,_lbl);
 BA.debugLineNum = 99;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.ShouldStop(4);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findindexfromoffset(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("FindIndexFromOffset (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,445);
if (RapidSub.canDelegate("findindexfromoffset")) { return __ref.runUserSub(false, "customlistviewcollapse","findindexfromoffset", __ref, _offset);}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _stepsize = RemoteObject.createImmutable(0);
RemoteObject _currentitem = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _nextoffset = RemoteObject.createImmutable(0);
RemoteObject _prevoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 445;BA.debugLine="Public Sub FindIndexFromOffset(Offset As Int) As I";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 447;BA.debugLine="Dim Position As Int = items.Size / 2";
Debug.ShouldStop(1073741824);
_position = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 448;BA.debugLine="Dim StepSize As Int = Ceil(Position / 2)";
Debug.ShouldStop(-2147483648);
_stepsize = BA.numberCast(int.class, customlistviewcollapse.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("StepSize", _stepsize);Debug.locals.put("StepSize", _stepsize);
 BA.debugLineNum = 449;BA.debugLine="Do While True";
Debug.ShouldStop(1);
while (customlistviewcollapse.__c.getField(true,"True").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 450;BA.debugLine="Dim CurrentItem As CLVItem = items.Get(Position)";
Debug.ShouldStop(2);
_currentitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_position)));Debug.locals.put("CurrentItem", _currentitem);Debug.locals.put("CurrentItem", _currentitem);
 BA.debugLineNum = 451;BA.debugLine="Dim NextOffset As Int";
Debug.ShouldStop(4);
_nextoffset = RemoteObject.createImmutable(0);Debug.locals.put("NextOffset", _nextoffset);
 BA.debugLineNum = 452;BA.debugLine="If Position < items.Size - 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_position,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 453;BA.debugLine="NextOffset = GetRawListItem(Position + 1).Offse";
Debug.ShouldStop(16);
_nextoffset = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1))).getField(true,"Offset"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("NextOffset", _nextoffset);
 }else {
 BA.debugLineNum = 455;BA.debugLine="NextOffset = 0x7FFFFFFF";
Debug.ShouldStop(64);
_nextoffset = BA.numberCast(int.class, 0x7fffffff);Debug.locals.put("NextOffset", _nextoffset);
 };
 BA.debugLineNum = 457;BA.debugLine="Dim PrevOffset As Int";
Debug.ShouldStop(256);
_prevoffset = RemoteObject.createImmutable(0);Debug.locals.put("PrevOffset", _prevoffset);
 BA.debugLineNum = 458;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 459;BA.debugLine="PrevOffset = 0x80000000";
Debug.ShouldStop(1024);
_prevoffset = BA.numberCast(int.class, 0x80000000);Debug.locals.put("PrevOffset", _prevoffset);
 }else {
 BA.debugLineNum = 461;BA.debugLine="PrevOffset = CurrentItem.Offset";
Debug.ShouldStop(4096);
_prevoffset = _currentitem.getField(true,"Offset");Debug.locals.put("PrevOffset", _prevoffset);
 };
 BA.debugLineNum = 463;BA.debugLine="If Offset > NextOffset Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_offset,BA.numberCast(double.class, _nextoffset))) { 
 BA.debugLineNum = 464;BA.debugLine="Position = Min(Position + StepSize, items.Size";
Debug.ShouldStop(32768);
_position = BA.numberCast(int.class, customlistviewcollapse.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_position,_stepsize}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))));Debug.locals.put("Position", _position);
 }else 
{ BA.debugLineNum = 465;BA.debugLine="Else if Offset < PrevOffset Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",_offset,BA.numberCast(double.class, _prevoffset))) { 
 BA.debugLineNum = 466;BA.debugLine="Position = Max(Position - StepSize, 0)";
Debug.ShouldStop(131072);
_position = BA.numberCast(int.class, customlistviewcollapse.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_position,_stepsize}, "-",1, 1))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Position", _position);
 }else {
 BA.debugLineNum = 468;BA.debugLine="Return Position";
Debug.ShouldStop(524288);
if (true) return _position;
 }}
;
 BA.debugLineNum = 470;BA.debugLine="StepSize = Ceil(StepSize / 2)";
Debug.ShouldStop(2097152);
_stepsize = BA.numberCast(int.class, customlistviewcollapse.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_stepsize,RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("StepSize", _stepsize);
 }
;
 BA.debugLineNum = 472;BA.debugLine="Return -1";
Debug.ShouldStop(8388608);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finditemoffset(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("FindItemOffset (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("finditemoffset")) { return __ref.runUserSub(false, "customlistviewcollapse","finditemoffset", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 440;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="Return GetRawListItem(Index).Offset";
Debug.ShouldStop(16777216);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(_index)).getField(true,"Offset");
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "customlistviewcollapse","getbase", __ref);}
 BA.debugLineNum = 138;BA.debugLine="Public Sub GetBase As B4XView";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Return mBase";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdividersize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDividerSize (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,536);
if (RapidSub.canDelegate("getdividersize")) { return __ref.runUserSub(false, "customlistviewcollapse","getdividersize", __ref);}
 BA.debugLineNum = 536;BA.debugLine="Public Sub getDividerSize As Float";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 537;BA.debugLine="Return mDividerSize";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(true,"_mdividersize" /*RemoteObject*/ );
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirstvisibleindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFirstVisibleIndex (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,476);
if (RapidSub.canDelegate("getfirstvisibleindex")) { return __ref.runUserSub(false, "customlistviewcollapse","getfirstvisibleindex", __ref);}
 BA.debugLineNum = 476;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 477;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
Debug.ShouldStop(268435456);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_findindexfromoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewoffset" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitemfromview(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromView (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,505);
if (RapidSub.canDelegate("getitemfromview")) { return __ref.runUserSub(false, "customlistviewcollapse","getitemfromview", __ref, _v);}
RemoteObject _parent = RemoteObject.declareNull("Object");
RemoteObject _current = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("v", _v);
 BA.debugLineNum = 505;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 506;BA.debugLine="Dim parent = v As Object, current As B4XView";
Debug.ShouldStop(33554432);
_parent = (_v.getObject());Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
_current = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("current", _current);
 BA.debugLineNum = 507;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
Debug.ShouldStop(67108864);
while (RemoteObject.solveBoolean("!",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel"),_parent)) {
 BA.debugLineNum = 508;BA.debugLine="current = parent";
Debug.ShouldStop(134217728);
_current = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _parent);
 BA.debugLineNum = 509;BA.debugLine="parent = current.Parent";
Debug.ShouldStop(268435456);
_parent = (_current.runMethod(false,"getParent").getObject());Debug.locals.put("parent", _parent);
 }
;
 BA.debugLineNum = 511;BA.debugLine="v = current";
Debug.ShouldStop(1073741824);
_v = _current;Debug.locals.put("v", _v);
 BA.debugLineNum = 512;BA.debugLine="Return v.Tag";
Debug.ShouldStop(-2147483648);
if (true) return BA.numberCast(int.class, _v.runMethod(false,"getTag"));
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastvisibleindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLastVisibleIndex (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("getlastvisibleindex")) { return __ref.runUserSub(false, "customlistviewcollapse","getlastvisibleindex", __ref);}
 BA.debugLineNum = 481;BA.debugLine="Public Sub getLastVisibleIndex As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 482;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
Debug.ShouldStop(2);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_findindexfromoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewoffset" /*RemoteObject*/ ),__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaxscrolloffset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetMaxScrollOffset (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,412);
if (RapidSub.canDelegate("getmaxscrolloffset")) { return __ref.runUserSub(false, "customlistviewcollapse","getmaxscrolloffset", __ref);}
 BA.debugLineNum = 412;BA.debugLine="Private Sub GetMaxScrollOffset As Float";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 413;BA.debugLine="Return GetScrollViewContentSize - GetScrollViewVi";
Debug.ShouldStop(268435456);
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "-",1, 0));
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "customlistviewcollapse","getpanel", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 165;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Return GetRawListItem(Index).Panel.GetView(0)";
Debug.ShouldStop(32);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(_index)).getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getParent (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,540);
if (RapidSub.canDelegate("getparent")) { return __ref.runUserSub(false, "customlistviewcollapse","getparent", __ref);}
 BA.debugLineNum = 540;BA.debugLine="Public Sub getParent As B4XView";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 541;BA.debugLine="Return mParent";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_mparent" /*RemoteObject*/ );
 BA.debugLineNum = 542;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrawlistitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetRawListItem (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("getrawlistitem")) { return __ref.runUserSub(false, "customlistviewcollapse","getrawlistitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 148;BA.debugLine="Public Sub GetRawListItem(Index As Int) As CLVItem";
Debug.ShouldStop(524288);
 BA.debugLineNum = 151;BA.debugLine="If Index = items.Size Then Index = Index - 1";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("Index", _index);};
 BA.debugLineNum = 153;BA.debugLine="Log($\"Index:${Index} Size ${items.size}\"$)";
Debug.ShouldStop(16777216);
customlistviewcollapse.__c.runVoidMethod ("LogImpl","6133169157",(RemoteObject.concat(RemoteObject.createImmutable("Index:"),customlistviewcollapse.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_index))),RemoteObject.createImmutable(" Size "),customlistviewcollapse.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 155;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 156;BA.debugLine="Return items.Get(Index)";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 158;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(536870912);
customlistviewcollapse.__c.runVoidMethod ("LogImpl","6133169162",customlistviewcollapse.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 159;BA.debugLine="Return Null";
Debug.ShouldStop(1073741824);
if (true) return (customlistviewcollapse.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewcontentsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewContentSize (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("getscrollviewcontentsize")) { return __ref.runUserSub(false, "customlistviewcollapse","getscrollviewcontentsize", __ref);}
 BA.debugLineNum = 358;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
Debug.ShouldStop(32);
 BA.debugLineNum = 359;BA.debugLine="If horizontal Then";
Debug.ShouldStop(64);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 360;BA.debugLine="Return sv.ScrollViewContentWidth";
Debug.ShouldStop(128);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"));
 }else {
 BA.debugLineNum = 362;BA.debugLine="Return sv.ScrollViewContentHeight";
Debug.ShouldStop(512);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight"));
 };
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewoffset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewOffset (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("getscrollviewoffset")) { return __ref.runUserSub(false, "customlistviewcollapse","getscrollviewoffset", __ref);}
 BA.debugLineNum = 342;BA.debugLine="Private Sub GetScrollViewOffset As Float";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4194304);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 344;BA.debugLine="Return sv.ScrollViewOffsetX";
Debug.ShouldStop(8388608);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetX"));
 }else {
 BA.debugLineNum = 346;BA.debugLine="Return sv.ScrollViewOffsetY";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));
 };
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewvisiblesize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewVisibleSize (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("getscrollviewvisiblesize")) { return __ref.runUserSub(false, "customlistviewcollapse","getscrollviewvisiblesize", __ref);}
 BA.debugLineNum = 334;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16384);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 336;BA.debugLine="Return sv.Width";
Debug.ShouldStop(32768);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 }else {
 BA.debugLineNum = 338;BA.debugLine="Return sv.Height";
Debug.ShouldStop(131072);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "customlistviewcollapse","getsize", __ref);}
 BA.debugLineNum = 143;BA.debugLine="Public Sub getSize As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Return items.Size";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetValue (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "customlistviewcollapse","getvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 170;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Return GetRawListItem(Index).Value";
Debug.ShouldStop(1024);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(_index)).getField(false,"Value");
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "customlistviewcollapse","initialize", __ref, _ba, _vcallback, _veventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallBack", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(4096);
__ref.setField ("_eventname" /*RemoteObject*/ ,_veventname);
 BA.debugLineNum = 46;BA.debugLine="CallBack = vCallBack";
Debug.ShouldStop(8192);
__ref.setField ("_callback" /*RemoteObject*/ ,_vcallback);
 BA.debugLineNum = 47;BA.debugLine="items.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
Debug.ShouldStop(32768);
__ref.setField ("_defaulttextbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 49;BA.debugLine="DefaultTextColor = xui.Color_Black";
Debug.ShouldStop(65536);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 50;BA.debugLine="MonitorVisibleRange = xui.SubExists(CallBack, Eve";
Debug.ShouldStop(131072);
__ref.setField ("_monitorvisiblerange" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VisibleRangeChanged"))),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 51;BA.debugLine="FireScrollChanged = xui.SubExists(CallBack, Event";
Debug.ShouldStop(262144);
__ref.setField ("_firescrollchanged" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ScrollChanged"))),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 52;BA.debugLine="ResetVisibles";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_resetvisibles" /*RemoteObject*/ );
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
public static RemoteObject  _insertat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAt (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("insertat")) { return __ref.runUserSub(false, "customlistviewcollapse","insertat", __ref, _index, _pnl, _value);}
RemoteObject _size = RemoteObject.createImmutable(0f);
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 221;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="Dim size As Float";
Debug.ShouldStop(536870912);
_size = RemoteObject.createImmutable(0f);Debug.locals.put("size", _size);
 BA.debugLineNum = 223;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 224;BA.debugLine="size = pnl.Width";
Debug.ShouldStop(-2147483648);
_size = BA.numberCast(float.class, _pnl.runMethod(true,"getWidth"));Debug.locals.put("size", _size);
 }else {
 BA.debugLineNum = 226;BA.debugLine="size = pnl.Height";
Debug.ShouldStop(2);
_size = BA.numberCast(float.class, _pnl.runMethod(true,"getHeight"));Debug.locals.put("size", _size);
 };
 BA.debugLineNum = 228;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
Debug.ShouldStop(8);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_insertatimpl" /*void*/ ,(Object)(_index),(Object)(_pnl),(Object)(BA.numberCast(int.class, _size)),(Object)(_value),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _insertatimpl(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemsize,RemoteObject _value,RemoteObject _initialsize) throws Exception{
try {
		Debug.PushSubsStack("InsertAtImpl (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("insertatimpl")) { __ref.runUserSub(false, "customlistviewcollapse","insertatimpl", __ref, _index, _pnl, _itemsize, _value, _initialsize); return;}
ResumableSub_InsertAtImpl rsub = new ResumableSub_InsertAtImpl(null,__ref,_index,_pnl,_itemsize,_value,_initialsize);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InsertAtImpl extends BA.ResumableSub {
public ResumableSub_InsertAtImpl(xevolution.vrcg.devdemov2400.customlistviewcollapse parent,RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemsize,RemoteObject _value,RemoteObject _initialsize) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._pnl = _pnl;
this._itemsize = _itemsize;
this._value = _value;
this._initialsize = _initialsize;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.customlistviewcollapse parent;
RemoteObject _index;
RemoteObject _pnl;
RemoteObject _itemsize;
RemoteObject _value;
RemoteObject _initialsize;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _includedividierheight = RemoteObject.createImmutable(0);
RemoteObject _newitem = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _previtem = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
int _i = 0;
RemoteObject _it = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _newoffset = RemoteObject.createImmutable(0);
RemoteObject _shouldsetpanelheight = RemoteObject.createImmutable(false);
int step39;
int limit39;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertAtImpl (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,232);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Index", _index);
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemSize", _itemsize);
Debug.locals.put("Value", _value);
Debug.locals.put("InitialSize", _initialsize);
 BA.debugLineNum = 234;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_createpanel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Panel")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 235;BA.debugLine="p.Color = Pnl.Color";
Debug.ShouldStop(1024);
_p.runMethod(true,"setColor",_pnl.runMethod(true,"getColor"));
 BA.debugLineNum = 236;BA.debugLine="Pnl.Color = xui.Color_Transparent";
Debug.ShouldStop(2048);
_pnl.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 237;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 238;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
Debug.ShouldStop(8192);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 240;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
Debug.ShouldStop(32768);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth")),(Object)(_itemsize));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 242;BA.debugLine="p.Tag = Index";
Debug.ShouldStop(131072);
_p.runMethod(false,"setTag",(_index));
 BA.debugLineNum = 243;BA.debugLine="Dim IncludeDividierHeight As Int";
Debug.ShouldStop(262144);
_includedividierheight = RemoteObject.createImmutable(0);Debug.locals.put("IncludeDividierHeight", _includedividierheight);
 BA.debugLineNum = 244;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = m";
Debug.ShouldStop(524288);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_initialsize,BA.numberCast(double.class, 0))) { 
this.state = 9;
;}
else {
this.state = 11;
;}if (true) break;

case 9:
//C
this.state = 14;
_includedividierheight = BA.numberCast(int.class, __ref.getField(true,"_mdividersize" /*RemoteObject*/ ));Debug.locals.put("IncludeDividierHeight", _includedividierheight);
if (true) break;

case 11:
//C
this.state = 14;
_includedividierheight = BA.numberCast(int.class, 0);Debug.locals.put("IncludeDividierHeight", _includedividierheight);
if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 245;BA.debugLine="Dim NewItem As CLVItem";
Debug.ShouldStop(1048576);
_newitem = RemoteObject.createNew ("b4a.example3.customlistview._clvitem");Debug.locals.put("NewItem", _newitem);
 BA.debugLineNum = 246;BA.debugLine="NewItem.Panel = p";
Debug.ShouldStop(2097152);
_newitem.setField ("Panel",_p);
 BA.debugLineNum = 247;BA.debugLine="NewItem.Size = ItemSize";
Debug.ShouldStop(4194304);
_newitem.setField ("Size",_itemsize);
 BA.debugLineNum = 248;BA.debugLine="NewItem.Value = Value";
Debug.ShouldStop(8388608);
_newitem.setField ("Value",_value);
 BA.debugLineNum = 249;BA.debugLine="NewItem.Color = p.Color";
Debug.ShouldStop(16777216);
_newitem.setField ("Color",_p.runMethod(true,"getColor"));
 BA.debugLineNum = 250;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 15:
//if
this.state = 65;
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"))) && RemoteObject.solveBoolean("=",_initialsize,BA.numberCast(double.class, 0))) { 
this.state = 17;
}else {
this.state = 31;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 251;BA.debugLine="items.Add(NewItem)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_newitem)));
 BA.debugLineNum = 252;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(134217728);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 253;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 254;BA.debugLine="offset = mDividerSize";
Debug.ShouldStop(536870912);
_offset = BA.numberCast(int.class, __ref.getField(true,"_mdividersize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 256;BA.debugLine="offset = GetScrollViewContentSize";
Debug.ShouldStop(-2147483648);
_offset = BA.numberCast(int.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewcontentsize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 258;BA.debugLine="NewItem.Offset = offset";
Debug.ShouldStop(2);
_newitem.setField ("Offset",_offset);
 BA.debugLineNum = 259;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4);
if (true) break;

case 24:
//if
this.state = 29;
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 260;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
Debug.ShouldStop(8);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 262;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
Debug.ShouldStop(32);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_offset),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_itemsize));
 if (true) break;

case 29:
//C
this.state = 65;
;
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 265;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(256);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 266;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(512);
if (true) break;

case 32:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
 BA.debugLineNum = 267;BA.debugLine="offset = mDividerSize";
Debug.ShouldStop(1024);
_offset = BA.numberCast(int.class, __ref.getField(true,"_mdividersize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 269;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
Debug.ShouldStop(4096);
_previtem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("PrevItem", _previtem);Debug.locals.put("PrevItem", _previtem);
 BA.debugLineNum = 270;BA.debugLine="offset = PrevItem.Offset + PrevItem.Size + mDiv";
Debug.ShouldStop(8192);
_offset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_previtem.getField(true,"Offset"),_previtem.getField(true,"Size"),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "++",2, 0));Debug.locals.put("offset", _offset);
 if (true) break;
;
 BA.debugLineNum = 272;BA.debugLine="For i = Index To items.Size - 1";
Debug.ShouldStop(32768);

case 37:
//for
this.state = 52;
step39 = 1;
limit39 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _index.<Integer>get().intValue() ;
Debug.locals.put("i", _i);
this.state = 83;
if (true) break;

case 83:
//C
this.state = 52;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 39;
if (true) break;

case 84:
//C
this.state = 83;
_i = ((int)(0 + _i + step39)) ;
Debug.locals.put("i", _i);
if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 273;BA.debugLine="Dim It As CLVItem = items.Get(i)";
Debug.ShouldStop(65536);
_it = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("It", _it);Debug.locals.put("It", _it);
 BA.debugLineNum = 274;BA.debugLine="Dim NewOffset As Int = It.Offset + ItemSize - I";
Debug.ShouldStop(131072);
_newoffset = RemoteObject.solve(new RemoteObject[] {_it.getField(true,"Offset"),_itemsize,_initialsize,_includedividierheight}, "+-+",3, 1);Debug.locals.put("NewOffset", _newoffset);Debug.locals.put("NewOffset", _newoffset);
 BA.debugLineNum = 275;BA.debugLine="If Min(NewOffset, It.Offset) - GetScrollViewOff";
Debug.ShouldStop(262144);
if (true) break;

case 40:
//if
this.state = 51;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _newoffset)),(Object)(BA.numberCast(double.class, _it.getField(true,"Offset")))),__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewoffset" /*RemoteObject*/ )}, "-",1, 0),BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )))) { 
this.state = 42;
}else {
this.state = 50;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 276;BA.debugLine="It.Offset = NewOffset";
Debug.ShouldStop(524288);
_it.setField ("Offset",_newoffset);
 BA.debugLineNum = 277;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1048576);
if (true) break;

case 43:
//if
this.state = 48;
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 48;
 BA.debugLineNum = 278;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
Debug.ShouldStop(2097152);
_it.getField(false,"Panel").runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(_newoffset),(Object)(BA.numberCast(int.class, 0)),(Object)(_it.getField(true,"Size")),(Object)(_it.getField(false,"Panel").runMethod(true,"getHeight")));
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 280;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
Debug.ShouldStop(8388608);
_it.getField(false,"Panel").runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(_newoffset),(Object)(_it.getField(false,"Panel").runMethod(true,"getWidth")),(Object)(_it.getField(true,"Size")));
 if (true) break;

case 48:
//C
this.state = 51;
;
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 283;BA.debugLine="SetItemOffset(It, NewOffset)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_setitemoffset" /*RemoteObject*/ ,(Object)(_it),(Object)(BA.numberCast(float.class, _newoffset)));
 if (true) break;

case 51:
//C
this.state = 84;
;
 BA.debugLineNum = 285;BA.debugLine="It.Panel.Tag = i + 1";
Debug.ShouldStop(268435456);
_it.getField(false,"Panel").runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 287;BA.debugLine="items.InsertAt(Index, NewItem)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_index),(Object)((_newitem)));
 BA.debugLineNum = 288;BA.debugLine="NewItem.Offset = offset";
Debug.ShouldStop(-2147483648);
_newitem.setField ("Offset",_offset);
 BA.debugLineNum = 289;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1);
if (true) break;

case 53:
//if
this.state = 64;
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 64;
 BA.debugLineNum = 290;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
Debug.ShouldStop(2);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_initialsize),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 291;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
Debug.ShouldStop(4);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(_p.runMethod(true,"getHeight")));
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 293;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
Debug.ShouldStop(16);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_offset),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_initialsize));
 BA.debugLineNum = 295;BA.debugLine="Dim ShouldSetPanelHeight As Boolean = InitialSi";
Debug.ShouldStop(64);
_shouldsetpanelheight = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_initialsize,BA.numberCast(double.class, _itemsize)));Debug.locals.put("ShouldSetPanelHeight", _shouldsetpanelheight);Debug.locals.put("ShouldSetPanelHeight", _shouldsetpanelheight);
 BA.debugLineNum = 296;BA.debugLine="If ShouldSetPanelHeight = True Then 'collapse";
Debug.ShouldStop(128);
if (true) break;

case 58:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",_shouldsetpanelheight,parent.__c.getField(true,"True"))) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
 BA.debugLineNum = 297;BA.debugLine="Pnl.Height = InitialSize";
Debug.ShouldStop(256);
_pnl.runMethod(true,"setHeight",_initialsize);
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 299;BA.debugLine="p.SetLayoutAnimated(0, 0, offset, p.Width, Ite";
Debug.ShouldStop(1024);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_offset),(Object)(_p.runMethod(true,"getWidth")),(Object)(_itemsize));
 if (true) break;

case 63:
//C
this.state = 64;
;
 BA.debugLineNum = 301;BA.debugLine="p.SendToBack";
Debug.ShouldStop(4096);
_p.runVoidMethod ("SendToBack");
 if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 306;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
Debug.ShouldStop(131072);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_setscrollviewcontentsize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),_itemsize,_initialsize,_includedividierheight}, "+-+",3, 0))));
 BA.debugLineNum = 307;BA.debugLine="If items.Size = 1 Then SetScrollViewContentSize(G";
Debug.ShouldStop(262144);
if (true) break;

case 66:
//if
this.state = 71;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
this.state = 68;
;}if (true) break;

case 68:
//C
this.state = 71;
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_setscrollviewcontentsize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),_includedividierheight}, "+",1, 0))));
if (true) break;

case 71:
//C
this.state = 72;
;
 BA.debugLineNum = 308;BA.debugLine="If Index < mLastVisibleIndex Or GetRawListItem(mL";
Debug.ShouldStop(524288);
if (true) break;

case 72:
//if
this.state = 75;
if (RemoteObject.solveBoolean("<",_index,BA.numberCast(double.class, __ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))).getField(true,"Offset"),__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))).getField(true,"Size"),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "++",2, 0),BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )))) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 310;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(2097152);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_updatevisiblerange" /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 313;BA.debugLine="If ShouldSetPanelHeight Then";
Debug.ShouldStop(16777216);

case 75:
//if
this.state = 82;
if (_shouldsetpanelheight.<Boolean>get().booleanValue()) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 314;BA.debugLine="Sleep(AnimationDuration)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "customlistviewcollapse", "insertatimpl"),__ref.getField(true,"_animationduration" /*RemoteObject*/ ));
this.state = 85;
return;
case 85:
//C
this.state = 78;
;
 BA.debugLineNum = 315;BA.debugLine="If p.Parent.IsInitialized Then";
Debug.ShouldStop(67108864);
if (true) break;

case 78:
//if
this.state = 81;
if (_p.runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 317;BA.debugLine="p.Height = ItemSize";
Debug.ShouldStop(268435456);
_p.runMethod(true,"setHeight",_itemsize);
 BA.debugLineNum = 318;BA.debugLine="Pnl.Height = ItemSize";
Debug.ShouldStop(536870912);
_pnl.runMethod(true,"setHeight",_itemsize);
 if (true) break;

case 81:
//C
this.state = 82;
;
 if (true) break;

case 82:
//C
this.state = -1;
;
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _insertattextitem(RemoteObject __ref,RemoteObject _index,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAtTextItem (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("insertattextitem")) { return __ref.runUserSub(false, "customlistviewcollapse","insertattextitem", __ref, _index, _text, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 201;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="If horizontal Then";
Debug.ShouldStop(512);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 203;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
Debug.ShouldStop(1024);
customlistviewcollapse.__c.runVoidMethod ("LogImpl","6133496834",RemoteObject.createImmutable("AddTextItem is only supported in vertical orientation."),0);
 BA.debugLineNum = 204;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 206;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
Debug.ShouldStop(8192);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_createpanel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 207;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
Debug.ShouldStop(16384);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_createlabel" /*RemoteObject*/ ,(Object)(_text));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 208;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
Debug.ShouldStop(32768);
_lbl.runMethod(true,"setHeight",BA.numberCast(int.class, customlistviewcollapse.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, customlistviewcollapse.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _lbl.runMethod(true,"getHeight"))))));
 BA.debugLineNum = 209;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
Debug.ShouldStop(65536);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(customlistviewcollapse.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(customlistviewcollapse.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"),customlistviewcollapse.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(Object)(_lbl.runMethod(true,"getHeight")));
 BA.debugLineNum = 210;BA.debugLine="If xui.IsB4i = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"),customlistviewcollapse.__c.getField(true,"False"))) { 
 BA.debugLineNum = 211;BA.debugLine="lbl.TextColor = DefaultTextColor";
Debug.ShouldStop(262144);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_defaulttextcolor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 213;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
Debug.ShouldStop(1048576);
_pnl.runMethod(true,"setColor",__ref.getField(true,"_defaulttextbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 214;BA.debugLine="pnl.Height = lbl.Height + 2dip";
Debug.ShouldStop(2097152);
_pnl.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"getHeight"),customlistviewcollapse.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1));
 BA.debugLineNum = 215;BA.debugLine="InsertAt(Index, pnl, Value)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_insertat" /*RemoteObject*/ ,(Object)(_index),(Object)(_pnl),(Object)(_value));
 BA.debugLineNum = 216;BA.debugLine="Dim item As CLVItem = GetRawListItem(Index)";
Debug.ShouldStop(8388608);
_item = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 217;BA.debugLine="item.TextItem = True";
Debug.ShouldStop(16777216);
_item.setField ("TextItem",customlistviewcollapse.__c.getField(true,"True"));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("JumpToItem (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("jumptoitem")) { return __ref.runUserSub(false, "customlistviewcollapse","jumptoitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 408;BA.debugLine="Public Sub JumpToItem(Index As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 409;BA.debugLine="SetScrollViewOffset(Min(GetMaxScrollOffset, FindI";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_setscrollviewoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, customlistviewcollapse.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getmaxscrolloffset" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_finditemoffset" /*RemoteObject*/ ,(Object)(_index))))))));
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
public static RemoteObject  _panel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel_Click (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("panel_click")) { return __ref.runUserSub(false, "customlistviewcollapse","panel_click", __ref);}
 BA.debugLineNum = 561;BA.debugLine="Private Sub Panel_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 562;BA.debugLine="PanelClickHandler(Sender)";
Debug.ShouldStop(131072);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_panelclickhandler" /*void*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), customlistviewcollapse.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));
 BA.debugLineNum = 563;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel_LongClick (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,565);
if (RapidSub.canDelegate("panel_longclick")) { return __ref.runUserSub(false, "customlistviewcollapse","panel_longclick", __ref);}
 BA.debugLineNum = 565;BA.debugLine="Private Sub Panel_LongClick";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 566;BA.debugLine="PanelLongClickHandler(Sender)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_panellongclickhandler" /*void*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), customlistviewcollapse.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _panelclickhandler(RemoteObject __ref,RemoteObject _senderpanel) throws Exception{
try {
		Debug.PushSubsStack("PanelClickHandler (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,485);
if (RapidSub.canDelegate("panelclickhandler")) { __ref.runUserSub(false, "customlistviewcollapse","panelclickhandler", __ref, _senderpanel); return;}
ResumableSub_PanelClickHandler rsub = new ResumableSub_PanelClickHandler(null,__ref,_senderpanel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PanelClickHandler extends BA.ResumableSub {
public ResumableSub_PanelClickHandler(xevolution.vrcg.devdemov2400.customlistviewcollapse parent,RemoteObject __ref,RemoteObject _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.customlistviewcollapse parent;
RemoteObject _senderpanel;
RemoteObject _clr = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PanelClickHandler (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,485);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("SenderPanel", _senderpanel);
 BA.debugLineNum = 486;BA.debugLine="Dim clr As Int = GetRawListItem(SenderPanel.Tag).";
Debug.ShouldStop(32);
_clr = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"getTag")))).getField(true,"Color");Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 487;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedColo";
Debug.ShouldStop(64);
_senderpanel.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 50)),(Object)(_clr),(Object)(__ref.getField(true,"_pressedcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 488;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 489;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
Debug.ShouldStop(256);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(_senderpanel.runMethod(false,"getTag")),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"getTag")))).getField(false,"Value")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 491;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "customlistviewcollapse", "panelclickhandler"),BA.numberCast(int.class, 200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 492;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor, c";
Debug.ShouldStop(2048);
_senderpanel.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(true,"_pressedcolor" /*RemoteObject*/ )),(Object)(_clr));
 BA.debugLineNum = 493;BA.debugLine="Log(\"pressed\")";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","6134807560",RemoteObject.createImmutable("pressed"),0);
 BA.debugLineNum = 494;BA.debugLine="End Sub";
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
public static void  _panellongclickhandler(RemoteObject __ref,RemoteObject _senderpanel) throws Exception{
try {
		Debug.PushSubsStack("PanelLongClickHandler (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,496);
if (RapidSub.canDelegate("panellongclickhandler")) { __ref.runUserSub(false, "customlistviewcollapse","panellongclickhandler", __ref, _senderpanel); return;}
ResumableSub_PanelLongClickHandler rsub = new ResumableSub_PanelLongClickHandler(null,__ref,_senderpanel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PanelLongClickHandler extends BA.ResumableSub {
public ResumableSub_PanelLongClickHandler(xevolution.vrcg.devdemov2400.customlistviewcollapse parent,RemoteObject __ref,RemoteObject _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.customlistviewcollapse parent;
RemoteObject _senderpanel;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PanelLongClickHandler (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,496);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("SenderPanel", _senderpanel);
 BA.debugLineNum = 497;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemLong";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemLongClick"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 498;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemLongClick\",";
Debug.ShouldStop(131072);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemLongClick"))),(Object)(_senderpanel.runMethod(false,"getTag")),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"getTag")))).getField(false,"Value")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 500;BA.debugLine="Sleep(100)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "customlistviewcollapse", "panellongclickhandler"),BA.numberCast(int.class, 100));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 501;BA.debugLine="Log(\"Long pressed\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","6134873093",RemoteObject.createImmutable("Long pressed"),0);
 BA.debugLineNum = 502;BA.debugLine="End Sub";
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
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "customlistviewcollapse","refresh", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Public Sub Refresh";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="ResetVisibles";
Debug.ShouldStop(536870912);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_resetvisibles" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_updatevisiblerange" /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveAt (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("removeat")) { return __ref.runUserSub(false, "customlistviewcollapse","removeat", __ref, _index);}
RemoteObject _removeitem = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _newoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 175;BA.debugLine="Public Sub RemoveAt(Index As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="If getSize <= 1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("k",__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 177;BA.debugLine="Clear";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 178;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 180;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
Debug.ShouldStop(524288);
_removeitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 181;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 182;BA.debugLine="For i = Index + 1 To items.Size - 1";
Debug.ShouldStop(2097152);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 183;BA.debugLine="Dim item As CLVItem = items.Get(i)";
Debug.ShouldStop(4194304);
_item = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 184;BA.debugLine="p = item.Panel";
Debug.ShouldStop(8388608);
_p = _item.getField(false,"Panel");Debug.locals.put("p", _p);
 BA.debugLineNum = 185;BA.debugLine="p.Tag = i - 1";
Debug.ShouldStop(16777216);
_p.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 186;BA.debugLine="Dim NewOffset As Int = item.Offset - RemoveItem.";
Debug.ShouldStop(33554432);
_newoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_item.getField(true,"Offset"),_removeitem.getField(true,"Size"),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "--",2, 0));Debug.locals.put("NewOffset", _newoffset);Debug.locals.put("NewOffset", _newoffset);
 BA.debugLineNum = 187;BA.debugLine="SetItemOffset(item, NewOffset)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_setitemoffset" /*RemoteObject*/ ,(Object)(_item),(Object)(BA.numberCast(float.class, _newoffset)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 189;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_setscrollviewcontentsize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),_removeitem.getField(true,"Size"),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "--",2, 0))));
 BA.debugLineNum = 190;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 191;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(1073741824);
_removeitem.getField(false,"Panel").runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replaceat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ReplaceAt (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("replaceat")) { return __ref.runUserSub(false, "customlistviewcollapse","replaceat", __ref, _index, _pnl, _itemheight, _value);}
RemoteObject _removeitem = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 394;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
Debug.ShouldStop(512);
 BA.debugLineNum = 395;BA.debugLine="If Index = items.Size Then Index = Index -1";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("Index", _index);};
 BA.debugLineNum = 396;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
Debug.ShouldStop(2048);
_removeitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 397;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(4096);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 398;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(8192);
_removeitem.getField(false,"Panel").runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 399;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
Debug.ShouldStop(16384);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_insertatimpl" /*void*/ ,(Object)(_index),(Object)(_pnl),(Object)(_itemheight),(Object)(_value),(Object)(_removeitem.getField(true,"Size")));
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
public static RemoteObject  _resetvisibles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetVisibles (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("resetvisibles")) { return __ref.runUserSub(false, "customlistviewcollapse","resetvisibles", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Private Sub ResetVisibles";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="mFirstVisibleIndex = -1";
Debug.ShouldStop(8388608);
__ref.setField ("_mfirstvisibleindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 57;BA.debugLine="mLastVisibleIndex = 0x7FFFFFFF";
Debug.ShouldStop(16777216);
__ref.setField ("_mlastvisibleindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0x7fffffff));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizeitem(RemoteObject __ref,RemoteObject _index,RemoteObject _itemheight) throws Exception{
try {
		Debug.PushSubsStack("ResizeItem (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,384);
if (RapidSub.canDelegate("resizeitem")) { return __ref.runUserSub(false, "customlistviewcollapse","resizeitem", __ref, _index, _itemheight);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("ItemHeight", _itemheight);
 BA.debugLineNum = 384;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 385;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 386;BA.debugLine="Dim value As Object = GetValue(Index)";
Debug.ShouldStop(2);
_value = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 387;BA.debugLine="Dim parent As B4XView = p.Parent";
Debug.ShouldStop(4);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_parent = _p.runMethod(false,"getParent");Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 388;BA.debugLine="p.Color = parent.Color";
Debug.ShouldStop(8);
_p.runMethod(true,"setColor",_parent.runMethod(true,"getColor"));
 BA.debugLineNum = 389;BA.debugLine="p.RemoveViewFromParent";
Debug.ShouldStop(16);
_p.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 390;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
Debug.ShouldStop(32);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_replaceat" /*RemoteObject*/ ,(Object)(_index),(Object)(_p),(Object)(_itemheight),(Object)(_value));
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
public static RemoteObject  _scrollhandler(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScrollHandler (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,515);
if (RapidSub.canDelegate("scrollhandler")) { return __ref.runUserSub(false, "customlistviewcollapse","scrollhandler", __ref);}
RemoteObject _position = RemoteObject.createImmutable(0);
 BA.debugLineNum = 515;BA.debugLine="Private Sub ScrollHandler";
Debug.ShouldStop(4);
 BA.debugLineNum = 516;BA.debugLine="If items.Size = 0 Then Return";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 517;BA.debugLine="Dim position As Int = GetScrollViewOffset";
Debug.ShouldStop(16);
_position = BA.numberCast(int.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewoffset" /*RemoteObject*/ ));Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 BA.debugLineNum = 518;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_position,__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),customlistviewcollapse.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0)) && RemoteObject.solveBoolean(">",customlistviewcollapse.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastreachendevent" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "+",1, 2))) { 
 BA.debugLineNum = 519;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
Debug.ShouldStop(64);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachEnd"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 520;BA.debugLine="LastReachEndEvent = DateTime.Now";
Debug.ShouldStop(128);
__ref.setField ("_lastreachendevent" /*RemoteObject*/ ,customlistviewcollapse.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 521;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
Debug.ShouldStop(256);
customlistviewcollapse.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachEnd"))));
 }else {
 BA.debugLineNum = 523;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
Debug.ShouldStop(1024);
__ref.setField ("_lastreachendevent" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {customlistviewcollapse.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000),customlistviewcollapse.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+*",1, 2));
 };
 };
 BA.debugLineNum = 526;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(8192);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_updatevisiblerange" /*RemoteObject*/ );
 BA.debugLineNum = 527;BA.debugLine="If FireScrollChanged Then";
Debug.ShouldStop(16384);
if (__ref.getField(true,"_firescrollchanged" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 528;BA.debugLine="CallSub2(CallBack, EventName & \"_ScrollChanged\",";
Debug.ShouldStop(32768);
customlistviewcollapse.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ScrollChanged"))),(Object)((_position)));
 };
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrolltoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ScrollToItem (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("scrolltoitem")) { return __ref.runUserSub(false, "customlistviewcollapse","scrolltoitem", __ref, _index);}
RemoteObject _offset = RemoteObject.createImmutable(0f);
RemoteObject _hv = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
RemoteObject _nsv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 417;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="Dim offset As Float = Min(GetMaxScrollOffset, Fin";
Debug.ShouldStop(2);
_offset = BA.numberCast(float.class, customlistviewcollapse.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getmaxscrolloffset" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_finditemoffset" /*RemoteObject*/ ,(Object)(_index))))));Debug.locals.put("offset", _offset);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 430;BA.debugLine="If horizontal Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 431;BA.debugLine="Dim hv As HorizontalScrollView = sv";
Debug.ShouldStop(16384);
_hv = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
_hv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject());Debug.locals.put("hv", _hv);
 BA.debugLineNum = 432;BA.debugLine="hv.ScrollPosition = offset 'smooth scroll";
Debug.ShouldStop(32768);
_hv.runMethod(true,"setScrollPosition",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 434;BA.debugLine="Dim nsv As ScrollView = sv";
Debug.ShouldStop(131072);
_nsv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
_nsv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ScrollViewWrapper"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject());Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 435;BA.debugLine="nsv.ScrollPosition = offset";
Debug.ShouldStop(262144);
_nsv.runMethod(true,"setScrollPosition",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setitemoffset(RemoteObject __ref,RemoteObject _item,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("SetItemOffset (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("setitemoffset")) { return __ref.runUserSub(false, "customlistviewcollapse","setitemoffset", __ref, _item, _offset);}
Debug.locals.put("item", _item);
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 374;BA.debugLine="Private Sub SetItemOffset (item As CLVItem, offset";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 375;BA.debugLine="item.Offset = offset";
Debug.ShouldStop(4194304);
_item.setField ("Offset",BA.numberCast(int.class, _offset));
 BA.debugLineNum = 376;BA.debugLine="If horizontal Then";
Debug.ShouldStop(8388608);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 377;BA.debugLine="item.Panel.Left = offset";
Debug.ShouldStop(16777216);
_item.getField(false,"Panel").runMethod(true,"setLeft",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 379;BA.debugLine="item.Panel.Top = offset";
Debug.ShouldStop(67108864);
_item.getField(false,"Panel").runMethod(true,"setTop",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollviewcontentsize(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetScrollViewContentSize (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,366);
if (RapidSub.canDelegate("setscrollviewcontentsize")) { return __ref.runUserSub(false, "customlistviewcollapse","setscrollviewcontentsize", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 366;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16384);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 368;BA.debugLine="sv.ScrollViewContentWidth = f";
Debug.ShouldStop(32768);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentWidth",BA.numberCast(int.class, _f));
 }else {
 BA.debugLineNum = 370;BA.debugLine="sv.ScrollViewContentHeight = f";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, _f));
 };
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
public static RemoteObject  _setscrollviewoffset(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("SetScrollViewOffset (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("setscrollviewoffset")) { return __ref.runUserSub(false, "customlistviewcollapse","setscrollviewoffset", __ref, _offset);}
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 350;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 351;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 352;BA.debugLine="sv.ScrollViewOffsetX = offset";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetX",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 354;BA.debugLine="sv.ScrollViewOffsetY = offset";
Debug.ShouldStop(2);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 356;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sv_scrollchanged(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("sv_ScrollChanged (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,569);
if (RapidSub.canDelegate("sv_scrollchanged")) { return __ref.runUserSub(false, "customlistviewcollapse","sv_scrollchanged", __ref, _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 569;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 570;BA.debugLine="ScrollHandler";
Debug.ShouldStop(33554432);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_scrollhandler" /*RemoteObject*/ );
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
public static RemoteObject  _updatevisiblerange(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateVisibleRange (customlistviewcollapse) ","customlistviewcollapse",34,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("updatevisiblerange")) { return __ref.runUserSub(false, "customlistviewcollapse","updatevisiblerange", __ref);}
RemoteObject _first = RemoteObject.createImmutable(0);
RemoteObject _last = RemoteObject.createImmutable(0);
 BA.debugLineNum = 323;BA.debugLine="Private Sub UpdateVisibleRange";
Debug.ShouldStop(4);
 BA.debugLineNum = 324;BA.debugLine="If MonitorVisibleRange = False Or getSize = 0 The";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_monitorvisiblerange" /*RemoteObject*/ ),customlistviewcollapse.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 325;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
Debug.ShouldStop(16);
_first = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getfirstvisibleindex" /*RemoteObject*/ );Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 326;BA.debugLine="Dim last As Int = getLastVisibleIndex";
Debug.ShouldStop(32);
_last = __ref.runClassMethod (xevolution.vrcg.devdemov2400.customlistviewcollapse.class, "_getlastvisibleindex" /*RemoteObject*/ );Debug.locals.put("last", _last);Debug.locals.put("last", _last);
 BA.debugLineNum = 327;BA.debugLine="If first <> mFirstVisibleIndex Or last <> mLastVi";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_first,BA.numberCast(double.class, __ref.getField(true,"_mfirstvisibleindex" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("!",_last,BA.numberCast(double.class, __ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 328;BA.debugLine="mFirstVisibleIndex = first";
Debug.ShouldStop(128);
__ref.setField ("_mfirstvisibleindex" /*RemoteObject*/ ,_first);
 BA.debugLineNum = 329;BA.debugLine="mLastVisibleIndex = last";
Debug.ShouldStop(256);
__ref.setField ("_mlastvisibleindex" /*RemoteObject*/ ,_last);
 BA.debugLineNum = 330;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_VisibleR";
Debug.ShouldStop(512);
customlistviewcollapse.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VisibleRangeChanged"))),(Object)((__ref.getField(true,"_mfirstvisibleindex" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}