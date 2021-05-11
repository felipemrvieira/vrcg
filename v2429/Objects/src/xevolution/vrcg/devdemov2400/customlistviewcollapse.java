package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class customlistviewcollapse extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.customlistviewcollapse");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.customlistviewcollapse.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _clvitem{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper Panel;
public int Size;
public Object Value;
public int Color;
public boolean TextItem;
public int Offset;
public void Initialize() {
IsInitialized = true;
Panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
Size = 0;
Value = new Object();
Color = 0;
TextItem = false;
Offset = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public float _mdividersize = 0f;
public String _eventname = "";
public Object _callback = null;
public int _defaulttextcolor = 0;
public int _defaulttextbackgroundcolor = 0;
public int _animationduration = 0;
public long _lastreachendevent = 0L;
public int _pressedcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.LabelWrapper _designerlabel = null;
public boolean _horizontal = false;
public anywheresoftware.b4a.objects.StringUtils _su = null;
public int _mfirstvisibleindex = 0;
public int _mlastvisibleindex = 0;
public boolean _monitorvisiblerange = false;
public boolean _firescrollchanged = false;
public boolean _scrollbarsvisible = false;
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
public String  _add(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "add", false))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_pnl,_value}));}
RDebugUtils.currentLine=134283264;
 //BA.debugLineNum = 134283264;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
RDebugUtils.currentLine=134283265;
 //BA.debugLineNum = 134283265;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
__ref._insertat /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_pnl,_value);
RDebugUtils.currentLine=134283266;
 //BA.debugLineNum = 134283266;BA.debugLine="End Sub";
return "";
}
public String  _insertat(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "insertat", false))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_pnl,_value}));}
float _size = 0f;
RDebugUtils.currentLine=133562368;
 //BA.debugLineNum = 133562368;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=133562369;
 //BA.debugLineNum = 133562369;BA.debugLine="Dim size As Float";
_size = 0f;
RDebugUtils.currentLine=133562370;
 //BA.debugLineNum = 133562370;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=133562371;
 //BA.debugLineNum = 133562371;BA.debugLine="size = pnl.Width";
_size = (float) (_pnl.getWidth());
 }else {
RDebugUtils.currentLine=133562373;
 //BA.debugLineNum = 133562373;BA.debugLine="size = pnl.Height";
_size = (float) (_pnl.getHeight());
 };
RDebugUtils.currentLine=133562375;
 //BA.debugLineNum = 133562375;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
__ref._insertatimpl /*void*/ (null,_index,_pnl,(int) (_size),_value,(int) (0));
RDebugUtils.currentLine=133562376;
 //BA.debugLineNum = 133562376;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,Object _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "addtextitem", false))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_text,_value}));}
RDebugUtils.currentLine=133431296;
 //BA.debugLineNum = 133431296;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
RDebugUtils.currentLine=133431297;
 //BA.debugLineNum = 133431297;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
__ref._insertattextitem /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_text,_value);
RDebugUtils.currentLine=133431298;
 //BA.debugLineNum = 133431298;BA.debugLine="End Sub";
return "";
}
public String  _insertattextitem(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index,Object _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "insertattextitem", false))
	 {return ((String) Debug.delegate(ba, "insertattextitem", new Object[] {_index,_text,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
b4a.example3.customlistview._clvitem _item = null;
RDebugUtils.currentLine=133496832;
 //BA.debugLineNum = 133496832;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
RDebugUtils.currentLine=133496833;
 //BA.debugLineNum = 133496833;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=133496834;
 //BA.debugLineNum = 133496834;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
__c.LogImpl("6133496834","AddTextItem is only supported in vertical orientation.",0);
RDebugUtils.currentLine=133496835;
 //BA.debugLineNum = 133496835;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=133496837;
 //BA.debugLineNum = 133496837;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=133496838;
 //BA.debugLineNum = 133496838;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_text);
RDebugUtils.currentLine=133496839;
 //BA.debugLineNum = 133496839;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
_lbl.setHeight((int) (__c.Max(__c.DipToCurrent((int) (50)),_lbl.getHeight())));
RDebugUtils.currentLine=133496840;
 //BA.debugLineNum = 133496840;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
_pnl.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (2)),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__c.DipToCurrent((int) (10))),_lbl.getHeight());
RDebugUtils.currentLine=133496841;
 //BA.debugLineNum = 133496841;BA.debugLine="If xui.IsB4i = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()==__c.False) { 
RDebugUtils.currentLine=133496842;
 //BA.debugLineNum = 133496842;BA.debugLine="lbl.TextColor = DefaultTextColor";
_lbl.setTextColor(__ref._defaulttextcolor /*int*/ );
 };
RDebugUtils.currentLine=133496844;
 //BA.debugLineNum = 133496844;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
_pnl.setColor(__ref._defaulttextbackgroundcolor /*int*/ );
RDebugUtils.currentLine=133496845;
 //BA.debugLineNum = 133496845;BA.debugLine="pnl.Height = lbl.Height + 2dip";
_pnl.setHeight((int) (_lbl.getHeight()+__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=133496846;
 //BA.debugLineNum = 133496846;BA.debugLine="InsertAt(Index, pnl, Value)";
__ref._insertat /*String*/ (null,_index,_pnl,_value);
RDebugUtils.currentLine=133496847;
 //BA.debugLineNum = 133496847;BA.debugLine="Dim item As CLVItem = GetRawListItem(Index)";
_item = __ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,_index);
RDebugUtils.currentLine=133496848;
 //BA.debugLineNum = 133496848;BA.debugLine="item.TextItem = True";
_item.TextItem = __c.True;
RDebugUtils.currentLine=133496849;
 //BA.debugLineNum = 133496849;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _asview(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=132907008;
 //BA.debugLineNum = 132907008;BA.debugLine="Public Sub AsView As B4XView";
RDebugUtils.currentLine=132907009;
 //BA.debugLineNum = 132907009;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=132907010;
 //BA.debugLineNum = 132907010;BA.debugLine="End Sub";
return null;
}
public String  _base_resize(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _scrollbar = 0;
b4a.example3.customlistview._clvitem _it = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=132841472;
 //BA.debugLineNum = 132841472;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=132841473;
 //BA.debugLineNum = 132841473;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=132841474;
 //BA.debugLineNum = 132841474;BA.debugLine="Dim scrollbar As Int";
_scrollbar = 0;
RDebugUtils.currentLine=132841475;
 //BA.debugLineNum = 132841475;BA.debugLine="If xui.IsB4J And ScrollBarsVisible Then scrollbar";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J() && __ref._scrollbarsvisible /*boolean*/ ) { 
_scrollbar = (int) (20);};
RDebugUtils.currentLine=132841476;
 //BA.debugLineNum = 132841476;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=132841477;
 //BA.debugLineNum = 132841477;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight((int) (_height-_scrollbar));
RDebugUtils.currentLine=132841478;
 //BA.debugLineNum = 132841478;BA.debugLine="For Each it As CLVItem In items";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (b4a.example3.customlistview._clvitem)(group6.Get(index6));
RDebugUtils.currentLine=132841479;
 //BA.debugLineNum = 132841479;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
_it.Panel.setHeight(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
RDebugUtils.currentLine=132841480;
 //BA.debugLineNum = 132841480;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
_it.Panel.GetView((int) (0)).setHeight(_it.Panel.getHeight());
 }
};
 }else {
RDebugUtils.currentLine=132841483;
 //BA.debugLineNum = 132841483;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_width-_scrollbar));
RDebugUtils.currentLine=132841484;
 //BA.debugLineNum = 132841484;BA.debugLine="For Each it As CLVItem In items";
{
final anywheresoftware.b4a.BA.IterableList group12 = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (b4a.example3.customlistview._clvitem)(group12.Get(index12));
RDebugUtils.currentLine=132841485;
 //BA.debugLineNum = 132841485;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
_it.Panel.setWidth(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth());
RDebugUtils.currentLine=132841486;
 //BA.debugLineNum = 132841486;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
_it.Panel.GetView((int) (0)).setWidth(_it.Panel.getWidth());
RDebugUtils.currentLine=132841487;
 //BA.debugLineNum = 132841487;BA.debugLine="If it.TextItem Then";
if (_it.TextItem) { 
RDebugUtils.currentLine=132841488;
 //BA.debugLineNum = 132841488;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _it.Panel.GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=132841489;
 //BA.debugLineNum = 132841489;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
_lbl.SetLayoutAnimated((int) (0),_lbl.getLeft(),_lbl.getTop(),(int) (_it.Panel.getWidth()-_lbl.getLeft()),_lbl.getHeight());
 };
 }
};
 };
