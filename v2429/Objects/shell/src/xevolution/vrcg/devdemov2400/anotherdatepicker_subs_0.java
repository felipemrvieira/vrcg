package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class anotherdatepicker_subs_0 {


public static RemoteObject  _afterloadlayout(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("AfterLoadLayout (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("afterloadlayout")) { return __ref.runUserSub(false, "anotherdatepicker","afterloadlayout", __ref, _props);}
RemoteObject _act = RemoteObject.declareNull("anywheresoftware.b4a.objects.ActivityWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
int _y = 0;
RemoteObject _m = RemoteObject.createImmutable("");
RemoteObject _alldays = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _days = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _d = RemoteObject.createImmutable("");
Debug.locals.put("Props", _props);
 BA.debugLineNum = 79;BA.debugLine="Public Sub AfterLoadLayout (Props As Map)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="waitForAddToActivity = False";
Debug.ShouldStop(32768);
__ref.setField ("_waitforaddtoactivity" /*RemoteObject*/ ,anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 81;BA.debugLine="holder.Initialize(\"holder\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("holder")));
 BA.debugLineNum = 82;BA.debugLine="holder.Elevation = 2000dip";
Debug.ShouldStop(131072);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"setElevation",BA.numberCast(float.class, anotherdatepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2000)))));
 BA.debugLineNum = 84;BA.debugLine="holder.Visible = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="holder.Color = Colors.Transparent";
Debug.ShouldStop(1048576);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runVoidMethod ("setColor",anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 86;BA.debugLine="Dim act As Activity = Props.Get(\"activity\")";
Debug.ShouldStop(2097152);
_act = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");
_act = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("activity")))));Debug.locals.put("act", _act);
 BA.debugLineNum = 87;BA.debugLine="act.AddView(holder, (100%x/2)-(440dip/2), 150dip,";
Debug.ShouldStop(4194304);
_act.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_holder" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {anotherdatepicker.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {anotherdatepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 440))),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(anotherdatepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(anotherdatepicker.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(anotherdatepicker.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 88;BA.debugLine="holder.LoadLayout(\"DatePicker_small\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DatePicker_small")),__ref.getField(false, "ba"));
 BA.debugLineNum = 89;BA.debugLine="Dim p As Panel = holder.GetView(0)";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 90;BA.debugLine="p.Color = Props.Get(\"BackgroundColor\")";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("setColor",BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BackgroundColor"))))));
 BA.debugLineNum = 91;BA.debugLine="If Props.Get(\"CancelVisible\") = False And Props.G";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CancelVisible")))),(anotherdatepicker.__c.getField(true,"False"))) && RemoteObject.solveBoolean("=",_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TodayVisible")))),(anotherdatepicker.__c.getField(true,"False")))) { 
_p.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getHeight"),anotherdatepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1));};
 BA.debugLineNum = 92;BA.debugLine="btnToday.Visible = Props.Get(\"TodayVisible\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btntoday" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TodayVisible"))))));
 BA.debugLineNum = 93;BA.debugLine="btnCancel.Visible = Props.Get(\"CancelVisible\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btncancel" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CancelVisible"))))));
 BA.debugLineNum = 94;BA.debugLine="daysNames = Array As Label(Label1, Label2, Label3";
Debug.ShouldStop(536870912);
__ref.setField ("_daysnames" /*RemoteObject*/ ,RemoteObject.createNewArray("anywheresoftware.b4a.objects.LabelWrapper",new int[] {7},new Object[] {__ref.getField(false,"_label1" /*RemoteObject*/ ),__ref.getField(false,"_label2" /*RemoteObject*/ ),__ref.getField(false,"_label3" /*RemoteObject*/ ),__ref.getField(false,"_label4" /*RemoteObject*/ ),__ref.getField(false,"_label5" /*RemoteObject*/ ),__ref.getField(false,"_label6" /*RemoteObject*/ ),__ref.getField(false,"_label7" /*RemoteObject*/ )}));
 BA.debugLineNum = 95;BA.debugLine="Dim et As EditText";
Debug.ShouldStop(1073741824);
_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");Debug.locals.put("et", _et);
 BA.debugLineNum = 96;BA.debugLine="et.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_et.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 97;BA.debugLine="targetLabel.Background = et.Background 'make the";
Debug.ShouldStop(1);
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runMethod(false,"setBackground",_et.runMethod(false,"getBackground"));
 BA.debugLineNum = 98;BA.debugLine="cvs.Initialize(DaysPanel)";
Debug.ShouldStop(2);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_dayspanel" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 99;BA.debugLine="cvsBackground.Initialize(DaysPanelBackground)";
Debug.ShouldStop(4);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_dayspanelbackground" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 100;BA.debugLine="selectedColor = Props.Get(\"SelectedColor\")";
Debug.ShouldStop(8);
__ref.setField ("_selectedcolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SelectedColor"))))));
 BA.debugLineNum = 101;BA.debugLine="tempSelectedColor = Props.Get(\"HighlightedColor\")";
