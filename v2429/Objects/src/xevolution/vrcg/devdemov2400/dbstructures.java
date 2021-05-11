package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbstructures {
private static dbstructures mostCurrent = new dbstructures();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _evc_sql_global_search = "";
public static String _evc_sql_getdistricts = "";
public static String _evc_sql_getcounties = "";
public static String _sql_data_task_groups = "";
public static String _sql_data_task_requests = "";
public static String _sql_data_type_priority = "";
public static String _sql_data_type_urgency = "";
public static String _sql_data_type_asmodes = "";
public static String _sql_data_type_astypes = "";
public static String _sql_data_type_asstatus = "";
public static String _sql_data_object_type = "";
public static String _sql_data_object_group = "";
public static String _sql_getconfig_data = "";
public static String _sql_getallversions_data = "";
public static String _sql_getrequests_data_new = "";
public static String _evc_sql_getcurrent_reqest = "";
public static String _evc_sql_getprerequests_data_new = "";
public static String _evc_sql_getrequests_data_new = "";
public static String _evc_sql_getrequests_data_tasks = "";
public static String _evc_sql_getrequests_data_tasks_rep = "";
public static String _evc_sql_getrequests_data_tasks_tags = "";
public static String _sql_getrequests_current_task = "";
public static String _evc_sql_getrequests_current_task = "";
public static String _sql_getrequests_current = "";
public static String _evc_sql_getrequests_current = "";
public static String _sql_kpiall_status = "";
public static String _evc_sql_kpiall_status = "";
public static String _sql_current_address_types = "";
public static String _sql_current_contact_types = "";
public static String _evc_sql_current_contact_types = "";
public static String _sql_current_contacts = "";
public static String _evc_sql_current_contacts = "";
public static String _sql_current_objects = "";
public static String _evc_sql_current_objects = "";
public static String _evc_sql_current_objects_ent = "";
public static String _sql_current_objects_local = "";
public static String _evc_sql_current_objects_local = "";
public static String _sql_current_objects_type = "";
public static String _evc_sql_current_objects_type = "";
public static String _sql_current_objects_properties = "";
public static String _evc_ql_current_objects_properties = "";
public static String _evc_ql_current_request_properties = "";
public static String _evc_ql_current_objects_images = "";
public static String _sql_all_contracts = "";
public static String _sql_all_entity_contracts = "";
public static String _sql_all_object_contracts = "";
public static String _sql_periodicity_type = "";
public static String _evc_sql_periodicity_type = "";
public static String _sql_dayperiod_type = "";
public static String _evc_sql_dayperiod_type = "";
public static String _sql_all_documents = "";
public static String _evc_sql_all_documents = "";
public static String _evc_sql_obj_documents = "";
public static String _evc_sql_current_tasks = "";
public static String _evc_v2_sql_current_tasks = "";
public static String _where_daysbetween_condition = "";
public static String _evc_v1_sql_get_task_items = "";
public static String _evc_v2_sql_get_task_items = "";
public static String _evc_sql_get_task_items_two = "";
public static String _evc_v1_sql_get_task_items_two = "";
public static String _evc_v2_sql_get_task_items_two = "";
public static String _sql_get_task_recheigth = "";
public static String _sql_get_task_recheigthgrid = "";
public static String _sql_get_task_with_info_val = "";
public static String _sql_get_task_recheigth_val = "";
public static String _evc_sql_get_task_recheigth_val = "";
public static String _evc_sql_get_task_recheigth_items = "";
public static String _evc_sql_get_task_recheigth_items_sum = "";
public static String _evc_sql_get_task_with_info_val = "";
public static String _sql_get_task_recheigthgrid_val = "";
public static String _sql_get_task_griditems = "";
public static String _sql_get_task_item_value = "";
public static String _evc_sql_get_task_item_value = "";
public static String _evc_sql_get_task_item_value_events = "";
public static String _sql_get_task_item_value_grid = "";
public static String _sql_get_task_more_as = "";
public static String _evc_sql_get_task_more_as = "";
public static String _requests_get_current_task_items = "";
public static String _requests_get_current_task_items_v2 = "";
public static String _evc_sql_gettaskitems = "";
public static String _evc_sql_getrequesttask_itemvalue = "";
public static String _evc_sql_getrequest_data_info = "";
public static String _evc_sql_get_tesk_item_value_events = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.encoding _encoding = null;
public b4a.example.esc_pos _esc_pos = null;
public xevolution.vrcg.devdemov2400.main _main = null;
public xevolution.vrcg.devdemov2400.starter _starter = null;
public xevolution.vrcg.devdemov2400.comms _comms = null;
public xevolution.vrcg.devdemov2400.utils _utils = null;
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
public static int  _getparamstate(anywheresoftware.b4a.BA _ba,String _tagcode) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getparamstate", false))
	 {return ((Integer) Debug.delegate(null, "getparamstate", new Object[] {_ba,_tagcode}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Sub getParamState(Tagcode As String) As Int";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select value_state from dta_device_params where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'"))));
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="Ret = Record.GetInt(\"value_state\")";
_ret = _record.GetInt("value_state");
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="End Sub";
return 0;
}
public static String  _getparamstatefield(anywheresoftware.b4a.BA _ba,String _tagcode,String _column) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getparamstatefield", false))
	 {return ((String) Debug.delegate(null, "getparamstatefield", new Object[] {_ba,_tagcode,_column}));}
String _ret = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Sub getParamStateField(Tagcode As String, Column A";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Private Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_column))+" from dta_device_params where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'"))));
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="Ret = Record.GetString(Column)";
_ret = _record.GetString(_column);
RDebugUtils.currentLine=17760261;
 //BA.debugLineNum = 17760261;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=17760263;
 //BA.debugLineNum = 17760263;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=17760264;
 //BA.debugLineNum = 17760264;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=17760265;
 //BA.debugLineNum = 17760265;BA.debugLine="End Sub";
return "";
}
public static boolean  _getconfigvaluesexists(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getconfigvaluesexists", false))
	 {return ((Boolean) Debug.delegate(null, "getconfigvaluesexists", new Object[] {_ba}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
boolean _exists = false;
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Sub getConfigValuesExists As Boolean";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql_getconfig_data)));
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="Ret = Ret + 1";
_ret = (int) (_ret+1);
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18743304;
 //BA.debugLineNum = 18743304;BA.debugLine="Dim exists As Boolean = Ret > 0";
_exists = _ret>0;
RDebugUtils.currentLine=18743305;
 //BA.debugLineNum = 18743305;BA.debugLine="Return exists";
if (true) return _exists;
RDebugUtils.currentLine=18743306;
 //BA.debugLineNum = 18743306;BA.debugLine="End Sub";
return false;
}
public static String  _updateworkerdblastupdate(anywheresoftware.b4a.BA _ba,String _date) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateworkerdblastupdate", false))
	 {return ((String) Debug.delegate(null, "updateworkerdblastupdate", new Object[] {_ba,_date}));}
String _sqlscript = "";
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub UpdateWorkerDbLastUpdate(date As String)";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="If Not(Utils.isValidDate(date)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isvaliddate /*boolean*/ (_ba,_date))) { 
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="date = Utils.GetCurrDatetime";
_date = mostCurrent._utils._getcurrdatetime /*String*/ (_ba);
 };
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="Dim sqlScript As String = $\"update loc_updates se";
_sqlscript = ("update loc_updates set last_update='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_date))+"'");
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="Log(date)";
anywheresoftware.b4a.keywords.Common.LogImpl("622216710",_date,0);
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="End Sub";
return "";
}
public static String  _getconfigapp(anywheresoftware.b4a.BA _ba,String _token) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getconfigapp", false))
	 {return ((String) Debug.delegate(null, "getconfigapp", new Object[] {_ba,_token}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
int _c1 = 0;
int _c2 = 0;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub getConfigApp(Token As String)";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="If (Utils.isNullOrEmpty(Token)) Then";
if ((mostCurrent._utils._isnullorempty /*boolean*/ (_ba,_token))) { 
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Token = \"DEFAULT_\"";
_token = "DEFAULT_";
 };
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select * from config_appl where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_token))+"'"))));
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="Dim c1 As Int = Record.GetInt(\"colormain\")";
_c1 = _record.GetInt("colormain");
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="Dim c2 As Int = Record.GetInt(\"colorsub\")";
_c2 = _record.GetInt("colorsub");
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="If (c1 > 0) Then Consts.ColorMain = c1";
if ((_c1>0)) { 
mostCurrent._consts._colormain /*int*/  = _c1;};
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="If (c2 > 0) Then Consts.ColorSub = c2";
if ((_c2>0)) { 
mostCurrent._consts._colorsub /*int*/  = _c2;};
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=18808844;
 //BA.debugLineNum = 18808844;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcurrentconfigvalues(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getcurrentconfigvalues", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "getcurrentconfigvalues", new Object[] {_ba}));}
ResumableSub_getCurrentConfigValues rsub = new ResumableSub_getCurrentConfigValues(null,_ba);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_getCurrentConfigValues extends BA.ResumableSub {
public ResumableSub_getCurrentConfigValues(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba) {
this.parent = parent;
this._ba = _ba;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
String _apis = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(parent._sql_getconfig_data)));
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="Do While Record.NextRow";
if (true) break;

case 1:
//do while
this.state = 4;
while (_record.NextRow()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="ShareCode.APP_Instance = Utils.IfNullOrEmpty(Rec";
parent.mostCurrent._sharecode._app_instance /*String*/  = parent.mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("instance"),"");
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="ShareCode.APP_Authorization = Utils.IfNullOrEmpt";
parent.mostCurrent._sharecode._app_authorization /*String*/  = parent.mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("authorization"),"");
RDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="Dim APIs As String = Utils.IfNullOrEmpty(Record.";
_apis = parent.mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("api"),"");
RDebugUtils.currentLine=18677770;
 //BA.debugLineNum = 18677770;BA.debugLine="ShareCode.APP_DOMAIN = Utils.IfNullOrEmpty(Recor";
parent.mostCurrent._sharecode._app_domain /*String*/  = parent.mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("subdomain"),"");
RDebugUtils.currentLine=18677771;
 //BA.debugLineNum = 18677771;BA.debugLine="ShareCode.APPL_CONFIRMED = Record.GetInt(\"confir";
parent.mostCurrent._sharecode._appl_confirmed /*int*/  = _record.GetInt("confirmed");
RDebugUtils.currentLine=18677772;
 //BA.debugLineNum = 18677772;BA.debugLine="ShareCode.APP_TOKEN = Utils.IfNullOrEmpty(Record";
parent.mostCurrent._sharecode._app_token /*String*/  = parent.mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("token"),"");
RDebugUtils.currentLine=18677774;
 //BA.debugLineNum = 18677774;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.APP_";
parent.mostCurrent._sharecode._app_url /*String*/  = "https://"+parent.mostCurrent._sharecode._app_domain /*String*/ +"."+_apis;
RDebugUtils.currentLine=18677775;
 //BA.debugLineNum = 18677775;BA.debugLine="Exit";
this.state = 4;
if (true) break;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=18677777;
 //BA.debugLineNum = 18677777;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18677778;
 //BA.debugLineNum = 18677778;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=18677779;
 //BA.debugLineNum = 18677779;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static int  _getcountofevc(anywheresoftware.b4a.BA _ba,String _table,String _condition) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getcountofevc", false))
	 {return ((Integer) Debug.delegate(null, "getcountofevc", new Object[] {_ba,_table,_condition}));}
int _ret = 0;
String _sql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub GetCountOfEVC(Table As String, Condition As St";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Dim Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="Dim SQL As String = $\"select count(0) as Total fr";
_sql = ("select count(0) as Total from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+" where 1=1 "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_condition))+"");
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="Ret = Record.GetInt(\"Total\")";
_ret = _record.GetInt("Total");
RDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=21233672;
 //BA.debugLineNum = 21233672;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=21233673;
 //BA.debugLineNum = 21233673;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21233674;
 //BA.debugLineNum = 21233674;BA.debugLine="End Sub";
return 0;
}
public static String  _createtablesthatdonotexists(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "createtablesthatdonotexists", false))
	 {return ((String) Debug.delegate(null, "createtablesthatdonotexists", new Object[] {_ba}));}
String _dta_tablecontrol = "";
String _dta_tablecontrol_items = "";
String _dta_tabledinamic = "";
String _dta_tabledinamic_groups = "";
String _dta_tabledinamic_items = "";
String _dta_tabledinamic_subs = "";
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Sub CreateTablesThatDoNotExists";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._dbutils._tableexists /*boolean*/ (_ba,mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_tablecontrol"))) { 
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="Dim dta_tablecontrol As String = $\"CREATE TABLE";
_dta_tablecontrol = ("CREATE TABLE `dta_tablecontrol` (\n"+"						`id` BIGINT(20) NOT NULL,\n"+"						`tagcode` VARCHAR(50) NOT NULL DEFAULT 'TABCTRL_',\n"+"						`title` VARCHAR(100) NOT NULL,\n"+"						`reference` VARCHAR(50) NULL DEFAULT NULL,\n"+"						`color` VARCHAR(50) NULL DEFAULT NULL,\n"+"						`codeid` INT(11) NULL DEFAULT '0',\n"+"						`level` INT(11) NULL DEFAULT '0',\n"+"						`position` INT(11) NULL DEFAULT '0',\n"+"						`created_at` TIMESTAMP NULL DEFAULT NULL,\n"+"						`updated_at` TIMESTAMP NULL DEFAULT NULL,\n"+"						`sid_id` INT(11) NOT NULL DEFAULT '0',\n"+"						`cbr_id` INT(11) NOT NULL DEFAULT '0',\n"+"						`active` TINYINT(1) NOT NULL DEFAULT '1',\n"+"						`paramters` TEXT NULL,\n"+"						PRIMARY KEY (`id`, `tagcode`)\n"+"					);");
RDebugUtils.currentLine=22741011;
 //BA.debugLineNum = 22741011;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tablecontro";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_dta_tablecontrol);
 };
RDebugUtils.currentLine=22741013;
 //BA.debugLineNum = 22741013;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._dbutils._tableexists /*boolean*/ (_ba,mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_tablecontrol_items"))) { 
RDebugUtils.currentLine=22741014;
 //BA.debugLineNum = 22741014;BA.debugLine="Dim dta_tablecontrol_items As String = $\"CREATE";
_dta_tablecontrol_items = ("CREATE TABLE `dta_tablecontrol_items` (\n"+"					`id` BIGINT(20) NOT NULL,\n"+"					`tabctrl_tagcode` VARCHAR(50) NOT NULL DEFAULT 'TABCTRL_',\n"+"					`fieldstr_01` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_02` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_03` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_04` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_05` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_06` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_07` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_08` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_09` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_10` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_11` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_12` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_13` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_14` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`fieldstr_15` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`title` VARCHAR(100) NULL DEFAULT NULL,\n"+"					`reference` VARCHAR(50) NULL DEFAULT NULL,\n"+"					`color` VARCHAR(50) NULL DEFAULT NULL,\n"+"					`codeid` INT(11) NULL DEFAULT '0',\n"+"					`level` INT(11) NULL DEFAULT '0',\n"+"					`position` INT(11) NULL DEFAULT '0',\n"+"					`created_at` TIMESTAMP NULL DEFAULT NULL,\n"+"					`updated_at` TIMESTAMP NULL DEFAULT NULL,\n"+"					`sid_id` INT(11) NOT NULL DEFAULT '0',\n"+"					`cbr_id` INT(11) NOT NULL DEFAULT '0',\n"+"					`active` TINYINT(1) NOT NULL DEFAULT '1',\n"+"					PRIMARY KEY (`id`, `tabctrl_tagcode`)\n"+"				);");
RDebugUtils.currentLine=22741045;
 //BA.debugLineNum = 22741045;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tablecontro";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_dta_tablecontrol_items);
 };
RDebugUtils.currentLine=22741048;
 //BA.debugLineNum = 22741048;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._dbutils._tableexists /*boolean*/ (_ba,mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_tabledinamic"))) { 
RDebugUtils.currentLine=22741049;
 //BA.debugLineNum = 22741049;BA.debugLine="Dim dta_tabledinamic As String = $\"CREATE TABLE";
_dta_tabledinamic = ("CREATE TABLE If Not EXISTS `dta_tabledinamic` (\n"+"				  `id` bigint(20) Not Null,\n"+"				  `tagcode` varchar(50) Not Null DEFAULT 'TABDIN_',\n"+"				  `title` varchar(100) Not Null,\n"+"				  `reference` varchar(50) DEFAULT Null,\n"+"				  `color` varchar(50) DEFAULT Null,\n"+"				  `codeid` int(11) DEFAULT '0',\n"+"				  `level` int(11) DEFAULT '0',\n"+"				  `position` int(11) DEFAULT '0',\n"+"				  `created_at` timestamp Null DEFAULT Null,\n"+"				  `updated_at` timestamp Null DEFAULT Null,\n"+"				  `sid_id` int(11) Not Null DEFAULT '0',\n"+"				  `cbr_id` int(11) Not Null DEFAULT '0',\n"+"				  `active` tinyint(1) Not Null DEFAULT '1',\n"+"				  `is_level` tinyint(4) DEFAULT '0',\n"+"				  PRIMARY KEY (`id`,`tagcode`)\n"+"				);");
RDebugUtils.currentLine=22741066;
 //BA.debugLineNum = 22741066;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinami";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_dta_tabledinamic);
 };
RDebugUtils.currentLine=22741069;
 //BA.debugLineNum = 22741069;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._dbutils._tableexists /*boolean*/ (_ba,mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_tabledinamic_groups"))) { 
RDebugUtils.currentLine=22741070;
 //BA.debugLineNum = 22741070;BA.debugLine="Dim dta_tabledinamic_groups As String = $\"CREATE";
_dta_tabledinamic_groups = ("CREATE TABLE If Not EXISTS `dta_tabledinamic_groups` (\n"+"				  `id` bigint(20) Not Null,\n"+"				  `tabdin_tagcode` varchar(50) Not Null,\n"+"				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINGRP_',\n"+"				  `title` varchar(100) Not Null,\n"+"				  `reference` varchar(50) DEFAULT Null,\n"+"				  `color` varchar(50) DEFAULT Null,\n"+"				  `codeid` int(11) DEFAULT '0',\n"+"				  `level` int(11) DEFAULT '0',\n"+"				  `position` int(11) DEFAULT '0',\n"+"				  `origin` int(11) DEFAULT '0',\n"+"				  `created_at` timestamp Null DEFAULT Null,\n"+"				  `updated_at` timestamp Null DEFAULT Null,\n"+"				  `sid_id` int(11) Not Null DEFAULT '0',\n"+"				  `cbr_id` int(11) Not Null DEFAULT '0',\n"+"				  `active` tinyint(1) Not Null DEFAULT '1',\n"+"				  PRIMARY KEY (`id`,`tabdin_tagcode`,`tagcode`)\n"+"				);");
RDebugUtils.currentLine=22741088;
 //BA.debugLineNum = 22741088;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinami";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_dta_tabledinamic_groups);
 };
RDebugUtils.currentLine=22741091;
 //BA.debugLineNum = 22741091;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._dbutils._tableexists /*boolean*/ (_ba,mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_tabledinamic_items"))) { 
RDebugUtils.currentLine=22741092;
 //BA.debugLineNum = 22741092;BA.debugLine="Dim dta_tabledinamic_items As String = $\"CREATE";