RDebugUtils.currentLine=132841493;
 //BA.debugLineNum = 132841493;BA.debugLine="If items.Size > 0 Then UpdateVisibleRange";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._updatevisiblerange /*String*/ (null);};
RDebugUtils.currentLine=132841494;
 //BA.debugLineNum = 132841494;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblerange(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "updatevisiblerange", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblerange", null));}
int _first = 0;
int _last = 0;
RDebugUtils.currentLine=133693440;
 //BA.debugLineNum = 133693440;BA.debugLine="Private Sub UpdateVisibleRange";
RDebugUtils.currentLine=133693441;
 //BA.debugLineNum = 133693441;BA.debugLine="If MonitorVisibleRange = False Or getSize = 0 The";
if (__ref._monitorvisiblerange /*boolean*/ ==__c.False || __ref._getsize /*int*/ (null)==0) { 
if (true) return "";};
RDebugUtils.currentLine=133693442;
 //BA.debugLineNum = 133693442;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
_first = __ref._getfirstvisibleindex /*int*/ (null);
RDebugUtils.currentLine=133693443;
 //BA.debugLineNum = 133693443;BA.debugLine="Dim last As Int = getLastVisibleIndex";
_last = __ref._getlastvisibleindex /*int*/ (null);
RDebugUtils.currentLine=133693444;
 //BA.debugLineNum = 133693444;BA.debugLine="If first <> mFirstVisibleIndex Or last <> mLastVi";
if (_first!=__ref._mfirstvisibleindex /*int*/  || _last!=__ref._mlastvisibleindex /*int*/ ) { 
RDebugUtils.currentLine=133693445;
 //BA.debugLineNum = 133693445;BA.debugLine="mFirstVisibleIndex = first";
__ref._mfirstvisibleindex /*int*/  = _first;
RDebugUtils.currentLine=133693446;
 //BA.debugLineNum = 133693446;BA.debugLine="mLastVisibleIndex = last";
__ref._mlastvisibleindex /*int*/  = _last;
RDebugUtils.currentLine=133693447;
 //BA.debugLineNum = 133693447;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_VisibleR";
__c.CallSubDelayed3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_VisibleRangeChanged",(Object)(__ref._mfirstvisibleindex /*int*/ ),(Object)(__ref._mlastvisibleindex /*int*/ ));
 };
RDebugUtils.currentLine=133693449;
 //BA.debugLineNum = 133693449;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
RDebugUtils.currentLine=132513792;
 //BA.debugLineNum = 132513792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=132513793;
 //BA.debugLineNum = 132513793;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=132513794;
 //BA.debugLineNum = 132513794;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=132513795;
 //BA.debugLineNum = 132513795;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=132513796;
 //BA.debugLineNum = 132513796;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
RDebugUtils.currentLine=132513798;
 //BA.debugLineNum = 132513798;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=132513799;
 //BA.debugLineNum = 132513799;BA.debugLine="Private mDividerSize As Float";
_mdividersize = 0f;
RDebugUtils.currentLine=132513800;
 //BA.debugLineNum = 132513800;BA.debugLine="Private EventName As String";
_eventname = "";
RDebugUtils.currentLine=132513801;
 //BA.debugLineNum = 132513801;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=132513802;
 //BA.debugLineNum = 132513802;BA.debugLine="Public DefaultTextColor As Int";
_defaulttextcolor = 0;
RDebugUtils.currentLine=132513803;
 //BA.debugLineNum = 132513803;BA.debugLine="Public DefaultTextBackgroundColor As Int";
_defaulttextbackgroundcolor = 0;
RDebugUtils.currentLine=132513804;
 //BA.debugLineNum = 132513804;BA.debugLine="Public AnimationDuration As Int = 300";
_animationduration = (int) (300);
RDebugUtils.currentLine=132513805;
 //BA.debugLineNum = 132513805;BA.debugLine="Private LastReachEndEvent As Long";
_lastreachendevent = 0L;
RDebugUtils.currentLine=132513806;
 //BA.debugLineNum = 132513806;BA.debugLine="Private PressedColor As Int";
_pressedcolor = 0;
RDebugUtils.currentLine=132513807;
 //BA.debugLineNum = 132513807;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=132513808;
 //BA.debugLineNum = 132513808;BA.debugLine="Private DesignerLabel As Label";
_designerlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=132513809;
 //BA.debugLineNum = 132513809;BA.debugLine="Private horizontal As Boolean";
_horizontal = false;
RDebugUtils.currentLine=132513813;
 //BA.debugLineNum = 132513813;BA.debugLine="Private su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=132513817;
 //BA.debugLineNum = 132513817;BA.debugLine="Private mFirstVisibleIndex, mLastVisibleIndex As";
_mfirstvisibleindex = 0;
_mlastvisibleindex = 0;
RDebugUtils.currentLine=132513818;
 //BA.debugLineNum = 132513818;BA.debugLine="Private MonitorVisibleRange As Boolean";
_monitorvisiblerange = false;
RDebugUtils.currentLine=132513819;
 //BA.debugLineNum = 132513819;BA.debugLine="Private FireScrollChanged As Boolean";
_firescrollchanged = false;
RDebugUtils.currentLine=132513820;
 //BA.debugLineNum = 132513820;BA.debugLine="Private ScrollBarsVisible As Boolean";
_scrollbarsvisible = false;
RDebugUtils.currentLine=132513821;
 //BA.debugLineNum = 132513821;BA.debugLine="End Sub";
return "";
}
public String  _clear(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=132972544;
 //BA.debugLineNum = 132972544;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=132972545;
 //BA.debugLineNum = 132972545;BA.debugLine="items.Clear";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=132972546;
 //BA.debugLineNum = 132972546;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=132972547;
 //BA.debugLineNum = 132972547;BA.debugLine="SetScrollViewContentSize(0)";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (0));
RDebugUtils.currentLine=132972548;
 //BA.debugLineNum = 132972548;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=132972549;
 //BA.debugLineNum = 132972549;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewcontentsize(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "setscrollviewcontentsize", false))
	 {return ((String) Debug.delegate(ba, "setscrollviewcontentsize", new Object[] {_f}));}
RDebugUtils.currentLine=134021120;
 //BA.debugLineNum = 134021120;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
RDebugUtils.currentLine=134021121;
 //BA.debugLineNum = 134021121;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=134021122;
 //BA.debugLineNum = 134021122;BA.debugLine="sv.ScrollViewContentWidth = f";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_f));
 }else {
RDebugUtils.currentLine=134021124;
 //BA.debugLineNum = 134021124;BA.debugLine="sv.ScrollViewContentHeight = f";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight((int) (_f));
 };
RDebugUtils.currentLine=134021126;
 //BA.debugLineNum = 134021126;BA.debugLine="End Sub";
return "";
}
public String  _resetvisibles(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "resetvisibles", false))
	 {return ((String) Debug.delegate(ba, "resetvisibles", null));}
RDebugUtils.currentLine=132644864;
 //BA.debugLineNum = 132644864;BA.debugLine="Private Sub ResetVisibles";
RDebugUtils.currentLine=132644865;
 //BA.debugLineNum = 132644865;BA.debugLine="mFirstVisibleIndex = -1";
__ref._mfirstvisibleindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=132644866;
 //BA.debugLineNum = 132644866;BA.debugLine="mLastVisibleIndex = 0x7FFFFFFF";
__ref._mlastvisibleindex /*int*/  = (int) (0x7fffffff);
RDebugUtils.currentLine=132644867;
 //BA.debugLineNum = 132644867;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,Object _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_txt}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=135528448;
 //BA.debugLineNum = 135528448;BA.debugLine="Private Sub CreateLabel(txt As Object) As B4XView";
RDebugUtils.currentLine=135528449;
 //BA.debugLineNum = 135528449;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=135528450;
 //BA.debugLineNum = 135528450;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=135528451;
 //BA.debugLineNum = 135528451;BA.debugLine="lbl.Gravity = DesignerLabel.Gravity";
_lbl.setGravity(__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getGravity());
RDebugUtils.currentLine=135528452;
 //BA.debugLineNum = 135528452;BA.debugLine="lbl.TextSize = DesignerLabel.TextSize";
_lbl.setTextSize(__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize());
RDebugUtils.currentLine=135528453;
 //BA.debugLineNum = 135528453;BA.debugLine="lbl.SingleLine = False";
_lbl.setSingleLine(__c.False);
RDebugUtils.currentLine=135528454;
 //BA.debugLineNum = 135528454;BA.debugLine="lbl.Text = txt";
