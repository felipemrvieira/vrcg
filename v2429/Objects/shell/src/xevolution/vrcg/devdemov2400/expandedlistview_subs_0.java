package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class expandedlistview_subs_0 {


public static RemoteObject  _add(RemoteObject __ref,RemoteObject _pnl,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Add (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,508);
if (RapidSub.canDelegate("add")) { return __ref.runUserSub(false, "expandedlistview","add", __ref, _pnl, _value);}
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 508;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 509;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertat" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_pnl),(Object)(_value));
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("AddTextItem (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("addtextitem")) { return __ref.runUserSub(false, "expandedlistview","addtextitem", __ref, _text, _value);}
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 275;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="InsertAtTextItem(items.Size, Text, Value, \"\")";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertattextitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_text),(Object)(_value),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtextitemwithdata(RemoteObject __ref,RemoteObject _text,RemoteObject _value,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("AddTextItemWithData (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("addtextitemwithdata")) { return __ref.runUserSub(false, "expandedlistview","addtextitemwithdata", __ref, _text, _value, _data);}
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 279;BA.debugLine="Public Sub AddTextItemWithData(Text As Object, Val";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="InsertAtTextItem(items.Size, Text, Value, Data)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertattextitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_text),(Object)(_value),(Object)(_data));
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addwithdata(RemoteObject __ref,RemoteObject _pnl,RemoteObject _value,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("AddWithData (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,512);
if (RapidSub.canDelegate("addwithdata")) { return __ref.runUserSub(false, "expandedlistview","addwithdata", __ref, _pnl, _value, _data);}
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("Value", _value);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 512;BA.debugLine="Sub AddWithData(Pnl As B4XView, Value As Object, D";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 513;BA.debugLine="InsertAtWithData(items.Size, Pnl, Value, Data)";
Debug.ShouldStop(1);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertatwithdata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_pnl),(Object)(_value),(Object)(_data));
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animatedarrow(RemoteObject __ref,RemoteObject _index,RemoteObject _from,RemoteObject _todegree) throws Exception{
try {
		Debug.PushSubsStack("AnimatedArrow (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("animatedarrow")) { return __ref.runUserSub(false, "expandedlistview","animatedarrow", __ref, _index, _from, _todegree);}
RemoteObject _innerreference = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview");
RemoteObject _pnltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("index", _index);
Debug.locals.put("From", _from);
Debug.locals.put("ToDegree", _todegree);
 BA.debugLineNum = 127;BA.debugLine="Sub AnimatedArrow(index As Int, From As Int, ToDeg";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Dim InnerReference As ExpandedListView = Me";
Debug.ShouldStop(-2147483648);
_innerreference = (__ref);Debug.locals.put("InnerReference", _innerreference);Debug.locals.put("InnerReference", _innerreference);
 BA.debugLineNum = 129;BA.debugLine="Dim pnlTitle As B4XView = InnerReference.GetPanel";
Debug.ShouldStop(1);
_pnltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnltitle = _innerreference.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("pnlTitle", _pnltitle);Debug.locals.put("pnlTitle", _pnltitle);
 BA.debugLineNum = 130;BA.debugLine="Dim iv As B4XView = pnlTitle.GetView(mUpDownIconI";
Debug.ShouldStop(2);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_iv = _pnltitle.runMethod(false,"GetView",(Object)(__ref.getField(true,"_mupdowniconindex" /*RemoteObject*/ )));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 131;BA.debugLine="iv.SetRotationAnimated(0, From)";
Debug.ShouldStop(4);
_iv.runVoidMethod ("SetRotationAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, _from)));
 BA.debugLineNum = 132;BA.debugLine="iv.SetRotationAnimated(InnerReference.AnimationDu";
Debug.ShouldStop(8);
_iv.runVoidMethod ("SetRotationAnimated",(Object)(_innerreference.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, _todegree)));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("AsView (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "expandedlistview","asview", __ref);}
 BA.debugLineNum = 202;BA.debugLine="Public Sub AsView As B4XView";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="Return mBase";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Base_Resize (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "expandedlistview","base_resize", __ref, _width, _height);}
RemoteObject _scrollbar = RemoteObject.createImmutable(0);
RemoteObject _it = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 149;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 151;BA.debugLine="Dim scrollbar As Int";
Debug.ShouldStop(4194304);
_scrollbar = RemoteObject.createImmutable(0);Debug.locals.put("scrollbar", _scrollbar);
 BA.debugLineNum = 152;BA.debugLine="If xui.IsB4J And ScrollBarsVisible Then scrollbar";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J")) && RemoteObject.solveBoolean(".",__ref.getField(true,"_scrollbarsvisible" /*RemoteObject*/ ))) { 
_scrollbar = BA.numberCast(int.class, 20);Debug.locals.put("scrollbar", _scrollbar);};
 BA.debugLineNum = 153;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 154;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,_scrollbar}, "-",1, 0)));
 BA.debugLineNum = 155;BA.debugLine="For Each it As CLVExpItem In items";
Debug.ShouldStop(67108864);
{
final RemoteObject group6 = __ref.getField(false,"_items" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (group6.runMethod(false,"Get",index6));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 156;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
Debug.ShouldStop(134217728);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight"));
 BA.debugLineNum = 157;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
Debug.ShouldStop(268435456);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setHeight",_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 }
}Debug.locals.put("it", _it);
;
 }else {
 BA.debugLineNum = 160;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,_scrollbar}, "-",1, 0)));
 BA.debugLineNum = 161;BA.debugLine="For Each it As CLVExpItem In items";
Debug.ShouldStop(1);
{
final RemoteObject group12 = __ref.getField(false,"_items" /*RemoteObject*/ );
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (group12.runMethod(false,"Get",index12));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 162;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
Debug.ShouldStop(2);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"));
 BA.debugLineNum = 163;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
Debug.ShouldStop(4);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setWidth",_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 164;BA.debugLine="If it.TextItem Then";
Debug.ShouldStop(8);
if (_it.getField(true,"TextItem" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 165;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
Debug.ShouldStop(16);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = _it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 166;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
Debug.ShouldStop(32);
_lbl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(_lbl.runMethod(true,"getLeft")),(Object)(_lbl.runMethod(true,"getTop")),(Object)(RemoteObject.solve(new RemoteObject[] {_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"getWidth"),_lbl.runMethod(true,"getLeft")}, "-",1, 1)),(Object)(_lbl.runMethod(true,"getHeight")));
 };
 }
}Debug.locals.put("it", _it);
;
 };
 BA.debugLineNum = 170;BA.debugLine="If items.Size > 0 Then UpdateVisibleRange";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_updatevisiblerange" /*RemoteObject*/ );};
 BA.debugLineNum = 171;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As B4XView";
expandedlistview._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",expandedlistview._mbase);
 //BA.debugLineNum = 16;BA.debugLine="Private mBaseParent As B4XView";
expandedlistview._mbaseparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbaseparent",expandedlistview._mbaseparent);
 //BA.debugLineNum = 17;BA.debugLine="Private msvParent As B4XView";
expandedlistview._msvparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_msvparent",expandedlistview._msvparent);
 //BA.debugLineNum = 18;BA.debugLine="Public sv As B4XView";
expandedlistview._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_sv",expandedlistview._sv);
 //BA.debugLineNum = 19;BA.debugLine="Type CLVExpItem(Panel As B4XView, Size As Int, Va";
;
 //BA.debugLineNum = 20;BA.debugLine="Private items As List";
expandedlistview._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_items",expandedlistview._items);
 //BA.debugLineNum = 21;BA.debugLine="Private mDividerSize As Float";
expandedlistview._mdividersize = RemoteObject.createImmutable(0f);__ref.setField("_mdividersize",expandedlistview._mdividersize);
 //BA.debugLineNum = 22;BA.debugLine="Private EventName As String";
expandedlistview._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",expandedlistview._eventname);
 //BA.debugLineNum = 23;BA.debugLine="Private CallBack As Object";
expandedlistview._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",expandedlistview._callback);
 //BA.debugLineNum = 24;BA.debugLine="Public DefaultTextColor As Int";
expandedlistview._defaulttextcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextcolor",expandedlistview._defaulttextcolor);
 //BA.debugLineNum = 25;BA.debugLine="Public DefaultTextBackgroundColor As Int";
expandedlistview._defaulttextbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextbackgroundcolor",expandedlistview._defaulttextbackgroundcolor);
 //BA.debugLineNum = 26;BA.debugLine="Public AnimationDuration As Int = 300";
expandedlistview._animationduration = BA.numberCast(int.class, 300);__ref.setField("_animationduration",expandedlistview._animationduration);
 //BA.debugLineNum = 27;BA.debugLine="Private LastReachEndEvent As Long";
expandedlistview._lastreachendevent = RemoteObject.createImmutable(0L);__ref.setField("_lastreachendevent",expandedlistview._lastreachendevent);
 //BA.debugLineNum = 28;BA.debugLine="Private PressedColor As Int";
