package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class structalerts extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.structalerts");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.structalerts.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _listalerts = null;
public b4a.example3.customlistview _listtasks = null;
public b4a.example3.customlistview _listactions = null;
public int _itemscounter = 0;
public anywheresoftware.b4a.objects.collections.List _taskslist = null;
public anywheresoftware.b4a.objects.ActivityWrapper _activityreference = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _googlemaps = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _appldialog = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemreference = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtasktitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _listitemstatuspanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdetails = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutchecknew = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitempriorities = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitem_id = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitem_statusid = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitem_typeid = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitem_icon = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemobjectstatusicon = null;
public anywheresoftware.b4a.objects.LabelWrapper _claitem_g1 = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _claitembutton_1 = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _claitembutton_2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clabuttonoptions = null;
public anywheresoftware.b4a.objects.LabelWrapper _claitem_g2 = null;
public int _alert_view = 0;
public int _task_view = 0;
public int _action_view = 0;
public anywheresoftware.b4a.objects.LabelWrapper _listitemactionrequest = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listitemactionnew = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemactionstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemactiondetails = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemactionclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _actionobjectstatusicon = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _claactionadd = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _claactionoptions = null;
public anywheresoftware.b4a.objects.LabelWrapper _claitem_g3 = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _claitemalertbutton_1 = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _claitemalertbutton_2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clabuttonalertoptions = null;
public anywheresoftware.b4a.objects.LabelWrapper _claitemalerttext = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_eml_result = null;
public anywheresoftware.b4a.objects.ButtonWrapper _marker_button = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _btnalertremove = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_alert_type = null;
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
public String  _initialize(xevolution.vrcg.devdemov2400.structalerts __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,b4a.example3.customlistview[] _lstobj) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_lstobj}));}
RDebugUtils.currentLine=175046656;
 //BA.debugLineNum = 175046656;BA.debugLine="Public Sub Initialize(Activity As Activity, lstobj";
RDebugUtils.currentLine=175046657;
 //BA.debugLineNum = 175046657;BA.debugLine="ALERT_VIEW = 0";
__ref._alert_view /*int*/  = (int) (0);
RDebugUtils.currentLine=175046658;
 //BA.debugLineNum = 175046658;BA.debugLine="TASK_VIEW = 1";
__ref._task_view /*int*/  = (int) (1);
RDebugUtils.currentLine=175046659;
 //BA.debugLineNum = 175046659;BA.debugLine="ACTION_VIEW = 2";
__ref._action_view /*int*/  = (int) (2);
RDebugUtils.currentLine=175046661;
 //BA.debugLineNum = 175046661;BA.debugLine="ActivityReference = Activity";
__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activity;
RDebugUtils.currentLine=175046664;
 //BA.debugLineNum = 175046664;BA.debugLine="listAlerts = lstobj(ALERT_VIEW)";
__ref._listalerts /*b4a.example3.customlistview*/  = _lstobj[__ref._alert_view /*int*/ ];
RDebugUtils.currentLine=175046666;
 //BA.debugLineNum = 175046666;BA.debugLine="listTasks = lstobj(TASK_VIEW)";
__ref._listtasks /*b4a.example3.customlistview*/  = _lstobj[__ref._task_view /*int*/ ];
RDebugUtils.currentLine=175046668;
 //BA.debugLineNum = 175046668;BA.debugLine="listActions = lstobj(ACTION_VIEW)";
__ref._listactions /*b4a.example3.customlistview*/  = _lstobj[__ref._action_view /*int*/ ];
RDebugUtils.currentLine=175046670;
 //BA.debugLineNum = 175046670;BA.debugLine="TasksList.Initialize";
__ref._taskslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=175046671;
 //BA.debugLineNum = 175046671;BA.debugLine="ItemsCounter = 0";
__ref._itemscounter /*int*/  = (int) (0);
RDebugUtils.currentLine=175046672;
 //BA.debugLineNum = 175046672;BA.debugLine="End Sub";
return "";
}
public String  _alertobjectselected(xevolution.vrcg.devdemov2400.structalerts __ref,String _currentselectedcode,anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "alertobjectselected", false))
	 {return ((String) Debug.delegate(ba, "alertobjectselected", new Object[] {_currentselectedcode,_pnl}));}
boolean _continua = false;
anywheresoftware.b4a.objects.collections.List _ldata = null;
String _tagcode = "";
RDebugUtils.currentLine=176881664;
 //BA.debugLineNum = 176881664;BA.debugLine="Sub AlertObjectSelected(CurrentSelectedCode As Str";
RDebugUtils.currentLine=176881665;
 //BA.debugLineNum = 176881665;BA.debugLine="Dim Continua As Boolean = True";
_continua = __c.True;
RDebugUtils.currentLine=176881666;
 //BA.debugLineNum = 176881666;BA.debugLine="Dim ldata As List = Regex.Split(\"\\|\", Pnl.tag )";
_ldata = new anywheresoftware.b4a.objects.collections.List();
_ldata = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|",BA.ObjectToString(_pnl.getTag())));
RDebugUtils.currentLine=176881667;
 //BA.debugLineNum = 176881667;BA.debugLine="Try";
try {RDebugUtils.currentLine=176881668;
 //BA.debugLineNum = 176881668;BA.debugLine="Dim TagCode As String = ldata.Get(0)";
_tagcode = BA.ObjectToString(_ldata.Get((int) (0)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=176881670;
 //BA.debugLineNum = 176881670;BA.debugLine="Log(LastException)";
__c.LogImpl("6176881670",BA.ObjectToString(__c.LastException(ba)),0);
RDebugUtils.currentLine=176881671;
 //BA.debugLineNum = 176881671;BA.debugLine="Continua = False";
_continua = __c.False;
 };
RDebugUtils.currentLine=176881674;
 //BA.debugLineNum = 176881674;BA.debugLine="If (Continua) Then";
if ((_continua)) { 
RDebugUtils.currentLine=176881675;
 //BA.debugLineNum = 176881675;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF087)  'No";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr((int) (0xf087))));
RDebugUtils.currentLine=176881676;
 //BA.debugLineNum = 176881676;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Colo";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorgreen /*int*/ );
RDebugUtils.currentLine=176881677;
 //BA.debugLineNum = 176881677;BA.debugLine="updateTaskItemView(Pnl, TagCode, 1, 0, CurrentSe";
__ref._updatetaskitemview /*void*/ (null,_pnl,_tagcode,BA.NumberToString(1),(int) (0),_currentselectedcode);
 };
RDebugUtils.currentLine=176881680;
 //BA.debugLineNum = 176881680;BA.debugLine="End Sub";
return "";
}
public String  _actionitemclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "actionitemclick", false))
	 {return ((String) Debug.delegate(ba, "actionitemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.collections.List _info = null;
int _val = 0;
RDebugUtils.currentLine=175898624;
 //BA.debugLineNum = 175898624;BA.debugLine="Public Sub ActionItemClick (Index As Int, Value As";
RDebugUtils.currentLine=175898625;
 //BA.debugLineNum = 175898625;BA.debugLine="Dim pnl As Panel = listActions.GetPanel(Index)";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._listactions /*b4a.example3.customlistview*/ ._getpanel(_index).getObject()));
RDebugUtils.currentLine=175898627;
 //BA.debugLineNum = 175898627;BA.debugLine="Dim info As List = Regex.Split(\"\\|\", pnl.tag )";
_info = new anywheresoftware.b4a.objects.collections.List();
_info = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|",BA.ObjectToString(_pnl.getTag())));
RDebugUtils.currentLine=175898629;
 //BA.debugLineNum = 175898629;BA.debugLine="Dim val As Int = info.Get(1)";
_val = (int)(BA.ObjectToNumber(_info.Get((int) (1))));
RDebugUtils.currentLine=175898631;
 //BA.debugLineNum = 175898631;BA.debugLine="If (val = 0) Then";
if ((_val==0)) { 
 };
RDebugUtils.currentLine=175898658;
 //BA.debugLineNum = 175898658;BA.debugLine="Log(\"listRecordsView_ItemClick\")";
__c.LogImpl("6175898658","listRecordsView_ItemClick",0);
RDebugUtils.currentLine=175898660;
 //BA.debugLineNum = 175898660;BA.debugLine="End Sub";
return "";
}
public String  _alertitemclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "alertitemclick", false))
	 {return ((String) Debug.delegate(ba, "alertitemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=176488448;
 //BA.debugLineNum = 176488448;BA.debugLine="Public Sub AlertItemClick (Index As Int, Value As";
RDebugUtils.currentLine=176488452;
 //BA.debugLineNum = 176488452;BA.debugLine="Log(\"listRecordsView_ItemClick\")";
__c.LogImpl("6176488452","listRecordsView_ItemClick",0);
RDebugUtils.currentLine=176488453;
 //BA.debugLineNum = 176488453;BA.debugLine="End Sub";
return "";
}
public int  _listalertsrecords(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "listalertsrecords", false))
	 {return ((Integer) Debug.delegate(ba, "listalertsrecords", null));}
RDebugUtils.currentLine=175767552;
 //BA.debugLineNum = 175767552;BA.debugLine="public Sub ListAlertsRecords As Int";
RDebugUtils.currentLine=175767553;
 //BA.debugLineNum = 175767553;BA.debugLine="Return listAlerts.Size";
if (true) return __ref._listalerts /*b4a.example3.customlistview*/ ._getsize();
RDebugUtils.currentLine=175767554;
 //BA.debugLineNum = 175767554;BA.debugLine="End Sub";
return 0;
}
public int  _startalerts(xevolution.vrcg.devdemov2400.structalerts __ref,boolean _clear) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "startalerts", false))
	 {return ((Integer) Debug.delegate(ba, "startalerts", new Object[] {_clear}));}
int _height = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
int _nrows = 0;
int _row = 0;
String _alrtype = "";
RDebugUtils.currentLine=175177728;
 //BA.debugLineNum = 175177728;BA.debugLine="Public Sub StartAlerts(clear As Boolean) As Int";
RDebugUtils.currentLine=175177729;
 //BA.debugLineNum = 175177729;BA.debugLine="If (clear) Then";
if ((_clear)) { 
RDebugUtils.currentLine=175177730;
 //BA.debugLineNum = 175177730;BA.debugLine="listAlerts.Clear";
__ref._listalerts /*b4a.example3.customlistview*/ ._clear();
 };
RDebugUtils.currentLine=175177736;
 //BA.debugLineNum = 175177736;BA.debugLine="Dim height As Int = 65dip";
_height = __c.DipToCurrent((int) (65));
RDebugUtils.currentLine=175177737;
 //BA.debugLineNum = 175177737;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((_sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=175177738;
 //BA.debugLineNum = 175177738;BA.debugLine="height = 120dip";
_height = __c.DipToCurrent((int) (120));
 };
RDebugUtils.currentLine=175177740;
 //BA.debugLineNum = 175177740;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=175177741;
 //BA.debugLineNum = 175177741;BA.debugLine="ItemsCounter = 0";
__ref._itemscounter /*int*/  = (int) (0);
RDebugUtils.currentLine=175177742;
 //BA.debugLineNum = 175177742;BA.debugLine="Dim SQL As String = $\"select ifnull(tagcode,'') a";
_sql = ("select ifnull(tagcode,'') as tagcode, ifnull(title,'') as title,\n"+"						ifnull(date_verification,'') as date_verification, status_id, kind_data, id,\n"+"						'' as obs, '' as imagename, alert_type from dta_alerts where 1=1\n"+"						 and alert_type = 'ALRTTYP_NOTIFY' and alert_visible=1 and active = 1\n"+"                         or alert_type = 'ALRTTYP_SMS' and alert_visible=1 and active = 1\n"+"						 or alert_type = 'ALRTTYP_ALERT' and alert_visible=1 and active = 1\n"+"                         or alert_type = 'ALRTTYP_EMAIL' and alert_visible=1 and active = 1");
RDebugUtils.currentLine=175177751;
 //BA.debugLineNum = 175177751;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=175177753;
 //BA.debugLineNum = 175177753;BA.debugLine="Dim nRows As Int = Record.RowCount";
_nrows = _record.getRowCount();
RDebugUtils.currentLine=175177754;
 //BA.debugLineNum = 175177754;BA.debugLine="ShareCode.SystemAlertsCount = nRows";
_sharecode._systemalertscount /*int*/  = _nrows;
RDebugUtils.currentLine=175177755;
 //BA.debugLineNum = 175177755;BA.debugLine="If nRows > 0 Then";
if (_nrows>0) { 
RDebugUtils.currentLine=175177756;
 //BA.debugLineNum = 175177756;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit15 ;_row = _row + step15 ) {
RDebugUtils.currentLine=175177757;
 //BA.debugLineNum = 175177757;BA.debugLine="ItemsCounter = ItemsCounter + 1";
__ref._itemscounter /*int*/  = (int) (__ref._itemscounter /*int*/ +1);
RDebugUtils.currentLine=175177758;
 //BA.debugLineNum = 175177758;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=175177759;
 //BA.debugLineNum = 175177759;BA.debugLine="Dim ALRTYPE As String = Record.GetString(\"alert";
_alrtype = _record.GetString("alert_type");
RDebugUtils.currentLine=175177760;
 //BA.debugLineNum = 175177760;BA.debugLine="listAlerts.Add( CreateAlertItem( nRows, Record,";
__ref._listalerts /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createalertitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_nrows,_record,__ref._listalerts /*b4a.example3.customlistview*/ ._asview().getWidth(),_height,(anywheresoftware.b4a.objects.drawable.BitmapDrawable) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.BitmapDrawable(), (android.graphics.drawable.BitmapDrawable)(__c.Null))).getObject())),(Object)(_alrtype));
 }
};
 };
RDebugUtils.currentLine=175177763;
 //BA.debugLineNum = 175177763;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=175177766;
 //BA.debugLineNum = 175177766;BA.debugLine="End Sub";
return 0;
}
public int  _listtaskrecords(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "listtaskrecords", false))
	 {return ((Integer) Debug.delegate(ba, "listtaskrecords", null));}
RDebugUtils.currentLine=175308800;
 //BA.debugLineNum = 175308800;BA.debugLine="Public Sub ListTaskRecords As Int";
RDebugUtils.currentLine=175308801;
 //BA.debugLineNum = 175308801;BA.debugLine="Return listTasks.Size";
if (true) return __ref._listtasks /*b4a.example3.customlistview*/ ._getsize();
RDebugUtils.currentLine=175308802;
 //BA.debugLineNum = 175308802;BA.debugLine="End Sub";
return 0;
}
public int  _starttasks(xevolution.vrcg.devdemov2400.structalerts __ref,boolean _clear) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "starttasks", false))
	 {return ((Integer) Debug.delegate(ba, "starttasks", new Object[] {_clear}));}
int _height = 0;
String _cdate = "";
String _sql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _nrows = 0;
int _row = 0;
String _alrtype = "";
RDebugUtils.currentLine=175243264;
 //BA.debugLineNum = 175243264;BA.debugLine="Public Sub StartTasks(clear As Boolean) As Int";
RDebugUtils.currentLine=175243265;
 //BA.debugLineNum = 175243265;BA.debugLine="If (clear) Then";
if ((_clear)) { 
RDebugUtils.currentLine=175243266;
 //BA.debugLineNum = 175243266;BA.debugLine="listTasks.Clear";
__ref._listtasks /*b4a.example3.customlistview*/ ._clear();
 };
RDebugUtils.currentLine=175243272;
 //BA.debugLineNum = 175243272;BA.debugLine="Dim height As Int = 65dip";
_height = __c.DipToCurrent((int) (65));
RDebugUtils.currentLine=175243273;
 //BA.debugLineNum = 175243273;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((_sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=175243274;
 //BA.debugLineNum = 175243274;BA.debugLine="height = 120dip";
_height = __c.DipToCurrent((int) (120));
 };
