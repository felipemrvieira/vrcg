package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherdatepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.anotherdatepicker");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.anotherdatepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _holder = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsbackground = null;
public anywheresoftware.b4a.objects.PanelWrapper _dayspanel = null;
public int _month = 0;
public int _year = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _months = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _years = null;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public int _action_up = 0;
public int _action_move = 0;
public int _action_down = 0;
public int _tempselectedday = 0;
public anywheresoftware.b4a.objects.PanelWrapper _dayspanelbackground = null;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public int _tempselectedcolor = 0;
public int _selectedcolor = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lblselectedday = null;
public long _selecteddate = 0L;
public anywheresoftware.b4a.objects.LabelWrapper _targetlabel = null;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper[] _daysnames = null;
public Object _mtarget = null;
public String _meventname = "";
public boolean _waitforaddtoactivity = false;
public int _minyear = 0;
public int _maxyear = 0;
public int _firstday = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btncancel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntoday = null;
public anywheresoftware.b4a.objects.collections.Map _initialmapprop = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.encoding _encoding = null;
public b4a.example.esc_pos _esc_pos = null;
public xevolution.vrcg.devdemov2400.main _main = null;
public xevolution.vrcg.devdemov2400.starter _starter = null;
public xevolution.vrcg.devdemov2400.comms _comms = null;
public xevolution.vrcg.devdemov2400.utils _utils = null;
public xevolution.vrcg.devdemov2400.dbstructures _dbstructures = null;
public xevolution.vrcg.devdemov2400.sharecode _sharecode = null;
public xevolution.vrcg.devdemov2400.mainmenu _mainmenu = null;
public xevolution.vrcg.devdemov2400.imageedit _imageedit = null;
public xevolution.vrcg.devdemov2400.checklist3 _checklist3 = null;
public xevolution.vrcg.devdemov2400.locationservice _locationservice = null;
public xevolution.vrcg.devdemov2400.dataupdate _dataupdate = null;
public xevolution.vrcg.devdemov2400.alerts _alerts = null;
public xevolution.vrcg.devdemov2400.backgroundupdateservice _backgroundupdateservice = null;
public xevolution.vrcg.devdemov2400.barcodescanner _barcodescanner = null;
public xevolution.vrcg.devdemov2400.cameraactivity _cameraactivity = null;
public xevolution.vrcg.devdemov2400.cameraactivity_innershot _cameraactivity_innershot = null;
public xevolution.vrcg.devdemov2400.cameraactivity2 _cameraactivity2 = null;
public xevolution.vrcg.devdemov2400.checklistnew _checklistnew = null;
public xevolution.vrcg.devdemov2400.common _common = null;
public xevolution.vrcg.devdemov2400.consts _consts = null;
public xevolution.vrcg.devdemov2400.dbutils _dbutils = null;
public xevolution.vrcg.devdemov2400.helpdescriptors _helpdescriptors = null;
public xevolution.vrcg.devdemov2400.logs _logs = null;
public xevolution.vrcg.devdemov2400.mapsactivity _mapsactivity = null;
public xevolution.vrcg.devdemov2400.newsync _newsync = null;
public xevolution.vrcg.devdemov2400.notas _notas = null;
public xevolution.vrcg.devdemov2400.objectedit _objectedit = null;
public xevolution.vrcg.devdemov2400.objects _objects = null;
public xevolution.vrcg.devdemov2400.report _report = null;
public xevolution.vrcg.devdemov2400.reportview _reportview = null;
public xevolution.vrcg.devdemov2400.requests3 _requests3 = null;
public xevolution.vrcg.devdemov2400.signaturecapture _signaturecapture = null;
public xevolution.vrcg.devdemov2400.structures _structures = null;
public xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public xevolution.vrcg.devdemov2400.types _types = null;
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public String  _afterloadlayout(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "afterloadlayout", false))
	 {return ((String) Debug.delegate(ba, "afterloadlayout", new Object[] {_props}));}
anywheresoftware.b4a.objects.ActivityWrapper _act = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
int _y = 0;
String _m = "";
anywheresoftware.b4a.objects.collections.List _alldays = null;
anywheresoftware.b4a.objects.collections.List _days = null;
int _i = 0;
String _d = "";
RDebugUtils.currentLine=65077248;
 //BA.debugLineNum = 65077248;BA.debugLine="Public Sub AfterLoadLayout (Props As Map)";
RDebugUtils.currentLine=65077249;
 //BA.debugLineNum = 65077249;BA.debugLine="waitForAddToActivity = False";
__ref._waitforaddtoactivity /*boolean*/  = __c.False;
RDebugUtils.currentLine=65077250;
 //BA.debugLineNum = 65077250;BA.debugLine="holder.Initialize(\"holder\")";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"holder");
