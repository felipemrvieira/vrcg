package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class expandedlistview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.expandedlistview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.expandedlistview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _clvexpitem{
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mbaseparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _msvparent = null;
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
public boolean _mupdowniconexists = false;
public int _mupdowniconindex = 0;
public anywheresoftware.b4a.objects.collections.List _idata = null;
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
public String  _add(xevolution.vrcg.devdemov2400.expandedlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "add", false))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_pnl,_value}));}
RDebugUtils.currentLine=141230080;
 //BA.debugLineNum = 141230080;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
RDebugUtils.currentLine=141230081;
 //BA.debugLineNum = 141230081;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
__ref._insertat /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_pnl,_value);
RDebugUtils.currentLine=141230082;
 //BA.debugLineNum = 141230082;BA.debugLine="End Sub";
return "";
}
public String  _refresh(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=138805248;
 //BA.debugLineNum = 138805248;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=138805249;
 //BA.debugLineNum = 138805249;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=138805250;
 //BA.debugLineNum = 138805250;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
RDebugUtils.currentLine=138805251;
 //BA.debugLineNum = 138805251;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
RDebugUtils.currentLine=139984896;
 //BA.debugLineNum = 139984896;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
RDebugUtils.currentLine=139984898;
 //BA.debugLineNum = 139984898;BA.debugLine="If items.Size > Index Then";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_index) { 
RDebugUtils.currentLine=139984899;
 //BA.debugLineNum = 139984899;BA.debugLine="Return GetRawListItem(Index).Panel.GetView(0)";
if (true) return __ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,_index).Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
 }else {
RDebugUtils.currentLine=139984901;
 //BA.debugLineNum = 139984901;BA.debugLine="Return GetRawListItem(0).Panel.GetView(0)";
if (true) return __ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,(int) (0)).Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
 };
RDebugUtils.currentLine=139984903;
 //BA.debugLineNum = 139984903;BA.debugLine="End Sub";
return null;
}
public String  _clear(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=139657216;
 //BA.debugLineNum = 139657216;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=139657217;
 //BA.debugLineNum = 139657217;BA.debugLine="items.Clear";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=139657218;
 //BA.debugLineNum = 139657218;BA.debugLine="iData.Clear";
__ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=139657219;
 //BA.debugLineNum = 139657219;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=139657220;
 //BA.debugLineNum = 139657220;BA.debugLine="SetScrollViewContentSize(0)";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (0));
RDebugUtils.currentLine=139657221;
 //BA.debugLineNum = 139657221;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=139657222;
 //BA.debugLineNum = 139657222;BA.debugLine="End Sub";
return "";
}
public String  _collapseitem(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "collapseitem", false))
	 {return ((String) Debug.delegate(ba, "collapseitem", new Object[] {_index}));}
xevolution.vrcg.devdemov2400.expandedlistview _innerreference = null;
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
RDebugUtils.currentLine=139067392;
 //BA.debugLineNum = 139067392;BA.debugLine="Sub CollapseItem(index As Int)";
RDebugUtils.currentLine=139067393;
 //BA.debugLineNum = 139067393;BA.debugLine="Dim InnerReference As ExpandedListView = Me";
_innerreference = (xevolution.vrcg.devdemov2400.expandedlistview)(this);
RDebugUtils.currentLine=139067394;
 //BA.debugLineNum = 139067394;BA.debugLine="Dim id As ItemData = InnerReference.GetValue(inde";
_id = (xevolution.vrcg.devdemov2400.checklist3._itemdata)(_innerreference._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=139067395;
 //BA.debugLineNum = 139067395;BA.debugLine="InnerReference.ResizeItem(index, id.CollapsedHeig";
_innerreference._resizeitem /*String*/ (null,_index,_id.CollapsedHeight /*int*/ );
RDebugUtils.currentLine=139067396;
 //BA.debugLineNum = 139067396;BA.debugLine="InnerReference.GetPanel(index).Tag = False";
_innerreference._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).setTag((Object)(__c.False));
RDebugUtils.currentLine=139067397;
 //BA.debugLineNum = 139067397;BA.debugLine="If (mUpDownIconExists) Then";
if ((__ref._mupdowniconexists /*boolean*/ )) { 
RDebugUtils.currentLine=139067398;
 //BA.debugLineNum = 139067398;BA.debugLine="AnimatedArrow(index, 180, 0)";
__ref._animatedarrow /*String*/ (null,_index,(int) (180),(int) (0));
 };
RDebugUtils.currentLine=139067400;
 //BA.debugLineNum = 139067400;BA.debugLine="End Sub";
return "";
}
public String  _expanditem(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "expanditem", false))
	 {return ((String) Debug.delegate(ba, "expanditem", new Object[] {_index}));}
xevolution.vrcg.devdemov2400.expandedlistview _innerreference = null;
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
RDebugUtils.currentLine=138936320;
 //BA.debugLineNum = 138936320;BA.debugLine="Sub ExpandItem(index As Int)";
RDebugUtils.currentLine=138936321;
 //BA.debugLineNum = 138936321;BA.debugLine="Dim InnerReference As ExpandedListView = Me";
_innerreference = (xevolution.vrcg.devdemov2400.expandedlistview)(this);
RDebugUtils.currentLine=138936322;
 //BA.debugLineNum = 138936322;BA.debugLine="Dim id As ItemData = InnerReference.GetValue(inde";
_id = (xevolution.vrcg.devdemov2400.checklist3._itemdata)(_innerreference._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=138936324;
 //BA.debugLineNum = 138936324;BA.debugLine="InnerReference.ResizeItem(index, id.ExpandedHeigh";
_innerreference._resizeitem /*String*/ (null,_index,_id.ExpandedHeight /*int*/ );
RDebugUtils.currentLine=138936325;
 //BA.debugLineNum = 138936325;BA.debugLine="InnerReference.GetPanel(index).Tag = True";
_innerreference._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).setTag((Object)(__c.True));
RDebugUtils.currentLine=138936326;
 //BA.debugLineNum = 138936326;BA.debugLine="If (mUpDownIconExists) Then";
if ((__ref._mupdowniconexists /*boolean*/ )) { 
RDebugUtils.currentLine=138936327;
 //BA.debugLineNum = 138936327;BA.debugLine="AnimatedArrow(index, 0, 180)";
__ref._animatedarrow /*String*/ (null,_index,(int) (0),(int) (180));
 };
RDebugUtils.currentLine=138936329;
 //BA.debugLineNum = 138936329;BA.debugLine="End Sub";
return "";
}
public Object  _getvalue(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=140050432;
 //BA.debugLineNum = 140050432;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=140050433;
 //BA.debugLineNum = 140050433;BA.debugLine="If items.Size > Index Then";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_index) { 
RDebugUtils.currentLine=140050434;
 //BA.debugLineNum = 140050434;BA.debugLine="Return GetRawListItem(Index).Value";
if (true) return __ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,_index).Value /*Object*/ ;
 }else {
RDebugUtils.currentLine=140050436;
 //BA.debugLineNum = 140050436;BA.debugLine="Return Null";
if (true) return __c.Null;
 };
RDebugUtils.currentLine=140050438;
 //BA.debugLineNum = 140050438;BA.debugLine="End Sub";
return null;
}
public String  _resizeitem(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,int _itemheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "resizeitem", false))
	 {return ((String) Debug.delegate(ba, "resizeitem", new Object[] {_index,_itemheight}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
Object _value = null;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
RDebugUtils.currentLine=141033472;
 //BA.debugLineNum = 141033472;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
RDebugUtils.currentLine=141033473;
 //BA.debugLineNum = 141033473;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index);
RDebugUtils.currentLine=141033474;
 //BA.debugLineNum = 141033474;BA.debugLine="Dim value As Object = GetValue(Index)";
_value = __ref._getvalue /*Object*/ (null,_index);
RDebugUtils.currentLine=141033475;
 //BA.debugLineNum = 141033475;BA.debugLine="Dim parent As B4XView = p.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _p.getParent();
RDebugUtils.currentLine=141033476;
 //BA.debugLineNum = 141033476;BA.debugLine="p.Color = parent.Color";
_p.setColor(_parent.getColor());
RDebugUtils.currentLine=141033477;
 //BA.debugLineNum = 141033477;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=141033478;
 //BA.debugLineNum = 141033478;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
__ref._replaceat /*String*/ (null,_index,_p,_itemheight,_value);
RDebugUtils.currentLine=141033479;
 //BA.debugLineNum = 141033479;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _asview(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=139591680;
 //BA.debugLineNum = 139591680;BA.debugLine="Public Sub AsView As B4XView";
RDebugUtils.currentLine=139591681;
 //BA.debugLineNum = 139591681;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=139591682;
 //BA.debugLineNum = 139591682;BA.debugLine="End Sub";
return null;
}
public int  _getsize(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=139788288;
 //BA.debugLineNum = 139788288;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=139788289;
 //BA.debugLineNum = 139788289;BA.debugLine="Return items.Size";
if (true) return __ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=139788290;
 //BA.debugLineNum = 139788290;BA.debugLine="End Sub";
return 0;
}
public String  _jumptoitem(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "jumptoitem", false))
	 {return ((String) Debug.delegate(ba, "jumptoitem", new Object[] {_index}));}
RDebugUtils.currentLine=141361152;
 //BA.debugLineNum = 141361152;BA.debugLine="Public Sub JumpToItem(Index As Int)";
RDebugUtils.currentLine=141361153;
 //BA.debugLineNum = 141361153;BA.debugLine="SetScrollViewOffset(Min(GetMaxScrollOffset, FindI";
__ref._setscrollviewoffset /*String*/ (null,(float) (__c.Min(__ref._getmaxscrolloffset /*float*/ (null),__ref._finditemoffset /*int*/ (null,_index))));
RDebugUtils.currentLine=141361154;
 //BA.debugLineNum = 141361154;BA.debugLine="End Sub";
return "";
}
public String  _insertat(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "insertat", false))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_pnl,_value}));}
float _size = 0f;
RDebugUtils.currentLine=140378112;
 //BA.debugLineNum = 140378112;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=140378113;
 //BA.debugLineNum = 140378113;BA.debugLine="Dim size As Float";
