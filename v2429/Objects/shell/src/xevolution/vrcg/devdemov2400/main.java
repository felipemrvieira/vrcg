
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "xevolution.vrcg.devdemov2400.main");
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
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _timestart = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _appstarted = RemoteObject.createImmutable(false);
public static RemoteObject _mainshowdialogresult = RemoteObject.createImmutable(0);
public static RemoteObject _started = RemoteObject.createImmutable(false);
public static RemoteObject _waittoconfirm = RemoteObject.createImmutable(false);
public static RemoteObject _islogindone = RemoteObject.createImmutable(false);
public static RemoteObject _ismainscreen = RemoteObject.createImmutable(false);
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _appbuildversion = RemoteObject.createImmutable("");
public static RemoteObject _appbuildversiondate = RemoteObject.createImmutable("");
public static RemoteObject _versiontagcode = RemoteObject.createImmutable("");
public static RemoteObject _keepal = RemoteObject.createImmutable(false);
public static RemoteObject _db_size = RemoteObject.createImmutable(0L);
public static RemoteObject _currentbuild = RemoteObject.createImmutable("");
public static RemoteObject _devicebrand = RemoteObject.createImmutable("");
public static RemoteObject _devicemodel = RemoteObject.createImmutable("");
public static RemoteObject _devicemacaddress = RemoteObject.createImmutable("");
public static RemoteObject _deviceauthorization = RemoteObject.createImmutable("");
public static RemoteObject _deviceinstance = RemoteObject.createImmutable("");
public static RemoteObject _mainpanelsplash = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainpansplashimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _mainpansplashlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _mainsplashprogress = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _gc = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.force_gc");
public static RemoteObject _mainpopmenu = RemoteObject.declareNull("com.jakes.menuonviews.menuonanyview");
public static RemoteObject _lgo_passwordmode = RemoteObject.createImmutable(false);
public static RemoteObject _neterrortrycount = RemoteObject.createImmutable(0);
public static RemoteObject _mainlayout = RemoteObject.createImmutable("");
public static RemoteObject _buttonauthback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonauthnext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonloginenter = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonloginexit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonloginreset = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonwelcomenext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editauthorization = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editinstance = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _mainsplashimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _panel_authorization = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel_config = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel_login = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel_login_validation = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel_verification = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel_welcome = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _selectlanguage = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _selectorientation = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _labelversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttonappnetwork = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainsplashimageeffect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _mainfirstinstall = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _isfirstinstall = RemoteObject.createImmutable(false);
public static RemoteObject _mainpansplashcustomlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _mainlayoutpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _loginpaneliconimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _loginvalidationpaneliconimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _varificationpaneliconimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _authorizationpaneliconimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _welcomepaneliconimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _companyimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _apptitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _timestartcounter = RemoteObject.createImmutable(0);
public static RemoteObject _phone = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _butsaveqrcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcancelqrcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _qrcodereader = RemoteObject.declareNull("qrcodereaderviewwrapper.qrCodeReaderViewWrapper");
public static RemoteObject _qrcodepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _qrcodekeyreceived = RemoteObject.createImmutable("");
public static RemoteObject _getqrcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _liteupdatetagcodes = RemoteObject.createImmutable("");
public static RemoteObject _loginupdatefilename = RemoteObject.createImmutable("");
public static RemoteObject _labelcontroloacesso = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelnomeutilizador = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelpasswordutilizador = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeltitulocredenciais = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelwelcomewarning = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelwelcomeevolutioncheck = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelhelpautorizacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelautorizacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcodigoinstancia = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcodigoautorizacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelvalidacaologin = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelvalidacaoacesso = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcheckvalidacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelverificacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _paneldownloadinicial = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labeldownloadinicialtitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _progressoinicial = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _progressoinicial2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _labeldownloadinicialfases = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeltarefa = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _newpass1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _newpass2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _logobackevc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _currentorientation = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static RemoteObject _encoding = RemoteObject.declareNull("b4a.example.encoding");
public static RemoteObject _esc_pos = RemoteObject.declareNull("b4a.example.esc_pos");
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
public static xevolution.vrcg.devdemov2400.user _user = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"AppBuildVersion",main._appbuildversion,"AppBuildVersionDate",main._appbuildversiondate,"AppStarted",main._appstarted,"AppTitle",main.mostCurrent._apptitle,"AuthorizationPanelIconImageView",main.mostCurrent._authorizationpaneliconimageview,"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"butCancelQRCode",main.mostCurrent._butcancelqrcode,"butSaveQRCode",main.mostCurrent._butsaveqrcode,"ButtonAppNetwork",main.mostCurrent._buttonappnetwork,"ButtonAuthBack",main.mostCurrent._buttonauthback,"ButtonAuthNext",main.mostCurrent._buttonauthnext,"ButtonLoginEnter",main.mostCurrent._buttonloginenter,"ButtonLoginExit",main.mostCurrent._buttonloginexit,"ButtonLoginReset",main.mostCurrent._buttonloginreset,"ButtonWelcomeNext",main.mostCurrent._buttonwelcomenext,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"CompanyImageView",main.mostCurrent._companyimageview,"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CurrentBuild",main._currentbuild,"CurrentOrientation",main._currentorientation,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",main.mostCurrent._dateutils,"DB_Size",main._db_size,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Device",main._device,"DeviceAuthorization",main._deviceauthorization,"DeviceBrand",main._devicebrand,"DeviceInstance",main._deviceinstance,"DeviceMacAddress",main._devicemacaddress,"DeviceModel",main._devicemodel,"EditAuthorization",main.mostCurrent._editauthorization,"EditInstance",main.mostCurrent._editinstance,"EditPassword",main.mostCurrent._editpassword,"EditUserName",main.mostCurrent._editusername,"Encoding",main.mostCurrent._encoding,"ESC_POS",main.mostCurrent._esc_pos,"GC",main.mostCurrent._gc,"getQRCode",main.mostCurrent._getqrcode,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"isFirstInstall",main._isfirstinstall,"isLoginDone",main._islogindone,"isMainScreen",main._ismainscreen,"keepal",main._keepal,"LabelAutorizacao",main.mostCurrent._labelautorizacao,"LabelCheckValidacao",main.mostCurrent._labelcheckvalidacao,"LabelCodigoAutorizacao",main.mostCurrent._labelcodigoautorizacao,"LabelCodigoInstancia",main.mostCurrent._labelcodigoinstancia,"LabelControloAcesso",main.mostCurrent._labelcontroloacesso,"LabelDownloadInicialFases",main.mostCurrent._labeldownloadinicialfases,"LabelDownloadInicialTitle",main.mostCurrent._labeldownloadinicialtitle,"LabelHelpAutorizacao",main.mostCurrent._labelhelpautorizacao,"LabelNomeUtilizador",main.mostCurrent._labelnomeutilizador,"LabelPasswordUtilizador",main.mostCurrent._labelpasswordutilizador,"LabelTarefa",main.mostCurrent._labeltarefa,"LabelTituloCredenciais",main.mostCurrent._labeltitulocredenciais,"LabelValidacaoAcesso",main.mostCurrent._labelvalidacaoacesso,"LabelValidacaoLogin",main.mostCurrent._labelvalidacaologin,"LabelVerificacao",main.mostCurrent._labelverificacao,"LabelVersion",main.mostCurrent._labelversion,"LabelWelcomeEvolutionCheck",main.mostCurrent._labelwelcomeevolutioncheck,"LabelWelcomeWarning",main.mostCurrent._labelwelcomewarning,"LGO_PasswordMode",main._lgo_passwordmode,"LiteUpdateTagCodes",main.mostCurrent._liteupdatetagcodes,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"LoginPanelIconImageView",main.mostCurrent._loginpaneliconimageview,"LoginUpdateFileName",main.mostCurrent._loginupdatefilename,"LoginValidationPanelIconImageView",main.mostCurrent._loginvalidationpaneliconimageview,"LogoBackEVC",main.mostCurrent._logobackevc,"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"mainFirstInstall",main.mostCurrent._mainfirstinstall,"mainLayout",main.mostCurrent._mainlayout,"MainLayoutPanel",main.mostCurrent._mainlayoutpanel,"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"mainPanelSplash",main.mostCurrent._mainpanelsplash,"mainPanSplashCustomLogo",main.mostCurrent._mainpansplashcustomlogo,"mainPanSplashImage",main.mostCurrent._mainpansplashimage,"mainPanSplashLogo",main.mostCurrent._mainpansplashlogo,"MainPopMenu",main.mostCurrent._mainpopmenu,"mainShowDialogResult",main._mainshowdialogresult,"mainSplashImage",main.mostCurrent._mainsplashimage,"mainSplashImageEffect",main.mostCurrent._mainsplashimageeffect,"mainSplashProgress",main.mostCurrent._mainsplashprogress,"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"NetErrorTryCount",main._neterrortrycount,"newpass1",main.mostCurrent._newpass1,"newpass2",main.mostCurrent._newpass2,"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"Panel_Authorization",main.mostCurrent._panel_authorization,"Panel_Config",main.mostCurrent._panel_config,"Panel_Login",main.mostCurrent._panel_login,"Panel_Login_Validation",main.mostCurrent._panel_login_validation,"Panel_Verification",main.mostCurrent._panel_verification,"Panel_Welcome",main.mostCurrent._panel_welcome,"PanelDownloadInicial",main.mostCurrent._paneldownloadinicial,"phone",main.mostCurrent._phone,"ProgressoInicial",main.mostCurrent._progressoinicial,"ProgressoInicial2",main.mostCurrent._progressoinicial2,"QRCodeKeyReceived",main.mostCurrent._qrcodekeyreceived,"QRCodePanel",main.mostCurrent._qrcodepanel,"QRCodeReader",main.mostCurrent._qrcodereader,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"SelectLanguage",main.mostCurrent._selectlanguage,"SelectOrientation",main.mostCurrent._selectorientation,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"Started",main._started,"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"TimeStart",main._timestart,"TimeStartCounter",main._timestartcounter,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"VarificationPanelIconImageView",main.mostCurrent._varificationpaneliconimageview,"VersionTagcode",main._versiontagcode,"WaitToConfirm",main._waittoconfirm,"WelcomePanelIconImageView",main.mostCurrent._welcomepaneliconimageview,"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}