Debug.ShouldStop(16);
__ref.setField ("_tempselectedcolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HighlightedColor"))))));
 BA.debugLineNum = 102;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
Debug.ShouldStop(32);
__ref.setField ("_month" /*RemoteObject*/ ,anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 103;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
Debug.ShouldStop(64);
__ref.setField ("_year" /*RemoteObject*/ ,anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 104;BA.debugLine="minYear = Props.Get(\"MinYear\")";
Debug.ShouldStop(128);
__ref.setField ("_minyear" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MinYear"))))));
 BA.debugLineNum = 105;BA.debugLine="maxYear = Props.Get(\"MaxYear\")";
Debug.ShouldStop(256);
__ref.setField ("_maxyear" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MaxYear"))))));
 BA.debugLineNum = 106;BA.debugLine="For y = minYear To maxYear";
Debug.ShouldStop(512);
{
final int step26 = 1;
final int limit26 = __ref.getField(true,"_maxyear" /*RemoteObject*/ ).<Integer>get().intValue();
_y = __ref.getField(true,"_minyear" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step26 > 0 && _y <= limit26) || (step26 < 0 && _y >= limit26) ;_y = ((int)(0 + _y + step26))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 107;BA.debugLine="Years.Add(y)";
Debug.ShouldStop(1024);
__ref.getField(false,"_years" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_y)));
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 109;BA.debugLine="For Each m As String In DateUtils.GetMonthsNames";
Debug.ShouldStop(4096);
{
final RemoteObject group29 = anotherdatepicker._dateutils.runMethod(false,"_getmonthsnames",__ref.getField(false, "ba"));
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_m = BA.ObjectToString(group29.runMethod(false,"Get",index29));Debug.locals.put("m", _m);
Debug.locals.put("m", _m);
 BA.debugLineNum = 110;BA.debugLine="Months.Add(m)";
Debug.ShouldStop(8192);
__ref.getField(false,"_months" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_m));
 }
}Debug.locals.put("m", _m);
;
 BA.debugLineNum = 112;BA.debugLine="Dim alldays As List = Regex.Split(\"\\|\", \"Sunday|M";
Debug.ShouldStop(32768);
_alldays = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_alldays = anotherdatepicker.__c.runMethod(false, "ArrayToList", (Object)(anotherdatepicker.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(RemoteObject.createImmutable("Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday")))));Debug.locals.put("alldays", _alldays);Debug.locals.put("alldays", _alldays);
 BA.debugLineNum = 113;BA.debugLine="firstDay = alldays.IndexOf(Props.Get(\"FirstDay\"))";
Debug.ShouldStop(65536);
__ref.setField ("_firstday" /*RemoteObject*/ ,_alldays.runMethod(true,"IndexOf",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstDay")))))));
 BA.debugLineNum = 114;BA.debugLine="Dim days As List = DateUtils.GetDaysNames";
Debug.ShouldStop(131072);
_days = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_days = anotherdatepicker._dateutils.runMethod(false,"_getdaysnames",__ref.getField(false, "ba"));Debug.locals.put("days", _days);Debug.locals.put("days", _days);
 BA.debugLineNum = 115;BA.debugLine="For i = firstDay To firstDay + 7 - 1";
Debug.ShouldStop(262144);
{
final int step35 = 1;
final int limit35 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_firstday" /*RemoteObject*/ ),RemoteObject.createImmutable(7),RemoteObject.createImmutable(1)}, "+-",2, 1).<Integer>get().intValue();
_i = __ref.getField(true,"_firstday" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step35 > 0 && _i <= limit35) || (step35 < 0 && _i >= limit35) ;_i = ((int)(0 + _i + step35))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 116;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
Debug.ShouldStop(524288);
_d = BA.ObjectToString(_days.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(7)}, "%",0, 1))));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 117;BA.debugLine="daysNames(i - firstDay).Text = d.SubString2(0, 2";
Debug.ShouldStop(1048576);
__ref.getField(false,"_daysnames" /*RemoteObject*/ ).getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_firstday" /*RemoteObject*/ )}, "-",1, 1)).runMethod(true,"setText",BA.ObjectToCharSequence(_d.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 119;BA.debugLine="SetDate(DateTime.Now, False)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_setdate" /*RemoteObject*/ ,(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(anotherdatepicker.__c.getField(true,"False")));
 BA.debugLineNum = 120;BA.debugLine="vCorrection = cvs.MeasureStringHeight(\"1\", Typefa";