_size = 0f;
RDebugUtils.currentLine=140378114;
 //BA.debugLineNum = 140378114;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140378115;
 //BA.debugLineNum = 140378115;BA.debugLine="size = pnl.Width";
_size = (float) (_pnl.getWidth());
 }else {
RDebugUtils.currentLine=140378117;
 //BA.debugLineNum = 140378117;BA.debugLine="size = pnl.Height";
_size = (float) (_pnl.getHeight());
 };
RDebugUtils.currentLine=140378119;
 //BA.debugLineNum = 140378119;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0, \"\")";
__ref._insertatimpl /*void*/ (null,_index,_pnl,(int) (_size),_value,(int) (0),(Object)(""));
RDebugUtils.currentLine=140378120;
 //BA.debugLineNum = 140378120;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(xevolution.vrcg.devdemov2400.expandedlistview __ref,Object _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "addtextitem", false))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_text,_value}));}
RDebugUtils.currentLine=140181504;
 //BA.debugLineNum = 140181504;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
RDebugUtils.currentLine=140181505;
 //BA.debugLineNum = 140181505;BA.debugLine="InsertAtTextItem(items.Size, Text, Value, \"\")";
__ref._insertattextitem /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_text,_value,(Object)(""));
RDebugUtils.currentLine=140181506;
 //BA.debugLineNum = 140181506;BA.debugLine="End Sub";
return "";
}
public String  _insertattextitem(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,Object _text,Object _value,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "insertattextitem", false))
	 {return ((String) Debug.delegate(ba, "insertattextitem", new Object[] {_index,_text,_value,_data}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _item = null;
RDebugUtils.currentLine=140312576;
 //BA.debugLineNum = 140312576;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
RDebugUtils.currentLine=140312577;
 //BA.debugLineNum = 140312577;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140312578;
 //BA.debugLineNum = 140312578;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
__c.LogImpl("6140312578","AddTextItem is only supported in vertical orientation.",0);
RDebugUtils.currentLine=140312579;
 //BA.debugLineNum = 140312579;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=140312581;
 //BA.debugLineNum = 140312581;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=140312582;
 //BA.debugLineNum = 140312582;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_text);
RDebugUtils.currentLine=140312583;
 //BA.debugLineNum = 140312583;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
_lbl.setHeight((int) (__c.Max(__c.DipToCurrent((int) (50)),_lbl.getHeight())));
RDebugUtils.currentLine=140312584;
 //BA.debugLineNum = 140312584;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
_pnl.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (2)),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__c.DipToCurrent((int) (10))),_lbl.getHeight());
RDebugUtils.currentLine=140312585;
 //BA.debugLineNum = 140312585;BA.debugLine="If xui.IsB4i = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()==__c.False) { 
RDebugUtils.currentLine=140312586;
 //BA.debugLineNum = 140312586;BA.debugLine="lbl.TextColor = DefaultTextColor";
_lbl.setTextColor(__ref._defaulttextcolor /*int*/ );
 };
RDebugUtils.currentLine=140312588;
 //BA.debugLineNum = 140312588;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
_pnl.setColor(__ref._defaulttextbackgroundcolor /*int*/ );
RDebugUtils.currentLine=140312589;
 //BA.debugLineNum = 140312589;BA.debugLine="pnl.Height = lbl.Height + 2dip";
_pnl.setHeight((int) (_lbl.getHeight()+__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=140312590;
 //BA.debugLineNum = 140312590;BA.debugLine="InsertAtWithData(Index, pnl, Value, Data)";
__ref._insertatwithdata /*String*/ (null,_index,_pnl,_value,_data);
RDebugUtils.currentLine=140312591;
 //BA.debugLineNum = 140312591;BA.debugLine="Dim item As CLVExpItem = GetRawListItem(Index)";
_item = __ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,_index);
RDebugUtils.currentLine=140312592;
 //BA.debugLineNum = 140312592;BA.debugLine="item.TextItem = True";
_item.TextItem /*boolean*/  = __c.True;
RDebugUtils.currentLine=140312593;
 //BA.debugLineNum = 140312593;BA.debugLine="End Sub";
return "";
}
public String  _addtextitemwithdata(xevolution.vrcg.devdemov2400.expandedlistview __ref,Object _text,Object _value,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "addtextitemwithdata", false))
	 {return ((String) Debug.delegate(ba, "addtextitemwithdata", new Object[] {_text,_value,_data}));}
RDebugUtils.currentLine=140247040;
 //BA.debugLineNum = 140247040;BA.debugLine="Public Sub AddTextItemWithData(Text As Object, Val";
RDebugUtils.currentLine=140247041;
 //BA.debugLineNum = 140247041;BA.debugLine="InsertAtTextItem(items.Size, Text, Value, Data)";
__ref._insertattextitem /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_text,_value,_data);
RDebugUtils.currentLine=140247042;
 //BA.debugLineNum = 140247042;BA.debugLine="End Sub";
return "";
}
public String  _addwithdata(xevolution.vrcg.devdemov2400.expandedlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "addwithdata", false))
	 {return ((String) Debug.delegate(ba, "addwithdata", new Object[] {_pnl,_value,_data}));}
RDebugUtils.currentLine=141295616;
 //BA.debugLineNum = 141295616;BA.debugLine="Sub AddWithData(Pnl As B4XView, Value As Object, D";
RDebugUtils.currentLine=141295617;
 //BA.debugLineNum = 141295617;BA.debugLine="InsertAtWithData(items.Size, Pnl, Value, Data)";
__ref._insertatwithdata /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_pnl,_value,_data);
RDebugUtils.currentLine=141295618;
 //BA.debugLineNum = 141295618;BA.debugLine="End Sub";
return "";
}
public String  _insertatwithdata(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "insertatwithdata", false))
	 {return ((String) Debug.delegate(ba, "insertatwithdata", new Object[] {_index,_pnl,_value,_data}));}
float _size = 0f;
RDebugUtils.currentLine=140443648;
 //BA.debugLineNum = 140443648;BA.debugLine="Public Sub InsertAtWithData(Index As Int, pnl As B";
RDebugUtils.currentLine=140443649;
 //BA.debugLineNum = 140443649;BA.debugLine="Dim size As Float";
_size = 0f;
RDebugUtils.currentLine=140443650;
 //BA.debugLineNum = 140443650;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140443651;
 //BA.debugLineNum = 140443651;BA.debugLine="size = pnl.Width";
_size = (float) (_pnl.getWidth());
 }else {
RDebugUtils.currentLine=140443653;
 //BA.debugLineNum = 140443653;BA.debugLine="size = pnl.Height";
_size = (float) (_pnl.getHeight());
 };
RDebugUtils.currentLine=140443655;
 //BA.debugLineNum = 140443655;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0, Data)";
__ref._insertatimpl /*void*/ (null,_index,_pnl,(int) (_size),_value,(int) (0),_data);
RDebugUtils.currentLine=140443656;
 //BA.debugLineNum = 140443656;BA.debugLine="End Sub";
return "";
}
public String  _animatedarrow(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,int _from,int _todegree) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "animatedarrow", false))
	 {return ((String) Debug.delegate(ba, "animatedarrow", new Object[] {_index,_from,_todegree}));}
xevolution.vrcg.devdemov2400.expandedlistview _innerreference = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnltitle = null;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=139001856;
 //BA.debugLineNum = 139001856;BA.debugLine="Sub AnimatedArrow(index As Int, From As Int, ToDeg";
RDebugUtils.currentLine=139001857;
 //BA.debugLineNum = 139001857;BA.debugLine="Dim InnerReference As ExpandedListView = Me";
_innerreference = (xevolution.vrcg.devdemov2400.expandedlistview)(this);
RDebugUtils.currentLine=139001858;
 //BA.debugLineNum = 139001858;BA.debugLine="Dim pnlTitle As B4XView = InnerReference.GetPanel";
_pnltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnltitle = _innerreference._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0));
RDebugUtils.currentLine=139001859;
 //BA.debugLineNum = 139001859;BA.debugLine="Dim iv As B4XView = pnlTitle.GetView(mUpDownIconI";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv = _pnltitle.GetView(__ref._mupdowniconindex /*int*/ );
RDebugUtils.currentLine=139001860;
 //BA.debugLineNum = 139001860;BA.debugLine="iv.SetRotationAnimated(0, From)";
_iv.SetRotationAnimated((int) (0),(float) (_from));
RDebugUtils.currentLine=139001861;
 //BA.debugLineNum = 139001861;BA.debugLine="iv.SetRotationAnimated(InnerReference.AnimationDu";
_iv.SetRotationAnimated(_innerreference._animationduration /*int*/ ,(float) (_todegree));
RDebugUtils.currentLine=139001862;
 //BA.debugLineNum = 139001862;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(xevolution.vrcg.devdemov2400.expandedlistview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _scrollbar = 0;
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _it = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=139132928;
 //BA.debugLineNum = 139132928;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=139132929;
 //BA.debugLineNum = 139132929;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=139132930;
 //BA.debugLineNum = 139132930;BA.debugLine="Dim scrollbar As Int";
_scrollbar = 0;
RDebugUtils.currentLine=139132931;
 //BA.debugLineNum = 139132931;BA.debugLine="If xui.IsB4J And ScrollBarsVisible Then scrollbar";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J() && __ref._scrollbarsvisible /*boolean*/ ) { 
_scrollbar = (int) (20);};
RDebugUtils.currentLine=139132932;
 //BA.debugLineNum = 139132932;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=139132933;
 //BA.debugLineNum = 139132933;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight((int) (_height-_scrollbar));
RDebugUtils.currentLine=139132934;
 //BA.debugLineNum = 139132934;BA.debugLine="For Each it As CLVExpItem In items";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(group6.Get(index6));
RDebugUtils.currentLine=139132935;
 //BA.debugLineNum = 139132935;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
