package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cameraexclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.cameraexclass");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.cameraexclass.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _camerainfoandid{
public boolean IsInitialized;
public Object CameraInfo;
public int Id;
public void Initialize() {
IsInitialized = true;
CameraInfo = new Object();
Id = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _camerasize{
public boolean IsInitialized;
public int Width;
public int Height;
public void Initialize() {
IsInitialized = true;
Width = 0;
Height = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public Object _nativecam = null;
public anywheresoftware.b4a.objects.CameraW _cam = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
public Object _target = null;
public String _event = "";
public boolean _front = false;
public Object _parameters = null;
public int _previeworientation = 0;
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
public String  _release(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "release", false))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=127074304;
 //BA.debugLineNum = 127074304;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=127074305;
 //BA.debugLineNum = 127074305;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=127074306;
 //BA.debugLineNum = 127074306;BA.debugLine="End Sub";
return "";
}
public String  _initialize(xevolution.vrcg.devdemov2400.cameraexclass __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _panel1,boolean _frontcamera,Object _targetmodule,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_panel1,_frontcamera,_targetmodule,_eventname}));}
int _id = 0;
RDebugUtils.currentLine=126484480;
 //BA.debugLineNum = 126484480;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
RDebugUtils.currentLine=126484481;
 //BA.debugLineNum = 126484481;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=126484482;
 //BA.debugLineNum = 126484482;BA.debugLine="event = EventName";
__ref._event /*String*/  = _eventname;
RDebugUtils.currentLine=126484483;
 //BA.debugLineNum = 126484483;BA.debugLine="Front = FrontCamera";
__ref._front /*boolean*/  = _frontcamera;
RDebugUtils.currentLine=126484484;
 //BA.debugLineNum = 126484484;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=126484485;
 //BA.debugLineNum = 126484485;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=126484486;
 //BA.debugLineNum = 126484486;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=126484487;
 //BA.debugLineNum = 126484487;BA.debugLine="Front = Not(Front) 'try different camera";
__ref._front /*boolean*/  = __c.Not(__ref._front /*boolean*/ );
RDebugUtils.currentLine=126484488;
 //BA.debugLineNum = 126484488;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=126484489;
 //BA.debugLineNum = 126484489;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=126484490;
 //BA.debugLineNum = 126484490;BA.debugLine="ToastMessageShow(\"No camera found.\", True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No camera found."),__c.True);
RDebugUtils.currentLine=126484491;
 //BA.debugLineNum = 126484491;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=126484494;
 //BA.debugLineNum = 126484494;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Initialize2(ba,(android.view.ViewGroup)(_panel1.getObject()),"camera",_id);
RDebugUtils.currentLine=126484495;
 //BA.debugLineNum = 126484495;BA.debugLine="End Sub";
return "";
}
public xevolution.vrcg.devdemov2400.cameraexclass._camerasize  _getpreviewsize(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpreviewsize", false))
	 {return ((xevolution.vrcg.devdemov2400.cameraexclass._camerasize) Debug.delegate(ba, "getpreviewsize", null));}
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=128319488;
 //BA.debugLineNum = 128319488;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
RDebugUtils.currentLine=128319489;
 //BA.debugLineNum = 128319489;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128319490;
 //BA.debugLineNum = 128319490;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=128319491;
 //BA.debugLineNum = 128319491;BA.debugLine="Dim cs As CameraSize";
_cs = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
RDebugUtils.currentLine=128319493;
 //BA.debugLineNum = 128319493;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=128319494;
 //BA.debugLineNum = 128319494;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=128319495;
 //BA.debugLineNum = 128319495;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=128319496;
 //BA.debugLineNum = 128319496;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=128319497;
 //BA.debugLineNum = 128319497;BA.debugLine="End Sub";
return null;
}
public String  _setjpegquality(xevolution.vrcg.devdemov2400.cameraexclass __ref,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setjpegquality", false))
	 {return ((String) Debug.delegate(ba, "setjpegquality", new Object[] {_quality}));}
RDebugUtils.currentLine=127795200;
 //BA.debugLineNum = 127795200;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
RDebugUtils.currentLine=127795201;
 //BA.debugLineNum = 127795201;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127795202;
 //BA.debugLineNum = 127795202;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setJpegQuality",BA.NumberToString(_quality),"java.lang.int");
RDebugUtils.currentLine=127795203;
 //BA.debugLineNum = 127795203;BA.debugLine="End Sub";
return "";
}
public String  _setcontinuousautofocus(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcontinuousautofocus", false))
	 {return ((String) Debug.delegate(ba, "setcontinuousautofocus", null));}
anywheresoftware.b4a.objects.collections.List _modes = null;
RDebugUtils.currentLine=128581632;
 //BA.debugLineNum = 128581632;BA.debugLine="Public Sub SetContinuousAutoFocus";
RDebugUtils.currentLine=128581633;
 //BA.debugLineNum = 128581633;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
_modes = new anywheresoftware.b4a.objects.collections.List();
_modes = __ref._getsupportedfocusmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=128581634;
 //BA.debugLineNum = 128581634;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Then";
if (_modes.IndexOf((Object)("continuous-picture"))>-1) { 
RDebugUtils.currentLine=128581635;
 //BA.debugLineNum = 128581635;BA.debugLine="SetFocusMode(\"continuous-picture\")";
__ref._setfocusmode /*String*/ (null,"continuous-picture");
 }else 
{RDebugUtils.currentLine=128581636;
 //BA.debugLineNum = 128581636;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1 Th";
if (_modes.IndexOf((Object)("continuous-video"))>-1) { 
RDebugUtils.currentLine=128581637;
 //BA.debugLineNum = 128581637;BA.debugLine="SetFocusMode(\"continuous-video\")";
__ref._setfocusmode /*String*/ (null,"continuous-video");
 }else {
RDebugUtils.currentLine=128581639;
 //BA.debugLineNum = 128581639;BA.debugLine="Log(\"Continuous focus mode is not available\")";
__c.LogImpl("6128581639","Continuous focus mode is not available",0);
 }}
;
RDebugUtils.currentLine=128581641;
 //BA.debugLineNum = 128581641;BA.debugLine="End Sub";
return "";
}
public String  _commitparameters(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "commitparameters", false))
	 {return ((String) Debug.delegate(ba, "commitparameters", null));}
RDebugUtils.currentLine=127336448;
 //BA.debugLineNum = 127336448;BA.debugLine="Public Sub CommitParameters";
RDebugUtils.currentLine=127336449;
 //BA.debugLineNum = 127336449;BA.debugLine="Try";
