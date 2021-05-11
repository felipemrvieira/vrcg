package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xrulerpicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.b4xrulerpicker");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.b4xrulerpicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _mouseevent{
public boolean IsInitialized;
public int X;
public int Y;
public void Initialize() {
IsInitialized = true;
X = 0;
Y = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public float _mvalue = 0f;
public int _touchxposition = 0;
public float _touchxvalue = 0f;
public int _linescolor = 0;
public int _backgroundcolor = 0;
public int _gapswidth = 0;
public int _stepvalue = 0;
public float _rulerscale = 0f;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public int _longlineinterval = 0;
public anywheresoftware.b4a.objects.B4XCanvas.B4XPath _trianglepath = null;
public int _shortlinelength = 0;
public int _longlinelength = 0;
public boolean _snaptogrid = false;
public int _textoffset = 0;
public int _minvalue = 0;
public int _maxvalue = 0;
public Object _mtag = null;
public anywheresoftware.b4a.objects.PanelWrapper _stubpanel = null;
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
public String  _base_resize(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _w = 0;
RDebugUtils.currentLine=84934656;
 //BA.debugLineNum = 84934656;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=84934657;
 //BA.debugLineNum = 84934657;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Widt";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=84934658;
 //BA.debugLineNum = 84934658;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
RDebugUtils.currentLine=84934659;
 //BA.debugLineNum = 84934659;BA.debugLine="If w Mod 2 = 1 Then w = w + 1";
if (_w%2==1) { 
_w = (int) (_w+1);};
RDebugUtils.currentLine=84934660;
 //BA.debugLineNum = 84934660;BA.debugLine="cvs.Resize(w, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_w),(float) (_height));
RDebugUtils.currentLine=84934661;
 //BA.debugLineNum = 84934661;BA.debugLine="TrianglePath.Initialize(w / 2 - 10dip, 0)";
__ref._trianglepath /*anywheresoftware.b4a.objects.B4XCanvas.B4XPath*/ .Initialize((float) (_w/(double)2-__c.DipToCurrent((int) (10))),(float) (0));
RDebugUtils.currentLine=84934662;
 //BA.debugLineNum = 84934662;BA.debugLine="TrianglePath.LineTo(w / 2 + 10dip, 0)";
__ref._trianglepath /*anywheresoftware.b4a.objects.B4XCanvas.B4XPath*/ .LineTo((float) (_w/(double)2+__c.DipToCurrent((int) (10))),(float) (0));
RDebugUtils.currentLine=84934663;
 //BA.debugLineNum = 84934663;BA.debugLine="TrianglePath.LineTo(w / 2, 20dip)";
__ref._trianglepath /*anywheresoftware.b4a.objects.B4XCanvas.B4XPath*/ .LineTo((float) (_w/(double)2),(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=84934664;
 //BA.debugLineNum = 84934664;BA.debugLine="ShortLineLength = Height / 4";
__ref._shortlinelength /*int*/  = (int) (_height/(double)4);
RDebugUtils.currentLine=84934665;
 //BA.debugLineNum = 84934665;BA.debugLine="LongLineLength = Height / 2";
__ref._longlinelength /*int*/  = (int) (_height/(double)2);
RDebugUtils.currentLine=84934666;
 //BA.debugLineNum = 84934666;BA.debugLine="draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=84934667;
 //BA.debugLineNum = 84934667;BA.debugLine="End Sub";
return "";
}
public String  _draw(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "draw", false))
	 {return ((String) Debug.delegate(ba, "draw", null));}
int _centerposition = 0;
int _minposition = 0;
int _maxposition = 0;
int _x0position = 0;
int _firstlineposition = 0;
int _firstlinevalue = 0;
int _counter = 0;
int _x = 0;
int _v = 0;
RDebugUtils.currentLine=85000192;
 //BA.debugLineNum = 85000192;BA.debugLine="Private Sub draw";
RDebugUtils.currentLine=85000194;
 //BA.debugLineNum = 85000194;BA.debugLine="Dim CenterPosition As Int = Round(mValue / RulerS";
_centerposition = (int) (__c.Round(__ref._mvalue /*float*/ /(double)__ref._rulerscale /*float*/ ));
RDebugUtils.currentLine=85000195;
 //BA.debugLineNum = 85000195;BA.debugLine="Dim MinPosition As Int = Round(MinValue / RulerSc";
_minposition = (int) (__c.Round(__ref._minvalue /*int*/ /(double)__ref._rulerscale /*float*/ ));
RDebugUtils.currentLine=85000196;
 //BA.debugLineNum = 85000196;BA.debugLine="Dim MaxPosition As Int = Round(MaxValue / RulerSc";
_maxposition = (int) (__c.Round(__ref._maxvalue /*int*/ /(double)__ref._rulerscale /*float*/ ));
RDebugUtils.currentLine=85000197;
 //BA.debugLineNum = 85000197;BA.debugLine="Dim x0position As Int = CenterPosition - cvs.Targ";
_x0position = (int) (_centerposition-__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2);
RDebugUtils.currentLine=85000198;
 //BA.debugLineNum = 85000198;BA.debugLine="Dim FirstLinePosition As Int = Floor(x0position /";
_firstlineposition = (int) (__c.Floor(_x0position/(double)__ref._gapswidth /*int*/ )*__ref._gapswidth /*int*/ );
RDebugUtils.currentLine=85000199;
 //BA.debugLineNum = 85000199;BA.debugLine="If FirstLinePosition < x0position Then FirstLineP";
if (_firstlineposition<_x0position) { 
_firstlineposition = (int) (_firstlineposition+__ref._gapswidth /*int*/ );};
RDebugUtils.currentLine=85000200;
 //BA.debugLineNum = 85000200;BA.debugLine="Dim FirstLineValue As Int = FirstLinePosition * R";
_firstlinevalue = (int) (_firstlineposition*__ref._rulerscale /*float*/ );
RDebugUtils.currentLine=85000201;
 //BA.debugLineNum = 85000201;BA.debugLine="cvs.DrawRect(cvs.TargetRect, BackgroundColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._backgroundcolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=85000202;
 //BA.debugLineNum = 85000202;BA.debugLine="Dim counter As Int = FirstLineValue / StepValue";
_counter = (int) (_firstlinevalue/(double)__ref._stepvalue /*int*/ );
RDebugUtils.currentLine=85000203;
 //BA.debugLineNum = 85000203;BA.debugLine="For x = FirstLinePosition To x0position + cvs.Tar";
{
final int step10 = __ref._gapswidth /*int*/ ;
final int limit10 = (int) (_x0position+__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth());
_x = _firstlineposition ;
for (;(step10 > 0 && _x <= limit10) || (step10 < 0 && _x >= limit10) ;_x = ((int)(0 + _x + step10))  ) {
RDebugUtils.currentLine=85000204;
 //BA.debugLineNum = 85000204;BA.debugLine="If x >= MinPosition And x <= MaxPosition Then";
if (_x>=_minposition && _x<=_maxposition) { 
RDebugUtils.currentLine=85000205;
 //BA.debugLineNum = 85000205;BA.debugLine="If counter Mod LongLineInterval = 0 Then";
if (_counter%__ref._longlineinterval /*int*/ ==0) { 
RDebugUtils.currentLine=85000206;
 //BA.debugLineNum = 85000206;BA.debugLine="Dim v As Int = x * RulerScale";
_v = (int) (_x*__ref._rulerscale /*float*/ );
RDebugUtils.currentLine=85000207;
 //BA.debugLineNum = 85000207;BA.debugLine="cvs.DrawLine(x - x0position, 0, x - x0position";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x-_x0position),(float) (0),(float) (_x-_x0position),(float) (__ref._longlinelength /*int*/ ),__ref._linescolor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=85000208;
 //BA.debugLineNum = 85000208;BA.debugLine="cvs.DrawText(v, x - x0position, LongLineLength";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,BA.NumberToString(_v),(float) (_x-_x0position),(float) (__ref._longlinelength /*int*/ +__ref._textoffset /*int*/ ),__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._linescolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }else {
RDebugUtils.currentLine=85000210;
 //BA.debugLineNum = 85000210;BA.debugLine="cvs.DrawLine(x - x0position, 0, x-x0position,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x-_x0position),(float) (0),(float) (_x-_x0position),(float) (__ref._shortlinelength /*int*/ ),__ref._linescolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 };
RDebugUtils.currentLine=85000213;
 //BA.debugLineNum = 85000213;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 }
};
RDebugUtils.currentLine=85000215;
 //BA.debugLineNum = 85000215;BA.debugLine="cvs.ClipPath(TrianglePath)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(__ref._trianglepath /*anywheresoftware.b4a.objects.B4XCanvas.B4XPath*/ );
RDebugUtils.currentLine=85000216;
 //BA.debugLineNum = 85000216;BA.debugLine="cvs.DrawRect(cvs.TargetRect, LinesColor, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._linescolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=85000217;
 //BA.debugLineNum = 85000217;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=85000218;
 //BA.debugLineNum = 85000218;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=85000219;
 //BA.debugLineNum = 85000219;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
RDebugUtils.currentLine=84738048;
 //BA.debugLineNum = 84738048;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=84738049;
 //BA.debugLineNum = 84738049;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=84738050;
 //BA.debugLineNum = 84738050;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=84738051;
 //BA.debugLineNum = 84738051;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=84738052;
 //BA.debugLineNum = 84738052;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=84738053;
 //BA.debugLineNum = 84738053;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=84738054;
 //BA.debugLineNum = 84738054;BA.debugLine="Private mValue As Float = 0";
_mvalue = (float) (0);
RDebugUtils.currentLine=84738055;
 //BA.debugLineNum = 84738055;BA.debugLine="Private touchXposition As Int";
_touchxposition = 0;
RDebugUtils.currentLine=84738056;
 //BA.debugLineNum = 84738056;BA.debugLine="Private touchXValue As Float";
_touchxvalue = 0f;
RDebugUtils.currentLine=84738057;
 //BA.debugLineNum = 84738057;BA.debugLine="Private LinesColor As Int";
_linescolor = 0;
RDebugUtils.currentLine=84738058;
 //BA.debugLineNum = 84738058;BA.debugLine="Private BackgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=84738059;
 //BA.debugLineNum = 84738059;BA.debugLine="Private GapsWidth As Int";
_gapswidth = 0;
RDebugUtils.currentLine=84738060;
 //BA.debugLineNum = 84738060;BA.debugLine="Private StepValue As Int";
_stepvalue = 0;
RDebugUtils.currentLine=84738061;
 //BA.debugLineNum = 84738061;BA.debugLine="Private RulerScale As Float";
_rulerscale = 0f;
RDebugUtils.currentLine=84738062;
 //BA.debugLineNum = 84738062;BA.debugLine="Private fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=84738063;
 //BA.debugLineNum = 84738063;BA.debugLine="Private LongLineInterval As Int = 5";
_longlineinterval = (int) (5);
RDebugUtils.currentLine=84738064;
 //BA.debugLineNum = 84738064;BA.debugLine="Private TrianglePath As B4XPath";
_trianglepath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=84738065;
 //BA.debugLineNum = 84738065;BA.debugLine="Private ShortLineLength, LongLineLength As Int";
_shortlinelength = 0;
_longlinelength = 0;
RDebugUtils.currentLine=84738066;
 //BA.debugLineNum = 84738066;BA.debugLine="Private SnapToGrid As Boolean";
_snaptogrid = false;
RDebugUtils.currentLine=84738067;
 //BA.debugLineNum = 84738067;BA.debugLine="Private TextOffset As Int";
_textoffset = 0;
RDebugUtils.currentLine=84738068;
 //BA.debugLineNum = 84738068;BA.debugLine="Private MinValue, MaxValue As Int";
_minvalue = 0;
_maxvalue = 0;
RDebugUtils.currentLine=84738069;
 //BA.debugLineNum = 84738069;BA.debugLine="Private mTag As Object";
_mtag = new Object();
RDebugUtils.currentLine=84738071;
 //BA.debugLineNum = 84738071;BA.debugLine="Private StubPanel As Panel 'ignore";
_stubpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=84738072;
 //BA.debugLineNum = 84738072;BA.debugLine="Type MouseEvent (X As Int, Y As Int)";
;
RDebugUtils.currentLine=84738074;
 //BA.debugLineNum = 84738074;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=84869120;
 //BA.debugLineNum = 84869120;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=84869121;
 //BA.debugLineNum = 84869121;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=84869122;
 //BA.debugLineNum = 84869122;BA.debugLine="Dim pnl1 As B4XView = xui.CreatePanel(\"pnl1\")";
_pnl1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl1 = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl1");
RDebugUtils.currentLine=84869123;
 //BA.debugLineNum = 84869123;BA.debugLine="mBase.AddView(pnl1, 0, 0, 1dip, 1dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_pnl1.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=84869124;
 //BA.debugLineNum = 84869124;BA.debugLine="cvs.Initialize(pnl1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_pnl1);
RDebugUtils.currentLine=84869125;
 //BA.debugLineNum = 84869125;BA.debugLine="LinesColor = xui.PaintOrColorToColor(Props.Get(\"L";
__ref._linescolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("LinesColor")));
RDebugUtils.currentLine=84869126;
 //BA.debugLineNum = 84869126;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
__ref._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=84869127;
 //BA.debugLineNum = 84869127;BA.debugLine="GapsWidth = DipToCurrent(Props.Get(\"GapsWidth\"))";
__ref._gapswidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("GapsWidth")))));
RDebugUtils.currentLine=84869128;
 //BA.debugLineNum = 84869128;BA.debugLine="StepValue = Props.Get(\"StepValue\")";