_dta_tabledinamic_items = ("CREATE TABLE If Not EXISTS `dta_tabledinamic_items` (\n"+"				  `id` bigint(20) Not Null,\n"+"				  `tabdingroup_tagcode` varchar(50) Not Null,\n"+"				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINITEM_',\n"+"				  `title` varchar(100) Not Null,\n"+"				  `reference` varchar(50) DEFAULT Null,\n"+"				  `color` varchar(50) DEFAULT Null,\n"+"				  `codeid` int(11) DEFAULT '0',\n"+"				  `level` int(11) DEFAULT '0',\n"+"				  `position` int(11) DEFAULT '0',\n"+"				  `origin` int(11) DEFAULT '0',\n"+"				  `created_at` timestamp Null DEFAULT Null,\n"+"				  `updated_at` timestamp Null DEFAULT Null,\n"+"				  `sid_id` int(11) Not Null DEFAULT '0',\n"+"				  `cbr_id` int(11) Not Null DEFAULT '0',\n"+"				  `active` tinyint(1) Not Null DEFAULT '1',\n"+"				  PRIMARY KEY (`id`,`tabdingroup_tagcode`,`tagcode`)\n"+"				);");
RDebugUtils.currentLine=22741110;
 //BA.debugLineNum = 22741110;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinami";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_dta_tabledinamic_items);
 };
RDebugUtils.currentLine=22741113;
 //BA.debugLineNum = 22741113;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._dbutils._tableexists /*boolean*/ (_ba,mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_tabledinamic_subs"))) { 
RDebugUtils.currentLine=22741114;
 //BA.debugLineNum = 22741114;BA.debugLine="Dim dta_tabledinamic_subs As String = $\"CREATE T";
_dta_tabledinamic_subs = ("CREATE TABLE If Not EXISTS `dta_tabledinamic_subs` (\n"+"				  `id` bigint(20) Not Null,\n"+"				  `tabdinitem_tagcode` varchar(50) Not Null,\n"+"				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINSUBS_',\n"+"				  `title` varchar(100) Not Null,\n"+"				  `reference` varchar(50) DEFAULT Null,\n"+"				  `color` varchar(50) DEFAULT Null,\n"+"				  `codeid` int(11) DEFAULT '0',\n"+"				  `level` int(11) DEFAULT '0',\n"+"				  `position` int(11) DEFAULT '0',\n"+"				  `origin` int(11) DEFAULT '0',\n"+"				  `created_at` timestamp Null DEFAULT Null,\n"+"				  `updated_at` timestamp Null DEFAULT Null,\n"+"				  `sid_id` int(11) Not Null DEFAULT '0',\n"+"				  `cbr_id` int(11) Not Null DEFAULT '0',\n"+"				  `active` tinyint(1) Not Null DEFAULT '1',\n"+"				  PRIMARY KEY (`id`,`tabdinitem_tagcode`,`tagcode`)\n"+"				);");
RDebugUtils.currentLine=22741132;
 //BA.debugLineNum = 22741132;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinami";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_dta_tabledinamic_subs);
 };
RDebugUtils.currentLine=22741135;
 //BA.debugLineNum = 22741135;BA.debugLine="End Sub";
return "";
}
public static String  _updateconfigapp(anywheresoftware.b4a.BA _ba,String _token) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateconfigapp", false))
	 {return ((String) Debug.delegate(null, "updateconfigapp", new Object[] {_ba,_token}));}
String _sqlscript = "";
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Sub updateConfigApp(Token As String)";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Dim sqlScript As String = $\"update config_appl se";
_sqlscript = ("update config_appl set colormain="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._consts._colormain /*int*/ ))+", colorsub="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._consts._colorsub /*int*/ ))+" where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_token))+"'");
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="End Sub";
return "";
}
public static int  _getmaxofevc(anywheresoftware.b4a.BA _ba,String _table,String _field,String _condition) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getmaxofevc", false))
	 {return ((Integer) Debug.delegate(null, "getmaxofevc", new Object[] {_ba,_table,_field,_condition}));}
int _ret = 0;
String _sql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub GetMaxOfEVC(Table As String, field As String,";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Dim Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Dim SQL As String = $\"select max(${field}) as Max";
_sql = ("select max("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field))+") as Maxi from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+" where 1=1 "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_condition))+"");
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="Ret = Record.GetInt(\"Maxi\")";
_ret = _record.GetInt("Maxi");
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=21299208;
 //BA.debugLineNum = 21299208;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="End Sub";
return 0;
}
public static String  _getscriptcolumnstrevc(anywheresoftware.b4a.BA _ba,String _script,String _column) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcolumnstrevc", false))
	 {return ((String) Debug.delegate(null, "getscriptcolumnstrevc", new Object[] {_ba,_script,_column}));}
String _ret = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub GetScriptColumnStrEVC(script As String, column";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Dim Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Try";
try {RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEV";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="Ret = Record.GetString(column)";
_ret = _record.GetString(_column);
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="Record.Close";
_record.Close();
 } 
       catch (Exception e10) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e10);RDebugUtils.currentLine=21626890;
 //BA.debugLineNum = 21626890;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621626890",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=21626892;
 //BA.debugLineNum = 21626892;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21626893;
 //BA.debugLineNum = 21626893;BA.debugLine="End Sub";
return "";
}
public static String  _adddatalist2table(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _localsql,String _tablename,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "adddatalist2table", false))
	 {return ((String) Debug.delegate(null, "adddatalist2table", new Object[] {_ba,_localsql,_tablename,_data}));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Sub AddDataList2Table(LocalSQL As SQL, Tablename A";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="DBUtils.InsertMaps(LocalSQL, Tablename, Data )";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,_localsql,_tablename,_data);
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="End Sub";
return "";
}
public static String  _adddatamap2table(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _localsql,String _tablename,anywheresoftware.b4a.objects.collections.Map _mapping) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "adddatamap2table", false))
	 {return ((String) Debug.delegate(null, "adddatamap2table", new Object[] {_ba,_localsql,_tablename,_mapping}));}
anywheresoftware.b4a.objects.collections.List _data = null;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Sub AddDataMap2Table(LocalSQL As SQL, Tablename As";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Dim Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="Data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="Data.Add( mapping )";
_data.Add((Object)(_mapping.getObject()));
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="DBUtils.InsertMaps(LocalSQL, Tablename, Data )";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,_localsql,_tablename,_data);
RDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="End Sub";
return "";
}
public static String  _addversionsdatamap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _localsql,anywheresoftware.b4a.objects.collections.Map _mapping) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "addversionsdatamap", false))
	 {return ((String) Debug.delegate(null, "addversionsdatamap", new Object[] {_ba,_localsql,_mapping}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Sub AddVersionsDataMap(LocalSQL As SQL, mapping As";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="AddDataMap2Table(LocalSQL, \"versions\", mapping )";
_adddatamap2table(_ba,_localsql,"versions",_mapping);
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="End Sub";
return "";
}
public static String  _checkworkingdaytasks(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "checkworkingdaytasks", false))
	 {return ((String) Debug.delegate(null, "checkworkingdaytasks", new Object[] {_ba}));}
String _sql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
int _ret = 0;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub CheckWorkingDayTasks";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Dim SQL As String = $\"select * from userinnertask";
_sql = ("select * from userinnertasks where ukey='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_uwdukey /*String*/ ))+"' and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"'");
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="ShareCode.UWDUKEY_DETAILS = Record.GetInt(\"statu";
mostCurrent._sharecode._uwdukey_details /*int*/  = _record.GetInt("status");
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="ShareCode.UWDUKEY_PRODUCTS = Record.GetInt(\"prod";
mostCurrent._sharecode._uwdukey_products /*int*/  = _record.GetInt("prodcheck");
RDebugUtils.currentLine=20054023;
 //BA.debugLineNum = 20054023;BA.debugLine="ret = 1";
_ret = (int) (1);
RDebugUtils.currentLine=20054024;
 //BA.debugLineNum = 20054024;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=20054027;
 //BA.debugLineNum = 20054027;BA.debugLine="If ret = 0 Then";
if (_ret==0) { 
RDebugUtils.currentLine=20054028;
 //BA.debugLineNum = 20054028;BA.debugLine="CreateWorkingDayTask(ShareCode.SESS_User, ShareC";
_createworkingdaytask(_ba,mostCurrent._sharecode._sess_user /*String*/ ,mostCurrent._sharecode._sess_uwdukey /*String*/ ,(int) (0));
RDebugUtils.currentLine=20054029;
 //BA.debugLineNum = 20054029;BA.debugLine="ShareCode.UWDUKEY_DETAILS = 0";
mostCurrent._sharecode._uwdukey_details /*int*/  = (int) (0);
RDebugUtils.currentLine=20054030;
 //BA.debugLineNum = 20054030;BA.debugLine="ShareCode.UWDUKEY_PRODUCTS = 0";
mostCurrent._sharecode._uwdukey_products /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=20054032;
 //BA.debugLineNum = 20054032;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=20054034;
 //BA.debugLineNum = 20054034;BA.debugLine="CallSub(MainMenu, \"BadgeCheckUpdate\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug((_ba.processBA == null ? _ba : _ba.processBA),(Object)(mostCurrent._mainmenu.getObject()),"BadgeCheckUpdate");
RDebugUtils.currentLine=20054036;
 //BA.debugLineNum = 20054036;BA.debugLine="End Sub";
return "";
}
public static String  _createworkingdaytask(anywheresoftware.b4a.BA _ba,String _usertagcode,String _uniquekey,int _status) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "createworkingdaytask", false))
	 {return ((String) Debug.delegate(null, "createworkingdaytask", new Object[] {_ba,_usertagcode,_uniquekey,_status}));}
String _currdatetime = "";
String _sqlscript = "";
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Sub CreateWorkingDayTask(userTagcode As String, un";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Dim CurrDateTime As String = $\"$date{DateTime.Now";
_currdatetime = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="Dim sqlScript As String = $\"insert into userinner";
_sqlscript = ("insert into userinnertasks (tagcode, datetime, ukey, status, prodcheck) values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usertagcode))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currdatetime))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uniquekey))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_status))+"', 0)");
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.types._clataskitem  _db2clataskitem(anywheresoftware.b4a.BA _ba,String _task,String _ukey) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "db2clataskitem", false))
	 {return ((xevolution.vrcg.devdemov2400.types._clataskitem) Debug.delegate(null, "db2clataskitem", new Object[] {_ba,_task,_ukey}));}
xevolution.vrcg.devdemov2400.types._clataskitem _ret = null;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub DB2CLATaskItem(task As String, ukey As String)";
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="Dim ret As CLATaskItem";
_ret = new xevolution.vrcg.devdemov2400.types._clataskitem();
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="If Utils.NNE(task) And Utils.NNE(ukey) Then";
if (mostCurrent._utils._nne /*boolean*/ (_ba,_task) && mostCurrent._utils._nne /*boolean*/ (_ba,_ukey)) { 
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="Dim sSQL As String = $\"${EVC_SQL_GETTASKITEMS} a";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_evc_sql_gettaskitems))+" and a.task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task))+"' and a.unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ukey))+"'");
RDebugUtils.currentLine=16580615;
 //BA.debugLineNum = 16580615;BA.debugLine="Dim record As ResultSet = Starter.LocalSQLEVC.Ex";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="Do While record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=16580617;
 //BA.debugLineNum = 16580617;BA.debugLine="ret.task_tagcode = Utils.ifnullorempty(record.G";
_ret.task_tagcode /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("task_tagcode"),"");
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="ret.item_tagcode = Utils.ifnullorempty(record.G";
_ret.item_tagcode /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("item_tagcode"),"");
RDebugUtils.currentLine=16580619;
 //BA.debugLineNum = 16580619;BA.debugLine="ret.unique_key = Utils.ifnullorempty(record.Get";
_ret.unique_key /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("unique_key"),"");
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="ret.position = record.GetInt(\"position\")";
_ret.position /*int*/  = _record.GetInt("position");
RDebugUtils.currentLine=16580621;
 //BA.debugLineNum = 16580621;BA.debugLine="ret.level = record.GetInt(\"level\")";
_ret.level /*int*/  = _record.GetInt("level");
RDebugUtils.currentLine=16580622;
 //BA.debugLineNum = 16580622;BA.debugLine="ret.parent_tagcode = Utils.ifnullorempty(record";
_ret.parent_tagcode /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("parent_tagcode"),"");
RDebugUtils.currentLine=16580623;
 //BA.debugLineNum = 16580623;BA.debugLine="ret.item_type = record.GetInt(\"item_type\")";
_ret.item_type /*int*/  = _record.GetInt("item_type");
RDebugUtils.currentLine=16580624;
 //BA.debugLineNum = 16580624;BA.debugLine="ret.points = record.GetInt(\"points\")";
_ret.points /*int*/  = _record.GetInt("points");
RDebugUtils.currentLine=16580625;
 //BA.debugLineNum = 16580625;BA.debugLine="ret.risk = record.GetInt(\"risk\")";
_ret.risk /*int*/  = _record.GetInt("risk");
RDebugUtils.currentLine=16580626;
 //BA.debugLineNum = 16580626;BA.debugLine="ret.data_type = record.GetInt(\"data_type\")";
_ret.data_type /*int*/  = _record.GetInt("data_type");
RDebugUtils.currentLine=16580627;
 //BA.debugLineNum = 16580627;BA.debugLine="ret.bullet_master = record.GetInt(\"bullet_maste";
_ret.bullet_master /*int*/  = _record.GetInt("bullet_master");
RDebugUtils.currentLine=16580628;
 //BA.debugLineNum = 16580628;BA.debugLine="ret.bullet_child = record.GetInt(\"bullet_child\"";
_ret.bullet_child /*int*/  = _record.GetInt("bullet_child");
RDebugUtils.currentLine=16580629;
 //BA.debugLineNum = 16580629;BA.debugLine="ret.type_answer = Utils.ifnullorempty(record.Ge";
_ret.type_answer /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("type_answer"),"");
RDebugUtils.currentLine=16580630;
 //BA.debugLineNum = 16580630;BA.debugLine="ret.typified_answers = record.GetInt(\"typified_";
_ret.typified_answers /*int*/  = _record.GetInt("typified_answers");
RDebugUtils.currentLine=16580631;
 //BA.debugLineNum = 16580631;BA.debugLine="ret.mandatory = record.GetInt(\"mandatory\")";
_ret.mandatory /*int*/  = _record.GetInt("mandatory");
RDebugUtils.currentLine=16580632;
 //BA.debugLineNum = 16580632;BA.debugLine="ret.critical = record.GetInt(\"critical\")";
_ret.critical /*int*/  = _record.GetInt("critical");
RDebugUtils.currentLine=16580633;
 //BA.debugLineNum = 16580633;BA.debugLine="ret.repeated = record.GetInt(\"repeated\")";
_ret.repeated /*int*/  = _record.GetInt("repeated");
RDebugUtils.currentLine=16580634;
 //BA.debugLineNum = 16580634;BA.debugLine="ret.multiple = record.GetInt(\"multiple\")";
_ret.multiple /*int*/  = _record.GetInt("multiple");
RDebugUtils.currentLine=16580635;
 //BA.debugLineNum = 16580635;BA.debugLine="ret.on_report = record.GetInt(\"on_report\")";
_ret.on_report /*int*/  = _record.GetInt("on_report");
RDebugUtils.currentLine=16580636;
 //BA.debugLineNum = 16580636;BA.debugLine="ret.has_signature = record.GetInt(\"has_signatur";
_ret.has_signature /*int*/  = _record.GetInt("has_signature");
RDebugUtils.currentLine=16580637;
 //BA.debugLineNum = 16580637;BA.debugLine="ret.has_articles = record.GetInt(\"has_articles\"";
_ret.has_articles /*int*/  = _record.GetInt("has_articles");
RDebugUtils.currentLine=16580638;
 //BA.debugLineNum = 16580638;BA.debugLine="ret.type_nonconformity = Utils.ifnullorempty(re";
_ret.type_nonconformity /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("type_nonconformity"),"");
RDebugUtils.currentLine=16580639;
 //BA.debugLineNum = 16580639;BA.debugLine="ret.ta_tagcode = Utils.ifnullorempty(record.Get";
_ret.ta_tagcode /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("ta_tagcode"),"");
RDebugUtils.currentLine=16580640;
 //BA.debugLineNum = 16580640;BA.debugLine="ret.ta_override_result = record.GetInt(\"ta_over";
_ret.ta_override_result /*int*/  = _record.GetInt("ta_override_result");
RDebugUtils.currentLine=16580641;
 //BA.debugLineNum = 16580641;BA.debugLine="ret.ta_jump_tagcode = Utils.ifnullorempty(recor";
_ret.ta_jump_tagcode /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("ta_jump_tagcode"),"");
RDebugUtils.currentLine=16580642;
 //BA.debugLineNum = 16580642;BA.debugLine="ret.defobj_tagcode = Utils.ifnullorempty(record";
_ret.defobj_tagcode /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("defobj_tagcode"),"");
RDebugUtils.currentLine=16580643;
 //BA.debugLineNum = 16580643;BA.debugLine="ret.info_notes = Utils.ifnullorempty(record.Get";
_ret.info_notes /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("info_notes"),"");
RDebugUtils.currentLine=16580644;
 //BA.debugLineNum = 16580644;BA.debugLine="ret.asw_notes = Utils.ifnullorempty(record.GetS";
_ret.asw_notes /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("asw_notes"),"");
RDebugUtils.currentLine=16580645;
 //BA.debugLineNum = 16580645;BA.debugLine="ret.validate_execution = record.GetInt(\"validat";
_ret.validate_execution /*int*/  = _record.GetInt("validate_execution");
RDebugUtils.currentLine=16580646;
 //BA.debugLineNum = 16580646;BA.debugLine="ret.cla_obs = Utils.ifnullorempty(record.GetStr";
_ret.cla_obs /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("cla_obs"),"");
RDebugUtils.currentLine=16580647;
 //BA.debugLineNum = 16580647;BA.debugLine="ret.force_signature = record.GetInt(\"force_sign";
_ret.force_signature /*int*/  = _record.GetInt("force_signature");
RDebugUtils.currentLine=16580648;
 //BA.debugLineNum = 16580648;BA.debugLine="ret.force_picture = record.GetInt(\"force_pictur";
_ret.force_picture /*int*/  = _record.GetInt("force_picture");
RDebugUtils.currentLine=16580649;
 //BA.debugLineNum = 16580649;BA.debugLine="ret.force_time = record.GetInt(\"force_time\")";
_ret.force_time /*int*/  = _record.GetInt("force_time");
RDebugUtils.currentLine=16580650;
 //BA.debugLineNum = 16580650;BA.debugLine="ret.type_time_control = record.GetInt(\"type_tim";
_ret.type_time_control /*int*/  = _record.GetInt("type_time_control");
RDebugUtils.currentLine=16580651;
 //BA.debugLineNum = 16580651;BA.debugLine="ret.time_run_anyway = record.GetInt(\"time_run_a";
_ret.time_run_anyway /*int*/  = _record.GetInt("time_run_anyway");
RDebugUtils.currentLine=16580652;
 //BA.debugLineNum = 16580652;BA.debugLine="ret.dependent_key = Utils.ifnullorempty(record.";
_ret.dependent_key /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("dependent_key"),"");
RDebugUtils.currentLine=16580653;
 //BA.debugLineNum = 16580653;BA.debugLine="ret.time_duration = Utils.ifnullorempty(record.";
