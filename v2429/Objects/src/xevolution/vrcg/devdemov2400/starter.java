package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends  android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.starter");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
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
                    BA.LogInfo("** Service (starter) Create **");
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
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
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
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
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
public static anywheresoftware.b4a.phone.PhoneEvents _pe = null;
public static anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
public static Object _currentworkactivity = null;
public static int _currentflowposition = 0;
public static boolean _webisok = false;
public static anywheresoftware.b4a.sql.SQL _localsql = null;
public static anywheresoftware.b4a.sql.SQL _localsqlevc = null;
public static anywheresoftware.b4a.sql.SQL _localsqlwrk = null;
public static boolean _makinglogin = false;
public static boolean _firstinstall = false;
public static boolean _runupdate = false;
public static anywheresoftware.b4a.gps.GPS _gpsdevice = null;
public static xevolution.vrcg.devdemov2400.tinifile _appstate = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static xevolution.vrcg.devdemov2400.configparameters _params = null;
public static xevolution.vrcg.devdemov2400.fileprovider _provider = null;
public static adr.stringfunctions.stringfunctions _strfunc = null;
public static String _localsessioncode = "";
public static String _sharedfolder = "";
public static String _safedefaultexternal = "";
public static String _internalfolder = "";
public static String _assetsfolder = "";
public static wifi.MLwifi _wifi = null;
public static boolean _entitykeepfilter = false;
public static String _entitysearchfilter = "";
public static xevolution.vrcg.devdemov2400.types._entityfilter _entityfilter = null;
public static int _requestfavorites = 0;
public static boolean _requestkeepfilter = false;
public static String _requestsearchfilter = "";
public static xevolution.vrcg.devdemov2400.types._requestfilter _requestfilters = null;
public static boolean _taskkeepfilter = false;
public static String _tasksearchfilter = "";
public static xevolution.vrcg.devdemov2400.types._taskfilter _taskfilters = null;
public static boolean _objectkeepfilter = false;
public static boolean _objectfiltered = false;
public static String _objectsearchfilter = "";
public static xevolution.vrcg.devdemov2400.types._objectfilter _objectfilter = null;
public static int _notifyusercount = 0;
public static int _notifyrequestcount = 0;
public static int _notifyactioncount = 0;
public static xevolution.vrcg.devdemov2400.types._deviceinformation _devinfo = null;
public static int _keepcolormain = 0;
public static int _keepcolorsub = 0;
public static xevolution.vrcg.devdemov2400.types._composedbuttondefs _cpbuttons = null;
public static xevolution.vrcg.devdemov2400.types._composedbuttondefs _cpbuttonsoff = null;
public static boolean _app_fine_location_access = false;
public static boolean _app_camera_access = false;
public static boolean _app_reset_install = false;
public static boolean _app_in_execution = false;
public static boolean _app_install_apk = false;
public static boolean _app_send_sms = false;
public static boolean _stoplocationcheck = false;
public static boolean _stopcommscheck = false;
public static boolean _calledfromsyncbutton = false;
public static xevolution.vrcg.devdemov2400.api _apicall = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.encoding _encoding = null;
public b4a.example.esc_pos _esc_pos = null;
public xevolution.vrcg.devdemov2400.main _main = null;
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
public static void  _checkwebaccess() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "checkwebaccess", false))
	 {Debug.delegate(processBA, "checkwebaccess", null); return;}
ResumableSub_CheckWebAccess rsub = new ResumableSub_CheckWebAccess(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CheckWebAccess extends BA.ResumableSub {
public ResumableSub_CheckWebAccess(xevolution.vrcg.devdemov2400.starter parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.starter parent;
long _starttime = 0L;
String _serveraddress = "";
anywheresoftware.b4a.objects.collections.Map _prams = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finished = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="starter";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim startTime As Long = Utils.GetCurrentTicks";
_starttime = (long)(Double.parseDouble(parent.mostCurrent._utils._getcurrentticks /*String*/ (processBA)));
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/timming");
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Dim Prams As Map";
_prams = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Prams.Initialize";
_prams.Initialize();
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Prams.Put(\"_first\", Utils.Bool2Int(FirstInstall))";
_prams.Put((Object)("_first"),(Object)(parent.mostCurrent._utils._bool2int /*int*/ (processBA,parent._firstinstall)));
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Prams.Put(\"authorization\", ShareCode.APP_Authoriz";
_prams.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Prams.Put(\"_token\", ShareCode.APP_TOKEN)";
_prams.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Log (ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("61835016",_serveraddress,0);
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Log(ShareCode.APP_Authorization)";
anywheresoftware.b4a.keywords.Common.LogImpl("61835017",parent.mostCurrent._sharecode._app_authorization /*String*/ ,0);
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Log(ShareCode.APP_TOKEN)";
anywheresoftware.b4a.keywords.Common.LogImpl("61835018",parent.mostCurrent._sharecode._app_token /*String*/ ,0);
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="JSON.Initialize(Prams)";
_json.Initialize(_prams);
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="WEBISOK = False";
parent._webisok = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="Dim res  As ResumableSub = TestTheServer(ServerAd";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _testtheserver(_serveraddress,_data);
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="Wait For(res) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "starter", "checkwebaccess"), _res);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="If finished Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_finished) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="WEBISOK = True";
parent._webisok = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="WEBISOK = False";
parent._webisok = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1835032;
 //BA.debugLineNum = 1835032;BA.debugLine="Log(\"Erro de identificação do servidor\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61835032","Erro de identificação do servidor",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835034;
 //BA.debugLineNum = 1835034;BA.debugLine="ShareCode.APP_WORKING_LOCAL = Not(WEBISOK)";
parent.mostCurrent._sharecode._app_working_local /*boolean*/  = anywheresoftware.b4a.keywords.Common.Not(parent._webisok);
RDebugUtils.currentLine=1835036;
 //BA.debugLineNum = 1835036;BA.debugLine="Log($\"APP_WORKING_LOCAL: ${Utils.Bool2Int(ShareCo";
anywheresoftware.b4a.keywords.Common.LogImpl("61835036",("APP_WORKING_LOCAL: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._bool2int /*int*/ (processBA,parent.mostCurrent._sharecode._app_working_local /*boolean*/ )))+""),0);
RDebugUtils.currentLine=1835038;
 //BA.debugLineNum = 1835038;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _testtheserver(String _serveraddress,String _data) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "testtheserver", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "testtheserver", new Object[] {_serveraddress,_data}));}
ResumableSub_TestTheServer rsub = new ResumableSub_TestTheServer(null,_serveraddress,_data);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TestTheServer extends BA.ResumableSub {
public ResumableSub_TestTheServer(xevolution.vrcg.devdemov2400.starter parent,String _serveraddress,String _data) {
this.parent = parent;
this._serveraddress = _serveraddress;
this._data = _data;
}
xevolution.vrcg.devdemov2400.starter parent;
String _serveraddress;
String _data;
int _status = 0;
xevolution.vrcg.devdemov2400.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="starter";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim Status As Int = 0";
_status = (int) (0);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",starter.getObject());
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "starter", "testtheserver"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="If Job.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_job._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
_status = parent.mostCurrent._utils._jobapistatus /*int*/ (processBA,_job);
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Log(Status)";
anywheresoftware.b4a.keywords.Common.LogImpl("61900554",BA.NumberToString(_status),0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("61900556",_job._getstring /*String*/ (null),0);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("61900560",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="Return (Status >= 1)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((_status>=1)));return;};
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _clear_loc_userssession_table() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "clear_loc_userssession_table", false))
	 {return ((String) Debug.delegate(processBA, "clear_loc_userssession_table", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Clear_loc_userssession_Table";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If (LocalSQLWRK.IsInitialized) Then";
if ((_localsqlwrk.IsInitialized())) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Try";
try {RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="DBUtils.ClearTable(LocalSQLWRK, \"loc_userssessi";
mostCurrent._dbutils._cleartable /*String*/ (processBA,_localsqlwrk,"loc_userssession");
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("61638405",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
 };
 };
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="End Sub";
return "";
}
public static String  _copyandinitializeappstate() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "copyandinitializeappstate", false))
	 {return ((String) Debug.delegate(processBA, "copyandinitializeappstate", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub CopyAndInitializeAppState";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If Not(File.Exists(InternalFolder, \"AppState.set\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_internalfolder,"AppState.set"))) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="File.Copy(File.DirAssets, \"AppState.set\", Intern";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"AppState.set",_internalfolder,"AppState.set");
 };
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="If Not(AppState.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_appstate.IsInitialized /*boolean*/ ())) { 
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="AppState.Initialize(InternalFolder, \"AppState.se";
_appstate._initialize /*String*/ (null,processBA,_internalfolder,"AppState.set");
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="AppState.SetAutoFlush(True)";
_appstate._setautoflush /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="End Sub";
return "";
}
public static String  _copyandinitializedatabases() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "copyandinitializedatabases", false))
	 {return ((String) Debug.delegate(processBA, "copyandinitializedatabases", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub CopyAndInitializeDatabases";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="If Not(File.Exists(SharedFolder, \"orion.db\")) The";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"orion.db"))) { 
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="File.Copy(File.DirAssets, \"orion.db\", SharedFold";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"orion.db",_sharedfolder,"orion.db");
 };
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="If Not(File.Exists(SharedFolder, \"evolutioncheck.";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"evolutioncheck.db3"))) { 
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\",";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"evolutioncheck.db3",_sharedfolder,"evolutioncheck.db3");
 };
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="If Not(File.Exists(SharedFolder, \"worker.db\")) Th";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"worker.db"))) { 
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="File.Copy(File.DirAssets, \"worker.db\", SharedFol";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"worker.db",_sharedfolder,"worker.db");
 };
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="If Not(LocalSQL.IsInitialized) Then LocalSQL.Init";
if (anywheresoftware.b4a.keywords.Common.Not(_localsql.IsInitialized())) { 
_localsql.Initialize(_sharedfolder,"orion.db",anywheresoftware.b4a.keywords.Common.True);};
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="If Not(LocalSQLEVC.IsInitialized) Then LocalSQLEV";
if (anywheresoftware.b4a.keywords.Common.Not(_localsqlevc.IsInitialized())) { 
_localsqlevc.Initialize(_sharedfolder,"evolutioncheck.db3",anywheresoftware.b4a.keywords.Common.True);};
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="If Not(LocalSQLWRK.IsInitialized) Then LocalSQLWR";
if (anywheresoftware.b4a.keywords.Common.Not(_localsqlwrk.IsInitialized())) { 
_localsqlwrk.Initialize(_sharedfolder,"worker.db",anywheresoftware.b4a.keywords.Common.True);};
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="End Sub";
return "";
}
public static String  _copyfiles() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "copyfiles", false))
	 {return ((String) Debug.delegate(processBA, "copyfiles", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub CopyFiles";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="If Not(File.Exists(SharedFolder, \"template1.html\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template1.html"))) { 
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="File.Copy(File.DirAssets, \"template1.html\", Shar";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template1.html",_sharedfolder,"template1.html");
 };
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="If Not(File.Exists(SharedFolder, \"template_edp.ht";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template_edp.html"))) { 
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="File.Copy(File.DirAssets, \"template_edp.html\", S";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template_edp.html",_sharedfolder,"template_edp.html");
 };
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="If Not(File.Exists(SharedFolder, \"template20.html";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template20.html"))) { 
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="File.Copy(File.DirAssets, \"template20.html\", Sha";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template20.html",_sharedfolder,"template20.html");
 };
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="If Not(File.Exists(SharedFolder, \"template2.html\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template2.html"))) { 
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="File.Copy(File.DirAssets, \"template2.html\", Shar";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template2.html",_sharedfolder,"template2.html");
 };
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="If Not(File.Exists(SharedFolder, \"template3.html\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template3.html"))) { 
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="File.Copy(File.DirAssets, \"template3.html\", Shar";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template3.html",_sharedfolder,"template3.html");
 };
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="If Not(File.Exists(SharedFolder, \"template4.html\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template4.html"))) { 
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="File.Copy(File.DirAssets, \"template4.html\", Shar";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template4.html",_sharedfolder,"template4.html");
 };
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="If Not(File.Exists(SharedFolder, \"template5A.html";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template5A.html"))) { 
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="File.Copy(File.DirAssets, \"template5A.html\", Sha";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template5A.html",_sharedfolder,"template5A.html");
 };
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="If Not(File.Exists(SharedFolder, \"template5.html\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template5.html"))) { 
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="File.Copy(File.DirAssets, \"template5.html\", Shar";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template5.html",_sharedfolder,"template5.html");
 };
