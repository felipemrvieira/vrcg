package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class structchecklistitems extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.structchecklistitems");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.structchecklistitems.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _cltypeoptions{
public boolean IsInitialized;
public String Tagcode;
public String[] Title;
public String Description;
public int oCount;
public int oType;
public boolean oMulti;
public String[] oJump;
public String[] oNames;
public int[] oColors;
public anywheresoftware.b4a.objects.collections.Map[] oValues;
public boolean[] oOptions;
public boolean NoAsk;
public void Initialize() {
IsInitialized = true;
Tagcode = "";
Title = new String[0];
java.util.Arrays.fill(Title,"");
Description = "";
oCount = 0;
oType = 0;
oMulti = false;
oJump = new String[0];
java.util.Arrays.fill(oJump,"");
oNames = new String[0];
java.util.Arrays.fill(oNames,"");
oColors = new int[0];
;
oValues = new anywheresoftware.b4a.objects.collections.Map[0];
{
int d0 = oValues.length;
for (int i0 = 0;i0 < d0;i0++) {
oValues[i0] = new anywheresoftware.b4a.objects.collections.Map();
}
}
;
oOptions = new boolean[0];
;
NoAsk = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _btncfgoption{
public boolean IsInitialized;
public int Color;
public int ValueOk;
public String Jump;
public void Initialize() {
IsInitialized = true;
Color = 0;
ValueOk = 0;
Jump = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pancfgoption{
public boolean IsInitialized;
public String TagCode;
public boolean Multi;
public boolean NoAsk;
public void Initialize() {
IsInitialized = true;
TagCode = "";
Multi = false;
NoAsk = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.LabelWrapper _clitem_title = null;
public anywheresoftware.b4a.objects.LabelWrapper _clitem_description = null;
public anywheresoftware.b4a.objects.LabelWrapper _clitem_tagcode = null;
public anywheresoftware.b4a.objects.EditTextWrapper _clitem_edittext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clitem_button = null;
public xevolution.vrcg.devdemov2400.b4xcombobox2 _clitem_selection = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clitem_repeatbnt = null;
public xevolution.vrcg.devdemov2400.anotherdatepicker _clitem_dateselect = null;
public String _firstoptioncheck = "";
public String _firstoptionselect = "";
public String _optionlatitude = "";
public String _optionlongitude = "";
public int _optionscount = 0;
public int _optionstype = 0;
public boolean _optionsmulti = false;
public String _optionjumpto = "";
public anywheresoftware.b4a.objects.ActivityWrapper _baseactivity = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _baseview = null;
public String _basedesigner = "";
public xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions _baseoptions = null;
public int _baseheight = 0;
public boolean _forceround = false;
public boolean _isnoask = false;
public anywheresoftware.b4a.objects.ButtonWrapper _butactionsclose = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butactions = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttask = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butphoto = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelactionoptions = null;
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
public String  _butactions_click(xevolution.vrcg.devdemov2400.structchecklistitems __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "butactions_click", false))
	 {return ((String) Debug.delegate(ba, "butactions_click", null));}
RDebugUtils.currentLine=178978816;
 //BA.debugLineNum = 178978816;BA.debugLine="Sub butActions_Click";
RDebugUtils.currentLine=178978820;
 //BA.debugLineNum = 178978820;BA.debugLine="End Sub";
return "";
}
public String  _butactionsclose_click(xevolution.vrcg.devdemov2400.structchecklistitems __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "butactionsclose_click", false))
	 {return ((String) Debug.delegate(ba, "butactionsclose_click", null));}
RDebugUtils.currentLine=179044352;
 //BA.debugLineNum = 179044352;BA.debugLine="Sub butActionsClose_Click";
RDebugUtils.currentLine=179044354;
 //BA.debugLineNum = 179044354;BA.debugLine="End Sub";
return "";
}
public String  _butphoto_click(xevolution.vrcg.devdemov2400.structchecklistitems __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "butphoto_click", false))
	 {return ((String) Debug.delegate(ba, "butphoto_click", null));}
RDebugUtils.currentLine=178847744;
 //BA.debugLineNum = 178847744;BA.debugLine="Sub butPhoto_Click";
RDebugUtils.currentLine=178847746;
 //BA.debugLineNum = 178847746;BA.debugLine="End Sub";
return "";
}
public String  _buttask_click(xevolution.vrcg.devdemov2400.structchecklistitems __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "buttask_click", false))
	 {return ((String) Debug.delegate(ba, "buttask_click", null));}
RDebugUtils.currentLine=178913280;
 //BA.debugLineNum = 178913280;BA.debugLine="Sub butTask_Click";
RDebugUtils.currentLine=178913282;
 //BA.debugLineNum = 178913282;BA.debugLine="End Sub";
return "";
}
public xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption  _buttonconfigmake(xevolution.vrcg.devdemov2400.structchecklistitems __ref,int _color,int _valueok,String _jump) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "buttonconfigmake", false))
	 {return ((xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption) Debug.delegate(ba, "buttonconfigmake", new Object[] {_color,_valueok,_jump}));}
xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption _opts = null;
RDebugUtils.currentLine=177668096;
 //BA.debugLineNum = 177668096;BA.debugLine="Sub ButtonConfigMake(Color As Int, ValueOk As Int,";
RDebugUtils.currentLine=177668097;
 //BA.debugLineNum = 177668097;BA.debugLine="Dim opts As BtnCfgOption";
_opts = new xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption();
RDebugUtils.currentLine=177668098;
 //BA.debugLineNum = 177668098;BA.debugLine="opts.Color = Color";
_opts.Color /*int*/  = _color;
RDebugUtils.currentLine=177668099;
 //BA.debugLineNum = 177668099;BA.debugLine="opts.ValueOk = ValueOk";
_opts.ValueOk /*int*/  = _valueok;
RDebugUtils.currentLine=177668100;
 //BA.debugLineNum = 177668100;BA.debugLine="opts.Jump = Jump";
_opts.Jump /*String*/  = _jump;
RDebugUtils.currentLine=177668101;
 //BA.debugLineNum = 177668101;BA.debugLine="Return opts";