_ret.time_duration /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("time_duration"),"");
RDebugUtils.currentLine=16580654;
 //BA.debugLineNum = 16580654;BA.debugLine="ret.force_control = record.GetString(\"force_con";
_ret.force_control /*int*/  = (int)(Double.parseDouble(_record.GetString("force_control")));
RDebugUtils.currentLine=16580655;
 //BA.debugLineNum = 16580655;BA.debugLine="ret.type_control = record.GetString(\"type_contr";
_ret.type_control /*int*/  = (int)(Double.parseDouble(_record.GetString("type_control")));
RDebugUtils.currentLine=16580656;
 //BA.debugLineNum = 16580656;BA.debugLine="ret.control_run_anyway = record.GetString(\"cont";
_ret.control_run_anyway /*int*/  = (int)(Double.parseDouble(_record.GetString("control_run_anyway")));
RDebugUtils.currentLine=16580657;
 //BA.debugLineNum = 16580657;BA.debugLine="ret.control_condition = Utils.ifnullorempty(rec";
_ret.control_condition /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("control_condition"),"");
RDebugUtils.currentLine=16580658;
 //BA.debugLineNum = 16580658;BA.debugLine="ret.do_tagcode = Utils.ifnullorempty(record.Get";
_ret.do_tagcode /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("do_tagcode"),"");
RDebugUtils.currentLine=16580659;
 //BA.debugLineNum = 16580659;BA.debugLine="ret.do_associate_type = record.GetString(\"do_as";
_ret.do_associate_type /*int*/  = (int)(Double.parseDouble(_record.GetString("do_associate_type")));
RDebugUtils.currentLine=16580660;
 //BA.debugLineNum = 16580660;BA.debugLine="ret.do_object_image = Utils.ifnullorempty(recor";
_ret.do_object_image /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("do_object_image"),"");
RDebugUtils.currentLine=16580661;
 //BA.debugLineNum = 16580661;BA.debugLine="ret.reference = Utils.ifnullorempty(record.GetS";
_ret.reference /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("reference"),"");
RDebugUtils.currentLine=16580662;
 //BA.debugLineNum = 16580662;BA.debugLine="ret.do_subgroup = Utils.ifnullorempty(record.Ge";
_ret.do_subgroup /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("do_subgroup"),"");
RDebugUtils.currentLine=16580663;
 //BA.debugLineNum = 16580663;BA.debugLine="ret.do_subsubgroup = Utils.ifnullorempty(record";
_ret.do_subsubgroup /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("do_subsubgroup"),"");
RDebugUtils.currentLine=16580664;
 //BA.debugLineNum = 16580664;BA.debugLine="ret.do_affected_table = Utils.ifnullorempty(rec";
_ret.do_affected_table /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("do_affected_table"),"");
RDebugUtils.currentLine=16580665;
 //BA.debugLineNum = 16580665;BA.debugLine="ret.do_affected_tagcode = Utils.ifnullorempty(r";
_ret.do_affected_tagcode /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("do_affected_tagcode"),"");
RDebugUtils.currentLine=16580666;
 //BA.debugLineNum = 16580666;BA.debugLine="ret.do_affected_field = Utils.ifnullorempty(rec";
_ret.do_affected_field /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("do_affected_field"),"");
RDebugUtils.currentLine=16580667;
 //BA.debugLineNum = 16580667;BA.debugLine="ret.change_title_totime = record.GetString(\"cha";
_ret.change_title_totime /*int*/  = (int)(Double.parseDouble(_record.GetString("change_title_totime")));
RDebugUtils.currentLine=16580668;
 //BA.debugLineNum = 16580668;BA.debugLine="ret.answer_change_title = record.GetString(\"ans";
_ret.answer_change_title /*int*/  = (int)(Double.parseDouble(_record.GetString("answer_change_title")));
RDebugUtils.currentLine=16580669;
 //BA.debugLineNum = 16580669;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=16580671;
 //BA.debugLineNum = 16580671;BA.debugLine="record.Close";
_record.Close();
 }else {
RDebugUtils.currentLine=16580673;
 //BA.debugLineNum = 16580673;BA.debugLine="ret.task_tagcode = \"\"";
_ret.task_tagcode /*String*/  = "";
RDebugUtils.currentLine=16580674;
 //BA.debugLineNum = 16580674;BA.debugLine="ret.item_tagcode = \"\"";
_ret.item_tagcode /*String*/  = "";
RDebugUtils.currentLine=16580675;
 //BA.debugLineNum = 16580675;BA.debugLine="ret.unique_key = \"\"";
_ret.unique_key /*String*/  = "";
RDebugUtils.currentLine=16580676;
 //BA.debugLineNum = 16580676;BA.debugLine="ret.position = 0";
_ret.position /*int*/  = (int) (0);
RDebugUtils.currentLine=16580677;
 //BA.debugLineNum = 16580677;BA.debugLine="ret.level = 0";
_ret.level /*int*/  = (int) (0);
RDebugUtils.currentLine=16580678;
 //BA.debugLineNum = 16580678;BA.debugLine="ret.parent_tagcode = \"\"";
_ret.parent_tagcode /*String*/  = "";
RDebugUtils.currentLine=16580679;
 //BA.debugLineNum = 16580679;BA.debugLine="ret.item_type = 0";
_ret.item_type /*int*/  = (int) (0);
RDebugUtils.currentLine=16580680;
 //BA.debugLineNum = 16580680;BA.debugLine="ret.points = 0";
_ret.points /*int*/  = (int) (0);
RDebugUtils.currentLine=16580681;
 //BA.debugLineNum = 16580681;BA.debugLine="ret.risk = 0";
_ret.risk /*int*/  = (int) (0);
RDebugUtils.currentLine=16580682;
 //BA.debugLineNum = 16580682;BA.debugLine="ret.data_type = 0";
_ret.data_type /*int*/  = (int) (0);
RDebugUtils.currentLine=16580683;
 //BA.debugLineNum = 16580683;BA.debugLine="ret.bullet_master = 0";
_ret.bullet_master /*int*/  = (int) (0);
RDebugUtils.currentLine=16580684;
 //BA.debugLineNum = 16580684;BA.debugLine="ret.bullet_child = 0";
_ret.bullet_child /*int*/  = (int) (0);
RDebugUtils.currentLine=16580685;
 //BA.debugLineNum = 16580685;BA.debugLine="ret.type_answer = \"\"";
_ret.type_answer /*String*/  = "";
RDebugUtils.currentLine=16580686;
 //BA.debugLineNum = 16580686;BA.debugLine="ret.typified_answers = 0";
_ret.typified_answers /*int*/  = (int) (0);
RDebugUtils.currentLine=16580687;
 //BA.debugLineNum = 16580687;BA.debugLine="ret.mandatory = 0";
_ret.mandatory /*int*/  = (int) (0);
RDebugUtils.currentLine=16580688;
 //BA.debugLineNum = 16580688;BA.debugLine="ret.critical = 0";
_ret.critical /*int*/  = (int) (0);
RDebugUtils.currentLine=16580689;
 //BA.debugLineNum = 16580689;BA.debugLine="ret.repeated = 0";
_ret.repeated /*int*/  = (int) (0);
RDebugUtils.currentLine=16580690;
 //BA.debugLineNum = 16580690;BA.debugLine="ret.multiple = 0";
_ret.multiple /*int*/  = (int) (0);
RDebugUtils.currentLine=16580691;
 //BA.debugLineNum = 16580691;BA.debugLine="ret.on_report = 0";
_ret.on_report /*int*/  = (int) (0);
RDebugUtils.currentLine=16580692;
 //BA.debugLineNum = 16580692;BA.debugLine="ret.has_signature = 0";
_ret.has_signature /*int*/  = (int) (0);
RDebugUtils.currentLine=16580693;
 //BA.debugLineNum = 16580693;BA.debugLine="ret.has_articles = 0";
_ret.has_articles /*int*/  = (int) (0);
RDebugUtils.currentLine=16580694;
 //BA.debugLineNum = 16580694;BA.debugLine="ret.type_nonconformity = \"\"";
_ret.type_nonconformity /*String*/  = "";
RDebugUtils.currentLine=16580695;
 //BA.debugLineNum = 16580695;BA.debugLine="ret.ta_tagcode = \"\"";
_ret.ta_tagcode /*String*/  = "";
RDebugUtils.currentLine=16580696;
 //BA.debugLineNum = 16580696;BA.debugLine="ret.ta_override_result = 0";
_ret.ta_override_result /*int*/  = (int) (0);
RDebugUtils.currentLine=16580697;
 //BA.debugLineNum = 16580697;BA.debugLine="ret.ta_jump_tagcode = \"\"";
_ret.ta_jump_tagcode /*String*/  = "";
RDebugUtils.currentLine=16580698;
 //BA.debugLineNum = 16580698;BA.debugLine="ret.defobj_tagcode = \"\"";
_ret.defobj_tagcode /*String*/  = "";
RDebugUtils.currentLine=16580699;
 //BA.debugLineNum = 16580699;BA.debugLine="ret.info_notes = \"\"";
_ret.info_notes /*String*/  = "";
RDebugUtils.currentLine=16580700;
 //BA.debugLineNum = 16580700;BA.debugLine="ret.asw_notes = \"\"";
_ret.asw_notes /*String*/  = "";
RDebugUtils.currentLine=16580701;
 //BA.debugLineNum = 16580701;BA.debugLine="ret.validate_execution = 0";
_ret.validate_execution /*int*/  = (int) (0);
RDebugUtils.currentLine=16580702;
 //BA.debugLineNum = 16580702;BA.debugLine="ret.cla_obs = \"\"";
_ret.cla_obs /*String*/  = "";
RDebugUtils.currentLine=16580703;
 //BA.debugLineNum = 16580703;BA.debugLine="ret.force_signature = 0";
_ret.force_signature /*int*/  = (int) (0);
RDebugUtils.currentLine=16580704;
 //BA.debugLineNum = 16580704;BA.debugLine="ret.force_picture = 0";
_ret.force_picture /*int*/  = (int) (0);
RDebugUtils.currentLine=16580705;
 //BA.debugLineNum = 16580705;BA.debugLine="ret.force_time = 0";
_ret.force_time /*int*/  = (int) (0);
RDebugUtils.currentLine=16580706;
 //BA.debugLineNum = 16580706;BA.debugLine="ret.type_time_control = 0";
_ret.type_time_control /*int*/  = (int) (0);
RDebugUtils.currentLine=16580707;
 //BA.debugLineNum = 16580707;BA.debugLine="ret.time_run_anyway = 0";
_ret.time_run_anyway /*int*/  = (int) (0);
RDebugUtils.currentLine=16580708;
 //BA.debugLineNum = 16580708;BA.debugLine="ret.dependent_key = \"\"";
_ret.dependent_key /*String*/  = "";
RDebugUtils.currentLine=16580709;
 //BA.debugLineNum = 16580709;BA.debugLine="ret.time_duration = \"\"";
_ret.time_duration /*String*/  = "";
RDebugUtils.currentLine=16580710;
 //BA.debugLineNum = 16580710;BA.debugLine="ret.force_control = 0";
_ret.force_control /*int*/  = (int) (0);
RDebugUtils.currentLine=16580711;
 //BA.debugLineNum = 16580711;BA.debugLine="ret.type_control = 0";
_ret.type_control /*int*/  = (int) (0);
RDebugUtils.currentLine=16580712;
 //BA.debugLineNum = 16580712;BA.debugLine="ret.control_run_anyway = 0";
_ret.control_run_anyway /*int*/  = (int) (0);
RDebugUtils.currentLine=16580713;
 //BA.debugLineNum = 16580713;BA.debugLine="ret.control_condition = \"\"";
_ret.control_condition /*String*/  = "";
RDebugUtils.currentLine=16580714;
 //BA.debugLineNum = 16580714;BA.debugLine="ret.do_tagcode = \"\"";
_ret.do_tagcode /*String*/  = "";
RDebugUtils.currentLine=16580715;
 //BA.debugLineNum = 16580715;BA.debugLine="ret.do_associate_type = 0";
_ret.do_associate_type /*int*/  = (int) (0);
RDebugUtils.currentLine=16580716;
 //BA.debugLineNum = 16580716;BA.debugLine="ret.do_object_image = \"\"";
_ret.do_object_image /*String*/  = "";
RDebugUtils.currentLine=16580717;
 //BA.debugLineNum = 16580717;BA.debugLine="ret.reference = \"\"";
_ret.reference /*String*/  = "";
RDebugUtils.currentLine=16580718;
 //BA.debugLineNum = 16580718;BA.debugLine="ret.do_subgroup = \"\"";
_ret.do_subgroup /*String*/  = "";
RDebugUtils.currentLine=16580719;
 //BA.debugLineNum = 16580719;BA.debugLine="ret.do_subsubgroup = \"\"";
_ret.do_subsubgroup /*String*/  = "";
RDebugUtils.currentLine=16580720;
 //BA.debugLineNum = 16580720;BA.debugLine="ret.do_affected_table = \"\"";
_ret.do_affected_table /*String*/  = "";
RDebugUtils.currentLine=16580721;
 //BA.debugLineNum = 16580721;BA.debugLine="ret.do_affected_tagcode = \"\"";
_ret.do_affected_tagcode /*String*/  = "";
RDebugUtils.currentLine=16580722;
 //BA.debugLineNum = 16580722;BA.debugLine="ret.do_affected_field = \"\"";
_ret.do_affected_field /*String*/  = "";
RDebugUtils.currentLine=16580723;
 //BA.debugLineNum = 16580723;BA.debugLine="ret.change_title_totime = 0";
_ret.change_title_totime /*int*/  = (int) (0);
RDebugUtils.currentLine=16580724;
 //BA.debugLineNum = 16580724;BA.debugLine="ret.answer_change_title = 0";
_ret.answer_change_title /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=16580727;
 //BA.debugLineNum = 16580727;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=16580728;
 //BA.debugLineNum = 16580728;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletearticlesfromlocaldatabasefromstring(anywheresoftware.b4a.BA _ba,String _listastr) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletearticlesfromlocaldatabasefromstring", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "deletearticlesfromlocaldatabasefromstring", new Object[] {_ba,_listastr}));}
ResumableSub_DeleteArticlesFromLocalDatabaseFromString rsub = new ResumableSub_DeleteArticlesFromLocalDatabaseFromString(null,_ba,_listastr);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteArticlesFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteArticlesFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _listastr;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="If Utils.NNE(ListaStr) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils._nne /*boolean*/ (_ba,_listastr)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="Log(\"Delete Tagcodes From dta_articles and sub \"";
anywheresoftware.b4a.keywords.Common.LogImpl("617629190","Delete Tagcodes From dta_articles and sub ",0);
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_listastr.startsWith("(")) && anywheresoftware.b4a.keywords.Common.Not(_listastr.endsWith(")"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17629192;
 //BA.debugLineNum = 17629192;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
_listastr = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+")");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=17629195;
 //BA.debugLineNum = 17629195;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_articles where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17629199;
 //BA.debugLineNum = 17629199;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletecontactsfromlocaldatabasefromstring(anywheresoftware.b4a.BA _ba,String _listastr) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletecontactsfromlocaldatabasefromstring", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "deletecontactsfromlocaldatabasefromstring", new Object[] {_ba,_listastr}));}
ResumableSub_DeleteContactsFromLocalDatabaseFromString rsub = new ResumableSub_DeleteContactsFromLocalDatabaseFromString(null,_ba,_listastr);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteContactsFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteContactsFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _listastr;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="If Utils.NNE(ListaStr) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils._nne /*boolean*/ (_ba,_listastr)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="Log(\"Delete Tagcodes From dta_contacts and sub \"";
anywheresoftware.b4a.keywords.Common.LogImpl("617432582","Delete Tagcodes From dta_contacts and sub ",0);
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_listastr.startsWith("(")) && anywheresoftware.b4a.keywords.Common.Not(_listastr.endsWith(")"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
_listastr = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+")");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=17432587;
 //BA.debugLineNum = 17432587;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_contacts where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17432588;
 //BA.debugLineNum = 17432588;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_contacts_adds where object_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17432591;
 //BA.debugLineNum = 17432591;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17432592;
 //BA.debugLineNum = 17432592;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _deletefromlocaldatabase(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletefromlocaldatabase", false))
	 {return ((String) Debug.delegate(null, "deletefromlocaldatabase", new Object[] {_ba}));}
String _where = "";
anywheresoftware.b4a.objects.collections.List _lista = null;
String _request_tagcode = "";
String _listastr = "";
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Sub DeleteFromLocalDatabase";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Dim where As String = $\"select distinct tagcode f";
_where = ("select distinct tagcode from dta_requests where execute_date>='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())))+"' and execute_date<='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (2)))))+"'");
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="Log(\"DeleteFromLocalDatabase Where \" & where)";
anywheresoftware.b4a.keywords.Common.LogImpl("616973826","DeleteFromLocalDatabase Where "+_where,0);
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Dim Lista As List = GetListOfFromScriptEVC(\"tagco";
_lista = new anywheresoftware.b4a.objects.collections.List();
_lista = _getlistoffromscriptevc(_ba,"tagcode",_where);
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="If (Lista.Size >=1)Then";
if ((_lista.getSize()>=1)) { 
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="Dim request_tagcode As String = Utils.MakeFileNa";
_request_tagcode = mostCurrent._utils._makefilename /*String*/ (_ba);
RDebugUtils.currentLine=16973831;
 //BA.debugLineNum = 16973831;BA.debugLine="Dim ListaStr As String = Utils.StrList2SQLArray(";
_listastr = mostCurrent._utils._strlist2sqlarray /*String*/ (_ba,_lista);
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_values_images where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973834;
 //BA.debugLineNum = 16973834;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_values where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973835;
 //BA.debugLineNum = 16973835;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_signatures where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_relations where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973837;
 //BA.debugLineNum = 16973837;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_output_actions where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_output where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_objects where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973840;
 //BA.debugLineNum = 16973840;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_notes where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973841;
 //BA.debugLineNum = 16973841;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_fields where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973842;
 //BA.debugLineNum = 16973842;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_entities where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973843;
 //BA.debugLineNum = 16973843;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_documents where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973844;
 //BA.debugLineNum = 16973844;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_contacts where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973845;
 //BA.debugLineNum = 16973845;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_alerts where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973846;
 //BA.debugLineNum = 16973846;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973847;
 //BA.debugLineNum = 16973847;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_relations_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973848;
 //BA.debugLineNum = 16973848;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_values_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
RDebugUtils.currentLine=16973849;
 //BA.debugLineNum = 16973849;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"DataUpdate",("delete from dta_requests_values_images_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""),_request_tagcode);
 };
RDebugUtils.currentLine=16973851;
 //BA.debugLineNum = 16973851;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getlistoffromscriptevc(anywheresoftware.b4a.BA _ba,String _field,String _script) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistoffromscriptevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistoffromscriptevc", new Object[] {_ba,_field,_script}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Sub GetListOfFromScriptEVC(field As String, script";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="If Not(Utils.isNull(script)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnull /*boolean*/ (_ba,_script))) { 
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEV";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="Ret.Add(Record.GetString(field))";
_ret.Add((Object)(_record.GetString(_field)));
 }
;
RDebugUtils.currentLine=19464199;
 //BA.debugLineNum = 19464199;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19464202;
 //BA.debugLineNum = 19464202;BA.debugLine="End Sub";