_lbl.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=135528455;
 //BA.debugLineNum = 135528455;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
_lbl.setWidth((int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=135528456;
 //BA.debugLineNum = 135528456;BA.debugLine="lbl.Height = su.MeasureMultilineTextHeight(lbl, t";
_lbl.setHeight(__ref._su /*anywheresoftware.b4a.objects.StringUtils*/ .MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),BA.ObjectToCharSequence(_txt)));
RDebugUtils.currentLine=135528457;
 //BA.debugLineNum = 135528457;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=135528458;
 //BA.debugLineNum = 135528458;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createpanel(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,String _paneleventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "createpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createpanel", new Object[] {_paneleventname}));}
RDebugUtils.currentLine=135069696;
 //BA.debugLineNum = 135069696;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
RDebugUtils.currentLine=135069697;
 //BA.debugLineNum = 135069697;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_paneleventname);
RDebugUtils.currentLine=135069698;
 //BA.debugLineNum = 135069698;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createscrollview(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "createscrollview", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createscrollview", null));}
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=135266304;
 //BA.debugLineNum = 135266304;BA.debugLine="Private Sub CreateScrollView As B4XView";
RDebugUtils.currentLine=135266305;
 //BA.debugLineNum = 135266305;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=135266306;
 //BA.debugLineNum = 135266306;BA.debugLine="Dim hv As HorizontalScrollView";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
RDebugUtils.currentLine=135266307;
 //BA.debugLineNum = 135266307;BA.debugLine="hv.Initialize(0, \"sv\")";
_hv.Initialize(ba,(int) (0),"sv");
RDebugUtils.currentLine=135266308;
 //BA.debugLineNum = 135266308;BA.debugLine="Return hv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_hv.getObject()));
 }else {
RDebugUtils.currentLine=135266310;
 //BA.debugLineNum = 135266310;BA.debugLine="Dim nsv As ScrollView";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=135266311;
 //BA.debugLineNum = 135266311;BA.debugLine="nsv.Initialize2(0, \"sv\")";
_nsv.Initialize2(ba,(int) (0),"sv");
RDebugUtils.currentLine=135266312;
 //BA.debugLineNum = 135266312;BA.debugLine="Return nsv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_nsv.getObject()));
 };
RDebugUtils.currentLine=135266314;
 //BA.debugLineNum = 135266314;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _o = "";
anywheresoftware.b4j.object.JavaObject _jsv = null;
RDebugUtils.currentLine=132775936;
 //BA.debugLineNum = 132775936;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=132775937;
 //BA.debugLineNum = 132775937;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=132775938;
 //BA.debugLineNum = 132775938;BA.debugLine="mParent = mBase.Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=132775939;
 //BA.debugLineNum = 132775939;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
_o = BA.ObjectToString(_props.GetDefault((Object)("ListOrientation"),(Object)("Vertical")));
RDebugUtils.currentLine=132775940;
 //BA.debugLineNum = 132775940;BA.debugLine="horizontal = o = \"Horizontal\"";
__ref._horizontal /*boolean*/  = (_o).equals("Horizontal");
RDebugUtils.currentLine=132775941;
 //BA.debugLineNum = 132775941;BA.debugLine="sv = CreateScrollView";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createscrollview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=132775942;
 //BA.debugLineNum = 132775942;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=132775943;
 //BA.debugLineNum = 132775943;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("DividerColor"))));
RDebugUtils.currentLine=132775944;
 //BA.debugLineNum = 132775944;BA.debugLine="mDividerSize = DipToCurrent(Props.Get(\"DividerHei";
__ref._mdividersize /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("DividerHeight"))))));
RDebugUtils.currentLine=132775945;
 //BA.debugLineNum = 132775945;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
__ref._pressedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("PressedColor")));
RDebugUtils.currentLine=132775946;
 //BA.debugLineNum = 132775946;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
__ref._animationduration /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("InsertAnimationDuration"),(Object)(__ref._animationduration /*int*/ ))));
RDebugUtils.currentLine=132775947;
 //BA.debugLineNum = 132775947;BA.debugLine="ScrollBarsVisible = Props.GetDefault(\"ShowScrollB";
__ref._scrollbarsvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowScrollBar"),(Object)(__c.True)));
RDebugUtils.currentLine=132775948;
 //BA.debugLineNum = 132775948;BA.debugLine="If ScrollBarsVisible = False Then";
if (__ref._scrollbarsvisible /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=132775954;
 //BA.debugLineNum = 132775954;BA.debugLine="Dim jsv As JavaObject = sv";
_jsv = new anywheresoftware.b4j.object.JavaObject();
_jsv = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=132775955;
 //BA.debugLineNum = 132775955;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=132775956;
 //BA.debugLineNum = 132775956;BA.debugLine="jsv.RunMethod(\"setHorizontalScrollBarEnabled\",";
_jsv.RunMethod("setHorizontalScrollBarEnabled",new Object[]{(Object)(__c.False)});
 }else {
RDebugUtils.currentLine=132775958;
 //BA.debugLineNum = 132775958;BA.debugLine="jsv.RunMethod(\"setVerticalScrollBarEnabled\", Ar";
_jsv.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
 };
 };
RDebugUtils.currentLine=132775966;
 //BA.debugLineNum = 132775966;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
__ref._defaulttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_lbl.getTextColor()));
RDebugUtils.currentLine=132775967;
 //BA.debugLineNum = 132775967;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
__ref._defaulttextbackgroundcolor /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor();
RDebugUtils.currentLine=132775968;
 //BA.debugLineNum = 132775968;BA.debugLine="DesignerLabel = Lbl";
__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/  = _lbl;
RDebugUtils.currentLine=132775969;
 //BA.debugLineNum = 132775969;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=132775970;
 //BA.debugLineNum = 132775970;BA.debugLine="End Sub";
return "";
}
public int  _findindexfromoffset(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "findindexfromoffset", false))
	 {return ((Integer) Debug.delegate(ba, "findindexfromoffset", new Object[] {_offset}));}
int _position = 0;
int _stepsize = 0;
b4a.example3.customlistview._clvitem _currentitem = null;
int _nextoffset = 0;
int _prevoffset = 0;
RDebugUtils.currentLine=134610944;
 //BA.debugLineNum = 134610944;BA.debugLine="Public Sub FindIndexFromOffset(Offset As Int) As I";
RDebugUtils.currentLine=134610946;
 //BA.debugLineNum = 134610946;BA.debugLine="Dim Position As Int = items.Size / 2";
_position = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()/(double)2);
RDebugUtils.currentLine=134610947;
 //BA.debugLineNum = 134610947;BA.debugLine="Dim StepSize As Int = Ceil(Position / 2)";
_stepsize = (int) (__c.Ceil(_position/(double)2));
RDebugUtils.currentLine=134610948;
 //BA.debugLineNum = 134610948;BA.debugLine="Do While True";
while (__c.True) {
RDebugUtils.currentLine=134610949;
 //BA.debugLineNum = 134610949;BA.debugLine="Dim CurrentItem As CLVItem = items.Get(Position)";
_currentitem = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position));
RDebugUtils.currentLine=134610950;
 //BA.debugLineNum = 134610950;BA.debugLine="Dim NextOffset As Int";
_nextoffset = 0;
RDebugUtils.currentLine=134610951;
 //BA.debugLineNum = 134610951;BA.debugLine="If Position < items.Size - 1 Then";
if (_position<__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=134610952;
 //BA.debugLineNum = 134610952;BA.debugLine="NextOffset = GetRawListItem(Position + 1).Offse";
_nextoffset = (int) (__ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,(int) (_position+1)).Offset-1);
 }else {
RDebugUtils.currentLine=134610954;
 //BA.debugLineNum = 134610954;BA.debugLine="NextOffset = 0x7FFFFFFF";
_nextoffset = (int) (0x7fffffff);
 };
RDebugUtils.currentLine=134610956;
 //BA.debugLineNum = 134610956;BA.debugLine="Dim PrevOffset As Int";
_prevoffset = 0;
RDebugUtils.currentLine=134610957;
 //BA.debugLineNum = 134610957;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=134610958;
 //BA.debugLineNum = 134610958;BA.debugLine="PrevOffset = 0x80000000";
_prevoffset = (int) (0x80000000);
 }else {
RDebugUtils.currentLine=134610960;
 //BA.debugLineNum = 134610960;BA.debugLine="PrevOffset = CurrentItem.Offset";
_prevoffset = _currentitem.Offset;
 };
RDebugUtils.currentLine=134610962;
 //BA.debugLineNum = 134610962;BA.debugLine="If Offset > NextOffset Then";