RDebugUtils.currentLine=655393;
 //BA.debugLineNum = 655393;BA.debugLine="If Not(File.Exists(SharedFolder, \"template6.html\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template6.html"))) { 
RDebugUtils.currentLine=655394;
 //BA.debugLineNum = 655394;BA.debugLine="File.Copy(File.DirAssets, \"template6.html\", Shar";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template6.html",_sharedfolder,"template6.html");
 };
RDebugUtils.currentLine=655397;
 //BA.debugLineNum = 655397;BA.debugLine="If Not(File.Exists(SharedFolder, \"template7.html\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template7.html"))) { 
RDebugUtils.currentLine=655398;
 //BA.debugLineNum = 655398;BA.debugLine="File.Copy(File.DirAssets, \"template7.html\", Shar";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template7.html",_sharedfolder,"template7.html");
 };
RDebugUtils.currentLine=655401;
 //BA.debugLineNum = 655401;BA.debugLine="If Not(File.Exists(SharedFolder, \"template6A.html";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template6A.html"))) { 
RDebugUtils.currentLine=655402;
 //BA.debugLineNum = 655402;BA.debugLine="File.Copy(File.DirAssets, \"template6A.html\", Sha";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template6A.html",_sharedfolder,"template6A.html");
 };
RDebugUtils.currentLine=655405;
 //BA.debugLineNum = 655405;BA.debugLine="If Not(File.Exists(SharedFolder, \"template7A.html";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template7A.html"))) { 
RDebugUtils.currentLine=655406;
 //BA.debugLineNum = 655406;BA.debugLine="File.Copy(File.DirAssets, \"template7A.html\", Sha";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template7A.html",_sharedfolder,"template7A.html");
 };
RDebugUtils.currentLine=655409;
 //BA.debugLineNum = 655409;BA.debugLine="If Not(File.Exists(SharedFolder, \"template9.html\"";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template9.html"))) { 
RDebugUtils.currentLine=655410;
 //BA.debugLineNum = 655410;BA.debugLine="File.Copy(File.DirAssets, \"template9.html\", Shar";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template9.html",_sharedfolder,"template9.html");
 };
RDebugUtils.currentLine=655413;
 //BA.debugLineNum = 655413;BA.debugLine="If Not(File.Exists(SharedFolder, \"template10.html";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template10.html"))) { 
RDebugUtils.currentLine=655414;
 //BA.debugLineNum = 655414;BA.debugLine="File.Copy(File.DirAssets, \"template10.html\", Sha";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template10.html",_sharedfolder,"template10.html");
 };
RDebugUtils.currentLine=655417;
 //BA.debugLineNum = 655417;BA.debugLine="If Not(File.Exists(SharedFolder, \"template12.html";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template12.html"))) { 
RDebugUtils.currentLine=655418;
 //BA.debugLineNum = 655418;BA.debugLine="File.Copy(File.DirAssets, \"template12.html\", Sha";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template12.html",_sharedfolder,"template12.html");
 };
RDebugUtils.currentLine=655421;
 //BA.debugLineNum = 655421;BA.debugLine="If Not(File.Exists(SharedFolder, \"template12heade";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template12header.html"))) { 
RDebugUtils.currentLine=655422;
 //BA.debugLineNum = 655422;BA.debugLine="File.Copy(File.DirAssets, \"template12header.html";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template12header.html",_sharedfolder,"template12header.html");
 };
RDebugUtils.currentLine=655425;
 //BA.debugLineNum = 655425;BA.debugLine="If Not(File.Exists(SharedFolder, \"template12foote";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template12footer.html"))) { 
RDebugUtils.currentLine=655426;
 //BA.debugLineNum = 655426;BA.debugLine="File.Copy(File.DirAssets, \"template12footer.html";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template12footer.html",_sharedfolder,"template12footer.html");
 };
RDebugUtils.currentLine=655429;
 //BA.debugLineNum = 655429;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_header.htm";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_header.html"))) { 
RDebugUtils.currentLine=655430;
 //BA.debugLineNum = 655430;BA.debugLine="File.Copy(File.DirAssets, \"page_header.html\", Sh";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_header.html",_sharedfolder,"page_header.html");
 };
RDebugUtils.currentLine=655433;
 //BA.debugLineNum = 655433;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_footer.htm";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_footer.html"))) { 
RDebugUtils.currentLine=655434;
 //BA.debugLineNum = 655434;BA.debugLine="File.Copy(File.DirAssets, \"page_footer.html\", Sh";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_footer.html",_sharedfolder,"page_footer.html");
 };
RDebugUtils.currentLine=655437;
 //BA.debugLineNum = 655437;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_content.ht";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_content.html"))) { 
RDebugUtils.currentLine=655438;
 //BA.debugLineNum = 655438;BA.debugLine="File.Copy(File.DirAssets, \"page_content.html\", S";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_content.html",_sharedfolder,"page_content.html");
 };
RDebugUtils.currentLine=655441;
 //BA.debugLineNum = 655441;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_identifica";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_identification_first.html"))) { 
RDebugUtils.currentLine=655442;
 //BA.debugLineNum = 655442;BA.debugLine="File.Copy(File.DirAssets, \"page_identification_f";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_identification_first.html",_sharedfolder,"page_identification_first.html");
 };
