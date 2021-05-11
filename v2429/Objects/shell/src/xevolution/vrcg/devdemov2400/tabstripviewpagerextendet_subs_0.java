package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tabstripviewpagerextendet_subs_0 {


public static RemoteObject  _centeralltabs(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _tabstripwidth) throws Exception{
try {
		Debug.PushSubsStack("CenterAllTabs (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("centeralltabs")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","centeralltabs", __ref, _tabstrip, _tabstripwidth);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("tabstripwidth", _tabstripwidth);
 BA.debugLineNum = 347;BA.debugLine="Public Sub CenterAllTabs(tabstrip As TabStrip, tab";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 349;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(268435456);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group1 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group1.runMethod(false,"Get",index1));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 350;BA.debugLine="lbl.Width = Round(tabstripwidth/GetAllTabLabels(";
Debug.ShouldStop(536870912);
_lbl.runMethod(true,"setWidth",BA.numberCast(int.class, tabstripviewpagerextendet.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_tabstripwidth,__ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip)).runMethod(true,"getSize")}, "/",0, 0)))));
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changetabtext(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _text,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ChangeTabText (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("changetabtext")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","changetabtext", __ref, _tabstrip, _text, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("text", _text);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 111;BA.debugLine="Public Sub ChangeTabText(tabstrip As TabStrip, tex";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="Dim i As Int";
Debug.ShouldStop(65536);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 114;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(131072);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 115;BA.debugLine="If i = Position Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 117;BA.debugLine="lbl.Text = text";
Debug.ShouldStop(1048576);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 };
 BA.debugLineNum = 120;BA.debugLine="i = i + 1";
Debug.ShouldStop(8388608);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
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
public static RemoteObject  _changetabtextellipsize(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _ellipsize,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ChangeTabTextEllipsize (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("changetabtextellipsize")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","changetabtextellipsize", __ref, _tabstrip, _ellipsize, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("Ellipsize", _ellipsize);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 131;BA.debugLine="Public Sub ChangeTabTextEllipsize(tabstrip As TabS";
Debug.ShouldStop(4);
 BA.debugLineNum = 133;BA.debugLine="Dim i As Int";
Debug.ShouldStop(16);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 134;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(32);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 135;BA.debugLine="If i = Position Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 137;BA.debugLine="lbl.Ellipsize = Ellipsize";
Debug.ShouldStop(256);
_lbl.runMethod(true,"setEllipsize",_ellipsize);
 };
 BA.debugLineNum = 140;BA.debugLine="i = i + 1";
Debug.ShouldStop(2048);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dividercolor(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("DividerColor (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("dividercolor")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","dividercolor", __ref, _tabstrip, _color);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("color", _color);
 BA.debugLineNum = 50;BA.debugLine="Public Sub DividerColor(tabstrip As TabStrip, colo";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 53;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setDividerCo";
Debug.ShouldStop(1048576);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("tabStrip"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDividerColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_color)})));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalltablabels(RemoteObject __ref,RemoteObject _tabstrip) throws Exception{
try {
		Debug.PushSubsStack("GetAllTabLabels (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("getalltablabels")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","getalltablabels", __ref, _tabstrip);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _tc = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
Debug.locals.put("tabstrip", _tabstrip);
 BA.debugLineNum = 58;BA.debugLine="Public Sub GetAllTabLabels (tabstrip As TabStrip)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(67108864);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 60;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(134217728);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 61;BA.debugLine="r.Target = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(268435456);
_r.setField ("Target",_jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 62;BA.debugLine="Dim tc As Panel = r.GetField(\"tabsContainer\")";
Debug.ShouldStop(536870912);
_tc = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_tc = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabsContainer"))));Debug.locals.put("tc", _tc);
 BA.debugLineNum = 63;BA.debugLine="Dim res As List";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 64;BA.debugLine="res.Initialize";
Debug.ShouldStop(-2147483648);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="For Each v As View In tc";
Debug.ShouldStop(1);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group7 = _tc;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), group7.runMethod(false,"Get",index7));
Debug.locals.put("v", _v);
 BA.debugLineNum = 66;BA.debugLine="If v Is Label Then res.Add(v)";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.TextView"))) { 
_res.runVoidMethod ("Add",(Object)((_v.getObject())));};
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 68;BA.debugLine="Return res";
Debug.ShouldStop(8);
if (true) return _res;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabtag(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("GetTabTag (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,258);
if (RapidSub.canDelegate("gettabtag")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","gettabtag", __ref, _tabstrip, _position);}
RemoteObject _tag = RemoteObject.declareNull("Object");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("position", _position);
 BA.debugLineNum = 258;BA.debugLine="Public Sub GetTabTag(tabstrip As TabStrip, positio";
Debug.ShouldStop(2);
 BA.debugLineNum = 260;BA.debugLine="Dim tag As Object";
Debug.ShouldStop(8);
_tag = RemoteObject.createNew ("Object");Debug.locals.put("tag", _tag);
 BA.debugLineNum = 262;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 263;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(64);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group3 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group3.runMethod(false,"Get",index3));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 264;BA.debugLine="If i = position Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 266;BA.debugLine="lbl.Tag = tag";
Debug.ShouldStop(512);
_lbl.runMethod(false,"setTag",_tag);
 };
 BA.debugLineNum = 269;BA.debugLine="i = i + 1";
Debug.ShouldStop(4096);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 272;BA.debugLine="Return tag";
Debug.ShouldStop(32768);
if (true) return _tag;
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _indicatorcolor(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("IndicatorColor (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("indicatorcolor")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","indicatorcolor", __ref, _tabstrip, _color);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("color", _color);
 BA.debugLineNum = 18;BA.debugLine="Public Sub IndicatorColor(tabstrip As TabStrip, co";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 21;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setIndicator";
Debug.ShouldStop(1048576);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("tabStrip"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndicatorColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_color)})));
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
public static RemoteObject  _indicatorheight(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("IndicatorHeight (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("indicatorheight")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","indicatorheight", __ref, _tabstrip, _height);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("height", _height);
 BA.debugLineNum = 26;BA.debugLine="Public Sub IndicatorHeight(tabstrip As TabStrip, h";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(134217728);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 29;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setIndicator";
Debug.ShouldStop(268435456);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("tabStrip"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndicatorHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_height)})));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertpage(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _index,RemoteObject _page,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("InsertPage (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("insertpage")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","insertpage", __ref, _tabstrip, _index, _page, _title);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("Index", _index);
Debug.locals.put("Page", _page);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 322;BA.debugLine="Public Sub InsertPage (tabstrip As TabStrip, Index";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(4);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 324;BA.debugLine="jo.GetFieldJO(\"pages\").RunMethod(\"add\", Array(Ind";
Debug.ShouldStop(8);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("pages"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("add")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_index),(_page.getObject())})));
 BA.debugLineNum = 325;BA.debugLine="jo.GetFieldJO(\"titles\").RunMethod(\"add\", Array(In";
