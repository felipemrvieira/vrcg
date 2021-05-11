package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class utils {
private static utils mostCurrent = new utils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.encoding _encoding = null;
public b4a.example.esc_pos _esc_pos = null;
public xevolution.vrcg.devdemov2400.main _main = null;
public xevolution.vrcg.devdemov2400.starter _starter = null;
public xevolution.vrcg.devdemov2400.comms _comms = null;
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
public static boolean  _nne(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "nne", false))
	 {return ((Boolean) Debug.delegate(null, "nne", new Object[] {_ba,_instr}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub NNE(inStr As String) As Boolean";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Return Not( isNullOrEmpty(inStr) )";
if (true) return anywheresoftware.b4a.keywords.Common.Not(_isnullorempty(_ba,_instr));
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnullorempty(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "isnullorempty", false))
	 {return ((Boolean) Debug.delegate(null, "isnullorempty", new Object[] {_ba,_instr}));}
boolean _r = false;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub isNullOrEmpty(inStr As String) As Boolean";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Dim r As Boolean = False";
_r = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="If (inStr = Null) Then";
if ((_instr== null)) { 
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="r = True";
_r = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="Else if (inStr.ToLowerCase = \"null\") Then";
if (((_instr.toLowerCase()).equals("null"))) { 
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="r = True";
_r = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Else if (inStr = \"\") Then";
if (((_instr).equals(""))) { 
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="r = True";
_r = anywheresoftware.b4a.keywords.Common.True;
 }}}
;
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="End Sub";
return false;
}
public static String  _writeerrors2log(anywheresoftware.b4a.BA _ba,String _error2log) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "writeerrors2log", false))
	 {return ((String) Debug.delegate(null, "writeerrors2log", new Object[] {_ba,_error2log}));}
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
String _dtf = "";
String _date2name = "";
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Sub WriteErrors2Log(Error2log As String)";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="If NNE(Error2log) Then";
if (_nne(_ba,_error2log)) { 
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="Dim dtf As String = DateTime.DateFormat";
_dtf = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=16252934;
 //BA.debugLineNum = 16252934;BA.debugLine="Dim date2name As String = DateTime.Date(DateTime";
_date2name = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=16252935;
 //BA.debugLineNum = 16252935;BA.debugLine="DateTime.DateFormat = dtf";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_dtf);
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="Writer.Initialize(File.OpenOutput(Starter.Shared";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(mostCurrent._starter._sharedfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_date2name))+"-ErrorsLog.txt"),anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=16252938;
 //BA.debugLineNum = 16252938;BA.debugLine="Writer.WriteLine($\"[${DateTime.Date(DateTime.Now";
_writer.WriteLine(("["+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())))+"]"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_error2log))+""));
RDebugUtils.currentLine=16252939;
 //BA.debugLineNum = 16252939;BA.debugLine="Writer.Close";
_writer.Close();
 };
RDebugUtils.currentLine=16252941;
 //BA.debugLineNum = 16252941;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrdatetime(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrdatetime", false))
	 {return ((String) Debug.delegate(null, "getcurrdatetime", new Object[] {_ba}));}
String _datename = "";
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub GetCurrDatetime As String";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now} $t";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="Return DateName";
if (true) return _datename;
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="End Sub";
return "";
}
public static String  _selectfieldfromlocalsqlwrkconfigtable(anywheresoftware.b4a.BA _ba,String _columnname) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "selectfieldfromlocalsqlwrkconfigtable", false))
	 {return ((String) Debug.delegate(null, "selectfieldfromlocalsqlwrkconfigtable", new Object[] {_ba,_columnname}));}
String _retstr = "";
String _sql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub SelectFieldFromLocalSQLWRKConfigTable(columnNa";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim retStr As String = \"\"";
_retstr = "";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim SQL As String = $\"select ${columnName} from c";
_sql = ("select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_columnname))+" from config where id=1");
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="retStr = Record.GetString($\"${columnName}\"$)";
_retstr = _record.GetString((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_columnname))+""));
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Return retStr";
if (true) return _retstr;
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="End Sub";
return "";
}
public static String  _logerror(anywheresoftware.b4a.BA _ba,String _logaction,String _loguser,String _logmessage) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "logerror", false))
	 {return ((String) Debug.delegate(null, "logerror", new Object[] {_ba,_logaction,_loguser,_logmessage}));}
String _loglocations = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.List _insertlist = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub logError(logaction As String, loguser As Strin";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim logLocations As String = getGeoLocationFormat";
_loglocations = _getgeolocationformat(_ba);
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="params.Put(\"logdatetime\", GetCurrDatetime)";
_params.Put((Object)("logdatetime"),(Object)(_getcurrdatetime(_ba)));
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="params.Put(\"logaction\", logaction)";
_params.Put((Object)("logaction"),(Object)(_logaction));
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="params.Put(\"loguser\", loguser)";
_params.Put((Object)("loguser"),(Object)(_loguser));
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="params.Put(\"loglocation\", logLocations)";
_params.Put((Object)("loglocation"),(Object)(_loglocations));
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="params.Put(\"logmessage\", logmessage)";
_params.Put((Object)("logmessage"),(Object)(_logmessage));
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="params.Put(\"logdevice\", ShareCode.APP_Authorizati";
_params.Put((Object)("logdevice"),(Object)(mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="params.Put(\"reported\", 0)";
_params.Put((Object)("reported"),(Object)(0));
RDebugUtils.currentLine=5636111;
 //BA.debugLineNum = 5636111;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5636112;
 //BA.debugLineNum = 5636112;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=5636113;
 //BA.debugLineNum = 5636113;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=5636114;
 //BA.debugLineNum = 5636114;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"log_erro";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"log_errors",_insertlist);
RDebugUtils.currentLine=5636115;
 //BA.debugLineNum = 5636115;BA.debugLine="End Sub";
return "";
}
public static String  _insertmapswithlog(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,int _typelog,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps,String _request,String _local) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "insertmapswithlog", false))
	 {return ((String) Debug.delegate(null, "insertmapswithlog", new Object[] {_ba,_sql,_typelog,_tablename,_listofmaps,_request,_local}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
int _maxid = 0;
String _ss = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub InsertMapsWithLog(SQL As SQL, TypeLog A";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("66094852","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="Try";
try {RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=6094860;
 //BA.debugLineNum = 6094860;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=6094861;
 //BA.debugLineNum = 6094861;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=6094863;
 //BA.debugLineNum = 6094863;BA.debugLine="sb.Append(\"INSERT INTO \" & TableName & \" (\")";
_sb.Append("INSERT INTO "+_tablename+" (");
RDebugUtils.currentLine=6094864;
 //BA.debugLineNum = 6094864;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=6094865;
 //BA.debugLineNum = 6094865;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = _m.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=6094866;
 //BA.debugLineNum = 6094866;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=6094873;
 //BA.debugLineNum = 6094873;BA.debugLine="If col = \"id\" Then";
if ((_col).equals("id")) { 
RDebugUtils.currentLine=6094874;
 //BA.debugLineNum = 6094874;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(T";
_maxid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (_ba,_tablename,"id","")+1+1000000);
RDebugUtils.currentLine=6094875;
 //BA.debugLineNum = 6094875;BA.debugLine="value = maxid";
_value = (Object)(_maxid);
 };
RDebugUtils.currentLine=6094878;
 //BA.debugLineNum = 6094878;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=6094879;
 //BA.debugLineNum = 6094879;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=6094880;
 //BA.debugLineNum = 6094880;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=6094882;
 //BA.debugLineNum = 6094882;BA.debugLine="columns.Append(col)";
_columns.Append(_col);
RDebugUtils.currentLine=6094883;
 //BA.debugLineNum = 6094883;BA.debugLine="values.Append($\"'${value}'\"$)";
_values.Append(("'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_value)+"'"));
RDebugUtils.currentLine=6094884;
 //BA.debugLineNum = 6094884;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=6094886;
 //BA.debugLineNum = 6094886;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=6094887;
 //BA.debugLineNum = 6094887;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("66094887","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=6094889;
 //BA.debugLineNum = 6094889;BA.debugLine="Log(sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("66094889",_sb.ToString(),0);
RDebugUtils.currentLine=6094890;
 //BA.debugLineNum = 6094890;BA.debugLine="Try";
try {RDebugUtils.currentLine=6094891;
 //BA.debugLineNum = 6094891;BA.debugLine="SQL.ExecNonQuery(sb.ToString)";
_sql.ExecNonQuery(_sb.ToString());
 } 
       catch (Exception e36) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e36);RDebugUtils.currentLine=6094893;
 //BA.debugLineNum = 6094893;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("66094893",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=6094894;
 //BA.debugLineNum = 6094894;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
RDebugUtils.currentLine=6094895;
 //BA.debugLineNum = 6094895;BA.debugLine="logError(Local, ShareCode.SESS_OPER_User, $\"${";
_logerror(_ba,_local,mostCurrent._sharecode._sess_oper_user /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sb.ToString()))+" :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(_ba).getObject()))+""));
 };
RDebugUtils.currentLine=6094898;
 //BA.debugLineNum = 6094898;BA.debugLine="If NNE(request) Then";
if (_nne(_ba,_request)) { 
RDebugUtils.currentLine=6094899;
 //BA.debugLineNum = 6094899;BA.debugLine="Dim ss As String = sb.ToString";
_ss = _sb.ToString();
RDebugUtils.currentLine=6094900;
 //BA.debugLineNum = 6094900;BA.debugLine="If Not(ss.EndsWith(\";\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_ss.endsWith(";"))) { 
RDebugUtils.currentLine=6094901;
 //BA.debugLineNum = 6094901;BA.debugLine="ss = $\"${ss};\"$";
_ss = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ss))+";");
 };
RDebugUtils.currentLine=6094903;
 //BA.debugLineNum = 6094903;BA.debugLine="SaveScriptToLog(request, ss)";
_savescripttolog(_ba,_request,_ss);
RDebugUtils.currentLine=6094904;
 //BA.debugLineNum = 6094904;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (_ba,(int) (4),_request.trim(),"","");
RDebugUtils.currentLine=6094905;
 //BA.debugLineNum = 6094905;BA.debugLine="save2updateFile(TableName, ss, TypeLog, reques";
_save2updatefile(_ba,_tablename,_ss,_typelog,_request,_workernd);
 };
 }
};
RDebugUtils.currentLine=6094908;
 //BA.debugLineNum = 6094908;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e52) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e52);RDebugUtils.currentLine=6094910;
 //BA.debugLineNum = 6094910;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("66094910",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=6094911;
 //BA.debugLineNum = 6094911;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
RDebugUtils.currentLine=6094917;
 //BA.debugLineNum = 6094917;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=6094919;
 //BA.debugLineNum = 6094919;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrentdate(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrentdate", false))
	 {return ((String) Debug.delegate(null, "getcurrentdate", new Object[] {_ba}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub GetCurrentDate As String";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Return DateTime.Date(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="End Sub";
return "";
}
public static String  _ifnullorempty(anywheresoftware.b4a.BA _ba,String _instr,String _nullstr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "ifnullorempty", false))
	 {return ((String) Debug.delegate(null, "ifnullorempty", new Object[] {_ba,_instr,_nullstr}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub IfNullOrEmpty(inStr As String, nullStr As Stri";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Try";
try {RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="If (isNullOrEmpty(inStr) = True) Then";
if ((_isnullorempty(_ba,_instr)==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Return nullStr";
if (true) return _nullstr;
 }else {
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="Return inStr";
if (true) return _instr;
 };
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="Return nullStr";
if (true) return _nullstr;
 };
RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="End Sub";
return "";
}
public static long  _getlastndayslong(anywheresoftware.b4a.BA _ba,int _days) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlastndayslong", false))
	 {return ((Long) Debug.delegate(null, "getlastndayslong", new Object[] {_ba,_days}));}
long _currentdate = 0L;
long _lastweekdate = 0L;
b4a.example.dateutils._period _p1 = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub GetLastNDaysLong(days As Int) As Long";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
_currentdate = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Dim LastWeekDate  As Long";
_lastweekdate = 0L;
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Dim p1 As Period";
_p1 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="p1.Days = -days";
_p1.Days = (int) (-_days);
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="LastWeekDate = DateUtils.AddPeriod(CurrentDate, p";
_lastweekdate = mostCurrent._dateutils._addperiod(_ba,_currentdate,_p1);
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="Return LastWeekDate";
if (true) return _lastweekdate;
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="End Sub";
return 0L;
}
public static String  _showprocinlog(anywheresoftware.b4a.BA _ba,String _module2show,String _procedure2show,String _data2show) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "showprocinlog", false))
	 {return ((String) Debug.delegate(null, "showprocinlog", new Object[] {_ba,_module2show,_procedure2show,_data2show}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub ShowProcinLog(Module2Show As String, Procedure";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Log($\"===========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("62818050",("========================================================="),0);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Log($\"Modulo : ${Module2Show}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("62818051",("Modulo : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_module2show))+""),0);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Log($\"Sub : ${Procedure2Show}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("62818052",("Sub : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_procedure2show))+""),0);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Log($\"Dados : ${Data2Show}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("62818053",("Dados : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_data2show))+""),0);
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Log($\"===========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("62818054",("========================================================="),0);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="End Sub";
return "";
}
public static String  _setdialogcolors(anywheresoftware.b4a.BA _ba,Object _dialog,int _backcolor,int _bordercolor,int _borderwidth,int _borderradius) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setdialogcolors", false))
	 {return ((String) Debug.delegate(null, "setdialogcolors", new Object[] {_ba,_dialog,_backcolor,_bordercolor,_borderwidth,_borderradius}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub SetDialogColors(dialog As Object, backColor As";
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Dim jo As JavaObject = dialog";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_dialog));
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="cd.Initialize2(backColor, borderRadius, borderWid";
_cd.Initialize2(_backcolor,_borderradius,_borderwidth,_bordercolor);
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="jo.RunMethodJO(\"getWindow\", Null).RunMethod(\"setB";
_jo.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("setBackgroundDrawable",new Object[]{(Object)(_cd.getObject())});
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="End Sub";
return "";
}
public static boolean  _int2bool(anywheresoftware.b4a.BA _ba,int _inint) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "int2bool", false))
	 {return ((Boolean) Debug.delegate(null, "int2bool", new Object[] {_ba,_inint}));}
boolean _ret = false;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Int2Bool(inInt As Int) As Boolean";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="If inInt=1 Then ret = True";
if (_inint==1) { 
_ret = anywheresoftware.b4a.keywords.Common.True;};
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _b64tobitmap(anywheresoftware.b4a.BA _ba,String _b64str) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "b64tobitmap", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(null, "b64tobitmap", new Object[] {_ba,_b64str}));}
com.simplysoftware.base64convert.base64convert _base64con = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _dc = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub B64ToBitmap(b64str As String) As B4XBitmap";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Base64Con.Initialize";
_base64con._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Dim dc As BitmapDrawable";
_dc = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="If (NNE(b64str)) Then";
if ((_nne(_ba,_b64str))) { 
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="Try";
try {RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="dc.Initialize(Base64Con.DecodeToImage(b64str))";
_dc.Initialize((android.graphics.Bitmap)(_base64con._v5(_b64str).getObject()));
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("611010057",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="If Not(dc.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_dc.IsInitialized())) { 
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="bmp.Initialize(Starter.InternalFolder, \"vazio.pn";
_bmp.Initialize(mostCurrent._starter._internalfolder /*String*/ ,"vazio.png");
RDebugUtils.currentLine=11010064;
 //BA.debugLineNum = 11010064;BA.debugLine="dc.Initialize(bmp)";
_dc.Initialize((android.graphics.Bitmap)(_bmp.getObject()));
 };
RDebugUtils.currentLine=11010066;
 //BA.debugLineNum = 11010066;BA.debugLine="Return dc.Bitmap";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_dc.getBitmap()));
RDebugUtils.currentLine=11010075;
 //BA.debugLineNum = 11010075;BA.debugLine="End Sub";
return null;
}
public static String  _setprogressdrawableext(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ProgressBarWrapper _p,String _posis,int[] _colrs,int _radcorner) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setprogressdrawableext", false))
	 {return ((String) Debug.delegate(null, "setprogressdrawableext", new Object[] {_ba,_p,_posis,_colrs,_radcorner}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub SetProgressDrawableExt(p As ProgressBar, posis";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="gd.Initialize(posis, colrs)";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,_posis),_colrs);
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="gd.CornerRadius = radcorner";
_gd.setCornerRadius((float) (_radcorner));
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="SetProgressDrawable(p, gd)";
_setprogressdrawable(_ba,_p,(Object)(_gd.getObject()));
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="End Sub";
return "";
}
public static boolean  _dbdataexists(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _dbsql,String _script) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dbdataexists", false))
	 {return ((Boolean) Debug.delegate(null, "dbdataexists", new Object[] {_ba,_dbsql,_script}));}
int _val = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
boolean _hasdata = false;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub DBDataExists(DBSQL As SQL, script As String) A";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim val As Int = 0";
_val = (int) (0);
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim Record As ResultSet";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="Record = DBSQL.ExecQuery(script)";
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_dbsql.ExecQuery(_script)));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="val = val + 1";
_val = (int) (_val+1);
 }
;
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="Dim hasData As Boolean = val >= 1";
_hasdata = _val>=1;
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="Return hasData";
if (true) return _hasdata;
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="End Sub";
return false;
}
public static String  _getcurrdatetimet(anywheresoftware.b4a.BA _ba,String _separator) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrdatetimet", false))
	 {return ((String) Debug.delegate(null, "getcurrdatetimet", new Object[] {_ba,_separator}));}
String _datename = "";
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub GetCurrDatetimeT(Separator As String) As Strin";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="If (Separator = \"\") Then Separator = \" \"";
if (((_separator).equals(""))) { 
_separator = " ";};
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now}${S";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_separator))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="Return DateName";
if (true) return _datename;
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2withlog(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals,String _request,String _local) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "updaterecord2withlog", false))
	 {return ((String) Debug.delegate(null, "updaterecord2withlog", new Object[] {_ba,_sql,_tablename,_fields,_wherefieldequals,_request,_local}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
String _ss = "";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub UpdateRecord2WithLog(SQL As SQL, TableN";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66029314","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66029318","Fields empty",0);
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6029323;
 //BA.debugLineNum = 6029323;BA.debugLine="sb.Append(\"UPDATE \").Append(TableName).Append(\" S";
_sb.Append("UPDATE ").Append(_tablename).Append(" SET ");
RDebugUtils.currentLine=6029324;
 //BA.debugLineNum = 6029324;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=6029326;
 //BA.debugLineNum = 6029326;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="sb.Append(col).Append($\"='${Fields.Get(col)}',\"$";
_sb.Append(_col).Append(("='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_fields.Get((Object)(_col)))+"',"));
 }
};
RDebugUtils.currentLine=6029331;
 //BA.debugLineNum = 6029331;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=6029332;
 //BA.debugLineNum = 6029332;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group19 = _wherefieldequals.Keys();
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_col = BA.ObjectToString(group19.Get(index19));
RDebugUtils.currentLine=6029334;
 //BA.debugLineNum = 6029334;BA.debugLine="sb.Append(col).Append($\"='${Fields.Get(col)}' AN";
_sb.Append(_col).Append(("='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_fields.Get((Object)(_col)))+"' AND "));
 }
};
RDebugUtils.currentLine=6029338;
 //BA.debugLineNum = 6029338;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
RDebugUtils.currentLine=6029339;
 //BA.debugLineNum = 6029339;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("66029339","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=6029341;
 //BA.debugLineNum = 6029341;BA.debugLine="Try";
try {RDebugUtils.currentLine=6029342;
 //BA.debugLineNum = 6029342;BA.debugLine="SQL.ExecNonQuery(sb.ToString)";
_sql.ExecNonQuery(_sb.ToString());
 } 
       catch (Exception e27) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e27);RDebugUtils.currentLine=6029344;
 //BA.debugLineNum = 6029344;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("66029344",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=6029345;
 //BA.debugLineNum = 6029345;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
RDebugUtils.currentLine=6029346;
 //BA.debugLineNum = 6029346;BA.debugLine="logError(Local, ShareCode.SESS_OPER_User, $\"${sb";
_logerror(_ba,_local,mostCurrent._sharecode._sess_oper_user /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sb.ToString()))+" :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(_ba).getObject()))+""));
 };
RDebugUtils.currentLine=6029350;
 //BA.debugLineNum = 6029350;BA.debugLine="If NNE(request) Then";
if (_nne(_ba,_request)) { 
RDebugUtils.currentLine=6029351;
 //BA.debugLineNum = 6029351;BA.debugLine="Dim ss As String = sb.ToString";
_ss = _sb.ToString();
RDebugUtils.currentLine=6029352;
 //BA.debugLineNum = 6029352;BA.debugLine="If Not(ss.EndsWith(\";\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_ss.endsWith(";"))) { 
RDebugUtils.currentLine=6029353;
 //BA.debugLineNum = 6029353;BA.debugLine="ss = $\"${ss};\"$";
_ss = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ss))+";");
 };
RDebugUtils.currentLine=6029355;
 //BA.debugLineNum = 6029355;BA.debugLine="SaveScriptToLog(request, ss)";
_savescripttolog(_ba,_request,_ss);
 };
RDebugUtils.currentLine=6029357;
 //BA.debugLineNum = 6029357;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _listofpairs(anywheresoftware.b4a.BA _ba,String[] _pairs,String _splitter) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "listofpairs", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "listofpairs", new Object[] {_ba,_pairs,_splitter}));}
anywheresoftware.b4a.objects.collections.List _retlist = null;
String _splt = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub ListOfPairs(pairs() As String, splitter As Str";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim retList As List";
_retlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="retList.Initialize";
_retlist.Initialize();
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Dim splt As String = splitter";
_splt = _splitter;
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="If (splt = \"\") Then splt = \"=>\"";
if (((_splt).equals(""))) { 
_splt = "=>";};
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="For i=0 To pairs.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (_pairs.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Dim lst As List = Regex.Split((\"\\\"&splt), pairs(";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(("\\"+_splt),_pairs[_i]));
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="map.Put(lst.Get(0), lst.Get(1))";
_map.Put(_lst.Get((int) (0)),_lst.Get((int) (1)));
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="retList.Add(map)";
_retlist.Add((Object)(_map.getObject()));
 }
};
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="Return retList";
if (true) return _retlist;
RDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.httpjob  _calljobapi(anywheresoftware.b4a.BA _ba,String _jobapi,anywheresoftware.b4a.objects.collections.List _jobparams,Object _jobobject,String _jobname) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "calljobapi", false))
	 {return ((xevolution.vrcg.devdemov2400.httpjob) Debug.delegate(null, "calljobapi", new Object[] {_ba,_jobapi,_jobparams,_jobobject,_jobname}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _urlpath = "";
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub CallJobAPI(JobAPI As String, jobParams As List";
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="For i=0 To jobParams.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (_jobparams.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="Dim m As Map = jobParams.Get(i)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_jobparams.Get(_i)));
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="params.Put(m.GetKeyAt(0), m.GetValueAt(0))";
_params.Put(_m.GetKeyAt((int) (0)),_m.GetValueAt((int) (0)));
 }
};
RDebugUtils.currentLine=10813460;
 //BA.debugLineNum = 10813460;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=10813461;
 //BA.debugLineNum = 10813461;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=10813462;
 //BA.debugLineNum = 10813462;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=10813463;
 //BA.debugLineNum = 10813463;BA.debugLine="Log(\"DATA:\" & data)";
anywheresoftware.b4a.keywords.Common.LogImpl("610813463","DATA:"+_data,0);
RDebugUtils.currentLine=10813465;
 //BA.debugLineNum = 10813465;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=10813467;
 //BA.debugLineNum = 10813467;BA.debugLine="Job.Initialize(\"\", jobObject)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_jobobject);
RDebugUtils.currentLine=10813469;
 //BA.debugLineNum = 10813469;BA.debugLine="Dim URLpath As String = $\"https://${ShareCode.APP";
_urlpath = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+"/api/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_jobapi))+"");
RDebugUtils.currentLine=10813472;
 //BA.debugLineNum = 10813472;BA.debugLine="Job.PostString(URLpath, data )";
_job._poststring /*String*/ (null,_urlpath,_data);
RDebugUtils.currentLine=10813473;
 //BA.debugLineNum = 10813473;BA.debugLine="Log( URLpath )";
anywheresoftware.b4a.keywords.Common.LogImpl("610813473",_urlpath,0);
RDebugUtils.currentLine=10813474;
 //BA.debugLineNum = 10813474;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=10813475;
 //BA.debugLineNum = 10813475;BA.debugLine="Return Job";
if (true) return _job;
RDebugUtils.currentLine=10813476;
 //BA.debugLineNum = 10813476;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _jobapimap(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.httpjob _job) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "jobapimap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "jobapimap", new Object[] {_ba,_job}));}
String _resultstr = "";
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub JobAPIMAP(job  As HttpJob) As Map";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim ResultStr As String = job.GetString";
_resultstr = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\") The";
if (((mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv6(_resultstr,(long) (1))).equals("["))) { 
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrFunc";
_resultstr = mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvvvvv4(mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvv5(_resultstr,(int) (2),(int) (mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv7(_resultstr)-1)));
 };
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="JSON1.Initialize(ResultStr)";
_json1.Initialize(_resultstr);
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Return MapJSON";
if (true) return _mapjson;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
return null;
}
public static String  _updateliteupdatedatetime(anywheresoftware.b4a.BA _ba,String _datet) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "updateliteupdatedatetime", false))
	 {return ((String) Debug.delegate(null, "updateliteupdatedatetime", new Object[] {_ba,_datet}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub UpdateLiteUpdateDateTime(dateT As String)";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_LI";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APP_LITE_LAST_UPDATE",_datet);
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="Starter.AppState.Flush";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Starter";
mostCurrent._sharecode._app_last_lite_update_datetime /*String*/  = mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._readstring /*String*/ (null,"APP_START","APP_LITE_LAST_UPDATE","");
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="End Sub";
return "";
}
public static boolean  _savesqltolog(anywheresoftware.b4a.BA _ba,String _local,String _sqlscript,String _request) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "savesqltolog", false))
	 {return ((Boolean) Debug.delegate(null, "savesqltolog", new Object[] {_ba,_local,_sqlscript,_request}));}
boolean _ret = false;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub SaveSQLToLog(Local As String, SQLScript As Str";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim ret As Boolean = True";
_ret = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Try";
try {RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(SQLScript)";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Log(SQLScript)";
anywheresoftware.b4a.keywords.Common.LogImpl("65505028",_sqlscript,0);
 } 
       catch (Exception e6) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e6);RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("65505030",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="logError(Local, ShareCode.SESS_OPER_User, $\"${SQ";
_logerror(_ba,_local,mostCurrent._sharecode._sess_oper_user /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sqlscript))+" :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(_ba).getObject()))+""));
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="Log(\"ERROR : \" & SQLScript)";
anywheresoftware.b4a.keywords.Common.LogImpl("65505033","ERROR : "+_sqlscript,0);
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="ret = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="If NNE(request) Then";
if (_nne(_ba,_request)) { 
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="If Not(SQLScript.EndsWith(\";\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_sqlscript.endsWith(";"))) { 
RDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="SQLScript = $\"${SQLScript};\"$";
_sqlscript = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sqlscript))+";");
 };
RDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="SaveScriptToLog(request, SQLScript)";
_savescripttolog(_ba,_request,_sqlscript);
 };
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="End Sub";
return false;
}
public static boolean  _ne(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "ne", false))
	 {return ((Boolean) Debug.delegate(null, "ne", new Object[] {_ba,_instr}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub NE(inStr As String) As Boolean";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Return isNullOrEmpty(inStr)";
if (true) return _isnullorempty(_ba,_instr);
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="End Sub";
return false;
}
public static void  _loguseraction(anywheresoftware.b4a.BA _ba,String _tagcode,Object _meobject) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "loguseraction", false))
	 {Debug.delegate(null, "loguseraction", new Object[] {_ba,_tagcode,_meobject}); return;}
ResumableSub_LogUserAction rsub = new ResumableSub_LogUserAction(null,_ba,_tagcode,_meobject);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
}
public static class ResumableSub_LogUserAction extends BA.ResumableSub {
public ResumableSub_LogUserAction(xevolution.vrcg.devdemov2400.utils parent,anywheresoftware.b4a.BA _ba,String _tagcode,Object _meobject) {
this.parent = parent;
this._ba = _ba;
this._tagcode = _tagcode;
this._meobject = _meobject;
}
xevolution.vrcg.devdemov2400.utils parent;
anywheresoftware.b4a.BA _ba;
String _tagcode;
Object _meobject;
String _saclalatitude = "";
String _saclalongitude = "";
String _sacladatetime = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utils";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15335451;
 //BA.debugLineNum = 15335451;BA.debugLine="Private sACLALatitude As String = IfNullOrEmpty(L";
_saclalatitude = _ifnullorempty(_ba,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=15335452;
 //BA.debugLineNum = 15335452;BA.debugLine="Private sACLALongitude As String = IfNullOrEmpty(";
_saclalongitude = _ifnullorempty(_ba,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=15335454;
 //BA.debugLineNum = 15335454;BA.debugLine="Private sACLADatetime As String = GetCurrDatetime";
_sacladatetime = _getcurrdatetime(_ba);
RDebugUtils.currentLine=15335456;
 //BA.debugLineNum = 15335456;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15335457;
 //BA.debugLineNum = 15335457;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=15335458;
 //BA.debugLineNum = 15335458;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=15335459;
 //BA.debugLineNum = 15335459;BA.debugLine="params.Put(\"ACLAAuthorization\", ShareCode.APP_Aut";
_params.Put((Object)("ACLAAuthorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=15335460;
 //BA.debugLineNum = 15335460;BA.debugLine="params.Put(\"ACLASessUser\", ShareCode.SESS_OPER_Us";
_params.Put((Object)("ACLASessUser"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=15335461;
 //BA.debugLineNum = 15335461;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=15335462;
 //BA.debugLineNum = 15335462;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=15335463;
 //BA.debugLineNum = 15335463;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=15335464;
 //BA.debugLineNum = 15335464;BA.debugLine="params.Put(\"ACLAType\", tagcode)";
_params.Put((Object)("ACLAType"),(Object)(_tagcode));
RDebugUtils.currentLine=15335465;
 //BA.debugLineNum = 15335465;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=15335466;
 //BA.debugLineNum = 15335466;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=15335467;
 //BA.debugLineNum = 15335467;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=15335468;
 //BA.debugLineNum = 15335468;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=15335469;
 //BA.debugLineNum = 15335469;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=15335470;
 //BA.debugLineNum = 15335470;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=15335471;
 //BA.debugLineNum = 15335471;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/mobile/user/update");
RDebugUtils.currentLine=15335472;
 //BA.debugLineNum = 15335472;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=15335473;
 //BA.debugLineNum = 15335473;BA.debugLine="CallApi(0, params, MeObject, Url, \"\", \"\")";
_callapi(_ba,(int) (0),_params,_meobject,_url,"","");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=15335475;
 //BA.debugLineNum = 15335475;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (_ba,(int) (4),"","","");
RDebugUtils.currentLine=15335476;
 //BA.debugLineNum = 15335476;BA.debugLine="save2update(Url, MapToJson(params), 0, WorkerND)";
_save2update(_ba,_url,_maptojson(_ba,_params),(int) (0),_workernd);
 if (true) break;
;
RDebugUtils.currentLine=15335486;
 //BA.debugLineNum = 15335486;BA.debugLine="If ShareCode.USER_LOCAL_MAP.IsInitialized Then";

case 6:
//if
this.state = 11;
if (parent.mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=15335487;
 //BA.debugLineNum = 15335487;BA.debugLine="ShareCode.USER_LOCAL_MAP.Clear";
parent.mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=15335489;
 //BA.debugLineNum = 15335489;BA.debugLine="ShareCode.USER_LOCAL_MAP.Initialize";
parent.mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=15335492;
 //BA.debugLineNum = 15335492;BA.debugLine="ShareCode.USER_LOCAL_MAP.Put(ShareCode.SESS_OPER";
parent.mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ),(Object)(_tagcode));
RDebugUtils.currentLine=15335493;
 //BA.debugLineNum = 15335493;BA.debugLine="File.WriteMap(Starter.InternalFolder,\"USER_STATU";
anywheresoftware.b4a.keywords.Common.File.WriteMap(parent.mostCurrent._starter._internalfolder /*String*/ ,"USER_STATUS.MAP",parent.mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=15335495;
 //BA.debugLineNum = 15335495;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=15335496;
 //BA.debugLineNum = 15335496;BA.debugLine="Writer.Initialize(File.OpenOutput(Starter.Intern";
_writer.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_status.lst"),anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=15335497;
 //BA.debugLineNum = 15335497;BA.debugLine="Writer.WriteLine($\"${ShareCode.SESS_OPER_User}|$";
_writer.WriteLine((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sacladatetime))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_saclalatitude))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_saclalongitude))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+""));
RDebugUtils.currentLine=15335498;
 //BA.debugLineNum = 15335498;BA.debugLine="Writer.WriteLine(\"This is the second line.\")";
_writer.WriteLine("This is the second line.");
RDebugUtils.currentLine=15335499;
 //BA.debugLineNum = 15335499;BA.debugLine="Writer.Close";
_writer.Close();
RDebugUtils.currentLine=15335502;
 //BA.debugLineNum = 15335502;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utils", "loguseraction"),(int) (250));
this.state = 12;
return;
case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=15335504;
 //BA.debugLineNum = 15335504;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setviewbackgroundcolortomaincolor(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _view) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setviewbackgroundcolortomaincolor", false))
	 {return ((String) Debug.delegate(null, "setviewbackgroundcolortomaincolor", new Object[] {_ba,_view}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdrawable = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub SetViewBackgroundColorToMainColor(view As View";
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Dim CDrawable As ColorDrawable";
_cdrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="CDrawable.Initialize(Consts.ColorMain, 0)";
_cdrawable.Initialize(mostCurrent._consts._colormain /*int*/ ,(int) (0));
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="view.Background = CDrawable";
_view.setBackground((android.graphics.drawable.Drawable)(_cdrawable.getObject()));
RDebugUtils.currentLine=14024712;
 //BA.debugLineNum = 14024712;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrentticks(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrentticks", false))
	 {return ((String) Debug.delegate(null, "getcurrentticks", new Object[] {_ba}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Sub GetCurrentTicks As String";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Return DateTime.Now";
if (true) return BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="End Sub";
return "";
}
public static int  _bool2int(anywheresoftware.b4a.BA _ba,boolean _inbool) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "bool2int", false))
	 {return ((Integer) Debug.delegate(null, "bool2int", new Object[] {_ba,_inbool}));}
int _ret = 0;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub Bool2Int(inBool As Boolean) As Int";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="If inBool Then ret = 1";
if (_inbool) { 
_ret = (int) (1);};
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="End Sub";
return 0;
}
public static String  _makefilename(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "makefilename", false))
	 {return ((String) Debug.delegate(null, "makefilename", new Object[] {_ba}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub MakeFileName As String";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmmss");
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Return $\"$date{DateTime.Now}$time{DateTime.Now}${";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_randomint2(_ba,(int) (2))))+"");
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.types._deviceinformation  _deviceinfo(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "deviceinfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._deviceinformation) Debug.delegate(null, "deviceinfo", new Object[] {_ba}));}
int _devicescreensize = 0;
String _strdevicetype = "";
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub DeviceInfo As DeviceInformation";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim DevicescreenSize As Int = DeviceType";
_devicescreensize = _devicetype(_ba);
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Dim StrDeviceType As String = \"Tablet\"";
_strdevicetype = "Tablet";
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="If DevicescreenSize < 7 Then";
if (_devicescreensize<7) { 
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="StrDeviceType = \"Smart Phone\"";
_strdevicetype = "Smart Phone";
 };
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Return Types.MakeDeviceInformation(StrDeviceType,";
if (true) return mostCurrent._types._makedeviceinformation /*xevolution.vrcg.devdemov2400.types._deviceinformation*/ (_ba,_strdevicetype,_devicescreensize,_hasfeature(_ba,"android.hardware.telephony"));
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="End Sub";
return null;
}
public static String  _generatetagcode(anywheresoftware.b4a.BA _ba,String _prefix) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "generatetagcode", false))
	 {return ((String) Debug.delegate(null, "generatetagcode", new Object[] {_ba,_prefix}));}
String _datename = "";
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub GenerateTagcode(prefix As String) As String";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmmss");
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now}_$t";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_randomint2(_ba,(int) (2))))+"");
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="If Not(isNullOrEmpty(prefix)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_isnullorempty(_ba,_prefix))) { 
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="DateName = $\"${prefix}${DateName}\"$";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prefix))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datename))+"");
 };
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="Return DateName";
if (true) return _datename;
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="End Sub";
return "";
}
public static int  _jobapistatus(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.httpjob _job) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "jobapistatus", false))
	 {return ((Integer) Debug.delegate(null, "jobapistatus", new Object[] {_ba,_job}));}