expandedlistview._pressedcolor = RemoteObject.createImmutable(0);__ref.setField("_pressedcolor",expandedlistview._pressedcolor);
 //BA.debugLineNum = 29;BA.debugLine="Private xui As XUI";
expandedlistview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",expandedlistview._xui);
 //BA.debugLineNum = 30;BA.debugLine="Private DesignerLabel As Label";
expandedlistview._designerlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_designerlabel",expandedlistview._designerlabel);
 //BA.debugLineNum = 31;BA.debugLine="Private horizontal As Boolean";
expandedlistview._horizontal = RemoteObject.createImmutable(false);__ref.setField("_horizontal",expandedlistview._horizontal);
 //BA.debugLineNum = 32;BA.debugLine="Private mUpDownIconExists As Boolean = False";
expandedlistview._mupdowniconexists = expandedlistview.__c.getField(true,"False");__ref.setField("_mupdowniconexists",expandedlistview._mupdowniconexists);
 //BA.debugLineNum = 33;BA.debugLine="Private mUpDownIconIndex As Int = 0";
expandedlistview._mupdowniconindex = BA.numberCast(int.class, 0);__ref.setField("_mupdowniconindex",expandedlistview._mupdowniconindex);
 //BA.debugLineNum = 34;BA.debugLine="Private iData As List";
expandedlistview._idata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_idata",expandedlistview._idata);
 //BA.debugLineNum = 38;BA.debugLine="Private su As StringUtils";
expandedlistview._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_su",expandedlistview._su);
 //BA.debugLineNum = 42;BA.debugLine="Private mFirstVisibleIndex, mLastVisibleIndex As";
expandedlistview._mfirstvisibleindex = RemoteObject.createImmutable(0);__ref.setField("_mfirstvisibleindex",expandedlistview._mfirstvisibleindex);
expandedlistview._mlastvisibleindex = RemoteObject.createImmutable(0);__ref.setField("_mlastvisibleindex",expandedlistview._mlastvisibleindex);
 //BA.debugLineNum = 43;BA.debugLine="Private MonitorVisibleRange As Boolean";
expandedlistview._monitorvisiblerange = RemoteObject.createImmutable(false);__ref.setField("_monitorvisiblerange",expandedlistview._monitorvisiblerange);
 //BA.debugLineNum = 44;BA.debugLine="Private FireScrollChanged As Boolean";
expandedlistview._firescrollchanged = RemoteObject.createImmutable(false);__ref.setField("_firescrollchanged",expandedlistview._firescrollchanged);
 //BA.debugLineNum = 45;BA.debugLine="Private ScrollBarsVisible As Boolean";
expandedlistview._scrollbarsvisible = RemoteObject.createImmutable(false);__ref.setField("_scrollbarsvisible",expandedlistview._scrollbarsvisible);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "expandedlistview","clear", __ref);}
 BA.debugLineNum = 207;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="items.Clear";
Debug.ShouldStop(32768);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 209;BA.debugLine="iData.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_idata" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 210;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 211;BA.debugLine="SetScrollViewContentSize(0)";
Debug.ShouldStop(262144);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setscrollviewcontentsize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 212;BA.debugLine="ResetVisibles";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_resetvisibles" /*RemoteObject*/ );
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collapseitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("CollapseItem (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("collapseitem")) { return __ref.runUserSub(false, "expandedlistview","collapseitem", __ref, _index);}
RemoteObject _innerreference = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview");
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
Debug.locals.put("index", _index);
 BA.debugLineNum = 135;BA.debugLine="Sub CollapseItem(index As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim InnerReference As ExpandedListView = Me";
Debug.ShouldStop(128);
_innerreference = (__ref);Debug.locals.put("InnerReference", _innerreference);Debug.locals.put("InnerReference", _innerreference);
 BA.debugLineNum = 137;BA.debugLine="Dim id As ItemData = InnerReference.GetValue(inde";
Debug.ShouldStop(256);
_id = (_innerreference.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 138;BA.debugLine="InnerReference.ResizeItem(index, id.CollapsedHeig";
Debug.ShouldStop(512);
_innerreference.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_resizeitem" /*RemoteObject*/ ,(Object)(_index),(Object)(_id.getField(true,"CollapsedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 139;BA.debugLine="InnerReference.GetPanel(index).Tag = False";
Debug.ShouldStop(1024);
_innerreference.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"setTag",(expandedlistview.__c.getField(true,"False")));
 BA.debugLineNum = 140;BA.debugLine="If (mUpDownIconExists) Then";
Debug.ShouldStop(2048);
if ((__ref.getField(true,"_mupdowniconexists" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 141;BA.debugLine="AnimatedArrow(index, 180, 0)";
Debug.ShouldStop(4096);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_animatedarrow" /*RemoteObject*/ ,(Object)(_index),(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CreateLabel (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,672);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "expandedlistview","createlabel", __ref, _txt);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 672;BA.debugLine="Private Sub CreateLabel(txt As Object) As B4XView";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 673;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(1);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 674;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(2);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 675;BA.debugLine="lbl.Gravity = DesignerLabel.Gravity";
Debug.ShouldStop(4);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_designerlabel" /*RemoteObject*/ ).runMethod(true,"getGravity"));
 BA.debugLineNum = 676;BA.debugLine="lbl.TextSize = DesignerLabel.TextSize";
Debug.ShouldStop(8);
_lbl.runMethod(true,"setTextSize",__ref.getField(false,"_designerlabel" /*RemoteObject*/ ).runMethod(true,"getTextSize"));
 BA.debugLineNum = 677;BA.debugLine="lbl.SingleLine = False";
Debug.ShouldStop(16);
_lbl.runVoidMethod ("setSingleLine",expandedlistview.__c.getField(true,"False"));
 BA.debugLineNum = 678;BA.debugLine="lbl.Text = txt";
Debug.ShouldStop(32);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_txt));
 BA.debugLineNum = 679;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
Debug.ShouldStop(64);
_lbl.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"),expandedlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1));
 BA.debugLineNum = 680;BA.debugLine="lbl.Height = su.MeasureMultilineTextHeight(lbl, t";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setHeight",__ref.getField(false,"_su" /*RemoteObject*/ ).runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_txt))));
 BA.debugLineNum = 681;BA.debugLine="Return lbl";
Debug.ShouldStop(256);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 682;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("CreatePanel (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,632);
if (RapidSub.canDelegate("createpanel")) { return __ref.runUserSub(false, "expandedlistview","createpanel", __ref, _paneleventname);}
Debug.locals.put("PanelEventName", _paneleventname);
 BA.debugLineNum = 632;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 633;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(_paneleventname));
 BA.debugLineNum = 634;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("CreateScrollView (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,652);
if (RapidSub.canDelegate("createscrollview")) { return __ref.runUserSub(false, "expandedlistview","createscrollview", __ref);}
RemoteObject _hv = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
RemoteObject _nsv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
 BA.debugLineNum = 652;BA.debugLine="Private Sub CreateScrollView As B4XView";
Debug.ShouldStop(2048);
 BA.debugLineNum = 653;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 654;BA.debugLine="Dim hv As HorizontalScrollView";
Debug.ShouldStop(8192);
_hv = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");Debug.locals.put("hv", _hv);
 BA.debugLineNum = 655;BA.debugLine="hv.Initialize(0, \"sv\")";
Debug.ShouldStop(16384);
_hv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 656;BA.debugLine="Return hv";
Debug.ShouldStop(32768);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _hv.getObject());
 }else {
 BA.debugLineNum = 658;BA.debugLine="Dim nsv As ScrollView";
Debug.ShouldStop(131072);
_nsv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 659;BA.debugLine="nsv.Initialize2(0, \"sv\")";
Debug.ShouldStop(262144);
_nsv.runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 660;BA.debugLine="Return nsv";
Debug.ShouldStop(524288);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _nsv.getObject());
 };
 BA.debugLineNum = 662;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("DesignerCreateView (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "expandedlistview","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _o = RemoteObject.createImmutable("");
RemoteObject _jsv = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 71;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="mBase = Base";
Debug.ShouldStop(128);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 73;BA.debugLine="mBaseParent = mBase.Parent";
Debug.ShouldStop(256);
__ref.setField ("_mbaseparent" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent"));
 BA.debugLineNum = 74;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
Debug.ShouldStop(512);
_o = BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ListOrientation"))),(Object)((RemoteObject.createImmutable("Vertical")))));Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 75;BA.debugLine="horizontal = o = \"Horizontal\"";
Debug.ShouldStop(1024);
__ref.setField ("_horizontal" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_o,BA.ObjectToString("Horizontal"))));
 BA.debugLineNum = 76;BA.debugLine="sv = CreateScrollView";
