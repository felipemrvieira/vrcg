package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class barcodescanner_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"scanner\")";
Debug.ShouldStop(67108864);
barcodescanner.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("scanner")),barcodescanner.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="If ShareCode.ClearBarcodeList = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",barcodescanner.mostCurrent._sharecode._clearbarcodelist /*RemoteObject*/ ,barcodescanner.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 30;BA.debugLine="ShareCode.ScanList.Clear";
Debug.ShouldStop(536870912);
barcodescanner.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 31;BA.debugLine="ListaCodigosLidos.Clear";
Debug.ShouldStop(1073741824);
barcodescanner.mostCurrent._listacodigoslidos.runVoidMethod ("_clear");
 };
 BA.debugLineNum = 34;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(2);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 35;BA.debugLine="CreateDetector (Array(\"ALL_FORMATS\"))";
Debug.ShouldStop(4);
_createdetector(barcodescanner.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALL_FORMATS"))}))));
 };
 BA.debugLineNum = 37;BA.debugLine="cvs.Initialize(pnlDrawing)";
Debug.ShouldStop(16);
barcodescanner.mostCurrent._cvs.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), barcodescanner.mostCurrent._pnldrawing.getObject()));
 BA.debugLineNum = 38;BA.debugLine="ShareCode.ScanList.Initialize";
Debug.ShouldStop(32);
barcodescanner.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,249);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 249;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="If camEx.IsInitialized Then";
Debug.ShouldStop(33554432);
if (barcodescanner.mostCurrent._camex.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 251;BA.debugLine="camEx.Release";
Debug.ShouldStop(67108864);
barcodescanner.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_release" /*RemoteObject*/ );
 };
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,236);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","activity_resume");}
 BA.debugLineNum = 236;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="InitializeCamera";
Debug.ShouldStop(4096);
_initializecamera();
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btncancel_click() throws Exception{
try {
		Debug.PushSubsStack("btnCancel_Click (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,272);
if (RapidSub.canDelegate("btncancel_click")) { xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","btncancel_click"); return;}
ResumableSub_btnCancel_Click rsub = new ResumableSub_btnCancel_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCancel_Click extends BA.ResumableSub {
public ResumableSub_btnCancel_Click(xevolution.vrcg.devdemov2400.barcodescanner parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.barcodescanner parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCancel_Click (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,272);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 273;BA.debugLine="Log(\"BTNCANCEL\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6119930881",RemoteObject.createImmutable("BTNCANCEL"),0);
 BA.debugLineNum = 274;BA.debugLine="Sleep(100)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",barcodescanner.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "barcodescanner", "btncancel_click"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 275;BA.debugLine="Return2Activity";
Debug.ShouldStop(262144);
_return2activity();
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _btnclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnClear_Click (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,278);
if (RapidSub.canDelegate("btnclear_click")) { xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","btnclear_click"); return;}
ResumableSub_btnClear_Click rsub = new ResumableSub_btnClear_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnClear_Click extends BA.ResumableSub {
public ResumableSub_btnClear_Click(xevolution.vrcg.devdemov2400.barcodescanner parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.barcodescanner parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _lst2delete = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _t = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _check_box = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _lbl_state = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_barcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
int _l = 0;
RemoteObject _linha2recover = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sta = RemoteObject.createImmutable("");
RemoteObject _cbqr = RemoteObject.createImmutable("");
RemoteObject _stacod = RemoteObject.createImmutable(0);
int step9;
int limit9;
int step20;
int limit20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnClear_Click (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,278);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 279;BA.debugLine="Msgbox2Async(\"Limpar todos os códigos lidos ?\", \"";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Limpar todos os códigos lidos ?")),(Object)(BA.ObjectToCharSequence("Reinicializar lista de códigos")),(Object)(BA.ObjectToString("Todos")),(Object)(BA.ObjectToString("Seleccionados")),(Object)(BA.ObjectToString("Não")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),barcodescanner.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 280;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", barcodescanner.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "barcodescanner", "btnclear_click"), null);
this.state = 27;
return;
case 27:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 281;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 284;BA.debugLine="else if Result = DialogResponse.CANCEL Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 26;
 BA.debugLineNum = 282;BA.debugLine="ListaCodigosLidos.Clear";
Debug.ShouldStop(33554432);
parent.mostCurrent._listacodigoslidos.runVoidMethod ("_clear");
 BA.debugLineNum = 283;BA.debugLine="ShareCode.ScanList.Clear";
Debug.ShouldStop(67108864);
parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Clear");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 285;BA.debugLine="Dim lst2delete As List";
Debug.ShouldStop(268435456);
_lst2delete = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst2delete", _lst2delete);
 BA.debugLineNum = 286;BA.debugLine="lst2delete.Initialize";
Debug.ShouldStop(536870912);
_lst2delete.runVoidMethod ("Initialize");
 BA.debugLineNum = 287;BA.debugLine="For t=0 To ListaCodigosLidos.Size -1";
Debug.ShouldStop(1073741824);
if (true) break;

case 6:
//for
this.state = 13;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._listacodigoslidos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_t = 0 ;
Debug.locals.put("t", _t);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 13;
if ((step9 > 0 && _t <= limit9) || (step9 < 0 && _t >= limit9)) this.state = 8;
if (true) break;

case 29:
//C
this.state = 28;
_t = ((int)(0 + _t + step9)) ;
Debug.locals.put("t", _t);
if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 288;BA.debugLine="Dim pnl As Panel = ListaCodigosLidos.GetPanel(t";
Debug.ShouldStop(-2147483648);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), parent.mostCurrent._listacodigoslidos.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _t))).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 289;BA.debugLine="Dim check_box As CheckBox = pnl.GetView(0)";
Debug.ShouldStop(1);
_check_box = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_check_box = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("check_box", _check_box);
 BA.debugLineNum = 290;BA.debugLine="Dim lbl_state As Label = pnl.GetView(1)";
Debug.ShouldStop(2);
_lbl_state = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_state = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_state", _lbl_state);
 BA.debugLineNum = 291;BA.debugLine="Dim lbl_barcode As Label  = pnl.GetView(2)";
Debug.ShouldStop(4);
_lbl_barcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_barcode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lbl_barcode", _lbl_barcode);
 BA.debugLineNum = 292;BA.debugLine="If Not(check_box.Checked) Then";
Debug.ShouldStop(8);
if (true) break;

case 9:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_check_box.runMethod(true,"getChecked"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 293;BA.debugLine="lst2delete.Add($\"0;${lbl_state.text};${lbl_bar";
Debug.ShouldStop(16);
_lst2delete.runVoidMethod ("Add",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("0;"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl_state.runMethod(true,"getText")))),RemoteObject.createImmutable(";"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl_barcode.runMethod(true,"getText")))),RemoteObject.createImmutable(""))))));
 if (true) break;