RDebugUtils.currentLine=655445;
 //BA.debugLineNum = 655445;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_identifica";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_identification_first_score.html"))) { 
RDebugUtils.currentLine=655446;
 //BA.debugLineNum = 655446;BA.debugLine="File.Copy(File.DirAssets, \"page_identification_f";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_identification_first_score.html",_sharedfolder,"page_identification_first_score.html");
 };
RDebugUtils.currentLine=655449;
 //BA.debugLineNum = 655449;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_identifica";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_identification_next.html"))) { 
RDebugUtils.currentLine=655450;
 //BA.debugLineNum = 655450;BA.debugLine="File.Copy(File.DirAssets, \"page_identification_n";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_identification_next.html",_sharedfolder,"page_identification_next.html");
 };
RDebugUtils.currentLine=655453;
 //BA.debugLineNum = 655453;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_identifica";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_identification_last.html"))) { 
RDebugUtils.currentLine=655454;
 //BA.debugLineNum = 655454;BA.debugLine="File.Copy(File.DirAssets, \"page_identification_l";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_identification_last.html",_sharedfolder,"page_identification_last.html");
 };
RDebugUtils.currentLine=655457;
 //BA.debugLineNum = 655457;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_content_im";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_content_images.html"))) { 
RDebugUtils.currentLine=655458;
 //BA.debugLineNum = 655458;BA.debugLine="File.Copy(File.DirAssets, \"page_content_images.h";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_content_images.html",_sharedfolder,"page_content_images.html");
 };
RDebugUtils.currentLine=655460;
 //BA.debugLineNum = 655460;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_content_no";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_content_nonconformities.html"))) { 
RDebugUtils.currentLine=655461;
 //BA.debugLineNum = 655461;BA.debugLine="File.Copy(File.DirAssets, \"page_content_nonconfo";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_content_nonconformities.html",_sharedfolder,"page_content_nonconformities.html");
 };
RDebugUtils.currentLine=655464;
 //BA.debugLineNum = 655464;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_content_ob";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_content_observations.html"))) { 
RDebugUtils.currentLine=655465;
 //BA.debugLineNum = 655465;BA.debugLine="File.Copy(File.DirAssets, \"page_content_observat";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_content_observations.html",_sharedfolder,"page_content_observations.html");
 };
RDebugUtils.currentLine=655468;
 //BA.debugLineNum = 655468;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_signature.";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_signature.html"))) { 
RDebugUtils.currentLine=655469;
 //BA.debugLineNum = 655469;BA.debugLine="File.Copy(File.DirAssets, \"page_signature.html\",";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_signature.html",_sharedfolder,"page_signature.html");
 };
RDebugUtils.currentLine=655472;
 //BA.debugLineNum = 655472;BA.debugLine="If Not(File.Exists(SharedFolder, \"template20_VSto";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template20_VStorage.html"))) { 
RDebugUtils.currentLine=655473;
 //BA.debugLineNum = 655473;BA.debugLine="File.Copy(File.DirAssets, \"template20_VStorage.h";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template20_VStorage.html",_sharedfolder,"template20_VStorage.html");
 };
RDebugUtils.currentLine=655476;
 //BA.debugLineNum = 655476;BA.debugLine="If Not(File.Exists(SharedFolder, \"template20_VCam";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template20_VCampervans.html"))) { 
RDebugUtils.currentLine=655477;
 //BA.debugLineNum = 655477;BA.debugLine="File.Copy(File.DirAssets, \"template20_VCampervan";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template20_VCampervans.html",_sharedfolder,"template20_VCampervans.html");
 };
RDebugUtils.currentLine=655480;
 //BA.debugLineNum = 655480;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_id_resopre";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_id_resopre_first.html"))) { 
RDebugUtils.currentLine=655481;
 //BA.debugLineNum = 655481;BA.debugLine="File.Copy(File.DirAssets, \"page_id_resopre_first";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_id_resopre_first.html",_sharedfolder,"page_id_resopre_first.html");
 };
RDebugUtils.currentLine=655484;
 //BA.debugLineNum = 655484;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_resopre_fo";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_resopre_footer.html"))) { 
RDebugUtils.currentLine=655485;
 //BA.debugLineNum = 655485;BA.debugLine="File.Copy(File.DirAssets, \"page_resopre_footer.h";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_resopre_footer.html",_sharedfolder,"page_resopre_footer.html");
 };
RDebugUtils.currentLine=655488;
 //BA.debugLineNum = 655488;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_resopre_he";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_resopre_header.html"))) { 
RDebugUtils.currentLine=655489;
 //BA.debugLineNum = 655489;BA.debugLine="File.Copy(File.DirAssets, \"page_resopre_header.h";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"page_resopre_header.html",_sharedfolder,"page_resopre_header.html");
 };
RDebugUtils.currentLine=655492;
 //BA.debugLineNum = 655492;BA.debugLine="If Not(File.Exists(SharedFolder, \"template_resopr";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template_resopre_group.html"))) { 
RDebugUtils.currentLine=655493;
 //BA.debugLineNum = 655493;BA.debugLine="File.Copy(File.DirAssets, \"template_resopre_grou";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template_resopre_group.html",_sharedfolder,"template_resopre_group.html");
 };
RDebugUtils.currentLine=655496;
 //BA.debugLineNum = 655496;BA.debugLine="If Not(File.Exists(SharedFolder, \"acail_distribui";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"acail_distribuicao_epis.html"))) { 
RDebugUtils.currentLine=655497;
 //BA.debugLineNum = 655497;BA.debugLine="File.Copy(File.DirAssets, \"acail_distribuicao_ep";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"acail_distribuicao_epis.html",_sharedfolder,"acail_distribuicao_epis.html");
 };
RDebugUtils.currentLine=655500;
 //BA.debugLineNum = 655500;BA.debugLine="If Not(File.Exists(SharedFolder, \"acail_reg_despe";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"acail_reg_despesa.html"))) { 
RDebugUtils.currentLine=655501;
 //BA.debugLineNum = 655501;BA.debugLine="File.Copy(File.DirAssets, \"acail_reg_despesa.htm";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"acail_reg_despesa.html",_sharedfolder,"acail_reg_despesa.html");
 };
RDebugUtils.currentLine=655504;
 //BA.debugLineNum = 655504;BA.debugLine="If Not(File.Exists(SharedFolder, \"template_limper";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template_limpersado_guia.html"))) { 
RDebugUtils.currentLine=655505;
 //BA.debugLineNum = 655505;BA.debugLine="File.Copy(File.DirAssets, \"template_limpersado_g";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"template_limpersado_guia.html",_sharedfolder,"template_limpersado_guia.html");
 };
RDebugUtils.currentLine=655508;
 //BA.debugLineNum = 655508;BA.debugLine="If Not(File.Exists(InternalFolder, \"CROQUI.png\"))";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_internalfolder,"CROQUI.png"))) { 
RDebugUtils.currentLine=655509;
 //BA.debugLineNum = 655509;BA.debugLine="File.Copy(File.DirAssets, \"CROQUI.png\", Internal";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"CROQUI.png",_internalfolder,"CROQUI.png");
 };
RDebugUtils.currentLine=655512;
 //BA.debugLineNum = 655512;BA.debugLine="If Not(File.Exists(InternalFolder, \"logo_monocrom";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_internalfolder,"logo_monocromatico.png"))) { 
RDebugUtils.currentLine=655513;
 //BA.debugLineNum = 655513;BA.debugLine="File.Copy(File.DirAssets, \"logo_monocromatico.pn";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"logo_monocromatico.png",_internalfolder,"logo_monocromatico.png");
 };
RDebugUtils.currentLine=655516;
 //BA.debugLineNum = 655516;BA.debugLine="If Not(File.Exists(InternalFolder, \"logo_monocrom";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_internalfolder,"logo_monocromatico_mono.png"))) { 
RDebugUtils.currentLine=655517;
 //BA.debugLineNum = 655517;BA.debugLine="File.Copy(File.DirAssets, \"logo_monocromatico_mo";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"logo_monocromatico_mono.png",_internalfolder,"logo_monocromatico_mono.png");
 };
RDebugUtils.currentLine=655519;
 //BA.debugLineNum = 655519;BA.debugLine="End Sub";