RDebugUtils.currentLine=175243277;
 //BA.debugLineNum = 175243277;BA.debugLine="ItemsCounter = 0";
__ref._itemscounter /*int*/  = (int) (0);
RDebugUtils.currentLine=175243278;
 //BA.debugLineNum = 175243278;BA.debugLine="Dim cDate As String = Utils.GetLastWeekDate";
_cdate = _utils._getlastweekdate /*String*/ (ba);
RDebugUtils.currentLine=175243280;
 //BA.debugLineNum = 175243280;BA.debugLine="Dim SQL As String = $\"select distinct ifnull(a.ta";
_sql = ("select distinct ifnull(a.tagcode,'') as tagcode, ifnull(a.title,'') as title,\n"+"			ifnull(a.date_verification,'') as date_verification, a.status_id, a.kind_data, a.id,\n"+"			(select obs from dta_alerts_images where tagcode=a.tagcode) as obs,\n"+"			(select imagename from dta_alerts_images where tagcode=a.tagcode) as imagename,\n"+"			a.alert_type from dta_alerts as a\n"+"			where a.alert_visible=1 \n"+"				and a.user_tagcode='"+__c.SmartStringFormatter("",(Object)(_sharecode._sess_oper_user /*String*/ ))+"' \n"+"				and a.alert_type != 'ALRTTYP_NOTIFY'\n"+"				and a.alert_type != 'ALRTTYP_EMAIL'\n"+"				and a.alert_type != 'ALRTTYP_SMS'\n"+"				and a.alert_type != 'ALRTTYP_ALERT'\n"+"				and a.active=1 \n"+"				and a.date_alert>='"+__c.SmartStringFormatter("",(Object)(_cdate))+"'");
RDebugUtils.currentLine=175243294;
 //BA.debugLineNum = 175243294;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=175243296;
 //BA.debugLineNum = 175243296;BA.debugLine="Dim nRows As Int = Record.RowCount";
_nrows = _record.getRowCount();
RDebugUtils.currentLine=175243297;
 //BA.debugLineNum = 175243297;BA.debugLine="ShareCode.TasksAlertsCount = nRows";
_sharecode._tasksalertscount /*int*/  = _nrows;
RDebugUtils.currentLine=175243298;
 //BA.debugLineNum = 175243298;BA.debugLine="If nRows > 0 Then";
if (_nrows>0) { 
RDebugUtils.currentLine=175243299;
 //BA.debugLineNum = 175243299;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit15 ;_row = _row + step15 ) {
RDebugUtils.currentLine=175243300;
 //BA.debugLineNum = 175243300;BA.debugLine="ItemsCounter = ItemsCounter + 1";
__ref._itemscounter /*int*/  = (int) (__ref._itemscounter /*int*/ +1);
RDebugUtils.currentLine=175243301;
 //BA.debugLineNum = 175243301;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=175243302;
 //BA.debugLineNum = 175243302;BA.debugLine="Dim ALRTYPE As String = Record.GetString(\"alert";
_alrtype = _record.GetString("alert_type");
RDebugUtils.currentLine=175243303;
 //BA.debugLineNum = 175243303;BA.debugLine="listTasks.Add( CreateTaskItem( nRows, Record, l";
__ref._listtasks /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createtaskitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_nrows,_record,__ref._listtasks /*b4a.example3.customlistview*/ ._asview().getWidth(),_height,(anywheresoftware.b4a.objects.drawable.BitmapDrawable) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.BitmapDrawable(), (android.graphics.drawable.BitmapDrawable)(__c.Null))).getObject())),(Object)(_alrtype));
 }
};
 };
RDebugUtils.currentLine=175243306;
 //BA.debugLineNum = 175243306;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=175243307;
 //BA.debugLineNum = 175243307;BA.debugLine="End Sub";
return 0;
}
public int  _listactionrecords(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "listactionrecords", false))
	 {return ((Integer) Debug.delegate(ba, "listactionrecords", null));}
RDebugUtils.currentLine=175702016;
 //BA.debugLineNum = 175702016;BA.debugLine="Public Sub ListActionRecords As Int";
RDebugUtils.currentLine=175702017;
 //BA.debugLineNum = 175702017;BA.debugLine="Return listActions.Size";
if (true) return __ref._listactions /*b4a.example3.customlistview*/ ._getsize();
RDebugUtils.currentLine=175702018;
 //BA.debugLineNum = 175702018;BA.debugLine="End Sub";
return 0;
}
public int  _startactions(xevolution.vrcg.devdemov2400.structalerts __ref,boolean _clear) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "startactions", false))
	 {return ((Integer) Debug.delegate(ba, "startactions", new Object[] {_clear}));}
int _height = 0;
String _sql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _row = 0;
RDebugUtils.currentLine=175636480;
 //BA.debugLineNum = 175636480;BA.debugLine="Public Sub StartActions(clear As Boolean) As Int";
RDebugUtils.currentLine=175636481;
 //BA.debugLineNum = 175636481;BA.debugLine="If (clear) Then";
if ((_clear)) { 
RDebugUtils.currentLine=175636482;
 //BA.debugLineNum = 175636482;BA.debugLine="listActions.Clear";
__ref._listactions /*b4a.example3.customlistview*/ ._clear();
 };
RDebugUtils.currentLine=175636487;
 //BA.debugLineNum = 175636487;BA.debugLine="Dim height As Int = 90dip";
_height = __c.DipToCurrent((int) (90));
RDebugUtils.currentLine=175636488;
 //BA.debugLineNum = 175636488;BA.debugLine="ItemsCounter = 0";
__ref._itemscounter /*int*/  = (int) (0);
RDebugUtils.currentLine=175636490;
 //BA.debugLineNum = 175636490;BA.debugLine="Dim SQL As String = $\"select ifnull(b.tagdesc,'')";
_sql = ("select ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,\n"+"								ifnull(d.tagdesc,'') as urgency_desc, a.id, a.request_tagcode, a.repeatcounter, a.repeatitemcounter,\n"+"								a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.updated_at as actiondatetime,\n"+"								ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, ifnull(a.email_to, '') as email_to,\n"+"								ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,\n"+"								a.priority_tagcode,  ifnull(a.title,'') as title, a.gravity_tagcode,  a.due_date, b.tagcode as operation_type,\n"+"								a1.technical_tagcode, a1.sess_user, a2.inner_title, a3.title AS checklist\n"+"								from dta_actions as a \n"+"								INNER JOIN dta_requests AS a1 ON (a1.tagcode=a.request_tagcode)\n"+"								INNER JOIN dta_requests_relations AS a2 ON (a2.request_tagcode=a1.tagcode AND a2.relation_tagcode=a.action_tagcode)\n"+"								left JOIN dta_tasks AS a3 ON (a3.tagcode=a2.relation_tagcode)\n"+"								left join type_operationtypes as b ON (b.tagcode=(SELECT operation_type FROM dta_actions_items \n"+"									WHERE actions_tagcode=a.tagcode \n"+"									ORDER BY updated_at DESC LIMIT 1))\n"+"								left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)\n"+"								left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)\n"+"								where 1=1 and\n"+"								a.operation_type Not in ('TOPERT_04') and\n"+"								b.tagcode Not in ('TOPERT_04') and\n"+"								a.technical_tagcode='"+__c.SmartStringFormatter("",(Object)(_sharecode._sess_oper_user /*String*/ ))+"'  \n"+"								order by a.request_tagcode, a.task_tagcode, a.id desc ");
RDebugUtils.currentLine=175636512;
 //BA.debugLineNum = 175636512;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=175636513;
 //BA.debugLineNum = 175636513;BA.debugLine="Dim ItemsCounter As Int = Record.RowCount";
_itemscounter = _record.getRowCount();
RDebugUtils.currentLine=175636514;
 //BA.debugLineNum = 175636514;BA.debugLine="ShareCode.RequestsAlertsCount = ItemsCounter";
_sharecode._requestsalertscount /*int*/  = __ref._itemscounter /*int*/ ;
RDebugUtils.currentLine=175636515;
 //BA.debugLineNum = 175636515;BA.debugLine="If ItemsCounter > 0 Then";
if (__ref._itemscounter /*int*/ >0) { 
RDebugUtils.currentLine=175636516;
 //BA.debugLineNum = 175636516;BA.debugLine="For Row = 0 To ItemsCounter-1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._itemscounter /*int*/ -1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
RDebugUtils.currentLine=175636517;
 //BA.debugLineNum = 175636517;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=175636518;
 //BA.debugLineNum = 175636518;BA.debugLine="listActions.Add(CreateActionItem(Row, Record, l";
__ref._listactions /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createactionitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,_row,_record,__ref._listactions /*b4a.example3.customlistview*/ ._asview().getWidth(),_height).getObject())),(Object)(""));
 }
};
 };
RDebugUtils.currentLine=175636522;
 //BA.debugLineNum = 175636522;BA.debugLine="Return ItemsCounter";
if (true) return __ref._itemscounter /*int*/ ;
RDebugUtils.currentLine=175636523;
 //BA.debugLineNum = 175636523;BA.debugLine="End Sub";
return 0;
}
public String  _taskitemclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "taskitemclick", false))
	 {return ((String) Debug.delegate(ba, "taskitemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.collections.List _info = null;
String _tagcode = "";
int _val = 0;
xevolution.vrcg.devdemov2400.types._imageviewdata _imgdata = null;
anywheresoftware.b4a.objects.collections.List _imglist = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
int _nrows = 0;
int _row = 0;
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=176553984;
 //BA.debugLineNum = 176553984;BA.debugLine="Public Sub TaskItemClick (Index As Int, Value As O";
RDebugUtils.currentLine=176553985;
 //BA.debugLineNum = 176553985;BA.debugLine="Dim pnl As Panel = listTasks.GetPanel(Index)";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._listtasks /*b4a.example3.customlistview*/ ._getpanel(_index).getObject()));
RDebugUtils.currentLine=176553987;
 //BA.debugLineNum = 176553987;BA.debugLine="Dim info As List = Regex.Split(\"\\|\", pnl.tag )";
_info = new anywheresoftware.b4a.objects.collections.List();
_info = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|",BA.ObjectToString(_pnl.getTag())));
RDebugUtils.currentLine=176553988;
 //BA.debugLineNum = 176553988;BA.debugLine="Dim tagcode As String = info.Get(0)";
_tagcode = BA.ObjectToString(_info.Get((int) (0)));
RDebugUtils.currentLine=176553989;
 //BA.debugLineNum = 176553989;BA.debugLine="Dim val As Int = info.Get(1)";
_val = (int)(BA.ObjectToNumber(_info.Get((int) (1))));
RDebugUtils.currentLine=176553991;
 //BA.debugLineNum = 176553991;BA.debugLine="If (val = 0) Then";
if ((_val==0)) { 
RDebugUtils.currentLine=176553992;
 //BA.debugLineNum = 176553992;BA.debugLine="Dim imgdata As ImageViewData = Types.MakeImageVi";
_imgdata = _types._makeimageviewdataclear /*xevolution.vrcg.devdemov2400.types._imageviewdata*/ (ba);
RDebugUtils.currentLine=176553993;
 //BA.debugLineNum = 176553993;BA.debugLine="Dim imgList As List";
_imglist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=176553994;
 //BA.debugLineNum = 176553994;BA.debugLine="imgList.Initialize";
_imglist.Initialize();
RDebugUtils.currentLine=176553995;
 //BA.debugLineNum = 176553995;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=176553996;
 //BA.debugLineNum = 176553996;BA.debugLine="ItemsCounter = 0";
__ref._itemscounter /*int*/  = (int) (0);
RDebugUtils.currentLine=176553997;
 //BA.debugLineNum = 176553997;BA.debugLine="Dim SQL As String = $\"select id,tagcode,imageb64";
_sql = ("select id,tagcode,imageb64,imagename\n"+"							from dta_alerts_images\n"+"							where 1=1 and tagcode='"+__c.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=176554000;
 //BA.debugLineNum = 176554000;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=176554002;
 //BA.debugLineNum = 176554002;BA.debugLine="Dim nRows As Int = Record.RowCount";
_nrows = _record.getRowCount();
RDebugUtils.currentLine=176554003;
 //BA.debugLineNum = 176554003;BA.debugLine="If nRows > 0 Then";
if (_nrows>0) { 
RDebugUtils.currentLine=176554004;
 //BA.debugLineNum = 176554004;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit15 ;_row = _row + step15 ) {
RDebugUtils.currentLine=176554005;
 //BA.debugLineNum = 176554005;BA.debugLine="ItemsCounter = ItemsCounter + 1";
__ref._itemscounter /*int*/  = (int) (__ref._itemscounter /*int*/ +1);
RDebugUtils.currentLine=176554006;
 //BA.debugLineNum = 176554006;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=176554007;
 //BA.debugLineNum = 176554007;BA.debugLine="Dim imgdata As ImageViewData = Types.MakeImage";
_imgdata = _types._makeimageviewdata /*xevolution.vrcg.devdemov2400.types._imageviewdata*/ (ba,_record.GetString("imageb64"),_record.GetString("imagename"));
RDebugUtils.currentLine=176554008;
 //BA.debugLineNum = 176554008;BA.debugLine="imgList.Add(imgdata)";
_imglist.Add((Object)(_imgdata));
 }
};
 }else {
RDebugUtils.currentLine=176554011;
 //BA.debugLineNum = 176554011;BA.debugLine="imgList.Add(imgdata)";
_imglist.Add((Object)(_imgdata));
 };
RDebugUtils.currentLine=176554013;
 //BA.debugLineNum = 176554013;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=176554015;
 //BA.debugLineNum = 176554015;BA.debugLine="If Utils.NNE(imgdata.b64) Then";
if (_utils._nne /*boolean*/ (ba,_imgdata.b64 /*String*/ )) { 
RDebugUtils.currentLine=176554016;
 //BA.debugLineNum = 176554016;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=176554017;
 //BA.debugLineNum = 176554017;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=176554018;
 //BA.debugLineNum = 176554018;BA.debugLine="Filter.getShowImageViewListDialog(Me, imgList)";
_filter._getshowimageviewlistdialog /*void*/ (null,this,_imglist);
 };
 };
RDebugUtils.currentLine=176554022;
 //BA.debugLineNum = 176554022;BA.debugLine="End Sub";
return "";
}
public void  _updatetaskitemview(xevolution.vrcg.devdemov2400.structalerts __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl,String _tagcode,String _sts,int _active,String _newobject) throws Exception{
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "updatetaskitemview", false))
	 {Debug.delegate(ba, "updatetaskitemview", new Object[] {_pnl,_tagcode,_sts,_active,_newobject}); return;}
ResumableSub_updateTaskItemView rsub = new ResumableSub_updateTaskItemView(this,__ref,_pnl,_tagcode,_sts,_active,_newobject);
rsub.resume(ba, null);
}
public static class ResumableSub_updateTaskItemView extends BA.ResumableSub {
public ResumableSub_updateTaskItemView(xevolution.vrcg.devdemov2400.structalerts parent,xevolution.vrcg.devdemov2400.structalerts __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl,String _tagcode,String _sts,int _active,String _newobject) {
this.parent = parent;
this.__ref = __ref;
this._pnl = _pnl;
this._tagcode = _tagcode;
this._sts = _sts;
this._active = _active;
this._newobject = _newobject;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.structalerts __ref;
xevolution.vrcg.devdemov2400.structalerts parent;
anywheresoftware.b4a.objects.PanelWrapper _pnl;
String _tagcode;
String _sts;
int _active;
String _newobject;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
xevolution.vrcg.devdemov2400.b4xstatebutton _this_b = null;
String _cdate = "";
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
String _group_tags = "";
boolean _continua = false;
anywheresoftware.b4a.sql.SQL.CursorWrapper _alertimage = null;
String _imageb64 = "";
String _imagename = "";
int _maxid = 0;
anywheresoftware.b4a.BA.IterableList group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="structalerts";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=176947202;
 //BA.debugLineNum = 176947202;BA.debugLine="ProgressDialogShow2(ShareCode.AvisoAguarde, False";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._avisoaguarde /*String*/ ),parent.__c.False);
RDebugUtils.currentLine=176947203;
 //BA.debugLineNum = 176947203;BA.debugLine="For Each v As View In Pnl.GetAllViewsRecursive";
if (true) break;

case 1:
//for
this.state = 8;
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
group2 = _pnl.GetAllViewsRecursive();
index2 = 0;
groupLen2 = group2.getSize();
this.state = 32;
if (true) break;

case 32:
//C
this.state = 8;
if (index2 < groupLen2) {
this.state = 3;
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group2.Get(index2)));}
if (true) break;