try {RDebugUtils.currentLine=127336450;
 //BA.debugLineNum = 127336450;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=127336451;
 //BA.debugLineNum = 127336451;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(pa";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("setParameters",new Object[]{__ref._parameters /*Object*/ },new String[]{"android.hardware.Camera$Parameters"});
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=127336453;
 //BA.debugLineNum = 127336453;BA.debugLine="Log(LastException)";
__c.LogImpl("6127336453",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=127336455;
 //BA.debugLineNum = 127336455;BA.debugLine="End Sub";
return "";
}
public String  _startpreview(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "startpreview", false))
	 {return ((String) Debug.delegate(ba, "startpreview", null));}
RDebugUtils.currentLine=126943232;
 //BA.debugLineNum = 126943232;BA.debugLine="Public Sub StartPreview";
RDebugUtils.currentLine=126943233;
 //BA.debugLineNum = 126943233;BA.debugLine="cam.StartPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StartPreview();
RDebugUtils.currentLine=126943234;
 //BA.debugLineNum = 126943234;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcoloreffects(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedcoloreffects", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedcoloreffects", null));}
RDebugUtils.currentLine=128057344;
 //BA.debugLineNum = 128057344;BA.debugLine="Public Sub GetSupportedColorEffects As List";
RDebugUtils.currentLine=128057345;
 //BA.debugLineNum = 128057345;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128057346;
 //BA.debugLineNum = 128057346;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedColorEffects")));
RDebugUtils.currentLine=128057347;
 //BA.debugLineNum = 128057347;BA.debugLine="End Sub";
return null;
}
public String  _getcoloreffect(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "getcoloreffect", null));}
RDebugUtils.currentLine=127401984;
 //BA.debugLineNum = 127401984;BA.debugLine="Public Sub GetColorEffect As String";
RDebugUtils.currentLine=127401985;
 //BA.debugLineNum = 127401985;BA.debugLine="Return GetParameter(\"effect\")";
if (true) return __ref._getparameter /*String*/ (null,"effect");
RDebugUtils.currentLine=127401986;
 //BA.debugLineNum = 127401986;BA.debugLine="End Sub";
return "";
}
public String  _setcoloreffect(xevolution.vrcg.devdemov2400.cameraexclass __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "setcoloreffect", new Object[] {_effect}));}
RDebugUtils.currentLine=127467520;
 //BA.debugLineNum = 127467520;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
RDebugUtils.currentLine=127467521;
 //BA.debugLineNum = 127467521;BA.debugLine="SetParameter(\"effect\", Effect)";
__ref._setparameter /*String*/ (null,"effect",_effect);
RDebugUtils.currentLine=127467522;
 //BA.debugLineNum = 127467522;BA.debugLine="End Sub";
return "";
}
public float[]  _getfocusdistances(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getfocusdistances", false))
	 {return ((float[]) Debug.delegate(ba, "getfocusdistances", null));}
float[] _f = null;
RDebugUtils.currentLine=128712704;
 //BA.debugLineNum = 128712704;BA.debugLine="Public Sub GetFocusDistances As Float()";
RDebugUtils.currentLine=128712705;
 //BA.debugLineNum = 128712705;BA.debugLine="Dim F(3) As Float";
_f = new float[(int) (3)];
;
RDebugUtils.currentLine=128712706;
 //BA.debugLineNum = 128712706;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128712707;
 //BA.debugLineNum = 128712707;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("getFocusDistances",new Object[]{(Object)(_f)},new String[]{"[F"});
RDebugUtils.currentLine=128712708;
 //BA.debugLineNum = 128712708;BA.debugLine="Return F";
if (true) return _f;
RDebugUtils.currentLine=128712709;
 //BA.debugLineNum = 128712709;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedflashmodes(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedflashmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedflashmodes", null));}
RDebugUtils.currentLine=127991808;
 //BA.debugLineNum = 127991808;BA.debugLine="Public Sub GetSupportedFlashModes As List";
RDebugUtils.currentLine=127991809;
 //BA.debugLineNum = 127991809;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127991810;
 //BA.debugLineNum = 127991810;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFlashModes")));
RDebugUtils.currentLine=127991811;
 //BA.debugLineNum = 127991811;BA.debugLine="End Sub";
return null;
}
public String  _getflashmode(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getflashmode", false))
	 {return ((String) Debug.delegate(ba, "getflashmode", null));}
RDebugUtils.currentLine=127926272;
 //BA.debugLineNum = 127926272;BA.debugLine="Public Sub GetFlashMode As String";
RDebugUtils.currentLine=127926273;
 //BA.debugLineNum = 127926273;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127926274;
 //BA.debugLineNum = 127926274;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getFlashMode"));
RDebugUtils.currentLine=127926275;
 //BA.debugLineNum = 127926275;BA.debugLine="End Sub";
return "";
}
public String  _setflashmode(xevolution.vrcg.devdemov2400.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setflashmode", false))
	 {return ((String) Debug.delegate(ba, "setflashmode", new Object[] {_mode}));}
RDebugUtils.currentLine=127860736;
 //BA.debugLineNum = 127860736;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
RDebugUtils.currentLine=127860737;
 //BA.debugLineNum = 127860737;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127860738;
 //BA.debugLineNum = 127860738;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFlashMode",_mode,"java.lang.String");
RDebugUtils.currentLine=127860739;
 //BA.debugLineNum = 127860739;BA.debugLine="End Sub";
return "";
}
public String  _focusandtakepicture(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "focusandtakepicture", false))
	 {return ((String) Debug.delegate(ba, "focusandtakepicture", null));}
RDebugUtils.currentLine=128909312;
 //BA.debugLineNum = 128909312;BA.debugLine="Public Sub FocusAndTakePicture";
RDebugUtils.currentLine=128909313;
 //BA.debugLineNum = 128909313;BA.debugLine="cam.AutoFocus";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .AutoFocus();
RDebugUtils.currentLine=128909314;
 //BA.debugLineNum = 128909314;BA.debugLine="End Sub";
return "";
}
public xevolution.vrcg.devdemov2400.cameraexclass._camerasize[]  _getsupportedpicturessizes(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpicturessizes", false))
	 {return ((xevolution.vrcg.devdemov2400.cameraexclass._camerasize[]) Debug.delegate(ba, "getsupportedpicturessizes", null));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize[] _cs = null;
int _i = 0;
RDebugUtils.currentLine=127664128;
 //BA.debugLineNum = 127664128;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
RDebugUtils.currentLine=127664129;
 //BA.debugLineNum = 127664129;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127664130;
 //BA.debugLineNum = 127664130;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPictureSizes")));
RDebugUtils.currentLine=127664131;
 //BA.debugLineNum = 127664131;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
}
}
;
RDebugUtils.currentLine=127664132;
 //BA.debugLineNum = 127664132;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=127664133;
 //BA.debugLineNum = 127664133;BA.debugLine="r.target = list1.get(i)";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _list1.Get(_i);
