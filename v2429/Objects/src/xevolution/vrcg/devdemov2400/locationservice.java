package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class locationservice extends  android.app.Service{
	public static class locationservice_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (locationservice) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, locationservice.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static locationservice mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return locationservice.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.locationservice");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.locationservice", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (locationservice) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (locationservice) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (locationservice) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (locationservice) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (locationservice) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper _fusedlocationprovider1 = null;
public static anywheresoftware.b4a.gps.LocationWrapper _lastlocation = null;
public static xevolution.vrcg.devdemov2400.types._geodata _geolocal = null;
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
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="End Sub";
return false;
}
public static String  _fusedlocationprovider1_connectionfailed(int _connectionresult1) throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "fusedlocationprovider1_connectionfailed", false))
	 {return ((String) Debug.delegate(processBA, "fusedlocationprovider1_connectionfailed", new Object[] {_connectionresult1}));}
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Sub FusedLocationProvider1_ConnectionFailed(Connec";
RDebugUtils.currentLine=58785793;
 //BA.debugLineNum = 58785793;BA.debugLine="Select ConnectionResult1";
switch (BA.switchObjectToInt(_connectionresult1,_fusedlocationprovider1.ConnectionResult.NETWORK_ERROR)) {
case 0: {
RDebugUtils.currentLine=58785795;
 //BA.debugLineNum = 58785795;BA.debugLine="FusedLocationProvider1.Connect";
_fusedlocationprovider1.Connect();
 break; }
default: {
 break; }
}
;
RDebugUtils.currentLine=58785799;
 //BA.debugLineNum = 58785799;BA.debugLine="End Sub";
return "";
}
public static String  _fusedlocationprovider1_connectionsuccess() throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "fusedlocationprovider1_connectionsuccess", false))
	 {return ((String) Debug.delegate(processBA, "fusedlocationprovider1_connectionsuccess", null));}
uk.co.martinpearman.b4a.fusedlocationprovider.LocationRequest _locationrequest1 = null;
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Sub FusedLocationProvider1_ConnectionSuccess";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_reset_install /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_in_execution /*boolean*/ )) { 
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="Dim LocationRequest1 As LocationRequest";
_locationrequest1 = new uk.co.martinpearman.b4a.fusedlocationprovider.LocationRequest();
RDebugUtils.currentLine=58851331;
 //BA.debugLineNum = 58851331;BA.debugLine="LocationRequest1.Initialize";
_locationrequest1.Initialize();
RDebugUtils.currentLine=58851332;
 //BA.debugLineNum = 58851332;BA.debugLine="LocationRequest1.SetInterval(30000)	'	1000 milli";
_locationrequest1.SetInterval((long) (30000));
RDebugUtils.currentLine=58851333;
 //BA.debugLineNum = 58851333;BA.debugLine="LocationRequest1.SetPriority(LocationRequest1.Pr";
_locationrequest1.SetPriority(_locationrequest1.Priority.PRIORITY_HIGH_ACCURACY);
RDebugUtils.currentLine=58851334;
 //BA.debugLineNum = 58851334;BA.debugLine="LocationRequest1.SetSmallestDisplacement(1)	'	1";
_locationrequest1.SetSmallestDisplacement((float) (1));
RDebugUtils.currentLine=58851335;
 //BA.debugLineNum = 58851335;BA.debugLine="Try";
try {RDebugUtils.currentLine=58851336;
 //BA.debugLineNum = 58851336;BA.debugLine="FusedLocationProvider1.RequestLocationUpdates(L";
_fusedlocationprovider1.RequestLocationUpdates((com.google.android.gms.location.LocationRequest)(_locationrequest1.getObject()));
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=58851338;
 //BA.debugLineNum = 58851338;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("658851338",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
 };
RDebugUtils.currentLine=58851341;
 //BA.debugLineNum = 58851341;BA.debugLine="End Sub";
return "";
}
public static String  _fusedlocationprovider1_connectionsuspended(int _suspendedcause1) throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "fusedlocationprovider1_connectionsuspended", false))
	 {return ((String) Debug.delegate(processBA, "fusedlocationprovider1_connectionsuspended", new Object[] {_suspendedcause1}));}
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Sub FusedLocationProvider1_ConnectionSuspended(Sus";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="Select SuspendedCause1";
switch (BA.switchObjectToInt(_suspendedcause1,_fusedlocationprovider1.SuspendedCause.CAUSE_NETWORK_LOST,_fusedlocationprovider1.SuspendedCause.CAUSE_SERVICE_DISCONNECTED)) {
case 0: {
 break; }
case 1: {
 break; }
}
;
RDebugUtils.currentLine=58916871;
 //BA.debugLineNum = 58916871;BA.debugLine="End Sub";
return "";
}
public static String  _fusedlocationprovider1_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "fusedlocationprovider1_locationchanged", false))
	 {return ((String) Debug.delegate(processBA, "fusedlocationprovider1_locationchanged", new Object[] {_location1}));}
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Sub FusedLocationProvider1_LocationChanged(Locatio";
RDebugUtils.currentLine=58982402;
 //BA.debugLineNum = 58982402;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_reset_install /*boolean*/ )) { 
RDebugUtils.currentLine=58982403;
 //BA.debugLineNum = 58982403;BA.debugLine="If (Utils.NNE(Location1.Latitude) And Utils.NNE(";
if ((mostCurrent._utils._nne /*boolean*/ (processBA,BA.NumberToString(_location1.getLatitude())) && mostCurrent._utils._nne /*boolean*/ (processBA,BA.NumberToString(_location1.getLongitude())))) { 
RDebugUtils.currentLine=58982404;
 //BA.debugLineNum = 58982404;BA.debugLine="LastLocation=Location1";
_lastlocation = _location1;
 };
RDebugUtils.currentLine=58982406;
 //BA.debugLineNum = 58982406;BA.debugLine="UpdateUI(Location1)";
_updateui(_location1);
 };
