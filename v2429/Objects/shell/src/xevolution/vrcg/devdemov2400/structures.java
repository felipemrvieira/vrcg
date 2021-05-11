
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

public class structures implements IRemote{
	public static structures mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public structures() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, structures.class);
    static {
		mostCurrent = new structures();
        remoteMe = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.structures");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("structures"), "xevolution.vrcg.devdemov2400.structures");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("xevolution.vrcg.devdemov2400.structures"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mapuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _track_user = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapreports = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _track_reports = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _maprequests = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _trackrequests = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _requeststypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _typerequestsstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapentities = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _track_entities = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _entities_types = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapobjects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _track_objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _objects_types = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _maptasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _track_tasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _alerts_types = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _alerts_status = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _alerts_itemstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _alerts_priorities = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _alerts_urgency = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static RemoteObject _encoding = RemoteObject.declareNull("b4a.example.encoding");
public static RemoteObject _esc_pos = RemoteObject.declareNull("b4a.example.esc_pos");
public static xevolution.vrcg.devdemov2400.main _main = null;
public static xevolution.vrcg.devdemov2400.starter _starter = null;
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
public static xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public static xevolution.vrcg.devdemov2400.types _types = null;
public static xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public static xevolution.vrcg.devdemov2400.user _user = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"Alerts_ItemStatus",structures._alerts_itemstatus,"Alerts_Priorities",structures._alerts_priorities,"Alerts_Status",structures._alerts_status,"Alerts_Types",structures._alerts_types,"Alerts_Urgency",structures._alerts_urgency,"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",structures.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Encoding",structures.mostCurrent._encoding,"Entities_Types",structures._entities_types,"ESC_POS",structures.mostCurrent._esc_pos,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MapEntities",structures._mapentities,"MapObjects",structures._mapobjects,"MapReports",structures._mapreports,"MapRequests",structures._maprequests,"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"MapTasks",structures._maptasks,"MapUser",structures._mapuser,"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"Objects_Types",structures._objects_types,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"RequestsTypes",structures._requeststypes,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"Track_Entities",structures._track_entities,"Track_Objects",structures._track_objects,"Track_Reports",structures._track_reports,"Track_Tasks",structures._track_tasks,"Track_User",structures._track_user,"TrackRequests",structures._trackrequests,"TypeRequestsStatus",structures._typerequestsstatus,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}