RDebugUtils.currentLine=65077251;
 //BA.debugLineNum = 65077251;BA.debugLine="holder.Elevation = 2000dip";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setElevation((float) (__c.DipToCurrent((int) (2000))));
RDebugUtils.currentLine=65077253;
 //BA.debugLineNum = 65077253;BA.debugLine="holder.Visible = False";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=65077254;
 //BA.debugLineNum = 65077254;BA.debugLine="holder.Color = Colors.Transparent";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=65077255;
 //BA.debugLineNum = 65077255;BA.debugLine="Dim act As Activity = Props.Get(\"activity\")";
_act = new anywheresoftware.b4a.objects.ActivityWrapper();
_act = (anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_props.Get((Object)("activity"))));
RDebugUtils.currentLine=65077256;
 //BA.debugLineNum = 65077256;BA.debugLine="act.AddView(holder, (100%x/2)-(440dip/2), 150dip,";
_act.AddView((android.view.View)(__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)/(double)2)-(__c.DipToCurrent((int) (440))/(double)2)),__c.DipToCurrent((int) (150)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=65077257;
 //BA.debugLineNum = 65077257;BA.debugLine="holder.LoadLayout(\"DatePicker_small\")";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("DatePicker_small",ba);
RDebugUtils.currentLine=65077258;
 //BA.debugLineNum = 65077258;BA.debugLine="Dim p As Panel = holder.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (0)).getObject()));
RDebugUtils.currentLine=65077259;
 //BA.debugLineNum = 65077259;BA.debugLine="p.Color = Props.Get(\"BackgroundColor\")";
_p.setColor((int)(BA.ObjectToNumber(_props.Get((Object)("BackgroundColor")))));
RDebugUtils.currentLine=65077260;
 //BA.debugLineNum = 65077260;BA.debugLine="If Props.Get(\"CancelVisible\") = False And Props.G";
if ((_props.Get((Object)("CancelVisible"))).equals((Object)(__c.False)) && (_props.Get((Object)("TodayVisible"))).equals((Object)(__c.False))) { 
_p.setHeight((int) (_p.getHeight()-__c.DipToCurrent((int) (40))));};
RDebugUtils.currentLine=65077261;
 //BA.debugLineNum = 65077261;BA.debugLine="btnToday.Visible = Props.Get(\"TodayVisible\")";
__ref._btntoday /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(BA.ObjectToBoolean(_props.Get((Object)("TodayVisible"))));
RDebugUtils.currentLine=65077262;
 //BA.debugLineNum = 65077262;BA.debugLine="btnCancel.Visible = Props.Get(\"CancelVisible\")";
__ref._btncancel /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(BA.ObjectToBoolean(_props.Get((Object)("CancelVisible"))));
RDebugUtils.currentLine=65077263;
 //BA.debugLineNum = 65077263;BA.debugLine="daysNames = Array As Label(Label1, Label2, Label3";
__ref._daysnames /*anywheresoftware.b4a.objects.LabelWrapper[]*/  = new anywheresoftware.b4a.objects.LabelWrapper[]{__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label4 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label5 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label6 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label7 /*anywheresoftware.b4a.objects.LabelWrapper*/ };
RDebugUtils.currentLine=65077264;
 //BA.debugLineNum = 65077264;BA.debugLine="Dim et As EditText";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=65077265;
 //BA.debugLineNum = 65077265;BA.debugLine="et.Initialize(\"\")";
_et.Initialize(ba,"");
RDebugUtils.currentLine=65077266;
 //BA.debugLineNum = 65077266;BA.debugLine="targetLabel.Background = et.Background 'make the";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground(_et.getBackground());
RDebugUtils.currentLine=65077267;
 //BA.debugLineNum = 65077267;BA.debugLine="cvs.Initialize(DaysPanel)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._dayspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=65077268;
 //BA.debugLineNum = 65077268;BA.debugLine="cvsBackground.Initialize(DaysPanelBackground)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._dayspanelbackground /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=65077269;
 //BA.debugLineNum = 65077269;BA.debugLine="selectedColor = Props.Get(\"SelectedColor\")";
__ref._selectedcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedColor"))));
RDebugUtils.currentLine=65077270;
 //BA.debugLineNum = 65077270;BA.debugLine="tempSelectedColor = Props.Get(\"HighlightedColor\")";
__ref._tempselectedcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HighlightedColor"))));
RDebugUtils.currentLine=65077271;
 //BA.debugLineNum = 65077271;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref._month /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=65077272;
 //BA.debugLineNum = 65077272;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref._year /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=65077273;
 //BA.debugLineNum = 65077273;BA.debugLine="minYear = Props.Get(\"MinYear\")";
__ref._minyear /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("MinYear"))));
RDebugUtils.currentLine=65077274;
 //BA.debugLineNum = 65077274;BA.debugLine="maxYear = Props.Get(\"MaxYear\")";
