
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

public class user implements IRemote{
	public static user mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public user() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("user"), "xevolution.vrcg.devdemov2400.user");
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
		pcBA = new PCBA(this, user.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mypositionlat = RemoteObject.createImmutable("");
public static RemoteObject _mypositionlon = RemoteObject.createImmutable("");
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _gobackmoreactions = RemoteObject.createImmutable(false);
public static RemoteObject _listsbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _listsbasepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbottomline = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbottompanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listsbuttonadd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listsbuttonclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listslabelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _liststabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabStripViewPager");
public static RemoteObject _liststopbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _itemscounter = RemoteObject.createImmutable(0);
public static RemoteObject _usercategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _usercertdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _usercertificate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _username = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _usernotes = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _userphoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _userspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _usertagcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _uservehicle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _uservehicleplate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _usershowcertificate = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonlistnotconfirm = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonlistconfirm = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butequipsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listdocuments = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _listequipments = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _butwarehouses = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mpopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _mdocpopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _meqippopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _butdocfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butequipfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _userdocuments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _userequipments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _butcarrunning = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelcopyright = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldatetime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _currentequipitem = RemoteObject.createImmutable(0);
public static RemoteObject _totallineitems = RemoteObject.createImmutable(0);
public static RemoteObject _currentdocitem = RemoteObject.createImmutable(0);
public static RemoteObject _currentgroupitem = RemoteObject.createImmutable(0);
public static RemoteObject _pnlgroupcurrenindex = RemoteObject.createImmutable(0);
public static RemoteObject _usercompany = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _userlistview = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.expandedlistview");
public static RemoteObject _lblgrouptitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _butgroupcollpseexpand = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pnlgrouptitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlgroupexpanded = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _butgrplinechange = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblgrouplinevalidate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblgrouplinedesc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblgrouplinemodel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblgrouplineserial = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblgrouplineplate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _butuserunavailable = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonuserunavailable = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editequipsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _butgrplineremove = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _confirmproducts = RemoteObject.createImmutable(false);
public static RemoteObject _productstoconfirm = RemoteObject.createImmutable(0);
public static RemoteObject _firstdataload = RemoteObject.createImmutable(false);
public static RemoteObject _butuserconfirmdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _colortabpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _secondpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _butgroupceadd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _mainlabeloptlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemdocview = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemdates = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listiteminformation = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemrefresh = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemcategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemdocbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemnotes = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemreference = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemtitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemqtd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemminqtd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listitemprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _view_itemuserauto = RemoteObject.createImmutable("");
public static RemoteObject _view_itemuserautoline = RemoteObject.createImmutable("");
public static RemoteObject _view_itemuserequipment = RemoteObject.createImmutable("");
public static RemoteObject _view_listcollapsegroup_userequip = RemoteObject.createImmutable("");
public static RemoteObject _view_listcollapsegroup_userregister = RemoteObject.createImmutable("");
public static RemoteObject _view_itemuserregister = RemoteObject.createImmutable("");
public static RemoteObject _dialoglogin = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
public static RemoteObject _usercode = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttonactionpause = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butgroupuregisteradd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblgrouplinecode = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblgrouplinename = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlgroupexpanded4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _buttonappnetwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainactiveuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _butgroupcarchange = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _currentcarid = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._autoidentification");
public static RemoteObject _currentcarobject = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._carobject");
public static RemoteObject _showimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _butuserpauseaction = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _userdocumentsviewlayoutpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _userequipmentsviewlayoutpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _menupanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _menupaneluserbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _menupaneldocsbuttom = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _menupanelconsumablesbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _menupaneloperatorsbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _isfirsttime = RemoteObject.createImmutable(false);
public static RemoteObject _userlabelfoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _userlabelnome = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _userlabelorganizacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _userlabelcategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _userlabelcodigouser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _userwarehouse = RemoteObject.createImmutable("");
public static RemoteObject _buttonlistaddaccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butuserestadoaction = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butuserstopwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butuserstartwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblestadouserjornada = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edittextjustificacaormj = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
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
public static xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public static xevolution.vrcg.devdemov2400.types _types = null;
public static xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",user.mostCurrent._activity,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"butCarRunning",user.mostCurrent._butcarrunning,"butDocFilter",user.mostCurrent._butdocfilter,"butEquipFilter",user.mostCurrent._butequipfilter,"butEquipSearch",user.mostCurrent._butequipsearch,"butGroupCarChange",user.mostCurrent._butgroupcarchange,"butGroupCEAdd",user.mostCurrent._butgroupceadd,"butGroupCollpseExpand",user.mostCurrent._butgroupcollpseexpand,"butGroupURegisterAdd",user.mostCurrent._butgroupuregisteradd,"butGrpLineChange",user.mostCurrent._butgrplinechange,"butGrpLineRemove",user.mostCurrent._butgrplineremove,"ButtonActionPause",user.mostCurrent._buttonactionpause,"ButtonAppNetwork",user.mostCurrent._buttonappnetwork,"ButtonListAddAccion",user.mostCurrent._buttonlistaddaccion,"ButtonListConfirm",user.mostCurrent._buttonlistconfirm,"ButtonListNotConfirm",user.mostCurrent._buttonlistnotconfirm,"ButtonUserUnavailable",user.mostCurrent._buttonuserunavailable,"butUserConfirmData",user.mostCurrent._butuserconfirmdata,"butUserEstadoAction",user.mostCurrent._butuserestadoaction,"butUserPauseAction",user.mostCurrent._butuserpauseaction,"butUserStartWork",user.mostCurrent._butuserstartwork,"butUserStopWork",user.mostCurrent._butuserstopwork,"butUserUnavailable",user.mostCurrent._butuserunavailable,"butWareHouses",user.mostCurrent._butwarehouses,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"ColorTabPanel",user.mostCurrent._colortabpanel,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"ConfirmProducts",user._confirmproducts,"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CurrentCarID",user.mostCurrent._currentcarid,"CurrentCarObject",user.mostCurrent._currentcarobject,"CurrentDocItem",user._currentdocitem,"CurrentEquipItem",user._currentequipitem,"CurrentGroupItem",user._currentgroupitem,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",user.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Device",user._device,"DialogLogin",user.mostCurrent._dialoglogin,"EditEquipSearch",user.mostCurrent._editequipsearch,"EditTextJustificacaoRMJ",user.mostCurrent._edittextjustificacaormj,"Encoding",user.mostCurrent._encoding,"ESC_POS",user.mostCurrent._esc_pos,"FirstDataLoad",user._firstdataload,"GoBackMOREActions",user._gobackmoreactions,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"Icon",user.mostCurrent._icon,"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"IsFirstTime",user._isfirsttime,"ItemsCounter",user._itemscounter,"LabelCopyright",user.mostCurrent._labelcopyright,"LabelDateTime",user.mostCurrent._labeldatetime,"LabelVersion",user.mostCurrent._labelversion,"lblEstadoUserJornada",user.mostCurrent._lblestadouserjornada,"lblGroupLineCode",user.mostCurrent._lblgrouplinecode,"lblGroupLineDesc",user.mostCurrent._lblgrouplinedesc,"lblGroupLineModel",user.mostCurrent._lblgrouplinemodel,"lblGroupLineName",user.mostCurrent._lblgrouplinename,"lblGroupLinePlate",user.mostCurrent._lblgrouplineplate,"lblGroupLineSerial",user.mostCurrent._lblgrouplineserial,"lblGroupLineValidate",user.mostCurrent._lblgrouplinevalidate,"lblGroupTitle",user.mostCurrent._lblgrouptitle,"listDocuments",user.mostCurrent._listdocuments,"listEquipments",user.mostCurrent._listequipments,"ListItemCategory",user.mostCurrent._listitemcategory,"ListItemDates",user.mostCurrent._listitemdates,"ListItemDocButton",user.mostCurrent._listitemdocbutton,"ListItemDocView",user.mostCurrent._listitemdocview,"ListItemInformation",user.mostCurrent._listiteminformation,"ListItemMinQtd",user.mostCurrent._listitemminqtd,"ListItemNotes",user.mostCurrent._listitemnotes,"ListItemPrice",user.mostCurrent._listitemprice,"ListItemQtd",user.mostCurrent._listitemqtd,"ListItemReference",user.mostCurrent._listitemreference,"ListItemRefresh",user.mostCurrent._listitemrefresh,"ListItemTitle",user.mostCurrent._listitemtitle,"listsBackground",user.mostCurrent._listsbackground,"listsBasePanel",user.mostCurrent._listsbasepanel,"listsBottomLine",user.mostCurrent._listsbottomline,"listsBottomPanel",user.mostCurrent._listsbottompanel,"listsButtonAdd",user.mostCurrent._listsbuttonadd,"listsButtonClose",user.mostCurrent._listsbuttonclose,"listsLabelInfo",user.mostCurrent._listslabelinfo,"listsTabPanel",user.mostCurrent._liststabpanel,"listsTopBar",user.mostCurrent._liststopbar,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"mainActiveUser",user.mostCurrent._mainactiveuser,"mainLabelOptLists",user.mostCurrent._mainlabeloptlists,"mainLogo",user.mostCurrent._mainlogo,"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"mDocPopMenu",user.mostCurrent._mdocpopmenu,"MenuPanel",user.mostCurrent._menupanel,"MenuPanelConsumablesButton",user.mostCurrent._menupanelconsumablesbutton,"MenuPanelDocsButtom",user.mostCurrent._menupaneldocsbuttom,"MenuPanelOperatorsButton",user.mostCurrent._menupaneloperatorsbutton,"MenuPanelUserButton",user.mostCurrent._menupaneluserbutton,"mEqipPopMenu",user.mostCurrent._meqippopmenu,"mPopMenu",user.mostCurrent._mpopmenu,"MyPositionLat",user._mypositionlat,"MyPositionLon",user._mypositionlon,"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"Panel1",user.mostCurrent._panel1,"pnlGroupCurrenIndex",user._pnlgroupcurrenindex,"pnlGroupExpanded",user.mostCurrent._pnlgroupexpanded,"pnlGroupExpanded4",user.mostCurrent._pnlgroupexpanded4,"pnlGroupTitle",user.mostCurrent._pnlgrouptitle,"ProductsToConfirm",user._productstoconfirm,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"SecondPanel",user.mostCurrent._secondpanel,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"ShowImageView",user.mostCurrent._showimageview,"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"TotalLineItems",user._totallineitems,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"userCategory",user.mostCurrent._usercategory,"userCertDate",user.mostCurrent._usercertdate,"userCertificate",user.mostCurrent._usercertificate,"userCode",user.mostCurrent._usercode,"userCompany",user.mostCurrent._usercompany,"UserDocuments",user.mostCurrent._userdocuments,"UserDocumentsViewLayoutPanel",user.mostCurrent._userdocumentsviewlayoutpanel,"UserEquipments",user.mostCurrent._userequipments,"UserEquipmentsViewLayoutPanel",user.mostCurrent._userequipmentsviewlayoutpanel,"userLabelCategoria",user.mostCurrent._userlabelcategoria,"userLabelCodigoUser",user.mostCurrent._userlabelcodigouser,"userLabelFoto",user.mostCurrent._userlabelfoto,"userLabelNome",user.mostCurrent._userlabelnome,"userLabelOrganizacao",user.mostCurrent._userlabelorganizacao,"UserListView",user.mostCurrent._userlistview,"userName",user.mostCurrent._username,"userNotes",user.mostCurrent._usernotes,"userPhoto",user.mostCurrent._userphoto,"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"userShowCertificate",user.mostCurrent._usershowcertificate,"usersPanel",user.mostCurrent._userspanel,"userTagcode",user.mostCurrent._usertagcode,"userVehicle",user.mostCurrent._uservehicle,"userVehiclePlate",user.mostCurrent._uservehicleplate,"USERWAREHOUSE",user.mostCurrent._userwarehouse,"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"VIEW_ItemUserAuto",user.mostCurrent._view_itemuserauto,"VIEW_ItemUserAutoLine",user.mostCurrent._view_itemuserautoline,"VIEW_ItemUserEquipment",user.mostCurrent._view_itemuserequipment,"VIEW_ItemUserRegister",user.mostCurrent._view_itemuserregister,"VIEW_ListCollapseGroup_UserEquip",user.mostCurrent._view_listcollapsegroup_userequip,"VIEW_ListCollapseGroup_UserRegister",user.mostCurrent._view_listcollapsegroup_userregister,"xui",user.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}