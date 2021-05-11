
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class customlistviewcollapse {
    public static RemoteObject myClass;
	public customlistviewcollapse() {
	}
    public static PCBA staticBA = new PCBA(null, customlistviewcollapse.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mdividersize = RemoteObject.createImmutable(0f);
public static RemoteObject _eventname = RemoteObject.createImmutable("");
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _defaulttextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _animationduration = RemoteObject.createImmutable(0);
public static RemoteObject _lastreachendevent = RemoteObject.createImmutable(0L);
public static RemoteObject _pressedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _designerlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _horizontal = RemoteObject.createImmutable(false);
public static RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _mfirstvisibleindex = RemoteObject.createImmutable(0);
public static RemoteObject _mlastvisibleindex = RemoteObject.createImmutable(0);
public static RemoteObject _monitorvisiblerange = RemoteObject.createImmutable(false);
public static RemoteObject _firescrollchanged = RemoteObject.createImmutable(false);
public static RemoteObject _scrollbarsvisible = RemoteObject.createImmutable(false);
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
		return new Object[] {"AnimationDuration",_ref.getField(false, "_animationduration"),"CallBack",_ref.getField(false, "_callback"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultTextBackgroundColor",_ref.getField(false, "_defaulttextbackgroundcolor"),"DefaultTextColor",_ref.getField(false, "_defaulttextcolor"),"DesignerLabel",_ref.getField(false, "_designerlabel"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"EventName",_ref.getField(false, "_eventname"),"FireScrollChanged",_ref.getField(false, "_firescrollchanged"),"horizontal",_ref.getField(false, "_horizontal"),"items",_ref.getField(false, "_items"),"LastReachEndEvent",_ref.getField(false, "_lastreachendevent"),"mBase",_ref.getField(false, "_mbase"),"mDividerSize",_ref.getField(false, "_mdividersize"),"mFirstVisibleIndex",_ref.getField(false, "_mfirstvisibleindex"),"mLastVisibleIndex",_ref.getField(false, "_mlastvisibleindex"),"MonitorVisibleRange",_ref.getField(false, "_monitorvisiblerange"),"mParent",_ref.getField(false, "_mparent"),"PressedColor",_ref.getField(false, "_pressedcolor"),"ScrollBarsVisible",_ref.getField(false, "_scrollbarsvisible"),"su",_ref.getField(false, "_su"),"sv",_ref.getField(false, "_sv"),"xui",_ref.getField(false, "_xui")};
}
}