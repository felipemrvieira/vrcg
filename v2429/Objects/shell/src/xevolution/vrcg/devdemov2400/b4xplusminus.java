
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xplusminus {
    public static RemoteObject myClass;
	public b4xplusminus() {
	}
    public static PCBA staticBA = new PCBA(null, b4xplusminus.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _pnlplus = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlminus = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblplus = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblminus = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _formation = RemoteObject.createImmutable("");
public static RemoteObject _mcyclic = RemoteObject.createImmutable(false);
public static RemoteObject _mrapid = RemoteObject.createImmutable(false);
public static RemoteObject _mainlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _arrowssize = RemoteObject.createImmutable(0);
public static RemoteObject _mstringitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mstartrange = RemoteObject.createImmutable(0);
public static RemoteObject _minterval = RemoteObject.createImmutable(0);
public static RemoteObject _mendrange = RemoteObject.createImmutable(0);
public static RemoteObject _mselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _loopindex = RemoteObject.createImmutable(0);
public static RemoteObject _rapidperiod1 = RemoteObject.createImmutable(0);
public static RemoteObject _rapidperiod2 = RemoteObject.createImmutable(0);
public static RemoteObject _formatter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xformatter");
public static RemoteObject _stringmode = RemoteObject.createImmutable(false);
public static RemoteObject _size = RemoteObject.createImmutable(0);
public static RemoteObject _mhaptic = RemoteObject.createImmutable(false);
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
		return new Object[] {"ArrowsSize",_ref.getField(false, "_arrowssize"),"DateUtils",_ref.getField(false, "_dateutils"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"Formation",_ref.getField(false, "_formation"),"Formatter",_ref.getField(false, "_formatter"),"lblMinus",_ref.getField(false, "_lblminus"),"lblPlus",_ref.getField(false, "_lblplus"),"LoopIndex",_ref.getField(false, "_loopindex"),"MainLabel",_ref.getField(false, "_mainlabel"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mCyclic",_ref.getField(false, "_mcyclic"),"mEndRange",_ref.getField(false, "_mendrange"),"mEventName",_ref.getField(false, "_meventname"),"mHaptic",_ref.getField(false, "_mhaptic"),"mInterval",_ref.getField(false, "_minterval"),"mRapid",_ref.getField(false, "_mrapid"),"mSelectedIndex",_ref.getField(false, "_mselectedindex"),"mStartRange",_ref.getField(false, "_mstartrange"),"mStringItems",_ref.getField(false, "_mstringitems"),"pnlMinus",_ref.getField(false, "_pnlminus"),"pnlPlus",_ref.getField(false, "_pnlplus"),"RapidPeriod1",_ref.getField(false, "_rapidperiod1"),"RapidPeriod2",_ref.getField(false, "_rapidperiod2"),"Size",_ref.getField(false, "_size"),"StringMode",_ref.getField(false, "_stringmode"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}