RDebugUtils.currentLine=139132936;
 //BA.debugLineNum = 139132936;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).setHeight(_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
 }else {
RDebugUtils.currentLine=139132939;
 //BA.debugLineNum = 139132939;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_width-_scrollbar));
RDebugUtils.currentLine=139132940;
 //BA.debugLineNum = 139132940;BA.debugLine="For Each it As CLVExpItem In items";
{
final anywheresoftware.b4a.BA.IterableList group12 = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(group12.Get(index12));
RDebugUtils.currentLine=139132941;
 //BA.debugLineNum = 139132941;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth());
RDebugUtils.currentLine=139132942;
 //BA.debugLineNum = 139132942;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).setWidth(_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=139132943;
 //BA.debugLineNum = 139132943;BA.debugLine="If it.TextItem Then";
if (_it.TextItem /*boolean*/ ) { 
RDebugUtils.currentLine=139132944;
 //BA.debugLineNum = 139132944;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=139132945;
 //BA.debugLineNum = 139132945;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
_lbl.SetLayoutAnimated((int) (0),_lbl.getLeft(),_lbl.getTop(),(int) (_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_lbl.getLeft()),_lbl.getHeight());
 };
 }
};
 };
RDebugUtils.currentLine=139132949;
 //BA.debugLineNum = 139132949;BA.debugLine="If items.Size > 0 Then UpdateVisibleRange";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._updatevisiblerange /*String*/ (null);};
RDebugUtils.currentLine=139132950;
 //BA.debugLineNum = 139132950;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblerange(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "updatevisiblerange", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblerange", null));}
int _first = 0;
int _last = 0;
RDebugUtils.currentLine=140574720;
 //BA.debugLineNum = 140574720;BA.debugLine="Private Sub UpdateVisibleRange";
RDebugUtils.currentLine=140574721;
 //BA.debugLineNum = 140574721;BA.debugLine="If MonitorVisibleRange = False Or getSize = 0 The";
if (__ref._monitorvisiblerange /*boolean*/ ==__c.False || __ref._getsize /*int*/ (null)==0) { 
if (true) return "";};
RDebugUtils.currentLine=140574722;
 //BA.debugLineNum = 140574722;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
_first = __ref._getfirstvisibleindex /*int*/ (null);
RDebugUtils.currentLine=140574723;
 //BA.debugLineNum = 140574723;BA.debugLine="Dim last As Int = getLastVisibleIndex";
_last = __ref._getlastvisibleindex /*int*/ (null);
RDebugUtils.currentLine=140574724;
 //BA.debugLineNum = 140574724;BA.debugLine="If first <> mFirstVisibleIndex Or last <> mLastVi";
if (_first!=__ref._mfirstvisibleindex /*int*/  || _last!=__ref._mlastvisibleindex /*int*/ ) { 
RDebugUtils.currentLine=140574725;
 //BA.debugLineNum = 140574725;BA.debugLine="mFirstVisibleIndex = first";
__ref._mfirstvisibleindex /*int*/  = _first;
RDebugUtils.currentLine=140574726;
 //BA.debugLineNum = 140574726;BA.debugLine="mLastVisibleIndex = last";
__ref._mlastvisibleindex /*int*/  = _last;
RDebugUtils.currentLine=140574727;
 //BA.debugLineNum = 140574727;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_VisibleR";
__c.CallSubDelayed3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_VisibleRangeChanged",(Object)(__ref._mfirstvisibleindex /*int*/ ),(Object)(__ref._mlastvisibleindex /*int*/ ));
 };
RDebugUtils.currentLine=140574729;
 //BA.debugLineNum = 140574729;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
RDebugUtils.currentLine=138608640;
 //BA.debugLineNum = 138608640;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=138608641;
 //BA.debugLineNum = 138608641;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138608642;
 //BA.debugLineNum = 138608642;BA.debugLine="Private mBaseParent As B4XView";
_mbaseparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138608643;
 //BA.debugLineNum = 138608643;BA.debugLine="Private msvParent As B4XView";
_msvparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138608644;
 //BA.debugLineNum = 138608644;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138608645;
 //BA.debugLineNum = 138608645;BA.debugLine="Type CLVExpItem(Panel As B4XView, Size As Int, Va";
;
RDebugUtils.currentLine=138608646;
 //BA.debugLineNum = 138608646;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=138608647;
 //BA.debugLineNum = 138608647;BA.debugLine="Private mDividerSize As Float";
_mdividersize = 0f;
RDebugUtils.currentLine=138608648;
 //BA.debugLineNum = 138608648;BA.debugLine="Private EventName As String";
_eventname = "";
RDebugUtils.currentLine=138608649;
 //BA.debugLineNum = 138608649;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=138608650;
 //BA.debugLineNum = 138608650;BA.debugLine="Public DefaultTextColor As Int";
_defaulttextcolor = 0;
RDebugUtils.currentLine=138608651;
 //BA.debugLineNum = 138608651;BA.debugLine="Public DefaultTextBackgroundColor As Int";
_defaulttextbackgroundcolor = 0;
RDebugUtils.currentLine=138608652;
 //BA.debugLineNum = 138608652;BA.debugLine="Public AnimationDuration As Int = 300";
_animationduration = (int) (300);
RDebugUtils.currentLine=138608653;
 //BA.debugLineNum = 138608653;BA.debugLine="Private LastReachEndEvent As Long";
_lastreachendevent = 0L;
RDebugUtils.currentLine=138608654;
 //BA.debugLineNum = 138608654;BA.debugLine="Private PressedColor As Int";
_pressedcolor = 0;
RDebugUtils.currentLine=138608655;
 //BA.debugLineNum = 138608655;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=138608656;
 //BA.debugLineNum = 138608656;BA.debugLine="Private DesignerLabel As Label";
_designerlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=138608657;
 //BA.debugLineNum = 138608657;BA.debugLine="Private horizontal As Boolean";
_horizontal = false;
RDebugUtils.currentLine=138608658;
 //BA.debugLineNum = 138608658;BA.debugLine="Private mUpDownIconExists As Boolean = False";
_mupdowniconexists = __c.False;
RDebugUtils.currentLine=138608659;
 //BA.debugLineNum = 138608659;BA.debugLine="Private mUpDownIconIndex As Int = 0";
_mupdowniconindex = (int) (0);
RDebugUtils.currentLine=138608660;
 //BA.debugLineNum = 138608660;BA.debugLine="Private iData As List";
_idata = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=138608664;
 //BA.debugLineNum = 138608664;BA.debugLine="Private su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=138608668;
 //BA.debugLineNum = 138608668;BA.debugLine="Private mFirstVisibleIndex, mLastVisibleIndex As";
_mfirstvisibleindex = 0;
_mlastvisibleindex = 0;
RDebugUtils.currentLine=138608669;
 //BA.debugLineNum = 138608669;BA.debugLine="Private MonitorVisibleRange As Boolean";
_monitorvisiblerange = false;
RDebugUtils.currentLine=138608670;
 //BA.debugLineNum = 138608670;BA.debugLine="Private FireScrollChanged As Boolean";
_firescrollchanged = false;
RDebugUtils.currentLine=138608671;
 //BA.debugLineNum = 138608671;BA.debugLine="Private ScrollBarsVisible As Boolean";
_scrollbarsvisible = false;
RDebugUtils.currentLine=138608672;
 //BA.debugLineNum = 138608672;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewcontentsize(xevolution.vrcg.devdemov2400.expandedlistview __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "setscrollviewcontentsize", false))
	 {return ((String) Debug.delegate(ba, "setscrollviewcontentsize", new Object[] {_f}));}
RDebugUtils.currentLine=140902400;
 //BA.debugLineNum = 140902400;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
RDebugUtils.currentLine=140902401;
 //BA.debugLineNum = 140902401;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140902402;
 //BA.debugLineNum = 140902402;BA.debugLine="sv.ScrollViewContentWidth = f";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_f));
 }else {
RDebugUtils.currentLine=140902404;
 //BA.debugLineNum = 140902404;BA.debugLine="sv.ScrollViewContentHeight = f";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight((int) (_f));
 };
RDebugUtils.currentLine=140902406;
 //BA.debugLineNum = 140902406;BA.debugLine="End Sub";
return "";
}
public String  _resetvisibles(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "resetvisibles", false))
	 {return ((String) Debug.delegate(ba, "resetvisibles", null));}
RDebugUtils.currentLine=138739712;
 //BA.debugLineNum = 138739712;BA.debugLine="Private Sub ResetVisibles";
RDebugUtils.currentLine=138739713;
 //BA.debugLineNum = 138739713;BA.debugLine="mFirstVisibleIndex = -1";
__ref._mfirstvisibleindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=138739714;
 //BA.debugLineNum = 138739714;BA.debugLine="mLastVisibleIndex = 0x7FFFFFFF";
__ref._mlastvisibleindex /*int*/  = (int) (0x7fffffff);
RDebugUtils.currentLine=138739715;
 //BA.debugLineNum = 138739715;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(xevolution.vrcg.devdemov2400.expandedlistview __ref,Object _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_txt}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=142475264;
 //BA.debugLineNum = 142475264;BA.debugLine="Private Sub CreateLabel(txt As Object) As B4XView";
RDebugUtils.currentLine=142475265;
 //BA.debugLineNum = 142475265;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=142475266;
 //BA.debugLineNum = 142475266;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=142475267;
 //BA.debugLineNum = 142475267;BA.debugLine="lbl.Gravity = DesignerLabel.Gravity";
_lbl.setGravity(__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getGravity());
RDebugUtils.currentLine=142475268;
 //BA.debugLineNum = 142475268;BA.debugLine="lbl.TextSize = DesignerLabel.TextSize";
_lbl.setTextSize(__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize());
RDebugUtils.currentLine=142475269;
 //BA.debugLineNum = 142475269;BA.debugLine="lbl.SingleLine = False";
_lbl.setSingleLine(__c.False);
RDebugUtils.currentLine=142475270;
 //BA.debugLineNum = 142475270;BA.debugLine="lbl.Text = txt";
_lbl.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=142475271;
 //BA.debugLineNum = 142475271;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
_lbl.setWidth((int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=142475272;
 //BA.debugLineNum = 142475272;BA.debugLine="lbl.Height = su.MeasureMultilineTextHeight(lbl, t";
_lbl.setHeight(__ref._su /*anywheresoftware.b4a.objects.StringUtils*/ .MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),BA.ObjectToCharSequence(_txt)));
RDebugUtils.currentLine=142475273;
 //BA.debugLineNum = 142475273;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=142475274;
 //BA.debugLineNum = 142475274;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createpanel(xevolution.vrcg.devdemov2400.expandedlistview __ref,String _paneleventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "createpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createpanel", new Object[] {_paneleventname}));}