String _resultstr = "";
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
int _status = 0;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub JobAPIStatus(job  As HttpJob) As Int";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Dim ResultStr As String = job.GetString";
_resultstr = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\") The";
if (((mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv6(_resultstr,(long) (1))).equals("["))) { 
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrFunc";
_resultstr = mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvvvvv4(mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvv5(_resultstr,(int) (2),(int) (mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv7(_resultstr)-1)));
 };
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="If ResultStr.StartsWith(\"Array\") Then";
if (_resultstr.startsWith("Array")) { 
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="If ResultStr.SubString(8).StartsWith(\")\") Then";
if (_resultstr.substring((int) (8)).startsWith(")")) { 
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="ResultStr = ResultStr.SubString(9)";
_resultstr = _resultstr.substring((int) (9));
 };
 };
RDebugUtils.currentLine=10878990;
 //BA.debugLineNum = 10878990;BA.debugLine="JSON1.Initialize(ResultStr)";
_json1.Initialize(_resultstr);
RDebugUtils.currentLine=10878991;
 //BA.debugLineNum = 10878991;BA.debugLine="Try";
try {RDebugUtils.currentLine=10878992;
 //BA.debugLineNum = 10878992;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=10878993;
 //BA.debugLineNum = 10878993;BA.debugLine="Dim status As Int = MapJSON.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("status"))));
 } 
       catch (Exception e16) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e16);RDebugUtils.currentLine=10878995;
 //BA.debugLineNum = 10878995;BA.debugLine="Dim status As Int = 1";
_status = (int) (1);
RDebugUtils.currentLine=10878996;
 //BA.debugLineNum = 10878996;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("610878996",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=10878999;
 //BA.debugLineNum = 10878999;BA.debugLine="Return status";
if (true) return _status;
RDebugUtils.currentLine=10879000;
 //BA.debugLineNum = 10879000;BA.debugLine="End Sub";
return 0;
}
public static String  _addthis(anywheresoftware.b4a.BA _ba,String _str,String _new,String _sep,boolean _space) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "addthis", false))
	 {return ((String) Debug.delegate(null, "addthis", new Object[] {_ba,_str,_new,_sep,_space}));}
String _ret = "";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub addthis(str As String, new As String, sep As S";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim ret As String = str";
_ret = _str;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="sep = IfNullOrEmpty(sep, \",\")";
_sep = _ifnullorempty(_ba,_sep,",");
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="If (space = True) Then sep = sep & \" \"";
if ((_space==anywheresoftware.b4a.keywords.Common.True)) { 
_sep = _sep+" ";};
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If NNE(ret) Then";
if (_nne(_ba,_ret)) { 
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="ret = ret & sep";
_ret = _ret+_sep;
 };
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="ret = ret & new";
_ret = _ret+_new;
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="End Sub";
return "";
}
public static String  _bitmap2file(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,String _folder,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "bitmap2file", false))
	 {return ((String) Debug.delegate(null, "bitmap2file", new Object[] {_ba,_bmp,_folder,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub Bitmap2File(BMP As B4XBitmap, Folder As String";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Dim Out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="Out = File.OpenOutput(Folder, Filename, False)";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_folder,_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="BMP.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALI";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Out.Close";
_out.Close();
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="End Sub";
return "";
}
public static String  _bool2string(anywheresoftware.b4a.BA _ba,boolean _inbool) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "bool2string", false))
	 {return ((String) Debug.delegate(null, "bool2string", new Object[] {_ba,_inbool}));}
String _ret = "";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub Bool2String(inBool As Boolean) As String";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim ret As String = \"False\"";
_ret = "False";
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="If inBool Then ret = \"True\"";
if (_inbool) { 
_ret = "True";};
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="End Sub";
return "";
}
public static float  _calcangled(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.types._pointapi _frompoint,xevolution.vrcg.devdemov2400.types._pointapi _topoint) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "calcangled", false))
	 {return ((Float) Debug.delegate(null, "calcangled", new Object[] {_ba,_frompoint,_topoint}));}
float _dirx = 0f;
float _diry = 0f;
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub CalcAngleD(fromPoint As PointApi, toPoi";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim dirX = toPoint.X - fromPoint.X As Float";
_dirx = (float) (_topoint.X /*float*/ -_frompoint.X /*float*/ );
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim dirY = toPoint.Y - fromPoint.Y As Float";
_diry = (float) (_topoint.Y /*float*/ -_frompoint.Y /*float*/ );
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="Return ATan2D(dirY, dirX)";
if (true) return (float) (anywheresoftware.b4a.keywords.Common.ATan2D(_diry,_dirx));
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="End Sub";
return 0f;
}
public static String  _callapi(anywheresoftware.b4a.BA _ba,int _typelog,anywheresoftware.b4a.objects.collections.Map _params,Object _target,String _url,String _funcreturn,String _request) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "callapi", false))
	 {return ((String) Debug.delegate(null, "callapi", new Object[] {_ba,_typelog,_params,_target,_url,_funcreturn,_request}));}
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub CallApi(TypeLog As Int, params As Map, target";
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorkerN";
_workernd = mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (_ba,(int) (4),_request.trim(),"","");
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="save2updateFile(url, MapToJson(params), TypeLog,";
_save2updatefile(_ba,_url,_maptojson(_ba,_params),_typelog,_request,_workernd);
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Try";
try {RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="Starter.ApiCall.UpdateData2Server(params, target";
mostCurrent._starter._apicall /*xevolution.vrcg.devdemov2400.api*/ ._updatedata2server /*void*/ (null,_params,_target,_url,_funcreturn,anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e6) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e6);RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (_ba,(int) (4),_request.trim(),"","");
RDebugUtils.currentLine=15007754;
 //BA.debugLineNum = 15007754;BA.debugLine="save2update(url, MapToJson(params), TypeLog, Wor";
_save2update(_ba,_url,_maptojson(_ba,_params),_typelog,_workernd);
 };
RDebugUtils.currentLine=15007756;
 //BA.debugLineNum = 15007756;BA.debugLine="End Sub";
return "";
}
public static String  _save2updatefile(anywheresoftware.b4a.BA _ba,String _tablename,String _data,int _typelog,String _request,xevolution.vrcg.devdemov2400.types._workernewdata _wnd) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "save2updatefile", false))
	 {return ((String) Debug.delegate(null, "save2updatefile", new Object[] {_ba,_tablename,_data,_typelog,_request,_wnd}));}
String _requeststr = "";
String _filename = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub save2updateFile(tablename As String, Data As S";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim RequestStr As String = IfNotNullOrEmptyAdd(re";
_requeststr = _ifnotnulloremptyadd(_ba,_request,"_");
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Dim FileName As String = $\"APICALL_${RequestStr}_";
_filename = ("APICALL_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_requeststr))+"_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ))+"__"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_getcurrdatetimet2ext(_ba,"_")))+".svrlog");
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="params.Put(\"up_user\", ShareCode.SESS_OPER_User)";
_params.Put((Object)("up_user"),(Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="params.Put(\"up_date\", GetCurrDatetimeExt)";
_params.Put((Object)("up_date"),(Object)(_getcurrdatetimeext(_ba)));
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="params.Put(\"up_state\", 0)";
_params.Put((Object)("up_state"),(Object)(0));
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="params.Put(\"up_type\", typelog)";
_params.Put((Object)("up_type"),(Object)(_typelog));
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="params.Put(\"up_tableurl\", tablename)";
_params.Put((Object)("up_tableurl"),(Object)(_tablename));
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="params.Put(\"up_values\", Data)";
_params.Put((Object)("up_values"),(Object)(_data));
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="params.Put(\"up_typeoper\",WND.up_typeoper)";
_params.Put((Object)("up_typeoper"),(Object)(_wnd.up_typeoper /*int*/ ));
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="params.Put(\"up_tagcode\",WND.up_tagcode)";
_params.Put((Object)("up_tagcode"),(Object)(_wnd.up_tagcode /*String*/ ));
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="params.Put(\"up_task\",WND.up_task)";
_params.Put((Object)("up_task"),(Object)(_wnd.up_task /*String*/ ));
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="params.Put(\"up_itemtagcode\",WND.up_itemtagcode)";
_params.Put((Object)("up_itemtagcode"),(Object)(_wnd.up_itemtagcode /*String*/ ));
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="File.WriteMap(Starter.SharedFolder, FileName, par";
anywheresoftware.b4a.keywords.Common.File.WriteMap(mostCurrent._starter._sharedfolder /*String*/ ,_filename,_params);
RDebugUtils.currentLine=7536657;
 //BA.debugLineNum = 7536657;BA.debugLine="End Sub";
return "";
}
public static String  _maptojson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _mmap) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "maptojson", false))
	 {return ((String) Debug.delegate(null, "maptojson", new Object[] {_ba,_mmap}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub MapToJson(mMap As Map) As String";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="JSON.Initialize(mMap)";
_json.Initialize(_mmap);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Dim Data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Return Data";
if (true) return _data;
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="End Sub";
return "";
}
public static String  _save2update(anywheresoftware.b4a.BA _ba,String _tablename,String _data,int _typelog,xevolution.vrcg.devdemov2400.types._workernewdata _wnd) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "save2update", false))
	 {return ((String) Debug.delegate(null, "save2update", new Object[] {_ba,_tablename,_data,_typelog,_wnd}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.List _insertlist = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub save2update(tablename As String, Data As Strin";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="save2updateFile(tablename, Data, typelog, \"OFFLIN";
_save2updatefile(_ba,_tablename,_data,_typelog,"OFFLINE",_wnd);
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="params.Put(\"up_date\", GetCurrDatetimeExt)";
_params.Put((Object)("up_date"),(Object)(_getcurrdatetimeext(_ba)));
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="params.Put(\"up_state\", 0)";
_params.Put((Object)("up_state"),(Object)(0));
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="params.Put(\"up_type\", typelog)";
_params.Put((Object)("up_type"),(Object)(_typelog));
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="params.Put(\"up_tableurl\", tablename)";
_params.Put((Object)("up_tableurl"),(Object)(_tablename));
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="params.Put(\"up_values\", Data)";
_params.Put((Object)("up_values"),(Object)(_data));
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="params.Put(\"up_typeoper\",WND.up_typeoper)";
_params.Put((Object)("up_typeoper"),(Object)(_wnd.up_typeoper /*int*/ ));
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="params.Put(\"up_tagcode\",WND.up_tagcode)";
_params.Put((Object)("up_tagcode"),(Object)(_wnd.up_tagcode /*String*/ ));
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="params.Put(\"up_task\",WND.up_task)";
_params.Put((Object)("up_task"),(Object)(_wnd.up_task /*String*/ ));
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="params.Put(\"up_itemtagcode\",WND.up_itemtagcode)";
_params.Put((Object)("up_itemtagcode"),(Object)(_wnd.up_itemtagcode /*String*/ ));
RDebugUtils.currentLine=7471125;
 //BA.debugLineNum = 7471125;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471126;
 //BA.debugLineNum = 7471126;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=7471127;
 //BA.debugLineNum = 7471127;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=7471131;
 //BA.debugLineNum = 7471131;BA.debugLine="Try";
try {RDebugUtils.currentLine=7471132;
 //BA.debugLineNum = 7471132;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"loc_upd";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"loc_updatesrever",_insertlist);
 } 
       catch (Exception e19) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e19);RDebugUtils.currentLine=7471134;
 //BA.debugLineNum = 7471134;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471135;
 //BA.debugLineNum = 7471135;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=7471136;
 //BA.debugLineNum = 7471136;BA.debugLine="params.Put(\"up_date\", GetCurrDatetimeExt)";
_params.Put((Object)("up_date"),(Object)(_getcurrdatetimeext(_ba)));
RDebugUtils.currentLine=7471137;
 //BA.debugLineNum = 7471137;BA.debugLine="params.Put(\"up_state\", 0)";
_params.Put((Object)("up_state"),(Object)(0));
RDebugUtils.currentLine=7471138;
 //BA.debugLineNum = 7471138;BA.debugLine="params.Put(\"up_tableurl\", tablename)";
_params.Put((Object)("up_tableurl"),(Object)(_tablename));
RDebugUtils.currentLine=7471139;
 //BA.debugLineNum = 7471139;BA.debugLine="params.Put(\"up_values\", Data)";
_params.Put((Object)("up_values"),(Object)(_data));
RDebugUtils.currentLine=7471140;
 //BA.debugLineNum = 7471140;BA.debugLine="params.Put(\"up_typeoper\",WND.up_typeoper)";
_params.Put((Object)("up_typeoper"),(Object)(_wnd.up_typeoper /*int*/ ));
RDebugUtils.currentLine=7471141;
 //BA.debugLineNum = 7471141;BA.debugLine="params.Put(\"up_tagcode\",WND.up_tagcode)";
_params.Put((Object)("up_tagcode"),(Object)(_wnd.up_tagcode /*String*/ ));
RDebugUtils.currentLine=7471142;
 //BA.debugLineNum = 7471142;BA.debugLine="params.Put(\"up_task\",WND.up_task)";
_params.Put((Object)("up_task"),(Object)(_wnd.up_task /*String*/ ));
RDebugUtils.currentLine=7471143;
 //BA.debugLineNum = 7471143;BA.debugLine="params.Put(\"up_itemtagcode\",WND.up_itemtagcode)";
_params.Put((Object)("up_itemtagcode"),(Object)(_wnd.up_itemtagcode /*String*/ ));
RDebugUtils.currentLine=7471144;
 //BA.debugLineNum = 7471144;BA.debugLine="InsertList.Clear";
_insertlist.Clear();
RDebugUtils.currentLine=7471145;
 //BA.debugLineNum = 7471145;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=7471146;
 //BA.debugLineNum = 7471146;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"loc_upd";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"loc_updatesrever",_insertlist);
 };
RDebugUtils.currentLine=7471151;
 //BA.debugLineNum = 7471151;BA.debugLine="End Sub";
return "";
}
public static String  _callapilocalsaved(anywheresoftware.b4a.BA _ba,String _filedata,Object _target,String _funcreturn) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "callapilocalsaved", false))
	 {return ((String) Debug.delegate(null, "callapilocalsaved", new Object[] {_ba,_filedata,_target,_funcreturn}));}
boolean _continua = false;
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _reader = null;
anywheresoftware.b4a.objects.collections.List _linetext = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.Map _paramsmap = null;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub CallApiLocalSaved(filedata As String, target A";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Dim Continua As Boolean = False";
_continua = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="If File.Exists(Starter.SharedFolder, filedata) Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._sharedfolder /*String*/ ,_filedata)) { 
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="Dim Reader As TextReader";
_reader = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="Reader.Initialize(File.OpenInput(Starter.SharedF";
_reader.Initialize((java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(mostCurrent._starter._sharedfolder /*String*/ ,_filedata).getObject()));
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="Dim lineText As List = Reader.ReadList";
_linetext = new anywheresoftware.b4a.objects.collections.List();
_linetext = _reader.ReadList();
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="Reader.Close";
_reader.Close();
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="If (lineText.Size > 1) Then";
if ((_linetext.getSize()>1)) { 
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="Dim lst As List = Regex.Split(\"\\=\", lineText.Ge";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\=",BA.ObjectToString(_linetext.Get(mostCurrent._sharecode._upvalues /*int*/ ))));
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="Log($\"${lst.Get(0)}:${lst.Get(1)}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("615073292",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lst.Get((int) (0)))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lst.Get((int) (1)))+""),0);
RDebugUtils.currentLine=15073293;
 //BA.debugLineNum = 15073293;BA.debugLine="Dim paramsmap As Map '= lineText.Get(ShareCode.";
_paramsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="paramsmap.Initialize";
_paramsmap.Initialize();
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="paramsmap.Put(lst.Get(0), lst.Get(1))";
_paramsmap.Put(_lst.Get((int) (0)),_lst.Get((int) (1)));
RDebugUtils.currentLine=15073297;
 //BA.debugLineNum = 15073297;BA.debugLine="Continua = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="If (Continua) Then";
if ((_continua)) { 
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="Log(paramsmap.Get(\"up_values\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("615073302",BA.ObjectToString(_paramsmap.Get((Object)("up_values"))),0);
 };
 };
RDebugUtils.currentLine=15073315;
 //BA.debugLineNum = 15073315;BA.debugLine="End Sub";
return "";
}
public static String  _changebuttonwithcolormain(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ButtonWrapper _btn,boolean _state) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "changebuttonwithcolormain", false))
	 {return ((String) Debug.delegate(null, "changebuttonwithcolormain", new Object[] {_ba,_btn,_state}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Sub ChangeButtonWithColorMain(btn As Button, State";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="btn = Sender";
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(_ba)));
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="If Not(btn.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_btn.IsInitialized())) { 
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="btn.Initialize(\"\")";
_btn.Initialize(_ba,"");
 };
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="btn.Enabled = State";
_btn.setEnabled(_state);
RDebugUtils.currentLine=15532040;
 //BA.debugLineNum = 15532040;BA.debugLine="If (btn.Enabled) Then";
if ((_btn.getEnabled())) { 
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="btn.Color = Consts.ColorMain";
_btn.setColor(mostCurrent._consts._colormain /*int*/ );
 }else {
RDebugUtils.currentLine=15532043;
 //BA.debugLineNum = 15532043;BA.debugLine="btn.Color = Colors.Gray";
_btn.setColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
 };
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="End Sub";
return "";
}
public static String  _color2hex(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "color2hex", false))
	 {return ((String) Debug.delegate(null, "color2hex", new Object[] {_ba,_instr}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Color2Hex (inStr As String) As String";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="If NNE(inStr) Then";
if (_nne(_ba,_instr)) { 
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Select Case inStr.ToLowerCase";
switch (BA.switchObjectToInt(_instr.toLowerCase(),"red","green","blue","orange","white","black")) {
case 0: {
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Return \"#ff5c33\"";
if (true) return "#ff5c33";
 break; }
case 1: {
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Return \"#b3ff66\"";
if (true) return "#b3ff66";
 break; }
case 2: {
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Return \"#3399ff\"";
if (true) return "#3399ff";
 break; }
case 3: {
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="Return \"#ffc333\"";
if (true) return "#ffc333";
 break; }
case 4: {
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Return \"#ffffff\"";
if (true) return "#ffffff";
 break; }
case 5: {
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="Return \"#000000\"";
if (true) return "#000000";
 break; }
default: {
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="Return inStr";
if (true) return _instr;
 break; }
}
;
 }else {
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="Return \"#ffffff\"";
if (true) return "#ffffff";
 };
RDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="End Sub";
return "";
}
public static int  _colorint(anywheresoftware.b4a.BA _ba,int _iint) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "colorint", false))
	 {return ((Integer) Debug.delegate(null, "colorint", new Object[] {_ba,_iint}));}
int _ret = 0;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub ColorInt( iint As Int) As Int";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="If iint = 0 Then";
if (_iint==0) { 
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="ret = Colors.Blue";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Blue;
 }else 
{RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="else if iint = 1 Then";
if (_iint==1) { 
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="ret = Colors.Yellow";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Yellow;
 }else 
{RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="Else If iint = 2 Then";
if (_iint==2) { 
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="ret = Colors.Green";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Green;
 }else 
{RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="Else If iint = 3 Then";
if (_iint==3) { 
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="ret = Colors.Red";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Red;
 }else 
{RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="Else If iint = 4 Then";
if (_iint==4) { 
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="ret = Colors.Red";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Red;
 }else 
{RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="Else If iint = 5 Then";
if (_iint==5) { 
RDebugUtils.currentLine=13893645;
 //BA.debugLineNum = 13893645;BA.debugLine="ret = Colors.Gray";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Gray;
 }}}}}}
;
RDebugUtils.currentLine=13893647;
 //BA.debugLineNum = 13893647;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=13893648;
 //BA.debugLineNum = 13893648;BA.debugLine="End Sub";
return 0;
}
public static int  _colorstring(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "colorstring", false))
	 {return ((Integer) Debug.delegate(null, "colorstring", new Object[] {_ba,_str}));}
int _ret = 0;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub ColorString( str As String) As Int";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="If isNullOrEmpty(str) Then str = \"BLUE\"";
if (_isnullorempty(_ba,_str)) { 
_str = "BLUE";};
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="If str.ToUpperCase = \"BLUE\" Then";
if ((_str.toUpperCase()).equals("BLUE")) { 
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="ret = Colors.Blue";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Blue;
 }else 
{RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="else if str.ToUpperCase = \"YELLOW\" Then";
if ((_str.toUpperCase()).equals("YELLOW")) { 
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="ret = Colors.Yellow";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Yellow;
 }else 
{RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="Else If str.ToUpperCase = \"GREEN\" Then";
if ((_str.toUpperCase()).equals("GREEN")) { 
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="ret = Colors.Green";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Green;
 }else 
{RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="Else If str.ToUpperCase = \"RED\" Then";
if ((_str.toUpperCase()).equals("RED")) { 
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="ret = Colors.Red";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Red;
 }else 
{RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="Else If str.ToUpperCase = \"ORANGE\" Then";
if ((_str.toUpperCase()).equals("ORANGE")) { 
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="ret = Colors.Red";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Red;
 }else 
{RDebugUtils.currentLine=13828109;
 //BA.debugLineNum = 13828109;BA.debugLine="Else If str.ToUpperCase = \"GRAY\" Then";
if ((_str.toUpperCase()).equals("GRAY")) { 
RDebugUtils.currentLine=13828110;
 //BA.debugLineNum = 13828110;BA.debugLine="ret = Colors.Gray";
_ret = anywheresoftware.b4a.keywords.Common.Colors.Gray;
 }}}}}}
;
RDebugUtils.currentLine=13828112;
 //BA.debugLineNum = 13828112;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=13828113;
 //BA.debugLineNum = 13828113;BA.debugLine="End Sub";
return 0;
}
public static boolean  _compareonlyvaluescondition(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "compareonlyvaluescondition", false))
	 {return ((Boolean) Debug.delegate(null, "compareonlyvaluescondition", new Object[] {_ba,_instr}));}
boolean _ret = false;
anywheresoftware.b4a.objects.collections.List _vvalues = null;
String _parcela1 = "";
String _parcela2 = "";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub CompareOnlyValuesCondition(inStr As String) As";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Log(inStr)";
anywheresoftware.b4a.keywords.Common.LogImpl("64063235",_instr,0);
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="If inStr.Contains(\">=\") Then";
if (_instr.contains(">=")) { 
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="Dim vValues As List = Regex.Split(\"\\>=\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\>=",_instr));
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="ret = (vValues.Get(0) >= vValues.Get(1))";
_ret = ((double)(BA.ObjectToNumber(_vvalues.Get((int) (0))))>=(double)(BA.ObjectToNumber(_vvalues.Get((int) (1)))));
 }else 
{RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="else If inStr.Contains(\"<=\") Then";
if (_instr.contains("<=")) { 
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<=\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\<=",_instr));
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="ret = (vValues.Get(0) <= vValues.Get(1))";
_ret = ((double)(BA.ObjectToNumber(_vvalues.Get((int) (0))))<=(double)(BA.ObjectToNumber(_vvalues.Get((int) (1)))));
 }else 
{RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="else If inStr.Contains(\"!=\") Then";
if (_instr.contains("!=")) { 
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="Dim vValues As List = Regex.Split(\"\\!=\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\!=",_instr));
RDebugUtils.currentLine=4063254;
 //BA.debugLineNum = 4063254;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=4063257;
 //BA.debugLineNum = 4063257;BA.debugLine="ret = (vValues.Get(0) <> vValues.Get(1))";
_ret = ((_vvalues.Get((int) (0))).equals(_vvalues.Get((int) (1))) == false);
 }else 
{RDebugUtils.currentLine=4063258;
 //BA.debugLineNum = 4063258;BA.debugLine="else If inStr.Contains(\"<>\") Then";
if (_instr.contains("<>")) { 
RDebugUtils.currentLine=4063259;
 //BA.debugLineNum = 4063259;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<>\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\<>",_instr));
RDebugUtils.currentLine=4063261;
 //BA.debugLineNum = 4063261;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=4063264;
 //BA.debugLineNum = 4063264;BA.debugLine="ret = (vValues.Get(0) <> vValues.Get(1))";
_ret = ((_vvalues.Get((int) (0))).equals(_vvalues.Get((int) (1))) == false);
 }else 
{RDebugUtils.currentLine=4063265;
 //BA.debugLineNum = 4063265;BA.debugLine="else If inStr.Contains(\"<\") Then";
if (_instr.contains("<")) { 
RDebugUtils.currentLine=4063266;
 //BA.debugLineNum = 4063266;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\<",_instr));
RDebugUtils.currentLine=4063268;
 //BA.debugLineNum = 4063268;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=4063269;
 //BA.debugLineNum = 4063269;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=4063271;
 //BA.debugLineNum = 4063271;BA.debugLine="ret = (vValues.Get(0) < vValues.Get(1))";
_ret = ((double)(BA.ObjectToNumber(_vvalues.Get((int) (0))))<(double)(BA.ObjectToNumber(_vvalues.Get((int) (1)))));
 }else 
{RDebugUtils.currentLine=4063272;
 //BA.debugLineNum = 4063272;BA.debugLine="else If inStr.Contains(\">\") Then";
if (_instr.contains(">")) { 
RDebugUtils.currentLine=4063273;
 //BA.debugLineNum = 4063273;BA.debugLine="Dim vValues As List = Regex.Split(\"\\>\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\>",_instr));
RDebugUtils.currentLine=4063275;
 //BA.debugLineNum = 4063275;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=4063276;
 //BA.debugLineNum = 4063276;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=4063278;
 //BA.debugLineNum = 4063278;BA.debugLine="ret = (vValues.Get(0) > vValues.Get(1))";
_ret = ((double)(BA.ObjectToNumber(_vvalues.Get((int) (0))))>(double)(BA.ObjectToNumber(_vvalues.Get((int) (1)))));
 }else 
{RDebugUtils.currentLine=4063279;
 //BA.debugLineNum = 4063279;BA.debugLine="else If inStr.Contains(\"=\") Then";
if (_instr.contains("=")) { 
RDebugUtils.currentLine=4063280;
 //BA.debugLineNum = 4063280;BA.debugLine="Dim vValues As List = Regex.Split(\"\\=\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\=",_instr));
RDebugUtils.currentLine=4063282;
 //BA.debugLineNum = 4063282;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=4063283;
 //BA.debugLineNum = 4063283;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=4063285;
 //BA.debugLineNum = 4063285;BA.debugLine="ret = (vValues.Get(0) = vValues.Get(1))";
_ret = ((_vvalues.Get((int) (0))).equals(_vvalues.Get((int) (1))));
 }}}}}}}
;
RDebugUtils.currentLine=4063287;
 //BA.debugLineNum = 4063287;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=4063288;
 //BA.debugLineNum = 4063288;BA.debugLine="End Sub";
return false;
}
public static boolean  _comparevaluescondition(anywheresoftware.b4a.BA _ba,String _instr,anywheresoftware.b4a.objects.B4XViewWrapper _this) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "comparevaluescondition", false))
	 {return ((Boolean) Debug.delegate(null, "comparevaluescondition", new Object[] {_ba,_instr,_this}));}
boolean _ret = false;
anywheresoftware.b4a.objects.collections.List _thistag = null;
String _request = "";
String _action_tagcode = "";
String _task_tagcode = "";
String _item_tagcode = "";
String _unique_key = "";
String _tagcode = "";
int _execute_status = 0;
int _repeatcounter = 0;
int _repeatitemcounter = 0;
int _repeatfieldcounter = 0;
anywheresoftware.b4a.objects.collections.List _vvalues = null;
String _parcela1 = "";
String _parcela2 = "";
String _val2get = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub CompareValuesCondition(inStr As String, this A";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Log(inStr)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932163",_instr,0);
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="If NNE(this.Tag) Then";
if (_nne(_ba,BA.ObjectToString(_this.getTag()))) { 
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Dim thisTag As List = Regex.Split(\"\\|\",this.Tag";
_thistag = new anywheresoftware.b4a.objects.collections.List();
_thistag = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",BA.ObjectToString(_this.getTag())));
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Dim request As String = thisTag.Get(0)";
_request = BA.ObjectToString(_thistag.Get((int) (0)));
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="Dim action_tagcode As String = thisTag.Get(1)";
_action_tagcode = BA.ObjectToString(_thistag.Get((int) (1)));
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="Dim task_tagcode As String = thisTag.Get(2)";
_task_tagcode = BA.ObjectToString(_thistag.Get((int) (2)));
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="Dim item_tagcode As String = thisTag.Get(3)";
_item_tagcode = BA.ObjectToString(_thistag.Get((int) (3)));
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="Dim unique_key As String = thisTag.Get(4)";
_unique_key = BA.ObjectToString(_thistag.Get((int) (4)));
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="Dim tagcode As String = thisTag.Get(5)";
_tagcode = BA.ObjectToString(_thistag.Get((int) (5)));
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="Dim execute_status As Int = thisTag.Get(6)";
_execute_status = (int)(BA.ObjectToNumber(_thistag.Get((int) (6))));
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="Dim repeatcounter As Int = thisTag.Get(7)";
_repeatcounter = (int)(BA.ObjectToNumber(_thistag.Get((int) (7))));
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="Dim repeatitemcounter As Int = thisTag.Get(8)";
_repeatitemcounter = (int)(BA.ObjectToNumber(_thistag.Get((int) (8))));
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="Dim repeatfieldcounter As Int = thisTag.Get(9)";
_repeatfieldcounter = (int)(BA.ObjectToNumber(_thistag.Get((int) (9))));
 } 
       catch (Exception e17) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e17);RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932179",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932186;
 //BA.debugLineNum = 3932186;BA.debugLine="If inStr.Contains(\">=\") Then";
if (_instr.contains(">=")) { 
RDebugUtils.currentLine=3932187;
 //BA.debugLineNum = 3932187;BA.debugLine="Dim vValues As List = Regex.Split(\"\\>=\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\>=",_instr));
RDebugUtils.currentLine=3932189;
 //BA.debugLineNum = 3932189;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=3932190;
 //BA.debugLineNum = 3932190;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=3932192;
 //BA.debugLineNum = 3932192;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
if (_parcela1.contains("[") && _parcela1.contains("]")) { 
RDebugUtils.currentLine=3932193;
 //BA.debugLineNum = 3932193;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
_parcela1 = _parcela1.replace("[","");
RDebugUtils.currentLine=3932194;
 //BA.debugLineNum = 3932194;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
_parcela1 = _parcela1.replace("]","");
RDebugUtils.currentLine=3932195;
 //BA.debugLineNum = 3932195;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932196;
 //BA.debugLineNum = 3932196;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela1))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932203;
 //BA.debugLineNum = 3932203;BA.debugLine="vValues.Set(0,val2get)";
_vvalues.Set((int) (0),(Object)(_val2get));
 } 
       catch (Exception e32) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e32);RDebugUtils.currentLine=3932205;
 //BA.debugLineNum = 3932205;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932205",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932206;
 //BA.debugLineNum = 3932206;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932210;
 //BA.debugLineNum = 3932210;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
if (_parcela2.contains("[") && _parcela2.contains("]")) { 
RDebugUtils.currentLine=3932211;
 //BA.debugLineNum = 3932211;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
_parcela2 = _parcela2.replace("[","");
RDebugUtils.currentLine=3932212;
 //BA.debugLineNum = 3932212;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
_parcela2 = _parcela2.replace("]","");
RDebugUtils.currentLine=3932213;
 //BA.debugLineNum = 3932213;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932214;
 //BA.debugLineNum = 3932214;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela2))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932221;
 //BA.debugLineNum = 3932221;BA.debugLine="vValues.Set(1,val2get)";
_vvalues.Set((int) (1),(Object)(_val2get));
 } 
       catch (Exception e43) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e43);RDebugUtils.currentLine=3932223;
 //BA.debugLineNum = 3932223;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932223",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=3932227;
 //BA.debugLineNum = 3932227;BA.debugLine="ret = (vValues.Get(0) >= vValues.Get(1))";
