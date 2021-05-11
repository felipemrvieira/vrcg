
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class monthviewcalendar {
    public static RemoteObject myClass;
	public monthviewcalendar() {
	}
    public static PCBA staticBA = new PCBA(null, monthviewcalendar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _defaultcolorconstant = RemoteObject.createImmutable(0);
public static RemoteObject _panelminheight = RemoteObject.createImmutable(0);
public static RemoteObject _action_up = RemoteObject.createImmutable(0);
public static RemoteObject _action_move = RemoteObject.createImmutable(0);
public static RemoteObject _action_down = RemoteObject.createImmutable(0);
public static RemoteObject _titlepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _monthpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _weekpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cellspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cellspanelback = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _months = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _years = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _waitforaddtoactivity = RemoteObject.createImmutable(false);
public static RemoteObject _generalradius = RemoteObject.createImmutable(0);
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _cvsbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _month = RemoteObject.createImmutable(0);
public static RemoteObject _year = RemoteObject.createImmutable(0);
public static RemoteObject _lmonth = RemoteObject.createImmutable(0);
public static RemoteObject _lyear = RemoteObject.createImmutable(0);
public static RemoteObject _tempselectedday = RemoteObject.createImmutable(0);
public static RemoteObject _targetlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblselectedday = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dayofweekoffset = RemoteObject.createImmutable(0);
public static RemoteObject _daysinmonth = RemoteObject.createImmutable(0);
public static RemoteObject _tempselectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _selectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _minyear = RemoteObject.createImmutable(0);
public static RemoteObject _maxyear = RemoteObject.createImmutable(0);
public static RemoteObject _firstday = RemoteObject.createImmutable(0);
public static RemoteObject _selecteddate = RemoteObject.createImmutable(0L);
public static RemoteObject _selectedyear = RemoteObject.createImmutable(0);
public static RemoteObject _selectedmonth = RemoteObject.createImmutable(0);
public static RemoteObject _selectedday = RemoteObject.createImmutable(0);
public static RemoteObject _boxw = RemoteObject.createImmutable(0f);
public static RemoteObject _boxh = RemoteObject.createImmutable(0f);
public static RemoteObject _vcorrection = RemoteObject.createImmutable(0f);
public static RemoteObject _yearslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _monthlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _innermaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
		return new Object[] {"ACTION_DOWN",_ref.getField(false, "_action_down"),"ACTION_MOVE",_ref.getField(false, "_action_move"),"ACTION_UP",_ref.getField(false, "_action_up"),"boxH",_ref.getField(false, "_boxh"),"boxW",_ref.getField(false, "_boxw"),"CellsPanel",_ref.getField(false, "_cellspanel"),"CellsPanelBack",_ref.getField(false, "_cellspanelback"),"cvs",_ref.getField(false, "_cvs"),"cvsBackground",_ref.getField(false, "_cvsbackground"),"DateUtils",_ref.getField(false, "_dateutils"),"dayOfWeekOffset",_ref.getField(false, "_dayofweekoffset"),"daysInMonth",_ref.getField(false, "_daysinmonth"),"DefaultColorConstant",_ref.getField(false, "_defaultcolorconstant"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"firstDay",_ref.getField(false, "_firstday"),"GeneralRadius",_ref.getField(false, "_generalradius"),"innerMaps",_ref.getField(false, "_innermaps"),"lblSelectedDay",_ref.getField(false, "_lblselectedday"),"lmonth",_ref.getField(false, "_lmonth"),"lyear",_ref.getField(false, "_lyear"),"maxYear",_ref.getField(false, "_maxyear"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"minYear",_ref.getField(false, "_minyear"),"month",_ref.getField(false, "_month"),"MonthList",_ref.getField(false, "_monthlist"),"MonthPanel",_ref.getField(false, "_monthpanel"),"Months",_ref.getField(false, "_months"),"PanelMinHeight",_ref.getField(false, "_panelminheight"),"selectedColor",_ref.getField(false, "_selectedcolor"),"selectedDate",_ref.getField(false, "_selecteddate"),"selectedDay",_ref.getField(false, "_selectedday"),"selectedMonth",_ref.getField(false, "_selectedmonth"),"selectedYear",_ref.getField(false, "_selectedyear"),"targetLabel",_ref.getField(false, "_targetlabel"),"tempSelectedColor",_ref.getField(false, "_tempselectedcolor"),"tempSelectedDay",_ref.getField(false, "_tempselectedday"),"TitlePanel",_ref.getField(false, "_titlepanel"),"vCorrection",_ref.getField(false, "_vcorrection"),"waitForAddToActivity",_ref.getField(false, "_waitforaddtoactivity"),"WeekPanel",_ref.getField(false, "_weekpanel"),"year",_ref.getField(false, "_year"),"Years",_ref.getField(false, "_years"),"YearsList",_ref.getField(false, "_yearslist")};
}
}