RDebugUtils.currentLine=142016512;
 //BA.debugLineNum = 142016512;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
RDebugUtils.currentLine=142016513;
 //BA.debugLineNum = 142016513;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_paneleventname);
RDebugUtils.currentLine=142016514;
 //BA.debugLineNum = 142016514;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createscrollview(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "createscrollview", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createscrollview", null));}
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=142278656;
 //BA.debugLineNum = 142278656;BA.debugLine="Private Sub CreateScrollView As B4XView";
RDebugUtils.currentLine=142278657;
 //BA.debugLineNum = 142278657;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=142278658;
 //BA.debugLineNum = 142278658;BA.debugLine="Dim hv As HorizontalScrollView";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
RDebugUtils.currentLine=142278659;
 //BA.debugLineNum = 142278659;BA.debugLine="hv.Initialize(0, \"sv\")";
_hv.Initialize(ba,(int) (0),"sv");
RDebugUtils.currentLine=142278660;
 //BA.debugLineNum = 142278660;BA.debugLine="Return hv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_hv.getObject()));
 }else {
RDebugUtils.currentLine=142278662;
 //BA.debugLineNum = 142278662;BA.debugLine="Dim nsv As ScrollView";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=142278663;
 //BA.debugLineNum = 142278663;BA.debugLine="nsv.Initialize2(0, \"sv\")";
_nsv.Initialize2(ba,(int) (0),"sv");
RDebugUtils.currentLine=142278664;
 //BA.debugLineNum = 142278664;BA.debugLine="Return nsv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_nsv.getObject()));
 };
RDebugUtils.currentLine=142278666;
 //BA.debugLineNum = 142278666;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(xevolution.vrcg.devdemov2400.expandedlistview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _o = "";
anywheresoftware.b4j.object.JavaObject _jsv = null;
RDebugUtils.currentLine=138870784;
 //BA.debugLineNum = 138870784;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=138870785;
 //BA.debugLineNum = 138870785;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=138870786;
 //BA.debugLineNum = 138870786;BA.debugLine="mBaseParent = mBase.Parent";
__ref._mbaseparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=138870787;
 //BA.debugLineNum = 138870787;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
_o = BA.ObjectToString(_props.GetDefault((Object)("ListOrientation"),(Object)("Vertical")));
RDebugUtils.currentLine=138870788;
 //BA.debugLineNum = 138870788;BA.debugLine="horizontal = o = \"Horizontal\"";
__ref._horizontal /*boolean*/  = (_o).equals("Horizontal");
RDebugUtils.currentLine=138870789;
 //BA.debugLineNum = 138870789;BA.debugLine="sv = CreateScrollView";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createscrollview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=138870790;
 //BA.debugLineNum = 138870790;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=138870791;
 //BA.debugLineNum = 138870791;BA.debugLine="msvParent = sv.Parent";
__ref._msvparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=138870792;
 //BA.debugLineNum = 138870792;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("DividerColor"))));
RDebugUtils.currentLine=138870793;
 //BA.debugLineNum = 138870793;BA.debugLine="mDividerSize = DipToCurrent(Props.Get(\"DividerHei";
__ref._mdividersize /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("DividerHeight"))))));
RDebugUtils.currentLine=138870794;
 //BA.debugLineNum = 138870794;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
__ref._pressedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("PressedColor")));
RDebugUtils.currentLine=138870795;
 //BA.debugLineNum = 138870795;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
__ref._animationduration /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("InsertAnimationDuration"),(Object)(__ref._animationduration /*int*/ ))));
RDebugUtils.currentLine=138870796;
 //BA.debugLineNum = 138870796;BA.debugLine="ScrollBarsVisible = Props.GetDefault(\"ShowScrollB";
__ref._scrollbarsvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowScrollBar"),(Object)(__c.True)));
RDebugUtils.currentLine=138870798;
 //BA.debugLineNum = 138870798;BA.debugLine="mUpDownIconExists = Props.GetDefault(\"UpDownIcon\"";
__ref._mupdowniconexists /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("UpDownIcon"),(Object)(__c.False)));
RDebugUtils.currentLine=138870799;
 //BA.debugLineNum = 138870799;BA.debugLine="mUpDownIconIndex = Props.GetDefault(\"UpDownIndex\"";
__ref._mupdowniconindex /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("UpDownIndex"),(Object)(0))));
RDebugUtils.currentLine=138870801;
 //BA.debugLineNum = 138870801;BA.debugLine="If ScrollBarsVisible = False Then";
if (__ref._scrollbarsvisible /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=138870807;
 //BA.debugLineNum = 138870807;BA.debugLine="Dim jsv As JavaObject = sv";
_jsv = new anywheresoftware.b4j.object.JavaObject();
_jsv = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=138870808;
 //BA.debugLineNum = 138870808;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=138870809;
 //BA.debugLineNum = 138870809;BA.debugLine="jsv.RunMethod(\"setHorizontalScrollBarEnabled\",";
_jsv.RunMethod("setHorizontalScrollBarEnabled",new Object[]{(Object)(__c.False)});
 }else {
RDebugUtils.currentLine=138870811;
 //BA.debugLineNum = 138870811;BA.debugLine="jsv.RunMethod(\"setVerticalScrollBarEnabled\", Ar";
_jsv.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
 };
 };
RDebugUtils.currentLine=138870819;
 //BA.debugLineNum = 138870819;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
__ref._defaulttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_lbl.getTextColor()));
RDebugUtils.currentLine=138870820;
 //BA.debugLineNum = 138870820;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
__ref._defaulttextbackgroundcolor /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor();
RDebugUtils.currentLine=138870821;
 //BA.debugLineNum = 138870821;BA.debugLine="DesignerLabel = Lbl";
__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/  = _lbl;
RDebugUtils.currentLine=138870822;
 //BA.debugLineNum = 138870822;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=138870823;
 //BA.debugLineNum = 138870823;BA.debugLine="End Sub";
return "";
}
public int  _findindexfromoffset(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "findindexfromoffset", false))
	 {return ((Integer) Debug.delegate(ba, "findindexfromoffset", new Object[] {_offset}));}
int _position = 0;
int _stepsize = 0;
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _currentitem = null;
int _nextoffset = 0;
int _prevoffset = 0;
RDebugUtils.currentLine=141623296;
 //BA.debugLineNum = 141623296;BA.debugLine="Public Sub FindIndexFromOffset(Offset As Int) As I";
RDebugUtils.currentLine=141623298;
 //BA.debugLineNum = 141623298;BA.debugLine="Dim Position As Int = items.Size / 2";
_position = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()/(double)2);
RDebugUtils.currentLine=141623299;
 //BA.debugLineNum = 141623299;BA.debugLine="Dim StepSize As Int = Ceil(Position / 2)";
_stepsize = (int) (__c.Ceil(_position/(double)2));
RDebugUtils.currentLine=141623300;
 //BA.debugLineNum = 141623300;BA.debugLine="Do While True";
while (__c.True) {
RDebugUtils.currentLine=141623301;
 //BA.debugLineNum = 141623301;BA.debugLine="Dim CurrentItem As CLVExpItem = items.Get(Positi";
_currentitem = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position));
RDebugUtils.currentLine=141623302;
 //BA.debugLineNum = 141623302;BA.debugLine="Dim NextOffset As Int";
_nextoffset = 0;
RDebugUtils.currentLine=141623303;
 //BA.debugLineNum = 141623303;BA.debugLine="If Position < items.Size - 1 Then";
if (_position<__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=141623304;
 //BA.debugLineNum = 141623304;BA.debugLine="NextOffset = GetRawListItem(Position + 1).Offse";
_nextoffset = (int) (__ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,(int) (_position+1)).Offset /*int*/ -1);
 }else {
RDebugUtils.currentLine=141623306;
 //BA.debugLineNum = 141623306;BA.debugLine="NextOffset = 0x7FFFFFFF";
_nextoffset = (int) (0x7fffffff);
 };
RDebugUtils.currentLine=141623308;
 //BA.debugLineNum = 141623308;BA.debugLine="Dim PrevOffset As Int";
_prevoffset = 0;
RDebugUtils.currentLine=141623309;
 //BA.debugLineNum = 141623309;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=141623310;
 //BA.debugLineNum = 141623310;BA.debugLine="PrevOffset = 0x80000000";
_prevoffset = (int) (0x80000000);
 }else {
RDebugUtils.currentLine=141623312;
 //BA.debugLineNum = 141623312;BA.debugLine="PrevOffset = CurrentItem.Offset";
_prevoffset = _currentitem.Offset /*int*/ ;
 };
RDebugUtils.currentLine=141623314;
 //BA.debugLineNum = 141623314;BA.debugLine="If Offset > NextOffset Then";
if (_offset>_nextoffset) { 
RDebugUtils.currentLine=141623315;
 //BA.debugLineNum = 141623315;BA.debugLine="Position = Min(Position + StepSize, items.Size";
_position = (int) (__c.Min(_position+_stepsize,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else 
{RDebugUtils.currentLine=141623316;
 //BA.debugLineNum = 141623316;BA.debugLine="Else if Offset < PrevOffset Then";
if (_offset<_prevoffset) { 
RDebugUtils.currentLine=141623317;
 //BA.debugLineNum = 141623317;BA.debugLine="Position = Max(Position - StepSize, 0)";
_position = (int) (__c.Max(_position-_stepsize,0));
 }else {
RDebugUtils.currentLine=141623319;
 //BA.debugLineNum = 141623319;BA.debugLine="Return Position";
if (true) return _position;
 }}
;
RDebugUtils.currentLine=141623321;
 //BA.debugLineNum = 141623321;BA.debugLine="StepSize = Ceil(StepSize / 2)";
_stepsize = (int) (__c.Ceil(_stepsize/(double)2));
 }
;
RDebugUtils.currentLine=141623323;
 //BA.debugLineNum = 141623323;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=141623324;
 //BA.debugLineNum = 141623324;BA.debugLine="End Sub";
return 0;
}
public xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem  _getrawlistitem(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getrawlistitem", false))
	 {return ((xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem) Debug.delegate(ba, "getrawlistitem", new Object[] {_index}));}
RDebugUtils.currentLine=139853824;
 //BA.debugLineNum = 139853824;BA.debugLine="Public Sub GetRawListItem(Index As Int) As CLVExpI";
RDebugUtils.currentLine=139853825;
 //BA.debugLineNum = 139853825;BA.debugLine="Return items.Get(Index)";
if (true) return (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=139853826;
 //BA.debugLineNum = 139853826;BA.debugLine="End Sub";
return null;
}
public int  _finditemoffset(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "finditemoffset", false))
	 {return ((Integer) Debug.delegate(ba, "finditemoffset", new Object[] {_index}));}
RDebugUtils.currentLine=141557760;
 //BA.debugLineNum = 141557760;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
RDebugUtils.currentLine=141557761;
 //BA.debugLineNum = 141557761;BA.debugLine="Return GetRawListItem(Index).Offset";
if (true) return __ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,_index).Offset /*int*/ ;
RDebugUtils.currentLine=141557762;
 //BA.debugLineNum = 141557762;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=139722752;
 //BA.debugLineNum = 139722752;BA.debugLine="Public Sub GetBase As B4XView";