case 12:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("t", _t);
;
 BA.debugLineNum = 297;BA.debugLine="ListaCodigosLidos.Clear";
Debug.ShouldStop(256);
parent.mostCurrent._listacodigoslidos.runVoidMethod ("_clear");
 BA.debugLineNum = 298;BA.debugLine="ShareCode.ScanList.Clear";
Debug.ShouldStop(512);
parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 300;BA.debugLine="For l=0 To lst2delete.Size -1";
Debug.ShouldStop(2048);
if (true) break;

case 14:
//for
this.state = 25;
step20 = 1;
limit20 = RemoteObject.solve(new RemoteObject[] {_lst2delete.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_l = 0 ;
Debug.locals.put("l", _l);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 25;
if ((step20 > 0 && _l <= limit20) || (step20 < 0 && _l >= limit20)) this.state = 16;
if (true) break;

case 31:
//C
this.state = 30;
_l = ((int)(0 + _l + step20)) ;
Debug.locals.put("l", _l);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 301;BA.debugLine="Dim linha2recover As List =  Regex.Split(\";\",ls";
Debug.ShouldStop(4096);
_linha2recover = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_linha2recover = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(BA.ObjectToString(_lst2delete.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _l))))))));Debug.locals.put("linha2recover", _linha2recover);Debug.locals.put("linha2recover", _linha2recover);
 BA.debugLineNum = 302;BA.debugLine="Dim Sta As String = linha2recover.Get(1)";
Debug.ShouldStop(8192);
_sta = BA.ObjectToString(_linha2recover.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Sta", _sta);Debug.locals.put("Sta", _sta);
 BA.debugLineNum = 303;BA.debugLine="Dim CBQR As String = linha2recover.Get(2)";
Debug.ShouldStop(16384);
_cbqr = BA.ObjectToString(_linha2recover.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("CBQR", _cbqr);Debug.locals.put("CBQR", _cbqr);
 BA.debugLineNum = 304;BA.debugLine="ShareCode.ScanList.Add(CBQR)";
Debug.ShouldStop(32768);
parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_cbqr)));
 BA.debugLineNum = 305;BA.debugLine="If Sta = Chr(0xF00D) Then";
Debug.ShouldStop(65536);
if (true) break;

case 17:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_sta,BA.ObjectToString(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf00d)))))) { 
this.state = 19;
}else 
{ BA.debugLineNum = 307;BA.debugLine="Else If Sta = Chr(0xF00C) Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_sta,BA.ObjectToString(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf00c)))))) { 
this.state = 21;
}else {
this.state = 23;
}}
if (true) break;

case 19:
//C
this.state = 24;
 BA.debugLineNum = 306;BA.debugLine="Dim StaCod As Int = 0";
Debug.ShouldStop(131072);
_stacod = BA.numberCast(int.class, 0);Debug.locals.put("StaCod", _stacod);Debug.locals.put("StaCod", _stacod);
 if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 308;BA.debugLine="Dim StaCod As Int = 1";
Debug.ShouldStop(524288);
_stacod = BA.numberCast(int.class, 1);Debug.locals.put("StaCod", _stacod);Debug.locals.put("StaCod", _stacod);
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 310;BA.debugLine="Dim StaCod As Int = 2";
Debug.ShouldStop(2097152);
_stacod = BA.numberCast(int.class, 2);Debug.locals.put("StaCod", _stacod);Debug.locals.put("StaCod", _stacod);
 if (true) break;

case 24:
//C
this.state = 31;
;
 BA.debugLineNum = 313;BA.debugLine="ListaCodigosLidos.Add(createListaItem(CBQR,Fals";
Debug.ShouldStop(16777216);
parent.mostCurrent._listacodigoslidos.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistaitem(_cbqr,parent.mostCurrent.__c.getField(true,"False"),_stacod,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
Debug.locals.put("l", _l);
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _createdetector(RemoteObject _codes) throws Exception{
try {
		Debug.PushSubsStack("CreateDetector (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,88);
if (RapidSub.canDelegate("createdetector")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","createdetector", _codes);}
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _builder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _barcodeclass = RemoteObject.createImmutable("");
RemoteObject _barcodestatic = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _format = RemoteObject.createImmutable(0);
RemoteObject _formatname = RemoteObject.createImmutable("");
RemoteObject _operational = RemoteObject.createImmutable(false);
Debug.locals.put("Codes", _codes);
 BA.debugLineNum = 88;BA.debugLine="Private Sub CreateDetector (Codes As List)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(16777216);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 90;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(33554432);
_ctxt.runVoidMethod ("InitializeContext",barcodescanner.processBA);
 BA.debugLineNum = 91;BA.debugLine="Dim builder As JavaObject";
Debug.ShouldStop(67108864);
_builder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("builder", _builder);
 BA.debugLineNum = 92;BA.debugLine="builder.InitializeNewInstance(\"com/google/android";
Debug.ShouldStop(134217728);
_builder.runVoidMethod ("InitializeNewInstance",(Object)(RemoteObject.createImmutable("com/google/android/gms/vision/barcode/BarcodeDetector.Builder").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ctxt.getObject())})));
 BA.debugLineNum = 93;BA.debugLine="Dim barcodeClass As String = \"com/google/android/";
Debug.ShouldStop(268435456);
_barcodeclass = RemoteObject.createImmutable("com/google/android/gms/vision/barcode/Barcode").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("barcodeClass", _barcodeclass);Debug.locals.put("barcodeClass", _barcodeclass);
 BA.debugLineNum = 94;BA.debugLine="Dim barcodeStatic As JavaObject";
Debug.ShouldStop(536870912);
_barcodestatic = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("barcodeStatic", _barcodestatic);
 BA.debugLineNum = 95;BA.debugLine="barcodeStatic.InitializeStatic(barcodeClass)";
Debug.ShouldStop(1073741824);
_barcodestatic.runVoidMethod ("InitializeStatic",(Object)(_barcodeclass));
 BA.debugLineNum = 96;BA.debugLine="Dim format As Int";
Debug.ShouldStop(-2147483648);
_format = RemoteObject.createImmutable(0);Debug.locals.put("format", _format);
 BA.debugLineNum = 97;BA.debugLine="For Each formatName As String In Codes";
Debug.ShouldStop(1);
{
final RemoteObject group9 = _codes;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_formatname = BA.ObjectToString(group9.runMethod(false,"Get",index9));Debug.locals.put("formatName", _formatname);
Debug.locals.put("formatName", _formatname);
 BA.debugLineNum = 98;BA.debugLine="format = Bit.Or(format, barcodeStatic.GetField(f";
Debug.ShouldStop(2);
_format = barcodescanner.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_format),(Object)(BA.numberCast(int.class, _barcodestatic.runMethod(false,"GetField",(Object)(_formatname)))));Debug.locals.put("format", _format);
 }
}Debug.locals.put("formatName", _formatname);
;
 BA.debugLineNum = 100;BA.debugLine="builder.RunMethod(\"setBarcodeFormats\", Array(form";