return null;
}
public static String  _deletefromlocaldatabasefromlist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _lista) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletefromlocaldatabasefromlist", false))
	 {return ((String) Debug.delegate(null, "deletefromlocaldatabasefromlist", new Object[] {_ba,_lista}));}
String _listastr = "";
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub DeleteFromLocalDatabaseFromList(Lista As List)";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="If (Lista.Size >=1)Then";
if ((_lista.getSize()>=1)) { 
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Log(\"Delete Tagcodes From dta_requests and sub \"";
anywheresoftware.b4a.keywords.Common.LogImpl("617039362","Delete Tagcodes From dta_requests and sub ",0);
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Dim ListaStr As String = Utils.StrList2SQLArray(";
_listastr = mostCurrent._utils._strlist2sqlarray /*String*/ (_ba,_lista);
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_images where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039367;
 //BA.debugLineNum = 17039367;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_signatures where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039368;
 //BA.debugLineNum = 17039368;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_relations where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039369;
 //BA.debugLineNum = 17039369;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_output_actions where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_output where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039371;
 //BA.debugLineNum = 17039371;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_objects where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_notes where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039373;
 //BA.debugLineNum = 17039373;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_fields where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_entities where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039375;
 //BA.debugLineNum = 17039375;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_documents where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039376;
 //BA.debugLineNum = 17039376;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_contacts where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039377;
 //BA.debugLineNum = 17039377;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_alerts where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039378;
 //BA.debugLineNum = 17039378;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039379;
 //BA.debugLineNum = 17039379;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_relations_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039380;
 //BA.debugLineNum = 17039380;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17039381;
 //BA.debugLineNum = 17039381;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_images_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 };
RDebugUtils.currentLine=17039383;
 //BA.debugLineNum = 17039383;BA.debugLine="End Sub";
return "";
}
public static String  _deletefromlocaldatabasefromlist2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _lista,String _action,int _repeatcounter) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletefromlocaldatabasefromlist2", false))
	 {return ((String) Debug.delegate(null, "deletefromlocaldatabasefromlist2", new Object[] {_ba,_lista,_action,_repeatcounter}));}
String _listastr = "";
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Sub DeleteFromLocalDatabaseFromList2(Lista As List";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="If (Lista.Size >=1)Then";
if ((_lista.getSize()>=1)) { 
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="Log(\"Delete Tagcodes From dta_requests and sub \"";
anywheresoftware.b4a.keywords.Common.LogImpl("617104898","Delete Tagcodes From dta_requests and sub ",0);
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="Dim ListaStr As String = Utils.StrList2SQLArray(";
_listastr = mostCurrent._utils._strlist2sqlarray /*String*/ (_ba,_lista);
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_images where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+" and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+""));
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+" and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+""));
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_signatures where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+" and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+""));
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_relations where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+" and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+""));
RDebugUtils.currentLine=17104904;
 //BA.debugLineNum = 17104904;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_images_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+" and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+""));
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+" and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+""));
RDebugUtils.currentLine=17104906;
 //BA.debugLineNum = 17104906;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_relations_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+" and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+""));
 };
RDebugUtils.currentLine=17104908;
 //BA.debugLineNum = 17104908;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletefromlocaldatabasefromstring(anywheresoftware.b4a.BA _ba,String _listastr) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletefromlocaldatabasefromstring", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "deletefromlocaldatabasefromstring", new Object[] {_ba,_listastr}));}
ResumableSub_DeleteFromLocalDatabaseFromString rsub = new ResumableSub_DeleteFromLocalDatabaseFromString(null,_ba,_listastr);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _listastr;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="If Utils.NNE(ListaStr) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils._nne /*boolean*/ (_ba,_listastr)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="Log(\"Delete Tagcodes From dta_requests and sub \"";
anywheresoftware.b4a.keywords.Common.LogImpl("617170438","Delete Tagcodes From dta_requests and sub ",0);
RDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_listastr.startsWith("(")) && anywheresoftware.b4a.keywords.Common.Not(_listastr.endsWith(")"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17170440;
 //BA.debugLineNum = 17170440;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
_listastr = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+")");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=17170442;
 //BA.debugLineNum = 17170442;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170443;
 //BA.debugLineNum = 17170443;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_images where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170444;
 //BA.debugLineNum = 17170444;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170445;
 //BA.debugLineNum = 17170445;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_signatures where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170446;
 //BA.debugLineNum = 17170446;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_relations where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170447;
 //BA.debugLineNum = 17170447;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_output_actions where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170448;
 //BA.debugLineNum = 17170448;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_output where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170449;
 //BA.debugLineNum = 17170449;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_objects where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170450;
 //BA.debugLineNum = 17170450;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_notes where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170451;
 //BA.debugLineNum = 17170451;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_fields where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170452;
 //BA.debugLineNum = 17170452;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_entities where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170453;
 //BA.debugLineNum = 17170453;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_documents where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170454;
 //BA.debugLineNum = 17170454;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_contacts where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170455;
 //BA.debugLineNum = 17170455;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_alerts where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170457;
 //BA.debugLineNum = 17170457;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170458;
 //BA.debugLineNum = 17170458;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_relations_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170459;
 //BA.debugLineNum = 17170459;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17170460;
 //BA.debugLineNum = 17170460;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_requests_values_images_adds where request_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17170462;
 //BA.debugLineNum = 17170462;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17170463;
 //BA.debugLineNum = 17170463;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletelocationsfromlocaldatabasefromstring(anywheresoftware.b4a.BA _ba,String _listastr) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletelocationsfromlocaldatabasefromstring", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "deletelocationsfromlocaldatabasefromstring", new Object[] {_ba,_listastr}));}
ResumableSub_DeleteLocationsFromLocalDatabaseFromString rsub = new ResumableSub_DeleteLocationsFromLocalDatabaseFromString(null,_ba,_listastr);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteLocationsFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteLocationsFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _listastr;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="If Utils.NNE(ListaStr) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils._nne /*boolean*/ (_ba,_listastr)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17498118;
 //BA.debugLineNum = 17498118;BA.debugLine="Log(\"Delete Tagcodes From dta_locations and sub";
anywheresoftware.b4a.keywords.Common.LogImpl("617498118","Delete Tagcodes From dta_locations and sub ",0);
RDebugUtils.currentLine=17498119;
 //BA.debugLineNum = 17498119;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_listastr.startsWith("(")) && anywheresoftware.b4a.keywords.Common.Not(_listastr.endsWith(")"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17498120;
 //BA.debugLineNum = 17498120;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
_listastr = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+")");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=17498123;
 //BA.debugLineNum = 17498123;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_locations where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17498126;
 //BA.debugLineNum = 17498126;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17498127;
 //BA.debugLineNum = 17498127;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deleteobjectsfromlocaldatabasefromstring(anywheresoftware.b4a.BA _ba,String _listastr) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deleteobjectsfromlocaldatabasefromstring", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "deleteobjectsfromlocaldatabasefromstring", new Object[] {_ba,_listastr}));}
ResumableSub_DeleteObjectsFromLocalDatabaseFromString rsub = new ResumableSub_DeleteObjectsFromLocalDatabaseFromString(null,_ba,_listastr);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteObjectsFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteObjectsFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _listastr;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="If Utils.NNE(ListaStr) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils._nne /*boolean*/ (_ba,_listastr)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="Log(\"Delete Tagcodes From dta_objects and sub \")";
anywheresoftware.b4a.keywords.Common.LogImpl("617367046","Delete Tagcodes From dta_objects and sub ",0);
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_listastr.startsWith("(")) && anywheresoftware.b4a.keywords.Common.Not(_listastr.endsWith(")"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
_listastr = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+")");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_objects where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17367051;
 //BA.debugLineNum = 17367051;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_objects_contacts where object_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17367052;
 //BA.debugLineNum = 17367052;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_objects_documents where object_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17367053;
 //BA.debugLineNum = 17367053;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_objects_fields where object_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17367054;
 //BA.debugLineNum = 17367054;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_objects_images where object_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17367055;
 //BA.debugLineNum = 17367055;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_objects_locations where object_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17367056;
 //BA.debugLineNum = 17367056;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_objects_warehouses where object_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17367057;
 //BA.debugLineNum = 17367057;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_objects_relations where parent_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17367059;
 //BA.debugLineNum = 17367059;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17367060;
 //BA.debugLineNum = 17367060;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletetasksfromlocaldatabasefromstring(anywheresoftware.b4a.BA _ba,String _listastr) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletetasksfromlocaldatabasefromstring", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "deletetasksfromlocaldatabasefromstring", new Object[] {_ba,_listastr}));}
ResumableSub_DeleteTasksFromLocalDatabaseFromString rsub = new ResumableSub_DeleteTasksFromLocalDatabaseFromString(null,_ba,_listastr);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteTasksFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteTasksFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _listastr;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="If Utils.NNE(ListaStr) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils._nne /*boolean*/ (_ba,_listastr)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="Log(\"Delete Tagcodes From dta_tasks and sub \")";
anywheresoftware.b4a.keywords.Common.LogImpl("617235970","Delete Tagcodes From dta_tasks and sub ",0);
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_listastr.startsWith("(")) && anywheresoftware.b4a.keywords.Common.Not(_listastr.endsWith(")"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
_listastr = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+")");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=17235974;
 //BA.debugLineNum = 17235974;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235975;
 //BA.debugLineNum = 17235975;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_adds where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235976;
 //BA.debugLineNum = 17235976;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_documents where task_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235977;
 //BA.debugLineNum = 17235977;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_events where task_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235978;
 //BA.debugLineNum = 17235978;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_items where task_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235979;
 //BA.debugLineNum = 17235979;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_items_adds where task_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235980;
 //BA.debugLineNum = 17235980;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_items_answers where task_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235981;
 //BA.debugLineNum = 17235981;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_items_answers_events where task_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235982;
 //BA.debugLineNum = 17235982;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_obsnotes where task_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17235983;
 //BA.debugLineNum = 17235983;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_tasks_routes where task_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17235985;
 //BA.debugLineNum = 17235985;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17235986;
 //BA.debugLineNum = 17235986;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletetprequestsfromlocaldatabasefromstring(anywheresoftware.b4a.BA _ba,String _listastr) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletetprequestsfromlocaldatabasefromstring", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "deletetprequestsfromlocaldatabasefromstring", new Object[] {_ba,_listastr}));}
ResumableSub_DeleteTPRequestsFromLocalDatabaseFromString rsub = new ResumableSub_DeleteTPRequestsFromLocalDatabaseFromString(null,_ba,_listastr);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteTPRequestsFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteTPRequestsFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _listastr;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="If Utils.NNE(ListaStr) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils._nne /*boolean*/ (_ba,_listastr)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Log(\"Delete Tagcodes From dta_typerequests and s";
anywheresoftware.b4a.keywords.Common.LogImpl("617301506","Delete Tagcodes From dta_typerequests and sub ",0);
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_listastr.startsWith("(")) && anywheresoftware.b4a.keywords.Common.Not(_listastr.endsWith(")"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
_listastr = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+")");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests_fields where typerequest_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests_reports where typerequest_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests_routes where typerequest_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17301514;
 //BA.debugLineNum = 17301514;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests_tasks where typerequest_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests_tpr where typerequest_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests_signature where typerequest_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17301517;
 //BA.debugLineNum = 17301517;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests_adds where typerequest_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_typerequests_tasks_adds where typerequest_tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17301521;
 //BA.debugLineNum = 17301521;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17301522;
 //BA.debugLineNum = 17301522;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _deleteuserequipment(anywheresoftware.b4a.BA _ba,String _usertagcode,String _equiptagcode) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deleteuserequipment", false))
	 {return ((String) Debug.delegate(null, "deleteuserequipment", new Object[] {_ba,_usertagcode,_equiptagcode}));}
String _sqlscript = "";
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Sub deleteUserEquipment(userTagcode As String, equ";
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="Dim sqlScript As String = $\"delete from dta_equip";
_sqlscript = ("delete from dta_equipments_technicals where technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usertagcode))+"' and equipment_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_equiptagcode))+"'");
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="Utils.SaveSQLToLog(\"deleteUserEquipment\",sqlScrip";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"deleteUserEquipment",_sqlscript,"");
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletewarehousesfromlocaldatabasefromstring(anywheresoftware.b4a.BA _ba,String _listastr) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "deletewarehousesfromlocaldatabasefromstring", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "deletewarehousesfromlocaldatabasefromstring", new Object[] {_ba,_listastr}));}
ResumableSub_DeleteWarehousesFromLocalDatabaseFromString rsub = new ResumableSub_DeleteWarehousesFromLocalDatabaseFromString(null,_ba,_listastr);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteWarehousesFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteWarehousesFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _listastr;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="If Utils.NNE(ListaStr) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils._nne /*boolean*/ (_ba,_listastr)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="Log(\"Delete Tagcodes From dta_warehouses and sub";
anywheresoftware.b4a.keywords.Common.LogImpl("617563654","Delete Tagcodes From dta_warehouses and sub ",0);
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_listastr.startsWith("(")) && anywheresoftware.b4a.keywords.Common.Not(_listastr.endsWith(")"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
_listastr = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+")");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from dta_warehouses where tagcode in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_listastr))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static xevolution.vrcg.devdemov2400.types._claievent  _eventrecord2claievent(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "eventrecord2claievent", false))
	 {return ((xevolution.vrcg.devdemov2400.types._claievent) Debug.delegate(null, "eventrecord2claievent", new Object[] {_ba,_record}));}
xevolution.vrcg.devdemov2400.types._claievent _ret = null;
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Sub EventRecord2CLAIEvent(record As ResultSet) As";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Dim ret As CLAIEvent = Types.MakeCLAIEvent( recor";
_ret = mostCurrent._types._makeclaievent /*xevolution.vrcg.devdemov2400.types._claievent*/ (_ba,_record.GetString("event_tagcode"),_record.GetInt("position"),_record.GetInt("type_item"),_record.GetInt("active"),_record.GetString("value"),_record.GetString("formula"),_record.GetInt("have_formula"),_record.GetInt("have_condition"),_record.GetInt("have_status"),_record.GetInt("is_jump"),_record.GetInt("is_status"),_record.GetInt("is_alert"),_record.GetInt("is_email"),_record.GetInt("is_more"),_record.GetInt("is_foto"),_record.GetInt("is_action"),_record.GetInt("inc_object_contacts"),_record.GetString("team_tagcode"),_record.GetString("email_to"),_record.GetString("email_cc"),_record.GetInt("use_internal_image"),_record.GetString("default_typerequest"),_record.GetString("resobsgrp_tagcode"),_record.GetInt("add_entity_email"),_record.GetInt("add_object_email"),_record.GetInt("request_signature"));
RDebugUtils.currentLine=16646171;
 //BA.debugLineNum = 16646171;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=16646172;
 //BA.debugLineNum = 16646172;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getasmodes(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getasmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getasmodes", new Object[] {_ba}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Sub getASModes As List";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_ASMODES)";
if (true) return _getitctable(_ba,_sql_data_type_asmodes);
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getitctable(anywheresoftware.b4a.BA _ba,String _dbscript) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getitctable", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getitctable", new Object[] {_ba,_dbscript}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub getITCTable(DBScript As String) As List";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Private Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Private Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbscript))+""))));
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Ret.Add( Types.MakeDB_ITC(Record.GetInt(\"id\"), R";
_ret.Add((Object)(mostCurrent._types._makedb_itc /*xevolution.vrcg.devdemov2400.types._db_itc*/ (_ba,_record.GetInt("id"),_record.GetString("tagcode"),_record.GetString("tagdesc"),_record.GetString("color"))));
 }
;
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getasstatus(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getasstatus", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getasstatus", new Object[] {_ba}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub getASStatus As List";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_ASSTATUS)";
if (true) return _getitctable(_ba,_sql_data_type_asstatus);
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getastypes(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getastypes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getastypes", new Object[] {_ba}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Sub getASTypes As List";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="If DBUtils.TableExists(Starter.LocalSQLEVC, \"dta_";
if (mostCurrent._dbutils._tableexists /*boolean*/ (_ba,mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_actiontypes")) { 
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_ASTYPES)";
if (true) return _getitctable(_ba,_sql_data_type_astypes);
 }else {
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="Return Utils.MakeNullList";
if (true) return mostCurrent._utils._makenulllist /*anywheresoftware.b4a.objects.collections.List*/ (_ba);
 };
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="End Sub";
return null;
}
public static int  _getchildrequeststatus(anywheresoftware.b4a.BA _ba,String _request,String _action,int _counter) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getchildrequeststatus", false))
	 {return ((Integer) Debug.delegate(null, "getchildrequeststatus", new Object[] {_ba,_request,_action,_counter}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub getChildRequestStatus(Request As String, Actio";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select status_id from dta_requests_relations where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request))+"'\n"+"					and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_counter))+""))));
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="Ret = Record.GetInt(\"status_id\")";
_ret = _record.GetInt("status_id");
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="End Sub";
return 0;
}
public static int  _getcountof(anywheresoftware.b4a.BA _ba,String _table,String _condition) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getcountof", false))
	 {return ((Integer) Debug.delegate(null, "getcountof", new Object[] {_ba,_table,_condition}));}
int _ret = 0;
String _sql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub GetCountOf(Table As String, Condition As Strin";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="Dim Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="Dim SQL As String = $\"select count(0) as Total fr";
_sql = ("select count(0) as Total from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+" where 1=1 "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_condition))+"");
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="Ret = Record.GetInt(\"Total\")";
_ret = _record.GetInt("Total");
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=21168137;
 //BA.debugLineNum = 21168137;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=21168138;
 //BA.debugLineNum = 21168138;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21168139;
 //BA.debugLineNum = 21168139;BA.debugLine="End Sub";
return 0;
}
public static xevolution.vrcg.devdemov2400.types._objecttype  _getdbobjecttypeevc(anywheresoftware.b4a.BA _ba,String _tagcode) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getdbobjecttypeevc", false))
	 {return ((xevolution.vrcg.devdemov2400.types._objecttype) Debug.delegate(null, "getdbobjecttypeevc", new Object[] {_ba,_tagcode}));}
xevolution.vrcg.devdemov2400.types._objecttype _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Sub getDBObjectTypeEVC(Tagcode As String) As Objec";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Dim ret As ObjectType = Types.MakeObjectType(\"\",";
_ret = mostCurrent._types._makeobjecttype /*xevolution.vrcg.devdemov2400.types._objecttype*/ (_ba,"","","",(int) (0),(int) (0),(int) (0),(int) (0),(int) (0),"");
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("Select distinct * from dta_objecttypes\n"+"									where tagcode IN (SELECT DISTINCT object_type FROM dta_objects WHERE tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')"))));
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="ret = Types.MakeObjectType(Record.GetString(\"tag";
_ret = mostCurrent._types._makeobjecttype /*xevolution.vrcg.devdemov2400.types._objecttype*/ (_ba,_record.GetString("tagcode"),_record.GetString("title"),"GREEN",_record.GetInt("have_contracts"),_record.GetInt("have_warehouses"),_record.GetInt("have_documents"),_record.GetInt("isgroup"),_record.GetInt("documents_template"),"");
RDebugUtils.currentLine=18939918;
 //BA.debugLineNum = 18939918;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=18939920;
 //BA.debugLineNum = 18939920;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18939921;
 //BA.debugLineNum = 18939921;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=18939922;
 //BA.debugLineNum = 18939922;BA.debugLine="End Sub";
return null;
}
public static int  _getevcidfrom(anywheresoftware.b4a.BA _ba,String _table,String _field,String _value) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getevcidfrom", false))
	 {return ((Integer) Debug.delegate(null, "getevcidfrom", new Object[] {_ba,_table,_field,_value}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
int _ret = 0;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Sub GetEVCIDFrom(table As String, field As String,";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("Select id from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+" where "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"'"))));
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="ret = Record.GetInt(\"id\")";
_ret = _record.GetInt("id");
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="End Sub";
return 0;
}
public static int  _getidfrom(anywheresoftware.b4a.BA _ba,String _table,String _field,String _value) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getidfrom", false))
	 {return ((Integer) Debug.delegate(null, "getidfrom", new Object[] {_ba,_table,_field,_value}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
int _ret = 0;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Sub GetIDFrom(table As String, field As String, va";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("Select id from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+" where "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"'"))));
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="ret = Record.GetInt(\"id\")";
_ret = _record.GetInt("id");
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="End Sub";
return 0;
}
public static int  _getitctablepos(anywheresoftware.b4a.BA _ba,String _dbscript,String _tagcode) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getitctablepos", false))
	 {return ((Integer) Debug.delegate(null, "getitctablepos", new Object[] {_ba,_dbscript,_tagcode}));}
int _n = 0;
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
String _ntag = "";
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Sub getITCTablePos(DBScript As String, Tagcode As";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Private n As Int = 0, Ret As Int = 0";
_n = (int) (0);
_ret = (int) (0);
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dbscript))+""))));
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="Dim nTag As String = Utils.IfNullOrEmpty(Record.";
_ntag = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString("tagcode"),"");
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="If (Utils.NNE(nTag)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (_ba,_ntag))) { 
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="If (nTag = Tagcode) Then";
if (((_ntag).equals(_tagcode))) { 
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="Ret = n+1";
_ret = (int) (_n+1);
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="Exit";
if (true) break;
 };
 };
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="n = n + 1";
_n = (int) (_n+1);
 }
