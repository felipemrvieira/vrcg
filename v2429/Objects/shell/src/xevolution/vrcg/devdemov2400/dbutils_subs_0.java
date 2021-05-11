package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbutils_subs_0 {


public static RemoteObject  _cleartable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("ClearTable (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,592);
if (RapidSub.canDelegate("cleartable")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","cleartable", _ba, _sql, _tablename);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 592;BA.debugLine="Public Sub ClearTable(SQL As SQL, TableName As Str";
Debug.ShouldStop(32768);
 BA.debugLineNum = 593;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(65536);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 594;BA.debugLine="sb.Initialize";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 595;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),_escapefield(_ba,_tablename),RemoteObject.createImmutable(" WHERE 1=1"))));
 BA.debugLineNum = 596;BA.debugLine="Dim sSQL As String = sb.ToString";
Debug.ShouldStop(524288);
_ssql = _sb.runMethod(true,"ToString");Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 597;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(1048576);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6137166853",_ssql,0);
 BA.debugLineNum = 598;BA.debugLine="SQL.ExecNonQuery(sSQL)";
Debug.ShouldStop(2097152);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 599;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cleartablewhere(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _condition) throws Exception{
try {
		Debug.PushSubsStack("ClearTableWhere (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,601);
if (RapidSub.canDelegate("cleartablewhere")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","cleartablewhere", _ba, _sql, _tablename, _condition);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 601;BA.debugLine="Public Sub ClearTableWhere(SQL As SQL, TableName A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 602;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(33554432);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 603;BA.debugLine="sb.Initialize";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 604;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(TableName)}";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),dbutils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_escapefield(_ba,_tablename)))),RemoteObject.createImmutable(" WHERE 1=1 "),dbutils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_condition))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 605;BA.debugLine="SQL.ExecNonQuery(sb.ToString)";
Debug.ShouldStop(268435456);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 606;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _copydbfromassets(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CopyDBFromAssets (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,51);
if (RapidSub.canDelegate("copydbfromassets")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","copydbfromassets", _ba, _filename);}
RemoteObject _targetdir = RemoteObject.createImmutable("");
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 51;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Dim TargetDir As String = GetDBFolder";
Debug.ShouldStop(524288);
_targetdir = _getdbfolder(_ba);Debug.locals.put("TargetDir", _targetdir);Debug.locals.put("TargetDir", _targetdir);
 BA.debugLineNum = 53;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_targetdir),(Object)(_filename)),dbutils.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 54;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
Debug.ShouldStop(2097152);
dbutils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(_targetdir),(Object)(_filename));
 };
 BA.debugLineNum = 56;BA.debugLine="Return TargetDir";
Debug.ShouldStop(8388608);
if (true) return _targetdir;
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fieldsandtypes,RemoteObject _primarykey) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,93);
if (RapidSub.canDelegate("createtable")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","createtable", _ba, _sql, _tablename, _fieldsandtypes, _primarykey);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _ftype = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("FieldsAndTypes", _fieldsandtypes);
Debug.locals.put("PrimaryKey", _primarykey);
 BA.debugLineNum = 93;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(536870912);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 95;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 96;BA.debugLine="sb.Append(\"(\")";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 97;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
Debug.ShouldStop(1);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_fieldsandtypes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 98;BA.debugLine="Dim field, ftype As String";
Debug.ShouldStop(2);
_field = RemoteObject.createImmutable("");Debug.locals.put("field", _field);
_ftype = RemoteObject.createImmutable("");Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 99;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
Debug.ShouldStop(4);
_field = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("field", _field);
 BA.debugLineNum = 100;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
Debug.ShouldStop(8);
_ftype = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 101;BA.debugLine="If i > 0 Then sb.Append(\", \")";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));};
 BA.debugLineNum = 102;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
Debug.ShouldStop(32);
_sb.runMethod(false,"Append",(Object)(_escapefield(_ba,_field))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runVoidMethod ("Append",(Object)(_ftype));
 BA.debugLineNum = 103;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_field,_primarykey)) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" PRIMARY KEY")));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 105;BA.debugLine="sb.Append(\")\")";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 106;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
