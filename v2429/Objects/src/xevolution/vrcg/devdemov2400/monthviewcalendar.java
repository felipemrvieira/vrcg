package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class monthviewcalendar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.monthviewcalendar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.monthviewcalendar.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public int _panelminheight = 0;
public int _action_up = 0;
public int _action_move = 0;
public int _action_down = 0;
public anywheresoftware.b4a.objects.PanelWrapper _titlepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _monthpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _weekpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _cellspanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _cellspanelback = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _months = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _years = null;
public boolean _waitforaddtoactivity = false;
public int _generalradius = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsbackground = null;
public int _month = 0;
public int _year = 0;
public int _lmonth = 0;
public int _lyear = 0;
public int _tempselectedday = 0;
public anywheresoftware.b4a.objects.LabelWrapper _targetlabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblselectedday = null;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public int _tempselectedcolor = 0;
public int _selectedcolor = 0;
public int _minyear = 0;
public int _maxyear = 0;
public int _firstday = 0;
public long _selecteddate = 0L;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public anywheresoftware.b4a.objects.collections.List _yearslist = null;
public anywheresoftware.b4a.objects.collections.List _monthlist = null;
public anywheresoftware.b4a.objects.collections.Map _innermaps = null;
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
public String  _addlabel(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.PanelWrapper _dest,String _txt,int _align,int _bkcol,int _forcol) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "addlabel", false))
	 {return ((String) Debug.delegate(ba, "addlabel", new Object[] {_dest,_txt,_align,_bkcol,_forcol}));}
RDebugUtils.currentLine=145293312;
 //BA.debugLineNum = 145293312;BA.debugLine="Sub AddLabel(dest As Panel, txt As String, align A";
RDebugUtils.currentLine=145293313;
 //BA.debugLineNum = 145293313;BA.debugLine="Log($\"AddLabel --> ${txt}, ${dest.Width}:${dest.H";
__c.LogImpl("6145293313",("AddLabel --> "+__c.SmartStringFormatter("",(Object)(_txt))+", "+__c.SmartStringFormatter("",(Object)(_dest.getWidth()))+":"+__c.SmartStringFormatter("",(Object)(_dest.getHeight()))+""),0);
RDebugUtils.currentLine=145293314;
 //BA.debugLineNum = 145293314;BA.debugLine="dest.AddView(LabelMake(txt, align, bkcol, forcol,";
_dest.AddView((android.view.View)(__ref._labelmake /*anywheresoftware.b4a.objects.LabelWrapper*/ (null,_txt,_align,_bkcol,_forcol,_dest.getWidth(),_dest.getHeight()).getObject()),(int) (0),(int) (0),_dest.getWidth(),_dest.getHeight());
RDebugUtils.currentLine=145293315;
 //BA.debugLineNum = 145293315;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.LabelWrapper  _labelmake(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,String _txt,int _align,int _bkcol,int _forcol,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "labelmake", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper) Debug.delegate(ba, "labelmake", new Object[] {_txt,_align,_bkcol,_forcol,_width,_height}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tpf = null;
RDebugUtils.currentLine=145227776;
 //BA.debugLineNum = 145227776;BA.debugLine="Sub LabelMake(txt As String, align As Int, bkcol A";
RDebugUtils.currentLine=145227777;
 //BA.debugLineNum = 145227777;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=145227778;
 //BA.debugLineNum = 145227778;BA.debugLine="Dim tpf As Typeface = Typeface.CreateNew(Typeface";
_tpf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_tpf = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.CreateNew(__c.Typeface.DEFAULT,__c.Typeface.STYLE_BOLD)));
RDebugUtils.currentLine=145227779;
 //BA.debugLineNum = 145227779;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=145227780;
 //BA.debugLineNum = 145227780;BA.debugLine="lbl.Width = width";
_lbl.setWidth(_width);
RDebugUtils.currentLine=145227781;
 //BA.debugLineNum = 145227781;BA.debugLine="lbl.Height = height";
_lbl.setHeight(_height);
RDebugUtils.currentLine=145227782;
 //BA.debugLineNum = 145227782;BA.debugLine="lbl.SetColorAnimated(0,bkcol, bkcol)";
_lbl.SetColorAnimated((int) (0),_bkcol,_bkcol);
RDebugUtils.currentLine=145227783;
 //BA.debugLineNum = 145227783;BA.debugLine="lbl.TextColor = forcol";
_lbl.setTextColor(_forcol);
RDebugUtils.currentLine=145227784;
 //BA.debugLineNum = 145227784;BA.debugLine="lbl.Text = txt";
_lbl.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=145227785;
 //BA.debugLineNum = 145227785;BA.debugLine="lbl.Typeface = tpf";
_lbl.setTypeface((android.graphics.Typeface)(_tpf.getObject()));
RDebugUtils.currentLine=145227786;
 //BA.debugLineNum = 145227786;BA.debugLine="lbl.Gravity= align";
_lbl.setGravity(_align);
RDebugUtils.currentLine=145227787;
 //BA.debugLineNum = 145227787;BA.debugLine="Return lbl";
if (true) return _lbl;
RDebugUtils.currentLine=145227788;
 //BA.debugLineNum = 145227788;BA.debugLine="End Sub";
return null;
}
public String  _addlabelpos(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.PanelWrapper _dest,String _txt,int _align,int _bkcol,int _forcol,int _left,int _right,int _brd,int _brdcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "addlabelpos", false))
	 {return ((String) Debug.delegate(ba, "addlabelpos", new Object[] {_dest,_txt,_align,_bkcol,_forcol,_left,_right,_brd,_brdcolor}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=145358848;
 //BA.debugLineNum = 145358848;BA.debugLine="Sub AddLabelPos(dest As Panel, txt As String, alig";
RDebugUtils.currentLine=145358849;
 //BA.debugLineNum = 145358849;BA.debugLine="Log($\"AddLabelPOS --> ${txt}, ${left}:${right}\"$)";
__c.LogImpl("6145358849",("AddLabelPOS --> "+__c.SmartStringFormatter("",(Object)(_txt))+", "+__c.SmartStringFormatter("",(Object)(_left))+":"+__c.SmartStringFormatter("",(Object)(_right))+""),0);
RDebugUtils.currentLine=145358850;
 //BA.debugLineNum = 145358850;BA.debugLine="Dim lbl As Label = LabelMake(txt, align, bkcol, f";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = __ref._labelmake /*anywheresoftware.b4a.objects.LabelWrapper*/ (null,_txt,_align,_bkcol,_forcol,(int) (_right-_left),_dest.getHeight());
RDebugUtils.currentLine=145358851;
 //BA.debugLineNum = 145358851;BA.debugLine="If brd >= 1 Then";
if (_brd>=1) { 
RDebugUtils.currentLine=145358852;
 //BA.debugLineNum = 145358852;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=145358853;
 //BA.debugLineNum = 145358853;BA.debugLine="cd.Initialize2(Colors.Transparent, GeneralRadius";
_cd.Initialize2(__c.Colors.Transparent,__ref._generalradius /*int*/ ,_brd,_brdcolor);
RDebugUtils.currentLine=145358854;
 //BA.debugLineNum = 145358854;BA.debugLine="lbl.Background = cd";
_lbl.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 };
RDebugUtils.currentLine=145358856;
 //BA.debugLineNum = 145358856;BA.debugLine="dest.AddView(lbl, left, 0, right-left, dest.Heigh";
_dest.AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),(int) (_right-_left),_dest.getHeight());
RDebugUtils.currentLine=145358857;
 //BA.debugLineNum = 145358857;BA.debugLine="End Sub";
return "";
}
public String  _addlist(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.PanelWrapper _dest,String _name,String _values,int _index,int _align,int _bkcol,int _forcol) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "addlist", false))
	 {return ((String) Debug.delegate(ba, "addlist", new Object[] {_dest,_name,_values,_index,_align,_bkcol,_forcol}));}
