package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class monthviewcalendar_subs_0 {


public static RemoteObject  _addlabel(RemoteObject __ref,RemoteObject _dest,RemoteObject _txt,RemoteObject _align,RemoteObject _bkcol,RemoteObject _forcol) throws Exception{
try {
		Debug.PushSubsStack("AddLabel (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("addlabel")) { return __ref.runUserSub(false, "monthviewcalendar","addlabel", __ref, _dest, _txt, _align, _bkcol, _forcol);}
Debug.locals.put("dest", _dest);
Debug.locals.put("txt", _txt);
Debug.locals.put("align", _align);
Debug.locals.put("bkcol", _bkcol);
Debug.locals.put("forcol", _forcol);
 BA.debugLineNum = 347;BA.debugLine="Sub AddLabel(dest As Panel, txt As String, align A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 348;BA.debugLine="Log($\"AddLabel --> ${txt}, ${dest.Width}:${dest.H";
Debug.ShouldStop(134217728);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6145293313",(RemoteObject.concat(RemoteObject.createImmutable("AddLabel --> "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_txt))),RemoteObject.createImmutable(", "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dest.runMethod(true,"getWidth")))),RemoteObject.createImmutable(":"),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dest.runMethod(true,"getHeight")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 349;BA.debugLine="dest.AddView(LabelMake(txt, align, bkcol, forcol,";
Debug.ShouldStop(268435456);
_dest.runVoidMethod ("AddView",(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_labelmake" /*RemoteObject*/ ,(Object)(_txt),(Object)(_align),(Object)(_bkcol),(Object)(_forcol),(Object)(_dest.runMethod(true,"getWidth")),(Object)(_dest.runMethod(true,"getHeight"))).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_dest.runMethod(true,"getWidth")),(Object)(_dest.runMethod(true,"getHeight")));
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlabelpos(RemoteObject __ref,RemoteObject _dest,RemoteObject _txt,RemoteObject _align,RemoteObject _bkcol,RemoteObject _forcol,RemoteObject _left,RemoteObject _right,RemoteObject _brd,RemoteObject _brdcolor) throws Exception{
try {
		Debug.PushSubsStack("AddLabelPos (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("addlabelpos")) { return __ref.runUserSub(false, "monthviewcalendar","addlabelpos", __ref, _dest, _txt, _align, _bkcol, _forcol, _left, _right, _brd, _brdcolor);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("dest", _dest);
Debug.locals.put("txt", _txt);
Debug.locals.put("align", _align);
Debug.locals.put("bkcol", _bkcol);
Debug.locals.put("forcol", _forcol);
Debug.locals.put("left", _left);
Debug.locals.put("right", _right);
Debug.locals.put("brd", _brd);
Debug.locals.put("brdcolor", _brdcolor);
 BA.debugLineNum = 352;BA.debugLine="Sub AddLabelPos(dest As Panel, txt As String, alig";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="Log($\"AddLabelPOS --> ${txt}, ${left}:${right}\"$)";
Debug.ShouldStop(1);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6145358849",(RemoteObject.concat(RemoteObject.createImmutable("AddLabelPOS --> "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_txt))),RemoteObject.createImmutable(", "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_left))),RemoteObject.createImmutable(":"),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_right))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 354;BA.debugLine="Dim lbl As Label = LabelMake(txt, align, bkcol, f";
Debug.ShouldStop(2);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = __ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_labelmake" /*RemoteObject*/ ,(Object)(_txt),(Object)(_align),(Object)(_bkcol),(Object)(_forcol),(Object)(RemoteObject.solve(new RemoteObject[] {_right,_left}, "-",1, 1)),(Object)(_dest.runMethod(true,"getHeight")));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 355;BA.debugLine="If brd >= 1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",_brd,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 356;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(8);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 357;BA.debugLine="cd.Initialize2(Colors.Transparent, GeneralRadius";
Debug.ShouldStop(16);
_cd.runVoidMethod ("Initialize2",(Object)(monthviewcalendar.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(__ref.getField(true,"_generalradius" /*RemoteObject*/ )),(Object)(_brd),(Object)(_brdcolor));
 BA.debugLineNum = 358;BA.debugLine="lbl.Background = cd";
Debug.ShouldStop(32);
_lbl.runMethod(false,"setBackground",(_cd.getObject()));
 };
 BA.debugLineNum = 360;BA.debugLine="dest.AddView(lbl, left, 0, right-left, dest.Heigh";
Debug.ShouldStop(128);
_dest.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(_left),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_right,_left}, "-",1, 1)),(Object)(_dest.runMethod(true,"getHeight")));
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlist(RemoteObject __ref,RemoteObject _dest,RemoteObject _name,RemoteObject _values,RemoteObject _index,RemoteObject _align,RemoteObject _bkcol,RemoteObject _forcol) throws Exception{
try {
		Debug.PushSubsStack("AddList (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("addlist")) { return __ref.runUserSub(false, "monthviewcalendar","addlist", __ref, _dest, _name, _values, _index, _align, _bkcol, _forcol);}
RemoteObject _spn = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
RemoteObject _arrval = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("dest", _dest);
Debug.locals.put("name", _name);
Debug.locals.put("values", _values);
Debug.locals.put("index", _index);
Debug.locals.put("align", _align);
Debug.locals.put("bkcol", _bkcol);
Debug.locals.put("forcol", _forcol);
 BA.debugLineNum = 363;BA.debugLine="Sub AddList(dest As Panel, name As String, values";
Debug.ShouldStop(1024);
 BA.debugLineNum = 364;BA.debugLine="Dim spn As Spinner";
Debug.ShouldStop(2048);
_spn = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");Debug.locals.put("spn", _spn);
 BA.debugLineNum = 365;BA.debugLine="If (name.ToLowerCase = \"cmbboxmonth\") Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",_name.runMethod(true,"toLowerCase"),RemoteObject.createImmutable("cmbboxmonth")))) { 
 BA.debugLineNum = 366;BA.debugLine="MonthList.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_monthlist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 367;BA.debugLine="Months.Initialize(\"Months\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_months" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Months")));
 BA.debugLineNum = 368;BA.debugLine="spn = Months";
Debug.ShouldStop(32768);
_spn = __ref.getField(false,"_months" /*RemoteObject*/ );Debug.locals.put("spn", _spn);
 }else {
 BA.debugLineNum = 370;BA.debugLine="YearsList.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_yearslist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 371;BA.debugLine="Years.Initialize(\"Years\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_years" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Years")));
 BA.debugLineNum = 372;BA.debugLine="spn = Years";
Debug.ShouldStop(524288);
_spn = __ref.getField(false,"_years" /*RemoteObject*/ );Debug.locals.put("spn", _spn);
 };
 BA.debugLineNum = 374;BA.debugLine="spn.Color = bkcol";
Debug.ShouldStop(2097152);
_spn.runVoidMethod ("setColor",_bkcol);
 BA.debugLineNum = 375;BA.debugLine="spn.TextColor = forcol";
Debug.ShouldStop(4194304);
_spn.runMethod(true,"setTextColor",_forcol);
 BA.debugLineNum = 378;BA.debugLine="Dim arrVal As List = Regex.Split(\"\\|\", values)";
Debug.ShouldStop(33554432);
_arrval = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_arrval = monthviewcalendar.__c.runMethod(false, "ArrayToList", (Object)(monthviewcalendar.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_values))));Debug.locals.put("arrVal", _arrval);Debug.locals.put("arrVal", _arrval);
 BA.debugLineNum = 379;BA.debugLine="For i = 0 To arrVal.Size-1";
Debug.ShouldStop(67108864);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_arrval.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 380;BA.debugLine="spn.Add(arrVal.Get(i))";
Debug.ShouldStop(134217728);
_spn.runVoidMethod ("Add",(Object)(BA.ObjectToString(_arrval.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 381;BA.debugLine="If (name.ToLowerCase = \"cmbboxmonth\") Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",_name.runMethod(true,"toLowerCase"),RemoteObject.createImmutable("cmbboxmonth")))) { 
 BA.debugLineNum = 382;BA.debugLine="MonthList.Add(arrVal.Get(i))";
Debug.ShouldStop(536870912);
__ref.getField(false,"_monthlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_arrval.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }else {
 BA.debugLineNum = 384;BA.debugLine="YearsList.Add(arrVal.Get(i))";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_yearslist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_arrval.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 388;BA.debugLine="spn.SelectedIndex = index";
Debug.ShouldStop(8);
_spn.runMethod(true,"setSelectedIndex",_index);
 BA.debugLineNum = 390;BA.debugLine="If align = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_align,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 391;BA.debugLine="dest.AddView(spn, 0, 0, dest.Width/2, dest.Heigh";
Debug.ShouldStop(64);
_dest.runVoidMethod ("AddView",(Object)((_spn.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_dest.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_dest.runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 393;BA.debugLine="dest.AddView(spn, dest.Width/2, 0, dest.Width/2,";
Debug.ShouldStop(256);
_dest.runVoidMethod ("AddView",(Object)((_spn.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_dest.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_dest.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_dest.runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _afterloadlayout(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("AfterLoadLayout (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("afterloadlayout")) { return __ref.runUserSub(false, "monthviewcalendar","afterloadlayout", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 106;BA.debugLine="Public Sub AfterLoadLayout (Props As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Log(\"***************** AFTER LOAD LAYOUT ********";
Debug.ShouldStop(1024);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144506881",RemoteObject.createImmutable("***************** AFTER LOAD LAYOUT *****************"),0);
 BA.debugLineNum = 108;BA.debugLine="waitForAddToActivity = False";
Debug.ShouldStop(2048);
__ref.setField ("_waitforaddtoactivity" /*RemoteObject*/ ,monthviewcalendar.__c.getField(true,"False"));
 BA.debugLineNum = 109;BA.debugLine="GeneralRadius = Props.Get(\"GeneralRadius\")";
Debug.ShouldStop(4096);
__ref.setField ("_generalradius" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("GeneralRadius"))))));
 BA.debugLineNum = 111;BA.debugLine="month = GetCurrentMonth";
Debug.ShouldStop(16384);
__ref.setField ("_month" /*RemoteObject*/ ,__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getcurrentmonth" /*RemoteObject*/ ));
 BA.debugLineNum = 112;BA.debugLine="year = GetCurrentYear";
Debug.ShouldStop(32768);
__ref.setField ("_year" /*RemoteObject*/ ,__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getcurrentyear" /*RemoteObject*/ ));
 BA.debugLineNum = 113;BA.debugLine="InitializeComponents";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_initializecomponents" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="If SetDimensions(Props) Then";
Debug.ShouldStop(131072);
if (__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_setdimensions" /*RemoteObject*/ ,(Object)(_props)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 115;BA.debugLine="selectedMonth = month";
Debug.ShouldStop(262144);
__ref.setField ("_selectedmonth" /*RemoteObject*/ ,__ref.getField(true,"_month" /*RemoteObject*/ ));
 BA.debugLineNum = 116;BA.debugLine="selectedYear = year";
Debug.ShouldStop(524288);
__ref.setField ("_selectedyear" /*RemoteObject*/ ,__ref.getField(true,"_year" /*RemoteObject*/ ));
 BA.debugLineNum = 117;BA.debugLine="cvs.Initialize(CellsPanel)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 119;BA.debugLine="vCorrection = cvs.MeasureStringHeight(\"1\", Typef";
Debug.ShouldStop(4194304);
__ref.setField ("_vcorrection" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringHeight",(Object)(BA.ObjectToString("1")),(Object)(monthviewcalendar.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CellFontSize"))))))),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 120;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
Debug.ShouldStop(8388608);
if (BA.ObjectToBoolean((_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowWeekNumber")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 121;BA.debugLine="boxW = cvs.Bitmap.Width / 8";
Debug.ShouldStop(16777216);
__ref.setField ("_boxw" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getBitmap").runMethod(true,"getWidth"),RemoteObject.createImmutable(8)}, "/",0, 0)));
 }else {
 BA.debugLineNum = 123;BA.debugLine="boxW = cvs.Bitmap.Width / 7";
Debug.ShouldStop(67108864);
__ref.setField ("_boxw" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getBitmap").runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0)));
 };
 BA.debugLineNum = 125;BA.debugLine="boxH = cvs.Bitmap.Height / 7";
Debug.ShouldStop(268435456);
__ref.setField ("_boxh" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getBitmap").runMethod(true,"getHeight"),RemoteObject.createImmutable(7)}, "/",0, 0)));
 BA.debugLineNum = 126;BA.debugLine="cvsBackground.Initialize(CellsPanelBack)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 127;BA.debugLine="innerMaps = Props";
Debug.ShouldStop(1073741824);
__ref.setField ("_innermaps" /*RemoteObject*/ ,_props);
 BA.debugLineNum = 128;BA.debugLine="DrawDays(innerMaps)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_drawdays" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_innermaps" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cellspanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("CellsPanel_Touch (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("cellspanel_touch")) { return __ref.runUserSub(false, "monthviewcalendar","cellspanel_touch", __ref, _action, _x, _y);}
RemoteObject _boxx = RemoteObject.createImmutable(0);
RemoteObject _boxy = RemoteObject.createImmutable(0);
RemoteObject _newselectedday = RemoteObject.createImmutable(0);
RemoteObject _validday = RemoteObject.createImmutable(false);
Debug.locals.put("ACTION", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 250;BA.debugLine="Private Sub CellsPanel_Touch (ACTION As Int, X As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim boxX = X / boxW, boxY = Y / boxH As Int";
Debug.ShouldStop(67108864);
_boxx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("boxX", _boxx);Debug.locals.put("boxX", _boxx);
_boxy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("boxY", _boxy);Debug.locals.put("boxY", _boxy);
 BA.debugLineNum = 252;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
Debug.ShouldStop(134217728);
_newselectedday = RemoteObject.solve(new RemoteObject[] {_boxy,RemoteObject.createImmutable(7),_boxx,RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "*++-",3, 1);Debug.locals.put("newSelectedDay", _newselectedday);Debug.locals.put("newSelectedDay", _newselectedday);
 BA.debugLineNum = 253;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
Debug.ShouldStop(268435456);
_validday = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_newselectedday,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",_newselectedday,BA.numberCast(double.class, __ref.getField(true,"_daysinmonth" /*RemoteObject*/ ))));Debug.locals.put("validDay", _validday);Debug.locals.put("validDay", _validday);
 BA.debugLineNum = 255;BA.debugLine="year = Years.GetItem( Years.SelectedIndex )   ' =";
Debug.ShouldStop(1073741824);
__ref.setField ("_year" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_years" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_years" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")))));
 BA.debugLineNum = 256;BA.debugLine="month = Months.SelectedIndex +1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_month" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_months" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 258;BA.debugLine="If ACTION = ACTION_DOWN Or ACTION = ACTION_MOVE T";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_down" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_move" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 259;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_newselectedday,BA.numberCast(double.class, __ref.getField(true,"_tempselectedday" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 260;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent) 'cle";
Debug.ShouldStop(8);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(monthviewcalendar.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 261;BA.debugLine="tempSelectedDay = newSelectedDay";
Debug.ShouldStop(16);
__ref.setField ("_tempselectedday" /*RemoteObject*/ ,_newselectedday);
 BA.debugLineNum = 262;BA.debugLine="If validDay Then";
Debug.ShouldStop(32);
if (_validday.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 263;BA.debugLine="DrawBox(cvsBackground, tempSelectedColor, boxX,";
Debug.ShouldStop(64);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_drawbox" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cvsbackground" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempselectedcolor" /*RemoteObject*/ )),(Object)(_boxx),(Object)(_boxy));
 BA.debugLineNum = 264;BA.debugLine="lblSelectedDay.Text = newSelectedDay";
Debug.ShouldStop(128);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_newselectedday));
 BA.debugLineNum = 265;BA.debugLine="lblSelectedDay.Visible = True";
Debug.ShouldStop(256);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",monthviewcalendar.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 267;BA.debugLine="lblSelectedDay.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",monthviewcalendar.__c.getField(true,"False"));
 };
 }else 
{ BA.debugLineNum = 269;BA.debugLine="Else If ACTION = ACTION_UP Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_up" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 270;BA.debugLine="lblSelectedDay.Visible = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",monthviewcalendar.__c.getField(true,"False"));
 BA.debugLineNum = 271;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
Debug.ShouldStop(16384);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(monthviewcalendar.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 272;BA.debugLine="If validDay Then";
Debug.ShouldStop(32768);
if (_validday.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 273;BA.debugLine="SelectDay(newSelectedDay, True)";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_selectday" /*RemoteObject*/ ,(Object)(_newselectedday),(Object)(monthviewcalendar.__c.getField(true,"True")));
 BA.debugLineNum = 274;BA.debugLine="CallSub3(mCallBack, mEventName & \"_Closed\", Fal";
Debug.ShouldStop(131072);
monthviewcalendar.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))),(Object)((monthviewcalendar.__c.getField(true,"False"))),(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 275;BA.debugLine="Hide";
Debug.ShouldStop(262144);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_hide" /*RemoteObject*/ );
 };
 }}
;
 BA.debugLineNum = 278;BA.debugLine="CellsPanelBack.Invalidate";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 279;BA.debugLine="Log($\"${year} : ${month}\"$)";
Debug.ShouldStop(4194304);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144834589",(RemoteObject.concat(RemoteObject.createImmutable(""),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_year" /*RemoteObject*/ )))),RemoteObject.createImmutable(" : "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_month" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 50;BA.debugLine="Private mEventName As String 'ignore";
monthviewcalendar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",monthviewcalendar._meventname);
 //BA.debugLineNum = 51;BA.debugLine="Private mCallBack As Object 'ignore";
monthviewcalendar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",monthviewcalendar._mcallback);
 //BA.debugLineNum = 52;BA.debugLine="Private mBase As Panel";
monthviewcalendar._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",monthviewcalendar._mbase);
 //BA.debugLineNum = 53;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
monthviewcalendar._defaultcolorconstant = BA.numberCast(int.class, -(double) (0 + 984833));__ref.setField("_defaultcolorconstant",monthviewcalendar._defaultcolorconstant);
 //BA.debugLineNum = 54;BA.debugLine="Private Const PanelMinHeight As Int = 50dip";
monthviewcalendar._panelminheight = monthviewcalendar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)));__ref.setField("_panelminheight",monthviewcalendar._panelminheight);
 //BA.debugLineNum = 55;BA.debugLine="Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DO";
monthviewcalendar._action_up = BA.numberCast(int.class, 1);__ref.setField("_action_up",monthviewcalendar._action_up);
monthviewcalendar._action_move = BA.numberCast(int.class, 2);__ref.setField("_action_move",monthviewcalendar._action_move);
monthviewcalendar._action_down = BA.numberCast(int.class, 0);__ref.setField("_action_down",monthviewcalendar._action_down);
 //BA.debugLineNum = 57;BA.debugLine="Private TitlePanel As Panel";
monthviewcalendar._titlepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_titlepanel",monthviewcalendar._titlepanel);
 //BA.debugLineNum = 58;BA.debugLine="Private MonthPanel As Panel";
monthviewcalendar._monthpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_monthpanel",monthviewcalendar._monthpanel);
 //BA.debugLineNum = 59;BA.debugLine="Private WeekPanel As Panel";
monthviewcalendar._weekpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_weekpanel",monthviewcalendar._weekpanel);
 //BA.debugLineNum = 60;BA.debugLine="Private CellsPanel As Panel";
monthviewcalendar._cellspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_cellspanel",monthviewcalendar._cellspanel);
 //BA.debugLineNum = 61;BA.debugLine="Private CellsPanelBack As Panel";
monthviewcalendar._cellspanelback = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_cellspanelback",monthviewcalendar._cellspanelback);
 //BA.debugLineNum = 64;BA.debugLine="Private Months As Spinner";
monthviewcalendar._months = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_months",monthviewcalendar._months);
 //BA.debugLineNum = 65;BA.debugLine="Private Years As Spinner";
monthviewcalendar._years = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_years",monthviewcalendar._years);
 //BA.debugLineNum = 67;BA.debugLine="Private waitForAddToActivity As Boolean";
monthviewcalendar._waitforaddtoactivity = RemoteObject.createImmutable(false);__ref.setField("_waitforaddtoactivity",monthviewcalendar._waitforaddtoactivity);
 //BA.debugLineNum = 68;BA.debugLine="Private GeneralRadius As Int";
monthviewcalendar._generalradius = RemoteObject.createImmutable(0);__ref.setField("_generalradius",monthviewcalendar._generalradius);
 //BA.debugLineNum = 70;BA.debugLine="Private cvs As Canvas";
monthviewcalendar._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvs",monthviewcalendar._cvs);
 //BA.debugLineNum = 71;BA.debugLine="Private cvsBackground As Canvas";
monthviewcalendar._cvsbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvsbackground",monthviewcalendar._cvsbackground);
 //BA.debugLineNum = 72;BA.debugLine="Private month, year As Int";
monthviewcalendar._month = RemoteObject.createImmutable(0);__ref.setField("_month",monthviewcalendar._month);
monthviewcalendar._year = RemoteObject.createImmutable(0);__ref.setField("_year",monthviewcalendar._year);
 //BA.debugLineNum = 73;BA.debugLine="Private lmonth, lyear As Int";
monthviewcalendar._lmonth = RemoteObject.createImmutable(0);__ref.setField("_lmonth",monthviewcalendar._lmonth);
monthviewcalendar._lyear = RemoteObject.createImmutable(0);__ref.setField("_lyear",monthviewcalendar._lyear);
 //BA.debugLineNum = 74;BA.debugLine="Private tempSelectedDay As Int";
monthviewcalendar._tempselectedday = RemoteObject.createImmutable(0);__ref.setField("_tempselectedday",monthviewcalendar._tempselectedday);
 //BA.debugLineNum = 76;BA.debugLine="Private targetLabel As Label";
monthviewcalendar._targetlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_targetlabel",monthviewcalendar._targetlabel);
 //BA.debugLineNum = 77;BA.debugLine="Private lblSelectedDay As Label";
monthviewcalendar._lblselectedday = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblselectedday",monthviewcalendar._lblselectedday);
 //BA.debugLineNum = 78;BA.debugLine="Private dayOfWeekOffset As Int";
monthviewcalendar._dayofweekoffset = RemoteObject.createImmutable(0);__ref.setField("_dayofweekoffset",monthviewcalendar._dayofweekoffset);
 //BA.debugLineNum = 79;BA.debugLine="Private daysInMonth As Int";
monthviewcalendar._daysinmonth = RemoteObject.createImmutable(0);__ref.setField("_daysinmonth",monthviewcalendar._daysinmonth);
 //BA.debugLineNum = 80;BA.debugLine="Private tempSelectedColor As Int";
monthviewcalendar._tempselectedcolor = RemoteObject.createImmutable(0);__ref.setField("_tempselectedcolor",monthviewcalendar._tempselectedcolor);
 //BA.debugLineNum = 81;BA.debugLine="Private selectedColor As Int";
monthviewcalendar._selectedcolor = RemoteObject.createImmutable(0);__ref.setField("_selectedcolor",monthviewcalendar._selectedcolor);
 //BA.debugLineNum = 82;BA.debugLine="Private minYear, maxYear, firstDay As Int";
monthviewcalendar._minyear = RemoteObject.createImmutable(0);__ref.setField("_minyear",monthviewcalendar._minyear);
monthviewcalendar._maxyear = RemoteObject.createImmutable(0);__ref.setField("_maxyear",monthviewcalendar._maxyear);
monthviewcalendar._firstday = RemoteObject.createImmutable(0);__ref.setField("_firstday",monthviewcalendar._firstday);
 //BA.debugLineNum = 83;BA.debugLine="Private selectedDate As Long";
monthviewcalendar._selecteddate = RemoteObject.createImmutable(0L);__ref.setField("_selecteddate",monthviewcalendar._selecteddate);
 //BA.debugLineNum = 84;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
monthviewcalendar._selectedyear = RemoteObject.createImmutable(0);__ref.setField("_selectedyear",monthviewcalendar._selectedyear);
monthviewcalendar._selectedmonth = RemoteObject.createImmutable(0);__ref.setField("_selectedmonth",monthviewcalendar._selectedmonth);
monthviewcalendar._selectedday = RemoteObject.createImmutable(0);__ref.setField("_selectedday",monthviewcalendar._selectedday);
 //BA.debugLineNum = 85;BA.debugLine="Private boxW, boxH As Float";
monthviewcalendar._boxw = RemoteObject.createImmutable(0f);__ref.setField("_boxw",monthviewcalendar._boxw);
monthviewcalendar._boxh = RemoteObject.createImmutable(0f);__ref.setField("_boxh",monthviewcalendar._boxh);
 //BA.debugLineNum = 86;BA.debugLine="Private vCorrection As Float";
monthviewcalendar._vcorrection = RemoteObject.createImmutable(0f);__ref.setField("_vcorrection",monthviewcalendar._vcorrection);
 //BA.debugLineNum = 87;BA.debugLine="Dim YearsList, MonthList As List";
monthviewcalendar._yearslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_yearslist",monthviewcalendar._yearslist);
monthviewcalendar._monthlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_monthlist",monthviewcalendar._monthlist);
 //BA.debugLineNum = 89;BA.debugLine="Private innerMaps As Map";
monthviewcalendar._innermaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_innermaps",monthviewcalendar._innermaps);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "monthviewcalendar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 97;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="If (Base.IsInitialized = False) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_base.runMethod(true,"IsInitialized"),monthviewcalendar.__c.getField(true,"False")))) { 
 BA.debugLineNum = 99;BA.debugLine="Base.Initialize(\"\")";
Debug.ShouldStop(4);
_base.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 101;BA.debugLine="mBase = Base";
Debug.ShouldStop(16);
__ref.setField ("_mbase" /*RemoteObject*/ ,_base);
 BA.debugLineNum = 102;BA.debugLine="waitForAddToActivity = True";
Debug.ShouldStop(32);
__ref.setField ("_waitforaddtoactivity" /*RemoteObject*/ ,monthviewcalendar.__c.getField(true,"True"));
 BA.debugLineNum = 103;BA.debugLine="CallSubDelayed2(Me, \"AfterLoadLayout\", Props)";
Debug.ShouldStop(64);
monthviewcalendar.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("AfterLoadLayout")),(Object)((_props)));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("DrawBox (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,484);
if (RapidSub.canDelegate("drawbox")) { return __ref.runUserSub(false, "monthviewcalendar","drawbox", __ref, _c, _clr, _x, _y);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
Debug.locals.put("c", _c);
Debug.locals.put("clr", _clr);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 484;BA.debugLine="Private Sub DrawBox(c As Canvas, clr As Int, x As";
Debug.ShouldStop(8);
 BA.debugLineNum = 485;BA.debugLine="Dim r As Rect";
Debug.ShouldStop(16);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("r", _r);
 BA.debugLineNum = 486;BA.debugLine="r.Initialize(x * boxW, y * boxH, (x + 1) * boxW,";
Debug.ShouldStop(32);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_y,RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 487;BA.debugLine="c.DrawRect(r, clr, True, 0)";
Debug.ShouldStop(64);
_c.runVoidMethod ("DrawRect",(Object)((_r.getObject())),(Object)(_clr),(Object)(monthviewcalendar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 488;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawdays(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DrawDays (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,444);
if (RapidSub.canDelegate("drawdays")) { return __ref.runUserSub(false, "monthviewcalendar","drawdays", __ref, _props);}
RemoteObject _firstdayofmonth = RemoteObject.createImmutable(0L);
int _day = 0;
RemoteObject _row = RemoteObject.createImmutable(0);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 444;BA.debugLine="Private Sub DrawDays(Props As Map)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(monthviewcalendar.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 446;BA.debugLine="cvs.DrawColor(Colors.Transparent)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(monthviewcalendar.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 450;BA.debugLine="If (month <= 0) Or (month >12) Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("k",__ref.getField(true,"_month" /*RemoteObject*/ ),BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_month" /*RemoteObject*/ ),BA.numberCast(double.class, 12)))))) { 
 BA.debugLineNum = 451;BA.debugLine="month = GetCurrentMonth";
Debug.ShouldStop(4);
__ref.setField ("_month" /*RemoteObject*/ ,__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getcurrentmonth" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 454;BA.debugLine="If (year < 1970) Or (year >2100) Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, 1970))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, 2100)))))) { 
 BA.debugLineNum = 455;BA.debugLine="year = GetCurrentYear";
Debug.ShouldStop(64);
__ref.setField ("_year" /*RemoteObject*/ ,__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getcurrentyear" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 458;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.SetDate(y";
Debug.ShouldStop(512);
_firstdayofmonth = RemoteObject.solve(new RemoteObject[] {monthviewcalendar._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(1)}, "-",1, 2);Debug.locals.put("firstDayOfMonth", _firstdayofmonth);Debug.locals.put("firstDayOfMonth", _firstdayofmonth);
 BA.debugLineNum = 459;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
Debug.ShouldStop(1024);
__ref.setField ("_dayofweekoffset" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(7),monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_firstdayofmonth)),RemoteObject.createImmutable(0)}, "+-",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1));
 BA.debugLineNum = 460;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
Debug.ShouldStop(2048);
__ref.setField ("_daysinmonth" /*RemoteObject*/ ,monthviewcalendar._dateutils.runMethod(true,"_numberofdaysinmonth",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ ))));
 BA.debugLineNum = 461;BA.debugLine="Log($\"daysInMonth: ${daysInMonth}, dayOfWeekOffse";
Debug.ShouldStop(4096);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6146014225",(RemoteObject.concat(RemoteObject.createImmutable("daysInMonth: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_daysinmonth" /*RemoteObject*/ )))),RemoteObject.createImmutable(", dayOfWeekOffset: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )))),RemoteObject.createImmutable(", year: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_year" /*RemoteObject*/ )))),RemoteObject.createImmutable(", month: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_month" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 462;BA.debugLine="If year = selectedYear And month = selectedMonth";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectedyear" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",__ref.getField(true,"_month" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectedmonth" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 464;BA.debugLine="selectedColor = Colors.LightGray";
Debug.ShouldStop(32768);
__ref.setField ("_selectedcolor" /*RemoteObject*/ ,monthviewcalendar.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 466;BA.debugLine="DrawBox(cvs, selectedColor, (selectedDay + dayOf";
Debug.ShouldStop(131072);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_drawbox" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_selectedcolor" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedday" /*RemoteObject*/ ),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "+",1, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedday" /*RemoteObject*/ ),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "+",1, 1)),RemoteObject.createImmutable(7)}, "/",0, 0))));
 BA.debugLineNum = 467;BA.debugLine="Log(\"dia actual\")";