__ref._stepvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("StepValue"))));
RDebugUtils.currentLine=84869129;
 //BA.debugLineNum = 84869129;BA.debugLine="MinValue = Props.GetDefault(\"MinValue\", 0) 'using";
__ref._minvalue /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("MinValue"),(Object)(0))));
RDebugUtils.currentLine=84869130;
 //BA.debugLineNum = 84869130;BA.debugLine="MaxValue = Props.GetDefault(\"MaxValue\", 100)";
__ref._maxvalue /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("MaxValue"),(Object)(100))));
RDebugUtils.currentLine=84869131;
 //BA.debugLineNum = 84869131;BA.debugLine="SnapToGrid = Props.Get(\"SnapToGrid\")";
__ref._snaptogrid /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SnapToGrid")));
RDebugUtils.currentLine=84869132;
 //BA.debugLineNum = 84869132;BA.debugLine="RulerScale = StepValue / GapsWidth";
__ref._rulerscale /*float*/  = (float) (__ref._stepvalue /*int*/ /(double)__ref._gapswidth /*int*/ );
RDebugUtils.currentLine=84869133;
 //BA.debugLineNum = 84869133;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=84869134;
 //BA.debugLineNum = 84869134;BA.debugLine="fnt = xlbl.Font";
__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=84869135;
 //BA.debugLineNum = 84869135;BA.debugLine="TextOffset = 15dip";
