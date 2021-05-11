
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

public class mapsactivity implements IRemote{
	public static mapsactivity mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mapsactivity() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mapsactivity"), "xevolution.vrcg.devdemov2400.mapsactivity");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, mapsactivity.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mainmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
public static RemoteObject _mainmapfragment = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper");
public static RemoteObject _blockpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _progressbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _currentclaitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
public static RemoteObject _latitude = RemoteObject.createImmutable("");
public static RemoteObject _longitude = RemoteObject.createImmutable("");
public static RemoteObject _colortabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labellat = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labellng = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
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
		return new Object[] {"Activity",mapsactivity.mostCurrent._activity,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"BlockPanel",mapsactivity.mostCurrent._blockpanel,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"ColorTabPanel",mapsactivity.mostCurrent._colortabpanel,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CurrentCLAItem",mapsactivity.mostCurrent._currentclaitem,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",mapsactivity.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Encoding",mapsactivity.mostCurrent._encoding,"ESC_POS",mapsactivity.mostCurrent._esc_pos,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"LabelLat",mapsactivity.mostCurrent._labellat,"LabelLng",mapsactivity.mostCurrent._labellng,"Latitude",mapsactivity.mostCurrent._latitude,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Longitude",mapsactivity.mostCurrent._longitude,"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"MainMap",mapsactivity.mostCurrent._mainmap,"MainMapFragment",mapsactivity.mostCurrent._mainmapfragment,"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"ProgressBar",mapsactivity.mostCurrent._progressbar,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}