Debug.ShouldStop(262144);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6146014231",RemoteObject.createImmutable("dia actual"),0);
 };
 BA.debugLineNum = 469;BA.debugLine="For day = 1 To daysInMonth";
Debug.ShouldStop(1048576);
{
final int step18 = 1;
final int limit18 = __ref.getField(true,"_daysinmonth" /*RemoteObject*/ ).<Integer>get().intValue();
_day = 1 ;
for (;(step18 > 0 && _day <= limit18) || (step18 < 0 && _day >= limit18) ;_day = ((int)(0 + _day + step18))  ) {
Debug.locals.put("day", _day);
 BA.debugLineNum = 470;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
Debug.ShouldStop(2097152);
_row = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "/",0, 0));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 471;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
Debug.ShouldStop(4194304);
if (BA.ObjectToBoolean((_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowWeekNumber")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 472;BA.debugLine="row = (day - 1 + dayOfWeekOffset) / 8";
Debug.ShouldStop(8388608);
_row = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(8)}, "/",0, 0));Debug.locals.put("row", _row);
 };
 BA.debugLineNum = 475;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(BA.NumberToString(_day)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ ),RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1)}, "+-",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)),RemoteObject.createImmutable(0.5)}, "+",1, 0)),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(0.5)}, "+",1, 0)),__ref.getField(true,"_boxh" /*RemoteObject*/ ),__ref.getField(true,"_vcorrection" /*RemoteObject*/ )}, "*+",1, 0))),(Object)(monthviewcalendar.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CellFontSize")))))),(Object)(monthviewcalendar.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 477;BA.debugLine="Log($\"Row: ${row}, boxW: ${boxW}, boxH: ${boxH},";
Debug.ShouldStop(268435456);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6146014241",(RemoteObject.concat(RemoteObject.createImmutable("Row: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_row))),RemoteObject.createImmutable(", boxW: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_boxw" /*RemoteObject*/ )))),RemoteObject.createImmutable(", boxH: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_boxh" /*RemoteObject*/ )))),RemoteObject.createImmutable(", vCorrection: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_vcorrection" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 }
}Debug.locals.put("day", _day);
;
 BA.debugLineNum = 479;BA.debugLine="month = lmonth 'GetCurrentMonth";
