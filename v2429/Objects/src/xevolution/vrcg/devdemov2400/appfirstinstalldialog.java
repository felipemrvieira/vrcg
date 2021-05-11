package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appfirstinstalldialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.appfirstinstalldialog");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.appfirstinstalldialog.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.Timer _thistimer = null;
public int _thistimercounter = 0;
public Object _currentactivityobject = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _appldialog = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogquantityvalue = null;
public int _returnquantityvalue = 0;
public anywheresoftware.b4a.objects.ActivityWrapper _thisactivity = null;
public Object _thisactivityname = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _currentcld = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _dialogprogress = null;
public anywheresoftware.b4a.objects.LabelWrapper _dialogmaintext = null;
public int _current_counter = 0;
public int _end_counter = 0;
public int _files_in_ftp = 0;
public anywheresoftware.b4a.objects.collections.List _ftpfilelist = null;
public anywheresoftware.b4a.objects.LabelWrapper _dialogpositions = null;
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
public String  _addcounters(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "addcounters", false))
	 {return ((String) Debug.delegate(ba, "addcounters", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=82509824;
 //BA.debugLineNum = 82509824;BA.debugLine="Sub AddCounters(progress As ProgressBar, dlg As La";
RDebugUtils.currentLine=82509825;
 //BA.debugLineNum = 82509825;BA.debugLine="progress.Progress = progress.Progress + 1";
_progress.setProgress((int) (_progress.getProgress()+1));
RDebugUtils.currentLine=82509826;
 //BA.debugLineNum = 82509826;BA.debugLine="If progress.Progress = 100 Then";
if (_progress.getProgress()==100) { 
RDebugUtils.currentLine=82509827;
 //BA.debugLineNum = 82509827;BA.debugLine="progress.Progress = 0";
_progress.setProgress((int) (0));
 };
RDebugUtils.currentLine=82509830;
 //BA.debugLineNum = 82509830;BA.debugLine="dlg.Text = $\"${CURRENT_COUNTER}/${END_COUNTER}\"$";
_dlg.setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(__ref._current_counter /*int*/ ))+"/"+__c.SmartStringFormatter("",(Object)(__ref._end_counter /*int*/ ))+"")));
RDebugUtils.currentLine=82509831;
 //BA.debugLineNum = 82509831;BA.debugLine="Log($\"Counter: ${CURRENT_COUNTER} of ${END_COUNTE";
__c.LogImpl("682509831",("Counter: "+__c.SmartStringFormatter("",(Object)(__ref._current_counter /*int*/ ))+" of "+__c.SmartStringFormatter("",(Object)(__ref._end_counter /*int*/ ))+""),0);
RDebugUtils.currentLine=82509832;
 //BA.debugLineNum = 82509832;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER + 1";
__ref._current_counter /*int*/  = (int) (__ref._current_counter /*int*/ +1);
RDebugUtils.currentLine=82509834;
 //BA.debugLineNum = 82509834;BA.debugLine="If (CURRENT_COUNTER > END_COUNTER) Then";
if ((__ref._current_counter /*int*/ >__ref._end_counter /*int*/ )) { 
RDebugUtils.currentLine=82509835;
 //BA.debugLineNum = 82509835;BA.debugLine="If (thisTimer.IsInitialized) Then";
if ((__ref._thistimer /*anywheresoftware.b4a.objects.Timer*/ .IsInitialized())) { 
RDebugUtils.currentLine=82509836;
 //BA.debugLineNum = 82509836;BA.debugLine="thisTimer.Enabled = False";
__ref._thistimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=82509838;
 //BA.debugLineNum = 82509838;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
 };
RDebugUtils.currentLine=82509844;
 //BA.debugLineNum = 82509844;BA.debugLine="End Sub";
return "";
}
public String  _checkfilesinftp(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "checkfilesinftp", false))
	 {return ((String) Debug.delegate(ba, "checkfilesinftp", null));}
RDebugUtils.currentLine=82378752;
 //BA.debugLineNum = 82378752;BA.debugLine="Sub CheckFilesInFTP";
RDebugUtils.currentLine=82378782;
 //BA.debugLineNum = 82378782;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
RDebugUtils.currentLine=80805888;
 //BA.debugLineNum = 80805888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=80805889;
 //BA.debugLineNum = 80805889;BA.debugLine="Private thisTimer As Timer";
_thistimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=80805890;
 //BA.debugLineNum = 80805890;BA.debugLine="Private thisTimerCounter As Int = 0";
_thistimercounter = (int) (0);
RDebugUtils.currentLine=80805891;
 //BA.debugLineNum = 80805891;BA.debugLine="Private CurrentActivityObject As Object";
_currentactivityobject = new Object();
RDebugUtils.currentLine=80805893;
 //BA.debugLineNum = 80805893;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
_appldialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=80805894;
 //BA.debugLineNum = 80805894;BA.debugLine="Private DialogQuantityValue As FloatLabeledEditTe";
_dialogquantityvalue = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=80805895;
 //BA.debugLineNum = 80805895;BA.debugLine="Private ReturnQuantityValue As Int = 0";
_returnquantityvalue = (int) (0);
RDebugUtils.currentLine=80805896;
 //BA.debugLineNum = 80805896;BA.debugLine="Private ThisActivity As Activity";
_thisactivity = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=80805897;
 //BA.debugLineNum = 80805897;BA.debugLine="Private ThisActivityName As Object";
_thisactivityname = new Object();
RDebugUtils.currentLine=80805899;
 //BA.debugLineNum = 80805899;BA.debugLine="Private CurrentCLD As CustomLayoutDialog";
_currentcld = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=80805900;
 //BA.debugLineNum = 80805900;BA.debugLine="Private dialogProgress As ProgressBar";
_dialogprogress = new anywheresoftware.b4a.objects.ProgressBarWrapper();
RDebugUtils.currentLine=80805901;
 //BA.debugLineNum = 80805901;BA.debugLine="Private dialogMainText As Label";
_dialogmaintext = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=80805902;
 //BA.debugLineNum = 80805902;BA.debugLine="Private CURRENT_COUNTER As Int = 0";
_current_counter = (int) (0);
RDebugUtils.currentLine=80805903;
 //BA.debugLineNum = 80805903;BA.debugLine="Private END_COUNTER As Int = 0";
_end_counter = (int) (0);
RDebugUtils.currentLine=80805904;
 //BA.debugLineNum = 80805904;BA.debugLine="Private FILES_IN_FTP As Int = 0";
_files_in_ftp = (int) (0);
RDebugUtils.currentLine=80805905;
 //BA.debugLineNum = 80805905;BA.debugLine="Private FTPFileList As List";
_ftpfilelist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80805906;
 //BA.debugLineNum = 80805906;BA.debugLine="Private dialogPositions As Label";
_dialogpositions = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=80805907;
 //BA.debugLineNum = 80805907;BA.debugLine="End Sub";
return "";
}
public void  _downloadalltables(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,Object _activname,String _title,String _textinfo,int _cnt,int _tcnt) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadalltables", false))
	 {Debug.delegate(ba, "downloadalltables", new Object[] {_activname,_title,_textinfo,_cnt,_tcnt}); return;}
ResumableSub_DownloadAllTables rsub = new ResumableSub_DownloadAllTables(this,__ref,_activname,_title,_textinfo,_cnt,_tcnt);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadAllTables extends BA.ResumableSub {
public ResumableSub_DownloadAllTables(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,Object _activname,String _title,String _textinfo,int _cnt,int _tcnt) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._title = _title;
this._textinfo = _textinfo;
this._cnt = _cnt;
this._tcnt = _tcnt;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
Object _activname;
String _title;
String _textinfo;
int _cnt;
int _tcnt;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=80936961;
 //BA.debugLineNum = 80936961;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=80936962;
 //BA.debugLineNum = 80936962;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=80936963;
 //BA.debugLineNum = 80936963;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhiteSilver";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhitesilverlight /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=80936964;
 //BA.debugLineNum = 80936964;BA.debugLine="ApplDialog.SetSize(80%x, 200dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (80),ba),parent.__c.DipToCurrent((int) (200)));
RDebugUtils.currentLine=80936965;
 //BA.debugLineNum = 80936965;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=80936966;
 //BA.debugLineNum = 80936966;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadalltables"), null);
this.state = 41;
return;
case 41:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=80936967;
 //BA.debugLineNum = 80936967;BA.debugLine="DialogPanel.LoadLayout(\"dialog_downloadprogress\")";
_dialogpanel.LoadLayout("dialog_downloadprogress",ba);
RDebugUtils.currentLine=80936968;
 //BA.debugLineNum = 80936968;BA.debugLine="dialogProgress.Progress = 0";
__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ .setProgress((int) (0));
RDebugUtils.currentLine=80936969;
 //BA.debugLineNum = 80936969;BA.debugLine="END_COUNTER = END_COUNTER + cnt";
__ref._end_counter /*int*/  = (int) (__ref._end_counter /*int*/ +_cnt);
RDebugUtils.currentLine=80936970;
 //BA.debugLineNum = 80936970;BA.debugLine="dialogMainText.Text = textInfo";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_textinfo));
RDebugUtils.currentLine=80936971;
 //BA.debugLineNum = 80936971;BA.debugLine="If (tcnt = 1) Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((_tcnt==1)) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=80936974;
 //BA.debugLineNum = 80936974;BA.debugLine="else if (tcnt = 2) Then";
if ((_tcnt==2)) { 
this.state = 5;
}else 
{RDebugUtils.currentLine=80936977;
 //BA.debugLineNum = 80936977;BA.debugLine="else if (tcnt = 3) Then";
if ((_tcnt==3)) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=80936980;
 //BA.debugLineNum = 80936980;BA.debugLine="else if (tcnt = 4) Then";
if ((_tcnt==4)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=80936983;
 //BA.debugLineNum = 80936983;BA.debugLine="else if (tcnt = 5) Then";
if ((_tcnt==5)) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=80936986;
 //BA.debugLineNum = 80936986;BA.debugLine="else if (tcnt = 6) Then";
if ((_tcnt==6)) { 
this.state = 13;
}else 
{RDebugUtils.currentLine=80936989;
 //BA.debugLineNum = 80936989;BA.debugLine="else if (tcnt = 7) Then";
if ((_tcnt==7)) { 
this.state = 15;
}else 
{RDebugUtils.currentLine=80936992;
 //BA.debugLineNum = 80936992;BA.debugLine="else if (tcnt = 8) Then";
if ((_tcnt==8)) { 
this.state = 17;
}else 
{RDebugUtils.currentLine=80936995;
 //BA.debugLineNum = 80936995;BA.debugLine="else if (tcnt = 9) Then";
if ((_tcnt==9)) { 
this.state = 19;
}}}}}}}}}
if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=80936972;
 //BA.debugLineNum = 80936972;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (P";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Pedidos, Tipos Objectos)"));