__ref._textoffset /*int*/  = __c.DipToCurrent((int) (15));
RDebugUtils.currentLine=84869136;
 //BA.debugLineNum = 84869136;BA.debugLine="If xui.IsB4i Then TextOffset = 25dip";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
__ref._textoffset /*int*/  = __c.DipToCurrent((int) (25));};
RDebugUtils.currentLine=84869137;
 //BA.debugLineNum = 84869137;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=84869138;
 //BA.debugLineNum = 84869138;BA.debugLine="End Sub";
return "";
}
public float  _getmax(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "getmax", false))
	 {return ((Float) Debug.delegate(ba, "getmax", null));}
RDebugUtils.currentLine=85590016;
 //BA.debugLineNum = 85590016;BA.debugLine="Public Sub getMax As Float";
RDebugUtils.currentLine=85590017;
 //BA.debugLineNum = 85590017;BA.debugLine="Return MaxValue";
if (true) return (float) (__ref._maxvalue /*int*/ );
RDebugUtils.currentLine=85590018;
 //BA.debugLineNum = 85590018;BA.debugLine="End Sub";
return 0f;
}
public float  _getmin(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "getmin", false))
	 {return ((Float) Debug.delegate(ba, "getmin", null));}
RDebugUtils.currentLine=85458944;
 //BA.debugLineNum = 85458944;BA.debugLine="Public Sub getMin As Float";