RDebugUtils.currentLine=139722753;
 //BA.debugLineNum = 139722753;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=139722754;
 //BA.debugLineNum = 139722754;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbaseparent(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getbaseparent", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbaseparent", null));}
RDebugUtils.currentLine=142147584;
 //BA.debugLineNum = 142147584;BA.debugLine="Public Sub getBaseParent As B4XView";
RDebugUtils.currentLine=142147585;
 //BA.debugLineNum = 142147585;BA.debugLine="Return mBaseParent";
if (true) return __ref._mbaseparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=142147586;
 //BA.debugLineNum = 142147586;BA.debugLine="End Sub";
return null;
}
public float  _getdividersize(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getdividersize", false))
	 {return ((Float) Debug.delegate(ba, "getdividersize", null));}
RDebugUtils.currentLine=142082048;
 //BA.debugLineNum = 142082048;BA.debugLine="Public Sub getDividerSize As Float";
RDebugUtils.currentLine=142082049;
 //BA.debugLineNum = 142082049;BA.debugLine="Return mDividerSize";
if (true) return __ref._mdividersize /*float*/ ;
RDebugUtils.currentLine=142082050;
 //BA.debugLineNum = 142082050;BA.debugLine="End Sub";
return 0f;
}
public int  _getfirstvisibleindex(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getfirstvisibleindex", false))
	 {return ((Integer) Debug.delegate(ba, "getfirstvisibleindex", null));}
RDebugUtils.currentLine=141688832;
 //BA.debugLineNum = 141688832;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
RDebugUtils.currentLine=141688833;
 //BA.debugLineNum = 141688833;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return __ref._findindexfromoffset /*int*/ (null,(int) (__ref._getscrollviewoffset /*float*/ (null)+__ref._mdividersize /*float*/ ));
RDebugUtils.currentLine=141688834;
 //BA.debugLineNum = 141688834;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewoffset(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getscrollviewoffset", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewoffset", null));}
RDebugUtils.currentLine=140705792;
 //BA.debugLineNum = 140705792;BA.debugLine="Private Sub GetScrollViewOffset As Float";
RDebugUtils.currentLine=140705793;
 //BA.debugLineNum = 140705793;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140705794;
 //BA.debugLineNum = 140705794;BA.debugLine="Return sv.ScrollViewOffsetX";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetX());
 }else {
RDebugUtils.currentLine=140705796;
 //BA.debugLineNum = 140705796;BA.debugLine="Return sv.ScrollViewOffsetY";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY());
 };
RDebugUtils.currentLine=140705798;
 //BA.debugLineNum = 140705798;BA.debugLine="End Sub";
return 0f;
}
public Object  _getitemdata(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getitemdata", false))
	 {return ((Object) Debug.delegate(ba, "getitemdata", new Object[] {_index}));}
RDebugUtils.currentLine=139919360;
 //BA.debugLineNum = 139919360;BA.debugLine="Public Sub GetItemData(Index As Int) As Object";
RDebugUtils.currentLine=139919361;
 //BA.debugLineNum = 139919361;BA.debugLine="Return iData.Get(Index)";
if (true) return __ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index);
RDebugUtils.currentLine=139919362;
 //BA.debugLineNum = 139919362;BA.debugLine="End Sub";
return null;
}
public int  _getitemfromview(xevolution.vrcg.devdemov2400.expandedlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getitemfromview", false))
	 {return ((Integer) Debug.delegate(ba, "getitemfromview", new Object[] {_v}));}
Object _parent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _current = null;
RDebugUtils.currentLine=141885440;
 //BA.debugLineNum = 141885440;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
RDebugUtils.currentLine=141885441;
 //BA.debugLineNum = 141885441;BA.debugLine="Dim parent = v As Object, current As B4XView";
_parent = (Object)(_v.getObject());
_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=141885442;
 //BA.debugLineNum = 141885442;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
while ((__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel()).equals((java.lang.Object)(_parent)) == false) {
RDebugUtils.currentLine=141885443;
 //BA.debugLineNum = 141885443;BA.debugLine="current = parent";
_current = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_parent));
RDebugUtils.currentLine=141885444;
 //BA.debugLineNum = 141885444;BA.debugLine="parent = current.Parent";
_parent = (Object)(_current.getParent().getObject());
 }
;
RDebugUtils.currentLine=141885446;
 //BA.debugLineNum = 141885446;BA.debugLine="v = current";
_v = _current;
RDebugUtils.currentLine=141885447;
 //BA.debugLineNum = 141885447;BA.debugLine="Return v.Tag";
if (true) return (int)(BA.ObjectToNumber(_v.getTag()));
RDebugUtils.currentLine=141885448;
 //BA.debugLineNum = 141885448;BA.debugLine="End Sub";
return 0;
}
public int  _getitemsheight(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getitemsheight", false))
	 {return ((Integer) Debug.delegate(ba, "getitemsheight", null));}
int _ret = 0;
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _it = null;
RDebugUtils.currentLine=139526144;
 //BA.debugLineNum = 139526144;BA.debugLine="Public Sub getItemsHeight As Int";
RDebugUtils.currentLine=139526145;
 //BA.debugLineNum = 139526145;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=139526146;
 //BA.debugLineNum = 139526146;BA.debugLine="For Each it As CLVExpItem In items";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_it = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(group2.Get(index2));
RDebugUtils.currentLine=139526147;
 //BA.debugLineNum = 139526147;BA.debugLine="ret = ret + it.Panel.Height";
_ret = (int) (_ret+_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
RDebugUtils.currentLine=139526149;
 //BA.debugLineNum = 139526149;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=139526150;
 //BA.debugLineNum = 139526150;BA.debugLine="End Sub";
return 0;
}
public int  _getlastvisibleindex(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getlastvisibleindex", false))
	 {return ((Integer) Debug.delegate(ba, "getlastvisibleindex", null));}
RDebugUtils.currentLine=141754368;
 //BA.debugLineNum = 141754368;BA.debugLine="Public Sub getLastVisibleIndex As Int";
RDebugUtils.currentLine=141754369;
 //BA.debugLineNum = 141754369;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return __ref._findindexfromoffset /*int*/ (null,(int) (__ref._getscrollviewoffset /*float*/ (null)+__ref._getscrollviewvisiblesize /*float*/ (null)));
RDebugUtils.currentLine=141754370;
 //BA.debugLineNum = 141754370;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewvisiblesize(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getscrollviewvisiblesize", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewvisiblesize", null));}
RDebugUtils.currentLine=140640256;
 //BA.debugLineNum = 140640256;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
RDebugUtils.currentLine=140640257;
 //BA.debugLineNum = 140640257;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140640258;
 //BA.debugLineNum = 140640258;BA.debugLine="Return sv.Width";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 }else {
RDebugUtils.currentLine=140640260;
 //BA.debugLineNum = 140640260;BA.debugLine="Return sv.Height";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=140640262;
 //BA.debugLineNum = 140640262;BA.debugLine="End Sub";
return 0f;
}
public float  _getmaxscrolloffset(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getmaxscrolloffset", false))
	 {return ((Float) Debug.delegate(ba, "getmaxscrolloffset", null));}
RDebugUtils.currentLine=141426688;
 //BA.debugLineNum = 141426688;BA.debugLine="Private Sub GetMaxScrollOffset As Float";
RDebugUtils.currentLine=141426689;
 //BA.debugLineNum = 141426689;BA.debugLine="Return GetScrollViewContentSize - GetScrollViewVi";
if (true) return (float) (__ref._getscrollviewcontentsize /*float*/ (null)-__ref._getscrollviewvisiblesize /*float*/ (null));
RDebugUtils.currentLine=141426690;
 //BA.debugLineNum = 141426690;BA.debugLine="End Sub";
return 0f;
}
public float  _getscrollviewcontentsize(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getscrollviewcontentsize", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewcontentsize", null));}
RDebugUtils.currentLine=140836864;
 //BA.debugLineNum = 140836864;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
RDebugUtils.currentLine=140836865;
 //BA.debugLineNum = 140836865;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140836866;
 //BA.debugLineNum = 140836866;BA.debugLine="Return sv.ScrollViewContentWidth";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth());
 }else {
RDebugUtils.currentLine=140836868;
 //BA.debugLineNum = 140836868;BA.debugLine="Return sv.ScrollViewContentHeight";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
 };
RDebugUtils.currentLine=140836870;
 //BA.debugLineNum = 140836870;BA.debugLine="End Sub";