Debug.ShouldStop(512);
_query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS "),_escapefield(_ba,_tablename),RemoteObject.createImmutable(" "),_sb.runMethod(true,"ToString"));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 107;BA.debugLine="Log(\"CreateTable: \" & query)";
Debug.ShouldStop(1024);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6135987214",RemoteObject.concat(RemoteObject.createImmutable("CreateTable: "),_query),0);
 BA.debugLineNum = 108;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(2048);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleterecord(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("DeleteRecord (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,572);
if (RapidSub.canDelegate("deleterecord")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","deleterecord", _ba, _sql, _tablename, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _col = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 572;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 573;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(268435456);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 574;BA.debugLine="sb.Initialize";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 575;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),_escapefield(_ba,_tablename),RemoteObject.createImmutable(" WHERE "))));
 BA.debugLineNum = 576;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 577;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(1);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6137101317",RemoteObject.createImmutable("WhereFieldEquals map empty!"),0);
 BA.debugLineNum = 578;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 580;BA.debugLine="Dim args As List";
Debug.ShouldStop(8);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 581;BA.debugLine="args.Initialize";
Debug.ShouldStop(16);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 582;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
Debug.ShouldStop(32);
{
final RemoteObject group10 = _wherefieldequals.runMethod(false,"Keys");
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.runMethod(false,"Get",index10));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 583;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_args.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));};
 BA.debugLineNum = 584;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
Debug.ShouldStop(128);
_sb.runMethod(false,"Append",(Object)(_escapefield(_ba,_col))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?")));
 BA.debugLineNum = 585;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
Debug.ShouldStop(256);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"Get",(Object)((_col)))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 587;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
Debug.ShouldStop(1024);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6137101327",RemoteObject.concat(RemoteObject.createImmutable("DeleteRecord: "),_sb.runMethod(true,"ToString")),0);
 BA.debugLineNum = 588;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(2048);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("DropTable (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,113);
if (RapidSub.canDelegate("droptable")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","droptable", _ba, _sql, _tablename);}
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 113;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
Debug.ShouldStop(131072);
_query = RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE IF EXISTS"),_escapefield(_ba,_tablename));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 115;BA.debugLine="Log(\"DropTable: \" & query)";
Debug.ShouldStop(262144);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136052738",RemoteObject.concat(RemoteObject.createImmutable("DropTable: "),_query),0);
 BA.debugLineNum = 116;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(524288);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escapefield(RemoteObject _ba,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("EscapeField (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,64);
if (RapidSub.canDelegate("escapefield")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","escapefield", _ba, _f);}
;
Debug.locals.put("f", _f);
 BA.debugLineNum = 64;BA.debugLine="Private Sub EscapeField(f As String) As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Return \"[\" & f & \"]\"";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("["),_f,RemoteObject.createImmutable("]"));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executehtml(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _clickable) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHtml (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,449);
if (RapidSub.canDelegate("executehtml")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","executehtml", _ba, _sql, _query, _stringargs, _limit, _clickable);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _row = RemoteObject.createImmutable(0);
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Clickable", _clickable);
 BA.debugLineNum = 449;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 450;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(2);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 451;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 452;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(8);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 }else {
 BA.debugLineNum = 454;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(32);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));
 };
 BA.debugLineNum = 456;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
Debug.ShouldStop(128);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136773639",RemoteObject.concat(RemoteObject.createImmutable("ExecuteHtml: "),_query),0);
 BA.debugLineNum = 458;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(512);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 459;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 460;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
Debug.ShouldStop(2048);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<html><body>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 461;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
Debug.ShouldStop(4096);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<style type='text/css'>"))).runMethod(false,"Append",(Object)(dbutils._htmlcss)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</style>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 462;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
Debug.ShouldStop(8192);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<table><thead><tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 463;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(16384);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 464;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<th>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</th>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 466;BA.debugLine="sb.Append(\"</thead>\")";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</thead>")));
 BA.debugLineNum = 476;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(134217728);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 477;BA.debugLine="Dim row As Int";
Debug.ShouldStop(268435456);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 478;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(536870912);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 479;BA.debugLine="If row Mod 2 = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 480;BA.debugLine="sb.Append(\"<tr>\")";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr>")));
 }else {
 BA.debugLineNum = 482;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr class='odd'>")));
 };
 BA.debugLineNum = 484;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(8);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 485;BA.debugLine="sb.Append(\"<td>\")";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<td>")));
 BA.debugLineNum = 486;BA.debugLine="If Clickable Then";
Debug.ShouldStop(32);
if (_clickable.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 487;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
Debug.ShouldStop(64);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<a href='http://"))).runMethod(false,"Append",(Object)(BA.NumberToString(_i))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(".")));
 BA.debugLineNum = 488;BA.debugLine="sb.Append(row)";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(BA.NumberToString(_row)));
 BA.debugLineNum = 489;BA.debugLine="sb.Append(\".stub'>\").Append(cur.GetString2(i))";
Debug.ShouldStop(256);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".stub'>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</a>")));
 }else {
 BA.debugLineNum = 491;BA.debugLine="sb.Append(cur.GetString2(i))";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 493;BA.debugLine="sb.Append(\"</td>\")";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</td>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 495;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(16384);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 496;BA.debugLine="row = row + 1";
Debug.ShouldStop(32768);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 }
;
 BA.debugLineNum = 498;BA.debugLine="cur.Close";
