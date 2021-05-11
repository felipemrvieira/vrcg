package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class fileprovider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.fileprovider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.fileprovider.class).invoke(this, new Object[] {null});
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
public String _sharedfolder = "";
public boolean _usefileprovider = false;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public String _applicationfolder = "";
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
public String  _initialize(xevolution.vrcg.devdemov2400.fileprovider __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=142606336;
 //BA.debugLineNum = 142606336;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=142606337;
 //BA.debugLineNum = 142606337;BA.debugLine="ApplicationFolder = \"\"";
__ref._applicationfolder /*String*/  = "";
RDebugUtils.currentLine=142606338;
 //BA.debugLineNum = 142606338;BA.debugLine="End Sub";
return "";
}
public Object  _getapkfileuri(xevolution.vrcg.devdemov2400.fileprovider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "getapkfileuri", false))
	 {return ((Object) Debug.delegate(ba, "getapkfileuri", null));}
int _flag_activity_clear_top = 0;
int _flag_activity_clear_task = 0;
int _flag_activity_new_task = 0;
anywheresoftware.b4a.objects.IntentWrapper _iintent = null;
anywheresoftware.b4j.object.JavaObject _uri = null;
String _uristring = "";
RDebugUtils.currentLine=142868480;
 //BA.debugLineNum = 142868480;BA.debugLine="Public Sub GetApkFileUri () As Object";
RDebugUtils.currentLine=142868481;
 //BA.debugLineNum = 142868481;BA.debugLine="Dim FLAG_ACTIVITY_CLEAR_TOP As Int = 0x04000000";
_flag_activity_clear_top = (int) (0x04000000);
RDebugUtils.currentLine=142868482;
 //BA.debugLineNum = 142868482;BA.debugLine="Dim FLAG_ACTIVITY_CLEAR_TASK As Int = 0x00008000";
_flag_activity_clear_task = (int) (0x00008000);
RDebugUtils.currentLine=142868483;
 //BA.debugLineNum = 142868483;BA.debugLine="Dim FLAG_ACTIVITY_NEW_TASK As Int = 0x10000000";
_flag_activity_new_task = (int) (0x10000000);
RDebugUtils.currentLine=142868485;
 //BA.debugLineNum = 142868485;BA.debugLine="Dim iIntent As Intent";
_iintent = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=142868486;
 //BA.debugLineNum = 142868486;BA.debugLine="Dim uri As JavaObject";
_uri = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=142868487;
 //BA.debugLineNum = 142868487;BA.debugLine="Dim uriString As String = uri.InitializeStatic(\"a";
_uristring = BA.ObjectToString(_uri.InitializeStatic("android.net.Uri").RunMethod("parse",new Object[]{(Object)("content://"+__c.File.Combine(__c.File.getDirRootExternal()+"/Download/","vrcg_demo.apk"))}));
RDebugUtils.currentLine=142868488;
 //BA.debugLineNum = 142868488;BA.debugLine="iIntent.Initialize(\"android.intent.action.INSTALL";
_iintent.Initialize("android.intent.action.INSTALL_PACKAGE",_uristring);
RDebugUtils.currentLine=142868490;
 //BA.debugLineNum = 142868490;BA.debugLine="iIntent.SetType(\"application/vnd.android.package-";
_iintent.SetType("application/vnd.android.package-archive");
RDebugUtils.currentLine=142868491;
 //BA.debugLineNum = 142868491;BA.debugLine="iIntent.Flags = FLAG_ACTIVITY_CLEAR_TASK";
_iintent.setFlags(_flag_activity_clear_task);
RDebugUtils.currentLine=142868495;
 //BA.debugLineNum = 142868495;BA.debugLine="StartActivity(iIntent)";
__c.StartActivity(ba,(Object)(_iintent.getObject()));
RDebugUtils.currentLine=142868496;
 //BA.debugLineNum = 142868496;BA.debugLine="End Sub";
return null;
}
public Object  _getfileuri(xevolution.vrcg.devdemov2400.fileprovider __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "getfileuri", false))
	 {return ((Object) Debug.delegate(ba, "getfileuri", new Object[] {_filename}));}
anywheresoftware.b4j.object.JavaObject _uri = null;
anywheresoftware.b4j.object.JavaObject _f = null;
anywheresoftware.b4j.object.JavaObject _fp = null;
anywheresoftware.b4j.object.JavaObject _context = null;
RDebugUtils.currentLine=142802944;
 //BA.debugLineNum = 142802944;BA.debugLine="Public Sub GetFileUri (FileName As String) As Obje";
