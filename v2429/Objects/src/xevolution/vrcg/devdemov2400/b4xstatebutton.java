package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xstatebutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.b4xstatebutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.b4xstatebutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _sbg{
public boolean IsInitialized;
public int State;
public int Group;
public String Reference;
public String mainTag;
public void Initialize() {
IsInitialized = true;
State = 0;
Group = 0;
Reference = "";
mainTag = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.LabelWrapper _mbaselabel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _mbutton = null;
public int _mstate = 0;
public String _mreference = "";
public int _mconformity = 0;
public boolean _mbooleanstate = false;
public int _mdefaultcolor = 0;
public int _mtextstatecolor = 0;
public int _mfirststatecolor = 0;
public int _msecondstatecolor = 0;
public int _mthirdstatecolor = 0;
public int _mbordercolor = 0;
public int _mbordersize = 0;
public boolean _mshowborder = false;
public int _mradiussize = 0;
public boolean _musedip = false;
public int _mbuttongroup = 0;
public Object _mtag = null;
public boolean _menabled = false;
public boolean _mallowclick = false;
public anywheresoftware.b4a.objects.ButtonWrapper _lastbutton = null;
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
public String  _settext(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,String _thetext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "settext", false))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_thetext}));}
RDebugUtils.currentLine=115998720;
 //BA.debugLineNum = 115998720;BA.debugLine="Public Sub setText(theText As String)";
RDebugUtils.currentLine=115998721;
 //BA.debugLineNum = 115998721;BA.debugLine="mButton.Text = theText";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(_thetext));
RDebugUtils.currentLine=115998722;
 //BA.debugLineNum = 115998722;BA.debugLine="End Sub";
return "";
}
public String  _gettext(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "gettext", false))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=115933184;
 //BA.debugLineNum = 115933184;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=115933185;
 //BA.debugLineNum = 115933185;BA.debugLine="Return mButton.Text";
if (true) return __ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText();
RDebugUtils.currentLine=115933186;
 //BA.debugLineNum = 115933186;BA.debugLine="End Sub";
return "";
}
public Object  _gettag(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "gettag", false))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=115408896;
 //BA.debugLineNum = 115408896;BA.debugLine="Public Sub getTag As Object";
RDebugUtils.currentLine=115408897;
 //BA.debugLineNum = 115408897;BA.debugLine="Return mTag";
if (true) return __ref._mtag /*Object*/ ;
RDebugUtils.currentLine=115408898;
 //BA.debugLineNum = 115408898;BA.debugLine="End Sub";
return null;
}
public String  _settag(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,Object _theobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "settag", false))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_theobj}));}
RDebugUtils.currentLine=115474432;
 //BA.debugLineNum = 115474432;BA.debugLine="Public Sub setTag(theObj As Object)";
RDebugUtils.currentLine=115474433;
 //BA.debugLineNum = 115474433;BA.debugLine="mTag = theObj";
__ref._mtag /*Object*/  = _theobj;
RDebugUtils.currentLine=115474434;
 //BA.debugLineNum = 115474434;BA.debugLine="mButton.tag = CreateSBG(mState, mButtonGroup, mRe";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(__ref._createsbg /*xevolution.vrcg.devdemov2400.b4xstatebutton._sbg*/ (null,__ref._mstate /*int*/ ,__ref._mbuttongroup /*int*/ ,__ref._mreference /*String*/ ,BA.ObjectToString(__ref._mtag /*Object*/ ))));
RDebugUtils.currentLine=115474435;
 //BA.debugLineNum = 115474435;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getparent(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getparent", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getparent", null));}
RDebugUtils.currentLine=115081216;
 //BA.debugLineNum = 115081216;BA.debugLine="Public Sub getParent As B4XView";
RDebugUtils.currentLine=115081217;
 //BA.debugLineNum = 115081217;BA.debugLine="Return mParent";
if (true) return __ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=115081218;
 //BA.debugLineNum = 115081218;BA.debugLine="End Sub";
return null;
}
public boolean  _getallowclick(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getallowclick", false))
	 {return ((Boolean) Debug.delegate(ba, "getallowclick", null));}
RDebugUtils.currentLine=115146752;
 //BA.debugLineNum = 115146752;BA.debugLine="Public Sub getAllowClick As Boolean";
RDebugUtils.currentLine=115146753;
 //BA.debugLineNum = 115146753;BA.debugLine="Return mAllowClick";
if (true) return __ref._mallowclick /*boolean*/ ;
RDebugUtils.currentLine=115146754;
 //BA.debugLineNum = 115146754;BA.debugLine="End Sub";
return false;
}
public String  _setallowclick(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,boolean _theobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setallowclick", false))
	 {return ((String) Debug.delegate(ba, "setallowclick", new Object[] {_theobj}));}
RDebugUtils.currentLine=115212288;
 //BA.debugLineNum = 115212288;BA.debugLine="Public Sub setAllowClick(theObj As Boolean)";
RDebugUtils.currentLine=115212289;
 //BA.debugLineNum = 115212289;BA.debugLine="mAllowClick = theObj";
__ref._mallowclick /*boolean*/  = _theobj;
RDebugUtils.currentLine=115212290;
 //BA.debugLineNum = 115212290;BA.debugLine="End Sub";
return "";
}
public String  _makeclick(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "makeclick", false))
	 {return ((String) Debug.delegate(ba, "makeclick", null));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bs = null;
RDebugUtils.currentLine=114425856;
 //BA.debugLineNum = 114425856;BA.debugLine="Sub MakeClick";
RDebugUtils.currentLine=114425857;
 //BA.debugLineNum = 114425857;BA.debugLine="If (mAllowClick) Then";
if ((__ref._mallowclick /*boolean*/ )) { 
RDebugUtils.currentLine=114425858;
 //BA.debugLineNum = 114425858;BA.debugLine="Dim bs As SBG = mButton.Tag";
_bs = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=114425859;
 //BA.debugLineNum = 114425859;BA.debugLine="mState = bs.State";
__ref._mstate /*int*/  = _bs.State /*int*/ ;
RDebugUtils.currentLine=114425860;
 //BA.debugLineNum = 114425860;BA.debugLine="If mState = 0 Then";
if (__ref._mstate /*int*/ ==0) { 
RDebugUtils.currentLine=114425861;
 //BA.debugLineNum = 114425861;BA.debugLine="If mBooleanState Then";
if (__ref._mbooleanstate /*boolean*/ ) { 
RDebugUtils.currentLine=114425862;
 //BA.debugLineNum = 114425862;BA.debugLine="setState(1)";
__ref._setstate /*String*/ (null,(int) (1));
 }else {
RDebugUtils.currentLine=114425864;
 //BA.debugLineNum = 114425864;BA.debugLine="setState(NextSate)";
__ref._setstate /*String*/ (null,__ref._nextsate /*int*/ (null));
 };
 }else {
RDebugUtils.currentLine=114425867;
 //BA.debugLineNum = 114425867;BA.debugLine="If mBooleanState Then";
if (__ref._mbooleanstate /*boolean*/ ) { 
RDebugUtils.currentLine=114425868;
 //BA.debugLineNum = 114425868;BA.debugLine="setState(0)";
__ref._setstate /*String*/ (null,(int) (0));
 }else {
RDebugUtils.currentLine=114425870;
 //BA.debugLineNum = 114425870;BA.debugLine="setState(NextSate)";
__ref._setstate /*String*/ (null,__ref._nextsate /*int*/ (null));
 };
 };
 };
RDebugUtils.currentLine=114425874;
 //BA.debugLineNum = 114425874;BA.debugLine="CallSub2(mCallBack, mEventName & \"_StateClick\", g";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_StateClick",(Object)(__ref._getstate /*int*/ (null)));
RDebugUtils.currentLine=114425875;
 //BA.debugLineNum = 114425875;BA.debugLine="End Sub";
return "";
}
public String  _setfirststatecolor(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _parm) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setfirststatecolor", false))
	 {return ((String) Debug.delegate(ba, "setfirststatecolor", new Object[] {_parm}));}
RDebugUtils.currentLine=116850688;
 //BA.debugLineNum = 116850688;BA.debugLine="public Sub setFirstStateColor(parm As Int)";
RDebugUtils.currentLine=116850689;
 //BA.debugLineNum = 116850689;BA.debugLine="mFirstStateColor = xui.PaintOrColorToColor(parm)";
__ref._mfirststatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_parm));
RDebugUtils.currentLine=116850690;
 //BA.debugLineNum = 116850690;BA.debugLine="End Sub";
return "";
}
public String  _setsecondstatecolor(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _parm) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setsecondstatecolor", false))
	 {return ((String) Debug.delegate(ba, "setsecondstatecolor", new Object[] {_parm}));}
RDebugUtils.currentLine=116981760;
 //BA.debugLineNum = 116981760;BA.debugLine="public Sub setSecondStateColor(parm As Int)";
RDebugUtils.currentLine=116981761;
 //BA.debugLineNum = 116981761;BA.debugLine="mSecondStateColor = xui.PaintOrColorToColor(parm)";
__ref._msecondstatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_parm));
RDebugUtils.currentLine=116981762;
 //BA.debugLineNum = 116981762;BA.debugLine="End Sub";
return "";
}
public String  _updatebuttonstate(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _thisstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "updatebuttonstate", false))
	 {return ((String) Debug.delegate(ba, "updatebuttonstate", new Object[] {_thisstate}));}
RDebugUtils.currentLine=114491392;
 //BA.debugLineNum = 114491392;BA.debugLine="Sub updateButtonState(thisState As Int)";