Debug.ShouldStop(1073741824);
__ref.setField ("_month" /*RemoteObject*/ ,__ref.getField(true,"_lmonth" /*RemoteObject*/ ));
 BA.debugLineNum = 480;BA.debugLine="year = lyear 'GetCurrentYear";
Debug.ShouldStop(-2147483648);
__ref.setField ("_year" /*RemoteObject*/ ,__ref.getField(true,"_lyear" /*RemoteObject*/ ));
 BA.debugLineNum = 481;BA.debugLine="CellsPanel.Invalidate";
Debug.ShouldStop(1);
__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generateliststring(RemoteObject __ref,RemoteObject _startnum,RemoteObject _endnum) throws Exception{
try {
		Debug.PushSubsStack("GenerateListString (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,411);
if (RapidSub.canDelegate("generateliststring")) { return __ref.runUserSub(false, "monthviewcalendar","generateliststring", __ref, _startnum, _endnum);}
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("startnum", _startnum);
Debug.locals.put("endnum", _endnum);
 BA.debugLineNum = 411;BA.debugLine="Sub GenerateListString(startnum As Int, endnum As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 412;BA.debugLine="Dim str As String";
Debug.ShouldStop(134217728);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 413;BA.debugLine="For i = startnum To endnum";
Debug.ShouldStop(268435456);
{
final int step2 = 1;
final int limit2 = _endnum.<Integer>get().intValue();
_i = _startnum.<Integer>get().intValue() ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 414;BA.debugLine="If (str <> \"\") Then str = str & \"|\"";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("!",_str,RemoteObject.createImmutable("")))) { 
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("|"));Debug.locals.put("str", _str);};
 BA.debugLineNum = 415;BA.debugLine="str = str & i";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(_i));Debug.locals.put("str", _str);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 417;BA.debugLine="Return str";