_ret = ((double)(BA.ObjectToNumber(_vvalues.Get((int) (0))))>=(double)(BA.ObjectToNumber(_vvalues.Get((int) (1)))));
 }else 
{RDebugUtils.currentLine=3932228;
 //BA.debugLineNum = 3932228;BA.debugLine="else If inStr.Contains(\"<=\") Then";
if (_instr.contains("<=")) { 
RDebugUtils.currentLine=3932229;
 //BA.debugLineNum = 3932229;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<=\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\<=",_instr));
RDebugUtils.currentLine=3932231;
 //BA.debugLineNum = 3932231;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=3932232;
 //BA.debugLineNum = 3932232;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=3932234;
 //BA.debugLineNum = 3932234;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
if (_parcela1.contains("[") && _parcela1.contains("]")) { 
RDebugUtils.currentLine=3932235;
 //BA.debugLineNum = 3932235;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
_parcela1 = _parcela1.replace("[","");
RDebugUtils.currentLine=3932236;
 //BA.debugLineNum = 3932236;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
_parcela1 = _parcela1.replace("]","");
RDebugUtils.currentLine=3932237;
 //BA.debugLineNum = 3932237;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932238;
 //BA.debugLineNum = 3932238;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela1))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932245;
 //BA.debugLineNum = 3932245;BA.debugLine="vValues.Set(0,val2get)";
_vvalues.Set((int) (0),(Object)(_val2get));
 } 
       catch (Exception e58) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e58);RDebugUtils.currentLine=3932247;
 //BA.debugLineNum = 3932247;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932247",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932248;
 //BA.debugLineNum = 3932248;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932252;
 //BA.debugLineNum = 3932252;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
if (_parcela2.contains("[") && _parcela2.contains("]")) { 
RDebugUtils.currentLine=3932253;
 //BA.debugLineNum = 3932253;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
_parcela2 = _parcela2.replace("[","");
RDebugUtils.currentLine=3932254;
 //BA.debugLineNum = 3932254;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
_parcela2 = _parcela2.replace("]","");
RDebugUtils.currentLine=3932255;
 //BA.debugLineNum = 3932255;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932256;
 //BA.debugLineNum = 3932256;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela2))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932263;
 //BA.debugLineNum = 3932263;BA.debugLine="vValues.Set(1,val2get)";
_vvalues.Set((int) (1),(Object)(_val2get));
 } 
       catch (Exception e69) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e69);RDebugUtils.currentLine=3932265;
 //BA.debugLineNum = 3932265;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932265",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=3932269;
 //BA.debugLineNum = 3932269;BA.debugLine="ret = (vValues.Get(0) <= vValues.Get(1))";
_ret = ((double)(BA.ObjectToNumber(_vvalues.Get((int) (0))))<=(double)(BA.ObjectToNumber(_vvalues.Get((int) (1)))));
 }else 
{RDebugUtils.currentLine=3932270;
 //BA.debugLineNum = 3932270;BA.debugLine="else If inStr.Contains(\"!=\") Then";
if (_instr.contains("!=")) { 
RDebugUtils.currentLine=3932271;
 //BA.debugLineNum = 3932271;BA.debugLine="Dim vValues As List = Regex.Split(\"\\!=\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\!=",_instr));
RDebugUtils.currentLine=3932273;
 //BA.debugLineNum = 3932273;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=3932274;
 //BA.debugLineNum = 3932274;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=3932276;
 //BA.debugLineNum = 3932276;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
if (_parcela1.contains("[") && _parcela1.contains("]")) { 
RDebugUtils.currentLine=3932277;
 //BA.debugLineNum = 3932277;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
_parcela1 = _parcela1.replace("[","");
RDebugUtils.currentLine=3932278;
 //BA.debugLineNum = 3932278;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
_parcela1 = _parcela1.replace("]","");
RDebugUtils.currentLine=3932279;
 //BA.debugLineNum = 3932279;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932280;
 //BA.debugLineNum = 3932280;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela1))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932287;
 //BA.debugLineNum = 3932287;BA.debugLine="vValues.Set(0,val2get)";
_vvalues.Set((int) (0),(Object)(_val2get));
 } 
       catch (Exception e84) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e84);RDebugUtils.currentLine=3932289;
 //BA.debugLineNum = 3932289;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932289",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932290;
 //BA.debugLineNum = 3932290;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932294;
 //BA.debugLineNum = 3932294;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
if (_parcela2.contains("[") && _parcela2.contains("]")) { 
RDebugUtils.currentLine=3932295;
 //BA.debugLineNum = 3932295;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
_parcela2 = _parcela2.replace("[","");
RDebugUtils.currentLine=3932296;
 //BA.debugLineNum = 3932296;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
_parcela2 = _parcela2.replace("]","");
RDebugUtils.currentLine=3932297;
 //BA.debugLineNum = 3932297;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932298;
 //BA.debugLineNum = 3932298;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela2))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932305;
 //BA.debugLineNum = 3932305;BA.debugLine="vValues.Set(1,val2get)";
_vvalues.Set((int) (1),(Object)(_val2get));
 } 
       catch (Exception e95) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e95);RDebugUtils.currentLine=3932307;
 //BA.debugLineNum = 3932307;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932307",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=3932311;
 //BA.debugLineNum = 3932311;BA.debugLine="ret = (vValues.Get(0) <> vValues.Get(1))";
_ret = ((_vvalues.Get((int) (0))).equals(_vvalues.Get((int) (1))) == false);
 }else 
{RDebugUtils.currentLine=3932312;
 //BA.debugLineNum = 3932312;BA.debugLine="else If inStr.Contains(\"<>\") Then";
if (_instr.contains("<>")) { 
RDebugUtils.currentLine=3932313;
 //BA.debugLineNum = 3932313;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<>\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\<>",_instr));
RDebugUtils.currentLine=3932315;
 //BA.debugLineNum = 3932315;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=3932316;
 //BA.debugLineNum = 3932316;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=3932318;
 //BA.debugLineNum = 3932318;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
if (_parcela1.contains("[") && _parcela1.contains("]")) { 
RDebugUtils.currentLine=3932319;
 //BA.debugLineNum = 3932319;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
_parcela1 = _parcela1.replace("[","");
RDebugUtils.currentLine=3932320;
 //BA.debugLineNum = 3932320;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
_parcela1 = _parcela1.replace("]","");
RDebugUtils.currentLine=3932321;
 //BA.debugLineNum = 3932321;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932322;
 //BA.debugLineNum = 3932322;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela1))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932329;
 //BA.debugLineNum = 3932329;BA.debugLine="vValues.Set(0,val2get)";
_vvalues.Set((int) (0),(Object)(_val2get));
 } 
       catch (Exception e110) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e110);RDebugUtils.currentLine=3932331;
 //BA.debugLineNum = 3932331;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932331",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932332;
 //BA.debugLineNum = 3932332;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932336;
 //BA.debugLineNum = 3932336;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
if (_parcela2.contains("[") && _parcela2.contains("]")) { 
RDebugUtils.currentLine=3932337;
 //BA.debugLineNum = 3932337;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
_parcela2 = _parcela2.replace("[","");
RDebugUtils.currentLine=3932338;
 //BA.debugLineNum = 3932338;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
_parcela2 = _parcela2.replace("]","");
RDebugUtils.currentLine=3932339;
 //BA.debugLineNum = 3932339;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932340;
 //BA.debugLineNum = 3932340;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela2))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932347;
 //BA.debugLineNum = 3932347;BA.debugLine="vValues.Set(1,val2get)";
_vvalues.Set((int) (1),(Object)(_val2get));
 } 
       catch (Exception e121) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e121);RDebugUtils.currentLine=3932349;
 //BA.debugLineNum = 3932349;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932349",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932350;
 //BA.debugLineNum = 3932350;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932354;
 //BA.debugLineNum = 3932354;BA.debugLine="ret = (vValues.Get(0) <> vValues.Get(1))";
_ret = ((_vvalues.Get((int) (0))).equals(_vvalues.Get((int) (1))) == false);
 }else 
{RDebugUtils.currentLine=3932355;
 //BA.debugLineNum = 3932355;BA.debugLine="else If inStr.Contains(\"<\") Then";
if (_instr.contains("<")) { 
RDebugUtils.currentLine=3932356;
 //BA.debugLineNum = 3932356;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\<",_instr));
RDebugUtils.currentLine=3932358;
 //BA.debugLineNum = 3932358;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=3932359;
 //BA.debugLineNum = 3932359;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=3932361;
 //BA.debugLineNum = 3932361;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
if (_parcela1.contains("[") && _parcela1.contains("]")) { 
RDebugUtils.currentLine=3932362;
 //BA.debugLineNum = 3932362;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
_parcela1 = _parcela1.replace("[","");
RDebugUtils.currentLine=3932363;
 //BA.debugLineNum = 3932363;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
_parcela1 = _parcela1.replace("]","");
RDebugUtils.currentLine=3932364;
 //BA.debugLineNum = 3932364;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932365;
 //BA.debugLineNum = 3932365;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela1))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932372;
 //BA.debugLineNum = 3932372;BA.debugLine="vValues.Set(0,val2get)";
_vvalues.Set((int) (0),(Object)(_val2get));
 } 
       catch (Exception e137) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e137);RDebugUtils.currentLine=3932374;
 //BA.debugLineNum = 3932374;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932374",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932375;
 //BA.debugLineNum = 3932375;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932379;
 //BA.debugLineNum = 3932379;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
if (_parcela2.contains("[") && _parcela2.contains("]")) { 
RDebugUtils.currentLine=3932380;
 //BA.debugLineNum = 3932380;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
_parcela2 = _parcela2.replace("[","");
RDebugUtils.currentLine=3932381;
 //BA.debugLineNum = 3932381;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
_parcela2 = _parcela2.replace("]","");
RDebugUtils.currentLine=3932382;
 //BA.debugLineNum = 3932382;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932383;
 //BA.debugLineNum = 3932383;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela2))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932390;
 //BA.debugLineNum = 3932390;BA.debugLine="vValues.Set(1,val2get)";
_vvalues.Set((int) (1),(Object)(_val2get));
 } 
       catch (Exception e148) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e148);RDebugUtils.currentLine=3932392;
 //BA.debugLineNum = 3932392;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932392",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932393;
 //BA.debugLineNum = 3932393;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932397;
 //BA.debugLineNum = 3932397;BA.debugLine="ret = (vValues.Get(0) < vValues.Get(1))";
_ret = ((double)(BA.ObjectToNumber(_vvalues.Get((int) (0))))<(double)(BA.ObjectToNumber(_vvalues.Get((int) (1)))));
 }else 
{RDebugUtils.currentLine=3932398;
 //BA.debugLineNum = 3932398;BA.debugLine="else If inStr.Contains(\">\") Then";
if (_instr.contains(">")) { 
RDebugUtils.currentLine=3932399;
 //BA.debugLineNum = 3932399;BA.debugLine="Dim vValues As List = Regex.Split(\"\\>\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\>",_instr));
RDebugUtils.currentLine=3932401;
 //BA.debugLineNum = 3932401;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=3932402;
 //BA.debugLineNum = 3932402;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=3932404;
 //BA.debugLineNum = 3932404;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
if (_parcela1.contains("[") && _parcela1.contains("]")) { 
RDebugUtils.currentLine=3932405;
 //BA.debugLineNum = 3932405;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
_parcela1 = _parcela1.replace("[","");
RDebugUtils.currentLine=3932406;
 //BA.debugLineNum = 3932406;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
_parcela1 = _parcela1.replace("]","");
RDebugUtils.currentLine=3932407;
 //BA.debugLineNum = 3932407;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932408;
 //BA.debugLineNum = 3932408;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela1))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932415;
 //BA.debugLineNum = 3932415;BA.debugLine="vValues.Set(0,val2get)";
_vvalues.Set((int) (0),(Object)(_val2get));
 } 
       catch (Exception e164) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e164);RDebugUtils.currentLine=3932417;
 //BA.debugLineNum = 3932417;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932417",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932418;
 //BA.debugLineNum = 3932418;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932422;
 //BA.debugLineNum = 3932422;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
if (_parcela2.contains("[") && _parcela2.contains("]")) { 
RDebugUtils.currentLine=3932423;
 //BA.debugLineNum = 3932423;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
_parcela2 = _parcela2.replace("[","");
RDebugUtils.currentLine=3932424;
 //BA.debugLineNum = 3932424;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
_parcela2 = _parcela2.replace("]","");
RDebugUtils.currentLine=3932425;
 //BA.debugLineNum = 3932425;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932426;
 //BA.debugLineNum = 3932426;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela2))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932433;
 //BA.debugLineNum = 3932433;BA.debugLine="vValues.Set(1,val2get)";
_vvalues.Set((int) (1),(Object)(_val2get));
 } 
       catch (Exception e175) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e175);RDebugUtils.currentLine=3932435;
 //BA.debugLineNum = 3932435;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932435",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932436;
 //BA.debugLineNum = 3932436;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932440;
 //BA.debugLineNum = 3932440;BA.debugLine="ret = (vValues.Get(0) > vValues.Get(1))";
_ret = ((double)(BA.ObjectToNumber(_vvalues.Get((int) (0))))>(double)(BA.ObjectToNumber(_vvalues.Get((int) (1)))));
 }else 
{RDebugUtils.currentLine=3932441;
 //BA.debugLineNum = 3932441;BA.debugLine="else If inStr.Contains(\"=\") Then";
if (_instr.contains("=")) { 
RDebugUtils.currentLine=3932442;
 //BA.debugLineNum = 3932442;BA.debugLine="Dim vValues As List = Regex.Split(\"\\=\", inStr )";
_vvalues = new anywheresoftware.b4a.objects.collections.List();
_vvalues = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\=",_instr));
RDebugUtils.currentLine=3932444;
 //BA.debugLineNum = 3932444;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
_parcela1 = BA.ObjectToString(_vvalues.Get((int) (0)));
RDebugUtils.currentLine=3932445;
 //BA.debugLineNum = 3932445;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
_parcela2 = BA.ObjectToString(_vvalues.Get((int) (1)));
RDebugUtils.currentLine=3932447;
 //BA.debugLineNum = 3932447;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
if (_parcela1.contains("[") && _parcela1.contains("]")) { 
RDebugUtils.currentLine=3932448;
 //BA.debugLineNum = 3932448;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
_parcela1 = _parcela1.replace("[","");
RDebugUtils.currentLine=3932449;
 //BA.debugLineNum = 3932449;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
_parcela1 = _parcela1.replace("]","");
RDebugUtils.currentLine=3932450;
 //BA.debugLineNum = 3932450;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932451;
 //BA.debugLineNum = 3932451;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela1))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932458;
 //BA.debugLineNum = 3932458;BA.debugLine="vValues.Set(0,val2get)";
_vvalues.Set((int) (0),(Object)(_val2get));
 } 
       catch (Exception e191) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e191);RDebugUtils.currentLine=3932460;
 //BA.debugLineNum = 3932460;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932460",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932461;
 //BA.debugLineNum = 3932461;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932465;
 //BA.debugLineNum = 3932465;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
if (_parcela2.contains("[") && _parcela2.contains("]")) { 
RDebugUtils.currentLine=3932466;
 //BA.debugLineNum = 3932466;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
_parcela2 = _parcela2.replace("[","");
RDebugUtils.currentLine=3932467;
 //BA.debugLineNum = 3932467;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
_parcela2 = _parcela2.replace("]","");
RDebugUtils.currentLine=3932468;
 //BA.debugLineNum = 3932468;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932469;
 //BA.debugLineNum = 3932469;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
_val2get = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select execute_value from dta_requests_values where 1=1\n"+"				and request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'\n"+"				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode.trim()))+"'\n"+"				And item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_parcela2))+"'\n"+"				And repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"				and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"				And repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+""),"execute_value");
RDebugUtils.currentLine=3932476;
 //BA.debugLineNum = 3932476;BA.debugLine="vValues.Set(1,val2get)";
_vvalues.Set((int) (1),(Object)(_val2get));
 } 
       catch (Exception e202) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e202);RDebugUtils.currentLine=3932478;
 //BA.debugLineNum = 3932478;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("63932478",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3932479;
 //BA.debugLineNum = 3932479;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=3932483;
 //BA.debugLineNum = 3932483;BA.debugLine="ret = (vValues.Get(0) = vValues.Get(1))";
_ret = ((_vvalues.Get((int) (0))).equals(_vvalues.Get((int) (1))));
 }}}}}}}
;
RDebugUtils.currentLine=3932485;
 //BA.debugLineNum = 3932485;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=3932486;
 //BA.debugLineNum = 3932486;BA.debugLine="End Sub";
return false;
}
public static String  _concatwith(anywheresoftware.b4a.BA _ba,String _base,String _newstr,String _divider) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "concatwith", false))
	 {return ((String) Debug.delegate(null, "concatwith", new Object[] {_ba,_base,_newstr,_divider}));}