Debug.ShouldStop(131072);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 499;BA.debugLine="sb.Append(\"</table></body></html>\")";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</table></body></html>")));
 BA.debugLineNum = 500;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(524288);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executejson(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _dbtypes) throws Exception{
try {
		Debug.PushSubsStack("ExecuteJSON (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,411);
if (RapidSub.canDelegate("executejson")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","executejson", _ba, _sql, _query, _stringargs, _limit, _dbtypes);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("DBTypes", _dbtypes);
 BA.debugLineNum = 411;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 412;BA.debugLine="Dim table As List";
Debug.ShouldStop(134217728);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 413;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(268435456);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 414;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 415;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(1073741824);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 }else {
 BA.debugLineNum = 417;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(1);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));
 };
 BA.debugLineNum = 419;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
Debug.ShouldStop(4);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136708104",RemoteObject.concat(RemoteObject.createImmutable("ExecuteJSON: "),_query),0);
 BA.debugLineNum = 420;BA.debugLine="Dim table As List";
Debug.ShouldStop(8);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 421;BA.debugLine="table.Initialize";
Debug.ShouldStop(16);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 422;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(32);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 423;BA.debugLine="Dim m As Map";
Debug.ShouldStop(64);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 424;BA.debugLine="m.Initialize";
Debug.ShouldStop(128);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 425;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(256);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 426;BA.debugLine="Select DBTypes.Get(i)";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),(dbutils._db_text),(dbutils._db_integer),(dbutils._db_real))) {
case 0: {
 BA.debugLineNum = 428;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 1: {
 BA.debugLineNum = 430;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetLong2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 2: {
 BA.debugLineNum = 432;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetDouble2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
default: {
 BA.debugLineNum = 434;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
Debug.ShouldStop(131072);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136708119",RemoteObject.concat(RemoteObject.createImmutable("Invalid type: "),_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 437;BA.debugLine="table.Add(m)";
Debug.ShouldStop(1048576);
_table.runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 438;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",_table.runMethod(true,"getSize"),BA.numberCast(double.class, _limit))) { 
if (true) break;};
 }
;
 BA.debugLineNum = 440;BA.debugLine="cur.Close";
Debug.ShouldStop(8388608);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 441;BA.debugLine="Dim root As Map";
Debug.ShouldStop(16777216);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("root", _root);
 BA.debugLineNum = 442;BA.debugLine="root.Initialize";
Debug.ShouldStop(33554432);
_root.runVoidMethod ("Initialize");
 BA.debugLineNum = 443;BA.debugLine="root.Put(\"root\", table)";
Debug.ShouldStop(67108864);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("root"))),(Object)((_table.getObject())));
 BA.debugLineNum = 444;BA.debugLine="Return root";
Debug.ShouldStop(134217728);
if (true) return _root;
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelist(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteList (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,392);
if (RapidSub.canDelegate("executelist")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","executelist", _ba, _sql, _query, _stringargs, _limit);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 392;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 393;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
Debug.ShouldStop(256);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);Debug.locals.put("Table", _table);
 BA.debugLineNum = 394;BA.debugLine="Dim res As List";
Debug.ShouldStop(512);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 395;BA.debugLine="res.Initialize";
Debug.ShouldStop(1024);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 396;BA.debugLine="For Each Cols() As String In Table";
Debug.ShouldStop(2048);
{
final RemoteObject group4 = _table;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (group4.runMethod(false,"Get",index4));Debug.locals.put("Cols", _cols);
Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 397;BA.debugLine="res.Add(Cols(0))";
Debug.ShouldStop(4096);
_res.runVoidMethod ("Add",(Object)((_cols.getArrayElement(true,BA.numberCast(int.class, 0)))));
 }
}Debug.locals.put("Cols", _cols);
;
 BA.debugLineNum = 399;BA.debugLine="Return res";
