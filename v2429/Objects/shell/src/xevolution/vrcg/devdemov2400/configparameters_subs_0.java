package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class configparameters_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public CFG_ALLOW_FRONT_CAMERA As Int = 0";
configparameters._cfg_allow_front_camera = BA.numberCast(int.class, 0);__ref.setField("_cfg_allow_front_camera",configparameters._cfg_allow_front_camera);
 //BA.debugLineNum = 10;BA.debugLine="Public CFG_COPY_IMAGE_TO_GALLERY As Int = 1";
configparameters._cfg_copy_image_to_gallery = BA.numberCast(int.class, 1);__ref.setField("_cfg_copy_image_to_gallery",configparameters._cfg_copy_image_to_gallery);
 //BA.debugLineNum = 11;BA.debugLine="Public CFG_TAKE_PICTURE_ALWAYS_AS_NEW As Int = 1";
configparameters._cfg_take_picture_always_as_new = BA.numberCast(int.class, 1);__ref.setField("_cfg_take_picture_always_as_new",configparameters._cfg_take_picture_always_as_new);
 //BA.debugLineNum = 13;BA.debugLine="Private ConfigFileName As String = \"config.json\"";
configparameters._configfilename = BA.ObjectToString("config.json");__ref.setField("_configfilename",configparameters._configfilename);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (configparameters) ","configparameters",32,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "configparameters","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="MakeInitialize";
Debug.ShouldStop(131072);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.configparameters.class, "_makeinitialize" /*RemoteObject*/ );
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize2(RemoteObject __ref,RemoteObject _configfile) throws Exception{
try {
		Debug.PushSubsStack("Initialize2 (configparameters) ","configparameters",32,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize2")) { return __ref.runUserSub(false, "configparameters","initialize2", __ref, _configfile);}
Debug.locals.put("ConfigFile", _configfile);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize2(ConfigFile As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="ConfigFileName = ConfigFile";
Debug.ShouldStop(2097152);
__ref.setField ("_configfilename" /*RemoteObject*/ ,_configfile);
 BA.debugLineNum = 23;BA.debugLine="MakeInitialize";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.configparameters.class, "_makeinitialize" /*RemoteObject*/ );
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeinitialize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MakeInitialize (configparameters) ","configparameters",32,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("makeinitialize")) { return __ref.runUserSub(false, "configparameters","makeinitialize", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Sub MakeInitialize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="If File.Exists(File.DirInternal, ConfigFileName)";
Debug.ShouldStop(67108864);
if (configparameters.__c.getField(false,"File").runMethod(true,"Exists",(Object)(configparameters.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_configfilename" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}