String _ret = "";
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub concatWith(base As String, newstr As String, d";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim ret As String = base";
_ret = _base;
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="If NNE(newstr) Then";
if (_nne(_ba,_newstr)) { 
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="ret = $\"${ret}${IfTrue(NE(ret), \"\", divider)}${n";
_ret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ret))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_iftrue(_ba,_ne(_ba,_ret),"",_divider)))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newstr))+"");
 };
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="End Sub";
return "";
}
public static String  _iftrue(anywheresoftware.b4a.BA _ba,boolean _condition,String _strue,String _sfalse) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "iftrue", false))
	 {return ((String) Debug.delegate(null, "iftrue", new Object[] {_ba,_condition,_strue,_sfalse}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub IfTrue(condition As Boolean, sTrue As String,";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="If (condition) Then";
if ((_condition)) { 
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Return sTrue";
if (true) return _strue;
 }else {
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="Return sFalse";
if (true) return _sfalse;
 };
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="End Sub";
return "";
}
public static String  _convertimage(anywheresoftware.b4a.BA _ba,String _image,int _imagecounter,double _percent) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "convertimage", false))
	 {return ((String) Debug.delegate(null, "convertimage", new Object[] {_ba,_image,_imagecounter,_percent}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
String _abcfile = "";
String _deffile = "";
int _bw = 0;
int _bh = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _newbmp = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub ConvertImage(image As String, ImageCounter As";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim bmp As B4XBitmap = B64ToBitmap(image)";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _b64tobitmap(_ba,_image);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim abcFile As String = $\"ABC${ImageCounter}.png\"";
_abcfile = ("ABC"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
_deffile = ("DEF"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Bitmap2File(bmp, Starter.SharedFolder, abcFile)";
_bitmap2file(_ba,_bmp,mostCurrent._starter._sharedfolder /*String*/ ,_abcfile);
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH -";
_bw = (int) (mostCurrent._sharecode._device_def_img_width /*int*/ -(mostCurrent._sharecode._device_def_img_width /*int*/ /(double)_percent));
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT -";
_bh = (int) (mostCurrent._sharecode._device_def_img_height /*int*/ -(mostCurrent._sharecode._device_def_img_height /*int*/ /(double)_percent));
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapSample(Starte";
_newbmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_newbmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapSample(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_abcfile,_bw,_bh).getObject()));
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="Bitmap2File(newbmp, Starter.Provider.SharedFolder";
_bitmap2file(_ba,_newbmp,mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
_image = _base64con._v6(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, abcFil";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_abcfile);
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, defFil";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4915222;
 //BA.debugLineNum = 4915222;BA.debugLine="Return image";
if (true) return _image;
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="End Sub";
return "";
}
public static String  _convertimagefromfile(anywheresoftware.b4a.BA _ba,String _image,int _imagecounter,double _percent) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "convertimagefromfile", false))
	 {return ((String) Debug.delegate(null, "convertimagefromfile", new Object[] {_ba,_image,_imagecounter,_percent}));}
String _deffile = "";
int _bw = 0;
int _bh = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _newbmp = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub ConvertImageFromFile(image As String, ImageCou";
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
_deffile = ("DEF"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH -";
_bw = (int) (mostCurrent._sharecode._device_def_img_width /*int*/ -(mostCurrent._sharecode._device_def_img_width /*int*/ /(double)_percent));
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT -";
_bh = (int) (mostCurrent._sharecode._device_def_img_height /*int*/ -(mostCurrent._sharecode._device_def_img_height /*int*/ /(double)_percent));
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapSample(Starte";
_newbmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_newbmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapSample(mostCurrent._starter._sharedfolder /*String*/ ,_image,_bw,_bh).getObject()));
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
_bitmap2file(_ba,_newbmp,mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
_image = _base64con._v6(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="Return image";
if (true) return _image;
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="End Sub";
return "";
}
public static String  _convertimagesize(anywheresoftware.b4a.BA _ba,String _image,int _imagecounter,double _percent) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "convertimagesize", false))
	 {return ((String) Debug.delegate(null, "convertimagesize", new Object[] {_ba,_image,_imagecounter,_percent}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
String _abcfile = "";
String _deffile = "";
int _bw = 0;
int _bh = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _newbmp = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub ConvertImageSize(image As String, ImageCounter";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim bmp As B4XBitmap = B64ToBitmap(image)";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _b64tobitmap(_ba,_image);
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim abcFile As String = $\"ABC${ImageCounter}.png\"";
_abcfile = ("ABC"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
_deffile = ("DEF"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="Bitmap2File(bmp, Starter.SharedFolder, abcFile)";
_bitmap2file(_ba,_bmp,mostCurrent._starter._sharedfolder /*String*/ ,_abcfile);
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH -";
_bw = (int) (mostCurrent._sharecode._device_def_img_width /*int*/ -(mostCurrent._sharecode._device_def_img_width /*int*/ /(double)_percent));
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT -";
_bh = (int) (mostCurrent._sharecode._device_def_img_height /*int*/ -(mostCurrent._sharecode._device_def_img_height /*int*/ /(double)_percent));
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapResize(Starte";
_newbmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_newbmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(mostCurrent._starter._sharedfolder /*String*/ ,_abcfile,_bw,_bh,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
_bitmap2file(_ba,_newbmp,mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
_image = _base64con._v6(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="File.Delete(Starter.SharedFolder, abcFile)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._sharedfolder /*String*/ ,_abcfile);
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4653073;
 //BA.debugLineNum = 4653073;BA.debugLine="Return image";
if (true) return _image;
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="End Sub";
return "";
}
public static String  _convertimagesizefromfile(anywheresoftware.b4a.BA _ba,String _image,int _imagecounter,double _percent) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "convertimagesizefromfile", false))
	 {return ((String) Debug.delegate(null, "convertimagesizefromfile", new Object[] {_ba,_image,_imagecounter,_percent}));}
String _deffile = "";
int _bw = 0;
int _bh = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _newbmp = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub ConvertImageSizeFromFile(image As String, Imag";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
_deffile = ("DEF"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH -";
_bw = (int) (mostCurrent._sharecode._device_def_img_width /*int*/ -(mostCurrent._sharecode._device_def_img_width /*int*/ /(double)_percent));
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT -";
_bh = (int) (mostCurrent._sharecode._device_def_img_height /*int*/ -(mostCurrent._sharecode._device_def_img_height /*int*/ /(double)_percent));
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapResize(Starte";
_newbmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_newbmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(mostCurrent._starter._sharedfolder /*String*/ ,_image,_bw,_bh,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
_bitmap2file(_ba,_newbmp,mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
_image = _base64con._v6(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="Return image";
if (true) return _image;
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="End Sub";
return "";
}
public static String  _convertimagesizefromfilewh(anywheresoftware.b4a.BA _ba,String _image,int _imagecounter,int _bw,int _bh) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "convertimagesizefromfilewh", false))
	 {return ((String) Debug.delegate(null, "convertimagesizefromfilewh", new Object[] {_ba,_image,_imagecounter,_bw,_bh}));}
String _deffile = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _newbmp = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub ConvertImageSizeFromFileWH(image As String, Im";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
_deffile = ("DEF"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapResize(Starte";
_newbmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_newbmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(mostCurrent._starter._sharedfolder /*String*/ ,_image,_bw,_bh,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
_bitmap2file(_ba,_newbmp,mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
_image = _base64con._v6(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Return image";
if (true) return _image;
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="End Sub";
return "";
}
public static String  _convertimagesizewh(anywheresoftware.b4a.BA _ba,String _image,int _imagecounter,int _bw,int _bh) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "convertimagesizewh", false))
	 {return ((String) Debug.delegate(null, "convertimagesizewh", new Object[] {_ba,_image,_imagecounter,_bw,_bh}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
String _abcfile = "";
String _deffile = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _newbmp = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub ConvertImageSizeWH(image As String, ImageCount";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim bmp As B4XBitmap = B64ToBitmap(image)";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _b64tobitmap(_ba,_image);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim abcFile As String = $\"ABC${ImageCounter}.png\"";
_abcfile = ("ABC"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
_deffile = ("DEF"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imagecounter))+".png");
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Bitmap2File(bmp, Starter.SharedFolder, abcFile)";
_bitmap2file(_ba,_bmp,mostCurrent._starter._sharedfolder /*String*/ ,_abcfile);
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapResize(Starte";
_newbmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_newbmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(mostCurrent._starter._sharedfolder /*String*/ ,_abcfile,_bw,_bh,anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
_bitmap2file(_ba,_newbmp,mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
_base64con._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
_image = _base64con._v6(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="File.Delete(Starter.SharedFolder, abcFile)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._sharedfolder /*String*/ ,_abcfile);
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._sharedfolder /*String*/ ,_deffile);
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="Return image";
if (true) return _image;
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="End Sub";
return "";
}
public static Object  _createfileprovideruri(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "createfileprovideruri", false))
	 {return ((Object) Debug.delegate(null, "createfileprovideruri", new Object[] {_ba,_filename}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub CreateFileProviderUri (FileName As String) As";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Return Starter.Provider.GetFileUri(FileName)";
if (true) return mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._getfileuri /*Object*/ (null,_filename);
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createmapicon(anywheresoftware.b4a.BA _ba,int _counter,String _colorstr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "createmapicon", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(null, "createmapicon", new Object[] {_ba,_counter,_colorstr}));}
anywheresoftware.b4a.objects.PanelWrapper _pbd = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _cvsrect = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
int _centerx = 0;
int _centery = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub CreateMapIcon(Counter As Int, ColorStr As Stri";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Dim pbd As Panel";
_pbd = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="pbd.Initialize(\"\")";
_pbd.Initialize(_ba,"");
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="pbd.Width = 37dip";
_pbd.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (37)));
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="pbd.Height = 64dip";
_pbd.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (64)));
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="pbd.SetBackgroundImage(LoadBitmap(File.DirAssets,";
_pbd.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),("p_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colorstr))+".png")).getObject()));
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="cvs.Initialize(pbd)";
_cvs.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pbd.getObject())));
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="Dim cvsRect As B4XRect";
_cvsrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="cvsRect.Initialize(0, 0, 37dip, 37dip)";
_cvsrect.Initialize((float) (0),(float) (0),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (37))),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (37))));
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFA";
_fnt = _xui.CreateFont(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT,(float) (mostCurrent._sharecode._device_def_font_size /*int*/ ));
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="Dim CenterX As Int = (cvsRect.left+cvsRect.Right)";
_centerx = (int) ((_cvsrect.getLeft()+_cvsrect.getRight())/(double)2);
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="Dim CenterY As Int = (cvsRect.Top+cvsRect.Bottom)";
_centery = (int) ((_cvsrect.getTop()+_cvsrect.getBottom())/(double)2);
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Counter, fnt)";
_r = _cvs.MeasureText(BA.NumberToString(_counter),_fnt);
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="Dim baseline As Int = CenterY - r.Height / 2 - r.";
_baseline = (int) (_centery-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="cvs.DrawText(Counter, CenterX, baseline, fnt, Col";
_cvs.DrawText((_ba.processBA == null ? _ba : _ba.processBA),BA.NumberToString(_counter),(float) (_centerx),(float) (_baseline),_fnt,anywheresoftware.b4a.keywords.Common.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="Return cvs.CreateBitmap";
if (true) return _cvs.CreateBitmap();
RDebugUtils.currentLine=9633813;
 //BA.debugLineNum = 9633813;BA.debugLine="End Sub";
return null;
}
public static String  _dashdotline(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ImageViewWrapper _vw,xevolution.vrcg.devdemov2400.types._pointapi _frompoint,xevolution.vrcg.devdemov2400.types._pointapi _topoint,float _strokewdt,float _dotspc,int _clr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dashdotline", false))
	 {return ((String) Debug.delegate(null, "dashdotline", new Object[] {_ba,_vw,_frompoint,_topoint,_strokewdt,_dotspc,_clr}));}
xevolution.vrcg.devdemov2400.types._pointapi[] _newpt = null;
int _stp = 0;
float _blankspc = 0f;
double _angle = 0;
double _lng = 0;
double _ct = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
anywheresoftware.b4a.agraham.reflection.Reflection _obj1 = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub dashdotLine(vw As ImageView, fromPoint";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim NewPt(3) As PointApi";
_newpt = new xevolution.vrcg.devdemov2400.types._pointapi[(int) (3)];
{
int d0 = _newpt.length;
for (int i0 = 0;i0 < d0;i0++) {
_newpt[i0] = new xevolution.vrcg.devdemov2400.types._pointapi();
}
}
;
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Dim stp As Int";
_stp = 0;
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Dim BlankSpc As Float";
_blankspc = 0f;
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="Dim Angle, lng As Double";
_angle = 0;
_lng = 0;
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="Dim ct As Double";
_ct = 0;
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="Dim cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="cvs.Initialize(vw)";
_cvs.Initialize((android.view.View)(_vw.getObject()));
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="Dim Obj1 As Reflector";
_obj1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="Obj1.Target = cvs";
_obj1.Target = (Object)(_cvs);
RDebugUtils.currentLine=14614539;
 //BA.debugLineNum = 14614539;BA.debugLine="Obj1.Target = Obj1.GetField(\"paint\")";
_obj1.Target = _obj1.GetField("paint");
RDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="Obj1.RunMethod2(\"setAntiAlias\", True, \"java.la";
_obj1.RunMethod2("setAntiAlias",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True),"java.lang.boolean");
RDebugUtils.currentLine=14614542;
 //BA.debugLineNum = 14614542;BA.debugLine="Angle = 90 - CalcAngleD(fromPoint, toPoint)";
_angle = 90-_calcangled(_ba,_frompoint,_topoint);
RDebugUtils.currentLine=14614543;
 //BA.debugLineNum = 14614543;BA.debugLine="lng = Distance(fromPoint, toPoint)";
_lng = _distance(_ba,_frompoint,_topoint);
RDebugUtils.currentLine=14614544;
 //BA.debugLineNum = 14614544;BA.debugLine="lng = lng - dotSpc";
_lng = _lng-_dotspc;
RDebugUtils.currentLine=14614545;
 //BA.debugLineNum = 14614545;BA.debugLine="BlankSpc = dotSpc + strokeWdt";
_blankspc = (float) (_dotspc+_strokewdt);
RDebugUtils.currentLine=14614546;
 //BA.debugLineNum = 14614546;BA.debugLine="dotSpc = dotSpc + BlankSpc";
_dotspc = (float) (_dotspc+_blankspc);
RDebugUtils.currentLine=14614547;
 //BA.debugLineNum = 14614547;BA.debugLine="stp = lng / dotSpc";
_stp = (int) (_lng/(double)_dotspc);
RDebugUtils.currentLine=14614548;
 //BA.debugLineNum = 14614548;BA.debugLine="dotSpc = lng / stp";
_dotspc = (float) (_lng/(double)_stp);
RDebugUtils.currentLine=14614549;
 //BA.debugLineNum = 14614549;BA.debugLine="lng = lng - dotSpc / 2";
_lng = _lng-_dotspc/(double)2;
RDebugUtils.currentLine=14614550;
 //BA.debugLineNum = 14614550;BA.debugLine="For ct = 0 To lng Step dotSpc";
{
final double step20 = _dotspc;
final double limit20 = _lng;
_ct = 0 ;
for (;(step20 > 0 && _ct <= limit20) || (step20 < 0 && _ct >= limit20) ;_ct = ((double)(0 + _ct + step20))  ) {
RDebugUtils.currentLine=14614551;
 //BA.debugLineNum = 14614551;BA.debugLine="NewPt(0).x   = fromPoint.x + ct * SinD(Angle)";
_newpt[(int) (0)].X /*float*/  = (float) (_frompoint.X /*float*/ +_ct*anywheresoftware.b4a.keywords.Common.SinD(_angle));
RDebugUtils.currentLine=14614552;
 //BA.debugLineNum = 14614552;BA.debugLine="NewPt(0).y = fromPoint.y + ct * CosD(Angle)";
_newpt[(int) (0)].Y /*float*/  = (float) (_frompoint.Y /*float*/ +_ct*anywheresoftware.b4a.keywords.Common.CosD(_angle));
RDebugUtils.currentLine=14614553;
 //BA.debugLineNum = 14614553;BA.debugLine="NewPt(1).x = fromPoint.x + (ct + dotSpc - BlankS";
_newpt[(int) (1)].X /*float*/  = (float) (_frompoint.X /*float*/ +(_ct+_dotspc-_blankspc)*anywheresoftware.b4a.keywords.Common.SinD(_angle));
RDebugUtils.currentLine=14614554;
 //BA.debugLineNum = 14614554;BA.debugLine="NewPt(1).y = fromPoint.y + (ct + dotSpc - BlankS";
_newpt[(int) (1)].Y /*float*/  = (float) (_frompoint.Y /*float*/ +(_ct+_dotspc-_blankspc)*anywheresoftware.b4a.keywords.Common.CosD(_angle));
RDebugUtils.currentLine=14614555;
 //BA.debugLineNum = 14614555;BA.debugLine="NewPt(2).x = fromPoint.x + (ct + dotSpc - BlankS";
_newpt[(int) (2)].X /*float*/  = (float) (_frompoint.X /*float*/ +(_ct+_dotspc-_blankspc/(double)2)*anywheresoftware.b4a.keywords.Common.SinD(_angle));
RDebugUtils.currentLine=14614556;
 //BA.debugLineNum = 14614556;BA.debugLine="NewPt(2).y = fromPoint.y + (ct + dotSpc - BlankS";
_newpt[(int) (2)].Y /*float*/  = (float) (_frompoint.Y /*float*/ +(_ct+_dotspc-_blankspc/(double)2)*anywheresoftware.b4a.keywords.Common.CosD(_angle));
RDebugUtils.currentLine=14614557;
 //BA.debugLineNum = 14614557;BA.debugLine="cvs.drawline(NewPt(0).x, NewPt(0).y, NewPt(1).x,";
_cvs.DrawLine(_newpt[(int) (0)].X /*float*/ ,_newpt[(int) (0)].Y /*float*/ ,_newpt[(int) (1)].X /*float*/ ,_newpt[(int) (1)].Y /*float*/ ,_clr,_strokewdt);
RDebugUtils.currentLine=14614558;
 //BA.debugLineNum = 14614558;BA.debugLine="cvs.drawCircle(NewPt(2).x, NewPt(2).y, strokeWdt";
_cvs.DrawCircle(_newpt[(int) (2)].X /*float*/ ,_newpt[(int) (2)].Y /*float*/ ,(float) (_strokewdt/(double)2),_clr,anywheresoftware.b4a.keywords.Common.True,(float) (0));
 }
};
RDebugUtils.currentLine=14614560;
 //BA.debugLineNum = 14614560;BA.debugLine="NewPt(0).x = fromPoint.x + ct * SinD(Angle)";
_newpt[(int) (0)].X /*float*/  = (float) (_frompoint.X /*float*/ +_ct*anywheresoftware.b4a.keywords.Common.SinD(_angle));
RDebugUtils.currentLine=14614561;
 //BA.debugLineNum = 14614561;BA.debugLine="NewPt(0).y = fromPoint.y + ct * CosD(Angle)";
_newpt[(int) (0)].Y /*float*/  = (float) (_frompoint.Y /*float*/ +_ct*anywheresoftware.b4a.keywords.Common.CosD(_angle));
RDebugUtils.currentLine=14614562;
 //BA.debugLineNum = 14614562;BA.debugLine="cvs.drawline(NewPt(0).x, NewPt(0).y, toPoint.x, t";
_cvs.DrawLine(_newpt[(int) (0)].X /*float*/ ,_newpt[(int) (0)].Y /*float*/ ,_topoint.X /*float*/ ,_topoint.Y /*float*/ ,_clr,_strokewdt);
RDebugUtils.currentLine=14614563;
 //BA.debugLineNum = 14614563;BA.debugLine="End Sub";
return "";
}
public static float  _distance(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.types._pointapi _frompoint,xevolution.vrcg.devdemov2400.types._pointapi _topoint) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "distance", false))
	 {return ((Float) Debug.delegate(null, "distance", new Object[] {_ba,_frompoint,_topoint}));}
float _d = 0f;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub Distance(fromPoint As PointApi, toPoint";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Dim d As Float";
_d = 0f;
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="d = Sqrt(Power(Abs(toPoint.x - fromPoint.x),2) +";
_d = (float) (anywheresoftware.b4a.keywords.Common.Sqrt(anywheresoftware.b4a.keywords.Common.Power(anywheresoftware.b4a.keywords.Common.Abs(_topoint.X /*float*/ -_frompoint.X /*float*/ ),2)+anywheresoftware.b4a.keywords.Common.Power(anywheresoftware.b4a.keywords.Common.Abs(_topoint.Y /*float*/ -_frompoint.Y /*float*/ ),2)));
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="End Sub";
return 0f;
}
public static String  _dashline(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ImageViewWrapper _vw,xevolution.vrcg.devdemov2400.types._pointapi _frompoint,xevolution.vrcg.devdemov2400.types._pointapi _topoint,float _strokewdt,float _dotspc,int _clr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dashline", false))
	 {return ((String) Debug.delegate(null, "dashline", new Object[] {_ba,_vw,_frompoint,_topoint,_strokewdt,_dotspc,_clr}));}
xevolution.vrcg.devdemov2400.types._pointapi[] _newpt = null;
int _stp = 0;
float _blankspc = 0f;
double _angle = 0;
double _lng = 0;
double _ct = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
anywheresoftware.b4a.agraham.reflection.Reflection _obj1 = null;
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub dashLine(vw As ImageView, fromPoint As";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim NewPt(2) As PointApi";
_newpt = new xevolution.vrcg.devdemov2400.types._pointapi[(int) (2)];
{
int d0 = _newpt.length;
for (int i0 = 0;i0 < d0;i0++) {
_newpt[i0] = new xevolution.vrcg.devdemov2400.types._pointapi();
}
}
;
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Dim stp As Int";
_stp = 0;
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="Dim BlankSpc As Float = 1.75	'Percent";
_blankspc = (float) (1.75);
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="Dim Angle, lng As Double";
_angle = 0;
_lng = 0;
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="Dim ct As Double";
_ct = 0;
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="Dim cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="cvs.Initialize(vw)";
_cvs.Initialize((android.view.View)(_vw.getObject()));
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="Dim Obj1 As Reflector";
_obj1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="Obj1.Target = cvs";
_obj1.Target = (Object)(_cvs);
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="Obj1.Target = Obj1.GetField(\"paint\")";
_obj1.Target = _obj1.GetField("paint");
RDebugUtils.currentLine=14549004;
 //BA.debugLineNum = 14549004;BA.debugLine="Obj1.RunMethod2(\"setAntiAlias\", True, \"java.la";
_obj1.RunMethod2("setAntiAlias",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True),"java.lang.boolean");
RDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="Angle = 90 - CalcAngleD(fromPoint, toPoint)";
_angle = 90-_calcangled(_ba,_frompoint,_topoint);
RDebugUtils.currentLine=14549007;
 //BA.debugLineNum = 14549007;BA.debugLine="lng = Distance(fromPoint, toPoint)";
_lng = _distance(_ba,_frompoint,_topoint);
RDebugUtils.currentLine=14549008;
 //BA.debugLineNum = 14549008;BA.debugLine="If lng < dotSpc * 2.75 Then";
if (_lng<_dotspc*2.75) { 
RDebugUtils.currentLine=14549009;
 //BA.debugLineNum = 14549009;BA.debugLine="cvs.drawline(fromPoint.x, fromPoint.y, toPoint.x";
_cvs.DrawLine(_frompoint.X /*float*/ ,_frompoint.Y /*float*/ ,_topoint.X /*float*/ ,_topoint.Y /*float*/ ,_clr,_strokewdt);
RDebugUtils.currentLine=14549010;
 //BA.debugLineNum = 14549010;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=14549012;
 //BA.debugLineNum = 14549012;BA.debugLine="lng = lng - dotSpc";
_lng = _lng-_dotspc;
RDebugUtils.currentLine=14549013;
 //BA.debugLineNum = 14549013;BA.debugLine="dotSpc = dotSpc * BlankSpc";
_dotspc = (float) (_dotspc*_blankspc);
RDebugUtils.currentLine=14549014;
 //BA.debugLineNum = 14549014;BA.debugLine="stp = lng / dotSpc";
_stp = (int) (_lng/(double)_dotspc);
RDebugUtils.currentLine=14549015;
 //BA.debugLineNum = 14549015;BA.debugLine="dotSpc = lng / stp";
_dotspc = (float) (_lng/(double)_stp);
RDebugUtils.currentLine=14549016;
 //BA.debugLineNum = 14549016;BA.debugLine="lng = lng + dotSpc / 2";
_lng = _lng+_dotspc/(double)2;
RDebugUtils.currentLine=14549017;
 //BA.debugLineNum = 14549017;BA.debugLine="For ct = 0 To lng Step dotSpc";
{
final double step23 = _dotspc;
final double limit23 = _lng;
_ct = 0 ;
for (;(step23 > 0 && _ct <= limit23) || (step23 < 0 && _ct >= limit23) ;_ct = ((double)(0 + _ct + step23))  ) {
RDebugUtils.currentLine=14549018;
 //BA.debugLineNum = 14549018;BA.debugLine="NewPt(0).x   = fromPoint.x + ct * SinD(Angle)";
_newpt[(int) (0)].X /*float*/  = (float) (_frompoint.X /*float*/ +_ct*anywheresoftware.b4a.keywords.Common.SinD(_angle));
RDebugUtils.currentLine=14549019;
 //BA.debugLineNum = 14549019;BA.debugLine="NewPt(0).y = fromPoint.y + ct * CosD(Angle)";
_newpt[(int) (0)].Y /*float*/  = (float) (_frompoint.Y /*float*/ +_ct*anywheresoftware.b4a.keywords.Common.CosD(_angle));
RDebugUtils.currentLine=14549020;
 //BA.debugLineNum = 14549020;BA.debugLine="NewPt(1).x = fromPoint.x + (ct+dotSpc/BlankSpc)";
_newpt[(int) (1)].X /*float*/  = (float) (_frompoint.X /*float*/ +(_ct+_dotspc/(double)_blankspc)*anywheresoftware.b4a.keywords.Common.SinD(_angle));
RDebugUtils.currentLine=14549021;
 //BA.debugLineNum = 14549021;BA.debugLine="NewPt(1).y =  fromPoint.y + (ct+dotSpc/BlankSpc)";
_newpt[(int) (1)].Y /*float*/  = (float) (_frompoint.Y /*float*/ +(_ct+_dotspc/(double)_blankspc)*anywheresoftware.b4a.keywords.Common.CosD(_angle));
RDebugUtils.currentLine=14549022;
 //BA.debugLineNum = 14549022;BA.debugLine="cvs.drawline(NewPt(0).x, NewPt(0).y,NewPt(1).x,";
_cvs.DrawLine(_newpt[(int) (0)].X /*float*/ ,_newpt[(int) (0)].Y /*float*/ ,_newpt[(int) (1)].X /*float*/ ,_newpt[(int) (1)].Y /*float*/ ,_clr,_strokewdt);
 }
};
RDebugUtils.currentLine=14549024;
 //BA.debugLineNum = 14549024;BA.debugLine="End Sub";
return "";
}
public static int  _dbdatacount(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _dbsql,String _script) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dbdatacount", false))
	 {return ((Integer) Debug.delegate(null, "dbdatacount", new Object[] {_ba,_dbsql,_script}));}
int _val = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub DBDataCount(DBSQL As SQL, script As String) As";
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="Dim val As Int = 0";
_val = (int) (0);
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="Dim Record As ResultSet";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="Record = DBSQL.ExecQuery(script)";
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_dbsql.ExecQuery(_script)));
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="val = Record.GetInt(\"COUNTER\")";
_val = _record.GetInt("COUNTER");
 }
;
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="Return val";
if (true) return _val;
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="End Sub";
return 0;
}
public static double  _decimal(anywheresoftware.b4a.BA _ba,double _value,int _decimalplaces) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "decimal", false))
	 {return ((Double) Debug.delegate(null, "decimal", new Object[] {_ba,_value,_decimalplaces}));}
int _multiplier = 0;
int _result = 0;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub Decimal(value As Double, decimalPlaces As Int)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Dim multiplier = Power(10, decimalPlaces) As Int";
_multiplier = (int) (anywheresoftware.b4a.keywords.Common.Power(10,_decimalplaces));
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Dim result = value * multiplier As Int";
_result = (int) (_value*_multiplier);
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="Return (result / multiplier)";
if (true) return (_result/(double)_multiplier);
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="End Sub";
return 0;
}
public static int  _devicetype(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "devicetype", false))
	 {return ((Integer) Debug.delegate(null, "devicetype", new Object[] {_ba}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub DeviceType As Int";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Return Ceil(GetDeviceLayoutValues.ApproximateScre";
if (true) return (int) (anywheresoftware.b4a.keywords.Common.Ceil(anywheresoftware.b4a.keywords.Common.GetDeviceLayoutValues(_ba).getApproximateScreenSize()));
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return 0;
}
public static boolean  _hasfeature(anywheresoftware.b4a.BA _ba,String _feature) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "hasfeature", false))
	 {return ((Boolean) Debug.delegate(null, "hasfeature", new Object[] {_ba,_feature}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub HasFeature(Feature As String) As Boolean";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="r.Target = r.RunMethod(\"getPackageManager\")";
_r.Target = _r.RunMethod("getPackageManager");
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Return r.RunMethod2(\"hasSystemFeature\", Feature,";
if (true) return BA.ObjectToBoolean(_r.RunMethod2("hasSystemFeature",_feature,"java.lang.String"));
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="End Sub";
return false;
}
public static String  _deviceinfostring(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "deviceinfostring", false))
	 {return ((String) Debug.delegate(null, "deviceinfostring", new Object[] {_ba}));}
int _devicescreensize = 0;
String _strdevicetype = "";
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub DeviceInfoString As String";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim DevicescreenSize As Int = 0";
_devicescreensize = (int) (0);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Dim StrDeviceType As String = \"\"";
_strdevicetype = "";
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="DevicescreenSize = DeviceType";
_devicescreensize = _devicetype(_ba);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="If DevicescreenSize < 7 Then";
if (_devicescreensize<7) { 
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="StrDeviceType = \"Smart Phone\"";
_strdevicetype = "Smart Phone";
 }else {
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="StrDeviceType = \"Tablet\"";
_strdevicetype = "Tablet";
 };
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="Return \"Device= \" & StrDeviceType & CRLF & \"Scree";
if (true) return "Device= "+_strdevicetype+anywheresoftware.b4a.keywords.Common.CRLF+"Screen Size= "+BA.NumberToString(_devicescreensize)+anywheresoftware.b4a.keywords.Common.CRLF+"Telephony capable= "+BA.ObjectToString(_hasfeature(_ba,"android.hardware.telephony"));
RDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="End Sub";
return "";
}
public static int  _displaygetrotation(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "displaygetrotation", false))
	 {return ((Integer) Debug.delegate(null, "displaygetrotation", new Object[] {_ba}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub DisplayGetRotation As Int";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="r.Target = r.RunMethod(\"getWindowManager\")";
_r.Target = _r.RunMethod("getWindowManager");
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="r.Target = r.RunMethod(\"getDefaultDisplay\")";
_r.Target = _r.RunMethod("getDefaultDisplay");
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Return r.RunMethod(\"getRotation\")";
if (true) return (int)(BA.ObjectToNumber(_r.RunMethod("getRotation")));
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="End Sub";
return 0;
}
public static String  _dotline(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ImageViewWrapper _vw,xevolution.vrcg.devdemov2400.types._pointapi _frompoint,xevolution.vrcg.devdemov2400.types._pointapi _topoint,float _strokewdt,float _dotspc,int _clr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dotline", false))
	 {return ((String) Debug.delegate(null, "dotline", new Object[] {_ba,_vw,_frompoint,_topoint,_strokewdt,_dotspc,_clr}));}
xevolution.vrcg.devdemov2400.types._pointapi _newpt = null;
int _stp = 0;
double _angle = 0;
double _lng = 0;
double _ct = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
anywheresoftware.b4a.agraham.reflection.Reflection _obj1 = null;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Public Sub dotLine(vw As ImageView, fromPoint As P";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim NewPt As PointApi";
_newpt = new xevolution.vrcg.devdemov2400.types._pointapi();
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Dim stp As Int";
_stp = 0;
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="Dim Angle, lng As Double";
_angle = 0;
_lng = 0;
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="Dim ct As Double";
_ct = 0;
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="Dim cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="cvs.Initialize(vw)";
_cvs.Initialize((android.view.View)(_vw.getObject()));
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="Dim Obj1 As Reflector";
_obj1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="Obj1.Target = cvs";
_obj1.Target = (Object)(_cvs);
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="Obj1.Target = Obj1.GetField(\"paint\")";
_obj1.Target = _obj1.GetField("paint");
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="Obj1.RunMethod2(\"setAntiAlias\", True, \"java.la";
_obj1.RunMethod2("setAntiAlias",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True),"java.lang.boolean");
RDebugUtils.currentLine=14483469;
 //BA.debugLineNum = 14483469;BA.debugLine="Angle =  90 - CalcAngleD(fromPoint, toPoint)";
_angle = 90-_calcangled(_ba,_frompoint,_topoint);
RDebugUtils.currentLine=14483470;
 //BA.debugLineNum = 14483470;BA.debugLine="lng = Distance(fromPoint, toPoint)";
_lng = _distance(_ba,_frompoint,_topoint);
RDebugUtils.currentLine=14483471;
 //BA.debugLineNum = 14483471;BA.debugLine="stp = lng / dotSpc";
_stp = (int) (_lng/(double)_dotspc);
RDebugUtils.currentLine=14483472;
 //BA.debugLineNum = 14483472;BA.debugLine="dotSpc = lng / stp";
_dotspc = (float) (_lng/(double)_stp);
RDebugUtils.currentLine=14483473;
 //BA.debugLineNum = 14483473;BA.debugLine="lng = lng + dotSpc / 4";
_lng = _lng+_dotspc/(double)4;
RDebugUtils.currentLine=14483474;
 //BA.debugLineNum = 14483474;BA.debugLine="For ct = 0 To stp";
{
final double step16 = 1;
final double limit16 = _stp;
_ct = 0 ;
for (;_ct <= limit16 ;_ct = ((double)(0 + _ct + step16))  ) {
RDebugUtils.currentLine=14483475;
 //BA.debugLineNum = 14483475;BA.debugLine="NewPt.x = fromPoint.x + ct * dotSpc * SinD(Angle";
_newpt.X /*float*/  = (float) (_frompoint.X /*float*/ +_ct*_dotspc*anywheresoftware.b4a.keywords.Common.SinD(_angle));
RDebugUtils.currentLine=14483476;
 //BA.debugLineNum = 14483476;BA.debugLine="NewPt.y = fromPoint.y + ct * dotSpc * CosD(An";
_newpt.Y /*float*/  = (float) (_frompoint.Y /*float*/ +_ct*_dotspc*anywheresoftware.b4a.keywords.Common.CosD(_angle));
RDebugUtils.currentLine=14483477;
 //BA.debugLineNum = 14483477;BA.debugLine="cvs.drawCircle(NewPt.x, NewPt.y, strokeWdt / 2,";
_cvs.DrawCircle(_newpt.X /*float*/ ,_newpt.Y /*float*/ ,(float) (_strokewdt/(double)2),_clr,anywheresoftware.b4a.keywords.Common.True,(float) (0));
 }
};
RDebugUtils.currentLine=14483479;
 //BA.debugLineNum = 14483479;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.httpjob  _download(anywheresoftware.b4a.BA _ba,Object _callback,String _link) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "download", false))
	 {return ((xevolution.vrcg.devdemov2400.httpjob) Debug.delegate(null, "download", new Object[] {_ba,_callback,_link}));}
xevolution.vrcg.devdemov2400.httpjob _j = null;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Sub Download (Callback As Object, link As String)";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim j As HttpJob";
_j = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="j.Initialize(\"\", Callback)";
_j._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_callback);
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="j.Download(link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="End Sub";
return null;
}
public static String  _drawpoints(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ImageViewWrapper _vw,xevolution.vrcg.devdemov2400.types._pointapi _frompoint,int _clr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "drawpoints", false))
	 {return ((String) Debug.delegate(null, "drawpoints", new Object[] {_ba,_vw,_frompoint,_clr}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
anywheresoftware.b4a.agraham.reflection.Reflection _obj1 = null;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub drawPoints(vw As ImageView, fromPoint A";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Dim cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="cvs.Initialize(vw)";
_cvs.Initialize((android.view.View)(_vw.getObject()));
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="Dim Obj1 As Reflector";
_obj1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="Obj1.Target = cvs";
_obj1.Target = (Object)(_cvs);
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="Obj1.Target = Obj1.GetField(\"paint\")";
_obj1.Target = _obj1.GetField("paint");
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="Obj1.RunMethod2(\"setAntiAlias\", True, \"java.la";
_obj1.RunMethod2("setAntiAlias",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True),"java.lang.boolean");
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="cvs.DrawLine(fromPoint.x, fromPoint.y - 10, fromP";
_cvs.DrawLine(_frompoint.X /*float*/ ,(float) (_frompoint.Y /*float*/ -10),_frompoint.X /*float*/ ,(float) (_frompoint.Y /*float*/ +10),_clr,(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1))));
RDebugUtils.currentLine=14680074;
 //BA.debugLineNum = 14680074;BA.debugLine="cvs.DrawLine(fromPoint.x - 10, fromPoint.y, fromP";
_cvs.DrawLine((float) (_frompoint.X /*float*/ -10),_frompoint.Y /*float*/ ,(float) (_frompoint.X /*float*/ +10),_frompoint.Y /*float*/ ,_clr,(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1))));
RDebugUtils.currentLine=14680075;
 //BA.debugLineNum = 14680075;BA.debugLine="cvs.drawCircle(fromPoint.x , fromPoint.y, 10, clr";
_cvs.DrawCircle(_frompoint.X /*float*/ ,_frompoint.Y /*float*/ ,(float) (10),_clr,anywheresoftware.b4a.keywords.Common.False,(float) (0.5));
RDebugUtils.currentLine=14680076;
 //BA.debugLineNum = 14680076;BA.debugLine="End Sub";
return "";
}
public static String  _drawtextwithborder2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "drawtextwithborder2", false))
	 {return ((String) Debug.delegate(null, "drawtextwithborder2", new Object[] {_ba,_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _ro = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text A";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
_r.setHeight((float) (_r.getHeight()+(_r.getHeight()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
_r.setWidth((int) (_r.getWidth()+(_r.getWidth()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
_baseline = (int) (_centery-((_r.getHeight()-_fnt.getSize())/(double)2)-_r.getTop());
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="Dim ro As B4XRect";
_ro = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
_ro.Initialize((float) (_r.getLeft()-_border),(float) (_r.getTop()-_border),(float) (_r.getRight()+_border),(float) (_r.getBottom()+_border));
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
_cvs1.DrawRect(_ro,_clr,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
_cvs1.DrawRect(_r,mostCurrent._consts._colorwhite /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
 };
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText((_ba.processBA == null ? _ba : _ba.processBA),_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XCanvas  _dtgeosave2canvas(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XCanvas _cvs,String _la,String _lo) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dtgeosave2canvas", false))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas) Debug.delegate(null, "dtgeosave2canvas", new Object[] {_ba,_cvs,_la,_lo}));}
String _datetimename = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _drect = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub DTGEOSave2Canvas(cvs As B4XCanvas, la As Strin";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Dim DateTimeName As String = $\"${MakeDateTimeSlas";
_datetimename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_makedatetimeslash2(_ba)))+"  -  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_la))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lo))+"");
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCod";
_f = _xui.CreateDefaultFont((float) (mostCurrent._sharecode._device_def_font_size /*int*/ ));
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Dim dRect As B4XRect";
_drect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.T";
_drect.Initialize((float) (_cvs.getTargetRect().getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (_cvs.getTargetRect().getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18))),(float) (_cvs.getTargetRect().getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (350))),_cvs.getTargetRect().getHeight());
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="DrawTextWithBorder2(cvs, DateTimeName, f, Consts.";
_drawtextwithborder2(_ba,_cvs,_datetimename,_f,mostCurrent._consts._colordarkgray /*int*/ ,(int) ((_drect.getLeft()+_drect.getRight())/(double)2),(int) ((_drect.getTop()+_drect.getBottom())/(double)2),(int) (1),(int) (0));
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="Return cvs";
if (true) return _cvs;
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="End Sub";
return null;
}
public static String  _makedatetimeslash2(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "makedatetimeslash2", false))
	 {return ((String) Debug.delegate(null, "makedatetimeslash2", new Object[] {_ba}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub MakeDateTimeSlash2 As String";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="DateTime.DateFormat = \"yyyy/MM/dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy/MM/dd");
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Return $\"$date{DateTime.Now}  -  $time{DateTime.N";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"  -  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="End Sub";
return "";
}
public static long  _dtp(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dtp", false))
	 {return ((Long) Debug.delegate(null, "dtp", new Object[] {_ba,_instr}));}
long _ret = 0L;
anywheresoftware.b4a.objects.collections.List _retl = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub DTP(inStr As String) As Long";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim ret As Long = 0";
_ret = (long) (0);
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Dim retL As List = DTS2LSTS(inStr)";
_retl = new anywheresoftware.b4a.objects.collections.List();
_retl = _dts2lsts(_ba,_instr);
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="If (retL.Size = 1) Then";
if ((_retl.getSize()==1)) { 
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="ret = DateTime.DateParse(retL.Get(0))";
_ret = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(BA.ObjectToString(_retl.Get((int) (0))));
 }else 
{RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="else If (retL.Size = 2) Then";
if ((_retl.getSize()==2)) { 
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="ret = DateTime.DateTimeParse(retL.Get(0), retL.G";
_ret = anywheresoftware.b4a.keywords.Common.DateTime.DateTimeParse(BA.ObjectToString(_retl.Get((int) (0))),BA.ObjectToString(_retl.Get((int) (1))));
 }}
;
RDebugUtils.currentLine=13303816;
 //BA.debugLineNum = 13303816;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="End Sub";
return 0L;
}
public static anywheresoftware.b4a.objects.collections.List  _dts2lsts(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dts2lsts", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "dts2lsts", new Object[] {_ba,_instr}));}
anywheresoftware.b4a.objects.collections.List _spliter = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub DTS2LSTS(inStr As String) As List";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim spliter As List = Regex.Split(\" \", inStr)";
_spliter = new anywheresoftware.b4a.objects.collections.List();
_spliter = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_instr));
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Return spliter";
if (true) return _spliter;
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return null;
}
public static long  _dts2l(anywheresoftware.b4a.BA _ba,String _instr,boolean _istime) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dts2l", false))
	 {return ((Long) Debug.delegate(null, "dts2l", new Object[] {_ba,_instr,_istime}));}
anywheresoftware.b4a.objects.collections.List _spliter = null;
long _ret = 0L;
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub DTS2L(inStr As String, isTime As Boolean) As L";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim spliter As List = Regex.Split(\" \", inStr)";
_spliter = new anywheresoftware.b4a.objects.collections.List();
_spliter = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_instr));
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="Dim ret As Long = 0";
_ret = (long) (0);
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="If (spliter.Size >= 1) Then";
if ((_spliter.getSize()>=1)) { 
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="If Not(isTime) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_istime)) { 
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="ret = DateTime.DateParse(spliter.get(0))";
_ret = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(BA.ObjectToString(_spliter.Get((int) (0))));
 }else {
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="If (spliter.Size = 2) Then";
if ((_spliter.getSize()==2)) { 
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="ret = DateTime.TimeParse(spliter.get(1))";
_ret = anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(BA.ObjectToString(_spliter.Get((int) (1))));
 };
 };
 };
RDebugUtils.currentLine=13107212;
 //BA.debugLineNum = 13107212;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=13107213;
 //BA.debugLineNum = 13107213;BA.debugLine="End Sub";
return 0L;
}
public static anywheresoftware.b4a.objects.collections.List  _dts2lstl(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dts2lstl", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "dts2lstl", new Object[] {_ba,_instr}));}
anywheresoftware.b4a.objects.collections.List _spliter = null;
anywheresoftware.b4a.objects.collections.List _ret = null;
int _n = 0;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub DTS2LSTL(inStr As String) As List";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim spliter As List = Regex.Split(\" \", inStr)";
_spliter = new anywheresoftware.b4a.objects.collections.List();
_spliter = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_instr));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim ret As List : ret.initialize";
_ret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim ret As List : ret.initialize";
_ret.Initialize();
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="For n=0 To spliter.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_spliter.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit4 ;_n = _n + step4 ) {
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="If n=0 Then";
if (_n==0) { 
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="ret.Add(DateTime.DateParse(spliter.get(0)))";
_ret.Add((Object)(anywheresoftware.b4a.keywords.Common.DateTime.DateParse(BA.ObjectToString(_spliter.Get((int) (0))))));
 }else {
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="ret.Add(DateTime.TimeParse(spliter.get(1)))";
_ret.Add((Object)(anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(BA.ObjectToString(_spliter.Get((int) (1))))));
 };
 }
};
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="End Sub";
return null;
}
public static String  _dtsbtw(anywheresoftware.b4a.BA _ba,String _instr1,String _instr2) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dtsbtw", false))
	 {return ((String) Debug.delegate(null, "dtsbtw", new Object[] {_ba,_instr1,_instr2}));}
String _ret = "";
b4a.example.dateutils._period _per = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub DTSBTW(inStr1 As String, inStr2 As String) As";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="If NNE(inStr1) And NNE(inStr2) Then";
if (_nne(_ba,_instr1) && _nne(_ba,_instr2)) { 
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="Dim per As Period = DateUtils.PeriodBetween(DTP(";
_per = mostCurrent._dateutils._periodbetween(_ba,_dtp(_ba,_instr1),_dtp(_ba,_instr2));
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="Dim ret As String = $\"${per.Minutes}:${per.Secon";
_ret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_per.Minutes))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_per.Seconds))+"");
 };
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="End Sub";
return "";
}
public static String  _dtsbtwl(anywheresoftware.b4a.BA _ba,long _inval1,long _inval2) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "dtsbtwl", false))
	 {return ((String) Debug.delegate(null, "dtsbtwl", new Object[] {_ba,_inval1,_inval2}));}
String _ret = "";
b4a.example.dateutils._period _per = null;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub DTSBTWL(inVal1 As Long, inVal2 As Long) As Str";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Dim per As Period = DateUtils.PeriodBetween(inVal";
_per = mostCurrent._dateutils._periodbetween(_ba,_inval1,_inval2);
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Dim ret As String = $\"${per.Minutes}:${per.Second";
_ret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_per.Minutes))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_per.Seconds))+"");
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(anywheresoftware.b4a.BA _ba,String _f) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "escapefield", false))
	 {return ((String) Debug.delegate(null, "escapefield", new Object[] {_ba,_f}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public static String  _esmtpreturn_messagesent(anywheresoftware.b4a.BA _ba,boolean _success) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "esmtpreturn_messagesent", false))
	 {return ((String) Debug.delegate(null, "esmtpreturn_messagesent", new Object[] {_ba,_success}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub eSMTPReturn_MessageSent(Success As Boolean)";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Log(\"SMTP send: \" & Success )";
anywheresoftware.b4a.keywords.Common.LogImpl("614942209","SMTP send: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="ToastMessageShow(\"Email Enviado !\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Email Enviado !"),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=14942219;
 //BA.debugLineNum = 14942219;BA.debugLine="ToastMessageShow(\"Email NÃO enviado !\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Email NÃO enviado !"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14942223;
 //BA.debugLineNum = 14942223;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("614942223",anywheresoftware.b4a.keywords.Common.LastException(_ba).getMessage(),0);
 };
RDebugUtils.currentLine=14942225;
 //BA.debugLineNum = 14942225;BA.debugLine="End Sub";
return "";
}
public static boolean  _fieldinlist(anywheresoftware.b4a.BA _ba,String _do_field,String _inlist) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "fieldinlist", false))
	 {return ((Boolean) Debug.delegate(null, "fieldinlist", new Object[] {_ba,_do_field,_inlist}));}
boolean _ret = false;
anywheresoftware.b4a.objects.collections.List _lista = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub FieldInList(do_field As String, inList As Stri";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="If (NNE(do_field) And NNE(inList)) Then";
if ((_nne(_ba,_do_field) && _nne(_ba,_inlist))) { 
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim Lista As List = Regex.Split(\"\\|\", inList )";
_lista = new anywheresoftware.b4a.objects.collections.List();
_lista = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_inlist));
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="ret = (Lista.IndexOf(do_field) >= 0)";
_ret = (_lista.IndexOf((Object)(_do_field))>=0);
 };
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="End Sub";
return false;
}
public static String  _fieldresultset2sqlarray(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inlist,String _infield) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "fieldresultset2sqlarray", false))
	 {return ((String) Debug.delegate(null, "fieldresultset2sqlarray", new Object[] {_ba,_inlist,_infield}));}
String _sret = "";
String _tgcode = "";
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub FieldResultSet2SQLArray(inList As ResultSet, i";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim sRet As String = \"\"";
_sret = "";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Do While inList.NextRow";
while (_inlist.NextRow()) {
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Dim TgCode As String = inList.GetString(inField)";
_tgcode = _inlist.GetString(_infield);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="If (NNE(sRet)) Then";
if ((_nne(_ba,_sret))) { 
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="sRet = $\"${sRet},\"$";
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+",");
 };
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="sRet = $\"${sRet}'${TgCode}'\"$";
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+"'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tgcode))+"'");
 }
;
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="If (NNE(sRet)) Then";
if ((_nne(_ba,_sret))) { 
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="sRet = $\"(${sRet})\"$";
_sret = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+")");
 }else {
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="sRet = $\"('')\"$";
_sret = ("('')");
 };
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="Return sRet";
if (true) return _sret;
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="End Sub";
return "";
}
public static Object  _findkeyforvalue(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _m,Object _v) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "findkeyforvalue", false))
	 {return ((Object) Debug.delegate(null, "findkeyforvalue", new Object[] {_ba,_m,_v}));}
Object _k = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub FindKeyForValue(m As Map, v As Object) As Obje";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="For Each k As Object In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = group1.Get(index1);
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="If m.Get(k) = v Then Return k";
if ((_m.Get(_k)).equals(_v)) { 
if (true) return _k;};
 }
};
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Return \"\"";
if (true) return (Object)("");
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="End Sub";
return null;
}
public static String  _formatfilesize(anywheresoftware.b4a.BA _ba,float _bytes) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "formatfilesize", false))
	 {return ((String) Debug.delegate(null, "formatfilesize", new Object[] {_ba,_bytes}));}
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," Kb"," Mb"," Gb"," Tb"," Pb"," Eb"," Zb"," Yb"};
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="Private I As Int";
_i = 0;
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="Return NumberFormat(Si, 1, 1) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (1))+_unit[_i];
 };
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _formulainblocks(anywheresoftware.b4a.BA _ba,String _formula) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "formulainblocks", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "formulainblocks", new Object[] {_ba,_formula}));}
anywheresoftware.b4a.objects.collections.List _blocks = null;
anywheresoftware.b4a.objects.collections.List _blocksand = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _blocksor = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub FormulaInBlocks(Formula As String) As List";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim Blocks As List : Blocks.initialize";
_blocks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim Blocks As List : Blocks.initialize";
_blocks.Initialize();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim BlocksAnd As List = Regex.Split(\"\\&&\", Formul";
_blocksand = new anywheresoftware.b4a.objects.collections.List();
_blocksand = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\&&",_formula));
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="If (BlocksAnd.Size >0) Then";
if ((_blocksand.getSize()>0)) { 
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="For i = 0 To BlocksAnd.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (_blocksand.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Dim BlocksOr As List = Regex.Split(\"\\|\\|\", Bloc";
_blocksor = new anywheresoftware.b4a.objects.collections.List();
_blocksor = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|\\|",BA.ObjectToString(_blocksand.Get(_i))));
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="If (BlocksOr.Size >0) Then";
if ((_blocksor.getSize()>0)) { 
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Blocks.AddAll(BlocksOr)";
_blocks.AddAll(_blocksor);
 }else {
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="Blocks.Add(BlocksAnd.Get(i))";
_blocks.Add(_blocksand.Get(_i));
 };
 }
};
 }else {
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="Dim BlocksOr As List = Regex.Split(\"\\|\\|\", Formu";
_blocksor = new anywheresoftware.b4a.objects.collections.List();
_blocksor = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|\\|",_formula));
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="If (BlocksOr.Size >0) Then";
if ((_blocksor.getSize()>0)) { 
RDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="For i = 0 To BlocksOr.Size-1";
{
final int step16 = 1;
final int limit16 = (int) (_blocksor.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="Blocks.Add(BlocksOr.Get(i))";
_blocks.Add(_blocksor.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=3735571;
 //BA.debugLineNum = 3735571;BA.debugLine="Blocks.Add(Formula)";
_blocks.Add((Object)(_formula));
 };
 };
RDebugUtils.currentLine=3735574;
 //BA.debugLineNum = 3735574;BA.debugLine="Return Blocks";
if (true) return _blocks;
RDebugUtils.currentLine=3735575;
 //BA.debugLineNum = 3735575;BA.debugLine="End Sub";
return null;
}
public static String  _randomint2(anywheresoftware.b4a.BA _ba,int _length) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "randomint2", false))
	 {return ((String) Debug.delegate(null, "randomint2", new Object[] {_ba,_length}));}