;
RDebugUtils.currentLine=18022413;
 //BA.debugLineNum = 18022413;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=18022415;
 //BA.debugLineNum = 18022415;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistofaddressetypesevc(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistofaddressetypesevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistofaddressetypesevc", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Sub GetListOfAddresseTypesEVC As List";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Dim Ret As List";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="Ret.Add(\"Geral\")";
_ret.Add((Object)("Geral"));
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistofcontacttypesevc(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistofcontacttypesevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistofcontacttypesevc", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Sub GetListOfContactTypesEVC As List";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_evc_sql_current_contact_types)));
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="Ret.Add(Record.GetString(\"tagdesc\"))";
_ret.Add((Object)(_record.GetString("tagdesc")));
 }
;
RDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19202056;
 //BA.debugLineNum = 19202056;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistofdayperiodtypesevc(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistofdayperiodtypesevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistofdayperiodtypesevc", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Sub GetListOfDayPeriodTypesEVC As List  '";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_evc_sql_dayperiod_type)));
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="Ret.Add(Record.GetString(\"tagdesc\"))";
_ret.Add((Object)(_record.GetString("tagdesc")));
 }
;
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19005447;
 //BA.debugLineNum = 19005447;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19005448;
 //BA.debugLineNum = 19005448;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistoffromevc(anywheresoftware.b4a.BA _ba,String _fromtable,String _field) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistoffromevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistoffromevc", new Object[] {_ba,_fromtable,_field}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Sub GetListOfFromEVC(fromtable As String, field As";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("Select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field))+" from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fromtable))+""))));
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="Ret.Add(Record.GetString(field))";
_ret.Add((Object)(_record.GetString(_field)));
 }
;
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19595272;
 //BA.debugLineNum = 19595272;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistoffromscript(anywheresoftware.b4a.BA _ba,String _field,String _script) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistoffromscript", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistoffromscript", new Object[] {_ba,_field,_script}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Sub GetListOfFromScript(field As String, script As";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Dim Ret As List";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="Private Row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="If Not(Utils.isNull(script)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnull /*boolean*/ (_ba,_script))) { 
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="Record = Starter.LocalSQL.ExecQuery(script)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step8 = 1;
final int limit8 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit8 ;_row = _row + step8 ) {
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=19398668;
 //BA.debugLineNum = 19398668;BA.debugLine="Ret.Add(Record.GetString(field))";
_ret.Add((Object)(_record.GetString(_field)));
 }
};
 };
RDebugUtils.currentLine=19398671;
 //BA.debugLineNum = 19398671;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=19398673;
 //BA.debugLineNum = 19398673;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19398674;
 //BA.debugLineNum = 19398674;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistoffromscriptcnlevc(anywheresoftware.b4a.BA _ba,String _fieldcode,String _fieldname,String _script) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistoffromscriptcnlevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistoffromscriptcnlevc", new Object[] {_ba,_fieldcode,_fieldname,_script}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
xevolution.vrcg.devdemov2400.types._codenamelist _cnl = null;
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Sub GetListOfFromScriptCNLEVC(fieldCode As String,";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="If Not(Utils.isNull(script)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnull /*boolean*/ (_ba,_script))) { 
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEV";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="Dim CNL As CodeNameList = Types.MakeCodeNameLis";
_cnl = mostCurrent._types._makecodenamelist /*xevolution.vrcg.devdemov2400.types._codenamelist*/ (_ba,_record.GetString(_fieldcode),_record.GetString(_fieldname));
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="Ret.Add(CNL)";
_ret.Add((Object)(_cnl));
 }
;
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistoflocalevc(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistoflocalevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistoflocalevc", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Sub GetListOfLocalEVC As List";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_evc_sql_current_objects_local)));
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="Ret.Add(Record.GetString(\"city\"))";
_ret.Add((Object)(_record.GetString("city")));
 }
;
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistofobjectstypesevc(anywheresoftware.b4a.BA _ba,boolean _incall) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistofobjectstypesevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistofobjectstypesevc", new Object[] {_ba,_incall}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Sub GetListOfObjectsTypesEVC(incAll As Boolean) As";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_evc_sql_current_objects_type)));
RDebugUtils.currentLine=19136515;
 //BA.debugLineNum = 19136515;BA.debugLine="If (incAll) Then";
if ((_incall)) { 
RDebugUtils.currentLine=19136516;
 //BA.debugLineNum = 19136516;BA.debugLine="Ret.Add(Types.MakeObjectTypes(0, \"\",\"(Todos)\"))";
_ret.Add((Object)(mostCurrent._types._makeobjecttypes /*xevolution.vrcg.devdemov2400.types._objecttypes*/ (_ba,(int) (0),"","(Todos)")));
 };
RDebugUtils.currentLine=19136519;
 //BA.debugLineNum = 19136519;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19136520;
 //BA.debugLineNum = 19136520;BA.debugLine="Ret.Add(Types.MakeObjectTypes(Record.GetInt(\"id\"";
_ret.Add((Object)(mostCurrent._types._makeobjecttypes /*xevolution.vrcg.devdemov2400.types._objecttypes*/ (_ba,_record.GetInt("id"),_record.GetString("tagcode"),_record.GetString("title"))));
 }
;
RDebugUtils.currentLine=19136522;
 //BA.debugLineNum = 19136522;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19136523;
 //BA.debugLineNum = 19136523;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19136524;
 //BA.debugLineNum = 19136524;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlistofperiodicitytypesevc(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getlistofperiodicitytypesevc", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistofperiodicitytypesevc", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _ret = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Sub GetListOfPeriodicityTypesEVC As List";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Dim Ret As List : Ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_evc_sql_periodicity_type)));
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="Ret.Add(Record.GetString(\"tagdesc\"))";
_ret.Add((Object)(_record.GetString("tagdesc")));
 }
;
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19070983;
 //BA.debugLineNum = 19070983;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=19070984;
 //BA.debugLineNum = 19070984;BA.debugLine="End Sub";
return null;
}
public static int  _getmainrequeststatus(anywheresoftware.b4a.BA _ba,String _request) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getmainrequeststatus", false))
	 {return ((Integer) Debug.delegate(null, "getmainrequeststatus", new Object[] {_ba,_request}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub getMainRequestStatus(Request As String) As Int";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select status_id from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request))+"'"))));
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="Ret = Record.GetInt(\"status_id\")";
_ret = _record.GetInt("status_id");
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=17825800;
 //BA.debugLineNum = 17825800;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=17825801;
 //BA.debugLineNum = 17825801;BA.debugLine="End Sub";
return 0;
}
public static int  _getnotifyuserstock(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getnotifyuserstock", false))
	 {return ((Integer) Debug.delegate(null, "getnotifyuserstock", new Object[] {_ba}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
int _ret = 0;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Sub getNotifyUserStock As Int";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select * from warehouses_items where qtd=0 and warehouse='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_warehouse /*String*/ ))+"'"))));
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="ret = ret + 1";
_ret = (int) (_ret+1);
 }
;
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.collections.List  _getobjectgroups(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getobjectgroups", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getobjectgroups", new Object[] {_ba}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub getObjectGroups As List";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Return getITCTable(SQL_DATA_OBJECT_GROUP)";
if (true) return _getitctable(_ba,_sql_data_object_group);
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getobjecttypes(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getobjecttypes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getobjecttypes", new Object[] {_ba}));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Sub getObjectTypes As List";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Return getITCTable(SQL_DATA_OBJECT_TYPE)";
if (true) return _getitctable(_ba,_sql_data_object_type);
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getpriority(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getpriority", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getpriority", new Object[] {_ba}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Sub getPriority As List";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_PRIORITY)";
if (true) return _getitctable(_ba,_sql_data_type_priority);
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requestinfo  _getrequestinfo(anywheresoftware.b4a.BA _ba,String _request) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getrequestinfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requestinfo) Debug.delegate(null, "getrequestinfo", new Object[] {_ba,_request}));}
xevolution.vrcg.devdemov2400.types._requestinfo _ret = null;
int _rows = 0;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub getRequestInfo(request As String) As RequestIn";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim ret As RequestInfo : ret.Initialize";
_ret = new xevolution.vrcg.devdemov2400.types._requestinfo();
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim ret As RequestInfo : ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Dim Rows As Int = 0";
_rows = (int) (0);
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Dim sSQL As String = $\"select entity_tagcode, obj";
_ssql = ("select entity_tagcode, object_tagcode, typerequest_tagcode, technical_tagcode, \n"+"						team_tagcode, vehicle_tagcode, notes, route_tagcode, reference, details\n"+"						from dta_requests \n"+"						where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request))+"'");
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="Dim record As ResultSet = Starter.LocalSQLEVC.Exe";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="Do While record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=16515081;
 //BA.debugLineNum = 16515081;BA.debugLine="ret = Types.MakeRequestInfo(request, record.GetS";
_ret = mostCurrent._types._makerequestinfo /*xevolution.vrcg.devdemov2400.types._requestinfo*/ (_ba,_request,_record.GetString("entity_tagcode"),_record.GetString("object_tagcode"),_record.GetString("typerequest_tagcode"),_record.GetString("technical_tagcode"),_record.GetString("team_tagcode"),_record.GetString("vehicle_tagcode"),_record.GetString("notes"),_record.GetString("route_tagcode"),_record.GetString("reference"),_record.GetString("details"));
RDebugUtils.currentLine=16515085;
 //BA.debugLineNum = 16515085;BA.debugLine="Rows = Rows + 1";
_rows = (int) (_rows+1);
 }
;
RDebugUtils.currentLine=16515087;
 //BA.debugLineNum = 16515087;BA.debugLine="If Rows = 0 Then";
if (_rows==0) { 
RDebugUtils.currentLine=16515088;
 //BA.debugLineNum = 16515088;BA.debugLine="ret = Types.MakeRequestInfoClear";
_ret = mostCurrent._types._makerequestinfoclear /*xevolution.vrcg.devdemov2400.types._requestinfo*/ (_ba);
 };
RDebugUtils.currentLine=16515090;
 //BA.debugLineNum = 16515090;BA.debugLine="record.Close";
_record.Close();
RDebugUtils.currentLine=16515091;
 //BA.debugLineNum = 16515091;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=16515092;
 //BA.debugLineNum = 16515092;BA.debugLine="End Sub";
return null;
}
public static String  _getrequestvaluesvaluefrom(anywheresoftware.b4a.BA _ba,String _request,String _action,String _task,String _item,String _uniquekey,String _field) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getrequestvaluesvaluefrom", false))
	 {return ((String) Debug.delegate(null, "getrequestvaluesvaluefrom", new Object[] {_ba,_request,_action,_task,_item,_uniquekey,_field}));}
String _ret = "";
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Sub getRequestValuesValueFrom(request As String, a";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim sSQL As String = $\"${EVC_SQL_GETREQUESTTASK_I";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_evc_sql_getrequesttask_itemvalue))+"\n"+"				and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request))+"' \n"+"				and a.inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"' \n"+"				and a.task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task))+"' \n"+"				and a.item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item))+"' \n"+"				and a.unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uniquekey))+"' \n"+"				and a.execute_status=1\n"+"				and a.execute_value<>''");
RDebugUtils.currentLine=16449546;
 //BA.debugLineNum = 16449546;BA.debugLine="Dim record As ResultSet = Starter.LocalSQLEVC.Exe";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=16449547;
 //BA.debugLineNum = 16449547;BA.debugLine="Do While record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=16449548;
 //BA.debugLineNum = 16449548;BA.debugLine="ret = Utils.IfNullOrEmpty(record.GetString(field";
_ret = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString(_field),"");
RDebugUtils.currentLine=16449549;
 //BA.debugLineNum = 16449549;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=16449551;
 //BA.debugLineNum = 16449551;BA.debugLine="record.Close";
_record.Close();
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=16449553;
 //BA.debugLineNum = 16449553;BA.debugLine="End Sub";
return "";
}
public static double  _getscriptcolumndoubleevc(anywheresoftware.b4a.BA _ba,String _script,String _column) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcolumndoubleevc", false))
	 {return ((Double) Debug.delegate(null, "getscriptcolumndoubleevc", new Object[] {_ba,_script,_column}));}
double _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub GetScriptColumnDoubleEVC(script As String, col";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Dim Ret As Double = 0.00";
_ret = 0.00;
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="Try";
try {RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="Ret = Record.GetDouble(column)";
_ret = _record.GetDouble(_column);
 } 
       catch (Exception e7) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e7);RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="Ret = 0.00";
_ret = 0.00;
 };
RDebugUtils.currentLine=21430282;
 //BA.debugLineNum = 21430282;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=21430284;
 //BA.debugLineNum = 21430284;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=21430285;
 //BA.debugLineNum = 21430285;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21430286;
 //BA.debugLineNum = 21430286;BA.debugLine="End Sub";
