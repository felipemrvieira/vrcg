
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

public class mainmenu implements IRemote{
	public static mainmenu mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mainmenu() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mainmenu"), "xevolution.vrcg.devdemov2400.mainmenu");
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
		pcBA = new PCBA(this, mainmenu.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _timestart = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _appstarted = RemoteObject.createImmutable(false);
public static RemoteObject _mainshowdialogresult = RemoteObject.createImmutable(0);
public static RemoteObject _started = RemoteObject.createImmutable(false);
public static RemoteObject _waittoconfirm = RemoteObject.createImmutable(false);
public static RemoteObject _currentloginuser = RemoteObject.createImmutable("");
public static RemoteObject _islogindone = RemoteObject.createImmutable(false);
public static RemoteObject _ismainscreen = RemoteObject.createImmutable(false);
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _isfirsttime = RemoteObject.createImmutable(false);
public static RemoteObject _requestauth = RemoteObject.createImmutable(false);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _badgeritems = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.badger");
public static RemoteObject _mainbasepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainbottompanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainbuttonmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _maintopbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainbottomline = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _maintopline = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainlabelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _paneloptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _butquickaction = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcallcamera = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcallactions = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldatetime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelappinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcopyright = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dialoglogin = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
public static RemoteObject _dialogauthorization = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
public static RemoteObject _buttonuserunavailable = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _authversionslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cpbuttontasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cpbuttonrequests = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cpbuttonobjects = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cpbuttonuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cpbuttonkpi = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cpbuttonalerts = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainpopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _mainpopmenulist = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _lgo_passwordmode = RemoteObject.createImmutable(false);
public static RemoteObject _neterrortrycount = RemoteObject.createImmutable(0);
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _buttonactionpause = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonappnetwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonapplatency = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainactiveuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mainlayout = RemoteObject.createImmutable("");
public static RemoteObject _lockpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainmenutabstrip = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabStripViewPager");
public static RemoteObject _butcallshort3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcallshort2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcallshort1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _printer = RemoteObject.declareNull("b4a.example.bt_printer");
public static RemoteObject _updateservicetimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _labelavisoprocessamento = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelfirstinstallconfig = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _progressoinicial2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _labeltarefa = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _progressoinicial = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _labeldownloadinicialfases = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldownloadinicialtitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _paneldownloadinicial = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _datasyncmanual = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.anotherdatepicker");
public static RemoteObject _currentcld = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
public static RemoteObject _appldialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
public static RemoteObject _buttonassociated = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonscanprinter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listviewbluetoothdevices = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _buttonprint = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _printermessage = RemoteObject.createImmutable("");
public static RemoteObject _currentprinterconnected = RemoteObject.declareNull("Object");
public static RemoteObject _butsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _searchpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _editsearchsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _butsearchsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butsearchserver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainactiveusersearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mainlogosearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _progresssearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _butactionsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butclosesearchpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _expandlistsearch = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _recordlinepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _recordlinetitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _recordlinemoreoptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _recordlinetitlesecond = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _butsearchclear = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static RemoteObject _encoding = RemoteObject.declareNull("b4a.example.encoding");
public static RemoteObject _esc_pos = RemoteObject.declareNull("b4a.example.esc_pos");
public static xevolution.vrcg.devdemov2400.main _main = null;
public static xevolution.vrcg.devdemov2400.starter _starter = null;
public static xevolution.vrcg.devdemov2400.comms _comms = null;
public static xevolution.vrcg.devdemov2400.utils _utils = null;
public static xevolution.vrcg.devdemov2400.dbstructures _dbstructures = null;
public static xevolution.vrcg.devdemov2400.sharecode _sharecode = null;
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
		return new Object[] {"Activity",mainmenu.mostCurrent._activity,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"ApplDialog",mainmenu.mostCurrent._appldialog,"AppStarted",mainmenu._appstarted,"AuthVersionsList",mainmenu.mostCurrent._authversionslist,"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BadgerItems",mainmenu.mostCurrent._badgeritems,"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"butActionSearch",mainmenu.mostCurrent._butactionsearch,"butCallActions",mainmenu.mostCurrent._butcallactions,"butCallCamera",mainmenu.mostCurrent._butcallcamera,"butCallShort1",mainmenu.mostCurrent._butcallshort1,"butCallShort2",mainmenu.mostCurrent._butcallshort2,"butCallShort3",mainmenu.mostCurrent._butcallshort3,"butCloseSearchPanel",mainmenu.mostCurrent._butclosesearchpanel,"butQuickAction",mainmenu.mostCurrent._butquickaction,"butSearch",mainmenu.mostCurrent._butsearch,"butSearchClear",mainmenu.mostCurrent._butsearchclear,"butSearchSearch",mainmenu.mostCurrent._butsearchsearch,"butSearchServer",mainmenu.mostCurrent._butsearchserver,"ButtonActionPause",mainmenu.mostCurrent._buttonactionpause,"ButtonAppLatency",mainmenu.mostCurrent._buttonapplatency,"ButtonAppNetwork",mainmenu.mostCurrent._buttonappnetwork,"ButtonAssociated",mainmenu.mostCurrent._buttonassociated,"ButtonPrint",mainmenu.mostCurrent._buttonprint,"ButtonScanPrinter",mainmenu.mostCurrent._buttonscanprinter,"ButtonUserUnavailable",mainmenu.mostCurrent._buttonuserunavailable,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CPButtonAlerts",mainmenu.mostCurrent._cpbuttonalerts,"CPButtonKPI",mainmenu.mostCurrent._cpbuttonkpi,"CPButtonObjects",mainmenu.mostCurrent._cpbuttonobjects,"CPButtonRequests",mainmenu.mostCurrent._cpbuttonrequests,"CPButtonTasks",mainmenu.mostCurrent._cpbuttontasks,"CPButtonUser",mainmenu.mostCurrent._cpbuttonuser,"CurrentCLD",mainmenu.mostCurrent._currentcld,"CurrentLoginUser",mainmenu._currentloginuser,"CurrentPrinterConnected",mainmenu.mostCurrent._currentprinterconnected,"CustomListView1",mainmenu.mostCurrent._customlistview1,"DataSyncManual",mainmenu.mostCurrent._datasyncmanual,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",mainmenu.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Device",mainmenu._device,"DialogAuthorization",mainmenu.mostCurrent._dialogauthorization,"DialogLogin",mainmenu.mostCurrent._dialoglogin,"EditSearch",mainmenu.mostCurrent._editsearch,"EditSearchSearch",mainmenu.mostCurrent._editsearchsearch,"Encoding",mainmenu.mostCurrent._encoding,"ESC_POS",mainmenu.mostCurrent._esc_pos,"ExpandListSearch",mainmenu.mostCurrent._expandlistsearch,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"IsFirsttime",mainmenu._isfirsttime,"isLoginDone",mainmenu._islogindone,"isMainScreen",mainmenu._ismainscreen,"LabelAppInfo",mainmenu.mostCurrent._labelappinfo,"LabelAvisoProcessamento",mainmenu.mostCurrent._labelavisoprocessamento,"LabelCopyright",mainmenu.mostCurrent._labelcopyright,"LabelDateTime",mainmenu.mostCurrent._labeldatetime,"LabelDownloadInicialFases",mainmenu.mostCurrent._labeldownloadinicialfases,"LabelDownloadInicialTitle",mainmenu.mostCurrent._labeldownloadinicialtitle,"LabelTarefa",mainmenu.mostCurrent._labeltarefa,"LabelVersion",mainmenu.mostCurrent._labelversion,"LGO_PasswordMode",mainmenu._lgo_passwordmode,"ListViewBluetoothDevices",mainmenu.mostCurrent._listviewbluetoothdevices,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"LockPanel",mainmenu.mostCurrent._lockpanel,"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"mainActiveUser",mainmenu.mostCurrent._mainactiveuser,"mainActiveUserSearch",mainmenu.mostCurrent._mainactiveusersearch,"mainBasePanel",mainmenu.mostCurrent._mainbasepanel,"mainBottomLine",mainmenu.mostCurrent._mainbottomline,"mainBottomPanel",mainmenu.mostCurrent._mainbottompanel,"mainButtonMenu",mainmenu.mostCurrent._mainbuttonmenu,"mainLabelInfo",mainmenu.mostCurrent._mainlabelinfo,"mainLayout",mainmenu.mostCurrent._mainlayout,"mainLogo",mainmenu.mostCurrent._mainlogo,"mainLogoSearch",mainmenu.mostCurrent._mainlogosearch,"MainMenuTabStrip",mainmenu.mostCurrent._mainmenutabstrip,"MainPopMenu",mainmenu.mostCurrent._mainpopmenu,"MainPopMenuList",mainmenu.mostCurrent._mainpopmenulist,"mainShowDialogResult",mainmenu._mainshowdialogresult,"mainTopBar",mainmenu.mostCurrent._maintopbar,"mainTopLine",mainmenu.mostCurrent._maintopline,"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"NetErrorTryCount",mainmenu._neterrortrycount,"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"PanelDownloadInicial",mainmenu.mostCurrent._paneldownloadinicial,"PanelFirstInstallConfig",mainmenu.mostCurrent._panelfirstinstallconfig,"panelOptions",mainmenu.mostCurrent._paneloptions,"Printer",mainmenu.mostCurrent._printer,"PrinterMessage",mainmenu.mostCurrent._printermessage,"ProgressoInicial",mainmenu.mostCurrent._progressoinicial,"ProgressoInicial2",mainmenu.mostCurrent._progressoinicial2,"ProgressSearch",mainmenu.mostCurrent._progresssearch,"RecordLineMoreOptions",mainmenu.mostCurrent._recordlinemoreoptions,"RecordLinePanel",mainmenu.mostCurrent._recordlinepanel,"RecordLineTitle",mainmenu.mostCurrent._recordlinetitle,"RecordLineTitleSecond",mainmenu.mostCurrent._recordlinetitlesecond,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"Requestauth",mainmenu._requestauth,"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"SearchPanel",mainmenu.mostCurrent._searchpanel,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Started",mainmenu._started,"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"TimeStart",mainmenu._timestart,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"UpdateServiceTimer",mainmenu.mostCurrent._updateservicetimer,"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"WaitToConfirm",mainmenu._waittoconfirm,"xui",mainmenu._xui,"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}