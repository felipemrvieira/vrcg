package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tabstripviewpagerextendet extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.tabstripviewpagerextendet");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.encoding _encoding = null;
public b4a.example.esc_pos _esc_pos = null;
public xevolution.vrcg.devdemov2400.main _main = null;
public xevolution.vrcg.devdemov2400.starter _starter = null;
public xevolution.vrcg.devdemov2400.comms _comms = null;
public xevolution.vrcg.devdemov2400.utils _utils = null;
public xevolution.vrcg.devdemov2400.dbstructures _dbstructures = null;
public xevolution.vrcg.devdemov2400.sharecode _sharecode = null;
public xevolution.vrcg.devdemov2400.mainmenu _mainmenu = null;
public xevolution.vrcg.devdemov2400.imageedit _imageedit = null;
public xevolution.vrcg.devdemov2400.checklist3 _checklist3 = null;
public xevolution.vrcg.devdemov2400.locationservice _locationservice = null;
public xevolution.vrcg.devdemov2400.dataupdate _dataupdate = null;
public xevolution.vrcg.devdemov2400.alerts _alerts = null;
public xevolution.vrcg.devdemov2400.backgroundupdateservice _backgroundupdateservice = null;
public xevolution.vrcg.devdemov2400.barcodescanner _barcodescanner = null;
public xevolution.vrcg.devdemov2400.cameraactivity _cameraactivity = null;
public xevolution.vrcg.devdemov2400.cameraactivity_innershot _cameraactivity_innershot = null;
public xevolution.vrcg.devdemov2400.cameraactivity2 _cameraactivity2 = null;
public xevolution.vrcg.devdemov2400.checklistnew _checklistnew = null;
public xevolution.vrcg.devdemov2400.common _common = null;
public xevolution.vrcg.devdemov2400.consts _consts = null;
public xevolution.vrcg.devdemov2400.dbutils _dbutils = null;
public xevolution.vrcg.devdemov2400.helpdescriptors _helpdescriptors = null;
public xevolution.vrcg.devdemov2400.logs _logs = null;
public xevolution.vrcg.devdemov2400.mapsactivity _mapsactivity = null;
public xevolution.vrcg.devdemov2400.newsync _newsync = null;
public xevolution.vrcg.devdemov2400.notas _notas = null;
public xevolution.vrcg.devdemov2400.objectedit _objectedit = null;
public xevolution.vrcg.devdemov2400.objects _objects = null;
public xevolution.vrcg.devdemov2400.report _report = null;
public xevolution.vrcg.devdemov2400.reportview _reportview = null;
public xevolution.vrcg.devdemov2400.requests3 _requests3 = null;
public xevolution.vrcg.devdemov2400.signaturecapture _signaturecapture = null;
public xevolution.vrcg.devdemov2400.structures _structures = null;
public xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public xevolution.vrcg.devdemov2400.types _types = null;
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=180289536;
 //BA.debugLineNum = 180289536;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=180289538;
 //BA.debugLineNum = 180289538;BA.debugLine="End Sub";
