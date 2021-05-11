package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class appfirstinstalldialog_subs_0 {


public static RemoteObject  _addcounters(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("AddCounters (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,640);
if (RapidSub.canDelegate("addcounters")) { return __ref.runUserSub(false, "appfirstinstalldialog","addcounters", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 640;BA.debugLine="Sub AddCounters(progress As ProgressBar, dlg As La";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 641;BA.debugLine="progress.Progress = progress.Progress + 1";
Debug.ShouldStop(1);
_progress.runMethod(true,"setProgress",RemoteObject.solve(new RemoteObject[] {_progress.runMethod(true,"getProgress"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 642;BA.debugLine="If progress.Progress = 100 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_progress.runMethod(true,"getProgress"),BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 643;BA.debugLine="progress.Progress = 0";
Debug.ShouldStop(4);
_progress.runMethod(true,"setProgress",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 646;BA.debugLine="dlg.Text = $\"${CURRENT_COUNTER}/${END_COUNTER}\"$";
Debug.ShouldStop(32);
_dlg.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_current_counter" /*RemoteObject*/ )))),RemoteObject.createImmutable("/"),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_end_counter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 647;BA.debugLine="Log($\"Counter: ${CURRENT_COUNTER} of ${END_COUNTE";
Debug.ShouldStop(64);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","682509831",(RemoteObject.concat(RemoteObject.createImmutable("Counter: "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_current_counter" /*RemoteObject*/ )))),RemoteObject.createImmutable(" of "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_end_counter" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 648;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER + 1";
Debug.ShouldStop(128);
__ref.setField ("_current_counter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_current_counter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 650;BA.debugLine="If (CURRENT_COUNTER > END_COUNTER) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean(">",__ref.getField(true,"_current_counter" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_end_counter" /*RemoteObject*/ ))))) { 
 BA.debugLineNum = 651;BA.debugLine="If (thisTimer.IsInitialized) Then";
Debug.ShouldStop(1024);
if ((__ref.getField(false,"_thistimer" /*RemoteObject*/ ).runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 652;BA.debugLine="thisTimer.Enabled = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_thistimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",appfirstinstalldialog.__c.getField(true,"False"));
 };
 BA.debugLineNum = 654;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(8192);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(appfirstinstalldialog.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 };
 BA.debugLineNum = 660;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkfilesinftp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckFilesInFTP (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,546);
if (RapidSub.canDelegate("checkfilesinftp")) { return __ref.runUserSub(false, "appfirstinstalldialog","checkfilesinftp", __ref);}
 BA.debugLineNum = 546;BA.debugLine="Sub CheckFilesInFTP";
Debug.ShouldStop(2);
 BA.debugLineNum = 576;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private thisTimer As Timer";
appfirstinstalldialog._thistimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_thistimer",appfirstinstalldialog._thistimer);
 //BA.debugLineNum = 3;BA.debugLine="Private thisTimerCounter As Int = 0";
appfirstinstalldialog._thistimercounter = BA.numberCast(int.class, 0);__ref.setField("_thistimercounter",appfirstinstalldialog._thistimercounter);
 //BA.debugLineNum = 4;BA.debugLine="Private CurrentActivityObject As Object";
appfirstinstalldialog._currentactivityobject = RemoteObject.createNew ("Object");__ref.setField("_currentactivityobject",appfirstinstalldialog._currentactivityobject);
 //BA.debugLineNum = 6;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
appfirstinstalldialog._appldialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_appldialog",appfirstinstalldialog._appldialog);
 //BA.debugLineNum = 7;BA.debugLine="Private DialogQuantityValue As FloatLabeledEditTe";
appfirstinstalldialog._dialogquantityvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogquantityvalue",appfirstinstalldialog._dialogquantityvalue);
 //BA.debugLineNum = 8;BA.debugLine="Private ReturnQuantityValue As Int = 0";
appfirstinstalldialog._returnquantityvalue = BA.numberCast(int.class, 0);__ref.setField("_returnquantityvalue",appfirstinstalldialog._returnquantityvalue);
 //BA.debugLineNum = 9;BA.debugLine="Private ThisActivity As Activity";
appfirstinstalldialog._thisactivity = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_thisactivity",appfirstinstalldialog._thisactivity);
 //BA.debugLineNum = 10;BA.debugLine="Private ThisActivityName As Object";
appfirstinstalldialog._thisactivityname = RemoteObject.createNew ("Object");__ref.setField("_thisactivityname",appfirstinstalldialog._thisactivityname);
 //BA.debugLineNum = 12;BA.debugLine="Private CurrentCLD As CustomLayoutDialog";
appfirstinstalldialog._currentcld = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_currentcld",appfirstinstalldialog._currentcld);
 //BA.debugLineNum = 13;BA.debugLine="Private dialogProgress As ProgressBar";
appfirstinstalldialog._dialogprogress = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");__ref.setField("_dialogprogress",appfirstinstalldialog._dialogprogress);
 //BA.debugLineNum = 14;BA.debugLine="Private dialogMainText As Label";
appfirstinstalldialog._dialogmaintext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dialogmaintext",appfirstinstalldialog._dialogmaintext);
 //BA.debugLineNum = 15;BA.debugLine="Private CURRENT_COUNTER As Int = 0";
appfirstinstalldialog._current_counter = BA.numberCast(int.class, 0);__ref.setField("_current_counter",appfirstinstalldialog._current_counter);
 //BA.debugLineNum = 16;BA.debugLine="Private END_COUNTER As Int = 0";
appfirstinstalldialog._end_counter = BA.numberCast(int.class, 0);__ref.setField("_end_counter",appfirstinstalldialog._end_counter);
 //BA.debugLineNum = 17;BA.debugLine="Private FILES_IN_FTP As Int = 0";
appfirstinstalldialog._files_in_ftp = BA.numberCast(int.class, 0);__ref.setField("_files_in_ftp",appfirstinstalldialog._files_in_ftp);
 //BA.debugLineNum = 18;BA.debugLine="Private FTPFileList As List";
appfirstinstalldialog._ftpfilelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_ftpfilelist",appfirstinstalldialog._ftpfilelist);
 //BA.debugLineNum = 19;BA.debugLine="Private dialogPositions As Label";
appfirstinstalldialog._dialogpositions = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dialogpositions",appfirstinstalldialog._dialogpositions);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _downloadalltables(RemoteObject __ref,RemoteObject _activname,RemoteObject _title,RemoteObject _textinfo,RemoteObject _cnt,RemoteObject _tcnt) throws Exception{
try {
		Debug.PushSubsStack("DownloadAllTables (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("downloadalltables")) { __ref.runUserSub(false, "appfirstinstalldialog","downloadalltables", __ref, _activname, _title, _textinfo, _cnt, _tcnt); return;}
ResumableSub_DownloadAllTables rsub = new ResumableSub_DownloadAllTables(null,__ref,_activname,_title,_textinfo,_cnt,_tcnt);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadAllTables extends BA.ResumableSub {
public ResumableSub_DownloadAllTables(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _activname,RemoteObject _title,RemoteObject _textinfo,RemoteObject _cnt,RemoteObject _tcnt) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._title = _title;
this._textinfo = _textinfo;
this._cnt = _cnt;
this._tcnt = _tcnt;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _textinfo;
RemoteObject _cnt;
RemoteObject _tcnt;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadAllTables (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,30);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("textInfo", _textinfo);
Debug.locals.put("cnt", _cnt);
Debug.locals.put("tcnt", _tcnt);
 BA.debugLineNum = 31;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(1073741824);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 32;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
Debug.ShouldStop(-2147483648);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 33;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhiteSilver";
Debug.ShouldStop(1);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhitesilverlight /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 34;BA.debugLine="ApplDialog.SetSize(80%x, 200dip)";
Debug.ShouldStop(2);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 35;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(4);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 36;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadalltables"), null);
this.state = 41;
return;
case 41:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 37;BA.debugLine="DialogPanel.LoadLayout(\"dialog_downloadprogress\")";
Debug.ShouldStop(16);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_downloadprogress")),__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="dialogProgress.Progress = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_dialogprogress" /*RemoteObject*/ ).runMethod(true,"setProgress",BA.numberCast(int.class, 0));
 BA.debugLineNum = 39;BA.debugLine="END_COUNTER = END_COUNTER + cnt";
Debug.ShouldStop(64);
__ref.setField ("_end_counter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_end_counter" /*RemoteObject*/ ),_cnt}, "+",1, 1));
 BA.debugLineNum = 40;BA.debugLine="dialogMainText.Text = textInfo";
Debug.ShouldStop(128);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_textinfo));
 BA.debugLineNum = 41;BA.debugLine="If (tcnt = 1) Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 1)))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 44;BA.debugLine="else if (tcnt = 2) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 2)))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 47;BA.debugLine="else if (tcnt = 3) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 3)))) { 
this.state = 7;
}else 
{ BA.debugLineNum = 50;BA.debugLine="else if (tcnt = 4) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 4)))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 53;BA.debugLine="else if (tcnt = 5) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 5)))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 56;BA.debugLine="else if (tcnt = 6) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 6)))) { 
this.state = 13;
}else 
{ BA.debugLineNum = 59;BA.debugLine="else if (tcnt = 7) Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 7)))) { 
this.state = 15;
}else 
{ BA.debugLineNum = 62;BA.debugLine="else if (tcnt = 8) Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 8)))) { 
this.state = 17;
}else 
{ BA.debugLineNum = 65;BA.debugLine="else if (tcnt = 9) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 9)))) { 
this.state = 19;
}}}}}}}}}
if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 42;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (P";
Debug.ShouldStop(512);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Pedidos, Tipos Objectos)"))));
 BA.debugLineNum = 43;BA.debugLine="DownloadStart1(dialogProgress, dialogPositions)";
