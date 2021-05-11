
package xevolution.vrcg.devdemov2400;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "xevolution.vrcg.devdemov2400.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pe = RemoteObject.declareNull("anywheresoftware.b4a.phone.PhoneEvents");
public static RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static RemoteObject _currentworkactivity = RemoteObject.declareNull("Object");
public static RemoteObject _currentflowposition = RemoteObject.createImmutable(0);
public static RemoteObject _webisok = RemoteObject.createImmutable(false);
public static RemoteObject _localsql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _localsqlevc = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _localsqlwrk = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _makinglogin = RemoteObject.createImmutable(false);
public static RemoteObject _firstinstall = RemoteObject.createImmutable(false);
public static RemoteObject _runupdate = RemoteObject.createImmutable(false);
public static RemoteObject _gpsdevice = RemoteObject.declareNull("anywheresoftware.b4a.gps.GPS");
public static RemoteObject _appstate = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.tinifile");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _params = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.configparameters");
public static RemoteObject _provider = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.fileprovider");
public static RemoteObject _strfunc = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
public static RemoteObject _localsessioncode = RemoteObject.createImmutable("");
public static RemoteObject _sharedfolder = RemoteObject.createImmutable("");
public static RemoteObject _safedefaultexternal = RemoteObject.createImmutable("");
public static RemoteObject _internalfolder = RemoteObject.createImmutable("");
public static RemoteObject _assetsfolder = RemoteObject.createImmutable("");
public static RemoteObject _wifi = RemoteObject.declareNull("wifi.MLwifi");
public static RemoteObject _entitykeepfilter = RemoteObject.createImmutable(false);
public static RemoteObject _entitysearchfilter = RemoteObject.createImmutable("");
public static RemoteObject _entityfilter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._entityfilter");
public static RemoteObject _requestfavorites = RemoteObject.createImmutable(0);
public static RemoteObject _requestkeepfilter = RemoteObject.createImmutable(false);
public static RemoteObject _requestsearchfilter = RemoteObject.createImmutable("");
public static RemoteObject _requestfilters = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestfilter");
public static RemoteObject _taskkeepfilter = RemoteObject.createImmutable(false);
public static RemoteObject _tasksearchfilter = RemoteObject.createImmutable("");
public static RemoteObject _taskfilters = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._taskfilter");
public static RemoteObject _objectkeepfilter = RemoteObject.createImmutable(false);
public static RemoteObject _objectfiltered = RemoteObject.createImmutable(false);
public static RemoteObject _objectsearchfilter = RemoteObject.createImmutable("");
public static RemoteObject _objectfilter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objectfilter");
public static RemoteObject _notifyusercount = RemoteObject.createImmutable(0);
public static RemoteObject _notifyrequestcount = RemoteObject.createImmutable(0);
public static RemoteObject _notifyactioncount = RemoteObject.createImmutable(0);
public static RemoteObject _devinfo = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._deviceinformation");
public static RemoteObject _keepcolormain = RemoteObject.createImmutable(0);
public static RemoteObject _keepcolorsub = RemoteObject.createImmutable(0);
public static RemoteObject _cpbuttons = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._composedbuttondefs");
public static RemoteObject _cpbuttonsoff = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._composedbuttondefs");
public static RemoteObject _app_fine_location_access = RemoteObject.createImmutable(false);
public static RemoteObject _app_camera_access = RemoteObject.createImmutable(false);
public static RemoteObject _app_reset_install = RemoteObject.createImmutable(false);
public static RemoteObject _app_in_execution = RemoteObject.createImmutable(false);
public static RemoteObject _app_install_apk = RemoteObject.createImmutable(false);
public static RemoteObject _app_send_sms = RemoteObject.createImmutable(false);
public static RemoteObject _stoplocationcheck = RemoteObject.createImmutable(false);
public static RemoteObject _stopcommscheck = RemoteObject.createImmutable(false);
public static RemoteObject _calledfromsyncbutton = RemoteObject.createImmutable(false);
public static RemoteObject _apicall = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.api");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static RemoteObject _encoding = RemoteObject.declareNull("b4a.example.encoding");
public static RemoteObject _esc_pos = RemoteObject.declareNull("b4a.example.esc_pos");
public static xevolution.vrcg.devdemov2400.main _main = null;
public static xevolution.vrcg.devdemov2400.comms _comms = null;
public static xevolution.vrcg.devdemov2400.utils _utils = null;
public static xevolution.vrcg.devdemov2400.dbstructures _dbstructures = null;
public static xevolution.vrcg.devdemov2400.sharecode _sharecode = null;
public static xevolution.vrcg.devdemov2400.mainmenu _mainmenu = null;
public static xevolution.vrcg.devdemov2400.imageedit _imageedit = null;
public static xevolution.vrcg.devdemov2400.checklist3 _checklist3 = null;
public static xevolution.vrcg.devdemov2400.locationservice _locationservice = null;
public static xevolution.vrcg.devdemov2400.dataupdate _dataupdate = null;
public static xevolution.vrcg.devdemov2400.alerts _alerts = null;
public static xevolution.vrcg.devdemov2400.backgroundupdateservice _backgroundupdateservice = null;
public static xevolution.vrcg.devdemov2400.barcodescanner _barcodescanner = null;
public static xevolution.vrcg.devdemov2400.cameraactivity _cameraactivity = null;
public static xevolution.vrcg.devdemov2400.cameraactivity_innershot _cameraactivity_innershot = null;
public static xevolution.vrcg.devdemov2400.cameraactivity2 _cameraactivity2 = null;
public static xevolution.vrcg.devdemov2400.checklistnew _checklistnew = null;
public static xevolution.vrcg.devdemov2400.common _common = null;
public static xevolution.vrcg.devdemov2400.consts _consts = null;
public static xevolution.vrcg.devdemov2400.dbutils _dbutils = null;
public static xevolution.vrcg.devdemov2400.helpdescriptors _helpdescriptors = null;
public static xevolution.vrcg.devdemov2400.logs _logs = null;
public static xevolution.vrcg.devdemov2400.mapsactivity _mapsactivity = null;
public static xevolution.vrcg.devdemov2400.newsync _newsync = null;
public static xevolution.vrcg.devdemov2400.notas _notas = null;
public static xevolution.vrcg.devdemov2400.objectedit _objectedit = null;
public static xevolution.vrcg.devdemov2400.objects _objects = null;
public static xevolution.vrcg.devdemov2400.report _report = null;
public static xevolution.vrcg.devdemov2400.reportview _reportview = null;
public static xevolution.vrcg.devdemov2400.requests3 _requests3 = null;
public static xevolution.vrcg.devdemov2400.signaturecapture _signaturecapture = null;
public static xevolution.vrcg.devdemov2400.structures _structures = null;
public static xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public static xevolution.vrcg.devdemov2400.types _types = null;
public static xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public static xevolution.vrcg.devdemov2400.user _user = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"ApiCall",starter._apicall,"APP_CAMERA_ACCESS",starter._app_camera_access,"APP_FINE_LOCATION_ACCESS",starter._app_fine_location_access,"APP_IN_EXECUTION",starter._app_in_execution,"APP_INSTALL_APK",starter._app_install_apk,"APP_RESET_INSTALL",starter._app_reset_install,"APP_SEND_SMS",starter._app_send_sms,"AppState",starter._appstate,"AssetsFolder",starter._assetsfolder,"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"CalledFromSyncButton",starter._calledfromsyncbutton,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CPButtons",starter._cpbuttons,"CPButtonsOFF",starter._cpbuttonsoff,"CurrentFlowPosition",starter._currentflowposition,"CurrentWorkActivity",starter._currentworkactivity,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",starter.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"DevInfo",starter._devinfo,"Encoding",starter.mostCurrent._encoding,"EntityFilter",starter._entityfilter,"EntityKeepFilter",starter._entitykeepfilter,"EntitySearchFilter",starter._entitysearchfilter,"ESC_POS",starter.mostCurrent._esc_pos,"FirstInstall",starter._firstinstall,"GlobalFTP",starter._globalftp,"GPSDEVICE",starter._gpsdevice,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"InternalFolder",starter._internalfolder,"KeepColorMain",starter._keepcolormain,"KeepColorSub",starter._keepcolorsub,"LocalSessionCode",starter._localsessioncode,"LocalSQL",starter._localsql,"LocalSQLEVC",starter._localsqlevc,"LocalSQLWRK",starter._localsqlwrk,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MakingLogin",starter._makinglogin,"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"NotifyActionCount",starter._notifyactioncount,"NotifyRequestCount",starter._notifyrequestcount,"NotifyUserCount",starter._notifyusercount,"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"ObjectFilter",starter._objectfilter,"ObjectFiltered",starter._objectfiltered,"ObjectKeepFilter",starter._objectkeepfilter,"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"ObjectSearchFilter",starter._objectsearchfilter,"Params",starter._params,"PE",starter._pe,"Provider",starter._provider,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"RequestFavorites",starter._requestfavorites,"RequestFilters",starter._requestfilters,"RequestKeepFilter",starter._requestkeepfilter,"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"RequestSearchFilter",starter._requestsearchfilter,"rp",starter._rp,"RunUpdate",starter._runupdate,"SafeDefaultExternal",starter._safedefaultexternal,"Service",starter.mostCurrent._service,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SharedFolder",starter._sharedfolder,"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"StopCommsCheck",starter._stopcommscheck,"StopLocationCheck",starter._stoplocationcheck,"StrFunc",starter._strfunc,"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TaskFilters",starter._taskfilters,"TaskKeepFilter",starter._taskkeepfilter,"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"TaskSearchFilter",starter._tasksearchfilter,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"WEBISOK",starter._webisok,"WIFI",starter._wifi,"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}