RDebugUtils.currentLine=85458945;
 //BA.debugLineNum = 85458945;BA.debugLine="Return MinValue";
if (true) return (float) (__ref._minvalue /*int*/ );
RDebugUtils.currentLine=85458946;
 //BA.debugLineNum = 85458946;BA.debugLine="End Sub";
return 0f;
}
public Object  _gettag(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "gettag", false))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=85721088;
 //BA.debugLineNum = 85721088;BA.debugLine="Public Sub getTag As Object";
RDebugUtils.currentLine=85721089;
 //BA.debugLineNum = 85721089;BA.debugLine="Return mTag";
if (true) return __ref._mtag /*Object*/ ;
RDebugUtils.currentLine=85721090;
 //BA.debugLineNum = 85721090;BA.debugLine="End Sub";
return null;
}
public float  _getvalue(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((Float) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=85327872;
 //BA.debugLineNum = 85327872;BA.debugLine="Public Sub getValue As Float";
RDebugUtils.currentLine=85327873;
 //BA.debugLineNum = 85327873;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*float*/ ;
RDebugUtils.currentLine=85327874;
 //BA.debugLineNum = 85327874;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=84803584;
 //BA.debugLineNum = 84803584;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=84803585;
 //BA.debugLineNum = 84803585;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=84803586;
 //BA.debugLineNum = 84803586;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=84803587;
 //BA.debugLineNum = 84803587;BA.debugLine="End Sub";
return "";
}
public String  _pnl1_mousedragged(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,xevolution.vrcg.devdemov2400.b4xrulerpicker._mouseevent _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "pnl1_mousedragged", false))
	 {return ((String) Debug.delegate(ba, "pnl1_mousedragged", new Object[] {_eventdata}));}