__ref._maxyear /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("MaxYear"))));
RDebugUtils.currentLine=65077275;
 //BA.debugLineNum = 65077275;BA.debugLine="For y = minYear To maxYear";
{
final int step26 = 1;
final int limit26 = __ref._maxyear /*int*/ ;
_y = __ref._minyear /*int*/  ;
for (;_y <= limit26 ;_y = _y + step26 ) {
RDebugUtils.currentLine=65077276;
 //BA.debugLineNum = 65077276;BA.debugLine="Years.Add(y)";
__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_y));
 }
};
RDebugUtils.currentLine=65077278;
 //BA.debugLineNum = 65077278;BA.debugLine="For Each m As String In DateUtils.GetMonthsNames";
{
final anywheresoftware.b4a.BA.IterableList group29 = _dateutils._getmonthsnames(ba);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_m = BA.ObjectToString(group29.Get(index29));
RDebugUtils.currentLine=65077279;
 //BA.debugLineNum = 65077279;BA.debugLine="Months.Add(m)";
__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_m);
 }
};
RDebugUtils.currentLine=65077281;
 //BA.debugLineNum = 65077281;BA.debugLine="Dim alldays As List = Regex.Split(\"\\|\", \"Sunday|M";
_alldays = new anywheresoftware.b4a.objects.collections.List();
_alldays = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|","Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday"));
RDebugUtils.currentLine=65077282;
 //BA.debugLineNum = 65077282;BA.debugLine="firstDay = alldays.IndexOf(Props.Get(\"FirstDay\"))";
__ref._firstday /*int*/  = _alldays.IndexOf(_props.Get((Object)("FirstDay")));
RDebugUtils.currentLine=65077283;
 //BA.debugLineNum = 65077283;BA.debugLine="Dim days As List = DateUtils.GetDaysNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = _dateutils._getdaysnames(ba);
RDebugUtils.currentLine=65077284;
 //BA.debugLineNum = 65077284;BA.debugLine="For i = firstDay To firstDay + 7 - 1";
{
final int step35 = 1;
final int limit35 = (int) (__ref._firstday /*int*/ +7-1);
_i = __ref._firstday /*int*/  ;
for (;_i <= limit35 ;_i = _i + step35 ) {
RDebugUtils.currentLine=65077285;
 //BA.debugLineNum = 65077285;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
RDebugUtils.currentLine=65077286;
 //BA.debugLineNum = 65077286;BA.debugLine="daysNames(i - firstDay).Text = d.SubString2(0, 2";
__ref._daysnames /*anywheresoftware.b4a.objects.LabelWrapper[]*/ [(int) (_i-__ref._firstday /*int*/ )].setText(BA.ObjectToCharSequence(_d.substring((int) (0),(int) (2))));
 }
};
RDebugUtils.currentLine=65077288;
 //BA.debugLineNum = 65077288;BA.debugLine="SetDate(DateTime.Now, False)";
__ref._setdate /*String*/ (null,__c.DateTime.getNow(),__c.False);
RDebugUtils.currentLine=65077289;
 //BA.debugLineNum = 65077289;BA.debugLine="vCorrection = cvs.MeasureStringHeight(\"1\", Typefa";
__ref._vcorrection /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringHeight("1",__c.Typeface.DEFAULT_BOLD,__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize())/(double)2);
RDebugUtils.currentLine=65077290;
 //BA.debugLineNum = 65077290;BA.debugLine="boxW = cvs.Bitmap.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getWidth()/(double)7);
RDebugUtils.currentLine=65077291;
 //BA.debugLineNum = 65077291;BA.debugLine="boxH = cvs.Bitmap.Height / 6";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getHeight()/(double)6);
RDebugUtils.currentLine=65077292;
 //BA.debugLineNum = 65077292;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=65077293;
 //BA.debugLineNum = 65077293;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=65077294;
 //BA.debugLineNum = 65077294;BA.debugLine="End Sub";
return "";
}
public String  _setdate(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,long _date,boolean _updatelabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "setdate", false))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date,_updatelabel}));}
RDebugUtils.currentLine=65208320;
 //BA.debugLineNum = 65208320;BA.debugLine="Public Sub SetDate(date As Long, UpdateLabel As Bo";
RDebugUtils.currentLine=65208321;
 //BA.debugLineNum = 65208321;BA.debugLine="If waitForAddToActivity Then";