case 33:
//C
this.state = 32;
index2++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=176947204;
 //BA.debugLineNum = 176947204;BA.debugLine="If (v.tag Is B4XStateButton) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_v.getTag() instanceof xevolution.vrcg.devdemov2400.b4xstatebutton)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=176947205;
 //BA.debugLineNum = 176947205;BA.debugLine="Dim this_b As B4XStateButton = v.tag";
_this_b = (xevolution.vrcg.devdemov2400.b4xstatebutton)(_v.getTag());
RDebugUtils.currentLine=176947206;
 //BA.debugLineNum = 176947206;BA.debugLine="this_b.AllowClick = False";
_this_b._setallowclick /*boolean*/ (null,parent.__c.False);
 if (true) break;

case 7:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=176947210;
 //BA.debugLineNum = 176947210;BA.debugLine="Dim cDate As String = Utils.GetCurrentDate";
_cdate = parent._utils._getcurrentdate /*String*/ (ba);
RDebugUtils.currentLine=176947211;
 //BA.debugLineNum = 176947211;BA.debugLine="Dim sSQL As String = $\"update dta_alerts set stat";
_ssql = ("update dta_alerts set status_id='"+parent.__c.SmartStringFormatter("",(Object)(_sts))+"', active='"+parent.__c.SmartStringFormatter("",(Object)(_active))+"', \n"+"							date_verification='"+parent.__c.SmartStringFormatter("",(Object)(_cdate))+"' \n"+"							where tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=176947214;
 //BA.debugLineNum = 176947214;BA.debugLine="Utils.SaveSQLToLog(\"CLAItemButton_StateClick\",sSQ";
parent._utils._savesqltolog /*boolean*/ (ba,"CLAItemButton_StateClick",_ssql,_tagcode);
RDebugUtils.currentLine=176947217;
 //BA.debugLineNum = 176947217;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=176947218;
 //BA.debugLineNum = 176947218;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=176947219;
 //BA.debugLineNum = 176947219;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=176947220;
 //BA.debugLineNum = 176947220;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=176947221;
 //BA.debugLineNum = 176947221;BA.debugLine="params.Put(\"tagcode\", Pnl.Tag)";
_params.Put((Object)("tagcode"),_pnl.getTag());
RDebugUtils.currentLine=176947222;
 //BA.debugLineNum = 176947222;BA.debugLine="params.Put(\"date_verification\", cDate)";
_params.Put((Object)("date_verification"),(Object)(_cdate));
RDebugUtils.currentLine=176947223;
 //BA.debugLineNum = 176947223;BA.debugLine="params.Put(\"status_id\", sts)";
_params.Put((Object)("status_id"),(Object)(_sts));
RDebugUtils.currentLine=176947224;
 //BA.debugLineNum = 176947224;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=176947225;
 //BA.debugLineNum = 176947225;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=176947226;
 //BA.debugLineNum = 176947226;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=176947227;
 //BA.debugLineNum = 176947227;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=176947228;
 //BA.debugLineNum = 176947228;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=176947229;
 //BA.debugLineNum = 176947229;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=176947230;
 //BA.debugLineNum = 176947230;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=176947231;
 //BA.debugLineNum = 176947231;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/alert/update");
RDebugUtils.currentLine=176947232;
 //BA.debugLineNum = 176947232;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 9:
//if
this.state = 14;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=176947233;
 //BA.debugLineNum = 176947233;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"","");
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=176947235;
 //BA.debugLineNum = 176947235;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (4),"","","");
RDebugUtils.currentLine=176947236;
 //BA.debugLineNum = 176947236;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=176947238;
 //BA.debugLineNum = 176947238;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structalerts", "updatetaskitemview"),(int) (500));
this.state = 34;
return;
case 34:
//C
this.state = 15;
;
RDebugUtils.currentLine=176947240;
 //BA.debugLineNum = 176947240;BA.debugLine="If Utils.NNE(NewObject) Then";
if (true) break;

case 15:
//if
this.state = 31;
if (parent._utils._nne /*boolean*/ (ba,_newobject)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=176947241;
 //BA.debugLineNum = 176947241;BA.debugLine="Dim group_tags As String = \"\"";
_group_tags = "";
RDebugUtils.currentLine=176947242;
 //BA.debugLineNum = 176947242;BA.debugLine="Dim Continua As Boolean = False";
_continua = parent.__c.False;
RDebugUtils.currentLine=176947243;
 //BA.debugLineNum = 176947243;BA.debugLine="Dim AlertImage As Cursor = Starter.LocalSQLEVC.E";
_alertimage = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_alertimage = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("Select a.imageb64, a.imagename, \n"+"											a.uniquekey, ifnull(b.group_tags, '') as group_tags\n"+"											from dta_alerts_images as a\n"+"											inner join dta_alerts as b on (b.tagcode=a.tagcode)\n"+"											where a.tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"'"))));
RDebugUtils.currentLine=176947248;
 //BA.debugLineNum = 176947248;BA.debugLine="If (AlertImage.RowCount >= 1) Then";
if (true) break;

case 18:
//if
this.state = 21;
if ((_alertimage.getRowCount()>=1)) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=176947249;
 //BA.debugLineNum = 176947249;BA.debugLine="AlertImage.Position = 0";
_alertimage.setPosition((int) (0));
RDebugUtils.currentLine=176947250;
 //BA.debugLineNum = 176947250;BA.debugLine="Dim imageb64 As String = Utils.IfNullOrEmpty(Al";
_imageb64 = parent._utils._ifnullorempty /*String*/ (ba,_alertimage.GetString("imageb64"),"");
RDebugUtils.currentLine=176947251;
 //BA.debugLineNum = 176947251;BA.debugLine="Dim imagename As String = Utils.IfNullOrEmpty(A";
_imagename = parent._utils._ifnullorempty /*String*/ (ba,_alertimage.GetString("imagename"),"");
RDebugUtils.currentLine=176947253;
 //BA.debugLineNum = 176947253;BA.debugLine="Dim group_tags As String = Utils.IfNullOrEmpty(";
_group_tags = parent._utils._ifnullorempty /*String*/ (ba,_alertimage.GetString("group_tags"),"");
RDebugUtils.currentLine=176947255;
 //BA.debugLineNum = 176947255;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
_maxid = (int) (parent._dbstructures._getmaxofevc /*int*/ (ba,"dta_objects_images","id","")+1+1000000);
RDebugUtils.currentLine=176947256;
 //BA.debugLineNum = 176947256;BA.debugLine="Dim sSQL As String = $\"insert into dta_objects_";
_ssql = ("insert into dta_objects_images (id, object_tagcode, image, filename, request_tagcode, origin, title, sess_user) values\n"+"							("+parent.__c.SmartStringFormatter("",(Object)(_maxid))+", '"+parent.__c.SmartStringFormatter("",(Object)(_newobject))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_imageb64))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_imagename))+"', '__DUMMY__', 1, '"+parent.__c.SmartStringFormatter("",(Object)(_group_tags))+"', '"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._sess_oper_user /*String*/ ))+"')");
RDebugUtils.currentLine=176947258;
 //BA.debugLineNum = 176947258;BA.debugLine="Continua = Utils.SaveSQLToLog(\"CLAItemButton_St";
_continua = parent._utils._savesqltolog /*boolean*/ (ba,"CLAItemButton_StateClick",_ssql,_tagcode);
 if (true) break;
;
RDebugUtils.currentLine=176947261;
 //BA.debugLineNum = 176947261;BA.debugLine="If (Continua) Then";

case 21:
//if
this.state = 30;
if ((_continua)) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=176947262;
 //BA.debugLineNum = 176947262;BA.debugLine="Dim sSQL As String = $\"update dta_alerts_images";
_ssql = ("update dta_alerts_images set iu_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_newobject))+"',\n"+"							assigned=1, assigned_type='TASSGT_OBJECTS' \n"+"							where tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=176947265;
 //BA.debugLineNum = 176947265;BA.debugLine="Utils.SaveSQLToLog(\"AssignImageToObject\",sSQL,";
parent._utils._savesqltolog /*boolean*/ (ba,"AssignImageToObject",_ssql,_tagcode);
RDebugUtils.currentLine=176947267;
 //BA.debugLineNum = 176947267;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=176947268;
 //BA.debugLineNum = 176947268;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=176947269;
 //BA.debugLineNum = 176947269;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=176947270;
 //BA.debugLineNum = 176947270;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=176947271;
 //BA.debugLineNum = 176947271;BA.debugLine="params.Put(\"tagcode\", TagCode)";
_params.Put((Object)("tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=176947272;
 //BA.debugLineNum = 176947272;BA.debugLine="params.Put(\"iu_tagcode\", NewObject)";
_params.Put((Object)("iu_tagcode"),(Object)(_newobject));
RDebugUtils.currentLine=176947273;
 //BA.debugLineNum = 176947273;BA.debugLine="params.Put(\"assigned_type\", \"TASSGT_OBJECTS\")";
_params.Put((Object)("assigned_type"),(Object)("TASSGT_OBJECTS"));
RDebugUtils.currentLine=176947274;
 //BA.debugLineNum = 176947274;BA.debugLine="params.Put(\"sess_user\", ShareCode.SESS_OPER_Use";
_params.Put((Object)("sess_user"),(Object)(parent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=176947275;
 //BA.debugLineNum = 176947275;BA.debugLine="params.Put(\"group_tags\", group_tags)";
_params.Put((Object)("group_tags"),(Object)(_group_tags));
RDebugUtils.currentLine=176947276;
 //BA.debugLineNum = 176947276;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=176947277;
 //BA.debugLineNum = 176947277;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=176947278;
 //BA.debugLineNum = 176947278;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=176947279;
 //BA.debugLineNum = 176947279;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=176947280;
 //BA.debugLineNum = 176947280;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=176947281;
 //BA.debugLineNum = 176947281;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=176947282;
 //BA.debugLineNum = 176947282;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=176947283;
 //BA.debugLineNum = 176947283;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_D";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/alertimg/update");
RDebugUtils.currentLine=176947284;
 //BA.debugLineNum = 176947284;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 24:
//if
this.state = 29;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=176947285;
 //BA.debugLineNum = 176947285;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"","");
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=176947287;
 //BA.debugLineNum = 176947287;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (4),"","","");
RDebugUtils.currentLine=176947288;
 //BA.debugLineNum = 176947288;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=176947290;
 //BA.debugLineNum = 176947290;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structalerts", "updatetaskitemview"),(int) (500));
this.state = 35;
return;
case 35:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=176947293;
 //BA.debugLineNum = 176947293;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=176947294;
 //BA.debugLineNum = 176947294;BA.debugLine="CallSubDelayed2(Alerts, \"listsTabPanel_PageSelect";
parent.__c.CallSubDelayed2(ba,(Object)(parent._alerts.getObject()),"listsTabPanel_PageSelected2",(Object)(1));
RDebugUtils.currentLine=176947296;
 //BA.debugLineNum = 176947296;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnalertremove_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "btnalertremove_stateclick", false))
	 {Debug.delegate(ba, "btnalertremove_stateclick", new Object[] {_state}); return;}
ResumableSub_BtnAlertRemove_StateClick rsub = new ResumableSub_BtnAlertRemove_StateClick(this,__ref,_state);
rsub.resume(ba, null);
}
public static class ResumableSub_BtnAlertRemove_StateClick extends BA.ResumableSub {
public ResumableSub_BtnAlertRemove_StateClick(xevolution.vrcg.devdemov2400.structalerts parent,xevolution.vrcg.devdemov2400.structalerts __ref,int _state) {
this.parent = parent;
this.__ref = __ref;
this._state = _state;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.structalerts __ref;
xevolution.vrcg.devdemov2400.structalerts parent;
int _state;
xevolution.vrcg.devdemov2400.b4xstatebutton _btn = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _sts = 0;
boolean _continua = false;
anywheresoftware.b4a.objects.collections.List _ldata = null;
String _tagcode = "";
int _i = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="structalerts";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=177209346;
 //BA.debugLineNum = 177209346;BA.debugLine="Dim btn As B4XStateButton = Sender";
_btn = (xevolution.vrcg.devdemov2400.b4xstatebutton)(parent.__c.Sender(ba));
RDebugUtils.currentLine=177209347;
 //BA.debugLineNum = 177209347;BA.debugLine="Dim Pnl As Panel = btn.Parent";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_btn._getparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=177209348;
 //BA.debugLineNum = 177209348;BA.debugLine="Dim sts As Int = btn.State";
_sts = _btn._getstate /*int*/ (null);
RDebugUtils.currentLine=177209350;
 //BA.debugLineNum = 177209350;BA.debugLine="Dim Continua As Boolean = True";
_continua = parent.__c.True;
RDebugUtils.currentLine=177209351;
 //BA.debugLineNum = 177209351;BA.debugLine="Dim ldata As List = Regex.Split(\"\\|\", Pnl.tag )";
_ldata = new anywheresoftware.b4a.objects.collections.List();
_ldata = anywheresoftware.b4a.keywords.Common.ArrayToList(parent.__c.Regex.Split("\\|",BA.ObjectToString(_pnl.getTag())));
RDebugUtils.currentLine=177209352;
 //BA.debugLineNum = 177209352;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=177209353;
 //BA.debugLineNum = 177209353;BA.debugLine="Dim TagCode As String = ldata.Get(0)";
_tagcode = BA.ObjectToString(_ldata.Get((int) (0)));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=177209355;
 //BA.debugLineNum = 177209355;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("6177209355",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=177209356;
 //BA.debugLineNum = 177209356;BA.debugLine="Continua = False";
_continua = parent.__c.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=177209359;
 //BA.debugLineNum = 177209359;BA.debugLine="If (Continua) And (Utils.NNE(TagCode)) Then";

case 6:
//if
this.state = 15;
this.catchState = 0;
if ((_continua) && (parent._utils._nne /*boolean*/ (ba,_tagcode))) { 
this.state = 8;
}else {
this.state = 14;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=177209360;
 //BA.debugLineNum = 177209360;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.RemoveRecordCon";
_i = parent.__c.Msgbox2(BA.ObjectToCharSequence(parent._sharecode._removerecordconfirm /*String*/ ),BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*String*/ ),parent._sharecode._option_yes /*String*/ ,"",parent._sharecode._option_no /*String*/ ,(android.graphics.Bitmap)(parent.__c.Null),ba);
RDebugUtils.currentLine=177209361;
 //BA.debugLineNum = 177209361;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((_i==parent.__c.DialogResponse.POSITIVE)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=177209362;
 //BA.debugLineNum = 177209362;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF087)  'N";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr((int) (0xf087))));
RDebugUtils.currentLine=177209363;
 //BA.debugLineNum = 177209363;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Col";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent._consts._colorred /*int*/ );
RDebugUtils.currentLine=177209364;
 //BA.debugLineNum = 177209364;BA.debugLine="sts = 2";
_sts = (int) (2);
RDebugUtils.currentLine=177209365;
 //BA.debugLineNum = 177209365;BA.debugLine="updateTaskItemView(Pnl, TagCode, sts, 0, \"\")";
__ref._updatetaskitemview /*void*/ (null,_pnl,_tagcode,BA.NumberToString(_sts),(int) (0),"");
RDebugUtils.currentLine=177209367;
 //BA.debugLineNum = 177209367;BA.debugLine="StartAlerts(True)";
__ref._startalerts /*int*/ (null,parent.__c.True);
RDebugUtils.currentLine=177209368;
 //BA.debugLineNum = 177209368;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
parent.__c.CallSubDebug(ba,(Object)(parent._mainmenu.getObject()),"BadgeCheckUpdate");
RDebugUtils.currentLine=177209369;
 //BA.debugLineNum = 177209369;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structalerts", "btnalertremove_stateclick"),(int) (500));
this.state = 16;
return;
case 16:
//C
this.state = 12;
;
RDebugUtils.currentLine=177209370;
 //BA.debugLineNum = 177209370;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*String*/ ),parent.__c.False);
RDebugUtils.currentLine=177209371;
 //BA.debugLineNum = 177209371;BA.debugLine="CallSubDelayed(Alerts,\"UpdateAlertsText\")";
parent.__c.CallSubDelayed(ba,(Object)(parent._alerts.getObject()),"UpdateAlertsText");
RDebugUtils.currentLine=177209372;
 //BA.debugLineNum = 177209372;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structalerts", "btnalertremove_stateclick"),(int) (500));
this.state = 17;
return;
case 17:
//C
this.state = 12;
;
RDebugUtils.currentLine=177209373;
 //BA.debugLineNum = 177209373;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=177209376;
 //BA.debugLineNum = 177209376;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF088)  'No";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr((int) (0xf088))));
RDebugUtils.currentLine=177209377;
 //BA.debugLineNum = 177209377;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Colo";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent._consts._colorgray /*int*/ );
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=177209379;
 //BA.debugLineNum = 177209379;BA.debugLine="End Sub";
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
public String  _claactionadd_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "claactionadd_stateclick", false))
	 {return ((String) Debug.delegate(ba, "claactionadd_stateclick", new Object[] {_state}));}
RDebugUtils.currentLine=176357376;
 //BA.debugLineNum = 176357376;BA.debugLine="Sub CLAActionAdd_StateClick (State As Int)";
RDebugUtils.currentLine=176357394;
 //BA.debugLineNum = 176357394;BA.debugLine="End Sub";
return "";
}
public String  _claactionoptions_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "claactionoptions_stateclick", false))
	 {return ((String) Debug.delegate(ba, "claactionoptions_stateclick", new Object[] {_state}));}
RDebugUtils.currentLine=176291840;
 //BA.debugLineNum = 176291840;BA.debugLine="Sub CLAActionOptions_StateClick (State As Int)";
RDebugUtils.currentLine=176291842;
 //BA.debugLineNum = 176291842;BA.debugLine="End Sub";
return "";
}
public String  _clabuttonoptions_click(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "clabuttonoptions_click", false))
	 {return ((String) Debug.delegate(ba, "clabuttonoptions_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _claitem = null;
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
RDebugUtils.currentLine=175505408;
 //BA.debugLineNum = 175505408;BA.debugLine="Sub CLAButtonOptions_Click";
RDebugUtils.currentLine=175505409;
 //BA.debugLineNum = 175505409;BA.debugLine="Dim Btn As Button = Sender 'CLAButtonOptions.Tag";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=175505410;
 //BA.debugLineNum = 175505410;BA.debugLine="Dim CLAItem As RequestCLAItem = Btn.Tag";
_claitem = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_btn.getTag());
RDebugUtils.currentLine=175505411;
 //BA.debugLineNum = 175505411;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=175505412;
 //BA.debugLineNum = 175505412;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=175505413;
 //BA.debugLineNum = 175505413;BA.debugLine="Filter.GetMoreActionsDialog(ActivityReference, \"A";
_filter._getmoreactionsdialog /*void*/ (null,__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,(Object)("Alerts"),_claitem,(int) (0),"","",(int) (0),__ref._getpressedanswertagcode /*String*/ (null,_claitem),"","",(int) (0));
RDebugUtils.currentLine=175505414;
 //BA.debugLineNum = 175505414;BA.debugLine="End Sub";
return "";
}
public String  _getpressedanswertagcode(xevolution.vrcg.devdemov2400.structalerts __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "getpressedanswertagcode", false))
	 {return ((String) Debug.delegate(ba, "getpressedanswertagcode", new Object[] {_claitem}));}