if (true) return _opts;
RDebugUtils.currentLine=177668102;
 //BA.debugLineNum = 177668102;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(xevolution.vrcg.devdemov2400.structchecklistitems __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
RDebugUtils.currentLine=177405952;
 //BA.debugLineNum = 177405952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=177405954;
 //BA.debugLineNum = 177405954;BA.debugLine="Type CLTypeOptions( Tagcode As String, Title() As";
;
RDebugUtils.currentLine=177405957;
 //BA.debugLineNum = 177405957;BA.debugLine="Type BtnCfgOption(Color As Int, ValueOk As Int, J";
;
RDebugUtils.currentLine=177405958;
 //BA.debugLineNum = 177405958;BA.debugLine="Type PanCfgOption(TagCode As String, Multi As Boo";
;
RDebugUtils.currentLine=177405960;
 //BA.debugLineNum = 177405960;BA.debugLine="Private CLItem_Title As Label";
_clitem_title = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=177405961;
 //BA.debugLineNum = 177405961;BA.debugLine="Private CLItem_Description As Label";
_clitem_description = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=177405962;
 //BA.debugLineNum = 177405962;BA.debugLine="Private CLItem_Tagcode As Label";
_clitem_tagcode = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=177405964;
 //BA.debugLineNum = 177405964;BA.debugLine="Private CLItem_EditText As EditText";
_clitem_edittext = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=177405965;
 //BA.debugLineNum = 177405965;BA.debugLine="Private CLItem_Button As Button";
_clitem_button = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=177405966;
 //BA.debugLineNum = 177405966;BA.debugLine="Private CLItem_Selection As B4XComboBox2";
_clitem_selection = new xevolution.vrcg.devdemov2400.b4xcombobox2();
RDebugUtils.currentLine=177405967;
 //BA.debugLineNum = 177405967;BA.debugLine="Private CLItem_RepeatBnt As Button";
_clitem_repeatbnt = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=177405968;
 //BA.debugLineNum = 177405968;BA.debugLine="Private CLItem_DateSelect As AnotherDatePicker";
_clitem_dateselect = new xevolution.vrcg.devdemov2400.anotherdatepicker();
RDebugUtils.currentLine=177405972;
 //BA.debugLineNum = 177405972;BA.debugLine="Public FirstOptionCheck As String			' Datetime of";
_firstoptioncheck = "";
RDebugUtils.currentLine=177405973;
 //BA.debugLineNum = 177405973;BA.debugLine="Public FirstOptionSelect As String 			' Date of f";
_firstoptionselect = "";
RDebugUtils.currentLine=177405974;
 //BA.debugLineNum = 177405974;BA.debugLine="Public OptionLatitude As String";
_optionlatitude = "";
RDebugUtils.currentLine=177405975;
 //BA.debugLineNum = 177405975;BA.debugLine="Public OptionLongitude As String";
_optionlongitude = "";
RDebugUtils.currentLine=177405977;
 //BA.debugLineNum = 177405977;BA.debugLine="Private OptionsCount As Int = 0";
_optionscount = (int) (0);
RDebugUtils.currentLine=177405978;
 //BA.debugLineNum = 177405978;BA.debugLine="Private OptionsType As Int = 0				' Edit, Button,";
_optionstype = (int) (0);
RDebugUtils.currentLine=177405979;
 //BA.debugLineNum = 177405979;BA.debugLine="Private	OptionsMulti As Boolean = False		' Single";
_optionsmulti = __c.False;
RDebugUtils.currentLine=177405980;
 //BA.debugLineNum = 177405980;BA.debugLine="Private OptionJumpTo As String = \"\"";
_optionjumpto = "";
RDebugUtils.currentLine=177405982;
 //BA.debugLineNum = 177405982;BA.debugLine="Private BaseActivity As Activity";
_baseactivity = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=177405983;
 //BA.debugLineNum = 177405983;BA.debugLine="Private BaseView As B4XView";
_baseview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=177405984;
 //BA.debugLineNum = 177405984;BA.debugLine="Private BaseDesigner As String";
_basedesigner = "";
RDebugUtils.currentLine=177405985;
 //BA.debugLineNum = 177405985;BA.debugLine="Private BaseOptions As CLTypeOptions";
_baseoptions = new xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions();
RDebugUtils.currentLine=177405986;
 //BA.debugLineNum = 177405986;BA.debugLine="Private BaseHeight As Int";
_baseheight = 0;
RDebugUtils.currentLine=177405987;
 //BA.debugLineNum = 177405987;BA.debugLine="Private ForceRound As Boolean = False";
_forceround = __c.False;
RDebugUtils.currentLine=177405988;
 //BA.debugLineNum = 177405988;BA.debugLine="Private IsNoAsk As Boolean = False";
_isnoask = __c.False;
RDebugUtils.currentLine=177405989;
 //BA.debugLineNum = 177405989;BA.debugLine="Private butActionsClose As Button";
_butactionsclose = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=177405990;
 //BA.debugLineNum = 177405990;BA.debugLine="Private butActions As Button";
_butactions = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=177405991;
 //BA.debugLineNum = 177405991;BA.debugLine="Private butTask As Button";
_buttask = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=177405992;
 //BA.debugLineNum = 177405992;BA.debugLine="Private butPhoto As Button";
_butphoto = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=177405993;
 //BA.debugLineNum = 177405993;BA.debugLine="Private panelActionOptions As Panel";
_panelactionoptions = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=177405994;
 //BA.debugLineNum = 177405994;BA.debugLine="End Sub";