if (__ref._waitforaddtoactivity /*boolean*/ ) { 
RDebugUtils.currentLine=65208322;
 //BA.debugLineNum = 65208322;BA.debugLine="CallSubDelayed3(Me, \"SetDate\", date, UpdateLabel";
__c.CallSubDelayed3(ba,this,"SetDate",(Object)(_date),(Object)(_updatelabel));
RDebugUtils.currentLine=65208323;
 //BA.debugLineNum = 65208323;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=65208325;
 //BA.debugLineNum = 65208325;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=65208326;
 //BA.debugLineNum = 65208326;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=65208327;
 //BA.debugLineNum = 65208327;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date), UpdateLab";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date),_updatelabel);
RDebugUtils.currentLine=65208328;
 //BA.debugLineNum = 65208328;BA.debugLine="Years.SelectedIndex = year - minYear";
__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (__ref._year /*int*/ -__ref._minyear /*int*/ ));
RDebugUtils.currentLine=65208329;
 //BA.debugLineNum = 65208329;BA.debugLine="Months.SelectedIndex = month - 1";
__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (__ref._month /*int*/ -1));
RDebugUtils.currentLine=65208330;
 //BA.debugLineNum = 65208330;BA.debugLine="End Sub";
return "";
}
public String  _drawdays(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "drawdays", false))
	 {return ((String) Debug.delegate(ba, "drawdays", null));}
long _firstdayofmonth = 0L;
int _day = 0;
int _row = 0;
RDebugUtils.currentLine=65273856;
 //BA.debugLineNum = 65273856;BA.debugLine="Private Sub DrawDays";
RDebugUtils.currentLine=65273857;
 //BA.debugLineNum = 65273857;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=65273858;
 //BA.debugLineNum = 65273858;BA.debugLine="cvs.DrawColor(Colors.Transparent)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=65273859;
 //BA.debugLineNum = 65273859;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.SetDate(y";
_firstdayofmonth = (long) (_dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=65273860;
 //BA.debugLineNum = 65273860;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
__ref._dayofweekoffset /*int*/  = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-__ref._firstday /*int*/ )%7);
RDebugUtils.currentLine=65273861;
 //BA.debugLineNum = 65273861;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(ba,__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=65273862;
 //BA.debugLineNum = 65273862;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=65273864;
 //BA.debugLineNum = 65273864;BA.debugLine="DrawBox(cvs, selectedColor, (selectedDay - 1 + d";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )/(double)7));
 };
RDebugUtils.currentLine=65273867;
 //BA.debugLineNum = 65273867;BA.debugLine="For day = 1 To daysInMonth";
{
final int step9 = 1;
final int limit9 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit9 ;_day = _day + step9 ) {
RDebugUtils.currentLine=65273868;
 //BA.debugLineNum = 65273868;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=65273869;
 //BA.debugLineNum = 65273869;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawText(ba,BA.NumberToString(_day),(float) ((((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ),(float) ((_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ),__c.Typeface.DEFAULT_BOLD,__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize(),__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=65273872;
 //BA.debugLineNum = 65273872;BA.debugLine="DaysPanel.Invalidate";
__ref._dayspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=65273873;
 //BA.debugLineNum = 65273873;BA.debugLine="End Sub";
return "";
}
public String  _base_click(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "base_click", false))
	 {return ((String) Debug.delegate(ba, "base_click", null));}
RDebugUtils.currentLine=64946176;
 //BA.debugLineNum = 64946176;BA.debugLine="Sub Base_Click";
RDebugUtils.currentLine=64946177;
 //BA.debugLineNum = 64946177;BA.debugLine="CallSub(mTarget, mEventName & \"_Click\")";
__c.CallSubNew(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Click");
RDebugUtils.currentLine=64946178;
 //BA.debugLineNum = 64946178;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", null));}
RDebugUtils.currentLine=65929216;
 //BA.debugLineNum = 65929216;BA.debugLine="Public Sub btnCancel_Click";
RDebugUtils.currentLine=65929217;
 //BA.debugLineNum = 65929217;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", True, G";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.True),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=65929218;
 //BA.debugLineNum = 65929218;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=65929219;
 //BA.debugLineNum = 65929219;BA.debugLine="End Sub";
return "";
}
public long  _getdate(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "getdate", false))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=65142784;
 //BA.debugLineNum = 65142784;BA.debugLine="Public Sub GetDate As Long";
RDebugUtils.currentLine=65142785;
 //BA.debugLineNum = 65142785;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=65142786;
 //BA.debugLineNum = 65142786;BA.debugLine="End Sub";
return 0L;
}
public String  _hide(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "hide", false))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=65404928;
 //BA.debugLineNum = 65404928;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=65404929;
 //BA.debugLineNum = 65404929;BA.debugLine="holder.SetVisibleAnimated(500, False)";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetVisibleAnimated((int) (500),__c.False);