Debug.ShouldStop(1);
if (true) return _str;
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getaslist(RemoteObject __ref,RemoteObject _lstvalues) throws Exception{
try {
		Debug.PushSubsStack("GetAsList (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("getaslist")) { return __ref.runUserSub(false, "monthviewcalendar","getaslist", __ref, _lstvalues);}
RemoteObject _arrval = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("lstvalues", _lstvalues);
 BA.debugLineNum = 425;BA.debugLine="Sub GetAsList(lstvalues As String) As List";
Debug.ShouldStop(256);
 BA.debugLineNum = 426;BA.debugLine="Dim arrVal As List = Regex.Split(\"\\|\", lstvalues)";
Debug.ShouldStop(512);
_arrval = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_arrval = monthviewcalendar.__c.runMethod(false, "ArrayToList", (Object)(monthviewcalendar.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_lstvalues))));Debug.locals.put("arrVal", _arrval);Debug.locals.put("arrVal", _arrval);
 BA.debugLineNum = 427;BA.debugLine="Return arrVal";
Debug.ShouldStop(1024);
if (true) return _arrval;
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "monthviewcalendar","getbase", __ref);}
 BA.debugLineNum = 440;BA.debugLine="Public Sub GetBase As Panel";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="Return mBase";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentmonth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentMonth (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("getcurrentmonth")) { return __ref.runUserSub(false, "monthviewcalendar","getcurrentmonth", __ref);}
 BA.debugLineNum = 430;BA.debugLine="Sub GetCurrentMonth As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 431;BA.debugLine="DateTime.DateFormat = \"MM\"";