anywheresoftware.b4a.objects.SpinnerWrapper _spn = null;
anywheresoftware.b4a.objects.collections.List _arrval = null;
int _i = 0;
RDebugUtils.currentLine=145424384;
 //BA.debugLineNum = 145424384;BA.debugLine="Sub AddList(dest As Panel, name As String, values";
RDebugUtils.currentLine=145424385;
 //BA.debugLineNum = 145424385;BA.debugLine="Dim spn As Spinner";
_spn = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=145424386;
 //BA.debugLineNum = 145424386;BA.debugLine="If (name.ToLowerCase = \"cmbboxmonth\") Then";
if (((_name.toLowerCase()).equals("cmbboxmonth"))) { 
RDebugUtils.currentLine=145424387;
 //BA.debugLineNum = 145424387;BA.debugLine="MonthList.Initialize";
__ref._monthlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=145424388;
 //BA.debugLineNum = 145424388;BA.debugLine="Months.Initialize(\"Months\")";
__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Initialize(ba,"Months");
RDebugUtils.currentLine=145424389;
 //BA.debugLineNum = 145424389;BA.debugLine="spn = Months";
_spn = __ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ ;
 }else {
RDebugUtils.currentLine=145424391;
 //BA.debugLineNum = 145424391;BA.debugLine="YearsList.Initialize";
__ref._yearslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=145424392;
 //BA.debugLineNum = 145424392;BA.debugLine="Years.Initialize(\"Years\")";
__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Initialize(ba,"Years");
RDebugUtils.currentLine=145424393;
 //BA.debugLineNum = 145424393;BA.debugLine="spn = Years";
_spn = __ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ ;
 };
RDebugUtils.currentLine=145424395;
 //BA.debugLineNum = 145424395;BA.debugLine="spn.Color = bkcol";
_spn.setColor(_bkcol);
RDebugUtils.currentLine=145424396;
 //BA.debugLineNum = 145424396;BA.debugLine="spn.TextColor = forcol";
_spn.setTextColor(_forcol);
RDebugUtils.currentLine=145424399;
 //BA.debugLineNum = 145424399;BA.debugLine="Dim arrVal As List = Regex.Split(\"\\|\", values)";
_arrval = new anywheresoftware.b4a.objects.collections.List();
_arrval = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|",_values));
RDebugUtils.currentLine=145424400;
 //BA.debugLineNum = 145424400;BA.debugLine="For i = 0 To arrVal.Size-1";
{
final int step14 = 1;
final int limit14 = (int) (_arrval.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=145424401;
 //BA.debugLineNum = 145424401;BA.debugLine="spn.Add(arrVal.Get(i))";
_spn.Add(BA.ObjectToString(_arrval.Get(_i)));
RDebugUtils.currentLine=145424402;
 //BA.debugLineNum = 145424402;BA.debugLine="If (name.ToLowerCase = \"cmbboxmonth\") Then";
if (((_name.toLowerCase()).equals("cmbboxmonth"))) { 
RDebugUtils.currentLine=145424403;
 //BA.debugLineNum = 145424403;BA.debugLine="MonthList.Add(arrVal.Get(i))";
__ref._monthlist /*anywheresoftware.b4a.objects.collections.List*/ .Add(_arrval.Get(_i));
 }else {
RDebugUtils.currentLine=145424405;
 //BA.debugLineNum = 145424405;BA.debugLine="YearsList.Add(arrVal.Get(i))";
__ref._yearslist /*anywheresoftware.b4a.objects.collections.List*/ .Add(_arrval.Get(_i));
 };
 }
};
RDebugUtils.currentLine=145424409;
 //BA.debugLineNum = 145424409;BA.debugLine="spn.SelectedIndex = index";
_spn.setSelectedIndex(_index);
RDebugUtils.currentLine=145424411;
 //BA.debugLineNum = 145424411;BA.debugLine="If align = 0 Then";
if (_align==0) { 
RDebugUtils.currentLine=145424412;
 //BA.debugLineNum = 145424412;BA.debugLine="dest.AddView(spn, 0, 0, dest.Width/2, dest.Heigh";
_dest.AddView((android.view.View)(_spn.getObject()),(int) (0),(int) (0),(int) (_dest.getWidth()/(double)2),_dest.getHeight());
 }else {
RDebugUtils.currentLine=145424414;
 //BA.debugLineNum = 145424414;BA.debugLine="dest.AddView(spn, dest.Width/2, 0, dest.Width/2,";
_dest.AddView((android.view.View)(_spn.getObject()),(int) (_dest.getWidth()/(double)2),(int) (0),(int) (_dest.getWidth()/(double)2),_dest.getHeight());
 };
RDebugUtils.currentLine=145424416;
 //BA.debugLineNum = 145424416;BA.debugLine="End Sub";
return "";
}
public String  _afterloadlayout(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "afterloadlayout", false))
	 {return ((String) Debug.delegate(ba, "afterloadlayout", new Object[] {_props}));}
RDebugUtils.currentLine=144506880;
 //BA.debugLineNum = 144506880;BA.debugLine="Public Sub AfterLoadLayout (Props As Map)";
RDebugUtils.currentLine=144506881;
 //BA.debugLineNum = 144506881;BA.debugLine="Log(\"***************** AFTER LOAD LAYOUT ********";
__c.LogImpl("6144506881","***************** AFTER LOAD LAYOUT *****************",0);
RDebugUtils.currentLine=144506882;
 //BA.debugLineNum = 144506882;BA.debugLine="waitForAddToActivity = False";
__ref._waitforaddtoactivity /*boolean*/  = __c.False;
RDebugUtils.currentLine=144506883;
 //BA.debugLineNum = 144506883;BA.debugLine="GeneralRadius = Props.Get(\"GeneralRadius\")";
__ref._generalradius /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("GeneralRadius"))));
RDebugUtils.currentLine=144506885;
 //BA.debugLineNum = 144506885;BA.debugLine="month = GetCurrentMonth";
__ref._month /*int*/  = __ref._getcurrentmonth /*int*/ (null);
RDebugUtils.currentLine=144506886;
 //BA.debugLineNum = 144506886;BA.debugLine="year = GetCurrentYear";
__ref._year /*int*/  = __ref._getcurrentyear /*int*/ (null);
RDebugUtils.currentLine=144506887;
 //BA.debugLineNum = 144506887;BA.debugLine="InitializeComponents";
__ref._initializecomponents /*String*/ (null);
RDebugUtils.currentLine=144506888;
 //BA.debugLineNum = 144506888;BA.debugLine="If SetDimensions(Props) Then";
if (__ref._setdimensions /*boolean*/ (null,_props)) { 
RDebugUtils.currentLine=144506889;
 //BA.debugLineNum = 144506889;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=144506890;
 //BA.debugLineNum = 144506890;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=144506891;
 //BA.debugLineNum = 144506891;BA.debugLine="cvs.Initialize(CellsPanel)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=144506893;
 //BA.debugLineNum = 144506893;BA.debugLine="vCorrection = cvs.MeasureStringHeight(\"1\", Typef";
__ref._vcorrection /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringHeight("1",__c.Typeface.DEFAULT_BOLD,(float)(BA.ObjectToNumber(_props.Get((Object)("CellFontSize")))))/(double)2);
RDebugUtils.currentLine=144506894;
 //BA.debugLineNum = 144506894;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
if (BA.ObjectToBoolean((_props.Get((Object)("ShowWeekNumber"))))) { 
RDebugUtils.currentLine=144506895;
 //BA.debugLineNum = 144506895;BA.debugLine="boxW = cvs.Bitmap.Width / 8";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getWidth()/(double)8);
 }else {
RDebugUtils.currentLine=144506897;
 //BA.debugLineNum = 144506897;BA.debugLine="boxW = cvs.Bitmap.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getWidth()/(double)7);
 };
RDebugUtils.currentLine=144506899;
 //BA.debugLineNum = 144506899;BA.debugLine="boxH = cvs.Bitmap.Height / 7";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getHeight()/(double)7);
RDebugUtils.currentLine=144506900;
 //BA.debugLineNum = 144506900;BA.debugLine="cvsBackground.Initialize(CellsPanelBack)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=144506901;
 //BA.debugLineNum = 144506901;BA.debugLine="innerMaps = Props";