String _abc = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _randomstr = null;
int _i = 0;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub RandomInt2(length As Int) As String";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim abc As String = \"0123456789\"";
_abc = "0123456789";
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim RandomStr As StringBuilder";
_randomstr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="RandomStr.Initialize";
_randomstr.Initialize();
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="For i = 0 To length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))";
_randomstr.Append(BA.ObjectToString(_abc.charAt(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),_abc.length()))));
 }
};
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="Return RandomStr.ToString";
if (true) return _randomstr.ToString();
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getalltablabels(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getalltablabels", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getalltablabels", new Object[] {_ba,_tabstrip}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.PanelWrapper _tc = null;
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub GetAllTabLabels (tabstrip As TabStrip)";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="r.Target = jo.GetField(\"tabStrip\")";
_r.Target = _jo.GetField("tabStrip");
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="Dim tc As Panel = r.GetField(\"tabsContainer\")";
_tc = new anywheresoftware.b4a.objects.PanelWrapper();
_tc = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_r.GetField("tabsContainer")));
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="For Each v As View In tc";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tc;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group7.Get(index7)));
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="If v Is Label Then res.Add(v)";
if (_v.getObjectOrNull() instanceof android.widget.TextView) { 
_res.Add((Object)(_v.getObject()));};
 }
};
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getalltabpanels(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.TabStripViewPager _tabstrip) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getalltabpanels", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getalltabpanels", new Object[] {_ba,_tabstrip}));}
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.PanelWrapper _tc = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub GetAllTabPanels (tabstrip As TabStrip)";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Dim jo As JavaObject = tabstrip";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tabstrip));
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="r.Target = jo.GetField(\"tabStrip\")";
_r.Target = _jo.GetField("tabStrip");
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="Dim tc As Panel = r.GetField(\"tabsContainer\")";
_tc = new anywheresoftware.b4a.objects.PanelWrapper();
_tc = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_r.GetField("tabsContainer")));
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="For Each v As View In tc";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group9 = _tc;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group9.Get(index9)));
RDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="If v Is Panel Then res.Add(v)";
if (_v.getObjectOrNull() instanceof android.view.ViewGroup) { 
_res.Add((Object)(_v.getObject()));};
 }
};
RDebugUtils.currentLine=11337748;
 //BA.debugLineNum = 11337748;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=11337749;
 //BA.debugLineNum = 11337749;BA.debugLine="End Sub";
return null;
}
public static String  _getappname(anywheresoftware.b4a.BA _ba,boolean _upper) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getappname", false))
	 {return ((String) Debug.delegate(null, "getappname", new Object[] {_ba,_upper}));}
Object _name = null;
String _sname = "";
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Sub GetAppName(Upper As Boolean) As String";
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="Dim name As Object = Application.LabelName";
_name = (Object)(anywheresoftware.b4a.keywords.Common.Application.getLabelName());
RDebugUtils.currentLine=15597576;
 //BA.debugLineNum = 15597576;BA.debugLine="If (Upper) Then";
if ((_upper)) { 
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="Dim sName As String = name";
_sname = BA.ObjectToString(_name);
RDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="Return sName.ToUpperCase";
if (true) return _sname.toUpperCase();
 }else {
RDebugUtils.currentLine=15597580;
 //BA.debugLineNum = 15597580;BA.debugLine="Return name";
if (true) return BA.ObjectToString(_name);
 };
RDebugUtils.currentLine=15597582;
 //BA.debugLineNum = 15597582;BA.debugLine="End Sub";
return "";
}
public static String  _getaspriority(anywheresoftware.b4a.BA _ba,int _id) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getaspriority", false))
	 {return ((String) Debug.delegate(null, "getaspriority", new Object[] {_ba,_id}));}
String _retstr = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrecord = null;
String _ssql = "";
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub getASPriority(id As Int) As String";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Dim retStr As String = \"\"";
_retstr = "";
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Private inRecord As ResultSet";
_inrecord = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Dim sSQL As String = $\"select tagcode from type_p";
_ssql = ("select tagcode from type_prioritytypes where id="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_id))+"");
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="inRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_inrecord = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="Do While inRecord.NextRow";
while (_inrecord.NextRow()) {
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="retStr = inRecord.GetString(\"tagcode\")";
_retstr = _inrecord.GetString("tagcode");
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="inRecord.Close";
_inrecord.Close();
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="Return retStr";
if (true) return _retstr;
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="End Sub";
return "";
}
public static String  _getasstatus(anywheresoftware.b4a.BA _ba,int _id) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getasstatus", false))
	 {return ((String) Debug.delegate(null, "getasstatus", new Object[] {_ba,_id}));}
String _retstr = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
String _ssql = "";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub getASStatus(id As Int) As String";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Dim retStr As String = \"\"";
_retstr = "";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Private Record As ResultSet";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Dim sSQL As String = $\"select tagcode from type_o";
_ssql = ("select tagcode from type_operationtypes where id="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_id))+"");
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="retStr = Record.GetString(\"tagcode\")";
_retstr = _record.GetString("tagcode");
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="Return retStr";
if (true) return _retstr;
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="End Sub";
return "";
}
public static String  _getasurgency(anywheresoftware.b4a.BA _ba,int _id) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getasurgency", false))
	 {return ((String) Debug.delegate(null, "getasurgency", new Object[] {_ba,_id}));}
String _retstr = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
String _ssql = "";
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub getASUrgency(id As Int) As String";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim retStr As String = \"\"";
_retstr = "";
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Private Record As ResultSet";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="Dim sSQL As String = $\"select tagcode from type_g";
_ssql = ("select tagcode from type_gravitytypes where id="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_id))+"");
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="retStr = Record.GetString(\"tagcode\")";
_retstr = _record.GetString("tagcode");
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="Exit";
if (true) break;
 }
;
RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="Return retStr";
if (true) return _retstr;
RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="End Sub";
return "";
}
public static int  _getcolorbyname(anywheresoftware.b4a.BA _ba,String _colorname) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcolorbyname", false))
	 {return ((Integer) Debug.delegate(null, "getcolorbyname", new Object[] {_ba,_colorname}));}
int _colorret = 0;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub GetColorByName(colorname As String) As Int";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Select Case colorname.ToLowerCase";
switch (BA.switchObjectToInt(_colorname.toLowerCase(),"white","black","red","green","blue","yellow","lightgray")) {
case 0: {
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim ColorRet As Int = Colors.White";
_colorret = anywheresoftware.b4a.keywords.Common.Colors.White;
 break; }
case 1: {
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Dim ColorRet As Int = Colors.Black";
_colorret = anywheresoftware.b4a.keywords.Common.Colors.Black;
 break; }
case 2: {
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Dim ColorRet As Int = Colors.Red";
_colorret = anywheresoftware.b4a.keywords.Common.Colors.Red;
 break; }
case 3: {
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Dim ColorRet As Int = Colors.Green";
_colorret = anywheresoftware.b4a.keywords.Common.Colors.Green;
 break; }
case 4: {
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="Dim ColorRet As Int = Colors.Blue";
_colorret = anywheresoftware.b4a.keywords.Common.Colors.Blue;
 break; }
case 5: {
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Dim ColorRet As Int = Colors.Yellow";
_colorret = anywheresoftware.b4a.keywords.Common.Colors.Yellow;
 break; }
case 6: {
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="Dim ColorRet As Int = Colors.LightGray";
_colorret = anywheresoftware.b4a.keywords.Common.Colors.LightGray;
 break; }
default: {
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="Dim ColorRet As Int = Colors.Black";
_colorret = anywheresoftware.b4a.keywords.Common.Colors.Black;
 break; }
}
;
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="Return ColorRet";
if (true) return _colorret;
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="End Sub";
return 0;
}
public static String  _getcurrdatetimeext(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrdatetimeext", false))
	 {return ((String) Debug.delegate(null, "getcurrdatetimeext", new Object[] {_ba}));}
String _datename = "";
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub GetCurrDatetimeExt As String";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now} $t";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Return DateName";
if (true) return _datename;
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrdatetimefixed(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrdatetimefixed", false))
	 {return ((String) Debug.delegate(null, "getcurrdatetimefixed", new Object[] {_ba}));}
String _datename = "";
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub GetCurrDatetimeFixed As String";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now} 00";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+" 00:00:01");
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Return DateName";
if (true) return _datename;
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrdatetimeformat(anywheresoftware.b4a.BA _ba,String _formdate,String _formtime,boolean _space) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrdatetimeformat", false))
	 {return ((String) Debug.delegate(null, "getcurrdatetimeformat", new Object[] {_ba,_formdate,_formtime,_space}));}
String _ret = "";
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub GetCurrDatetimeFormat(formDate As String, form";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="DateTime.DateFormat = formDate";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_formdate);
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="DateTime.TimeFormat = formTime";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat(_formtime);
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="If space Then ret = \" \"";
if (_space) { 
_ret = " ";};
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="ret = $\"${DateTime.Date(DateTime.Now)}${ret}${Dat";
_ret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ret))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())))+"");
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrdatetimefrom(anywheresoftware.b4a.BA _ba,String _fromdate,String _fromtime) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrdatetimefrom", false))
	 {return ((String) Debug.delegate(null, "getcurrdatetimefrom", new Object[] {_ba,_fromdate,_fromtime}));}
String _ret = "";
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub GetCurrDatetimeFrom(fromDate As String, fromTi";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="ret = $\"${fromDate} ${fromTime}\"$";
_ret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fromdate))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fromtime))+"");
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrdatetimet2(anywheresoftware.b4a.BA _ba,String _separator) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrdatetimet2", false))
	 {return ((String) Debug.delegate(null, "getcurrdatetimet2", new Object[] {_ba,_separator}));}
String _datename = "";
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Sub GetCurrDatetimeT2(Separator As String) As Stri";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="If (Separator = \"\") Then Separator = \" \"";
if (((_separator).equals(""))) { 
_separator = " ";};
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="DateTime.TimeFormat = \"HHmm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmm");
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now}${S";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_separator))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Return DateName";
if (true) return _datename;
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrdatetimet2ext(anywheresoftware.b4a.BA _ba,String _separator) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrdatetimet2ext", false))
	 {return ((String) Debug.delegate(null, "getcurrdatetimet2ext", new Object[] {_ba,_separator}));}
String _datename = "";
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub GetCurrDatetimeT2Ext(Separator As String) As S";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmmss");
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now}${S";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_separator))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Return DateName";
if (true) return _datename;
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrentdateformat(anywheresoftware.b4a.BA _ba,String _form) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrentdateformat", false))
	 {return ((String) Debug.delegate(null, "getcurrentdateformat", new Object[] {_ba,_form}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub GetCurrentDateFormat(form As String) As String";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="DateTime.DateFormat = form";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_form);
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Return DateTime.Date(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrenttime(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrenttime", false))
	 {return ((String) Debug.delegate(null, "getcurrenttime", new Object[] {_ba}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub GetCurrentTime As String";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Return DateTime.Time(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrenttimeext(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrenttimeext", false))
	 {return ((String) Debug.delegate(null, "getcurrenttimeext", new Object[] {_ba}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub GetCurrentTimeExt As String";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Return DateTime.Time(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrenttimeext2(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getcurrenttimeext2", false))
	 {return ((String) Debug.delegate(null, "getcurrenttimeext2", new Object[] {_ba}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub GetCurrentTimeExt2 As String";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmmss");
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Return DateTime.Time(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="End Sub";
return "";
}
public static String  _getdate(anywheresoftware.b4a.BA _ba,long _dt) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getdate", false))
	 {return ((String) Debug.delegate(null, "getdate", new Object[] {_ba,_dt}));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub GetDate(dt As Long) As String";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Return DateTime.Date(dt)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_dt);
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="End Sub";
return "";
}
public static String  _getdateformat(anywheresoftware.b4a.BA _ba,long _dt,String _form) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getdateformat", false))
	 {return ((String) Debug.delegate(null, "getdateformat", new Object[] {_ba,_dt,_form}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub GetDateFormat(dt As Long, form As String) As S";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="DateTime.DateFormat = form";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_form);
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Return DateTime.Date(dt)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_dt);
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="End Sub";
return "";
}
public static int  _getdevicetype(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getdevicetype", false))
	 {return ((Integer) Debug.delegate(null, "getdevicetype", new Object[] {_ba}));}
anywheresoftware.b4a.keywords.LayoutValues _layval = null;
int _rot = 0;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub GetDeviceType As Int";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Dim LayVal As LayoutValues = GetDeviceLayoutValue";
_layval = anywheresoftware.b4a.keywords.Common.GetDeviceLayoutValues(_ba);
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Dim Rot As Int = DisplayGetRotation";
_rot = _displaygetrotation(_ba);
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="If LayVal.Height = LayVal.Width Then";
if (_layval.Height==_layval.Width) { 
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="Return 2";
if (true) return (int) (2);
 }else 
{RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Else If Rot = 0 Or Rot = 2 Then";
if (_rot==0 || _rot==2) { 
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="If LayVal.Height > LayVal.Width Then Return 0";
if (_layval.Height>_layval.Width) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="Return 1";
if (true) return (int) (1);
 }else {
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="If LayVal.Height < LayVal.Width Then Return 0";
if (_layval.Height<_layval.Width) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="Return 1";
if (true) return (int) (1);
 }}
;
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="End Sub";
return 0;
}
public static String  _getdoctype(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getdoctype", false))
	 {return ((String) Debug.delegate(null, "getdoctype", new Object[] {_ba,_filename}));}
String _doc = "";
String _docx = "";
String _pdf = "";
String _ppt = "";
String _pptx = "";
String _xls = "";
String _xlsx = "";
String _png = "";
String _jpeg = "";
String _jpg = "";
String _txt = "";
String _gif = "";
String _zip = "";
String _rar = "";
String _rtf = "";
String _wav = "";
String _mp3 = "";
String _ext = "";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub GetDocType(FileName As String) As String";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim DOC As String = \".doc\"";
_doc = ".doc";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim DOCX As String = \".docx\"";
_docx = ".docx";
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Dim PDF As String = \".pdf\"";
_pdf = ".pdf";
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Dim PPT As String = \".ppt\"";
_ppt = ".ppt";
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Dim PPTX As String = \".pptx\"";
_pptx = ".pptx";
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="Dim XLS As String = \".xls\"";
_xls = ".xls";
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="Dim XLSX As String = \".xlsx\"";
_xlsx = ".xlsx";
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="Dim PNG As String = \".png\"";
_png = ".png";
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="Dim JPEG As String = \".jpeg\"";
_jpeg = ".jpeg";
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="Dim JPG As String = \".jpg\"";
_jpg = ".jpg";
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="Dim TXT As String = \".txt\"";
_txt = ".txt";
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="Dim GIF As String = \".gif\"";
_gif = ".gif";
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="Dim ZIP As String = \".zip\"";
_zip = ".zip";
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="Dim RAR As String = \".rar\"";
_rar = ".rar";
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="Dim RTF As String = \".rtf\"";
_rtf = ".rtf";
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="Dim WAV As String = \".wav\"";
_wav = ".wav";
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="Dim MP3 As String = \".mp3\"";
_mp3 = ".mp3";
RDebugUtils.currentLine=7012371;
 //BA.debugLineNum = 7012371;BA.debugLine="Dim Ext As String = GetFileExt(FileName)";
_ext = _getfileext(_ba,_filename);
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="If(Ext.EqualsIgnoreCase(DOC) Or Ext.EqualsIgnoreC";
if ((_ext.equalsIgnoreCase(_doc) || _ext.equalsIgnoreCase(_docx))) { 
RDebugUtils.currentLine=7012374;
 //BA.debugLineNum = 7012374;BA.debugLine="Return \"application/msword\"";
if (true) return "application/msword";
 }else 
{RDebugUtils.currentLine=7012375;
 //BA.debugLineNum = 7012375;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(PDF)) Then";
if ((_ext.equalsIgnoreCase(_pdf))) { 
RDebugUtils.currentLine=7012376;
 //BA.debugLineNum = 7012376;BA.debugLine="Return \"application/pdf\"";
if (true) return "application/pdf";
 }else 
{RDebugUtils.currentLine=7012377;
 //BA.debugLineNum = 7012377;BA.debugLine="Else If(Ext.EqualsIgnoreCase(PPT) Or Ext.EqualsIg";
if ((_ext.equalsIgnoreCase(_ppt) || _ext.equalsIgnoreCase(_pptx))) { 
RDebugUtils.currentLine=7012378;
 //BA.debugLineNum = 7012378;BA.debugLine="Return \"application/vnd.ms-powerpoint\"";
if (true) return "application/vnd.ms-powerpoint";
 }else 
{RDebugUtils.currentLine=7012379;
 //BA.debugLineNum = 7012379;BA.debugLine="Else If(Ext.EqualsIgnoreCase(XLS) Or Ext.EqualsIg";
if ((_ext.equalsIgnoreCase(_xls) || _ext.equalsIgnoreCase(_xlsx))) { 
RDebugUtils.currentLine=7012380;
 //BA.debugLineNum = 7012380;BA.debugLine="Return \"application/vnd.ms-excel\"";
if (true) return "application/vnd.ms-excel";
 }else 
{RDebugUtils.currentLine=7012381;
 //BA.debugLineNum = 7012381;BA.debugLine="Else If(Ext.EqualsIgnoreCase(PNG) Or Ext.EqualsIg";
if ((_ext.equalsIgnoreCase(_png) || _ext.equalsIgnoreCase(_jpeg) || _ext.equalsIgnoreCase(_jpg))) { 
RDebugUtils.currentLine=7012382;
 //BA.debugLineNum = 7012382;BA.debugLine="Return \"image/jpeg\"";
if (true) return "image/jpeg";
 }else 
{RDebugUtils.currentLine=7012383;
 //BA.debugLineNum = 7012383;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(TXT)) Then";
if ((_ext.equalsIgnoreCase(_txt))) { 
RDebugUtils.currentLine=7012384;
 //BA.debugLineNum = 7012384;BA.debugLine="Return \"text/plain\"";
if (true) return "text/plain";
 }else 
{RDebugUtils.currentLine=7012385;
 //BA.debugLineNum = 7012385;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(GIF)) Then";
if ((_ext.equalsIgnoreCase(_gif))) { 
RDebugUtils.currentLine=7012386;
 //BA.debugLineNum = 7012386;BA.debugLine="Return \"image/gif\"";
if (true) return "image/gif";
 }else 
{RDebugUtils.currentLine=7012387;
 //BA.debugLineNum = 7012387;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(ZIP)) Then";
if ((_ext.equalsIgnoreCase(_zip))) { 
RDebugUtils.currentLine=7012388;
 //BA.debugLineNum = 7012388;BA.debugLine="Return \"application/zip\"";
if (true) return "application/zip";
 }else 
{RDebugUtils.currentLine=7012389;
 //BA.debugLineNum = 7012389;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(RAR)) Then";
if ((_ext.equalsIgnoreCase(_rar))) { 
RDebugUtils.currentLine=7012390;
 //BA.debugLineNum = 7012390;BA.debugLine="Return \"application/x-rar-compressed\"";
if (true) return "application/x-rar-compressed";
 }else 
{RDebugUtils.currentLine=7012391;
 //BA.debugLineNum = 7012391;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(RTF)) Then";
if ((_ext.equalsIgnoreCase(_rtf))) { 
RDebugUtils.currentLine=7012392;
 //BA.debugLineNum = 7012392;BA.debugLine="Return \"application/rtf\"";
if (true) return "application/rtf";
 }else 
{RDebugUtils.currentLine=7012393;
 //BA.debugLineNum = 7012393;BA.debugLine="Else If(Ext.EqualsIgnoreCase(WAV) Or Ext.EqualsIg";
if ((_ext.equalsIgnoreCase(_wav) || _ext.equalsIgnoreCase(_mp3))) { 
RDebugUtils.currentLine=7012394;
 //BA.debugLineNum = 7012394;BA.debugLine="Return \"audio/x-wav\"";
if (true) return "audio/x-wav";
 }}}}}}}}}}}
;
RDebugUtils.currentLine=7012396;
 //BA.debugLineNum = 7012396;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=7012397;
 //BA.debugLineNum = 7012397;BA.debugLine="End Sub";
return "";
}
public static String  _getfileext(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getfileext", false))
	 {return ((String) Debug.delegate(null, "getfileext", new Object[] {_ba,_filename}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub GetFileExt(FileName As String) As String";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="If NNE(FileName) Then";
if (_nne(_ba,_filename)) { 
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Return FileName.SubString2(FileName.LastIndexof(";
if (true) return _filename.substring(_filename.lastIndexOf("."),_filename.length());
 }else {
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="End Sub";
return "";
}
public static String  _getfreemem(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getfreemem", false))
	 {return ((String) Debug.delegate(null, "getfreemem", new Object[] {_ba}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub GetFreeMem As String";
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="Return \"\" '\"F:\" & Round2(FM,2) & \",  T:\" & Round2";
if (true) return "";
RDebugUtils.currentLine=14745620;
 //BA.debugLineNum = 14745620;BA.debugLine="End Sub";
return "";
}
public static String  _getgeolocationformat(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getgeolocationformat", false))
	 {return ((String) Debug.delegate(null, "getgeolocationformat", new Object[] {_ba}));}
String _saclalatitude = "";
String _saclalongitude = "";
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub getGeoLocationFormat As String";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Private sACLALatitude As String = \"\"";
_saclalatitude = "";
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Private sACLALongitude As String = \"\"";
_saclalongitude = "";
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="If Not(isNullOrEmpty(LocationService.GeoLocal.lat";
if (anywheresoftware.b4a.keywords.Common.Not(_isnullorempty(_ba,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ))) { 
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="Try";
try {RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="sACLALatitude = LocationService.GeoLocal.lat";
_saclalatitude = mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ;
 } 
       catch (Exception e7) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e7);RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("65767175",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=5767179;
 //BA.debugLineNum = 5767179;BA.debugLine="If Not(isNullOrEmpty(LocationService.GeoLocal.lon";
if (anywheresoftware.b4a.keywords.Common.Not(_isnullorempty(_ba,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ))) { 
RDebugUtils.currentLine=5767180;
 //BA.debugLineNum = 5767180;BA.debugLine="Try";
try {RDebugUtils.currentLine=5767181;
 //BA.debugLineNum = 5767181;BA.debugLine="sACLALongitude = LocationService.GeoLocal.lon";
_saclalongitude = mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ;
 } 
       catch (Exception e15) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e15);RDebugUtils.currentLine=5767183;
 //BA.debugLineNum = 5767183;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("65767183",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=5767184;
 //BA.debugLineNum = 5767184;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=5767187;
 //BA.debugLineNum = 5767187;BA.debugLine="Return $\"${sACLALatitude},${sACLALongitude}\"$";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_saclalatitude))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_saclalongitude))+"");
RDebugUtils.currentLine=5767188;
 //BA.debugLineNum = 5767188;BA.debugLine="End Sub";
return "";
}
public static String  _getintentfiletype(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getintentfiletype", false))
	 {return ((String) Debug.delegate(null, "getintentfiletype", new Object[] {_ba,_filename}));}
String _filetype = "";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub GetIntentFileType(filename As String)";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim Filetype As String";
_filetype = "";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Filetype = filename.Substring(filename.LastIndexO";
_filetype = _filename.substring((int) (_filename.lastIndexOf(".")+1));
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Log(filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("66946819",_filename,0);
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="Select Filetype";
switch (BA.switchObjectToInt(_filetype,"doc","docx","jpg","mp3","mpeg","ppt","pptx","pdf","xls","xlsx","txt","xml")) {
case 0: {
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="Return \"application/msword\"";
if (true) return "application/msword";
 break; }
case 1: {
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="Return \"application/vnd.openxmlformats-officedo";
if (true) return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
 break; }
case 2: {
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="Return \"image/jpeg\"";
if (true) return "image/jpeg";
 break; }
case 3: {
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="Return \"audio/mpeg\"";
if (true) return "audio/mpeg";
 break; }
case 4: {
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="Return \"video/mpeg\"";
if (true) return "video/mpeg";
 break; }
case 5: {
RDebugUtils.currentLine=6946833;
 //BA.debugLineNum = 6946833;BA.debugLine="Return \"application/vnd.ms-powerpointtd>\"";
if (true) return "application/vnd.ms-powerpointtd>";
 break; }
case 6: {
RDebugUtils.currentLine=6946835;
 //BA.debugLineNum = 6946835;BA.debugLine="Return \"application/vnd.openxmlformats-officedo";
if (true) return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
 break; }
case 7: {
RDebugUtils.currentLine=6946837;
 //BA.debugLineNum = 6946837;BA.debugLine="Return \"application/pdf\"";
if (true) return "application/pdf";
 break; }
case 8: {
RDebugUtils.currentLine=6946839;
 //BA.debugLineNum = 6946839;BA.debugLine="Return \"application/vnd.ms-excel\"";
if (true) return "application/vnd.ms-excel";
 break; }
case 9: {
RDebugUtils.currentLine=6946841;
 //BA.debugLineNum = 6946841;BA.debugLine="Return \"application/vnd.openxmlformats-officedo";
if (true) return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
 break; }
case 10: {
RDebugUtils.currentLine=6946843;
 //BA.debugLineNum = 6946843;BA.debugLine="Return \"text/plain\"";
if (true) return "text/plain";
 break; }
case 11: {
RDebugUtils.currentLine=6946845;
 //BA.debugLineNum = 6946845;BA.debugLine="Return \"application/xml\"";
if (true) return "application/xml";
 break; }
default: {
RDebugUtils.currentLine=6946847;
 //BA.debugLineNum = 6946847;BA.debugLine="Return \"application/vnd.android.package-archive";
if (true) return "application/vnd.android.package-archive";
 break; }
}
;
RDebugUtils.currentLine=6946849;
 //BA.debugLineNum = 6946849;BA.debugLine="End Sub";
return "";
}
public static String  _getlast60days(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlast60days", false))
	 {return ((String) Debug.delegate(null, "getlast60days", new Object[] {_ba}));}
b4a.example.dateutils._period _p60 = null;
long _newdate = 0L;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub GetLast60Days As String";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Dim p60 As Period";
_p60 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="p60.days = -60";
_p60.Days = (int) (-60);
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="Dim NewDate As Long = DateUtils.AddPeriod(DateTim";
_newdate = mostCurrent._dateutils._addperiod(_ba,anywheresoftware.b4a.keywords.Common.DateTime.getNow(),_p60);
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="Return $\"$date{NewDate} 00:10\"$";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(_newdate))+" 00:10");
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="End Sub";
return "";
}
public static String  _getlastmonthdate(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlastmonthdate", false))
	 {return ((String) Debug.delegate(null, "getlastmonthdate", new Object[] {_ba}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub GetLastMonthDate As String";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="Return DateTime.Date(GetLastMonthDateLong)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_getlastmonthdatelong(_ba));
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="End Sub";
return "";
}
public static long  _getlastmonthdatelong(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlastmonthdatelong", false))
	 {return ((Long) Debug.delegate(null, "getlastmonthdatelong", new Object[] {_ba}));}
long _currentdate = 0L;
long _lastmonthdate = 0L;
b4a.example.dateutils._period _p1 = null;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub GetLastMonthDateLong As Long";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
_currentdate = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Dim LastMonthDate  As Long";
_lastmonthdate = 0L;
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Dim p1 As Period";
_p1 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="p1.Days = -30";
_p1.Days = (int) (-30);
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="LastMonthDate = DateUtils.AddPeriod(CurrentDate,";
_lastmonthdate = mostCurrent._dateutils._addperiod(_ba,_currentdate,_p1);
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="Return LastMonthDate";
if (true) return _lastmonthdate;
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="End Sub";
return 0L;
}
public static String  _getlastndays(anywheresoftware.b4a.BA _ba,int _days) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlastndays", false))
	 {return ((String) Debug.delegate(null, "getlastndays", new Object[] {_ba,_days}));}
long _currentdate = 0L;
long _lastweekdate = 0L;
b4a.example.dateutils._period _p1 = null;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub GetLastNDays(days As Int) As String";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
_currentdate = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Dim LastWeekDate  As Long";
_lastweekdate = 0L;
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Dim p1 As Period";
_p1 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="p1.Days = -days";
_p1.Days = (int) (-_days);
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="LastWeekDate = DateUtils.AddPeriod(CurrentDate, p";
_lastweekdate = mostCurrent._dateutils._addperiod(_ba,_currentdate,_p1);
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="Return DateTime.Date(LastWeekDate)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lastweekdate);
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="End Sub";
return "";
}
public static String  _getlastweekdate(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlastweekdate", false))
	 {return ((String) Debug.delegate(null, "getlastweekdate", new Object[] {_ba}));}
long _currentdate = 0L;
long _lastweekdate = 0L;
b4a.example.dateutils._period _p1 = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub GetLastWeekDate As String";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
_currentdate = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Dim LastWeekDate  As Long";
_lastweekdate = 0L;
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="Dim p1 As Period";
_p1 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="p1.Days = -7";
_p1.Days = (int) (-7);
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="LastWeekDate = DateUtils.AddPeriod(CurrentDate, p";
_lastweekdate = mostCurrent._dateutils._addperiod(_ba,_currentdate,_p1);
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Return DateTime.Date(LastWeekDate)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lastweekdate);
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="End Sub";
return "";
}
public static String  _getlistasstr(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _arr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlistasstr", false))
	 {return ((String) Debug.delegate(null, "getlistasstr", new Object[] {_ba,_arr}));}
String _sret = "";
int _n = 0;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub GetListAsStr(arr As List) As String";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim sRet As String = \"\"";
_sret = "";
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="If (arr.IsInitialized) Then";
if ((_arr.IsInitialized())) { 
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="If (arr.Size >0) Then";
if ((_arr.getSize()>0)) { 
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="For n=0 To arr.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_arr.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit4 ;_n = _n + step4 ) {
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="If NNE(sRet) Then";
if (_nne(_ba,_sret)) { 
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="sRet = $\"${sRet}, \"$";
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+", ");
 };
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="sRet = $\"${sRet}${arr.Get(n)}\"$";
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_arr.Get(_n))+"");
 }
};
 };
 };
RDebugUtils.currentLine=13762572;
 //BA.debugLineNum = 13762572;BA.debugLine="Return sRet";
if (true) return _sret;
RDebugUtils.currentLine=13762573;
 //BA.debugLineNum = 13762573;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getliststrarrayitems(anywheresoftware.b4a.BA _ba,String[] _arr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getliststrarrayitems", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getliststrarrayitems", new Object[] {_ba,_arr}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub GetListStrArrayItems(arr() As String) As List";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim lst As List = arr";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(_arr);
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Return lst";
if (true) return _lst;
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="End Sub";
return null;
}
public static String  _getlocaluserstatus(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlocaluserstatus", false))
	 {return ((String) Debug.delegate(null, "getlocaluserstatus", new Object[] {_ba}));}
String _ret = "";
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub GetLocalUserStatus As String";
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="If ShareCode.USER_LOCAL_MAP.IsInitialized Then";
if (mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="ShareCode.USER_LOCAL_MAP.Clear";
mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
 }else {
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="ShareCode.USER_LOCAL_MAP.Initialize";
mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="If File.Exists(	Starter.InternalFolder,\"USER_STAT";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._internalfolder /*String*/ ,"USER_STATUS.MAP")) { 
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="ShareCode.USER_LOCAL_MAP = File.readMap(Starter.";
mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/  = anywheresoftware.b4a.keywords.Common.File.ReadMap(mostCurrent._starter._internalfolder /*String*/ ,"USER_STATUS.MAP");
RDebugUtils.currentLine=15400970;
 //BA.debugLineNum = 15400970;BA.debugLine="Dim ret As String = ShareCode.USER_LOCAL_MAP.Get";
_ret = BA.ObjectToString(mostCurrent._sharecode._user_local_map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(mostCurrent._sharecode._sess_oper_user /*String*/ )));
 }else {
RDebugUtils.currentLine=15400972;
 //BA.debugLineNum = 15400972;BA.debugLine="ret = \"\"";
_ret = "";
 };
RDebugUtils.currentLine=15400975;
 //BA.debugLineNum = 15400975;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=15400977;
 //BA.debugLineNum = 15400977;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getlogerrorslist(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlogerrorslist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlogerrorslist", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _strlist = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.Map _mapping = null;
anywheresoftware.b4a.objects.collections.Map _condition = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub getLogErrorsList As List";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim StrList As List";
_strlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="StrList.Initialize";
_strlist.Initialize();
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="Private Record As ResultSet";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Dim sSQL As String = $\"select * from log_errors w";
_ssql = ("select * from log_errors where reported=0");
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="Record = Starter.LocalSQLWRK.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5832716;
 //BA.debugLineNum = 5832716;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5832717;
 //BA.debugLineNum = 5832717;BA.debugLine="params.Put(\"logdatetime\", Record.GetString(\"log";
_params.Put((Object)("logdatetime"),(Object)(_record.GetString("logdatetime")));
RDebugUtils.currentLine=5832718;
 //BA.debugLineNum = 5832718;BA.debugLine="params.Put(\"logaction\", Record.GetString(\"logac";
_params.Put((Object)("logaction"),(Object)(_record.GetString("logaction")));
RDebugUtils.currentLine=5832719;
 //BA.debugLineNum = 5832719;BA.debugLine="params.Put(\"loguser\", Record.GetString(\"loguser";
_params.Put((Object)("loguser"),(Object)(_record.GetString("loguser")));
RDebugUtils.currentLine=5832720;
 //BA.debugLineNum = 5832720;BA.debugLine="params.Put(\"loglocation\", Record.GetString(\"log";
_params.Put((Object)("loglocation"),(Object)(_record.GetString("loglocation")));
RDebugUtils.currentLine=5832721;
 //BA.debugLineNum = 5832721;BA.debugLine="params.Put(\"logmessage\", Record.GetString(\"logm";
_params.Put((Object)("logmessage"),(Object)(_record.GetString("logmessage")));
RDebugUtils.currentLine=5832722;
 //BA.debugLineNum = 5832722;BA.debugLine="params.Put(\"logdevice\", Record.GetString(\"logde";
_params.Put((Object)("logdevice"),(Object)(_record.GetString("logdevice")));
RDebugUtils.currentLine=5832723;
 //BA.debugLineNum = 5832723;BA.debugLine="params.Put(\"reported\", 1)";
_params.Put((Object)("reported"),(Object)(1));
RDebugUtils.currentLine=5832724;
 //BA.debugLineNum = 5832724;BA.debugLine="StrList.Add(params)";
_strlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=5832726;
 //BA.debugLineNum = 5832726;BA.debugLine="Dim Mapping As Map";
_mapping = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5832727;
 //BA.debugLineNum = 5832727;BA.debugLine="Mapping.Initialize";
_mapping.Initialize();
RDebugUtils.currentLine=5832728;
 //BA.debugLineNum = 5832728;BA.debugLine="Mapping.Put(\"reported\", 1)";
_mapping.Put((Object)("reported"),(Object)(1));
RDebugUtils.currentLine=5832729;
 //BA.debugLineNum = 5832729;BA.debugLine="Dim Condition As Map";
_condition = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5832730;
 //BA.debugLineNum = 5832730;BA.debugLine="Condition.Initialize";
_condition.Initialize();
RDebugUtils.currentLine=5832731;
 //BA.debugLineNum = 5832731;BA.debugLine="Condition.Put(\"logdatetime\", Record.GetString(\"";
_condition.Put((Object)("logdatetime"),(Object)(_record.GetString("logdatetime")));
RDebugUtils.currentLine=5832732;
 //BA.debugLineNum = 5832732;BA.debugLine="Condition.Put(\"loglocation\", Record.GetString(\"";
_condition.Put((Object)("loglocation"),(Object)(_record.GetString("loglocation")));
RDebugUtils.currentLine=5832733;
 //BA.debugLineNum = 5832733;BA.debugLine="Condition.Put(\"reported\", 0)";
_condition.Put((Object)("reported"),(Object)(0));
RDebugUtils.currentLine=5832734;
 //BA.debugLineNum = 5832734;BA.debugLine="DBUtils.UpdateRecord2(Starter.LocalSQLWRK, \"log_";
mostCurrent._dbutils._updaterecord2 /*String*/ (_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"log_errors",_mapping,_condition);
 }
;
RDebugUtils.currentLine=5832738;
 //BA.debugLineNum = 5832738;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=5832739;
 //BA.debugLineNum = 5832739;BA.debugLine="Return StrList";
if (true) return _strlist;
RDebugUtils.currentLine=5832740;
 //BA.debugLineNum = 5832740;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getlogpositionslist(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getlogpositionslist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlogpositionslist", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _strlist = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.Map _mapping = null;
anywheresoftware.b4a.objects.collections.Map _condition = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub getLogPositionsList As List";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim StrList As List";
_strlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="StrList.Initialize";
_strlist.Initialize();
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Private Record As ResultSet";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="Dim sSQL As String = $\"select * from log_position";
_ssql = ("select * from log_positions where reported=0");
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="Record = Starter.LocalSQLWRK.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5898253;
 //BA.debugLineNum = 5898253;BA.debugLine="params.Put(\"logdatetime\", Record.GetString(\"log";
_params.Put((Object)("logdatetime"),(Object)(_record.GetString("logdatetime")));
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="params.Put(\"loguser\", Record.GetString(\"loguser";
_params.Put((Object)("loguser"),(Object)(_record.GetString("loguser")));
RDebugUtils.currentLine=5898255;
 //BA.debugLineNum = 5898255;BA.debugLine="params.Put(\"loglatitude\", Record.GetString(\"log";
_params.Put((Object)("loglatitude"),(Object)(_record.GetString("loglatitude")));
RDebugUtils.currentLine=5898256;
 //BA.debugLineNum = 5898256;BA.debugLine="params.Put(\"loglongitude\", Record.GetString(\"lo";
_params.Put((Object)("loglongitude"),(Object)(_record.GetString("loglongitude")));
RDebugUtils.currentLine=5898257;
 //BA.debugLineNum = 5898257;BA.debugLine="params.Put(\"logdevice\", Record.GetString(\"logde";
_params.Put((Object)("logdevice"),(Object)(_record.GetString("logdevice")));
RDebugUtils.currentLine=5898258;
 //BA.debugLineNum = 5898258;BA.debugLine="params.Put(\"reported\", 1)";
_params.Put((Object)("reported"),(Object)(1));
RDebugUtils.currentLine=5898259;
 //BA.debugLineNum = 5898259;BA.debugLine="StrList.Add(params)";
_strlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=5898261;
 //BA.debugLineNum = 5898261;BA.debugLine="Dim Mapping As Map";
_mapping = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5898262;
 //BA.debugLineNum = 5898262;BA.debugLine="Mapping.Initialize";
_mapping.Initialize();
RDebugUtils.currentLine=5898263;
 //BA.debugLineNum = 5898263;BA.debugLine="Mapping.Put(\"reported\", 1)";
_mapping.Put((Object)("reported"),(Object)(1));
RDebugUtils.currentLine=5898264;
 //BA.debugLineNum = 5898264;BA.debugLine="Dim Condition As Map";
_condition = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5898265;
 //BA.debugLineNum = 5898265;BA.debugLine="Condition.Initialize";
_condition.Initialize();
RDebugUtils.currentLine=5898266;
 //BA.debugLineNum = 5898266;BA.debugLine="Condition.Put(\"logdatetime\", Record.GetString(\"";
_condition.Put((Object)("logdatetime"),(Object)(_record.GetString("logdatetime")));
RDebugUtils.currentLine=5898267;
 //BA.debugLineNum = 5898267;BA.debugLine="Condition.Put(\"loglatitude\", Record.GetString(\"";
_condition.Put((Object)("loglatitude"),(Object)(_record.GetString("loglatitude")));
RDebugUtils.currentLine=5898268;
 //BA.debugLineNum = 5898268;BA.debugLine="Condition.Put(\"loglongitude\", Record.GetString(";
_condition.Put((Object)("loglongitude"),(Object)(_record.GetString("loglongitude")));
RDebugUtils.currentLine=5898269;
 //BA.debugLineNum = 5898269;BA.debugLine="Condition.Put(\"reported\", 0)";
_condition.Put((Object)("reported"),(Object)(0));
RDebugUtils.currentLine=5898270;
 //BA.debugLineNum = 5898270;BA.debugLine="DBUtils.UpdateRecord2(Starter.LocalSQLWRK, \"log_";
mostCurrent._dbutils._updaterecord2 /*String*/ (_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"log_positions",_mapping,_condition);
 }
;
RDebugUtils.currentLine=5898274;
 //BA.debugLineNum = 5898274;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=5898275;
 //BA.debugLineNum = 5898275;BA.debugLine="Return StrList";
if (true) return _strlist;
RDebugUtils.currentLine=5898276;
 //BA.debugLineNum = 5898276;BA.debugLine="End Sub";
return null;
}
public static Object  _getmapkeyindex(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _mm,int _index) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getmapkeyindex", false))
	 {return ((Object) Debug.delegate(null, "getmapkeyindex", new Object[] {_ba,_mm,_index}));}
int _idx = 0;
Object _v = null;
String _k = "";
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub GetMapKeyIndex(mm As Map, index As Int) As Obj";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim idx As Int = 0";
_idx = (int) (0);
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dim v As Object = \"\"";
_v = (Object)("");
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="For Each k As String In mm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="If idx = index Then";
if (_idx==_index) { 
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="v = k 'mm.Get(k)";
_v = (Object)(_k);
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="Exit";
if (true) break;
 };
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
 }
};
RDebugUtils.currentLine=10747914;
 //BA.debugLineNum = 10747914;BA.debugLine="Return v";
if (true) return _v;
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="End Sub";
return null;
}
public static String  _getnextndays(anywheresoftware.b4a.BA _ba,int _days) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getnextndays", false))
	 {return ((String) Debug.delegate(null, "getnextndays", new Object[] {_ba,_days}));}
long _currentdate = 0L;
long _lastweekdate = 0L;
b4a.example.dateutils._period _p1 = null;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub GetNextNDays(days As Int) As String";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
_currentdate = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="Dim LastWeekDate  As Long";
_lastweekdate = 0L;
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Dim p1 As Period";
_p1 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="p1.Days = days";
_p1.Days = _days;
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="LastWeekDate = DateUtils.AddPeriod(CurrentDate, p";
_lastweekdate = mostCurrent._dateutils._addperiod(_ba,_currentdate,_p1);
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="Return DateTime.Date(LastWeekDate)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lastweekdate);
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="End Sub";
return "";
}
public static String  _getnextweekdate(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getnextweekdate", false))
	 {return ((String) Debug.delegate(null, "getnextweekdate", new Object[] {_ba}));}
long _currentdate = 0L;
long _nextweekdate = 0L;
b4a.example.dateutils._period _p1 = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub GetNextWeekDate As String";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
_currentdate = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="Dim NextWeekDate  As Long";
_nextweekdate = 0L;
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="Dim p1 As Period";
_p1 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="p1.Days = 7";
_p1.Days = (int) (7);
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="NextWeekDate = DateUtils.AddPeriod(CurrentDate, p";
_nextweekdate = mostCurrent._dateutils._addperiod(_ba,_currentdate,_p1);
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="Return DateTime.Date(NextWeekDate)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_nextweekdate);
RDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="End Sub";
return "";
}
public static String  _gettablecolumnsvalues(anywheresoftware.b4a.BA _ba,String _table) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "gettablecolumnsvalues", false))
	 {return ((String) Debug.delegate(null, "gettablecolumnsvalues", new Object[] {_ba,_table}));}
String _mainscript = "";
String _columns = "";
String _script = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordori = null;
int _n = 0;
anywheresoftware.b4a.objects.collections.List _valueslist = null;
String _values = "";
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Sub GetTableColumnsValues(table As String) As Stri";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim MainScript As String = \"\"";
_mainscript = "";
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="Dim Columns As String = \"\"";
_columns = "";
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="Dim Script As String = $\"select * from ${table} l";
_script = ("select * from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+" limit 1");
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="Private RecordOri As ResultSet = Starter.LocalSQL";
_recordori = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordori = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_script)));
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="For n=0 To RecordOri.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_recordori.getColumnCount()-1);
_n = (int) (0) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=15728647;
 //BA.debugLineNum = 15728647;BA.debugLine="If NNE(Columns) Then";
if (_nne(_ba,_columns)) { 
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="Columns = $\"${Columns},\"$";
_columns = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_columns))+",");
 };
RDebugUtils.currentLine=15728650;
 //BA.debugLineNum = 15728650;BA.debugLine="Columns = $\"${Columns} ${ RecordOri.GetColumnNam";
_columns = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_columns))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_recordori.GetColumnName(_n)))+"");
 }
};
RDebugUtils.currentLine=15728652;
 //BA.debugLineNum = 15728652;BA.debugLine="Dim ValuesList As List : ValuesList.Initialize";
_valueslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15728652;
 //BA.debugLineNum = 15728652;BA.debugLine="Dim ValuesList As List : ValuesList.Initialize";
_valueslist.Initialize();
RDebugUtils.currentLine=15728653;
 //BA.debugLineNum = 15728653;BA.debugLine="If NNE(Columns) Then";
if (_nne(_ba,_columns)) { 
RDebugUtils.currentLine=15728654;
 //BA.debugLineNum = 15728654;BA.debugLine="Do While RecordOri.NextRow";
while (_recordori.NextRow()) {
RDebugUtils.currentLine=15728655;
 //BA.debugLineNum = 15728655;BA.debugLine="Dim Values As String = \"\"";
_values = "";
RDebugUtils.currentLine=15728656;
 //BA.debugLineNum = 15728656;BA.debugLine="For n=0 To RecordOri.ColumnCount-1";
{
final int step16 = 1;
final int limit16 = (int) (_recordori.getColumnCount()-1);
_n = (int) (0) ;
for (;_n <= limit16 ;_n = _n + step16 ) {
RDebugUtils.currentLine=15728657;
 //BA.debugLineNum = 15728657;BA.debugLine="If NNE(Values) Then";
if (_nne(_ba,_values)) { 
RDebugUtils.currentLine=15728658;
 //BA.debugLineNum = 15728658;BA.debugLine="Values = $\"${Values},\"$";
_values = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_values))+",");
 };
RDebugUtils.currentLine=15728660;
 //BA.debugLineNum = 15728660;BA.debugLine="Values = $\"${Values} '${RecordOri.GetString(Re";
_values = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_values))+" '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_recordori.GetString(_recordori.GetColumnName(_n))))+"'");
 }
};
RDebugUtils.currentLine=15728662;
 //BA.debugLineNum = 15728662;BA.debugLine="If NNE(Values) Then";
if (_nne(_ba,_values)) { 
RDebugUtils.currentLine=15728663;
 //BA.debugLineNum = 15728663;BA.debugLine="Values = $\"(${Values})\"$";
_values = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_values))+")");
RDebugUtils.currentLine=15728664;
 //BA.debugLineNum = 15728664;BA.debugLine="ValuesList.Add(Values)";
_valueslist.Add((Object)(_values));
 };
 }
;
 };
RDebugUtils.currentLine=15728669;
 //BA.debugLineNum = 15728669;BA.debugLine="If (ValuesList.Size > 0) Then";
if ((_valueslist.getSize()>0)) { 
RDebugUtils.currentLine=15728670;
 //BA.debugLineNum = 15728670;BA.debugLine="For n=0 To ValuesList.Size-1";
{
final int step29 = 1;
final int limit29 = (int) (_valueslist.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit29 ;_n = _n + step29 ) {
RDebugUtils.currentLine=15728671;
 //BA.debugLineNum = 15728671;BA.debugLine="If NNE(MainScript) Then";
if (_nne(_ba,_mainscript)) { 
RDebugUtils.currentLine=15728672;
 //BA.debugLineNum = 15728672;BA.debugLine="MainScript = $\"${MainScript},\"$";
_mainscript = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mainscript))+",");
 };
RDebugUtils.currentLine=15728674;
 //BA.debugLineNum = 15728674;BA.debugLine="MainScript = $\"${MainScript} '${ValuesList.get(";
_mainscript = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mainscript))+" '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_valueslist.Get(_n))+"'");
 }
};
RDebugUtils.currentLine=15728676;
 //BA.debugLineNum = 15728676;BA.debugLine="If NNE(MainScript) Then";
if (_nne(_ba,_mainscript)) { 
RDebugUtils.currentLine=15728677;
 //BA.debugLineNum = 15728677;BA.debugLine="MainScript = $\"insert into ${table} (${Columns}";
_mainscript = ("insert into "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_columns))+") values "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mainscript))+";");
 };
 };
RDebugUtils.currentLine=15728680;
 //BA.debugLineNum = 15728680;BA.debugLine="Return MainScript";
if (true) return _mainscript;
RDebugUtils.currentLine=15728681;
 //BA.debugLineNum = 15728681;BA.debugLine="End Sub";
return "";
}
public static String  _getversion(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getversion", false))
	 {return ((String) Debug.delegate(null, "getversion", new Object[] {_ba}));}
Object _name = null;
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Sub GetVersion As String";
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="Dim name As Object = Application.VersionCode";
_name = (Object)(anywheresoftware.b4a.keywords.Common.Application.getVersionCode());
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="Return name";
if (true) return BA.ObjectToString(_name);
RDebugUtils.currentLine=15663113;
 //BA.debugLineNum = 15663113;BA.debugLine="End Sub";
return "";
}
public static String  _getviewtext(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getviewtext", false))
	 {return ((String) Debug.delegate(null, "getviewtext", new Object[] {_ba,_v}));}
String _ret = "";
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub getViewText(v As B4XView) As String";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim ret As String = v.Text";
_ret = _v.getText();
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="End Sub";
return "";
}
public static String  _getyesterday(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getyesterday", false))
	 {return ((String) Debug.delegate(null, "getyesterday", new Object[] {_ba}));}
b4a.example.dateutils._period _p1 = null;
long _newdate = 0L;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub GetYesterday As String";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Dim p1 As Period";
_p1 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="p1.days = -1";
_p1.Days = (int) (-1);
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="Dim NewDate As Long = DateUtils.AddPeriod(DateTim";
_newdate = mostCurrent._dateutils._addperiod(_ba,anywheresoftware.b4a.keywords.Common.DateTime.getNow(),_p1);
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="Return $\"$date{NewDate} 00:10\"$";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(_newdate))+" 00:10");
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="End Sub";
return "";
}
public static int  _hextocolor(anywheresoftware.b4a.BA _ba,String _hex) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "hextocolor", false))
	 {return ((Integer) Debug.delegate(null, "hextocolor", new Object[] {_ba,_hex}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int[] _ints = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub HexToColor(Hex As String) As Int";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }}
;
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Return ints(0)";
if (true) return _ints[(int) (0)];
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="End Sub";
return 0;
}
public static int  _htmlcolor2int(anywheresoftware.b4a.BA _ba,String _hcolor) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "htmlcolor2int", false))
	 {return ((Integer) Debug.delegate(null, "htmlcolor2int", new Object[] {_ba,_hcolor}));}
int _resultint = 0;
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub HtmlColor2Int(Hcolor As String) As Int";
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Dim ResultInt As Int = 0";
_resultint = (int) (0);
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="If Hcolor = \"#02b8c5\" Or Hcolor = \"blue\" Then";
if ((_hcolor).equals("#02b8c5") || (_hcolor).equals("blue")) { 
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="ResultInt = Consts.ColorBlue";
_resultint = mostCurrent._consts._colorblue /*int*/ ;
 }else 
{RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="else if Hcolor = \"#febb03\" Or Hcolor = \"yellow\" T";
if ((_hcolor).equals("#febb03") || (_hcolor).equals("yellow")) { 
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="ResultInt = Consts.ColorYellow";
_resultint = mostCurrent._consts._coloryellow /*int*/ ;
 }else 
{RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="else if Hcolor = \"#0d893c\" Or Hcolor = \"green\" Th";
if ((_hcolor).equals("#0d893c") || (_hcolor).equals("green")) { 
RDebugUtils.currentLine=15990793;
 //BA.debugLineNum = 15990793;BA.debugLine="ResultInt = Consts.ColorGreen";
_resultint = mostCurrent._consts._colorgreen /*int*/ ;
 }else 
{RDebugUtils.currentLine=15990794;
 //BA.debugLineNum = 15990794;BA.debugLine="else if Hcolor = \"#d13339\" Or Hcolor = \"red\" Then";
if ((_hcolor).equals("#d13339") || (_hcolor).equals("red")) { 
RDebugUtils.currentLine=15990795;
 //BA.debugLineNum = 15990795;BA.debugLine="ResultInt = Consts.ColorRed";
_resultint = mostCurrent._consts._colorred /*int*/ ;
 }else 
{RDebugUtils.currentLine=15990796;
 //BA.debugLineNum = 15990796;BA.debugLine="else if Hcolor =\"#717a8e\" Or Hcolor = \"gray\" Then";
if ((_hcolor).equals("#717a8e") || (_hcolor).equals("gray")) { 
RDebugUtils.currentLine=15990797;
 //BA.debugLineNum = 15990797;BA.debugLine="ResultInt = Consts.ColorGray";
_resultint = mostCurrent._consts._colorgray /*int*/ ;
 }else 
{RDebugUtils.currentLine=15990798;
 //BA.debugLineNum = 15990798;BA.debugLine="else if Hcolor = \"#0b7030\" Or Hcolor = \"darkgreen";
if ((_hcolor).equals("#0b7030") || (_hcolor).equals("darkgreen")) { 
RDebugUtils.currentLine=15990799;
 //BA.debugLineNum = 15990799;BA.debugLine="ResultInt = Consts.DarkGreen";
_resultint = mostCurrent._consts._darkgreen /*int*/ ;
 }else 
{RDebugUtils.currentLine=15990800;
 //BA.debugLineNum = 15990800;BA.debugLine="else if Hcolor = \"#000000\" Or Hcolor = \"black\" Th";
if ((_hcolor).equals("#000000") || (_hcolor).equals("black")) { 
RDebugUtils.currentLine=15990801;
 //BA.debugLineNum = 15990801;BA.debugLine="ResultInt = Colors.Black";
_resultint = anywheresoftware.b4a.keywords.Common.Colors.Black;
 }else 
{RDebugUtils.currentLine=15990802;
 //BA.debugLineNum = 15990802;BA.debugLine="else if Hcolor = \"#ffffff\" Or Hcolor = \"white\" Th";
if ((_hcolor).equals("#ffffff") || (_hcolor).equals("white")) { 
RDebugUtils.currentLine=15990803;
 //BA.debugLineNum = 15990803;BA.debugLine="ResultInt = Colors.white";
_resultint = anywheresoftware.b4a.keywords.Common.Colors.White;
 }else {
RDebugUtils.currentLine=15990805;
 //BA.debugLineNum = 15990805;BA.debugLine="ResultInt = Colors.Black";
_resultint = anywheresoftware.b4a.keywords.Common.Colors.Black;
 }}}}}}}}
;
RDebugUtils.currentLine=15990808;
 //BA.debugLineNum = 15990808;BA.debugLine="Return ResultInt";
if (true) return _resultint;
RDebugUtils.currentLine=15990809;
 //BA.debugLineNum = 15990809;BA.debugLine="End Sub";
return 0;
}
public static String  _ifnotnullorempty(anywheresoftware.b4a.BA _ba,String _instr,String _notstr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "ifnotnullorempty", false))
	 {return ((String) Debug.delegate(null, "ifnotnullorempty", new Object[] {_ba,_instr,_notstr}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub IfNotNullOrEmpty(inStr As String, notStr As St";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="If NNE(inStr) Then";
if (_nne(_ba,_instr)) { 
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Return notStr";
if (true) return _notstr;
 }else {
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Return inStr";
if (true) return _instr;
 };
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="End Sub";
return "";
}
public static String  _ifnotnulloremptyadd(anywheresoftware.b4a.BA _ba,String _instr,String _addstr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "ifnotnulloremptyadd", false))
	 {return ((String) Debug.delegate(null, "ifnotnulloremptyadd", new Object[] {_ba,_instr,_addstr}));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub IfNotNullOrEmptyAdd(inStr As String, addStr As";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="If NNE(inStr) Then";
if (_nne(_ba,_instr)) { 
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Return $\"${inStr}${addStr}\"$";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_instr))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_addstr))+"");
 }else {
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="Return inStr";
if (true) return _instr;
 };
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="End Sub";
return "";
}
public static double  _ifnulloremptydouble(anywheresoftware.b4a.BA _ba,String _instr,double _nullstr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "ifnulloremptydouble", false))
	 {return ((Double) Debug.delegate(null, "ifnulloremptydouble", new Object[] {_ba,_instr,_nullstr}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub IfNullOrEmptyDouble(inStr As String, nullStr A";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="If ((isNullOrEmpty(inStr) = True) Or Not(TestNumb";
if (((_isnullorempty(_ba,_instr)==anywheresoftware.b4a.keywords.Common.True) || anywheresoftware.b4a.keywords.Common.Not(_testnumber(_ba,_instr)))) { 
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Return nullStr";
if (true) return _nullstr;
 }else {
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Return inStr";
if (true) return (double)(Double.parseDouble(_instr));
 };
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="End Sub";
return 0;
}
public static boolean  _testnumber(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "testnumber", false))
	 {return ((Boolean) Debug.delegate(null, "testnumber", new Object[] {_ba,_s}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub TestNumber(s As String) As Boolean";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Return IsNumber(s) And Regex.IsMatch(\"[\\d\\.]+\", s";
if (true) return anywheresoftware.b4a.keywords.Common.IsNumber(_s) && anywheresoftware.b4a.keywords.Common.Regex.IsMatch("[\\d\\.]+",_s);
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return false;
}
public static int  _ifnulloremptyint(anywheresoftware.b4a.BA _ba,String _instr,int _nullstr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "ifnulloremptyint", false))
	 {return ((Integer) Debug.delegate(null, "ifnulloremptyint", new Object[] {_ba,_instr,_nullstr}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub IfNullOrEmptyInt(inStr As String, nullStr As I";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="If ((isNullOrEmpty(inStr) = True) Or Not(IsNumber";
if (((_isnullorempty(_ba,_instr)==anywheresoftware.b4a.keywords.Common.True) || anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(_instr)))) { 
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Return nullStr";
if (true) return _nullstr;
 }else {
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="Return inStr";
if (true) return (int)(Double.parseDouble(_instr));
 };
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="End Sub";
return 0;
}
public static String  _imagetobase64(anywheresoftware.b4a.BA _ba,String _folder,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "imagetobase64", false))
	 {return ((String) Debug.delegate(null, "imagetobase64", new Object[] {_ba,_folder,_filename}));}
boolean _continuar = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _img = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub ImageToBase64(Folder As String, Filename As St";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim Continuar As Boolean = True";
_continuar = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Try";
try {RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmap(Folder, Fi";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = _xui.LoadBitmap(_folder,_filename);
 } 
       catch (Exception e5) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e5);RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("615204357",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="Continuar = False";
_continuar = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="If Continuar Then";
if (_continuar) { 
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="img.WriteToStream(out, ShareCode.DEVICE_DEF_QUAL";
_img.WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="Return su.EncodeBase64(out.ToBytesArray)";
if (true) return _su.EncodeBase64(_out.ToBytesArray());
 };
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="End Sub";
return "";
}
public static String  _imagetobase642(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _img) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "imagetobase642", false))
	 {return ((String) Debug.delegate(null, "imagetobase642", new Object[] {_ba,_img}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub ImageToBase642(img As B4XBitmap) As String";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="If img.IsInitialized Then";
if (_img.IsInitialized()) { 
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="img.WriteToStream(out, ShareCode.DEVICE_DEF_QUAL";
_img.WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="Return su.EncodeBase64(out.ToBytesArray)";
if (true) return _su.EncodeBase64(_out.ToBytesArray());
 };
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="End Sub";
return "";
}
public static String  _incchars(anywheresoftware.b4a.BA _ba,int _len,String _charstr,boolean _toleft) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "incchars", false))
	 {return ((String) Debug.delegate(null, "incchars", new Object[] {_ba,_len,_charstr,_toleft}));}
String _ret = "";
int _n = 0;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub IncChars(len As Int, charstr As String, toLeft";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="For n=0 To len-1";
{
final int step2 = 1;
final int limit2 = (int) (_len-1);
_n = (int) (0) ;
for (;_n <= limit2 ;_n = _n + step2 ) {
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="If (toLeft = True) Then";
if ((_toleft==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="ret = $\"${charstr}${ret}\"$";
_ret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_charstr))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ret))+"");
 }else {
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="ret = $\"${ret}${charstr}\"$";
_ret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ret))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_charstr))+"");
 };
 }
};
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="End Sub";
return "";
}
public static String  _savescripttolog(anywheresoftware.b4a.BA _ba,String _request,String _script) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "savescripttolog", false))
	 {return ((String) Debug.delegate(null, "savescripttolog", new Object[] {_ba,_request,_script}));}
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _tsave = null;
String _dt = "";
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub SaveScriptToLog(request As String, script As S";
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim tSave As TextWriter";
_tsave = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Dim dt As String = GetCurrDatetimeT2(\"\")";
_dt = _getcurrdatetimet2(_ba,"");
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="tSave.Initialize(File.OpenOutput(Starter.SharedFo";
_tsave.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(mostCurrent._starter._sharedfolder /*String*/ ,("request_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dt))+".log"),anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="tSave.WriteLine(script)";
_tsave.WriteLine(_script);
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="tSave.Close";
_tsave.Close();
RDebugUtils.currentLine=5570581;
 //BA.debugLineNum = 5570581;BA.debugLine="End Sub";
return "";
}
public static boolean  _insidegeofence(anywheresoftware.b4a.BA _ba,double _lat,double _lon,int _offset) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "insidegeofence", false))
	 {return ((Boolean) Debug.delegate(null, "insidegeofence", new Object[] {_ba,_lat,_lon,_offset}));}
double _currentlatitude = 0;
double _currentlongitude = 0;
boolean _evallat = false;
boolean _evallon = false;
float _pi = 0f;
double _minuslat = 0;
double _minuslon = 0;
double _pluslat = 0;
double _pluslon = 0;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub InsideGeoFence(lat As Double, lon As Double, o";
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Private CurrentLatitude As Double = IfNullOrEmpty";
_currentlatitude = (double)(Double.parseDouble(_ifnullorempty(_ba,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"")));
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="Private CurrentLongitude As Double = IfNullOrEmpt";
_currentlongitude = (double)(Double.parseDouble(_ifnullorempty(_ba,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"")));
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="Dim EvalLat As Boolean = False";
_evallat = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="Dim EvalLon As Boolean = False";
_evallon = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="If lat = 0 Then	lat = CurrentLatitude";
if (_lat==0) { 
_lat = _currentlatitude;};
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="If lon = 0 Then lon = CurrentLongitude";
if (_lon==0) { 
_lon = _currentlongitude;};
RDebugUtils.currentLine=16121867;
 //BA.debugLineNum = 16121867;BA.debugLine="If offset < = 0 Then offset = 2";
if (_offset<=0) { 
_offset = (int) (2);};
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="Try";
try {RDebugUtils.currentLine=16121870;
 //BA.debugLineNum = 16121870;BA.debugLine="Dim pi As Float = 3.14159";
_pi = (float) (3.14159);
RDebugUtils.currentLine=16121871;
 //BA.debugLineNum = 16121871;BA.debugLine="Dim Minuslat As Double = lat - (180/pi)*(offset/";
_minuslat = _lat-(180/(double)_pi)*(_offset/(double)6378137);
RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="Dim Minuslon As Double = lon - (180/pi)*(offset/";
_minuslon = _lon-(180/(double)_pi)*(_offset/(double)6378137)/(double)anywheresoftware.b4a.keywords.Common.Cos(_lat);
RDebugUtils.currentLine=16121874;
 //BA.debugLineNum = 16121874;BA.debugLine="Dim Pluslat As Double = lat + (180/pi)*(offset/6";
_pluslat = _lat+(180/(double)_pi)*(_offset/(double)6378137);
RDebugUtils.currentLine=16121875;
 //BA.debugLineNum = 16121875;BA.debugLine="Dim Pluslon As Double = lon + (180/pi)*(offset/6";
_pluslon = _lon+(180/(double)_pi)*(_offset/(double)6378137)/(double)anywheresoftware.b4a.keywords.Common.Cos(_lat);
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="If CurrentLatitude >= Minuslat And CurrentLatitu";
if (_currentlatitude>=_minuslat && _currentlatitude<=_pluslat) { 
RDebugUtils.currentLine=16121878;
 //BA.debugLineNum = 16121878;BA.debugLine="EvalLat = True";
_evallat = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=16121881;
 //BA.debugLineNum = 16121881;BA.debugLine="If CurrentLongitude >= Minuslon And CurrentLongi";
if (_currentlongitude>=_minuslon && _currentlongitude<=_pluslon) { 
RDebugUtils.currentLine=16121882;
 //BA.debugLineNum = 16121882;BA.debugLine="EvalLon = True";
_evallon = anywheresoftware.b4a.keywords.Common.True;
 };
 } 
       catch (Exception e21) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e21);RDebugUtils.currentLine=16121885;
 //BA.debugLineNum = 16121885;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("616121885",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=16121886;
 //BA.debugLineNum = 16121886;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
RDebugUtils.currentLine=16121889;
 //BA.debugLineNum = 16121889;BA.debugLine="If EvalLat = True And EvalLon = True Then";
if (_evallat==anywheresoftware.b4a.keywords.Common.True && _evallon==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=16121890;
 //BA.debugLineNum = 16121890;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=16121892;
 //BA.debugLineNum = 16121892;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=16121895;
 //BA.debugLineNum = 16121895;BA.debugLine="End Sub";
return false;
}
public static int  _inttodip(anywheresoftware.b4a.BA _ba,int _integer) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "inttodip", false))
	 {return ((Integer) Debug.delegate(null, "inttodip", new Object[] {_ba,_integer}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
float _scale = 0f;
int _dip = 0;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub IntToDIP(Integer As Int) As Int";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim scale As Float";
_scale = 0f;
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="r.Target = r.RunMethod(\"getDisplayMetrics\")";
_r.Target = _r.RunMethod("getDisplayMetrics");
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="scale = r.GetField(\"density\")";
_scale = (float)(BA.ObjectToNumber(_r.GetField("density")));
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Dim DIP As Int";
_dip = 0;
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="DIP = Integer * scale + 0.5";
_dip = (int) (_integer*_scale+0.5);
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="Return DIP";
if (true) return _dip;
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="End Sub";
return 0;
}
public static boolean  _islandscapedefaultorientation(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "islandscapedefaultorientation", false))
	 {return ((Boolean) Debug.delegate(null, "islandscapedefaultorientation", new Object[] {_ba}));}
anywheresoftware.b4j.object.JavaObject _context = null;
int _rotation = 0;
int _configorientation = 0;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub IsLandscapeDefaultOrientation As Boolean";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="context = context.InitializeStatic(\"anywheresoftw";
_context = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_context.InitializeStatic("anywheresoftware.b4a.BA").GetField("applicationContext")));
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="Dim rotation As Int = context.RunMethodJO(\"getSys";
_rotation = (int)(BA.ObjectToNumber(_context.RunMethodJO("getSystemService",new Object[]{(Object)("window")}).RunMethodJO("getDefaultDisplay",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("getRotation",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="Dim configOrientation As Int = context.RunMethodJ";
_configorientation = (int)(BA.ObjectToNumber(_context.RunMethodJO("getResources",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("getConfiguration",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).GetField("orientation")));
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="If ((rotation = 0 Or rotation = 2) And configOrie";
if (((_rotation==0 || _rotation==2) && _configorientation==2) || ((_rotation==1 || _rotation==3) && _configorientation==1)) { 
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnull(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "isnull", false))
	 {return ((Boolean) Debug.delegate(null, "isnull", new Object[] {_ba,_instr}));}
boolean _r = false;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub isNull(inStr As String) As Boolean";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim r As Boolean = False";
_r = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="If (inStr = Null) Then";
if ((_instr== null)) { 
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="r = True";
_r = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Else if (inStr = \"null\") Then";
if (((_instr).equals("null"))) { 
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="r = True";
_r = anywheresoftware.b4a.keywords.Common.True;
 }}
;
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnumeric(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "isnumeric", false))
	 {return ((Boolean) Debug.delegate(null, "isnumeric", new Object[] {_ba,_instr}));}
boolean _r = false;
int _n = 0;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub isNumeric(inStr As String) As Boolean";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim r As Boolean = False";
_r = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="If Not( isNullOrEmpty(inStr) ) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_isnullorempty(_ba,_instr))) { 
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Dim n As Int = 0";
_n = (int) (0);
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Try";
try {RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="n = n + inStr";
_n = (int) (_n+(double)(Double.parseDouble(_instr)));
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="r = True";
_r = anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("69764872",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
 };
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="End Sub";
return false;
}
public static boolean  _issmartphone(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "issmartphone", false))
	 {return ((Boolean) Debug.delegate(null, "issmartphone", new Object[] {_ba}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub IsSmartPhone As Boolean";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Return DeviceType < 7";
if (true) return _devicetype(_ba)<7;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return false;
}
public static boolean  _isvaliddate(anywheresoftware.b4a.BA _ba,String _mdate) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "isvaliddate", false))
	 {return ((Boolean) Debug.delegate(null, "isvaliddate", new Object[] {_ba,_mdate}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub isValidDate(mDate As String) As Boolean";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Try";
try {RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="DateTime.DateParse(mDate)";
anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_mdate);
 } 
       catch (Exception e4) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e4);RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.Map  _json2map(anywheresoftware.b4a.BA _ba,String _script) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "json2map", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "json2map", new Object[] {_ba,_script}));}
anywheresoftware.b4a.objects.collections.Map _ret = null;
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub JSON2MAP(script As String) As Map";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim Ret As Map : Ret.initialize";
_ret = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim Ret As Map : Ret.initialize";
_ret.Initialize();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="If NNE(script) Then";
if (_nne(_ba,_script)) { 
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Try";
try {RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="JSON1.Initialize(script)";
_json1.Initialize(_script);
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Dim Ret As Map = JSON1.NextObject";
_ret = new anywheresoftware.b4a.objects.collections.Map();
_ret = _json1.NextObject();
 } 
       catch (Exception e9) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e9);RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("62752520",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="WriteErrors2Log(LastException)";
_writeerrors2log(_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
 };
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _jsontomap(anywheresoftware.b4a.BA _ba,String _strjson) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "jsontomap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "jsontomap", new Object[] {_ba,_strjson}));}
anywheresoftware.b4a.objects.collections.Map _jmap = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub JsonToMap(strJSON As String) As Map";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim jMap As Map";
_jmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="jMap.Initialize";
_jmap.Initialize();
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="JSON.Initialize(strJSON)";
_json.Initialize(_strjson);
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="jMap = JSON.NextObject";
_jmap = _json.NextObject();
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="Return jMap";
if (true) return _jmap;
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="End Sub";
return null;
}
public static String  _left(anywheresoftware.b4a.BA _ba,String _strtext,int _strlength) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "left", false))
	 {return ((String) Debug.delegate(null, "left", new Object[] {_ba,_strtext,_strlength}));}