return "";
}
public String  _clitembutton_click(xevolution.vrcg.devdemov2400.structchecklistitems __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "clitembutton_click", false))
	 {return ((String) Debug.delegate(ba, "clitembutton_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _cfgcolor = 0;
int _cfgvalue = 0;
String _cfgjump = "";
RDebugUtils.currentLine=177995776;
 //BA.debugLineNum = 177995776;BA.debugLine="Sub CLItemButton_Click";
RDebugUtils.currentLine=177995777;
 //BA.debugLineNum = 177995777;BA.debugLine="Log(\"Clicked\")";
__c.LogImpl("6177995777","Clicked",0);
RDebugUtils.currentLine=177995778;
 //BA.debugLineNum = 177995778;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=177995779;
 //BA.debugLineNum = 177995779;BA.debugLine="Dim cfgColor As Int = getCfgColor(btn.Tag)";
_cfgcolor = __ref._getcfgcolor /*int*/ (null,(xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption)(_btn.getTag()));
RDebugUtils.currentLine=177995780;
 //BA.debugLineNum = 177995780;BA.debugLine="Dim cfgValue As Int = getCfgValueOk(btn.Tag)";
_cfgvalue = __ref._getcfgvalueok /*int*/ (null,(xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption)(_btn.getTag()));
RDebugUtils.currentLine=177995781;
 //BA.debugLineNum = 177995781;BA.debugLine="Dim cfgJump As String = getCfgJump(btn.Tag)";
_cfgjump = __ref._getcfgjump /*String*/ (null,(xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption)(_btn.getTag()));
RDebugUtils.currentLine=177995782;
 //BA.debugLineNum = 177995782;BA.debugLine="If cfgValue=0 Then";
if (_cfgvalue==0) { 
RDebugUtils.currentLine=177995783;
 //BA.debugLineNum = 177995783;BA.debugLine="If (getPanelMulti(btn.Parent)) Then";
if ((__ref._getpanelmulti /*boolean*/ (null,_btn.getParent()))) { 
RDebugUtils.currentLine=177995784;
 //BA.debugLineNum = 177995784;BA.debugLine="cfgValue = 1";
_cfgvalue = (int) (1);
RDebugUtils.currentLine=177995785;
 //BA.debugLineNum = 177995785;BA.debugLine="btn.Color = cfgColor";
_btn.setColor(_cfgcolor);
RDebugUtils.currentLine=177995786;
 //BA.debugLineNum = 177995786;BA.debugLine="btn.Tag = ButtonConfigMake(cfgColor, cfgValue,";
_btn.setTag((Object)(__ref._buttonconfigmake /*xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption*/ (null,_cfgcolor,_cfgvalue,_cfgjump)));
 }else {
RDebugUtils.currentLine=177995788;
 //BA.debugLineNum = 177995788;BA.debugLine="MakeButtonAction(btn, cfgColor, cfgJump)";
__ref._makebuttonaction /*void*/ (null,_btn,_cfgcolor,_cfgjump);
 };
RDebugUtils.currentLine=177995791;
 //BA.debugLineNum = 177995791;BA.debugLine="If (cfgJump <> \"\") Then";
if (((_cfgjump).equals("") == false)) { 
 };
 }else {
RDebugUtils.currentLine=177995795;
 //BA.debugLineNum = 177995795;BA.debugLine="cfgValue = 0";
_cfgvalue = (int) (0);
RDebugUtils.currentLine=177995796;
 //BA.debugLineNum = 177995796;BA.debugLine="btn.Color = Consts.ColorBlue";
_btn.setColor(_consts._colorblue /*int*/ );
 };
RDebugUtils.currentLine=177995798;
 //BA.debugLineNum = 177995798;BA.debugLine="End Sub";
return "";
}
public int  _getcfgcolor(xevolution.vrcg.devdemov2400.structchecklistitems __ref,xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "getcfgcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getcfgcolor", new Object[] {_obj}));}
RDebugUtils.currentLine=178454528;
 //BA.debugLineNum = 178454528;BA.debugLine="Sub getCfgColor(obj As BtnCfgOption) As Int";
RDebugUtils.currentLine=178454529;
 //BA.debugLineNum = 178454529;BA.debugLine="Return obj.Color";
if (true) return _obj.Color /*int*/ ;
RDebugUtils.currentLine=178454530;
 //BA.debugLineNum = 178454530;BA.debugLine="End Sub";
return 0;
}
public int  _getcfgvalueok(xevolution.vrcg.devdemov2400.structchecklistitems __ref,xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "getcfgvalueok", false))
	 {return ((Integer) Debug.delegate(ba, "getcfgvalueok", new Object[] {_obj}));}
RDebugUtils.currentLine=178520064;
 //BA.debugLineNum = 178520064;BA.debugLine="Sub getCfgValueOk(obj As BtnCfgOption) As Int";
RDebugUtils.currentLine=178520065;
 //BA.debugLineNum = 178520065;BA.debugLine="Return obj.ValueOk";
if (true) return _obj.ValueOk /*int*/ ;
RDebugUtils.currentLine=178520066;
 //BA.debugLineNum = 178520066;BA.debugLine="End Sub";
return 0;
}
public String  _getcfgjump(xevolution.vrcg.devdemov2400.structchecklistitems __ref,xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "getcfgjump", false))
	 {return ((String) Debug.delegate(ba, "getcfgjump", new Object[] {_obj}));}
RDebugUtils.currentLine=178585600;
 //BA.debugLineNum = 178585600;BA.debugLine="Sub getCfgJump(obj As BtnCfgOption) As String";
RDebugUtils.currentLine=178585601;
 //BA.debugLineNum = 178585601;BA.debugLine="Return obj.Jump";
if (true) return _obj.Jump /*String*/ ;
RDebugUtils.currentLine=178585602;
 //BA.debugLineNum = 178585602;BA.debugLine="End Sub";
