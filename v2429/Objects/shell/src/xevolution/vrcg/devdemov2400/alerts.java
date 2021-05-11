
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

public class alerts implements IRemote{
	public static alerts mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public alerts() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("alerts"), "xevolution.vrcg.devdemov2400.alerts");
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
		pcBA = new PCBA(this, alerts.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _liststabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabStripViewPager");
public static RemoteObject _listsbuttonclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _recalerts = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.structalerts");
public static RemoteObject _listalerts = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _listtasks = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _listactions = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _panelrequestoptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _butrequestinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butrequestrun = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butrequestaction = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butrequestclosepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldatetime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcopyright = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttonuserunavailable = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _googlemaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _mapa_alertas_fragment = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper");
public static RemoteObject _panelmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _currentlineitemal = RemoteObject.createImmutable(0);
public static RemoteObject _totallineitemsal = RemoteObject.createImmutable(0);
public static RemoteObject _currentlineitemac = RemoteObject.createImmutable(0);
public static RemoteObject _totallineitemsac = RemoteObject.createImmutable(0);
public static RemoteObject _currentlineitemcl = RemoteObject.createImmutable(0);
public static RemoteObject _totallineitemscl = RemoteObject.createImmutable(0);
public static RemoteObject _currenttab = RemoteObject.createImmutable(0);
public static RemoteObject _listslabelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mainlabeloptlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mainlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _colortabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _buttonactionpause = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonappnetwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainactiveuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _alertsalertsviewpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _alertstasksviewpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _alertsactionsviewpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _actionsviewtype = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xcombobox");
public static RemoteObject _actionsstartdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _actionsenddate = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _butactionsstartdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butactionsenddate = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labeln = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldescricaoalerta = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeltaskviewstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeltaskviewdescricao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeltaskviewlabeln = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelactionviewstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelactionviewdescricao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelactionviewn = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _taskviewtypeobjectfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _alertviewtypeobjectfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _actionviewtypeobjectfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _alertmapbuttondismiss = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labeltitlealertmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
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
		return new Object[] {"actionsEndDate",alerts.mostCurrent._actionsenddate,"actionsStartDate",alerts.mostCurrent._actionsstartdate,"actionsViewType",alerts.mostCurrent._actionsviewtype,"ActionViewTypeObjectFilter",alerts.mostCurrent._actionviewtypeobjectfilter,"Activity",alerts.mostCurrent._activity,"AlertMapButtonDismiss",alerts.mostCurrent._alertmapbuttondismiss,"alertsActionsViewPanel",alerts.mostCurrent._alertsactionsviewpanel,"alertsAlertsViewPanel",alerts.mostCurrent._alertsalertsviewpanel,"alertsTasksViewPanel",alerts.mostCurrent._alertstasksviewpanel,"AlertViewTypeObjectFilter",alerts.mostCurrent._alertviewtypeobjectfilter,"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"butactionsEndDate",alerts.mostCurrent._butactionsenddate,"butactionsStartDate",alerts.mostCurrent._butactionsstartdate,"butRequestAction",alerts.mostCurrent._butrequestaction,"butRequestClosePanel",alerts.mostCurrent._butrequestclosepanel,"butRequestInfo",alerts.mostCurrent._butrequestinfo,"butRequestRun",alerts.mostCurrent._butrequestrun,"ButtonActionPause",alerts.mostCurrent._buttonactionpause,"ButtonAppNetwork",alerts.mostCurrent._buttonappnetwork,"ButtonUserUnavailable",alerts.mostCurrent._buttonuserunavailable,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"ColorTabPanel",alerts.mostCurrent._colortabpanel,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CurrentLineItemAC",alerts._currentlineitemac,"CurrentLineItemAL",alerts._currentlineitemal,"CurrentLineItemCL",alerts._currentlineitemcl,"CurrentTab",alerts._currenttab,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",alerts.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Device",alerts._device,"Encoding",alerts.mostCurrent._encoding,"ESC_POS",alerts.mostCurrent._esc_pos,"GoogleMaps",alerts.mostCurrent._googlemaps,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"LabelActionViewDescricao",alerts.mostCurrent._labelactionviewdescricao,"labelActionViewn",alerts.mostCurrent._labelactionviewn,"LabelActionViewStatus",alerts.mostCurrent._labelactionviewstatus,"LabelCopyright",alerts.mostCurrent._labelcopyright,"LabelDateTime",alerts.mostCurrent._labeldatetime,"LabelDescricaoAlerta",alerts.mostCurrent._labeldescricaoalerta,"labeln",alerts.mostCurrent._labeln,"LabelStatus",alerts.mostCurrent._labelstatus,"LabelTaskViewDescricao",alerts.mostCurrent._labeltaskviewdescricao,"LabelTaskViewlabeln",alerts.mostCurrent._labeltaskviewlabeln,"LabelTaskViewStatus",alerts.mostCurrent._labeltaskviewstatus,"labelTitleAlertMap",alerts.mostCurrent._labeltitlealertmap,"LabelVersion",alerts.mostCurrent._labelversion,"listActions",alerts.mostCurrent._listactions,"listAlerts",alerts.mostCurrent._listalerts,"listsButtonClose",alerts.mostCurrent._listsbuttonclose,"listsLabelInfo",alerts.mostCurrent._listslabelinfo,"listsTabPanel",alerts.mostCurrent._liststabpanel,"listTasks",alerts.mostCurrent._listtasks,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"mainActiveUser",alerts.mostCurrent._mainactiveuser,"mainLabelOptLists",alerts.mostCurrent._mainlabeloptlists,"mainLogo",alerts.mostCurrent._mainlogo,"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"Mapa_Alertas_fragment",alerts.mostCurrent._mapa_alertas_fragment,"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"PanelMAP",alerts.mostCurrent._panelmap,"panelRequestOptions",alerts.mostCurrent._panelrequestoptions,"recAlerts",alerts.mostCurrent._recalerts,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"rp",alerts.mostCurrent._rp,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"TaskViewTypeObjectFilter",alerts.mostCurrent._taskviewtypeobjectfilter,"TotalLineItemsAC",alerts._totallineitemsac,"TotalLineItemsAL",alerts._totallineitemsal,"TotalLineItemsCL",alerts._totallineitemscl,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}