RDebugUtils.currentLine=114491393;
 //BA.debugLineNum = 114491393;BA.debugLine="changeGroupStates";
__ref._changegroupstates /*String*/ (null);
RDebugUtils.currentLine=114491394;
 //BA.debugLineNum = 114491394;BA.debugLine="updateButtonStateFirst(thisState)";
__ref._updatebuttonstatefirst /*String*/ (null,_thisstate);
RDebugUtils.currentLine=114491433;
 //BA.debugLineNum = 114491433;BA.debugLine="End Sub";
return "";
}
public int  _getstate(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getstate", false))
	 {return ((Integer) Debug.delegate(ba, "getstate", null));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bs = null;
RDebugUtils.currentLine=116129792;
 //BA.debugLineNum = 116129792;BA.debugLine="Public Sub getState As Int";
RDebugUtils.currentLine=116129793;
 //BA.debugLineNum = 116129793;BA.debugLine="Dim bs As SBG = mButton.Tag";
_bs = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=116129794;
 //BA.debugLineNum = 116129794;BA.debugLine="Return bs.State";
if (true) return _bs.State /*int*/ ;
RDebugUtils.currentLine=116129795;
 //BA.debugLineNum = 116129795;BA.debugLine="End Sub";
return 0;
}
public String  _setstate(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _thisstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setstate", false))
	 {return ((String) Debug.delegate(ba, "setstate", new Object[] {_thisstate}));}
RDebugUtils.currentLine=116195328;
 //BA.debugLineNum = 116195328;BA.debugLine="Public Sub setState(thisState As Int)";
RDebugUtils.currentLine=116195329;
 //BA.debugLineNum = 116195329;BA.debugLine="mState = thisState";
__ref._mstate /*int*/  = _thisstate;
RDebugUtils.currentLine=116195330;
 //BA.debugLineNum = 116195330;BA.debugLine="updateButtonState(mState)";
__ref._updatebuttonstate /*String*/ (null,__ref._mstate /*int*/ );
RDebugUtils.currentLine=116195331;
 //BA.debugLineNum = 116195331;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,boolean _theobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setenabled", false))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_theobj}));}
RDebugUtils.currentLine=115343360;
 //BA.debugLineNum = 115343360;BA.debugLine="Public Sub setEnabled(theObj As Boolean)";
RDebugUtils.currentLine=115343361;
 //BA.debugLineNum = 115343361;BA.debugLine="mEnabled = theObj";
__ref._menabled /*boolean*/  = _theobj;
RDebugUtils.currentLine=115343362;
 //BA.debugLineNum = 115343362;BA.debugLine="mButton.Enabled = mEnabled";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__ref._menabled /*boolean*/ );
RDebugUtils.currentLine=115343363;
 //BA.debugLineNum = 115343363;BA.debugLine="End Sub";
return "";
}
public String  _initialize(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=114032640;
 //BA.debugLineNum = 114032640;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=114032641;
 //BA.debugLineNum = 114032641;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=114032642;
 //BA.debugLineNum = 114032642;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=114032643;
 //BA.debugLineNum = 114032643;BA.debugLine="End Sub";
return "";
}
public String  _setbuttongroup(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _group) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setbuttongroup", false))
	 {return ((String) Debug.delegate(ba, "setbuttongroup", new Object[] {_group}));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bs = null;
RDebugUtils.currentLine=115736576;
 //BA.debugLineNum = 115736576;BA.debugLine="Public Sub setButtonGroup(group As Int)";
RDebugUtils.currentLine=115736577;
 //BA.debugLineNum = 115736577;BA.debugLine="Dim bs As SBG = mButton.Tag";
_bs = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=115736578;
 //BA.debugLineNum = 115736578;BA.debugLine="bs.Group = group";
_bs.Group /*int*/  = _group;
RDebugUtils.currentLine=115736579;
 //BA.debugLineNum = 115736579;BA.debugLine="mButtonGroup = group";
__ref._mbuttongroup /*int*/  = _group;
RDebugUtils.currentLine=115736580;
 //BA.debugLineNum = 115736580;BA.debugLine="mButton.Tag = bs";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_bs));
RDebugUtils.currentLine=115736581;
 //BA.debugLineNum = 115736581;BA.debugLine="End Sub";
return "";
}
public String  _setconformity(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setconformity", false))
	 {return ((String) Debug.delegate(ba, "setconformity", new Object[] {_val}));}
RDebugUtils.currentLine=115867648;
 //BA.debugLineNum = 115867648;BA.debugLine="Public Sub setConformity(val As Int)";
RDebugUtils.currentLine=115867649;
 //BA.debugLineNum = 115867649;BA.debugLine="mConformity = val";
__ref._mconformity /*int*/  = _val;
RDebugUtils.currentLine=115867650;
 //BA.debugLineNum = 115867650;BA.debugLine="End Sub";
return "";
}
public String  _setreference(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,String _thetext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setreference", false))
	 {return ((String) Debug.delegate(ba, "setreference", new Object[] {_thetext}));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bs = null;
RDebugUtils.currentLine=115605504;
 //BA.debugLineNum = 115605504;BA.debugLine="Public Sub setReference(theText As String)";
RDebugUtils.currentLine=115605505;
 //BA.debugLineNum = 115605505;BA.debugLine="Dim bs As SBG = mButton.Tag";
_bs = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=115605506;
 //BA.debugLineNum = 115605506;BA.debugLine="bs.Reference = theText";
_bs.Reference /*String*/  = _thetext;
RDebugUtils.currentLine=115605507;
 //BA.debugLineNum = 115605507;BA.debugLine="mButton.Tag = bs";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_bs));
RDebugUtils.currentLine=115605508;
 //BA.debugLineNum = 115605508;BA.debugLine="End Sub";
return "";
}
public String  _setfirststate(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _thisstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setfirststate", false))
	 {return ((String) Debug.delegate(ba, "setfirststate", new Object[] {_thisstate}));}
RDebugUtils.currentLine=116260864;
 //BA.debugLineNum = 116260864;BA.debugLine="Public Sub setFirstState(thisState As Int)";
RDebugUtils.currentLine=116260865;
 //BA.debugLineNum = 116260865;BA.debugLine="mState = thisState";
__ref._mstate /*int*/  = _thisstate;
RDebugUtils.currentLine=116260866;
 //BA.debugLineNum = 116260866;BA.debugLine="updateButtonStateFirst(mState)";
__ref._updatebuttonstatefirst /*String*/ (null,__ref._mstate /*int*/ );
RDebugUtils.currentLine=116260867;
 //BA.debugLineNum = 116260867;BA.debugLine="End Sub";
return "";
}
public String  _settypeface(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _parm) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "settypeface", false))
	 {return ((String) Debug.delegate(ba, "settypeface", new Object[] {_parm}));}
RDebugUtils.currentLine=116654080;
 //BA.debugLineNum = 116654080;BA.debugLine="public Sub setTypeface(parm As Typeface)";
RDebugUtils.currentLine=116654081;
 //BA.debugLineNum = 116654081;BA.debugLine="mButton.Typeface = parm";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface((android.graphics.Typeface)(_parm.getObject()));
RDebugUtils.currentLine=116654082;
 //BA.debugLineNum = 116654082;BA.debugLine="End Sub";