RDebugUtils.currentLine=142802946;
 //BA.debugLineNum = 142802946;BA.debugLine="If UseFileProvider = False Then";
if (__ref._usefileprovider /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=142802947;
 //BA.debugLineNum = 142802947;BA.debugLine="Dim uri As JavaObject";
_uri = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=142802948;
 //BA.debugLineNum = 142802948;BA.debugLine="Return uri.InitializeStatic(\"android.net.Uri\").R";
if (true) return _uri.InitializeStatic("android.net.Uri").RunMethod("parse",new Object[]{(Object)("file://"+__c.File.Combine(__ref._sharedfolder /*String*/ ,_filename))});
 }else {
RDebugUtils.currentLine=142802950;
 //BA.debugLineNum = 142802950;BA.debugLine="Dim f As JavaObject";
_f = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=142802951;
 //BA.debugLineNum = 142802951;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Sh";
_f.InitializeNewInstance("java.io.File",new Object[]{(Object)(__ref._sharedfolder /*String*/ ),(Object)(_filename)});
RDebugUtils.currentLine=142802952;
 //BA.debugLineNum = 142802952;BA.debugLine="Dim fp As JavaObject";
_fp = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=142802953;
 //BA.debugLineNum = 142802953;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=142802954;
 //BA.debugLineNum = 142802954;BA.debugLine="context.InitializeContext";
_context.InitializeContext(ba);
RDebugUtils.currentLine=142802955;
 //BA.debugLineNum = 142802955;BA.debugLine="fp.InitializeStatic(\"android.support.v4.content.";
_fp.InitializeStatic("androidx.core.content.FileProvider");
RDebugUtils.currentLine=142802956;
 //BA.debugLineNum = 142802956;BA.debugLine="Return fp.RunMethod(\"getUriForFile\", Array(conte";
if (true) return _fp.RunMethod("getUriForFile",new Object[]{(Object)(_context.getObject()),(Object)(__c.Application.getPackageName()+".provider"),(Object)(_f.getObject())});
 };
RDebugUtils.currentLine=142802958;
 //BA.debugLineNum = 142802958;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(xevolution.vrcg.devdemov2400.fileprovider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
RDebugUtils.currentLine=142540800;
 //BA.debugLineNum = 142540800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=142540801;
 //BA.debugLineNum = 142540801;BA.debugLine="Public SharedFolder As String = \"\"";
_sharedfolder = "";
RDebugUtils.currentLine=142540802;
 //BA.debugLineNum = 142540802;BA.debugLine="Public UseFileProvider As Boolean = False";
_usefileprovider = __c.False;
RDebugUtils.currentLine=142540803;
 //BA.debugLineNum = 142540803;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=142540804;
 //BA.debugLineNum = 142540804;BA.debugLine="Public ApplicationFolder As String";
_applicationfolder = "";
RDebugUtils.currentLine=142540805;
 //BA.debugLineNum = 142540805;BA.debugLine="End Sub";
