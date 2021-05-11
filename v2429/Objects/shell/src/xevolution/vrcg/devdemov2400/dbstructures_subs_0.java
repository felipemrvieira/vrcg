package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbstructures_subs_0 {


public static RemoteObject  _adddatalist2table(RemoteObject _ba,RemoteObject _localsql,RemoteObject _tablename,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("AddDataList2Table (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2564);
if (RapidSub.canDelegate("adddatalist2table")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","adddatalist2table", _ba, _localsql, _tablename, _data);}
;
Debug.locals.put("LocalSQL", _localsql);
Debug.locals.put("Tablename", _tablename);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 2564;BA.debugLine="Sub AddDataList2Table(LocalSQL As SQL, Tablename A";
Debug.ShouldStop(8);
 BA.debugLineNum = 2565;BA.debugLine="DBUtils.InsertMaps(LocalSQL, Tablename, Data )";
Debug.ShouldStop(16);
dbstructures.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(_localsql),(Object)(_tablename),(Object)(_data));
 BA.debugLineNum = 2566;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddatamap2table(RemoteObject _ba,RemoteObject _localsql,RemoteObject _tablename,RemoteObject _mapping) throws Exception{
try {
		Debug.PushSubsStack("AddDataMap2Table (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2557);
if (RapidSub.canDelegate("adddatamap2table")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","adddatamap2table", _ba, _localsql, _tablename, _mapping);}
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("LocalSQL", _localsql);
Debug.locals.put("Tablename", _tablename);
Debug.locals.put("mapping", _mapping);
 BA.debugLineNum = 2557;BA.debugLine="Sub AddDataMap2Table(LocalSQL As SQL, Tablename As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2558;BA.debugLine="Dim Data As List";
Debug.ShouldStop(536870912);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Data", _data);
 BA.debugLineNum = 2559;BA.debugLine="Data.Initialize";
Debug.ShouldStop(1073741824);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 2560;BA.debugLine="Data.Add( mapping )";
Debug.ShouldStop(-2147483648);
_data.runVoidMethod ("Add",(Object)((_mapping.getObject())));
 BA.debugLineNum = 2561;BA.debugLine="DBUtils.InsertMaps(LocalSQL, Tablename, Data )";
Debug.ShouldStop(1);
dbstructures.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(_localsql),(Object)(_tablename),(Object)(_data));
 BA.debugLineNum = 2562;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addversionsdatamap(RemoteObject _ba,RemoteObject _localsql,RemoteObject _mapping) throws Exception{
try {
		Debug.PushSubsStack("AddVersionsDataMap (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2550);
if (RapidSub.canDelegate("addversionsdatamap")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","addversionsdatamap", _ba, _localsql, _mapping);}
;
Debug.locals.put("LocalSQL", _localsql);
Debug.locals.put("mapping", _mapping);
 BA.debugLineNum = 2550;BA.debugLine="Sub AddVersionsDataMap(LocalSQL As SQL, mapping As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 2551;BA.debugLine="AddDataMap2Table(LocalSQL, \"versions\", mapping )";
Debug.ShouldStop(4194304);
_adddatamap2table(_ba,_localsql,BA.ObjectToString("versions"),_mapping);
 BA.debugLineNum = 2552;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkworkingdaytasks(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CheckWorkingDayTasks (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1930);
if (RapidSub.canDelegate("checkworkingdaytasks")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","checkworkingdaytasks", _ba);}
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ret = RemoteObject.createImmutable(0);
;
 BA.debugLineNum = 1930;BA.debugLine="Sub CheckWorkingDayTasks";
Debug.ShouldStop(512);
 BA.debugLineNum = 1931;BA.debugLine="Dim SQL As String = $\"select * from userinnertask";
Debug.ShouldStop(1024);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select * from userinnertasks where ukey='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ))),RemoteObject.createImmutable("' and tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 1932;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
Debug.ShouldStop(2048);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1933;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(4096);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1934;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(8192);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1935;BA.debugLine="ShareCode.UWDUKEY_DETAILS = Record.GetInt(\"statu";
Debug.ShouldStop(16384);
dbstructures.mostCurrent._sharecode._uwdukey_details /*RemoteObject*/  = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status")));
 BA.debugLineNum = 1936;BA.debugLine="ShareCode.UWDUKEY_PRODUCTS = Record.GetInt(\"prod";
Debug.ShouldStop(32768);
dbstructures.mostCurrent._sharecode._uwdukey_products /*RemoteObject*/  = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("prodcheck")));
 BA.debugLineNum = 1937;BA.debugLine="ret = 1";
Debug.ShouldStop(65536);
_ret = BA.numberCast(int.class, 1);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1938;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 }
;
 BA.debugLineNum = 1941;BA.debugLine="If ret = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_ret,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1942;BA.debugLine="CreateWorkingDayTask(ShareCode.SESS_User, ShareC";
Debug.ShouldStop(2097152);
_createworkingdaytask(_ba,dbstructures.mostCurrent._sharecode._sess_user /*RemoteObject*/ ,dbstructures.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1943;BA.debugLine="ShareCode.UWDUKEY_DETAILS = 0";
Debug.ShouldStop(4194304);
dbstructures.mostCurrent._sharecode._uwdukey_details /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1944;BA.debugLine="ShareCode.UWDUKEY_PRODUCTS = 0";
Debug.ShouldStop(8388608);
dbstructures.mostCurrent._sharecode._uwdukey_products /*RemoteObject*/  = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 1946;BA.debugLine="Record.Close";
Debug.ShouldStop(33554432);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1948;BA.debugLine="CallSub(MainMenu, \"BadgeCheckUpdate\")";
Debug.ShouldStop(134217728);
dbstructures.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((dbstructures.mostCurrent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("BadgeCheckUpdate")));
 BA.debugLineNum = 1950;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtablesthatdonotexists(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CreateTablesThatDoNotExists (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2588);
if (RapidSub.canDelegate("createtablesthatdonotexists")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","createtablesthatdonotexists", _ba);}
RemoteObject _dta_tablecontrol = RemoteObject.createImmutable("");
RemoteObject _dta_tablecontrol_items = RemoteObject.createImmutable("");
RemoteObject _dta_tabledinamic = RemoteObject.createImmutable("");
RemoteObject _dta_tabledinamic_groups = RemoteObject.createImmutable("");
RemoteObject _dta_tabledinamic_items = RemoteObject.createImmutable("");
RemoteObject _dta_tabledinamic_subs = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 2588;BA.debugLine="Sub CreateTablesThatDoNotExists";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 2589;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(268435456);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("dta_tablecontrol"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2590;BA.debugLine="Dim dta_tablecontrol As String = $\"CREATE TABLE";
Debug.ShouldStop(536870912);
_dta_tablecontrol = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE `dta_tablecontrol` (\n"),RemoteObject.createImmutable("						`id` BIGINT(20) NOT NULL,\n"),RemoteObject.createImmutable("						`tagcode` VARCHAR(50) NOT NULL DEFAULT 'TABCTRL_',\n"),RemoteObject.createImmutable("						`title` VARCHAR(100) NOT NULL,\n"),RemoteObject.createImmutable("						`reference` VARCHAR(50) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						`color` VARCHAR(50) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						`codeid` INT(11) NULL DEFAULT '0',\n"),RemoteObject.createImmutable("						`level` INT(11) NULL DEFAULT '0',\n"),RemoteObject.createImmutable("						`position` INT(11) NULL DEFAULT '0',\n"),RemoteObject.createImmutable("						`created_at` TIMESTAMP NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						`updated_at` TIMESTAMP NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						`sid_id` INT(11) NOT NULL DEFAULT '0',\n"),RemoteObject.createImmutable("						`cbr_id` INT(11) NOT NULL DEFAULT '0',\n"),RemoteObject.createImmutable("						`active` TINYINT(1) NOT NULL DEFAULT '1',\n"),RemoteObject.createImmutable("						`paramters` TEXT NULL,\n"),RemoteObject.createImmutable("						PRIMARY KEY (`id`, `tagcode`)\n"),RemoteObject.createImmutable("					);")));Debug.locals.put("dta_tablecontrol", _dta_tablecontrol);Debug.locals.put("dta_tablecontrol", _dta_tablecontrol);
 BA.debugLineNum = 2607;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tablecontro";
Debug.ShouldStop(16384);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_dta_tablecontrol));
 };
 BA.debugLineNum = 2609;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(65536);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("dta_tablecontrol_items"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2610;BA.debugLine="Dim dta_tablecontrol_items As String = $\"CREATE";
Debug.ShouldStop(131072);
_dta_tablecontrol_items = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE `dta_tablecontrol_items` (\n"),RemoteObject.createImmutable("					`id` BIGINT(20) NOT NULL,\n"),RemoteObject.createImmutable("					`tabctrl_tagcode` VARCHAR(50) NOT NULL DEFAULT 'TABCTRL_',\n"),RemoteObject.createImmutable("					`fieldstr_01` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_02` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_03` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_04` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_05` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_06` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_07` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_08` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_09` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_10` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_11` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_12` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_13` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_14` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`fieldstr_15` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`title` VARCHAR(100) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`reference` VARCHAR(50) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`color` VARCHAR(50) NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`codeid` INT(11) NULL DEFAULT '0',\n"),RemoteObject.createImmutable("					`level` INT(11) NULL DEFAULT '0',\n"),RemoteObject.createImmutable("					`position` INT(11) NULL DEFAULT '0',\n"),RemoteObject.createImmutable("					`created_at` TIMESTAMP NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`updated_at` TIMESTAMP NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("					`sid_id` INT(11) NOT NULL DEFAULT '0',\n"),RemoteObject.createImmutable("					`cbr_id` INT(11) NOT NULL DEFAULT '0',\n"),RemoteObject.createImmutable("					`active` TINYINT(1) NOT NULL DEFAULT '1',\n"),RemoteObject.createImmutable("					PRIMARY KEY (`id`, `tabctrl_tagcode`)\n"),RemoteObject.createImmutable("				);")));Debug.locals.put("dta_tablecontrol_items", _dta_tablecontrol_items);Debug.locals.put("dta_tablecontrol_items", _dta_tablecontrol_items);
 BA.debugLineNum = 2641;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tablecontro";
Debug.ShouldStop(65536);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_dta_tablecontrol_items));
 };
 BA.debugLineNum = 2644;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(524288);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("dta_tabledinamic"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2645;BA.debugLine="Dim dta_tabledinamic As String = $\"CREATE TABLE";
Debug.ShouldStop(1048576);
_dta_tabledinamic = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS `dta_tabledinamic` (\n"),RemoteObject.createImmutable("				  `id` bigint(20) Not Null,\n"),RemoteObject.createImmutable("				  `tagcode` varchar(50) Not Null DEFAULT 'TABDIN_',\n"),RemoteObject.createImmutable("				  `title` varchar(100) Not Null,\n"),RemoteObject.createImmutable("				  `reference` varchar(50) DEFAULT Null,\n"),RemoteObject.createImmutable("				  `color` varchar(50) DEFAULT Null,\n"),RemoteObject.createImmutable("				  `codeid` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `level` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `position` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `created_at` timestamp Null DEFAULT Null,\n"),RemoteObject.createImmutable("				  `updated_at` timestamp Null DEFAULT Null,\n"),RemoteObject.createImmutable("				  `sid_id` int(11) Not Null DEFAULT '0',\n"),RemoteObject.createImmutable("				  `cbr_id` int(11) Not Null DEFAULT '0',\n"),RemoteObject.createImmutable("				  `active` tinyint(1) Not Null DEFAULT '1',\n"),RemoteObject.createImmutable("				  `is_level` tinyint(4) DEFAULT '0',\n"),RemoteObject.createImmutable("				  PRIMARY KEY (`id`,`tagcode`)\n"),RemoteObject.createImmutable("				);")));Debug.locals.put("dta_tabledinamic", _dta_tabledinamic);Debug.locals.put("dta_tabledinamic", _dta_tabledinamic);
 BA.debugLineNum = 2662;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinami";
Debug.ShouldStop(32);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_dta_tabledinamic));
 };
 BA.debugLineNum = 2665;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(256);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("dta_tabledinamic_groups"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2666;BA.debugLine="Dim dta_tabledinamic_groups As String = $\"CREATE";
Debug.ShouldStop(512);
_dta_tabledinamic_groups = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS `dta_tabledinamic_groups` (\n"),RemoteObject.createImmutable("				  `id` bigint(20) Not Null,\n"),RemoteObject.createImmutable("				  `tabdin_tagcode` varchar(50) Not Null,\n"),RemoteObject.createImmutable("				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINGRP_',\n"),RemoteObject.createImmutable("				  `title` varchar(100) Not Null,\n"),RemoteObject.createImmutable("				  `reference` varchar(50) DEFAULT Null,\n"),RemoteObject.createImmutable("				  `color` varchar(50) DEFAULT Null,\n"),RemoteObject.createImmutable("				  `codeid` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `level` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `position` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `origin` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `created_at` timestamp Null DEFAULT Null,\n"),RemoteObject.createImmutable("				  `updated_at` timestamp Null DEFAULT Null,\n"),RemoteObject.createImmutable("				  `sid_id` int(11) Not Null DEFAULT '0',\n"),RemoteObject.createImmutable("				  `cbr_id` int(11) Not Null DEFAULT '0',\n"),RemoteObject.createImmutable("				  `active` tinyint(1) Not Null DEFAULT '1',\n"),RemoteObject.createImmutable("				  PRIMARY KEY (`id`,`tabdin_tagcode`,`tagcode`)\n"),RemoteObject.createImmutable("				);")));Debug.locals.put("dta_tabledinamic_groups", _dta_tabledinamic_groups);Debug.locals.put("dta_tabledinamic_groups", _dta_tabledinamic_groups);
 BA.debugLineNum = 2684;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinami";
Debug.ShouldStop(134217728);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_dta_tabledinamic_groups));
 };
 BA.debugLineNum = 2687;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(1073741824);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("dta_tabledinamic_items"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2688;BA.debugLine="Dim dta_tabledinamic_items As String = $\"CREATE";
Debug.ShouldStop(-2147483648);
_dta_tabledinamic_items = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS `dta_tabledinamic_items` (\n"),RemoteObject.createImmutable("				  `id` bigint(20) Not Null,\n"),RemoteObject.createImmutable("				  `tabdingroup_tagcode` varchar(50) Not Null,\n"),RemoteObject.createImmutable("				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINITEM_',\n"),RemoteObject.createImmutable("				  `title` varchar(100) Not Null,\n"),RemoteObject.createImmutable("				  `reference` varchar(50) DEFAULT Null,\n"),RemoteObject.createImmutable("				  `color` varchar(50) DEFAULT Null,\n"),RemoteObject.createImmutable("				  `codeid` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `level` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `position` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `origin` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `created_at` timestamp Null DEFAULT Null,\n"),RemoteObject.createImmutable("				  `updated_at` timestamp Null DEFAULT Null,\n"),RemoteObject.createImmutable("				  `sid_id` int(11) Not Null DEFAULT '0',\n"),RemoteObject.createImmutable("				  `cbr_id` int(11) Not Null DEFAULT '0',\n"),RemoteObject.createImmutable("				  `active` tinyint(1) Not Null DEFAULT '1',\n"),RemoteObject.createImmutable("				  PRIMARY KEY (`id`,`tabdingroup_tagcode`,`tagcode`)\n"),RemoteObject.createImmutable("				);")));Debug.locals.put("dta_tabledinamic_items", _dta_tabledinamic_items);Debug.locals.put("dta_tabledinamic_items", _dta_tabledinamic_items);
 BA.debugLineNum = 2706;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinami";
Debug.ShouldStop(131072);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_dta_tabledinamic_items));
 };
 BA.debugLineNum = 2709;BA.debugLine="If Not(DBUtils.TableExists(Starter.LocalSQLEVC, \"";
Debug.ShouldStop(1048576);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("dta_tabledinamic_subs"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2710;BA.debugLine="Dim dta_tabledinamic_subs As String = $\"CREATE T";
Debug.ShouldStop(2097152);
_dta_tabledinamic_subs = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS `dta_tabledinamic_subs` (\n"),RemoteObject.createImmutable("				  `id` bigint(20) Not Null,\n"),RemoteObject.createImmutable("				  `tabdinitem_tagcode` varchar(50) Not Null,\n"),RemoteObject.createImmutable("				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINSUBS_',\n"),RemoteObject.createImmutable("				  `title` varchar(100) Not Null,\n"),RemoteObject.createImmutable("				  `reference` varchar(50) DEFAULT Null,\n"),RemoteObject.createImmutable("				  `color` varchar(50) DEFAULT Null,\n"),RemoteObject.createImmutable("				  `codeid` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `level` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `position` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `origin` int(11) DEFAULT '0',\n"),RemoteObject.createImmutable("				  `created_at` timestamp Null DEFAULT Null,\n"),RemoteObject.createImmutable("				  `updated_at` timestamp Null DEFAULT Null,\n"),RemoteObject.createImmutable("				  `sid_id` int(11) Not Null DEFAULT '0',\n"),RemoteObject.createImmutable("				  `cbr_id` int(11) Not Null DEFAULT '0',\n"),RemoteObject.createImmutable("				  `active` tinyint(1) Not Null DEFAULT '1',\n"),RemoteObject.createImmutable("				  PRIMARY KEY (`id`,`tabdinitem_tagcode`,`tagcode`)\n"),RemoteObject.createImmutable("				);")));Debug.locals.put("dta_tabledinamic_subs", _dta_tabledinamic_subs);Debug.locals.put("dta_tabledinamic_subs", _dta_tabledinamic_subs);
 BA.debugLineNum = 2728;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinami";
Debug.ShouldStop(128);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_dta_tabledinamic_subs));
 };
 BA.debugLineNum = 2731;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createworkingdaytask(RemoteObject _ba,RemoteObject _usertagcode,RemoteObject _uniquekey,RemoteObject _status) throws Exception{
try {
		Debug.PushSubsStack("CreateWorkingDayTask (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1952);
if (RapidSub.canDelegate("createworkingdaytask")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","createworkingdaytask", _ba, _usertagcode, _uniquekey, _status);}
RemoteObject _currdatetime = RemoteObject.createImmutable("");
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("userTagcode", _usertagcode);
Debug.locals.put("uniqueKey", _uniquekey);
Debug.locals.put("Status", _status);
 BA.debugLineNum = 1952;BA.debugLine="Sub CreateWorkingDayTask(userTagcode As String, un";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1953;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(1);
dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 1954;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(2);
dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 1955;BA.debugLine="Dim CurrDateTime As String = $\"$date{DateTime.Now";
Debug.ShouldStop(4);
_currdatetime = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(" "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));Debug.locals.put("CurrDateTime", _currdatetime);Debug.locals.put("CurrDateTime", _currdatetime);
 BA.debugLineNum = 1956;BA.debugLine="Dim sqlScript As String = $\"insert into userinner";
Debug.ShouldStop(8);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("insert into userinnertasks (tagcode, datetime, ukey, status, prodcheck) values ('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usertagcode))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currdatetime))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uniquekey))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status))),RemoteObject.createImmutable("', 0)")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 1957;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(16);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 1958;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _db2clataskitem(RemoteObject _ba,RemoteObject _task,RemoteObject _ukey) throws Exception{
try {
		Debug.PushSubsStack("DB2CLATaskItem (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1002);
if (RapidSub.canDelegate("db2clataskitem")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","db2clataskitem", _ba, _task, _ukey);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._clataskitem");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("task", _task);
Debug.locals.put("ukey", _ukey);
 BA.debugLineNum = 1002;BA.debugLine="Sub DB2CLATaskItem(task As String, ukey As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 1004;BA.debugLine="Dim ret As CLATaskItem";
Debug.ShouldStop(2048);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._clataskitem");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1005;BA.debugLine="ret.Initialize";
Debug.ShouldStop(4096);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1007;BA.debugLine="If Utils.NNE(task) And Utils.NNE(ukey) Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_task))) && RemoteObject.solveBoolean(".",dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_ukey)))) { 
 BA.debugLineNum = 1008;BA.debugLine="Dim sSQL As String = $\"${EVC_SQL_GETTASKITEMS} a";
Debug.ShouldStop(32768);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures._evc_sql_gettaskitems))),RemoteObject.createImmutable(" and a.task_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task))),RemoteObject.createImmutable("' and a.unique_key='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ukey))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1009;BA.debugLine="Dim record As ResultSet = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(65536);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("record", _record);
 BA.debugLineNum = 1010;BA.debugLine="Do While record.NextRow";
Debug.ShouldStop(131072);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1011;BA.debugLine="ret.task_tagcode = Utils.ifnullorempty(record.G";
Debug.ShouldStop(262144);
_ret.setField ("task_tagcode" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1012;BA.debugLine="ret.item_tagcode = Utils.ifnullorempty(record.G";
Debug.ShouldStop(524288);
_ret.setField ("item_tagcode" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("item_tagcode")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1013;BA.debugLine="ret.unique_key = Utils.ifnullorempty(record.Get";
Debug.ShouldStop(1048576);
_ret.setField ("unique_key" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("unique_key")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1014;BA.debugLine="ret.position = record.GetInt(\"position\")";
Debug.ShouldStop(2097152);
_ret.setField ("position" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("position"))));
 BA.debugLineNum = 1015;BA.debugLine="ret.level = record.GetInt(\"level\")";
Debug.ShouldStop(4194304);
_ret.setField ("level" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("level"))));
 BA.debugLineNum = 1016;BA.debugLine="ret.parent_tagcode = Utils.ifnullorempty(record";
Debug.ShouldStop(8388608);
_ret.setField ("parent_tagcode" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("parent_tagcode")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1017;BA.debugLine="ret.item_type = record.GetInt(\"item_type\")";
Debug.ShouldStop(16777216);
_ret.setField ("item_type" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("item_type"))));
 BA.debugLineNum = 1018;BA.debugLine="ret.points = record.GetInt(\"points\")";
Debug.ShouldStop(33554432);
_ret.setField ("points" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("points"))));
 BA.debugLineNum = 1019;BA.debugLine="ret.risk = record.GetInt(\"risk\")";
Debug.ShouldStop(67108864);
_ret.setField ("risk" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("risk"))));
 BA.debugLineNum = 1020;BA.debugLine="ret.data_type = record.GetInt(\"data_type\")";
Debug.ShouldStop(134217728);
_ret.setField ("data_type" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("data_type"))));
 BA.debugLineNum = 1021;BA.debugLine="ret.bullet_master = record.GetInt(\"bullet_maste";
Debug.ShouldStop(268435456);
_ret.setField ("bullet_master" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("bullet_master"))));
 BA.debugLineNum = 1022;BA.debugLine="ret.bullet_child = record.GetInt(\"bullet_child\"";
Debug.ShouldStop(536870912);
_ret.setField ("bullet_child" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("bullet_child"))));
 BA.debugLineNum = 1023;BA.debugLine="ret.type_answer = Utils.ifnullorempty(record.Ge";
Debug.ShouldStop(1073741824);
_ret.setField ("type_answer" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type_answer")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1024;BA.debugLine="ret.typified_answers = record.GetInt(\"typified_";
Debug.ShouldStop(-2147483648);
_ret.setField ("typified_answers" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("typified_answers"))));
 BA.debugLineNum = 1025;BA.debugLine="ret.mandatory = record.GetInt(\"mandatory\")";
Debug.ShouldStop(1);
_ret.setField ("mandatory" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("mandatory"))));
 BA.debugLineNum = 1026;BA.debugLine="ret.critical = record.GetInt(\"critical\")";
Debug.ShouldStop(2);
_ret.setField ("critical" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("critical"))));
 BA.debugLineNum = 1027;BA.debugLine="ret.repeated = record.GetInt(\"repeated\")";
Debug.ShouldStop(4);
_ret.setField ("repeated" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeated"))));
 BA.debugLineNum = 1028;BA.debugLine="ret.multiple = record.GetInt(\"multiple\")";
Debug.ShouldStop(8);
_ret.setField ("multiple" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("multiple"))));
 BA.debugLineNum = 1029;BA.debugLine="ret.on_report = record.GetInt(\"on_report\")";
Debug.ShouldStop(16);
_ret.setField ("on_report" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("on_report"))));
 BA.debugLineNum = 1030;BA.debugLine="ret.has_signature = record.GetInt(\"has_signatur";
Debug.ShouldStop(32);
_ret.setField ("has_signature" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("has_signature"))));
 BA.debugLineNum = 1031;BA.debugLine="ret.has_articles = record.GetInt(\"has_articles\"";
Debug.ShouldStop(64);
_ret.setField ("has_articles" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("has_articles"))));
 BA.debugLineNum = 1032;BA.debugLine="ret.type_nonconformity = Utils.ifnullorempty(re";
Debug.ShouldStop(128);
_ret.setField ("type_nonconformity" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type_nonconformity")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1033;BA.debugLine="ret.ta_tagcode = Utils.ifnullorempty(record.Get";
Debug.ShouldStop(256);
_ret.setField ("ta_tagcode" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ta_tagcode")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1034;BA.debugLine="ret.ta_override_result = record.GetInt(\"ta_over";
Debug.ShouldStop(512);
_ret.setField ("ta_override_result" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ta_override_result"))));
 BA.debugLineNum = 1035;BA.debugLine="ret.ta_jump_tagcode = Utils.ifnullorempty(recor";
Debug.ShouldStop(1024);
_ret.setField ("ta_jump_tagcode" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ta_jump_tagcode")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1036;BA.debugLine="ret.defobj_tagcode = Utils.ifnullorempty(record";
Debug.ShouldStop(2048);
_ret.setField ("defobj_tagcode" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("defobj_tagcode")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1037;BA.debugLine="ret.info_notes = Utils.ifnullorempty(record.Get";
Debug.ShouldStop(4096);
_ret.setField ("info_notes" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("info_notes")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1038;BA.debugLine="ret.asw_notes = Utils.ifnullorempty(record.GetS";
Debug.ShouldStop(8192);
_ret.setField ("asw_notes" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("asw_notes")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1039;BA.debugLine="ret.validate_execution = record.GetInt(\"validat";
Debug.ShouldStop(16384);
_ret.setField ("validate_execution" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("validate_execution"))));
 BA.debugLineNum = 1040;BA.debugLine="ret.cla_obs = Utils.ifnullorempty(record.GetStr";
Debug.ShouldStop(32768);
_ret.setField ("cla_obs" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cla_obs")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1041;BA.debugLine="ret.force_signature = record.GetInt(\"force_sign";
Debug.ShouldStop(65536);
_ret.setField ("force_signature" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("force_signature"))));
 BA.debugLineNum = 1042;BA.debugLine="ret.force_picture = record.GetInt(\"force_pictur";
Debug.ShouldStop(131072);
_ret.setField ("force_picture" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("force_picture"))));
 BA.debugLineNum = 1043;BA.debugLine="ret.force_time = record.GetInt(\"force_time\")";
Debug.ShouldStop(262144);
_ret.setField ("force_time" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("force_time"))));
 BA.debugLineNum = 1044;BA.debugLine="ret.type_time_control = record.GetInt(\"type_tim";
Debug.ShouldStop(524288);
_ret.setField ("type_time_control" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type_time_control"))));
 BA.debugLineNum = 1045;BA.debugLine="ret.time_run_anyway = record.GetInt(\"time_run_a";
Debug.ShouldStop(1048576);
_ret.setField ("time_run_anyway" /*RemoteObject*/ ,_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("time_run_anyway"))));
 BA.debugLineNum = 1046;BA.debugLine="ret.dependent_key = Utils.ifnullorempty(record.";
Debug.ShouldStop(2097152);
_ret.setField ("dependent_key" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("dependent_key")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1047;BA.debugLine="ret.time_duration = Utils.ifnullorempty(record.";
Debug.ShouldStop(4194304);
_ret.setField ("time_duration" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("time_duration")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1048;BA.debugLine="ret.force_control = record.GetString(\"force_con";
Debug.ShouldStop(8388608);
_ret.setField ("force_control" /*RemoteObject*/ ,BA.numberCast(int.class, _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("force_control")))));
 BA.debugLineNum = 1049;BA.debugLine="ret.type_control = record.GetString(\"type_contr";
Debug.ShouldStop(16777216);
_ret.setField ("type_control" /*RemoteObject*/ ,BA.numberCast(int.class, _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type_control")))));
 BA.debugLineNum = 1050;BA.debugLine="ret.control_run_anyway = record.GetString(\"cont";
Debug.ShouldStop(33554432);
_ret.setField ("control_run_anyway" /*RemoteObject*/ ,BA.numberCast(int.class, _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("control_run_anyway")))));
 BA.debugLineNum = 1051;BA.debugLine="ret.control_condition = Utils.ifnullorempty(rec";
Debug.ShouldStop(67108864);
_ret.setField ("control_condition" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("control_condition")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1052;BA.debugLine="ret.do_tagcode = Utils.ifnullorempty(record.Get";
Debug.ShouldStop(134217728);
_ret.setField ("do_tagcode" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_tagcode")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1053;BA.debugLine="ret.do_associate_type = record.GetString(\"do_as";
Debug.ShouldStop(268435456);
_ret.setField ("do_associate_type" /*RemoteObject*/ ,BA.numberCast(int.class, _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_associate_type")))));
 BA.debugLineNum = 1054;BA.debugLine="ret.do_object_image = Utils.ifnullorempty(recor";
Debug.ShouldStop(536870912);
_ret.setField ("do_object_image" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_object_image")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1055;BA.debugLine="ret.reference = Utils.ifnullorempty(record.GetS";
Debug.ShouldStop(1073741824);
_ret.setField ("reference" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reference")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1056;BA.debugLine="ret.do_subgroup = Utils.ifnullorempty(record.Ge";
Debug.ShouldStop(-2147483648);
_ret.setField ("do_subgroup" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_subgroup")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1057;BA.debugLine="ret.do_subsubgroup = Utils.ifnullorempty(record";
Debug.ShouldStop(1);
_ret.setField ("do_subsubgroup" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_subsubgroup")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1058;BA.debugLine="ret.do_affected_table = Utils.ifnullorempty(rec";
Debug.ShouldStop(2);
_ret.setField ("do_affected_table" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_affected_table")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1059;BA.debugLine="ret.do_affected_tagcode = Utils.ifnullorempty(r";
Debug.ShouldStop(4);
_ret.setField ("do_affected_tagcode" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_affected_tagcode")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1060;BA.debugLine="ret.do_affected_field = Utils.ifnullorempty(rec";
Debug.ShouldStop(8);
_ret.setField ("do_affected_field" /*RemoteObject*/ ,dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_affected_field")))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1061;BA.debugLine="ret.change_title_totime = record.GetString(\"cha";
Debug.ShouldStop(16);
_ret.setField ("change_title_totime" /*RemoteObject*/ ,BA.numberCast(int.class, _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("change_title_totime")))));
 BA.debugLineNum = 1062;BA.debugLine="ret.answer_change_title = record.GetString(\"ans";
Debug.ShouldStop(32);
_ret.setField ("answer_change_title" /*RemoteObject*/ ,BA.numberCast(int.class, _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("answer_change_title")))));
 BA.debugLineNum = 1063;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 }
;
 BA.debugLineNum = 1065;BA.debugLine="record.Close";
Debug.ShouldStop(256);
_record.runVoidMethod ("Close");
 }else {
 BA.debugLineNum = 1067;BA.debugLine="ret.task_tagcode = \"\"";
Debug.ShouldStop(1024);
_ret.setField ("task_tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1068;BA.debugLine="ret.item_tagcode = \"\"";
Debug.ShouldStop(2048);
_ret.setField ("item_tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1069;BA.debugLine="ret.unique_key = \"\"";
Debug.ShouldStop(4096);
_ret.setField ("unique_key" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1070;BA.debugLine="ret.position = 0";
Debug.ShouldStop(8192);
_ret.setField ("position" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1071;BA.debugLine="ret.level = 0";
Debug.ShouldStop(16384);
_ret.setField ("level" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1072;BA.debugLine="ret.parent_tagcode = \"\"";
Debug.ShouldStop(32768);
_ret.setField ("parent_tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1073;BA.debugLine="ret.item_type = 0";
Debug.ShouldStop(65536);
_ret.setField ("item_type" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1074;BA.debugLine="ret.points = 0";
Debug.ShouldStop(131072);
_ret.setField ("points" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1075;BA.debugLine="ret.risk = 0";
Debug.ShouldStop(262144);
_ret.setField ("risk" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1076;BA.debugLine="ret.data_type = 0";
Debug.ShouldStop(524288);
_ret.setField ("data_type" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1077;BA.debugLine="ret.bullet_master = 0";
Debug.ShouldStop(1048576);
_ret.setField ("bullet_master" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1078;BA.debugLine="ret.bullet_child = 0";
Debug.ShouldStop(2097152);
_ret.setField ("bullet_child" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1079;BA.debugLine="ret.type_answer = \"\"";
Debug.ShouldStop(4194304);
_ret.setField ("type_answer" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1080;BA.debugLine="ret.typified_answers = 0";
Debug.ShouldStop(8388608);
_ret.setField ("typified_answers" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1081;BA.debugLine="ret.mandatory = 0";
Debug.ShouldStop(16777216);
_ret.setField ("mandatory" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1082;BA.debugLine="ret.critical = 0";
Debug.ShouldStop(33554432);
_ret.setField ("critical" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1083;BA.debugLine="ret.repeated = 0";
Debug.ShouldStop(67108864);
_ret.setField ("repeated" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1084;BA.debugLine="ret.multiple = 0";
Debug.ShouldStop(134217728);
_ret.setField ("multiple" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1085;BA.debugLine="ret.on_report = 0";
Debug.ShouldStop(268435456);
_ret.setField ("on_report" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1086;BA.debugLine="ret.has_signature = 0";
Debug.ShouldStop(536870912);
_ret.setField ("has_signature" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1087;BA.debugLine="ret.has_articles = 0";
Debug.ShouldStop(1073741824);
_ret.setField ("has_articles" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1088;BA.debugLine="ret.type_nonconformity = \"\"";
Debug.ShouldStop(-2147483648);
_ret.setField ("type_nonconformity" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1089;BA.debugLine="ret.ta_tagcode = \"\"";
Debug.ShouldStop(1);
_ret.setField ("ta_tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1090;BA.debugLine="ret.ta_override_result = 0";
Debug.ShouldStop(2);
_ret.setField ("ta_override_result" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1091;BA.debugLine="ret.ta_jump_tagcode = \"\"";
Debug.ShouldStop(4);
_ret.setField ("ta_jump_tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1092;BA.debugLine="ret.defobj_tagcode = \"\"";
Debug.ShouldStop(8);
_ret.setField ("defobj_tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1093;BA.debugLine="ret.info_notes = \"\"";
Debug.ShouldStop(16);
_ret.setField ("info_notes" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1094;BA.debugLine="ret.asw_notes = \"\"";
Debug.ShouldStop(32);
_ret.setField ("asw_notes" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1095;BA.debugLine="ret.validate_execution = 0";
Debug.ShouldStop(64);
_ret.setField ("validate_execution" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1096;BA.debugLine="ret.cla_obs = \"\"";
Debug.ShouldStop(128);
_ret.setField ("cla_obs" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1097;BA.debugLine="ret.force_signature = 0";
Debug.ShouldStop(256);
_ret.setField ("force_signature" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1098;BA.debugLine="ret.force_picture = 0";
Debug.ShouldStop(512);
_ret.setField ("force_picture" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1099;BA.debugLine="ret.force_time = 0";
Debug.ShouldStop(1024);
_ret.setField ("force_time" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1100;BA.debugLine="ret.type_time_control = 0";
Debug.ShouldStop(2048);
_ret.setField ("type_time_control" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1101;BA.debugLine="ret.time_run_anyway = 0";
Debug.ShouldStop(4096);
_ret.setField ("time_run_anyway" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1102;BA.debugLine="ret.dependent_key = \"\"";
Debug.ShouldStop(8192);
_ret.setField ("dependent_key" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1103;BA.debugLine="ret.time_duration = \"\"";
Debug.ShouldStop(16384);
_ret.setField ("time_duration" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1104;BA.debugLine="ret.force_control = 0";
Debug.ShouldStop(32768);
_ret.setField ("force_control" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1105;BA.debugLine="ret.type_control = 0";
Debug.ShouldStop(65536);
_ret.setField ("type_control" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1106;BA.debugLine="ret.control_run_anyway = 0";
Debug.ShouldStop(131072);
_ret.setField ("control_run_anyway" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1107;BA.debugLine="ret.control_condition = \"\"";
Debug.ShouldStop(262144);
_ret.setField ("control_condition" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1108;BA.debugLine="ret.do_tagcode = \"\"";
Debug.ShouldStop(524288);
_ret.setField ("do_tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1109;BA.debugLine="ret.do_associate_type = 0";
Debug.ShouldStop(1048576);
_ret.setField ("do_associate_type" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1110;BA.debugLine="ret.do_object_image = \"\"";
Debug.ShouldStop(2097152);
_ret.setField ("do_object_image" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1111;BA.debugLine="ret.reference = \"\"";
Debug.ShouldStop(4194304);
_ret.setField ("reference" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1112;BA.debugLine="ret.do_subgroup = \"\"";
Debug.ShouldStop(8388608);
_ret.setField ("do_subgroup" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1113;BA.debugLine="ret.do_subsubgroup = \"\"";
Debug.ShouldStop(16777216);
_ret.setField ("do_subsubgroup" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1114;BA.debugLine="ret.do_affected_table = \"\"";
Debug.ShouldStop(33554432);
_ret.setField ("do_affected_table" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1115;BA.debugLine="ret.do_affected_tagcode = \"\"";
Debug.ShouldStop(67108864);
_ret.setField ("do_affected_tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1116;BA.debugLine="ret.do_affected_field = \"\"";
Debug.ShouldStop(134217728);
_ret.setField ("do_affected_field" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1117;BA.debugLine="ret.change_title_totime = 0";
Debug.ShouldStop(268435456);
_ret.setField ("change_title_totime" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1118;BA.debugLine="ret.answer_change_title = 0";
Debug.ShouldStop(536870912);
_ret.setField ("answer_change_title" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 1121;BA.debugLine="Return ret";
Debug.ShouldStop(1);
if (true) return _ret;
 BA.debugLineNum = 1122;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletearticlesfromlocaldatabasefromstring(RemoteObject _ba,RemoteObject _listastr) throws Exception{
try {
		Debug.PushSubsStack("DeleteArticlesFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1463);
if (RapidSub.canDelegate("deletearticlesfromlocaldatabasefromstring")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletearticlesfromlocaldatabasefromstring", _ba, _listastr);}
ResumableSub_DeleteArticlesFromLocalDatabaseFromString rsub = new ResumableSub_DeleteArticlesFromLocalDatabaseFromString(null,_ba,_listastr);
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
public static class ResumableSub_DeleteArticlesFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteArticlesFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _listastr;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteArticlesFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1463);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1468;BA.debugLine="If Utils.NNE(ListaStr) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_listastr)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1469;BA.debugLine="Log(\"Delete Tagcodes From dta_articles and sub \"";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617629190",RemoteObject.createImmutable("Delete Tagcodes From dta_articles and sub "),0);
 BA.debugLineNum = 1470;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("(")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(")"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1471;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
Debug.ShouldStop(1073741824);
_listastr = (RemoteObject.concat(RemoteObject.createImmutable("("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(")")));Debug.locals.put("ListaStr", _listastr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1474;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(2);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_articles where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1477;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1478;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _deletecontactsfromlocaldatabasefromstring(RemoteObject _ba,RemoteObject _listastr) throws Exception{
try {
		Debug.PushSubsStack("DeleteContactsFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1411);
if (RapidSub.canDelegate("deletecontactsfromlocaldatabasefromstring")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletecontactsfromlocaldatabasefromstring", _ba, _listastr);}
ResumableSub_DeleteContactsFromLocalDatabaseFromString rsub = new ResumableSub_DeleteContactsFromLocalDatabaseFromString(null,_ba,_listastr);
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
public static class ResumableSub_DeleteContactsFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteContactsFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _listastr;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteContactsFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1411);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1416;BA.debugLine="If Utils.NNE(ListaStr) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_listastr)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1417;BA.debugLine="Log(\"Delete Tagcodes From dta_contacts and sub \"";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617432582",RemoteObject.createImmutable("Delete Tagcodes From dta_contacts and sub "),0);
 BA.debugLineNum = 1418;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("(")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(")"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1419;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
Debug.ShouldStop(1024);
_listastr = (RemoteObject.concat(RemoteObject.createImmutable("("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(")")));Debug.locals.put("ListaStr", _listastr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1422;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_contacts where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1423;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(16384);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_contacts_adds where object_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1426;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1427;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _deletefromlocaldatabase(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DeleteFromLocalDatabase (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1247);
if (RapidSub.canDelegate("deletefromlocaldatabase")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletefromlocaldatabase", _ba);}
RemoteObject _where = RemoteObject.createImmutable("");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _request_tagcode = RemoteObject.createImmutable("");
RemoteObject _listastr = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 1247;BA.debugLine="Sub DeleteFromLocalDatabase";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1248;BA.debugLine="Dim where As String = $\"select distinct tagcode f";
Debug.ShouldStop(-2147483648);
_where = (RemoteObject.concat(RemoteObject.createImmutable("select distinct tagcode from dta_requests where execute_date>='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable("' and execute_date<='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(dbstructures.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))))))),RemoteObject.createImmutable("'")));Debug.locals.put("where", _where);Debug.locals.put("where", _where);
 BA.debugLineNum = 1249;BA.debugLine="Log(\"DeleteFromLocalDatabase Where \" & where)";
Debug.ShouldStop(1);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","616973826",RemoteObject.concat(RemoteObject.createImmutable("DeleteFromLocalDatabase Where "),_where),0);
 BA.debugLineNum = 1250;BA.debugLine="Dim Lista As List = GetListOfFromScriptEVC(\"tagco";
Debug.ShouldStop(2);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lista = _getlistoffromscriptevc(_ba,BA.ObjectToString("tagcode"),_where);Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 1251;BA.debugLine="If (Lista.Size >=1)Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("g",_lista.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1253;BA.debugLine="Dim request_tagcode As String = Utils.MakeFileNa";
Debug.ShouldStop(16);
_request_tagcode = dbstructures.mostCurrent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,_ba);Debug.locals.put("request_tagcode", _request_tagcode);Debug.locals.put("request_tagcode", _request_tagcode);
 BA.debugLineNum = 1254;BA.debugLine="Dim ListaStr As String = Utils.StrList2SQLArray(";
Debug.ShouldStop(32);
_listastr = dbstructures.mostCurrent._utils.runMethod(true,"_strlist2sqlarray" /*RemoteObject*/ ,_ba,(Object)(_lista));Debug.locals.put("ListaStr", _listastr);Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1255;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(64);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests where tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1256;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(128);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1257;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(256);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1258;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(512);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_signatures where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1259;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(1024);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_relations where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1260;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(2048);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_output_actions where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1261;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(4096);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_output where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1262;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(8192);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_objects where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1263;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(16384);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_notes where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1264;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(32768);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_fields where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1265;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(65536);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_entities where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1266;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(131072);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_documents where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1267;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(262144);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_contacts where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1268;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(524288);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_alerts where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1269;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(1048576);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1270;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(2097152);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_relations_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1271;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(4194304);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 BA.debugLineNum = 1272;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",$\"delete from dt";
Debug.ShouldStop(8388608);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("DataUpdate")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))),(Object)(_request_tagcode));
 };
 BA.debugLineNum = 1274;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletefromlocaldatabasefromlist(RemoteObject _ba,RemoteObject _lista) throws Exception{
try {
		Debug.PushSubsStack("DeleteFromLocalDatabaseFromList (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1277);
if (RapidSub.canDelegate("deletefromlocaldatabasefromlist")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletefromlocaldatabasefromlist", _ba, _lista);}
RemoteObject _listastr = RemoteObject.createImmutable("");
;
Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 1277;BA.debugLine="Sub DeleteFromLocalDatabaseFromList(Lista As List)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1278;BA.debugLine="If (Lista.Size >=1)Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("g",_lista.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1279;BA.debugLine="Log(\"Delete Tagcodes From dta_requests and sub \"";
Debug.ShouldStop(1073741824);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","617039362",RemoteObject.createImmutable("Delete Tagcodes From dta_requests and sub "),0);
 BA.debugLineNum = 1280;BA.debugLine="Dim ListaStr As String = Utils.StrList2SQLArray(";
Debug.ShouldStop(-2147483648);
_listastr = dbstructures.mostCurrent._utils.runMethod(true,"_strlist2sqlarray" /*RemoteObject*/ ,_ba,(Object)(_lista));Debug.locals.put("ListaStr", _listastr);Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1281;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(1);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests where tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1282;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(2);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1283;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(4);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1284;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(8);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_signatures where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1285;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(16);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_relations where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1286;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(32);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_output_actions where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1287;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(64);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_output where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1288;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(128);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_objects where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1289;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(256);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_notes where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1290;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(512);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_fields where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1291;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(1024);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_entities where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1292;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(2048);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_documents where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1293;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(4096);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_contacts where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1294;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(8192);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_alerts where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1295;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(16384);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1296;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(32768);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_relations_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1297;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(65536);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1298;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(131072);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 1300;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletefromlocaldatabasefromlist2(RemoteObject _ba,RemoteObject _lista,RemoteObject _action,RemoteObject _repeatcounter) throws Exception{
try {
		Debug.PushSubsStack("DeleteFromLocalDatabaseFromList2 (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1302);
if (RapidSub.canDelegate("deletefromlocaldatabasefromlist2")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletefromlocaldatabasefromlist2", _ba, _lista, _action, _repeatcounter);}
RemoteObject _listastr = RemoteObject.createImmutable("");
;
Debug.locals.put("Lista", _lista);
Debug.locals.put("action", _action);
Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 1302;BA.debugLine="Sub DeleteFromLocalDatabaseFromList2(Lista As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1303;BA.debugLine="If (Lista.Size >=1)Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("g",_lista.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1304;BA.debugLine="Log(\"Delete Tagcodes From dta_requests and sub \"";
Debug.ShouldStop(8388608);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","617104898",RemoteObject.createImmutable("Delete Tagcodes From dta_requests and sub "),0);
 BA.debugLineNum = 1305;BA.debugLine="Dim ListaStr As String = Utils.StrList2SQLArray(";
Debug.ShouldStop(16777216);
_listastr = dbstructures.mostCurrent._utils.runMethod(true,"_strlist2sqlarray" /*RemoteObject*/ ,_ba,(Object)(_lista));Debug.locals.put("ListaStr", _listastr);Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1306;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(33554432);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(" and inner_request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1307;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(67108864);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(" and inner_request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1308;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(134217728);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_signatures where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(" and inner_request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1309;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(268435456);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_relations where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(" and relation_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1310;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(536870912);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(" and inner_request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1311;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(1073741824);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(" and inner_request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1312;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(-2147483648);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_relations_adds where request_tagcode in "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(" and relation_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 1314;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletefromlocaldatabasefromstring(RemoteObject _ba,RemoteObject _listastr) throws Exception{
try {
		Debug.PushSubsStack("DeleteFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1316);
if (RapidSub.canDelegate("deletefromlocaldatabasefromstring")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletefromlocaldatabasefromstring", _ba, _listastr);}
ResumableSub_DeleteFromLocalDatabaseFromString rsub = new ResumableSub_DeleteFromLocalDatabaseFromString(null,_ba,_listastr);
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
public static class ResumableSub_DeleteFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _listastr;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1316);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1321;BA.debugLine="If Utils.NNE(ListaStr) Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_listastr)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1322;BA.debugLine="Log(\"Delete Tagcodes From dta_requests and sub \"";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617170438",RemoteObject.createImmutable("Delete Tagcodes From dta_requests and sub "),0);
 BA.debugLineNum = 1323;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("(")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(")"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1324;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
Debug.ShouldStop(2048);
_listastr = (RemoteObject.concat(RemoteObject.createImmutable("("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(")")));Debug.locals.put("ListaStr", _listastr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1326;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1327;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(16384);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1328;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(32768);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1329;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_signatures where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1330;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(131072);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_relations where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1331;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(262144);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_output_actions where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1332;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(524288);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_output where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1333;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(1048576);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_objects where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1334;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(2097152);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_notes where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1335;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(4194304);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_fields where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1336;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(8388608);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_entities where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1337;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_documents where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1338;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_contacts where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1339;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_alerts where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1341;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_adds where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1342;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(536870912);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_relations_adds where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1343;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(1073741824);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_adds where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1344;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images_adds where request_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1346;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1347;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static RemoteObject  _deletelocationsfromlocaldatabasefromstring(RemoteObject _ba,RemoteObject _listastr) throws Exception{
try {
		Debug.PushSubsStack("DeleteLocationsFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1429);
if (RapidSub.canDelegate("deletelocationsfromlocaldatabasefromstring")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletelocationsfromlocaldatabasefromstring", _ba, _listastr);}
ResumableSub_DeleteLocationsFromLocalDatabaseFromString rsub = new ResumableSub_DeleteLocationsFromLocalDatabaseFromString(null,_ba,_listastr);
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
public static class ResumableSub_DeleteLocationsFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteLocationsFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _listastr;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteLocationsFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1429);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1434;BA.debugLine="If Utils.NNE(ListaStr) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_listastr)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1435;BA.debugLine="Log(\"Delete Tagcodes From dta_locations and sub";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617498118",RemoteObject.createImmutable("Delete Tagcodes From dta_locations and sub "),0);
 BA.debugLineNum = 1436;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("(")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(")"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1437;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
Debug.ShouldStop(268435456);
_listastr = (RemoteObject.concat(RemoteObject.createImmutable("("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(")")));Debug.locals.put("ListaStr", _listastr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1440;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_locations where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1443;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1444;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _deleteobjectsfromlocaldatabasefromstring(RemoteObject _ba,RemoteObject _listastr) throws Exception{
try {
		Debug.PushSubsStack("DeleteObjectsFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1389);
if (RapidSub.canDelegate("deleteobjectsfromlocaldatabasefromstring")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deleteobjectsfromlocaldatabasefromstring", _ba, _listastr);}
ResumableSub_DeleteObjectsFromLocalDatabaseFromString rsub = new ResumableSub_DeleteObjectsFromLocalDatabaseFromString(null,_ba,_listastr);
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
public static class ResumableSub_DeleteObjectsFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteObjectsFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _listastr;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteObjectsFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1389);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1394;BA.debugLine="If Utils.NNE(ListaStr) Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_listastr)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1395;BA.debugLine="Log(\"Delete Tagcodes From dta_objects and sub \")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617367046",RemoteObject.createImmutable("Delete Tagcodes From dta_objects and sub "),0);
 BA.debugLineNum = 1396;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("(")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(")"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1397;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
Debug.ShouldStop(1048576);
_listastr = (RemoteObject.concat(RemoteObject.createImmutable("("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(")")));Debug.locals.put("ListaStr", _listastr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1399;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(4194304);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_objects where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1400;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(8388608);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_objects_contacts where object_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1401;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_objects_documents where object_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1402;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_objects_fields where object_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1403;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_objects_images where object_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1404;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_objects_locations where object_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1405;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_objects_warehouses where object_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1406;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(536870912);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_objects_relations where parent_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1408;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1409;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _deletetasksfromlocaldatabasefromstring(RemoteObject _ba,RemoteObject _listastr) throws Exception{
try {
		Debug.PushSubsStack("DeleteTasksFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1349);
if (RapidSub.canDelegate("deletetasksfromlocaldatabasefromstring")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletetasksfromlocaldatabasefromstring", _ba, _listastr);}
ResumableSub_DeleteTasksFromLocalDatabaseFromString rsub = new ResumableSub_DeleteTasksFromLocalDatabaseFromString(null,_ba,_listastr);
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
public static class ResumableSub_DeleteTasksFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteTasksFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _listastr;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteTasksFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1349);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1350;BA.debugLine="If Utils.NNE(ListaStr) Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_listastr)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1351;BA.debugLine="Log(\"Delete Tagcodes From dta_tasks and sub \")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617235970",RemoteObject.createImmutable("Delete Tagcodes From dta_tasks and sub "),0);
 BA.debugLineNum = 1352;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("(")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(")"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1353;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
Debug.ShouldStop(256);
_listastr = (RemoteObject.concat(RemoteObject.createImmutable("("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(")")));Debug.locals.put("ListaStr", _listastr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1355;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(1024);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1356;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(2048);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_adds where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1357;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_documents where task_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1358;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_events where task_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1359;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(16384);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_items where task_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1360;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(32768);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_items_adds where task_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1361;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_items_answers where task_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1362;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(131072);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_items_answers_events where task_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1363;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(262144);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_obsnotes where task_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1364;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(524288);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_tasks_routes where task_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1366;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1367;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _deletetprequestsfromlocaldatabasefromstring(RemoteObject _ba,RemoteObject _listastr) throws Exception{
try {
		Debug.PushSubsStack("DeleteTPRequestsFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1369);
if (RapidSub.canDelegate("deletetprequestsfromlocaldatabasefromstring")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletetprequestsfromlocaldatabasefromstring", _ba, _listastr);}
ResumableSub_DeleteTPRequestsFromLocalDatabaseFromString rsub = new ResumableSub_DeleteTPRequestsFromLocalDatabaseFromString(null,_ba,_listastr);
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
public static class ResumableSub_DeleteTPRequestsFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteTPRequestsFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _listastr;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteTPRequestsFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1369);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1370;BA.debugLine="If Utils.NNE(ListaStr) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_listastr)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1371;BA.debugLine="Log(\"Delete Tagcodes From dta_typerequests and s";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617301506",RemoteObject.createImmutable("Delete Tagcodes From dta_typerequests and sub "),0);
 BA.debugLineNum = 1372;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("(")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(")"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1373;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
Debug.ShouldStop(268435456);
_listastr = (RemoteObject.concat(RemoteObject.createImmutable("("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(")")));Debug.locals.put("ListaStr", _listastr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1375;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(1073741824);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1376;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests_fields where typerequest_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1377;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(1);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests_reports where typerequest_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1378;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(2);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests_routes where typerequest_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1379;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(4);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests_tasks where typerequest_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1380;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(8);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests_tpr where typerequest_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1381;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(16);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests_signature where typerequest_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1382;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(32);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests_adds where typerequest_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1383;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(64);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_typerequests_tasks_adds where typerequest_tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1386;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1387;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static RemoteObject  _deleteuserequipment(RemoteObject _ba,RemoteObject _usertagcode,RemoteObject _equiptagcode) throws Exception{
try {
		Debug.PushSubsStack("deleteUserEquipment (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1970);
if (RapidSub.canDelegate("deleteuserequipment")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deleteuserequipment", _ba, _usertagcode, _equiptagcode);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("userTagcode", _usertagcode);
Debug.locals.put("equipTagcode", _equiptagcode);
 BA.debugLineNum = 1970;BA.debugLine="Sub deleteUserEquipment(userTagcode As String, equ";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1972;BA.debugLine="Dim sqlScript As String = $\"delete from dta_equip";
Debug.ShouldStop(524288);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("delete from dta_equipments_technicals where technical_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usertagcode))),RemoteObject.createImmutable("' and equipment_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_equiptagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 1973;BA.debugLine="Utils.SaveSQLToLog(\"deleteUserEquipment\",sqlScrip";
Debug.ShouldStop(1048576);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("deleteUserEquipment")),(Object)(_sqlscript),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1975;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletewarehousesfromlocaldatabasefromstring(RemoteObject _ba,RemoteObject _listastr) throws Exception{
try {
		Debug.PushSubsStack("DeleteWarehousesFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1446);
if (RapidSub.canDelegate("deletewarehousesfromlocaldatabasefromstring")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","deletewarehousesfromlocaldatabasefromstring", _ba, _listastr);}
ResumableSub_DeleteWarehousesFromLocalDatabaseFromString rsub = new ResumableSub_DeleteWarehousesFromLocalDatabaseFromString(null,_ba,_listastr);
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
public static class ResumableSub_DeleteWarehousesFromLocalDatabaseFromString extends BA.ResumableSub {
public ResumableSub_DeleteWarehousesFromLocalDatabaseFromString(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _listastr) {
this.parent = parent;
this._ba = _ba;
this._listastr = _listastr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _listastr;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteWarehousesFromLocalDatabaseFromString (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1446);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("ListaStr", _listastr);
 BA.debugLineNum = 1451;BA.debugLine="If Utils.NNE(ListaStr) Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_listastr)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1452;BA.debugLine="Log(\"Delete Tagcodes From dta_warehouses and sub";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617563654",RemoteObject.createImmutable("Delete Tagcodes From dta_warehouses and sub "),0);
 BA.debugLineNum = 1453;BA.debugLine="If Not(ListaStr.StartsWith(\"(\")) And Not(ListaSt";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("(")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_listastr.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(")"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1454;BA.debugLine="ListaStr = $\"(${ListaStr})\"$";
Debug.ShouldStop(8192);
_listastr = (RemoteObject.concat(RemoteObject.createImmutable("("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable(")")));Debug.locals.put("ListaStr", _listastr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1457;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from d";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from dta_warehouses where tagcode in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_listastr))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1460;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1461;BA.debugLine="End Sub";
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
public static RemoteObject  _eventrecord2claievent(RemoteObject _ba,RemoteObject _record) throws Exception{
try {
		Debug.PushSubsStack("EventRecord2CLAIEvent (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1125);
if (RapidSub.canDelegate("eventrecord2claievent")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","eventrecord2claievent", _ba, _record);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._claievent");
;
Debug.locals.put("record", _record);
 BA.debugLineNum = 1125;BA.debugLine="Sub EventRecord2CLAIEvent(record As ResultSet) As";
Debug.ShouldStop(16);
 BA.debugLineNum = 1126;BA.debugLine="Dim ret As CLAIEvent = Types.MakeCLAIEvent( recor";
Debug.ShouldStop(32);
_ret = dbstructures.mostCurrent._types.runMethod(false,"_makeclaievent" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("event_tagcode")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("position")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type_item")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("active")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("formula")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("have_formula")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("have_condition")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("have_status")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("is_jump")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("is_status")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("is_alert")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("is_email")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("is_more")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("is_foto")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("is_action")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("inc_object_contacts")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("team_tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("email_to")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("email_cc")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("use_internal_image")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("default_typerequest")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("resobsgrp_tagcode")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("add_entity_email")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("add_object_email")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("request_signature")))));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1152;BA.debugLine="Return ret";
Debug.ShouldStop(-2147483648);
if (true) return _ret;
 BA.debugLineNum = 1153;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getasmodes(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getASModes (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1566);
if (RapidSub.canDelegate("getasmodes")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getasmodes", _ba);}
;
 BA.debugLineNum = 1566;BA.debugLine="Sub getASModes As List";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1567;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_ASMODES)";
Debug.ShouldStop(1073741824);
if (true) return _getitctable(_ba,dbstructures._sql_data_type_asmodes);
 BA.debugLineNum = 1568;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getasstatus(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getASStatus (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1554);
if (RapidSub.canDelegate("getasstatus")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getasstatus", _ba);}
;
 BA.debugLineNum = 1554;BA.debugLine="Sub getASStatus As List";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1555;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_ASSTATUS)";
Debug.ShouldStop(262144);
if (true) return _getitctable(_ba,dbstructures._sql_data_type_asstatus);
 BA.debugLineNum = 1556;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getastypes(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getASTypes (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1570);
if (RapidSub.canDelegate("getastypes")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getastypes", _ba);}
;
 BA.debugLineNum = 1570;BA.debugLine="Sub getASTypes As List";
Debug.ShouldStop(2);
 BA.debugLineNum = 1571;BA.debugLine="If DBUtils.TableExists(Starter.LocalSQLEVC, \"dta_";
Debug.ShouldStop(4);
if (dbstructures.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("dta_actiontypes"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1572;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_ASTYPES)";
Debug.ShouldStop(8);
if (true) return _getitctable(_ba,dbstructures._sql_data_type_astypes);
 }else {
 BA.debugLineNum = 1574;BA.debugLine="Return Utils.MakeNullList";
Debug.ShouldStop(32);
if (true) return dbstructures.mostCurrent._utils.runMethod(false,"_makenulllist" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1576;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getchildrequeststatus(RemoteObject _ba,RemoteObject _request,RemoteObject _action,RemoteObject _counter) throws Exception{
try {
		Debug.PushSubsStack("getChildRequestStatus (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1514);
if (RapidSub.canDelegate("getchildrequeststatus")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getchildrequeststatus", _ba, _request, _action, _counter);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 1514;BA.debugLine="Sub getChildRequestStatus(Request As String, Actio";
Debug.ShouldStop(512);
 BA.debugLineNum = 1515;BA.debugLine="Private Ret As Int = 0";
Debug.ShouldStop(1024);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1516;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(2048);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select status_id from dta_requests_relations where request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("					and relation_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_counter))),RemoteObject.createImmutable(""))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1518;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(8192);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1519;BA.debugLine="Ret = Record.GetInt(\"status_id\")";
Debug.ShouldStop(16384);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1520;BA.debugLine="Exit";
Debug.ShouldStop(32768);
if (true) break;
 }
;
 BA.debugLineNum = 1522;BA.debugLine="Record.Close";
Debug.ShouldStop(131072);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1523;BA.debugLine="Return Ret";
Debug.ShouldStop(262144);
if (true) return _ret;
 BA.debugLineNum = 1524;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getconfigapp(RemoteObject _ba,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("getConfigApp (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1722);
if (RapidSub.canDelegate("getconfigapp")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getconfigapp", _ba, _token);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _c1 = RemoteObject.createImmutable(0);
RemoteObject _c2 = RemoteObject.createImmutable(0);
;
Debug.locals.put("Token", _token);
 BA.debugLineNum = 1722;BA.debugLine="Sub getConfigApp(Token As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1723;BA.debugLine="If (Utils.isNullOrEmpty(Token)) Then";
Debug.ShouldStop(67108864);
if ((dbstructures.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,_ba,(Object)(_token))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1724;BA.debugLine="Token = \"DEFAULT_\"";
Debug.ShouldStop(134217728);
_token = BA.ObjectToString("DEFAULT_");Debug.locals.put("Token", _token);
 };
 BA.debugLineNum = 1726;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
Debug.ShouldStop(536870912);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select * from config_appl where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_token))),RemoteObject.createImmutable("'"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1727;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(1073741824);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1728;BA.debugLine="Dim c1 As Int = Record.GetInt(\"colormain\")";
Debug.ShouldStop(-2147483648);
_c1 = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("colormain")));Debug.locals.put("c1", _c1);Debug.locals.put("c1", _c1);
 BA.debugLineNum = 1729;BA.debugLine="Dim c2 As Int = Record.GetInt(\"colorsub\")";
Debug.ShouldStop(1);
_c2 = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("colorsub")));Debug.locals.put("c2", _c2);Debug.locals.put("c2", _c2);
 BA.debugLineNum = 1730;BA.debugLine="If (c1 > 0) Then Consts.ColorMain = c1";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean(">",_c1,BA.numberCast(double.class, 0)))) { 
dbstructures.mostCurrent._consts._colormain /*RemoteObject*/  = _c1;};
 BA.debugLineNum = 1731;BA.debugLine="If (c2 > 0) Then Consts.ColorSub = c2";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean(">",_c2,BA.numberCast(double.class, 0)))) { 
dbstructures.mostCurrent._consts._colorsub /*RemoteObject*/  = _c2;};
 BA.debugLineNum = 1732;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 }
;
 BA.debugLineNum = 1734;BA.debugLine="Record.Close";
Debug.ShouldStop(32);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1735;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getconfigvaluesexists(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getConfigValuesExists (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1710);
if (RapidSub.canDelegate("getconfigvaluesexists")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getconfigvaluesexists", _ba);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _exists = RemoteObject.createImmutable(false);
;
 BA.debugLineNum = 1710;BA.debugLine="Sub getConfigValuesExists As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1711;BA.debugLine="Private Ret As Int = 0";
Debug.ShouldStop(16384);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1712;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
Debug.ShouldStop(32768);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(dbstructures._sql_getconfig_data)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1713;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(65536);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1714;BA.debugLine="Ret = Ret + 1";
Debug.ShouldStop(131072);
_ret = RemoteObject.solve(new RemoteObject[] {_ret,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1715;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 }
;
 BA.debugLineNum = 1717;BA.debugLine="Record.Close";
Debug.ShouldStop(1048576);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1718;BA.debugLine="Dim exists As Boolean = Ret > 0";
Debug.ShouldStop(2097152);
_exists = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_ret,BA.numberCast(double.class, 0)));Debug.locals.put("exists", _exists);Debug.locals.put("exists", _exists);
 BA.debugLineNum = 1719;BA.debugLine="Return exists";
Debug.ShouldStop(4194304);
if (true) return _exists;
 BA.debugLineNum = 1720;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcountof(RemoteObject _ba,RemoteObject _table,RemoteObject _condition) throws Exception{
try {
		Debug.PushSubsStack("GetCountOf (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2072);
if (RapidSub.canDelegate("getcountof")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getcountof", _ba, _table, _condition);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Table", _table);
Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 2072;BA.debugLine="Sub GetCountOf(Table As String, Condition As Strin";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2073;BA.debugLine="Dim Ret As Int = 0";
Debug.ShouldStop(16777216);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2074;BA.debugLine="Dim SQL As String = $\"select count(0) as Total fr";
Debug.ShouldStop(33554432);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select count(0) as Total from "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(" where 1=1 "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_condition))),RemoteObject.createImmutable("")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 2076;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
Debug.ShouldStop(134217728);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2077;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(268435456);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2078;BA.debugLine="Ret = Record.GetInt(\"Total\")";
Debug.ShouldStop(536870912);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Total")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2079;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 }
;
 BA.debugLineNum = 2081;BA.debugLine="Record.Close";
Debug.ShouldStop(1);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2082;BA.debugLine="Return Ret";
Debug.ShouldStop(2);
if (true) return _ret;
 BA.debugLineNum = 2083;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcountofevc(RemoteObject _ba,RemoteObject _table,RemoteObject _condition) throws Exception{
try {
		Debug.PushSubsStack("GetCountOfEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2085);
if (RapidSub.canDelegate("getcountofevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getcountofevc", _ba, _table, _condition);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Table", _table);
Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 2085;BA.debugLine="Sub GetCountOfEVC(Table As String, Condition As St";
Debug.ShouldStop(16);
 BA.debugLineNum = 2086;BA.debugLine="Dim Ret As Int = 0";
Debug.ShouldStop(32);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2087;BA.debugLine="Dim SQL As String = $\"select count(0) as Total fr";
Debug.ShouldStop(64);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select count(0) as Total from "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(" where 1=1 "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_condition))),RemoteObject.createImmutable("")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 2088;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(128);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2089;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(256);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2090;BA.debugLine="Ret = Record.GetInt(\"Total\")";
Debug.ShouldStop(512);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Total")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2091;BA.debugLine="Exit";
Debug.ShouldStop(1024);
if (true) break;
 }
;
 BA.debugLineNum = 2093;BA.debugLine="Record.Close";
Debug.ShouldStop(4096);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2094;BA.debugLine="Return Ret";
Debug.ShouldStop(8192);
if (true) return _ret;
 BA.debugLineNum = 2095;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentconfigvalues(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getCurrentConfigValues (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1689);
if (RapidSub.canDelegate("getcurrentconfigvalues")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getcurrentconfigvalues", _ba);}
ResumableSub_getCurrentConfigValues rsub = new ResumableSub_getCurrentConfigValues(null,_ba);
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
public static class ResumableSub_getCurrentConfigValues extends BA.ResumableSub {
public ResumableSub_getCurrentConfigValues(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba) {
this.parent = parent;
this._ba = _ba;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _apis = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getCurrentConfigValues (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1689);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 1691;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
Debug.ShouldStop(67108864);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(parent._sql_getconfig_data)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1692;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//do while
this.state = 4;
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 1693;BA.debugLine="ShareCode.APP_Instance = Utils.IfNullOrEmpty(Rec";
Debug.ShouldStop(268435456);
parent.mostCurrent._sharecode._app_instance /*RemoteObject*/  = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("instance")))),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1694;BA.debugLine="ShareCode.APP_Authorization = Utils.IfNullOrEmpt";
Debug.ShouldStop(536870912);
parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/  = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("authorization")))),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1697;BA.debugLine="Dim APIs As String = Utils.IfNullOrEmpty(Record.";
Debug.ShouldStop(1);
_apis = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("api")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("APIs", _apis);Debug.locals.put("APIs", _apis);
 BA.debugLineNum = 1699;BA.debugLine="ShareCode.APP_DOMAIN = Utils.IfNullOrEmpty(Recor";
Debug.ShouldStop(4);
parent.mostCurrent._sharecode._app_domain /*RemoteObject*/  = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("subdomain")))),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1700;BA.debugLine="ShareCode.APPL_CONFIRMED = Record.GetInt(\"confir";
Debug.ShouldStop(8);
parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/  = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("confirmed")));
 BA.debugLineNum = 1701;BA.debugLine="ShareCode.APP_TOKEN = Utils.IfNullOrEmpty(Record";
Debug.ShouldStop(16);
parent.mostCurrent._sharecode._app_token /*RemoteObject*/  = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("token")))),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1703;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.APP_";
Debug.ShouldStop(64);
parent.mostCurrent._sharecode._app_url /*RemoteObject*/  = RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("."),_apis);
 BA.debugLineNum = 1704;BA.debugLine="Exit";
Debug.ShouldStop(128);
this.state = 4;
if (true) break;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1706;BA.debugLine="Record.Close";
Debug.ShouldStop(512);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1707;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1708;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static RemoteObject  _getdbobjecttypeevc(RemoteObject _ba,RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("getDBObjectTypeEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1742);
if (RapidSub.canDelegate("getdbobjecttypeevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getdbobjecttypeevc", _ba, _tagcode);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objecttype");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 1742;BA.debugLine="Sub getDBObjectTypeEVC(Tagcode As String) As Objec";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1743;BA.debugLine="Dim ret As ObjectType = Types.MakeObjectType(\"\",";
Debug.ShouldStop(16384);
_ret = dbstructures.mostCurrent._types.runMethod(false,"_makeobjecttype" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1744;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(32768);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select distinct * from dta_objecttypes\n"),RemoteObject.createImmutable("									where tagcode IN (SELECT DISTINCT object_type FROM dta_objects WHERE tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1746;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(131072);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1747;BA.debugLine="ret = Types.MakeObjectType(Record.GetString(\"tag";
Debug.ShouldStop(262144);
_ret = dbstructures.mostCurrent._types.runMethod(false,"_makeobjecttype" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(BA.ObjectToString("GREEN")),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("have_contracts")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("have_warehouses")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("have_documents")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("isgroup")))),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("documents_template")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1756;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 }
;
 BA.debugLineNum = 1758;BA.debugLine="Record.Close";
Debug.ShouldStop(536870912);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1759;BA.debugLine="Return ret";
Debug.ShouldStop(1073741824);
if (true) return _ret;
 BA.debugLineNum = 1760;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getevcidfrom(RemoteObject _ba,RemoteObject _table,RemoteObject _field,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetEVCIDFrom (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1879);
if (RapidSub.canDelegate("getevcidfrom")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getevcidfrom", _ba, _table, _field, _value);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ret = RemoteObject.createImmutable(0);
;
Debug.locals.put("table", _table);
Debug.locals.put("field", _field);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1879;BA.debugLine="Sub GetEVCIDFrom(table As String, field As String,";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1880;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(8388608);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select id from "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(" where "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field))),RemoteObject.createImmutable("='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("'"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1881;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(16777216);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1882;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(33554432);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1883;BA.debugLine="ret = Record.GetInt(\"id\")";
Debug.ShouldStop(67108864);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1884;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 }
;
 BA.debugLineNum = 1886;BA.debugLine="Record.Close";
Debug.ShouldStop(536870912);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1887;BA.debugLine="Return ret";
Debug.ShouldStop(1073741824);
if (true) return _ret;
 BA.debugLineNum = 1888;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getidfrom(RemoteObject _ba,RemoteObject _table,RemoteObject _field,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetIDFrom (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1890);
if (RapidSub.canDelegate("getidfrom")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getidfrom", _ba, _table, _field, _value);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ret = RemoteObject.createImmutable(0);
;
Debug.locals.put("table", _table);
Debug.locals.put("field", _field);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1890;BA.debugLine="Sub GetIDFrom(table As String, field As String, va";
Debug.ShouldStop(2);
 BA.debugLineNum = 1891;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
Debug.ShouldStop(4);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select id from "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(" where "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field))),RemoteObject.createImmutable("='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("'"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1892;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(8);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1893;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(16);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1894;BA.debugLine="ret = Record.GetInt(\"id\")";
Debug.ShouldStop(32);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1895;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 }
;
 BA.debugLineNum = 1897;BA.debugLine="Record.Close";
Debug.ShouldStop(256);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1898;BA.debugLine="Return ret";
Debug.ShouldStop(512);
if (true) return _ret;
 BA.debugLineNum = 1899;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitctable(RemoteObject _ba,RemoteObject _dbscript) throws Exception{
try {
		Debug.PushSubsStack("getITCTable (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1526);
if (RapidSub.canDelegate("getitctable")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getitctable", _ba, _dbscript);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("DBScript", _dbscript);
 BA.debugLineNum = 1526;BA.debugLine="Sub getITCTable(DBScript As String) As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1527;BA.debugLine="Private Ret As List : Ret.Initialize";
Debug.ShouldStop(4194304);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1527;BA.debugLine="Private Ret As List : Ret.Initialize";
Debug.ShouldStop(4194304);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1528;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(8388608);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dbscript))),RemoteObject.createImmutable(""))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1529;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(16777216);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1530;BA.debugLine="Ret.Add( Types.MakeDB_ITC(Record.GetInt(\"id\"), R";
Debug.ShouldStop(33554432);
_ret.runVoidMethod ("Add",(Object)((dbstructures.mostCurrent._types.runMethod(false,"_makedb_itc" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagdesc")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("color"))))))));
 }
;
 BA.debugLineNum = 1533;BA.debugLine="Record.Close";
Debug.ShouldStop(268435456);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1534;BA.debugLine="Return Ret";
Debug.ShouldStop(536870912);
if (true) return _ret;
 BA.debugLineNum = 1535;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitctablepos(RemoteObject _ba,RemoteObject _dbscript,RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("getITCTablePos (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1537);
if (RapidSub.canDelegate("getitctablepos")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getitctablepos", _ba, _dbscript, _tagcode);}
RemoteObject _n = RemoteObject.createImmutable(0);
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ntag = RemoteObject.createImmutable("");
;
Debug.locals.put("DBScript", _dbscript);
Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 1537;BA.debugLine="Sub getITCTablePos(DBScript As String, Tagcode As";
Debug.ShouldStop(1);
 BA.debugLineNum = 1538;BA.debugLine="Private n As Int = 0, Ret As Int = 0";
Debug.ShouldStop(2);
_n = BA.numberCast(int.class, 0);Debug.locals.put("n", _n);Debug.locals.put("n", _n);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1539;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(4);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dbscript))),RemoteObject.createImmutable(""))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1540;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(8);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1541;BA.debugLine="Dim nTag As String = Utils.IfNullOrEmpty(Record.";
Debug.ShouldStop(16);
_ntag = dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("nTag", _ntag);Debug.locals.put("nTag", _ntag);
 BA.debugLineNum = 1542;BA.debugLine="If (Utils.NNE(nTag)) Then";
Debug.ShouldStop(32);
if ((dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_ntag))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1543;BA.debugLine="If (nTag = Tagcode) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",_ntag,_tagcode))) { 
 BA.debugLineNum = 1544;BA.debugLine="Ret = n+1";
Debug.ShouldStop(128);
_ret = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1545;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 };
 };
 BA.debugLineNum = 1548;BA.debugLine="n = n + 1";
Debug.ShouldStop(2048);
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("n", _n);
 }
;
 BA.debugLineNum = 1550;BA.debugLine="Record.Close";
Debug.ShouldStop(8192);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1551;BA.debugLine="Return Ret";
Debug.ShouldStop(16384);
if (true) return _ret;
 BA.debugLineNum = 1552;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistofaddressetypesevc(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetListOfAddresseTypesEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1806);
if (RapidSub.canDelegate("getlistofaddressetypesevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistofaddressetypesevc", _ba);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
 BA.debugLineNum = 1806;BA.debugLine="Sub GetListOfAddresseTypesEVC As List";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1807;BA.debugLine="Dim Ret As List";
Debug.ShouldStop(16384);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1808;BA.debugLine="Ret.Initialize";
Debug.ShouldStop(32768);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1809;BA.debugLine="Ret.Add(\"Geral\")";
Debug.ShouldStop(65536);
_ret.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Geral"))));
 BA.debugLineNum = 1810;BA.debugLine="Return Ret";
Debug.ShouldStop(131072);
if (true) return _ret;
 BA.debugLineNum = 1811;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistofcontacttypesevc(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetListOfContactTypesEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1796);
if (RapidSub.canDelegate("getlistofcontacttypesevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistofcontacttypesevc", _ba);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
 BA.debugLineNum = 1796;BA.debugLine="Sub GetListOfContactTypesEVC As List";
Debug.ShouldStop(8);
 BA.debugLineNum = 1797;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(16);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1797;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(16);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1798;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(32);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(dbstructures._evc_sql_current_contact_types)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1799;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(64);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1800;BA.debugLine="Ret.Add(Record.GetString(\"tagdesc\"))";
Debug.ShouldStop(128);
_ret.runVoidMethod ("Add",(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagdesc"))))));
 }
;
 BA.debugLineNum = 1802;BA.debugLine="Record.Close";
Debug.ShouldStop(512);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1803;BA.debugLine="Return Ret";
Debug.ShouldStop(1024);
if (true) return _ret;
 BA.debugLineNum = 1804;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistofdayperiodtypesevc(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetListOfDayPeriodTypesEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1762);
if (RapidSub.canDelegate("getlistofdayperiodtypesevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistofdayperiodtypesevc", _ba);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
 BA.debugLineNum = 1762;BA.debugLine="Sub GetListOfDayPeriodTypesEVC As List  '";
Debug.ShouldStop(2);
 BA.debugLineNum = 1763;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(4);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1763;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(4);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1764;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(8);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(dbstructures._evc_sql_dayperiod_type)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1765;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(16);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1766;BA.debugLine="Ret.Add(Record.GetString(\"tagdesc\"))";
Debug.ShouldStop(32);
_ret.runVoidMethod ("Add",(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagdesc"))))));
 }
;
 BA.debugLineNum = 1768;BA.debugLine="Record.Close";
Debug.ShouldStop(128);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1769;BA.debugLine="Return Ret";
Debug.ShouldStop(256);
if (true) return _ret;
 BA.debugLineNum = 1770;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistoffromevc(RemoteObject _ba,RemoteObject _fromtable,RemoteObject _field) throws Exception{
try {
		Debug.PushSubsStack("GetListOfFromEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1869);
if (RapidSub.canDelegate("getlistoffromevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistoffromevc", _ba, _fromtable, _field);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("fromtable", _fromtable);
Debug.locals.put("field", _field);
 BA.debugLineNum = 1869;BA.debugLine="Sub GetListOfFromEVC(fromtable As String, field As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1870;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(8192);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1870;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(8192);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1871;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(16384);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field))),RemoteObject.createImmutable(" from "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fromtable))),RemoteObject.createImmutable(""))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1872;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(32768);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1873;BA.debugLine="Ret.Add(Record.GetString(field))";
Debug.ShouldStop(65536);
_ret.runVoidMethod ("Add",(Object)((_record.runMethod(true,"GetString",(Object)(_field)))));
 }
;
 BA.debugLineNum = 1875;BA.debugLine="Record.Close";
Debug.ShouldStop(262144);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1876;BA.debugLine="Return Ret";
Debug.ShouldStop(524288);
if (true) return _ret;
 BA.debugLineNum = 1877;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistoffromscript(RemoteObject _ba,RemoteObject _field,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("GetListOfFromScript (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1823);
if (RapidSub.canDelegate("getlistoffromscript")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistoffromscript", _ba, _field, _script);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("field", _field);
Debug.locals.put("script", _script);
 BA.debugLineNum = 1823;BA.debugLine="Sub GetListOfFromScript(field As String, script As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1824;BA.debugLine="Dim Ret As List";
Debug.ShouldStop(-2147483648);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1825;BA.debugLine="Ret.Initialize";
Debug.ShouldStop(1);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1826;BA.debugLine="Private Row As Int = 0";
Debug.ShouldStop(2);
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 1827;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(4);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1828;BA.debugLine="If Not(Utils.isNull(script)) Then";
Debug.ShouldStop(8);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._utils.runMethod(true,"_isnull" /*RemoteObject*/ ,_ba,(Object)(_script)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1831;BA.debugLine="Record = Starter.LocalSQL.ExecQuery(script)";
Debug.ShouldStop(64);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));
 BA.debugLineNum = 1832;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1833;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(256);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && _row.<Integer>get().intValue() <= limit8) || (step8 < 0 && _row.<Integer>get().intValue() >= limit8) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1834;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(512);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 1835;BA.debugLine="Ret.Add(Record.GetString(field))";
Debug.ShouldStop(1024);
_ret.runVoidMethod ("Add",(Object)((_record.runMethod(true,"GetString",(Object)(_field)))));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 1838;BA.debugLine="Record.Close";
Debug.ShouldStop(8192);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 1840;BA.debugLine="Return Ret";
Debug.ShouldStop(32768);
if (true) return _ret;
 BA.debugLineNum = 1841;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistoffromscriptcnlevc(RemoteObject _ba,RemoteObject _fieldcode,RemoteObject _fieldname,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("GetListOfFromScriptCNLEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1855);
if (RapidSub.canDelegate("getlistoffromscriptcnlevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistoffromscriptcnlevc", _ba, _fieldcode, _fieldname, _script);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _cnl = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._codenamelist");
;
Debug.locals.put("fieldCode", _fieldcode);
Debug.locals.put("fieldName", _fieldname);
Debug.locals.put("script", _script);
 BA.debugLineNum = 1855;BA.debugLine="Sub GetListOfFromScriptCNLEVC(fieldCode As String,";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1856;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(-2147483648);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1856;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(-2147483648);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1857;BA.debugLine="If Not(Utils.isNull(script)) Then";
Debug.ShouldStop(1);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._utils.runMethod(true,"_isnull" /*RemoteObject*/ ,_ba,(Object)(_script)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1858;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEV";
Debug.ShouldStop(2);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1859;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(4);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1860;BA.debugLine="Dim CNL As CodeNameList = Types.MakeCodeNameLis";
Debug.ShouldStop(8);
_cnl = dbstructures.mostCurrent._types.runMethod(false,"_makecodenamelist" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(_fieldcode))),(Object)(_record.runMethod(true,"GetString",(Object)(_fieldname))));Debug.locals.put("CNL", _cnl);Debug.locals.put("CNL", _cnl);
 BA.debugLineNum = 1861;BA.debugLine="Ret.Add(CNL)";
Debug.ShouldStop(16);
_ret.runVoidMethod ("Add",(Object)((_cnl)));
 }
;
 BA.debugLineNum = 1863;BA.debugLine="Record.Close";
Debug.ShouldStop(64);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 1865;BA.debugLine="Return Ret";
Debug.ShouldStop(256);
if (true) return _ret;
 BA.debugLineNum = 1866;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistoffromscriptevc(RemoteObject _ba,RemoteObject _field,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("GetListOfFromScriptEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1843);
if (RapidSub.canDelegate("getlistoffromscriptevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistoffromscriptevc", _ba, _field, _script);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("field", _field);
Debug.locals.put("script", _script);
 BA.debugLineNum = 1843;BA.debugLine="Sub GetListOfFromScriptEVC(field As String, script";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1844;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(524288);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1844;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(524288);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1845;BA.debugLine="If Not(Utils.isNull(script)) Then";
Debug.ShouldStop(1048576);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._utils.runMethod(true,"_isnull" /*RemoteObject*/ ,_ba,(Object)(_script)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1846;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEV";
Debug.ShouldStop(2097152);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1847;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(4194304);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1848;BA.debugLine="Ret.Add(Record.GetString(field))";
Debug.ShouldStop(8388608);
_ret.runVoidMethod ("Add",(Object)((_record.runMethod(true,"GetString",(Object)(_field)))));
 }
;
 BA.debugLineNum = 1850;BA.debugLine="Record.Close";
Debug.ShouldStop(33554432);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 1852;BA.debugLine="Return Ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 1853;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistoflocalevc(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetListOfLocalEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1813);
if (RapidSub.canDelegate("getlistoflocalevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistoflocalevc", _ba);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
 BA.debugLineNum = 1813;BA.debugLine="Sub GetListOfLocalEVC As List";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1814;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(2097152);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1814;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(2097152);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1815;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(4194304);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(dbstructures._evc_sql_current_objects_local)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1816;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(8388608);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1817;BA.debugLine="Ret.Add(Record.GetString(\"city\"))";
Debug.ShouldStop(16777216);
_ret.runVoidMethod ("Add",(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("city"))))));
 }
;
 BA.debugLineNum = 1819;BA.debugLine="Record.Close";
Debug.ShouldStop(67108864);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1820;BA.debugLine="Return Ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 1821;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistofobjectstypesevc(RemoteObject _ba,RemoteObject _incall) throws Exception{
try {
		Debug.PushSubsStack("GetListOfObjectsTypesEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1782);
if (RapidSub.canDelegate("getlistofobjectstypesevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistofobjectstypesevc", _ba, _incall);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("incAll", _incall);
 BA.debugLineNum = 1782;BA.debugLine="Sub GetListOfObjectsTypesEVC(incAll As Boolean) As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1783;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(4194304);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1783;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(4194304);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1784;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(8388608);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(dbstructures._evc_sql_current_objects_type)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1785;BA.debugLine="If (incAll) Then";
Debug.ShouldStop(16777216);
if ((_incall).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1786;BA.debugLine="Ret.Add(Types.MakeObjectTypes(0, \"\",\"(Todos)\"))";
Debug.ShouldStop(33554432);
_ret.runVoidMethod ("Add",(Object)((dbstructures.mostCurrent._types.runMethod(false,"_makeobjecttypes" /*RemoteObject*/ ,_ba,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("(Todos)"))))));
 };
 BA.debugLineNum = 1789;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(268435456);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1790;BA.debugLine="Ret.Add(Types.MakeObjectTypes(Record.GetInt(\"id\"";
Debug.ShouldStop(536870912);
_ret.runVoidMethod ("Add",(Object)((dbstructures.mostCurrent._types.runMethod(false,"_makeobjecttypes" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title"))))))));
 }
;
 BA.debugLineNum = 1792;BA.debugLine="Record.Close";
Debug.ShouldStop(-2147483648);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1793;BA.debugLine="Return Ret";
Debug.ShouldStop(1);
if (true) return _ret;
 BA.debugLineNum = 1794;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistofperiodicitytypesevc(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetListOfPeriodicityTypesEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1772);
if (RapidSub.canDelegate("getlistofperiodicitytypesevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getlistofperiodicitytypesevc", _ba);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
 BA.debugLineNum = 1772;BA.debugLine="Sub GetListOfPeriodicityTypesEVC As List";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1773;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(4096);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1773;BA.debugLine="Dim Ret As List : Ret.Initialize";
Debug.ShouldStop(4096);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1774;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(8192);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(dbstructures._evc_sql_periodicity_type)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1775;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(16384);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1776;BA.debugLine="Ret.Add(Record.GetString(\"tagdesc\"))";
Debug.ShouldStop(32768);
_ret.runVoidMethod ("Add",(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagdesc"))))));
 }
;
 BA.debugLineNum = 1778;BA.debugLine="Record.Close";
Debug.ShouldStop(131072);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1779;BA.debugLine="Return Ret";
Debug.ShouldStop(262144);
if (true) return _ret;
 BA.debugLineNum = 1780;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmainrequeststatus(RemoteObject _ba,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("getMainRequestStatus (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1503);
if (RapidSub.canDelegate("getmainrequeststatus")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getmainrequeststatus", _ba, _request);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Request", _request);
 BA.debugLineNum = 1503;BA.debugLine="Sub getMainRequestStatus(Request As String) As Int";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1504;BA.debugLine="Private Ret As Int = 0";
Debug.ShouldStop(-2147483648);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1505;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(1);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select status_id from dta_requests where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request))),RemoteObject.createImmutable("'"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1506;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(2);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1507;BA.debugLine="Ret = Record.GetInt(\"status_id\")";
Debug.ShouldStop(4);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1508;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 }
;
 BA.debugLineNum = 1510;BA.debugLine="Record.Close";
Debug.ShouldStop(32);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1511;BA.debugLine="Return Ret";
Debug.ShouldStop(64);
if (true) return _ret;
 BA.debugLineNum = 1512;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaxofevc(RemoteObject _ba,RemoteObject _table,RemoteObject _field,RemoteObject _condition) throws Exception{
try {
		Debug.PushSubsStack("GetMaxOfEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2097);
if (RapidSub.canDelegate("getmaxofevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getmaxofevc", _ba, _table, _field, _condition);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Table", _table);
Debug.locals.put("field", _field);
Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 2097;BA.debugLine="Sub GetMaxOfEVC(Table As String, field As String,";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2098;BA.debugLine="Dim Ret As Int = 0";
Debug.ShouldStop(131072);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2099;BA.debugLine="Dim SQL As String = $\"select max(${field}) as Max";
Debug.ShouldStop(262144);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select max("),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field))),RemoteObject.createImmutable(") as Maxi from "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(" where 1=1 "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_condition))),RemoteObject.createImmutable("")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 2100;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(524288);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2101;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(1048576);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2102;BA.debugLine="Ret = Record.GetInt(\"Maxi\")";
Debug.ShouldStop(2097152);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Maxi")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2103;BA.debugLine="Exit";
Debug.ShouldStop(4194304);
if (true) break;
 }
;
 BA.debugLineNum = 2105;BA.debugLine="Record.Close";
Debug.ShouldStop(16777216);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2106;BA.debugLine="Return Ret";
Debug.ShouldStop(33554432);
if (true) return _ret;
 BA.debugLineNum = 2107;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnotifyuserstock(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getNotifyUserStock (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1901);
if (RapidSub.canDelegate("getnotifyuserstock")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getnotifyuserstock", _ba);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ret = RemoteObject.createImmutable(0);
;
 BA.debugLineNum = 1901;BA.debugLine="Sub getNotifyUserStock As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1902;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
Debug.ShouldStop(8192);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select * from warehouses_items where qtd=0 and warehouse='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent._sharecode._sess_warehouse /*RemoteObject*/ ))),RemoteObject.createImmutable("'"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1903;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(16384);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1904;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(32768);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1905;BA.debugLine="ret = ret + 1";
Debug.ShouldStop(65536);
_ret = RemoteObject.solve(new RemoteObject[] {_ret,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ret", _ret);
 }
;
 BA.debugLineNum = 1907;BA.debugLine="Record.Close";
Debug.ShouldStop(262144);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1908;BA.debugLine="Return ret";
Debug.ShouldStop(524288);
if (true) return _ret;
 BA.debugLineNum = 1909;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobjectgroups(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getObjectGroups (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2568);
if (RapidSub.canDelegate("getobjectgroups")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getobjectgroups", _ba);}
;
 BA.debugLineNum = 2568;BA.debugLine="Sub getObjectGroups As List";
Debug.ShouldStop(128);
 BA.debugLineNum = 2569;BA.debugLine="Return getITCTable(SQL_DATA_OBJECT_GROUP)";
Debug.ShouldStop(256);
if (true) return _getitctable(_ba,dbstructures._sql_data_object_group);
 BA.debugLineNum = 2570;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobjecttypes(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getObjectTypes (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2572);
if (RapidSub.canDelegate("getobjecttypes")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getobjecttypes", _ba);}
;
 BA.debugLineNum = 2572;BA.debugLine="Sub getObjectTypes As List";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2573;BA.debugLine="Return getITCTable(SQL_DATA_OBJECT_TYPE)";
Debug.ShouldStop(4096);
if (true) return _getitctable(_ba,dbstructures._sql_data_object_type);
 BA.debugLineNum = 2574;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparamstate(RemoteObject _ba,RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("getParamState (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1480);
if (RapidSub.canDelegate("getparamstate")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getparamstate", _ba, _tagcode);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 1480;BA.debugLine="Sub getParamState(Tagcode As String) As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 1481;BA.debugLine="Private Ret As Int = 0";
Debug.ShouldStop(256);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1482;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(512);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select value_state from dta_device_params where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1483;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(1024);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1484;BA.debugLine="Ret = Record.GetInt(\"value_state\")";
Debug.ShouldStop(2048);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("value_state")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1485;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 }
;
 BA.debugLineNum = 1487;BA.debugLine="Record.Close";
Debug.ShouldStop(16384);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1488;BA.debugLine="Return Ret";
Debug.ShouldStop(32768);
if (true) return _ret;
 BA.debugLineNum = 1489;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparamstatefield(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _column) throws Exception{
try {
		Debug.PushSubsStack("getParamStateField (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1491);
if (RapidSub.canDelegate("getparamstatefield")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getparamstatefield", _ba, _tagcode, _column);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("Column", _column);
 BA.debugLineNum = 1491;BA.debugLine="Sub getParamStateField(Tagcode As String, Column A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1492;BA.debugLine="Private Ret As String = \"\"";
Debug.ShouldStop(524288);
_ret = BA.ObjectToString("");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1493;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(1048576);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_column))),RemoteObject.createImmutable(" from dta_device_params where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1494;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(2097152);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1495;BA.debugLine="Ret = Record.GetString(Column)";
Debug.ShouldStop(4194304);
_ret = _record.runMethod(true,"GetString",(Object)(_column));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1496;BA.debugLine="Exit";
Debug.ShouldStop(8388608);
if (true) break;
 }
;
 BA.debugLineNum = 1498;BA.debugLine="Record.Close";
Debug.ShouldStop(33554432);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1499;BA.debugLine="Return Ret";
Debug.ShouldStop(67108864);
if (true) return _ret;
 BA.debugLineNum = 1500;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpriority(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getPriority (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1558);
if (RapidSub.canDelegate("getpriority")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getpriority", _ba);}
;
 BA.debugLineNum = 1558;BA.debugLine="Sub getPriority As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1559;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_PRIORITY)";
Debug.ShouldStop(4194304);
if (true) return _getitctable(_ba,dbstructures._sql_data_type_priority);
 BA.debugLineNum = 1560;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrequestinfo(RemoteObject _ba,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("getRequestInfo (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,980);
if (RapidSub.canDelegate("getrequestinfo")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getrequestinfo", _ba, _request);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestinfo");
RemoteObject _rows = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("request", _request);
 BA.debugLineNum = 980;BA.debugLine="Sub getRequestInfo(request As String) As RequestIn";
Debug.ShouldStop(524288);
 BA.debugLineNum = 981;BA.debugLine="Dim ret As RequestInfo : ret.Initialize";
Debug.ShouldStop(1048576);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestinfo");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 981;BA.debugLine="Dim ret As RequestInfo : ret.Initialize";
Debug.ShouldStop(1048576);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 982;BA.debugLine="Dim Rows As Int = 0";
Debug.ShouldStop(2097152);
_rows = BA.numberCast(int.class, 0);Debug.locals.put("Rows", _rows);Debug.locals.put("Rows", _rows);
 BA.debugLineNum = 983;BA.debugLine="Dim sSQL As String = $\"select entity_tagcode, obj";
Debug.ShouldStop(4194304);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select entity_tagcode, object_tagcode, typerequest_tagcode, technical_tagcode, \n"),RemoteObject.createImmutable("						team_tagcode, vehicle_tagcode, notes, route_tagcode, reference, details\n"),RemoteObject.createImmutable("						from dta_requests \n"),RemoteObject.createImmutable("						where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 987;BA.debugLine="Dim record As ResultSet = Starter.LocalSQLEVC.Exe";
Debug.ShouldStop(67108864);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("record", _record);
 BA.debugLineNum = 988;BA.debugLine="Do While record.NextRow";
Debug.ShouldStop(134217728);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 989;BA.debugLine="ret = Types.MakeRequestInfo(request, record.GetS";
Debug.ShouldStop(268435456);
_ret = dbstructures.mostCurrent._types.runMethod(false,"_makerequestinfo" /*RemoteObject*/ ,_ba,(Object)(_request),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("entity_tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("object_tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("typerequest_tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("technical_tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("team_tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("vehicle_tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("notes")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("route_tagcode")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reference")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")))));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 993;BA.debugLine="Rows = Rows + 1";
Debug.ShouldStop(1);
_rows = RemoteObject.solve(new RemoteObject[] {_rows,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Rows", _rows);
 }
;
 BA.debugLineNum = 995;BA.debugLine="If Rows = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_rows,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 996;BA.debugLine="ret = Types.MakeRequestInfoClear";
Debug.ShouldStop(8);
_ret = dbstructures.mostCurrent._types.runMethod(false,"_makerequestinfoclear" /*RemoteObject*/ ,_ba);Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 998;BA.debugLine="record.Close";
Debug.ShouldStop(32);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 999;BA.debugLine="Return ret";
Debug.ShouldStop(64);
if (true) return _ret;
 BA.debugLineNum = 1000;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrequestvaluesvaluefrom(RemoteObject _ba,RemoteObject _request,RemoteObject _action,RemoteObject _task,RemoteObject _item,RemoteObject _uniquekey,RemoteObject _field) throws Exception{
try {
		Debug.PushSubsStack("getRequestValuesValueFrom (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,961);
if (RapidSub.canDelegate("getrequestvaluesvaluefrom")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getrequestvaluesvaluefrom", _ba, _request, _action, _task, _item, _uniquekey, _field);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("request", _request);
Debug.locals.put("action", _action);
Debug.locals.put("task", _task);
Debug.locals.put("item", _item);
Debug.locals.put("uniquekey", _uniquekey);
Debug.locals.put("field", _field);
 BA.debugLineNum = 961;BA.debugLine="Sub getRequestValuesValueFrom(request As String, a";
Debug.ShouldStop(1);
 BA.debugLineNum = 962;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(2);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 963;BA.debugLine="Dim sSQL As String = $\"${EVC_SQL_GETREQUESTTASK_I";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures._evc_sql_getrequesttask_itemvalue))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and a.request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and a.inner_request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and a.task_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and a.item_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and a.unique_key='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uniquekey))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and a.execute_status=1\n"),RemoteObject.createImmutable("				and a.execute_value<>''")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 971;BA.debugLine="Dim record As ResultSet = Starter.LocalSQLEVC.Exe";
Debug.ShouldStop(1024);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("record", _record);
 BA.debugLineNum = 972;BA.debugLine="Do While record.NextRow";
Debug.ShouldStop(2048);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 973;BA.debugLine="ret = Utils.IfNullOrEmpty(record.GetString(field";
Debug.ShouldStop(4096);
_ret = dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(_field))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 974;BA.debugLine="Exit";
Debug.ShouldStop(8192);
if (true) break;
 }
;
 BA.debugLineNum = 976;BA.debugLine="record.Close";
Debug.ShouldStop(32768);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 977;BA.debugLine="Return ret";
Debug.ShouldStop(65536);
if (true) return _ret;
 BA.debugLineNum = 978;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcolumndoubleevc(RemoteObject _ba,RemoteObject _script,RemoteObject _column) throws Exception{
try {
		Debug.PushSubsStack("GetScriptColumnDoubleEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2119);
if (RapidSub.canDelegate("getscriptcolumndoubleevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcolumndoubleevc", _ba, _script, _column);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("script", _script);
Debug.locals.put("column", _column);
 BA.debugLineNum = 2119;BA.debugLine="Sub GetScriptColumnDoubleEVC(script As String, col";
Debug.ShouldStop(64);
 BA.debugLineNum = 2120;BA.debugLine="Dim Ret As Double = 0.00";
Debug.ShouldStop(128);
_ret = BA.numberCast(double.class, 0.00);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2122;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(512);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2123;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(1024);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2124;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 2125;BA.debugLine="Ret = Record.GetDouble(column)";
Debug.ShouldStop(4096);
_ret = _record.runMethod(true,"GetDouble",(Object)(_column));Debug.locals.put("Ret", _ret);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e7.toString()); BA.debugLineNum = 2127;BA.debugLine="Ret = 0.00";
Debug.ShouldStop(16384);
_ret = BA.numberCast(double.class, 0.00);Debug.locals.put("Ret", _ret);
 };
 BA.debugLineNum = 2129;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 }
;
 BA.debugLineNum = 2131;BA.debugLine="Record.Close";
Debug.ShouldStop(262144);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2132;BA.debugLine="Return Ret";
Debug.ShouldStop(524288);
if (true) return _ret;
 BA.debugLineNum = 2133;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcolumnintevc(RemoteObject _ba,RemoteObject _script,RemoteObject _column) throws Exception{
try {
		Debug.PushSubsStack("GetScriptColumnIntEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2135);
if (RapidSub.canDelegate("getscriptcolumnintevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcolumnintevc", _ba, _script, _column);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("script", _script);
Debug.locals.put("column", _column);
 BA.debugLineNum = 2135;BA.debugLine="Sub GetScriptColumnIntEVC(script As String, column";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 2136;BA.debugLine="Dim Ret As Int = 0";
Debug.ShouldStop(8388608);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2137;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(16777216);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2139;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(67108864);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2140;BA.debugLine="Ret = Record.GetInt(column)";
Debug.ShouldStop(134217728);
_ret = _record.runMethod(true,"GetInt",(Object)(_column));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2141;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
if (true) break;
 }
;
 BA.debugLineNum = 2143;BA.debugLine="Record.Close";
Debug.ShouldStop(1073741824);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2144;BA.debugLine="Return Ret";
Debug.ShouldStop(-2147483648);
if (true) return _ret;
 BA.debugLineNum = 2145;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcolumnintwrk(RemoteObject _ba,RemoteObject _script,RemoteObject _column) throws Exception{
try {
		Debug.PushSubsStack("GetScriptColumnIntWRK (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2147);
if (RapidSub.canDelegate("getscriptcolumnintwrk")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcolumnintwrk", _ba, _script, _column);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("script", _script);
Debug.locals.put("column", _column);
 BA.debugLineNum = 2147;BA.debugLine="Sub GetScriptColumnIntWRK(script As String, column";
Debug.ShouldStop(4);
 BA.debugLineNum = 2148;BA.debugLine="Dim Ret As Int = 0";
Debug.ShouldStop(8);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2149;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
Debug.ShouldStop(16);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2151;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(64);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2152;BA.debugLine="Ret = Record.GetInt(column)";
Debug.ShouldStop(128);
_ret = _record.runMethod(true,"GetInt",(Object)(_column));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2153;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 }
;
 BA.debugLineNum = 2155;BA.debugLine="Record.Close";
Debug.ShouldStop(1024);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2156;BA.debugLine="Return Ret";
Debug.ShouldStop(2048);
if (true) return _ret;
 BA.debugLineNum = 2157;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcolumnstrevc(RemoteObject _ba,RemoteObject _script,RemoteObject _column) throws Exception{
try {
		Debug.PushSubsStack("GetScriptColumnStrEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2160);
if (RapidSub.canDelegate("getscriptcolumnstrevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcolumnstrevc", _ba, _script, _column);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("script", _script);
Debug.locals.put("column", _column);
 BA.debugLineNum = 2160;BA.debugLine="Sub GetScriptColumnStrEVC(script As String, column";
Debug.ShouldStop(32768);
 BA.debugLineNum = 2161;BA.debugLine="Dim Ret As String = \"\"";
Debug.ShouldStop(65536);
_ret = BA.ObjectToString("");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2162;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 2163;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEV";
Debug.ShouldStop(262144);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2164;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(524288);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2165;BA.debugLine="Ret = Record.GetString(column)";
Debug.ShouldStop(1048576);
_ret = _record.runMethod(true,"GetString",(Object)(_column));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2166;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 }
;
 BA.debugLineNum = 2168;BA.debugLine="Record.Close";
Debug.ShouldStop(8388608);
_record.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e10.toString()); BA.debugLineNum = 2170;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621626890",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2172;BA.debugLine="Return Ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 2173;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcolumnstrevcjson(RemoteObject _ba,RemoteObject _script,RemoteObject _column,RemoteObject _jsoncolumn) throws Exception{
try {
		Debug.PushSubsStack("GetScriptColumnStrEVCJSON (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2191);
if (RapidSub.canDelegate("getscriptcolumnstrevcjson")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcolumnstrevcjson", _ba, _script, _column, _jsoncolumn);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _paramters = RemoteObject.createImmutable("");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _continuajson = RemoteObject.createImmutable(false);
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("script", _script);
Debug.locals.put("column", _column);
Debug.locals.put("jsoncolumn", _jsoncolumn);
 BA.debugLineNum = 2191;BA.debugLine="Sub GetScriptColumnStrEVCJSON(script As String, co";
Debug.ShouldStop(16384);
 BA.debugLineNum = 2192;BA.debugLine="Dim Ret As String = \"\"";
Debug.ShouldStop(32768);
_ret = BA.ObjectToString("");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2193;BA.debugLine="Dim Paramters As String = GetScriptColumnStrEVC(s";
Debug.ShouldStop(65536);
_paramters = _getscriptcolumnstrevc(_ba,_script,_column);Debug.locals.put("Paramters", _paramters);Debug.locals.put("Paramters", _paramters);
 BA.debugLineNum = 2194;BA.debugLine="If Utils.NNE(Paramters) Then";
Debug.ShouldStop(131072);
if (dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_paramters)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2195;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(262144);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 2196;BA.debugLine="Dim ContinuaJSON As Boolean = True";
Debug.ShouldStop(524288);
_continuajson = dbstructures.mostCurrent.__c.getField(true,"True");Debug.locals.put("ContinuaJSON", _continuajson);Debug.locals.put("ContinuaJSON", _continuajson);
 BA.debugLineNum = 2197;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 2198;BA.debugLine="JSON1.Initialize(Paramters)";
Debug.ShouldStop(2097152);
_json1.runVoidMethod ("Initialize",(Object)(_paramters));
 BA.debugLineNum = 2199;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(4194304);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e10.toString()); BA.debugLineNum = 2201;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621757962",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 2202;BA.debugLine="ContinuaJSON = False";
Debug.ShouldStop(33554432);
_continuajson = dbstructures.mostCurrent.__c.getField(true,"False");Debug.locals.put("ContinuaJSON", _continuajson);
 };
 BA.debugLineNum = 2205;BA.debugLine="If (ContinuaJSON) Then";
Debug.ShouldStop(268435456);
if ((_continuajson).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2206;BA.debugLine="Ret = Utils.IfNullOrEmpty(MapJSON.Get(jsoncolum";
Debug.ShouldStop(536870912);
_ret = dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((_jsoncolumn))))),(Object)(_ret));Debug.locals.put("Ret", _ret);
 };
 };
 BA.debugLineNum = 2210;BA.debugLine="Return Ret";
Debug.ShouldStop(2);
if (true) return _ret;
 BA.debugLineNum = 2211;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcolumnstrevcjsonmap(RemoteObject _ba,RemoteObject _script,RemoteObject _column) throws Exception{
try {
		Debug.PushSubsStack("GetScriptColumnStrEVCJSONMAP (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2213);
if (RapidSub.canDelegate("getscriptcolumnstrevcjsonmap")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcolumnstrevcjsonmap", _ba, _script, _column);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _paramters = RemoteObject.createImmutable("");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _continuajson = RemoteObject.createImmutable(false);
;
Debug.locals.put("script", _script);
Debug.locals.put("column", _column);
 BA.debugLineNum = 2213;BA.debugLine="Sub GetScriptColumnStrEVCJSONMAP(script As String,";
Debug.ShouldStop(16);
 BA.debugLineNum = 2214;BA.debugLine="Dim Ret As Map : Ret.initialize";
Debug.ShouldStop(32);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2214;BA.debugLine="Dim Ret As Map : Ret.initialize";
Debug.ShouldStop(32);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 2215;BA.debugLine="Dim Paramters As String = GetScriptColumnStrEVC(s";
Debug.ShouldStop(64);
_paramters = _getscriptcolumnstrevc(_ba,_script,_column);Debug.locals.put("Paramters", _paramters);Debug.locals.put("Paramters", _paramters);
 BA.debugLineNum = 2216;BA.debugLine="If Utils.NNE(Paramters) Then";
Debug.ShouldStop(128);
if (dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_paramters)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2217;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(256);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 2218;BA.debugLine="Dim ContinuaJSON As Boolean = True";
Debug.ShouldStop(512);
_continuajson = dbstructures.mostCurrent.__c.getField(true,"True");Debug.locals.put("ContinuaJSON", _continuajson);Debug.locals.put("ContinuaJSON", _continuajson);
 BA.debugLineNum = 2219;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 2220;BA.debugLine="JSON1.Initialize(Paramters)";
Debug.ShouldStop(2048);
_json1.runVoidMethod ("Initialize",(Object)(_paramters));
 BA.debugLineNum = 2221;BA.debugLine="Dim Ret As Map = JSON1.NextObject";
Debug.ShouldStop(4096);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ret = _json1.runMethod(false,"NextObject");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e11.toString()); BA.debugLineNum = 2223;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621823498",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 2226;BA.debugLine="Return Ret";
Debug.ShouldStop(131072);
if (true) return _ret;
 BA.debugLineNum = 2227;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcolumnstrevclstmap(RemoteObject _ba,RemoteObject _script,RemoteObject _column,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("GetScriptColumnStrEVCLSTMAP (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2176);
if (RapidSub.canDelegate("getscriptcolumnstrevclstmap")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcolumnstrevclstmap", _ba, _script, _column, _lst);}
RemoteObject _ret = RemoteObject.createImmutable("");
int _n = 0;
RemoteObject _mmm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("script", _script);
Debug.locals.put("column", _column);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 2176;BA.debugLine="Sub GetScriptColumnStrEVCLSTMAP(script As String,";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2177;BA.debugLine="Dim Ret As String = \"\"";
Debug.ShouldStop(1);
_ret = BA.ObjectToString("");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2178;BA.debugLine="For n=0 To lst.Size-1";
Debug.ShouldStop(2);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step2 > 0 && _n <= limit2) || (step2 < 0 && _n >= limit2) ;_n = ((int)(0 + _n + step2))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 2179;BA.debugLine="Dim mmm As Map = lst.Get(n)";
Debug.ShouldStop(4);
_mmm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mmm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("mmm", _mmm);
 BA.debugLineNum = 2180;BA.debugLine="script = script.Replace(mmm.Get(0), mmm.Get(1))";
Debug.ShouldStop(8);
_script = _script.runMethod(true,"replace",(Object)(BA.ObjectToString(_mmm.runMethod(false,"Get",(Object)(RemoteObject.createImmutable((0)))))),(Object)(BA.ObjectToString(_mmm.runMethod(false,"Get",(Object)(RemoteObject.createImmutable((1)))))));Debug.locals.put("script", _script);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2182;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(32);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2183;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(64);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2184;BA.debugLine="Ret = Record.GetString(column)";
Debug.ShouldStop(128);
_ret = _record.runMethod(true,"GetString",(Object)(_column));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2185;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 }
;
 BA.debugLineNum = 2187;BA.debugLine="Record.Close";
Debug.ShouldStop(1024);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2188;BA.debugLine="Return Ret";
Debug.ShouldStop(2048);
if (true) return _ret;
 BA.debugLineNum = 2189;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcountevc(RemoteObject _ba,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("GetScriptCountEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1578);
if (RapidSub.canDelegate("getscriptcountevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcountevc", _ba, _script);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Script", _script);
 BA.debugLineNum = 1578;BA.debugLine="Sub GetScriptCountEVC(Script As String) As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 1579;BA.debugLine="Dim Ret As Int = 0";
Debug.ShouldStop(1024);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1580;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(2048);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1581;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(4096);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1582;BA.debugLine="Ret = Ret + 1";
Debug.ShouldStop(8192);
_ret = RemoteObject.solve(new RemoteObject[] {_ret,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Ret", _ret);
 }
;
 BA.debugLineNum = 1584;BA.debugLine="Record.Close";
Debug.ShouldStop(32768);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1585;BA.debugLine="Return Ret";
Debug.ShouldStop(65536);
if (true) return _ret;
 BA.debugLineNum = 1586;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscriptcountwrk(RemoteObject _ba,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("GetScriptCountWRK (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2109);
if (RapidSub.canDelegate("getscriptcountwrk")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getscriptcountwrk", _ba, _script);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Script", _script);
 BA.debugLineNum = 2109;BA.debugLine="Sub GetScriptCountWRK(Script As String) As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2110;BA.debugLine="Dim Ret As Int = 0";
Debug.ShouldStop(536870912);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2111;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
Debug.ShouldStop(1073741824);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2112;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(-2147483648);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2113;BA.debugLine="Ret = Ret +1";
Debug.ShouldStop(1);
_ret = RemoteObject.solve(new RemoteObject[] {_ret,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Ret", _ret);
 }
;
 BA.debugLineNum = 2115;BA.debugLine="Record.Close";
Debug.ShouldStop(4);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2116;BA.debugLine="Return Ret";
Debug.ShouldStop(8);
if (true) return _ret;
 BA.debugLineNum = 2117;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectscriptfield(RemoteObject _ba,RemoteObject _script,RemoteObject _field,RemoteObject _position,RemoteObject _nozero) throws Exception{
try {
		Debug.PushSubsStack("getSelectScriptField (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,943);
if (RapidSub.canDelegate("getselectscriptfield")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getselectscriptfield", _ba, _script, _field, _position, _nozero);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("script", _script);
Debug.locals.put("field", _field);
Debug.locals.put("position", _position);
Debug.locals.put("noZero", _nozero);
 BA.debugLineNum = 943;BA.debugLine="Sub getSelectScriptField(script As String, field A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 944;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(32768);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 945;BA.debugLine="Dim Counter As Int = 0";
Debug.ShouldStop(65536);
_counter = BA.numberCast(int.class, 0);Debug.locals.put("Counter", _counter);Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 946;BA.debugLine="If (noZero = True) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_nozero,dbstructures.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 947;BA.debugLine="Counter = 1";
Debug.ShouldStop(262144);
_counter = BA.numberCast(int.class, 1);Debug.locals.put("Counter", _counter);
 };
 BA.debugLineNum = 949;BA.debugLine="Dim record As ResultSet = Starter.LocalSQLEVC.Exe";
Debug.ShouldStop(1048576);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("record", _record);
 BA.debugLineNum = 950;BA.debugLine="Do While record.NextRow";
Debug.ShouldStop(2097152);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 951;BA.debugLine="If (Counter = position) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",_counter,BA.numberCast(double.class, _position)))) { 
 BA.debugLineNum = 952;BA.debugLine="ret = Utils.IfNullOrEmpty(record.GetString(fiel";
Debug.ShouldStop(8388608);
_ret = dbstructures.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,_ba,(Object)(_record.runMethod(true,"GetString",(Object)(_field))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 953;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 BA.debugLineNum = 955;BA.debugLine="Counter = Counter +1";
Debug.ShouldStop(67108864);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Counter", _counter);
 }
;
 BA.debugLineNum = 957;BA.debugLine="record.Close";
Debug.ShouldStop(268435456);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 958;BA.debugLine="Return ret";
Debug.ShouldStop(536870912);
if (true) return _ret;
 BA.debugLineNum = 959;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettaskgroups(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getTASKGroups (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2576);
if (RapidSub.canDelegate("gettaskgroups")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","gettaskgroups", _ba);}
;
 BA.debugLineNum = 2576;BA.debugLine="Sub getTASKGroups As List";
Debug.ShouldStop(32768);
 BA.debugLineNum = 2577;BA.debugLine="Return getITCTable(SQL_DATA_TASK_GROUPS)";
Debug.ShouldStop(65536);
if (true) return _getitctable(_ba,dbstructures._sql_data_task_groups);
 BA.debugLineNum = 2578;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettaskinfototal(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getTaskInfoTotal (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1588);
if (RapidSub.canDelegate("gettaskinfototal")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","gettaskinfototal", _ba);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
 BA.debugLineNum = 1588;BA.debugLine="Sub getTaskInfoTotal As Int";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1589;BA.debugLine="Private Ret As Int = 0";
Debug.ShouldStop(1048576);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1590;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(2097152);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures._evc_sql_get_task_with_info_val))),RemoteObject.createImmutable(""))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1591;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(4194304);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1592;BA.debugLine="Ret = Record.GetInt(\"total\")";
Debug.ShouldStop(8388608);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("total")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1593;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 }
;
 BA.debugLineNum = 1595;BA.debugLine="Record.Close";
Debug.ShouldStop(67108864);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1596;BA.debugLine="Return Ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 1597;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettaskrecordgroupheight_val(RemoteObject _ba,RemoteObject _condition,RemoteObject _v1,RemoteObject _v2) throws Exception{
try {
		Debug.PushSubsStack("getTaskRecordGroupHeight_VAL (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1678);
if (RapidSub.canDelegate("gettaskrecordgroupheight_val")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","gettaskrecordgroupheight_val", _ba, _condition, _v1, _v2);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Condition", _condition);
Debug.locals.put("v1", _v1);
Debug.locals.put("v2", _v2);
 BA.debugLineNum = 1678;BA.debugLine="Sub getTaskRecordGroupHeight_VAL(Condition As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1679;BA.debugLine="Private Ret As Int = 0";
Debug.ShouldStop(16384);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1680;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(32768);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures._evc_sql_get_task_recheigth_val.runMethod(true,"replace",(Object)(BA.ObjectToString(":V1")),(Object)(BA.NumberToString(_v1))).runMethod(true,"replace",(Object)(BA.ObjectToString(":V2")),(Object)(BA.NumberToString(_v2)))))),RemoteObject.createImmutable(" "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_condition))),RemoteObject.createImmutable(""))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1681;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(65536);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1682;BA.debugLine="Ret = Record.GetInt(\"items\")";
Debug.ShouldStop(131072);
_ret = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("items")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1683;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 }
;
 BA.debugLineNum = 1685;BA.debugLine="Record.Close";
Debug.ShouldStop(1048576);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1686;BA.debugLine="Return Ret";
Debug.ShouldStop(2097152);
if (true) return _ret;
 BA.debugLineNum = 1687;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettaskrecordgroupitemscount(RemoteObject _ba,RemoteObject _condition,RemoteObject _orientation,RemoteObject _isphone) throws Exception{
try {
		Debug.PushSubsStack("getTaskRecordGroupItemsCount (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1601);
if (RapidSub.canDelegate("gettaskrecordgroupitemscount")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","gettaskrecordgroupitemscount", _ba, _condition, _orientation, _isphone);}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _col_land = RemoteObject.createImmutable("");
RemoteObject _col_port = RemoteObject.createImmutable("");
RemoteObject _totalitemsheight = RemoteObject.createImmutable("");
RemoteObject _vv = RemoteObject.createImmutable(0);
;
Debug.locals.put("Condition", _condition);
Debug.locals.put("Orientation", _orientation);
Debug.locals.put("isPhone", _isphone);
 BA.debugLineNum = 1601;BA.debugLine="Sub getTaskRecordGroupItemsCount(Condition As Stri";
Debug.ShouldStop(1);
 BA.debugLineNum = 1602;BA.debugLine="Private Ret As Int = 0";
Debug.ShouldStop(2);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1603;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(4);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1608;BA.debugLine="Dim SSQL As String = $\"select sum(a.height_land)";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select sum(a.height_land) as height_land, sum(a.height_port) as height_port,\n"),RemoteObject.createImmutable("													sum(a.height_land_sp) as height_land_sp, sum(a.height_port_sp) as height_port_sp,\n"),RemoteObject.createImmutable("													count(0) as total, \n"),RemoteObject.createImmutable("													(SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"),RemoteObject.createImmutable("															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"),RemoteObject.createImmutable("															and b.unique_key=a.unique_key))-count(0))*60 as totalitemsheight,\n"),RemoteObject.createImmutable("													case \n"),RemoteObject.createImmutable("														when SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"),RemoteObject.createImmutable("															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"),RemoteObject.createImmutable("															and b.unique_key=a.unique_key)) = 1 then 0\n"),RemoteObject.createImmutable("														when SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"),RemoteObject.createImmutable("															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"),RemoteObject.createImmutable("															and b.unique_key=a.unique_key)) = 2 then 1*60\n"),RemoteObject.createImmutable("														when SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"),RemoteObject.createImmutable("															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"),RemoteObject.createImmutable("															and b.unique_key=a.unique_key)) > 2 then (SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"),RemoteObject.createImmutable("															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"),RemoteObject.createImmutable("															and b.unique_key=a.unique_key))-2)*60\n"),RemoteObject.createImmutable("														else 0\n"),RemoteObject.createImmutable("													end as totalitemsheightcheck\n"),RemoteObject.createImmutable("													from dta_tasks_items as a where 1=1  "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_condition))),RemoteObject.createImmutable("")));Debug.locals.put("SSQL", _ssql);Debug.locals.put("SSQL", _ssql);
 BA.debugLineNum = 1629;BA.debugLine="Log( SSQL )";
Debug.ShouldStop(268435456);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","618546716",_ssql,0);
 BA.debugLineNum = 1630;BA.debugLine="Dim col_land As String = \"height_land\"";
Debug.ShouldStop(536870912);
_col_land = BA.ObjectToString("height_land");Debug.locals.put("col_land", _col_land);Debug.locals.put("col_land", _col_land);
 BA.debugLineNum = 1631;BA.debugLine="Dim col_port As String = \"height_port\"";
Debug.ShouldStop(1073741824);
_col_port = BA.ObjectToString("height_port");Debug.locals.put("col_port", _col_port);Debug.locals.put("col_port", _col_port);
 BA.debugLineNum = 1632;BA.debugLine="Dim totalitemsheight As String = \"totalitemsheigh";
Debug.ShouldStop(-2147483648);
_totalitemsheight = BA.ObjectToString("totalitemsheight");Debug.locals.put("totalitemsheight", _totalitemsheight);Debug.locals.put("totalitemsheight", _totalitemsheight);
 BA.debugLineNum = 1633;BA.debugLine="If (isPhone) Then";
Debug.ShouldStop(1);
if ((_isphone).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1634;BA.debugLine="Dim col_land As String = \"height_land_sp\"";
Debug.ShouldStop(2);
_col_land = BA.ObjectToString("height_land_sp");Debug.locals.put("col_land", _col_land);Debug.locals.put("col_land", _col_land);
 BA.debugLineNum = 1635;BA.debugLine="Dim col_port As String = \"height_port_sp\"";
Debug.ShouldStop(4);
_col_port = BA.ObjectToString("height_port_sp");Debug.locals.put("col_port", _col_port);Debug.locals.put("col_port", _col_port);
 };
 BA.debugLineNum = 1638;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SSQL)";
Debug.ShouldStop(32);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1639;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1640;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(128);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1641;BA.debugLine="If (Orientation = 0) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_orientation,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1642;BA.debugLine="Ret = Record.GetInt(col_land)";
Debug.ShouldStop(512);
_ret = _record.runMethod(true,"GetInt",(Object)(_col_land));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1643;BA.debugLine="If Not(isPhone) And Ret < 150 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(_isphone))) && RemoteObject.solveBoolean("<",_ret,BA.numberCast(double.class, 150))) { 
 BA.debugLineNum = 1644;BA.debugLine="Ret = 150";
Debug.ShouldStop(2048);
_ret = BA.numberCast(int.class, 150);Debug.locals.put("Ret", _ret);
 };
 }else {
 BA.debugLineNum = 1647;BA.debugLine="Ret = Record.GetInt(col_port)";
Debug.ShouldStop(16384);
_ret = _record.runMethod(true,"GetInt",(Object)(_col_port));Debug.locals.put("Ret", _ret);
 };
 BA.debugLineNum = 1650;BA.debugLine="Dim vv As Int = Record.GetInt(totalitemsheight)";
Debug.ShouldStop(131072);
_vv = _record.runMethod(true,"GetInt",(Object)(_totalitemsheight));Debug.locals.put("vv", _vv);Debug.locals.put("vv", _vv);
 BA.debugLineNum = 1651;BA.debugLine="If (isPhone) Then";
Debug.ShouldStop(262144);
if ((_isphone).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1652;BA.debugLine="If Ret < 230 Then Ret = 230";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",_ret,BA.numberCast(double.class, 230))) { 
_ret = BA.numberCast(int.class, 230);Debug.locals.put("Ret", _ret);};
 BA.debugLineNum = 1653;BA.debugLine="Ret = Ret + vv";
Debug.ShouldStop(1048576);
_ret = RemoteObject.solve(new RemoteObject[] {_ret,_vv}, "+",1, 1);Debug.locals.put("Ret", _ret);
 };
 };
 BA.debugLineNum = 1656;BA.debugLine="Record.Close";
Debug.ShouldStop(8388608);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1657;BA.debugLine="Log($\"Tamanho de pergunta ${Ret}\"$)";
Debug.ShouldStop(16777216);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","618546744",(RemoteObject.concat(RemoteObject.createImmutable("Tamanho de pergunta "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ret))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 1658;BA.debugLine="Return Ret";
Debug.ShouldStop(33554432);
if (true) return _ret;
 BA.debugLineNum = 1659;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettaskrequests(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getTASKRequests (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2580);
if (RapidSub.canDelegate("gettaskrequests")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","gettaskrequests", _ba);}
;
 BA.debugLineNum = 2580;BA.debugLine="Sub getTASKRequests As List";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2581;BA.debugLine="Return getITCTable(SQL_DATA_TASK_REQUESTS)";
Debug.ShouldStop(1048576);
if (true) return _getitctable(_ba,dbstructures._sql_data_task_requests);
 BA.debugLineNum = 2582;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geturgency(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getUrgency (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1562);
if (RapidSub.canDelegate("geturgency")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","geturgency", _ba);}
;
 BA.debugLineNum = 1562;BA.debugLine="Sub getUrgency As List";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1563;BA.debugLine="Return getITCTable(SQL_DATA_TYPE_URGENCY)";
Debug.ShouldStop(67108864);
if (true) return _getitctable(_ba,dbstructures._sql_data_type_urgency);
 BA.debugLineNum = 1564;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getworkerdblastupdate(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetWorkerDbLastUpdate (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2530);
if (RapidSub.canDelegate("getworkerdblastupdate")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","getworkerdblastupdate", _ba);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
 BA.debugLineNum = 2530;BA.debugLine="Sub GetWorkerDbLastUpdate() As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 2531;BA.debugLine="Private Ret As String = \"\"";
Debug.ShouldStop(4);
_ret = BA.ObjectToString("");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2532;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
Debug.ShouldStop(8);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("select * from loc_updates")))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2533;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(16);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2534;BA.debugLine="Ret = Record.GetString(\"last_update\")";
Debug.ShouldStop(32);
_ret = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("last_update")));Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 2535;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 }
;
 BA.debugLineNum = 2537;BA.debugLine="Record.Close";
Debug.ShouldStop(256);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2538;BA.debugLine="Return Ret";
Debug.ShouldStop(512);
if (true) return _ret;
 BA.debugLineNum = 2539;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertaddress(RemoteObject _ba,RemoteObject _entity,RemoteObject _local,RemoteObject _adrs) throws Exception{
try {
		Debug.PushSubsStack("InsertAddress (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2028);
if (RapidSub.canDelegate("insertaddress")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertaddress", _ba, _entity, _local, _adrs);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("entity", _entity);
Debug.locals.put("local", _local);
Debug.locals.put("adrs", _adrs);
 BA.debugLineNum = 2028;BA.debugLine="Sub InsertAddress(entity As String, local As Strin";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2031;BA.debugLine="Dim sqlScript As String = $\"insert into locals (a";
Debug.ShouldStop(16384);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("insert into locals (ascbus, tagcode, address_tagcode, address, address2, postal_code, city, latitude, longitude) values (1, '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_local))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_local))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressName" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressName2" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressPostalCode" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressCity" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressLatitude" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressLongitude" /*RemoteObject*/ )))),RemoteObject.createImmutable("')")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2032;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(32768);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2033;BA.debugLine="Dim sqlScript As String = $\"insert into locals2en";
Debug.ShouldStop(65536);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("insert into locals2entities (entity, locality, localtype) values ('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_entity))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_local))),RemoteObject.createImmutable("', "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {_adrs.getField(true,"AddressType" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)))),RemoteObject.createImmutable(")")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2034;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(131072);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2035;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertentityproperty(RemoteObject _ba,RemoteObject _entity,RemoteObject _property,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertEntityProperty (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2052);
if (RapidSub.canDelegate("insertentityproperty")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertentityproperty", _ba, _entity, _property, _value);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("entity", _entity);
Debug.locals.put("property", _property);
Debug.locals.put("value", _value);
 BA.debugLineNum = 2052;BA.debugLine="Sub InsertEntityProperty(entity As String, propert";
Debug.ShouldStop(8);
 BA.debugLineNum = 2053;BA.debugLine="Dim sqlScript As String = $\"insert into props2ent";
Debug.ShouldStop(16);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("insert into props2entities (entity, property, value) values ('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_entity))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_property))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("')")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2054;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(32);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2055;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertintoscript(RemoteObject _ba,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("InsertIntoScript (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2733);
if (RapidSub.canDelegate("insertintoscript")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertintoscript", _ba, _script);}
;
Debug.locals.put("script", _script);
 BA.debugLineNum = 2733;BA.debugLine="Sub InsertIntoScript(script As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 2734;BA.debugLine="If Utils.NNE(script) Then";
Debug.ShouldStop(8192);
if (dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_script)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2735;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(script)";
Debug.ShouldStop(16384);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_script));
 };
 BA.debugLineNum = 2737;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertobjectproperty(RemoteObject _ba,RemoteObject _sobject,RemoteObject _property,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertObjectProperty (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2062);
if (RapidSub.canDelegate("insertobjectproperty")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertobjectproperty", _ba, _sobject, _property, _value);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("sobject", _sobject);
Debug.locals.put("property", _property);
Debug.locals.put("value", _value);
 BA.debugLineNum = 2062;BA.debugLine="Sub InsertObjectProperty(sobject As String, proper";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2063;BA.debugLine="Dim sqlScript As String = $\"insert into props2obj";
Debug.ShouldStop(16384);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("insert into props2objects (object, property, value) values ('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sobject))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_property))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("')")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2064;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(32768);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2065;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertrequestas(RemoteObject _ba,RemoteObject _clai,RemoteObject _astagcode,RemoteObject _status,RemoteObject _priority,RemoteObject _urgency,RemoteObject _assign,RemoteObject _details,RemoteObject _emails,RemoteObject _emsent,RemoteObject _due_date) throws Exception{
try {
		Debug.PushSubsStack("InsertRequestAS (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2229);
if (RapidSub.canDelegate("insertrequestas")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertrequestas", _ba, _clai, _astagcode, _status, _priority, _urgency, _assign, _details, _emails, _emsent, _due_date);}
RemoteObject _newid = RemoteObject.createImmutable(0);
RemoteObject _newas = RemoteObject.createImmutable(false);
RemoteObject _actiondatetime = RemoteObject.createImmutable("");
RemoteObject _emailsentdate = RemoteObject.createImmutable("");
RemoteObject _ssqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("clai", _clai);
Debug.locals.put("asTagcode", _astagcode);
Debug.locals.put("status", _status);
Debug.locals.put("priority", _priority);
Debug.locals.put("urgency", _urgency);
Debug.locals.put("assign", _assign);
Debug.locals.put("details", _details);
Debug.locals.put("emails", _emails);
Debug.locals.put("emsent", _emsent);
Debug.locals.put("due_date", _due_date);
 BA.debugLineNum = 2229;BA.debugLine="Sub InsertRequestAS(clai As RequestCLAItem, asTagc";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2255;BA.debugLine="Dim NewID As Int =  GetCountOf(\"requests_actions_";
Debug.ShouldStop(16384);
_newid = RemoteObject.solve(new RemoteObject[] {_getcountof(_ba,BA.ObjectToString("requests_actions_history"),(RemoteObject.concat(RemoteObject.createImmutable(" and request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("'")))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NewID", _newid);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 2256;BA.debugLine="Dim newAS As Boolean = False";
Debug.ShouldStop(32768);
_newas = dbstructures.mostCurrent.__c.getField(true,"False");Debug.locals.put("newAS", _newas);Debug.locals.put("newAS", _newas);
 BA.debugLineNum = 2257;BA.debugLine="If (asTagcode = \"\") Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_astagcode,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 2258;BA.debugLine="asTagcode = Utils.GenerateTagcode(\"AS0\")";
Debug.ShouldStop(131072);
_astagcode = dbstructures.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,_ba,(Object)(RemoteObject.createImmutable("AS0")));Debug.locals.put("asTagcode", _astagcode);
 BA.debugLineNum = 2259;BA.debugLine="newAS = True";
Debug.ShouldStop(262144);
_newas = dbstructures.mostCurrent.__c.getField(true,"True");Debug.locals.put("newAS", _newas);
 };
 BA.debugLineNum = 2261;BA.debugLine="Dim actiondatetime As String = Utils.GetCurrDatet";
Debug.ShouldStop(1048576);
_actiondatetime = dbstructures.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,_ba);Debug.locals.put("actiondatetime", _actiondatetime);Debug.locals.put("actiondatetime", _actiondatetime);
 BA.debugLineNum = 2262;BA.debugLine="Dim emailsentdate As String = \"\"";
Debug.ShouldStop(2097152);
_emailsentdate = BA.ObjectToString("");Debug.locals.put("emailsentdate", _emailsentdate);Debug.locals.put("emailsentdate", _emailsentdate);
 BA.debugLineNum = 2263;BA.debugLine="If (emsent) Then emailsentdate = actiondatetime";
Debug.ShouldStop(4194304);
if ((_emsent).<Boolean>get().booleanValue()) { 
_emailsentdate = _actiondatetime;Debug.locals.put("emailsentdate", _emailsentdate);};
 BA.debugLineNum = 2298;BA.debugLine="Dim ssqlScript As String = $\"INSERT INTO requests";
Debug.ShouldStop(33554432);
_ssqlscript = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO requests_actions_history (id, request_tagcode, action_tagcode, task_tagcode,\n"),RemoteObject.createImmutable("		item_tagcode, uniquekey, iu_tagcode, tagcode, posis, status, details, actiondatetime, assigned_to, assigned_type, \n"),RemoteObject.createImmutable("		email_datetime, email_sent, email_to, priority, related_task, take_action, title, urgency, user_tagcode, repeatcounter, \n"),RemoteObject.createImmutable("		repeatitemcounter, due_date) values \n"),RemoteObject.createImmutable("		("),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newid))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("', 0, \n"),RemoteObject.createImmutable("		"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_details))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actiondatetime))),RemoteObject.createImmutable("', 'USR_PALPEDRINHA', 0, '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsentdate))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("		"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,_ba,(Object)(_emsent))))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emails))),RemoteObject.createImmutable("', "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_priority))),RemoteObject.createImmutable(", '', '', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Title" /*RemoteObject*/ )))),RemoteObject.createImmutable("', "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_urgency))),RemoteObject.createImmutable(", 'USR_PALPEDRINHA', \n"),RemoteObject.createImmutable("		"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_due_date))),RemoteObject.createImmutable("')")));Debug.locals.put("ssqlScript", _ssqlscript);Debug.locals.put("ssqlScript", _ssqlscript);
 BA.debugLineNum = 2306;BA.debugLine="Log(ssqlScript)";
Debug.ShouldStop(2);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621889101",_ssqlscript,0);
 BA.debugLineNum = 2307;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 2308;BA.debugLine="Starter.LocalSQL.ExecNonQuery(ssqlScript)";
Debug.ShouldStop(8);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssqlscript));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e15.toString()); BA.debugLineNum = 2310;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621889105",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2313;BA.debugLine="If (newAS) Then";
Debug.ShouldStop(256);
if ((_newas).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2314;BA.debugLine="Dim NewID As Int =  GetCountOf(\"requests_actions";
Debug.ShouldStop(512);
_newid = RemoteObject.solve(new RemoteObject[] {_getcountof(_ba,BA.ObjectToString("requests_actions"),(RemoteObject.concat(RemoteObject.createImmutable(" and request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("'")))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NewID", _newid);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 2315;BA.debugLine="ssqlScript = $\"INSERT INTO requests_actions (id,";
Debug.ShouldStop(1024);
_ssqlscript = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO requests_actions (id, request_tagcode, action_tagcode, task_tagcode,\n"),RemoteObject.createImmutable("			item_tagcode, uniquekey, iu_tagcode, tagcode, posis, status, details, actiondatetime, assigned_to, assigned_type, \n"),RemoteObject.createImmutable("			email_datetime, email_sent, email_to, priority, related_task, take_action, title, urgency, user_tagcode, repeatcounter, \n"),RemoteObject.createImmutable("			repeatitemcounter,due_date) values \n"),RemoteObject.createImmutable("			("),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newid))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("', 0, \n"),RemoteObject.createImmutable("			"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_details))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actiondatetime))),RemoteObject.createImmutable("', 'USR_PALPEDRINHA', 0, '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsentdate))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("			"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,_ba,(Object)(_emsent))))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emails))),RemoteObject.createImmutable("', "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_priority))),RemoteObject.createImmutable(", '', '', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"Title" /*RemoteObject*/ )))),RemoteObject.createImmutable("', "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_urgency))),RemoteObject.createImmutable(", 'USR_PALPEDRINHA', \n"),RemoteObject.createImmutable("			"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clai.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_due_date))),RemoteObject.createImmutable("')")));Debug.locals.put("ssqlScript", _ssqlscript);
 BA.debugLineNum = 2323;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 2324;BA.debugLine="Starter.LocalSQL.ExecNonQuery(ssqlScript)";
Debug.ShouldStop(524288);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssqlscript));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e23.toString()); BA.debugLineNum = 2326;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621889121",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 2369;BA.debugLine="Return asTagcode";
Debug.ShouldStop(1);
if (true) return _astagcode;
 BA.debugLineNum = 2370;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertrequestasevc(RemoteObject _ba,RemoteObject _astagcode,RemoteObject _request,RemoteObject _action,RemoteObject _task,RemoteObject _item,RemoteObject _uniquekey,RemoteObject _tagcode,RemoteObject _dlgassubject,RemoteObject _dlgasdetails,RemoteObject _dlgaspriority,RemoteObject _dlgasurgency,RemoteObject _sess_oper_user,RemoteObject _dlgasstatus,RemoteObject _emailsentdate,RemoteObject _emailsentonnewas,RemoteObject _dlgasemails,RemoteObject _dlgasduedate,RemoteObject _repeatcounter,RemoteObject _repeatitemcounter,RemoteObject _repeatfieldcounter,RemoteObject _datetimecreation,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _obs,RemoteObject _sendtheemail) throws Exception{
try {
		Debug.PushSubsStack("InsertRequestASEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2372);
if (RapidSub.canDelegate("insertrequestasevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertrequestasevc", _ba, _astagcode, _request, _action, _task, _item, _uniquekey, _tagcode, _dlgassubject, _dlgasdetails, _dlgaspriority, _dlgasurgency, _sess_oper_user, _dlgasstatus, _emailsentdate, _emailsentonnewas, _dlgasemails, _dlgasduedate, _repeatcounter, _repeatitemcounter, _repeatfieldcounter, _datetimecreation, _tagcodetpa, _grouptpa, _obs, _sendtheemail);}
RemoteObject _newid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _additional = RemoteObject.createImmutable("");
;
Debug.locals.put("asTagcode", _astagcode);
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
Debug.locals.put("Task", _task);
Debug.locals.put("Item", _item);
Debug.locals.put("UniqueKey", _uniquekey);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("dlgASSubject", _dlgassubject);
Debug.locals.put("dlgASDetails", _dlgasdetails);
Debug.locals.put("dlgASPriority", _dlgaspriority);
Debug.locals.put("dlgASUrgency", _dlgasurgency);
Debug.locals.put("SESS_OPER_User", _sess_oper_user);
Debug.locals.put("dlgASStatus", _dlgasstatus);
Debug.locals.put("emailsentdate", _emailsentdate);
Debug.locals.put("EmailSentOnNewAS", _emailsentonnewas);
Debug.locals.put("dlgASEmails", _dlgasemails);
Debug.locals.put("dlgASDueDate", _dlgasduedate);
Debug.locals.put("repeatcounter", _repeatcounter);
Debug.locals.put("repeatitemcounter", _repeatitemcounter);
Debug.locals.put("repeatfieldcounter", _repeatfieldcounter);
Debug.locals.put("DateTimecreation", _datetimecreation);
Debug.locals.put("tagcodeTPA", _tagcodetpa);
Debug.locals.put("groupTPA", _grouptpa);
Debug.locals.put("obs", _obs);
Debug.locals.put("sendTheEmail", _sendtheemail);
 BA.debugLineNum = 2372;BA.debugLine="Sub InsertRequestASEVC(asTagcode As String, Reques";
Debug.ShouldStop(8);
 BA.debugLineNum = 2380;BA.debugLine="Dim NewID As Int =  GetMaxOfEVC(\"dta_actions\", \"i";
Debug.ShouldStop(2048);
_newid = RemoteObject.solve(new RemoteObject[] {_getmaxofevc(_ba,BA.ObjectToString("dta_actions"),BA.ObjectToString("id"),RemoteObject.createImmutable("")),RemoteObject.createImmutable(2)}, "+",1, 1);Debug.locals.put("NewID", _newid);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 2381;BA.debugLine="Dim ssql As String = $\"INSERT INTO dta_actions (i";
Debug.ShouldStop(4096);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO dta_actions (id,tagcode,request_tagcode,action_tagcode,task_tagcode,item_tagcode,uniquekey,iu_tagcode,\n"),RemoteObject.createImmutable("				internal,title,operation_type,details,priority_tagcode,gravity_tagcode,technical_tagcode,due_date,\n"),RemoteObject.createImmutable("				send_email,email_sent,email_to,email_cc,active, \n"),RemoteObject.createImmutable("				repeatcounter, repeatitemcounter, repeatfieldcounter, updated_at, created_at)\n"),RemoteObject.createImmutable("				values\n"),RemoteObject.createImmutable("				('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newid))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uniquekey))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				'1','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgassubject))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasstatus))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasdetails))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgaspriority))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasurgency))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sess_oper_user))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasduedate))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sendtheemail))),RemoteObject.createImmutable(","),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sendtheemail))),RemoteObject.createImmutable(",'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasemails))),RemoteObject.createImmutable("','',1, "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(", "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable(", "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable(", \n"),RemoteObject.createImmutable("				'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datetimecreation))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datetimecreation))),RemoteObject.createImmutable("')")));Debug.locals.put("ssql", _ssql);Debug.locals.put("ssql", _ssql);
 BA.debugLineNum = 2390;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 2392;BA.debugLine="Utils.SaveSQLToLog(\"NewAS\",ssql, asTagcode)";
Debug.ShouldStop(8388608);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("NewAS")),(Object)(_ssql),(Object)(_astagcode));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e6.toString()); BA.debugLineNum = 2394;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621954582",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2397;BA.debugLine="Dim NewID As Int =  GetMaxOfEVC(\"dta_actions_item";
Debug.ShouldStop(268435456);
_newid = RemoteObject.solve(new RemoteObject[] {_getmaxofevc(_ba,BA.ObjectToString("dta_actions_items"),BA.ObjectToString("id"),RemoteObject.createImmutable("")),RemoteObject.createImmutable(2)}, "+",1, 1);Debug.locals.put("NewID", _newid);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 2398;BA.debugLine="Dim ssql As String = $\"INSERT INTO dta_actions_it";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO dta_actions_items (id,actions_tagcode,operation_type,\n"),RemoteObject.createImmutable("				details, priority_tagcode, gravity_tagcode, technical_tagcode, due_date,\n"),RemoteObject.createImmutable("				send_email,email_sent,email_to,active, \n"),RemoteObject.createImmutable("				repeatcounter, repeatitemcounter, repeatfieldcounter)\n"),RemoteObject.createImmutable("				values\n"),RemoteObject.createImmutable("				('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newid))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasstatus))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasdetails))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgaspriority))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasurgency))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sess_oper_user))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasduedate))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sendtheemail))),RemoteObject.createImmutable(","),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sendtheemail))),RemoteObject.createImmutable(",'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasemails))),RemoteObject.createImmutable("',1, "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(", "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable(", "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable(")")));Debug.locals.put("ssql", _ssql);Debug.locals.put("ssql", _ssql);
 BA.debugLineNum = 2407;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 2409;BA.debugLine="Utils.SaveSQLToLog(\"NewASItem\",ssql, asTagcode)";
Debug.ShouldStop(256);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("NewASItem")),(Object)(_ssql),(Object)(_astagcode));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e13.toString()); BA.debugLineNum = 2411;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621954599",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2414;BA.debugLine="If (DBUtils.TableExists(Starter.LocalSQLEVC, \"dta";
Debug.ShouldStop(8192);
if ((dbstructures.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("dta_actions_adds")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2415;BA.debugLine="If (Utils.NE(tagcodeTPA)) Then";
Debug.ShouldStop(16384);
if ((dbstructures.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,_ba,(Object)(_tagcodetpa))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2416;BA.debugLine="tagcodeTPA = \"TACTTT_001\"";
Debug.ShouldStop(32768);
_tagcodetpa = BA.ObjectToString("TACTTT_001");Debug.locals.put("tagcodeTPA", _tagcodetpa);
 };
 BA.debugLineNum = 2419;BA.debugLine="Dim NewID As Int =  GetMaxOfEVC(\"dta_actions_add";
Debug.ShouldStop(262144);
_newid = RemoteObject.solve(new RemoteObject[] {_getmaxofevc(_ba,BA.ObjectToString("dta_actions_adds"),BA.ObjectToString("id"),RemoteObject.createImmutable("")),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NewID", _newid);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 2420;BA.debugLine="Dim ssql As String = $\"INSERT INTO dta_actions_a";
Debug.ShouldStop(524288);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO dta_actions_adds (id,actions_tagcode,action_type,fieldref_01) values\n"),RemoteObject.createImmutable("				('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newid))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcodetpa))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_grouptpa))),RemoteObject.createImmutable("')")));Debug.locals.put("ssql", _ssql);Debug.locals.put("ssql", _ssql);
 BA.debugLineNum = 2422;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 2424;BA.debugLine="Utils.SaveSQLToLog(\"NewASItemAdds\",ssql, asTagc";
Debug.ShouldStop(8388608);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("NewASItemAdds")),(Object)(_ssql),(Object)(_astagcode));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e24.toString()); BA.debugLineNum = 2426;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621954614",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 2430;BA.debugLine="Dim additional As String = \"\"";
Debug.ShouldStop(536870912);
_additional = BA.ObjectToString("");Debug.locals.put("additional", _additional);Debug.locals.put("additional", _additional);
 BA.debugLineNum = 2431;BA.debugLine="If (Utils.NNE(obs) And Utils.NE(dlgASDetails)) Th";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean(".",dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_obs))) && RemoteObject.solveBoolean(".",dbstructures.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,_ba,(Object)(_dlgasdetails))))) { 
 BA.debugLineNum = 2432;BA.debugLine="additional = $\", execute_notes='${obs}'\"$";
Debug.ShouldStop(-2147483648);
_additional = (RemoteObject.concat(RemoteObject.createImmutable(", execute_notes='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_obs))),RemoteObject.createImmutable("'")));Debug.locals.put("additional", _additional);
 };
 BA.debugLineNum = 2435;BA.debugLine="Dim ssql As String = $\"UPDATE dta_requests_values";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("UPDATE dta_requests_values SET execute_action='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_additional))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("							WHERE request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And inner_request_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And task_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And item_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And unique_key='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uniquekey.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(" ")));Debug.locals.put("ssql", _ssql);Debug.locals.put("ssql", _ssql);
 BA.debugLineNum = 2443;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 2445;BA.debugLine="Utils.SaveSQLToLog(\"UpdateRequest\",ssql, asTagco";
Debug.ShouldStop(4096);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("UpdateRequest")),(Object)(_ssql),(Object)(_astagcode));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e35) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e35.toString()); BA.debugLineNum = 2447;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","621954635",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2450;BA.debugLine="Return asTagcode";
Debug.ShouldStop(131072);
if (true) return _astagcode;
 BA.debugLineNum = 2451;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertrequestasevcdetails(RemoteObject _ba,RemoteObject _astagcode,RemoteObject _request,RemoteObject _action,RemoteObject _task,RemoteObject _item,RemoteObject _uniquekey,RemoteObject _tagcode,RemoteObject _dlgassubject,RemoteObject _dlgasdetails,RemoteObject _dlgaspriority,RemoteObject _dlgasurgency,RemoteObject _sess_oper_user,RemoteObject _dlgasstatus,RemoteObject _emailsentdate,RemoteObject _emailsentonnewas,RemoteObject _dlgasemails,RemoteObject _dlgasduedate,RemoteObject _repeatcounter,RemoteObject _repeatitemcounter,RemoteObject _repeatfieldcounter,RemoteObject _datetimecreation,RemoteObject _sendtheemail) throws Exception{
try {
		Debug.PushSubsStack("InsertRequestASEVCDetails (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2453);
if (RapidSub.canDelegate("insertrequestasevcdetails")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertrequestasevcdetails", _ba, _astagcode, _request, _action, _task, _item, _uniquekey, _tagcode, _dlgassubject, _dlgasdetails, _dlgaspriority, _dlgasurgency, _sess_oper_user, _dlgasstatus, _emailsentdate, _emailsentonnewas, _dlgasemails, _dlgasduedate, _repeatcounter, _repeatitemcounter, _repeatfieldcounter, _datetimecreation, _sendtheemail);}
RemoteObject _newid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
;
Debug.locals.put("asTagcode", _astagcode);
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
Debug.locals.put("Task", _task);
Debug.locals.put("Item", _item);
Debug.locals.put("UniqueKey", _uniquekey);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("dlgASSubject", _dlgassubject);
Debug.locals.put("dlgASDetails", _dlgasdetails);
Debug.locals.put("dlgASPriority", _dlgaspriority);
Debug.locals.put("dlgASUrgency", _dlgasurgency);
Debug.locals.put("SESS_OPER_User", _sess_oper_user);
Debug.locals.put("dlgASStatus", _dlgasstatus);
Debug.locals.put("emailsentdate", _emailsentdate);
Debug.locals.put("EmailSentOnNewAS", _emailsentonnewas);
Debug.locals.put("dlgASEmails", _dlgasemails);
Debug.locals.put("dlgASDueDate", _dlgasduedate);
Debug.locals.put("repeatcounter", _repeatcounter);
Debug.locals.put("repeatitemcounter", _repeatitemcounter);
Debug.locals.put("repeatfieldcounter", _repeatfieldcounter);
Debug.locals.put("DateTimecreation", _datetimecreation);
Debug.locals.put("sendTheEmail", _sendtheemail);
 BA.debugLineNum = 2453;BA.debugLine="Sub InsertRequestASEVCDetails(asTagcode As String,";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2461;BA.debugLine="Dim NewID As Int =  GetMaxOfEVC(\"dta_actions_item";
Debug.ShouldStop(268435456);
_newid = RemoteObject.solve(new RemoteObject[] {_getmaxofevc(_ba,BA.ObjectToString("dta_actions_items"),BA.ObjectToString("id"),RemoteObject.createImmutable("")),RemoteObject.createImmutable(2)}, "+",1, 1);Debug.locals.put("NewID", _newid);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 2462;BA.debugLine="Dim ssql As String = $\"INSERT INTO dta_actions_it";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO dta_actions_items (id,actions_tagcode,operation_type,\n"),RemoteObject.createImmutable("				details, priority_tagcode, gravity_tagcode, technical_tagcode, due_date,\n"),RemoteObject.createImmutable("				send_email,email_sent,email_to,active, \n"),RemoteObject.createImmutable("				repeatcounter, repeatitemcounter, repeatfieldcounter, updated_at)\n"),RemoteObject.createImmutable("				values\n"),RemoteObject.createImmutable("				('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newid))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasstatus))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasdetails))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgaspriority))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasurgency))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sess_oper_user))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasduedate))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sendtheemail))),RemoteObject.createImmutable(","),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sendtheemail))),RemoteObject.createImmutable(",'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasemails))),RemoteObject.createImmutable("',1, "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(", "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable(", "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datetimecreation))),RemoteObject.createImmutable("')")));Debug.locals.put("ssql", _ssql);Debug.locals.put("ssql", _ssql);
 BA.debugLineNum = 2470;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 2472;BA.debugLine="Utils.SaveSQLToLog(\"NewASItem\",ssql, asTagcode)";
Debug.ShouldStop(128);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("NewASItem")),(Object)(_ssql),(Object)(_astagcode));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e6.toString()); BA.debugLineNum = 2474;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","622020117",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2477;BA.debugLine="Return asTagcode";
Debug.ShouldStop(4096);
if (true) return _astagcode;
 BA.debugLineNum = 2478;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertuserequipment(RemoteObject _ba,RemoteObject _usertagcode,RemoteObject _equiptagcode) throws Exception{
try {
		Debug.PushSubsStack("insertUserEquipment (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1960);
if (RapidSub.canDelegate("insertuserequipment")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertuserequipment", _ba, _usertagcode, _equiptagcode);}
RemoteObject _newid = RemoteObject.createImmutable(0);
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("userTagcode", _usertagcode);
Debug.locals.put("equipTagcode", _equiptagcode);
 BA.debugLineNum = 1960;BA.debugLine="Sub insertUserEquipment(userTagcode As String, equ";
Debug.ShouldStop(128);
 BA.debugLineNum = 1963;BA.debugLine="Dim newID As Int = GetMaxOfEVC(\"dta_equipments_te";
Debug.ShouldStop(1024);
_newid = _getmaxofevc(_ba,BA.ObjectToString("dta_equipments_technicals"),BA.ObjectToString("id"),RemoteObject.createImmutable(""));Debug.locals.put("newID", _newid);Debug.locals.put("newID", _newid);
 BA.debugLineNum = 1964;BA.debugLine="Dim sqlScript As String = $\"insert into dta_equip";
Debug.ShouldStop(2048);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_equipments_technicals ( id, equipment_tagcode, technical_tagcode, active) values ("),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {_newid,RemoteObject.createImmutable(1)}, "+",1, 1)))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_equiptagcode))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usertagcode))),RemoteObject.createImmutable("', 1)")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 1966;BA.debugLine="Utils.SaveSQLToLog(\"insertUserEquipment\",sqlScrip";
Debug.ShouldStop(8192);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("insertUserEquipment")),(Object)(_sqlscript),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1968;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertuserunavailable(RemoteObject _ba,RemoteObject _code,RemoteObject _startdate,RemoteObject _enddate,RemoteObject _reason) throws Exception{
try {
		Debug.PushSubsStack("insertUserUnavailable (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1921);
if (RapidSub.canDelegate("insertuserunavailable")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertuserunavailable", _ba, _code, _startdate, _enddate, _reason);}
;
Debug.locals.put("code", _code);
Debug.locals.put("startDate", _startdate);
Debug.locals.put("endDate", _enddate);
Debug.locals.put("reason", _reason);
 BA.debugLineNum = 1921;BA.debugLine="Sub insertUserUnavailable(code As String, startDat";
Debug.ShouldStop(1);
 BA.debugLineNum = 1928;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertworkingfiles(RemoteObject _ba,RemoteObject _suser,RemoteObject _tagcode,RemoteObject _filename,RemoteObject _folder,RemoteObject _dtime,RemoteObject _latitude,RemoteObject _longitude) throws Exception{
try {
		Debug.PushSubsStack("InsertWorkingFiles (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2067);
if (RapidSub.canDelegate("insertworkingfiles")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","insertworkingfiles", _ba, _suser, _tagcode, _filename, _folder, _dtime, _latitude, _longitude);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("sUser", _suser);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("filename", _filename);
Debug.locals.put("folder", _folder);
Debug.locals.put("dtime", _dtime);
Debug.locals.put("latitude", _latitude);
Debug.locals.put("longitude", _longitude);
 BA.debugLineNum = 2067;BA.debugLine="Sub InsertWorkingFiles(sUser As String, tagcode As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2068;BA.debugLine="Dim sqlScript As String = $\"INSERT INTO workingfi";
Debug.ShouldStop(524288);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO workingfiles ( ascbus, usertagcode, tagcode, folder, filename, datetime, latitude, longitude) VALUES (1,'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_suser))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_folder))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dtime))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_latitude))),RemoteObject.createImmutable("','"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_longitude))),RemoteObject.createImmutable("');")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2069;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(1048576);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2070;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public Const EVC_SQL_GLOBAL_SEARCH As String = $\"";
dbstructures._evc_sql_global_search = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("													select y.grupo, y.tagcode, y.execute_date, y.execute_start, \n"),RemoteObject.createImmutable("													y.reference, y.entidade, y.objecto, y.tipointervencao,\n"),RemoteObject.createImmutable("													y.tecnico, y.tipoobjecto, y.morada1,y.concelhodistrito1,\n"),RemoteObject.createImmutable("													y.georef1,y.morada2,y.concelhodistrito2,y.georef2,\n"),RemoteObject.createImmutable("													y.morada3,y.concelhodistrito3,y.georef3 from (\n"),RemoteObject.createImmutable("													\n"),RemoteObject.createImmutable("													select 1 as grupo, x.tagcode, x.execute_date, x.execute_start, \n"),RemoteObject.createImmutable("													x.reference, x.entidade, x.objecto, x.tipointervencao,\n"),RemoteObject.createImmutable("													x.tecnico, x.tipoobjecto, x.morada1,x.concelhodistrito1,\n"),RemoteObject.createImmutable("													x.georef1,x.morada2,x.concelhodistrito2,x.georef2,\n"),RemoteObject.createImmutable("													x.morada3,x.concelhodistrito3,x.georef3 from (\n"),RemoteObject.createImmutable("													select a.tagcode, a.execute_date, a.execute_start, a.reference,\n"),RemoteObject.createImmutable("														b.title_import as entidade, c.title_import as objecto, d.title as tipointervencao,\n"),RemoteObject.createImmutable("														e.title as tecnico, f.title as tipoobjecto,\n"),RemoteObject.createImmutable("														ifnull(g1.address,'')||ifnull(g1.address2,'')||', '||g1.postalcode||' '||g1.`local` as morada1,\n"),RemoteObject.createImmutable("														ifnull(h1.title,'')||','||ifnull(i1.title, '') as concelhodistrito1,\n"),RemoteObject.createImmutable("														ifnull(g1.latitude,'')||', '||ifnull(g1.longitude,'') as georef1,\n"),RemoteObject.createImmutable("														\n"),RemoteObject.createImmutable("														ifnull(g2.address,'')||ifnull(g2.address2,'')||', '||g2.postalcode, ' ', g2.`local` as morada2,\n"),RemoteObject.createImmutable("														ifnull(h2.title,'')||','||ifnull(i2.title, '') as concelhodistrito2,\n"),RemoteObject.createImmutable("														ifnull(g2.latitude,'')||', '||ifnull(g2.longitude,'') as georef2,\n"),RemoteObject.createImmutable("														\n"),RemoteObject.createImmutable("														ifnull(g3.address,'')||ifnull(g3.address2,'')||', '||g3.postalcode||' '||g3.`local` as morada3,\n"),RemoteObject.createImmutable("														ifnull(h3.title,'')||','||ifnull(i3.title, '') as concelhodistrito3,\n"),RemoteObject.createImmutable("														ifnull(g3.latitude,'')||', '||ifnull(g3.longitude,'') as georef3\n"),RemoteObject.createImmutable("													from :CLIENTDB.dta_requests as a\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_objects as b on (b.tagcode=a.entity_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_objects as c on (c.tagcode=a.object_tagcode)\n"),RemoteObject.createImmutable("													inner join :CLIENTDB.dta_typerequests as d on (d.tagcode=a.typerequest_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_technicals as e on (e.tagcode=a.technical_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_objecttypes as f on (f.tagcode=c.object_type)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_locations as g1 on (g1.tagcode=a.local_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_counties as h1 on (h1.tagcode=g1.county_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_districts as i1 on (i1.tagcode=g1.district_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_locations as g2 on (g2.tagcode=c.local_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_counties as h2 on (h2.tagcode=g2.county_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_districts as i2 on (i2.tagcode=g2.district_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_locations as g3 on (g3.tagcode=b.local_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_counties as h3 on (h3.tagcode=g3.county_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_districts as i3 on (i3.tagcode=g3.district_tagcode)\n"),RemoteObject.createImmutable("													where 1=1\n"),RemoteObject.createImmutable("													and a.execute_date BETWEEN date('now') AND date('now','+:DAYSCHECK days') \n"),RemoteObject.createImmutable("													) as x\n"),RemoteObject.createImmutable("													where 1=1\n"),RemoteObject.createImmutable("													and ifnull(x.tagcode,'')||ifnull(x.execute_date,'')||ifnull(x.execute_start,'')|| \n"),RemoteObject.createImmutable("													ifnull(x.reference,'')||ifnull(x.entidade,'')||ifnull(x.objecto,'')||ifnull(x.tipointervencao,'')||\n"),RemoteObject.createImmutable("													ifnull(x.tecnico,'')||ifnull(x.tipoobjecto,'')||ifnull(x.morada1,'')||ifnull(x.concelhodistrito1,'')||\n"),RemoteObject.createImmutable("													ifnull(x.georef1,'')||ifnull(x.morada2,'')||ifnull(x.concelhodistrito2,'')||ifnull(x.georef2,'')||\n"),RemoteObject.createImmutable("													ifnull(x.morada3,'')||ifnull(x.concelhodistrito3,'')||ifnull(x.georef3,'') like '%:FINDTEXT%'\n"),RemoteObject.createImmutable("													\n"),RemoteObject.createImmutable("													union\n"),RemoteObject.createImmutable("													\n"),RemoteObject.createImmutable("													select 2 as grupo, x.tagcode, x.execute_date, x.execute_start, \n"),RemoteObject.createImmutable("													x.reference, x.entidade, x.objecto, x.tipointervencao,\n"),RemoteObject.createImmutable("													x.tecnico, x.tipoobjecto, x.morada1,x.concelhodistrito1,\n"),RemoteObject.createImmutable("													x.georef1,x.morada2,x.concelhodistrito2,x.georef2,\n"),RemoteObject.createImmutable("													x.morada3,x.concelhodistrito3,x.georef3 from (\n"),RemoteObject.createImmutable("													select a.tagcode, '' as execute_date, '' as execute_start, a.reference,\n"),RemoteObject.createImmutable("														b.title_import as entidade, a.title_import as objecto, '' as tipointervencao,\n"),RemoteObject.createImmutable("													'' as tecnico, f.title as tipoobjecto,\n"),RemoteObject.createImmutable("														ifnull(g1.address,'')||ifnull(g1.address2,'')||', '||g1.postalcode||' '||g1.`local` as morada1,\n"),RemoteObject.createImmutable("														ifnull(h1.title,'')||','||ifnull(i1.title, '') as concelhodistrito1,\n"),RemoteObject.createImmutable("														ifnull(g1.latitude,'')||', '||ifnull(g1.longitude,'') as georef1,\n"),RemoteObject.createImmutable("													'' as morada2,\n"),RemoteObject.createImmutable("													'' as concelhodistrito2,\n"),RemoteObject.createImmutable("													'' as georef2,\n"),RemoteObject.createImmutable("													'' as morada3,\n"),RemoteObject.createImmutable("													'' as concelhodistrito3,\n"),RemoteObject.createImmutable("													'' as georef3\n"),RemoteObject.createImmutable("													from :CLIENTDB.dta_objects as a\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_objects as b on (b.tagcode=a.parent_tagcode)\n"),RemoteObject.createImmutable("													inner join :CLIENTDB.dta_objecttypes as f on (f.tagcode=a.object_type)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_locations as g1 on (g1.tagcode=a.local_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_counties as h1 on (h1.tagcode=g1.county_tagcode)\n"),RemoteObject.createImmutable("													left join :CLIENTDB.dta_districts as i1 on (i1.tagcode=g1.district_tagcode)\n"),RemoteObject.createImmutable("													where 1=1\n"),RemoteObject.createImmutable("													and a.active=1\n"),RemoteObject.createImmutable("													) as x\n"),RemoteObject.createImmutable("													where 1=1\n"),RemoteObject.createImmutable("													and ifnull(x.tagcode,'')||  \n"),RemoteObject.createImmutable("													ifnull(x.reference,'')||ifnull(x.entidade,'')||ifnull(x.objecto,'')||ifnull(x.tipointervencao,'')||\n"),RemoteObject.createImmutable("													ifnull(x.tecnico,'')||ifnull(x.tipoobjecto,'')||ifnull(x.morada1,'')||ifnull(x.concelhodistrito1,'')||\n"),RemoteObject.createImmutable("													ifnull(x.georef1,'') like '%:FINDTEXT%'\n"),RemoteObject.createImmutable("													\n"),RemoteObject.createImmutable("													union\n"),RemoteObject.createImmutable("													\n"),RemoteObject.createImmutable("													select 3 as grupo, x.tagcode, x.execute_date, x.execute_start, \n"),RemoteObject.createImmutable("													x.reference, x.entidade, x.objecto, x.tipointervencao,\n"),RemoteObject.createImmutable("													x.tecnico, x.tipoobjecto, x.morada1,x.concelhodistrito1,\n"),RemoteObject.createImmutable("													x.georef1,x.morada2,x.concelhodistrito2,x.georef2,\n"),RemoteObject.createImmutable("													x.morada3,x.concelhodistrito3,x.georef3 from (\n"),RemoteObject.createImmutable("													select a.tagcode, '' as execute_date, '' as execute_start, '' as reference,\n"),RemoteObject.createImmutable("														case when tr_is_model=1 then '(Agrupadora)' else '(Simples)' end as entidade, a.title as objecto, '' as tipointervencao,\n"),RemoteObject.createImmutable("													'' as tecnico, '' as tipoobjecto,\n"),RemoteObject.createImmutable("													'' as morada1,\n"),RemoteObject.createImmutable("													'' as concelhodistrito1,\n"),RemoteObject.createImmutable("													'' as georef1,\n"),RemoteObject.createImmutable("													'' as morada2,\n"),RemoteObject.createImmutable("													'' as concelhodistrito2,\n"),RemoteObject.createImmutable("													'' as georef2,\n"),RemoteObject.createImmutable("													'' as morada3,\n"),RemoteObject.createImmutable("													'' as concelhodistrito3,\n"),RemoteObject.createImmutable("													'' as georef3\n"),RemoteObject.createImmutable("													from :CLIENTDB.dta_typerequests as a\n"),RemoteObject.createImmutable("													where 1=1\n"),RemoteObject.createImmutable("													and a.active=1\n"),RemoteObject.createImmutable("													) as x\n"),RemoteObject.createImmutable("													where 1=1\n"),RemoteObject.createImmutable("													and ifnull(x.tagcode,'')||ifnull(x.objecto,'') like '%:FINDTEXT%'\n"),RemoteObject.createImmutable("													) as y\n"),RemoteObject.createImmutable("													group by y.grupo, y.execute_date, y.execute_start, y.objecto\n"),RemoteObject.createImmutable("													")));
 //BA.debugLineNum = 118;BA.debugLine="Public Const EVC_SQL_GETDISTRICTS As String = $\"s";
dbstructures._evc_sql_getdistricts = (RemoteObject.createImmutable("select tagcode, title, country_id from dta_districts order by title"));
 //BA.debugLineNum = 119;BA.debugLine="Public Const EVC_SQL_GETCOUNTIES As String = $\"se";
dbstructures._evc_sql_getcounties = (RemoteObject.createImmutable("select tagcode, title, country_id, district_tagcode from dta_counties order by title"));
 //BA.debugLineNum = 120;BA.debugLine="Public Const SQL_DATA_TASK_GROUPS As String = $\"S";
dbstructures._sql_data_task_groups = (RemoteObject.createImmutable("SELECT id, tagcode, title as tagdesc, '#ffffff' as color FROM dta_tpr_groups WHERE active=1"));
 //BA.debugLineNum = 121;BA.debugLine="Public Const SQL_DATA_TASK_REQUESTS As String = $";
dbstructures._sql_data_task_requests = (RemoteObject.createImmutable("SELECT id, tagcode, title as tagdesc, '#ffffff' as color FROM dta_typerequests WHERE active=1"));
 //BA.debugLineNum = 123;BA.debugLine="Public Const SQL_DATA_TYPE_PRIORITY As String = $";
dbstructures._sql_data_type_priority = (RemoteObject.createImmutable("SELECT id, tagcode, tagdesc, color from type_prioritytypes"));
 //BA.debugLineNum = 124;BA.debugLine="Public Const SQL_DATA_TYPE_URGENCY As String = $\"";
dbstructures._sql_data_type_urgency = (RemoteObject.createImmutable("SELECT id, tagcode, tagdesc, color from type_gravitytypes"));
 //BA.debugLineNum = 125;BA.debugLine="Public Const SQL_DATA_TYPE_ASMODES As String = $\"";
dbstructures._sql_data_type_asmodes = (RemoteObject.createImmutable("SELECT id, tagcode, tagdesc, color from type_asmodetypes"));
 //BA.debugLineNum = 126;BA.debugLine="Public Const SQL_DATA_TYPE_ASTYPES As String = $\"";
dbstructures._sql_data_type_astypes = (RemoteObject.createImmutable("SELECT id, tagcode, title as tagdesc, '#ffffff' as color from dta_actiontypes where active=1"));
 //BA.debugLineNum = 127;BA.debugLine="Public Const SQL_DATA_TYPE_ASSTATUS As String = $";
dbstructures._sql_data_type_asstatus = (RemoteObject.createImmutable("SELECT id, tagcode, tagdesc, color from type_operationtypes"));
 //BA.debugLineNum = 129;BA.debugLine="Public Const SQL_DATA_OBJECT_TYPE As String = $\"S";
dbstructures._sql_data_object_type = (RemoteObject.createImmutable("SELECT id, tagcode, title as tagdesc, '#ffffff' as color FROM dta_objecttypes WHERE active=1"));
 //BA.debugLineNum = 130;BA.debugLine="Public Const SQL_DATA_OBJECT_GROUP As String = $\"";
dbstructures._sql_data_object_group = (RemoteObject.createImmutable("SELECT id, objtyp_tagcode, tagcode, title as tagdesc, '#ffffff' as color FROM dta_objecttypes_groups WHERE active=1"));
 //BA.debugLineNum = 132;BA.debugLine="Public Const SQL_GETCONFIG_DATA As String = \"SELE";
dbstructures._sql_getconfig_data = BA.ObjectToString("SELECT instance, authorization, version, versionid, api, confirmed, token, orientation, subdomain from config where id=1");
 //BA.debugLineNum = 133;BA.debugLine="Public Const SQL_GETALLVERSIONS_DATA As String =";
dbstructures._sql_getallversions_data = BA.ObjectToString("SELECT id, name from versions");
 //BA.debugLineNum = 135;BA.debugLine="Public Const SQL_GETREQUESTS_DATA_NEW As String =";
dbstructures._sql_getrequests_data_new = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.id, a.ascbus, ifnull(a.tagcode, '') as tagcode, a.request_type, ifnull(e.title, '') as request_desc, a.status_id, ifnull(a.status_notes,'') as status_notes,\n"),RemoteObject.createImmutable("													ifnull(a.request_date, '') as request_date, ifnull(a.request_stime, '') as request_stime, ifnull(a.request_etime,'') as request_etime,\n"),RemoteObject.createImmutable("													ifnull(a.requester_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.usertagcode, '') as usertagcode,\n"),RemoteObject.createImmutable("													ifnull(b.type_tagcode,'') as type_tagcode, ifnull(b.name,'') as name, ifnull(b.reference,'') as reference,\n"),RemoteObject.createImmutable("													ifnull((select value from props2objects where object=b.tagcode and property='PRPTY_0020'), '') as nif,\n"),RemoteObject.createImmutable("													ifnull((select value from props2objects where object=b.tagcode and property='PRPTY_0021'), '') as phone,\n"),RemoteObject.createImmutable("													ifnull(b.local, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,\n"),RemoteObject.createImmutable("													ifnull(c.postal_code, '') as postal_code, ifnull(c.city, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,\n"),RemoteObject.createImmutable("													ifnull(d.title,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, a.type as RequestType, \n"),RemoteObject.createImmutable("													a.report_generated, a.report_file\n"),RemoteObject.createImmutable("													from requests as a\n"),RemoteObject.createImmutable("													inner join objects as b on (b.tagcode=a.requester_tagcode)\n"),RemoteObject.createImmutable("													left join locals as c on (c.tagcode=b.local)\n"),RemoteObject.createImmutable("													inner join type_requestsstatus as d on (d.id=a.status_id)  \n"),RemoteObject.createImmutable("													inner join type_requesttype as e on (e.tagcode=a.request_type) where 1=1 and a.type in (1,2)")));
 //BA.debugLineNum = 151;BA.debugLine="Public Const EVC_SQL_GETCURRENT_REQEST As String";
dbstructures._evc_sql_getcurrent_reqest = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.id, ifnull(a.tagcode, '') as tagcode, b.title_import as cliname,\n"),RemoteObject.createImmutable("													a.typerequest_tagcode as request_type, a.status_id, ifnull(a.notes,'') as status_notes, \n"),RemoteObject.createImmutable("													ifnull(a.execute_date, '') as execute_date, ifnull(a.execute_start, '') as execute_start, ifnull(a.execute_end,'') as execute_end,\n"),RemoteObject.createImmutable("													ifnull(a.object_tagcode,'') as object_tagcode, \n"),RemoteObject.createImmutable("													ifnull(b.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,\n"),RemoteObject.createImmutable("													ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, \n"),RemoteObject.createImmutable("													ifnull(c.longitude, '') as longitude, ifnull(a.details, '') as details,\n"),RemoteObject.createImmutable("													ifnull((select distinct value from dta_objects_fields where object_tagcode=a.object_tagcode and field_tagcode='FIELD_NIF'), '') as clinif\n"),RemoteObject.createImmutable("													from dta_requests as a\n"),RemoteObject.createImmutable("													left join dta_objects as b on (b.tagcode=a.object_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations as c on (c.tagcode=b.local_tagcode)\n"),RemoteObject.createImmutable("													where 1=1")));
 //BA.debugLineNum = 165;BA.debugLine="Public Const EVC_SQL_GETPREREQUESTS_DATA_NEW As S";
dbstructures._evc_sql_getprerequests_data_new = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.id, ifnull(a.tagcode, '') as tagcode,\n"),RemoteObject.createImmutable("													a.typerequest_tagcode as request_type, ifnull(e.title, '') as request_desc, \n"),RemoteObject.createImmutable("													a.status_id, ifnull(a.notes,'') as status_notes, a.paused, a.duration, a.confirmed,\n"),RemoteObject.createImmutable("													ifnull(a.execute_date, '') as request_date, ifnull(a.execute_start, '') as request_stime, ifnull(a.execute_end,'') as request_etime,\n"),RemoteObject.createImmutable("													ifnull(a.entity_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.technical_tagcode, '') as usertagcode,\n"),RemoteObject.createImmutable("													ifnull(b.object_type,'') as type_tagcode, ifnull(b.title_import,ifnull(b.details,'')) as name, ifnull(b.reference,'') as reference,\n"),RemoteObject.createImmutable("													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_NIF'), '') as nif,\n"),RemoteObject.createImmutable("													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_PHONE'), '') as phone,\n"),RemoteObject.createImmutable("													ifnull(b.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,\n"),RemoteObject.createImmutable("													ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,\n"),RemoteObject.createImmutable("													ifnull(a.local_tagcode, '') as reqlocal_tagcode, ifnull(cc.address, '') as reqaddress, ifnull(cc.address2, '') as reqaddress2,\n"),RemoteObject.createImmutable("													ifnull(cc.postalcode, '') as reqpostal_code, ifnull(cc.`local`, '') as reqcity, ifnull(cc.latitude, '') as reqlatitude, ifnull(cc.longitude, '') as reqlongitude,\n"),RemoteObject.createImmutable("													ifnull(cc.district_tagcode, '') as reqdistrict_tagcode, ifnull(cc.region_tagcode, '') as reqregion_tagcode, ifnull(cc.county_tagcode, '') as reqcounty_tagcode,\n"),RemoteObject.createImmutable("													ifnull(d.tagdesc,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, \n"),RemoteObject.createImmutable("													ifnull(a.details, '') as details,\n"),RemoteObject.createImmutable("													case when e.tr_is_model = 1 then 1 else 2 end as RequestType, \n"),RemoteObject.createImmutable("														ifnull(a.route_tagcode, '') as route_tagcode,\n"),RemoteObject.createImmutable("														ifnull(f.title, '') as route_title,\n"),RemoteObject.createImmutable("														ifnull(a.team_tagcode, '') as team_tagcode,\n"),RemoteObject.createImmutable("														ifnull(g.title, '') as team_title,\n"),RemoteObject.createImmutable("														case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, \n"),RemoteObject.createImmutable("														ifnull(a.file_report,'') as report_file,\n"),RemoteObject.createImmutable("														a.is_favorite,\n"),RemoteObject.createImmutable("														ifnull(b2.title_import,'') as nameobject,\n"),RemoteObject.createImmutable("														ifnull(case when e.tr_is_model = 0 then\n"),RemoteObject.createImmutable("															 (SELECT title FROM dta_tasks \n"),RemoteObject.createImmutable("																WHERE tagcode IN (SELECT DISTINCT relation_tagcode FROM dta_requests_relations\n"),RemoteObject.createImmutable("																WHERE request_tagcode=a.tagcode))\n"),RemoteObject.createImmutable("														END, '') AS desctask\n"),RemoteObject.createImmutable("													from dta_requests as a\n"),RemoteObject.createImmutable("													left join dta_objects as b on (b.tagcode=a.entity_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations as c on (c.tagcode=b.local_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations as cc on (cc.tagcode=a.local_tagcode)\n"),RemoteObject.createImmutable("													left join type_statustypes as d on (d.id=a.status_id)  \n"),RemoteObject.createImmutable("													left join dta_typerequests as e on (e.tagcode=a.typerequest_tagcode) \n"),RemoteObject.createImmutable("													left join dta_routes as f on (f.tagcode=a.route_tagcode)\n"),RemoteObject.createImmutable("													left join dta_teams as g on (g.tagcode=a.team_tagcode)\n"),RemoteObject.createImmutable("													left join dta_objects as b2 on (b2.tagcode=a.object_tagcode)\n"),RemoteObject.createImmutable("													where 1=1 and (a.state_id>=1 and a.state_id<4) and (a.typerequest_tagcode<>'' and a.typerequest_tagcode is not null)")));
 //BA.debugLineNum = 209;BA.debugLine="Public Const EVC_SQL_GETREQUESTS_DATA_NEW As Stri";
dbstructures._evc_sql_getrequests_data_new = (RemoteObject.concat(RemoteObject.createImmutable("select distinct e.tr_is_model, a.id, ifnull(a.tagcode, '') as tagcode,\n"),RemoteObject.createImmutable("													a.typerequest_tagcode as request_type, ifnull(e.title, '') as request_desc, \n"),RemoteObject.createImmutable("													a.status_id, ifnull(a.notes,'') as status_notes, a.paused, a.duration, a.confirmed,\n"),RemoteObject.createImmutable("													ifnull(a.execute_date, '') as request_date, ifnull(a.execute_start, '') as request_stime, ifnull(a.execute_end,'') as request_etime,\n"),RemoteObject.createImmutable("													ifnull(a.entity_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.technical_tagcode, '') as usertagcode,\n"),RemoteObject.createImmutable("													ifnull(b.object_type,'') as type_tagcode, ifnull(b.title_import,ifnull(b.details,'')) as name, ifnull(a.reference,'') as ReqReference,\n"),RemoteObject.createImmutable("													ifnull(b.reference,'') as reference,\n"),RemoteObject.createImmutable("													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_NIF'), '') as nif,\n"),RemoteObject.createImmutable("													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_PHONE'), '') as phone,\n"),RemoteObject.createImmutable("													ifnull(b.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,\n"),RemoteObject.createImmutable("													ifnull(x.address, '') as objaddress,\n"),RemoteObject.createImmutable("													ifnull(x.address2, '') as objaddress2,\n"),RemoteObject.createImmutable("													ifnull(x.postalcode, '') as objpostalcode,\n"),RemoteObject.createImmutable("													ifnull(x.local, '') as objlocal,\n"),RemoteObject.createImmutable("													ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,\n"),RemoteObject.createImmutable("													ifnull(d.tagdesc,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, \n"),RemoteObject.createImmutable("													case when e.tr_is_model = 1 then 1 else 2 end as RequestType, 0 as repeatcounter,\n"),RemoteObject.createImmutable("													(SELECT onlyinlist FROM type_trclmodetypes WHERE tagcode=e.trcl_mode) AS onlyinlist, \n"),RemoteObject.createImmutable("													ifnull(a.route_tagcode, '') as route_tagcode,\n"),RemoteObject.createImmutable("													ifnull(f.title, '') as route_title,\n"),RemoteObject.createImmutable("													ifnull(a.team_tagcode, '') as team_tagcode,\n"),RemoteObject.createImmutable("													ifnull(g.title, '') as team_title,\n"),RemoteObject.createImmutable("													case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, \n"),RemoteObject.createImmutable("													ifnull(a.file_report,'') as report_file,\n"),RemoteObject.createImmutable("													a.is_favorite, ifnull(a.execute_enddate, '') as execute_enddate, ifnull(a.execute_date, '') as execute_date, \n"),RemoteObject.createImmutable("													b2.tagcode as nameobject2,\n"),RemoteObject.createImmutable("													ifnull(j2.title, '') as techname, ifnull(j2.reference, '') as technumber, ifnull(j2.jobtitle, '') as jobtitle, \n"),RemoteObject.createImmutable("													ifnull(b2.title_import,'') as nameobject,\n"),RemoteObject.createImmutable("													ifnull(case when e.tr_is_model = 0 then\n"),RemoteObject.createImmutable("														IFNULL(\n"),RemoteObject.createImmutable("														(SELECT distinct inner_title FROM dta_requests_relations \n"),RemoteObject.createImmutable("															WHERE request_tagcode=a.tagcode  LIMIT 1)\n"),RemoteObject.createImmutable("														, \n"),RemoteObject.createImmutable("														 (SELECT title FROM dta_tasks \n"),RemoteObject.createImmutable("															WHERE tagcode IN (SELECT DISTINCT relation_tagcode FROM dta_requests_relations\n"),RemoteObject.createImmutable("															WHERE request_tagcode=a.tagcode)  LIMIT 1))\n"),RemoteObject.createImmutable("													END, '') AS desctask, ifnull(a1.fieldval_01,0) as fieldval_01, ifnull(a1.fieldval_05,0) as fieldval_05, ifnull(a1.fieldref_01,'') as fieldref_01,\n"),RemoteObject.createImmutable("													a1.repeated as force_group_request\n"),RemoteObject.createImmutable("													from dta_requests as a\n"),RemoteObject.createImmutable("													left join dta_requests_adds as a1 on (a1.request_tagcode=a.tagcode)\n"),RemoteObject.createImmutable("													inner join dta_objects as b on (b.tagcode=a.entity_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations as c on (c.tagcode=b.local_tagcode)\n"),RemoteObject.createImmutable("													inner join type_statustypes as d on (d.id=a.status_id)  \n"),RemoteObject.createImmutable("													inner join dta_typerequests as e on (e.tagcode=a.typerequest_tagcode) \n"),RemoteObject.createImmutable("													left join dta_routes as f on (f.tagcode=a.route_tagcode)\n"),RemoteObject.createImmutable("													left join dta_teams as g on (g.tagcode=a.team_tagcode)\n"),RemoteObject.createImmutable("													left join dta_objects as b2 on (b2.tagcode=a.object_tagcode)\n"),RemoteObject.createImmutable("													left join dta_technicals As j2 on (j2.tagcode= a.object_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations as x on (x.tagcode=b2.local_tagcode)\n"),RemoteObject.createImmutable("													where 1=1 and a.state_id=4 ")));
 //BA.debugLineNum = 263;BA.debugLine="Public Const EVC_SQL_GETREQUESTS_DATA_TASKS As St";
dbstructures._evc_sql_getrequests_data_tasks = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.id, ifnull(a.tagcode, '') as tagcode,\n"),RemoteObject.createImmutable("													a.typerequest_tagcode as request_type, \n"),RemoteObject.createImmutable("													ifnull(e.title, ifnull(g.title, '')) as request_desc, \n"),RemoteObject.createImmutable("													ifnull(g.title, ifnull(e.title, '')) as task_desc,\n"),RemoteObject.createImmutable("													a.status_id, ifnull(a.notes,'') as status_notes, \n"),RemoteObject.createImmutable("													z.paused, z.is_paused, z.duration, z.track,\n"),RemoteObject.createImmutable("													ifnull(a.execute_date, '') as request_date, \n"),RemoteObject.createImmutable("													ifnull(a.execute_start, '') as request_stime, \n"),RemoteObject.createImmutable("													ifnull(a.execute_end,'') as request_etime,\n"),RemoteObject.createImmutable("													ifnull(a.entity_tagcode,'') as requester_tagcode, \n"),RemoteObject.createImmutable("													ifnull(a.object_tagcode,'') as object_tagcode, \n"),RemoteObject.createImmutable("													ifnull(a.technical_tagcode, '') as usertagcode,\n"),RemoteObject.createImmutable("													ifnull(b.object_type,'') as type_tagcode, \n"),RemoteObject.createImmutable("													ifnull(z.object_tagcode,'') as object_tagcode_rel, \n"),RemoteObject.createImmutable("													ifnull(b2.object_type,'') as object_type, \n"),RemoteObject.createImmutable("													ifnull(b3.object_type,'') as object_type_rel,\n"),RemoteObject.createImmutable("													case when b.tagcode = '__NONE__' or b.tagcode = 'OBJECT_DESIGNATE'   \n"),RemoteObject.createImmutable("													then ifnull(z.inner_title,ifnull(b.title_import, ifnull(b.details,''))) \n"),RemoteObject.createImmutable("													else ifnull(b.title_import,ifnull(z.inner_title, ifnull(b.details,''))) end as name, \n"),RemoteObject.createImmutable("													ifnull(b.reference,'') as reference,\n"),RemoteObject.createImmutable("													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_NIF'), '') as nif,\n"),RemoteObject.createImmutable("													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_PHONE'), '') as phone,\n"),RemoteObject.createImmutable("													ifnull(b.local_tagcode, '') as local_tagcode, \n"),RemoteObject.createImmutable("													ifnull(c1.address, ifnull(c.address, '')) as address, \n"),RemoteObject.createImmutable("													ifnull(c1.address2, ifnull(c.address2, '')) as address2,\n"),RemoteObject.createImmutable("													ifnull(c1.postalcode, ifnull(c.postalcode, '')) as postal_code, \n"),RemoteObject.createImmutable("													ifnull(c1.`local`, ifnull(c.`local`, '')) as city, \n"),RemoteObject.createImmutable("													ifnull(c1.latitude, ifnull(c.latitude, '')) as latitude, \n"),RemoteObject.createImmutable("													ifnull(c1.longitude, ifnull(c.longitude, '')) as longitude,\n"),RemoteObject.createImmutable("													ifnull(d.tagdesc,'') as status_desc, \n"),RemoteObject.createImmutable("													ifnull(d.color, 'GRAY') as status_color, \n"),RemoteObject.createImmutable("													'' as contact_name, \n"),RemoteObject.createImmutable("													'' as contact_phone, \n"),RemoteObject.createImmutable("													case when e.tr_is_model = 1 then 1 else 2 end as RequestType, \n"),RemoteObject.createImmutable("													(SELECT onlyinlist FROM type_trclmodetypes WHERE tagcode=e.trcl_mode) AS onlyinlist,\n"),RemoteObject.createImmutable("													case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, ifnull(a.file_report,'') as report_file,\n"),RemoteObject.createImmutable("													ifnull(z.inner_title, CASE WHEN z.type_relation = 1 THEN ifnull(e.title,'') ELSE ifnull(g.title,'') END) as task_name,\n"),RemoteObject.createImmutable("													case when z.type_relation = 1 then 1 else 2 end as type, \n"),RemoteObject.createImmutable("													'' as parent_action, \n"),RemoteObject.createImmutable("													0 as level, \n"),RemoteObject.createImmutable("													z.repeatcounter,\n"),RemoteObject.createImmutable("													ifnull(z.request_tagcode, '') as request_tagcode,\n"),RemoteObject.createImmutable("													'' as item_tagcode, \n"),RemoteObject.createImmutable("													'' as uniquekey, \n"),RemoteObject.createImmutable("													'' as inner_tagcode,\n"),RemoteObject.createImmutable("													g.task_close_mode as close_type, \n"),RemoteObject.createImmutable("													ifnull(h.id, 0) as result_type, \n"),RemoteObject.createImmutable("													ifnull(g.result_composed, '') as result_values, \n"),RemoteObject.createImmutable("													e.title as tipo_objecto,\n"),RemoteObject.createImmutable("													e.title as tipo_intervencao, \n"),RemoteObject.createImmutable("													ifnull(a.notes, '') as notes, \n"),RemoteObject.createImmutable("													ifnull(a.notes, '') as request_obs,\n"),RemoteObject.createImmutable("													ifnull(z.relation_tagcode,'') as action_tagcode, \n"),RemoteObject.createImmutable("													ifnull(z.relation_tagcode,'') as task_tagcode,\n"),RemoteObject.createImmutable("													z.position, z.status_id as rel_status_id, \n"),RemoteObject.createImmutable("													ifnull(d1.tagdesc,'') as rel_status_desc, \n"),RemoteObject.createImmutable("													ifnull(z.run_start,'') as run_start, \n"),RemoteObject.createImmutable("													ifnull(z.run_end,'') as run_end, z.run_time,\n"),RemoteObject.createImmutable("													ifnull(z.inner_title, ifnull(b3.title_import,ifnull(b2.title_import,''))) as nameobject,\n"),RemoteObject.createImmutable("													ifnull(b2.title_import,'') as objectname, \n"),RemoteObject.createImmutable("													ifnull(b2.tagcode,'') as objecttagcode\n"),RemoteObject.createImmutable("													from dta_requests_relations as z \n"),RemoteObject.createImmutable("													inner join dta_requests as a on (a.tagcode=z.request_tagcode)\n"),RemoteObject.createImmutable("													left join dta_objects as b on (b.tagcode=a.entity_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations as c on (c.tagcode=b.local_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations as c1 on (c1.tagcode=a.local_tagcode)\n"),RemoteObject.createImmutable("													left join type_statustypes as d on (d.id=a.status_id)  \n"),RemoteObject.createImmutable("													left join type_statustypes as d1 on (d1.id=z.status_id)  \n"),RemoteObject.createImmutable("													left join dta_typerequests as e on (e.tagcode=a.typerequest_tagcode)  \n"),RemoteObject.createImmutable("													left join dta_tasks as g on (g.tagcode= z.relation_tagcode)\n"),RemoteObject.createImmutable("													left join type_resulttypes as h on (h.tagcode= g.type_results)\n"),RemoteObject.createImmutable("													left join dta_objects as b3 on (b3.tagcode=z.object_tagcode)\n"),RemoteObject.createImmutable("													left join dta_objects as b2 on (b2.tagcode=a.object_tagcode)\n"),RemoteObject.createImmutable("													where 1=1")));
 //BA.debugLineNum = 339;BA.debugLine="Public Const EVC_SQL_GETREQUESTS_DATA_TASKS_REP A";
dbstructures._evc_sql_getrequests_data_tasks_rep = (RemoteObject.concat(RemoteObject.createImmutable("Select distinct z1.repeated, a.id, ifnull(a.tagcode, '') as tagcode,\n"),RemoteObject.createImmutable("								a.typerequest_tagcode As request_type, ifnull(e.title, '') as request_desc, \n"),RemoteObject.createImmutable("								a.status_id, ifnull(a.notes,'') as status_notes, z.relation_tagcode, \n"),RemoteObject.createImmutable("								ifnull(a.execute_date, '') as request_date, ifnull(a.execute_start, '') as request_stime, ifnull(a.execute_end,'') as request_etime,\n"),RemoteObject.createImmutable("								ifnull(a.entity_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.technical_tagcode, '') as usertagcode,\n"),RemoteObject.createImmutable("								ifnull(b.object_type,'') as type_tagcode, ifnull(b.title_import,ifnull(b.details,'')) as name, ifnull(b.reference,ifnull(b2.reference,'')) as reference,\n"),RemoteObject.createImmutable("								ifnull((Select value from dta_objects_fields where object_tagcode=b.tagcode And field_tagcode='FIELD_NIF'), '') as nif,\n"),RemoteObject.createImmutable("								ifnull((Select value from dta_objects_fields where object_tagcode=b.tagcode And field_tagcode='FIELD_PHONE'), '') as phone,\n"),RemoteObject.createImmutable("								ifnull(b2.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,\n"),RemoteObject.createImmutable("								ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,					\n"),RemoteObject.createImmutable("								ifnull(d.tagdesc,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, \n"),RemoteObject.createImmutable("								Case when e.tr_is_model = 1 Then 1 Else 2 end as RequestType, \n"),RemoteObject.createImmutable("								Case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, ifnull(a.file_report,'') as report_file,\n"),RemoteObject.createImmutable("								ifnull(g.title, e.title) as task_name,\n"),RemoteObject.createImmutable("								Case when z.type_relation = 1 Then 1 Else 2 end as Type, \n"),RemoteObject.createImmutable("								'' as parent_action, 0 as level, ifnull(b2.title_import,'') as objectname, z.repeatcounter,\n"),RemoteObject.createImmutable("								ifnull(z.request_tagcode, '') as request_tagcode,\n"),RemoteObject.createImmutable("								'' as item_tagcode, '' as uniquekey, '' as inner_tagcode,\n"),RemoteObject.createImmutable("								g.task_close_mode As close_type, ifnull(h.id, 0) As result_type, ifnull(g.result_composed, '') as result_values, \n"),RemoteObject.createImmutable("								e.title As tipo_objecto, e.title As tipo_intervencao, ifnull(a.notes, '') as notes, \n"),RemoteObject.createImmutable("								ifnull(z.request_obs, ifnull(a.request_obs, '')) as request_obs,\n"),RemoteObject.createImmutable("								ifnull(z.relation_tagcode,'') as action_tagcode, ifnull(z.relation_tagcode,'') as task_tagcode,\n"),RemoteObject.createImmutable("								z.position, z.status_id as task_status_id, \n"),RemoteObject.createImmutable("								ifnull(z.run_date,ifnull(a.run_date,'')) as run_date, \n"),RemoteObject.createImmutable("								ifnull(z.run_start,ifnull(a.run_start,'')) as run_start, \n"),RemoteObject.createImmutable("								ifnull(z.run_end,ifnull(a.run_end,'')) as run_end, \n"),RemoteObject.createImmutable("								ifnull(z.run_time,ifnull(a.run_time,'')) as run_time,   \n"),RemoteObject.createImmutable("								ifnull(a.run_start,'')  as req_run_start, \n"),RemoteObject.createImmutable("								ifnull(a.run_end,'') as req_run_end, \n"),RemoteObject.createImmutable("								j.title As username, a.reference as reqreference,\n"),RemoteObject.createImmutable("								ifnull(j1.title, ifnull(j.title, '')) As sessusername, \n"),RemoteObject.createImmutable("								z.sess_user, z.points, j2a.title as sessusername2,\n"),RemoteObject.createImmutable("								ifnull((select value from dta_objects_fields where object_tagcode=a.entity_tagcode AND field_tagcode='FIELD_CONTRATO'), '') as contracto,\n"),RemoteObject.createImmutable("								ifnull(z.inner_title, ifnull(b3.title_import,ifnull(b2.title_import,ifnull(b2.details,'')))) as nameobject,\n"),RemoteObject.createImmutable("								ifnull(j2.title, '') as techname, ifnull(j2.reference, '') as technumber, ifnull(j2.jobtitle, '') as jobtitle, j3.title as department\n"),RemoteObject.createImmutable("								from dta_requests_relations As z \n"),RemoteObject.createImmutable("								inner join dta_requests As a on (a.tagcode=z.request_tagcode)\n"),RemoteObject.createImmutable("								inner join dta_objects As b on (b.tagcode=a.entity_tagcode)\n"),RemoteObject.createImmutable("								inner join type_statustypes As d on (d.id=a.status_id)  \n"),RemoteObject.createImmutable("								inner join dta_typerequests_tasks as z1 on (z1.typerequest_tagcode=a.typerequest_tagcode and z1.task_tagcode=z.relation_tagcode)\n"),RemoteObject.createImmutable("								left join dta_typerequests As e on (e.tagcode=a.typerequest_tagcode) \n"),RemoteObject.createImmutable("								left join dta_tasks As g on (g.tagcode= z.relation_tagcode)\n"),RemoteObject.createImmutable("								left join type_resulttypes As h on (h.tagcode= g.type_results)\n"),RemoteObject.createImmutable("								left join dta_technicals As j on (j.tagcode= a.technical_tagcode)\n"),RemoteObject.createImmutable("								left join dta_objects as b3 on (b3.tagcode=z.object_tagcode)\n"),RemoteObject.createImmutable("								left join dta_objects as b2 on (b2.tagcode=a.object_tagcode)\n"),RemoteObject.createImmutable("								left join dta_locations As c on (c.tagcode=b2.local_tagcode)\n"),RemoteObject.createImmutable("								left join dta_technicals As j1 on (j1.tagcode= z.sess_user)\n"),RemoteObject.createImmutable("								left join dta_technicals As j2 on (j2.tagcode= a.object_tagcode)\n"),RemoteObject.createImmutable("								left join dta_technicals As j2a on (j2a.tagcode= a.sess_user)\n"),RemoteObject.createImmutable("								left join dta_departments As j3 on (j3.tagcode in (select distinct tagcode from dta_departments_relations where relation_tagcode=j2.tagcode limit 1))\n"),RemoteObject.createImmutable("								where 1=1")));
 //BA.debugLineNum = 393;BA.debugLine="Public Const EVC_SQL_GETREQUESTS_DATA_TASKS_TAGS";
dbstructures._evc_sql_getrequests_data_tasks_tags = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.request_tagcode from dta_requests_relations as a\n"),RemoteObject.createImmutable("													inner join dta_requests as a1 on (a.request_tagcode=a1.tagcode)\n"),RemoteObject.createImmutable("													inner join dta_objects as b on (b.tagcode=a1.entity_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations as c on (c.tagcode=a1.local_tagcode)\n"),RemoteObject.createImmutable("													inner join type_statustypes as d on (d.id=a.status_id)\n"),RemoteObject.createImmutable("													inner join dta_tasks as e on (e.tagcode=a.relation_tagcode)")));
 //BA.debugLineNum = 402;BA.debugLine="Public Const SQL_GETREQUESTS_CURRENT_TASK As Stri";
dbstructures._sql_getrequests_current_task = (RemoteObject.createImmutable("select distinct a.* from requests_tasks as a where 1=1 "));
 //BA.debugLineNum = 403;BA.debugLine="Public Const EVC_SQL_GETREQUESTS_CURRENT_TASK As";
dbstructures._evc_sql_getrequests_current_task = (RemoteObject.createImmutable("select distinct a.* from dta_requests_relations as a where 1=1 "));
 //BA.debugLineNum = 405;BA.debugLine="Public Const SQL_GETREQUESTS_CURRENT As String =";
dbstructures._sql_getrequests_current = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, a.ascbus, ifnull(a.tagcode, '') as tagcode, a.request_type, ifnull(e.title, '') as request_desc, a.status_id, ifnull(a.status_notes,'') as status_notes,\n"),RemoteObject.createImmutable("													ifnull(a.request_date, '') as request_date, ifnull(a.request_stime, '') as request_stime, ifnull(a.request_etime,'') as request_etime,\n"),RemoteObject.createImmutable("													ifnull(a.requester_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.usertagcode, '') as usertagcode,\n"),RemoteObject.createImmutable("													ifnull(b.type_tagcode,'') as type_tagcode, ifnull(b.name,'') as name, ifnull(b.reference,'') as reference,\n"),RemoteObject.createImmutable("													ifnull((select value from props2objects where object=b.tagcode and property='PRPTY_0020'), '') as nif,\n"),RemoteObject.createImmutable("													ifnull((select value from props2objects where object=b.tagcode and property='PRPTY_0021'), '') as phone,\n"),RemoteObject.createImmutable("													ifnull(b.local, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,\n"),RemoteObject.createImmutable("													ifnull(c.postal_code, '') as postal_code, ifnull(c.city, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,\n"),RemoteObject.createImmutable("													ifnull(d.title,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, a.type as RequestType,\n"),RemoteObject.createImmutable("													a.run_date, a.run_start, a.run_end, a.run_time, n.points, a.risk,\n"),RemoteObject.createImmutable("													n.close_type, n.result_type, n.result_values, a.report_generated, a.report_file\n"),RemoteObject.createImmutable("													from requests as a\n"),RemoteObject.createImmutable("													inner join requests_tasks as n on (n.request_tagcode=a.tagcode)\n"),RemoteObject.createImmutable("													inner join objects as b on (b.tagcode=a.requester_tagcode)\n"),RemoteObject.createImmutable("													left join locals as c on (c.tagcode=b.local)\n"),RemoteObject.createImmutable("													inner join type_requestsstatus as d on (d.id=a.status_id)  \n"),RemoteObject.createImmutable("													inner join type_requesttype as e on (e.tagcode=a.request_type) where 1=1 ")));
 //BA.debugLineNum = 424;BA.debugLine="Public Const EVC_SQL_GETREQUESTS_CURRENT As Strin";
dbstructures._evc_sql_getrequests_current = (RemoteObject.concat(RemoteObject.createImmutable("Select distinct a.id, ifnull(a.tagcode, '') as tagcode,\n"),RemoteObject.createImmutable("													a.typerequest_tagcode As request_type, ifnull(e.title, '') as request_desc, \n"),RemoteObject.createImmutable("													a.status_id, ifnull(a.notes,'') as status_notes,\n"),RemoteObject.createImmutable("													ifnull(a.execute_date, '') as request_date, ifnull(a.execute_start, '') as request_stime, ifnull(a.execute_end,'') as request_etime,\n"),RemoteObject.createImmutable("													ifnull(a.entity_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.technical_tagcode, '') as usertagcode,\n"),RemoteObject.createImmutable("													ifnull(b.object_type,'') as type_tagcode, ifnull(b.title_import,ifnull(b.details,'')) as name, ifnull(b.reference,'') as reference,\n"),RemoteObject.createImmutable("													ifnull((Select value from dta_objects_fields where object_tagcode=b.tagcode And field_tagcode='FIELD_NIF'), '') as nif,\n"),RemoteObject.createImmutable("													ifnull((Select value from dta_objects_fields where object_tagcode=b.tagcode And field_tagcode='FIELD_PHONE'), '') as phone,\n"),RemoteObject.createImmutable("													ifnull(b.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,\n"),RemoteObject.createImmutable("													ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,\n"),RemoteObject.createImmutable("													ifnull(d.tagdesc,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, \n"),RemoteObject.createImmutable("													Case when e.tr_is_model = 1 Then 1 Else 2 end as RequestType,  n.repeatcounter,\n"),RemoteObject.createImmutable("													a.run_date, a.points, a.risk,\n"),RemoteObject.createImmutable("													ifnull(n.run_start,ifnull(a.run_start,'')) as run_start, \n"),RemoteObject.createImmutable("													ifnull(n.run_end,ifnull(a.run_end,'')) as run_end, ifnull(n.run_time,ifnull(a.run_time,'')) as run_time,\n"),RemoteObject.createImmutable("													n.run_enddate,\n"),RemoteObject.createImmutable("													n1.task_close_mode As close_type, n2.id As result_type, n1.result_composed As result_values,\n"),RemoteObject.createImmutable("													Case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, ifnull(a.file_report,'') as report_file	\n"),RemoteObject.createImmutable("													from dta_requests As a\n"),RemoteObject.createImmutable("													inner join dta_requests_relations As n on (n.request_tagcode=a.tagcode)\n"),RemoteObject.createImmutable("													inner join dta_tasks As n1 on (n1.tagcode=n.relation_tagcode)\n"),RemoteObject.createImmutable("													inner join dta_objects As b on (b.tagcode=a.entity_tagcode)\n"),RemoteObject.createImmutable("													left join dta_locations As c on (c.tagcode=b.local_tagcode)\n"),RemoteObject.createImmutable("													inner join type_statustypes As d on (d.id=a.status_id)  \n"),RemoteObject.createImmutable("													inner join dta_typerequests As e on (e.tagcode=a.typerequest_tagcode) \n"),RemoteObject.createImmutable("													left join type_resulttypes As n2 on (n2.tagcode=n1.type_results)\n"),RemoteObject.createImmutable("													where 1=1")));
 //BA.debugLineNum = 452;BA.debugLine="Public Const SQL_KPIALL_STATUS As String = $\"sele";
dbstructures._sql_kpiall_status = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.status_desc, b.color as status_color, a.status_id, count(a.status_id) as counter\n"),RemoteObject.createImmutable("													from requests as a\n"),RemoteObject.createImmutable("													inner join type_requestsstatus as b on (b.id=a.status_id)\n"),RemoteObject.createImmutable("													group by a.status_id order by a.status_id")));
 //BA.debugLineNum = 457;BA.debugLine="Public Const EVC_SQL_KPIALL_STATUS As String = $\"";
dbstructures._evc_sql_kpiall_status = (RemoteObject.concat(RemoteObject.createImmutable("select distinct b.tagdesc as status_desc, b.color as status_color, a.status_id, count(a.status_id) as counter\n"),RemoteObject.createImmutable("													from dta_requests as a\n"),RemoteObject.createImmutable("													inner join type_statustypes as b on (b.id=a.status_id) ")));
 //BA.debugLineNum = 461;BA.debugLine="Public Const SQL_CURRENT_ADDRESS_TYPES As String";
dbstructures._sql_current_address_types = (RemoteObject.createImmutable("select distinct title from type_locals order by id"));
 //BA.debugLineNum = 463;BA.debugLine="Public Const SQL_CURRENT_CONTACT_TYPES As String";
dbstructures._sql_current_contact_types = (RemoteObject.createImmutable("select distinct title from type_contacts order by id"));
 //BA.debugLineNum = 464;BA.debugLine="Public Const EVC_SQL_CURRENT_CONTACT_TYPES As Str";
dbstructures._evc_sql_current_contact_types = (RemoteObject.createImmutable("select distinct tagdesc from type_contacttypes order by id"));
 //BA.debugLineNum = 466;BA.debugLine="Public Const SQL_CURRENT_CONTACTS As String = $\"s";
dbstructures._sql_current_contacts = (RemoteObject.concat(RemoteObject.createImmutable("select a.type, a.ascbus, a.tagcode, a.name, a.title, a.phone, a.email, b.title as typedesc \n"),RemoteObject.createImmutable("													from contacts as a left join type_contacts as b on (b.id=a.type)")));
 //BA.debugLineNum = 468;BA.debugLine="Public Const EVC_SQL_CURRENT_CONTACTS As String =";
dbstructures._evc_sql_current_contacts = (RemoteObject.concat(RemoteObject.createImmutable("select b.id as type, 1 as ascbus, a.tagcode, a.name, ifnull(a.reference,'') as title, a.phone, a.email, b.tagdesc as typedesc\n"),RemoteObject.createImmutable("													from dta_contacts as a left join type_contacttypes as b on (b.tagcode=a.type_contact)")));
 //BA.debugLineNum = 471;BA.debugLine="Public Const SQL_CURRENT_OBJECTS As String = $\"se";
dbstructures._sql_current_objects = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, a.type, a.type_tagcode, b.title as typedesc, a.lastvisit, a.status_id, a.status_desc, a.status_color, a.ascbus, a.tagcode,\n"),RemoteObject.createImmutable("													a.name, a.local, a.contact_name, a.contact_phone, a.notes, a.have_contract, a.contract, a.nifnumber, a.main_contact, a.isgroup, \n"),RemoteObject.createImmutable("													a.reference, a.last_execution, a.have_scheme, a.scheme_plant, a.parent,\n"),RemoteObject.createImmutable("													c.address, ifnull(c.address2,'') as address2, c.postal_code, c.city, c.latitude, c.longitude, \n"),RemoteObject.createImmutable("													ifnull(c.region, '') region, ifnull(c.district, '') district, ifnull(c.country,0) as country,\n"),RemoteObject.createImmutable("													ifnull(d.name, '') as parent_name, ifnull(a.image, '') as image\n"),RemoteObject.createImmutable("													from objects as a\n"),RemoteObject.createImmutable("													inner join type_objects as b on (b.tagcode=a.type_tagcode)\n"),RemoteObject.createImmutable("													inner join locals as c on (c.tagcode=a.local)\n"),RemoteObject.createImmutable("													left join objects as d on (d.tagcode=a.parent)")));
 //BA.debugLineNum = 482;BA.debugLine="Public Const EVC_SQL_CURRENT_OBJECTS As String =";
dbstructures._evc_sql_current_objects = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, b.id as type, a.object_type as type_tagcode, b.title as typedesc,\n"),RemoteObject.createImmutable("													a.last_execution as lastvisit, a.active as status_id,\n"),RemoteObject.createImmutable("													ifnull(a.reference,'') as reference, ifnull(a.last_execution,'') as last_execution, 0 as have_scheme, '' as scheme_plant, \n"),RemoteObject.createImmutable("													a.parent_tagcode as parent,\n"),RemoteObject.createImmutable("													a.obs as notes,\n"),RemoteObject.createImmutable("													CASE a.active WHEN 1 THEN 'Activo' ELSE 'Inactivo' END as status_desc, \n"),RemoteObject.createImmutable("													CASE a.active WHEN 1 THEN 'GREEN' ELSE 'GRAY' END as status_color, 1 as ascbus, \n"),RemoteObject.createImmutable("													a.tagcode, ifnull(a.title_import,ifnull(a.details,'')) as name, a.local_tagcode as local, \n"),RemoteObject.createImmutable("													ifnull(c.address, '(Sem endereço)') as address, ifnull(c.address2,'') as address2, \n"),RemoteObject.createImmutable("													ifnull(c.postalcode,'(Sem C. Postal)') as postal_code, ifnull(c.local,'(Sem Localidade)') as city, \n"),RemoteObject.createImmutable("													ifnull(c.latitude,'') as latitude, ifnull(c.longitude,'') as longitude,\n"),RemoteObject.createImmutable("													ifnull(c.region_tagcode, '') region, ifnull(c.district_tagcode, '') district, \n"),RemoteObject.createImmutable("													ifnull(c.country_id,0) as country, b.isgroup,\n"),RemoteObject.createImmutable("													b.have_contracts as have_contract, '' as contact_name, '' as contact_phone, \n"),RemoteObject.createImmutable("													'' as contract, '' as nifnumber, '' as main_contact, ifnull(d.reference, '') as parent_reference,\n"),RemoteObject.createImmutable("													ifnull(d.title_import, '') as parent_name, ifnull(a.image, '') as image, ifnull(a.filename, '') as filename\n"),RemoteObject.createImmutable("													from dta_objects as a\n"),RemoteObject.createImmutable("													inner join dta_objecttypes as b on (b.tagcode=a.object_type)\n"),RemoteObject.createImmutable("													left join dta_locations as c on (c.tagcode=a.local_tagcode)\n"),RemoteObject.createImmutable("													left join dta_objects as d on (d.tagcode=a.parent_tagcode)")));
 //BA.debugLineNum = 516;BA.debugLine="Public Const EVC_SQL_CURRENT_OBJECTS_ENT As Strin";
dbstructures._evc_sql_current_objects_ent = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, b.id as type, a.object_type as type_tagcode, b.title as typedesc,\n"),RemoteObject.createImmutable("													a.last_execution as lastvisit, a.active as status_id,\n"),RemoteObject.createImmutable("													ifnull(a.reference,'') as reference, ifnull(a.last_execution,'') as last_execution, 0 as have_scheme, '' as scheme_plant, \n"),RemoteObject.createImmutable("													a.parent_tagcode as parent,\n"),RemoteObject.createImmutable("													a.obs as notes,\n"),RemoteObject.createImmutable("													CASE a.active WHEN 1 THEN 'Activo' ELSE 'Inactivo' END as status_desc, \n"),RemoteObject.createImmutable("													CASE a.active WHEN 1 THEN 'GREEN' ELSE 'GRAY' END as status_color, 1 as ascbus, \n"),RemoteObject.createImmutable("													a.tagcode, ifnull(a.title_import,ifnull(a.details,'')) as name, a.local_tagcode as local, \n"),RemoteObject.createImmutable("													ifnull(c.address, '(Sem endereço)') as address, ifnull(c.address2,'') as address2, \n"),RemoteObject.createImmutable("													ifnull(c.postalcode,'(Sem C. Postal)') as postal_code, ifnull(c.local,'(Sem Localidade)') as city, \n"),RemoteObject.createImmutable("													ifnull(c.latitude,'') as latitude, ifnull(c.longitude,'') as longitude,\n"),RemoteObject.createImmutable("													ifnull(c.region_tagcode, '') region, ifnull(c.district_tagcode, '') district, \n"),RemoteObject.createImmutable("													ifnull(c.country_id,0) as country, b.isgroup,\n"),RemoteObject.createImmutable("													b.have_contracts as have_contract, '' as contact_name, '' as contact_phone, \n"),RemoteObject.createImmutable("													'' as contract, '' as nifnumber, '' as main_contact,\n"),RemoteObject.createImmutable("													ifnull(d.title_import, '') as parent_name, ifnull(a.image, '') as image\n"),RemoteObject.createImmutable("													from dta_objects as a\n"),RemoteObject.createImmutable("													inner join dta_objecttypes as b on (b.tagcode=a.object_type)\n"),RemoteObject.createImmutable("													inner join dta_locations as c on (c.tagcode=a.local_tagcode)\n"),RemoteObject.createImmutable("													left join dta_objects as d on (d.tagcode=a.parent_tagcode) \n"),RemoteObject.createImmutable("													where 1=1")));
 //BA.debugLineNum = 538;BA.debugLine="Public Const SQL_CURRENT_OBJECTS_LOCAL As String";
dbstructures._sql_current_objects_local = (RemoteObject.createImmutable("select distinct b.city from objects as a left join locals as b on (b.tagcode=a.local) order by b.city"));
 //BA.debugLineNum = 539;BA.debugLine="Public Const EVC_SQL_CURRENT_OBJECTS_LOCAL As Str";
dbstructures._evc_sql_current_objects_local = (RemoteObject.createImmutable("select distinct ifnull(b.local,'') as city from dta_objects as a left join dta_locations as b on (b.tagcode=a.local_tagcode) order by b.local"));
 //BA.debugLineNum = 541;BA.debugLine="Public Const SQL_CURRENT_OBJECTS_TYPE As String =";
dbstructures._sql_current_objects_type = (RemoteObject.createImmutable("select distinct id, tagcode, title from type_objects order by id"));
 //BA.debugLineNum = 542;BA.debugLine="Public Const EVC_SQL_CURRENT_OBJECTS_TYPE As Stri";
dbstructures._evc_sql_current_objects_type = (RemoteObject.createImmutable("select distinct id, tagcode, title from dta_objecttypes where active=1 order by id"));
 //BA.debugLineNum = 544;BA.debugLine="Public Const SQL_CURRENT_OBJECTS_PROPERTIES As St";
dbstructures._sql_current_objects_properties = (RemoteObject.concat(RemoteObject.createImmutable("select a.*, c.title from props2objects as a\n"),RemoteObject.createImmutable("													 inner join objects as b on (b.tagcode=a.object) \n"),RemoteObject.createImmutable("													 inner join properties as c on (c.tagcode=a.property)")));
 //BA.debugLineNum = 547;BA.debugLine="Public Const EVC_QL_CURRENT_OBJECTS_PROPERTIES As";
dbstructures._evc_ql_current_objects_properties = (RemoteObject.concat(RemoteObject.createImmutable("select a.*, c.title\n"),RemoteObject.createImmutable("													from dta_objects_fields as a\n"),RemoteObject.createImmutable("													inner join dta_objects as b on (b.tagcode=a.object_tagcode) \n"),RemoteObject.createImmutable("													inner join dta_fields as c on (c.tagcode=a.field_tagcode) where 1=1 ")));
 //BA.debugLineNum = 552;BA.debugLine="Public Const EVC_QL_CURRENT_REQUEST_PROPERTIES As";
dbstructures._evc_ql_current_request_properties = (RemoteObject.concat(RemoteObject.createImmutable("select a.*, c.title, b.tagcode\n"),RemoteObject.createImmutable("													from dta_requests_fields as a\n"),RemoteObject.createImmutable("													inner join dta_requests as b on (b.tagcode=a.request_tagcode) \n"),RemoteObject.createImmutable("													inner join dta_fields as c on (c.tagcode=a.field_tagcode) where 1=1 ")));
 //BA.debugLineNum = 558;BA.debugLine="Public Const EVC_QL_CURRENT_OBJECTS_IMAGES As Str";
dbstructures._evc_ql_current_objects_images = (RemoteObject.concat(RemoteObject.createImmutable("select object_tagcode, image, filename, title, sess_user, created_at\n"),RemoteObject.createImmutable("														from dta_objects_images where 1=1 ")));
 //BA.debugLineNum = 561;BA.debugLine="Public Const SQL_ALL_CONTRACTS As String = $\"sele";
dbstructures._sql_all_contracts = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, a.ascbus, a.tagcode, a.title, a.status_id, a.status_desc, a.status_color, a.document_tagcode, a.docfilename, a.creation_date, a.valid_from,\n"),RemoteObject.createImmutable("													a.valid_to, a.duration, a.confirmdays, a.periodicity, a.periodvisits, a.hourspervisit, a.dayperiod, \n"),RemoteObject.createImmutable("													a.last_visit, a.daysweekvisit, a.daismonthvisit, a.intervention_type\n"),RemoteObject.createImmutable("													from contracts as a")));
 //BA.debugLineNum = 566;BA.debugLine="Public Const SQL_ALL_ENTITY_CONTRACTS As String =";
dbstructures._sql_all_entity_contracts = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures._sql_all_contracts))),RemoteObject.createImmutable(" inner join contracts2entities as b on (b.contract=a.tagcode) ")));
 //BA.debugLineNum = 567;BA.debugLine="Public Const SQL_ALL_OBJECT_CONTRACTS As String =";
dbstructures._sql_all_object_contracts = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures._sql_all_contracts))),RemoteObject.createImmutable(" inner join contracts2objects as b on (b.contract=a.tagcode) ")));
 //BA.debugLineNum = 570;BA.debugLine="Public Const SQL_PERIODICITY_TYPE As String = $\"s";
dbstructures._sql_periodicity_type = (RemoteObject.createImmutable("select distinct title from type_periodicity order by id"));
 //BA.debugLineNum = 571;BA.debugLine="Public Const EVC_SQL_PERIODICITY_TYPE As String =";
dbstructures._evc_sql_periodicity_type = (RemoteObject.createImmutable("select distinct tagdesc from type_periodicitytypes order by id"));
 //BA.debugLineNum = 573;BA.debugLine="Public Const SQL_DAYPERIOD_TYPE As String = $\"sel";
dbstructures._sql_dayperiod_type = (RemoteObject.createImmutable("select distinct title from type_dayperiods order by id"));
 //BA.debugLineNum = 574;BA.debugLine="Public Const EVC_SQL_DAYPERIOD_TYPE As String = $";
dbstructures._evc_sql_dayperiod_type = (RemoteObject.createImmutable("select distinct tagdesc from type_perioddaytypes order by id"));
 //BA.debugLineNum = 577;BA.debugLine="Public Const SQL_ALL_DOCUMENTS As String = $\"Sele";
dbstructures._sql_all_documents = (RemoteObject.createImmutable("Select a.*, b.title As categorytitle from documents As a left join documents_categories As b on (b.id=a.category)"));
 //BA.debugLineNum = 578;BA.debugLine="Public Const EVC_SQL_ALL_DOCUMENTS As String = $\"";
dbstructures._evc_sql_all_documents = (RemoteObject.createImmutable("Select a.*, ifnull(b.tagdesc,'') As categorytitle from dta_documents As a left join type_documenttypes As b on (b.tagcode=a.document_type)"));
 //BA.debugLineNum = 580;BA.debugLine="Public Const EVC_SQL_OBJ_DOCUMENTS As String = $\"";
dbstructures._evc_sql_obj_documents = (RemoteObject.concat(RemoteObject.createImmutable("SELECT a.tagcode, a.title, a.document_type, a.valid_from, a.valid_to, a.doc_filename from dta_documents AS a\n"),RemoteObject.createImmutable("													LEFT JOIN dta_objects_documents AS od on (od.document_tagcode = a.tagcode)\n"),RemoteObject.createImmutable("													LEFT JOIN dta_objects AS o ON (o.tagcode = od.object_tagcode)")));
 //BA.debugLineNum = 584;BA.debugLine="Public Const EVC_SQL_CURRENT_TASKS As String = $\"";
dbstructures._evc_sql_current_tasks = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, b.tagdesc, b.id as type, 1 as user_id, 1 as ascbus, a.tagcode, a.title as name, a.details,\n"),RemoteObject.createImmutable("													1 as version_id, a.version, '' as version_date, a.have_posis_numbers as include_numerators, 0 as sublevel_letters,\n"),RemoteObject.createImmutable("													a.signature_required as signingrequest, a.report_generate_required as reportgeneration, a.task_close_mode as fast_close,\n"),RemoteObject.createImmutable("													a.active, ifnull(a.updated_at, '1970-01-01') as last_update, a.cla_obs as task_obs,\n"),RemoteObject.createImmutable("													round(ifnull((julianday('now') - julianday(ifnull(a.updated_at, '1970-01-01'))), 0)) as dayslastupdate,\n"),RemoteObject.createImmutable("													a.have_results, a.result_composed\n"),RemoteObject.createImmutable("													from dta_tasks as a\n"),RemoteObject.createImmutable("													inner join type_taskstypes as b on (b.tagcode=a.task_type) where 1=1 ")));
 //BA.debugLineNum = 593;BA.debugLine="Public Const EVC_V2_SQL_CURRENT_TASKS As String =";
dbstructures._evc_v2_sql_current_tasks = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, b.tagdesc, b.id as type, 1 as user_id, 1 as ascbus, a.tagcode, a.title as name, a.details,\n"),RemoteObject.createImmutable("													1 as version_id, a.version, '' as version_date, a.have_posis_numbers as include_numerators, 0 as sublevel_letters,\n"),RemoteObject.createImmutable("													a.signature_required as signingrequest, a.report_generate_required as reportgeneration, a.task_close_mode as fast_close,\n"),RemoteObject.createImmutable("													a.active, ifnull(a.updated_at, '1970-01-01') as last_update, a.cla_obs as task_obs,\n"),RemoteObject.createImmutable("													round(ifnull((julianday('now') - julianday(ifnull(a.updated_at, '1970-01-01'))), 0)) as dayslastupdate,\n"),RemoteObject.createImmutable("													a.have_results, a.result_composed,\n"),RemoteObject.createImmutable("													a1.new_objecttype, a1.link_to_request, a1.validate_new_object, a1.update_if_exists, \n"),RemoteObject.createImmutable("													a1.show_history, a1.history_from_task\n"),RemoteObject.createImmutable("													from dta_tasks as a\n"),RemoteObject.createImmutable("													left join dta_tasks_adds as a1 on (a1.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("													inner join type_taskstypes as b on (b.tagcode=a.task_type) where 1=1 ")));
 //BA.debugLineNum = 606;BA.debugLine="Public Const WHERE_DAYSBETWEEN_CONDITION As Strin";
dbstructures._where_daysbetween_condition = (RemoteObject.createImmutable("Round(ifnull((julianday('now') - julianday(ifnull(a.last_update, '1970-01-01'))), 0))"));
 //BA.debugLineNum = 609;BA.debugLine="Public Const EVC_V1_SQL_GET_TASK_ITEMS As String";
dbstructures._evc_v1_sql_get_task_items = (RemoteObject.concat(RemoteObject.createImmutable("select distinct 0 as fieldval_05, c.title as title2, b.title as name, b.have_posis_numbers as include_numerators,\n"),RemoteObject.createImmutable("													b.connectmode, b.can_pause, b.title_override, b.time_control,\n"),RemoteObject.createImmutable("													b.generate_report, b.generate_report_list,\n"),RemoteObject.createImmutable("													b.signature_required as signingrequest, b.report_generate_required as reportgeneration, \n"),RemoteObject.createImmutable("													b.task_close_mode as fast_close, 0 as doobjectimage, a.*, c.repeatfieldcounter,\n"),RemoteObject.createImmutable("													(select count(0) as v from  dta_tasks_items_answers as d where\n"),RemoteObject.createImmutable("													d.task_tagcode=a.task_tagcode and d.item_tagcode=a.item_tagcode \n"),RemoteObject.createImmutable("													and d.unique_key=a.unique_key) as rowitems, c.repeatcounter \n"),RemoteObject.createImmutable("													from dta_tasks_items as a \n"),RemoteObject.createImmutable("													inner join dta_tasks as b on (b.tagcode=a.task_tagcode),\n"),RemoteObject.createImmutable("													dta_requests_values AS c \n"),RemoteObject.createImmutable("													where 1=1 \n"),RemoteObject.createImmutable("													and c.task_tagcode=a.task_tagcode and c.item_tagcode=a.item_tagcode and c.unique_key=a.unique_key ")));
 //BA.debugLineNum = 623;BA.debugLine="Public Const EVC_V2_SQL_GET_TASK_ITEMS As String";
dbstructures._evc_v2_sql_get_task_items = (RemoteObject.concat(RemoteObject.createImmutable("select distinct \n"),RemoteObject.createImmutable("													ifnull(e.fieldval_05, 0) as fieldval_05, \n"),RemoteObject.createImmutable("													ifnull(e.fieldval_04, 0) as fieldval_04, \n"),RemoteObject.createImmutable("													ifnull(c.title, '') as title2, \n"),RemoteObject.createImmutable("													ifnull(c.object_tagcode, '') as object_tagcode, \n"),RemoteObject.createImmutable("													ifnull(b.title, '') as name, \n"),RemoteObject.createImmutable("													ifnull(b.have_posis_numbers, '0') as include_numerators,\n"),RemoteObject.createImmutable("													ifnull(b.connectmode, '0') as connectmode, \n"),RemoteObject.createImmutable("													ifnull(b.can_pause, '0') as can_pause, \n"),RemoteObject.createImmutable("													ifnull(b.title_override, '') as title_override, \n"),RemoteObject.createImmutable("													ifnull(b.time_control, '0') as time_control,\n"),RemoteObject.createImmutable("													ifnull(b.generate_report, '') as generate_report, \n"),RemoteObject.createImmutable("													ifnull(b.generate_report_list, '') as generate_report_list,\n"),RemoteObject.createImmutable("													ifnull(b.signature_required, '0') as signingrequest, \n"),RemoteObject.createImmutable("													ifnull(b.report_generate_required, '0') as reportgeneration, \n"),RemoteObject.createImmutable("													ifnull(b.task_close_mode, '0') as fast_close, \n"),RemoteObject.createImmutable("													ifnull(a1.do_object_image, '') as doobjectimage, \n"),RemoteObject.createImmutable("													a.*,  0 as val_format, \n"),RemoteObject.createImmutable("													ifnull(c.repeatfieldcounter, '0') as repeatfieldcounter,\n"),RemoteObject.createImmutable("													ifnull((select count(0) as v from  dta_tasks_items_answers as d where\n"),RemoteObject.createImmutable("														d.task_tagcode=a.task_tagcode and d.item_tagcode=a.item_tagcode \n"),RemoteObject.createImmutable("														and d.unique_key=a.unique_key), '0') as rowitems, \n"),RemoteObject.createImmutable("													ifnull(c.repeatcounter, '0') as repeatcounter \n"),RemoteObject.createImmutable("													from dta_tasks_items as a \n"),RemoteObject.createImmutable("													left join dta_tasks_items_adds as a1 on (a1.task_tagcode=a.task_tagcode and a1.item_tagcode=a.item_tagcode and a1.unique_key=a.unique_key)\n"),RemoteObject.createImmutable("													inner join dta_tasks as b on (b.tagcode=a.task_tagcode),\n"),RemoteObject.createImmutable("													dta_requests_values AS c \n"),RemoteObject.createImmutable("													left join dta_requests_values_adds as e on (e.request_tagcode=c.request_tagcode\n"),RemoteObject.createImmutable("															and e.inner_request_tagcode=c.inner_request_tagcode\n"),RemoteObject.createImmutable("															and e.task_tagcode=c.task_tagcode \n"),RemoteObject.createImmutable("															and e.item_tagcode=c.item_tagcode\n"),RemoteObject.createImmutable("															and e.unique_key=c.unique_key\n"),RemoteObject.createImmutable("															and e.repeatcounter=c.repeatcounter\n"),RemoteObject.createImmutable("															and e.repeatfieldcounter=c.repeatfieldcounter)\n"),RemoteObject.createImmutable("													where 1=1 \n"),RemoteObject.createImmutable("													and c.task_tagcode=a.task_tagcode and c.item_tagcode=a.item_tagcode and c.unique_key=a.unique_key ")));
 //BA.debugLineNum = 672;BA.debugLine="Public Const EVC_SQL_GET_TASK_ITEMS_TWO As String";
dbstructures._evc_sql_get_task_items_two = (RemoteObject.concat(RemoteObject.createImmutable("select distinct  a.parent_tagcode \n"),RemoteObject.createImmutable("													from dta_tasks_items as a \n"),RemoteObject.createImmutable("													inner join dta_tasks as b on (b.tagcode=a.task_tagcode)\n"),RemoteObject.createImmutable("													where 1=1 ")));
 //BA.debugLineNum = 677;BA.debugLine="Public Const EVC_V1_SQL_GET_TASK_ITEMS_TWO As Str";
dbstructures._evc_v1_sql_get_task_items_two = (RemoteObject.concat(RemoteObject.createImmutable("select distinct  a.parent_tagcode\n"),RemoteObject.createImmutable("													from dta_tasks_items as a \n"),RemoteObject.createImmutable("													inner join dta_tasks as b on (b.tagcode=a.task_tagcode)\n"),RemoteObject.createImmutable("													where 1=1 ")));
 //BA.debugLineNum = 682;BA.debugLine="Public Const EVC_V2_SQL_GET_TASK_ITEMS_TWO As Str";
dbstructures._evc_v2_sql_get_task_items_two = (RemoteObject.concat(RemoteObject.createImmutable("select distinct  a.parent_tagcode\n"),RemoteObject.createImmutable("													from dta_tasks_items as a \n"),RemoteObject.createImmutable("													left join dta_tasks_items_adds as a1 on (a1.task_tagcode=a.task_tagcode and a1.item_tagcode=a.item_tagcode and a1.unique_key=a.unique_key)\n"),RemoteObject.createImmutable("													inner join dta_tasks as b on (b.tagcode=a.task_tagcode)\n"),RemoteObject.createImmutable("													where 1=1 ")));
 //BA.debugLineNum = 692;BA.debugLine="Public Const SQL_GET_TASK_RECHEIGTH As String = $";
dbstructures._sql_get_task_recheigth = (RemoteObject.createImmutable("select count(0) as items, sum(CASE WHEN a.value_type=2 THEN 70 ELSE 60 END) as total from  tasks_items as a where 1=1"));
 //BA.debugLineNum = 693;BA.debugLine="Public Const SQL_GET_TASK_RECHEIGTHGRID As String";
dbstructures._sql_get_task_recheigthgrid = (RemoteObject.createImmutable("select count(0) as items, sum(60) as total from  requests_itemsgrid as a where 1=1"));
 //BA.debugLineNum = 695;BA.debugLine="Public Const SQL_GET_TASK_WITH_INFO_VAL As String";
dbstructures._sql_get_task_with_info_val = (RemoteObject.createImmutable("select count(0) as total from tasks_items where (info is not null) and (info<>'')"));
 //BA.debugLineNum = 697;BA.debugLine="Public Const SQL_GET_TASK_RECHEIGTH_VAL As String";
dbstructures._sql_get_task_recheigth_val = (RemoteObject.createImmutable("select count(0) as items, sum(CASE WHEN a.value_type=2 THEN :V1 ELSE :V2 END) as total from  tasks_items as a where 1=1"));
 //BA.debugLineNum = 698;BA.debugLine="Public Const EVC_SQL_GET_TASK_RECHEIGTH_VAL As St";
dbstructures._evc_sql_get_task_recheigth_val = (RemoteObject.createImmutable("select count(0) as items, sum(CASE WHEN a.data_type=2 THEN :V1 ELSE :V2 END) as total from  dta_tasks_items as a where 1=1"));
 //BA.debugLineNum = 699;BA.debugLine="Public Const EVC_SQL_GET_TASK_RECHEIGTH_ITEMS As";
dbstructures._evc_sql_get_task_recheigth_items = (RemoteObject.createImmutable("select count(0) as items from  dta_tasks_items as a where 1=1"));
 //BA.debugLineNum = 703;BA.debugLine="Public Const EVC_SQL_GET_TASK_RECHEIGTH_ITEMS_SUM";
dbstructures._evc_sql_get_task_recheigth_items_sum = (RemoteObject.concat(RemoteObject.createImmutable("select sum(a.height_land) as height_land, sum(a.height_port) as height_port,\n"),RemoteObject.createImmutable("													sum(a.height_land_sp) as height_land_sp, sum(a.height_port_sp) as height_port_sp,\n"),RemoteObject.createImmutable("													count(0) as total, (SUM((select count(0) as v from  dta_tasks_items_answers as b where\n"),RemoteObject.createImmutable("													b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode \n"),RemoteObject.createImmutable("													and b.unique_key=a.unique_key))-100)*60 as totalitemsheight\n"),RemoteObject.createImmutable("													from dta_tasks_items as a where 1=1")));
 //BA.debugLineNum = 711;BA.debugLine="Public Const EVC_SQL_GET_TASK_WITH_INFO_VAL As St";
dbstructures._evc_sql_get_task_with_info_val = (RemoteObject.createImmutable("select count(0) as total from dta_tasks_items where (info_notes is not null) and (info_notes<>'')"));
 //BA.debugLineNum = 714;BA.debugLine="Public Const SQL_GET_TASK_RECHEIGTHGRID_VAL As St";
dbstructures._sql_get_task_recheigthgrid_val = (RemoteObject.createImmutable("select count(0) as items, sum(:V1) as total from  requests_itemsgrid as a where 1=1"));
 //BA.debugLineNum = 715;BA.debugLine="Public Const SQL_GET_TASK_GRIDITEMS As String = $";
dbstructures._sql_get_task_griditems = (RemoteObject.createImmutable("select * from  requests_itemsgrid as a where 1=1"));
 //BA.debugLineNum = 717;BA.debugLine="Public Const SQL_GET_TASK_ITEM_VALUE As String =";
dbstructures._sql_get_task_item_value = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.id, a.request_tagcode, a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode, a.status, \n"),RemoteObject.createImmutable("													a.value, b.val_datatype, b.val_format, a.value_options, b.conform_type, b.val_title, b.value_default, \n"),RemoteObject.createImmutable("													a.points, a.risk, a.val_min, a.val_max\n"),RemoteObject.createImmutable("													from  requests_values as a \n"),RemoteObject.createImmutable("													inner join tasks_itemsvalues as b on \n"),RemoteObject.createImmutable("													(b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey and b.tagcode=a.tagcode) \n"),RemoteObject.createImmutable("													where 1=1")));
 //BA.debugLineNum = 740;BA.debugLine="Public Const EVC_SQL_GET_TASK_ITEM_VALUE As Strin";
dbstructures._evc_sql_get_task_item_value = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.request_tagcode, a.inner_request_tagcode, a.task_tagcode, a.item_tagcode, a.unique_key,\n"),RemoteObject.createImmutable("													ifnull(a.tagcode,'') as tagcode, \n"),RemoteObject.createImmutable("													ifnull(a.execute_status, '0') as status, \n"),RemoteObject.createImmutable("													ifnull(a.execute_value_title, ifnull(b.default_value,'')) as execute_value_title, \n"),RemoteObject.createImmutable("													ifnull(a.execute_value,'') as value, \n"),RemoteObject.createImmutable("													ifnull(b.data_type,'0') as val_datatype, \n"),RemoteObject.createImmutable("													ifnull(b.icon,'') as icon, \n"),RemoteObject.createImmutable("													ifnull(b.printout_type,'') as printout_type,\n"),RemoteObject.createImmutable("													ifnull(b.data_format,'0') as val_format, \n"),RemoteObject.createImmutable("													ifnull(c.id,'0') as conform_type, \n"),RemoteObject.createImmutable("													ifnull(b.title,'') as val_title, \n"),RemoteObject.createImmutable("													ifnull(b.default_value,'') as value_default, \n"),RemoteObject.createImmutable("													ifnull(b.points,'0') as points, \n"),RemoteObject.createImmutable("													ifnull(b.risk,'0') as risk, \n"),RemoteObject.createImmutable("													ifnull(b.valmin,'0') as val_min, \n"),RemoteObject.createImmutable("													ifnull(b.valmax,'0') as val_max, \n"),RemoteObject.createImmutable("													ifnull(b.data_list,'') as value_options, \n"),RemoteObject.createImmutable("													ifnull(a.repeated,'') as repeated, \n"),RemoteObject.createImmutable("													ifnull(a.repeatcounter,'') as repeatcounter, \n"),RemoteObject.createImmutable("													ifnull(a.repeatitemcounter,'') as repeatitemcounter, \n"),RemoteObject.createImmutable("													ifnull(a.repeatfieldcounter,'') as repeatfieldcounter,  \n"),RemoteObject.createImmutable("													ifnull(a.id,'0') as id, \n"),RemoteObject.createImmutable("													ifnull(b.`position`,'0') as position,\n"),RemoteObject.createImmutable("													ifnull(a1.do_origin,'') as do_origin, \n"),RemoteObject.createImmutable("													ifnull(a1.do_origin_group,'') as do_origin_group, \n"),RemoteObject.createImmutable("													ifnull(a1.do_origin_titlefield,'') as do_origin_titlefield, \n"),RemoteObject.createImmutable("													ifnull(a1.do_tagcode,'') as do_tagcode, \n"),RemoteObject.createImmutable("													ifnull(a1.do_subgroup,'') as do_subgroup, \n"),RemoteObject.createImmutable("													ifnull(a1.do_subsubgroup,'') as do_subsubgroup, \n"),RemoteObject.createImmutable("													ifnull(a1.do_name,'') as do_name, \n"),RemoteObject.createImmutable("													ifnull(a1.do_is_additional,'') as do_is_additional, \n"),RemoteObject.createImmutable("													ifnull(a1.reference,'') as reference, \n"),RemoteObject.createImmutable("													ifnull(a.object_tagcode,'') as object_tagcode, \n"),RemoteObject.createImmutable("													ifnull(a1.do_associate_type,'') as do_associate_type, \n"),RemoteObject.createImmutable("													ifnull(a1.do_affected_table,'') as do_affected_table, \n"),RemoteObject.createImmutable("													ifnull(a1.do_affected_tagcode,'') as do_affected_tagcode,\n"),RemoteObject.createImmutable("													ifnull(a1.do_affected_field,'') as do_affected_field, \n"),RemoteObject.createImmutable("													ifnull(a1.change_title_totime,'') as change_title_totime, \n"),RemoteObject.createImmutable("													ifnull(a1.force_control,'') as force_control, \n"),RemoteObject.createImmutable("													ifnull(a1.type_control,'') as type_control, \n"),RemoteObject.createImmutable("													ifnull(a1.dependent_key,'') as dependent_key,\n"),RemoteObject.createImmutable("													ifnull(a1.can_search,'') as can_search,\n"),RemoteObject.createImmutable("													ifnull(a2.do_object_image,'') as doobjectimage, \n"),RemoteObject.createImmutable("													ifnull(a2.level3_table,'') as level3_table, \n"),RemoteObject.createImmutable("													ifnull(a2.level3_level,'') as level3_level, \n"),RemoteObject.createImmutable("													ifnull(a2.level3_tagcode,'') as level3_tagcode, \n"),RemoteObject.createImmutable("													ifnull(a2.level3_parent,'') as level3_parent, \n"),RemoteObject.createImmutable("													ifnull(a2.level3_child,'') as level3_child,\n"),RemoteObject.createImmutable("													ifnull(a2.reference,'') as adds_reference, \n"),RemoteObject.createImmutable("													ifnull(a2.object_table,'') as object_table, \n"),RemoteObject.createImmutable("													ifnull(a2.object_type_tagcode,'') as object_type_tagcode, \n"),RemoteObject.createImmutable("													ifnull(a2.object_type_group,'') as object_type_group,\n"),RemoteObject.createImmutable("													ifnull(a2.object_type_relation,'') as object_type_relation, \n"),RemoteObject.createImmutable("													ifnull(a2.object_type_parent,'') as object_type_parent, \n"),RemoteObject.createImmutable("													ifnull(a2.object_type_child,'') as object_type_child, \n"),RemoteObject.createImmutable("													ifnull(a2.object_type_addrelation,'') as object_type_addrelation,\n"),RemoteObject.createImmutable("													ifnull(a2.object_type_delrelation,'') as object_type_delrelation, \n"),RemoteObject.createImmutable("													ifnull(a2.paramters,'') as paramters\n"),RemoteObject.createImmutable("													from dta_requests_values as a \n"),RemoteObject.createImmutable("													inner join dta_tasks_items AS a1 on\n"),RemoteObject.createImmutable("													(a1.task_tagcode=a.task_tagcode and a1.item_tagcode=a.item_tagcode and a1.unique_key=a.unique_key) \n"),RemoteObject.createImmutable("													inner join dta_tasks_items_adds AS a2 on\n"),RemoteObject.createImmutable("													(a2.task_tagcode=a1.task_tagcode and a2.item_tagcode=a1.item_tagcode and a2.unique_key=a1.unique_key) \n"),RemoteObject.createImmutable("													inner join dta_tasks_items_answers as b on\n"),RemoteObject.createImmutable("													(b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode) \n"),RemoteObject.createImmutable("													left join type_conformitytypes as c on (c.tagcode=b.type_conformity)\n"),RemoteObject.createImmutable("													where 1=1 ")));
 //BA.debugLineNum = 808;BA.debugLine="Public Const EVC_SQL_GET_TASK_ITEM_VALUE_EVENTS A";
dbstructures._evc_sql_get_task_item_value_events = (RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT event_tagcode,`position`,type_item,active,`value`,formula,have_formula,have_condition,\n"),RemoteObject.createImmutable("													have_status,is_jump,is_status,is_alert,is_email,is_more,is_foto,is_action,inc_object_contacts,\n"),RemoteObject.createImmutable("													team_tagcode,email_to,email_cc,use_internal_image,default_typerequest,resobsgrp_tagcode,add_entity_email,\n"),RemoteObject.createImmutable("													add_object_email,request_signature\n"),RemoteObject.createImmutable("													FROM dta_tasks_items_answers_events\n"),RemoteObject.createImmutable("													where 1=1 ")));
 //BA.debugLineNum = 820;BA.debugLine="Public Const SQL_GET_TASK_ITEM_VALUE_GRID As Stri";
dbstructures._sql_get_task_item_value_grid = (RemoteObject.concat(RemoteObject.createImmutable("Select a.request_tagcode, a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode, ifnull(b.status, 0) as status  \n"),RemoteObject.createImmutable("													from  requests_itemsgrid As a left join requests_values As b on (b.request_tagcode=a.request_tagcode And b.action_tagcode=a.action_tagcode And \n"),RemoteObject.createImmutable("													b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.uniquekey=a.uniquekey And b.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("													where 1=1")));
 //BA.debugLineNum = 825;BA.debugLine="Public Const SQL_GET_TASK_MORE_AS As String = $\"s";
dbstructures._sql_get_task_more_as = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(b.title,'') as status_desc, ifnull(c.title,'') as priority_desc, ifnull(d.title,'') as urgency_desc, a.id, a.request_tagcode,\n"),RemoteObject.createImmutable("													a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, a.posis, a.status, \n"),RemoteObject.createImmutable("													ifnull(a.details,'') as details, ifnull(a.actiondatetime,'') as actiondatetime, ifnull(a.assigned_to, '') as assigned_to,\n"),RemoteObject.createImmutable("													a.assigned_type, ifnull(a.email_datetime,'') as email_datetime, a.email_sent, ifnull(a.email_to, '') as email_to, \n"),RemoteObject.createImmutable("													a.priority, ifnull(a.related_task,'') as related_task, ifnull(a.take_action,'') as take_action, ifnull(a.title,'') as title, a.urgency, a.user_tagcode,\n"),RemoteObject.createImmutable("													a.repeatcounter, a.repeatitemcounter, a.due_date\n"),RemoteObject.createImmutable("													from requests_actions_history as a \n"),RemoteObject.createImmutable("													left join type_asstatus as b on (b.id=a.status)\n"),RemoteObject.createImmutable("													left join type_priorities as c on (c.id=a.priority)\n"),RemoteObject.createImmutable("													left join type_urgency as d on (d.id=a.urgency)\n"),RemoteObject.createImmutable("													where 1=1")));
 //BA.debugLineNum = 878;BA.debugLine="Public Const EVC_SQL_GET_TASK_MORE_AS As String =";
dbstructures._evc_sql_get_task_more_as = (RemoteObject.concat(RemoteObject.createImmutable("SELECT x.* FROM\n"),RemoteObject.createImmutable("												(\n"),RemoteObject.createImmutable("												SELECT 0 AS masterid, ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,\n"),RemoteObject.createImmutable("													ifnull(d.tagdesc,'') as urgency_desc, a.id, a1.request_tagcode,\n"),RemoteObject.createImmutable("													a1.action_tagcode, a1.task_tagcode, a1.item_tagcode, a1.uniquekey, a.updated_at as actiondatetime,\n"),RemoteObject.createImmutable("													IFNULL(a1.iu_tagcode,'') as iu_tagcode, a1.tagcode, ifnull(a.email_to, '') as email_to,\n"),RemoteObject.createImmutable("													ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,\n"),RemoteObject.createImmutable("													a.priority_tagcode,  IFNULL(a1.title,'') as title, a.gravity_tagcode,  \n"),RemoteObject.createImmutable("													ifnull(a.due_date, IFNULL(a1.due_date, '')) AS due_date, a.operation_type, \n"),RemoteObject.createImmutable("													a.repeatcounter, a.repeatitemcounter, a.repeatfieldcounter, a.email_sent, a.send_email\n"),RemoteObject.createImmutable("													from dta_actions_items as a \n"),RemoteObject.createImmutable("													INNER JOIN  dta_actions AS a1 ON (a1.tagcode=a.actions_tagcode \n"),RemoteObject.createImmutable("															AND a1.repeatcounter=a.repeatcounter\n"),RemoteObject.createImmutable("															AND a1.repeatitemcounter=a.repeatitemcounter)\n"),RemoteObject.createImmutable("													left join type_operationtypes as b ON (b.tagcode=a.operation_type)\n"),RemoteObject.createImmutable("													left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)\n"),RemoteObject.createImmutable("													left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)\n"),RemoteObject.createImmutable("												) AS x\n"),RemoteObject.createImmutable("												where 1=1")));
 //BA.debugLineNum = 901;BA.debugLine="Public Const REQUESTS_GET_CURRENT_TASK_ITEMS As S";
dbstructures._requests_get_current_task_items = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.request_tagcode, a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.status,\n"),RemoteObject.createImmutable("					b.mandatory, b.critical, b.multi, b.repeat, b.on_report, b.info, b.title, b.parent, b.value_type, b.value_options, b.level, b.type from  requests_values as a \n"),RemoteObject.createImmutable("					inner join tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey) where 1=1")));
 //BA.debugLineNum = 905;BA.debugLine="Public Const REQUESTS_GET_CURRENT_TASK_ITEMS_V2 A";
dbstructures._requests_get_current_task_items_v2 = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.request_tagcode, a.inner_request_tagcode, a.task_tagcode, a.item_tagcode, a.unique_key, \n"),RemoteObject.createImmutable("					a.tagcode, a.execute_value, a.execute_value_title, a.execute_datetime, a.execute_longitude, a.execute_latitude, a.execute_notes, a.execute_action,\n"),RemoteObject.createImmutable("					b.position, b.level, b.parent_tagcode, b.item_type, b.points, b.risk, b.title, b.details, b.image, b.type_answer, b.typified_answers, \n"),RemoteObject.createImmutable("					b.mandatory, b.critical, b.multiple, b.repeated, b.on_report, b.info, b.ta_jump_tagcode, b.defobj_tagcode, b.info_notes, b.asw_notes, \n"),RemoteObject.createImmutable("					b.asw_as_task, a.repeated, a.repeatcounter, b.repeated as item_repeated, a.repeatitemcounter\n"),RemoteObject.createImmutable("					from  dta_requests_values as a \n"),RemoteObject.createImmutable("					inner join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key) where 1=1")));
 //BA.debugLineNum = 914;BA.debugLine="Public Const EVC_SQL_GETTASKITEMS As String = $\"s";
dbstructures._evc_sql_gettaskitems = (RemoteObject.createImmutable("select distinct a.* from dta_tasks_items as a  where 1=1 "));
 //BA.debugLineNum = 916;BA.debugLine="Public Const EVC_SQL_GETREQUESTTASK_ITEMVALUE As";
dbstructures._evc_sql_getrequesttask_itemvalue = (RemoteObject.createImmutable("select distinct a.* from  dta_requests_values as a where 1=1"));
 //BA.debugLineNum = 918;BA.debugLine="Public Const EVC_SQL_GETREQUEST_DATA_INFO As Stri";
dbstructures._evc_sql_getrequest_data_info = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.id, a.tagcode, a.reference, a.request_obs, a.details,\n"),RemoteObject.createImmutable("													ifnull(e.title, '') as typerequest_desc, IFNULL(g.title, '') AS task_desc,\n"),RemoteObject.createImmutable("													IFNULL(b.title_import, '') AS entity_desc, IFNULL(o.tagdesc, '') AS origin_desc,\n"),RemoteObject.createImmutable("													ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,\n"),RemoteObject.createImmutable("													ifnull(c.postalcode, '') as postal_code, \n"),RemoteObject.createImmutable("													ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, \n"),RemoteObject.createImmutable("													ifnull(c.longitude, '') as longitude\n"),RemoteObject.createImmutable("													from dta_requests_relations as z \n"),RemoteObject.createImmutable("													inner join dta_requests as a on (a.tagcode=z.request_tagcode)\n"),RemoteObject.createImmutable("													inner join dta_objects as b on (b.tagcode=a.entity_tagcode)  \n"),RemoteObject.createImmutable("													left join dta_locations As c on (c.tagcode=a.local_tagcode)\n"),RemoteObject.createImmutable("													left join dta_typerequests as e on (e.tagcode=a.typerequest_tagcode)  \n"),RemoteObject.createImmutable("													left join dta_tasks as g on (g.tagcode= z.relation_tagcode)\n"),RemoteObject.createImmutable("													left join type_originstypes as o ON (o.tagcode=a.origin_tagcode)\n"),RemoteObject.createImmutable("													where 1=1 ")));
 //BA.debugLineNum = 934;BA.debugLine="Public Const EVC_SQL_GET_TESK_ITEM_VALUE_EVENTS A";
dbstructures._evc_sql_get_tesk_item_value_events = (RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT event_tagcode,`position`,type_item,active,`value`,formula,have_formula,have_condition,\n"),RemoteObject.createImmutable("													have_status,is_jump,is_status,is_alert,is_email,is_more,is_foto,is_action,inc_object_contacts,\n"),RemoteObject.createImmutable("													team_tagcode,email_to,email_cc,use_internal_image,default_typerequest,resobsgrp_tagcode,add_entity_email,\n"),RemoteObject.createImmutable("													add_object_email,request_signature\n"),RemoteObject.createImmutable("													FROM dta_tasks_items_answers_events\n"),RemoteObject.createImmutable("													WHERE 1=1")));
 //BA.debugLineNum = 941;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _removerecsfromtable(RemoteObject _ba,RemoteObject _tblname,RemoteObject _tblkey,RemoteObject _tblchildkey,RemoteObject _child_id,RemoteObject _fullkeyid) throws Exception{
try {
		Debug.PushSubsStack("RemoveRecsFromTable (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1199);
if (RapidSub.canDelegate("removerecsfromtable")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","removerecsfromtable", _ba, _tblname, _tblkey, _tblchildkey, _child_id, _fullkeyid);}
ResumableSub_RemoveRecsFromTable rsub = new ResumableSub_RemoveRecsFromTable(null,_ba,_tblname,_tblkey,_tblchildkey,_child_id,_fullkeyid);
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
public static class ResumableSub_RemoveRecsFromTable extends BA.ResumableSub {
public ResumableSub_RemoveRecsFromTable(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _tblname,RemoteObject _tblkey,RemoteObject _tblchildkey,RemoteObject _child_id,RemoteObject _fullkeyid) {
this.parent = parent;
this._ba = _ba;
this._tblname = _tblname;
this._tblkey = _tblkey;
this._tblchildkey = _tblchildkey;
this._child_id = _child_id;
this._fullkeyid = _fullkeyid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _tblname;
RemoteObject _tblkey;
RemoteObject _tblchildkey;
RemoteObject _child_id;
RemoteObject _fullkeyid;
RemoteObject _listkeyschild = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _keyid = RemoteObject.createImmutable("");
RemoteObject _childid = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RemoveRecsFromTable (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1199);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblKey", _tblkey);
Debug.locals.put("TblChildKey", _tblchildkey);
Debug.locals.put("Child_Id", _child_id);
Debug.locals.put("FullkeyId", _fullkeyid);
 BA.debugLineNum = 1201;BA.debugLine="If (Utils.NNE(tblName) And Utils.NNE(tblName) And";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 22;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_tblname))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_tblname))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_fullkeyid))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1203;BA.debugLine="Try";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 1204;BA.debugLine="If FullkeyId.Contains(\";\") Then";
Debug.ShouldStop(524288);
if (true) break;

case 7:
//if
this.state = 18;
if (_fullkeyid.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(";"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1205;BA.debugLine="Dim ListKeysChild As List = Regex.Split(\";\", F";
Debug.ShouldStop(1048576);
_listkeyschild = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listkeyschild = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(_fullkeyid))));Debug.locals.put("ListKeysChild", _listkeyschild);Debug.locals.put("ListKeysChild", _listkeyschild);
 BA.debugLineNum = 1206;BA.debugLine="Dim keyId As String = ListKeysChild.Get(0)";
Debug.ShouldStop(2097152);
_keyid = BA.ObjectToString(_listkeyschild.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("keyId", _keyid);Debug.locals.put("keyId", _keyid);
 BA.debugLineNum = 1207;BA.debugLine="Dim ChildId As String = ListKeysChild.Get(1)";
Debug.ShouldStop(4194304);
_childid = BA.ObjectToString(_listkeyschild.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("ChildId", _childid);Debug.locals.put("ChildId", _childid);
 BA.debugLineNum = 1208;BA.debugLine="If TblChildKey <> \"\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_tblchildkey,BA.ObjectToString(""))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 1209;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"DELETE FRO";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable(" WHERE "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblkey))),RemoteObject.createImmutable("='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_keyid))),RemoteObject.createImmutable("' and "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblchildkey))),RemoteObject.createImmutable(" = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_childid))),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 1210;BA.debugLine="Log($\"DELETE FROM ${tblName} WHERE ${tblKey}=";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","616842763",(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable(" WHERE "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblkey))),RemoteObject.createImmutable("='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_keyid))),RemoteObject.createImmutable("' and "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblchildkey))),RemoteObject.createImmutable(" = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_childid))),RemoteObject.createImmutable("'"))),0);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1212;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"DELETE FRO";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable(" WHERE "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblkey))),RemoteObject.createImmutable("='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_keyid))),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 1213;BA.debugLine="Log($\"DELETE FROM ${tblName} WHERE ${tblKey}=";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","616842766",(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable(" WHERE "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblkey))),RemoteObject.createImmutable("='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_keyid))),RemoteObject.createImmutable(""))),0);
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1217;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"DELETE FROM";
Debug.ShouldStop(1);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable(" WHERE "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblkey))),RemoteObject.createImmutable("='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fullkeyid))),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 1218;BA.debugLine="Log($\"DELETE FROM ${tblName} WHERE ${tblKey}='";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","616842771",(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable(" WHERE "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblkey))),RemoteObject.createImmutable("='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fullkeyid))),RemoteObject.createImmutable("'"))),0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
 BA.debugLineNum = 1222;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","616842775",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
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
 BA.debugLineNum = 1227;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1228;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e0.toString());}
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
public static RemoteObject  _removerecsfromtablebulk(RemoteObject _ba,RemoteObject _tblname,RemoteObject _tblkey,RemoteObject _keyid) throws Exception{
try {
		Debug.PushSubsStack("RemoveRecsFromTableBulk (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1230);
if (RapidSub.canDelegate("removerecsfromtablebulk")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","removerecsfromtablebulk", _ba, _tblname, _tblkey, _keyid);}
ResumableSub_RemoveRecsFromTableBulk rsub = new ResumableSub_RemoveRecsFromTableBulk(null,_ba,_tblname,_tblkey,_keyid);
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
public static class ResumableSub_RemoveRecsFromTableBulk extends BA.ResumableSub {
public ResumableSub_RemoveRecsFromTableBulk(xevolution.vrcg.devdemov2400.dbstructures parent,RemoteObject _ba,RemoteObject _tblname,RemoteObject _tblkey,RemoteObject _keyid) {
this.parent = parent;
this._ba = _ba;
this._tblname = _tblname;
this._tblkey = _tblkey;
this._keyid = _keyid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dbstructures parent;
RemoteObject _ba;
RemoteObject _tblname;
RemoteObject _tblkey;
RemoteObject _keyid;
RemoteObject _ssql = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RemoveRecsFromTableBulk (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1230);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblKey", _tblkey);
Debug.locals.put("keyId", _keyid);
 BA.debugLineNum = 1232;BA.debugLine="If (Utils.NNE(tblName) And Utils.NNE(tblName) And";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 10;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_tblname))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_tblname))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_keyid))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1233;BA.debugLine="Dim sSQL As String = $\"DELETE FROM ${tblName} WH";
Debug.ShouldStop(65536);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable(" WHERE "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblkey))),RemoteObject.createImmutable(" in "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_keyid))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1234;BA.debugLine="Try";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 1235;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(262144);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 1236;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","616908294",_ssql,0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 1238;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","616908296",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
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
 BA.debugLineNum = 1243;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1244;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e0.toString());}
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
public static RemoteObject  _setuserroutedate(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _datein,RemoteObject _dateout) throws Exception{
try {
		Debug.PushSubsStack("SetUserRouteDate (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1180);
if (RapidSub.canDelegate("setuserroutedate")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","setuserroutedate", _ba, _tagcode, _datein, _dateout);}
RemoteObject _lststring = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _recordtech = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("datein", _datein);
Debug.locals.put("dateout", _dateout);
 BA.debugLineNum = 1180;BA.debugLine="Sub SetUserRouteDate(Tagcode As String, datein As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1181;BA.debugLine="Dim lstString As String = \"\"";
Debug.ShouldStop(268435456);
_lststring = BA.ObjectToString("");Debug.locals.put("lstString", _lststring);Debug.locals.put("lstString", _lststring);
 BA.debugLineNum = 1182;BA.debugLine="Dim sSQL As String  = $\"SELECT route_tagcode as t";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT route_tagcode as tagcode FROM dta_teams_routes WHERE team_tagcode IN (\n"),RemoteObject.createImmutable("												SELECT a.team_tagcode as tagcode\n"),RemoteObject.createImmutable("												from dta_teams_routes_users AS a\n"),RemoteObject.createImmutable("												INNER JOIN dta_technicals AS b ON (b.user_tagcode=a.user_tagcode)\n"),RemoteObject.createImmutable("												WHERE b.tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' AND (a.date>='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datein))),RemoteObject.createImmutable("' and a.date<='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dateout))),RemoteObject.createImmutable("' AND a.active=1))")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1188;BA.debugLine="Dim RecordTech As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(8);
_recordtech = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordtech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordTech", _recordtech);
 BA.debugLineNum = 1189;BA.debugLine="Do While RecordTech.NextRow";
Debug.ShouldStop(16);
while (_recordtech.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1190;BA.debugLine="If Utils.NNE(lstString) Then lstString = $\"${lstS";
Debug.ShouldStop(32);
if (dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_lststring)).<Boolean>get().booleanValue()) { 
_lststring = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lststring))),RemoteObject.createImmutable(",")));Debug.locals.put("lstString", _lststring);};
 BA.debugLineNum = 1191;BA.debugLine="lstString = $\"${lstString}'${RecordTech.GetStrin";
Debug.ShouldStop(64);
_lststring = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lststring))),RemoteObject.createImmutable("'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_recordtech.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))))),RemoteObject.createImmutable("'")));Debug.locals.put("lstString", _lststring);
 }
;
 BA.debugLineNum = 1193;BA.debugLine="If Utils.NNE(lstString) Then";
Debug.ShouldStop(256);
if (dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_lststring)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1194;BA.debugLine="ShareCode.SESS_UserRoute = lstString";
Debug.ShouldStop(512);
dbstructures.mostCurrent._sharecode._sess_userroute /*RemoteObject*/  = _lststring;
 };
 BA.debugLineNum = 1196;BA.debugLine="Return lstString";
Debug.ShouldStop(2048);
if (true) return _lststring;
 BA.debugLineNum = 1197;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setuserteamdate(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _datein,RemoteObject _dateout) throws Exception{
try {
		Debug.PushSubsStack("SetUserTeamDate (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1155);
if (RapidSub.canDelegate("setuserteamdate")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","setuserteamdate", _ba, _tagcode, _datein, _dateout);}
RemoteObject _lststring = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _recordtech = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("datein", _datein);
Debug.locals.put("dateout", _dateout);
 BA.debugLineNum = 1155;BA.debugLine="Sub SetUserTeamDate(Tagcode As String, datein As S";
Debug.ShouldStop(4);
 BA.debugLineNum = 1156;BA.debugLine="Dim lstString As String = \"\"";
Debug.ShouldStop(8);
_lststring = BA.ObjectToString("");Debug.locals.put("lstString", _lststring);Debug.locals.put("lstString", _lststring);
 BA.debugLineNum = 1157;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_DEFAULT_ROUTE";
Debug.ShouldStop(16);
if ((dbstructures.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,_ba,(Object)(dbstructures.mostCurrent._sharecode._device_default_route /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1158;BA.debugLine="Dim sSQL As String  = $\"SELECT a.team_tagcode as";
Debug.ShouldStop(32);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT a.team_tagcode as tagcode\n"),RemoteObject.createImmutable("								from dta_teams_routes_users AS a\n"),RemoteObject.createImmutable("								INNER JOIN dta_technicals AS b ON (b.user_tagcode=a.user_tagcode)\n"),RemoteObject.createImmutable("								WHERE b.tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' AND (a.date>='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datein))),RemoteObject.createImmutable("' and a.date<='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dateout))),RemoteObject.createImmutable("' AND a.active=1)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 }else {
 BA.debugLineNum = 1163;BA.debugLine="Dim sSQL As String  = $\"SELECT a.tagcode from dt";
Debug.ShouldStop(1024);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT a.tagcode from dta_teams_relations AS a\n"),RemoteObject.createImmutable("								INNER JOIN dta_technicals AS b ON (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("								WHERE b.tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' AND a.active=1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 };
 BA.debugLineNum = 1169;BA.debugLine="Dim RecordTech As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(65536);
_recordtech = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordtech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordTech", _recordtech);
 BA.debugLineNum = 1170;BA.debugLine="Do While RecordTech.NextRow";
Debug.ShouldStop(131072);
while (_recordtech.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1171;BA.debugLine="If Utils.NNE(lstString) Then lstString = $\"${lst";
Debug.ShouldStop(262144);
if (dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_lststring)).<Boolean>get().booleanValue()) { 
_lststring = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lststring))),RemoteObject.createImmutable(",")));Debug.locals.put("lstString", _lststring);};
 BA.debugLineNum = 1172;BA.debugLine="lstString = $\"${lstString}'${RecordTech.GetStrin";
Debug.ShouldStop(524288);
_lststring = (RemoteObject.concat(RemoteObject.createImmutable(""),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lststring))),RemoteObject.createImmutable("'"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_recordtech.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))))),RemoteObject.createImmutable("'")));Debug.locals.put("lstString", _lststring);
 }
;
 BA.debugLineNum = 1174;BA.debugLine="If Utils.NNE(lstString) Then";
Debug.ShouldStop(2097152);
if (dbstructures.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,_ba,(Object)(_lststring)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1175;BA.debugLine="ShareCode.SESS_UserTeam = lstString";
Debug.ShouldStop(4194304);
dbstructures.mostCurrent._sharecode._sess_userteam /*RemoteObject*/  = _lststring;
 };
 BA.debugLineNum = 1177;BA.debugLine="Return lstString";
Debug.ShouldStop(16777216);
if (true) return _lststring;
 BA.debugLineNum = 1178;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateaddress(RemoteObject _ba,RemoteObject _entity,RemoteObject _local,RemoteObject _adrs) throws Exception{
try {
		Debug.PushSubsStack("UpdateAddress (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2017);
if (RapidSub.canDelegate("updateaddress")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateaddress", _ba, _entity, _local, _adrs);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("entity", _entity);
Debug.locals.put("local", _local);
Debug.locals.put("adrs", _adrs);
 BA.debugLineNum = 2017;BA.debugLine="Sub UpdateAddress(entity As String, local As Strin";
Debug.ShouldStop(1);
 BA.debugLineNum = 2019;BA.debugLine="Dim sqlScript As String = $\"update locals set add";
Debug.ShouldStop(4);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update locals set address='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressName" /*RemoteObject*/ )))),RemoteObject.createImmutable("', address2='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressName2" /*RemoteObject*/ )))),RemoteObject.createImmutable("', postal_code='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressPostalCode" /*RemoteObject*/ )))),RemoteObject.createImmutable("', city='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressCity" /*RemoteObject*/ )))),RemoteObject.createImmutable("', latitude='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressLatitude" /*RemoteObject*/ )))),RemoteObject.createImmutable("', longitude='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_adrs.getField(true,"AddressLongitude" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_local))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2020;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(8);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2021;BA.debugLine="Dim sqlScript As String = $\"update locals2entitie";
Debug.ShouldStop(16);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update locals2entities set localtype="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {_adrs.getField(true,"AddressType" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)))),RemoteObject.createImmutable(" where entity='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_entity))),RemoteObject.createImmutable("' and locality='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_local))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2022;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(32);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2023;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateaddressgeoreference(RemoteObject _ba,RemoteObject _entity,RemoteObject _local,RemoteObject _geo) throws Exception{
try {
		Debug.PushSubsStack("UpdateAddressGeoReference (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2037);
if (RapidSub.canDelegate("updateaddressgeoreference")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateaddressgeoreference", _ba, _entity, _local, _geo);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("entity", _entity);
Debug.locals.put("local", _local);
Debug.locals.put("geo", _geo);
 BA.debugLineNum = 2037;BA.debugLine="Sub UpdateAddressGeoReference(entity As String, lo";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2038;BA.debugLine="Dim sqlScript As String = $\"update locals set lat";
Debug.ShouldStop(2097152);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update locals set latitude='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_geo.getField(true,"Latitude" /*RemoteObject*/ )))),RemoteObject.createImmutable("', longitude='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_geo.getField(true,"Longitude" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_local))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2039;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(4194304);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2040;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateconfigapp(RemoteObject _ba,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("updateConfigApp (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1737);
if (RapidSub.canDelegate("updateconfigapp")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateconfigapp", _ba, _token);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("Token", _token);
 BA.debugLineNum = 1737;BA.debugLine="Sub updateConfigApp(Token As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1738;BA.debugLine="Dim sqlScript As String = $\"update config_appl se";
Debug.ShouldStop(512);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update config_appl set colormain="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent._consts._colormain /*RemoteObject*/ ))),RemoteObject.createImmutable(", colorsub="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent._consts._colorsub /*RemoteObject*/ ))),RemoteObject.createImmutable(" where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_token))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 1739;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(1024);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 1740;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatecontact(RemoteObject _ba,RemoteObject _cnt) throws Exception{
try {
		Debug.PushSubsStack("UpdateContact (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2042);
if (RapidSub.canDelegate("updatecontact")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updatecontact", _ba, _cnt);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("cnt", _cnt);
 BA.debugLineNum = 2042;BA.debugLine="Sub UpdateContact(cnt As ContactRecord)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2043;BA.debugLine="Dim sqlScript As String = $\"update contacts set t";
Debug.ShouldStop(67108864);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update contacts set type="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt.getField(true,"contactType" /*RemoteObject*/ )))),RemoteObject.createImmutable(", name='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt.getField(true,"contactName" /*RemoteObject*/ )))),RemoteObject.createImmutable("', phone='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt.getField(true,"contactPhone" /*RemoteObject*/ )))),RemoteObject.createImmutable("', email='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt.getField(true,"contactEmail" /*RemoteObject*/ )))),RemoteObject.createImmutable("', title='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt.getField(true,"contactTitle" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt.getField(true,"tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2044;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(134217728);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2045;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateentityproperty(RemoteObject _ba,RemoteObject _entity,RemoteObject _property,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("UpdateEntityProperty (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2047);
if (RapidSub.canDelegate("updateentityproperty")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateentityproperty", _ba, _entity, _property, _value);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("entity", _entity);
Debug.locals.put("property", _property);
Debug.locals.put("value", _value);
 BA.debugLineNum = 2047;BA.debugLine="Sub UpdateEntityProperty(entity As String, propert";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 2048;BA.debugLine="Dim sqlScript As String = $\"update props2entities";
Debug.ShouldStop(-2147483648);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update props2entities set value='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("' where entity='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_entity))),RemoteObject.createImmutable("' and property='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_property))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2049;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(1);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2050;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatenotifyuserstock(RemoteObject _ba,RemoteObject _code,RemoteObject _qtd,RemoteObject _warehouse) throws Exception{
try {
		Debug.PushSubsStack("updateNotifyUserStock (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1911);
if (RapidSub.canDelegate("updatenotifyuserstock")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updatenotifyuserstock", _ba, _code, _qtd, _warehouse);}
;
Debug.locals.put("code", _code);
Debug.locals.put("qtd", _qtd);
Debug.locals.put("warehouse", _warehouse);
 BA.debugLineNum = 1911;BA.debugLine="Sub updateNotifyUserStock(code As String, qtd As I";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1912;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"update dta_war";
Debug.ShouldStop(8388608);
dbstructures.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("update dta_warehouses_articles set qtd="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_qtd))),RemoteObject.createImmutable(" where article_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_code))),RemoteObject.createImmutable("' and warehouse_tagcode = '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_warehouse))),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 1913;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateobjectproperty(RemoteObject _ba,RemoteObject _sobject,RemoteObject _property,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("UpdateObjectProperty (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2057);
if (RapidSub.canDelegate("updateobjectproperty")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateobjectproperty", _ba, _sobject, _property, _value);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("sobject", _sobject);
Debug.locals.put("property", _property);
Debug.locals.put("value", _value);
 BA.debugLineNum = 2057;BA.debugLine="Sub UpdateObjectProperty(sobject As String, proper";
Debug.ShouldStop(256);
 BA.debugLineNum = 2058;BA.debugLine="Dim sqlScript As String = $\"update props2objects";
Debug.ShouldStop(512);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update props2objects set value='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("' where object='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sobject))),RemoteObject.createImmutable("' and property='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_property))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2059;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(1024);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2060;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateorcreateworkdayproduct(RemoteObject _ba,RemoteObject _uniqueworkingdayid,RemoteObject _producttagcode,RemoteObject _productstatus,RemoteObject _notes) throws Exception{
try {
		Debug.PushSubsStack("UpdateOrCreateWorkDayProduct (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1990);
if (RapidSub.canDelegate("updateorcreateworkdayproduct")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateorcreateworkdayproduct", _ba, _uniqueworkingdayid, _producttagcode, _productstatus, _notes);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("UniqueWorkingDayID", _uniqueworkingdayid);
Debug.locals.put("productTagcode", _producttagcode);
Debug.locals.put("productStatus", _productstatus);
Debug.locals.put("notes", _notes);
 BA.debugLineNum = 1990;BA.debugLine="Sub UpdateOrCreateWorkDayProduct(UniqueWorkingDayI";
Debug.ShouldStop(32);
 BA.debugLineNum = 1991;BA.debugLine="Private Record As ResultSet = Starter.LocalSQL.Ex";
Debug.ShouldStop(64);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select * from userinnertasksnolines where ukey='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uniqueworkingdayid))),RemoteObject.createImmutable("' and product_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_producttagcode))),RemoteObject.createImmutable("'"))))));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1992;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(128);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1993;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(256);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1994;BA.debugLine="ret = ret + 1";
Debug.ShouldStop(512);
_ret = RemoteObject.solve(new RemoteObject[] {_ret,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ret", _ret);
 }
;
 BA.debugLineNum = 1996;BA.debugLine="Record.Close";
Debug.ShouldStop(2048);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1998;BA.debugLine="If (ret >=1 ) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("g",_ret,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1999;BA.debugLine="Dim sqlScript As String = $\"update userinnertask";
Debug.ShouldStop(16384);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update userinnertasksnolines set status="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_productstatus))),RemoteObject.createImmutable(", notes='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_notes))),RemoteObject.createImmutable("' where ukey='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uniqueworkingdayid))),RemoteObject.createImmutable("' and product_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_producttagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2000;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(32768);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 }else {
 BA.debugLineNum = 2002;BA.debugLine="Dim sqlScript As String = $\"insert into  userinn";
Debug.ShouldStop(131072);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("insert into  userinnertasksnolines (tagcode, ukey, product_tagcode, status, notes) values('"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dbstructures.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uniqueworkingdayid))),RemoteObject.createImmutable("', '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_producttagcode))),RemoteObject.createImmutable("', "),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_productstatus))),RemoteObject.createImmutable(", '"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_notes))),RemoteObject.createImmutable("')")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2003;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(262144);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 };
 BA.debugLineNum = 2005;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterequestasevc(RemoteObject _ba,RemoteObject _astagcode,RemoteObject _request,RemoteObject _action,RemoteObject _task,RemoteObject _item,RemoteObject _uniquekey,RemoteObject _tagcode,RemoteObject _dlgassubject,RemoteObject _dlgasdetails,RemoteObject _dlgaspriority,RemoteObject _dlgasurgency,RemoteObject _sess_oper_user,RemoteObject _dlgasstatus,RemoteObject _emailsentdate,RemoteObject _emailsentonnewas,RemoteObject _dlgasemails,RemoteObject _dlgasduedate,RemoteObject _repeatcounter,RemoteObject _repeatitemcounter,RemoteObject _repeatfieldcounter,RemoteObject _datetimecreation,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _obs,RemoteObject _emailsent) throws Exception{
try {
		Debug.PushSubsStack("UpdateRequestASEVC (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2480);
if (RapidSub.canDelegate("updaterequestasevc")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updaterequestasevc", _ba, _astagcode, _request, _action, _task, _item, _uniquekey, _tagcode, _dlgassubject, _dlgasdetails, _dlgaspriority, _dlgasurgency, _sess_oper_user, _dlgasstatus, _emailsentdate, _emailsentonnewas, _dlgasemails, _dlgasduedate, _repeatcounter, _repeatitemcounter, _repeatfieldcounter, _datetimecreation, _tagcodetpa, _grouptpa, _obs, _emailsent);}
RemoteObject _ssql = RemoteObject.createImmutable("");
;
Debug.locals.put("asTagcode", _astagcode);
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
Debug.locals.put("Task", _task);
Debug.locals.put("Item", _item);
Debug.locals.put("UniqueKey", _uniquekey);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("dlgASSubject", _dlgassubject);
Debug.locals.put("dlgASDetails", _dlgasdetails);
Debug.locals.put("dlgASPriority", _dlgaspriority);
Debug.locals.put("dlgASUrgency", _dlgasurgency);
Debug.locals.put("SESS_OPER_User", _sess_oper_user);
Debug.locals.put("dlgASStatus", _dlgasstatus);
Debug.locals.put("emailsentdate", _emailsentdate);
Debug.locals.put("EmailSentOnNewAS", _emailsentonnewas);
Debug.locals.put("dlgASEmails", _dlgasemails);
Debug.locals.put("dlgASDueDate", _dlgasduedate);
Debug.locals.put("repeatcounter", _repeatcounter);
Debug.locals.put("repeatitemcounter", _repeatitemcounter);
Debug.locals.put("repeatfieldcounter", _repeatfieldcounter);
Debug.locals.put("DateTimecreation", _datetimecreation);
Debug.locals.put("tagcodeTPA", _tagcodetpa);
Debug.locals.put("groupTPA", _grouptpa);
Debug.locals.put("obs", _obs);
Debug.locals.put("EmailSent", _emailsent);
 BA.debugLineNum = 2480;BA.debugLine="Sub UpdateRequestASEVC(asTagcode As String, Reques";
Debug.ShouldStop(32768);
 BA.debugLineNum = 2488;BA.debugLine="Dim ssql As String = $\"update dta_actions set";
Debug.ShouldStop(8388608);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_actions set\n"),RemoteObject.createImmutable("				title='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgassubject))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				operation_type='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasstatus))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				details='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasdetails))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				priority_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgaspriority))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				gravity_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasurgency))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				due_date='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasduedate))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				send_email='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsent))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				email_sent='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsent))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				email_to='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasemails))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				email_cc=''\n"),RemoteObject.createImmutable("				where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("ssql", _ssql);Debug.locals.put("ssql", _ssql);
 BA.debugLineNum = 2500;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 2501;BA.debugLine="Utils.SaveSQLToLog(\"EditAS\",ssql, asTagcode)";
Debug.ShouldStop(16);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("EditAS")),(Object)(_ssql),(Object)(_astagcode));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e5.toString()); BA.debugLineNum = 2503;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","622085655",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2506;BA.debugLine="Dim ssql As String = $\"update dta_actions_items s";
Debug.ShouldStop(512);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_actions_items set\n"),RemoteObject.createImmutable("				operation_type='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasstatus))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				details='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasdetails))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				priority_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgaspriority))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				gravity_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasurgency))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				due_date='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasduedate))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				send_email='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsent))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				email_sent='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsent))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				email_to='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dlgasemails))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				email_cc=''\n"),RemoteObject.createImmutable("				where actions_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and repeatcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("")));Debug.locals.put("ssql", _ssql);Debug.locals.put("ssql", _ssql);
 BA.debugLineNum = 2521;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 2522;BA.debugLine="Utils.SaveSQLToLog(\"NewASItem\",ssql, asTagcode)";
Debug.ShouldStop(33554432);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("NewASItem")),(Object)(_ssql),(Object)(_astagcode));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e11.toString()); BA.debugLineNum = 2524;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","622085676",BA.ObjectToString(dbstructures.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2526;BA.debugLine="Return asTagcode";
Debug.ShouldStop(536870912);
if (true) return _astagcode;
 BA.debugLineNum = 2527;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateuseravailablestate(RemoteObject _ba,RemoteObject _code,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("updateUserAvailableState (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1915);
if (RapidSub.canDelegate("updateuseravailablestate")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateuseravailablestate", _ba, _code, _state);}
;
Debug.locals.put("code", _code);
Debug.locals.put("state", _state);
 BA.debugLineNum = 1915;BA.debugLine="Sub updateUserAvailableState(code As String, state";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1919;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateuserequipment(RemoteObject _ba,RemoteObject _usertagcode,RemoteObject _equiptagcode,RemoteObject _oldequitagcode) throws Exception{
try {
		Debug.PushSubsStack("updateUserEquipment (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1977);
if (RapidSub.canDelegate("updateuserequipment")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateuserequipment", _ba, _usertagcode, _equiptagcode, _oldequitagcode);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("userTagcode", _usertagcode);
Debug.locals.put("equipTagcode", _equiptagcode);
Debug.locals.put("oldequitagcode", _oldequitagcode);
 BA.debugLineNum = 1977;BA.debugLine="Sub updateUserEquipment(userTagcode As String, equ";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1978;BA.debugLine="Dim sqlScript As String = $\"update dta_equipments";
Debug.ShouldStop(33554432);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update dta_equipments_technicals set equipment_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_equiptagcode))),RemoteObject.createImmutable("' where technical_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usertagcode))),RemoteObject.createImmutable("' and  equipment_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_oldequitagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 1979;BA.debugLine="Utils.SaveSQLToLog(\"updateUserEquipment\",sqlScrip";
Debug.ShouldStop(67108864);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("updateUserEquipment")),(Object)(_sqlscript),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1981;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateuservehicle(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _objtagcode) throws Exception{
try {
		Debug.PushSubsStack("updateUserVehicle (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,1983);
if (RapidSub.canDelegate("updateuservehicle")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateuservehicle", _ba, _tagcode, _objtagcode);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("objTagcode", _objtagcode);
 BA.debugLineNum = 1983;BA.debugLine="Sub updateUserVehicle(tagcode As String, objTagcod";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1984;BA.debugLine="Dim sqlScript As String = $\"update dta_technicals";
Debug.ShouldStop(-2147483648);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update dta_technicals set vehicle_tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objtagcode))),RemoteObject.createImmutable("' where tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 1985;BA.debugLine="Utils.SaveSQLToLog(\"updateUserVehicle\",sqlScript,";
Debug.ShouldStop(1);
dbstructures.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString("updateUserVehicle")),(Object)(_sqlscript),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1987;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateworkerdblastupdate(RemoteObject _ba,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("UpdateWorkerDbLastUpdate (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2541);
if (RapidSub.canDelegate("updateworkerdblastupdate")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateworkerdblastupdate", _ba, _date);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("date", _date);
 BA.debugLineNum = 2541;BA.debugLine="Sub UpdateWorkerDbLastUpdate(date As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 2542;BA.debugLine="If Not(Utils.isValidDate(date)) Then";
Debug.ShouldStop(8192);
if (dbstructures.mostCurrent.__c.runMethod(true,"Not",(Object)(dbstructures.mostCurrent._utils.runMethod(true,"_isvaliddate" /*RemoteObject*/ ,_ba,(Object)(_date)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2543;BA.debugLine="date = Utils.GetCurrDatetime";
Debug.ShouldStop(16384);
_date = dbstructures.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,_ba);Debug.locals.put("date", _date);
 };
 BA.debugLineNum = 2545;BA.debugLine="Dim sqlScript As String = $\"update loc_updates se";
Debug.ShouldStop(65536);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update loc_updates set last_update='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_date))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2546;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(sqlScript)";
Debug.ShouldStop(131072);
dbstructures.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2547;BA.debugLine="Log(date)";
Debug.ShouldStop(262144);
dbstructures.mostCurrent.__c.runVoidMethod ("LogImpl","622216710",_date,0);
 BA.debugLineNum = 2548;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateworkingdaystatus(RemoteObject _ba,RemoteObject _ukey,RemoteObject _uuser,RemoteObject _ustatus,RemoteObject _uproduct) throws Exception{
try {
		Debug.PushSubsStack("UpdateWorkingDayStatus (dbstructures) ","dbstructures",4,_ba,dbstructures.mostCurrent,2007);
if (RapidSub.canDelegate("updateworkingdaystatus")) { return xevolution.vrcg.devdemov2400.dbstructures.remoteMe.runUserSub(false, "dbstructures","updateworkingdaystatus", _ba, _ukey, _uuser, _ustatus, _uproduct);}
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("ukey", _ukey);
Debug.locals.put("uuser", _uuser);
Debug.locals.put("ustatus", _ustatus);
Debug.locals.put("uproduct", _uproduct);
 BA.debugLineNum = 2007;BA.debugLine="Sub UpdateWorkingDayStatus(ukey As String, uuser A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 2008;BA.debugLine="Dim sqlScript As String = $\"update userinnertasks";
Debug.ShouldStop(8388608);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update userinnertasks set status="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ustatus))),RemoteObject.createImmutable(", prodcheck="),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uproduct))),RemoteObject.createImmutable(" where ukey='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ukey))),RemoteObject.createImmutable("' and tagcode='"),dbstructures.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuser))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 2009;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sqlScript)";
Debug.ShouldStop(16777216);
dbstructures.mostCurrent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 2010;BA.debugLine="ShareCode.UWDUKEY_DETAILS = ustatus";
Debug.ShouldStop(33554432);
dbstructures.mostCurrent._sharecode._uwdukey_details /*RemoteObject*/  = _ustatus;
 BA.debugLineNum = 2011;BA.debugLine="ShareCode.UWDUKEY_PRODUCTS = uproduct";
Debug.ShouldStop(67108864);
dbstructures.mostCurrent._sharecode._uwdukey_products /*RemoteObject*/  = _uproduct;
 BA.debugLineNum = 2012;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}