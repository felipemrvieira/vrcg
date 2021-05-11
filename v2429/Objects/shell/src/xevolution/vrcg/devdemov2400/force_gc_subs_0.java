package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class force_gc_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private t As Thread";
force_gc._t = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");__ref.setField("_t",force_gc._t);
 //BA.debugLineNum = 4;BA.debugLine="Private r As Reflector";
force_gc._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");__ref.setField("_r",force_gc._r);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _fire(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Fire (force_gc) ","force_gc",40,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("fire")) { return __ref.runUserSub(false, "force_gc","fire", __ref);}
RemoteObject _args = null;
 BA.debugLineNum = 12;BA.debugLine="Public Sub Fire";
Debug.ShouldStop(2048);
 BA.debugLineNum = 15;BA.debugLine="t.Initialise(\"t\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_t" /*RemoteObject*/ ).runVoidMethod ("Initialise",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("t")));
 BA.debugLineNum = 18;BA.debugLine="Dim args(0) As Object";
Debug.ShouldStop(131072);
_args = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});Debug.locals.put("args", _args);
 BA.debugLineNum = 19;BA.debugLine="t.Start(Me, \"t_process\", args)";
Debug.ShouldStop(262144);
__ref.getField(false,"_t" /*RemoteObject*/ ).runVoidMethod ("Start",(Object)(__ref),(Object)(BA.ObjectToString("t_process")),(Object)(_args));
 BA.debugLineNum = 22;BA.debugLine="Do While t.Running";
Debug.ShouldStop(2097152);
while (__ref.getField(false,"_t" /*RemoteObject*/ ).runMethod(true,"getRunning").<Boolean>get().booleanValue()) {
 }
;
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (force_gc) ","force_gc",40,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "force_gc","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize()";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_ended(RemoteObject __ref,RemoteObject _fail,RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("t_Ended (force_gc) ","force_gc",40,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("t_ended")) { return __ref.runUserSub(false, "force_gc","t_ended", __ref, _fail, _error);}
Debug.locals.put("Fail", _fail);
Debug.locals.put("Error", _error);
 BA.debugLineNum = 40;BA.debugLine="Private Sub t_Ended(Fail As Boolean, Error As Stri";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_process(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("t_process (force_gc) ","force_gc",40,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("t_process")) { return __ref.runUserSub(false, "force_gc","t_process", __ref);}
RemoteObject _maxmemory = RemoteObject.createImmutable(0L);
RemoteObject _bomb = null;
 BA.debugLineNum = 28;BA.debugLine="Private Sub t_process";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 31;BA.debugLine="r.Target = r.RunStaticMethod(\"java.lang.Runtime\",";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("java.lang.Runtime")),(Object)(BA.ObjectToString("getRuntime")),(Object)((force_gc.__c.getField(false,"Null"))),(Object)((force_gc.__c.getField(false,"Null")))));
 BA.debugLineNum = 32;BA.debugLine="Private maxmemory As Long = r.RunMethod(\"maxMemor";
Debug.ShouldStop(-2147483648);
_maxmemory = BA.numberCast(long.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("maxMemory"))));Debug.locals.put("maxmemory", _maxmemory);Debug.locals.put("maxmemory", _maxmemory);
 BA.debugLineNum = 36;BA.debugLine="Private bomb(maxmemory / 8) As Double";
Debug.ShouldStop(8);
_bomb = RemoteObject.createNewArray ("double", new int[] {(int) (0 + RemoteObject.solve(new RemoteObject[] {_maxmemory,RemoteObject.createImmutable(8)}, "/",0, 0).<Double>get().doubleValue())}, new Object[]{});Debug.locals.put("bomb", _bomb);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}