return "";
}
public int  _getconformity(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getconformity", false))
	 {return ((Integer) Debug.delegate(ba, "getconformity", null));}
RDebugUtils.currentLine=115802112;
 //BA.debugLineNum = 115802112;BA.debugLine="Public Sub getConformity As Int";
RDebugUtils.currentLine=115802113;
 //BA.debugLineNum = 115802113;BA.debugLine="Return mConformity";
if (true) return __ref._mconformity /*int*/ ;
RDebugUtils.currentLine=115802114;
 //BA.debugLineNum = 115802114;BA.debugLine="End Sub";
return 0;
}
public int  _getsecondstatecolor(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getsecondstatecolor", false))
	 {return ((Integer) Debug.delegate(ba, "getsecondstatecolor", null));}
RDebugUtils.currentLine=116916224;
 //BA.debugLineNum = 116916224;BA.debugLine="public Sub getSecondStateColor As Int";
RDebugUtils.currentLine=116916225;
 //BA.debugLineNum = 116916225;BA.debugLine="Return mSecondStateColor";
if (true) return __ref._msecondstatecolor /*int*/ ;
RDebugUtils.currentLine=116916226;
 //BA.debugLineNum = 116916226;BA.debugLine="End Sub";
return 0;
}
public String  _getreference(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getreference", false))
	 {return ((String) Debug.delegate(ba, "getreference", null));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bs = null;
RDebugUtils.currentLine=115539968;
 //BA.debugLineNum = 115539968;BA.debugLine="Public Sub getReference As String";
RDebugUtils.currentLine=115539969;
 //BA.debugLineNum = 115539969;BA.debugLine="Dim bs As SBG = mButton.Tag";
_bs = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=115539970;
 //BA.debugLineNum = 115539970;BA.debugLine="If (bs.Reference = Null) Or (bs.Reference.ToLower";
if ((_bs.Reference /*String*/ == null) || ((_bs.Reference /*String*/ .toLowerCase()).equals("null")) || ((_bs.Reference /*String*/ .trim()).equals(""))) { 
RDebugUtils.currentLine=115539971;
 //BA.debugLineNum = 115539971;BA.debugLine="bs.Reference = \"0\"";
_bs.Reference /*String*/  = "0";
 };
RDebugUtils.currentLine=115539973;
 //BA.debugLineNum = 115539973;BA.debugLine="Return bs.Reference";
if (true) return _bs.Reference /*String*/ ;
RDebugUtils.currentLine=115539974;
 //BA.debugLineNum = 115539974;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=114163712;
 //BA.debugLineNum = 114163712;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=114163714;
 //BA.debugLineNum = 114163714;BA.debugLine="End Sub";
return "";
}
public String  _changegroupstates(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "changegroupstates", false))
	 {return ((String) Debug.delegate(ba, "changegroupstates", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _par = null;
anywheresoftware.b4a.objects.B4XViewWrapper _par2 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
Object _st = null;
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bgrp = null;
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bm2 = null;
RDebugUtils.currentLine=114622464;
 //BA.debugLineNum = 114622464;BA.debugLine="Sub changeGroupStates";
RDebugUtils.currentLine=114622465;
 //BA.debugLineNum = 114622465;BA.debugLine="If mButtonGroup > 0 Then";
if (__ref._mbuttongroup /*int*/ >0) { 
RDebugUtils.currentLine=114622466;
 //BA.debugLineNum = 114622466;BA.debugLine="Dim par As B4XView = mButton.Parent";
_par = new anywheresoftware.b4a.objects.B4XViewWrapper();
_par = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getParent()));
RDebugUtils.currentLine=114622467;
 //BA.debugLineNum = 114622467;BA.debugLine="Dim par2 As B4XView = par.Parent";
_par2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_par2 = _par.getParent();
RDebugUtils.currentLine=114622468;
 //BA.debugLineNum = 114622468;BA.debugLine="For Each pan As B4XView In par2.GetAllViewsRecur";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _par2.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_pan = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=114622470;
 //BA.debugLineNum = 114622470;BA.debugLine="If (pan Is Button) And (pan.Text <> mButton.Tex";
if ((_pan.getObjectOrNull() instanceof android.widget.Button) && ((_pan.getText()).equals(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()) == false)) { 
RDebugUtils.currentLine=114622471;
 //BA.debugLineNum = 114622471;BA.debugLine="Dim st As Object = pan.Tag";
_st = _pan.getTag();
RDebugUtils.currentLine=114622472;
 //BA.debugLineNum = 114622472;BA.debugLine="If (st Is SBG) Then";
if ((_st instanceof xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)) { 
RDebugUtils.currentLine=114622474;
 //BA.debugLineNum = 114622474;BA.debugLine="Dim bgrp As SBG = pan.Tag";
_bgrp = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(_pan.getTag());
RDebugUtils.currentLine=114622475;
 //BA.debugLineNum = 114622475;BA.debugLine="Dim bm2 As SBG = mButton.Tag";
_bm2 = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=114622476;
 //BA.debugLineNum = 114622476;BA.debugLine="If (bgrp.Group = bm2.Group) Then";
if ((_bgrp.Group /*int*/ ==_bm2.Group /*int*/ )) { 
RDebugUtils.currentLine=114622478;
 //BA.debugLineNum = 114622478;BA.debugLine="If (bgrp.State=1) Then";
if ((_bgrp.State /*int*/ ==1)) { 
RDebugUtils.currentLine=114622479;
 //BA.debugLineNum = 114622479;BA.debugLine="LastButton = pan";
__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_pan.getObject()));
 };
RDebugUtils.currentLine=114622482;
 //BA.debugLineNum = 114622482;BA.debugLine="ResetButtonGroup( pan )";
__ref._resetbuttongroup /*String*/ (null,(anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_pan.getObject())));
 };
 };
 };
 }
};
 };
RDebugUtils.currentLine=114622488;
 //BA.debugLineNum = 114622488;BA.debugLine="End Sub";
return "";
}
public String  _resetbuttongroup(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,anywheresoftware.b4a.objects.ButtonWrapper _bbut_) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "resetbuttongroup", false))
	 {return ((String) Debug.delegate(ba, "resetbuttongroup", new Object[] {_bbut_}));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bgrp = null;
int _thisradius = 0;
int _thisbordercolor = 0;
int _thisborder = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=114950144;
 //BA.debugLineNum = 114950144;BA.debugLine="Public Sub ResetButtonGroup (BBut_ As Button)";
RDebugUtils.currentLine=114950145;
 //BA.debugLineNum = 114950145;BA.debugLine="Dim bgrp As SBG = BBut_.Tag";
_bgrp = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(_bbut_.getTag());
RDebugUtils.currentLine=114950146;
 //BA.debugLineNum = 114950146;BA.debugLine="bgrp.State = 0";
_bgrp.State /*int*/  = (int) (0);
RDebugUtils.currentLine=114950150;
 //BA.debugLineNum = 114950150;BA.debugLine="mDefaultColor = mBaseLabel.TextColor";
__ref._mdefaultcolor /*int*/  = __ref._mbaselabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextColor();
RDebugUtils.currentLine=114950151;
 //BA.debugLineNum = 114950151;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
_thisradius = __ref._mradiussize /*int*/ ;
RDebugUtils.currentLine=114950152;
 //BA.debugLineNum = 114950152;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
_thisbordercolor = __ref._mbordercolor /*int*/ ;
RDebugUtils.currentLine=114950153;
 //BA.debugLineNum = 114950153;BA.debugLine="Dim thisBorder As Int = 0";
_thisborder = (int) (0);
RDebugUtils.currentLine=114950154;
 //BA.debugLineNum = 114950154;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
if (__ref._mshowborder /*boolean*/ ) { 
_thisborder = __ref._mbordersize /*int*/ ;};
RDebugUtils.currentLine=114950155;
 //BA.debugLineNum = 114950155;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=114950156;
 //BA.debugLineNum = 114950156;BA.debugLine="cd.initialize2(mFirstStateColor, thisRadius, this";
_cd.Initialize2(__ref._mfirststatecolor /*int*/ ,_thisradius,_thisborder,_thisbordercolor);
RDebugUtils.currentLine=114950157;
 //BA.debugLineNum = 114950157;BA.debugLine="BBut_.background = cd";
_bbut_.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=114950158;
 //BA.debugLineNum = 114950158;BA.debugLine="BBut_.TextColor = mDefaultColor";
_bbut_.setTextColor(__ref._mdefaultcolor /*int*/ );
RDebugUtils.currentLine=114950160;
 //BA.debugLineNum = 114950160;BA.debugLine="BBut_.tag = bgrp";
_bbut_.setTag((Object)(_bgrp));
RDebugUtils.currentLine=114950161;
 //BA.debugLineNum = 114950161;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
RDebugUtils.currentLine=113967104;
 //BA.debugLineNum = 113967104;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=113967105;
 //BA.debugLineNum = 113967105;BA.debugLine="Type SBG(State As Int, Group As Int, Reference As";
;
RDebugUtils.currentLine=113967106;
 //BA.debugLineNum = 113967106;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=113967107;
 //BA.debugLineNum = 113967107;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=113967108;
 //BA.debugLineNum = 113967108;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=113967109;
 //BA.debugLineNum = 113967109;BA.debugLine="Private mBaseLabel As Label 'ignore";
_mbaselabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=113967110;
 //BA.debugLineNum = 113967110;BA.debugLine="Private mParent As B4XView 'ignore";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=113967111;
 //BA.debugLineNum = 113967111;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=113967112;
 //BA.debugLineNum = 113967112;BA.debugLine="Private mButton As Button";
_mbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=113967113;
 //BA.debugLineNum = 113967113;BA.debugLine="Private mState As Int";
_mstate = 0;
RDebugUtils.currentLine=113967115;
 //BA.debugLineNum = 113967115;BA.debugLine="Private mReference As String";
_mreference = "";
RDebugUtils.currentLine=113967116;
 //BA.debugLineNum = 113967116;BA.debugLine="Private mConformity As Int = 0";
_mconformity = (int) (0);
RDebugUtils.currentLine=113967118;
 //BA.debugLineNum = 113967118;BA.debugLine="Private mBooleanState As Boolean";
_mbooleanstate = false;
RDebugUtils.currentLine=113967125;
 //BA.debugLineNum = 113967125;BA.debugLine="Private mDefaultColor As Int";
_mdefaultcolor = 0;
RDebugUtils.currentLine=113967126;
 //BA.debugLineNum = 113967126;BA.debugLine="Private mTextStateColor As Int";
_mtextstatecolor = 0;
RDebugUtils.currentLine=113967127;
 //BA.debugLineNum = 113967127;BA.debugLine="Private mFirstStateColor As Int";
_mfirststatecolor = 0;
RDebugUtils.currentLine=113967128;
 //BA.debugLineNum = 113967128;BA.debugLine="Private mSecondStateColor As Int";
_msecondstatecolor = 0;
RDebugUtils.currentLine=113967129;
 //BA.debugLineNum = 113967129;BA.debugLine="Private mThirdStateColor As Int";
_mthirdstatecolor = 0;
RDebugUtils.currentLine=113967130;
 //BA.debugLineNum = 113967130;BA.debugLine="Private mBorderColor As Int";
_mbordercolor = 0;
RDebugUtils.currentLine=113967131;
 //BA.debugLineNum = 113967131;BA.debugLine="Private mBorderSize As Int";
_mbordersize = 0;
RDebugUtils.currentLine=113967132;
 //BA.debugLineNum = 113967132;BA.debugLine="Private mShowBorder As Boolean";
_mshowborder = false;
RDebugUtils.currentLine=113967133;
 //BA.debugLineNum = 113967133;BA.debugLine="Private mRadiusSize As Int";
_mradiussize = 0;
RDebugUtils.currentLine=113967134;
 //BA.debugLineNum = 113967134;BA.debugLine="Private mUseDIP As Boolean";
_musedip = false;
RDebugUtils.currentLine=113967136;
 //BA.debugLineNum = 113967136;BA.debugLine="Private mButtonGroup As Int";
_mbuttongroup = 0;
RDebugUtils.currentLine=113967137;
 //BA.debugLineNum = 113967137;BA.debugLine="Private mTag As Object";
_mtag = new Object();
RDebugUtils.currentLine=113967138;
 //BA.debugLineNum = 113967138;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=113967139;
 //BA.debugLineNum = 113967139;BA.debugLine="Private mAllowClick As Boolean = True";
_mallowclick = __c.True;
RDebugUtils.currentLine=113967140;
 //BA.debugLineNum = 113967140;BA.debugLine="Private LastButton As Button";
_lastbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=113967142;
 //BA.debugLineNum = 113967142;BA.debugLine="End Sub";
return "";
}
public String  _createbutton(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,Object _base,String _stitle,String _sreference,int _istate,boolean _bbooleanstate,int _ifirststatecolor,int _isecondstatecolor,int _ithirdstatecolor,int _ibordercolor,int _ibordersize,boolean _bshowborder,int _iradiussize,boolean _busedip,int _ibuttongroup) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "createbutton", false))
	 {return ((String) Debug.delegate(ba, "createbutton", new Object[] {_base,_stitle,_sreference,_istate,_bbooleanstate,_ifirststatecolor,_isecondstatecolor,_ithirdstatecolor,_ibordercolor,_ibordersize,_bshowborder,_iradiussize,_busedip,_ibuttongroup}));}