return "";
}
public boolean  _getpanelmulti(xevolution.vrcg.devdemov2400.structchecklistitems __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "getpanelmulti", false))
	 {return ((Boolean) Debug.delegate(ba, "getpanelmulti", new Object[] {_obj}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption _cfg = null;
RDebugUtils.currentLine=178323456;
 //BA.debugLineNum = 178323456;BA.debugLine="Sub getPanelMulti(obj As Object) As Boolean";
RDebugUtils.currentLine=178323458;
 //BA.debugLineNum = 178323458;BA.debugLine="Dim pnl As Panel = obj";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_obj));
RDebugUtils.currentLine=178323459;
 //BA.debugLineNum = 178323459;BA.debugLine="Dim cfg As PanCfgOption = pnl.Tag";
_cfg = (xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption)(_pnl.getTag());
RDebugUtils.currentLine=178323460;
 //BA.debugLineNum = 178323460;BA.debugLine="Return cfg.Multi";
if (true) return _cfg.Multi /*boolean*/ ;
RDebugUtils.currentLine=178323461;
 //BA.debugLineNum = 178323461;BA.debugLine="End Sub";
return false;
}
public void  _makebuttonaction(xevolution.vrcg.devdemov2400.structchecklistitems __ref,anywheresoftware.b4a.objects.ButtonWrapper _btn,int _cfgcolor,String _cfgjump) throws Exception{
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "makebuttonaction", false))
	 {Debug.delegate(ba, "makebuttonaction", new Object[] {_btn,_cfgcolor,_cfgjump}); return;}
ResumableSub_MakeButtonAction rsub = new ResumableSub_MakeButtonAction(this,__ref,_btn,_cfgcolor,_cfgjump);
rsub.resume(ba, null);
}
public static class ResumableSub_MakeButtonAction extends BA.ResumableSub {
public ResumableSub_MakeButtonAction(xevolution.vrcg.devdemov2400.structchecklistitems parent,xevolution.vrcg.devdemov2400.structchecklistitems __ref,anywheresoftware.b4a.objects.ButtonWrapper _btn,int _cfgcolor,String _cfgjump) {
this.parent = parent;
this.__ref = __ref;
this._btn = _btn;
this._cfgcolor = _cfgcolor;
this._cfgjump = _cfgjump;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.structchecklistitems __ref;
xevolution.vrcg.devdemov2400.structchecklistitems parent;
anywheresoftware.b4a.objects.ButtonWrapper _btn;
int _cfgcolor;
String _cfgjump;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _iresult = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="structchecklistitems";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178061313;
 //BA.debugLineNum = 178061313;BA.debugLine="Dim lst As List = getAllPressed(btn, btn.Parent)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = __ref._getallpressed /*anywheresoftware.b4a.objects.collections.List*/ (null,(Object)(_btn.getObject()),_btn.getParent());
RDebugUtils.currentLine=178061314;
 //BA.debugLineNum = 178061314;BA.debugLine="If (lst.Size > 0) Then";
if (true) break;

case 1:
//if
this.state = 16;
if ((_lst.getSize()>0)) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=178061315;
 //BA.debugLineNum = 178061315;BA.debugLine="If Not(getPanelNoAsk(btn.Parent)) Then";
if (true) break;

case 4:
//if
this.state = 13;
if (parent.__c.Not(__ref._getpanelnoask /*boolean*/ (null,_btn.getParent()))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=178061316;
 //BA.debugLineNum = 178061316;BA.debugLine="Msgbox2(\"Já existe uma opção como resposta! Des";
parent.__c.Msgbox2(BA.ObjectToCharSequence("Já existe uma opção como resposta! Deseja substituir a resposta dada pela opção seleccionada?"),BA.ObjectToCharSequence("Alerta!"),"Sim","Não","",(android.graphics.Bitmap)(parent.__c.Null),ba);
RDebugUtils.currentLine=178061317;
 //BA.debugLineNum = 178061317;BA.debugLine="Wait For Msgbox_Result(iResult As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structchecklistitems", "makebuttonaction"), null);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_iresult = (Integer) result[1];
;
RDebugUtils.currentLine=178061318;
 //BA.debugLineNum = 178061318;BA.debugLine="If ((-iResult) = 1) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (((-_iresult)==1)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=178061319;
 //BA.debugLineNum = 178061319;BA.debugLine="MakeAllPressedUp(lst)";
__ref._makeallpressedup /*String*/ (null,_lst);
RDebugUtils.currentLine=178061320;
 //BA.debugLineNum = 178061320;BA.debugLine="btn.Color = cfgColor";
_btn.setColor(_cfgcolor);
RDebugUtils.currentLine=178061321;
 //BA.debugLineNum = 178061321;BA.debugLine="btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJum";
_btn.setTag((Object)(__ref._buttonconfigmake /*xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption*/ (null,_cfgcolor,(int) (1),_cfgjump)));
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=178061324;
 //BA.debugLineNum = 178061324;BA.debugLine="MakeAllPressedUp(lst)";
__ref._makeallpressedup /*String*/ (null,_lst);
RDebugUtils.currentLine=178061325;
 //BA.debugLineNum = 178061325;BA.debugLine="btn.Color = cfgColor";
_btn.setColor(_cfgcolor);
RDebugUtils.currentLine=178061326;
 //BA.debugLineNum = 178061326;BA.debugLine="btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJump";
_btn.setTag((Object)(__ref._buttonconfigmake /*xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption*/ (null,_cfgcolor,(int) (1),_cfgjump)));
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=178061329;
 //BA.debugLineNum = 178061329;BA.debugLine="btn.Color = cfgColor";
_btn.setColor(_cfgcolor);
RDebugUtils.currentLine=178061330;
 //BA.debugLineNum = 178061330;BA.debugLine="btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJump)";
_btn.setTag((Object)(__ref._buttonconfigmake /*xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption*/ (null,_cfgcolor,(int) (1),_cfgjump)));
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=178061332;
 //BA.debugLineNum = 178061332;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cllineclick_itemclick(xevolution.vrcg.devdemov2400.structchecklistitems __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "cllineclick_itemclick", false))
	 {return ((String) Debug.delegate(ba, "cllineclick_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=178716672;
 //BA.debugLineNum = 178716672;BA.debugLine="Sub CLLineClick_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=178716673;
 //BA.debugLineNum = 178716673;BA.debugLine="panelActionOptions.Visible = False";
__ref._panelactionoptions /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=178716680;
 //BA.debugLineNum = 178716680;BA.debugLine="End Sub";
return "";
}
public String  _cllineclick_itemlongclick(xevolution.vrcg.devdemov2400.structchecklistitems __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "cllineclick_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "cllineclick_itemlongclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=178782208;
 //BA.debugLineNum = 178782208;BA.debugLine="Sub CLLineClick_ItemLongClick (Index As Int, Value";
RDebugUtils.currentLine=178782209;
 //BA.debugLineNum = 178782209;BA.debugLine="panelActionOptions.Visible = True";
__ref._panelactionoptions /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=178782210;
 //BA.debugLineNum = 178782210;BA.debugLine="Log(\"Eu pressionei\")";
__c.LogImpl("6178782210","Eu pressionei",0);
RDebugUtils.currentLine=178782211;
 //BA.debugLineNum = 178782211;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlineoptions(xevolution.vrcg.devdemov2400.structchecklistitems __ref,xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions _opts,int _expviews) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "createlineoptions", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlineoptions", new Object[] {_opts,_expviews}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _titlesin = 0;
int _icount = 0;
int _ocount = 0;
int _i = 0;
anywheresoftware.b4a.objects.ButtonWrapper _nclitem_button = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _v = 0;
anywheresoftware.b4a.objects.collections.List _optionsadd = null;
RDebugUtils.currentLine=177537024;
 //BA.debugLineNum = 177537024;BA.debugLine="Public Sub CreateLineOptions(opts As CLTypeOptions";
RDebugUtils.currentLine=177537025;
 //BA.debugLineNum = 177537025;BA.debugLine="BaseOptions = opts";
__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/  = _opts;
RDebugUtils.currentLine=177537026;
 //BA.debugLineNum = 177537026;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=177537027;
 //BA.debugLineNum = 177537027;BA.debugLine="p.Initialize(\"CLLineClick\")";
_p.Initialize(ba,"CLLineClick");
RDebugUtils.currentLine=177537028;
 //BA.debugLineNum = 177537028;BA.debugLine="BaseActivity.AddView(p, 0, 0, 100%x, BaseHeight)";
__ref._baseactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__ref._baseheight /*int*/ );
RDebugUtils.currentLine=177537029;
 //BA.debugLineNum = 177537029;BA.debugLine="p.LoadLayout(BaseDesigner)";
_p.LoadLayout(__ref._basedesigner /*String*/ ,ba);
RDebugUtils.currentLine=177537030;
 //BA.debugLineNum = 177537030;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=177537031;
 //BA.debugLineNum = 177537031;BA.debugLine="p.Tag = PanelConfigMake(opts.Tagcode, opts.oMulti";
_p.setTag((Object)(__ref._panelconfigmake /*xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption*/ (null,_opts.Tagcode /*String*/ ,_opts.oMulti /*boolean*/ ,_opts.NoAsk /*boolean*/ )));
RDebugUtils.currentLine=177537032;
 //BA.debugLineNum = 177537032;BA.debugLine="IsNoAsk = opts.NoAsk";
__ref._isnoask /*boolean*/  = _opts.NoAsk /*boolean*/ ;
RDebugUtils.currentLine=177537034;
 //BA.debugLineNum = 177537034;BA.debugLine="Select BaseOptions.oType";
switch (BA.switchObjectToInt(__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .oType /*int*/ ,_consts._cloptiontype_buttons /*int*/ )) {
case 0: {
RDebugUtils.currentLine=177537036;
 //BA.debugLineNum = 177537036;BA.debugLine="Dim lst As List = BaseOptions.Title";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .Title /*String[]*/ );
RDebugUtils.currentLine=177537037;
 //BA.debugLineNum = 177537037;BA.debugLine="Dim TitlesIn As Int = lst.Size 'BaseOptions.Tit";
_titlesin = _lst.getSize();
RDebugUtils.currentLine=177537038;
 //BA.debugLineNum = 177537038;BA.debugLine="Dim iCount As Int = p.NumberOfViews-(TitlesIn+e";
_icount = (int) (_p.getNumberOfViews()-(_titlesin+_expviews));
RDebugUtils.currentLine=177537039;
 //BA.debugLineNum = 177537039;BA.debugLine="Dim oCount As Int = BaseOptions.oCount";
_ocount = __ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .oCount /*int*/ ;
RDebugUtils.currentLine=177537040;
 //BA.debugLineNum = 177537040;BA.debugLine="If (iCount = oCount) Then";
if ((_icount==_ocount)) { 
RDebugUtils.currentLine=177537041;
 //BA.debugLineNum = 177537041;BA.debugLine="Dim CLItem_Title As Label = p.GetView(Consts.A";
_clitem_title = new anywheresoftware.b4a.objects.LabelWrapper();
_clitem_title = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView(_consts._arr_firstitem /*int*/ ).getObject()));
RDebugUtils.currentLine=177537042;
 //BA.debugLineNum = 177537042;BA.debugLine="CLItem_Title.Text = BaseOptions.Title(Consts.A";
__ref._clitem_title /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .Title /*String[]*/ [_consts._arr_firstitem /*int*/ ]));
RDebugUtils.currentLine=177537043;
 //BA.debugLineNum = 177537043;BA.debugLine="For i = Consts.ARR_SECONDITEM To iCount 'p.Num";
{
final int step18 = 1;
final int limit18 = _icount;
_i = _consts._arr_seconditem /*int*/  ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=177537044;
 //BA.debugLineNum = 177537044;BA.debugLine="Dim nCLItem_Button As Button = p.GetView(i)";
_nclitem_button = new anywheresoftware.b4a.objects.ButtonWrapper();
_nclitem_button = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_p.GetView(_i).getObject()));
RDebugUtils.currentLine=177537047;
 //BA.debugLineNum = 177537047;BA.debugLine="nCLItem_Button.Text = BaseOptions.oNames(i-1)";
_nclitem_button.setText(BA.ObjectToCharSequence(__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .oNames /*String[]*/ [(int) (_i-1)]));
RDebugUtils.currentLine=177537048;
 //BA.debugLineNum = 177537048;BA.debugLine="nCLItem_Button.Color = Consts.ColorBlue";
_nclitem_button.setColor(_consts._colorblue /*int*/ );
RDebugUtils.currentLine=177537049;
 //BA.debugLineNum = 177537049;BA.debugLine="If ForceRound Then";
if (__ref._forceround /*boolean*/ ) { 
RDebugUtils.currentLine=177537050;
 //BA.debugLineNum = 177537050;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=177537051;
 //BA.debugLineNum = 177537051;BA.debugLine="cd.Initialize(Consts.ColorBlue, 1000dip)";
_cd.Initialize(_consts._colorblue /*int*/ ,__c.DipToCurrent((int) (1000)));
RDebugUtils.currentLine=177537052;
 //BA.debugLineNum = 177537052;BA.debugLine="nCLItem_Button.Background = cd";
_nclitem_button.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 };
RDebugUtils.currentLine=177537054;
 //BA.debugLineNum = 177537054;BA.debugLine="Dim m As Map = BaseOptions.oValues(i-1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .oValues /*anywheresoftware.b4a.objects.collections.Map[]*/ [(int) (_i-1)];
RDebugUtils.currentLine=177537055;
 //BA.debugLineNum = 177537055;BA.debugLine="Dim v As Int = m.Get(\"value\")";
_v = (int)(BA.ObjectToNumber(_m.Get((Object)("value"))));
RDebugUtils.currentLine=177537056;
 //BA.debugLineNum = 177537056;BA.debugLine="If (v = 1) Then nCLItem_Button.Color = BaseOp";
if ((_v==1)) { 
_nclitem_button.setColor(__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .oColors /*int[]*/ [(int) (_i-1)]);};
RDebugUtils.currentLine=177537057;
 //BA.debugLineNum = 177537057;BA.debugLine="nCLItem_Button.Tag = ButtonConfigMake(BaseOpt";
_nclitem_button.setTag((Object)(__ref._buttonconfigmake /*xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption*/ (null,__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .oColors /*int[]*/ [(int) (_i-1)],_v,__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .oJump /*String[]*/ [(int) (_i-1)])));
RDebugUtils.currentLine=177537061;
 //BA.debugLineNum = 177537061;BA.debugLine="Log(\"Added to button : \" & nCLItem_Button.Tex";
__c.LogImpl("6177537061","Added to button : "+_nclitem_button.getText(),0);
 }
};
RDebugUtils.currentLine=177537064;
 //BA.debugLineNum = 177537064;BA.debugLine="Dim OptionsAdd As List = BaseOptions.oOptions";
_optionsadd = new anywheresoftware.b4a.objects.collections.List();
_optionsadd = anywheresoftware.b4a.keywords.Common.ArrayToList(__ref._baseoptions /*xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions*/ .oOptions /*boolean[]*/ );
RDebugUtils.currentLine=177537065;
 //BA.debugLineNum = 177537065;BA.debugLine="If (OptionsAdd.Get(Consts.POSOPTION_REPEAT) =";
if (((_optionsadd.Get(_consts._posoption_repeat /*int*/ )).equals((Object)(1)))) { 
 };
 }else {
RDebugUtils.currentLine=177537074;
 //BA.debugLineNum = 177537074;BA.debugLine="Log($\"Error: Número de Views (${iCount}) difer";
__c.LogImpl("6177537074",("Error: Número de Views ("+__c.SmartStringFormatter("",(Object)(_icount))+") diferente do número de objectos ("+__c.SmartStringFormatter("",(Object)(_ocount))+")"),0);
 };
 break; }
}
;
RDebugUtils.currentLine=177537128;
 //BA.debugLineNum = 177537128;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=177537129;
 //BA.debugLineNum = 177537129;BA.debugLine="End Sub";