if (_offset>_nextoffset) { 
RDebugUtils.currentLine=134610963;
 //BA.debugLineNum = 134610963;BA.debugLine="Position = Min(Position + StepSize, items.Size";
_position = (int) (__c.Min(_position+_stepsize,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else 
{RDebugUtils.currentLine=134610964;
 //BA.debugLineNum = 134610964;BA.debugLine="Else if Offset < PrevOffset Then";
if (_offset<_prevoffset) { 
RDebugUtils.currentLine=134610965;
 //BA.debugLineNum = 134610965;BA.debugLine="Position = Max(Position - StepSize, 0)";
_position = (int) (__c.Max(_position-_stepsize,0));
 }else {
RDebugUtils.currentLine=134610967;
 //BA.debugLineNum = 134610967;BA.debugLine="Return Position";
if (true) return _position;
 }}
;
RDebugUtils.currentLine=134610969;
 //BA.debugLineNum = 134610969;BA.debugLine="StepSize = Ceil(StepSize / 2)";
_stepsize = (int) (__c.Ceil(_stepsize/(double)2));
 }
;
RDebugUtils.currentLine=134610971;
 //BA.debugLineNum = 134610971;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=134610972;
 //BA.debugLineNum = 134610972;BA.debugLine="End Sub";
return 0;
}
public b4a.example3.customlistview._clvitem  _getrawlistitem(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getrawlistitem", false))
	 {return ((b4a.example3.customlistview._clvitem) Debug.delegate(ba, "getrawlistitem", new Object[] {_index}));}
RDebugUtils.currentLine=133169152;
 //BA.debugLineNum = 133169152;BA.debugLine="Public Sub GetRawListItem(Index As Int) As CLVItem";
RDebugUtils.currentLine=133169155;
 //BA.debugLineNum = 133169155;BA.debugLine="If Index = items.Size Then Index = Index - 1";
if (_index==__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
_index = (int) (_index-1);};
RDebugUtils.currentLine=133169157;
 //BA.debugLineNum = 133169157;BA.debugLine="Log($\"Index:${Index} Size ${items.size}\"$)";
__c.LogImpl("6133169157",("Index:"+__c.SmartStringFormatter("",(Object)(_index))+" Size "+__c.SmartStringFormatter("",(Object)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()))+""),0);
RDebugUtils.currentLine=133169159;
 //BA.debugLineNum = 133169159;BA.debugLine="Try";
try {RDebugUtils.currentLine=133169160;
 //BA.debugLineNum = 133169160;BA.debugLine="Return items.Get(Index)";
if (true) return (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=133169162;
 //BA.debugLineNum = 133169162;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("6133169162",__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=133169163;
 //BA.debugLineNum = 133169163;BA.debugLine="Return Null";
if (true) return (b4a.example3.customlistview._clvitem)(__c.Null);
 };
RDebugUtils.currentLine=133169166;
 //BA.debugLineNum = 133169166;BA.debugLine="End Sub";
return null;
}
public int  _finditemoffset(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "finditemoffset", false))
	 {return ((Integer) Debug.delegate(ba, "finditemoffset", new Object[] {_index}));}
RDebugUtils.currentLine=134545408;
 //BA.debugLineNum = 134545408;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
RDebugUtils.currentLine=134545409;
 //BA.debugLineNum = 134545409;BA.debugLine="Return GetRawListItem(Index).Offset";
if (true) return __ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,_index).Offset;
RDebugUtils.currentLine=134545410;
 //BA.debugLineNum = 134545410;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=133038080;
 //BA.debugLineNum = 133038080;BA.debugLine="Public Sub GetBase As B4XView";
RDebugUtils.currentLine=133038081;
 //BA.debugLineNum = 133038081;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=133038082;
 //BA.debugLineNum = 133038082;BA.debugLine="End Sub";
return null;
}
public float  _getdividersize(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getdividersize", false))
	 {return ((Float) Debug.delegate(ba, "getdividersize", null));}
RDebugUtils.currentLine=135135232;
 //BA.debugLineNum = 135135232;BA.debugLine="Public Sub getDividerSize As Float";
RDebugUtils.currentLine=135135233;
 //BA.debugLineNum = 135135233;BA.debugLine="Return mDividerSize";
if (true) return __ref._mdividersize /*float*/ ;
RDebugUtils.currentLine=135135234;
 //BA.debugLineNum = 135135234;BA.debugLine="End Sub";
return 0f;
}
public int  _getfirstvisibleindex(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getfirstvisibleindex", false))
	 {return ((Integer) Debug.delegate(ba, "getfirstvisibleindex", null));}
RDebugUtils.currentLine=134676480;
 //BA.debugLineNum = 134676480;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
RDebugUtils.currentLine=134676481;
 //BA.debugLineNum = 134676481;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return __ref._findindexfromoffset /*int*/ (null,(int) (__ref._getscrollviewoffset /*float*/ (null)+__ref._mdividersize /*float*/ ));
RDebugUtils.currentLine=134676482;
 //BA.debugLineNum = 134676482;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewoffset(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getscrollviewoffset", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewoffset", null));}
RDebugUtils.currentLine=133824512;
 //BA.debugLineNum = 133824512;BA.debugLine="Private Sub GetScrollViewOffset As Float";
RDebugUtils.currentLine=133824513;
 //BA.debugLineNum = 133824513;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=133824514;
 //BA.debugLineNum = 133824514;BA.debugLine="Return sv.ScrollViewOffsetX";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetX());
 }else {
RDebugUtils.currentLine=133824516;
 //BA.debugLineNum = 133824516;BA.debugLine="Return sv.ScrollViewOffsetY";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY());
 };
RDebugUtils.currentLine=133824518;
 //BA.debugLineNum = 133824518;BA.debugLine="End Sub";
return 0f;
}
public int  _getitemfromview(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getitemfromview", false))
	 {return ((Integer) Debug.delegate(ba, "getitemfromview", new Object[] {_v}));}
Object _parent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _current = null;
RDebugUtils.currentLine=134938624;
 //BA.debugLineNum = 134938624;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
RDebugUtils.currentLine=134938625;
 //BA.debugLineNum = 134938625;BA.debugLine="Dim parent = v As Object, current As B4XView";
_parent = (Object)(_v.getObject());
_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=134938626;
 //BA.debugLineNum = 134938626;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
while ((__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel()).equals((java.lang.Object)(_parent)) == false) {
RDebugUtils.currentLine=134938627;
 //BA.debugLineNum = 134938627;BA.debugLine="current = parent";
_current = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_parent));
RDebugUtils.currentLine=134938628;
 //BA.debugLineNum = 134938628;BA.debugLine="parent = current.Parent";
_parent = (Object)(_current.getParent().getObject());
 }
;
RDebugUtils.currentLine=134938630;
 //BA.debugLineNum = 134938630;BA.debugLine="v = current";
_v = _current;
RDebugUtils.currentLine=134938631;
 //BA.debugLineNum = 134938631;BA.debugLine="Return v.Tag";
if (true) return (int)(BA.ObjectToNumber(_v.getTag()));
RDebugUtils.currentLine=134938632;
 //BA.debugLineNum = 134938632;BA.debugLine="End Sub";
return 0;
}
public int  _getlastvisibleindex(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getlastvisibleindex", false))
	 {return ((Integer) Debug.delegate(ba, "getlastvisibleindex", null));}
RDebugUtils.currentLine=134742016;
 //BA.debugLineNum = 134742016;BA.debugLine="Public Sub getLastVisibleIndex As Int";
RDebugUtils.currentLine=134742017;
 //BA.debugLineNum = 134742017;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return __ref._findindexfromoffset /*int*/ (null,(int) (__ref._getscrollviewoffset /*float*/ (null)+__ref._getscrollviewvisiblesize /*float*/ (null)));
RDebugUtils.currentLine=134742018;
 //BA.debugLineNum = 134742018;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewvisiblesize(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getscrollviewvisiblesize", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewvisiblesize", null));}
RDebugUtils.currentLine=133758976;
 //BA.debugLineNum = 133758976;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
RDebugUtils.currentLine=133758977;
 //BA.debugLineNum = 133758977;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=133758978;
 //BA.debugLineNum = 133758978;BA.debugLine="Return sv.Width";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 }else {
RDebugUtils.currentLine=133758980;
 //BA.debugLineNum = 133758980;BA.debugLine="Return sv.Height";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=133758982;
 //BA.debugLineNum = 133758982;BA.debugLine="End Sub";
return 0f;
}
public float  _getmaxscrolloffset(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getmaxscrolloffset", false))
	 {return ((Float) Debug.delegate(ba, "getmaxscrolloffset", null));}
RDebugUtils.currentLine=134414336;
 //BA.debugLineNum = 134414336;BA.debugLine="Private Sub GetMaxScrollOffset As Float";
RDebugUtils.currentLine=134414337;
 //BA.debugLineNum = 134414337;BA.debugLine="Return GetScrollViewContentSize - GetScrollViewVi";
if (true) return (float) (__ref._getscrollviewcontentsize /*float*/ (null)-__ref._getscrollviewvisiblesize /*float*/ (null));
RDebugUtils.currentLine=134414338;
 //BA.debugLineNum = 134414338;BA.debugLine="End Sub";
return 0f;
}
public float  _getscrollviewcontentsize(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getscrollviewcontentsize", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewcontentsize", null));}
RDebugUtils.currentLine=133955584;
 //BA.debugLineNum = 133955584;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
