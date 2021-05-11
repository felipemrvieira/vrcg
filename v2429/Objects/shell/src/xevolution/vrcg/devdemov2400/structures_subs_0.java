package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class structures_subs_0 {


public static RemoteObject  _getmapcolorbyid(RemoteObject _ba,RemoteObject _objectmap,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetMapColorByID (structures) ","structures",57,_ba,structures.mostCurrent,84);
if (RapidSub.canDelegate("getmapcolorbyid")) { return xevolution.vrcg.devdemov2400.structures.remoteMe.runUserSub(false, "structures","getmapcolorbyid", _ba, _objectmap, _id);}
RemoteObject _ret = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("ObjectMap", _objectmap);
Debug.locals.put("ID", _id);
 BA.debugLineNum = 84;BA.debugLine="Public Sub GetMapColorByID(ObjectMap As List, ID A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(1048576);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 86;BA.debugLine="If (ObjectMap.Size > 0) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean(">",_objectmap.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 87;BA.debugLine="For i=0 To ObjectMap.size-1";
Debug.ShouldStop(4194304);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_objectmap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 88;BA.debugLine="Dim mData As Map = ObjectMap.Get(i)";
Debug.ShouldStop(8388608);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _objectmap.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 89;BA.debugLine="If (mData.Get(\"id\") = ID) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),(_id)))) { 
 BA.debugLineNum = 90;BA.debugLine="ret = mData.Get(\"color\")";
Debug.ShouldStop(33554432);
_ret = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("color")))));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 91;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 95;BA.debugLine="Return ret";
Debug.ShouldStop(1073741824);
if (true) return _ret;
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmapdescbypos(RemoteObject _ba,RemoteObject _objectmap,RemoteObject _pos) throws Exception{
try {
		Debug.PushSubsStack("GetMapDescByPos (structures) ","structures",57,_ba,structures.mostCurrent,98);
if (RapidSub.canDelegate("getmapdescbypos")) { return xevolution.vrcg.devdemov2400.structures.remoteMe.runUserSub(false, "structures","getmapdescbypos", _ba, _objectmap, _pos);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("ObjectMap", _objectmap);
Debug.locals.put("pos", _pos);
 BA.debugLineNum = 98;BA.debugLine="Public Sub GetMapDescByPos(ObjectMap As List, pos";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(4);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 100;BA.debugLine="If (ObjectMap.Size > 0) And ((pos >= 0) And (pos+";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_objectmap.runMethod(true,"getSize"),BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_pos,BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_pos,RemoteObject.createImmutable(1)}, "+",1, 1),BA.numberCast(double.class, _objectmap.runMethod(true,"getSize")))))))))) { 
 BA.debugLineNum = 101;BA.debugLine="Dim mData As Map = ObjectMap.Get(pos)";
Debug.ShouldStop(16);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _objectmap.runMethod(false,"Get",(Object)(_pos)));Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 102;BA.debugLine="ret = mData.Get(\"title\")";
Debug.ShouldStop(32);
_ret = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 104;BA.debugLine="Return ret";
Debug.ShouldStop(128);
if (true) return _ret;
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaptitlebyid(RemoteObject _ba,RemoteObject _objectmap,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetMapTitleByID (structures) ","structures",57,_ba,structures.mostCurrent,70);
if (RapidSub.canDelegate("getmaptitlebyid")) { return xevolution.vrcg.devdemov2400.structures.remoteMe.runUserSub(false, "structures","getmaptitlebyid", _ba, _objectmap, _id);}
RemoteObject _ret = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("ObjectMap", _objectmap);
Debug.locals.put("ID", _id);
 BA.debugLineNum = 70;BA.debugLine="Public Sub GetMapTitleByID(ObjectMap As List, ID A";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(64);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 72;BA.debugLine="If (ObjectMap.Size > 0) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean(">",_objectmap.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 73;BA.debugLine="For i=0 To ObjectMap.size-1";
Debug.ShouldStop(256);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_objectmap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 74;BA.debugLine="Dim mData As Map = ObjectMap.Get(i)";
Debug.ShouldStop(512);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _objectmap.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 75;BA.debugLine="If (mData.Get(\"id\") = ID) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),(_id)))) { 
 BA.debugLineNum = 76;BA.debugLine="ret = mData.Get(\"title\")";
Debug.ShouldStop(2048);
_ret = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 77;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 81;BA.debugLine="Return ret";
Debug.ShouldStop(65536);
if (true) return _ret;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettrackerdesc(RemoteObject _ba,RemoteObject _objectmap,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetTrackerDesc (structures) ","structures",57,_ba,structures.mostCurrent,45);
if (RapidSub.canDelegate("gettrackerdesc")) { return xevolution.vrcg.devdemov2400.structures.remoteMe.runUserSub(false, "structures","gettrackerdesc", _ba, _objectmap, _id);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("ObjectMap", _objectmap);
Debug.locals.put("ID", _id);
 BA.debugLineNum = 45;BA.debugLine="Public Sub GetTrackerDesc(ObjectMap As List, ID As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(8192);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 47;BA.debugLine="If (ObjectMap.Size > 0) And ((ID >= 0) And (ID+1";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_objectmap.runMethod(true,"getSize"),BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_id,BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_id,RemoteObject.createImmutable(1)}, "+",1, 1),BA.numberCast(double.class, _objectmap.runMethod(true,"getSize")))))))))) { 
 BA.debugLineNum = 48;BA.debugLine="Dim mData As Map = ObjectMap.Get(ID)";
Debug.ShouldStop(32768);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _objectmap.runMethod(false,"Get",(Object)(_id)));Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 49;BA.debugLine="ret = mData.Get(\"tracker\")";
Debug.ShouldStop(65536);
_ret = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tracker")))));Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 51;BA.debugLine="Return ret";
Debug.ShouldStop(262144);
if (true) return _ret;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettrackerpos(RemoteObject _ba,RemoteObject _objectmap,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("GetTrackerPos (structures) ","structures",57,_ba,structures.mostCurrent,54);
if (RapidSub.canDelegate("gettrackerpos")) { return xevolution.vrcg.devdemov2400.structures.remoteMe.runUserSub(false, "structures","gettrackerpos", _ba, _objectmap, _str);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _s = RemoteObject.createImmutable("");
;
Debug.locals.put("ObjectMap", _objectmap);
Debug.locals.put("str", _str);
 BA.debugLineNum = 54;BA.debugLine="Public Sub GetTrackerPos(ObjectMap As List, str As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim ret As Int = -1";
Debug.ShouldStop(4194304);
_ret = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 56;BA.debugLine="Dim counter As Int = 0";
Debug.ShouldStop(8388608);
_counter = BA.numberCast(int.class, 0);Debug.locals.put("counter", _counter);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 57;BA.debugLine="If (ObjectMap.Size > 0) And (str <> \"\") Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_objectmap.runMethod(true,"getSize"),BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_str,RemoteObject.createImmutable("")))))) { 
 BA.debugLineNum = 58;BA.debugLine="For Each mData As Map In ObjectMap";
Debug.ShouldStop(33554432);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = _objectmap;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group4.runMethod(false,"Get",index4));
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 59;BA.debugLine="Dim s As String = mData.Get(\"tracker\")";
Debug.ShouldStop(67108864);
_s = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tracker")))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 60;BA.debugLine="If (s = str) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",_s,_str))) { 
 BA.debugLineNum = 61;BA.debugLine="ret = counter";
Debug.ShouldStop(268435456);
_ret = _counter;Debug.locals.put("ret", _ret);
 BA.debugLineNum = 62;BA.debugLine="Exit";
Debug.ShouldStop(536870912);
if (true) break;
 };
 BA.debugLineNum = 64;BA.debugLine="counter = counter + 1";
Debug.ShouldStop(-2147483648);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("counter", _counter);
 }
}Debug.locals.put("mData", _mdata);
;
 };
 BA.debugLineNum = 67;BA.debugLine="Return ret";
Debug.ShouldStop(4);
if (true) return _ret;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public MapUser As Map";
structures._mapuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 7;BA.debugLine="Public Track_User As List";
structures._track_user = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 10;BA.debugLine="Public MapReports As Map";
structures._mapreports = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Public Track_Reports As List";
structures._track_reports = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 14;BA.debugLine="Public MapRequests As Map";
structures._maprequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 15;BA.debugLine="Public TrackRequests As List";
structures._trackrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Public RequestsTypes As List";
structures._requeststypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 17;BA.debugLine="Public TypeRequestsStatus As List";
structures._typerequestsstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 20;BA.debugLine="Public MapEntities As Map";
structures._mapentities = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 21;BA.debugLine="Public Track_Entities As List";
structures._track_entities = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 22;BA.debugLine="Public Entities_Types As List";
structures._entities_types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 25;BA.debugLine="Public MapObjects As Map";
structures._mapobjects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 26;BA.debugLine="Public Track_Objects As List";
structures._track_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 27;BA.debugLine="Public Objects_Types As List";
structures._objects_types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 30;BA.debugLine="Public MapTasks As Map";
structures._maptasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 31;BA.debugLine="Public Track_Tasks As List";
structures._track_tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 32;BA.debugLine="Public Alerts_Types As List";
structures._alerts_types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 33;BA.debugLine="Public Alerts_Status As List";
structures._alerts_status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 34;BA.debugLine="Public Alerts_ItemStatus As List";
structures._alerts_itemstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 35;BA.debugLine="Public Alerts_Priorities As List";
structures._alerts_priorities = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 36;BA.debugLine="Public Alerts_Urgency As List";
structures._alerts_urgency = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updatetracker(RemoteObject _ba,RemoteObject _objectmap,RemoteObject _inputobject) throws Exception{
try {
		Debug.PushSubsStack("UpdateTracker (structures) ","structures",57,_ba,structures.mostCurrent,41);
if (RapidSub.canDelegate("updatetracker")) { return xevolution.vrcg.devdemov2400.structures.remoteMe.runUserSub(false, "structures","updatetracker", _ba, _objectmap, _inputobject);}
;
Debug.locals.put("ObjectMap", _objectmap);
Debug.locals.put("InputObject", _inputobject);
 BA.debugLineNum = 41;BA.debugLine="Public Sub UpdateTracker( ObjectMap As List, Input";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="ObjectMap = InputObject";
Debug.ShouldStop(512);
_objectmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _inputobject);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}