Debug.ShouldStop(16384);
if (true) return _res;
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelist2(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("ExecuteList2 (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,387);
if (RapidSub.canDelegate("executelist2")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","executelist2", _ba, _sql, _query, _stringargs, _limit, _list);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("List", _list);
 BA.debugLineNum = 387;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="List.Clear";
Debug.ShouldStop(8);
_list.runVoidMethod ("Clear");
 BA.debugLineNum = 389;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
Debug.ShouldStop(16);
_list.runVoidMethod ("AddAll",(Object)(_executelist(_ba,_sql,_query,_stringargs,_limit)));
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelistview(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _listview1,RemoteObject _twolines) throws Exception{
try {
		Debug.PushSubsStack("ExecuteListView (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,343);
if (RapidSub.canDelegate("executelistview")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","executelistview", _ba, _sql, _query, _stringargs, _limit, _listview1, _twolines);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("ListView1", _listview1);
Debug.locals.put("TwoLines", _twolines);
 BA.debugLineNum = 343;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 345;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16777216);
_listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 346;BA.debugLine="Dim Table As List";
Debug.ShouldStop(33554432);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 347;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(67108864);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 348;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(134217728);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 349;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(268435456);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 350;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(536870912);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 351;BA.debugLine="If TwoLines Then";
Debug.ShouldStop(1073741824);
if (_twolines.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 352;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
Debug.ShouldStop(-2147483648);
_listview1.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)((_cols)));
 }else {
 BA.debugLineNum = 354;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
Debug.ShouldStop(2);
_listview1.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)((_cols)));
 };
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _executemap(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMap (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,304);
if (RapidSub.canDelegate("executemap")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","executemap", _ba, _sql, _query, _stringargs);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
 BA.debugLineNum = 304;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="Dim res As Map";
Debug.ShouldStop(65536);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("res", _res);
 BA.debugLineNum = 306;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(131072);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 307;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 308;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(524288);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 }else {
 BA.debugLineNum = 310;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(2097152);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));
 };
 BA.debugLineNum = 312;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
Debug.ShouldStop(8388608);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136380424",RemoteObject.concat(RemoteObject.createImmutable("ExecuteMap: "),_query),0);
 BA.debugLineNum = 313;BA.debugLine="If cur.NextRow = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"NextRow"),dbutils.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 314;BA.debugLine="Log(\"No records found.\")";
Debug.ShouldStop(33554432);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136380426",RemoteObject.createImmutable("No records found."),0);
 BA.debugLineNum = 315;BA.debugLine="Return res";
Debug.ShouldStop(67108864);
if (true) return _res;
 };
 BA.debugLineNum = 317;BA.debugLine="res.Initialize";
Debug.ShouldStop(268435456);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 318;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(536870912);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 319;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
Debug.ShouldStop(1073741824);
_res.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"toLowerCase"))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 321;BA.debugLine="cur.Close";
Debug.ShouldStop(1);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 322;BA.debugLine="Return res";
Debug.ShouldStop(2);
if (true) return _res;
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executememorytable(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMemoryTable (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,279);
if (RapidSub.canDelegate("executememorytable")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","executememorytable", _ba, _sql, _query, _stringargs, _limit);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _values = null;
int _col = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 279;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(8388608);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 281;BA.debugLine="If StringArgs = Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_stringargs)) { 
 BA.debugLineNum = 282;BA.debugLine="Dim StringArgs(0) As String";
Debug.ShouldStop(33554432);
_stringargs = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("StringArgs", _stringargs);
 };
 BA.debugLineNum = 284;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(134217728);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 BA.debugLineNum = 285;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
Debug.ShouldStop(268435456);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136314886",RemoteObject.concat(RemoteObject.createImmutable("ExecuteMemoryTable: "),_query),0);
 BA.debugLineNum = 286;BA.debugLine="Dim table As List";
Debug.ShouldStop(536870912);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 287;BA.debugLine="table.Initialize";
Debug.ShouldStop(1073741824);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 288;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(-2147483648);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 289;BA.debugLine="Dim values(cur.ColumnCount) As String";
Debug.ShouldStop(1);
_values = RemoteObject.createNewArray ("String", new int[] {_cur.runMethod(true,"getColumnCount").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 290;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(2);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step11 > 0 && _col <= limit11) || (step11 < 0 && _col >= limit11) ;_col = ((int)(0 + _col + step11))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 291;BA.debugLine="values(col) = cur.GetString2(col)";
Debug.ShouldStop(4);
_values.setArrayElement (_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _col))),BA.numberCast(int.class, _col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 293;BA.debugLine="table.Add(values)";
Debug.ShouldStop(16);
_table.runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 294;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",_table.runMethod(true,"getSize"),BA.numberCast(double.class, _limit))) { 
if (true) break;};
 }
;
 BA.debugLineNum = 296;BA.debugLine="cur.Close";