RDebugUtils.currentLine=127664135;
 //BA.debugLineNum = 127664135;BA.debugLine="cs(i).Initialize";
_cs[_i].Initialize();
RDebugUtils.currentLine=127664136;
 //BA.debugLineNum = 127664136;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=127664137;
 //BA.debugLineNum = 127664137;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
 }
};
RDebugUtils.currentLine=127664139;
 //BA.debugLineNum = 127664139;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=127664140;
 //BA.debugLineNum = 127664140;BA.debugLine="End Sub";
return null;
}
public xevolution.vrcg.devdemov2400.cameraexclass._camerasize  _getpicturesize(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpicturesize", false))
	 {return ((xevolution.vrcg.devdemov2400.cameraexclass._camerasize) Debug.delegate(ba, "getpicturesize", null));}
boolean _cont = false;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=128385024;
 //BA.debugLineNum = 128385024;BA.debugLine="Public Sub GetPictureSize As CameraSize";
RDebugUtils.currentLine=128385025;
 //BA.debugLineNum = 128385025;BA.debugLine="Dim cont As Boolean= True";
_cont = __c.True;
RDebugUtils.currentLine=128385026;
 //BA.debugLineNum = 128385026;BA.debugLine="Try";
try {RDebugUtils.currentLine=128385027;
 //BA.debugLineNum = 128385027;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128385028;
 //BA.debugLineNum = 128385028;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPictureSize");
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=128385030;
 //BA.debugLineNum = 128385030;BA.debugLine="Log(LastException)";
__c.LogImpl("6128385030",BA.ObjectToString(__c.LastException(ba)),0);
RDebugUtils.currentLine=128385031;
 //BA.debugLineNum = 128385031;BA.debugLine="cont = False";
_cont = __c.False;
 };
RDebugUtils.currentLine=128385034;
 //BA.debugLineNum = 128385034;BA.debugLine="Dim cs As CameraSize";
_cs = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
RDebugUtils.currentLine=128385037;
 //BA.debugLineNum = 128385037;BA.debugLine="cs.Initialize";
_cs.Initialize();
RDebugUtils.currentLine=128385038;
 //BA.debugLineNum = 128385038;BA.debugLine="If cont Then";
if (_cont) { 
RDebugUtils.currentLine=128385039;
 //BA.debugLineNum = 128385039;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=128385040;
 //BA.debugLineNum = 128385040;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
 };
RDebugUtils.currentLine=128385043;
 //BA.debugLineNum = 128385043;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=128385044;
 //BA.debugLineNum = 128385044;BA.debugLine="End Sub";
return null;
}
public String  _setpicturesize(xevolution.vrcg.devdemov2400.cameraexclass __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpicturesize", false))
	 {return ((String) Debug.delegate(ba, "setpicturesize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=127729664;
 //BA.debugLineNum = 127729664;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
RDebugUtils.currentLine=127729665;
 //BA.debugLineNum = 127729665;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127729666;
 //BA.debugLineNum = 127729666;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("setPictureSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=127729667;
 //BA.debugLineNum = 127729667;BA.debugLine="End Sub";
return "";
}
public String  _takepicture(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "takepicture", false))
	 {return ((String) Debug.delegate(ba, "takepicture", null));}
RDebugUtils.currentLine=126812160;
 //BA.debugLineNum = 126812160;BA.debugLine="Public Sub TakePicture";
RDebugUtils.currentLine=126812161;
 //BA.debugLineNum = 126812161;BA.debugLine="Try";
try {RDebugUtils.currentLine=126812162;
 //BA.debugLineNum = 126812162;BA.debugLine="cam.TakePicture";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .TakePicture();
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=126812164;
 //BA.debugLineNum = 126812164;BA.debugLine="Log(LastException)";
__c.LogImpl("6126812164",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=126812167;
 //BA.debugLineNum = 126812167;BA.debugLine="End Sub";
return "";
}
public String  _savepicturetofile(xevolution.vrcg.devdemov2400.cameraexclass __ref,byte[] _data,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "savepicturetofile", false))
	 {return ((String) Debug.delegate(ba, "savepicturetofile", new Object[] {_data,_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=127139840;
 //BA.debugLineNum = 127139840;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
RDebugUtils.currentLine=127139841;
 //BA.debugLineNum = 127139841;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=127139842;
 //BA.debugLineNum = 127139842;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=127139843;
 //BA.debugLineNum = 127139843;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=127139844;
 //BA.debugLineNum = 127139844;BA.debugLine="End Sub";
return "";
}
public boolean  _iszoomsupported(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "iszoomsupported", false))
	 {return ((Boolean) Debug.delegate(ba, "iszoomsupported", null));}
RDebugUtils.currentLine=129040384;
 //BA.debugLineNum = 129040384;BA.debugLine="Public Sub IsZoomSupported As Boolean";
RDebugUtils.currentLine=129040385;
 //BA.debugLineNum = 129040385;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=129040386;
 //BA.debugLineNum = 129040386;BA.debugLine="Return r.RunMethod(\"isZoomSupported\")";
if (true) return BA.ObjectToBoolean(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("isZoomSupported"));
RDebugUtils.currentLine=129040387;
 //BA.debugLineNum = 129040387;BA.debugLine="End Sub";
return false;
}
public String  _setzoom(xevolution.vrcg.devdemov2400.cameraexclass __ref,int _zoomvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setzoom", false))
	 {return ((String) Debug.delegate(ba, "setzoom", new Object[] {_zoomvalue}));}
RDebugUtils.currentLine=129236992;
 //BA.debugLineNum = 129236992;BA.debugLine="Public Sub setZoom(ZoomValue As Int)";
RDebugUtils.currentLine=129236993;
 //BA.debugLineNum = 129236993;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=129236994;
 //BA.debugLineNum = 129236994;BA.debugLine="r.RunMethod2(\"setZoom\", ZoomValue, \"java.lang.int";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setZoom",BA.NumberToString(_zoomvalue),"java.lang.int");
RDebugUtils.currentLine=129236995;
 //BA.debugLineNum = 129236995;BA.debugLine="End Sub";
return "";
}
public int  _getmaxzoom(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getmaxzoom", false))
	 {return ((Integer) Debug.delegate(ba, "getmaxzoom", null));}
RDebugUtils.currentLine=129105920;
 //BA.debugLineNum = 129105920;BA.debugLine="Public Sub GetMaxZoom As Int";
RDebugUtils.currentLine=129105921;
 //BA.debugLineNum = 129105921;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=129105922;
 //BA.debugLineNum = 129105922;BA.debugLine="Return r.RunMethod(\"getMaxZoom\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getMaxZoom")));
RDebugUtils.currentLine=129105923;
 //BA.debugLineNum = 129105923;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedfocusmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedfocusmodes", null));}
RDebugUtils.currentLine=128516096;
 //BA.debugLineNum = 128516096;BA.debugLine="Public Sub GetSupportedFocusModes As List";
RDebugUtils.currentLine=128516097;
 //BA.debugLineNum = 128516097;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128516098;
 //BA.debugLineNum = 128516098;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=128516099;
 //BA.debugLineNum = 128516099;BA.debugLine="End Sub";
return null;
}
public void  _camera_focusdone(xevolution.vrcg.devdemov2400.cameraexclass __ref,boolean _success) throws Exception{
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_focusdone", false))
	 {Debug.delegate(ba, "camera_focusdone", new Object[] {_success}); return;}
ResumableSub_Camera_FocusDone rsub = new ResumableSub_Camera_FocusDone(this,__ref,_success);
rsub.resume(ba, null);
}
public static class ResumableSub_Camera_FocusDone extends BA.ResumableSub {
public ResumableSub_Camera_FocusDone(xevolution.vrcg.devdemov2400.cameraexclass parent,xevolution.vrcg.devdemov2400.cameraexclass __ref,boolean _success) {
this.parent = parent;
this.__ref = __ref;
this._success = _success;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.cameraexclass __ref;
xevolution.vrcg.devdemov2400.cameraexclass parent;
boolean _success;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraexclass";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=128974849;
 //BA.debugLineNum = 128974849;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=128974850;
 //BA.debugLineNum = 128974850;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraexclass", "camera_focusdone"),(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=128974851;
 //BA.debugLineNum = 128974851;BA.debugLine="TakePicture";
__ref._takepicture /*String*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=128974853;
 //BA.debugLineNum = 128974853;BA.debugLine="Log(\"AutoFocus error.\")";
parent.__c.LogImpl("6128974853","AutoFocus error.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=128974855;
 //BA.debugLineNum = 128974855;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _camera_picturetaken(xevolution.vrcg.devdemov2400.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_picturetaken", false))
	 {return ((String) Debug.delegate(ba, "camera_picturetaken", new Object[] {_data}));}
RDebugUtils.currentLine=126877696;
 //BA.debugLineNum = 126877696;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=126877697;
 //BA.debugLineNum = 126877697;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_PictureTaken",(Object)(_data));
RDebugUtils.currentLine=126877698;
 //BA.debugLineNum = 126877698;BA.debugLine="End Sub";
return "";
}
public String  _camera_preview(xevolution.vrcg.devdemov2400.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_preview", false))
	 {return ((String) Debug.delegate(ba, "camera_preview", new Object[] {_data}));}
RDebugUtils.currentLine=126746624;
 //BA.debugLineNum = 126746624;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
RDebugUtils.currentLine=126746625;
 //BA.debugLineNum = 126746625;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_preview")) { 
RDebugUtils.currentLine=126746626;
 //BA.debugLineNum = 126746626;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_preview",(Object)(_data));
 };
RDebugUtils.currentLine=126746628;
 //BA.debugLineNum = 126746628;BA.debugLine="End Sub";
return "";
}
public String  _camera_ready(xevolution.vrcg.devdemov2400.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_ready", false))
	 {return ((String) Debug.delegate(ba, "camera_ready", new Object[] {_success}));}
RDebugUtils.currentLine=126681088;
 //BA.debugLineNum = 126681088;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
RDebugUtils.currentLine=126681089;
 //BA.debugLineNum = 126681089;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=126681090;
 //BA.debugLineNum = 126681090;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=126681091;
 //BA.debugLineNum = 126681091;BA.debugLine="nativeCam = r.GetField(\"camera\")";
__ref._nativecam /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("camera");
RDebugUtils.currentLine=126681092;
 //BA.debugLineNum = 126681092;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=126681093;
 //BA.debugLineNum = 126681093;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
__ref._parameters /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getParameters");
RDebugUtils.currentLine=126681094;
 //BA.debugLineNum = 126681094;BA.debugLine="SetDisplayOrientation";
__ref._setdisplayorientation /*void*/ (null);
 }else {
RDebugUtils.currentLine=126681096;
 //BA.debugLineNum = 126681096;BA.debugLine="Log(\"success = false, \" & LastException.Message)";
__c.LogImpl("6126681096","success = false, "+__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=126681098;
 //BA.debugLineNum = 126681098;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_ready",(Object)(_success));
RDebugUtils.currentLine=126681099;
 //BA.debugLineNum = 126681099;BA.debugLine="End Sub";
return "";
}
public void  _setdisplayorientation(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setdisplayorientation", false))
	 {Debug.delegate(ba, "setdisplayorientation", null); return;}
ResumableSub_SetDisplayOrientation rsub = new ResumableSub_SetDisplayOrientation(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SetDisplayOrientation extends BA.ResumableSub {
public ResumableSub_SetDisplayOrientation(xevolution.vrcg.devdemov2400.cameraexclass parent,xevolution.vrcg.devdemov2400.cameraexclass __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.cameraexclass __ref;
xevolution.vrcg.devdemov2400.cameraexclass parent;
int _result = 0;
int _degrees = 0;
xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid _ci = null;
int _orientation = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraexclass";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126615553;
 //BA.debugLineNum = 126615553;BA.debugLine="r.target = r.GetActivity";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetActivity(ba));
RDebugUtils.currentLine=126615554;
 //BA.debugLineNum = 126615554;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWindowManager");
RDebugUtils.currentLine=126615555;
 //BA.debugLineNum = 126615555;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getDefaultDisplay");
RDebugUtils.currentLine=126615556;
 //BA.debugLineNum = 126615556;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getRotation");
RDebugUtils.currentLine=126615557;
 //BA.debugLineNum = 126615557;BA.debugLine="Dim result, degrees As Int = r.target * 90";
_result = 0;
_degrees = (int) ((double)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target))*90);
RDebugUtils.currentLine=126615558;
 //BA.debugLineNum = 126615558;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
_ci = __ref._findcamera /*xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ );
RDebugUtils.currentLine=126615559;
 //BA.debugLineNum = 126615559;BA.debugLine="r.target = ci.CameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _ci.CameraInfo /*Object*/ ;
RDebugUtils.currentLine=126615560;
 //BA.debugLineNum = 126615560;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
_orientation = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("orientation")));
RDebugUtils.currentLine=126615561;
 //BA.debugLineNum = 126615561;BA.debugLine="If Front Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._front /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=126615562;
 //BA.debugLineNum = 126615562;BA.debugLine="PreviewOrientation = (orientation + degrees) Mod";
__ref._previeworientation /*int*/  = (int) ((_orientation+_degrees)%360);
RDebugUtils.currentLine=126615563;
 //BA.debugLineNum = 126615563;BA.debugLine="result = PreviewOrientation";
_result = __ref._previeworientation /*int*/ ;
RDebugUtils.currentLine=126615564;
 //BA.debugLineNum = 126615564;BA.debugLine="PreviewOrientation = (360 - PreviewOrientation)";
__ref._previeworientation /*int*/  = (int) ((360-__ref._previeworientation /*int*/ )%360);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=126615566;
 //BA.debugLineNum = 126615566;BA.debugLine="PreviewOrientation = (orientation - degrees + 36";
__ref._previeworientation /*int*/  = (int) ((_orientation-_degrees+360)%360);
RDebugUtils.currentLine=126615567;
 //BA.debugLineNum = 126615567;BA.debugLine="result = PreviewOrientation";
_result = __ref._previeworientation /*int*/ ;
RDebugUtils.currentLine=126615568;
 //BA.debugLineNum = 126615568;BA.debugLine="Log(\"Preview Orientation: \" & PreviewOrientation";
parent.__c.LogImpl("6126615568","Preview Orientation: "+BA.NumberToString(__ref._previeworientation /*int*/ ),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=126615570;
 //BA.debugLineNum = 126615570;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=126615571;
 //BA.debugLineNum = 126615571;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", PreviewOrie";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setDisplayOrientation",BA.NumberToString(__ref._previeworientation /*int*/ ),"java.lang.int");
RDebugUtils.currentLine=126615572;
 //BA.debugLineNum = 126615572;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=126615573;
 //BA.debugLineNum = 126615573;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setRotation",BA.NumberToString(_result),"java.lang.int");
RDebugUtils.currentLine=126615582;
 //BA.debugLineNum = 126615582;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraexclass", "setdisplayorientation"),(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=126615583;
 //BA.debugLineNum = 126615583;BA.debugLine="CommitParameters";
__ref._commitparameters /*String*/ (null);
RDebugUtils.currentLine=126615584;
 //BA.debugLineNum = 126615584;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=126418944;
 //BA.debugLineNum = 126418944;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=126418945;
 //BA.debugLineNum = 126418945;BA.debugLine="Private nativeCam As Object";
_nativecam = new Object();
RDebugUtils.currentLine=126418946;
 //BA.debugLineNum = 126418946;BA.debugLine="Private cam As Camera";
_cam = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=126418947;
 //BA.debugLineNum = 126418947;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=126418948;
 //BA.debugLineNum = 126418948;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=126418949;
 //BA.debugLineNum = 126418949;BA.debugLine="Private event As String";
_event = "";
RDebugUtils.currentLine=126418950;
 //BA.debugLineNum = 126418950;BA.debugLine="Public Front As Boolean";
_front = false;
RDebugUtils.currentLine=126418951;
 //BA.debugLineNum = 126418951;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
RDebugUtils.currentLine=126418952;
 //BA.debugLineNum = 126418952;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
RDebugUtils.currentLine=126418953;
 //BA.debugLineNum = 126418953;BA.debugLine="Private parameters As Object";
_parameters = new Object();
RDebugUtils.currentLine=126418954;
 //BA.debugLineNum = 126418954;BA.debugLine="Public PreviewOrientation As Int";
_previeworientation = 0;
RDebugUtils.currentLine=126418955;
 //BA.debugLineNum = 126418955;BA.debugLine="End Sub";
return "";
}
public String  _closenow(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "closenow", false))
	 {return ((String) Debug.delegate(ba, "closenow", null));}
RDebugUtils.currentLine=128843776;
 //BA.debugLineNum = 128843776;BA.debugLine="Public Sub CloseNow";
RDebugUtils.currentLine=128843777;
 //BA.debugLineNum = 128843777;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=128843778;
 //BA.debugLineNum = 128843778;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=128843779;
 //BA.debugLineNum = 128843779;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("releaseCameras",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=128843780;
 //BA.debugLineNum = 128843780;BA.debugLine="End Sub";
return "";
}
public Object  _facedetection_event(xevolution.vrcg.devdemov2400.cameraexclass __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "facedetection_event", false))
	 {return ((Object) Debug.delegate(ba, "facedetection_event", new Object[] {_methodname,_args}));}
Object[] _faces = null;
Object _f = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _facerect = null;
RDebugUtils.currentLine=129630208;
 //BA.debugLineNum = 129630208;BA.debugLine="Private Sub FaceDetection_Event (MethodName As Str";
RDebugUtils.currentLine=129630209;
 //BA.debugLineNum = 129630209;BA.debugLine="Dim faces() As Object = Args(0)";
_faces = (Object[])(_args[(int) (0)]);
RDebugUtils.currentLine=129630210;
 //BA.debugLineNum = 129630210;BA.debugLine="For Each f As Object In faces";
{
final Object[] group2 = _faces;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_f = group2[index2];
RDebugUtils.currentLine=129630211;
 //BA.debugLineNum = 129630211;BA.debugLine="Dim jo As JavaObject = f";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
RDebugUtils.currentLine=129630212;
 //BA.debugLineNum = 129630212;BA.debugLine="Dim faceRect As Rect = jo.GetField(\"rect\")";
_facerect = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
_facerect = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper(), (android.graphics.Rect)(_jo.GetField("rect")));
 }
};
RDebugUtils.currentLine=129630214;
 //BA.debugLineNum = 129630214;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=129630215;
 //BA.debugLineNum = 129630215;BA.debugLine="End Sub";