Debug.ShouldStop(8388608);
__ref.setField ("_vcorrection" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringHeight",(Object)(BA.ObjectToString("1")),(Object)(anotherdatepicker.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTextSize"))),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 121;BA.debugLine="boxW = cvs.Bitmap.Width / 7";
Debug.ShouldStop(16777216);
__ref.setField ("_boxw" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getBitmap").runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0)));
 BA.debugLineNum = 122;BA.debugLine="boxH = cvs.Bitmap.Height / 6";
Debug.ShouldStop(33554432);
__ref.setField ("_boxh" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getBitmap").runMethod(true,"getHeight"),RemoteObject.createImmutable(6)}, "/",0, 0)));
 BA.debugLineNum = 123;BA.debugLine="lblSelectedDay.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 124;BA.debugLine="DrawDays";
Debug.ShouldStop(134217728);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Base_Click (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("base_click")) { return __ref.runUserSub(false, "anotherdatepicker","base_click", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Sub Base_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="CallSub(mTarget, mEventName & \"_Click\")";
Debug.ShouldStop(128);
anotherdatepicker.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCancel_Click (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "anotherdatepicker","btncancel_click", __ref);}
 BA.debugLineNum = 247;BA.debugLine="Public Sub btnCancel_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", True, G";
Debug.ShouldStop(8388608);
anotherdatepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))),(Object)((anotherdatepicker.__c.getField(true,"True"))),(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 249;BA.debugLine="Hide";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntoday_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnToday_Click (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("btntoday_click")) { return __ref.runUserSub(false, "anotherdatepicker","btntoday_click", __ref);}
 BA.debugLineNum = 241;BA.debugLine="Private Sub btnToday_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="SetDate(DateTime.Now, True)";
Debug.ShouldStop(131072);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_setdate" /*RemoteObject*/ ,(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(anotherdatepicker.__c.getField(true,"True")));
 BA.debugLineNum = 243;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False,";
Debug.ShouldStop(262144);
anotherdatepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))),(Object)((anotherdatepicker.__c.getField(true,"False"))),(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 244;BA.debugLine="Hide";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private holder As Panel";
anotherdatepicker._holder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_holder",anotherdatepicker._holder);
 //BA.debugLineNum = 15;BA.debugLine="Private cvs, cvsBackground As Canvas";
anotherdatepicker._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvs",anotherdatepicker._cvs);
anotherdatepicker._cvsbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvsbackground",anotherdatepicker._cvsbackground);
 //BA.debugLineNum = 16;BA.debugLine="Private DaysPanel As Panel";
anotherdatepicker._dayspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_dayspanel",anotherdatepicker._dayspanel);
 //BA.debugLineNum = 17;BA.debugLine="Private month, year As Int";
anotherdatepicker._month = RemoteObject.createImmutable(0);__ref.setField("_month",anotherdatepicker._month);
anotherdatepicker._year = RemoteObject.createImmutable(0);__ref.setField("_year",anotherdatepicker._year);
 //BA.debugLineNum = 18;BA.debugLine="Private Months As Spinner";
anotherdatepicker._months = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_months",anotherdatepicker._months);
 //BA.debugLineNum = 19;BA.debugLine="Private Years As Spinner";
anotherdatepicker._years = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_years",anotherdatepicker._years);
 //BA.debugLineNum = 20;BA.debugLine="Private boxW, boxH As Float";
anotherdatepicker._boxw = RemoteObject.createImmutable(0f);__ref.setField("_boxw",anotherdatepicker._boxw);
anotherdatepicker._boxh = RemoteObject.createImmutable(0f);__ref.setField("_boxh",anotherdatepicker._boxh);
 //BA.debugLineNum = 21;BA.debugLine="Private vCorrection As Float";
anotherdatepicker._vcorrection = RemoteObject.createImmutable(0f);__ref.setField("_vcorrection",anotherdatepicker._vcorrection);
 //BA.debugLineNum = 22;BA.debugLine="Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DO";
anotherdatepicker._action_up = BA.numberCast(int.class, 1);__ref.setField("_action_up",anotherdatepicker._action_up);
anotherdatepicker._action_move = BA.numberCast(int.class, 2);__ref.setField("_action_move",anotherdatepicker._action_move);
anotherdatepicker._action_down = BA.numberCast(int.class, 0);__ref.setField("_action_down",anotherdatepicker._action_down);
 //BA.debugLineNum = 23;BA.debugLine="Private tempSelectedDay As Int";
anotherdatepicker._tempselectedday = RemoteObject.createImmutable(0);__ref.setField("_tempselectedday",anotherdatepicker._tempselectedday);
 //BA.debugLineNum = 24;BA.debugLine="Private DaysPanelBackground As Panel";
anotherdatepicker._dayspanelbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_dayspanelbackground",anotherdatepicker._dayspanelbackground);
 //BA.debugLineNum = 25;BA.debugLine="Private dayOfWeekOffset As Int";
anotherdatepicker._dayofweekoffset = RemoteObject.createImmutable(0);__ref.setField("_dayofweekoffset",anotherdatepicker._dayofweekoffset);
 //BA.debugLineNum = 26;BA.debugLine="Private daysInMonth As Int";
anotherdatepicker._daysinmonth = RemoteObject.createImmutable(0);__ref.setField("_daysinmonth",anotherdatepicker._daysinmonth);
 //BA.debugLineNum = 27;BA.debugLine="Private tempSelectedColor As Int";
anotherdatepicker._tempselectedcolor = RemoteObject.createImmutable(0);__ref.setField("_tempselectedcolor",anotherdatepicker._tempselectedcolor);
 //BA.debugLineNum = 28;BA.debugLine="Private selectedColor As Int";
anotherdatepicker._selectedcolor = RemoteObject.createImmutable(0);__ref.setField("_selectedcolor",anotherdatepicker._selectedcolor);
 //BA.debugLineNum = 29;BA.debugLine="Private lblSelectedDay As Label";
anotherdatepicker._lblselectedday = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblselectedday",anotherdatepicker._lblselectedday);
 //BA.debugLineNum = 30;BA.debugLine="Private selectedDate As Long";
anotherdatepicker._selecteddate = RemoteObject.createImmutable(0L);__ref.setField("_selecteddate",anotherdatepicker._selecteddate);
 //BA.debugLineNum = 31;BA.debugLine="Private targetLabel As Label";
anotherdatepicker._targetlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_targetlabel",anotherdatepicker._targetlabel);
 //BA.debugLineNum = 32;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
anotherdatepicker._selectedyear = RemoteObject.createImmutable(0);__ref.setField("_selectedyear",anotherdatepicker._selectedyear);
anotherdatepicker._selectedmonth = RemoteObject.createImmutable(0);__ref.setField("_selectedmonth",anotherdatepicker._selectedmonth);
anotherdatepicker._selectedday = RemoteObject.createImmutable(0);__ref.setField("_selectedday",anotherdatepicker._selectedday);
 //BA.debugLineNum = 33;BA.debugLine="Private Label1 As Label";
anotherdatepicker._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",anotherdatepicker._label1);
 //BA.debugLineNum = 34;BA.debugLine="Private Label2 As Label";
anotherdatepicker._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2",anotherdatepicker._label2);
 //BA.debugLineNum = 35;BA.debugLine="Private Label3 As Label";
anotherdatepicker._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3",anotherdatepicker._label3);
 //BA.debugLineNum = 36;BA.debugLine="Private Label4 As Label";
anotherdatepicker._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label4",anotherdatepicker._label4);
 //BA.debugLineNum = 37;BA.debugLine="Private Label5 As Label";
anotherdatepicker._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label5",anotherdatepicker._label5);
 //BA.debugLineNum = 38;BA.debugLine="Private Label6 As Label";
anotherdatepicker._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label6",anotherdatepicker._label6);
 //BA.debugLineNum = 39;BA.debugLine="Private Label7 As Label";
anotherdatepicker._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label7",anotherdatepicker._label7);
 //BA.debugLineNum = 40;BA.debugLine="Private daysNames() As Label";
anotherdatepicker._daysnames = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});__ref.setField("_daysnames",anotherdatepicker._daysnames);
 //BA.debugLineNum = 41;BA.debugLine="Private mTarget As Object";
