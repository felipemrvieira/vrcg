
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xstatebutton {
    public static RemoteObject myClass;
	public b4xstatebutton() {
	}
    public static PCBA staticBA = new PCBA(null, b4xstatebutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mbaselabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mstate = RemoteObject.createImmutable(0);
public static RemoteObject _mreference = RemoteObject.createImmutable("");
public static RemoteObject _mconformity = RemoteObject.createImmutable(0);
public static RemoteObject _mbooleanstate = RemoteObject.createImmutable(false);
public static RemoteObject _mdefaultcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mtextstatecolor = RemoteObject.createImmutable(0);
public static RemoteObject _mfirststatecolor = RemoteObject.createImmutable(0);
public static RemoteObject _msecondstatecolor = RemoteObject.createImmutable(0);
public static RemoteObject _mthirdstatecolor = RemoteObject.createImmutable(0);
public static RemoteObject _mbordercolor = RemoteObject.createImmutable(0);
public static RemoteObject _mbordersize = RemoteObject.createImmutable(0);
public static RemoteObject _mshowborder = RemoteObject.createImmutable(false);
public static RemoteObject _mradiussize = RemoteObject.createImmutable(0);
public static RemoteObject _musedip = RemoteObject.createImmutable(false);
public static RemoteObject _mbuttongroup = RemoteObject.createImmutable(0);
public static RemoteObject _mtag = RemoteObject.declareNull("Object");
public static RemoteObject _menabled = RemoteObject.createImmutable(false);
public static RemoteObject _mallowclick = RemoteObject.createImmutable(false);
public static RemoteObject _lastbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
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
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"LastButton",_ref.getField(false, "_lastbutton"),"mAllowClick",_ref.getField(false, "_mallowclick"),"mBase",_ref.getField(false, "_mbase"),"mBaseLabel",_ref.getField(false, "_mbaselabel"),"mBooleanState",_ref.getField(false, "_mbooleanstate"),"mBorderColor",_ref.getField(false, "_mbordercolor"),"mBorderSize",_ref.getField(false, "_mbordersize"),"mButton",_ref.getField(false, "_mbutton"),"mButtonGroup",_ref.getField(false, "_mbuttongroup"),"mCallBack",_ref.getField(false, "_mcallback"),"mConformity",_ref.getField(false, "_mconformity"),"mDefaultColor",_ref.getField(false, "_mdefaultcolor"),"mEnabled",_ref.getField(false, "_menabled"),"mEventName",_ref.getField(false, "_meventname"),"mFirstStateColor",_ref.getField(false, "_mfirststatecolor"),"mParent",_ref.getField(false, "_mparent"),"mRadiusSize",_ref.getField(false, "_mradiussize"),"mReference",_ref.getField(false, "_mreference"),"mSecondStateColor",_ref.getField(false, "_msecondstatecolor"),"mShowBorder",_ref.getField(false, "_mshowborder"),"mState",_ref.getField(false, "_mstate"),"mTag",_ref.getField(false, "_mtag"),"mTextStateColor",_ref.getField(false, "_mtextstatecolor"),"mThirdStateColor",_ref.getField(false, "_mthirdstatecolor"),"mUseDIP",_ref.getField(false, "_musedip"),"xui",_ref.getField(false, "_xui")};
}
}