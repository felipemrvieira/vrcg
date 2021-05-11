package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class backgroundupdateservice extends  android.app.Service{
	public static class backgroundupdateservice_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (backgroundupdateservice) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, backgroundupdateservice.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static backgroundupdateservice mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return backgroundupdateservice.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.backgroundupdateservice");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.backgroundupdateservice", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (backgroundupdateservice) Create ***");
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
                    BA.LogInfo("** Service (backgroundupdateservice) Create **");
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
    	BA.LogInfo("** Service (backgroundupdateservice) Start **");
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
            BA.LogInfo("** Service (backgroundupdateservice) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (backgroundupdateservice) Destroy **");
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
public static int _sqlfilestotal = 0;
public static String _requestfilename = "";
public static anywheresoftware.b4a.objects.collections.List _ftpfilelist = null;
public static String _tagcodesstring = "";
public static String _requesttagcodes = "";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkifupdateisavailable() throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "checkifupdateisavailable", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "checkifupdateisavailable", null));}
ResumableSub_CheckIfUpdateIsAvailable rsub = new ResumableSub_CheckIfUpdateIsAvailable(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckIfUpdateIsAvailable extends BA.ResumableSub {
public ResumableSub_CheckIfUpdateIsAvailable(xevolution.vrcg.devdemov2400.backgroundupdateservice parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _quicksyncdate = "";
String _loginupdatefilename = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
int _status = 0;
int _newrecordscount = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=117440514;
 //BA.debugLineNum = 117440514;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_quicksync.def"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=117440515;
 //BA.debugLineNum = 117440515;BA.debugLine="Dim QuickSyncDate As String = File.readstring(St";
_quicksyncdate = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_quicksync.def"));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=117440517;
 //BA.debugLineNum = 117440517;BA.debugLine="Dim QuickSyncDate As String = Utils.GetCurrDatet";
_quicksyncdate = parent.mostCurrent._utils._getcurrdatetime /*String*/ (processBA);
RDebugUtils.currentLine=117440518;
 //BA.debugLineNum = 117440518;BA.debugLine="File.writestring(Starter.InternalFolder,$\"${Shar";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_quicksync.def"),_quicksyncdate);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=117440521;
 //BA.debugLineNum = 117440521;BA.debugLine="Dim LoginUpdateFileName  As String= \"\"";
_loginupdatefilename = "";
RDebugUtils.currentLine=117440522;
 //BA.debugLineNum = 117440522;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=117440523;
 //BA.debugLineNum = 117440523;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=117440524;
 //BA.debugLineNum = 117440524;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=117440525;
 //BA.debugLineNum = 117440525;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=117440526;
 //BA.debugLineNum = 117440526;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=117440527;
 //BA.debugLineNum = 117440527;BA.debugLine="params.Put(\"name\", ShareCode.SESS_User)";
_params.Put((Object)("name"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=117440528;
 //BA.debugLineNum = 117440528;BA.debugLine="params.Put(\"datetime\", QuickSyncDate)";
_params.Put((Object)("datetime"),(Object)(_quicksyncdate));
RDebugUtils.currentLine=117440529;
 //BA.debugLineNum = 117440529;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=117440530;
 //BA.debugLineNum = 117440530;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=117440531;
 //BA.debugLineNum = 117440531;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=117440532;
 //BA.debugLineNum = 117440532;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=117440533;
 //BA.debugLineNum = 117440533;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=117440534;
 //BA.debugLineNum = 117440534;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=117440535;
 //BA.debugLineNum = 117440535;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=117440536;
 //BA.debugLineNum = 117440536;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=117440538;
 //BA.debugLineNum = 117440538;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=117440539;
 //BA.debugLineNum = 117440539;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=117440540;
 //BA.debugLineNum = 117440540;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=117440542;
 //BA.debugLineNum = 117440542;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440542",_data,0);
RDebugUtils.currentLine=117440544;
 //BA.debugLineNum = 117440544;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/requests-count-pending");
RDebugUtils.currentLine=117440545;
 //BA.debugLineNum = 117440545;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 7:
//if
this.state = 26;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 25;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=117440546;
 //BA.debugLineNum = 117440546;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=117440547;
 //BA.debugLineNum = 117440547;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",backgroundupdateservice.getObject());
RDebugUtils.currentLine=117440548;
 //BA.debugLineNum = 117440548;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=117440549;
 //BA.debugLineNum = 117440549;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=117440550;
 //BA.debugLineNum = 117440550;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "checkifupdateisavailable"), (Object)(_job));
this.state = 27;
return;
case 27:
//C
this.state = 10;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=117440551;
 //BA.debugLineNum = 117440551;BA.debugLine="If Job.Success Then";
if (true) break;

case 10:
//if
this.state = 23;
if (_job._success /*boolean*/ ) { 
this.state = 12;
}else {
this.state = 22;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=117440552;
 //BA.debugLineNum = 117440552;BA.debugLine="Log(\"Success\" & Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440552","Success"+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=117440554;
 //BA.debugLineNum = 117440554;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=117440555;
 //BA.debugLineNum = 117440555;BA.debugLine="JSON1.Initialize(Job.GetString)";
_json1.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=117440556;
 //BA.debugLineNum = 117440556;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=117440557;
 //BA.debugLineNum = 117440557;BA.debugLine="Dim status As Int = MapJSON.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("status"))));
RDebugUtils.currentLine=117440558;
 //BA.debugLineNum = 117440558;BA.debugLine="If (status = 1) Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((_status==1)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=117440559;
 //BA.debugLineNum = 117440559;BA.debugLine="Dim NewRecordsCount As Int = MapJSON.Get(\"resu";
_newrecordscount = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("results"))));
RDebugUtils.currentLine=117440561;
 //BA.debugLineNum = 117440561;BA.debugLine="If NewRecordsCount > 0 Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_newrecordscount>0) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=117440562;
 //BA.debugLineNum = 117440562;BA.debugLine="RequestTagcodes = MapJSON.Get(\"requestTagcode";
parent._requesttagcodes = BA.ObjectToString(_mapjson.Get((Object)("requestTagcodes")));
RDebugUtils.currentLine=117440563;
 //BA.debugLineNum = 117440563;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=117440564;
 //BA.debugLineNum = 117440564;BA.debugLine="Log(\">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440564",">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",0);
RDebugUtils.currentLine=117440565;
 //BA.debugLineNum = 117440565;BA.debugLine="Log(\"LITE UPDATES EXISTS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440565","LITE UPDATES EXISTS",0);
RDebugUtils.currentLine=117440566;
 //BA.debugLineNum = 117440566;BA.debugLine="Log(\">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440566",">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=117440572;
 //BA.debugLineNum = 117440572;BA.debugLine="Log(\"Success\" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440572","Success"+_job._errormessage /*String*/ ,0);
 if (true) break;

case 23:
//C
this.state = 26;
;
RDebugUtils.currentLine=117440574;
 //BA.debugLineNum = 117440574;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=117440576;
 //BA.debugLineNum = 117440576;BA.debugLine="Log(\"Error APP_WORKING_LOCAL\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440576","Error APP_WORKING_LOCAL",0);
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=117440578;
 //BA.debugLineNum = 117440578;BA.debugLine="Log(\">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440578",">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",0);
RDebugUtils.currentLine=117440579;
 //BA.debugLineNum = 117440579;BA.debugLine="Log(\"NO LITE UPDATES\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440579","NO LITE UPDATES",0);
RDebugUtils.currentLine=117440580;
 //BA.debugLineNum = 117440580;BA.debugLine="Log(\">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
anywheresoftware.b4a.keywords.Common.LogImpl("6117440580",">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",0);
RDebugUtils.currentLine=117440581;
 //BA.debugLineNum = 117440581;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=117440582;
 //BA.debugLineNum = 117440582;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletesqlfiles(String _filename) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "deletesqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "deletesqlfiles", new Object[] {_filename}));}
ResumableSub_DeleteSqlFiles rsub = new ResumableSub_DeleteSqlFiles(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteSqlFiles extends BA.ResumableSub {
public ResumableSub_DeleteSqlFiles(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _filename;
int _i = 0;
String _filen = "";
int step2;
int limit2;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=118030337;
 //BA.debugLineNum = 118030337;BA.debugLine="If(SqlFilesTotal > 0)Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((parent._sqlfilestotal>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=118030338;
 //BA.debugLineNum = 118030338;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 4:
//for
this.state = 11;
step2 = 1;
limit2 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 11;
if ((step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2)) this.state = 6;
if (true) break;

case 14:
//C
this.state = 13;
_i = ((int)(0 + _i + step2)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=118030339;
 //BA.debugLineNum = 118030339;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=118030340;
 //BA.debugLineNum = 118030340;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, f";
if (true) break;

case 7:
//if
this.state = 10;
if ((anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=118030341;
 //BA.debugLineNum = 118030341;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fil";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 10:
//C
this.state = 14;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=118030344;
 //BA.debugLineNum = 118030344;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=118030346;
 //BA.debugLineNum = 118030346;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=118030347;
 //BA.debugLineNum = 118030347;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadfileswithftp(anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "downloadfileswithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "downloadfileswithftp", new Object[] {_dlg}));}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,_dlg);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,anywheresoftware.b4a.objects.LabelWrapper _dlg) {
this.parent = parent;
this._dlg = _dlg;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
anywheresoftware.b4a.objects.LabelWrapper _dlg;
int _current_counter = 0;
int _end_counter = 0;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
long _lmdate = 0L;
int _i = 0;
String _fname = "";
Object _sf = null;
int step16;
int limit16;
int step32;
int limit32;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=118095873;
 //BA.debugLineNum = 118095873;BA.debugLine="Dim CURRENT_COUNTER As Int = 0";
_current_counter = (int) (0);
RDebugUtils.currentLine=118095874;
 //BA.debugLineNum = 118095874;BA.debugLine="Dim END_COUNTER As Int = 0";
_end_counter = (int) (0);
RDebugUtils.currentLine=118095875;
 //BA.debugLineNum = 118095875;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6118095875","************************************************************",0);
RDebugUtils.currentLine=118095876;
 //BA.debugLineNum = 118095876;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APPL_HOST}/${Share";
anywheresoftware.b4a.keywords.Common.LogImpl("6118095876",(" 		INITIAL : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=118095877;
 //BA.debugLineNum = 118095877;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6118095877","************************************************************",0);
RDebugUtils.currentLine=118095878;
 //BA.debugLineNum = 118095878;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=118095879;
 //BA.debugLineNum = 118095879;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=118095880;
 //BA.debugLineNum = 118095880;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=118095884;
 //BA.debugLineNum = 118095884;BA.debugLine="GlobalFTP.TimeoutMs =240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=118095885;
 //BA.debugLineNum = 118095885;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=118095889;
 //BA.debugLineNum = 118095889;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "downloadfileswithftp"), _sfl);
this.state = 49;
return;
case 49:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=118095890;
 //BA.debugLineNum = 118095890;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 22;
if (_success) { 
this.state = 3;
}else {
this.state = 21;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=118095895;
 //BA.debugLineNum = 118095895;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1) '";
_lmdate = parent.mostCurrent._utils._getlastndayslong /*long*/ (processBA,(int) (1));
RDebugUtils.currentLine=118095896;
 //BA.debugLineNum = 118095896;BA.debugLine="If (Files.Length >= 1) Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((_files.length>=1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=118095897;
 //BA.debugLineNum = 118095897;BA.debugLine="FTPFileList.Initialize";
parent._ftpfilelist.Initialize();
RDebugUtils.currentLine=118095898;
 //BA.debugLineNum = 118095898;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 7:
//for
this.state = 18;
step16 = 1;
limit16 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 50;
if (true) break;

case 50:
//C
this.state = 18;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 9;
if (true) break;

case 51:
//C
this.state = 50;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=118095899;
 //BA.debugLineNum = 118095899;BA.debugLine="Dim fName As String = Files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=118095900;
 //BA.debugLineNum = 118095900;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
if (true) break;

case 10:
//if
this.state = 17;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".jpeg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".doc")) || (_fname.endsWith(".docx")) || (_fname.endsWith(".xls")) || (_fname.endsWith(".xlsx")) || (_fname.endsWith(".ppt")) || (_fname.endsWith(".pptx"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=118095904;
 //BA.debugLineNum = 118095904;BA.debugLine="If (Files(i).Timestamp >= LMDate) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_files[_i].getTimestamp()>=_lmdate)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=118095905;
 //BA.debugLineNum = 118095905;BA.debugLine="FTPFileList.Add(Files(i).Name)";
parent._ftpfilelist.Add((Object)(_files[_i].getName()));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 51;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=118095911;
 //BA.debugLineNum = 118095911;BA.debugLine="Log(\"error getting files list\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118095911","error getting files list",0);
RDebugUtils.currentLine=118095912;
 //BA.debugLineNum = 118095912;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
_current_counter = _end_counter;
 if (true) break;
;
RDebugUtils.currentLine=118095915;
 //BA.debugLineNum = 118095915;BA.debugLine="If (FTPFileList.IsInitialized) Then";

case 22:
//if
this.state = 48;
if ((parent._ftpfilelist.IsInitialized())) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=118095916;
 //BA.debugLineNum = 118095916;BA.debugLine="If (FTPFileList.Size>=1) Then";
if (true) break;

case 25:
//if
this.state = 47;
if ((parent._ftpfilelist.getSize()>=1)) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=118095917;
 //BA.debugLineNum = 118095917;BA.debugLine="END_COUNTER = FTPFileList.Size-1";
_end_counter = (int) (parent._ftpfilelist.getSize()-1);
RDebugUtils.currentLine=118095918;
 //BA.debugLineNum = 118095918;BA.debugLine="For i=0 To FTPFileList.Size-1";
if (true) break;

case 28:
//for
this.state = 46;
step32 = 1;
limit32 = (int) (parent._ftpfilelist.getSize()-1);
_i = (int) (0) ;
this.state = 52;
if (true) break;

case 52:
//C
this.state = 46;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 30;
if (true) break;

case 53:
//C
this.state = 52;
_i = ((int)(0 + _i + step32)) ;
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=118095919;
 //BA.debugLineNum = 118095919;BA.debugLine="Dim fName As String = FTPFileList.Get(i)";
_fname = BA.ObjectToString(parent._ftpfilelist.Get(_i));
RDebugUtils.currentLine=118095921;
 //BA.debugLineNum = 118095921;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("6118095921",_fname,0);
RDebugUtils.currentLine=118095922;
 //BA.debugLineNum = 118095922;BA.debugLine="Try";
if (true) break;

case 31:
//try
this.state = 42;
this.catchState = 41;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 41;
RDebugUtils.currentLine=118095923;
 //BA.debugLineNum = 118095923;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=118095924;
 //BA.debugLineNum = 118095924;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "downloadfileswithftp"), _sf);
this.state = 54;
return;
case 54:
//C
this.state = 34;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=118095926;
 //BA.debugLineNum = 118095926;BA.debugLine="If Success Then";
if (true) break;

case 34:
//if
this.state = 39;
if (_success) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
RDebugUtils.currentLine=118095927;
 //BA.debugLineNum = 118095927;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118095927","file was download successfully",0);
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=118095930;
 //BA.debugLineNum = 118095930;BA.debugLine="Log(\"Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118095930","Error downloading file",0);
 if (true) break;

case 39:
//C
this.state = 42;
;
 if (true) break;

case 41:
//C
this.state = 42;
this.catchState = 0;
RDebugUtils.currentLine=118095934;
 //BA.debugLineNum = 118095934;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6118095934",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=118095937;
 //BA.debugLineNum = 118095937;BA.debugLine="If (FTPFileList.Size-1 > CURRENT_COUNTER) Then";

case 42:
//if
this.state = 45;
this.catchState = 0;
if ((parent._ftpfilelist.getSize()-1>_current_counter)) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=118095938;
 //BA.debugLineNum = 118095938;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER+1";
_current_counter = (int) (_current_counter+1);
 if (true) break;

case 45:
//C
this.state = 53;
;
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = -1;
;
RDebugUtils.currentLine=118095944;
 //BA.debugLineNum = 118095944;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=118095945;
 //BA.debugLineNum = 118095945;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=118095946;
 //BA.debugLineNum = 118095946;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadsqlfilesliteupdate(String _fileinfo,String _filename) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "downloadsqlfilesliteupdate", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "downloadsqlfilesliteupdate", new Object[] {_fileinfo,_filename}));}
ResumableSub_DownloadSqlFilesLiteUpdate rsub = new ResumableSub_DownloadSqlFilesLiteUpdate(null,_fileinfo,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadSqlFilesLiteUpdate extends BA.ResumableSub {
public ResumableSub_DownloadSqlFilesLiteUpdate(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,String _fileinfo,String _filename) {
this.parent = parent;
this._fileinfo = _fileinfo;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _fileinfo;
String _filename;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
int _result = 0;
int _i = 0;
String _filen = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _finish = false;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=117637122;
 //BA.debugLineNum = 117637122;BA.debugLine="SqlFilesTotal = 0";
parent._sqlfilestotal = (int) (0);
RDebugUtils.currentLine=117637123;
 //BA.debugLineNum = 117637123;BA.debugLine="Dim res As ResumableSub = GetLoginUpdateInstalSql";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _getloginupdateinstalsqlfilestotal(_fileinfo);
RDebugUtils.currentLine=117637124;
 //BA.debugLineNum = 117637124;BA.debugLine="Wait For(res) complete (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "downloadsqlfilesliteupdate"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=117637125;
 //BA.debugLineNum = 117637125;BA.debugLine="SqlFilesTotal = result";
parent._sqlfilestotal = _result;
RDebugUtils.currentLine=117637129;
 //BA.debugLineNum = 117637129;BA.debugLine="If(SqlFilesTotal > 0)Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((parent._sqlfilestotal>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=117637130;
 //BA.debugLineNum = 117637130;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=117637131;
 //BA.debugLineNum = 117637131;BA.debugLine="Dim Filen As String = $\"${Filename}${i}.sql\"$";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=117637132;
 //BA.debugLineNum = 117637132;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithFTP";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadsqlfilewithftp(_filen);
RDebugUtils.currentLine=117637133;
 //BA.debugLineNum = 117637133;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "downloadsqlfilesliteupdate"), _rs);
this.state = 12;
return;
case 12:
//C
this.state = 11;
_finish = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=117637135;
 //BA.debugLineNum = 117637135;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=117637138;
 //BA.debugLineNum = 117637138;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=117637139;
 //BA.debugLineNum = 117637139;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getloginupdateinstalsqlfilestotal(String _filename) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "getloginupdateinstalsqlfilestotal", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "getloginupdateinstalsqlfilestotal", new Object[] {_filename}));}
ResumableSub_GetLoginUpdateInstalSqlFilesTotal rsub = new ResumableSub_GetLoginUpdateInstalSqlFilesTotal(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetLoginUpdateInstalSqlFilesTotal extends BA.ResumableSub {
public ResumableSub_GetLoginUpdateInstalSqlFilesTotal(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _filename;
int _trycount = 0;
boolean _dotry = false;
int _total = 0;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager _ctm = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;
String _jsonstruct = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _datahora = "";
int _totalfiles = 0;
anywheresoftware.b4a.objects.collections.List _inserts = null;
anywheresoftware.b4a.objects.collections.Map _colinserts = null;
String _mastertagcode = "";
String _childfield = "";
String _tagcodelist = "";
anywheresoftware.b4a.objects.collections.List _newinfolist = null;
String _table = "";
int _i = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _result = false;
String _date = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
anywheresoftware.b4a.BA.IterableList group26;
int index26;
int groupLen26;
int step37;
int limit37;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=117702657;
 //BA.debugLineNum = 117702657;BA.debugLine="TagCodesString = \"\"";
parent._tagcodesstring = "";
RDebugUtils.currentLine=117702658;
 //BA.debugLineNum = 117702658;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=117702659;
 //BA.debugLineNum = 117702659;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=117702660;
 //BA.debugLineNum = 117702660;BA.debugLine="Dim total As Int = -1";
_total = (int) (-1);
RDebugUtils.currentLine=117702661;
 //BA.debugLineNum = 117702661;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=117702662;
 //BA.debugLineNum = 117702662;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=117702663;
 //BA.debugLineNum = 117702663;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=117702664;
 //BA.debugLineNum = 117702664;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=117702665;
 //BA.debugLineNum = 117702665;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=117702666;
 //BA.debugLineNum = 117702666;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=117702667;
 //BA.debugLineNum = 117702667;BA.debugLine="GlobalFTP.TimeoutMs =240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=117702668;
 //BA.debugLineNum = 117702668;BA.debugLine="Do While (dotry And (trycount <3))";
if (true) break;

case 1:
//do while
this.state = 36;
while ((_dotry && (_trycount<3))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=117702669;
 //BA.debugLineNum = 117702669;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=117702670;
 //BA.debugLineNum = 117702670;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "getloginupdateinstalsqlfilestotal"), _sf);
this.state = 37;
return;
case 37:
//C
this.state = 4;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=117702672;
 //BA.debugLineNum = 117702672;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 35;
if (_success) { 
this.state = 6;
}else {
this.state = 34;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=117702674;
 //BA.debugLineNum = 117702674;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 32;
this.catchState = 31;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 31;
RDebugUtils.currentLine=117702675;
 //BA.debugLineNum = 117702675;BA.debugLine="Log(Filename & \" file was download successfull";
anywheresoftware.b4a.keywords.Common.LogImpl("6117702675",_filename+" file was download successfully",0);
RDebugUtils.currentLine=117702677;
 //BA.debugLineNum = 117702677;BA.debugLine="If ShareCode.newReturn = 1 Then";
if (true) break;

case 10:
//if
this.state = 29;
if (parent.mostCurrent._sharecode._newreturn /*int*/ ==1) { 
this.state = 12;
}else {
this.state = 28;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=117702678;
 //BA.debugLineNum = 117702678;BA.debugLine="Dim JsonStruct As String = File.readstring(St";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=117702679;
 //BA.debugLineNum = 117702679;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=117702680;
 //BA.debugLineNum = 117702680;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=117702681;
 //BA.debugLineNum = 117702681;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=117702682;
 //BA.debugLineNum = 117702682;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=117702683;
 //BA.debugLineNum = 117702683;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
_totalfiles = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=117702684;
 //BA.debugLineNum = 117702684;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=117702689;
 //BA.debugLineNum = 117702689;BA.debugLine="For Each colinserts As Map In inserts";
if (true) break;

case 13:
//for
this.state = 26;
_colinserts = new anywheresoftware.b4a.objects.collections.Map();
group26 = _inserts;
index26 = 0;
groupLen26 = group26.getSize();
this.state = 38;
if (true) break;

case 38:
//C
this.state = 26;
if (index26 < groupLen26) {
this.state = 15;
_colinserts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group26.Get(index26)));}
if (true) break;

case 39:
//C
this.state = 38;
index26++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=117702690;
 //BA.debugLineNum = 117702690;BA.debugLine="Dim mastertagcode As String = colinserts.Get";
_mastertagcode = BA.ObjectToString(_colinserts.Get((Object)("mastertagcode")));
RDebugUtils.currentLine=117702691;
 //BA.debugLineNum = 117702691;BA.debugLine="Try";
if (true) break;

case 16:
//try
this.state = 21;
this.catchState = 20;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 21;
this.catchState = 20;
RDebugUtils.currentLine=117702692;
 //BA.debugLineNum = 117702692;BA.debugLine="Dim childfield As String = colinserts.Get(\"";
_childfield = BA.ObjectToString(_colinserts.Get((Object)("childfield")));
 if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 31;
RDebugUtils.currentLine=117702694;
 //BA.debugLineNum = 117702694;BA.debugLine="Dim childfield As String = \"\"";
_childfield = "";
RDebugUtils.currentLine=117702695;
 //BA.debugLineNum = 117702695;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117702695",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 31;
;
RDebugUtils.currentLine=117702697;
 //BA.debugLineNum = 117702697;BA.debugLine="Dim tagcodelist As String = colinserts.Get(\"";
_tagcodelist = BA.ObjectToString(_colinserts.Get((Object)("tagcodelist")));
RDebugUtils.currentLine=117702698;
 //BA.debugLineNum = 117702698;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\",";
_newinfolist = new anywheresoftware.b4a.objects.collections.List();
_newinfolist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_tagcodelist));
RDebugUtils.currentLine=117702699;
 //BA.debugLineNum = 117702699;BA.debugLine="Dim table As String = colinserts.Get(\"table\"";
_table = BA.ObjectToString(_colinserts.Get((Object)("table")));
RDebugUtils.currentLine=117702701;
 //BA.debugLineNum = 117702701;BA.debugLine="For i=0 To NewInfoList.Size -1";
if (true) break;

case 22:
//for
this.state = 25;
step37 = 1;
limit37 = (int) (_newinfolist.getSize()-1);
_i = (int) (0) ;
this.state = 40;
if (true) break;

case 40:
//C
this.state = 25;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 24;
if (true) break;

case 41:
//C
this.state = 40;
_i = ((int)(0 + _i + step37)) ;
if (true) break;

case 24:
//C
this.state = 41;
RDebugUtils.currentLine=117702702;
 //BA.debugLineNum = 117702702;BA.debugLine="Dim res As ResumableSub = DBStructures.Remo";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (processBA,_table,_mastertagcode,_childfield,"",BA.ObjectToString(_newinfolist.Get(_i)));
RDebugUtils.currentLine=117702703;
 //BA.debugLineNum = 117702703;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "getloginupdateinstalsqlfilestotal"), _res);
this.state = 42;
return;
case 42:
//C
this.state = 41;
_result = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 39;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
;
RDebugUtils.currentLine=117702708;
 //BA.debugLineNum = 117702708;BA.debugLine="total = Totalfiles";
_total = _totalfiles;
RDebugUtils.currentLine=117702709;
 //BA.debugLineNum = 117702709;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=117702710;
 //BA.debugLineNum = 117702710;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (processBA,_date);
RDebugUtils.currentLine=117702711;
 //BA.debugLineNum = 117702711;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (processBA,_date);
RDebugUtils.currentLine=117702712;
 //BA.debugLineNum = 117702712;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=117702713;
 //BA.debugLineNum = 117702713;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=117702714;
 //BA.debugLineNum = 117702714;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=117702717;
 //BA.debugLineNum = 117702717;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=117702718;
 //BA.debugLineNum = 117702718;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=117702719;
 //BA.debugLineNum = 117702719;BA.debugLine="total = List1.Get(0) ' Numero de ficheiros pa";
_total = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=117702720;
 //BA.debugLineNum = 117702720;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=117702721;
 //BA.debugLineNum = 117702721;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (processBA,_date);
RDebugUtils.currentLine=117702722;
 //BA.debugLineNum = 117702722;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (processBA,_date);
RDebugUtils.currentLine=117702723;
 //BA.debugLineNum = 117702723;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=117702724;
 //BA.debugLineNum = 117702724;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=117702725;
 //BA.debugLineNum = 117702725;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=117702729;
 //BA.debugLineNum = 117702729;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117702729",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=117702730;
 //BA.debugLineNum = 117702730;BA.debugLine="trycount = trycount +1";
_trycount = (int) (_trycount+1);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=117702734;
 //BA.debugLineNum = 117702734;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117702734",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=117702735;
 //BA.debugLineNum = 117702735;BA.debugLine="Log(\"Error downloading file \" & Filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117702735","Error downloading file "+_filename,0);
RDebugUtils.currentLine=117702736;
 //BA.debugLineNum = 117702736;BA.debugLine="trycount = trycount +1";
_trycount = (int) (_trycount+1);
 if (true) break;

case 35:
//C
this.state = 1;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=117702741;
 //BA.debugLineNum = 117702741;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=117702742;
 //BA.debugLineNum = 117702742;BA.debugLine="Return total";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_total));return;};
RDebugUtils.currentLine=117702743;
 //BA.debugLineNum = 117702743;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadsqlfilewithftp(String _filename) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "downloadsqlfilewithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "downloadsqlfilewithftp", new Object[] {_filename}));}
ResumableSub_DownloadSqlFileWithFTP rsub = new ResumableSub_DownloadSqlFileWithFTP(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadSqlFileWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadSqlFileWithFTP(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _filename;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=117768194;
 //BA.debugLineNum = 117768194;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=117768195;
 //BA.debugLineNum = 117768195;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=117768196;
 //BA.debugLineNum = 117768196;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=117768197;
 //BA.debugLineNum = 117768197;BA.debugLine="GlobalFTP.TimeoutMs =240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=117768198;
 //BA.debugLineNum = 117768198;BA.debugLine="Log(Filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117768198",_filename,0);
RDebugUtils.currentLine=117768199;
 //BA.debugLineNum = 117768199;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" & S";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=117768200;
 //BA.debugLineNum = 117768200;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "downloadsqlfilewithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=117768202;
 //BA.debugLineNum = 117768202;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=117768203;
 //BA.debugLineNum = 117768203;BA.debugLine="Log(Filename & \" file was download successfully\"";
anywheresoftware.b4a.keywords.Common.LogImpl("6117768203",_filename+" file was download successfully",0);
RDebugUtils.currentLine=117768204;
 //BA.debugLineNum = 117768204;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=117768205;
 //BA.debugLineNum = 117768205;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=117768207;
 //BA.debugLineNum = 117768207;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=117768208;
 //BA.debugLineNum = 117768208;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=117768209;
 //BA.debugLineNum = 117768209;BA.debugLine="Log(\"Error downloading file \" & Filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117768209","Error downloading file "+_filename,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=117768211;
 //BA.debugLineNum = 117768211;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executesqlfiles(String _filename) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "executesqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "executesqlfiles", new Object[] {_filename}));}
ResumableSub_ExecuteSqlFiles rsub = new ResumableSub_ExecuteSqlFiles(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecuteSqlFiles extends BA.ResumableSub {
public ResumableSub_ExecuteSqlFiles(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _filename;
int _i = 0;
String _filen = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _n = 0;
String _script2execute = "";
anywheresoftware.b4a.objects.collections.List _splitscript = null;
int _x = 0;
String _dummy = "";
String _request_tagcode = "";
int step7;
int limit7;
int step16;
int limit16;
int step23;
int limit23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=117833729;
 //BA.debugLineNum = 117833729;BA.debugLine="If(SqlFilesTotal > 0)Then";
if (true) break;

case 1:
//if
this.state = 46;
if ((parent._sqlfilestotal>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=117833732;
 //BA.debugLineNum = 117833732;BA.debugLine="If ShareCode.NewRequestsList.IsInitialized Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent._sharecode._newrequestslist /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=117833733;
 //BA.debugLineNum = 117833733;BA.debugLine="ShareCode.NewRequestsList.Clear";
parent.mostCurrent._sharecode._newrequestslist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=117833735;
 //BA.debugLineNum = 117833735;BA.debugLine="ShareCode.NewRequestsList.Initialize";
parent.mostCurrent._sharecode._newrequestslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 if (true) break;
;
RDebugUtils.currentLine=117833738;
 //BA.debugLineNum = 117833738;BA.debugLine="For i = 1 To SqlFilesTotal";

case 9:
//for
this.state = 45;
step7 = 1;
limit7 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 45;
if ((step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7)) this.state = 11;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step7)) ;
if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=117833739;
 //BA.debugLineNum = 117833739;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=117833740;
 //BA.debugLineNum = 117833740;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=117833742;
 //BA.debugLineNum = 117833742;BA.debugLine="Try";
if (true) break;

case 12:
//try
this.state = 17;
this.catchState = 16;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 17;
this.catchState = 16;
RDebugUtils.currentLine=117833743;
 //BA.debugLineNum = 117833743;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedF";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
RDebugUtils.currentLine=117833745;
 //BA.debugLineNum = 117833745;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117833745",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=117833748;
 //BA.debugLineNum = 117833748;BA.debugLine="If (List1.IsInitialized) Then";

case 17:
//if
this.state = 44;
this.catchState = 0;
if ((_list1.IsInitialized())) { 
this.state = 19;
}else {
this.state = 43;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=117833749;
 //BA.debugLineNum = 117833749;BA.debugLine="For n = 0 To List1.Size - 1";
if (true) break;

case 20:
//for
this.state = 41;
step16 = 1;
limit16 = (int) (_list1.getSize()-1);
_n = (int) (0) ;
this.state = 49;
if (true) break;

case 49:
//C
this.state = 41;
if ((step16 > 0 && _n <= limit16) || (step16 < 0 && _n >= limit16)) this.state = 22;
if (true) break;

case 50:
//C
this.state = 49;
_n = ((int)(0 + _n + step16)) ;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=117833750;
 //BA.debugLineNum = 117833750;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
_script2execute = BA.ObjectToString(_list1.Get(_n));
RDebugUtils.currentLine=117833751;
 //BA.debugLineNum = 117833751;BA.debugLine="Log(Script2Execute)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117833751",_script2execute,0);
RDebugUtils.currentLine=117833754;
 //BA.debugLineNum = 117833754;BA.debugLine="Try";
if (true) break;

case 23:
//try
this.state = 40;
this.catchState = 39;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 39;
RDebugUtils.currentLine=117833755;
 //BA.debugLineNum = 117833755;BA.debugLine="Utils.SaveSQLToLog(\"BackgroundUpdateService\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (processBA,"BackgroundUpdateService",_script2execute,"");
RDebugUtils.currentLine=117833761;
 //BA.debugLineNum = 117833761;BA.debugLine="If Script2Execute.Contains(\"INSERT INTO `dta";
if (true) break;

case 26:
//if
this.state = 37;
if (_script2execute.contains("INSERT INTO `dta_requests`")) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=117833762;
 //BA.debugLineNum = 117833762;BA.debugLine="Dim SplitScript As List  = Regex.Split(\",\",";
_splitscript = new anywheresoftware.b4a.objects.collections.List();
_splitscript = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(",",_script2execute));
RDebugUtils.currentLine=117833763;
 //BA.debugLineNum = 117833763;BA.debugLine="For x=0 To SplitScript.Size -1";
if (true) break;

case 29:
//for
this.state = 36;
step23 = 1;
limit23 = (int) (_splitscript.getSize()-1);
_x = (int) (0) ;
this.state = 51;
if (true) break;

case 51:
//C
this.state = 36;
if ((step23 > 0 && _x <= limit23) || (step23 < 0 && _x >= limit23)) this.state = 31;
if (true) break;

case 52:
//C
this.state = 51;
_x = ((int)(0 + _x + step23)) ;
if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=117833764;
 //BA.debugLineNum = 117833764;BA.debugLine="Dim dummy As String = SplitScript.Get(x)";
_dummy = BA.ObjectToString(_splitscript.Get(_x));
RDebugUtils.currentLine=117833765;
 //BA.debugLineNum = 117833765;BA.debugLine="If dummy.StartsWith(\"'I_\") Or dummy.Starts";
if (true) break;

case 32:
//if
this.state = 35;
if (_dummy.startsWith("'I_") || _dummy.startsWith("'IP_")) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=117833766;
 //BA.debugLineNum = 117833766;BA.debugLine="Dim Request_tagcode As String = SplitScri";
_request_tagcode = BA.ObjectToString(_splitscript.Get(_x));
RDebugUtils.currentLine=117833767;
 //BA.debugLineNum = 117833767;BA.debugLine="Request_tagcode = Request_tagcode.Replace";
_request_tagcode = _request_tagcode.replace("'","");
RDebugUtils.currentLine=117833768;
 //BA.debugLineNum = 117833768;BA.debugLine="ShareCode.NewRequestsList.Add(Request_tag";
parent.mostCurrent._sharecode._newrequestslist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_request_tagcode));
 if (true) break;

case 35:
//C
this.state = 52;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = 40;
;
 if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 0;
RDebugUtils.currentLine=117833775;
 //BA.debugLineNum = 117833775;BA.debugLine="Log($\"ERROR: ${Script2Execute} - EXCEPTION =";
anywheresoftware.b4a.keywords.Common.LogImpl("6117833775",("ERROR: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_script2execute))+" - EXCEPTION = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(processBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = 50;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 41:
//C
this.state = 44;
;
 if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=117833779;
 //BA.debugLineNum = 117833779;BA.debugLine="Utils.logError(\"Update SQL\", ShareCode.SESS_OP";
parent.mostCurrent._utils._logerror /*String*/ (processBA,"Update SQL",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql"));
 if (true) break;

case 44:
//C
this.state = 48;
;
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=117833783;
 //BA.debugLineNum = 117833783;BA.debugLine="InsertAlertNewRequests";
_insertalertnewrequests();
RDebugUtils.currentLine=117833784;
 //BA.debugLineNum = 117833784;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 46:
//C
this.state = -1;
;
RDebugUtils.currentLine=117833789;
 //BA.debugLineNum = 117833789;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=117833790;
 //BA.debugLineNum = 117833790;BA.debugLine="End Sub";
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
public static String  _insertalertnewrequests() throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "insertalertnewrequests", false))
	 {return ((String) Debug.delegate(processBA, "insertalertnewrequests", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _nrecord = null;
String _alert_text = "";
int _x = 0;
String _itemfromlist = "";
String _ssql = "";
String _intervencao = "";
String _nomeobjecto = "";
String _tipointervencao = "";
String _numerocliente = "";
String _nomecliente = "";
String _estabelecimento = "";
String _morada = "";
String _cpostal = "";
String _localidade = "";
String _latitude = "";
String _longitude = "";
String _datareq = "";
String _horareq = "";
String _alertsloc = "";
int _mid = 0;
String _alerttagcode = "";
String _ssql1 = "";
String _ssql2 = "";
RDebugUtils.currentLine=117899264;
 //BA.debugLineNum = 117899264;BA.debugLine="Sub InsertAlertNewRequests";
RDebugUtils.currentLine=117899266;
 //BA.debugLineNum = 117899266;BA.debugLine="Log(\"INSERT ALERTA BACKGROUNDUPDATESERVICE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6117899266","INSERT ALERTA BACKGROUNDUPDATESERVICE",0);
RDebugUtils.currentLine=117899267;
 //BA.debugLineNum = 117899267;BA.debugLine="Private nRecord As Cursor";
_nrecord = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=117899268;
 //BA.debugLineNum = 117899268;BA.debugLine="If ShareCode.NewRequestsList.Size > 0 Then";
if (mostCurrent._sharecode._newrequestslist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=117899269;
 //BA.debugLineNum = 117899269;BA.debugLine="Dim Alert_text As String = \"\"";
_alert_text = "";
RDebugUtils.currentLine=117899270;
 //BA.debugLineNum = 117899270;BA.debugLine="For x=0 To ShareCode.NewRequestsList.Size -1";
{
final int step5 = 1;
final int limit5 = (int) (mostCurrent._sharecode._newrequestslist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_x = (int) (0) ;
for (;_x <= limit5 ;_x = _x + step5 ) {
RDebugUtils.currentLine=117899271;
 //BA.debugLineNum = 117899271;BA.debugLine="Dim ItemFromList As String = ShareCode.NewReque";
_itemfromlist = BA.ObjectToString(mostCurrent._sharecode._newrequestslist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_x));
RDebugUtils.currentLine=117899273;
 //BA.debugLineNum = 117899273;BA.debugLine="Dim sSQL As String = $\"SELECT  t.title as tipoi";
_ssql = ("SELECT  t.title as tipointervencao , ifnull(o.title_import,'') as nomeobjecto , r.tagcode as intervencao ,\n"+"					r.entity_tagcode,p.title_import AS nomecliente,ifnull(p.reference, 'x') AS numerocliente,o.title_import AS estabelecimento,\n"+"					r.req_date as datareq, r.req_time as horareq, l.address as morada, l.postalcode as cpostal, l.local as localidade,\n"+"					l.latitude as latitude, l.longitude as longitude from dta_requests AS r\n"+"					INNER JOIN dta_typerequests AS t ON (t.tagcode = r.typerequest_tagcode)\n"+"					LEFT JOIN dta_objects AS o ON (o.tagcode = r.object_tagcode)\n"+"					LEFT JOIN dta_objects AS p ON (p.tagcode = r.entity_tagcode)\n"+"					LEFT JOIN dta_locations as l on (l.tagcode = p.local_tagcode)\n"+"					WHERE 1=1 and r.tagcode ='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemfromlist.trim()))+"'");
RDebugUtils.currentLine=117899283;
 //BA.debugLineNum = 117899283;BA.debugLine="nRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_nrecord = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=117899285;
 //BA.debugLineNum = 117899285;BA.debugLine="If nRecord.RowCount > 0 Then";
if (_nrecord.getRowCount()>0) { 
RDebugUtils.currentLine=117899286;
 //BA.debugLineNum = 117899286;BA.debugLine="nRecord.Position = 0";
_nrecord.setPosition((int) (0));
RDebugUtils.currentLine=117899287;
 //BA.debugLineNum = 117899287;BA.debugLine="Dim intervencao As String = nRecord.GetString(";
_intervencao = _nrecord.GetString("intervencao");
RDebugUtils.currentLine=117899288;
 //BA.debugLineNum = 117899288;BA.debugLine="Dim nomeobjecto As String = nRecord.GetString(";
_nomeobjecto = _nrecord.GetString("nomeobjecto");
RDebugUtils.currentLine=117899289;
 //BA.debugLineNum = 117899289;BA.debugLine="Dim tipointervencao As String = nRecord.GetStr";
_tipointervencao = _nrecord.GetString("tipointervencao");
RDebugUtils.currentLine=117899290;
 //BA.debugLineNum = 117899290;BA.debugLine="Dim numerocliente As String = nRecord.GetStrin";
_numerocliente = _nrecord.GetString("numerocliente");
RDebugUtils.currentLine=117899291;
 //BA.debugLineNum = 117899291;BA.debugLine="Dim nomecliente As String = nRecord.GetString(";
_nomecliente = _nrecord.GetString("nomecliente");
RDebugUtils.currentLine=117899292;
 //BA.debugLineNum = 117899292;BA.debugLine="Dim estabelecimento As String = nRecord.GetStr";
_estabelecimento = _nrecord.GetString("estabelecimento");
RDebugUtils.currentLine=117899293;
 //BA.debugLineNum = 117899293;BA.debugLine="Dim morada As String = nRecord.GetString(\"mora";
_morada = _nrecord.GetString("morada");
RDebugUtils.currentLine=117899294;
 //BA.debugLineNum = 117899294;BA.debugLine="Dim cpostal As String = nRecord.GetString(\"cpo";
_cpostal = _nrecord.GetString("cpostal");
RDebugUtils.currentLine=117899295;
 //BA.debugLineNum = 117899295;BA.debugLine="Dim localidade As String = nRecord.GetString(\"";
_localidade = _nrecord.GetString("localidade");
RDebugUtils.currentLine=117899296;
 //BA.debugLineNum = 117899296;BA.debugLine="Dim latitude As String = nRecord.GetString(\"la";
_latitude = _nrecord.GetString("latitude");
RDebugUtils.currentLine=117899297;
 //BA.debugLineNum = 117899297;BA.debugLine="Dim longitude As String = nRecord.GetString(\"l";
_longitude = _nrecord.GetString("longitude");
RDebugUtils.currentLine=117899298;
 //BA.debugLineNum = 117899298;BA.debugLine="Dim datareq As String = Utils.IfNullOrEmpty(nR";
_datareq = mostCurrent._utils._ifnullorempty /*String*/ (processBA,_nrecord.GetString("datareq"),mostCurrent._utils._getcurrentdate /*String*/ (processBA));
RDebugUtils.currentLine=117899299;
 //BA.debugLineNum = 117899299;BA.debugLine="Dim horareq As String = Utils.IfNullOrEmpty(nR";
_horareq = mostCurrent._utils._ifnullorempty /*String*/ (processBA,_nrecord.GetString("horareq"),mostCurrent._utils._getcurrenttimeext /*String*/ (processBA));
RDebugUtils.currentLine=117899300;
 //BA.debugLineNum = 117899300;BA.debugLine="If numerocliente = \"\" Then numerocliente = \"0\"";
if ((_numerocliente).equals("")) { 
_numerocliente = "0";};
RDebugUtils.currentLine=117899301;
 //BA.debugLineNum = 117899301;BA.debugLine="Dim AlertsLoc As String = $\"${datareq} - ${hor";
_alertsloc = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datareq))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_horareq))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_latitude))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_longitude))+"");
RDebugUtils.currentLine=117899302;
 //BA.debugLineNum = 117899302;BA.debugLine="Alert_text = Alert_text & $\"${tipointervencao}";
_alert_text = _alert_text+(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tipointervencao))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nomeobjecto))+" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_intervencao))+")"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_numerocliente))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nomecliente))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_estabelecimento))+"");
 };
 }
};
RDebugUtils.currentLine=117899307;
 //BA.debugLineNum = 117899307;BA.debugLine="nRecord.close";
_nrecord.Close();
RDebugUtils.currentLine=117899308;
 //BA.debugLineNum = 117899308;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_a";
_mid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (processBA,"dta_alerts","id","")+1+1000000);
RDebugUtils.currentLine=117899309;
 //BA.debugLineNum = 117899309;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateT";
_alerttagcode = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._generatetagcode /*String*/ (processBA,"ALERTINF_")))+"");
RDebugUtils.currentLine=117899310;
 //BA.debugLineNum = 117899310;BA.debugLine="Dim sSQL1 As String = $\"insert into dta_alerts (";
_ssql1 = ("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"+"							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"+"							values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '', 'ALRTREL_REQUESTS', 'ALRTTYP_REQUESTS', 1, 1, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alert_text))+"', \n"+"		'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._getcurrentdate /*String*/ (processBA)))+"', '', 1, 1, 0, 0)");
RDebugUtils.currentLine=117899314;
 //BA.debugLineNum = 117899314;BA.debugLine="Utils.SaveSQLToLog(\"InsertAlertNewRequests\",sSQL";
mostCurrent._utils._savesqltolog /*boolean*/ (processBA,"InsertAlertNewRequests",_ssql1,"");
RDebugUtils.currentLine=117899316;
 //BA.debugLineNum = 117899316;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_a";
_mid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (processBA,"dta_alerts_images","id","")+1+1000000);
RDebugUtils.currentLine=117899317;
 //BA.debugLineNum = 117899317;BA.debugLine="Dim sSQL2 As String = $\"insert into dta_alerts_i";
_ssql2 = ("insert into dta_alerts_images\n"+"				(id, tagcode, imageb64, imagename, assigned, active, obs)\n"+"				values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '', '', 0, 1, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alertsloc))+"')");
RDebugUtils.currentLine=117899320;
 //BA.debugLineNum = 117899320;BA.debugLine="Utils.SaveSQLToLog(\"InsertAlertNewRequests_obs\",";
mostCurrent._utils._savesqltolog /*boolean*/ (processBA,"InsertAlertNewRequests_obs",_ssql2,"");
RDebugUtils.currentLine=117899322;
 //BA.debugLineNum = 117899322;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._mainmenu.getObject()),"BadgeCheckUpdate");
 };
RDebugUtils.currentLine=117899328;
 //BA.debugLineNum = 117899328;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _generateliteupdatefiles() throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "generateliteupdatefiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "generateliteupdatefiles", null));}
ResumableSub_GenerateLiteUpdateFiles rsub = new ResumableSub_GenerateLiteUpdateFiles(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GenerateLiteUpdateFiles extends BA.ResumableSub {
public ResumableSub_GenerateLiteUpdateFiles(xevolution.vrcg.devdemov2400.backgroundupdateservice parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _quicksyncdate = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=117571586;
 //BA.debugLineNum = 117571586;BA.debugLine="Dim QuickSyncDate As String = File.readstring(Sta";
_quicksyncdate = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_quicksync.def"));
RDebugUtils.currentLine=117571588;
 //BA.debugLineNum = 117571588;BA.debugLine="RequestFileName = Utils.RandomString";
parent._requestfilename = parent.mostCurrent._utils._randomstring /*String*/ (processBA);
RDebugUtils.currentLine=117571589;
 //BA.debugLineNum = 117571589;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=117571590;
 //BA.debugLineNum = 117571590;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=117571591;
 //BA.debugLineNum = 117571591;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=117571592;
 //BA.debugLineNum = 117571592;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=117571593;
 //BA.debugLineNum = 117571593;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=117571594;
 //BA.debugLineNum = 117571594;BA.debugLine="params.Put(\"name\", RequestFileName)";
_params.Put((Object)("name"),(Object)(parent._requestfilename));
RDebugUtils.currentLine=117571595;
 //BA.debugLineNum = 117571595;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
_params.Put((Object)("newReturn"),(Object)(parent.mostCurrent._sharecode._newreturn /*int*/ ));
RDebugUtils.currentLine=117571596;
 //BA.debugLineNum = 117571596;BA.debugLine="params.Put(\"datetime\", QuickSyncDate)";
_params.Put((Object)("datetime"),(Object)(_quicksyncdate));
RDebugUtils.currentLine=117571597;
 //BA.debugLineNum = 117571597;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=117571598;
 //BA.debugLineNum = 117571598;BA.debugLine="params.Put(\"requestTagcodes\", RequestTagcodes)";
_params.Put((Object)("requestTagcodes"),(Object)(parent._requesttagcodes));
RDebugUtils.currentLine=117571599;
 //BA.debugLineNum = 117571599;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
_params.Put((Object)("smart"),(Object)(parent.mostCurrent._sharecode._isphone /*boolean*/ ));
RDebugUtils.currentLine=117571600;
 //BA.debugLineNum = 117571600;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=117571601;
 //BA.debugLineNum = 117571601;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=117571602;
 //BA.debugLineNum = 117571602;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=117571603;
 //BA.debugLineNum = 117571603;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=117571604;
 //BA.debugLineNum = 117571604;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=117571605;
 //BA.debugLineNum = 117571605;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=117571606;
 //BA.debugLineNum = 117571606;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=117571608;
 //BA.debugLineNum = 117571608;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=117571609;
 //BA.debugLineNum = 117571609;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=117571610;
 //BA.debugLineNum = 117571610;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=117571612;
 //BA.debugLineNum = 117571612;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117571612",_data,0);
RDebugUtils.currentLine=117571614;
 //BA.debugLineNum = 117571614;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/requests-pending");
RDebugUtils.currentLine=117571615;
 //BA.debugLineNum = 117571615;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=117571616;
 //BA.debugLineNum = 117571616;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=117571617;
 //BA.debugLineNum = 117571617;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",backgroundupdateservice.getObject());
RDebugUtils.currentLine=117571618;
 //BA.debugLineNum = 117571618;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=117571619;
 //BA.debugLineNum = 117571619;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=117571620;
 //BA.debugLineNum = 117571620;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "generateliteupdatefiles"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=117571621;
 //BA.debugLineNum = 117571621;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=117571622;
 //BA.debugLineNum = 117571622;BA.debugLine="Log(\"Success\" & Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117571622","Success"+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=117571623;
 //BA.debugLineNum = 117571623;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=117571625;
 //BA.debugLineNum = 117571625;BA.debugLine="Log(\"Success\" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("6117571625","Success"+_job._errormessage /*String*/ ,0);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=117571627;
 //BA.debugLineNum = 117571627;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=117571629;
 //BA.debugLineNum = 117571629;BA.debugLine="Log(\"Error APP_WORKING_LOCAL\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6117571629","Error APP_WORKING_LOCAL",0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=117571631;
 //BA.debugLineNum = 117571631;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=117571632;
 //BA.debugLineNum = 117571632;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _makeexecutesqlfiles(String _script,boolean _isupdate) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "makeexecutesqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "makeexecutesqlfiles", new Object[] {_script,_isupdate}));}
ResumableSub_MakeExecuteSqlFiles rsub = new ResumableSub_MakeExecuteSqlFiles(null,_script,_isupdate);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MakeExecuteSqlFiles extends BA.ResumableSub {
public ResumableSub_MakeExecuteSqlFiles(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,String _script,boolean _isupdate) {
this.parent = parent;
this._script = _script;
this._isupdate = _isupdate;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _script;
boolean _isupdate;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=117964850;
 //BA.debugLineNum = 117964850;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _runliteupdate() throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "runliteupdate", false))
	 {Debug.delegate(processBA, "runliteupdate", null); return;}
ResumableSub_RunLiteUpdate rsub = new ResumableSub_RunLiteUpdate(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_RunLiteUpdate extends BA.ResumableSub {
public ResumableSub_RunLiteUpdate(xevolution.vrcg.devdemov2400.backgroundupdateservice parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _generatecomplete = false;
String _update_install_info = "";
String _updateinstallfilesname = "";
boolean _result = false;
boolean _finish = false;
boolean _isfilesdeleted = false;
boolean _isdownloadfilesfinish = false;
String _quicksyncdate = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=117506050;
 //BA.debugLineNum = 117506050;BA.debugLine="Dim res As ResumableSub = GenerateLiteUpdateFiles";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _generateliteupdatefiles();
RDebugUtils.currentLine=117506051;
 //BA.debugLineNum = 117506051;BA.debugLine="Wait For(res) Complete (GenerateComplete As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_generatecomplete = (Boolean) result[0];
;
RDebugUtils.currentLine=117506053;
 //BA.debugLineNum = 117506053;BA.debugLine="If (GenerateComplete) Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((_generatecomplete)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=117506055;
 //BA.debugLineNum = 117506055;BA.debugLine="Dim UPDATE_INSTALL_INFO As String = $\"${RequestF";
_update_install_info = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._requestfilename))+".INFO");
RDebugUtils.currentLine=117506056;
 //BA.debugLineNum = 117506056;BA.debugLine="Dim updateInstallFilesName As String = RequestFi";
_updateinstallfilesname = parent._requestfilename;
RDebugUtils.currentLine=117506057;
 //BA.debugLineNum = 117506057;BA.debugLine="Dim res As ResumableSub = DownloadSqlFilesLiteUp";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _downloadsqlfilesliteupdate(_update_install_info,_updateinstallfilesname);
RDebugUtils.currentLine=117506058;
 //BA.debugLineNum = 117506058;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=117506060;
 //BA.debugLineNum = 117506060;BA.debugLine="If(result)Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((_result)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=117506062;
 //BA.debugLineNum = 117506062;BA.debugLine="Dim res As ResumableSub = ExecuteSqlFiles(updat";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _executesqlfiles(_updateinstallfilesname);
RDebugUtils.currentLine=117506063;
 //BA.debugLineNum = 117506063;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 23;
return;
case 23:
//C
this.state = 7;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=117506065;
 //BA.debugLineNum = 117506065;BA.debugLine="If(finish)Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((_finish)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=117506066;
 //BA.debugLineNum = 117506066;BA.debugLine="SendServerProcessComplete";
_sendserverprocesscomplete();
RDebugUtils.currentLine=117506067;
 //BA.debugLineNum = 117506067;BA.debugLine="Dim res As ResumableSub = DeleteSqlFiles(updat";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _deletesqlfiles(_updateinstallfilesname);
RDebugUtils.currentLine=117506068;
 //BA.debugLineNum = 117506068;BA.debugLine="Wait For(res) Complete (IsFilesDeleted As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 24;
return;
case 24:
//C
this.state = 10;
_isfilesdeleted = (Boolean) result[0];
;
RDebugUtils.currentLine=117506070;
 //BA.debugLineNum = 117506070;BA.debugLine="If(IsFilesDeleted) Then";
if (true) break;

case 10:
//if
this.state = 17;
if ((_isfilesdeleted)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=117506071;
 //BA.debugLineNum = 117506071;BA.debugLine="Dim res As ResumableSub = UpdateFilesWithFTP(";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _updatefileswithftp("");
RDebugUtils.currentLine=117506072;
 //BA.debugLineNum = 117506072;BA.debugLine="Wait For(res) Complete (IsDownloadFilesFinish";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 25;
return;
case 25:
//C
this.state = 13;
_isdownloadfilesfinish = (Boolean) result[0];
;
RDebugUtils.currentLine=117506074;
 //BA.debugLineNum = 117506074;BA.debugLine="If (IsDownloadFilesFinish) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_isdownloadfilesfinish)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=117506075;
 //BA.debugLineNum = 117506075;BA.debugLine="Dim QuickSyncDate As String = Utils.GetCurrD";
_quicksyncdate = parent.mostCurrent._utils._getcurrdatetime /*String*/ (processBA);
RDebugUtils.currentLine=117506076;
 //BA.debugLineNum = 117506076;BA.debugLine="File.writestring(Starter.InternalFolder,$\"${";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_quicksync.def"),_quicksyncdate);
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=117506084;
 //BA.debugLineNum = 117506084;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sendserverprocesscomplete() throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "sendserverprocesscomplete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "sendserverprocesscomplete", null));}
ResumableSub_SendServerProcessComplete rsub = new ResumableSub_SendServerProcessComplete(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SendServerProcessComplete extends BA.ResumableSub {
public ResumableSub_SendServerProcessComplete(xevolution.vrcg.devdemov2400.backgroundupdateservice parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=118226945;
 //BA.debugLineNum = 118226945;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/removeFilesSqlite");
RDebugUtils.currentLine=118226946;
 //BA.debugLineNum = 118226946;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=118226947;
 //BA.debugLineNum = 118226947;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",backgroundupdateservice.getObject());
RDebugUtils.currentLine=118226948;
 //BA.debugLineNum = 118226948;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=118226949;
 //BA.debugLineNum = 118226949;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=118226950;
 //BA.debugLineNum = 118226950;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=118226951;
 //BA.debugLineNum = 118226951;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=118226952;
 //BA.debugLineNum = 118226952;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=118226953;
 //BA.debugLineNum = 118226953;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=118226954;
 //BA.debugLineNum = 118226954;BA.debugLine="params.Put(\"name\", RequestFileName)";
_params.Put((Object)("name"),(Object)(parent._requestfilename));
RDebugUtils.currentLine=118226955;
 //BA.debugLineNum = 118226955;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=118226956;
 //BA.debugLineNum = 118226956;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=118226957;
 //BA.debugLineNum = 118226957;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=118226958;
 //BA.debugLineNum = 118226958;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=118226959;
 //BA.debugLineNum = 118226959;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=118226960;
 //BA.debugLineNum = 118226960;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=118226961;
 //BA.debugLineNum = 118226961;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=118226962;
 //BA.debugLineNum = 118226962;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=118226963;
 //BA.debugLineNum = 118226963;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=118226965;
 //BA.debugLineNum = 118226965;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=118226967;
 //BA.debugLineNum = 118226967;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=118226968;
 //BA.debugLineNum = 118226968;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=118226970;
 //BA.debugLineNum = 118226970;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "sendserverprocesscomplete"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=118226971;
 //BA.debugLineNum = 118226971;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=118226972;
 //BA.debugLineNum = 118226972;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=118226974;
 //BA.debugLineNum = 118226974;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (processBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=118226976;
 //BA.debugLineNum = 118226976;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=118226978;
 //BA.debugLineNum = 118226978;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=118226979;
 //BA.debugLineNum = 118226979;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updatefileswithftp(String _datacontrol) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "updatefileswithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "updatefileswithftp", new Object[] {_datacontrol}));}
ResumableSub_UpdateFilesWithFTP rsub = new ResumableSub_UpdateFilesWithFTP(null,_datacontrol);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UpdateFilesWithFTP(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,String _datacontrol) {
this.parent = parent;
this._datacontrol = _datacontrol;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
String _datacontrol;
int _current_counter = 0;
int _end_counter = 0;
long _datacontrolparse = 0L;
anywheresoftware.b4a.objects.collections.List _flist = null;
anywheresoftware.b4a.objects.collections.List _flisthtml = null;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _i = 0;
String _fname = "";
String _ext = "";
anywheresoftware.b4a.objects.collections.List _flistlast = null;
xevolution.vrcg.devdemov2400.types._downupfile _fname1 = null;
boolean _makecopy = false;
Object _sf = null;
int step29;
int limit29;
int step59;
int limit59;
int step72;
int limit72;
int step98;
int limit98;
int step112;
int limit112;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=118161409;
 //BA.debugLineNum = 118161409;BA.debugLine="Dim CURRENT_COUNTER As Int = 0";
_current_counter = (int) (0);
RDebugUtils.currentLine=118161410;
 //BA.debugLineNum = 118161410;BA.debugLine="Dim END_COUNTER As Int = 0";
_end_counter = (int) (0);
RDebugUtils.currentLine=118161411;
 //BA.debugLineNum = 118161411;BA.debugLine="If (Not(Starter.FirstInstall)) Then";
if (true) break;

case 1:
//if
this.state = 136;
if ((anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._firstinstall /*boolean*/ ))) { 
this.state = 3;
}else {
this.state = 135;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=118161412;
 //BA.debugLineNum = 118161412;BA.debugLine="If (Utils.isNullOrEmpty(datacontrol)) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils._isnullorempty /*boolean*/ (processBA,_datacontrol))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=118161413;
 //BA.debugLineNum = 118161413;BA.debugLine="datacontrol = Utils.GetCurrDatetimeFixed 'Utils";
_datacontrol = parent.mostCurrent._utils._getcurrdatetimefixed /*String*/ (processBA);
 if (true) break;
;
RDebugUtils.currentLine=118161416;
 //BA.debugLineNum = 118161416;BA.debugLine="Try";

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
RDebugUtils.currentLine=118161417;
 //BA.debugLineNum = 118161417;BA.debugLine="Dim datacontrolParse As Long = DateTime.DatePar";
_datacontrolparse = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_datacontrol);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=118161419;
 //BA.debugLineNum = 118161419;BA.debugLine="Dim datacontrolParse As Long = DateTime.Now   '";
_datacontrolparse = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=118161426;
 //BA.debugLineNum = 118161426;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161426","************************************************************",0);
RDebugUtils.currentLine=118161427;
 //BA.debugLineNum = 118161427;BA.debugLine="Log($\" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${Sh";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161427",(" 		DOWNLOAD : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+" "),0);
RDebugUtils.currentLine=118161428;
 //BA.debugLineNum = 118161428;BA.debugLine="Log( $\"${ShareCode.APP_FTP_USER}@${ShareCode.APP";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161428",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),0);
RDebugUtils.currentLine=118161429;
 //BA.debugLineNum = 118161429;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161429","************************************************************",0);
RDebugUtils.currentLine=118161430;
 //BA.debugLineNum = 118161430;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
_flist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=118161430;
 //BA.debugLineNum = 118161430;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
_flist.Initialize();
RDebugUtils.currentLine=118161431;
 //BA.debugLineNum = 118161431;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
_flisthtml = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=118161431;
 //BA.debugLineNum = 118161431;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
_flisthtml.Initialize();
RDebugUtils.currentLine=118161433;
 //BA.debugLineNum = 118161433;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=118161434;
 //BA.debugLineNum = 118161434;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=118161435;
 //BA.debugLineNum = 118161435;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=118161439;
 //BA.debugLineNum = 118161439;BA.debugLine="GlobalFTP.TimeoutMs =240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=118161451;
 //BA.debugLineNum = 118161451;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCo";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=118161454;
 //BA.debugLineNum = 118161454;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "updatefileswithftp"), _sfl);
this.state = 137;
return;
case 137:
//C
this.state = 13;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=118161456;
 //BA.debugLineNum = 118161456;BA.debugLine="If Success Then";
if (true) break;

case 13:
//if
this.state = 133;
if (_success) { 
this.state = 15;
}else {
this.state = 132;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=118161461;
 //BA.debugLineNum = 118161461;BA.debugLine="If (Files.Length >= 1) Then";
if (true) break;

case 16:
//if
this.state = 51;
if ((_files.length>=1)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=118161462;
 //BA.debugLineNum = 118161462;BA.debugLine="flist.Initialize";
_flist.Initialize();
RDebugUtils.currentLine=118161463;
 //BA.debugLineNum = 118161463;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 19:
//for
this.state = 50;
step29 = 1;
limit29 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 138;
if (true) break;

case 138:
//C
this.state = 50;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 21;
if (true) break;

case 139:
//C
this.state = 138;
_i = ((int)(0 + _i + step29)) ;
if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=118161464;
 //BA.debugLineNum = 118161464;BA.debugLine="Dim fName As String = Files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=118161465;
 //BA.debugLineNum = 118161465;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWit";
if (true) break;

case 22:
//if
this.state = 49;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".jpeg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".doc")) || (_fname.endsWith(".docx")) || (_fname.endsWith(".xls")) || (_fname.endsWith(".xlsx")) || (_fname.endsWith(".ppt")) || (_fname.endsWith(".pptx"))) { 
this.state = 24;
}else 
{RDebugUtils.currentLine=118161477;
 //BA.debugLineNum = 118161477;BA.debugLine="Else If (fName.EndsWith(\".html\")) Then";
if ((_fname.endsWith(".html"))) { 
this.state = 36;
}else {
this.state = 48;
}}
if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=118161469;
 //BA.debugLineNum = 118161469;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
_ext = _fname.substring((int) (_fname.lastIndexOf(".")-1));
RDebugUtils.currentLine=118161470;
 //BA.debugLineNum = 118161470;BA.debugLine="If (Files(i).Timestamp >= datacontrolParse)";
if (true) break;

case 25:
//if
this.state = 34;
if ((_files[_i].getTimestamp()>=_datacontrolparse)) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=118161471;
 //BA.debugLineNum = 118161471;BA.debugLine="Try";
if (true) break;

case 28:
//try
this.state = 33;
this.catchState = 32;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 33;
this.catchState = 32;
RDebugUtils.currentLine=118161472;
 //BA.debugLineNum = 118161472;BA.debugLine="flist.Add(Types.MakeDownUpFile(Files(i).Na";
_flist.Add((Object)(parent.mostCurrent._types._makedownupfile /*xevolution.vrcg.devdemov2400.types._downupfile*/ (processBA,_files[_i].getName(),_ext,_files[_i].getTimestamp())));
 if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
RDebugUtils.currentLine=118161474;
 //BA.debugLineNum = 118161474;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161474",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 49;
;
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=118161478;
 //BA.debugLineNum = 118161478;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
_ext = _fname.substring((int) (_fname.lastIndexOf(".")-1));
RDebugUtils.currentLine=118161479;
 //BA.debugLineNum = 118161479;BA.debugLine="If ((Files(i).Timestamp >= datacontrolParse)";
if (true) break;

case 37:
//if
this.state = 46;
if (((_files[_i].getTimestamp()>=_datacontrolparse) || anywheresoftware.b4a.keywords.Common.Not(_files[_i].getName().startsWith("REPORT_")))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=118161480;
 //BA.debugLineNum = 118161480;BA.debugLine="Try";
if (true) break;

case 40:
//try
this.state = 45;
this.catchState = 44;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 45;
this.catchState = 44;
RDebugUtils.currentLine=118161481;
 //BA.debugLineNum = 118161481;BA.debugLine="flisthtml.Add(Types.MakeDownUpFile(Files(i";
_flisthtml.Add((Object)(parent.mostCurrent._types._makedownupfile /*xevolution.vrcg.devdemov2400.types._downupfile*/ (processBA,_files[_i].getName(),_ext,_files[_i].getTimestamp())));
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
RDebugUtils.currentLine=118161483;
 //BA.debugLineNum = 118161483;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161483",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 if (true) break;

case 46:
//C
this.state = 49;
;
 if (true) break;

case 48:
//C
this.state = 49;
 if (true) break;

case 49:
//C
this.state = 139;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;
;
RDebugUtils.currentLine=118161492;
 //BA.debugLineNum = 118161492;BA.debugLine="If (flist.Size >=1) Then '.IsInitialized) Then";

case 51:
//if
this.state = 92;
if ((_flist.getSize()>=1)) { 
this.state = 53;
}else {
this.state = 91;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=118161493;
 //BA.debugLineNum = 118161493;BA.debugLine="Dim flistLast As List";
_flistlast = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=118161494;
 //BA.debugLineNum = 118161494;BA.debugLine="If Not(flistLast.IsInitialized) Then";
if (true) break;

case 54:
//if
this.state = 57;
if (anywheresoftware.b4a.keywords.Common.Not(_flistlast.IsInitialized())) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=118161495;
 //BA.debugLineNum = 118161495;BA.debugLine="flistLast.Initialize";
_flistlast.Initialize();
 if (true) break;
;
RDebugUtils.currentLine=118161501;
 //BA.debugLineNum = 118161501;BA.debugLine="If (flist.Size>=1) Then";

case 57:
//if
this.state = 71;
if ((_flist.getSize()>=1)) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=118161502;
 //BA.debugLineNum = 118161502;BA.debugLine="For i=0 To flist.Size-1";
if (true) break;

case 60:
//for
this.state = 70;
step59 = 1;
limit59 = (int) (_flist.getSize()-1);
_i = (int) (0) ;
this.state = 140;
if (true) break;

case 140:
//C
this.state = 70;
if ((step59 > 0 && _i <= limit59) || (step59 < 0 && _i >= limit59)) this.state = 62;
if (true) break;

case 141:
//C
this.state = 140;
_i = ((int)(0 + _i + step59)) ;
if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=118161503;
 //BA.debugLineNum = 118161503;BA.debugLine="Dim fName1 As DownUpFile = flist.Get(i)";
_fname1 = (xevolution.vrcg.devdemov2400.types._downupfile)(_flist.Get(_i));
RDebugUtils.currentLine=118161504;
 //BA.debugLineNum = 118161504;BA.debugLine="Dim makeCopy As Boolean = False";
_makecopy = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=118161513;
 //BA.debugLineNum = 118161513;BA.debugLine="If Not(File.Exists(Starter.InternalFolder, f";
if (true) break;

case 63:
//if
this.state = 66;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname1.Filename /*String*/ ))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=118161514;
 //BA.debugLineNum = 118161514;BA.debugLine="makeCopy = True";
_makecopy = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=118161517;
 //BA.debugLineNum = 118161517;BA.debugLine="If (makeCopy) Then";

case 66:
//if
this.state = 69;
if ((_makecopy)) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=118161518;
 //BA.debugLineNum = 118161518;BA.debugLine="flistLast.Add(fName1.Filename)";
_flistlast.Add((Object)(_fname1.Filename /*String*/ ));
 if (true) break;

case 69:
//C
this.state = 141;
;
 if (true) break;
if (true) break;

case 70:
//C
this.state = 71;
;
 if (true) break;
;
RDebugUtils.currentLine=118161526;
 //BA.debugLineNum = 118161526;BA.debugLine="If (flistLast.Size>=1) Then";

case 71:
//if
this.state = 89;
if ((_flistlast.getSize()>=1)) { 
this.state = 73;
}else {
this.state = 88;
}if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=118161527;
 //BA.debugLineNum = 118161527;BA.debugLine="END_COUNTER = flistLast.Size-1";
_end_counter = (int) (_flistlast.getSize()-1);
RDebugUtils.currentLine=118161528;
 //BA.debugLineNum = 118161528;BA.debugLine="For i=0 To flistLast.Size-1";
if (true) break;

case 74:
//for
this.state = 86;
step72 = 1;
limit72 = (int) (_flistlast.getSize()-1);
_i = (int) (0) ;
this.state = 142;
if (true) break;

case 142:
//C
this.state = 86;
if ((step72 > 0 && _i <= limit72) || (step72 < 0 && _i >= limit72)) this.state = 76;
if (true) break;

case 143:
//C
this.state = 142;
_i = ((int)(0 + _i + step72)) ;
if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=118161529;
 //BA.debugLineNum = 118161529;BA.debugLine="Dim fName As String = flistLast.Get(i)";
_fname = BA.ObjectToString(_flistlast.Get(_i));
RDebugUtils.currentLine=118161531;
 //BA.debugLineNum = 118161531;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161531",_fname,0);
RDebugUtils.currentLine=118161533;
 //BA.debugLineNum = 118161533;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=118161534;
 //BA.debugLineNum = 118161534;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "updatefileswithftp"), _sf);
this.state = 144;
return;
case 144:
//C
this.state = 77;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=118161535;
 //BA.debugLineNum = 118161535;BA.debugLine="If Success Then";
if (true) break;

case 77:
//if
this.state = 82;
if (_success) { 
this.state = 79;
}else {
this.state = 81;
}if (true) break;

case 79:
//C
this.state = 82;
RDebugUtils.currentLine=118161536;
 //BA.debugLineNum = 118161536;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161536","file was download successfully",0);
 if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=118161538;
 //BA.debugLineNum = 118161538;BA.debugLine="Log(\"Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161538","Error downloading file",0);
 if (true) break;
;
RDebugUtils.currentLine=118161542;
 //BA.debugLineNum = 118161542;BA.debugLine="If (flistLast.Size-1 > CURRENT_COUNTER) Then";

case 82:
//if
this.state = 85;
if ((_flistlast.getSize()-1>_current_counter)) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=118161543;
 //BA.debugLineNum = 118161543;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER+1";
_current_counter = (int) (_current_counter+1);
 if (true) break;

case 85:
//C
this.state = 143;
;
 if (true) break;
if (true) break;

case 86:
//C
this.state = 89;
;
 if (true) break;

case 88:
//C
this.state = 89;
RDebugUtils.currentLine=118161547;
 //BA.debugLineNum = 118161547;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
_current_counter = _end_counter;
RDebugUtils.currentLine=118161548;
 //BA.debugLineNum = 118161548;BA.debugLine="Log(\"vazio 0\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161548","vazio 0",0);
 if (true) break;

case 89:
//C
this.state = 92;
;
 if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=118161551;
 //BA.debugLineNum = 118161551;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
_current_counter = _end_counter;
RDebugUtils.currentLine=118161552;
 //BA.debugLineNum = 118161552;BA.debugLine="Log(\"vazio 1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161552","vazio 1",0);
 if (true) break;
;
RDebugUtils.currentLine=118161555;
 //BA.debugLineNum = 118161555;BA.debugLine="If (flisthtml.Size >=1) Then '.IsInitialized) T";

case 92:
//if
this.state = 130;
if ((_flisthtml.getSize()>=1)) { 
this.state = 94;
}else {
this.state = 129;
}if (true) break;

case 94:
//C
this.state = 95;
RDebugUtils.currentLine=118161556;
 //BA.debugLineNum = 118161556;BA.debugLine="Dim flistLast As List";
_flistlast = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=118161557;
 //BA.debugLineNum = 118161557;BA.debugLine="flistLast.Initialize";
_flistlast.Initialize();
RDebugUtils.currentLine=118161561;
 //BA.debugLineNum = 118161561;BA.debugLine="If (flisthtml.Size>=1) Then";
if (true) break;

case 95:
//if
this.state = 109;
if ((_flisthtml.getSize()>=1)) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=118161562;
 //BA.debugLineNum = 118161562;BA.debugLine="For i=0 To flisthtml.Size-1";
if (true) break;

case 98:
//for
this.state = 108;
step98 = 1;
limit98 = (int) (_flisthtml.getSize()-1);
_i = (int) (0) ;
this.state = 145;
if (true) break;

case 145:
//C
this.state = 108;
if ((step98 > 0 && _i <= limit98) || (step98 < 0 && _i >= limit98)) this.state = 100;
if (true) break;

case 146:
//C
this.state = 145;
_i = ((int)(0 + _i + step98)) ;
if (true) break;

case 100:
//C
this.state = 101;
RDebugUtils.currentLine=118161563;
 //BA.debugLineNum = 118161563;BA.debugLine="Dim fName1 As DownUpFile = flisthtml.Get(i)";
_fname1 = (xevolution.vrcg.devdemov2400.types._downupfile)(_flisthtml.Get(_i));
RDebugUtils.currentLine=118161564;
 //BA.debugLineNum = 118161564;BA.debugLine="Dim makeCopy As Boolean = False";
_makecopy = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=118161565;
 //BA.debugLineNum = 118161565;BA.debugLine="If Not(File.Exists(Starter.InternalFolder, f";
if (true) break;

case 101:
//if
this.state = 104;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname1.Filename /*String*/ ))) { 
this.state = 103;
}if (true) break;

case 103:
//C
this.state = 104;
RDebugUtils.currentLine=118161566;
 //BA.debugLineNum = 118161566;BA.debugLine="makeCopy = True";
_makecopy = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=118161569;
 //BA.debugLineNum = 118161569;BA.debugLine="If (makeCopy) Then";

case 104:
//if
this.state = 107;
if ((_makecopy)) { 
this.state = 106;
}if (true) break;

case 106:
//C
this.state = 107;
RDebugUtils.currentLine=118161570;
 //BA.debugLineNum = 118161570;BA.debugLine="flistLast.Add(fName1.Filename)";
_flistlast.Add((Object)(_fname1.Filename /*String*/ ));
 if (true) break;

case 107:
//C
this.state = 146;
;
 if (true) break;
if (true) break;

case 108:
//C
this.state = 109;
;
 if (true) break;
;
RDebugUtils.currentLine=118161578;
 //BA.debugLineNum = 118161578;BA.debugLine="If (flistLast.Size>=1) Then";

case 109:
//if
this.state = 127;
if ((_flistlast.getSize()>=1)) { 
this.state = 111;
}else {
this.state = 126;
}if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=118161579;
 //BA.debugLineNum = 118161579;BA.debugLine="CURRENT_COUNTER = 0";
_current_counter = (int) (0);
RDebugUtils.currentLine=118161580;
 //BA.debugLineNum = 118161580;BA.debugLine="END_COUNTER = flistLast.Size-1";
_end_counter = (int) (_flistlast.getSize()-1);
RDebugUtils.currentLine=118161581;
 //BA.debugLineNum = 118161581;BA.debugLine="For i=0 To flistLast.Size-1";
if (true) break;

case 112:
//for
this.state = 124;
step112 = 1;
limit112 = (int) (_flistlast.getSize()-1);
_i = (int) (0) ;
this.state = 147;
if (true) break;

case 147:
//C
this.state = 124;
if ((step112 > 0 && _i <= limit112) || (step112 < 0 && _i >= limit112)) this.state = 114;
if (true) break;

case 148:
//C
this.state = 147;
_i = ((int)(0 + _i + step112)) ;
if (true) break;

case 114:
//C
this.state = 115;
RDebugUtils.currentLine=118161582;
 //BA.debugLineNum = 118161582;BA.debugLine="Dim fName As String = flistLast.Get(i)";
_fname = BA.ObjectToString(_flistlast.Get(_i));
RDebugUtils.currentLine=118161584;
 //BA.debugLineNum = 118161584;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161584",_fname,0);
RDebugUtils.currentLine=118161585;
 //BA.debugLineNum = 118161585;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=118161586;
 //BA.debugLineNum = 118161586;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "updatefileswithftp"), _sf);
this.state = 149;
return;
case 149:
//C
this.state = 115;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=118161587;
 //BA.debugLineNum = 118161587;BA.debugLine="If Success Then";
if (true) break;

case 115:
//if
this.state = 120;
if (_success) { 
this.state = 117;
}else {
this.state = 119;
}if (true) break;

case 117:
//C
this.state = 120;
RDebugUtils.currentLine=118161588;
 //BA.debugLineNum = 118161588;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161588","file was download successfully",0);
 if (true) break;

case 119:
//C
this.state = 120;
RDebugUtils.currentLine=118161590;
 //BA.debugLineNum = 118161590;BA.debugLine="Log(\"Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161590","Error downloading file",0);
 if (true) break;
;
RDebugUtils.currentLine=118161593;
 //BA.debugLineNum = 118161593;BA.debugLine="If (flistLast.Size-1 > CURRENT_COUNTER) Then";

case 120:
//if
this.state = 123;
if ((_flistlast.getSize()-1>_current_counter)) { 
this.state = 122;
}if (true) break;

case 122:
//C
this.state = 123;
RDebugUtils.currentLine=118161594;
 //BA.debugLineNum = 118161594;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER+1";
_current_counter = (int) (_current_counter+1);
 if (true) break;

case 123:
//C
this.state = 148;
;
 if (true) break;
if (true) break;

case 124:
//C
this.state = 127;
;
 if (true) break;

case 126:
//C
this.state = 127;
RDebugUtils.currentLine=118161598;
 //BA.debugLineNum = 118161598;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
_current_counter = _end_counter;
RDebugUtils.currentLine=118161599;
 //BA.debugLineNum = 118161599;BA.debugLine="Log(\"vazio 0\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161599","vazio 0",0);
 if (true) break;

case 127:
//C
this.state = 130;
;
 if (true) break;

case 129:
//C
this.state = 130;
RDebugUtils.currentLine=118161602;
 //BA.debugLineNum = 118161602;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
_current_counter = _end_counter;
RDebugUtils.currentLine=118161603;
 //BA.debugLineNum = 118161603;BA.debugLine="Log(\"vazio 1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161603","vazio 1",0);
 if (true) break;

case 130:
//C
this.state = 133;
;
 if (true) break;

case 132:
//C
this.state = 133;
RDebugUtils.currentLine=118161607;
 //BA.debugLineNum = 118161607;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
_current_counter = _end_counter;
RDebugUtils.currentLine=118161608;
 //BA.debugLineNum = 118161608;BA.debugLine="Log(\"Sem sucesso!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161608","Sem sucesso!",0);
 if (true) break;

case 133:
//C
this.state = 136;
;
RDebugUtils.currentLine=118161612;
 //BA.debugLineNum = 118161612;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=118161613;
 //BA.debugLineNum = 118161613;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 135:
//C
this.state = 136;
RDebugUtils.currentLine=118161615;
 //BA.debugLineNum = 118161615;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
_current_counter = _end_counter;
RDebugUtils.currentLine=118161616;
 //BA.debugLineNum = 118161616;BA.debugLine="Log(\"vazio 2\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6118161616","vazio 2",0);
 if (true) break;

case 136:
//C
this.state = -1;
;
RDebugUtils.currentLine=118161618;
 //BA.debugLineNum = 118161618;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=118161619;
 //BA.debugLineNum = 118161619;BA.debugLine="End Sub";
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
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=117243904;
 //BA.debugLineNum = 117243904;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=117243906;
 //BA.debugLineNum = 117243906;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=117374976;
 //BA.debugLineNum = 117374976;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=117374978;
 //BA.debugLineNum = 117374978;BA.debugLine="End Sub";
return "";
}
public static void  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {Debug.delegate(processBA, "service_start", new Object[] {_startingintent}); return;}
ResumableSub_Service_Start rsub = new ResumableSub_Service_Start(null,_startingintent);
rsub.resume(processBA, null);
}
public static class ResumableSub_Service_Start extends BA.ResumableSub {
public ResumableSub_Service_Start(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,anywheresoftware.b4a.objects.IntentWrapper _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
anywheresoftware.b4a.objects.IntentWrapper _startingintent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _isupdateavailable = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="backgroundupdateservice";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=117309446;
 //BA.debugLineNum = 117309446;BA.debugLine="Log(\"BackgroundUpdateService: First Time\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6117309446","BackgroundUpdateService: First Time",0);
RDebugUtils.currentLine=117309448;
 //BA.debugLineNum = 117309448;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) And Not(Start";
if (true) break;

case 1:
//if
this.state = 8;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._runupdate /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=117309449;
 //BA.debugLineNum = 117309449;BA.debugLine="Dim res As ResumableSub = CheckIfUpdateIsAvailab";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _checkifupdateisavailable();
RDebugUtils.currentLine=117309450;
 //BA.debugLineNum = 117309450;BA.debugLine="Wait For(res) Complete (IsUpdateAvailable As Boo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "backgroundupdateservice", "service_start"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_isupdateavailable = (Boolean) result[0];
;
RDebugUtils.currentLine=117309451;
 //BA.debugLineNum = 117309451;BA.debugLine="If IsUpdateAvailable Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_isupdateavailable) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=117309452;
 //BA.debugLineNum = 117309452;BA.debugLine="RunLiteUpdate";
_runliteupdate();
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=117309454;
 //BA.debugLineNum = 117309454;BA.debugLine="Log(\"BackgroundUpdateService: Verify\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6117309454","BackgroundUpdateService: Verify",0);
RDebugUtils.currentLine=117309455;
 //BA.debugLineNum = 117309455;BA.debugLine="Service.StopAutomaticForeground 'Call this when";
parent.mostCurrent._service.StopAutomaticForeground();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=117309458;
 //BA.debugLineNum = 117309458;BA.debugLine="StartServiceAt(Me, DateTime.Now + 150 * 1000, Tru";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,backgroundupdateservice.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+150*1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=117309460;
 //BA.debugLineNum = 117309460;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}