RDebugUtils.currentLine=85196800;
 //BA.debugLineNum = 85196800;BA.debugLine="Private Sub pnl1_MouseDragged (EventData As MouseE";
RDebugUtils.currentLine=85196801;
 //BA.debugLineNum = 85196801;BA.debugLine="setValue(touchXValue - (EventData.X - touchXposit";
__ref._setvalue /*String*/ (null,(float) (__ref._touchxvalue /*float*/ -(_eventdata.X /*int*/ -__ref._touchxposition /*int*/ )*__ref._rulerscale /*float*/ ));
RDebugUtils.currentLine=85196802;
 //BA.debugLineNum = 85196802;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_valuech";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_valuechanged",(Object)(__ref._mvalue /*float*/ ));
RDebugUtils.currentLine=85196803;
 //BA.debugLineNum = 85196803;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_f}));}
RDebugUtils.currentLine=85393408;
 //BA.debugLineNum = 85393408;BA.debugLine="Public Sub setValue (f As Float)";
RDebugUtils.currentLine=85393409;
 //BA.debugLineNum = 85393409;BA.debugLine="mValue = Min(MaxValue, Max(MinValue, f))";
__ref._mvalue /*float*/  = (float) (__c.Min(__ref._maxvalue /*int*/ ,__c.Max(__ref._minvalue /*int*/ ,_f)));
RDebugUtils.currentLine=85393410;
 //BA.debugLineNum = 85393410;BA.debugLine="draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=85393411;
 //BA.debugLineNum = 85393411;BA.debugLine="End Sub";