RDebugUtils.currentLine=65404931;
 //BA.debugLineNum = 65404931;BA.debugLine="End Sub";
return "";
}
public String  _btntoday_click(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "btntoday_click", false))
	 {return ((String) Debug.delegate(ba, "btntoday_click", null));}
RDebugUtils.currentLine=65863680;
 //BA.debugLineNum = 65863680;BA.debugLine="Private Sub btnToday_Click";
RDebugUtils.currentLine=65863681;
 //BA.debugLineNum = 65863681;BA.debugLine="SetDate(DateTime.Now, True)";
__ref._setdate /*String*/ (null,__c.DateTime.getNow(),__c.True);
RDebugUtils.currentLine=65863682;
 //BA.debugLineNum = 65863682;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False,";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.False),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=65863683;
 //BA.debugLineNum = 65863683;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=65863684;
 //BA.debugLineNum = 65863684;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
RDebugUtils.currentLine=64749568;
 //BA.debugLineNum = 64749568;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=64749569;
 //BA.debugLineNum = 64749569;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=64749570;
 //BA.debugLineNum = 64749570;BA.debugLine="Private cvs, cvsBackground As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsbackground = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=64749571;
 //BA.debugLineNum = 64749571;BA.debugLine="Private DaysPanel As Panel";
_dayspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=64749572;
 //BA.debugLineNum = 64749572;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=64749573;
 //BA.debugLineNum = 64749573;BA.debugLine="Private Months As Spinner";
_months = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=64749574;
 //BA.debugLineNum = 64749574;BA.debugLine="Private Years As Spinner";
_years = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=64749575;
 //BA.debugLineNum = 64749575;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=64749576;
 //BA.debugLineNum = 64749576;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=64749577;
 //BA.debugLineNum = 64749577;BA.debugLine="Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DO";
_action_up = (int) (1);
_action_move = (int) (2);
_action_down = (int) (0);
RDebugUtils.currentLine=64749578;
 //BA.debugLineNum = 64749578;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=64749579;
 //BA.debugLineNum = 64749579;BA.debugLine="Private DaysPanelBackground As Panel";
_dayspanelbackground = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=64749580;
 //BA.debugLineNum = 64749580;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=64749581;
 //BA.debugLineNum = 64749581;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=64749582;
 //BA.debugLineNum = 64749582;BA.debugLine="Private tempSelectedColor As Int";
_tempselectedcolor = 0;
RDebugUtils.currentLine=64749583;
 //BA.debugLineNum = 64749583;BA.debugLine="Private selectedColor As Int";
_selectedcolor = 0;
RDebugUtils.currentLine=64749584;
 //BA.debugLineNum = 64749584;BA.debugLine="Private lblSelectedDay As Label";
_lblselectedday = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749585;
 //BA.debugLineNum = 64749585;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=64749586;
 //BA.debugLineNum = 64749586;BA.debugLine="Private targetLabel As Label";
_targetlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749587;
 //BA.debugLineNum = 64749587;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=64749588;
 //BA.debugLineNum = 64749588;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749589;
 //BA.debugLineNum = 64749589;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749590;
 //BA.debugLineNum = 64749590;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749591;
 //BA.debugLineNum = 64749591;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749592;
 //BA.debugLineNum = 64749592;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749593;
 //BA.debugLineNum = 64749593;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749594;
 //BA.debugLineNum = 64749594;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64749595;
 //BA.debugLineNum = 64749595;BA.debugLine="Private daysNames() As Label";
_daysnames = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _daysnames.length;
for (int i0 = 0;i0 < d0;i0++) {
_daysnames[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=64749596;
 //BA.debugLineNum = 64749596;BA.debugLine="Private mTarget As Object";
_mtarget = new Object();
RDebugUtils.currentLine=64749597;
 //BA.debugLineNum = 64749597;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=64749598;
 //BA.debugLineNum = 64749598;BA.debugLine="Private waitForAddToActivity As Boolean";
_waitforaddtoactivity = false;
RDebugUtils.currentLine=64749599;
 //BA.debugLineNum = 64749599;BA.debugLine="Private minYear, maxYear, firstDay As Int";
_minyear = 0;
_maxyear = 0;
_firstday = 0;
RDebugUtils.currentLine=64749600;
 //BA.debugLineNum = 64749600;BA.debugLine="Private btnCancel, btnToday As Button";
_btncancel = new anywheresoftware.b4a.objects.ButtonWrapper();
_btntoday = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=64749602;
 //BA.debugLineNum = 64749602;BA.debugLine="Private InitialMapProp As Map";
_initialmapprop = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=64749604;
 //BA.debugLineNum = 64749604;BA.debugLine="End Sub";
return "";
}
public String  _dayspanel_touch(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "dayspanel_touch", false))
	 {return ((String) Debug.delegate(ba, "dayspanel_touch", new Object[] {_action,_x,_y}));}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