__ref._innermaps /*anywheresoftware.b4a.objects.collections.Map*/  = _props;
RDebugUtils.currentLine=144506902;
 //BA.debugLineNum = 144506902;BA.debugLine="DrawDays(innerMaps)";
__ref._drawdays /*String*/ (null,__ref._innermaps /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=144506904;
 //BA.debugLineNum = 144506904;BA.debugLine="End Sub";
return "";
}
public int  _getcurrentmonth(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "getcurrentmonth", false))
	 {return ((Integer) Debug.delegate(ba, "getcurrentmonth", null));}
RDebugUtils.currentLine=145817600;
 //BA.debugLineNum = 145817600;BA.debugLine="Sub GetCurrentMonth As Int";
RDebugUtils.currentLine=145817601;
 //BA.debugLineNum = 145817601;BA.debugLine="DateTime.DateFormat = \"MM\"";
__c.DateTime.setDateFormat("MM");
RDebugUtils.currentLine=145817602;
 //BA.debugLineNum = 145817602;BA.debugLine="Return DateTime.Date(DateTime.Now)";
if (true) return (int)(Double.parseDouble(__c.DateTime.Date(__c.DateTime.getNow())));
RDebugUtils.currentLine=145817603;
 //BA.debugLineNum = 145817603;BA.debugLine="End Sub";
return 0;
}
public int  _getcurrentyear(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "getcurrentyear", false))
	 {return ((Integer) Debug.delegate(ba, "getcurrentyear", null));}
RDebugUtils.currentLine=145883136;
 //BA.debugLineNum = 145883136;BA.debugLine="Sub GetCurrentYear As Int";
RDebugUtils.currentLine=145883137;
 //BA.debugLineNum = 145883137;BA.debugLine="DateTime.DateFormat = \"yyyy\"";
__c.DateTime.setDateFormat("yyyy");
RDebugUtils.currentLine=145883138;
 //BA.debugLineNum = 145883138;BA.debugLine="Return DateTime.Date(DateTime.Now)";
if (true) return (int)(Double.parseDouble(__c.DateTime.Date(__c.DateTime.getNow())));
RDebugUtils.currentLine=145883139;
 //BA.debugLineNum = 145883139;BA.debugLine="End Sub";
return 0;
}
public String  _initializecomponents(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "initializecomponents", false))
	 {return ((String) Debug.delegate(ba, "initializecomponents", null));}
RDebugUtils.currentLine=144572416;
 //BA.debugLineNum = 144572416;BA.debugLine="Sub InitializeComponents";
RDebugUtils.currentLine=144572417;
 //BA.debugLineNum = 144572417;BA.debugLine="Log(\"***************** INITIALIZE COMPONENTS ****";
__c.LogImpl("6144572417","***************** INITIALIZE COMPONENTS *****************",0);
RDebugUtils.currentLine=144572418;
 //BA.debugLineNum = 144572418;BA.debugLine="TitlePanel.Initialize(\"TitlePanel\")";
__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"TitlePanel");
RDebugUtils.currentLine=144572419;
 //BA.debugLineNum = 144572419;BA.debugLine="MonthPanel.Initialize(\"MonthPanel\")";
__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"MonthPanel");
RDebugUtils.currentLine=144572420;
 //BA.debugLineNum = 144572420;BA.debugLine="WeekPanel.Initialize(\"WeekPanel\")";
__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"WeekPanel");
RDebugUtils.currentLine=144572421;
 //BA.debugLineNum = 144572421;BA.debugLine="CellsPanel.Initialize(\"CellsPanel\")";
__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"CellsPanel");
RDebugUtils.currentLine=144572422;
 //BA.debugLineNum = 144572422;BA.debugLine="CellsPanelBack.Initialize(\"CellsPanelBack\")";
__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"CellsPanelBack");
RDebugUtils.currentLine=144572423;
 //BA.debugLineNum = 144572423;BA.debugLine="targetLabel.Initialize(\"targetLabel\")";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"targetLabel");
RDebugUtils.currentLine=144572424;
 //BA.debugLineNum = 144572424;BA.debugLine="lblSelectedDay.Initialize(\"\")";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=144572425;
 //BA.debugLineNum = 144572425;BA.debugLine="End Sub";
return "";
}
public boolean  _setdimensions(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "setdimensions", false))
	 {return ((Boolean) Debug.delegate(ba, "setdimensions", new Object[] {_props}));}
int _aligncenter = 0;
int _nexttop = 0;
int _nextleft = 0;
String _syears = "";
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
int _columns = 0;
int _blleft = 0;
int _blocks = 0;
String _wdays = "";
anywheresoftware.b4a.objects.collections.List _nameslist = null;
int _i = 0;
String _n = "";
RDebugUtils.currentLine=144637952;
 //BA.debugLineNum = 144637952;BA.debugLine="Sub SetDimensions(Props As Map) As Boolean";
RDebugUtils.currentLine=144637953;
 //BA.debugLineNum = 144637953;BA.debugLine="Log(\"***************** SET DIMENSIONS ***********";
__c.LogImpl("6144637953","***************** SET DIMENSIONS *****************",0);
RDebugUtils.currentLine=144637954;
 //BA.debugLineNum = 144637954;BA.debugLine="Dim AlignCenter As Int = Bit.Or(Gravity.CENTER, G";
_aligncenter = __c.Bit.Or(__c.Gravity.CENTER,__c.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=144637955;
 //BA.debugLineNum = 144637955;BA.debugLine="Dim NextTop As Int = 0, NextLeft As Int = 0";
_nexttop = (int) (0);
_nextleft = (int) (0);
RDebugUtils.currentLine=144637956;
 //BA.debugLineNum = 144637956;BA.debugLine="If (Props.Get(\"ShowTitle\")) Then";
if (BA.ObjectToBoolean((_props.Get((Object)("ShowTitle"))))) { 
RDebugUtils.currentLine=144637957;
 //BA.debugLineNum = 144637957;BA.debugLine="TitlePanel.Top = NextTop";
__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_nexttop);
RDebugUtils.currentLine=144637958;
 //BA.debugLineNum = 144637958;BA.debugLine="TitlePanel.Left = NextLeft";
__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_nextleft);
RDebugUtils.currentLine=144637959;
 //BA.debugLineNum = 144637959;BA.debugLine="TitlePanel.Width = mBase.Width";
__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=144637960;
 //BA.debugLineNum = 144637960;BA.debugLine="TitlePanel.Height = PanelMinHeight";
__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._panelminheight /*int*/ );
RDebugUtils.currentLine=144637961;
 //BA.debugLineNum = 144637961;BA.debugLine="TitlePanel.Color = Props.Get(\"TitleBackColor\") '";
__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor((int)(BA.ObjectToNumber(_props.Get((Object)("TitleBackColor")))));
RDebugUtils.currentLine=144637962;
 //BA.debugLineNum = 144637962;BA.debugLine="AddLabel(TitlePanel, Props.Get(\"Title\"), AlignCe";
__ref._addlabel /*String*/ (null,__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ ,BA.ObjectToString(_props.Get((Object)("Title"))),_aligncenter,(int)(BA.ObjectToNumber(_props.Get((Object)("TitleBackColor")))),(int)(BA.ObjectToNumber(_props.Get((Object)("TitleFontColor")))));
RDebugUtils.currentLine=144637963;
 //BA.debugLineNum = 144637963;BA.debugLine="mBase.AddView(TitlePanel, NextLeft, NextTop, Tit";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_nextleft,_nexttop,__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._titlepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=144637964;
 //BA.debugLineNum = 144637964;BA.debugLine="NextTop = NextTop + PanelMinHeight";
_nexttop = (int) (_nexttop+__ref._panelminheight /*int*/ );
RDebugUtils.currentLine=144637965;
 //BA.debugLineNum = 144637965;BA.debugLine="Log(Props.Get(\"ShowTitle\"))";