anotherdatepicker._mtarget = RemoteObject.createNew ("Object");__ref.setField("_mtarget",anotherdatepicker._mtarget);
 //BA.debugLineNum = 42;BA.debugLine="Private mEventName As String";
anotherdatepicker._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",anotherdatepicker._meventname);
 //BA.debugLineNum = 43;BA.debugLine="Private waitForAddToActivity As Boolean";
anotherdatepicker._waitforaddtoactivity = RemoteObject.createImmutable(false);__ref.setField("_waitforaddtoactivity",anotherdatepicker._waitforaddtoactivity);
 //BA.debugLineNum = 44;BA.debugLine="Private minYear, maxYear, firstDay As Int";
anotherdatepicker._minyear = RemoteObject.createImmutable(0);__ref.setField("_minyear",anotherdatepicker._minyear);
anotherdatepicker._maxyear = RemoteObject.createImmutable(0);__ref.setField("_maxyear",anotherdatepicker._maxyear);
anotherdatepicker._firstday = RemoteObject.createImmutable(0);__ref.setField("_firstday",anotherdatepicker._firstday);
 //BA.debugLineNum = 45;BA.debugLine="Private btnCancel, btnToday As Button";
anotherdatepicker._btncancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btncancel",anotherdatepicker._btncancel);
anotherdatepicker._btntoday = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btntoday",anotherdatepicker._btntoday);
 //BA.debugLineNum = 47;BA.debugLine="Private InitialMapProp As Map";