return "";
}
public static String  _create_dbchanges_table() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "create_dbchanges_table", false))
	 {return ((String) Debug.delegate(processBA, "create_dbchanges_table", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Create_dbchanges_Table";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If Not(DBUtils.TableExists(LocalSQLWRK, \"dbchange";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._dbutils._tableexists /*boolean*/ (processBA,_localsqlwrk,"dbchanges"))) { 
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="LocalSQLWRK.ExecNonQuery($\"CREATE TABLE `dbchang";
_localsqlwrk.ExecNonQuery(("CREATE TABLE `dbchanges` (\n"+"						`id` INT(10) NOT NULL,\n"+"						`app_version` VARCHAR(50) NOT NULL DEFAULT 'VERSION_',\n"+"						`tablename` VARCHAR(50) NOT NULL DEFAULT '',\n"+"						`datechange` DATE NULL DEFAULT NULL,\n"+"						`script` TEXT NULL DEFAULT NULL,\n"+"						`titlenotes` VARCHAR(100) NULL DEFAULT '',\n"+"						`created_at` TIMESTAMP NULL DEFAULT NULL,\n"+"						`updated_at` TIMESTAMP NULL DEFAULT NULL,\n"+"						`active` TINYINT(4) NOT NULL DEFAULT '1',\n"+"						`updated` TINYINT(4) NOT NULL DEFAULT '0',\n"+"						`dateupdate` DATE NULL DEFAULT NULL,\n"+"						PRIMARY KEY (`id`, `app_version`, `tablename`) \n"+"					);"));
 };
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="End Sub";
return "";
}
public static String  _createcpbuttons() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "createcpbuttons", false))
	 {return ((String) Debug.delegate(processBA, "createcpbuttons", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub CreateCPButtons";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="CPButtons = Types.MakeComposedButtonDefs(Consts.W";
_cpbuttons = mostCurrent._types._makecomposedbuttondefs /*xevolution.vrcg.devdemov2400.types._composedbuttondefs*/ (processBA,mostCurrent._consts._whitesoftdusk /*int*/ ,mostCurrent._consts._darkgray /*int*/ ,mostCurrent._consts._blacknoalpha /*int*/ ,mostCurrent._consts._whitesoftdusk /*int*/ ,_keepcolormain,_keepcolorsub,mostCurrent._consts._colormain /*int*/ ,(int) (1),(int) (5));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="CPButtonsOFF = Types.MakeComposedButtonDefs(Const";
_cpbuttonsoff = mostCurrent._types._makecomposedbuttondefs /*xevolution.vrcg.devdemov2400.types._composedbuttondefs*/ (processBA,mostCurrent._consts._whitesoftdusk /*int*/ ,mostCurrent._consts._darkgray /*int*/ ,mostCurrent._consts._blacknoalpha /*int*/ ,mostCurrent._consts._whitesoftdusk /*int*/ ,mostCurrent._consts._darkgray /*int*/ ,mostCurrent._consts._darkgray /*int*/ ,mostCurrent._consts._darkgray /*int*/ ,(int) (1),(int) (5));
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="End Sub";
return "";
}
public static String  _deletefiles() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "deletefiles", false))
	 {return ((String) Debug.delegate(processBA, "deletefiles", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub DeleteFiles";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="If File.Exists(SharedFolder, \"template_edp.html\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template_edp.html")) { 
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="File.Delete(SharedFolder, \"template_edp.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template_edp.html");
 };
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="If Not(File.Exists(InternalFolder, \"vazio.png\"))";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_internalfolder,"vazio.png"))) { 
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="File.Copy(File.DirAssets, \"vazio.png\", InternalF";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"vazio.png",_internalfolder,"vazio.png");
 };
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="If File.Exists(SharedFolder, \"template2.html\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template2.html")) { 
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="File.Delete(SharedFolder, \"template2.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template2.html");
 };
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="If File.Exists(SharedFolder, \"template4.html\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template4.html")) { 
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="File.Delete(SharedFolder, \"template4.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template4.html");
 };
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="If File.Exists(SharedFolder, \"template5.html\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template5.html")) { 
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="File.Delete(SharedFolder, \"template5.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template5.html");
 };
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="If File.Exists(SharedFolder, \"template5A.html\") T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template5A.html")) { 
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="File.Delete(SharedFolder, \"template5A.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template5A.html");
 };
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="If File.Exists(SharedFolder, \"template9.html\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template9.html")) { 
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="File.Delete(SharedFolder, \"template9.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template9.html");
 };
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="If File.Exists(SharedFolder, \"template10.html\") T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template10.html")) { 
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="File.Delete(SharedFolder, \"template10.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template10.html");
 };
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="If File.Exists(SharedFolder, \"template12.html\") T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template12.html")) { 
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="File.Delete(SharedFolder, \"template12.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template12.html");
 };
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="If File.Exists(SharedFolder, \"template12header.ht";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template12header.html")) { 
RDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="File.Delete(SharedFolder, \"template12header.html";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template12header.html");
 };
RDebugUtils.currentLine=589865;
 //BA.debugLineNum = 589865;BA.debugLine="If File.Exists(SharedFolder, \"template12footer.ht";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template12footer.html")) { 
RDebugUtils.currentLine=589866;
 //BA.debugLineNum = 589866;BA.debugLine="File.Delete(SharedFolder, \"template12footer.html";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template12footer.html");
 };
RDebugUtils.currentLine=589869;
 //BA.debugLineNum = 589869;BA.debugLine="If File.Exists(SharedFolder, \"page_header.html\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_header.html")) { 
RDebugUtils.currentLine=589870;
 //BA.debugLineNum = 589870;BA.debugLine="File.Delete(SharedFolder, \"page_header.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_header.html");
 };
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="If File.Exists(SharedFolder, \"page_footer.html\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_footer.html")) { 
RDebugUtils.currentLine=589874;
 //BA.debugLineNum = 589874;BA.debugLine="File.Delete(SharedFolder, \"page_footer.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_footer.html");
 };
RDebugUtils.currentLine=589877;
 //BA.debugLineNum = 589877;BA.debugLine="If File.Exists(SharedFolder, \"page_content.html\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_content.html")) { 
RDebugUtils.currentLine=589878;
 //BA.debugLineNum = 589878;BA.debugLine="File.Delete(SharedFolder, \"page_content.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_content.html");
 };
RDebugUtils.currentLine=589881;
 //BA.debugLineNum = 589881;BA.debugLine="If File.Exists(SharedFolder, \"page_identification";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_identification_first.html")) { 
RDebugUtils.currentLine=589882;
 //BA.debugLineNum = 589882;BA.debugLine="File.Delete(SharedFolder, \"page_identification_f";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_identification_first.html");
 };
RDebugUtils.currentLine=589885;
 //BA.debugLineNum = 589885;BA.debugLine="If File.Exists(SharedFolder, \"age_identification_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"age_identification_first_score.html")) { 
RDebugUtils.currentLine=589886;
 //BA.debugLineNum = 589886;BA.debugLine="File.Delete(SharedFolder, \"age_identification_fi";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"age_identification_first_score.html");
 };
RDebugUtils.currentLine=589889;
 //BA.debugLineNum = 589889;BA.debugLine="If File.Exists(SharedFolder, \"page_identification";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_identification_next.html")) { 
RDebugUtils.currentLine=589890;
 //BA.debugLineNum = 589890;BA.debugLine="File.Delete(SharedFolder, \"page_identification_n";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_identification_next.html");
 };
RDebugUtils.currentLine=589893;
 //BA.debugLineNum = 589893;BA.debugLine="If File.Exists(SharedFolder, \"page_identification";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_identification_last.html")) { 
RDebugUtils.currentLine=589894;
 //BA.debugLineNum = 589894;BA.debugLine="File.Delete(SharedFolder, \"page_identification_l";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_identification_last.html");
 };
RDebugUtils.currentLine=589897;
 //BA.debugLineNum = 589897;BA.debugLine="If File.Exists(SharedFolder, \"page_content_images";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_content_images.html")) { 
RDebugUtils.currentLine=589898;
 //BA.debugLineNum = 589898;BA.debugLine="File.Delete(SharedFolder, \"page_content_images.h";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_content_images.html");
 };
RDebugUtils.currentLine=589901;
 //BA.debugLineNum = 589901;BA.debugLine="If File.Exists(SharedFolder, \"page_content_noncon";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_content_nonconformities.html")) { 
RDebugUtils.currentLine=589902;
 //BA.debugLineNum = 589902;BA.debugLine="File.Delete(SharedFolder, \"page_content_nonconfo";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_content_nonconformities.html");
 };
RDebugUtils.currentLine=589905;
 //BA.debugLineNum = 589905;BA.debugLine="If File.Exists(SharedFolder, \"page_content_observ";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_content_observations.html")) { 
RDebugUtils.currentLine=589906;
 //BA.debugLineNum = 589906;BA.debugLine="File.Delete(SharedFolder, \"page_content_observat";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_content_observations.html");
 };
RDebugUtils.currentLine=589909;
 //BA.debugLineNum = 589909;BA.debugLine="If File.Exists(SharedFolder, \"page_signature.html";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_signature.html")) { 
RDebugUtils.currentLine=589910;
 //BA.debugLineNum = 589910;BA.debugLine="File.Delete(SharedFolder, \"page_signature.html\"";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_signature.html");
 };
RDebugUtils.currentLine=589913;
 //BA.debugLineNum = 589913;BA.debugLine="If File.Exists(SharedFolder, \"template20.html\") T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template20.html")) { 
RDebugUtils.currentLine=589914;
 //BA.debugLineNum = 589914;BA.debugLine="File.Delete(SharedFolder, \"template20.html\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template20.html");
 };