__c.LogImpl("6144637965",BA.ObjectToString(_props.Get((Object)("ShowTitle"))),0);
RDebugUtils.currentLine=144637966;
 //BA.debugLineNum = 144637966;BA.debugLine="Log(Props.Get(\"Title\"))";
__c.LogImpl("6144637966",BA.ObjectToString(_props.Get((Object)("Title"))),0);
 };
RDebugUtils.currentLine=144637969;
 //BA.debugLineNum = 144637969;BA.debugLine="MonthPanel.Top = NextTop";
__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_nexttop);
RDebugUtils.currentLine=144637970;
 //BA.debugLineNum = 144637970;BA.debugLine="MonthPanel.Left = NextLeft";
__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_nextleft);
RDebugUtils.currentLine=144637971;
 //BA.debugLineNum = 144637971;BA.debugLine="MonthPanel.Width = mBase.Width";
__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=144637972;
 //BA.debugLineNum = 144637972;BA.debugLine="MonthPanel.Height = PanelMinHeight";
__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._panelminheight /*int*/ );
RDebugUtils.currentLine=144637973;
 //BA.debugLineNum = 144637973;BA.debugLine="MonthPanel.Color = Props.Get(\"MonthBackColor\")";
__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor((int)(BA.ObjectToNumber(_props.Get((Object)("MonthBackColor")))));
RDebugUtils.currentLine=144637974;
 //BA.debugLineNum = 144637974;BA.debugLine="AddList(MonthPanel, \"cmbboxMonth\", Props.Get(\"Mon";
__ref._addlist /*String*/ (null,__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ ,"cmbboxMonth",BA.ObjectToString(_props.Get((Object)("MonthNames"))),(int) (__ref._getcurrentmonth /*int*/ (null)-1),(int) (0),(int)(BA.ObjectToNumber(_props.Get((Object)("MonthBackColor")))),(int)(BA.ObjectToNumber(_props.Get((Object)("MonthFontColor")))));
RDebugUtils.currentLine=144637975;
 //BA.debugLineNum = 144637975;BA.debugLine="Dim sYears As String = GenerateListString(1970,21";
_syears = __ref._generateliststring /*String*/ (null,(int) (1970),(int) (2100));
RDebugUtils.currentLine=144637976;
 //BA.debugLineNum = 144637976;BA.debugLine="AddList(MonthPanel, \"cmbboxYear\", sYears, GetValu";
__ref._addlist /*String*/ (null,__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ ,"cmbboxYear",_syears,__ref._getvalueposition /*int*/ (null,_syears,BA.NumberToString(__ref._getcurrentyear /*int*/ (null))),(int) (1),(int)(BA.ObjectToNumber(_props.Get((Object)("MonthBackColor")))),(int)(BA.ObjectToNumber(_props.Get((Object)("MonthFontColor")))));
RDebugUtils.currentLine=144637978;
 //BA.debugLineNum = 144637978;BA.debugLine="mBase.AddView(MonthPanel, NextLeft, NextTop, Mont";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_nextleft,_nexttop,__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._monthpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=144637979;
 //BA.debugLineNum = 144637979;BA.debugLine="NextTop = NextTop + PanelMinHeight";
_nexttop = (int) (_nexttop+__ref._panelminheight /*int*/ );
RDebugUtils.currentLine=144637980;
 //BA.debugLineNum = 144637980;BA.debugLine="Log(Props.Get(\"MonthNames\"))";
__c.LogImpl("6144637980",BA.ObjectToString(_props.Get((Object)("MonthNames"))),0);
RDebugUtils.currentLine=144637982;
 //BA.debugLineNum = 144637982;BA.debugLine="Dim et As EditText";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=144637983;
 //BA.debugLineNum = 144637983;BA.debugLine="et.Initialize(\"\")";
_et.Initialize(ba,"");
RDebugUtils.currentLine=144637984;
 //BA.debugLineNum = 144637984;BA.debugLine="targetLabel.Background = et.Background";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground(_et.getBackground());
RDebugUtils.currentLine=144637986;
 //BA.debugLineNum = 144637986;BA.debugLine="WeekPanel.Top = NextTop";
__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_nexttop);
RDebugUtils.currentLine=144637987;
 //BA.debugLineNum = 144637987;BA.debugLine="WeekPanel.Left = NextLeft";
__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_nextleft);
RDebugUtils.currentLine=144637988;
 //BA.debugLineNum = 144637988;BA.debugLine="WeekPanel.Width = mBase.Width";
__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=144637989;
 //BA.debugLineNum = 144637989;BA.debugLine="WeekPanel.Height = PanelMinHeight";
__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._panelminheight /*int*/ );
RDebugUtils.currentLine=144637990;
 //BA.debugLineNum = 144637990;BA.debugLine="WeekPanel.Color = Props.Get(\"WeekBackColor\")";
__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor((int)(BA.ObjectToNumber(_props.Get((Object)("WeekBackColor")))));
RDebugUtils.currentLine=144637991;
 //BA.debugLineNum = 144637991;BA.debugLine="Dim Columns As Int = 7";
_columns = (int) (7);
RDebugUtils.currentLine=144637992;
 //BA.debugLineNum = 144637992;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
if (BA.ObjectToBoolean((_props.Get((Object)("ShowWeekNumber"))))) { 
RDebugUtils.currentLine=144637993;
 //BA.debugLineNum = 144637993;BA.debugLine="Columns = 8";
_columns = (int) (8);
 };
RDebugUtils.currentLine=144637995;
 //BA.debugLineNum = 144637995;BA.debugLine="Dim BLLeft As Int = 0, Blocks As Int = Round(mBas";
_blleft = (int) (0);
_blocks = (int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()/(double)_columns));
RDebugUtils.currentLine=144637996;
 //BA.debugLineNum = 144637996;BA.debugLine="Dim WDays As String = Props.Get(\"ShortDayWeekName";
_wdays = BA.ObjectToString(_props.Get((Object)("ShortDayWeekNames")));
RDebugUtils.currentLine=144637997;
 //BA.debugLineNum = 144637997;BA.debugLine="Dim NamesList As List = GetAsList(WDays)";
_nameslist = new anywheresoftware.b4a.objects.collections.List();
_nameslist = __ref._getaslist /*anywheresoftware.b4a.objects.collections.List*/ (null,_wdays);
RDebugUtils.currentLine=144637999;
 //BA.debugLineNum = 144637999;BA.debugLine="For i=0 To Columns-1";
{
final int step42 = 1;
final int limit42 = (int) (_columns-1);
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
RDebugUtils.currentLine=144638000;
 //BA.debugLineNum = 144638000;BA.debugLine="Dim n As String";
_n = "";
RDebugUtils.currentLine=144638001;
 //BA.debugLineNum = 144638001;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
if (BA.ObjectToBoolean((_props.Get((Object)("ShowWeekNumber"))))) { 
RDebugUtils.currentLine=144638002;
 //BA.debugLineNum = 144638002;BA.debugLine="If (i = 0) Then";
if ((_i==0)) { 
RDebugUtils.currentLine=144638003;
 //BA.debugLineNum = 144638003;BA.debugLine="n = \"#\"";
_n = "#";
 }else {
RDebugUtils.currentLine=144638005;
 //BA.debugLineNum = 144638005;BA.debugLine="n = NamesList.Get(i-1)";
_n = BA.ObjectToString(_nameslist.Get((int) (_i-1)));
 };
 }else {
RDebugUtils.currentLine=144638008;
 //BA.debugLineNum = 144638008;BA.debugLine="n = NamesList.Get(i)";
_n = BA.ObjectToString(_nameslist.Get(_i));
 };
RDebugUtils.currentLine=144638010;
 //BA.debugLineNum = 144638010;BA.debugLine="Log($\"${n} : ${i}\"$)";
__c.LogImpl("6144638010",(""+__c.SmartStringFormatter("",(Object)(_n))+" : "+__c.SmartStringFormatter("",(Object)(_i))+""),0);
RDebugUtils.currentLine=144638011;
 //BA.debugLineNum = 144638011;BA.debugLine="AddLabelPos(WeekPanel, n, AlignCenter, Props.Get";
__ref._addlabelpos /*String*/ (null,__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ ,_n,_aligncenter,(int)(BA.ObjectToNumber(_props.Get((Object)("WeekBackColor")))),(int)(BA.ObjectToNumber(_props.Get((Object)("WeekFontColor")))),_blleft,(int) (_blleft+_blocks),(int)(BA.ObjectToNumber(_props.Get((Object)("DayWeekBorder")))),(int)(BA.ObjectToNumber(_props.Get((Object)("DayWeekBorderColor")))));
RDebugUtils.currentLine=144638012;
 //BA.debugLineNum = 144638012;BA.debugLine="BLLeft = BLLeft+Blocks";
_blleft = (int) (_blleft+_blocks);
RDebugUtils.currentLine=144638013;
 //BA.debugLineNum = 144638013;BA.debugLine="n = \"\"";
_n = "";
 }
};
RDebugUtils.currentLine=144638015;
 //BA.debugLineNum = 144638015;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