anotherdatepicker._initialmapprop = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_initialmapprop",anotherdatepicker._initialmapprop);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dayspanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DaysPanel_Touch (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("dayspanel_touch")) { return __ref.runUserSub(false, "anotherdatepicker","dayspanel_touch", __ref, _action, _x, _y);}
RemoteObject _boxx = RemoteObject.createImmutable(0);
RemoteObject _boxy = RemoteObject.createImmutable(0);
RemoteObject _newselectedday = RemoteObject.createImmutable(0);
RemoteObject _validday = RemoteObject.createImmutable(false);
Debug.locals.put("ACTION", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 198;BA.debugLine="Private Sub DaysPanel_Touch (ACTION As Int, X As F";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="Dim boxX = X / boxW, boxY = Y / boxH As Int";
Debug.ShouldStop(64);
_boxx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("boxX", _boxx);Debug.locals.put("boxX", _boxx);
_boxy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("boxY", _boxy);Debug.locals.put("boxY", _boxy);
 BA.debugLineNum = 200;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
Debug.ShouldStop(128);
_newselectedday = RemoteObject.solve(new RemoteObject[] {_boxy,RemoteObject.createImmutable(7),_boxx,RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "*++-",3, 1);Debug.locals.put("newSelectedDay", _newselectedday);Debug.locals.put("newSelectedDay", _newselectedday);
 BA.debugLineNum = 201;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
Debug.ShouldStop(256);
_validday = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_newselectedday,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",_newselectedday,BA.numberCast(double.class, __ref.getField(true,"_daysinmonth" /*RemoteObject*/ ))));Debug.locals.put("validDay", _validday);Debug.locals.put("validDay", _validday);
 BA.debugLineNum = 202;BA.debugLine="If ACTION = ACTION_DOWN Or ACTION = ACTION_MOVE T";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_down" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_move" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 203;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_newselectedday,BA.numberCast(double.class, __ref.getField(true,"_tempselectedday" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 204;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent) 'cle";
Debug.ShouldStop(2048);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 205;BA.debugLine="tempSelectedDay = newSelectedDay";
Debug.ShouldStop(4096);
__ref.setField ("_tempselectedday" /*RemoteObject*/ ,_newselectedday);
 BA.debugLineNum = 206;BA.debugLine="If validDay Then";
Debug.ShouldStop(8192);
if (_validday.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 207;BA.debugLine="DrawBox(cvsBackground, tempSelectedColor, boxX,";
Debug.ShouldStop(16384);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_drawbox" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cvsbackground" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempselectedcolor" /*RemoteObject*/ )),(Object)(_boxx),(Object)(_boxy));
 BA.debugLineNum = 208;BA.debugLine="lblSelectedDay.Text = newSelectedDay";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_newselectedday));
 BA.debugLineNum = 209;BA.debugLine="lblSelectedDay.Visible = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 211;BA.debugLine="lblSelectedDay.Visible = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 };
 }else 
{ BA.debugLineNum = 213;BA.debugLine="Else If ACTION = ACTION_UP Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_up" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 214;BA.debugLine="lblSelectedDay.Visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 215;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 216;BA.debugLine="If validDay Then";
Debug.ShouldStop(8388608);
if (_validday.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 217;BA.debugLine="SelectDay(newSelectedDay, True)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_selectday" /*RemoteObject*/ ,(Object)(_newselectedday),(Object)(anotherdatepicker.__c.getField(true,"True")));
 BA.debugLineNum = 218;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False";
Debug.ShouldStop(33554432);
anotherdatepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))),(Object)((anotherdatepicker.__c.getField(true,"False"))),(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 219;BA.debugLine="Hide";
Debug.ShouldStop(67108864);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_hide" /*RemoteObject*/ );
 };
 }}
;
 BA.debugLineNum = 222;BA.debugLine="DaysPanelBackground.Invalidate";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dayspanelbackground" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "anotherdatepicker","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("props", _props);
 BA.debugLineNum = 57;BA.debugLine="Public Sub DesignerCreateView(Base As Panel, lbl A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim targetLabel As Label";
Debug.ShouldStop(33554432);
anotherdatepicker._targetlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_targetlabel",anotherdatepicker._targetlabel);
 BA.debugLineNum = 59;BA.debugLine="targetLabel.Initialize(\"lbl\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 60;BA.debugLine="targetLabel.TextSize = lbl.TextSize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runMethod(true,"setTextSize",_lbl.runMethod(true,"getTextSize"));
 BA.debugLineNum = 61;BA.debugLine="targetLabel.TextColor = lbl.TextColor";
