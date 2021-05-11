package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xlistpanel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.b4xlistpanel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.b4xlistpanel.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public Object _tag = null;
public double _mleft = 0;
public double _mtop = 0;
public double _mwidth = 0;
public double _mheight = 0;
public double _mradius = 0;
public boolean _isgroup = false;
public boolean _issubgroup = false;
public boolean _isactive = false;
public boolean _isvisible = false;
public boolean _isexpanded = false;
public boolean _isreadonly = false;
public boolean _isrepeated = false;
public int _mid = 0;
public int _mgroup = 0;
public int _msubgroup = 0;
public int _mlevel = 0;
public int _mposition = 0;
public int _mrepeatcount = 0;
public int _mrepeatitemcount = 0;
public int _mrepeatfieldcount = 0;
public int _mbulletmaster = 0;
public int _mbulletchild = 0;
public int _mbulletinner = 0;
public int _mbulletlevel = 0;
public int _mcodeid = 0;
public String _reference = "";
public String _tagcode1 = "";
public String _tagcode2 = "";
public String _tagcode3 = "";
public String _tagcode4 = "";
public String _tagcode5 = "";
public String _tagcode6 = "";
public String _tagcode7 = "";
public String _value = "";
public String _mlastvalue = "";
public boolean _allowclick = false;
public boolean _allowhide = false;
public Object _other = null;
public int _mstate = 0;
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
public String  _base_resize(xevolution.vrcg.devdemov2400.b4xlistpanel __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=84213760;
 //BA.debugLineNum = 84213760;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=84213762;
 //BA.debugLineNum = 84213762;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.b4xlistpanel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
RDebugUtils.currentLine=84017152;
 //BA.debugLineNum = 84017152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=84017153;
 //BA.debugLineNum = 84017153;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=84017154;
 //BA.debugLineNum = 84017154;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=84017155;
 //BA.debugLineNum = 84017155;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=84017156;
 //BA.debugLineNum = 84017156;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=84017157;
 //BA.debugLineNum = 84017157;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=84017159;
 //BA.debugLineNum = 84017159;BA.debugLine="Private mLeft, mTop, mWidth, mHeight, mRadius As";
_mleft = 0;
_mtop = 0;
_mwidth = 0;
_mheight = 0;
_mradius = 0;
RDebugUtils.currentLine=84017162;
 //BA.debugLineNum = 84017162;BA.debugLine="Public IsGroup As Boolean = True";
_isgroup = __c.True;
RDebugUtils.currentLine=84017163;
 //BA.debugLineNum = 84017163;BA.debugLine="Public IsSubGroup As Boolean = True";
_issubgroup = __c.True;
RDebugUtils.currentLine=84017164;
 //BA.debugLineNum = 84017164;BA.debugLine="Public IsActive As Boolean = True";
_isactive = __c.True;
RDebugUtils.currentLine=84017165;
 //BA.debugLineNum = 84017165;BA.debugLine="Public IsVisible As Boolean = True";
_isvisible = __c.True;
RDebugUtils.currentLine=84017166;
 //BA.debugLineNum = 84017166;BA.debugLine="Public IsExpanded As Boolean = True";
_isexpanded = __c.True;
RDebugUtils.currentLine=84017167;
 //BA.debugLineNum = 84017167;BA.debugLine="Public IsReadOnly As Boolean = False";
_isreadonly = __c.False;
RDebugUtils.currentLine=84017168;
 //BA.debugLineNum = 84017168;BA.debugLine="Public IsRepeated As Boolean = False";
_isrepeated = __c.False;
RDebugUtils.currentLine=84017169;
 //BA.debugLineNum = 84017169;BA.debugLine="Private mID As Int = 0";
_mid = (int) (0);
RDebugUtils.currentLine=84017170;
 //BA.debugLineNum = 84017170;BA.debugLine="Private mGroup As Int = 0";
_mgroup = (int) (0);
RDebugUtils.currentLine=84017171;
 //BA.debugLineNum = 84017171;BA.debugLine="Private mSubGroup As Int = 0";
_msubgroup = (int) (0);
RDebugUtils.currentLine=84017172;
 //BA.debugLineNum = 84017172;BA.debugLine="Private mLevel As Int = 0";
_mlevel = (int) (0);
RDebugUtils.currentLine=84017173;
 //BA.debugLineNum = 84017173;BA.debugLine="Private mPosition As Int = 0";
_mposition = (int) (0);
RDebugUtils.currentLine=84017174;
 //BA.debugLineNum = 84017174;BA.debugLine="Private mRepeatCount As Int = 0";
_mrepeatcount = (int) (0);
RDebugUtils.currentLine=84017175;
 //BA.debugLineNum = 84017175;BA.debugLine="Private mRepeatItemCount As Int = 0";
_mrepeatitemcount = (int) (0);
RDebugUtils.currentLine=84017176;
 //BA.debugLineNum = 84017176;BA.debugLine="Private mRepeatFieldCount As Int = 0";
_mrepeatfieldcount = (int) (0);
RDebugUtils.currentLine=84017177;
 //BA.debugLineNum = 84017177;BA.debugLine="Private mBulletMaster As Int = 0";
_mbulletmaster = (int) (0);
RDebugUtils.currentLine=84017178;
 //BA.debugLineNum = 84017178;BA.debugLine="Private mBulletChild As Int = 0";
_mbulletchild = (int) (0);
RDebugUtils.currentLine=84017179;
 //BA.debugLineNum = 84017179;BA.debugLine="Private mBulletInner As Int = 0";
_mbulletinner = (int) (0);
RDebugUtils.currentLine=84017180;
 //BA.debugLineNum = 84017180;BA.debugLine="Private mBulletLevel As Int = 0";
_mbulletlevel = (int) (0);
RDebugUtils.currentLine=84017181;
 //BA.debugLineNum = 84017181;BA.debugLine="Private mCodeId As Int = 0";
_mcodeid = (int) (0);
RDebugUtils.currentLine=84017182;
 //BA.debugLineNum = 84017182;BA.debugLine="Public Reference As String = \"\"";
_reference = "";
RDebugUtils.currentLine=84017183;
 //BA.debugLineNum = 84017183;BA.debugLine="Public Tagcode1 As String = \"\"";
_tagcode1 = "";
RDebugUtils.currentLine=84017184;
 //BA.debugLineNum = 84017184;BA.debugLine="Public Tagcode2 As String = \"\"";
_tagcode2 = "";
RDebugUtils.currentLine=84017185;
 //BA.debugLineNum = 84017185;BA.debugLine="Public Tagcode3 As String = \"\"";
_tagcode3 = "";
RDebugUtils.currentLine=84017186;
 //BA.debugLineNum = 84017186;BA.debugLine="Public Tagcode4 As String = \"\"";
_tagcode4 = "";
RDebugUtils.currentLine=84017187;
 //BA.debugLineNum = 84017187;BA.debugLine="Public Tagcode5 As String = \"\"";
_tagcode5 = "";
RDebugUtils.currentLine=84017188;
 //BA.debugLineNum = 84017188;BA.debugLine="Public Tagcode6 As String = \"\"";
_tagcode6 = "";
RDebugUtils.currentLine=84017189;
 //BA.debugLineNum = 84017189;BA.debugLine="Public Tagcode7 As String = \"\"";
_tagcode7 = "";
RDebugUtils.currentLine=84017190;
 //BA.debugLineNum = 84017190;BA.debugLine="Public Value As String = \"\"";
_value = "";
RDebugUtils.currentLine=84017191;
 //BA.debugLineNum = 84017191;BA.debugLine="Private mLastValue As String = \"\"";
_mlastvalue = "";
RDebugUtils.currentLine=84017192;
 //BA.debugLineNum = 84017192;BA.debugLine="Public AllowClick As Boolean = True";
_allowclick = __c.True;
RDebugUtils.currentLine=84017193;
 //BA.debugLineNum = 84017193;BA.debugLine="Public AllowHide As Boolean = True";
_allowhide = __c.True;
RDebugUtils.currentLine=84017195;
 //BA.debugLineNum = 84017195;BA.debugLine="Public Other As Object";
_other = new Object();
RDebugUtils.currentLine=84017196;
 //BA.debugLineNum = 84017196;BA.debugLine="Private mState As Int = 0";
_mstate = (int) (0);
RDebugUtils.currentLine=84017197;
 //BA.debugLineNum = 84017197;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(xevolution.vrcg.devdemov2400.b4xlistpanel __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=84148224;
 //BA.debugLineNum = 84148224;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=84148225;
 //BA.debugLineNum = 84148225;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=84148226;
 //BA.debugLineNum = 84148226;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=84148227;
 //BA.debugLineNum = 84148227;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=84148228;
 //BA.debugLineNum = 84148228;BA.debugLine="getDesignProperties(Props)";
__ref._getdesignproperties /*String*/ (null,_props);
RDebugUtils.currentLine=84148229;
 //BA.debugLineNum = 84148229;BA.debugLine="End Sub";
return "";
}
public String  _getdesignproperties(xevolution.vrcg.devdemov2400.b4xlistpanel __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "getdesignproperties", false))
	 {return ((String) Debug.delegate(ba, "getdesignproperties", new Object[] {_props}));}
