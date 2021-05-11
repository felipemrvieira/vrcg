package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class report_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,111);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","activity_create", _firsttime);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 111;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(32768);
if ((report.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(65536);
report._device.runVoidMethod ("SetScreenOrientation",report.processBA,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 115;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(262144);
report._device.runVoidMethod ("SetScreenOrientation",report.processBA,(Object)(report.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 };
 BA.debugLineNum = 117;BA.debugLine="Activity.LoadLayout(\"reportsLayout\")";
Debug.ShouldStop(1048576);
report.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("reportsLayout")),report.mostCurrent.activityBA);
 BA.debugLineNum = 119;BA.debugLine="mainLabelOptLists.Text = ShareCode.MainOption_KPI";
Debug.ShouldStop(4194304);
report.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._mainoption_kpi /*RemoteObject*/ .runMethod(true,"toUpperCase")));
 BA.debugLineNum = 121;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(16777216);
if ((report.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 122;BA.debugLine="listsTabPanel.LoadLayout(\"reports_kpiview\", Shar";
Debug.ShouldStop(33554432);
report.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("reports_kpiview")),(Object)(BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportsindicadoresdia /*RemoteObject*/ )));
 BA.debugLineNum = 123;BA.debugLine="listsTabPanel.LoadLayout(\"reports_kpiviewAll\", S";
Debug.ShouldStop(67108864);
report.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("reports_kpiviewAll")),(Object)(BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportsindicadorescomparacao /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 125;BA.debugLine="listsTabPanel.LoadLayout(\"reports_kpiview\", Shar";
Debug.ShouldStop(268435456);
report.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("reports_kpiview")),(Object)(BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportsindicadoresdia /*RemoteObject*/ )));
 BA.debugLineNum = 126;BA.debugLine="listsTabPanel.LoadLayout(\"reports_kpiviewAll\", S";
Debug.ShouldStop(536870912);
report.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("reports_kpiviewAll")),(Object)(BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportsindicadorescomparacao /*RemoteObject*/ )));
 };
 BA.debugLineNum = 132;BA.debugLine="LabelDataInicio.Text = ShareCode.AppDialogsFilter";
Debug.ShouldStop(8);
report.mostCurrent._labeldatainicio.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._appdialogsfilterlabeldatainicio /*RemoteObject*/ ));
 BA.debugLineNum = 133;BA.debugLine="LabelDataFim.Text = ShareCode.AppDialogsFilterLab";
Debug.ShouldStop(16);
report.mostCurrent._labeldatafim.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._appdialogsfilterlabeldatafim /*RemoteObject*/ ));
 BA.debugLineNum = 134;BA.debugLine="LabelEstadoPedidos.Text = ShareCode.reportsLabelE";
Debug.ShouldStop(32);
report.mostCurrent._labelestadopedidos.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportslabelestadopedidos /*RemoteObject*/ ));
 BA.debugLineNum = 135;BA.debugLine="LabelPeriodo.Text = ShareCode.reportsLabelPeriodo";
Debug.ShouldStop(64);
report.mostCurrent._labelperiodo.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportslabelperiodo /*RemoteObject*/ ));
 BA.debugLineNum = 136;BA.debugLine="LabelKPIDescricao.Text = ShareCode.reportsLabelKP";
Debug.ShouldStop(128);
report.mostCurrent._labelkpidescricao.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportslabelkpidescricao /*RemoteObject*/ ));
 BA.debugLineNum = 137;BA.debugLine="LabelValor.Text = ShareCode.reportsLabelValor";
Debug.ShouldStop(256);
report.mostCurrent._labelvalor.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportslabelvalor /*RemoteObject*/ ));
 BA.debugLineNum = 139;BA.debugLine="LabelKPIEstadoPedidos.text = ShareCode.reportsLab";
Debug.ShouldStop(1024);
report.mostCurrent._labelkpiestadopedidos.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportslabelestadopedidos /*RemoteObject*/ ));
 BA.debugLineNum = 140;BA.debugLine="LabelKPIOutrosIndicadores.Text = ShareCode.report";
Debug.ShouldStop(2048);
report.mostCurrent._labelkpioutrosindicadores.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportslabelkpioutrosindicadores /*RemoteObject*/ ));
 BA.debugLineNum = 141;BA.debugLine="LabelKPIValor.Text = ShareCode.reportsLabelValor";
Debug.ShouldStop(4096);
report.mostCurrent._labelkpivalor.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportslabelvalor /*RemoteObject*/ ));
 BA.debugLineNum = 142;BA.debugLine="LabelKPIComparacao.Text = ShareCode.reportsLabelK";
Debug.ShouldStop(8192);
report.mostCurrent._labelkpicomparacao.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._reportslabelkpicomparacao /*RemoteObject*/ ));
 BA.debugLineNum = 151;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group25 = report.mostCurrent._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(report.mostCurrent._liststabpanel));
final int groupLen25 = group25.runMethod(true,"getSize").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group25.runMethod(false,"Get",index25));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 154;BA.debugLine="lbl.Width = 50%x";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setWidth",report.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),report.mostCurrent.activityBA));
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 156;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
Debug.ShouldStop(134217728);
report.mostCurrent._utils.runVoidMethod ("_maketabpaneleffect" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(report.mostCurrent._colortabpanel),(Object)(report.mostCurrent._consts._colormaindarker /*RemoteObject*/ ),(Object)(report.mostCurrent._consts._colorsub /*RemoteObject*/ ));
 BA.debugLineNum = 162;BA.debugLine="adps = Array(StartDateSelect, EndDateSelect)";
Debug.ShouldStop(2);
report.mostCurrent._adps = report.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(report.mostCurrent._startdateselect.getObject()),(report.mostCurrent._enddateselect.getObject())})));
 BA.debugLineNum = 164;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(8);