RDebugUtils.currentLine=58982408;
 //BA.debugLineNum = 58982408;BA.debugLine="End Sub";
return "";
}
public static String  _updateui(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "updateui", false))
	 {return ((String) Debug.delegate(processBA, "updateui", new Object[] {_location1}));}
String _data = "";
String _lat = "";
String _lon = "";
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="Sub UpdateUI(Location1 As Location)";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="GeoLocal = Types.setGeoDataDT(\"-\", \"-\", \"\")";
_geolocal = mostCurrent._types._setgeodatadt /*xevolution.vrcg.devdemov2400.types._geodata*/ (processBA,"-","-","");
RDebugUtils.currentLine=59047938;
 //BA.debugLineNum = 59047938;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_reset_install /*boolean*/ )) { 
RDebugUtils.currentLine=59047939;
 //BA.debugLineNum = 59047939;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=59047940;
 //BA.debugLineNum = 59047940;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=59047941;
 //BA.debugLineNum = 59047941;BA.debugLine="Dim Data As String  = $\"$date{DateTime.Now} $tim";
_data = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=59047942;
 //BA.debugLineNum = 59047942;BA.debugLine="Dim lat As String = \"-\"";
_lat = "-";
RDebugUtils.currentLine=59047943;
 //BA.debugLineNum = 59047943;BA.debugLine="Dim lon As String = \"-\"";
_lon = "-";
RDebugUtils.currentLine=59047944;
 //BA.debugLineNum = 59047944;BA.debugLine="Try";
try {RDebugUtils.currentLine=59047945;
 //BA.debugLineNum = 59047945;BA.debugLine="Dim lat As String = $\"${Utils.IfNullOrEmpty(Loc";
_lat = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._ifnullorempty /*String*/ (processBA,BA.NumberToString(_location1.getLatitude()),"")))+"");
RDebugUtils.currentLine=59047946;
 //BA.debugLineNum = 59047946;BA.debugLine="Dim lon As String = $\"${Utils.IfNullOrEmpty(Loc";
_lon = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._ifnullorempty /*String*/ (processBA,BA.NumberToString(_location1.getLongitude()),"")))+"");
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=59047948;
 //BA.debugLineNum = 59047948;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("659047948",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=59047950;
 //BA.debugLineNum = 59047950;BA.debugLine="GeoLocal = Types.setGeoDataDT(lat, lon, Data)";
_geolocal = mostCurrent._types._setgeodatadt /*xevolution.vrcg.devdemov2400.types._geodata*/ (processBA,_lat,_lon,_data);
 };
RDebugUtils.currentLine=59047952;
 //BA.debugLineNum = 59047952;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="FusedLocationProvider1.Disconnect";
_fusedlocationprovider1.Disconnect();
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="Service.StopAutomaticForeground";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=58720259;
 //BA.debugLineNum = 58720259;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="FusedLocationProvider1.Initialize(\"FusedLocationP";
_fusedlocationprovider1.Initialize(processBA,"FusedLocationProvider1");
RDebugUtils.currentLine=58523651;
 //BA.debugLineNum = 58523651;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_reset_install /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_in_execution /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._runupdate /*boolean*/ )) { 
RDebugUtils.currentLine=58523652;
 //BA.debugLineNum = 58523652;BA.debugLine="FusedLocationProvider1.Connect";
_fusedlocationprovider1.Connect();
RDebugUtils.currentLine=58523653;
 //BA.debugLineNum = 58523653;BA.debugLine="GeoLocal.lat = \"Null\"";
_geolocal.lat /*String*/  = "Null";
RDebugUtils.currentLine=58523654;
 //BA.debugLineNum = 58523654;BA.debugLine="GeoLocal.lon = \"Null\"";
_geolocal.lon /*String*/  = "Null";
 };
RDebugUtils.currentLine=58523657;
 //BA.debugLineNum = 58523657;BA.debugLine="If Not(Starter.StopLocationCheck) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._stoplocationcheck /*boolean*/ )) { 
RDebugUtils.currentLine=58523658;
 //BA.debugLineNum = 58523658;BA.debugLine="StartServiceAt(Me, DateTime.Now + 10 * 1000, Tru";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,locationservice.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+10*1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=58523660;
 //BA.debugLineNum = 58523660;BA.debugLine="ShareCode.GlobalEventsTimer = ShareCode.GlobalEv";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (mostCurrent._sharecode._globaleventstimer /*int*/ +10);
RDebugUtils.currentLine=58523662;
 //BA.debugLineNum = 58523662;BA.debugLine="If ShareCode.GlobalEventsTimer >= 1800 Then ' 30";
if (mostCurrent._sharecode._globaleventstimer /*int*/ >=1800) { 
RDebugUtils.currentLine=58523663;
 //BA.debugLineNum = 58523663;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=58523664;
 //BA.debugLineNum = 58523664;BA.debugLine="CallSub2(MainMenu,\"MainPopMenuLoginChange_Click";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"MainPopMenuLoginChange_Click",(Object)(""));
 };
 };
RDebugUtils.currentLine=58523670;
 //BA.debugLineNum = 58523670;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="locationservice";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="End Sub";
return "";
}
}