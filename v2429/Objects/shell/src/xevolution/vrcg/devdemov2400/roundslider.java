
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class roundslider {
    public static RemoteObject myClass;
	public roundslider() {
	}
    public static PCBA staticBA = new PCBA(null, roundslider.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _mvalue = RemoteObject.createImmutable(0);
public static RemoteObject _mmin = RemoteObject.createImmutable(0);
public static RemoteObject _mmax = RemoteObject.createImmutable(0);
public static RemoteObject _thumb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _circlerect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _valuecolor = RemoteObject.createImmutable(0);
public static RemoteObject _stroke = RemoteObject.createImmutable(0);
public static RemoteObject _thumbsize = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _mthumbbordercolor = RemoteObject.createImmutable(0);
public static RemoteObject _mthumbinnercolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcirclefillcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcirclenonvaluecolor = RemoteObject.createImmutable(0);
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
		return new Object[] {"CircleRect",_ref.getField(false, "_circlerect"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mCircleFillColor",_ref.getField(false, "_mcirclefillcolor"),"mCircleNonValueColor",_ref.getField(false, "_mcirclenonvaluecolor"),"mEventName",_ref.getField(false, "_meventname"),"mMax",_ref.getField(false, "_mmax"),"mMin",_ref.getField(false, "_mmin"),"mThumbBorderColor",_ref.getField(false, "_mthumbbordercolor"),"mThumbInnerColor",_ref.getField(false, "_mthumbinnercolor"),"mValue",_ref.getField(false, "_mvalue"),"pnl",_ref.getField(false, "_pnl"),"stroke",_ref.getField(false, "_stroke"),"Tag",_ref.getField(false, "_tag"),"thumb",_ref.getField(false, "_thumb"),"ThumbSize",_ref.getField(false, "_thumbsize"),"ValueColor",_ref.getField(false, "_valuecolor"),"xlbl",_ref.getField(false, "_xlbl"),"xui",_ref.getField(false, "_xui")};
}
}