Debug.ShouldStop(16);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("titles"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("add")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_index),(_title)})));
 BA.debugLineNum = 326;BA.debugLine="RefreshTabStrip(tabstrip)";
Debug.ShouldStop(32);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_refreshtabstrip" /*RemoteObject*/ ,(Object)(_tabstrip));
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshtabstrip(RemoteObject __ref,RemoteObject _tabstrip) throws Exception{
try {
		Debug.PushSubsStack("RefreshTabStrip (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,339);
if (RapidSub.canDelegate("refreshtabstrip")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","refreshtabstrip", __ref, _tabstrip);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("tabstrip", _tabstrip);
 BA.debugLineNum = 339;BA.debugLine="Public Sub RefreshTabStrip(tabstrip As TabStrip)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 340;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 341;BA.debugLine="jo.RunMethod(\"resetAdapter\", Null)";
Debug.ShouldStop(1048576);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("resetAdapter")),(Object)((tabstripviewpagerextendet.__c.getField(false,"Null"))));
 BA.debugLineNum = 342;BA.debugLine="jo.GetFieldJO(\"vp\").RunMethodJO(\"getAdapter\", Nul";
Debug.ShouldStop(2097152);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("vp"))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getAdapter")),(Object)((tabstripviewpagerextendet.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("notifyDataSetChanged")),(Object)((tabstripviewpagerextendet.__c.getField(false,"Null"))));
 BA.debugLineNum = 343;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"notifyDataSe";
Debug.ShouldStop(4194304);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("tabStrip"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("notifyDataSetChanged")),(Object)((tabstripviewpagerextendet.__c.getField(false,"Null"))));
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removepage(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemovePage (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("removepage")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","removepage", __ref, _tabstrip, _index);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 330;BA.debugLine="Public Sub RemovePage (tabstrip As TabStrip, Index";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="If tabstrip.CurrentPage >= Index Then tabstrip.Sc";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("g",_tabstrip.runMethod(true,"getCurrentPage"),BA.numberCast(double.class, _index))) { 
_tabstrip.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 0)),(Object)(tabstripviewpagerextendet.__c.getField(true,"False")));};
 BA.debugLineNum = 332;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 333;BA.debugLine="Dim p As Panel = jo.GetFieldJO(\"pages\").RunMethod";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("pages"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("remove")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_index)}))));Debug.locals.put("p", _p);
 BA.debugLineNum = 334;BA.debugLine="jo.GetFieldJO(\"titles\").RunMethod(\"remove\", Array";
