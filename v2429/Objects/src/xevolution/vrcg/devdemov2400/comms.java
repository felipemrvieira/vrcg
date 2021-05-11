package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class comms extends  android.app.Service{
	public static class comms_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (comms) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, comms.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static comms mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return comms.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.comms");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.comms", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (comms) Create ***");
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
                    BA.LogInfo("** Service (comms) Create **");
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
    	BA.LogInfo("** Service (comms) Start **");
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
            BA.LogInfo("** Service (comms) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (comms) Destroy **");
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
public static int _nid = 0;
public static anywheresoftware.b4a.phone.Phone.PhoneWakeState _lock = null;
public static int _bigcounter = 0;
public static boolean _alreadystarted = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.encoding _encoding = null;
public b4a.example.esc_pos _esc_pos = null;
public xevolution.vrcg.devdemov2400.main _main = null;
public xevolution.vrcg.devdemov2400.starter _starter = null;
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
RDebugUtils.currentModule="comms";
if (Debug.shouldDelegate(processBA, "checkwebaccess", false))
	 {Debug.delegate(processBA, "checkwebaccess", null); return;}
ResumableSub_CheckWebAccess rsub = new ResumableSub_CheckWebAccess(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CheckWebAccess extends BA.ResumableSub {
public ResumableSub_CheckWebAccess(xevolution.vrcg.devdemov2400.comms parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.comms parent;
long _starttime = 0L;
String _serveraddress = "";
anywheresoftware.b4a.objects.collections.Map _prams = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finished = false;
long _endtime = 0L;
String _valref = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="comms";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim startTime As Long = Utils.GetCurrentTicks";
_starttime = (long)(Double.parseDouble(parent.mostCurrent._utils._getcurrentticks /*String*/ (processBA)));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/timming");
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Dim Prams As Map";
_prams = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Prams.Initialize";
_prams.Initialize();
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Prams.Put(\"_first\", Utils.Bool2Int(Starter.FirstI";
_prams.Put((Object)("_first"),(Object)(parent.mostCurrent._utils._bool2int /*int*/ (processBA,parent.mostCurrent._starter._firstinstall /*boolean*/ )));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Prams.Put(\"authorization\", ShareCode.APP_Authoriz";
_prams.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Prams.Put(\"_token\", ShareCode.APP_TOKEN)";
_prams.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="JSON.Initialize(Prams)";
_json.Initialize(_prams);
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="Starter.WEBISOK = False";
parent.mostCurrent._starter._webisok /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="Try";
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
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="Dim res  As ResumableSub = TestTheServer(Server";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _testtheserver(_serveraddress,_data);
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="Wait For(res) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "comms", "checkwebaccess"), _res);
this.state = 19;
return;
case 19:
//C
this.state = 4;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="If finished Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_finished) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="Dim endTime As Long = Utils.GetCurrentTicks";
_endtime = (long)(Double.parseDouble(parent.mostCurrent._utils._getcurrentticks /*String*/ (processBA)));
RDebugUtils.currentLine=2490390;
 //BA.debugLineNum = 2490390;BA.debugLine="If ShareCode.IntensiveWorkLoad Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent._sharecode._intensiveworkload /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="Dim valRef As String = \" / Ref = 5000\"";
_valref = " / Ref = 5000";
RDebugUtils.currentLine=2490392;
 //BA.debugLineNum = 2490392;BA.debugLine="Starter.WEBISOK = ((endTime - startTime) < 500";
parent.mostCurrent._starter._webisok /*boolean*/  = ((_endtime-_starttime)<5000);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2490394;
 //BA.debugLineNum = 2490394;BA.debugLine="Starter.WEBISOK = ((endTime - startTime) < 350";
parent.mostCurrent._starter._webisok /*boolean*/  = ((_endtime-_starttime)<3500);
RDebugUtils.currentLine=2490395;
 //BA.debugLineNum = 2490395;BA.debugLine="Dim valRef As String = \" / Ref = 3500\"";
_valref = " / Ref = 3500";
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=2490401;
 //BA.debugLineNum = 2490401;BA.debugLine="Log(\"Erro de identificação do servidor\")";
anywheresoftware.b4a.keywords.Common.LogImpl("62490401","Erro de identificação do servidor",0);
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
RDebugUtils.currentLine=2490404;
 //BA.debugLineNum = 2490404;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("62490404",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=2490407;
 //BA.debugLineNum = 2490407;BA.debugLine="ShareCode.APP_WORKING_LOCAL = Not(Starter.WEBISOK";
parent.mostCurrent._sharecode._app_working_local /*boolean*/  = anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._webisok /*boolean*/ );
RDebugUtils.currentLine=2490409;
 //BA.debugLineNum = 2490409;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _testtheserver(String _serveraddress,String _data) throws Exception{
RDebugUtils.currentModule="comms";
if (Debug.shouldDelegate(processBA, "testtheserver", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "testtheserver", new Object[] {_serveraddress,_data}));}
ResumableSub_TestTheServer rsub = new ResumableSub_TestTheServer(null,_serveraddress,_data);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TestTheServer extends BA.ResumableSub {
public ResumableSub_TestTheServer(xevolution.vrcg.devdemov2400.comms parent,String _serveraddress,String _data) {
this.parent = parent;
this._serveraddress = _serveraddress;
this._data = _data;
}
xevolution.vrcg.devdemov2400.comms parent;
String _serveraddress;
String _data;
int _status = 0;
xevolution.vrcg.devdemov2400.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="comms";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Try";
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
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Dim Status As Int = 0";
_status = (int) (0);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",comms.getObject());
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "comms", "testtheserver"), (Object)(_job));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
_status = parent.mostCurrent._utils._jobapistatus /*int*/ (processBA,_job);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("62555917",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="Log(\"OFFLINE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("62555918","OFFLINE",0);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("62555922",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="If Utils.NE(Status) Then Status = 0";

case 12:
//if
this.state = 17;
this.catchState = 0;
if (parent.mostCurrent._utils._ne /*boolean*/ (processBA,BA.NumberToString(_status))) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
_status = (int) (0);
if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="Return (Status >= 1)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((_status>=1)));return;};
RDebugUtils.currentLine=2555926;
 //BA.debugLineNum = 2555926;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _isonline() throws Exception{
RDebugUtils.currentModule="comms";
if (Debug.shouldDelegate(processBA, "isonline", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "isonline", null));}
ResumableSub_IsOnline rsub = new ResumableSub_IsOnline(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_IsOnline extends BA.ResumableSub {
public ResumableSub_IsOnline(xevolution.vrcg.devdemov2400.comms parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.comms parent;
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _response = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _error = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="comms";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim Response, Error As StringBuilder";
_response = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_error = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Response.Initialize";
_response.Initialize();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Error.Initialize";
_error.Initialize();
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Try";
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
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="p.Shell(\"ping -q -c 1 -W 2 8.8.8.8\",Null,Respons";
_p.Shell("ping -q -c 1 -W 2 8.8.8.8",(String[])(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(_response.getObject()),(java.lang.StringBuilder)(_error.getObject()));
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="If Error.ToString = \"\" Then";
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
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="If Response.ToString.Contains(\" 100% packet los";
if (true) break;

case 7:
//if
this.state = 12;
if (_response.ToString().contains(" 100% packet loss")) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="Else If Response.ToString.Contains(\" 0% packet";
if (_response.ToString().contains(" 0% packet loss")) { 
this.state = 11;
}}
if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="Log(\"Ping ran but no response \" & Response.ToS";
anywheresoftware.b4a.keywords.Common.LogImpl("62621453","Ping ran but no response "+_response.ToString(),0);
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="Log(\"Ping Google OK\")";
anywheresoftware.b4a.keywords.Common.LogImpl("62621456","Ping Google OK",0);
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="Return True";
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
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="Return False";
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
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="Log(\"Error pinging Google DNS: \" & Error.ToStrin";
anywheresoftware.b4a.keywords.Common.LogImpl("62621464","Error pinging Google DNS: "+_error.ToString(),0);
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="End Sub";
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
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="comms";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="comms";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Service.StopAutomaticForeground";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="comms";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_reset_install /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_in_execution /*boolean*/ )) { 
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="UpdateData";
_updatedata();
 };
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Service.StopAutomaticForeground";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="AlreadyStarted = True";
_alreadystarted = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="If Not(Starter.StopCommsCheck) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._stopcommscheck /*boolean*/ )) { 
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="StartServiceAt(Me, DateTime.Now + 10 * 1000, Tru";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,comms.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+10*1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="UpdateData";
_updatedata();
 };
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="End Sub";
return "";
}
public static String  _updatedata() throws Exception{
RDebugUtils.currentModule="comms";
if (Debug.shouldDelegate(processBA, "updatedata", false))
	 {return ((String) Debug.delegate(processBA, "updatedata", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub UpdateData";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="If Not((Starter.RunUpdate) Or (Starter.FirstInsta";
if (anywheresoftware.b4a.keywords.Common.Not((mostCurrent._starter._runupdate /*boolean*/ ) || (mostCurrent._starter._firstinstall /*boolean*/ ))) { 
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Try";
try {RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="CheckWebAccess";
_checkwebaccess();
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("62424838",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
 };
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="End Sub";
return "";
}
}