return null;
}
public xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid  _findcamera(xevolution.vrcg.devdemov2400.cameraexclass __ref,boolean _frontcamera) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "findcamera", false))
	 {return ((xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid) Debug.delegate(ba, "findcamera", new Object[] {_frontcamera}));}
xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid _ci = null;
Object _camerainfo = null;
int _cameravalue = 0;
int _numberofcameras = 0;
int _i = 0;
RDebugUtils.currentLine=126550016;
 //BA.debugLineNum = 126550016;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
RDebugUtils.currentLine=126550017;
 //BA.debugLineNum = 126550017;BA.debugLine="Dim ci As CameraInfoAndId";
_ci = new xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid();
RDebugUtils.currentLine=126550018;
 //BA.debugLineNum = 126550018;BA.debugLine="Dim cameraInfo As Object";
_camerainfo = new Object();
RDebugUtils.currentLine=126550019;
 //BA.debugLineNum = 126550019;BA.debugLine="Dim cameraValue As Int";
_cameravalue = 0;
RDebugUtils.currentLine=126550020;
 //BA.debugLineNum = 126550020;BA.debugLine="Log(\"findCamera\")";
__c.LogImpl("6126550020","findCamera",0);
RDebugUtils.currentLine=126550021;
 //BA.debugLineNum = 126550021;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