return "";
}
public String  _changetabtext(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,String _text,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "changetabtext", false))
	 {return ((String) Debug.delegate(ba, "changetabtext", new Object[] {_tabstrip,_text,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=180879360;
 //BA.debugLineNum = 180879360;BA.debugLine="Public Sub ChangeTabText(tabstrip As TabStrip, tex";
RDebugUtils.currentLine=180879362;
 //BA.debugLineNum = 180879362;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=180879363;
 //BA.debugLineNum = 180879363;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=180879364;
 //BA.debugLineNum = 180879364;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=180879366;
 //BA.debugLineNum = 180879366;BA.debugLine="lbl.Text = text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 };
RDebugUtils.currentLine=180879369;
 //BA.debugLineNum = 180879369;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=180879372;
 //BA.debugLineNum = 180879372;BA.debugLine="End Sub";
return "";
}
public String  _centeralltabs(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _tabstripwidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "centeralltabs", false))
	 {return ((String) Debug.delegate(ba, "centeralltabs", new Object[] {_tabstrip,_tabstripwidth}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181927936;
 //BA.debugLineNum = 181927936;BA.debugLine="Public Sub CenterAllTabs(tabstrip As TabStrip, tab";
RDebugUtils.currentLine=181927938;
 //BA.debugLineNum = 181927938;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group1.Get(index1)));
RDebugUtils.currentLine=181927939;
 //BA.debugLineNum = 181927939;BA.debugLine="lbl.Width = Round(tabstripwidth/GetAllTabLabels(";
_lbl.setWidth((int) (__c.Round(_tabstripwidth/(double)__ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip).getSize())));
 }
};
RDebugUtils.currentLine=181927942;
 //BA.debugLineNum = 181927942;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getalltablabels(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "getalltablabels", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getalltablabels", new Object[] {_tabstrip}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.PanelWrapper _tc = null;
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
RDebugUtils.currentLine=180682752;
 //BA.debugLineNum = 180682752;BA.debugLine="Public Sub GetAllTabLabels (tabstrip As TabStrip)";
RDebugUtils.currentLine=180682753;
 //BA.debugLineNum = 180682753;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=180682754;
 //BA.debugLineNum = 180682754;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=180682755;
 //BA.debugLineNum = 180682755;BA.debugLine="r.Target = jo.GetField(\"tabStrip\")";
_r.Target = _jo.GetField("tabStrip");
RDebugUtils.currentLine=180682756;
 //BA.debugLineNum = 180682756;BA.debugLine="Dim tc As Panel = r.GetField(\"tabsContainer\")";
_tc = new anywheresoftware.b4a.objects.PanelWrapper();
_tc = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_r.GetField("tabsContainer")));
RDebugUtils.currentLine=180682757;
 //BA.debugLineNum = 180682757;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=180682758;
 //BA.debugLineNum = 180682758;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=180682759;
 //BA.debugLineNum = 180682759;BA.debugLine="For Each v As View In tc";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tc;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group7.Get(index7)));
RDebugUtils.currentLine=180682760;
 //BA.debugLineNum = 180682760;BA.debugLine="If v Is Label Then res.Add(v)";
if (_v.getObjectOrNull() instanceof android.widget.TextView) { 
_res.Add((Object)(_v.getObject()));};
 }
};
RDebugUtils.currentLine=180682762;
 //BA.debugLineNum = 180682762;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=180682764;
 //BA.debugLineNum = 180682764;BA.debugLine="End Sub";
