package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class force_gc extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.force_gc");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.force_gc.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.agraham.threading.Threading _t = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
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
public String  _initialize(xevolution.vrcg.devdemov2400.force_gc __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="force_gc";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=143065088;
 //BA.debugLineNum = 143065088;BA.debugLine="Public Sub Initialize()";
RDebugUtils.currentLine=143065090;
 //BA.debugLineNum = 143065090;BA.debugLine="End Sub";
return "";
}
public String  _fire(xevolution.vrcg.devdemov2400.force_gc __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="force_gc";
if (Debug.shouldDelegate(ba, "fire", false))
	 {return ((String) Debug.delegate(ba, "fire", null));}
Object[] _args = null;
RDebugUtils.currentLine=143130624;
 //BA.debugLineNum = 143130624;BA.debugLine="Public Sub Fire";
RDebugUtils.currentLine=143130627;
 //BA.debugLineNum = 143130627;BA.debugLine="t.Initialise(\"t\")";
__ref._t /*anywheresoftware.b4a.agraham.threading.Threading*/ .Initialise(ba,"t");
RDebugUtils.currentLine=143130630;
 //BA.debugLineNum = 143130630;BA.debugLine="Dim args(0) As Object";
_args = new Object[(int) (0)];
{
int d0 = _args.length;
for (int i0 = 0;i0 < d0;i0++) {
_args[i0] = new Object();
}
}
;
RDebugUtils.currentLine=143130631;
 //BA.debugLineNum = 143130631;BA.debugLine="t.Start(Me, \"t_process\", args)";
__ref._t /*anywheresoftware.b4a.agraham.threading.Threading*/ .Start(this,"t_process",_args);
RDebugUtils.currentLine=143130634;
 //BA.debugLineNum = 143130634;BA.debugLine="Do While t.Running";
while (__ref._t /*anywheresoftware.b4a.agraham.threading.Threading*/ .getRunning()) {
 }
;
RDebugUtils.currentLine=143130638;
 //BA.debugLineNum = 143130638;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.force_gc __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="force_gc";
RDebugUtils.currentLine=142999552;
 //BA.debugLineNum = 142999552;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=142999554;
 //BA.debugLineNum = 142999554;BA.debugLine="Private t As Thread";
_t = new anywheresoftware.b4a.agraham.threading.Threading();
RDebugUtils.currentLine=142999555;
 //BA.debugLineNum = 142999555;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=142999557;
 //BA.debugLineNum = 142999557;BA.debugLine="End Sub";
return "";
}
public String  _t_ended(xevolution.vrcg.devdemov2400.force_gc __ref,boolean _fail,String _error) throws Exception{
__ref = this;
RDebugUtils.currentModule="force_gc";
if (Debug.shouldDelegate(ba, "t_ended", false))
	 {return ((String) Debug.delegate(ba, "t_ended", new Object[] {_fail,_error}));}
RDebugUtils.currentLine=143261696;
 //BA.debugLineNum = 143261696;BA.debugLine="Private Sub t_Ended(Fail As Boolean, Error As Stri";
RDebugUtils.currentLine=143261698;
 //BA.debugLineNum = 143261698;BA.debugLine="End Sub";
return "";
}
public String  _t_process(xevolution.vrcg.devdemov2400.force_gc __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="force_gc";
if (Debug.shouldDelegate(ba, "t_process", false))
	 {return ((String) Debug.delegate(ba, "t_process", null));}
long _maxmemory = 0L;
double[] _bomb = null;
RDebugUtils.currentLine=143196160;
 //BA.debugLineNum = 143196160;BA.debugLine="Private Sub t_process";
RDebugUtils.currentLine=143196163;
 //BA.debugLineNum = 143196163;BA.debugLine="r.Target = r.RunStaticMethod(\"java.lang.Runtime\",";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("java.lang.Runtime","getRuntime",(Object[])(__c.Null),(String[])(__c.Null));
RDebugUtils.currentLine=143196164;
 //BA.debugLineNum = 143196164;BA.debugLine="Private maxmemory As Long = r.RunMethod(\"maxMemor";
_maxmemory = BA.ObjectToLongNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("maxMemory"));
RDebugUtils.currentLine=143196168;
 //BA.debugLineNum = 143196168;BA.debugLine="Private bomb(maxmemory / 8) As Double";
_bomb = new double[(int) (_maxmemory/(double)8)];
;
RDebugUtils.currentLine=143196170;
 //BA.debugLineNum = 143196170;BA.debugLine="End Sub";
return "";
}
}