String _ssql = "";
String _ret = "";
RDebugUtils.currentLine=175570944;
 //BA.debugLineNum = 175570944;BA.debugLine="Sub GetPressedAnswerTagCode(CLAItem As RequestCLAI";
RDebugUtils.currentLine=175570945;
 //BA.debugLineNum = 175570945;BA.debugLine="Dim sSQL As String = $\"select a.tagcode from  dta";
_ssql = ("select a.tagcode from  dta_requests_values as a where 1=1\n"+"						and a.request_tagcode='"+__c.SmartStringFormatter("",(Object)(_claitem.Request /*String*/ .trim()))+"' \n"+"						and a.inner_request_tagcode='"+__c.SmartStringFormatter("",(Object)(_claitem.Action /*String*/ .trim()))+"' \n"+"						and a.task_tagcode='"+__c.SmartStringFormatter("",(Object)(_claitem.Task /*String*/ .trim()))+"'\n"+"						and a.item_tagcode='"+__c.SmartStringFormatter("",(Object)(_claitem.Item /*String*/ .trim()))+"' \n"+"						and a.unique_key='"+__c.SmartStringFormatter("",(Object)(_claitem.UniqueKey /*String*/ .trim()))+"'\n"+"						and a.execute_status=1\n"+"						and a.repeatcounter="+__c.SmartStringFormatter("",(Object)(_claitem.RepeatCounter /*int*/ ))+"\n"+"						and a.repeatitemcounter="+__c.SmartStringFormatter("",(Object)(_claitem.RepeatItemCounter /*int*/ ))+"\n"+"						and a.repeatfieldcounter="+__c.SmartStringFormatter("",(Object)(_claitem.repeatfieldcounter /*int*/ ))+"");
RDebugUtils.currentLine=175570956;
 //BA.debugLineNum = 175570956;BA.debugLine="Dim ret As String = DBStructures.GetScriptColumnS";
_ret = _dbstructures._getscriptcolumnstrevc /*String*/ (ba,_ssql,"tagcode");
RDebugUtils.currentLine=175570957;
 //BA.debugLineNum = 175570957;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=175570958;
 //BA.debugLineNum = 175570958;BA.debugLine="End Sub";
return "";
}
public String  _claitemactioncancel_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "claitemactioncancel_stateclick", false))
	 {return ((String) Debug.delegate(ba, "claitemactioncancel_stateclick", new Object[] {_state}));}
xevolution.vrcg.devdemov2400.b4xstatebutton _btn = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=175964160;
 //BA.debugLineNum = 175964160;BA.debugLine="Sub CLAItemActionCancel_StateClick (State As Int)";
RDebugUtils.currentLine=175964162;
 //BA.debugLineNum = 175964162;BA.debugLine="Dim btn As B4XStateButton = Sender";
_btn = (xevolution.vrcg.devdemov2400.b4xstatebutton)(__c.Sender(ba));
RDebugUtils.currentLine=175964163;
 //BA.debugLineNum = 175964163;BA.debugLine="Dim Pnl As Panel = btn.Parent";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_btn._getparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=175964164;
 //BA.debugLineNum = 175964164;BA.debugLine="MakeCLAItemActionClick(btn, btn.Tag, 2)";
__ref._makeclaitemactionclick /*String*/ (null,_btn,(int)(BA.ObjectToNumber(_btn._gettag /*Object*/ (null))),(int) (2));
RDebugUtils.currentLine=175964166;
 //BA.debugLineNum = 175964166;BA.debugLine="End Sub";
return "";
}
public String  _makeclaitemactionclick(xevolution.vrcg.devdemov2400.structalerts __ref,xevolution.vrcg.devdemov2400.b4xstatebutton _btn,int _btnstate,int _btnorigin) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "makeclaitemactionclick", false))
	 {return ((String) Debug.delegate(ba, "makeclaitemactionclick", new Object[] {_btn,_btnstate,_btnorigin}));}
RDebugUtils.currentLine=176095232;
 //BA.debugLineNum = 176095232;BA.debugLine="Sub MakeCLAItemActionClick(btn As B4XStateButton,";
RDebugUtils.currentLine=176095300;
 //BA.debugLineNum = 176095300;BA.debugLine="End Sub";
return "";
}
public String  _claitemactionread_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "claitemactionread_stateclick", false))
	 {return ((String) Debug.delegate(ba, "claitemactionread_stateclick", new Object[] {_state}));}
xevolution.vrcg.devdemov2400.b4xstatebutton _btn = null;
RDebugUtils.currentLine=176029696;
 //BA.debugLineNum = 176029696;BA.debugLine="Sub CLAItemActionRead_StateClick (State As Int)";
RDebugUtils.currentLine=176029708;
 //BA.debugLineNum = 176029708;BA.debugLine="Dim btn As B4XStateButton = Sender";
_btn = (xevolution.vrcg.devdemov2400.b4xstatebutton)(__c.Sender(ba));
RDebugUtils.currentLine=176029709;
 //BA.debugLineNum = 176029709;BA.debugLine="MakeCLAItemActionClick(btn, btn.Tag, 1)";
__ref._makeclaitemactionclick /*String*/ (null,_btn,(int)(BA.ObjectToNumber(_btn._gettag /*Object*/ (null))),(int) (1));
RDebugUtils.currentLine=176029711;
 //BA.debugLineNum = 176029711;BA.debugLine="End Sub";
return "";
}
public String  _claitemalertbutton_1_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "claitemalertbutton_1_stateclick", false))
	 {return ((String) Debug.delegate(ba, "claitemalertbutton_1_stateclick", new Object[] {_state}));}
RDebugUtils.currentLine=176160768;
 //BA.debugLineNum = 176160768;BA.debugLine="Sub CLAItemAlertButton_1_StateClick (State As Int)";
RDebugUtils.currentLine=176160770;
 //BA.debugLineNum = 176160770;BA.debugLine="End Sub";
return "";
}
public String  _claitemalertbutton_2_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "claitemalertbutton_2_stateclick", false))
	 {return ((String) Debug.delegate(ba, "claitemalertbutton_2_stateclick", new Object[] {_state}));}
RDebugUtils.currentLine=176226304;
 //BA.debugLineNum = 176226304;BA.debugLine="Sub CLAItemAlertButton_2_StateClick (State As Int)";
RDebugUtils.currentLine=176226331;
 //BA.debugLineNum = 176226331;BA.debugLine="End Sub";
return "";
}
public void  _claitemalertbutton_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "claitemalertbutton_stateclick", false))
	 {Debug.delegate(ba, "claitemalertbutton_stateclick", new Object[] {_state}); return;}
ResumableSub_CLAItemAlertButton_StateClick rsub = new ResumableSub_CLAItemAlertButton_StateClick(this,__ref,_state);
rsub.resume(ba, null);
}
public static class ResumableSub_CLAItemAlertButton_StateClick extends BA.ResumableSub {
public ResumableSub_CLAItemAlertButton_StateClick(xevolution.vrcg.devdemov2400.structalerts parent,xevolution.vrcg.devdemov2400.structalerts __ref,int _state) {
this.parent = parent;
this.__ref = __ref;
this._state = _state;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.structalerts __ref;
xevolution.vrcg.devdemov2400.structalerts parent;
int _state;
xevolution.vrcg.devdemov2400.b4xstatebutton _btn = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _sts = 0;
boolean _continua = false;
anywheresoftware.b4a.objects.collections.List _ldata = null;
String _tagcode = "";
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
int _i = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="structalerts";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=176750593;
 //BA.debugLineNum = 176750593;BA.debugLine="Dim btn As B4XStateButton = Sender";
_btn = (xevolution.vrcg.devdemov2400.b4xstatebutton)(parent.__c.Sender(ba));
RDebugUtils.currentLine=176750594;
 //BA.debugLineNum = 176750594;BA.debugLine="Dim Pnl As Panel = btn.Parent";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_btn._getparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=176750595;
 //BA.debugLineNum = 176750595;BA.debugLine="Dim sts As Int = btn.State";
_sts = _btn._getstate /*int*/ (null);
RDebugUtils.currentLine=176750597;
 //BA.debugLineNum = 176750597;BA.debugLine="Dim Continua As Boolean = True";
_continua = parent.__c.True;
RDebugUtils.currentLine=176750598;
 //BA.debugLineNum = 176750598;BA.debugLine="Dim ldata As List = Regex.Split(\"\\|\", Pnl.tag )";
_ldata = new anywheresoftware.b4a.objects.collections.List();
_ldata = anywheresoftware.b4a.keywords.Common.ArrayToList(parent.__c.Regex.Split("\\|",BA.ObjectToString(_pnl.getTag())));
RDebugUtils.currentLine=176750599;
 //BA.debugLineNum = 176750599;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=176750600;
 //BA.debugLineNum = 176750600;BA.debugLine="Dim TagCode As String = ldata.Get(0)";
_tagcode = BA.ObjectToString(_ldata.Get((int) (0)));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=176750602;
 //BA.debugLineNum = 176750602;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("6176750602",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=176750603;
 //BA.debugLineNum = 176750603;BA.debugLine="Continua = False";
_continua = parent.__c.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=176750606;
 //BA.debugLineNum = 176750606;BA.debugLine="If (Continua) And (Utils.NNE(TagCode)) Then";

case 6:
//if
this.state = 21;
this.catchState = 0;
if ((_continua) && (parent._utils._nne /*boolean*/ (ba,_tagcode))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=176750607;
 //BA.debugLineNum = 176750607;BA.debugLine="If (btn.tag = 1) Then";
if (true) break;

case 9:
//if
this.state = 20;
if (((_btn._gettag /*Object*/ (null)).equals((Object)(1)))) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=176750615;
 //BA.debugLineNum = 176750615;BA.debugLine="else if (btn.Tag = 2) Then";
if (((_btn._gettag /*Object*/ (null)).equals((Object)(2)))) { 
this.state = 13;
}else {
this.state = 19;
}}
if (true) break;

case 11:
//C
this.state = 20;
RDebugUtils.currentLine=176750611;
 //BA.debugLineNum = 176750611;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=176750612;
 //BA.debugLineNum = 176750612;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=176750613;
 //BA.debugLineNum = 176750613;BA.debugLine="Filter.getObjectSelectViewDialog(ActivityRefere";
_filter._getobjectselectviewdialog /*void*/ (null,__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,(Object)("Alerts"),"Seleção de Objecto",_pnl);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=176750616;
 //BA.debugLineNum = 176750616;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.RemoveRecordCo";
_i = parent.__c.Msgbox2(BA.ObjectToCharSequence(parent._sharecode._removerecordconfirm /*String*/ ),BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*String*/ ),parent._sharecode._option_yes /*String*/ ,"",parent._sharecode._option_no /*String*/ ,(android.graphics.Bitmap)(parent.__c.Null),ba);
RDebugUtils.currentLine=176750617;
 //BA.debugLineNum = 176750617;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_i==parent.__c.DialogResponse.POSITIVE)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=176750618;
 //BA.debugLineNum = 176750618;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF087)  '";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr((int) (0xf087))));
RDebugUtils.currentLine=176750619;
 //BA.debugLineNum = 176750619;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Co";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent._consts._colorred /*int*/ );
RDebugUtils.currentLine=176750620;
 //BA.debugLineNum = 176750620;BA.debugLine="sts = 2";
_sts = (int) (2);
RDebugUtils.currentLine=176750621;
 //BA.debugLineNum = 176750621;BA.debugLine="updateTaskItemView(Pnl, TagCode, sts, 0, \"\")";
__ref._updatetaskitemview /*void*/ (null,_pnl,_tagcode,BA.NumberToString(_sts),(int) (0),"");
RDebugUtils.currentLine=176750622;
 //BA.debugLineNum = 176750622;BA.debugLine="StartAlerts(True)";
__ref._startalerts /*int*/ (null,parent.__c.True);
RDebugUtils.currentLine=176750623;
 //BA.debugLineNum = 176750623;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
parent.__c.CallSubDebug(ba,(Object)(parent._mainmenu.getObject()),"BadgeCheckUpdate");
RDebugUtils.currentLine=176750624;
 //BA.debugLineNum = 176750624;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structalerts", "claitemalertbutton_stateclick"),(int) (500));
this.state = 22;
return;
case 22:
//C
this.state = 17;
;
RDebugUtils.currentLine=176750625;
 //BA.debugLineNum = 176750625;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPleas";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*String*/ ),parent.__c.False);
RDebugUtils.currentLine=176750626;
 //BA.debugLineNum = 176750626;BA.debugLine="CallSubDelayed(Alerts,\"UpdateAlertsText\")";
parent.__c.CallSubDelayed(ba,(Object)(parent._alerts.getObject()),"UpdateAlertsText");
RDebugUtils.currentLine=176750627;
 //BA.debugLineNum = 176750627;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structalerts", "claitemalertbutton_stateclick"),(int) (500));
this.state = 23;
return;
case 23:
//C
this.state = 17;
;
RDebugUtils.currentLine=176750628;
 //BA.debugLineNum = 176750628;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=176750631;
 //BA.debugLineNum = 176750631;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF088)  'N";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr((int) (0xf088))));
RDebugUtils.currentLine=176750632;
 //BA.debugLineNum = 176750632;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Col";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent._consts._colorgray /*int*/ );
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=176750635;
 //BA.debugLineNum = 176750635;BA.debugLine="End Sub";
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
public void  _claitembutton_stateclick(xevolution.vrcg.devdemov2400.structalerts __ref,int _state) throws Exception{
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "claitembutton_stateclick", false))
	 {Debug.delegate(ba, "claitembutton_stateclick", new Object[] {_state}); return;}