RDebugUtils.currentLine=65667072;
 //BA.debugLineNum = 65667072;BA.debugLine="Private Sub DaysPanel_Touch (ACTION As Int, X As F";
RDebugUtils.currentLine=65667073;
 //BA.debugLineNum = 65667073;BA.debugLine="Dim boxX = X / boxW, boxY = Y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=65667074;
 //BA.debugLineNum = 65667074;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=65667075;
 //BA.debugLineNum = 65667075;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=65667076;
 //BA.debugLineNum = 65667076;BA.debugLine="If ACTION = ACTION_DOWN Or ACTION = ACTION_MOVE T";
if (_action==__ref._action_down /*int*/  || _action==__ref._action_move /*int*/ ) { 
RDebugUtils.currentLine=65667077;
 //BA.debugLineNum = 65667077;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=65667078;
 //BA.debugLineNum = 65667078;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent) 'cle";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=65667079;
 //BA.debugLineNum = 65667079;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=65667080;
 //BA.debugLineNum = 65667080;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=65667081;
 //BA.debugLineNum = 65667081;BA.debugLine="DrawBox(cvsBackground, tempSelectedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ,__ref._tempselectedcolor /*int*/ ,_boxx,_boxy);
RDebugUtils.currentLine=65667082;
 //BA.debugLineNum = 65667082;BA.debugLine="lblSelectedDay.Text = newSelectedDay";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_newselectedday));
RDebugUtils.currentLine=65667083;
 //BA.debugLineNum = 65667083;BA.debugLine="lblSelectedDay.Visible = True";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=65667085;
 //BA.debugLineNum = 65667085;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=65667087;
 //BA.debugLineNum = 65667087;BA.debugLine="Else If ACTION = ACTION_UP Then";
if (_action==__ref._action_up /*int*/ ) { 
RDebugUtils.currentLine=65667088;
 //BA.debugLineNum = 65667088;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=65667089;
 //BA.debugLineNum = 65667089;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=65667090;
 //BA.debugLineNum = 65667090;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=65667091;
 //BA.debugLineNum = 65667091;BA.debugLine="SelectDay(newSelectedDay, True)";
__ref._selectday /*String*/ (null,_newselectedday,__c.True);
RDebugUtils.currentLine=65667092;
 //BA.debugLineNum = 65667092;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.False),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=65667093;
 //BA.debugLineNum = 65667093;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 };
 }}
;
RDebugUtils.currentLine=65667096;
 //BA.debugLineNum = 65667096;BA.debugLine="DaysPanelBackground.Invalidate";
__ref._dayspanelbackground /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=65667097;
 //BA.debugLineNum = 65667097;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "drawbox", false))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
RDebugUtils.currentLine=65601536;
 //BA.debugLineNum = 65601536;BA.debugLine="Private Sub DrawBox(c As Canvas, clr As Int, x As";
RDebugUtils.currentLine=65601537;
 //BA.debugLineNum = 65601537;BA.debugLine="Dim r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=65601538;
 //BA.debugLineNum = 65601538;BA.debugLine="r.Initialize(x * boxW, y * boxH, (x + 1) * boxW,";
_r.Initialize((int) (_x*__ref._boxw /*float*/ ),(int) (_y*__ref._boxh /*float*/ ),(int) ((_x+1)*__ref._boxw /*float*/ ),(int) ((_y+1)*__ref._boxh /*float*/ ));
RDebugUtils.currentLine=65601539;
 //BA.debugLineNum = 65601539;BA.debugLine="c.DrawRect(r, clr, True, 0)";
_c.DrawRect((android.graphics.Rect)(_r.getObject()),_clr,__c.True,(float) (0));
RDebugUtils.currentLine=65601540;
 //BA.debugLineNum = 65601540;BA.debugLine="End Sub";
return "";
}
public String  _selectday(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,int _day,boolean _updatelabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "selectday", false))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day,_updatelabel}));}
RDebugUtils.currentLine=65339392;
 //BA.debugLineNum = 65339392;BA.debugLine="Private Sub SelectDay(day As Int, UpdateLabel As B";
RDebugUtils.currentLine=65339393;
 //BA.debugLineNum = 65339393;BA.debugLine="selectedDate = DateUtils.SetDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=65339394;
 //BA.debugLineNum = 65339394;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=65339395;
 //BA.debugLineNum = 65339395;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=65339396;
 //BA.debugLineNum = 65339396;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=65339397;
 //BA.debugLineNum = 65339397;BA.debugLine="If UpdateLabel Then targetLabel.Text = DateTime.D";