int _thiscolor = 0;
int _thisradius = 0;
int _thisbordercolor = 0;
int _thisborder = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=115015680;
 //BA.debugLineNum = 115015680;BA.debugLine="Public Sub CreateButton(Base As Object, sTitle As";
RDebugUtils.currentLine=115015685;
 //BA.debugLineNum = 115015685;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=115015686;
 //BA.debugLineNum = 115015686;BA.debugLine="mBase.Color = xui.Color_ARGB(0,255,255,255)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (0),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=115015687;
 //BA.debugLineNum = 115015687;BA.debugLine="mButton.Initialize(\"ThisButtonClick\")";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"ThisButtonClick");
RDebugUtils.currentLine=115015688;
 //BA.debugLineNum = 115015688;BA.debugLine="mBase.AddView(mButton, 0, 0, mBase.Width, mBase.H";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=115015689;
 //BA.debugLineNum = 115015689;BA.debugLine="mBooleanState = bBooleanState";
__ref._mbooleanstate /*boolean*/  = _bbooleanstate;
RDebugUtils.currentLine=115015690;
 //BA.debugLineNum = 115015690;BA.debugLine="mState = iState";
__ref._mstate /*int*/  = _istate;
RDebugUtils.currentLine=115015691;
 //BA.debugLineNum = 115015691;BA.debugLine="mReference = sReference";
__ref._mreference /*String*/  = _sreference;
RDebugUtils.currentLine=115015692;
 //BA.debugLineNum = 115015692;BA.debugLine="mButtonGroup = iButtonGroup";
__ref._mbuttongroup /*int*/  = _ibuttongroup;
RDebugUtils.currentLine=115015710;
 //BA.debugLineNum = 115015710;BA.debugLine="mFirstStateColor = xui.PaintOrColorToColor(iFirst";
__ref._mfirststatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_ifirststatecolor));
RDebugUtils.currentLine=115015711;
 //BA.debugLineNum = 115015711;BA.debugLine="mSecondStateColor = xui.PaintOrColorToColor(iSeco";
__ref._msecondstatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_isecondstatecolor));
RDebugUtils.currentLine=115015712;
 //BA.debugLineNum = 115015712;BA.debugLine="mThirdStateColor = xui.PaintOrColorToColor(iThird";
__ref._mthirdstatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_ithirdstatecolor));
RDebugUtils.currentLine=115015713;
 //BA.debugLineNum = 115015713;BA.debugLine="mBorderColor = xui.PaintOrColorToColor(iBorderCol";
__ref._mbordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_ibordercolor));
RDebugUtils.currentLine=115015714;
 //BA.debugLineNum = 115015714;BA.debugLine="mShowBorder = bShowBorder";
__ref._mshowborder /*boolean*/  = _bshowborder;
RDebugUtils.currentLine=115015715;
 //BA.debugLineNum = 115015715;BA.debugLine="mBorderSize = iBorderSize";
__ref._mbordersize /*int*/  = _ibordersize;
RDebugUtils.currentLine=115015716;
 //BA.debugLineNum = 115015716;BA.debugLine="mRadiusSize = iRadiusSize";
__ref._mradiussize /*int*/  = _iradiussize;
RDebugUtils.currentLine=115015717;
 //BA.debugLineNum = 115015717;BA.debugLine="mUseDIP = bUseDIP";
__ref._musedip /*boolean*/  = _busedip;
RDebugUtils.currentLine=115015718;
 //BA.debugLineNum = 115015718;BA.debugLine="If (mUseDIP) Then";
