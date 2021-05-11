
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

public class imageedit implements IRemote{
	public static imageedit mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public imageedit() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("imageedit"), "xevolution.vrcg.devdemov2400.imageedit");
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
		pcBA = new PCBA(this, imageedit.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _saverects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _pinpointnumber = RemoteObject.createImmutable(0);
public static RemoteObject _shotfilelocation = RemoteObject.createImmutable("");
public static RemoteObject _shotfilename = RemoteObject.createImmutable("");
public static RemoteObject _device = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _appldialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
public static RemoteObject _intputtextfield = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
public static RemoteObject _startmetric = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._point");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _smiley = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _deg = RemoteObject.createImmutable(0);
public static RemoteObject _vx = RemoteObject.createImmutable(0);
public static RemoteObject _vy = RemoteObject.createImmutable(0);
public static RemoteObject _smileyrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _size = RemoteObject.createImmutable(0);
public static RemoteObject _imagepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _drawpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneltemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _isb64image = RemoteObject.createImmutable(false);
public static RemoteObject _rettocamera = RemoteObject.createImmutable(false);
public static RemoteObject _undobmr = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._bmr");
public static RemoteObject _drawingcanvas = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _undorect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _drawingrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _cvsrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _sx = RemoteObject.createImmutable(0);
public static RemoteObject _sy = RemoteObject.createImmutable(0);
public static RemoteObject _currindex = RemoteObject.createImmutable(0);
public static RemoteObject _xposis = RemoteObject.createImmutable(0);
public static RemoteObject _yposis = RemoteObject.createImmutable(0);
public static RemoteObject _markercolorname = RemoteObject.createImmutable("");
public static RemoteObject _linecolor = RemoteObject.createImmutable(0);
public static RemoteObject _linewidth = RemoteObject.createImmutable(0);
public static RemoteObject _fontsize = RemoteObject.createImmutable(0);
public static RemoteObject _x0 = RemoteObject.createImmutable(0);
public static RemoteObject _y0 = RemoteObject.createImmutable(0);
public static RemoteObject _r0 = RemoteObject.createImmutable(0);
public static RemoteObject _x1 = RemoteObject.createImmutable(0);
public static RemoteObject _y1 = RemoteObject.createImmutable(0);
public static RemoteObject _circlestroke = RemoteObject.createImmutable(0);
public static RemoteObject _circlecolor = RemoteObject.createImmutable(0);
public static RemoteObject _makeundo = RemoteObject.createImmutable(false);
public static RemoteObject _pointsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _bcamera = RemoteObject.createImmutable(false);
public static RemoteObject _bpencil = RemoteObject.createImmutable(false);
public static RemoteObject _brect = RemoteObject.createImmutable(false);
public static RemoteObject _bcircle = RemoteObject.createImmutable(false);
public static RemoteObject _bmarker = RemoteObject.createImmutable(false);
public static RemoteObject _btext = RemoteObject.createImmutable(false);
public static RemoteObject _bshot = RemoteObject.createImmutable(false);
public static RemoteObject _bocr = RemoteObject.createImmutable(false);
public static RemoteObject _bbarcode = RemoteObject.createImmutable(false);
public static RemoteObject _bb_bcbarcode = RemoteObject.createImmutable(false);
public static RemoteObject _bb_bcqrcode = RemoteObject.createImmutable(false);
public static RemoteObject _bb_bcstamp = RemoteObject.createImmutable(false);
public static RemoteObject _bb_pinfoto = RemoteObject.createImmutable(false);
public static RemoteObject _bb_pinmarker = RemoteObject.createImmutable(false);
public static RemoteObject _bb_pintext = RemoteObject.createImmutable(false);
public static RemoteObject _bb_pencildistance = RemoteObject.createImmutable(false);
public static RemoteObject _bb_pencilfree = RemoteObject.createImmutable(false);
public static RemoteObject _bb_pencilline = RemoteObject.createImmutable(false);
public static RemoteObject _bb_barcode = RemoteObject.createImmutable(false);
public static RemoteObject _bb_ocrfindall = RemoteObject.createImmutable(false);
public static RemoteObject _bb_ocrfindselect = RemoteObject.createImmutable(false);
public static RemoteObject _hideme = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _showimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _showpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _butcircle = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butmarker = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butshot = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _memorylabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _colorblack = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _colorblue = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _colorgrey = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _colororange = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _colorpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _colorpurple = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _colorred = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _coloryellow = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _colorgreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcamera = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butocr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butbarcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butocrfindall = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butocrfindselect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _ocroptpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _colorwhite = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _textfield = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _textpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _hidetext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butfont16 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butfont20 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butfont24 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butfont28 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butfont32 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butfont36 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _fontpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _colorpanelindicator = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _barcodepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _bcbarcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _bcqrcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _bcstamp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butactions = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butcolors = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butpencil = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butsave = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butundo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pinpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pinfoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pinmarker = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pintext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butfonts = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _actionspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _butpencildistance = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butpencilfree = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butpencilline = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pencilpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _butreset = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _butacceptcrop = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lockpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _isgrid = RemoteObject.createImmutable(false);
public static RemoteObject _currentclaitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
public static RemoteObject _exittodialog = RemoteObject.createImmutable(false);
public static RemoteObject _innercounter = RemoteObject.createImmutable(0);
public static RemoteObject _touch_x = RemoteObject.createImmutable(0);
public static RemoteObject _touch_y = RemoteObject.createImmutable(0);
public static RemoteObject _innercamshots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
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
		return new Object[] {"ActionsPanel",imageedit.mostCurrent._actionspanel,"Activity",imageedit.mostCurrent._activity,"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"ApplDialog",imageedit.mostCurrent._appldialog,"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarCodePanel",imageedit.mostCurrent._barcodepanel,"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"bb_Barcode",imageedit._bb_barcode,"bb_BCBarcode",imageedit._bb_bcbarcode,"bb_BCQRCode",imageedit._bb_bcqrcode,"bb_BCStamp",imageedit._bb_bcstamp,"bb_OCRFindAll",imageedit._bb_ocrfindall,"bb_OCRFindSelect",imageedit._bb_ocrfindselect,"bb_PencilDistance",imageedit._bb_pencildistance,"bb_PencilFree",imageedit._bb_pencilfree,"bb_PencilLine",imageedit._bb_pencilline,"bb_PINFoto",imageedit._bb_pinfoto,"bb_PINMarker",imageedit._bb_pinmarker,"bb_PINText",imageedit._bb_pintext,"bBarcode",imageedit._bbarcode,"bCamera",imageedit._bcamera,"BCBarcode",imageedit.mostCurrent._bcbarcode,"bCircle",imageedit._bcircle,"BCQRCode",imageedit.mostCurrent._bcqrcode,"BCStamp",imageedit.mostCurrent._bcstamp,"bMarker",imageedit._bmarker,"bOCR",imageedit._bocr,"bPencil",imageedit._bpencil,"bRect",imageedit._brect,"bShot",imageedit._bshot,"bText",imageedit._btext,"butAcceptCrop",imageedit.mostCurrent._butacceptcrop,"butActions",imageedit.mostCurrent._butactions,"butBarcode",imageedit.mostCurrent._butbarcode,"butCamera",imageedit.mostCurrent._butcamera,"butCircle",imageedit.mostCurrent._butcircle,"butClose",imageedit.mostCurrent._butclose,"butColors",imageedit.mostCurrent._butcolors,"butFont16",imageedit.mostCurrent._butfont16,"butFont20",imageedit.mostCurrent._butfont20,"butFont24",imageedit.mostCurrent._butfont24,"butFont28",imageedit.mostCurrent._butfont28,"butFont32",imageedit.mostCurrent._butfont32,"butFont36",imageedit.mostCurrent._butfont36,"butFonts",imageedit.mostCurrent._butfonts,"butMarker",imageedit.mostCurrent._butmarker,"butOCR",imageedit.mostCurrent._butocr,"butOCRFindAll",imageedit.mostCurrent._butocrfindall,"butOCRFindSelect",imageedit.mostCurrent._butocrfindselect,"butPencil",imageedit.mostCurrent._butpencil,"butPencilDistance",imageedit.mostCurrent._butpencildistance,"butPencilFree",imageedit.mostCurrent._butpencilfree,"butPencilLine",imageedit.mostCurrent._butpencilline,"butRect",imageedit.mostCurrent._butrect,"butReset",imageedit.mostCurrent._butreset,"butSave",imageedit.mostCurrent._butsave,"butShot",imageedit.mostCurrent._butshot,"butText",imageedit.mostCurrent._buttext,"butUndo",imageedit.mostCurrent._butundo,"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"CircleColor",imageedit._circlecolor,"CircleStroke",imageedit._circlestroke,"ColorBlack",imageedit.mostCurrent._colorblack,"ColorBlue",imageedit.mostCurrent._colorblue,"ColorGreen",imageedit.mostCurrent._colorgreen,"ColorGrey",imageedit.mostCurrent._colorgrey,"ColorOrange",imageedit.mostCurrent._colororange,"ColorPanel",imageedit.mostCurrent._colorpanel,"ColorPanelIndicator",imageedit.mostCurrent._colorpanelindicator,"ColorPurple",imageedit.mostCurrent._colorpurple,"ColorRed",imageedit.mostCurrent._colorred,"ColorWhite",imageedit.mostCurrent._colorwhite,"ColorYellow",imageedit.mostCurrent._coloryellow,"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"CurrentCLAItem",imageedit.mostCurrent._currentclaitem,"CurrIndex",imageedit._currindex,"cvs",imageedit.mostCurrent._cvs,"cvsRect",imageedit.mostCurrent._cvsrect,"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",imageedit.mostCurrent._dateutils,"DBStructures",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbstructures.class),"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"deg",imageedit._deg,"Device",imageedit._device,"DrawingCanvas",imageedit.mostCurrent._drawingcanvas,"DrawingRect",imageedit.mostCurrent._drawingrect,"DrawPanel",imageedit.mostCurrent._drawpanel,"Encoding",imageedit.mostCurrent._encoding,"ESC_POS",imageedit.mostCurrent._esc_pos,"ExitToDialog",imageedit._exittodialog,"FontPanel",imageedit.mostCurrent._fontpanel,"FontSize",imageedit._fontsize,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HideMe",imageedit.mostCurrent._hideme,"HideText",imageedit.mostCurrent._hidetext,"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImagePanel",imageedit.mostCurrent._imagepanel,"ImageView1",imageedit.mostCurrent._imageview1,"InnerCamShots",imageedit.mostCurrent._innercamshots,"InnerCounter",imageedit._innercounter,"IntputTextField",imageedit.mostCurrent._intputtextfield,"isB64Image",imageedit._isb64image,"isGrid",imageedit._isgrid,"LineColor",imageedit._linecolor,"LineWidth",imageedit._linewidth,"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"LockPanel",imageedit.mostCurrent._lockpanel,"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MakeUndo",imageedit._makeundo,"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"MarkerColorName",imageedit.mostCurrent._markercolorname,"memoryLabel",imageedit.mostCurrent._memorylabel,"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"OCROptPanel",imageedit.mostCurrent._ocroptpanel,"PanelTemp",imageedit.mostCurrent._paneltemp,"PencilPanel",imageedit.mostCurrent._pencilpanel,"PINFoto",imageedit.mostCurrent._pinfoto,"PINMarker",imageedit.mostCurrent._pinmarker,"PinPanel",imageedit.mostCurrent._pinpanel,"PinPointNumber",imageedit._pinpointnumber,"PINText",imageedit.mostCurrent._pintext,"PointsMap",imageedit.mostCurrent._pointsmap,"r0",imageedit._r0,"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"RetToCamera",imageedit._rettocamera,"SaveRects",imageedit._saverects,"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"ShotFileLocation",imageedit._shotfilelocation,"ShotFileName",imageedit._shotfilename,"ShowImage",imageedit.mostCurrent._showimage,"ShowPanel",imageedit.mostCurrent._showpanel,"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"size",imageedit._size,"smiley",imageedit.mostCurrent._smiley,"SmileyRect",imageedit.mostCurrent._smileyrect,"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"StartMetric",imageedit.mostCurrent._startmetric,"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"sx",imageedit._sx,"sy",imageedit._sy,"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"TextField",imageedit.mostCurrent._textfield,"TextPanel",imageedit.mostCurrent._textpanel,"Touch_X",imageedit._touch_x,"Touch_Y",imageedit._touch_y,"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UndoBMR",imageedit.mostCurrent._undobmr,"UndoRect",imageedit.mostCurrent._undorect,"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"vx",imageedit._vx,"vy",imageedit._vy,"x0",imageedit._x0,"x1",imageedit._x1,"XPosis",imageedit._xposis,"xui",imageedit.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class),"y0",imageedit._y0,"y1",imageedit._y1,"YPosis",imageedit._yposis};
}
}