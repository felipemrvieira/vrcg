package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class badger extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.badger");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.badger.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _views = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _stub = null;
public int _radius = 0;
public int _animationduration = 0;
public float _cx = 0f;
public float _cy = 0f;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _color = 0;
public int _textcolor = 0;
public int _thisorientation = 0;
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
public String  _initialize(xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=118358016;
 //BA.debugLineNum = 118358016;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=118358017;
 //BA.debugLineNum = 118358017;BA.debugLine="views.Initialize";
__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=118358018;
 //BA.debugLineNum = 118358018;BA.debugLine="thisorientation = 0";
__ref._thisorientation /*int*/  = (int) (0);
RDebugUtils.currentLine=118358019;
 //BA.debugLineNum = 118358019;BA.debugLine="End Sub";
return "";
}
public String  _setbadge(xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,int _badge,int _orientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "setbadge", false))
	 {return ((String) Debug.delegate(ba, "setbadge", new Object[] {_view,_badge,_orientation}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=118423552;
 //BA.debugLineNum = 118423552;BA.debugLine="Public Sub SetBadge(view As B4XView, Badge As Int,";
RDebugUtils.currentLine=118423553;
 //BA.debugLineNum = 118423553;BA.debugLine="If views.ContainsKey(view) Then";
if (__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_view.getObject()))) { 
RDebugUtils.currentLine=118423554;
 //BA.debugLineNum = 118423554;BA.debugLine="If Badge = 0 Then";
if (_badge==0) { 
RDebugUtils.currentLine=118423555;
 //BA.debugLineNum = 118423555;BA.debugLine="RemoveBadge(view)";
__ref._removebadge /*void*/ (null,_view);
 }else {
RDebugUtils.currentLine=118423557;
 //BA.debugLineNum = 118423557;BA.debugLine="ReplaceLabel(view, Badge)";
__ref._replacelabel /*void*/ (null,_view,_badge);
 };
 }else {
RDebugUtils.currentLine=118423560;
 //BA.debugLineNum = 118423560;BA.debugLine="If Badge > 0 Then";
if (_badge>0) { 
RDebugUtils.currentLine=118423561;
 //BA.debugLineNum = 118423561;BA.debugLine="Dim p As B4XView = CreateNewPanel(view, Badge,";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createnewpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_view,_badge,_orientation);
RDebugUtils.currentLine=118423562;
 //BA.debugLineNum = 118423562;BA.debugLine="CreateLabel(p, Badge)";
__ref._createlabel /*String*/ (null,_p,_badge);
RDebugUtils.currentLine=118423563;
 //BA.debugLineNum = 118423563;BA.debugLine="p.SetLayoutAnimated(animationDuration, cx - rad";
_p.SetLayoutAnimated(__ref._animationduration /*int*/ ,(int) (__ref._cx /*float*/ -__ref._radius /*int*/ ),(int) (__ref._cy /*float*/ -__ref._radius /*int*/ ),(int) (__ref._radius /*int*/ *2),(int) (__ref._radius /*int*/ *2));
RDebugUtils.currentLine=118423564;
 //BA.debugLineNum = 118423564;BA.debugLine="views.Put(view, p)";
__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_view.getObject()),(Object)(_p.getObject()));
 };
 };
RDebugUtils.currentLine=118423567;
 //BA.debugLineNum = 118423567;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.badger __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
RDebugUtils.currentLine=118292480;
 //BA.debugLineNum = 118292480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=118292481;
 //BA.debugLineNum = 118292481;BA.debugLine="Private views As Map";
_views = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=118292482;
 //BA.debugLineNum = 118292482;BA.debugLine="Private stub As B4XView 'ignore this is required";
_stub = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=118292483;
 //BA.debugLineNum = 118292483;BA.debugLine="Private radius As Int = 15dip";
_radius = __c.DipToCurrent((int) (15));
RDebugUtils.currentLine=118292484;
 //BA.debugLineNum = 118292484;BA.debugLine="Private animationDuration As Int = 0 '500";
_animationduration = (int) (0);
RDebugUtils.currentLine=118292485;
 //BA.debugLineNum = 118292485;BA.debugLine="Private cx, cy As Float";
_cx = 0f;
_cy = 0f;
RDebugUtils.currentLine=118292486;
 //BA.debugLineNum = 118292486;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=118292487;
 //BA.debugLineNum = 118292487;BA.debugLine="Private color As Int = xui.Color_Red";