if ((__ref._musedip /*boolean*/ )) { 
RDebugUtils.currentLine=115015719;
 //BA.debugLineNum = 115015719;BA.debugLine="mBorderSize = mBorderSize * 1dip";
__ref._mbordersize /*int*/  = (int) (__ref._mbordersize /*int*/ *__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=115015720;
 //BA.debugLineNum = 115015720;BA.debugLine="mRadiusSize = mRadiusSize * 1dip";
__ref._mradiussize /*int*/  = (int) (__ref._mradiussize /*int*/ *__c.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=115015723;
 //BA.debugLineNum = 115015723;BA.debugLine="Dim thisColor As Int";
_thiscolor = 0;
RDebugUtils.currentLine=115015724;
 //BA.debugLineNum = 115015724;BA.debugLine="If mState = 0 Then";
if (__ref._mstate /*int*/ ==0) { 
RDebugUtils.currentLine=115015725;
 //BA.debugLineNum = 115015725;BA.debugLine="thisColor = mFirstStateColor";
_thiscolor = __ref._mfirststatecolor /*int*/ ;
 }else 
{RDebugUtils.currentLine=115015726;
 //BA.debugLineNum = 115015726;BA.debugLine="else if mState = 1 Then";
if (__ref._mstate /*int*/ ==1) { 
RDebugUtils.currentLine=115015727;
 //BA.debugLineNum = 115015727;BA.debugLine="thisColor = mSecondStateColor";
_thiscolor = __ref._msecondstatecolor /*int*/ ;
 }else 
{RDebugUtils.currentLine=115015728;
 //BA.debugLineNum = 115015728;BA.debugLine="else if mState = 2 Then";
if (__ref._mstate /*int*/ ==2) { 
RDebugUtils.currentLine=115015729;
 //BA.debugLineNum = 115015729;BA.debugLine="thisColor = mThirdStateColor";
_thiscolor = __ref._mthirdstatecolor /*int*/ ;
 }}}
;
RDebugUtils.currentLine=115015731;
 //BA.debugLineNum = 115015731;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
_thisradius = __ref._mradiussize /*int*/ ;
RDebugUtils.currentLine=115015732;
 //BA.debugLineNum = 115015732;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
_thisbordercolor = __ref._mbordercolor /*int*/ ;
RDebugUtils.currentLine=115015733;
 //BA.debugLineNum = 115015733;BA.debugLine="Dim thisBorder As Int = 0";
_thisborder = (int) (0);
RDebugUtils.currentLine=115015734;
 //BA.debugLineNum = 115015734;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
if (__ref._mshowborder /*boolean*/ ) { 
_thisborder = __ref._mbordersize /*int*/ ;};
RDebugUtils.currentLine=115015735;
 //BA.debugLineNum = 115015735;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=115015736;
 //BA.debugLineNum = 115015736;BA.debugLine="cd.initialize2(thisColor, thisRadius, thisBorder,";
_cd.Initialize2(_thiscolor,_thisradius,_thisborder,_thisbordercolor);
RDebugUtils.currentLine=115015737;
 //BA.debugLineNum = 115015737;BA.debugLine="mButton.background = cd";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=115015739;
 //BA.debugLineNum = 115015739;BA.debugLine="mButton.Text = sTitle";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(_stitle));
RDebugUtils.currentLine=115015740;
 //BA.debugLineNum = 115015740;BA.debugLine="mButton.tag = CreateSBG(mState, mButtonGroup, mRe";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(__ref._createsbg /*xevolution.vrcg.devdemov2400.b4xstatebutton._sbg*/ (null,__ref._mstate /*int*/ ,__ref._mbuttongroup /*int*/ ,__ref._mreference /*String*/ ,BA.ObjectToString(__ref._mtag /*Object*/ ))));
RDebugUtils.currentLine=115015741;
 //BA.debugLineNum = 115015741;BA.debugLine="End Sub";
return "";
}
public xevolution.vrcg.devdemov2400.b4xstatebutton._sbg  _createsbg(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _state,int _group,String _reference,String _maintag) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "createsbg", false))
	 {return ((xevolution.vrcg.devdemov2400.b4xstatebutton._sbg) Debug.delegate(ba, "createsbg", new Object[] {_state,_group,_reference,_maintag}));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _thissbg = null;
RDebugUtils.currentLine=114229248;
 //BA.debugLineNum = 114229248;BA.debugLine="Sub CreateSBG(State As Int, Group As Int, Referenc";
RDebugUtils.currentLine=114229249;
 //BA.debugLineNum = 114229249;BA.debugLine="Dim thisSBG As SBG";
_thissbg = new xevolution.vrcg.devdemov2400.b4xstatebutton._sbg();
RDebugUtils.currentLine=114229250;
 //BA.debugLineNum = 114229250;BA.debugLine="thisSBG.Initialize";
_thissbg.Initialize();
RDebugUtils.currentLine=114229251;
 //BA.debugLineNum = 114229251;BA.debugLine="thisSBG.State = State";
_thissbg.State /*int*/  = _state;
RDebugUtils.currentLine=114229252;
 //BA.debugLineNum = 114229252;BA.debugLine="thisSBG.Group = Group";
_thissbg.Group /*int*/  = _group;
RDebugUtils.currentLine=114229253;
 //BA.debugLineNum = 114229253;BA.debugLine="thisSBG.Reference = Reference";
_thissbg.Reference /*String*/  = _reference;
RDebugUtils.currentLine=114229254;
 //BA.debugLineNum = 114229254;BA.debugLine="thisSBG.MainTag = mainTag";
_thissbg.mainTag /*String*/  = _maintag;
RDebugUtils.currentLine=114229255;
 //BA.debugLineNum = 114229255;BA.debugLine="Return thisSBG";
if (true) return _thissbg;
RDebugUtils.currentLine=114229256;
 //BA.debugLineNum = 114229256;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _thiscolor = 0;
int _thisradius = 0;
int _thisbordercolor = 0;
int _thisborder = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=114098176;
 //BA.debugLineNum = 114098176;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=114098177;
 //BA.debugLineNum = 114098177;BA.debugLine="mAllowClick = True";
__ref._mallowclick /*boolean*/  = __c.True;
RDebugUtils.currentLine=114098178;
 //BA.debugLineNum = 114098178;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=114098179;
 //BA.debugLineNum = 114098179;BA.debugLine="mBase.Color = xui.Color_ARGB(0,255,255,255)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (0),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=114098180;
 //BA.debugLineNum = 114098180;BA.debugLine="mButton.Initialize(\"ThisButtonClick\")";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"ThisButtonClick");
RDebugUtils.currentLine=114098181;
 //BA.debugLineNum = 114098181;BA.debugLine="mBase.AddView(mButton, 0, 0, mBase.Width, mBase.H";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=114098182;
 //BA.debugLineNum = 114098182;BA.debugLine="getDesignProperties(Props)";
__ref._getdesignproperties /*String*/ (null,_props);
RDebugUtils.currentLine=114098184;
 //BA.debugLineNum = 114098184;BA.debugLine="mButton.Text = Lbl.Text";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(_lbl.getText()));
RDebugUtils.currentLine=114098185;
 //BA.debugLineNum = 114098185;BA.debugLine="mButton.TextColor = Lbl.TextColor";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(_lbl.getTextColor());
RDebugUtils.currentLine=114098186;
 //BA.debugLineNum = 114098186;BA.debugLine="mButton.TextSize = Lbl.TextSize";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize(_lbl.getTextSize());
RDebugUtils.currentLine=114098187;
 //BA.debugLineNum = 114098187;BA.debugLine="mParent = mBase.Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=114098188;
 //BA.debugLineNum = 114098188;BA.debugLine="mEnabled = True";
__ref._menabled /*boolean*/  = __c.True;
RDebugUtils.currentLine=114098189;
 //BA.debugLineNum = 114098189;BA.debugLine="mBaseLabel = Lbl";
__ref._mbaselabel /*anywheresoftware.b4a.objects.LabelWrapper*/  = _lbl;
RDebugUtils.currentLine=114098190;
 //BA.debugLineNum = 114098190;BA.debugLine="mDefaultColor = mBaseLabel.TextColor";
__ref._mdefaultcolor /*int*/  = __ref._mbaselabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextColor();
RDebugUtils.currentLine=114098191;
 //BA.debugLineNum = 114098191;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=114098208;
 //BA.debugLineNum = 114098208;BA.debugLine="Dim thisColor As Int";
_thiscolor = 0;
RDebugUtils.currentLine=114098209;
 //BA.debugLineNum = 114098209;BA.debugLine="If mState = 0 Then";
if (__ref._mstate /*int*/ ==0) { 
RDebugUtils.currentLine=114098210;
 //BA.debugLineNum = 114098210;BA.debugLine="thisColor = mFirstStateColor";
_thiscolor = __ref._mfirststatecolor /*int*/ ;
 }else 
{RDebugUtils.currentLine=114098211;
 //BA.debugLineNum = 114098211;BA.debugLine="else if mState = 1 Then";
if (__ref._mstate /*int*/ ==1) { 
RDebugUtils.currentLine=114098212;
 //BA.debugLineNum = 114098212;BA.debugLine="thisColor = mSecondStateColor";
_thiscolor = __ref._msecondstatecolor /*int*/ ;
 }else 
{RDebugUtils.currentLine=114098213;
 //BA.debugLineNum = 114098213;BA.debugLine="else if mState = 2 Then";
if (__ref._mstate /*int*/ ==2) { 
RDebugUtils.currentLine=114098214;
 //BA.debugLineNum = 114098214;BA.debugLine="thisColor = mThirdStateColor";
_thiscolor = __ref._mthirdstatecolor /*int*/ ;
 }}}
;
RDebugUtils.currentLine=114098216;
 //BA.debugLineNum = 114098216;BA.debugLine="mButton.Typeface = Lbl.Typeface";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(_lbl.getTypeface());
RDebugUtils.currentLine=114098217;
 //BA.debugLineNum = 114098217;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
_thisradius = __ref._mradiussize /*int*/ ;
RDebugUtils.currentLine=114098218;
 //BA.debugLineNum = 114098218;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
_thisbordercolor = __ref._mbordercolor /*int*/ ;
RDebugUtils.currentLine=114098219;
 //BA.debugLineNum = 114098219;BA.debugLine="Dim thisBorder As Int = 0";
_thisborder = (int) (0);
RDebugUtils.currentLine=114098220;
 //BA.debugLineNum = 114098220;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
if (__ref._mshowborder /*boolean*/ ) { 
_thisborder = __ref._mbordersize /*int*/ ;};
RDebugUtils.currentLine=114098221;
 //BA.debugLineNum = 114098221;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=114098222;
 //BA.debugLineNum = 114098222;BA.debugLine="cd.initialize2(thisColor, thisRadius, thisBorder,";
_cd.Initialize2(_thiscolor,_thisradius,_thisborder,_thisbordercolor);
RDebugUtils.currentLine=114098223;
 //BA.debugLineNum = 114098223;BA.debugLine="mButton.background = cd";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=114098225;
 //BA.debugLineNum = 114098225;BA.debugLine="mButton.tag = CreateSBG(mState, mButtonGroup, mRe";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(__ref._createsbg /*xevolution.vrcg.devdemov2400.b4xstatebutton._sbg*/ (null,__ref._mstate /*int*/ ,__ref._mbuttongroup /*int*/ ,__ref._mreference /*String*/ ,BA.ObjectToString(__ref._mtag /*Object*/ ))));
RDebugUtils.currentLine=114098226;
 //BA.debugLineNum = 114098226;BA.debugLine="End Sub";
return "";
}
public String  _getdesignproperties(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getdesignproperties", false))
	 {return ((String) Debug.delegate(ba, "getdesignproperties", new Object[] {_props}));}
RDebugUtils.currentLine=114294784;
 //BA.debugLineNum = 114294784;BA.debugLine="Sub getDesignProperties(Props As Map)";
RDebugUtils.currentLine=114294785;
 //BA.debugLineNum = 114294785;BA.debugLine="mConformity = Props.Get(\"Conformity\")";
__ref._mconformity /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Conformity"))));
RDebugUtils.currentLine=114294786;
 //BA.debugLineNum = 114294786;BA.debugLine="mReference = Props.Get(\"Reference\")";
__ref._mreference /*String*/  = BA.ObjectToString(_props.Get((Object)("Reference")));
RDebugUtils.currentLine=114294787;
 //BA.debugLineNum = 114294787;BA.debugLine="mBooleanState = Props.Get(\"BooleanState\")";
__ref._mbooleanstate /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("BooleanState")));
RDebugUtils.currentLine=114294788;
 //BA.debugLineNum = 114294788;BA.debugLine="mState = Props.Get(\"State\")";
__ref._mstate /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("State"))));
RDebugUtils.currentLine=114294795;
 //BA.debugLineNum = 114294795;BA.debugLine="mTextStateColor = xui.PaintOrColorToColor(Props.G";
__ref._mtextstatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextStateColor")));
RDebugUtils.currentLine=114294796;
 //BA.debugLineNum = 114294796;BA.debugLine="mFirstStateColor = xui.PaintOrColorToColor(Props.";
__ref._mfirststatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("FirstStateColor")));
RDebugUtils.currentLine=114294797;
 //BA.debugLineNum = 114294797;BA.debugLine="mSecondStateColor = xui.PaintOrColorToColor(Props";
__ref._msecondstatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SecondStateColor")));
RDebugUtils.currentLine=114294798;
 //BA.debugLineNum = 114294798;BA.debugLine="mThirdStateColor = xui.PaintOrColorToColor(Props.";
__ref._mthirdstatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThirdStateColor")));
RDebugUtils.currentLine=114294799;
 //BA.debugLineNum = 114294799;BA.debugLine="mBorderColor = xui.PaintOrColorToColor(Props.Get(";