return 0;
}
public static int  _getscriptcolumnintevc(anywheresoftware.b4a.BA _ba,String _script,String _column) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcolumnintevc", false))
	 {return ((Integer) Debug.delegate(null, "getscriptcolumnintevc", new Object[] {_ba,_script,_column}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub GetScriptColumnIntEVC(script As String, column";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Dim Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="Ret = Record.GetInt(column)";
_ret = _record.GetInt(_column);
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=21495817;
 //BA.debugLineNum = 21495817;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="End Sub";
return 0;
}
public static int  _getscriptcolumnintwrk(anywheresoftware.b4a.BA _ba,String _script,String _column) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcolumnintwrk", false))
	 {return ((Integer) Debug.delegate(null, "getscriptcolumnintwrk", new Object[] {_ba,_script,_column}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub GetScriptColumnIntWRK(script As String, column";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Dim Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="Ret = Record.GetInt(column)";
_ret = _record.GetInt(_column);
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="End Sub";
return 0;
}
public static String  _getscriptcolumnstrevcjson(anywheresoftware.b4a.BA _ba,String _script,String _column,String _jsoncolumn) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcolumnstrevcjson", false))
	 {return ((String) Debug.delegate(null, "getscriptcolumnstrevcjson", new Object[] {_ba,_script,_column,_jsoncolumn}));}
String _ret = "";
String _paramters = "";
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
boolean _continuajson = false;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Sub GetScriptColumnStrEVCJSON(script As String, co";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Dim Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="Dim Paramters As String = GetScriptColumnStrEVC(s";
_paramters = _getscriptcolumnstrevc(_ba,_script,_column);
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="If Utils.NNE(Paramters) Then";
if (mostCurrent._utils._nne /*boolean*/ (_ba,_paramters)) { 
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="Dim ContinuaJSON As Boolean = True";
_continuajson = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="Try";
try {RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="JSON1.Initialize(Paramters)";
_json1.Initialize(_paramters);
RDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
 } 
       catch (Exception e10) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e10);RDebugUtils.currentLine=21757962;
 //BA.debugLineNum = 21757962;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621757962",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=21757963;
 //BA.debugLineNum = 21757963;BA.debugLine="ContinuaJSON = False";
_continuajson = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=21757966;
 //BA.debugLineNum = 21757966;BA.debugLine="If (ContinuaJSON) Then";
if ((_continuajson)) { 
RDebugUtils.currentLine=21757967;
 //BA.debugLineNum = 21757967;BA.debugLine="Ret = Utils.IfNullOrEmpty(MapJSON.Get(jsoncolum";
_ret = mostCurrent._utils._ifnullorempty /*String*/ (_ba,BA.ObjectToString(_mapjson.Get((Object)(_jsoncolumn))),_ret);
 };
 };
RDebugUtils.currentLine=21757971;
 //BA.debugLineNum = 21757971;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21757972;
 //BA.debugLineNum = 21757972;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _getscriptcolumnstrevcjsonmap(anywheresoftware.b4a.BA _ba,String _script,String _column) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcolumnstrevcjsonmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "getscriptcolumnstrevcjsonmap", new Object[] {_ba,_script,_column}));}
anywheresoftware.b4a.objects.collections.Map _ret = null;
String _paramters = "";
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
boolean _continuajson = false;
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub GetScriptColumnStrEVCJSONMAP(script As String,";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Dim Ret As Map : Ret.initialize";
_ret = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Dim Ret As Map : Ret.initialize";
_ret.Initialize();
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="Dim Paramters As String = GetScriptColumnStrEVC(s";
_paramters = _getscriptcolumnstrevc(_ba,_script,_column);
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="If Utils.NNE(Paramters) Then";
if (mostCurrent._utils._nne /*boolean*/ (_ba,_paramters)) { 
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="Dim ContinuaJSON As Boolean = True";
_continuajson = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="Try";
try {RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="JSON1.Initialize(Paramters)";
_json1.Initialize(_paramters);
RDebugUtils.currentLine=21823496;
 //BA.debugLineNum = 21823496;BA.debugLine="Dim Ret As Map = JSON1.NextObject";
_ret = new anywheresoftware.b4a.objects.collections.Map();
_ret = _json1.NextObject();
 } 
       catch (Exception e11) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e11);RDebugUtils.currentLine=21823498;
 //BA.debugLineNum = 21823498;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621823498",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=21823501;
 //BA.debugLineNum = 21823501;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21823502;
 //BA.debugLineNum = 21823502;BA.debugLine="End Sub";
return null;
}
public static String  _getscriptcolumnstrevclstmap(anywheresoftware.b4a.BA _ba,String _script,String _column,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcolumnstrevclstmap", false))
	 {return ((String) Debug.delegate(null, "getscriptcolumnstrevclstmap", new Object[] {_ba,_script,_column,_lst}));}
String _ret = "";
int _n = 0;
anywheresoftware.b4a.objects.collections.Map _mmm = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Sub GetScriptColumnStrEVCLSTMAP(script As String,";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Dim Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="For n=0 To lst.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_lst.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit2 ;_n = _n + step2 ) {
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="Dim mmm As Map = lst.Get(n)";
_mmm = new anywheresoftware.b4a.objects.collections.Map();
_mmm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_lst.Get(_n)));
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="script = script.Replace(mmm.Get(0), mmm.Get(1))";
_script = _script.replace(BA.ObjectToString(_mmm.Get((Object)(0))),BA.ObjectToString(_mmm.Get((Object)(1))));
 }
};
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="Ret = Record.GetString(column)";
_ret = _record.GetString(_column);
RDebugUtils.currentLine=21692425;
 //BA.debugLineNum = 21692425;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=21692428;
 //BA.debugLineNum = 21692428;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21692429;
 //BA.debugLineNum = 21692429;BA.debugLine="End Sub";
return "";
}
public static int  _getscriptcountevc(anywheresoftware.b4a.BA _ba,String _script) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcountevc", false))
	 {return ((Integer) Debug.delegate(null, "getscriptcountevc", new Object[] {_ba,_script}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Sub GetScriptCountEVC(Script As String) As Int";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Dim Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="Ret = Ret + 1";
_ret = (int) (_ret+1);
 }
;
RDebugUtils.currentLine=18415622;
 //BA.debugLineNum = 18415622;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18415623;
 //BA.debugLineNum = 18415623;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=18415624;
 //BA.debugLineNum = 18415624;BA.debugLine="End Sub";
return 0;
}
public static int  _getscriptcountwrk(anywheresoftware.b4a.BA _ba,String _script) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getscriptcountwrk", false))
	 {return ((Integer) Debug.delegate(null, "getscriptcountwrk", new Object[] {_ba,_script}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub GetScriptCountWRK(Script As String) As Int";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Dim Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Ret = Ret +1";
_ret = (int) (_ret+1);
 }
;
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="End Sub";
return 0;
}
public static String  _getselectscriptfield(anywheresoftware.b4a.BA _ba,String _script,String _field,int _position,boolean _nozero) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getselectscriptfield", false))
	 {return ((String) Debug.delegate(null, "getselectscriptfield", new Object[] {_ba,_script,_field,_position,_nozero}));}
String _ret = "";
int _counter = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub getSelectScriptField(script As String, field A";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Dim Counter As Int = 0";
_counter = (int) (0);
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="If (noZero = True) Then";
if ((_nozero==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Counter = 1";
_counter = (int) (1);
 };
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Dim record As ResultSet = Starter.LocalSQLEVC.Exe";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="Do While record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="If (Counter = position) Then";
if ((_counter==_position)) { 
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="ret = Utils.IfNullOrEmpty(record.GetString(fiel";
_ret = mostCurrent._utils._ifnullorempty /*String*/ (_ba,_record.GetString(_field),"");
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="Exit";
if (true) break;
 };
RDebugUtils.currentLine=16384012;
 //BA.debugLineNum = 16384012;BA.debugLine="Counter = Counter +1";
_counter = (int) (_counter+1);
 }
;
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="record.Close";
_record.Close();
RDebugUtils.currentLine=16384015;
 //BA.debugLineNum = 16384015;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _gettaskgroups(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "gettaskgroups", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "gettaskgroups", new Object[] {_ba}));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Sub getTASKGroups As List";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Return getITCTable(SQL_DATA_TASK_GROUPS)";
if (true) return _getitctable(_ba,_sql_data_task_groups);
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
return null;
}
public static int  _gettaskinfototal(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "gettaskinfototal", false))
	 {return ((Integer) Debug.delegate(null, "gettaskinfototal", new Object[] {_ba}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Sub getTaskInfoTotal As Int";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_evc_sql_get_task_with_info_val))+""))));
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="Ret = Record.GetInt(\"total\")";
_ret = _record.GetInt("total");
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=18481161;
 //BA.debugLineNum = 18481161;BA.debugLine="End Sub";
return 0;
}
public static int  _gettaskrecordgroupheight_val(anywheresoftware.b4a.BA _ba,String _condition,int _v1,int _v2) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "gettaskrecordgroupheight_val", false))
	 {return ((Integer) Debug.delegate(null, "gettaskrecordgroupheight_val", new Object[] {_ba,_condition,_v1,_v2}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Sub getTaskRecordGroupHeight_VAL(Condition As Stri";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_evc_sql_get_task_recheigth_val.replace(":V1",BA.NumberToString(_v1)).replace(":V2",BA.NumberToString(_v2))))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_condition))+""))));
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="Ret = Record.GetInt(\"items\")";
_ret = _record.GetInt("items");
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=18612231;
 //BA.debugLineNum = 18612231;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=18612233;
 //BA.debugLineNum = 18612233;BA.debugLine="End Sub";
return 0;
}
public static int  _gettaskrecordgroupitemscount(anywheresoftware.b4a.BA _ba,String _condition,int _orientation,boolean _isphone) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "gettaskrecordgroupitemscount", false))
	 {return ((Integer) Debug.delegate(null, "gettaskrecordgroupitemscount", new Object[] {_ba,_condition,_orientation,_isphone}));}
int _ret = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _ssql = "";
String _col_land = "";
String _col_port = "";
String _totalitemsheight = "";
int _vv = 0;
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub getTaskRecordGroupItemsCount(Condition As Stri";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18546695;
 //BA.debugLineNum = 18546695;BA.debugLine="Dim SSQL As String = $\"select sum(a.height_land)";
_ssql = ("select sum(a.height_land) as height_land, sum(a.height_port) as height_port,\n"+"													sum(a.height_land_sp) as height_land_sp, sum(a.height_port_sp) as height_port_sp,\n"+"													count(0) as total, \n"+"													(SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"+"															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"+"															and b.unique_key=a.unique_key))-count(0))*60 as totalitemsheight,\n"+"													case \n"+"														when SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"+"															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"+"															and b.unique_key=a.unique_key)) = 1 then 0\n"+"														when SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"+"															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"+"															and b.unique_key=a.unique_key)) = 2 then 1*60\n"+"														when SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"+"															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"+"															and b.unique_key=a.unique_key)) > 2 then (SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"+"															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"+"															and b.unique_key=a.unique_key))-2)*60\n"+"														else 0\n"+"													end as totalitemsheightcheck\n"+"													from dta_tasks_items as a where 1=1  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_condition))+"");
RDebugUtils.currentLine=18546716;
 //BA.debugLineNum = 18546716;BA.debugLine="Log( SSQL )";
anywheresoftware.b4a.keywords.Common.LogImpl("618546716",_ssql,0);
RDebugUtils.currentLine=18546717;
 //BA.debugLineNum = 18546717;BA.debugLine="Dim col_land As String = \"height_land\"";
_col_land = "height_land";
RDebugUtils.currentLine=18546718;
 //BA.debugLineNum = 18546718;BA.debugLine="Dim col_port As String = \"height_port\"";
_col_port = "height_port";
RDebugUtils.currentLine=18546719;
 //BA.debugLineNum = 18546719;BA.debugLine="Dim totalitemsheight As String = \"totalitemsheigh";
_totalitemsheight = "totalitemsheight";
RDebugUtils.currentLine=18546720;
 //BA.debugLineNum = 18546720;BA.debugLine="If (isPhone) Then";
if ((_isphone)) { 
RDebugUtils.currentLine=18546721;
 //BA.debugLineNum = 18546721;BA.debugLine="Dim col_land As String = \"height_land_sp\"";
_col_land = "height_land_sp";
RDebugUtils.currentLine=18546722;
 //BA.debugLineNum = 18546722;BA.debugLine="Dim col_port As String = \"height_port_sp\"";
_col_port = "height_port_sp";
 };
RDebugUtils.currentLine=18546725;
 //BA.debugLineNum = 18546725;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=18546726;
 //BA.debugLineNum = 18546726;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=18546727;
 //BA.debugLineNum = 18546727;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=18546728;
 //BA.debugLineNum = 18546728;BA.debugLine="If (Orientation = 0) Then";
if ((_orientation==0)) { 
RDebugUtils.currentLine=18546729;
 //BA.debugLineNum = 18546729;BA.debugLine="Ret = Record.GetInt(col_land)";
_ret = _record.GetInt(_col_land);
RDebugUtils.currentLine=18546730;
 //BA.debugLineNum = 18546730;BA.debugLine="If Not(isPhone) And Ret < 150 Then";
if (anywheresoftware.b4a.keywords.Common.Not(_isphone) && _ret<150) { 
RDebugUtils.currentLine=18546731;
 //BA.debugLineNum = 18546731;BA.debugLine="Ret = 150";
_ret = (int) (150);
 };
 }else {
RDebugUtils.currentLine=18546734;
 //BA.debugLineNum = 18546734;BA.debugLine="Ret = Record.GetInt(col_port)";
_ret = _record.GetInt(_col_port);
 };
RDebugUtils.currentLine=18546737;
 //BA.debugLineNum = 18546737;BA.debugLine="Dim vv As Int = Record.GetInt(totalitemsheight)";
_vv = _record.GetInt(_totalitemsheight);
RDebugUtils.currentLine=18546738;
 //BA.debugLineNum = 18546738;BA.debugLine="If (isPhone) Then";
if ((_isphone)) { 
RDebugUtils.currentLine=18546739;
 //BA.debugLineNum = 18546739;BA.debugLine="If Ret < 230 Then Ret = 230";
if (_ret<230) { 
_ret = (int) (230);};
RDebugUtils.currentLine=18546740;
 //BA.debugLineNum = 18546740;BA.debugLine="Ret = Ret + vv";
_ret = (int) (_ret+_vv);
 };
 };
RDebugUtils.currentLine=18546743;
 //BA.debugLineNum = 18546743;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=18546744;
 //BA.debugLineNum = 18546744;BA.debugLine="Log($\"Tamanho de pergunta ${Ret}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("618546744",("Tamanho de pergunta "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ret))+""),0);
RDebugUtils.currentLine=18546745;
 //BA.debugLineNum = 18546745;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=18546746;
 //BA.debugLineNum = 18546746;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.collections.List  _gettaskrequests(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "gettaskrequests", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "gettaskrequests", new Object[] {_ba}));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Sub getTASKRequests As List";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="Return getITCTable(SQL_DATA_TASK_REQUESTS)";
if (true) return _getitctable(_ba,_sql_data_task_requests);
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _geturgency(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "geturgency", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "geturgency", new Object[] {_ba}));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Sub getUrgency As List";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_URGENCY)";
if (true) return _getitctable(_ba,_sql_data_type_urgency);
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="End Sub";
return null;
}
public static String  _getworkerdblastupdate(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "getworkerdblastupdate", false))
	 {return ((String) Debug.delegate(null, "getworkerdblastupdate", new Object[] {_ba}));}
String _ret = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Sub GetWorkerDbLastUpdate() As String";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Private Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select * from loc_updates"))));
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="Ret = Record.GetString(\"last_update\")";
_ret = _record.GetString("last_update");
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=22151176;
 //BA.debugLineNum = 22151176;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=22151177;
 //BA.debugLineNum = 22151177;BA.debugLine="End Sub";
return "";
}
public static String  _insertaddress(anywheresoftware.b4a.BA _ba,String _entity,String _local,xevolution.vrcg.devdemov2400.types._address _adrs) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertaddress", false))
	 {return ((String) Debug.delegate(null, "insertaddress", new Object[] {_ba,_entity,_local,_adrs}));}
String _sqlscript = "";
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Sub InsertAddress(entity As String, local As Strin";
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="Dim sqlScript As String = $\"insert into locals (a";
_sqlscript = ("insert into locals (ascbus, tagcode, address_tagcode, address, address2, postal_code, city, latitude, longitude) values (1, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_local))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_local))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressName /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressName2 /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressPostalCode /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressCity /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressLatitude /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressLongitude /*String*/ ))+"')");
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="Dim sqlScript As String = $\"insert into locals2en";
_sqlscript = ("insert into locals2entities (entity, locality, localtype) values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_entity))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_local))+"', "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressType /*int*/ +1))+")");
RDebugUtils.currentLine=20643846;
 //BA.debugLineNum = 20643846;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20643847;
 //BA.debugLineNum = 20643847;BA.debugLine="End Sub";
return "";
}
public static String  _insertentityproperty(anywheresoftware.b4a.BA _ba,String _entity,String _property,String _value) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertentityproperty", false))
	 {return ((String) Debug.delegate(null, "insertentityproperty", new Object[] {_ba,_entity,_property,_value}));}
String _sqlscript = "";
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub InsertEntityProperty(entity As String, propert";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="Dim sqlScript As String = $\"insert into props2ent";
_sqlscript = ("insert into props2entities (entity, property, value) values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_entity))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_property))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"')");
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="End Sub";
return "";
}
public static String  _insertintoscript(anywheresoftware.b4a.BA _ba,String _script) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertintoscript", false))
	 {return ((String) Debug.delegate(null, "insertintoscript", new Object[] {_ba,_script}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Sub InsertIntoScript(script As String)";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="If Utils.NNE(script) Then";
if (mostCurrent._utils._nne /*boolean*/ (_ba,_script)) { 
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(script)";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_script);
 };
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="End Sub";
return "";
}
public static String  _insertobjectproperty(anywheresoftware.b4a.BA _ba,String _sobject,String _property,String _value) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertobjectproperty", false))
	 {return ((String) Debug.delegate(null, "insertobjectproperty", new Object[] {_ba,_sobject,_property,_value}));}
String _sqlscript = "";
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub InsertObjectProperty(sobject As String, proper";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Dim sqlScript As String = $\"insert into props2obj";
_sqlscript = ("insert into props2objects (object, property, value) values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sobject))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_property))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"')");
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="End Sub";
return "";
}
public static String  _insertrequestas(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.types._requestclaitem _clai,String _astagcode,int _status,int _priority,int _urgency,int _assign,String _details,String _emails,boolean _emsent,String _due_date) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertrequestas", false))
	 {return ((String) Debug.delegate(null, "insertrequestas", new Object[] {_ba,_clai,_astagcode,_status,_priority,_urgency,_assign,_details,_emails,_emsent,_due_date}));}
int _newid = 0;
boolean _newas = false;
String _actiondatetime = "";
String _emailsentdate = "";
String _ssqlscript = "";
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub InsertRequestAS(clai As RequestCLAItem, asTagc";
RDebugUtils.currentLine=21889050;
 //BA.debugLineNum = 21889050;BA.debugLine="Dim NewID As Int =  GetCountOf(\"requests_actions_";
_newid = (int) (_getcountof(_ba,"requests_actions_history",(" and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Request /*String*/ ))+"' and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"'"))+1);
RDebugUtils.currentLine=21889051;
 //BA.debugLineNum = 21889051;BA.debugLine="Dim newAS As Boolean = False";
_newas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21889052;
 //BA.debugLineNum = 21889052;BA.debugLine="If (asTagcode = \"\") Then";
if (((_astagcode).equals(""))) { 
RDebugUtils.currentLine=21889053;
 //BA.debugLineNum = 21889053;BA.debugLine="asTagcode = Utils.GenerateTagcode(\"AS0\")";
_astagcode = mostCurrent._utils._generatetagcode /*String*/ (_ba,"AS0");
RDebugUtils.currentLine=21889054;
 //BA.debugLineNum = 21889054;BA.debugLine="newAS = True";
_newas = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=21889056;
 //BA.debugLineNum = 21889056;BA.debugLine="Dim actiondatetime As String = Utils.GetCurrDatet";
_actiondatetime = mostCurrent._utils._getcurrdatetime /*String*/ (_ba);
RDebugUtils.currentLine=21889057;
 //BA.debugLineNum = 21889057;BA.debugLine="Dim emailsentdate As String = \"\"";
_emailsentdate = "";
RDebugUtils.currentLine=21889058;
 //BA.debugLineNum = 21889058;BA.debugLine="If (emsent) Then emailsentdate = actiondatetime";
if ((_emsent)) { 
_emailsentdate = _actiondatetime;};
RDebugUtils.currentLine=21889093;
 //BA.debugLineNum = 21889093;BA.debugLine="Dim ssqlScript As String = $\"INSERT INTO requests";
_ssqlscript = ("INSERT INTO requests_actions_history (id, request_tagcode, action_tagcode, task_tagcode,\n"+"		item_tagcode, uniquekey, iu_tagcode, tagcode, posis, status, details, actiondatetime, assigned_to, assigned_type, \n"+"		email_datetime, email_sent, email_to, priority, related_task, take_action, title, urgency, user_tagcode, repeatcounter, \n"+"		repeatitemcounter, due_date) values \n"+"		("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Request /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Action /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Task /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Item /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.UniqueKey /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Tagcode /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"', 0, \n"+"		"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_status))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_details))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actiondatetime))+"', 'USR_PALPEDRINHA', 0, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emailsentdate))+"', \n"+"		"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._bool2int /*int*/ (_ba,_emsent)))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emails))+"', "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_priority))+", '', '', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Title /*String*/ ))+"', "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_urgency))+", 'USR_PALPEDRINHA', \n"+"		"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.RepeatCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.RepeatItemCounter /*int*/ ))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_due_date))+"')");
RDebugUtils.currentLine=21889101;
 //BA.debugLineNum = 21889101;BA.debugLine="Log(ssqlScript)";
anywheresoftware.b4a.keywords.Common.LogImpl("621889101",_ssqlscript,0);
RDebugUtils.currentLine=21889102;
 //BA.debugLineNum = 21889102;BA.debugLine="Try";
try {RDebugUtils.currentLine=21889103;
 //BA.debugLineNum = 21889103;BA.debugLine="Starter.LocalSQL.ExecNonQuery(ssqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssqlscript);
 } 
       catch (Exception e15) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e15);RDebugUtils.currentLine=21889105;
 //BA.debugLineNum = 21889105;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621889105",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=21889108;
 //BA.debugLineNum = 21889108;BA.debugLine="If (newAS) Then";
if ((_newas)) { 
RDebugUtils.currentLine=21889109;
 //BA.debugLineNum = 21889109;BA.debugLine="Dim NewID As Int =  GetCountOf(\"requests_actions";
_newid = (int) (_getcountof(_ba,"requests_actions",(" and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Request /*String*/ ))+"' and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"'"))+1);
RDebugUtils.currentLine=21889110;
 //BA.debugLineNum = 21889110;BA.debugLine="ssqlScript = $\"INSERT INTO requests_actions (id,";
_ssqlscript = ("INSERT INTO requests_actions (id, request_tagcode, action_tagcode, task_tagcode,\n"+"			item_tagcode, uniquekey, iu_tagcode, tagcode, posis, status, details, actiondatetime, assigned_to, assigned_type, \n"+"			email_datetime, email_sent, email_to, priority, related_task, take_action, title, urgency, user_tagcode, repeatcounter, \n"+"			repeatitemcounter,due_date) values \n"+"			("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Request /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Action /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Task /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Item /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.UniqueKey /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Tagcode /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"', 0, \n"+"			"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_status))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_details))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actiondatetime))+"', 'USR_PALPEDRINHA', 0, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emailsentdate))+"', \n"+"			"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._bool2int /*int*/ (_ba,_emsent)))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emails))+"', "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_priority))+", '', '', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.Title /*String*/ ))+"', "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_urgency))+", 'USR_PALPEDRINHA', \n"+"			"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.RepeatCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clai.RepeatItemCounter /*int*/ ))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_due_date))+"')");
RDebugUtils.currentLine=21889118;
 //BA.debugLineNum = 21889118;BA.debugLine="Try";