if (BA.ObjectToBoolean((_props.Get((Object)("ShowWeekNumber"))))) { 
RDebugUtils.currentLine=144638016;
 //BA.debugLineNum = 144638016;BA.debugLine="AddLabelPos(WeekPanel, NamesList.Get(NamesList.S";
__ref._addlabelpos /*String*/ (null,__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ ,BA.ObjectToString(_nameslist.Get((int) (_nameslist.getSize()-1))),_aligncenter,(int)(BA.ObjectToNumber(_props.Get((Object)("WeekBackColor")))),(int)(BA.ObjectToNumber(_props.Get((Object)("WeekFontColor")))),_blleft,(int) (_blleft+_blocks),(int)(BA.ObjectToNumber(_props.Get((Object)("DayWeekBorder")))),(int)(BA.ObjectToNumber(_props.Get((Object)("DayWeekBorderColor")))));
 };
RDebugUtils.currentLine=144638020;
 //BA.debugLineNum = 144638020;BA.debugLine="mBase.AddView(WeekPanel, NextLeft, NextTop, WeekP";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_nextleft,_nexttop,__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._weekpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=144638021;
 //BA.debugLineNum = 144638021;BA.debugLine="NextTop = NextTop + PanelMinHeight";
_nexttop = (int) (_nexttop+__ref._panelminheight /*int*/ );
RDebugUtils.currentLine=144638022;
 //BA.debugLineNum = 144638022;BA.debugLine="Log(Props.Get(\"WeekPanel\"))";
__c.LogImpl("6144638022",BA.ObjectToString(_props.Get((Object)("WeekPanel"))),0);
RDebugUtils.currentLine=144638024;
 //BA.debugLineNum = 144638024;BA.debugLine="CellsPanelBack.Top = NextTop";
__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_nexttop);
RDebugUtils.currentLine=144638025;
 //BA.debugLineNum = 144638025;BA.debugLine="CellsPanelBack.Left = NextLeft";
__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_nextleft);
RDebugUtils.currentLine=144638026;
 //BA.debugLineNum = 144638026;BA.debugLine="CellsPanelBack.Width = mBase.Width";
__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=144638027;
 //BA.debugLineNum = 144638027;BA.debugLine="CellsPanelBack.Height = mBase.Height";
__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=144638028;
 //BA.debugLineNum = 144638028;BA.debugLine="mBase.AddView(CellsPanelBack, NextLeft, NextTop,";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_nextleft,_nexttop,__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=144638030;
 //BA.debugLineNum = 144638030;BA.debugLine="CellsPanel.Top = NextTop";
__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_nexttop);
RDebugUtils.currentLine=144638031;
 //BA.debugLineNum = 144638031;BA.debugLine="CellsPanel.Left = NextLeft";
__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_nextleft);
RDebugUtils.currentLine=144638032;
 //BA.debugLineNum = 144638032;BA.debugLine="CellsPanel.Width = mBase.Width";
__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=144638033;
 //BA.debugLineNum = 144638033;BA.debugLine="CellsPanel.Height = mBase.Height";
__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=144638034;
 //BA.debugLineNum = 144638034;BA.debugLine="mBase.AddView(CellsPanel, NextLeft, NextTop, Cell";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_nextleft,_nexttop,__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=144638040;
 //BA.debugLineNum = 144638040;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=144638041;
 //BA.debugLineNum = 144638041;BA.debugLine="End Sub";
return false;
}
public String  _drawdays(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "drawdays", false))
	 {return ((String) Debug.delegate(ba, "drawdays", new Object[] {_props}));}
long _firstdayofmonth = 0L;
int _day = 0;
int _row = 0;
RDebugUtils.currentLine=146014208;
 //BA.debugLineNum = 146014208;BA.debugLine="Private Sub DrawDays(Props As Map)";
RDebugUtils.currentLine=146014209;
 //BA.debugLineNum = 146014209;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=146014210;
 //BA.debugLineNum = 146014210;BA.debugLine="cvs.DrawColor(Colors.Transparent)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=146014214;
 //BA.debugLineNum = 146014214;BA.debugLine="If (month <= 0) Or (month >12) Then";
if ((__ref._month /*int*/ <=0) || (__ref._month /*int*/ >12)) { 
RDebugUtils.currentLine=146014215;
 //BA.debugLineNum = 146014215;BA.debugLine="month = GetCurrentMonth";
__ref._month /*int*/  = __ref._getcurrentmonth /*int*/ (null);
 };
RDebugUtils.currentLine=146014218;
 //BA.debugLineNum = 146014218;BA.debugLine="If (year < 1970) Or (year >2100) Then";
if ((__ref._year /*int*/ <1970) || (__ref._year /*int*/ >2100)) { 
RDebugUtils.currentLine=146014219;
 //BA.debugLineNum = 146014219;BA.debugLine="year = GetCurrentYear";
__ref._year /*int*/  = __ref._getcurrentyear /*int*/ (null);
 };
RDebugUtils.currentLine=146014222;
 //BA.debugLineNum = 146014222;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.SetDate(y";
_firstdayofmonth = (long) (_dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=146014223;
 //BA.debugLineNum = 146014223;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
__ref._dayofweekoffset /*int*/  = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-0)%7);
RDebugUtils.currentLine=146014224;
 //BA.debugLineNum = 146014224;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(ba,__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=146014225;
 //BA.debugLineNum = 146014225;BA.debugLine="Log($\"daysInMonth: ${daysInMonth}, dayOfWeekOffse";
__c.LogImpl("6146014225",("daysInMonth: "+__c.SmartStringFormatter("",(Object)(__ref._daysinmonth /*int*/ ))+", dayOfWeekOffset: "+__c.SmartStringFormatter("",(Object)(__ref._dayofweekoffset /*int*/ ))+", year: "+__c.SmartStringFormatter("",(Object)(__ref._year /*int*/ ))+", month: "+__c.SmartStringFormatter("",(Object)(__ref._month /*int*/ ))+""),0);
RDebugUtils.currentLine=146014226;
 //BA.debugLineNum = 146014226;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=146014228;
 //BA.debugLineNum = 146014228;BA.debugLine="selectedColor = Colors.LightGray";
__ref._selectedcolor /*int*/  = __c.Colors.LightGray;
RDebugUtils.currentLine=146014230;
 //BA.debugLineNum = 146014230;BA.debugLine="DrawBox(cvs, selectedColor, (selectedDay + dayOf";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ +__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ +__ref._dayofweekoffset /*int*/ )/(double)7));
RDebugUtils.currentLine=146014231;
 //BA.debugLineNum = 146014231;BA.debugLine="Log(\"dia actual\")";
__c.LogImpl("6146014231","dia actual",0);
 };