RDebugUtils.currentLine=133955585;
 //BA.debugLineNum = 133955585;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=133955586;
 //BA.debugLineNum = 133955586;BA.debugLine="Return sv.ScrollViewContentWidth";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth());
 }else {
RDebugUtils.currentLine=133955588;
 //BA.debugLineNum = 133955588;BA.debugLine="Return sv.ScrollViewContentHeight";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
 };
RDebugUtils.currentLine=133955590;
 //BA.debugLineNum = 133955590;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
RDebugUtils.currentLine=133234688;
 //BA.debugLineNum = 133234688;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
RDebugUtils.currentLine=133234689;
 //BA.debugLineNum = 133234689;BA.debugLine="Return GetRawListItem(Index).Panel.GetView(0)";
if (true) return __ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,_index).Panel.GetView((int) (0));
RDebugUtils.currentLine=133234690;
 //BA.debugLineNum = 133234690;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getparent(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getparent", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getparent", null));}
RDebugUtils.currentLine=135200768;
 //BA.debugLineNum = 135200768;BA.debugLine="Public Sub getParent As B4XView";
RDebugUtils.currentLine=135200769;
 //BA.debugLineNum = 135200769;BA.debugLine="Return mParent";
if (true) return __ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=135200770;
 //BA.debugLineNum = 135200770;BA.debugLine="End Sub";
return null;
}
public int  _getsize(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=133103616;
 //BA.debugLineNum = 133103616;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=133103617;
 //BA.debugLineNum = 133103617;BA.debugLine="Return items.Size";
if (true) return __ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=133103618;
 //BA.debugLineNum = 133103618;BA.debugLine="End Sub";
return 0;
}
public Object  _getvalue(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=133300224;
 //BA.debugLineNum = 133300224;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=133300225;
 //BA.debugLineNum = 133300225;BA.debugLine="Return GetRawListItem(Index).Value";
if (true) return __ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,_index).Value;
RDebugUtils.currentLine=133300226;
 //BA.debugLineNum = 133300226;BA.debugLine="End Sub";
return null;
}
public String  _initialize(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname}));}
RDebugUtils.currentLine=132579328;
 //BA.debugLineNum = 132579328;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
RDebugUtils.currentLine=132579329;
 //BA.debugLineNum = 132579329;BA.debugLine="EventName = vEventName";
__ref._eventname /*String*/  = _veventname;
RDebugUtils.currentLine=132579330;
 //BA.debugLineNum = 132579330;BA.debugLine="CallBack = vCallBack";
__ref._callback /*Object*/  = _vcallback;
RDebugUtils.currentLine=132579331;
 //BA.debugLineNum = 132579331;BA.debugLine="items.Initialize";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=132579332;
 //BA.debugLineNum = 132579332;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
__ref._defaulttextbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=132579333;
 //BA.debugLineNum = 132579333;BA.debugLine="DefaultTextColor = xui.Color_Black";
__ref._defaulttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=132579334;
 //BA.debugLineNum = 132579334;BA.debugLine="MonitorVisibleRange = xui.SubExists(CallBack, Eve";
__ref._monitorvisiblerange /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_VisibleRangeChanged",(int) (2));
RDebugUtils.currentLine=132579335;
 //BA.debugLineNum = 132579335;BA.debugLine="FireScrollChanged = xui.SubExists(CallBack, Event";
__ref._firescrollchanged /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ScrollChanged",(int) (1));
RDebugUtils.currentLine=132579336;
 //BA.debugLineNum = 132579336;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=132579337;
 //BA.debugLineNum = 132579337;BA.debugLine="End Sub";
return "";
}
public void  _insertatimpl(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemsize,Object _value,int _initialsize) throws Exception{
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "insertatimpl", false))
	 {Debug.delegate(ba, "insertatimpl", new Object[] {_index,_pnl,_itemsize,_value,_initialsize}); return;}
ResumableSub_InsertAtImpl rsub = new ResumableSub_InsertAtImpl(this,__ref,_index,_pnl,_itemsize,_value,_initialsize);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertAtImpl extends BA.ResumableSub {
public ResumableSub_InsertAtImpl(xevolution.vrcg.devdemov2400.customlistviewcollapse parent,xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemsize,Object _value,int _initialsize) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._pnl = _pnl;
this._itemsize = _itemsize;
this._value = _value;
this._initialsize = _initialsize;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.customlistviewcollapse __ref;
xevolution.vrcg.devdemov2400.customlistviewcollapse parent;
int _index;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl;
int _itemsize;
Object _value;
int _initialsize;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _includedividierheight = 0;
b4a.example3.customlistview._clvitem _newitem = null;
int _offset = 0;
b4a.example3.customlistview._clvitem _previtem = null;
int _i = 0;
b4a.example3.customlistview._clvitem _it = null;
int _newoffset = 0;
boolean _shouldsetpanelheight = false;
int step39;
int limit39;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="customlistviewcollapse";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=133627906;
 //BA.debugLineNum = 133627906;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"Panel");
RDebugUtils.currentLine=133627907;
 //BA.debugLineNum = 133627907;BA.debugLine="p.Color = Pnl.Color";
_p.setColor(_pnl.getColor());
RDebugUtils.currentLine=133627908;
 //BA.debugLineNum = 133627908;BA.debugLine="Pnl.Color = xui.Color_Transparent";
_pnl.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=133627909;
 //BA.debugLineNum = 133627909;BA.debugLine="If horizontal Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._horizontal /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=133627910;
 //BA.debugLineNum = 133627910;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),_itemsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=133627912;
 //BA.debugLineNum = 133627912;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth(),_itemsize);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=133627914;
 //BA.debugLineNum = 133627914;BA.debugLine="p.Tag = Index";
_p.setTag((Object)(_index));
RDebugUtils.currentLine=133627915;
 //BA.debugLineNum = 133627915;BA.debugLine="Dim IncludeDividierHeight As Int";
_includedividierheight = 0;
RDebugUtils.currentLine=133627916;
 //BA.debugLineNum = 133627916;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = m";
if (true) break;

case 7:
//if
this.state = 14;
if (_initialsize==0) { 
this.state = 9;
;}
else {
this.state = 11;
;}if (true) break;

case 9:
//C
this.state = 14;
_includedividierheight = (int) (__ref._mdividersize /*float*/ );
if (true) break;

case 11:
//C
this.state = 14;
_includedividierheight = (int) (0);
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=133627917;
 //BA.debugLineNum = 133627917;BA.debugLine="Dim NewItem As CLVItem";
_newitem = new b4a.example3.customlistview._clvitem();
RDebugUtils.currentLine=133627918;
 //BA.debugLineNum = 133627918;BA.debugLine="NewItem.Panel = p";
_newitem.Panel = _p;
RDebugUtils.currentLine=133627919;
 //BA.debugLineNum = 133627919;BA.debugLine="NewItem.Size = ItemSize";
_newitem.Size = _itemsize;
RDebugUtils.currentLine=133627920;
 //BA.debugLineNum = 133627920;BA.debugLine="NewItem.Value = Value";
_newitem.Value = _value;
RDebugUtils.currentLine=133627921;
 //BA.debugLineNum = 133627921;BA.debugLine="NewItem.Color = p.Color";
_newitem.Color = _p.getColor();
RDebugUtils.currentLine=133627922;
 //BA.debugLineNum = 133627922;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
if (true) break;

case 15:
//if
this.state = 65;
if (_index==__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize() && _initialsize==0) { 
this.state = 17;
}else {
this.state = 31;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=133627923;
 //BA.debugLineNum = 133627923;BA.debugLine="items.Add(NewItem)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newitem));
RDebugUtils.currentLine=133627924;
 //BA.debugLineNum = 133627924;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=133627925;
 //BA.debugLineNum = 133627925;BA.debugLine="If Index = 0 Then";
if (true) break;

case 18:
//if
this.state = 23;
if (_index==0) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=133627926;
 //BA.debugLineNum = 133627926;BA.debugLine="offset = mDividerSize";
_offset = (int) (__ref._mdividersize /*float*/ );
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=133627928;
 //BA.debugLineNum = 133627928;BA.debugLine="offset = GetScrollViewContentSize";
_offset = (int) (__ref._getscrollviewcontentsize /*float*/ (null));
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=133627930;
 //BA.debugLineNum = 133627930;BA.debugLine="NewItem.Offset = offset";
_newitem.Offset = _offset;
RDebugUtils.currentLine=133627931;
 //BA.debugLineNum = 133627931;BA.debugLine="If horizontal Then";
if (true) break;

case 24:
//if
this.state = 29;
if (__ref._horizontal /*boolean*/ ) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=133627932;
 //BA.debugLineNum = 133627932;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_itemsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=133627934;
 //BA.debugLineNum = 133627934;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_itemsize);
 if (true) break;

case 29:
//C
this.state = 65;
;
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=133627937;
 //BA.debugLineNum = 133627937;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=133627938;
 //BA.debugLineNum = 133627938;BA.debugLine="If Index = 0 Then";
if (true) break;

case 32:
//if
this.state = 37;
if (_index==0) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
RDebugUtils.currentLine=133627939;
 //BA.debugLineNum = 133627939;BA.debugLine="offset = mDividerSize";
_offset = (int) (__ref._mdividersize /*float*/ );
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=133627941;
 //BA.debugLineNum = 133627941;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
_previtem = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_index-1)));
RDebugUtils.currentLine=133627942;
 //BA.debugLineNum = 133627942;BA.debugLine="offset = PrevItem.Offset + PrevItem.Size + mDiv";