__ref._mbordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BorderColor")));
RDebugUtils.currentLine=114294800;
 //BA.debugLineNum = 114294800;BA.debugLine="mShowBorder = Props.Get(\"ShowBorder\")";
__ref._mshowborder /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowBorder")));
RDebugUtils.currentLine=114294801;
 //BA.debugLineNum = 114294801;BA.debugLine="mBorderSize = Props.Get(\"BorderSize\")";
__ref._mbordersize /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("BorderSize"))));
RDebugUtils.currentLine=114294802;
 //BA.debugLineNum = 114294802;BA.debugLine="mRadiusSize = Props.Get(\"RadiusSize\")";
__ref._mradiussize /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("RadiusSize"))));
RDebugUtils.currentLine=114294803;
 //BA.debugLineNum = 114294803;BA.debugLine="mUseDIP = Props.Get(\"UseDIP\")";
__ref._musedip /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("UseDIP")));
RDebugUtils.currentLine=114294804;
 //BA.debugLineNum = 114294804;BA.debugLine="If (mUseDIP) Then";
if ((__ref._musedip /*boolean*/ )) { 
RDebugUtils.currentLine=114294805;
 //BA.debugLineNum = 114294805;BA.debugLine="mBorderSize = mBorderSize * 1dip";
__ref._mbordersize /*int*/  = (int) (__ref._mbordersize /*int*/ *__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=114294806;
 //BA.debugLineNum = 114294806;BA.debugLine="mRadiusSize = mRadiusSize * 1dip";
__ref._mradiussize /*int*/  = (int) (__ref._mradiussize /*int*/ *__c.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=114294809;
 //BA.debugLineNum = 114294809;BA.debugLine="mButtonGroup = Props.Get(\"ButtonGroup\")";
__ref._mbuttongroup /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("ButtonGroup"))));
RDebugUtils.currentLine=114294810;
 //BA.debugLineNum = 114294810;BA.debugLine="End Sub";
return "";
}
public int  _getbuttongroup(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getbuttongroup", false))
	 {return ((Integer) Debug.delegate(ba, "getbuttongroup", null));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bs = null;
RDebugUtils.currentLine=115671040;
 //BA.debugLineNum = 115671040;BA.debugLine="Public Sub getButtonGroup As Int";
RDebugUtils.currentLine=115671041;
 //BA.debugLineNum = 115671041;BA.debugLine="Dim bs As SBG = mButton.Tag";
_bs = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=115671042;
 //BA.debugLineNum = 115671042;BA.debugLine="Return bs.Group";
if (true) return _bs.Group /*int*/ ;
RDebugUtils.currentLine=115671043;
 //BA.debugLineNum = 115671043;BA.debugLine="End Sub";
return 0;
}
public boolean  _getenabled(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getenabled", false))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=115277824;
 //BA.debugLineNum = 115277824;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=115277825;
 //BA.debugLineNum = 115277825;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=115277826;
 //BA.debugLineNum = 115277826;BA.debugLine="End Sub";
return false;
}
public int  _getfirststatecolor(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getfirststatecolor", false))
	 {return ((Integer) Debug.delegate(ba, "getfirststatecolor", null));}
RDebugUtils.currentLine=116785152;
 //BA.debugLineNum = 116785152;BA.debugLine="public Sub getFirstStateColor As Int";
RDebugUtils.currentLine=116785153;
 //BA.debugLineNum = 116785153;BA.debugLine="Return mFirstStateColor";
if (true) return __ref._mfirststatecolor /*int*/ ;
RDebugUtils.currentLine=116785154;
 //BA.debugLineNum = 116785154;BA.debugLine="End Sub";
return 0;
}
public String  _getsbg(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _thissbg,int _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getsbg", false))
	 {return ((String) Debug.delegate(ba, "getsbg", new Object[] {_thissbg,_field}));}
RDebugUtils.currentLine=114884608;
 //BA.debugLineNum = 114884608;BA.debugLine="Sub GetSBG(thisSBG As SBG, field As Int) As String";
RDebugUtils.currentLine=114884609;
 //BA.debugLineNum = 114884609;BA.debugLine="If (thisSBG.IsInitialized) Then";
if ((_thissbg.IsInitialized /*boolean*/ )) { 
RDebugUtils.currentLine=114884610;
 //BA.debugLineNum = 114884610;BA.debugLine="If (field = 1) Then";
if ((_field==1)) { 
RDebugUtils.currentLine=114884611;
 //BA.debugLineNum = 114884611;BA.debugLine="Return thisSBG.State";
if (true) return BA.NumberToString(_thissbg.State /*int*/ );
 }else 
{RDebugUtils.currentLine=114884612;
 //BA.debugLineNum = 114884612;BA.debugLine="else if (field = 2) Then";
if ((_field==2)) { 
RDebugUtils.currentLine=114884613;
 //BA.debugLineNum = 114884613;BA.debugLine="Return thisSBG.Group";
if (true) return BA.NumberToString(_thissbg.Group /*int*/ );
 }else 
{RDebugUtils.currentLine=114884614;
 //BA.debugLineNum = 114884614;BA.debugLine="else if (field = 3) Then";
if ((_field==3)) { 
RDebugUtils.currentLine=114884615;
 //BA.debugLineNum = 114884615;BA.debugLine="Return thisSBG.Reference";
if (true) return _thissbg.Reference /*String*/ ;
 }else {
RDebugUtils.currentLine=114884617;
 //BA.debugLineNum = 114884617;BA.debugLine="Return thisSBG.MainTag";
if (true) return _thissbg.mainTag /*String*/ ;
 }}}
;
 }else {
RDebugUtils.currentLine=114884620;
 //BA.debugLineNum = 114884620;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=114884622;
 //BA.debugLineNum = 114884622;BA.debugLine="End Sub";
return "";
}
public int  _gettextcolor(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "gettextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettextcolor", null));}
RDebugUtils.currentLine=116326400;
 //BA.debugLineNum = 116326400;BA.debugLine="public Sub getTextColor As Int";
RDebugUtils.currentLine=116326401;
 //BA.debugLineNum = 116326401;BA.debugLine="Return mButton.TextColor";
if (true) return __ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTextColor();
RDebugUtils.currentLine=116326402;
 //BA.debugLineNum = 116326402;BA.debugLine="End Sub";
return 0;
}
public int  _gettextsize(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "gettextsize", false))
	 {return ((Integer) Debug.delegate(ba, "gettextsize", null));}
RDebugUtils.currentLine=116457472;
 //BA.debugLineNum = 116457472;BA.debugLine="public Sub getTextSize As Int";
RDebugUtils.currentLine=116457473;
 //BA.debugLineNum = 116457473;BA.debugLine="Return mButton.TextSize";
if (true) return (int) (__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTextSize());
RDebugUtils.currentLine=116457474;
 //BA.debugLineNum = 116457474;BA.debugLine="End Sub";
return 0;
}
public int  _getthirdstatecolor(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "getthirdstatecolor", false))
	 {return ((Integer) Debug.delegate(ba, "getthirdstatecolor", null));}
RDebugUtils.currentLine=117047296;
 //BA.debugLineNum = 117047296;BA.debugLine="public Sub getThirdStateColor As Int";
RDebugUtils.currentLine=117047297;
 //BA.debugLineNum = 117047297;BA.debugLine="Return mThirdStateColor";
if (true) return __ref._mthirdstatecolor /*int*/ ;
RDebugUtils.currentLine=117047298;
 //BA.debugLineNum = 117047298;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _gettypeface(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "gettypeface", false))
	 {return ((anywheresoftware.b4a.keywords.constants.TypefaceWrapper) Debug.delegate(ba, "gettypeface", null));}
RDebugUtils.currentLine=116588544;
 //BA.debugLineNum = 116588544;BA.debugLine="public Sub getTypeface As Typeface";
RDebugUtils.currentLine=116588545;
 //BA.debugLineNum = 116588545;BA.debugLine="Return mButton.Typeface";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTypeface()));
RDebugUtils.currentLine=116588546;
 //BA.debugLineNum = 116588546;BA.debugLine="End Sub";
return null;
}
public int  _nextsate(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "nextsate", false))
	 {return ((Integer) Debug.delegate(ba, "nextsate", null));}
int _rnext = 0;
RDebugUtils.currentLine=116064256;
 //BA.debugLineNum = 116064256;BA.debugLine="Public Sub NextSate As Int";
RDebugUtils.currentLine=116064257;
 //BA.debugLineNum = 116064257;BA.debugLine="Dim rNext As Int = mState +1";
_rnext = (int) (__ref._mstate /*int*/ +1);
RDebugUtils.currentLine=116064258;
 //BA.debugLineNum = 116064258;BA.debugLine="If rNext >= 3 Then rNext = 0";
if (_rnext>=3) { 
_rnext = (int) (0);};
RDebugUtils.currentLine=116064259;
 //BA.debugLineNum = 116064259;BA.debugLine="Return rNext";
if (true) return _rnext;
RDebugUtils.currentLine=116064260;
 //BA.debugLineNum = 116064260;BA.debugLine="End Sub";