RDebugUtils.currentLine=146014233;
 //BA.debugLineNum = 146014233;BA.debugLine="For day = 1 To daysInMonth";
{
final int step18 = 1;
final int limit18 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit18 ;_day = _day + step18 ) {
RDebugUtils.currentLine=146014234;
 //BA.debugLineNum = 146014234;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=146014235;
 //BA.debugLineNum = 146014235;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
if (BA.ObjectToBoolean((_props.Get((Object)("ShowWeekNumber"))))) { 
RDebugUtils.currentLine=146014236;
 //BA.debugLineNum = 146014236;BA.debugLine="row = (day - 1 + dayOfWeekOffset) / 8";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)8);
 };
RDebugUtils.currentLine=146014239;
 //BA.debugLineNum = 146014239;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawText(ba,BA.NumberToString(_day),(float) ((((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ),(float) ((_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ),__c.Typeface.DEFAULT_BOLD,(float)(BA.ObjectToNumber(_props.Get((Object)("CellFontSize")))),__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=146014241;
 //BA.debugLineNum = 146014241;BA.debugLine="Log($\"Row: ${row}, boxW: ${boxW}, boxH: ${boxH},";
__c.LogImpl("6146014241",("Row: "+__c.SmartStringFormatter("",(Object)(_row))+", boxW: "+__c.SmartStringFormatter("",(Object)(__ref._boxw /*float*/ ))+", boxH: "+__c.SmartStringFormatter("",(Object)(__ref._boxh /*float*/ ))+", vCorrection: "+__c.SmartStringFormatter("",(Object)(__ref._vcorrection /*float*/ ))+""),0);
 }
};
RDebugUtils.currentLine=146014243;
 //BA.debugLineNum = 146014243;BA.debugLine="month = lmonth 'GetCurrentMonth";
__ref._month /*int*/  = __ref._lmonth /*int*/ ;
RDebugUtils.currentLine=146014244;
 //BA.debugLineNum = 146014244;BA.debugLine="year = lyear 'GetCurrentYear";
__ref._year /*int*/  = __ref._lyear /*int*/ ;
RDebugUtils.currentLine=146014245;
 //BA.debugLineNum = 146014245;BA.debugLine="CellsPanel.Invalidate";
__ref._cellspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=146014246;
 //BA.debugLineNum = 146014246;BA.debugLine="End Sub";
return "";
}
public String  _cellspanel_touch(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "cellspanel_touch", false))
	 {return ((String) Debug.delegate(ba, "cellspanel_touch", new Object[] {_action,_x,_y}));}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
RDebugUtils.currentLine=144834560;
 //BA.debugLineNum = 144834560;BA.debugLine="Private Sub CellsPanel_Touch (ACTION As Int, X As";
RDebugUtils.currentLine=144834561;
 //BA.debugLineNum = 144834561;BA.debugLine="Dim boxX = X / boxW, boxY = Y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=144834562;
 //BA.debugLineNum = 144834562;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=144834563;
 //BA.debugLineNum = 144834563;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=144834565;
 //BA.debugLineNum = 144834565;BA.debugLine="year = Years.GetItem( Years.SelectedIndex )   ' =";
__ref._year /*int*/  = (int)(Double.parseDouble(__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=144834566;
 //BA.debugLineNum = 144834566;BA.debugLine="month = Months.SelectedIndex +1";
__ref._month /*int*/  = (int) (__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1);
RDebugUtils.currentLine=144834568;
 //BA.debugLineNum = 144834568;BA.debugLine="If ACTION = ACTION_DOWN Or ACTION = ACTION_MOVE T";
if (_action==__ref._action_down /*int*/  || _action==__ref._action_move /*int*/ ) { 
RDebugUtils.currentLine=144834569;
 //BA.debugLineNum = 144834569;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=144834570;
 //BA.debugLineNum = 144834570;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent) 'cle";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=144834571;
 //BA.debugLineNum = 144834571;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=144834572;
 //BA.debugLineNum = 144834572;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=144834573;
 //BA.debugLineNum = 144834573;BA.debugLine="DrawBox(cvsBackground, tempSelectedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ,__ref._tempselectedcolor /*int*/ ,_boxx,_boxy);
RDebugUtils.currentLine=144834574;
 //BA.debugLineNum = 144834574;BA.debugLine="lblSelectedDay.Text = newSelectedDay";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_newselectedday));
RDebugUtils.currentLine=144834575;
 //BA.debugLineNum = 144834575;BA.debugLine="lblSelectedDay.Visible = True";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=144834577;
 //BA.debugLineNum = 144834577;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=144834579;
 //BA.debugLineNum = 144834579;BA.debugLine="Else If ACTION = ACTION_UP Then";
if (_action==__ref._action_up /*int*/ ) { 
RDebugUtils.currentLine=144834580;
 //BA.debugLineNum = 144834580;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=144834581;
 //BA.debugLineNum = 144834581;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=144834582;
 //BA.debugLineNum = 144834582;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=144834583;
 //BA.debugLineNum = 144834583;BA.debugLine="SelectDay(newSelectedDay, True)";
__ref._selectday /*String*/ (null,_newselectedday,__c.True);
RDebugUtils.currentLine=144834584;
 //BA.debugLineNum = 144834584;BA.debugLine="CallSub3(mCallBack, mEventName & \"_Closed\", Fal";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.False),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=144834585;
 //BA.debugLineNum = 144834585;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 };
 }}
;
RDebugUtils.currentLine=144834588;
 //BA.debugLineNum = 144834588;BA.debugLine="CellsPanelBack.Invalidate";
__ref._cellspanelback /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=144834589;
 //BA.debugLineNum = 144834589;BA.debugLine="Log($\"${year} : ${month}\"$)";
__c.LogImpl("6144834589",(""+__c.SmartStringFormatter("",(Object)(__ref._year /*int*/ ))+" : "+__c.SmartStringFormatter("",(Object)(__ref._month /*int*/ ))+""),0);
RDebugUtils.currentLine=144834590;
 //BA.debugLineNum = 144834590;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "drawbox", false))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
RDebugUtils.currentLine=146079744;
 //BA.debugLineNum = 146079744;BA.debugLine="Private Sub DrawBox(c As Canvas, clr As Int, x As";
RDebugUtils.currentLine=146079745;
 //BA.debugLineNum = 146079745;BA.debugLine="Dim r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=146079746;
 //BA.debugLineNum = 146079746;BA.debugLine="r.Initialize(x * boxW, y * boxH, (x + 1) * boxW,";
_r.Initialize((int) (_x*__ref._boxw /*float*/ ),(int) (_y*__ref._boxh /*float*/ ),(int) ((_x+1)*__ref._boxw /*float*/ ),(int) ((_y+1)*__ref._boxh /*float*/ ));
RDebugUtils.currentLine=146079747;
 //BA.debugLineNum = 146079747;BA.debugLine="c.DrawRect(r, clr, True, 0)";
_c.DrawRect((android.graphics.Rect)(_r.getObject()),_clr,__c.True,(float) (0));
RDebugUtils.currentLine=146079748;
 //BA.debugLineNum = 146079748;BA.debugLine="End Sub";
return "";
}
public String  _selectday(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,int _day,boolean _updatelabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "selectday", false))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day,_updatelabel}));}
RDebugUtils.currentLine=144703488;
 //BA.debugLineNum = 144703488;BA.debugLine="Private Sub SelectDay(day As Int, UpdateLabel As B";
RDebugUtils.currentLine=144703490;
 //BA.debugLineNum = 144703490;BA.debugLine="selectedDate = DateUtils.SetDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=144703491;
 //BA.debugLineNum = 144703491;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=144703492;
 //BA.debugLineNum = 144703492;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=144703493;
 //BA.debugLineNum = 144703493;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=144703494;
 //BA.debugLineNum = 144703494;BA.debugLine="If UpdateLabel Then targetLabel.Text = DateTime.D";
if (_updatelabel) { 
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.DateTime.Date(__ref._selecteddate /*long*/ )));};
RDebugUtils.currentLine=144703495;
 //BA.debugLineNum = 144703495;BA.debugLine="End Sub";
return "";
}
public long  _getdate(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "getdate", false))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=144900096;
 //BA.debugLineNum = 144900096;BA.debugLine="Public Sub GetDate As Long";