return null;
}
public xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption  _panelconfigmake(xevolution.vrcg.devdemov2400.structchecklistitems __ref,String _tagcode,boolean _multi,boolean _noask) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "panelconfigmake", false))
	 {return ((xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption) Debug.delegate(ba, "panelconfigmake", new Object[] {_tagcode,_multi,_noask}));}
xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption _opts = null;
RDebugUtils.currentLine=177733632;
 //BA.debugLineNum = 177733632;BA.debugLine="Sub PanelConfigMake(TagCode As String, Multi As Bo";
RDebugUtils.currentLine=177733633;
 //BA.debugLineNum = 177733633;BA.debugLine="Dim opts As PanCfgOption";
_opts = new xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption();
RDebugUtils.currentLine=177733634;
 //BA.debugLineNum = 177733634;BA.debugLine="opts.TagCode = TagCode";
_opts.TagCode /*String*/  = _tagcode;
RDebugUtils.currentLine=177733635;
 //BA.debugLineNum = 177733635;BA.debugLine="opts.Multi = Multi";
_opts.Multi /*boolean*/  = _multi;
RDebugUtils.currentLine=177733636;
 //BA.debugLineNum = 177733636;BA.debugLine="opts.NoAsk = NoAsk";
_opts.NoAsk /*boolean*/  = _noask;
RDebugUtils.currentLine=177733637;
 //BA.debugLineNum = 177733637;BA.debugLine="Return opts";