RDebugUtils.currentLine=80936973;
 //BA.debugLineNum = 80936973;BA.debugLine="DownloadStart1(dialogProgress, dialogPositions)";
__ref._downloadstart1 /*String*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 5:
//C
this.state = 20;
RDebugUtils.currentLine=80936975;
 //BA.debugLineNum = 80936975;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (D";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Documentos, Equipamentos, Contactos, Moradas)"));
RDebugUtils.currentLine=80936976;
 //BA.debugLineNum = 80936976;BA.debugLine="DownloadStart2(dialogProgress, dialogPositions)";
__ref._downloadstart2 /*String*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 7:
//C
this.state = 20;
RDebugUtils.currentLine=80936978;
 //BA.debugLineNum = 80936978;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (C";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Contractos, Departamentos, Equipas)"));
RDebugUtils.currentLine=80936979;
 //BA.debugLineNum = 80936979;BA.debugLine="DownloadStart3(dialogProgress, dialogPositions)";
__ref._downloadstart3 /*String*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 9:
//C
this.state = 20;
RDebugUtils.currentLine=80936981;
 //BA.debugLineNum = 80936981;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (A";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Artigos, Armazéns, Listas de verificação)"));
RDebugUtils.currentLine=80936982;
 //BA.debugLineNum = 80936982;BA.debugLine="DownloadStart4(dialogProgress, dialogPositions)";
__ref._downloadstart4 /*String*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 11:
//C
this.state = 20;
RDebugUtils.currentLine=80936984;
 //BA.debugLineNum = 80936984;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (Z";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Zonas, Campos adicionais)"));
RDebugUtils.currentLine=80936985;
 //BA.debugLineNum = 80936985;BA.debugLine="DownloadStart5(dialogProgress, dialogPositions)";
__ref._downloadstart5 /*String*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 13:
//C
this.state = 20;
RDebugUtils.currentLine=80936987;
 //BA.debugLineNum = 80936987;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (A";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Acções, Tipos, Tabelas auxiliares)"));
RDebugUtils.currentLine=80936988;
 //BA.debugLineNum = 80936988;BA.debugLine="DownloadStart6(dialogProgress, dialogPositions)";
__ref._downloadstart6 /*String*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 15:
//C
this.state = 20;
RDebugUtils.currentLine=80936990;
 //BA.debugLineNum = 80936990;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (O";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Objectos)"));
RDebugUtils.currentLine=80936991;
 //BA.debugLineNum = 80936991;BA.debugLine="DownloadStart7(dialogProgress, dialogPositions)";
__ref._downloadstart7 /*void*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=80936993;
 //BA.debugLineNum = 80936993;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (I";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Intervenções)"));
RDebugUtils.currentLine=80936994;
 //BA.debugLineNum = 80936994;BA.debugLine="DownloadStart8(dialogProgress, dialogPositions)";
__ref._downloadstart8 /*String*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=80936996;
 //BA.debugLineNum = 80936996;BA.debugLine="dialogMainText.Text = dialogMainText.Text & \" (I";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" (Intervenções - Imagens)"));
RDebugUtils.currentLine=80936997;
 //BA.debugLineNum = 80936997;BA.debugLine="DownloadStart9(dialogProgress, dialogPositions)";
__ref._downloadstart9 /*String*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=80937001;
 //BA.debugLineNum = 80937001;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadalltables"), _sf);
this.state = 42;
return;
case 42:
//C
this.state = 21;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=80937002;
 //BA.debugLineNum = 80937002;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 21:
//if
this.state = 40;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=80937003;
 //BA.debugLineNum = 80937003;BA.debugLine="If (tcnt = 1) Then";
if (true) break;

case 24:
//if
this.state = 39;
if ((_tcnt==1)) { 
this.state = 26;
}else 
{RDebugUtils.currentLine=80937005;
 //BA.debugLineNum = 80937005;BA.debugLine="else if (tcnt = 2) Then";
if ((_tcnt==2)) { 
this.state = 28;
}else 
{RDebugUtils.currentLine=80937007;
 //BA.debugLineNum = 80937007;BA.debugLine="else if (tcnt = 3) Then";
if ((_tcnt==3)) { 
this.state = 30;
}else 
{RDebugUtils.currentLine=80937009;
 //BA.debugLineNum = 80937009;BA.debugLine="else if (tcnt = 4) Then";
if ((_tcnt==4)) { 
this.state = 32;
}else 
{RDebugUtils.currentLine=80937011;
 //BA.debugLineNum = 80937011;BA.debugLine="else if (tcnt = 5) Then";
if ((_tcnt==5)) { 
this.state = 34;
}else 
{RDebugUtils.currentLine=80937013;
 //BA.debugLineNum = 80937013;BA.debugLine="else if (tcnt = 6) Then";
if ((_tcnt==6)) { 
this.state = 36;
}else 
{RDebugUtils.currentLine=80937015;
 //BA.debugLineNum = 80937015;BA.debugLine="else if (tcnt = 7) Then";
if ((_tcnt==7)) { 
this.state = 38;
}}}}}}}
if (true) break;

case 26:
//C
this.state = 39;
RDebugUtils.currentLine=80937004;
 //BA.debugLineNum = 80937004;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 2, 8)";
parent.__c.CallSubNew3(ba,_activname,("DownLoadReturn"),(Object)(2),(Object)(8));
 if (true) break;

case 28:
//C
this.state = 39;
RDebugUtils.currentLine=80937006;
 //BA.debugLineNum = 80937006;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 3, 16)";
parent.__c.CallSubNew3(ba,_activname,("DownLoadReturn"),(Object)(3),(Object)(16));
 if (true) break;

case 30:
//C
this.state = 39;
RDebugUtils.currentLine=80937008;
 //BA.debugLineNum = 80937008;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 4, 14)";
parent.__c.CallSubNew3(ba,_activname,("DownLoadReturn"),(Object)(4),(Object)(14));
 if (true) break;

case 32:
//C
this.state = 39;
RDebugUtils.currentLine=80937010;
 //BA.debugLineNum = 80937010;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 5, 8)";
parent.__c.CallSubNew3(ba,_activname,("DownLoadReturn"),(Object)(5),(Object)(8));
 if (true) break;

case 34:
//C
this.state = 39;
RDebugUtils.currentLine=80937012;
 //BA.debugLineNum = 80937012;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 6, 49)";
parent.__c.CallSubNew3(ba,_activname,("DownLoadReturn"),(Object)(6),(Object)(49));
 if (true) break;

case 36:
//C
this.state = 39;
RDebugUtils.currentLine=80937014;
 //BA.debugLineNum = 80937014;BA.debugLine="CallSub3(activName, $\"DownLoadReturn\"$, 7, 5)";
parent.__c.CallSubNew3(ba,_activname,("DownLoadReturn"),(Object)(7),(Object)(5));
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=80937020;
 //BA.debugLineNum = 80937020;BA.debugLine="CallSub(activName, $\"DownLoadReturn2\"$)";
parent.__c.CallSubNew(ba,_activname,("DownLoadReturn2"));
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
RDebugUtils.currentLine=80937024;
 //BA.debugLineNum = 80937024;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _downloadstart1(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart1", false))
	 {return ((String) Debug.delegate(ba, "downloadstart1", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=81068032;
 //BA.debugLineNum = 81068032;BA.debugLine="Sub DownloadStart1(progress As ProgressBar, dlg As";
RDebugUtils.currentLine=81068033;
 //BA.debugLineNum = 81068033;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681068033","************************************************************",0);
RDebugUtils.currentLine=81068034;
 //BA.debugLineNum = 81068034;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
__c.LogImpl("681068034",(" 		SERVICE-FIRST INSTALL : "+__c.SmartStringFormatter("",(Object)(_sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81068035;
 //BA.debugLineNum = 81068035;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681068035","************************************************************",0);
RDebugUtils.currentLine=81068037;
 //BA.debugLineNum = 81068037;BA.debugLine="DownloadTable(\"TIPOOBJECTOS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"TIPOOBJECTOS",_progress,_dlg);
RDebugUtils.currentLine=81068038;
 //BA.debugLineNum = 81068038;BA.debugLine="End Sub";
return "";
}
public String  _downloadstart2(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart2", false))
	 {return ((String) Debug.delegate(ba, "downloadstart2", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=81133568;
 //BA.debugLineNum = 81133568;BA.debugLine="Sub DownloadStart2(progress As ProgressBar, dlg As";
RDebugUtils.currentLine=81133570;
 //BA.debugLineNum = 81133570;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681133570","************************************************************",0);
RDebugUtils.currentLine=81133571;
 //BA.debugLineNum = 81133571;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
__c.LogImpl("681133571",(" 		SERVICE-FIRST INSTALL : "+__c.SmartStringFormatter("",(Object)(_sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81133572;
 //BA.debugLineNum = 81133572;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681133572","************************************************************",0);
RDebugUtils.currentLine=81133573;
 //BA.debugLineNum = 81133573;BA.debugLine="DownloadTable(\"DOCUMENTS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"DOCUMENTS",_progress,_dlg);
RDebugUtils.currentLine=81133574;
 //BA.debugLineNum = 81133574;BA.debugLine="DownloadTable(\"EQUIPMENTS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"EQUIPMENTS",_progress,_dlg);
RDebugUtils.currentLine=81133576;
 //BA.debugLineNum = 81133576;BA.debugLine="DownloadTableAsync(\"dta_locations\",progress, dlg)";
__ref._downloadtableasync /*void*/ (null,"dta_locations",_progress,_dlg);
RDebugUtils.currentLine=81133577;
 //BA.debugLineNum = 81133577;BA.debugLine="DownloadTable(\"CONTACTS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"CONTACTS",_progress,_dlg);