if (_firsttime.<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 167;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(64);
report.mostCurrent._base64con.runVoidMethod ("_initialize",report.processBA);
 BA.debugLineNum = 168;BA.debugLine="Utils.SetProgressDrawableExt(KPIUpdateProgress,\"T";
Debug.ShouldStop(128);
report.mostCurrent._utils.runVoidMethod ("_setprogressdrawableext" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(report.mostCurrent._kpiupdateprogress),(Object)(BA.ObjectToString("TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {report.mostCurrent._consts._colorblue /*RemoteObject*/ ,report.mostCurrent._consts._colorblue /*RemoteObject*/ })),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 169;BA.debugLine="KPIUpdateProgress.Progress = 0";
Debug.ShouldStop(256);
report.mostCurrent._kpiupdateprogress.runMethod(true,"setProgress",BA.numberCast(int.class, 0));
 BA.debugLineNum = 170;BA.debugLine="TimeStart.Initialize(\"TimeStart\",10)";
Debug.ShouldStop(512);
report._timestart.runVoidMethod ("Initialize",report.processBA,(Object)(BA.ObjectToString("TimeStart")),(Object)(BA.numberCast(long.class, 10)));
 BA.debugLineNum = 171;BA.debugLine="TimeStart.Enabled = False";
Debug.ShouldStop(1024);
report._timestart.runMethod(true,"setEnabled",report.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 173;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(4096);
report.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 174;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
Debug.ShouldStop(8192);
report.mostCurrent._labelcopyright.runMethod(true,"setText",BA.ObjectToCharSequence(report.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/ ));
 BA.debugLineNum = 175;BA.debugLine="If ShareCode.USR_STATE = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",report.mostCurrent._sharecode._usr_state /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 176;BA.debugLine="ButtonUserUnavailable.Visible = True";
Debug.ShouldStop(32768);
report.mostCurrent._buttonuserunavailable.runMethod(true,"setVisible",report.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 177;BA.debugLine="ButtonUserUnavailable.Enabled = True";
Debug.ShouldStop(65536);
report.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",report.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 179;BA.debugLine="UpdateMainLayout";
Debug.ShouldStop(262144);
_updatemainlayout();
 BA.debugLineNum = 180;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(524288);
_windowstatusupdate();
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,254);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 254;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 255;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, report.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 256;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(-2147483648);
_listsbuttonclose_click();
 };
 BA.debugLineNum = 258;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return report.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,265);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 265;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,261);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","activity_resume");}
 BA.debugLineNum = 261;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcancelfilter_click() throws Exception{
try {
		Debug.PushSubsStack("butCancelFilter_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,442);
if (RapidSub.canDelegate("butcancelfilter_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","butcancelfilter_click");}
 BA.debugLineNum = 442;BA.debugLine="Sub butCancelFilter_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 443;BA.debugLine="TimeStart.Enabled = True";
Debug.ShouldStop(67108864);
report._timestart.runMethod(true,"setEnabled",report.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butdatefilter_click() throws Exception{
try {
		Debug.PushSubsStack("butDateFilter_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,446);
if (RapidSub.canDelegate("butdatefilter_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","butdatefilter_click");}
RemoteObject _curr = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._kpifilter");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 446;BA.debugLine="Sub butDateFilter_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 447;BA.debugLine="If (SDateFilterValue = \"\") Then SDateFilterValue";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",report.mostCurrent._sdatefiltervalue,RemoteObject.createImmutable("")))) { 
report.mostCurrent._sdatefiltervalue = report.mostCurrent._sharecode._current_appdate /*RemoteObject*/ ;};
 BA.debugLineNum = 448;BA.debugLine="If (EDateFilterValue = \"\") Then EDateFilterValue";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",report.mostCurrent._edatefiltervalue,RemoteObject.createImmutable("")))) { 
report.mostCurrent._edatefiltervalue = report.mostCurrent._sharecode._current_appdate /*RemoteObject*/ ;};
 BA.debugLineNum = 449;BA.debugLine="Dim curr As KPIFilter = Types.MakeKPIFilter(Perio";
Debug.ShouldStop(1);
_curr = report.mostCurrent._types.runMethod(false,"_makekpifilter" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(report._periodfiltervalue),(Object)(report.mostCurrent._sdatefiltervalue),(Object)(report.mostCurrent._edatefiltervalue));Debug.locals.put("curr", _curr);Debug.locals.put("curr", _curr);
 BA.debugLineNum = 450;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(2);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 451;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(4);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,report.mostCurrent.activityBA);
 BA.debugLineNum = 452;BA.debugLine="Filter.GetKPIFilterDialog(Activity, curr)";
Debug.ShouldStop(8);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getkpifilterdialog" /*void*/ ,(Object)((report.mostCurrent._activity.getObject())),(Object)(_curr));
 BA.debugLineNum = 453;BA.debugLine="TimeStart.Enabled = True";
Debug.ShouldStop(16);
report._timestart.runMethod(true,"setEnabled",report.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 454;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butdocfilter_click() throws Exception{
try {
		Debug.PushSubsStack("butDocFilter_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,437);
if (RapidSub.canDelegate("butdocfilter_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","butdocfilter_click");}
 BA.debugLineNum = 437;BA.debugLine="Sub butDocFilter_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 438;BA.debugLine="mDocPopMenu.OpenMenu()";
Debug.ShouldStop(2097152);
report.mostCurrent._mdocpopmenu.runVoidMethod ("_openmenu");
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butequipfilter_click() throws Exception{
try {
		Debug.PushSubsStack("butEquipFilter_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,433);
if (RapidSub.canDelegate("butequipfilter_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","butequipfilter_click");}
 BA.debugLineNum = 433;BA.debugLine="Sub butEquipFilter_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 434;BA.debugLine="mEqipPopMenu.OpenMenu()";
Debug.ShouldStop(131072);
report.mostCurrent._meqippopmenu.runVoidMethod ("_openmenu");
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonactionpause_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonActionPause_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,518);
if (RapidSub.canDelegate("buttonactionpause_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","buttonactionpause_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 518;BA.debugLine="Sub ButtonActionPause_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 519;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",report.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 521;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
Debug.ShouldStop(256);
_i = report.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(report.mostCurrent._sharecode._avisopararpausa /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(report.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(report.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(report.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((report.mostCurrent.__c.getField(false,"Null"))),report.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 522;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, report.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 523;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(1024);
report.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 524;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
Debug.ShouldStop(2048);
report.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(report.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ));
 BA.debugLineNum = 525;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(4096);
report.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 528;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(32768);
_windowstatusupdate();
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonuserunavailable_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUserUnavailable_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,506);
if (RapidSub.canDelegate("buttonuserunavailable_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","buttonuserunavailable_click");}
 BA.debugLineNum = 506;BA.debugLine="Sub ButtonUserUnavailable_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butwarehouses_click() throws Exception{
try {
		Debug.PushSubsStack("butWareHouses_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,429);
if (RapidSub.canDelegate("butwarehouses_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","butwarehouses_click");}
 BA.debugLineNum = 429;BA.debugLine="Sub butWareHouses_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="mPopMenu.OpenMenu()";
Debug.ShouldStop(8192);
report.mostCurrent._mpopmenu.runVoidMethod ("_openmenu");
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calendargetenddate_ondateset(RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalendarGetEndDate_onDateSet (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,477);
if (RapidSub.canDelegate("calendargetenddate_ondateset")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","calendargetenddate_ondateset", _year, _monthofyear, _dayofmonth);}
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 477;BA.debugLine="Sub CalendarGetEndDate_onDateSet(year As Int, mont";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calendargetstartdate_ondateset(RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalendarGetStartDate_onDateSet (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,498);
if (RapidSub.canDelegate("calendargetstartdate_ondateset")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","calendargetstartdate_ondateset", _year, _monthofyear, _dayofmonth);}
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 498;BA.debugLine="Sub CalendarGetStartDate_onDateSet(year As Int, mo";
Debug.ShouldStop(131072);
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createkpirecord(RemoteObject _title,RemoteObject _value,RemoteObject _valcompare,RemoteObject _padd,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateKPIRecord (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,362);
if (RapidSub.canDelegate("createkpirecord")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","createkpirecord", _title, _value, _valcompare, _padd, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Title", _title);
Debug.locals.put("Value", _value);
Debug.locals.put("ValCompare", _valcompare);
Debug.locals.put("padd", _padd);
Debug.locals.put("height", _height);
 BA.debugLineNum = 362;BA.debugLine="Sub CreateKPIRecord(Title As String, Value As Stri";
Debug.ShouldStop(512);
 BA.debugLineNum = 363;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 364;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2048);
_p.runVoidMethod ("Initialize",report.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 365;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(4096);
if ((report.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 366;BA.debugLine="height = 60dip";
Debug.ShouldStop(8192);
_height = report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("height", _height);
 BA.debugLineNum = 367;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(16384);
report.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(report.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),report.mostCurrent.activityBA)),(Object)(_height));
 }else {
 BA.debugLineNum = 369;BA.debugLine="Activity.AddView(p, 0, 0, 560dip, height)";
Debug.ShouldStop(65536);
report.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 560)))),(Object)(_height));
 };
 BA.debugLineNum = 371;BA.debugLine="p.LoadLayout(\"reports_kpiItems\")";
Debug.ShouldStop(262144);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("reports_kpiItems")),report.mostCurrent.activityBA);
 BA.debugLineNum = 372;BA.debugLine="p.RemoveView";
Debug.ShouldStop(524288);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 373;BA.debugLine="labelKPIDescription.Padding = padd";
Debug.ShouldStop(1048576);
report.mostCurrent._labelkpidescription.runMethod(false,"setPadding",_padd);
 BA.debugLineNum = 374;BA.debugLine="labelKPIDescription.text = Title";
Debug.ShouldStop(2097152);
report.mostCurrent._labelkpidescription.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 375;BA.debugLine="labelKPIValue.text = Value";
Debug.ShouldStop(4194304);
report.mostCurrent._labelkpivalue.runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 376;BA.debugLine="Return p";
Debug.ShouldStop(8388608);
if (true) return _p;
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createkpirecordall(RemoteObject _title,RemoteObject _value,RemoteObject _valcompare,RemoteObject _padd,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateKPIRecordAll (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,379);
if (RapidSub.canDelegate("createkpirecordall")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","createkpirecordall", _title, _value, _valcompare, _padd, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Title", _title);
Debug.locals.put("Value", _value);
Debug.locals.put("ValCompare", _valcompare);
Debug.locals.put("padd", _padd);
Debug.locals.put("height", _height);
 BA.debugLineNum = 379;BA.debugLine="Sub CreateKPIRecordAll(Title As String, Value As S";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 381;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("Initialize",report.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 382;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(536870912);
if ((report.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 383;BA.debugLine="height = 60dip";
Debug.ShouldStop(1073741824);
_height = report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("height", _height);
 BA.debugLineNum = 384;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(-2147483648);
report.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(report.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),report.mostCurrent.activityBA)),(Object)(_height));
 }else {
 BA.debugLineNum = 386;BA.debugLine="Activity.AddView(p, 0, 0, 560dip, height)";
Debug.ShouldStop(2);
report.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 560)))),(Object)(_height));
 };
 BA.debugLineNum = 388;BA.debugLine="p.LoadLayout(\"reports_kpiItemsAll\")";
Debug.ShouldStop(8);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("reports_kpiItemsAll")),report.mostCurrent.activityBA);
 BA.debugLineNum = 389;BA.debugLine="p.RemoveView";
Debug.ShouldStop(16);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 390;BA.debugLine="labelKPIDescription.Padding = padd";
Debug.ShouldStop(32);
report.mostCurrent._labelkpidescription.runMethod(false,"setPadding",_padd);
 BA.debugLineNum = 391;BA.debugLine="labelKPIDescription.text = Title";
Debug.ShouldStop(64);
report.mostCurrent._labelkpidescription.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 392;BA.debugLine="labelKPIValue.text = Value";
Debug.ShouldStop(128);
report.mostCurrent._labelkpivalue.runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 393;BA.debugLine="labelKPIValueCompare.text = ValCompare";
Debug.ShouldStop(256);
report.mostCurrent._labelkpivaluecompare.runMethod(true,"setText",BA.ObjectToCharSequence(_valcompare));
 BA.debugLineNum = 394;BA.debugLine="Return p";
Debug.ShouldStop(512);
if (true) return _p;
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpiechart(RemoteObject _view,RemoteObject _intstatus,RemoteObject _descstatus,RemoteObject _intcolors) throws Exception{
try {
		Debug.PushSubsStack("createPieChart (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,344);
if (RapidSub.canDelegate("createpiechart")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","createpiechart", _view, _intstatus, _descstatus, _intcolors);}
Debug.locals.put("view", _view);
Debug.locals.put("intStatus", _intstatus);
Debug.locals.put("descStatus", _descstatus);
Debug.locals.put("intColors", _intcolors);
 BA.debugLineNum = 344;BA.debugLine="Sub createPieChart(view As PieChart, intStatus() A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="view.BorderColor = Colors.Transparent";
Debug.ShouldStop(16777216);
_view.runVoidMethod ("setBorderColor",report.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 346;BA.debugLine="view.BorderWidth = 7.0";
Debug.ShouldStop(33554432);
_view.runVoidMethod ("setBorderWidth",BA.numberCast(float.class, 7.0));
 BA.debugLineNum = 347;BA.debugLine="view.CircleBorderColor = Colors.Transparent";
Debug.ShouldStop(67108864);
_view.runVoidMethod ("setCircleBorderColor",report.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 348;BA.debugLine="view.CircleBorderWidth = 15.0";
Debug.ShouldStop(134217728);
_view.runVoidMethod ("setCircleBorderWidth",BA.numberCast(int.class, 15.0));
 BA.debugLineNum = 349;BA.debugLine="view.DisplayBorder = True";
Debug.ShouldStop(268435456);
_view.runVoidMethod ("setDisplayBorder",report.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 350;BA.debugLine="view.LongitudeColor = Colors.Transparent";
Debug.ShouldStop(536870912);
_view.runVoidMethod ("setLongitudeColor",report.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 352;BA.debugLine="view.PieTextColor = Colors.black";
Debug.ShouldStop(-2147483648);
_view.runVoidMethod ("setPieTextColor",report.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 353;BA.debugLine="view.PieTextSize = 15.0";
Debug.ShouldStop(1);
_view.runVoidMethod ("setPieTextSize",BA.numberCast(float.class, 15.0));
 BA.debugLineNum = 354;BA.debugLine="view.setTitlePosition(pc1.Left + 5%x, pc1.Top + 2";
Debug.ShouldStop(2);
_view.runVoidMethod ("setTitlePosition",(Object)(RemoteObject.solve(new RemoteObject[] {report.mostCurrent._pc1.runMethod(true,"getLeft"),report.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),report.mostCurrent.activityBA)}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {report.mostCurrent._pc1.runMethod(true,"getTop"),report.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),report.mostCurrent.activityBA)}, "+",1, 1)));
 BA.debugLineNum = 356;BA.debugLine="view.PieSliceColors = intColors 'piecolors";
Debug.ShouldStop(8);
_view.runVoidMethod ("setPieSliceColors",_intcolors);
 BA.debugLineNum = 357;BA.debugLine="view.PieSliceValues = intStatus 'pievalues";
Debug.ShouldStop(16);
_view.runVoidMethod ("setPieSliceValues",_intstatus);
 BA.debugLineNum = 358;BA.debugLine="view.PieSliceTitles = descStatus 'pietitles";
Debug.ShouldStop(32);
_view.runVoidMethod ("setPieSliceTitles",_descstatus);
 BA.debugLineNum = 359;BA.debugLine="view.initPieChart";
Debug.ShouldStop(64);
_view.runVoidMethod ("initPieChart");
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqperiodtype_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DialogReqPeriodType_ItemClick (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,510);
if (RapidSub.canDelegate("dialogreqperiodtype_itemclick")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","dialogreqperiodtype_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 510;BA.debugLine="Sub DialogReqPeriodType_ItemClick (Position As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 512;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enddateselect_click() throws Exception{
try {
		Debug.PushSubsStack("EndDateSelect_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,464);
if (RapidSub.canDelegate("enddateselect_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","enddateselect_click");}
 BA.debugLineNum = 464;BA.debugLine="Sub EndDateSelect_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 475;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private listsBasePanel As Panel";
report.mostCurrent._listsbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private listsBottomLine As Panel";
report.mostCurrent._listsbottomline = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private listsBottomPanel As Panel";
report.mostCurrent._listsbottompanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private listsButtonClose As Button";
report.mostCurrent._listsbuttonclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private listsLabelInfo As Label";
report.mostCurrent._listslabelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private listsTabPanel As TabStrip";
report.mostCurrent._liststabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 25;BA.debugLine="Private listsTopBar As Panel";
report.mostCurrent._liststopbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Dim Base64Con As Base64Convert";
report.mostCurrent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");
 //BA.debugLineNum = 49;BA.debugLine="Private butWareHouses As Button";
report.mostCurrent._butwarehouses = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Dim mPopMenu As MenuOnAnyView";
report.mostCurrent._mpopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 51;BA.debugLine="Dim mDocPopMenu As MenuOnAnyView";
report.mostCurrent._mdocpopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 52;BA.debugLine="Dim mEqipPopMenu As MenuOnAnyView";
report.mostCurrent._meqippopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 53;BA.debugLine="Private butDocFilter As Button";
report.mostCurrent._butdocfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private butEquipFilter As Button";
report.mostCurrent._butequipfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private UserDocuments As List";
report.mostCurrent._userdocuments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 56;BA.debugLine="Private UserEquipments As List";
report.mostCurrent._userequipments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 57;BA.debugLine="Private pc1 As PieChart";
report.mostCurrent._pc1 = RemoteObject.createNew ("androidchartswrapper.pieChartWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private listPeriods As B4XComboBox2";
report.mostCurrent._listperiods = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xcombobox2");
 //BA.debugLineNum = 59;BA.debugLine="Private StartDateSelect As Label";
report.mostCurrent._startdateselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private EndDateSelect As Label";
report.mostCurrent._enddateselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private butDateFilter As Button";
report.mostCurrent._butdatefilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private butCancelFilter As Button";
report.mostCurrent._butcancelfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private adps As List";
report.mostCurrent._adps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 64;BA.debugLine="Private labelKPIDescription As Label";
report.mostCurrent._labelkpidescription = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private labelKPIValue As Label";
report.mostCurrent._labelkpivalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private labelKPIValueCompare As Label";
report.mostCurrent._labelkpivaluecompare = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private KPIList As CustomListView";
report.mostCurrent._kpilist = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 68;BA.debugLine="Private KPIUpdateProgress As ProgressBar";
report.mostCurrent._kpiupdateprogress = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private LabelVersion As Label";
report.mostCurrent._labelversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private LabelDateTime As Label";
report.mostCurrent._labeldatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private LabelCopyright As Label";
report.mostCurrent._labelcopyright = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private ButtonUserUnavailable As Button";
report.mostCurrent._buttonuserunavailable = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private labelUserLate As Label";
report.mostCurrent._labeluserlate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private labelUserAvarage As Label";
report.mostCurrent._labeluseravarage = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private labelUserNotMade As Label";
report.mostCurrent._labelusernotmade = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private labelUserMade As Label";
report.mostCurrent._labelusermade = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private panelUserMade As Panel";
report.mostCurrent._panelusermade = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private panelUserLate As Panel";
report.mostCurrent._paneluserlate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private panelUserAvarage As Panel";
report.mostCurrent._paneluseravarage = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private panelUserNotMade As Panel";
report.mostCurrent._panelusernotmade = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private pc0 As PieChart";
report.mostCurrent._pc0 = RemoteObject.createNew ("androidchartswrapper.pieChartWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private DialogReqPeriodType As Spinner";
report.mostCurrent._dialogreqperiodtype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private DialogReqStartDate As FloatLabeledEditTex";
report.mostCurrent._dialogreqstartdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private DialogReqEndDate As FloatLabeledEditText";
report.mostCurrent._dialogreqenddate = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private butReqStartDate As Button";
report.mostCurrent._butreqstartdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private butReqEndDate As Button";
report.mostCurrent._butreqenddate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private SDateFilterValue As String = \"\"";
report.mostCurrent._sdatefiltervalue = BA.ObjectToString("");
 //BA.debugLineNum = 89;BA.debugLine="Private EDateFilterValue As String = \"\"";
report.mostCurrent._edatefiltervalue = BA.ObjectToString("");
 //BA.debugLineNum = 90;BA.debugLine="Private PeriodFilterValue As Int = 0";
report._periodfiltervalue = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 92;BA.debugLine="Private KPIListAll As CustomListView";
report.mostCurrent._kpilistall = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 93;BA.debugLine="Private ColorTabPanel As Panel";
report.mostCurrent._colortabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private mainLabelOptLists As Label";
report.mostCurrent._mainlabeloptlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private mainLogo As ImageView";
report.mostCurrent._mainlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private ButtonActionPause As Button";
report.mostCurrent._buttonactionpause = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private ButtonAppNetwork As Button";
report.mostCurrent._buttonappnetwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private mainActiveUser As Label";
report.mostCurrent._mainactiveuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Private LabelEstadoPedidos As Label";
report.mostCurrent._labelestadopedidos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private LabelPeriodo As Label";
report.mostCurrent._labelperiodo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private LabelDataInicio As Label";
report.mostCurrent._labeldatainicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private LabelDataFim As Label";
report.mostCurrent._labeldatafim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private LabelKPIDescricao As Label";
report.mostCurrent._labelkpidescricao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private LabelValor As Label";
report.mostCurrent._labelvalor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private LabelKPIEstadoPedidos As Label";
report.mostCurrent._labelkpiestadopedidos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private LabelKPIOutrosIndicadores As Label";
report.mostCurrent._labelkpioutrosindicadores = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private LabelKPIValor As Label";
report.mostCurrent._labelkpivalor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private LabelKPIComparacao As Label";
report.mostCurrent._labelkpicomparacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _kpilist_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("KPIList_ItemClick (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,460);
if (RapidSub.canDelegate("kpilist_itemclick")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","kpilist_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 460;BA.debugLine="Sub KPIList_ItemClick (Index As Int, Value As Obje";
Debug.ShouldStop(2048);
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitempanel_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemPanel_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,425);
if (RapidSub.canDelegate("listitempanel_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","listitempanel_click");}
 BA.debugLineNum = 425;BA.debugLine="Sub ListItemPanel_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listpedidos_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listPedidos_ItemClick (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,421);
if (RapidSub.canDelegate("listpedidos_itemclick")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","listpedidos_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 421;BA.debugLine="Sub listPedidos_ItemClick (Index As Int, Value As";
Debug.ShouldStop(16);
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listperiods_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("listPeriods_SelectedIndexChanged (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,456);
if (RapidSub.canDelegate("listperiods_selectedindexchanged")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","listperiods_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 456;BA.debugLine="Sub listPeriods_SelectedIndexChanged (Index As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 457;BA.debugLine="StartReportActivity(Index)";
Debug.ShouldStop(256);
_startreportactivity(_index);
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonadd_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonAdd_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,417);
if (RapidSub.canDelegate("listsbuttonadd_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","listsbuttonadd_click");}
 BA.debugLineNum = 417;BA.debugLine="Sub listsButtonAdd_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 419;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonclose_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonClose_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,410);
if (RapidSub.canDelegate("listsbuttonclose_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","listsbuttonclose_click");}
 BA.debugLineNum = 410;BA.debugLine="Sub listsButtonClose_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 411;BA.debugLine="Log(\"Back REPORTS\")";
Debug.ShouldStop(67108864);
report.mostCurrent.__c.runVoidMethod ("LogImpl","6158859265",RemoteObject.createImmutable("Back REPORTS"),0);
 BA.debugLineNum = 412;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
Debug.ShouldStop(134217728);
report.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",report.processBA,(Object)((report.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturn")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 413;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
report.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 414;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(536870912);
report.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _liststabpanel_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,406);
if (RapidSub.canDelegate("liststabpanel_pageselected")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","liststabpanel_pageselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 406;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 408;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainlogo_click() throws Exception{
try {
		Debug.PushSubsStack("mainLogo_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,514);
if (RapidSub.canDelegate("mainlogo_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","mainlogo_click");}
 BA.debugLineNum = 514;BA.debugLine="Sub mainLogo_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 515;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(4);
_listsbuttonclose_click();
 BA.debugLineNum = 516;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private MyPositionLat, MyPositionLon As String";
report._mypositionlat = RemoteObject.createImmutable("");
report._mypositionlon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Private TimeStart As Timer";
report._timestart = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="Public Device As Phone";
report._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _startdateselect_click() throws Exception{
try {
		Debug.PushSubsStack("StartDateSelect_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,485);
if (RapidSub.canDelegate("startdateselect_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","startdateselect_click");}
 BA.debugLineNum = 485;BA.debugLine="Sub StartDateSelect_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 496;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startreportactivity(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("StartReportActivity (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,277);
if (RapidSub.canDelegate("startreportactivity")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","startreportactivity", _index);}
RemoteObject _snames = null;
RemoteObject _icount = null;
RemoteObject _whereclause = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _icolors = null;
int _i = 0;
RemoteObject _padd_normal = null;
RemoteObject _padd_inner = null;
RemoteObject _total = RemoteObject.createImmutable(0);
Debug.locals.put("index", _index);
 BA.debugLineNum = 277;BA.debugLine="Sub StartReportActivity(index As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 282;BA.debugLine="Dim sNames() As String";
Debug.ShouldStop(33554432);
_snames = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("sNames", _snames);
 BA.debugLineNum = 283;BA.debugLine="Dim iCount() As Int";
Debug.ShouldStop(67108864);
_icount = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});Debug.locals.put("iCount", _icount);
 BA.debugLineNum = 284;BA.debugLine="Dim whereclause As String = \"\"";
Debug.ShouldStop(134217728);
_whereclause = BA.ObjectToString("");Debug.locals.put("whereclause", _whereclause);Debug.locals.put("whereclause", _whereclause);
 BA.debugLineNum = 285;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(268435456);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 286;BA.debugLine="If (index = 0) Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 287;BA.debugLine="whereclause = \" where a.execute_date >= (date('n";
Debug.ShouldStop(1073741824);
_whereclause = BA.ObjectToString(" where a.execute_date >= (date('now','-1 month')) ");Debug.locals.put("whereclause", _whereclause);
 }else 
{ BA.debugLineNum = 288;BA.debugLine="Else If (index = 1) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 289;BA.debugLine="whereclause = \" \"";
Debug.ShouldStop(1);
_whereclause = BA.ObjectToString(" ");Debug.locals.put("whereclause", _whereclause);
 }else 
{ BA.debugLineNum = 290;BA.debugLine="Else If (index = 2) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 291;BA.debugLine="whereclause = \" where a.execute_date = date('now";
Debug.ShouldStop(4);
_whereclause = BA.ObjectToString(" where a.execute_date = date('now', 'localtime') ");Debug.locals.put("whereclause", _whereclause);
 }}}
;
 BA.debugLineNum = 298;BA.debugLine="Dim sSQL As String = $\"${DBStructures.EVC_SQL_KPI";
Debug.ShouldStop(512);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),report.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((report.mostCurrent._dbstructures._evc_sql_kpiall_status /*RemoteObject*/ ))),RemoteObject.createImmutable(" "),report.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_whereclause))),RemoteObject.createImmutable(" group by a.status_id order by a.status_id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 299;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(1024);
report.mostCurrent.__c.runVoidMethod ("LogImpl","6158466070",_ssql,0);
 BA.debugLineNum = 300;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(2048);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), report.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 301;BA.debugLine="Dim ret As Int = Record.RowCount";
Debug.ShouldStop(4096);
_ret = _record.runMethod(true,"getRowCount");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 302;BA.debugLine="If (ret >= 1) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("g",_ret,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 303;BA.debugLine="Dim iColors(ret) As Int ' As List";
Debug.ShouldStop(16384);
_icolors = RemoteObject.createNewArray ("int", new int[] {_ret.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("iColors", _icolors);
 BA.debugLineNum = 304;BA.debugLine="Dim sNames(ret) As String ' As List";
Debug.ShouldStop(32768);
_snames = RemoteObject.createNewArray ("String", new int[] {_ret.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("sNames", _snames);
 BA.debugLineNum = 305;BA.debugLine="Dim iCount(ret) As Int ' As List";
Debug.ShouldStop(65536);
_icount = RemoteObject.createNewArray ("int", new int[] {_ret.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("iCount", _icount);
 BA.debugLineNum = 306;BA.debugLine="For i=0 To ret-1";
Debug.ShouldStop(131072);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_ret,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20) ;_i = ((int)(0 + _i + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 307;BA.debugLine="Record.Position = i";
Debug.ShouldStop(262144);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 312;BA.debugLine="iColors(i) = Utils.ColorString(Record.GetString";
Debug.ShouldStop(8388608);
_icolors.setArrayElement (report.mostCurrent._utils.runMethod(true,"_colorstring" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_color"))))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 313;BA.debugLine="sNames(i) = Record.GetString(\"status_desc\")";
Debug.ShouldStop(16777216);
_snames.setArrayElement (_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_desc"))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 314;BA.debugLine="iCount(i) = Record.GetInt(\"counter\")";
Debug.ShouldStop(33554432);
_icount.setArrayElement (_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("counter"))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 317;BA.debugLine="Record.Close";
Debug.ShouldStop(268435456);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 319;BA.debugLine="createPieChart(pc0, iCount, sNames, iColors)";
Debug.ShouldStop(1073741824);
_createpiechart(report.mostCurrent._pc0,_icount,_snames,_icolors);
 BA.debugLineNum = 320;BA.debugLine="createPieChart(pc1, iCount, sNames, iColors)";
Debug.ShouldStop(-2147483648);
_createpiechart(report.mostCurrent._pc1,_icount,_snames,_icolors);
 BA.debugLineNum = 322;BA.debugLine="Dim padd_Normal() As Int = Array As Int (10dip, 0";
Debug.ShouldStop(2);
_padd_normal = RemoteObject.createNewArray("int",new int[] {4},new Object[] {report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)});Debug.locals.put("padd_Normal", _padd_normal);Debug.locals.put("padd_Normal", _padd_normal);
 BA.debugLineNum = 323;BA.debugLine="Dim padd_Inner() As Int = Array As Int (50dip, 0,";
Debug.ShouldStop(4);
_padd_inner = RemoteObject.createNewArray("int",new int[] {4},new Object[] {report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)});Debug.locals.put("padd_Inner", _padd_inner);Debug.locals.put("padd_Inner", _padd_inner);
 BA.debugLineNum = 324;BA.debugLine="KPIList.Clear";
Debug.ShouldStop(8);
report.mostCurrent._kpilist.runVoidMethod ("_clear");
 BA.debugLineNum = 325;BA.debugLine="KPIListAll.Clear";
Debug.ShouldStop(16);
report.mostCurrent._kpilistall.runVoidMethod ("_clear");
 BA.debugLineNum = 327;BA.debugLine="If (sNames.Length >= 1) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("g",_snames.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 328;BA.debugLine="Dim total As Int = 0";
Debug.ShouldStop(128);
_total = BA.numberCast(int.class, 0);Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 329;BA.debugLine="For i=0 To iCount.Length-1";
Debug.ShouldStop(256);
{
final int step36 = 1;
final int limit36 = RemoteObject.solve(new RemoteObject[] {_icount.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36) ;_i = ((int)(0 + _i + step36))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 330;BA.debugLine="total = total + iCount(i)";
Debug.ShouldStop(512);
_total = RemoteObject.solve(new RemoteObject[] {_total,_icount.getArrayElement(true,BA.numberCast(int.class, _i))}, "+",1, 1);Debug.locals.put("total", _total);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 333;BA.debugLine="KPIList.Add( CreateKPIRecord( \"Total de interven";
Debug.ShouldStop(4096);
report.mostCurrent._kpilist.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createkpirecord(BA.ObjectToString("Total de intervenções"),BA.NumberToString(_total),BA.ObjectToString(""),_padd_normal,report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 334;BA.debugLine="KPIListAll.Add( CreateKPIRecordAll( \"Total de in";
Debug.ShouldStop(8192);
report.mostCurrent._kpilistall.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createkpirecordall(BA.ObjectToString("Total de intervenções"),BA.NumberToString(_total),BA.ObjectToString("---"),_padd_normal,report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 335;BA.debugLine="For i=0 To sNames.Length-1";
Debug.ShouldStop(16384);
{
final int step41 = 1;
final int limit41 = RemoteObject.solve(new RemoteObject[] {_snames.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step41 > 0 && _i <= limit41) || (step41 < 0 && _i >= limit41) ;_i = ((int)(0 + _i + step41))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 336;BA.debugLine="KPIList.Add( CreateKPIRecord( sNames(i), iCount";
Debug.ShouldStop(32768);
report.mostCurrent._kpilist.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createkpirecord(_snames.getArrayElement(true,BA.numberCast(int.class, _i)),BA.NumberToString(_icount.getArrayElement(true,BA.numberCast(int.class, _i))),BA.ObjectToString(""),_padd_inner,report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 337;BA.debugLine="KPIListAll.Add( CreateKPIRecordAll( sNames(i),";
Debug.ShouldStop(65536);
report.mostCurrent._kpilistall.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createkpirecordall(_snames.getArrayElement(true,BA.numberCast(int.class, _i)),BA.NumberToString(_icount.getArrayElement(true,BA.numberCast(int.class, _i))),BA.ObjectToString("---"),_padd_inner,report.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 340;BA.debugLine="listPeriods.SetItems(Utils.GetListStrArrayItems(";
Debug.ShouldStop(524288);
report.mostCurrent._listperiods.runClassMethod (xevolution.vrcg.devdemov2400.b4xcombobox2.class, "_setitems" /*RemoteObject*/ ,(Object)(report.mostCurrent._utils.runMethod(false,"_getliststrarrayitems" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Últimos 30 dias"),BA.ObjectToString("Desde o ínicio"),RemoteObject.createImmutable("Intervenções do dia")})))));
 BA.debugLineNum = 341;BA.debugLine="listPeriods.SelectedIndex = index";
Debug.ShouldStop(1048576);
report.mostCurrent._listperiods.runClassMethod (xevolution.vrcg.devdemov2400.b4xcombobox2.class, "_setselectedindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timestart_tick() throws Exception{
try {
		Debug.PushSubsStack("TimeStart_Tick (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,269);
if (RapidSub.canDelegate("timestart_tick")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","timestart_tick");}
 BA.debugLineNum = 269;BA.debugLine="Sub TimeStart_Tick";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="KPIUpdateProgress.Progress = KPIUpdateProgress.Pr";
Debug.ShouldStop(8192);
report.mostCurrent._kpiupdateprogress.runMethod(true,"setProgress",RemoteObject.solve(new RemoteObject[] {report.mostCurrent._kpiupdateprogress.runMethod(true,"getProgress"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 271;BA.debugLine="If (KPIUpdateProgress.Progress = 100) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",report.mostCurrent._kpiupdateprogress.runMethod(true,"getProgress"),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 272;BA.debugLine="TimeStart.Enabled = False";
Debug.ShouldStop(32768);
report._timestart.runMethod(true,"setEnabled",report.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 273;BA.debugLine="KPIUpdateProgress.Progress =0";
Debug.ShouldStop(65536);
report.mostCurrent._kpiupdateprogress.runMethod(true,"setProgress",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemainlayout() throws Exception{
try {
		Debug.PushSubsStack("UpdateMainLayout (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,184);
if (RapidSub.canDelegate("updatemainlayout")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","updatemainlayout");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 184;BA.debugLine="Sub UpdateMainLayout";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
Debug.ShouldStop(16777216);
report.mostCurrent._mainlabeloptlists.runMethod(true,"setTextColor",report.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(33554432);
if (report.mostCurrent.__c.runMethod(true,"Not",(Object)(report.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 187;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
Debug.ShouldStop(67108864);
report.mostCurrent._mainlogo.runMethod(true,"setGravity",report.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 188;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
Debug.ShouldStop(134217728);
report.mostCurrent._mainlogo.runMethod(true,"setWidth",report.mostCurrent._consts._logowidth /*RemoteObject*/ );
 };
 BA.debugLineNum = 190;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
Debug.ShouldStop(536870912);
report.mostCurrent.__c.runVoidMethod ("LogImpl","6158072838",(RemoteObject.concat(RemoteObject.createImmutable("Inicialização de BMP: "),report.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((report.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 191;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
Debug.ShouldStop(1073741824);
if ((report.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(report.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 192;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
Debug.ShouldStop(-2147483648);
report.mostCurrent._mainlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((report.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(report.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 };
 BA.debugLineNum = 197;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(16);
report.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,report.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), report.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 198;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
Debug.ShouldStop(32);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), report.mostCurrent._liststabpanel);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 199;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(64);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 201;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
Debug.ShouldStop(256);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndicatorColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(report.mostCurrent._consts._colormain /*RemoteObject*/ )})));
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _whouses_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("whouses_Click (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,397);
if (RapidSub.canDelegate("whouses_click")) { return xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","whouses_click", _menuname);}
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 397;BA.debugLine="Sub whouses_Click(MenuName As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 403;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _windowstatusupdate() throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,204);
if (RapidSub.canDelegate("windowstatusupdate")) { xevolution.vrcg.devdemov2400.report.remoteMe.runUserSub(false, "report","windowstatusupdate"); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.report parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.report parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (report) ","report",49,report.mostCurrent.activityBA,report.mostCurrent,204);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 205;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,report.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 206;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("StopService",report.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 207;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StopService",report.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 208;BA.debugLine="StopService(UserService)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("StopService",report.processBA,(Object)((parent.mostCurrent._userservice.getObject())));
 BA.debugLineNum = 209;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("StopService",report.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 210;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",report.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 211;BA.debugLine="Sleep(500)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Sleep",report.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "report", "windowstatusupdate"),BA.numberCast(int.class, 500));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
 BA.debugLineNum = 212;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 214;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(2097152);
parent.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 215;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
Debug.ShouldStop(4194304);
parent.mostCurrent._labelcopyright.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/ ));
 BA.debugLineNum = 216;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
Debug.ShouldStop(8388608);
parent.mostCurrent._mainactiveuser.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ));
 BA.debugLineNum = 218;BA.debugLine="ButtonAppNetwork.Enabled = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 219;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
Debug.ShouldStop(67108864);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 220;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//if
this.state = 8;
if ((parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 221;BA.debugLine="ButtonAppNetwork.Enabled = True";
Debug.ShouldStop(268435456);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 222;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
Debug.ShouldStop(536870912);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 224;BA.debugLine="ButtonUserUnavailable.Enabled = False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 225;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
Debug.ShouldStop(1);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
Debug.ShouldStop(2);
if (true) break;

case 9:
//if
this.state = 12;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._usr_state /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 227;BA.debugLine="ButtonUserUnavailable.Enabled = True";
Debug.ShouldStop(4);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 228;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
Debug.ShouldStop(8);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 231;BA.debugLine="ButtonActionPause.Enabled = False";
Debug.ShouldStop(64);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 232;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
Debug.ShouldStop(128);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 234;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(512);
if (true) break;

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 235;BA.debugLine="ButtonActionPause.Enabled = True";
Debug.ShouldStop(1024);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 236;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorRedOra";
Debug.ShouldStop(2048);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}