RDebugUtils.currentLine=84279296;
 //BA.debugLineNum = 84279296;BA.debugLine="Sub getDesignProperties(Props As Map)";
RDebugUtils.currentLine=84279297;
 //BA.debugLineNum = 84279297;BA.debugLine="IsGroup = Props.Get(\"IsGroup\")";
__ref._isgroup /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IsGroup")));
RDebugUtils.currentLine=84279298;
 //BA.debugLineNum = 84279298;BA.debugLine="IsSubGroup = Props.Get(\"IsSubGroup\")";
__ref._issubgroup /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IsSubGroup")));
RDebugUtils.currentLine=84279299;
 //BA.debugLineNum = 84279299;BA.debugLine="IsActive = Props.Get(\"IsActive\")";
__ref._isactive /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IsActive")));
RDebugUtils.currentLine=84279300;
 //BA.debugLineNum = 84279300;BA.debugLine="IsVisible = Props.Get(\"IsVisible\")";
__ref._isvisible /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IsVisible")));
RDebugUtils.currentLine=84279301;
 //BA.debugLineNum = 84279301;BA.debugLine="IsExpanded = Props.Get(\"IsExpanded\")";
__ref._isexpanded /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IsExpanded")));
RDebugUtils.currentLine=84279302;
 //BA.debugLineNum = 84279302;BA.debugLine="IsReadOnly = Props.Get(\"IsReadOnly\")";
