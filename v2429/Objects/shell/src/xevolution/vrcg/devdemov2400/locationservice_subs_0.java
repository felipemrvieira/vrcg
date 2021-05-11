package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class locationservice_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,48);
if (RapidSub.canDelegate("application_error")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 48;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return locationservice.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fusedlocationprovider1_connectionfailed(RemoteObject _connectionresult1) throws Exception{
try {
		Debug.PushSubsStack("FusedLocationProvider1_ConnectionFailed (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,57);
if (RapidSub.canDelegate("fusedlocationprovider1_connectionfailed")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","fusedlocationprovider1_connectionfailed", _connectionresult1);}
Debug.locals.put("ConnectionResult1", _connectionresult1);
 BA.debugLineNum = 57;BA.debugLine="Sub FusedLocationProvider1_ConnectionFailed(Connec";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Select ConnectionResult1";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_connectionresult1,locationservice._fusedlocationprovider1.getField(false,"ConnectionResult").getField(true,"NETWORK_ERROR"))) {
case 0: {
 BA.debugLineNum = 60;BA.debugLine="FusedLocationProvider1.Connect";
Debug.ShouldStop(134217728);
locationservice._fusedlocationprovider1.runVoidMethod ("Connect");
 break; }
default: {
 break; }
}
;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fusedlocationprovider1_connectionsuccess() throws Exception{
try {
		Debug.PushSubsStack("FusedLocationProvider1_ConnectionSuccess (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,66);
if (RapidSub.canDelegate("fusedlocationprovider1_connectionsuccess")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","fusedlocationprovider1_connectionsuccess");}
RemoteObject _locationrequest1 = RemoteObject.declareNull("uk.co.martinpearman.b4a.fusedlocationprovider.LocationRequest");
 BA.debugLineNum = 66;BA.debugLine="Sub FusedLocationProvider1_ConnectionSuccess";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(".",locationservice.mostCurrent.__c.runMethod(true,"Not",(Object)(locationservice.mostCurrent._starter._app_reset_install /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",locationservice.mostCurrent.__c.runMethod(true,"Not",(Object)(locationservice.mostCurrent._starter._app_in_execution /*RemoteObject*/ )))) { 
 BA.debugLineNum = 68;BA.debugLine="Dim LocationRequest1 As LocationRequest";
Debug.ShouldStop(8);
_locationrequest1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.fusedlocationprovider.LocationRequest");Debug.locals.put("LocationRequest1", _locationrequest1);
 BA.debugLineNum = 69;BA.debugLine="LocationRequest1.Initialize";
Debug.ShouldStop(16);
_locationrequest1.runVoidMethod ("Initialize");
 BA.debugLineNum = 70;BA.debugLine="LocationRequest1.SetInterval(30000)	'	1000 milli";
Debug.ShouldStop(32);
_locationrequest1.runVoidMethod ("SetInterval",(Object)(BA.numberCast(long.class, 30000)));
 BA.debugLineNum = 71;BA.debugLine="LocationRequest1.SetPriority(LocationRequest1.Pr";
Debug.ShouldStop(64);
_locationrequest1.runVoidMethod ("SetPriority",(Object)(_locationrequest1.getField(false,"Priority").getField(true,"PRIORITY_HIGH_ACCURACY")));
 BA.debugLineNum = 72;BA.debugLine="LocationRequest1.SetSmallestDisplacement(1)	'	1";
Debug.ShouldStop(128);
_locationrequest1.runVoidMethod ("SetSmallestDisplacement",(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 73;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 74;BA.debugLine="FusedLocationProvider1.RequestLocationUpdates(L";
Debug.ShouldStop(512);
locationservice._fusedlocationprovider1.runVoidMethod ("RequestLocationUpdates",(Object)((_locationrequest1.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",locationservice.processBA, e10.toString()); BA.debugLineNum = 76;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
locationservice.mostCurrent.__c.runVoidMethod ("LogImpl","658851338",BA.ObjectToString(locationservice.mostCurrent.__c.runMethod(false,"LastException",locationservice.processBA)),0);
 };
 };
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
public static RemoteObject  _fusedlocationprovider1_connectionsuspended(RemoteObject _suspendedcause1) throws Exception{
try {
		Debug.PushSubsStack("FusedLocationProvider1_ConnectionSuspended (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,81);
if (RapidSub.canDelegate("fusedlocationprovider1_connectionsuspended")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","fusedlocationprovider1_connectionsuspended", _suspendedcause1);}
Debug.locals.put("SuspendedCause1", _suspendedcause1);
 BA.debugLineNum = 81;BA.debugLine="Sub FusedLocationProvider1_ConnectionSuspended(Sus";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Select SuspendedCause1";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_suspendedcause1,locationservice._fusedlocationprovider1.getField(false,"SuspendedCause").getField(true,"CAUSE_NETWORK_LOST"),locationservice._fusedlocationprovider1.getField(false,"SuspendedCause").getField(true,"CAUSE_SERVICE_DISCONNECTED"))) {
case 0: {
 break; }
case 1: {
 break; }
}
;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fusedlocationprovider1_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("FusedLocationProvider1_LocationChanged (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,90);
if (RapidSub.canDelegate("fusedlocationprovider1_locationchanged")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","fusedlocationprovider1_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 90;BA.debugLine="Sub FusedLocationProvider1_LocationChanged(Locatio";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) Then";
Debug.ShouldStop(134217728);
if (locationservice.mostCurrent.__c.runMethod(true,"Not",(Object)(locationservice.mostCurrent._starter._app_reset_install /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 93;BA.debugLine="If (Utils.NNE(Location1.Latitude) And Utils.NNE(";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean(".",locationservice.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,locationservice.processBA,(Object)(BA.NumberToString(_location1.runMethod(true,"getLatitude"))))) && RemoteObject.solveBoolean(".",locationservice.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,locationservice.processBA,(Object)(BA.NumberToString(_location1.runMethod(true,"getLongitude"))))))) { 
 BA.debugLineNum = 94;BA.debugLine="LastLocation=Location1";
Debug.ShouldStop(536870912);
locationservice._lastlocation = _location1;
 };
 BA.debugLineNum = 96;BA.debugLine="UpdateUI(Location1)";
Debug.ShouldStop(-2147483648);
_updateui(_location1);
 };
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public FusedLocationProvider1 As FusedLocationPro";
locationservice._fusedlocationprovider1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private LastLocation As Location";
locationservice._lastlocation = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Public GeoLocal As GeoData";
locationservice._geolocal = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._geodata");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,15);
if (RapidSub.canDelegate("service_create")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","service_create");}
 BA.debugLineNum = 15;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,52);
if (RapidSub.canDelegate("service_destroy")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","service_destroy");}
 BA.debugLineNum = 52;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="FusedLocationProvider1.Disconnect";
Debug.ShouldStop(1048576);
locationservice._fusedlocationprovider1.runVoidMethod ("Disconnect");
 BA.debugLineNum = 54;BA.debugLine="Service.StopAutomaticForeground";
Debug.ShouldStop(2097152);
locationservice.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,19);
if (RapidSub.canDelegate("service_start")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 19;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="FusedLocationProvider1.Initialize(\"FusedLocationP";
Debug.ShouldStop(1048576);
locationservice._fusedlocationprovider1.runVoidMethod ("Initialize",locationservice.processBA,(Object)(RemoteObject.createImmutable("FusedLocationProvider1")));
 BA.debugLineNum = 22;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(".",locationservice.mostCurrent.__c.runMethod(true,"Not",(Object)(locationservice.mostCurrent._starter._app_reset_install /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",locationservice.mostCurrent.__c.runMethod(true,"Not",(Object)(locationservice.mostCurrent._starter._app_in_execution /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",locationservice.mostCurrent.__c.runMethod(true,"Not",(Object)(locationservice.mostCurrent._starter._runupdate /*RemoteObject*/ )))) { 
 BA.debugLineNum = 23;BA.debugLine="FusedLocationProvider1.Connect";
Debug.ShouldStop(4194304);
locationservice._fusedlocationprovider1.runVoidMethod ("Connect");
 BA.debugLineNum = 24;BA.debugLine="GeoLocal.lat = \"Null\"";
Debug.ShouldStop(8388608);
locationservice._geolocal.setField ("lat" /*RemoteObject*/ ,BA.ObjectToString("Null"));
 BA.debugLineNum = 25;BA.debugLine="GeoLocal.lon = \"Null\"";
Debug.ShouldStop(16777216);
locationservice._geolocal.setField ("lon" /*RemoteObject*/ ,BA.ObjectToString("Null"));
 };
 BA.debugLineNum = 28;BA.debugLine="If Not(Starter.StopLocationCheck) Then";
Debug.ShouldStop(134217728);
if (locationservice.mostCurrent.__c.runMethod(true,"Not",(Object)(locationservice.mostCurrent._starter._stoplocationcheck /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 29;BA.debugLine="StartServiceAt(Me, DateTime.Now + 10 * 1000, Tru";
Debug.ShouldStop(268435456);
locationservice.mostCurrent.__c.runVoidMethod ("StartServiceAt",locationservice.processBA,(Object)(locationservice.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {locationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(10),RemoteObject.createImmutable(1000)}, "+*",1, 2)),(Object)(locationservice.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 31;BA.debugLine="ShareCode.GlobalEventsTimer = ShareCode.GlobalEv";
Debug.ShouldStop(1073741824);
locationservice.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {locationservice.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/ ,RemoteObject.createImmutable(10)}, "+",1, 1);
 BA.debugLineNum = 33;BA.debugLine="If ShareCode.GlobalEventsTimer >= 1800 Then ' 30";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",locationservice.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/ ,BA.numberCast(double.class, 1800))) { 
 BA.debugLineNum = 34;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(2);
locationservice.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 35;BA.debugLine="CallSub2(MainMenu,\"MainPopMenuLoginChange_Click";
Debug.ShouldStop(4);
locationservice.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",locationservice.processBA,(Object)((locationservice.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("MainPopMenuLoginChange_Click")),(Object)((RemoteObject.createImmutable(""))));
 };
 };
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,43);
if (RapidSub.canDelegate("service_taskremoved")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","service_taskremoved");}
 BA.debugLineNum = 43;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateui(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("UpdateUI (locationservice) ","locationservice",9,locationservice.processBA,locationservice.mostCurrent,100);
if (RapidSub.canDelegate("updateui")) { return xevolution.vrcg.devdemov2400.locationservice.remoteMe.runUserSub(false, "locationservice","updateui", _location1);}
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _lat = RemoteObject.createImmutable("");
RemoteObject _lon = RemoteObject.createImmutable("");
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 100;BA.debugLine="Sub UpdateUI(Location1 As Location)";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="GeoLocal = Types.setGeoDataDT(\"-\", \"-\", \"\")";
Debug.ShouldStop(16);
locationservice._geolocal = locationservice.mostCurrent._types.runMethod(false,"_setgeodatadt" /*RemoteObject*/ ,locationservice.processBA,(Object)(BA.ObjectToString("-")),(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 102;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) Then";
Debug.ShouldStop(32);
if (locationservice.mostCurrent.__c.runMethod(true,"Not",(Object)(locationservice.mostCurrent._starter._app_reset_install /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 103;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(64);
locationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 104;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(128);
locationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 105;BA.debugLine="Dim Data As String  = $\"$date{DateTime.Now} $tim";
Debug.ShouldStop(256);
_data = (RemoteObject.concat(RemoteObject.createImmutable(""),locationservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((locationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(" "),locationservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((locationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));Debug.locals.put("Data", _data);Debug.locals.put("Data", _data);
 BA.debugLineNum = 106;BA.debugLine="Dim lat As String = \"-\"";
Debug.ShouldStop(512);
_lat = BA.ObjectToString("-");Debug.locals.put("lat", _lat);Debug.locals.put("lat", _lat);
 BA.debugLineNum = 107;BA.debugLine="Dim lon As String = \"-\"";
Debug.ShouldStop(1024);
_lon = BA.ObjectToString("-");Debug.locals.put("lon", _lon);Debug.locals.put("lon", _lon);
 BA.debugLineNum = 108;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 109;BA.debugLine="Dim lat As String = $\"${Utils.IfNullOrEmpty(Loc";
Debug.ShouldStop(4096);
_lat = (RemoteObject.concat(RemoteObject.createImmutable(""),locationservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((locationservice.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,locationservice.processBA,(Object)(BA.NumberToString(_location1.runMethod(true,"getLatitude"))),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("")));Debug.locals.put("lat", _lat);Debug.locals.put("lat", _lat);
 BA.debugLineNum = 110;BA.debugLine="Dim lon As String = $\"${Utils.IfNullOrEmpty(Loc";
Debug.ShouldStop(8192);
_lon = (RemoteObject.concat(RemoteObject.createImmutable(""),locationservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((locationservice.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,locationservice.processBA,(Object)(BA.NumberToString(_location1.runMethod(true,"getLongitude"))),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("")));Debug.locals.put("lon", _lon);Debug.locals.put("lon", _lon);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",locationservice.processBA, e12.toString()); BA.debugLineNum = 112;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
locationservice.mostCurrent.__c.runVoidMethod ("LogImpl","659047948",BA.ObjectToString(locationservice.mostCurrent.__c.runMethod(false,"LastException",locationservice.processBA)),0);
 };
 BA.debugLineNum = 114;BA.debugLine="GeoLocal = Types.setGeoDataDT(lat, lon, Data)";
Debug.ShouldStop(131072);
locationservice._geolocal = locationservice.mostCurrent._types.runMethod(false,"_setgeodatadt" /*RemoteObject*/ ,locationservice.processBA,(Object)(_lat),(Object)(_lon),(Object)(_data));
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}