try {RDebugUtils.currentLine=21889119;
 //BA.debugLineNum = 21889119;BA.debugLine="Starter.LocalSQL.ExecNonQuery(ssqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssqlscript);
 } 
       catch (Exception e23) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e23);RDebugUtils.currentLine=21889121;
 //BA.debugLineNum = 21889121;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621889121",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=21889164;
 //BA.debugLineNum = 21889164;BA.debugLine="Return asTagcode";
if (true) return _astagcode;
RDebugUtils.currentLine=21889165;
 //BA.debugLineNum = 21889165;BA.debugLine="End Sub";
return "";
}
public static String  _insertrequestasevc(anywheresoftware.b4a.BA _ba,String _astagcode,String _request,String _action,String _task,String _item,String _uniquekey,String _tagcode,String _dlgassubject,String _dlgasdetails,String _dlgaspriority,String _dlgasurgency,String _sess_oper_user,String _dlgasstatus,String _emailsentdate,String _emailsentonnewas,String _dlgasemails,String _dlgasduedate,int _repeatcounter,int _repeatitemcounter,int _repeatfieldcounter,String _datetimecreation,String _tagcodetpa,String _grouptpa,String _obs,int _sendtheemail) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertrequestasevc", false))
	 {return ((String) Debug.delegate(null, "insertrequestasevc", new Object[] {_ba,_astagcode,_request,_action,_task,_item,_uniquekey,_tagcode,_dlgassubject,_dlgasdetails,_dlgaspriority,_dlgasurgency,_sess_oper_user,_dlgasstatus,_emailsentdate,_emailsentonnewas,_dlgasemails,_dlgasduedate,_repeatcounter,_repeatitemcounter,_repeatfieldcounter,_datetimecreation,_tagcodetpa,_grouptpa,_obs,_sendtheemail}));}
int _newid = 0;
String _ssql = "";
String _additional = "";
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub InsertRequestASEVC(asTagcode As String, Reques";
RDebugUtils.currentLine=21954568;
 //BA.debugLineNum = 21954568;BA.debugLine="Dim NewID As Int =  GetMaxOfEVC(\"dta_actions\", \"i";
_newid = (int) (_getmaxofevc(_ba,"dta_actions","id","")+2);
RDebugUtils.currentLine=21954569;
 //BA.debugLineNum = 21954569;BA.debugLine="Dim ssql As String = $\"INSERT INTO dta_actions (i";
_ssql = ("INSERT INTO dta_actions (id,tagcode,request_tagcode,action_tagcode,task_tagcode,item_tagcode,uniquekey,iu_tagcode,\n"+"				internal,title,operation_type,details,priority_tagcode,gravity_tagcode,technical_tagcode,due_date,\n"+"				send_email,email_sent,email_to,email_cc,active, \n"+"				repeatcounter, repeatitemcounter, repeatfieldcounter, updated_at, created_at)\n"+"				values\n"+"				('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newid))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uniquekey))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"',\n"+"				'1','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgassubject))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasstatus))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasdetails))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgaspriority))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasurgency))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sess_oper_user))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasduedate))+"',\n"+"				"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sendtheemail))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sendtheemail))+",'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasemails))+"','',1, "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+", \n"+"				'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datetimecreation))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datetimecreation))+"')");
RDebugUtils.currentLine=21954578;
 //BA.debugLineNum = 21954578;BA.debugLine="Try";
try {RDebugUtils.currentLine=21954580;
 //BA.debugLineNum = 21954580;BA.debugLine="Utils.SaveSQLToLog(\"NewAS\",ssql, asTagcode)";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"NewAS",_ssql,_astagcode);
 } 
       catch (Exception e6) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e6);RDebugUtils.currentLine=21954582;
 //BA.debugLineNum = 21954582;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621954582",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=21954585;
 //BA.debugLineNum = 21954585;BA.debugLine="Dim NewID As Int =  GetMaxOfEVC(\"dta_actions_item";
_newid = (int) (_getmaxofevc(_ba,"dta_actions_items","id","")+2);
RDebugUtils.currentLine=21954586;
 //BA.debugLineNum = 21954586;BA.debugLine="Dim ssql As String = $\"INSERT INTO dta_actions_it";
_ssql = ("INSERT INTO dta_actions_items (id,actions_tagcode,operation_type,\n"+"				details, priority_tagcode, gravity_tagcode, technical_tagcode, due_date,\n"+"				send_email,email_sent,email_to,active, \n"+"				repeatcounter, repeatitemcounter, repeatfieldcounter)\n"+"				values\n"+"				('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newid))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasstatus))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasdetails))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgaspriority))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasurgency))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sess_oper_user))+"',\n"+"				'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasduedate))+"',\n"+"				"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sendtheemail))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sendtheemail))+",'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasemails))+"',1, "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+")");
RDebugUtils.currentLine=21954595;
 //BA.debugLineNum = 21954595;BA.debugLine="Try";
try {RDebugUtils.currentLine=21954597;
 //BA.debugLineNum = 21954597;BA.debugLine="Utils.SaveSQLToLog(\"NewASItem\",ssql, asTagcode)";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"NewASItem",_ssql,_astagcode);
 } 
       catch (Exception e13) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e13);RDebugUtils.currentLine=21954599;
 //BA.debugLineNum = 21954599;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621954599",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=21954602;
 //BA.debugLineNum = 21954602;BA.debugLine="If (DBUtils.TableExists(Starter.LocalSQLEVC, \"dta";
if ((mostCurrent._dbutils._tableexists /*boolean*/ (_ba,mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_actions_adds"))) { 
RDebugUtils.currentLine=21954603;
 //BA.debugLineNum = 21954603;BA.debugLine="If (Utils.NE(tagcodeTPA)) Then";
if ((mostCurrent._utils._ne /*boolean*/ (_ba,_tagcodetpa))) { 
RDebugUtils.currentLine=21954604;
 //BA.debugLineNum = 21954604;BA.debugLine="tagcodeTPA = \"TACTTT_001\"";
_tagcodetpa = "TACTTT_001";
 };
RDebugUtils.currentLine=21954607;
 //BA.debugLineNum = 21954607;BA.debugLine="Dim NewID As Int =  GetMaxOfEVC(\"dta_actions_add";
_newid = (int) (_getmaxofevc(_ba,"dta_actions_adds","id","")+1);
RDebugUtils.currentLine=21954608;
 //BA.debugLineNum = 21954608;BA.debugLine="Dim ssql As String = $\"INSERT INTO dta_actions_a";
_ssql = ("INSERT INTO dta_actions_adds (id,actions_tagcode,action_type,fieldref_01) values\n"+"				('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newid))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcodetpa))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_grouptpa))+"')");
RDebugUtils.currentLine=21954610;
 //BA.debugLineNum = 21954610;BA.debugLine="Try";
try {RDebugUtils.currentLine=21954612;
 //BA.debugLineNum = 21954612;BA.debugLine="Utils.SaveSQLToLog(\"NewASItemAdds\",ssql, asTagc";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"NewASItemAdds",_ssql,_astagcode);
 } 
       catch (Exception e24) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e24);RDebugUtils.currentLine=21954614;
 //BA.debugLineNum = 21954614;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621954614",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=21954618;
 //BA.debugLineNum = 21954618;BA.debugLine="Dim additional As String = \"\"";
_additional = "";
RDebugUtils.currentLine=21954619;
 //BA.debugLineNum = 21954619;BA.debugLine="If (Utils.NNE(obs) And Utils.NE(dlgASDetails)) Th";
if ((mostCurrent._utils._nne /*boolean*/ (_ba,_obs) && mostCurrent._utils._ne /*boolean*/ (_ba,_dlgasdetails))) { 
RDebugUtils.currentLine=21954620;
 //BA.debugLineNum = 21954620;BA.debugLine="additional = $\", execute_notes='${obs}'\"$";
_additional = (", execute_notes='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_obs))+"'");
 };
RDebugUtils.currentLine=21954623;
 //BA.debugLineNum = 21954623;BA.debugLine="Dim ssql As String = $\"UPDATE dta_requests_values";
_ssql = ("UPDATE dta_requests_values SET execute_action='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_additional))+" \n"+"							WHERE request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"								And inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action.trim()))+"'\n"+"								And task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task.trim()))+"'\n"+"								And item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item.trim()))+"'\n"+"								And unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uniquekey.trim()))+"'\n"+"								And tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'\n"+"								And repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+" ");
RDebugUtils.currentLine=21954631;
 //BA.debugLineNum = 21954631;BA.debugLine="Try";
try {RDebugUtils.currentLine=21954633;
 //BA.debugLineNum = 21954633;BA.debugLine="Utils.SaveSQLToLog(\"UpdateRequest\",ssql, asTagco";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"UpdateRequest",_ssql,_astagcode);
 } 
       catch (Exception e35) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e35);RDebugUtils.currentLine=21954635;
 //BA.debugLineNum = 21954635;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("621954635",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=21954638;
 //BA.debugLineNum = 21954638;BA.debugLine="Return asTagcode";
if (true) return _astagcode;
RDebugUtils.currentLine=21954639;
 //BA.debugLineNum = 21954639;BA.debugLine="End Sub";
return "";
}
public static String  _insertrequestasevcdetails(anywheresoftware.b4a.BA _ba,String _astagcode,String _request,String _action,String _task,String _item,String _uniquekey,String _tagcode,String _dlgassubject,String _dlgasdetails,String _dlgaspriority,String _dlgasurgency,String _sess_oper_user,String _dlgasstatus,String _emailsentdate,String _emailsentonnewas,String _dlgasemails,String _dlgasduedate,int _repeatcounter,int _repeatitemcounter,int _repeatfieldcounter,String _datetimecreation,int _sendtheemail) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertrequestasevcdetails", false))
	 {return ((String) Debug.delegate(null, "insertrequestasevcdetails", new Object[] {_ba,_astagcode,_request,_action,_task,_item,_uniquekey,_tagcode,_dlgassubject,_dlgasdetails,_dlgaspriority,_dlgasurgency,_sess_oper_user,_dlgasstatus,_emailsentdate,_emailsentonnewas,_dlgasemails,_dlgasduedate,_repeatcounter,_repeatitemcounter,_repeatfieldcounter,_datetimecreation,_sendtheemail}));}
int _newid = 0;
String _ssql = "";
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Sub InsertRequestASEVCDetails(asTagcode As String,";
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="Dim NewID As Int =  GetMaxOfEVC(\"dta_actions_item";
_newid = (int) (_getmaxofevc(_ba,"dta_actions_items","id","")+2);
RDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="Dim ssql As String = $\"INSERT INTO dta_actions_it";
_ssql = ("INSERT INTO dta_actions_items (id,actions_tagcode,operation_type,\n"+"				details, priority_tagcode, gravity_tagcode, technical_tagcode, due_date,\n"+"				send_email,email_sent,email_to,active, \n"+"				repeatcounter, repeatitemcounter, repeatfieldcounter, updated_at)\n"+"				values\n"+"				('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newid))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasstatus))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasdetails))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgaspriority))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasurgency))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sess_oper_user))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasduedate))+"',\n"+"				"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sendtheemail))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sendtheemail))+",'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasemails))+"',1, "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datetimecreation))+"')");
RDebugUtils.currentLine=22020113;
 //BA.debugLineNum = 22020113;BA.debugLine="Try";
try {RDebugUtils.currentLine=22020115;
 //BA.debugLineNum = 22020115;BA.debugLine="Utils.SaveSQLToLog(\"NewASItem\",ssql, asTagcode)";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"NewASItem",_ssql,_astagcode);
 } 
       catch (Exception e6) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e6);RDebugUtils.currentLine=22020117;
 //BA.debugLineNum = 22020117;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("622020117",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=22020120;
 //BA.debugLineNum = 22020120;BA.debugLine="Return asTagcode";
if (true) return _astagcode;
RDebugUtils.currentLine=22020121;
 //BA.debugLineNum = 22020121;BA.debugLine="End Sub";
return "";
}
public static String  _insertuserequipment(anywheresoftware.b4a.BA _ba,String _usertagcode,String _equiptagcode) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertuserequipment", false))
	 {return ((String) Debug.delegate(null, "insertuserequipment", new Object[] {_ba,_usertagcode,_equiptagcode}));}
int _newid = 0;
String _sqlscript = "";
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Sub insertUserEquipment(userTagcode As String, equ";
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Dim newID As Int = GetMaxOfEVC(\"dta_equipments_te";
_newid = _getmaxofevc(_ba,"dta_equipments_technicals","id","");
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="Dim sqlScript As String = $\"insert into dta_equip";
_sqlscript = ("insert into dta_equipments_technicals ( id, equipment_tagcode, technical_tagcode, active) values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newid+1))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_equiptagcode))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usertagcode))+"', 1)");
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="Utils.SaveSQLToLog(\"insertUserEquipment\",sqlScrip";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"insertUserEquipment",_sqlscript,"");
RDebugUtils.currentLine=20185096;
 //BA.debugLineNum = 20185096;BA.debugLine="End Sub";
return "";
}
public static String  _insertuserunavailable(anywheresoftware.b4a.BA _ba,String _code,String _startdate,String _enddate,String _reason) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertuserunavailable", false))
	 {return ((String) Debug.delegate(null, "insertuserunavailable", new Object[] {_ba,_code,_startdate,_enddate,_reason}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub insertUserUnavailable(code As String, startDat";
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="End Sub";
return "";
}
public static String  _insertworkingfiles(anywheresoftware.b4a.BA _ba,String _suser,String _tagcode,String _filename,String _folder,String _dtime,String _latitude,String _longitude) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "insertworkingfiles", false))
	 {return ((String) Debug.delegate(null, "insertworkingfiles", new Object[] {_ba,_suser,_tagcode,_filename,_folder,_dtime,_latitude,_longitude}));}
String _sqlscript = "";
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub InsertWorkingFiles(sUser As String, tagcode As";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Dim sqlScript As String = $\"INSERT INTO workingfi";
_sqlscript = ("INSERT INTO workingfiles ( ascbus, usertagcode, tagcode, folder, filename, datetime, latitude, longitude) VALUES (1,'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_suser))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_folder))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dtime))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_latitude))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_longitude))+"');");
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _removerecsfromtable(anywheresoftware.b4a.BA _ba,String _tblname,String _tblkey,String _tblchildkey,String _child_id,String _fullkeyid) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "removerecsfromtable", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "removerecsfromtable", new Object[] {_ba,_tblname,_tblkey,_tblchildkey,_child_id,_fullkeyid}));}
ResumableSub_RemoveRecsFromTable rsub = new ResumableSub_RemoveRecsFromTable(null,_ba,_tblname,_tblkey,_tblchildkey,_child_id,_fullkeyid);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RemoveRecsFromTable extends BA.ResumableSub {
public ResumableSub_RemoveRecsFromTable(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _tblname,String _tblkey,String _tblchildkey,String _child_id,String _fullkeyid) {
this.parent = parent;
this._ba = _ba;
this._tblname = _tblname;
this._tblkey = _tblkey;
this._tblchildkey = _tblchildkey;
this._child_id = _child_id;
this._fullkeyid = _fullkeyid;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _tblname;
String _tblkey;
String _tblchildkey;
String _child_id;
String _fullkeyid;
anywheresoftware.b4a.objects.collections.List _listkeyschild = null;
String _keyid = "";
String _childid = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="If (Utils.NNE(tblName) And Utils.NNE(tblName) And";
if (true) break;

case 1:
//if
this.state = 22;
if ((parent.mostCurrent._utils._nne /*boolean*/ (_ba,_tblname) && parent.mostCurrent._utils._nne /*boolean*/ (_ba,_tblname) && parent.mostCurrent._utils._nne /*boolean*/ (_ba,_fullkeyid))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 21;
this.catchState = 20;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 20;
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="If FullkeyId.Contains(\";\") Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_fullkeyid.contains(";")) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="Dim ListKeysChild As List = Regex.Split(\";\", F";
_listkeyschild = new anywheresoftware.b4a.objects.collections.List();
_listkeyschild = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(";",_fullkeyid));
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="Dim keyId As String = ListKeysChild.Get(0)";
_keyid = BA.ObjectToString(_listkeyschild.Get((int) (0)));
RDebugUtils.currentLine=16842760;
 //BA.debugLineNum = 16842760;BA.debugLine="Dim ChildId As String = ListKeysChild.Get(1)";
_childid = BA.ObjectToString(_listkeyschild.Get((int) (1)));
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="If TblChildKey <> \"\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((_tblchildkey).equals("") == false) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=16842762;
 //BA.debugLineNum = 16842762;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"DELETE FRO";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("DELETE FROM "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+" WHERE "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblkey))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_keyid))+"' and "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblchildkey))+" = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_childid))+"'"));
RDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="Log($\"DELETE FROM ${tblName} WHERE ${tblKey}=";
anywheresoftware.b4a.keywords.Common.LogImpl("616842763",("DELETE FROM "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+" WHERE "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblkey))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_keyid))+"' and "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblchildkey))+" = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_childid))+"'"),0);
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=16842765;
 //BA.debugLineNum = 16842765;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"DELETE FRO";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("DELETE FROM "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+" WHERE "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblkey))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_keyid))+"'"));
RDebugUtils.currentLine=16842766;
 //BA.debugLineNum = 16842766;BA.debugLine="Log($\"DELETE FROM ${tblName} WHERE ${tblKey}=";
anywheresoftware.b4a.keywords.Common.LogImpl("616842766",("DELETE FROM "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+" WHERE "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblkey))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_keyid))+""),0);
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=16842770;
 //BA.debugLineNum = 16842770;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"DELETE FROM";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("DELETE FROM "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+" WHERE "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblkey))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fullkeyid))+"'"));
RDebugUtils.currentLine=16842771;
 //BA.debugLineNum = 16842771;BA.debugLine="Log($\"DELETE FROM ${tblName} WHERE ${tblKey}='";
anywheresoftware.b4a.keywords.Common.LogImpl("616842771",("DELETE FROM "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+" WHERE "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblkey))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fullkeyid))+"'"),0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
RDebugUtils.currentLine=16842775;
 //BA.debugLineNum = 16842775;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("616842775",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=16842780;
 //BA.debugLineNum = 16842780;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=16842781;
 //BA.debugLineNum = 16842781;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e0);}
            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _removerecsfromtablebulk(anywheresoftware.b4a.BA _ba,String _tblname,String _tblkey,String _keyid) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "removerecsfromtablebulk", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "removerecsfromtablebulk", new Object[] {_ba,_tblname,_tblkey,_keyid}));}
