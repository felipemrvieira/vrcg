
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

public class taskscl2 implements IRemote{
	public static taskscl2 mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public taskscl2() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("taskscl2"), "xevolution.vrcg.devdemov2400.taskscl2");
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
		pcBA = new PCBA(this, taskscl2.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mypositionlat = RemoteObject.createImmutable("");
public static RemoteObject _mypositionlon = RemoteObject.createImmutable("");
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _buttonuserunavailable = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listsbasepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbottomline = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbottompanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbuttonclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listslabelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _liststabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabStripViewPager");
public static RemoteObject _liststopbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listitemfullname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listsbuttonfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldatetime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelappinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcopyright = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemscounter = RemoteObject.createImmutable(0);
public static RemoteObject _butsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _isfiltered = RemoteObject.createImmutable(false);
public static RemoteObject _idialogreqtype = RemoteObject.createImmutable(0);
public static RemoteObject _idialogreqstatus = RemoteObject.createImmutable(0);
public static RemoteObject _idialogrequpdtated = RemoteObject.createImmutable(0);
public static RemoteObject _idialogreqwithrequests = RemoteObject.createImmutable(0);
public static RemoteObject _searchfilter = RemoteObject.createImmutable("");
public static RemoteObject _listbutactions = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listitemupdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemstate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemprogress = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _listchecklists = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _listitemdateversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _colortabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listactions = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _currentlineitemcl = RemoteObject.createImmutable(0);
public static RemoteObject _totallineitemscl = RemoteObject.createImmutable(0);
public static RemoteObject _currentlineitemac = RemoteObject.createImmutable(0);
public static RemoteObject _totallineitemsac = RemoteObject.createImmutable(0);
public static RemoteObject _currenttab = RemoteObject.createImmutable(0);
public static RemoteObject _mainlabeloptlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mainlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _buttonactionpause = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainactiveuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttonappnetwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listitemdesc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemtype = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemslist = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _listtyperequests = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _tprcurrentstatus = RemoteObject.createImmutable("");
public static RemoteObject _clcurrentstatus = RemoteObject.createImmutable("");
public static RemoteObject _taskslabelstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _taskslabeltitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _taskslabelultimoupd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _taskslabelgrupo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _taskslabeltresultado = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _taskslabeltypeobjectfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tasklvlabelstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tasklvlabelstatustitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tasklvlabelultimoudp = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tasklvlabelgrupo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tasklvlabeltresultado = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _taskslvlabeltypeobjectfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
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
public static xevolution.vrcg.devdemov2400.structures _structures = null;
public static xevolution.vrcg.devdemov2400.types _types = null;
public static xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public static xevolution.vrcg.devdemov2400.user _user = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",taskscl2.mostCurrent._activity,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"butSearch",taskscl2.mostCurrent._butsearch,"ButtonActionPause",taskscl2.mostCurrent._buttonactionpause,"ButtonAppNetwork",taskscl2.mostCurrent._buttonappnetwork,"ButtonUserUnavailable",taskscl2.mostCurrent._buttonuserunavailable,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"CLCurrentStatus",taskscl2.mostCurrent._clcurrentstatus,"ColorTabPanel",taskscl2.mostCurrent._colortabpanel,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CurrentLineItemAC",taskscl2._currentlineitemac,"CurrentLineItemCL",taskscl2._currentlineitemcl,"CurrentTab",taskscl2._currenttab,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",taskscl2.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Device",taskscl2._device,"EditSearch",taskscl2.mostCurrent._editsearch,"Encoding",taskscl2.mostCurrent._encoding,"ESC_POS",taskscl2.mostCurrent._esc_pos,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"iDialogReqStatus",taskscl2._idialogreqstatus,"iDialogReqType",taskscl2._idialogreqtype,"iDialogReqUpdtated",taskscl2._idialogrequpdtated,"iDialogReqWithRequests",taskscl2._idialogreqwithrequests,"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"IsFiltered",taskscl2._isfiltered,"ItemsCounter",taskscl2._itemscounter,"LabelAppInfo",taskscl2.mostCurrent._labelappinfo,"LabelCopyright",taskscl2.mostCurrent._labelcopyright,"LabelDateTime",taskscl2.mostCurrent._labeldatetime,"LabelVersion",taskscl2.mostCurrent._labelversion,"listActions",taskscl2.mostCurrent._listactions,"listButActions",taskscl2.mostCurrent._listbutactions,"listChecklists",taskscl2.mostCurrent._listchecklists,"ListItemDateVersion",taskscl2.mostCurrent._listitemdateversion,"ListItemDesc",taskscl2.mostCurrent._listitemdesc,"ListItemFullName",taskscl2.mostCurrent._listitemfullname,"ListItemGroup",taskscl2.mostCurrent._listitemgroup,"ListItemProgress",taskscl2.mostCurrent._listitemprogress,"ListItemsList",taskscl2.mostCurrent._listitemslist,"ListItemState",taskscl2.mostCurrent._listitemstate,"ListItemStatus",taskscl2.mostCurrent._listitemstatus,"ListItemType",taskscl2.mostCurrent._listitemtype,"ListItemUpdate",taskscl2.mostCurrent._listitemupdate,"ListItemVersion",taskscl2.mostCurrent._listitemversion,"listsBasePanel",taskscl2.mostCurrent._listsbasepanel,"listsBottomLine",taskscl2.mostCurrent._listsbottomline,"listsBottomPanel",taskscl2.mostCurrent._listsbottompanel,"listsButtonClose",taskscl2.mostCurrent._listsbuttonclose,"listsButtonFilter",taskscl2.mostCurrent._listsbuttonfilter,"listsLabelInfo",taskscl2.mostCurrent._listslabelinfo,"listsTabPanel",taskscl2.mostCurrent._liststabpanel,"listsTopBar",taskscl2.mostCurrent._liststopbar,"listTypeRequests",taskscl2.mostCurrent._listtyperequests,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"mainActiveUser",taskscl2.mostCurrent._mainactiveuser,"mainLabelOptLists",taskscl2.mostCurrent._mainlabeloptlists,"mainLogo",taskscl2.mostCurrent._mainlogo,"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"MyPositionLat",taskscl2._mypositionlat,"MyPositionLon",taskscl2._mypositionlon,"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"SearchFilter",taskscl2.mostCurrent._searchfilter,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"taskLVLabelGrupo",taskscl2.mostCurrent._tasklvlabelgrupo,"taskLVLabelStatus",taskscl2.mostCurrent._tasklvlabelstatus,"taskLVLabelStatusTitulo",taskscl2.mostCurrent._tasklvlabelstatustitulo,"taskLVLabelTResultado",taskscl2.mostCurrent._tasklvlabeltresultado,"taskLVLabelUltimoUdp",taskscl2.mostCurrent._tasklvlabelultimoudp,"tasksLabelGrupo",taskscl2.mostCurrent._taskslabelgrupo,"tasksLabelStatus",taskscl2.mostCurrent._taskslabelstatus,"tasksLabelTitulo",taskscl2.mostCurrent._taskslabeltitulo,"tasksLabelTResultado",taskscl2.mostCurrent._taskslabeltresultado,"taskslabelTypeObjectFilter",taskscl2.mostCurrent._taskslabeltypeobjectfilter,"tasksLabelUltimoUpd",taskscl2.mostCurrent._taskslabelultimoupd,"tasksLVlabelTypeObjectFilter",taskscl2.mostCurrent._taskslvlabeltypeobjectfilter,"TotalLineItemsAC",taskscl2._totallineitemsac,"TotalLineItemsCL",taskscl2._totallineitemscl,"TPRCurrentStatus",taskscl2.mostCurrent._tprcurrentstatus,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}