Debug.ShouldStop(8);
_builder.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBarcodeFormats")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_format)})));
 BA.debugLineNum = 101;BA.debugLine="detector = builder.RunMethod(\"build\", Null)";
Debug.ShouldStop(16);
barcodescanner._detector = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _builder.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((barcodescanner.mostCurrent.__c.getField(false,"Null")))));
 BA.debugLineNum = 102;BA.debugLine="Dim operational As Boolean = detector.RunMethod(\"";
Debug.ShouldStop(32);
_operational = BA.ObjectToBoolean(barcodescanner._detector.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isOperational")),(Object)((barcodescanner.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("operational", _operational);Debug.locals.put("operational", _operational);
 BA.debugLineNum = 103;BA.debugLine="Log(\"Is detector operational: \" & operational)";
Debug.ShouldStop(64);
barcodescanner.mostCurrent.__c.runVoidMethod ("LogImpl","6119472143",RemoteObject.concat(RemoteObject.createImmutable("Is detector operational: "),_operational),0);
 BA.debugLineNum = 104;BA.debugLine="SearchForBarcodes = operational";
Debug.ShouldStop(128);
barcodescanner._searchforbarcodes = _operational;
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistaitem(RemoteObject _barcode,RemoteObject _selectedrec,RemoteObject _staterec,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createListaItem (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,320);
if (RapidSub.canDelegate("createlistaitem")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","createlistaitem", _barcode, _selectedrec, _staterec, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Barcode", _barcode);
Debug.locals.put("SelectedRec", _selectedrec);
Debug.locals.put("StateRec", _staterec);
Debug.locals.put("height", _height);
 BA.debugLineNum = 320;BA.debugLine="Sub createListaItem(Barcode As String, SelectedRec";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 322;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2);
_p.runVoidMethod ("Initialize",barcodescanner.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 323;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(4);
barcodescanner.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(barcodescanner.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),barcodescanner.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 324;BA.debugLine="p.LoadLayout(\"ListaBarcodes\" )";
Debug.ShouldStop(8);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListaBarcodes")),barcodescanner.mostCurrent.activityBA);
 BA.debugLineNum = 325;BA.debugLine="p.RemoveView";
Debug.ShouldStop(16);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 326;BA.debugLine="BarcodeString.TextSize = 12";
Debug.ShouldStop(32);
barcodescanner.mostCurrent._barcodestring.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 327;BA.debugLine="BarcodeString.text = Barcode";
Debug.ShouldStop(64);
barcodescanner.mostCurrent._barcodestring.runMethod(true,"setText",BA.ObjectToCharSequence(_barcode));
 BA.debugLineNum = 328;BA.debugLine="BarCodeCheck.Checked = SelectedRec";
Debug.ShouldStop(128);
barcodescanner.mostCurrent._barcodecheck.runMethodAndSync(true,"setChecked",_selectedrec);
 BA.debugLineNum = 330;BA.debugLine="If StateRec = 1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_staterec,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 331;BA.debugLine="BarCodeState.Text = Chr(0xF00C)";
Debug.ShouldStop(1024);
barcodescanner.mostCurrent._barcodestate.runMethod(true,"setText",BA.ObjectToCharSequence(barcodescanner.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf00c)))));
 BA.debugLineNum = 332;BA.debugLine="BarCodeState.TextColor = Colors.Green";
Debug.ShouldStop(2048);
barcodescanner.mostCurrent._barcodestate.runMethod(true,"setTextColor",barcodescanner.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 }else 
{ BA.debugLineNum = 333;BA.debugLine="Else if StateRec = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_staterec,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 334;BA.debugLine="BarCodeState.Text = Chr(0xF00D)";
Debug.ShouldStop(8192);
barcodescanner.mostCurrent._barcodestate.runMethod(true,"setText",BA.ObjectToCharSequence(barcodescanner.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf00d)))));
 BA.debugLineNum = 335;BA.debugLine="BarCodeState.TextColor = Colors.red";
Debug.ShouldStop(16384);
barcodescanner.mostCurrent._barcodestate.runMethod(true,"setTextColor",barcodescanner.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 337;BA.debugLine="BarCodeState.Text = Chr(0xF068)";
Debug.ShouldStop(65536);
barcodescanner.mostCurrent._barcodestate.runMethod(true,"setText",BA.ObjectToCharSequence(barcodescanner.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf068)))));
 BA.debugLineNum = 338;BA.debugLine="BarCodeState.TextColor = Colors.LightGray";
Debug.ShouldStop(131072);
barcodescanner.mostCurrent._barcodestate.runMethod(true,"setTextColor",barcodescanner.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 }}
;
 BA.debugLineNum = 341;BA.debugLine="p.Tag = $\"${Barcode}|${Utils.Bool2Int(SelectedRec";
Debug.ShouldStop(1048576);
_p.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),barcodescanner.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_barcode))),RemoteObject.createImmutable("|"),barcodescanner.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((barcodescanner.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,barcodescanner.mostCurrent.activityBA,(Object)(_selectedrec))))),RemoteObject.createImmutable("|"),barcodescanner.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_staterec))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 342;BA.debugLine="Return p";
Debug.ShouldStop(2097152);
if (true) return _p;
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private Panel1 As Panel";
barcodescanner.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private camEx As CameraExClass";
barcodescanner.mostCurrent._camex = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass");
 //BA.debugLineNum = 13;BA.debugLine="Private pnlDrawing As Panel";
barcodescanner.mostCurrent._pnldrawing = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private cvs As B4XCanvas";
barcodescanner.mostCurrent._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");
 //BA.debugLineNum = 15;BA.debugLine="Private ScanOnlyOne As Boolean";