adr.stringfunctions.stringfunctions _strfunc = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Left(StrText As String, StrLength As Int) As S";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Private strfunc As StringFunctions";
_strfunc = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="strfunc.Initialize";
_strfunc._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Return strfunc.Left(StrText, StrLength)";
if (true) return _strfunc._vvv6(_strtext,(long) (_strlength));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="End Sub";
return "";
}
public static String  _list2str(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _inlist,String _divider) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "list2str", false))
	 {return ((String) Debug.delegate(null, "list2str", new Object[] {_ba,_inlist,_divider}));}
String _sret = "";
int _i = 0;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub List2Str(inList As List, divider As String) As";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim sRet As String = \"\"";
_sret = "";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="If (divider=\"\") Then divider = \"|\"";
if (((_divider).equals(""))) { 
_divider = "|";};
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="For i=0 To inList.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_inlist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="If (sRet <> \"\") Then sRet = $\"${sRet}${divider}\"";
if (((_sret).equals("") == false)) { 
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_divider))+"");};
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="sRet = $\"${sRet}${inList.Get(i)}\"$";
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_inlist.Get(_i))+"");
 }
};
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="Return sRet";
if (true) return _sret;
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _listofpairslist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _pairs,String _splitter) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "listofpairslist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "listofpairslist", new Object[] {_ba,_pairs,_splitter}));}
anywheresoftware.b4a.objects.collections.List _retlist = null;
String _splt = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub ListOfPairsList(pairs As List, splitter As Str";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim retList As List";
_retlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="retList.Initialize";
_retlist.Initialize();
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Dim splt As String = splitter";
_splt = _splitter;
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="If (splt = \"\") Then splt = \"=>\"";
if (((_splt).equals(""))) { 
_splt = "=>";};
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="For i=0 To pairs.size-1";
{
final int step5 = 1;
final int limit5 = (int) (_pairs.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="Dim lst As List = Regex.Split((\"\\\"&splt), pairs.";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(("\\"+_splt),BA.ObjectToString(_pairs.Get(_i))));
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="map.Put(lst.Get(0), lst.Get(1))";
_map.Put(_lst.Get((int) (0)),_lst.Get((int) (1)));
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="retList.Add(map)";
_retlist.Add((Object)(_map.getObject()));
 }
};
RDebugUtils.currentLine=10616844;
 //BA.debugLineNum = 10616844;BA.debugLine="Return retList";
if (true) return _retlist;
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="End Sub";
return null;
}
public static String  _loadjsonfile(anywheresoftware.b4a.BA _ba,String _folder,String _filearg) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "loadjsonfile", false))
	 {return ((String) Debug.delegate(null, "loadjsonfile", new Object[] {_ba,_folder,_filearg}));}
String _jsondata = "";
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub LoadJSONFile( Folder As String, FileArg As Str";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Dim JSONData As String = File.ReadString(Folder,F";
_jsondata = anywheresoftware.b4a.keywords.Common.File.ReadString(_folder,_filearg);
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="Starter.StrFunc.Initialize";
mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=13631498;
 //BA.debugLineNum = 13631498;BA.debugLine="If (Starter.StrFunc.Left(JSONData, 1) = \"[\") Then";
if (((mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv6(_jsondata,(long) (1))).equals("["))) { 
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="JSONData = Starter.StrFunc.Trim(Starter.StrFunc.";
_jsondata = mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvvvvv4(mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvv5(_jsondata,(int) (2),(int) (mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv7(_jsondata)-1)));
 };
RDebugUtils.currentLine=13631501;
 //BA.debugLineNum = 13631501;BA.debugLine="Return JSONData";
if (true) return _jsondata;
RDebugUtils.currentLine=13631502;
 //BA.debugLineNum = 13631502;BA.debugLine="End Sub";
return "";
}
public static String  _logall(anywheresoftware.b4a.BA _ba,String _title,String[] _values) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "logall", false))
	 {return ((String) Debug.delegate(null, "logall", new Object[] {_ba,_title,_values}));}
String _ss = "";
String _lg = "";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub logall(title As String, values() As String)";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim ss As String";
_ss = "";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="For Each lg As String In values";
{
final String[] group2 = _values;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lg = group2[index2];
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="ss = addthis(ss, lg, \",\", True)";
_ss = _addthis(_ba,_ss,_lg,",",anywheresoftware.b4a.keywords.Common.True);
 }
};
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Log(title & ss)";
anywheresoftware.b4a.keywords.Common.LogImpl("64325381",_title+_ss,0);
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="End Sub";
return "";
}
public static String  _logchangefile(anywheresoftware.b4a.BA _ba,String _filename,int _origin,int _updated,int _changed,String _filedate) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "logchangefile", false))
	 {return ((String) Debug.delegate(null, "logchangefile", new Object[] {_ba,_filename,_origin,_updated,_changed,_filedate}));}
boolean _doupdate = false;
String _sqlscript = "";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub logChangeFile(filename As String, origin As In";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim doUpdate As Boolean = DBDataExists(Starter.Lo";
_doupdate = _dbdataexists(_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,("select * from log_files where filename='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"'"));
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="If (doUpdate) Then";
if ((_doupdate)) { 
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="Dim sqlScript As String = $\"update log_files set";
_sqlscript = ("update log_files set origin="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_origin))+", changed="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_changed))+", filedate='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filedate))+"' where filename='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"'");
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
 }else {
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="logFile(filename, origin, updated, changed, file";
_logfile(_ba,_filename,_origin,_updated,_changed,_filedate);
 };
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="End Sub";
return "";
}
public static String  _logfile(anywheresoftware.b4a.BA _ba,String _filename,int _origin,int _uploaded,int _changed,String _filedate) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "logfile", false))
	 {return ((String) Debug.delegate(null, "logfile", new Object[] {_ba,_filename,_origin,_uploaded,_changed,_filedate}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.List _insertlist = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub logFile(filename As String, origin As Int, upl";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="params.Put(\"filename\", filename)";
_params.Put((Object)("filename"),(Object)(_filename));
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="params.Put(\"origin\", origin)";
_params.Put((Object)("origin"),(Object)(_origin));
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="params.Put(\"uploaded\", uploaded)";
_params.Put((Object)("uploaded"),(Object)(_uploaded));
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="params.Put(\"changed\", changed)";
_params.Put((Object)("changed"),(Object)(_changed));
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="params.Put(\"filedate\", filedate)";
_params.Put((Object)("filedate"),(Object)(_filedate));
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"log_file";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"log_files",_insertlist);
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _logfilelist(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "logfilelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "logfilelist", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _insertlist = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub logFileList As List";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Return InsertList";
if (true) return _insertlist;
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="End Sub";
return null;
}
public static String  _loglocation(anywheresoftware.b4a.BA _ba,String _loglatitude,String _loglongitude,String _loguser) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "loglocation", false))
	 {return ((String) Debug.delegate(null, "loglocation", new Object[] {_ba,_loglatitude,_loglongitude,_loguser}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.List _insertlist = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub logLocation(loglatitude As String, loglongitud";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="params.Put(\"logdatetime\", GetCurrDatetime)";
_params.Put((Object)("logdatetime"),(Object)(_getcurrdatetime(_ba)));
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="params.Put(\"loguser\", loguser)";
_params.Put((Object)("loguser"),(Object)(_loguser));
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="params.Put(\"loglatitude\", loglatitude)";
_params.Put((Object)("loglatitude"),(Object)(_loglatitude));
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="params.Put(\"loglongitude\", loglongitude)";
_params.Put((Object)("loglongitude"),(Object)(_loglongitude));
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="params.Put(\"logdevice\", ShareCode.APP_Authorizati";
_params.Put((Object)("logdevice"),(Object)(mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="params.Put(\"reported\", 0)";
_params.Put((Object)("reported"),(Object)(0));
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"log_posi";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"log_positions",_insertlist);
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _logs2server(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "logs2server", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "logs2server", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _biglist = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Logs2Server As List";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim BigList As List";
_biglist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="BigList.Initialize";
_biglist.Initialize();
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="params.Put(\"errors\", getLogErrorsList)";
_params.Put((Object)("errors"),(Object)(_getlogerrorslist(_ba).getObject()));
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="BigList.Add(params)";
_biglist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="params.Put(\"positions\", getLogPositionsList)";
_params.Put((Object)("positions"),(Object)(_getlogpositionslist(_ba).getObject()));
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="BigList.Add(params)";
_biglist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="Return BigList";
if (true) return _biglist;
RDebugUtils.currentLine=5963793;
 //BA.debugLineNum = 5963793;BA.debugLine="End Sub";
return null;
}
public static String  _makecomposedbutton(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _cppanel,String _icon,String _texto) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "makecomposedbutton", false))
	 {return ((String) Debug.delegate(null, "makecomposedbutton", new Object[] {_ba,_cppanel,_icon,_texto}));}
anywheresoftware.b4a.objects.LabelWrapper _cplabelicon = null;
anywheresoftware.b4a.objects.LabelWrapper _cplabeltext = null;
int _bcolor = 0;
int _fcolor = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdw = null;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub MakeComposedButton(CPPanel As Panel, Icon As S";
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="CPPanel.LoadLayout(\"CP_ComposedButton_devices_2\"";
_cppanel.LoadLayout("CP_ComposedButton_devices_2",_ba);
 }else {
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="CPPanel.LoadLayout(\"CP_ComposedButton\")";
_cppanel.LoadLayout("CP_ComposedButton",_ba);
 };
RDebugUtils.currentLine=9175054;
 //BA.debugLineNum = 9175054;BA.debugLine="Dim CPLabelIcon As Label = CPPanel.GetView(0)";
_cplabelicon = new anywheresoftware.b4a.objects.LabelWrapper();
_cplabelicon = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cppanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="Dim CPLabelText As Label = CPPanel.GetView(1)";
_cplabeltext = new anywheresoftware.b4a.objects.LabelWrapper();
_cplabeltext = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cppanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=9175056;
 //BA.debugLineNum = 9175056;BA.debugLine="CPLabelIcon.Text = Icon";
_cplabelicon.setText(BA.ObjectToCharSequence(_icon));
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="CPLabelText.Text = Texto";
_cplabeltext.setText(BA.ObjectToCharSequence(_texto));
RDebugUtils.currentLine=9175058;
 //BA.debugLineNum = 9175058;BA.debugLine="Dim bColor As Int = Colors.ARGB(255, 0, 120, 200)";
_bcolor = anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (0),(int) (120),(int) (200));
RDebugUtils.currentLine=9175059;
 //BA.debugLineNum = 9175059;BA.debugLine="Dim fColor As Int = Colors.ARGB(255, 240, 240, 24";
_fcolor = anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (240),(int) (240),(int) (240));
RDebugUtils.currentLine=9175062;
 //BA.debugLineNum = 9175062;BA.debugLine="Dim cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9175063;
 //BA.debugLineNum = 9175063;BA.debugLine="cdw.Initialize2(fColor, 5, 1, bColor)";
_cdw.Initialize2(_fcolor,(int) (5),(int) (1),_bcolor);
RDebugUtils.currentLine=9175064;
 //BA.debugLineNum = 9175064;BA.debugLine="CPPanel.Background = cdw";
_cppanel.setBackground((android.graphics.drawable.Drawable)(_cdw.getObject()));
RDebugUtils.currentLine=9175069;
 //BA.debugLineNum = 9175069;BA.debugLine="End Sub";
return "";
}
public static String  _makecomposedbuttonext(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _cppanel,String _icon,String _texto,xevolution.vrcg.devdemov2400.types._composedbuttondefs _cpdefs) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "makecomposedbuttonext", false))
	 {return ((String) Debug.delegate(null, "makecomposedbuttonext", new Object[] {_ba,_cppanel,_icon,_texto,_cpdefs}));}
anywheresoftware.b4a.objects.LabelWrapper _cplabelicon = null;
anywheresoftware.b4a.objects.LabelWrapper _cplabeltext = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gc = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdw = null;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub MakeComposedButtonExt(CPPanel As Panel, Icon A";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="CPPanel.LoadLayout(\"CP_ComposedButton_devices_2\"";
_cppanel.LoadLayout("CP_ComposedButton_devices_2",_ba);
 }else {
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="CPPanel.LoadLayout(\"CP_ComposedButton\")";
_cppanel.LoadLayout("CP_ComposedButton",_ba);
 };
RDebugUtils.currentLine=9043982;
 //BA.debugLineNum = 9043982;BA.debugLine="Dim CPLabelIcon As Label = CPPanel.GetView(0)";
_cplabelicon = new anywheresoftware.b4a.objects.LabelWrapper();
_cplabelicon = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cppanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="Dim CPLabelText As Label = CPPanel.GetView(1)";
_cplabeltext = new anywheresoftware.b4a.objects.LabelWrapper();
_cplabeltext = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cppanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=9043984;
 //BA.debugLineNum = 9043984;BA.debugLine="CPLabelIcon.Text = Icon";
_cplabelicon.setText(BA.ObjectToCharSequence(_icon));
RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="CPLabelIcon.Color = CPDefs.IconBKColor";
_cplabelicon.setColor(_cpdefs.IconBKColor /*int*/ );
RDebugUtils.currentLine=9043987;
 //BA.debugLineNum = 9043987;BA.debugLine="CPLabelIcon.TextColor = CPDefs.IconColor";
_cplabelicon.setTextColor(_cpdefs.IconColor /*int*/ );
RDebugUtils.currentLine=9043997;
 //BA.debugLineNum = 9043997;BA.debugLine="CPLabelText.Text = Texto";
_cplabeltext.setText(BA.ObjectToCharSequence(_texto));
RDebugUtils.currentLine=9043999;
 //BA.debugLineNum = 9043999;BA.debugLine="CPLabelText.Color = CPDefs.TextSBKColor";
_cplabeltext.setColor(_cpdefs.TextSBKColor /*int*/ );
RDebugUtils.currentLine=9044000;
 //BA.debugLineNum = 9044000;BA.debugLine="CPLabelText.TextColor = CPDefs.TextColor";
_cplabeltext.setTextColor(_cpdefs.TextColor /*int*/ );
RDebugUtils.currentLine=9044010;
 //BA.debugLineNum = 9044010;BA.debugLine="If (CPDefs.TextSBKColor <> CPDefs.TextEBKColor) T";
if ((_cpdefs.TextSBKColor /*int*/ !=_cpdefs.TextEBKColor /*int*/ )) { 
RDebugUtils.currentLine=9044012;
 //BA.debugLineNum = 9044012;BA.debugLine="Dim gc As GradientDrawable";
_gc = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=9044013;
 //BA.debugLineNum = 9044013;BA.debugLine="gc.Initialize(\"TOP_BOTTOM\", Array As Int(CPDefs.";
_gc.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),new int[]{_cpdefs.TextSBKColor /*int*/ ,_cpdefs.TextEBKColor /*int*/ });
RDebugUtils.currentLine=9044014;
 //BA.debugLineNum = 9044014;BA.debugLine="CPLabelText.Background = gc";
_cplabeltext.setBackground((android.graphics.drawable.Drawable)(_gc.getObject()));
 };
RDebugUtils.currentLine=9044018;
 //BA.debugLineNum = 9044018;BA.debugLine="Dim cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9044019;
 //BA.debugLineNum = 9044019;BA.debugLine="cdw.Initialize2(CPDefs.PanelColor, CPDefs.BorderR";
_cdw.Initialize2(_cpdefs.PanelColor /*int*/ ,_cpdefs.BorderRadius /*int*/ ,_cpdefs.BorderWidth /*int*/ ,_cpdefs.BorderColor /*int*/ );
RDebugUtils.currentLine=9044020;
 //BA.debugLineNum = 9044020;BA.debugLine="CPPanel.Background = cdw";
_cppanel.setBackground((android.graphics.drawable.Drawable)(_cdw.getObject()));
RDebugUtils.currentLine=9044026;
 //BA.debugLineNum = 9044026;BA.debugLine="End Sub";
return "";
}
public static String  _makedatetimeslash(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "makedatetimeslash", false))
	 {return ((String) Debug.delegate(null, "makedatetimeslash", new Object[] {_ba}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub MakeDateTimeSlash As String";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="DateTime.DateFormat = \"yyyy/MM/dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy/MM/dd");
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Return $\"$date{DateTime.Now}$time{DateTime.Now}\"$";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _makenulllist(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "makenulllist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "makenulllist", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _retlist = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub MakeNullList As List";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim retList As List";
_retlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="retList.Initialize";
_retlist.Initialize();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Return retList";
if (true) return _retlist;
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
return null;
}
public static String  _makerequesttagcode(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "makerequesttagcode", false))
	 {return ((String) Debug.delegate(null, "makerequesttagcode", new Object[] {_ba}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub MakeRequestTagcode As String";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmmss");
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="Return $\"IE_$date{DateTime.Now}_$time{DateTime.No";
if (true) return ("IE_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_randomint2(_ba,(int) (2))))+"");
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="End Sub";
return "";
}
public static String  _maketabpaneleffect(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _cppanel,int _colorstart,int _colorend) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "maketabpaneleffect", false))
	 {return ((String) Debug.delegate(null, "maketabpaneleffect", new Object[] {_ba,_cppanel,_colorstart,_colorend}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _gc = null;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub MakeTabPanelEffect(CPPanel As Panel, ColorStar";
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="Dim gc As GradientDrawable";
_gc = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="gc.Initialize(\"TOP_BOTTOM\", Array As Int(ColorSta";
_gc.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),new int[]{_colorstart,_colorend});
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="CPPanel.Background = gc";
_cppanel.setBackground((android.graphics.drawable.Drawable)(_gc.getObject()));
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="End Sub";
return "";
}
public static String  _maketagcode(anywheresoftware.b4a.BA _ba,String _prefix) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "maketagcode", false))
	 {return ((String) Debug.delegate(null, "maketagcode", new Object[] {_ba,_prefix}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub MakeTagcode(prefix As String) As String";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmmss");
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Return $\"${prefix}_$date{DateTime.Now}_$time{Date";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_prefix))+"_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_randomint2(_ba,(int) (2))))+"");
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="End Sub";
return "";
}
public static double  _measuremultilinetextheight(anywheresoftware.b4a.BA _ba,Object _actme,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font,double _width,String _text) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "measuremultilinetextheight", false))
	 {return ((Double) Debug.delegate(null, "measuremultilinetextheight", new Object[] {_ba,_actme,_font,_width,_text}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub MeasureMultilineTextHeight (ActMe As Object, F";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim jo As JavaObject = ActMe";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_actme));
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
if (true) return (double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_font),(Object)(_text),(Object)(_width)})));
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="End Sub";
return 0;
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _strtext,int _strstart,int _strlength) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "mid", false))
	 {return ((String) Debug.delegate(null, "mid", new Object[] {_ba,_strtext,_strstart,_strlength}));}
adr.stringfunctions.stringfunctions _strfunc = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Mid(StrText As String, StrStart As Int, StrLen";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Private strfunc As StringFunctions";
_strfunc = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="strfunc.Initialize";
_strfunc._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Return strfunc.Mid(StrText, StrStart, StrLength)";
if (true) return _strfunc._vvvv5(_strtext,_strstart,_strlength);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="End Sub";
return "";
}
public static int  _negativetopositive(anywheresoftware.b4a.BA _ba,int _val) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "negativetopositive", false))
	 {return ((Integer) Debug.delegate(null, "negativetopositive", new Object[] {_ba,_val}));}
String _s = "";
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub NegativeToPositive(val As Int) As Int";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim s As String = val";
_s = BA.NumberToString(_val);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="s = s.Replace(\"-\", \"\")";
_s = _s.replace("-","");
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Return s";
if (true) return (int)(Double.parseDouble(_s));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return 0;
}
public static xevolution.vrcg.devdemov2400.types._pointapi  _new_point(anywheresoftware.b4a.BA _ba,float _nangle,float _nradius,float _centerx,float _centery) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "new_point", false))
	 {return ((xevolution.vrcg.devdemov2400.types._pointapi) Debug.delegate(null, "new_point", new Object[] {_ba,_nangle,_nradius,_centerx,_centery}));}
xevolution.vrcg.devdemov2400.types._pointapi _pt = null;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub New_Point(nAngle As Float, nRadius As F";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Dim pt As PointApi";
_pt = new xevolution.vrcg.devdemov2400.types._pointapi();
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="pt.x = CenterX + (nRadius) * CosD(nAngle)";
_pt.X /*float*/  = (float) (_centerx+(_nradius)*anywheresoftware.b4a.keywords.Common.CosD(_nangle));
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="pt.Y  = CenterY - (nRadius) * SinD(nAngle)";
_pt.Y /*float*/  = (float) (_centery-(_nradius)*anywheresoftware.b4a.keywords.Common.SinD(_nangle));
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Return pt";
if (true) return _pt;
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _queryintent(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.IntentWrapper _intent1) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "queryintent", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "queryintent", new Object[] {_ba,_intent1}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.collections.List _list1 = null;
anywheresoftware.b4a.objects.collections.List _listres = null;
int _i = 0;
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub QueryIntent(Intent1 As Intent) As List";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="r.Target = r.RunMethod(\"getPackageManager\")";
_r.Target = _r.RunMethod("getPackageManager");
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="Dim list1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="list1 = r.RunMethod4(\"queryIntentActivities\", Arr";
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_r.RunMethod4("queryIntentActivities",new Object[]{(Object)(_intent1.getObject()),(Object)(0)},new String[]{"android.content.Intent","java.lang.int"})));
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="Dim listRes As List";
_listres = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="listRes.Initialize";
_listres.Initialize();
RDebugUtils.currentLine=13565963;
 //BA.debugLineNum = 13565963;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=13565964;
 //BA.debugLineNum = 13565964;BA.debugLine="r.Target = list1.Get(i)";
_r.Target = _list1.Get(_i);
RDebugUtils.currentLine=13565965;
 //BA.debugLineNum = 13565965;BA.debugLine="r.Target = r.GetField(\"activityInfo\")";
_r.Target = _r.GetField("activityInfo");
RDebugUtils.currentLine=13565967;
 //BA.debugLineNum = 13565967;BA.debugLine="listRes.Add(r.GetField(\"packageName\"))";
_listres.Add(_r.GetField("packageName"));
 }
};
RDebugUtils.currentLine=13565970;
 //BA.debugLineNum = 13565970;BA.debugLine="Return listRes";
if (true) return _listres;
RDebugUtils.currentLine=13565971;
 //BA.debugLineNum = 13565971;BA.debugLine="End Sub";
return null;
}
public static String  _randomstring(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "randomstring", false))
	 {return ((String) Debug.delegate(null, "randomstring", new Object[] {_ba}));}
int _length = 0;
String _abc = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _randomstr = null;
int _i = 0;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub RandomString() As String";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim length As Int = 15";
_length = (int) (15);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Dim abc As String = \"0123456789ABCDEFGHIJKLMNOPQR";
_abc = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Dim RandomStr As StringBuilder";
_randomstr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="RandomStr.Initialize";
_randomstr.Initialize();
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="For i = 0 To length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))";
_randomstr.Append(BA.ObjectToString(_abc.charAt(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),_abc.length()))));
 }
};
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="Return MakeFileName & RandomStr.ToString";
if (true) return _makefilename(_ba)+_randomstr.ToString();
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="End Sub";
return "";
}
public static String  _randomstring2(anywheresoftware.b4a.BA _ba,int _length) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "randomstring2", false))
	 {return ((String) Debug.delegate(null, "randomstring2", new Object[] {_ba,_length}));}
String _abc = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _randomstr = null;
int _i = 0;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub RandomString2(length As Int) As String";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim abc As String = \"0123456789ABCDEFGHIJKLMNOPQR";
_abc = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Dim RandomStr As StringBuilder";
_randomstr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="RandomStr.Initialize";
_randomstr.Initialize();
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="For i = 0 To length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))";
_randomstr.Append(BA.ObjectToString(_abc.charAt(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),_abc.length()))));
 }
};
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Return RandomStr.ToString";
if (true) return _randomstr.ToString();
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _removeduplicates(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _plist) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "removeduplicates", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "removeduplicates", new Object[] {_ba,_plist}));}
anywheresoftware.b4a.objects.collections.List _lstnew = null;
Object _objitem = null;
int _i = 0;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Sub RemoveDuplicates(pList As List) As List";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="If pList = Null Or Not(pList.IsInitialized) Then";
if (_plist== null || anywheresoftware.b4a.keywords.Common.Not(_plist.IsInitialized())) { 
if (true) return _plist;};
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="Dim lstNew As List : lstNew.Initialize";
_lstnew = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="Dim lstNew As List : lstNew.Initialize";
_lstnew.Initialize();
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="Dim objItem As Object";
_objitem = new Object();
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="For i = 0 To pList.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_plist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="objItem = pList.Get(i)";
_objitem = _plist.Get(_i);
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="If lstNew.IndexOf(objItem) = - 1 Then";
if (_lstnew.IndexOf(_objitem)==-1) { 
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="lstNew.Add(objItem)";
_lstnew.Add(_objitem);
 };
 }
};
RDebugUtils.currentLine=16187405;
 //BA.debugLineNum = 16187405;BA.debugLine="Return lstNew";
if (true) return _lstnew;
RDebugUtils.currentLine=16187406;
 //BA.debugLineNum = 16187406;BA.debugLine="End Sub";
return null;
}
public static String  _replaceformulafields(anywheresoftware.b4a.BA _ba,String _request_tagcode,String _task_tagcode,String _item_tagcode,int _repeatcounter,int _repeatitemcounter,int _repeatfieldcounter,String _formula,String _thistext) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "replaceformulafields", false))
	 {return ((String) Debug.delegate(null, "replaceformulafields", new Object[] {_ba,_request_tagcode,_task_tagcode,_item_tagcode,_repeatcounter,_repeatitemcounter,_repeatfieldcounter,_formula,_thistext}));}
String _formularesult = "";
int _posisstart = 0;
int _counter = 0;
int _posisend = 0;
String _valor = "";
String _getresultvalor = "";
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Sub ReplaceFormulaFields(request_tagcode As String";
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="Log(\"ENTROU EM : ReplaceFormulaFields\")";
anywheresoftware.b4a.keywords.Common.LogImpl("616056323","ENTROU EM : ReplaceFormulaFields",0);
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="Dim FormulaResult As String = Formula.ToUpperCase";
_formularesult = _formula.toUpperCase().replace("[TV]",_thistext);
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="Dim PosisStart As Int = FormulaResult.IndexOf(\"[\"";
_posisstart = _formularesult.indexOf("[");
RDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="Dim counter As Int = 0";
_counter = (int) (0);
RDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="Do While PosisStart >=0";
while (_posisstart>=0) {
RDebugUtils.currentLine=16056329;
 //BA.debugLineNum = 16056329;BA.debugLine="Dim PosisEnd As Int = FormulaResult.IndexOf(\"]\")";
_posisend = _formularesult.indexOf("]");
RDebugUtils.currentLine=16056330;
 //BA.debugLineNum = 16056330;BA.debugLine="Log($\"${PosisStart}, ${PosisEnd}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("616056330",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_posisstart))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_posisend))+""),0);
RDebugUtils.currentLine=16056331;
 //BA.debugLineNum = 16056331;BA.debugLine="If (PosisEnd >= 0) Then";
if ((_posisend>=0)) { 
RDebugUtils.currentLine=16056332;
 //BA.debugLineNum = 16056332;BA.debugLine="Dim Valor As String = FormulaResult.SubString2(";
_valor = _formularesult.substring((int) (_posisstart+1),_posisend);
RDebugUtils.currentLine=16056334;
 //BA.debugLineNum = 16056334;BA.debugLine="Dim getResultValor As String = DBStructures.Get";
_getresultvalor = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select ifnull(execute_value, 0) as valor\n"+"						from dta_requests_values where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_tagcode))+"' \n"+"						and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"						and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_valor))+"' \n"+"						and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"						and repeatitemcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatitemcounter))+"\n"+"						and repeatfieldcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"						limit 1"),"valor");
RDebugUtils.currentLine=16056343;
 //BA.debugLineNum = 16056343;BA.debugLine="If getResultValor =\"\" Then";
if ((_getresultvalor).equals("")) { 
RDebugUtils.currentLine=16056344;
 //BA.debugLineNum = 16056344;BA.debugLine="Dim getResultValor As String = DBStructures.Ge";
_getresultvalor = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (_ba,("select ifnull(execute_value, 0) as valor\n"+"						from dta_requests_values where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_tagcode))+"' \n"+"						and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"						and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_valor))+"' \n"+"						and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"						and repeatitemcounter=0\n"+"						and repeatfieldcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatfieldcounter))+"\n"+"						limit 1"),"valor");
RDebugUtils.currentLine=16056352;
 //BA.debugLineNum = 16056352;BA.debugLine="If  getResultValor = \"\" Then getResultValor =";
if ((_getresultvalor).equals("")) { 
_getresultvalor = "0";};
 };
RDebugUtils.currentLine=16056357;
 //BA.debugLineNum = 16056357;BA.debugLine="FormulaResult = FormulaResult.Replace($\"[${Valo";
_formularesult = _formularesult.replace(("["+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_valor))+"]"),_getresultvalor);
RDebugUtils.currentLine=16056358;
 //BA.debugLineNum = 16056358;BA.debugLine="Dim PosisStart As Int = FormulaResult.IndexOf(\"";
_posisstart = _formularesult.indexOf("[");
RDebugUtils.currentLine=16056359;
 //BA.debugLineNum = 16056359;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 }else {
RDebugUtils.currentLine=16056361;
 //BA.debugLineNum = 16056361;BA.debugLine="Exit";
if (true) break;
 };
 }
;
RDebugUtils.currentLine=16056365;
 //BA.debugLineNum = 16056365;BA.debugLine="Return FormulaResult";
if (true) return _formularesult;
RDebugUtils.currentLine=16056367;
 //BA.debugLineNum = 16056367;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _resizebitmap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,float _scale) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "resizebitmap", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(null, "resizebitmap", new Object[] {_ba,_bmp,_scale}));}
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
anywheresoftware.b4a.objects.B4XCanvas _ss = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _res = null;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub ResizeBitmap(bmp As Bitmap, scale As Float) As";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="img.Initialize(\"\")";
_img.Initialize(_ba,"");
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="img.Width = bmp.Width * scale";
_img.setWidth((int) (_bmp.getWidth()*_scale));
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="img.Height = bmp.Height * scale";
_img.setHeight((int) (_bmp.getHeight()*_scale));
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="Dim ss As B4XCanvas";
_ss = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="ss.Initialize(img)";
_ss.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_img.getObject())));
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="ss.DrawBitmap(bmp, ss.TargetRect)";
_ss.DrawBitmap((android.graphics.Bitmap)(_bmp.getObject()),_ss.getTargetRect());
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="Dim res As Bitmap = ss.CreateBitmap";
_res = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_res = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_ss.CreateBitmap().getObject()));
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="ss.Release";
_ss.Release();
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="End Sub";
return null;
}
public static String  _reversqlfromfilesanddelete(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "reversqlfromfilesanddelete", false))
	 {return ((String) Debug.delegate(null, "reversqlfromfilesanddelete", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _filelist = null;
int _n = 0;
String _filename = "";
String _script = "";
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Sub ReverSQLFromFilesAndDelete";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Dim FileList As List = File.ListFiles(Starter.Int";
_filelist = new anywheresoftware.b4a.objects.collections.List();
_filelist = anywheresoftware.b4a.keywords.Common.File.ListFiles(mostCurrent._starter._internalfolder /*String*/ );
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="For n=0 To FileList.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_filelist.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit2 ;_n = _n + step2 ) {
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="Dim filename As String = FileList.Get(n)";
_filename = BA.ObjectToString(_filelist.Get(_n));
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="If (filename.StartsWith(\"sql_\") And filename.End";
if ((_filename.startsWith("sql_") && _filename.endsWith(".recover"))) { 
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="Dim Script As String = File.ReadString(Starter.";
_script = anywheresoftware.b4a.keywords.Common.File.ReadString(mostCurrent._starter._internalfolder /*String*/ ,_filename);
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="If NNE(Script) Then";
if (_nne(_ba,_script)) { 
RDebugUtils.currentLine=15859719;
 //BA.debugLineNum = 15859719;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(Script)";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_script);
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="File.Delete(Starter.InternalFolder, filename)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._internalfolder /*String*/ ,_filename);
 };
 };
 }
};
RDebugUtils.currentLine=15859724;
 //BA.debugLineNum = 15859724;BA.debugLine="End Sub";
return "";
}
public static String  _right(anywheresoftware.b4a.BA _ba,String _strtext,int _strlength) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "right", false))
	 {return ((String) Debug.delegate(null, "right", new Object[] {_ba,_strtext,_strlength}));}
adr.stringfunctions.stringfunctions _strfunc = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Right(StrText As String, StrLength As Int) As";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Private strfunc As StringFunctions";
_strfunc = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="strfunc.Initialize";
_strfunc._initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Return strfunc.Right(StrText, StrLength)";
if (true) return _strfunc._vvvvv7(_strtext,(long) (_strlength));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="End Sub";
return "";
}
public static String  _saveemail2update(anywheresoftware.b4a.BA _ba,String _request,String _data,int _typelog,xevolution.vrcg.devdemov2400.types._workernewdata _wnd) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "saveemail2update", false))
	 {return ((String) Debug.delegate(null, "saveemail2update", new Object[] {_ba,_request,_data,_typelog,_wnd}));}