if (true) return _opts;
RDebugUtils.currentLine=177733638;
 //BA.debugLineNum = 177733638;BA.debugLine="End Sub";
return null;
}
public String  _edittextfield_enterpressed(xevolution.vrcg.devdemov2400.structchecklistitems __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "edittextfield_enterpressed", false))
	 {return ((String) Debug.delegate(ba, "edittextfield_enterpressed", null));}
RDebugUtils.currentLine=177864704;
 //BA.debugLineNum = 177864704;BA.debugLine="Sub EditTextField_EnterPressed";
RDebugUtils.currentLine=177864706;
 //BA.debugLineNum = 177864706;BA.debugLine="End Sub";
return "";
}
public String  _edittextfield_focuschanged(xevolution.vrcg.devdemov2400.structchecklistitems __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "edittextfield_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "edittextfield_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=177930240;
 //BA.debugLineNum = 177930240;BA.debugLine="Sub EditTextField_FocusChanged (HasFocus As Boolea";
RDebugUtils.currentLine=177930242;
 //BA.debugLineNum = 177930242;BA.debugLine="End Sub";
return "";
}
public String  _edittextfield_textchanged(xevolution.vrcg.devdemov2400.structchecklistitems __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "edittextfield_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=177799168;
 //BA.debugLineNum = 177799168;BA.debugLine="Sub EditTextField_TextChanged (Old As String, New";
RDebugUtils.currentLine=177799170;
 //BA.debugLineNum = 177799170;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getallpressed(xevolution.vrcg.devdemov2400.structchecklistitems __ref,Object _obutton,Object _oparent) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "getallpressed", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getallpressed", new Object[] {_obutton,_oparent}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.objects.PanelWrapper _prnt = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.ButtonWrapper _val = null;
RDebugUtils.currentLine=178192384;
 //BA.debugLineNum = 178192384;BA.debugLine="Sub getAllPressed(obutton As Object, oparent As Ob";
RDebugUtils.currentLine=178192385;
 //BA.debugLineNum = 178192385;BA.debugLine="Dim ret As List";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=178192386;
 //BA.debugLineNum = 178192386;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=178192387;
 //BA.debugLineNum = 178192387;BA.debugLine="Dim prnt As Panel = oparent";
_prnt = new anywheresoftware.b4a.objects.PanelWrapper();
_prnt = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_oparent));
RDebugUtils.currentLine=178192388;
 //BA.debugLineNum = 178192388;BA.debugLine="Dim btn As Button = obutton";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_obutton));