Debug.ShouldStop(16384);
monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM"));
 BA.debugLineNum = 432;BA.debugLine="Return DateTime.Date(DateTime.Now)";
Debug.ShouldStop(32768);
if (true) return BA.numberCast(int.class, monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentyear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentYear (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("getcurrentyear")) { return __ref.runUserSub(false, "monthviewcalendar","getcurrentyear", __ref);}
 BA.debugLineNum = 435;BA.debugLine="Sub GetCurrentYear As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="DateTime.DateFormat = \"yyyy\"";
Debug.ShouldStop(524288);
monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy"));
 BA.debugLineNum = 437;BA.debugLine="Return DateTime.Date(DateTime.Now)";
Debug.ShouldStop(1048576);
if (true) return BA.numberCast(int.class, monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDate (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,282);
if (RapidSub.canDelegate("getdate")) { return __ref.runUserSub(false, "monthviewcalendar","getdate", __ref);}
 BA.debugLineNum = 282;BA.debugLine="Public Sub GetDate As Long";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="Return selectedDate";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(true,"_selecteddate" /*RemoteObject*/ );
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalueposition(RemoteObject __ref,RemoteObject _lstvalues,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetValuePosition (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,420);
if (RapidSub.canDelegate("getvalueposition")) { return __ref.runUserSub(false, "monthviewcalendar","getvalueposition", __ref, _lstvalues, _value);}
RemoteObject _arrval = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("lstvalues", _lstvalues);
Debug.locals.put("value", _value);
 BA.debugLineNum = 420;BA.debugLine="Sub GetValuePosition(lstvalues As String, value As";
Debug.ShouldStop(8);
 BA.debugLineNum = 421;BA.debugLine="Dim arrVal As List = Regex.Split(\"\\|\", lstvalues)";
Debug.ShouldStop(16);
_arrval = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_arrval = monthviewcalendar.__c.runMethod(false, "ArrayToList", (Object)(monthviewcalendar.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_lstvalues))));Debug.locals.put("arrVal", _arrval);Debug.locals.put("arrVal", _arrval);
 BA.debugLineNum = 422;BA.debugLine="Return arrVal.IndexOf(value)";
Debug.ShouldStop(32);
if (true) return _arrval.runMethod(true,"IndexOf",(Object)((_value)));
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "monthviewcalendar","hide", __ref);}
 BA.debugLineNum = 302;BA.debugLine="Public Sub Hide";
Debug.ShouldStop(8192);
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "monthviewcalendar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 92;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(268435456);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 94;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(536870912);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializecomponents(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitializeComponents (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("initializecomponents")) { return __ref.runUserSub(false, "monthviewcalendar","initializecomponents", __ref);}
 BA.debugLineNum = 132;BA.debugLine="Sub InitializeComponents";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Log(\"***************** INITIALIZE COMPONENTS ****";
Debug.ShouldStop(16);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144572417",RemoteObject.createImmutable("***************** INITIALIZE COMPONENTS *****************"),0);
 BA.debugLineNum = 134;BA.debugLine="TitlePanel.Initialize(\"TitlePanel\")";
Debug.ShouldStop(32);
__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TitlePanel")));
 BA.debugLineNum = 135;BA.debugLine="MonthPanel.Initialize(\"MonthPanel\")";
Debug.ShouldStop(64);
__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MonthPanel")));
 BA.debugLineNum = 136;BA.debugLine="WeekPanel.Initialize(\"WeekPanel\")";
Debug.ShouldStop(128);
__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("WeekPanel")));
 BA.debugLineNum = 137;BA.debugLine="CellsPanel.Initialize(\"CellsPanel\")";
Debug.ShouldStop(256);
__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CellsPanel")));
 BA.debugLineNum = 138;BA.debugLine="CellsPanelBack.Initialize(\"CellsPanelBack\")";
Debug.ShouldStop(512);
__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CellsPanelBack")));
 BA.debugLineNum = 139;BA.debugLine="targetLabel.Initialize(\"targetLabel\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("targetLabel")));
 BA.debugLineNum = 140;BA.debugLine="lblSelectedDay.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelmake(RemoteObject __ref,RemoteObject _txt,RemoteObject _align,RemoteObject _bkcol,RemoteObject _forcol,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("LabelMake (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("labelmake")) { return __ref.runUserSub(false, "monthviewcalendar","labelmake", __ref, _txt, _align, _bkcol, _forcol, _width, _height);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _tpf = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
Debug.locals.put("txt", _txt);
Debug.locals.put("align", _align);
Debug.locals.put("bkcol", _bkcol);
Debug.locals.put("forcol", _forcol);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 333;BA.debugLine="Sub LabelMake(txt As String, align As Int, bkcol A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(8192);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 335;BA.debugLine="Dim tpf As Typeface = Typeface.CreateNew(Typeface";
Debug.ShouldStop(16384);
_tpf = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
_tpf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), monthviewcalendar.__c.getField(false,"Typeface").runMethod(false,"CreateNew",(Object)(monthviewcalendar.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(monthviewcalendar.__c.getField(false,"Typeface").getField(true,"STYLE_BOLD"))));Debug.locals.put("tpf", _tpf);
 BA.debugLineNum = 336;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(32768);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 337;BA.debugLine="lbl.Width = width";
Debug.ShouldStop(65536);
_lbl.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 338;BA.debugLine="lbl.Height = height";
Debug.ShouldStop(131072);
_lbl.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 339;BA.debugLine="lbl.SetColorAnimated(0,bkcol, bkcol)";
Debug.ShouldStop(262144);
_lbl.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(_bkcol),(Object)(_bkcol));
 BA.debugLineNum = 340;BA.debugLine="lbl.TextColor = forcol";