Debug.ShouldStop(2048);
__ref.setField ("_sv" /*RemoteObject*/ ,__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_createscrollview" /*RemoteObject*/ ));
 BA.debugLineNum = 77;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 78;BA.debugLine="msvParent = sv.Parent";
Debug.ShouldStop(8192);
__ref.setField ("_msvparent" /*RemoteObject*/ ,__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getParent"));
 BA.debugLineNum = 79;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
Debug.ShouldStop(16384);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DividerColor")))))));
 BA.debugLineNum = 80;BA.debugLine="mDividerSize = DipToCurrent(Props.Get(\"DividerHei";
Debug.ShouldStop(32768);
__ref.setField ("_mdividersize" /*RemoteObject*/ ,BA.numberCast(float.class, expandedlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DividerHeight")))))))));
 BA.debugLineNum = 81;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
Debug.ShouldStop(65536);
__ref.setField ("_pressedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PressedColor")))))));
 BA.debugLineNum = 82;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
Debug.ShouldStop(131072);
__ref.setField ("_animationduration" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("InsertAnimationDuration"))),(Object)((__ref.getField(true,"_animationduration" /*RemoteObject*/ ))))));
 BA.debugLineNum = 83;BA.debugLine="ScrollBarsVisible = Props.GetDefault(\"ShowScrollB";
Debug.ShouldStop(262144);
__ref.setField ("_scrollbarsvisible" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ShowScrollBar"))),(Object)((expandedlistview.__c.getField(true,"True"))))));
 BA.debugLineNum = 85;BA.debugLine="mUpDownIconExists = Props.GetDefault(\"UpDownIcon\"";
Debug.ShouldStop(1048576);
__ref.setField ("_mupdowniconexists" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("UpDownIcon"))),(Object)((expandedlistview.__c.getField(true,"False"))))));
 BA.debugLineNum = 86;BA.debugLine="mUpDownIconIndex = Props.GetDefault(\"UpDownIndex\"";
Debug.ShouldStop(2097152);
__ref.setField ("_mupdowniconindex" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("UpDownIndex"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 88;BA.debugLine="If ScrollBarsVisible = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_scrollbarsvisible" /*RemoteObject*/ ),expandedlistview.__c.getField(true,"False"))) { 
 BA.debugLineNum = 94;BA.debugLine="Dim jsv As JavaObject = sv";
Debug.ShouldStop(536870912);
_jsv = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jsv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject());Debug.locals.put("jsv", _jsv);
 BA.debugLineNum = 95;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="jsv.RunMethod(\"setHorizontalScrollBarEnabled\",";
Debug.ShouldStop(-2147483648);
_jsv.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHorizontalScrollBarEnabled")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(expandedlistview.__c.getField(true,"False"))})));
 }else {
 BA.debugLineNum = 98;BA.debugLine="jsv.RunMethod(\"setVerticalScrollBarEnabled\", Ar";
Debug.ShouldStop(2);
_jsv.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVerticalScrollBarEnabled")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(expandedlistview.__c.getField(true,"False"))})));
 };
 };
 BA.debugLineNum = 106;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
Debug.ShouldStop(512);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)((_lbl.runMethod(true,"getTextColor")))));
 BA.debugLineNum = 107;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
Debug.ShouldStop(1024);
__ref.setField ("_defaulttextbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 108;BA.debugLine="DesignerLabel = Lbl";
Debug.ShouldStop(2048);
__ref.setField ("_designerlabel" /*RemoteObject*/ ,_lbl);
 BA.debugLineNum = 109;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.ShouldStop(4096);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expanditem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ExpandItem (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("expanditem")) { return __ref.runUserSub(false, "expandedlistview","expanditem", __ref, _index);}
RemoteObject _innerreference = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview");
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
Debug.locals.put("index", _index);
 BA.debugLineNum = 116;BA.debugLine="Sub ExpandItem(index As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Dim InnerReference As ExpandedListView = Me";
Debug.ShouldStop(1048576);
_innerreference = (__ref);Debug.locals.put("InnerReference", _innerreference);Debug.locals.put("InnerReference", _innerreference);
 BA.debugLineNum = 118;BA.debugLine="Dim id As ItemData = InnerReference.GetValue(inde";
Debug.ShouldStop(2097152);
_id = (_innerreference.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 120;BA.debugLine="InnerReference.ResizeItem(index, id.ExpandedHeigh";
Debug.ShouldStop(8388608);
_innerreference.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_resizeitem" /*RemoteObject*/ ,(Object)(_index),(Object)(_id.getField(true,"ExpandedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 121;BA.debugLine="InnerReference.GetPanel(index).Tag = True";
Debug.ShouldStop(16777216);
_innerreference.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index)).runMethod(false,"setTag",(expandedlistview.__c.getField(true,"True")));
 BA.debugLineNum = 122;BA.debugLine="If (mUpDownIconExists) Then";
Debug.ShouldStop(33554432);
if ((__ref.getField(true,"_mupdowniconexists" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 123;BA.debugLine="AnimatedArrow(index, 0, 180)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_animatedarrow" /*RemoteObject*/ ,(Object)(_index),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 180)));
 };
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("FindIndexFromOffset (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,554);
if (RapidSub.canDelegate("findindexfromoffset")) { return __ref.runUserSub(false, "expandedlistview","findindexfromoffset", __ref, _offset);}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _stepsize = RemoteObject.createImmutable(0);
RemoteObject _currentitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
RemoteObject _nextoffset = RemoteObject.createImmutable(0);
RemoteObject _prevoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 554;BA.debugLine="Public Sub FindIndexFromOffset(Offset As Int) As I";
Debug.ShouldStop(512);
 BA.debugLineNum = 556;BA.debugLine="Dim Position As Int = items.Size / 2";
Debug.ShouldStop(2048);
_position = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 557;BA.debugLine="Dim StepSize As Int = Ceil(Position / 2)";
Debug.ShouldStop(4096);
_stepsize = BA.numberCast(int.class, expandedlistview.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("StepSize", _stepsize);Debug.locals.put("StepSize", _stepsize);
 BA.debugLineNum = 558;BA.debugLine="Do While True";
Debug.ShouldStop(8192);
while (expandedlistview.__c.getField(true,"True").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 559;BA.debugLine="Dim CurrentItem As CLVExpItem = items.Get(Positi";
Debug.ShouldStop(16384);
_currentitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_position)));Debug.locals.put("CurrentItem", _currentitem);Debug.locals.put("CurrentItem", _currentitem);
 BA.debugLineNum = 560;BA.debugLine="Dim NextOffset As Int";
Debug.ShouldStop(32768);
_nextoffset = RemoteObject.createImmutable(0);Debug.locals.put("NextOffset", _nextoffset);
 BA.debugLineNum = 561;BA.debugLine="If Position < items.Size - 1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",_position,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 562;BA.debugLine="NextOffset = GetRawListItem(Position + 1).Offse";
Debug.ShouldStop(131072);
_nextoffset = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1))).getField(true,"Offset" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("NextOffset", _nextoffset);
 }else {
 BA.debugLineNum = 564;BA.debugLine="NextOffset = 0x7FFFFFFF";
Debug.ShouldStop(524288);
_nextoffset = BA.numberCast(int.class, 0x7fffffff);Debug.locals.put("NextOffset", _nextoffset);
 };
 BA.debugLineNum = 566;BA.debugLine="Dim PrevOffset As Int";
Debug.ShouldStop(2097152);
_prevoffset = RemoteObject.createImmutable(0);Debug.locals.put("PrevOffset", _prevoffset);
 BA.debugLineNum = 567;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 568;BA.debugLine="PrevOffset = 0x80000000";
Debug.ShouldStop(8388608);
_prevoffset = BA.numberCast(int.class, 0x80000000);Debug.locals.put("PrevOffset", _prevoffset);
 }else {
 BA.debugLineNum = 570;BA.debugLine="PrevOffset = CurrentItem.Offset";
Debug.ShouldStop(33554432);
_prevoffset = _currentitem.getField(true,"Offset" /*RemoteObject*/ );Debug.locals.put("PrevOffset", _prevoffset);
 };
 BA.debugLineNum = 572;BA.debugLine="If Offset > NextOffset Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_offset,BA.numberCast(double.class, _nextoffset))) { 
 BA.debugLineNum = 573;BA.debugLine="Position = Min(Position + StepSize, items.Size";
Debug.ShouldStop(268435456);
_position = BA.numberCast(int.class, expandedlistview.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_position,_stepsize}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))));Debug.locals.put("Position", _position);
 }else 
{ BA.debugLineNum = 574;BA.debugLine="Else if Offset < PrevOffset Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",_offset,BA.numberCast(double.class, _prevoffset))) { 
 BA.debugLineNum = 575;BA.debugLine="Position = Max(Position - StepSize, 0)";
Debug.ShouldStop(1073741824);
_position = BA.numberCast(int.class, expandedlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_position,_stepsize}, "-",1, 1))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Position", _position);
 }else {
 BA.debugLineNum = 577;BA.debugLine="Return Position";
Debug.ShouldStop(1);
if (true) return _position;
 }}
;
 BA.debugLineNum = 579;BA.debugLine="StepSize = Ceil(StepSize / 2)";
Debug.ShouldStop(4);
_stepsize = BA.numberCast(int.class, expandedlistview.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_stepsize,RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("StepSize", _stepsize);
 }
;
 BA.debugLineNum = 581;BA.debugLine="Return -1";