Debug.ShouldStop(1024);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart1" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 5:
//C
this.state = 20;
 BA.debugLineNum = 45;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (D";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Documentos, Equipamentos, Contactos, Moradas)"))));
 BA.debugLineNum = 46;BA.debugLine="DownloadStart2(dialogProgress, dialogPositions)";
Debug.ShouldStop(8192);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart2" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 7:
//C
this.state = 20;
 BA.debugLineNum = 48;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (C";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Contractos, Departamentos, Equipas)"))));
 BA.debugLineNum = 49;BA.debugLine="DownloadStart3(dialogProgress, dialogPositions)";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart3" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 51;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (A";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Artigos, Armazéns, Listas de verificação)"))));
 BA.debugLineNum = 52;BA.debugLine="DownloadStart4(dialogProgress, dialogPositions)";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart4" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 54;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (Z";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Zonas, Campos adicionais)"))));
 BA.debugLineNum = 55;BA.debugLine="DownloadStart5(dialogProgress, dialogPositions)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart5" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 13:
//C
this.state = 20;
 BA.debugLineNum = 57;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (A";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Acções, Tipos, Tabelas auxiliares)"))));
 BA.debugLineNum = 58;BA.debugLine="DownloadStart6(dialogProgress, dialogPositions)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart6" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 15:
//C
this.state = 20;
 BA.debugLineNum = 60;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (O";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Objectos)"))));
 BA.debugLineNum = 61;BA.debugLine="DownloadStart7(dialogProgress, dialogPositions)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart7" /*void*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 63;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (I";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Intervenções)"))));
 BA.debugLineNum = 64;BA.debugLine="DownloadStart8(dialogProgress, dialogPositions)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart8" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 66;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (I";
Debug.ShouldStop(2);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" (Intervenções - Imagens)"))));
 BA.debugLineNum = 67;BA.debugLine="DownloadStart9(dialogProgress, dialogPositions)";
Debug.ShouldStop(4);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadstart9" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 71;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadalltables"), _sf);
this.state = 42;
return;
case 42:
//C
this.state = 21;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 72;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 21:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 73;BA.debugLine="If (tcnt = 1) Then";
Debug.ShouldStop(256);
if (true) break;

case 24:
//if
this.state = 39;
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 1)))) { 
this.state = 26;
}else 
{ BA.debugLineNum = 75;BA.debugLine="else if (tcnt = 2) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 2)))) { 
this.state = 28;
}else 
{ BA.debugLineNum = 77;BA.debugLine="else if (tcnt = 3) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 3)))) { 
this.state = 30;
}else 
{ BA.debugLineNum = 79;BA.debugLine="else if (tcnt = 4) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 4)))) { 
this.state = 32;
}else 
{ BA.debugLineNum = 81;BA.debugLine="else if (tcnt = 5) Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 5)))) { 
this.state = 34;
}else 
{ BA.debugLineNum = 83;BA.debugLine="else if (tcnt = 6) Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 6)))) { 
this.state = 36;
}else 
{ BA.debugLineNum = 85;BA.debugLine="else if (tcnt = 7) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",_tcnt,BA.numberCast(double.class, 7)))) { 
this.state = 38;
}}}}}}}
if (true) break;

case 26:
//C
this.state = 39;
 BA.debugLineNum = 74;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 2, 8)";
Debug.ShouldStop(512);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activname),(Object)((RemoteObject.createImmutable("DownLoadReturn"))),(Object)(RemoteObject.createImmutable((2))),(Object)(RemoteObject.createImmutable((8))));
 if (true) break;

case 28:
//C
this.state = 39;
 BA.debugLineNum = 76;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 3, 16)";
Debug.ShouldStop(2048);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activname),(Object)((RemoteObject.createImmutable("DownLoadReturn"))),(Object)(RemoteObject.createImmutable((3))),(Object)(RemoteObject.createImmutable((16))));
 if (true) break;

case 30:
//C
this.state = 39;
 BA.debugLineNum = 78;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 4, 14)";
Debug.ShouldStop(8192);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activname),(Object)((RemoteObject.createImmutable("DownLoadReturn"))),(Object)(RemoteObject.createImmutable((4))),(Object)(RemoteObject.createImmutable((14))));
 if (true) break;

case 32:
//C
this.state = 39;
 BA.debugLineNum = 80;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 5, 8)";
Debug.ShouldStop(32768);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activname),(Object)((RemoteObject.createImmutable("DownLoadReturn"))),(Object)(RemoteObject.createImmutable((5))),(Object)(RemoteObject.createImmutable((8))));
 if (true) break;

case 34:
//C
this.state = 39;
 BA.debugLineNum = 82;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 6, 49)";
Debug.ShouldStop(131072);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activname),(Object)((RemoteObject.createImmutable("DownLoadReturn"))),(Object)(RemoteObject.createImmutable((6))),(Object)(RemoteObject.createImmutable((49))));
 if (true) break;

case 36:
//C
this.state = 39;
 BA.debugLineNum = 84;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 7, 5)";
Debug.ShouldStop(524288);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activname),(Object)((RemoteObject.createImmutable("DownLoadReturn"))),(Object)(RemoteObject.createImmutable((7))),(Object)(RemoteObject.createImmutable((5))));
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 90;BA.debugLine="CallSub(activName, $\"DownLoadReturn2\"$)";
Debug.ShouldStop(33554432);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activname),(Object)((RemoteObject.createImmutable("DownLoadReturn2"))));
 if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = -1;
;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
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
public static void  _dialog_ready(RemoteObject __ref,RemoteObject _dialogpanel) throws Exception{
}
public static void  _dialog_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static void  _downloadalltables3(RemoteObject __ref,RemoteObject _activname,RemoteObject _title,RemoteObject _textinfo) throws Exception{
try {
		Debug.PushSubsStack("DownloadAllTables3 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("downloadalltables3")) { __ref.runUserSub(false, "appfirstinstalldialog","downloadalltables3", __ref, _activname, _title, _textinfo); return;}
ResumableSub_DownloadAllTables3 rsub = new ResumableSub_DownloadAllTables3(null,__ref,_activname,_title,_textinfo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadAllTables3 extends BA.ResumableSub {
public ResumableSub_DownloadAllTables3(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _activname,RemoteObject _title,RemoteObject _textinfo) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._title = _title;
this._textinfo = _textinfo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _textinfo;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadAllTables3 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,96);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("textInfo", _textinfo);
 BA.debugLineNum = 97;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(1);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 98;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
Debug.ShouldStop(2);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 99;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhiteSilver";
Debug.ShouldStop(4);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhitesilverlight /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 100;BA.debugLine="ApplDialog.SetSize(80%x, 200dip)";
Debug.ShouldStop(8);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 101;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(16);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 102;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadalltables3"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 103;BA.debugLine="DialogPanel.LoadLayout(\"dialog_downloadprogress\")";
Debug.ShouldStop(64);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_downloadprogress")),__ref.getField(false, "ba"));
 BA.debugLineNum = 104;BA.debugLine="dialogMainText.Text = textInfo";
Debug.ShouldStop(128);
__ref.getField(false,"_dialogmaintext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_textinfo));
 BA.debugLineNum = 105;BA.debugLine="dialogProgress.Progress = 0";
Debug.ShouldStop(256);
__ref.getField(false,"_dialogprogress" /*RemoteObject*/ ).runMethod(true,"setProgress",BA.numberCast(int.class, 0));
 BA.debugLineNum = 106;BA.debugLine="DownloadFilesWithFTP(dialogProgress, dialogPositi";