ResumableSub_CLAItemButton_StateClick rsub = new ResumableSub_CLAItemButton_StateClick(this,__ref,_state);
rsub.resume(ba, null);
}
public static class ResumableSub_CLAItemButton_StateClick extends BA.ResumableSub {
public ResumableSub_CLAItemButton_StateClick(xevolution.vrcg.devdemov2400.structalerts parent,xevolution.vrcg.devdemov2400.structalerts __ref,int _state) {
this.parent = parent;
this.__ref = __ref;
this._state = _state;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.structalerts __ref;
xevolution.vrcg.devdemov2400.structalerts parent;
int _state;
xevolution.vrcg.devdemov2400.b4xstatebutton _btn = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _sts = 0;
boolean _continua = false;
anywheresoftware.b4a.objects.collections.List _ldata = null;
String _tagcode = "";
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
int _i = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="structalerts";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=176816129;
 //BA.debugLineNum = 176816129;BA.debugLine="Dim btn As B4XStateButton = Sender";
_btn = (xevolution.vrcg.devdemov2400.b4xstatebutton)(parent.__c.Sender(ba));
RDebugUtils.currentLine=176816130;
 //BA.debugLineNum = 176816130;BA.debugLine="Dim Pnl As Panel = btn.Parent";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_btn._getparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=176816131;
 //BA.debugLineNum = 176816131;BA.debugLine="Dim sts As Int = btn.State";
_sts = _btn._getstate /*int*/ (null);
RDebugUtils.currentLine=176816133;
 //BA.debugLineNum = 176816133;BA.debugLine="Dim Continua As Boolean = True";
_continua = parent.__c.True;
RDebugUtils.currentLine=176816134;
 //BA.debugLineNum = 176816134;BA.debugLine="Dim ldata As List = Regex.Split(\"\\|\", Pnl.tag )";
_ldata = new anywheresoftware.b4a.objects.collections.List();
_ldata = anywheresoftware.b4a.keywords.Common.ArrayToList(parent.__c.Regex.Split("\\|",BA.ObjectToString(_pnl.getTag())));
RDebugUtils.currentLine=176816135;
 //BA.debugLineNum = 176816135;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=176816136;
 //BA.debugLineNum = 176816136;BA.debugLine="Dim TagCode As String = ldata.Get(0)";
_tagcode = BA.ObjectToString(_ldata.Get((int) (0)));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=176816138;
 //BA.debugLineNum = 176816138;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("6176816138",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=176816139;
 //BA.debugLineNum = 176816139;BA.debugLine="Continua = False";
_continua = parent.__c.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=176816142;
 //BA.debugLineNum = 176816142;BA.debugLine="If (Continua) And (Utils.NNE(TagCode)) Then";

case 6:
//if
this.state = 21;
this.catchState = 0;
if ((_continua) && (parent._utils._nne /*boolean*/ (ba,_tagcode))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=176816143;
 //BA.debugLineNum = 176816143;BA.debugLine="If (btn.tag = 1) Then";
if (true) break;

case 9:
//if
this.state = 20;
if (((_btn._gettag /*Object*/ (null)).equals((Object)(1)))) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=176816151;
 //BA.debugLineNum = 176816151;BA.debugLine="else if (btn.Tag = 2) Then";
if (((_btn._gettag /*Object*/ (null)).equals((Object)(2)))) { 
this.state = 13;
}else {
this.state = 19;
}}
if (true) break;

case 11:
//C
this.state = 20;
RDebugUtils.currentLine=176816147;
 //BA.debugLineNum = 176816147;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=176816148;
 //BA.debugLineNum = 176816148;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=176816149;
 //BA.debugLineNum = 176816149;BA.debugLine="Filter.getObjectSelectViewDialog(ActivityRefere";
_filter._getobjectselectviewdialog /*void*/ (null,__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,(Object)("Alerts"),"Seleção de Objecto",_pnl);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=176816152;
 //BA.debugLineNum = 176816152;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.RemoveRecordCo";
_i = parent.__c.Msgbox2(BA.ObjectToCharSequence(parent._sharecode._removerecordconfirm /*String*/ ),BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*String*/ ),parent._sharecode._option_yes /*String*/ ,"",parent._sharecode._option_no /*String*/ ,(android.graphics.Bitmap)(parent.__c.Null),ba);
RDebugUtils.currentLine=176816153;
 //BA.debugLineNum = 176816153;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_i==parent.__c.DialogResponse.POSITIVE)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=176816154;
 //BA.debugLineNum = 176816154;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF087)  '";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr((int) (0xf087))));
RDebugUtils.currentLine=176816155;
 //BA.debugLineNum = 176816155;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Co";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent._consts._colorred /*int*/ );
RDebugUtils.currentLine=176816156;
 //BA.debugLineNum = 176816156;BA.debugLine="sts = 2";
_sts = (int) (2);
RDebugUtils.currentLine=176816157;
 //BA.debugLineNum = 176816157;BA.debugLine="updateTaskItemView(Pnl, TagCode, sts, 0, \"\")";
__ref._updatetaskitemview /*void*/ (null,_pnl,_tagcode,BA.NumberToString(_sts),(int) (0),"");
RDebugUtils.currentLine=176816158;
 //BA.debugLineNum = 176816158;BA.debugLine="StartAlerts(True)";
__ref._startalerts /*int*/ (null,parent.__c.True);
RDebugUtils.currentLine=176816159;
 //BA.debugLineNum = 176816159;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
parent.__c.CallSubDebug(ba,(Object)(parent._mainmenu.getObject()),"BadgeCheckUpdate");
RDebugUtils.currentLine=176816160;
 //BA.debugLineNum = 176816160;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structalerts", "claitembutton_stateclick"),(int) (500));
this.state = 22;
return;
case 22:
//C
this.state = 17;
;
RDebugUtils.currentLine=176816161;
 //BA.debugLineNum = 176816161;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPleas";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*String*/ ),parent.__c.False);
RDebugUtils.currentLine=176816162;
 //BA.debugLineNum = 176816162;BA.debugLine="CallSubDelayed(Alerts,\"UpdateAlertsText\")";
parent.__c.CallSubDelayed(ba,(Object)(parent._alerts.getObject()),"UpdateAlertsText");
RDebugUtils.currentLine=176816163;
 //BA.debugLineNum = 176816163;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "structalerts", "claitembutton_stateclick"),(int) (500));
this.state = 23;
return;
case 23:
//C
this.state = 17;
;
RDebugUtils.currentLine=176816164;
 //BA.debugLineNum = 176816164;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=176816167;
 //BA.debugLineNum = 176816167;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF088)  'N";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr((int) (0xf088))));
RDebugUtils.currentLine=176816168;
 //BA.debugLineNum = 176816168;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Col";
__ref._listitemobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent._consts._colorgray /*int*/ );
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=176816172;
 //BA.debugLineNum = 176816172;BA.debugLine="End Sub";
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
public String  _class_globals(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
RDebugUtils.currentLine=174981120;
 //BA.debugLineNum = 174981120;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=174981121;
 //BA.debugLineNum = 174981121;BA.debugLine="Private listAlerts As CustomListView";
_listalerts = new b4a.example3.customlistview();
RDebugUtils.currentLine=174981122;
 //BA.debugLineNum = 174981122;BA.debugLine="Private listTasks As CustomListView";
_listtasks = new b4a.example3.customlistview();
RDebugUtils.currentLine=174981123;
 //BA.debugLineNum = 174981123;BA.debugLine="Private listActions As CustomListView";
_listactions = new b4a.example3.customlistview();
RDebugUtils.currentLine=174981124;
 //BA.debugLineNum = 174981124;BA.debugLine="Private ItemsCounter As Int = 0";
_itemscounter = (int) (0);
RDebugUtils.currentLine=174981125;
 //BA.debugLineNum = 174981125;BA.debugLine="Public TasksList As List";
_taskslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=174981126;
 //BA.debugLineNum = 174981126;BA.debugLine="Private ActivityReference As Activity";
_activityreference = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=174981127;
 //BA.debugLineNum = 174981127;BA.debugLine="Private GoogleMaps As GoogleMap";
_googlemaps = new anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper();
RDebugUtils.currentLine=174981128;
 //BA.debugLineNum = 174981128;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=174981129;
 //BA.debugLineNum = 174981129;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
_appldialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=174981131;
 //BA.debugLineNum = 174981131;BA.debugLine="Private ListItemReference As Label";
_listitemreference = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981132;
 //BA.debugLineNum = 174981132;BA.debugLine="Private ListItemTaskTitle As Label";
_listitemtasktitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981133;
 //BA.debugLineNum = 174981133;BA.debugLine="Private ListItemStatusPanel As Panel";
_listitemstatuspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=174981134;
 //BA.debugLineNum = 174981134;BA.debugLine="Private ListItemDetails As Label";
_listitemdetails = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981135;
 //BA.debugLineNum = 174981135;BA.debugLine="Private listButCheckNew As Button";
_listbutchecknew = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=174981136;
 //BA.debugLineNum = 174981136;BA.debugLine="Private ListItemStatus As Label";
_listitemstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981137;
 //BA.debugLineNum = 174981137;BA.debugLine="Private ListItemPriorities As Label";
_listitempriorities = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981138;
 //BA.debugLineNum = 174981138;BA.debugLine="Private ListItem_ID As Label";
_listitem_id = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981139;
 //BA.debugLineNum = 174981139;BA.debugLine="Private ListItem_StatusID As Label";
_listitem_statusid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981140;
 //BA.debugLineNum = 174981140;BA.debugLine="Private ListItem_TypeID As Label";
_listitem_typeid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981141;
 //BA.debugLineNum = 174981141;BA.debugLine="Private ListItem_Icon As Label";
_listitem_icon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981142;
 //BA.debugLineNum = 174981142;BA.debugLine="Private ListItemObjectStatusIcon As Label";
_listitemobjectstatusicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981143;
 //BA.debugLineNum = 174981143;BA.debugLine="Private CLAItem_G1 As Label";
_claitem_g1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981144;
 //BA.debugLineNum = 174981144;BA.debugLine="Private CLAItemButton_1 As B4XStateButton";
_claitembutton_1 = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=174981145;
 //BA.debugLineNum = 174981145;BA.debugLine="Private CLAItemButton_2 As B4XStateButton";
_claitembutton_2 = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=174981146;
 //BA.debugLineNum = 174981146;BA.debugLine="Private CLAButtonOptions As Button";
_clabuttonoptions = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=174981147;
 //BA.debugLineNum = 174981147;BA.debugLine="Private CLAItem_G2 As Label";
_claitem_g2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981148;
 //BA.debugLineNum = 174981148;BA.debugLine="Private ALERT_VIEW As Int = 0";
_alert_view = (int) (0);
RDebugUtils.currentLine=174981149;
 //BA.debugLineNum = 174981149;BA.debugLine="Private TASK_VIEW As Int = 1";
_task_view = (int) (1);
RDebugUtils.currentLine=174981150;
 //BA.debugLineNum = 174981150;BA.debugLine="Private ACTION_VIEW As Int = 2";
_action_view = (int) (2);
RDebugUtils.currentLine=174981151;
 //BA.debugLineNum = 174981151;BA.debugLine="Private ListItemActionRequest As Label";
_listitemactionrequest = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981152;
 //BA.debugLineNum = 174981152;BA.debugLine="Private ListItemActionNew As Button";
_listitemactionnew = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=174981153;
 //BA.debugLineNum = 174981153;BA.debugLine="Private ListItemActionStatus As Label";
_listitemactionstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981154;
 //BA.debugLineNum = 174981154;BA.debugLine="Private ListItemActionDetails As Label";
_listitemactiondetails = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981155;
 //BA.debugLineNum = 174981155;BA.debugLine="Private ListItemActionClose As Label";
_listitemactionclose = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981156;
 //BA.debugLineNum = 174981156;BA.debugLine="Private ActionObjectStatusIcon As Label";
_actionobjectstatusicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981157;
 //BA.debugLineNum = 174981157;BA.debugLine="Private CLAActionAdd As B4XStateButton";
_claactionadd = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=174981158;
 //BA.debugLineNum = 174981158;BA.debugLine="Private CLAActionOptions As B4XStateButton";
_claactionoptions = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=174981159;
 //BA.debugLineNum = 174981159;BA.debugLine="Private CLAItem_G3 As Label";
_claitem_g3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981160;
 //BA.debugLineNum = 174981160;BA.debugLine="Private CLAItemAlertButton_1 As B4XStateButton";
_claitemalertbutton_1 = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=174981161;
 //BA.debugLineNum = 174981161;BA.debugLine="Private CLAItemAlertButton_2 As B4XStateButton";
_claitemalertbutton_2 = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=174981162;
 //BA.debugLineNum = 174981162;BA.debugLine="Private CLAButtonAlertOptions As Button";
_clabuttonalertoptions = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=174981163;
 //BA.debugLineNum = 174981163;BA.debugLine="Private CLAItemAlertText As Label";
_claitemalerttext = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981164;
 //BA.debugLineNum = 174981164;BA.debugLine="Private lbl_Eml_Result As Label";
_lbl_eml_result = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981165;
 //BA.debugLineNum = 174981165;BA.debugLine="Private Marker_Button As Button";
_marker_button = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=174981166;
 //BA.debugLineNum = 174981166;BA.debugLine="Private BtnAlertRemove As B4XStateButton";
_btnalertremove = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=174981167;
 //BA.debugLineNum = 174981167;BA.debugLine="Private lbl_Alert_type As Label";
_lbl_alert_type = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=174981168;
 //BA.debugLineNum = 174981168;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createactionitem(xevolution.vrcg.devdemov2400.structalerts __ref,int _posis,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "createactionitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createactionitem", new Object[] {_posis,_colitems,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcode = "";
String _title = "";
String _status_desc = "";
String _priority_desc = "";
String _urgency_desc = "";
String _due_date = "";
String _request_tagcode = "";
String _checklistdesc = "";
String _inner_title = "";
String _operation_type = "";
int _kind_data = 0;
int _id = 0;
String _s0 = "";
String _s1 = "";
String _s2 = "";
String _s3 = "";
xevolution.vrcg.devdemov2400.types._requestclaitem _claitem = null;
RDebugUtils.currentLine=175833088;
 //BA.debugLineNum = 175833088;BA.debugLine="Sub CreateActionItem(posis As Int, colitems As Cur";
RDebugUtils.currentLine=175833089;
 //BA.debugLineNum = 175833089;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=175833090;
 //BA.debugLineNum = 175833090;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=175833091;
 //BA.debugLineNum = 175833091;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height)";
__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=175833092;
 //BA.debugLineNum = 175833092;BA.debugLine="p.LoadLayout(\"alerts_actionitem_new\") 'alerts_tas";
_p.LoadLayout("alerts_actionitem_new",ba);
RDebugUtils.currentLine=175833093;
 //BA.debugLineNum = 175833093;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=175833098;
 //BA.debugLineNum = 175833098;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=175833099;
 //BA.debugLineNum = 175833099;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
_title = _colitems.GetString("title");
RDebugUtils.currentLine=175833100;
 //BA.debugLineNum = 175833100;BA.debugLine="Dim status_desc As String = colitems.GetString(\"s";
_status_desc = _colitems.GetString("status_desc");
RDebugUtils.currentLine=175833101;
 //BA.debugLineNum = 175833101;BA.debugLine="Dim priority_desc As String = colitems.GetString(";
_priority_desc = _colitems.GetString("priority_desc");
RDebugUtils.currentLine=175833102;
 //BA.debugLineNum = 175833102;BA.debugLine="Dim urgency_desc As String = colitems.GetString(\"";
_urgency_desc = _colitems.GetString("urgency_desc");
RDebugUtils.currentLine=175833103;
 //BA.debugLineNum = 175833103;BA.debugLine="Dim due_date As String = colitems.GetString(\"due_";
_due_date = _colitems.GetString("due_date");
RDebugUtils.currentLine=175833104;
 //BA.debugLineNum = 175833104;BA.debugLine="Dim request_tagcode As String = colitems.GetStrin";
_request_tagcode = _colitems.GetString("request_tagcode");
RDebugUtils.currentLine=175833105;
 //BA.debugLineNum = 175833105;BA.debugLine="Dim ChecklistDesc As String = colitems.GetString(";
_checklistdesc = _colitems.GetString("checklist");
RDebugUtils.currentLine=175833106;
 //BA.debugLineNum = 175833106;BA.debugLine="Dim inner_title As String = colitems.GetString(\"i";
_inner_title = _colitems.GetString("inner_title");
RDebugUtils.currentLine=175833107;
 //BA.debugLineNum = 175833107;BA.debugLine="Dim operation_type As String = Utils.IfNullOrEmpt";
_operation_type = _utils._ifnullorempty /*String*/ (ba,_colitems.GetString("operation_type"),"TOPERT_01");
RDebugUtils.currentLine=175833109;
 //BA.debugLineNum = 175833109;BA.debugLine="Dim kind_data As Int = 0";
_kind_data = (int) (0);
RDebugUtils.currentLine=175833110;
 //BA.debugLineNum = 175833110;BA.debugLine="Dim id As Int = colitems.GetInt(\"id\")";
_id = _colitems.GetInt("id");
RDebugUtils.currentLine=175833112;
 //BA.debugLineNum = 175833112;BA.debugLine="Dim s0 As String = Utils.IfNullOrEmpty(inner_titl";
_s0 = _utils._ifnullorempty /*String*/ (ba,_inner_title,_utils._ifnullorempty /*String*/ (ba,_checklistdesc,""));
RDebugUtils.currentLine=175833113;
 //BA.debugLineNum = 175833113;BA.debugLine="If Utils.NNE(s0) Then s0 = $\" / ${s0}\"$";
if (_utils._nne /*boolean*/ (ba,_s0)) { 
_s0 = (" / "+__c.SmartStringFormatter("",(Object)(_s0))+"");};
RDebugUtils.currentLine=175833114;
 //BA.debugLineNum = 175833114;BA.debugLine="Dim s1 As String = Utils.IfNullOrEmpty(title, \"\")";
_s1 = _utils._ifnullorempty /*String*/ (ba,_title,"");
RDebugUtils.currentLine=175833115;
 //BA.debugLineNum = 175833115;BA.debugLine="If Utils.NNE(s1) Then s1 = $\" / ${s1}\"$";
if (_utils._nne /*boolean*/ (ba,_s1)) { 
_s1 = (" / "+__c.SmartStringFormatter("",(Object)(_s1))+"");};
RDebugUtils.currentLine=175833116;
 //BA.debugLineNum = 175833116;BA.debugLine="Dim s2 As String = $\"${request_tagcode}${s0}${s1}";
_s2 = (""+__c.SmartStringFormatter("",(Object)(_request_tagcode))+""+__c.SmartStringFormatter("",(Object)(_s0))+""+__c.SmartStringFormatter("",(Object)(_s1))+"");
RDebugUtils.currentLine=175833117;
 //BA.debugLineNum = 175833117;BA.debugLine="CLAItem_G1.Text = s2 'title";
__ref._claitem_g1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_s2));
RDebugUtils.currentLine=175833119;
 //BA.debugLineNum = 175833119;BA.debugLine="Dim s0 As String = Utils.IfNullOrEmpty(priority_d";