return "";
}
public String  _pnl1_mousepressed(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,xevolution.vrcg.devdemov2400.b4xrulerpicker._mouseevent _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "pnl1_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "pnl1_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=85131264;
 //BA.debugLineNum = 85131264;BA.debugLine="Private Sub pnl1_MousePressed (EventData As MouseE";
RDebugUtils.currentLine=85131266;
 //BA.debugLineNum = 85131266;BA.debugLine="touchXposition = EventData.X";
__ref._touchxposition /*int*/  = _eventdata.X /*int*/ ;
RDebugUtils.currentLine=85131267;
 //BA.debugLineNum = 85131267;BA.debugLine="touchXValue = mValue";
__ref._touchxvalue /*float*/  = __ref._mvalue /*float*/ ;
RDebugUtils.currentLine=85131268;
 //BA.debugLineNum = 85131268;BA.debugLine="End Sub";
return "";
}
public String  _pnl1_mousereleased(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,xevolution.vrcg.devdemov2400.b4xrulerpicker._mouseevent _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "pnl1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "pnl1_mousereleased", new Object[] {_eventdata}));}
int _x1 = 0;
int _x2 = 0;
RDebugUtils.currentLine=85262336;
 //BA.debugLineNum = 85262336;BA.debugLine="Private Sub pnl1_MouseReleased (EventData As Mouse";
RDebugUtils.currentLine=85262337;
 //BA.debugLineNum = 85262337;BA.debugLine="If SnapToGrid Then";
if (__ref._snaptogrid /*boolean*/ ) { 
RDebugUtils.currentLine=85262338;
 //BA.debugLineNum = 85262338;BA.debugLine="Dim x1 As Int = Floor(mValue / StepValue) * Step";
_x1 = (int) (__c.Floor(__ref._mvalue /*float*/ /(double)__ref._stepvalue /*int*/ )*__ref._stepvalue /*int*/ );
RDebugUtils.currentLine=85262339;
 //BA.debugLineNum = 85262339;BA.debugLine="Dim x2 As Int = x1 + StepValue";
_x2 = (int) (_x1+__ref._stepvalue /*int*/ );
RDebugUtils.currentLine=85262340;
 //BA.debugLineNum = 85262340;BA.debugLine="If mValue - x1 < x2 - mValue Then";
if (__ref._mvalue /*float*/ -_x1<_x2-__ref._mvalue /*float*/ ) { 
RDebugUtils.currentLine=85262341;
 //BA.debugLineNum = 85262341;BA.debugLine="setValue(x1)";
__ref._setvalue /*String*/ (null,(float) (_x1));
 }else {
RDebugUtils.currentLine=85262343;
 //BA.debugLineNum = 85262343;BA.debugLine="setValue(x2)";
__ref._setvalue /*String*/ (null,(float) (_x2));
 };
RDebugUtils.currentLine=85262345;
 //BA.debugLineNum = 85262345;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_valuec";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_valuechanged",(Object)(__ref._mvalue /*float*/ ));
RDebugUtils.currentLine=85262346;
 //BA.debugLineNum = 85262346;BA.debugLine="draw";
__ref._draw /*String*/ (null);
 };
RDebugUtils.currentLine=85262348;
 //BA.debugLineNum = 85262348;BA.debugLine="End Sub";
return "";
}
public String  _pnl1_touch(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "pnl1_touch", false))
	 {return ((String) Debug.delegate(ba, "pnl1_touch", new Object[] {_action,_x,_y}));}
xevolution.vrcg.devdemov2400.b4xrulerpicker._mouseevent _ed = null;
RDebugUtils.currentLine=85065728;
 //BA.debugLineNum = 85065728;BA.debugLine="Private Sub pnl1_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=85065729;
 //BA.debugLineNum = 85065729;BA.debugLine="Private ed As MouseEvent";