Debug.ShouldStop(16);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 582;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("FindItemOffset (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("finditemoffset")) { return __ref.runUserSub(false, "expandedlistview","finditemoffset", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 549;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="Return GetRawListItem(Index).Offset";
Debug.ShouldStop(32);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(_index)).getField(true,"Offset" /*RemoteObject*/ );
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("GetBase (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "expandedlistview","getbase", __ref);}
 BA.debugLineNum = 215;BA.debugLine="Public Sub GetBase As B4XView";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="Return mBase";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbaseparent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBaseParent (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,640);
if (RapidSub.canDelegate("getbaseparent")) { return __ref.runUserSub(false, "expandedlistview","getbaseparent", __ref);}
 BA.debugLineNum = 640;BA.debugLine="Public Sub getBaseParent As B4XView";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 641;BA.debugLine="Return mBaseParent";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_mbaseparent" /*RemoteObject*/ );
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("getDividerSize (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,636);
if (RapidSub.canDelegate("getdividersize")) { return __ref.runUserSub(false, "expandedlistview","getdividersize", __ref);}
 BA.debugLineNum = 636;BA.debugLine="Public Sub getDividerSize As Float";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 637;BA.debugLine="Return mDividerSize";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(true,"_mdividersize" /*RemoteObject*/ );
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("getFirstVisibleIndex (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,585);
if (RapidSub.canDelegate("getfirstvisibleindex")) { return __ref.runUserSub(false, "expandedlistview","getfirstvisibleindex", __ref);}
 BA.debugLineNum = 585;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 586;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
Debug.ShouldStop(512);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_findindexfromoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewoffset" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 587;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitemdata(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetItemData (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("getitemdata")) { return __ref.runUserSub(false, "expandedlistview","getitemdata", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 229;BA.debugLine="Public Sub GetItemData(Index As Int) As Object";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="Return iData.Get(Index)";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_idata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index));
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitemfromview(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromView (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,605);
if (RapidSub.canDelegate("getitemfromview")) { return __ref.runUserSub(false, "expandedlistview","getitemfromview", __ref, _v);}
RemoteObject _parent = RemoteObject.declareNull("Object");
RemoteObject _current = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("v", _v);
 BA.debugLineNum = 605;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 606;BA.debugLine="Dim parent = v As Object, current As B4XView";
Debug.ShouldStop(536870912);
_parent = (_v.getObject());Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
_current = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("current", _current);
 BA.debugLineNum = 607;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
Debug.ShouldStop(1073741824);
while (RemoteObject.solveBoolean("!",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel"),_parent)) {
 BA.debugLineNum = 608;BA.debugLine="current = parent";
Debug.ShouldStop(-2147483648);
_current = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _parent);
 BA.debugLineNum = 609;BA.debugLine="parent = current.Parent";
Debug.ShouldStop(1);
_parent = (_current.runMethod(false,"getParent").getObject());Debug.locals.put("parent", _parent);
 }
;
 BA.debugLineNum = 611;BA.debugLine="v = current";
Debug.ShouldStop(4);
_v = _current;Debug.locals.put("v", _v);
 BA.debugLineNum = 612;BA.debugLine="Return v.Tag";
Debug.ShouldStop(8);
if (true) return BA.numberCast(int.class, _v.runMethod(false,"getTag"));
 BA.debugLineNum = 613;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitemsheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getItemsHeight (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("getitemsheight")) { return __ref.runUserSub(false, "expandedlistview","getitemsheight", __ref);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _it = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
 BA.debugLineNum = 194;BA.debugLine="Public Sub getItemsHeight As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(4);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 196;BA.debugLine="For Each it As CLVExpItem In items";
Debug.ShouldStop(8);
{
final RemoteObject group2 = __ref.getField(false,"_items" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_it = (group2.runMethod(false,"Get",index2));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 197;BA.debugLine="ret = ret + it.Panel.Height";
Debug.ShouldStop(16);
_ret = RemoteObject.solve(new RemoteObject[] {_ret,_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("ret", _ret);
 }
}Debug.locals.put("it", _it);
;
 BA.debugLineNum = 199;BA.debugLine="Return ret";
Debug.ShouldStop(64);
if (true) return _ret;
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("getLastVisibleIndex (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,590);
if (RapidSub.canDelegate("getlastvisibleindex")) { return __ref.runUserSub(false, "expandedlistview","getlastvisibleindex", __ref);}
 BA.debugLineNum = 590;BA.debugLine="Public Sub getLastVisibleIndex As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 591;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
Debug.ShouldStop(16384);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_findindexfromoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewoffset" /*RemoteObject*/ ),__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 592;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("GetMaxScrollOffset (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,521);
if (RapidSub.canDelegate("getmaxscrolloffset")) { return __ref.runUserSub(false, "expandedlistview","getmaxscrolloffset", __ref);}
 BA.debugLineNum = 521;BA.debugLine="Private Sub GetMaxScrollOffset As Float";
Debug.ShouldStop(256);
 BA.debugLineNum = 522;BA.debugLine="Return GetScrollViewContentSize - GetScrollViewVi";
Debug.ShouldStop(512);
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "-",1, 0));
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("GetPanel (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "expandedlistview","getpanel", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 234;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
Debug.ShouldStop(512);
 BA.debugLineNum = 236;BA.debugLine="If items.Size > Index Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, _index))) { 
 BA.debugLineNum = 237;BA.debugLine="Return GetRawListItem(Index).Panel.GetView(0)";
Debug.ShouldStop(4096);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(_index)).getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 239;BA.debugLine="Return GetRawListItem(0).Panel.GetView(0)";
Debug.ShouldStop(16384);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0))).getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("GetRawListItem (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("getrawlistitem")) { return __ref.runUserSub(false, "expandedlistview","getrawlistitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 225;BA.debugLine="Public Sub GetRawListItem(Index As Int) As CLVExpI";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="Return items.Get(Index)";
Debug.ShouldStop(2);
if (true) return (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getScrollHeight (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("getscrollheight")) { return __ref.runUserSub(false, "expandedlistview","getscrollheight", __ref);}
 BA.debugLineNum = 190;BA.debugLine="Public Sub getScrollHeight As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="Return sv.ScrollViewContentHeight";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight");
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewcontentsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewContentSize (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,453);
if (RapidSub.canDelegate("getscrollviewcontentsize")) { return __ref.runUserSub(false, "expandedlistview","getscrollviewcontentsize", __ref);}
 BA.debugLineNum = 453;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
Debug.ShouldStop(16);
 BA.debugLineNum = 454;BA.debugLine="If horizontal Then";
Debug.ShouldStop(32);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 455;BA.debugLine="Return sv.ScrollViewContentWidth";
Debug.ShouldStop(64);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"));
 }else {
 BA.debugLineNum = 457;BA.debugLine="Return sv.ScrollViewContentHeight";
Debug.ShouldStop(256);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight"));
 };
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("GetScrollViewOffset (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,437);
if (RapidSub.canDelegate("getscrollviewoffset")) { return __ref.runUserSub(false, "expandedlistview","getscrollviewoffset", __ref);}
 BA.debugLineNum = 437;BA.debugLine="Private Sub GetScrollViewOffset As Float";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 438;BA.debugLine="If horizontal Then";
Debug.ShouldStop(2097152);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 439;BA.debugLine="Return sv.ScrollViewOffsetX";
Debug.ShouldStop(4194304);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetX"));
 }else {
 BA.debugLineNum = 441;BA.debugLine="Return sv.ScrollViewOffsetY";
Debug.ShouldStop(16777216);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));
 };
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("GetScrollViewVisibleSize (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("getscrollviewvisiblesize")) { return __ref.runUserSub(false, "expandedlistview","getscrollviewvisiblesize", __ref);}
 BA.debugLineNum = 429;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="If horizontal Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 431;BA.debugLine="Return sv.Width";
Debug.ShouldStop(16384);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 }else {
 BA.debugLineNum = 433;BA.debugLine="Return sv.Height";
Debug.ShouldStop(65536);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("getSize (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "expandedlistview","getsize", __ref);}
 BA.debugLineNum = 220;BA.debugLine="Public Sub getSize As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="Return items.Size";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsvparent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSVParent (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,644);
if (RapidSub.canDelegate("getsvparent")) { return __ref.runUserSub(false, "expandedlistview","getsvparent", __ref);}
 BA.debugLineNum = 644;BA.debugLine="Public Sub getSVParent As B4XView";
Debug.ShouldStop(8);
 BA.debugLineNum = 645;BA.debugLine="Return msvParent";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_msvparent" /*RemoteObject*/ );
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getupdowniconexists(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getUpDownIconExists (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("getupdowniconexists")) { return __ref.runUserSub(false, "expandedlistview","getupdowniconexists", __ref);}
 BA.debugLineNum = 173;BA.debugLine="Public Sub getUpDownIconExists As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Return mUpDownIconExists";
Debug.ShouldStop(8192);
if (true) return __ref.getField(true,"_mupdowniconexists" /*RemoteObject*/ );
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getupdowniconindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getUpDownIconIndex (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("getupdowniconindex")) { return __ref.runUserSub(false, "expandedlistview","getupdowniconindex", __ref);}
 BA.debugLineNum = 181;BA.debugLine="Public Sub getUpDownIconIndex As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Return mUpDownIconIndex";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(true,"_mupdowniconindex" /*RemoteObject*/ );
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("GetValue (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "expandedlistview","getvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 244;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
Debug.ShouldStop(524288);
 BA.debugLineNum = 245;BA.debugLine="If items.Size > Index Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, _index))) { 
 BA.debugLineNum = 246;BA.debugLine="Return GetRawListItem(Index).Value";
Debug.ShouldStop(2097152);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(_index)).getField(false,"Value" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 248;BA.debugLine="Return Null";
Debug.ShouldStop(8388608);
if (true) return expandedlistview.__c.getField(false,"Null");
 };
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Initialize (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "expandedlistview","initialize", __ref, _ba, _vcallback, _veventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallBack", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(65536);
__ref.setField ("_eventname" /*RemoteObject*/ ,_veventname);
 BA.debugLineNum = 50;BA.debugLine="CallBack = vCallBack";
Debug.ShouldStop(131072);
__ref.setField ("_callback" /*RemoteObject*/ ,_vcallback);
 BA.debugLineNum = 51;BA.debugLine="items.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="iData.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_idata" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
Debug.ShouldStop(1048576);
__ref.setField ("_defaulttextbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 54;BA.debugLine="DefaultTextColor = xui.Color_Black";
Debug.ShouldStop(2097152);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 55;BA.debugLine="MonitorVisibleRange = xui.SubExists(CallBack, Eve";
Debug.ShouldStop(4194304);
__ref.setField ("_monitorvisiblerange" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VisibleRangeChanged"))),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 56;BA.debugLine="FireScrollChanged = xui.SubExists(CallBack, Event";
Debug.ShouldStop(8388608);
__ref.setField ("_firescrollchanged" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ScrollChanged"))),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 57;BA.debugLine="ResetVisibles";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_resetvisibles" /*RemoteObject*/ );
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
public static RemoteObject  _insertat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAt (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("insertat")) { return __ref.runUserSub(false, "expandedlistview","insertat", __ref, _index, _pnl, _value);}
RemoteObject _size = RemoteObject.createImmutable(0f);
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 304;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="Dim size As Float";
Debug.ShouldStop(65536);
_size = RemoteObject.createImmutable(0f);Debug.locals.put("size", _size);
 BA.debugLineNum = 306;BA.debugLine="If horizontal Then";
Debug.ShouldStop(131072);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 307;BA.debugLine="size = pnl.Width";
Debug.ShouldStop(262144);
_size = BA.numberCast(float.class, _pnl.runMethod(true,"getWidth"));Debug.locals.put("size", _size);
 }else {
 BA.debugLineNum = 309;BA.debugLine="size = pnl.Height";
Debug.ShouldStop(1048576);
_size = BA.numberCast(float.class, _pnl.runMethod(true,"getHeight"));Debug.locals.put("size", _size);
 };
 BA.debugLineNum = 311;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0, \"\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertatimpl" /*void*/ ,(Object)(_index),(Object)(_pnl),(Object)(BA.numberCast(int.class, _size)),(Object)(_value),(Object)(BA.numberCast(int.class, 0)),(Object)((RemoteObject.createImmutable(""))));
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
public static void  _insertatimpl(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemsize,RemoteObject _value,RemoteObject _initialsize,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("InsertAtImpl (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("insertatimpl")) { __ref.runUserSub(false, "expandedlistview","insertatimpl", __ref, _index, _pnl, _itemsize, _value, _initialsize, _data); return;}
ResumableSub_InsertAtImpl rsub = new ResumableSub_InsertAtImpl(null,__ref,_index,_pnl,_itemsize,_value,_initialsize,_data);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InsertAtImpl extends BA.ResumableSub {
public ResumableSub_InsertAtImpl(xevolution.vrcg.devdemov2400.expandedlistview parent,RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemsize,RemoteObject _value,RemoteObject _initialsize,RemoteObject _data) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._pnl = _pnl;
this._itemsize = _itemsize;
this._value = _value;
this._initialsize = _initialsize;
this._data = _data;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.expandedlistview parent;
RemoteObject _index;
RemoteObject _pnl;
RemoteObject _itemsize;
RemoteObject _value;
RemoteObject _initialsize;
RemoteObject _data;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _includedividierheight = RemoteObject.createImmutable(0);
RemoteObject _newitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _previtem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
int _i = 0;
RemoteObject _it = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
RemoteObject _newoffset = RemoteObject.createImmutable(0);
RemoteObject _shouldsetpanelheight = RemoteObject.createImmutable(false);
int step40;
int limit40;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertAtImpl (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,325);
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
Debug.locals.put("Data", _data);
 BA.debugLineNum = 327;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_createpanel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Panel")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 328;BA.debugLine="p.Color = Pnl.Color";
Debug.ShouldStop(128);
_p.runMethod(true,"setColor",_pnl.runMethod(true,"getColor"));
 BA.debugLineNum = 329;BA.debugLine="Pnl.Color = xui.Color_Transparent";
Debug.ShouldStop(256);
_pnl.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 330;BA.debugLine="If horizontal Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 331;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
Debug.ShouldStop(1024);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 333;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
Debug.ShouldStop(4096);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth")),(Object)(_itemsize));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 335;BA.debugLine="p.Tag = Index";
Debug.ShouldStop(16384);
_p.runMethod(false,"setTag",(_index));
 BA.debugLineNum = 336;BA.debugLine="Dim IncludeDividierHeight As Int";
Debug.ShouldStop(32768);
_includedividierheight = RemoteObject.createImmutable(0);Debug.locals.put("IncludeDividierHeight", _includedividierheight);
 BA.debugLineNum = 337;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = m";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 338;BA.debugLine="Dim NewItem As CLVExpItem";
Debug.ShouldStop(131072);
_newitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");Debug.locals.put("NewItem", _newitem);
 BA.debugLineNum = 339;BA.debugLine="NewItem.Panel = p";
Debug.ShouldStop(262144);
_newitem.setField ("Panel" /*RemoteObject*/ ,_p);
 BA.debugLineNum = 340;BA.debugLine="NewItem.Size = ItemSize";
Debug.ShouldStop(524288);
_newitem.setField ("Size" /*RemoteObject*/ ,_itemsize);
 BA.debugLineNum = 341;BA.debugLine="NewItem.Value = Value";
Debug.ShouldStop(1048576);
_newitem.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 342;BA.debugLine="NewItem.Color = p.Color";
Debug.ShouldStop(2097152);
_newitem.setField ("Color" /*RemoteObject*/ ,_p.runMethod(true,"getColor"));
 BA.debugLineNum = 343;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 344;BA.debugLine="items.Add(NewItem)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_newitem)));
 BA.debugLineNum = 345;BA.debugLine="iData.Add(Data)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_idata" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_data));
 BA.debugLineNum = 346;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(33554432);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 347;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 348;BA.debugLine="offset = mDividerSize";
Debug.ShouldStop(134217728);
_offset = BA.numberCast(int.class, __ref.getField(true,"_mdividersize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 350;BA.debugLine="offset = GetScrollViewContentSize";
Debug.ShouldStop(536870912);
_offset = BA.numberCast(int.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 352;BA.debugLine="NewItem.Offset = offset";
Debug.ShouldStop(-2147483648);
_newitem.setField ("Offset" /*RemoteObject*/ ,_offset);
 BA.debugLineNum = 353;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 354;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
Debug.ShouldStop(2);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 356;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 359;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(64);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 360;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 361;BA.debugLine="offset = mDividerSize";
Debug.ShouldStop(256);
_offset = BA.numberCast(int.class, __ref.getField(true,"_mdividersize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 363;BA.debugLine="Dim PrevItem As CLVExpItem = items.Get(Index -";
Debug.ShouldStop(1024);
_previtem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("PrevItem", _previtem);Debug.locals.put("PrevItem", _previtem);
 BA.debugLineNum = 364;BA.debugLine="offset = PrevItem.Offset + PrevItem.Size + mDiv";
Debug.ShouldStop(2048);
_offset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_previtem.getField(true,"Offset" /*RemoteObject*/ ),_previtem.getField(true,"Size" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "++",2, 0));Debug.locals.put("offset", _offset);
 if (true) break;
;
 BA.debugLineNum = 366;BA.debugLine="For i = Index To items.Size - 1";
Debug.ShouldStop(8192);

case 37:
//for
this.state = 52;
step40 = 1;
limit40 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _index.<Integer>get().intValue() ;
Debug.locals.put("i", _i);
this.state = 83;
if (true) break;

case 83:
//C
this.state = 52;
if ((step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40)) this.state = 39;
if (true) break;

case 84:
//C
this.state = 83;
_i = ((int)(0 + _i + step40)) ;
Debug.locals.put("i", _i);
if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 367;BA.debugLine="Dim It As CLVExpItem = items.Get(i)";
Debug.ShouldStop(16384);
_it = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("It", _it);Debug.locals.put("It", _it);
 BA.debugLineNum = 368;BA.debugLine="Dim NewOffset As Int = It.Offset + ItemSize - I";
Debug.ShouldStop(32768);
_newoffset = RemoteObject.solve(new RemoteObject[] {_it.getField(true,"Offset" /*RemoteObject*/ ),_itemsize,_initialsize,_includedividierheight}, "+-+",3, 1);Debug.locals.put("NewOffset", _newoffset);Debug.locals.put("NewOffset", _newoffset);
 BA.debugLineNum = 369;BA.debugLine="If Min(NewOffset, It.Offset) - GetScrollViewOff";
Debug.ShouldStop(65536);
if (true) break;

case 40:
//if
this.state = 51;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _newoffset)),(Object)(BA.numberCast(double.class, _it.getField(true,"Offset" /*RemoteObject*/ )))),__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewoffset" /*RemoteObject*/ )}, "-",1, 0),BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )))) { 
this.state = 42;
}else {
this.state = 50;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 370;BA.debugLine="It.Offset = NewOffset";
Debug.ShouldStop(131072);
_it.setField ("Offset" /*RemoteObject*/ ,_newoffset);
 BA.debugLineNum = 371;BA.debugLine="If horizontal Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 372;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
Debug.ShouldStop(524288);
_it.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(_newoffset),(Object)(BA.numberCast(int.class, 0)),(Object)(_it.getField(true,"Size" /*RemoteObject*/ )),(Object)(_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 374;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
Debug.ShouldStop(2097152);
_it.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(_newoffset),(Object)(_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_it.getField(true,"Size" /*RemoteObject*/ )));
 if (true) break;

case 48:
//C
this.state = 51;
;
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 377;BA.debugLine="SetItemOffset(It, NewOffset)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setitemoffset" /*RemoteObject*/ ,(Object)(_it),(Object)(BA.numberCast(float.class, _newoffset)));
 if (true) break;

case 51:
//C
this.state = 84;
;
 BA.debugLineNum = 379;BA.debugLine="It.Panel.Tag = i + 1";
Debug.ShouldStop(67108864);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 381;BA.debugLine="items.InsertAt(Index, NewItem)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_index),(Object)((_newitem)));
 BA.debugLineNum = 382;BA.debugLine="iData.InsertAt(Index, Data)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_idata" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_index),(Object)(_data));
 BA.debugLineNum = 383;BA.debugLine="NewItem.Offset = offset";
Debug.ShouldStop(1073741824);
_newitem.setField ("Offset" /*RemoteObject*/ ,_offset);
 BA.debugLineNum = 384;BA.debugLine="If horizontal Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 385;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
Debug.ShouldStop(1);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_initialsize),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 386;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
Debug.ShouldStop(2);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(_p.runMethod(true,"getHeight")));
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 388;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
Debug.ShouldStop(8);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_offset),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_initialsize));
 BA.debugLineNum = 390;BA.debugLine="Dim ShouldSetPanelHeight As Boolean = InitialSi";
Debug.ShouldStop(32);
_shouldsetpanelheight = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_initialsize,BA.numberCast(double.class, _itemsize)));Debug.locals.put("ShouldSetPanelHeight", _shouldsetpanelheight);Debug.locals.put("ShouldSetPanelHeight", _shouldsetpanelheight);
 BA.debugLineNum = 391;BA.debugLine="If ShouldSetPanelHeight = True Then 'collapse";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 392;BA.debugLine="Pnl.Height = InitialSize";