__ref._isreadonly /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IsReadOnly")));
RDebugUtils.currentLine=84279303;
 //BA.debugLineNum = 84279303;BA.debugLine="IsRepeated = Props.Get(\"IsRepeated\")";
__ref._isrepeated /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IsRepeated")));
RDebugUtils.currentLine=84279304;
 //BA.debugLineNum = 84279304;BA.debugLine="Reference = Props.Get(\"Reference\")";
__ref._reference /*String*/  = BA.ObjectToString(_props.Get((Object)("Reference")));
RDebugUtils.currentLine=84279305;
 //BA.debugLineNum = 84279305;BA.debugLine="Tagcode1 = Props.Get(\"Tagcode1\")";
__ref._tagcode1 /*String*/  = BA.ObjectToString(_props.Get((Object)("Tagcode1")));
RDebugUtils.currentLine=84279306;
 //BA.debugLineNum = 84279306;BA.debugLine="Tagcode2 = Props.Get(\"Tagcode2\")";
__ref._tagcode2 /*String*/  = BA.ObjectToString(_props.Get((Object)("Tagcode2")));
RDebugUtils.currentLine=84279307;
 //BA.debugLineNum = 84279307;BA.debugLine="Tagcode3 = Props.Get(\"Tagcode3\")";
__ref._tagcode3 /*String*/  = BA.ObjectToString(_props.Get((Object)("Tagcode3")));
RDebugUtils.currentLine=84279308;
 //BA.debugLineNum = 84279308;BA.debugLine="Tagcode4 = Props.Get(\"Tagcode4\")";
__ref._tagcode4 /*String*/  = BA.ObjectToString(_props.Get((Object)("Tagcode4")));
RDebugUtils.currentLine=84279309;
 //BA.debugLineNum = 84279309;BA.debugLine="Tagcode5 = Props.Get(\"Tagcode5\")";