if (_frontcamera) { 
_cameravalue = (int) (1);}
else {
_cameravalue = (int) (0);};
RDebugUtils.currentLine=126550022;
 //BA.debugLineNum = 126550022;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
_camerainfo = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject("android.hardware.Camera$CameraInfo");
RDebugUtils.currentLine=126550023;
 //BA.debugLineNum = 126550023;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
_numberofcameras = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getNumberOfCameras",(Object[])(__c.Null),(String[])(__c.Null))));
RDebugUtils.currentLine=126550024;
 //BA.debugLineNum = 126550024;BA.debugLine="Log(r.target)";
__c.LogImpl("6126550024",BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target),0);
RDebugUtils.currentLine=126550025;
 //BA.debugLineNum = 126550025;BA.debugLine="Log(numberOfCameras)";
__c.LogImpl("6126550025",BA.NumberToString(_numberofcameras),0);
RDebugUtils.currentLine=126550026;
 //BA.debugLineNum = 126550026;BA.debugLine="For i = 0 To numberOfCameras - 1";
{
final int step10 = 1;
final int limit10 = (int) (_numberofcameras-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=126550027;
 //BA.debugLineNum = 126550027;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getCameraInfo",new Object[]{(Object)(_i),_camerainfo},new String[]{"java.lang.int","android.hardware.Camera$CameraInfo"});
RDebugUtils.currentLine=126550029;
 //BA.debugLineNum = 126550029;BA.debugLine="r.target = cameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _camerainfo;
RDebugUtils.currentLine=126550030;
 //BA.debugLineNum = 126550030;BA.debugLine="Log(\"facing: \" & r.GetField(\"facing\") & \", \" & c";
__c.LogImpl("6126550030","facing: "+BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("facing"))+", "+BA.NumberToString(_cameravalue),0);
RDebugUtils.currentLine=126550031;
 //BA.debugLineNum = 126550031;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
if ((__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("facing")).equals((Object)(_cameravalue))) { 
RDebugUtils.currentLine=126550032;
 //BA.debugLineNum = 126550032;BA.debugLine="ci.cameraInfo = r.target";
_ci.CameraInfo /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target;
RDebugUtils.currentLine=126550033;
 //BA.debugLineNum = 126550033;BA.debugLine="ci.Id = i";
_ci.Id /*int*/  = _i;
RDebugUtils.currentLine=126550034;
 //BA.debugLineNum = 126550034;BA.debugLine="Return ci";
if (true) return _ci;
 };
 }
};
RDebugUtils.currentLine=126550037;
 //BA.debugLineNum = 126550037;BA.debugLine="ci.id = -1";