barcodescanner._scanonlyone = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 16;BA.debugLine="Private btnCancel As Button";
barcodescanner.mostCurrent._btncancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btnClear As Button";
barcodescanner.mostCurrent._btnclear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txt2set As FloatLabeledEditText";
barcodescanner.mostCurrent._txt2set = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private PassedAct As String";
barcodescanner.mostCurrent._passedact = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Private ListaCodigosLidos As CustomListView";
barcodescanner.mostCurrent._listacodigoslidos = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 21;BA.debugLine="Private BarcodeString As Label";
barcodescanner.mostCurrent._barcodestring = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private BarCodeState As Label";
barcodescanner.mostCurrent._barcodestate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BarCodeCheck As CheckBox";
barcodescanner.mostCurrent._barcodecheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _initializecamera() throws Exception{
try {
		Debug.PushSubsStack("InitializeCamera (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,240);
if (RapidSub.canDelegate("initializecamera")) { xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","initializecamera"); return;}
ResumableSub_InitializeCamera rsub = new ResumableSub_InitializeCamera(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InitializeCamera extends BA.ResumableSub {
public ResumableSub_InitializeCamera(xevolution.vrcg.devdemov2400.barcodescanner parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.barcodescanner parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InitializeCamera (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,240);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 241;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",barcodescanner.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 242;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", barcodescanner.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "barcodescanner", "initializecamera"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 243;BA.debugLine="If Result Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 4;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 244;BA.debugLine="camEx.Initialize(Panel1, frontCamera, Me, \"ScanC";
Debug.ShouldStop(524288);
parent.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_initialize" /*RemoteObject*/ ,barcodescanner.mostCurrent.activityBA,(Object)(parent.mostCurrent._panel1),(Object)(parent._frontcamera),(Object)(barcodescanner.getObject()),(Object)(RemoteObject.createImmutable("ScanCamera")));
 BA.debugLineNum = 245;BA.debugLine="frontCamera = camEx.Front";
Debug.ShouldStop(1048576);
parent._frontcamera = parent.mostCurrent._camex.getField(true,"_front" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private frontCamera As Boolean = False";
barcodescanner._frontcamera = barcodescanner.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 4;BA.debugLine="Private detector As JavaObject";
barcodescanner._detector = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 5;BA.debugLine="Private SearchForBarcodes As Boolean";
barcodescanner._searchforbarcodes = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 6;BA.debugLine="Private LastPreview As Long";
barcodescanner._lastpreview = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 7;BA.debugLine="Private IntervalBetweenPreviewsMs As Int = 500";
barcodescanner._intervalbetweenpreviewsms = BA.numberCast(int.class, 500);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _return2activity() throws Exception{
try {
		Debug.PushSubsStack("Return2Activity (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,72);
if (RapidSub.canDelegate("return2activity")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","return2activity");}
 BA.debugLineNum = 72;BA.debugLine="Sub Return2Activity";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="If PassedAct = \"CheckList3\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",barcodescanner.mostCurrent._passedact,BA.ObjectToString("CheckList3"))) { 
 BA.debugLineNum = 74;BA.debugLine="CallSubDelayed2(CheckList3,\"returnedFromScanner\"";
Debug.ShouldStop(512);
barcodescanner.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",barcodescanner.processBA,(Object)((barcodescanner.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("returnedFromScanner")),(Object)((barcodescanner.mostCurrent._txt2set)));
 BA.debugLineNum = 75;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
barcodescanner.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 76;BA.debugLine="Else If PassedAct = \"requests3\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",barcodescanner.mostCurrent._passedact,BA.ObjectToString("requests3"))) { 
 BA.debugLineNum = 77;BA.debugLine="CallSubDelayed(requests3, \"returnedFromScanner\")";
Debug.ShouldStop(4096);
barcodescanner.mostCurrent.__c.runVoidMethod ("CallSubDelayed",barcodescanner.processBA,(Object)((barcodescanner.mostCurrent._requests3.getObject())),(Object)(RemoteObject.createImmutable("returnedFromScanner")));
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
barcodescanner.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 79;BA.debugLine="Else If PassedAct = \"MainMenu\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",barcodescanner.mostCurrent._passedact,BA.ObjectToString("MainMenu"))) { 
 BA.debugLineNum = 80;BA.debugLine="CallSubDelayed(MainMenu, \"returnedFromScanner\")";
Debug.ShouldStop(32768);
barcodescanner.mostCurrent.__c.runVoidMethod ("CallSubDelayed",barcodescanner.processBA,(Object)((barcodescanner.mostCurrent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("returnedFromScanner")));
 BA.debugLineNum = 81;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
barcodescanner.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 82;BA.debugLine="else if PassedAct = \"CalledFromChapter\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",barcodescanner.mostCurrent._passedact,BA.ObjectToString("CalledFromChapter"))) { 
 BA.debugLineNum = 83;BA.debugLine="CallSubDelayed(CheckList3,\"returnedFromScanner2\"";
Debug.ShouldStop(262144);
barcodescanner.mostCurrent.__c.runVoidMethod ("CallSubDelayed",barcodescanner.processBA,(Object)((barcodescanner.mostCurrent._checklist3.getObject())),(Object)(RemoteObject.createImmutable("returnedFromScanner2")));
 BA.debugLineNum = 84;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
barcodescanner.mostCurrent._activity.runVoidMethod ("Finish");
 }}}}
;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scancamera_picturetaken(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("ScanCamera_PictureTaken (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,268);
if (RapidSub.canDelegate("scancamera_picturetaken")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","scancamera_picturetaken", _data);}
Debug.locals.put("Data", _data);
 BA.debugLineNum = 268;BA.debugLine="Sub ScanCamera_PictureTaken (Data() As Byte)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _scancamera_preview(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("ScanCamera_Preview (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,108);
if (RapidSub.canDelegate("scancamera_preview")) { xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","scancamera_preview", _data); return;}
ResumableSub_ScanCamera_Preview rsub = new ResumableSub_ScanCamera_Preview(null,_data);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ScanCamera_Preview extends BA.ResumableSub {
public ResumableSub_ScanCamera_Preview(xevolution.vrcg.devdemov2400.barcodescanner parent,RemoteObject _data) {
this.parent = parent;
this._data = _data;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.barcodescanner parent;
RemoteObject _data;
RemoteObject _framebuilder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _bb = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
RemoteObject _frame = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _sparsearray = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _matches = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _barcode = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _raw = RemoteObject.createImmutable("");
RemoteObject _found = RemoteObject.createImmutable(false);
int _x = 0;
RemoteObject _codeinlist = RemoteObject.createImmutable("");
int _a = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _check_box = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _lbl_state = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_barcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _points = null;
RemoteObject _tl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _br = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _size = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
RemoteObject _xscale = RemoteObject.createImmutable(0f);
RemoteObject _yscale = RemoteObject.createImmutable(0f);
int step14;
int limit14;
int step28;
int limit28;
int step43;
int limit43;
int step45;
int limit45;
int step56;
int limit56;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ScanCamera_Preview (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,108);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("data", _data);
 BA.debugLineNum = 109;BA.debugLine="If SearchForBarcodes Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 82;
if (parent._searchforbarcodes.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 110;BA.debugLine="If DateTime.Now > LastPreview + IntervalBetweenP";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//if
this.state = 81;
if (RemoteObject.solveBoolean(">",parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {parent._lastpreview,parent._intervalbetweenpreviewsms}, "+",1, 2))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 112;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.ShouldStop(32768);
parent.mostCurrent._cvs.runVoidMethod ("ClearRect",(Object)(parent.mostCurrent._cvs.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 113;BA.debugLine="Dim frameBuilder As JavaObject";
Debug.ShouldStop(65536);
_framebuilder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("frameBuilder", _framebuilder);
 BA.debugLineNum = 114;BA.debugLine="Dim bb As JavaObject";
Debug.ShouldStop(131072);
_bb = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("bb", _bb);
 BA.debugLineNum = 115;BA.debugLine="bb = bb.InitializeStatic(\"java.nio.ByteBuffer\")";
Debug.ShouldStop(262144);
_bb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _bb.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("java.nio.ByteBuffer"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("wrap")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_data)}))));
 BA.debugLineNum = 116;BA.debugLine="frameBuilder.InitializeNewInstance(\"com/google/";
Debug.ShouldStop(524288);
_framebuilder.runVoidMethod ("InitializeNewInstance",(Object)(RemoteObject.createImmutable("com/google/android/gms/vision/Frame.Builder").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(".")))),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 117;BA.debugLine="Dim cs As CameraSize = camEx.GetPreviewSize";
Debug.ShouldStop(1048576);
_cs = parent.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getpreviewsize" /*RemoteObject*/ );Debug.locals.put("cs", _cs);Debug.locals.put("cs", _cs);
 BA.debugLineNum = 118;BA.debugLine="frameBuilder.RunMethod(\"setImageData\", Array(bb";
Debug.ShouldStop(2097152);
_framebuilder.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setImageData")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_bb.getObject()),(_cs.getField(true,"Width" /*RemoteObject*/ )),(_cs.getField(true,"Height" /*RemoteObject*/ )),RemoteObject.createImmutable((842094169))})));
 BA.debugLineNum = 119;BA.debugLine="Dim frame As JavaObject = frameBuilder.RunMetho";
Debug.ShouldStop(4194304);
_frame = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_frame = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _framebuilder.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((parent.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("frame", _frame);
 BA.debugLineNum = 120;BA.debugLine="Dim SparseArray As JavaObject = detector.RunMet";
Debug.ShouldStop(8388608);
_sparsearray = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_sparsearray = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), parent._detector.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("detect")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_frame.getObject())}))));Debug.locals.put("SparseArray", _sparsearray);
 BA.debugLineNum = 121;BA.debugLine="LastPreview = DateTime.Now";
Debug.ShouldStop(16777216);
parent._lastpreview = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 BA.debugLineNum = 122;BA.debugLine="Dim Matches As Int = SparseArray.RunMethod(\"siz";
Debug.ShouldStop(33554432);
_matches = BA.numberCast(int.class, _sparsearray.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("size")),(Object)((parent.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("Matches", _matches);Debug.locals.put("Matches", _matches);
 BA.debugLineNum = 123;BA.debugLine="For i = 0 To Matches - 1";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//for
this.state = 77;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_matches,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 83;
if (true) break;

case 83:
//C
this.state = 77;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 9;
if (true) break;

case 84:
//C
this.state = 83;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 124;BA.debugLine="Dim barcode As JavaObject = SparseArray.RunMet";
Debug.ShouldStop(134217728);
_barcode = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_barcode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _sparsearray.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("valueAt")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((_i))}))));Debug.locals.put("barcode", _barcode);
 BA.debugLineNum = 125;BA.debugLine="Dim raw As String = barcode.GetField(\"rawValue";
Debug.ShouldStop(268435456);
_raw = BA.ObjectToString(_barcode.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("rawValue"))));Debug.locals.put("raw", _raw);Debug.locals.put("raw", _raw);
 BA.debugLineNum = 129;BA.debugLine="If ShareCode.SingleScan Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 65;
