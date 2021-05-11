
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xdialog {
    public static RemoteObject myClass;
	public b4xdialog() {
	}
    public static PCBA staticBA = new PCBA(null, b4xdialog.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _buttonsheight = RemoteObject.createImmutable(0);
public static RemoteObject _titlebarheight = RemoteObject.createImmutable(0);
public static RemoteObject _buttonwidth = RemoteObject.createImmutable(0);
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _overlaycolor = RemoteObject.createImmutable(0);
public static RemoteObject _bordercolor = RemoteObject.createImmutable(0);
public static RemoteObject _bordercornersradius = RemoteObject.createImmutable(0);
public static RemoteObject _borderwidth = RemoteObject.createImmutable(0);
public static RemoteObject _buttonscolor = RemoteObject.createImmutable(0);
public static RemoteObject _buttonstextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _blurimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _blurbackground = RemoteObject.createImmutable(false);
public static RemoteObject _blurreducescale = RemoteObject.createImmutable(0);
public static RemoteObject _mparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _title = RemoteObject.declareNull("Object");
public static RemoteObject _titlebarcolor = RemoteObject.createImmutable(0);
public static RemoteObject _titlebartextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _bodytextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _titlebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _putattop = RemoteObject.createImmutable(false);
public static RemoteObject _titlebarfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _buttonsfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _buttonstextcolordisabled = RemoteObject.createImmutable(0);
public static RemoteObject _visibleanimationduration = RemoteObject.createImmutable(0);
public static RemoteObject _buttonsorder = null;
public static RemoteObject _buttonsstate = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
public static xevolution.vrcg.devdemov2400.user _user = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Background",_ref.getField(false, "_background"),"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"Base",_ref.getField(false, "_base"),"BlurBackground",_ref.getField(false, "_blurbackground"),"BlurImageView",_ref.getField(false, "_blurimageview"),"BlurReduceScale",_ref.getField(false, "_blurreducescale"),"BodyTextColor",_ref.getField(false, "_bodytextcolor"),"BorderColor",_ref.getField(false, "_bordercolor"),"BorderCornersRadius",_ref.getField(false, "_bordercornersradius"),"BorderWidth",_ref.getField(false, "_borderwidth"),"ButtonsColor",_ref.getField(false, "_buttonscolor"),"ButtonsFont",_ref.getField(false, "_buttonsfont"),"ButtonsHeight",_ref.getField(false, "_buttonsheight"),"ButtonsOrder",_ref.getField(false, "_buttonsorder"),"ButtonsState",_ref.getField(false, "_buttonsstate"),"ButtonsTextColor",_ref.getField(false, "_buttonstextcolor"),"ButtonsTextColorDisabled",_ref.getField(false, "_buttonstextcolordisabled"),"ButtonWidth",_ref.getField(false, "_buttonwidth"),"DateUtils",_ref.getField(false, "_dateutils"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"mParent",_ref.getField(false, "_mparent"),"OverlayColor",_ref.getField(false, "_overlaycolor"),"PutAtTop",_ref.getField(false, "_putattop"),"Title",_ref.getField(false, "_title"),"TitleBar",_ref.getField(false, "_titlebar"),"TitleBarColor",_ref.getField(false, "_titlebarcolor"),"TitleBarFont",_ref.getField(false, "_titlebarfont"),"TitleBarHeight",_ref.getField(false, "_titlebarheight"),"TitleBarTextColor",_ref.getField(false, "_titlebartextcolor"),"VisibleAnimationDuration",_ref.getField(false, "_visibleanimationduration"),"xui",_ref.getField(false, "_xui")};
}
}