_offset = (int) (_previtem.Offset+_previtem.Size+__ref._mdividersize /*float*/ );
 if (true) break;
;
RDebugUtils.currentLine=133627944;
 //BA.debugLineNum = 133627944;BA.debugLine="For i = Index To items.Size - 1";

case 37:
//for
this.state = 52;
step39 = 1;
limit39 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = _index ;
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
if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=133627945;
 //BA.debugLineNum = 133627945;BA.debugLine="Dim It As CLVItem = items.Get(i)";
_it = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=133627946;
 //BA.debugLineNum = 133627946;BA.debugLine="Dim NewOffset As Int = It.Offset + ItemSize - I";
_newoffset = (int) (_it.Offset+_itemsize-_initialsize+_includedividierheight);
RDebugUtils.currentLine=133627947;
 //BA.debugLineNum = 133627947;BA.debugLine="If Min(NewOffset, It.Offset) - GetScrollViewOff";
if (true) break;

case 40:
//if
this.state = 51;
if (parent.__c.Min(_newoffset,_it.Offset)-__ref._getscrollviewoffset /*float*/ (null)<__ref._getscrollviewvisiblesize /*float*/ (null)) { 
this.state = 42;
}else {
this.state = 50;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=133627948;
 //BA.debugLineNum = 133627948;BA.debugLine="It.Offset = NewOffset";
_it.Offset = _newoffset;
RDebugUtils.currentLine=133627949;
 //BA.debugLineNum = 133627949;BA.debugLine="If horizontal Then";
if (true) break;

case 43:
//if
this.state = 48;
if (__ref._horizontal /*boolean*/ ) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 48;
RDebugUtils.currentLine=133627950;
 //BA.debugLineNum = 133627950;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel.SetLayoutAnimated(__ref._animationduration /*int*/ ,_newoffset,(int) (0),_it.Size,_it.Panel.getHeight());
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=133627952;
 //BA.debugLineNum = 133627952;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel.SetLayoutAnimated(__ref._animationduration /*int*/ ,(int) (0),_newoffset,_it.Panel.getWidth(),_it.Size);
 if (true) break;

case 48:
//C
this.state = 51;
;
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=133627955;
 //BA.debugLineNum = 133627955;BA.debugLine="SetItemOffset(It, NewOffset)";
__ref._setitemoffset /*String*/ (null,_it,(float) (_newoffset));
 if (true) break;

case 51:
//C
this.state = 84;
;
RDebugUtils.currentLine=133627957;
 //BA.debugLineNum = 133627957;BA.debugLine="It.Panel.Tag = i + 1";
_it.Panel.setTag((Object)(_i+1));
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
;
RDebugUtils.currentLine=133627959;
 //BA.debugLineNum = 133627959;BA.debugLine="items.InsertAt(Index, NewItem)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,(Object)(_newitem));
RDebugUtils.currentLine=133627960;
 //BA.debugLineNum = 133627960;BA.debugLine="NewItem.Offset = offset";
_newitem.Offset = _offset;
RDebugUtils.currentLine=133627961;
 //BA.debugLineNum = 133627961;BA.debugLine="If horizontal Then";
if (true) break;

case 53:
//if
this.state = 64;
if (__ref._horizontal /*boolean*/ ) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 64;
RDebugUtils.currentLine=133627962;
 //BA.debugLineNum = 133627962;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_initialsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=133627963;
 //BA.debugLineNum = 133627963;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
_p.SetLayoutAnimated(__ref._animationduration /*int*/ ,_offset,(int) (0),_itemsize,_p.getHeight());
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=133627965;
 //BA.debugLineNum = 133627965;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_initialsize);
RDebugUtils.currentLine=133627967;
 //BA.debugLineNum = 133627967;BA.debugLine="Dim ShouldSetPanelHeight As Boolean = InitialSi";
_shouldsetpanelheight = _initialsize>_itemsize;
RDebugUtils.currentLine=133627968;
 //BA.debugLineNum = 133627968;BA.debugLine="If ShouldSetPanelHeight = True Then 'collapse";
if (true) break;

case 58:
//if
this.state = 63;
if (_shouldsetpanelheight==parent.__c.True) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
RDebugUtils.currentLine=133627969;
 //BA.debugLineNum = 133627969;BA.debugLine="Pnl.Height = InitialSize";
_pnl.setHeight(_initialsize);
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=133627971;
 //BA.debugLineNum = 133627971;BA.debugLine="p.SetLayoutAnimated(0, 0, offset, p.Width, Ite";
_p.SetLayoutAnimated((int) (0),(int) (0),_offset,_p.getWidth(),_itemsize);
 if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=133627973;
 //BA.debugLineNum = 133627973;BA.debugLine="p.SendToBack";
_p.SendToBack();
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
RDebugUtils.currentLine=133627978;
 //BA.debugLineNum = 133627978;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (__ref._getscrollviewcontentsize /*float*/ (null)+_itemsize-_initialsize+_includedividierheight));
RDebugUtils.currentLine=133627979;
 //BA.debugLineNum = 133627979;BA.debugLine="If items.Size = 1 Then SetScrollViewContentSize(G";
if (true) break;

case 66:
//if
this.state = 71;
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
this.state = 68;
;}if (true) break;

case 68:
//C
this.state = 71;
__ref._setscrollviewcontentsize /*String*/ (null,(float) (__ref._getscrollviewcontentsize /*float*/ (null)+_includedividierheight));
if (true) break;

case 71:
//C
this.state = 72;
;
RDebugUtils.currentLine=133627980;
 //BA.debugLineNum = 133627980;BA.debugLine="If Index < mLastVisibleIndex Or GetRawListItem(mL";
if (true) break;

case 72:
//if
this.state = 75;
if (_index<__ref._mlastvisibleindex /*int*/  || __ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,__ref._mlastvisibleindex /*int*/ ).Offset+__ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,__ref._mlastvisibleindex /*int*/ ).Size+__ref._mdividersize /*float*/ <__ref._getscrollviewvisiblesize /*float*/ (null)) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=133627982;
 //BA.debugLineNum = 133627982;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=133627985;
 //BA.debugLineNum = 133627985;BA.debugLine="If ShouldSetPanelHeight Then";

case 75:
//if
this.state = 82;
if (_shouldsetpanelheight) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=133627986;
 //BA.debugLineNum = 133627986;BA.debugLine="Sleep(AnimationDuration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "customlistviewcollapse", "insertatimpl"),__ref._animationduration /*int*/ );
this.state = 85;
return;
case 85:
//C
this.state = 78;
;
RDebugUtils.currentLine=133627987;
 //BA.debugLineNum = 133627987;BA.debugLine="If p.Parent.IsInitialized Then";
if (true) break;

case 78:
//if
this.state = 81;
if (_p.getParent().IsInitialized()) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=133627989;
 //BA.debugLineNum = 133627989;BA.debugLine="p.Height = ItemSize";