return "";
}
public String  _initializecombine(xevolution.vrcg.devdemov2400.fileprovider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "initializecombine", false))
	 {return ((String) Debug.delegate(ba, "initializecombine", null));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=142671872;
 //BA.debugLineNum = 142671872;BA.debugLine="Public Sub InitializeCombine";
RDebugUtils.currentLine=142671874;
 //BA.debugLineNum = 142671874;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=142671875;
 //BA.debugLineNum = 142671875;BA.debugLine="If p.SdkVersion >= 24 Or File.ExternalWritable =";
if (_p.getSdkVersion()>=24 || __c.File.getExternalWritable()==__c.False) { 
RDebugUtils.currentLine=142671876;
 //BA.debugLineNum = 142671876;BA.debugLine="UseFileProvider = True";
__ref._usefileprovider /*boolean*/  = __c.True;
RDebugUtils.currentLine=142671877;
 //BA.debugLineNum = 142671877;BA.debugLine="SharedFolder = File.Combine(File.DirInternal, \"s";
__ref._sharedfolder /*String*/  = __c.File.Combine(__c.File.getDirInternal(),"shared");
RDebugUtils.currentLine=142671878;
 //BA.debugLineNum = 142671878;BA.debugLine="File.MakeDir(\"\", SharedFolder)";
__c.File.MakeDir("",__ref._sharedfolder /*String*/ );
 }else {
RDebugUtils.currentLine=142671880;
 //BA.debugLineNum = 142671880;BA.debugLine="UseFileProvider = False";
__ref._usefileprovider /*boolean*/  = __c.False;
RDebugUtils.currentLine=142671881;
 //BA.debugLineNum = 142671881;BA.debugLine="SharedFolder = rp.GetSafeDirDefaultExternal(\"sha";
__ref._sharedfolder /*String*/  = __ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .GetSafeDirDefaultExternal("shared");
 };
RDebugUtils.currentLine=142671883;
 //BA.debugLineNum = 142671883;BA.debugLine="Log($\"Using FileProvider? ${UseFileProvider}\"$)";
__c.LogImpl("6142671883",("Using FileProvider? "+__c.SmartStringFormatter("",(Object)(__ref._usefileprovider /*boolean*/ ))+""),0);
RDebugUtils.currentLine=142671884;
 //BA.debugLineNum = 142671884;BA.debugLine="ApplicationFolder = SharedFolder";
__ref._applicationfolder /*String*/  = __ref._sharedfolder /*String*/ ;
RDebugUtils.currentLine=142671885;
 //BA.debugLineNum = 142671885;BA.debugLine="End Sub";
return "";
}
public String  _initializesafedir(xevolution.vrcg.devdemov2400.fileprovider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "initializesafedir", false))
	 {return ((String) Debug.delegate(ba, "initializesafedir", null));}
RDebugUtils.currentLine=142737408;
 //BA.debugLineNum = 142737408;BA.debugLine="Public Sub InitializeSafeDir";
RDebugUtils.currentLine=142737410;
 //BA.debugLineNum = 142737410;BA.debugLine="UseFileProvider = False";
__ref._usefileprovider /*boolean*/  = __c.False;
RDebugUtils.currentLine=142737411;
 //BA.debugLineNum = 142737411;BA.debugLine="SharedFolder = rp.GetSafeDirDefaultExternal(\"shar";
__ref._sharedfolder /*String*/  = __ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .GetSafeDirDefaultExternal("shared");
RDebugUtils.currentLine=142737412;
 //BA.debugLineNum = 142737412;BA.debugLine="Log($\"Using FileProvider? ${UseFileProvider}, Sha";
__c.LogImpl("6142737412",("Using FileProvider? "+__c.SmartStringFormatter("",(Object)(__ref._usefileprovider /*boolean*/ ))+", ShareFolder: "+__c.SmartStringFormatter("",(Object)(__ref._sharedfolder /*String*/ ))+""),0);
RDebugUtils.currentLine=142737413;
 //BA.debugLineNum = 142737413;BA.debugLine="ApplicationFolder = SharedFolder";
__ref._applicationfolder /*String*/  = __ref._sharedfolder /*String*/ ;
RDebugUtils.currentLine=142737414;
 //BA.debugLineNum = 142737414;BA.debugLine="End Sub";
return "";
}
public String  _setfileuriasintentdata(xevolution.vrcg.devdemov2400.fileprovider __ref,anywheresoftware.b4a.objects.IntentWrapper _intent,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileprovider";
if (Debug.shouldDelegate(ba, "setfileuriasintentdata", false))
	 {return ((String) Debug.delegate(ba, "setfileuriasintentdata", new Object[] {_intent,_filename}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=142934016;
 //BA.debugLineNum = 142934016;BA.debugLine="Public Sub SetFileUriAsIntentData (Intent As Inten";
RDebugUtils.currentLine=142934017;
 //BA.debugLineNum = 142934017;BA.debugLine="Dim jo As JavaObject = Intent";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_intent.getObject()));
RDebugUtils.currentLine=142934018;
 //BA.debugLineNum = 142934018;BA.debugLine="jo.RunMethod(\"setData\", Array(GetFileUri(FileName";
_jo.RunMethod("setData",new Object[]{__ref._getfileuri /*Object*/ (null,_filename)});
RDebugUtils.currentLine=142934019;
 //BA.debugLineNum = 142934019;BA.debugLine="Intent.Flags = Bit.Or(Intent.Flags, 1) 'FLAG_GRAN";
_intent.setFlags(__c.Bit.Or(_intent.getFlags(),(int) (1)));
RDebugUtils.currentLine=142934020;
 //BA.debugLineNum = 142934020;BA.debugLine="End Sub";
return "";
}
}