Debug.ShouldStop(512);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadfileswithftp" /*void*/ ,(Object)(__ref.getField(false,"_dialogprogress" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogpositions" /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadalltables3"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 108;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 109;BA.debugLine="CallSub(activName, \"DownLoadReturn3\")";
Debug.ShouldStop(4096);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activname),(Object)(RemoteObject.createImmutable("DownLoadReturn3")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static void  _downloadfileswithftp(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,578);
if (RapidSub.canDelegate("downloadfileswithftp")) { __ref.runUserSub(false, "appfirstinstalldialog","downloadfileswithftp", __ref, _progress, _dlg); return;}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,__ref,_progress,_dlg);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) {
this.parent = parent;
this.__ref = __ref;
this._progress = _progress;
this._dlg = _dlg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _progress;
RemoteObject _dlg;
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _fname = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
int step13;
int limit13;
int step28;
int limit28;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,578);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 580;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","682444290",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 581;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APPL_HOST}/${Share";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","682444291",(RemoteObject.concat(RemoteObject.createImmutable(" 		INITIAL : "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 582;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","682444292",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 583;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(64);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 584;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(128);
_myftp.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 585;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(256);
_myftp.runMethod(true,"setPassiveMode",parent.__c.getField(true,"True"));
 BA.debugLineNum = 589;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(4096);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 590;BA.debugLine="Dim sfl As Object = myFTP.List(\"/\" & ShareCode.AP";
Debug.ShouldStop(8192);
_sfl = _myftp.runMethod(false,"List",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 594;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadfileswithftp"), _sfl);
this.state = 36;
return;
case 36:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(4));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 595;BA.debugLine="If Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 18;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 599;BA.debugLine="If (Files.Length >= 1) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//if
this.state = 15;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 600;BA.debugLine="FTPFileList.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ftpfilelist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 601;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//for
this.state = 14;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 14;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 9;
if (true) break;

case 38:
//C
this.state = 37;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 602;BA.debugLine="Dim fName As String = Files(i).Name";
Debug.ShouldStop(33554432);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 603;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
Debug.ShouldStop(67108864);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".html")))))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 604;BA.debugLine="FTPFileList.Add(Files(i).Name)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ftpfilelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;

case 13:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("i", _i);
;
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 609;BA.debugLine="Log(\"error getting files list\")";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","682444319",RemoteObject.createImmutable("error getting files list"),0);
 BA.debugLineNum = 610;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(2);
__ref.setField ("_current_counter" /*RemoteObject*/ ,__ref.getField(true,"_end_counter" /*RemoteObject*/ ));
 BA.debugLineNum = 611;BA.debugLine="AddCounters(progress, dlg)";
Debug.ShouldStop(4);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_addcounters" /*RemoteObject*/ ,(Object)(_progress),(Object)(_dlg));
 if (true) break;
;
 BA.debugLineNum = 614;BA.debugLine="If (FTPFileList.IsInitialized) Then";
Debug.ShouldStop(32);