Debug.ShouldStop(128);
_pnl.runMethod(true,"setHeight",_initialsize);
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 394;BA.debugLine="p.SetLayoutAnimated(0, 0, offset, p.Width, Ite";
Debug.ShouldStop(512);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_offset),(Object)(_p.runMethod(true,"getWidth")),(Object)(_itemsize));
 if (true) break;

case 63:
//C
this.state = 64;
;
 BA.debugLineNum = 396;BA.debugLine="p.SendToBack";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 401;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setscrollviewcontentsize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),_itemsize,_initialsize,_includedividierheight}, "+-+",3, 0))));
 BA.debugLineNum = 402;BA.debugLine="If items.Size = 1 Then SetScrollViewContentSize(G";
Debug.ShouldStop(131072);
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
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setscrollviewcontentsize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),_includedividierheight}, "+",1, 0))));
if (true) break;

case 71:
//C
this.state = 72;
;
 BA.debugLineNum = 403;BA.debugLine="If Index < mLastVisibleIndex Or GetRawListItem(mL";
Debug.ShouldStop(262144);
if (true) break;

case 72:
//if
this.state = 75;
if (RemoteObject.solveBoolean("<",_index,BA.numberCast(double.class, __ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))).getField(true,"Offset" /*RemoteObject*/ ),__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))).getField(true,"Size" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "++",2, 0),BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )))) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 405;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(1048576);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_updatevisiblerange" /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 408;BA.debugLine="If ShouldSetPanelHeight Then";
Debug.ShouldStop(8388608);