RDebugUtils.currentLine=589917;
 //BA.debugLineNum = 589917;BA.debugLine="If File.Exists(InternalFolder, \"CROQUI.png\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_internalfolder,"CROQUI.png")) { 
RDebugUtils.currentLine=589918;
 //BA.debugLineNum = 589918;BA.debugLine="File.Delete(InternalFolder, \"CROQUI.png\" )";
anywheresoftware.b4a.keywords.Common.File.Delete(_internalfolder,"CROQUI.png");
 };
RDebugUtils.currentLine=589921;
 //BA.debugLineNum = 589921;BA.debugLine="If File.Exists(InternalFolder, \"logo_monocromatic";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_internalfolder,"logo_monocromatico.png")) { 
RDebugUtils.currentLine=589922;
 //BA.debugLineNum = 589922;BA.debugLine="File.Delete(InternalFolder, \"logo_monocromatico.";
anywheresoftware.b4a.keywords.Common.File.Delete(_internalfolder,"logo_monocromatico.png");
 };
RDebugUtils.currentLine=589925;
 //BA.debugLineNum = 589925;BA.debugLine="If File.Exists(SharedFolder, \"template20_VStorage";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template20_VStorage.html")) { 
RDebugUtils.currentLine=589926;
 //BA.debugLineNum = 589926;BA.debugLine="File.Delete(SharedFolder, \"template20_VStorage.h";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template20_VStorage.html");
 };
RDebugUtils.currentLine=589929;
 //BA.debugLineNum = 589929;BA.debugLine="If File.Exists(SharedFolder, \"template20_VCamperv";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template20_VCampervans.html")) { 
RDebugUtils.currentLine=589930;
 //BA.debugLineNum = 589930;BA.debugLine="File.Delete(SharedFolder, \"template20_VCampervan";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template20_VCampervans.html");
 };
RDebugUtils.currentLine=589933;
 //BA.debugLineNum = 589933;BA.debugLine="If File.Exists(SharedFolder, \"page_id_resopre_fir";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_id_resopre_first.html")) { 
RDebugUtils.currentLine=589934;
 //BA.debugLineNum = 589934;BA.debugLine="File.Delete(SharedFolder, \"page_id_resopre_first";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_id_resopre_first.html");
 };
RDebugUtils.currentLine=589937;
 //BA.debugLineNum = 589937;BA.debugLine="If File.Exists(SharedFolder, \"page_resopre_footer";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_resopre_footer.html")) { 
RDebugUtils.currentLine=589938;
 //BA.debugLineNum = 589938;BA.debugLine="File.Delete(SharedFolder, \"page_resopre_footer.h";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_resopre_footer.html");
 };
RDebugUtils.currentLine=589941;
 //BA.debugLineNum = 589941;BA.debugLine="If File.Exists(SharedFolder, \"page_resopre_header";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"page_resopre_header.html")) { 
RDebugUtils.currentLine=589942;
 //BA.debugLineNum = 589942;BA.debugLine="File.Delete(SharedFolder, \"page_resopre_header.h";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"page_resopre_header.html");
 };
RDebugUtils.currentLine=589945;
 //BA.debugLineNum = 589945;BA.debugLine="If File.Exists(SharedFolder, \"template_resopre_gr";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template_resopre_group.html")) { 
RDebugUtils.currentLine=589946;
 //BA.debugLineNum = 589946;BA.debugLine="File.Delete(SharedFolder, \"template_resopre_grou";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template_resopre_group.html");
 };
RDebugUtils.currentLine=589949;
 //BA.debugLineNum = 589949;BA.debugLine="If File.Exists(SharedFolder, \"acail_distribuicao_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"acail_distribuicao_epis.html")) { 
RDebugUtils.currentLine=589950;
 //BA.debugLineNum = 589950;BA.debugLine="File.Delete(SharedFolder, \"acail_distribuicao_ep";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"acail_distribuicao_epis.html");
 };
RDebugUtils.currentLine=589953;
 //BA.debugLineNum = 589953;BA.debugLine="If File.Exists(SharedFolder, \"acail_reg_despesa.h";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"acail_reg_despesa.html")) { 
RDebugUtils.currentLine=589954;
 //BA.debugLineNum = 589954;BA.debugLine="File.Delete(SharedFolder, \"acail_reg_despesa.htm";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"acail_reg_despesa.html");
 };
RDebugUtils.currentLine=589957;
 //BA.debugLineNum = 589957;BA.debugLine="If File.Exists(SharedFolder, \"template_limpersado";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_sharedfolder,"template_limpersado_guia.html")) { 
RDebugUtils.currentLine=589958;
 //BA.debugLineNum = 589958;BA.debugLine="File.Delete(SharedFolder, \"template_limpersado_g";
anywheresoftware.b4a.keywords.Common.File.Delete(_sharedfolder,"template_limpersado_guia.html");
 };
RDebugUtils.currentLine=589960;
 //BA.debugLineNum = 589960;BA.debugLine="End Sub";
return "";
}
public static String  _initializeftp() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "initializeftp", false))
	 {return ((String) Debug.delegate(processBA, "initializeftp", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub InitializeFTP";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If Not(GlobalFTP.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_globalftp.IsInitialized())) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public static String  _initializegps() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "initializegps", false))
	 {return ((String) Debug.delegate(processBA, "initializegps", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub InitializeGPS";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If Not(GPSDEVICE.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_gpsdevice.IsInitialized())) { 
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="GPSDEVICE.Initialize(\"GPSDEVICE\")";
_gpsdevice.Initialize("GPSDEVICE");
 };
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _isonline() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "isonline", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "isonline", null));}
ResumableSub_IsOnline rsub = new ResumableSub_IsOnline(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_IsOnline extends BA.ResumableSub {
public ResumableSub_IsOnline(xevolution.vrcg.devdemov2400.starter parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.starter parent;
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _response = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _error = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="starter";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim Response, Error As StringBuilder";
_response = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_error = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Response.Initialize";
_response.Initialize();
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Error.Initialize";
_error.Initialize();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 18;
this.catchState = 17;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 17;
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="p.Shell(\"ping -q -c 1 -W 2 8.8.8.8\",Null,Respons";
_p.Shell("ping -q -c 1 -W 2 8.8.8.8",(String[])(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(_response.getObject()),(java.lang.StringBuilder)(_error.getObject()));
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="If Error.ToString = \"\" Then";
if (true) break;

case 4:
//if
this.state = 15;
if ((_error.ToString()).equals("")) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="If Response.ToString.Contains(\" 100% packet los";
if (true) break;

case 7:
//if
this.state = 12;
if (_response.ToString().contains(" 100% packet loss")) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="Else If Response.ToString.Contains(\" 0% packet";
if (_response.ToString().contains(" 0% packet loss")) { 
this.state = 11;
}}
if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="Log(\"Ping ran but no response \" &  Response.To";
anywheresoftware.b4a.keywords.Common.LogImpl("61966092","Ping ran but no response "+_response.ToString(),0);
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="Log(\"Ping Google OK\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61966095","Ping Google OK",0);
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=1966103;
 //BA.debugLineNum = 1966103;BA.debugLine="Log(\"Error pinging Google DNS: \"  & Error.ToStri";
anywheresoftware.b4a.keywords.Common.LogImpl("61966103","Error pinging Google DNS: "+_error.ToString(),0);
RDebugUtils.currentLine=1966104;
 //BA.debugLineNum = 1966104;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1966106;
 //BA.debugLineNum = 1966106;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _pe_screenoff(anywheresoftware.b4a.objects.IntentWrapper _intent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "pe_screenoff", false))
	 {return ((String) Debug.delegate(processBA, "pe_screenoff", new Object[] {_intent}));}
anywheresoftware.b4a.phone.Phone.PhoneWakeState _phk = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub PE_ScreenOff (Intent As Intent)";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Log(\"screen off by user\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61114114","screen off by user",0);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim phk As PhoneWakeState";
_phk = new anywheresoftware.b4a.phone.Phone.PhoneWakeState();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="phk.ReleaseKeepAlive";
_phk.ReleaseKeepAlive();
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._comms.getObject()));
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="StopCommsCheck = True";
_stopcommscheck = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="StopLocationCheck = True";
_stoplocationcheck = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="End Sub";
return "";
}
public static String  _pe_screenon(anywheresoftware.b4a.objects.IntentWrapper _intent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "pe_screenon", false))
	 {return ((String) Debug.delegate(processBA, "pe_screenon", new Object[] {_intent}));}