if (parent.mostCurrent._sharecode._singlescan /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 65;
 BA.debugLineNum = 130;BA.debugLine="ShareCode.ScanList.Clear";
Debug.ShouldStop(2);
parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 131;BA.debugLine="ShareCode.ScanList.Add(raw)";
Debug.ShouldStop(4);
parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_raw)));
 BA.debugLineNum = 132;BA.debugLine="Sleep(500)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",barcodescanner.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "barcodescanner", "scancamera_preview"),BA.numberCast(int.class, 500));
this.state = 85;
return;
case 85:
//C
this.state = 65;
;
 BA.debugLineNum = 134;BA.debugLine="Return2Activity";
Debug.ShouldStop(32);
_return2activity();
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 136;BA.debugLine="If ShareCode.AllowScanDuplicates Then";
Debug.ShouldStop(128);
if (true) break;

case 15:
//if
this.state = 31;
if (parent.mostCurrent._sharecode._allowscanduplicates /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 31;
 BA.debugLineNum = 137;BA.debugLine="ShareCode.ScanList.Add(raw)";
Debug.ShouldStop(256);
parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_raw)));
 BA.debugLineNum = 138;BA.debugLine="ListaCodigosLidos.Add(createListaItem(raw,Fa";
Debug.ShouldStop(512);
parent.mostCurrent._listacodigoslidos.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistaitem(_raw,parent.mostCurrent.__c.getField(true,"False"),BA.numberCast(int.class, 2),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 140;BA.debugLine="Dim found As Boolean = False";
Debug.ShouldStop(2048);
_found = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("found", _found);Debug.locals.put("found", _found);
 BA.debugLineNum = 141;BA.debugLine="For x=0 To ShareCode.ScanList.Size -1";
Debug.ShouldStop(4096);
if (true) break;

case 20:
//for
this.state = 27;
step28 = 1;
limit28 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
Debug.locals.put("x", _x);
this.state = 86;
if (true) break;

case 86:
//C
this.state = 27;
if ((step28 > 0 && _x <= limit28) || (step28 < 0 && _x >= limit28)) this.state = 22;
if (true) break;

case 87:
//C
this.state = 86;
_x = ((int)(0 + _x + step28)) ;
Debug.locals.put("x", _x);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 142;BA.debugLine="Dim codeinlist As String = ShareCode.ScanLi";
Debug.ShouldStop(8192);
_codeinlist = BA.ObjectToString(parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _x))));Debug.locals.put("codeinlist", _codeinlist);Debug.locals.put("codeinlist", _codeinlist);
 BA.debugLineNum = 143;BA.debugLine="If codeinlist = raw Then";
Debug.ShouldStop(16384);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_codeinlist,_raw)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 144;BA.debugLine="found = True";
Debug.ShouldStop(32768);
_found = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("found", _found);
 if (true) break;

case 26:
//C
this.state = 87;
;
 if (true) break;
