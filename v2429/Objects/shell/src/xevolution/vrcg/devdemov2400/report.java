
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

public class report implements IRemote{
	public static report mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public report() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("report"), "xevolution.vrcg.devdemov2400.report");
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
		pcBA = new PCBA(this, report.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mypositionlat = RemoteObject.createImmutable("");
public static RemoteObject _mypositionlon = RemoteObject.createImmutable("");
public static RemoteObject _timestart = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _listsbasepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbottomline = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbottompanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbuttonclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listslabelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _liststabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabStripViewPager");
public static RemoteObject _liststopbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
public static RemoteObject _butwarehouses = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mpopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _mdocpopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _meqippopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _butdocfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butequipfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _userdocuments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _userequipments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _pc1 = RemoteObject.declareNull("androidchartswrapper.pieChartWrapper");
public static RemoteObject _listperiods = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xcombobox2");
public static RemoteObject _startdateselect = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _enddateselect = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _butdatefilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcancelfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _adps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _labelkpidescription = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelkpivalue = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelkpivaluecompare = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _kpilist = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _kpiupdateprogress = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _labelversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldatetime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcopyright = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttonuserunavailable = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labeluserlate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeluseravarage = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelusernotmade = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelusermade = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelusermade = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneluserlate = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneluseravarage = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelusernotmade = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pc0 = RemoteObject.declareNull("androidchartswrapper.pieChartWrapper");
public static RemoteObject _dialogreqperiodtype = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _dialogreqstartdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
public static RemoteObject _dialogreqenddate = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
public static RemoteObject _butreqstartdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butreqenddate = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _sdatefiltervalue = RemoteObject.createImmutable("");
public static RemoteObject _edatefiltervalue = RemoteObject.createImmutable("");
public static RemoteObject _periodfiltervalue = RemoteObject.createImmutable(0);
public static RemoteObject _kpilistall = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _colortabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainlabeloptlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mainlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _buttonactionpause = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonappnetwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainactiveuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelestadopedidos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelperiodo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldatainicio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldatafim = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelkpidescricao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelvalor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelkpiestadopedidos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelkpioutrosindicadores = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelkpivalor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelkpicomparacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
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
		return new Object[] {"Activity",report.mostCurrent._activity,"adps",report.mostCurrent._adps,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"Base64Con",report.mostCurrent._base64con,"butCancelFilter",report.mostCurrent._butcancelfilter,"butDateFilter",report.mostCurrent._butdatefilter,"butDocFilter",report.mostCurrent._butdocfilter,"butEquipFilter",report.mostCurrent._butequipfilter,"butReqEndDate",report.mostCurrent._butreqenddate,"butReqStartDate",report.mostCurrent._butreqstartdate,"ButtonActionPause",report.mostCurrent._buttonactionpause,"ButtonAppNetwork",report.mostCurrent._buttonappnetwork,"ButtonUserUnavailable",report.mostCurrent._buttonuserunavailable,"butWareHouses",report.mostCurrent._butwarehouses,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"ColorTabPanel",report.mostCurrent._colortabpanel,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",report.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Device",report._device,"DialogReqEndDate",report.mostCurrent._dialogreqenddate,"DialogReqPeriodType",report.mostCurrent._dialogreqperiodtype,"DialogReqStartDate",report.mostCurrent._dialogreqstartdate,"EDateFilterValue",report.mostCurrent._edatefiltervalue,"Encoding",report.mostCurrent._encoding,"EndDateSelect",report.mostCurrent._enddateselect,"ESC_POS",report.mostCurrent._esc_pos,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"KPIList",report.mostCurrent._kpilist,"KPIListAll",report.mostCurrent._kpilistall,"KPIUpdateProgress",report.mostCurrent._kpiupdateprogress,"LabelCopyright",report.mostCurrent._labelcopyright,"LabelDataFim",report.mostCurrent._labeldatafim,"LabelDataInicio",report.mostCurrent._labeldatainicio,"LabelDateTime",report.mostCurrent._labeldatetime,"LabelEstadoPedidos",report.mostCurrent._labelestadopedidos,"LabelKPIComparacao",report.mostCurrent._labelkpicomparacao,"LabelKPIDescricao",report.mostCurrent._labelkpidescricao,"labelKPIDescription",report.mostCurrent._labelkpidescription,"LabelKPIEstadoPedidos",report.mostCurrent._labelkpiestadopedidos,"LabelKPIOutrosIndicadores",report.mostCurrent._labelkpioutrosindicadores,"LabelKPIValor",report.mostCurrent._labelkpivalor,"labelKPIValue",report.mostCurrent._labelkpivalue,"labelKPIValueCompare",report.mostCurrent._labelkpivaluecompare,"LabelPeriodo",report.mostCurrent._labelperiodo,"labelUserAvarage",report.mostCurrent._labeluseravarage,"labelUserLate",report.mostCurrent._labeluserlate,"labelUserMade",report.mostCurrent._labelusermade,"labelUserNotMade",report.mostCurrent._labelusernotmade,"LabelValor",report.mostCurrent._labelvalor,"LabelVersion",report.mostCurrent._labelversion,"listPeriods",report.mostCurrent._listperiods,"listsBasePanel",report.mostCurrent._listsbasepanel,"listsBottomLine",report.mostCurrent._listsbottomline,"listsBottomPanel",report.mostCurrent._listsbottompanel,"listsButtonClose",report.mostCurrent._listsbuttonclose,"listsLabelInfo",report.mostCurrent._listslabelinfo,"listsTabPanel",report.mostCurrent._liststabpanel,"listsTopBar",report.mostCurrent._liststopbar,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"mainActiveUser",report.mostCurrent._mainactiveuser,"mainLabelOptLists",report.mostCurrent._mainlabeloptlists,"mainLogo",report.mostCurrent._mainlogo,"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"mDocPopMenu",report.mostCurrent._mdocpopmenu,"mEqipPopMenu",report.mostCurrent._meqippopmenu,"mPopMenu",report.mostCurrent._mpopmenu,"MyPositionLat",report._mypositionlat,"MyPositionLon",report._mypositionlon,"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"panelUserAvarage",report.mostCurrent._paneluseravarage,"panelUserLate",report.mostCurrent._paneluserlate,"panelUserMade",report.mostCurrent._panelusermade,"panelUserNotMade",report.mostCurrent._panelusernotmade,"pc0",report.mostCurrent._pc0,"pc1",report.mostCurrent._pc1,"PeriodFilterValue",report._periodfiltervalue,"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"SDateFilterValue",report.mostCurrent._sdatefiltervalue,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"StartDateSelect",report.mostCurrent._startdateselect,"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"TimeStart",report._timestart,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserDocuments",report.mostCurrent._userdocuments,"UserEquipments",report.mostCurrent._userequipments,"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}