_p.setHeight(_itemsize);
RDebugUtils.currentLine=133627990;
 //BA.debugLineNum = 133627990;BA.debugLine="Pnl.Height = ItemSize";
_pnl.setHeight(_itemsize);
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
RDebugUtils.currentLine=133627993;
 //BA.debugLineNum = 133627993;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setitemoffset(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,b4a.example3.customlistview._clvitem _item,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "setitemoffset", false))
	 {return ((String) Debug.delegate(ba, "setitemoffset", new Object[] {_item,_offset}));}
RDebugUtils.currentLine=134086656;
 //BA.debugLineNum = 134086656;BA.debugLine="Private Sub SetItemOffset (item As CLVItem, offset";
RDebugUtils.currentLine=134086657;
 //BA.debugLineNum = 134086657;BA.debugLine="item.Offset = offset";
_item.Offset = (int) (_offset);
RDebugUtils.currentLine=134086658;
 //BA.debugLineNum = 134086658;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=134086659;
 //BA.debugLineNum = 134086659;BA.debugLine="item.Panel.Left = offset";
_item.Panel.setLeft((int) (_offset));
 }else {
RDebugUtils.currentLine=134086661;
 //BA.debugLineNum = 134086661;BA.debugLine="item.Panel.Top = offset";
_item.Panel.setTop((int) (_offset));
 };
RDebugUtils.currentLine=134086663;
 //BA.debugLineNum = 134086663;BA.debugLine="End Sub";
return "";
}
public String  _jumptoitem(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "jumptoitem", false))
	 {return ((String) Debug.delegate(ba, "jumptoitem", new Object[] {_index}));}
RDebugUtils.currentLine=134348800;
 //BA.debugLineNum = 134348800;BA.debugLine="Public Sub JumpToItem(Index As Int)";
RDebugUtils.currentLine=134348801;
 //BA.debugLineNum = 134348801;BA.debugLine="SetScrollViewOffset(Min(GetMaxScrollOffset, FindI";
__ref._setscrollviewoffset /*String*/ (null,(float) (__c.Min(__ref._getmaxscrolloffset /*float*/ (null),__ref._finditemoffset /*int*/ (null,_index))));
RDebugUtils.currentLine=134348802;
 //BA.debugLineNum = 134348802;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewoffset(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "setscrollviewoffset", false))
	 {return ((String) Debug.delegate(ba, "setscrollviewoffset", new Object[] {_offset}));}
RDebugUtils.currentLine=133890048;
 //BA.debugLineNum = 133890048;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
RDebugUtils.currentLine=133890049;
 //BA.debugLineNum = 133890049;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=133890050;
 //BA.debugLineNum = 133890050;BA.debugLine="sv.ScrollViewOffsetX = offset";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetX((int) (_offset));
 }else {
RDebugUtils.currentLine=133890052;
 //BA.debugLineNum = 133890052;BA.debugLine="sv.ScrollViewOffsetY = offset";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY((int) (_offset));
 };
RDebugUtils.currentLine=133890054;
 //BA.debugLineNum = 133890054;BA.debugLine="End Sub";
return "";
}
public String  _panel_click(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "panel_click", false))
	 {return ((String) Debug.delegate(ba, "panel_click", null));}
RDebugUtils.currentLine=135331840;
 //BA.debugLineNum = 135331840;BA.debugLine="Private Sub Panel_Click";
RDebugUtils.currentLine=135331841;
 //BA.debugLineNum = 135331841;BA.debugLine="PanelClickHandler(Sender)";
__ref._panelclickhandler /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=135331842;
 //BA.debugLineNum = 135331842;BA.debugLine="End Sub";
return "";
}
public void  _panelclickhandler(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "panelclickhandler", false))
	 {Debug.delegate(ba, "panelclickhandler", new Object[] {_senderpanel}); return;}
ResumableSub_PanelClickHandler rsub = new ResumableSub_PanelClickHandler(this,__ref,_senderpanel);
rsub.resume(ba, null);
}
public static class ResumableSub_PanelClickHandler extends BA.ResumableSub {
public ResumableSub_PanelClickHandler(xevolution.vrcg.devdemov2400.customlistviewcollapse parent,xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.customlistviewcollapse __ref;
xevolution.vrcg.devdemov2400.customlistviewcollapse parent;
anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel;
int _clr = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="customlistviewcollapse";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=134807553;
 //BA.debugLineNum = 134807553;BA.debugLine="Dim clr As Int = GetRawListItem(SenderPanel.Tag).";
_clr = __ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Color;
RDebugUtils.currentLine=134807554;
 //BA.debugLineNum = 134807554;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedColo";
_senderpanel.SetColorAnimated((int) (50),_clr,__ref._pressedcolor /*int*/ );
RDebugUtils.currentLine=134807555;
 //BA.debugLineNum = 134807555;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemClick",(int) (2))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=134807556;
 //BA.debugLineNum = 134807556;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
parent.__c.CallSubNew3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemClick",_senderpanel.getTag(),__ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Value);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=134807558;
 //BA.debugLineNum = 134807558;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "customlistviewcollapse", "panelclickhandler"),(int) (200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=134807559;
 //BA.debugLineNum = 134807559;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor, c";
_senderpanel.SetColorAnimated((int) (200),__ref._pressedcolor /*int*/ ,_clr);
RDebugUtils.currentLine=134807560;
 //BA.debugLineNum = 134807560;BA.debugLine="Log(\"pressed\")";
parent.__c.LogImpl("6134807560","pressed",0);
RDebugUtils.currentLine=134807561;
 //BA.debugLineNum = 134807561;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _panel_longclick(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "panel_longclick", false))
	 {return ((String) Debug.delegate(ba, "panel_longclick", null));}
RDebugUtils.currentLine=135397376;
 //BA.debugLineNum = 135397376;BA.debugLine="Private Sub Panel_LongClick";
RDebugUtils.currentLine=135397377;
 //BA.debugLineNum = 135397377;BA.debugLine="PanelLongClickHandler(Sender)";
__ref._panellongclickhandler /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=135397378;
 //BA.debugLineNum = 135397378;BA.debugLine="End Sub";
return "";
}
public void  _panellongclickhandler(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "panellongclickhandler", false))
	 {Debug.delegate(ba, "panellongclickhandler", new Object[] {_senderpanel}); return;}
ResumableSub_PanelLongClickHandler rsub = new ResumableSub_PanelLongClickHandler(this,__ref,_senderpanel);
rsub.resume(ba, null);
}
public static class ResumableSub_PanelLongClickHandler extends BA.ResumableSub {
public ResumableSub_PanelLongClickHandler(xevolution.vrcg.devdemov2400.customlistviewcollapse parent,xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.customlistviewcollapse __ref;
xevolution.vrcg.devdemov2400.customlistviewcollapse parent;
anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="customlistviewcollapse";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=134873089;
 //BA.debugLineNum = 134873089;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemLong";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemLongClick",(int) (2))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=134873090;
 //BA.debugLineNum = 134873090;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemLongClick\",";
parent.__c.CallSubNew3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemLongClick",_senderpanel.getTag(),__ref._getrawlistitem /*b4a.example3.customlistview._clvitem*/ (null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Value);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=134873092;
 //BA.debugLineNum = 134873092;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "customlistviewcollapse", "panellongclickhandler"),(int) (100));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=134873093;
 //BA.debugLineNum = 134873093;BA.debugLine="Log(\"Long pressed\")";
parent.__c.LogImpl("6134873093","Long pressed",0);
RDebugUtils.currentLine=134873094;
 //BA.debugLineNum = 134873094;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _refresh(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=132710400;
 //BA.debugLineNum = 132710400;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=132710401;
 //BA.debugLineNum = 132710401;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=132710402;
 //BA.debugLineNum = 132710402;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
RDebugUtils.currentLine=132710403;
 //BA.debugLineNum = 132710403;BA.debugLine="End Sub";
return "";
}
public String  _removeat(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "removeat", false))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
b4a.example3.customlistview._clvitem _removeitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _i = 0;
b4a.example3.customlistview._clvitem _item = null;
int _newoffset = 0;
RDebugUtils.currentLine=133365760;
 //BA.debugLineNum = 133365760;BA.debugLine="Public Sub RemoveAt(Index As Int)";
RDebugUtils.currentLine=133365761;
 //BA.debugLineNum = 133365761;BA.debugLine="If getSize <= 1 Then";