Debug.ShouldStop(268435456);
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runMethod(true,"setTextColor",_lbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 62;BA.debugLine="Base.AddView(targetLabel, 0, 0, Base.Width, Base.";
Debug.ShouldStop(536870912);
_base.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_base.runMethod(true,"getWidth")),(Object)(_base.runMethod(true,"getHeight")));
 BA.debugLineNum = 63;BA.debugLine="Base.Color = Colors.Transparent";
Debug.ShouldStop(1073741824);
_base.runVoidMethod ("setColor",anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 64;BA.debugLine="waitForAddToActivity = True";
Debug.ShouldStop(-2147483648);
__ref.setField ("_waitforaddtoactivity" /*RemoteObject*/ ,anotherdatepicker.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="InitialMapProp = props";
Debug.ShouldStop(4);
__ref.setField ("_initialmapprop" /*RemoteObject*/ ,_props);
 BA.debugLineNum = 68;BA.debugLine="CallSubDelayed2(Me, \"AfterLoadLayout\", props)";
Debug.ShouldStop(8);
anotherdatepicker.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("AfterLoadLayout")),(Object)((_props)));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Disable (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("disable")) { return __ref.runUserSub(false, "anotherdatepicker","disable", __ref);}
 BA.debugLineNum = 184;BA.debugLine="Public Sub Disable";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="If waitForAddToActivity Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_waitforaddtoactivity" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 186;BA.debugLine="CallSubDelayed(Me, \"Disable\")";
Debug.ShouldStop(33554432);
anotherdatepicker.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("Disable")));
 BA.debugLineNum = 187;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 189;BA.debugLine="holder.Enabled = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"setEnabled",anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawbox(RemoteObject __ref,RemoteObject _c,RemoteObject _clr,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DrawBox (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("drawbox")) { return __ref.runUserSub(false, "anotherdatepicker","drawbox", __ref, _c, _clr, _x, _y);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
Debug.locals.put("c", _c);
Debug.locals.put("clr", _clr);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 192;BA.debugLine="Private Sub DrawBox(c As Canvas, clr As Int, x As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="Dim r As Rect";
Debug.ShouldStop(1);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("r", _r);
 BA.debugLineNum = 194;BA.debugLine="r.Initialize(x * boxW, y * boxH, (x + 1) * boxW,";
Debug.ShouldStop(2);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_y,RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 195;BA.debugLine="c.DrawRect(r, clr, True, 0)";
Debug.ShouldStop(4);
_c.runVoidMethod ("DrawRect",(Object)((_r.getObject())),(Object)(_clr),(Object)(anotherdatepicker.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawdays(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawDays (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("drawdays")) { return __ref.runUserSub(false, "anotherdatepicker","drawdays", __ref);}
RemoteObject _firstdayofmonth = RemoteObject.createImmutable(0L);
int _day = 0;
RemoteObject _row = RemoteObject.createImmutable(0);
 BA.debugLineNum = 144;BA.debugLine="Private Sub DrawDays";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
Debug.ShouldStop(65536);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 146;BA.debugLine="cvs.DrawColor(Colors.Transparent)";
Debug.ShouldStop(131072);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 147;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.SetDate(y";
Debug.ShouldStop(262144);
_firstdayofmonth = RemoteObject.solve(new RemoteObject[] {anotherdatepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(1)}, "-",1, 2);Debug.locals.put("firstDayOfMonth", _firstdayofmonth);Debug.locals.put("firstDayOfMonth", _firstdayofmonth);
 BA.debugLineNum = 148;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
Debug.ShouldStop(524288);
__ref.setField ("_dayofweekoffset" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(7),anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_firstdayofmonth)),__ref.getField(true,"_firstday" /*RemoteObject*/ )}, "+-",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1));
 BA.debugLineNum = 149;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
Debug.ShouldStop(1048576);
__ref.setField ("_daysinmonth" /*RemoteObject*/ ,anotherdatepicker._dateutils.runMethod(true,"_numberofdaysinmonth",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ ))));
 BA.debugLineNum = 150;BA.debugLine="If year = selectedYear And month = selectedMonth";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectedyear" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",__ref.getField(true,"_month" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectedmonth" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 152;BA.debugLine="DrawBox(cvs, selectedColor, (selectedDay - 1 + d";
Debug.ShouldStop(8388608);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_drawbox" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_selectedcolor" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedday" /*RemoteObject*/ ),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedday" /*RemoteObject*/ ),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "/",0, 0))));
 };
 BA.debugLineNum = 155;BA.debugLine="For day = 1 To daysInMonth";