RDebugUtils.currentLine=178192389;
 //BA.debugLineNum = 178192389;BA.debugLine="For Each v As View In prnt.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _prnt.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group5.Get(index5)));
RDebugUtils.currentLine=178192390;
 //BA.debugLineNum = 178192390;BA.debugLine="If v Is Button Then";
if (_v.getObjectOrNull() instanceof android.widget.Button) { 
RDebugUtils.currentLine=178192391;
 //BA.debugLineNum = 178192391;BA.debugLine="Dim val As Button = v";
_val = new anywheresoftware.b4a.objects.ButtonWrapper();
_val = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_v.getObject()));
RDebugUtils.currentLine=178192392;
 //BA.debugLineNum = 178192392;BA.debugLine="If Not(val = btn) Then";
if (__c.Not((_val).equals(_btn))) { 
RDebugUtils.currentLine=178192393;
 //BA.debugLineNum = 178192393;BA.debugLine="If (getCfgValueOk(val.Tag) = 1) Then";
if ((__ref._getcfgvalueok /*int*/ (null,(xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption)(_val.getTag()))==1)) { 
RDebugUtils.currentLine=178192394;
 //BA.debugLineNum = 178192394;BA.debugLine="ret.Add(v)";
_ret.Add((Object)(_v.getObject()));
 };
 };
 }else 
{RDebugUtils.currentLine=178192398;
 //BA.debugLineNum = 178192398;BA.debugLine="Else If v Is CheckBox Then";
if (_v.getObjectOrNull() instanceof android.widget.CheckBox) { 
 }else 
{RDebugUtils.currentLine=178192400;
 //BA.debugLineNum = 178192400;BA.debugLine="Else If v Is Label Then";
if (_v.getObjectOrNull() instanceof android.widget.TextView) { 
 }}}
;
 }
};
RDebugUtils.currentLine=178192404;
 //BA.debugLineNum = 178192404;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=178192405;
 //BA.debugLineNum = 178192405;BA.debugLine="End Sub";
return null;
}
public boolean  _getpanelnoask(xevolution.vrcg.devdemov2400.structchecklistitems __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "getpanelnoask", false))
	 {return ((Boolean) Debug.delegate(ba, "getpanelnoask", new Object[] {_obj}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption _cfg = null;
RDebugUtils.currentLine=178388992;
 //BA.debugLineNum = 178388992;BA.debugLine="Sub getPanelNoAsk(obj As Object) As Boolean";
RDebugUtils.currentLine=178388994;
 //BA.debugLineNum = 178388994;BA.debugLine="Dim pnl As Panel = obj";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_obj));
RDebugUtils.currentLine=178388995;
 //BA.debugLineNum = 178388995;BA.debugLine="Dim cfg As PanCfgOption = pnl.Tag";
_cfg = (xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption)(_pnl.getTag());
RDebugUtils.currentLine=178388996;
 //BA.debugLineNum = 178388996;BA.debugLine="Return cfg.NoAsk";
if (true) return _cfg.NoAsk /*boolean*/ ;
RDebugUtils.currentLine=178388997;
 //BA.debugLineNum = 178388997;BA.debugLine="End Sub";
return false;
}
public String  _getpaneltagcode(xevolution.vrcg.devdemov2400.structchecklistitems __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "getpaneltagcode", false))
	 {return ((String) Debug.delegate(ba, "getpaneltagcode", new Object[] {_obj}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption _cfg = null;
RDebugUtils.currentLine=178257920;
 //BA.debugLineNum = 178257920;BA.debugLine="Sub getPanelTagcode(obj As Object) As String";
RDebugUtils.currentLine=178257922;
 //BA.debugLineNum = 178257922;BA.debugLine="Dim pnl As Panel = obj";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_obj));
RDebugUtils.currentLine=178257923;
 //BA.debugLineNum = 178257923;BA.debugLine="Dim cfg As PanCfgOption = pnl.Tag";
_cfg = (xevolution.vrcg.devdemov2400.structchecklistitems._pancfgoption)(_pnl.getTag());
RDebugUtils.currentLine=178257924;
 //BA.debugLineNum = 178257924;BA.debugLine="Return cfg.TagCode";
if (true) return _cfg.TagCode /*String*/ ;
RDebugUtils.currentLine=178257925;
 //BA.debugLineNum = 178257925;BA.debugLine="End Sub";
return "";
}
public String  _initialize(xevolution.vrcg.devdemov2400.structchecklistitems __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _designer,int _height,boolean _rounded) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_view,_designer,_height,_rounded}));}
RDebugUtils.currentLine=177471488;
 //BA.debugLineNum = 177471488;BA.debugLine="Public Sub Initialize(Activity As Activity, View A";
RDebugUtils.currentLine=177471489;
 //BA.debugLineNum = 177471489;BA.debugLine="BaseActivity = Activity";
__ref._baseactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activity;
RDebugUtils.currentLine=177471490;
 //BA.debugLineNum = 177471490;BA.debugLine="BaseView = View";
__ref._baseview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
RDebugUtils.currentLine=177471491;
 //BA.debugLineNum = 177471491;BA.debugLine="BaseDesigner = Designer";
__ref._basedesigner /*String*/  = _designer;
RDebugUtils.currentLine=177471492;
 //BA.debugLineNum = 177471492;BA.debugLine="BaseHeight = Height";