String _tablename = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.List _insertlist = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub saveEmail2update(request As String, data As St";
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Dim tablename As String = \"loc_updateemails\"";
_tablename = "loc_updateemails";
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="params.Put(\"up_date\", GetCurrDatetimeExt)";
_params.Put((Object)("up_date"),(Object)(_getcurrdatetimeext(_ba)));
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="params.Put(\"up_state\", 0)";
_params.Put((Object)("up_state"),(Object)(0));
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="params.Put(\"up_type\", typelog)";
_params.Put((Object)("up_type"),(Object)(_typelog));
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="params.Put(\"up_tableurl\", tablename)";
_params.Put((Object)("up_tableurl"),(Object)(_tablename));
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="params.Put(\"up_values\", data)";
_params.Put((Object)("up_values"),(Object)(_data));
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="params.Put(\"up_typeoper\",WND.up_typeoper)";
_params.Put((Object)("up_typeoper"),(Object)(_wnd.up_typeoper /*int*/ ));
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="params.Put(\"up_tagcode\",WND.up_tagcode)";
_params.Put((Object)("up_tagcode"),(Object)(_wnd.up_tagcode /*String*/ ));
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="params.Put(\"up_task\",WND.up_task)";
_params.Put((Object)("up_task"),(Object)(_wnd.up_task /*String*/ ));
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="params.Put(\"up_itemtagcode\",WND.up_itemtagcode)";
_params.Put((Object)("up_itemtagcode"),(Object)(_wnd.up_itemtagcode /*String*/ ));
RDebugUtils.currentLine=7405584;
 //BA.debugLineNum = 7405584;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=7405588;
 //BA.debugLineNum = 7405588;BA.debugLine="Try";
try {RDebugUtils.currentLine=7405589;
 //BA.debugLineNum = 7405589;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, tablenam";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,_tablename,_insertlist);
 } 
       catch (Exception e19) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e19);RDebugUtils.currentLine=7405591;
 //BA.debugLineNum = 7405591;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("67405591",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=7405594;
 //BA.debugLineNum = 7405594;BA.debugLine="End Sub";
return "";
}
public static String  _saveimagefromb64tofile(anywheresoftware.b4a.BA _ba,String _b64,String _filename,String _filetype) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "saveimagefromb64tofile", false))
	 {return ((String) Debug.delegate(null, "saveimagefromb64tofile", new Object[] {_ba,_b64,_filename,_filetype}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img = null;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub SaveImageFromB64ToFile( b64 As String, filenam";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim img As Bitmap = B64ToBitmap(b64)";
_img = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_img = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_b64tobitmap(_ba,_b64).getObject()));
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="SaveImageviewToFile(img, filename, filetype)";
_saveimageviewtofile(_ba,_img,_filename,_filetype);
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="End Sub";
return "";
}
public static String  _saveimageviewtofile(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img,String _filename,String _filetype) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "saveimageviewtofile", false))
	 {return ((String) Debug.delegate(null, "saveimageviewtofile", new Object[] {_ba,_img,_filename,_filetype}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub SaveImageviewToFile(img As Bitmap, filename As";
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Dim Out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Out = File.OpenOutput(Starter.InternalFolder, fil";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(mostCurrent._starter._internalfolder /*String*/ ,_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="img.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALI";
_img.WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,_filetype));
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="Out.Close";
_out.Close();
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="End Sub";
return "";
}
public static boolean  _savesql2fileanddelete(anywheresoftware.b4a.BA _ba,String _table,boolean _continuejob) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "savesql2fileanddelete", false))
	 {return ((Boolean) Debug.delegate(null, "savesql2fileanddelete", new Object[] {_ba,_table,_continuejob}));}
boolean _ret = false;
String _script = "";
String _filename = "";
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Sub SaveSQL2FileAndDelete(table As String, Continu";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim ret As Boolean = ContinueJob";
_ret = _continuejob;
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="If (ret) Then";
if ((_ret)) { 
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="Dim Script As String = GetTableColumnsValues(tab";
_script = _gettablecolumnsvalues(_ba,_table);
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="If NNE(Script) Then";
if (_nne(_ba,_script)) { 
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="Dim filename As String = $\"sql_${table}.recover";
_filename = ("sql_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+".recover");
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="File.WriteString(Starter.InternalFolder, filena";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._starter._internalfolder /*String*/ ,_filename,_script);
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="If (File.Exists(Starter.InternalFolder, filenam";
if ((anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._internalfolder /*String*/ ,_filename))) { 
RDebugUtils.currentLine=15794184;
 //BA.debugLineNum = 15794184;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(("delete from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_table))+""));
RDebugUtils.currentLine=15794185;
 //BA.debugLineNum = 15794185;BA.debugLine="ret = True";
_ret = anywheresoftware.b4a.keywords.Common.True;
 };
 };
 };
RDebugUtils.currentLine=15794189;
 //BA.debugLineNum = 15794189;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=15794190;
 //BA.debugLineNum = 15794190;BA.debugLine="End Sub";
return false;
}
public static int  _securerandomgenerator(anywheresoftware.b4a.BA _ba,int _minimum,int _maximum) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "securerandomgenerator", false))
	 {return ((Integer) Debug.delegate(null, "securerandomgenerator", new Object[] {_ba,_minimum,_maximum}));}
anywheresoftware.b4a.agraham.encryption.CipherWrapper.SecureRandomWrapper _sr = null;
byte[] _data = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int _random = 0;
double _d = 0;
int _res = 0;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub SecureRandomGenerator(Minimum As Int, Maximum";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim sr As SecureRandom";
_sr = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.SecureRandomWrapper();
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim data(4) As Byte";
_data = new byte[(int) (4)];
;
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="sr.GetRandomBytes(data)";
_sr.GetRandomBytes(_data);
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="Dim random As Int = bc.IntsFromBytes(data)(0)";
_random = _bc.IntsFromBytes(_data)[(int) (0)];
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="Maximum = Maximum - 1";
_maximum = (int) (_maximum-1);
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="Dim d As Double = random / 0x7FFFFFFF";
_d = _random/(double)0x7fffffff;
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="Dim res As Int = Round(d * (Maximum - Minimum + 1";
_res = (int) (anywheresoftware.b4a.keywords.Common.Round(_d*(_maximum-_minimum+1)/(double)2+(_minimum+_maximum)/(double)2));
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="End Sub";
return 0;
}
public static String  _sendemail(anywheresoftware.b4a.BA _ba,String _emailto,String _subject,String _details) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "sendemail", false))
	 {return ((String) Debug.delegate(null, "sendemail", new Object[] {_ba,_emailto,_subject,_details}));}
anywheresoftware.b4a.net.SMTPWrapper _esmtp = null;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub SendEmail(EmailTo As String, Subject As String";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Dim eSMTP As SMTP";
_esmtp = new anywheresoftware.b4a.net.SMTPWrapper();
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="eSMTP.Initialize($\"mail.${ShareCode.APPL_HOST}\"$,";
_esmtp.Initialize(("mail."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (587),("alertas@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+""),"..Alertas@VRCG_20!9","");
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="eSMTP.StartTLSMode = True";
_esmtp.setStartTLSMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase.Contains(\"g";
if ((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase().contains("grandative"))) { 
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="eSMTP.MailFrom = \"apoioaocliente@grandative.pt\"";
_esmtp.MailFrom = "apoioaocliente@grandative.pt";
 }else 
{RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase = \"bra";
if (((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("brasfone"))) { 
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="eSMTP.MailFrom = \"info@vehiclestoragefaro.com\"";
_esmtp.MailFrom = "info@vehiclestoragefaro.com";
 }}
;
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="eSMTP.HtmlBody = True";
_esmtp.setHtmlBody(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="eSMTP.To.AddAll(Regex.Split(\"\\;\", EmailTo ))";
_esmtp.getTo().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\;",_emailto)));
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="eSMTP.BCC.Add(\"palpedrinha@gmail.com\")";
_esmtp.getBCC().Add((Object)("palpedrinha@gmail.com"));
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="eSMTP.Subject = Subject";
_esmtp.setSubject(_subject);
RDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="eSMTP.Body = Details";
_esmtp.setBody(_details);
RDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="eSMTP.Send";
_esmtp.Send((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="End Sub";
return "";
}
public static String  _sendemailext(anywheresoftware.b4a.BA _ba,String _emailto,String _emailcc,String _subject,String _details,anywheresoftware.b4a.objects.collections.List _imglist) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "sendemailext", false))
	 {return ((String) Debug.delegate(null, "sendemailext", new Object[] {_ba,_emailto,_emailcc,_subject,_details,_imglist}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Sub SendEmailExt(EmailTo As String, EmailCC As Str";
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Starter.RequestEmailFromBO(\"\",EmailTo,EmailCC, Su";
mostCurrent._starter._requestemailfrombo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("",_emailto,_emailcc,_subject,"");
RDebugUtils.currentLine=14876709;
 //BA.debugLineNum = 14876709;BA.debugLine="End Sub";
return "";
}
public static String  _setbuttonbackgroundcolortomaincolorwithradius(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _radius) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setbuttonbackgroundcolortomaincolorwithradius", false))
	 {return ((String) Debug.delegate(null, "setbuttonbackgroundcolortomaincolorwithradius", new Object[] {_ba,_view,_radius}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdrawable = null;
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub SetButtonBackgroundColorToMainColorWithRadius(";
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Dim CDrawable As ColorDrawable";
_cdrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="CDrawable.Initialize(Consts.ColorMain, radius)";
_cdrawable.Initialize(mostCurrent._consts._colormain /*int*/ ,_radius);
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="view.Background = CDrawable";
_view.setBackground((android.graphics.drawable.Drawable)(_cdrawable.getObject()));
RDebugUtils.currentLine=14090249;
 //BA.debugLineNum = 14090249;BA.debugLine="End Sub";
return "";
}
public static String  _setdialogtitle(anywheresoftware.b4a.BA _ba,Object _dialog,String _title) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setdialogtitle", false))
	 {return ((String) Debug.delegate(null, "setdialogtitle", new Object[] {_ba,_dialog,_title}));}
anywheresoftware.b4a.objects.CSBuilder _cs = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub SetDialogtitle(dialog As Object, Title As Stri";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Dim jo As JavaObject = dialog";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_dialog));
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="jo.RunMethod(\"setTitle\", Array(cs.Initialize.Appe";
_jo.RunMethod("setTitle",new Object[]{(Object)(_cs.Initialize().Append(BA.ObjectToCharSequence(_title)).PopAll().getObject())});
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _setfontsizelist(anywheresoftware.b4a.BA _ba,int _fontsize,anywheresoftware.b4a.objects.collections.List _inlist) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setfontsizelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "setfontsizelist", new Object[] {_ba,_fontsize,_inlist}));}
anywheresoftware.b4a.objects.CSBuilder _cs = null;
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub SetFontSizeList(fontsize As Int, inList As Lis";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="For i = 0 To inList.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_inlist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="Items.Add( cs.Initialize.Typeface(Typeface.DEFAU";
_items.Add((Object)(_cs.Initialize().Typeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT).Append(BA.ObjectToCharSequence(_inlist.Get(_i))).PopAll().getObject()));
 }
};
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="Return Items";
if (true) return _items;
RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="End Sub";
return null;
}
public static String  _setnhours(anywheresoftware.b4a.BA _ba,int _hours,String _currhora) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setnhours", false))
	 {return ((String) Debug.delegate(null, "setnhours", new Object[] {_ba,_hours,_currhora}));}
long _currentime = 0L;
long _newtime = 0L;
b4a.example.dateutils._period _p1 = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub SetNHours(hours As Int, CurrHora As String) As";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="DateTime.timeFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="If NNE(CurrHora) Then";
if (_nne(_ba,_currhora)) { 
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="Dim Currentime As Long = DateTime.TimeParse(Curr";
_currentime = anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(_currhora);
 }else {
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="Dim Currentime As Long = DateTime.Now";
_currentime = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 };
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="Dim NewTime As Long";
_newtime = 0L;
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="Dim p1 As Period";
_p1 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="p1.Hours = hours";
_p1.Hours = _hours;
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="NewTime = DateUtils.AddPeriod(Currentime, p1)";
_newtime = mostCurrent._dateutils._addperiod(_ba,_currentime,_p1);
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="Return DateTime.time(NewTime)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Time(_newtime);
RDebugUtils.currentLine=11665421;
 //BA.debugLineNum = 11665421;BA.debugLine="End Sub";
return "";
}
public static String  _setprogressdrawable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ProgressBarWrapper _p,Object _drawable) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setprogressdrawable", false))
	 {return ((String) Debug.delegate(null, "setprogressdrawable", new Object[] {_ba,_p,_drawable}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
Object _clipdrawable = null;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub SetProgressDrawable(p As ProgressBar, drawable";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Dim clipDrawable As Object";
_clipdrawable = new Object();
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="clipDrawable = r.CreateObject2(\"android.graphics.";
_clipdrawable = _r.CreateObject2("android.graphics.drawable.ClipDrawable",new Object[]{_drawable,(Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),(Object)(1)},new String[]{"android.graphics.drawable.Drawable","java.lang.int","java.lang.int"});
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="r.Target = p";
_r.Target = (Object)(_p.getObject());
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="r.Target = r.RunMethod(\"getProgressDrawable\") 'Ge";
_r.Target = _r.RunMethod("getProgressDrawable");
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="r.RunMethod4(\"setDrawableByLayerId\", Array As Obj";
_r.RunMethod4("setDrawableByLayerId",new Object[]{_r.GetStaticField("android.R$id","progress"),_clipdrawable},new String[]{"java.lang.int","android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="End Sub";
return "";
}
public static String  _setviewbackgroundcolortomaingradientcolor(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _view) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setviewbackgroundcolortomaingradientcolor", false))
	 {return ((String) Debug.delegate(null, "setviewbackgroundcolortomaingradientcolor", new Object[] {_ba,_view}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdrawable = null;
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub SetViewBackgroundColorToMainGradientColor(view";
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Dim GDrawable As GradientDrawable";
_gdrawable = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="GDrawable.Initialize(\"TOP_BOTTOM\", Array As Int(C";
_gdrawable.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),new int[]{mostCurrent._consts._colormain /*int*/ ,mostCurrent._consts._colorsub /*int*/ });
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="view.Background = GDrawable";
_view.setBackground((android.graphics.drawable.Drawable)(_gdrawable.getObject()));
RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="End Sub";
return "";
}
public static void  _showcustomtoast(anywheresoftware.b4a.BA _ba,Object _text,boolean _longduration,int _times2show,int _backgroundcolor) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "showcustomtoast", false))
	 {Debug.delegate(null, "showcustomtoast", new Object[] {_ba,_text,_longduration,_times2show,_backgroundcolor}); return;}
ResumableSub_ShowCustomToast rsub = new ResumableSub_ShowCustomToast(null,_ba,_text,_longduration,_times2show,_backgroundcolor);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
}
public static class ResumableSub_ShowCustomToast extends BA.ResumableSub {
public ResumableSub_ShowCustomToast(xevolution.vrcg.devdemov2400.utils parent,anywheresoftware.b4a.BA _ba,Object _text,boolean _longduration,int _times2show,int _backgroundcolor) {
this.parent = parent;
this._ba = _ba;
this._text = _text;
this._longduration = _longduration;
this._times2show = _times2show;
this._backgroundcolor = _backgroundcolor;
}
xevolution.vrcg.devdemov2400.utils parent;
anywheresoftware.b4a.BA _ba;
Object _text;
boolean _longduration;
int _times2show;
int _backgroundcolor;
anywheresoftware.b4j.object.JavaObject _ctxt = null;
int _duration = 0;
anywheresoftware.b4j.object.JavaObject _toast = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
int _x = 0;
int step14;
int limit14;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utils";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="Dim duration As Int";
_duration = 0;
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="If LongDuration Then duration = 1 Else duration =";
if (true) break;

case 1:
//if
this.state = 8;
if (_longduration) { 
this.state = 3;
;}
else {
this.state = 5;
;}if (true) break;

case 3:
//C
this.state = 8;
_duration = (int) (1);
if (true) break;

case 5:
//C
this.state = 8;
_duration = (int) (0);
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="Dim toast As JavaObject";
_toast = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="toast = toast.InitializeStatic(\"android.widget.To";
_toast = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_toast.InitializeStatic("android.widget.Toast").RunMethod("makeText",new Object[]{(Object)(_ctxt.getObject()),_text,(Object)(_duration)})));
RDebugUtils.currentLine=15925256;
 //BA.debugLineNum = 15925256;BA.debugLine="Dim v As View = toast.RunMethod(\"getView\", Null)";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_toast.RunMethod("getView",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=15925257;
 //BA.debugLineNum = 15925257;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=15925258;
 //BA.debugLineNum = 15925258;BA.debugLine="cd.Initialize(BackgroundColor, 20dip)";
_cd.Initialize(_backgroundcolor,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=15925259;
 //BA.debugLineNum = 15925259;BA.debugLine="v.Background = cd";
_v.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=15925261;
 //BA.debugLineNum = 15925261;BA.debugLine="toast.RunMethod(\"setGravity\", Array(Bit.Or(Gravit";
_toast.RunMethod("setGravity",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL,anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL)),(Object)(0),(Object)(0)});
RDebugUtils.currentLine=15925262;
 //BA.debugLineNum = 15925262;BA.debugLine="toast.RunMethod(\"show\", Null)";
_toast.RunMethod("show",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=15925264;
 //BA.debugLineNum = 15925264;BA.debugLine="If Times2Show > 0 Then";
if (true) break;

case 9:
//if
this.state = 16;
if (_times2show>0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=15925265;
 //BA.debugLineNum = 15925265;BA.debugLine="For x=1 To Times2Show";
if (true) break;

case 12:
//for
this.state = 15;
step14 = 1;
limit14 = _times2show;
_x = (int) (1) ;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 15;
if ((step14 > 0 && _x <= limit14) || (step14 < 0 && _x >= limit14)) this.state = 14;
if (true) break;

case 18:
//C
this.state = 17;
_x = ((int)(0 + _x + step14)) ;
if (true) break;

case 14:
//C
this.state = 18;
RDebugUtils.currentLine=15925266;
 //BA.debugLineNum = 15925266;BA.debugLine="Sleep(3750)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utils", "showcustomtoast"),(int) (3750));
this.state = 19;
return;
case 19:
//C
this.state = 18;
;
RDebugUtils.currentLine=15925267;
 //BA.debugLineNum = 15925267;BA.debugLine="toast.RunMethod(\"show\", Null)";
_toast.RunMethod("show",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;
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
RDebugUtils.currentLine=15925271;
 //BA.debugLineNum = 15925271;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _showlog(anywheresoftware.b4a.BA _ba,String _text,String _value,boolean _division) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "showlog", false))
	 {return ((String) Debug.delegate(null, "showlog", new Object[] {_ba,_text,_value,_division}));}
String _strdiv = "";
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub ShowLog(Text As String, Value As String, Divis";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If Division Then";
if (_division) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Dim StrDiv As String = IncChars(Text.Length+Valu";
_strdiv = _incchars(_ba,(int) (_text.length()+_value.length()+2),"=",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Log($\"${StrDiv}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("65111811",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strdiv))+""),0);
 };
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Log($\"${Text}: ${Value}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("65111813",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_text))+": "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+""),0);
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="End Sub";
return "";
}
public static String  _showloglist(anywheresoftware.b4a.BA _ba,String _text,anywheresoftware.b4a.objects.collections.List _value) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "showloglist", false))
	 {return ((String) Debug.delegate(null, "showloglist", new Object[] {_ba,_text,_value}));}
String _strdiv = "";
int _n = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub ShowLogList(Text As String, Value As List)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Log($\"${Text}: Lista de valores\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("65242881",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_text))+": Lista de valores"),0);
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim StrDiv As String = IncChars(Text.Length+2, \"=";
_strdiv = _incchars(_ba,(int) (_text.length()+2),"=",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="If (Value.Size >= 1) Then";
if ((_value.getSize()>=1)) { 
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="For n=0 To Value.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_value.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit4 ;_n = _n + step4 ) {
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Log($\"${StrDiv}- ${Value.Get(n)}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("65242885",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strdiv))+"- "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_value.Get(_n))+""),0);
 }
};
 }else {
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="Log($\"${StrDiv}- Sem valores\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("65242888",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strdiv))+"- Sem valores"),0);
 };
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="End Sub";
return "";
}
public static boolean  _sitoboolean(anywheresoftware.b4a.BA _ba,String _v) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "sitoboolean", false))
	 {return ((Boolean) Debug.delegate(null, "sitoboolean", new Object[] {_ba,_v}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub SIToBoolean(v As String) As Boolean";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="If (v.ToUpperCase = \"NO\") Or (v = \"0\") Then";
if (((_v.toUpperCase()).equals("NO")) || ((_v).equals("0"))) { 
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _str2list(anywheresoftware.b4a.BA _ba,String _inlist,String _divider) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "str2list", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "str2list", new Object[] {_ba,_inlist,_divider}));}
anywheresoftware.b4a.objects.collections.List _sret = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub Str2List(inList As String, divider As String)";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="If NNE(inList) Then";
if (_nne(_ba,_inlist)) { 
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Dim sRet As List = Regex.Split($\"\\${divider}\"$,";
_sret = new anywheresoftware.b4a.objects.collections.List();
_sret = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(("\\"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_divider))+""),_inlist));
 }else {
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Dim sRet As List : sRet.Initialize";
_sret = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Dim sRet As List : sRet.Initialize";
_sret.Initialize();
 };
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="Return sRet";
if (true) return _sret;
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="End Sub";
return null;
}
public static String  _strcnllist2sqlarray(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _inlist,boolean _isname) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "strcnllist2sqlarray", false))
	 {return ((String) Debug.delegate(null, "strcnllist2sqlarray", new Object[] {_ba,_inlist,_isname}));}
String _sret = "";
int _i = 0;
xevolution.vrcg.devdemov2400.types._codenamelist _r = null;
String _value = "";
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub StrCNLList2SQLArray(inList As List, isName As";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Dim sRet As String = \"\"";
_sret = "";
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="For i=0 To inList.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_inlist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Dim r As CodeNameList = inList.Get(i)";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(_inlist.Get(_i));
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Dim value As String = r.TagCode";
_value = _r.TagCode /*String*/ ;
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="If isName=True Then value = r.Name";
if (_isname==anywheresoftware.b4a.keywords.Common.True) { 
_value = _r.Name /*String*/ ;};
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="If (sRet <> \"\") Then sRet = $\"${sRet},\"$";
if (((_sret).equals("") == false)) { 
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+",");};
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="sRet = $\"${sRet}'${value}'\"$";
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+"'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value))+"'");
 }
};
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="sRet = $\"(${sRet})\"$";
_sret = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+")");
RDebugUtils.currentLine=9371659;
 //BA.debugLineNum = 9371659;BA.debugLine="Return sRet";
if (true) return _sret;
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="End Sub";
return "";
}
public static boolean  _string2bool(anywheresoftware.b4a.BA _ba,String _instr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "string2bool", false))
	 {return ((Boolean) Debug.delegate(null, "string2bool", new Object[] {_ba,_instr}));}
boolean _ret = false;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub String2Bool(inStr As String) As Boolean";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="If inStr = \"True\" Then ret = True";
if ((_instr).equals("True")) { 
_ret = anywheresoftware.b4a.keywords.Common.True;};
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="End Sub";
return false;
}
public static long  _striptime(anywheresoftware.b4a.BA _ba,long _ticks) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "striptime", false))
	 {return ((Long) Debug.delegate(null, "striptime", new Object[] {_ba,_ticks}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub StripTime(Ticks As Long) As Long";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Return(DateTime.DateParse(DateTime.Date(Ticks)))";
if (true) return (anywheresoftware.b4a.keywords.Common.DateTime.DateParse(anywheresoftware.b4a.keywords.Common.DateTime.Date(_ticks)));
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return 0L;
}
public static String  _strlist2sqlarray(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _inlist) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "strlist2sqlarray", false))
	 {return ((String) Debug.delegate(null, "strlist2sqlarray", new Object[] {_ba,_inlist}));}
String _sret = "";
int _i = 0;
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub StrList2SQLArray(inList As List) As String";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Dim sRet As String = \"\"";
_sret = "";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="For i=0 To inList.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_inlist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="If (sRet <> \"\") Then sRet = $\"${sRet},\"$";
if (((_sret).equals("") == false)) { 
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+",");};
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="sRet = $\"${sRet}'${inList.Get(i)}'\"$";
_sret = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+"'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_inlist.Get(_i))+"'");
 }
};
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="If (NNE(sRet)) Then";
if ((_nne(_ba,_sret))) { 
RDebugUtils.currentLine=9437192;
 //BA.debugLineNum = 9437192;BA.debugLine="sRet = $\"(${sRet})\"$";
_sret = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sret))+")");
 }else {
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="sRet = $\"('')\"$";
_sret = ("('')");
 };
RDebugUtils.currentLine=9437196;
 //BA.debugLineNum = 9437196;BA.debugLine="Return sRet";
if (true) return _sret;
RDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="End Sub";
return "";
}
public static boolean  _test4true(anywheresoftware.b4a.BA _ba,String _tv,String _formula,anywheresoftware.b4a.objects.B4XViewWrapper _this) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "test4true", false))
	 {return ((Boolean) Debug.delegate(null, "test4true", new Object[] {_ba,_tv,_formula,_this}));}
boolean _ret = false;
anywheresoftware.b4a.objects.collections.List _blocks = null;
int _n = 0;
String _str = "";
boolean _vbool = false;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Test4True(tv As String, Formula As String, thi";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Formula = Formula.ToLowerCase.Replace(\"[tv]\", tv)";
_formula = _formula.toLowerCase().replace("[tv]",_tv).replace("tv",_tv);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Dim Blocks As List = FormulaInBlocks(Formula)";
_blocks = new anywheresoftware.b4a.objects.collections.List();
_blocks = _formulainblocks(_ba,_formula);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="If (Blocks.Size >= 1) Then";
if ((_blocks.getSize()>=1)) { 
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="ret = True";
_ret = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="For n = 0 To Blocks.Size-1";
{
final int step6 = 1;
final int limit6 = (int) (_blocks.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit6 ;_n = _n + step6 ) {
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Dim str As String = Blocks.Get(n)";
_str = BA.ObjectToString(_blocks.Get(_n));
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Dim vbool As Boolean = CompareValuesCondition(s";
_vbool = _comparevaluescondition(_ba,_str,_this);
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="ret = ret And vbool";
_ret = _ret && _vbool;
 }
};
 };
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="End Sub";
return false;
}
public static boolean  _test4truelist(anywheresoftware.b4a.BA _ba,String _tv,anywheresoftware.b4a.objects.collections.List _cv,String _formula,anywheresoftware.b4a.objects.B4XViewWrapper _this) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "test4truelist", false))
	 {return ((Boolean) Debug.delegate(null, "test4truelist", new Object[] {_ba,_tv,_cv,_formula,_this}));}
int _n = 0;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Test4TrueList(tv As String, cv As List, Formul";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="For n=0 To cv.Size";
{
final int step1 = 1;
final int limit1 = _cv.getSize();
_n = (int) (0) ;
for (;_n <= limit1 ;_n = _n + step1 ) {
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Formula = Formula.Replace($\"[cv${n}]\"$, cv.Get(n";
_formula = _formula.replace(("[cv"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+"]"),BA.ObjectToString(_cv.Get(_n))).replace(("cv"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+""),BA.ObjectToString(_cv.Get(_n)));
 }
};
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Return Test4True(tv, Formula,this)";
if (true) return _test4true(_ba,_tv,_formula,_this);
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="End Sub";
return false;
}
public static boolean  _test4trueonlyvalues(anywheresoftware.b4a.BA _ba,String _formula) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "test4trueonlyvalues", false))
	 {return ((Boolean) Debug.delegate(null, "test4trueonlyvalues", new Object[] {_ba,_formula}));}
boolean _ret = false;
anywheresoftware.b4a.objects.collections.List _blocks = null;
int _n = 0;
String _str = "";
boolean _vbool = false;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub Test4TrueOnlyValues(Formula As String) As Bool";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim Blocks As List = FormulaInBlocks(Formula)";
_blocks = new anywheresoftware.b4a.objects.collections.List();
_blocks = _formulainblocks(_ba,_formula);
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="If (Blocks.Size >= 1) Then";
if ((_blocks.getSize()>=1)) { 
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="ret = True";
_ret = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="For n = 0 To Blocks.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (_blocks.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Dim str As String = Blocks.Get(n)";
_str = BA.ObjectToString(_blocks.Get(_n));
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="Dim vbool As Boolean = CompareOnlyValuesConditi";
_vbool = _compareonlyvaluescondition(_ba,_str);
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="ret = ret And vbool";
_ret = _ret && _vbool;
 }
};
 };
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.Map  _textjson2map(anywheresoftware.b4a.BA _ba,String _resultstr) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "textjson2map", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "textjson2map", new Object[] {_ba,_resultstr}));}
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub TextJSON2MAP(ResultStr As String) As Map";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\") The";
if (((mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv6(_resultstr,(long) (1))).equals("["))) { 
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrFunc";
_resultstr = mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvvvvv4(mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvv5(_resultstr,(int) (2),(int) (mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv7(_resultstr)-1)));
 };
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="JSON1.Initialize(ResultStr)";
_json1.Initialize(_resultstr);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Return MapJSON";
if (true) return _mapjson;
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="End Sub";
return null;
}
public static String  _udid(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "udid", false))
	 {return ((String) Debug.delegate(null, "udid", new Object[] {_ba}));}
anywheresoftware.b4a.agraham.encryption.CipherWrapper.SecureRandomWrapper _sr = null;
byte[] _data = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
String _hex = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _stp = 0;
String _ret = "";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub udid As String";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim sr As SecureRandom";
_sr = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.SecureRandomWrapper();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim data(16) As Byte";
_data = new byte[(int) (16)];
;
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="sr.GetRandomBytes(data)";
_sr.GetRandomBytes(_data);
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="Dim hex As String = bc.HexFromBytes(data)";
_hex = _bc.HexFromBytes(_data);
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group9 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen9 = group9.length
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_stp = (int)(BA.ObjectToNumber(group9[index9]));
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="sb.Append(hex.SubString2(i, i + stp))";
_sb.Append(_hex.substring(_i,(int) (_i+_stp)));
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="i = i + stp";
_i = (int) (_i+_stp);
 }
};
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="Dim Ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=6422543;
 //BA.debugLineNum = 6422543;BA.debugLine="If (sb.Length >= 1) Then";
if ((_sb.getLength()>=1)) { 
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="Ret = sb.ToString";
_ret = _sb.ToString();
 }else {
RDebugUtils.currentLine=6422546;
 //BA.debugLineNum = 6422546;BA.debugLine="Ret = GenerateTagcode(\"PRE_\" )";
_ret = _generatetagcode(_ba,"PRE_");
 };
RDebugUtils.currentLine=6422548;
 //BA.debugLineNum = 6422548;BA.debugLine="Return Ret";
if (true) return _ret;
RDebugUtils.currentLine=6422549;
 //BA.debugLineNum = 6422549;BA.debugLine="End Sub";
return "";
}
public static String  _viewfile(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "viewfile", false))
	 {return ((String) Debug.delegate(null, "viewfile", new Object[] {_ba,_filename}));}
anywheresoftware.b4a.objects.IntentWrapper _intentfile = null;
String _intentfiletype = "";
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub ViewFile(filename As String)";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim IntentFile As Intent";
_intentfile = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="IntentFile.Initialize(IntentFile.ACTION_VIEW, Sta";
_intentfile.Initialize(_intentfile.ACTION_VIEW,BA.ObjectToString(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._getfileuri /*Object*/ (null,_filename)));
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Dim IntentFileType As String = GetIntentFileType(";
_intentfiletype = _getintentfiletype(_ba,_filename);
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Log(IntentFileType)";
anywheresoftware.b4a.keywords.Common.LogImpl("66881284",_intentfiletype,0);
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="IntentFile.SetType(IntentFileType)";
_intentfile.SetType(_intentfiletype);
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="IntentFile.Flags = 1 'FLAG_GRANT_READ_URI_PERMISS";
_intentfile.setFlags((int) (1));
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="Try";
try {RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="StartActivity(IntentFile)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(_intentfile.getObject()));
 } 
       catch (Exception e10) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e10);RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="ToastMessageShow(\"Você nao tem aplicação para ab";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Você nao tem aplicação para abrir este tipo de arquivo"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="End Sub";
return "";
}
public static String  _viewpdffile(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "viewpdffile", false))
	 {return ((String) Debug.delegate(null, "viewpdffile", new Object[] {_ba,_filename}));}
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
String _applicationtype = "";
anywheresoftware.b4a.objects.collections.List _pdfappslist = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub ViewPDFFile(filename As String)";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, Starter.P";
_intent1.Initialize(_intent1.ACTION_VIEW,BA.ObjectToString(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._getfileuri /*Object*/ (null,_filename)));
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="Dim ApplicationType As String = GetDocType(filena";
_applicationtype = _getdoctype(_ba,_filename);
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Intent1.SetType(ApplicationType)";
_intent1.SetType(_applicationtype);
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="Intent1.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION";
_intent1.setFlags((int) (1));
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="Dim pdfAppsList As List";
_pdfappslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="pdfAppsList = QueryIntent(Intent1)";
_pdfappslist = _queryintent(_ba,_intent1);
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="If pdfAppsList.size>0 Then";
if (_pdfappslist.getSize()>0) { 
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="StartActivity(Intent1)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(_intent1.getObject()));
 };
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="End Sub";
return "";
}
public static String  _zeroleft(anywheresoftware.b4a.BA _ba,String _strtext,int _strlength) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "zeroleft", false))
	 {return ((String) Debug.delegate(null, "zeroleft", new Object[] {_ba,_strtext,_strlength}));}
int _difnum = 0;
int _n = 0;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub ZeroLeft(StrText As String, StrLength As Int)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim difnum As Int = StrLength - StrText.Length";
_difnum = (int) (_strlength-_strtext.length());
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="If (difnum > 0) Then";
if ((_difnum>0)) { 
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="For n=0 To difnum-1";
{
final int step3 = 1;
final int limit3 = (int) (_difnum-1);
_n = (int) (0) ;
for (;_n <= limit3 ;_n = _n + step3 ) {
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="StrText = $\"0${StrText}\"$";
_strtext = ("0"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strtext))+"");
 }
};
 };
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Return StrText";
if (true) return _strtext;
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="End Sub";
return "";
}
}