Debug.ShouldStop(67108864);
{
final int step9 = 1;
final int limit9 = __ref.getField(true,"_daysinmonth" /*RemoteObject*/ ).<Integer>get().intValue();
_day = 1 ;
for (;(step9 > 0 && _day <= limit9) || (step9 < 0 && _day >= limit9) ;_day = ((int)(0 + _day + step9))  ) {
Debug.locals.put("day", _day);
 BA.debugLineNum = 156;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
Debug.ShouldStop(134217728);
_row = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "/",0, 0));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 157;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(BA.NumberToString(_day)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ ),RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1)}, "+-",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)),RemoteObject.createImmutable(0.5)}, "+",1, 0)),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(0.5)}, "+",1, 0)),__ref.getField(true,"_boxh" /*RemoteObject*/ ),__ref.getField(true,"_vcorrection" /*RemoteObject*/ )}, "*+",1, 0))),(Object)(anotherdatepicker.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTextSize")),(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 }
}Debug.locals.put("day", _day);
;
 BA.debugLineNum = 160;BA.debugLine="DaysPanel.Invalidate";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dayspanel" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Enable (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("enable")) { return __ref.runUserSub(false, "anotherdatepicker","enable", __ref);}
 BA.debugLineNum = 176;BA.debugLine="Public Sub Enable";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="If waitForAddToActivity Then";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_waitforaddtoactivity" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 178;BA.debugLine="CallSubDelayed(Me, \"Enable\")";
Debug.ShouldStop(131072);
anotherdatepicker.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("Enable")));
 BA.debugLineNum = 179;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 181;BA.debugLine="holder.Enabled = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"setEnabled",anotherdatepicker.__c.getField(true,"True"));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDate (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("getdate")) { return __ref.runUserSub(false, "anotherdatepicker","getdate", __ref);}
 BA.debugLineNum = 127;BA.debugLine="Public Sub GetDate As Long";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Return selectedDate";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(true,"_selecteddate" /*RemoteObject*/ );
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "anotherdatepicker","hide", __ref);}
 BA.debugLineNum = 171;BA.debugLine="Public Sub Hide";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="holder.SetVisibleAnimated(500, False)";
