package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class configparameters extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.configparameters");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.configparameters.class).invoke(this, new Object[] {null});
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
public int _cfg_allow_front_camera = 0;
public int _cfg_copy_image_to_gallery = 0;
public int _cfg_take_picture_always_as_new = 0;
public String _configfilename = "";
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
public String  _initialize(xevolution.vrcg.devdemov2400.configparameters __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="configparameters";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=132251648;
 //BA.debugLineNum = 132251648;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=132251649;
 //BA.debugLineNum = 132251649;BA.debugLine="MakeInitialize";
__ref._makeinitialize /*String*/ (null);
RDebugUtils.currentLine=132251650;
 //BA.debugLineNum = 132251650;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.configparameters __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="configparameters";
RDebugUtils.currentLine=132186112;
 //BA.debugLineNum = 132186112;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=132186113;
 //BA.debugLineNum = 132186113;BA.debugLine="Public CFG_ALLOW_FRONT_CAMERA As Int = 0";
_cfg_allow_front_camera = (int) (0);
RDebugUtils.currentLine=132186114;
 //BA.debugLineNum = 132186114;BA.debugLine="Public CFG_COPY_IMAGE_TO_GALLERY As Int = 1";
_cfg_copy_image_to_gallery = (int) (1);
RDebugUtils.currentLine=132186115;
 //BA.debugLineNum = 132186115;BA.debugLine="Public CFG_TAKE_PICTURE_ALWAYS_AS_NEW As Int = 1";
_cfg_take_picture_always_as_new = (int) (1);
RDebugUtils.currentLine=132186117;
 //BA.debugLineNum = 132186117;BA.debugLine="Private ConfigFileName As String = \"config.json\"";
_configfilename = "config.json";
RDebugUtils.currentLine=132186118;
 //BA.debugLineNum = 132186118;BA.debugLine="End Sub";
return "";
}
public String  _makeinitialize(xevolution.vrcg.devdemov2400.configparameters __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="configparameters";
if (Debug.shouldDelegate(ba, "makeinitialize", false))
	 {return ((String) Debug.delegate(ba, "makeinitialize", null));}
RDebugUtils.currentLine=132382720;
 //BA.debugLineNum = 132382720;BA.debugLine="Sub MakeInitialize";
RDebugUtils.currentLine=132382721;
 //BA.debugLineNum = 132382721;BA.debugLine="If File.Exists(File.DirInternal, ConfigFileName)";
if (__c.File.Exists(__c.File.getDirInternal(),__ref._configfilename /*String*/ )) { 
 };
RDebugUtils.currentLine=132382729;
 //BA.debugLineNum = 132382729;BA.debugLine="End Sub";
return "";
}
public String  _initialize2(xevolution.vrcg.devdemov2400.configparameters __ref,String _configfile) throws Exception{
__ref = this;
RDebugUtils.currentModule="configparameters";
if (Debug.shouldDelegate(ba, "initialize2", false))
	 {return ((String) Debug.delegate(ba, "initialize2", new Object[] {_configfile}));}
RDebugUtils.currentLine=132317184;
 //BA.debugLineNum = 132317184;BA.debugLine="Public Sub Initialize2(ConfigFile As String)";
RDebugUtils.currentLine=132317185;
 //BA.debugLineNum = 132317185;BA.debugLine="ConfigFileName = ConfigFile";
__ref._configfilename /*String*/  = _configfile;
RDebugUtils.currentLine=132317186;
 //BA.debugLineNum = 132317186;BA.debugLine="MakeInitialize";
__ref._makeinitialize /*String*/ (null);
RDebugUtils.currentLine=132317187;
 //BA.debugLineNum = 132317187;BA.debugLine="End Sub";
return "";
}
}