_color = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red;
RDebugUtils.currentLine=118292488;
 //BA.debugLineNum = 118292488;BA.debugLine="Private textColor As Int = xui.Color_White";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=118292489;
 //BA.debugLineNum = 118292489;BA.debugLine="Private thisorientation As Int = 0";
_thisorientation = (int) (0);
RDebugUtils.currentLine=118292490;
 //BA.debugLineNum = 118292490;BA.debugLine="End Sub";
return "";
}
public String  _createlabel(xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p,int _count) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((String) Debug.delegate(ba, "createlabel", new Object[] {_p,_count}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _duration = 0;
RDebugUtils.currentLine=118882304;
 //BA.debugLineNum = 118882304;BA.debugLine="Private Sub CreateLabel(p As B4XView, count As Int";
RDebugUtils.currentLine=118882305;
 //BA.debugLineNum = 118882305;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=118882306;
 //BA.debugLineNum = 118882306;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=118882307;
 //BA.debugLineNum = 118882307;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=118882308;
 //BA.debugLineNum = 118882308;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(16)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16)));
RDebugUtils.currentLine=118882309;
 //BA.debugLineNum = 118882309;BA.debugLine="xlbl.TextColor = textColor";
_xlbl.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=118882310;
 //BA.debugLineNum = 118882310;BA.debugLine="xlbl.Text = count";
_xlbl.setText(BA.ObjectToCharSequence(_count));
RDebugUtils.currentLine=118882311;
 //BA.debugLineNum = 118882311;BA.debugLine="p.AddView(xlbl, radius, radius, 0, 0)";
_p.AddView((android.view.View)(_xlbl.getObject()),__ref._radius /*int*/ ,__ref._radius /*int*/ ,(int) (0),(int) (0));
RDebugUtils.currentLine=118882312;
 //BA.debugLineNum = 118882312;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=118882313;
 //BA.debugLineNum = 118882313;BA.debugLine="Dim duration As Int = 0 'animationDuration";
_duration = (int) (0);
RDebugUtils.currentLine=118882314;
 //BA.debugLineNum = 118882314;BA.debugLine="xlbl.SetLayoutAnimated(duration, 0, 0, radius * 2";
_xlbl.SetLayoutAnimated(_duration,(int) (0),(int) (0),(int) (__ref._radius /*int*/ *2),(int) (__ref._radius /*int*/ *2));
RDebugUtils.currentLine=118882315;
 //BA.debugLineNum = 118882315;BA.debugLine="xlbl.Visible = False";
_xlbl.setVisible(__c.False);
RDebugUtils.currentLine=118882316;
 //BA.debugLineNum = 118882316;BA.debugLine="xlbl.SetVisibleAnimated(animationDuration, True)";
_xlbl.SetVisibleAnimated(__ref._animationduration /*int*/ ,__c.True);
RDebugUtils.currentLine=118882317;
 //BA.debugLineNum = 118882317;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createnewpanel(xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,int _count,int _orientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "createnewpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createnewpanel", new Object[] {_view,_count,_orientation}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
RDebugUtils.currentLine=118816768;
 //BA.debugLineNum = 118816768;BA.debugLine="Private Sub CreateNewPanel(view As B4XView, count";
RDebugUtils.currentLine=118816772;
 //BA.debugLineNum = 118816772;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=118816774;
 //BA.debugLineNum = 118816774;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=118816776;
 //BA.debugLineNum = 118816776;BA.debugLine="p.SetElevationAnimated(animationDuration, 8dip)";
_p.SetElevationAnimated(__ref._animationduration /*int*/ ,(float) (__c.DipToCurrent((int) (8))));
RDebugUtils.currentLine=118816778;
 //BA.debugLineNum = 118816778;BA.debugLine="Dim xp As B4XView = p";
_xp = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xp = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=118816779;
 //BA.debugLineNum = 118816779;BA.debugLine="xp.SetColorAndBorder(color, 0, color, radius)";
_xp.SetColorAndBorder(__ref._color /*int*/ ,(int) (0),__ref._color /*int*/ ,__ref._radius /*int*/ );
RDebugUtils.currentLine=118816780;
 //BA.debugLineNum = 118816780;BA.debugLine="If (Orientation = 0) Then";
if ((_orientation==0)) { 
RDebugUtils.currentLine=118816781;
 //BA.debugLineNum = 118816781;BA.debugLine="cx = view.Left + view.Width";
__ref._cx /*float*/  = (float) (_view.getLeft()+_view.getWidth());
RDebugUtils.currentLine=118816782;
 //BA.debugLineNum = 118816782;BA.debugLine="cy = view.Top";
__ref._cy /*float*/  = (float) (_view.getTop());
 }else 
{RDebugUtils.currentLine=118816783;
 //BA.debugLineNum = 118816783;BA.debugLine="else if (Orientation = 1) Then";
if ((_orientation==1)) { 
RDebugUtils.currentLine=118816784;
 //BA.debugLineNum = 118816784;BA.debugLine="cx = view.Left";
__ref._cx /*float*/  = (float) (_view.getLeft());
RDebugUtils.currentLine=118816785;
 //BA.debugLineNum = 118816785;BA.debugLine="cy = view.Top";
__ref._cy /*float*/  = (float) (_view.getTop());
 }else 
{RDebugUtils.currentLine=118816786;
 //BA.debugLineNum = 118816786;BA.debugLine="else if (Orientation = 2) Then";
if ((_orientation==2)) { 
RDebugUtils.currentLine=118816787;
 //BA.debugLineNum = 118816787;BA.debugLine="cx = view.Left";
__ref._cx /*float*/  = (float) (_view.getLeft());
RDebugUtils.currentLine=118816788;
 //BA.debugLineNum = 118816788;BA.debugLine="cy = view.Top + view.Height";
__ref._cy /*float*/  = (float) (_view.getTop()+_view.getHeight());
 }else {
RDebugUtils.currentLine=118816790;
 //BA.debugLineNum = 118816790;BA.debugLine="cx = view.Left + view.Width";
__ref._cx /*float*/  = (float) (_view.getLeft()+_view.getWidth());
RDebugUtils.currentLine=118816791;
 //BA.debugLineNum = 118816791;BA.debugLine="cy = view.Top + view.Height";
__ref._cy /*float*/  = (float) (_view.getTop()+_view.getHeight());
 }}}
;
RDebugUtils.currentLine=118816793;
 //BA.debugLineNum = 118816793;BA.debugLine="Dim parent As B4XView = view.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _view.getParent();
RDebugUtils.currentLine=118816794;
 //BA.debugLineNum = 118816794;BA.debugLine="parent.AddView(xp, cx, cy, 0, 0)";
_parent.AddView((android.view.View)(_xp.getObject()),(int) (__ref._cx /*float*/ ),(int) (__ref._cy /*float*/ ),(int) (0),(int) (0));
RDebugUtils.currentLine=118816795;
 //BA.debugLineNum = 118816795;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=118816796;
 //BA.debugLineNum = 118816796;BA.debugLine="End Sub";
return null;
}
public int  _getbadge(xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "getbadge", false))
	 {return ((Integer) Debug.delegate(ba, "getbadge", new Object[] {_view}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=118620160;
 //BA.debugLineNum = 118620160;BA.debugLine="Public Sub GetBadge(view As B4XView) As Int";
RDebugUtils.currentLine=118620161;
 //BA.debugLineNum = 118620161;BA.debugLine="If views.ContainsKey(view) Then";
if (__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_view.getObject()))) { 
RDebugUtils.currentLine=118620162;
 //BA.debugLineNum = 118620162;BA.debugLine="Dim lbl As B4XView = GetLabel(GetPanel(view))";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject())));
RDebugUtils.currentLine=118620163;
 //BA.debugLineNum = 118620163;BA.debugLine="Return lbl.Text";
if (true) return (int)(Double.parseDouble(_lbl.getText()));
 }else {
RDebugUtils.currentLine=118620165;
 //BA.debugLineNum = 118620165;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=118620167;
 //BA.debugLineNum = 118620167;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabel(xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _panel) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "getlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlabel", new Object[] {_panel}));}
RDebugUtils.currentLine=118751232;
 //BA.debugLineNum = 118751232;BA.debugLine="Private Sub GetLabel(panel As B4XView) As B4XView";
RDebugUtils.currentLine=118751233;
 //BA.debugLineNum = 118751233;BA.debugLine="Return panel.GetView(panel.NumberOfViews - 1)";
if (true) return _panel.GetView((int) (_panel.getNumberOfViews()-1));
RDebugUtils.currentLine=118751234;
 //BA.debugLineNum = 118751234;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(xevolution.vrcg.devdemov2400.badger __ref,Object _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_view}));}
RDebugUtils.currentLine=118685696;
 //BA.debugLineNum = 118685696;BA.debugLine="Private Sub GetPanel (view As Object) As B4XView";
RDebugUtils.currentLine=118685697;
 //BA.debugLineNum = 118685697;BA.debugLine="Return views.Get(view)";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_view)));
RDebugUtils.currentLine=118685698;
 //BA.debugLineNum = 118685698;BA.debugLine="End Sub";
return null;
}
public void  _removebadge(xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "removebadge", false))
	 {Debug.delegate(ba, "removebadge", new Object[] {_view}); return;}
