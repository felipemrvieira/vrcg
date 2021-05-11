package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xcombobox2_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xcombobox2","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mEventName As String 'ignore";
b4xcombobox2._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xcombobox2._meventname);
 //BA.debugLineNum = 5;BA.debugLine="Private mCallBack As Object 'ignore";
b4xcombobox2._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xcombobox2._mcallback);
 //BA.debugLineNum = 6;BA.debugLine="Private mBase As B4XView";
b4xcombobox2._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xcombobox2._mbase);
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI 'ignore";
b4xcombobox2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xcombobox2._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private cmbBox As Spinner";
b4xcombobox2._cmbbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_cmbbox",b4xcombobox2._cmbbox);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cmbbox_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CmbBox_ItemClick (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("cmbbox_itemclick")) { return __ref.runUserSub(false, "b4xcombobox2","cmbbox_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 108;BA.debugLine="Private Sub CmbBox_ItemClick (Position As Int, Val";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="RaiseEvent";
Debug.ShouldStop(4096);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xcombobox2.class, "_raiseevent" /*RemoteObject*/ );
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
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xcombobox2","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="mBase = Base";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 28;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.ShouldStop(134217728);
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 35;BA.debugLine="cmbBox.Initialize(\"cmbBox\")";
Debug.ShouldStop(4);
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cmbBox")));
 BA.debugLineNum = 36;BA.debugLine="cmbBox.TextSize = xlbl.TextSize";
Debug.ShouldStop(8);
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"setTextSize",_xlbl.runMethod(true,"getTextSize"));
 BA.debugLineNum = 37;BA.debugLine="mBase.AddView(cmbBox, 0, 0, mBase.Width, mBase.He";
Debug.ShouldStop(16);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetItem (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("getitem")) { return __ref.runUserSub(false, "b4xcombobox2","getitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 89;BA.debugLine="Public Sub GetItem(Index As Int) As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 93;BA.debugLine="Return cmbBox.GetItem(Index)";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(_index));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedIndex (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("getselectedindex")) { return __ref.runUserSub(false, "b4xcombobox2","getselectedindex", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub getSelectedIndex As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="Return cmbBox.SelectedIndex";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Initialize (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xcombobox2","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1048576);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2097152);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiseevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("raiseevent")) { return __ref.runUserSub(false, "b4xcombobox2","raiseevent", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Private Sub RaiseEvent";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndexC";
Debug.ShouldStop(8);
b4xcombobox2.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedIndexChanged"))),(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xcombobox2.class, "_getselectedindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setitems(RemoteObject __ref,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("SetItems (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setitems")) { return __ref.runUserSub(false, "b4xcombobox2","setitems", __ref, _items);}
Debug.locals.put("Items", _items);
 BA.debugLineNum = 52;BA.debugLine="Public Sub SetItems(Items As List)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 57;BA.debugLine="cmbBox.Clear";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 58;BA.debugLine="cmbBox.AddAll(Items)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(_items));
 BA.debugLineNum = 65;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_items.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (xevolution.vrcg.devdemov2400.b4xcombobox2.class, "_setselectedindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));};
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedindex(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setSelectedIndex (b4xcombobox2) ","b4xcombobox2",17,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setselectedindex")) { return __ref.runUserSub(false, "b4xcombobox2","setselectedindex", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="cmbBox.SelectedIndex = i";
Debug.ShouldStop(8192);
__ref.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_i);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
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