Debug.ShouldStop(128);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 297;BA.debugLine="Return table";
Debug.ShouldStop(256);
if (true) return _table;
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executespinner(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _spinner1) throws Exception{
try {
		Debug.PushSubsStack("ExecuteSpinner (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,327);
if (RapidSub.canDelegate("executespinner")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","executespinner", _ba, _sql, _query, _stringargs, _limit, _spinner1);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Spinner1", _spinner1);
 BA.debugLineNum = 327;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
Debug.ShouldStop(64);
 BA.debugLineNum = 328;BA.debugLine="Spinner1.Clear";
Debug.ShouldStop(128);
_spinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 329;BA.debugLine="Dim Table As List";
Debug.ShouldStop(256);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 330;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(512);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 332;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(2048);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 333;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(4096);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 334;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(8192);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 335;BA.debugLine="Spinner1.Add(Cols(0))";
Debug.ShouldStop(16384);
_spinner1.runVoidMethod ("Add",(Object)(_cols.getArrayElement(true,BA.numberCast(int.class, 0))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdbfolder(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetDBFolder (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,38);
if (RapidSub.canDelegate("getdbfolder")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","getdbfolder", _ba);}
RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
;
 BA.debugLineNum = 38;BA.debugLine="Public Sub GetDBFolder As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="Dim rp As RuntimePermissions";
Debug.ShouldStop(128);
_rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rp", _rp);
 BA.debugLineNum = 41;BA.debugLine="If File.ExternalWritable Then Return rp.GetSafeDi";
Debug.ShouldStop(256);
if (dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable").<Boolean>get().booleanValue()) { 
if (true) return _rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));}
else {
if (true) return dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");};
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
public static RemoteObject  _getdbversion(RemoteObject _ba,RemoteObject _sql) throws Exception{
try {
		Debug.PushSubsStack("GetDBVersion (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,505);
if (RapidSub.canDelegate("getdbversion")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","getdbversion", _ba, _sql);}
RemoteObject _version = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 505;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 506;BA.debugLine="Dim version As Int";
Debug.ShouldStop(33554432);
_version = RemoteObject.createImmutable(0);Debug.locals.put("version", _version);
 BA.debugLineNum = 507;BA.debugLine="If TableExists(SQL, \"DBVersion\") Then";
Debug.ShouldStop(67108864);
if (_tableexists(_ba,_sql,RemoteObject.createImmutable("DBVersion")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 508;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
Debug.ShouldStop(134217728);
_version = BA.numberCast(int.class, _sql.runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT version FROM DBVersion"))));Debug.locals.put("version", _version);
 }else {
 BA.debugLineNum = 514;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
Debug.ShouldStop(2);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = dbutils.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("version")),(dbutils._db_integer)}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 515;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
Debug.ShouldStop(4);
_createtable(_ba,_sql,BA.ObjectToString("DBVersion"),_m,RemoteObject.createImmutable("version"));
 BA.debugLineNum = 517;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
Debug.ShouldStop(16);
_sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("INSERT INTO DBVersion VALUES (1)")));
 BA.debugLineNum = 518;BA.debugLine="version = 1";
Debug.ShouldStop(32);
_version = BA.numberCast(int.class, 1);Debug.locals.put("version", _version);
 };
 BA.debugLineNum = 520;BA.debugLine="Return version";
Debug.ShouldStop(128);
if (true) return _version;
 BA.debugLineNum = 521;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertmaps(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _listofmaps) throws Exception{
try {
		Debug.PushSubsStack("InsertMaps (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,123);
if (RapidSub.canDelegate("insertmaps")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","insertmaps", _ba, _sql, _tablename, _listofmaps);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i1 = 0;
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 123;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(134217728);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 126;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 127;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
Debug.ShouldStop(1073741824);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136118276",RemoteObject.createImmutable("Same Map found twice in list. Each item in the list should include a different map object."),0);
 BA.debugLineNum = 128;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 130;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(2);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 131;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 132;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(8);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 133;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 134;BA.debugLine="columns.Initialize";
Debug.ShouldStop(32);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 135;BA.debugLine="values.Initialize";
Debug.ShouldStop(64);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 136;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(128);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 137;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(256);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 138;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ["),_tablename,RemoteObject.createImmutable("] ("))));
 BA.debugLineNum = 139;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 140;BA.debugLine="For Each col As String In m.Keys";
Debug.ShouldStop(2048);
{
final RemoteObject group16 = _m.runMethod(false,"Keys");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.runMethod(false,"Get",index16));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 141;BA.debugLine="Dim value As Object = m.Get(col)";
Debug.ShouldStop(4096);
_value = _m.runMethod(false,"Get",(Object)((_col)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 142;BA.debugLine="If listOfValues.Size > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_listofvalues.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 143;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(16384);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 144;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(32768);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 146;BA.debugLine="columns.Append(EscapeField(col))";
Debug.ShouldStop(131072);
_columns.runVoidMethod ("Append",(Object)(_escapefield(_ba,_col)));
 BA.debugLineNum = 147;BA.debugLine="values.Append(\"?\")";
Debug.ShouldStop(262144);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 148;BA.debugLine="listOfValues.Add(value)";
Debug.ShouldStop(524288);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 150;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
Debug.ShouldStop(2097152);
_sb.runMethod(false,"Append",(Object)(_columns.runMethod(true,"ToString"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(") VALUES ("))).runMethod(false,"Append",(Object)(_values.runMethod(true,"ToString"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 151;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i1),BA.numberCast(double.class, 0))) { 
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136118300",RemoteObject.concat(RemoteObject.createImmutable("InsertMaps (first query out of "),_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable("): "),_sb.runMethod(true,"ToString")),0);};
 BA.debugLineNum = 152;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
Debug.ShouldStop(8388608);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_listofvalues));
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 154;BA.debugLine="SQL.TransactionSuccessful";
Debug.ShouldStop(33554432);
_sql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e32.toString()); BA.debugLineNum = 156;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136118305",BA.ObjectToString(dbutils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 162;BA.debugLine="SQL.EndTransaction";
Debug.ShouldStop(2);
_sql.runVoidMethod ("EndTransaction");
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
public static RemoteObject  _insertmaps2(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _listofmaps,RemoteObject _condition) throws Exception{
try {
		Debug.PushSubsStack("InsertMaps2 (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,171);
if (RapidSub.canDelegate("insertmaps2")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","insertmaps2", _ba, _sql, _tablename, _listofmaps, _condition);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i1 = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ListOfMaps", _listofmaps);
Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 171;BA.debugLine="Public Sub InsertMaps2(SQL As SQL, TableName As St";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(2048);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 174;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 175;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
Debug.ShouldStop(16384);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136183812",RemoteObject.createImmutable("Same Map found twice in list. Each item in the list should include a different map object."),0);
 BA.debugLineNum = 176;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 178;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(131072);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 179;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 180;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(524288);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 181;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
Debug.ShouldStop(1048576);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 182;BA.debugLine="Dim mID As Int = m.Get(\"id\")";
Debug.ShouldStop(2097152);
_mid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 184;BA.debugLine="If (Condition.Size=0) Or ((Condition.Size>0) An";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_condition.runMethod(true,"getSize"),BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_condition.runMethod(true,"getSize"),BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_condition.runMethod(true,"IndexOf",(Object)((_mid))),BA.numberCast(double.class, -(double) (0 + 1)))))))))) { 
 BA.debugLineNum = 185;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 186;BA.debugLine="columns.Initialize";
Debug.ShouldStop(33554432);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="values.Initialize";
Debug.ShouldStop(67108864);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 188;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(134217728);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 189;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(268435456);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 190;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ["),_tablename,RemoteObject.createImmutable("] ("))));
 BA.debugLineNum = 192;BA.debugLine="For Each col As String In m.Keys";
Debug.ShouldStop(-2147483648);
{
final RemoteObject group18 = _m.runMethod(false,"Keys");
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_col = BA.ObjectToString(group18.runMethod(false,"Get",index18));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 193;BA.debugLine="Dim value As Object = m.Get(col)";
Debug.ShouldStop(1);
_value = _m.runMethod(false,"Get",(Object)((_col)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 194;BA.debugLine="If listOfValues.Size > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_listofvalues.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 195;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(4);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 196;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(8);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 198;BA.debugLine="columns.Append(EscapeField(col))";
Debug.ShouldStop(32);
_columns.runVoidMethod ("Append",(Object)(_escapefield(_ba,_col)));
 BA.debugLineNum = 199;BA.debugLine="values.Append(\"?\")";
Debug.ShouldStop(64);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 200;BA.debugLine="listOfValues.Add(value)";
Debug.ShouldStop(128);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 202;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(_columns.runMethod(true,"ToString"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(") VALUES ("))).runMethod(false,"Append",(Object)(_values.runMethod(true,"ToString"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 204;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
Debug.ShouldStop(2048);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_listofvalues));
 BA.debugLineNum = 206;BA.debugLine="Log($\"Insert data : ${TableName}-${values.ToSt";
Debug.ShouldStop(8192);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136183843",(RemoteObject.concat(RemoteObject.createImmutable("Insert data : "),dbutils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tablename))),RemoteObject.createImmutable("-"),dbutils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_values.runMethod(true,"ToString")))),RemoteObject.createImmutable(""))),0);
 };
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 210;BA.debugLine="SQL.TransactionSuccessful";
Debug.ShouldStop(131072);
_sql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e35) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e35.toString()); BA.debugLineNum = 212;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136183849",BA.ObjectToString(dbutils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 218;BA.debugLine="SQL.EndTransaction";
Debug.ShouldStop(33554432);
_sql.runVoidMethod ("EndTransaction");
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertmaps3(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _colname,RemoteObject _listofmaps,RemoteObject _condition) throws Exception{
try {
		Debug.PushSubsStack("InsertMaps3 (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,222);
if (RapidSub.canDelegate("insertmaps3")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","insertmaps3", _ba, _sql, _tablename, _colname, _listofmaps, _condition);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i1 = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mid = RemoteObject.createImmutable("");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ColName", _colname);
Debug.locals.put("ListOfMaps", _listofmaps);
Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 222;BA.debugLine="Public Sub InsertMaps3(SQL As SQL, TableName As St";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(1073741824);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 225;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 226;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
Debug.ShouldStop(2);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136249348",RemoteObject.createImmutable("Same Map found twice in list. Each item in the list should include a different map object."),0);
 BA.debugLineNum = 227;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 229;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(16);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 230;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 231;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(64);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 232;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
Debug.ShouldStop(128);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 233;BA.debugLine="Dim mID As String = m.Get(ColName)";
Debug.ShouldStop(256);
_mid = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 235;BA.debugLine="If (Condition.Size=0) Or ((Condition.Size>0) An";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_condition.runMethod(true,"getSize"),BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_condition.runMethod(true,"getSize"),BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_condition.runMethod(true,"IndexOf",(Object)((_mid))),BA.numberCast(double.class, -(double) (0 + 1)))))))))) { 
 BA.debugLineNum = 236;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 237;BA.debugLine="columns.Initialize";
Debug.ShouldStop(4096);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 238;BA.debugLine="values.Initialize";
Debug.ShouldStop(8192);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 239;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(16384);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 240;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(32768);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 241;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ["),_tablename,RemoteObject.createImmutable("] ("))));
 BA.debugLineNum = 243;BA.debugLine="For Each col As String In m.Keys";
Debug.ShouldStop(262144);
{
final RemoteObject group18 = _m.runMethod(false,"Keys");
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_col = BA.ObjectToString(group18.runMethod(false,"Get",index18));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 244;BA.debugLine="Dim value As Object = m.Get(col)";
Debug.ShouldStop(524288);
_value = _m.runMethod(false,"Get",(Object)((_col)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 245;BA.debugLine="If listOfValues.Size > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_listofvalues.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 246;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(2097152);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 247;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(4194304);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 249;BA.debugLine="columns.Append(EscapeField(col))";
Debug.ShouldStop(16777216);
_columns.runVoidMethod ("Append",(Object)(_escapefield(_ba,_col)));
 BA.debugLineNum = 250;BA.debugLine="values.Append(\"?\")";
Debug.ShouldStop(33554432);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 251;BA.debugLine="listOfValues.Add(value)";
Debug.ShouldStop(67108864);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 253;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (";
Debug.ShouldStop(268435456);
_sb.runMethod(false,"Append",(Object)(_columns.runMethod(true,"ToString"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(") VALUES ("))).runMethod(false,"Append",(Object)(_values.runMethod(true,"ToString"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 255;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
Debug.ShouldStop(1073741824);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_listofvalues));
 BA.debugLineNum = 257;BA.debugLine="Log($\"Insert data : ${TableName}-${values.ToSt";
Debug.ShouldStop(1);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136249379",(RemoteObject.concat(RemoteObject.createImmutable("Insert data : "),dbutils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tablename))),RemoteObject.createImmutable("-"),dbutils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_values.runMethod(true,"ToString")))),RemoteObject.createImmutable(""))),0);
 };
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 261;BA.debugLine="SQL.TransactionSuccessful";
Debug.ShouldStop(16);
_sql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e35) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e35.toString()); BA.debugLineNum = 263;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6136249385",BA.ObjectToString(dbutils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 269;BA.debugLine="SQL.EndTransaction";
Debug.ShouldStop(4096);
_sql.runVoidMethod ("EndTransaction");
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public DB_REAL, DB_INTEGER, DB_BLOB, DB_TEXT As S";
dbutils._db_real = RemoteObject.createImmutable("");
dbutils._db_integer = RemoteObject.createImmutable("");
dbutils._db_blob = RemoteObject.createImmutable("");
dbutils._db_text = RemoteObject.createImmutable("");
 //BA.debugLineNum = 5;BA.debugLine="DB_REAL = \"REAL\"";
dbutils._db_real = BA.ObjectToString("REAL");
 //BA.debugLineNum = 6;BA.debugLine="DB_INTEGER = \"INTEGER\"";
dbutils._db_integer = BA.ObjectToString("INTEGER");
 //BA.debugLineNum = 7;BA.debugLine="DB_BLOB = \"BLOB\"";
dbutils._db_blob = BA.ObjectToString("BLOB");
 //BA.debugLineNum = 8;BA.debugLine="DB_TEXT = \"TEXT\"";
dbutils._db_text = BA.ObjectToString("TEXT");
 //BA.debugLineNum = 9;BA.debugLine="Private HtmlCSS As String = $\" 		table {width: 10";
dbutils._htmlcss = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		table {width: 100%;border: 1px solid #cef;text-align: left; }\n"),RemoteObject.createImmutable("		th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }\n"),RemoteObject.createImmutable("		td,th {	padding: 4px 5px; }\n"),RemoteObject.createImmutable("		.odd {background-color: #def; } \n"),RemoteObject.createImmutable("		.odd td {border-bottom: 1px solid #cef; }\n"),RemoteObject.createImmutable("		a { text-decoration:none; color: #000;}")));
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdbversion(RemoteObject _ba,RemoteObject _sql,RemoteObject _version) throws Exception{
try {
		Debug.PushSubsStack("SetDBVersion (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,526);
if (RapidSub.canDelegate("setdbversion")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","setdbversion", _ba, _sql, _version);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Version", _version);
 BA.debugLineNum = 526;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
Debug.ShouldStop(8192);
 BA.debugLineNum = 527;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
Debug.ShouldStop(16384);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE DBVersion set version = ?")),(Object)(dbutils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_version)})))));
 BA.debugLineNum = 528;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tableexists(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("TableExists (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,609);
if (RapidSub.canDelegate("tableexists")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","tableexists", _ba, _sql, _tablename);}
RemoteObject _count = RemoteObject.createImmutable(0);
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 609;BA.debugLine="Public Sub TableExists(SQL As SQL, TableName As St";
Debug.ShouldStop(1);
 BA.debugLineNum = 610;BA.debugLine="Dim count As Int = SQL.ExecQuerySingleResult2(\"SE";
Debug.ShouldStop(2);
_count = BA.numberCast(int.class, _sql.runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("SELECT count(name) FROM sqlite_master WHERE type='table' AND name=? COLLATE NOCASE")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_tablename}))));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 611;BA.debugLine="Return count > 0";
Debug.ShouldStop(4);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0)));
 BA.debugLineNum = 612;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _field,RemoteObject _newvalue,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,532);
if (RapidSub.canDelegate("updaterecord")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord", _ba, _sql, _tablename, _field, _newvalue, _wherefieldequals);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Field", _field);
Debug.locals.put("NewValue", _newvalue);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 532;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
Debug.ShouldStop(524288);
 BA.debugLineNum = 534;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
Debug.ShouldStop(2097152);
_updaterecord2(_ba,_sql,_tablename,dbutils.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(_field),_newvalue})),_wherefieldequals);
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord2(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fields,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord2 (dbutils) ","dbutils",36,_ba,dbutils.mostCurrent,539);
if (RapidSub.canDelegate("updaterecord2")) { return xevolution.vrcg.devdemov2400.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord2", _ba, _sql, _tablename, _fields, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _col = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Fields", _fields);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 539;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 540;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 541;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(268435456);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6137035778",RemoteObject.createImmutable("WhereFieldEquals map empty!"),0);
 BA.debugLineNum = 542;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 544;BA.debugLine="If Fields.Size = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_fields.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 545;BA.debugLine="Log(\"Fields empty\")";
Debug.ShouldStop(1);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6137035782",RemoteObject.createImmutable("Fields empty"),0);
 BA.debugLineNum = 546;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 548;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 549;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 550;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
Debug.ShouldStop(32);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE "))).runMethod(false,"Append",(Object)(_escapefield(_ba,_tablename))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" SET ")));
 BA.debugLineNum = 551;BA.debugLine="Dim args As List";
Debug.ShouldStop(64);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 552;BA.debugLine="args.Initialize";
Debug.ShouldStop(128);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 553;BA.debugLine="For Each col As String In Fields.Keys";
Debug.ShouldStop(256);
{
final RemoteObject group14 = _fields.runMethod(false,"Keys");
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.runMethod(false,"Get",index14));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 554;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(_escapefield(_ba,_col))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("=?")));
 BA.debugLineNum = 555;BA.debugLine="sb.Append(\",\")";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(",")));
 BA.debugLineNum = 556;BA.debugLine="args.Add(Fields.Get(col))";
Debug.ShouldStop(2048);
_args.runVoidMethod ("Add",(Object)(_fields.runMethod(false,"Get",(Object)((_col)))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 558;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 559;BA.debugLine="sb.Append(\" WHERE \")";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" WHERE ")));
 BA.debugLineNum = 560;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
Debug.ShouldStop(32768);
{
final RemoteObject group21 = _wherefieldequals.runMethod(false,"Keys");
final int groupLen21 = group21.runMethod(true,"getSize").<Integer>get()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.runMethod(false,"Get",index21));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 561;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
Debug.ShouldStop(65536);
_sb.runMethod(false,"Append",(Object)(_escapefield(_ba,_col))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?")));
 BA.debugLineNum = 562;BA.debugLine="sb.Append(\" AND \")";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 BA.debugLineNum = 563;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
Debug.ShouldStop(262144);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"Get",(Object)((_col)))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 565;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(" AND ").runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 566;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
Debug.ShouldStop(2097152);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","6137035803",RemoteObject.concat(RemoteObject.createImmutable("UpdateRecord: "),_sb.runMethod(true,"ToString")),0);
 BA.debugLineNum = 567;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(4194304);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 568;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}