ResumableSub_RemoveRecsFromTableBulk rsub = new ResumableSub_RemoveRecsFromTableBulk(null,_ba,_tblname,_tblkey,_keyid);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RemoveRecsFromTableBulk extends BA.ResumableSub {
public ResumableSub_RemoveRecsFromTableBulk(xevolution.vrcg.devdemov2400.dbstructures parent,anywheresoftware.b4a.BA _ba,String _tblname,String _tblkey,String _keyid) {
this.parent = parent;
this._ba = _ba;
this._tblname = _tblname;
this._tblkey = _tblkey;
this._keyid = _keyid;
}
xevolution.vrcg.devdemov2400.dbstructures parent;
anywheresoftware.b4a.BA _ba;
String _tblname;
String _tblkey;
String _keyid;
String _ssql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbstructures";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="If (Utils.NNE(tblName) And Utils.NNE(tblName) And";
if (true) break;

case 1:
//if
this.state = 10;
if ((parent.mostCurrent._utils._nne /*boolean*/ (_ba,_tblname) && parent.mostCurrent._utils._nne /*boolean*/ (_ba,_tblname) && parent.mostCurrent._utils._nne /*boolean*/ (_ba,_keyid))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Dim sSQL As String = $\"DELETE FROM ${tblName} WH";
_ssql = ("DELETE FROM "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblname))+" WHERE "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tblkey))+" in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_keyid))+"");
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="Try";
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
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("616908294",_ssql,0);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=16908296;
 //BA.debugLineNum = 16908296;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("616908296",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=16908301;
 //BA.debugLineNum = 16908301;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=16908302;
 //BA.debugLineNum = 16908302;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e0);}
            }
        }
    }
}
public static String  _setuserroutedate(anywheresoftware.b4a.BA _ba,String _tagcode,String _datein,String _dateout) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "setuserroutedate", false))
	 {return ((String) Debug.delegate(null, "setuserroutedate", new Object[] {_ba,_tagcode,_datein,_dateout}));}
String _lststring = "";
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordtech = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub SetUserRouteDate(Tagcode As String, datein As";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Dim lstString As String = \"\"";
_lststring = "";
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="Dim sSQL As String  = $\"SELECT route_tagcode as t";
_ssql = ("SELECT route_tagcode as tagcode FROM dta_teams_routes WHERE team_tagcode IN (\n"+"												SELECT a.team_tagcode as tagcode\n"+"												from dta_teams_routes_users AS a\n"+"												INNER JOIN dta_technicals AS b ON (b.user_tagcode=a.user_tagcode)\n"+"												WHERE b.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' AND (a.date>='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datein))+"' and a.date<='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dateout))+"' AND a.active=1))");
RDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="Dim RecordTech As ResultSet = Starter.LocalSQLEVC";
_recordtech = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordtech = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=16777225;
 //BA.debugLineNum = 16777225;BA.debugLine="Do While RecordTech.NextRow";
while (_recordtech.NextRow()) {
RDebugUtils.currentLine=16777226;
 //BA.debugLineNum = 16777226;BA.debugLine="If Utils.NNE(lstString) Then lstString = $\"${lstS";
if (mostCurrent._utils._nne /*boolean*/ (_ba,_lststring)) { 
_lststring = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lststring))+",");};
RDebugUtils.currentLine=16777227;
 //BA.debugLineNum = 16777227;BA.debugLine="lstString = $\"${lstString}'${RecordTech.GetStrin";
_lststring = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lststring))+"'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_recordtech.GetString("tagcode")))+"'");
 }
;
RDebugUtils.currentLine=16777229;
 //BA.debugLineNum = 16777229;BA.debugLine="If Utils.NNE(lstString) Then";
if (mostCurrent._utils._nne /*boolean*/ (_ba,_lststring)) { 
RDebugUtils.currentLine=16777230;
 //BA.debugLineNum = 16777230;BA.debugLine="ShareCode.SESS_UserRoute = lstString";
mostCurrent._sharecode._sess_userroute /*String*/  = _lststring;
 };
RDebugUtils.currentLine=16777232;
 //BA.debugLineNum = 16777232;BA.debugLine="Return lstString";
if (true) return _lststring;
RDebugUtils.currentLine=16777233;
 //BA.debugLineNum = 16777233;BA.debugLine="End Sub";
return "";
}
public static String  _setuserteamdate(anywheresoftware.b4a.BA _ba,String _tagcode,String _datein,String _dateout) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "setuserteamdate", false))
	 {return ((String) Debug.delegate(null, "setuserteamdate", new Object[] {_ba,_tagcode,_datein,_dateout}));}
String _lststring = "";
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordtech = null;
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub SetUserTeamDate(Tagcode As String, datein As S";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="Dim lstString As String = \"\"";
_lststring = "";
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_DEFAULT_ROUTE";
if ((mostCurrent._utils._int2bool /*boolean*/ (_ba,mostCurrent._sharecode._device_default_route /*int*/ ))) { 
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="Dim sSQL As String  = $\"SELECT a.team_tagcode as";
_ssql = ("SELECT a.team_tagcode as tagcode\n"+"								from dta_teams_routes_users AS a\n"+"								INNER JOIN dta_technicals AS b ON (b.user_tagcode=a.user_tagcode)\n"+"								WHERE b.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' AND (a.date>='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datein))+"' and a.date<='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dateout))+"' AND a.active=1)");
 }else {
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="Dim sSQL As String  = $\"SELECT a.tagcode from dt";
_ssql = ("SELECT a.tagcode from dta_teams_relations AS a\n"+"								INNER JOIN dta_technicals AS b ON (b.tagcode=a.relation_tagcode)\n"+"								WHERE b.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' AND a.active=1");
 };
RDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="Dim RecordTech As ResultSet = Starter.LocalSQLEVC";
_recordtech = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordtech = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=16711695;
 //BA.debugLineNum = 16711695;BA.debugLine="Do While RecordTech.NextRow";
while (_recordtech.NextRow()) {
RDebugUtils.currentLine=16711696;
 //BA.debugLineNum = 16711696;BA.debugLine="If Utils.NNE(lstString) Then lstString = $\"${lst";
if (mostCurrent._utils._nne /*boolean*/ (_ba,_lststring)) { 
_lststring = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lststring))+",");};
RDebugUtils.currentLine=16711697;
 //BA.debugLineNum = 16711697;BA.debugLine="lstString = $\"${lstString}'${RecordTech.GetStrin";
_lststring = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lststring))+"'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_recordtech.GetString("tagcode")))+"'");
 }
;
RDebugUtils.currentLine=16711699;
 //BA.debugLineNum = 16711699;BA.debugLine="If Utils.NNE(lstString) Then";
if (mostCurrent._utils._nne /*boolean*/ (_ba,_lststring)) { 
RDebugUtils.currentLine=16711700;
 //BA.debugLineNum = 16711700;BA.debugLine="ShareCode.SESS_UserTeam = lstString";
mostCurrent._sharecode._sess_userteam /*String*/  = _lststring;
 };
RDebugUtils.currentLine=16711702;
 //BA.debugLineNum = 16711702;BA.debugLine="Return lstString";
if (true) return _lststring;
RDebugUtils.currentLine=16711703;
 //BA.debugLineNum = 16711703;BA.debugLine="End Sub";
return "";
}
public static String  _updateaddress(anywheresoftware.b4a.BA _ba,String _entity,String _local,xevolution.vrcg.devdemov2400.types._address _adrs) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateaddress", false))
	 {return ((String) Debug.delegate(null, "updateaddress", new Object[] {_ba,_entity,_local,_adrs}));}
String _sqlscript = "";
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub UpdateAddress(entity As String, local As Strin";
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="Dim sqlScript As String = $\"update locals set add";
_sqlscript = ("update locals set address='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressName /*String*/ ))+"', address2='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressName2 /*String*/ ))+"', postal_code='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressPostalCode /*String*/ ))+"', city='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressCity /*String*/ ))+"', latitude='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressLatitude /*String*/ ))+"', longitude='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressLongitude /*String*/ ))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_local))+"'");
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="Dim sqlScript As String = $\"update locals2entitie";
_sqlscript = ("update locals2entities set localtype="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_adrs.AddressType /*int*/ +1))+" where entity='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_entity))+"' and locality='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_local))+"'");
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="End Sub";
return "";
}
public static String  _updateaddressgeoreference(anywheresoftware.b4a.BA _ba,String _entity,String _local,xevolution.vrcg.devdemov2400.types._georeference _geo) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateaddressgeoreference", false))
	 {return ((String) Debug.delegate(null, "updateaddressgeoreference", new Object[] {_ba,_entity,_local,_geo}));}
String _sqlscript = "";
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Sub UpdateAddressGeoReference(entity As String, lo";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Dim sqlScript As String = $\"update locals set lat";
_sqlscript = ("update locals set latitude='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_geo.Latitude /*String*/ ))+"', longitude='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_geo.Longitude /*String*/ ))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_local))+"'");
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="End Sub";
return "";
}
public static String  _updatecontact(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.types._contactrecord _cnt) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updatecontact", false))
	 {return ((String) Debug.delegate(null, "updatecontact", new Object[] {_ba,_cnt}));}
String _sqlscript = "";
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Sub UpdateContact(cnt As ContactRecord)";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Dim sqlScript As String = $\"update contacts set t";
_sqlscript = ("update contacts set type="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt.contactType /*int*/ ))+", name='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt.contactName /*String*/ ))+"', phone='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt.contactPhone /*String*/ ))+"', email='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt.contactEmail /*String*/ ))+"', title='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt.contactTitle /*String*/ ))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt.tagcode /*String*/ ))+"'");
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="End Sub";
return "";
}
public static String  _updateentityproperty(anywheresoftware.b4a.BA _ba,String _entity,String _property,String _value) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateentityproperty", false))
	 {return ((String) Debug.delegate(null, "updateentityproperty", new Object[] {_ba,_entity,_property,_value}));}
String _sqlscript = "";
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Sub UpdateEntityProperty(entity As String, propert";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Dim sqlScript As String = $\"update props2entities";
_sqlscript = ("update props2entities set value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"' where entity='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_entity))+"' and property='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_property))+"'");
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="End Sub";
return "";
}
public static String  _updatenotifyuserstock(anywheresoftware.b4a.BA _ba,String _code,int _qtd,String _warehouse) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updatenotifyuserstock", false))
	 {return ((String) Debug.delegate(null, "updatenotifyuserstock", new Object[] {_ba,_code,_qtd,_warehouse}));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Sub updateNotifyUserStock(code As String, qtd As I";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"update dta_war";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("update dta_warehouses_articles set qtd="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_qtd))+" where article_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_code))+"' and warehouse_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_warehouse))+"'"));
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="End Sub";
return "";
}
public static String  _updateobjectproperty(anywheresoftware.b4a.BA _ba,String _sobject,String _property,String _value) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateobjectproperty", false))
	 {return ((String) Debug.delegate(null, "updateobjectproperty", new Object[] {_ba,_sobject,_property,_value}));}
String _sqlscript = "";
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Sub UpdateObjectProperty(sobject As String, proper";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Dim sqlScript As String = $\"update props2objects";
_sqlscript = ("update props2objects set value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"' where object='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sobject))+"' and property='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_property))+"'");
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="End Sub";
return "";
}
public static String  _updateorcreateworkdayproduct(anywheresoftware.b4a.BA _ba,String _uniqueworkingdayid,String _producttagcode,int _productstatus,String _notes) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateorcreateworkdayproduct", false))
	 {return ((String) Debug.delegate(null, "updateorcreateworkdayproduct", new Object[] {_ba,_uniqueworkingdayid,_producttagcode,_productstatus,_notes}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
int _ret = 0;
String _sqlscript = "";
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Sub UpdateOrCreateWorkDayProduct(UniqueWorkingDayI";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select * from userinnertasksnolines where ukey='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uniqueworkingdayid))+"' and product_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_producttagcode))+"'"))));
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="ret = ret + 1";
_ret = (int) (_ret+1);
 }
;
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="If (ret >=1 ) Then";
if ((_ret>=1)) { 
RDebugUtils.currentLine=20447241;
 //BA.debugLineNum = 20447241;BA.debugLine="Dim sqlScript As String = $\"update userinnertask";
_sqlscript = ("update userinnertasksnolines set status="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_productstatus))+", notes='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_notes))+"' where ukey='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uniqueworkingdayid))+"' and product_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_producttagcode))+"'");
RDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
 }else {
RDebugUtils.currentLine=20447244;
 //BA.debugLineNum = 20447244;BA.debugLine="Dim sqlScript As String = $\"insert into  userinn";
_sqlscript = ("insert into  userinnertasksnolines (tagcode, ukey, product_tagcode, status, notes) values('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uniqueworkingdayid))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_producttagcode))+"', "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_productstatus))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_notes))+"')");
RDebugUtils.currentLine=20447245;
 //BA.debugLineNum = 20447245;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
 };
RDebugUtils.currentLine=20447247;
 //BA.debugLineNum = 20447247;BA.debugLine="End Sub";
return "";
}
public static String  _updaterequestasevc(anywheresoftware.b4a.BA _ba,String _astagcode,String _request,String _action,String _task,String _item,String _uniquekey,String _tagcode,String _dlgassubject,String _dlgasdetails,String _dlgaspriority,String _dlgasurgency,String _sess_oper_user,String _dlgasstatus,String _emailsentdate,String _emailsentonnewas,String _dlgasemails,String _dlgasduedate,int _repeatcounter,int _repeatitemcounter,int _repeatfieldcounter,String _datetimecreation,String _tagcodetpa,String _grouptpa,String _obs,int _emailsent) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updaterequestasevc", false))
	 {return ((String) Debug.delegate(null, "updaterequestasevc", new Object[] {_ba,_astagcode,_request,_action,_task,_item,_uniquekey,_tagcode,_dlgassubject,_dlgasdetails,_dlgaspriority,_dlgasurgency,_sess_oper_user,_dlgasstatus,_emailsentdate,_emailsentonnewas,_dlgasemails,_dlgasduedate,_repeatcounter,_repeatitemcounter,_repeatfieldcounter,_datetimecreation,_tagcodetpa,_grouptpa,_obs,_emailsent}));}
String _ssql = "";
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Sub UpdateRequestASEVC(asTagcode As String, Reques";
RDebugUtils.currentLine=22085640;
 //BA.debugLineNum = 22085640;BA.debugLine="Dim ssql As String = $\"update dta_actions set";
_ssql = ("update dta_actions set\n"+"				title='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgassubject))+"',\n"+"				operation_type='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasstatus))+"',\n"+"				details='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasdetails))+"',\n"+"				priority_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgaspriority))+"',\n"+"				gravity_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasurgency))+"',\n"+"				due_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasduedate))+"',\n"+"				send_email='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emailsent))+"',\n"+"				email_sent='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emailsent))+"',\n"+"				email_to='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasemails))+"',\n"+"				email_cc=''\n"+"				where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"'");
RDebugUtils.currentLine=22085652;
 //BA.debugLineNum = 22085652;BA.debugLine="Try";
try {RDebugUtils.currentLine=22085653;
 //BA.debugLineNum = 22085653;BA.debugLine="Utils.SaveSQLToLog(\"EditAS\",ssql, asTagcode)";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"EditAS",_ssql,_astagcode);
 } 
       catch (Exception e5) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e5);RDebugUtils.currentLine=22085655;
 //BA.debugLineNum = 22085655;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("622085655",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=22085658;
 //BA.debugLineNum = 22085658;BA.debugLine="Dim ssql As String = $\"update dta_actions_items s";
_ssql = ("update dta_actions_items set\n"+"				operation_type='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasstatus))+"',\n"+"				details='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasdetails))+"',\n"+"				priority_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgaspriority))+"',\n"+"				gravity_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasurgency))+"',\n"+"				due_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasduedate))+"',\n"+"				send_email='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emailsent))+"',\n"+"				email_sent='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_emailsent))+"',\n"+"				email_to='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dlgasemails))+"',\n"+"				email_cc=''\n"+"				where actions_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_astagcode))+"'\n"+"				and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatitemcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+"\n"+"				and repeatfieldcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"");
RDebugUtils.currentLine=22085673;
 //BA.debugLineNum = 22085673;BA.debugLine="Try";
try {RDebugUtils.currentLine=22085674;
 //BA.debugLineNum = 22085674;BA.debugLine="Utils.SaveSQLToLog(\"NewASItem\",ssql, asTagcode)";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"NewASItem",_ssql,_astagcode);
 } 
       catch (Exception e11) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e11);RDebugUtils.currentLine=22085676;
 //BA.debugLineNum = 22085676;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("622085676",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=22085678;
 //BA.debugLineNum = 22085678;BA.debugLine="Return asTagcode";
if (true) return _astagcode;
RDebugUtils.currentLine=22085679;
 //BA.debugLineNum = 22085679;BA.debugLine="End Sub";
return "";
}
public static String  _updateuseravailablestate(anywheresoftware.b4a.BA _ba,String _code,int _state) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateuseravailablestate", false))
	 {return ((String) Debug.delegate(null, "updateuseravailablestate", new Object[] {_ba,_code,_state}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Sub updateUserAvailableState(code As String, state";
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="End Sub";
return "";
}
public static String  _updateuserequipment(anywheresoftware.b4a.BA _ba,String _usertagcode,String _equiptagcode,String _oldequitagcode) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateuserequipment", false))
	 {return ((String) Debug.delegate(null, "updateuserequipment", new Object[] {_ba,_usertagcode,_equiptagcode,_oldequitagcode}));}
String _sqlscript = "";
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Sub updateUserEquipment(userTagcode As String, equ";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Dim sqlScript As String = $\"update dta_equipments";
_sqlscript = ("update dta_equipments_technicals set equipment_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_equiptagcode))+"' where technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usertagcode))+"' and  equipment_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_oldequitagcode))+"'");
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Utils.SaveSQLToLog(\"updateUserEquipment\",sqlScrip";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"updateUserEquipment",_sqlscript,"");
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="End Sub";
return "";
}
public static String  _updateuservehicle(anywheresoftware.b4a.BA _ba,String _tagcode,String _objtagcode) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateuservehicle", false))
	 {return ((String) Debug.delegate(null, "updateuservehicle", new Object[] {_ba,_tagcode,_objtagcode}));}
String _sqlscript = "";
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Sub updateUserVehicle(tagcode As String, objTagcod";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Dim sqlScript As String = $\"update dta_technicals";
_sqlscript = ("update dta_technicals set vehicle_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objtagcode))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="Utils.SaveSQLToLog(\"updateUserVehicle\",sqlScript,";
mostCurrent._utils._savesqltolog /*boolean*/ (_ba,"updateUserVehicle",_sqlscript,"");
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="End Sub";
return "";
}
public static String  _updateworkingdaystatus(anywheresoftware.b4a.BA _ba,String _ukey,String _uuser,int _ustatus,int _uproduct) throws Exception{
RDebugUtils.currentModule="dbstructures";
if (Debug.shouldDelegate(null, "updateworkingdaystatus", false))
	 {return ((String) Debug.delegate(null, "updateworkingdaystatus", new Object[] {_ba,_ukey,_uuser,_ustatus,_uproduct}));}
String _sqlscript = "";
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Sub UpdateWorkingDayStatus(ukey As String, uuser A";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Dim sqlScript As String = $\"update userinnertasks";
_sqlscript = ("update userinnertasks set status="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ustatus))+", prodcheck="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uproduct))+" where ukey='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ukey))+"' and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uuser))+"'");
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="ShareCode.UWDUKEY_DETAILS = ustatus";
mostCurrent._sharecode._uwdukey_details /*int*/  = _ustatus;
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="ShareCode.UWDUKEY_PRODUCTS = uproduct";
mostCurrent._sharecode._uwdukey_products /*int*/  = _uproduct;
RDebugUtils.currentLine=20512773;
 //BA.debugLineNum = 20512773;BA.debugLine="End Sub";
return "";
}
}