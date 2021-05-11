package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbutils {
private static dbutils mostCurrent = new dbutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
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
public static String  _insertmaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "insertmaps", false))
	 {return ((String) Debug.delegate(null, "insertmaps", new Object[] {_ba,_sql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=136118272;
 //BA.debugLineNum = 136118272;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=136118273;
 //BA.debugLineNum = 136118273;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=136118275;
 //BA.debugLineNum = 136118275;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=136118276;
 //BA.debugLineNum = 136118276;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("6136118276","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=136118277;
 //BA.debugLineNum = 136118277;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=136118279;
 //BA.debugLineNum = 136118279;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=136118280;
 //BA.debugLineNum = 136118280;BA.debugLine="Try";
try {RDebugUtils.currentLine=136118281;
 //BA.debugLineNum = 136118281;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
RDebugUtils.currentLine=136118282;
 //BA.debugLineNum = 136118282;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=136118283;
 //BA.debugLineNum = 136118283;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=136118284;
 //BA.debugLineNum = 136118284;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=136118285;
 //BA.debugLineNum = 136118285;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136118286;
 //BA.debugLineNum = 136118286;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=136118287;
 //BA.debugLineNum = 136118287;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=136118288;
 //BA.debugLineNum = 136118288;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=136118289;
 //BA.debugLineNum = 136118289;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = _m.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=136118290;
 //BA.debugLineNum = 136118290;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=136118291;
 //BA.debugLineNum = 136118291;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=136118292;
 //BA.debugLineNum = 136118292;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=136118293;
 //BA.debugLineNum = 136118293;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=136118295;
 //BA.debugLineNum = 136118295;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_ba,_col));
RDebugUtils.currentLine=136118296;
 //BA.debugLineNum = 136118296;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=136118297;
 //BA.debugLineNum = 136118297;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=136118299;
 //BA.debugLineNum = 136118299;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=136118300;
 //BA.debugLineNum = 136118300;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("6136118300","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=136118301;
 //BA.debugLineNum = 136118301;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=136118303;
 //BA.debugLineNum = 136118303;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e32) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e32);RDebugUtils.currentLine=136118305;
 //BA.debugLineNum = 136118305;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6136118305",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=136118311;
 //BA.debugLineNum = 136118311;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=136118313;
 //BA.debugLineNum = 136118313;BA.debugLine="End Sub";
return "";
}
public static String  _cleartable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "cleartable", false))
	 {return ((String) Debug.delegate(null, "cleartable", new Object[] {_ba,_sql,_tablename}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _ssql = "";
RDebugUtils.currentLine=137166848;
 //BA.debugLineNum = 137166848;BA.debugLine="Public Sub ClearTable(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=137166849;
 //BA.debugLineNum = 137166849;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=137166850;
 //BA.debugLineNum = 137166850;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=137166851;
 //BA.debugLineNum = 137166851;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_ba,_tablename)+" WHERE 1=1");
RDebugUtils.currentLine=137166852;
 //BA.debugLineNum = 137166852;BA.debugLine="Dim sSQL As String = sb.ToString";
_ssql = _sb.ToString();
RDebugUtils.currentLine=137166853;
 //BA.debugLineNum = 137166853;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6137166853",_ssql,0);
RDebugUtils.currentLine=137166854;
 //BA.debugLineNum = 137166854;BA.debugLine="SQL.ExecNonQuery(sSQL)";
_sql.ExecNonQuery(_ssql);
RDebugUtils.currentLine=137166855;
 //BA.debugLineNum = 137166855;BA.debugLine="End Sub";
return "";
}
public static boolean  _tableexists(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "tableexists", false))
	 {return ((Boolean) Debug.delegate(null, "tableexists", new Object[] {_ba,_sql,_tablename}));}
int _count = 0;
RDebugUtils.currentLine=137297920;
 //BA.debugLineNum = 137297920;BA.debugLine="Public Sub TableExists(SQL As SQL, TableName As St";
RDebugUtils.currentLine=137297921;
 //BA.debugLineNum = 137297921;BA.debugLine="Dim count As Int = SQL.ExecQuerySingleResult2(\"SE";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult2("SELECT count(name) FROM sqlite_master WHERE type='table' AND name=? COLLATE NOCASE",new String[]{_tablename})));
RDebugUtils.currentLine=137297922;
 //BA.debugLineNum = 137297922;BA.debugLine="Return count > 0";
if (true) return _count>0;
RDebugUtils.currentLine=137297923;
 //BA.debugLineNum = 137297923;BA.debugLine="End Sub";
return false;
}
public static String  _updaterecord2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord2", false))
	 {return ((String) Debug.delegate(null, "updaterecord2", new Object[] {_ba,_sql,_tablename,_fields,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=137035776;
 //BA.debugLineNum = 137035776;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=137035777;
 //BA.debugLineNum = 137035777;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=137035778;
 //BA.debugLineNum = 137035778;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6137035778","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=137035779;
 //BA.debugLineNum = 137035779;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=137035781;
 //BA.debugLineNum = 137035781;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=137035782;
 //BA.debugLineNum = 137035782;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6137035782","Fields empty",0);
RDebugUtils.currentLine=137035783;
 //BA.debugLineNum = 137035783;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=137035785;
 //BA.debugLineNum = 137035785;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=137035786;
 //BA.debugLineNum = 137035786;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=137035787;
 //BA.debugLineNum = 137035787;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_ba,_tablename)).Append(" SET ");
RDebugUtils.currentLine=137035788;
 //BA.debugLineNum = 137035788;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=137035789;
 //BA.debugLineNum = 137035789;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=137035790;
 //BA.debugLineNum = 137035790;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=137035791;
 //BA.debugLineNum = 137035791;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
_sb.Append(_escapefield(_ba,_col)).Append("=?");
RDebugUtils.currentLine=137035792;
 //BA.debugLineNum = 137035792;BA.debugLine="sb.Append(\",\")";
_sb.Append(",");
RDebugUtils.currentLine=137035793;
 //BA.debugLineNum = 137035793;BA.debugLine="args.Add(Fields.Get(col))";
_args.Add(_fields.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=137035795;
 //BA.debugLineNum = 137035795;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=137035796;
 //BA.debugLineNum = 137035796;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=137035797;
 //BA.debugLineNum = 137035797;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _wherefieldequals.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=137035798;
 //BA.debugLineNum = 137035798;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
RDebugUtils.currentLine=137035799;
 //BA.debugLineNum = 137035799;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
RDebugUtils.currentLine=137035800;
 //BA.debugLineNum = 137035800;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=137035802;
 //BA.debugLineNum = 137035802;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
RDebugUtils.currentLine=137035803;
 //BA.debugLineNum = 137035803;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6137035803","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=137035804;
 //BA.debugLineNum = 137035804;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=137035805;
 //BA.debugLineNum = 137035805;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executememorytable", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executememorytable", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=136314880;
 //BA.debugLineNum = 136314880;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=136314881;
 //BA.debugLineNum = 136314881;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=136314882;
 //BA.debugLineNum = 136314882;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=136314883;
 //BA.debugLineNum = 136314883;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=136314885;
 //BA.debugLineNum = 136314885;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
RDebugUtils.currentLine=136314886;
 //BA.debugLineNum = 136314886;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("6136314886","ExecuteMemoryTable: "+_query,0);
RDebugUtils.currentLine=136314887;
 //BA.debugLineNum = 136314887;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136314888;
 //BA.debugLineNum = 136314888;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=136314889;
 //BA.debugLineNum = 136314889;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=136314890;
 //BA.debugLineNum = 136314890;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=136314891;
 //BA.debugLineNum = 136314891;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=136314892;
 //BA.debugLineNum = 136314892;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=136314894;
 //BA.debugLineNum = 136314894;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=136314895;
 //BA.debugLineNum = 136314895;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=136314897;
 //BA.debugLineNum = 136314897;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=136314898;
 //BA.debugLineNum = 136314898;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=136314899;
 //BA.debugLineNum = 136314899;BA.debugLine="End Sub";
return null;
}
public static String  _insertmaps2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps,anywheresoftware.b4a.objects.collections.List _condition) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "insertmaps2", false))
	 {return ((String) Debug.delegate(null, "insertmaps2", new Object[] {_ba,_sql,_tablename,_listofmaps,_condition}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _mid = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=136183808;
 //BA.debugLineNum = 136183808;BA.debugLine="Public Sub InsertMaps2(SQL As SQL, TableName As St";
RDebugUtils.currentLine=136183809;
 //BA.debugLineNum = 136183809;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=136183811;
 //BA.debugLineNum = 136183811;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=136183812;
 //BA.debugLineNum = 136183812;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("6136183812","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=136183813;
 //BA.debugLineNum = 136183813;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=136183815;
 //BA.debugLineNum = 136183815;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=136183816;
 //BA.debugLineNum = 136183816;BA.debugLine="Try";
try {RDebugUtils.currentLine=136183817;
 //BA.debugLineNum = 136183817;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
RDebugUtils.currentLine=136183818;
 //BA.debugLineNum = 136183818;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=136183819;
 //BA.debugLineNum = 136183819;BA.debugLine="Dim mID As Int = m.Get(\"id\")";
_mid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=136183821;
 //BA.debugLineNum = 136183821;BA.debugLine="If (Condition.Size=0) Or ((Condition.Size>0) An";
if ((_condition.getSize()==0) || ((_condition.getSize()>0) && (_condition.IndexOf((Object)(_mid))==-1))) { 
RDebugUtils.currentLine=136183822;
 //BA.debugLineNum = 136183822;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=136183823;
 //BA.debugLineNum = 136183823;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=136183824;
 //BA.debugLineNum = 136183824;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=136183825;
 //BA.debugLineNum = 136183825;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136183826;
 //BA.debugLineNum = 136183826;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=136183827;
 //BA.debugLineNum = 136183827;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=136183829;
 //BA.debugLineNum = 136183829;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group18 = _m.Keys();
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_col = BA.ObjectToString(group18.Get(index18));
RDebugUtils.currentLine=136183830;
 //BA.debugLineNum = 136183830;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=136183831;
 //BA.debugLineNum = 136183831;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=136183832;
 //BA.debugLineNum = 136183832;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=136183833;
 //BA.debugLineNum = 136183833;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=136183835;
 //BA.debugLineNum = 136183835;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_ba,_col));
RDebugUtils.currentLine=136183836;
 //BA.debugLineNum = 136183836;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=136183837;
 //BA.debugLineNum = 136183837;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=136183839;
 //BA.debugLineNum = 136183839;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=136183841;
 //BA.debugLineNum = 136183841;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
RDebugUtils.currentLine=136183843;
 //BA.debugLineNum = 136183843;BA.debugLine="Log($\"Insert data : ${TableName}-${values.ToSt";
anywheresoftware.b4a.keywords.Common.LogImpl("6136183843",("Insert data : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_values.ToString()))+""),0);
 };
 }
};
RDebugUtils.currentLine=136183847;
 //BA.debugLineNum = 136183847;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e35) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e35);RDebugUtils.currentLine=136183849;
 //BA.debugLineNum = 136183849;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6136183849",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=136183855;
 //BA.debugLineNum = 136183855;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=136183857;
 //BA.debugLineNum = 136183857;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(anywheresoftware.b4a.BA _ba,String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "escapefield", false))
	 {return ((String) Debug.delegate(null, "escapefield", new Object[] {_ba,_f}));}
RDebugUtils.currentLine=135921664;
 //BA.debugLineNum = 135921664;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=135921665;
 //BA.debugLineNum = 135921665;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=135921666;
 //BA.debugLineNum = 135921666;BA.debugLine="End Sub";
return "";
}
public static String  _cleartablewhere(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _condition) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "cleartablewhere", false))
	 {return ((String) Debug.delegate(null, "cleartablewhere", new Object[] {_ba,_sql,_tablename,_condition}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=137232384;
 //BA.debugLineNum = 137232384;BA.debugLine="Public Sub ClearTableWhere(SQL As SQL, TableName A";
RDebugUtils.currentLine=137232385;
 //BA.debugLineNum = 137232385;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=137232386;
 //BA.debugLineNum = 137232386;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=137232387;
 //BA.debugLineNum = 137232387;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(TableName)}";
_sb.Append(("DELETE FROM "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_escapefield(_ba,_tablename)))+" WHERE 1=1 "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_condition))+""));
RDebugUtils.currentLine=137232388;
 //BA.debugLineNum = 137232388;BA.debugLine="SQL.ExecNonQuery(sb.ToString)";
_sql.ExecNonQuery(_sb.ToString());
RDebugUtils.currentLine=137232389;
 //BA.debugLineNum = 137232389;BA.debugLine="End Sub";
return "";
}
public static String  _copydbfromassets(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "copydbfromassets", false))
	 {return ((String) Debug.delegate(null, "copydbfromassets", new Object[] {_ba,_filename}));}
String _targetdir = "";
RDebugUtils.currentLine=135856128;
 //BA.debugLineNum = 135856128;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
RDebugUtils.currentLine=135856129;
 //BA.debugLineNum = 135856129;BA.debugLine="Dim TargetDir As String = GetDBFolder";
_targetdir = _getdbfolder(_ba);
RDebugUtils.currentLine=135856130;
 //BA.debugLineNum = 135856130;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=135856131;
 //BA.debugLineNum = 135856131;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=135856133;
 //BA.debugLineNum = 135856133;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=135856134;
 //BA.debugLineNum = 135856134;BA.debugLine="End Sub";
return "";
}
public static String  _getdbfolder(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbfolder", false))
	 {return ((String) Debug.delegate(null, "getdbfolder", new Object[] {_ba}));}
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
RDebugUtils.currentLine=135790592;
 //BA.debugLineNum = 135790592;BA.debugLine="Public Sub GetDBFolder As String";
RDebugUtils.currentLine=135790594;
 //BA.debugLineNum = 135790594;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=135790595;
 //BA.debugLineNum = 135790595;BA.debugLine="If File.ExternalWritable Then Return rp.GetSafeDi";
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()) { 
if (true) return _rp.GetSafeDirDefaultExternal("");}
else {
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirInternal();};
RDebugUtils.currentLine=135790599;
 //BA.debugLineNum = 135790599;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "createtable", false))
	 {return ((String) Debug.delegate(null, "createtable", new Object[] {_ba,_sql,_tablename,_fieldsandtypes,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=135987200;
 //BA.debugLineNum = 135987200;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=135987201;
 //BA.debugLineNum = 135987201;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=135987202;
 //BA.debugLineNum = 135987202;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=135987203;
 //BA.debugLineNum = 135987203;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=135987204;
 //BA.debugLineNum = 135987204;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=135987205;
 //BA.debugLineNum = 135987205;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=135987206;
 //BA.debugLineNum = 135987206;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=135987207;
 //BA.debugLineNum = 135987207;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=135987208;
 //BA.debugLineNum = 135987208;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=135987209;
 //BA.debugLineNum = 135987209;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_ba,_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=135987210;
 //BA.debugLineNum = 135987210;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=135987212;
 //BA.debugLineNum = 135987212;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=135987213;
 //BA.debugLineNum = 135987213;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_ba,_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=135987214;
 //BA.debugLineNum = 135987214;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("6135987214","CreateTable: "+_query,0);
RDebugUtils.currentLine=135987215;
 //BA.debugLineNum = 135987215;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=135987216;
 //BA.debugLineNum = 135987216;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "deleterecord", false))
	 {return ((String) Debug.delegate(null, "deleterecord", new Object[] {_ba,_sql,_tablename,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=137101312;
 //BA.debugLineNum = 137101312;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=137101313;
 //BA.debugLineNum = 137101313;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=137101314;
 //BA.debugLineNum = 137101314;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=137101315;
 //BA.debugLineNum = 137101315;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_ba,_tablename)+" WHERE ");
RDebugUtils.currentLine=137101316;
 //BA.debugLineNum = 137101316;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=137101317;
 //BA.debugLineNum = 137101317;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6137101317","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=137101318;
 //BA.debugLineNum = 137101318;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=137101320;
 //BA.debugLineNum = 137101320;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=137101321;
 //BA.debugLineNum = 137101321;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=137101322;
 //BA.debugLineNum = 137101322;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _wherefieldequals.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=137101323;
 //BA.debugLineNum = 137101323;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
if (_args.getSize()>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=137101324;
 //BA.debugLineNum = 137101324;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
RDebugUtils.currentLine=137101325;
 //BA.debugLineNum = 137101325;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=137101327;
 //BA.debugLineNum = 137101327;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6137101327","DeleteRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=137101328;
 //BA.debugLineNum = 137101328;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=137101329;
 //BA.debugLineNum = 137101329;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "droptable", false))
	 {return ((String) Debug.delegate(null, "droptable", new Object[] {_ba,_sql,_tablename}));}
String _query = "";
RDebugUtils.currentLine=136052736;
 //BA.debugLineNum = 136052736;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=136052737;
 //BA.debugLineNum = 136052737;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
_query = "DROP TABLE IF EXISTS"+_escapefield(_ba,_tablename);
RDebugUtils.currentLine=136052738;
 //BA.debugLineNum = 136052738;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("6136052738","DropTable: "+_query,0);
RDebugUtils.currentLine=136052739;
 //BA.debugLineNum = 136052739;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=136052740;
 //BA.debugLineNum = 136052740;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executehtml", false))
	 {return ((String) Debug.delegate(null, "executehtml", new Object[] {_ba,_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=136773632;
 //BA.debugLineNum = 136773632;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=136773633;
 //BA.debugLineNum = 136773633;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=136773634;
 //BA.debugLineNum = 136773634;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=136773635;
 //BA.debugLineNum = 136773635;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=136773637;
 //BA.debugLineNum = 136773637;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=136773639;
 //BA.debugLineNum = 136773639;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("6136773639","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=136773641;
 //BA.debugLineNum = 136773641;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=136773642;
 //BA.debugLineNum = 136773642;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=136773643;
 //BA.debugLineNum = 136773643;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=136773644;
 //BA.debugLineNum = 136773644;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=136773645;
 //BA.debugLineNum = 136773645;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=136773646;
 //BA.debugLineNum = 136773646;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=136773647;
 //BA.debugLineNum = 136773647;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=136773649;
 //BA.debugLineNum = 136773649;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=136773659;
 //BA.debugLineNum = 136773659;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=136773660;
 //BA.debugLineNum = 136773660;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=136773661;
 //BA.debugLineNum = 136773661;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=136773662;
 //BA.debugLineNum = 136773662;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=136773663;
 //BA.debugLineNum = 136773663;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=136773665;
 //BA.debugLineNum = 136773665;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=136773667;
 //BA.debugLineNum = 136773667;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=136773668;
 //BA.debugLineNum = 136773668;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=136773669;
 //BA.debugLineNum = 136773669;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=136773670;
 //BA.debugLineNum = 136773670;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=136773671;
 //BA.debugLineNum = 136773671;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=136773672;
 //BA.debugLineNum = 136773672;BA.debugLine="sb.Append(\".stub'>\").Append(cur.GetString2(i))";
_sb.Append(".stub'>").Append(_cur.GetString2(_i)).Append("</a>");
 }else {
RDebugUtils.currentLine=136773674;
 //BA.debugLineNum = 136773674;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=136773676;
 //BA.debugLineNum = 136773676;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=136773678;
 //BA.debugLineNum = 136773678;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=136773679;
 //BA.debugLineNum = 136773679;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=136773681;
 //BA.debugLineNum = 136773681;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=136773682;
 //BA.debugLineNum = 136773682;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=136773683;
 //BA.debugLineNum = 136773683;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=136773684;
 //BA.debugLineNum = 136773684;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executejson", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executejson", new Object[] {_ba,_sql,_query,_stringargs,_limit,_dbtypes}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=136708096;
 //BA.debugLineNum = 136708096;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=136708097;
 //BA.debugLineNum = 136708097;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136708098;
 //BA.debugLineNum = 136708098;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=136708099;
 //BA.debugLineNum = 136708099;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=136708100;
 //BA.debugLineNum = 136708100;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=136708102;
 //BA.debugLineNum = 136708102;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=136708104;
 //BA.debugLineNum = 136708104;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("6136708104","ExecuteJSON: "+_query,0);
RDebugUtils.currentLine=136708105;
 //BA.debugLineNum = 136708105;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136708106;
 //BA.debugLineNum = 136708106;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=136708107;
 //BA.debugLineNum = 136708107;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=136708108;
 //BA.debugLineNum = 136708108;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=136708109;
 //BA.debugLineNum = 136708109;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=136708110;
 //BA.debugLineNum = 136708110;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=136708111;
 //BA.debugLineNum = 136708111;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=136708113;
 //BA.debugLineNum = 136708113;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=136708115;
 //BA.debugLineNum = 136708115;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=136708117;
 //BA.debugLineNum = 136708117;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=136708119;
 //BA.debugLineNum = 136708119;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("6136708119","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=136708122;
 //BA.debugLineNum = 136708122;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=136708123;
 //BA.debugLineNum = 136708123;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=136708125;
 //BA.debugLineNum = 136708125;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=136708126;
 //BA.debugLineNum = 136708126;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=136708127;
 //BA.debugLineNum = 136708127;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=136708128;
 //BA.debugLineNum = 136708128;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=136708129;
 //BA.debugLineNum = 136708129;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=136708130;
 //BA.debugLineNum = 136708130;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executelist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executelist", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.List _res = null;
String[] _cols = null;
RDebugUtils.currentLine=136642560;
 //BA.debugLineNum = 136642560;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=136642561;
 //BA.debugLineNum = 136642561;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=136642562;
 //BA.debugLineNum = 136642562;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136642563;
 //BA.debugLineNum = 136642563;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=136642564;
 //BA.debugLineNum = 136642564;BA.debugLine="For Each Cols() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (String[])(group4.Get(index4));
RDebugUtils.currentLine=136642565;
 //BA.debugLineNum = 136642565;BA.debugLine="res.Add(Cols(0))";
_res.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=136642567;
 //BA.debugLineNum = 136642567;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=136642568;
 //BA.debugLineNum = 136642568;BA.debugLine="End Sub";
return null;
}
public static String  _executelist2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelist2", false))
	 {return ((String) Debug.delegate(null, "executelist2", new Object[] {_ba,_sql,_query,_stringargs,_limit,_list}));}
RDebugUtils.currentLine=136577024;
 //BA.debugLineNum = 136577024;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
RDebugUtils.currentLine=136577025;
 //BA.debugLineNum = 136577025;BA.debugLine="List.Clear";
_list.Clear();
RDebugUtils.currentLine=136577026;
 //BA.debugLineNum = 136577026;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
_list.AddAll(_executelist(_ba,_sql,_query,_stringargs,_limit));
RDebugUtils.currentLine=136577027;
 //BA.debugLineNum = 136577027;BA.debugLine="End Sub";
return "";
}
public static String  _executelistview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1,boolean _twolines) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelistview", false))
	 {return ((String) Debug.delegate(null, "executelistview", new Object[] {_ba,_sql,_query,_stringargs,_limit,_listview1,_twolines}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=136511488;
 //BA.debugLineNum = 136511488;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
RDebugUtils.currentLine=136511490;
 //BA.debugLineNum = 136511490;BA.debugLine="ListView1.Clear";
_listview1.Clear();
RDebugUtils.currentLine=136511491;
 //BA.debugLineNum = 136511491;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136511492;
 //BA.debugLineNum = 136511492;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=136511493;
 //BA.debugLineNum = 136511493;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=136511494;
 //BA.debugLineNum = 136511494;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=136511495;
 //BA.debugLineNum = 136511495;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=136511496;
 //BA.debugLineNum = 136511496;BA.debugLine="If TwoLines Then";
if (_twolines) { 
RDebugUtils.currentLine=136511497;
 //BA.debugLineNum = 136511497;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
_listview1.AddTwoLines2(BA.ObjectToCharSequence(_cols[(int) (0)]),BA.ObjectToCharSequence(_cols[(int) (1)]),(Object)(_cols));
 }else {
RDebugUtils.currentLine=136511499;
 //BA.debugLineNum = 136511499;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
_listview1.AddSingleLine2(BA.ObjectToCharSequence(_cols[(int) (0)]),(Object)(_cols));
 };
 }
};
RDebugUtils.currentLine=136511502;
 //BA.debugLineNum = 136511502;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executemap", new Object[] {_ba,_sql,_query,_stringargs}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=136380416;
 //BA.debugLineNum = 136380416;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=136380417;
 //BA.debugLineNum = 136380417;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=136380418;
 //BA.debugLineNum = 136380418;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=136380419;
 //BA.debugLineNum = 136380419;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=136380420;
 //BA.debugLineNum = 136380420;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=136380422;
 //BA.debugLineNum = 136380422;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=136380424;
 //BA.debugLineNum = 136380424;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("6136380424","ExecuteMap: "+_query,0);
RDebugUtils.currentLine=136380425;
 //BA.debugLineNum = 136380425;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=136380426;
 //BA.debugLineNum = 136380426;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6136380426","No records found.",0);
RDebugUtils.currentLine=136380427;
 //BA.debugLineNum = 136380427;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=136380429;
 //BA.debugLineNum = 136380429;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=136380430;
 //BA.debugLineNum = 136380430;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=136380431;
 //BA.debugLineNum = 136380431;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=136380433;
 //BA.debugLineNum = 136380433;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=136380434;
 //BA.debugLineNum = 136380434;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=136380435;
 //BA.debugLineNum = 136380435;BA.debugLine="End Sub";
return null;
}
public static String  _executespinner(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.SpinnerWrapper _spinner1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executespinner", false))
	 {return ((String) Debug.delegate(null, "executespinner", new Object[] {_ba,_sql,_query,_stringargs,_limit,_spinner1}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=136445952;
 //BA.debugLineNum = 136445952;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
RDebugUtils.currentLine=136445953;
 //BA.debugLineNum = 136445953;BA.debugLine="Spinner1.Clear";
_spinner1.Clear();
RDebugUtils.currentLine=136445954;
 //BA.debugLineNum = 136445954;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136445955;
 //BA.debugLineNum = 136445955;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=136445957;
 //BA.debugLineNum = 136445957;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=136445958;
 //BA.debugLineNum = 136445958;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=136445959;
 //BA.debugLineNum = 136445959;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=136445960;
 //BA.debugLineNum = 136445960;BA.debugLine="Spinner1.Add(Cols(0))";
_spinner1.Add(_cols[(int) (0)]);
 }
};
RDebugUtils.currentLine=136445962;
 //BA.debugLineNum = 136445962;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbversion", false))
	 {return ((Integer) Debug.delegate(null, "getdbversion", new Object[] {_ba,_sql}));}
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=136839168;
 //BA.debugLineNum = 136839168;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=136839169;
 //BA.debugLineNum = 136839169;BA.debugLine="Dim version As Int";
_version = 0;
RDebugUtils.currentLine=136839170;
 //BA.debugLineNum = 136839170;BA.debugLine="If TableExists(SQL, \"DBVersion\") Then";
if (_tableexists(_ba,_sql,"DBVersion")) { 
RDebugUtils.currentLine=136839171;
 //BA.debugLineNum = 136839171;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
RDebugUtils.currentLine=136839177;
 //BA.debugLineNum = 136839177;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("version"),(Object)(_db_integer)});
RDebugUtils.currentLine=136839178;
 //BA.debugLineNum = 136839178;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_ba,_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=136839180;
 //BA.debugLineNum = 136839180;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=136839181;
 //BA.debugLineNum = 136839181;BA.debugLine="version = 1";
_version = (int) (1);
 };
RDebugUtils.currentLine=136839183;
 //BA.debugLineNum = 136839183;BA.debugLine="Return version";
if (true) return _version;
RDebugUtils.currentLine=136839184;
 //BA.debugLineNum = 136839184;BA.debugLine="End Sub";
return 0;
}
public static String  _insertmaps3(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _colname,anywheresoftware.b4a.objects.collections.List _listofmaps,anywheresoftware.b4a.objects.collections.List _condition) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "insertmaps3", false))
	 {return ((String) Debug.delegate(null, "insertmaps3", new Object[] {_ba,_sql,_tablename,_colname,_listofmaps,_condition}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _mid = "";
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=136249344;
 //BA.debugLineNum = 136249344;BA.debugLine="Public Sub InsertMaps3(SQL As SQL, TableName As St";
RDebugUtils.currentLine=136249345;
 //BA.debugLineNum = 136249345;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=136249347;
 //BA.debugLineNum = 136249347;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=136249348;
 //BA.debugLineNum = 136249348;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("6136249348","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=136249349;
 //BA.debugLineNum = 136249349;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=136249351;
 //BA.debugLineNum = 136249351;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=136249352;
 //BA.debugLineNum = 136249352;BA.debugLine="Try";
try {RDebugUtils.currentLine=136249353;
 //BA.debugLineNum = 136249353;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
RDebugUtils.currentLine=136249354;
 //BA.debugLineNum = 136249354;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=136249355;
 //BA.debugLineNum = 136249355;BA.debugLine="Dim mID As String = m.Get(ColName)";
_mid = BA.ObjectToString(_m.Get((Object)(_colname)));
RDebugUtils.currentLine=136249357;
 //BA.debugLineNum = 136249357;BA.debugLine="If (Condition.Size=0) Or ((Condition.Size>0) An";
if ((_condition.getSize()==0) || ((_condition.getSize()>0) && (_condition.IndexOf((Object)(_mid))==-1))) { 
RDebugUtils.currentLine=136249358;
 //BA.debugLineNum = 136249358;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=136249359;
 //BA.debugLineNum = 136249359;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=136249360;
 //BA.debugLineNum = 136249360;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=136249361;
 //BA.debugLineNum = 136249361;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=136249362;
 //BA.debugLineNum = 136249362;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=136249363;
 //BA.debugLineNum = 136249363;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=136249365;
 //BA.debugLineNum = 136249365;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group18 = _m.Keys();
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_col = BA.ObjectToString(group18.Get(index18));
RDebugUtils.currentLine=136249366;
 //BA.debugLineNum = 136249366;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=136249367;
 //BA.debugLineNum = 136249367;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=136249368;
 //BA.debugLineNum = 136249368;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=136249369;
 //BA.debugLineNum = 136249369;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=136249371;
 //BA.debugLineNum = 136249371;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_ba,_col));
RDebugUtils.currentLine=136249372;
 //BA.debugLineNum = 136249372;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=136249373;
 //BA.debugLineNum = 136249373;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=136249375;
 //BA.debugLineNum = 136249375;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=136249377;
 //BA.debugLineNum = 136249377;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
RDebugUtils.currentLine=136249379;
 //BA.debugLineNum = 136249379;BA.debugLine="Log($\"Insert data : ${TableName}-${values.ToSt";
anywheresoftware.b4a.keywords.Common.LogImpl("6136249379",("Insert data : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_values.ToString()))+""),0);
 };
 }
};
RDebugUtils.currentLine=136249383;
 //BA.debugLineNum = 136249383;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e35) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e35);RDebugUtils.currentLine=136249385;
 //BA.debugLineNum = 136249385;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6136249385",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=136249391;
 //BA.debugLineNum = 136249391;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=136249393;
 //BA.debugLineNum = 136249393;BA.debugLine="End Sub";
return "";
}
public static String  _setdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "setdbversion", false))
	 {return ((String) Debug.delegate(null, "setdbversion", new Object[] {_ba,_sql,_version}));}
RDebugUtils.currentLine=136904704;
 //BA.debugLineNum = 136904704;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
RDebugUtils.currentLine=136904705;
 //BA.debugLineNum = 136904705;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=136904706;
 //BA.debugLineNum = 136904706;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord", false))
	 {return ((String) Debug.delegate(null, "updaterecord", new Object[] {_ba,_sql,_tablename,_field,_newvalue,_wherefieldequals}));}
RDebugUtils.currentLine=136970240;
 //BA.debugLineNum = 136970240;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=136970242;
 //BA.debugLineNum = 136970242;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
_updaterecord2(_ba,_sql,_tablename,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(_field),_newvalue}),_wherefieldequals);
RDebugUtils.currentLine=136970243;
 //BA.debugLineNum = 136970243;BA.debugLine="End Sub";
return "";
}
}