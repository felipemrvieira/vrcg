
package xevolution.vrcg.devdemov2400;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class dbstructures implements IRemote{
	public static dbstructures mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public dbstructures() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, dbstructures.class);
    static {
		mostCurrent = new dbstructures();
        remoteMe = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.dbstructures");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("dbstructures"), "xevolution.vrcg.devdemov2400.dbstructures");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("xevolution.vrcg.devdemov2400.dbstructures"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _evc_sql_global_search = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getdistricts = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getcounties = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_task_groups = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_task_requests = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_type_priority = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_type_urgency = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_type_asmodes = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_type_astypes = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_type_asstatus = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_object_type = RemoteObject.createImmutable("");
public static RemoteObject _sql_data_object_group = RemoteObject.createImmutable("");
public static RemoteObject _sql_getconfig_data = RemoteObject.createImmutable("");
public static RemoteObject _sql_getallversions_data = RemoteObject.createImmutable("");
public static RemoteObject _sql_getrequests_data_new = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getcurrent_reqest = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getprerequests_data_new = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getrequests_data_new = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getrequests_data_tasks = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getrequests_data_tasks_rep = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getrequests_data_tasks_tags = RemoteObject.createImmutable("");
public static RemoteObject _sql_getrequests_current_task = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getrequests_current_task = RemoteObject.createImmutable("");
public static RemoteObject _sql_getrequests_current = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getrequests_current = RemoteObject.createImmutable("");
public static RemoteObject _sql_kpiall_status = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_kpiall_status = RemoteObject.createImmutable("");
public static RemoteObject _sql_current_address_types = RemoteObject.createImmutable("");
public static RemoteObject _sql_current_contact_types = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_current_contact_types = RemoteObject.createImmutable("");
public static RemoteObject _sql_current_contacts = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_current_contacts = RemoteObject.createImmutable("");
public static RemoteObject _sql_current_objects = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_current_objects = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_current_objects_ent = RemoteObject.createImmutable("");
public static RemoteObject _sql_current_objects_local = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_current_objects_local = RemoteObject.createImmutable("");
public static RemoteObject _sql_current_objects_type = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_current_objects_type = RemoteObject.createImmutable("");
public static RemoteObject _sql_current_objects_properties = RemoteObject.createImmutable("");
public static RemoteObject _evc_ql_current_objects_properties = RemoteObject.createImmutable("");
public static RemoteObject _evc_ql_current_request_properties = RemoteObject.createImmutable("");
public static RemoteObject _evc_ql_current_objects_images = RemoteObject.createImmutable("");
public static RemoteObject _sql_all_contracts = RemoteObject.createImmutable("");
public static RemoteObject _sql_all_entity_contracts = RemoteObject.createImmutable("");
public static RemoteObject _sql_all_object_contracts = RemoteObject.createImmutable("");
public static RemoteObject _sql_periodicity_type = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_periodicity_type = RemoteObject.createImmutable("");
public static RemoteObject _sql_dayperiod_type = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_dayperiod_type = RemoteObject.createImmutable("");
public static RemoteObject _sql_all_documents = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_all_documents = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_obj_documents = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_current_tasks = RemoteObject.createImmutable("");
public static RemoteObject _evc_v2_sql_current_tasks = RemoteObject.createImmutable("");
public static RemoteObject _where_daysbetween_condition = RemoteObject.createImmutable("");
public static RemoteObject _evc_v1_sql_get_task_items = RemoteObject.createImmutable("");
public static RemoteObject _evc_v2_sql_get_task_items = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_task_items_two = RemoteObject.createImmutable("");
public static RemoteObject _evc_v1_sql_get_task_items_two = RemoteObject.createImmutable("");
public static RemoteObject _evc_v2_sql_get_task_items_two = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_recheigth = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_recheigthgrid = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_with_info_val = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_recheigth_val = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_task_recheigth_val = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_task_recheigth_items = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_task_recheigth_items_sum = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_task_with_info_val = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_recheigthgrid_val = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_griditems = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_item_value = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_task_item_value = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_task_item_value_events = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_item_value_grid = RemoteObject.createImmutable("");
public static RemoteObject _sql_get_task_more_as = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_task_more_as = RemoteObject.createImmutable("");
public static RemoteObject _requests_get_current_task_items = RemoteObject.createImmutable("");
public static RemoteObject _requests_get_current_task_items_v2 = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_gettaskitems = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getrequesttask_itemvalue = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_getrequest_data_info = RemoteObject.createImmutable("");
public static RemoteObject _evc_sql_get_tesk_item_value_events = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static RemoteObject _encoding = RemoteObject.declareNull("b4a.example.encoding");
public static RemoteObject _esc_pos = RemoteObject.declareNull("b4a.example.esc_pos");
public static xevolution.vrcg.devdemov2400.main _main = null;
public static xevolution.vrcg.devdemov2400.starter _starter = null;
public static xevolution.vrcg.devdemov2400.comms _comms = null;
public static xevolution.vrcg.devdemov2400.utils _utils = null;
public static xevolution.vrcg.devdemov2400.sharecode _sharecode = null;
public static xevolution.vrcg.devdemov2400.mainmenu _mainmenu = null;
public static xevolution.vrcg.devdemov2400.imageedit _imageedit = null;
public static xevolution.vrcg.devdemov2400.checklist3 _checklist3 = null;
public static xevolution.vrcg.devdemov2400.locationservice _locationservice = null;
public static xevolution.vrcg.devdemov2400.dataupdate _dataupdate = null;
public static xevolution.vrcg.devdemov2400.alerts _alerts = null;
public static xevolution.vrcg.devdemov2400.backgroundupdateservice _backgroundupdateservice = null;
public static xevolution.vrcg.devdemov2400.barcodescanner _barcodescanner = null;
public static xevolution.vrcg.devdemov2400.cameraactivity _cameraactivity = null;
public static xevolution.vrcg.devdemov2400.cameraactivity_innershot _cameraactivity_innershot = null;
public static xevolution.vrcg.devdemov2400.cameraactivity2 _cameraactivity2 = null;
public static xevolution.vrcg.devdemov2400.checklistnew _checklistnew = null;
public static xevolution.vrcg.devdemov2400.common _common = null;
public static xevolution.vrcg.devdemov2400.consts _consts = null;
public static xevolution.vrcg.devdemov2400.dbutils _dbutils = null;
public static xevolution.vrcg.devdemov2400.helpdescriptors _helpdescriptors = null;
public static xevolution.vrcg.devdemov2400.logs _logs = null;
public static xevolution.vrcg.devdemov2400.mapsactivity _mapsactivity = null;
public static xevolution.vrcg.devdemov2400.newsync _newsync = null;
public static xevolution.vrcg.devdemov2400.notas _notas = null;
public static xevolution.vrcg.devdemov2400.objectedit _objectedit = null;
public static xevolution.vrcg.devdemov2400.objects _objects = null;
public static xevolution.vrcg.devdemov2400.report _report = null;
public static xevolution.vrcg.devdemov2400.reportview _reportview = null;
public static xevolution.vrcg.devdemov2400.requests3 _requests3 = null;
public static xevolution.vrcg.devdemov2400.signaturecapture _signaturecapture = null;
public static xevolution.vrcg.devdemov2400.structures _structures = null;
public static xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public static xevolution.vrcg.devdemov2400.types _types = null;
public static xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public static xevolution.vrcg.devdemov2400.user _user = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Alerts",Debug.moduleToString(xevolution.vrcg.devdemov2400.alerts.class),"BackgroundUpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.backgroundupdateservice.class),"BarcodeScanner",Debug.moduleToString(xevolution.vrcg.devdemov2400.barcodescanner.class),"CameraActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity.class),"CameraActivity_InnerShot",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity_innershot.class),"CameraActivity2",Debug.moduleToString(xevolution.vrcg.devdemov2400.cameraactivity2.class),"CheckList3",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklist3.class),"CheckListNew",Debug.moduleToString(xevolution.vrcg.devdemov2400.checklistnew.class),"Common",Debug.moduleToString(xevolution.vrcg.devdemov2400.common.class),"Comms",Debug.moduleToString(xevolution.vrcg.devdemov2400.comms.class),"Consts",Debug.moduleToString(xevolution.vrcg.devdemov2400.consts.class),"DataUpdate",Debug.moduleToString(xevolution.vrcg.devdemov2400.dataupdate.class),"DateUtils",dbstructures.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.dbutils.class),"Encoding",dbstructures.mostCurrent._encoding,"ESC_POS",dbstructures.mostCurrent._esc_pos,"EVC_QL_CURRENT_OBJECTS_IMAGES",dbstructures._evc_ql_current_objects_images,"EVC_QL_CURRENT_OBJECTS_PROPERTIES",dbstructures._evc_ql_current_objects_properties,"EVC_QL_CURRENT_REQUEST_PROPERTIES",dbstructures._evc_ql_current_request_properties,"EVC_SQL_ALL_DOCUMENTS",dbstructures._evc_sql_all_documents,"EVC_SQL_CURRENT_CONTACT_TYPES",dbstructures._evc_sql_current_contact_types,"EVC_SQL_CURRENT_CONTACTS",dbstructures._evc_sql_current_contacts,"EVC_SQL_CURRENT_OBJECTS",dbstructures._evc_sql_current_objects,"EVC_SQL_CURRENT_OBJECTS_ENT",dbstructures._evc_sql_current_objects_ent,"EVC_SQL_CURRENT_OBJECTS_LOCAL",dbstructures._evc_sql_current_objects_local,"EVC_SQL_CURRENT_OBJECTS_TYPE",dbstructures._evc_sql_current_objects_type,"EVC_SQL_CURRENT_TASKS",dbstructures._evc_sql_current_tasks,"EVC_SQL_DAYPERIOD_TYPE",dbstructures._evc_sql_dayperiod_type,"EVC_SQL_GET_TASK_ITEM_VALUE",dbstructures._evc_sql_get_task_item_value,"EVC_SQL_GET_TASK_ITEM_VALUE_EVENTS",dbstructures._evc_sql_get_task_item_value_events,"EVC_SQL_GET_TASK_ITEMS_TWO",dbstructures._evc_sql_get_task_items_two,"EVC_SQL_GET_TASK_MORE_AS",dbstructures._evc_sql_get_task_more_as,"EVC_SQL_GET_TASK_RECHEIGTH_ITEMS",dbstructures._evc_sql_get_task_recheigth_items,"EVC_SQL_GET_TASK_RECHEIGTH_ITEMS_SUM",dbstructures._evc_sql_get_task_recheigth_items_sum,"EVC_SQL_GET_TASK_RECHEIGTH_VAL",dbstructures._evc_sql_get_task_recheigth_val,"EVC_SQL_GET_TASK_WITH_INFO_VAL",dbstructures._evc_sql_get_task_with_info_val,"EVC_SQL_GET_TESK_ITEM_VALUE_EVENTS",dbstructures._evc_sql_get_tesk_item_value_events,"EVC_SQL_GETCOUNTIES",dbstructures._evc_sql_getcounties,"EVC_SQL_GETCURRENT_REQEST",dbstructures._evc_sql_getcurrent_reqest,"EVC_SQL_GETDISTRICTS",dbstructures._evc_sql_getdistricts,"EVC_SQL_GETPREREQUESTS_DATA_NEW",dbstructures._evc_sql_getprerequests_data_new,"EVC_SQL_GETREQUEST_DATA_INFO",dbstructures._evc_sql_getrequest_data_info,"EVC_SQL_GETREQUESTS_CURRENT",dbstructures._evc_sql_getrequests_current,"EVC_SQL_GETREQUESTS_CURRENT_TASK",dbstructures._evc_sql_getrequests_current_task,"EVC_SQL_GETREQUESTS_DATA_NEW",dbstructures._evc_sql_getrequests_data_new,"EVC_SQL_GETREQUESTS_DATA_TASKS",dbstructures._evc_sql_getrequests_data_tasks,"EVC_SQL_GETREQUESTS_DATA_TASKS_REP",dbstructures._evc_sql_getrequests_data_tasks_rep,"EVC_SQL_GETREQUESTS_DATA_TASKS_TAGS",dbstructures._evc_sql_getrequests_data_tasks_tags,"EVC_SQL_GETREQUESTTASK_ITEMVALUE",dbstructures._evc_sql_getrequesttask_itemvalue,"EVC_SQL_GETTASKITEMS",dbstructures._evc_sql_gettaskitems,"EVC_SQL_GLOBAL_SEARCH",dbstructures._evc_sql_global_search,"EVC_SQL_KPIALL_STATUS",dbstructures._evc_sql_kpiall_status,"EVC_SQL_OBJ_DOCUMENTS",dbstructures._evc_sql_obj_documents,"EVC_SQL_PERIODICITY_TYPE",dbstructures._evc_sql_periodicity_type,"EVC_V1_SQL_GET_TASK_ITEMS",dbstructures._evc_v1_sql_get_task_items,"EVC_V1_SQL_GET_TASK_ITEMS_TWO",dbstructures._evc_v1_sql_get_task_items_two,"EVC_V2_SQL_CURRENT_TASKS",dbstructures._evc_v2_sql_current_tasks,"EVC_V2_SQL_GET_TASK_ITEMS",dbstructures._evc_v2_sql_get_task_items,"EVC_V2_SQL_GET_TASK_ITEMS_TWO",dbstructures._evc_v2_sql_get_task_items_two,"HelpDescriptors",Debug.moduleToString(xevolution.vrcg.devdemov2400.helpdescriptors.class),"HttpUtils2Service",Debug.moduleToString(xevolution.vrcg.devdemov2400.httputils2service.class),"ImageEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.imageedit.class),"LocationService",Debug.moduleToString(xevolution.vrcg.devdemov2400.locationservice.class),"Logs",Debug.moduleToString(xevolution.vrcg.devdemov2400.logs.class),"Main",Debug.moduleToString(xevolution.vrcg.devdemov2400.main.class),"MainMenu",Debug.moduleToString(xevolution.vrcg.devdemov2400.mainmenu.class),"MapsActivity",Debug.moduleToString(xevolution.vrcg.devdemov2400.mapsactivity.class),"NewSync",Debug.moduleToString(xevolution.vrcg.devdemov2400.newsync.class),"notas",Debug.moduleToString(xevolution.vrcg.devdemov2400.notas.class),"ObjectEdit",Debug.moduleToString(xevolution.vrcg.devdemov2400.objectedit.class),"Objects",Debug.moduleToString(xevolution.vrcg.devdemov2400.objects.class),"Report",Debug.moduleToString(xevolution.vrcg.devdemov2400.report.class),"ReportView",Debug.moduleToString(xevolution.vrcg.devdemov2400.reportview.class),"REQUESTS_GET_CURRENT_TASK_ITEMS",dbstructures._requests_get_current_task_items,"REQUESTS_GET_CURRENT_TASK_ITEMS_V2",dbstructures._requests_get_current_task_items_v2,"requests3",Debug.moduleToString(xevolution.vrcg.devdemov2400.requests3.class),"ShareCode",Debug.moduleToString(xevolution.vrcg.devdemov2400.sharecode.class),"SignatureCapture",Debug.moduleToString(xevolution.vrcg.devdemov2400.signaturecapture.class),"SQL_ALL_CONTRACTS",dbstructures._sql_all_contracts,"SQL_ALL_DOCUMENTS",dbstructures._sql_all_documents,"SQL_ALL_ENTITY_CONTRACTS",dbstructures._sql_all_entity_contracts,"SQL_ALL_OBJECT_CONTRACTS",dbstructures._sql_all_object_contracts,"SQL_CURRENT_ADDRESS_TYPES",dbstructures._sql_current_address_types,"SQL_CURRENT_CONTACT_TYPES",dbstructures._sql_current_contact_types,"SQL_CURRENT_CONTACTS",dbstructures._sql_current_contacts,"SQL_CURRENT_OBJECTS",dbstructures._sql_current_objects,"SQL_CURRENT_OBJECTS_LOCAL",dbstructures._sql_current_objects_local,"SQL_CURRENT_OBJECTS_PROPERTIES",dbstructures._sql_current_objects_properties,"SQL_CURRENT_OBJECTS_TYPE",dbstructures._sql_current_objects_type,"SQL_DATA_OBJECT_GROUP",dbstructures._sql_data_object_group,"SQL_DATA_OBJECT_TYPE",dbstructures._sql_data_object_type,"SQL_DATA_TASK_GROUPS",dbstructures._sql_data_task_groups,"SQL_DATA_TASK_REQUESTS",dbstructures._sql_data_task_requests,"SQL_DATA_TYPE_ASMODES",dbstructures._sql_data_type_asmodes,"SQL_DATA_TYPE_ASSTATUS",dbstructures._sql_data_type_asstatus,"SQL_DATA_TYPE_ASTYPES",dbstructures._sql_data_type_astypes,"SQL_DATA_TYPE_PRIORITY",dbstructures._sql_data_type_priority,"SQL_DATA_TYPE_URGENCY",dbstructures._sql_data_type_urgency,"SQL_DAYPERIOD_TYPE",dbstructures._sql_dayperiod_type,"SQL_GET_TASK_GRIDITEMS",dbstructures._sql_get_task_griditems,"SQL_GET_TASK_ITEM_VALUE",dbstructures._sql_get_task_item_value,"SQL_GET_TASK_ITEM_VALUE_GRID",dbstructures._sql_get_task_item_value_grid,"SQL_GET_TASK_MORE_AS",dbstructures._sql_get_task_more_as,"SQL_GET_TASK_RECHEIGTH",dbstructures._sql_get_task_recheigth,"SQL_GET_TASK_RECHEIGTH_VAL",dbstructures._sql_get_task_recheigth_val,"SQL_GET_TASK_RECHEIGTHGRID",dbstructures._sql_get_task_recheigthgrid,"SQL_GET_TASK_RECHEIGTHGRID_VAL",dbstructures._sql_get_task_recheigthgrid_val,"SQL_GET_TASK_WITH_INFO_VAL",dbstructures._sql_get_task_with_info_val,"SQL_GETALLVERSIONS_DATA",dbstructures._sql_getallversions_data,"SQL_GETCONFIG_DATA",dbstructures._sql_getconfig_data,"SQL_GETREQUESTS_CURRENT",dbstructures._sql_getrequests_current,"SQL_GETREQUESTS_CURRENT_TASK",dbstructures._sql_getrequests_current_task,"SQL_GETREQUESTS_DATA_NEW",dbstructures._sql_getrequests_data_new,"SQL_KPIALL_STATUS",dbstructures._sql_kpiall_status,"SQL_PERIODICITY_TYPE",dbstructures._sql_periodicity_type,"Starter",Debug.moduleToString(xevolution.vrcg.devdemov2400.starter.class),"Structures",Debug.moduleToString(xevolution.vrcg.devdemov2400.structures.class),"TasksCL2",Debug.moduleToString(xevolution.vrcg.devdemov2400.taskscl2.class),"Types",Debug.moduleToString(xevolution.vrcg.devdemov2400.types.class),"UpdateService",Debug.moduleToString(xevolution.vrcg.devdemov2400.updateservice.class),"User",Debug.moduleToString(xevolution.vrcg.devdemov2400.user.class),"UserService",Debug.moduleToString(xevolution.vrcg.devdemov2400.userservice.class),"Utils",Debug.moduleToString(xevolution.vrcg.devdemov2400.utils.class),"WHERE_DAYSBETWEEN_CONDITION",dbstructures._where_daysbetween_condition,"XUIViewsUtils",Debug.moduleToString(xevolution.vrcg.devdemov2400.xuiviewsutils.class)};
}
}