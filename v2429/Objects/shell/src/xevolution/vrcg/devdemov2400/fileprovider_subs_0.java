package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fileprovider_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SharedFolder As String = \"\"";
fileprovider._sharedfolder = BA.ObjectToString("");__ref.setField("_sharedfolder",fileprovider._sharedfolder);
 //BA.debugLineNum = 4;BA.debugLine="Public UseFileProvider As Boolean = False";
fileprovider._usefileprovider = fileprovider.__c.getField(true,"False");__ref.setField("_usefileprovider",fileprovider._usefileprovider);
 //BA.debugLineNum = 5;BA.debugLine="Private rp As RuntimePermissions";
fileprovider._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",fileprovider._rp);
 //BA.debugLineNum = 6;BA.debugLine="Public ApplicationFolder As String";
fileprovider._applicationfolder = RemoteObject.createImmutable("");__ref.setField("_applicationfolder",fileprovider._applicationfolder);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getapkfileuri(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetApkFileUri (fileprovider) ","fileprovider",39,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("getapkfileuri")) { return __ref.runUserSub(false, "fileprovider","getapkfileuri", __ref);}
RemoteObject _flag_activity_clear_top = RemoteObject.createImmutable(0);
RemoteObject _flag_activity_clear_task = RemoteObject.createImmutable(0);
RemoteObject _flag_activity_new_task = RemoteObject.createImmutable(0);
RemoteObject _iintent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _uri = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _uristring = RemoteObject.createImmutable("");
 BA.debugLineNum = 54;BA.debugLine="Public Sub GetApkFileUri () As Object";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim FLAG_ACTIVITY_CLEAR_TOP As Int = 0x04000000";
Debug.ShouldStop(4194304);
_flag_activity_clear_top = BA.numberCast(int.class, 0x04000000);Debug.locals.put("FLAG_ACTIVITY_CLEAR_TOP", _flag_activity_clear_top);Debug.locals.put("FLAG_ACTIVITY_CLEAR_TOP", _flag_activity_clear_top);
 BA.debugLineNum = 56;BA.debugLine="Dim FLAG_ACTIVITY_CLEAR_TASK As Int = 0x00008000";
Debug.ShouldStop(8388608);
_flag_activity_clear_task = BA.numberCast(int.class, 0x00008000);Debug.locals.put("FLAG_ACTIVITY_CLEAR_TASK", _flag_activity_clear_task);Debug.locals.put("FLAG_ACTIVITY_CLEAR_TASK", _flag_activity_clear_task);
 BA.debugLineNum = 57;BA.debugLine="Dim FLAG_ACTIVITY_NEW_TASK As Int = 0x10000000";
Debug.ShouldStop(16777216);
_flag_activity_new_task = BA.numberCast(int.class, 0x10000000);Debug.locals.put("FLAG_ACTIVITY_NEW_TASK", _flag_activity_new_task);Debug.locals.put("FLAG_ACTIVITY_NEW_TASK", _flag_activity_new_task);
 BA.debugLineNum = 59;BA.debugLine="Dim iIntent As Intent";
Debug.ShouldStop(67108864);
_iintent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("iIntent", _iintent);
 BA.debugLineNum = 60;BA.debugLine="Dim uri As JavaObject";
Debug.ShouldStop(134217728);
_uri = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("uri", _uri);
 BA.debugLineNum = 61;BA.debugLine="Dim uriString As String = uri.InitializeStatic(\"a";
Debug.ShouldStop(268435456);
_uristring = BA.ObjectToString(_uri.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.net.Uri"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.concat(RemoteObject.createImmutable("content://"),fileprovider.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(fileprovider.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),RemoteObject.createImmutable("/Download/"))),(Object)(RemoteObject.createImmutable("vrcg_demo.apk")))))}))));Debug.locals.put("uriString", _uristring);Debug.locals.put("uriString", _uristring);
 BA.debugLineNum = 62;BA.debugLine="iIntent.Initialize(\"android.intent.action.INSTALL";
Debug.ShouldStop(536870912);
_iintent.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.intent.action.INSTALL_PACKAGE")),(Object)(_uristring));
 BA.debugLineNum = 64;BA.debugLine="iIntent.SetType(\"application/vnd.android.package-";
Debug.ShouldStop(-2147483648);
_iintent.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/vnd.android.package-archive")));
 BA.debugLineNum = 65;BA.debugLine="iIntent.Flags = FLAG_ACTIVITY_CLEAR_TASK";
Debug.ShouldStop(1);
_iintent.runMethod(true,"setFlags",_flag_activity_clear_task);
 BA.debugLineNum = 69;BA.debugLine="StartActivity(iIntent)";
Debug.ShouldStop(16);
fileprovider.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_iintent.getObject())));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfileuri(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetFileUri (fileprovider) ","fileprovider",39,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("getfileuri")) { return __ref.runUserSub(false, "fileprovider","getfileuri", __ref, _filename);}
RemoteObject _uri = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _fp = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 37;BA.debugLine="Public Sub GetFileUri (FileName As String) As Obje";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="If UseFileProvider = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_usefileprovider" /*RemoteObject*/ ),fileprovider.__c.getField(true,"False"))) { 
 BA.debugLineNum = 40;BA.debugLine="Dim uri As JavaObject";
Debug.ShouldStop(128);
_uri = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("uri", _uri);
 BA.debugLineNum = 41;BA.debugLine="Return uri.InitializeStatic(\"android.net.Uri\").R";
Debug.ShouldStop(256);
if (true) return _uri.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.net.Uri"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.concat(RemoteObject.createImmutable("file://"),fileprovider.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename))))})));
 }else {
 BA.debugLineNum = 43;BA.debugLine="Dim f As JavaObject";
Debug.ShouldStop(1024);
_f = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("f", _f);
 BA.debugLineNum = 44;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Sh";
Debug.ShouldStop(2048);
_f.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )),(_filename)})));
 BA.debugLineNum = 45;BA.debugLine="Dim fp As JavaObject";