_s0 = _utils._ifnullorempty /*String*/ (ba,_priority_desc,"");
RDebugUtils.currentLine=175833120;
 //BA.debugLineNum = 175833120;BA.debugLine="If Utils.NNE(s0) Then s0 = $\" / ${s0}\"$";
if (_utils._nne /*boolean*/ (ba,_s0)) { 
_s0 = (" / "+__c.SmartStringFormatter("",(Object)(_s0))+"");};
RDebugUtils.currentLine=175833121;
 //BA.debugLineNum = 175833121;BA.debugLine="Dim s1 As String = Utils.IfNullOrEmpty(urgency_de";
_s1 = _utils._ifnullorempty /*String*/ (ba,_urgency_desc,"");
RDebugUtils.currentLine=175833122;
 //BA.debugLineNum = 175833122;BA.debugLine="If Utils.NNE(s1) Then s1 = $\" / ${s1}\"$";
if (_utils._nne /*boolean*/ (ba,_s1)) { 
_s1 = (" / "+__c.SmartStringFormatter("",(Object)(_s1))+"");};
RDebugUtils.currentLine=175833123;
 //BA.debugLineNum = 175833123;BA.debugLine="Dim s2 As String = Utils.IfNullOrEmpty(due_date,";
_s2 = _utils._ifnullorempty /*String*/ (ba,_due_date,"");
RDebugUtils.currentLine=175833124;
 //BA.debugLineNum = 175833124;BA.debugLine="If Utils.NNE(s2) Then s2 = $\" / ${s2}\"$";
if (_utils._nne /*boolean*/ (ba,_s2)) { 
_s2 = (" / "+__c.SmartStringFormatter("",(Object)(_s2))+"");};
RDebugUtils.currentLine=175833125;
 //BA.debugLineNum = 175833125;BA.debugLine="Dim s3 As String = $\"${Utils.IfNullOrEmpty(status";
_s3 = (""+__c.SmartStringFormatter("",(Object)(_utils._ifnullorempty /*String*/ (ba,_status_desc,"Novo")))+""+__c.SmartStringFormatter("",(Object)(_s0))+""+__c.SmartStringFormatter("",(Object)(_s1))+""+__c.SmartStringFormatter("",(Object)(_s2))+"");
RDebugUtils.currentLine=175833126;
 //BA.debugLineNum = 175833126;BA.debugLine="CLAItem_G2.Text = s3 'date_verification";
__ref._claitem_g2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_s3));
RDebugUtils.currentLine=175833128;
 //BA.debugLineNum = 175833128;BA.debugLine="If (operation_type = \"TOPERT_01\") Then";
if (((_operation_type).equals("TOPERT_01"))) { 
RDebugUtils.currentLine=175833129;
 //BA.debugLineNum = 175833129;BA.debugLine="ActionObjectStatusIcon.TextColor = Consts.ColorR";
__ref._actionobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorred /*int*/ );
 }else 
{RDebugUtils.currentLine=175833130;
 //BA.debugLineNum = 175833130;BA.debugLine="Else If (operation_type = \"TOPERT_02\") Then";
if (((_operation_type).equals("TOPERT_02"))) { 
RDebugUtils.currentLine=175833131;
 //BA.debugLineNum = 175833131;BA.debugLine="ActionObjectStatusIcon.TextColor = Consts.ColorY";
__ref._actionobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._coloryellow /*int*/ );
 }else 
{RDebugUtils.currentLine=175833132;
 //BA.debugLineNum = 175833132;BA.debugLine="Else If (operation_type = \"TOPERT_03\") Then";
if (((_operation_type).equals("TOPERT_03"))) { 
RDebugUtils.currentLine=175833133;
 //BA.debugLineNum = 175833133;BA.debugLine="ActionObjectStatusIcon.TextColor = Consts.ColorG";
__ref._actionobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorgreen /*int*/ );
 }else {
RDebugUtils.currentLine=175833135;
 //BA.debugLineNum = 175833135;BA.debugLine="ActionObjectStatusIcon.TextColor = Consts.ColorB";
__ref._actionobjectstatusicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorblue /*int*/ );
 }}}
;
RDebugUtils.currentLine=175833138;
 //BA.debugLineNum = 175833138;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeRequest";
_claitem = _types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (ba,_colitems.GetString("request_tagcode"),_colitems.GetString("action_tagcode"),_colitems.GetString("task_tagcode"),_colitems.GetString("item_tagcode"),_colitems.GetString("uniquekey"),_colitems.GetString("tagcode"),_colitems.GetInt("repeatcounter"),_colitems.GetInt("repeatitemcounter"),(int) (0),"","","",(int) (3),(int) (0),(int) (0),"",_dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (ba,"",""),"");
RDebugUtils.currentLine=175833147;
 //BA.debugLineNum = 175833147;BA.debugLine="CLAActionAdd.Tag = CLAItem";
__ref._claactionadd /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(_claitem));
RDebugUtils.currentLine=175833148;
 //BA.debugLineNum = 175833148;BA.debugLine="CLAActionOptions.Tag = CLAItem";
__ref._claactionoptions /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(_claitem));
RDebugUtils.currentLine=175833150;
 //BA.debugLineNum = 175833150;BA.debugLine="p.Tag = $\"${tagcode}|${kind_data}|${id}|ACTION|${";
_p.setTag((Object)((""+__c.SmartStringFormatter("",(Object)(_tagcode))+"|"+__c.SmartStringFormatter("",(Object)(_kind_data))+"|"+__c.SmartStringFormatter("",(Object)(_id))+"|ACTION|"+__c.SmartStringFormatter("",(Object)(_posis))+"")));
RDebugUtils.currentLine=175833151;
 //BA.debugLineNum = 175833151;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=175833152;
 //BA.debugLineNum = 175833152;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createactionitem2(xevolution.vrcg.devdemov2400.structalerts __ref,int _cnt,anywheresoftware.b4a.objects.collections.Map _colitems,int _width,int _height,anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "createactionitem2", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createactionitem2", new Object[] {_cnt,_colitems,_width,_height,_bd}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _id = 0;
int _status_id = 0;
String _tagcode = "";
int _urgency = 0;
int _nature_type = 0;
int _itype = 0;
String _title = "";
int _priority = 0;
String _creation_date = "";
anywheresoftware.b4a.objects.collections.Map _details = null;
String _message_text = "";
String _stat = "";
anywheresoftware.b4a.objects.CSBuilder _cs = null;
int _clr = 0;
RDebugUtils.currentLine=176422912;
 //BA.debugLineNum = 176422912;BA.debugLine="Sub CreateActionItem2(cnt As Int, colitems As Map,";
RDebugUtils.currentLine=176422913;
 //BA.debugLineNum = 176422913;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=176422914;
 //BA.debugLineNum = 176422914;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=176422915;
 //BA.debugLineNum = 176422915;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height)";
__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=176422917;
 //BA.debugLineNum = 176422917;BA.debugLine="p.LoadLayout(\"alerts_actionitem_new\")";
_p.LoadLayout("alerts_actionitem_new",ba);
RDebugUtils.currentLine=176422918;
 //BA.debugLineNum = 176422918;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=176422922;
 //BA.debugLineNum = 176422922;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("id"))));
RDebugUtils.currentLine=176422923;
 //BA.debugLineNum = 176422923;BA.debugLine="Dim status_id As Int = colitems.Get(\"status_id\")";
_status_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("status_id"))));
RDebugUtils.currentLine=176422924;
 //BA.debugLineNum = 176422924;BA.debugLine="Dim tagcode As String = colitems.Get(\"tagcode\")";
_tagcode = BA.ObjectToString(_colitems.Get((Object)("tagcode")));
RDebugUtils.currentLine=176422926;
 //BA.debugLineNum = 176422926;BA.debugLine="Dim urgency As Int = colitems.Get(\"urgency\")";
_urgency = (int)(BA.ObjectToNumber(_colitems.Get((Object)("urgency"))));
RDebugUtils.currentLine=176422928;
 //BA.debugLineNum = 176422928;BA.debugLine="Dim nature_type As Int = colitems.Get(\"nature_typ";
_nature_type = (int)(BA.ObjectToNumber(_colitems.Get((Object)("nature_type"))));
RDebugUtils.currentLine=176422929;
 //BA.debugLineNum = 176422929;BA.debugLine="Dim iType As Int = colitems.Get(\"type\")";
_itype = (int)(BA.ObjectToNumber(_colitems.Get((Object)("type"))));
RDebugUtils.currentLine=176422930;
 //BA.debugLineNum = 176422930;BA.debugLine="Dim title As String = colitems.Get(\"title\")";
_title = BA.ObjectToString(_colitems.Get((Object)("title")));
RDebugUtils.currentLine=176422931;
 //BA.debugLineNum = 176422931;BA.debugLine="Dim priority As Int = colitems.Get(\"priority\")";
_priority = (int)(BA.ObjectToNumber(_colitems.Get((Object)("priority"))));
RDebugUtils.currentLine=176422933;
 //BA.debugLineNum = 176422933;BA.debugLine="Dim creation_date As String = colitems.Get(\"creat";
_creation_date = BA.ObjectToString(_colitems.Get((Object)("creation_date")));
RDebugUtils.currentLine=176422936;
 //BA.debugLineNum = 176422936;BA.debugLine="Dim details As Map = colitems.Get(\"details\")";
_details = new anywheresoftware.b4a.objects.collections.Map();
_details = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_colitems.Get((Object)("details"))));
RDebugUtils.currentLine=176422937;
 //BA.debugLineNum = 176422937;BA.debugLine="Dim message_text As String = details.Get(\"message";
_message_text = BA.ObjectToString(_details.Get((Object)("message_text")));
RDebugUtils.currentLine=176422939;
 //BA.debugLineNum = 176422939;BA.debugLine="ListItemTaskTitle.text = $\"#${cnt} - ${title}\"$";
__ref._listitemtasktitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(("#"+__c.SmartStringFormatter("",(Object)(_cnt))+" - "+__c.SmartStringFormatter("",(Object)(_title))+"")));
RDebugUtils.currentLine=176422940;
 //BA.debugLineNum = 176422940;BA.debugLine="Dim stat As String = $\"${Structures.GetMapTitleBy";
_stat = (""+__c.SmartStringFormatter("",(Object)(_structures._getmaptitlebyid /*String*/ (ba,_structures._alerts_status /*anywheresoftware.b4a.objects.collections.List*/ ,_status_id)))+"");
RDebugUtils.currentLine=176422941;
 //BA.debugLineNum = 176422941;BA.debugLine="ListItemStatus.Text = stat";
__ref._listitemstatus /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_stat));
RDebugUtils.currentLine=176422942;
 //BA.debugLineNum = 176422942;BA.debugLine="ListItemStatusPanel.Color = Utils.ColorString(Str";