_ed = new xevolution.vrcg.devdemov2400.b4xrulerpicker._mouseevent();
RDebugUtils.currentLine=85065730;
 //BA.debugLineNum = 85065730;BA.debugLine="ed.X = X";
_ed.X /*int*/  = (int) (_x);
RDebugUtils.currentLine=85065731;
 //BA.debugLineNum = 85065731;BA.debugLine="ed.Y = Y";
_ed.Y /*int*/  = (int) (_y);
RDebugUtils.currentLine=85065732;
 //BA.debugLineNum = 85065732;BA.debugLine="If Action = StubPanel.ACTION_DOWN Then";
if (_action==__ref._stubpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .ACTION_DOWN) { 
RDebugUtils.currentLine=85065733;
 //BA.debugLineNum = 85065733;BA.debugLine="pnl1_MousePressed(ed)";
__ref._pnl1_mousepressed /*String*/ (null,_ed);
 }else 
{RDebugUtils.currentLine=85065734;
 //BA.debugLineNum = 85065734;BA.debugLine="Else if Action = StubPanel.ACTION_MOVE Then";
if (_action==__ref._stubpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .ACTION_MOVE) { 
RDebugUtils.currentLine=85065735;
 //BA.debugLineNum = 85065735;BA.debugLine="pnl1_MouseDragged(ed)";
__ref._pnl1_mousedragged /*String*/ (null,_ed);
 }else {
RDebugUtils.currentLine=85065737;
 //BA.debugLineNum = 85065737;BA.debugLine="pnl1_MouseReleased(ed)";
__ref._pnl1_mousereleased /*String*/ (null,_ed);
 }}
;
RDebugUtils.currentLine=85065739;
 //BA.debugLineNum = 85065739;BA.debugLine="End Sub";
return "";
}
public String  _setmax(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "setmax", false))
	 {return ((String) Debug.delegate(ba, "setmax", new Object[] {_f}));}
RDebugUtils.currentLine=85655552;
 //BA.debugLineNum = 85655552;BA.debugLine="Public Sub setMax (f As Float)";
RDebugUtils.currentLine=85655553;
 //BA.debugLineNum = 85655553;BA.debugLine="MaxValue = f";
__ref._maxvalue /*int*/  = (int) (_f);
RDebugUtils.currentLine=85655554;
 //BA.debugLineNum = 85655554;BA.debugLine="draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=85655555;
 //BA.debugLineNum = 85655555;BA.debugLine="End Sub";
return "";
}
public String  _setmin(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "setmin", false))
	 {return ((String) Debug.delegate(ba, "setmin", new Object[] {_f}));}
RDebugUtils.currentLine=85524480;
 //BA.debugLineNum = 85524480;BA.debugLine="Public Sub setMin (f As Float)";
RDebugUtils.currentLine=85524481;
 //BA.debugLineNum = 85524481;BA.debugLine="MinValue = f";
__ref._minvalue /*int*/  = (int) (_f);
RDebugUtils.currentLine=85524482;
 //BA.debugLineNum = 85524482;BA.debugLine="draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=85524483;
 //BA.debugLineNum = 85524483;BA.debugLine="End Sub";
return "";
}
public String  _settag(xevolution.vrcg.devdemov2400.b4xrulerpicker __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrulerpicker";
if (Debug.shouldDelegate(ba, "settag", false))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_f}));}
RDebugUtils.currentLine=85786624;
 //BA.debugLineNum = 85786624;BA.debugLine="Public Sub setTag (f As Object)";
RDebugUtils.currentLine=85786625;
 //BA.debugLineNum = 85786625;BA.debugLine="mTag = f";
__ref._mtag /*Object*/  = _f;
RDebugUtils.currentLine=85786626;
 //BA.debugLineNum = 85786626;BA.debugLine="End Sub";
return "";
}
}