Debug.ShouldStop(2048);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(anotherdatepicker.__c.getField(true,"False")));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _holder_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("holder_Click (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("holder_click")) { return __ref.runUserSub(false, "anotherdatepicker","holder_click", __ref);}
 BA.debugLineNum = 264;BA.debugLine="Private Sub holder_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="btnCancel_Click";
Debug.ShouldStop(256);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_btncancel_click" /*RemoteObject*/ );
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _target,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "anotherdatepicker","initialize", __ref, _ba, _target, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Target", _target);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 52;BA.debugLine="Public Sub Initialize (Target As Object, EventName";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="mTarget = Target";
Debug.ShouldStop(1048576);
__ref.setField ("_mtarget" /*RemoteObject*/ ,_target);
 BA.debugLineNum = 54;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(2097152);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsVisible (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("isvisible")) { return __ref.runUserSub(false, "anotherdatepicker","isvisible", __ref);}
 BA.debugLineNum = 261;BA.debugLine="Public Sub IsVisible As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="Return holder.Visible";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lbl_Click (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("lbl_click")) { return __ref.runUserSub(false, "anotherdatepicker","lbl_click", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Private Sub lbl_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Show";
Debug.ShouldStop(2048);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _months_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Months_ItemClick (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("months_itemclick")) { return __ref.runUserSub(false, "anotherdatepicker","months_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 252;BA.debugLine="Private Sub Months_ItemClick (Position As Int, Val";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="month = Position + 1";
Debug.ShouldStop(268435456);
__ref.setField ("_month" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 254;BA.debugLine="DrawDays";
Debug.ShouldStop(536870912);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectday(RemoteObject __ref,RemoteObject _day,RemoteObject _updatelabel) throws Exception{
try {
		Debug.PushSubsStack("SelectDay (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("selectday")) { return __ref.runUserSub(false, "anotherdatepicker","selectday", __ref, _day, _updatelabel);}
Debug.locals.put("day", _day);
Debug.locals.put("UpdateLabel", _updatelabel);
 BA.debugLineNum = 163;BA.debugLine="Private Sub SelectDay(day As Int, UpdateLabel As B";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="selectedDate = DateUtils.SetDate(year, month, day";
Debug.ShouldStop(8);
__ref.setField ("_selecteddate" /*RemoteObject*/ ,anotherdatepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(_day)));
 BA.debugLineNum = 165;BA.debugLine="selectedDay = day";
Debug.ShouldStop(16);
__ref.setField ("_selectedday" /*RemoteObject*/ ,_day);
 BA.debugLineNum = 166;BA.debugLine="selectedMonth = month";
Debug.ShouldStop(32);
__ref.setField ("_selectedmonth" /*RemoteObject*/ ,__ref.getField(true,"_month" /*RemoteObject*/ ));
 BA.debugLineNum = 167;BA.debugLine="selectedYear = year";
Debug.ShouldStop(64);
__ref.setField ("_selectedyear" /*RemoteObject*/ ,__ref.getField(true,"_year" /*RemoteObject*/ ));
 BA.debugLineNum = 168;BA.debugLine="If UpdateLabel Then targetLabel.Text = DateTime.D";
Debug.ShouldStop(128);
if (_updatelabel.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_selecteddate" /*RemoteObject*/ )))));};
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdate(RemoteObject __ref,RemoteObject _date,RemoteObject _updatelabel) throws Exception{
try {
		Debug.PushSubsStack("SetDate (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("setdate")) { return __ref.runUserSub(false, "anotherdatepicker","setdate", __ref, _date, _updatelabel);}
Debug.locals.put("date", _date);
Debug.locals.put("UpdateLabel", _updatelabel);
 BA.debugLineNum = 132;BA.debugLine="Public Sub SetDate(date As Long, UpdateLabel As Bo";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="If waitForAddToActivity Then";
Debug.ShouldStop(16);
if (__ref.getField(true,"_waitforaddtoactivity" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 134;BA.debugLine="CallSubDelayed3(Me, \"SetDate\", date, UpdateLabel";
Debug.ShouldStop(32);
anotherdatepicker.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("SetDate")),(Object)((_date)),(Object)((_updatelabel)));
 BA.debugLineNum = 135;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 137;BA.debugLine="year = DateTime.GetYear(date)";
Debug.ShouldStop(256);
__ref.setField ("_year" /*RemoteObject*/ ,anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date)));
 BA.debugLineNum = 138;BA.debugLine="month = DateTime.GetMonth(date)";
Debug.ShouldStop(512);
__ref.setField ("_month" /*RemoteObject*/ ,anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date)));
 BA.debugLineNum = 139;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date), UpdateLab";
Debug.ShouldStop(1024);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_selectday" /*RemoteObject*/ ,(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_date))),(Object)(_updatelabel));
 BA.debugLineNum = 140;BA.debugLine="Years.SelectedIndex = year - minYear";
Debug.ShouldStop(2048);
__ref.getField(false,"_years" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_year" /*RemoteObject*/ ),__ref.getField(true,"_minyear" /*RemoteObject*/ )}, "-",1, 1));
 BA.debugLineNum = 141;BA.debugLine="Months.SelectedIndex = month - 1";
Debug.ShouldStop(4096);
__ref.getField(false,"_months" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_month" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "anotherdatepicker","show", __ref);}
 BA.debugLineNum = 225;BA.debugLine="Public Sub Show";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="If waitForAddToActivity Then";
Debug.ShouldStop(2);
if (__ref.getField(true,"_waitforaddtoactivity" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 228;BA.debugLine="CallSubDelayed(Me, \"show\")";
Debug.ShouldStop(8);
anotherdatepicker.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("show")));
 BA.debugLineNum = 229;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 231;BA.debugLine="holder.SetVisibleAnimated(500, True)";
Debug.ShouldStop(64);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(anotherdatepicker.__c.getField(true,"True")));
 BA.debugLineNum = 232;BA.debugLine="DrawDays";
Debug.ShouldStop(128);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showonthispanel(RemoteObject __ref,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("ShowOnThisPanel (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("showonthispanel")) { return __ref.runUserSub(false, "anotherdatepicker","showonthispanel", __ref, _pnl);}
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 235;BA.debugLine="Public Sub ShowOnThisPanel(pnl As Panel)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="holder = pnl";
Debug.ShouldStop(2048);
__ref.setField ("_holder" /*RemoteObject*/ ,_pnl);
 BA.debugLineNum = 238;BA.debugLine="CallSubDelayed(Me, \"show\")";
Debug.ShouldStop(8192);
anotherdatepicker.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("show")));
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _years_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Years_ItemClick (anotherdatepicker) ","anotherdatepicker",12,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("years_itemclick")) { return __ref.runUserSub(false, "anotherdatepicker","years_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 257;BA.debugLine="Private Sub Years_ItemClick (Position As Int, Valu";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="year = Value";
Debug.ShouldStop(2);
__ref.setField ("_year" /*RemoteObject*/ ,BA.numberCast(int.class, _value));
 BA.debugLineNum = 259;BA.debugLine="DrawDays";
Debug.ShouldStop(4);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.anotherdatepicker.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}