if (true) break;
Debug.locals.put("x", _x);
;
 BA.debugLineNum = 147;BA.debugLine="If Not(found) Then";
Debug.ShouldStop(262144);

case 27:
//if
this.state = 30;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_found)).<Boolean>get().booleanValue()) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 148;BA.debugLine="ShareCode.ScanList.Add(raw)";
Debug.ShouldStop(524288);
parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_raw)));
 BA.debugLineNum = 149;BA.debugLine="ListaCodigosLidos.Add(createListaItem(raw,F";
Debug.ShouldStop(1048576);
parent.mostCurrent._listacodigoslidos.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistaitem(_raw,parent.mostCurrent.__c.getField(true,"False"),BA.numberCast(int.class, 2),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
 BA.debugLineNum = 156;BA.debugLine="If ShareCode.Flag2CompareCodes Then";
Debug.ShouldStop(134217728);

case 31:
//if
this.state = 64;
if (parent.mostCurrent._sharecode._flag2comparecodes /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 157;BA.debugLine="Log($\"code to compare with list = ${raw}\"$)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6119537713",(RemoteObject.concat(RemoteObject.createImmutable("code to compare with list = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_raw))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 158;BA.debugLine="If ShareCode.ListOfCodes2Compare.Size > 0 Th";
Debug.ShouldStop(536870912);
if (true) break;

case 34:
//if
this.state = 63;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._sharecode._listofcodes2compare /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 159;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPl";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",barcodescanner.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 160;BA.debugLine="For a=0 To ShareCode.ListOfCodes2Compare.si";
Debug.ShouldStop(-2147483648);
if (true) break;

case 37:
//for
this.state = 62;
step43 = 1;
limit43 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._sharecode._listofcodes2compare /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_a = 0 ;
Debug.locals.put("a", _a);
this.state = 88;
if (true) break;

case 88:
//C
this.state = 62;
if ((step43 > 0 && _a <= limit43) || (step43 < 0 && _a >= limit43)) this.state = 39;
if (true) break;

case 89:
//C
this.state = 88;
_a = ((int)(0 + _a + step43)) ;
Debug.locals.put("a", _a);
if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 161;BA.debugLine="If ShareCode.ListOfCodes2Compare.Get(a) =";
Debug.ShouldStop(1);
if (true) break;

case 40:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._listofcodes2compare /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _a))),(_raw))) { 
this.state = 42;
}else {
this.state = 52;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 162;BA.debugLine="For i=0 To ListaCodigosLidos.Size -1";
Debug.ShouldStop(2);
if (true) break;

case 43:
//for
this.state = 50;
step45 = 1;
limit45 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._listacodigoslidos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 90;
if (true) break;

case 90:
//C
this.state = 50;
if ((step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45)) this.state = 45;
if (true) break;

case 91:
//C
this.state = 90;
_i = ((int)(0 + _i + step45)) ;
Debug.locals.put("i", _i);
if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 163;BA.debugLine="Dim pnl As Panel = ListaCodigosLidos.Get";
Debug.ShouldStop(4);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), parent.mostCurrent._listacodigoslidos.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i))).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 164;BA.debugLine="Dim check_box As CheckBox = pnl.GetView(";
Debug.ShouldStop(8);
_check_box = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_check_box = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("check_box", _check_box);
 BA.debugLineNum = 165;BA.debugLine="Dim lbl_state As Label = pnl.GetView(1)";
Debug.ShouldStop(16);
_lbl_state = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_state = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_state", _lbl_state);
 BA.debugLineNum = 166;BA.debugLine="Dim lbl_barcode As Label  = pnl.GetView(";
Debug.ShouldStop(32);
_lbl_barcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_barcode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lbl_barcode", _lbl_barcode);
 BA.debugLineNum = 168;BA.debugLine="If lbl_barcode.Text.Trim = raw Then";
Debug.ShouldStop(128);
if (true) break;

case 46:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",_lbl_barcode.runMethod(true,"getText").runMethod(true,"trim"),_raw)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 169;BA.debugLine="lbl_state.Text = Chr(0xF00C)";
Debug.ShouldStop(256);
_lbl_state.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf00c)))));
 BA.debugLineNum = 170;BA.debugLine="lbl_state.TextColor = Colors.Green";
Debug.ShouldStop(512);
_lbl_state.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 if (true) break;

case 49:
//C
this.state = 91;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 61;
Debug.locals.put("i", _i);
;
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 174;BA.debugLine="For i=0 To ListaCodigosLidos.Size -1";
Debug.ShouldStop(8192);
if (true) break;

case 53:
//for
this.state = 60;
step56 = 1;
limit56 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._listacodigoslidos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 92;
if (true) break;

case 92:
//C
this.state = 60;
if ((step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56)) this.state = 55;
if (true) break;

case 93:
//C
this.state = 92;
_i = ((int)(0 + _i + step56)) ;
Debug.locals.put("i", _i);
if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 175;BA.debugLine="Dim pnl As Panel = ListaCodigosLidos.Get";
Debug.ShouldStop(16384);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), parent.mostCurrent._listacodigoslidos.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i))).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 176;BA.debugLine="Dim check_box As CheckBox = pnl.GetView(";
Debug.ShouldStop(32768);
_check_box = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_check_box = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("check_box", _check_box);
 BA.debugLineNum = 177;BA.debugLine="Dim lbl_state As Label = pnl.GetView(1)";
Debug.ShouldStop(65536);
_lbl_state = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_state = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_state", _lbl_state);
 BA.debugLineNum = 178;BA.debugLine="Dim lbl_barcode As Label  = pnl.GetView(";
Debug.ShouldStop(131072);
_lbl_barcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_barcode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lbl_barcode", _lbl_barcode);
 BA.debugLineNum = 180;BA.debugLine="If lbl_barcode.Text.Trim = raw Then";
Debug.ShouldStop(524288);
if (true) break;

case 56:
//if
this.state = 59;
if (RemoteObject.solveBoolean("=",_lbl_barcode.runMethod(true,"getText").runMethod(true,"trim"),_raw)) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 181;BA.debugLine="lbl_state.Text = Chr(0xF00D)";
Debug.ShouldStop(1048576);
_lbl_state.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf00d)))));
 BA.debugLineNum = 182;BA.debugLine="lbl_state.TextColor = Colors.red";
Debug.ShouldStop(2097152);
_lbl_state.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 if (true) break;

case 59:
//C
this.state = 93;
;
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
Debug.locals.put("i", _i);
;
 if (true) break;

case 61:
//C
this.state = 89;
;
 if (true) break;
if (true) break;