return 0f;
}
public int  _getscrollheight(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getscrollheight", false))
	 {return ((Integer) Debug.delegate(ba, "getscrollheight", null));}
RDebugUtils.currentLine=139460608;
 //BA.debugLineNum = 139460608;BA.debugLine="Public Sub getScrollHeight As Int";
RDebugUtils.currentLine=139460609;
 //BA.debugLineNum = 139460609;BA.debugLine="Return sv.ScrollViewContentHeight";
if (true) return __ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight();
RDebugUtils.currentLine=139460610;
 //BA.debugLineNum = 139460610;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getsvparent(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getsvparent", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getsvparent", null));}
RDebugUtils.currentLine=142213120;
 //BA.debugLineNum = 142213120;BA.debugLine="Public Sub getSVParent As B4XView";
RDebugUtils.currentLine=142213121;
 //BA.debugLineNum = 142213121;BA.debugLine="Return msvParent";
if (true) return __ref._msvparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=142213122;
 //BA.debugLineNum = 142213122;BA.debugLine="End Sub";
return null;
}
public boolean  _getupdowniconexists(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getupdowniconexists", false))
	 {return ((Boolean) Debug.delegate(ba, "getupdowniconexists", null));}
RDebugUtils.currentLine=139198464;
 //BA.debugLineNum = 139198464;BA.debugLine="Public Sub getUpDownIconExists As Boolean";
RDebugUtils.currentLine=139198465;
 //BA.debugLineNum = 139198465;BA.debugLine="Return mUpDownIconExists";
if (true) return __ref._mupdowniconexists /*boolean*/ ;
RDebugUtils.currentLine=139198466;
 //BA.debugLineNum = 139198466;BA.debugLine="End Sub";
return false;
}
public int  _getupdowniconindex(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "getupdowniconindex", false))
	 {return ((Integer) Debug.delegate(ba, "getupdowniconindex", null));}
RDebugUtils.currentLine=139329536;
 //BA.debugLineNum = 139329536;BA.debugLine="Public Sub getUpDownIconIndex As Int";
RDebugUtils.currentLine=139329537;
 //BA.debugLineNum = 139329537;BA.debugLine="Return mUpDownIconIndex";
if (true) return __ref._mupdowniconindex /*int*/ ;
RDebugUtils.currentLine=139329538;
 //BA.debugLineNum = 139329538;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(xevolution.vrcg.devdemov2400.expandedlistview __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname}));}
RDebugUtils.currentLine=138674176;
 //BA.debugLineNum = 138674176;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
RDebugUtils.currentLine=138674177;
 //BA.debugLineNum = 138674177;BA.debugLine="EventName = vEventName";
__ref._eventname /*String*/  = _veventname;
RDebugUtils.currentLine=138674178;
 //BA.debugLineNum = 138674178;BA.debugLine="CallBack = vCallBack";
__ref._callback /*Object*/  = _vcallback;
RDebugUtils.currentLine=138674179;
 //BA.debugLineNum = 138674179;BA.debugLine="items.Initialize";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=138674180;
 //BA.debugLineNum = 138674180;BA.debugLine="iData.Initialize";
__ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=138674181;
 //BA.debugLineNum = 138674181;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
__ref._defaulttextbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=138674182;
 //BA.debugLineNum = 138674182;BA.debugLine="DefaultTextColor = xui.Color_Black";
__ref._defaulttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=138674183;
 //BA.debugLineNum = 138674183;BA.debugLine="MonitorVisibleRange = xui.SubExists(CallBack, Eve";
__ref._monitorvisiblerange /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_VisibleRangeChanged",(int) (2));
RDebugUtils.currentLine=138674184;
 //BA.debugLineNum = 138674184;BA.debugLine="FireScrollChanged = xui.SubExists(CallBack, Event";
__ref._firescrollchanged /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ScrollChanged",(int) (1));
RDebugUtils.currentLine=138674185;
 //BA.debugLineNum = 138674185;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=138674186;
 //BA.debugLineNum = 138674186;BA.debugLine="End Sub";
return "";
}
public void  _insertatimpl(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemsize,Object _value,int _initialsize,Object _data) throws Exception{
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "insertatimpl", false))
	 {Debug.delegate(ba, "insertatimpl", new Object[] {_index,_pnl,_itemsize,_value,_initialsize,_data}); return;}
ResumableSub_InsertAtImpl rsub = new ResumableSub_InsertAtImpl(this,__ref,_index,_pnl,_itemsize,_value,_initialsize,_data);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertAtImpl extends BA.ResumableSub {
public ResumableSub_InsertAtImpl(xevolution.vrcg.devdemov2400.expandedlistview parent,xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemsize,Object _value,int _initialsize,Object _data) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._pnl = _pnl;
this._itemsize = _itemsize;
this._value = _value;
this._initialsize = _initialsize;
this._data = _data;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.expandedlistview __ref;
xevolution.vrcg.devdemov2400.expandedlistview parent;
int _index;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl;
int _itemsize;
Object _value;
int _initialsize;
Object _data;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _includedividierheight = 0;
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _newitem = null;
int _offset = 0;
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _previtem = null;
int _i = 0;
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _it = null;
int _newoffset = 0;
boolean _shouldsetpanelheight = false;
int step40;
int limit40;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="expandedlistview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=140509186;
 //BA.debugLineNum = 140509186;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"Panel");
RDebugUtils.currentLine=140509187;
 //BA.debugLineNum = 140509187;BA.debugLine="p.Color = Pnl.Color";
_p.setColor(_pnl.getColor());
RDebugUtils.currentLine=140509188;
 //BA.debugLineNum = 140509188;BA.debugLine="Pnl.Color = xui.Color_Transparent";
_pnl.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=140509189;
 //BA.debugLineNum = 140509189;BA.debugLine="If horizontal Then";
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
RDebugUtils.currentLine=140509190;
 //BA.debugLineNum = 140509190;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),_itemsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=140509192;
 //BA.debugLineNum = 140509192;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth(),_itemsize);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=140509194;
 //BA.debugLineNum = 140509194;BA.debugLine="p.Tag = Index";
_p.setTag((Object)(_index));
RDebugUtils.currentLine=140509195;
 //BA.debugLineNum = 140509195;BA.debugLine="Dim IncludeDividierHeight As Int";
_includedividierheight = 0;
RDebugUtils.currentLine=140509196;
 //BA.debugLineNum = 140509196;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = m";
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
RDebugUtils.currentLine=140509197;
 //BA.debugLineNum = 140509197;BA.debugLine="Dim NewItem As CLVExpItem";
_newitem = new xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem();
RDebugUtils.currentLine=140509198;
 //BA.debugLineNum = 140509198;BA.debugLine="NewItem.Panel = p";
_newitem.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _p;
RDebugUtils.currentLine=140509199;
 //BA.debugLineNum = 140509199;BA.debugLine="NewItem.Size = ItemSize";
_newitem.Size /*int*/  = _itemsize;
RDebugUtils.currentLine=140509200;
 //BA.debugLineNum = 140509200;BA.debugLine="NewItem.Value = Value";
_newitem.Value /*Object*/  = _value;
RDebugUtils.currentLine=140509201;
 //BA.debugLineNum = 140509201;BA.debugLine="NewItem.Color = p.Color";
_newitem.Color /*int*/  = _p.getColor();
RDebugUtils.currentLine=140509202;
 //BA.debugLineNum = 140509202;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
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
RDebugUtils.currentLine=140509203;
 //BA.debugLineNum = 140509203;BA.debugLine="items.Add(NewItem)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newitem));
RDebugUtils.currentLine=140509204;
 //BA.debugLineNum = 140509204;BA.debugLine="iData.Add(Data)";
__ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_data);
RDebugUtils.currentLine=140509205;
 //BA.debugLineNum = 140509205;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=140509206;
 //BA.debugLineNum = 140509206;BA.debugLine="If Index = 0 Then";
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
RDebugUtils.currentLine=140509207;
 //BA.debugLineNum = 140509207;BA.debugLine="offset = mDividerSize";
_offset = (int) (__ref._mdividersize /*float*/ );
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=140509209;
 //BA.debugLineNum = 140509209;BA.debugLine="offset = GetScrollViewContentSize";
_offset = (int) (__ref._getscrollviewcontentsize /*float*/ (null));
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=140509211;
 //BA.debugLineNum = 140509211;BA.debugLine="NewItem.Offset = offset";
_newitem.Offset /*int*/  = _offset;
RDebugUtils.currentLine=140509212;
 //BA.debugLineNum = 140509212;BA.debugLine="If horizontal Then";
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
RDebugUtils.currentLine=140509213;
 //BA.debugLineNum = 140509213;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_itemsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=140509215;
 //BA.debugLineNum = 140509215;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
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
RDebugUtils.currentLine=140509218;
 //BA.debugLineNum = 140509218;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=140509219;
 //BA.debugLineNum = 140509219;BA.debugLine="If Index = 0 Then";
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
RDebugUtils.currentLine=140509220;
 //BA.debugLineNum = 140509220;BA.debugLine="offset = mDividerSize";
_offset = (int) (__ref._mdividersize /*float*/ );
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=140509222;
 //BA.debugLineNum = 140509222;BA.debugLine="Dim PrevItem As CLVExpItem = items.Get(Index -";
_previtem = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_index-1)));
RDebugUtils.currentLine=140509223;
 //BA.debugLineNum = 140509223;BA.debugLine="offset = PrevItem.Offset + PrevItem.Size + mDiv";
_offset = (int) (_previtem.Offset /*int*/ +_previtem.Size /*int*/ +__ref._mdividersize /*float*/ );
 if (true) break;
;
RDebugUtils.currentLine=140509225;
 //BA.debugLineNum = 140509225;BA.debugLine="For i = Index To items.Size - 1";

case 37:
//for
this.state = 52;
step40 = 1;
limit40 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = _index ;
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
if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=140509226;
 //BA.debugLineNum = 140509226;BA.debugLine="Dim It As CLVExpItem = items.Get(i)";
_it = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=140509227;
 //BA.debugLineNum = 140509227;BA.debugLine="Dim NewOffset As Int = It.Offset + ItemSize - I";
_newoffset = (int) (_it.Offset /*int*/ +_itemsize-_initialsize+_includedividierheight);
RDebugUtils.currentLine=140509228;
 //BA.debugLineNum = 140509228;BA.debugLine="If Min(NewOffset, It.Offset) - GetScrollViewOff";
if (true) break;

