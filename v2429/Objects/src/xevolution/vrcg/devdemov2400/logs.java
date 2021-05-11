package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class logs extends  android.app.Service{
	public static class logs_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (logs) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, logs.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static logs mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return logs.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.logs");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.logs", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (logs) Create ***");
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
                    BA.LogInfo("** Service (logs) Create **");
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
    	BA.LogInfo("** Service (logs) Start **");
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
            BA.LogInfo("** Service (logs) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (logs) Destroy **");
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
public static anywheresoftware.b4a.gps.GPS _gps = null;
public static boolean _tracking = false;
public static long _lastupdatetime = 0L;
public static anywheresoftware.b4a.phone.Phone.PhoneWakeState _lock = null;
public static int _bigcounter = 0;
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
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="logs";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=143458304;
 //BA.debugLineNum = 143458304;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=143458305;
 //BA.debugLineNum = 143458305;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_NEVER;
RDebugUtils.currentLine=143458306;
 //BA.debugLineNum = 143458306;BA.debugLine="lock.PartialLock";
_lock.PartialLock(processBA);
RDebugUtils.currentLine=143458307;
 //BA.debugLineNum = 143458307;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="logs";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=143523840;
 //BA.debugLineNum = 143523840;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=143523841;
 //BA.debugLineNum = 143523841;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_reset_install /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_in_execution /*boolean*/ )) { 
RDebugUtils.currentLine=143523842;
 //BA.debugLineNum = 143523842;BA.debugLine="StartServiceAt(Me, DateTime.Now + 600 * 1000, Tr";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,logs.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+600*1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=143523843;
 //BA.debugLineNum = 143523843;BA.debugLine="UpdateServer";
_updateserver();
 }else {
RDebugUtils.currentLine=143523845;
 //BA.debugLineNum = 143523845;BA.debugLine="Service.StopAutomaticForeground";
mostCurrent._service.StopAutomaticForeground();
 };
RDebugUtils.currentLine=143523847;
 //BA.debugLineNum = 143523847;BA.debugLine="End Sub";
return "";
}
public static void  _updateserver() throws Exception{
RDebugUtils.currentModule="logs";
if (Debug.shouldDelegate(processBA, "updateserver", false))
	 {Debug.delegate(processBA, "updateserver", null); return;}
ResumableSub_UpdateServer rsub = new ResumableSub_UpdateServer(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_UpdateServer extends BA.ResumableSub {
public ResumableSub_UpdateServer(xevolution.vrcg.devdemov2400.logs parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.logs parent;
xevolution.vrcg.devdemov2400.httpjob _job = null;
int _status = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="logs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=143589377;
 //BA.debugLineNum = 143589377;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
if (true) break;

case 1:
//if
this.state = 16;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._app_reset_install /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._app_in_execution /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=143589378;
 //BA.debugLineNum = 143589378;BA.debugLine="Dim Job As HttpJob = Utils.CallJobAPI(ShareCode.";
_job = parent.mostCurrent._utils._calljobapi /*xevolution.vrcg.devdemov2400.httpjob*/ (processBA,parent.mostCurrent._sharecode._app_logsupload /*String*/ ,parent.mostCurrent._utils._logs2server /*anywheresoftware.b4a.objects.collections.List*/ (processBA),logs.getObject(),"Logs");
RDebugUtils.currentLine=143589379;
 //BA.debugLineNum = 143589379;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "logs", "updateserver"), (Object)(_job));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=143589380;
 //BA.debugLineNum = 143589380;BA.debugLine="If Job.Success Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_job._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=143589381;
 //BA.debugLineNum = 143589381;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
_status = parent.mostCurrent._utils._jobapistatus /*int*/ (processBA,_job);
RDebugUtils.currentLine=143589382;
 //BA.debugLineNum = 143589382;BA.debugLine="If Status = 1 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_status==1) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=143589387;
 //BA.debugLineNum = 143589387;BA.debugLine="Log(\"Não foi possível actualizar o Servidor\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6143589387","Não foi possível actualizar o Servidor",0);
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=143589389;
 //BA.debugLineNum = 143589389;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=143589391;
 //BA.debugLineNum = 143589391;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}