case 18:
//if
this.state = 35;
if ((__ref.getField(false,"_ftpfilelist" /*RemoteObject*/ ).runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 615;BA.debugLine="If (FTPFileList.Size>=1) Then";
Debug.ShouldStop(64);
if (true) break;

case 21:
//if
this.state = 34;
if ((RemoteObject.solveBoolean("g",__ref.getField(false,"_ftpfilelist" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 616;BA.debugLine="END_COUNTER = FTPFileList.Size-1";
Debug.ShouldStop(128);
__ref.setField ("_end_counter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ftpfilelist" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 617;BA.debugLine="For i=0 To FTPFileList.Size-1";
Debug.ShouldStop(256);
if (true) break;

case 24:
//for
this.state = 33;
step28 = 1;
limit28 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ftpfilelist" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 33;
if ((step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28)) this.state = 26;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step28)) ;
Debug.locals.put("i", _i);
if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 618;BA.debugLine="Dim fName As String = FTPFileList.Get(i)";
Debug.ShouldStop(512);
_fname = BA.ObjectToString(__ref.getField(false,"_ftpfilelist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 620;BA.debugLine="Log(fName)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","682444330",_fname,0);
 BA.debugLineNum = 621;BA.debugLine="Dim sf As Object = Starter.GlobalFTP.DownloadF";
Debug.ShouldStop(4096);
_sf = parent._starter._globalftp /*RemoteObject*/ .runMethod(false,"DownloadFile",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.__c.getField(true,"False")),(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 622;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadfileswithftp"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 27;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 624;BA.debugLine="If Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 27:
//if
this.state = 32;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 625;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","682444335",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 628;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","682444338",RemoteObject.createImmutable("Error downloading file"),0);
 if (true) break;

case 32:
//C
this.state = 40;
;
 BA.debugLineNum = 631;BA.debugLine="AddCounters(progress, dlg)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_addcounters" /*RemoteObject*/ ,(Object)(_progress),(Object)(_dlg));
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
Debug.locals.put("i", _i);
;
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 637;BA.debugLine="myFTP.Close";
Debug.ShouldStop(268435456);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 638;BA.debugLine="End Sub";
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
public static void  _ftp_listcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) throws Exception{
}
public static void  _ftp_downloadcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _downloadstart1(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart1 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("downloadstart1")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadstart1", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 115;BA.debugLine="Sub DownloadStart1(progress As ProgressBar, dlg As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(524288);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681068033",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 117;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(1048576);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681068034",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appfirstinstalldialog._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 118;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(2097152);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681068035",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 120;BA.debugLine="DownloadTable(\"TIPOOBJECTOS\", progress, dlg)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("TIPOOBJECTOS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadstart2(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart2 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("downloadstart2")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadstart2", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 123;BA.debugLine="Sub DownloadStart2(progress As ProgressBar, dlg As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(268435456);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681133570",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 126;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(536870912);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681133571",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appfirstinstalldialog._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 127;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(1073741824);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681133572",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 128;BA.debugLine="DownloadTable(\"DOCUMENTS\", progress, dlg)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("DOCUMENTS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 129;BA.debugLine="DownloadTable(\"EQUIPMENTS\", progress, dlg)";
Debug.ShouldStop(1);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("EQUIPMENTS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 131;BA.debugLine="DownloadTableAsync(\"dta_locations\",progress, dlg)";
Debug.ShouldStop(4);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableasync" /*void*/ ,(Object)(BA.ObjectToString("dta_locations")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 132;BA.debugLine="DownloadTable(\"CONTACTS\", progress, dlg)";
Debug.ShouldStop(8);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("CONTACTS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadstart3(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart3 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("downloadstart3")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadstart3", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 136;BA.debugLine="Sub DownloadStart3(progress As ProgressBar, dlg As";
Debug.ShouldStop(128);
 BA.debugLineNum = 138;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(512);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681199106",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 139;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(1024);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681199107",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appfirstinstalldialog._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 140;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(2048);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681199108",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 141;BA.debugLine="DownloadTable(\"CONTRACTS\", progress, dlg)";
Debug.ShouldStop(4096);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("CONTRACTS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 142;BA.debugLine="DownloadTable(\"DEPARTMENTS\", progress, dlg)";
Debug.ShouldStop(8192);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("DEPARTMENTS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 143;BA.debugLine="DownloadTable(\"TEAMS\", progress, dlg)";
Debug.ShouldStop(16384);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("TEAMS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 144;BA.debugLine="DownloadTable(\"TYPEREQUESTS\", progress, dlg)";
Debug.ShouldStop(32768);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("TYPEREQUESTS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadstart4(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart4 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("downloadstart4")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadstart4", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 147;BA.debugLine="Sub DownloadStart4(progress As ProgressBar, dlg As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(524288);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681264641",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 149;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(1048576);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681264642",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appfirstinstalldialog._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 150;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(2097152);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681264643",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 151;BA.debugLine="DownloadTable(\"ARTICLES\", progress, dlg)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("ARTICLES")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 152;BA.debugLine="DownloadTable(\"WAREHOUSES\", progress, dlg)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("WAREHOUSES")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 153;BA.debugLine="DownloadTable(\"CHECKLISTS\", progress, dlg)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("CHECKLISTS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadstart5(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart5 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("downloadstart5")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadstart5", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 156;BA.debugLine="Sub DownloadStart5(progress As ProgressBar, dlg As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(268435456);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681330177",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 158;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(536870912);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681330178",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appfirstinstalldialog._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 159;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(1073741824);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681330179",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 160;BA.debugLine="DownloadTable(\"COMPANY\", progress, dlg)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("COMPANY")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 161;BA.debugLine="DownloadTable(\"REPORTS\", progress, dlg)";
Debug.ShouldStop(1);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("REPORTS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 162;BA.debugLine="DownloadTable(\"ZONES\", progress, dlg)";
Debug.ShouldStop(2);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("ZONES")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 163;BA.debugLine="DownloadTable(\"FIELDS\", progress, dlg)";
Debug.ShouldStop(4);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("FIELDS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadstart6(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart6 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("downloadstart6")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadstart6", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 172;BA.debugLine="Sub DownloadStart6(progress As ProgressBar, dlg As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(4096);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681395713",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 174;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(8192);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681395714",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appfirstinstalldialog._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 175;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(16384);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681395715",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 176;BA.debugLine="DownloadTable(\"TYPES\", progress, dlg)";
Debug.ShouldStop(32768);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("TYPES")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 177;BA.debugLine="DownloadTable(\"ACTIONS\", progress, dlg)";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("ACTIONS")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadstart7(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart7 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("downloadstart7")) { __ref.runUserSub(false, "appfirstinstalldialog","downloadstart7", __ref, _progress, _dlg); return;}
ResumableSub_DownloadStart7 rsub = new ResumableSub_DownloadStart7(null,__ref,_progress,_dlg);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadStart7 extends BA.ResumableSub {
public ResumableSub_DownloadStart7(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) {
this.parent = parent;
this.__ref = __ref;
this._progress = _progress;
this._dlg = _dlg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _progress;
RemoteObject _dlg;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart7 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,180);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 181;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","681461249",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 182;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","681461250",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 183;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","681461251",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 185;BA.debugLine="DownloadTableAsync(\"dta_objects\",progress, dlg)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableasync" /*void*/ ,(Object)(BA.ObjectToString("dta_objects")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 186;BA.debugLine="Sleep(5000)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadstart7"),BA.numberCast(int.class, 5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 187;BA.debugLine="DownloadTableAsync(\"dta_objects_contacts\",progres";
Debug.ShouldStop(67108864);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableasync" /*void*/ ,(Object)(BA.ObjectToString("dta_objects_contacts")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 188;BA.debugLine="DownloadTableAsync(\"dta_objects_documents\",progre";
Debug.ShouldStop(134217728);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableasync" /*void*/ ,(Object)(BA.ObjectToString("dta_objects_documents")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 189;BA.debugLine="DownloadTableAsync(\"dta_objects_relations\",progre";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableasync" /*void*/ ,(Object)(BA.ObjectToString("dta_objects_relations")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 190;BA.debugLine="DownloadTableAsync(\"dta_objects_images\",progress,";
Debug.ShouldStop(536870912);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableasync" /*void*/ ,(Object)(BA.ObjectToString("dta_objects_images")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 191;BA.debugLine="DownloadTableAsync(\"dta_objects_fields\",progress,";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableasync" /*void*/ ,(Object)(BA.ObjectToString("dta_objects_fields")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _downloadstart8(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart8 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("downloadstart8")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadstart8", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 194;BA.debugLine="Sub DownloadStart8(progress As ProgressBar, dlg As";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(4);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681526785",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 196;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(8);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681526786",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appfirstinstalldialog._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 197;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(16);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681526787",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 198;BA.debugLine="DownloadTable(\"REQUESTS1\", progress, dlg)";
Debug.ShouldStop(32);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("REQUESTS1")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadstart9(RemoteObject __ref,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadStart9 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("downloadstart9")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadstart9", __ref, _progress, _dlg);}
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 201;BA.debugLine="Sub DownloadStart9(progress As ProgressBar, dlg As";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(512);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681592321",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 203;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
Debug.ShouldStop(1024);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681592322",(RemoteObject.concat(RemoteObject.createImmutable(" 		SERVICE-FIRST INSTALL : "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appfirstinstalldialog._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 204;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(2048);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681592323",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 205;BA.debugLine="DownloadTable(\"REQUESTS2\", progress, dlg)";
Debug.ShouldStop(4096);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtable" /*void*/ ,(Object)(BA.ObjectToString("REQUESTS2")),(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadtable(RemoteObject __ref,RemoteObject _tablename,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadTable (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,390);
if (RapidSub.canDelegate("downloadtable")) { __ref.runUserSub(false, "appfirstinstalldialog","downloadtable", __ref, _tablename, _progress, _dlg); return;}
ResumableSub_DownloadTable rsub = new ResumableSub_DownloadTable(null,__ref,_tablename,_progress,_dlg);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadTable extends BA.ResumableSub {
public ResumableSub_DownloadTable(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _tablename,RemoteObject _progress,RemoteObject _dlg) {
this.parent = parent;
this.__ref = __ref;
this._tablename = _tablename;
this._progress = _progress;
this._dlg = _dlg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _tablename;
RemoteObject _progress;
RemoteObject _dlg;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadTable (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,390);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("tablename", _tablename);
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 391;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(64);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/download/table")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 393;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(256);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 394;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(512);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 395;BA.debugLine="Job.PostString(ServerAddress, MakeTableMaps(table";
Debug.ShouldStop(1024);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_maketablemaps" /*RemoteObject*/ ,(Object)(_tablename))));
 BA.debugLineNum = 396;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 398;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadtable"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 399;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 12;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 400;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 401;BA.debugLine="InsertUpdateTable(Job.GetString, progress, dlg)";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_insertupdatetable" /*void*/ ,(Object)(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),(Object)(_progress),(Object)(_dlg));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 403;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","682051085",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 404;BA.debugLine="AddCounters(progress, dlg)";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_addcounters" /*RemoteObject*/ ,(Object)(_progress),(Object)(_dlg));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 407;BA.debugLine="Log(Job.ErrorMessage)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","682051089",_job.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 BA.debugLineNum = 408;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(8388608);
parent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Download")),(Object)(parent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 409;BA.debugLine="AddCounters(progress, dlg)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_addcounters" /*RemoteObject*/ ,(Object)(_progress),(Object)(_dlg));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 411;BA.debugLine="Job.Release";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
}
public static void  _downloadtableasync(RemoteObject __ref,RemoteObject _tablename,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadTableAsync (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("downloadtableasync")) { __ref.runUserSub(false, "appfirstinstalldialog","downloadtableasync", __ref, _tablename, _progress, _dlg); return;}
ResumableSub_DownloadTableAsync rsub = new ResumableSub_DownloadTableAsync(null,__ref,_tablename,_progress,_dlg);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadTableAsync extends BA.ResumableSub {
public ResumableSub_DownloadTableAsync(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _tablename,RemoteObject _progress,RemoteObject _dlg) {
this.parent = parent;
this.__ref = __ref;
this._tablename = _tablename;
this._progress = _progress;
this._dlg = _dlg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _tablename;
RemoteObject _progress;
RemoteObject _dlg;
RemoteObject _recs = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _complete = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadTableAsync (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,209);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("tableName", _tablename);
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 211;BA.debugLine="Dim recs As Int = 0";
Debug.ShouldStop(262144);
_recs = BA.numberCast(int.class, 0);Debug.locals.put("recs", _recs);Debug.locals.put("recs", _recs);
 BA.debugLineNum = 215;BA.debugLine="Wait For(GetTableCount(tableName)) Complete (resu";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadtableasync"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_gettablecount" /*RemoteObject*/ ,(Object)(_tablename)));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 217;BA.debugLine="If(result > -1) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 18;
if ((RemoteObject.solveBoolean(">",_result,BA.numberCast(double.class, -(double) (0 + 1))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 218;BA.debugLine="Do While result > recs";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//do while
this.state = 17;
while (RemoteObject.solveBoolean(">",_result,BA.numberCast(double.class, _recs))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 220;BA.debugLine="DownloadTableBy500(tableName, recs)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableby500" /*RemoteObject*/ ,(Object)(_tablename),(Object)(_recs));
 BA.debugLineNum = 221;BA.debugLine="recs = recs + 500";
Debug.ShouldStop(268435456);
_recs = RemoteObject.solve(new RemoteObject[] {_recs,RemoteObject.createImmutable(500)}, "+",1, 1);Debug.locals.put("recs", _recs);
 BA.debugLineNum = 223;BA.debugLine="If(result > recs) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 7:
//if
this.state = 16;
if ((RemoteObject.solveBoolean(">",_result,BA.numberCast(double.class, _recs)))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 224;BA.debugLine="Wait For  (DownloadTableBy500(tableName, recs)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadtableasync"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_downloadtableby500" /*RemoteObject*/ ,(Object)(_tablename),(Object)(_recs)));
this.state = 20;
return;
case 20:
//C
this.state = 10;
_complete = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Complete", _complete);
;
 BA.debugLineNum = 225;BA.debugLine="If(Complete) Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 15;
if ((_complete).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 226;BA.debugLine="recs = recs + 500";
Debug.ShouldStop(2);
_recs = RemoteObject.solve(new RemoteObject[] {_recs,RemoteObject.createImmutable(500)}, "+",1, 1);Debug.locals.put("recs", _recs);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 228;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 4;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 240;BA.debugLine="AddCounters(progress, dlg)";
Debug.ShouldStop(32768);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_addcounters" /*RemoteObject*/ ,(Object)(_progress),(Object)(_dlg));
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _downloadtableby500(RemoteObject __ref,RemoteObject _tablename,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("DownloadTableBy500 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("downloadtableby500")) { return __ref.runUserSub(false, "appfirstinstalldialog","downloadtableby500", __ref, _tablename, _position);}
ResumableSub_DownloadTableBy500 rsub = new ResumableSub_DownloadTableBy500(null,__ref,_tablename,_position);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadTableBy500 extends BA.ResumableSub {
public ResumableSub_DownloadTableBy500(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _tablename,RemoteObject _position) {
this.parent = parent;
this.__ref = __ref;
this._tablename = _tablename;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _tablename;
RemoteObject _position;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadTableBy500 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,275);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("tablename", _tablename);
Debug.locals.put("position", _position);
 BA.debugLineNum = 277;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(1048576);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/table/getData")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 279;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4194304);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 280;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(8388608);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 281;BA.debugLine="Log(\"GetTableCount \" & MakeTableMapsBy500(tablena";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","681788934",RemoteObject.concat(RemoteObject.createImmutable("GetTableCount "),__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_maketablemapsby500" /*RemoteObject*/ ,(Object)(_tablename),(Object)(_position))),0);
 BA.debugLineNum = 282;BA.debugLine="Job.PostString(ServerAddress,MakeTableMapsBy500(t";
Debug.ShouldStop(33554432);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_maketablemapsby500" /*RemoteObject*/ ,(Object)(_tablename),(Object)(_position))));
 BA.debugLineNum = 283;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 284;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "downloadtableby500"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 285;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 12;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 286;BA.debugLine="Try";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 287;BA.debugLine="InsertUpdateTableNoProgress(tablename, Job.GetS";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_insertupdatetablenoprogress" /*void*/ ,(Object)(_tablename),(Object)(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 290;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","681788943",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 292;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 295;BA.debugLine="Log(\"Erro Dby500: \" & tablename)  ' Job.ErrorMes";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","681788948",RemoteObject.concat(RemoteObject.createImmutable("Erro Dby500: "),_tablename),0);
 BA.debugLineNum = 296;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(128);
parent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Download")),(Object)(parent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 298;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 300;BA.debugLine="Job.Release";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 302;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _getallexistingrecords(RemoteObject __ref,RemoteObject _tablename,RemoteObject _idlists) throws Exception{
try {
		Debug.PushSubsStack("GetAllExistingRecords (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,503);
if (RapidSub.canDelegate("getallexistingrecords")) { return __ref.runUserSub(false, "appfirstinstalldialog","getallexistingrecords", __ref, _tablename, _idlists);}
RemoteObject _retlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _mid = RemoteObject.createImmutable(0);
Debug.locals.put("tablename", _tablename);
Debug.locals.put("idLists", _idlists);
 BA.debugLineNum = 503;BA.debugLine="Sub GetAllExistingRecords(tablename As String, idL";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 504;BA.debugLine="Dim retList As List";
Debug.ShouldStop(8388608);
_retlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("retList", _retlist);
 BA.debugLineNum = 505;BA.debugLine="retList.Initialize";
Debug.ShouldStop(16777216);
_retlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 506;BA.debugLine="If (Utils.NNE(idLists)) Then";
Debug.ShouldStop(33554432);
if ((appfirstinstalldialog._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_idlists))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 507;BA.debugLine="Dim sSQL As String = $\"Select id from ${tablenam";
Debug.ShouldStop(67108864);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("Select id from "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tablename))),RemoteObject.createImmutable(" where id in "),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idlists))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 508;BA.debugLine="Private Row As Int = 0";
Debug.ShouldStop(134217728);
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 509;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(268435456);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 510;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(536870912);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), appfirstinstalldialog._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 511;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 512;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _row.<Integer>get().intValue() <= limit9) || (step9 < 0 && _row.<Integer>get().intValue() >= limit9) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 513;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(1);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 514;BA.debugLine="Dim mID As Int = Record.GetInt(\"id\")";
Debug.ShouldStop(2);
_mid = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 515;BA.debugLine="retList.Add(mID)";
Debug.ShouldStop(4);
_retlist.runVoidMethod ("Add",(Object)((_mid)));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 518;BA.debugLine="Record.Close";
Debug.ShouldStop(32);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 520;BA.debugLine="Return retList";
Debug.ShouldStop(128);
if (true) return _retlist;
 BA.debugLineNum = 521;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistmapsid(RemoteObject __ref,RemoteObject _innerlist) throws Exception{
try {
		Debug.PushSubsStack("GetListMapsID (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,526);
if (RapidSub.canDelegate("getlistmapsid")) { return __ref.runUserSub(false, "appfirstinstalldialog","getlistmapsid", __ref, _innerlist);}
RemoteObject _itemslist = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("innerList", _innerlist);
 BA.debugLineNum = 526;BA.debugLine="Sub GetListMapsID(innerList As List) As String 'Li";
Debug.ShouldStop(8192);
 BA.debugLineNum = 529;BA.debugLine="Dim itemsList As String = \"\"";
Debug.ShouldStop(65536);
_itemslist = BA.ObjectToString("");Debug.locals.put("itemsList", _itemslist);Debug.locals.put("itemsList", _itemslist);
 BA.debugLineNum = 530;BA.debugLine="For Each row As Map In innerList";
Debug.ShouldStop(131072);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = _innerlist;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group2.runMethod(false,"Get",index2));
Debug.locals.put("row", _row);
 BA.debugLineNum = 531;BA.debugLine="Dim ID As Int = row.Get(\"id\")";
Debug.ShouldStop(262144);
_id = BA.numberCast(int.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 532;BA.debugLine="If Utils.NNE(itemsList) Then";
Debug.ShouldStop(524288);
if (appfirstinstalldialog._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_itemslist)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 533;BA.debugLine="itemsList = $\"${itemsList},\"$";
Debug.ShouldStop(1048576);
_itemslist = (RemoteObject.concat(RemoteObject.createImmutable(""),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemslist))),RemoteObject.createImmutable(",")));Debug.locals.put("itemsList", _itemslist);
 };
 BA.debugLineNum = 535;BA.debugLine="itemsList = $\"${itemsList}${ID}\"$";
Debug.ShouldStop(4194304);
_itemslist = (RemoteObject.concat(RemoteObject.createImmutable(""),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemslist))),RemoteObject.createImmutable(""),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")));Debug.locals.put("itemsList", _itemslist);
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 539;BA.debugLine="If Utils.NNE(itemsList) Then";
Debug.ShouldStop(67108864);
if (appfirstinstalldialog._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_itemslist)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 540;BA.debugLine="itemsList = $\"(${itemsList})\"$";
Debug.ShouldStop(134217728);
_itemslist = (RemoteObject.concat(RemoteObject.createImmutable("("),appfirstinstalldialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemslist))),RemoteObject.createImmutable(")")));Debug.locals.put("itemsList", _itemslist);
 };
 BA.debugLineNum = 543;BA.debugLine="Return itemsList 'retList";
Debug.ShouldStop(1073741824);
if (true) return _itemslist;
 BA.debugLineNum = 544;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettablecount(RemoteObject __ref,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("GetTableCount (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("gettablecount")) { return __ref.runUserSub(false, "appfirstinstalldialog","gettablecount", __ref, _tablename);}
ResumableSub_GetTableCount rsub = new ResumableSub_GetTableCount(null,__ref,_tablename);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetTableCount extends BA.ResumableSub {
public ResumableSub_GetTableCount(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _tablename) {
this.parent = parent;
this.__ref = __ref;
this._tablename = _tablename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _tablename;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _count = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetTableCount (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,244);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("tablename", _tablename);
 BA.debugLineNum = 245;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(1048576);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/table/count")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 247;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4194304);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 248;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(8388608);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 249;BA.debugLine="Job.PostString(ServerAddress, MakeTableMaps2(tabl";
Debug.ShouldStop(16777216);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_maketablemaps2" /*RemoteObject*/ ,(Object)(_tablename))));
 BA.debugLineNum = 250;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(33554432);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 252;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "gettablecount"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 253;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 12;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 254;BA.debugLine="Try";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 255;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(1073741824);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 256;BA.debugLine="JSON1.Initialize(Job.GetString())";
Debug.ShouldStop(-2147483648);
_json1.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 257;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(1);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 259;BA.debugLine="Dim count As Int = MapJSON.Get(\"count\")";
Debug.ShouldStop(4);
_count = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count")))));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 261;BA.debugLine="Log(\"Count Final \" &  count)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","681723409",RemoteObject.concat(RemoteObject.createImmutable("Count Final "),_count),0);
 BA.debugLineNum = 262;BA.debugLine="Return count";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_count));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 264;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","681723412",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 268;BA.debugLine="Log(\"Erro Count: \" & tablename)  ' Job.ErrorMess";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","681723416",RemoteObject.concat(RemoteObject.createImmutable("Erro Count: "),_tablename),0);
 BA.debugLineNum = 269;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(4096);
parent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Download")),(Object)(parent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 271;BA.debugLine="Job.Release";
Debug.ShouldStop(16384);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "appfirstinstalldialog","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="CURRENT_COUNTER = 0";
Debug.ShouldStop(4194304);
__ref.setField ("_current_counter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 24;BA.debugLine="END_COUNTER = 0";
Debug.ShouldStop(8388608);
__ref.setField ("_end_counter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 25;BA.debugLine="FILES_IN_FTP = 0";
Debug.ShouldStop(16777216);
__ref.setField ("_files_in_ftp" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _insertupdatetable(RemoteObject __ref,RemoteObject _datares,RemoteObject _progress,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("InsertUpdateTable (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("insertupdatetable")) { __ref.runUserSub(false, "appfirstinstalldialog","insertupdatetable", __ref, _datares, _progress, _dlg); return;}
ResumableSub_InsertUpdateTable rsub = new ResumableSub_InsertUpdateTable(null,__ref,_datares,_progress,_dlg);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InsertUpdateTable extends BA.ResumableSub {
public ResumableSub_InsertUpdateTable(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _datares,RemoteObject _progress,RemoteObject _dlg) {
this.parent = parent;
this.__ref = __ref;
this._datares = _datares;
this._progress = _progress;
this._dlg = _dlg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _datares;
RemoteObject _progress;
RemoteObject _dlg;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coldata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _table = RemoteObject.createImmutable("");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _stridlist = RemoteObject.createImmutable("");
RemoteObject _idlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i1 = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _mapping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group7;
int index7;
int groupLen7;
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertUpdateTable (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,417);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("datares", _datares);
Debug.locals.put("progress", _progress);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 418;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 419;BA.debugLine="parser.Initialize(datares)";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(_datares));
 BA.debugLineNum = 420;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 422;BA.debugLine="Dim status As Int = root.Get(\"status\")";
Debug.ShouldStop(32);
_status = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 423;BA.debugLine="If (status = 1) Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 22;
if ((RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1)))) { 
this.state = 3;
}else {
this.state = 21;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 424;BA.debugLine="Dim data As List = root.Get(\"data\")";
Debug.ShouldStop(128);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 425;BA.debugLine="For Each coldata As Map In data";
Debug.ShouldStop(256);
if (true) break;

case 4:
//for
this.state = 19;
_coldata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group7 = _data;
index7 = 0;
groupLen7 = group7.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coldata", _coldata);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 19;
if (index7 < groupLen7) {
this.state = 6;
_coldata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));}
if (true) break;

case 24:
//C
this.state = 23;
index7++;
Debug.locals.put("coldata", _coldata);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 426;BA.debugLine="Dim table As String = coldata.Get(\"table\")";
Debug.ShouldStop(512);
_table = BA.ObjectToString(_coldata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 427;BA.debugLine="Dim rows As List = coldata.Get(\"rows\")";
Debug.ShouldStop(1024);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rows = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _coldata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rows")))));Debug.locals.put("rows", _rows);
 BA.debugLineNum = 431;BA.debugLine="Dim strIDList As String = GetListMapsID(rows)";
Debug.ShouldStop(16384);
_stridlist = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_getlistmapsid" /*RemoteObject*/ ,(Object)(_rows));Debug.locals.put("strIDList", _stridlist);Debug.locals.put("strIDList", _stridlist);
 BA.debugLineNum = 432;BA.debugLine="Dim IDList As List = GetAllExistingRecords(tabl";
Debug.ShouldStop(32768);
_idlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_idlist = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_getallexistingrecords" /*RemoteObject*/ ,(Object)(_table),(Object)(_stridlist));Debug.locals.put("IDList", _idlist);Debug.locals.put("IDList", _idlist);
 BA.debugLineNum = 434;BA.debugLine="DBUtils.InsertMaps2(Starter.LocalSQLEVC, table,";
Debug.ShouldStop(131072);
parent._dbutils.runVoidMethod ("_insertmaps2" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._starter._localsqlevc /*RemoteObject*/ ),(Object)(_table),(Object)(_rows),(Object)(_idlist));
 BA.debugLineNum = 435;BA.debugLine="Sleep(100)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "insertupdatetable"),BA.numberCast(int.class, 100));
this.state = 25;
return;
case 25:
//C
this.state = 7;
;
 BA.debugLineNum = 439;BA.debugLine="If (IDList.Size >=1) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 18;
if ((RemoteObject.solveBoolean("g",_idlist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 440;BA.debugLine="For i1 = 0 To rows.Size - 1";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//for
this.state = 17;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_rows.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
Debug.locals.put("i1", _i1);
this.state = 26;
if (true) break;

case 26:
//C
this.state = 17;
if ((step15 > 0 && _i1 <= limit15) || (step15 < 0 && _i1 >= limit15)) this.state = 12;
if (true) break;

case 27:
//C
this.state = 26;
_i1 = ((int)(0 + _i1 + step15)) ;
Debug.locals.put("i1", _i1);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 441;BA.debugLine="Dim m As Map = rows.Get(i1)";
Debug.ShouldStop(16777216);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rows.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 442;BA.debugLine="Dim mID As Int = m.Get(\"id\")";
Debug.ShouldStop(33554432);
_mid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 443;BA.debugLine="If (IDList.IndexOf(mID) >=0) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("g",_idlist.runMethod(true,"IndexOf",(Object)((_mid))),BA.numberCast(double.class, 0)))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 444;BA.debugLine="Dim Mapping As Map";
Debug.ShouldStop(134217728);
_mapping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Mapping", _mapping);
 BA.debugLineNum = 445;BA.debugLine="Mapping.Initialize";
Debug.ShouldStop(268435456);
_mapping.runVoidMethod ("Initialize");
 BA.debugLineNum = 446;BA.debugLine="Mapping.Put(\"id\", mID)";
Debug.ShouldStop(536870912);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_mid)));
 BA.debugLineNum = 448;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLE";
Debug.ShouldStop(-2147483648);
parent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._starter._localsqlevc /*RemoteObject*/ ),(Object)(_table),(Object)(_m),(Object)(_mapping),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 16:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
Debug.locals.put("i1", _i1);
;
 if (true) break;

case 18:
//C
this.state = 24;
;
 BA.debugLineNum = 453;BA.debugLine="AddCounters(progress, dlg)";
Debug.ShouldStop(16);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_addcounters" /*RemoteObject*/ ,(Object)(_progress),(Object)(_dlg));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 22;
Debug.locals.put("coldata", _coldata);
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 456;BA.debugLine="AddCounters(progress, dlg)";
Debug.ShouldStop(128);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_addcounters" /*RemoteObject*/ ,(Object)(_progress),(Object)(_dlg));
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 458;BA.debugLine="End Sub";
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
public static void  _insertupdatetablenoprogress(RemoteObject __ref,RemoteObject _table,RemoteObject _datares) throws Exception{
try {
		Debug.PushSubsStack("InsertUpdateTableNoProgress (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,463);
if (RapidSub.canDelegate("insertupdatetablenoprogress")) { __ref.runUserSub(false, "appfirstinstalldialog","insertupdatetablenoprogress", __ref, _table, _datares); return;}
ResumableSub_InsertUpdateTableNoProgress rsub = new ResumableSub_InsertUpdateTableNoProgress(null,__ref,_table,_datares);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InsertUpdateTableNoProgress extends BA.ResumableSub {
public ResumableSub_InsertUpdateTableNoProgress(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,RemoteObject __ref,RemoteObject _table,RemoteObject _datares) {
this.parent = parent;
this.__ref = __ref;
this._table = _table;
this._datares = _datares;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
RemoteObject _table;
RemoteObject _datares;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _stridlist = RemoteObject.createImmutable("");
RemoteObject _idlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i1 = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _mapping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step12;
int limit12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertUpdateTableNoProgress (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,463);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("table", _table);
Debug.locals.put("datares", _datares);
 BA.debugLineNum = 464;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32768);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 465;BA.debugLine="parser.Initialize(datares)";
Debug.ShouldStop(65536);
_parser.runVoidMethod ("Initialize",(Object)(_datares));
 BA.debugLineNum = 466;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(131072);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 468;BA.debugLine="Dim status As Int = root.Get(\"status\")";
Debug.ShouldStop(524288);
_status = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 469;BA.debugLine="If (status = 1) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 475;BA.debugLine="Dim rows As List = root.Get(\"data\")";
Debug.ShouldStop(67108864);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rows = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("rows", _rows);
 BA.debugLineNum = 478;BA.debugLine="Dim strIDList As String = GetListMapsID(rows)";
Debug.ShouldStop(536870912);
_stridlist = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_getlistmapsid" /*RemoteObject*/ ,(Object)(_rows));Debug.locals.put("strIDList", _stridlist);Debug.locals.put("strIDList", _stridlist);
 BA.debugLineNum = 479;BA.debugLine="Dim IDList As List = GetAllExistingRecords(tabl";
Debug.ShouldStop(1073741824);
_idlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_idlist = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appfirstinstalldialog.class, "_getallexistingrecords" /*RemoteObject*/ ,(Object)(_table),(Object)(_stridlist));Debug.locals.put("IDList", _idlist);Debug.locals.put("IDList", _idlist);
 BA.debugLineNum = 481;BA.debugLine="DBUtils.InsertMaps2(Starter.LocalSQLEVC, table,";
Debug.ShouldStop(1);
parent._dbutils.runVoidMethod ("_insertmaps2" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._starter._localsqlevc /*RemoteObject*/ ),(Object)(_table),(Object)(_rows),(Object)(_idlist));
 BA.debugLineNum = 482;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appfirstinstalldialog", "insertupdatetablenoprogress"),BA.numberCast(int.class, 100));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
 BA.debugLineNum = 486;BA.debugLine="If (IDList.Size >=1) Then";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 15;
if ((RemoteObject.solveBoolean("g",_idlist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 487;BA.debugLine="For i1 = 0 To rows.Size - 1";
Debug.ShouldStop(64);
if (true) break;

case 7:
//for
this.state = 14;
step12 = 1;
limit12 = RemoteObject.solve(new RemoteObject[] {_rows.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
Debug.locals.put("i1", _i1);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 14;
if ((step12 > 0 && _i1 <= limit12) || (step12 < 0 && _i1 >= limit12)) this.state = 9;
if (true) break;

case 19:
//C
this.state = 18;
_i1 = ((int)(0 + _i1 + step12)) ;
Debug.locals.put("i1", _i1);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 488;BA.debugLine="Dim m As Map = rows.Get(i1)";
Debug.ShouldStop(128);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rows.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 489;BA.debugLine="Dim mID As Int = m.Get(\"id\")";
Debug.ShouldStop(256);
_mid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 490;BA.debugLine="If (IDList.IndexOf(mID) >=0) Then";
Debug.ShouldStop(512);
if (true) break;

case 10:
//if
this.state = 13;
if ((RemoteObject.solveBoolean("g",_idlist.runMethod(true,"IndexOf",(Object)((_mid))),BA.numberCast(double.class, 0)))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 491;BA.debugLine="Dim Mapping As Map";
Debug.ShouldStop(1024);
_mapping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Mapping", _mapping);
 BA.debugLineNum = 492;BA.debugLine="Mapping.Initialize";
Debug.ShouldStop(2048);
_mapping.runVoidMethod ("Initialize");
 BA.debugLineNum = 493;BA.debugLine="Mapping.Put(\"id\", mID)";
Debug.ShouldStop(4096);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_mid)));
 BA.debugLineNum = 495;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLEV";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._starter._localsqlevc /*RemoteObject*/ ),(Object)(_table),(Object)(_m),(Object)(_mapping),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 13:
//C
this.state = 19;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("i1", _i1);
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _maketablemaps(RemoteObject __ref,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("MakeTableMaps (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("maketablemaps")) { return __ref.runUserSub(false, "appfirstinstalldialog","maketablemaps", __ref, _tablename);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("tablename", _tablename);
 BA.debugLineNum = 365;BA.debugLine="Sub MakeTableMaps(tablename As String) As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 366;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8192);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 367;BA.debugLine="params.Initialize";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 368;BA.debugLine="params.Clear";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 369;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((appfirstinstalldialog._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 370;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((appfirstinstalldialog._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 371;BA.debugLine="params.Put(\"tablename\", tablename)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tablename"))),(Object)((_tablename)));
 BA.debugLineNum = 372;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((appfirstinstalldialog._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 373;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((appfirstinstalldialog._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 374;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((appfirstinstalldialog._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 375;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((appfirstinstalldialog._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 376;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((appfirstinstalldialog._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 377;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((appfirstinstalldialog._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 378;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((appfirstinstalldialog._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 379;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(67108864);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 380;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(134217728);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 382;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(536870912);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 383;BA.debugLine="Return data";
Debug.ShouldStop(1073741824);
if (true) return _data;
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketablemaps2(RemoteObject __ref,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("MakeTableMaps2 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("maketablemaps2")) { return __ref.runUserSub(false, "appfirstinstalldialog","maketablemaps2", __ref, _tablename);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("tablename", _tablename);
 BA.debugLineNum = 334;BA.debugLine="Sub MakeTableMaps2(tablename As String) As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16384);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 336;BA.debugLine="params.Initialize";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 337;BA.debugLine="params.Clear";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 338;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((appfirstinstalldialog._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 339;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((appfirstinstalldialog._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 340;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((appfirstinstalldialog._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 341;BA.debugLine="params.Put(\"_team\", ShareCode.SESS_User)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_team"))),(Object)((appfirstinstalldialog._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 342;BA.debugLine="params.Put(\"table\", tablename)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("table"))),(Object)((_tablename)));
 BA.debugLineNum = 344;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((appfirstinstalldialog._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 345;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((appfirstinstalldialog._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 346;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((appfirstinstalldialog._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 347;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((appfirstinstalldialog._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 348;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((appfirstinstalldialog._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 349;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((appfirstinstalldialog._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 350;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((appfirstinstalldialog._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 351;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(1073741824);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 352;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(-2147483648);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 354;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(2);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 355;BA.debugLine="Log(\"MakeTableMaps2\" & data)";
Debug.ShouldStop(4);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681920021",RemoteObject.concat(RemoteObject.createImmutable("MakeTableMaps2"),_data),0);
 BA.debugLineNum = 356;BA.debugLine="Return data";
Debug.ShouldStop(8);
if (true) return _data;
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketablemapsby500(RemoteObject __ref,RemoteObject _tablename,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("MakeTableMapsBy500 (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("maketablemapsby500")) { return __ref.runUserSub(false, "appfirstinstalldialog","maketablemapsby500", __ref, _tablename, _position);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("tablename", _tablename);
Debug.locals.put("position", _position);
 BA.debugLineNum = 307;BA.debugLine="Sub MakeTableMapsBy500(tablename As String, positi";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="Dim params As Map";
Debug.ShouldStop(524288);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 309;BA.debugLine="params.Initialize";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 310;BA.debugLine="params.Clear";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 311;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((appfirstinstalldialog._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 312;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((appfirstinstalldialog._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 313;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((appfirstinstalldialog._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 314;BA.debugLine="params.Put(\"_team\", ShareCode.SESS_User)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_team"))),(Object)((appfirstinstalldialog._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 315;BA.debugLine="params.Put(\"table\", tablename)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("table"))),(Object)((_tablename)));
 BA.debugLineNum = 316;BA.debugLine="params.Put(\"position\", position)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)((_position)));
 BA.debugLineNum = 317;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((appfirstinstalldialog._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 318;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((appfirstinstalldialog._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 319;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((appfirstinstalldialog._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 320;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((appfirstinstalldialog._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 321;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((appfirstinstalldialog._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 322;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((appfirstinstalldialog._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 323;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((appfirstinstalldialog._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 324;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(8);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 325;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(16);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 327;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(64);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 328;BA.debugLine="Log(\"MakeTableMaps2\" & data)";
Debug.ShouldStop(128);
appfirstinstalldialog.__c.runVoidMethod ("LogImpl","681854485",RemoteObject.concat(RemoteObject.createImmutable("MakeTableMaps2"),_data),0);
 BA.debugLineNum = 329;BA.debugLine="Return data";
Debug.ShouldStop(256);
if (true) return _data;
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timecheck_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TimeCheck_Tick (appfirstinstalldialog) ","appfirstinstalldialog",16,__ref.getField(false, "ba"),__ref,662);
if (RapidSub.canDelegate("timecheck_tick")) { return __ref.runUserSub(false, "appfirstinstalldialog","timecheck_tick", __ref);}
 BA.debugLineNum = 662;BA.debugLine="Sub TimeCheck_Tick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 664;BA.debugLine="thisTimerCounter = thisTimerCounter + 1";
Debug.ShouldStop(8388608);
__ref.setField ("_thistimercounter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_thistimercounter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 665;BA.debugLine="If thisTimerCounter = 5 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_thistimercounter" /*RemoteObject*/ ),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 666;BA.debugLine="thisTimer.Enabled = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_thistimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",appfirstinstalldialog.__c.getField(true,"False"));
 BA.debugLineNum = 667;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(67108864);
__ref.setField ("_current_counter" /*RemoteObject*/ ,__ref.getField(true,"_end_counter" /*RemoteObject*/ ));
 BA.debugLineNum = 668;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(appfirstinstalldialog.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 };
 BA.debugLineNum = 670;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}