if (_updatelabel) { 
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.DateTime.Date(__ref._selecteddate /*long*/ )));};
RDebugUtils.currentLine=65339398;
 //BA.debugLineNum = 65339398;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=64880640;
 //BA.debugLineNum = 64880640;BA.debugLine="Public Sub DesignerCreateView(Base As Panel, lbl A";
RDebugUtils.currentLine=64880641;
 //BA.debugLineNum = 64880641;BA.debugLine="Dim targetLabel As Label";
_targetlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=64880642;
 //BA.debugLineNum = 64880642;BA.debugLine="targetLabel.Initialize(\"lbl\")";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"lbl");
RDebugUtils.currentLine=64880643;
 //BA.debugLineNum = 64880643;BA.debugLine="targetLabel.TextSize = lbl.TextSize";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize(_lbl.getTextSize());
RDebugUtils.currentLine=64880644;
 //BA.debugLineNum = 64880644;BA.debugLine="targetLabel.TextColor = lbl.TextColor";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_lbl.getTextColor());
RDebugUtils.currentLine=64880645;
 //BA.debugLineNum = 64880645;BA.debugLine="Base.AddView(targetLabel, 0, 0, Base.Width, Base.";
_base.AddView((android.view.View)(__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (0),_base.getWidth(),_base.getHeight());
RDebugUtils.currentLine=64880646;
 //BA.debugLineNum = 64880646;BA.debugLine="Base.Color = Colors.Transparent";
_base.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=64880647;
 //BA.debugLineNum = 64880647;BA.debugLine="waitForAddToActivity = True";
__ref._waitforaddtoactivity /*boolean*/  = __c.True;
RDebugUtils.currentLine=64880650;
 //BA.debugLineNum = 64880650;BA.debugLine="InitialMapProp = props";
__ref._initialmapprop /*anywheresoftware.b4a.objects.collections.Map*/  = _props;
RDebugUtils.currentLine=64880651;
 //BA.debugLineNum = 64880651;BA.debugLine="CallSubDelayed2(Me, \"AfterLoadLayout\", props)";
__c.CallSubDelayed2(ba,this,"AfterLoadLayout",(Object)(_props));
RDebugUtils.currentLine=64880652;
 //BA.debugLineNum = 64880652;BA.debugLine="End Sub";
return "";
}
public String  _disable(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "disable", false))
	 {return ((String) Debug.delegate(ba, "disable", null));}
RDebugUtils.currentLine=65536000;
 //BA.debugLineNum = 65536000;BA.debugLine="Public Sub Disable";
RDebugUtils.currentLine=65536001;
 //BA.debugLineNum = 65536001;BA.debugLine="If waitForAddToActivity Then";
if (__ref._waitforaddtoactivity /*boolean*/ ) { 
RDebugUtils.currentLine=65536002;
 //BA.debugLineNum = 65536002;BA.debugLine="CallSubDelayed(Me, \"Disable\")";
__c.CallSubDelayed(ba,this,"Disable");
RDebugUtils.currentLine=65536003;
 //BA.debugLineNum = 65536003;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=65536005;
 //BA.debugLineNum = 65536005;BA.debugLine="holder.Enabled = False";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=65536006;
 //BA.debugLineNum = 65536006;BA.debugLine="End Sub";
return "";
}
public String  _enable(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "enable", false))
	 {return ((String) Debug.delegate(ba, "enable", null));}
RDebugUtils.currentLine=65470464;
 //BA.debugLineNum = 65470464;BA.debugLine="Public Sub Enable";
RDebugUtils.currentLine=65470465;
 //BA.debugLineNum = 65470465;BA.debugLine="If waitForAddToActivity Then";
if (__ref._waitforaddtoactivity /*boolean*/ ) { 
RDebugUtils.currentLine=65470466;
 //BA.debugLineNum = 65470466;BA.debugLine="CallSubDelayed(Me, \"Enable\")";
__c.CallSubDelayed(ba,this,"Enable");
RDebugUtils.currentLine=65470467;
 //BA.debugLineNum = 65470467;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=65470469;
 //BA.debugLineNum = 65470469;BA.debugLine="holder.Enabled = True";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=65470470;
 //BA.debugLineNum = 65470470;BA.debugLine="End Sub";
return "";
}
public String  _holder_click(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "holder_click", false))
	 {return ((String) Debug.delegate(ba, "holder_click", null));}
RDebugUtils.currentLine=66191360;
 //BA.debugLineNum = 66191360;BA.debugLine="Private Sub holder_Click";
RDebugUtils.currentLine=66191361;
 //BA.debugLineNum = 66191361;BA.debugLine="btnCancel_Click";
__ref._btncancel_click /*String*/ (null);
RDebugUtils.currentLine=66191362;
 //BA.debugLineNum = 66191362;BA.debugLine="End Sub";
