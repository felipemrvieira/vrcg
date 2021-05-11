
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

public class consts implements IRemote{
	public static consts mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public consts() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, consts.class);
    static {
		mostCurrent = new consts();
        remoteMe = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.consts");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("consts"), "xevolution.vrcg.devdemov2400.consts");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("xevolution.vrcg.devdemov2400.consts"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _datetimeformat = RemoteObject.createImmutable("");
public static RemoteObject _datetimeformattime = RemoteObject.createImmutable("");
public static RemoteObject _kpilast30days = RemoteObject.createImmutable(0);
public static RemoteObject _kpilastmonth = RemoteObject.createImmutable(0);
public static RemoteObject _kpisincebeginning = RemoteObject.createImmutable(0);
public static RemoteObject _kpibetweendates = RemoteObject.createImmutable(0);
public static RemoteObject _tasktype_unknown = RemoteObject.createImmutable(0);
public static RemoteObject _tasktype_alert = RemoteObject.createImmutable(0);
public static RemoteObject _tasktype_task = RemoteObject.createImmutable(0);
public static RemoteObject _tasktype_action = RemoteObject.createImmutable(0);
public static RemoteObject _nocolor = RemoteObject.createImmutable(0);
public static RemoteObject _colorred = RemoteObject.createImmutable(0);
public static RemoteObject _colorgreen = RemoteObject.createImmutable(0);
public static RemoteObject _colorblue = RemoteObject.createImmutable(0);
public static RemoteObject _coloryellow = RemoteObject.createImmutable(0);
public static RemoteObject _darkgreen = RemoteObject.createImmutable(0);
public static RemoteObject _colorgray = RemoteObject.createImmutable(0);
public static RemoteObject _colororange = RemoteObject.createImmutable(0);
public static RemoteObject _colorlightsilver = RemoteObject.createImmutable(0);
public static RemoteObject _colorwhitesilverlight = RemoteObject.createImmutable(0);
public static RemoteObject _colordarkgray = RemoteObject.createImmutable(0);
public static RemoteObject _colorbluesoftdark = RemoteObject.createImmutable(0);
public static RemoteObject _colorbluedark = RemoteObject.createImmutable(0);
public static RemoteObject _colorredorange = RemoteObject.createImmutable(0);
public static RemoteObject _colorciansoftlight = RemoteObject.createImmutable(0);
public static RemoteObject _colorwhite = RemoteObject.createImmutable(0);
public static RemoteObject _colorlightred = RemoteObject.createImmutable(0);
public static RemoteObject _colorselecselected = RemoteObject.createImmutable(0);
public static RemoteObject _colorselecnotselected = RemoteObject.createImmutable(0);
public static RemoteObject _whitesoftdusk = RemoteObject.createImmutable(0);
public static RemoteObject _whitesoftduskblue = RemoteObject.createImmutable(0);
public static RemoteObject _darkgray = RemoteObject.createImmutable(0);
public static RemoteObject _blacknoalpha = RemoteObject.createImmutable(0);
public static RemoteObject _colormain = RemoteObject.createImmutable(0);
public static RemoteObject _colormaindarker = RemoteObject.createImmutable(0);
public static RemoteObject _colorsub = RemoteObject.createImmutable(0);
public static RemoteObject _applogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _companyimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _appversioncodename = RemoteObject.createImmutable("");
public static RemoteObject _apptitle = RemoteObject.createImmutable("");
public static RemoteObject _appwebsitelink = RemoteObject.createImmutable("");
public static RemoteObject _apkname = RemoteObject.createImmutable("");
public static RemoteObject _logowidth = RemoteObject.createImmutable(0);
public static RemoteObject _logomobileheight = RemoteObject.createImmutable(0);
public static RemoteObject _logofill = RemoteObject.createImmutable(0);
public static RemoteObject _cloptiontype_buttons = RemoteObject.createImmutable(0);
public static RemoteObject _cloptiontype_multibuttons = RemoteObject.createImmutable(0);
public static RemoteObject _cloptiontype_textedit = RemoteObject.createImmutable(0);
public static RemoteObject _cloptiontype_selectionlist = RemoteObject.createImmutable(0);
public static RemoteObject _arr_firstitem = RemoteObject.createImmutable(0);
public static RemoteObject _arr_seconditem = RemoteObject.createImmutable(0);
public static RemoteObject _arr_thirditem = RemoteObject.createImmutable(0);
public static RemoteObject _arr_fourthitem = RemoteObject.createImmutable(0);
public static RemoteObject _arr_fifthitem = RemoteObject.createImmutable(0);
public static RemoteObject _posoption_repeat = RemoteObject.createImmutable(0);
public static RemoteObject _posoption_critical = RemoteObject.createImmutable(0);
public static RemoteObject _posoption_mandatory = RemoteObject.createImmutable(0);
public static RemoteObject _posoption_multiop = RemoteObject.createImmutable(0);
public static RemoteObject _itkey_request = RemoteObject.createImmutable(0);
public static RemoteObject _itkey_object = RemoteObject.createImmutable(0);
public static RemoteObject _itkey_checklist = RemoteObject.createImmutable(0);
public static RemoteObject _itkey_uniquekey = RemoteObject.createImmutable(0);
public static RemoteObject _itkey_tagcode = RemoteObject.createImmutable(0);
public static RemoteObject _itkey_quest = RemoteObject.createImmutable(0);
public static RemoteObject _item_selected = RemoteObject.createImmutable(0);
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
		return new Object[] {"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"ApkName",consts._apkname,"AppLogo",consts._applogo,"AppTitle",consts._apptitle,"AppVersionCodeName",consts._appversioncodename,"AppWebSiteLink",consts._appwebsitelink,"ARR_FIFTHITEM",consts._arr_fifthitem,"ARR_FIRSTITEM",consts._arr_firstitem,"ARR_FOURTHITEM",consts._arr_fourthitem,"ARR_SECONDITEM",consts._arr_seconditem,"ARR_THIRDITEM",consts._arr_thirditem,"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"BlackNoAlpha",consts._blacknoalpha,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"CLOptionType_Buttons",consts._cloptiontype_buttons,"CLOptionType_MultiButtons",consts._cloptiontype_multibuttons,"CLOptionType_SelectionList",consts._cloptiontype_selectionlist,"CLOptionType_TextEdit",consts._cloptiontype_textedit,"ColorBlue",consts._colorblue,"ColorBlueDark",consts._colorbluedark,"ColorBlueSoftDark",consts._colorbluesoftdark,"ColorCianSoftLight",consts._colorciansoftlight,"ColorDarkGray",consts._colordarkgray,"ColorGray",consts._colorgray,"ColorGreen",consts._colorgreen,"ColorLightRed",consts._colorlightred,"ColorLightSilver",consts._colorlightsilver,"ColorMain",consts._colormain,"ColorMainDarker",consts._colormaindarker,"ColorOrange",consts._colororange,"ColorRed",consts._colorred,"ColorRedOrange",consts._colorredorange,"ColorSelecNotSelected",consts._colorselecnotselected,"ColorSelecSelected",consts._colorselecselected,"ColorSub",consts._colorsub,"ColorWhite",consts._colorwhite,"ColorWhiteSilverLight",consts._colorwhitesilverlight,"ColorYellow",consts._coloryellow,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"CompanyImage",consts._companyimage,"DarkGray",consts._darkgray,"DarkGreen",consts._darkgreen,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateTimeFormat",consts._datetimeformat,"DateTimeFormatTime",consts._datetimeformattime,"DateUtils",consts.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Encoding",consts.mostCurrent._encoding,"ESC_POS",consts.mostCurrent._esc_pos,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"ITEM_SELECTED",consts._item_selected,"ITKEY_CHECKLIST",consts._itkey_checklist,"ITKEY_OBJECT",consts._itkey_object,"ITKEY_QUEST",consts._itkey_quest,"ITKEY_REQUEST",consts._itkey_request,"ITKEY_TAGCODE",consts._itkey_tagcode,"ITKEY_UNIQUEKEY",consts._itkey_uniquekey,"KPIBetweenDates",consts._kpibetweendates,"KPILast30Days",consts._kpilast30days,"KPILastMonth",consts._kpilastmonth,"KPISinceBeginning",consts._kpisincebeginning,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"LogoFill",consts._logofill,"LogoMobileHeight",consts._logomobileheight,"LogoWidth",consts._logowidth,"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"NoColor",consts._nocolor,"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"POSOPTION_CRITICAL",consts._posoption_critical,"POSOPTION_MANDATORY",consts._posoption_mandatory,"POSOPTION_MULTIOP",consts._posoption_multiop,"POSOPTION_REPEAT",consts._posoption_repeat,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"TASKTYPE_ACTION",consts._tasktype_action,"TASKTYPE_ALERT",consts._tasktype_alert,"TASKTYPE_TASK",consts._tasktype_task,"TASKTYPE_UNKNOWN",consts._tasktype_unknown,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"WhiteSoftDusk",consts._whitesoftdusk,"WhiteSoftDuskBlue",consts._whitesoftduskblue,"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}