__ref._tagcode5 /*String*/  = BA.ObjectToString(_props.Get((Object)("Tagcode5")));
RDebugUtils.currentLine=84279310;
 //BA.debugLineNum = 84279310;BA.debugLine="Tagcode6 = Props.Get(\"Tagcode6\")";
__ref._tagcode6 /*String*/  = BA.ObjectToString(_props.Get((Object)("Tagcode6")));
RDebugUtils.currentLine=84279311;
 //BA.debugLineNum = 84279311;BA.debugLine="Tagcode7 = Props.Get(\"Tagcode7\")";
__ref._tagcode7 /*String*/  = BA.ObjectToString(_props.Get((Object)("Tagcode7")));
RDebugUtils.currentLine=84279312;
 //BA.debugLineNum = 84279312;BA.debugLine="Value = Props.Get(\"Value\")";
__ref._value /*String*/  = BA.ObjectToString(_props.Get((Object)("Value")));
RDebugUtils.currentLine=84279313;
 //BA.debugLineNum = 84279313;BA.debugLine="AllowClick = Props.Get(\"AllowClick\")";
__ref._allowclick /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("AllowClick")));
RDebugUtils.currentLine=84279314;
 //BA.debugLineNum = 84279314;BA.debugLine="AllowHide = Props.Get(\"AllowHide\")";
__ref._allowhide /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("AllowHide")));
RDebugUtils.currentLine=84279315;
 //BA.debugLineNum = 84279315;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getparent(xevolution.vrcg.devdemov2400.b4xlistpanel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "getparent", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getparent", null));}
RDebugUtils.currentLine=84344832;
 //BA.debugLineNum = 84344832;BA.debugLine="Public Sub getParent As B4XView";
RDebugUtils.currentLine=84344833;
 //BA.debugLineNum = 84344833;BA.debugLine="Return mBase.Parent";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=84344834;
 //BA.debugLineNum = 84344834;BA.debugLine="End Sub";
return null;
}
public int  _getstate(xevolution.vrcg.devdemov2400.b4xlistpanel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "getstate", false))
	 {return ((Integer) Debug.delegate(ba, "getstate", null));}
RDebugUtils.currentLine=84410368;
 //BA.debugLineNum = 84410368;BA.debugLine="Public Sub getState As Int";
RDebugUtils.currentLine=84410369;
 //BA.debugLineNum = 84410369;BA.debugLine="Return mState";
if (true) return __ref._mstate /*int*/ ;
RDebugUtils.currentLine=84410370;
 //BA.debugLineNum = 84410370;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(xevolution.vrcg.devdemov2400.b4xlistpanel __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=84082688;
 //BA.debugLineNum = 84082688;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=84082689;
 //BA.debugLineNum = 84082689;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=84082690;
 //BA.debugLineNum = 84082690;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=84082691;
 //BA.debugLineNum = 84082691;BA.debugLine="End Sub";
return "";
}
public String  _setexpandstate(xevolution.vrcg.devdemov2400.b4xlistpanel __ref,boolean _thisstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "setexpandstate", false))
	 {return ((String) Debug.delegate(ba, "setexpandstate", new Object[] {_thisstate}));}
RDebugUtils.currentLine=84672512;
 //BA.debugLineNum = 84672512;BA.debugLine="Public Sub setExpandState(thisState As Boolean)";
RDebugUtils.currentLine=84672513;
 //BA.debugLineNum = 84672513;BA.debugLine="IsExpanded = thisState";
__ref._isexpanded /*boolean*/  = _thisstate;
RDebugUtils.currentLine=84672514;
 //BA.debugLineNum = 84672514;BA.debugLine="If IsExpanded Then";
if (__ref._isexpanded /*boolean*/ ) { 
RDebugUtils.currentLine=84672515;
 //BA.debugLineNum = 84672515;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnExpand\"";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnExpand")) { 
RDebugUtils.currentLine=84672516;
 //BA.debugLineNum = 84672516;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnExpand\", m";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnExpand",(Object)(__ref._mstate /*int*/ ),(Object)(__ref._mid /*int*/ ));
 };
 }else {
RDebugUtils.currentLine=84672519;
 //BA.debugLineNum = 84672519;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnCollaps";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnCollapse")) { 
RDebugUtils.currentLine=84672520;
 //BA.debugLineNum = 84672520;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnCollapse\",";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnCollapse",(Object)(__ref._mstate /*int*/ ),(Object)(__ref._mid /*int*/ ));
 };
 };