Debug.ShouldStop(524288);
_lbl.runMethod(true,"setTextColor",_forcol);
 BA.debugLineNum = 341;BA.debugLine="lbl.Text = txt";
Debug.ShouldStop(1048576);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_txt));
 BA.debugLineNum = 342;BA.debugLine="lbl.Typeface = tpf";
Debug.ShouldStop(2097152);
_lbl.runMethod(false,"setTypeface",(_tpf.getObject()));
 BA.debugLineNum = 343;BA.debugLine="lbl.Gravity= align";
Debug.ShouldStop(4194304);
_lbl.runMethod(true,"setGravity",_align);
 BA.debugLineNum = 344;BA.debugLine="Return lbl";
Debug.ShouldStop(8388608);
if (true) return _lbl;
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _months_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Months_ItemClick (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,405);
if (RapidSub.canDelegate("months_itemclick")) { return __ref.runUserSub(false, "monthviewcalendar","months_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 405;BA.debugLine="Private Sub Months_ItemClick (Position As Int, Val";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 406;BA.debugLine="month = Position + 1";
Debug.ShouldStop(2097152);
__ref.setField ("_month" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 407;BA.debugLine="DrawDays(innerMaps)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_drawdays" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_innermaps" /*RemoteObject*/ )));
 BA.debugLineNum = 408;BA.debugLine="Log(\"Month click\")";
Debug.ShouldStop(8388608);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6145555459",RemoteObject.createImmutable("Month click"),0);
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("SelectDay (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("selectday")) { return __ref.runUserSub(false, "monthviewcalendar","selectday", __ref, _day, _updatelabel);}
Debug.locals.put("day", _day);
Debug.locals.put("UpdateLabel", _updatelabel);
 BA.debugLineNum = 234;BA.debugLine="Private Sub SelectDay(day As Int, UpdateLabel As B";
Debug.ShouldStop(512);
 BA.debugLineNum = 236;BA.debugLine="selectedDate = DateUtils.SetDate(year, month, day";
Debug.ShouldStop(2048);
__ref.setField ("_selecteddate" /*RemoteObject*/ ,monthviewcalendar._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(_day)));
 BA.debugLineNum = 237;BA.debugLine="selectedDay = day";
Debug.ShouldStop(4096);
__ref.setField ("_selectedday" /*RemoteObject*/ ,_day);
 BA.debugLineNum = 238;BA.debugLine="selectedMonth = month";
Debug.ShouldStop(8192);
__ref.setField ("_selectedmonth" /*RemoteObject*/ ,__ref.getField(true,"_month" /*RemoteObject*/ ));
 BA.debugLineNum = 239;BA.debugLine="selectedYear = year";
Debug.ShouldStop(16384);
__ref.setField ("_selectedyear" /*RemoteObject*/ ,__ref.getField(true,"_year" /*RemoteObject*/ ));
 BA.debugLineNum = 240;BA.debugLine="If UpdateLabel Then targetLabel.Text = DateTime.D";
Debug.ShouldStop(32768);
if (_updatelabel.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_selecteddate" /*RemoteObject*/ )))));};
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("SetDate (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("setdate")) { return __ref.runUserSub(false, "monthviewcalendar","setdate", __ref, _date, _updatelabel);}
Debug.locals.put("date", _date);
Debug.locals.put("UpdateLabel", _updatelabel);
 BA.debugLineNum = 286;BA.debugLine="Public Sub SetDate(date As Long, UpdateLabel As Bo";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="If waitForAddToActivity Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_waitforaddtoactivity" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 288;BA.debugLine="CallSubDelayed3(Me, \"SetDate\", date, UpdateLabel";
Debug.ShouldStop(-2147483648);
monthviewcalendar.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("SetDate")),(Object)((_date)),(Object)((_updatelabel)));
 BA.debugLineNum = 289;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 291;BA.debugLine="year = DateTime.GetYear(date)";
Debug.ShouldStop(4);
__ref.setField ("_year" /*RemoteObject*/ ,monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date)));
 BA.debugLineNum = 292;BA.debugLine="month = DateTime.GetMonth(date)";
Debug.ShouldStop(8);
__ref.setField ("_month" /*RemoteObject*/ ,monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date)));
 BA.debugLineNum = 293;BA.debugLine="Log($\"SET: ${year}-${month}\"$)";
Debug.ShouldStop(16);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144965639",(RemoteObject.concat(RemoteObject.createImmutable("SET: "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_year" /*RemoteObject*/ )))),RemoteObject.createImmutable("-"),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_month" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 294;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date), UpdateLab";
Debug.ShouldStop(32);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_selectday" /*RemoteObject*/ ,(Object)(monthviewcalendar.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_date))),(Object)(_updatelabel));
 BA.debugLineNum = 295;BA.debugLine="Years.SelectedIndex = year - minYear";
Debug.ShouldStop(64);
__ref.getField(false,"_years" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_year" /*RemoteObject*/ ),__ref.getField(true,"_minyear" /*RemoteObject*/ )}, "-",1, 1));
 BA.debugLineNum = 296;BA.debugLine="Months.SelectedIndex = month - 1";
Debug.ShouldStop(128);
__ref.getField(false,"_months" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_month" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 298;BA.debugLine="If Not(YearsList.IsInitialized) Then YearsList.In";
Debug.ShouldStop(512);
if (monthviewcalendar.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_yearslist" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_yearslist" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 299;BA.debugLine="If Not(MonthList.IsInitialized) Then MonthList.In";
Debug.ShouldStop(1024);
if (monthviewcalendar.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_monthlist" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_monthlist" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdimensions(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("SetDimensions (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("setdimensions")) { return __ref.runUserSub(false, "monthviewcalendar","setdimensions", __ref, _props);}
RemoteObject _aligncenter = RemoteObject.createImmutable(0);
RemoteObject _nexttop = RemoteObject.createImmutable(0);
RemoteObject _nextleft = RemoteObject.createImmutable(0);
RemoteObject _syears = RemoteObject.createImmutable("");
RemoteObject _et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _columns = RemoteObject.createImmutable(0);
RemoteObject _blleft = RemoteObject.createImmutable(0);
RemoteObject _blocks = RemoteObject.createImmutable(0);
RemoteObject _wdays = RemoteObject.createImmutable("");
RemoteObject _nameslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _n = RemoteObject.createImmutable("");
Debug.locals.put("Props", _props);
 BA.debugLineNum = 143;BA.debugLine="Sub SetDimensions(Props As Map) As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Log(\"***************** SET DIMENSIONS ***********";
Debug.ShouldStop(32768);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144637953",RemoteObject.createImmutable("***************** SET DIMENSIONS *****************"),0);
 BA.debugLineNum = 145;BA.debugLine="Dim AlignCenter As Int = Bit.Or(Gravity.CENTER, G";
Debug.ShouldStop(65536);
_aligncenter = monthviewcalendar.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(monthviewcalendar.__c.getField(false,"Gravity").getField(true,"CENTER")),(Object)(monthviewcalendar.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")));Debug.locals.put("AlignCenter", _aligncenter);Debug.locals.put("AlignCenter", _aligncenter);
 BA.debugLineNum = 146;BA.debugLine="Dim NextTop As Int = 0, NextLeft As Int = 0";
Debug.ShouldStop(131072);
_nexttop = BA.numberCast(int.class, 0);Debug.locals.put("NextTop", _nexttop);Debug.locals.put("NextTop", _nexttop);
_nextleft = BA.numberCast(int.class, 0);Debug.locals.put("NextLeft", _nextleft);Debug.locals.put("NextLeft", _nextleft);
 BA.debugLineNum = 147;BA.debugLine="If (Props.Get(\"ShowTitle\")) Then";
Debug.ShouldStop(262144);
if (BA.ObjectToBoolean((_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowTitle")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 148;BA.debugLine="TitlePanel.Top = NextTop";
Debug.ShouldStop(524288);
__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).runMethod(true,"setTop",_nexttop);
 BA.debugLineNum = 149;BA.debugLine="TitlePanel.Left = NextLeft";
Debug.ShouldStop(1048576);
__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).runMethod(true,"setLeft",_nextleft);
 BA.debugLineNum = 150;BA.debugLine="TitlePanel.Width = mBase.Width";
Debug.ShouldStop(2097152);
__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 151;BA.debugLine="TitlePanel.Height = PanelMinHeight";
Debug.ShouldStop(4194304);
__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_panelminheight" /*RemoteObject*/ ));
 BA.debugLineNum = 152;BA.debugLine="TitlePanel.Color = Props.Get(\"TitleBackColor\") '";
Debug.ShouldStop(8388608);
__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TitleBackColor"))))));
 BA.debugLineNum = 153;BA.debugLine="AddLabel(TitlePanel, Props.Get(\"Title\"), AlignCe";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_addlabel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_titlepanel" /*RemoteObject*/ )),(Object)(BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Title")))))),(Object)(_aligncenter),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TitleBackColor")))))),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TitleFontColor")))))));
 BA.debugLineNum = 154;BA.debugLine="mBase.AddView(TitlePanel, NextLeft, NextTop, Tit";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).getObject())),(Object)(_nextleft),(Object)(_nexttop),(Object)(__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_titlepanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 155;BA.debugLine="NextTop = NextTop + PanelMinHeight";
Debug.ShouldStop(67108864);
_nexttop = RemoteObject.solve(new RemoteObject[] {_nexttop,__ref.getField(true,"_panelminheight" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("NextTop", _nexttop);
 BA.debugLineNum = 156;BA.debugLine="Log(Props.Get(\"ShowTitle\"))";
Debug.ShouldStop(134217728);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144637965",BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowTitle"))))),0);
 BA.debugLineNum = 157;BA.debugLine="Log(Props.Get(\"Title\"))";