__ref._listitemstatuspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(_utils._colorstring /*int*/ (ba,_structures._getmapcolorbyid /*String*/ (ba,_structures._alerts_status /*anywheresoftware.b4a.objects.collections.List*/ ,_status_id)));
RDebugUtils.currentLine=176422943;
 //BA.debugLineNum = 176422943;BA.debugLine="ListItemStatusPanel.Tag = status_id";
__ref._listitemstatuspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)(_status_id));
RDebugUtils.currentLine=176422945;
 //BA.debugLineNum = 176422945;BA.debugLine="ListItemReference.text = $\"${tagcode} - ${creatio";
__ref._listitemreference /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_tagcode))+" - "+__c.SmartStringFormatter("",(Object)(_creation_date))+"")));
RDebugUtils.currentLine=176422946;
 //BA.debugLineNum = 176422946;BA.debugLine="ListItemReference.Tag = tagcode";
__ref._listitemreference /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcode));
RDebugUtils.currentLine=176422947;
 //BA.debugLineNum = 176422947;BA.debugLine="ListItemDetails.text = $\"${message_text}\"$";
__ref._listitemdetails /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_message_text))+"")));
RDebugUtils.currentLine=176422949;
 //BA.debugLineNum = 176422949;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=176422950;
 //BA.debugLineNum = 176422950;BA.debugLine="Dim clr As Int = Colors.ARGB(255, 88,88,88)";
_clr = __c.Colors.ARGB((int) (255),(int) (88),(int) (88),(int) (88));
RDebugUtils.currentLine=176422951;
 //BA.debugLineNum = 176422951;BA.debugLine="cs.Initialize.Color(clr).Append($\"Prioridade: \"$)";
_cs.Initialize().Color(_clr).Append(BA.ObjectToCharSequence(("Prioridade: ")));
RDebugUtils.currentLine=176422952;
 //BA.debugLineNum = 176422952;BA.debugLine="cs.Bold.Color(clr).Append(Structures.GetMapTitleB";
_cs.Bold().Color(_clr).Append(BA.ObjectToCharSequence(_structures._getmaptitlebyid /*String*/ (ba,_structures._alerts_priorities /*anywheresoftware.b4a.objects.collections.List*/ ,_priority))).Pop().Pop();
RDebugUtils.currentLine=176422953;
 //BA.debugLineNum = 176422953;BA.debugLine="cs.Append($\", Gravidade: \"$)";
_cs.Append(BA.ObjectToCharSequence((", Gravidade: ")));
RDebugUtils.currentLine=176422954;
 //BA.debugLineNum = 176422954;BA.debugLine="cs.Bold.Color(clr).Append(Structures.GetMapTitleB";
_cs.Bold().Color(_clr).Append(BA.ObjectToCharSequence(_structures._getmaptitlebyid /*String*/ (ba,_structures._alerts_urgency /*anywheresoftware.b4a.objects.collections.List*/ ,_urgency))).PopAll();
RDebugUtils.currentLine=176422959;
 //BA.debugLineNum = 176422959;BA.debugLine="ListItemPriorities.text =cs ' stat";
__ref._listitempriorities /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=176422960;
 //BA.debugLineNum = 176422960;BA.debugLine="ListItemPriorities.Tag = $\"${priority}|${urgency}";
__ref._listitempriorities /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)((""+__c.SmartStringFormatter("",(Object)(_priority))+"|"+__c.SmartStringFormatter("",(Object)(_urgency))+"")));
RDebugUtils.currentLine=176422962;
 //BA.debugLineNum = 176422962;BA.debugLine="ListItem_ID.Text = id";
__ref._listitem_id /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=176422963;
 //BA.debugLineNum = 176422963;BA.debugLine="ListItem_StatusID.Text = status_id";
__ref._listitem_statusid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_status_id));
RDebugUtils.currentLine=176422964;
 //BA.debugLineNum = 176422964;BA.debugLine="ListItem_TypeID.Text = iType";
__ref._listitem_typeid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_itype));
RDebugUtils.currentLine=176422966;
 //BA.debugLineNum = 176422966;BA.debugLine="If (nature_type = 0) Then";
if ((_nature_type==0)) { 
RDebugUtils.currentLine=176422968;
 //BA.debugLineNum = 176422968;BA.debugLine="ListItem_Icon.Text = Chr(0xF085)";
__ref._listitem_icon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr((int) (0xf085))));
 }else 
{RDebugUtils.currentLine=176422969;
 //BA.debugLineNum = 176422969;BA.debugLine="else if (nature_type = 1) Then";
if ((_nature_type==1)) { 
RDebugUtils.currentLine=176422971;
 //BA.debugLineNum = 176422971;BA.debugLine="ListItem_Icon.Text = Chr(0xF1B2)";
__ref._listitem_icon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr((int) (0xf1b2))));
 }else 
{RDebugUtils.currentLine=176422972;
 //BA.debugLineNum = 176422972;BA.debugLine="else if (nature_type = 2) Then";
if ((_nature_type==2)) { 
RDebugUtils.currentLine=176422974;
 //BA.debugLineNum = 176422974;BA.debugLine="ListItem_Icon.Text = Chr(0xF04)";
__ref._listitem_icon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr((int) (0xf04))));
 }else 
{RDebugUtils.currentLine=176422975;
 //BA.debugLineNum = 176422975;BA.debugLine="else if (nature_type = 3) Then";
if ((_nature_type==3)) { 
RDebugUtils.currentLine=176422977;
 //BA.debugLineNum = 176422977;BA.debugLine="ListItem_Icon.Text = Chr(0xF24A)";
__ref._listitem_icon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr((int) (0xf24a))));
 }else 
{RDebugUtils.currentLine=176422978;
 //BA.debugLineNum = 176422978;BA.debugLine="else if (nature_type = 4) Then";
if ((_nature_type==4)) { 
RDebugUtils.currentLine=176422980;
 //BA.debugLineNum = 176422980;BA.debugLine="ListItem_Icon.Text = Chr(0xF0B1)";
__ref._listitem_icon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr((int) (0xf0b1))));
 }}}}}
;
RDebugUtils.currentLine=176422983;
 //BA.debugLineNum = 176422983;BA.debugLine="listButCheckNew.TextColor = Colors.ARGB(255, 60,1";
__ref._listbutchecknew /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__c.Colors.ARGB((int) (255),(int) (60),(int) (184),(int) (0)));
RDebugUtils.currentLine=176422984;
 //BA.debugLineNum = 176422984;BA.debugLine="If (status_id = 0) Then";
if ((_status_id==0)) { 
RDebugUtils.currentLine=176422985;
 //BA.debugLineNum = 176422985;BA.debugLine="listButCheckNew.TextColor = Colors.ARGB(255, 179";
__ref._listbutchecknew /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__c.Colors.ARGB((int) (255),(int) (179),(int) (179),(int) (179)));
RDebugUtils.currentLine=176422986;
 //BA.debugLineNum = 176422986;BA.debugLine="listButCheckNew.Enabled = False";
__ref._listbutchecknew /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=176422989;
 //BA.debugLineNum = 176422989;BA.debugLine="p.Color = Colors.ARGB(255, 250,250,250)";
_p.setColor(__c.Colors.ARGB((int) (255),(int) (250),(int) (250),(int) (250)));
RDebugUtils.currentLine=176422990;
 //BA.debugLineNum = 176422990;BA.debugLine="If (status_id = 0) Then p.Color =Colors.ARGB(255,";
if ((_status_id==0)) { 
_p.setColor(__c.Colors.ARGB((int) (255),(int) (255),(int) (199),(int) (184)));};
RDebugUtils.currentLine=176422991;
 //BA.debugLineNum = 176422991;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=176422992;
 //BA.debugLineNum = 176422992;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createalertitem(xevolution.vrcg.devdemov2400.structalerts __ref,int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height,anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "createalertitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createalertitem", new Object[] {_cnt,_colitems,_width,_height,_bd}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcode = "";
String _title = "";
String _date_verification = "";
int _status_id = 0;
int _kind_data = 0;
int _id = 0;
String _alerttype = "";
xevolution.vrcg.devdemov2400.types._requestclaitem _claitem = null;
RDebugUtils.currentLine=175374336;
 //BA.debugLineNum = 175374336;BA.debugLine="Sub CreateAlertItem(cnt As Int, colitems As Cursor";
RDebugUtils.currentLine=175374337;
 //BA.debugLineNum = 175374337;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=175374338;
 //BA.debugLineNum = 175374338;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=175374339;
 //BA.debugLineNum = 175374339;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height";
__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,(int) (_height+35));
RDebugUtils.currentLine=175374340;
 //BA.debugLineNum = 175374340;BA.debugLine="p.LoadLayout(\"alerts_alertitem_new\") 'alerts_aler";
_p.LoadLayout("alerts_alertitem_new",ba);
RDebugUtils.currentLine=175374341;
 //BA.debugLineNum = 175374341;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=175374346;
 //BA.debugLineNum = 175374346;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=175374347;
 //BA.debugLineNum = 175374347;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
_title = _colitems.GetString("title");
RDebugUtils.currentLine=175374348;
 //BA.debugLineNum = 175374348;BA.debugLine="Dim date_verification As String = colitems.GetStr";
_date_verification = _colitems.GetString("date_verification");
RDebugUtils.currentLine=175374349;
 //BA.debugLineNum = 175374349;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
_status_id = _colitems.GetInt("status_id");
RDebugUtils.currentLine=175374350;
 //BA.debugLineNum = 175374350;BA.debugLine="Dim kind_data As Int = colitems.GetInt(\"kind_data";
_kind_data = _colitems.GetInt("kind_data");
RDebugUtils.currentLine=175374351;
 //BA.debugLineNum = 175374351;BA.debugLine="Dim id As Int = colitems.GetInt(\"id\")";
_id = _colitems.GetInt("id");
RDebugUtils.currentLine=175374352;
 //BA.debugLineNum = 175374352;BA.debugLine="Dim AlertType As String = colitems.GetString(\"ale";
_alerttype = _colitems.GetString("alert_type");
RDebugUtils.currentLine=175374355;
 //BA.debugLineNum = 175374355;BA.debugLine="CLAItemAlertText.Text = $\"${title}\"$";
__ref._claitemalerttext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_title))+"")));
RDebugUtils.currentLine=175374356;
 //BA.debugLineNum = 175374356;BA.debugLine="CLAItemAlertText.Text = CLAItemAlertText.Text.Rep";
__ref._claitemalerttext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._claitemalerttext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText().replace(";",(";"+__c.SmartStringFormatter("",(Object)(__c.CRLF))+""))));
RDebugUtils.currentLine=175374358;
 //BA.debugLineNum = 175374358;BA.debugLine="If AlertType.ToUpperCase = \"ALRTTYP_EMAIL\" Then";
if ((_alerttype.toUpperCase()).equals("ALRTTYP_EMAIL")) { 
RDebugUtils.currentLine=175374359;
 //BA.debugLineNum = 175374359;BA.debugLine="Marker_Button.visible = False";
__ref._marker_button /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=175374361;
 //BA.debugLineNum = 175374361;BA.debugLine="If title.Contains(\"ERRO\") Then";
if (_title.contains("ERRO")) { 
RDebugUtils.currentLine=175374362;
 //BA.debugLineNum = 175374362;BA.debugLine="CLAButtonAlertOptions.enabled = False";
__ref._clabuttonalertoptions /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=175374363;
 //BA.debugLineNum = 175374363;BA.debugLine="lbl_Eml_Result.Visible = True";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=175374364;
 //BA.debugLineNum = 175374364;BA.debugLine="lbl_Eml_Result.Text = \"E M A I L  N Ã O  E N V";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("E M A I L  N Ã O  E N V I A D O"));
RDebugUtils.currentLine=175374365;
 //BA.debugLineNum = 175374365;BA.debugLine="lbl_Eml_Result.TextColor = Colors.Red";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
 }else 
{RDebugUtils.currentLine=175374366;
 //BA.debugLineNum = 175374366;BA.debugLine="Else if title.Contains (\"SUCESSO\") Then";
if (_title.contains("SUCESSO")) { 
RDebugUtils.currentLine=175374367;
 //BA.debugLineNum = 175374367;BA.debugLine="CLAButtonAlertOptions.enabled = False";
__ref._clabuttonalertoptions /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=175374368;
 //BA.debugLineNum = 175374368;BA.debugLine="lbl_Eml_Result.Visible = True";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=175374369;
 //BA.debugLineNum = 175374369;BA.debugLine="lbl_Eml_Result.Text = \"E M A I L   E N V I A D";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("E M A I L   E N V I A D O"));
RDebugUtils.currentLine=175374370;
 //BA.debugLineNum = 175374370;BA.debugLine="lbl_Eml_Result.TextColor = Consts.ColorGreen";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorgreen /*int*/ );
 }}
;
 }else 
{RDebugUtils.currentLine=175374373;
 //BA.debugLineNum = 175374373;BA.debugLine="Else if AlertType.ToUpperCase = \"ALRTTYP_REQUESTS";
if ((_alerttype.toUpperCase()).equals("ALRTTYP_REQUESTS")) { 
RDebugUtils.currentLine=175374374;
 //BA.debugLineNum = 175374374;BA.debugLine="Marker_Button.visible = True";
__ref._marker_button /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=175374375;
 //BA.debugLineNum = 175374375;BA.debugLine="CLAButtonAlertOptions.enabled = True";
__ref._clabuttonalertoptions /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=175374376;
 //BA.debugLineNum = 175374376;BA.debugLine="lbl_Eml_Result.Visible = True";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=175374377;
 //BA.debugLineNum = 175374377;BA.debugLine="lbl_Eml_Result.Text = \"N O V A  I N T E R V E N";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("N O V A  I N T E R V E N C A O"));
RDebugUtils.currentLine=175374378;
 //BA.debugLineNum = 175374378;BA.debugLine="lbl_Eml_Result.TextColor = Colors.Red";
__ref._lbl_eml_result /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
 }else {
RDebugUtils.currentLine=175374380;
 //BA.debugLineNum = 175374380;BA.debugLine="Marker_Button.visible = False";
__ref._marker_button /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
 }}
;
RDebugUtils.currentLine=175374383;
 //BA.debugLineNum = 175374383;BA.debugLine="If (status_id = 1) Then";
if ((_status_id==1)) { 
 }else 
{RDebugUtils.currentLine=175374387;
 //BA.debugLineNum = 175374387;BA.debugLine="Else If (status_id = 2) Then";
if ((_status_id==2)) { 
RDebugUtils.currentLine=175374390;
 //BA.debugLineNum = 175374390;BA.debugLine="CLAItemAlertButton_2.State = 1";
__ref._claitemalertbutton_2 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setstate /*int*/ (null,(int) (1));
 }}
;
RDebugUtils.currentLine=175374394;
 //BA.debugLineNum = 175374394;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeRequest";
_claitem = _types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (ba,"__DUMMY__","__DUMMY__","__DUMMY__","__DUMMY__",_utils._udid /*String*/ (ba),"__DUMMY__",(int) (0),(int) (0),(int) (0),_title,"",_tagcode,(int) (7),(int) (0),(int) (0),"",_dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (ba,"",""),"");
RDebugUtils.currentLine=175374404;
 //BA.debugLineNum = 175374404;BA.debugLine="CLAButtonAlertOptions.Tag = CLAItem";
__ref._clabuttonalertoptions /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_claitem));
RDebugUtils.currentLine=175374407;
 //BA.debugLineNum = 175374407;BA.debugLine="CLAItemAlertButton_2.Tag = 2";
__ref._claitemalertbutton_2 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(2));
RDebugUtils.currentLine=175374409;
 //BA.debugLineNum = 175374409;BA.debugLine="p.Tag = $\"${tagcode}|${kind_data}|${id}\"$";