RDebugUtils.currentLine=81133579;
 //BA.debugLineNum = 81133579;BA.debugLine="End Sub";
return "";
}
public String  _downloadstart3(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart3", false))
	 {return ((String) Debug.delegate(ba, "downloadstart3", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=81199104;
 //BA.debugLineNum = 81199104;BA.debugLine="Sub DownloadStart3(progress As ProgressBar, dlg As";
RDebugUtils.currentLine=81199106;
 //BA.debugLineNum = 81199106;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681199106","************************************************************",0);
RDebugUtils.currentLine=81199107;
 //BA.debugLineNum = 81199107;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
__c.LogImpl("681199107",(" 		SERVICE-FIRST INSTALL : "+__c.SmartStringFormatter("",(Object)(_sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81199108;
 //BA.debugLineNum = 81199108;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681199108","************************************************************",0);
RDebugUtils.currentLine=81199109;
 //BA.debugLineNum = 81199109;BA.debugLine="DownloadTable(\"CONTRACTS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"CONTRACTS",_progress,_dlg);
RDebugUtils.currentLine=81199110;
 //BA.debugLineNum = 81199110;BA.debugLine="DownloadTable(\"DEPARTMENTS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"DEPARTMENTS",_progress,_dlg);
RDebugUtils.currentLine=81199111;
 //BA.debugLineNum = 81199111;BA.debugLine="DownloadTable(\"TEAMS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"TEAMS",_progress,_dlg);
RDebugUtils.currentLine=81199112;
 //BA.debugLineNum = 81199112;BA.debugLine="DownloadTable(\"TYPEREQUESTS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"TYPEREQUESTS",_progress,_dlg);
RDebugUtils.currentLine=81199113;
 //BA.debugLineNum = 81199113;BA.debugLine="End Sub";
return "";
}
public String  _downloadstart4(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart4", false))
	 {return ((String) Debug.delegate(ba, "downloadstart4", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=81264640;
 //BA.debugLineNum = 81264640;BA.debugLine="Sub DownloadStart4(progress As ProgressBar, dlg As";
RDebugUtils.currentLine=81264641;
 //BA.debugLineNum = 81264641;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681264641","************************************************************",0);
RDebugUtils.currentLine=81264642;
 //BA.debugLineNum = 81264642;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
__c.LogImpl("681264642",(" 		SERVICE-FIRST INSTALL : "+__c.SmartStringFormatter("",(Object)(_sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81264643;
 //BA.debugLineNum = 81264643;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681264643","************************************************************",0);
RDebugUtils.currentLine=81264644;
 //BA.debugLineNum = 81264644;BA.debugLine="DownloadTable(\"ARTICLES\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"ARTICLES",_progress,_dlg);
RDebugUtils.currentLine=81264645;
 //BA.debugLineNum = 81264645;BA.debugLine="DownloadTable(\"WAREHOUSES\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"WAREHOUSES",_progress,_dlg);
RDebugUtils.currentLine=81264646;
 //BA.debugLineNum = 81264646;BA.debugLine="DownloadTable(\"CHECKLISTS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"CHECKLISTS",_progress,_dlg);
RDebugUtils.currentLine=81264647;
 //BA.debugLineNum = 81264647;BA.debugLine="End Sub";
return "";
}
public String  _downloadstart5(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart5", false))
	 {return ((String) Debug.delegate(ba, "downloadstart5", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=81330176;
 //BA.debugLineNum = 81330176;BA.debugLine="Sub DownloadStart5(progress As ProgressBar, dlg As";
RDebugUtils.currentLine=81330177;
 //BA.debugLineNum = 81330177;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681330177","************************************************************",0);
RDebugUtils.currentLine=81330178;
 //BA.debugLineNum = 81330178;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
__c.LogImpl("681330178",(" 		SERVICE-FIRST INSTALL : "+__c.SmartStringFormatter("",(Object)(_sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81330179;
 //BA.debugLineNum = 81330179;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681330179","************************************************************",0);
RDebugUtils.currentLine=81330180;
 //BA.debugLineNum = 81330180;BA.debugLine="DownloadTable(\"COMPANY\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"COMPANY",_progress,_dlg);
RDebugUtils.currentLine=81330181;
 //BA.debugLineNum = 81330181;BA.debugLine="DownloadTable(\"REPORTS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"REPORTS",_progress,_dlg);
RDebugUtils.currentLine=81330182;
 //BA.debugLineNum = 81330182;BA.debugLine="DownloadTable(\"ZONES\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"ZONES",_progress,_dlg);
RDebugUtils.currentLine=81330183;
 //BA.debugLineNum = 81330183;BA.debugLine="DownloadTable(\"FIELDS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"FIELDS",_progress,_dlg);
RDebugUtils.currentLine=81330184;
 //BA.debugLineNum = 81330184;BA.debugLine="End Sub";
return "";
}
public String  _downloadstart6(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart6", false))
	 {return ((String) Debug.delegate(ba, "downloadstart6", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=81395712;
 //BA.debugLineNum = 81395712;BA.debugLine="Sub DownloadStart6(progress As ProgressBar, dlg As";
RDebugUtils.currentLine=81395713;
 //BA.debugLineNum = 81395713;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681395713","************************************************************",0);
RDebugUtils.currentLine=81395714;
 //BA.debugLineNum = 81395714;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
__c.LogImpl("681395714",(" 		SERVICE-FIRST INSTALL : "+__c.SmartStringFormatter("",(Object)(_sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81395715;
 //BA.debugLineNum = 81395715;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681395715","************************************************************",0);
RDebugUtils.currentLine=81395716;
 //BA.debugLineNum = 81395716;BA.debugLine="DownloadTable(\"TYPES\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"TYPES",_progress,_dlg);
RDebugUtils.currentLine=81395717;
 //BA.debugLineNum = 81395717;BA.debugLine="DownloadTable(\"ACTIONS\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"ACTIONS",_progress,_dlg);
RDebugUtils.currentLine=81395718;
 //BA.debugLineNum = 81395718;BA.debugLine="End Sub";
return "";
}
public void  _downloadstart7(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart7", false))
	 {Debug.delegate(ba, "downloadstart7", new Object[] {_progress,_dlg}); return;}
ResumableSub_DownloadStart7 rsub = new ResumableSub_DownloadStart7(this,__ref,_progress,_dlg);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadStart7 extends BA.ResumableSub {
public ResumableSub_DownloadStart7(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) {
this.parent = parent;
this.__ref = __ref;
this._progress = _progress;
this._dlg = _dlg;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
anywheresoftware.b4a.objects.ProgressBarWrapper _progress;
anywheresoftware.b4a.objects.LabelWrapper _dlg;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=81461249;
 //BA.debugLineNum = 81461249;BA.debugLine="Log(\"********************************************";
parent.__c.LogImpl("681461249","************************************************************",0);
RDebugUtils.currentLine=81461250;
 //BA.debugLineNum = 81461250;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
parent.__c.LogImpl("681461250",(" 		SERVICE-FIRST INSTALL : "+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81461251;
 //BA.debugLineNum = 81461251;BA.debugLine="Log(\"********************************************";
parent.__c.LogImpl("681461251","************************************************************",0);
RDebugUtils.currentLine=81461253;
 //BA.debugLineNum = 81461253;BA.debugLine="DownloadTableAsync(\"dta_objects\",progress, dlg)";
__ref._downloadtableasync /*void*/ (null,"dta_objects",_progress,_dlg);
RDebugUtils.currentLine=81461254;
 //BA.debugLineNum = 81461254;BA.debugLine="Sleep(5000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadstart7"),(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=81461255;
 //BA.debugLineNum = 81461255;BA.debugLine="DownloadTableAsync(\"dta_objects_contacts\",progres";
__ref._downloadtableasync /*void*/ (null,"dta_objects_contacts",_progress,_dlg);
RDebugUtils.currentLine=81461256;
 //BA.debugLineNum = 81461256;BA.debugLine="DownloadTableAsync(\"dta_objects_documents\",progre";
__ref._downloadtableasync /*void*/ (null,"dta_objects_documents",_progress,_dlg);
RDebugUtils.currentLine=81461257;
 //BA.debugLineNum = 81461257;BA.debugLine="DownloadTableAsync(\"dta_objects_relations\",progre";
__ref._downloadtableasync /*void*/ (null,"dta_objects_relations",_progress,_dlg);
RDebugUtils.currentLine=81461258;
 //BA.debugLineNum = 81461258;BA.debugLine="DownloadTableAsync(\"dta_objects_images\",progress,";
__ref._downloadtableasync /*void*/ (null,"dta_objects_images",_progress,_dlg);
RDebugUtils.currentLine=81461259;
 //BA.debugLineNum = 81461259;BA.debugLine="DownloadTableAsync(\"dta_objects_fields\",progress,";
__ref._downloadtableasync /*void*/ (null,"dta_objects_fields",_progress,_dlg);
RDebugUtils.currentLine=81461260;
 //BA.debugLineNum = 81461260;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _downloadstart8(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart8", false))
	 {return ((String) Debug.delegate(ba, "downloadstart8", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=81526784;
 //BA.debugLineNum = 81526784;BA.debugLine="Sub DownloadStart8(progress As ProgressBar, dlg As";
RDebugUtils.currentLine=81526785;
 //BA.debugLineNum = 81526785;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681526785","************************************************************",0);
RDebugUtils.currentLine=81526786;
 //BA.debugLineNum = 81526786;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
__c.LogImpl("681526786",(" 		SERVICE-FIRST INSTALL : "+__c.SmartStringFormatter("",(Object)(_sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81526787;
 //BA.debugLineNum = 81526787;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681526787","************************************************************",0);
RDebugUtils.currentLine=81526788;
 //BA.debugLineNum = 81526788;BA.debugLine="DownloadTable(\"REQUESTS1\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"REQUESTS1",_progress,_dlg);
RDebugUtils.currentLine=81526789;
 //BA.debugLineNum = 81526789;BA.debugLine="End Sub";
return "";
}
public String  _downloadstart9(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadstart9", false))
	 {return ((String) Debug.delegate(ba, "downloadstart9", new Object[] {_progress,_dlg}));}
RDebugUtils.currentLine=81592320;
 //BA.debugLineNum = 81592320;BA.debugLine="Sub DownloadStart9(progress As ProgressBar, dlg As";
RDebugUtils.currentLine=81592321;
 //BA.debugLineNum = 81592321;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681592321","************************************************************",0);
RDebugUtils.currentLine=81592322;
 //BA.debugLineNum = 81592322;BA.debugLine="Log($\" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_";
__c.LogImpl("681592322",(" 		SERVICE-FIRST INSTALL : "+__c.SmartStringFormatter("",(Object)(_sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=81592323;
 //BA.debugLineNum = 81592323;BA.debugLine="Log(\"********************************************";
__c.LogImpl("681592323","************************************************************",0);
RDebugUtils.currentLine=81592324;
 //BA.debugLineNum = 81592324;BA.debugLine="DownloadTable(\"REQUESTS2\", progress, dlg)";
__ref._downloadtable /*void*/ (null,"REQUESTS2",_progress,_dlg);
RDebugUtils.currentLine=81592325;
 //BA.debugLineNum = 81592325;BA.debugLine="End Sub";
return "";
}
public void  _downloadalltables3(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,Object _activname,String _title,String _textinfo) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadalltables3", false))
	 {Debug.delegate(ba, "downloadalltables3", new Object[] {_activname,_title,_textinfo}); return;}
ResumableSub_DownloadAllTables3 rsub = new ResumableSub_DownloadAllTables3(this,__ref,_activname,_title,_textinfo);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadAllTables3 extends BA.ResumableSub {
public ResumableSub_DownloadAllTables3(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,Object _activname,String _title,String _textinfo) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._title = _title;
this._textinfo = _textinfo;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
Object _activname;
String _title;
String _textinfo;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=81002497;
 //BA.debugLineNum = 81002497;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=81002498;
 //BA.debugLineNum = 81002498;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=81002499;
 //BA.debugLineNum = 81002499;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhiteSilver";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhitesilverlight /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=81002500;
 //BA.debugLineNum = 81002500;BA.debugLine="ApplDialog.SetSize(80%x, 200dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (80),ba),parent.__c.DipToCurrent((int) (200)));
RDebugUtils.currentLine=81002501;
 //BA.debugLineNum = 81002501;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=81002502;
 //BA.debugLineNum = 81002502;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadalltables3"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=81002503;
 //BA.debugLineNum = 81002503;BA.debugLine="DialogPanel.LoadLayout(\"dialog_downloadprogress\")";
_dialogpanel.LoadLayout("dialog_downloadprogress",ba);
RDebugUtils.currentLine=81002504;
 //BA.debugLineNum = 81002504;BA.debugLine="dialogMainText.Text = textInfo";
__ref._dialogmaintext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_textinfo));
RDebugUtils.currentLine=81002505;
 //BA.debugLineNum = 81002505;BA.debugLine="dialogProgress.Progress = 0";
__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ .setProgress((int) (0));
RDebugUtils.currentLine=81002506;
 //BA.debugLineNum = 81002506;BA.debugLine="DownloadFilesWithFTP(dialogProgress, dialogPositi";
__ref._downloadfileswithftp /*void*/ (null,__ref._dialogprogress /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ,__ref._dialogpositions /*anywheresoftware.b4a.objects.LabelWrapper*/ );
RDebugUtils.currentLine=81002507;
 //BA.debugLineNum = 81002507;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadalltables3"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=81002508;
 //BA.debugLineNum = 81002508;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=81002509;
 //BA.debugLineNum = 81002509;BA.debugLine="CallSub(activName, \"DownLoadReturn3\")";
parent.__c.CallSubDebug(ba,_activname,"DownLoadReturn3");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=81002512;
 //BA.debugLineNum = 81002512;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _downloadfileswithftp(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadfileswithftp", false))
	 {Debug.delegate(ba, "downloadfileswithftp", new Object[] {_progress,_dlg}); return;}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(this,__ref,_progress,_dlg);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) {
this.parent = parent;
this.__ref = __ref;
this._progress = _progress;
this._dlg = _dlg;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
anywheresoftware.b4a.objects.ProgressBarWrapper _progress;
anywheresoftware.b4a.objects.LabelWrapper _dlg;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _i = 0;
String _fname = "";
Object _sf = null;
int step13;
int limit13;
int step28;
int limit28;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=82444290;
 //BA.debugLineNum = 82444290;BA.debugLine="Log(\"********************************************";
parent.__c.LogImpl("682444290","************************************************************",0);
RDebugUtils.currentLine=82444291;
 //BA.debugLineNum = 82444291;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APPL_HOST}/${Share";
parent.__c.LogImpl("682444291",(" 		INITIAL : "+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=82444292;
 //BA.debugLineNum = 82444292;BA.debugLine="Log(\"********************************************";
parent.__c.LogImpl("682444292","************************************************************",0);
RDebugUtils.currentLine=82444293;
 //BA.debugLineNum = 82444293;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=82444294;
 //BA.debugLineNum = 82444294;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(ba,"ftp",(""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_ftp_user /*String*/ ))+"@"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=82444295;
 //BA.debugLineNum = 82444295;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(parent.__c.True);
RDebugUtils.currentLine=82444299;
 //BA.debugLineNum = 82444299;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=82444300;
 //BA.debugLineNum = 82444300;BA.debugLine="Dim sfl As Object = myFTP.List(\"/\" & ShareCode.AP";
_sfl = _myftp.List(ba,"/"+parent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=82444304;
 //BA.debugLineNum = 82444304;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
parent.__c.WaitFor("ftp_listcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadfileswithftp"), _sfl);
this.state = 36;
return;
case 36:
//C
this.state = 1;
_serverpath = (String) result[1];
_success = (Boolean) result[2];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[4];
;
RDebugUtils.currentLine=82444305;
 //BA.debugLineNum = 82444305;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_success) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=82444309;
 //BA.debugLineNum = 82444309;BA.debugLine="If (Files.Length >= 1) Then";
if (true) break;

case 4:
//if
this.state = 15;
if ((_files.length>=1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=82444310;
 //BA.debugLineNum = 82444310;BA.debugLine="FTPFileList.Initialize";
__ref._ftpfilelist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=82444311;
 //BA.debugLineNum = 82444311;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 7:
//for
this.state = 14;
step13 = 1;
limit13 = (int) (_files.length-1);
_i = (int) (0) ;
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
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=82444312;
 //BA.debugLineNum = 82444312;BA.debugLine="Dim fName As String = Files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=82444313;
 //BA.debugLineNum = 82444313;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
if (true) break;

case 10:
//if
this.state = 13;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".html"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=82444314;
 //BA.debugLineNum = 82444314;BA.debugLine="FTPFileList.Add(Files(i).Name)";
__ref._ftpfilelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_files[_i].getName()));
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
RDebugUtils.currentLine=82444319;
 //BA.debugLineNum = 82444319;BA.debugLine="Log(\"error getting files list\")";
parent.__c.LogImpl("682444319","error getting files list",0);
RDebugUtils.currentLine=82444320;
 //BA.debugLineNum = 82444320;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
__ref._current_counter /*int*/  = __ref._end_counter /*int*/ ;
RDebugUtils.currentLine=82444321;
 //BA.debugLineNum = 82444321;BA.debugLine="AddCounters(progress, dlg)";
__ref._addcounters /*String*/ (null,_progress,_dlg);
 if (true) break;
;
RDebugUtils.currentLine=82444324;
 //BA.debugLineNum = 82444324;BA.debugLine="If (FTPFileList.IsInitialized) Then";

case 18:
//if
this.state = 35;
if ((__ref._ftpfilelist /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized())) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=82444325;
 //BA.debugLineNum = 82444325;BA.debugLine="If (FTPFileList.Size>=1) Then";
if (true) break;

case 21:
//if
this.state = 34;
if ((__ref._ftpfilelist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=1)) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=82444326;
 //BA.debugLineNum = 82444326;BA.debugLine="END_COUNTER = FTPFileList.Size-1";
__ref._end_counter /*int*/  = (int) (__ref._ftpfilelist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=82444327;
 //BA.debugLineNum = 82444327;BA.debugLine="For i=0 To FTPFileList.Size-1";
if (true) break;

case 24:
//for
this.state = 33;
step28 = 1;
limit28 = (int) (__ref._ftpfilelist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=82444328;
 //BA.debugLineNum = 82444328;BA.debugLine="Dim fName As String = FTPFileList.Get(i)";
_fname = BA.ObjectToString(__ref._ftpfilelist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=82444330;
 //BA.debugLineNum = 82444330;BA.debugLine="Log(fName)";
parent.__c.LogImpl("682444330",_fname,0);
RDebugUtils.currentLine=82444331;
 //BA.debugLineNum = 82444331;BA.debugLine="Dim sf As Object = Starter.GlobalFTP.DownloadF";
_sf = parent._starter._globalftp /*anywheresoftware.b4a.net.FTPWrapper*/ .DownloadFile(ba,"/"+parent._sharecode._app_domain /*String*/ +"/docs/"+_fname,parent.__c.False,parent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=82444332;
 //BA.debugLineNum = 82444332;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
parent.__c.WaitFor("ftp_downloadcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadfileswithftp"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 27;
_serverpath = (String) result[1];
_success = (Boolean) result[2];
;
RDebugUtils.currentLine=82444334;
 //BA.debugLineNum = 82444334;BA.debugLine="If Success Then";
if (true) break;

case 27:
//if
this.state = 32;
if (_success) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=82444335;
 //BA.debugLineNum = 82444335;BA.debugLine="Log(\"file was download successfully\")";
parent.__c.LogImpl("682444335","file was download successfully",0);
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=82444338;
 //BA.debugLineNum = 82444338;BA.debugLine="Log(\"Error downloading file\")";
parent.__c.LogImpl("682444338","Error downloading file",0);
 if (true) break;

case 32:
//C
this.state = 40;
;
RDebugUtils.currentLine=82444341;
 //BA.debugLineNum = 82444341;BA.debugLine="AddCounters(progress, dlg)";
__ref._addcounters /*String*/ (null,_progress,_dlg);
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
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
RDebugUtils.currentLine=82444347;
 //BA.debugLineNum = 82444347;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=82444348;
 //BA.debugLineNum = 82444348;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _downloadtable(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadtable", false))
	 {Debug.delegate(ba, "downloadtable", new Object[] {_tablename,_progress,_dlg}); return;}
ResumableSub_DownloadTable rsub = new ResumableSub_DownloadTable(this,__ref,_tablename,_progress,_dlg);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadTable extends BA.ResumableSub {
public ResumableSub_DownloadTable(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) {
this.parent = parent;
this.__ref = __ref;
this._tablename = _tablename;
this._progress = _progress;
this._dlg = _dlg;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
String _tablename;
anywheresoftware.b4a.objects.ProgressBarWrapper _progress;
anywheresoftware.b4a.objects.LabelWrapper _dlg;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=82051073;
 //BA.debugLineNum = 82051073;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/download/table");
RDebugUtils.currentLine=82051075;
 //BA.debugLineNum = 82051075;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=82051076;
 //BA.debugLineNum = 82051076;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=82051077;
 //BA.debugLineNum = 82051077;BA.debugLine="Job.PostString(ServerAddress, MakeTableMaps(table";
_job._poststring /*String*/ (null,_serveraddress,__ref._maketablemaps /*String*/ (null,_tablename));
RDebugUtils.currentLine=82051078;
 //BA.debugLineNum = 82051078;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=82051080;
 //BA.debugLineNum = 82051080;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadtable"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[1];
;
RDebugUtils.currentLine=82051081;
 //BA.debugLineNum = 82051081;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=82051082;
 //BA.debugLineNum = 82051082;BA.debugLine="Try";
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
RDebugUtils.currentLine=82051083;
 //BA.debugLineNum = 82051083;BA.debugLine="InsertUpdateTable(Job.GetString, progress, dlg)";
__ref._insertupdatetable /*void*/ (null,_job._getstring /*String*/ (null),_progress,_dlg);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=82051085;
 //BA.debugLineNum = 82051085;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("682051085",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=82051086;
 //BA.debugLineNum = 82051086;BA.debugLine="AddCounters(progress, dlg)";
__ref._addcounters /*String*/ (null,_progress,_dlg);
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
RDebugUtils.currentLine=82051089;
 //BA.debugLineNum = 82051089;BA.debugLine="Log(Job.ErrorMessage)";
parent.__c.LogImpl("682051089",_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=82051090;
 //BA.debugLineNum = 82051090;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent._utils._logerror /*String*/ (ba,"Download",parent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
RDebugUtils.currentLine=82051091;
 //BA.debugLineNum = 82051091;BA.debugLine="AddCounters(progress, dlg)";
__ref._addcounters /*String*/ (null,_progress,_dlg);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=82051093;
 //BA.debugLineNum = 82051093;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=82051094;
 //BA.debugLineNum = 82051094;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _downloadtableasync(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadtableasync", false))
	 {Debug.delegate(ba, "downloadtableasync", new Object[] {_tablename,_progress,_dlg}); return;}
ResumableSub_DownloadTableAsync rsub = new ResumableSub_DownloadTableAsync(this,__ref,_tablename,_progress,_dlg);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadTableAsync extends BA.ResumableSub {
public ResumableSub_DownloadTableAsync(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) {
this.parent = parent;
this.__ref = __ref;
this._tablename = _tablename;
this._progress = _progress;
this._dlg = _dlg;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
String _tablename;
anywheresoftware.b4a.objects.ProgressBarWrapper _progress;
anywheresoftware.b4a.objects.LabelWrapper _dlg;
int _recs = 0;
int _result = 0;
boolean _complete = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=81657858;
 //BA.debugLineNum = 81657858;BA.debugLine="Dim recs As Int = 0";
_recs = (int) (0);
RDebugUtils.currentLine=81657862;
 //BA.debugLineNum = 81657862;BA.debugLine="Wait For(GetTableCount(tableName)) Complete (resu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadtableasync"), __ref._gettablecount /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_tablename));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=81657864;
 //BA.debugLineNum = 81657864;BA.debugLine="If(result > -1) Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((_result>-1)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=81657865;
 //BA.debugLineNum = 81657865;BA.debugLine="Do While result > recs";
if (true) break;

case 4:
//do while
this.state = 17;
while (_result>_recs) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=81657867;
 //BA.debugLineNum = 81657867;BA.debugLine="DownloadTableBy500(tableName, recs)";
__ref._downloadtableby500 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_tablename,_recs);
RDebugUtils.currentLine=81657868;
 //BA.debugLineNum = 81657868;BA.debugLine="recs = recs + 500";
_recs = (int) (_recs+500);
RDebugUtils.currentLine=81657870;
 //BA.debugLineNum = 81657870;BA.debugLine="If(result > recs) Then";
if (true) break;

case 7:
//if
this.state = 16;
if ((_result>_recs)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=81657871;
 //BA.debugLineNum = 81657871;BA.debugLine="Wait For  (DownloadTableBy500(tableName, recs)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadtableasync"), __ref._downloadtableby500 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_tablename,_recs));
this.state = 20;
return;
case 20:
//C
this.state = 10;
_complete = (Boolean) result[1];
;
RDebugUtils.currentLine=81657872;
 //BA.debugLineNum = 81657872;BA.debugLine="If(Complete) Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((_complete)) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=81657873;
 //BA.debugLineNum = 81657873;BA.debugLine="recs = recs + 500";
_recs = (int) (_recs+500);
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=81657875;
 //BA.debugLineNum = 81657875;BA.debugLine="Return";
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
RDebugUtils.currentLine=81657887;
 //BA.debugLineNum = 81657887;BA.debugLine="AddCounters(progress, dlg)";
__ref._addcounters /*String*/ (null,_progress,_dlg);
RDebugUtils.currentLine=81657888;
 //BA.debugLineNum = 81657888;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _maketablemaps(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "maketablemaps", false))
	 {return ((String) Debug.delegate(ba, "maketablemaps", new Object[] {_tablename}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
RDebugUtils.currentLine=81985536;
 //BA.debugLineNum = 81985536;BA.debugLine="Sub MakeTableMaps(tablename As String) As String";
RDebugUtils.currentLine=81985537;
 //BA.debugLineNum = 81985537;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=81985538;
 //BA.debugLineNum = 81985538;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=81985539;
 //BA.debugLineNum = 81985539;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=81985540;
 //BA.debugLineNum = 81985540;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(_sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=81985541;
 //BA.debugLineNum = 81985541;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(_sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=81985542;
 //BA.debugLineNum = 81985542;BA.debugLine="params.Put(\"tablename\", tablename)";
_params.Put((Object)("tablename"),(Object)(_tablename));
RDebugUtils.currentLine=81985543;
 //BA.debugLineNum = 81985543;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(_main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=81985544;
 //BA.debugLineNum = 81985544;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(_main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=81985545;
 //BA.debugLineNum = 81985545;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(_main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=81985546;
 //BA.debugLineNum = 81985546;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(_main._devicebrand /*String*/ ));
RDebugUtils.currentLine=81985547;
 //BA.debugLineNum = 81985547;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(_main._devicemodel /*String*/ ));
RDebugUtils.currentLine=81985548;
 //BA.debugLineNum = 81985548;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(_main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=81985549;
 //BA.debugLineNum = 81985549;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(_sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=81985550;
 //BA.debugLineNum = 81985550;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=81985551;
 //BA.debugLineNum = 81985551;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=81985553;
 //BA.debugLineNum = 81985553;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=81985554;
 //BA.debugLineNum = 81985554;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=81985555;
 //BA.debugLineNum = 81985555;BA.debugLine="End Sub";
return "";
}
public void  _insertupdatetable(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _datares,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "insertupdatetable", false))
	 {Debug.delegate(ba, "insertupdatetable", new Object[] {_datares,_progress,_dlg}); return;}
ResumableSub_InsertUpdateTable rsub = new ResumableSub_InsertUpdateTable(this,__ref,_datares,_progress,_dlg);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertUpdateTable extends BA.ResumableSub {
public ResumableSub_InsertUpdateTable(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _datares,anywheresoftware.b4a.objects.ProgressBarWrapper _progress,anywheresoftware.b4a.objects.LabelWrapper _dlg) {
this.parent = parent;
this.__ref = __ref;
this._datares = _datares;
this._progress = _progress;
this._dlg = _dlg;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
String _datares;
anywheresoftware.b4a.objects.ProgressBarWrapper _progress;
anywheresoftware.b4a.objects.LabelWrapper _dlg;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _status = 0;
anywheresoftware.b4a.objects.collections.List _data = null;
anywheresoftware.b4a.objects.collections.Map _coldata = null;
String _table = "";
anywheresoftware.b4a.objects.collections.List _rows = null;
String _stridlist = "";
anywheresoftware.b4a.objects.collections.List _idlist = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _mid = 0;
anywheresoftware.b4a.objects.collections.Map _mapping = null;
anywheresoftware.b4a.BA.IterableList group7;
int index7;
int groupLen7;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=82116609;
 //BA.debugLineNum = 82116609;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=82116610;
 //BA.debugLineNum = 82116610;BA.debugLine="parser.Initialize(datares)";
_parser.Initialize(_datares);
RDebugUtils.currentLine=82116611;
 //BA.debugLineNum = 82116611;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=82116613;
 //BA.debugLineNum = 82116613;BA.debugLine="Dim status As Int = root.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_root.Get((Object)("status"))));
RDebugUtils.currentLine=82116614;
 //BA.debugLineNum = 82116614;BA.debugLine="If (status = 1) Then";
if (true) break;

case 1:
//if
this.state = 22;
if ((_status==1)) { 
this.state = 3;
}else {
this.state = 21;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=82116615;
 //BA.debugLineNum = 82116615;BA.debugLine="Dim data As List = root.Get(\"data\")";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=82116616;
 //BA.debugLineNum = 82116616;BA.debugLine="For Each coldata As Map In data";
if (true) break;

case 4:
//for
this.state = 19;
_coldata = new anywheresoftware.b4a.objects.collections.Map();
group7 = _data;
index7 = 0;
groupLen7 = group7.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 19;
if (index7 < groupLen7) {
this.state = 6;
_coldata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group7.Get(index7)));}
if (true) break;

case 24:
//C
this.state = 23;
index7++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=82116617;
 //BA.debugLineNum = 82116617;BA.debugLine="Dim table As String = coldata.Get(\"table\")";
_table = BA.ObjectToString(_coldata.Get((Object)("table")));
RDebugUtils.currentLine=82116618;
 //BA.debugLineNum = 82116618;BA.debugLine="Dim rows As List = coldata.Get(\"rows\")";
_rows = new anywheresoftware.b4a.objects.collections.List();
_rows = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_coldata.Get((Object)("rows"))));
RDebugUtils.currentLine=82116622;
 //BA.debugLineNum = 82116622;BA.debugLine="Dim strIDList As String = GetListMapsID(rows)";
_stridlist = __ref._getlistmapsid /*String*/ (null,_rows);
RDebugUtils.currentLine=82116623;
 //BA.debugLineNum = 82116623;BA.debugLine="Dim IDList As List = GetAllExistingRecords(tabl";
_idlist = new anywheresoftware.b4a.objects.collections.List();
_idlist = __ref._getallexistingrecords /*anywheresoftware.b4a.objects.collections.List*/ (null,_table,_stridlist);
RDebugUtils.currentLine=82116625;
 //BA.debugLineNum = 82116625;BA.debugLine="DBUtils.InsertMaps2(Starter.LocalSQLEVC, table,";
parent._dbutils._insertmaps2 /*String*/ (ba,parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,_table,_rows,_idlist);
RDebugUtils.currentLine=82116626;
 //BA.debugLineNum = 82116626;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "insertupdatetable"),(int) (100));
this.state = 25;
return;
case 25:
//C
this.state = 7;
;
RDebugUtils.currentLine=82116630;
 //BA.debugLineNum = 82116630;BA.debugLine="If (IDList.Size >=1) Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((_idlist.getSize()>=1)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=82116631;
 //BA.debugLineNum = 82116631;BA.debugLine="For i1 = 0 To rows.Size - 1";
if (true) break;

case 10:
//for
this.state = 17;
step15 = 1;
limit15 = (int) (_rows.getSize()-1);
_i1 = (int) (0) ;
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
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=82116632;
 //BA.debugLineNum = 82116632;BA.debugLine="Dim m As Map = rows.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rows.Get(_i1)));
RDebugUtils.currentLine=82116633;
 //BA.debugLineNum = 82116633;BA.debugLine="Dim mID As Int = m.Get(\"id\")";
_mid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=82116634;
 //BA.debugLineNum = 82116634;BA.debugLine="If (IDList.IndexOf(mID) >=0) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_idlist.IndexOf((Object)(_mid))>=0)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=82116635;
 //BA.debugLineNum = 82116635;BA.debugLine="Dim Mapping As Map";
_mapping = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=82116636;
 //BA.debugLineNum = 82116636;BA.debugLine="Mapping.Initialize";
_mapping.Initialize();
RDebugUtils.currentLine=82116637;
 //BA.debugLineNum = 82116637;BA.debugLine="Mapping.Put(\"id\", mID)";
_mapping.Put((Object)("id"),(Object)(_mid));
RDebugUtils.currentLine=82116639;
 //BA.debugLineNum = 82116639;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLE";
parent._utils._updaterecord2withlog /*String*/ (ba,parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,_table,_m,_mapping,"","");
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
;
 if (true) break;

case 18:
//C
this.state = 24;
;
RDebugUtils.currentLine=82116644;
 //BA.debugLineNum = 82116644;BA.debugLine="AddCounters(progress, dlg)";
__ref._addcounters /*String*/ (null,_progress,_dlg);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=82116647;
 //BA.debugLineNum = 82116647;BA.debugLine="AddCounters(progress, dlg)";
__ref._addcounters /*String*/ (null,_progress,_dlg);
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=82116649;
 //BA.debugLineNum = 82116649;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _gettablecount(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "gettablecount", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "gettablecount", new Object[] {_tablename}));}
ResumableSub_GetTableCount rsub = new ResumableSub_GetTableCount(this,__ref,_tablename);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetTableCount extends BA.ResumableSub {
public ResumableSub_GetTableCount(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename) {
this.parent = parent;
this.__ref = __ref;
this._tablename = _tablename;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
String _tablename;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
int _count = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=81723393;
 //BA.debugLineNum = 81723393;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/table/count");
RDebugUtils.currentLine=81723395;
 //BA.debugLineNum = 81723395;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=81723396;
 //BA.debugLineNum = 81723396;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=81723397;
 //BA.debugLineNum = 81723397;BA.debugLine="Job.PostString(ServerAddress, MakeTableMaps2(tabl";
_job._poststring /*String*/ (null,_serveraddress,__ref._maketablemaps2 /*String*/ (null,_tablename));
RDebugUtils.currentLine=81723398;
 //BA.debugLineNum = 81723398;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=81723400;
 //BA.debugLineNum = 81723400;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "gettablecount"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[1];
;
RDebugUtils.currentLine=81723401;
 //BA.debugLineNum = 81723401;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=81723402;
 //BA.debugLineNum = 81723402;BA.debugLine="Try";
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
RDebugUtils.currentLine=81723403;
 //BA.debugLineNum = 81723403;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=81723404;
 //BA.debugLineNum = 81723404;BA.debugLine="JSON1.Initialize(Job.GetString())";
_json1.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=81723405;
 //BA.debugLineNum = 81723405;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=81723407;
 //BA.debugLineNum = 81723407;BA.debugLine="Dim count As Int = MapJSON.Get(\"count\")";
_count = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("count"))));
RDebugUtils.currentLine=81723409;
 //BA.debugLineNum = 81723409;BA.debugLine="Log(\"Count Final \" &  count)";
parent.__c.LogImpl("681723409","Count Final "+BA.NumberToString(_count),0);
RDebugUtils.currentLine=81723410;
 //BA.debugLineNum = 81723410;BA.debugLine="Return count";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_count));return;};
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=81723412;
 //BA.debugLineNum = 81723412;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("681723412",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=81723416;
 //BA.debugLineNum = 81723416;BA.debugLine="Log(\"Erro Count: \" & tablename)  ' Job.ErrorMess";
parent.__c.LogImpl("681723416","Erro Count: "+_tablename,0);
RDebugUtils.currentLine=81723417;
 //BA.debugLineNum = 81723417;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent._utils._logerror /*String*/ (ba,"Download",parent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=81723419;
 //BA.debugLineNum = 81723419;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=81723421;
 //BA.debugLineNum = 81723421;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadtableby500(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename,int _position) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "downloadtableby500", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "downloadtableby500", new Object[] {_tablename,_position}));}
ResumableSub_DownloadTableBy500 rsub = new ResumableSub_DownloadTableBy500(this,__ref,_tablename,_position);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadTableBy500 extends BA.ResumableSub {
public ResumableSub_DownloadTableBy500(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename,int _position) {
this.parent = parent;
this.__ref = __ref;
this._tablename = _tablename;
this._position = _position;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
String _tablename;
int _position;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=81788930;
 //BA.debugLineNum = 81788930;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/table/getData");
RDebugUtils.currentLine=81788932;
 //BA.debugLineNum = 81788932;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=81788933;
 //BA.debugLineNum = 81788933;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=81788934;
 //BA.debugLineNum = 81788934;BA.debugLine="Log(\"GetTableCount \" & MakeTableMapsBy500(tablena";
parent.__c.LogImpl("681788934","GetTableCount "+__ref._maketablemapsby500 /*String*/ (null,_tablename,_position),0);
RDebugUtils.currentLine=81788935;
 //BA.debugLineNum = 81788935;BA.debugLine="Job.PostString(ServerAddress,MakeTableMapsBy500(t";
_job._poststring /*String*/ (null,_serveraddress,__ref._maketablemapsby500 /*String*/ (null,_tablename,_position));
RDebugUtils.currentLine=81788936;
 //BA.debugLineNum = 81788936;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=81788937;
 //BA.debugLineNum = 81788937;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "downloadtableby500"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[1];
;
RDebugUtils.currentLine=81788938;
 //BA.debugLineNum = 81788938;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=81788939;
 //BA.debugLineNum = 81788939;BA.debugLine="Try";
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
RDebugUtils.currentLine=81788940;
 //BA.debugLineNum = 81788940;BA.debugLine="InsertUpdateTableNoProgress(tablename, Job.GetS";
__ref._insertupdatetablenoprogress /*void*/ (null,_tablename,_job._getstring /*String*/ (null));
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=81788943;
 //BA.debugLineNum = 81788943;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("681788943",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=81788945;
 //BA.debugLineNum = 81788945;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
RDebugUtils.currentLine=81788948;
 //BA.debugLineNum = 81788948;BA.debugLine="Log(\"Erro Dby500: \" & tablename)  ' Job.ErrorMes";
parent.__c.LogImpl("681788948","Erro Dby500: "+_tablename,0);
RDebugUtils.currentLine=81788949;
 //BA.debugLineNum = 81788949;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent._utils._logerror /*String*/ (ba,"Download",parent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
RDebugUtils.currentLine=81788951;
 //BA.debugLineNum = 81788951;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=81788953;
 //BA.debugLineNum = 81788953;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=81788955;
 //BA.debugLineNum = 81788955;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=81788956;
 //BA.debugLineNum = 81788956;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _maketablemapsby500(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "maketablemapsby500", false))
	 {return ((String) Debug.delegate(ba, "maketablemapsby500", new Object[] {_tablename,_position}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
RDebugUtils.currentLine=81854464;
 //BA.debugLineNum = 81854464;BA.debugLine="Sub MakeTableMapsBy500(tablename As String, positi";
RDebugUtils.currentLine=81854465;
 //BA.debugLineNum = 81854465;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=81854466;
 //BA.debugLineNum = 81854466;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=81854467;
 //BA.debugLineNum = 81854467;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=81854468;
 //BA.debugLineNum = 81854468;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(_sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=81854469;
 //BA.debugLineNum = 81854469;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(_sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=81854470;
 //BA.debugLineNum = 81854470;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(_sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=81854471;
 //BA.debugLineNum = 81854471;BA.debugLine="params.Put(\"_team\", ShareCode.SESS_User)";
_params.Put((Object)("_team"),(Object)(_sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=81854472;
 //BA.debugLineNum = 81854472;BA.debugLine="params.Put(\"table\", tablename)";
_params.Put((Object)("table"),(Object)(_tablename));
RDebugUtils.currentLine=81854473;
 //BA.debugLineNum = 81854473;BA.debugLine="params.Put(\"position\", position)";
_params.Put((Object)("position"),(Object)(_position));
RDebugUtils.currentLine=81854474;
 //BA.debugLineNum = 81854474;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(_main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=81854475;
 //BA.debugLineNum = 81854475;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(_main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=81854476;
 //BA.debugLineNum = 81854476;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(_main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=81854477;
 //BA.debugLineNum = 81854477;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(_main._devicebrand /*String*/ ));
RDebugUtils.currentLine=81854478;
 //BA.debugLineNum = 81854478;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(_main._devicemodel /*String*/ ));
RDebugUtils.currentLine=81854479;
 //BA.debugLineNum = 81854479;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(_main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=81854480;
 //BA.debugLineNum = 81854480;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(_sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=81854481;
 //BA.debugLineNum = 81854481;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=81854482;
 //BA.debugLineNum = 81854482;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=81854484;
 //BA.debugLineNum = 81854484;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=81854485;
 //BA.debugLineNum = 81854485;BA.debugLine="Log(\"MakeTableMaps2\" & data)";
__c.LogImpl("681854485","MakeTableMaps2"+_data,0);
RDebugUtils.currentLine=81854486;
 //BA.debugLineNum = 81854486;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=81854487;
 //BA.debugLineNum = 81854487;BA.debugLine="End Sub";
return "";
}
public void  _insertupdatetablenoprogress(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _table,String _datares) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "insertupdatetablenoprogress", false))
	 {Debug.delegate(ba, "insertupdatetablenoprogress", new Object[] {_table,_datares}); return;}
ResumableSub_InsertUpdateTableNoProgress rsub = new ResumableSub_InsertUpdateTableNoProgress(this,__ref,_table,_datares);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertUpdateTableNoProgress extends BA.ResumableSub {
public ResumableSub_InsertUpdateTableNoProgress(xevolution.vrcg.devdemov2400.appfirstinstalldialog parent,xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _table,String _datares) {
this.parent = parent;
this.__ref = __ref;
this._table = _table;
this._datares = _datares;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref;
xevolution.vrcg.devdemov2400.appfirstinstalldialog parent;
String _table;
String _datares;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _status = 0;
anywheresoftware.b4a.objects.collections.List _rows = null;
String _stridlist = "";
anywheresoftware.b4a.objects.collections.List _idlist = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _mid = 0;
anywheresoftware.b4a.objects.collections.Map _mapping = null;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appfirstinstalldialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=82182145;
 //BA.debugLineNum = 82182145;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=82182146;
 //BA.debugLineNum = 82182146;BA.debugLine="parser.Initialize(datares)";
_parser.Initialize(_datares);
RDebugUtils.currentLine=82182147;
 //BA.debugLineNum = 82182147;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=82182149;
 //BA.debugLineNum = 82182149;BA.debugLine="Dim status As Int = root.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_root.Get((Object)("status"))));
RDebugUtils.currentLine=82182150;
 //BA.debugLineNum = 82182150;BA.debugLine="If (status = 1) Then";
if (true) break;

case 1:
//if
this.state = 16;
if ((_status==1)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=82182156;
 //BA.debugLineNum = 82182156;BA.debugLine="Dim rows As List = root.Get(\"data\")";
_rows = new anywheresoftware.b4a.objects.collections.List();
_rows = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=82182159;
 //BA.debugLineNum = 82182159;BA.debugLine="Dim strIDList As String = GetListMapsID(rows)";
_stridlist = __ref._getlistmapsid /*String*/ (null,_rows);
RDebugUtils.currentLine=82182160;
 //BA.debugLineNum = 82182160;BA.debugLine="Dim IDList As List = GetAllExistingRecords(tabl";
_idlist = new anywheresoftware.b4a.objects.collections.List();
_idlist = __ref._getallexistingrecords /*anywheresoftware.b4a.objects.collections.List*/ (null,_table,_stridlist);
RDebugUtils.currentLine=82182162;
 //BA.debugLineNum = 82182162;BA.debugLine="DBUtils.InsertMaps2(Starter.LocalSQLEVC, table,";
parent._dbutils._insertmaps2 /*String*/ (ba,parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,_table,_rows,_idlist);
RDebugUtils.currentLine=82182163;
 //BA.debugLineNum = 82182163;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appfirstinstalldialog", "insertupdatetablenoprogress"),(int) (100));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=82182167;
 //BA.debugLineNum = 82182167;BA.debugLine="If (IDList.Size >=1) Then";
if (true) break;

case 4:
//if
this.state = 15;
if ((_idlist.getSize()>=1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=82182168;
 //BA.debugLineNum = 82182168;BA.debugLine="For i1 = 0 To rows.Size - 1";
if (true) break;

case 7:
//for
this.state = 14;
step12 = 1;
limit12 = (int) (_rows.getSize()-1);
_i1 = (int) (0) ;
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
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=82182169;
 //BA.debugLineNum = 82182169;BA.debugLine="Dim m As Map = rows.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rows.Get(_i1)));
RDebugUtils.currentLine=82182170;
 //BA.debugLineNum = 82182170;BA.debugLine="Dim mID As Int = m.Get(\"id\")";
_mid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=82182171;
 //BA.debugLineNum = 82182171;BA.debugLine="If (IDList.IndexOf(mID) >=0) Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((_idlist.IndexOf((Object)(_mid))>=0)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=82182172;
 //BA.debugLineNum = 82182172;BA.debugLine="Dim Mapping As Map";
_mapping = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=82182173;
 //BA.debugLineNum = 82182173;BA.debugLine="Mapping.Initialize";
_mapping.Initialize();
RDebugUtils.currentLine=82182174;
 //BA.debugLineNum = 82182174;BA.debugLine="Mapping.Put(\"id\", mID)";
_mapping.Put((Object)("id"),(Object)(_mid));
RDebugUtils.currentLine=82182176;
 //BA.debugLineNum = 82182176;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLEV";
parent._utils._updaterecord2withlog /*String*/ (ba,parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,_table,_m,_mapping,"","");
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
RDebugUtils.currentLine=82182182;
 //BA.debugLineNum = 82182182;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.List  _getallexistingrecords(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename,String _idlists) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "getallexistingrecords", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getallexistingrecords", new Object[] {_tablename,_idlists}));}
anywheresoftware.b4a.objects.collections.List _retlist = null;
String _ssql = "";
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _mid = 0;
RDebugUtils.currentLine=82247680;
 //BA.debugLineNum = 82247680;BA.debugLine="Sub GetAllExistingRecords(tablename As String, idL";
RDebugUtils.currentLine=82247681;
 //BA.debugLineNum = 82247681;BA.debugLine="Dim retList As List";
_retlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=82247682;
 //BA.debugLineNum = 82247682;BA.debugLine="retList.Initialize";
_retlist.Initialize();
RDebugUtils.currentLine=82247683;
 //BA.debugLineNum = 82247683;BA.debugLine="If (Utils.NNE(idLists)) Then";
if ((_utils._nne /*boolean*/ (ba,_idlists))) { 
RDebugUtils.currentLine=82247684;
 //BA.debugLineNum = 82247684;BA.debugLine="Dim sSQL As String = $\"Select id from ${tablenam";
_ssql = ("Select id from "+__c.SmartStringFormatter("",(Object)(_tablename))+" where id in "+__c.SmartStringFormatter("",(Object)(_idlists))+"");
RDebugUtils.currentLine=82247685;
 //BA.debugLineNum = 82247685;BA.debugLine="Private Row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=82247686;
 //BA.debugLineNum = 82247686;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=82247687;
 //BA.debugLineNum = 82247687;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=82247688;
 //BA.debugLineNum = 82247688;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=82247689;
 //BA.debugLineNum = 82247689;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit9 ;_row = _row + step9 ) {
RDebugUtils.currentLine=82247690;
 //BA.debugLineNum = 82247690;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=82247691;
 //BA.debugLineNum = 82247691;BA.debugLine="Dim mID As Int = Record.GetInt(\"id\")";
_mid = _record.GetInt("id");
RDebugUtils.currentLine=82247692;
 //BA.debugLineNum = 82247692;BA.debugLine="retList.Add(mID)";
_retlist.Add((Object)(_mid));
 }
};
 };
RDebugUtils.currentLine=82247695;
 //BA.debugLineNum = 82247695;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=82247697;
 //BA.debugLineNum = 82247697;BA.debugLine="Return retList";
if (true) return _retlist;
RDebugUtils.currentLine=82247698;
 //BA.debugLineNum = 82247698;BA.debugLine="End Sub";
return null;
}
public String  _getlistmapsid(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.objects.collections.List _innerlist) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "getlistmapsid", false))
	 {return ((String) Debug.delegate(ba, "getlistmapsid", new Object[] {_innerlist}));}
String _itemslist = "";
anywheresoftware.b4a.objects.collections.Map _row = null;
int _id = 0;
RDebugUtils.currentLine=82313216;
 //BA.debugLineNum = 82313216;BA.debugLine="Sub GetListMapsID(innerList As List) As String 'Li";
RDebugUtils.currentLine=82313219;
 //BA.debugLineNum = 82313219;BA.debugLine="Dim itemsList As String = \"\"";
_itemslist = "";
RDebugUtils.currentLine=82313220;
 //BA.debugLineNum = 82313220;BA.debugLine="For Each row As Map In innerList";
_row = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _innerlist;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
RDebugUtils.currentLine=82313221;
 //BA.debugLineNum = 82313221;BA.debugLine="Dim ID As Int = row.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_row.Get((Object)("id"))));
RDebugUtils.currentLine=82313222;
 //BA.debugLineNum = 82313222;BA.debugLine="If Utils.NNE(itemsList) Then";
if (_utils._nne /*boolean*/ (ba,_itemslist)) { 
RDebugUtils.currentLine=82313223;
 //BA.debugLineNum = 82313223;BA.debugLine="itemsList = $\"${itemsList},\"$";
_itemslist = (""+__c.SmartStringFormatter("",(Object)(_itemslist))+",");
 };
RDebugUtils.currentLine=82313225;
 //BA.debugLineNum = 82313225;BA.debugLine="itemsList = $\"${itemsList}${ID}\"$";
_itemslist = (""+__c.SmartStringFormatter("",(Object)(_itemslist))+""+__c.SmartStringFormatter("",(Object)(_id))+"");
 }
};
RDebugUtils.currentLine=82313229;
 //BA.debugLineNum = 82313229;BA.debugLine="If Utils.NNE(itemsList) Then";
if (_utils._nne /*boolean*/ (ba,_itemslist)) { 
RDebugUtils.currentLine=82313230;
 //BA.debugLineNum = 82313230;BA.debugLine="itemsList = $\"(${itemsList})\"$";
_itemslist = ("("+__c.SmartStringFormatter("",(Object)(_itemslist))+")");
 };
RDebugUtils.currentLine=82313233;
 //BA.debugLineNum = 82313233;BA.debugLine="Return itemsList 'retList";
if (true) return _itemslist;
RDebugUtils.currentLine=82313234;
 //BA.debugLineNum = 82313234;BA.debugLine="End Sub";
return "";
}
public String  _maketablemaps2(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,String _tablename) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "maketablemaps2", false))
	 {return ((String) Debug.delegate(ba, "maketablemaps2", new Object[] {_tablename}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
RDebugUtils.currentLine=81920000;
 //BA.debugLineNum = 81920000;BA.debugLine="Sub MakeTableMaps2(tablename As String) As String";
RDebugUtils.currentLine=81920001;
 //BA.debugLineNum = 81920001;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=81920002;
 //BA.debugLineNum = 81920002;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=81920003;
 //BA.debugLineNum = 81920003;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=81920004;
 //BA.debugLineNum = 81920004;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(_sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=81920005;
 //BA.debugLineNum = 81920005;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(_sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=81920006;
 //BA.debugLineNum = 81920006;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(_sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=81920007;
 //BA.debugLineNum = 81920007;BA.debugLine="params.Put(\"_team\", ShareCode.SESS_User)";
_params.Put((Object)("_team"),(Object)(_sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=81920008;
 //BA.debugLineNum = 81920008;BA.debugLine="params.Put(\"table\", tablename)";
_params.Put((Object)("table"),(Object)(_tablename));
RDebugUtils.currentLine=81920010;
 //BA.debugLineNum = 81920010;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(_main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=81920011;
 //BA.debugLineNum = 81920011;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(_main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=81920012;
 //BA.debugLineNum = 81920012;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(_main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=81920013;
 //BA.debugLineNum = 81920013;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(_main._devicebrand /*String*/ ));
RDebugUtils.currentLine=81920014;
 //BA.debugLineNum = 81920014;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(_main._devicemodel /*String*/ ));
RDebugUtils.currentLine=81920015;
 //BA.debugLineNum = 81920015;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(_main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=81920016;
 //BA.debugLineNum = 81920016;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(_sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=81920017;
 //BA.debugLineNum = 81920017;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=81920018;
 //BA.debugLineNum = 81920018;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=81920020;
 //BA.debugLineNum = 81920020;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=81920021;
 //BA.debugLineNum = 81920021;BA.debugLine="Log(\"MakeTableMaps2\" & data)";
__c.LogImpl("681920021","MakeTableMaps2"+_data,0);
RDebugUtils.currentLine=81920022;
 //BA.debugLineNum = 81920022;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=81920023;
 //BA.debugLineNum = 81920023;BA.debugLine="End Sub";
return "";
}
public String  _initialize(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=80871424;
 //BA.debugLineNum = 80871424;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=80871425;
 //BA.debugLineNum = 80871425;BA.debugLine="CURRENT_COUNTER = 0";
__ref._current_counter /*int*/  = (int) (0);
RDebugUtils.currentLine=80871426;
 //BA.debugLineNum = 80871426;BA.debugLine="END_COUNTER = 0";
__ref._end_counter /*int*/  = (int) (0);
RDebugUtils.currentLine=80871427;
 //BA.debugLineNum = 80871427;BA.debugLine="FILES_IN_FTP = 0";
__ref._files_in_ftp /*int*/  = (int) (0);
RDebugUtils.currentLine=80871429;
 //BA.debugLineNum = 80871429;BA.debugLine="End Sub";
return "";
}
public String  _timecheck_tick(xevolution.vrcg.devdemov2400.appfirstinstalldialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appfirstinstalldialog";
if (Debug.shouldDelegate(ba, "timecheck_tick", false))
	 {return ((String) Debug.delegate(ba, "timecheck_tick", null));}
RDebugUtils.currentLine=82575360;
 //BA.debugLineNum = 82575360;BA.debugLine="Sub TimeCheck_Tick";
RDebugUtils.currentLine=82575362;
 //BA.debugLineNum = 82575362;BA.debugLine="thisTimerCounter = thisTimerCounter + 1";
__ref._thistimercounter /*int*/  = (int) (__ref._thistimercounter /*int*/ +1);
RDebugUtils.currentLine=82575363;
 //BA.debugLineNum = 82575363;BA.debugLine="If thisTimerCounter = 5 Then";
if (__ref._thistimercounter /*int*/ ==5) { 
RDebugUtils.currentLine=82575364;
 //BA.debugLineNum = 82575364;BA.debugLine="thisTimer.Enabled = False";
__ref._thistimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=82575365;
 //BA.debugLineNum = 82575365;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
__ref._current_counter /*int*/  = __ref._end_counter /*int*/ ;
RDebugUtils.currentLine=82575366;
 //BA.debugLineNum = 82575366;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
 };
RDebugUtils.currentLine=82575368;
 //BA.debugLineNum = 82575368;BA.debugLine="End Sub";
return "";
}
}