return "";
}
public String  _initialize(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,anywheresoftware.b4a.BA _ba,Object _target,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_target,_eventname}));}
RDebugUtils.currentLine=64815104;
 //BA.debugLineNum = 64815104;BA.debugLine="Public Sub Initialize (Target As Object, EventName";
RDebugUtils.currentLine=64815105;
 //BA.debugLineNum = 64815105;BA.debugLine="mTarget = Target";
__ref._mtarget /*Object*/  = _target;
RDebugUtils.currentLine=64815106;
 //BA.debugLineNum = 64815106;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=64815107;
 //BA.debugLineNum = 64815107;BA.debugLine="End Sub";
return "";
}
public boolean  _isvisible(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "isvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isvisible", null));}
RDebugUtils.currentLine=66125824;
 //BA.debugLineNum = 66125824;BA.debugLine="Public Sub IsVisible As Boolean";
RDebugUtils.currentLine=66125825;
 //BA.debugLineNum = 66125825;BA.debugLine="Return holder.Visible";
if (true) return __ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=66125826;
 //BA.debugLineNum = 66125826;BA.debugLine="End Sub";
return false;
}
public String  _lbl_click(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "lbl_click", false))
	 {return ((String) Debug.delegate(ba, "lbl_click", null));}
RDebugUtils.currentLine=65011712;
 //BA.debugLineNum = 65011712;BA.debugLine="Private Sub lbl_Click";
RDebugUtils.currentLine=65011713;
 //BA.debugLineNum = 65011713;BA.debugLine="Show";
__ref._show /*String*/ (null);
RDebugUtils.currentLine=65011714;
 //BA.debugLineNum = 65011714;BA.debugLine="End Sub";
return "";
}
public String  _show(xevolution.vrcg.devdemov2400.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=65732608;
 //BA.debugLineNum = 65732608;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=65732609;
 //BA.debugLineNum = 65732609;BA.debugLine="If waitForAddToActivity Then";
if (__ref._waitforaddtoactivity /*boolean*/ ) { 
RDebugUtils.currentLine=65732611;
 //BA.debugLineNum = 65732611;BA.debugLine="CallSubDelayed(Me, \"show\")";
__c.CallSubDelayed(ba,this,"show");
RDebugUtils.currentLine=65732612;
 //BA.debugLineNum = 65732612;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=65732614;
 //BA.debugLineNum = 65732614;BA.debugLine="holder.SetVisibleAnimated(500, True)";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetVisibleAnimated((int) (500),__c.True);
RDebugUtils.currentLine=65732615;
 //BA.debugLineNum = 65732615;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=65732616;
 //BA.debugLineNum = 65732616;BA.debugLine="End Sub";
return "";
}
public String  _months_itemclick(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "months_itemclick", false))
	 {return ((String) Debug.delegate(ba, "months_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=65994752;
 //BA.debugLineNum = 65994752;BA.debugLine="Private Sub Months_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=65994753;
 //BA.debugLineNum = 65994753;BA.debugLine="month = Position + 1";
__ref._month /*int*/  = (int) (_position+1);
RDebugUtils.currentLine=65994754;
 //BA.debugLineNum = 65994754;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=65994755;
 //BA.debugLineNum = 65994755;BA.debugLine="End Sub";
return "";
}
public String  _showonthispanel(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "showonthispanel", false))
	 {return ((String) Debug.delegate(ba, "showonthispanel", new Object[] {_pnl}));}
RDebugUtils.currentLine=65798144;
 //BA.debugLineNum = 65798144;BA.debugLine="Public Sub ShowOnThisPanel(pnl As Panel)";
RDebugUtils.currentLine=65798145;
 //BA.debugLineNum = 65798145;BA.debugLine="holder = pnl";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/  = _pnl;
RDebugUtils.currentLine=65798147;
 //BA.debugLineNum = 65798147;BA.debugLine="CallSubDelayed(Me, \"show\")";
__c.CallSubDelayed(ba,this,"show");
RDebugUtils.currentLine=65798148;
 //BA.debugLineNum = 65798148;BA.debugLine="End Sub";
return "";
}
public String  _years_itemclick(xevolution.vrcg.devdemov2400.anotherdatepicker __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "years_itemclick", false))
	 {return ((String) Debug.delegate(ba, "years_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=66060288;
 //BA.debugLineNum = 66060288;BA.debugLine="Private Sub Years_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=66060289;
 //BA.debugLineNum = 66060289;BA.debugLine="year = Value";
__ref._year /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=66060290;
 //BA.debugLineNum = 66060290;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=66060291;
 //BA.debugLineNum = 66060291;BA.debugLine="End Sub";
return "";
}
}