Debug.ShouldStop(8192);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("titles"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("remove")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_index)})));
 BA.debugLineNum = 335;BA.debugLine="RefreshTabStrip (tabstrip)";
Debug.ShouldStop(16384);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_refreshtabstrip" /*RemoteObject*/ ,(Object)(_tabstrip));
 BA.debugLineNum = 336;BA.debugLine="Return p";
Debug.ShouldStop(32768);
if (true) return _p;
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabheight(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _height,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("SetTabHeight (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("settabheight")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","settabheight", __ref, _tabstrip, _height, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("height", _height);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 184;BA.debugLine="Public Sub SetTabHeight(tabstrip As TabStrip,heigh";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 186;BA.debugLine="Dim i As Int";
Debug.ShouldStop(33554432);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 187;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(67108864);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 188;BA.debugLine="If i = Position Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 190;BA.debugLine="lbl.Height = height";
Debug.ShouldStop(536870912);
_lbl.runMethod(true,"setHeight",_height);
 };
 BA.debugLineNum = 193;BA.debugLine="i = i + 1";
Debug.ShouldStop(1);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settableft(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _left,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("SetTabLeft (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("settableft")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","settableft", __ref, _tabstrip, _left, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("left", _left);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 199;BA.debugLine="Public Sub SetTabLeft(tabstrip As TabStrip,left As";
Debug.ShouldStop(64);
 BA.debugLineNum = 201;BA.debugLine="Dim i As Int";
Debug.ShouldStop(256);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 202;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(512);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 203;BA.debugLine="If i = Position Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 205;BA.debugLine="lbl.Left = left";
Debug.ShouldStop(4096);
_lbl.runMethod(true,"setLeft",_left);
 };
 BA.debugLineNum = 208;BA.debugLine="i = i + 1";
Debug.ShouldStop(32768);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabpadding(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _padding,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("SetTabPadding (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("settabpadding")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","settabpadding", __ref, _tabstrip, _padding, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("padding", _padding);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 214;BA.debugLine="Public Sub SetTabPadding(tabstrip As TabStrip,padd";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 216;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8388608);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 217;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(16777216);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 218;BA.debugLine="If i = Position Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 220;BA.debugLine="lbl.Padding = padding";
Debug.ShouldStop(134217728);
_lbl.runMethod(false,"setPadding",_padding);
 };
 BA.debugLineNum = 223;BA.debugLine="i = i + 1";
Debug.ShouldStop(1073741824);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabsingleline(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _singleline,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("SetTabSingleline (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("settabsingleline")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","settabsingleline", __ref, _tabstrip, _singleline, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("singleline", _singleline);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 228;BA.debugLine="Public Sub SetTabSingleline(tabstrip As TabStrip,s";
Debug.ShouldStop(8);
 BA.debugLineNum = 230;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 231;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(64);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 232;BA.debugLine="If i = Position Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 234;BA.debugLine="lbl.SingleLine = singleline";
Debug.ShouldStop(512);
_lbl.runVoidMethod ("setSingleLine",_singleline);
 };
 BA.debugLineNum = 237;BA.debugLine="i = i + 1";
Debug.ShouldStop(4096);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabtag(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _tag,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("SetTabTag (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("settabtag")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","settabtag", __ref, _tabstrip, _tag, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("Tag", _tag);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 243;BA.debugLine="Public Sub SetTabTag(tabstrip As TabStrip,Tag As O";
Debug.ShouldStop(262144);
 BA.debugLineNum = 245;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1048576);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 246;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(2097152);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 247;BA.debugLine="If i = Position Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 249;BA.debugLine="lbl.Tag = Tag";
Debug.ShouldStop(16777216);
_lbl.runMethod(false,"setTag",_tag);
 };
 BA.debugLineNum = 252;BA.debugLine="i = i + 1";
Debug.ShouldStop(134217728);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextgravity(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _gravitys,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("SetTextGravity (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("settextgravity")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","settextgravity", __ref, _tabstrip, _gravitys, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("gravitys", _gravitys);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 169;BA.debugLine="Public Sub SetTextGravity(tabstrip As TabStrip,gra";
Debug.ShouldStop(256);
 BA.debugLineNum = 171;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1024);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 172;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(2048);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 173;BA.debugLine="If i = Position Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 175;BA.debugLine="lbl.Gravity = gravitys";
Debug.ShouldStop(16384);
_lbl.runMethod(true,"setGravity",_gravitys);
 };
 BA.debugLineNum = 178;BA.debugLine="i = i + 1";
Debug.ShouldStop(131072);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypefaces(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _typefaces,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("SetTypeFaces (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("settypefaces")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","settypefaces", __ref, _tabstrip, _typefaces, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("TypeFaces", _typefaces);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 152;BA.debugLine="Public Sub SetTypeFaces(tabstrip As TabStrip,TypeF";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 155;BA.debugLine="Dim i As Int";
Debug.ShouldStop(67108864);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 156;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(134217728);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 157;BA.debugLine="If i = Position Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 159;BA.debugLine="lbl.Typeface = TypeFaces";
Debug.ShouldStop(1073741824);
_lbl.runMethod(false,"setTypeface",(_typefaces.getObject()));
 };
 BA.debugLineNum = 162;BA.debugLine="i = i + 1";
Debug.ShouldStop(2);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabbackgroundcolor(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _colorselected,RemoteObject _colorinactive,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("TabBackgroundColor (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("tabbackgroundcolor")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","tabbackgroundcolor", __ref, _tabstrip, _colorselected, _colorinactive, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("colorSelected", _colorselected);
Debug.locals.put("colorInactive", _colorinactive);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 96;BA.debugLine="Public Sub TabBackgroundColor(tabstrip As TabStrip";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 99;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(4);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 100;BA.debugLine="If i = Position Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 101;BA.debugLine="lbl.Color = colorSelected";
Debug.ShouldStop(16);
_lbl.runVoidMethod ("setColor",_colorselected);
 }else {
 BA.debugLineNum = 103;BA.debugLine="lbl.Color = colorInactive";
Debug.ShouldStop(64);
_lbl.runVoidMethod ("setColor",_colorinactive);
 };
 BA.debugLineNum = 105;BA.debugLine="i = i + 1";
Debug.ShouldStop(256);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabtextcolor(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _colorselected,RemoteObject _colorinactive,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("TabTextColor (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("tabtextcolor")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","tabtextcolor", __ref, _tabstrip, _colorselected, _colorinactive, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("colorSelected", _colorselected);
Debug.locals.put("colorInactive", _colorinactive);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 77;BA.debugLine="Public Sub TabTextColor(tabstrip As TabStrip, colo";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="Dim i As Int";
Debug.ShouldStop(16384);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 80;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(32768);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 81;BA.debugLine="If i = Position Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 82;BA.debugLine="lbl.TextColor = colorSelected";
Debug.ShouldStop(131072);
_lbl.runMethod(true,"setTextColor",_colorselected);
 }else {
 BA.debugLineNum = 84;BA.debugLine="lbl.TextColor = colorInactive";
Debug.ShouldStop(524288);
_lbl.runMethod(true,"setTextColor",_colorinactive);
 };
 BA.debugLineNum = 86;BA.debugLine="i = i + 1";
Debug.ShouldStop(2097152);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabtop(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _top,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("TabTop (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("tabtop")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","tabtop", __ref, _tabstrip, _top, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("Top", _top);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 276;BA.debugLine="Public Sub TabTop(tabstrip As TabStrip,Top As Int,";
Debug.ShouldStop(524288);
 BA.debugLineNum = 278;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2097152);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 279;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 280;BA.debugLine="If i = Position Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 282;BA.debugLine="lbl.Top = Top";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setTop",_top);
 };
 BA.debugLineNum = 285;BA.debugLine="i = i + 1";
Debug.ShouldStop(268435456);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabvisible(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _visible,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("TabVisible (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("tabvisible")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","tabvisible", __ref, _tabstrip, _visible, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("Visible", _visible);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 307;BA.debugLine="Public Sub TabVisible(tabstrip As TabStrip,Visible";
Debug.ShouldStop(262144);
 BA.debugLineNum = 309;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1048576);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 310;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(2097152);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 311;BA.debugLine="If i = Position Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 313;BA.debugLine="lbl.Visible = Visible";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setVisible",_visible);
 };
 BA.debugLineNum = 316;BA.debugLine="i = i + 1";
Debug.ShouldStop(134217728);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabwidth(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _width,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("TabWidth (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("tabwidth")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","tabwidth", __ref, _tabstrip, _width, _position);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("Width", _width);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 292;BA.debugLine="Public Sub TabWidth(tabstrip As TabStrip,Width As";
Debug.ShouldStop(8);
 BA.debugLineNum = 294;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 295;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
Debug.ShouldStop(64);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_getalltablabels" /*RemoteObject*/ ,(Object)(_tabstrip));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 296;BA.debugLine="If i = Position Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, _position))) { 
 BA.debugLineNum = 298;BA.debugLine="lbl.Width = Width";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setWidth",_width);
 };
 BA.debugLineNum = 301;BA.debugLine="i = i + 1";
Debug.ShouldStop(4096);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _underlinecolor(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("UnderlineColor (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("underlinecolor")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","underlinecolor", __ref, _tabstrip, _color);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("color", _color);
 BA.debugLineNum = 34;BA.debugLine="Public Sub UnderlineColor(tabstrip As TabStrip, co";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(8);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 37;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setUnderline";
Debug.ShouldStop(16);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("tabStrip"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setUnderlineColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_color)})));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _underlineheight(RemoteObject __ref,RemoteObject _tabstrip,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("UnderlineHeight (tabstripviewpagerextendet) ","tabstripviewpagerextendet",58,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("underlineheight")) { return __ref.runUserSub(false, "tabstripviewpagerextendet","underlineheight", __ref, _tabstrip, _height);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("tabstrip", _tabstrip);
Debug.locals.put("height", _height);
 BA.debugLineNum = 42;BA.debugLine="Public Sub UnderlineHeight(tabstrip As TabStrip, h";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 45;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setUnderline";
Debug.ShouldStop(4096);
_jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("tabStrip"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setUnderlineHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_height)})));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}