case 75:
//if
this.state = 82;
if (_shouldsetpanelheight.<Boolean>get().booleanValue()) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 409;BA.debugLine="Sleep(AnimationDuration)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "expandedlistview", "insertatimpl"),__ref.getField(true,"_animationduration" /*RemoteObject*/ ));
this.state = 85;
return;
case 85:
//C
this.state = 78;
;
 BA.debugLineNum = 410;BA.debugLine="If p.Parent.IsInitialized Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 412;BA.debugLine="p.Height = ItemSize";
Debug.ShouldStop(134217728);
_p.runMethod(true,"setHeight",_itemsize);
 BA.debugLineNum = 413;BA.debugLine="Pnl.Height = ItemSize";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 416;BA.debugLine="End Sub";
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
public static RemoteObject  _insertattextitem(RemoteObject __ref,RemoteObject _index,RemoteObject _text,RemoteObject _value,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("InsertAtTextItem (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("insertattextitem")) { return __ref.runUserSub(false, "expandedlistview","insertattextitem", __ref, _index, _text, _value, _data);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _item = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 284;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="If horizontal Then";
Debug.ShouldStop(268435456);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 286;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
Debug.ShouldStop(536870912);
expandedlistview.__c.runVoidMethod ("LogImpl","6140312578",RemoteObject.createImmutable("AddTextItem is only supported in vertical orientation."),0);
 BA.debugLineNum = 287;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 289;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
Debug.ShouldStop(1);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_createpanel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 290;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
Debug.ShouldStop(2);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_createlabel" /*RemoteObject*/ ,(Object)(_text));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 291;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
Debug.ShouldStop(4);
_lbl.runMethod(true,"setHeight",BA.numberCast(int.class, expandedlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, expandedlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _lbl.runMethod(true,"getHeight"))))));
 BA.debugLineNum = 292;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
Debug.ShouldStop(8);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(expandedlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(expandedlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"),expandedlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(Object)(_lbl.runMethod(true,"getHeight")));
 BA.debugLineNum = 293;BA.debugLine="If xui.IsB4i = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"),expandedlistview.__c.getField(true,"False"))) { 
 BA.debugLineNum = 294;BA.debugLine="lbl.TextColor = DefaultTextColor";
Debug.ShouldStop(32);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_defaulttextcolor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 296;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
Debug.ShouldStop(128);
_pnl.runMethod(true,"setColor",__ref.getField(true,"_defaulttextbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 297;BA.debugLine="pnl.Height = lbl.Height + 2dip";
Debug.ShouldStop(256);
_pnl.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"getHeight"),expandedlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1));
 BA.debugLineNum = 298;BA.debugLine="InsertAtWithData(Index, pnl, Value, Data)";
Debug.ShouldStop(512);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertatwithdata" /*RemoteObject*/ ,(Object)(_index),(Object)(_pnl),(Object)(_value),(Object)(_data));
 BA.debugLineNum = 299;BA.debugLine="Dim item As CLVExpItem = GetRawListItem(Index)";
Debug.ShouldStop(1024);
_item = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 300;BA.debugLine="item.TextItem = True";
Debug.ShouldStop(2048);
_item.setField ("TextItem" /*RemoteObject*/ ,expandedlistview.__c.getField(true,"True"));
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
public static RemoteObject  _insertatwithdata(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _value,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("InsertAtWithData (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("insertatwithdata")) { return __ref.runUserSub(false, "expandedlistview","insertatwithdata", __ref, _index, _pnl, _value, _data);}
RemoteObject _size = RemoteObject.createImmutable(0f);
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("Value", _value);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 314;BA.debugLine="Public Sub InsertAtWithData(Index As Int, pnl As B";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="Dim size As Float";
Debug.ShouldStop(67108864);
_size = RemoteObject.createImmutable(0f);Debug.locals.put("size", _size);
 BA.debugLineNum = 316;BA.debugLine="If horizontal Then";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 317;BA.debugLine="size = pnl.Width";
Debug.ShouldStop(268435456);
_size = BA.numberCast(float.class, _pnl.runMethod(true,"getWidth"));Debug.locals.put("size", _size);
 }else {
 BA.debugLineNum = 319;BA.debugLine="size = pnl.Height";
Debug.ShouldStop(1073741824);
_size = BA.numberCast(float.class, _pnl.runMethod(true,"getHeight"));Debug.locals.put("size", _size);
 };
 BA.debugLineNum = 321;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0, Data)";