anywheresoftware.b4a.phone.Phone.PhoneWakeState _phk = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub PE_ScreenOn (Intent As Intent)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Log(\"PE_ScreenOn\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61048577","PE_ScreenOn",0);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If IsPaused(Main)=False And Main.keepal Then";
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)(mostCurrent._main.getObject()))==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._keepal /*boolean*/ ) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Dim phk As PhoneWakeState";
_phk = new anywheresoftware.b4a.phone.Phone.PhoneWakeState();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="phk.ReleaseKeepAlive";
_phk.ReleaseKeepAlive();
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="phk.KeepAlive(True)";
_phk.KeepAlive(processBA,anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="StopCommsCheck = False";
_stopcommscheck = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="StopLocationCheck = False";
_stoplocationcheck = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="StartService(Comms)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._comms.getObject()));
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="End Sub";
return "";
}
public static String  _pe_smsdelivered(String _phonenumber,anywheresoftware.b4a.objects.IntentWrapper _intent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "pe_smsdelivered", false))
	 {return ((String) Debug.delegate(processBA, "pe_smsdelivered", new Object[] {_phonenumber,_intent}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub PE_SmsDelivered (PhoneNumber As String, Intent";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Log(\"phs_SmsDelivered: PhoneNumber=\" & PhoneNumbe";
anywheresoftware.b4a.keywords.Common.LogImpl("61179649","phs_SmsDelivered: PhoneNumber="+_phonenumber+", message_id="+BA.ObjectToString(_intent.GetExtra("message_id")),0);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="ToastMessageShow($\"${ShareCode.AvisoSMSSent} - ${";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._avisosmssent /*String*/ ))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_phonenumber))+"")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public static String  _pe_smssentstatus(boolean _success,String _errormessage,String _phonenumber,anywheresoftware.b4a.objects.IntentWrapper _intent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "pe_smssentstatus", false))
	 {return ((String) Debug.delegate(processBA, "pe_smssentstatus", new Object[] {_success,_errormessage,_phonenumber,_intent}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub PE_SmsSentStatus (Success As Boolean, ErrorMes";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Log(\"phs_SmsSentStatus: PhoneNumber=\" & PhoneNumb";
anywheresoftware.b4a.keywords.Common.LogImpl("61245185","phs_SmsSentStatus: PhoneNumber="+_phonenumber+", Success="+BA.ObjectToString(_success)+", message_id="+BA.ObjectToString(_intent.GetExtra("message_id")),0);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If Not(Success) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_success)) { 
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="ToastMessageShow($\"${ShareCode.GeneralErrorTitle";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._generalerrortitle /*String*/ ))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._avisosmsnotsent /*String*/ ))+"")),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _requestemailfrombo(String _nrequest,String _emailsto,String _emailscc,String _subject,String _sendbcc) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "requestemailfrombo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "requestemailfrombo", new Object[] {_nrequest,_emailsto,_emailscc,_subject,_sendbcc}));}
ResumableSub_RequestEmailFromBO rsub = new ResumableSub_RequestEmailFromBO(null,_nrequest,_emailsto,_emailscc,_subject,_sendbcc);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RequestEmailFromBO extends BA.ResumableSub {
public ResumableSub_RequestEmailFromBO(xevolution.vrcg.devdemov2400.starter parent,String _nrequest,String _emailsto,String _emailscc,String _subject,String _sendbcc) {
this.parent = parent;
this._nrequest = _nrequest;
this._emailsto = _emailsto;
this._emailscc = _emailscc;
this._subject = _subject;
this._sendbcc = _sendbcc;
}
xevolution.vrcg.devdemov2400.starter parent;
String _nrequest;
String _emailsto;
String _emailscc;
String _subject;
String _sendbcc;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _jobemail = null;
anywheresoftware.b4a.objects.collections.Map _paramseml = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _jsonstruct = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _status = "";
String _message = "";
String _eml_result_text = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="starter";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="EmailsTO = EmailsTO.Replace(\";;\", \";\")";
_emailsto = _emailsto.replace(";;",";");
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="EmailsTO = EmailsTO.Replace(\",\", \";\")";
_emailsto = _emailsto.replace(",",";");
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="EmailsTO = EmailsTO.Replace(\"|\", \";\")";
_emailsto = _emailsto.replace("|",";");
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="EmailsTO = EmailsTO.Replace(\" \", \"\")";
_emailsto = _emailsto.replace(" ","");
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="EmailsCC = EmailsCC.Replace(\";;\", \";\")";
_emailscc = _emailscc.replace(";;",";");
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="EmailsCC = EmailsCC.Replace(\",\", \";\")";
_emailscc = _emailscc.replace(",",";");
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="EmailsCC = EmailsCC.Replace(\"|\", \";\")";
_emailscc = _emailscc.replace("|",";");
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="EmailsCC = EmailsCC.Replace(\" \", \"\")";
_emailscc = _emailscc.replace(" ","");
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/cla/send/email");
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="Dim JobEmail As HttpJob";
_jobemail = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="JobEmail.Initialize(\"\", Me)";
_jobemail._initialize /*String*/ (null,processBA,"",starter.getObject());
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="Dim ParamsEml As Map";
_paramseml = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="ParamsEml.Initialize";
_paramseml.Initialize();
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="ParamsEml.Clear";
_paramseml.Clear();
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="ParamsEml.Put(\"_token\",ShareCode.APP_TOKEN)";
_paramseml.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="ParamsEml.Put(\"request\",NRequest)";
_paramseml.Put((Object)("request"),(Object)(_nrequest));
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="ParamsEml.Put(\"emailsTO\",EmailsTO)";
_paramseml.Put((Object)("emailsTO"),(Object)(_emailsto));
RDebugUtils.currentLine=2031637;
 //BA.debugLineNum = 2031637;BA.debugLine="ParamsEml.Put(\"emailsCC\",EmailsCC)";
_paramseml.Put((Object)("emailsCC"),(Object)(_emailscc));
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="ParamsEml.Put(\"subject\", subject)";
_paramseml.Put((Object)("subject"),(Object)(_subject));
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="ParamsEml.Put(\"date\",Utils.GetCurrDatetime)";
_paramseml.Put((Object)("date"),(Object)(parent.mostCurrent._utils._getcurrdatetime /*String*/ (processBA)));
RDebugUtils.currentLine=2031640;
 //BA.debugLineNum = 2031640;BA.debugLine="ParamsEml.Put(\"user\", ShareCode.SESS_OPER_User)";
_paramseml.Put((Object)("user"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=2031641;
 //BA.debugLineNum = 2031641;BA.debugLine="ParamsEml.Put(\"SendBCC\", sendBCC)";
_paramseml.Put((Object)("SendBCC"),(Object)(_sendbcc));
RDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="ParamsEml.Put(\"debug\", 0)";
_paramseml.Put((Object)("debug"),(Object)(0));
RDebugUtils.currentLine=2031643;
 //BA.debugLineNum = 2031643;BA.debugLine="ParamsEml.Put(\"versionTagcode\", Main.VersionTagco";
_paramseml.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=2031644;
 //BA.debugLineNum = 2031644;BA.debugLine="ParamsEml.Put(\"_authorization\", Main.DeviceAuthor";
_paramseml.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=2031645;
 //BA.debugLineNum = 2031645;BA.debugLine="ParamsEml.Put(\"_instance\", Main.DeviceInstance)";
_paramseml.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=2031646;
 //BA.debugLineNum = 2031646;BA.debugLine="ParamsEml.put(\"_deviceBrand\", Main.DeviceBrand)";
_paramseml.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=2031647;
 //BA.debugLineNum = 2031647;BA.debugLine="ParamsEml.put(\"_deviceModel\", Main.DeviceModel)";
_paramseml.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=2031648;
 //BA.debugLineNum = 2031648;BA.debugLine="ParamsEml.put(\"_deviceMacAddress\", Main.DeviceMac";
_paramseml.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=2031649;
 //BA.debugLineNum = 2031649;BA.debugLine="ParamsEml.Put(\"_user\", ShareCode.SESS_User)";
_paramseml.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=2031650;
 //BA.debugLineNum = 2031650;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2031651;
 //BA.debugLineNum = 2031651;BA.debugLine="JSON.Initialize(ParamsEml)";
_json.Initialize(_paramseml);
RDebugUtils.currentLine=2031653;
 //BA.debugLineNum = 2031653;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=2031655;
 //BA.debugLineNum = 2031655;BA.debugLine="Utils.ShowProcinLog(\"Starter\",\"RequestEmailfromBO";
parent.mostCurrent._utils._showprocinlog /*String*/ (processBA,"Starter","RequestEmailfromBO",_data);
RDebugUtils.currentLine=2031659;
 //BA.debugLineNum = 2031659;BA.debugLine="JobEmail.PostString(ServerAddress, data)";
_jobemail._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=2031660;
 //BA.debugLineNum = 2031660;BA.debugLine="JobEmail.GetRequest.SetContentType(\"application/j";
_jobemail._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2031661;
 //BA.debugLineNum = 2031661;BA.debugLine="JobEmail.GetRequest.Timeout = 90000";
_jobemail._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (90000));
RDebugUtils.currentLine=2031662;
 //BA.debugLineNum = 2031662;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(processBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031663;
 //BA.debugLineNum = 2031663;BA.debugLine="Wait For (JobEmail) JobDone(JobEmail As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "starter", "requestemailfrombo"), (Object)(_jobemail));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_jobemail = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=2031665;
 //BA.debugLineNum = 2031665;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2031667;
 //BA.debugLineNum = 2031667;BA.debugLine="If JobEmail.Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_jobemail._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2031668;
 //BA.debugLineNum = 2031668;BA.debugLine="Dim JsonStruct As String=\"\"";
_jsonstruct = "";
RDebugUtils.currentLine=2031669;
 //BA.debugLineNum = 2031669;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
RDebugUtils.currentLine=2031670;
 //BA.debugLineNum = 2031670;BA.debugLine="JsonStruct = JobEmail.GetString";
_jsonstruct = _jobemail._getstring /*String*/ (null);
RDebugUtils.currentLine=2031671;
 //BA.debugLineNum = 2031671;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2031672;
 //BA.debugLineNum = 2031672;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=2031673;
 //BA.debugLineNum = 2031673;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2031674;
 //BA.debugLineNum = 2031674;BA.debugLine="Dim Status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=2031675;
 //BA.debugLineNum = 2031675;BA.debugLine="Dim Message As String = root.Get(\"message\")";
_message = BA.ObjectToString(_root.Get((Object)("message")));
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=2031677;
 //BA.debugLineNum = 2031677;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("62031677",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=2031678;
 //BA.debugLineNum = 2031678;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
;
RDebugUtils.currentLine=2031681;
 //BA.debugLineNum = 2031681;BA.debugLine="Log(JsonStruct)";
anywheresoftware.b4a.keywords.Common.LogImpl("62031681",_jsonstruct,0);
RDebugUtils.currentLine=2031682;
 //BA.debugLineNum = 2031682;BA.debugLine="If Status = \"1\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((_status).equals("1")) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=2031683;
 //BA.debugLineNum = 2031683;BA.debugLine="ShareCode.EML_RESULT = \"SUCESSO\"";
parent.mostCurrent._sharecode._eml_result /*String*/  = "SUCESSO";
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=2031685;
 //BA.debugLineNum = 2031685;BA.debugLine="ShareCode.EML_RESULT = \"ERRO\"";
parent.mostCurrent._sharecode._eml_result /*String*/  = "ERRO";
 if (true) break;

case 15:
//C
this.state = 18;
;
RDebugUtils.currentLine=2031688;
 //BA.debugLineNum = 2031688;BA.debugLine="Utils.ShowProcinLog(\"ReportView\",\"RequestEmailfr";
parent.mostCurrent._utils._showprocinlog /*String*/ (processBA,"ReportView","RequestEmailfromBO","Success");
RDebugUtils.currentLine=2031689;
 //BA.debugLineNum = 2031689;BA.debugLine="Dim Eml_result_Text As String = $\"${NRequest} -";
_eml_result_text = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nrequest))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._eml_result /*String*/ ))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emailsto))+"");
RDebugUtils.currentLine=2031690;
 //BA.debugLineNum = 2031690;BA.debugLine="Str_CreateEmailAlert(Eml_result_Text)";