if (__ref._getsize /*int*/ (null)<=1) { 
RDebugUtils.currentLine=133365762;
 //BA.debugLineNum = 133365762;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=133365763;
 //BA.debugLineNum = 133365763;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=133365765;
 //BA.debugLineNum = 133365765;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=133365766;
 //BA.debugLineNum = 133365766;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=133365767;
 //BA.debugLineNum = 133365767;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (_index+1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=133365768;
 //BA.debugLineNum = 133365768;BA.debugLine="Dim item As CLVItem = items.Get(i)";
_item = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=133365769;
 //BA.debugLineNum = 133365769;BA.debugLine="p = item.Panel";
_p = _item.Panel;
RDebugUtils.currentLine=133365770;
 //BA.debugLineNum = 133365770;BA.debugLine="p.Tag = i - 1";
_p.setTag((Object)(_i-1));
RDebugUtils.currentLine=133365771;
 //BA.debugLineNum = 133365771;BA.debugLine="Dim NewOffset As Int = item.Offset - RemoveItem.";
_newoffset = (int) (_item.Offset-_removeitem.Size-__ref._mdividersize /*float*/ );
RDebugUtils.currentLine=133365772;
 //BA.debugLineNum = 133365772;BA.debugLine="SetItemOffset(item, NewOffset)";
__ref._setitemoffset /*String*/ (null,_item,(float) (_newoffset));
 }
};
RDebugUtils.currentLine=133365774;
 //BA.debugLineNum = 133365774;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (__ref._getscrollviewcontentsize /*float*/ (null)-_removeitem.Size-__ref._mdividersize /*float*/ ));
RDebugUtils.currentLine=133365775;
 //BA.debugLineNum = 133365775;BA.debugLine="items.RemoveAt(Index)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=133365776;
 //BA.debugLineNum = 133365776;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel.RemoveViewFromParent();
RDebugUtils.currentLine=133365777;
 //BA.debugLineNum = 133365777;BA.debugLine="End Sub";
return "";
}
public String  _replaceat(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemheight,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "replaceat", false))
	 {return ((String) Debug.delegate(ba, "replaceat", new Object[] {_index,_pnl,_itemheight,_value}));}
b4a.example3.customlistview._clvitem _removeitem = null;
RDebugUtils.currentLine=134217728;
 //BA.debugLineNum = 134217728;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=134217729;
 //BA.debugLineNum = 134217729;BA.debugLine="If Index = items.Size Then Index = Index -1";
if (_index==__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
_index = (int) (_index-1);};
RDebugUtils.currentLine=134217730;
 //BA.debugLineNum = 134217730;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=134217731;
 //BA.debugLineNum = 134217731;BA.debugLine="items.RemoveAt(Index)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=134217732;
 //BA.debugLineNum = 134217732;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel.RemoveViewFromParent();
RDebugUtils.currentLine=134217733;
 //BA.debugLineNum = 134217733;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
__ref._insertatimpl /*void*/ (null,_index,_pnl,_itemheight,_value,_removeitem.Size);
RDebugUtils.currentLine=134217734;
 //BA.debugLineNum = 134217734;BA.debugLine="End Sub";
return "";
}
public String  _resizeitem(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index,int _itemheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "resizeitem", false))
	 {return ((String) Debug.delegate(ba, "resizeitem", new Object[] {_index,_itemheight}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
Object _value = null;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
RDebugUtils.currentLine=134152192;
 //BA.debugLineNum = 134152192;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
RDebugUtils.currentLine=134152193;
 //BA.debugLineNum = 134152193;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index);
RDebugUtils.currentLine=134152194;
 //BA.debugLineNum = 134152194;BA.debugLine="Dim value As Object = GetValue(Index)";
_value = __ref._getvalue /*Object*/ (null,_index);
RDebugUtils.currentLine=134152195;
 //BA.debugLineNum = 134152195;BA.debugLine="Dim parent As B4XView = p.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _p.getParent();
RDebugUtils.currentLine=134152196;
 //BA.debugLineNum = 134152196;BA.debugLine="p.Color = parent.Color";
_p.setColor(_parent.getColor());
RDebugUtils.currentLine=134152197;
 //BA.debugLineNum = 134152197;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=134152198;
 //BA.debugLineNum = 134152198;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
__ref._replaceat /*String*/ (null,_index,_p,_itemheight,_value);
RDebugUtils.currentLine=134152199;
 //BA.debugLineNum = 134152199;BA.debugLine="End Sub";
return "";
}
public String  _scrollhandler(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "scrollhandler", false))
	 {return ((String) Debug.delegate(ba, "scrollhandler", null));}
int _position = 0;
RDebugUtils.currentLine=135004160;
 //BA.debugLineNum = 135004160;BA.debugLine="Private Sub ScrollHandler";
RDebugUtils.currentLine=135004161;
 //BA.debugLineNum = 135004161;BA.debugLine="If items.Size = 0 Then Return";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=135004162;
 //BA.debugLineNum = 135004162;BA.debugLine="Dim position As Int = GetScrollViewOffset";
_position = (int) (__ref._getscrollviewoffset /*float*/ (null));
RDebugUtils.currentLine=135004163;
 //BA.debugLineNum = 135004163;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
if (_position+__ref._getscrollviewvisiblesize /*float*/ (null)>=__ref._getscrollviewcontentsize /*float*/ (null)-__c.DipToCurrent((int) (5)) && __c.DateTime.getNow()>__ref._lastreachendevent /*long*/ +100) { 
RDebugUtils.currentLine=135004164;
 //BA.debugLineNum = 135004164;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ReachEnd",(int) (0))) { 
RDebugUtils.currentLine=135004165;
 //BA.debugLineNum = 135004165;BA.debugLine="LastReachEndEvent = DateTime.Now";
__ref._lastreachendevent /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=135004166;
 //BA.debugLineNum = 135004166;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
__c.CallSubDelayed(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ReachEnd");
 }else {
RDebugUtils.currentLine=135004168;
 //BA.debugLineNum = 135004168;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
__ref._lastreachendevent /*long*/  = (long) (__c.DateTime.getNow()+1000*__c.DateTime.TicksPerDay);
 };
 };
RDebugUtils.currentLine=135004171;
 //BA.debugLineNum = 135004171;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
RDebugUtils.currentLine=135004172;
 //BA.debugLineNum = 135004172;BA.debugLine="If FireScrollChanged Then";
if (__ref._firescrollchanged /*boolean*/ ) { 
RDebugUtils.currentLine=135004173;
 //BA.debugLineNum = 135004173;BA.debugLine="CallSub2(CallBack, EventName & \"_ScrollChanged\",";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ScrollChanged",(Object)(_position));
 };
RDebugUtils.currentLine=135004175;
 //BA.debugLineNum = 135004175;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoitem(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "scrolltoitem", false))
	 {return ((String) Debug.delegate(ba, "scrolltoitem", new Object[] {_index}));}
float _offset = 0f;
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=134479872;
 //BA.debugLineNum = 134479872;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
RDebugUtils.currentLine=134479873;
 //BA.debugLineNum = 134479873;BA.debugLine="Dim offset As Float = Min(GetMaxScrollOffset, Fin";
_offset = (float) (__c.Min(__ref._getmaxscrolloffset /*float*/ (null),__ref._finditemoffset /*int*/ (null,_index)));
RDebugUtils.currentLine=134479885;
 //BA.debugLineNum = 134479885;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=134479886;
 //BA.debugLineNum = 134479886;BA.debugLine="Dim hv As HorizontalScrollView = sv";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
_hv = (anywheresoftware.b4a.objects.HorizontalScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper(), (android.widget.HorizontalScrollView)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=134479887;
 //BA.debugLineNum = 134479887;BA.debugLine="hv.ScrollPosition = offset 'smooth scroll";
_hv.setScrollPosition((int) (_offset));
 }else {
RDebugUtils.currentLine=134479889;
 //BA.debugLineNum = 134479889;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_nsv = (anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=134479890;
 //BA.debugLineNum = 134479890;BA.debugLine="nsv.ScrollPosition = offset";
_nsv.setScrollPosition((int) (_offset));
 };
RDebugUtils.currentLine=134479893;
 //BA.debugLineNum = 134479893;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(xevolution.vrcg.devdemov2400.customlistviewcollapse __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistviewcollapse";
if (Debug.shouldDelegate(ba, "sv_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=135462912;
 //BA.debugLineNum = 135462912;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=135462913;
 //BA.debugLineNum = 135462913;BA.debugLine="ScrollHandler";
__ref._scrollhandler /*String*/ (null);
RDebugUtils.currentLine=135462914;
 //BA.debugLineNum = 135462914;BA.debugLine="End Sub";
return "";
}
}