RDebugUtils.currentLine=144900097;
 //BA.debugLineNum = 144900097;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=144900098;
 //BA.debugLineNum = 144900098;BA.debugLine="End Sub";
return 0L;
}
public String  _hide(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "hide", false))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=145031168;
 //BA.debugLineNum = 145031168;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=145031170;
 //BA.debugLineNum = 145031170;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
RDebugUtils.currentLine=144310272;
 //BA.debugLineNum = 144310272;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=144310273;
 //BA.debugLineNum = 144310273;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=144310274;
 //BA.debugLineNum = 144310274;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=144310275;
 //BA.debugLineNum = 144310275;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=144310276;
 //BA.debugLineNum = 144310276;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=144310277;
 //BA.debugLineNum = 144310277;BA.debugLine="Private Const PanelMinHeight As Int = 50dip";
_panelminheight = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=144310278;
 //BA.debugLineNum = 144310278;BA.debugLine="Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DO";
_action_up = (int) (1);
_action_move = (int) (2);
_action_down = (int) (0);
RDebugUtils.currentLine=144310280;
 //BA.debugLineNum = 144310280;BA.debugLine="Private TitlePanel As Panel";
_titlepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=144310281;
 //BA.debugLineNum = 144310281;BA.debugLine="Private MonthPanel As Panel";
_monthpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=144310282;
 //BA.debugLineNum = 144310282;BA.debugLine="Private WeekPanel As Panel";
_weekpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=144310283;
 //BA.debugLineNum = 144310283;BA.debugLine="Private CellsPanel As Panel";
_cellspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=144310284;
 //BA.debugLineNum = 144310284;BA.debugLine="Private CellsPanelBack As Panel";
_cellspanelback = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=144310287;
 //BA.debugLineNum = 144310287;BA.debugLine="Private Months As Spinner";
_months = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=144310288;
 //BA.debugLineNum = 144310288;BA.debugLine="Private Years As Spinner";
_years = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=144310290;
 //BA.debugLineNum = 144310290;BA.debugLine="Private waitForAddToActivity As Boolean";
_waitforaddtoactivity = false;
RDebugUtils.currentLine=144310291;
 //BA.debugLineNum = 144310291;BA.debugLine="Private GeneralRadius As Int";
_generalradius = 0;
RDebugUtils.currentLine=144310293;
 //BA.debugLineNum = 144310293;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=144310294;
 //BA.debugLineNum = 144310294;BA.debugLine="Private cvsBackground As Canvas";
_cvsbackground = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=144310295;
 //BA.debugLineNum = 144310295;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=144310296;
 //BA.debugLineNum = 144310296;BA.debugLine="Private lmonth, lyear As Int";
_lmonth = 0;
_lyear = 0;
RDebugUtils.currentLine=144310297;
 //BA.debugLineNum = 144310297;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=144310299;
 //BA.debugLineNum = 144310299;BA.debugLine="Private targetLabel As Label";
_targetlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=144310300;
 //BA.debugLineNum = 144310300;BA.debugLine="Private lblSelectedDay As Label";
_lblselectedday = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=144310301;
 //BA.debugLineNum = 144310301;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=144310302;
 //BA.debugLineNum = 144310302;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=144310303;
 //BA.debugLineNum = 144310303;BA.debugLine="Private tempSelectedColor As Int";
_tempselectedcolor = 0;
RDebugUtils.currentLine=144310304;
 //BA.debugLineNum = 144310304;BA.debugLine="Private selectedColor As Int";
_selectedcolor = 0;
RDebugUtils.currentLine=144310305;
 //BA.debugLineNum = 144310305;BA.debugLine="Private minYear, maxYear, firstDay As Int";
_minyear = 0;
_maxyear = 0;
_firstday = 0;
RDebugUtils.currentLine=144310306;
 //BA.debugLineNum = 144310306;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=144310307;
 //BA.debugLineNum = 144310307;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=144310308;
 //BA.debugLineNum = 144310308;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=144310309;
 //BA.debugLineNum = 144310309;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=144310310;
 //BA.debugLineNum = 144310310;BA.debugLine="Dim YearsList, MonthList As List";
_yearslist = new anywheresoftware.b4a.objects.collections.List();
_monthlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=144310312;
 //BA.debugLineNum = 144310312;BA.debugLine="Private innerMaps As Map";
_innermaps = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=144310313;
 //BA.debugLineNum = 144310313;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=144441344;
 //BA.debugLineNum = 144441344;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=144441345;
 //BA.debugLineNum = 144441345;BA.debugLine="If (Base.IsInitialized = False) Then";
if ((_base.IsInitialized()==__c.False)) { 
RDebugUtils.currentLine=144441346;
 //BA.debugLineNum = 144441346;BA.debugLine="Base.Initialize(\"\")";
_base.Initialize(ba,"");
 };
RDebugUtils.currentLine=144441348;
 //BA.debugLineNum = 144441348;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=144441349;
 //BA.debugLineNum = 144441349;BA.debugLine="waitForAddToActivity = True";
__ref._waitforaddtoactivity /*boolean*/  = __c.True;
RDebugUtils.currentLine=144441350;
 //BA.debugLineNum = 144441350;BA.debugLine="CallSubDelayed2(Me, \"AfterLoadLayout\", Props)";
__c.CallSubDelayed2(ba,this,"AfterLoadLayout",(Object)(_props));
RDebugUtils.currentLine=144441351;
 //BA.debugLineNum = 144441351;BA.debugLine="End Sub";
return "";
}
public String  _generateliststring(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,int _startnum,int _endnum) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "generateliststring", false))
	 {return ((String) Debug.delegate(ba, "generateliststring", new Object[] {_startnum,_endnum}));}
String _str = "";
int _i = 0;
RDebugUtils.currentLine=145620992;
 //BA.debugLineNum = 145620992;BA.debugLine="Sub GenerateListString(startnum As Int, endnum As";
RDebugUtils.currentLine=145620993;
 //BA.debugLineNum = 145620993;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=145620994;
 //BA.debugLineNum = 145620994;BA.debugLine="For i = startnum To endnum";
{
final int step2 = 1;
final int limit2 = _endnum;
_i = _startnum ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=145620995;
 //BA.debugLineNum = 145620995;BA.debugLine="If (str <> \"\") Then str = str & \"|\"";
if (((_str).equals("") == false)) { 
_str = _str+"|";};
RDebugUtils.currentLine=145620996;
 //BA.debugLineNum = 145620996;BA.debugLine="str = str & i";
_str = _str+BA.NumberToString(_i);
 }
};
RDebugUtils.currentLine=145620998;
 //BA.debugLineNum = 145620998;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=145620999;
 //BA.debugLineNum = 145620999;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getaslist(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,String _lstvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "getaslist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getaslist", new Object[] {_lstvalues}));}
anywheresoftware.b4a.objects.collections.List _arrval = null;
RDebugUtils.currentLine=145752064;
 //BA.debugLineNum = 145752064;BA.debugLine="Sub GetAsList(lstvalues As String) As List";
RDebugUtils.currentLine=145752065;
 //BA.debugLineNum = 145752065;BA.debugLine="Dim arrVal As List = Regex.Split(\"\\|\", lstvalues)";
_arrval = new anywheresoftware.b4a.objects.collections.List();
_arrval = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|",_lstvalues));
RDebugUtils.currentLine=145752066;
 //BA.debugLineNum = 145752066;BA.debugLine="Return arrVal";
if (true) return _arrval;
RDebugUtils.currentLine=145752067;
 //BA.debugLineNum = 145752067;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=145948672;
 //BA.debugLineNum = 145948672;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=145948673;
 //BA.debugLineNum = 145948673;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=145948674;
 //BA.debugLineNum = 145948674;BA.debugLine="End Sub";
return null;
}
public int  _getvalueposition(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,String _lstvalues,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "getvalueposition", false))
	 {return ((Integer) Debug.delegate(ba, "getvalueposition", new Object[] {_lstvalues,_value}));}
anywheresoftware.b4a.objects.collections.List _arrval = null;
RDebugUtils.currentLine=145686528;
 //BA.debugLineNum = 145686528;BA.debugLine="Sub GetValuePosition(lstvalues As String, value As";