case 40:
//if
this.state = 51;
if (parent.__c.Min(_newoffset,_it.Offset /*int*/ )-__ref._getscrollviewoffset /*float*/ (null)<__ref._getscrollviewvisiblesize /*float*/ (null)) { 
this.state = 42;
}else {
this.state = 50;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=140509229;
 //BA.debugLineNum = 140509229;BA.debugLine="It.Offset = NewOffset";
_it.Offset /*int*/  = _newoffset;
RDebugUtils.currentLine=140509230;
 //BA.debugLineNum = 140509230;BA.debugLine="If horizontal Then";
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
RDebugUtils.currentLine=140509231;
 //BA.debugLineNum = 140509231;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,_newoffset,(int) (0),_it.Size /*int*/ ,_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=140509233;
 //BA.debugLineNum = 140509233;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,(int) (0),_newoffset,_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_it.Size /*int*/ );
 if (true) break;

case 48:
//C
this.state = 51;
;
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=140509236;
 //BA.debugLineNum = 140509236;BA.debugLine="SetItemOffset(It, NewOffset)";
__ref._setitemoffset /*String*/ (null,_it,(float) (_newoffset));
 if (true) break;

case 51:
//C
this.state = 84;
;
RDebugUtils.currentLine=140509238;
 //BA.debugLineNum = 140509238;BA.debugLine="It.Panel.Tag = i + 1";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_i+1));
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
;
RDebugUtils.currentLine=140509240;
 //BA.debugLineNum = 140509240;BA.debugLine="items.InsertAt(Index, NewItem)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,(Object)(_newitem));
RDebugUtils.currentLine=140509241;
 //BA.debugLineNum = 140509241;BA.debugLine="iData.InsertAt(Index, Data)";
__ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,_data);
RDebugUtils.currentLine=140509242;
 //BA.debugLineNum = 140509242;BA.debugLine="NewItem.Offset = offset";
_newitem.Offset /*int*/  = _offset;
RDebugUtils.currentLine=140509243;
 //BA.debugLineNum = 140509243;BA.debugLine="If horizontal Then";
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
RDebugUtils.currentLine=140509244;
 //BA.debugLineNum = 140509244;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_initialsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=140509245;
 //BA.debugLineNum = 140509245;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
_p.SetLayoutAnimated(__ref._animationduration /*int*/ ,_offset,(int) (0),_itemsize,_p.getHeight());
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=140509247;
 //BA.debugLineNum = 140509247;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_initialsize);
RDebugUtils.currentLine=140509249;
 //BA.debugLineNum = 140509249;BA.debugLine="Dim ShouldSetPanelHeight As Boolean = InitialSi";
_shouldsetpanelheight = _initialsize>_itemsize;
RDebugUtils.currentLine=140509250;
 //BA.debugLineNum = 140509250;BA.debugLine="If ShouldSetPanelHeight = True Then 'collapse";
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
RDebugUtils.currentLine=140509251;
 //BA.debugLineNum = 140509251;BA.debugLine="Pnl.Height = InitialSize";
_pnl.setHeight(_initialsize);
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=140509253;
 //BA.debugLineNum = 140509253;BA.debugLine="p.SetLayoutAnimated(0, 0, offset, p.Width, Ite";
_p.SetLayoutAnimated((int) (0),(int) (0),_offset,_p.getWidth(),_itemsize);
 if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=140509255;
 //BA.debugLineNum = 140509255;BA.debugLine="p.SendToBack";
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
RDebugUtils.currentLine=140509260;
 //BA.debugLineNum = 140509260;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (__ref._getscrollviewcontentsize /*float*/ (null)+_itemsize-_initialsize+_includedividierheight));
RDebugUtils.currentLine=140509261;
 //BA.debugLineNum = 140509261;BA.debugLine="If items.Size = 1 Then SetScrollViewContentSize(G";
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
RDebugUtils.currentLine=140509262;
 //BA.debugLineNum = 140509262;BA.debugLine="If Index < mLastVisibleIndex Or GetRawListItem(mL";
if (true) break;

case 72:
//if
this.state = 75;
if (_index<__ref._mlastvisibleindex /*int*/  || __ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,__ref._mlastvisibleindex /*int*/ ).Offset /*int*/ +__ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,__ref._mlastvisibleindex /*int*/ ).Size /*int*/ +__ref._mdividersize /*float*/ <__ref._getscrollviewvisiblesize /*float*/ (null)) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=140509264;
 //BA.debugLineNum = 140509264;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=140509267;
 //BA.debugLineNum = 140509267;BA.debugLine="If ShouldSetPanelHeight Then";

case 75:
//if
this.state = 82;
if (_shouldsetpanelheight) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=140509268;
 //BA.debugLineNum = 140509268;BA.debugLine="Sleep(AnimationDuration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "expandedlistview", "insertatimpl"),__ref._animationduration /*int*/ );
this.state = 85;
return;
case 85:
//C
this.state = 78;
;
RDebugUtils.currentLine=140509269;
 //BA.debugLineNum = 140509269;BA.debugLine="If p.Parent.IsInitialized Then";
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
RDebugUtils.currentLine=140509271;
 //BA.debugLineNum = 140509271;BA.debugLine="p.Height = ItemSize";
_p.setHeight(_itemsize);
RDebugUtils.currentLine=140509272;
 //BA.debugLineNum = 140509272;BA.debugLine="Pnl.Height = ItemSize";
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
RDebugUtils.currentLine=140509275;
 //BA.debugLineNum = 140509275;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setitemoffset(xevolution.vrcg.devdemov2400.expandedlistview __ref,xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _item,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "setitemoffset", false))
	 {return ((String) Debug.delegate(ba, "setitemoffset", new Object[] {_item,_offset}));}
RDebugUtils.currentLine=140967936;
 //BA.debugLineNum = 140967936;BA.debugLine="Private Sub SetItemOffset (item As CLVExpItem, off";
RDebugUtils.currentLine=140967937;
 //BA.debugLineNum = 140967937;BA.debugLine="item.Offset = offset";
_item.Offset /*int*/  = (int) (_offset);
RDebugUtils.currentLine=140967938;
 //BA.debugLineNum = 140967938;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140967939;
 //BA.debugLineNum = 140967939;BA.debugLine="item.Panel.Left = offset";
_item.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (_offset));
 }else {
RDebugUtils.currentLine=140967941;
 //BA.debugLineNum = 140967941;BA.debugLine="item.Panel.Top = offset";
_item.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (_offset));
 };
RDebugUtils.currentLine=140967943;
 //BA.debugLineNum = 140967943;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewoffset(xevolution.vrcg.devdemov2400.expandedlistview __ref,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "setscrollviewoffset", false))
	 {return ((String) Debug.delegate(ba, "setscrollviewoffset", new Object[] {_offset}));}
RDebugUtils.currentLine=140771328;
 //BA.debugLineNum = 140771328;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
RDebugUtils.currentLine=140771329;
 //BA.debugLineNum = 140771329;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=140771330;
 //BA.debugLineNum = 140771330;BA.debugLine="sv.ScrollViewOffsetX = offset";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetX((int) (_offset));
 }else {
RDebugUtils.currentLine=140771332;
 //BA.debugLineNum = 140771332;BA.debugLine="sv.ScrollViewOffsetY = offset";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY((int) (_offset));
 };
RDebugUtils.currentLine=140771334;
 //BA.debugLineNum = 140771334;BA.debugLine="End Sub";
return "";
}
public String  _panel_click(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "panel_click", false))
	 {return ((String) Debug.delegate(ba, "panel_click", null));}
RDebugUtils.currentLine=142344192;
 //BA.debugLineNum = 142344192;BA.debugLine="Private Sub Panel_Click";
RDebugUtils.currentLine=142344193;
 //BA.debugLineNum = 142344193;BA.debugLine="PanelClickHandler(Sender)";
__ref._panelclickhandler /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=142344194;
 //BA.debugLineNum = 142344194;BA.debugLine="End Sub";
return "";
}
public void  _panelclickhandler(xevolution.vrcg.devdemov2400.expandedlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "panelclickhandler", false))
	 {Debug.delegate(ba, "panelclickhandler", new Object[] {_senderpanel}); return;}
ResumableSub_PanelClickHandler rsub = new ResumableSub_PanelClickHandler(this,__ref,_senderpanel);
rsub.resume(ba, null);
}
public static class ResumableSub_PanelClickHandler extends BA.ResumableSub {
public ResumableSub_PanelClickHandler(xevolution.vrcg.devdemov2400.expandedlistview parent,xevolution.vrcg.devdemov2400.expandedlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.expandedlistview __ref;
xevolution.vrcg.devdemov2400.expandedlistview parent;
anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel;
int _clr = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="expandedlistview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=141819905;
 //BA.debugLineNum = 141819905;BA.debugLine="Dim clr As Int = GetRawListItem(SenderPanel.Tag).";
_clr = __ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Color /*int*/ ;
RDebugUtils.currentLine=141819906;
 //BA.debugLineNum = 141819906;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedColo";
_senderpanel.SetColorAnimated((int) (50),_clr,__ref._pressedcolor /*int*/ );
RDebugUtils.currentLine=141819907;
 //BA.debugLineNum = 141819907;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";
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
RDebugUtils.currentLine=141819908;
 //BA.debugLineNum = 141819908;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
parent.__c.CallSubNew3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemClick",_senderpanel.getTag(),__ref._getrawlistitem /*xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem*/ (null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Value /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=141819910;
 //BA.debugLineNum = 141819910;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "expandedlistview", "panelclickhandler"),(int) (200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=141819911;
 //BA.debugLineNum = 141819911;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor, c";
_senderpanel.SetColorAnimated((int) (200),__ref._pressedcolor /*int*/ ,_clr);
RDebugUtils.currentLine=141819912;
 //BA.debugLineNum = 141819912;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _removeat(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "removeat", false))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _removeitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _i = 0;
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _item = null;
int _newoffset = 0;
RDebugUtils.currentLine=140115968;
 //BA.debugLineNum = 140115968;BA.debugLine="Public Sub RemoveAt(Index As Int)";
RDebugUtils.currentLine=140115969;
 //BA.debugLineNum = 140115969;BA.debugLine="If getSize <= 1 Then";
if (__ref._getsize /*int*/ (null)<=1) { 
RDebugUtils.currentLine=140115970;
 //BA.debugLineNum = 140115970;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=140115971;
 //BA.debugLineNum = 140115971;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=140115973;
 //BA.debugLineNum = 140115973;BA.debugLine="Dim RemoveItem As CLVExpItem = items.Get(Index)";
_removeitem = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=140115974;
 //BA.debugLineNum = 140115974;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=140115975;
 //BA.debugLineNum = 140115975;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (_index+1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=140115976;
 //BA.debugLineNum = 140115976;BA.debugLine="Dim item As CLVExpItem = items.Get(i)";
_item = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=140115977;
 //BA.debugLineNum = 140115977;BA.debugLine="p = item.Panel";
_p = _item.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=140115978;
 //BA.debugLineNum = 140115978;BA.debugLine="p.Tag = i - 1";
_p.setTag((Object)(_i-1));
RDebugUtils.currentLine=140115979;
 //BA.debugLineNum = 140115979;BA.debugLine="Dim NewOffset As Int = item.Offset - RemoveItem.";
_newoffset = (int) (_item.Offset /*int*/ -_removeitem.Size /*int*/ -__ref._mdividersize /*float*/ );
RDebugUtils.currentLine=140115980;
 //BA.debugLineNum = 140115980;BA.debugLine="SetItemOffset(item, NewOffset)";
__ref._setitemoffset /*String*/ (null,_item,(float) (_newoffset));
 }
};
RDebugUtils.currentLine=140115982;
 //BA.debugLineNum = 140115982;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (__ref._getscrollviewcontentsize /*float*/ (null)-_removeitem.Size /*int*/ -__ref._mdividersize /*float*/ ));
RDebugUtils.currentLine=140115983;
 //BA.debugLineNum = 140115983;BA.debugLine="items.RemoveAt(Index)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=140115984;
 //BA.debugLineNum = 140115984;BA.debugLine="iData.RemoveAt(Index)";
__ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=140115985;
 //BA.debugLineNum = 140115985;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=140115986;
 //BA.debugLineNum = 140115986;BA.debugLine="End Sub";
return "";
}
public String  _replaceat(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemheight,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "replaceat", false))
	 {return ((String) Debug.delegate(ba, "replaceat", new Object[] {_index,_pnl,_itemheight,_value}));}
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _removeitem = null;
Object _odata = null;
RDebugUtils.currentLine=141099008;
 //BA.debugLineNum = 141099008;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=141099009;
 //BA.debugLineNum = 141099009;BA.debugLine="Dim RemoveItem As CLVExpItem = items.Get(Index)";