case 62:
//C
this.state = 63;
Debug.locals.put("a", _a);
;
 BA.debugLineNum = 187;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 63:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 193;BA.debugLine="ToastMessageShow(ShareCode.ScanList, True)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._scanlist /*RemoteObject*/ .getObject())),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 195;BA.debugLine="Dim points() As Object = barcode.GetField(\"cor";
Debug.ShouldStop(4);
_points = (_barcode.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("cornerPoints"))));Debug.locals.put("points", _points);Debug.locals.put("points", _points);
 BA.debugLineNum = 196;BA.debugLine="Dim tl As JavaObject = points(0)";
Debug.ShouldStop(8);
_tl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_tl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _points.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("tl", _tl);
 BA.debugLineNum = 198;BA.debugLine="Dim br As JavaObject = points(2)";
Debug.ShouldStop(32);
_br = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_br = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _points.getArrayElement(false,BA.numberCast(int.class, 2)));Debug.locals.put("br", _br);
 BA.debugLineNum = 200;BA.debugLine="Dim r As B4XRect";
Debug.ShouldStop(128);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 202;BA.debugLine="Dim size As CameraSize = camEx.GetPreviewSize";
Debug.ShouldStop(512);
_size = parent.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getpreviewsize" /*RemoteObject*/ );Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 203;BA.debugLine="Dim xscale, yscale As Float";
Debug.ShouldStop(1024);
_xscale = RemoteObject.createImmutable(0f);Debug.locals.put("xscale", _xscale);
_yscale = RemoteObject.createImmutable(0f);Debug.locals.put("yscale", _yscale);
 BA.debugLineNum = 204;BA.debugLine="If camEx.PreviewOrientation Mod 180 = 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 66:
//if
this.state = 71;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._camex.getField(true,"_previeworientation" /*RemoteObject*/ ),RemoteObject.createImmutable(180)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
 BA.debugLineNum = 205;BA.debugLine="xscale = Panel1.Width / size.Width";
Debug.ShouldStop(4096);
_xscale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panel1.runMethod(true,"getWidth"),_size.getField(true,"Width" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("xscale", _xscale);
 BA.debugLineNum = 206;BA.debugLine="yscale = Panel1.Height / size.Height";
Debug.ShouldStop(8192);
_yscale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panel1.runMethod(true,"getHeight"),_size.getField(true,"Height" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("yscale", _yscale);
 BA.debugLineNum = 207;BA.debugLine="r.Initialize(tl.GetField(\"x\"), tl.GetField(\"y";
Debug.ShouldStop(16384);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _tl.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("x"))))),(Object)(BA.numberCast(float.class, _tl.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("y"))))),(Object)(BA.numberCast(float.class, _br.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("x"))))),(Object)(BA.numberCast(float.class, _br.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("y"))))));
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 209;BA.debugLine="xscale = Panel1.Width / size.Height";
Debug.ShouldStop(65536);
_xscale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panel1.runMethod(true,"getWidth"),_size.getField(true,"Height" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("xscale", _xscale);
 BA.debugLineNum = 210;BA.debugLine="yscale = Panel1.Height / size.Width";
Debug.ShouldStop(131072);
_yscale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panel1.runMethod(true,"getHeight"),_size.getField(true,"Width" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("yscale", _yscale);
 BA.debugLineNum = 211;BA.debugLine="r.Initialize(br.GetField(\"y\"), br.GetField(\"x";
Debug.ShouldStop(262144);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _br.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("y"))))),(Object)(BA.numberCast(float.class, _br.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("x"))))),(Object)(BA.numberCast(float.class, _tl.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("y"))))),(Object)(BA.numberCast(float.class, _tl.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("x"))))));
 if (true) break;
;
 BA.debugLineNum = 214;BA.debugLine="Select camEx.PreviewOrientation";
Debug.ShouldStop(2097152);

case 71:
//select
this.state = 76;
switch (BA.switchObjectToInt(parent.mostCurrent._camex.getField(true,"_previeworientation" /*RemoteObject*/ ),BA.numberCast(int.class, 180),BA.numberCast(int.class, 90))) {
case 0: {
this.state = 73;
if (true) break;
}
case 1: {
this.state = 75;
if (true) break;
}
}
if (true) break;

case 73:
//C
this.state = 76;
 BA.debugLineNum = 216;BA.debugLine="r.Initialize(size.Width - r.Right, size.Heig";
Debug.ShouldStop(8388608);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size.getField(true,"Width" /*RemoteObject*/ ),_r.runMethod(true,"getRight")}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size.getField(true,"Height" /*RemoteObject*/ ),_r.runMethod(true,"getBottom")}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size.getField(true,"Width" /*RemoteObject*/ ),_r.runMethod(true,"getLeft")}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size.getField(true,"Height" /*RemoteObject*/ ),_r.runMethod(true,"getTop")}, "-",1, 0))));
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 218;BA.debugLine="r.Initialize(size.Height - r.Right, r.Top, s";
Debug.ShouldStop(33554432);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size.getField(true,"Height" /*RemoteObject*/ ),_r.runMethod(true,"getRight")}, "-",1, 0))),(Object)(_r.runMethod(true,"getTop")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size.getField(true,"Height" /*RemoteObject*/ ),_r.runMethod(true,"getLeft")}, "-",1, 0))),(Object)(_r.runMethod(true,"getBottom")));
 if (true) break;

case 76:
//C
this.state = 84;
;
 BA.debugLineNum = 220;BA.debugLine="r.Left = r.Left * xscale";
Debug.ShouldStop(134217728);
_r.runMethod(true,"setLeft",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getLeft"),_xscale}, "*",0, 0)));
 BA.debugLineNum = 221;BA.debugLine="r.Right = r.Right * xscale";
Debug.ShouldStop(268435456);
_r.runMethod(true,"setRight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getRight"),_xscale}, "*",0, 0)));
 BA.debugLineNum = 222;BA.debugLine="r.Top = r.Top * yscale";
Debug.ShouldStop(536870912);
_r.runMethod(true,"setTop",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),_yscale}, "*",0, 0)));
 BA.debugLineNum = 223;BA.debugLine="r.Bottom = r.Bottom * yscale";