_ci.Id /*int*/  = (int) (-1);
RDebugUtils.currentLine=126550038;
 //BA.debugLineNum = 126550038;BA.debugLine="Return ci";
if (true) return _ci;
RDebugUtils.currentLine=126550039;
 //BA.debugLineNum = 126550039;BA.debugLine="End Sub";
return null;
}
public String  _getparameter(xevolution.vrcg.devdemov2400.cameraexclass __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getparameter", false))
	 {return ((String) Debug.delegate(ba, "getparameter", new Object[] {_key}));}
RDebugUtils.currentLine=127270912;
 //BA.debugLineNum = 127270912;BA.debugLine="Public Sub GetParameter(Key As String) As String";
RDebugUtils.currentLine=127270913;
 //BA.debugLineNum = 127270913;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127270914;
 //BA.debugLineNum = 127270914;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("get",_key,"java.lang.String"));
RDebugUtils.currentLine=127270915;
 //BA.debugLineNum = 127270915;BA.debugLine="End Sub";
return "";
}
public int  _getexposurecompensation(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getexposurecompensation", false))
	 {return ((Integer) Debug.delegate(ba, "getexposurecompensation", null));}
RDebugUtils.currentLine=129302528;
 //BA.debugLineNum = 129302528;BA.debugLine="Public Sub getExposureCompensation As Int";
RDebugUtils.currentLine=129302529;
 //BA.debugLineNum = 129302529;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=129302530;
 //BA.debugLineNum = 129302530;BA.debugLine="Return r.RunMethod(\"getExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getExposureCompensation")));
RDebugUtils.currentLine=129302531;
 //BA.debugLineNum = 129302531;BA.debugLine="End Sub";
return 0;
}
public int  _getmaxexposurecompensation(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getmaxexposurecompensation", false))
	 {return ((Integer) Debug.delegate(ba, "getmaxexposurecompensation", null));}
RDebugUtils.currentLine=129499136;
 //BA.debugLineNum = 129499136;BA.debugLine="Public Sub getMaxExposureCompensation As Int";
RDebugUtils.currentLine=129499137;
 //BA.debugLineNum = 129499137;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=129499138;
 //BA.debugLineNum = 129499138;BA.debugLine="Return r.RunMethod(\"getMaxExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getMaxExposureCompensation")));
RDebugUtils.currentLine=129499139;
 //BA.debugLineNum = 129499139;BA.debugLine="End Sub";
return 0;
}
public int  _getminexposurecompensation(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getminexposurecompensation", false))
	 {return ((Integer) Debug.delegate(ba, "getminexposurecompensation", null));}
RDebugUtils.currentLine=129433600;
 //BA.debugLineNum = 129433600;BA.debugLine="Public Sub getMinExposureCompensation As Int";
RDebugUtils.currentLine=129433601;
 //BA.debugLineNum = 129433601;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=129433602;
 //BA.debugLineNum = 129433602;BA.debugLine="Return r.RunMethod(\"getMinExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getMinExposureCompensation")));
RDebugUtils.currentLine=129433603;
 //BA.debugLineNum = 129433603;BA.debugLine="End Sub";
return 0;
}
public String  _getpreviewfpsrange(xevolution.vrcg.devdemov2400.cameraexclass __ref,int[] _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpreviewfpsrange", false))
	 {return ((String) Debug.delegate(ba, "getpreviewfpsrange", new Object[] {_range}));}
RDebugUtils.currentLine=128188416;
 //BA.debugLineNum = 128188416;BA.debugLine="Public Sub GetPreviewFpsRange(Range() As Int)";
RDebugUtils.currentLine=128188417;
 //BA.debugLineNum = 128188417;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128188418;
 //BA.debugLineNum = 128188418;BA.debugLine="r.RunMethod4(\"getPreviewFpsRange\", Array As Objec";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("getPreviewFpsRange",new Object[]{(Object)(_range)},new String[]{"[I"});
RDebugUtils.currentLine=128188419;
 //BA.debugLineNum = 128188419;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedpictureformats(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpictureformats", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedpictureformats", null));}
RDebugUtils.currentLine=128778240;
 //BA.debugLineNum = 128778240;BA.debugLine="Public Sub GetSupportedPictureFormats As List";
RDebugUtils.currentLine=128778241;
 //BA.debugLineNum = 128778241;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128778242;
 //BA.debugLineNum = 128778242;BA.debugLine="Return r.RunMethod(\"getSupportedPictureFormats\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPictureFormats")));
RDebugUtils.currentLine=128778243;
 //BA.debugLineNum = 128778243;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedpreviewfpsrange(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpreviewfpsrange", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedpreviewfpsrange", null));}
RDebugUtils.currentLine=128122880;
 //BA.debugLineNum = 128122880;BA.debugLine="Public Sub GetSupportedPreviewFpsRange As List";
RDebugUtils.currentLine=128122881;
 //BA.debugLineNum = 128122881;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128122882;
 //BA.debugLineNum = 128122882;BA.debugLine="Return r.RunMethod(\"getSupportedPreviewFpsRange\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPreviewFpsRange")));
RDebugUtils.currentLine=128122883;
 //BA.debugLineNum = 128122883;BA.debugLine="End Sub";
return null;
}
public xevolution.vrcg.devdemov2400.cameraexclass._camerasize[]  _getsupportedpreviewsizes(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpreviewsizes", false))
	 {return ((xevolution.vrcg.devdemov2400.cameraexclass._camerasize[]) Debug.delegate(ba, "getsupportedpreviewsizes", null));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize[] _cs = null;
int _i = 0;
RDebugUtils.currentLine=127533056;
 //BA.debugLineNum = 127533056;BA.debugLine="Public Sub GetSupportedPreviewSizes As CameraSize(";
RDebugUtils.currentLine=127533057;
 //BA.debugLineNum = 127533057;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127533058;
 //BA.debugLineNum = 127533058;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPrev";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPreviewSizes")));
RDebugUtils.currentLine=127533059;
 //BA.debugLineNum = 127533059;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
}
}
;
RDebugUtils.currentLine=127533060;
 //BA.debugLineNum = 127533060;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=127533061;
 //BA.debugLineNum = 127533061;BA.debugLine="r.target = list1.get(i)";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _list1.Get(_i);
