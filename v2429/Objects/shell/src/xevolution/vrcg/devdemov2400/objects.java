
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

public class objects implements IRemote{
	public static objects mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public objects() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("objects"), "xevolution.vrcg.devdemov2400.objects");
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
		pcBA = new PCBA(this, objects.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _focusedmarker = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper");
public static RemoteObject _marker1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper");
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _tilesource = RemoteObject.createImmutable("");
public static RemoteObject _zoomlevel = RemoteObject.createImmutable(0);
public static RemoteObject _markers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapfirsttime = RemoteObject.createImmutable(false);
public static RemoteObject _mypositionlat = RemoteObject.createImmutable("");
public static RemoteObject _mypositionlon = RemoteObject.createImmutable("");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _startingrow = RemoteObject.createImmutable(0);
public static RemoteObject _readrows = RemoteObject.createImmutable(0);
public static RemoteObject _nextstartingrow = RemoteObject.createImmutable(0);
public static RemoteObject _icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
public static RemoteObject _currentfilter = RemoteObject.createImmutable("");
public static RemoteObject _tilesourcespinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _buttonuserunavailable = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _thisdialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
public static RemoteObject _listsbasepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbottomline = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbottompanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbuttonclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listslabelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _liststabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabStripViewPager");
public static RemoteObject _liststopbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listobjects = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _listbutmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listitemlocation = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemfullname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listsbuttonfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldatetime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelappinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcopyright = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemreference = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemcontact = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listpedidosmap = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _listpedidosbuttonmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _showlistpedidosmap = RemoteObject.createImmutable(false);
public static RemoteObject _bloco30 = RemoteObject.createImmutable(0);
public static RemoteObject _mapbaselist = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mapbasepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mapzoomdown = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mapzoomup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listitemtype = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemscounter = RemoteObject.createImmutable(0);
public static RemoteObject _butsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _listitemtodayrequests = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _isfiltered = RemoteObject.createImmutable(false);
public static RemoteObject _idialogreqtypeobject = RemoteObject.createImmutable(0);
public static RemoteObject _idialogreqzone = RemoteObject.createImmutable(0);
public static RemoteObject _idialogreqstatus = RemoteObject.createImmutable(0);
public static RemoteObject _idialogreqregion = RemoteObject.createImmutable(0);
public static RemoteObject _idialogreqlocal = RemoteObject.createImmutable(0);
public static RemoteObject _idialogreqwithrequests = RemoteObject.createImmutable(0);
public static RemoteObject _sdialogreqname = RemoteObject.createImmutable("");
public static RemoteObject _sdialogreqaddress = RemoteObject.createImmutable("");
public static RemoteObject _searchfilter = RemoteObject.createImmutable("");
public static RemoteObject _regionslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _typeobjectslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _localslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _objrequests = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _objrequestsnottoday = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapuserposition = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listsbuttontype = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listsbuttonzone = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listbutselect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _objecttypepopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _objectzonepopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _labeltypeobjectfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _colortabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _currentlineitem = RemoteObject.createImmutable(0);
public static RemoteObject _totallineitems = RemoteObject.createImmutable(0);
public static RemoteObject _mainlabeloptlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mainlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _listtasks = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _buttonactionpause = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonappnetwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainactiveuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _gmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
public static RemoteObject _mapdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper");
public static RemoteObject _mapmarker = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper");
public static RemoteObject _listitemnumber = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _objectslistviewpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _firsttimebool = RemoteObject.createImmutable(false);
public static RemoteObject _claprerequesttypespinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _claprerequestspinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _grouplist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _reqlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _districtslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _countylist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listrequests = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _noprerequestpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _objectsrequeststitlelabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemrequestdesc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemrequestobject = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listbutprerequestdownload = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listbutprerequestview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listbutpreselect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _norequestpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listbutrequest = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _selobject = RemoteObject.createImmutable("");
public static RemoteObject _selchecklist = RemoteObject.createImmutable("");
public static RemoteObject _selectedobjectscount = RemoteObject.createImmutable(0);
public static RemoteObject _frombulkoption = RemoteObject.createImmutable(0);
public static RemoteObject _listitemdesc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemstate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _butbulkcreaterequest = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butbulkprerequest = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _clarequestlist = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _clarequesttypespinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _butcreaterequestcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcreaterequest = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _norequestpaneltitlelabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _claprerequestpickerlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _claprerequesteditsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _claprerequestdistrictepickerlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _claprerequestcountypickerlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _listbutpreselectall = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelprerequestnumber = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelprerequesttype = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelprerequestentity = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelprerequestobject = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelprerequestdatetime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelprerequestdetails = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listoffields = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _labelprerequestfieldvalue = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelprerequestfieldname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _qry_typerequest = RemoteObject.createImmutable("");
public static RemoteObject _qry_district = RemoteObject.createImmutable("");
public static RemoteObject _qry_county = RemoteObject.createImmutable("");
public static RemoteObject _qry_datein = RemoteObject.createImmutable("");
public static RemoteObject _qry_dateout = RemoteObject.createImmutable("");
public static RemoteObject _qry_filter = RemoteObject.createImmutable("");
public static RemoteObject _cumulativetyperequest = RemoteObject.createImmutable(0);
public static RemoteObject _cumulativedistrict = RemoteObject.createImmutable(0);
public static RemoteObject _cumulativecounty = RemoteObject.createImmutable(0);
public static RemoteObject _cumulativedatein = RemoteObject.createImmutable("");
public static RemoteObject _cumulativedateout = RemoteObject.createImmutable("");
public static RemoteObject _cumulativefilter = RemoteObject.createImmutable("");
public static RemoteObject _dialogreqstartdatelabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dialogreqenddatelabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _objlabelobjectos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _objlabelmorada = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _objlabelstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _objlabellocal = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelobjrequesttipointer = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelobjrequestdatainicio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelobjrequestdatafim = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelobjrequestconcelho = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelobjrequestdistrito = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelobjrequestplivre = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelobjrequesttipointer2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelobjrequesttipogrupointer = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemrequestheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemactionheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dummymenuplacehlder = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _clabuttonrequestfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _clabuttonrequestdownload = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lstprereqs2download = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listitemparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
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
		return new Object[] {"Activity",objects.mostCurrent._activity,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"Bloco30",objects._bloco30,"butBulkCreateRequest",objects.mostCurrent._butbulkcreaterequest,"butBulkPreRequest",objects.mostCurrent._butbulkprerequest,"butCreateRequest",objects.mostCurrent._butcreaterequest,"butCreateRequestCancel",objects.mostCurrent._butcreaterequestcancel,"butSearch",objects.mostCurrent._butsearch,"ButtonActionPause",objects.mostCurrent._buttonactionpause,"ButtonAppNetwork",objects.mostCurrent._buttonappnetwork,"ButtonUserUnavailable",objects.mostCurrent._buttonuserunavailable,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"CLAButtonRequestDownload",objects.mostCurrent._clabuttonrequestdownload,"CLAButtonRequestFilter",objects.mostCurrent._clabuttonrequestfilter,"CLAPreRequestCountyPickerLabel",objects.mostCurrent._claprerequestcountypickerlabel,"CLAPreRequestDistrictePickerLabel",objects.mostCurrent._claprerequestdistrictepickerlabel,"CLAPreRequestEditSearch",objects.mostCurrent._claprerequesteditsearch,"CLAPreRequestPickerLabel",objects.mostCurrent._claprerequestpickerlabel,"CLAPreRequestSpinner",objects.mostCurrent._claprerequestspinner,"CLAPreRequestTypeSpinner",objects.mostCurrent._claprerequesttypespinner,"CLARequestList",objects.mostCurrent._clarequestlist,"CLARequestTypeSpinner",objects.mostCurrent._clarequesttypespinner,"ColorTabPanel",objects.mostCurrent._colortabpanel,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CountyList",objects.mostCurrent._countylist,"CumulativeCounty",objects._cumulativecounty,"CumulativeDateIn",objects.mostCurrent._cumulativedatein,"CumulativeDateOut",objects.mostCurrent._cumulativedateout,"CumulativeDistrict",objects._cumulativedistrict,"CumulativeFilter",objects.mostCurrent._cumulativefilter,"CumulativeTypeRequest",objects._cumulativetyperequest,"CurrentFilter",objects.mostCurrent._currentfilter,"CurrentLineItem",objects._currentlineitem,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",objects.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Device",objects._device,"DialogReqEndDateLabel",objects.mostCurrent._dialogreqenddatelabel,"DialogReqStartDateLabel",objects.mostCurrent._dialogreqstartdatelabel,"DistrictsList",objects.mostCurrent._districtslist,"DummyMenuPlaceHlder",objects.mostCurrent._dummymenuplacehlder,"EditSearch",objects.mostCurrent._editsearch,"Encoding",objects.mostCurrent._encoding,"ESC_POS",objects.mostCurrent._esc_pos,"FirstTimeBool",objects._firsttimebool,"FocusedMarker",objects._focusedmarker,"FromBulkOption",objects._frombulkoption,"gmap",objects.mostCurrent._gmap,"GroupList",objects.mostCurrent._grouplist,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"Icon",objects.mostCurrent._icon,"iDialogReqLocal",objects._idialogreqlocal,"iDialogReqRegion",objects._idialogreqregion,"iDialogReqStatus",objects._idialogreqstatus,"iDialogReqTypeObject",objects._idialogreqtypeobject,"iDialogReqWithRequests",objects._idialogreqwithrequests,"iDialogReqZone",objects._idialogreqzone,"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"IsFiltered",objects._isfiltered,"ItemsCounter",objects._itemscounter,"LabelAppInfo",objects.mostCurrent._labelappinfo,"LabelCopyright",objects.mostCurrent._labelcopyright,"LabelDateTime",objects.mostCurrent._labeldatetime,"LabelObjRequestConcelho",objects.mostCurrent._labelobjrequestconcelho,"LabelObjRequestDataFim",objects.mostCurrent._labelobjrequestdatafim,"LabelObjRequestDataInicio",objects.mostCurrent._labelobjrequestdatainicio,"LabelObjRequestDistrito",objects.mostCurrent._labelobjrequestdistrito,"LabelObjRequestPLivre",objects.mostCurrent._labelobjrequestplivre,"LabelObjRequestTipoGrupoInter",objects.mostCurrent._labelobjrequesttipogrupointer,"LabelObjRequestTipoInter",objects.mostCurrent._labelobjrequesttipointer,"LabelObjRequestTipoInter2",objects.mostCurrent._labelobjrequesttipointer2,"LabelPreRequestDateTime",objects.mostCurrent._labelprerequestdatetime,"LabelPreRequestDetails",objects.mostCurrent._labelprerequestdetails,"LabelPreRequestEntity",objects.mostCurrent._labelprerequestentity,"LabelPreRequestFieldName",objects.mostCurrent._labelprerequestfieldname,"LabelPreRequestFieldValue",objects.mostCurrent._labelprerequestfieldvalue,"LabelPreRequestNumber",objects.mostCurrent._labelprerequestnumber,"LabelPreRequestObject",objects.mostCurrent._labelprerequestobject,"LabelPreRequestType",objects.mostCurrent._labelprerequesttype,"labelTypeObjectFilter",objects.mostCurrent._labeltypeobjectfilter,"LabelVersion",objects.mostCurrent._labelversion,"listButMap",objects.mostCurrent._listbutmap,"listButPreRequestDownload",objects.mostCurrent._listbutprerequestdownload,"listButPreRequestView",objects.mostCurrent._listbutprerequestview,"listButPreSelect",objects.mostCurrent._listbutpreselect,"listButPreSelectAll",objects.mostCurrent._listbutpreselectall,"listButRequest",objects.mostCurrent._listbutrequest,"listButSelect",objects.mostCurrent._listbutselect,"ListItemActionHeader",objects.mostCurrent._listitemactionheader,"ListItemContact",objects.mostCurrent._listitemcontact,"ListItemDesc",objects.mostCurrent._listitemdesc,"ListItemFullName",objects.mostCurrent._listitemfullname,"ListItemLocation",objects.mostCurrent._listitemlocation,"ListItemNumber",objects.mostCurrent._listitemnumber,"ListItemParent",objects.mostCurrent._listitemparent,"ListItemReference",objects.mostCurrent._listitemreference,"ListItemRequestDesc",objects.mostCurrent._listitemrequestdesc,"ListItemRequestHeader",objects.mostCurrent._listitemrequestheader,"ListItemRequestObject",objects.mostCurrent._listitemrequestobject,"ListItemState",objects.mostCurrent._listitemstate,"ListItemStatus",objects.mostCurrent._listitemstatus,"ListItemTodayRequests",objects.mostCurrent._listitemtodayrequests,"ListItemType",objects.mostCurrent._listitemtype,"listObjects",objects.mostCurrent._listobjects,"listOfFields",objects.mostCurrent._listoffields,"listPedidosButtonMap",objects.mostCurrent._listpedidosbuttonmap,"listPedidosMap",objects.mostCurrent._listpedidosmap,"listRequests",objects.mostCurrent._listrequests,"listsBasePanel",objects.mostCurrent._listsbasepanel,"listsBottomLine",objects.mostCurrent._listsbottomline,"listsBottomPanel",objects.mostCurrent._listsbottompanel,"listsButtonClose",objects.mostCurrent._listsbuttonclose,"listsButtonFilter",objects.mostCurrent._listsbuttonfilter,"listsButtonType",objects.mostCurrent._listsbuttontype,"listsButtonZone",objects.mostCurrent._listsbuttonzone,"listsLabelInfo",objects.mostCurrent._listslabelinfo,"listsTabPanel",objects.mostCurrent._liststabpanel,"listsTopBar",objects.mostCurrent._liststopbar,"listTasks",objects.mostCurrent._listtasks,"LocalsList",objects.mostCurrent._localslist,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"LstPreReqs2Download",objects.mostCurrent._lstprereqs2download,"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"mainActiveUser",objects.mostCurrent._mainactiveuser,"mainLabelOptLists",objects.mostCurrent._mainlabeloptlists,"mainLogo",objects.mostCurrent._mainlogo,"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"mapBaseList",objects.mostCurrent._mapbaselist,"mapBasePanel",objects.mostCurrent._mapbasepanel,"mapData",objects.mostCurrent._mapdata,"MapFirstTime",objects._mapfirsttime,"mapMarker",objects.mostCurrent._mapmarker,"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"mapUserPosition",objects.mostCurrent._mapuserposition,"mapZoomDown",objects.mostCurrent._mapzoomdown,"mapZoomUp",objects.mostCurrent._mapzoomup,"Marker1",objects._marker1,"Markers",objects._markers,"MyPositionLat",objects._mypositionlat,"MyPositionLon",objects._mypositionlon,"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"NextStartingRow",objects._nextstartingrow,"noPreRequestPanel",objects.mostCurrent._noprerequestpanel,"noRequestPanel",objects.mostCurrent._norequestpanel,"NoRequestPanelTitleLabel",objects.mostCurrent._norequestpaneltitlelabel,"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"objectsListViewPanel",objects.mostCurrent._objectslistviewpanel,"ObjectsRequestsTitleLabel",objects.mostCurrent._objectsrequeststitlelabel,"ObjectTypePopMenu",objects.mostCurrent._objecttypepopmenu,"ObjectZonePopMenu",objects.mostCurrent._objectzonepopmenu,"ObjLabelLocal",objects.mostCurrent._objlabellocal,"ObjLabelMorada",objects.mostCurrent._objlabelmorada,"ObjLabelObjectos",objects.mostCurrent._objlabelobjectos,"ObjLabelStatus",objects.mostCurrent._objlabelstatus,"ObjRequests",objects.mostCurrent._objrequests,"ObjRequestsNotToday",objects.mostCurrent._objrequestsnottoday,"Qry_County",objects.mostCurrent._qry_county,"Qry_DateIn",objects.mostCurrent._qry_datein,"Qry_DateOut",objects.mostCurrent._qry_dateout,"Qry_District",objects.mostCurrent._qry_district,"Qry_Filter",objects.mostCurrent._qry_filter,"Qry_TypeRequest",objects.mostCurrent._qry_typerequest,"ReadRows",objects._readrows,"RegionsList",objects.mostCurrent._regionslist,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"ReqList",objects.mostCurrent._reqlist,"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"sDialogReqAddress",objects.mostCurrent._sdialogreqaddress,"sDialogReqName",objects.mostCurrent._sdialogreqname,"SearchFilter",objects.mostCurrent._searchfilter,"SelCheckList",objects.mostCurrent._selchecklist,"SelectedObjectsCount",objects._selectedobjectscount,"SelObject",objects.mostCurrent._selobject,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"ShowListPedidosMap",objects._showlistpedidosmap,"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"StartingRow",objects._startingrow,"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"ThisDialog",objects.mostCurrent._thisdialog,"TileSource",objects._tilesource,"TileSourceSpinner",objects.mostCurrent._tilesourcespinner,"TotalLineItems",objects._totallineitems,"TypeObjectsList",objects.mostCurrent._typeobjectslist,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"xui",objects.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class),"ZoomLevel",objects._zoomlevel};
}
}