Debug.ShouldStop(268435456);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144637966",BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Title"))))),0);
 };
 BA.debugLineNum = 160;BA.debugLine="MonthPanel.Top = NextTop";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).runMethod(true,"setTop",_nexttop);
 BA.debugLineNum = 161;BA.debugLine="MonthPanel.Left = NextLeft";
Debug.ShouldStop(1);
__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).runMethod(true,"setLeft",_nextleft);
 BA.debugLineNum = 162;BA.debugLine="MonthPanel.Width = mBase.Width";
Debug.ShouldStop(2);
__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 163;BA.debugLine="MonthPanel.Height = PanelMinHeight";
Debug.ShouldStop(4);
__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_panelminheight" /*RemoteObject*/ ));
 BA.debugLineNum = 164;BA.debugLine="MonthPanel.Color = Props.Get(\"MonthBackColor\")";
Debug.ShouldStop(8);
__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MonthBackColor"))))));
 BA.debugLineNum = 165;BA.debugLine="AddList(MonthPanel, \"cmbboxMonth\", Props.Get(\"Mon";
Debug.ShouldStop(16);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_addlist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_monthpanel" /*RemoteObject*/ )),(Object)(BA.ObjectToString("cmbboxMonth")),(Object)(BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MonthNames")))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getcurrentmonth" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MonthBackColor")))))),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MonthFontColor")))))));
 BA.debugLineNum = 166;BA.debugLine="Dim sYears As String = GenerateListString(1970,21";
Debug.ShouldStop(32);
_syears = __ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_generateliststring" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1970)),(Object)(BA.numberCast(int.class, 2100)));Debug.locals.put("sYears", _syears);Debug.locals.put("sYears", _syears);
 BA.debugLineNum = 167;BA.debugLine="AddList(MonthPanel, \"cmbboxYear\", sYears, GetValu";
Debug.ShouldStop(64);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_addlist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_monthpanel" /*RemoteObject*/ )),(Object)(BA.ObjectToString("cmbboxYear")),(Object)(_syears),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getvalueposition" /*RemoteObject*/ ,(Object)(_syears),(Object)(BA.NumberToString(__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getcurrentyear" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MonthBackColor")))))),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MonthFontColor")))))));
 BA.debugLineNum = 169;BA.debugLine="mBase.AddView(MonthPanel, NextLeft, NextTop, Mont";
Debug.ShouldStop(256);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).getObject())),(Object)(_nextleft),(Object)(_nexttop),(Object)(__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_monthpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 170;BA.debugLine="NextTop = NextTop + PanelMinHeight";
Debug.ShouldStop(512);
_nexttop = RemoteObject.solve(new RemoteObject[] {_nexttop,__ref.getField(true,"_panelminheight" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("NextTop", _nexttop);
 BA.debugLineNum = 171;BA.debugLine="Log(Props.Get(\"MonthNames\"))";
Debug.ShouldStop(1024);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144637980",BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MonthNames"))))),0);
 BA.debugLineNum = 173;BA.debugLine="Dim et As EditText";
Debug.ShouldStop(4096);
_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");Debug.locals.put("et", _et);
 BA.debugLineNum = 174;BA.debugLine="et.Initialize(\"\")";
Debug.ShouldStop(8192);
_et.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 175;BA.debugLine="targetLabel.Background = et.Background";
Debug.ShouldStop(16384);
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runMethod(false,"setBackground",_et.runMethod(false,"getBackground"));
 BA.debugLineNum = 177;BA.debugLine="WeekPanel.Top = NextTop";
Debug.ShouldStop(65536);
__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).runMethod(true,"setTop",_nexttop);
 BA.debugLineNum = 178;BA.debugLine="WeekPanel.Left = NextLeft";
Debug.ShouldStop(131072);
__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).runMethod(true,"setLeft",_nextleft);
 BA.debugLineNum = 179;BA.debugLine="WeekPanel.Width = mBase.Width";
Debug.ShouldStop(262144);
__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 180;BA.debugLine="WeekPanel.Height = PanelMinHeight";
Debug.ShouldStop(524288);
__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(true,"_panelminheight" /*RemoteObject*/ ));
 BA.debugLineNum = 181;BA.debugLine="WeekPanel.Color = Props.Get(\"WeekBackColor\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WeekBackColor"))))));
 BA.debugLineNum = 182;BA.debugLine="Dim Columns As Int = 7";
Debug.ShouldStop(2097152);
_columns = BA.numberCast(int.class, 7);Debug.locals.put("Columns", _columns);Debug.locals.put("Columns", _columns);
 BA.debugLineNum = 183;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
Debug.ShouldStop(4194304);
if (BA.ObjectToBoolean((_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowWeekNumber")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 184;BA.debugLine="Columns = 8";
Debug.ShouldStop(8388608);
_columns = BA.numberCast(int.class, 8);Debug.locals.put("Columns", _columns);
 };
 BA.debugLineNum = 186;BA.debugLine="Dim BLLeft As Int = 0, Blocks As Int = Round(mBas";
Debug.ShouldStop(33554432);
_blleft = BA.numberCast(int.class, 0);Debug.locals.put("BLLeft", _blleft);Debug.locals.put("BLLeft", _blleft);
_blocks = BA.numberCast(int.class, monthviewcalendar.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),_columns}, "/",0, 0))));Debug.locals.put("Blocks", _blocks);Debug.locals.put("Blocks", _blocks);
 BA.debugLineNum = 187;BA.debugLine="Dim WDays As String = Props.Get(\"ShortDayWeekName";
Debug.ShouldStop(67108864);
_wdays = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShortDayWeekNames")))));Debug.locals.put("WDays", _wdays);Debug.locals.put("WDays", _wdays);
 BA.debugLineNum = 188;BA.debugLine="Dim NamesList As List = GetAsList(WDays)";
Debug.ShouldStop(134217728);
_nameslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_nameslist = __ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_getaslist" /*RemoteObject*/ ,(Object)(_wdays));Debug.locals.put("NamesList", _nameslist);Debug.locals.put("NamesList", _nameslist);
 BA.debugLineNum = 190;BA.debugLine="For i=0 To Columns-1";