_str_createemailalert(_eml_result_text);
RDebugUtils.currentLine=2031691;
 //BA.debugLineNum = 2031691;BA.debugLine="MsgboxAsync(\"Verifique o estado do envio em Aler";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Verifique o estado do envio em Alertas, no Menu principal"),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),processBA);
RDebugUtils.currentLine=2031692;
 //BA.debugLineNum = 2031692;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=2031694;
 //BA.debugLineNum = 2031694;BA.debugLine="Log(JobEmail.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("62031694",_jobemail._errormessage /*String*/ ,0);
RDebugUtils.currentLine=2031695;
 //BA.debugLineNum = 2031695;BA.debugLine="Utils.ShowProcinLog(\"ReportView\",\"RequestEmailfr";
parent.mostCurrent._utils._showprocinlog /*String*/ (processBA,"ReportView","RequestEmailfromBO","JOB ERROR");
RDebugUtils.currentLine=2031696;
 //BA.debugLineNum = 2031696;BA.debugLine="Utils.Logerror(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (processBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_jobemail._errormessage /*String*/ );
RDebugUtils.currentLine=2031697;
 //BA.debugLineNum = 2031697;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=2031699;
 //BA.debugLineNum = 2031699;BA.debugLine="JobEmail.Release";
_jobemail._release /*String*/ (null);
RDebugUtils.currentLine=2031700;
 //BA.debugLineNum = 2031700;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _str_createemailalert(String _alert_text) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "str_createemailalert", false))
	 {return ((String) Debug.delegate(processBA, "str_createemailalert", new Object[] {_alert_text}));}