Debug.ShouldStop(4096);
_fp = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fp", _fp);
 BA.debugLineNum = 46;BA.debugLine="Dim context As JavaObject";
Debug.ShouldStop(8192);
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 47;BA.debugLine="context.InitializeContext";
Debug.ShouldStop(16384);
_context.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 48;BA.debugLine="fp.InitializeStatic(\"android.support.v4.content.";
Debug.ShouldStop(32768);
_fp.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("androidx.core.content.FileProvider")));
 BA.debugLineNum = 49;BA.debugLine="Return fp.RunMethod(\"getUriForFile\", Array(conte";
Debug.ShouldStop(65536);
if (true) return _fp.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUriForFile")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_context.getObject()),(RemoteObject.concat(fileprovider.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".provider"))),(_f.getObject())})));
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (fileprovider) ","fileprovider",39,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "fileprovider","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="ApplicationFolder = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_applicationfolder" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializecombine(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitializeCombine (fileprovider) ","fileprovider",39,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initializecombine")) { return __ref.runUserSub(false, "fileprovider","initializecombine", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
 BA.debugLineNum = 13;BA.debugLine="Public Sub InitializeCombine";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 16;BA.debugLine="If p.SdkVersion >= 24 Or File.ExternalWritable =";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("g",_p.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 24)) || RemoteObject.solveBoolean("=",fileprovider.__c.getField(false,"File").runMethod(true,"getExternalWritable"),fileprovider.__c.getField(true,"False"))) { 
 BA.debugLineNum = 17;BA.debugLine="UseFileProvider = True";
Debug.ShouldStop(65536);
__ref.setField ("_usefileprovider" /*RemoteObject*/ ,fileprovider.__c.getField(true,"True"));
 BA.debugLineNum = 18;BA.debugLine="SharedFolder = File.Combine(File.DirInternal, \"s";
Debug.ShouldStop(131072);
__ref.setField ("_sharedfolder" /*RemoteObject*/ ,fileprovider.__c.getField(false,"File").runMethod(true,"Combine",(Object)(fileprovider.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("shared"))));
 BA.debugLineNum = 19;BA.debugLine="File.MakeDir(\"\", SharedFolder)";
Debug.ShouldStop(262144);
fileprovider.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(BA.ObjectToString("")),(Object)(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 21;BA.debugLine="UseFileProvider = False";
Debug.ShouldStop(1048576);
__ref.setField ("_usefileprovider" /*RemoteObject*/ ,fileprovider.__c.getField(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="SharedFolder = rp.GetSafeDirDefaultExternal(\"sha";
Debug.ShouldStop(2097152);
__ref.setField ("_sharedfolder" /*RemoteObject*/ ,__ref.getField(false,"_rp" /*RemoteObject*/ ).runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("shared"))));
 };
 BA.debugLineNum = 24;BA.debugLine="Log($\"Using FileProvider? ${UseFileProvider}\"$)";
Debug.ShouldStop(8388608);
fileprovider.__c.runVoidMethod ("LogImpl","6142671883",(RemoteObject.concat(RemoteObject.createImmutable("Using FileProvider? "),fileprovider.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_usefileprovider" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 25;BA.debugLine="ApplicationFolder = SharedFolder";
Debug.ShouldStop(16777216);
__ref.setField ("_applicationfolder" /*RemoteObject*/ ,__ref.getField(true,"_sharedfolder" /*RemoteObject*/ ));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializesafedir(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitializeSafeDir (fileprovider) ","fileprovider",39,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("initializesafedir")) { return __ref.runUserSub(false, "fileprovider","initializesafedir", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Public Sub InitializeSafeDir";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="UseFileProvider = False";
Debug.ShouldStop(536870912);
__ref.setField ("_usefileprovider" /*RemoteObject*/ ,fileprovider.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="SharedFolder = rp.GetSafeDirDefaultExternal(\"shar";
Debug.ShouldStop(1073741824);
__ref.setField ("_sharedfolder" /*RemoteObject*/ ,__ref.getField(false,"_rp" /*RemoteObject*/ ).runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("shared"))));
 BA.debugLineNum = 32;BA.debugLine="Log($\"Using FileProvider? ${UseFileProvider}, Sha";
Debug.ShouldStop(-2147483648);
fileprovider.__c.runVoidMethod ("LogImpl","6142737412",(RemoteObject.concat(RemoteObject.createImmutable("Using FileProvider? "),fileprovider.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_usefileprovider" /*RemoteObject*/ )))),RemoteObject.createImmutable(", ShareFolder: "),fileprovider.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 33;BA.debugLine="ApplicationFolder = SharedFolder";
Debug.ShouldStop(1);
__ref.setField ("_applicationfolder" /*RemoteObject*/ ,__ref.getField(true,"_sharedfolder" /*RemoteObject*/ ));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfileuriasintentdata(RemoteObject __ref,RemoteObject _intent,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SetFileUriAsIntentData (fileprovider) ","fileprovider",39,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setfileuriasintentdata")) { return __ref.runUserSub(false, "fileprovider","setfileuriasintentdata", __ref, _intent, _filename);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Intent", _intent);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 75;BA.debugLine="Public Sub SetFileUriAsIntentData (Intent As Inten";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Dim jo As JavaObject = Intent";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _intent.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 77;BA.debugLine="jo.RunMethod(\"setData\", Array(GetFileUri(FileName";
Debug.ShouldStop(4096);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setData")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename))})));
 BA.debugLineNum = 78;BA.debugLine="Intent.Flags = Bit.Or(Intent.Flags, 1) 'FLAG_GRAN";
Debug.ShouldStop(8192);
_intent.runMethod(true,"setFlags",fileprovider.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_intent.runMethod(true,"getFlags")),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}