Debug.ShouldStop(1073741824);
_r.runMethod(true,"setBottom",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getBottom"),_yscale}, "*",0, 0)));
 BA.debugLineNum = 224;BA.debugLine="cvs.DrawRect(r, Colors.Red, False, 5dip)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._cvs.runVoidMethod ("DrawRect",(Object)(_r),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 226;BA.debugLine="If Matches = 0 Then";
Debug.ShouldStop(2);

case 77:
//if
this.state = 80;
if (RemoteObject.solveBoolean("=",_matches,BA.numberCast(double.class, 0))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 227;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.ShouldStop(4);
parent.mostCurrent._cvs.runVoidMethod ("ClearRect",(Object)(parent.mostCurrent._cvs.runMethod(false,"getTargetRect")));
 if (true) break;

case 80:
//C
this.state = 81;
;
 BA.debugLineNum = 229;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(16);
parent.mostCurrent._cvs.runVoidMethod ("Invalidate");
 if (true) break;

case 81:
//C
this.state = 82;
;
 if (true) break;

case 82:
//C
this.state = -1;
;
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _scancamera_ready(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("ScanCamera_Ready (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,256);
if (RapidSub.canDelegate("scancamera_ready")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","scancamera_ready", _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 256;BA.debugLine="Sub ScanCamera_Ready (Success As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="If Success Then";
Debug.ShouldStop(1);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 258;BA.debugLine="camEx.SetJpegQuality(90)";
Debug.ShouldStop(2);
barcodescanner.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setjpegquality" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 90)));
 BA.debugLineNum = 259;BA.debugLine="camEx.SetContinuousAutoFocus";
Debug.ShouldStop(4);
barcodescanner.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setcontinuousautofocus" /*RemoteObject*/ );
 BA.debugLineNum = 260;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(8);
barcodescanner.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 261;BA.debugLine="camEx.StartPreview";
Debug.ShouldStop(16);
barcodescanner.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 264;BA.debugLine="ToastMessageShow(\"Cannot open camera.\", True)";
Debug.ShouldStop(128);
barcodescanner.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cannot open camera.")),(Object)(barcodescanner.mostCurrent.__c.getField(true,"True")));
 };
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
public static RemoteObject  _starscanningmulti(RemoteObject _act) throws Exception{
try {
		Debug.PushSubsStack("StarScanningMulti (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,55);
if (RapidSub.canDelegate("starscanningmulti")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","starscanningmulti", _act);}
Debug.locals.put("act", _act);
 BA.debugLineNum = 55;BA.debugLine="Sub StarScanningMulti(act As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="ListaCodigosLidos.AsView.Visible = True";
Debug.ShouldStop(8388608);
barcodescanner.mostCurrent._listacodigoslidos.runMethod(false,"_asview").runMethod(true,"setVisible",barcodescanner.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="ShareCode.Flag2CompareCodes = False";
Debug.ShouldStop(16777216);
barcodescanner.mostCurrent._sharecode._flag2comparecodes /*RemoteObject*/  = barcodescanner.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 58;BA.debugLine="btnClear.Visible = True";
Debug.ShouldStop(33554432);
barcodescanner.mostCurrent._btnclear.runMethod(true,"setVisible",barcodescanner.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="ScanOnlyOne = False";
Debug.ShouldStop(67108864);
barcodescanner._scanonlyone = barcodescanner.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 60;BA.debugLine="PassedAct = act";
Debug.ShouldStop(134217728);
barcodescanner.mostCurrent._passedact = _act;
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starscanningmulti2compare(RemoteObject _act) throws Exception{
try {
		Debug.PushSubsStack("StarScanningMulti2Compare (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,63);
if (RapidSub.canDelegate("starscanningmulti2compare")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","starscanningmulti2compare", _act);}
Debug.locals.put("act", _act);
 BA.debugLineNum = 63;BA.debugLine="Sub StarScanningMulti2Compare(act As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="ListaCodigosLidos.AsView.Visible = True";
Debug.ShouldStop(-2147483648);
barcodescanner.mostCurrent._listacodigoslidos.runMethod(false,"_asview").runMethod(true,"setVisible",barcodescanner.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="ShareCode.Flag2CompareCodes = True";
Debug.ShouldStop(1);
barcodescanner.mostCurrent._sharecode._flag2comparecodes /*RemoteObject*/  = barcodescanner.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 66;BA.debugLine="btnClear.Visible = True";
Debug.ShouldStop(2);
barcodescanner.mostCurrent._btnclear.runMethod(true,"setVisible",barcodescanner.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="ScanOnlyOne = False";
Debug.ShouldStop(4);
barcodescanner._scanonlyone = barcodescanner.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 68;BA.debugLine="PassedAct = act";
Debug.ShouldStop(8);
barcodescanner.mostCurrent._passedact = _act;
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
public static RemoteObject  _startscanning(RemoteObject _act,RemoteObject _view2set) throws Exception{
try {
		Debug.PushSubsStack("StartScanning (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,41);
if (RapidSub.canDelegate("startscanning")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","startscanning", _act, _view2set);}
Debug.locals.put("act", _act);
Debug.locals.put("view2set", _view2set);
 BA.debugLineNum = 41;BA.debugLine="Sub StartScanning(act As String, view2set As Float";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="ScanOnlyOne = ShareCode.SingleScan";
Debug.ShouldStop(512);
barcodescanner._scanonlyone = barcodescanner.mostCurrent._sharecode._singlescan /*RemoteObject*/ ;
 BA.debugLineNum = 43;BA.debugLine="txt2set = view2set";
Debug.ShouldStop(1024);
barcodescanner.mostCurrent._txt2set = _view2set;
 BA.debugLineNum = 44;BA.debugLine="PassedAct = act";
Debug.ShouldStop(2048);
barcodescanner.mostCurrent._passedact = _act;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startscanningsingle(RemoteObject _act) throws Exception{
try {
		Debug.PushSubsStack("StartScanningSingle (barcodescanner) ","barcodescanner",24,barcodescanner.mostCurrent.activityBA,barcodescanner.mostCurrent,47);
if (RapidSub.canDelegate("startscanningsingle")) { return xevolution.vrcg.devdemov2400.barcodescanner.remoteMe.runUserSub(false, "barcodescanner","startscanningsingle", _act);}
Debug.locals.put("act", _act);
 BA.debugLineNum = 47;BA.debugLine="Sub StartScanningSingle(act As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="ListaCodigosLidos.AsView.Visible = False";
Debug.ShouldStop(32768);
barcodescanner.mostCurrent._listacodigoslidos.runMethod(false,"_asview").runMethod(true,"setVisible",barcodescanner.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="ShareCode.Flag2CompareCodes = False";
Debug.ShouldStop(65536);
barcodescanner.mostCurrent._sharecode._flag2comparecodes /*RemoteObject*/  = barcodescanner.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 50;BA.debugLine="btnClear.Visible = False";
Debug.ShouldStop(131072);
barcodescanner.mostCurrent._btnclear.runMethod(true,"setVisible",barcodescanner.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="ScanOnlyOne = ShareCode.SingleScan";
Debug.ShouldStop(262144);
barcodescanner._scanonlyone = barcodescanner.mostCurrent._sharecode._singlescan /*RemoteObject*/ ;
 BA.debugLineNum = 52;BA.debugLine="PassedAct = act";
Debug.ShouldStop(524288);
barcodescanner.mostCurrent._passedact = _act;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}