RDebugUtils.currentLine=145686529;
 //BA.debugLineNum = 145686529;BA.debugLine="Dim arrVal As List = Regex.Split(\"\\|\", lstvalues)";
_arrval = new anywheresoftware.b4a.objects.collections.List();
_arrval = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|",_lstvalues));
RDebugUtils.currentLine=145686530;
 //BA.debugLineNum = 145686530;BA.debugLine="Return arrVal.IndexOf(value)";
if (true) return _arrval.IndexOf((Object)(_value));
RDebugUtils.currentLine=145686531;
 //BA.debugLineNum = 145686531;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=144375808;
 //BA.debugLineNum = 144375808;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=144375809;
 //BA.debugLineNum = 144375809;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=144375810;
 //BA.debugLineNum = 144375810;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=144375811;
 //BA.debugLineNum = 144375811;BA.debugLine="End Sub";
return "";
}
public String  _months_itemclick(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "months_itemclick", false))
	 {return ((String) Debug.delegate(ba, "months_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=145555456;
 //BA.debugLineNum = 145555456;BA.debugLine="Private Sub Months_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=145555457;
 //BA.debugLineNum = 145555457;BA.debugLine="month = Position + 1";
__ref._month /*int*/  = (int) (_position+1);
RDebugUtils.currentLine=145555458;
 //BA.debugLineNum = 145555458;BA.debugLine="DrawDays(innerMaps)";
__ref._drawdays /*String*/ (null,__ref._innermaps /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=145555459;
 //BA.debugLineNum = 145555459;BA.debugLine="Log(\"Month click\")";
__c.LogImpl("6145555459","Month click",0);
RDebugUtils.currentLine=145555460;
 //BA.debugLineNum = 145555460;BA.debugLine="End Sub";
return "";
}
public String  _setdate(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,long _date,boolean _updatelabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "setdate", false))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date,_updatelabel}));}
RDebugUtils.currentLine=144965632;
 //BA.debugLineNum = 144965632;BA.debugLine="Public Sub SetDate(date As Long, UpdateLabel As Bo";
RDebugUtils.currentLine=144965633;
 //BA.debugLineNum = 144965633;BA.debugLine="If waitForAddToActivity Then";
if (__ref._waitforaddtoactivity /*boolean*/ ) { 
RDebugUtils.currentLine=144965634;
 //BA.debugLineNum = 144965634;BA.debugLine="CallSubDelayed3(Me, \"SetDate\", date, UpdateLabel";
__c.CallSubDelayed3(ba,this,"SetDate",(Object)(_date),(Object)(_updatelabel));
RDebugUtils.currentLine=144965635;
 //BA.debugLineNum = 144965635;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=144965637;
 //BA.debugLineNum = 144965637;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=144965638;
 //BA.debugLineNum = 144965638;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=144965639;
 //BA.debugLineNum = 144965639;BA.debugLine="Log($\"SET: ${year}-${month}\"$)";
__c.LogImpl("6144965639",("SET: "+__c.SmartStringFormatter("",(Object)(__ref._year /*int*/ ))+"-"+__c.SmartStringFormatter("",(Object)(__ref._month /*int*/ ))+""),0);
RDebugUtils.currentLine=144965640;
 //BA.debugLineNum = 144965640;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date), UpdateLab";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date),_updatelabel);
RDebugUtils.currentLine=144965641;
 //BA.debugLineNum = 144965641;BA.debugLine="Years.SelectedIndex = year - minYear";
__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (__ref._year /*int*/ -__ref._minyear /*int*/ ));
RDebugUtils.currentLine=144965642;
 //BA.debugLineNum = 144965642;BA.debugLine="Months.SelectedIndex = month - 1";
__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (__ref._month /*int*/ -1));
RDebugUtils.currentLine=144965644;
 //BA.debugLineNum = 144965644;BA.debugLine="If Not(YearsList.IsInitialized) Then YearsList.In";
if (__c.Not(__ref._yearslist /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized())) { 
__ref._yearslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=144965645;
 //BA.debugLineNum = 144965645;BA.debugLine="If Not(MonthList.IsInitialized) Then MonthList.In";
if (__c.Not(__ref._monthlist /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized())) { 
__ref._monthlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=144965646;
 //BA.debugLineNum = 144965646;BA.debugLine="End Sub";
return "";
}
public String  _show(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=145096704;
 //BA.debugLineNum = 145096704;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=145096705;
 //BA.debugLineNum = 145096705;BA.debugLine="If waitForAddToActivity Then";
if (__ref._waitforaddtoactivity /*boolean*/ ) { 
RDebugUtils.currentLine=145096707;
 //BA.debugLineNum = 145096707;BA.debugLine="CallSubDelayed(Me, \"show\")";
__c.CallSubDelayed(ba,this,"show");
RDebugUtils.currentLine=145096708;
 //BA.debugLineNum = 145096708;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=145096710;
 //BA.debugLineNum = 145096710;BA.debugLine="mBase.SetVisibleAnimated(500, True)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetVisibleAnimated((int) (500),__c.True);
RDebugUtils.currentLine=145096711;
 //BA.debugLineNum = 145096711;BA.debugLine="DrawDays(innerMaps)";
__ref._drawdays /*String*/ (null,__ref._innermaps /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=145096712;
 //BA.debugLineNum = 145096712;BA.debugLine="End Sub";
return "";
}
public String  _showonthispanel(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "showonthispanel", false))
	 {return ((String) Debug.delegate(ba, "showonthispanel", new Object[] {_pnl}));}
RDebugUtils.currentLine=145162240;
 //BA.debugLineNum = 145162240;BA.debugLine="Public Sub ShowOnThisPanel(pnl As Panel)";
RDebugUtils.currentLine=145162241;
 //BA.debugLineNum = 145162241;BA.debugLine="mBase = pnl";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = _pnl;
RDebugUtils.currentLine=145162242;
 //BA.debugLineNum = 145162242;BA.debugLine="CallSubDelayed(Me, \"show\")";
__c.CallSubDelayed(ba,this,"show");
RDebugUtils.currentLine=145162243;
 //BA.debugLineNum = 145162243;BA.debugLine="End Sub";
return "";
}
public String  _targetlabel_click(xevolution.vrcg.devdemov2400.monthviewcalendar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "targetlabel_click", false))
	 {return ((String) Debug.delegate(ba, "targetlabel_click", null));}
RDebugUtils.currentLine=144769024;
 //BA.debugLineNum = 144769024;BA.debugLine="Private Sub targetLabel_Click";
RDebugUtils.currentLine=144769026;
 //BA.debugLineNum = 144769026;BA.debugLine="Log(\"show:taretLabel\")";
__c.LogImpl("6144769026","show:taretLabel",0);
RDebugUtils.currentLine=144769027;
 //BA.debugLineNum = 144769027;BA.debugLine="targetLabel.Color = Colors.Black";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.Black);
RDebugUtils.currentLine=144769028;
 //BA.debugLineNum = 144769028;BA.debugLine="End Sub";
return "";
}
public String  _years_itemclick(xevolution.vrcg.devdemov2400.monthviewcalendar __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="monthviewcalendar";
if (Debug.shouldDelegate(ba, "years_itemclick", false))
	 {return ((String) Debug.delegate(ba, "years_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=145489920;
 //BA.debugLineNum = 145489920;BA.debugLine="Private Sub Years_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=145489921;
 //BA.debugLineNum = 145489921;BA.debugLine="year = Value";
__ref._year /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=145489922;
 //BA.debugLineNum = 145489922;BA.debugLine="DrawDays(innerMaps)";
__ref._drawdays /*String*/ (null,__ref._innermaps /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=145489923;
 //BA.debugLineNum = 145489923;BA.debugLine="Log(\"Years click\")";
__c.LogImpl("6145489923","Years click",0);
RDebugUtils.currentLine=145489924;
 //BA.debugLineNum = 145489924;BA.debugLine="End Sub";
return "";
}
}