ResumableSub_RemoveBadge rsub = new ResumableSub_RemoveBadge(this,__ref,_view);
rsub.resume(ba, null);
}
public static class ResumableSub_RemoveBadge extends BA.ResumableSub {
public ResumableSub_RemoveBadge(xevolution.vrcg.devdemov2400.badger parent,xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.badger __ref;
xevolution.vrcg.devdemov2400.badger parent;
anywheresoftware.b4a.objects.B4XViewWrapper _view;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="badger";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=118489089;
 //BA.debugLineNum = 118489089;BA.debugLine="Dim p As B4XView = GetPanel(view)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject()));
RDebugUtils.currentLine=118489090;
 //BA.debugLineNum = 118489090;BA.debugLine="GetLabel(p).RemoveViewFromParent";
__ref._getlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_p).RemoveViewFromParent();
RDebugUtils.currentLine=118489091;
 //BA.debugLineNum = 118489091;BA.debugLine="views.Remove(view)";
__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_view.getObject()));
RDebugUtils.currentLine=118489092;
 //BA.debugLineNum = 118489092;BA.debugLine="p.SetLayoutAnimated(animationDuration, cx, cy, 0,";
_p.SetLayoutAnimated(__ref._animationduration /*int*/ ,(int) (__ref._cx /*float*/ ),(int) (__ref._cy /*float*/ ),(int) (0),(int) (0));
RDebugUtils.currentLine=118489093;
 //BA.debugLineNum = 118489093;BA.debugLine="Sleep(50) 'animationDuration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "badger", "removebadge"),(int) (50));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=118489094;
 //BA.debugLineNum = 118489094;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=118489095;
 //BA.debugLineNum = 118489095;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _replacelabel(xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,int _badge) throws Exception{
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "replacelabel", false))
	 {Debug.delegate(ba, "replacelabel", new Object[] {_view,_badge}); return;}
