package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class structures {
private static structures mostCurrent = new structures();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _mapuser = null;
public static anywheresoftware.b4a.objects.collections.List _track_user = null;
public static anywheresoftware.b4a.objects.collections.Map _mapreports = null;
public static anywheresoftware.b4a.objects.collections.List _track_reports = null;
public static anywheresoftware.b4a.objects.collections.Map _maprequests = null;
public static anywheresoftware.b4a.objects.collections.List _trackrequests = null;
public static anywheresoftware.b4a.objects.collections.List _requeststypes = null;
public static anywheresoftware.b4a.objects.collections.List _typerequestsstatus = null;
public static anywheresoftware.b4a.objects.collections.Map _mapentities = null;
public static anywheresoftware.b4a.objects.collections.List _track_entities = null;
public static anywheresoftware.b4a.objects.collections.List _entities_types = null;
public static anywheresoftware.b4a.objects.collections.Map _mapobjects = null;
public static anywheresoftware.b4a.objects.collections.List _track_objects = null;
public static anywheresoftware.b4a.objects.collections.List _objects_types = null;
public static anywheresoftware.b4a.objects.collections.Map _maptasks = null;
public static anywheresoftware.b4a.objects.collections.List _track_tasks = null;
public static anywheresoftware.b4a.objects.collections.List _alerts_types = null;
public static anywheresoftware.b4a.objects.collections.List _alerts_status = null;
public static anywheresoftware.b4a.objects.collections.List _alerts_itemstatus = null;
public static anywheresoftware.b4a.objects.collections.List _alerts_priorities = null;
public static anywheresoftware.b4a.objects.collections.List _alerts_urgency = null;
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
public xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public xevolution.vrcg.devdemov2400.types _types = null;
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static String  _getmaptitlebyid(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _objectmap,int _id) throws Exception{
RDebugUtils.currentModule="structures";
if (Debug.shouldDelegate(null, "getmaptitlebyid", false))
	 {return ((String) Debug.delegate(null, "getmaptitlebyid", new Object[] {_ba,_objectmap,_id}));}
String _ret = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
RDebugUtils.currentLine=180027392;
 //BA.debugLineNum = 180027392;BA.debugLine="Public Sub GetMapTitleByID(ObjectMap As List, ID A";
RDebugUtils.currentLine=180027393;
 //BA.debugLineNum = 180027393;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=180027394;
 //BA.debugLineNum = 180027394;BA.debugLine="If (ObjectMap.Size > 0) Then";
if ((_objectmap.getSize()>0)) { 
RDebugUtils.currentLine=180027395;
 //BA.debugLineNum = 180027395;BA.debugLine="For i=0 To ObjectMap.size-1";
{
final int step3 = 1;
final int limit3 = (int) (_objectmap.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=180027396;
 //BA.debugLineNum = 180027396;BA.debugLine="Dim mData As Map = ObjectMap.Get(i)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_objectmap.Get(_i)));
RDebugUtils.currentLine=180027397;
 //BA.debugLineNum = 180027397;BA.debugLine="If (mData.Get(\"id\") = ID) Then";
if (((_mdata.Get((Object)("id"))).equals((Object)(_id)))) { 
RDebugUtils.currentLine=180027398;
 //BA.debugLineNum = 180027398;BA.debugLine="ret = mData.Get(\"title\")";
_ret = BA.ObjectToString(_mdata.Get((Object)("title")));
RDebugUtils.currentLine=180027399;
 //BA.debugLineNum = 180027399;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=180027403;
 //BA.debugLineNum = 180027403;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=180027404;
 //BA.debugLineNum = 180027404;BA.debugLine="End Sub";
return "";
}
public static String  _getmapcolorbyid(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _objectmap,int _id) throws Exception{
RDebugUtils.currentModule="structures";
if (Debug.shouldDelegate(null, "getmapcolorbyid", false))
	 {return ((String) Debug.delegate(null, "getmapcolorbyid", new Object[] {_ba,_objectmap,_id}));}
String _ret = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
RDebugUtils.currentLine=180092928;
 //BA.debugLineNum = 180092928;BA.debugLine="Public Sub GetMapColorByID(ObjectMap As List, ID A";
RDebugUtils.currentLine=180092929;
 //BA.debugLineNum = 180092929;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=180092930;
 //BA.debugLineNum = 180092930;BA.debugLine="If (ObjectMap.Size > 0) Then";
if ((_objectmap.getSize()>0)) { 
RDebugUtils.currentLine=180092931;
 //BA.debugLineNum = 180092931;BA.debugLine="For i=0 To ObjectMap.size-1";
{
final int step3 = 1;
final int limit3 = (int) (_objectmap.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=180092932;
 //BA.debugLineNum = 180092932;BA.debugLine="Dim mData As Map = ObjectMap.Get(i)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_objectmap.Get(_i)));
RDebugUtils.currentLine=180092933;
 //BA.debugLineNum = 180092933;BA.debugLine="If (mData.Get(\"id\") = ID) Then";
if (((_mdata.Get((Object)("id"))).equals((Object)(_id)))) { 
RDebugUtils.currentLine=180092934;
 //BA.debugLineNum = 180092934;BA.debugLine="ret = mData.Get(\"color\")";
_ret = BA.ObjectToString(_mdata.Get((Object)("color")));
RDebugUtils.currentLine=180092935;
 //BA.debugLineNum = 180092935;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=180092939;
 //BA.debugLineNum = 180092939;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=180092940;
 //BA.debugLineNum = 180092940;BA.debugLine="End Sub";
return "";
}
public static String  _getmapdescbypos(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _objectmap,int _pos) throws Exception{
RDebugUtils.currentModule="structures";
if (Debug.shouldDelegate(null, "getmapdescbypos", false))
	 {return ((String) Debug.delegate(null, "getmapdescbypos", new Object[] {_ba,_objectmap,_pos}));}
String _ret = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;
RDebugUtils.currentLine=180158464;
 //BA.debugLineNum = 180158464;BA.debugLine="Public Sub GetMapDescByPos(ObjectMap As List, pos";
RDebugUtils.currentLine=180158465;
 //BA.debugLineNum = 180158465;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=180158466;
 //BA.debugLineNum = 180158466;BA.debugLine="If (ObjectMap.Size > 0) And ((pos >= 0) And (pos+";
if ((_objectmap.getSize()>0) && ((_pos>=0) && (_pos+1<_objectmap.getSize()))) { 
RDebugUtils.currentLine=180158467;
 //BA.debugLineNum = 180158467;BA.debugLine="Dim mData As Map = ObjectMap.Get(pos)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_objectmap.Get(_pos)));
RDebugUtils.currentLine=180158468;
 //BA.debugLineNum = 180158468;BA.debugLine="ret = mData.Get(\"title\")";
_ret = BA.ObjectToString(_mdata.Get((Object)("title")));
 };
RDebugUtils.currentLine=180158470;
 //BA.debugLineNum = 180158470;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=180158471;
 //BA.debugLineNum = 180158471;BA.debugLine="End Sub";
return "";
}
public static String  _gettrackerdesc(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _objectmap,int _id) throws Exception{
RDebugUtils.currentModule="structures";
if (Debug.shouldDelegate(null, "gettrackerdesc", false))
	 {return ((String) Debug.delegate(null, "gettrackerdesc", new Object[] {_ba,_objectmap,_id}));}
String _ret = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;
RDebugUtils.currentLine=179896320;
 //BA.debugLineNum = 179896320;BA.debugLine="Public Sub GetTrackerDesc(ObjectMap As List, ID As";
RDebugUtils.currentLine=179896321;
 //BA.debugLineNum = 179896321;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=179896322;
 //BA.debugLineNum = 179896322;BA.debugLine="If (ObjectMap.Size > 0) And ((ID >= 0) And (ID+1";
if ((_objectmap.getSize()>0) && ((_id>=0) && (_id+1<_objectmap.getSize()))) { 
RDebugUtils.currentLine=179896323;
 //BA.debugLineNum = 179896323;BA.debugLine="Dim mData As Map = ObjectMap.Get(ID)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_objectmap.Get(_id)));
RDebugUtils.currentLine=179896324;
 //BA.debugLineNum = 179896324;BA.debugLine="ret = mData.Get(\"tracker\")";
_ret = BA.ObjectToString(_mdata.Get((Object)("tracker")));
 };
RDebugUtils.currentLine=179896326;
 //BA.debugLineNum = 179896326;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=179896327;
 //BA.debugLineNum = 179896327;BA.debugLine="End Sub";
return "";
}
public static int  _gettrackerpos(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _objectmap,String _str) throws Exception{
RDebugUtils.currentModule="structures";
if (Debug.shouldDelegate(null, "gettrackerpos", false))
	 {return ((Integer) Debug.delegate(null, "gettrackerpos", new Object[] {_ba,_objectmap,_str}));}
int _ret = 0;
int _counter = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _s = "";
RDebugUtils.currentLine=179961856;
 //BA.debugLineNum = 179961856;BA.debugLine="Public Sub GetTrackerPos(ObjectMap As List, str As";
RDebugUtils.currentLine=179961857;
 //BA.debugLineNum = 179961857;BA.debugLine="Dim ret As Int = -1";
_ret = (int) (-1);
RDebugUtils.currentLine=179961858;
 //BA.debugLineNum = 179961858;BA.debugLine="Dim counter As Int = 0";
_counter = (int) (0);
RDebugUtils.currentLine=179961859;
 //BA.debugLineNum = 179961859;BA.debugLine="If (ObjectMap.Size > 0) And (str <> \"\") Then";
if ((_objectmap.getSize()>0) && ((_str).equals("") == false)) { 
RDebugUtils.currentLine=179961860;
 //BA.debugLineNum = 179961860;BA.debugLine="For Each mData As Map In ObjectMap";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _objectmap;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group4.Get(index4)));
RDebugUtils.currentLine=179961861;
 //BA.debugLineNum = 179961861;BA.debugLine="Dim s As String = mData.Get(\"tracker\")";
_s = BA.ObjectToString(_mdata.Get((Object)("tracker")));
RDebugUtils.currentLine=179961862;
 //BA.debugLineNum = 179961862;BA.debugLine="If (s = str) Then";
if (((_s).equals(_str))) { 
RDebugUtils.currentLine=179961863;
 //BA.debugLineNum = 179961863;BA.debugLine="ret = counter";
_ret = _counter;
RDebugUtils.currentLine=179961864;
 //BA.debugLineNum = 179961864;BA.debugLine="Exit";
if (true) break;
 };
RDebugUtils.currentLine=179961866;
 //BA.debugLineNum = 179961866;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 }
};
 };
RDebugUtils.currentLine=179961869;
 //BA.debugLineNum = 179961869;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=179961870;
 //BA.debugLineNum = 179961870;BA.debugLine="End Sub";
return 0;
}
public static String  _updatetracker(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _objectmap,Object _inputobject) throws Exception{
RDebugUtils.currentModule="structures";
if (Debug.shouldDelegate(null, "updatetracker", false))
	 {return ((String) Debug.delegate(null, "updatetracker", new Object[] {_ba,_objectmap,_inputobject}));}
RDebugUtils.currentLine=179830784;
 //BA.debugLineNum = 179830784;BA.debugLine="Public Sub UpdateTracker( ObjectMap As List, Input";
RDebugUtils.currentLine=179830785;
 //BA.debugLineNum = 179830785;BA.debugLine="ObjectMap = InputObject";
_objectmap = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_inputobject));
RDebugUtils.currentLine=179830786;
 //BA.debugLineNum = 179830786;BA.debugLine="End Sub";
return "";
}
}