_p.setTag((Object)((""+__c.SmartStringFormatter("",(Object)(_tagcode))+"|"+__c.SmartStringFormatter("",(Object)(_kind_data))+"|"+__c.SmartStringFormatter("",(Object)(_id))+"")));
RDebugUtils.currentLine=175374410;
 //BA.debugLineNum = 175374410;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=175374411;
 //BA.debugLineNum = 175374411;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createtaskitem(xevolution.vrcg.devdemov2400.structalerts __ref,int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height,anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "createtaskitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createtaskitem", new Object[] {_cnt,_colitems,_width,_height,_bd}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcode = "";
String _title = "";
String _date_verification = "";
int _status_id = 0;
int _kind_data = 0;
int _id = 0;
String _obs = "";
String _imagename = "";
xevolution.vrcg.devdemov2400.types._requestclaitem _claitem = null;
RDebugUtils.currentLine=175439872;
 //BA.debugLineNum = 175439872;BA.debugLine="Sub CreateTaskItem(cnt As Int, colitems As Cursor,";
RDebugUtils.currentLine=175439873;
 //BA.debugLineNum = 175439873;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=175439874;
 //BA.debugLineNum = 175439874;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=175439875;
 //BA.debugLineNum = 175439875;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height+";
__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,(int) (_height+55));
RDebugUtils.currentLine=175439876;
 //BA.debugLineNum = 175439876;BA.debugLine="p.LoadLayout(\"alerts_taskitem_new2\") 'alerts_task";
_p.LoadLayout("alerts_taskitem_new2",ba);
RDebugUtils.currentLine=175439877;
 //BA.debugLineNum = 175439877;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=175439882;
 //BA.debugLineNum = 175439882;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=175439883;
 //BA.debugLineNum = 175439883;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
_title = _colitems.GetString("title");
RDebugUtils.currentLine=175439884;
 //BA.debugLineNum = 175439884;BA.debugLine="Dim date_verification As String = colitems.GetStr";
_date_verification = _colitems.GetString("date_verification");
RDebugUtils.currentLine=175439885;
 //BA.debugLineNum = 175439885;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
_status_id = _colitems.GetInt("status_id");
RDebugUtils.currentLine=175439886;
 //BA.debugLineNum = 175439886;BA.debugLine="Dim kind_data As Int = colitems.GetInt(\"kind_data";
_kind_data = _colitems.GetInt("kind_data");
RDebugUtils.currentLine=175439887;
 //BA.debugLineNum = 175439887;BA.debugLine="Dim id As Int = colitems.GetInt(\"id\")";
_id = _colitems.GetInt("id");
RDebugUtils.currentLine=175439889;
 //BA.debugLineNum = 175439889;BA.debugLine="Dim obs As String = colitems.GetString(\"obs\")";
_obs = _colitems.GetString("obs");
RDebugUtils.currentLine=175439890;
 //BA.debugLineNum = 175439890;BA.debugLine="Dim imagename As String = colitems.GetString(\"ima";
_imagename = _colitems.GetString("imagename");
RDebugUtils.currentLine=175439892;
 //BA.debugLineNum = 175439892;BA.debugLine="CLAItem_G1.Text = $\"${title} (${imagename})\"$";
__ref._claitem_g1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_title))+" ("+__c.SmartStringFormatter("",(Object)(_imagename))+")")));
RDebugUtils.currentLine=175439893;
 //BA.debugLineNum = 175439893;BA.debugLine="CLAItem_G2.Text = date_verification";
__ref._claitem_g2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_date_verification));
RDebugUtils.currentLine=175439894;
 //BA.debugLineNum = 175439894;BA.debugLine="CLAItem_G3.Text = obs";
__ref._claitem_g3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_obs));
RDebugUtils.currentLine=175439896;
 //BA.debugLineNum = 175439896;BA.debugLine="If title.Contains(\"Imagens adicionadas\") Then";
if (_title.contains("Imagens adicionadas")) { 
RDebugUtils.currentLine=175439897;
 //BA.debugLineNum = 175439897;BA.debugLine="lbl_Alert_type.Text = \"N O V A   I M A G E M\"";
__ref._lbl_alert_type /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("N O V A   I M A G E M"));
RDebugUtils.currentLine=175439898;
 //BA.debugLineNum = 175439898;BA.debugLine="lbl_Alert_type.TextColor = Colors.Red";
__ref._lbl_alert_type /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
 }else {
RDebugUtils.currentLine=175439900;
 //BA.debugLineNum = 175439900;BA.debugLine="lbl_Alert_type.Text = \"N O V A  I N T E R V E N";
__ref._lbl_alert_type /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("N O V A  I N T E R V E N C A O"));
RDebugUtils.currentLine=175439901;
 //BA.debugLineNum = 175439901;BA.debugLine="lbl_Alert_type.TextColor = Colors.Red";
__ref._lbl_alert_type /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
 };
RDebugUtils.currentLine=175439906;
 //BA.debugLineNum = 175439906;BA.debugLine="If (status_id = 1) Then";
if ((_status_id==1)) { 
RDebugUtils.currentLine=175439909;
 //BA.debugLineNum = 175439909;BA.debugLine="CLAItemButton_1.State = 1";
__ref._claitembutton_1 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setstate /*int*/ (null,(int) (1));
 }else 
{RDebugUtils.currentLine=175439910;
 //BA.debugLineNum = 175439910;BA.debugLine="Else If (status_id = 2) Then";
if ((_status_id==2)) { 
RDebugUtils.currentLine=175439913;
 //BA.debugLineNum = 175439913;BA.debugLine="CLAItemButton_2.State = 1";
__ref._claitembutton_2 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setstate /*int*/ (null,(int) (1));
 }}
;
RDebugUtils.currentLine=175439917;
 //BA.debugLineNum = 175439917;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeRequest";
_claitem = _types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (ba,"__DUMMY__","__DUMMY__","__DUMMY__","__DUMMY__",_utils._udid /*String*/ (ba),"__DUMMY__",(int) (0),(int) (0),(int) (0),_title,"",_tagcode,(int) (7),(int) (0),(int) (0),"",_dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (ba,"",""),"");
RDebugUtils.currentLine=175439927;
 //BA.debugLineNum = 175439927;BA.debugLine="CLAButtonOptions.Tag = CLAItem";
__ref._clabuttonoptions /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_claitem));
RDebugUtils.currentLine=175439929;
 //BA.debugLineNum = 175439929;BA.debugLine="CLAItemButton_1.Tag = 1";
__ref._claitembutton_1 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(1));
RDebugUtils.currentLine=175439930;
 //BA.debugLineNum = 175439930;BA.debugLine="CLAItemButton_2.Tag = 2";
__ref._claitembutton_2 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(2));
RDebugUtils.currentLine=175439932;
 //BA.debugLineNum = 175439932;BA.debugLine="p.Tag = $\"${tagcode}|${kind_data}|${id}\"$";
_p.setTag((Object)((""+__c.SmartStringFormatter("",(Object)(_tagcode))+"|"+__c.SmartStringFormatter("",(Object)(_kind_data))+"|"+__c.SmartStringFormatter("",(Object)(_id))+"")));
RDebugUtils.currentLine=175439933;
 //BA.debugLineNum = 175439933;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=175439934;
 //BA.debugLineNum = 175439934;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getalertstotalrecs(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "getalertstotalrecs", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getalertstotalrecs", null));}
ResumableSub_GetAlertsTotalRecs rsub = new ResumableSub_GetAlertsTotalRecs(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetAlertsTotalRecs extends BA.ResumableSub {
public ResumableSub_GetAlertsTotalRecs(xevolution.vrcg.devdemov2400.structalerts parent,xevolution.vrcg.devdemov2400.structalerts __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.structalerts __ref;
xevolution.vrcg.devdemov2400.structalerts parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="structalerts";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=175112193;
 //BA.debugLineNum = 175112193;BA.debugLine="Log(ShareCode.SystemAlertsCount)";
parent.__c.LogImpl("6175112193",BA.NumberToString(parent._sharecode._systemalertscount /*int*/ ),0);
RDebugUtils.currentLine=175112194;
 //BA.debugLineNum = 175112194;BA.debugLine="Log(ShareCode.TasksAlertsCount)";
parent.__c.LogImpl("6175112194",BA.NumberToString(parent._sharecode._tasksalertscount /*int*/ ),0);
RDebugUtils.currentLine=175112195;
 //BA.debugLineNum = 175112195;BA.debugLine="Log(ShareCode.RequestsAlertsCount)";
parent.__c.LogImpl("6175112195",BA.NumberToString(parent._sharecode._requestsalertscount /*int*/ ),0);
RDebugUtils.currentLine=175112196;
 //BA.debugLineNum = 175112196;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _listbutchecknew_click(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "listbutchecknew_click", false))
	 {return ((String) Debug.delegate(ba, "listbutchecknew_click", null));}
RDebugUtils.currentLine=176619520;
 //BA.debugLineNum = 176619520;BA.debugLine="Sub listButCheckNew_Click";
RDebugUtils.currentLine=176619522;
 //BA.debugLineNum = 176619522;BA.debugLine="End Sub";
return "";
}
public String  _listbutmoreactioninner_click(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "listbutmoreactioninner_click", false))
	 {return ((String) Debug.delegate(ba, "listbutmoreactioninner_click", null));}
RDebugUtils.currentLine=176685056;
 //BA.debugLineNum = 176685056;BA.debugLine="Sub listButMoreActionInner_Click";
RDebugUtils.currentLine=176685072;
 //BA.debugLineNum = 176685072;BA.debugLine="End Sub";
return "";
}
public String  _listitemactionclose_click(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "listitemactionclose_click", false))
	 {return ((String) Debug.delegate(ba, "listitemactionclose_click", null));}
RDebugUtils.currentLine=177012736;
 //BA.debugLineNum = 177012736;BA.debugLine="Sub ListItemActionClose_Click";
RDebugUtils.currentLine=177012738;
 //BA.debugLineNum = 177012738;BA.debugLine="End Sub";
return "";
}
public String  _listitemactionnew_click(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "listitemactionnew_click", false))
	 {return ((String) Debug.delegate(ba, "listitemactionnew_click", null));}
RDebugUtils.currentLine=177078272;
 //BA.debugLineNum = 177078272;BA.debugLine="Sub ListItemActionNew_Click";
RDebugUtils.currentLine=177078274;
 //BA.debugLineNum = 177078274;BA.debugLine="End Sub";
return "";
}
public String  _marker_button_click(xevolution.vrcg.devdemov2400.structalerts __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structalerts";
if (Debug.shouldDelegate(ba, "marker_button_click", false))
	 {return ((String) Debug.delegate(ba, "marker_button_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _lblphoto1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lblphoto2 = null;
String _lblphoto1txt = "";
String _lblphoto2txt = "";
String _alertscoord = "";
String _phototitle = "";
String _typeofalert = "";
RDebugUtils.currentLine=177143808;
 //BA.debugLineNum = 177143808;BA.debugLine="Sub Marker_Button_Click";
RDebugUtils.currentLine=177143810;
 //BA.debugLineNum = 177143810;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=177143811;
 //BA.debugLineNum = 177143811;BA.debugLine="Dim pnl As Panel = btn.Parent";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_btn.getParent()));
RDebugUtils.currentLine=177143812;
 //BA.debugLineNum = 177143812;BA.debugLine="Log(pnl.Tag)";
__c.LogImpl("6177143812",BA.ObjectToString(_pnl.getTag()),0);
RDebugUtils.currentLine=177143813;
 //BA.debugLineNum = 177143813;BA.debugLine="Dim LblPhoto1 As Label = pnl.GetView(1)";
_lblphoto1 = new anywheresoftware.b4a.objects.LabelWrapper();
_lblphoto1 = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=177143814;
 //BA.debugLineNum = 177143814;BA.debugLine="Dim LblPhoto2 As Label = pnl.GetView(6)";
_lblphoto2 = new anywheresoftware.b4a.objects.LabelWrapper();
_lblphoto2 = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (6)).getObject()));
RDebugUtils.currentLine=177143815;
 //BA.debugLineNum = 177143815;BA.debugLine="Dim lblphoto1Txt As String = LblPhoto1.Text";
_lblphoto1txt = _lblphoto1.getText();
RDebugUtils.currentLine=177143816;
 //BA.debugLineNum = 177143816;BA.debugLine="Dim lblphoto2Txt As String = LblPhoto2.Text";
_lblphoto2txt = _lblphoto2.getText();
RDebugUtils.currentLine=177143817;
 //BA.debugLineNum = 177143817;BA.debugLine="Dim alertsCoord As String  = \"\"";
_alertscoord = "";
RDebugUtils.currentLine=177143818;
 //BA.debugLineNum = 177143818;BA.debugLine="Dim PhotoTitle As String = \"\"";
_phototitle = "";
RDebugUtils.currentLine=177143819;
 //BA.debugLineNum = 177143819;BA.debugLine="Dim TypeOfAlert As String = \"\"";
_typeofalert = "";
RDebugUtils.currentLine=177143821;
 //BA.debugLineNum = 177143821;BA.debugLine="If lblphoto1Txt.Contains(\"Imagens adicionadas\") T";
if (_lblphoto1txt.contains("Imagens adicionadas")) { 
RDebugUtils.currentLine=177143822;
 //BA.debugLineNum = 177143822;BA.debugLine="lblphoto1Txt = lblphoto1Txt.Replace(\"Imagens adi";
_lblphoto1txt = _lblphoto1txt.replace("Imagens adicionadas ao repositório por utilizar.","");
RDebugUtils.currentLine=177143823;
 //BA.debugLineNum = 177143823;BA.debugLine="TypeOfAlert = \"FOTO\"";
_typeofalert = "FOTO";
RDebugUtils.currentLine=177143824;
 //BA.debugLineNum = 177143824;BA.debugLine="PhotoTitle = $\"${lblphoto1Txt} ${lblphoto2Txt}\"$";
_phototitle = (""+__c.SmartStringFormatter("",(Object)(_lblphoto1txt))+" "+__c.SmartStringFormatter("",(Object)(_lblphoto2txt))+"");
RDebugUtils.currentLine=177143826;
 //BA.debugLineNum = 177143826;BA.debugLine="If lblphoto2Txt.Length > 26 Then";
if (_lblphoto2txt.length()>26) { 
RDebugUtils.currentLine=177143827;
 //BA.debugLineNum = 177143827;BA.debugLine="alertsCoord  = lblphoto2Txt.SubString(26)";
_alertscoord = _lblphoto2txt.substring((int) (26));
 };
 }else {
RDebugUtils.currentLine=177143831;
 //BA.debugLineNum = 177143831;BA.debugLine="TypeOfAlert = \"INTERVENCAO\"";
_typeofalert = "INTERVENCAO";
RDebugUtils.currentLine=177143833;
 //BA.debugLineNum = 177143833;BA.debugLine="If lblphoto2Txt.Length > 24 Then";
if (_lblphoto2txt.length()>24) { 
RDebugUtils.currentLine=177143834;
 //BA.debugLineNum = 177143834;BA.debugLine="alertsCoord  = lblphoto2Txt.SubString(24)";
_alertscoord = _lblphoto2txt.substring((int) (24));
 };
 };
RDebugUtils.currentLine=177143839;
 //BA.debugLineNum = 177143839;BA.debugLine="If Utils.NNE(alertsCoord) Then";
if (_utils._nne /*boolean*/ (ba,_alertscoord)) { 
RDebugUtils.currentLine=177143840;
 //BA.debugLineNum = 177143840;BA.debugLine="CallSub3(Alerts,\"ShowAlertMaps\",PhotoTitle, aler";
__c.CallSubDebug3(ba,(Object)(_alerts.getObject()),"ShowAlertMaps",(Object)(_phototitle),(Object)(_alertscoord));
 };
RDebugUtils.currentLine=177143844;
 //BA.debugLineNum = 177143844;BA.debugLine="End Sub";
return "";
}
}