int _mid = 0;
String _alerttagcode = "";
String _ssql = "";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Str_CreateEmailAlert(Alert_Text As String)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_al";
_mid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (processBA,"dta_alerts","id","")+1+1000000);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateTa";
_alerttagcode = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._generatetagcode /*String*/ (processBA,"ALERTINF_")))+"");
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (id";
_ssql = ("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"+"							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"+"							values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '', 'ALRTREL_REQUESTS', 'ALRTTYP_NOTIFY', 1, 1, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alert_text))+"', \n"+"	'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._getcurrentdate /*String*/ (processBA)))+"', '', 1, 1, 0, 0)");
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL, \"";
mostCurrent._utils._savesqltolog /*boolean*/ (processBA,"butSavePicture_Click",_ssql,"");
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._mainmenu.getObject()),"BadgeCheckUpdate");
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="ApiCall.Initialize";
_apicall._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="SetDefaultLocale";
_setdefaultlocale();
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="DeleteFiles";
_deletefiles();
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="InitializeGPS";
_initializegps();
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="PE.Initialize(\"PE\")";
_pe.Initialize(processBA,"PE");
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="RunUpdate = False";
_runupdate = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="End Sub";
return "";
}
public static String  _setdefaultlocale() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "setdefaultlocale", false))
	 {return ((String) Debug.delegate(processBA, "setdefaultlocale", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub SetDefaultLocale";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="jo.InitializeStatic(\"java.util.Locale\").RunMethod";
_jo.InitializeStatic("java.util.Locale").RunMethod("setDefault",new Object[]{_jo.GetField("US")});
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="ShareCode.CURRENT_APPDATE = Utils.GetCurrentDate";
mostCurrent._sharecode._current_appdate /*String*/  = mostCurrent._utils._getcurrentdate /*String*/ (processBA);
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="Params.Initialize";
_params._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="SetFoldersLocation";
_setfolderslocation();
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="LocalSessionCode = $\"SESS_${Utils.MakeFileName}\"$";
_localsessioncode = ("SESS_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._makefilename /*String*/ (processBA)))+"");
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="CopyAndInitializeAppState";
_copyandinitializeappstate();
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="CopyAndInitializeDatabases";
_copyandinitializedatabases();
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="Create_dbchanges_Table";
_create_dbchanges_table();
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="DBStructures.CreateTablesThatDoNotExists";
mostCurrent._dbstructures._createtablesthatdonotexists /*String*/ (processBA);
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="CopyFiles";
_copyfiles();
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="SetAppAndDeviceInfo";
_setappanddeviceinfo();
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="InitializeFTP";
_initializeftp();
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="Set_SESS_IN_PAUSE";
_set_sess_in_pause();
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="FirstInstall = (ShareCode.APPL_CONFIRMED = 0) Or";
_firstinstall = (mostCurrent._sharecode._appl_confirmed /*int*/ ==0) || (mostCurrent._sharecode._first_install /*int*/ ==0);
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="ShareCode.APP_LAST_USER = AppState.ReadString(\"AP";
mostCurrent._sharecode._app_last_user /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","LAST_USER","");
RDebugUtils.currentLine=458787;
 //BA.debugLineNum = 458787;BA.debugLine="DBStructures.getCurrentConfigValues";
mostCurrent._dbstructures._getcurrentconfigvalues /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (processBA);
RDebugUtils.currentLine=458788;
 //BA.debugLineNum = 458788;BA.debugLine="Log($\"API_TOKEN : ${ShareCode.APP_TOKEN}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6458788",("API_TOKEN : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_token /*String*/ ))+""),0);
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="DBStructures.updateConfigApp(ShareCode.APP_TOKEN)";
mostCurrent._dbstructures._updateconfigapp /*String*/ (processBA,mostCurrent._sharecode._app_token /*String*/ );
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="Log($\"SERVICE STARTER : ${Consts.ColorMain} -- ${";
anywheresoftware.b4a.keywords.Common.LogImpl("6458790",("SERVICE STARTER : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._consts._colormain /*int*/ ))+" -- "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._consts._colorsub /*int*/ ))+""),0);
RDebugUtils.currentLine=458791;
 //BA.debugLineNum = 458791;BA.debugLine="DBStructures.getConfigApp(ShareCode.APP_TOKEN)";
mostCurrent._dbstructures._getconfigapp /*String*/ (processBA,mostCurrent._sharecode._app_token /*String*/ );
RDebugUtils.currentLine=458793;
 //BA.debugLineNum = 458793;BA.debugLine="KeepColorMain = Consts.ColorMain";
_keepcolormain = mostCurrent._consts._colormain /*int*/ ;
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="KeepColorSub = Consts.ColorSub";
_keepcolorsub = mostCurrent._consts._colorsub /*int*/ ;
RDebugUtils.currentLine=458804;
 //BA.debugLineNum = 458804;BA.debugLine="EntityKeepFilter = False";
_entitykeepfilter = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=458805;
 //BA.debugLineNum = 458805;BA.debugLine="EntitySearchFilter = \"\"";
_entitysearchfilter = "";
RDebugUtils.currentLine=458806;
 //BA.debugLineNum = 458806;BA.debugLine="EntityFilter = Types.MakeEntityFilter(0, 0, 0, 0,";
_entityfilter = mostCurrent._types._makeentityfilter /*xevolution.vrcg.devdemov2400.types._entityfilter*/ (processBA,(int) (0),(int) (0),(int) (0),(int) (0),"","",(int) (0));
RDebugUtils.currentLine=458808;
 //BA.debugLineNum = 458808;BA.debugLine="ObjectKeepFilter  = True";
_objectkeepfilter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=458809;
 //BA.debugLineNum = 458809;BA.debugLine="ObjectFiltered  = True";
_objectfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=458810;
 //BA.debugLineNum = 458810;BA.debugLine="ObjectSearchFilter = \"\"";
_objectsearchfilter = "";
RDebugUtils.currentLine=458811;
 //BA.debugLineNum = 458811;BA.debugLine="ObjectFilter = Types.MakeObjectFilter(ShareCode.O";
_objectfilter = mostCurrent._types._makeobjectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ (processBA,mostCurrent._sharecode._obj_defaulttype /*int*/ ,mostCurrent._sharecode._obj_defaultzone /*int*/ ,(int) (0),(int) (0),(int) (0),"","",(int) (0));
RDebugUtils.currentLine=458812;
 //BA.debugLineNum = 458812;BA.debugLine="Log($\"OBJECT_FILTER_CHANGED: ${ObjectFilter}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6458812",("OBJECT_FILTER_CHANGED: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objectfilter))+""),0);
RDebugUtils.currentLine=458814;
 //BA.debugLineNum = 458814;BA.debugLine="CreateCPButtons";
_createcpbuttons();
RDebugUtils.currentLine=458815;
 //BA.debugLineNum = 458815;BA.debugLine="SetAppInfo";
_setappinfo();
RDebugUtils.currentLine=458817;
 //BA.debugLineNum = 458817;BA.debugLine="DevInfo = Utils.DeviceInfo";
_devinfo = mostCurrent._utils._deviceinfo /*xevolution.vrcg.devdemov2400.types._deviceinformation*/ (processBA);
RDebugUtils.currentLine=458818;
 //BA.debugLineNum = 458818;BA.debugLine="ShareCode.ISPHONE = (DevInfo.Size < 6)";
mostCurrent._sharecode._isphone /*boolean*/  = (_devinfo.Size /*int*/ <6);
RDebugUtils.currentLine=458820;
 //BA.debugLineNum = 458820;BA.debugLine="Clear_loc_userssession_Table";
_clear_loc_userssession_table();
RDebugUtils.currentLine=458821;
 //BA.debugLineNum = 458821;BA.debugLine="End Sub";
return "";
}
public static String  _setfolderslocation() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "setfolderslocation", false))
	 {return ((String) Debug.delegate(processBA, "setfolderslocation", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub SetFoldersLocation";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Provider.SharedFolder = rp.GetSafeDirDefaultExter";
_provider._sharedfolder /*String*/  = _rp.GetSafeDirDefaultExternal("orion");
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Provider.UseFileProvider = True";
_provider._usefileprovider /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="SharedFolder = Provider.SharedFolder '    rp.GetS";
_sharedfolder = _provider._sharedfolder /*String*/ ;
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="SafeDefaultExternal = SharedFolder 'rp.GetSafeDir";
_safedefaultexternal = _sharedfolder;
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="InternalFolder = File.DirInternal";
_internalfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternal();
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="AssetsFolder = File.DirAssets";
_assetsfolder = anywheresoftware.b4a.keywords.Common.File.getDirAssets();
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="End Sub";
return "";
}
public static String  _setappanddeviceinfo() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "setappanddeviceinfo", false))
	 {return ((String) Debug.delegate(processBA, "setappanddeviceinfo", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub SetAppAndDeviceInfo";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="ShareCode.DEVICE_ORIENTATION = AppState.ReadInteg";
mostCurrent._sharecode._device_orientation /*int*/  = _appstate._readinteger /*int*/ (null,"APP_START","DEVICE_ORIENTATION",(int) (0));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="ShareCode.DEVICE_LANGUAGE_STR = AppState.ReadStri";
mostCurrent._sharecode._device_language_str /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","LANGUAGE","PT");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="ShareCode.APPL_CONFIRMED = AppState.ReadInteger(\"";
mostCurrent._sharecode._appl_confirmed /*int*/  = _appstate._readinteger /*int*/ (null,"APP_START","APPL_CONFIRMED",(int) (0));
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="ShareCode.FIRST_INSTALL = AppState.ReadInteger(\"A";
mostCurrent._sharecode._first_install /*int*/  = _appstate._readinteger /*int*/ (null,"APP_START","FIRST_INSTALL",(int) (0));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="ShareCode.APP_VERSION = AppState.ReadString(\"APP_";
mostCurrent._sharecode._app_version /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","APP_VERSION","Orion V1.40.991");
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="ShareCode.VERSION_BUILD = AppState.ReadString(\"AP";
mostCurrent._sharecode._version_build /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","VERSION_BUILD","2.01.013");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="ShareCode.VERSION_DATE = AppState.ReadString(\"APP";
mostCurrent._sharecode._version_date /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","VERSION_DATE","27-10-2019");
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="ShareCode.APPL_ACCOUNT = AppState.ReadString(\"APP";
mostCurrent._sharecode._appl_account /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","APPL_ACCOUNT","demo");
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="ShareCode.APP_LAST_LITE_UPDATE_DATETIME = AppStat";
mostCurrent._sharecode._app_last_lite_update_datetime /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","APP_LITE_LAST_UPDATE","");
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="ShareCode.APP_MAIN_LOGO = AppState.ReadString(\"AP";
mostCurrent._sharecode._app_main_logo /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","APP_MAIN_LOGO","");
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="ShareCode.APP_MAIN_LOGO_MINI = AppState.ReadStrin";
mostCurrent._sharecode._app_main_logo_mini /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","APP_MAIN_LOGO_MINI","");
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="ShareCode.APPL_HOST = AppState.ReadString(\"APP_ST";
mostCurrent._sharecode._appl_host /*String*/  = _appstate._readstring /*String*/ (null,"APP_START","APPL_HOST","");
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="End Sub";
return "";
}
public static String  _set_sess_in_pause() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "set_sess_in_pause", false))
	 {return ((String) Debug.delegate(processBA, "set_sess_in_pause", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Set_SESS_IN_PAUSE";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Try";
try {RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="ShareCode.SESS_IN_PAUSE = AppState.ReadInteger(\"";
mostCurrent._sharecode._sess_in_pause /*int*/  = _appstate._readinteger /*int*/ (null,"APP_START","SESS_IN_PAUSE",(int) (0));
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("61376260",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="AppState.WriteInteger(\"APP_START\", \"SESS_IN_PAUS";
_appstate._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",(int) (0));
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="AppState.Flush";
_appstate._flush /*String*/ (null);
 };
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="End Sub";
return "";
}
public static String  _setappinfo() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "setappinfo", false))
	 {return ((String) Debug.delegate(processBA, "setappinfo", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub SetAppInfo";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="ShareCode.APP_VersionNocodeName = Consts.AppVersi";
mostCurrent._sharecode._app_versionnocodename /*String*/  = mostCurrent._consts._appversioncodename /*String*/ ;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="ShareCode.APP_EntityBrand = \"\"";
mostCurrent._sharecode._app_entitybrand /*String*/  = "";
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="ShareCode.CURRENT_APPDATE = DateTime.Date(DateTim";
mostCurrent._sharecode._current_appdate /*String*/  = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="Log(ShareCode.CURRENT_APPDATE)";
anywheresoftware.b4a.keywords.Common.LogImpl("61572872",mostCurrent._sharecode._current_appdate /*String*/ ,0);
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="ShareCode.APPDATE_STARTRANGE = Utils.GetCurrentDa";
mostCurrent._sharecode._appdate_startrange /*String*/  = mostCurrent._utils._getcurrentdate /*String*/ (processBA);
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="ShareCode.APPDATE_ENDRANGE = Utils.GetCurrentDate";
mostCurrent._sharecode._appdate_endrange /*String*/  = mostCurrent._utils._getcurrentdate /*String*/ (processBA);
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="End Sub";
return "";
}
}