RDebugUtils.currentLine=84672523;
 //BA.debugLineNum = 84672523;BA.debugLine="End Sub";
return "";
}
public String  _setreadonlystate(xevolution.vrcg.devdemov2400.b4xlistpanel __ref,boolean _thisstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "setreadonlystate", false))
	 {return ((String) Debug.delegate(ba, "setreadonlystate", new Object[] {_thisstate}));}
RDebugUtils.currentLine=84606976;
 //BA.debugLineNum = 84606976;BA.debugLine="Public Sub setReadOnlyState(thisState As Boolean)";
RDebugUtils.currentLine=84606977;
 //BA.debugLineNum = 84606977;BA.debugLine="IsReadOnly = thisState";
__ref._isreadonly /*boolean*/  = _thisstate;
RDebugUtils.currentLine=84606978;
 //BA.debugLineNum = 84606978;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnReadOnly";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnReadOnly")) { 
RDebugUtils.currentLine=84606979;
 //BA.debugLineNum = 84606979;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnReadOnly\",";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnReadOnly",(Object)(__ref._mstate /*int*/ ),(Object)(__ref._mid /*int*/ ));
 };
RDebugUtils.currentLine=84606981;
 //BA.debugLineNum = 84606981;BA.debugLine="End Sub";
return "";
}
public String  _setstate(xevolution.vrcg.devdemov2400.b4xlistpanel __ref,int _thisstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "setstate", false))
	 {return ((String) Debug.delegate(ba, "setstate", new Object[] {_thisstate}));}
RDebugUtils.currentLine=84475904;
 //BA.debugLineNum = 84475904;BA.debugLine="Public Sub setState(thisState As Int)";
RDebugUtils.currentLine=84475905;
 //BA.debugLineNum = 84475905;BA.debugLine="mState = thisState";
__ref._mstate /*int*/  = _thisstate;
RDebugUtils.currentLine=84475906;
 //BA.debugLineNum = 84475906;BA.debugLine="End Sub";
return "";
}
public String  _setvisiblestate(xevolution.vrcg.devdemov2400.b4xlistpanel __ref,boolean _thisstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlistpanel";
if (Debug.shouldDelegate(ba, "setvisiblestate", false))
	 {return ((String) Debug.delegate(ba, "setvisiblestate", new Object[] {_thisstate}));}
RDebugUtils.currentLine=84541440;
 //BA.debugLineNum = 84541440;BA.debugLine="Public Sub setVisibleState(thisState As Boolean)";
RDebugUtils.currentLine=84541441;
 //BA.debugLineNum = 84541441;BA.debugLine="IsVisible = thisState";
__ref._isvisible /*boolean*/  = _thisstate;
RDebugUtils.currentLine=84541442;
 //BA.debugLineNum = 84541442;BA.debugLine="If IsVisible Then";
if (__ref._isvisible /*boolean*/ ) { 
RDebugUtils.currentLine=84541443;
 //BA.debugLineNum = 84541443;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnVisible";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnVisible")) { 
RDebugUtils.currentLine=84541444;
 //BA.debugLineNum = 84541444;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnVisible\",";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnVisible",(Object)(__ref._mstate /*int*/ ),(Object)(__ref._mid /*int*/ ));
 };
 }else {
RDebugUtils.currentLine=84541447;
 //BA.debugLineNum = 84541447;BA.debugLine="If SubExists(mCallBack, mEventName & \"_OnHide\")";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnHide")) { 
RDebugUtils.currentLine=84541448;
 //BA.debugLineNum = 84541448;BA.debugLine="CallSub3(mCallBack, mEventName & \"_OnHide\", mSt";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_OnHide",(Object)(__ref._mstate /*int*/ ),(Object)(__ref._mid /*int*/ ));
 };
 };
RDebugUtils.currentLine=84541451;
 //BA.debugLineNum = 84541451;BA.debugLine="End Sub";
return "";
}
}