Debug.ShouldStop(1);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertatimpl" /*void*/ ,(Object)(_index),(Object)(_pnl),(Object)(BA.numberCast(int.class, _size)),(Object)(_value),(Object)(BA.numberCast(int.class, 0)),(Object)(_data));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("JumpToItem (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,517);
if (RapidSub.canDelegate("jumptoitem")) { return __ref.runUserSub(false, "expandedlistview","jumptoitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 517;BA.debugLine="Public Sub JumpToItem(Index As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 518;BA.debugLine="SetScrollViewOffset(Min(GetMaxScrollOffset, FindI";
Debug.ShouldStop(32);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setscrollviewoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, expandedlistview.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getmaxscrolloffset" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_finditemoffset" /*RemoteObject*/ ,(Object)(_index))))))));
 BA.debugLineNum = 519;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Panel_Click (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,664);
if (RapidSub.canDelegate("panel_click")) { return __ref.runUserSub(false, "expandedlistview","panel_click", __ref);}
 BA.debugLineNum = 664;BA.debugLine="Private Sub Panel_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 665;BA.debugLine="PanelClickHandler(Sender)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_panelclickhandler" /*void*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), expandedlistview.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));
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
public static void  _panelclickhandler(RemoteObject __ref,RemoteObject _senderpanel) throws Exception{
try {
		Debug.PushSubsStack("PanelClickHandler (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,594);
if (RapidSub.canDelegate("panelclickhandler")) { __ref.runUserSub(false, "expandedlistview","panelclickhandler", __ref, _senderpanel); return;}
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
public ResumableSub_PanelClickHandler(xevolution.vrcg.devdemov2400.expandedlistview parent,RemoteObject __ref,RemoteObject _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.expandedlistview parent;
RemoteObject _senderpanel;
RemoteObject _clr = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PanelClickHandler (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,594);
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
 BA.debugLineNum = 595;BA.debugLine="Dim clr As Int = GetRawListItem(SenderPanel.Tag).";
Debug.ShouldStop(262144);
_clr = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"getTag")))).getField(true,"Color" /*RemoteObject*/ );Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 596;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedColo";
Debug.ShouldStop(524288);
_senderpanel.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 50)),(Object)(_clr),(Object)(__ref.getField(true,"_pressedcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 597;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 598;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
Debug.ShouldStop(2097152);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(_senderpanel.runMethod(false,"getTag")),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getrawlistitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"getTag")))).getField(false,"Value" /*RemoteObject*/ )));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 600;BA.debugLine="Sleep(200)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "expandedlistview", "panelclickhandler"),BA.numberCast(int.class, 200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 601;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor, c";
Debug.ShouldStop(16777216);
_senderpanel.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(true,"_pressedcolor" /*RemoteObject*/ )),(Object)(_clr));
 BA.debugLineNum = 602;BA.debugLine="End Sub";
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
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "expandedlistview","refresh", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub Refresh";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="ResetVisibles";
Debug.ShouldStop(4);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_resetvisibles" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(8);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_updatevisiblerange" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("RemoveAt (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("removeat")) { return __ref.runUserSub(false, "expandedlistview","removeat", __ref, _index);}
RemoteObject _removeitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
RemoteObject _newoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 253;BA.debugLine="Public Sub RemoveAt(Index As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="If getSize <= 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("k",__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 255;BA.debugLine="Clear";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 256;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 258;BA.debugLine="Dim RemoveItem As CLVExpItem = items.Get(Index)";
Debug.ShouldStop(2);
_removeitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 259;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 260;BA.debugLine="For i = Index + 1 To items.Size - 1";
Debug.ShouldStop(8);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 261;BA.debugLine="Dim item As CLVExpItem = items.Get(i)";
Debug.ShouldStop(16);
_item = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 262;BA.debugLine="p = item.Panel";
Debug.ShouldStop(32);
_p = _item.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("p", _p);
 BA.debugLineNum = 263;BA.debugLine="p.Tag = i - 1";
Debug.ShouldStop(64);
_p.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 264;BA.debugLine="Dim NewOffset As Int = item.Offset - RemoveItem.";
Debug.ShouldStop(128);
_newoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_item.getField(true,"Offset" /*RemoteObject*/ ),_removeitem.getField(true,"Size" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "--",2, 0));Debug.locals.put("NewOffset", _newoffset);Debug.locals.put("NewOffset", _newoffset);
 BA.debugLineNum = 265;BA.debugLine="SetItemOffset(item, NewOffset)";
Debug.ShouldStop(256);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setitemoffset" /*RemoteObject*/ ,(Object)(_item),(Object)(BA.numberCast(float.class, _newoffset)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 267;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
Debug.ShouldStop(1024);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_setscrollviewcontentsize" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),_removeitem.getField(true,"Size" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "--",2, 0))));
 BA.debugLineNum = 268;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(2048);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 269;BA.debugLine="iData.RemoveAt(Index)";
Debug.ShouldStop(4096);
__ref.getField(false,"_idata" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 270;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(8192);
_removeitem.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
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
public static RemoteObject  _replaceat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ReplaceAt (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,490);
if (RapidSub.canDelegate("replaceat")) { return __ref.runUserSub(false, "expandedlistview","replaceat", __ref, _index, _pnl, _itemheight, _value);}
RemoteObject _removeitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
RemoteObject _odata = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 490;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
Debug.ShouldStop(512);
 BA.debugLineNum = 491;BA.debugLine="Dim RemoveItem As CLVExpItem = items.Get(Index)";
Debug.ShouldStop(1024);
_removeitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 492;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(2048);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 493;BA.debugLine="Dim oData As Object = iData.Get(Index)";
Debug.ShouldStop(4096);
_odata = __ref.getField(false,"_idata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index));Debug.locals.put("oData", _odata);Debug.locals.put("oData", _odata);
 BA.debugLineNum = 494;BA.debugLine="iData.RemoveAt(Index)";
Debug.ShouldStop(8192);
__ref.getField(false,"_idata" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 495;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(16384);
_removeitem.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 496;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
Debug.ShouldStop(32768);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertatimpl" /*void*/ ,(Object)(_index),(Object)(_pnl),(Object)(_itemheight),(Object)(_value),(Object)(_removeitem.getField(true,"Size" /*RemoteObject*/ )),(Object)(_odata));
 BA.debugLineNum = 497;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replaceatwithdata(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("ReplaceAtWithData (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,499);
if (RapidSub.canDelegate("replaceatwithdata")) { return __ref.runUserSub(false, "expandedlistview","replaceatwithdata", __ref, _index, _pnl, _itemheight, _value, _data);}
RemoteObject _removeitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem");
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 499;BA.debugLine="Public Sub ReplaceAtWithData(Index As Int, pnl As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 500;BA.debugLine="Dim RemoveItem As CLVExpItem = items.Get(Index)";
Debug.ShouldStop(524288);
_removeitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 501;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 502;BA.debugLine="iData.RemoveAt(Index)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_idata" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 503;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(4194304);
_removeitem.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 504;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
Debug.ShouldStop(8388608);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_insertatimpl" /*void*/ ,(Object)(_index),(Object)(_pnl),(Object)(_itemheight),(Object)(_value),(Object)(_removeitem.getField(true,"Size" /*RemoteObject*/ )),(Object)(_data));
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
public static RemoteObject  _resetvisibles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetVisibles (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("resetvisibles")) { return __ref.runUserSub(false, "expandedlistview","resetvisibles", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Private Sub ResetVisibles";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="mFirstVisibleIndex = -1";
Debug.ShouldStop(268435456);
__ref.setField ("_mfirstvisibleindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 62;BA.debugLine="mLastVisibleIndex = 0x7FFFFFFF";
Debug.ShouldStop(536870912);
__ref.setField ("_mlastvisibleindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0x7fffffff));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("ResizeItem (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,479);
if (RapidSub.canDelegate("resizeitem")) { return __ref.runUserSub(false, "expandedlistview","resizeitem", __ref, _index, _itemheight);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("ItemHeight", _itemheight);
 BA.debugLineNum = 479;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 480;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 481;BA.debugLine="Dim value As Object = GetValue(Index)";
Debug.ShouldStop(1);
_value = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 482;BA.debugLine="Dim parent As B4XView = p.Parent";
Debug.ShouldStop(2);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_parent = _p.runMethod(false,"getParent");Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 483;BA.debugLine="p.Color = parent.Color";
Debug.ShouldStop(4);
_p.runMethod(true,"setColor",_parent.runMethod(true,"getColor"));
 BA.debugLineNum = 484;BA.debugLine="p.RemoveViewFromParent";
Debug.ShouldStop(8);
_p.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 485;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
Debug.ShouldStop(16);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_replaceat" /*RemoteObject*/ ,(Object)(_index),(Object)(_p),(Object)(_itemheight),(Object)(_value));
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
public static RemoteObject  _scrollhandler(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScrollHandler (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,615);
if (RapidSub.canDelegate("scrollhandler")) { return __ref.runUserSub(false, "expandedlistview","scrollhandler", __ref);}
RemoteObject _position = RemoteObject.createImmutable(0);
 BA.debugLineNum = 615;BA.debugLine="Private Sub ScrollHandler";
Debug.ShouldStop(64);
 BA.debugLineNum = 616;BA.debugLine="If items.Size = 0 Then Return";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 617;BA.debugLine="Dim position As Int = GetScrollViewOffset";
Debug.ShouldStop(256);
_position = BA.numberCast(int.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewoffset" /*RemoteObject*/ ));Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 BA.debugLineNum = 618;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_position,__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),expandedlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0)) && RemoteObject.solveBoolean(">",expandedlistview.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastreachendevent" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "+",1, 2))) { 
 BA.debugLineNum = 619;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
Debug.ShouldStop(1024);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachEnd"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 620;BA.debugLine="LastReachEndEvent = DateTime.Now";
Debug.ShouldStop(2048);
__ref.setField ("_lastreachendevent" /*RemoteObject*/ ,expandedlistview.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 621;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
Debug.ShouldStop(4096);
expandedlistview.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachEnd"))));
 }else {
 BA.debugLineNum = 623;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
Debug.ShouldStop(16384);
__ref.setField ("_lastreachendevent" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {expandedlistview.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000),expandedlistview.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+*",1, 2));
 };
 };
 BA.debugLineNum = 626;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(131072);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_updatevisiblerange" /*RemoteObject*/ );
 BA.debugLineNum = 627;BA.debugLine="If FireScrollChanged Then";
Debug.ShouldStop(262144);
if (__ref.getField(true,"_firescrollchanged" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 628;BA.debugLine="CallSub2(CallBack, EventName & \"_ScrollChanged\",";
Debug.ShouldStop(524288);
expandedlistview.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ScrollChanged"))),(Object)((_position)));
 };
 BA.debugLineNum = 630;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ScrollToItem (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,526);
if (RapidSub.canDelegate("scrolltoitem")) { return __ref.runUserSub(false, "expandedlistview","scrolltoitem", __ref, _index);}
RemoteObject _offset = RemoteObject.createImmutable(0f);
RemoteObject _hv = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
RemoteObject _nsv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 526;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 527;BA.debugLine="Dim offset As Float = Min(GetMaxScrollOffset, Fin";
Debug.ShouldStop(16384);
_offset = BA.numberCast(float.class, expandedlistview.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getmaxscrolloffset" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_finditemoffset" /*RemoteObject*/ ,(Object)(_index))))));Debug.locals.put("offset", _offset);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 539;BA.debugLine="If horizontal Then";
Debug.ShouldStop(67108864);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 540;BA.debugLine="Dim hv As HorizontalScrollView = sv";
Debug.ShouldStop(134217728);
_hv = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
_hv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject());Debug.locals.put("hv", _hv);
 BA.debugLineNum = 541;BA.debugLine="hv.ScrollPosition = offset 'smooth scroll";
Debug.ShouldStop(268435456);
_hv.runMethod(true,"setScrollPosition",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 543;BA.debugLine="Dim nsv As ScrollView = sv";
Debug.ShouldStop(1073741824);
_nsv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
_nsv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ScrollViewWrapper"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject());Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 544;BA.debugLine="nsv.ScrollPosition = offset";
Debug.ShouldStop(-2147483648);
_nsv.runMethod(true,"setScrollPosition",BA.numberCast(int.class, _offset));
 };
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
public static RemoteObject  _setitemoffset(RemoteObject __ref,RemoteObject _item,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("SetItemOffset (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,469);
if (RapidSub.canDelegate("setitemoffset")) { return __ref.runUserSub(false, "expandedlistview","setitemoffset", __ref, _item, _offset);}
Debug.locals.put("item", _item);
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 469;BA.debugLine="Private Sub SetItemOffset (item As CLVExpItem, off";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 470;BA.debugLine="item.Offset = offset";
Debug.ShouldStop(2097152);
_item.setField ("Offset" /*RemoteObject*/ ,BA.numberCast(int.class, _offset));
 BA.debugLineNum = 471;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4194304);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 472;BA.debugLine="item.Panel.Left = offset";
Debug.ShouldStop(8388608);
_item.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 474;BA.debugLine="item.Panel.Top = offset";
Debug.ShouldStop(33554432);
_item.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("SetScrollViewContentSize (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,461);
if (RapidSub.canDelegate("setscrollviewcontentsize")) { return __ref.runUserSub(false, "expandedlistview","setscrollviewcontentsize", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 461;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 462;BA.debugLine="If horizontal Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 463;BA.debugLine="sv.ScrollViewContentWidth = f";
Debug.ShouldStop(16384);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentWidth",BA.numberCast(int.class, _f));
 }else {
 BA.debugLineNum = 465;BA.debugLine="sv.ScrollViewContentHeight = f";
Debug.ShouldStop(65536);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, _f));
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
public static RemoteObject  _setscrollviewoffset(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("SetScrollViewOffset (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,445);
if (RapidSub.canDelegate("setscrollviewoffset")) { return __ref.runUserSub(false, "expandedlistview","setscrollviewoffset", __ref, _offset);}
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 445;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 446;BA.debugLine="If horizontal Then";
Debug.ShouldStop(536870912);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 447;BA.debugLine="sv.ScrollViewOffsetX = offset";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetX",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 449;BA.debugLine="sv.ScrollViewOffsetY = offset";
Debug.ShouldStop(1);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupdowniconexists(RemoteObject __ref,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("setUpDownIconExists (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("setupdowniconexists")) { return __ref.runUserSub(false, "expandedlistview","setupdowniconexists", __ref, _val);}
Debug.locals.put("val", _val);
 BA.debugLineNum = 177;BA.debugLine="Public Sub setUpDownIconExists(val As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="mUpDownIconExists = val";
Debug.ShouldStop(131072);
__ref.setField ("_mupdowniconexists" /*RemoteObject*/ ,_val);
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupdowniconindex(RemoteObject __ref,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("setUpDownIconIndex (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("setupdowniconindex")) { return __ref.runUserSub(false, "expandedlistview","setupdowniconindex", __ref, _val);}
Debug.locals.put("val", _val);
 BA.debugLineNum = 185;BA.debugLine="Public Sub setUpDownIconIndex(val As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="mUpDownIconIndex = val";
Debug.ShouldStop(33554432);
__ref.setField ("_mupdowniconindex" /*RemoteObject*/ ,_val);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("sv_ScrollChanged (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,668);
if (RapidSub.canDelegate("sv_scrollchanged")) { return __ref.runUserSub(false, "expandedlistview","sv_scrollchanged", __ref, _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 668;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 669;BA.debugLine="ScrollHandler";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_scrollhandler" /*RemoteObject*/ );
 BA.debugLineNum = 670;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("UpdateVisibleRange (expandedlistview) ","expandedlistview",38,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("updatevisiblerange")) { return __ref.runUserSub(false, "expandedlistview","updatevisiblerange", __ref);}
RemoteObject _first = RemoteObject.createImmutable(0);
RemoteObject _last = RemoteObject.createImmutable(0);
 BA.debugLineNum = 418;BA.debugLine="Private Sub UpdateVisibleRange";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="If MonitorVisibleRange = False Or getSize = 0 The";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_monitorvisiblerange" /*RemoteObject*/ ),expandedlistview.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 420;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
Debug.ShouldStop(8);
_first = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getfirstvisibleindex" /*RemoteObject*/ );Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 421;BA.debugLine="Dim last As Int = getLastVisibleIndex";
Debug.ShouldStop(16);
_last = __ref.runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getlastvisibleindex" /*RemoteObject*/ );Debug.locals.put("last", _last);Debug.locals.put("last", _last);
 BA.debugLineNum = 422;BA.debugLine="If first <> mFirstVisibleIndex Or last <> mLastVi";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_first,BA.numberCast(double.class, __ref.getField(true,"_mfirstvisibleindex" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("!",_last,BA.numberCast(double.class, __ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 423;BA.debugLine="mFirstVisibleIndex = first";
Debug.ShouldStop(64);
__ref.setField ("_mfirstvisibleindex" /*RemoteObject*/ ,_first);
 BA.debugLineNum = 424;BA.debugLine="mLastVisibleIndex = last";
Debug.ShouldStop(128);
__ref.setField ("_mlastvisibleindex" /*RemoteObject*/ ,_last);
 BA.debugLineNum = 425;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_VisibleR";
Debug.ShouldStop(256);
expandedlistview.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VisibleRangeChanged"))),(Object)((__ref.getField(true,"_mfirstvisibleindex" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}