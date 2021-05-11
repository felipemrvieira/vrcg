
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

public class dataupdate implements IRemote{
	public static dataupdate mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public dataupdate() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("dataupdate"), "xevolution.vrcg.devdemov2400.dataupdate");
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
		pcBA = new PCBA(this, dataupdate.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _lbldataupdatetitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelcopydata = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelcopydata = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldataupdatecopy = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldataupdateload = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldataupdatedownload = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _progressbar1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _lbldataupdateprocess = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _datalayout = RemoteObject.createImmutable("");
public static RemoteObject _buttonwelcomenext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _sqlfilestotal = RemoteObject.createImmutable(0);
public static RemoteObject _ftpfilelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ftpfilelist2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _requestfilename = RemoteObject.createImmutable("");
public static RemoteObject _requestfilenameheaders = RemoteObject.createImmutable("");
public static RemoteObject _requestfilenameonday = RemoteObject.createImmutable("");
public static RemoteObject _tagcodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _tagcodesstring = RemoteObject.createImmutable("");
public static RemoteObject _tagcodestasksstring = RemoteObject.createImmutable("");
public static RemoteObject _tagcodestprequestsstring = RemoteObject.createImmutable("");
public static RemoteObject _tagcodesobjectsstring = RemoteObject.createImmutable("");
public static RemoteObject _tagcodeslocationsstring = RemoteObject.createImmutable("");
public static RemoteObject _tagcodescontactsstring = RemoteObject.createImmutable("");
public static RemoteObject _tagcodeswarehousesstring = RemoteObject.createImmutable("");
public static RemoteObject _tagcodesarticlesstring = RemoteObject.createImmutable("");
public static RemoteObject _flagfirstprocessstep = RemoteObject.createImmutable(0);
public static RemoteObject _labelupdateprocess = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imagedownload = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageupload = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _labelloaddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldownloaddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _currentcounter = RemoteObject.createImmutable(0);
public static RemoteObject _isloginupdate = RemoteObject.createImmutable(false);
public static RemoteObject _firstinstallupdatedate = RemoteObject.createImmutable("");
public static RemoteObject _dataupdateprogressbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _dataupdatelabeltarefa = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dataupdateprogressbar2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _listaintervencoesoffline = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _chkreqoffline = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _txtreqoffline = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
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
		return new Object[] {"Activity",dataupdate.mostCurrent._activity,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"ButtonWelcomeNext",dataupdate.mostCurrent._buttonwelcomenext,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"ChkReqOffline",dataupdate.mostCurrent._chkreqoffline,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CurrentCounter",dataupdate._currentcounter,"dataLayout",dataupdate.mostCurrent._datalayout,"DataUpdateLabelTarefa",dataupdate.mostCurrent._dataupdatelabeltarefa,"DataUpdateProgressBar",dataupdate.mostCurrent._dataupdateprogressbar,"DataUpdateProgressBar2",dataupdate.mostCurrent._dataupdateprogressbar2,"DateUtils",dataupdate.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Device",dataupdate._device,"Encoding",dataupdate.mostCurrent._encoding,"ESC_POS",dataupdate.mostCurrent._esc_pos,"FirstInstallUpdateDate",dataupdate.mostCurrent._firstinstallupdatedate,"FlagFirstProcessStep",dataupdate._flagfirstprocessstep,"FTPFileList",dataupdate.mostCurrent._ftpfilelist,"FTPFileList2",dataupdate.mostCurrent._ftpfilelist2,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageDownload",dataupdate.mostCurrent._imagedownload,"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"ImageUpload",dataupdate.mostCurrent._imageupload,"IsLoginUpdate",dataupdate._isloginupdate,"LabelCopyData",dataupdate.mostCurrent._labelcopydata,"LabelDownloadData",dataupdate.mostCurrent._labeldownloaddata,"LabelLoadData",dataupdate.mostCurrent._labelloaddata,"LabelUpdateProcess",dataupdate.mostCurrent._labelupdateprocess,"lbldataupdatecopy",dataupdate.mostCurrent._lbldataupdatecopy,"lbldataupdatedownload",dataupdate.mostCurrent._lbldataupdatedownload,"lbldataupdateload",dataupdate.mostCurrent._lbldataupdateload,"lbldataupdateprocess",dataupdate.mostCurrent._lbldataupdateprocess,"lbldataupdatetitle",dataupdate.mostCurrent._lbldataupdatetitle,"ListaIntervencoesOffline",dataupdate.mostCurrent._listaintervencoesoffline,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"PanelCopyData",dataupdate.mostCurrent._panelcopydata,"ProgressBar1",dataupdate.mostCurrent._progressbar1,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"RequestFileName",dataupdate.mostCurrent._requestfilename,"RequestFileNameHeaders",dataupdate.mostCurrent._requestfilenameheaders,"RequestFileNameOnDay",dataupdate.mostCurrent._requestfilenameonday,"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"SqlFilesTotal",dataupdate._sqlfilestotal,"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TagCodes",dataupdate.mostCurrent._tagcodes,"TagCodesArticlesString",dataupdate.mostCurrent._tagcodesarticlesstring,"TagCodesContactsString",dataupdate.mostCurrent._tagcodescontactsstring,"TagCodesLocationsString",dataupdate.mostCurrent._tagcodeslocationsstring,"TagCodesObjectsString",dataupdate.mostCurrent._tagcodesobjectsstring,"TagCodesString",dataupdate.mostCurrent._tagcodesstring,"TagCodesTasksString",dataupdate.mostCurrent._tagcodestasksstring,"TagCodesTPRequestsString",dataupdate.mostCurrent._tagcodestprequestsstring,"TagCodesWarehousesString",dataupdate.mostCurrent._tagcodeswarehousesstring,"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"txtReqOffline",dataupdate.mostCurrent._txtreqoffline,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}