Debug.ShouldStop(536870912);
{
final int step42 = 1;
final int limit42 = RemoteObject.solve(new RemoteObject[] {_columns,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42) ;_i = ((int)(0 + _i + step42))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 191;BA.debugLine="Dim n As String";
Debug.ShouldStop(1073741824);
_n = RemoteObject.createImmutable("");Debug.locals.put("n", _n);
 BA.debugLineNum = 192;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
Debug.ShouldStop(-2147483648);
if (BA.ObjectToBoolean((_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowWeekNumber")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 193;BA.debugLine="If (i = 0) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 194;BA.debugLine="n = \"#\"";
Debug.ShouldStop(2);
_n = BA.ObjectToString("#");Debug.locals.put("n", _n);
 }else {
 BA.debugLineNum = 196;BA.debugLine="n = NamesList.Get(i-1)";
Debug.ShouldStop(8);
_n = BA.ObjectToString(_nameslist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("n", _n);
 };
 }else {
 BA.debugLineNum = 199;BA.debugLine="n = NamesList.Get(i)";
Debug.ShouldStop(64);
_n = BA.ObjectToString(_nameslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("n", _n);
 };
 BA.debugLineNum = 201;BA.debugLine="Log($\"${n} : ${i}\"$)";
Debug.ShouldStop(256);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144638010",(RemoteObject.concat(RemoteObject.createImmutable(""),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_n))),RemoteObject.createImmutable(" : "),monthviewcalendar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 202;BA.debugLine="AddLabelPos(WeekPanel, n, AlignCenter, Props.Get";
Debug.ShouldStop(512);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_addlabelpos" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_weekpanel" /*RemoteObject*/ )),(Object)(_n),(Object)(_aligncenter),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WeekBackColor")))))),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WeekFontColor")))))),(Object)(_blleft),(Object)(RemoteObject.solve(new RemoteObject[] {_blleft,_blocks}, "+",1, 1)),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DayWeekBorder")))))),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DayWeekBorderColor")))))));
 BA.debugLineNum = 203;BA.debugLine="BLLeft = BLLeft+Blocks";
Debug.ShouldStop(1024);
_blleft = RemoteObject.solve(new RemoteObject[] {_blleft,_blocks}, "+",1, 1);Debug.locals.put("BLLeft", _blleft);
 BA.debugLineNum = 204;BA.debugLine="n = \"\"";
Debug.ShouldStop(2048);
_n = BA.ObjectToString("");Debug.locals.put("n", _n);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 206;BA.debugLine="If (Props.Get(\"ShowWeekNumber\")) Then";
Debug.ShouldStop(8192);
if (BA.ObjectToBoolean((_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShowWeekNumber")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 207;BA.debugLine="AddLabelPos(WeekPanel, NamesList.Get(NamesList.S";
Debug.ShouldStop(16384);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_addlabelpos" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_weekpanel" /*RemoteObject*/ )),(Object)(BA.ObjectToString(_nameslist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_nameslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))),(Object)(_aligncenter),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WeekBackColor")))))),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WeekFontColor")))))),(Object)(_blleft),(Object)(RemoteObject.solve(new RemoteObject[] {_blleft,_blocks}, "+",1, 1)),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DayWeekBorder")))))),(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DayWeekBorderColor")))))));
 };
 BA.debugLineNum = 211;BA.debugLine="mBase.AddView(WeekPanel, NextLeft, NextTop, WeekP";
Debug.ShouldStop(262144);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).getObject())),(Object)(_nextleft),(Object)(_nexttop),(Object)(__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_weekpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 212;BA.debugLine="NextTop = NextTop + PanelMinHeight";
Debug.ShouldStop(524288);
_nexttop = RemoteObject.solve(new RemoteObject[] {_nexttop,__ref.getField(true,"_panelminheight" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("NextTop", _nexttop);
 BA.debugLineNum = 213;BA.debugLine="Log(Props.Get(\"WeekPanel\"))";
Debug.ShouldStop(1048576);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144638022",BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WeekPanel"))))),0);
 BA.debugLineNum = 215;BA.debugLine="CellsPanelBack.Top = NextTop";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).runMethod(true,"setTop",_nexttop);
 BA.debugLineNum = 216;BA.debugLine="CellsPanelBack.Left = NextLeft";
Debug.ShouldStop(8388608);
__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).runMethod(true,"setLeft",_nextleft);
 BA.debugLineNum = 217;BA.debugLine="CellsPanelBack.Width = mBase.Width";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 218;BA.debugLine="CellsPanelBack.Height = mBase.Height";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 219;BA.debugLine="mBase.AddView(CellsPanelBack, NextLeft, NextTop,";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).getObject())),(Object)(_nextleft),(Object)(_nexttop),(Object)(__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_cellspanelback" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 221;BA.debugLine="CellsPanel.Top = NextTop";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).runMethod(true,"setTop",_nexttop);
 BA.debugLineNum = 222;BA.debugLine="CellsPanel.Left = NextLeft";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).runMethod(true,"setLeft",_nextleft);
 BA.debugLineNum = 223;BA.debugLine="CellsPanel.Width = mBase.Width";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 224;BA.debugLine="CellsPanel.Height = mBase.Height";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 225;BA.debugLine="mBase.AddView(CellsPanel, NextLeft, NextTop, Cell";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).getObject())),(Object)(_nextleft),(Object)(_nexttop),(Object)(__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_cellspanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 231;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return monthviewcalendar.__c.getField(true,"True");
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "monthviewcalendar","show", __ref);}
 BA.debugLineNum = 306;BA.debugLine="Public Sub Show";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="If waitForAddToActivity Then";
Debug.ShouldStop(262144);
if (__ref.getField(true,"_waitforaddtoactivity" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 309;BA.debugLine="CallSubDelayed(Me, \"show\")";
Debug.ShouldStop(1048576);
monthviewcalendar.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("show")));
 BA.debugLineNum = 310;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 312;BA.debugLine="mBase.SetVisibleAnimated(500, True)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(monthviewcalendar.__c.getField(true,"True")));
 BA.debugLineNum = 313;BA.debugLine="DrawDays(innerMaps)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_drawdays" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_innermaps" /*RemoteObject*/ )));
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ShowOnThisPanel (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("showonthispanel")) { return __ref.runUserSub(false, "monthviewcalendar","showonthispanel", __ref, _pnl);}
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 316;BA.debugLine="Public Sub ShowOnThisPanel(pnl As Panel)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="mBase = pnl";
Debug.ShouldStop(268435456);
__ref.setField ("_mbase" /*RemoteObject*/ ,_pnl);
 BA.debugLineNum = 318;BA.debugLine="CallSubDelayed(Me, \"show\")";
Debug.ShouldStop(536870912);
monthviewcalendar.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("show")));
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _targetlabel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("targetLabel_Click (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("targetlabel_click")) { return __ref.runUserSub(false, "monthviewcalendar","targetlabel_click", __ref);}
 BA.debugLineNum = 244;BA.debugLine="Private Sub targetLabel_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 246;BA.debugLine="Log(\"show:taretLabel\")";
Debug.ShouldStop(2097152);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6144769026",RemoteObject.createImmutable("show:taretLabel"),0);
 BA.debugLineNum = 247;BA.debugLine="targetLabel.Color = Colors.Black";
Debug.ShouldStop(4194304);
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runVoidMethod ("setColor",monthviewcalendar.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Years_ItemClick (monthviewcalendar) ","monthviewcalendar",44,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("years_itemclick")) { return __ref.runUserSub(false, "monthviewcalendar","years_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 398;BA.debugLine="Private Sub Years_ItemClick (Position As Int, Valu";
Debug.ShouldStop(8192);
 BA.debugLineNum = 399;BA.debugLine="year = Value";
Debug.ShouldStop(16384);
__ref.setField ("_year" /*RemoteObject*/ ,BA.numberCast(int.class, _value));
 BA.debugLineNum = 400;BA.debugLine="DrawDays(innerMaps)";
Debug.ShouldStop(32768);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.monthviewcalendar.class, "_drawdays" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_innermaps" /*RemoteObject*/ )));
 BA.debugLineNum = 401;BA.debugLine="Log(\"Years click\")";
Debug.ShouldStop(65536);
monthviewcalendar.__c.runVoidMethod ("LogImpl","6145489923",RemoteObject.createImmutable("Years click"),0);
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}