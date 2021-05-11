
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class anotherdatepicker {
    public static RemoteObject myClass;
	public anotherdatepicker() {
	}
    public static PCBA staticBA = new PCBA(null, anotherdatepicker.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _holder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _cvsbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _dayspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _month = RemoteObject.createImmutable(0);
public static RemoteObject _year = RemoteObject.createImmutable(0);
public static RemoteObject _months = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _years = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _boxw = RemoteObject.createImmutable(0f);
public static RemoteObject _boxh = RemoteObject.createImmutable(0f);
public static RemoteObject _vcorrection = RemoteObject.createImmutable(0f);
public static RemoteObject _action_up = RemoteObject.createImmutable(0);
public static RemoteObject _action_move = RemoteObject.createImmutable(0);
public static RemoteObject _action_down = RemoteObject.createImmutable(0);
public static RemoteObject _tempselectedday = RemoteObject.createImmutable(0);
public static RemoteObject _dayspanelbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dayofweekoffset = RemoteObject.createImmutable(0);
public static RemoteObject _daysinmonth = RemoteObject.createImmutable(0);
public static RemoteObject _tempselectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _selectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _lblselectedday = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _selecteddate = RemoteObject.createImmutable(0L);
public static RemoteObject _targetlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _selectedyear = RemoteObject.createImmutable(0);
public static RemoteObject _selectedmonth = RemoteObject.createImmutable(0);
public static RemoteObject _selectedday = RemoteObject.createImmutable(0);
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _daysnames = null;
public static RemoteObject _mtarget = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _waitforaddtoactivity = RemoteObject.createImmutable(false);
public static RemoteObject _minyear = RemoteObject.createImmutable(0);
public static RemoteObject _maxyear = RemoteObject.createImmutable(0);
public static RemoteObject _firstday = RemoteObject.createImmutable(0);
public static RemoteObject _btncancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btntoday = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _initialmapprop = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
		return new Object[] {"ACTION_DOWN",_ref.getField(false, "_action_down"),"ACTION_MOVE",_ref.getField(false, "_action_move"),"ACTION_UP",_ref.getField(false, "_action_up"),"boxH",_ref.getField(false, "_boxh"),"boxW",_ref.getField(false, "_boxw"),"btnCancel",_ref.getField(false, "_btncancel"),"btnToday",_ref.getField(false, "_btntoday"),"cvs",_ref.getField(false, "_cvs"),"cvsBackground",_ref.getField(false, "_cvsbackground"),"DateUtils",_ref.getField(false, "_dateutils"),"dayOfWeekOffset",_ref.getField(false, "_dayofweekoffset"),"daysInMonth",_ref.getField(false, "_daysinmonth"),"daysNames",_ref.getField(false, "_daysnames"),"DaysPanel",_ref.getField(false, "_dayspanel"),"DaysPanelBackground",_ref.getField(false, "_dayspanelbackground"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"firstDay",_ref.getField(false, "_firstday"),"holder",_ref.getField(false, "_holder"),"InitialMapProp",_ref.getField(false, "_initialmapprop"),"Label1",_ref.getField(false, "_label1"),"Label2",_ref.getField(false, "_label2"),"Label3",_ref.getField(false, "_label3"),"Label4",_ref.getField(false, "_label4"),"Label5",_ref.getField(false, "_label5"),"Label6",_ref.getField(false, "_label6"),"Label7",_ref.getField(false, "_label7"),"lblSelectedDay",_ref.getField(false, "_lblselectedday"),"maxYear",_ref.getField(false, "_maxyear"),"mEventName",_ref.getField(false, "_meventname"),"minYear",_ref.getField(false, "_minyear"),"month",_ref.getField(false, "_month"),"Months",_ref.getField(false, "_months"),"mTarget",_ref.getField(false, "_mtarget"),"selectedColor",_ref.getField(false, "_selectedcolor"),"selectedDate",_ref.getField(false, "_selecteddate"),"selectedDay",_ref.getField(false, "_selectedday"),"selectedMonth",_ref.getField(false, "_selectedmonth"),"selectedYear",_ref.getField(false, "_selectedyear"),"targetLabel",_ref.getField(false, "_targetlabel"),"tempSelectedColor",_ref.getField(false, "_tempselectedcolor"),"tempSelectedDay",_ref.getField(false, "_tempselectedday"),"vCorrection",_ref.getField(false, "_vcorrection"),"waitForAddToActivity",_ref.getField(false, "_waitforaddtoactivity"),"year",_ref.getField(false, "_year"),"Years",_ref.getField(false, "_years")};
}
}