return 0;
}
public String  _reverttolastbutton(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "reverttolastbutton", false))
	 {return ((String) Debug.delegate(ba, "reverttolastbutton", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _par = null;
anywheresoftware.b4a.objects.B4XViewWrapper _par2 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
RDebugUtils.currentLine=114819072;
 //BA.debugLineNum = 114819072;BA.debugLine="Sub RevertToLastButton";
RDebugUtils.currentLine=114819074;
 //BA.debugLineNum = 114819074;BA.debugLine="If LastButton.IsInitialized Then";
if (__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=114819077;
 //BA.debugLineNum = 114819077;BA.debugLine="If (mButton.Text = LastButton.Text) And (GetSBG(";
if (((__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()).equals(__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText())) && ((__ref._getsbg /*String*/ (null,(xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),(int) (2))).equals(__ref._getsbg /*String*/ (null,(xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),(int) (2)))) && ((__ref._getsbg /*String*/ (null,(xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),(int) (3))).equals(__ref._getsbg /*String*/ (null,(xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),(int) (3))))) { 
RDebugUtils.currentLine=114819079;
 //BA.debugLineNum = 114819079;BA.debugLine="mButton = LastButton";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/  = __ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ ;
 }else {
RDebugUtils.currentLine=114819083;
 //BA.debugLineNum = 114819083;BA.debugLine="If mButtonGroup > 0 Then";
if (__ref._mbuttongroup /*int*/ >0) { 
RDebugUtils.currentLine=114819084;
 //BA.debugLineNum = 114819084;BA.debugLine="Dim par As B4XView = mButton.Parent";
_par = new anywheresoftware.b4a.objects.B4XViewWrapper();
_par = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getParent()));
RDebugUtils.currentLine=114819085;
 //BA.debugLineNum = 114819085;BA.debugLine="Dim par2 As B4XView = par.Parent";
_par2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_par2 = _par.getParent();
RDebugUtils.currentLine=114819086;
 //BA.debugLineNum = 114819086;BA.debugLine="For Each pan As B4XView In par2.GetAllViewsRec";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group8 = _par2.GetAllViewsRecursive();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_pan = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group8.Get(index8)));
RDebugUtils.currentLine=114819087;
 //BA.debugLineNum = 114819087;BA.debugLine="If (pan Is Button) And (pan.Text = LastButton";
if ((_pan.getObjectOrNull() instanceof android.widget.Button) && ((_pan.getText()).equals(__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText())) && ((__ref._getsbg /*String*/ (null,(xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(_pan.getTag()),(int) (2))).equals(__ref._getsbg /*String*/ (null,(xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),(int) (2)))) && ((__ref._getsbg /*String*/ (null,(xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(_pan.getTag()),(int) (3))).equals(__ref._getsbg /*String*/ (null,(xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag()),(int) (3))))) { 
RDebugUtils.currentLine=114819090;
 //BA.debugLineNum = 114819090;BA.debugLine="pan = LastButton";
_pan = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._lastbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()));
RDebugUtils.currentLine=114819091;
 //BA.debugLineNum = 114819091;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=114819094;
 //BA.debugLineNum = 114819094;BA.debugLine="ResetButtonGroup( mButton )";
__ref._resetbuttongroup /*String*/ (null,__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ );
 };
 };
 };
RDebugUtils.currentLine=114819098;
 //BA.debugLineNum = 114819098;BA.debugLine="End Sub";
return "";
}
public String  _setcolormanual(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _color2set) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setcolormanual", false))
	 {return ((String) Debug.delegate(ba, "setcolormanual", new Object[] {_color2set}));}
RDebugUtils.currentLine=114688000;
 //BA.debugLineNum = 114688000;BA.debugLine="Sub SetColorManual(color2Set As Int)";
RDebugUtils.currentLine=114688001;
 //BA.debugLineNum = 114688001;BA.debugLine="mButton.Color = color2Set";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_color2set);
RDebugUtils.currentLine=114688002;
 //BA.debugLineNum = 114688002;BA.debugLine="End Sub";
return "";
}
public String  _setconformitymanual(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _val2set) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setconformitymanual", false))
	 {return ((String) Debug.delegate(ba, "setconformitymanual", new Object[] {_val2set}));}
RDebugUtils.currentLine=114753536;
 //BA.debugLineNum = 114753536;BA.debugLine="Sub SetConformityManual(val2set As Int)";
RDebugUtils.currentLine=114753537;
 //BA.debugLineNum = 114753537;BA.debugLine="mConformity = val2set";
__ref._mconformity /*int*/  = _val2set;
RDebugUtils.currentLine=114753538;
 //BA.debugLineNum = 114753538;BA.debugLine="End Sub";
return "";
}
public String  _updatebuttonstatefirst(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _thisstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "updatebuttonstatefirst", false))
	 {return ((String) Debug.delegate(ba, "updatebuttonstatefirst", new Object[] {_thisstate}));}
int _textcolor = 0;
int _thiscolor = 0;
int _thisradius = 0;
int _thisbordercolor = 0;
int _thisborder = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=114556928;
 //BA.debugLineNum = 114556928;BA.debugLine="Sub updateButtonStateFirst(thisState As Int)";
RDebugUtils.currentLine=114556942;
 //BA.debugLineNum = 114556942;BA.debugLine="mDefaultColor = mBaseLabel.TextColor";
__ref._mdefaultcolor /*int*/  = __ref._mbaselabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextColor();
RDebugUtils.currentLine=114556943;
 //BA.debugLineNum = 114556943;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=114556944;
 //BA.debugLineNum = 114556944;BA.debugLine="Dim thisColor As Int";
_thiscolor = 0;
RDebugUtils.currentLine=114556945;
 //BA.debugLineNum = 114556945;BA.debugLine="If thisState = 0 Then";
if (_thisstate==0) { 
RDebugUtils.currentLine=114556946;
 //BA.debugLineNum = 114556946;BA.debugLine="thisColor = mFirstStateColor";
_thiscolor = __ref._mfirststatecolor /*int*/ ;
RDebugUtils.currentLine=114556947;
 //BA.debugLineNum = 114556947;BA.debugLine="textColor = mDefaultColor";
_textcolor = __ref._mdefaultcolor /*int*/ ;
 }else 
{RDebugUtils.currentLine=114556948;
 //BA.debugLineNum = 114556948;BA.debugLine="else if thisState = 1 Then";
if (_thisstate==1) { 
RDebugUtils.currentLine=114556949;
 //BA.debugLineNum = 114556949;BA.debugLine="textColor = mTextStateColor";
_textcolor = __ref._mtextstatecolor /*int*/ ;
RDebugUtils.currentLine=114556950;
 //BA.debugLineNum = 114556950;BA.debugLine="thisColor = mSecondStateColor";
_thiscolor = __ref._msecondstatecolor /*int*/ ;
 }else 
{RDebugUtils.currentLine=114556951;
 //BA.debugLineNum = 114556951;BA.debugLine="else if thisState = 2 Then";
if (_thisstate==2) { 
RDebugUtils.currentLine=114556952;
 //BA.debugLineNum = 114556952;BA.debugLine="textColor = mTextStateColor";
_textcolor = __ref._mtextstatecolor /*int*/ ;
RDebugUtils.currentLine=114556953;
 //BA.debugLineNum = 114556953;BA.debugLine="thisColor = mThirdStateColor";
_thiscolor = __ref._mthirdstatecolor /*int*/ ;
 }else {
RDebugUtils.currentLine=114556955;
 //BA.debugLineNum = 114556955;BA.debugLine="textColor = mDefaultColor";
_textcolor = __ref._mdefaultcolor /*int*/ ;
 }}}
;
RDebugUtils.currentLine=114556957;
 //BA.debugLineNum = 114556957;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
_thisradius = __ref._mradiussize /*int*/ ;
RDebugUtils.currentLine=114556958;
 //BA.debugLineNum = 114556958;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
_thisbordercolor = __ref._mbordercolor /*int*/ ;
RDebugUtils.currentLine=114556959;
 //BA.debugLineNum = 114556959;BA.debugLine="Dim thisBorder As Int = 0";
_thisborder = (int) (0);
RDebugUtils.currentLine=114556960;
 //BA.debugLineNum = 114556960;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
if (__ref._mshowborder /*boolean*/ ) { 
_thisborder = __ref._mbordersize /*int*/ ;};
RDebugUtils.currentLine=114556961;
 //BA.debugLineNum = 114556961;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=114556962;
 //BA.debugLineNum = 114556962;BA.debugLine="cd.initialize2(thisColor, thisRadius, thisBorder,";
_cd.Initialize2(_thiscolor,_thisradius,_thisborder,_thisbordercolor);
RDebugUtils.currentLine=114556963;
 //BA.debugLineNum = 114556963;BA.debugLine="mButton.background = cd";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=114556964;
 //BA.debugLineNum = 114556964;BA.debugLine="mButton.TextColor = textColor";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=114556966;
 //BA.debugLineNum = 114556966;BA.debugLine="mButton.tag = CreateSBG(mState, mButtonGroup, mRe";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(__ref._createsbg /*xevolution.vrcg.devdemov2400.b4xstatebutton._sbg*/ (null,__ref._mstate /*int*/ ,__ref._mbuttongroup /*int*/ ,__ref._mreference /*String*/ ,BA.ObjectToString(__ref._mtag /*Object*/ ))));
RDebugUtils.currentLine=114556967;
 //BA.debugLineNum = 114556967;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _parm) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_parm}));}
RDebugUtils.currentLine=116391936;
 //BA.debugLineNum = 116391936;BA.debugLine="public Sub setTextColor(parm As Int)";
RDebugUtils.currentLine=116391937;
 //BA.debugLineNum = 116391937;BA.debugLine="mButton.TextColor = parm";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(_parm);