RDebugUtils.currentLine=127533063;
 //BA.debugLineNum = 127533063;BA.debugLine="cs(i).Initialize";
_cs[_i].Initialize();
RDebugUtils.currentLine=127533064;
 //BA.debugLineNum = 127533064;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=127533065;
 //BA.debugLineNum = 127533065;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
 }
};
RDebugUtils.currentLine=127533067;
 //BA.debugLineNum = 127533067;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=127533068;
 //BA.debugLineNum = 127533068;BA.debugLine="End Sub";
return null;
}
public int  _getzoom(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getzoom", false))
	 {return ((Integer) Debug.delegate(ba, "getzoom", null));}
RDebugUtils.currentLine=129171456;
 //BA.debugLineNum = 129171456;BA.debugLine="Public Sub getZoom() As Int";
RDebugUtils.currentLine=129171457;
 //BA.debugLineNum = 129171457;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=129171458;
 //BA.debugLineNum = 129171458;BA.debugLine="Return r.RunMethod(\"getZoom\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getZoom")));
RDebugUtils.currentLine=129171459;
 //BA.debugLineNum = 129171459;BA.debugLine="End Sub";
return 0;
}
public byte[]  _previewimagetojpeg(xevolution.vrcg.devdemov2400.cameraexclass __ref,byte[] _data,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "previewimagetojpeg", false))
	 {return ((byte[]) Debug.delegate(ba, "previewimagetojpeg", new Object[] {_data,_quality}));}
Object _size = null;
Object _previewformat = null;
int _width = 0;
int _height = 0;
Object _yuvimage = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=128450560;
 //BA.debugLineNum = 128450560;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
RDebugUtils.currentLine=128450561;
 //BA.debugLineNum = 128450561;BA.debugLine="Dim size, previewFormat As Object";
_size = new Object();
_previewformat = new Object();
RDebugUtils.currentLine=128450562;
 //BA.debugLineNum = 128450562;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128450563;
 //BA.debugLineNum = 128450563;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
_size = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=128450564;
 //BA.debugLineNum = 128450564;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
_previewformat = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewFormat");
RDebugUtils.currentLine=128450565;
 //BA.debugLineNum = 128450565;BA.debugLine="r.target = size";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _size;
RDebugUtils.currentLine=128450566;
 //BA.debugLineNum = 128450566;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
_width = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
_height = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=128450567;
 //BA.debugLineNum = 128450567;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
_yuvimage = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject2("android.graphics.YuvImage",new Object[]{(Object)(_data),_previewformat,(Object)(_width),(Object)(_height),__c.Null},new String[]{"[B","java.lang.int","java.lang.int","java.lang.int","[I"});
RDebugUtils.currentLine=128450570;
 //BA.debugLineNum = 128450570;BA.debugLine="r.target = yuvImage";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _yuvimage;
RDebugUtils.currentLine=128450571;
 //BA.debugLineNum = 128450571;BA.debugLine="Dim rect1 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=128450572;
 //BA.debugLineNum = 128450572;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
_rect1.Initialize((int) (0),(int) (0),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWidth"))),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getHeight"))));
RDebugUtils.currentLine=128450573;
 //BA.debugLineNum = 128450573;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=128450574;
 //BA.debugLineNum = 128450574;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=128450575;
 //BA.debugLineNum = 128450575;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("compressToJpeg",new Object[]{(Object)(_rect1.getObject()),(Object)(_quality),(Object)(_out.getObject())},new String[]{"android.graphics.Rect","java.lang.int","java.io.OutputStream"});
RDebugUtils.currentLine=128450577;
 //BA.debugLineNum = 128450577;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=128450578;
 //BA.debugLineNum = 128450578;BA.debugLine="End Sub";
