package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appdialogs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.appdialogs");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.appdialogs.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogfirstname = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialoglastname = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogage = null;
public Object _currentactivityobject = null;
public int _currentposition = 0;
public anywheresoftware.b4a.objects.collections.List _currentimagesview = null;
public String _currentselectedcode = "";
public String _selectedobjecttypetagcode = "";
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqentity = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqtyperequest = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqstartdate = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqenddate = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqchecklist = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _appldialog = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogquantityvalue = null;
public int _returnquantityvalue = 0;
public anywheresoftware.b4a.objects.ActivityWrapper _thisactivity = null;
public Object _thisactivityname = null;
public xevolution.vrcg.devdemov2400.types._requestdata _thisrequestdata = null;
public anywheresoftware.b4a.objects.collections.List _adps = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreqenddate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreqstartdate = null;
public boolean _lgo_passwordmode = false;
public anywheresoftware.b4a.objects.ButtonWrapper _mainbutloginconfig = null;
public anywheresoftware.b4a.objects.EditTextWrapper _maineditloginuser = null;
public anywheresoftware.b4a.objects.EditTextWrapper _maineditloginpassword = null;
public anywheresoftware.b4a.objects.ButtonWrapper _mainbutloginshowpassword = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _mainloginreminder = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqtype = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqreason = null;
public anywheresoftware.b4a.objects.EditTextWrapper _maineditloginpasswordconfirm = null;
public String _currenttagcode = "";
public String _mastertagcode = "";
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _currentcld = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsubtitle = null;
public b4a.example3.customlistview _clvdialog = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvehiclename = null;
public b4a.example3.customlistview _vidialog = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqperiodtype = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqtypeentity = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqname = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqaddress = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqregion = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _dialogreqwithrequests = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqlocal = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqstatus = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqtypeobject = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogaddresstype = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogaddressname = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogaddressname2 = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogaddresscity = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogaddresspostalcode = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogaddresslatitude = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogaddresslongitude = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogcontacttype = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogcontactname = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogcontacttitle = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogcontactemail = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogcontactphone = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogpropertyvalue = null;
public anywheresoftware.b4a.objects.LabelWrapper _dialogpropertytitle = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _configeditversion = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _configeditinstance = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _configeditauth = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqzone = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogrequpdated = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreqendtime = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreqstarttime = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqstarttime = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqendtime = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqtime = null;
public anywheresoftware.b4a.objects.LabelWrapper _dialogdevicephone = null;
public anywheresoftware.b4a.objects.LabelWrapper _dialogdevicedimension = null;
public anywheresoftware.b4a.objects.LabelWrapper _dialogdevicedescription = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _configeditorientation = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _intputtextfield = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _selectorientation = null;
public b4a.example3.customlistview _listitemslist = null;
public b4a.example3.customlistview _listitemslistchk = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdesc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butresetapplication = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _showimageview = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqroute = null;
public anywheresoftware.b4a.objects.LabelWrapper _leftpreviewimage = null;
public anywheresoftware.b4a.objects.LabelWrapper _rightpreviewimage = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouptitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllinedata = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllineheader = null;
public Object _hiddenlistitemlabel = null;
public xevolution.vrcg.devdemov2400.types._taglisttype _hiddenlistitemtaglist = null;
public b4a.example3.customlistview _paramitemslist = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _butparamitem = null;
public xevolution.vrcg.devdemov2400.types._taglisttype _thistagitem = null;
public anywheresoftware.b4a.objects.LabelWrapper _thisstartdate = null;
public anywheresoftware.b4a.objects.EditTextWrapper _checkvalueedit = null;
public anywheresoftware.b4a.objects.ButtonWrapper _validationbutton = null;
public anywheresoftware.b4a.objects.LabelWrapper _resultdatalabel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_09 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_08 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_07 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_06 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_05 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_04 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_03 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_02 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _robut_01 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editparamitem = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pushrequestedit = null;
public b4a.example3.customlistview _listitemsrequest = null;
public int _lastindexlist = 0;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tbsingular = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tbplural = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tbactive = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tbinactive = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tb001 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tb002 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tb003 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tb004 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tb005 = null;
public b4a.example3.customlistview _claobjectlist = null;
public anywheresoftware.b4a.objects.ButtonWrapper _cancelselectobjectbutton = null;
public anywheresoftware.b4a.objects.EditTextWrapper _claobjectdesc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _suggestobjectbutton = null;
public anywheresoftware.b4a.objects.ButtonWrapper _claobjectfind = null;
public anywheresoftware.b4a.objects.ButtonWrapper _claobjectclear = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _claobjectgroupspinner = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _claobjecttypespinner = null;
public anywheresoftware.b4a.objects.ButtonWrapper _createobjectconfirmbutton = null;
public anywheresoftware.b4a.objects.ButtonWrapper _createobjectcancelbutton = null;
public b4a.example3.customlistview _objecttypelistview = null;
public anywheresoftware.b4a.objects.PanelWrapper _selectobjectpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _objecttypepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _createobjectpanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgroupobjecttitle = null;
public int _objectslistindex = 0;
public anywheresoftware.b4a.objects.collections.List _obj_types = null;
public anywheresoftware.b4a.objects.collections.List _obj_groups = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewbluetoothdevices = null;
public b4a.example.bt_printer _printer = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public Object _currentprinterconnected = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonassociated = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonscanprinter = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonprint = null;
public String _printermessage = "";
public anywheresoftware.b4a.objects.LabelWrapper _dialogdeviceversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _filterlabeltipointervencao = null;
public anywheresoftware.b4a.objects.LabelWrapper _filterlabelentidade = null;
public anywheresoftware.b4a.objects.LabelWrapper _filterlabelestadosintervencao = null;
public anywheresoftware.b4a.objects.LabelWrapper _filterlabeldatainicio = null;
public anywheresoftware.b4a.objects.LabelWrapper _filterlabeldatafim = null;
public anywheresoftware.b4a.objects.LabelWrapper _filterlabeltipochecklist = null;
public anywheresoftware.b4a.objects.LabelWrapper _filterlabelrota = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqcause = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqdatermj = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqtimermj = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreqdatermj = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreqtimermj = null;
public de.amberhome.objects.appcompat.ACEditTextWrapper _textormj = null;
public anywheresoftware.b4a.objects.PanelWrapper _painel_historico_rmj = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqreasonrmj = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqcausermj = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextjustificacaormj = null;
public anywheresoftware.b4a.objects.EditTextWrapper _boxeditfulltext = null;
public anywheresoftware.b4a.objects.EditTextWrapper _boxeditsearchedvalue = null;
public String _passscript = "";
public anywheresoftware.b4a.objects.collections.Map _maplist = null;
public String _searchdummy = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnuserfilter = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsearchchoosenitem = null;
public b4a.example3.customlistview _lista2search = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2search1 = null;
public anywheresoftware.b4a.objects.ActivityWrapper _passedact = null;
public int _startingrow = 0;
public int _nextstartingrow = 0;
public int _readrows = 0;
public b4a.example3.customlistview _listaoutros = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextoutros = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitleoutros = null;
public anywheresoftware.b4a.objects.ButtonWrapper _sync_manual_btn_edate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _sync_manual_btn_idate = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk10 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk11 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk12 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk2 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk3 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk4 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk5 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk6 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk7 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk8 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk9 = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _sync_manual_edate = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _sync_manual_idate = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _sync_manual_radio_diaria = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _sync_manual_radio_seleccao = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _sync_manual_radio_todos = null;
public anywheresoftware.b4a.objects.LabelWrapper _sync_manual_warning = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_chk_docs_templates = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _boxeditnumbertext = null;
public anywheresoftware.b4a.objects.EditTextWrapper _boxeditnumbertextedit = null;
public boolean _datavazia = false;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_downloadrunfirstintall = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _sync_manual_runfirstintall = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmestres = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _sync_manual_radio_mestres = null;
public anywheresoftware.b4a.objects.LabelWrapper _disclaimermestres = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_syncmanual_upload = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_syncmanual_download = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_upload_syncmanual = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_download_syncmanual = null;
public b4a.example3.customlistview _lstofflinedata = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkreqoffline = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtreqoffline = null;
public anywheresoftware.b4a.objects.ActivityWrapper _curractiv = null;
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
public String  _initialize(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=71499776;
 //BA.debugLineNum = 71499776;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=71499780;
 //BA.debugLineNum = 71499780;BA.debugLine="ThisStartDate.Initialize(\"\")";
__ref._thisstartdate /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=71499781;
 //BA.debugLineNum = 71499781;BA.debugLine="End Sub";
return "";
}
public void  _makeuseravailable(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "makeuseravailable", false))
	 {Debug.delegate(ba, "makeuseravailable", new Object[] {_activname}); return;}
ResumableSub_MakeUserAvailable rsub = new ResumableSub_MakeUserAvailable(this,__ref,_activname);
rsub.resume(ba, null);
}
public static class ResumableSub_MakeUserAvailable extends BA.ResumableSub {
public ResumableSub_MakeUserAvailable(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activname;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75956225;
 //BA.debugLineNum = 75956225;BA.debugLine="ProgressDialogShow(ShareCode.userAguardeumMomento";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence(parent._sharecode._useraguardeummomento /*String*/ ));
RDebugUtils.currentLine=75956227;
 //BA.debugLineNum = 75956227;BA.debugLine="Log(\"**********************************\")";
parent.__c.LogImpl("675956227","**********************************",0);
RDebugUtils.currentLine=75956228;
 //BA.debugLineNum = 75956228;BA.debugLine="Log(\"	GRAVA DISPONIBILIDADE\")";
parent.__c.LogImpl("675956228","	GRAVA DISPONIBILIDADE",0);
RDebugUtils.currentLine=75956229;
 //BA.debugLineNum = 75956229;BA.debugLine="Log(\"**********************************\")";
parent.__c.LogImpl("675956229","**********************************",0);
RDebugUtils.currentLine=75956230;
 //BA.debugLineNum = 75956230;BA.debugLine="ShareCode.USR_STATE =  1";
parent._sharecode._usr_state /*int*/  = (int) (1);
RDebugUtils.currentLine=75956231;
 //BA.debugLineNum = 75956231;BA.debugLine="DBStructures.updateUserAvailableState(ShareCode.S";
parent._dbstructures._updateuseravailablestate /*String*/ (ba,parent._sharecode._sess_oper_user /*String*/ ,parent._sharecode._usr_state /*int*/ );
RDebugUtils.currentLine=75956233;
 //BA.debugLineNum = 75956233;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=75956234;
 //BA.debugLineNum = 75956234;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=75956235;
 //BA.debugLineNum = 75956235;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=75956236;
 //BA.debugLineNum = 75956236;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=75956237;
 //BA.debugLineNum = 75956237;BA.debugLine="params.Put(\"_tagcode\", ShareCode.SESS_OPER_User)";
_params.Put((Object)("_tagcode"),(Object)(parent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=75956238;
 //BA.debugLineNum = 75956238;BA.debugLine="params.Put(\"_state\", 1)";
_params.Put((Object)("_state"),(Object)(1));
RDebugUtils.currentLine=75956239;
 //BA.debugLineNum = 75956239;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=75956240;
 //BA.debugLineNum = 75956240;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=75956241;
 //BA.debugLineNum = 75956241;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=75956242;
 //BA.debugLineNum = 75956242;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=75956243;
 //BA.debugLineNum = 75956243;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=75956244;
 //BA.debugLineNum = 75956244;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=75956245;
 //BA.debugLineNum = 75956245;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=75956246;
 //BA.debugLineNum = 75956246;BA.debugLine="Log(\"**********************************\")";
parent.__c.LogImpl("675956246","**********************************",0);
RDebugUtils.currentLine=75956247;
 //BA.debugLineNum = 75956247;BA.debugLine="Log(\"	CHAMA API\")";
parent.__c.LogImpl("675956247","	CHAMA API",0);
RDebugUtils.currentLine=75956248;
 //BA.debugLineNum = 75956248;BA.debugLine="Log(\"**********************************\")";
parent.__c.LogImpl("675956248","**********************************",0);
RDebugUtils.currentLine=75956249;
 //BA.debugLineNum = 75956249;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/mobile/user/unavailable");
RDebugUtils.currentLine=75956250;
 //BA.debugLineNum = 75956250;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=75956251;
 //BA.debugLineNum = 75956251;BA.debugLine="Utils.CallApi(0, params, activName, Url, \"Window";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,_activname,_url,"WindowStatusUpdate","");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=75956253;
 //BA.debugLineNum = 75956253;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (4),"","","");
RDebugUtils.currentLine=75956254;
 //BA.debugLineNum = 75956254;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=75956256;
 //BA.debugLineNum = 75956256;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "makeuseravailable"),(int) (250));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=75956258;
 //BA.debugLineNum = 75956258;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=75956259;
 //BA.debugLineNum = 75956259;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getdatainfodialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getdatainfodialog", false))
	 {Debug.delegate(ba, "getdatainfodialog", new Object[] {_activ}); return;}
ResumableSub_GetDataInfoDialog rsub = new ResumableSub_GetDataInfoDialog(this,__ref,_activ);
rsub.resume(ba, null);
}
public static class ResumableSub_GetDataInfoDialog extends BA.ResumableSub {
public ResumableSub_GetDataInfoDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72024066;
 //BA.debugLineNum = 72024066;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Informaç";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Informação de dados","Continuar","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=72024067;
 //BA.debugLineNum = 72024067;BA.debugLine="CurrentCLD = ApplDialog";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=72024068;
 //BA.debugLineNum = 72024068;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=72024069;
 //BA.debugLineNum = 72024069;BA.debugLine="ApplDialog.SetSize(80%x, 320dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (80),ba),parent.__c.DipToCurrent((int) (320)));
RDebugUtils.currentLine=72024071;
 //BA.debugLineNum = 72024071;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getdatainfodialog"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=72024072;
 //BA.debugLineNum = 72024072;BA.debugLine="DialogPanel.LoadLayout(\"dialog_datainfo\")";
_dialogpanel.LoadLayout("dialog_datainfo",ba);
RDebugUtils.currentLine=72024074;
 //BA.debugLineNum = 72024074;BA.debugLine="Wait For (sf) Dialog_Result(Res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getdatainfodialog"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=72024075;
 //BA.debugLineNum = 72024075;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
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
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=72024079;
 //BA.debugLineNum = 72024079;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getdeviceinfodialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._deviceinformation _curr) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getdeviceinfodialog", false))
	 {Debug.delegate(ba, "getdeviceinfodialog", new Object[] {_activ,_curr}); return;}
ResumableSub_GetDeviceInfoDialog rsub = new ResumableSub_GetDeviceInfoDialog(this,__ref,_activ,_curr);
rsub.resume(ba, null);
}
public static class ResumableSub_GetDeviceInfoDialog extends BA.ResumableSub {
public ResumableSub_GetDeviceInfoDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._deviceinformation _curr) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._deviceinformation _curr;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75038721;
 //BA.debugLineNum = 75038721;BA.debugLine="CurrentActivityObject = activ";
__ref._currentactivityobject /*Object*/  = _activ;
RDebugUtils.currentLine=75038722;
 //BA.debugLineNum = 75038722;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Informaç";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Informação do dispositivo","Continuar","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75038723;
 //BA.debugLineNum = 75038723;BA.debugLine="CurrentCLD = ApplDialog";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=75038725;
 //BA.debugLineNum = 75038725;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75038726;
 //BA.debugLineNum = 75038726;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=75038727;
 //BA.debugLineNum = 75038727;BA.debugLine="ApplDialog.SetSize(680dip, 420dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (680)),parent.__c.DipToCurrent((int) (420)));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=75038729;
 //BA.debugLineNum = 75038729;BA.debugLine="ApplDialog.SetSize(95%x, 65%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (65),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75038732;
 //BA.debugLineNum = 75038732;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getdeviceinfodialog"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75038733;
 //BA.debugLineNum = 75038733;BA.debugLine="pnl.LoadLayout(\"dialog_deviceInfo_2\")";
_pnl.LoadLayout("dialog_deviceInfo_2",ba);
RDebugUtils.currentLine=75038734;
 //BA.debugLineNum = 75038734;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(butResetA";
parent._utils._setviewbackgroundcolortomaincolor /*String*/ (ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._butresetapplication /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject())));
RDebugUtils.currentLine=75038736;
 //BA.debugLineNum = 75038736;BA.debugLine="DialogDeviceDescription.Text = ShareCode.APP_Inst";
__ref._dialogdevicedescription /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._app_instance /*String*/ ));
RDebugUtils.currentLine=75038737;
 //BA.debugLineNum = 75038737;BA.debugLine="DialogDeviceDimension.Text = ShareCode.APP_Author";
__ref._dialogdevicedimension /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=75038738;
 //BA.debugLineNum = 75038738;BA.debugLine="If (curr.HavePhone) Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((_curr.HavePhone /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=75038739;
 //BA.debugLineNum = 75038739;BA.debugLine="DialogDevicePhone.Text = \"Sim\"";
__ref._dialogdevicephone /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Sim"));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=75038741;
 //BA.debugLineNum = 75038741;BA.debugLine="DialogDevicePhone.Text = \"Não\"";
__ref._dialogdevicephone /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Não"));
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=75038744;
 //BA.debugLineNum = 75038744;BA.debugLine="DialogDeviceVersion.Text = $\"${Main.AppBuildVersi";
__ref._dialogdeviceversion /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(parent._main._appbuildversion /*String*/ ))+", ("+parent.__c.SmartStringFormatter("",(Object)(parent._main._appbuildversiondate /*String*/ ))+")")));
RDebugUtils.currentLine=75038745;
 //BA.debugLineNum = 75038745;BA.debugLine="SelectOrientation.Add(\"Orientação Landscape\")";
__ref._selectorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Orientação Landscape");
RDebugUtils.currentLine=75038746;
 //BA.debugLineNum = 75038746;BA.debugLine="SelectOrientation.Add(\"Orientação Portrait\")";
__ref._selectorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Orientação Portrait");
RDebugUtils.currentLine=75038747;
 //BA.debugLineNum = 75038747;BA.debugLine="SelectOrientation.SelectedIndex = ShareCode.DEVIC";
__ref._selectorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(parent._sharecode._device_orientation /*int*/ );
RDebugUtils.currentLine=75038748;
 //BA.debugLineNum = 75038748;BA.debugLine="SelectOrientation.Enabled = False";
__ref._selectorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=75038758;
 //BA.debugLineNum = 75038758;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getdeviceparamsdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getdeviceparamsdialog", false))
	 {Debug.delegate(ba, "getdeviceparamsdialog", new Object[] {_activ,_activname,_title}); return;}
ResumableSub_getDeviceParamsDialog rsub = new ResumableSub_getDeviceParamsDialog(this,__ref,_activ,_activname,_title);
rsub.resume(ba, null);
}
public static class ResumableSub_getDeviceParamsDialog extends BA.ResumableSub {
public ResumableSub_getDeviceParamsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _items = null;
String _ssql = "";
int _height = 0;
int _row = 0;
int _value_state = 0;
int _state_in = 0;
String _value = "";
String _tagcode = "";
int _active = 0;
int _res = 0;
int step23;
int limit23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72351745;
 //BA.debugLineNum = 72351745;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=72351746;
 //BA.debugLineNum = 72351746;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=72351747;
 //BA.debugLineNum = 72351747;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Continuar","","Aplicar a todos",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=72351748;
 //BA.debugLineNum = 72351748;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=72351749;
 //BA.debugLineNum = 72351749;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=72351750;
 //BA.debugLineNum = 72351750;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=72351752;
 //BA.debugLineNum = 72351752;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (95),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=72351755;
 //BA.debugLineNum = 72351755;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=72351757;
 //BA.debugLineNum = 72351757;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getdeviceparamsdialog"), null);
this.state = 35;
return;
case 35:
//C
this.state = 7;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=72351758;
 //BA.debugLineNum = 72351758;BA.debugLine="DialogPanel.LoadLayout(\"param_item_list\")";
_dialogpanel.LoadLayout("param_item_list",ba);
RDebugUtils.currentLine=72351761;
 //BA.debugLineNum = 72351761;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._generalloadingmessage /*String*/ ),parent.__c.True);
RDebugUtils.currentLine=72351762;
 //BA.debugLineNum = 72351762;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getdeviceparamsdialog"),(int) (100));
this.state = 36;
return;
case 36:
//C
this.state = 7;
;
RDebugUtils.currentLine=72351764;
 //BA.debugLineNum = 72351764;BA.debugLine="Dim items As Cursor";
_items = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=72351765;
 //BA.debugLineNum = 72351765;BA.debugLine="Dim sSQL As String = $\"select id, tagcode, title,";
_ssql = ("select id, tagcode, title, value_state, value, active, state_in from dta_device_params order by title");
RDebugUtils.currentLine=72351767;
 //BA.debugLineNum = 72351767;BA.debugLine="Dim height As Int = 60dip";
_height = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=72351768;
 //BA.debugLineNum = 72351768;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=72351769;
 //BA.debugLineNum = 72351769;BA.debugLine="height = 85dip";
_height = parent.__c.DipToCurrent((int) (85));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=72351773;
 //BA.debugLineNum = 72351773;BA.debugLine="items = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_items = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=72351774;
 //BA.debugLineNum = 72351774;BA.debugLine="If items.RowCount > 0 Then";
if (true) break;

case 11:
//if
this.state = 28;
if (_items.getRowCount()>0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=72351775;
 //BA.debugLineNum = 72351775;BA.debugLine="For Row = 0 To items.RowCount-1";
if (true) break;

case 14:
//for
this.state = 27;
step23 = 1;
limit23 = (int) (_items.getRowCount()-1);
_row = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 27;
if ((step23 > 0 && _row <= limit23) || (step23 < 0 && _row >= limit23)) this.state = 16;
if (true) break;

case 38:
//C
this.state = 37;
_row = ((int)(0 + _row + step23)) ;
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=72351776;
 //BA.debugLineNum = 72351776;BA.debugLine="items.Position = Row";
_items.setPosition(_row);
RDebugUtils.currentLine=72351777;
 //BA.debugLineNum = 72351777;BA.debugLine="Dim title As String = items.GetString(\"title\")";
_title = _items.GetString("title");
RDebugUtils.currentLine=72351778;
 //BA.debugLineNum = 72351778;BA.debugLine="Dim value_state As Int = items.GetInt(\"value_st";
_value_state = _items.GetInt("value_state");
RDebugUtils.currentLine=72351779;
 //BA.debugLineNum = 72351779;BA.debugLine="Dim state_in As Int = items.GetInt(\"state_in\")";
_state_in = _items.GetInt("state_in");
RDebugUtils.currentLine=72351780;
 //BA.debugLineNum = 72351780;BA.debugLine="Dim VALUE As String = items.GetString(\"value\")";
_value = _items.GetString("value");
RDebugUtils.currentLine=72351781;
 //BA.debugLineNum = 72351781;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcod";
_tagcode = _items.GetString("tagcode");
RDebugUtils.currentLine=72351782;
 //BA.debugLineNum = 72351782;BA.debugLine="Dim active As Int = items.GetInt(\"active\")";
_active = _items.GetInt("active");
RDebugUtils.currentLine=72351783;
 //BA.debugLineNum = 72351783;BA.debugLine="If (active = 1) Then";
if (true) break;

case 17:
//if
this.state = 26;
if ((_active==1)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=72351784;
 //BA.debugLineNum = 72351784;BA.debugLine="If (Utils.NNE(VALUE)) Then";
if (true) break;

case 20:
//if
this.state = 25;
if ((parent._utils._nne /*boolean*/ (ba,_value))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=72351785;
 //BA.debugLineNum = 72351785;BA.debugLine="ParamItemsList.Add( createParamLineItemEdit(a";
__ref._paramitemslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createparamlineitemedit /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_tagcode,_title,_value_state,_value,_state_in,parent.__c.DipToCurrent((int) (60)),_dialogpanel.getWidth()).getObject())),(Object)(""));
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=72351787;
 //BA.debugLineNum = 72351787;BA.debugLine="ParamItemsList.Add( createParamLineItem(activ";
__ref._paramitemslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createparamlineitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_tagcode,_title,_value_state,_value,_state_in,parent.__c.DipToCurrent((int) (60)),_dialogpanel.getWidth()).getObject())),(Object)(""));
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=72351792;
 //BA.debugLineNum = 72351792;BA.debugLine="items.Close";
_items.Close();
RDebugUtils.currentLine=72351795;
 //BA.debugLineNum = 72351795;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=72351797;
 //BA.debugLineNum = 72351797;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getdeviceparamsdialog"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 29;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=72351798;
 //BA.debugLineNum = 72351798;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 29:
//if
this.state = 34;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 31;
}else 
{RDebugUtils.currentLine=72351800;
 //BA.debugLineNum = 72351800;BA.debugLine="Else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 33;
}}
if (true) break;

case 31:
//C
this.state = 34;
RDebugUtils.currentLine=72351799;
 //BA.debugLineNum = 72351799;BA.debugLine="updateAllFlags";
__ref._updateallflags /*String*/ (null);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=72351801;
 //BA.debugLineNum = 72351801;BA.debugLine="updateAllFlags";
__ref._updateallflags /*String*/ (null);
RDebugUtils.currentLine=72351802;
 //BA.debugLineNum = 72351802;BA.debugLine="updatedeAllFlagsServer";
__ref._updatedeallflagsserver /*void*/ (null);
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=72351804;
 //BA.debugLineNum = 72351804;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getpushrequestcode(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname,String _objname,String _title) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getpushrequestcode", false))
	 {Debug.delegate(ba, "getpushrequestcode", new Object[] {_activname,_objname,_title}); return;}
ResumableSub_getPushRequestCode rsub = new ResumableSub_getPushRequestCode(this,__ref,_activname,_objname,_title);
rsub.resume(ba, null);
}
public static class ResumableSub_getPushRequestCode extends BA.ResumableSub {
public ResumableSub_getPushRequestCode(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname,String _objname,String _title) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._objname = _objname;
this._title = _title;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activname;
String _objname;
String _title;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _res = 0;
String _ss = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=71565313;
 //BA.debugLineNum = 71565313;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=71565314;
 //BA.debugLineNum = 71565314;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Continuar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.True);
RDebugUtils.currentLine=71565315;
 //BA.debugLineNum = 71565315;BA.debugLine="CurrentCLD = ApplDialog";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=71565316;
 //BA.debugLineNum = 71565316;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=71565317;
 //BA.debugLineNum = 71565317;BA.debugLine="ApplDialog.SetSize(60%x, 200dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (60),ba),parent.__c.DipToCurrent((int) (200)));
RDebugUtils.currentLine=71565319;
 //BA.debugLineNum = 71565319;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getpushrequestcode"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=71565320;
 //BA.debugLineNum = 71565320;BA.debugLine="DialogPanel.LoadLayout(\"dialog_getvalue\")";
_dialogpanel.LoadLayout("dialog_getvalue",ba);
RDebugUtils.currentLine=71565322;
 //BA.debugLineNum = 71565322;BA.debugLine="Wait For (sf) Dialog_Result(Res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getpushrequestcode"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=71565323;
 //BA.debugLineNum = 71565323;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=71565324;
 //BA.debugLineNum = 71565324;BA.debugLine="If Utils.NNE(PushRequestEdit.Text) Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._utils._nne /*boolean*/ (ba,__ref._pushrequestedit /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=71565325;
 //BA.debugLineNum = 71565325;BA.debugLine="Dim ss As String = PushRequestEdit.Text";
_ss = __ref._pushrequestedit /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=71565327;
 //BA.debugLineNum = 71565327;BA.debugLine="CallSub3(MainMenu, \"ReturnFromPushRequest\", 1,";
parent.__c.CallSubDebug3(ba,(Object)(parent._mainmenu.getObject()),"ReturnFromPushRequest",(Object)(1),(Object)(_ss));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=71565330;
 //BA.debugLineNum = 71565330;BA.debugLine="CallSub3(MainMenu, \"ReturnFromPushRequest\", 0,";
parent.__c.CallSubDebug3(ba,(Object)(parent._mainmenu.getObject()),"ReturnFromPushRequest",(Object)(0),(Object)(""));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=71565334;
 //BA.debugLineNum = 71565334;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getsyncmanual(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,int _tipodialogo) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getsyncmanual", false))
	 {Debug.delegate(ba, "getsyncmanual", new Object[] {_activ,_tipodialogo}); return;}
ResumableSub_getSyncManual rsub = new ResumableSub_getSyncManual(this,__ref,_activ,_tipodialogo);
rsub.resume(ba, null);
}
public static class ResumableSub_getSyncManual extends BA.ResumableSub {
public ResumableSub_getSyncManual(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,int _tipodialogo) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._tipodialogo = _tipodialogo;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
int _tipodialogo;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _reclocaloffline = null;
String _requesttc = "";
int _res = 0;
int _a = 0;
anywheresoftware.b4a.objects.PanelWrapper _poff = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk = null;
anywheresoftware.b4a.objects.EditTextWrapper _tc = null;
String _updfile = "";
int step33;
int limit33;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=77135874;
 //BA.debugLineNum = 77135874;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Sincroni";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Sincronização manual","Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=77135877;
 //BA.debugLineNum = 77135877;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=77135879;
 //BA.debugLineNum = 77135879;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getsyncmanual"), _sf);
this.state = 93;
return;
case 93:
//C
this.state = 1;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=77135880;
 //BA.debugLineNum = 77135880;BA.debugLine="pnl.LoadLayout(\"dialog_sync_manual\")";
_pnl.LoadLayout("dialog_sync_manual",ba);
RDebugUtils.currentLine=77135881;
 //BA.debugLineNum = 77135881;BA.debugLine="btn_Upload_SyncManual.Color = Colors.LightGray";
__ref._btn_upload_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(parent.__c.Colors.LightGray);
RDebugUtils.currentLine=77135882;
 //BA.debugLineNum = 77135882;BA.debugLine="btn_Download_SyncManual.Color = Consts.ColorMain";
__ref._btn_download_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(parent._consts._colormain /*int*/ );
RDebugUtils.currentLine=77135884;
 //BA.debugLineNum = 77135884;BA.debugLine="Dim sSQL As String = $\"select distinct up_tagcode";
_ssql = ("select distinct up_tagcode from loc_updatesrever where up_state=0");
RDebugUtils.currentLine=77135885;
 //BA.debugLineNum = 77135885;BA.debugLine="Dim RecLocalOffline As ResultSet = Starter.LocalS";
_reclocaloffline = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_reclocaloffline = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=77135887;
 //BA.debugLineNum = 77135887;BA.debugLine="lstOfflineData.Clear";
__ref._lstofflinedata /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=77135888;
 //BA.debugLineNum = 77135888;BA.debugLine="If RecLocalOffline.RowCount <= 0 Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_reclocaloffline.getRowCount()<=0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 14;
RDebugUtils.currentLine=77135889;
 //BA.debugLineNum = 77135889;BA.debugLine="btn_Upload_SyncManual.Enabled = False";
__ref._btn_upload_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=77135890;
 //BA.debugLineNum = 77135890;BA.debugLine="ShareCode.TCF = \"\"";
parent._sharecode._tcf /*String*/  = "";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=77135892;
 //BA.debugLineNum = 77135892;BA.debugLine="btn_Upload_SyncManual.Enabled = True";
__ref._btn_upload_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=77135893;
 //BA.debugLineNum = 77135893;BA.debugLine="btn_Upload_SyncManual.Text = $\"Envio de dados OF";
__ref._btn_upload_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(("Envio de dados OFFLINE ("+parent.__c.SmartStringFormatter("",(Object)(_reclocaloffline.getRowCount()))+")")));
RDebugUtils.currentLine=77135895;
 //BA.debugLineNum = 77135895;BA.debugLine="Do While RecLocalOffline.NextRow";
if (true) break;

case 6:
//do while
this.state = 13;
while (_reclocaloffline.NextRow()) {
this.state = 8;
if (true) break;
}
if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=77135896;
 //BA.debugLineNum = 77135896;BA.debugLine="Dim RequestTC As String = RecLocalOffline.GetSt";
_requesttc = _reclocaloffline.GetString("up_tagcode").trim();
RDebugUtils.currentLine=77135897;
 //BA.debugLineNum = 77135897;BA.debugLine="If Utils.NNE(RequestTC) Then";
if (true) break;

case 9:
//if
this.state = 12;
if (parent._utils._nne /*boolean*/ (ba,_requesttc)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=77135898;
 //BA.debugLineNum = 77135898;BA.debugLine="lstOfflineData.Add(CreatelstOfflineData(Reques";
__ref._lstofflinedata /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createlstofflinedata /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_requesttc,parent.__c.True,parent.__c.DipToCurrent((int) (50))).getObject())),(Object)(_requesttc));
 if (true) break;

case 12:
//C
this.state = 6;
;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=77135904;
 //BA.debugLineNum = 77135904;BA.debugLine="btn_Upload_SyncManual.Enabled = False ' xxx - Ret";
__ref._btn_upload_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=77135908;
 //BA.debugLineNum = 77135908;BA.debugLine="sync_manual_warning.Text = $\"ATENÇÃO !!${CRLF}A s";
__ref._sync_manual_warning /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(("ATENÇÃO !!"+parent.__c.SmartStringFormatter("",(Object)(parent.__c.CRLF))+"A selecção de um periodo muito alargado irá causar um tempo de espera e um consumo de dados maior.")));
RDebugUtils.currentLine=77135909;
 //BA.debugLineNum = 77135909;BA.debugLine="sync_manual_idate.Text = Utils.GetCurrentDate";
__ref._sync_manual_idate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent._utils._getcurrentdate /*String*/ (ba)));
RDebugUtils.currentLine=77135910;
 //BA.debugLineNum = 77135910;BA.debugLine="sync_manual_edate.Text = Utils.GetCurrentDate";
__ref._sync_manual_edate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent._utils._getcurrentdate /*String*/ (ba)));
RDebugUtils.currentLine=77135912;
 //BA.debugLineNum = 77135912;BA.debugLine="sync_manual_Radio_diaria.Checked = True";
__ref._sync_manual_radio_diaria /*anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper*/ .setChecked(parent.__c.True);
RDebugUtils.currentLine=77135913;
 //BA.debugLineNum = 77135913;BA.debugLine="sync_manual_Radio_diaria_CheckedChange(True)";
__ref._sync_manual_radio_diaria_checkedchange /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=77135915;
 //BA.debugLineNum = 77135915;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getsyncmanual"), _sf);
this.state = 94;
return;
case 94:
//C
this.state = 15;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=77135916;
 //BA.debugLineNum = 77135916;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 15:
//if
this.state = 92;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 17;
}else {
this.state = 91;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=77135918;
 //BA.debugLineNum = 77135918;BA.debugLine="If lstOfflineData.Size > 0 Then";
if (true) break;

case 18:
//if
this.state = 34;
if (__ref._lstofflinedata /*b4a.example3.customlistview*/ ._getsize()>0) { 
this.state = 20;
}else {
this.state = 33;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=77135919;
 //BA.debugLineNum = 77135919;BA.debugLine="ShareCode.TCF = \"\"";
parent._sharecode._tcf /*String*/  = "";
RDebugUtils.currentLine=77135920;
 //BA.debugLineNum = 77135920;BA.debugLine="For a=0 To lstOfflineData.Size -1";
if (true) break;

case 21:
//for
this.state = 28;
step33 = 1;
limit33 = (int) (__ref._lstofflinedata /*b4a.example3.customlistview*/ ._getsize()-1);
_a = (int) (0) ;
this.state = 95;
if (true) break;

case 95:
//C
this.state = 28;
if ((step33 > 0 && _a <= limit33) || (step33 < 0 && _a >= limit33)) this.state = 23;
if (true) break;

case 96:
//C
this.state = 95;
_a = ((int)(0 + _a + step33)) ;
if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=77135921;
 //BA.debugLineNum = 77135921;BA.debugLine="Dim pOff As Panel = lstOfflineData.GetPanel(a)";
_poff = new anywheresoftware.b4a.objects.PanelWrapper();
_poff = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._lstofflinedata /*b4a.example3.customlistview*/ ._getpanel(_a).getObject()));
RDebugUtils.currentLine=77135922;
 //BA.debugLineNum = 77135922;BA.debugLine="Dim Chk As CheckBox = pnl.GetView(0)";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_chk = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=77135923;
 //BA.debugLineNum = 77135923;BA.debugLine="Dim TC As EditText = pnl.GetView(1)";
_tc = new anywheresoftware.b4a.objects.EditTextWrapper();
_tc = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=77135924;
 //BA.debugLineNum = 77135924;BA.debugLine="If Chk.Checked Then";
if (true) break;

case 24:
//if
this.state = 27;
if (_chk.getChecked()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=77135925;
 //BA.debugLineNum = 77135925;BA.debugLine="ShareCode.TCF = ShareCode.TCF & $\"'${TC}',\"$";
parent._sharecode._tcf /*String*/  = parent._sharecode._tcf /*String*/ +("'"+parent.__c.SmartStringFormatter("",(Object)(_tc.getObject()))+"',");
 if (true) break;

case 27:
//C
this.state = 96;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=77135928;
 //BA.debugLineNum = 77135928;BA.debugLine="If ShareCode.TCF.EndsWith(\",\") Then";

case 28:
//if
this.state = 31;
if (parent._sharecode._tcf /*String*/ .endsWith(",")) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=77135929;
 //BA.debugLineNum = 77135929;BA.debugLine="ShareCode.TCF = ShareCode.TCF.SubString2(0,Sha";
parent._sharecode._tcf /*String*/  = parent._sharecode._tcf /*String*/ .substring((int) (0),(int) (parent._sharecode._tcf /*String*/ .length()-1));
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=77135932;
 //BA.debugLineNum = 77135932;BA.debugLine="ShareCode.TCF = \"\"";
parent._sharecode._tcf /*String*/  = "";
 if (true) break;
;
RDebugUtils.currentLine=77135936;
 //BA.debugLineNum = 77135936;BA.debugLine="If sync_manual_downloadrunfirstintall.Checked Th";

case 34:
//if
this.state = 89;
if (__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
this.state = 36;
}else 
{RDebugUtils.currentLine=77135959;
 //BA.debugLineNum = 77135959;BA.debugLine="else if sync_manual_runfirstintall.Checked Then";
if (__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
this.state = 59;
}else {
this.state = 82;
}}
if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=77135937;
 //BA.debugLineNum = 77135937;BA.debugLine="Starter.LocalSQLEVC.Close";
parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=77135938;
 //BA.debugLineNum = 77135938;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolution";
if (true) break;

case 37:
//if
this.state = 40;
if (parent.__c.File.Exists(parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3")) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=77135939;
 //BA.debugLineNum = 77135939;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionch";
parent.__c.File.Delete(parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=77135941;
 //BA.debugLineNum = 77135941;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getsyncmanual"),(int) (250));
this.state = 97;
return;
case 97:
//C
this.state = 41;
;
RDebugUtils.currentLine=77135943;
 //BA.debugLineNum = 77135943;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evolu";
if (true) break;

case 41:
//if
this.state = 44;
if (parent.__c.Not(parent.__c.File.Exists(parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3"))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=77135944;
 //BA.debugLineNum = 77135944;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\"";
parent.__c.File.Copy(parent.__c.File.getDirAssets(),"evolutioncheck.db3",parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=77135946;
 //BA.debugLineNum = 77135946;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getsyncmanual"),(int) (250));
this.state = 98;
return;
case 98:
//C
this.state = 45;
;
RDebugUtils.currentLine=77135948;
 //BA.debugLineNum = 77135948;BA.debugLine="If File.Exists(Starter.SharedFolder,\"logins.log";
if (true) break;

case 45:
//if
this.state = 52;
if (parent.__c.File.Exists(parent._starter._sharedfolder /*String*/ ,"logins.log")) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=77135949;
 //BA.debugLineNum = 77135949;BA.debugLine="File.Delete(Starter.SharedFolder,\"logins.log\")";
parent.__c.File.Delete(parent._starter._sharedfolder /*String*/ ,"logins.log");
RDebugUtils.currentLine=77135950;
 //BA.debugLineNum = 77135950;BA.debugLine="Dim updfile As String = $\"${ShareCode.SESS_OPE";
_updfile = (""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._sess_oper_user /*String*/ ))+"_upd.log");
RDebugUtils.currentLine=77135951;
 //BA.debugLineNum = 77135951;BA.debugLine="If File.Exists(Starter.InternalFolder,updfile)";
if (true) break;

case 48:
//if
this.state = 51;
if (parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,_updfile)) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=77135952;
 //BA.debugLineNum = 77135952;BA.debugLine="File.Delete(Starter.InternalFolder,updfile)";
parent.__c.File.Delete(parent._starter._internalfolder /*String*/ ,_updfile);
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
RDebugUtils.currentLine=77135956;
 //BA.debugLineNum = 77135956;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then";

case 52:
//if
this.state = 57;
if (parent.__c.Not(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized())) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Initialize(parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3",parent.__c.True);
if (true) break;

case 57:
//C
this.state = 89;
;
RDebugUtils.currentLine=77135957;
 //BA.debugLineNum = 77135957;BA.debugLine="CallSub2(MainMenu,\"Reinstallation\",True)";
parent.__c.CallSubDebug2(ba,(Object)(parent._mainmenu.getObject()),"Reinstallation",(Object)(parent.__c.True));
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=77135960;
 //BA.debugLineNum = 77135960;BA.debugLine="Starter.LocalSQLEVC.Close";
parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=77135961;
 //BA.debugLineNum = 77135961;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolution";
if (true) break;

case 60:
//if
this.state = 63;
if (parent.__c.File.Exists(parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3")) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=77135962;
 //BA.debugLineNum = 77135962;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionch";
parent.__c.File.Delete(parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=77135964;
 //BA.debugLineNum = 77135964;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getsyncmanual"),(int) (250));
this.state = 99;
return;
case 99:
//C
this.state = 64;
;
RDebugUtils.currentLine=77135966;
 //BA.debugLineNum = 77135966;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evolu";
if (true) break;

case 64:
//if
this.state = 67;
if (parent.__c.Not(parent.__c.File.Exists(parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3"))) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=77135967;
 //BA.debugLineNum = 77135967;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\"";
parent.__c.File.Copy(parent.__c.File.getDirAssets(),"evolutioncheck.db3",parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 67:
//C
this.state = 68;
;
RDebugUtils.currentLine=77135969;
 //BA.debugLineNum = 77135969;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getsyncmanual"),(int) (250));
this.state = 100;
return;
case 100:
//C
this.state = 68;
;
RDebugUtils.currentLine=77135971;
 //BA.debugLineNum = 77135971;BA.debugLine="If File.Exists(Starter.SharedFolder,\"logins.log";
if (true) break;

case 68:
//if
this.state = 75;
if (parent.__c.File.Exists(parent._starter._sharedfolder /*String*/ ,"logins.log")) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=77135972;
 //BA.debugLineNum = 77135972;BA.debugLine="File.Delete(Starter.SharedFolder,\"logins.log\")";
parent.__c.File.Delete(parent._starter._sharedfolder /*String*/ ,"logins.log");
RDebugUtils.currentLine=77135973;
 //BA.debugLineNum = 77135973;BA.debugLine="Dim updfile As String = $\"${ShareCode.SESS_OPE";
_updfile = (""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._sess_oper_user /*String*/ ))+"_upd.log");
RDebugUtils.currentLine=77135974;
 //BA.debugLineNum = 77135974;BA.debugLine="If File.Exists(Starter.InternalFolder,updfile)";
if (true) break;

case 71:
//if
this.state = 74;
if (parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,_updfile)) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=77135975;
 //BA.debugLineNum = 77135975;BA.debugLine="File.Delete(Starter.InternalFolder,updfile)";
parent.__c.File.Delete(parent._starter._internalfolder /*String*/ ,_updfile);
 if (true) break;

case 74:
//C
this.state = 75;
;
 if (true) break;
;
RDebugUtils.currentLine=77135979;
 //BA.debugLineNum = 77135979;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then";

case 75:
//if
this.state = 80;
if (parent.__c.Not(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized())) { 
this.state = 77;
;}if (true) break;

case 77:
//C
this.state = 80;
parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Initialize(parent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3",parent.__c.True);
if (true) break;

case 80:
//C
this.state = 89;
;
RDebugUtils.currentLine=77135980;
 //BA.debugLineNum = 77135980;BA.debugLine="CallSub2(MainMenu,\"Reinstallation\", False)";
parent.__c.CallSubDebug2(ba,(Object)(parent._mainmenu.getObject()),"Reinstallation",(Object)(parent.__c.False));
 if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=77135982;
 //BA.debugLineNum = 77135982;BA.debugLine="ShareCode.SyncManualComponents.Clear";
parent._sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=77135983;
 //BA.debugLineNum = 77135983;BA.debugLine="SetChecksSyncManual";
__ref._setcheckssyncmanual /*String*/ (null);
RDebugUtils.currentLine=77135984;
 //BA.debugLineNum = 77135984;BA.debugLine="ShareCode.SyncManualDates = $\"${sync_manual_ida";
parent._sharecode._syncmanualdates /*String*/  = (""+parent.__c.SmartStringFormatter("",(Object)(__ref._sync_manual_idate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()))+"|"+parent.__c.SmartStringFormatter("",(Object)(__ref._sync_manual_edate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()))+"");
RDebugUtils.currentLine=77135986;
 //BA.debugLineNum = 77135986;BA.debugLine="If sync_manual_chk_docs_templates.Checked Then";
if (true) break;

case 83:
//if
this.state = 88;
if (__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
this.state = 85;
}else {
this.state = 87;
}if (true) break;

case 85:
//C
this.state = 88;
RDebugUtils.currentLine=77135987;
 //BA.debugLineNum = 77135987;BA.debugLine="ShareCode.DownloadDocsFromFTP = True";
parent._sharecode._downloaddocsfromftp /*boolean*/  = parent.__c.True;
 if (true) break;

case 87:
//C
this.state = 88;
RDebugUtils.currentLine=77135989;
 //BA.debugLineNum = 77135989;BA.debugLine="ShareCode.DownloadDocsFromFTP = False";
parent._sharecode._downloaddocsfromftp /*boolean*/  = parent.__c.False;
 if (true) break;

case 88:
//C
this.state = 89;
;
RDebugUtils.currentLine=77135992;
 //BA.debugLineNum = 77135992;BA.debugLine="CallSub3(MainMenu,\"RunSyncManual\",ShareCode.Syn";
parent.__c.CallSubDebug3(ba,(Object)(parent._mainmenu.getObject()),"RunSyncManual",(Object)(parent._sharecode._syncmanualdates /*String*/ ),(Object)(parent.__c.True));
 if (true) break;

case 89:
//C
this.state = 92;
;
 if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=77135996;
 //BA.debugLineNum = 77135996;BA.debugLine="Log(res)";
parent.__c.LogImpl("677135996",BA.NumberToString(_res),0);
 if (true) break;

case 92:
//C
this.state = -1;
;
RDebugUtils.currentLine=77135998;
 //BA.debugLineNum = 77135998;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrequestselectdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,int _local) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getrequestselectdialog", false))
	 {Debug.delegate(ba, "getrequestselectdialog", new Object[] {_activ,_activname,_title,_local}); return;}
ResumableSub_getRequestSelectDialog rsub = new ResumableSub_getRequestSelectDialog(this,__ref,_activ,_activname,_title,_local);
rsub.resume(ba, null);
}
public static class ResumableSub_getRequestSelectDialog extends BA.ResumableSub {
public ResumableSub_getRequestSelectDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,int _local) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._local = _local;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
int _local;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
String _ssql = "";
String _techuser = "";
String _routefilter = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _items = null;
int _row = 0;
int _res = 0;
int step29;
int limit29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=71630849;
 //BA.debugLineNum = 71630849;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=71630850;
 //BA.debugLineNum = 71630850;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=71630851;
 //BA.debugLineNum = 71630851;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=71630852;
 //BA.debugLineNum = 71630852;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=71630853;
 //BA.debugLineNum = 71630853;BA.debugLine="ApplDialog.SetSize(70%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (70),ba),parent.__c.PerYToCurrent((float) (90),ba));
RDebugUtils.currentLine=71630854;
 //BA.debugLineNum = 71630854;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=71630856;
 //BA.debugLineNum = 71630856;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getrequestselectdialog"), null);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=71630857;
 //BA.debugLineNum = 71630857;BA.debugLine="DialogPanel.LoadLayout(\"request_item_list\") 'List";
_dialogpanel.LoadLayout("request_item_list",ba);
RDebugUtils.currentLine=71630858;
 //BA.debugLineNum = 71630858;BA.debugLine="LastIndexList = 0";
__ref._lastindexlist /*int*/  = (int) (0);
RDebugUtils.currentLine=71630860;
 //BA.debugLineNum = 71630860;BA.debugLine="ShareCode.SESS_UserTeam = DBStructures.SetUserTea";
parent._sharecode._sess_userteam /*String*/  = parent._dbstructures._setuserteamdate /*String*/ (ba,parent._sharecode._sess_user /*String*/ ,parent._sharecode._appdate_startrange /*String*/ ,parent._sharecode._appdate_endrange /*String*/ );
RDebugUtils.currentLine=71630861;
 //BA.debugLineNum = 71630861;BA.debugLine="ShareCode.SESS_UserRoute = DBStructures.SetUserRo";
parent._sharecode._sess_userroute /*String*/  = parent._dbstructures._setuserroutedate /*String*/ (ba,parent._sharecode._sess_user /*String*/ ,parent._sharecode._appdate_startrange /*String*/ ,parent._sharecode._appdate_endrange /*String*/ );
RDebugUtils.currentLine=71630863;
 //BA.debugLineNum = 71630863;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETREQU";
_ssql = parent._dbstructures._evc_sql_getrequests_data_new /*String*/ ;
RDebugUtils.currentLine=71630864;
 //BA.debugLineNum = 71630864;BA.debugLine="Dim TechUser As String = \"\"";
_techuser = "";
RDebugUtils.currentLine=71630865;
 //BA.debugLineNum = 71630865;BA.debugLine="Dim RouteFilter As String = \"\"";
_routefilter = "";
RDebugUtils.currentLine=71630867;
 //BA.debugLineNum = 71630867;BA.debugLine="If (Utils.NNE(ShareCode.SESS_UserRoute)) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._utils._nne /*boolean*/ (ba,parent._sharecode._sess_userroute /*String*/ ))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=71630868;
 //BA.debugLineNum = 71630868;BA.debugLine="RouteFilter = $\" and (a.route_tagcode not in (${";
_routefilter = (" and (a.route_tagcode not in ("+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._sess_userroute /*String*/ ))+")) ");
 if (true) break;
;
RDebugUtils.currentLine=71630870;
 //BA.debugLineNum = 71630870;BA.debugLine="If Utils.NNE(ShareCode.SESS_UserTeam) Then";

case 4:
//if
this.state = 9;
if (parent._utils._nne /*boolean*/ (ba,parent._sharecode._sess_userteam /*String*/ )) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=71630871;
 //BA.debugLineNum = 71630871;BA.debugLine="TechUser = $\" and (((a.technical_tagcode<>'${Sha";
_techuser = (" and (((a.technical_tagcode<>'"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._sess_user /*String*/ ))+"') and (a.team_tagcode not in ("+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._sess_userteam /*String*/ ))+"))) "+parent.__c.SmartStringFormatter("",(Object)(_routefilter))+")");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=71630873;
 //BA.debugLineNum = 71630873;BA.debugLine="TechUser = $\" and ((a.technical_tagcode<>'${Shar";
_techuser = (" and ((a.technical_tagcode<>'"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._sess_user /*String*/ ))+"') "+parent.__c.SmartStringFormatter("",(Object)(_routefilter))+") ");
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=71630875;
 //BA.debugLineNum = 71630875;BA.debugLine="RouteFilter = Utils.IfNotNullOrEmpty(RouteFilter,";
_routefilter = parent._utils._ifnotnullorempty /*String*/ (ba,_routefilter,"");
RDebugUtils.currentLine=71630877;
 //BA.debugLineNum = 71630877;BA.debugLine="sSQL = $\"${sSQL} ${TechUser} ${RouteFilter} 				a";
_ssql = (""+parent.__c.SmartStringFormatter("",(Object)(_ssql))+" "+parent.__c.SmartStringFormatter("",(Object)(_techuser))+" "+parent.__c.SmartStringFormatter("",(Object)(_routefilter))+"\n"+"				and ((a.execdate_type>=1) or ((a.execdate_type=0) \n"+"				and (a.execute_date>='"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appdate_startrange /*String*/ ))+"') \n"+"				and (a.execute_date<='"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appdate_endrange /*String*/ ))+"'))) \n"+"				order by a.execute_date, a.execute_start");
RDebugUtils.currentLine=71630883;
 //BA.debugLineNum = 71630883;BA.debugLine="Log(\"««««««««««««««««««««««««««««««««««««« ------";
parent.__c.LogImpl("671630883","««««««««««««««««««««««««««««««««««««« ------------ »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»",0);
RDebugUtils.currentLine=71630884;
 //BA.debugLineNum = 71630884;BA.debugLine="Log(sSQL)";
parent.__c.LogImpl("671630884",_ssql,0);
RDebugUtils.currentLine=71630886;
 //BA.debugLineNum = 71630886;BA.debugLine="Dim items As Cursor = Starter.LocalSQLEVC.ExecQue";
_items = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_items = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=71630887;
 //BA.debugLineNum = 71630887;BA.debugLine="If items.RowCount > 0 Then";
if (true) break;

case 10:
//if
this.state = 17;
if (_items.getRowCount()>0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=71630888;
 //BA.debugLineNum = 71630888;BA.debugLine="For Row = 0 To items.RowCount-1";
if (true) break;

case 13:
//for
this.state = 16;
step29 = 1;
limit29 = (int) (_items.getRowCount()-1);
_row = (int) (0) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 16;
if ((step29 > 0 && _row <= limit29) || (step29 < 0 && _row >= limit29)) this.state = 15;
if (true) break;

case 24:
//C
this.state = 23;
_row = ((int)(0 + _row + step29)) ;
if (true) break;

case 15:
//C
this.state = 24;
RDebugUtils.currentLine=71630889;
 //BA.debugLineNum = 71630889;BA.debugLine="items.Position = Row";
_items.setPosition(_row);
RDebugUtils.currentLine=71630890;
 //BA.debugLineNum = 71630890;BA.debugLine="ListItemsRequest.Add(createRequestLineItemDetai";
__ref._listitemsrequest /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createrequestlineitemdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_items,parent.__c.DipToCurrent((int) (45))).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=71630893;
 //BA.debugLineNum = 71630893;BA.debugLine="items.Close";
_items.Close();
RDebugUtils.currentLine=71630894;
 //BA.debugLineNum = 71630894;BA.debugLine="HiddenListItemLabel = \"\"";
__ref._hiddenlistitemlabel /*Object*/  = (Object)("");
RDebugUtils.currentLine=71630895;
 //BA.debugLineNum = 71630895;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.POSITIVE).setEnabled(parent.__c.False);
RDebugUtils.currentLine=71630897;
 //BA.debugLineNum = 71630897;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getrequestselectdialog"), _sf);
this.state = 25;
return;
case 25:
//C
this.state = 18;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=71630898;
 //BA.debugLineNum = 71630898;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=71630899;
 //BA.debugLineNum = 71630899;BA.debugLine="CallSub3(MainMenu, \"ReturnFromPushRequestSelect\"";
parent.__c.CallSubDebug3(ba,(Object)(parent._mainmenu.getObject()),"ReturnFromPushRequestSelect",(Object)(1),__ref._hiddenlistitemlabel /*Object*/ );
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=71630901;
 //BA.debugLineNum = 71630901;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getboxeditfulltext(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this,String _title2show,String _txt2edit) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getboxeditfulltext", false))
	 {Debug.delegate(ba, "getboxeditfulltext", new Object[] {_activ,_this,_title2show,_txt2edit}); return;}
ResumableSub_getBoxEditFullText rsub = new ResumableSub_getBoxEditFullText(this,__ref,_activ,_this,_title2show,_txt2edit);
rsub.resume(ba, null);
}
public static class ResumableSub_getBoxEditFullText extends BA.ResumableSub {
public ResumableSub_getBoxEditFullText(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this,String _title2show,String _txt2edit) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._title2show = _title2show;
this._txt2edit = _txt2edit;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this;
String _title2show;
String _txt2edit;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=76480514;
 //BA.debugLineNum = 76480514;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sho";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title2show,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=76480516;
 //BA.debugLineNum = 76480516;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=76480517;
 //BA.debugLineNum = 76480517;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=76480518;
 //BA.debugLineNum = 76480518;BA.debugLine="ApplDialog.SetSize(60%x, 50%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (60),ba),parent.__c.PerYToCurrent((float) (50),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=76480520;
 //BA.debugLineNum = 76480520;BA.debugLine="ApplDialog.SetSize(90%x, 70%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (70),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=76480523;
 //BA.debugLineNum = 76480523;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditfulltext"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=76480524;
 //BA.debugLineNum = 76480524;BA.debugLine="pnl.LoadLayout(\"dialog_full_text\")";
_pnl.LoadLayout("dialog_full_text",ba);
RDebugUtils.currentLine=76480525;
 //BA.debugLineNum = 76480525;BA.debugLine="BoxEditFullText.Text=this.Text";
__ref._boxeditfulltext /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_this.getText()));
RDebugUtils.currentLine=76480526;
 //BA.debugLineNum = 76480526;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditfulltext"), _sf);
this.state = 14;
return;
case 14:
//C
this.state = 7;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=76480527;
 //BA.debugLineNum = 76480527;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=76480528;
 //BA.debugLineNum = 76480528;BA.debugLine="this.Text = BoxEditFullText.Text";
_this.setText((Object)(__ref._boxeditfulltext /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=76480529;
 //BA.debugLineNum = 76480529;BA.debugLine="CallSubDelayed2(activ, \"CLAItemEditValueReturnFr";
parent.__c.CallSubDelayed2(ba,_activ,"CLAItemEditValueReturnFromFloatEditBox",(Object)(_this));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=76480531;
 //BA.debugLineNum = 76480531;BA.debugLine="CallSubDelayed2(activ, \"CLAItemEditValueReturnFr";
parent.__c.CallSubDelayed2(ba,_activ,"CLAItemEditValueReturnFromFloatEditBoxCancel",(Object)(_this));
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=76480533;
 //BA.debugLineNum = 76480533;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getboxeditsearch(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this,String _inscript,String _title2show,anywheresoftware.b4a.objects.collections.Map _params,int _showothers) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getboxeditsearch", false))
	 {Debug.delegate(ba, "getboxeditsearch", new Object[] {_activ,_this,_inscript,_title2show,_params,_showothers}); return;}
ResumableSub_getBoxEditSearch rsub = new ResumableSub_getBoxEditSearch(this,__ref,_activ,_this,_inscript,_title2show,_params,_showothers);
rsub.resume(ba, null);
}
public static class ResumableSub_getBoxEditSearch extends BA.ResumableSub {
public ResumableSub_getBoxEditSearch(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this,String _inscript,String _title2show,anywheresoftware.b4a.objects.collections.Map _params,int _showothers) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._inscript = _inscript;
this._title2show = _title2show;
this._params = _params;
this._showothers = _showothers;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this;
String _inscript;
String _title2show;
anywheresoftware.b4a.objects.collections.Map _params;
int _showothers;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
String _inscriptwithlimit = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _tstfld = null;
anywheresoftware.b4a.objects.collections.List _listacampos = null;
int _i = 0;
String _colname = "";
String _sqlpesquisa = "";
int _d = 0;
String _lfd = "";
String _sqloper = "";
int _registos = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _records2search = null;
String _listline_key = "";
int _res = 0;
int step30;
int limit30;
int step37;
int limit37;
int step61;
int limit61;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=76546050;
 //BA.debugLineNum = 76546050;BA.debugLine="If Utils.Int2Bool(ShowOthers) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._utils._int2bool /*boolean*/ (ba,_showothers)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=76546051;
 //BA.debugLineNum = 76546051;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sh";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title2show,"Confirmar","Cancelar","Outros",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=76546053;
 //BA.debugLineNum = 76546053;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sh";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title2show,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=76546056;
 //BA.debugLineNum = 76546056;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=76546057;
 //BA.debugLineNum = 76546057;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=76546058;
 //BA.debugLineNum = 76546058;BA.debugLine="ApplDialog.SetSize(75%x, 80%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (75),ba),parent.__c.PerYToCurrent((float) (80),ba));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=76546060;
 //BA.debugLineNum = 76546060;BA.debugLine="ApplDialog.SetSize(90%x, 70%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (70),ba));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=76546063;
 //BA.debugLineNum = 76546063;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditsearch"), _sf);
this.state = 71;
return;
case 71:
//C
this.state = 13;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=76546065;
 //BA.debugLineNum = 76546065;BA.debugLine="pnl.LoadLayout(\"dialog_search_V2\")";
_pnl.LoadLayout("dialog_search_V2",ba);
RDebugUtils.currentLine=76546068;
 //BA.debugLineNum = 76546068;BA.debugLine="BoxEditSearchedValue.Text=this.Text";
__ref._boxeditsearchedvalue /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_this.getText()));
RDebugUtils.currentLine=76546069;
 //BA.debugLineNum = 76546069;BA.debugLine="Lista2Search.Clear";
__ref._lista2search /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=76546070;
 //BA.debugLineNum = 76546070;BA.debugLine="PassScript = InScript";
__ref._passscript /*String*/  = _inscript;
RDebugUtils.currentLine=76546071;
 //BA.debugLineNum = 76546071;BA.debugLine="PassedAct = activ";
__ref._passedact /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=76546073;
 //BA.debugLineNum = 76546073;BA.debugLine="StartingRow = 0";
__ref._startingrow /*int*/  = (int) (0);
RDebugUtils.currentLine=76546074;
 //BA.debugLineNum = 76546074;BA.debugLine="Dim InScriptwithLimit As String = \"\"";
_inscriptwithlimit = "";
RDebugUtils.currentLine=76546076;
 //BA.debugLineNum = 76546076;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*String*/ ),parent.__c.False);
RDebugUtils.currentLine=76546077;
 //BA.debugLineNum = 76546077;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditsearch"),(int) (100));
this.state = 72;
return;
case 72:
//C
this.state = 13;
;
RDebugUtils.currentLine=76546079;
 //BA.debugLineNum = 76546079;BA.debugLine="If ShareCode.SearchFromQuery Then";
if (true) break;

case 13:
//if
this.state = 40;
if (parent._sharecode._searchfromquery /*boolean*/ ) { 
this.state = 15;
}else {
this.state = 39;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=76546081;
 //BA.debugLineNum = 76546081;BA.debugLine="If PassScript.EndsWith(\";\") Then";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._passscript /*String*/ .endsWith(";")) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=76546082;
 //BA.debugLineNum = 76546082;BA.debugLine="PassScript = PassScript.SubString2(0,PassScript";
__ref._passscript /*String*/  = __ref._passscript /*String*/ .substring((int) (0),(int) (__ref._passscript /*String*/ .length()-1));
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=76546085;
 //BA.debugLineNum = 76546085;BA.debugLine="PassScript = $\"select TBL.* from (${PassScript})";
__ref._passscript /*String*/  = ("select TBL.* from ("+parent.__c.SmartStringFormatter("",(Object)(__ref._passscript /*String*/ ))+") as TBL where 1=1 ");
RDebugUtils.currentLine=76546087;
 //BA.debugLineNum = 76546087;BA.debugLine="Dim TstFld As ResultSet = Starter.LocalSQLEVC.Ex";
_tstfld = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_tstfld = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(__ref._passscript /*String*/ )));
RDebugUtils.currentLine=76546088;
 //BA.debugLineNum = 76546088;BA.debugLine="Dim ListaCampos As List";
_listacampos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=76546089;
 //BA.debugLineNum = 76546089;BA.debugLine="ListaCampos.Initialize";
_listacampos.Initialize();
RDebugUtils.currentLine=76546090;
 //BA.debugLineNum = 76546090;BA.debugLine="For i=0 To TstFld.ColumnCount - 1";
if (true) break;

case 20:
//for
this.state = 27;
step30 = 1;
limit30 = (int) (_tstfld.getColumnCount()-1);
_i = (int) (0) ;
this.state = 73;
if (true) break;

case 73:
//C
this.state = 27;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 22;
if (true) break;

case 74:
//C
this.state = 73;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=76546091;
 //BA.debugLineNum = 76546091;BA.debugLine="Dim ColName As String = TstFld.GetColumnName(i)";
_colname = _tstfld.GetColumnName(_i);
RDebugUtils.currentLine=76546092;
 //BA.debugLineNum = 76546092;BA.debugLine="If Not(ColName.ToLowerCase.Contains(\"tagcode\"))";
if (true) break;

case 23:
//if
this.state = 26;
if (parent.__c.Not(_colname.toLowerCase().contains("tagcode"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=76546093;
 //BA.debugLineNum = 76546093;BA.debugLine="ListaCampos.Add($\"TBL.${ColName}\"$)";
_listacampos.Add((Object)(("TBL."+parent.__c.SmartStringFormatter("",(Object)(_colname))+"")));
 if (true) break;

case 26:
//C
this.state = 74;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=76546097;
 //BA.debugLineNum = 76546097;BA.debugLine="Dim SqlPesquisa As String = \"\"";
_sqlpesquisa = "";
RDebugUtils.currentLine=76546098;
 //BA.debugLineNum = 76546098;BA.debugLine="For d=0 To ListaCampos.Size -1";
if (true) break;

case 28:
//for
this.state = 37;
step37 = 1;
limit37 = (int) (_listacampos.getSize()-1);
_d = (int) (0) ;
this.state = 75;
if (true) break;

case 75:
//C
this.state = 37;
if ((step37 > 0 && _d <= limit37) || (step37 < 0 && _d >= limit37)) this.state = 30;
if (true) break;

case 76:
//C
this.state = 75;
_d = ((int)(0 + _d + step37)) ;
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=76546099;
 //BA.debugLineNum = 76546099;BA.debugLine="Dim LFD As String = ListaCampos.Get(d)";
_lfd = BA.ObjectToString(_listacampos.Get(_d));
RDebugUtils.currentLine=76546100;
 //BA.debugLineNum = 76546100;BA.debugLine="If d=0 Then";
if (true) break;

case 31:
//if
this.state = 36;
if (_d==0) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
RDebugUtils.currentLine=76546101;
 //BA.debugLineNum = 76546101;BA.debugLine="Dim SqlOPer As String = \"and\"";
_sqloper = "and";
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=76546104;
 //BA.debugLineNum = 76546104;BA.debugLine="Dim SqlOPer As String = \"or\"";
_sqloper = "or";
 if (true) break;

case 36:
//C
this.state = 76;
;
RDebugUtils.currentLine=76546107;
 //BA.debugLineNum = 76546107;BA.debugLine="SqlPesquisa = SqlPesquisa & $\" ${SqlOPer} ${LFD";
_sqlpesquisa = _sqlpesquisa+(" "+parent.__c.SmartStringFormatter("",(Object)(_sqloper))+" "+parent.__c.SmartStringFormatter("",(Object)(_lfd))+" like '%"+parent.__c.SmartStringFormatter("",(Object)(__ref._boxeditsearchedvalue /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))+"%'");
 if (true) break;
if (true) break;

case 37:
//C
this.state = 40;
;
RDebugUtils.currentLine=76546110;
 //BA.debugLineNum = 76546110;BA.debugLine="InScript = PassScript & SqlPesquisa";
_inscript = __ref._passscript /*String*/ +_sqlpesquisa;
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=76546112;
 //BA.debugLineNum = 76546112;BA.debugLine="InScript = PassScript.Replace(\":__VALOR\",BoxEdit";
_inscript = __ref._passscript /*String*/ .replace(":__VALOR",__ref._boxeditsearchedvalue /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText());
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=76546115;
 //BA.debugLineNum = 76546115;BA.debugLine="ShareCode.CurrentSerchquery = InScript";
parent._sharecode._currentserchquery /*String*/  = _inscript;
RDebugUtils.currentLine=76546116;
 //BA.debugLineNum = 76546116;BA.debugLine="InScriptwithLimit = InScript & $\" limit 0, 25\"$";
_inscriptwithlimit = _inscript+(" limit 0, 25");
RDebugUtils.currentLine=76546117;
 //BA.debugLineNum = 76546117;BA.debugLine="Log(InScriptwithLimit)";
parent.__c.LogImpl("676546117",_inscriptwithlimit,0);
RDebugUtils.currentLine=76546119;
 //BA.debugLineNum = 76546119;BA.debugLine="Try";
if (true) break;

case 41:
//try
this.state = 58;
this.catchState = 57;
this.state = 43;
if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 57;
RDebugUtils.currentLine=76546120;
 //BA.debugLineNum = 76546120;BA.debugLine="Dim registos As Int = 0";
_registos = (int) (0);
RDebugUtils.currentLine=76546121;
 //BA.debugLineNum = 76546121;BA.debugLine="Private Records2Search As ResultSet = Starter.Lo";
_records2search = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_records2search = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_inscriptwithlimit)));
RDebugUtils.currentLine=76546122;
 //BA.debugLineNum = 76546122;BA.debugLine="Log(Records2Search.RowCount)";
parent.__c.LogImpl("676546122",BA.NumberToString(_records2search.getRowCount()),0);
RDebugUtils.currentLine=76546123;
 //BA.debugLineNum = 76546123;BA.debugLine="Dim ListLine_key As String = \"\"";
_listline_key = "";
RDebugUtils.currentLine=76546124;
 //BA.debugLineNum = 76546124;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*String*/ ),parent.__c.False);
RDebugUtils.currentLine=76546126;
 //BA.debugLineNum = 76546126;BA.debugLine="Lista2Search.Clear ' xxx - Para nao duplicar ite";
__ref._lista2search /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=76546128;
 //BA.debugLineNum = 76546128;BA.debugLine="Do While Records2Search.NextRow";
if (true) break;

case 44:
//do while
this.state = 55;
while (_records2search.NextRow()) {
this.state = 46;
if (true) break;
}
if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=76546129;
 //BA.debugLineNum = 76546129;BA.debugLine="For i=0 To Records2Search.ColumnCount -1";
if (true) break;

case 47:
//for
this.state = 54;
step61 = 1;
limit61 = (int) (_records2search.getColumnCount()-1);
_i = (int) (0) ;
this.state = 77;
if (true) break;

case 77:
//C
this.state = 54;
if ((step61 > 0 && _i <= limit61) || (step61 < 0 && _i >= limit61)) this.state = 49;
if (true) break;

case 78:
//C
this.state = 77;
_i = ((int)(0 + _i + step61)) ;
if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=76546130;
 //BA.debugLineNum = 76546130;BA.debugLine="If Records2Search.GetColumnName(i).ToLowerCase";
if (true) break;

case 50:
//if
this.state = 53;
if ((_records2search.GetColumnName(_i).toLowerCase()).equals("tagcode")) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=76546131;
 //BA.debugLineNum = 76546131;BA.debugLine="ListLine_key =  Records2Search.GetString(Reco";
_listline_key = _records2search.GetString(_records2search.GetColumnName(_i));
 if (true) break;

case 53:
//C
this.state = 78;
;
 if (true) break;
if (true) break;

case 54:
//C
this.state = 44;
;
RDebugUtils.currentLine=76546134;
 //BA.debugLineNum = 76546134;BA.debugLine="registos = registos +1";
_registos = (int) (_registos+1);
RDebugUtils.currentLine=76546135;
 //BA.debugLineNum = 76546135;BA.debugLine="Lista2Search.Add(createSearchLineDetail(activ,";
__ref._lista2search /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createsearchlinedetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_records2search,parent.__c.DipToCurrent((int) (50))).getObject())),(Object)(_listline_key));
 if (true) break;

case 55:
//C
this.state = 58;
;
RDebugUtils.currentLine=76546137;
 //BA.debugLineNum = 76546137;BA.debugLine="Records2Search.Close";
_records2search.Close();
 if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
RDebugUtils.currentLine=76546140;
 //BA.debugLineNum = 76546140;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("676546140",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 58:
//C
this.state = 59;
this.catchState = 0;
;
RDebugUtils.currentLine=76546142;
 //BA.debugLineNum = 76546142;BA.debugLine="Log($\"Encontrou ${registos} registos!\"$)";
parent.__c.LogImpl("676546142",("Encontrou "+parent.__c.SmartStringFormatter("",(Object)(_registos))+" registos!"),0);
RDebugUtils.currentLine=76546143;
 //BA.debugLineNum = 76546143;BA.debugLine="If registos <= 0 Then";
if (true) break;

case 59:
//if
this.state = 62;
if (_registos<=0) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=76546144;
 //BA.debugLineNum = 76546144;BA.debugLine="MsgboxAsync(\"Não existem registos para o criteri";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Não existem registos para o criterio definido !"),BA.ObjectToCharSequence(parent._sharecode._generalinfotitle /*String*/ ),ba);
RDebugUtils.currentLine=76546145;
 //BA.debugLineNum = 76546145;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=76546146;
 //BA.debugLineNum = 76546146;BA.debugLine="ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = \"\"";
parent._sharecode._item_returned_from_searchlist /*String*/  = "";
RDebugUtils.currentLine=76546147;
 //BA.debugLineNum = 76546147;BA.debugLine="ShareCode.TAG_RETURNED_FROM_SEARCHLIST = \"\"";
parent._sharecode._tag_returned_from_searchlist /*String*/  = "";
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=76546150;
 //BA.debugLineNum = 76546150;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=76546152;
 //BA.debugLineNum = 76546152;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditsearch"), _sf);
this.state = 79;
return;
case 79:
//C
this.state = 63;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=76546153;
 //BA.debugLineNum = 76546153;BA.debugLine="If res = DialogResponse.POSITIVE Then 'Confirmar";
if (true) break;

case 63:
//if
this.state = 70;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 65;
}else 
{RDebugUtils.currentLine=76546155;
 //BA.debugLineNum = 76546155;BA.debugLine="Else if res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 67;
}else {
this.state = 69;
}}
if (true) break;

case 65:
//C
this.state = 70;
RDebugUtils.currentLine=76546154;
 //BA.debugLineNum = 76546154;BA.debugLine="CallSubDelayed3(CheckList3, \"returnfromSearchDia";
parent.__c.CallSubDelayed3(ba,(Object)(parent._checklist3.getObject()),"returnfromSearchDialog",(Object)(_this),(Object)(_params));
 if (true) break;

case 67:
//C
this.state = 70;
RDebugUtils.currentLine=76546156;
 //BA.debugLineNum = 76546156;BA.debugLine="DialogoOutros(activ,this,params)";
__ref._dialogooutros /*void*/ (null,_activ,_this,_params);
 if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=76546158;
 //BA.debugLineNum = 76546158;BA.debugLine="ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = \"\"";
parent._sharecode._item_returned_from_searchlist /*String*/  = "";
RDebugUtils.currentLine=76546159;
 //BA.debugLineNum = 76546159;BA.debugLine="ShareCode.TAG_RETURNED_FROM_SEARCHLIST = \"\"";
parent._sharecode._tag_returned_from_searchlist /*String*/  = "";
 if (true) break;

case 70:
//C
this.state = -1;
;
RDebugUtils.currentLine=76546161;
 //BA.debugLineNum = 76546161;BA.debugLine="End Sub";
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
public void  _getshowimageviewlistdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname,anywheresoftware.b4a.objects.collections.List _images) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getshowimageviewlistdialog", false))
	 {Debug.delegate(ba, "getshowimageviewlistdialog", new Object[] {_activname,_images}); return;}
ResumableSub_getShowImageViewListDialog rsub = new ResumableSub_getShowImageViewListDialog(this,__ref,_activname,_images);
rsub.resume(ba, null);
}
public static class ResumableSub_getShowImageViewListDialog extends BA.ResumableSub {
public ResumableSub_getShowImageViewListDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname,anywheresoftware.b4a.objects.collections.List _images) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._images = _images;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activname;
anywheresoftware.b4a.objects.collections.List _images;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
boolean _continuedlg = false;
xevolution.vrcg.devdemov2400.types._imageviewdata _currentimage = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bg = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72941569;
 //BA.debugLineNum = 72941569;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=72941570;
 //BA.debugLineNum = 72941570;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Informaç";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Informação","Continuar","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=72941571;
 //BA.debugLineNum = 72941571;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=72941573;
 //BA.debugLineNum = 72941573;BA.debugLine="ApplDialog.SetSize(70%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (70),ba),parent.__c.PerYToCurrent((float) (90),ba));
RDebugUtils.currentLine=72941574;
 //BA.debugLineNum = 72941574;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=72941575;
 //BA.debugLineNum = 72941575;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getshowimageviewlistdialog"), null);
this.state = 16;
return;
case 16:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=72941576;
 //BA.debugLineNum = 72941576;BA.debugLine="DialogPanel.LoadLayout(\"dialog_ShowImageView\")";
_dialogpanel.LoadLayout("dialog_ShowImageView",ba);
RDebugUtils.currentLine=72941578;
 //BA.debugLineNum = 72941578;BA.debugLine="CurrentImagesView = images";
__ref._currentimagesview /*anywheresoftware.b4a.objects.collections.List*/  = _images;
RDebugUtils.currentLine=72941579;
 //BA.debugLineNum = 72941579;BA.debugLine="CurrentPosition = 0";
__ref._currentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=72941581;
 //BA.debugLineNum = 72941581;BA.debugLine="leftPreviewImage.Visible = (CurrentImagesView.Siz";
__ref._leftpreviewimage /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible((__ref._currentimagesview /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>1));
RDebugUtils.currentLine=72941582;
 //BA.debugLineNum = 72941582;BA.debugLine="rightPreviewImage.Visible = (CurrentImagesView.Si";
__ref._rightpreviewimage /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible((__ref._currentimagesview /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>1));
RDebugUtils.currentLine=72941584;
 //BA.debugLineNum = 72941584;BA.debugLine="Dim ContinueDlg As Boolean = True";
_continuedlg = parent.__c.True;
RDebugUtils.currentLine=72941585;
 //BA.debugLineNum = 72941585;BA.debugLine="Dim CurrentImage As ImageViewData = CurrentImages";
_currentimage = (xevolution.vrcg.devdemov2400.types._imageviewdata)(__ref._currentimagesview /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentposition /*int*/ ));
RDebugUtils.currentLine=72941587;
 //BA.debugLineNum = 72941587;BA.debugLine="Utils.SetDialogtitle(sf, CurrentImage.filename)";
parent._utils._setdialogtitle /*String*/ (ba,_sf,_currentimage.filename /*String*/ );
RDebugUtils.currentLine=72941589;
 //BA.debugLineNum = 72941589;BA.debugLine="If Utils.NNE(CurrentImage.b64) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._utils._nne /*boolean*/ (ba,_currentimage.b64 /*String*/ )) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=72941591;
 //BA.debugLineNum = 72941591;BA.debugLine="Else if Utils.NNE(CurrentImage.filename) Then";
if (parent._utils._nne /*boolean*/ (ba,_currentimage.filename /*String*/ )) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 8;
RDebugUtils.currentLine=72941590;
 //BA.debugLineNum = 72941590;BA.debugLine="ShowImageView.SetBackgroundImage(Utils.B64ToBitm";
__ref._showimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(parent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (ba,_currentimage.b64 /*String*/ ).getObject()));
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=72941592;
 //BA.debugLineNum = 72941592;BA.debugLine="Dim bg As Bitmap = LoadBitmapResize(Starter.Inte";
_bg = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bg = parent.__c.LoadBitmapResize(parent._starter._internalfolder /*String*/ ,_currentimage.filename /*String*/ ,parent.__c.DipToCurrent((int) (780)),parent.__c.DipToCurrent((int) (620)),parent.__c.True);
RDebugUtils.currentLine=72941593;
 //BA.debugLineNum = 72941593;BA.debugLine="ShowImageView.SetBackgroundImage(bg)";
__ref._showimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_bg.getObject()));
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=72941595;
 //BA.debugLineNum = 72941595;BA.debugLine="ContinueDlg = False";
_continuedlg = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=72941598;
 //BA.debugLineNum = 72941598;BA.debugLine="If ContinueDlg Then";

case 8:
//if
this.state = 15;
if (_continuedlg) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=72941599;
 //BA.debugLineNum = 72941599;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getshowimageviewlistdialog"), _sf);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=72941600;
 //BA.debugLineNum = 72941600;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=72941603;
 //BA.debugLineNum = 72941603;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getobjectselectdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,int _local) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getobjectselectdialog", false))
	 {Debug.delegate(ba, "getobjectselectdialog", new Object[] {_activ,_activname,_title,_local}); return;}
ResumableSub_getObjectSelectDialog rsub = new ResumableSub_getObjectSelectDialog(this,__ref,_activ,_activname,_title,_local);
rsub.resume(ba, null);
}
public static class ResumableSub_getObjectSelectDialog extends BA.ResumableSub {
public ResumableSub_getObjectSelectDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,int _local) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._local = _local;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
int _local;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _items = null;
String _ssql = "";
String _lastgroup = "";
int _row = 0;
String _object_type = "";
String _objecttype_desc = "";
String _title_import = "";
String _tagcode = "";
int _res = 0;
int step18;
int limit18;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=73203713;
 //BA.debugLineNum = 73203713;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=73203714;
 //BA.debugLineNum = 73203714;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=73203715;
 //BA.debugLineNum = 73203715;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=73203716;
 //BA.debugLineNum = 73203716;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=73203717;
 //BA.debugLineNum = 73203717;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=73203718;
 //BA.debugLineNum = 73203718;BA.debugLine="ApplDialog.SetSize(70%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (70),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=73203720;
 //BA.debugLineNum = 73203720;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (95),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=73203723;
 //BA.debugLineNum = 73203723;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=73203725;
 //BA.debugLineNum = 73203725;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getobjectselectdialog"), null);
this.state = 23;
return;
case 23:
//C
this.state = 7;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=73203726;
 //BA.debugLineNum = 73203726;BA.debugLine="DialogPanel.LoadLayout(\"task_item_detail_list\") '";
_dialogpanel.LoadLayout("task_item_detail_list",ba);
RDebugUtils.currentLine=73203728;
 //BA.debugLineNum = 73203728;BA.debugLine="Dim items As Cursor";
_items = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=73203729;
 //BA.debugLineNum = 73203729;BA.debugLine="Dim sSQL As String = $\"select a.id, a.tagcode, a.";
_ssql = ("select a.id, a.tagcode, a.object_type, a.title_import, a.`status`, ifnull(b.title, '') as objecttype_desc\n"+"				from dta_objects as a inner join dta_objecttypes as b on (b.tagcode=a.object_type)\n"+"				where a.active=1 and b.active=1 and a.`status`<=1 and a.tagcode<>'__NONE__' and a.title_import<>'Insira um descritivo/título'\n"+"				group by b.title, a.id, a.tagcode, a.object_type, a.title_import, a.`status`\n"+"				order by b.title, a.title_import");
RDebugUtils.currentLine=73203736;
 //BA.debugLineNum = 73203736;BA.debugLine="items = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_items = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=73203737;
 //BA.debugLineNum = 73203737;BA.debugLine="If items.RowCount > 0 Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_items.getRowCount()>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=73203738;
 //BA.debugLineNum = 73203738;BA.debugLine="Dim LastGroup As String = \"\"";
_lastgroup = "";
RDebugUtils.currentLine=73203739;
 //BA.debugLineNum = 73203739;BA.debugLine="For Row = 0 To items.RowCount-1";
if (true) break;

case 10:
//for
this.state = 17;
step18 = 1;
limit18 = (int) (_items.getRowCount()-1);
_row = (int) (0) ;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 17;
if ((step18 > 0 && _row <= limit18) || (step18 < 0 && _row >= limit18)) this.state = 12;
if (true) break;

case 25:
//C
this.state = 24;
_row = ((int)(0 + _row + step18)) ;
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=73203740;
 //BA.debugLineNum = 73203740;BA.debugLine="items.Position = Row";
_items.setPosition(_row);
RDebugUtils.currentLine=73203741;
 //BA.debugLineNum = 73203741;BA.debugLine="Dim object_type As String = items.GetString(\"ob";
_object_type = _items.GetString("object_type");
RDebugUtils.currentLine=73203742;
 //BA.debugLineNum = 73203742;BA.debugLine="Dim objecttype_desc As String = items.GetString";
_objecttype_desc = _items.GetString("objecttype_desc");
RDebugUtils.currentLine=73203743;
 //BA.debugLineNum = 73203743;BA.debugLine="Dim title_import As String = items.GetString(\"t";
_title_import = _items.GetString("title_import");
RDebugUtils.currentLine=73203744;
 //BA.debugLineNum = 73203744;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcod";
_tagcode = _items.GetString("tagcode");
RDebugUtils.currentLine=73203745;
 //BA.debugLineNum = 73203745;BA.debugLine="If (object_type.Trim <> LastGroup.Trim) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (((_object_type.trim()).equals(_lastgroup.trim()) == false)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=73203746;
 //BA.debugLineNum = 73203746;BA.debugLine="LastGroup = object_type";
_lastgroup = _object_type;
RDebugUtils.currentLine=73203747;
 //BA.debugLineNum = 73203747;BA.debugLine="ListItemsList.Add( createObjGroupLineItemDetai";
__ref._listitemslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createobjgrouplineitemdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_objecttype_desc,parent.__c.DipToCurrent((int) (45))).getObject())),(Object)(_object_type));
 if (true) break;

case 16:
//C
this.state = 25;
;
RDebugUtils.currentLine=73203749;
 //BA.debugLineNum = 73203749;BA.debugLine="ListItemsList.Add(createObjectLineItemDetail(ac";
__ref._listitemslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createobjectlineitemdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_tagcode,_title_import,_objecttype_desc,parent.__c.DipToCurrent((int) (45))).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=73203752;
 //BA.debugLineNum = 73203752;BA.debugLine="items.Close";
_items.Close();
RDebugUtils.currentLine=73203753;
 //BA.debugLineNum = 73203753;BA.debugLine="HiddenListItemLabel = \"\"";
__ref._hiddenlistitemlabel /*Object*/  = (Object)("");
RDebugUtils.currentLine=73203754;
 //BA.debugLineNum = 73203754;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.POSITIVE).setEnabled(parent.__c.False);
RDebugUtils.currentLine=73203756;
 //BA.debugLineNum = 73203756;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getobjectselectdialog"), _sf);
this.state = 26;
return;
case 26:
//C
this.state = 19;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=73203757;
 //BA.debugLineNum = 73203757;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=73203758;
 //BA.debugLineNum = 73203758;BA.debugLine="CallSub3(ThisActivityName, \"ObjectSelected\", Hid";
parent.__c.CallSubDebug3(ba,__ref._thisactivityname /*Object*/ ,"ObjectSelected",__ref._hiddenlistitemlabel /*Object*/ ,(Object)(_local));
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=73203760;
 //BA.debugLineNum = 73203760;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getshowimageviewdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname,String _title,String _b64image,String _filename) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getshowimageviewdialog", false))
	 {Debug.delegate(ba, "getshowimageviewdialog", new Object[] {_activname,_title,_b64image,_filename}); return;}
ResumableSub_getShowImageViewDialog rsub = new ResumableSub_getShowImageViewDialog(this,__ref,_activname,_title,_b64image,_filename);
rsub.resume(ba, null);
}
public static class ResumableSub_getShowImageViewDialog extends BA.ResumableSub {
public ResumableSub_getShowImageViewDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname,String _title,String _b64image,String _filename) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._title = _title;
this._b64image = _b64image;
this._filename = _filename;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activname;
String _title;
String _b64image;
String _filename;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
boolean _continuedlg = false;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bg = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72876033;
 //BA.debugLineNum = 72876033;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=72876034;
 //BA.debugLineNum = 72876034;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Continuar","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=72876035;
 //BA.debugLineNum = 72876035;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=72876036;
 //BA.debugLineNum = 72876036;BA.debugLine="ApplDialog.SetSize(780dip, 680dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (780)),parent.__c.DipToCurrent((int) (680)));
RDebugUtils.currentLine=72876037;
 //BA.debugLineNum = 72876037;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=72876038;
 //BA.debugLineNum = 72876038;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getshowimageviewdialog"), null);
this.state = 16;
return;
case 16:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=72876039;
 //BA.debugLineNum = 72876039;BA.debugLine="DialogPanel.LoadLayout(\"dialog_ShowImageView\")";
_dialogpanel.LoadLayout("dialog_ShowImageView",ba);
RDebugUtils.currentLine=72876041;
 //BA.debugLineNum = 72876041;BA.debugLine="Dim ContinueDlg As Boolean = True";
_continuedlg = parent.__c.True;
RDebugUtils.currentLine=72876042;
 //BA.debugLineNum = 72876042;BA.debugLine="If Utils.NNE(b64Image) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._utils._nne /*boolean*/ (ba,_b64image)) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=72876044;
 //BA.debugLineNum = 72876044;BA.debugLine="Else if Utils.NNE(filename) Then";
if (parent._utils._nne /*boolean*/ (ba,_filename)) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 8;
RDebugUtils.currentLine=72876043;
 //BA.debugLineNum = 72876043;BA.debugLine="ShowImageView.SetBackgroundImage(Utils.B64ToBitm";
__ref._showimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(parent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (ba,_b64image).getObject()));
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=72876045;
 //BA.debugLineNum = 72876045;BA.debugLine="Dim bg As Bitmap = LoadBitmapResize(Starter.Inte";
_bg = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bg = parent.__c.LoadBitmapResize(parent._starter._internalfolder /*String*/ ,_filename,parent.__c.DipToCurrent((int) (480)),parent.__c.DipToCurrent((int) (380)),parent.__c.True);
RDebugUtils.currentLine=72876046;
 //BA.debugLineNum = 72876046;BA.debugLine="ShowImageView.SetBackgroundImage(bg)";
__ref._showimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_bg.getObject()));
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=72876048;
 //BA.debugLineNum = 72876048;BA.debugLine="ContinueDlg = False";
_continuedlg = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=72876050;
 //BA.debugLineNum = 72876050;BA.debugLine="If ContinueDlg Then";

case 8:
//if
this.state = 15;
if (_continuedlg) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=72876051;
 //BA.debugLineNum = 72876051;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getshowimageviewdialog"), _sf);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=72876052;
 //BA.debugLineNum = 72876052;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=72876055;
 //BA.debugLineNum = 72876055;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btn_download_syncmanual_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "btn_download_syncmanual_click", false))
	 {return ((String) Debug.delegate(ba, "btn_download_syncmanual_click", null));}
RDebugUtils.currentLine=80674816;
 //BA.debugLineNum = 80674816;BA.debugLine="Private Sub btn_Download_SyncManual_Click";
RDebugUtils.currentLine=80674817;
 //BA.debugLineNum = 80674817;BA.debugLine="btn_Upload_SyncManual.Color = Colors.LightGray";
__ref._btn_upload_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=80674818;
 //BA.debugLineNum = 80674818;BA.debugLine="btn_Download_SyncManual.Color = Consts.ColorMain";
__ref._btn_download_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colormain /*int*/ );
RDebugUtils.currentLine=80674819;
 //BA.debugLineNum = 80674819;BA.debugLine="panel_SyncManual_Upload.Visible = False";
__ref._panel_syncmanual_upload /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=80674820;
 //BA.debugLineNum = 80674820;BA.debugLine="panel_SyncManual_Download.Visible = True";
__ref._panel_syncmanual_download /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=80674821;
 //BA.debugLineNum = 80674821;BA.debugLine="End Sub";
return "";
}
public String  _btn_upload_syncmanual_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "btn_upload_syncmanual_click", false))
	 {return ((String) Debug.delegate(ba, "btn_upload_syncmanual_click", null));}
RDebugUtils.currentLine=80609280;
 //BA.debugLineNum = 80609280;BA.debugLine="Private Sub btn_Upload_SyncManual_Click";
RDebugUtils.currentLine=80609281;
 //BA.debugLineNum = 80609281;BA.debugLine="btn_Upload_SyncManual.Color = Consts.ColorMain";
__ref._btn_upload_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colormain /*int*/ );
RDebugUtils.currentLine=80609282;
 //BA.debugLineNum = 80609282;BA.debugLine="btn_Download_SyncManual.Color = Colors.LightGray";
__ref._btn_download_syncmanual /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=80609283;
 //BA.debugLineNum = 80609283;BA.debugLine="panel_SyncManual_Upload.Visible = True";
__ref._panel_syncmanual_upload /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=80609284;
 //BA.debugLineNum = 80609284;BA.debugLine="panel_SyncManual_Download.Visible = False";
__ref._panel_syncmanual_download /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=80609286;
 //BA.debugLineNum = 80609286;BA.debugLine="End Sub";
return "";
}
public String  _btnuserfilter_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "btnuserfilter_click", false))
	 {return ((String) Debug.delegate(ba, "btnuserfilter_click", null));}
String _passscriptwithlimit = "";
String _passscriptwithlimitandfilter = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _tstfld = null;
anywheresoftware.b4a.objects.collections.List _listacampos = null;
int _i = 0;
String _colname = "";
String _sqlpesquisa = "";
int _d = 0;
String _lfd = "";
String _sqloper = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _records2search = null;
String _listline_key = "";
RDebugUtils.currentLine=76677120;
 //BA.debugLineNum = 76677120;BA.debugLine="Sub btnUserFilter_Click";
RDebugUtils.currentLine=76677122;
 //BA.debugLineNum = 76677122;BA.debugLine="Lista2Search.Clear";
__ref._lista2search /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=76677123;
 //BA.debugLineNum = 76677123;BA.debugLine="ShareCode.CurrentSerchquery = \"\"";
_sharecode._currentserchquery /*String*/  = "";
RDebugUtils.currentLine=76677124;
 //BA.debugLineNum = 76677124;BA.debugLine="Dim PassScriptwithLimit As String = \"\"";
_passscriptwithlimit = "";
RDebugUtils.currentLine=76677125;
 //BA.debugLineNum = 76677125;BA.debugLine="Dim PassScriptwithLimitAndFilter As String = \"\"";
_passscriptwithlimitandfilter = "";
RDebugUtils.currentLine=76677126;
 //BA.debugLineNum = 76677126;BA.debugLine="StartingRow = 0";
__ref._startingrow /*int*/  = (int) (0);
RDebugUtils.currentLine=76677128;
 //BA.debugLineNum = 76677128;BA.debugLine="If ShareCode.SearchFromQuery Then";
if (_sharecode._searchfromquery /*boolean*/ ) { 
RDebugUtils.currentLine=76677130;
 //BA.debugLineNum = 76677130;BA.debugLine="If PassScript.EndsWith(\";\") Then";
if (__ref._passscript /*String*/ .endsWith(";")) { 
RDebugUtils.currentLine=76677131;
 //BA.debugLineNum = 76677131;BA.debugLine="PassScript = PassScript.SubString2(0,PassScript";
__ref._passscript /*String*/  = __ref._passscript /*String*/ .substring((int) (0),(int) (__ref._passscript /*String*/ .length()-1));
 };
RDebugUtils.currentLine=76677134;
 //BA.debugLineNum = 76677134;BA.debugLine="PassScript = $\"select TBL.* from (${PassScript})";
__ref._passscript /*String*/  = ("select TBL.* from ("+__c.SmartStringFormatter("",(Object)(__ref._passscript /*String*/ ))+") as TBL where 1=1 ");
RDebugUtils.currentLine=76677136;
 //BA.debugLineNum = 76677136;BA.debugLine="Dim TstFld As ResultSet = Starter.LocalSQLEVC.Ex";
_tstfld = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_tstfld = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(__ref._passscript /*String*/ )));
RDebugUtils.currentLine=76677137;
 //BA.debugLineNum = 76677137;BA.debugLine="Dim ListaCampos As List";
_listacampos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=76677138;
 //BA.debugLineNum = 76677138;BA.debugLine="ListaCampos.Initialize";
_listacampos.Initialize();
RDebugUtils.currentLine=76677139;
 //BA.debugLineNum = 76677139;BA.debugLine="For i=0 To TstFld.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_tstfld.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=76677140;
 //BA.debugLineNum = 76677140;BA.debugLine="Dim ColName As String = TstFld.GetColumnName(i)";
_colname = _tstfld.GetColumnName(_i);
RDebugUtils.currentLine=76677141;
 //BA.debugLineNum = 76677141;BA.debugLine="If Not(ColName.ToLowerCase.Contains(\"tagcode\"))";
if (__c.Not(_colname.toLowerCase().contains("tagcode"))) { 
RDebugUtils.currentLine=76677142;
 //BA.debugLineNum = 76677142;BA.debugLine="ListaCampos.Add($\"TBL.${ColName}\"$)";
_listacampos.Add((Object)(("TBL."+__c.SmartStringFormatter("",(Object)(_colname))+"")));
 };
 }
};
RDebugUtils.currentLine=76677146;
 //BA.debugLineNum = 76677146;BA.debugLine="Dim SqlPesquisa As String = \"\"";
_sqlpesquisa = "";
RDebugUtils.currentLine=76677147;
 //BA.debugLineNum = 76677147;BA.debugLine="For d=0 To ListaCampos.Size -1";
{
final int step21 = 1;
final int limit21 = (int) (_listacampos.getSize()-1);
_d = (int) (0) ;
for (;_d <= limit21 ;_d = _d + step21 ) {
RDebugUtils.currentLine=76677148;
 //BA.debugLineNum = 76677148;BA.debugLine="Dim LFD As String = ListaCampos.Get(d)";
_lfd = BA.ObjectToString(_listacampos.Get(_d));
RDebugUtils.currentLine=76677149;
 //BA.debugLineNum = 76677149;BA.debugLine="If d=0 Then";
if (_d==0) { 
RDebugUtils.currentLine=76677150;
 //BA.debugLineNum = 76677150;BA.debugLine="Dim SqlOPer As String = \"and\"";
_sqloper = "and";
 }else {
RDebugUtils.currentLine=76677152;
 //BA.debugLineNum = 76677152;BA.debugLine="Dim SqlOPer As String = \"or\"";
_sqloper = "or";
 };
RDebugUtils.currentLine=76677154;
 //BA.debugLineNum = 76677154;BA.debugLine="SqlPesquisa = SqlPesquisa & $\" ${SqlOPer} ${LFD";
_sqlpesquisa = _sqlpesquisa+(" "+__c.SmartStringFormatter("",(Object)(_sqloper))+" "+__c.SmartStringFormatter("",(Object)(_lfd))+" like '%"+__c.SmartStringFormatter("",(Object)(__ref._boxeditsearchedvalue /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))+"%'");
 }
};
RDebugUtils.currentLine=76677156;
 //BA.debugLineNum = 76677156;BA.debugLine="PassScriptwithLimit = PassScript & SqlPesquisa";
_passscriptwithlimit = __ref._passscript /*String*/ +_sqlpesquisa;
 }else {
RDebugUtils.currentLine=76677158;
 //BA.debugLineNum = 76677158;BA.debugLine="PassScriptwithLimit = PassScript.Replace(\":__VAL";
_passscriptwithlimit = __ref._passscript /*String*/ .replace(":__VALOR",__ref._boxeditsearchedvalue /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText());
 };
RDebugUtils.currentLine=76677160;
 //BA.debugLineNum = 76677160;BA.debugLine="ShareCode.CurrentSerchquery = PassScriptwithLimit";
_sharecode._currentserchquery /*String*/  = _passscriptwithlimit;
RDebugUtils.currentLine=76677161;
 //BA.debugLineNum = 76677161;BA.debugLine="PassScriptwithLimitAndFilter = PassScriptwithLimi";
_passscriptwithlimitandfilter = _passscriptwithlimit+(" limit 0, 25");
RDebugUtils.currentLine=76677162;
 //BA.debugLineNum = 76677162;BA.debugLine="Log(PassScriptwithLimitAndFilter)";
__c.LogImpl("676677162",_passscriptwithlimitandfilter,0);
RDebugUtils.currentLine=76677164;
 //BA.debugLineNum = 76677164;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(_sharecode._generalwaitplease /*String*/ ),__c.False);
RDebugUtils.currentLine=76677165;
 //BA.debugLineNum = 76677165;BA.debugLine="Private Records2Search As ResultSet = Starter.Loc";
_records2search = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_records2search = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_passscriptwithlimitandfilter)));
RDebugUtils.currentLine=76677166;
 //BA.debugLineNum = 76677166;BA.debugLine="Dim ListLine_key As String = \"\"";
_listline_key = "";
RDebugUtils.currentLine=76677167;
 //BA.debugLineNum = 76677167;BA.debugLine="If StartingRow > Records2Search.RowCount Then";
if (__ref._startingrow /*int*/ >_records2search.getRowCount()) { 
RDebugUtils.currentLine=76677168;
 //BA.debugLineNum = 76677168;BA.debugLine="StartingRow = 0";
__ref._startingrow /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=76677170;
 //BA.debugLineNum = 76677170;BA.debugLine="Lista2Search.Clear";
__ref._lista2search /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=76677171;
 //BA.debugLineNum = 76677171;BA.debugLine="Do While Records2Search.NextRow";
while (_records2search.NextRow()) {
RDebugUtils.currentLine=76677172;
 //BA.debugLineNum = 76677172;BA.debugLine="For i=0 To Records2Search.ColumnCount -1";
{
final int step45 = 1;
final int limit45 = (int) (_records2search.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit45 ;_i = _i + step45 ) {
RDebugUtils.currentLine=76677173;
 //BA.debugLineNum = 76677173;BA.debugLine="If Records2Search.GetColumnName(i).ToLowerCase";
if ((_records2search.GetColumnName(_i).toLowerCase()).equals("tagcode")) { 
RDebugUtils.currentLine=76677174;
 //BA.debugLineNum = 76677174;BA.debugLine="ListLine_key =  Records2Search.GetString(Recor";
_listline_key = _records2search.GetString(_records2search.GetColumnName(_i));
 };
 }
};
RDebugUtils.currentLine=76677177;
 //BA.debugLineNum = 76677177;BA.debugLine="Lista2Search.Add(createSearchLineDetail(PassedAc";
__ref._lista2search /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createsearchlinedetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,__ref._passedact /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,_records2search,__c.DipToCurrent((int) (50))).getObject())),(Object)(_listline_key));
 }
;
RDebugUtils.currentLine=76677179;
 //BA.debugLineNum = 76677179;BA.debugLine="Records2Search.Close";
_records2search.Close();
RDebugUtils.currentLine=76677180;
 //BA.debugLineNum = 76677180;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=76677183;
 //BA.debugLineNum = 76677183;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createsearchlinedetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _items,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createsearchlinedetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createsearchlinedetail", new Object[] {_activ,_items,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
String _stext = "";
String _stag = "";
int _showfield = 0;
int _showposition = 0;
anywheresoftware.b4a.objects.collections.Map _mapofproperties = null;
anywheresoftware.b4a.objects.collections.Map _search_field_settings = null;
anywheresoftware.b4a.objects.collections.List _fields = null;
anywheresoftware.b4a.objects.collections.Map _colfields = null;
String _field_name = "";
int _show_inlist = 0;
int _show_position = 0;
String _props = "";
anywheresoftware.b4a.objects.collections.List _listastring = null;
int _inx = 0;
String _thename = "";
String _thevalue = "";
String _keyval = "";
anywheresoftware.b4a.objects.collections.List _propfields = null;
int _i = 0;
String _itemlista = "";
int _possort = 0;
RDebugUtils.currentLine=76611584;
 //BA.debugLineNum = 76611584;BA.debugLine="Sub createSearchLineDetail(activ As Activity, item";
RDebugUtils.currentLine=76611586;
 //BA.debugLineNum = 76611586;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=76611587;
 //BA.debugLineNum = 76611587;BA.debugLine="pnl.Initialize(\"\")";
_pnl.Initialize(ba,"");
RDebugUtils.currentLine=76611588;
 //BA.debugLineNum = 76611588;BA.debugLine="activ.AddView(pnl, 0, 0,98%x, height)";
_activ.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (98),ba),_height);
RDebugUtils.currentLine=76611589;
 //BA.debugLineNum = 76611589;BA.debugLine="pnl.LoadLayout(\"linha2search\" )";
_pnl.LoadLayout("linha2search",ba);
RDebugUtils.currentLine=76611590;
 //BA.debugLineNum = 76611590;BA.debugLine="pnl.RemoveView";
_pnl.RemoveView();
RDebugUtils.currentLine=76611591;
 //BA.debugLineNum = 76611591;BA.debugLine="Dim sText As String = \"\"";
_stext = "";
RDebugUtils.currentLine=76611592;
 //BA.debugLineNum = 76611592;BA.debugLine="Dim sTag As String = \"\"";
_stag = "";
RDebugUtils.currentLine=76611593;
 //BA.debugLineNum = 76611593;BA.debugLine="label2search1.text = \"\"";
__ref._label2search1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=76611594;
 //BA.debugLineNum = 76611594;BA.debugLine="Dim ShowField As Int = 1";
_showfield = (int) (1);
RDebugUtils.currentLine=76611595;
 //BA.debugLineNum = 76611595;BA.debugLine="Dim ShowPosition As Int = 1";
_showposition = (int) (1);
RDebugUtils.currentLine=76611596;
 //BA.debugLineNum = 76611596;BA.debugLine="Dim MapOfProperties As Map";
_mapofproperties = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=76611597;
 //BA.debugLineNum = 76611597;BA.debugLine="MapOfProperties.Initialize";
_mapofproperties.Initialize();
RDebugUtils.currentLine=76611598;
 //BA.debugLineNum = 76611598;BA.debugLine="Dim search_field_settings As Map = ShareCode.Curr";
_search_field_settings = new anywheresoftware.b4a.objects.collections.Map();
_search_field_settings = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_sharecode._current29map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("search_field_settings"))));
RDebugUtils.currentLine=76611599;
 //BA.debugLineNum = 76611599;BA.debugLine="Dim fields As List = search_field_settings.Get(\"f";
_fields = new anywheresoftware.b4a.objects.collections.List();
_fields = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_field_settings.Get((Object)("fields"))));
RDebugUtils.currentLine=76611600;
 //BA.debugLineNum = 76611600;BA.debugLine="For Each colfields As Map In fields";
_colfields = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group15 = _fields;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_colfields = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group15.Get(index15)));
RDebugUtils.currentLine=76611601;
 //BA.debugLineNum = 76611601;BA.debugLine="Dim field_name As String = colfields.Get(\"field_";
_field_name = BA.ObjectToString(_colfields.Get((Object)("field_name")));
RDebugUtils.currentLine=76611602;
 //BA.debugLineNum = 76611602;BA.debugLine="Dim show_inlist As Int = colfields.Get(\"show_inl";
_show_inlist = (int)(BA.ObjectToNumber(_colfields.Get((Object)("show_inlist"))));
RDebugUtils.currentLine=76611603;
 //BA.debugLineNum = 76611603;BA.debugLine="Dim show_position As Int = colfields.Get(\"show_p";
_show_position = (int)(BA.ObjectToNumber(_colfields.Get((Object)("show_position"))));
RDebugUtils.currentLine=76611604;
 //BA.debugLineNum = 76611604;BA.debugLine="Dim Props As String = $\"${show_inlist}|${show_po";
_props = (""+__c.SmartStringFormatter("",(Object)(_show_inlist))+"|"+__c.SmartStringFormatter("",(Object)(_show_position))+"");
RDebugUtils.currentLine=76611605;
 //BA.debugLineNum = 76611605;BA.debugLine="MapOfProperties.Put(field_name,Props)";
_mapofproperties.Put((Object)(_field_name),(Object)(_props));
 }
};
RDebugUtils.currentLine=76611608;
 //BA.debugLineNum = 76611608;BA.debugLine="Dim listaString As List";
_listastring = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=76611609;
 //BA.debugLineNum = 76611609;BA.debugLine="listaString.Initialize";
_listastring.Initialize();
RDebugUtils.currentLine=76611611;
 //BA.debugLineNum = 76611611;BA.debugLine="For inx = 0 To items.ColumnCount -1";
{
final int step24 = 1;
final int limit24 = (int) (_items.getColumnCount()-1);
_inx = (int) (0) ;
for (;_inx <= limit24 ;_inx = _inx + step24 ) {
RDebugUtils.currentLine=76611613;
 //BA.debugLineNum = 76611613;BA.debugLine="Dim theName As String = items.GetColumnName(inx)";
_thename = _items.GetColumnName(_inx);
RDebugUtils.currentLine=76611614;
 //BA.debugLineNum = 76611614;BA.debugLine="Dim theValue As String = items.GetString(theName";
_thevalue = _items.GetString(_thename);
RDebugUtils.currentLine=76611616;
 //BA.debugLineNum = 76611616;BA.debugLine="Try";
try {RDebugUtils.currentLine=76611617;
 //BA.debugLineNum = 76611617;BA.debugLine="If MapOfProperties.ContainsKey(theName) Then";
if (_mapofproperties.ContainsKey((Object)(_thename))) { 
RDebugUtils.currentLine=76611618;
 //BA.debugLineNum = 76611618;BA.debugLine="Dim KeyVal As String = MapOfProperties.Get(the";
_keyval = BA.ObjectToString(_mapofproperties.Get((Object)(_thename)));
RDebugUtils.currentLine=76611619;
 //BA.debugLineNum = 76611619;BA.debugLine="Dim PropFields As List = Regex.Split(\"\\|\",KeyV";
_propfields = new anywheresoftware.b4a.objects.collections.List();
_propfields = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|",_keyval));
RDebugUtils.currentLine=76611620;
 //BA.debugLineNum = 76611620;BA.debugLine="ShowField = PropFields.Get(0)";
_showfield = (int)(BA.ObjectToNumber(_propfields.Get((int) (0))));
RDebugUtils.currentLine=76611621;
 //BA.debugLineNum = 76611621;BA.debugLine="ShowPosition = PropFields.Get(1)";
_showposition = (int)(BA.ObjectToNumber(_propfields.Get((int) (1))));
 }else {
RDebugUtils.currentLine=76611623;
 //BA.debugLineNum = 76611623;BA.debugLine="ShowField = 0";
_showfield = (int) (0);
RDebugUtils.currentLine=76611624;
 //BA.debugLineNum = 76611624;BA.debugLine="ShowPosition = 0";
_showposition = (int) (0);
 };
 } 
       catch (Exception e38) {
			ba.setLastException(e38);RDebugUtils.currentLine=76611627;
 //BA.debugLineNum = 76611627;BA.debugLine="ShowField = 0";
_showfield = (int) (0);
RDebugUtils.currentLine=76611628;
 //BA.debugLineNum = 76611628;BA.debugLine="ShowPosition = 0";
_showposition = (int) (0);
 };
RDebugUtils.currentLine=76611632;
 //BA.debugLineNum = 76611632;BA.debugLine="sTag = sTag & $\"${theName}=${theValue}|\"$";
_stag = _stag+(""+__c.SmartStringFormatter("",(Object)(_thename))+"="+__c.SmartStringFormatter("",(Object)(_thevalue))+"|");
RDebugUtils.currentLine=76611633;
 //BA.debugLineNum = 76611633;BA.debugLine="Log(sTag)";
__c.LogImpl("676611633",_stag,0);
RDebugUtils.currentLine=76611636;
 //BA.debugLineNum = 76611636;BA.debugLine="If theName.ToLowerCase.Contains(\"tagcode\") = Fal";
if (_thename.toLowerCase().contains("tagcode")==__c.False) { 
RDebugUtils.currentLine=76611637;
 //BA.debugLineNum = 76611637;BA.debugLine="If ShowField = 1 Then";
if (_showfield==1) { 
RDebugUtils.currentLine=76611638;
 //BA.debugLineNum = 76611638;BA.debugLine="listaString.Add($\"${ShowPosition}-${theValue}\"";
_listastring.Add((Object)((""+__c.SmartStringFormatter("",(Object)(_showposition))+"-"+__c.SmartStringFormatter("",(Object)(_thevalue))+"")));
 };
 };
 }
};
RDebugUtils.currentLine=76611643;
 //BA.debugLineNum = 76611643;BA.debugLine="listaString.Sort(True)";
_listastring.Sort(__c.True);
RDebugUtils.currentLine=76611645;
 //BA.debugLineNum = 76611645;BA.debugLine="For i=0 To listaString.Size -1";
{
final int step50 = 1;
final int limit50 = (int) (_listastring.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
RDebugUtils.currentLine=76611646;
 //BA.debugLineNum = 76611646;BA.debugLine="Dim ItemLista As String = listaString.Get(i)";
_itemlista = BA.ObjectToString(_listastring.Get(_i));
RDebugUtils.currentLine=76611647;
 //BA.debugLineNum = 76611647;BA.debugLine="Dim PosSort As Int = ItemLista.IndexOf(\"-\")";
_possort = _itemlista.indexOf("-");
RDebugUtils.currentLine=76611648;
 //BA.debugLineNum = 76611648;BA.debugLine="If PosSort > 0 Then";
if (_possort>0) { 
RDebugUtils.currentLine=76611649;
 //BA.debugLineNum = 76611649;BA.debugLine="ItemLista = ItemLista.SubString2(PosSort+1,Item";
_itemlista = _itemlista.substring((int) (_possort+1),_itemlista.length());
 };
RDebugUtils.currentLine=76611651;
 //BA.debugLineNum = 76611651;BA.debugLine="sText = sText & ItemLista & \", \"";
_stext = _stext+_itemlista+", ";
 }
};
RDebugUtils.currentLine=76611655;
 //BA.debugLineNum = 76611655;BA.debugLine="If sText.EndsWith(\", \") Then sText = sText.SubStr";
if (_stext.endsWith(", ")) { 
_stext = _stext.substring((int) (0),(int) (_stext.length()-2));};
RDebugUtils.currentLine=76611656;
 //BA.debugLineNum = 76611656;BA.debugLine="If sText.StartsWith(\", \") Then sText = sText.SubS";
if (_stext.startsWith(", ")) { 
_stext = _stext.substring((int) (2),_stext.length());};
RDebugUtils.currentLine=76611657;
 //BA.debugLineNum = 76611657;BA.debugLine="label2search1.text = sText";
__ref._label2search1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_stext));
RDebugUtils.currentLine=76611658;
 //BA.debugLineNum = 76611658;BA.debugLine="label2search1.tag = sTag";
__ref._label2search1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_stag));
RDebugUtils.currentLine=76611660;
 //BA.debugLineNum = 76611660;BA.debugLine="Return pnl";
if (true) return _pnl;
RDebugUtils.currentLine=76611661;
 //BA.debugLineNum = 76611661;BA.debugLine="End Sub";
return null;
}
public String  _butcreateobject_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butcreateobject_click", false))
	 {return ((String) Debug.delegate(ba, "butcreateobject_click", null));}
RDebugUtils.currentLine=73990144;
 //BA.debugLineNum = 73990144;BA.debugLine="Sub butCreateObject_Click";
RDebugUtils.currentLine=73990145;
 //BA.debugLineNum = 73990145;BA.debugLine="createObjectPanel.Visible = True";
__ref._createobjectpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=73990146;
 //BA.debugLineNum = 73990146;BA.debugLine="End Sub";
return "";
}
public String  _butparamitem_stateclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butparamitem_stateclick", false))
	 {return ((String) Debug.delegate(ba, "butparamitem_stateclick", new Object[] {_state}));}
xevolution.vrcg.devdemov2400.b4xstatebutton _this = null;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
anywheresoftware.b4a.objects.PanelWrapper _pan2 = null;
String _ssql = "";
RDebugUtils.currentLine=72744960;
 //BA.debugLineNum = 72744960;BA.debugLine="Sub ButParamItem_StateClick (State As Int)";
RDebugUtils.currentLine=72744961;
 //BA.debugLineNum = 72744961;BA.debugLine="Dim this As B4XStateButton = Sender";
_this = (xevolution.vrcg.devdemov2400.b4xstatebutton)(__c.Sender(ba));
RDebugUtils.currentLine=72744962;
 //BA.debugLineNum = 72744962;BA.debugLine="Log(State)";
__c.LogImpl("672744962",BA.NumberToString(_state),0);
RDebugUtils.currentLine=72744963;
 //BA.debugLineNum = 72744963;BA.debugLine="Dim Pan As Panel = this.Parent";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_this._getparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=72744964;
 //BA.debugLineNum = 72744964;BA.debugLine="Dim Pan2 As Panel = Pan.Parent";
_pan2 = new anywheresoftware.b4a.objects.PanelWrapper();
_pan2 = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pan.getParent()));
RDebugUtils.currentLine=72744965;
 //BA.debugLineNum = 72744965;BA.debugLine="Dim sSQL As String = $\"update dta_device_params s";
_ssql = ("update dta_device_params set value_state="+__c.SmartStringFormatter("",(Object)(_state))+" where tagcode='"+__c.SmartStringFormatter("",_pan2.getTag())+"'");
RDebugUtils.currentLine=72744966;
 //BA.debugLineNum = 72744966;BA.debugLine="Utils.SaveSQLToLog(\"ButParamItem_StateClick\",sSQL";
_utils._savesqltolog /*boolean*/ (ba,"ButParamItem_StateClick",_ssql,"");
RDebugUtils.currentLine=72744968;
 //BA.debugLineNum = 72744968;BA.debugLine="End Sub";
return "";
}
public String  _butreqdatermj_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butreqdatermj_click", false))
	 {return ((String) Debug.delegate(ba, "butreqdatermj_click", null));}
de.donmanfred.DatePickerDialogWrapper _dd = null;
long _dnow = 0L;
RDebugUtils.currentLine=78053376;
 //BA.debugLineNum = 78053376;BA.debugLine="Sub butReqDateRMJ_Click";
RDebugUtils.currentLine=78053377;
 //BA.debugLineNum = 78053377;BA.debugLine="Dim dd As DatePickerDialog";
_dd = new de.donmanfred.DatePickerDialogWrapper();
RDebugUtils.currentLine=78053378;
 //BA.debugLineNum = 78053378;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=78053379;
 //BA.debugLineNum = 78053379;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=78053380;
 //BA.debugLineNum = 78053380;BA.debugLine="If (DialogReqDateRMJ.EditText.Text  <> \"\") Then";
if (((__ref._dialogreqdatermj /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().getText()).equals("") == false)) { 
RDebugUtils.currentLine=78053381;
 //BA.debugLineNum = 78053381;BA.debugLine="dnow = DateTime.DateParse(DialogReqDateRMJ.text)";
_dnow = __c.DateTime.DateParse(__ref._dialogreqdatermj /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText());
 };
RDebugUtils.currentLine=78053383;
 //BA.debugLineNum = 78053383;BA.debugLine="dd.Initialize(\"CalendarGetDateRMJ\", DateTime.GetY";
_dd.Initialize(ba,"CalendarGetDateRMJ",__c.DateTime.GetYear(_dnow),(int) (__c.DateTime.GetMonth(_dnow)-1),__c.DateTime.GetDayOfMonth(_dnow));
RDebugUtils.currentLine=78053384;
 //BA.debugLineNum = 78053384;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
__c.LogImpl("678053384",BA.NumberToString(_dd.getAccentColor()),0);
RDebugUtils.currentLine=78053385;
 //BA.debugLineNum = 78053385;BA.debugLine="dd.show(\"DialogReqDateRMJ\")";
_dd.show("DialogReqDateRMJ");
RDebugUtils.currentLine=78053386;
 //BA.debugLineNum = 78053386;BA.debugLine="End Sub";
return "";
}
public String  _butreqenddate_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butreqenddate_click", false))
	 {return ((String) Debug.delegate(ba, "butreqenddate_click", null));}
de.donmanfred.DatePickerDialogWrapper _dd = null;
long _dnow = 0L;
RDebugUtils.currentLine=77791232;
 //BA.debugLineNum = 77791232;BA.debugLine="Sub butReqEndDate_Click";
RDebugUtils.currentLine=77791233;
 //BA.debugLineNum = 77791233;BA.debugLine="Dim dd As DatePickerDialog";
_dd = new de.donmanfred.DatePickerDialogWrapper();
RDebugUtils.currentLine=77791234;
 //BA.debugLineNum = 77791234;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=77791235;
 //BA.debugLineNum = 77791235;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=77791236;
 //BA.debugLineNum = 77791236;BA.debugLine="If (DialogReqEndDate.Text  <> \"\") Then";
if (((__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()).equals("") == false)) { 
RDebugUtils.currentLine=77791237;
 //BA.debugLineNum = 77791237;BA.debugLine="dnow = DateTime.DateParse(DialogReqEndDate.text)";
_dnow = __c.DateTime.DateParse(__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText());
 };
RDebugUtils.currentLine=77791239;
 //BA.debugLineNum = 77791239;BA.debugLine="dd.Initialize(\"CalendarGetEndDate\", DateTime.GetY";
_dd.Initialize(ba,"CalendarGetEndDate",__c.DateTime.GetYear(_dnow),(int) (__c.DateTime.GetMonth(_dnow)-1),__c.DateTime.GetDayOfMonth(_dnow));
RDebugUtils.currentLine=77791241;
 //BA.debugLineNum = 77791241;BA.debugLine="dd.ThemeDark = True";
_dd.setThemeDark(__c.True);
RDebugUtils.currentLine=77791242;
 //BA.debugLineNum = 77791242;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
__c.LogImpl("677791242",BA.NumberToString(_dd.getAccentColor()),0);
RDebugUtils.currentLine=77791243;
 //BA.debugLineNum = 77791243;BA.debugLine="dd.show(\"DialogReqEndDate\")";
_dd.show("DialogReqEndDate");
RDebugUtils.currentLine=77791244;
 //BA.debugLineNum = 77791244;BA.debugLine="End Sub";
return "";
}
public String  _butreqendtime_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butreqendtime_click", false))
	 {return ((String) Debug.delegate(ba, "butreqendtime_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _but = null;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _currenttimeedit = null;
de.donmanfred.TimePickerDialogWrapper _tt = null;
long _dnow = 0L;
RDebugUtils.currentLine=78512128;
 //BA.debugLineNum = 78512128;BA.debugLine="Sub butReqEndTime_Click";
RDebugUtils.currentLine=78512129;
 //BA.debugLineNum = 78512129;BA.debugLine="Dim but As Button = Sender";
_but = new anywheresoftware.b4a.objects.ButtonWrapper();
_but = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=78512130;
 //BA.debugLineNum = 78512130;BA.debugLine="Dim pan As Panel = but.Parent";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_but.getParent()));
RDebugUtils.currentLine=78512131;
 //BA.debugLineNum = 78512131;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = pan";
_currenttimeedit = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
_currenttimeedit = (anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper(), (com.wrapp.floatlabelededittext.FloatLabeledEditText)(_pan.GetView((int) (6)).getObject()));
RDebugUtils.currentLine=78512132;
 //BA.debugLineNum = 78512132;BA.debugLine="Dim tt As TimePickerDialog";
_tt = new de.donmanfred.TimePickerDialogWrapper();
RDebugUtils.currentLine=78512133;
 //BA.debugLineNum = 78512133;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=78512134;
 //BA.debugLineNum = 78512134;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=78512135;
 //BA.debugLineNum = 78512135;BA.debugLine="Try";
try {RDebugUtils.currentLine=78512136;
 //BA.debugLineNum = 78512136;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
if (((_currenttimeedit.getText()).equals("") == false)) { 
RDebugUtils.currentLine=78512137;
 //BA.debugLineNum = 78512137;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.t";
_dnow = __c.DateTime.TimeParse((""+__c.SmartStringFormatter("",(Object)(_currenttimeedit.getText()))+":00"));
 };
RDebugUtils.currentLine=78512140;
 //BA.debugLineNum = 78512140;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHou";
_tt.Initialize(ba,"CalendarGetTime",__c.DateTime.GetHour(_dnow),__c.DateTime.GetMinute(_dnow),__c.True);
RDebugUtils.currentLine=78512142;
 //BA.debugLineNum = 78512142;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
_tt.show("CurrentTimeEdit");
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=78512144;
 //BA.debugLineNum = 78512144;BA.debugLine="Log(LastException)";
__c.LogImpl("678512144",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=78512146;
 //BA.debugLineNum = 78512146;BA.debugLine="End Sub";
return "";
}
public String  _butreqstartdate_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butreqstartdate_click", false))
	 {return ((String) Debug.delegate(ba, "butreqstartdate_click", null));}
de.donmanfred.DatePickerDialogWrapper _dd = null;
long _dnow = 0L;
RDebugUtils.currentLine=77725696;
 //BA.debugLineNum = 77725696;BA.debugLine="Sub butReqStartDate_Click";
RDebugUtils.currentLine=77725697;
 //BA.debugLineNum = 77725697;BA.debugLine="Dim dd As DatePickerDialog";
_dd = new de.donmanfred.DatePickerDialogWrapper();
RDebugUtils.currentLine=77725698;
 //BA.debugLineNum = 77725698;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=77725699;
 //BA.debugLineNum = 77725699;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=77725700;
 //BA.debugLineNum = 77725700;BA.debugLine="If (DialogReqStartDate.Text  <> \"\") Then";
if (((__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()).equals("") == false)) { 
RDebugUtils.currentLine=77725701;
 //BA.debugLineNum = 77725701;BA.debugLine="dnow = DateTime.DateParse(DialogReqStartDate.tex";
_dnow = __c.DateTime.DateParse(__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText());
 };
RDebugUtils.currentLine=77725703;
 //BA.debugLineNum = 77725703;BA.debugLine="dd.Initialize(\"CalendarGetStartDate\", DateTime.Ge";
_dd.Initialize(ba,"CalendarGetStartDate",__c.DateTime.GetYear(_dnow),(int) (__c.DateTime.GetMonth(_dnow)-1),__c.DateTime.GetDayOfMonth(_dnow));
RDebugUtils.currentLine=77725704;
 //BA.debugLineNum = 77725704;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
__c.LogImpl("677725704",BA.NumberToString(_dd.getAccentColor()),0);
RDebugUtils.currentLine=77725705;
 //BA.debugLineNum = 77725705;BA.debugLine="dd.show(\"DialogReqStartDate\")";
_dd.show("DialogReqStartDate");
RDebugUtils.currentLine=77725706;
 //BA.debugLineNum = 77725706;BA.debugLine="End Sub";
return "";
}
public String  _butreqstarttime_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butreqstarttime_click", false))
	 {return ((String) Debug.delegate(ba, "butreqstarttime_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _but = null;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _currenttimeedit = null;
de.donmanfred.TimePickerDialogWrapper _tt = null;
long _dnow = 0L;
RDebugUtils.currentLine=78446592;
 //BA.debugLineNum = 78446592;BA.debugLine="Sub butReqStartTime_Click";
RDebugUtils.currentLine=78446593;
 //BA.debugLineNum = 78446593;BA.debugLine="Dim but As Button = Sender";
_but = new anywheresoftware.b4a.objects.ButtonWrapper();
_but = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=78446594;
 //BA.debugLineNum = 78446594;BA.debugLine="Dim pan As Panel = but.Parent";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_but.getParent()));
RDebugUtils.currentLine=78446595;
 //BA.debugLineNum = 78446595;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = pan";
_currenttimeedit = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
_currenttimeedit = (anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper(), (com.wrapp.floatlabelededittext.FloatLabeledEditText)(_pan.GetView((int) (5)).getObject()));
RDebugUtils.currentLine=78446596;
 //BA.debugLineNum = 78446596;BA.debugLine="Dim tt As TimePickerDialog";
_tt = new de.donmanfred.TimePickerDialogWrapper();
RDebugUtils.currentLine=78446597;
 //BA.debugLineNum = 78446597;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=78446598;
 //BA.debugLineNum = 78446598;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=78446599;
 //BA.debugLineNum = 78446599;BA.debugLine="Try";
try {RDebugUtils.currentLine=78446600;
 //BA.debugLineNum = 78446600;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
if (((_currenttimeedit.getText()).equals("") == false)) { 
RDebugUtils.currentLine=78446601;
 //BA.debugLineNum = 78446601;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.te";
_dnow = __c.DateTime.TimeParse((""+__c.SmartStringFormatter("",(Object)(_currenttimeedit.getText()))+":00"));
 };
RDebugUtils.currentLine=78446604;
 //BA.debugLineNum = 78446604;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHo";
_tt.Initialize(ba,"CalendarGetTime",__c.DateTime.GetHour(_dnow),__c.DateTime.GetMinute(_dnow),__c.True);
RDebugUtils.currentLine=78446606;
 //BA.debugLineNum = 78446606;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
_tt.show("CurrentTimeEdit");
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=78446608;
 //BA.debugLineNum = 78446608;BA.debugLine="Log(LastException)";
__c.LogImpl("678446608",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=78446610;
 //BA.debugLineNum = 78446610;BA.debugLine="End Sub";
return "";
}
public String  _butreqtimermj_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butreqtimermj_click", false))
	 {return ((String) Debug.delegate(ba, "butreqtimermj_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _but = null;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _currenttimeedit = null;
de.donmanfred.TimePickerDialogWrapper _tt = null;
long _dnow = 0L;
RDebugUtils.currentLine=78381056;
 //BA.debugLineNum = 78381056;BA.debugLine="Sub butReqTimeRMJ_Click";
RDebugUtils.currentLine=78381057;
 //BA.debugLineNum = 78381057;BA.debugLine="Dim but As Button = Sender";
_but = new anywheresoftware.b4a.objects.ButtonWrapper();
_but = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=78381058;
 //BA.debugLineNum = 78381058;BA.debugLine="Dim pan As Panel = but.Parent";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_but.getParent()));
RDebugUtils.currentLine=78381059;
 //BA.debugLineNum = 78381059;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = pan";
_currenttimeedit = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
_currenttimeedit = (anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper(), (com.wrapp.floatlabelededittext.FloatLabeledEditText)(_pan.GetView((int) (11)).getObject()));
RDebugUtils.currentLine=78381060;
 //BA.debugLineNum = 78381060;BA.debugLine="Dim tt As TimePickerDialog";
_tt = new de.donmanfred.TimePickerDialogWrapper();
RDebugUtils.currentLine=78381061;
 //BA.debugLineNum = 78381061;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=78381062;
 //BA.debugLineNum = 78381062;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=78381063;
 //BA.debugLineNum = 78381063;BA.debugLine="Try";
try {RDebugUtils.currentLine=78381064;
 //BA.debugLineNum = 78381064;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
if (((_currenttimeedit.getText()).equals("") == false)) { 
RDebugUtils.currentLine=78381065;
 //BA.debugLineNum = 78381065;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.T";
_dnow = __c.DateTime.TimeParse((""+__c.SmartStringFormatter("",(Object)(_currenttimeedit.getText()))+":00"));
 };
RDebugUtils.currentLine=78381068;
 //BA.debugLineNum = 78381068;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHou";
_tt.Initialize(ba,"CalendarGetTime",__c.DateTime.GetHour(_dnow),__c.DateTime.GetMinute(_dnow),__c.True);
RDebugUtils.currentLine=78381070;
 //BA.debugLineNum = 78381070;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
_tt.show("CurrentTimeEdit");
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=78381072;
 //BA.debugLineNum = 78381072;BA.debugLine="Log(LastException)";
__c.LogImpl("678381072",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=78381074;
 //BA.debugLineNum = 78381074;BA.debugLine="End Sub";
return "";
}
public String  _butresetapplication_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "butresetapplication_click", false))
	 {return ((String) Debug.delegate(ba, "butresetapplication_click", null));}
RDebugUtils.currentLine=75104256;
 //BA.debugLineNum = 75104256;BA.debugLine="Sub butResetApplication_Click";
RDebugUtils.currentLine=75104257;
 //BA.debugLineNum = 75104257;BA.debugLine="CallSubDelayed(CurrentActivityObject, \"ResetAppli";
__c.CallSubDelayed(ba,__ref._currentactivityobject /*Object*/ ,"ResetApplication");
RDebugUtils.currentLine=75104258;
 //BA.debugLineNum = 75104258;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.NEGATIVE)";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.NEGATIVE);
RDebugUtils.currentLine=75104259;
 //BA.debugLineNum = 75104259;BA.debugLine="End Sub";
return "";
}
public String  _buttonassociated_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "buttonassociated_click", false))
	 {return ((String) Debug.delegate(ba, "buttonassociated_click", null));}
RDebugUtils.currentLine=79364096;
 //BA.debugLineNum = 79364096;BA.debugLine="Sub ButtonAssociated_Click";
RDebugUtils.currentLine=79364098;
 //BA.debugLineNum = 79364098;BA.debugLine="Try";
try {RDebugUtils.currentLine=79364099;
 //BA.debugLineNum = 79364099;BA.debugLine="ListViewBluetoothDevices.Clear";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=79364100;
 //BA.debugLineNum = 79364100;BA.debugLine="Printer.SelectFromAssociatedPrinter";
__ref._printer /*b4a.example.bt_printer*/ ._vvvv6();
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=79364102;
 //BA.debugLineNum = 79364102;BA.debugLine="Log(LastException)";
__c.LogImpl("679364102",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=79364104;
 //BA.debugLineNum = 79364104;BA.debugLine="End Sub";
return "";
}
public void  _buttonprint_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "buttonprint_click", false))
	 {Debug.delegate(ba, "buttonprint_click", null); return;}
ResumableSub_ButtonPrint_Click rsub = new ResumableSub_ButtonPrint_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonPrint_Click extends BA.ResumableSub {
public ResumableSub_ButtonPrint_Click(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=79560706;
 //BA.debugLineNum = 79560706;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
RDebugUtils.currentLine=79560707;
 //BA.debugLineNum = 79560707;BA.debugLine="If Not(Printer.Connected) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.Not(__ref._printer /*b4a.example.bt_printer*/ ._vvv5())) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=79560708;
 //BA.debugLineNum = 79560708;BA.debugLine="PrinterMessage = \"A Processar.....\"";
__ref._printermessage /*String*/  = "A Processar.....";
RDebugUtils.currentLine=79560709;
 //BA.debugLineNum = 79560709;BA.debugLine="Printer.ClearBuffer";
__ref._printer /*b4a.example.bt_printer*/ ._vvv3();
RDebugUtils.currentLine=79560710;
 //BA.debugLineNum = 79560710;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.BoldOn & \"X";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline(parent._esc_pos._vv1+"X-Evolution"+parent._esc_pos._vv4);
RDebugUtils.currentLine=79560712;
 //BA.debugLineNum = 79560712;BA.debugLine="Printer.AddBuffer_Writeline(\"VRCG\")";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline("VRCG");
RDebugUtils.currentLine=79560713;
 //BA.debugLineNum = 79560713;BA.debugLine="Printer.AddBuffer_Writeline(\"VRCG\")";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline("VRCG");
RDebugUtils.currentLine=79560717;
 //BA.debugLineNum = 79560717;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline("");
RDebugUtils.currentLine=79560718;
 //BA.debugLineNum = 79560718;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline("");
RDebugUtils.currentLine=79560719;
 //BA.debugLineNum = 79560719;BA.debugLine="Printer.SelectFromMac(CurrentPrinterConnected)";
__ref._printer /*b4a.example.bt_printer*/ ._vvvv7(BA.ObjectToString(__ref._currentprinterconnected /*Object*/ ));
RDebugUtils.currentLine=79560720;
 //BA.debugLineNum = 79560720;BA.debugLine="Sleep(2500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "buttonprint_click"),(int) (2500));
this.state = 11;
return;
case 11:
//C
this.state = 7;
;
 if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=79560723;
 //BA.debugLineNum = 79560723;BA.debugLine="Printer.flushAllAndClose";
__ref._printer /*b4a.example.bt_printer*/ ._vvv7();
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=79560725;
 //BA.debugLineNum = 79560725;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("679560725",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=79560728;
 //BA.debugLineNum = 79560728;BA.debugLine="End Sub";
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
public void  _buttonscanprinter_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "buttonscanprinter_click", false))
	 {Debug.delegate(ba, "buttonscanprinter_click", null); return;}
ResumableSub_ButtonScanPrinter_Click rsub = new ResumableSub_ButtonScanPrinter_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonScanPrinter_Click extends BA.ResumableSub {
public ResumableSub_ButtonScanPrinter_Click(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=79429634;
 //BA.debugLineNum = 79429634;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
RDebugUtils.currentLine=79429635;
 //BA.debugLineNum = 79429635;BA.debugLine="ListViewBluetoothDevices.Clear";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=79429636;
 //BA.debugLineNum = 79429636;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_L";
__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(ba,__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_COARSE_LOCATION);
RDebugUtils.currentLine=79429637;
 //BA.debugLineNum = 79429637;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
parent.__c.WaitFor("activity_permissionresult", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "buttonscanprinter_click"), null);
this.state = 16;
return;
case 16:
//C
this.state = 4;
_permission = (String) result[1];
_result = (Boolean) result[2];
;
RDebugUtils.currentLine=79429638;
 //BA.debugLineNum = 79429638;BA.debugLine="If Result = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=79429639;
 //BA.debugLineNum = 79429639;BA.debugLine="ToastMessageShow(\"No permission...\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("No permission..."),parent.__c.False);
RDebugUtils.currentLine=79429640;
 //BA.debugLineNum = 79429640;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=79429644;
 //BA.debugLineNum = 79429644;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("679429644",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=79429647;
 //BA.debugLineNum = 79429647;BA.debugLine="Try";

case 10:
//try
this.state = 15;
this.catchState = 0;
this.catchState = 14;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 14;
RDebugUtils.currentLine=79429648;
 //BA.debugLineNum = 79429648;BA.debugLine="FindPrintersBT";
__ref._findprintersbt /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=79429650;
 //BA.debugLineNum = 79429650;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("679429650",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=79429653;
 //BA.debugLineNum = 79429653;BA.debugLine="End Sub";
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
public String  _findprintersbt(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "findprintersbt", false))
	 {return ((String) Debug.delegate(ba, "findprintersbt", null));}
RDebugUtils.currentLine=79495168;
 //BA.debugLineNum = 79495168;BA.debugLine="Sub FindPrintersBT";
RDebugUtils.currentLine=79495169;
 //BA.debugLineNum = 79495169;BA.debugLine="Printer.SearchNewPrinter";
__ref._printer /*b4a.example.bt_printer*/ ._vvvv5();
RDebugUtils.currentLine=79495170;
 //BA.debugLineNum = 79495170;BA.debugLine="End Sub";
return "";
}
public String  _calendargetdatermj_ondateset(xevolution.vrcg.devdemov2400.appdialogs __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "calendargetdatermj_ondateset", false))
	 {return ((String) Debug.delegate(ba, "calendargetdatermj_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
String _moy = "";
String _dom = "";
RDebugUtils.currentLine=77987840;
 //BA.debugLineNum = 77987840;BA.debugLine="Sub CalendarGetDateRMJ_onDateSet(year As Int, mont";
RDebugUtils.currentLine=77987841;
 //BA.debugLineNum = 77987841;BA.debugLine="Dim moy As String = monthOfYear+1";
_moy = BA.NumberToString(_monthofyear+1);
RDebugUtils.currentLine=77987842;
 //BA.debugLineNum = 77987842;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
if ((_moy.length()==1)) { 
_moy = "0"+_moy;};
RDebugUtils.currentLine=77987843;
 //BA.debugLineNum = 77987843;BA.debugLine="Dim dom As String = dayOfMonth";
_dom = BA.NumberToString(_dayofmonth);
RDebugUtils.currentLine=77987844;
 //BA.debugLineNum = 77987844;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
if ((_dom.length()==1)) { 
_dom = "0"+_dom;};
RDebugUtils.currentLine=77987845;
 //BA.debugLineNum = 77987845;BA.debugLine="DialogReqDateRMJ.Text = $\"${year}-${moy}-${dom}\"$";
__ref._dialogreqdatermj /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)((""+__c.SmartStringFormatter("",(Object)(_year))+"-"+__c.SmartStringFormatter("",(Object)(_moy))+"-"+__c.SmartStringFormatter("",(Object)(_dom))+"")));
RDebugUtils.currentLine=77987846;
 //BA.debugLineNum = 77987846;BA.debugLine="End Sub";
return "";
}
public String  _calendargetenddate_ondateset(xevolution.vrcg.devdemov2400.appdialogs __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "calendargetenddate_ondateset", false))
	 {return ((String) Debug.delegate(ba, "calendargetenddate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
String _moy = "";
String _dom = "";
RDebugUtils.currentLine=77922304;
 //BA.debugLineNum = 77922304;BA.debugLine="Sub CalendarGetEndDate_onDateSet(year As Int, mont";
RDebugUtils.currentLine=77922305;
 //BA.debugLineNum = 77922305;BA.debugLine="Dim moy As String = monthOfYear+1";
_moy = BA.NumberToString(_monthofyear+1);
RDebugUtils.currentLine=77922306;
 //BA.debugLineNum = 77922306;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
if ((_moy.length()==1)) { 
_moy = "0"+_moy;};
RDebugUtils.currentLine=77922307;
 //BA.debugLineNum = 77922307;BA.debugLine="Dim dom As String = dayOfMonth";
_dom = BA.NumberToString(_dayofmonth);
RDebugUtils.currentLine=77922308;
 //BA.debugLineNum = 77922308;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
if ((_dom.length()==1)) { 
_dom = "0"+_dom;};
RDebugUtils.currentLine=77922309;
 //BA.debugLineNum = 77922309;BA.debugLine="DialogReqEndDate.Text = $\"${year}-${moy}-${dom}\"$";
__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)((""+__c.SmartStringFormatter("",(Object)(_year))+"-"+__c.SmartStringFormatter("",(Object)(_moy))+"-"+__c.SmartStringFormatter("",(Object)(_dom))+"")));
RDebugUtils.currentLine=77922310;
 //BA.debugLineNum = 77922310;BA.debugLine="End Sub";
return "";
}
public String  _calendargetstartdate_ondateset(xevolution.vrcg.devdemov2400.appdialogs __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "calendargetstartdate_ondateset", false))
	 {return ((String) Debug.delegate(ba, "calendargetstartdate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
String _moy = "";
String _dom = "";
RDebugUtils.currentLine=77856768;
 //BA.debugLineNum = 77856768;BA.debugLine="Sub CalendarGetStartDate_onDateSet(year As Int, mo";
RDebugUtils.currentLine=77856769;
 //BA.debugLineNum = 77856769;BA.debugLine="Dim moy As String = monthOfYear+1";
_moy = BA.NumberToString(_monthofyear+1);
RDebugUtils.currentLine=77856770;
 //BA.debugLineNum = 77856770;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
if ((_moy.length()==1)) { 
_moy = "0"+_moy;};
RDebugUtils.currentLine=77856771;
 //BA.debugLineNum = 77856771;BA.debugLine="Dim dom As String = dayOfMonth";
_dom = BA.NumberToString(_dayofmonth);
RDebugUtils.currentLine=77856772;
 //BA.debugLineNum = 77856772;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
if ((_dom.length()==1)) { 
_dom = "0"+_dom;};
RDebugUtils.currentLine=77856773;
 //BA.debugLineNum = 77856773;BA.debugLine="DialogReqStartDate.Text = $\"${year}-${moy}-${dom}";
__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)((""+__c.SmartStringFormatter("",(Object)(_year))+"-"+__c.SmartStringFormatter("",(Object)(_moy))+"-"+__c.SmartStringFormatter("",(Object)(_dom))+"")));
RDebugUtils.currentLine=77856774;
 //BA.debugLineNum = 77856774;BA.debugLine="End Sub";
return "";
}
public String  _calsyncedate_ondateset(xevolution.vrcg.devdemov2400.appdialogs __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "calsyncedate_ondateset", false))
	 {return ((String) Debug.delegate(ba, "calsyncedate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
String _moy = "";
String _dom = "";
RDebugUtils.currentLine=80281600;
 //BA.debugLineNum = 80281600;BA.debugLine="Sub CalSynceDate_onDateSet(year As Int, monthOfYea";
RDebugUtils.currentLine=80281601;
 //BA.debugLineNum = 80281601;BA.debugLine="Dim moy As String = monthOfYear+1";
_moy = BA.NumberToString(_monthofyear+1);
RDebugUtils.currentLine=80281602;
 //BA.debugLineNum = 80281602;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
if ((_moy.length()==1)) { 
_moy = "0"+_moy;};
RDebugUtils.currentLine=80281603;
 //BA.debugLineNum = 80281603;BA.debugLine="Dim dom As String = dayOfMonth";
_dom = BA.NumberToString(_dayofmonth);
RDebugUtils.currentLine=80281604;
 //BA.debugLineNum = 80281604;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
if ((_dom.length()==1)) { 
_dom = "0"+_dom;};
RDebugUtils.currentLine=80281605;
 //BA.debugLineNum = 80281605;BA.debugLine="sync_manual_edate.Text = $\"${year}-${moy}-${dom}\"";
__ref._sync_manual_edate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)((""+__c.SmartStringFormatter("",(Object)(_year))+"-"+__c.SmartStringFormatter("",(Object)(_moy))+"-"+__c.SmartStringFormatter("",(Object)(_dom))+"")));
RDebugUtils.currentLine=80281606;
 //BA.debugLineNum = 80281606;BA.debugLine="End Sub";
return "";
}
public String  _calsyncidate_ondateset(xevolution.vrcg.devdemov2400.appdialogs __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "calsyncidate_ondateset", false))
	 {return ((String) Debug.delegate(ba, "calsyncidate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
String _moy = "";
String _dom = "";
RDebugUtils.currentLine=80216064;
 //BA.debugLineNum = 80216064;BA.debugLine="Sub CalSynciDate_onDateSet(year As Int, monthOfYea";
RDebugUtils.currentLine=80216065;
 //BA.debugLineNum = 80216065;BA.debugLine="Dim moy As String = monthOfYear+1";
_moy = BA.NumberToString(_monthofyear+1);
RDebugUtils.currentLine=80216066;
 //BA.debugLineNum = 80216066;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
if ((_moy.length()==1)) { 
_moy = "0"+_moy;};
RDebugUtils.currentLine=80216067;
 //BA.debugLineNum = 80216067;BA.debugLine="Dim dom As String = dayOfMonth";
_dom = BA.NumberToString(_dayofmonth);
RDebugUtils.currentLine=80216068;
 //BA.debugLineNum = 80216068;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
if ((_dom.length()==1)) { 
_dom = "0"+_dom;};
RDebugUtils.currentLine=80216069;
 //BA.debugLineNum = 80216069;BA.debugLine="sync_manual_idate.Text = $\"${year}-${moy}-${dom}\"";
__ref._sync_manual_idate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)((""+__c.SmartStringFormatter("",(Object)(_year))+"-"+__c.SmartStringFormatter("",(Object)(_moy))+"-"+__c.SmartStringFormatter("",(Object)(_dom))+"")));
RDebugUtils.currentLine=80216070;
 //BA.debugLineNum = 80216070;BA.debugLine="End Sub";
return "";
}
public String  _cancelselectobjectbutton_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "cancelselectobjectbutton_click", false))
	 {return ((String) Debug.delegate(ba, "cancelselectobjectbutton_click", null));}
RDebugUtils.currentLine=74514432;
 //BA.debugLineNum = 74514432;BA.debugLine="Sub CancelSelectObjectButton_Click";
RDebugUtils.currentLine=74514433;
 //BA.debugLineNum = 74514433;BA.debugLine="objectTypePanel.Visible = True";
__ref._objecttypepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=74514434;
 //BA.debugLineNum = 74514434;BA.debugLine="selectObjectPanel.Visible = False";
__ref._selectobjectpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=74514435;
 //BA.debugLineNum = 74514435;BA.debugLine="CurrentSelectedCode = \"\"";
__ref._currentselectedcode /*String*/  = "";
RDebugUtils.currentLine=74514436;
 //BA.debugLineNum = 74514436;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(__c.DialogResponse.POSITIVE).setEnabled(_utils._nne /*boolean*/ (ba,__ref._currentselectedcode /*String*/ ));
RDebugUtils.currentLine=74514437;
 //BA.debugLineNum = 74514437;BA.debugLine="End Sub";
return "";
}
public String  _claobjectclear_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "claobjectclear_click", false))
	 {return ((String) Debug.delegate(ba, "claobjectclear_click", null));}
RDebugUtils.currentLine=74252288;
 //BA.debugLineNum = 74252288;BA.debugLine="Sub CLAObjectClear_Click";
RDebugUtils.currentLine=74252289;
 //BA.debugLineNum = 74252289;BA.debugLine="CLAObjectList.Clear";
__ref._claobjectlist /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=74252290;
 //BA.debugLineNum = 74252290;BA.debugLine="CLAObjectDesc.Text = \"\"";
__ref._claobjectdesc /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=74252291;
 //BA.debugLineNum = 74252291;BA.debugLine="CurrentSelectedCode = \"\"";
__ref._currentselectedcode /*String*/  = "";
RDebugUtils.currentLine=74252292;
 //BA.debugLineNum = 74252292;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(__c.DialogResponse.POSITIVE).setEnabled(_utils._nne /*boolean*/ (ba,__ref._currentselectedcode /*String*/ ));
RDebugUtils.currentLine=74252293;
 //BA.debugLineNum = 74252293;BA.debugLine="End Sub";
return "";
}
public void  _claobjectdesc_textchanged(xevolution.vrcg.devdemov2400.appdialogs __ref,String _old,String _new) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "claobjectdesc_textchanged", false))
	 {Debug.delegate(ba, "claobjectdesc_textchanged", new Object[] {_old,_new}); return;}
ResumableSub_CLAObjectDesc_TextChanged rsub = new ResumableSub_CLAObjectDesc_TextChanged(this,__ref,_old,_new);
rsub.resume(ba, null);
}
public static class ResumableSub_CLAObjectDesc_TextChanged extends BA.ResumableSub {
public ResumableSub_CLAObjectDesc_TextChanged(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,String _old,String _new) {
this.parent = parent;
this.__ref = __ref;
this._old = _old;
this._new = _new;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
String _old;
String _new;
int _obtindex = 0;
int _obgindex = 0;
String _obtext = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74579969;
 //BA.debugLineNum = 74579969;BA.debugLine="Dim obtIndex As Int = CLAObjectTypeSpinner.Select";
_obtindex = __ref._claobjecttypespinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74579970;
 //BA.debugLineNum = 74579970;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Selec";
_obgindex = __ref._claobjectgroupspinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74579971;
 //BA.debugLineNum = 74579971;BA.debugLine="ObjectsListIndex = 0";
__ref._objectslistindex /*int*/  = (int) (0);
RDebugUtils.currentLine=74579972;
 //BA.debugLineNum = 74579972;BA.debugLine="Dim obtext As String = New";
_obtext = _new;
RDebugUtils.currentLine=74579973;
 //BA.debugLineNum = 74579973;BA.debugLine="If(Utils.NNE(obtext)) Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((parent._utils._nne /*boolean*/ (ba,_obtext))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=74579974;
 //BA.debugLineNum = 74579974;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtInde";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = __ref._getobjectslist /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_obtindex,_obgindex,_obtext,parent.__c.True);
RDebugUtils.currentLine=74579975;
 //BA.debugLineNum = 74579975;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "claobjectdesc_textchanged"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_finish = (Boolean) result[1];
;
RDebugUtils.currentLine=74579976;
 //BA.debugLineNum = 74579976;BA.debugLine="If(finish) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_finish)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=74579977;
 //BA.debugLineNum = 74579977;BA.debugLine="Log(finish)";
parent.__c.LogImpl("674579977",BA.ObjectToString(_finish),0);
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=74579980;
 //BA.debugLineNum = 74579980;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getobjectslist(xevolution.vrcg.devdemov2400.appdialogs __ref,int _objecttypeindex,int _objectgroupindex,String _objectdesctext,boolean _newrequest) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getobjectslist", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getobjectslist", new Object[] {_objecttypeindex,_objectgroupindex,_objectdesctext,_newrequest}));}
ResumableSub_GetObjectsList rsub = new ResumableSub_GetObjectsList(this,__ref,_objecttypeindex,_objectgroupindex,_objectdesctext,_newrequest);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetObjectsList extends BA.ResumableSub {
public ResumableSub_GetObjectsList(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,int _objecttypeindex,int _objectgroupindex,String _objectdesctext,boolean _newrequest) {
this.parent = parent;
this.__ref = __ref;
this._objecttypeindex = _objecttypeindex;
this._objectgroupindex = _objectgroupindex;
this._objectdesctext = _objectdesctext;
this._newrequest = _newrequest;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
int _objecttypeindex;
int _objectgroupindex;
String _objectdesctext;
boolean _newrequest;
boolean _result = false;
String _stype = "";
xevolution.vrcg.devdemov2400.types._db_itc _itc = null;
String _sgroup = "";
String _sdesc = "";
String _ssql = "";
String _lastgroup = "";
int _recordrowcount = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
String _object_type = "";
String _objecttype_desc = "";
String _title_import = "";
String _tagcode = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74645505;
 //BA.debugLineNum = 74645505;BA.debugLine="Dim result As Boolean = False";
_result = parent.__c.False;
RDebugUtils.currentLine=74645506;
 //BA.debugLineNum = 74645506;BA.debugLine="If(newRequest) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_newrequest)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=74645507;
 //BA.debugLineNum = 74645507;BA.debugLine="CLAObjectList.Clear";
__ref._claobjectlist /*b4a.example3.customlistview*/ ._clear();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=74645510;
 //BA.debugLineNum = 74645510;BA.debugLine="Dim sType As String = \"\"";
_stype = "";
RDebugUtils.currentLine=74645511;
 //BA.debugLineNum = 74645511;BA.debugLine="If ObjectTypeIndex > 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_objecttypeindex>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=74645512;
 //BA.debugLineNum = 74645512;BA.debugLine="Dim itc As DB_ITC = OBJ_Types.Get(ObjectTypeInde";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._obj_types /*anywheresoftware.b4a.objects.collections.List*/ .Get(_objecttypeindex));
RDebugUtils.currentLine=74645513;
 //BA.debugLineNum = 74645513;BA.debugLine="sType = $\" and (b.id=${itc.ID}) \"$";
_stype = (" and (b.id="+parent.__c.SmartStringFormatter("",(Object)(_itc.ID /*int*/ ))+") ");
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=74645516;
 //BA.debugLineNum = 74645516;BA.debugLine="Dim sGroup As String = \"\"";
_sgroup = "";
RDebugUtils.currentLine=74645517;
 //BA.debugLineNum = 74645517;BA.debugLine="If ObjectGroupIndex > 0 Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_objectgroupindex>0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=74645518;
 //BA.debugLineNum = 74645518;BA.debugLine="Dim itc As DB_ITC = OBJ_Groups.Get(ObjectGroupIn";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._obj_groups /*anywheresoftware.b4a.objects.collections.List*/ .Get(_objectgroupindex));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=74645521;
 //BA.debugLineNum = 74645521;BA.debugLine="Dim sDesc As String = \"\"";
_sdesc = "";
RDebugUtils.currentLine=74645522;
 //BA.debugLineNum = 74645522;BA.debugLine="If Utils.NNE(ObjectDescText) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (parent._utils._nne /*boolean*/ (ba,_objectdesctext)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=74645523;
 //BA.debugLineNum = 74645523;BA.debugLine="sDesc = $\" and (a.title_import||a.tagcode||a.ref";
_sdesc = (" and (a.title_import||a.tagcode||a.reference||b.title like '%"+parent.__c.SmartStringFormatter("",(Object)(_objectdesctext.trim()))+"%') ");
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=74645526;
 //BA.debugLineNum = 74645526;BA.debugLine="Dim sSQL As String = $\"select a.id, a.tagcode, a.";
_ssql = ("select a.id, a.tagcode, a.object_type, a.title_import, a.`status`, ifnull(b.title, '') as objecttype_desc,\n"+"		a.reference\n"+"		from dta_objects as a inner join dta_objecttypes as b on (b.tagcode=a.object_type)\n"+"		where a.active=1 and b.active=1 and a.`status`<=1 and a.tagcode<>'__NONE__' and a.title_import<>'Insira um descritivo/título'\n"+"		"+parent.__c.SmartStringFormatter("",(Object)(_stype))+""+parent.__c.SmartStringFormatter("",(Object)(_sgroup))+""+parent.__c.SmartStringFormatter("",(Object)(_sdesc))+"\n"+"		group by b.title, a.id, a.tagcode, a.object_type, a.title_import, a.`status`\n"+"			order by b.title, a.title_import limit "+parent.__c.SmartStringFormatter("",(Object)(__ref._objectslistindex /*int*/ ))+", 10");
RDebugUtils.currentLine=74645533;
 //BA.debugLineNum = 74645533;BA.debugLine="Log(sSQL)";
parent.__c.LogImpl("674645533",_ssql,0);
RDebugUtils.currentLine=74645535;
 //BA.debugLineNum = 74645535;BA.debugLine="Dim LastGroup As String = \"\"";
_lastgroup = "";
RDebugUtils.currentLine=74645536;
 //BA.debugLineNum = 74645536;BA.debugLine="Dim RecordRowCount As Int = 0";
_recordrowcount = (int) (0);
RDebugUtils.currentLine=74645537;
 //BA.debugLineNum = 74645537;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=74645539;
 //BA.debugLineNum = 74645539;BA.debugLine="Do While Record.NextRow";
if (true) break;

case 17:
//do while
this.state = 28;
while (_record.NextRow()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=74645540;
 //BA.debugLineNum = 74645540;BA.debugLine="Dim object_type As String = Record.GetString(\"o";
_object_type = _record.GetString("object_type");
RDebugUtils.currentLine=74645541;
 //BA.debugLineNum = 74645541;BA.debugLine="Dim objecttype_desc As String = Record.GetStrin";
_objecttype_desc = _record.GetString("objecttype_desc");
RDebugUtils.currentLine=74645542;
 //BA.debugLineNum = 74645542;BA.debugLine="Dim title_import As String = Record.GetString(\"";
_title_import = _record.GetString("title_import");
RDebugUtils.currentLine=74645543;
 //BA.debugLineNum = 74645543;BA.debugLine="Dim tagcode As String = Record.GetString(\"tagco";
_tagcode = _record.GetString("tagcode");
RDebugUtils.currentLine=74645544;
 //BA.debugLineNum = 74645544;BA.debugLine="If(newRequest) Then";
if (true) break;

case 20:
//if
this.state = 27;
if ((_newrequest)) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=74645545;
 //BA.debugLineNum = 74645545;BA.debugLine="If (object_type.Trim <> LastGroup.Trim) Then";
if (true) break;

case 23:
//if
this.state = 26;
if (((_object_type.trim()).equals(_lastgroup.trim()) == false)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=74645546;
 //BA.debugLineNum = 74645546;BA.debugLine="LastGroup = object_type";
_lastgroup = _object_type;
RDebugUtils.currentLine=74645547;
 //BA.debugLineNum = 74645547;BA.debugLine="CLAObjectList.Add( createObjGroupLineItemDeta";
__ref._claobjectlist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createobjgrouplineitemdetailview /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,_objecttype_desc,parent.__c.DipToCurrent((int) (45))).getObject())),(Object)(_object_type));
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 17;
;
RDebugUtils.currentLine=74645551;
 //BA.debugLineNum = 74645551;BA.debugLine="CLAObjectList.Add(createObjectLineItemDetailVie";
__ref._claobjectlist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createobjectlineitemdetailview /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,_tagcode,_title_import,_objecttype_desc,parent.__c.DipToCurrent((int) (45))).getObject())),(Object)(""));
RDebugUtils.currentLine=74645552;
 //BA.debugLineNum = 74645552;BA.debugLine="RecordRowCount = RecordRowCount +1";
_recordrowcount = (int) (_recordrowcount+1);
RDebugUtils.currentLine=74645553;
 //BA.debugLineNum = 74645553;BA.debugLine="result = True";
_result = parent.__c.True;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=74645555;
 //BA.debugLineNum = 74645555;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=74645558;
 //BA.debugLineNum = 74645558;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=74645559;
 //BA.debugLineNum = 74645559;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _claobjectgroupspinner_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "claobjectgroupspinner_itemclick", false))
	 {Debug.delegate(ba, "claobjectgroupspinner_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_CLAObjectGroupSpinner_ItemClick rsub = new ResumableSub_CLAObjectGroupSpinner_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_CLAObjectGroupSpinner_ItemClick extends BA.ResumableSub {
public ResumableSub_CLAObjectGroupSpinner_ItemClick(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
int _position;
Object _value;
int _obtindex = 0;
int _obgindex = 0;
String _obtext = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74711041;
 //BA.debugLineNum = 74711041;BA.debugLine="Dim obtIndex As Int = CLAObjectTypeSpinner.Select";
_obtindex = __ref._claobjecttypespinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74711042;
 //BA.debugLineNum = 74711042;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Selec";
_obgindex = __ref._claobjectgroupspinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74711043;
 //BA.debugLineNum = 74711043;BA.debugLine="Dim obtext As String = CLAObjectDesc.Text";
_obtext = __ref._claobjectdesc /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=74711044;
 //BA.debugLineNum = 74711044;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtIndex";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = __ref._getobjectslist /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_obtindex,_obgindex,_obtext,parent.__c.True);
RDebugUtils.currentLine=74711045;
 //BA.debugLineNum = 74711045;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "claobjectgroupspinner_itemclick"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_finish = (Boolean) result[1];
;
RDebugUtils.currentLine=74711046;
 //BA.debugLineNum = 74711046;BA.debugLine="If(finish) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=74711047;
 //BA.debugLineNum = 74711047;BA.debugLine="Log(finish)";
parent.__c.LogImpl("674711047",BA.ObjectToString(_finish),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=74711049;
 //BA.debugLineNum = 74711049;BA.debugLine="ObjectsListIndex = 0";
__ref._objectslistindex /*int*/  = (int) (0);
RDebugUtils.currentLine=74711050;
 //BA.debugLineNum = 74711050;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _claobjectlist_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "claobjectlist_itemclick", false))
	 {return ((String) Debug.delegate(ba, "claobjectlist_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=73924608;
 //BA.debugLineNum = 73924608;BA.debugLine="Sub CLAObjectList_ItemClick (Index As Int, Value A";
RDebugUtils.currentLine=73924609;
 //BA.debugLineNum = 73924609;BA.debugLine="Dim pan As B4XView = CLAObjectList.GetPanel(Index";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = __ref._claobjectlist /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=73924610;
 //BA.debugLineNum = 73924610;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=73924611;
 //BA.debugLineNum = 73924611;BA.debugLine="lbl.Color = 0x9637FF4B";
_lbl.setColor((int) (0x9637ff4b));
RDebugUtils.currentLine=73924612;
 //BA.debugLineNum = 73924612;BA.debugLine="CurrentSelectedCode = lbl.Tag";
__ref._currentselectedcode /*String*/  = BA.ObjectToString(_lbl.getTag());
RDebugUtils.currentLine=73924613;
 //BA.debugLineNum = 73924613;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(__c.DialogResponse.POSITIVE).setEnabled(_utils._nne /*boolean*/ (ba,__ref._currentselectedcode /*String*/ ));
RDebugUtils.currentLine=73924614;
 //BA.debugLineNum = 73924614;BA.debugLine="End Sub";
return "";
}
public void  _claobjectlist_reachend(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "claobjectlist_reachend", false))
	 {Debug.delegate(ba, "claobjectlist_reachend", null); return;}
ResumableSub_CLAObjectList_ReachEnd rsub = new ResumableSub_CLAObjectList_ReachEnd(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CLAObjectList_ReachEnd extends BA.ResumableSub {
public ResumableSub_CLAObjectList_ReachEnd(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
int _obtindex = 0;
int _obgindex = 0;
String _obtext = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74776577;
 //BA.debugLineNum = 74776577;BA.debugLine="ObjectsListIndex = ObjectsListIndex + 10";
__ref._objectslistindex /*int*/  = (int) (__ref._objectslistindex /*int*/ +10);
RDebugUtils.currentLine=74776578;
 //BA.debugLineNum = 74776578;BA.debugLine="Dim obtIndex As Int = CLAObjectTypeSpinner.Select";
_obtindex = __ref._claobjecttypespinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74776579;
 //BA.debugLineNum = 74776579;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Selec";
_obgindex = __ref._claobjectgroupspinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74776580;
 //BA.debugLineNum = 74776580;BA.debugLine="Dim obtext As String = CLAObjectDesc.Text";
_obtext = __ref._claobjectdesc /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=74776582;
 //BA.debugLineNum = 74776582;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtIndex";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = __ref._getobjectslist /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_obtindex,_obgindex,_obtext,parent.__c.False);
RDebugUtils.currentLine=74776583;
 //BA.debugLineNum = 74776583;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "claobjectlist_reachend"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_finish = (Boolean) result[1];
;
RDebugUtils.currentLine=74776584;
 //BA.debugLineNum = 74776584;BA.debugLine="If(finish) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=74776585;
 //BA.debugLineNum = 74776585;BA.debugLine="Log(finish)";
parent.__c.LogImpl("674776585",BA.ObjectToString(_finish),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=74776589;
 //BA.debugLineNum = 74776589;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _claobjecttypespinner_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "claobjecttypespinner_itemclick", false))
	 {Debug.delegate(ba, "claobjecttypespinner_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_CLAObjectTypeSpinner_ItemClick rsub = new ResumableSub_CLAObjectTypeSpinner_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_CLAObjectTypeSpinner_ItemClick extends BA.ResumableSub {
public ResumableSub_CLAObjectTypeSpinner_ItemClick(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
int _position;
Object _value;
int _obtindex = 0;
int _obgindex = 0;
String _obtext = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74317825;
 //BA.debugLineNum = 74317825;BA.debugLine="Dim obtIndex As Int = CLAObjectTypeSpinner.Select";
_obtindex = __ref._claobjecttypespinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74317826;
 //BA.debugLineNum = 74317826;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Selec";
_obgindex = __ref._claobjectgroupspinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74317827;
 //BA.debugLineNum = 74317827;BA.debugLine="Dim obtext As String = CLAObjectDesc.Text";
_obtext = __ref._claobjectdesc /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=74317828;
 //BA.debugLineNum = 74317828;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtIndex";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = __ref._getobjectslist /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_obtindex,_obgindex,_obtext,parent.__c.True);
RDebugUtils.currentLine=74317829;
 //BA.debugLineNum = 74317829;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "claobjecttypespinner_itemclick"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_finish = (Boolean) result[1];
;
RDebugUtils.currentLine=74317830;
 //BA.debugLineNum = 74317830;BA.debugLine="If(finish) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=74317831;
 //BA.debugLineNum = 74317831;BA.debugLine="Log(finish)";
parent.__c.LogImpl("674317831",BA.ObjectToString(_finish),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=74317833;
 //BA.debugLineNum = 74317833;BA.debugLine="ObjectsListIndex = 0";
__ref._objectslistindex /*int*/  = (int) (0);
RDebugUtils.currentLine=74317834;
 //BA.debugLineNum = 74317834;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
RDebugUtils.currentLine=71434240;
 //BA.debugLineNum = 71434240;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=71434242;
 //BA.debugLineNum = 71434242;BA.debugLine="Private DialogFirstName As FloatLabeledEditText";
_dialogfirstname = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434243;
 //BA.debugLineNum = 71434243;BA.debugLine="Private DialogLastName As FloatLabeledEditText";
_dialoglastname = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434244;
 //BA.debugLineNum = 71434244;BA.debugLine="Private DialogAge As Spinner";
_dialogage = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434245;
 //BA.debugLineNum = 71434245;BA.debugLine="Private CurrentActivityObject As Object";
_currentactivityobject = new Object();
RDebugUtils.currentLine=71434246;
 //BA.debugLineNum = 71434246;BA.debugLine="Private CurrentPosition As Int = 0";
_currentposition = (int) (0);
RDebugUtils.currentLine=71434247;
 //BA.debugLineNum = 71434247;BA.debugLine="Private CurrentImagesView As List";
_currentimagesview = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71434248;
 //BA.debugLineNum = 71434248;BA.debugLine="Public CurrentSelectedCode As String";
_currentselectedcode = "";
RDebugUtils.currentLine=71434249;
 //BA.debugLineNum = 71434249;BA.debugLine="Public SelectedObjectTypeTagcode As String";
_selectedobjecttypetagcode = "";
RDebugUtils.currentLine=71434254;
 //BA.debugLineNum = 71434254;BA.debugLine="Private DialogReqEntity As Spinner";
_dialogreqentity = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434255;
 //BA.debugLineNum = 71434255;BA.debugLine="Private DialogReqTypeRequest As Spinner";
_dialogreqtyperequest = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434256;
 //BA.debugLineNum = 71434256;BA.debugLine="Private DialogReqStartDate As FloatLabeledEditTex";
_dialogreqstartdate = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434257;
 //BA.debugLineNum = 71434257;BA.debugLine="Private DialogReqEndDate As FloatLabeledEditText";
_dialogreqenddate = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434258;
 //BA.debugLineNum = 71434258;BA.debugLine="Private DialogReqChecklist As Spinner";
_dialogreqchecklist = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434260;
 //BA.debugLineNum = 71434260;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
_appldialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=71434261;
 //BA.debugLineNum = 71434261;BA.debugLine="Private DialogQuantityValue As FloatLabeledEditTe";
_dialogquantityvalue = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434262;
 //BA.debugLineNum = 71434262;BA.debugLine="Private ReturnQuantityValue As Int = 0";
_returnquantityvalue = (int) (0);
RDebugUtils.currentLine=71434263;
 //BA.debugLineNum = 71434263;BA.debugLine="Private ThisActivity As Activity";
_thisactivity = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=71434264;
 //BA.debugLineNum = 71434264;BA.debugLine="Private ThisActivityName As Object";
_thisactivityname = new Object();
RDebugUtils.currentLine=71434265;
 //BA.debugLineNum = 71434265;BA.debugLine="Private ThisRequestData As RequestData";
_thisrequestdata = new xevolution.vrcg.devdemov2400.types._requestdata();
RDebugUtils.currentLine=71434267;
 //BA.debugLineNum = 71434267;BA.debugLine="Private adps As List";
_adps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71434268;
 //BA.debugLineNum = 71434268;BA.debugLine="Private butReqEndDate As Button";
_butreqenddate = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434269;
 //BA.debugLineNum = 71434269;BA.debugLine="Private butReqStartDate As Button";
_butreqstartdate = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434270;
 //BA.debugLineNum = 71434270;BA.debugLine="Private LGO_PasswordMode As Boolean = True";
_lgo_passwordmode = __c.True;
RDebugUtils.currentLine=71434274;
 //BA.debugLineNum = 71434274;BA.debugLine="Private mainButLoginConfig As Button";
_mainbutloginconfig = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434275;
 //BA.debugLineNum = 71434275;BA.debugLine="Private mainEditLoginUser As EditText";
_maineditloginuser = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434276;
 //BA.debugLineNum = 71434276;BA.debugLine="Private mainEditLoginPassword As EditText";
_maineditloginpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434277;
 //BA.debugLineNum = 71434277;BA.debugLine="Private mainButLoginShowPassword As Button";
_mainbutloginshowpassword = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434278;
 //BA.debugLineNum = 71434278;BA.debugLine="Private mainLoginReminder As CheckBox";
_mainloginreminder = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434283;
 //BA.debugLineNum = 71434283;BA.debugLine="Private DialogReqType As Spinner";
_dialogreqtype = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434284;
 //BA.debugLineNum = 71434284;BA.debugLine="Private DialogReqReason As Spinner";
_dialogreqreason = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434290;
 //BA.debugLineNum = 71434290;BA.debugLine="Private mainEditLoginPasswordConfirm As EditText";
_maineditloginpasswordconfirm = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434292;
 //BA.debugLineNum = 71434292;BA.debugLine="Private CurrentTagcode As String = \"\"";
_currenttagcode = "";
RDebugUtils.currentLine=71434293;
 //BA.debugLineNum = 71434293;BA.debugLine="Private MasterTagcode As String = \"\"";
_mastertagcode = "";
RDebugUtils.currentLine=71434294;
 //BA.debugLineNum = 71434294;BA.debugLine="Private CurrentCLD As CustomLayoutDialog";
_currentcld = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=71434299;
 //BA.debugLineNum = 71434299;BA.debugLine="Private lbltitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434300;
 //BA.debugLineNum = 71434300;BA.debugLine="Private lblsubtitle As Label";
_lblsubtitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434301;
 //BA.debugLineNum = 71434301;BA.debugLine="Private CLVDialog As CustomListView";
_clvdialog = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434307;
 //BA.debugLineNum = 71434307;BA.debugLine="Private lblvehicleName As Label";
_lblvehiclename = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434308;
 //BA.debugLineNum = 71434308;BA.debugLine="Private VIDialog As CustomListView";
_vidialog = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434314;
 //BA.debugLineNum = 71434314;BA.debugLine="Private DialogReqPeriodType As Spinner";
_dialogreqperiodtype = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434319;
 //BA.debugLineNum = 71434319;BA.debugLine="Private DialogReqTypeEntity As Spinner";
_dialogreqtypeentity = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434320;
 //BA.debugLineNum = 71434320;BA.debugLine="Private DialogReqName As FloatLabeledEditText";
_dialogreqname = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434321;
 //BA.debugLineNum = 71434321;BA.debugLine="Private DialogReqAddress As FloatLabeledEditText";
_dialogreqaddress = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434322;
 //BA.debugLineNum = 71434322;BA.debugLine="Private DialogReqRegion As Spinner";
_dialogreqregion = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434323;
 //BA.debugLineNum = 71434323;BA.debugLine="Private DialogReqWithRequests As CheckBox";
_dialogreqwithrequests = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434324;
 //BA.debugLineNum = 71434324;BA.debugLine="Private DialogReqLocal As Spinner";
_dialogreqlocal = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434325;
 //BA.debugLineNum = 71434325;BA.debugLine="Private DialogReqStatus As Spinner";
_dialogreqstatus = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434331;
 //BA.debugLineNum = 71434331;BA.debugLine="Private DialogReqTypeObject As Spinner";
_dialogreqtypeobject = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434340;
 //BA.debugLineNum = 71434340;BA.debugLine="Private DialogAddressType As Spinner";
_dialogaddresstype = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434341;
 //BA.debugLineNum = 71434341;BA.debugLine="Private DialogAddressName As FloatLabeledEditText";
_dialogaddressname = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434342;
 //BA.debugLineNum = 71434342;BA.debugLine="Private DialogAddressName2 As FloatLabeledEditTex";
_dialogaddressname2 = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434343;
 //BA.debugLineNum = 71434343;BA.debugLine="Private DialogAddressCity As FloatLabeledEditText";
_dialogaddresscity = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434344;
 //BA.debugLineNum = 71434344;BA.debugLine="Private DialogAddressPostalCode As FloatLabeledEd";
_dialogaddresspostalcode = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434345;
 //BA.debugLineNum = 71434345;BA.debugLine="Private DialogAddressLatitude As FloatLabeledEdit";
_dialogaddresslatitude = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434346;
 //BA.debugLineNum = 71434346;BA.debugLine="Private DialogAddressLongitude As FloatLabeledEdi";
_dialogaddresslongitude = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434352;
 //BA.debugLineNum = 71434352;BA.debugLine="Private DialogContactType As Spinner";
_dialogcontacttype = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434353;
 //BA.debugLineNum = 71434353;BA.debugLine="Private DialogContactName As FloatLabeledEditText";
_dialogcontactname = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434354;
 //BA.debugLineNum = 71434354;BA.debugLine="Private DialogContactTitle As FloatLabeledEditTex";
_dialogcontacttitle = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434355;
 //BA.debugLineNum = 71434355;BA.debugLine="Private DialogContactEmail As FloatLabeledEditTex";
_dialogcontactemail = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434356;
 //BA.debugLineNum = 71434356;BA.debugLine="Private DialogContactPhone As FloatLabeledEditTex";
_dialogcontactphone = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434362;
 //BA.debugLineNum = 71434362;BA.debugLine="Private DialogPropertyValue As FloatLabeledEditTe";
_dialogpropertyvalue = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434363;
 //BA.debugLineNum = 71434363;BA.debugLine="Private DialogPropertyTitle As Label";
_dialogpropertytitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434368;
 //BA.debugLineNum = 71434368;BA.debugLine="Private ConfigEditVersion As Spinner";
_configeditversion = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434369;
 //BA.debugLineNum = 71434369;BA.debugLine="Private ConfigEditInstance As FloatLabeledEditTex";
_configeditinstance = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434370;
 //BA.debugLineNum = 71434370;BA.debugLine="Private ConfigEditAuth As FloatLabeledEditText";
_configeditauth = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434371;
 //BA.debugLineNum = 71434371;BA.debugLine="Private DialogReqZone As Spinner";
_dialogreqzone = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434372;
 //BA.debugLineNum = 71434372;BA.debugLine="Private DialogReqUpdated As Spinner";
_dialogrequpdated = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434373;
 //BA.debugLineNum = 71434373;BA.debugLine="Private butReqEndTime As Button";
_butreqendtime = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434374;
 //BA.debugLineNum = 71434374;BA.debugLine="Private butReqStartTime As Button";
_butreqstarttime = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434375;
 //BA.debugLineNum = 71434375;BA.debugLine="Private DialogReqStartTime As FloatLabeledEditTex";
_dialogreqstarttime = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434376;
 //BA.debugLineNum = 71434376;BA.debugLine="Private DialogReqEndTime As FloatLabeledEditText";
_dialogreqendtime = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434377;
 //BA.debugLineNum = 71434377;BA.debugLine="Private DialogReqTime As Spinner";
_dialogreqtime = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434378;
 //BA.debugLineNum = 71434378;BA.debugLine="Private DialogDevicePhone As Label";
_dialogdevicephone = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434379;
 //BA.debugLineNum = 71434379;BA.debugLine="Private DialogDeviceDimension As Label";
_dialogdevicedimension = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434380;
 //BA.debugLineNum = 71434380;BA.debugLine="Private DialogDeviceDescription As Label";
_dialogdevicedescription = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434386;
 //BA.debugLineNum = 71434386;BA.debugLine="Private ConfigEditOrientation As Spinner";
_configeditorientation = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434387;
 //BA.debugLineNum = 71434387;BA.debugLine="Private IntputTextField As FloatLabeledEditText";
_intputtextfield = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434388;
 //BA.debugLineNum = 71434388;BA.debugLine="Private SelectOrientation As Spinner";
_selectorientation = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434389;
 //BA.debugLineNum = 71434389;BA.debugLine="Private ListItemsList As CustomListView";
_listitemslist = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434390;
 //BA.debugLineNum = 71434390;BA.debugLine="Private ListItemsListChk As CustomListView ' ALTE";
_listitemslistchk = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434391;
 //BA.debugLineNum = 71434391;BA.debugLine="Private ListItemDesc As Label";
_listitemdesc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434392;
 //BA.debugLineNum = 71434392;BA.debugLine="Private butResetApplication As Button";
_butresetapplication = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434393;
 //BA.debugLineNum = 71434393;BA.debugLine="Private ShowImageView As ImageView";
_showimageview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=71434394;
 //BA.debugLineNum = 71434394;BA.debugLine="Private DialogReqRoute As Spinner";
_dialogreqroute = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434395;
 //BA.debugLineNum = 71434395;BA.debugLine="Private leftPreviewImage As Label";
_leftpreviewimage = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434396;
 //BA.debugLineNum = 71434396;BA.debugLine="Private rightPreviewImage As Label";
_rightpreviewimage = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434397;
 //BA.debugLineNum = 71434397;BA.debugLine="Private lblGroupTitle As Label";
_lblgrouptitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434398;
 //BA.debugLineNum = 71434398;BA.debugLine="Private lblLineData As Label";
_lbllinedata = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434399;
 //BA.debugLineNum = 71434399;BA.debugLine="Private lblLineHeader As Label";
_lbllineheader = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434400;
 //BA.debugLineNum = 71434400;BA.debugLine="Private HiddenListItemLabel As Object";
_hiddenlistitemlabel = new Object();
RDebugUtils.currentLine=71434401;
 //BA.debugLineNum = 71434401;BA.debugLine="Private HiddenListItemTagList As TagListType";
_hiddenlistitemtaglist = new xevolution.vrcg.devdemov2400.types._taglisttype();
RDebugUtils.currentLine=71434402;
 //BA.debugLineNum = 71434402;BA.debugLine="Private ParamItemsList As CustomListView";
_paramitemslist = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434403;
 //BA.debugLineNum = 71434403;BA.debugLine="Private ButParamItem As B4XStateButton";
_butparamitem = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=71434404;
 //BA.debugLineNum = 71434404;BA.debugLine="Private ThisTagItem As TagListType";
_thistagitem = new xevolution.vrcg.devdemov2400.types._taglisttype();
RDebugUtils.currentLine=71434406;
 //BA.debugLineNum = 71434406;BA.debugLine="Private ThisStartDate As Label";
_thisstartdate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434407;
 //BA.debugLineNum = 71434407;BA.debugLine="Private CheckValueEdit As EditText";
_checkvalueedit = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434408;
 //BA.debugLineNum = 71434408;BA.debugLine="Private ValidationButton As Button";
_validationbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434409;
 //BA.debugLineNum = 71434409;BA.debugLine="Private ResultDataLabel As Label";
_resultdatalabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434410;
 //BA.debugLineNum = 71434410;BA.debugLine="Private ROBut_09 As Button";
_robut_09 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434411;
 //BA.debugLineNum = 71434411;BA.debugLine="Private ROBut_08 As Button";
_robut_08 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434412;
 //BA.debugLineNum = 71434412;BA.debugLine="Private ROBut_07 As Button";
_robut_07 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434413;
 //BA.debugLineNum = 71434413;BA.debugLine="Private ROBut_06 As Button";
_robut_06 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434414;
 //BA.debugLineNum = 71434414;BA.debugLine="Private ROBut_05 As Button";
_robut_05 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434415;
 //BA.debugLineNum = 71434415;BA.debugLine="Private ROBut_04 As Button";
_robut_04 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434416;
 //BA.debugLineNum = 71434416;BA.debugLine="Private ROBut_03 As Button";
_robut_03 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434417;
 //BA.debugLineNum = 71434417;BA.debugLine="Private ROBut_02 As Button";
_robut_02 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434418;
 //BA.debugLineNum = 71434418;BA.debugLine="Private ROBut_01 As Button";
_robut_01 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434419;
 //BA.debugLineNum = 71434419;BA.debugLine="Private EditParamItem As EditText";
_editparamitem = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434420;
 //BA.debugLineNum = 71434420;BA.debugLine="Private PushRequestEdit As EditText";
_pushrequestedit = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434421;
 //BA.debugLineNum = 71434421;BA.debugLine="Private ListItemsRequest As CustomListView";
_listitemsrequest = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434422;
 //BA.debugLineNum = 71434422;BA.debugLine="Private LastIndexList As Int = 0";
_lastindexlist = (int) (0);
RDebugUtils.currentLine=71434424;
 //BA.debugLineNum = 71434424;BA.debugLine="Private TBSingular As ToggleButton";
_tbsingular = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434425;
 //BA.debugLineNum = 71434425;BA.debugLine="Private TBPlural As ToggleButton";
_tbplural = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434426;
 //BA.debugLineNum = 71434426;BA.debugLine="Private TBActive As ToggleButton";
_tbactive = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434427;
 //BA.debugLineNum = 71434427;BA.debugLine="Private TBInactive As ToggleButton";
_tbinactive = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434428;
 //BA.debugLineNum = 71434428;BA.debugLine="Private TB001 As ToggleButton";
_tb001 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434429;
 //BA.debugLineNum = 71434429;BA.debugLine="Private TB002 As ToggleButton";
_tb002 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434430;
 //BA.debugLineNum = 71434430;BA.debugLine="Private TB003 As ToggleButton";
_tb003 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434431;
 //BA.debugLineNum = 71434431;BA.debugLine="Private TB004 As ToggleButton";
_tb004 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434432;
 //BA.debugLineNum = 71434432;BA.debugLine="Private TB005 As ToggleButton";
_tb005 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=71434433;
 //BA.debugLineNum = 71434433;BA.debugLine="Private CLAObjectList As CustomListView";
_claobjectlist = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434434;
 //BA.debugLineNum = 71434434;BA.debugLine="Private CancelSelectObjectButton As Button";
_cancelselectobjectbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434435;
 //BA.debugLineNum = 71434435;BA.debugLine="Private CLAObjectDesc As EditText";
_claobjectdesc = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434436;
 //BA.debugLineNum = 71434436;BA.debugLine="Private suggestObjectButton As Button";
_suggestobjectbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434437;
 //BA.debugLineNum = 71434437;BA.debugLine="Private CLAObjectFind As Button";
_claobjectfind = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434438;
 //BA.debugLineNum = 71434438;BA.debugLine="Private CLAObjectClear As Button";
_claobjectclear = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434439;
 //BA.debugLineNum = 71434439;BA.debugLine="Private CLAObjectGroupSpinner As Spinner";
_claobjectgroupspinner = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434440;
 //BA.debugLineNum = 71434440;BA.debugLine="Private CLAObjectTypeSpinner As Spinner";
_claobjecttypespinner = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434441;
 //BA.debugLineNum = 71434441;BA.debugLine="Private createObjectConfirmButton As Button";
_createobjectconfirmbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434442;
 //BA.debugLineNum = 71434442;BA.debugLine="Private createObjectCancelButton As Button";
_createobjectcancelbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434443;
 //BA.debugLineNum = 71434443;BA.debugLine="Private ObjectTypeListView As CustomListView";
_objecttypelistview = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434444;
 //BA.debugLineNum = 71434444;BA.debugLine="Private selectObjectPanel As Panel";
_selectobjectpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=71434445;
 //BA.debugLineNum = 71434445;BA.debugLine="Private objectTypePanel As Panel";
_objecttypepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=71434446;
 //BA.debugLineNum = 71434446;BA.debugLine="Private createObjectPanel As Panel";
_createobjectpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=71434447;
 //BA.debugLineNum = 71434447;BA.debugLine="Private lblGroupObjectTitle As Label";
_lblgroupobjecttitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434448;
 //BA.debugLineNum = 71434448;BA.debugLine="Private ObjectsListIndex As Int = 0";
_objectslistindex = (int) (0);
RDebugUtils.currentLine=71434450;
 //BA.debugLineNum = 71434450;BA.debugLine="Private OBJ_Types As List";
_obj_types = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71434451;
 //BA.debugLineNum = 71434451;BA.debugLine="Private OBJ_Groups As List";
_obj_groups = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71434458;
 //BA.debugLineNum = 71434458;BA.debugLine="Private ListViewBluetoothDevices As ListView";
_listviewbluetoothdevices = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=71434459;
 //BA.debugLineNum = 71434459;BA.debugLine="Private Printer As BT_Printer";
_printer = new b4a.example.bt_printer();
RDebugUtils.currentLine=71434460;
 //BA.debugLineNum = 71434460;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=71434461;
 //BA.debugLineNum = 71434461;BA.debugLine="Private CurrentPrinterConnected As Object";
_currentprinterconnected = new Object();
RDebugUtils.currentLine=71434462;
 //BA.debugLineNum = 71434462;BA.debugLine="Private ButtonAssociated As Button";
_buttonassociated = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434463;
 //BA.debugLineNum = 71434463;BA.debugLine="Private ButtonScanPrinter As Button";
_buttonscanprinter = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434464;
 //BA.debugLineNum = 71434464;BA.debugLine="Private ButtonPrint As Button";
_buttonprint = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434465;
 //BA.debugLineNum = 71434465;BA.debugLine="Private PrinterMessage As String";
_printermessage = "";
RDebugUtils.currentLine=71434466;
 //BA.debugLineNum = 71434466;BA.debugLine="Private DialogDeviceVersion As Label";
_dialogdeviceversion = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434468;
 //BA.debugLineNum = 71434468;BA.debugLine="Private FilterLabelTipoIntervencao As Label";
_filterlabeltipointervencao = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434469;
 //BA.debugLineNum = 71434469;BA.debugLine="Private FilterLabelEntidade As Label";
_filterlabelentidade = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434470;
 //BA.debugLineNum = 71434470;BA.debugLine="Private FilterLabelEstadosIntervencao As Label";
_filterlabelestadosintervencao = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434471;
 //BA.debugLineNum = 71434471;BA.debugLine="Private FilterLabelDataInicio As Label";
_filterlabeldatainicio = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434472;
 //BA.debugLineNum = 71434472;BA.debugLine="Private FilterLabelDataFim As Label";
_filterlabeldatafim = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434473;
 //BA.debugLineNum = 71434473;BA.debugLine="Private FilterLabelTipoChecklist As Label";
_filterlabeltipochecklist = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434474;
 //BA.debugLineNum = 71434474;BA.debugLine="Private FilterLabelRota As Label";
_filterlabelrota = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434479;
 //BA.debugLineNum = 71434479;BA.debugLine="Private DialogReqCause As Spinner";
_dialogreqcause = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434480;
 //BA.debugLineNum = 71434480;BA.debugLine="Private DialogReqDateRMJ As FloatLabeledEditText";
_dialogreqdatermj = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434481;
 //BA.debugLineNum = 71434481;BA.debugLine="Private DialogReqTimeRMJ As FloatLabeledEditText";
_dialogreqtimermj = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434482;
 //BA.debugLineNum = 71434482;BA.debugLine="Private butReqDateRMJ As Button";
_butreqdatermj = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434483;
 //BA.debugLineNum = 71434483;BA.debugLine="Private butReqTimeRMJ As Button";
_butreqtimermj = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434484;
 //BA.debugLineNum = 71434484;BA.debugLine="Private textoRMJ As ACEditText";
_textormj = new de.amberhome.objects.appcompat.ACEditTextWrapper();
RDebugUtils.currentLine=71434485;
 //BA.debugLineNum = 71434485;BA.debugLine="Private Painel_Historico_RMJ As Panel";
_painel_historico_rmj = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=71434486;
 //BA.debugLineNum = 71434486;BA.debugLine="Private DialogReqReasonRMJ As Spinner";
_dialogreqreasonrmj = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434487;
 //BA.debugLineNum = 71434487;BA.debugLine="Private DialogReqCauseRMJ As Spinner";
_dialogreqcausermj = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=71434488;
 //BA.debugLineNum = 71434488;BA.debugLine="Private EditTextJustificacaoRMJ As EditText";
_edittextjustificacaormj = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434493;
 //BA.debugLineNum = 71434493;BA.debugLine="Private BoxEditFullText As EditText";
_boxeditfulltext = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434499;
 //BA.debugLineNum = 71434499;BA.debugLine="Private BoxEditSearchedValue As EditText";
_boxeditsearchedvalue = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434500;
 //BA.debugLineNum = 71434500;BA.debugLine="Private PassScript As String";
_passscript = "";
RDebugUtils.currentLine=71434501;
 //BA.debugLineNum = 71434501;BA.debugLine="Private mapList As Map";
_maplist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=71434502;
 //BA.debugLineNum = 71434502;BA.debugLine="Private SearchDummy As String";
_searchdummy = "";
RDebugUtils.currentLine=71434503;
 //BA.debugLineNum = 71434503;BA.debugLine="Private btnUserFilter As Button";
_btnuserfilter = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434504;
 //BA.debugLineNum = 71434504;BA.debugLine="Private lblSearchChoosenItem As Label";
_lblsearchchoosenitem = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434505;
 //BA.debugLineNum = 71434505;BA.debugLine="Private Lista2Search As CustomListView";
_lista2search = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434506;
 //BA.debugLineNum = 71434506;BA.debugLine="Private label2search1 As Label";
_label2search1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434507;
 //BA.debugLineNum = 71434507;BA.debugLine="Private PassedAct As Activity";
_passedact = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=71434508;
 //BA.debugLineNum = 71434508;BA.debugLine="Private StartingRow As Int = 0";
_startingrow = (int) (0);
RDebugUtils.currentLine=71434509;
 //BA.debugLineNum = 71434509;BA.debugLine="Private NextStartingRow As Int = 0";
_nextstartingrow = (int) (0);
RDebugUtils.currentLine=71434510;
 //BA.debugLineNum = 71434510;BA.debugLine="Private ReadRows As Int = 25";
_readrows = (int) (25);
RDebugUtils.currentLine=71434513;
 //BA.debugLineNum = 71434513;BA.debugLine="Private ListaOutros As CustomListView";
_listaoutros = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434514;
 //BA.debugLineNum = 71434514;BA.debugLine="Private editTextOutros As EditText";
_edittextoutros = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434515;
 //BA.debugLineNum = 71434515;BA.debugLine="Private lblTitleOutros As Label";
_lbltitleoutros = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434521;
 //BA.debugLineNum = 71434521;BA.debugLine="Private sync_manual_Btn_edate As Button";
_sync_manual_btn_edate = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434522;
 //BA.debugLineNum = 71434522;BA.debugLine="Private sync_manual_Btn_idate As Button";
_sync_manual_btn_idate = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434523;
 //BA.debugLineNum = 71434523;BA.debugLine="Private sync_manual_chk1 As CheckBox";
_sync_manual_chk1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434524;
 //BA.debugLineNum = 71434524;BA.debugLine="Private sync_manual_chk10 As CheckBox";
_sync_manual_chk10 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434525;
 //BA.debugLineNum = 71434525;BA.debugLine="Private sync_manual_chk11 As CheckBox";
_sync_manual_chk11 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434526;
 //BA.debugLineNum = 71434526;BA.debugLine="Private sync_manual_chk12 As CheckBox";
_sync_manual_chk12 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434527;
 //BA.debugLineNum = 71434527;BA.debugLine="Private sync_manual_chk2 As CheckBox";
_sync_manual_chk2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434528;
 //BA.debugLineNum = 71434528;BA.debugLine="Private sync_manual_chk3 As CheckBox";
_sync_manual_chk3 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434529;
 //BA.debugLineNum = 71434529;BA.debugLine="Private sync_manual_chk4 As CheckBox";
_sync_manual_chk4 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434530;
 //BA.debugLineNum = 71434530;BA.debugLine="Private sync_manual_chk5 As CheckBox";
_sync_manual_chk5 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434531;
 //BA.debugLineNum = 71434531;BA.debugLine="Private sync_manual_chk6 As CheckBox";
_sync_manual_chk6 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434532;
 //BA.debugLineNum = 71434532;BA.debugLine="Private sync_manual_chk7 As CheckBox";
_sync_manual_chk7 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434533;
 //BA.debugLineNum = 71434533;BA.debugLine="Private sync_manual_chk8 As CheckBox";
_sync_manual_chk8 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434534;
 //BA.debugLineNum = 71434534;BA.debugLine="Private sync_manual_chk9 As CheckBox";
_sync_manual_chk9 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434535;
 //BA.debugLineNum = 71434535;BA.debugLine="Private sync_manual_edate As FloatLabeledEditText";
_sync_manual_edate = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434536;
 //BA.debugLineNum = 71434536;BA.debugLine="Private sync_manual_idate As FloatLabeledEditText";
_sync_manual_idate = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434537;
 //BA.debugLineNum = 71434537;BA.debugLine="Private sync_manual_Radio_diaria As RadioButton";
_sync_manual_radio_diaria = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=71434538;
 //BA.debugLineNum = 71434538;BA.debugLine="Private sync_manual_Radio_seleccao As RadioButton";
_sync_manual_radio_seleccao = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=71434539;
 //BA.debugLineNum = 71434539;BA.debugLine="Private sync_manual_Radio_todos As RadioButton";
_sync_manual_radio_todos = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=71434540;
 //BA.debugLineNum = 71434540;BA.debugLine="Private sync_manual_warning As Label";
_sync_manual_warning = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434541;
 //BA.debugLineNum = 71434541;BA.debugLine="Private sync_manual_chk_docs_templates As CheckBo";
_sync_manual_chk_docs_templates = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434542;
 //BA.debugLineNum = 71434542;BA.debugLine="Private BoxEditNumberText As FloatLabeledEditText";
_boxeditnumbertext = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=71434543;
 //BA.debugLineNum = 71434543;BA.debugLine="Private BoxEditNumberTextEDIT As EditText";
_boxeditnumbertextedit = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434544;
 //BA.debugLineNum = 71434544;BA.debugLine="Private DataVazia As Boolean = True";
_datavazia = __c.True;
RDebugUtils.currentLine=71434546;
 //BA.debugLineNum = 71434546;BA.debugLine="Private btnUserFilter As Button";
_btnuserfilter = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434547;
 //BA.debugLineNum = 71434547;BA.debugLine="Private lblSearchChoosenItem As Label";
_lblsearchchoosenitem = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434550;
 //BA.debugLineNum = 71434550;BA.debugLine="Private sync_manual_downloadrunfirstintall As Che";
_sync_manual_downloadrunfirstintall = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434551;
 //BA.debugLineNum = 71434551;BA.debugLine="Private sync_manual_runfirstintall As CheckBox";
_sync_manual_runfirstintall = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434552;
 //BA.debugLineNum = 71434552;BA.debugLine="Private PanelMestres As Panel";
_panelmestres = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=71434553;
 //BA.debugLineNum = 71434553;BA.debugLine="Private sync_manual_Radio_mestres As RadioButton";
_sync_manual_radio_mestres = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=71434554;
 //BA.debugLineNum = 71434554;BA.debugLine="Private DisclaimerMestres As Label";
_disclaimermestres = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71434555;
 //BA.debugLineNum = 71434555;BA.debugLine="Private panel_SyncManual_Upload As Panel";
_panel_syncmanual_upload = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=71434556;
 //BA.debugLineNum = 71434556;BA.debugLine="Private panel_SyncManual_Download As Panel";
_panel_syncmanual_download = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=71434557;
 //BA.debugLineNum = 71434557;BA.debugLine="Private btn_Upload_SyncManual As Button";
_btn_upload_syncmanual = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434558;
 //BA.debugLineNum = 71434558;BA.debugLine="Private btn_Download_SyncManual As Button";
_btn_download_syncmanual = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=71434559;
 //BA.debugLineNum = 71434559;BA.debugLine="Private lstOfflineData As CustomListView";
_lstofflinedata = new b4a.example3.customlistview();
RDebugUtils.currentLine=71434560;
 //BA.debugLineNum = 71434560;BA.debugLine="Private ChkReqOffline As CheckBox";
_chkreqoffline = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=71434561;
 //BA.debugLineNum = 71434561;BA.debugLine="Private txtReqOffline As EditText";
_txtreqoffline = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=71434562;
 //BA.debugLineNum = 71434562;BA.debugLine="Private CurrActiv As Activity";
_curractiv = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=71434564;
 //BA.debugLineNum = 71434564;BA.debugLine="End Sub";
return "";
}
public String  _clvdialog_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "clvdialog_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvdialog_itemclick", new Object[] {_index,_value}));}
b4a.example3.customlistview _clv = null;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
RDebugUtils.currentLine=76152832;
 //BA.debugLineNum = 76152832;BA.debugLine="Sub CLVDialog_ItemClick (Index As Int, Value As Ob";
RDebugUtils.currentLine=76152833;
 //BA.debugLineNum = 76152833;BA.debugLine="Dim clv As CustomListView = Sender";
_clv = (b4a.example3.customlistview)(__c.Sender(ba));
RDebugUtils.currentLine=76152834;
 //BA.debugLineNum = 76152834;BA.debugLine="Dim pan As Panel = clv.GetPanel(Index)";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clv._getpanel(_index).getObject()));
RDebugUtils.currentLine=76152835;
 //BA.debugLineNum = 76152835;BA.debugLine="Log(pan.Tag)";
__c.LogImpl("676152835",BA.ObjectToString(_pan.getTag()),0);
RDebugUtils.currentLine=76152836;
 //BA.debugLineNum = 76152836;BA.debugLine="CurrentTagcode = pan.Tag";
__ref._currenttagcode /*String*/  = BA.ObjectToString(_pan.getTag());
RDebugUtils.currentLine=76152837;
 //BA.debugLineNum = 76152837;BA.debugLine="CallSub3(ThisActivityName, \"ChangeUserEquipment\",";
__c.CallSubDebug3(ba,__ref._thisactivityname /*Object*/ ,"ChangeUserEquipment",(Object)(__ref._mastertagcode /*String*/ ),(Object)(__ref._currenttagcode /*String*/ ));
RDebugUtils.currentLine=76152838;
 //BA.debugLineNum = 76152838;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=76152840;
 //BA.debugLineNum = 76152840;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createcladdgrouplineitemdetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _title,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createcladdgrouplineitemdetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createcladdgrouplineitemdetail", new Object[] {_activ,_title,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=72220672;
 //BA.debugLineNum = 72220672;BA.debugLine="Sub createCLADDGroupLineItemDetail(activ As Activi";
RDebugUtils.currentLine=72220673;
 //BA.debugLineNum = 72220673;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=72220674;
 //BA.debugLineNum = 72220674;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=72220675;
 //BA.debugLineNum = 72220675;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=72220676;
 //BA.debugLineNum = 72220676;BA.debugLine="p.LoadLayout(\"ItemGroupTitle\" )";
_p.LoadLayout("ItemGroupTitle",ba);
RDebugUtils.currentLine=72220677;
 //BA.debugLineNum = 72220677;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=72220678;
 //BA.debugLineNum = 72220678;BA.debugLine="lblGroupTitle.text = Utils.IfNullOrEmpty(title, \"";
__ref._lblgrouptitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_utils._ifnullorempty /*String*/ (ba,_title,"(Sem grupo)")));
RDebugUtils.currentLine=72220679;
 //BA.debugLineNum = 72220679;BA.debugLine="p.Tag = \"\"";
_p.setTag((Object)(""));
RDebugUtils.currentLine=72220680;
 //BA.debugLineNum = 72220680;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=72220681;
 //BA.debugLineNum = 72220681;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createcladdlineitemdetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _tagcode,String _title,int _height,xevolution.vrcg.devdemov2400.types._taglisttype _tagitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createcladdlineitemdetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createcladdlineitemdetail", new Object[] {_activ,_tagcode,_title,_height,_tagitem}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=72286208;
 //BA.debugLineNum = 72286208;BA.debugLine="Sub createCLADDLineItemDetail(activ As Activity, t";
RDebugUtils.currentLine=72286209;
 //BA.debugLineNum = 72286209;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=72286210;
 //BA.debugLineNum = 72286210;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=72286211;
 //BA.debugLineNum = 72286211;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=72286213;
 //BA.debugLineNum = 72286213;BA.debugLine="p.LoadLayout(\"ItemGroupLine\" )";
_p.LoadLayout("ItemGroupLine",ba);
RDebugUtils.currentLine=72286214;
 //BA.debugLineNum = 72286214;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=72286215;
 //BA.debugLineNum = 72286215;BA.debugLine="lblLineHeader.text = title";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=72286216;
 //BA.debugLineNum = 72286216;BA.debugLine="lblLineHeader.tag = tagcode";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcode));
RDebugUtils.currentLine=72286217;
 //BA.debugLineNum = 72286217;BA.debugLine="p.tag = TagItem";
_p.setTag((Object)(_tagitem));
RDebugUtils.currentLine=72286219;
 //BA.debugLineNum = 72286219;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=72286220;
 //BA.debugLineNum = 72286220;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createdoublelineitem(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _title,String _subtitle,int _height,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createdoublelineitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createdoublelineitem", new Object[] {_activ,_title,_subtitle,_height,_tag}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=76283904;
 //BA.debugLineNum = 76283904;BA.debugLine="Sub createDoubleLineItem(activ As Activity, title";
RDebugUtils.currentLine=76283905;
 //BA.debugLineNum = 76283905;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=76283906;
 //BA.debugLineNum = 76283906;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=76283907;
 //BA.debugLineNum = 76283907;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=76283908;
 //BA.debugLineNum = 76283908;BA.debugLine="p.LoadLayout(\"listdoublelineitem\" ) '_device_2\")";
_p.LoadLayout("listdoublelineitem",ba);
RDebugUtils.currentLine=76283909;
 //BA.debugLineNum = 76283909;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=76283910;
 //BA.debugLineNum = 76283910;BA.debugLine="lbltitle.text = title";
__ref._lbltitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=76283911;
 //BA.debugLineNum = 76283911;BA.debugLine="lblsubtitle.text = subtitle";
__ref._lblsubtitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_subtitle));
RDebugUtils.currentLine=76283912;
 //BA.debugLineNum = 76283912;BA.debugLine="p.Tag = tag";
_p.setTag((Object)(_tag));
RDebugUtils.currentLine=76283913;
 //BA.debugLineNum = 76283913;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=76283914;
 //BA.debugLineNum = 76283914;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createlstofflinedata(xevolution.vrcg.devdemov2400.appdialogs __ref,String _req,boolean _checkedreq,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createlstofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createlstofflinedata", new Object[] {_req,_checkedreq,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=80740352;
 //BA.debugLineNum = 80740352;BA.debugLine="Sub CreatelstOfflineData(Req As String, checkedReq";
RDebugUtils.currentLine=80740353;
 //BA.debugLineNum = 80740353;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=80740354;
 //BA.debugLineNum = 80740354;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=80740355;
 //BA.debugLineNum = 80740355;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x, height)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=80740356;
 //BA.debugLineNum = 80740356;BA.debugLine="p.LoadLayout(\"ListaOfflineReq\" )";
_p.LoadLayout("ListaOfflineReq",ba);
RDebugUtils.currentLine=80740357;
 //BA.debugLineNum = 80740357;BA.debugLine="ChkReqOffline.Checked = checkedReq";
__ref._chkreqoffline /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(_checkedreq);
RDebugUtils.currentLine=80740358;
 //BA.debugLineNum = 80740358;BA.debugLine="txtReqOffline.text = Req";
__ref._txtreqoffline /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_req));
RDebugUtils.currentLine=80740359;
 //BA.debugLineNum = 80740359;BA.debugLine="p.Tag = $\"${Req}|${Utils.Bool2Int(checkedReq)}\"$";
_p.setTag((Object)((""+__c.SmartStringFormatter("",(Object)(_req))+"|"+__c.SmartStringFormatter("",(Object)(_utils._bool2int /*int*/ (ba,_checkedreq)))+"")));
RDebugUtils.currentLine=80740360;
 //BA.debugLineNum = 80740360;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=80740361;
 //BA.debugLineNum = 80740361;BA.debugLine="End Sub";
return null;
}
public String  _createobjectcancelbutton_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createobjectcancelbutton_click", false))
	 {return ((String) Debug.delegate(ba, "createobjectcancelbutton_click", null));}
RDebugUtils.currentLine=74055680;
 //BA.debugLineNum = 74055680;BA.debugLine="Sub createObjectCancelButton_Click";
RDebugUtils.currentLine=74055681;
 //BA.debugLineNum = 74055681;BA.debugLine="createObjectPanel.Visible = False";
__ref._createobjectpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=74055682;
 //BA.debugLineNum = 74055682;BA.debugLine="End Sub";
return "";
}
public String  _createobjectconfirmbutton_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createobjectconfirmbutton_click", false))
	 {return ((String) Debug.delegate(ba, "createobjectconfirmbutton_click", null));}
RDebugUtils.currentLine=74186752;
 //BA.debugLineNum = 74186752;BA.debugLine="Sub createObjectConfirmButton_Click";
RDebugUtils.currentLine=74186753;
 //BA.debugLineNum = 74186753;BA.debugLine="objectTypePanel.Visible = False";
__ref._objecttypepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=74186754;
 //BA.debugLineNum = 74186754;BA.debugLine="selectObjectPanel.Visible = True";
__ref._selectobjectpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=74186755;
 //BA.debugLineNum = 74186755;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createobjectlineitemdetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _tagcode,String _title,String _titledesc,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createobjectlineitemdetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createobjectlineitemdetail", new Object[] {_activ,_tagcode,_title,_titledesc,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=73531392;
 //BA.debugLineNum = 73531392;BA.debugLine="Sub createObjectLineItemDetail(activ As Activity,";
RDebugUtils.currentLine=73531393;
 //BA.debugLineNum = 73531393;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=73531394;
 //BA.debugLineNum = 73531394;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=73531395;
 //BA.debugLineNum = 73531395;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=73531397;
 //BA.debugLineNum = 73531397;BA.debugLine="p.LoadLayout(\"ItemGroupLine\" )";
_p.LoadLayout("ItemGroupLine",ba);
RDebugUtils.currentLine=73531398;
 //BA.debugLineNum = 73531398;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=73531399;
 //BA.debugLineNum = 73531399;BA.debugLine="lblLineHeader.text = title";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=73531400;
 //BA.debugLineNum = 73531400;BA.debugLine="lblLineHeader.tag = tagcode";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcode));
RDebugUtils.currentLine=73531401;
 //BA.debugLineNum = 73531401;BA.debugLine="p.tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=73531403;
 //BA.debugLineNum = 73531403;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=73531404;
 //BA.debugLineNum = 73531404;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createobjectlineitemdetailview(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _tagcode,String _title,String _titledesc,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createobjectlineitemdetailview", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createobjectlineitemdetailview", new Object[] {_activ,_tagcode,_title,_titledesc,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=73793536;
 //BA.debugLineNum = 73793536;BA.debugLine="Sub createObjectLineItemDetailView(activ As Activi";
RDebugUtils.currentLine=73793537;
 //BA.debugLineNum = 73793537;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=73793538;
 //BA.debugLineNum = 73793538;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=73793539;
 //BA.debugLineNum = 73793539;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=73793541;
 //BA.debugLineNum = 73793541;BA.debugLine="p.LoadLayout(\"ItemGroupLine\" )";
_p.LoadLayout("ItemGroupLine",ba);
RDebugUtils.currentLine=73793542;
 //BA.debugLineNum = 73793542;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=73793543;
 //BA.debugLineNum = 73793543;BA.debugLine="lblLineHeader.text = title";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=73793544;
 //BA.debugLineNum = 73793544;BA.debugLine="lblLineHeader.tag = tagcode";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcode));
RDebugUtils.currentLine=73793545;
 //BA.debugLineNum = 73793545;BA.debugLine="p.Height =  lblLineHeader.Height";
_p.setHeight(__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight());
RDebugUtils.currentLine=73793546;
 //BA.debugLineNum = 73793546;BA.debugLine="p.tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=73793548;
 //BA.debugLineNum = 73793548;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=73793549;
 //BA.debugLineNum = 73793549;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createobjecttypelineitemdetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _title,String _tagcode,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createobjecttypelineitemdetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createobjecttypelineitemdetail", new Object[] {_activ,_title,_tagcode,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=73662464;
 //BA.debugLineNum = 73662464;BA.debugLine="Sub createObjectTypeLineItemDetail(activ As Activi";
RDebugUtils.currentLine=73662465;
 //BA.debugLineNum = 73662465;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=73662466;
 //BA.debugLineNum = 73662466;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=73662467;
 //BA.debugLineNum = 73662467;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=73662468;
 //BA.debugLineNum = 73662468;BA.debugLine="p.LoadLayout(\"itemobjecttype\")";
_p.LoadLayout("itemobjecttype",ba);
RDebugUtils.currentLine=73662469;
 //BA.debugLineNum = 73662469;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=73662470;
 //BA.debugLineNum = 73662470;BA.debugLine="lblGroupObjectTitle.text = title";
__ref._lblgroupobjecttitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=73662471;
 //BA.debugLineNum = 73662471;BA.debugLine="p.Height = lblGroupObjectTitle.Height";
_p.setHeight(__ref._lblgroupobjecttitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight());
RDebugUtils.currentLine=73662472;
 //BA.debugLineNum = 73662472;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=73662473;
 //BA.debugLineNum = 73662473;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=73662474;
 //BA.debugLineNum = 73662474;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createobjgrouplineitemdetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _title,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createobjgrouplineitemdetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createobjgrouplineitemdetail", new Object[] {_activ,_title,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=73465856;
 //BA.debugLineNum = 73465856;BA.debugLine="Sub createObjGroupLineItemDetail(activ As Activity";
RDebugUtils.currentLine=73465857;
 //BA.debugLineNum = 73465857;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=73465858;
 //BA.debugLineNum = 73465858;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=73465859;
 //BA.debugLineNum = 73465859;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=73465860;
 //BA.debugLineNum = 73465860;BA.debugLine="p.LoadLayout(\"ItemGroupTitle\" )";
_p.LoadLayout("ItemGroupTitle",ba);
RDebugUtils.currentLine=73465861;
 //BA.debugLineNum = 73465861;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=73465862;
 //BA.debugLineNum = 73465862;BA.debugLine="lblGroupTitle.text = title";
__ref._lblgrouptitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=73465863;
 //BA.debugLineNum = 73465863;BA.debugLine="p.Tag = \"\"";
_p.setTag((Object)(""));
RDebugUtils.currentLine=73465864;
 //BA.debugLineNum = 73465864;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=73465865;
 //BA.debugLineNum = 73465865;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createobjgrouplineitemdetailview(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _title,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createobjgrouplineitemdetailview", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createobjgrouplineitemdetailview", new Object[] {_activ,_title,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=73728000;
 //BA.debugLineNum = 73728000;BA.debugLine="Sub createObjGroupLineItemDetailView(activ As Acti";
RDebugUtils.currentLine=73728001;
 //BA.debugLineNum = 73728001;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=73728002;
 //BA.debugLineNum = 73728002;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=73728003;
 //BA.debugLineNum = 73728003;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=73728004;
 //BA.debugLineNum = 73728004;BA.debugLine="p.LoadLayout(\"ItemGroupTitle\")";
_p.LoadLayout("ItemGroupTitle",ba);
RDebugUtils.currentLine=73728005;
 //BA.debugLineNum = 73728005;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=73728006;
 //BA.debugLineNum = 73728006;BA.debugLine="lblGroupTitle.text = title";
__ref._lblgrouptitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=73728007;
 //BA.debugLineNum = 73728007;BA.debugLine="p.Height = lblGroupTitle.Height";
_p.setHeight(__ref._lblgrouptitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight());
RDebugUtils.currentLine=73728008;
 //BA.debugLineNum = 73728008;BA.debugLine="p.Tag = \"\"";
_p.setTag((Object)(""));
RDebugUtils.currentLine=73728009;
 //BA.debugLineNum = 73728009;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=73728010;
 //BA.debugLineNum = 73728010;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createoutrosdetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _val2place,String _title2place,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createoutrosdetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createoutrosdetail", new Object[] {_activ,_val2place,_title2place,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=77004800;
 //BA.debugLineNum = 77004800;BA.debugLine="Sub CreateOutrosDetail(activ As Activity, val2plac";
RDebugUtils.currentLine=77004801;
 //BA.debugLineNum = 77004801;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=77004802;
 //BA.debugLineNum = 77004802;BA.debugLine="pnl.Initialize(\"\")";
_pnl.Initialize(ba,"");
RDebugUtils.currentLine=77004803;
 //BA.debugLineNum = 77004803;BA.debugLine="activ.AddView(pnl, 0, 0,100%x, height)";
_activ.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=77004804;
 //BA.debugLineNum = 77004804;BA.debugLine="pnl.LoadLayout(\"detalheOutros\" )";
_pnl.LoadLayout("detalheOutros",ba);
RDebugUtils.currentLine=77004805;
 //BA.debugLineNum = 77004805;BA.debugLine="pnl.RemoveView";
_pnl.RemoveView();
RDebugUtils.currentLine=77004806;
 //BA.debugLineNum = 77004806;BA.debugLine="lblTitleOutros.Text=title2place";
__ref._lbltitleoutros /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title2place));
RDebugUtils.currentLine=77004807;
 //BA.debugLineNum = 77004807;BA.debugLine="lblTitleOutros.Tag=val2place";
__ref._lbltitleoutros /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_val2place));
RDebugUtils.currentLine=77004808;
 //BA.debugLineNum = 77004808;BA.debugLine="Return pnl";
if (true) return _pnl;
RDebugUtils.currentLine=77004809;
 //BA.debugLineNum = 77004809;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createparamlineitem(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _tagcode,String _title,int _value_state,String _value,int _state_in,int _height,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createparamlineitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createparamlineitem", new Object[] {_activ,_tagcode,_title,_value_state,_value,_state_in,_height,_width}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcontrol = "";
anywheresoftware.b4a.objects.PanelWrapper _bpan = null;
RDebugUtils.currentLine=72548352;
 //BA.debugLineNum = 72548352;BA.debugLine="Sub createParamLineItem(activ As Activity, tagcode";
RDebugUtils.currentLine=72548353;
 //BA.debugLineNum = 72548353;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=72548354;
 //BA.debugLineNum = 72548354;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=72548355;
 //BA.debugLineNum = 72548355;BA.debugLine="activ.AddView(p, 0, 0, width, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=72548356;
 //BA.debugLineNum = 72548356;BA.debugLine="p.LoadLayout(\"ParamItmeLine\" )";
_p.LoadLayout("ParamItmeLine",ba);
RDebugUtils.currentLine=72548357;
 //BA.debugLineNum = 72548357;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=72548358;
 //BA.debugLineNum = 72548358;BA.debugLine="lblLineHeader.text = title";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=72548359;
 //BA.debugLineNum = 72548359;BA.debugLine="Log(VALUE)";
__c.LogImpl("672548359",_value,0);
RDebugUtils.currentLine=72548361;
 //BA.debugLineNum = 72548361;BA.debugLine="ButParamItem.updateButtonState(value_state)";
__ref._butparamitem /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._updatebuttonstate /*String*/ (null,_value_state);
RDebugUtils.currentLine=72548362;
 //BA.debugLineNum = 72548362;BA.debugLine="ButParamItem.State = value_state";
__ref._butparamitem /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setstate /*int*/ (null,_value_state);
RDebugUtils.currentLine=72548363;
 //BA.debugLineNum = 72548363;BA.debugLine="Dim TagControl As String = $\"${tagcode}|${value_s";
_tagcontrol = (""+__c.SmartStringFormatter("",(Object)(_tagcode))+"|"+__c.SmartStringFormatter("",(Object)(_value_state))+"|1");
RDebugUtils.currentLine=72548364;
 //BA.debugLineNum = 72548364;BA.debugLine="lblLineHeader.tag = TagControl";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcontrol));
RDebugUtils.currentLine=72548365;
 //BA.debugLineNum = 72548365;BA.debugLine="ButParamItem.tag = TagControl";
__ref._butparamitem /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(_tagcontrol));
RDebugUtils.currentLine=72548367;
 //BA.debugLineNum = 72548367;BA.debugLine="If (state_in = 2) Then";
if ((_state_in==2)) { 
RDebugUtils.currentLine=72548368;
 //BA.debugLineNum = 72548368;BA.debugLine="Dim bpan As Panel = lblLineHeader.Parent";
_bpan = new anywheresoftware.b4a.objects.PanelWrapper();
_bpan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .getParent()));
RDebugUtils.currentLine=72548369;
 //BA.debugLineNum = 72548369;BA.debugLine="lblLineHeader.Color = Consts.ColorLightSilver";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(_consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=72548370;
 //BA.debugLineNum = 72548370;BA.debugLine="bpan.Color = Consts.ColorLightSilver";
_bpan.setColor(_consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=72548371;
 //BA.debugLineNum = 72548371;BA.debugLine="bpan.Enabled = False";
_bpan.setEnabled(__c.False);
RDebugUtils.currentLine=72548372;
 //BA.debugLineNum = 72548372;BA.debugLine="ButParamItem.Enabled = False";
__ref._butparamitem /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setenabled /*boolean*/ (null,__c.False);
 };
RDebugUtils.currentLine=72548375;
 //BA.debugLineNum = 72548375;BA.debugLine="p.tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=72548376;
 //BA.debugLineNum = 72548376;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=72548377;
 //BA.debugLineNum = 72548377;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createparamlineitemedit(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _tagcode,String _title,int _value_state,String _value,int _state_in,int _height,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createparamlineitemedit", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createparamlineitemedit", new Object[] {_activ,_tagcode,_title,_value_state,_value,_state_in,_height,_width}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcontrol = "";
anywheresoftware.b4a.objects.PanelWrapper _bpan = null;
RDebugUtils.currentLine=72613888;
 //BA.debugLineNum = 72613888;BA.debugLine="Sub createParamLineItemEdit(activ As Activity, tag";
RDebugUtils.currentLine=72613890;
 //BA.debugLineNum = 72613890;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=72613891;
 //BA.debugLineNum = 72613891;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=72613892;
 //BA.debugLineNum = 72613892;BA.debugLine="activ.AddView(p, 0, 0, width, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=72613893;
 //BA.debugLineNum = 72613893;BA.debugLine="p.LoadLayout(\"ParamItmeLineEdit\" )";
_p.LoadLayout("ParamItmeLineEdit",ba);
RDebugUtils.currentLine=72613894;
 //BA.debugLineNum = 72613894;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=72613895;
 //BA.debugLineNum = 72613895;BA.debugLine="lblLineHeader.text = title";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=72613896;
 //BA.debugLineNum = 72613896;BA.debugLine="EditParamItem.Text = VALUE";
__ref._editparamitem /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=72613897;
 //BA.debugLineNum = 72613897;BA.debugLine="Log(value_state)";
__c.LogImpl("672613897",BA.NumberToString(_value_state),0);
RDebugUtils.currentLine=72613899;
 //BA.debugLineNum = 72613899;BA.debugLine="Dim TagControl As String = $\"${tagcode}|${VALUE}|";
_tagcontrol = (""+__c.SmartStringFormatter("",(Object)(_tagcode))+"|"+__c.SmartStringFormatter("",(Object)(_value))+"|0");
RDebugUtils.currentLine=72613900;
 //BA.debugLineNum = 72613900;BA.debugLine="lblLineHeader.tag = TagControl";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcontrol));
RDebugUtils.currentLine=72613901;
 //BA.debugLineNum = 72613901;BA.debugLine="EditParamItem.tag = TagControl";
__ref._editparamitem /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTag((Object)(_tagcontrol));
RDebugUtils.currentLine=72613903;
 //BA.debugLineNum = 72613903;BA.debugLine="If (state_in = 2) Then";
if ((_state_in==2)) { 
RDebugUtils.currentLine=72613904;
 //BA.debugLineNum = 72613904;BA.debugLine="Dim bpan As Panel = lblLineHeader.Parent";
_bpan = new anywheresoftware.b4a.objects.PanelWrapper();
_bpan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .getParent()));
RDebugUtils.currentLine=72613905;
 //BA.debugLineNum = 72613905;BA.debugLine="lblLineHeader.Color = Consts.ColorLightSilver";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(_consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=72613906;
 //BA.debugLineNum = 72613906;BA.debugLine="bpan.Color = Consts.ColorLightSilver";
_bpan.setColor(_consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=72613907;
 //BA.debugLineNum = 72613907;BA.debugLine="bpan.Enabled = False";
_bpan.setEnabled(__c.False);
RDebugUtils.currentLine=72613908;
 //BA.debugLineNum = 72613908;BA.debugLine="EditParamItem.Enabled = False";
__ref._editparamitem /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=72613911;
 //BA.debugLineNum = 72613911;BA.debugLine="p.tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=72613912;
 //BA.debugLineNum = 72613912;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=72613913;
 //BA.debugLineNum = 72613913;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createrequestlineitemdetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,anywheresoftware.b4a.sql.SQL.CursorWrapper _items,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createrequestlineitemdetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createrequestlineitemdetail", new Object[] {_activ,_items,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _route_title = "";
String _nameobject = "";
String _request_desc = "";
String _tagcode = "";
String _sret = "";
RDebugUtils.currentLine=71761920;
 //BA.debugLineNum = 71761920;BA.debugLine="Sub createRequestLineItemDetail(activ As Activity,";
RDebugUtils.currentLine=71761921;
 //BA.debugLineNum = 71761921;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=71761922;
 //BA.debugLineNum = 71761922;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=71761923;
 //BA.debugLineNum = 71761923;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=71761925;
 //BA.debugLineNum = 71761925;BA.debugLine="p.LoadLayout(\"ItemLineRequest\" )";
_p.LoadLayout("ItemLineRequest",ba);
RDebugUtils.currentLine=71761926;
 //BA.debugLineNum = 71761926;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=71761930;
 //BA.debugLineNum = 71761930;BA.debugLine="Dim route_title As String = items.GetString(\"rout";
_route_title = _items.GetString("route_title");
RDebugUtils.currentLine=71761931;
 //BA.debugLineNum = 71761931;BA.debugLine="Dim nameobject As String = items.GetString(\"nameo";
_nameobject = _items.GetString("nameobject");
RDebugUtils.currentLine=71761932;
 //BA.debugLineNum = 71761932;BA.debugLine="Dim request_desc As String = items.GetString(\"req";
_request_desc = _items.GetString("request_desc");
RDebugUtils.currentLine=71761933;
 //BA.debugLineNum = 71761933;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcode\"";
_tagcode = _items.GetString("tagcode");
RDebugUtils.currentLine=71761935;
 //BA.debugLineNum = 71761935;BA.debugLine="If Utils.NNE(route_title) Then";
if (_utils._nne /*boolean*/ (ba,_route_title)) { 
RDebugUtils.currentLine=71761936;
 //BA.debugLineNum = 71761936;BA.debugLine="route_title = $\"${route_title} / \"$";
_route_title = (""+__c.SmartStringFormatter("",(Object)(_route_title))+" / ");
 };
RDebugUtils.currentLine=71761938;
 //BA.debugLineNum = 71761938;BA.debugLine="If Utils.NNE(nameobject) Then";
if (_utils._nne /*boolean*/ (ba,_nameobject)) { 
RDebugUtils.currentLine=71761939;
 //BA.debugLineNum = 71761939;BA.debugLine="nameobject = $\"${nameobject} / \"$";
_nameobject = (""+__c.SmartStringFormatter("",(Object)(_nameobject))+" / ");
 };
RDebugUtils.currentLine=71761941;
 //BA.debugLineNum = 71761941;BA.debugLine="If Utils.NNE(request_desc) Then";
if (_utils._nne /*boolean*/ (ba,_request_desc)) { 
RDebugUtils.currentLine=71761942;
 //BA.debugLineNum = 71761942;BA.debugLine="request_desc = $\"${request_desc} / \"$";
_request_desc = (""+__c.SmartStringFormatter("",(Object)(_request_desc))+" / ");
 };
RDebugUtils.currentLine=71761944;
 //BA.debugLineNum = 71761944;BA.debugLine="Dim sRet As String = $\"${route_title}${nameobject";
_sret = (""+__c.SmartStringFormatter("",(Object)(_route_title))+""+__c.SmartStringFormatter("",(Object)(_nameobject))+""+__c.SmartStringFormatter("",(Object)(_request_desc))+"");
RDebugUtils.currentLine=71761946;
 //BA.debugLineNum = 71761946;BA.debugLine="lblLineHeader.text = sRet";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_sret));
RDebugUtils.currentLine=71761947;
 //BA.debugLineNum = 71761947;BA.debugLine="lblLineHeader.tag = tagcode";
__ref._lbllineheader /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcode));
RDebugUtils.currentLine=71761948;
 //BA.debugLineNum = 71761948;BA.debugLine="p.tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=71761950;
 //BA.debugLineNum = 71761950;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=71761951;
 //BA.debugLineNum = 71761951;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createtasklineitemdetail(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _title,int _typeitem,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createtasklineitemdetail", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createtasklineitemdetail", new Object[] {_activ,_title,_typeitem,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=74973184;
 //BA.debugLineNum = 74973184;BA.debugLine="Sub createTaskLineItemDetail(activ As Activity, ti";
RDebugUtils.currentLine=74973185;
 //BA.debugLineNum = 74973185;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=74973186;
 //BA.debugLineNum = 74973186;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=74973187;
 //BA.debugLineNum = 74973187;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=74973188;
 //BA.debugLineNum = 74973188;BA.debugLine="If (typeitem = 1) Then";
if ((_typeitem==1)) { 
RDebugUtils.currentLine=74973189;
 //BA.debugLineNum = 74973189;BA.debugLine="p.LoadLayout(\"task_item_detail_groupitem\" ) '_de";
_p.LoadLayout("task_item_detail_groupitem",ba);
 }else {
RDebugUtils.currentLine=74973191;
 //BA.debugLineNum = 74973191;BA.debugLine="p.LoadLayout(\"task_item_detail_lineitem\" ) '_dev";
_p.LoadLayout("task_item_detail_lineitem",ba);
 };
RDebugUtils.currentLine=74973193;
 //BA.debugLineNum = 74973193;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=74973194;
 //BA.debugLineNum = 74973194;BA.debugLine="ListItemDesc.text = title";
__ref._listitemdesc /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=74973195;
 //BA.debugLineNum = 74973195;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=74973196;
 //BA.debugLineNum = 74973196;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createvehicleitem(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,String _vehiclename,int _height,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "createvehicleitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createvehicleitem", new Object[] {_activ,_vehiclename,_height,_tag}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=76349440;
 //BA.debugLineNum = 76349440;BA.debugLine="Sub createVehicleItem(activ As Activity, vehicleNa";
RDebugUtils.currentLine=76349441;
 //BA.debugLineNum = 76349441;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=76349442;
 //BA.debugLineNum = 76349442;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=76349443;
 //BA.debugLineNum = 76349443;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=76349444;
 //BA.debugLineNum = 76349444;BA.debugLine="p.LoadLayout(\"vehicleItem\" ) '_device_2\")";
_p.LoadLayout("vehicleItem",ba);
RDebugUtils.currentLine=76349445;
 //BA.debugLineNum = 76349445;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=76349446;
 //BA.debugLineNum = 76349446;BA.debugLine="lblvehicleName.text = vehicleName";
__ref._lblvehiclename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_vehiclename));
RDebugUtils.currentLine=76349447;
 //BA.debugLineNum = 76349447;BA.debugLine="p.Tag = tag";
_p.setTag((Object)(_tag));
RDebugUtils.currentLine=76349448;
 //BA.debugLineNum = 76349448;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=76349449;
 //BA.debugLineNum = 76349449;BA.debugLine="End Sub";
return null;
}
public void  _dialogooutros(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogooutros", false))
	 {Debug.delegate(ba, "dialogooutros", new Object[] {_activ,_this,_params}); return;}
ResumableSub_DialogoOutros rsub = new ResumableSub_DialogoOutros(this,__ref,_activ,_this,_params);
rsub.resume(ba, null);
}
public static class ResumableSub_DialogoOutros extends BA.ResumableSub {
public ResumableSub_DialogoOutros(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this,anywheresoftware.b4a.objects.collections.Map _params) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._params = _params;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this;
anywheresoftware.b4a.objects.collections.Map _params;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.collections.Map _search_field_settings = null;
anywheresoftware.b4a.objects.collections.List _fields = null;
String _returned_field = "";
anywheresoftware.b4a.objects.collections.List _fillotherfields_settings = null;
anywheresoftware.b4a.objects.collections.Map _mapoutros = null;
anywheresoftware.b4a.objects.collections.Map _colfillotherfields_settings = null;
String _field_name = "";
String _alt_bookmark = "";
String _field_title = "";
int _show_position = 0;
int _show_inlist = 0;
int _is_location = 0;
int _is_additional = 0;
int _is_contact = 0;
int _x = 0;
String _sret = "";
String _chave = "";
int _res = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbloutrostitle = null;
anywheresoftware.b4a.objects.EditTextWrapper _lbloutrosvalor = null;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;
int step35;
int limit35;
int step42;
int limit42;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=76939265;
 //BA.debugLineNum = 76939265;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Adiciona";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Adicionar Registo","Actualizar Checklist","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=76939267;
 //BA.debugLineNum = 76939267;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=76939268;
 //BA.debugLineNum = 76939268;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=76939269;
 //BA.debugLineNum = 76939269;BA.debugLine="ApplDialog.SetSize(75%x, 80%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (75),ba),parent.__c.PerYToCurrent((float) (80),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=76939271;
 //BA.debugLineNum = 76939271;BA.debugLine="ApplDialog.SetSize(90%x, 70%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (70),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=76939274;
 //BA.debugLineNum = 76939274;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "dialogooutros"), _sf);
this.state = 34;
return;
case 34:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=76939275;
 //BA.debugLineNum = 76939275;BA.debugLine="pnl.LoadLayout(\"dialog_search_outros\")";
_pnl.LoadLayout("dialog_search_outros",ba);
RDebugUtils.currentLine=76939278;
 //BA.debugLineNum = 76939278;BA.debugLine="Dim search_field_settings As Map = params.Get(\"se";
_search_field_settings = new anywheresoftware.b4a.objects.collections.Map();
_search_field_settings = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_params.Get((Object)("search_field_settings"))));
RDebugUtils.currentLine=76939279;
 //BA.debugLineNum = 76939279;BA.debugLine="Dim fields As List = search_field_settings.Get(\"f";
_fields = new anywheresoftware.b4a.objects.collections.List();
_fields = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_field_settings.Get((Object)("fields"))));
RDebugUtils.currentLine=76939280;
 //BA.debugLineNum = 76939280;BA.debugLine="Dim returned_field As String = search_field_setti";
_returned_field = BA.ObjectToString(_search_field_settings.Get((Object)("returned_field")));
RDebugUtils.currentLine=76939281;
 //BA.debugLineNum = 76939281;BA.debugLine="Dim fillotherfields_settings As List = search_fie";
_fillotherfields_settings = new anywheresoftware.b4a.objects.collections.List();
_fillotherfields_settings = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_field_settings.Get((Object)("fillotherfields_settings"))));
RDebugUtils.currentLine=76939283;
 //BA.debugLineNum = 76939283;BA.debugLine="Dim mapOutros As Map";
_mapoutros = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=76939284;
 //BA.debugLineNum = 76939284;BA.debugLine="mapOutros.Initialize";
_mapoutros.Initialize();
RDebugUtils.currentLine=76939289;
 //BA.debugLineNum = 76939289;BA.debugLine="For Each colfillotherfields_settings As Map In fi";
if (true) break;

case 7:
//for
this.state = 21;
_colfillotherfields_settings = new anywheresoftware.b4a.objects.collections.Map();
group16 = _fillotherfields_settings;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 35;
if (true) break;

case 35:
//C
this.state = 21;
if (index16 < groupLen16) {
this.state = 9;
_colfillotherfields_settings = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group16.Get(index16)));}
if (true) break;

case 36:
//C
this.state = 35;
index16++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=76939290;
 //BA.debugLineNum = 76939290;BA.debugLine="Dim field_name As String = colfillotherfields_se";
_field_name = BA.ObjectToString(_colfillotherfields_settings.Get((Object)("field_name")));
RDebugUtils.currentLine=76939292;
 //BA.debugLineNum = 76939292;BA.debugLine="Try";
if (true) break;

case 10:
//try
this.state = 15;
this.catchState = 14;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 14;
RDebugUtils.currentLine=76939293;
 //BA.debugLineNum = 76939293;BA.debugLine="Dim alt_bookmark As String = colfillotherfields";
_alt_bookmark = BA.ObjectToString(_colfillotherfields_settings.Get((Object)("alt_bookmark")));
RDebugUtils.currentLine=76939294;
 //BA.debugLineNum = 76939294;BA.debugLine="Dim field_title As String = colfillotherfields_";
_field_title = BA.ObjectToString(_colfillotherfields_settings.Get((Object)("field_title")));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=76939296;
 //BA.debugLineNum = 76939296;BA.debugLine="Dim alt_bookmark As String = \"\"";
_alt_bookmark = "";
RDebugUtils.currentLine=76939297;
 //BA.debugLineNum = 76939297;BA.debugLine="Dim field_title As String = field_name";
_field_title = _field_name;
RDebugUtils.currentLine=76939298;
 //BA.debugLineNum = 76939298;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("676939298",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=76939300;
 //BA.debugLineNum = 76939300;BA.debugLine="If field_title = \"\" Then field_title = field_nam";

case 15:
//if
this.state = 20;
this.catchState = 0;
if ((_field_title).equals("")) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
_field_title = _field_name;
if (true) break;

case 20:
//C
this.state = 36;
;
RDebugUtils.currentLine=76939301;
 //BA.debugLineNum = 76939301;BA.debugLine="Dim show_position As Int = colfillotherfields_se";
_show_position = (int)(BA.ObjectToNumber(_colfillotherfields_settings.Get((Object)("show_position"))));
RDebugUtils.currentLine=76939302;
 //BA.debugLineNum = 76939302;BA.debugLine="Dim show_inlist As Int = colfillotherfields_sett";
_show_inlist = (int)(BA.ObjectToNumber(_colfillotherfields_settings.Get((Object)("show_inlist"))));
RDebugUtils.currentLine=76939303;
 //BA.debugLineNum = 76939303;BA.debugLine="Dim is_location As Int = colfillotherfields_sett";
_is_location = (int)(BA.ObjectToNumber(_colfillotherfields_settings.Get((Object)("is_location"))));
RDebugUtils.currentLine=76939304;
 //BA.debugLineNum = 76939304;BA.debugLine="Dim is_additional As Int = colfillotherfields_se";
_is_additional = (int)(BA.ObjectToNumber(_colfillotherfields_settings.Get((Object)("is_additional"))));
RDebugUtils.currentLine=76939305;
 //BA.debugLineNum = 76939305;BA.debugLine="Dim is_contact As Int = colfillotherfields_setti";
_is_contact = (int)(BA.ObjectToNumber(_colfillotherfields_settings.Get((Object)("is_contact"))));
RDebugUtils.currentLine=76939306;
 //BA.debugLineNum = 76939306;BA.debugLine="mapOutros.Put(field_name,field_title)";
_mapoutros.Put((Object)(_field_name),(Object)(_field_title));
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=76939308;
 //BA.debugLineNum = 76939308;BA.debugLine="ListaOutros.Clear";
__ref._listaoutros /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=76939310;
 //BA.debugLineNum = 76939310;BA.debugLine="For x = 0 To mapOutros.Size -1";
if (true) break;

case 22:
//for
this.state = 25;
step35 = 1;
limit35 = (int) (_mapoutros.getSize()-1);
_x = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 25;
if ((step35 > 0 && _x <= limit35) || (step35 < 0 && _x >= limit35)) this.state = 24;
if (true) break;

case 38:
//C
this.state = 37;
_x = ((int)(0 + _x + step35)) ;
if (true) break;

case 24:
//C
this.state = 38;
RDebugUtils.currentLine=76939311;
 //BA.debugLineNum = 76939311;BA.debugLine="ListaOutros.Add(CreateOutrosDetail(activ,mapOutr";
__ref._listaoutros /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createoutrosdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,BA.ObjectToString(_mapoutros.GetKeyAt(_x)),BA.ObjectToString(_mapoutros.GetValueAt(_x)),parent.__c.DipToCurrent((int) (50))).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=76939313;
 //BA.debugLineNum = 76939313;BA.debugLine="Dim sRet As String = \"\"";
_sret = "";
RDebugUtils.currentLine=76939314;
 //BA.debugLineNum = 76939314;BA.debugLine="Dim chave As String = \"\"";
_chave = "";
RDebugUtils.currentLine=76939315;
 //BA.debugLineNum = 76939315;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "dialogooutros"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 26;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=76939316;
 //BA.debugLineNum = 76939316;BA.debugLine="If res = DialogResponse.POSITIVE Then 'Actualizar";
if (true) break;

case 26:
//if
this.state = 33;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=76939317;
 //BA.debugLineNum = 76939317;BA.debugLine="For i = 0 To ListaOutros.Size -1";
if (true) break;

case 29:
//for
this.state = 32;
step42 = 1;
limit42 = (int) (__ref._listaoutros /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 40;
if (true) break;

case 40:
//C
this.state = 32;
if ((step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42)) this.state = 31;
if (true) break;

case 41:
//C
this.state = 40;
_i = ((int)(0 + _i + step42)) ;
if (true) break;

case 31:
//C
this.state = 41;
RDebugUtils.currentLine=76939318;
 //BA.debugLineNum = 76939318;BA.debugLine="Dim p As Panel = ListaOutros.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._listaoutros /*b4a.example3.customlistview*/ ._getpanel(_i).getObject()));
RDebugUtils.currentLine=76939319;
 //BA.debugLineNum = 76939319;BA.debugLine="Dim lblOutrosTitle As Label = p.GetView(0)";
_lbloutrostitle = new anywheresoftware.b4a.objects.LabelWrapper();
_lbloutrostitle = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=76939320;
 //BA.debugLineNum = 76939320;BA.debugLine="Dim lblOutrosValor As EditText = p.GetView(1)";
_lbloutrosvalor = new anywheresoftware.b4a.objects.EditTextWrapper();
_lbloutrosvalor = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=76939321;
 //BA.debugLineNum = 76939321;BA.debugLine="sRet = sRet & $\"${lblOutrosTitle.Tag}=${lblOutr";
_sret = _sret+(""+parent.__c.SmartStringFormatter("",_lbloutrostitle.getTag())+"="+parent.__c.SmartStringFormatter("",(Object)(_lbloutrosvalor.getText()))+"|");
RDebugUtils.currentLine=76939322;
 //BA.debugLineNum = 76939322;BA.debugLine="chave = chave & $\"${lblOutrosValor.Text}|\"$";
_chave = _chave+(""+parent.__c.SmartStringFormatter("",(Object)(_lbloutrosvalor.getText()))+"|");
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=76939325;
 //BA.debugLineNum = 76939325;BA.debugLine="ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = chave";
parent._sharecode._item_returned_from_searchlist /*String*/  = _chave;
RDebugUtils.currentLine=76939326;
 //BA.debugLineNum = 76939326;BA.debugLine="ShareCode.TAG_RETURNED_FROM_SEARCHLIST = sRet";
parent._sharecode._tag_returned_from_searchlist /*String*/  = _sret;
RDebugUtils.currentLine=76939327;
 //BA.debugLineNum = 76939327;BA.debugLine="CallSubDelayed3(CheckList3, \"returnfromoutros\",t";
parent.__c.CallSubDelayed3(ba,(Object)(parent._checklist3.getObject()),"returnfromoutros",(Object)(_this),(Object)(_params));
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=76939329;
 //BA.debugLineNum = 76939329;BA.debugLine="End Sub";
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
public String  _dialogreqcausermj_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogreqcausermj_itemclick", false))
	 {return ((String) Debug.delegate(ba, "dialogreqcausermj_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=77332480;
 //BA.debugLineNum = 77332480;BA.debugLine="Sub DialogReqCauseRMJ_ItemClick (Position As Int,";
RDebugUtils.currentLine=77332481;
 //BA.debugLineNum = 77332481;BA.debugLine="Log (Value)";
__c.LogImpl("677332481",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=77332482;
 //BA.debugLineNum = 77332482;BA.debugLine="End Sub";
return "";
}
public String  _dialogreqendtime_focuschanged(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogreqendtime_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "dialogreqendtime_focuschanged", new Object[] {_hasfocus}));}
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _currenttimeedit = null;
de.donmanfred.TimePickerDialogWrapper _tt = null;
long _dnow = 0L;
RDebugUtils.currentLine=78643200;
 //BA.debugLineNum = 78643200;BA.debugLine="Sub DialogReqEndTime_FocusChanged (HasFocus As Boo";
RDebugUtils.currentLine=78643202;
 //BA.debugLineNum = 78643202;BA.debugLine="If (HasFocus = True) Then";
if ((_hasfocus==__c.True)) { 
RDebugUtils.currentLine=78643203;
 //BA.debugLineNum = 78643203;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = Se";
_currenttimeedit = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
_currenttimeedit = (anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper(), (com.wrapp.floatlabelededittext.FloatLabeledEditText)(__c.Sender(ba)));
RDebugUtils.currentLine=78643204;
 //BA.debugLineNum = 78643204;BA.debugLine="Dim tt As TimePickerDialog";
_tt = new de.donmanfred.TimePickerDialogWrapper();
RDebugUtils.currentLine=78643205;
 //BA.debugLineNum = 78643205;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=78643206;
 //BA.debugLineNum = 78643206;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=78643207;
 //BA.debugLineNum = 78643207;BA.debugLine="Try";
try {RDebugUtils.currentLine=78643208;
 //BA.debugLineNum = 78643208;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
if (((_currenttimeedit.getText()).equals("") == false)) { 
RDebugUtils.currentLine=78643209;
 //BA.debugLineNum = 78643209;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.";
_dnow = __c.DateTime.TimeParse((""+__c.SmartStringFormatter("",(Object)(_currenttimeedit.getText()))+":00"));
 };
RDebugUtils.currentLine=78643212;
 //BA.debugLineNum = 78643212;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHo";
_tt.Initialize(ba,"CalendarGetTime",__c.DateTime.GetHour(_dnow),__c.DateTime.GetMinute(_dnow),__c.True);
RDebugUtils.currentLine=78643214;
 //BA.debugLineNum = 78643214;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
_tt.show("CurrentTimeEdit");
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=78643216;
 //BA.debugLineNum = 78643216;BA.debugLine="Log(LastException)";
__c.LogImpl("678643216",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
RDebugUtils.currentLine=78643219;
 //BA.debugLineNum = 78643219;BA.debugLine="End Sub";
return "";
}
public String  _dialogreqperiodtype_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogreqperiodtype_itemclick", false))
	 {return ((String) Debug.delegate(ba, "dialogreqperiodtype_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=78315520;
 //BA.debugLineNum = 78315520;BA.debugLine="Sub DialogReqPeriodType_ItemClick (Position As Int";
RDebugUtils.currentLine=78315522;
 //BA.debugLineNum = 78315522;BA.debugLine="End Sub";
return "";
}
public String  _dialogreqreasonrmj_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogreqreasonrmj_itemclick", false))
	 {return ((String) Debug.delegate(ba, "dialogreqreasonrmj_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=77266944;
 //BA.debugLineNum = 77266944;BA.debugLine="Sub DialogReqReasonRMJ_ItemClick (Position As Int,";
RDebugUtils.currentLine=77266945;
 //BA.debugLineNum = 77266945;BA.debugLine="Log (Value)";
__c.LogImpl("677266945",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=77266946;
 //BA.debugLineNum = 77266946;BA.debugLine="End Sub";
return "";
}
public String  _dialogreqroute_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogreqroute_itemclick", false))
	 {return ((String) Debug.delegate(ba, "dialogreqroute_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=78905344;
 //BA.debugLineNum = 78905344;BA.debugLine="Sub DialogReqRoute_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=78905346;
 //BA.debugLineNum = 78905346;BA.debugLine="End Sub";
return "";
}
public String  _dialogreqstarttime_focuschanged(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogreqstarttime_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "dialogreqstarttime_focuschanged", new Object[] {_hasfocus}));}
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _currenttimeedit = null;
de.donmanfred.TimePickerDialogWrapper _tt = null;
long _dnow = 0L;
RDebugUtils.currentLine=78577664;
 //BA.debugLineNum = 78577664;BA.debugLine="Sub DialogReqStartTime_FocusChanged (HasFocus As B";
RDebugUtils.currentLine=78577665;
 //BA.debugLineNum = 78577665;BA.debugLine="If (HasFocus = True) Then";
if ((_hasfocus==__c.True)) { 
RDebugUtils.currentLine=78577666;
 //BA.debugLineNum = 78577666;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = Se";
_currenttimeedit = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
_currenttimeedit = (anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper(), (com.wrapp.floatlabelededittext.FloatLabeledEditText)(__c.Sender(ba)));
RDebugUtils.currentLine=78577667;
 //BA.debugLineNum = 78577667;BA.debugLine="Dim tt As TimePickerDialog";
_tt = new de.donmanfred.TimePickerDialogWrapper();
RDebugUtils.currentLine=78577668;
 //BA.debugLineNum = 78577668;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=78577669;
 //BA.debugLineNum = 78577669;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=78577670;
 //BA.debugLineNum = 78577670;BA.debugLine="Try";
try {RDebugUtils.currentLine=78577671;
 //BA.debugLineNum = 78577671;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
if (((_currenttimeedit.getText()).equals("") == false)) { 
RDebugUtils.currentLine=78577672;
 //BA.debugLineNum = 78577672;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.";
_dnow = __c.DateTime.TimeParse((""+__c.SmartStringFormatter("",(Object)(_currenttimeedit.getText()))+":00"));
 };
RDebugUtils.currentLine=78577675;
 //BA.debugLineNum = 78577675;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHo";
_tt.Initialize(ba,"CalendarGetTime",__c.DateTime.GetHour(_dnow),__c.DateTime.GetMinute(_dnow),__c.True);
RDebugUtils.currentLine=78577677;
 //BA.debugLineNum = 78577677;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
_tt.show("CurrentTimeEdit");
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=78577679;
 //BA.debugLineNum = 78577679;BA.debugLine="Log(LastException)";
__c.LogImpl("678577679",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
RDebugUtils.currentLine=78577682;
 //BA.debugLineNum = 78577682;BA.debugLine="End Sub";
return "";
}
public String  _dialogreqtimermj_focuschanged(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogreqtimermj_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "dialogreqtimermj_focuschanged", new Object[] {_hasfocus}));}
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _currenttimeedit = null;
de.donmanfred.TimePickerDialogWrapper _tt = null;
long _dnow = 0L;
RDebugUtils.currentLine=78708736;
 //BA.debugLineNum = 78708736;BA.debugLine="Sub DialogReqTimeRMJ_FocusChanged (HasFocus As Boo";
RDebugUtils.currentLine=78708738;
 //BA.debugLineNum = 78708738;BA.debugLine="If (HasFocus = True) Then";
if ((_hasfocus==__c.True)) { 
RDebugUtils.currentLine=78708739;
 //BA.debugLineNum = 78708739;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = Se";
_currenttimeedit = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
_currenttimeedit = (anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper(), (com.wrapp.floatlabelededittext.FloatLabeledEditText)(__c.Sender(ba)));
RDebugUtils.currentLine=78708740;
 //BA.debugLineNum = 78708740;BA.debugLine="Dim tt As TimePickerDialog";
_tt = new de.donmanfred.TimePickerDialogWrapper();
RDebugUtils.currentLine=78708741;
 //BA.debugLineNum = 78708741;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=78708742;
 //BA.debugLineNum = 78708742;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=78708743;
 //BA.debugLineNum = 78708743;BA.debugLine="Try";
try {RDebugUtils.currentLine=78708744;
 //BA.debugLineNum = 78708744;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
if (((_currenttimeedit.getText()).equals("") == false)) { 
RDebugUtils.currentLine=78708745;
 //BA.debugLineNum = 78708745;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.";
_dnow = __c.DateTime.TimeParse((""+__c.SmartStringFormatter("",(Object)(_currenttimeedit.getText()))+":00"));
 };
RDebugUtils.currentLine=78708748;
 //BA.debugLineNum = 78708748;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHo";
_tt.Initialize(ba,"CalendarGetTime",__c.DateTime.GetHour(_dnow),__c.DateTime.GetMinute(_dnow),__c.True);
RDebugUtils.currentLine=78708750;
 //BA.debugLineNum = 78708750;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
_tt.show("CurrentTimeEdit");
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=78708752;
 //BA.debugLineNum = 78708752;BA.debugLine="Log(LastException)";
__c.LogImpl("678708752",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
RDebugUtils.currentLine=78708755;
 //BA.debugLineNum = 78708755;BA.debugLine="End Sub";
return "";
}
public String  _dialogreqtypermj_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "dialogreqtypermj_itemclick", false))
	 {return ((String) Debug.delegate(ba, "dialogreqtypermj_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=78249984;
 //BA.debugLineNum = 78249984;BA.debugLine="Sub DialogReqTypeRMJ_ItemClick (Position As Int, V";
RDebugUtils.currentLine=78249986;
 //BA.debugLineNum = 78249986;BA.debugLine="End Sub";
return "";
}
public String  _editparamitem_focuschanged(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "editparamitem_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "editparamitem_focuschanged", new Object[] {_hasfocus}));}
anywheresoftware.b4a.objects.EditTextWrapper _this = null;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
anywheresoftware.b4a.objects.PanelWrapper _pan2 = null;
String _ssql = "";
RDebugUtils.currentLine=72810496;
 //BA.debugLineNum = 72810496;BA.debugLine="Sub EditParamItem_FocusChanged (HasFocus As Boolea";
RDebugUtils.currentLine=72810497;
 //BA.debugLineNum = 72810497;BA.debugLine="Dim this As EditText = Sender";
_this = new anywheresoftware.b4a.objects.EditTextWrapper();
_this = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)));
RDebugUtils.currentLine=72810498;
 //BA.debugLineNum = 72810498;BA.debugLine="Log(HasFocus)";
__c.LogImpl("672810498",BA.ObjectToString(_hasfocus),0);
RDebugUtils.currentLine=72810499;
 //BA.debugLineNum = 72810499;BA.debugLine="Dim Pan As Panel = this.Parent";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_this.getParent()));
RDebugUtils.currentLine=72810500;
 //BA.debugLineNum = 72810500;BA.debugLine="Dim Pan2 As Panel = Pan.Parent";
_pan2 = new anywheresoftware.b4a.objects.PanelWrapper();
_pan2 = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pan.getParent()));
RDebugUtils.currentLine=72810501;
 //BA.debugLineNum = 72810501;BA.debugLine="Dim sSQL As String = $\"update dta_device_params s";
_ssql = ("update dta_device_params set value='"+__c.SmartStringFormatter("",(Object)(_this.getText()))+"' where tagcode='"+__c.SmartStringFormatter("",_pan2.getTag())+"'");
RDebugUtils.currentLine=72810502;
 //BA.debugLineNum = 72810502;BA.debugLine="Utils.SaveSQLToLog(\"ButParamItem_ValueClick\",sSQL";
_utils._savesqltolog /*boolean*/ (ba,"ButParamItem_ValueClick",_ssql,"");
RDebugUtils.currentLine=72810504;
 //BA.debugLineNum = 72810504;BA.debugLine="End Sub";
return "";
}
public void  _getaddressdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._address _curr,anywheresoftware.b4a.objects.collections.List _typaddress,boolean _asnew) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getaddressdialog", false))
	 {Debug.delegate(ba, "getaddressdialog", new Object[] {_activ,_curr,_typaddress,_asnew}); return;}
ResumableSub_GetAddressDialog rsub = new ResumableSub_GetAddressDialog(this,__ref,_activ,_curr,_typaddress,_asnew);
rsub.resume(ba, null);
}
public static class ResumableSub_GetAddressDialog extends BA.ResumableSub {
public ResumableSub_GetAddressDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._address _curr,anywheresoftware.b4a.objects.collections.List _typaddress,boolean _asnew) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._typaddress = _typaddress;
this._asnew = _asnew;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._address _curr;
anywheresoftware.b4a.objects.collections.List _typaddress;
boolean _asnew;
String _texto = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _res = 0;
xevolution.vrcg.devdemov2400.types._address _settheaddress = null;
int step9;
int limit9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75563009;
 //BA.debugLineNum = 75563009;BA.debugLine="Dim Texto As String = ShareCode.AppDialogsEdicao";
_texto = parent._sharecode._appdialogsedicao /*String*/ ;
RDebugUtils.currentLine=75563010;
 //BA.debugLineNum = 75563010;BA.debugLine="If (asNew) Then Texto = ShareCode.AppDialogsnovo";
if (true) break;

case 1:
//if
this.state = 6;
if ((_asnew)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_texto = parent._sharecode._appdialogsnovo /*String*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75563011;
 //BA.debugLineNum = 75563011;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Texto, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_texto,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75563013;
 //BA.debugLineNum = 75563013;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75563014;
 //BA.debugLineNum = 75563014;BA.debugLine="ApplDialog.SetSize(95%x, 500dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=75563015;
 //BA.debugLineNum = 75563015;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getaddressdialog"), _sf);
this.state = 37;
return;
case 37:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75563016;
 //BA.debugLineNum = 75563016;BA.debugLine="pnl.LoadLayout(\"dialog_entityAddress_device_2\")";
_pnl.LoadLayout("dialog_entityAddress_device_2",ba);
RDebugUtils.currentLine=75563018;
 //BA.debugLineNum = 75563018;BA.debugLine="DialogAddressType.DropdownBackgroundColor = Const";
__ref._dialogaddresstype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75563019;
 //BA.debugLineNum = 75563019;BA.debugLine="For i = 0 To typAddress.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step9 = 1;
limit9 = (int) (_typaddress.getSize()-1);
_i = (int) (0) ;
this.state = 38;
if (true) break;

case 38:
//C
this.state = 10;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 9;
if (true) break;

case 39:
//C
this.state = 38;
_i = ((int)(0 + _i + step9)) ;
if (true) break;

case 9:
//C
this.state = 39;
RDebugUtils.currentLine=75563020;
 //BA.debugLineNum = 75563020;BA.debugLine="DialogAddressType.Add( typAddress.Get(i) )";
__ref._dialogaddresstype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_typaddress.Get(_i)));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=75563023;
 //BA.debugLineNum = 75563023;BA.debugLine="If Not(asNew) Then";

case 10:
//if
this.state = 32;
if (parent.__c.Not(_asnew)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=75563024;
 //BA.debugLineNum = 75563024;BA.debugLine="If (curr.AddressName <> \"\") Then";
if (true) break;

case 13:
//if
this.state = 16;
if (((_curr.AddressName /*String*/ ).equals("") == false)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=75563025;
 //BA.debugLineNum = 75563025;BA.debugLine="DialogAddressName.Text = curr.AddressName";
__ref._dialogaddressname /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.AddressName /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75563027;
 //BA.debugLineNum = 75563027;BA.debugLine="If (curr.AddressName2 <> \"\") Then";

case 16:
//if
this.state = 19;
if (((_curr.AddressName2 /*String*/ ).equals("") == false)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=75563028;
 //BA.debugLineNum = 75563028;BA.debugLine="DialogAddressName2.Text = curr.AddressName2";
__ref._dialogaddressname2 /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.AddressName2 /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75563030;
 //BA.debugLineNum = 75563030;BA.debugLine="If (curr.AddressPostalCode <> \"\") Then";

case 19:
//if
this.state = 22;
if (((_curr.AddressPostalCode /*String*/ ).equals("") == false)) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=75563031;
 //BA.debugLineNum = 75563031;BA.debugLine="DialogAddressPostalCode.Text = curr.AddressPost";
__ref._dialogaddresspostalcode /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.AddressPostalCode /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75563033;
 //BA.debugLineNum = 75563033;BA.debugLine="If (curr.AddressCity <> \"\") Then";

case 22:
//if
this.state = 25;
if (((_curr.AddressCity /*String*/ ).equals("") == false)) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=75563034;
 //BA.debugLineNum = 75563034;BA.debugLine="DialogAddressCity.Text = curr.AddressCity";
__ref._dialogaddresscity /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.AddressCity /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75563036;
 //BA.debugLineNum = 75563036;BA.debugLine="If (curr.AddressLatitude <> \"\") Then";

case 25:
//if
this.state = 28;
if (((_curr.AddressLatitude /*String*/ ).equals("") == false)) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=75563037;
 //BA.debugLineNum = 75563037;BA.debugLine="DialogAddressLatitude.Text = curr.AddressLatitu";
__ref._dialogaddresslatitude /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.AddressLatitude /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75563039;
 //BA.debugLineNum = 75563039;BA.debugLine="If (curr.AddressLongitude <> \"\") Then";

case 28:
//if
this.state = 31;
if (((_curr.AddressLongitude /*String*/ ).equals("") == false)) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=75563040;
 //BA.debugLineNum = 75563040;BA.debugLine="DialogAddressLongitude.Text = curr.AddressLongi";
__ref._dialogaddresslongitude /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.AddressLongitude /*String*/ ));
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=75563044;
 //BA.debugLineNum = 75563044;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getaddressdialog"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 33;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75563045;
 //BA.debugLineNum = 75563045;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 33:
//if
this.state = 36;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=75563046;
 //BA.debugLineNum = 75563046;BA.debugLine="Dim SetTheAddress As Address = _ 			Types.MakeAd";
_settheaddress = parent._types._makeaddress /*xevolution.vrcg.devdemov2400.types._address*/ (ba,__ref._dialogaddresstype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogaddressname /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogaddressname2 /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogaddresspostalcode /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogaddresscity /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogaddresslatitude /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogaddresslongitude /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_asnew);
RDebugUtils.currentLine=75563049;
 //BA.debugLineNum = 75563049;BA.debugLine="CallSub2(activ, \"SetTheAddress\", SetTheAddress)";
parent.__c.CallSubDebug2(ba,_activ,"SetTheAddress",(Object)(_settheaddress));
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=75563051;
 //BA.debugLineNum = 75563051;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getappauthorizationdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,String _funccall,xevolution.vrcg.devdemov2400.types._authorization _authdata,anywheresoftware.b4a.objects.collections.List _versions,int _orientation) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getappauthorizationdialog", false))
	 {Debug.delegate(ba, "getappauthorizationdialog", new Object[] {_activ,_funccall,_authdata,_versions,_orientation}); return;}
ResumableSub_getAppAuthorizationDialog rsub = new ResumableSub_getAppAuthorizationDialog(this,__ref,_activ,_funccall,_authdata,_versions,_orientation);
rsub.resume(ba, null);
}
public static class ResumableSub_getAppAuthorizationDialog extends BA.ResumableSub {
public ResumableSub_getAppAuthorizationDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,String _funccall,xevolution.vrcg.devdemov2400.types._authorization _authdata,anywheresoftware.b4a.objects.collections.List _versions,int _orientation) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._funccall = _funccall;
this._authdata = _authdata;
this._versions = _versions;
this._orientation = _orientation;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
String _funccall;
xevolution.vrcg.devdemov2400.types._authorization _authdata;
anywheresoftware.b4a.objects.collections.List _versions;
int _orientation;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _res = 0;
xevolution.vrcg.devdemov2400.types._authorization _retdata = null;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75431937;
 //BA.debugLineNum = 75431937;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Definiçõ";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Definições de Autorização","Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75431939;
 //BA.debugLineNum = 75431939;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75431940;
 //BA.debugLineNum = 75431940;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=75431941;
 //BA.debugLineNum = 75431941;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (95),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=75431943;
 //BA.debugLineNum = 75431943;BA.debugLine="ApplDialog.SetSize(70%x, 450dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (70),ba),parent.__c.DipToCurrent((int) (450)));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75431945;
 //BA.debugLineNum = 75431945;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getappauthorizationdialog"), _sf);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75431946;
 //BA.debugLineNum = 75431946;BA.debugLine="pnl.LoadLayout(\"dialog_appAuthorization_device_2\"";
_pnl.LoadLayout("dialog_appAuthorization_device_2",ba);
RDebugUtils.currentLine=75431948;
 //BA.debugLineNum = 75431948;BA.debugLine="ConfigEditVersion.DropdownBackgroundColor = Const";
__ref._configeditversion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75431949;
 //BA.debugLineNum = 75431949;BA.debugLine="For i = 0 To versions.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step11 = 1;
limit11 = (int) (_versions.getSize()-1);
_i = (int) (0) ;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 10;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 9;
if (true) break;

case 29:
//C
this.state = 28;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 9:
//C
this.state = 29;
RDebugUtils.currentLine=75431950;
 //BA.debugLineNum = 75431950;BA.debugLine="ConfigEditVersion.Add( versions.Get(i) )";
__ref._configeditversion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_versions.Get(_i)));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=75431952;
 //BA.debugLineNum = 75431952;BA.debugLine="If Not(Utils.isNullOrEmpty(AuthData.Instance)) Th";

case 10:
//if
this.state = 13;
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_authdata.Instance /*String*/ ))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=75431953;
 //BA.debugLineNum = 75431953;BA.debugLine="ConfigEditInstance.Text = AuthData.Instance";
__ref._configeditinstance /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_authdata.Instance /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75431956;
 //BA.debugLineNum = 75431956;BA.debugLine="If Not(Utils.isNullOrEmpty(AuthData.Authorization";

case 13:
//if
this.state = 16;
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_authdata.Authorization /*String*/ ))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=75431957;
 //BA.debugLineNum = 75431957;BA.debugLine="ConfigEditAuth.Text = AuthData.Authorization";
__ref._configeditauth /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_authdata.Authorization /*String*/ ));
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=75431959;
 //BA.debugLineNum = 75431959;BA.debugLine="ConfigEditVersion.SelectedIndex = AuthData.Versio";
__ref._configeditversion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int)(Double.parseDouble(_authdata.Version /*String*/ )));
RDebugUtils.currentLine=75431961;
 //BA.debugLineNum = 75431961;BA.debugLine="ConfigEditOrientation.Add(\"Orientação Landscape\")";
__ref._configeditorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Orientação Landscape");
RDebugUtils.currentLine=75431962;
 //BA.debugLineNum = 75431962;BA.debugLine="ConfigEditOrientation.Add(\"Orientação Portrait\")";
__ref._configeditorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Orientação Portrait");
RDebugUtils.currentLine=75431963;
 //BA.debugLineNum = 75431963;BA.debugLine="ConfigEditOrientation.SelectedIndex = orientation";
__ref._configeditorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_orientation);
RDebugUtils.currentLine=75431964;
 //BA.debugLineNum = 75431964;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 17:
//if
this.state = 20;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=75431965;
 //BA.debugLineNum = 75431965;BA.debugLine="ConfigEditOrientation.Enabled = False";
__ref._configeditorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=75431966;
 //BA.debugLineNum = 75431966;BA.debugLine="ConfigEditOrientation.SelectedIndex = 1";
__ref._configeditorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (1));
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=75431969;
 //BA.debugLineNum = 75431969;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getappauthorizationdialog"), _sf);
this.state = 30;
return;
case 30:
//C
this.state = 21;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75431970;
 //BA.debugLineNum = 75431970;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 21:
//if
this.state = 26;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=75431971;
 //BA.debugLineNum = 75431971;BA.debugLine="Dim retData As Authorization = Types.MakeAuthori";
_retdata = parent._types._makeauthorization /*xevolution.vrcg.devdemov2400.types._authorization*/ (ba,__ref._configeditinstance /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._configeditauth /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),BA.NumberToString(__ref._configeditversion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()),parent._sharecode._app_domain /*String*/ );
RDebugUtils.currentLine=75431972;
 //BA.debugLineNum = 75431972;BA.debugLine="ShareCode.DEVICE_ORIENTATION = ConfigEditOrienta";
parent._sharecode._device_orientation /*int*/  = __ref._configeditorientation /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=75431973;
 //BA.debugLineNum = 75431973;BA.debugLine="CallSub2(activ, funcCall, retData)  '\"SetAuthori";
parent.__c.CallSubNew2(ba,_activ,_funccall,(Object)(_retdata));
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=75431975;
 //BA.debugLineNum = 75431975;BA.debugLine="CallSub(activ, \"prc_AppClose\")";
parent.__c.CallSubDebug(ba,_activ,"prc_AppClose");
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=75431977;
 //BA.debugLineNum = 75431977;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getbluetoothdeviceslistdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getbluetoothdeviceslistdialog", false))
	 {Debug.delegate(ba, "getbluetoothdeviceslistdialog", new Object[] {_activ,_activname,_title}); return;}
ResumableSub_GetBluetoothDevicesListDialog rsub = new ResumableSub_GetBluetoothDevicesListDialog(this,__ref,_activ,_activname,_title);
rsub.resume(ba, null);
}
public static class ResumableSub_GetBluetoothDevicesListDialog extends BA.ResumableSub {
public ResumableSub_GetBluetoothDevicesListDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=78774273;
 //BA.debugLineNum = 78774273;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=78774274;
 //BA.debugLineNum = 78774274;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=78774278;
 //BA.debugLineNum = 78774278;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=78774280;
 //BA.debugLineNum = 78774280;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=78774281;
 //BA.debugLineNum = 78774281;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=78774282;
 //BA.debugLineNum = 78774282;BA.debugLine="ApplDialog.SetSize(80%x, 80%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (80),ba),parent.__c.PerYToCurrent((float) (80),ba));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=78774285;
 //BA.debugLineNum = 78774285;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=78774286;
 //BA.debugLineNum = 78774286;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getbluetoothdeviceslistdialog"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=78774287;
 //BA.debugLineNum = 78774287;BA.debugLine="DialogPanel.LoadLayout(\"dialog_bluetooth_devices\"";
_dialogpanel.LoadLayout("dialog_bluetooth_devices",ba);
RDebugUtils.currentLine=78774288;
 //BA.debugLineNum = 78774288;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.Label.T";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=78774289;
 //BA.debugLineNum = 78774289;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.Label.T";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(parent.__c.Colors.Black);
RDebugUtils.currentLine=78774290;
 //BA.debugLineNum = 78774290;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.ItemHei";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().setItemHeight(parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=78774291;
 //BA.debugLineNum = 78774291;BA.debugLine="Printer.Initialize(Me,\"Printer\",Encoding.Windows1";
__ref._printer /*b4a.example.bt_printer*/ ._initialize(ba,parent,"Printer",parent._encoding._v5);
RDebugUtils.currentLine=78774292;
 //BA.debugLineNum = 78774292;BA.debugLine="ButtonAssociated.Color = Consts.ColorMain";
__ref._buttonassociated /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(parent._consts._colormain /*int*/ );
RDebugUtils.currentLine=78774293;
 //BA.debugLineNum = 78774293;BA.debugLine="ButtonScanPrinter.Color = Consts.ColorMain";
__ref._buttonscanprinter /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(parent._consts._colormain /*int*/ );
RDebugUtils.currentLine=78774294;
 //BA.debugLineNum = 78774294;BA.debugLine="ButtonPrint.Color = Consts.ColorMain";
__ref._buttonprint /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(parent._consts._colormain /*int*/ );
RDebugUtils.currentLine=78774298;
 //BA.debugLineNum = 78774298;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getbluetoothdeviceslistdialog"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=78774299;
 //BA.debugLineNum = 78774299;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 if (true) break;

case 9:
//C
this.state = 10;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=78774306;
 //BA.debugLineNum = 78774306;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getboxeditnumbertext(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this,String _title2show) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getboxeditnumbertext", false))
	 {Debug.delegate(ba, "getboxeditnumbertext", new Object[] {_activ,_this,_title2show}); return;}
ResumableSub_getBoxEditNumberText rsub = new ResumableSub_getBoxEditNumberText(this,__ref,_activ,_this,_title2show);
rsub.resume(ba, null);
}
public static class ResumableSub_getBoxEditNumberText extends BA.ResumableSub {
public ResumableSub_getBoxEditNumberText(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this,String _title2show) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._title2show = _title2show;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _this;
String _title2show;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=80478210;
 //BA.debugLineNum = 80478210;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sho";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title2show,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=80478212;
 //BA.debugLineNum = 80478212;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=80478213;
 //BA.debugLineNum = 80478213;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=80478214;
 //BA.debugLineNum = 80478214;BA.debugLine="ApplDialog.SetSize(300dip, 200dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (200)));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=80478216;
 //BA.debugLineNum = 80478216;BA.debugLine="ApplDialog.SetSize(300dip, 200dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (200)));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=80478218;
 //BA.debugLineNum = 80478218;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditnumbertext"), _sf);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=80478219;
 //BA.debugLineNum = 80478219;BA.debugLine="pnl.LoadLayout(\"dialog_number_text\")";
_pnl.LoadLayout("dialog_number_text",ba);
RDebugUtils.currentLine=80478220;
 //BA.debugLineNum = 80478220;BA.debugLine="BoxEditNumberText.Text=this.Text";
__ref._boxeditnumbertext /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_this.getText()));
RDebugUtils.currentLine=80478221;
 //BA.debugLineNum = 80478221;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditnumbertext"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=80478222;
 //BA.debugLineNum = 80478222;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=80478223;
 //BA.debugLineNum = 80478223;BA.debugLine="this.Text = BoxEditNumberText.Text";
_this.setText((Object)(__ref._boxeditnumbertext /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()));
RDebugUtils.currentLine=80478224;
 //BA.debugLineNum = 80478224;BA.debugLine="CallSubDelayed2(activ, \"ReturnFromNumberBox\", th";
parent.__c.CallSubDelayed2(ba,_activ,"ReturnFromNumberBox",(Object)(_this));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=80478226;
 //BA.debugLineNum = 80478226;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getboxeditnumbertextedit(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.EditTextWrapper _this,String _title2show) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getboxeditnumbertextedit", false))
	 {Debug.delegate(ba, "getboxeditnumbertextedit", new Object[] {_activ,_this,_title2show}); return;}
ResumableSub_getBoxEditNumberTextEDIT rsub = new ResumableSub_getBoxEditNumberTextEDIT(this,__ref,_activ,_this,_title2show);
rsub.resume(ba, null);
}
public static class ResumableSub_getBoxEditNumberTextEDIT extends BA.ResumableSub {
public ResumableSub_getBoxEditNumberTextEDIT(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.EditTextWrapper _this,String _title2show) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._title2show = _title2show;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
anywheresoftware.b4a.objects.EditTextWrapper _this;
String _title2show;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=80543746;
 //BA.debugLineNum = 80543746;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sho";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title2show,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=80543748;
 //BA.debugLineNum = 80543748;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=80543749;
 //BA.debugLineNum = 80543749;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=80543750;
 //BA.debugLineNum = 80543750;BA.debugLine="ApplDialog.SetSize(300dip, 200dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (200)));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=80543752;
 //BA.debugLineNum = 80543752;BA.debugLine="ApplDialog.SetSize(300dip, 200dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (200)));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=80543754;
 //BA.debugLineNum = 80543754;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditnumbertextedit"), _sf);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=80543755;
 //BA.debugLineNum = 80543755;BA.debugLine="pnl.LoadLayout(\"dialog_number_text_edit\")";
_pnl.LoadLayout("dialog_number_text_edit",ba);
RDebugUtils.currentLine=80543756;
 //BA.debugLineNum = 80543756;BA.debugLine="BoxEditNumberTextEDIT.Text=this.Text";
__ref._boxeditnumbertextedit /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_this.getText()));
RDebugUtils.currentLine=80543757;
 //BA.debugLineNum = 80543757;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getboxeditnumbertextedit"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=80543758;
 //BA.debugLineNum = 80543758;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=80543759;
 //BA.debugLineNum = 80543759;BA.debugLine="this.Text = BoxEditNumberTextEDIT.Text";
_this.setText(BA.ObjectToCharSequence(__ref._boxeditnumbertextedit /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=80543760;
 //BA.debugLineNum = 80543760;BA.debugLine="CallSubDelayed2(activ, \"ReturnFromNumberBoxEDIT\"";
parent.__c.CallSubDelayed2(ba,_activ,"ReturnFromNumberBoxEDIT",(Object)(_this));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=80543762;
 //BA.debugLineNum = 80543762;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getcladdselectdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,xevolution.vrcg.devdemov2400.types._requestdata _colitems,anywheresoftware.b4a.objects.collections.List _taglist) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getcladdselectdialog", false))
	 {Debug.delegate(ba, "getcladdselectdialog", new Object[] {_activ,_activname,_title,_colitems,_taglist}); return;}
ResumableSub_getCLADDSelectDialog rsub = new ResumableSub_getCLADDSelectDialog(this,__ref,_activ,_activname,_title,_colitems,_taglist);
rsub.resume(ba, null);
}
public static class ResumableSub_getCLADDSelectDialog extends BA.ResumableSub {
public ResumableSub_getCLADDSelectDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,xevolution.vrcg.devdemov2400.types._requestdata _colitems,anywheresoftware.b4a.objects.collections.List _taglist) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._colitems = _colitems;
this._taglist = _taglist;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
xevolution.vrcg.devdemov2400.types._requestdata _colitems;
anywheresoftware.b4a.objects.collections.List _taglist;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
String _lastgroup = "";
int _row = 0;
xevolution.vrcg.devdemov2400.types._taglisttype _tagitem = null;
String _groupitem = "";
String _groupdesc = "";
String _tagcode = "";
int _res = 0;
int step10;
int limit10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72155137;
 //BA.debugLineNum = 72155137;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=72155138;
 //BA.debugLineNum = 72155138;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=72155139;
 //BA.debugLineNum = 72155139;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, Sh";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,parent._sharecode._option_confirm /*String*/ ,parent._sharecode._option_cancel /*String*/ ,"",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=72155140;
 //BA.debugLineNum = 72155140;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=72155141;
 //BA.debugLineNum = 72155141;BA.debugLine="ApplDialog.SetSize(70%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (70),ba),parent.__c.PerYToCurrent((float) (90),ba));
RDebugUtils.currentLine=72155142;
 //BA.debugLineNum = 72155142;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=72155144;
 //BA.debugLineNum = 72155144;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getcladdselectdialog"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=72155145;
 //BA.debugLineNum = 72155145;BA.debugLine="DialogPanel.LoadLayout(\"task_item_detail_list_chk";
_dialogpanel.LoadLayout("task_item_detail_list_chk",ba);
RDebugUtils.currentLine=72155146;
 //BA.debugLineNum = 72155146;BA.debugLine="Dim LastGroup As String = \"\"";
_lastgroup = "";
RDebugUtils.currentLine=72155147;
 //BA.debugLineNum = 72155147;BA.debugLine="For Row = 0 To TagList.size-1";
if (true) break;

case 1:
//for
this.state = 8;
step10 = 1;
limit10 = (int) (_taglist.getSize()-1);
_row = (int) (0) ;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if ((step10 > 0 && _row <= limit10) || (step10 < 0 && _row >= limit10)) this.state = 3;
if (true) break;

case 15:
//C
this.state = 14;
_row = ((int)(0 + _row + step10)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=72155148;
 //BA.debugLineNum = 72155148;BA.debugLine="Dim TagItem As TagListType = TagList.Get(Row)";
_tagitem = (xevolution.vrcg.devdemov2400.types._taglisttype)(_taglist.Get(_row));
RDebugUtils.currentLine=72155150;
 //BA.debugLineNum = 72155150;BA.debugLine="Dim GroupItem As String = TagItem.taggroup";
_groupitem = _tagitem.taggroup /*String*/ ;
RDebugUtils.currentLine=72155151;
 //BA.debugLineNum = 72155151;BA.debugLine="Dim Groupdesc As String = TagItem.taggroup";
_groupdesc = _tagitem.taggroup /*String*/ ;
RDebugUtils.currentLine=72155152;
 //BA.debugLineNum = 72155152;BA.debugLine="Dim title As String = TagItem.tagname";
_title = _tagitem.tagname /*String*/ ;
RDebugUtils.currentLine=72155153;
 //BA.debugLineNum = 72155153;BA.debugLine="Dim tagcode As String = TagItem.tagcode";
_tagcode = _tagitem.tagcode /*String*/ ;
RDebugUtils.currentLine=72155154;
 //BA.debugLineNum = 72155154;BA.debugLine="If (GroupItem.Trim <> LastGroup.Trim) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (((_groupitem.trim()).equals(_lastgroup.trim()) == false)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=72155155;
 //BA.debugLineNum = 72155155;BA.debugLine="LastGroup = GroupItem";
_lastgroup = _groupitem;
RDebugUtils.currentLine=72155156;
 //BA.debugLineNum = 72155156;BA.debugLine="ListItemsListChk.Add( createCLADDGroupLineItemD";
__ref._listitemslistchk /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createcladdgrouplineitemdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_groupdesc,parent.__c.DipToCurrent((int) (45))).getObject())),(Object)(_groupitem));
 if (true) break;

case 7:
//C
this.state = 15;
;
RDebugUtils.currentLine=72155158;
 //BA.debugLineNum = 72155158;BA.debugLine="ListItemsListChk.Add( createCLADDLineItemDetail(";
__ref._listitemslistchk /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createcladdlineitemdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_tagcode,_title,parent.__c.DipToCurrent((int) (45)),_tagitem).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=72155161;
 //BA.debugLineNum = 72155161;BA.debugLine="HiddenListItemLabel = Types.MakeTagListType( \"\",";
__ref._hiddenlistitemlabel /*Object*/  = (Object)(parent._types._maketaglisttype /*xevolution.vrcg.devdemov2400.types._taglisttype*/ (ba,"","",""));
RDebugUtils.currentLine=72155162;
 //BA.debugLineNum = 72155162;BA.debugLine="HiddenListItemTagList = Types.MakeTagListType( \"\"";
__ref._hiddenlistitemtaglist /*xevolution.vrcg.devdemov2400.types._taglisttype*/  = parent._types._maketaglisttype /*xevolution.vrcg.devdemov2400.types._taglisttype*/ (ba,"","","");
RDebugUtils.currentLine=72155163;
 //BA.debugLineNum = 72155163;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.POSITIVE).setEnabled(parent.__c.False);
RDebugUtils.currentLine=72155165;
 //BA.debugLineNum = 72155165;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getcladdselectdialog"), _sf);
this.state = 16;
return;
case 16:
//C
this.state = 9;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=72155166;
 //BA.debugLineNum = 72155166;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=72155167;
 //BA.debugLineNum = 72155167;BA.debugLine="CallSub3(ThisActivityName, \"ReturnFromListCLADD\"";
parent.__c.CallSubDebug3(ba,__ref._thisactivityname /*Object*/ ,"ReturnFromListCLADD",(Object)(_colitems),(Object)(__ref._hiddenlistitemtaglist /*xevolution.vrcg.devdemov2400.types._taglisttype*/ ));
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=72155169;
 //BA.debugLineNum = 72155169;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getcontactdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._contactrecord _curr,anywheresoftware.b4a.objects.collections.List _typcontacts,boolean _asnew) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getcontactdialog", false))
	 {Debug.delegate(ba, "getcontactdialog", new Object[] {_activ,_curr,_typcontacts,_asnew}); return;}
ResumableSub_GetContactDialog rsub = new ResumableSub_GetContactDialog(this,__ref,_activ,_curr,_typcontacts,_asnew);
rsub.resume(ba, null);
}
public static class ResumableSub_GetContactDialog extends BA.ResumableSub {
public ResumableSub_GetContactDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._contactrecord _curr,anywheresoftware.b4a.objects.collections.List _typcontacts,boolean _asnew) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._typcontacts = _typcontacts;
this._asnew = _asnew;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._contactrecord _curr;
anywheresoftware.b4a.objects.collections.List _typcontacts;
boolean _asnew;
String _texto = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _res = 0;
xevolution.vrcg.devdemov2400.types._contactrecord _setthecontact = null;
int step9;
int limit9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75694081;
 //BA.debugLineNum = 75694081;BA.debugLine="Dim Texto As String = ShareCode.AppDialogsEdicao";
_texto = parent._sharecode._appdialogsedicao /*String*/ ;
RDebugUtils.currentLine=75694082;
 //BA.debugLineNum = 75694082;BA.debugLine="If (asNew) Then Texto = ShareCode.AppDialogsnovo";
if (true) break;

case 1:
//if
this.state = 6;
if ((_asnew)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_texto = parent._sharecode._appdialogsnovo /*String*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75694083;
 //BA.debugLineNum = 75694083;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Texto, Sh";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_texto,parent._sharecode._option_confirm /*String*/ ,parent._sharecode._option_cancel /*String*/ ,"",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75694085;
 //BA.debugLineNum = 75694085;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75694086;
 //BA.debugLineNum = 75694086;BA.debugLine="ApplDialog.SetSize(95%x, 450dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.DipToCurrent((int) (450)));
RDebugUtils.currentLine=75694087;
 //BA.debugLineNum = 75694087;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getcontactdialog"), _sf);
this.state = 32;
return;
case 32:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75694088;
 //BA.debugLineNum = 75694088;BA.debugLine="pnl.LoadLayout(\"dialog_ContactEdit_device_2\")";
_pnl.LoadLayout("dialog_ContactEdit_device_2",ba);
RDebugUtils.currentLine=75694090;
 //BA.debugLineNum = 75694090;BA.debugLine="DialogContactType.DropdownBackgroundColor = Const";
__ref._dialogcontacttype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75694091;
 //BA.debugLineNum = 75694091;BA.debugLine="For i = 0 To typContacts.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step9 = 1;
limit9 = (int) (_typcontacts.getSize()-1);
_i = (int) (0) ;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 10;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 9;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step9)) ;
if (true) break;

case 9:
//C
this.state = 34;
RDebugUtils.currentLine=75694092;
 //BA.debugLineNum = 75694092;BA.debugLine="DialogContactType.Add( typContacts.Get(i) )";
__ref._dialogcontacttype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_typcontacts.Get(_i)));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=75694094;
 //BA.debugLineNum = 75694094;BA.debugLine="DialogContactType.SelectedIndex = curr.contactTyp";
__ref._dialogcontacttype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.contactType /*int*/ );
RDebugUtils.currentLine=75694095;
 //BA.debugLineNum = 75694095;BA.debugLine="If Not(asNew) Then";
if (true) break;

case 11:
//if
this.state = 27;
if (parent.__c.Not(_asnew)) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=75694096;
 //BA.debugLineNum = 75694096;BA.debugLine="If (curr.contactName <> \"\") Then";
if (true) break;

case 14:
//if
this.state = 17;
if (((_curr.contactName /*String*/ ).equals("") == false)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=75694097;
 //BA.debugLineNum = 75694097;BA.debugLine="DialogContactName.Text = curr.contactName";
__ref._dialogcontactname /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.contactName /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75694099;
 //BA.debugLineNum = 75694099;BA.debugLine="If (curr.contactTitle <> \"\") Then";

case 17:
//if
this.state = 20;
if (((_curr.contactTitle /*String*/ ).equals("") == false)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=75694100;
 //BA.debugLineNum = 75694100;BA.debugLine="DialogContactTitle.Text = curr.contactTitle";
__ref._dialogcontacttitle /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.contactTitle /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75694102;
 //BA.debugLineNum = 75694102;BA.debugLine="If (curr.contactEmail <> \"\") Then";

case 20:
//if
this.state = 23;
if (((_curr.contactEmail /*String*/ ).equals("") == false)) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=75694103;
 //BA.debugLineNum = 75694103;BA.debugLine="DialogContactEmail.Text = curr.contactEmail";
__ref._dialogcontactemail /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.contactEmail /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75694105;
 //BA.debugLineNum = 75694105;BA.debugLine="If (curr.contactPhone <> \"\") Then";

case 23:
//if
this.state = 26;
if (((_curr.contactPhone /*String*/ ).equals("") == false)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=75694106;
 //BA.debugLineNum = 75694106;BA.debugLine="DialogContactPhone.Text = curr.contactPhone";
__ref._dialogcontactphone /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.contactPhone /*String*/ ));
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=75694110;
 //BA.debugLineNum = 75694110;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getcontactdialog"), _sf);
this.state = 35;
return;
case 35:
//C
this.state = 28;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75694111;
 //BA.debugLineNum = 75694111;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 28:
//if
this.state = 31;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=75694112;
 //BA.debugLineNum = 75694112;BA.debugLine="Dim SetTheContact As ContactRecord = _ 			Types.";
_setthecontact = parent._types._makecontact /*xevolution.vrcg.devdemov2400.types._contactrecord*/ (ba,__ref._dialogaddresstype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogcontactname /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogcontacttitle /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogcontactemail /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogcontactphone /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_curr.tagcode /*String*/ ,_asnew);
RDebugUtils.currentLine=75694115;
 //BA.debugLineNum = 75694115;BA.debugLine="CallSub2(activ, \"SetTheContact\", SetTheContact)";
parent.__c.CallSubDebug2(ba,_activ,"SetTheContact",(Object)(_setthecontact));
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=75694117;
 //BA.debugLineNum = 75694117;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _updateallflags(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "updateallflags", false))
	 {return ((String) Debug.delegate(ba, "updateallflags", null));}
RDebugUtils.currentLine=72417280;
 //BA.debugLineNum = 72417280;BA.debugLine="Sub updateAllFlags";
RDebugUtils.currentLine=72417282;
 //BA.debugLineNum = 72417282;BA.debugLine="ShareCode.DEVICE_ONLY_TECHORUSER 			= Utils.IfNul";
_sharecode._device_only_techoruser /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_ONLY_TECHORUSER")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417283;
 //BA.debugLineNum = 72417283;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ID 			= Utils.IfNul";
_sharecode._device_show_request_id /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_SHOW_REQUEST_ID")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417284;
 //BA.debugLineNum = 72417284;BA.debugLine="ShareCode.DEVICE_PARAM_DATA_CONFIRM 		= Utils.IfN";
_sharecode._device_param_data_confirm /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_DATA_CONFIRM")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417285;
 //BA.debugLineNum = 72417285;BA.debugLine="ShareCode.DEVICE_PARAM_AVAILABILITY 		= Utils.IfN";
_sharecode._device_param_availability /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_AVAILABILITY")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417286;
 //BA.debugLineNum = 72417286;BA.debugLine="ShareCode.DEVICE_PARAM_FAVORITES 			= Utils.IfNul";
_sharecode._device_param_favorites /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_FAVORITES")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417287;
 //BA.debugLineNum = 72417287;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_REQUEST 		= Utils.If";
_sharecode._device_param_pause_request /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_PAUSE_REQUEST")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417288;
 //BA.debugLineNum = 72417288;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_TECH 			= Utils.IfNu";
_sharecode._device_param_pause_tech /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_PAUSE_TECH")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417289;
 //BA.debugLineNum = 72417289;BA.debugLine="ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION = Uti";
_sharecode._device_request_upload_onexecution /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_UPLOAD_ONEXECUTION")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417290;
 //BA.debugLineNum = 72417290;BA.debugLine="ShareCode.DEVICE_REQUEST_AUTOUPDT_ONALERT 	= Util";
_sharecode._device_request_autoupdt_onalert /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_AUTOUPDT_ONALERT")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417291;
 //BA.debugLineNum = 72417291;BA.debugLine="ShareCode.DEVICE_AS_SEND_IMMEDIATLY 		= Utils.IfN";
_sharecode._device_as_send_immediatly /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_AS_SEND_IMMEDIATLY")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417292;
 //BA.debugLineNum = 72417292;BA.debugLine="ShareCode.DEVICE_REQUEST_HIDECANCELED 		= Utils.I";
_sharecode._device_request_hidecanceled /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_HIDECANCELED")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417293;
 //BA.debugLineNum = 72417293;BA.debugLine="ShareCode.DEVICE_AUTOUPDATE_ONLOGIN 		= Utils.IfN";
_sharecode._device_autoupdate_onlogin /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_AUTOUPDATE_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417294;
 //BA.debugLineNum = 72417294;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_FIRST 			= Utils.IfN";
_sharecode._device_auto_expand_first /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_AUTO_EXPAND_FIRST")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417295;
 //BA.debugLineNum = 72417295;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_CHECKLIST 		= Utils.";
_sharecode._device_auto_expand_checklist /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_AUTO_EXPAND_CHECKLIST")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417296;
 //BA.debugLineNum = 72417296;BA.debugLine="ShareCode.DEVICE_DEFAULT_ROUTE 				= Utils.IfNull";
_sharecode._device_default_route /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_DEFAULT_ROUTE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417297;
 //BA.debugLineNum = 72417297;BA.debugLine="ShareCode.DEVICE_AS_INCLUDE_OBS_FIRST 		= Utils.I";
_sharecode._device_as_include_obs_first /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_AS_INCLUDE_OBS_FIRST")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417298;
 //BA.debugLineNum = 72417298;BA.debugLine="ShareCode.DEVICE_PARAM_PRINT_DRAFT 			= Utils.IfN";
_sharecode._device_param_print_draft /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_PRINT_DRAFT")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417299;
 //BA.debugLineNum = 72417299;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ROUTE 		= Utils.IfN";
_sharecode._device_show_request_route /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_SHOW_REQUEST_ROUTE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417300;
 //BA.debugLineNum = 72417300;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER 		= Utils.IfN";
_sharecode._device_request_push_other /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_PUSH_OTHER")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417301;
 //BA.debugLineNum = 72417301;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_QUALITY 		= Utils.If";
_sharecode._device_param_photo_quality /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,_dbstructures._getparamstatefield /*String*/ (ba,"DEVICE_PARAM_PHOTO_QUALITY","value"),BA.NumberToString(90))));
RDebugUtils.currentLine=72417302;
 //BA.debugLineNum = 72417302;BA.debugLine="ShareCode.DEVICE_REOPEN_CHECKLISTS 			= Utils.IfN";
_sharecode._device_reopen_checklists /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REOPEN_CHECKLISTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417305;
 //BA.debugLineNum = 72417305;BA.debugLine="ShareCode.DEVICE_REQUEST_SIGNATURE_TRG 		= Utils.";
_sharecode._device_request_signature_trg /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_SIGNATURE_TRG")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417306;
 //BA.debugLineNum = 72417306;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER_AUTH 	= Utils";
_sharecode._device_request_push_other_auth /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_PUSH_OTHER_AUTH")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417307;
 //BA.debugLineNum = 72417307;BA.debugLine="ShareCode.DEVICE_PARAM_ORIENTATION 			= Utils.IfN";
_sharecode._device_param_orientation /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ORIENTATION")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417308;
 //BA.debugLineNum = 72417308;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE 		= Utils.I";
_sharecode._device_param_photo_fontsize /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,_dbstructures._getparamstatefield /*String*/ (ba,"DEVICE_PARAM_PHOTO_FONTSIZE","value"),BA.NumberToString(12))));
RDebugUtils.currentLine=72417309;
 //BA.debugLineNum = 72417309;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_HEIGHT 		= Utils.IfN";
_sharecode._device_param_photo_height /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,_dbstructures._getparamstatefield /*String*/ (ba,"DEVICE_PARAM_PHOTO_HEIGHT","value"),BA.NumberToString(615))));
RDebugUtils.currentLine=72417310;
 //BA.debugLineNum = 72417310;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_WIDTH 			= Utils.IfN";
_sharecode._device_param_photo_width /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,_dbstructures._getparamstatefield /*String*/ (ba,"DEVICE_PARAM_PHOTO_WIDTH","value"),BA.NumberToString(820))));
RDebugUtils.currentLine=72417311;
 //BA.debugLineNum = 72417311;BA.debugLine="ShareCode.DEVICE_REQUEST_CAN_DELETE_OWNED 	= Util";
_sharecode._device_request_can_delete_owned /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_CAN_DELETE_OWNED")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417312;
 //BA.debugLineNum = 72417312;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FILETYPE 		= Utils.I";
_sharecode._device_param_photo_filetype /*String*/  = _utils._ifnullorempty /*String*/ (ba,_dbstructures._getparamstatefield /*String*/ (ba,"DEVICE_PARAM_PHOTO_FILETYPE","value"),"PNG");
RDebugUtils.currentLine=72417313;
 //BA.debugLineNum = 72417313;BA.debugLine="ShareCode.DEVICE_PARAM_PULL 				= Utils.IfNullOrE";
_sharecode._device_param_pull /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_PULL")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417314;
 //BA.debugLineNum = 72417314;BA.debugLine="ShareCode.DEVICE_PARAM_ROUTES 				= Utils.IfNullO";
_sharecode._device_param_routes /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ROUTES")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417316;
 //BA.debugLineNum = 72417316;BA.debugLine="ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.I";
_sharecode._device_param_generatereport /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_GENERATEREPORT")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417318;
 //BA.debugLineNum = 72417318;BA.debugLine="ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.";
_sharecode._device_param_resync_requests /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_RESYNC_REQUESTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417319;
 //BA.debugLineNum = 72417319;BA.debugLine="ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Uti";
_sharecode._device_param_runcl_notyperequest /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_RUNCL_NOTYPEREQUEST")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417320;
 //BA.debugLineNum = 72417320;BA.debugLine="ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.If";
_sharecode._device_param_foto_evidence /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_FOTO_EVIDENCE")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417321;
 //BA.debugLineNum = 72417321;BA.debugLine="ShareCode.DEVICE_PARAM_DRAW_EVIDENCE 		= Utils.If";
_sharecode._device_param_draw_evidence /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_DRAW_EVIDENCE")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417323;
 //BA.debugLineNum = 72417323;BA.debugLine="ShareCode.DEVICE_PARAM_SENDREPORT 					= Utils.if";
_sharecode._device_param_sendreport /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_SENDREPORT")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417324;
 //BA.debugLineNum = 72417324;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_OBJECT 			= Util";
_sharecode._device_param_canchange_object /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_CANCHANGE_OBJECT")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417325;
 //BA.debugLineNum = 72417325;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_ENTITY 			= Util";
_sharecode._device_param_canchange_entity /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_CANCHANGE_ENTITY")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417326;
 //BA.debugLineNum = 72417326;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CANDUPLICATE 		= U";
_sharecode._device_param_request_canduplicate /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_REQUEST_CANDUPLICATE")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417327;
 //BA.debugLineNum = 72417327;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSIGNTO 			= Util";
_sharecode._device_param_request_assignto /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_REQUEST_ASSIGNTO")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417328;
 //BA.debugLineNum = 72417328;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT";
_sharecode._device_param_request_assto_mustaccept /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417329;
 //BA.debugLineNum = 72417329;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANG";
_sharecode._device_param_request_infotitle_canchange /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417330;
 //BA.debugLineNum = 72417330;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE";
_sharecode._device_param_request_cltitle_canchange /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417331;
 //BA.debugLineNum = 72417331;BA.debugLine="ShareCode.DEVICE_PARAM_ADDITIONAL_USERS_REGISTER";
_sharecode._device_param_additional_users_register /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ADDITIONAL_USERS_REGISTER")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417332;
 //BA.debugLineNum = 72417332;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY";
_sharecode._device_param_login_mustselect_comapny /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417333;
 //BA.debugLineNum = 72417333;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONME";
_sharecode._device_param_login_mustselect_environment /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417334;
 //BA.debugLineNum = 72417334;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRST";
_sharecode._device_param_login_passwordchange_firsttime /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417335;
 //BA.debugLineNum = 72417335;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL";
_sharecode._device_param_login_allow_qrcode_control /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417336;
 //BA.debugLineNum = 72417336;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL";
_sharecode._device_param_login_allow_facial_control /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417337;
 //BA.debugLineNum = 72417337;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL";
_sharecode._device_param_request_enddate_control /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_REQUEST_ENDDATE_CONTROL")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417338;
 //BA.debugLineNum = 72417338;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW";
_sharecode._device_param_request_enddate_inday_show /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417340;
 //BA.debugLineNum = 72417340;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOWNEWICON_ONALERT 		=";
_sharecode._device_request_shownewicon_onalert /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_SHOWNEWICON_ONALERT")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417341;
 //BA.debugLineNum = 72417341;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST";
_sharecode._device_param_object_allow_new_request /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417342;
 //BA.debugLineNum = 72417342;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL 		=";
_sharecode._device_param_object_allow_view_all /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417343;
 //BA.debugLineNum = 72417343;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSO";
_sharecode._device_param_object_allow_evidence_associate /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417344;
 //BA.debugLineNum = 72417344;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB";
_sharecode._device_param_object_allow_requests_tab /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417345;
 //BA.debugLineNum = 72417345;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUM";
_sharecode._device_param_object_allow_relations_jump /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417346;
 //BA.debugLineNum = 72417346;BA.debugLine="ShareCode.DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE";
_sharecode._device_request_update_server_onclose /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417347;
 //BA.debugLineNum = 72417347;BA.debugLine="ShareCode.DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT 		=";
_sharecode._device_checklist_alldocs_in_object /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417348;
 //BA.debugLineNum = 72417348;BA.debugLine="ShareCode.DEVICE_PARAM_DEFAULT_DATE_PERIOD 			= U";
_sharecode._device_param_default_date_period /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_DEFAULT_DATE_PERIOD")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417349;
 //BA.debugLineNum = 72417349;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER 			= U";
_sharecode._device_request_show_date_divider /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_SHOW_DATE_DIVIDER")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417351;
 //BA.debugLineNum = 72417351;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE 		=";
_sharecode._device_checklist_svrimgudp_onclose /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417352;
 //BA.debugLineNum = 72417352;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGE";
_sharecode._device_checklist_svrimgudp_width_trigger /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417353;
 //BA.debugLineNum = 72417353;BA.debugLine="ShareCode.DEVICE_ASKTOUPDATE_ONLOGIN 				= Utils.";
_sharecode._device_asktoupdate_onlogin /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_ASKTOUPDATE_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417354;
 //BA.debugLineNum = 72417354;BA.debugLine="ShareCode.DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY";
_sharecode._device_checklist_include_public_gallery /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417355;
 //BA.debugLineNum = 72417355;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REQUESTS 				= Util";
_sharecode._device_param_access_requests /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ACCESS_REQUESTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417356;
 //BA.debugLineNum = 72417356;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REPORTS 				= Utils";
_sharecode._device_param_access_reports /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ACCESS_REPORTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417357;
 //BA.debugLineNum = 72417357;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_ALERTS 				= Utils.";
_sharecode._device_param_access_alerts /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ACCESS_ALERTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417358;
 //BA.debugLineNum = 72417358;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_OBJECTS 				= Utils";
_sharecode._device_param_access_objects /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ACCESS_OBJECTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417359;
 //BA.debugLineNum = 72417359;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_TASKS 				= Utils.i";
_sharecode._device_param_access_tasks /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ACCESS_TASKS")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417360;
 //BA.debugLineNum = 72417360;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_MYDATA 				= Utils.";
_sharecode._device_param_access_mydata /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ACCESS_MYDATA")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417361;
 //BA.debugLineNum = 72417361;BA.debugLine="ShareCode.DEVICE_REQUEST_CUSTOMORDER 				= Utils.";
_sharecode._device_request_customorder /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REQUEST_CUSTOMORDER")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417363;
 //BA.debugLineNum = 72417363;BA.debugLine="ShareCode.DEVICE_CHECKLIST_STARTON_MYDATA 			= Ut";
_sharecode._device_checklist_starton_mydata /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_STARTON_MYDATA")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417364;
 //BA.debugLineNum = 72417364;BA.debugLine="ShareCode.DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP 		=";
_sharecode._device_checklist_mydata_docs_ontop /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417366;
 //BA.debugLineNum = 72417366;BA.debugLine="ShareCode.DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND";
_sharecode._device_checklist_objectmandatory_onend /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417367;
 //BA.debugLineNum = 72417367;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONE";
_sharecode._device_checklist_siganturemandatory_onend /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417368;
 //BA.debugLineNum = 72417368;BA.debugLine="ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE 		= U";
_sharecode._device_param_activate_printmodule /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_ACTIVATE_PRINTMODULE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417369;
 //BA.debugLineNum = 72417369;BA.debugLine="ShareCode.DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGI";
_sharecode._device_param_testconnected_print_onlogin /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417370;
 //BA.debugLineNum = 72417370;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOS";
_sharecode._device_checklist_autoreturn_after_fotoshot /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417371;
 //BA.debugLineNum = 72417371;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSA";
_sharecode._device_checklist_autoreturn_after_subsaction /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417372;
 //BA.debugLineNum = 72417372;BA.debugLine="ShareCode.DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS";
_sharecode._device_checklist_copy_asdetails_to_obs /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417373;
 //BA.debugLineNum = 72417373;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNA";
_sharecode._device_checklist_autoreturn_after_signature /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417375;
 //BA.debugLineNum = 72417375;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE = Uti";
_sharecode._device_param_inverted_foto_device /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_INVERTED_FOTO_DEVICE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417376;
 //BA.debugLineNum = 72417376;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE";
_sharecode._device_param_inverted_horiz_foto_device /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417378;
 //BA.debugLineNum = 72417378;BA.debugLine="ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = Uti";
_sharecode._device_report_date_from_checklist /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_REPORT_DATE_FROM_CHECKLIST")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417380;
 //BA.debugLineNum = 72417380;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_START_NEWWAY = Utils";
_sharecode._device_typerequest_start_newway /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_TYPEREQUEST_START_NEWWAY")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417381;
 //BA.debugLineNum = 72417381;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY";
_sharecode._device_typerequest_define_start_newway /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417383;
 //BA.debugLineNum = 72417383;BA.debugLine="ShareCode.DEVICE_EMAIL_OLD_MODEL = Utils.ifnullor";
_sharecode._device_email_old_model /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_EMAIL_OLD_MODEL")),BA.NumberToString(1))));
RDebugUtils.currentLine=72417384;
 //BA.debugLineNum = 72417384;BA.debugLine="ShareCode.EmailOldModel = Utils.Int2Bool(ShareCod";
_sharecode._emailoldmodel /*boolean*/  = _utils._int2bool /*boolean*/ (ba,_sharecode._device_email_old_model /*int*/ );
RDebugUtils.currentLine=72417385;
 //BA.debugLineNum = 72417385;BA.debugLine="ShareCode.DEVICE_SHOW_GLOBAL_SEARCH = Utils.ifnul";
_sharecode._device_show_global_search /*int*/  = (int)(Double.parseDouble(_utils._ifnullorempty /*String*/ (ba,BA.NumberToString(_dbstructures._getparamstate /*int*/ (ba,"DEVICE_SHOW_GLOBAL_SEARCH")),BA.NumberToString(0))));
RDebugUtils.currentLine=72417392;
 //BA.debugLineNum = 72417392;BA.debugLine="ShareCode.STS005 = Utils.Int2Bool(ShareCode.DEVIC";
_sharecode._sts005 /*boolean*/  = _utils._int2bool /*boolean*/ (ba,_sharecode._device_request_hidecanceled /*int*/ );
RDebugUtils.currentLine=72417394;
 //BA.debugLineNum = 72417394;BA.debugLine="ShareCode.DEVICE_DEF_FONT_SIZE = ShareCode.DEVICE";
_sharecode._device_def_font_size /*int*/  = _sharecode._device_param_photo_fontsize /*int*/ ;
RDebugUtils.currentLine=72417395;
 //BA.debugLineNum = 72417395;BA.debugLine="ShareCode.DEVICE_DEF_QUALITY = ShareCode.DEVICE_P";
_sharecode._device_def_quality /*int*/  = _sharecode._device_param_photo_quality /*int*/ ;
RDebugUtils.currentLine=72417396;
 //BA.debugLineNum = 72417396;BA.debugLine="ShareCode.DEVICE_DEF_IMG_FILETYPE = ShareCode.DEV";
_sharecode._device_def_img_filetype /*String*/  = _sharecode._device_param_photo_filetype /*String*/ ;
RDebugUtils.currentLine=72417397;
 //BA.debugLineNum = 72417397;BA.debugLine="ShareCode.DEVICE_DEF_IMG_WIDTH = ShareCode.DEVICE";
_sharecode._device_def_img_width /*int*/  = _sharecode._device_param_photo_width /*int*/ ;
RDebugUtils.currentLine=72417398;
 //BA.debugLineNum = 72417398;BA.debugLine="ShareCode.DEVICE_DEF_IMG_HEIGHT = ShareCode.DEVIC";
_sharecode._device_def_img_height /*int*/  = _sharecode._device_param_photo_height /*int*/ ;
RDebugUtils.currentLine=72417399;
 //BA.debugLineNum = 72417399;BA.debugLine="End Sub";
return "";
}
public void  _updatedeallflagsserver(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "updatedeallflagsserver", false))
	 {Debug.delegate(ba, "updatedeallflagsserver", null); return;}
ResumableSub_updatedeAllFlagsServer rsub = new ResumableSub_updatedeAllFlagsServer(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_updatedeAllFlagsServer extends BA.ResumableSub {
public ResumableSub_updatedeAllFlagsServer(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _thiscursor = null;
String _outstring = "";
int _n = 0;
String _tagcode = "";
int _value_state = 0;
String _valueout = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72482817;
 //BA.debugLineNum = 72482817;BA.debugLine="Dim thisCursor As Cursor = Starter.LocalSQLEVC.Ex";
_thiscursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_thiscursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("SELECT tagcode, value_state, ifnull(VALUE, '') AS valueout FROM dta_device_params"))));
RDebugUtils.currentLine=72482818;
 //BA.debugLineNum = 72482818;BA.debugLine="Dim outString As String = \"\"";
_outstring = "";
RDebugUtils.currentLine=72482819;
 //BA.debugLineNum = 72482819;BA.debugLine="If thisCursor.RowCount >= 1 Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_thiscursor.getRowCount()>=1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=72482820;
 //BA.debugLineNum = 72482820;BA.debugLine="For n=0 To thisCursor.RowCount-1";
if (true) break;

case 4:
//for
this.state = 11;
step4 = 1;
limit4 = (int) (_thiscursor.getRowCount()-1);
_n = (int) (0) ;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 11;
if ((step4 > 0 && _n <= limit4) || (step4 < 0 && _n >= limit4)) this.state = 6;
if (true) break;

case 29:
//C
this.state = 28;
_n = ((int)(0 + _n + step4)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=72482821;
 //BA.debugLineNum = 72482821;BA.debugLine="thisCursor.Position = n";
_thiscursor.setPosition(_n);
RDebugUtils.currentLine=72482822;
 //BA.debugLineNum = 72482822;BA.debugLine="Dim tagcode As String = thisCursor.GetString(\"t";
_tagcode = _thiscursor.GetString("tagcode");
RDebugUtils.currentLine=72482823;
 //BA.debugLineNum = 72482823;BA.debugLine="Dim value_state As Int = thisCursor.GetInt(\"val";
_value_state = _thiscursor.GetInt("value_state");
RDebugUtils.currentLine=72482824;
 //BA.debugLineNum = 72482824;BA.debugLine="Dim valueout As String = thisCursor.GetString(\"";
_valueout = _thiscursor.GetString("valueout");
RDebugUtils.currentLine=72482825;
 //BA.debugLineNum = 72482825;BA.debugLine="If (Utils.NNE(outString)) Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._utils._nne /*boolean*/ (ba,_outstring))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=72482826;
 //BA.debugLineNum = 72482826;BA.debugLine="outString = $\"${outString}|\"$";
_outstring = (""+parent.__c.SmartStringFormatter("",(Object)(_outstring))+"|");
 if (true) break;

case 10:
//C
this.state = 29;
;
RDebugUtils.currentLine=72482828;
 //BA.debugLineNum = 72482828;BA.debugLine="outString = $\"${outString}${tagcode},${value_st";
_outstring = (""+parent.__c.SmartStringFormatter("",(Object)(_outstring))+""+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+","+parent.__c.SmartStringFormatter("",(Object)(_value_state))+","+parent.__c.SmartStringFormatter("",(Object)(_valueout))+"");
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;
;
RDebugUtils.currentLine=72482832;
 //BA.debugLineNum = 72482832;BA.debugLine="If (Utils.NNE(outString)) Then";

case 12:
//if
this.state = 27;
if ((parent._utils._nne /*boolean*/ (ba,_outstring))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=72482833;
 //BA.debugLineNum = 72482833;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=72482834;
 //BA.debugLineNum = 72482834;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=72482835;
 //BA.debugLineNum = 72482835;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=72482836;
 //BA.debugLineNum = 72482836;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=72482837;
 //BA.debugLineNum = 72482837;BA.debugLine="params.Put(\"outString\", outString)";
_params.Put((Object)("outString"),(Object)(_outstring));
RDebugUtils.currentLine=72482838;
 //BA.debugLineNum = 72482838;BA.debugLine="params.Put(\"ACLSessUser\", ShareCode.SESS_OPER_Us";
_params.Put((Object)("ACLSessUser"),(Object)(parent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=72482839;
 //BA.debugLineNum = 72482839;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=72482840;
 //BA.debugLineNum = 72482840;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=72482841;
 //BA.debugLineNum = 72482841;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=72482842;
 //BA.debugLineNum = 72482842;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=72482843;
 //BA.debugLineNum = 72482843;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=72482844;
 //BA.debugLineNum = 72482844;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=72482845;
 //BA.debugLineNum = 72482845;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=72482846;
 //BA.debugLineNum = 72482846;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/device/params/update");
RDebugUtils.currentLine=72482847;
 //BA.debugLineNum = 72482847;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLO";
if (true) break;

case 15:
//if
this.state = 26;
if ((parent._utils._int2bool /*boolean*/ (ba,parent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 17;
}else {
this.state = 25;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=72482848;
 //BA.debugLineNum = 72482848;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 18:
//if
this.state = 23;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=72482849;
 //BA.debugLineNum = 72482849;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"","");
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=72482851;
 //BA.debugLineNum = 72482851;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (4),"","","");
RDebugUtils.currentLine=72482852;
 //BA.debugLineNum = 72482852;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 23:
//C
this.state = 26;
;
RDebugUtils.currentLine=72482854;
 //BA.debugLineNum = 72482854;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "updatedeallflagsserver"),(int) (250));
this.state = 30;
return;
case 30:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=72482856;
 //BA.debugLineNum = 72482856;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (4),"","","");
RDebugUtils.currentLine=72482857;
 //BA.debugLineNum = 72482857;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=72482859;
 //BA.debugLineNum = 72482859;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "updatedeallflagsserver"),(int) (250));
this.state = 31;
return;
case 31:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=72482862;
 //BA.debugLineNum = 72482862;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getdoublelineequipmentsdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.sql.SQL.CursorWrapper _items,String _tagcode) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getdoublelineequipmentsdialog", false))
	 {Debug.delegate(ba, "getdoublelineequipmentsdialog", new Object[] {_activ,_activname,_title,_items,_tagcode}); return;}
ResumableSub_getDoubleLineEquipmentsDialog rsub = new ResumableSub_getDoubleLineEquipmentsDialog(this,__ref,_activ,_activname,_title,_items,_tagcode);
rsub.resume(ba, null);
}
public static class ResumableSub_getDoubleLineEquipmentsDialog extends BA.ResumableSub {
public ResumableSub_getDoubleLineEquipmentsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.sql.SQL.CursorWrapper _items,String _tagcode) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._items = _items;
this._tagcode = _tagcode;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
anywheresoftware.b4a.sql.SQL.CursorWrapper _items;
String _tagcode;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _row = 0;
String _equipment = "";
String _serial = "";
String _valid = "";
int _res = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=76021761;
 //BA.debugLineNum = 76021761;BA.debugLine="MasterTagcode = tagcode";
__ref._mastertagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=76021762;
 //BA.debugLineNum = 76021762;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=76021763;
 //BA.debugLineNum = 76021763;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=76021766;
 //BA.debugLineNum = 76021766;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=76021768;
 //BA.debugLineNum = 76021768;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=76021769;
 //BA.debugLineNum = 76021769;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=76021770;
 //BA.debugLineNum = 76021770;BA.debugLine="ApplDialog.SetSize(80%x, 80%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (80),ba),parent.__c.PerYToCurrent((float) (80),ba));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=76021773;
 //BA.debugLineNum = 76021773;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=76021774;
 //BA.debugLineNum = 76021774;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getdoublelineequipmentsdialog"), null);
this.state = 15;
return;
case 15:
//C
this.state = 5;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=76021775;
 //BA.debugLineNum = 76021775;BA.debugLine="DialogPanel.LoadLayout(\"dialog_listdoublelineitem";
_dialogpanel.LoadLayout("dialog_listdoublelineitems",ba);
RDebugUtils.currentLine=76021776;
 //BA.debugLineNum = 76021776;BA.debugLine="For Row = 0 To items.RowCount-1";
if (true) break;

case 5:
//for
this.state = 8;
step12 = 1;
limit12 = (int) (_items.getRowCount()-1);
_row = (int) (0) ;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 8;
if ((step12 > 0 && _row <= limit12) || (step12 < 0 && _row >= limit12)) this.state = 7;
if (true) break;

case 17:
//C
this.state = 16;
_row = ((int)(0 + _row + step12)) ;
if (true) break;

case 7:
//C
this.state = 17;
RDebugUtils.currentLine=76021777;
 //BA.debugLineNum = 76021777;BA.debugLine="items.Position = Row";
_items.setPosition(_row);
RDebugUtils.currentLine=76021779;
 //BA.debugLineNum = 76021779;BA.debugLine="Dim Equipment As String = items.GetString(\"title";
_equipment = _items.GetString("title");
RDebugUtils.currentLine=76021780;
 //BA.debugLineNum = 76021780;BA.debugLine="Dim Serial As String = Utils.IfNullOrEmpty(items";
_serial = parent._utils._ifnullorempty /*String*/ (ba,_items.GetString("serialnumber"),"");
RDebugUtils.currentLine=76021781;
 //BA.debugLineNum = 76021781;BA.debugLine="Dim Valid As String = Utils.IfNullOrEmpty(items.";
_valid = parent._utils._ifnullorempty /*String*/ (ba,_items.GetString("valid_to"),"");
RDebugUtils.currentLine=76021782;
 //BA.debugLineNum = 76021782;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcode";
_tagcode = _items.GetString("tagcode");
RDebugUtils.currentLine=76021784;
 //BA.debugLineNum = 76021784;BA.debugLine="CLVDialog.Add( createDoubleLineItem(activ, Equip";
__ref._clvdialog /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createdoublelineitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_equipment,("# "+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"   -   s/n: "+parent.__c.SmartStringFormatter("",(Object)(_serial))+" ("+parent.__c.SmartStringFormatter("",(Object)(_valid))+")"),parent.__c.DipToCurrent((int) (100)),_tagcode).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=76021787;
 //BA.debugLineNum = 76021787;BA.debugLine="items.close";
_items.Close();
RDebugUtils.currentLine=76021790;
 //BA.debugLineNum = 76021790;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getdoublelineequipmentsdialog"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=76021791;
 //BA.debugLineNum = 76021791;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=76021798;
 //BA.debugLineNum = 76021798;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getentityfilterdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._entityfilter _curr,anywheresoftware.b4a.objects.collections.List _typentity,anywheresoftware.b4a.objects.collections.List _regions,anywheresoftware.b4a.objects.collections.List _locals) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getentityfilterdialog", false))
	 {Debug.delegate(ba, "getentityfilterdialog", new Object[] {_activ,_curr,_typentity,_regions,_locals}); return;}
ResumableSub_GetEntityFilterDialog rsub = new ResumableSub_GetEntityFilterDialog(this,__ref,_activ,_curr,_typentity,_regions,_locals);
rsub.resume(ba, null);
}
public static class ResumableSub_GetEntityFilterDialog extends BA.ResumableSub {
public ResumableSub_GetEntityFilterDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._entityfilter _curr,anywheresoftware.b4a.objects.collections.List _typentity,anywheresoftware.b4a.objects.collections.List _regions,anywheresoftware.b4a.objects.collections.List _locals) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._typentity = _typentity;
this._regions = _regions;
this._locals = _locals;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._entityfilter _curr;
anywheresoftware.b4a.objects.collections.List _typentity;
anywheresoftware.b4a.objects.collections.List _regions;
anywheresoftware.b4a.objects.collections.List _locals;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _res = 0;
int _wreq = 0;
xevolution.vrcg.devdemov2400.types._entityfilter _setthefilters = null;
int step8;
int limit8;
int step17;
int limit17;
int step22;
int limit22;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75759617;
 //BA.debugLineNum = 75759617;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Filtros","Confirmar","Cancelar","Remover filtro",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75759619;
 //BA.debugLineNum = 75759619;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75759620;
 //BA.debugLineNum = 75759620;BA.debugLine="ApplDialog.SetSize(95%x, 590dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.DipToCurrent((int) (590)));
RDebugUtils.currentLine=75759621;
 //BA.debugLineNum = 75759621;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getentityfilterdialog"), _sf);
this.state = 34;
return;
case 34:
//C
this.state = 1;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75759622;
 //BA.debugLineNum = 75759622;BA.debugLine="pnl.LoadLayout(\"dialog_filterEntity_device_2\")";
_pnl.LoadLayout("dialog_filterEntity_device_2",ba);
RDebugUtils.currentLine=75759624;
 //BA.debugLineNum = 75759624;BA.debugLine="DialogReqTypeEntity.DropdownBackgroundColor = Con";
__ref._dialogreqtypeentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75759625;
 //BA.debugLineNum = 75759625;BA.debugLine="DialogReqTypeEntity.Add( \"(Todos)\" )";
__ref._dialogreqtypeentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75759626;
 //BA.debugLineNum = 75759626;BA.debugLine="For i = 0 To typEntity.Size-1";
if (true) break;

case 1:
//for
this.state = 4;
step8 = 1;
limit8 = (int) (_typentity.getSize()-1);
_i = (int) (0) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 4;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 3;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 3:
//C
this.state = 36;
RDebugUtils.currentLine=75759627;
 //BA.debugLineNum = 75759627;BA.debugLine="DialogReqTypeEntity.Add( typEntity.Get(i) )";
__ref._dialogreqtypeentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_typentity.Get(_i)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=75759630;
 //BA.debugLineNum = 75759630;BA.debugLine="DialogReqStatus.DropdownBackgroundColor = Consts.";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75759631;
 //BA.debugLineNum = 75759631;BA.debugLine="DialogReqStatus.Add( \"(Todos)\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75759632;
 //BA.debugLineNum = 75759632;BA.debugLine="DialogReqStatus.Add( \"Activos\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Activos");
RDebugUtils.currentLine=75759633;
 //BA.debugLineNum = 75759633;BA.debugLine="DialogReqStatus.Add( \"Inactivos\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Inactivos");
RDebugUtils.currentLine=75759635;
 //BA.debugLineNum = 75759635;BA.debugLine="DialogReqRegion.DropdownBackgroundColor = Consts.";
__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75759636;
 //BA.debugLineNum = 75759636;BA.debugLine="DialogReqRegion.Add( \"(Todos)\" )";
__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75759637;
 //BA.debugLineNum = 75759637;BA.debugLine="For i = 0 To Regions.Size-1";
if (true) break;

case 5:
//for
this.state = 8;
step17 = 1;
limit17 = (int) (_regions.getSize()-1);
_i = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 8;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 7;
if (true) break;

case 38:
//C
this.state = 37;
_i = ((int)(0 + _i + step17)) ;
if (true) break;

case 7:
//C
this.state = 38;
RDebugUtils.currentLine=75759638;
 //BA.debugLineNum = 75759638;BA.debugLine="DialogReqRegion.Add( Regions.Get(i) )";
__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_regions.Get(_i)));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=75759640;
 //BA.debugLineNum = 75759640;BA.debugLine="DialogReqLocal.DropdownBackgroundColor = Consts.C";
__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75759641;
 //BA.debugLineNum = 75759641;BA.debugLine="DialogReqLocal.Add( \"(Todos)\" )";
__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75759642;
 //BA.debugLineNum = 75759642;BA.debugLine="For i = 0 To Locals.Size-1";
if (true) break;

case 9:
//for
this.state = 12;
step22 = 1;
limit22 = (int) (_locals.getSize()-1);
_i = (int) (0) ;
this.state = 39;
if (true) break;

case 39:
//C
this.state = 12;
if ((step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22)) this.state = 11;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step22)) ;
if (true) break;

case 11:
//C
this.state = 40;
RDebugUtils.currentLine=75759643;
 //BA.debugLineNum = 75759643;BA.debugLine="DialogReqLocal.Add( Locals.Get(i) )";
__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_locals.Get(_i)));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=75759645;
 //BA.debugLineNum = 75759645;BA.debugLine="If (curr.Name <> \"\") Then";

case 12:
//if
this.state = 15;
if (((_curr.Name /*String*/ ).equals("") == false)) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=75759646;
 //BA.debugLineNum = 75759646;BA.debugLine="DialogReqName.Text = curr.Name";
__ref._dialogreqname /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.Name /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75759648;
 //BA.debugLineNum = 75759648;BA.debugLine="If (curr.Address <> \"\") Then";

case 15:
//if
this.state = 18;
if (((_curr.Address /*String*/ ).equals("") == false)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=75759649;
 //BA.debugLineNum = 75759649;BA.debugLine="DialogReqAddress.Text = curr.Address";
__ref._dialogreqaddress /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.Address /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75759652;
 //BA.debugLineNum = 75759652;BA.debugLine="If (curr.Request = 1) Then";

case 18:
//if
this.state = 21;
if ((_curr.request /*int*/ ==1)) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=75759653;
 //BA.debugLineNum = 75759653;BA.debugLine="DialogReqWithRequests.Checked = True";
__ref._dialogreqwithrequests /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(parent.__c.True);
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=75759656;
 //BA.debugLineNum = 75759656;BA.debugLine="DialogReqTypeEntity.SelectedIndex = curr.TypeEnti";
__ref._dialogreqtypeentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.TypeEntity /*int*/ );
RDebugUtils.currentLine=75759657;
 //BA.debugLineNum = 75759657;BA.debugLine="DialogReqStatus.SelectedIndex = curr.Status";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Status /*int*/ );
RDebugUtils.currentLine=75759658;
 //BA.debugLineNum = 75759658;BA.debugLine="DialogReqRegion.SelectedIndex = curr.Region";
__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Region /*int*/ );
RDebugUtils.currentLine=75759659;
 //BA.debugLineNum = 75759659;BA.debugLine="DialogReqLocal.SelectedIndex = curr.Local";
__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Local /*int*/ );
RDebugUtils.currentLine=75759661;
 //BA.debugLineNum = 75759661;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getentityfilterdialog"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 22;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75759662;
 //BA.debugLineNum = 75759662;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 22:
//if
this.state = 33;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 24;
}else 
{RDebugUtils.currentLine=75759670;
 //BA.debugLineNum = 75759670;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 32;
}}
if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=75759663;
 //BA.debugLineNum = 75759663;BA.debugLine="Dim WReq As Int = 0";
_wreq = (int) (0);
RDebugUtils.currentLine=75759664;
 //BA.debugLineNum = 75759664;BA.debugLine="If (DialogReqWithRequests.Checked) Then WReq = 1";
if (true) break;

case 25:
//if
this.state = 30;
if ((__ref._dialogreqwithrequests /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked())) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_wreq = (int) (1);
if (true) break;

case 30:
//C
this.state = 33;
;
RDebugUtils.currentLine=75759665;
 //BA.debugLineNum = 75759665;BA.debugLine="Dim SetTheFilters As EntityFilter = _ 			Types.M";
_setthefilters = parent._types._makeentityfilter /*xevolution.vrcg.devdemov2400.types._entityfilter*/ (ba,__ref._dialogreqtypeentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqname /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqaddress /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_wreq);
RDebugUtils.currentLine=75759669;
 //BA.debugLineNum = 75759669;BA.debugLine="CallSub2(activ, \"SetTheFilters\", SetTheFilters)";
parent.__c.CallSubDebug2(ba,_activ,"SetTheFilters",(Object)(_setthefilters));
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=75759671;
 //BA.debugLineNum = 75759671;BA.debugLine="CallSub2(activ, \"CancelAllFilters\", True)";
parent.__c.CallSubDebug2(ba,_activ,"CancelAllFilters",(Object)(parent.__c.True));
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=75759673;
 //BA.debugLineNum = 75759673;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getgeoreferencedialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._georeference _curr,boolean _asnew) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getgeoreferencedialog", false))
	 {Debug.delegate(ba, "getgeoreferencedialog", new Object[] {_activ,_curr,_asnew}); return;}
ResumableSub_GetGeoReferenceDialog rsub = new ResumableSub_GetGeoReferenceDialog(this,__ref,_activ,_curr,_asnew);
rsub.resume(ba, null);
}
public static class ResumableSub_GetGeoReferenceDialog extends BA.ResumableSub {
public ResumableSub_GetGeoReferenceDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._georeference _curr,boolean _asnew) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._asnew = _asnew;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._georeference _curr;
boolean _asnew;
String _texto = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;
xevolution.vrcg.devdemov2400.types._georeference _setthegeorefer = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75628545;
 //BA.debugLineNum = 75628545;BA.debugLine="Dim Texto As String = ShareCode.AppDialogsEdicao";
_texto = parent._sharecode._appdialogsedicao /*String*/ ;
RDebugUtils.currentLine=75628546;
 //BA.debugLineNum = 75628546;BA.debugLine="If (asNew) Then Texto = ShareCode.AppDialogsnovo";
if (true) break;

case 1:
//if
this.state = 6;
if ((_asnew)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_texto = parent._sharecode._appdialogsnovo /*String*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75628547;
 //BA.debugLineNum = 75628547;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Texto, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_texto,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75628549;
 //BA.debugLineNum = 75628549;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75628550;
 //BA.debugLineNum = 75628550;BA.debugLine="ApplDialog.SetSize(755dip, 250dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (755)),parent.__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=75628551;
 //BA.debugLineNum = 75628551;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getgeoreferencedialog"), _sf);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75628552;
 //BA.debugLineNum = 75628552;BA.debugLine="pnl.LoadLayout(\"dialog_entityGeoReference_device_";
_pnl.LoadLayout("dialog_entityGeoReference_device_2",ba);
RDebugUtils.currentLine=75628554;
 //BA.debugLineNum = 75628554;BA.debugLine="If Not(asNew) Then";
if (true) break;

case 7:
//if
this.state = 17;
if (parent.__c.Not(_asnew)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=75628555;
 //BA.debugLineNum = 75628555;BA.debugLine="If (curr.Latitude <> \"\") Then";
if (true) break;

case 10:
//if
this.state = 13;
if (((_curr.Latitude /*String*/ ).equals("") == false)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=75628556;
 //BA.debugLineNum = 75628556;BA.debugLine="DialogAddressLatitude.Text = curr.Latitude";
__ref._dialogaddresslatitude /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.Latitude /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75628558;
 //BA.debugLineNum = 75628558;BA.debugLine="If (curr.Longitude <> \"\") Then";

case 13:
//if
this.state = 16;
if (((_curr.Longitude /*String*/ ).equals("") == false)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=75628559;
 //BA.debugLineNum = 75628559;BA.debugLine="DialogAddressLongitude.Text = curr.Longitude";
__ref._dialogaddresslongitude /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.Longitude /*String*/ ));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=75628563;
 //BA.debugLineNum = 75628563;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getgeoreferencedialog"), _sf);
this.state = 23;
return;
case 23:
//C
this.state = 18;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75628564;
 //BA.debugLineNum = 75628564;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=75628565;
 //BA.debugLineNum = 75628565;BA.debugLine="Dim SetTheGeoRefer As GeoReference = _ 			Types.";
_setthegeorefer = parent._types._makegeoreference /*xevolution.vrcg.devdemov2400.types._georeference*/ (ba,__ref._dialogaddresslatitude /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogaddresslongitude /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_asnew);
RDebugUtils.currentLine=75628567;
 //BA.debugLineNum = 75628567;BA.debugLine="CallSub2(activ, \"SetTheGeoReference\", SetTheGeoR";
parent.__c.CallSubDebug2(ba,_activ,"SetTheGeoReference",(Object)(_setthegeorefer));
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=75628569;
 //BA.debugLineNum = 75628569;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getkpifilterdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._kpifilter _curr) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getkpifilterdialog", false))
	 {Debug.delegate(ba, "getkpifilterdialog", new Object[] {_activ,_curr}); return;}
ResumableSub_GetKPIFilterDialog rsub = new ResumableSub_GetKPIFilterDialog(this,__ref,_activ,_curr);
rsub.resume(ba, null);
}
public static class ResumableSub_GetKPIFilterDialog extends BA.ResumableSub {
public ResumableSub_GetKPIFilterDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._kpifilter _curr) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._kpifilter _curr;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;
xevolution.vrcg.devdemov2400.types._kpifilter _setthefilters = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75890691;
 //BA.debugLineNum = 75890691;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Filtros","Confirmar","Cancelar","Remover filtro",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75890693;
 //BA.debugLineNum = 75890693;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75890694;
 //BA.debugLineNum = 75890694;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=75890695;
 //BA.debugLineNum = 75890695;BA.debugLine="ApplDialog.SetSize(90%x, 80%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (80),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=75890697;
 //BA.debugLineNum = 75890697;BA.debugLine="ApplDialog.SetSize(590dip, 490dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (590)),parent.__c.DipToCurrent((int) (490)));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75890700;
 //BA.debugLineNum = 75890700;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getkpifilterdialog"), _sf);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75890701;
 //BA.debugLineNum = 75890701;BA.debugLine="pnl.LoadLayout(\"dialog_filterKPI_device_2\")";
_pnl.LoadLayout("dialog_filterKPI_device_2",ba);
RDebugUtils.currentLine=75890703;
 //BA.debugLineNum = 75890703;BA.debugLine="DialogReqPeriodType.DropdownBackgroundColor = Con";
__ref._dialogreqperiodtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75890704;
 //BA.debugLineNum = 75890704;BA.debugLine="DialogReqPeriodType.Add( \"Últimos 30 dias\" )";
__ref._dialogreqperiodtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Últimos 30 dias");
RDebugUtils.currentLine=75890705;
 //BA.debugLineNum = 75890705;BA.debugLine="DialogReqPeriodType.Add( \"Último Trimestre\" )";
__ref._dialogreqperiodtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Último Trimestre");
RDebugUtils.currentLine=75890706;
 //BA.debugLineNum = 75890706;BA.debugLine="DialogReqPeriodType.Add( \"Último Semestre\" )";
__ref._dialogreqperiodtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Último Semestre");
RDebugUtils.currentLine=75890707;
 //BA.debugLineNum = 75890707;BA.debugLine="DialogReqPeriodType.Add( \"Último Ano\" )";
__ref._dialogreqperiodtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Último Ano");
RDebugUtils.currentLine=75890708;
 //BA.debugLineNum = 75890708;BA.debugLine="DialogReqPeriodType.Add( \"Entre datas\" )";
__ref._dialogreqperiodtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Entre datas");
RDebugUtils.currentLine=75890710;
 //BA.debugLineNum = 75890710;BA.debugLine="If (curr.SDate <> \"\") Then";
if (true) break;

case 7:
//if
this.state = 10;
if (((_curr.SDate /*String*/ ).equals("") == false)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=75890711;
 //BA.debugLineNum = 75890711;BA.debugLine="DialogReqStartDate.Text = curr.SDate";
__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.SDate /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75890713;
 //BA.debugLineNum = 75890713;BA.debugLine="If (curr.EDate <> \"\") Then";

case 10:
//if
this.state = 13;
if (((_curr.EDate /*String*/ ).equals("") == false)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=75890714;
 //BA.debugLineNum = 75890714;BA.debugLine="DialogReqEndDate.Text = curr.EDate";
__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.EDate /*String*/ ));
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=75890716;
 //BA.debugLineNum = 75890716;BA.debugLine="DialogReqPeriodType.SelectedIndex = curr.period";
__ref._dialogreqperiodtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.period /*int*/ );
RDebugUtils.currentLine=75890718;
 //BA.debugLineNum = 75890718;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getkpifilterdialog"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 14;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75890719;
 //BA.debugLineNum = 75890719;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 16;
}else 
{RDebugUtils.currentLine=75890722;
 //BA.debugLineNum = 75890722;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 18;
}}
if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=75890720;
 //BA.debugLineNum = 75890720;BA.debugLine="Dim SetTheFilters As KPIFilter = Types.MakeKPIFi";
_setthefilters = parent._types._makekpifilter /*xevolution.vrcg.devdemov2400.types._kpifilter*/ (ba,__ref._dialogreqperiodtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText());
 if (true) break;

case 18:
//C
this.state = 19;
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=75890725;
 //BA.debugLineNum = 75890725;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getlogindialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getlogindialog", false))
	 {Debug.delegate(ba, "getlogindialog", new Object[] {_activ}); return;}
ResumableSub_getLoginDialog rsub = new ResumableSub_getLoginDialog(this,__ref,_activ);
rsub.resume(ba, null);
}
public static class ResumableSub_getLoginDialog extends BA.ResumableSub {
public ResumableSub_getLoginDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
int _xw = 0;
int _xh = 0;
String _but1 = "";
String _but2 = "";
String _but3 = "";
String _dlayout = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=77529089;
 //BA.debugLineNum = 77529089;BA.debugLine="Dim xW As Int = 70%x, xH As Int = 450dip";
_xw = parent.__c.PerXToCurrent((float) (70),ba);
_xh = parent.__c.DipToCurrent((int) (450));
RDebugUtils.currentLine=77529090;
 //BA.debugLineNum = 77529090;BA.debugLine="Dim but1 As String = \"Confirmar\", but2 As String";
_but1 = "Confirmar";
_but2 = "Cancelar";
_but3 = "Esqueci password";
RDebugUtils.currentLine=77529091;
 //BA.debugLineNum = 77529091;BA.debugLine="Dim dLayout As String = \"dialog_Login\"";
_dlayout = "dialog_Login";
RDebugUtils.currentLine=77529092;
 //BA.debugLineNum = 77529092;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=77529093;
 //BA.debugLineNum = 77529093;BA.debugLine="xW = 95%x";
_xw = parent.__c.PerXToCurrent((float) (95),ba);
RDebugUtils.currentLine=77529094;
 //BA.debugLineNum = 77529094;BA.debugLine="xH = 400dip";
_xh = parent.__c.DipToCurrent((int) (400));
RDebugUtils.currentLine=77529095;
 //BA.debugLineNum = 77529095;BA.debugLine="but3 = \"Reset\"";
_but3 = "Reset";
RDebugUtils.currentLine=77529096;
 //BA.debugLineNum = 77529096;BA.debugLine="dLayout = \"dialog_Login_device_2\"";
_dlayout = "dialog_Login_device_2";
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=77529099;
 //BA.debugLineNum = 77529099;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Controlo";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Controlo de acesso",_but1,_but2,_but3,ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=77529101;
 //BA.debugLineNum = 77529101;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=77529102;
 //BA.debugLineNum = 77529102;BA.debugLine="ApplDialog.SetSize(xW, xH)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(_xw,_xh);
RDebugUtils.currentLine=77529105;
 //BA.debugLineNum = 77529105;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getlogindialog"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=77529106;
 //BA.debugLineNum = 77529106;BA.debugLine="pnl.LoadLayout(dLayout)";
_pnl.LoadLayout(_dlayout,ba);
RDebugUtils.currentLine=77529108;
 //BA.debugLineNum = 77529108;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getlogindialog"), _sf);
this.state = 14;
return;
case 14:
//C
this.state = 5;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=77529110;
 //BA.debugLineNum = 77529110;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 12;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=77529112;
 //BA.debugLineNum = 77529112;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 9;
}else {
this.state = 11;
}}
if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=77529111;
 //BA.debugLineNum = 77529111;BA.debugLine="CallSub3(activ, \"SetLogin\", mainEditLoginUser.Te";
parent.__c.CallSubDebug3(ba,_activ,"SetLogin",(Object)(__ref._maineditloginuser /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()),(Object)(__ref._maineditloginpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=77529114;
 //BA.debugLineNum = 77529114;BA.debugLine="CallSub2(activ, \"SetLoginReset\", mainEditLoginUs";
parent.__c.CallSubDebug2(ba,_activ,"SetLoginReset",(Object)(__ref._maineditloginuser /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=77529116;
 //BA.debugLineNum = 77529116;BA.debugLine="CallSub(activ, \"prc_AppClose\")";
parent.__c.CallSubDebug(ba,_activ,"prc_AppClose");
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=77529119;
 //BA.debugLineNum = 77529119;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getlogindialog2(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getlogindialog2", false))
	 {Debug.delegate(ba, "getlogindialog2", new Object[] {_activ}); return;}
ResumableSub_getLoginDialog2 rsub = new ResumableSub_getLoginDialog2(this,__ref,_activ);
rsub.resume(ba, null);
}
public static class ResumableSub_getLoginDialog2 extends BA.ResumableSub {
public ResumableSub_getLoginDialog2(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
int _xw = 0;
int _xh = 0;
String _but1 = "";
String _but2 = "";
String _but3 = "";
String _dlayout = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=77463553;
 //BA.debugLineNum = 77463553;BA.debugLine="Dim xW As Int = 50%x, xH As Int = 350dip";
_xw = parent.__c.PerXToCurrent((float) (50),ba);
_xh = parent.__c.DipToCurrent((int) (350));
RDebugUtils.currentLine=77463554;
 //BA.debugLineNum = 77463554;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=77463555;
 //BA.debugLineNum = 77463555;BA.debugLine="xW = 80%x";
_xw = parent.__c.PerXToCurrent((float) (80),ba);
RDebugUtils.currentLine=77463556;
 //BA.debugLineNum = 77463556;BA.debugLine="xH = 80%x";
_xh = parent.__c.PerXToCurrent((float) (80),ba);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=77463559;
 //BA.debugLineNum = 77463559;BA.debugLine="Dim but1 As String = \"Confirmar\", but2 As String";
_but1 = "Confirmar";
_but2 = "Cancelar";
_but3 = "";
RDebugUtils.currentLine=77463560;
 //BA.debugLineNum = 77463560;BA.debugLine="Dim dLayout As String = \"dialog_login_userregiste";
_dlayout = "dialog_login_userregister";
RDebugUtils.currentLine=77463568;
 //BA.debugLineNum = 77463568;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Registo";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Registo de novo utilizador",_but1,_but2,_but3,ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=77463570;
 //BA.debugLineNum = 77463570;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=77463571;
 //BA.debugLineNum = 77463571;BA.debugLine="ApplDialog.SetSize(xW, xH)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(_xw,_xh);
RDebugUtils.currentLine=77463573;
 //BA.debugLineNum = 77463573;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getlogindialog2"), _sf);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=77463574;
 //BA.debugLineNum = 77463574;BA.debugLine="pnl.LoadLayout(dLayout)";
_pnl.LoadLayout(_dlayout,ba);
RDebugUtils.currentLine=77463576;
 //BA.debugLineNum = 77463576;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getlogindialog2"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=77463578;
 //BA.debugLineNum = 77463578;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=77463579;
 //BA.debugLineNum = 77463579;BA.debugLine="CallSub3(activ, \"SetLoginRegister\", mainEditLogi";
parent.__c.CallSubDebug3(ba,_activ,"SetLoginRegister",(Object)(__ref._maineditloginuser /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()),(Object)(__ref._maineditloginpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=77463581;
 //BA.debugLineNum = 77463581;BA.debugLine="CallSub(activ, \"SetLoginRegisterCancel\")";
parent.__c.CallSubDebug(ba,_activ,"SetLoginRegisterCancel");
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=77463584;
 //BA.debugLineNum = 77463584;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getobjectfilterdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._objectfilter _curr,anywheresoftware.b4a.objects.collections.List _typobject,anywheresoftware.b4a.objects.collections.List _regions,anywheresoftware.b4a.objects.collections.List _locals) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getobjectfilterdialog", false))
	 {Debug.delegate(ba, "getobjectfilterdialog", new Object[] {_activ,_curr,_typobject,_regions,_locals}); return;}
ResumableSub_GetObjectFilterDialog rsub = new ResumableSub_GetObjectFilterDialog(this,__ref,_activ,_curr,_typobject,_regions,_locals);
rsub.resume(ba, null);
}
public static class ResumableSub_GetObjectFilterDialog extends BA.ResumableSub {
public ResumableSub_GetObjectFilterDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._objectfilter _curr,anywheresoftware.b4a.objects.collections.List _typobject,anywheresoftware.b4a.objects.collections.List _regions,anywheresoftware.b4a.objects.collections.List _locals) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._typobject = _typobject;
this._regions = _regions;
this._locals = _locals;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._objectfilter _curr;
anywheresoftware.b4a.objects.collections.List _typobject;
anywheresoftware.b4a.objects.collections.List _regions;
anywheresoftware.b4a.objects.collections.List _locals;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
xevolution.vrcg.devdemov2400.types._objecttypes _bt = null;
int _res = 0;
int _wreq = 0;
xevolution.vrcg.devdemov2400.types._objectfilter _setthefilters = null;
int step11;
int limit11;
int step16;
int limit16;
int step25;
int limit25;
int step30;
int limit30;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75825153;
 //BA.debugLineNum = 75825153;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Filtros","Confirmar","Cancelar","Remover filtro",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75825155;
 //BA.debugLineNum = 75825155;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75825156;
 //BA.debugLineNum = 75825156;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=75825157;
 //BA.debugLineNum = 75825157;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (95),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=75825159;
 //BA.debugLineNum = 75825159;BA.debugLine="ApplDialog.SetSize(95%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75825162;
 //BA.debugLineNum = 75825162;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getobjectfilterdialog"), _sf);
this.state = 44;
return;
case 44:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75825164;
 //BA.debugLineNum = 75825164;BA.debugLine="pnl.LoadLayout(\"dialog_filterObject\") '_device_2\"";
_pnl.LoadLayout("dialog_filterObject",ba);
RDebugUtils.currentLine=75825166;
 //BA.debugLineNum = 75825166;BA.debugLine="DialogReqTypeObject.DropdownBackgroundColor = Con";
__ref._dialogreqtypeobject /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75825167;
 //BA.debugLineNum = 75825167;BA.debugLine="For i = 0 To typObject.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step11 = 1;
limit11 = (int) (_typobject.getSize()-1);
_i = (int) (0) ;
this.state = 45;
if (true) break;

case 45:
//C
this.state = 10;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 9;
if (true) break;

case 46:
//C
this.state = 45;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 9:
//C
this.state = 46;
RDebugUtils.currentLine=75825168;
 //BA.debugLineNum = 75825168;BA.debugLine="Dim bt As ObjectTypes = typObject.Get(i)   'Type";
_bt = (xevolution.vrcg.devdemov2400.types._objecttypes)(_typobject.Get(_i));
RDebugUtils.currentLine=75825169;
 //BA.debugLineNum = 75825169;BA.debugLine="DialogReqTypeObject.Add( bt.title )";
__ref._dialogreqtypeobject /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_bt.title /*String*/ );
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=75825172;
 //BA.debugLineNum = 75825172;BA.debugLine="DialogReqZone.DropdownBackgroundColor = Consts.Co";
__ref._dialogreqzone /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75825173;
 //BA.debugLineNum = 75825173;BA.debugLine="For i = 0 To Types.ZONEOBJECTSFILTER.Size-1";
if (true) break;

case 11:
//for
this.state = 14;
step16 = 1;
limit16 = (int) (parent._types._zoneobjectsfilter /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 14;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 13;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 13:
//C
this.state = 48;
RDebugUtils.currentLine=75825174;
 //BA.debugLineNum = 75825174;BA.debugLine="DialogReqZone.Add( Types.ZONEOBJECTSFILTER.Get(i";
__ref._dialogreqzone /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(parent._types._zoneobjectsfilter /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=75825177;
 //BA.debugLineNum = 75825177;BA.debugLine="DialogReqStatus.DropdownBackgroundColor = Consts.";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75825178;
 //BA.debugLineNum = 75825178;BA.debugLine="DialogReqStatus.Add( \"(Todos)\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75825179;
 //BA.debugLineNum = 75825179;BA.debugLine="DialogReqStatus.Add( \"Activos\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Activos");
RDebugUtils.currentLine=75825180;
 //BA.debugLineNum = 75825180;BA.debugLine="DialogReqStatus.Add( \"Inactivos\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Inactivos");
RDebugUtils.currentLine=75825182;
 //BA.debugLineNum = 75825182;BA.debugLine="DialogReqRegion.DropdownBackgroundColor = Consts.";
__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75825183;
 //BA.debugLineNum = 75825183;BA.debugLine="DialogReqRegion.Add( \"(Todos)\" )";
__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75825184;
 //BA.debugLineNum = 75825184;BA.debugLine="For i = 0 To Regions.Size-1";
if (true) break;

case 15:
//for
this.state = 18;
step25 = 1;
limit25 = (int) (_regions.getSize()-1);
_i = (int) (0) ;
this.state = 49;
if (true) break;

case 49:
//C
this.state = 18;
if ((step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25)) this.state = 17;
if (true) break;

case 50:
//C
this.state = 49;
_i = ((int)(0 + _i + step25)) ;
if (true) break;

case 17:
//C
this.state = 50;
RDebugUtils.currentLine=75825185;
 //BA.debugLineNum = 75825185;BA.debugLine="DialogReqRegion.Add( Regions.Get(i) )";
__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_regions.Get(_i)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=75825187;
 //BA.debugLineNum = 75825187;BA.debugLine="DialogReqLocal.DropdownBackgroundColor = Consts.C";
__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75825188;
 //BA.debugLineNum = 75825188;BA.debugLine="DialogReqLocal.Add( \"(Todos)\" )";
__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75825189;
 //BA.debugLineNum = 75825189;BA.debugLine="For i = 0 To Locals.Size-1";
if (true) break;

case 19:
//for
this.state = 22;
step30 = 1;
limit30 = (int) (_locals.getSize()-1);
_i = (int) (0) ;
this.state = 51;
if (true) break;

case 51:
//C
this.state = 22;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 21;
if (true) break;

case 52:
//C
this.state = 51;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 21:
//C
this.state = 52;
RDebugUtils.currentLine=75825190;
 //BA.debugLineNum = 75825190;BA.debugLine="DialogReqLocal.Add( Locals.Get(i) )";
__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_locals.Get(_i)));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=75825192;
 //BA.debugLineNum = 75825192;BA.debugLine="If (curr.Name <> \"\") Then";

case 22:
//if
this.state = 25;
if (((_curr.Name /*String*/ ).equals("") == false)) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=75825193;
 //BA.debugLineNum = 75825193;BA.debugLine="DialogReqName.Text = curr.Name";
__ref._dialogreqname /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.Name /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75825195;
 //BA.debugLineNum = 75825195;BA.debugLine="If (curr.Address <> \"\") Then";

case 25:
//if
this.state = 28;
if (((_curr.Address /*String*/ ).equals("") == false)) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=75825196;
 //BA.debugLineNum = 75825196;BA.debugLine="DialogReqAddress.Text = curr.Address";
__ref._dialogreqaddress /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.Address /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=75825199;
 //BA.debugLineNum = 75825199;BA.debugLine="If (curr.Request = 1) Then";

case 28:
//if
this.state = 31;
if ((_curr.Request /*int*/ ==1)) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=75825200;
 //BA.debugLineNum = 75825200;BA.debugLine="DialogReqWithRequests.Checked = True";
__ref._dialogreqwithrequests /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(parent.__c.True);
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=75825203;
 //BA.debugLineNum = 75825203;BA.debugLine="DialogReqTypeObject.SelectedIndex = curr.TypeObje";
__ref._dialogreqtypeobject /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.TypeObject /*int*/ );
RDebugUtils.currentLine=75825204;
 //BA.debugLineNum = 75825204;BA.debugLine="DialogReqZone.SelectedIndex = curr.ZoneObject";
__ref._dialogreqzone /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.ZoneObject /*int*/ );
RDebugUtils.currentLine=75825205;
 //BA.debugLineNum = 75825205;BA.debugLine="DialogReqStatus.SelectedIndex = curr.Status";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Status /*int*/ );
RDebugUtils.currentLine=75825206;
 //BA.debugLineNum = 75825206;BA.debugLine="DialogReqRegion.SelectedIndex = curr.Region";
__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Region /*int*/ );
RDebugUtils.currentLine=75825207;
 //BA.debugLineNum = 75825207;BA.debugLine="DialogReqLocal.SelectedIndex = curr.Local";
__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Local /*int*/ );
RDebugUtils.currentLine=75825209;
 //BA.debugLineNum = 75825209;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getobjectfilterdialog"), _sf);
this.state = 53;
return;
case 53:
//C
this.state = 32;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75825210;
 //BA.debugLineNum = 75825210;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 32:
//if
this.state = 43;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 34;
}else 
{RDebugUtils.currentLine=75825219;
 //BA.debugLineNum = 75825219;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 42;
}}
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=75825211;
 //BA.debugLineNum = 75825211;BA.debugLine="Dim WReq As Int = 0";
_wreq = (int) (0);
RDebugUtils.currentLine=75825212;
 //BA.debugLineNum = 75825212;BA.debugLine="If (DialogReqWithRequests.Checked) Then WReq = 1";
if (true) break;

case 35:
//if
this.state = 40;
if ((__ref._dialogreqwithrequests /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked())) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
_wreq = (int) (1);
if (true) break;

case 40:
//C
this.state = 43;
;
RDebugUtils.currentLine=75825213;
 //BA.debugLineNum = 75825213;BA.debugLine="Dim bt As ObjectTypes = typObject.Get(DialogReqT";
_bt = (xevolution.vrcg.devdemov2400.types._objecttypes)(_typobject.Get(__ref._dialogreqtypeobject /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()));
RDebugUtils.currentLine=75825214;
 //BA.debugLineNum = 75825214;BA.debugLine="Dim SetTheFilters As ObjectFilter = _ 			Types.M";
_setthefilters = parent._types._makeobjectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ (ba,_bt.id /*int*/ ,__ref._dialogreqzone /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqregion /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqlocal /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqname /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqaddress /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_wreq);
RDebugUtils.currentLine=75825218;
 //BA.debugLineNum = 75825218;BA.debugLine="CallSub2(activ, \"SetTheFilters\", SetTheFilters)";
parent.__c.CallSubDebug2(ba,_activ,"SetTheFilters",(Object)(_setthefilters));
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=75825220;
 //BA.debugLineNum = 75825220;BA.debugLine="CallSub2(activ, \"CancelAllFilters\", True)";
parent.__c.CallSubDebug2(ba,_activ,"CancelAllFilters",(Object)(parent.__c.True));
 if (true) break;

case 43:
//C
this.state = -1;
;
RDebugUtils.currentLine=75825222;
 //BA.debugLineNum = 75825222;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getobjectselectviewdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getobjectselectviewdialog", false))
	 {Debug.delegate(ba, "getobjectselectviewdialog", new Object[] {_activ,_activname,_title,_pnl}); return;}
ResumableSub_getObjectSelectViewDialog rsub = new ResumableSub_getObjectSelectViewDialog(this,__ref,_activ,_activname,_title,_pnl);
rsub.resume(ba, null);
}
public static class ResumableSub_getObjectSelectViewDialog extends BA.ResumableSub {
public ResumableSub_getObjectSelectViewDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.objects.PanelWrapper _pnl) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._pnl = _pnl;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
anywheresoftware.b4a.objects.PanelWrapper _pnl;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
anywheresoftware.b4a.objects.collections.List _objectstypes = null;
int _n = 0;
xevolution.vrcg.devdemov2400.types._db_itc _itc = null;
int _res = 0;
int step16;
int limit16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=73596929;
 //BA.debugLineNum = 73596929;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=73596930;
 //BA.debugLineNum = 73596930;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=73596931;
 //BA.debugLineNum = 73596931;BA.debugLine="CurrentSelectedCode = \"\"";
__ref._currentselectedcode /*String*/  = "";
RDebugUtils.currentLine=73596932;
 //BA.debugLineNum = 73596932;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=73596933;
 //BA.debugLineNum = 73596933;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=73596934;
 //BA.debugLineNum = 73596934;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=73596935;
 //BA.debugLineNum = 73596935;BA.debugLine="ApplDialog.SetSize(85%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (85),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=73596937;
 //BA.debugLineNum = 73596937;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (95),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=73596939;
 //BA.debugLineNum = 73596939;BA.debugLine="ObjectsListIndex = 0";
__ref._objectslistindex /*int*/  = (int) (0);
RDebugUtils.currentLine=73596940;
 //BA.debugLineNum = 73596940;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=73596941;
 //BA.debugLineNum = 73596941;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getobjectselectviewdialog"), null);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=73596942;
 //BA.debugLineNum = 73596942;BA.debugLine="DialogPanel.LoadLayout(\"ObjectSelectViewDialog\")";
_dialogpanel.LoadLayout("ObjectSelectViewDialog",ba);
RDebugUtils.currentLine=73596944;
 //BA.debugLineNum = 73596944;BA.debugLine="Dim ObjectsTypes As List = DBStructures.getObject";
_objectstypes = new anywheresoftware.b4a.objects.collections.List();
_objectstypes = parent._dbstructures._getobjecttypes /*anywheresoftware.b4a.objects.collections.List*/ (ba);
RDebugUtils.currentLine=73596945;
 //BA.debugLineNum = 73596945;BA.debugLine="For n=0 To ObjectsTypes.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step16 = 1;
limit16 = (int) (_objectstypes.getSize()-1);
_n = (int) (0) ;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 10;
if ((step16 > 0 && _n <= limit16) || (step16 < 0 && _n >= limit16)) this.state = 9;
if (true) break;

case 17:
//C
this.state = 16;
_n = ((int)(0 + _n + step16)) ;
if (true) break;

case 9:
//C
this.state = 17;
RDebugUtils.currentLine=73596946;
 //BA.debugLineNum = 73596946;BA.debugLine="Dim itc As DB_ITC = ObjectsTypes.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(_objectstypes.Get(_n));
RDebugUtils.currentLine=73596947;
 //BA.debugLineNum = 73596947;BA.debugLine="ObjectTypeListView.Add(createObjectTypeLineItemD";
__ref._objecttypelistview /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createobjecttypelineitemdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,_itc.Title /*String*/ ,_itc.TagCode /*String*/ ,parent.__c.DipToCurrent((int) (45))).getObject())),(Object)(_itc.ID /*int*/ ));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=73596950;
 //BA.debugLineNum = 73596950;BA.debugLine="OBJ_Types = DBStructures.getObjectTypes";
__ref._obj_types /*anywheresoftware.b4a.objects.collections.List*/  = parent._dbstructures._getobjecttypes /*anywheresoftware.b4a.objects.collections.List*/ (ba);
RDebugUtils.currentLine=73596951;
 //BA.debugLineNum = 73596951;BA.debugLine="OBJ_Groups = DBStructures.getObjectGroups";
__ref._obj_groups /*anywheresoftware.b4a.objects.collections.List*/  = parent._dbstructures._getobjectgroups /*anywheresoftware.b4a.objects.collections.List*/ (ba);
RDebugUtils.currentLine=73596952;
 //BA.debugLineNum = 73596952;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.POSITIVE).setEnabled(parent._utils._nne /*boolean*/ (ba,__ref._currentselectedcode /*String*/ ));
RDebugUtils.currentLine=73596954;
 //BA.debugLineNum = 73596954;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getobjectselectviewdialog"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=73596955;
 //BA.debugLineNum = 73596955;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=73596956;
 //BA.debugLineNum = 73596956;BA.debugLine="CallSub3(ThisActivityName, \"AlertObjectSelected\"";
parent.__c.CallSubDebug3(ba,__ref._thisactivityname /*Object*/ ,"AlertObjectSelected",(Object)(__ref._currentselectedcode /*String*/ ),(Object)(_pnl));
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=73596958;
 //BA.debugLineNum = 73596958;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _getpicturesmapdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getpicturesmapdialog", false))
	 {return ((String) Debug.delegate(ba, "getpicturesmapdialog", new Object[] {_activname}));}
RDebugUtils.currentLine=73007104;
 //BA.debugLineNum = 73007104;BA.debugLine="Sub getPicturesMapDialog(activName As Object)";
RDebugUtils.currentLine=73007147;
 //BA.debugLineNum = 73007147;BA.debugLine="End Sub";
return "";
}
public void  _getpropertydialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,String _proptitle,String _propvalue,String _tagcode,boolean _asnew) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getpropertydialog", false))
	 {Debug.delegate(ba, "getpropertydialog", new Object[] {_activ,_proptitle,_propvalue,_tagcode,_asnew}); return;}
ResumableSub_GetPropertyDialog rsub = new ResumableSub_GetPropertyDialog(this,__ref,_activ,_proptitle,_propvalue,_tagcode,_asnew);
rsub.resume(ba, null);
}
public static class ResumableSub_GetPropertyDialog extends BA.ResumableSub {
public ResumableSub_GetPropertyDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,String _proptitle,String _propvalue,String _tagcode,boolean _asnew) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._proptitle = _proptitle;
this._propvalue = _propvalue;
this._tagcode = _tagcode;
this._asnew = _asnew;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
String _proptitle;
String _propvalue;
String _tagcode;
boolean _asnew;
String _texto = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75497473;
 //BA.debugLineNum = 75497473;BA.debugLine="Dim Texto As String = ShareCode.AppDialogsEdicao";
_texto = parent._sharecode._appdialogsedicao /*String*/ ;
RDebugUtils.currentLine=75497474;
 //BA.debugLineNum = 75497474;BA.debugLine="If (asNew) Then Texto = ShareCode.AppDialogsnovo";
if (true) break;

case 1:
//if
this.state = 6;
if ((_asnew)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_texto = parent._sharecode._appdialogsnovo /*String*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75497475;
 //BA.debugLineNum = 75497475;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Texto, \"C";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_texto,"Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75497477;
 //BA.debugLineNum = 75497477;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75497479;
 //BA.debugLineNum = 75497479;BA.debugLine="ApplDialog.SetSize(85%x, 220dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (85),ba),parent.__c.DipToCurrent((int) (220)));
RDebugUtils.currentLine=75497480;
 //BA.debugLineNum = 75497480;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getpropertydialog"), _sf);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75497481;
 //BA.debugLineNum = 75497481;BA.debugLine="pnl.LoadLayout(\"dialog_propertyChange_device_2\")";
_pnl.LoadLayout("dialog_propertyChange_device_2",ba);
RDebugUtils.currentLine=75497483;
 //BA.debugLineNum = 75497483;BA.debugLine="DialogPropertyTitle.Text = propTitle";
__ref._dialogpropertytitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_proptitle));
RDebugUtils.currentLine=75497484;
 //BA.debugLineNum = 75497484;BA.debugLine="DialogPropertyValue.Text = propValue";
__ref._dialogpropertyvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_propvalue));
RDebugUtils.currentLine=75497486;
 //BA.debugLineNum = 75497486;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getpropertydialog"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 7;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75497487;
 //BA.debugLineNum = 75497487;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=75497488;
 //BA.debugLineNum = 75497488;BA.debugLine="If (asNew) Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((_asnew)) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=75497489;
 //BA.debugLineNum = 75497489;BA.debugLine="CallSub3(activ, \"SetThePropertyInsert\", tagcode";
parent.__c.CallSubDebug3(ba,_activ,"SetThePropertyInsert",(Object)(_tagcode),(Object)(__ref._dialogpropertyvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=75497491;
 //BA.debugLineNum = 75497491;BA.debugLine="CallSub3(activ, \"SetThePropertyUpdate\", tagcode";
parent.__c.CallSubDebug3(ba,_activ,"SetThePropertyUpdate",(Object)(_tagcode),(Object)(__ref._dialogpropertyvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()));
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
RDebugUtils.currentLine=75497494;
 //BA.debugLineNum = 75497494;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrequestfilterdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._requestfilter _curr,anywheresoftware.b4a.objects.collections.List _chks,anywheresoftware.b4a.objects.collections.List _ents,anywheresoftware.b4a.objects.collections.List _sts,anywheresoftware.b4a.objects.collections.List _tpreq) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getrequestfilterdialog", false))
	 {Debug.delegate(ba, "getrequestfilterdialog", new Object[] {_activ,_curr,_chks,_ents,_sts,_tpreq}); return;}
ResumableSub_GetRequestFilterDialog rsub = new ResumableSub_GetRequestFilterDialog(this,__ref,_activ,_curr,_chks,_ents,_sts,_tpreq);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRequestFilterDialog extends BA.ResumableSub {
public ResumableSub_GetRequestFilterDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._requestfilter _curr,anywheresoftware.b4a.objects.collections.List _chks,anywheresoftware.b4a.objects.collections.List _ents,anywheresoftware.b4a.objects.collections.List _sts,anywheresoftware.b4a.objects.collections.List _tpreq) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._chks = _chks;
this._ents = _ents;
this._sts = _sts;
this._tpreq = _tpreq;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._requestfilter _curr;
anywheresoftware.b4a.objects.collections.List _chks;
anywheresoftware.b4a.objects.collections.List _ents;
anywheresoftware.b4a.objects.collections.List _sts;
anywheresoftware.b4a.objects.collections.List _tpreq;
int _xw = 0;
int _xh = 0;
String _but1 = "";
String _but2 = "";
String _but3 = "";
String _dlayout = "";
String _ssql = "";
anywheresoftware.b4a.objects.collections.List _routes = null;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
xevolution.vrcg.devdemov2400.types._codenamelist _r = null;
int _res = 0;
xevolution.vrcg.devdemov2400.types._requestfilter _setthefilters = null;
int step30;
int limit30;
int step36;
int limit36;
int step43;
int limit43;
int step50;
int limit50;
int step55;
int limit55;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=77594626;
 //BA.debugLineNum = 77594626;BA.debugLine="Dim xW As Int = 95%x, xH As Int = 500dip";
_xw = parent.__c.PerXToCurrent((float) (95),ba);
_xh = parent.__c.DipToCurrent((int) (500));
RDebugUtils.currentLine=77594627;
 //BA.debugLineNum = 77594627;BA.debugLine="Dim but1 As String = \"Confirmar\", but2 As String";
_but1 = "Confirmar";
_but2 = "Cancelar";
_but3 = "Remover filtro";
RDebugUtils.currentLine=77594628;
 //BA.debugLineNum = 77594628;BA.debugLine="Dim dLayout As String = \"dialog_filterRequest\"";
_dlayout = "dialog_filterRequest";
RDebugUtils.currentLine=77594629;
 //BA.debugLineNum = 77594629;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=77594630;
 //BA.debugLineNum = 77594630;BA.debugLine="xW = 95%x";
_xw = parent.__c.PerXToCurrent((float) (95),ba);
RDebugUtils.currentLine=77594631;
 //BA.debugLineNum = 77594631;BA.debugLine="xH = 95%y";
_xh = parent.__c.PerYToCurrent((float) (95),ba);
RDebugUtils.currentLine=77594632;
 //BA.debugLineNum = 77594632;BA.debugLine="but1 = \"Confirmar\"";
_but1 = "Confirmar";
RDebugUtils.currentLine=77594633;
 //BA.debugLineNum = 77594633;BA.debugLine="but2 = \"Cancelar\"";
_but2 = "Cancelar";
RDebugUtils.currentLine=77594634;
 //BA.debugLineNum = 77594634;BA.debugLine="but3 = \"Remover\"";
_but3 = "Remover";
RDebugUtils.currentLine=77594635;
 //BA.debugLineNum = 77594635;BA.debugLine="dLayout = \"dialog_filterRequest_device_2\"";
_dlayout = "dialog_filterRequest_device_2";
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=77594638;
 //BA.debugLineNum = 77594638;BA.debugLine="Dim sSQL As String = $\"select distinct id, tagcod";
_ssql = ("select distinct id, tagcode, title from dta_routes");
RDebugUtils.currentLine=77594639;
 //BA.debugLineNum = 77594639;BA.debugLine="Private Routes As List";
_routes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=77594640;
 //BA.debugLineNum = 77594640;BA.debugLine="Routes.Initialize";
_routes.Initialize();
RDebugUtils.currentLine=77594641;
 //BA.debugLineNum = 77594641;BA.debugLine="Routes = DBStructures.GetListOfFromScriptCNLEVC(\"";
_routes = parent._dbstructures._getlistoffromscriptcnlevc /*anywheresoftware.b4a.objects.collections.List*/ (ba,"tagcode","title",_ssql);
RDebugUtils.currentLine=77594644;
 //BA.debugLineNum = 77594644;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Filtros",_but1,_but2,_but3,ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=77594646;
 //BA.debugLineNum = 77594646;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=77594647;
 //BA.debugLineNum = 77594647;BA.debugLine="ApplDialog.SetSize(xW, xH)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(_xw,_xh);
RDebugUtils.currentLine=77594649;
 //BA.debugLineNum = 77594649;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getrequestfilterdialog"), _sf);
this.state = 66;
return;
case 66:
//C
this.state = 5;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=77594650;
 //BA.debugLineNum = 77594650;BA.debugLine="pnl.LoadLayout(dLayout)";
_pnl.LoadLayout(_dlayout,ba);
RDebugUtils.currentLine=77594653;
 //BA.debugLineNum = 77594653;BA.debugLine="FilterLabelTipoIntervencao.Text=ShareCode.AppDial";
__ref._filterlabeltipointervencao /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabeltipointervencao /*String*/ ));
RDebugUtils.currentLine=77594654;
 //BA.debugLineNum = 77594654;BA.debugLine="FilterLabelEntidade.Text=ShareCode.AppDialogsFilt";
__ref._filterlabelentidade /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabelentidade /*String*/ ));
RDebugUtils.currentLine=77594655;
 //BA.debugLineNum = 77594655;BA.debugLine="FilterLabelEstadosIntervencao.Text=ShareCode.AppD";
__ref._filterlabelestadosintervencao /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabelestadosintervencao /*String*/ ));
RDebugUtils.currentLine=77594656;
 //BA.debugLineNum = 77594656;BA.debugLine="FilterLabelDataInicio.Text=ShareCode.AppDialogsFi";
__ref._filterlabeldatainicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabeldatainicio /*String*/ ));
RDebugUtils.currentLine=77594657;
 //BA.debugLineNum = 77594657;BA.debugLine="FilterLabelDataFim.Text=ShareCode.AppDialogsFilte";
__ref._filterlabeldatafim /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabeldatafim /*String*/ ));
RDebugUtils.currentLine=77594658;
 //BA.debugLineNum = 77594658;BA.debugLine="FilterLabelTipoChecklist.Text=ShareCode.AppDialog";
__ref._filterlabeltipochecklist /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabeltipochecklist /*String*/ ));
RDebugUtils.currentLine=77594659;
 //BA.debugLineNum = 77594659;BA.debugLine="FilterLabelRota.Text=ShareCode.AppDialogsFilterLa";
__ref._filterlabelrota /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabelrota /*String*/ ));
RDebugUtils.currentLine=77594661;
 //BA.debugLineNum = 77594661;BA.debugLine="DialogReqChecklist.DropdownBackgroundColor = Cons";
__ref._dialogreqchecklist /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77594662;
 //BA.debugLineNum = 77594662;BA.debugLine="DialogReqChecklist.Add( \"(Todos)\" )";
__ref._dialogreqchecklist /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=77594663;
 //BA.debugLineNum = 77594663;BA.debugLine="For i = 0 To chks.Size-1";
if (true) break;

case 5:
//for
this.state = 8;
step30 = 1;
limit30 = (int) (_chks.getSize()-1);
_i = (int) (0) ;
this.state = 67;
if (true) break;

case 67:
//C
this.state = 8;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 7;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 7:
//C
this.state = 68;
RDebugUtils.currentLine=77594664;
 //BA.debugLineNum = 77594664;BA.debugLine="Dim r As CodeNameList = chks.Get(i)";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(_chks.Get(_i));
RDebugUtils.currentLine=77594665;
 //BA.debugLineNum = 77594665;BA.debugLine="DialogReqChecklist.Add( r.Name )";
__ref._dialogreqchecklist /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_r.Name /*String*/ );
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=77594668;
 //BA.debugLineNum = 77594668;BA.debugLine="DialogReqEntity.DropdownBackgroundColor = Consts.";
__ref._dialogreqentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77594669;
 //BA.debugLineNum = 77594669;BA.debugLine="DialogReqEntity.Add( \"(Todos)\" )";
__ref._dialogreqentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=77594670;
 //BA.debugLineNum = 77594670;BA.debugLine="For i = 0 To ents.Size-1";
if (true) break;

case 9:
//for
this.state = 12;
step36 = 1;
limit36 = (int) (_ents.getSize()-1);
_i = (int) (0) ;
this.state = 69;
if (true) break;

case 69:
//C
this.state = 12;
if ((step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36)) this.state = 11;
if (true) break;

case 70:
//C
this.state = 69;
_i = ((int)(0 + _i + step36)) ;
if (true) break;

case 11:
//C
this.state = 70;
RDebugUtils.currentLine=77594671;
 //BA.debugLineNum = 77594671;BA.debugLine="Dim r As CodeNameList = ents.Get(i)";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(_ents.Get(_i));
RDebugUtils.currentLine=77594672;
 //BA.debugLineNum = 77594672;BA.debugLine="DialogReqEntity.Add( r.Name )";
__ref._dialogreqentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_r.Name /*String*/ );
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=77594675;
 //BA.debugLineNum = 77594675;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_ROUTES)";

case 12:
//if
this.state = 19;
if ((parent._utils._int2bool /*boolean*/ (ba,parent._sharecode._device_param_routes /*int*/ ))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=77594676;
 //BA.debugLineNum = 77594676;BA.debugLine="DialogReqRoute.DropdownBackgroundColor = Consts.";
__ref._dialogreqroute /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77594677;
 //BA.debugLineNum = 77594677;BA.debugLine="DialogReqRoute.Add( \"(Todos)\" )";
__ref._dialogreqroute /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=77594678;
 //BA.debugLineNum = 77594678;BA.debugLine="For i = 0 To Routes.Size-1";
if (true) break;

case 15:
//for
this.state = 18;
step43 = 1;
limit43 = (int) (_routes.getSize()-1);
_i = (int) (0) ;
this.state = 71;
if (true) break;

case 71:
//C
this.state = 18;
if ((step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43)) this.state = 17;
if (true) break;

case 72:
//C
this.state = 71;
_i = ((int)(0 + _i + step43)) ;
if (true) break;

case 17:
//C
this.state = 72;
RDebugUtils.currentLine=77594679;
 //BA.debugLineNum = 77594679;BA.debugLine="Dim r As CodeNameList = Routes.Get(i)";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(_routes.Get(_i));
RDebugUtils.currentLine=77594680;
 //BA.debugLineNum = 77594680;BA.debugLine="DialogReqRoute.Add( r.Name )";
__ref._dialogreqroute /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_r.Name /*String*/ );
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=77594686;
 //BA.debugLineNum = 77594686;BA.debugLine="DialogReqStatus.DropdownBackgroundColor = Consts.";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77594687;
 //BA.debugLineNum = 77594687;BA.debugLine="DialogReqStatus.Add( \"(Todos)\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=77594688;
 //BA.debugLineNum = 77594688;BA.debugLine="For i = 0 To sts.Size-1";
if (true) break;

case 20:
//for
this.state = 23;
step50 = 1;
limit50 = (int) (_sts.getSize()-1);
_i = (int) (0) ;
this.state = 73;
if (true) break;

case 73:
//C
this.state = 23;
if ((step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50)) this.state = 22;
if (true) break;

case 74:
//C
this.state = 73;
_i = ((int)(0 + _i + step50)) ;
if (true) break;

case 22:
//C
this.state = 74;
RDebugUtils.currentLine=77594689;
 //BA.debugLineNum = 77594689;BA.debugLine="DialogReqStatus.Add( sts.Get(i) )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_sts.Get(_i)));
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=77594692;
 //BA.debugLineNum = 77594692;BA.debugLine="DialogReqTypeRequest.DropdownBackgroundColor = Co";
__ref._dialogreqtyperequest /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77594693;
 //BA.debugLineNum = 77594693;BA.debugLine="DialogReqTypeRequest.Add( \"(Todos)\" )";
__ref._dialogreqtyperequest /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=77594694;
 //BA.debugLineNum = 77594694;BA.debugLine="For i = 0 To tpreq.Size-1";
if (true) break;

case 24:
//for
this.state = 27;
step55 = 1;
limit55 = (int) (_tpreq.getSize()-1);
_i = (int) (0) ;
this.state = 75;
if (true) break;

case 75:
//C
this.state = 27;
if ((step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55)) this.state = 26;
if (true) break;

case 76:
//C
this.state = 75;
_i = ((int)(0 + _i + step55)) ;
if (true) break;

case 26:
//C
this.state = 76;
RDebugUtils.currentLine=77594695;
 //BA.debugLineNum = 77594695;BA.debugLine="Dim r As CodeNameList = tpreq.Get(i)";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(_tpreq.Get(_i));
RDebugUtils.currentLine=77594696;
 //BA.debugLineNum = 77594696;BA.debugLine="DialogReqTypeRequest.Add( r.Name )";
__ref._dialogreqtyperequest /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_r.Name /*String*/ );
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=77594699;
 //BA.debugLineNum = 77594699;BA.debugLine="If (curr.SDate <> \"\") Then";

case 27:
//if
this.state = 32;
if (((_curr.SDate /*String*/ ).equals("") == false)) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=77594700;
 //BA.debugLineNum = 77594700;BA.debugLine="DialogReqStartDate.Text = curr.SDate ' .SetDate(";
__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.SDate /*String*/ ));
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=77594702;
 //BA.debugLineNum = 77594702;BA.debugLine="DialogReqStartDate.Text = ShareCode.APPDATE_STAR";
__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent._sharecode._appdate_startrange /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=77594705;
 //BA.debugLineNum = 77594705;BA.debugLine="If (curr.EDate <> \"\") Then";

case 32:
//if
this.state = 37;
if (((_curr.EDate /*String*/ ).equals("") == false)) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
RDebugUtils.currentLine=77594706;
 //BA.debugLineNum = 77594706;BA.debugLine="DialogReqEndDate.Text = curr.EDate ' .SetDate(Da";
__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_curr.EDate /*String*/ ));
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=77594708;
 //BA.debugLineNum = 77594708;BA.debugLine="DialogReqEndDate.Text = ShareCode.APPDATE_ENDRAN";
__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent._sharecode._appdate_endrange /*String*/ ));
 if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=77594711;
 //BA.debugLineNum = 77594711;BA.debugLine="DialogReqChecklist.SelectedIndex = 0";
__ref._dialogreqchecklist /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (0));
RDebugUtils.currentLine=77594712;
 //BA.debugLineNum = 77594712;BA.debugLine="If (curr.Task > 0) Then";
if (true) break;

case 38:
//if
this.state = 41;
if ((_curr.Task /*int*/ >0)) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=77594713;
 //BA.debugLineNum = 77594713;BA.debugLine="DialogReqChecklist.SelectedIndex = curr.Task";
__ref._dialogreqchecklist /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Task /*int*/ );
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=77594716;
 //BA.debugLineNum = 77594716;BA.debugLine="DialogReqEntity.SelectedIndex = 0";
__ref._dialogreqentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (0));
RDebugUtils.currentLine=77594717;
 //BA.debugLineNum = 77594717;BA.debugLine="If (curr.Entity > 0) Then";
if (true) break;

case 42:
//if
this.state = 45;
if ((_curr.Entity /*int*/ >0)) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=77594718;
 //BA.debugLineNum = 77594718;BA.debugLine="DialogReqEntity.SelectedIndex = curr.Entity";
__ref._dialogreqentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Entity /*int*/ );
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=77594721;
 //BA.debugLineNum = 77594721;BA.debugLine="DialogReqTypeRequest.SelectedIndex = 0";
__ref._dialogreqtyperequest /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (0));
RDebugUtils.currentLine=77594722;
 //BA.debugLineNum = 77594722;BA.debugLine="If (curr.TPRequest > 0) Then";
if (true) break;

case 46:
//if
this.state = 49;
if ((_curr.TPRequest /*int*/ >0)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=77594723;
 //BA.debugLineNum = 77594723;BA.debugLine="DialogReqTypeRequest.SelectedIndex = curr.TPRequ";
__ref._dialogreqtyperequest /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.TPRequest /*int*/ );
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=77594726;
 //BA.debugLineNum = 77594726;BA.debugLine="DialogReqStatus.SelectedIndex = 0";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (0));
RDebugUtils.currentLine=77594727;
 //BA.debugLineNum = 77594727;BA.debugLine="If (curr.State > 0) Then";
if (true) break;

case 50:
//if
this.state = 53;
if ((_curr.State /*int*/ >0)) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=77594728;
 //BA.debugLineNum = 77594728;BA.debugLine="DialogReqStatus.SelectedIndex = curr.State";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.State /*int*/ );
 if (true) break;

case 53:
//C
this.state = 54;
;
RDebugUtils.currentLine=77594731;
 //BA.debugLineNum = 77594731;BA.debugLine="SetUpdateTBColor(TB001, ShareCode.STS001)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tb001 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,parent._sharecode._sts001 /*boolean*/ );
RDebugUtils.currentLine=77594732;
 //BA.debugLineNum = 77594732;BA.debugLine="SetUpdateTBColor(TB002, ShareCode.STS002)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tb002 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,parent._sharecode._sts002 /*boolean*/ );
RDebugUtils.currentLine=77594733;
 //BA.debugLineNum = 77594733;BA.debugLine="SetUpdateTBColor(TB003, ShareCode.STS003)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tb003 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,parent._sharecode._sts003 /*boolean*/ );
RDebugUtils.currentLine=77594734;
 //BA.debugLineNum = 77594734;BA.debugLine="SetUpdateTBColor(TB004, ShareCode.STS004)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tb004 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,parent._sharecode._sts004 /*boolean*/ );
RDebugUtils.currentLine=77594735;
 //BA.debugLineNum = 77594735;BA.debugLine="SetUpdateTBColor(TB005, ShareCode.STS005)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tb005 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,parent._sharecode._sts005 /*boolean*/ );
RDebugUtils.currentLine=77594738;
 //BA.debugLineNum = 77594738;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getrequestfilterdialog"), _sf);
this.state = 77;
return;
case 77:
//C
this.state = 54;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=77594743;
 //BA.debugLineNum = 77594743;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 54:
//if
this.state = 65;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 56;
}else 
{RDebugUtils.currentLine=77594761;
 //BA.debugLineNum = 77594761;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 64;
}}
if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=77594744;
 //BA.debugLineNum = 77594744;BA.debugLine="Try";
if (true) break;

case 57:
//try
this.state = 62;
this.catchState = 61;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 62;
this.catchState = 61;
RDebugUtils.currentLine=77594745;
 //BA.debugLineNum = 77594745;BA.debugLine="ShareCode.STS001 = TB001.Checked";
parent._sharecode._sts001 /*boolean*/  = __ref._tb001 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=77594746;
 //BA.debugLineNum = 77594746;BA.debugLine="ShareCode.STS002 = TB002.Checked";
parent._sharecode._sts002 /*boolean*/  = __ref._tb002 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=77594747;
 //BA.debugLineNum = 77594747;BA.debugLine="ShareCode.STS003 = TB003.Checked";
parent._sharecode._sts003 /*boolean*/  = __ref._tb003 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=77594748;
 //BA.debugLineNum = 77594748;BA.debugLine="ShareCode.STS004 = TB004.Checked";
parent._sharecode._sts004 /*boolean*/  = __ref._tb004 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=77594749;
 //BA.debugLineNum = 77594749;BA.debugLine="ShareCode.STS005 = TB005.Checked";
parent._sharecode._sts005 /*boolean*/  = __ref._tb005 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=77594751;
 //BA.debugLineNum = 77594751;BA.debugLine="Dim SetTheFilters As RequestFilter = _ 			Types";
_setthefilters = parent._types._makerequestfilter /*xevolution.vrcg.devdemov2400.types._requestfilter*/ (ba,__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqchecklist /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqentity /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqroute /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqtyperequest /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex());
RDebugUtils.currentLine=77594756;
 //BA.debugLineNum = 77594756;BA.debugLine="CallSub2(activ, \"SetTheFilters\", SetTheFilters)";
parent.__c.CallSubDebug2(ba,_activ,"SetTheFilters",(Object)(_setthefilters));
 if (true) break;

case 61:
//C
this.state = 62;
this.catchState = 0;
RDebugUtils.currentLine=77594758;
 //BA.debugLineNum = 77594758;BA.debugLine="CallSub2(activ, \"CancelAllFilters\", True)";
parent.__c.CallSubDebug2(ba,_activ,"CancelAllFilters",(Object)(parent.__c.True));
 if (true) break;
if (true) break;

case 62:
//C
this.state = 65;
this.catchState = 0;
;
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=77594762;
 //BA.debugLineNum = 77594762;BA.debugLine="CallSub2(activ, \"CancelAllFilters\", True)";
parent.__c.CallSubDebug2(ba,_activ,"CancelAllFilters",(Object)(parent.__c.True));
 if (true) break;

case 65:
//C
this.state = -1;
;
RDebugUtils.currentLine=77594765;
 //BA.debugLineNum = 77594765;BA.debugLine="End Sub";
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
public String  _setupdatetbcolor(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _mbutton,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "setupdatetbcolor", false))
	 {return ((String) Debug.delegate(ba, "setupdatetbcolor", new Object[] {_mbutton,_checked}));}
RDebugUtils.currentLine=75300864;
 //BA.debugLineNum = 75300864;BA.debugLine="Sub SetUpdateTBColor(mButton As ToggleButton, Chec";
RDebugUtils.currentLine=75300865;
 //BA.debugLineNum = 75300865;BA.debugLine="mButton.Checked = Checked";
_mbutton.setChecked(_checked);
RDebugUtils.currentLine=75300866;
 //BA.debugLineNum = 75300866;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=75300867;
 //BA.debugLineNum = 75300867;BA.debugLine="mButton.Color = 0xFF818181";
_mbutton.setColor((int) (0xff818181));
 }else {
RDebugUtils.currentLine=75300869;
 //BA.debugLineNum = 75300869;BA.debugLine="mButton.Color = 0xFFC6C6C6";
_mbutton.setColor((int) (0xffc6c6c6));
 };
RDebugUtils.currentLine=75300871;
 //BA.debugLineNum = 75300871;BA.debugLine="End Sub";
return "";
}
public void  _getrequestoptionsdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname,String _title,anywheresoftware.b4a.objects.collections.List _activelist,xevolution.vrcg.devdemov2400.types._requestdata _reqdata) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getrequestoptionsdialog", false))
	 {Debug.delegate(ba, "getrequestoptionsdialog", new Object[] {_activname,_title,_activelist,_reqdata}); return;}
ResumableSub_GetRequestOptionsDialog rsub = new ResumableSub_GetRequestOptionsDialog(this,__ref,_activname,_title,_activelist,_reqdata);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRequestOptionsDialog extends BA.ResumableSub {
public ResumableSub_GetRequestOptionsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activname,String _title,anywheresoftware.b4a.objects.collections.List _activelist,xevolution.vrcg.devdemov2400.types._requestdata _reqdata) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._title = _title;
this._activelist = _activelist;
this._reqdata = _reqdata;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activname;
String _title;
anywheresoftware.b4a.objects.collections.List _activelist;
xevolution.vrcg.devdemov2400.types._requestdata _reqdata;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _n = 0;
int _v = 0;
int _res = 0;
int step30;
int limit30;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=71827457;
 //BA.debugLineNum = 71827457;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=71827458;
 //BA.debugLineNum = 71827458;BA.debugLine="ThisRequestData = reqData";
__ref._thisrequestdata /*xevolution.vrcg.devdemov2400.types._requestdata*/  = _reqdata;
RDebugUtils.currentLine=71827459;
 //BA.debugLineNum = 71827459;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.True);
RDebugUtils.currentLine=71827460;
 //BA.debugLineNum = 71827460;BA.debugLine="CurrentCLD = ApplDialog";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=71827461;
 //BA.debugLineNum = 71827461;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=71827462;
 //BA.debugLineNum = 71827462;BA.debugLine="ApplDialog.SetSize(60%x, 490dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (60),ba),parent.__c.DipToCurrent((int) (490)));
RDebugUtils.currentLine=71827464;
 //BA.debugLineNum = 71827464;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getrequestoptionsdialog"), null);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=71827465;
 //BA.debugLineNum = 71827465;BA.debugLine="DialogPanel.LoadLayout(\"dialog_requestoptions\")";
_dialogpanel.LoadLayout("dialog_requestoptions",ba);
RDebugUtils.currentLine=71827467;
 //BA.debugLineNum = 71827467;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=71827468;
 //BA.debugLineNum = 71827468;BA.debugLine="ROBut_01.Width = (DialogPanel.Width / 2) - 20";
__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth((int) ((_dialogpanel.getWidth()/(double)2)-20));
RDebugUtils.currentLine=71827469;
 //BA.debugLineNum = 71827469;BA.debugLine="ROBut_02.Width = ROBut_01.Width";
__ref._robut_02 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth());
RDebugUtils.currentLine=71827470;
 //BA.debugLineNum = 71827470;BA.debugLine="ROBut_03.Width = ROBut_01.Width";
__ref._robut_03 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth());
RDebugUtils.currentLine=71827471;
 //BA.debugLineNum = 71827471;BA.debugLine="ROBut_04.Width = ROBut_01.Width";
__ref._robut_04 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth());
RDebugUtils.currentLine=71827472;
 //BA.debugLineNum = 71827472;BA.debugLine="ROBut_05.Width = ROBut_01.Width";
__ref._robut_05 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth());
RDebugUtils.currentLine=71827473;
 //BA.debugLineNum = 71827473;BA.debugLine="ROBut_06.Width = ROBut_01.Width";
__ref._robut_06 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth());
RDebugUtils.currentLine=71827474;
 //BA.debugLineNum = 71827474;BA.debugLine="ROBut_07.Width = ROBut_01.Width";
__ref._robut_07 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth());
RDebugUtils.currentLine=71827475;
 //BA.debugLineNum = 71827475;BA.debugLine="ROBut_08.Width = ROBut_01.Width";
__ref._robut_08 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth());
RDebugUtils.currentLine=71827476;
 //BA.debugLineNum = 71827476;BA.debugLine="ROBut_09.Width = ROBut_01.Width";
__ref._robut_09 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setWidth(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth());
RDebugUtils.currentLine=71827478;
 //BA.debugLineNum = 71827478;BA.debugLine="ROBut_04.Left = ROBut_01.Left + ROBut_01.Width +";
__ref._robut_04 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setLeft((int) (__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getLeft()+__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getWidth()+10));
RDebugUtils.currentLine=71827479;
 //BA.debugLineNum = 71827479;BA.debugLine="ROBut_03.Left = ROBut_04.Left";
__ref._robut_03 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setLeft(__ref._robut_04 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getLeft());
RDebugUtils.currentLine=71827480;
 //BA.debugLineNum = 71827480;BA.debugLine="ROBut_05.left = ROBut_04.Left";
__ref._robut_05 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setLeft(__ref._robut_04 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getLeft());
RDebugUtils.currentLine=71827481;
 //BA.debugLineNum = 71827481;BA.debugLine="ROBut_08.left = ROBut_04.Left";
__ref._robut_08 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setLeft(__ref._robut_04 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getLeft());
RDebugUtils.currentLine=71827482;
 //BA.debugLineNum = 71827482;BA.debugLine="ROBut_09.left = ROBut_01.Left";
__ref._robut_09 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setLeft(__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getLeft());
 if (true) break;
;
RDebugUtils.currentLine=71827486;
 //BA.debugLineNum = 71827486;BA.debugLine="If ((ShareCode.APP_DOMAIN.ToLowerCase = \"devdemo\"";

case 4:
//if
this.state = 9;
if ((((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("devdemo")) || ((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("demo")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=71827487;
 //BA.debugLineNum = 71827487;BA.debugLine="ROBut_09.Visible = True";
__ref._robut_09 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=71827489;
 //BA.debugLineNum = 71827489;BA.debugLine="ROBut_09.Visible = False";
__ref._robut_09 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.False);
 if (true) break;
;
RDebugUtils.currentLine=71827492;
 //BA.debugLineNum = 71827492;BA.debugLine="For n=0 To activeList.Size-1";

case 9:
//for
this.state = 12;
step30 = 1;
limit30 = (int) (_activelist.getSize()-1);
_n = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 12;
if ((step30 > 0 && _n <= limit30) || (step30 < 0 && _n >= limit30)) this.state = 11;
if (true) break;

case 19:
//C
this.state = 18;
_n = ((int)(0 + _n + step30)) ;
if (true) break;

case 11:
//C
this.state = 19;
RDebugUtils.currentLine=71827493;
 //BA.debugLineNum = 71827493;BA.debugLine="Dim v As Int = activeList.Get(n)";
_v = (int)(BA.ObjectToNumber(_activelist.Get(_n)));
RDebugUtils.currentLine=71827494;
 //BA.debugLineNum = 71827494;BA.debugLine="ROButtonstate(n+1, (v = 1))";
__ref._robuttonstate /*String*/ (null,(int) (_n+1),(_v==1));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=71827497;
 //BA.debugLineNum = 71827497;BA.debugLine="Wait For (sf) Dialog_Result(Res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getrequestoptionsdialog"), _sf);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=71827498;
 //BA.debugLineNum = 71827498;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=71827502;
 //BA.debugLineNum = 71827502;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _robuttonstate(xevolution.vrcg.devdemov2400.appdialogs __ref,int _posis,boolean _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "robuttonstate", false))
	 {return ((String) Debug.delegate(ba, "robuttonstate", new Object[] {_posis,_state}));}
RDebugUtils.currentLine=71958528;
 //BA.debugLineNum = 71958528;BA.debugLine="Sub ROButtonstate(posis As Int, state As Boolean)";
RDebugUtils.currentLine=71958529;
 //BA.debugLineNum = 71958529;BA.debugLine="If (posis = 1) Then";
if ((_posis==1)) { 
RDebugUtils.currentLine=71958530;
 //BA.debugLineNum = 71958530;BA.debugLine="ROBut_01.Enabled = state";
__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(_state);
RDebugUtils.currentLine=71958531;
 //BA.debugLineNum = 71958531;BA.debugLine="If (state = False) Then ROBut_01.Color = Consts.";
if ((_state==__c.False)) { 
__ref._robut_01 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colorgray /*int*/ );};
 }else 
{RDebugUtils.currentLine=71958532;
 //BA.debugLineNum = 71958532;BA.debugLine="Else If (posis = 2) Then";
if ((_posis==2)) { 
RDebugUtils.currentLine=71958533;
 //BA.debugLineNum = 71958533;BA.debugLine="ROBut_02.Enabled = state";
__ref._robut_02 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(_state);
RDebugUtils.currentLine=71958534;
 //BA.debugLineNum = 71958534;BA.debugLine="If (state = False) Then ROBut_02.Color = Consts.";
if ((_state==__c.False)) { 
__ref._robut_02 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colorgray /*int*/ );};
 }else 
{RDebugUtils.currentLine=71958535;
 //BA.debugLineNum = 71958535;BA.debugLine="Else If (posis = 3) Then";
if ((_posis==3)) { 
RDebugUtils.currentLine=71958536;
 //BA.debugLineNum = 71958536;BA.debugLine="ROBut_03.Enabled = state";
__ref._robut_03 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(_state);
RDebugUtils.currentLine=71958537;
 //BA.debugLineNum = 71958537;BA.debugLine="If (state = False) Then ROBut_03.Color = Consts.";
if ((_state==__c.False)) { 
__ref._robut_03 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colorgray /*int*/ );};
 }else 
{RDebugUtils.currentLine=71958538;
 //BA.debugLineNum = 71958538;BA.debugLine="Else If (posis = 4) Then";
if ((_posis==4)) { 
RDebugUtils.currentLine=71958539;
 //BA.debugLineNum = 71958539;BA.debugLine="ROBut_04.Enabled = state";
__ref._robut_04 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(_state);
RDebugUtils.currentLine=71958540;
 //BA.debugLineNum = 71958540;BA.debugLine="If (state = False) Then ROBut_04.Color = Consts.";
if ((_state==__c.False)) { 
__ref._robut_04 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colorgray /*int*/ );};
 }else 
{RDebugUtils.currentLine=71958541;
 //BA.debugLineNum = 71958541;BA.debugLine="Else If (posis = 5) Then";
if ((_posis==5)) { 
RDebugUtils.currentLine=71958542;
 //BA.debugLineNum = 71958542;BA.debugLine="ROBut_05.Enabled = state";
__ref._robut_05 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(_state);
RDebugUtils.currentLine=71958543;
 //BA.debugLineNum = 71958543;BA.debugLine="If (state = False) Then ROBut_05.Color = Consts.";
if ((_state==__c.False)) { 
__ref._robut_05 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colorgray /*int*/ );};
 }else 
{RDebugUtils.currentLine=71958544;
 //BA.debugLineNum = 71958544;BA.debugLine="Else If (posis = 6) Then";
if ((_posis==6)) { 
RDebugUtils.currentLine=71958545;
 //BA.debugLineNum = 71958545;BA.debugLine="ROBut_06.Enabled = state";
__ref._robut_06 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(_state);
RDebugUtils.currentLine=71958546;
 //BA.debugLineNum = 71958546;BA.debugLine="If (state = False) Then ROBut_06.Color = Consts.";
if ((_state==__c.False)) { 
__ref._robut_06 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colorgray /*int*/ );};
 }else 
{RDebugUtils.currentLine=71958547;
 //BA.debugLineNum = 71958547;BA.debugLine="Else If (posis = 7) Then";
if ((_posis==7)) { 
RDebugUtils.currentLine=71958548;
 //BA.debugLineNum = 71958548;BA.debugLine="ROBut_07.Enabled = state";
__ref._robut_07 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(_state);
RDebugUtils.currentLine=71958549;
 //BA.debugLineNum = 71958549;BA.debugLine="If (state = False) Then ROBut_07.Color = Consts.";
if ((_state==__c.False)) { 
__ref._robut_07 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colorgray /*int*/ );};
 }else 
{RDebugUtils.currentLine=71958550;
 //BA.debugLineNum = 71958550;BA.debugLine="Else If (posis = 8) Then";
if ((_posis==8)) { 
RDebugUtils.currentLine=71958551;
 //BA.debugLineNum = 71958551;BA.debugLine="ROBut_08.Enabled = state";
__ref._robut_08 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(_state);
RDebugUtils.currentLine=71958552;
 //BA.debugLineNum = 71958552;BA.debugLine="If (state = False) Then ROBut_08.Color = Consts.";
if ((_state==__c.False)) { 
__ref._robut_08 /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(_consts._colorgray /*int*/ );};
 }}}}}}}}
;
RDebugUtils.currentLine=71958555;
 //BA.debugLineNum = 71958555;BA.debugLine="End Sub";
return "";
}
public void  _getrequesttaskdetailsdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.sql.SQL.CursorWrapper _items,String _tagcode) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getrequesttaskdetailsdialog", false))
	 {Debug.delegate(ba, "getrequesttaskdetailsdialog", new Object[] {_activ,_activname,_title,_items,_tagcode}); return;}
ResumableSub_getRequestTaskDetailsDialog rsub = new ResumableSub_getRequestTaskDetailsDialog(this,__ref,_activ,_activname,_title,_items,_tagcode);
rsub.resume(ba, null);
}
public static class ResumableSub_getRequestTaskDetailsDialog extends BA.ResumableSub {
public ResumableSub_getRequestTaskDetailsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.sql.SQL.CursorWrapper _items,String _tagcode) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._items = _items;
this._tagcode = _tagcode;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
anywheresoftware.b4a.sql.SQL.CursorWrapper _items;
String _tagcode;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _height = 0;
int _row = 0;
String _newrequesttype = "";
String _sqlevc = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _localrecord = null;
anywheresoftware.b4a.objects.collections.List _tvals = null;
int _nn = 0;
int _res = 0;
int step18;
int limit18;
int step29;
int limit29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74842113;
 //BA.debugLineNum = 74842113;BA.debugLine="MasterTagcode = tagcode";
__ref._mastertagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=74842114;
 //BA.debugLineNum = 74842114;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=74842115;
 //BA.debugLineNum = 74842115;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=74842117;
 //BA.debugLineNum = 74842117;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"E";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Executar","Voltar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=74842118;
 //BA.debugLineNum = 74842118;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=74842119;
 //BA.debugLineNum = 74842119;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=74842120;
 //BA.debugLineNum = 74842120;BA.debugLine="ApplDialog.SetSize(95%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=74842122;
 //BA.debugLineNum = 74842122;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=74842125;
 //BA.debugLineNum = 74842125;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=74842126;
 //BA.debugLineNum = 74842126;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getrequesttaskdetailsdialog"), null);
this.state = 26;
return;
case 26:
//C
this.state = 7;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=74842127;
 //BA.debugLineNum = 74842127;BA.debugLine="DialogPanel.LoadLayout(\"task_item_detail_list\") '";
_dialogpanel.LoadLayout("task_item_detail_list",ba);
RDebugUtils.currentLine=74842128;
 //BA.debugLineNum = 74842128;BA.debugLine="Dim Height As Int = 45dip";
_height = parent.__c.DipToCurrent((int) (45));
RDebugUtils.currentLine=74842129;
 //BA.debugLineNum = 74842129;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=74842130;
 //BA.debugLineNum = 74842130;BA.debugLine="Height = 60dip";
_height = parent.__c.DipToCurrent((int) (60));
 if (true) break;
;
RDebugUtils.currentLine=74842133;
 //BA.debugLineNum = 74842133;BA.debugLine="For Row = 0 To items.RowCount-1";

case 10:
//for
this.state = 13;
step18 = 1;
limit18 = (int) (_items.getRowCount()-1);
_row = (int) (0) ;
this.state = 27;
if (true) break;

case 27:
//C
this.state = 13;
if ((step18 > 0 && _row <= limit18) || (step18 < 0 && _row >= limit18)) this.state = 12;
if (true) break;

case 28:
//C
this.state = 27;
_row = ((int)(0 + _row + step18)) ;
if (true) break;

case 12:
//C
this.state = 28;
RDebugUtils.currentLine=74842134;
 //BA.debugLineNum = 74842134;BA.debugLine="items.Position = Row";
_items.setPosition(_row);
RDebugUtils.currentLine=74842135;
 //BA.debugLineNum = 74842135;BA.debugLine="ListItemsList.Add( createTaskLineItemDetail(acti";
__ref._listitemslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createtasklineitemdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_items.GetString("title"),_items.GetInt("item_type"),_height).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=74842137;
 //BA.debugLineNum = 74842137;BA.debugLine="items.close";
_items.Close();
RDebugUtils.currentLine=74842142;
 //BA.debugLineNum = 74842142;BA.debugLine="Dim newRequestType As String = tagcode";
_newrequesttype = _tagcode;
RDebugUtils.currentLine=74842187;
 //BA.debugLineNum = 74842187;BA.debugLine="Dim SQLEVC As String = $\"select a.task_tagcode fr";
_sqlevc = ("select a.task_tagcode from dta_typerequests_tasks as a where a.typerequest_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"' order by a.position");
RDebugUtils.currentLine=74842188;
 //BA.debugLineNum = 74842188;BA.debugLine="Dim localRecord As Cursor = Starter.LocalSQLEVC.E";
_localrecord = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_localrecord = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlevc)));
RDebugUtils.currentLine=74842189;
 //BA.debugLineNum = 74842189;BA.debugLine="Dim TVals As List : TVals.Initialize";
_tvals = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=74842189;
 //BA.debugLineNum = 74842189;BA.debugLine="Dim TVals As List : TVals.Initialize";
_tvals.Initialize();
RDebugUtils.currentLine=74842191;
 //BA.debugLineNum = 74842191;BA.debugLine="If localRecord.RowCount > 0 Then";
if (true) break;

case 14:
//if
this.state = 21;
if (_localrecord.getRowCount()>0) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=74842192;
 //BA.debugLineNum = 74842192;BA.debugLine="For nn = 0 To localRecord.RowCount-1";
if (true) break;

case 17:
//for
this.state = 20;
step29 = 1;
limit29 = (int) (_localrecord.getRowCount()-1);
_nn = (int) (0) ;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 20;
if ((step29 > 0 && _nn <= limit29) || (step29 < 0 && _nn >= limit29)) this.state = 19;
if (true) break;

case 30:
//C
this.state = 29;
_nn = ((int)(0 + _nn + step29)) ;
if (true) break;

case 19:
//C
this.state = 30;
RDebugUtils.currentLine=74842193;
 //BA.debugLineNum = 74842193;BA.debugLine="localRecord.Position = nn";
_localrecord.setPosition(_nn);
RDebugUtils.currentLine=74842194;
 //BA.debugLineNum = 74842194;BA.debugLine="TVals.Add(localRecord.GetString(\"task_tagcode\")";
_tvals.Add((Object)(_localrecord.GetString("task_tagcode")));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=74842197;
 //BA.debugLineNum = 74842197;BA.debugLine="localRecord.Close";
_localrecord.Close();
RDebugUtils.currentLine=74842199;
 //BA.debugLineNum = 74842199;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getrequesttaskdetailsdialog"), _sf);
this.state = 31;
return;
case 31:
//C
this.state = 22;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=74842200;
 //BA.debugLineNum = 74842200;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 22:
//if
this.state = 25;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=74842201;
 //BA.debugLineNum = 74842201;BA.debugLine="CallSubDelayed3(TasksCL2, \"ReturnShowRequestTask";
parent.__c.CallSubDelayed3(ba,(Object)(parent._taskscl2.getObject()),"ReturnShowRequestTaskDetails",(Object)(_newrequesttype),(Object)(_tvals));
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=74842205;
 //BA.debugLineNum = 74842205;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sync_manual_radio_diaria_checkedchange(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_radio_diaria_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_radio_diaria_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=79953920;
 //BA.debugLineNum = 79953920;BA.debugLine="Sub sync_manual_Radio_diaria_CheckedChange(Checked";
RDebugUtils.currentLine=79953921;
 //BA.debugLineNum = 79953921;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=79953922;
 //BA.debugLineNum = 79953922;BA.debugLine="sync_manual_chk1.Enabled = False";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953923;
 //BA.debugLineNum = 79953923;BA.debugLine="sync_manual_chk2.Enabled = False";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953924;
 //BA.debugLineNum = 79953924;BA.debugLine="sync_manual_chk3.Enabled = False";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953925;
 //BA.debugLineNum = 79953925;BA.debugLine="sync_manual_chk4.Enabled = False";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953926;
 //BA.debugLineNum = 79953926;BA.debugLine="sync_manual_chk5.Enabled = False";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953927;
 //BA.debugLineNum = 79953927;BA.debugLine="sync_manual_chk6.Enabled = False";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953928;
 //BA.debugLineNum = 79953928;BA.debugLine="sync_manual_chk7.Enabled = False";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953929;
 //BA.debugLineNum = 79953929;BA.debugLine="sync_manual_chk8.Enabled = False";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953930;
 //BA.debugLineNum = 79953930;BA.debugLine="sync_manual_chk9.Enabled = False";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953931;
 //BA.debugLineNum = 79953931;BA.debugLine="sync_manual_chk10.Enabled = False";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953932;
 //BA.debugLineNum = 79953932;BA.debugLine="sync_manual_chk11.Enabled = False";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953933;
 //BA.debugLineNum = 79953933;BA.debugLine="sync_manual_chk12.Enabled = False";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953934;
 //BA.debugLineNum = 79953934;BA.debugLine="sync_manual_chk_docs_templates.Enabled = False";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=79953936;
 //BA.debugLineNum = 79953936;BA.debugLine="sync_manual_chk1.Checked = True";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=79953937;
 //BA.debugLineNum = 79953937;BA.debugLine="sync_manual_chk2.Checked = True";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=79953938;
 //BA.debugLineNum = 79953938;BA.debugLine="sync_manual_chk3.Checked = False";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953939;
 //BA.debugLineNum = 79953939;BA.debugLine="sync_manual_chk4.Checked = False";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953940;
 //BA.debugLineNum = 79953940;BA.debugLine="sync_manual_chk5.Checked = False";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953941;
 //BA.debugLineNum = 79953941;BA.debugLine="sync_manual_chk6.Checked = False";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953942;
 //BA.debugLineNum = 79953942;BA.debugLine="sync_manual_chk7.Checked = False";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953943;
 //BA.debugLineNum = 79953943;BA.debugLine="sync_manual_chk8.Checked = False";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953944;
 //BA.debugLineNum = 79953944;BA.debugLine="sync_manual_chk9.Checked = False";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953945;
 //BA.debugLineNum = 79953945;BA.debugLine="sync_manual_chk10.Checked = False";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953946;
 //BA.debugLineNum = 79953946;BA.debugLine="sync_manual_chk11.Checked = False";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953947;
 //BA.debugLineNum = 79953947;BA.debugLine="sync_manual_chk12.Checked = False";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953948;
 //BA.debugLineNum = 79953948;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953950;
 //BA.debugLineNum = 79953950;BA.debugLine="PanelMestres.Visible = False";
__ref._panelmestres /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=79953951;
 //BA.debugLineNum = 79953951;BA.debugLine="sync_manual_runfirstintall.Checked = False";
__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79953952;
 //BA.debugLineNum = 79953952;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
 };
RDebugUtils.currentLine=79953954;
 //BA.debugLineNum = 79953954;BA.debugLine="End Sub";
return "";
}
public String  _setcheckssyncmanual(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "setcheckssyncmanual", false))
	 {return ((String) Debug.delegate(ba, "setcheckssyncmanual", null));}
RDebugUtils.currentLine=80150528;
 //BA.debugLineNum = 80150528;BA.debugLine="Sub SetChecksSyncManual";
RDebugUtils.currentLine=80150530;
 //BA.debugLineNum = 80150530;BA.debugLine="ShareCode.SYNC_COMPONENTS=\"\"";
_sharecode._sync_components /*String*/  = "";
RDebugUtils.currentLine=80150531;
 //BA.debugLineNum = 80150531;BA.debugLine="If ShareCode.SyncManualComponents.IsInitialized T";
if (_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=80150532;
 //BA.debugLineNum = 80150532;BA.debugLine="ShareCode.SyncManualComponents.Clear";
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 }else {
RDebugUtils.currentLine=80150534;
 //BA.debugLineNum = 80150534;BA.debugLine="ShareCode.SyncManualComponents.Initialize";
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=80150537;
 //BA.debugLineNum = 80150537;BA.debugLine="If sync_manual_chk1.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("1"));};
RDebugUtils.currentLine=80150538;
 //BA.debugLineNum = 80150538;BA.debugLine="If sync_manual_chk2.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("2"));};
RDebugUtils.currentLine=80150539;
 //BA.debugLineNum = 80150539;BA.debugLine="If sync_manual_chk3.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("3"));};
RDebugUtils.currentLine=80150540;
 //BA.debugLineNum = 80150540;BA.debugLine="If sync_manual_chk4.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("4"));};
RDebugUtils.currentLine=80150541;
 //BA.debugLineNum = 80150541;BA.debugLine="If sync_manual_chk5.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("5"));};
RDebugUtils.currentLine=80150542;
 //BA.debugLineNum = 80150542;BA.debugLine="If sync_manual_chk6.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("6"));};
RDebugUtils.currentLine=80150543;
 //BA.debugLineNum = 80150543;BA.debugLine="If sync_manual_chk7.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("7"));};
RDebugUtils.currentLine=80150544;
 //BA.debugLineNum = 80150544;BA.debugLine="If sync_manual_chk8.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("8"));};
RDebugUtils.currentLine=80150545;
 //BA.debugLineNum = 80150545;BA.debugLine="If sync_manual_chk9.Checked Then ShareCode.SyncMa";
if (__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("9"));};
RDebugUtils.currentLine=80150546;
 //BA.debugLineNum = 80150546;BA.debugLine="If sync_manual_chk10.Checked Then ShareCode.SyncM";
if (__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("10"));};
RDebugUtils.currentLine=80150547;
 //BA.debugLineNum = 80150547;BA.debugLine="If sync_manual_chk11.Checked Then ShareCode.SyncM";
if (__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("11"));};
RDebugUtils.currentLine=80150548;
 //BA.debugLineNum = 80150548;BA.debugLine="If sync_manual_chk12.Checked Then ShareCode.SyncM";
if (__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked()) { 
_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("12"));};
RDebugUtils.currentLine=80150550;
 //BA.debugLineNum = 80150550;BA.debugLine="ShareCode.SYNC_COMPONENTS = Utils.List2Str(ShareC";
_sharecode._sync_components /*String*/  = _utils._list2str /*String*/ (ba,_sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ ,"|");
RDebugUtils.currentLine=80150552;
 //BA.debugLineNum = 80150552;BA.debugLine="End Sub";
return "";
}
public void  _gettaskdetailsdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.sql.SQL.CursorWrapper _items,String _tagcode) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "gettaskdetailsdialog", false))
	 {Debug.delegate(ba, "gettaskdetailsdialog", new Object[] {_activ,_activname,_title,_items,_tagcode}); return;}
ResumableSub_getTaskDetailsDialog rsub = new ResumableSub_getTaskDetailsDialog(this,__ref,_activ,_activname,_title,_items,_tagcode);
rsub.resume(ba, null);
}
public static class ResumableSub_getTaskDetailsDialog extends BA.ResumableSub {
public ResumableSub_getTaskDetailsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.sql.SQL.CursorWrapper _items,String _tagcode) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._items = _items;
this._tagcode = _tagcode;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
anywheresoftware.b4a.sql.SQL.CursorWrapper _items;
String _tagcode;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _height = 0;
int _row = 0;
anywheresoftware.b4a.objects.collections.List _typelist = null;
String _newrequesttype = "";
String _ssql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _n = 0;
String _nrt = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordw = null;
int _res = 0;
xevolution.vrcg.devdemov2400.types._triplevalues _tvals = null;
int step18;
int limit18;
int step31;
int limit31;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74907649;
 //BA.debugLineNum = 74907649;BA.debugLine="MasterTagcode = tagcode";
__ref._mastertagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=74907650;
 //BA.debugLineNum = 74907650;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=74907651;
 //BA.debugLineNum = 74907651;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=74907653;
 //BA.debugLineNum = 74907653;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"E";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Executar","Voltar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=74907654;
 //BA.debugLineNum = 74907654;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=74907655;
 //BA.debugLineNum = 74907655;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=74907656;
 //BA.debugLineNum = 74907656;BA.debugLine="ApplDialog.SetSize(95%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=74907658;
 //BA.debugLineNum = 74907658;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=74907661;
 //BA.debugLineNum = 74907661;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=74907662;
 //BA.debugLineNum = 74907662;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "gettaskdetailsdialog"), null);
this.state = 36;
return;
case 36:
//C
this.state = 7;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=74907663;
 //BA.debugLineNum = 74907663;BA.debugLine="DialogPanel.LoadLayout(\"task_item_detail_list\") '";
_dialogpanel.LoadLayout("task_item_detail_list",ba);
RDebugUtils.currentLine=74907664;
 //BA.debugLineNum = 74907664;BA.debugLine="Dim Height As Int = 45dip";
_height = parent.__c.DipToCurrent((int) (45));
RDebugUtils.currentLine=74907665;
 //BA.debugLineNum = 74907665;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=74907666;
 //BA.debugLineNum = 74907666;BA.debugLine="Height = 60dip";
_height = parent.__c.DipToCurrent((int) (60));
 if (true) break;
;
RDebugUtils.currentLine=74907669;
 //BA.debugLineNum = 74907669;BA.debugLine="For Row = 0 To items.RowCount-1";

case 10:
//for
this.state = 13;
step18 = 1;
limit18 = (int) (_items.getRowCount()-1);
_row = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 13;
if ((step18 > 0 && _row <= limit18) || (step18 < 0 && _row >= limit18)) this.state = 12;
if (true) break;

case 38:
//C
this.state = 37;
_row = ((int)(0 + _row + step18)) ;
if (true) break;

case 12:
//C
this.state = 38;
RDebugUtils.currentLine=74907670;
 //BA.debugLineNum = 74907670;BA.debugLine="items.Position = Row";
_items.setPosition(_row);
RDebugUtils.currentLine=74907671;
 //BA.debugLineNum = 74907671;BA.debugLine="ListItemsList.Add( createTaskLineItemDetail(acti";
__ref._listitemslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createtasklineitemdetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_items.GetString("title"),_items.GetInt("item_type"),_height).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=74907673;
 //BA.debugLineNum = 74907673;BA.debugLine="items.close";
_items.Close();
RDebugUtils.currentLine=74907678;
 //BA.debugLineNum = 74907678;BA.debugLine="Dim TypeList As List : TypeList.Initialize";
_typelist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=74907678;
 //BA.debugLineNum = 74907678;BA.debugLine="Dim TypeList As List : TypeList.Initialize";
_typelist.Initialize();
RDebugUtils.currentLine=74907679;
 //BA.debugLineNum = 74907679;BA.debugLine="Dim newRequestType As String = \"\"";
_newrequesttype = "";
RDebugUtils.currentLine=74907680;
 //BA.debugLineNum = 74907680;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode, t";
_ssql = ("select distinct tagcode, title, tr_is_model\n"+"				from dta_typerequests \n"+"				where tagcode in (select distinct typerequest_tagcode \n"+"					from dta_typerequests_tasks where task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"') and active=1 and tr_is_model=0 \n"+"					ORDER BY created_at desc ");
RDebugUtils.currentLine=74907685;
 //BA.debugLineNum = 74907685;BA.debugLine="Log(sSQL)";
parent.__c.LogImpl("674907685",_ssql,0);
RDebugUtils.currentLine=74907686;
 //BA.debugLineNum = 74907686;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=74907687;
 //BA.debugLineNum = 74907687;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=74907688;
 //BA.debugLineNum = 74907688;BA.debugLine="If Record.RowCount >= 1 Then";
if (true) break;

case 14:
//if
this.state = 23;
if (_record.getRowCount()>=1) { 
this.state = 16;
}else {
this.state = 22;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=74907689;
 //BA.debugLineNum = 74907689;BA.debugLine="For n=0 To Record.RowCount-1";
if (true) break;

case 17:
//for
this.state = 20;
step31 = 1;
limit31 = (int) (_record.getRowCount()-1);
_n = (int) (0) ;
this.state = 39;
if (true) break;

case 39:
//C
this.state = 20;
if ((step31 > 0 && _n <= limit31) || (step31 < 0 && _n >= limit31)) this.state = 19;
if (true) break;

case 40:
//C
this.state = 39;
_n = ((int)(0 + _n + step31)) ;
if (true) break;

case 19:
//C
this.state = 40;
RDebugUtils.currentLine=74907690;
 //BA.debugLineNum = 74907690;BA.debugLine="Record.Position = n";
_record.setPosition(_n);
RDebugUtils.currentLine=74907691;
 //BA.debugLineNum = 74907691;BA.debugLine="newRequestType = Record.GetString(\"tagcode\")";
_newrequesttype = _record.GetString("tagcode");
RDebugUtils.currentLine=74907692;
 //BA.debugLineNum = 74907692;BA.debugLine="TypeList.Add(newRequestType)";
_typelist.Add((Object)(_newrequesttype));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=74907701;
 //BA.debugLineNum = 74907701;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=74907704;
 //BA.debugLineNum = 74907704;BA.debugLine="If (TypeList.Size = 0) Then";
if (true) break;

case 24:
//if
this.state = 31;
if ((_typelist.getSize()==0)) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=74907705;
 //BA.debugLineNum = 74907705;BA.debugLine="Utils.SetDialogtitle(sf, $\"${title} (Intervenção";
parent._utils._setdialogtitle /*String*/ (ba,_sf,(""+parent.__c.SmartStringFormatter("",(Object)(_title))+" (Intervenção geral)"));
RDebugUtils.currentLine=74907706;
 //BA.debugLineNum = 74907706;BA.debugLine="Dim nrt As String = \"\"";
_nrt = "";
RDebugUtils.currentLine=74907707;
 //BA.debugLineNum = 74907707;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode,";
_ssql = ("select distinct tagcode, title from dta_typerequests where id=0 and is_internal=1 limit 1");
RDebugUtils.currentLine=74907708;
 //BA.debugLineNum = 74907708;BA.debugLine="Private Recordw As Cursor";
_recordw = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=74907709;
 //BA.debugLineNum = 74907709;BA.debugLine="Recordw = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_recordw = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=74907710;
 //BA.debugLineNum = 74907710;BA.debugLine="If Recordw.RowCount > 0 Then";
if (true) break;

case 27:
//if
this.state = 30;
if (_recordw.getRowCount()>0) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=74907711;
 //BA.debugLineNum = 74907711;BA.debugLine="Recordw.Position = 0";
_recordw.setPosition((int) (0));
RDebugUtils.currentLine=74907712;
 //BA.debugLineNum = 74907712;BA.debugLine="nrt = Recordw.GetString(\"tagcode\")";
_nrt = _recordw.GetString("tagcode");
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=74907714;
 //BA.debugLineNum = 74907714;BA.debugLine="Recordw.Close";
_recordw.Close();
RDebugUtils.currentLine=74907715;
 //BA.debugLineNum = 74907715;BA.debugLine="newRequestType = Utils.IfNullOrEmpty(nrt, \"TSKS_";
_newrequesttype = parent._utils._ifnullorempty /*String*/ (ba,_nrt,"TSKS_INTERNO_01");
RDebugUtils.currentLine=74907716;
 //BA.debugLineNum = 74907716;BA.debugLine="TypeList.Add(newRequestType)";
_typelist.Add((Object)(_newrequesttype));
RDebugUtils.currentLine=74907718;
 //BA.debugLineNum = 74907718;BA.debugLine="ApplDialog.GetButton(DialogResponse.POSITIVE).En";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.POSITIVE).setEnabled(parent._utils._int2bool /*boolean*/ (ba,parent._sharecode._device_param_runcl_notyperequest /*int*/ ));
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=74907721;
 //BA.debugLineNum = 74907721;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "gettaskdetailsdialog"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 32;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=74907722;
 //BA.debugLineNum = 74907722;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 32:
//if
this.state = 35;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=74907723;
 //BA.debugLineNum = 74907723;BA.debugLine="Dim TVals As TripleValues = Types.MakeTripleValu";
_tvals = parent._types._maketriplevalues /*xevolution.vrcg.devdemov2400.types._triplevalues*/ (ba,_tagcode,"","");
RDebugUtils.currentLine=74907724;
 //BA.debugLineNum = 74907724;BA.debugLine="CallSubDelayed3(TasksCL2, \"ReturnShowTaskDetails";
parent.__c.CallSubDelayed3(ba,(Object)(parent._taskscl2.getObject()),"ReturnShowTaskDetails",(Object)(_typelist),(Object)(_tvals));
 if (true) break;

case 35:
//C
this.state = -1;
;
RDebugUtils.currentLine=74907728;
 //BA.debugLineNum = 74907728;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _gettaskfiltersdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._taskfilter _curr,int _tabposis,xevolution.vrcg.devdemov2400.types._statusfiltertask _sft) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "gettaskfiltersdialog", false))
	 {Debug.delegate(ba, "gettaskfiltersdialog", new Object[] {_activ,_curr,_tabposis,_sft}); return;}
ResumableSub_GetTaskFiltersDialog rsub = new ResumableSub_GetTaskFiltersDialog(this,__ref,_activ,_curr,_tabposis,_sft);
rsub.resume(ba, null);
}
public static class ResumableSub_GetTaskFiltersDialog extends BA.ResumableSub {
public ResumableSub_GetTaskFiltersDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._taskfilter _curr,int _tabposis,xevolution.vrcg.devdemov2400.types._statusfiltertask _sft) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._tabposis = _tabposis;
this._sft = _sft;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._taskfilter _curr;
int _tabposis;
xevolution.vrcg.devdemov2400.types._statusfiltertask _sft;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
boolean _wchk = false;
int _res = 0;
xevolution.vrcg.devdemov2400.types._taskfilter _setthefilters = null;
int _wreq = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75235329;
 //BA.debugLineNum = 75235329;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Filtros","Confirmar","Cancelar","Remover filtro",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=75235331;
 //BA.debugLineNum = 75235331;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=75235332;
 //BA.debugLineNum = 75235332;BA.debugLine="If tabposis = 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_tabposis==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=75235333;
 //BA.debugLineNum = 75235333;BA.debugLine="ApplDialog.SetSize(500dip, 380dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (500)),parent.__c.DipToCurrent((int) (380)));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=75235335;
 //BA.debugLineNum = 75235335;BA.debugLine="ApplDialog.SetSize(95%x, 65%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (65),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75235337;
 //BA.debugLineNum = 75235337;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "gettaskfiltersdialog"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=75235339;
 //BA.debugLineNum = 75235339;BA.debugLine="If tabposis = 0 Then";
if (true) break;

case 7:
//if
this.state = 20;
if (_tabposis==0) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=75235347;
 //BA.debugLineNum = 75235347;BA.debugLine="Else If tabposis = 1 Then";
if (_tabposis==1) { 
this.state = 11;
}else {
this.state = 13;
}}
if (true) break;

case 9:
//C
this.state = 20;
RDebugUtils.currentLine=75235340;
 //BA.debugLineNum = 75235340;BA.debugLine="pnl.LoadLayout(\"dialog_filtertask_typerequest\")";
_pnl.LoadLayout("dialog_filtertask_typerequest",ba);
RDebugUtils.currentLine=75235341;
 //BA.debugLineNum = 75235341;BA.debugLine="SetUpdateTBColor(TBSingular, sft.singular)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tbsingular /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,_sft.singular /*boolean*/ );
RDebugUtils.currentLine=75235342;
 //BA.debugLineNum = 75235342;BA.debugLine="SetUpdateTBColor(TBPlural, sft.plural)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tbplural /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,_sft.plural /*boolean*/ );
RDebugUtils.currentLine=75235343;
 //BA.debugLineNum = 75235343;BA.debugLine="SetUpdateTBColor(TBActive, sft.active)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tbactive /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,_sft.active /*boolean*/ );
RDebugUtils.currentLine=75235344;
 //BA.debugLineNum = 75235344;BA.debugLine="SetUpdateTBColor(TBInactive, sft.inactive)";
__ref._setupdatetbcolor /*String*/ (null,__ref._tbinactive /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ ,_sft.inactive /*boolean*/ );
 if (true) break;

case 11:
//C
this.state = 20;
RDebugUtils.currentLine=75235348;
 //BA.debugLineNum = 75235348;BA.debugLine="pnl.LoadLayout(\"dialog_filtertask_device_2\")";
_pnl.LoadLayout("dialog_filtertask_device_2",ba);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=75235350;
 //BA.debugLineNum = 75235350;BA.debugLine="pnl.LoadLayout(\"dialog_filtertask_device_2\")";
_pnl.LoadLayout("dialog_filtertask_device_2",ba);
RDebugUtils.currentLine=75235351;
 //BA.debugLineNum = 75235351;BA.debugLine="DialogReqType.DropdownBackgroundColor = Consts.C";
__ref._dialogreqtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75235352;
 //BA.debugLineNum = 75235352;BA.debugLine="DialogReqType.Add( \"(Todos)\" )";
__ref._dialogreqtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75235353;
 //BA.debugLineNum = 75235353;BA.debugLine="DialogReqType.Add( \"Checklist\" )";
__ref._dialogreqtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Checklist");
RDebugUtils.currentLine=75235354;
 //BA.debugLineNum = 75235354;BA.debugLine="DialogReqType.Add( \"Tarefas\" )";
__ref._dialogreqtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Tarefas");
RDebugUtils.currentLine=75235356;
 //BA.debugLineNum = 75235356;BA.debugLine="DialogReqStatus.DropdownBackgroundColor = Consts";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75235357;
 //BA.debugLineNum = 75235357;BA.debugLine="DialogReqStatus.Add( \"(Todos)\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75235358;
 //BA.debugLineNum = 75235358;BA.debugLine="DialogReqStatus.Add( \"Activos\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Activos");
RDebugUtils.currentLine=75235359;
 //BA.debugLineNum = 75235359;BA.debugLine="DialogReqStatus.Add( \"Inactivos\" )";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Inactivos");
RDebugUtils.currentLine=75235361;
 //BA.debugLineNum = 75235361;BA.debugLine="DialogReqUpdated.DropdownBackgroundColor = Const";
__ref._dialogrequpdated /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=75235362;
 //BA.debugLineNum = 75235362;BA.debugLine="DialogReqUpdated.Add( \"(Todos)\" )";
__ref._dialogrequpdated /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("(Todos)");
RDebugUtils.currentLine=75235363;
 //BA.debugLineNum = 75235363;BA.debugLine="DialogReqUpdated.Add( \"Actualizados\" )";
__ref._dialogrequpdated /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Actualizados");
RDebugUtils.currentLine=75235364;
 //BA.debugLineNum = 75235364;BA.debugLine="DialogReqUpdated.Add( \"Por actualizar\" )";
__ref._dialogrequpdated /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Por actualizar");
RDebugUtils.currentLine=75235366;
 //BA.debugLineNum = 75235366;BA.debugLine="DialogReqType.SelectedIndex = curr.TypeTask";
__ref._dialogreqtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.TypeTask /*int*/ );
RDebugUtils.currentLine=75235367;
 //BA.debugLineNum = 75235367;BA.debugLine="DialogReqStatus.SelectedIndex = curr.Status";
__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Status /*int*/ );
RDebugUtils.currentLine=75235368;
 //BA.debugLineNum = 75235368;BA.debugLine="DialogReqUpdated.SelectedIndex = curr.Updated";
__ref._dialogrequpdated /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_curr.Updated /*int*/ );
RDebugUtils.currentLine=75235369;
 //BA.debugLineNum = 75235369;BA.debugLine="Dim wchk As Boolean = True";
_wchk = parent.__c.True;
RDebugUtils.currentLine=75235370;
 //BA.debugLineNum = 75235370;BA.debugLine="If curr.WithRequests = 0 Then wchk = False";
if (true) break;

case 14:
//if
this.state = 19;
if (_curr.WithRequests /*int*/ ==0) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_wchk = parent.__c.False;
if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=75235371;
 //BA.debugLineNum = 75235371;BA.debugLine="DialogReqWithRequests.Checked = wchk";
__ref._dialogreqwithrequests /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(_wchk);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=75235376;
 //BA.debugLineNum = 75235376;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "gettaskfiltersdialog"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 21;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=75235377;
 //BA.debugLineNum = 75235377;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 21:
//if
this.state = 38;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 23;
}else 
{RDebugUtils.currentLine=75235392;
 //BA.debugLineNum = 75235392;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 37;
}}
if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=75235378;
 //BA.debugLineNum = 75235378;BA.debugLine="If tabposis = 0 Then";
if (true) break;

case 24:
//if
this.state = 35;
if (_tabposis==0) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 35;
RDebugUtils.currentLine=75235379;
 //BA.debugLineNum = 75235379;BA.debugLine="ShareCode.TaskTPRActive = TBActive.Checked";
parent._sharecode._tasktpractive /*boolean*/  = __ref._tbactive /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=75235380;
 //BA.debugLineNum = 75235380;BA.debugLine="ShareCode.TaskTPRInactive = TBInactive.Checked";
parent._sharecode._tasktprinactive /*boolean*/  = __ref._tbinactive /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=75235381;
 //BA.debugLineNum = 75235381;BA.debugLine="ShareCode.TaskTPRSingular = TBSingular.Checked";
parent._sharecode._tasktprsingular /*boolean*/  = __ref._tbsingular /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=75235382;
 //BA.debugLineNum = 75235382;BA.debugLine="ShareCode.TaskTPRPlural = TBPlural.Checked";
parent._sharecode._tasktprplural /*boolean*/  = __ref._tbplural /*anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper*/ .getChecked();
RDebugUtils.currentLine=75235384;
 //BA.debugLineNum = 75235384;BA.debugLine="Dim SetTheFilters As TaskFilter =  Types.MakeTa";
_setthefilters = parent._types._maketaskfilter /*xevolution.vrcg.devdemov2400.types._taskfilter*/ (ba,(int) (0),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=75235385;
 //BA.debugLineNum = 75235385;BA.debugLine="CallSub2(TasksCL2, \"SetTheFilters\", SetTheFilte";
parent.__c.CallSubDebug2(ba,(Object)(parent._taskscl2.getObject()),"SetTheFilters",(Object)(_setthefilters));
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=75235387;
 //BA.debugLineNum = 75235387;BA.debugLine="Dim WReq As Int = 0";
_wreq = (int) (0);
RDebugUtils.currentLine=75235388;
 //BA.debugLineNum = 75235388;BA.debugLine="If (DialogReqWithRequests.Checked) Then WReq =";
if (true) break;

case 29:
//if
this.state = 34;
if ((__ref._dialogreqwithrequests /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked())) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_wreq = (int) (1);
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=75235389;
 //BA.debugLineNum = 75235389;BA.debugLine="Dim SetTheFilters As TaskFilter =  Types.MakeTa";
_setthefilters = parent._types._maketaskfilter /*xevolution.vrcg.devdemov2400.types._taskfilter*/ (ba,__ref._dialogreqtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogreqstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),__ref._dialogrequpdated /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),_wreq,(int) (0));
RDebugUtils.currentLine=75235390;
 //BA.debugLineNum = 75235390;BA.debugLine="CallSub2(TasksCL2, \"SetTheFilters\", SetTheFilte";
parent.__c.CallSubDebug2(ba,(Object)(parent._taskscl2.getObject()),"SetTheFilters",(Object)(_setthefilters));
 if (true) break;

case 35:
//C
this.state = 38;
;
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=75235393;
 //BA.debugLineNum = 75235393;BA.debugLine="CallSub2(TasksCL2, \"CancelAllFilters\", True)";
parent.__c.CallSubDebug2(ba,(Object)(parent._taskscl2.getObject()),"CancelAllFilters",(Object)(parent.__c.True));
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=75235395;
 //BA.debugLineNum = 75235395;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getuserquantitydialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,String _code,int _qtd) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getuserquantitydialog", false))
	 {Debug.delegate(ba, "getuserquantitydialog", new Object[] {_activ,_code,_qtd}); return;}
ResumableSub_GetUserQuantityDialog rsub = new ResumableSub_GetUserQuantityDialog(this,__ref,_activ,_code,_qtd);
rsub.resume(ba, null);
}
public static class ResumableSub_GetUserQuantityDialog extends BA.ResumableSub {
public ResumableSub_GetUserQuantityDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,String _code,int _qtd) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._code = _code;
this._qtd = _qtd;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
String _code;
int _qtd;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=77660161;
 //BA.debugLineNum = 77660161;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Quantida";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Quantidade de produto/peça","Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=77660163;
 //BA.debugLineNum = 77660163;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=77660164;
 //BA.debugLineNum = 77660164;BA.debugLine="ApplDialog.SetSize(60%x, 300dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (60),ba),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=77660165;
 //BA.debugLineNum = 77660165;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getuserquantitydialog"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=77660166;
 //BA.debugLineNum = 77660166;BA.debugLine="pnl.LoadLayout(\"dialog_quantity_device_2\")";
_pnl.LoadLayout("dialog_quantity_device_2",ba);
RDebugUtils.currentLine=77660167;
 //BA.debugLineNum = 77660167;BA.debugLine="DialogQuantityValue.EditText.InputType = DialogQu";
__ref._dialogquantityvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().setInputType(__ref._dialogquantityvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=77660168;
 //BA.debugLineNum = 77660168;BA.debugLine="DialogQuantityValue.EditText.Text = qtd";
__ref._dialogquantityvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().setText(BA.ObjectToCharSequence(_qtd));
RDebugUtils.currentLine=77660171;
 //BA.debugLineNum = 77660171;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getuserquantitydialog"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=77660173;
 //BA.debugLineNum = 77660173;BA.debugLine="DialogQuantityValue.EditText.Enabled = False";
__ref._dialogquantityvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().setEnabled(parent.__c.False);
RDebugUtils.currentLine=77660174;
 //BA.debugLineNum = 77660174;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=77660175;
 //BA.debugLineNum = 77660175;BA.debugLine="ReturnQuantityValue = DialogQuantityValue.Text";
__ref._returnquantityvalue /*int*/  = (int)(Double.parseDouble(__ref._dialogquantityvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()));
RDebugUtils.currentLine=77660176;
 //BA.debugLineNum = 77660176;BA.debugLine="CallSub3(activ, \"QuantityDialogReturn\", code, Re";
parent.__c.CallSubDebug3(ba,_activ,"QuantityDialogReturn",(Object)(_code),(Object)(__ref._returnquantityvalue /*int*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=77660179;
 //BA.debugLineNum = 77660179;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getuserregistomanualjornada(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.collections.List _reasons,anywheresoftware.b4a.objects.collections.List _causes,int _tipodialogo) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getuserregistomanualjornada", false))
	 {Debug.delegate(ba, "getuserregistomanualjornada", new Object[] {_activ,_reasons,_causes,_tipodialogo}); return;}
ResumableSub_getuserRegistoManualJornada rsub = new ResumableSub_getuserRegistoManualJornada(this,__ref,_activ,_reasons,_causes,_tipodialogo);
rsub.resume(ba, null);
}
public static class ResumableSub_getuserRegistoManualJornada extends BA.ResumableSub {
public ResumableSub_getuserRegistoManualJornada(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.collections.List _reasons,anywheresoftware.b4a.objects.collections.List _causes,int _tipodialogo) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._reasons = _reasons;
this._causes = _causes;
this._tipodialogo = _tipodialogo;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
anywheresoftware.b4a.objects.collections.List _reasons;
anywheresoftware.b4a.objects.collections.List _causes;
int _tipodialogo;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _res = 0;
int step12;
int limit12;
int step16;
int limit16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=77201410;
 //BA.debugLineNum = 77201410;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Registo";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Registo Manual de Jornada","Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=77201412;
 //BA.debugLineNum = 77201412;BA.debugLine="Log(TipoDialogo)";
parent.__c.LogImpl("677201412",BA.NumberToString(_tipodialogo),0);
RDebugUtils.currentLine=77201414;
 //BA.debugLineNum = 77201414;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=77201415;
 //BA.debugLineNum = 77201415;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=77201416;
 //BA.debugLineNum = 77201416;BA.debugLine="ApplDialog.SetSize(1000dip, 750dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (1000)),parent.__c.DipToCurrent((int) (750)));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=77201418;
 //BA.debugLineNum = 77201418;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (95),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=77201420;
 //BA.debugLineNum = 77201420;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getuserregistomanualjornada"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=77201421;
 //BA.debugLineNum = 77201421;BA.debugLine="pnl.LoadLayout(\"dialog_registo_manual_jornada\")";
_pnl.LoadLayout("dialog_registo_manual_jornada",ba);
RDebugUtils.currentLine=77201423;
 //BA.debugLineNum = 77201423;BA.debugLine="DialogReqCauseRMJ.DropdownBackgroundColor = Const";
__ref._dialogreqcausermj /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77201424;
 //BA.debugLineNum = 77201424;BA.debugLine="For i = 0 To causes.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step12 = 1;
limit12 = (int) (_causes.getSize()-1);
_i = (int) (0) ;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 10;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 9;
if (true) break;

case 23:
//C
this.state = 22;
_i = ((int)(0 + _i + step12)) ;
if (true) break;

case 9:
//C
this.state = 23;
RDebugUtils.currentLine=77201425;
 //BA.debugLineNum = 77201425;BA.debugLine="DialogReqCauseRMJ.Add( causes.Get(i) )";
__ref._dialogreqcausermj /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_causes.Get(_i)));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=77201428;
 //BA.debugLineNum = 77201428;BA.debugLine="DialogReqReasonRMJ.DropdownBackgroundColor = Cons";
__ref._dialogreqreasonrmj /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77201429;
 //BA.debugLineNum = 77201429;BA.debugLine="For i = 0 To reasons.Size-1";
if (true) break;

case 11:
//for
this.state = 14;
step16 = 1;
limit16 = (int) (_reasons.getSize()-1);
_i = (int) (0) ;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 14;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 13;
if (true) break;

case 25:
//C
this.state = 24;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 13:
//C
this.state = 25;
RDebugUtils.currentLine=77201430;
 //BA.debugLineNum = 77201430;BA.debugLine="DialogReqReasonRMJ.Add( reasons.Get(i) )";
__ref._dialogreqreasonrmj /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_reasons.Get(_i)));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=77201433;
 //BA.debugLineNum = 77201433;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
parent.__c.DateTime.setDateFormat(parent._consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=77201435;
 //BA.debugLineNum = 77201435;BA.debugLine="DialogReqDateRMJ.text = DateTime.Date(DateTime.No";
__ref._dialogreqdatermj /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Date(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77201436;
 //BA.debugLineNum = 77201436;BA.debugLine="DialogReqTimeRMJ.text = DateTime.Time(DateTime.No";
__ref._dialogreqtimermj /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Time(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77201438;
 //BA.debugLineNum = 77201438;BA.debugLine="DialogReqStartDate.text = DateTime.Date(DateTime.";
__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Date(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77201439;
 //BA.debugLineNum = 77201439;BA.debugLine="DialogReqEndDate.text = DateTime.Date(DateTime.No";
__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Date(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77201441;
 //BA.debugLineNum = 77201441;BA.debugLine="DialogReqStartTime.text = DateTime.Time(DateTime.";
__ref._dialogreqstarttime /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Time(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77201442;
 //BA.debugLineNum = 77201442;BA.debugLine="DialogReqEndTime.text = DateTime.Time(DateTime.No";
__ref._dialogreqendtime /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Time(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77201444;
 //BA.debugLineNum = 77201444;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getuserregistomanualjornada"), _sf);
this.state = 26;
return;
case 26:
//C
this.state = 15;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=77201445;
 //BA.debugLineNum = 77201445;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=77201446;
 //BA.debugLineNum = 77201446;BA.debugLine="CallSub2(activ, \"MakeUnavailable2\", Types.MakeUn";
parent.__c.CallSubDebug2(ba,_activ,"MakeUnavailable2",(Object)(parent._types._makeunavailable2 /*xevolution.vrcg.devdemov2400.types._unavailable2*/ (ba,__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqreasonrmj /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._dialogreqreasonrmj /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()),__ref._dialogreqcausermj /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._dialogreqcausermj /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()))));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=77201449;
 //BA.debugLineNum = 77201449;BA.debugLine="CallSub(activ, \"CancelUnavailable\")";
parent.__c.CallSubDebug(ba,_activ,"CancelUnavailable");
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=77201451;
 //BA.debugLineNum = 77201451;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getuserunavailabledialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.collections.List _durations,anywheresoftware.b4a.objects.collections.List _reasons) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getuserunavailabledialog", false))
	 {Debug.delegate(ba, "getuserunavailabledialog", new Object[] {_activ,_durations,_reasons}); return;}
ResumableSub_getUserUnavailableDialog rsub = new ResumableSub_getUserUnavailableDialog(this,__ref,_activ,_durations,_reasons);
rsub.resume(ba, null);
}
public static class ResumableSub_getUserUnavailableDialog extends BA.ResumableSub {
public ResumableSub_getUserUnavailableDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,anywheresoftware.b4a.objects.collections.List _durations,anywheresoftware.b4a.objects.collections.List _reasons) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._durations = _durations;
this._reasons = _reasons;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
anywheresoftware.b4a.objects.collections.List _durations;
anywheresoftware.b4a.objects.collections.List _reasons;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _res = 0;
int step11;
int limit11;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=77398017;
 //BA.debugLineNum = 77398017;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Indispon";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Indisponibilidade","Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=77398019;
 //BA.debugLineNum = 77398019;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=77398020;
 //BA.debugLineNum = 77398020;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=77398021;
 //BA.debugLineNum = 77398021;BA.debugLine="ApplDialog.SetSize(1000dip, 430dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (1000)),parent.__c.DipToCurrent((int) (430)));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=77398023;
 //BA.debugLineNum = 77398023;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (95),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=77398025;
 //BA.debugLineNum = 77398025;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getuserunavailabledialog"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=77398026;
 //BA.debugLineNum = 77398026;BA.debugLine="pnl.LoadLayout(\"dialog_userUnavailable\") '_device";
_pnl.LoadLayout("dialog_userUnavailable",ba);
RDebugUtils.currentLine=77398028;
 //BA.debugLineNum = 77398028;BA.debugLine="DialogReqType.DropdownBackgroundColor = Consts.Co";
__ref._dialogreqtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77398029;
 //BA.debugLineNum = 77398029;BA.debugLine="For i = 0 To durations.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step11 = 1;
limit11 = (int) (_durations.getSize()-1);
_i = (int) (0) ;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 10;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 9;
if (true) break;

case 23:
//C
this.state = 22;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 9:
//C
this.state = 23;
RDebugUtils.currentLine=77398030;
 //BA.debugLineNum = 77398030;BA.debugLine="DialogReqType.Add( durations.Get(i) )";
__ref._dialogreqtype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_durations.Get(_i)));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=77398032;
 //BA.debugLineNum = 77398032;BA.debugLine="DialogReqReason.DropdownBackgroundColor = Consts.";
__ref._dialogreqreason /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=77398033;
 //BA.debugLineNum = 77398033;BA.debugLine="For i = 0 To reasons.Size-1";
if (true) break;

case 11:
//for
this.state = 14;
step15 = 1;
limit15 = (int) (_reasons.getSize()-1);
_i = (int) (0) ;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 14;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 13;
if (true) break;

case 25:
//C
this.state = 24;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 13:
//C
this.state = 25;
RDebugUtils.currentLine=77398034;
 //BA.debugLineNum = 77398034;BA.debugLine="DialogReqReason.Add( reasons.Get(i) )";
__ref._dialogreqreason /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_reasons.Get(_i)));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=77398037;
 //BA.debugLineNum = 77398037;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
parent.__c.DateTime.setDateFormat(parent._consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=77398038;
 //BA.debugLineNum = 77398038;BA.debugLine="DialogReqStartDate.text = DateTime.Date(DateTime.";
__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Date(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77398039;
 //BA.debugLineNum = 77398039;BA.debugLine="DialogReqEndDate.text = DateTime.Date(DateTime.No";
__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Date(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77398041;
 //BA.debugLineNum = 77398041;BA.debugLine="DialogReqStartTime.text = DateTime.Time(DateTime.";
__ref._dialogreqstarttime /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Time(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77398042;
 //BA.debugLineNum = 77398042;BA.debugLine="DialogReqEndTime.text = DateTime.Time(DateTime.No";
__ref._dialogreqendtime /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(parent.__c.DateTime.Time(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=77398044;
 //BA.debugLineNum = 77398044;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getuserunavailabledialog"), _sf);
this.state = 26;
return;
case 26:
//C
this.state = 15;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=77398045;
 //BA.debugLineNum = 77398045;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=77398046;
 //BA.debugLineNum = 77398046;BA.debugLine="CallSub2(activ, \"MakeUnavailable\", _ 				Types.M";
parent.__c.CallSubDebug2(ba,_activ,"MakeUnavailable",(Object)(parent._types._makeunavailable /*xevolution.vrcg.devdemov2400.types._unavailable*/ (ba,__ref._dialogreqstartdate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqenddate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dialogreqreason /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._dialogreqreason /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()))));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=77398050;
 //BA.debugLineNum = 77398050;BA.debugLine="CallSub(activ, \"CancelUnavailable\")";
parent.__c.CallSubDebug(ba,_activ,"CancelUnavailable");
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=77398053;
 //BA.debugLineNum = 77398053;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getvehicleslistdialog(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.sql.SQL.CursorWrapper _items) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "getvehicleslistdialog", false))
	 {Debug.delegate(ba, "getvehicleslistdialog", new Object[] {_activ,_activname,_title,_items}); return;}
ResumableSub_getVehiclesListDialog rsub = new ResumableSub_getVehiclesListDialog(this,__ref,_activ,_activname,_title,_items);
rsub.resume(ba, null);
}
public static class ResumableSub_getVehiclesListDialog extends BA.ResumableSub {
public ResumableSub_getVehiclesListDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activname,String _title,anywheresoftware.b4a.sql.SQL.CursorWrapper _items) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._items = _items;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activname;
String _title;
anywheresoftware.b4a.sql.SQL.CursorWrapper _items;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _row = 0;
String _vehiclename = "";
String _tagcode = "";
int _res = 0;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=76087297;
 //BA.debugLineNum = 76087297;BA.debugLine="ThisActivity = activ";
__ref._thisactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=76087298;
 //BA.debugLineNum = 76087298;BA.debugLine="ThisActivityName = activName";
__ref._thisactivityname /*Object*/  = _activname;
RDebugUtils.currentLine=76087301;
 //BA.debugLineNum = 76087301;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=76087303;
 //BA.debugLineNum = 76087303;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=76087304;
 //BA.debugLineNum = 76087304;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=76087305;
 //BA.debugLineNum = 76087305;BA.debugLine="ApplDialog.SetSize(80%x, 80%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (80),ba),parent.__c.PerYToCurrent((float) (80),ba));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=76087307;
 //BA.debugLineNum = 76087307;BA.debugLine="CurrentCLD = ApplDialog 'sf";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=76087308;
 //BA.debugLineNum = 76087308;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getvehicleslistdialog"), null);
this.state = 15;
return;
case 15:
//C
this.state = 5;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=76087309;
 //BA.debugLineNum = 76087309;BA.debugLine="DialogPanel.LoadLayout(\"dialog_vehiclesListltems\"";
_dialogpanel.LoadLayout("dialog_vehiclesListltems",ba);
RDebugUtils.currentLine=76087310;
 //BA.debugLineNum = 76087310;BA.debugLine="For Row = 0 To items.RowCount-1";
if (true) break;

case 5:
//for
this.state = 8;
step11 = 1;
limit11 = (int) (_items.getRowCount()-1);
_row = (int) (0) ;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 8;
if ((step11 > 0 && _row <= limit11) || (step11 < 0 && _row >= limit11)) this.state = 7;
if (true) break;

case 17:
//C
this.state = 16;
_row = ((int)(0 + _row + step11)) ;
if (true) break;

case 7:
//C
this.state = 17;
RDebugUtils.currentLine=76087311;
 //BA.debugLineNum = 76087311;BA.debugLine="items.Position = Row";
_items.setPosition(_row);
RDebugUtils.currentLine=76087313;
 //BA.debugLineNum = 76087313;BA.debugLine="Dim VehicleName As String = items.GetString(\"tit";
_vehiclename = _items.GetString("title_import");
RDebugUtils.currentLine=76087314;
 //BA.debugLineNum = 76087314;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcode";
_tagcode = _items.GetString("tagcode");
RDebugUtils.currentLine=76087315;
 //BA.debugLineNum = 76087315;BA.debugLine="VIDialog.Add(createVehicleItem(activ, VehicleNam";
__ref._vidialog /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createvehicleitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_activ,_vehiclename,parent.__c.DipToCurrent((int) (50)),_tagcode).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=76087318;
 //BA.debugLineNum = 76087318;BA.debugLine="items.close";
_items.Close();
RDebugUtils.currentLine=76087321;
 //BA.debugLineNum = 76087321;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "getvehicleslistdialog"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=76087322;
 //BA.debugLineNum = 76087322;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=76087329;
 //BA.debugLineNum = 76087329;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _label2search1_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "label2search1_click", false))
	 {return ((String) Debug.delegate(ba, "label2search1_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _textbox = null;
RDebugUtils.currentLine=77070336;
 //BA.debugLineNum = 77070336;BA.debugLine="Sub label2search1_click";
RDebugUtils.currentLine=77070337;
 //BA.debugLineNum = 77070337;BA.debugLine="Dim TextBox As B4XView = Sender";
_textbox = new anywheresoftware.b4a.objects.B4XViewWrapper();
_textbox = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=77070338;
 //BA.debugLineNum = 77070338;BA.debugLine="lblSearchChoosenItem.Text = TextBox.Text";
__ref._lblsearchchoosenitem /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_textbox.getText()));
RDebugUtils.currentLine=77070339;
 //BA.debugLineNum = 77070339;BA.debugLine="ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = lblSear";
_sharecode._item_returned_from_searchlist /*String*/  = __ref._lblsearchchoosenitem /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=77070340;
 //BA.debugLineNum = 77070340;BA.debugLine="ShareCode.TAG_RETURNED_FROM_SEARCHLIST = TextBox.";
_sharecode._tag_returned_from_searchlist /*String*/  = BA.ObjectToString(_textbox.getTag());
RDebugUtils.currentLine=77070341;
 //BA.debugLineNum = 77070341;BA.debugLine="End Sub";
return "";
}
public String  _leftpreviewimage_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "leftpreviewimage_click", false))
	 {return ((String) Debug.delegate(ba, "leftpreviewimage_click", null));}
xevolution.vrcg.devdemov2400.types._imageviewdata _currentimage = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bg = null;
RDebugUtils.currentLine=73072640;
 //BA.debugLineNum = 73072640;BA.debugLine="Sub leftPreviewImage_Click";
RDebugUtils.currentLine=73072641;
 //BA.debugLineNum = 73072641;BA.debugLine="If (CurrentPosition > 0) Then";
if ((__ref._currentposition /*int*/ >0)) { 
RDebugUtils.currentLine=73072642;
 //BA.debugLineNum = 73072642;BA.debugLine="CurrentPosition = CurrentPosition -1";
__ref._currentposition /*int*/  = (int) (__ref._currentposition /*int*/ -1);
RDebugUtils.currentLine=73072643;
 //BA.debugLineNum = 73072643;BA.debugLine="Dim CurrentImage As ImageViewData = CurrentImage";
_currentimage = (xevolution.vrcg.devdemov2400.types._imageviewdata)(__ref._currentimagesview /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentposition /*int*/ ));
RDebugUtils.currentLine=73072645;
 //BA.debugLineNum = 73072645;BA.debugLine="If Utils.NNE(CurrentImage.b64) Then";
if (_utils._nne /*boolean*/ (ba,_currentimage.b64 /*String*/ )) { 
RDebugUtils.currentLine=73072646;
 //BA.debugLineNum = 73072646;BA.debugLine="ShowImageView.SetBackgroundImage(Utils.B64ToBit";
__ref._showimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (ba,_currentimage.b64 /*String*/ ).getObject()));
 }else 
{RDebugUtils.currentLine=73072647;
 //BA.debugLineNum = 73072647;BA.debugLine="Else if Utils.NNE(CurrentImage.filename) Then";
if (_utils._nne /*boolean*/ (ba,_currentimage.filename /*String*/ )) { 
RDebugUtils.currentLine=73072648;
 //BA.debugLineNum = 73072648;BA.debugLine="Dim bg As Bitmap = LoadBitmapResize(Starter.Int";
_bg = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bg = __c.LoadBitmapResize(_starter._internalfolder /*String*/ ,_currentimage.filename /*String*/ ,__c.DipToCurrent((int) (780)),__c.DipToCurrent((int) (620)),__c.True);
RDebugUtils.currentLine=73072649;
 //BA.debugLineNum = 73072649;BA.debugLine="ShowImageView.SetBackgroundImage(bg)";
__ref._showimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_bg.getObject()));
 }else {
RDebugUtils.currentLine=73072651;
 //BA.debugLineNum = 73072651;BA.debugLine="CurrentPosition = CurrentPosition +1";
__ref._currentposition /*int*/  = (int) (__ref._currentposition /*int*/ +1);
 }}
;
 };
RDebugUtils.currentLine=73072654;
 //BA.debugLineNum = 73072654;BA.debugLine="End Sub";
return "";
}
public String  _lista2search_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "lista2search_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lista2search_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=76873728;
 //BA.debugLineNum = 76873728;BA.debugLine="Sub Lista2Search_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=76873729;
 //BA.debugLineNum = 76873729;BA.debugLine="lblSearchChoosenItem.Text = Value";
__ref._lblsearchchoosenitem /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=76873730;
 //BA.debugLineNum = 76873730;BA.debugLine="End Sub";
return "";
}
public String  _lista2search_reachend(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "lista2search_reachend", false))
	 {return ((String) Debug.delegate(ba, "lista2search_reachend", null));}
String _passscriptwithlimit = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _records2search = null;
String _listline_key = "";
int _i = 0;
RDebugUtils.currentLine=76742656;
 //BA.debugLineNum = 76742656;BA.debugLine="Sub Lista2Search_ReachEnd";
RDebugUtils.currentLine=76742658;
 //BA.debugLineNum = 76742658;BA.debugLine="Dim PassScriptwithLimit As String = \"\"";
_passscriptwithlimit = "";
RDebugUtils.currentLine=76742659;
 //BA.debugLineNum = 76742659;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(_sharecode._generalwaitplease /*String*/ ),__c.False);
RDebugUtils.currentLine=76742660;
 //BA.debugLineNum = 76742660;BA.debugLine="If Utils.NNE(ShareCode.CurrentSerchquery) Then";
if (_utils._nne /*boolean*/ (ba,_sharecode._currentserchquery /*String*/ )) { 
RDebugUtils.currentLine=76742661;
 //BA.debugLineNum = 76742661;BA.debugLine="NextStartingRow = NextStartingRow + 25";
__ref._nextstartingrow /*int*/  = (int) (__ref._nextstartingrow /*int*/ +25);
RDebugUtils.currentLine=76742662;
 //BA.debugLineNum = 76742662;BA.debugLine="PassScriptwithLimit = ShareCode.CurrentSerchquer";
_passscriptwithlimit = _sharecode._currentserchquery /*String*/ +(" limit 25 offset "+__c.SmartStringFormatter("",(Object)(__ref._nextstartingrow /*int*/ ))+"");
RDebugUtils.currentLine=76742666;
 //BA.debugLineNum = 76742666;BA.debugLine="Private Records2Search As ResultSet = Starter.Lo";
_records2search = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_records2search = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_passscriptwithlimit)));
RDebugUtils.currentLine=76742667;
 //BA.debugLineNum = 76742667;BA.debugLine="Dim ListLine_key As String = \"\"";
_listline_key = "";
RDebugUtils.currentLine=76742669;
 //BA.debugLineNum = 76742669;BA.debugLine="If Records2Search.RowCount > 0 Then";
if (_records2search.getRowCount()>0) { 
RDebugUtils.currentLine=76742670;
 //BA.debugLineNum = 76742670;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease";
__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(_sharecode._generalwaitplease /*String*/ ),__c.False);
RDebugUtils.currentLine=76742672;
 //BA.debugLineNum = 76742672;BA.debugLine="Do While Records2Search.NextRow";
while (_records2search.NextRow()) {
RDebugUtils.currentLine=76742673;
 //BA.debugLineNum = 76742673;BA.debugLine="For i=0 To Records2Search.ColumnCount -1";
{
final int step11 = 1;
final int limit11 = (int) (_records2search.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=76742674;
 //BA.debugLineNum = 76742674;BA.debugLine="If Records2Search.GetColumnName(i).ToLowerCas";
if ((_records2search.GetColumnName(_i).toLowerCase()).equals("tagcode")) { 
RDebugUtils.currentLine=76742675;
 //BA.debugLineNum = 76742675;BA.debugLine="ListLine_key =  Records2Search.GetString(Rec";
_listline_key = _records2search.GetString(_records2search.GetColumnName(_i));
 };
 }
};
RDebugUtils.currentLine=76742678;
 //BA.debugLineNum = 76742678;BA.debugLine="Lista2Search.Add(createSearchLineDetail(Passed";
__ref._lista2search /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createsearchlinedetail /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,__ref._passedact /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,_records2search,__c.DipToCurrent((int) (50))).getObject())),(Object)(_listline_key));
 }
;
 };
RDebugUtils.currentLine=76742681;
 //BA.debugLineNum = 76742681;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=76742682;
 //BA.debugLineNum = 76742682;BA.debugLine="Records2Search.Close";
_records2search.Close();
 };
RDebugUtils.currentLine=76742684;
 //BA.debugLineNum = 76742684;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=76742686;
 //BA.debugLineNum = 76742686;BA.debugLine="End Sub";
return "";
}
public String  _lista2search_visiblerangechanged(xevolution.vrcg.devdemov2400.appdialogs __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "lista2search_visiblerangechanged", false))
	 {return ((String) Debug.delegate(ba, "lista2search_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
RDebugUtils.currentLine=76808192;
 //BA.debugLineNum = 76808192;BA.debugLine="Sub Lista2Search_VisibleRangeChanged (FirstIndex A";
RDebugUtils.currentLine=76808194;
 //BA.debugLineNum = 76808194;BA.debugLine="End Sub";
return "";
}
public String  _listitemslist_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "listitemslist_itemclick", false))
	 {return ((String) Debug.delegate(ba, "listitemslist_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
boolean _valid = false;
RDebugUtils.currentLine=73400320;
 //BA.debugLineNum = 73400320;BA.debugLine="Sub ListItemsList_ItemClick (Index As Int, Value A";
RDebugUtils.currentLine=73400321;
 //BA.debugLineNum = 73400321;BA.debugLine="ListItemsListClearSelection";
__ref._listitemslistclearselection /*String*/ (null);
RDebugUtils.currentLine=73400322;
 //BA.debugLineNum = 73400322;BA.debugLine="Dim pan As B4XView = ListItemsList.GetPanel(Index";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = __ref._listitemslist /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=73400324;
 //BA.debugLineNum = 73400324;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=73400325;
 //BA.debugLineNum = 73400325;BA.debugLine="lbl.Color = 0x9637FF4B";
_lbl.setColor((int) (0x9637ff4b));
RDebugUtils.currentLine=73400326;
 //BA.debugLineNum = 73400326;BA.debugLine="HiddenListItemLabel = lbl.Tag";
__ref._hiddenlistitemlabel /*Object*/  = _lbl.getTag();
RDebugUtils.currentLine=73400327;
 //BA.debugLineNum = 73400327;BA.debugLine="Dim valid As Boolean = Utils.NNE(HiddenListItemLa";
_valid = _utils._nne /*boolean*/ (ba,BA.ObjectToString(__ref._hiddenlistitemlabel /*Object*/ ));
RDebugUtils.currentLine=73400328;
 //BA.debugLineNum = 73400328;BA.debugLine="HiddenListItemTagList = Types.MakeTagListType(lbl";
__ref._hiddenlistitemtaglist /*xevolution.vrcg.devdemov2400.types._taglisttype*/  = _types._maketaglisttype /*xevolution.vrcg.devdemov2400.types._taglisttype*/ (ba,BA.ObjectToString(_lbl.getTag()),_lbl.getText(),"");
RDebugUtils.currentLine=73400333;
 //BA.debugLineNum = 73400333;BA.debugLine="End Sub";
return "";
}
public String  _listitemslistclearselection(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "listitemslistclearselection", false))
	 {return ((String) Debug.delegate(ba, "listitemslistclearselection", null));}
int _n = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=73269248;
 //BA.debugLineNum = 73269248;BA.debugLine="Sub ListItemsListClearSelection";
RDebugUtils.currentLine=73269249;
 //BA.debugLineNum = 73269249;BA.debugLine="For n=0 To ListItemsList.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._listitemslist /*b4a.example3.customlistview*/ ._getsize()-1);
_n = (int) (0) ;
for (;_n <= limit1 ;_n = _n + step1 ) {
RDebugUtils.currentLine=73269250;
 //BA.debugLineNum = 73269250;BA.debugLine="Dim pan As B4XView = ListItemsList.GetPanel(n)";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = __ref._listitemslist /*b4a.example3.customlistview*/ ._getpanel(_n);
RDebugUtils.currentLine=73269251;
 //BA.debugLineNum = 73269251;BA.debugLine="If Utils.NNE(pan.tag) Then";
if (_utils._nne /*boolean*/ (ba,BA.ObjectToString(_pan.getTag()))) { 
RDebugUtils.currentLine=73269252;
 //BA.debugLineNum = 73269252;BA.debugLine="pan.Color = 0xFFFFFFFF";
_pan.setColor((int) (0xffffffff));
RDebugUtils.currentLine=73269253;
 //BA.debugLineNum = 73269253;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=73269254;
 //BA.debugLineNum = 73269254;BA.debugLine="lbl.Color = 0xFFFFFFFF";
_lbl.setColor((int) (0xffffffff));
 };
 }
};
RDebugUtils.currentLine=73269257;
 //BA.debugLineNum = 73269257;BA.debugLine="End Sub";
return "";
}
public String  _listitemslistchk_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "listitemslistchk_itemclick", false))
	 {return ((String) Debug.delegate(ba, "listitemslistchk_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
boolean _valid = false;
RDebugUtils.currentLine=79626240;
 //BA.debugLineNum = 79626240;BA.debugLine="Sub ListItemsListChk_ItemClick (Index As Int, Valu";
RDebugUtils.currentLine=79626241;
 //BA.debugLineNum = 79626241;BA.debugLine="ListItemsListChkClearSelection";
__ref._listitemslistchkclearselection /*String*/ (null);
RDebugUtils.currentLine=79626242;
 //BA.debugLineNum = 79626242;BA.debugLine="Dim pan As B4XView = ListItemsListChk.GetPanel(In";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = __ref._listitemslistchk /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=79626244;
 //BA.debugLineNum = 79626244;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=79626245;
 //BA.debugLineNum = 79626245;BA.debugLine="lbl.Color = 0x9637FF4B";
_lbl.setColor((int) (0x9637ff4b));
RDebugUtils.currentLine=79626246;
 //BA.debugLineNum = 79626246;BA.debugLine="HiddenListItemLabel = lbl.Tag";
__ref._hiddenlistitemlabel /*Object*/  = _lbl.getTag();
RDebugUtils.currentLine=79626247;
 //BA.debugLineNum = 79626247;BA.debugLine="Dim valid As Boolean = Utils.NNE(HiddenListItemLa";
_valid = _utils._nne /*boolean*/ (ba,BA.ObjectToString(__ref._hiddenlistitemlabel /*Object*/ ));
RDebugUtils.currentLine=79626248;
 //BA.debugLineNum = 79626248;BA.debugLine="HiddenListItemTagList = Types.MakeTagListType(lbl";
__ref._hiddenlistitemtaglist /*xevolution.vrcg.devdemov2400.types._taglisttype*/  = _types._maketaglisttype /*xevolution.vrcg.devdemov2400.types._taglisttype*/ (ba,BA.ObjectToString(_lbl.getTag()),_lbl.getText(),"");
RDebugUtils.currentLine=79626249;
 //BA.debugLineNum = 79626249;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).En";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(__c.DialogResponse.POSITIVE).setEnabled(_valid);
RDebugUtils.currentLine=79626250;
 //BA.debugLineNum = 79626250;BA.debugLine="End Sub";
return "";
}
public String  _listitemslistchkclearselection(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "listitemslistchkclearselection", false))
	 {return ((String) Debug.delegate(ba, "listitemslistchkclearselection", null));}
int _n = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=73334784;
 //BA.debugLineNum = 73334784;BA.debugLine="Sub ListItemsListChkClearSelection";
RDebugUtils.currentLine=73334785;
 //BA.debugLineNum = 73334785;BA.debugLine="For n=0 To ListItemsListChk.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._listitemslistchk /*b4a.example3.customlistview*/ ._getsize()-1);
_n = (int) (0) ;
for (;_n <= limit1 ;_n = _n + step1 ) {
RDebugUtils.currentLine=73334786;
 //BA.debugLineNum = 73334786;BA.debugLine="Dim pan As B4XView = ListItemsListChk.GetPanel(n";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = __ref._listitemslistchk /*b4a.example3.customlistview*/ ._getpanel(_n);
RDebugUtils.currentLine=73334787;
 //BA.debugLineNum = 73334787;BA.debugLine="If Utils.NNE(pan.tag) Then";
if (_utils._nne /*boolean*/ (ba,BA.ObjectToString(_pan.getTag()))) { 
RDebugUtils.currentLine=73334788;
 //BA.debugLineNum = 73334788;BA.debugLine="pan.Color = 0xFFFFFFFF";
_pan.setColor((int) (0xffffffff));
RDebugUtils.currentLine=73334789;
 //BA.debugLineNum = 73334789;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=73334790;
 //BA.debugLineNum = 73334790;BA.debugLine="lbl.Color = 0xFFFFFFFF";
_lbl.setColor((int) (0xffffffff));
 };
 }
};
RDebugUtils.currentLine=73334793;
 //BA.debugLineNum = 73334793;BA.debugLine="End Sub";
return "";
}
public String  _listitemslistclearselectionview(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "listitemslistclearselectionview", false))
	 {return ((String) Debug.delegate(ba, "listitemslistclearselectionview", null));}
int _n = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=73859072;
 //BA.debugLineNum = 73859072;BA.debugLine="Sub ListItemsListClearSelectionView";
RDebugUtils.currentLine=73859073;
 //BA.debugLineNum = 73859073;BA.debugLine="For n=0 To ListItemsList.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._listitemslist /*b4a.example3.customlistview*/ ._getsize()-1);
_n = (int) (0) ;
for (;_n <= limit1 ;_n = _n + step1 ) {
RDebugUtils.currentLine=73859074;
 //BA.debugLineNum = 73859074;BA.debugLine="Dim pan As B4XView = ListItemsList.GetPanel(n)";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = __ref._listitemslist /*b4a.example3.customlistview*/ ._getpanel(_n);
RDebugUtils.currentLine=73859075;
 //BA.debugLineNum = 73859075;BA.debugLine="If Utils.NNE(pan.tag) Then";
if (_utils._nne /*boolean*/ (ba,BA.ObjectToString(_pan.getTag()))) { 
RDebugUtils.currentLine=73859076;
 //BA.debugLineNum = 73859076;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=73859077;
 //BA.debugLineNum = 73859077;BA.debugLine="lbl.Color = 0xFFFFFFFF";
_lbl.setColor((int) (0xffffffff));
 };
 }
};
RDebugUtils.currentLine=73859080;
 //BA.debugLineNum = 73859080;BA.debugLine="End Sub";
return "";
}
public String  _listitemsrequest_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "listitemsrequest_itemclick", false))
	 {return ((String) Debug.delegate(ba, "listitemsrequest_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.PanelWrapper _oldpnl = null;
anywheresoftware.b4a.objects.LabelWrapper _oldlbl = null;
RDebugUtils.currentLine=71696384;
 //BA.debugLineNum = 71696384;BA.debugLine="Sub ListItemsRequest_ItemClick (Index As Int, Valu";
RDebugUtils.currentLine=71696385;
 //BA.debugLineNum = 71696385;BA.debugLine="Dim pnl As Panel = ListItemsRequest.GetPanel(Inde";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._listitemsrequest /*b4a.example3.customlistview*/ ._getpanel(_index).getObject()));
RDebugUtils.currentLine=71696386;
 //BA.debugLineNum = 71696386;BA.debugLine="Dim lbl As Label = pnl.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=71696390;
 //BA.debugLineNum = 71696390;BA.debugLine="lbl.Color = Colors.Green   '.SetColorAnimated(250";
_lbl.setColor(__c.Colors.Green);
RDebugUtils.currentLine=71696391;
 //BA.debugLineNum = 71696391;BA.debugLine="lbl.Invalidate";
_lbl.Invalidate();
RDebugUtils.currentLine=71696392;
 //BA.debugLineNum = 71696392;BA.debugLine="HiddenListItemLabel = lbl.Tag";
__ref._hiddenlistitemlabel /*Object*/  = _lbl.getTag();
RDebugUtils.currentLine=71696393;
 //BA.debugLineNum = 71696393;BA.debugLine="Dim oldpnl As Panel = ListItemsRequest.GetPanel(L";
_oldpnl = new anywheresoftware.b4a.objects.PanelWrapper();
_oldpnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._listitemsrequest /*b4a.example3.customlistview*/ ._getpanel(__ref._lastindexlist /*int*/ ).getObject()));
RDebugUtils.currentLine=71696394;
 //BA.debugLineNum = 71696394;BA.debugLine="Dim oldlbl As Label = oldpnl.GetView(0)";
_oldlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_oldlbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_oldpnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=71696395;
 //BA.debugLineNum = 71696395;BA.debugLine="oldlbl.Color = Colors.White";
_oldlbl.setColor(__c.Colors.White);
RDebugUtils.currentLine=71696396;
 //BA.debugLineNum = 71696396;BA.debugLine="oldlbl.Invalidate";
_oldlbl.Invalidate();
RDebugUtils.currentLine=71696397;
 //BA.debugLineNum = 71696397;BA.debugLine="LastIndexList = Index";
__ref._lastindexlist /*int*/  = _index;
RDebugUtils.currentLine=71696398;
 //BA.debugLineNum = 71696398;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(__c.DialogResponse.POSITIVE).setEnabled(_utils._nne /*boolean*/ (ba,BA.ObjectToString(__ref._hiddenlistitemlabel /*Object*/ )));
RDebugUtils.currentLine=71696399;
 //BA.debugLineNum = 71696399;BA.debugLine="End Sub";
return "";
}
public String  _listviewbluetoothdevices_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "listviewbluetoothdevices_itemclick", false))
	 {return ((String) Debug.delegate(ba, "listviewbluetoothdevices_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=79298560;
 //BA.debugLineNum = 79298560;BA.debugLine="Sub ListViewBluetoothDevices_ItemClick (Position A";
RDebugUtils.currentLine=79298561;
 //BA.debugLineNum = 79298561;BA.debugLine="Try";
try {RDebugUtils.currentLine=79298562;
 //BA.debugLineNum = 79298562;BA.debugLine="CurrentPrinterConnected = Value";
__ref._currentprinterconnected /*Object*/  = _value;
RDebugUtils.currentLine=79298563;
 //BA.debugLineNum = 79298563;BA.debugLine="PrinterMessage = \"Impressora Conectada\"";
__ref._printermessage /*String*/  = "Impressora Conectada";
RDebugUtils.currentLine=79298564;
 //BA.debugLineNum = 79298564;BA.debugLine="Printer.ClearBuffer";
__ref._printer /*b4a.example.bt_printer*/ ._vvv3();
RDebugUtils.currentLine=79298565;
 //BA.debugLineNum = 79298565;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(Starter.Inte";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_bitmap(__c.LoadBitmap(_starter._internalfolder /*String*/ ,"logo_monocromatico_mono.png"),(int) (0));
RDebugUtils.currentLine=79298566;
 //BA.debugLineNum = 79298566;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.BoldOn & \"ER";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline(_esc_pos._vv1+"ERGUELOP LDA"+_esc_pos._vv4);
RDebugUtils.currentLine=79298567;
 //BA.debugLineNum = 79298567;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline(_esc_pos._fontb_normal+"Contribuinte: 507601190"+_esc_pos._fonta_normal);
RDebugUtils.currentLine=79298568;
 //BA.debugLineNum = 79298568;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_bitmap(__c.LoadBitmap(__c.File.getDirAssets(),"barra_cinza.png"),(int) (0));
RDebugUtils.currentLine=79298569;
 //BA.debugLineNum = 79298569;BA.debugLine="Printer.AddBuffer_Writeline(\"GUIA DE REMESSA\")";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline("GUIA DE REMESSA");
RDebugUtils.currentLine=79298570;
 //BA.debugLineNum = 79298570;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline(_esc_pos._fontb_normal+"Número: XXXXXX      Data: XXXX-XX-XX"+_esc_pos._fonta_normal);
RDebugUtils.currentLine=79298571;
 //BA.debugLineNum = 79298571;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_bitmap(__c.LoadBitmap(__c.File.getDirAssets(),"barra_cinza.png"),(int) (0));
RDebugUtils.currentLine=79298572;
 //BA.debugLineNum = 79298572;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline("");
RDebugUtils.currentLine=79298573;
 //BA.debugLineNum = 79298573;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_writeline("");
RDebugUtils.currentLine=79298574;
 //BA.debugLineNum = 79298574;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
__ref._printer /*b4a.example.bt_printer*/ ._addbuffer_bitmap(__c.LoadBitmap(__c.File.getDirAssets(),"barra_cinza.png"),(int) (0));
RDebugUtils.currentLine=79298575;
 //BA.debugLineNum = 79298575;BA.debugLine="Printer.SelectFromMac(Value)";
__ref._printer /*b4a.example.bt_printer*/ ._vvvv7(BA.ObjectToString(_value));
RDebugUtils.currentLine=79298576;
 //BA.debugLineNum = 79298576;BA.debugLine="File.WriteString(Starter.InternalFolder,$\"defult";
__c.File.WriteString(_starter._internalfolder /*String*/ ,("defultprinter.set"),BA.ObjectToString(_value));
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=79298578;
 //BA.debugLineNum = 79298578;BA.debugLine="Log(LastException)";
__c.LogImpl("679298578",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=79298580;
 //BA.debugLineNum = 79298580;BA.debugLine="End Sub";
return "";
}
public String  _mainbutloginconfig_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "mainbutloginconfig_click", false))
	 {return ((String) Debug.delegate(ba, "mainbutloginconfig_click", null));}
RDebugUtils.currentLine=78184448;
 //BA.debugLineNum = 78184448;BA.debugLine="Sub mainButLoginConfig_Click";
RDebugUtils.currentLine=78184450;
 //BA.debugLineNum = 78184450;BA.debugLine="End Sub";
return "";
}
public String  _mainbutloginshowpassword_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "mainbutloginshowpassword_click", false))
	 {return ((String) Debug.delegate(ba, "mainbutloginshowpassword_click", null));}
RDebugUtils.currentLine=78118912;
 //BA.debugLineNum = 78118912;BA.debugLine="Sub mainButLoginShowPassword_Click";
RDebugUtils.currentLine=78118913;
 //BA.debugLineNum = 78118913;BA.debugLine="If (LGO_PasswordMode) Then";
if ((__ref._lgo_passwordmode /*boolean*/ )) { 
RDebugUtils.currentLine=78118914;
 //BA.debugLineNum = 78118914;BA.debugLine="LGO_PasswordMode = False";
__ref._lgo_passwordmode /*boolean*/  = __c.False;
 }else {
RDebugUtils.currentLine=78118916;
 //BA.debugLineNum = 78118916;BA.debugLine="LGO_PasswordMode = True";
__ref._lgo_passwordmode /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=78118918;
 //BA.debugLineNum = 78118918;BA.debugLine="mainEditLoginPassword.PasswordMode = LGO_Password";
__ref._maineditloginpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setPasswordMode(__ref._lgo_passwordmode /*boolean*/ );
RDebugUtils.currentLine=78118919;
 //BA.debugLineNum = 78118919;BA.debugLine="End Sub";
return "";
}
public void  _objecttypelistview_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "objecttypelistview_itemclick", false))
	 {Debug.delegate(ba, "objecttypelistview_itemclick", new Object[] {_index,_value}); return;}
ResumableSub_ObjectTypeListView_ItemClick rsub = new ResumableSub_ObjectTypeListView_ItemClick(this,__ref,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_ObjectTypeListView_ItemClick extends BA.ResumableSub {
public ResumableSub_ObjectTypeListView_ItemClick(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
int _index;
Object _value;
int _n = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String _tagcode = "";
int step1;
int limit1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74121217;
 //BA.debugLineNum = 74121217;BA.debugLine="For n=0 To ObjectTypeListView.Size-1";
if (true) break;

case 1:
//for
this.state = 4;
step1 = 1;
limit1 = (int) (__ref._objecttypelistview /*b4a.example3.customlistview*/ ._getsize()-1);
_n = (int) (0) ;
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step1 > 0 && _n <= limit1) || (step1 < 0 && _n >= limit1)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_n = ((int)(0 + _n + step1)) ;
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=74121218;
 //BA.debugLineNum = 74121218;BA.debugLine="Dim pan As B4XView = ObjectTypeListView.GetPanel";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = __ref._objecttypelistview /*b4a.example3.customlistview*/ ._getpanel(_n);
RDebugUtils.currentLine=74121219;
 //BA.debugLineNum = 74121219;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=74121220;
 //BA.debugLineNum = 74121220;BA.debugLine="lbl.Color = 0xFFFFFFFF";
_lbl.setColor((int) (0xffffffff));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=74121223;
 //BA.debugLineNum = 74121223;BA.debugLine="Dim pan As B4XView = ObjectTypeListView.GetPanel(";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = __ref._objecttypelistview /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=74121224;
 //BA.debugLineNum = 74121224;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=74121225;
 //BA.debugLineNum = 74121225;BA.debugLine="lbl.Color = 0x9637FF4B";
_lbl.setColor((int) (0x9637ff4b));
RDebugUtils.currentLine=74121226;
 //BA.debugLineNum = 74121226;BA.debugLine="Dim TagCode As String = pan.Tag";
_tagcode = BA.ObjectToString(_pan.getTag());
RDebugUtils.currentLine=74121227;
 //BA.debugLineNum = 74121227;BA.debugLine="SelectedObjectTypeTagcode = TagCode";
__ref._selectedobjecttypetagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=74121228;
 //BA.debugLineNum = 74121228;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "objecttypelistview_itemclick"),(int) (50));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=74121229;
 //BA.debugLineNum = 74121229;BA.debugLine="SelectObjectType(Index)";
__ref._selectobjecttype /*void*/ (null,_index);
RDebugUtils.currentLine=74121230;
 //BA.debugLineNum = 74121230;BA.debugLine="CLAObjectTypeSpinner.SelectedIndex = Index";
__ref._claobjecttypespinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_index);
RDebugUtils.currentLine=74121232;
 //BA.debugLineNum = 74121232;BA.debugLine="objectTypePanel.Visible = False";
__ref._objecttypepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=74121233;
 //BA.debugLineNum = 74121233;BA.debugLine="selectObjectPanel.Visible = True";
__ref._selectobjectpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=74121234;
 //BA.debugLineNum = 74121234;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _selectobjecttype(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "selectobjecttype", false))
	 {Debug.delegate(ba, "selectobjecttype", new Object[] {_index}); return;}
ResumableSub_SelectObjectType rsub = new ResumableSub_SelectObjectType(this,__ref,_index);
rsub.resume(ba, null);
}
public static class ResumableSub_SelectObjectType extends BA.ResumableSub {
public ResumableSub_SelectObjectType(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,int _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
int _index;
int _obtindex = 0;
int _obgindex = 0;
String _obtext = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74383361;
 //BA.debugLineNum = 74383361;BA.debugLine="CLAObjectDesc.Text = \"\"";
__ref._claobjectdesc /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=74383362;
 //BA.debugLineNum = 74383362;BA.debugLine="CLAObjectGroupSpinner.SelectedIndex = 0";
__ref._claobjectgroupspinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (0));
RDebugUtils.currentLine=74383363;
 //BA.debugLineNum = 74383363;BA.debugLine="Dim obtIndex As Int = index";
_obtindex = _index;
RDebugUtils.currentLine=74383364;
 //BA.debugLineNum = 74383364;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Sele";
_obgindex = __ref._claobjectgroupspinner /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=74383365;
 //BA.debugLineNum = 74383365;BA.debugLine="Dim obtext As String = CLAObjectDesc.Text";
_obtext = __ref._claobjectdesc /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=74383366;
 //BA.debugLineNum = 74383366;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtInde";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = __ref._getobjectslist /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_obtindex,_obgindex,_obtext,parent.__c.True);
RDebugUtils.currentLine=74383367;
 //BA.debugLineNum = 74383367;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "selectobjecttype"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_finish = (Boolean) result[1];
;
RDebugUtils.currentLine=74383368;
 //BA.debugLineNum = 74383368;BA.debugLine="If(finish) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=74383369;
 //BA.debugLineNum = 74383369;BA.debugLine="Log(finish)";
parent.__c.LogImpl("674383369",BA.ObjectToString(_finish),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=74383371;
 //BA.debugLineNum = 74383371;BA.debugLine="ObjectsListIndex = 0";
__ref._objectslistindex /*int*/  = (int) (0);
RDebugUtils.currentLine=74383372;
 //BA.debugLineNum = 74383372;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _paramitemslist_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "paramitemslist_itemclick", false))
	 {return ((String) Debug.delegate(ba, "paramitemslist_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=72679424;
 //BA.debugLineNum = 72679424;BA.debugLine="Sub ParamItemsList_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=72679427;
 //BA.debugLineNum = 72679427;BA.debugLine="End Sub";
return "";
}
public String  _printer_connectedtoprint(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "printer_connectedtoprint", false))
	 {return ((String) Debug.delegate(ba, "printer_connectedtoprint", new Object[] {_success}));}
RDebugUtils.currentLine=79167488;
 //BA.debugLineNum = 79167488;BA.debugLine="Sub Printer_ConnectedToPrint (Success As Boolean)";
RDebugUtils.currentLine=79167490;
 //BA.debugLineNum = 79167490;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=79167491;
 //BA.debugLineNum = 79167491;BA.debugLine="ButtonPrint.Visible = True";
__ref._buttonprint /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=79167492;
 //BA.debugLineNum = 79167492;BA.debugLine="ToastMessageShow(PrinterMessage,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(__ref._printermessage /*String*/ ),__c.False);
RDebugUtils.currentLine=79167493;
 //BA.debugLineNum = 79167493;BA.debugLine="ListViewBluetoothDevices.Clear";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
 }else {
RDebugUtils.currentLine=79167495;
 //BA.debugLineNum = 79167495;BA.debugLine="ButtonPrint.Visible = False";
__ref._buttonprint /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=79167496;
 //BA.debugLineNum = 79167496;BA.debugLine="ToastMessageShow(\"Erro ao conectar a Impressora\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("Erro ao conectar a Impressora"),__c.False);
 };
RDebugUtils.currentLine=79167498;
 //BA.debugLineNum = 79167498;BA.debugLine="End Sub";
return "";
}
public String  _printer_discoveryfinished(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "printer_discoveryfinished", false))
	 {return ((String) Debug.delegate(ba, "printer_discoveryfinished", null));}
RDebugUtils.currentLine=79036416;
 //BA.debugLineNum = 79036416;BA.debugLine="Sub Printer_DiscoveryFinished";
RDebugUtils.currentLine=79036417;
 //BA.debugLineNum = 79036417;BA.debugLine="Log(\"Search End\")";
__c.LogImpl("679036417","Search End",0);
RDebugUtils.currentLine=79036418;
 //BA.debugLineNum = 79036418;BA.debugLine="End Sub";
return "";
}
public String  _printer_discoverynewprinter(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.collections.Map _printerfound,int _deviceclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "printer_discoverynewprinter", false))
	 {return ((String) Debug.delegate(ba, "printer_discoverynewprinter", new Object[] {_printerfound,_deviceclass}));}
RDebugUtils.currentLine=78970880;
 //BA.debugLineNum = 78970880;BA.debugLine="Sub Printer_DiscoveryNewPrinter (PrinterFound As M";
RDebugUtils.currentLine=78970882;
 //BA.debugLineNum = 78970882;BA.debugLine="Try";
try {RDebugUtils.currentLine=78970883;
 //BA.debugLineNum = 78970883;BA.debugLine="Log(\"DEVICE Class:\" & DeviceClass)";
__c.LogImpl("678970883","DEVICE Class:"+BA.NumberToString(_deviceclass),0);
RDebugUtils.currentLine=78970884;
 //BA.debugLineNum = 78970884;BA.debugLine="ListViewBluetoothDevices.AddSingleLine2(PrinterF";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine2(BA.ObjectToCharSequence(_printerfound.GetKeyAt((int) (0))),_printerfound.GetValueAt((int) (0)));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=78970886;
 //BA.debugLineNum = 78970886;BA.debugLine="Log(LastException)";
__c.LogImpl("678970886",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=78970888;
 //BA.debugLineNum = 78970888;BA.debugLine="End Sub";
return "";
}
public String  _printer_discoverynodevicefound(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "printer_discoverynodevicefound", false))
	 {return ((String) Debug.delegate(ba, "printer_discoverynodevicefound", null));}
RDebugUtils.currentLine=79101952;
 //BA.debugLineNum = 79101952;BA.debugLine="Sub Printer_DiscoveryNoDeviceFound";
RDebugUtils.currentLine=79101953;
 //BA.debugLineNum = 79101953;BA.debugLine="ToastMessageShow(\"Device not found\",True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Device not found"),__c.True);
RDebugUtils.currentLine=79101954;
 //BA.debugLineNum = 79101954;BA.debugLine="End Sub";
return "";
}
public String  _printer_listprinterassociated(xevolution.vrcg.devdemov2400.appdialogs __ref,anywheresoftware.b4a.objects.collections.Map _listnameandmac) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "printer_listprinterassociated", false))
	 {return ((String) Debug.delegate(ba, "printer_listprinterassociated", new Object[] {_listnameandmac}));}
int _i = 0;
RDebugUtils.currentLine=78839808;
 //BA.debugLineNum = 78839808;BA.debugLine="Sub Printer_ListPrinterAssociated (ListNameAndMac";
RDebugUtils.currentLine=78839810;
 //BA.debugLineNum = 78839810;BA.debugLine="Try";
try {RDebugUtils.currentLine=78839811;
 //BA.debugLineNum = 78839811;BA.debugLine="ListViewBluetoothDevices.Clear";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=78839812;
 //BA.debugLineNum = 78839812;BA.debugLine="For I=0 To ListNameAndMac.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_listnameandmac.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=78839813;
 //BA.debugLineNum = 78839813;BA.debugLine="ListViewBluetoothDevices.AddSingleLine2(ListNam";
__ref._listviewbluetoothdevices /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine2(BA.ObjectToCharSequence(_listnameandmac.GetKeyAt(_i)),_listnameandmac.GetValueAt(_i));
RDebugUtils.currentLine=78839814;
 //BA.debugLineNum = 78839814;BA.debugLine="Log($\"${ListNameAndMac.GetKeyAt(I)}, ${ListName";
__c.LogImpl("678839814",(""+__c.SmartStringFormatter("",_listnameandmac.GetKeyAt(_i))+", "+__c.SmartStringFormatter("",_listnameandmac.GetValueAt(_i))+""),0);
 }
};
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=78839817;
 //BA.debugLineNum = 78839817;BA.debugLine="Log(LastException)";
__c.LogImpl("678839817",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=78839819;
 //BA.debugLineNum = 78839819;BA.debugLine="End Sub";
return "";
}
public String  _printer_sendterminated(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "printer_sendterminated", false))
	 {return ((String) Debug.delegate(ba, "printer_sendterminated", null));}
RDebugUtils.currentLine=79233024;
 //BA.debugLineNum = 79233024;BA.debugLine="Sub Printer_SendTerminated";
RDebugUtils.currentLine=79233025;
 //BA.debugLineNum = 79233025;BA.debugLine="Log(\"Finish!!\")";
__c.LogImpl("679233025","Finish!!",0);
RDebugUtils.currentLine=79233027;
 //BA.debugLineNum = 79233027;BA.debugLine="End Sub";
return "";
}
public String  _resetapplication(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "resetapplication", false))
	 {return ((String) Debug.delegate(ba, "resetapplication", null));}
RDebugUtils.currentLine=75169792;
 //BA.debugLineNum = 75169792;BA.debugLine="Sub ResetApplication";
RDebugUtils.currentLine=75169794;
 //BA.debugLineNum = 75169794;BA.debugLine="End Sub";
return "";
}
public String  _rightpreviewimage_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "rightpreviewimage_click", false))
	 {return ((String) Debug.delegate(ba, "rightpreviewimage_click", null));}
xevolution.vrcg.devdemov2400.types._imageviewdata _currentimage = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bg = null;
RDebugUtils.currentLine=73138176;
 //BA.debugLineNum = 73138176;BA.debugLine="Sub rightPreviewImage_Click";
RDebugUtils.currentLine=73138178;
 //BA.debugLineNum = 73138178;BA.debugLine="If (CurrentPosition < CurrentImagesView.size-1) T";
if ((__ref._currentposition /*int*/ <__ref._currentimagesview /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=73138179;
 //BA.debugLineNum = 73138179;BA.debugLine="CurrentPosition = CurrentPosition +1";
__ref._currentposition /*int*/  = (int) (__ref._currentposition /*int*/ +1);
RDebugUtils.currentLine=73138180;
 //BA.debugLineNum = 73138180;BA.debugLine="Dim CurrentImage As ImageViewData = CurrentImage";
_currentimage = (xevolution.vrcg.devdemov2400.types._imageviewdata)(__ref._currentimagesview /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentposition /*int*/ ));
RDebugUtils.currentLine=73138182;
 //BA.debugLineNum = 73138182;BA.debugLine="If Utils.NNE(CurrentImage.b64) Then";
if (_utils._nne /*boolean*/ (ba,_currentimage.b64 /*String*/ )) { 
RDebugUtils.currentLine=73138183;
 //BA.debugLineNum = 73138183;BA.debugLine="ShowImageView.SetBackgroundImage(Utils.B64ToBit";
__ref._showimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (ba,_currentimage.b64 /*String*/ ).getObject()));
 }else 
{RDebugUtils.currentLine=73138184;
 //BA.debugLineNum = 73138184;BA.debugLine="Else if Utils.NNE(CurrentImage.filename) Then";
if (_utils._nne /*boolean*/ (ba,_currentimage.filename /*String*/ )) { 
RDebugUtils.currentLine=73138185;
 //BA.debugLineNum = 73138185;BA.debugLine="Dim bg As Bitmap = LoadBitmapResize(Starter.Int";
_bg = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bg = __c.LoadBitmapResize(_starter._internalfolder /*String*/ ,_currentimage.filename /*String*/ ,__c.DipToCurrent((int) (780)),__c.DipToCurrent((int) (620)),__c.True);
RDebugUtils.currentLine=73138186;
 //BA.debugLineNum = 73138186;BA.debugLine="ShowImageView.SetBackgroundImage(bg)";
__ref._showimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_bg.getObject()));
 }else {
RDebugUtils.currentLine=73138188;
 //BA.debugLineNum = 73138188;BA.debugLine="CurrentPosition = CurrentPosition -1";
__ref._currentposition /*int*/  = (int) (__ref._currentposition /*int*/ -1);
 }}
;
 };
RDebugUtils.currentLine=73138191;
 //BA.debugLineNum = 73138191;BA.debugLine="End Sub";
return "";
}
public String  _robutoption_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "robutoption_click", false))
	 {return ((String) Debug.delegate(ba, "robutoption_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
int _val = 0;
RDebugUtils.currentLine=71892992;
 //BA.debugLineNum = 71892992;BA.debugLine="Sub ROButOption_Click";
RDebugUtils.currentLine=71892993;
 //BA.debugLineNum = 71892993;BA.debugLine="Dim Btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=71892994;
 //BA.debugLineNum = 71892994;BA.debugLine="Dim val As Int = Btn.Tag";
_val = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=71892996;
 //BA.debugLineNum = 71892996;BA.debugLine="CallSubDelayed3(ThisActivityName, \"RunRequestOpti";
__c.CallSubDelayed3(ba,__ref._thisactivityname /*Object*/ ,"RunRequestOption",(Object)(_val),(Object)(__ref._thisrequestdata /*xevolution.vrcg.devdemov2400.types._requestdata*/ ));
RDebugUtils.currentLine=71892997;
 //BA.debugLineNum = 71892997;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=71892998;
 //BA.debugLineNum = 71892998;BA.debugLine="End Sub";
return "";
}
public void  _setresetpwddialog(xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,String _oldpwd) throws Exception{
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "setresetpwddialog", false))
	 {Debug.delegate(ba, "setresetpwddialog", new Object[] {_activ,_oldpwd}); return;}
ResumableSub_setResetPwdDialog rsub = new ResumableSub_setResetPwdDialog(this,__ref,_activ,_oldpwd);
rsub.resume(ba, null);
}
public static class ResumableSub_setResetPwdDialog extends BA.ResumableSub {
public ResumableSub_setResetPwdDialog(xevolution.vrcg.devdemov2400.appdialogs parent,xevolution.vrcg.devdemov2400.appdialogs __ref,Object _activ,String _oldpwd) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._oldpwd = _oldpwd;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appdialogs __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
Object _activ;
String _oldpwd;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appdialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=76414977;
 //BA.debugLineNum = 76414977;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Reset de";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Reset de password","Confirmar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=76414979;
 //BA.debugLineNum = 76414979;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=76414980;
 //BA.debugLineNum = 76414980;BA.debugLine="ApplDialog.SetSize(650dip, 350dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (650)),parent.__c.DipToCurrent((int) (350)));
RDebugUtils.currentLine=76414981;
 //BA.debugLineNum = 76414981;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "setresetpwddialog"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=76414982;
 //BA.debugLineNum = 76414982;BA.debugLine="pnl.LoadLayout(\"dialog_RestePassword_device_2\")";
_pnl.LoadLayout("dialog_RestePassword_device_2",ba);
RDebugUtils.currentLine=76414984;
 //BA.debugLineNum = 76414984;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appdialogs", "setresetpwddialog"), _sf);
this.state = 14;
return;
case 14:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=76414985;
 //BA.debugLineNum = 76414985;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=76414986;
 //BA.debugLineNum = 76414986;BA.debugLine="If (mainEditLoginPassword.Text = mainEditLoginPa";
if (true) break;

case 4:
//if
this.state = 9;
if (((__ref._maineditloginpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals(__ref._maineditloginpasswordconfirm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) && ((__ref._maineditloginpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("") == false)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=76414990;
 //BA.debugLineNum = 76414990;BA.debugLine="CallSub2(activ, \"SetResetPassword\", mainEditLog";
parent.__c.CallSubDebug2(ba,_activ,"SetResetPassword",(Object)(__ref._maineditloginpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=76414992;
 //BA.debugLineNum = 76414992;BA.debugLine="MsgboxAsync(\"As chaves introduzidas não são coi";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("As chaves introduzidas não são coincidentes! Tente novamente ou cancele a operação."),BA.ObjectToCharSequence("Erro!"),ba);
RDebugUtils.currentLine=76414993;
 //BA.debugLineNum = 76414993;BA.debugLine="setResetPwdDialog(activ, oldPwd)";
__ref._setresetpwddialog /*void*/ (null,_activ,_oldpwd);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=76414996;
 //BA.debugLineNum = 76414996;BA.debugLine="MsgboxAsync(\"A palavra chave não foi alterada, s";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("A palavra chave não foi alterada, sendo a mesma obrigatória. A aplicação vai fechar."),BA.ObjectToCharSequence("Alerta!"),ba);
RDebugUtils.currentLine=76414997;
 //BA.debugLineNum = 76414997;BA.debugLine="CallSub(activ, \"prc_AppClose\")";
parent.__c.CallSubDebug(ba,_activ,"prc_AppClose");
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=76415000;
 //BA.debugLineNum = 76415000;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _suggestobjectbutton_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "suggestobjectbutton_click", false))
	 {return ((String) Debug.delegate(ba, "suggestobjectbutton_click", null));}
RDebugUtils.currentLine=74448896;
 //BA.debugLineNum = 74448896;BA.debugLine="Sub suggestObjectButton_Click";
RDebugUtils.currentLine=74448898;
 //BA.debugLineNum = 74448898;BA.debugLine="End Sub";
return "";
}
public String  _sync_manual_btn_edate_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_btn_edate_click", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_btn_edate_click", null));}
de.donmanfred.DatePickerDialogWrapper _dd = null;
long _dnow = 0L;
RDebugUtils.currentLine=80412672;
 //BA.debugLineNum = 80412672;BA.debugLine="Sub sync_manual_Btn_edate_Click";
RDebugUtils.currentLine=80412673;
 //BA.debugLineNum = 80412673;BA.debugLine="Dim dd As DatePickerDialog";
_dd = new de.donmanfred.DatePickerDialogWrapper();
RDebugUtils.currentLine=80412674;
 //BA.debugLineNum = 80412674;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=80412675;
 //BA.debugLineNum = 80412675;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=80412676;
 //BA.debugLineNum = 80412676;BA.debugLine="If (sync_manual_edate.EditText.Text  <> \"\") Then";
if (((__ref._sync_manual_edate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().getText()).equals("") == false)) { 
RDebugUtils.currentLine=80412677;
 //BA.debugLineNum = 80412677;BA.debugLine="dnow = DateTime.DateParse(sync_manual_idate.text";
_dnow = __c.DateTime.DateParse(__ref._sync_manual_idate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText());
 };
RDebugUtils.currentLine=80412679;
 //BA.debugLineNum = 80412679;BA.debugLine="dd.Initialize(\"CalSynceDate\", DateTime.GetYear(dn";
_dd.Initialize(ba,"CalSynceDate",__c.DateTime.GetYear(_dnow),(int) (__c.DateTime.GetMonth(_dnow)-1),__c.DateTime.GetDayOfMonth(_dnow));
RDebugUtils.currentLine=80412680;
 //BA.debugLineNum = 80412680;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
__c.LogImpl("680412680",BA.NumberToString(_dd.getAccentColor()),0);
RDebugUtils.currentLine=80412681;
 //BA.debugLineNum = 80412681;BA.debugLine="dd.show(\"sync_manual_edate\")";
_dd.show("sync_manual_edate");
RDebugUtils.currentLine=80412682;
 //BA.debugLineNum = 80412682;BA.debugLine="End Sub";
return "";
}
public String  _sync_manual_btn_idate_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_btn_idate_click", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_btn_idate_click", null));}
de.donmanfred.DatePickerDialogWrapper _dd = null;
long _dnow = 0L;
RDebugUtils.currentLine=80347136;
 //BA.debugLineNum = 80347136;BA.debugLine="Sub sync_manual_Btn_idate_Click";
RDebugUtils.currentLine=80347137;
 //BA.debugLineNum = 80347137;BA.debugLine="Dim dd As DatePickerDialog";
_dd = new de.donmanfred.DatePickerDialogWrapper();
RDebugUtils.currentLine=80347138;
 //BA.debugLineNum = 80347138;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=80347139;
 //BA.debugLineNum = 80347139;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=80347140;
 //BA.debugLineNum = 80347140;BA.debugLine="If (sync_manual_idate.EditText.Text  <> \"\") Then";
if (((__ref._sync_manual_idate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().getText()).equals("") == false)) { 
RDebugUtils.currentLine=80347141;
 //BA.debugLineNum = 80347141;BA.debugLine="dnow = DateTime.DateParse(sync_manual_idate.text";
_dnow = __c.DateTime.DateParse(__ref._sync_manual_idate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText());
 };
RDebugUtils.currentLine=80347143;
 //BA.debugLineNum = 80347143;BA.debugLine="dd.Initialize(\"CalSynciDate\", DateTime.GetYear(dn";
_dd.Initialize(ba,"CalSynciDate",__c.DateTime.GetYear(_dnow),(int) (__c.DateTime.GetMonth(_dnow)-1),__c.DateTime.GetDayOfMonth(_dnow));
RDebugUtils.currentLine=80347145;
 //BA.debugLineNum = 80347145;BA.debugLine="dd.show(\"sync_manual_idate\")";
_dd.show("sync_manual_idate");
RDebugUtils.currentLine=80347146;
 //BA.debugLineNum = 80347146;BA.debugLine="DataVazia = False";
__ref._datavazia /*boolean*/  = __c.False;
RDebugUtils.currentLine=80347147;
 //BA.debugLineNum = 80347147;BA.debugLine="End Sub";
return "";
}
public String  _sync_manual_downloadrunfirstintall_checkedchange(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_downloadrunfirstintall_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_downloadrunfirstintall_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=79888384;
 //BA.debugLineNum = 79888384;BA.debugLine="Sub sync_manual_downloadrunfirstintall_CheckedChan";
RDebugUtils.currentLine=79888385;
 //BA.debugLineNum = 79888385;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=79888386;
 //BA.debugLineNum = 79888386;BA.debugLine="sync_manual_chk1.Checked = False";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888387;
 //BA.debugLineNum = 79888387;BA.debugLine="sync_manual_chk2.Checked = False";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888388;
 //BA.debugLineNum = 79888388;BA.debugLine="sync_manual_chk3.Checked = False";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888389;
 //BA.debugLineNum = 79888389;BA.debugLine="sync_manual_chk4.Checked = False";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888390;
 //BA.debugLineNum = 79888390;BA.debugLine="sync_manual_chk5.Checked = False";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888391;
 //BA.debugLineNum = 79888391;BA.debugLine="sync_manual_chk6.Checked = False";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888392;
 //BA.debugLineNum = 79888392;BA.debugLine="sync_manual_chk7.Checked = False";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888393;
 //BA.debugLineNum = 79888393;BA.debugLine="sync_manual_chk8.Checked = False";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888394;
 //BA.debugLineNum = 79888394;BA.debugLine="sync_manual_chk9.Checked = False";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888395;
 //BA.debugLineNum = 79888395;BA.debugLine="sync_manual_chk10.Checked = False";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888396;
 //BA.debugLineNum = 79888396;BA.debugLine="sync_manual_chk11.Checked = False";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888397;
 //BA.debugLineNum = 79888397;BA.debugLine="sync_manual_chk12.Checked = False";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888398;
 //BA.debugLineNum = 79888398;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79888399;
 //BA.debugLineNum = 79888399;BA.debugLine="sync_manual_runfirstintall.Checked = False";
__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
 };
RDebugUtils.currentLine=79888401;
 //BA.debugLineNum = 79888401;BA.debugLine="End Sub";
return "";
}
public String  _sync_manual_others_checkedchange(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_others_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_others_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=79691776;
 //BA.debugLineNum = 79691776;BA.debugLine="Sub sync_manual_others_CheckedChange(Checked As Bo";
RDebugUtils.currentLine=79691777;
 //BA.debugLineNum = 79691777;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fals";
__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79691778;
 //BA.debugLineNum = 79691778;BA.debugLine="sync_manual_runfirstintall.Checked = False";
__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79691779;
 //BA.debugLineNum = 79691779;BA.debugLine="End Sub";
return "";
}
public String  _sync_manual_radio_mestres_checkedchange(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_radio_mestres_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_radio_mestres_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=80084992;
 //BA.debugLineNum = 80084992;BA.debugLine="Sub sync_manual_Radio_mestres_CheckedChange(Checke";
RDebugUtils.currentLine=80084993;
 //BA.debugLineNum = 80084993;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=80084994;
 //BA.debugLineNum = 80084994;BA.debugLine="sync_manual_chk1.Checked = False";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80084995;
 //BA.debugLineNum = 80084995;BA.debugLine="sync_manual_chk2.Checked = False";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80084996;
 //BA.debugLineNum = 80084996;BA.debugLine="sync_manual_chk3.Checked = False";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80084997;
 //BA.debugLineNum = 80084997;BA.debugLine="sync_manual_chk4.Checked = False";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80084998;
 //BA.debugLineNum = 80084998;BA.debugLine="sync_manual_chk5.Checked = False";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80084999;
 //BA.debugLineNum = 80084999;BA.debugLine="sync_manual_chk6.Checked = False";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80085000;
 //BA.debugLineNum = 80085000;BA.debugLine="sync_manual_chk7.Checked = False";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80085001;
 //BA.debugLineNum = 80085001;BA.debugLine="sync_manual_chk8.Checked = False";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80085002;
 //BA.debugLineNum = 80085002;BA.debugLine="sync_manual_chk9.Checked = False";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80085003;
 //BA.debugLineNum = 80085003;BA.debugLine="sync_manual_chk10.Checked = False";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80085004;
 //BA.debugLineNum = 80085004;BA.debugLine="sync_manual_chk11.Checked = False";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80085005;
 //BA.debugLineNum = 80085005;BA.debugLine="sync_manual_chk12.Checked = False";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80085006;
 //BA.debugLineNum = 80085006;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80085008;
 //BA.debugLineNum = 80085008;BA.debugLine="DisclaimerMestres.text = ShareCode.Sync_Disclaim";
__ref._disclaimermestres /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_sharecode._sync_disclaimermestres /*String*/ ));
RDebugUtils.currentLine=80085009;
 //BA.debugLineNum = 80085009;BA.debugLine="PanelMestres.Visible = True";
__ref._panelmestres /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=80085010;
 //BA.debugLineNum = 80085010;BA.debugLine="sync_manual_runfirstintall.Enabled = True";
__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=80085011;
 //BA.debugLineNum = 80085011;BA.debugLine="sync_manual_downloadrunfirstintall.Enabled = Tru";
__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=80085012;
 //BA.debugLineNum = 80085012;BA.debugLine="sync_manual_runfirstintall.Checked = True";
__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80085013;
 //BA.debugLineNum = 80085013;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
 };
RDebugUtils.currentLine=80085015;
 //BA.debugLineNum = 80085015;BA.debugLine="End Sub";
return "";
}
public String  _sync_manual_radio_seleccao_checkedchange(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_radio_seleccao_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_radio_seleccao_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=79757312;
 //BA.debugLineNum = 79757312;BA.debugLine="Sub sync_manual_Radio_seleccao_CheckedChange(Check";
RDebugUtils.currentLine=79757313;
 //BA.debugLineNum = 79757313;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=79757314;
 //BA.debugLineNum = 79757314;BA.debugLine="sync_manual_chk1.Enabled = True";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757315;
 //BA.debugLineNum = 79757315;BA.debugLine="sync_manual_chk2.Enabled = True";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757316;
 //BA.debugLineNum = 79757316;BA.debugLine="sync_manual_chk3.Enabled = True";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757317;
 //BA.debugLineNum = 79757317;BA.debugLine="sync_manual_chk4.Enabled = True";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757318;
 //BA.debugLineNum = 79757318;BA.debugLine="sync_manual_chk5.Enabled = True";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757319;
 //BA.debugLineNum = 79757319;BA.debugLine="sync_manual_chk6.Enabled = True";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757320;
 //BA.debugLineNum = 79757320;BA.debugLine="sync_manual_chk7.Enabled = True";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757321;
 //BA.debugLineNum = 79757321;BA.debugLine="sync_manual_chk8.Enabled = True";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757322;
 //BA.debugLineNum = 79757322;BA.debugLine="sync_manual_chk9.Enabled = True";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757323;
 //BA.debugLineNum = 79757323;BA.debugLine="sync_manual_chk10.Enabled = True";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757324;
 //BA.debugLineNum = 79757324;BA.debugLine="sync_manual_chk11.Enabled = True";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757325;
 //BA.debugLineNum = 79757325;BA.debugLine="sync_manual_chk12.Enabled = True";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757326;
 //BA.debugLineNum = 79757326;BA.debugLine="sync_manual_chk_docs_templates.Enabled = True";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757327;
 //BA.debugLineNum = 79757327;BA.debugLine="sync_manual_runfirstintall.Enabled = True";
__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757328;
 //BA.debugLineNum = 79757328;BA.debugLine="sync_manual_downloadrunfirstintall.Enabled = Tru";
__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=79757330;
 //BA.debugLineNum = 79757330;BA.debugLine="sync_manual_chk1.Checked = False";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757331;
 //BA.debugLineNum = 79757331;BA.debugLine="sync_manual_chk2.Checked = False";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757332;
 //BA.debugLineNum = 79757332;BA.debugLine="sync_manual_chk3.Checked = False";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757333;
 //BA.debugLineNum = 79757333;BA.debugLine="sync_manual_chk4.Checked = False";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757334;
 //BA.debugLineNum = 79757334;BA.debugLine="sync_manual_chk5.Checked = False";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757335;
 //BA.debugLineNum = 79757335;BA.debugLine="sync_manual_chk6.Checked = False";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757336;
 //BA.debugLineNum = 79757336;BA.debugLine="sync_manual_chk7.Checked = False";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757337;
 //BA.debugLineNum = 79757337;BA.debugLine="sync_manual_chk8.Checked = False";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757338;
 //BA.debugLineNum = 79757338;BA.debugLine="sync_manual_chk9.Checked = False";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757339;
 //BA.debugLineNum = 79757339;BA.debugLine="sync_manual_chk10.Checked = False";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757340;
 //BA.debugLineNum = 79757340;BA.debugLine="sync_manual_chk11.Checked = False";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757341;
 //BA.debugLineNum = 79757341;BA.debugLine="sync_manual_chk12.Checked = False";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757342;
 //BA.debugLineNum = 79757342;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757343;
 //BA.debugLineNum = 79757343;BA.debugLine="PanelMestres.Visible = False";
__ref._panelmestres /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=79757344;
 //BA.debugLineNum = 79757344;BA.debugLine="sync_manual_runfirstintall.Checked = False";
__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757345;
 //BA.debugLineNum = 79757345;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79757347;
 //BA.debugLineNum = 79757347;BA.debugLine="If DataVazia Then";
if (__ref._datavazia /*boolean*/ ) { 
RDebugUtils.currentLine=79757348;
 //BA.debugLineNum = 79757348;BA.debugLine="sync_manual_idate.Text = Utils.GetLastWeekDate";
__ref._sync_manual_idate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_utils._getlastweekdate /*String*/ (ba)));
 };
RDebugUtils.currentLine=79757351;
 //BA.debugLineNum = 79757351;BA.debugLine="sync_manual_edate.Text = Utils.GetCurrentDate";
__ref._sync_manual_edate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_utils._getcurrentdate /*String*/ (ba)));
 };
RDebugUtils.currentLine=79757353;
 //BA.debugLineNum = 79757353;BA.debugLine="End Sub";
return "";
}
public String  _sync_manual_radio_todos_checkedchange(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_radio_todos_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_radio_todos_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=80019456;
 //BA.debugLineNum = 80019456;BA.debugLine="Sub sync_manual_Radio_todos_CheckedChange(Checked";
RDebugUtils.currentLine=80019457;
 //BA.debugLineNum = 80019457;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=80019458;
 //BA.debugLineNum = 80019458;BA.debugLine="sync_manual_chk1.Enabled = False";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019459;
 //BA.debugLineNum = 80019459;BA.debugLine="sync_manual_chk2.Enabled = False";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019460;
 //BA.debugLineNum = 80019460;BA.debugLine="sync_manual_chk3.Enabled = False";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019461;
 //BA.debugLineNum = 80019461;BA.debugLine="sync_manual_chk4.Enabled = False";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019462;
 //BA.debugLineNum = 80019462;BA.debugLine="sync_manual_chk5.Enabled = False";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019463;
 //BA.debugLineNum = 80019463;BA.debugLine="sync_manual_chk6.Enabled = False";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019464;
 //BA.debugLineNum = 80019464;BA.debugLine="sync_manual_chk7.Enabled = False";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019465;
 //BA.debugLineNum = 80019465;BA.debugLine="sync_manual_chk8.Enabled = False";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019466;
 //BA.debugLineNum = 80019466;BA.debugLine="sync_manual_chk9.Enabled = False";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019467;
 //BA.debugLineNum = 80019467;BA.debugLine="sync_manual_chk10.Enabled = False";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019468;
 //BA.debugLineNum = 80019468;BA.debugLine="sync_manual_chk11.Enabled = False";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019469;
 //BA.debugLineNum = 80019469;BA.debugLine="sync_manual_chk12.Enabled = False";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019470;
 //BA.debugLineNum = 80019470;BA.debugLine="sync_manual_chk_docs_templates.Enabled = False";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=80019472;
 //BA.debugLineNum = 80019472;BA.debugLine="sync_manual_chk1.Checked = True";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019473;
 //BA.debugLineNum = 80019473;BA.debugLine="sync_manual_chk2.Checked = True";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019474;
 //BA.debugLineNum = 80019474;BA.debugLine="sync_manual_chk3.Checked = True";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019475;
 //BA.debugLineNum = 80019475;BA.debugLine="sync_manual_chk4.Checked = True";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019476;
 //BA.debugLineNum = 80019476;BA.debugLine="sync_manual_chk5.Checked = True";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019477;
 //BA.debugLineNum = 80019477;BA.debugLine="sync_manual_chk6.Checked = True";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019478;
 //BA.debugLineNum = 80019478;BA.debugLine="sync_manual_chk7.Checked = True";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019479;
 //BA.debugLineNum = 80019479;BA.debugLine="sync_manual_chk8.Checked = True";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019480;
 //BA.debugLineNum = 80019480;BA.debugLine="sync_manual_chk9.Checked = True";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019481;
 //BA.debugLineNum = 80019481;BA.debugLine="sync_manual_chk10.Checked = True";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019482;
 //BA.debugLineNum = 80019482;BA.debugLine="sync_manual_chk11.Checked = True";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019483;
 //BA.debugLineNum = 80019483;BA.debugLine="sync_manual_chk12.Checked = True";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019484;
 //BA.debugLineNum = 80019484;BA.debugLine="sync_manual_chk_docs_templates.Checked = True";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.True);
RDebugUtils.currentLine=80019486;
 //BA.debugLineNum = 80019486;BA.debugLine="PanelMestres.Visible = False";
__ref._panelmestres /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=80019487;
 //BA.debugLineNum = 80019487;BA.debugLine="sync_manual_runfirstintall.Checked = False";
__ref._sync_manual_runfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=80019488;
 //BA.debugLineNum = 80019488;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
 };
RDebugUtils.currentLine=80019490;
 //BA.debugLineNum = 80019490;BA.debugLine="End Sub";
return "";
}
public String  _sync_manual_runfirstintall_checkedchange(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "sync_manual_runfirstintall_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "sync_manual_runfirstintall_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=79822848;
 //BA.debugLineNum = 79822848;BA.debugLine="Sub sync_manual_runfirstintall_CheckedChange(Check";
RDebugUtils.currentLine=79822849;
 //BA.debugLineNum = 79822849;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=79822850;
 //BA.debugLineNum = 79822850;BA.debugLine="sync_manual_chk1.Checked = False";
__ref._sync_manual_chk1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822851;
 //BA.debugLineNum = 79822851;BA.debugLine="sync_manual_chk2.Checked = False";
__ref._sync_manual_chk2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822852;
 //BA.debugLineNum = 79822852;BA.debugLine="sync_manual_chk3.Checked = False";
__ref._sync_manual_chk3 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822853;
 //BA.debugLineNum = 79822853;BA.debugLine="sync_manual_chk4.Checked = False";
__ref._sync_manual_chk4 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822854;
 //BA.debugLineNum = 79822854;BA.debugLine="sync_manual_chk5.Checked = False";
__ref._sync_manual_chk5 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822855;
 //BA.debugLineNum = 79822855;BA.debugLine="sync_manual_chk6.Checked = False";
__ref._sync_manual_chk6 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822856;
 //BA.debugLineNum = 79822856;BA.debugLine="sync_manual_chk7.Checked = False";
__ref._sync_manual_chk7 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822857;
 //BA.debugLineNum = 79822857;BA.debugLine="sync_manual_chk8.Checked = False";
__ref._sync_manual_chk8 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822858;
 //BA.debugLineNum = 79822858;BA.debugLine="sync_manual_chk9.Checked = False";
__ref._sync_manual_chk9 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822859;
 //BA.debugLineNum = 79822859;BA.debugLine="sync_manual_chk10.Checked = False";
__ref._sync_manual_chk10 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822860;
 //BA.debugLineNum = 79822860;BA.debugLine="sync_manual_chk11.Checked = False";
__ref._sync_manual_chk11 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822861;
 //BA.debugLineNum = 79822861;BA.debugLine="sync_manual_chk12.Checked = False";
__ref._sync_manual_chk12 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822862;
 //BA.debugLineNum = 79822862;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
__ref._sync_manual_chk_docs_templates /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
RDebugUtils.currentLine=79822863;
 //BA.debugLineNum = 79822863;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
__ref._sync_manual_downloadrunfirstintall /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .setChecked(__c.False);
 };
RDebugUtils.currentLine=79822865;
 //BA.debugLineNum = 79822865;BA.debugLine="End Sub";
return "";
}
public String  _tbchangecolor_checkedchange(xevolution.vrcg.devdemov2400.appdialogs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "tbchangecolor_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "tbchangecolor_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _mbutton = null;
RDebugUtils.currentLine=75366400;
 //BA.debugLineNum = 75366400;BA.debugLine="Sub TBChangeColor_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=75366401;
 //BA.debugLineNum = 75366401;BA.debugLine="Dim mButton As ToggleButton = Sender";
_mbutton = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
_mbutton = (anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper(), (android.widget.ToggleButton)(__c.Sender(ba)));
RDebugUtils.currentLine=75366402;
 //BA.debugLineNum = 75366402;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=75366403;
 //BA.debugLineNum = 75366403;BA.debugLine="mButton.Color = 0xFF818181";
_mbutton.setColor((int) (0xff818181));
 }else {
RDebugUtils.currentLine=75366405;
 //BA.debugLineNum = 75366405;BA.debugLine="mButton.Color = 0xFFC6C6C6";
_mbutton.setColor((int) (0xffc6c6c6));
 };
RDebugUtils.currentLine=75366407;
 //BA.debugLineNum = 75366407;BA.debugLine="End Sub";
return "";
}
public String  _validationbutton_click(xevolution.vrcg.devdemov2400.appdialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "validationbutton_click", false))
	 {return ((String) Debug.delegate(ba, "validationbutton_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _curr = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.EditTextWrapper _edit = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String _sstr = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _n = 0;
RDebugUtils.currentLine=72089600;
 //BA.debugLineNum = 72089600;BA.debugLine="Sub ValidationButton_Click";
RDebugUtils.currentLine=72089601;
 //BA.debugLineNum = 72089601;BA.debugLine="Dim curr As Button = Sender";
_curr = new anywheresoftware.b4a.objects.ButtonWrapper();
_curr = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=72089602;
 //BA.debugLineNum = 72089602;BA.debugLine="Dim pnl As Panel = curr.Parent";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_curr.getParent()));
RDebugUtils.currentLine=72089603;
 //BA.debugLineNum = 72089603;BA.debugLine="Dim edit As EditText = pnl.GetView(0)";
_edit = new anywheresoftware.b4a.objects.EditTextWrapper();
_edit = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=72089604;
 //BA.debugLineNum = 72089604;BA.debugLine="Dim lbl As Label = pnl.GetView(1)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=72089605;
 //BA.debugLineNum = 72089605;BA.debugLine="lbl.Text = \"\"";
_lbl.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=72089606;
 //BA.debugLineNum = 72089606;BA.debugLine="Dim ssTr As String = $\"select distinct * from dta";
_sstr = ("select distinct * from dta_objects where (title_import||tagcode||reference) like '%"+__c.SmartStringFormatter("",(Object)(_edit.getText().trim()))+"%' ");
RDebugUtils.currentLine=72089607;
 //BA.debugLineNum = 72089607;BA.debugLine="Log(ssTr)";
__c.LogImpl("672089607",_sstr,0);
RDebugUtils.currentLine=72089609;
 //BA.debugLineNum = 72089609;BA.debugLine="Dim Cursor1 As Cursor = Starter.LocalSQLEVC.ExecQ";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sstr)));
RDebugUtils.currentLine=72089611;
 //BA.debugLineNum = 72089611;BA.debugLine="If (Cursor1.RowCount >=1) Then";
if ((_cursor1.getRowCount()>=1)) { 
RDebugUtils.currentLine=72089612;
 //BA.debugLineNum = 72089612;BA.debugLine="For n = 0 To Cursor1.RowCount-1";
{
final int step10 = 1;
final int limit10 = (int) (_cursor1.getRowCount()-1);
_n = (int) (0) ;
for (;_n <= limit10 ;_n = _n + step10 ) {
RDebugUtils.currentLine=72089613;
 //BA.debugLineNum = 72089613;BA.debugLine="Cursor1.Position = n";
_cursor1.setPosition(_n);
RDebugUtils.currentLine=72089614;
 //BA.debugLineNum = 72089614;BA.debugLine="lbl.Text = $\"${lbl.text}<br> ${Cursor1.GetStrin";
_lbl.setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_lbl.getText()))+"<br> "+__c.SmartStringFormatter("",(Object)(_cursor1.GetString("tagcode")))+""+__c.SmartStringFormatter("",(Object)(_cursor1.GetString("title_import")))+"")));
 }
};
 };
RDebugUtils.currentLine=72089617;
 //BA.debugLineNum = 72089617;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=72089618;
 //BA.debugLineNum = 72089618;BA.debugLine="edit.Text = \"\"";
_edit.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=72089619;
 //BA.debugLineNum = 72089619;BA.debugLine="End Sub";
return "";
}
public String  _vidialog_itemclick(xevolution.vrcg.devdemov2400.appdialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appdialogs";
if (Debug.shouldDelegate(ba, "vidialog_itemclick", false))
	 {return ((String) Debug.delegate(ba, "vidialog_itemclick", new Object[] {_index,_value}));}
b4a.example3.customlistview _clv = null;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
RDebugUtils.currentLine=76218368;
 //BA.debugLineNum = 76218368;BA.debugLine="Sub VIDialog_ItemClick (Index As Int, Value As Obj";
RDebugUtils.currentLine=76218369;
 //BA.debugLineNum = 76218369;BA.debugLine="Dim clv As CustomListView = Sender";
_clv = (b4a.example3.customlistview)(__c.Sender(ba));
RDebugUtils.currentLine=76218370;
 //BA.debugLineNum = 76218370;BA.debugLine="Dim pan As Panel = clv.GetPanel(Index)";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clv._getpanel(_index).getObject()));
RDebugUtils.currentLine=76218371;
 //BA.debugLineNum = 76218371;BA.debugLine="Log(pan.Tag)";
__c.LogImpl("676218371",BA.ObjectToString(_pan.getTag()),0);
RDebugUtils.currentLine=76218372;
 //BA.debugLineNum = 76218372;BA.debugLine="CurrentTagcode = pan.Tag";
__ref._currenttagcode /*String*/  = BA.ObjectToString(_pan.getTag());
RDebugUtils.currentLine=76218373;
 //BA.debugLineNum = 76218373;BA.debugLine="CallSub3(ThisActivityName, \"ChangeUserVehicle\", M";
__c.CallSubDebug3(ba,__ref._thisactivityname /*Object*/ ,"ChangeUserVehicle",(Object)(__ref._mastertagcode /*String*/ ),(Object)(__ref._currenttagcode /*String*/ ));
RDebugUtils.currentLine=76218374;
 //BA.debugLineNum = 76218374;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=76218376;
 //BA.debugLineNum = 76218376;BA.debugLine="End Sub";
return "";
}
}