RDebugUtils.currentLine=116391938;
 //BA.debugLineNum = 116391938;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _parm) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_parm}));}
RDebugUtils.currentLine=116523008;
 //BA.debugLineNum = 116523008;BA.debugLine="public Sub setTextSize(parm As Int)";
RDebugUtils.currentLine=116523009;
 //BA.debugLineNum = 116523009;BA.debugLine="mButton.TextSize = parm";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (_parm));
RDebugUtils.currentLine=116523010;
 //BA.debugLineNum = 116523010;BA.debugLine="End Sub";
return "";
}
public String  _setthirdstatecolor(xevolution.vrcg.devdemov2400.b4xstatebutton __ref,int _parm) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "setthirdstatecolor", false))
	 {return ((String) Debug.delegate(ba, "setthirdstatecolor", new Object[] {_parm}));}
RDebugUtils.currentLine=117112832;
 //BA.debugLineNum = 117112832;BA.debugLine="public Sub setThirdStateColor(parm As Int)";
RDebugUtils.currentLine=117112833;
 //BA.debugLineNum = 117112833;BA.debugLine="mThirdStateColor = xui.PaintOrColorToColor(parm)";
__ref._mthirdstatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_parm));
RDebugUtils.currentLine=117112834;
 //BA.debugLineNum = 117112834;BA.debugLine="End Sub";
return "";
}
public String  _thisbuttonclick_click(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "thisbuttonclick_click", false))
	 {return ((String) Debug.delegate(ba, "thisbuttonclick_click", null));}
xevolution.vrcg.devdemov2400.b4xstatebutton._sbg _bs = null;
RDebugUtils.currentLine=114360320;
 //BA.debugLineNum = 114360320;BA.debugLine="Private Sub ThisButtonClick_Click";
RDebugUtils.currentLine=114360321;
 //BA.debugLineNum = 114360321;BA.debugLine="If (mAllowClick) Then";
if ((__ref._mallowclick /*boolean*/ )) { 
RDebugUtils.currentLine=114360322;
 //BA.debugLineNum = 114360322;BA.debugLine="Dim bs As SBG = mButton.Tag";
_bs = (xevolution.vrcg.devdemov2400.b4xstatebutton._sbg)(__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=114360323;
 //BA.debugLineNum = 114360323;BA.debugLine="mState = bs.State";
__ref._mstate /*int*/  = _bs.State /*int*/ ;
RDebugUtils.currentLine=114360324;
 //BA.debugLineNum = 114360324;BA.debugLine="If mState = 0 Then";
if (__ref._mstate /*int*/ ==0) { 
RDebugUtils.currentLine=114360325;
 //BA.debugLineNum = 114360325;BA.debugLine="If mBooleanState Then";
if (__ref._mbooleanstate /*boolean*/ ) { 
RDebugUtils.currentLine=114360326;
 //BA.debugLineNum = 114360326;BA.debugLine="setState(1)";
__ref._setstate /*String*/ (null,(int) (1));
 }else {
RDebugUtils.currentLine=114360328;
 //BA.debugLineNum = 114360328;BA.debugLine="setState(NextSate)";
__ref._setstate /*String*/ (null,__ref._nextsate /*int*/ (null));
 };
 }else {
RDebugUtils.currentLine=114360331;
 //BA.debugLineNum = 114360331;BA.debugLine="If mBooleanState Then";
if (__ref._mbooleanstate /*boolean*/ ) { 
RDebugUtils.currentLine=114360332;
 //BA.debugLineNum = 114360332;BA.debugLine="setState(0)";
__ref._setstate /*String*/ (null,(int) (0));
 }else {
RDebugUtils.currentLine=114360334;
 //BA.debugLineNum = 114360334;BA.debugLine="setState(NextSate)";
__ref._setstate /*String*/ (null,__ref._nextsate /*int*/ (null));
 };
 };
 };
RDebugUtils.currentLine=114360338;
 //BA.debugLineNum = 114360338;BA.debugLine="CallSub2(mCallBack, mEventName & \"_StateClick\", g";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_StateClick",(Object)(__ref._getstate /*int*/ (null)));
RDebugUtils.currentLine=114360339;
 //BA.debugLineNum = 114360339;BA.debugLine="End Sub";
return "";
}
public String  _updatecontrol(xevolution.vrcg.devdemov2400.b4xstatebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xstatebutton";
if (Debug.shouldDelegate(ba, "updatecontrol", false))
	 {return ((String) Debug.delegate(ba, "updatecontrol", null));}
int _textcolor = 0;
int _thiscolor = 0;
int _thisradius = 0;
int _thisbordercolor = 0;
int _thisborder = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=116719616;
 //BA.debugLineNum = 116719616;BA.debugLine="public Sub UpdateControl";
RDebugUtils.currentLine=116719629;
 //BA.debugLineNum = 116719629;BA.debugLine="If (mUseDIP) Then";
if ((__ref._musedip /*boolean*/ )) { 
RDebugUtils.currentLine=116719630;
 //BA.debugLineNum = 116719630;BA.debugLine="mBorderSize = mBorderSize * 1dip";
__ref._mbordersize /*int*/  = (int) (__ref._mbordersize /*int*/ *__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=116719631;
 //BA.debugLineNum = 116719631;BA.debugLine="mRadiusSize = mRadiusSize * 1dip";
__ref._mradiussize /*int*/  = (int) (__ref._mradiussize /*int*/ *__c.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=116719634;
 //BA.debugLineNum = 116719634;BA.debugLine="mDefaultColor = mBaseLabel.TextColor";
__ref._mdefaultcolor /*int*/  = __ref._mbaselabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextColor();
RDebugUtils.currentLine=116719635;
 //BA.debugLineNum = 116719635;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=116719636;
 //BA.debugLineNum = 116719636;BA.debugLine="Dim thisColor As Int";
_thiscolor = 0;
RDebugUtils.currentLine=116719637;
 //BA.debugLineNum = 116719637;BA.debugLine="If mState = 0 Then";
if (__ref._mstate /*int*/ ==0) { 
RDebugUtils.currentLine=116719638;
 //BA.debugLineNum = 116719638;BA.debugLine="thisColor = mFirstStateColor";
_thiscolor = __ref._mfirststatecolor /*int*/ ;
RDebugUtils.currentLine=116719639;
 //BA.debugLineNum = 116719639;BA.debugLine="textColor = mDefaultColor";
_textcolor = __ref._mdefaultcolor /*int*/ ;
 }else 
{RDebugUtils.currentLine=116719640;
 //BA.debugLineNum = 116719640;BA.debugLine="else if mState = 1 Then";
if (__ref._mstate /*int*/ ==1) { 
RDebugUtils.currentLine=116719641;
 //BA.debugLineNum = 116719641;BA.debugLine="thisColor = mSecondStateColor";
_thiscolor = __ref._msecondstatecolor /*int*/ ;
RDebugUtils.currentLine=116719642;
 //BA.debugLineNum = 116719642;BA.debugLine="thisColor = mSecondStateColor";
_thiscolor = __ref._msecondstatecolor /*int*/ ;
 }else 
{RDebugUtils.currentLine=116719643;
 //BA.debugLineNum = 116719643;BA.debugLine="else if mState = 2 Then";
if (__ref._mstate /*int*/ ==2) { 
RDebugUtils.currentLine=116719644;
 //BA.debugLineNum = 116719644;BA.debugLine="thisColor = mThirdStateColor";
_thiscolor = __ref._mthirdstatecolor /*int*/ ;
RDebugUtils.currentLine=116719645;
 //BA.debugLineNum = 116719645;BA.debugLine="thisColor = mThirdStateColor";
_thiscolor = __ref._mthirdstatecolor /*int*/ ;
 }else {
RDebugUtils.currentLine=116719647;
 //BA.debugLineNum = 116719647;BA.debugLine="textColor = mDefaultColor";
_textcolor = __ref._mdefaultcolor /*int*/ ;
 }}}
;
RDebugUtils.currentLine=116719649;
 //BA.debugLineNum = 116719649;BA.debugLine="Dim thisRadius As Int = mRadiusSize";
_thisradius = __ref._mradiussize /*int*/ ;
RDebugUtils.currentLine=116719650;
 //BA.debugLineNum = 116719650;BA.debugLine="Dim thisBorderColor As Int = mBorderColor";
_thisbordercolor = __ref._mbordercolor /*int*/ ;
RDebugUtils.currentLine=116719651;
 //BA.debugLineNum = 116719651;BA.debugLine="Dim thisBorder As Int = 0";
_thisborder = (int) (0);
RDebugUtils.currentLine=116719652;
 //BA.debugLineNum = 116719652;BA.debugLine="If mShowBorder Then thisBorder = mBorderSize";
if (__ref._mshowborder /*boolean*/ ) { 
_thisborder = __ref._mbordersize /*int*/ ;};
RDebugUtils.currentLine=116719653;
 //BA.debugLineNum = 116719653;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=116719654;
 //BA.debugLineNum = 116719654;BA.debugLine="cd.initialize2(thisColor, thisRadius, thisBorder,";
_cd.Initialize2(_thiscolor,_thisradius,_thisborder,_thisbordercolor);
RDebugUtils.currentLine=116719655;
 //BA.debugLineNum = 116719655;BA.debugLine="mButton.background = cd";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=116719656;
 //BA.debugLineNum = 116719656;BA.debugLine="mButton.TextColor = textColor";
__ref._mbutton /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=116719659;
 //BA.debugLineNum = 116719659;BA.debugLine="End Sub";
return "";
}
}