return null;
}
public String  _setparameter(xevolution.vrcg.devdemov2400.cameraexclass __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setparameter", false))
	 {return ((String) Debug.delegate(ba, "setparameter", new Object[] {_key,_value}));}
RDebugUtils.currentLine=127205376;
 //BA.debugLineNum = 127205376;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
RDebugUtils.currentLine=127205377;
 //BA.debugLineNum = 127205377;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127205378;
 //BA.debugLineNum = 127205378;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("set",_key,"java.lang.String",_value,"java.lang.String");
RDebugUtils.currentLine=127205379;
 //BA.debugLineNum = 127205379;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(xevolution.vrcg.devdemov2400.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setfocusmode", false))
	 {return ((String) Debug.delegate(ba, "setfocusmode", new Object[] {_mode}));}
RDebugUtils.currentLine=128647168;
 //BA.debugLineNum = 128647168;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
RDebugUtils.currentLine=128647169;
 //BA.debugLineNum = 128647169;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128647170;
 //BA.debugLineNum = 128647170;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.Str";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFocusMode",_mode,"java.lang.String");
RDebugUtils.currentLine=128647171;
 //BA.debugLineNum = 128647171;BA.debugLine="End Sub";
return "";
}
public String  _setexposurecompensation(xevolution.vrcg.devdemov2400.cameraexclass __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setexposurecompensation", false))
	 {return ((String) Debug.delegate(ba, "setexposurecompensation", new Object[] {_v}));}
RDebugUtils.currentLine=129368064;
 //BA.debugLineNum = 129368064;BA.debugLine="Public Sub setExposureCompensation(v As Int)";
RDebugUtils.currentLine=129368065;
 //BA.debugLineNum = 129368065;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=129368066;
 //BA.debugLineNum = 129368066;BA.debugLine="r.RunMethod2(\"setExposureCompensation\", v, \"java.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setExposureCompensation",BA.NumberToString(_v),"java.lang.int");
RDebugUtils.currentLine=129368067;
 //BA.debugLineNum = 129368067;BA.debugLine="End Sub";
return "";
}
public String  _setfacedetectionlistener(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setfacedetectionlistener", false))
	 {return ((String) Debug.delegate(ba, "setfacedetectionlistener", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
Object _e = null;
RDebugUtils.currentLine=129564672;
 //BA.debugLineNum = 129564672;BA.debugLine="Public Sub SetFaceDetectionListener";
RDebugUtils.currentLine=129564673;
 //BA.debugLineNum = 129564673;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._nativecam /*Object*/ ));
RDebugUtils.currentLine=129564674;
 //BA.debugLineNum = 129564674;BA.debugLine="Dim e As Object = jo.CreateEvent(\"android.hardwar";
_e = _jo.CreateEvent(ba,"android.hardware.Camera.FaceDetectionListener","FaceDetection",__c.Null);
RDebugUtils.currentLine=129564675;
 //BA.debugLineNum = 129564675;BA.debugLine="jo.RunMethod(\"setFaceDetectionListener\", Array(e)";
_jo.RunMethod("setFaceDetectionListener",new Object[]{_e});
RDebugUtils.currentLine=129564676;
 //BA.debugLineNum = 129564676;BA.debugLine="End Sub";
return "";
}
public String  _setpreviewfpsrange(xevolution.vrcg.devdemov2400.cameraexclass __ref,int _minvalue,int _maxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpreviewfpsrange", false))
	 {return ((String) Debug.delegate(ba, "setpreviewfpsrange", new Object[] {_minvalue,_maxvalue}));}
RDebugUtils.currentLine=128253952;
 //BA.debugLineNum = 128253952;BA.debugLine="Public Sub SetPreviewFpsRange(MinValue As Int, Max";
RDebugUtils.currentLine=128253953;
 //BA.debugLineNum = 128253953;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=128253954;
 //BA.debugLineNum = 128253954;BA.debugLine="r.RunMethod4(\"setPreviewFpsRange\", Array As Objec";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("setPreviewFpsRange",new Object[]{(Object)(_minvalue),(Object)(_maxvalue)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=128253956;
 //BA.debugLineNum = 128253956;BA.debugLine="End Sub";
return "";
}
public String  _setpreviewsize(xevolution.vrcg.devdemov2400.cameraexclass __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpreviewsize", false))
	 {return ((String) Debug.delegate(ba, "setpreviewsize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=127598592;
 //BA.debugLineNum = 127598592;BA.debugLine="Public Sub SetPreviewSize(Width As Int, Height As";
RDebugUtils.currentLine=127598593;
 //BA.debugLineNum = 127598593;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=127598594;
 //BA.debugLineNum = 127598594;BA.debugLine="r.RunMethod3(\"setPreviewSize\", Width, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("setPreviewSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=127598595;
 //BA.debugLineNum = 127598595;BA.debugLine="End Sub";
return "";
}
public String  _startfacedetection(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "startfacedetection", false))
	 {return ((String) Debug.delegate(ba, "startfacedetection", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=129695744;
 //BA.debugLineNum = 129695744;BA.debugLine="Public Sub StartFaceDetection";
RDebugUtils.currentLine=129695745;
 //BA.debugLineNum = 129695745;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._nativecam /*Object*/ ));
RDebugUtils.currentLine=129695746;
 //BA.debugLineNum = 129695746;BA.debugLine="jo.RunMethod(\"startFaceDetection\", Null)";
_jo.RunMethod("startFaceDetection",(Object[])(__c.Null));
RDebugUtils.currentLine=129695747;
 //BA.debugLineNum = 129695747;BA.debugLine="End Sub";
return "";
}
public String  _stopfacedetection(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "stopfacedetection", false))
	 {return ((String) Debug.delegate(ba, "stopfacedetection", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=129761280;
 //BA.debugLineNum = 129761280;BA.debugLine="Public Sub StopFaceDetection";
RDebugUtils.currentLine=129761281;
 //BA.debugLineNum = 129761281;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._nativecam /*Object*/ ));
RDebugUtils.currentLine=129761282;
 //BA.debugLineNum = 129761282;BA.debugLine="jo.RunMethod(\"stopFaceDetection\", Null)";
_jo.RunMethod("stopFaceDetection",(Object[])(__c.Null));
RDebugUtils.currentLine=129761283;
 //BA.debugLineNum = 129761283;BA.debugLine="End Sub";
return "";
}
public String  _stoppreview(xevolution.vrcg.devdemov2400.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "stoppreview", false))
	 {return ((String) Debug.delegate(ba, "stoppreview", null));}
RDebugUtils.currentLine=127008768;
 //BA.debugLineNum = 127008768;BA.debugLine="Public Sub StopPreview";
RDebugUtils.currentLine=127008769;
 //BA.debugLineNum = 127008769;BA.debugLine="cam.StopPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StopPreview();
RDebugUtils.currentLine=127008770;
 //BA.debugLineNum = 127008770;BA.debugLine="End Sub";
return "";
}
}