ResumableSub_ReplaceLabel rsub = new ResumableSub_ReplaceLabel(this,__ref,_view,_badge);
rsub.resume(ba, null);
}
public static class ResumableSub_ReplaceLabel extends BA.ResumableSub {
public ResumableSub_ReplaceLabel(xevolution.vrcg.devdemov2400.badger parent,xevolution.vrcg.devdemov2400.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,int _badge) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this._badge = _badge;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.badger __ref;
xevolution.vrcg.devdemov2400.badger parent;
anywheresoftware.b4a.objects.B4XViewWrapper _view;
int _badge;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="badger";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=118554625;
 //BA.debugLineNum = 118554625;BA.debugLine="Dim lbl As B4XView = GetLabel(GetPanel(view))";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject())));
RDebugUtils.currentLine=118554627;
 //BA.debugLineNum = 118554627;BA.debugLine="lbl.SetLayoutAnimated(animationDuration, radius +";
_lbl.SetLayoutAnimated(__ref._animationduration /*int*/ ,(int) (__ref._radius /*int*/ +parent.__c.DipToCurrent((int) (8))),(int) (0),(int) (__ref._radius /*int*/ *2),(int) (__ref._radius /*int*/ *2));
RDebugUtils.currentLine=118554628;
 //BA.debugLineNum = 118554628;BA.debugLine="CreateLabel(GetPanel(view), Badge)";
__ref._createlabel /*String*/ (null,__ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject())),_badge);
RDebugUtils.currentLine=118554629;
 //BA.debugLineNum = 118554629;BA.debugLine="Sleep(50) 'animationDuration / 2)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "badger", "replacelabel"),(int) (50));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=118554630;
 //BA.debugLineNum = 118554630;BA.debugLine="lbl.RemoveViewFromParent";
_lbl.RemoveViewFromParent();
RDebugUtils.currentLine=118554631;
 //BA.debugLineNum = 118554631;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}