_removeitem = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=141099010;
 //BA.debugLineNum = 141099010;BA.debugLine="items.RemoveAt(Index)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=141099011;
 //BA.debugLineNum = 141099011;BA.debugLine="Dim oData As Object = iData.Get(Index)";
_odata = __ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index);
RDebugUtils.currentLine=141099012;
 //BA.debugLineNum = 141099012;BA.debugLine="iData.RemoveAt(Index)";
__ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=141099013;
 //BA.debugLineNum = 141099013;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=141099014;
 //BA.debugLineNum = 141099014;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
__ref._insertatimpl /*void*/ (null,_index,_pnl,_itemheight,_value,_removeitem.Size /*int*/ ,_odata);
RDebugUtils.currentLine=141099015;
 //BA.debugLineNum = 141099015;BA.debugLine="End Sub";
return "";
}
public String  _replaceatwithdata(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemheight,Object _value,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "replaceatwithdata", false))
	 {return ((String) Debug.delegate(ba, "replaceatwithdata", new Object[] {_index,_pnl,_itemheight,_value,_data}));}
xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem _removeitem = null;
RDebugUtils.currentLine=141164544;
 //BA.debugLineNum = 141164544;BA.debugLine="Public Sub ReplaceAtWithData(Index As Int, pnl As";
RDebugUtils.currentLine=141164545;
 //BA.debugLineNum = 141164545;BA.debugLine="Dim RemoveItem As CLVExpItem = items.Get(Index)";
_removeitem = (xevolution.vrcg.devdemov2400.expandedlistview._clvexpitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=141164546;
 //BA.debugLineNum = 141164546;BA.debugLine="items.RemoveAt(Index)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=141164547;
 //BA.debugLineNum = 141164547;BA.debugLine="iData.RemoveAt(Index)";
__ref._idata /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=141164548;
 //BA.debugLineNum = 141164548;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=141164549;
 //BA.debugLineNum = 141164549;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
__ref._insertatimpl /*void*/ (null,_index,_pnl,_itemheight,_value,_removeitem.Size /*int*/ ,_data);
RDebugUtils.currentLine=141164550;
 //BA.debugLineNum = 141164550;BA.debugLine="End Sub";
return "";
}
public String  _scrollhandler(xevolution.vrcg.devdemov2400.expandedlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "scrollhandler", false))
	 {return ((String) Debug.delegate(ba, "scrollhandler", null));}
int _position = 0;
RDebugUtils.currentLine=141950976;
 //BA.debugLineNum = 141950976;BA.debugLine="Private Sub ScrollHandler";
RDebugUtils.currentLine=141950977;
 //BA.debugLineNum = 141950977;BA.debugLine="If items.Size = 0 Then Return";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=141950978;
 //BA.debugLineNum = 141950978;BA.debugLine="Dim position As Int = GetScrollViewOffset";
_position = (int) (__ref._getscrollviewoffset /*float*/ (null));
RDebugUtils.currentLine=141950979;
 //BA.debugLineNum = 141950979;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
if (_position+__ref._getscrollviewvisiblesize /*float*/ (null)>=__ref._getscrollviewcontentsize /*float*/ (null)-__c.DipToCurrent((int) (5)) && __c.DateTime.getNow()>__ref._lastreachendevent /*long*/ +100) { 
RDebugUtils.currentLine=141950980;
 //BA.debugLineNum = 141950980;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ReachEnd",(int) (0))) { 
RDebugUtils.currentLine=141950981;
 //BA.debugLineNum = 141950981;BA.debugLine="LastReachEndEvent = DateTime.Now";
__ref._lastreachendevent /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=141950982;
 //BA.debugLineNum = 141950982;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
__c.CallSubDelayed(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ReachEnd");
 }else {
RDebugUtils.currentLine=141950984;
 //BA.debugLineNum = 141950984;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
__ref._lastreachendevent /*long*/  = (long) (__c.DateTime.getNow()+1000*__c.DateTime.TicksPerDay);
 };
 };
RDebugUtils.currentLine=141950987;
 //BA.debugLineNum = 141950987;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
RDebugUtils.currentLine=141950988;
 //BA.debugLineNum = 141950988;BA.debugLine="If FireScrollChanged Then";
if (__ref._firescrollchanged /*boolean*/ ) { 
RDebugUtils.currentLine=141950989;
 //BA.debugLineNum = 141950989;BA.debugLine="CallSub2(CallBack, EventName & \"_ScrollChanged\",";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ScrollChanged",(Object)(_position));
 };
RDebugUtils.currentLine=141950991;
 //BA.debugLineNum = 141950991;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoitem(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "scrolltoitem", false))
	 {return ((String) Debug.delegate(ba, "scrolltoitem", new Object[] {_index}));}
float _offset = 0f;
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=141492224;
 //BA.debugLineNum = 141492224;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
RDebugUtils.currentLine=141492225;
 //BA.debugLineNum = 141492225;BA.debugLine="Dim offset As Float = Min(GetMaxScrollOffset, Fin";
_offset = (float) (__c.Min(__ref._getmaxscrolloffset /*float*/ (null),__ref._finditemoffset /*int*/ (null,_index)));
RDebugUtils.currentLine=141492237;
 //BA.debugLineNum = 141492237;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=141492238;
 //BA.debugLineNum = 141492238;BA.debugLine="Dim hv As HorizontalScrollView = sv";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
_hv = (anywheresoftware.b4a.objects.HorizontalScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper(), (android.widget.HorizontalScrollView)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=141492239;
 //BA.debugLineNum = 141492239;BA.debugLine="hv.ScrollPosition = offset 'smooth scroll";
_hv.setScrollPosition((int) (_offset));
 }else {
RDebugUtils.currentLine=141492241;
 //BA.debugLineNum = 141492241;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_nsv = (anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=141492242;
 //BA.debugLineNum = 141492242;BA.debugLine="nsv.ScrollPosition = offset";
_nsv.setScrollPosition((int) (_offset));
 };
RDebugUtils.currentLine=141492245;
 //BA.debugLineNum = 141492245;BA.debugLine="End Sub";
return "";
}
public String  _setupdowniconexists(xevolution.vrcg.devdemov2400.expandedlistview __ref,boolean _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "setupdowniconexists", false))
	 {return ((String) Debug.delegate(ba, "setupdowniconexists", new Object[] {_val}));}
RDebugUtils.currentLine=139264000;
 //BA.debugLineNum = 139264000;BA.debugLine="Public Sub setUpDownIconExists(val As Boolean)";
RDebugUtils.currentLine=139264001;
 //BA.debugLineNum = 139264001;BA.debugLine="mUpDownIconExists = val";
__ref._mupdowniconexists /*boolean*/  = _val;
RDebugUtils.currentLine=139264002;
 //BA.debugLineNum = 139264002;BA.debugLine="End Sub";
return "";
}
public String  _setupdowniconindex(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "setupdowniconindex", false))
	 {return ((String) Debug.delegate(ba, "setupdowniconindex", new Object[] {_val}));}
RDebugUtils.currentLine=139395072;
 //BA.debugLineNum = 139395072;BA.debugLine="Public Sub setUpDownIconIndex(val As Int)";
RDebugUtils.currentLine=139395073;
 //BA.debugLineNum = 139395073;BA.debugLine="mUpDownIconIndex = val";
__ref._mupdowniconindex /*int*/  = _val;
RDebugUtils.currentLine=139395074;
 //BA.debugLineNum = 139395074;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(xevolution.vrcg.devdemov2400.expandedlistview __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="expandedlistview";
if (Debug.shouldDelegate(ba, "sv_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=142409728;
 //BA.debugLineNum = 142409728;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=142409729;
 //BA.debugLineNum = 142409729;BA.debugLine="ScrollHandler";
__ref._scrollhandler /*String*/ (null);
RDebugUtils.currentLine=142409730;
 //BA.debugLineNum = 142409730;BA.debugLine="End Sub";
return "";
}
}