__ref._baseheight /*int*/  = _height;
RDebugUtils.currentLine=177471493;
 //BA.debugLineNum = 177471493;BA.debugLine="ForceRound = Rounded";
__ref._forceround /*boolean*/  = _rounded;
RDebugUtils.currentLine=177471494;
 //BA.debugLineNum = 177471494;BA.debugLine="End Sub";
return "";
}
public String  _listitems_selectedindexchanged(xevolution.vrcg.devdemov2400.structchecklistitems __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "listitems_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "listitems_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=178651136;
 //BA.debugLineNum = 178651136;BA.debugLine="Sub ListItems_SelectedIndexChanged (Index As Int)";
RDebugUtils.currentLine=178651138;
 //BA.debugLineNum = 178651138;BA.debugLine="End Sub";
return "";
}
public String  _makeallpressedup(xevolution.vrcg.devdemov2400.structchecklistitems __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "makeallpressedup", false))
	 {return ((String) Debug.delegate(ba, "makeallpressedup", new Object[] {_lst}));}
int _i = 0;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=178126848;
 //BA.debugLineNum = 178126848;BA.debugLine="Sub MakeAllPressedUp(lst As List)";
RDebugUtils.currentLine=178126849;
 //BA.debugLineNum = 178126849;BA.debugLine="For i=0 To lst.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=178126850;
 //BA.debugLineNum = 178126850;BA.debugLine="Dim btn As Button = lst.Get(i)";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_lst.Get(_i)));
RDebugUtils.currentLine=178126851;
 //BA.debugLineNum = 178126851;BA.debugLine="btn.Tag = ButtonConfigMake(getCfgColor(btn.Tag),";
_btn.setTag((Object)(__ref._buttonconfigmake /*xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption*/ (null,__ref._getcfgcolor /*int*/ (null,(xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption)(_btn.getTag())),(int) (0),__ref._getcfgjump /*String*/ (null,(xevolution.vrcg.devdemov2400.structchecklistitems._btncfgoption)(_btn.getTag())))));
RDebugUtils.currentLine=178126852;
 //BA.debugLineNum = 178126852;BA.debugLine="btn.Color = Consts.ColorBlue";
_btn.setColor(_consts._colorblue /*int*/ );
 }
};
RDebugUtils.currentLine=178126854;
 //BA.debugLineNum = 178126854;BA.debugLine="End Sub";
return "";
}
public xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions  _otionstypemake(xevolution.vrcg.devdemov2400.structchecklistitems __ref,String _tagcode,String[] _title,String _description,int _ocount,int _otype,boolean _omulti,String[] _ojump,String[] _onames,int[] _ocolors,anywheresoftware.b4a.objects.collections.Map[] _ovalues,boolean[] _ooptions,boolean _noask) throws Exception{
__ref = this;
RDebugUtils.currentModule="structchecklistitems";
if (Debug.shouldDelegate(ba, "otionstypemake", false))
	 {return ((xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions) Debug.delegate(ba, "otionstypemake", new Object[] {_tagcode,_title,_description,_ocount,_otype,_omulti,_ojump,_onames,_ocolors,_ovalues,_ooptions,_noask}));}
xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions _opts = null;
RDebugUtils.currentLine=177602560;
 //BA.debugLineNum = 177602560;BA.debugLine="Public Sub OtionsTypeMake(Tagcode As String, Title";
RDebugUtils.currentLine=177602563;
 //BA.debugLineNum = 177602563;BA.debugLine="Dim opts As CLTypeOptions";
_opts = new xevolution.vrcg.devdemov2400.structchecklistitems._cltypeoptions();
RDebugUtils.currentLine=177602564;
 //BA.debugLineNum = 177602564;BA.debugLine="opts.Title = Title";
_opts.Title /*String[]*/  = _title;
RDebugUtils.currentLine=177602565;
 //BA.debugLineNum = 177602565;BA.debugLine="opts.Description = Description";
_opts.Description /*String*/  = _description;
RDebugUtils.currentLine=177602566;
 //BA.debugLineNum = 177602566;BA.debugLine="opts.Tagcode = Tagcode";
_opts.Tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=177602567;
 //BA.debugLineNum = 177602567;BA.debugLine="opts.oCount = oCount";
_opts.oCount /*int*/  = _ocount;
RDebugUtils.currentLine=177602568;
 //BA.debugLineNum = 177602568;BA.debugLine="opts.oType = oType";
_opts.oType /*int*/  = _otype;
RDebugUtils.currentLine=177602569;
 //BA.debugLineNum = 177602569;BA.debugLine="opts.oMulti = oMulti";
_opts.oMulti /*boolean*/  = _omulti;
RDebugUtils.currentLine=177602570;
 //BA.debugLineNum = 177602570;BA.debugLine="opts.oJump = oJump";
_opts.oJump /*String[]*/  = _ojump;
RDebugUtils.currentLine=177602571;
 //BA.debugLineNum = 177602571;BA.debugLine="opts.oNames = oNames";
_opts.oNames /*String[]*/  = _onames;
RDebugUtils.currentLine=177602572;
 //BA.debugLineNum = 177602572;BA.debugLine="opts.oColors = oColors";
_opts.oColors /*int[]*/  = _ocolors;
RDebugUtils.currentLine=177602573;
 //BA.debugLineNum = 177602573;BA.debugLine="opts.oValues = oValues";
_opts.oValues /*anywheresoftware.b4a.objects.collections.Map[]*/  = _ovalues;
RDebugUtils.currentLine=177602574;
 //BA.debugLineNum = 177602574;BA.debugLine="opts.oOptions = oOptions";
_opts.oOptions /*boolean[]*/  = _ooptions;
RDebugUtils.currentLine=177602575;
 //BA.debugLineNum = 177602575;BA.debugLine="opts.NoAsk = NoAsk";
_opts.NoAsk /*boolean*/  = _noask;
RDebugUtils.currentLine=177602576;
 //BA.debugLineNum = 177602576;BA.debugLine="Return opts";
if (true) return _opts;
RDebugUtils.currentLine=177602577;
 //BA.debugLineNum = 177602577;BA.debugLine="End Sub";
return null;
}
}