return null;
}
public String  _changetabtextellipsize(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,String _ellipsize,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "changetabtextellipsize", false))
	 {return ((String) Debug.delegate(ba, "changetabtextellipsize", new Object[] {_tabstrip,_ellipsize,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=180944896;
 //BA.debugLineNum = 180944896;BA.debugLine="Public Sub ChangeTabTextEllipsize(tabstrip As TabS";
RDebugUtils.currentLine=180944898;
 //BA.debugLineNum = 180944898;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=180944899;
 //BA.debugLineNum = 180944899;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=180944900;
 //BA.debugLineNum = 180944900;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=180944902;
 //BA.debugLineNum = 180944902;BA.debugLine="lbl.Ellipsize = Ellipsize";
_lbl.setEllipsize(_ellipsize);
 };
RDebugUtils.currentLine=180944905;
 //BA.debugLineNum = 180944905;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=180944908;
 //BA.debugLineNum = 180944908;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
RDebugUtils.currentLine=180224000;
 //BA.debugLineNum = 180224000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=180224002;
 //BA.debugLineNum = 180224002;BA.debugLine="End Sub";
return "";
}
public String  _dividercolor(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "dividercolor", false))
	 {return ((String) Debug.delegate(ba, "dividercolor", new Object[] {_tabstrip,_color}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=180617216;
 //BA.debugLineNum = 180617216;BA.debugLine="Public Sub DividerColor(tabstrip As TabStrip, colo";
RDebugUtils.currentLine=180617218;
 //BA.debugLineNum = 180617218;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=180617219;
 //BA.debugLineNum = 180617219;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setDividerCo";
_jo.GetFieldJO("tabStrip").RunMethod("setDividerColor",new Object[]{(Object)(_color)});
RDebugUtils.currentLine=180617221;
 //BA.debugLineNum = 180617221;BA.debugLine="End Sub";
return "";
}
public Object  _gettabtag(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "gettabtag", false))
	 {return ((Object) Debug.delegate(ba, "gettabtag", new Object[] {_tabstrip,_position}));}
Object _tag = null;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181469184;
 //BA.debugLineNum = 181469184;BA.debugLine="Public Sub GetTabTag(tabstrip As TabStrip, positio";
RDebugUtils.currentLine=181469186;
 //BA.debugLineNum = 181469186;BA.debugLine="Dim tag As Object";
_tag = new Object();
RDebugUtils.currentLine=181469188;
 //BA.debugLineNum = 181469188;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181469189;
 //BA.debugLineNum = 181469189;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group3.Get(index3)));
RDebugUtils.currentLine=181469190;
 //BA.debugLineNum = 181469190;BA.debugLine="If i = position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181469192;
 //BA.debugLineNum = 181469192;BA.debugLine="lbl.Tag = tag";
_lbl.setTag(_tag);
 };
RDebugUtils.currentLine=181469195;
 //BA.debugLineNum = 181469195;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181469198;
 //BA.debugLineNum = 181469198;BA.debugLine="Return tag";
if (true) return _tag;
RDebugUtils.currentLine=181469199;
 //BA.debugLineNum = 181469199;BA.debugLine="End Sub";
return null;
}
public String  _indicatorcolor(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "indicatorcolor", false))
	 {return ((String) Debug.delegate(ba, "indicatorcolor", new Object[] {_tabstrip,_color}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=180355072;
 //BA.debugLineNum = 180355072;BA.debugLine="Public Sub IndicatorColor(tabstrip As TabStrip, co";
RDebugUtils.currentLine=180355074;
 //BA.debugLineNum = 180355074;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=180355075;
 //BA.debugLineNum = 180355075;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setIndicator";
_jo.GetFieldJO("tabStrip").RunMethod("setIndicatorColor",new Object[]{(Object)(_color)});
RDebugUtils.currentLine=180355077;
 //BA.debugLineNum = 180355077;BA.debugLine="End Sub";
return "";
}
public String  _indicatorheight(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "indicatorheight", false))
	 {return ((String) Debug.delegate(ba, "indicatorheight", new Object[] {_tabstrip,_height}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=180420608;
 //BA.debugLineNum = 180420608;BA.debugLine="Public Sub IndicatorHeight(tabstrip As TabStrip, h";
RDebugUtils.currentLine=180420610;
 //BA.debugLineNum = 180420610;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=180420611;
 //BA.debugLineNum = 180420611;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setIndicator";
_jo.GetFieldJO("tabStrip").RunMethod("setIndicatorHeight",new Object[]{(Object)(_height)});
RDebugUtils.currentLine=180420613;
 //BA.debugLineNum = 180420613;BA.debugLine="End Sub";
return "";
}
public String  _insertpage(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _index,anywheresoftware.b4a.objects.PanelWrapper _page,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "insertpage", false))
	 {return ((String) Debug.delegate(ba, "insertpage", new Object[] {_tabstrip,_index,_page,_title}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=181731328;
 //BA.debugLineNum = 181731328;BA.debugLine="Public Sub InsertPage (tabstrip As TabStrip, Index";
RDebugUtils.currentLine=181731329;
 //BA.debugLineNum = 181731329;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=181731330;
 //BA.debugLineNum = 181731330;BA.debugLine="jo.GetFieldJO(\"pages\").RunMethod(\"add\", Array(Ind";
_jo.GetFieldJO("pages").RunMethod("add",new Object[]{(Object)(_index),(Object)(_page.getObject())});
RDebugUtils.currentLine=181731331;
 //BA.debugLineNum = 181731331;BA.debugLine="jo.GetFieldJO(\"titles\").RunMethod(\"add\", Array(In";
_jo.GetFieldJO("titles").RunMethod("add",new Object[]{(Object)(_index),(Object)(_title)});
RDebugUtils.currentLine=181731332;
 //BA.debugLineNum = 181731332;BA.debugLine="RefreshTabStrip(tabstrip)";
__ref._refreshtabstrip /*String*/ (null,_tabstrip);
RDebugUtils.currentLine=181731333;
 //BA.debugLineNum = 181731333;BA.debugLine="End Sub";
return "";
}
public String  _refreshtabstrip(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "refreshtabstrip", false))
	 {return ((String) Debug.delegate(ba, "refreshtabstrip", new Object[] {_tabstrip}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=181862400;
 //BA.debugLineNum = 181862400;BA.debugLine="Public Sub RefreshTabStrip(tabstrip As TabStrip)";
RDebugUtils.currentLine=181862401;
 //BA.debugLineNum = 181862401;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=181862402;
 //BA.debugLineNum = 181862402;BA.debugLine="jo.RunMethod(\"resetAdapter\", Null)";
_jo.RunMethod("resetAdapter",(Object[])(__c.Null));
RDebugUtils.currentLine=181862403;
 //BA.debugLineNum = 181862403;BA.debugLine="jo.GetFieldJO(\"vp\").RunMethodJO(\"getAdapter\", Nul";
_jo.GetFieldJO("vp").RunMethodJO("getAdapter",(Object[])(__c.Null)).RunMethod("notifyDataSetChanged",(Object[])(__c.Null));
RDebugUtils.currentLine=181862404;
 //BA.debugLineNum = 181862404;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"notifyDataSe";
_jo.GetFieldJO("tabStrip").RunMethod("notifyDataSetChanged",(Object[])(__c.Null));
RDebugUtils.currentLine=181862405;
 //BA.debugLineNum = 181862405;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _removepage(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "removepage", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "removepage", new Object[] {_tabstrip,_index}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=181796864;
 //BA.debugLineNum = 181796864;BA.debugLine="Public Sub RemovePage (tabstrip As TabStrip, Index";
RDebugUtils.currentLine=181796865;
 //BA.debugLineNum = 181796865;BA.debugLine="If tabstrip.CurrentPage >= Index Then tabstrip.Sc";
if (_tabstrip.getCurrentPage()>=_index) { 
_tabstrip.ScrollTo((int) (0),__c.False);};
RDebugUtils.currentLine=181796866;
 //BA.debugLineNum = 181796866;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=181796867;
 //BA.debugLineNum = 181796867;BA.debugLine="Dim p As Panel = jo.GetFieldJO(\"pages\").RunMethod";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_jo.GetFieldJO("pages").RunMethod("remove",new Object[]{(Object)(_index)})));
RDebugUtils.currentLine=181796868;
 //BA.debugLineNum = 181796868;BA.debugLine="jo.GetFieldJO(\"titles\").RunMethod(\"remove\", Array";
_jo.GetFieldJO("titles").RunMethod("remove",new Object[]{(Object)(_index)});
RDebugUtils.currentLine=181796869;
 //BA.debugLineNum = 181796869;BA.debugLine="RefreshTabStrip (tabstrip)";
__ref._refreshtabstrip /*String*/ (null,_tabstrip);
RDebugUtils.currentLine=181796870;
 //BA.debugLineNum = 181796870;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=181796871;
 //BA.debugLineNum = 181796871;BA.debugLine="End Sub";
return null;
}
public String  _settabheight(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _height,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "settabheight", false))
	 {return ((String) Debug.delegate(ba, "settabheight", new Object[] {_tabstrip,_height,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181141504;
 //BA.debugLineNum = 181141504;BA.debugLine="Public Sub SetTabHeight(tabstrip As TabStrip,heigh";
RDebugUtils.currentLine=181141506;
 //BA.debugLineNum = 181141506;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181141507;
 //BA.debugLineNum = 181141507;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181141508;
 //BA.debugLineNum = 181141508;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181141510;
 //BA.debugLineNum = 181141510;BA.debugLine="lbl.Height = height";
_lbl.setHeight(_height);
 };
RDebugUtils.currentLine=181141513;
 //BA.debugLineNum = 181141513;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181141516;
 //BA.debugLineNum = 181141516;BA.debugLine="End Sub";
return "";
}
public String  _settableft(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _left,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "settableft", false))
	 {return ((String) Debug.delegate(ba, "settableft", new Object[] {_tabstrip,_left,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181207040;
 //BA.debugLineNum = 181207040;BA.debugLine="Public Sub SetTabLeft(tabstrip As TabStrip,left As";
RDebugUtils.currentLine=181207042;
 //BA.debugLineNum = 181207042;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181207043;
 //BA.debugLineNum = 181207043;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181207044;
 //BA.debugLineNum = 181207044;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181207046;
 //BA.debugLineNum = 181207046;BA.debugLine="lbl.Left = left";
_lbl.setLeft(_left);
 };
RDebugUtils.currentLine=181207049;
 //BA.debugLineNum = 181207049;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181207052;
 //BA.debugLineNum = 181207052;BA.debugLine="End Sub";
return "";
}
public String  _settabpadding(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int[] _padding,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "settabpadding", false))
	 {return ((String) Debug.delegate(ba, "settabpadding", new Object[] {_tabstrip,_padding,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181272576;
 //BA.debugLineNum = 181272576;BA.debugLine="Public Sub SetTabPadding(tabstrip As TabStrip,padd";
RDebugUtils.currentLine=181272578;
 //BA.debugLineNum = 181272578;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181272579;
 //BA.debugLineNum = 181272579;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181272580;
 //BA.debugLineNum = 181272580;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181272582;
 //BA.debugLineNum = 181272582;BA.debugLine="lbl.Padding = padding";
_lbl.setPadding(_padding);
 };
RDebugUtils.currentLine=181272585;
 //BA.debugLineNum = 181272585;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181272588;
 //BA.debugLineNum = 181272588;BA.debugLine="End Sub";
return "";
}
public String  _settabsingleline(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,boolean _singleline,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "settabsingleline", false))
	 {return ((String) Debug.delegate(ba, "settabsingleline", new Object[] {_tabstrip,_singleline,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181338112;
 //BA.debugLineNum = 181338112;BA.debugLine="Public Sub SetTabSingleline(tabstrip As TabStrip,s";
RDebugUtils.currentLine=181338114;
 //BA.debugLineNum = 181338114;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181338115;
 //BA.debugLineNum = 181338115;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181338116;
 //BA.debugLineNum = 181338116;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181338118;
 //BA.debugLineNum = 181338118;BA.debugLine="lbl.SingleLine = singleline";
_lbl.setSingleLine(_singleline);
 };
RDebugUtils.currentLine=181338121;
 //BA.debugLineNum = 181338121;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181338124;
 //BA.debugLineNum = 181338124;BA.debugLine="End Sub";
return "";
}
public String  _settabtag(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,Object _tag,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "settabtag", false))
	 {return ((String) Debug.delegate(ba, "settabtag", new Object[] {_tabstrip,_tag,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181403648;
 //BA.debugLineNum = 181403648;BA.debugLine="Public Sub SetTabTag(tabstrip As TabStrip,Tag As O";
RDebugUtils.currentLine=181403650;
 //BA.debugLineNum = 181403650;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181403651;
 //BA.debugLineNum = 181403651;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181403652;
 //BA.debugLineNum = 181403652;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181403654;
 //BA.debugLineNum = 181403654;BA.debugLine="lbl.Tag = Tag";
_lbl.setTag(_tag);
 };
RDebugUtils.currentLine=181403657;
 //BA.debugLineNum = 181403657;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181403660;
 //BA.debugLineNum = 181403660;BA.debugLine="End Sub";
return "";
}
public String  _settextgravity(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _gravitys,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "settextgravity", false))
	 {return ((String) Debug.delegate(ba, "settextgravity", new Object[] {_tabstrip,_gravitys,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181075968;
 //BA.debugLineNum = 181075968;BA.debugLine="Public Sub SetTextGravity(tabstrip As TabStrip,gra";
RDebugUtils.currentLine=181075970;
 //BA.debugLineNum = 181075970;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181075971;
 //BA.debugLineNum = 181075971;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181075972;
 //BA.debugLineNum = 181075972;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181075974;
 //BA.debugLineNum = 181075974;BA.debugLine="lbl.Gravity = gravitys";
_lbl.setGravity(_gravitys);
 };
RDebugUtils.currentLine=181075977;
 //BA.debugLineNum = 181075977;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181075980;
 //BA.debugLineNum = 181075980;BA.debugLine="End Sub";
return "";
}
public String  _settypefaces(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _typefaces,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "settypefaces", false))
	 {return ((String) Debug.delegate(ba, "settypefaces", new Object[] {_tabstrip,_typefaces,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181010432;
 //BA.debugLineNum = 181010432;BA.debugLine="Public Sub SetTypeFaces(tabstrip As TabStrip,TypeF";
RDebugUtils.currentLine=181010435;
 //BA.debugLineNum = 181010435;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181010436;
 //BA.debugLineNum = 181010436;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181010437;
 //BA.debugLineNum = 181010437;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181010439;
 //BA.debugLineNum = 181010439;BA.debugLine="lbl.Typeface = TypeFaces";
_lbl.setTypeface((android.graphics.Typeface)(_typefaces.getObject()));
 };
RDebugUtils.currentLine=181010442;
 //BA.debugLineNum = 181010442;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181010446;
 //BA.debugLineNum = 181010446;BA.debugLine="End Sub";
return "";
}
public String  _tabbackgroundcolor(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _colorselected,int _colorinactive,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "tabbackgroundcolor", false))
	 {return ((String) Debug.delegate(ba, "tabbackgroundcolor", new Object[] {_tabstrip,_colorselected,_colorinactive,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=180813824;
 //BA.debugLineNum = 180813824;BA.debugLine="Public Sub TabBackgroundColor(tabstrip As TabStrip";
RDebugUtils.currentLine=180813826;
 //BA.debugLineNum = 180813826;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=180813827;
 //BA.debugLineNum = 180813827;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=180813828;
 //BA.debugLineNum = 180813828;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=180813829;
 //BA.debugLineNum = 180813829;BA.debugLine="lbl.Color = colorSelected";
_lbl.setColor(_colorselected);
 }else {
RDebugUtils.currentLine=180813831;
 //BA.debugLineNum = 180813831;BA.debugLine="lbl.Color = colorInactive";
_lbl.setColor(_colorinactive);
 };
RDebugUtils.currentLine=180813833;
 //BA.debugLineNum = 180813833;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=180813836;
 //BA.debugLineNum = 180813836;BA.debugLine="End Sub";
return "";
}
public String  _tabtextcolor(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _colorselected,int _colorinactive,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "tabtextcolor", false))
	 {return ((String) Debug.delegate(ba, "tabtextcolor", new Object[] {_tabstrip,_colorselected,_colorinactive,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=180748288;
 //BA.debugLineNum = 180748288;BA.debugLine="Public Sub TabTextColor(tabstrip As TabStrip, colo";
RDebugUtils.currentLine=180748290;
 //BA.debugLineNum = 180748290;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=180748291;
 //BA.debugLineNum = 180748291;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=180748292;
 //BA.debugLineNum = 180748292;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=180748293;
 //BA.debugLineNum = 180748293;BA.debugLine="lbl.TextColor = colorSelected";
_lbl.setTextColor(_colorselected);
 }else {
RDebugUtils.currentLine=180748295;
 //BA.debugLineNum = 180748295;BA.debugLine="lbl.TextColor = colorInactive";
_lbl.setTextColor(_colorinactive);
 };
RDebugUtils.currentLine=180748297;
 //BA.debugLineNum = 180748297;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=180748300;
 //BA.debugLineNum = 180748300;BA.debugLine="End Sub";
return "";
}
public String  _tabtop(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _top,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "tabtop", false))
	 {return ((String) Debug.delegate(ba, "tabtop", new Object[] {_tabstrip,_top,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181534720;
 //BA.debugLineNum = 181534720;BA.debugLine="Public Sub TabTop(tabstrip As TabStrip,Top As Int,";
RDebugUtils.currentLine=181534722;
 //BA.debugLineNum = 181534722;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181534723;
 //BA.debugLineNum = 181534723;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181534724;
 //BA.debugLineNum = 181534724;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181534726;
 //BA.debugLineNum = 181534726;BA.debugLine="lbl.Top = Top";
_lbl.setTop(_top);
 };
RDebugUtils.currentLine=181534729;
 //BA.debugLineNum = 181534729;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181534733;
 //BA.debugLineNum = 181534733;BA.debugLine="End Sub";
return "";
}
public String  _tabvisible(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,boolean _visible,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "tabvisible", false))
	 {return ((String) Debug.delegate(ba, "tabvisible", new Object[] {_tabstrip,_visible,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181665792;
 //BA.debugLineNum = 181665792;BA.debugLine="Public Sub TabVisible(tabstrip As TabStrip,Visible";
RDebugUtils.currentLine=181665794;
 //BA.debugLineNum = 181665794;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181665795;
 //BA.debugLineNum = 181665795;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181665796;
 //BA.debugLineNum = 181665796;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181665798;
 //BA.debugLineNum = 181665798;BA.debugLine="lbl.Visible = Visible";
_lbl.setVisible(_visible);
 };
RDebugUtils.currentLine=181665801;
 //BA.debugLineNum = 181665801;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181665804;
 //BA.debugLineNum = 181665804;BA.debugLine="End Sub";
return "";
}
public String  _tabwidth(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _width,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "tabwidth", false))
	 {return ((String) Debug.delegate(ba, "tabwidth", new Object[] {_tabstrip,_width,_position}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=181600256;
 //BA.debugLineNum = 181600256;BA.debugLine="Public Sub TabWidth(tabstrip As TabStrip,Width As";
RDebugUtils.currentLine=181600258;
 //BA.debugLineNum = 181600258;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=181600259;
 //BA.debugLineNum = 181600259;BA.debugLine="For Each lbl As Label In GetAllTabLabels(tabstrip";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (null,_tabstrip);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=181600260;
 //BA.debugLineNum = 181600260;BA.debugLine="If i = Position Then";
if (_i==_position) { 
RDebugUtils.currentLine=181600262;
 //BA.debugLineNum = 181600262;BA.debugLine="lbl.Width = Width";
_lbl.setWidth(_width);
 };
RDebugUtils.currentLine=181600265;
 //BA.debugLineNum = 181600265;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=181600268;
 //BA.debugLineNum = 181600268;BA.debugLine="End Sub";
return "";
}
public String  _underlinecolor(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "underlinecolor", false))
	 {return ((String) Debug.delegate(ba, "underlinecolor", new Object[] {_tabstrip,_color}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=180486144;
 //BA.debugLineNum = 180486144;BA.debugLine="Public Sub UnderlineColor(tabstrip As TabStrip, co";
RDebugUtils.currentLine=180486146;
 //BA.debugLineNum = 180486146;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=180486147;
 //BA.debugLineNum = 180486147;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setUnderline";
_jo.GetFieldJO("tabStrip").RunMethod("setUnderlineColor",new Object[]{(Object)(_color)});
RDebugUtils.currentLine=180486149;
 //BA.debugLineNum = 180486149;BA.debugLine="End Sub";
return "";
}
public String  _underlineheight(xevolution.vrcg.devdemov2400.tabstripviewpagerextendet __ref,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="tabstripviewpagerextendet";
if (Debug.shouldDelegate(ba, "underlineheight", false))
	 {return ((String) Debug.delegate(ba, "underlineheight", new Object[] {_tabstrip,_height}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=180551680;
 //BA.debugLineNum = 180551680;BA.debugLine="Public Sub UnderlineHeight(tabstrip As TabStrip, h";
RDebugUtils.currentLine=180551682;
 //BA.debugLineNum = 180551682;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=180551683;
 //BA.debugLineNum = 180551683;BA.debugLine="jo.GetFieldJO(\"tabStrip\").RunMethod(\"setUnderline";
_jo.GetFieldJO("tabStrip").RunMethod("setUnderlineHeight",new Object[]{(Object)(_height)});
RDebugUtils.currentLine=180551685;
 //BA.debugLineNum = 180551685;BA.debugLine="End Sub";
return "";
}
}