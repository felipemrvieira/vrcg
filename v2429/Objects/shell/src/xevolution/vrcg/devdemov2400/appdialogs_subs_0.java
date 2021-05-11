package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class appdialogs_subs_0 {


public static RemoteObject  _btn_download_syncmanual_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_Download_SyncManual_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3975);
if (RapidSub.canDelegate("btn_download_syncmanual_click")) { return __ref.runUserSub(false, "appdialogs","btn_download_syncmanual_click", __ref);}
 BA.debugLineNum = 3975;BA.debugLine="Private Sub btn_Download_SyncManual_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 3976;BA.debugLine="btn_Upload_SyncManual.Color = Colors.LightGray";
Debug.ShouldStop(128);
__ref.getField(false,"_btn_upload_syncmanual" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 3977;BA.debugLine="btn_Download_SyncManual.Color = Consts.ColorMain";
Debug.ShouldStop(256);
__ref.getField(false,"_btn_download_syncmanual" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 3978;BA.debugLine="panel_SyncManual_Upload.Visible = False";
Debug.ShouldStop(512);
__ref.getField(false,"_panel_syncmanual_upload" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3979;BA.debugLine="panel_SyncManual_Download.Visible = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_panel_syncmanual_download" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3980;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_upload_syncmanual_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_Upload_SyncManual_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3967);
if (RapidSub.canDelegate("btn_upload_syncmanual_click")) { return __ref.runUserSub(false, "appdialogs","btn_upload_syncmanual_click", __ref);}
 BA.debugLineNum = 3967;BA.debugLine="Private Sub btn_Upload_SyncManual_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 3968;BA.debugLine="btn_Upload_SyncManual.Color = Consts.ColorMain";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btn_upload_syncmanual" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 3969;BA.debugLine="btn_Download_SyncManual.Color = Colors.LightGray";
Debug.ShouldStop(1);
__ref.getField(false,"_btn_download_syncmanual" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 3970;BA.debugLine="panel_SyncManual_Upload.Visible = True";
Debug.ShouldStop(2);
__ref.getField(false,"_panel_syncmanual_upload" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3971;BA.debugLine="panel_SyncManual_Download.Visible = False";
Debug.ShouldStop(4);
__ref.getField(false,"_panel_syncmanual_download" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3973;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnuserfilter_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUserFilter_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2633);
if (RapidSub.canDelegate("btnuserfilter_click")) { return __ref.runUserSub(false, "appdialogs","btnuserfilter_click", __ref);}
RemoteObject _passscriptwithlimit = RemoteObject.createImmutable("");
RemoteObject _passscriptwithlimitandfilter = RemoteObject.createImmutable("");
RemoteObject _tstfld = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _listacampos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _colname = RemoteObject.createImmutable("");
RemoteObject _sqlpesquisa = RemoteObject.createImmutable("");
int _d = 0;
RemoteObject _lfd = RemoteObject.createImmutable("");
RemoteObject _sqloper = RemoteObject.createImmutable("");
RemoteObject _records2search = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _listline_key = RemoteObject.createImmutable("");
 BA.debugLineNum = 2633;BA.debugLine="Sub btnUserFilter_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 2635;BA.debugLine="Lista2Search.Clear";
Debug.ShouldStop(1024);
__ref.getField(false,"_lista2search" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 2636;BA.debugLine="ShareCode.CurrentSerchquery = \"\"";
Debug.ShouldStop(2048);
appdialogs._sharecode._currentserchquery /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 2637;BA.debugLine="Dim PassScriptwithLimit As String = \"\"";
Debug.ShouldStop(4096);
_passscriptwithlimit = BA.ObjectToString("");Debug.locals.put("PassScriptwithLimit", _passscriptwithlimit);Debug.locals.put("PassScriptwithLimit", _passscriptwithlimit);
 BA.debugLineNum = 2638;BA.debugLine="Dim PassScriptwithLimitAndFilter As String = \"\"";
Debug.ShouldStop(8192);
_passscriptwithlimitandfilter = BA.ObjectToString("");Debug.locals.put("PassScriptwithLimitAndFilter", _passscriptwithlimitandfilter);Debug.locals.put("PassScriptwithLimitAndFilter", _passscriptwithlimitandfilter);
 BA.debugLineNum = 2639;BA.debugLine="StartingRow = 0";
Debug.ShouldStop(16384);
__ref.setField ("_startingrow" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 2641;BA.debugLine="If ShareCode.SearchFromQuery Then";
Debug.ShouldStop(65536);
if (appdialogs._sharecode._searchfromquery /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2643;BA.debugLine="If PassScript.EndsWith(\";\") Then";
Debug.ShouldStop(262144);
if (__ref.getField(true,"_passscript" /*RemoteObject*/ ).runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2644;BA.debugLine="PassScript = PassScript.SubString2(0,PassScript";
Debug.ShouldStop(524288);
__ref.setField ("_passscript" /*RemoteObject*/ ,__ref.getField(true,"_passscript" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_passscript" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 BA.debugLineNum = 2647;BA.debugLine="PassScript = $\"select TBL.* from (${PassScript})";
Debug.ShouldStop(4194304);
__ref.setField ("_passscript" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("select TBL.* from ("),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_passscript" /*RemoteObject*/ )))),RemoteObject.createImmutable(") as TBL where 1=1 "))));
 BA.debugLineNum = 2649;BA.debugLine="Dim TstFld As ResultSet = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(16777216);
_tstfld = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_tstfld = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), appdialogs._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(__ref.getField(true,"_passscript" /*RemoteObject*/ ))));Debug.locals.put("TstFld", _tstfld);
 BA.debugLineNum = 2650;BA.debugLine="Dim ListaCampos As List";
Debug.ShouldStop(33554432);
_listacampos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListaCampos", _listacampos);
 BA.debugLineNum = 2651;BA.debugLine="ListaCampos.Initialize";
Debug.ShouldStop(67108864);
_listacampos.runVoidMethod ("Initialize");
 BA.debugLineNum = 2652;BA.debugLine="For i=0 To TstFld.ColumnCount - 1";
Debug.ShouldStop(134217728);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_tstfld.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2653;BA.debugLine="Dim ColName As String = TstFld.GetColumnName(i)";
Debug.ShouldStop(268435456);
_colname = _tstfld.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("ColName", _colname);Debug.locals.put("ColName", _colname);
 BA.debugLineNum = 2654;BA.debugLine="If Not(ColName.ToLowerCase.Contains(\"tagcode\"))";
Debug.ShouldStop(536870912);
if (appdialogs.__c.runMethod(true,"Not",(Object)(_colname.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("tagcode"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2655;BA.debugLine="ListaCampos.Add($\"TBL.${ColName}\"$)";
Debug.ShouldStop(1073741824);
_listacampos.runVoidMethod ("Add",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("TBL."),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colname))),RemoteObject.createImmutable(""))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2659;BA.debugLine="Dim SqlPesquisa As String = \"\"";
Debug.ShouldStop(4);
_sqlpesquisa = BA.ObjectToString("");Debug.locals.put("SqlPesquisa", _sqlpesquisa);Debug.locals.put("SqlPesquisa", _sqlpesquisa);
 BA.debugLineNum = 2660;BA.debugLine="For d=0 To ListaCampos.Size -1";
Debug.ShouldStop(8);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_listacampos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_d = 0 ;
for (;(step21 > 0 && _d <= limit21) || (step21 < 0 && _d >= limit21) ;_d = ((int)(0 + _d + step21))  ) {
Debug.locals.put("d", _d);
 BA.debugLineNum = 2661;BA.debugLine="Dim LFD As String = ListaCampos.Get(d)";
Debug.ShouldStop(16);
_lfd = BA.ObjectToString(_listacampos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _d))));Debug.locals.put("LFD", _lfd);Debug.locals.put("LFD", _lfd);
 BA.debugLineNum = 2662;BA.debugLine="If d=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_d),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2663;BA.debugLine="Dim SqlOPer As String = \"and\"";
Debug.ShouldStop(64);
_sqloper = BA.ObjectToString("and");Debug.locals.put("SqlOPer", _sqloper);Debug.locals.put("SqlOPer", _sqloper);
 }else {
 BA.debugLineNum = 2665;BA.debugLine="Dim SqlOPer As String = \"or\"";
Debug.ShouldStop(256);
_sqloper = BA.ObjectToString("or");Debug.locals.put("SqlOPer", _sqloper);Debug.locals.put("SqlOPer", _sqloper);
 };
 BA.debugLineNum = 2667;BA.debugLine="SqlPesquisa = SqlPesquisa & $\" ${SqlOPer} ${LFD";
Debug.ShouldStop(1024);
_sqlpesquisa = RemoteObject.concat(_sqlpesquisa,(RemoteObject.concat(RemoteObject.createImmutable(" "),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqloper))),RemoteObject.createImmutable(" "),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lfd))),RemoteObject.createImmutable(" like '%"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_boxeditsearchedvalue" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("%'"))));Debug.locals.put("SqlPesquisa", _sqlpesquisa);
 }
}Debug.locals.put("d", _d);
;
 BA.debugLineNum = 2669;BA.debugLine="PassScriptwithLimit = PassScript & SqlPesquisa";
Debug.ShouldStop(4096);
_passscriptwithlimit = RemoteObject.concat(__ref.getField(true,"_passscript" /*RemoteObject*/ ),_sqlpesquisa);Debug.locals.put("PassScriptwithLimit", _passscriptwithlimit);
 }else {
 BA.debugLineNum = 2671;BA.debugLine="PassScriptwithLimit = PassScript.Replace(\":__VAL";
Debug.ShouldStop(16384);
_passscriptwithlimit = __ref.getField(true,"_passscript" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString(":__VALOR")),(Object)(__ref.getField(false,"_boxeditsearchedvalue" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("PassScriptwithLimit", _passscriptwithlimit);
 };
 BA.debugLineNum = 2673;BA.debugLine="ShareCode.CurrentSerchquery = PassScriptwithLimit";
Debug.ShouldStop(65536);
appdialogs._sharecode._currentserchquery /*RemoteObject*/  = _passscriptwithlimit;
 BA.debugLineNum = 2674;BA.debugLine="PassScriptwithLimitAndFilter = PassScriptwithLimi";
Debug.ShouldStop(131072);
_passscriptwithlimitandfilter = RemoteObject.concat(_passscriptwithlimit,(RemoteObject.createImmutable(" limit 0, 25")));Debug.locals.put("PassScriptwithLimitAndFilter", _passscriptwithlimitandfilter);
 BA.debugLineNum = 2675;BA.debugLine="Log(PassScriptwithLimitAndFilter)";
Debug.ShouldStop(262144);
appdialogs.__c.runVoidMethod ("LogImpl","676677162",_passscriptwithlimitandfilter,0);
 BA.debugLineNum = 2677;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
Debug.ShouldStop(1048576);
appdialogs.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(appdialogs._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(appdialogs.__c.getField(true,"False")));
 BA.debugLineNum = 2678;BA.debugLine="Private Records2Search As ResultSet = Starter.Loc";
Debug.ShouldStop(2097152);
_records2search = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_records2search = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), appdialogs._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_passscriptwithlimitandfilter)));Debug.locals.put("Records2Search", _records2search);
 BA.debugLineNum = 2679;BA.debugLine="Dim ListLine_key As String = \"\"";
Debug.ShouldStop(4194304);
_listline_key = BA.ObjectToString("");Debug.locals.put("ListLine_key", _listline_key);Debug.locals.put("ListLine_key", _listline_key);
 BA.debugLineNum = 2680;BA.debugLine="If StartingRow > Records2Search.RowCount Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_startingrow" /*RemoteObject*/ ),BA.numberCast(double.class, _records2search.runMethod(true,"getRowCount")))) { 
 BA.debugLineNum = 2681;BA.debugLine="StartingRow = 0";
Debug.ShouldStop(16777216);
__ref.setField ("_startingrow" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 2683;BA.debugLine="Lista2Search.Clear";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lista2search" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 2684;BA.debugLine="Do While Records2Search.NextRow";
Debug.ShouldStop(134217728);
while (_records2search.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2685;BA.debugLine="For i=0 To Records2Search.ColumnCount -1";
Debug.ShouldStop(268435456);
{
final int step45 = 1;
final int limit45 = RemoteObject.solve(new RemoteObject[] {_records2search.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45) ;_i = ((int)(0 + _i + step45))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2686;BA.debugLine="If Records2Search.GetColumnName(i).ToLowerCase";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_records2search.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"toLowerCase"),BA.ObjectToString("tagcode"))) { 
 BA.debugLineNum = 2687;BA.debugLine="ListLine_key =  Records2Search.GetString(Recor";
Debug.ShouldStop(1073741824);
_listline_key = _records2search.runMethod(true,"GetString",(Object)(_records2search.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("ListLine_key", _listline_key);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2690;BA.debugLine="Lista2Search.Add(createSearchLineDetail(PassedAc";
Debug.ShouldStop(2);
__ref.getField(false,"_lista2search" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createsearchlinedetail" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_passedact" /*RemoteObject*/ )),(Object)(_records2search),(Object)(appdialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_listline_key)));
 }
;
 BA.debugLineNum = 2692;BA.debugLine="Records2Search.Close";
Debug.ShouldStop(8);
_records2search.runVoidMethod ("Close");
 BA.debugLineNum = 2693;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
appdialogs.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2696;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcreateobject_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butCreateObject_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1333);
if (RapidSub.canDelegate("butcreateobject_click")) { return __ref.runUserSub(false, "appdialogs","butcreateobject_click", __ref);}
 BA.debugLineNum = 1333;BA.debugLine="Sub butCreateObject_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1334;BA.debugLine="createObjectPanel.Visible = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_createobjectpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 1335;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butparamitem_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("ButParamItem_StateClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,957);
if (RapidSub.canDelegate("butparamitem_stateclick")) { return __ref.runUserSub(false, "appdialogs","butparamitem_stateclick", __ref, _state);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pan2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
Debug.locals.put("State", _state);
 BA.debugLineNum = 957;BA.debugLine="Sub ButParamItem_StateClick (State As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 958;BA.debugLine="Dim this As B4XStateButton = Sender";
Debug.ShouldStop(536870912);
_this = (appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 959;BA.debugLine="Log(State)";
Debug.ShouldStop(1073741824);
appdialogs.__c.runVoidMethod ("LogImpl","672744962",BA.NumberToString(_state),0);
 BA.debugLineNum = 960;BA.debugLine="Dim Pan As Panel = this.Parent";
Debug.ShouldStop(-2147483648);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _this.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getparent" /*RemoteObject*/ ).getObject());Debug.locals.put("Pan", _pan);
 BA.debugLineNum = 961;BA.debugLine="Dim Pan2 As Panel = Pan.Parent";
Debug.ShouldStop(1);
_pan2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _pan.runMethod(false,"getParent"));Debug.locals.put("Pan2", _pan2);
 BA.debugLineNum = 962;BA.debugLine="Dim sSQL As String = $\"update dta_device_params s";
Debug.ShouldStop(2);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_device_params set value_state="),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_state))),RemoteObject.createImmutable(" where tagcode='"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_pan2.runMethod(false,"getTag"))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 963;BA.debugLine="Utils.SaveSQLToLog(\"ButParamItem_StateClick\",sSQL";
Debug.ShouldStop(4);
appdialogs._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ButParamItem_StateClick")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 965;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butreqdatermj_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butReqDateRMJ_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3325);
if (RapidSub.canDelegate("butreqdatermj_click")) { return __ref.runUserSub(false, "appdialogs","butreqdatermj_click", __ref);}
RemoteObject _dd = RemoteObject.declareNull("de.donmanfred.DatePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3325;BA.debugLine="Sub butReqDateRMJ_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3326;BA.debugLine="Dim dd As DatePickerDialog";
Debug.ShouldStop(536870912);
_dd = RemoteObject.createNew ("de.donmanfred.DatePickerDialogWrapper");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3327;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(1073741824);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3328;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(-2147483648);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3329;BA.debugLine="If (DialogReqDateRMJ.EditText.Text  <> \"\") Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("!",__ref.getField(false,"_dialogreqdatermj" /*RemoteObject*/ ).runMethod(false,"getEditText").runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3330;BA.debugLine="dnow = DateTime.DateParse(DialogReqDateRMJ.text)";
Debug.ShouldStop(2);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_dialogreqdatermj" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3332;BA.debugLine="dd.Initialize(\"CalendarGetDateRMJ\", DateTime.GetY";
Debug.ShouldStop(8);
_dd.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetDateRMJ")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_dnow))),(Object)(RemoteObject.solve(new RemoteObject[] {appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_dnow)),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_dnow))));
 BA.debugLineNum = 3333;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
Debug.ShouldStop(16);
appdialogs.__c.runVoidMethod ("LogImpl","678053384",BA.NumberToString(_dd.runMethod(true,"getAccentColor")),0);
 BA.debugLineNum = 3334;BA.debugLine="dd.show(\"DialogReqDateRMJ\")";
Debug.ShouldStop(32);
_dd.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("DialogReqDateRMJ")));
 BA.debugLineNum = 3335;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butreqenddate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butReqEndDate_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3287);
if (RapidSub.canDelegate("butreqenddate_click")) { return __ref.runUserSub(false, "appdialogs","butreqenddate_click", __ref);}
RemoteObject _dd = RemoteObject.declareNull("de.donmanfred.DatePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3287;BA.debugLine="Sub butReqEndDate_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 3288;BA.debugLine="Dim dd As DatePickerDialog";
Debug.ShouldStop(8388608);
_dd = RemoteObject.createNew ("de.donmanfred.DatePickerDialogWrapper");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3289;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(16777216);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3290;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(33554432);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3291;BA.debugLine="If (DialogReqEndDate.Text  <> \"\") Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("!",__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3292;BA.debugLine="dnow = DateTime.DateParse(DialogReqEndDate.text)";
Debug.ShouldStop(134217728);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3294;BA.debugLine="dd.Initialize(\"CalendarGetEndDate\", DateTime.GetY";
Debug.ShouldStop(536870912);
_dd.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetEndDate")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_dnow))),(Object)(RemoteObject.solve(new RemoteObject[] {appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_dnow)),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_dnow))));
 BA.debugLineNum = 3296;BA.debugLine="dd.ThemeDark = True";
Debug.ShouldStop(-2147483648);
_dd.runVoidMethod ("setThemeDark",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3297;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
Debug.ShouldStop(1);
appdialogs.__c.runVoidMethod ("LogImpl","677791242",BA.NumberToString(_dd.runMethod(true,"getAccentColor")),0);
 BA.debugLineNum = 3298;BA.debugLine="dd.show(\"DialogReqEndDate\")";
Debug.ShouldStop(2);
_dd.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("DialogReqEndDate")));
 BA.debugLineNum = 3299;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butreqendtime_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butReqEndTime_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3401);
if (RapidSub.canDelegate("butreqendtime_click")) { return __ref.runUserSub(false, "appdialogs","butreqendtime_click", __ref);}
RemoteObject _but = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
RemoteObject _tt = RemoteObject.declareNull("de.donmanfred.TimePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3401;BA.debugLine="Sub butReqEndTime_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 3402;BA.debugLine="Dim but As Button = Sender";
Debug.ShouldStop(512);
_but = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_but = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("but", _but);
 BA.debugLineNum = 3403;BA.debugLine="Dim pan As Panel = but.Parent";
Debug.ShouldStop(1024);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _but.runMethod(false,"getParent"));Debug.locals.put("pan", _pan);
 BA.debugLineNum = 3404;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = pan";
Debug.ShouldStop(2048);
_currenttimeedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
_currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 6))).getObject());Debug.locals.put("CurrentTimeEdit", _currenttimeedit);
 BA.debugLineNum = 3405;BA.debugLine="Dim tt As TimePickerDialog";
Debug.ShouldStop(4096);
_tt = RemoteObject.createNew ("de.donmanfred.TimePickerDialogWrapper");Debug.locals.put("tt", _tt);
 BA.debugLineNum = 3406;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(8192);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3407;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(16384);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3408;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 3409;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("!",_currenttimeedit.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3410;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.t";
Debug.ShouldStop(131072);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currenttimeedit.runMethod(true,"getText")))),RemoteObject.createImmutable(":00")))));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3413;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHou";
Debug.ShouldStop(1048576);
_tt.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetTime")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_dnow))),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_dnow))),(Object)(appdialogs.__c.getField(true,"True")));
 BA.debugLineNum = 3415;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
Debug.ShouldStop(4194304);
_tt.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("CurrentTimeEdit")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 3417;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
appdialogs.__c.runVoidMethod ("LogImpl","678512144",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 3419;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butreqstartdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butReqStartDate_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3275);
if (RapidSub.canDelegate("butreqstartdate_click")) { return __ref.runUserSub(false, "appdialogs","butreqstartdate_click", __ref);}
RemoteObject _dd = RemoteObject.declareNull("de.donmanfred.DatePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3275;BA.debugLine="Sub butReqStartDate_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3276;BA.debugLine="Dim dd As DatePickerDialog";
Debug.ShouldStop(2048);
_dd = RemoteObject.createNew ("de.donmanfred.DatePickerDialogWrapper");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3277;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(4096);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3278;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(8192);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3279;BA.debugLine="If (DialogReqStartDate.Text  <> \"\") Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("!",__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3280;BA.debugLine="dnow = DateTime.DateParse(DialogReqStartDate.tex";
Debug.ShouldStop(32768);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3282;BA.debugLine="dd.Initialize(\"CalendarGetStartDate\", DateTime.Ge";
Debug.ShouldStop(131072);
_dd.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetStartDate")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_dnow))),(Object)(RemoteObject.solve(new RemoteObject[] {appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_dnow)),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_dnow))));
 BA.debugLineNum = 3283;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
Debug.ShouldStop(262144);
appdialogs.__c.runVoidMethod ("LogImpl","677725704",BA.NumberToString(_dd.runMethod(true,"getAccentColor")),0);
 BA.debugLineNum = 3284;BA.debugLine="dd.show(\"DialogReqStartDate\")";
Debug.ShouldStop(524288);
_dd.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("DialogReqStartDate")));
 BA.debugLineNum = 3285;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butreqstarttime_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butReqStartTime_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3381);
if (RapidSub.canDelegate("butreqstarttime_click")) { return __ref.runUserSub(false, "appdialogs","butreqstarttime_click", __ref);}
RemoteObject _but = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
RemoteObject _tt = RemoteObject.declareNull("de.donmanfred.TimePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3381;BA.debugLine="Sub butReqStartTime_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 3382;BA.debugLine="Dim but As Button = Sender";
Debug.ShouldStop(2097152);
_but = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_but = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("but", _but);
 BA.debugLineNum = 3383;BA.debugLine="Dim pan As Panel = but.Parent";
Debug.ShouldStop(4194304);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _but.runMethod(false,"getParent"));Debug.locals.put("pan", _pan);
 BA.debugLineNum = 3384;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = pan";
Debug.ShouldStop(8388608);
_currenttimeedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
_currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).getObject());Debug.locals.put("CurrentTimeEdit", _currenttimeedit);
 BA.debugLineNum = 3385;BA.debugLine="Dim tt As TimePickerDialog";
Debug.ShouldStop(16777216);
_tt = RemoteObject.createNew ("de.donmanfred.TimePickerDialogWrapper");Debug.locals.put("tt", _tt);
 BA.debugLineNum = 3386;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(33554432);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3387;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(67108864);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3388;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 3389;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("!",_currenttimeedit.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3390;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.te";
Debug.ShouldStop(536870912);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currenttimeedit.runMethod(true,"getText")))),RemoteObject.createImmutable(":00")))));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3393;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHo";
Debug.ShouldStop(1);
_tt.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetTime")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_dnow))),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_dnow))),(Object)(appdialogs.__c.getField(true,"True")));
 BA.debugLineNum = 3395;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
Debug.ShouldStop(4);
_tt.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("CurrentTimeEdit")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 3397;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
appdialogs.__c.runVoidMethod ("LogImpl","678446608",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 3399;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butreqtimermj_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butReqTimeRMJ_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3360);
if (RapidSub.canDelegate("butreqtimermj_click")) { return __ref.runUserSub(false, "appdialogs","butreqtimermj_click", __ref);}
RemoteObject _but = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
RemoteObject _tt = RemoteObject.declareNull("de.donmanfred.TimePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3360;BA.debugLine="Sub butReqTimeRMJ_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3361;BA.debugLine="Dim but As Button = Sender";
Debug.ShouldStop(1);
_but = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_but = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("but", _but);
 BA.debugLineNum = 3362;BA.debugLine="Dim pan As Panel = but.Parent";
Debug.ShouldStop(2);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _but.runMethod(false,"getParent"));Debug.locals.put("pan", _pan);
 BA.debugLineNum = 3363;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = pan";
Debug.ShouldStop(4);
_currenttimeedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
_currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 11))).getObject());Debug.locals.put("CurrentTimeEdit", _currenttimeedit);
 BA.debugLineNum = 3364;BA.debugLine="Dim tt As TimePickerDialog";
Debug.ShouldStop(8);
_tt = RemoteObject.createNew ("de.donmanfred.TimePickerDialogWrapper");Debug.locals.put("tt", _tt);
 BA.debugLineNum = 3365;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(16);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3366;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(32);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3367;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 3368;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("!",_currenttimeedit.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3369;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.T";
Debug.ShouldStop(256);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currenttimeedit.runMethod(true,"getText")))),RemoteObject.createImmutable(":00")))));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3372;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHou";
Debug.ShouldStop(2048);
_tt.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetTime")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_dnow))),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_dnow))),(Object)(appdialogs.__c.getField(true,"True")));
 BA.debugLineNum = 3374;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
Debug.ShouldStop(8192);
_tt.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("CurrentTimeEdit")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 3376;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
appdialogs.__c.runVoidMethod ("LogImpl","678381072",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 3378;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butresetapplication_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butResetApplication_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1749);
if (RapidSub.canDelegate("butresetapplication_click")) { return __ref.runUserSub(false, "appdialogs","butresetapplication_click", __ref);}
 BA.debugLineNum = 1749;BA.debugLine="Sub butResetApplication_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1750;BA.debugLine="CallSubDelayed(CurrentActivityObject, \"ResetAppli";
Debug.ShouldStop(2097152);
appdialogs.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_currentactivityobject" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("ResetApplication")));
 BA.debugLineNum = 1751;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.NEGATIVE)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")));
 BA.debugLineNum = 1752;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonassociated_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonAssociated_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3596);
if (RapidSub.canDelegate("buttonassociated_click")) { return __ref.runUserSub(false, "appdialogs","buttonassociated_click", __ref);}
 BA.debugLineNum = 3596;BA.debugLine="Sub ButtonAssociated_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 3598;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 3599;BA.debugLine="ListViewBluetoothDevices.Clear";
Debug.ShouldStop(16384);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 3600;BA.debugLine="Printer.SelectFromAssociatedPrinter";
Debug.ShouldStop(32768);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_vvvv6");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 3602;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
appdialogs.__c.runVoidMethod ("LogImpl","679364102",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 3604;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonprint_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonPrint_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3635);
if (RapidSub.canDelegate("buttonprint_click")) { __ref.runUserSub(false, "appdialogs","buttonprint_click", __ref); return;}
ResumableSub_ButtonPrint_Click rsub = new ResumableSub_ButtonPrint_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonPrint_Click extends BA.ResumableSub {
public ResumableSub_ButtonPrint_Click(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonPrint_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3635);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 3637;BA.debugLine="Try";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 3638;BA.debugLine="If Not(Printer.Connected) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_printer" /*RemoteObject*/ ).runMethod(true,"_vvv5"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3639;BA.debugLine="PrinterMessage = \"A Processar.....\"";
Debug.ShouldStop(4194304);
__ref.setField ("_printermessage" /*RemoteObject*/ ,BA.ObjectToString("A Processar....."));
 BA.debugLineNum = 3640;BA.debugLine="Printer.ClearBuffer";
Debug.ShouldStop(8388608);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_vvv3");
 BA.debugLineNum = 3641;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.BoldOn & \"X";
Debug.ShouldStop(16777216);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.concat(parent._esc_pos.getField(true,"_vv1"),RemoteObject.createImmutable("X-Evolution"),parent._esc_pos.getField(true,"_vv4"))));
 BA.debugLineNum = 3643;BA.debugLine="Printer.AddBuffer_Writeline(\"VRCG\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("VRCG")));
 BA.debugLineNum = 3644;BA.debugLine="Printer.AddBuffer_Writeline(\"VRCG\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("VRCG")));
 BA.debugLineNum = 3648;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3649;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
Debug.ShouldStop(1);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3650;BA.debugLine="Printer.SelectFromMac(CurrentPrinterConnected)";
Debug.ShouldStop(2);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_vvvv7",(Object)(BA.ObjectToString(__ref.getField(false,"_currentprinterconnected" /*RemoteObject*/ ))));
 BA.debugLineNum = 3651;BA.debugLine="Sleep(2500)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "buttonprint_click"),BA.numberCast(int.class, 2500));
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
 BA.debugLineNum = 3654;BA.debugLine="Printer.flushAllAndClose";
Debug.ShouldStop(32);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_vvv7");
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 3656;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","679560725",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 3659;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _buttonscanprinter_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonScanPrinter_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3607);
if (RapidSub.canDelegate("buttonscanprinter_click")) { __ref.runUserSub(false, "appdialogs","buttonscanprinter_click", __ref); return;}
ResumableSub_ButtonScanPrinter_Click rsub = new ResumableSub_ButtonScanPrinter_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonScanPrinter_Click extends BA.ResumableSub {
public ResumableSub_ButtonScanPrinter_Click(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonScanPrinter_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3607);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 3609;BA.debugLine="Try";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 3610;BA.debugLine="ListViewBluetoothDevices.Clear";
Debug.ShouldStop(33554432);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 3611;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_L";
Debug.ShouldStop(67108864);
__ref.getField(false,"_rp" /*RemoteObject*/ ).runVoidMethod ("CheckAndRequest",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_rp" /*RemoteObject*/ ).getField(true,"PERMISSION_ACCESS_COARSE_LOCATION")));
 BA.debugLineNum = 3612;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","activity_permissionresult", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "buttonscanprinter_click"), null);
this.state = 16;
return;
case 16:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3613;BA.debugLine="If Result = False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3614;BA.debugLine="ToastMessageShow(\"No permission...\", False)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No permission...")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 3615;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 7:
//C
this.state = 10;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 3619;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","679429644",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 3622;BA.debugLine="Try";
Debug.ShouldStop(32);

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
 BA.debugLineNum = 3623;BA.debugLine="FindPrintersBT";
Debug.ShouldStop(64);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_findprintersbt" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 3625;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","679429650",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 3628;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _activity_permissionresult(RemoteObject __ref,RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _calendargetdatermj_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalendarGetDateRMJ_onDateSet (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3317);
if (RapidSub.canDelegate("calendargetdatermj_ondateset")) { return __ref.runUserSub(false, "appdialogs","calendargetdatermj_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
RemoteObject _moy = RemoteObject.createImmutable("");
RemoteObject _dom = RemoteObject.createImmutable("");
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 3317;BA.debugLine="Sub CalendarGetDateRMJ_onDateSet(year As Int, mont";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 3318;BA.debugLine="Dim moy As String = monthOfYear+1";
Debug.ShouldStop(2097152);
_moy = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_monthofyear,RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("moy", _moy);Debug.locals.put("moy", _moy);
 BA.debugLineNum = 3319;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",_moy.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_moy = RemoteObject.concat(RemoteObject.createImmutable("0"),_moy);Debug.locals.put("moy", _moy);};
 BA.debugLineNum = 3320;BA.debugLine="Dim dom As String = dayOfMonth";
Debug.ShouldStop(8388608);
_dom = BA.NumberToString(_dayofmonth);Debug.locals.put("dom", _dom);Debug.locals.put("dom", _dom);
 BA.debugLineNum = 3321;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_dom.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_dom = RemoteObject.concat(RemoteObject.createImmutable("0"),_dom);Debug.locals.put("dom", _dom);};
 BA.debugLineNum = 3322;BA.debugLine="DialogReqDateRMJ.Text = $\"${year}-${moy}-${dom}\"$";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialogreqdatermj" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_year))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_moy))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dom))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3323;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calendargetenddate_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalendarGetEndDate_onDateSet (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3309);
if (RapidSub.canDelegate("calendargetenddate_ondateset")) { return __ref.runUserSub(false, "appdialogs","calendargetenddate_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
RemoteObject _moy = RemoteObject.createImmutable("");
RemoteObject _dom = RemoteObject.createImmutable("");
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 3309;BA.debugLine="Sub CalendarGetEndDate_onDateSet(year As Int, mont";
Debug.ShouldStop(4096);
 BA.debugLineNum = 3310;BA.debugLine="Dim moy As String = monthOfYear+1";
Debug.ShouldStop(8192);
_moy = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_monthofyear,RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("moy", _moy);Debug.locals.put("moy", _moy);
 BA.debugLineNum = 3311;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_moy.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_moy = RemoteObject.concat(RemoteObject.createImmutable("0"),_moy);Debug.locals.put("moy", _moy);};
 BA.debugLineNum = 3312;BA.debugLine="Dim dom As String = dayOfMonth";
Debug.ShouldStop(32768);
_dom = BA.NumberToString(_dayofmonth);Debug.locals.put("dom", _dom);Debug.locals.put("dom", _dom);
 BA.debugLineNum = 3313;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_dom.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_dom = RemoteObject.concat(RemoteObject.createImmutable("0"),_dom);Debug.locals.put("dom", _dom);};
 BA.debugLineNum = 3314;BA.debugLine="DialogReqEndDate.Text = $\"${year}-${moy}-${dom}\"$";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_year))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_moy))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dom))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3315;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calendargetstartdate_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalendarGetStartDate_onDateSet (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3301);
if (RapidSub.canDelegate("calendargetstartdate_ondateset")) { return __ref.runUserSub(false, "appdialogs","calendargetstartdate_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
RemoteObject _moy = RemoteObject.createImmutable("");
RemoteObject _dom = RemoteObject.createImmutable("");
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 3301;BA.debugLine="Sub CalendarGetStartDate_onDateSet(year As Int, mo";
Debug.ShouldStop(16);
 BA.debugLineNum = 3302;BA.debugLine="Dim moy As String = monthOfYear+1";
Debug.ShouldStop(32);
_moy = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_monthofyear,RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("moy", _moy);Debug.locals.put("moy", _moy);
 BA.debugLineNum = 3303;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",_moy.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_moy = RemoteObject.concat(RemoteObject.createImmutable("0"),_moy);Debug.locals.put("moy", _moy);};
 BA.debugLineNum = 3304;BA.debugLine="Dim dom As String = dayOfMonth";
Debug.ShouldStop(128);
_dom = BA.NumberToString(_dayofmonth);Debug.locals.put("dom", _dom);Debug.locals.put("dom", _dom);
 BA.debugLineNum = 3305;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_dom.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_dom = RemoteObject.concat(RemoteObject.createImmutable("0"),_dom);Debug.locals.put("dom", _dom);};
 BA.debugLineNum = 3306;BA.debugLine="DialogReqStartDate.Text = $\"${year}-${moy}-${dom}";
Debug.ShouldStop(512);
__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_year))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_moy))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dom))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3307;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calsyncedate_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalSynceDate_onDateSet (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3890);
if (RapidSub.canDelegate("calsyncedate_ondateset")) { return __ref.runUserSub(false, "appdialogs","calsyncedate_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
RemoteObject _moy = RemoteObject.createImmutable("");
RemoteObject _dom = RemoteObject.createImmutable("");
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 3890;BA.debugLine="Sub CalSynceDate_onDateSet(year As Int, monthOfYea";
Debug.ShouldStop(131072);
 BA.debugLineNum = 3891;BA.debugLine="Dim moy As String = monthOfYear+1";
Debug.ShouldStop(262144);
_moy = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_monthofyear,RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("moy", _moy);Debug.locals.put("moy", _moy);
 BA.debugLineNum = 3892;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",_moy.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_moy = RemoteObject.concat(RemoteObject.createImmutable("0"),_moy);Debug.locals.put("moy", _moy);};
 BA.debugLineNum = 3893;BA.debugLine="Dim dom As String = dayOfMonth";
Debug.ShouldStop(1048576);
_dom = BA.NumberToString(_dayofmonth);Debug.locals.put("dom", _dom);Debug.locals.put("dom", _dom);
 BA.debugLineNum = 3894;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",_dom.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_dom = RemoteObject.concat(RemoteObject.createImmutable("0"),_dom);Debug.locals.put("dom", _dom);};
 BA.debugLineNum = 3895;BA.debugLine="sync_manual_edate.Text = $\"${year}-${moy}-${dom}\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sync_manual_edate" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_year))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_moy))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dom))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3896;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calsyncidate_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalSynciDate_onDateSet (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3882);
if (RapidSub.canDelegate("calsyncidate_ondateset")) { return __ref.runUserSub(false, "appdialogs","calsyncidate_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
RemoteObject _moy = RemoteObject.createImmutable("");
RemoteObject _dom = RemoteObject.createImmutable("");
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 3882;BA.debugLine="Sub CalSynciDate_onDateSet(year As Int, monthOfYea";
Debug.ShouldStop(512);
 BA.debugLineNum = 3883;BA.debugLine="Dim moy As String = monthOfYear+1";
Debug.ShouldStop(1024);
_moy = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_monthofyear,RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("moy", _moy);Debug.locals.put("moy", _moy);
 BA.debugLineNum = 3884;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",_moy.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_moy = RemoteObject.concat(RemoteObject.createImmutable("0"),_moy);Debug.locals.put("moy", _moy);};
 BA.debugLineNum = 3885;BA.debugLine="Dim dom As String = dayOfMonth";
Debug.ShouldStop(4096);
_dom = BA.NumberToString(_dayofmonth);Debug.locals.put("dom", _dom);Debug.locals.put("dom", _dom);
 BA.debugLineNum = 3886;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("=",_dom.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_dom = RemoteObject.concat(RemoteObject.createImmutable("0"),_dom);Debug.locals.put("dom", _dom);};
 BA.debugLineNum = 3887;BA.debugLine="sync_manual_idate.Text = $\"${year}-${moy}-${dom}\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_sync_manual_idate" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_year))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_moy))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dom))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3888;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancelselectobjectbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CancelSelectObjectButton_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1404);
if (RapidSub.canDelegate("cancelselectobjectbutton_click")) { return __ref.runUserSub(false, "appdialogs","cancelselectobjectbutton_click", __ref);}
 BA.debugLineNum = 1404;BA.debugLine="Sub CancelSelectObjectButton_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1405;BA.debugLine="objectTypePanel.Visible = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_objecttypepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 1406;BA.debugLine="selectObjectPanel.Visible = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_selectobjectpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 1407;BA.debugLine="CurrentSelectedCode = \"\"";
Debug.ShouldStop(1073741824);
__ref.setField ("_currentselectedcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1408;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_currentselectedcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1409;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claobjectclear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectClear_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1366);
if (RapidSub.canDelegate("claobjectclear_click")) { return __ref.runUserSub(false, "appdialogs","claobjectclear_click", __ref);}
 BA.debugLineNum = 1366;BA.debugLine="Sub CLAObjectClear_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1367;BA.debugLine="CLAObjectList.Clear";
Debug.ShouldStop(4194304);
__ref.getField(false,"_claobjectlist" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 1368;BA.debugLine="CLAObjectDesc.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_claobjectdesc" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1369;BA.debugLine="CurrentSelectedCode = \"\"";
Debug.ShouldStop(16777216);
__ref.setField ("_currentselectedcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1370;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
Debug.ShouldStop(33554432);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_currentselectedcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1371;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _claobjectdesc_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectDesc_TextChanged (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1411);
if (RapidSub.canDelegate("claobjectdesc_textchanged")) { __ref.runUserSub(false, "appdialogs","claobjectdesc_textchanged", __ref, _old, _new); return;}
ResumableSub_CLAObjectDesc_TextChanged rsub = new ResumableSub_CLAObjectDesc_TextChanged(null,__ref,_old,_new);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLAObjectDesc_TextChanged extends BA.ResumableSub {
public ResumableSub_CLAObjectDesc_TextChanged(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _old,RemoteObject _new) {
this.parent = parent;
this.__ref = __ref;
this._old = _old;
this._new = _new;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _old;
RemoteObject _new;
RemoteObject _obtindex = RemoteObject.createImmutable(0);
RemoteObject _obgindex = RemoteObject.createImmutable(0);
RemoteObject _obtext = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectDesc_TextChanged (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1411);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1412;BA.debugLine="Dim obtIndex As Int = CLAObjectTypeSpinner.Select";
Debug.ShouldStop(8);
_obtindex = __ref.getField(false,"_claobjecttypespinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obtIndex", _obtindex);Debug.locals.put("obtIndex", _obtindex);
 BA.debugLineNum = 1413;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Selec";
Debug.ShouldStop(16);
_obgindex = __ref.getField(false,"_claobjectgroupspinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obgIndex", _obgindex);Debug.locals.put("obgIndex", _obgindex);
 BA.debugLineNum = 1414;BA.debugLine="ObjectsListIndex = 0";
Debug.ShouldStop(32);
__ref.setField ("_objectslistindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1415;BA.debugLine="Dim obtext As String = New";
Debug.ShouldStop(64);
_obtext = _new;Debug.locals.put("obtext", _obtext);Debug.locals.put("obtext", _obtext);
 BA.debugLineNum = 1416;BA.debugLine="If(Utils.NNE(obtext)) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 8;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_obtext))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1417;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtInde";
Debug.ShouldStop(256);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectslist" /*RemoteObject*/ ,(Object)(_obtindex),(Object)(_obgindex),(Object)(_obtext),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1418;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "claobjectdesc_textchanged"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 1419;BA.debugLine="If(finish) Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 7;
if ((_finish).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1420;BA.debugLine="Log(finish)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","674579977",BA.ObjectToString(_finish),0);
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
 BA.debugLineNum = 1423;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static void  _complete(RemoteObject __ref,RemoteObject _finish) throws Exception{
}
public static void  _claobjectgroupspinner_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectGroupSpinner_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1482);
if (RapidSub.canDelegate("claobjectgroupspinner_itemclick")) { __ref.runUserSub(false, "appdialogs","claobjectgroupspinner_itemclick", __ref, _position, _value); return;}
ResumableSub_CLAObjectGroupSpinner_ItemClick rsub = new ResumableSub_CLAObjectGroupSpinner_ItemClick(null,__ref,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLAObjectGroupSpinner_ItemClick extends BA.ResumableSub {
public ResumableSub_CLAObjectGroupSpinner_ItemClick(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _obtindex = RemoteObject.createImmutable(0);
RemoteObject _obgindex = RemoteObject.createImmutable(0);
RemoteObject _obtext = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectGroupSpinner_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1482);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1483;BA.debugLine="Dim obtIndex As Int = CLAObjectTypeSpinner.Select";
Debug.ShouldStop(1024);
_obtindex = __ref.getField(false,"_claobjecttypespinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obtIndex", _obtindex);Debug.locals.put("obtIndex", _obtindex);
 BA.debugLineNum = 1484;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Selec";
Debug.ShouldStop(2048);
_obgindex = __ref.getField(false,"_claobjectgroupspinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obgIndex", _obgindex);Debug.locals.put("obgIndex", _obgindex);
 BA.debugLineNum = 1485;BA.debugLine="Dim obtext As String = CLAObjectDesc.Text";
Debug.ShouldStop(4096);
_obtext = __ref.getField(false,"_claobjectdesc" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("obtext", _obtext);Debug.locals.put("obtext", _obtext);
 BA.debugLineNum = 1486;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtIndex";
Debug.ShouldStop(8192);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectslist" /*RemoteObject*/ ,(Object)(_obtindex),(Object)(_obgindex),(Object)(_obtext),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1487;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "claobjectgroupspinner_itemclick"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 1488;BA.debugLine="If(finish) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1489;BA.debugLine="Log(finish)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","674711047",BA.ObjectToString(_finish),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1491;BA.debugLine="ObjectsListIndex = 0";
Debug.ShouldStop(262144);
__ref.setField ("_objectslistindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1492;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static RemoteObject  _claobjectlist_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectList_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1325);
if (RapidSub.canDelegate("claobjectlist_itemclick")) { return __ref.runUserSub(false, "appdialogs","claobjectlist_itemclick", __ref, _index, _value);}
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1325;BA.debugLine="Sub CLAObjectList_ItemClick (Index As Int, Value A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1326;BA.debugLine="Dim pan As B4XView = CLAObjectList.GetPanel(Index";
Debug.ShouldStop(8192);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = __ref.getField(false,"_claobjectlist" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1327;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
Debug.ShouldStop(16384);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1328;BA.debugLine="lbl.Color = 0x9637FF4B";
Debug.ShouldStop(32768);
_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, 0x9637ff4b));
 BA.debugLineNum = 1329;BA.debugLine="CurrentSelectedCode = lbl.Tag";
Debug.ShouldStop(65536);
__ref.setField ("_currentselectedcode" /*RemoteObject*/ ,BA.ObjectToString(_lbl.runMethod(false,"getTag")));
 BA.debugLineNum = 1330;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
Debug.ShouldStop(131072);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_currentselectedcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1331;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _claobjectlist_reachend(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectList_ReachEnd (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1494);
if (RapidSub.canDelegate("claobjectlist_reachend")) { __ref.runUserSub(false, "appdialogs","claobjectlist_reachend", __ref); return;}
ResumableSub_CLAObjectList_ReachEnd rsub = new ResumableSub_CLAObjectList_ReachEnd(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLAObjectList_ReachEnd extends BA.ResumableSub {
public ResumableSub_CLAObjectList_ReachEnd(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _obtindex = RemoteObject.createImmutable(0);
RemoteObject _obgindex = RemoteObject.createImmutable(0);
RemoteObject _obtext = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectList_ReachEnd (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1494);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1495;BA.debugLine="ObjectsListIndex = ObjectsListIndex + 10";
Debug.ShouldStop(4194304);
__ref.setField ("_objectslistindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_objectslistindex" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "+",1, 1));
 BA.debugLineNum = 1496;BA.debugLine="Dim obtIndex As Int = CLAObjectTypeSpinner.Select";
Debug.ShouldStop(8388608);
_obtindex = __ref.getField(false,"_claobjecttypespinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obtIndex", _obtindex);Debug.locals.put("obtIndex", _obtindex);
 BA.debugLineNum = 1497;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Selec";
Debug.ShouldStop(16777216);
_obgindex = __ref.getField(false,"_claobjectgroupspinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obgIndex", _obgindex);Debug.locals.put("obgIndex", _obgindex);
 BA.debugLineNum = 1498;BA.debugLine="Dim obtext As String = CLAObjectDesc.Text";
Debug.ShouldStop(33554432);
_obtext = __ref.getField(false,"_claobjectdesc" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("obtext", _obtext);Debug.locals.put("obtext", _obtext);
 BA.debugLineNum = 1500;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtIndex";
Debug.ShouldStop(134217728);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectslist" /*RemoteObject*/ ,(Object)(_obtindex),(Object)(_obgindex),(Object)(_obtext),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1501;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "claobjectlist_reachend"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 1502;BA.debugLine="If(finish) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1503;BA.debugLine="Log(finish)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","674776585",BA.ObjectToString(_finish),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1507;BA.debugLine="End Sub";
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
public static void  _claobjecttypespinner_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectTypeSpinner_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1374);
if (RapidSub.canDelegate("claobjecttypespinner_itemclick")) { __ref.runUserSub(false, "appdialogs","claobjecttypespinner_itemclick", __ref, _position, _value); return;}
ResumableSub_CLAObjectTypeSpinner_ItemClick rsub = new ResumableSub_CLAObjectTypeSpinner_ItemClick(null,__ref,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLAObjectTypeSpinner_ItemClick extends BA.ResumableSub {
public ResumableSub_CLAObjectTypeSpinner_ItemClick(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _obtindex = RemoteObject.createImmutable(0);
RemoteObject _obgindex = RemoteObject.createImmutable(0);
RemoteObject _obtext = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLAObjectTypeSpinner_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1374);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1375;BA.debugLine="Dim obtIndex As Int = CLAObjectTypeSpinner.Select";
Debug.ShouldStop(1073741824);
_obtindex = __ref.getField(false,"_claobjecttypespinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obtIndex", _obtindex);Debug.locals.put("obtIndex", _obtindex);
 BA.debugLineNum = 1376;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Selec";
Debug.ShouldStop(-2147483648);
_obgindex = __ref.getField(false,"_claobjectgroupspinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obgIndex", _obgindex);Debug.locals.put("obgIndex", _obgindex);
 BA.debugLineNum = 1377;BA.debugLine="Dim obtext As String = CLAObjectDesc.Text";
Debug.ShouldStop(1);
_obtext = __ref.getField(false,"_claobjectdesc" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("obtext", _obtext);Debug.locals.put("obtext", _obtext);
 BA.debugLineNum = 1378;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtIndex";
Debug.ShouldStop(2);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectslist" /*RemoteObject*/ ,(Object)(_obtindex),(Object)(_obgindex),(Object)(_obtext),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1379;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "claobjecttypespinner_itemclick"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 1380;BA.debugLine="If(finish) Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1381;BA.debugLine="Log(finish)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","674317831",BA.ObjectToString(_finish),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1383;BA.debugLine="ObjectsListIndex = 0";
Debug.ShouldStop(64);
__ref.setField ("_objectslistindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1384;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private DialogFirstName As FloatLabeledEditText";
appdialogs._dialogfirstname = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogfirstname",appdialogs._dialogfirstname);
 //BA.debugLineNum = 4;BA.debugLine="Private DialogLastName As FloatLabeledEditText";
appdialogs._dialoglastname = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialoglastname",appdialogs._dialoglastname);
 //BA.debugLineNum = 5;BA.debugLine="Private DialogAge As Spinner";
appdialogs._dialogage = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogage",appdialogs._dialogage);
 //BA.debugLineNum = 6;BA.debugLine="Private CurrentActivityObject As Object";
appdialogs._currentactivityobject = RemoteObject.createNew ("Object");__ref.setField("_currentactivityobject",appdialogs._currentactivityobject);
 //BA.debugLineNum = 7;BA.debugLine="Private CurrentPosition As Int = 0";
appdialogs._currentposition = BA.numberCast(int.class, 0);__ref.setField("_currentposition",appdialogs._currentposition);
 //BA.debugLineNum = 8;BA.debugLine="Private CurrentImagesView As List";
appdialogs._currentimagesview = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_currentimagesview",appdialogs._currentimagesview);
 //BA.debugLineNum = 9;BA.debugLine="Public CurrentSelectedCode As String";
appdialogs._currentselectedcode = RemoteObject.createImmutable("");__ref.setField("_currentselectedcode",appdialogs._currentselectedcode);
 //BA.debugLineNum = 10;BA.debugLine="Public SelectedObjectTypeTagcode As String";
appdialogs._selectedobjecttypetagcode = RemoteObject.createImmutable("");__ref.setField("_selectedobjecttypetagcode",appdialogs._selectedobjecttypetagcode);
 //BA.debugLineNum = 15;BA.debugLine="Private DialogReqEntity As Spinner";
appdialogs._dialogreqentity = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqentity",appdialogs._dialogreqentity);
 //BA.debugLineNum = 16;BA.debugLine="Private DialogReqTypeRequest As Spinner";
appdialogs._dialogreqtyperequest = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqtyperequest",appdialogs._dialogreqtyperequest);
 //BA.debugLineNum = 17;BA.debugLine="Private DialogReqStartDate As FloatLabeledEditTex";
appdialogs._dialogreqstartdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogreqstartdate",appdialogs._dialogreqstartdate);
 //BA.debugLineNum = 18;BA.debugLine="Private DialogReqEndDate As FloatLabeledEditText";
appdialogs._dialogreqenddate = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogreqenddate",appdialogs._dialogreqenddate);
 //BA.debugLineNum = 19;BA.debugLine="Private DialogReqChecklist As Spinner";
appdialogs._dialogreqchecklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqchecklist",appdialogs._dialogreqchecklist);
 //BA.debugLineNum = 21;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
appdialogs._appldialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_appldialog",appdialogs._appldialog);
 //BA.debugLineNum = 22;BA.debugLine="Private DialogQuantityValue As FloatLabeledEditTe";
appdialogs._dialogquantityvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogquantityvalue",appdialogs._dialogquantityvalue);
 //BA.debugLineNum = 23;BA.debugLine="Private ReturnQuantityValue As Int = 0";
appdialogs._returnquantityvalue = BA.numberCast(int.class, 0);__ref.setField("_returnquantityvalue",appdialogs._returnquantityvalue);
 //BA.debugLineNum = 24;BA.debugLine="Private ThisActivity As Activity";
appdialogs._thisactivity = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_thisactivity",appdialogs._thisactivity);
 //BA.debugLineNum = 25;BA.debugLine="Private ThisActivityName As Object";
appdialogs._thisactivityname = RemoteObject.createNew ("Object");__ref.setField("_thisactivityname",appdialogs._thisactivityname);
 //BA.debugLineNum = 26;BA.debugLine="Private ThisRequestData As RequestData";
appdialogs._thisrequestdata = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestdata");__ref.setField("_thisrequestdata",appdialogs._thisrequestdata);
 //BA.debugLineNum = 28;BA.debugLine="Private adps As List";
appdialogs._adps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_adps",appdialogs._adps);
 //BA.debugLineNum = 29;BA.debugLine="Private butReqEndDate As Button";
appdialogs._butreqenddate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butreqenddate",appdialogs._butreqenddate);
 //BA.debugLineNum = 30;BA.debugLine="Private butReqStartDate As Button";
appdialogs._butreqstartdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butreqstartdate",appdialogs._butreqstartdate);
 //BA.debugLineNum = 31;BA.debugLine="Private LGO_PasswordMode As Boolean = True";
appdialogs._lgo_passwordmode = appdialogs.__c.getField(true,"True");__ref.setField("_lgo_passwordmode",appdialogs._lgo_passwordmode);
 //BA.debugLineNum = 35;BA.debugLine="Private mainButLoginConfig As Button";
appdialogs._mainbutloginconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_mainbutloginconfig",appdialogs._mainbutloginconfig);
 //BA.debugLineNum = 36;BA.debugLine="Private mainEditLoginUser As EditText";
appdialogs._maineditloginuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_maineditloginuser",appdialogs._maineditloginuser);
 //BA.debugLineNum = 37;BA.debugLine="Private mainEditLoginPassword As EditText";
appdialogs._maineditloginpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_maineditloginpassword",appdialogs._maineditloginpassword);
 //BA.debugLineNum = 38;BA.debugLine="Private mainButLoginShowPassword As Button";
appdialogs._mainbutloginshowpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_mainbutloginshowpassword",appdialogs._mainbutloginshowpassword);
 //BA.debugLineNum = 39;BA.debugLine="Private mainLoginReminder As CheckBox";
appdialogs._mainloginreminder = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_mainloginreminder",appdialogs._mainloginreminder);
 //BA.debugLineNum = 44;BA.debugLine="Private DialogReqType As Spinner";
appdialogs._dialogreqtype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqtype",appdialogs._dialogreqtype);
 //BA.debugLineNum = 45;BA.debugLine="Private DialogReqReason As Spinner";
appdialogs._dialogreqreason = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqreason",appdialogs._dialogreqreason);
 //BA.debugLineNum = 51;BA.debugLine="Private mainEditLoginPasswordConfirm As EditText";
appdialogs._maineditloginpasswordconfirm = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_maineditloginpasswordconfirm",appdialogs._maineditloginpasswordconfirm);
 //BA.debugLineNum = 53;BA.debugLine="Private CurrentTagcode As String = \"\"";
appdialogs._currenttagcode = BA.ObjectToString("");__ref.setField("_currenttagcode",appdialogs._currenttagcode);
 //BA.debugLineNum = 54;BA.debugLine="Private MasterTagcode As String = \"\"";
appdialogs._mastertagcode = BA.ObjectToString("");__ref.setField("_mastertagcode",appdialogs._mastertagcode);
 //BA.debugLineNum = 55;BA.debugLine="Private CurrentCLD As CustomLayoutDialog";
appdialogs._currentcld = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_currentcld",appdialogs._currentcld);
 //BA.debugLineNum = 60;BA.debugLine="Private lbltitle As Label";
appdialogs._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",appdialogs._lbltitle);
 //BA.debugLineNum = 61;BA.debugLine="Private lblsubtitle As Label";
appdialogs._lblsubtitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsubtitle",appdialogs._lblsubtitle);
 //BA.debugLineNum = 62;BA.debugLine="Private CLVDialog As CustomListView";
appdialogs._clvdialog = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvdialog",appdialogs._clvdialog);
 //BA.debugLineNum = 68;BA.debugLine="Private lblvehicleName As Label";
appdialogs._lblvehiclename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvehiclename",appdialogs._lblvehiclename);
 //BA.debugLineNum = 69;BA.debugLine="Private VIDialog As CustomListView";
appdialogs._vidialog = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_vidialog",appdialogs._vidialog);
 //BA.debugLineNum = 75;BA.debugLine="Private DialogReqPeriodType As Spinner";
appdialogs._dialogreqperiodtype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqperiodtype",appdialogs._dialogreqperiodtype);
 //BA.debugLineNum = 80;BA.debugLine="Private DialogReqTypeEntity As Spinner";
appdialogs._dialogreqtypeentity = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqtypeentity",appdialogs._dialogreqtypeentity);
 //BA.debugLineNum = 81;BA.debugLine="Private DialogReqName As FloatLabeledEditText";
appdialogs._dialogreqname = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogreqname",appdialogs._dialogreqname);
 //BA.debugLineNum = 82;BA.debugLine="Private DialogReqAddress As FloatLabeledEditText";
appdialogs._dialogreqaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogreqaddress",appdialogs._dialogreqaddress);
 //BA.debugLineNum = 83;BA.debugLine="Private DialogReqRegion As Spinner";
appdialogs._dialogreqregion = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqregion",appdialogs._dialogreqregion);
 //BA.debugLineNum = 84;BA.debugLine="Private DialogReqWithRequests As CheckBox";
appdialogs._dialogreqwithrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_dialogreqwithrequests",appdialogs._dialogreqwithrequests);
 //BA.debugLineNum = 85;BA.debugLine="Private DialogReqLocal As Spinner";
appdialogs._dialogreqlocal = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqlocal",appdialogs._dialogreqlocal);
 //BA.debugLineNum = 86;BA.debugLine="Private DialogReqStatus As Spinner";
appdialogs._dialogreqstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqstatus",appdialogs._dialogreqstatus);
 //BA.debugLineNum = 92;BA.debugLine="Private DialogReqTypeObject As Spinner";
appdialogs._dialogreqtypeobject = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqtypeobject",appdialogs._dialogreqtypeobject);
 //BA.debugLineNum = 101;BA.debugLine="Private DialogAddressType As Spinner";
appdialogs._dialogaddresstype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogaddresstype",appdialogs._dialogaddresstype);
 //BA.debugLineNum = 102;BA.debugLine="Private DialogAddressName As FloatLabeledEditText";
appdialogs._dialogaddressname = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogaddressname",appdialogs._dialogaddressname);
 //BA.debugLineNum = 103;BA.debugLine="Private DialogAddressName2 As FloatLabeledEditTex";
appdialogs._dialogaddressname2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogaddressname2",appdialogs._dialogaddressname2);
 //BA.debugLineNum = 104;BA.debugLine="Private DialogAddressCity As FloatLabeledEditText";
appdialogs._dialogaddresscity = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogaddresscity",appdialogs._dialogaddresscity);
 //BA.debugLineNum = 105;BA.debugLine="Private DialogAddressPostalCode As FloatLabeledEd";
appdialogs._dialogaddresspostalcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogaddresspostalcode",appdialogs._dialogaddresspostalcode);
 //BA.debugLineNum = 106;BA.debugLine="Private DialogAddressLatitude As FloatLabeledEdit";
appdialogs._dialogaddresslatitude = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogaddresslatitude",appdialogs._dialogaddresslatitude);
 //BA.debugLineNum = 107;BA.debugLine="Private DialogAddressLongitude As FloatLabeledEdi";
appdialogs._dialogaddresslongitude = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogaddresslongitude",appdialogs._dialogaddresslongitude);
 //BA.debugLineNum = 113;BA.debugLine="Private DialogContactType As Spinner";
appdialogs._dialogcontacttype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogcontacttype",appdialogs._dialogcontacttype);
 //BA.debugLineNum = 114;BA.debugLine="Private DialogContactName As FloatLabeledEditText";
appdialogs._dialogcontactname = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogcontactname",appdialogs._dialogcontactname);
 //BA.debugLineNum = 115;BA.debugLine="Private DialogContactTitle As FloatLabeledEditTex";
appdialogs._dialogcontacttitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogcontacttitle",appdialogs._dialogcontacttitle);
 //BA.debugLineNum = 116;BA.debugLine="Private DialogContactEmail As FloatLabeledEditTex";
appdialogs._dialogcontactemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogcontactemail",appdialogs._dialogcontactemail);
 //BA.debugLineNum = 117;BA.debugLine="Private DialogContactPhone As FloatLabeledEditTex";
appdialogs._dialogcontactphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogcontactphone",appdialogs._dialogcontactphone);
 //BA.debugLineNum = 123;BA.debugLine="Private DialogPropertyValue As FloatLabeledEditTe";
appdialogs._dialogpropertyvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogpropertyvalue",appdialogs._dialogpropertyvalue);
 //BA.debugLineNum = 124;BA.debugLine="Private DialogPropertyTitle As Label";
appdialogs._dialogpropertytitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dialogpropertytitle",appdialogs._dialogpropertytitle);
 //BA.debugLineNum = 129;BA.debugLine="Private ConfigEditVersion As Spinner";
appdialogs._configeditversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_configeditversion",appdialogs._configeditversion);
 //BA.debugLineNum = 130;BA.debugLine="Private ConfigEditInstance As FloatLabeledEditTex";
appdialogs._configeditinstance = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_configeditinstance",appdialogs._configeditinstance);
 //BA.debugLineNum = 131;BA.debugLine="Private ConfigEditAuth As FloatLabeledEditText";
appdialogs._configeditauth = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_configeditauth",appdialogs._configeditauth);
 //BA.debugLineNum = 132;BA.debugLine="Private DialogReqZone As Spinner";
appdialogs._dialogreqzone = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqzone",appdialogs._dialogreqzone);
 //BA.debugLineNum = 133;BA.debugLine="Private DialogReqUpdated As Spinner";
appdialogs._dialogrequpdated = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogrequpdated",appdialogs._dialogrequpdated);
 //BA.debugLineNum = 134;BA.debugLine="Private butReqEndTime As Button";
appdialogs._butreqendtime = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butreqendtime",appdialogs._butreqendtime);
 //BA.debugLineNum = 135;BA.debugLine="Private butReqStartTime As Button";
appdialogs._butreqstarttime = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butreqstarttime",appdialogs._butreqstarttime);
 //BA.debugLineNum = 136;BA.debugLine="Private DialogReqStartTime As FloatLabeledEditTex";
appdialogs._dialogreqstarttime = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogreqstarttime",appdialogs._dialogreqstarttime);
 //BA.debugLineNum = 137;BA.debugLine="Private DialogReqEndTime As FloatLabeledEditText";
appdialogs._dialogreqendtime = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogreqendtime",appdialogs._dialogreqendtime);
 //BA.debugLineNum = 138;BA.debugLine="Private DialogReqTime As Spinner";
appdialogs._dialogreqtime = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqtime",appdialogs._dialogreqtime);
 //BA.debugLineNum = 139;BA.debugLine="Private DialogDevicePhone As Label";
appdialogs._dialogdevicephone = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dialogdevicephone",appdialogs._dialogdevicephone);
 //BA.debugLineNum = 140;BA.debugLine="Private DialogDeviceDimension As Label";
appdialogs._dialogdevicedimension = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dialogdevicedimension",appdialogs._dialogdevicedimension);
 //BA.debugLineNum = 141;BA.debugLine="Private DialogDeviceDescription As Label";
appdialogs._dialogdevicedescription = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dialogdevicedescription",appdialogs._dialogdevicedescription);
 //BA.debugLineNum = 147;BA.debugLine="Private ConfigEditOrientation As Spinner";
appdialogs._configeditorientation = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_configeditorientation",appdialogs._configeditorientation);
 //BA.debugLineNum = 148;BA.debugLine="Private IntputTextField As FloatLabeledEditText";
appdialogs._intputtextfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_intputtextfield",appdialogs._intputtextfield);
 //BA.debugLineNum = 149;BA.debugLine="Private SelectOrientation As Spinner";
appdialogs._selectorientation = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_selectorientation",appdialogs._selectorientation);
 //BA.debugLineNum = 150;BA.debugLine="Private ListItemsList As CustomListView";
appdialogs._listitemslist = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_listitemslist",appdialogs._listitemslist);
 //BA.debugLineNum = 151;BA.debugLine="Private ListItemsListChk As CustomListView ' ALTE";
appdialogs._listitemslistchk = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_listitemslistchk",appdialogs._listitemslistchk);
 //BA.debugLineNum = 152;BA.debugLine="Private ListItemDesc As Label";
appdialogs._listitemdesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemdesc",appdialogs._listitemdesc);
 //BA.debugLineNum = 153;BA.debugLine="Private butResetApplication As Button";
appdialogs._butresetapplication = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butresetapplication",appdialogs._butresetapplication);
 //BA.debugLineNum = 154;BA.debugLine="Private ShowImageView As ImageView";
appdialogs._showimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_showimageview",appdialogs._showimageview);
 //BA.debugLineNum = 155;BA.debugLine="Private DialogReqRoute As Spinner";
appdialogs._dialogreqroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqroute",appdialogs._dialogreqroute);
 //BA.debugLineNum = 156;BA.debugLine="Private leftPreviewImage As Label";
appdialogs._leftpreviewimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_leftpreviewimage",appdialogs._leftpreviewimage);
 //BA.debugLineNum = 157;BA.debugLine="Private rightPreviewImage As Label";
appdialogs._rightpreviewimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_rightpreviewimage",appdialogs._rightpreviewimage);
 //BA.debugLineNum = 158;BA.debugLine="Private lblGroupTitle As Label";
appdialogs._lblgrouptitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgrouptitle",appdialogs._lblgrouptitle);
 //BA.debugLineNum = 159;BA.debugLine="Private lblLineData As Label";
appdialogs._lbllinedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbllinedata",appdialogs._lbllinedata);
 //BA.debugLineNum = 160;BA.debugLine="Private lblLineHeader As Label";
appdialogs._lbllineheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbllineheader",appdialogs._lbllineheader);
 //BA.debugLineNum = 161;BA.debugLine="Private HiddenListItemLabel As Object";
appdialogs._hiddenlistitemlabel = RemoteObject.createNew ("Object");__ref.setField("_hiddenlistitemlabel",appdialogs._hiddenlistitemlabel);
 //BA.debugLineNum = 162;BA.debugLine="Private HiddenListItemTagList As TagListType";
appdialogs._hiddenlistitemtaglist = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._taglisttype");__ref.setField("_hiddenlistitemtaglist",appdialogs._hiddenlistitemtaglist);
 //BA.debugLineNum = 163;BA.debugLine="Private ParamItemsList As CustomListView";
appdialogs._paramitemslist = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_paramitemslist",appdialogs._paramitemslist);
 //BA.debugLineNum = 164;BA.debugLine="Private ButParamItem As B4XStateButton";
appdialogs._butparamitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_butparamitem",appdialogs._butparamitem);
 //BA.debugLineNum = 165;BA.debugLine="Private ThisTagItem As TagListType";
appdialogs._thistagitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._taglisttype");__ref.setField("_thistagitem",appdialogs._thistagitem);
 //BA.debugLineNum = 167;BA.debugLine="Private ThisStartDate As Label";
appdialogs._thisstartdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_thisstartdate",appdialogs._thisstartdate);
 //BA.debugLineNum = 168;BA.debugLine="Private CheckValueEdit As EditText";
appdialogs._checkvalueedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_checkvalueedit",appdialogs._checkvalueedit);
 //BA.debugLineNum = 169;BA.debugLine="Private ValidationButton As Button";
appdialogs._validationbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_validationbutton",appdialogs._validationbutton);
 //BA.debugLineNum = 170;BA.debugLine="Private ResultDataLabel As Label";
appdialogs._resultdatalabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_resultdatalabel",appdialogs._resultdatalabel);
 //BA.debugLineNum = 171;BA.debugLine="Private ROBut_09 As Button";
appdialogs._robut_09 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_09",appdialogs._robut_09);
 //BA.debugLineNum = 172;BA.debugLine="Private ROBut_08 As Button";
appdialogs._robut_08 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_08",appdialogs._robut_08);
 //BA.debugLineNum = 173;BA.debugLine="Private ROBut_07 As Button";
appdialogs._robut_07 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_07",appdialogs._robut_07);
 //BA.debugLineNum = 174;BA.debugLine="Private ROBut_06 As Button";
appdialogs._robut_06 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_06",appdialogs._robut_06);
 //BA.debugLineNum = 175;BA.debugLine="Private ROBut_05 As Button";
appdialogs._robut_05 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_05",appdialogs._robut_05);
 //BA.debugLineNum = 176;BA.debugLine="Private ROBut_04 As Button";
appdialogs._robut_04 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_04",appdialogs._robut_04);
 //BA.debugLineNum = 177;BA.debugLine="Private ROBut_03 As Button";
appdialogs._robut_03 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_03",appdialogs._robut_03);
 //BA.debugLineNum = 178;BA.debugLine="Private ROBut_02 As Button";
appdialogs._robut_02 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_02",appdialogs._robut_02);
 //BA.debugLineNum = 179;BA.debugLine="Private ROBut_01 As Button";
appdialogs._robut_01 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_robut_01",appdialogs._robut_01);
 //BA.debugLineNum = 180;BA.debugLine="Private EditParamItem As EditText";
appdialogs._editparamitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_editparamitem",appdialogs._editparamitem);
 //BA.debugLineNum = 181;BA.debugLine="Private PushRequestEdit As EditText";
appdialogs._pushrequestedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_pushrequestedit",appdialogs._pushrequestedit);
 //BA.debugLineNum = 182;BA.debugLine="Private ListItemsRequest As CustomListView";
appdialogs._listitemsrequest = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_listitemsrequest",appdialogs._listitemsrequest);
 //BA.debugLineNum = 183;BA.debugLine="Private LastIndexList As Int = 0";
appdialogs._lastindexlist = BA.numberCast(int.class, 0);__ref.setField("_lastindexlist",appdialogs._lastindexlist);
 //BA.debugLineNum = 185;BA.debugLine="Private TBSingular As ToggleButton";
appdialogs._tbsingular = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tbsingular",appdialogs._tbsingular);
 //BA.debugLineNum = 186;BA.debugLine="Private TBPlural As ToggleButton";
appdialogs._tbplural = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tbplural",appdialogs._tbplural);
 //BA.debugLineNum = 187;BA.debugLine="Private TBActive As ToggleButton";
appdialogs._tbactive = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tbactive",appdialogs._tbactive);
 //BA.debugLineNum = 188;BA.debugLine="Private TBInactive As ToggleButton";
appdialogs._tbinactive = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tbinactive",appdialogs._tbinactive);
 //BA.debugLineNum = 189;BA.debugLine="Private TB001 As ToggleButton";
appdialogs._tb001 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tb001",appdialogs._tb001);
 //BA.debugLineNum = 190;BA.debugLine="Private TB002 As ToggleButton";
appdialogs._tb002 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tb002",appdialogs._tb002);
 //BA.debugLineNum = 191;BA.debugLine="Private TB003 As ToggleButton";
appdialogs._tb003 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tb003",appdialogs._tb003);
 //BA.debugLineNum = 192;BA.debugLine="Private TB004 As ToggleButton";
appdialogs._tb004 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tb004",appdialogs._tb004);
 //BA.debugLineNum = 193;BA.debugLine="Private TB005 As ToggleButton";
appdialogs._tb005 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");__ref.setField("_tb005",appdialogs._tb005);
 //BA.debugLineNum = 194;BA.debugLine="Private CLAObjectList As CustomListView";
appdialogs._claobjectlist = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_claobjectlist",appdialogs._claobjectlist);
 //BA.debugLineNum = 195;BA.debugLine="Private CancelSelectObjectButton As Button";
appdialogs._cancelselectobjectbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_cancelselectobjectbutton",appdialogs._cancelselectobjectbutton);
 //BA.debugLineNum = 196;BA.debugLine="Private CLAObjectDesc As EditText";
appdialogs._claobjectdesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_claobjectdesc",appdialogs._claobjectdesc);
 //BA.debugLineNum = 197;BA.debugLine="Private suggestObjectButton As Button";
appdialogs._suggestobjectbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_suggestobjectbutton",appdialogs._suggestobjectbutton);
 //BA.debugLineNum = 198;BA.debugLine="Private CLAObjectFind As Button";
appdialogs._claobjectfind = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_claobjectfind",appdialogs._claobjectfind);
 //BA.debugLineNum = 199;BA.debugLine="Private CLAObjectClear As Button";
appdialogs._claobjectclear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_claobjectclear",appdialogs._claobjectclear);
 //BA.debugLineNum = 200;BA.debugLine="Private CLAObjectGroupSpinner As Spinner";
appdialogs._claobjectgroupspinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_claobjectgroupspinner",appdialogs._claobjectgroupspinner);
 //BA.debugLineNum = 201;BA.debugLine="Private CLAObjectTypeSpinner As Spinner";
appdialogs._claobjecttypespinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_claobjecttypespinner",appdialogs._claobjecttypespinner);
 //BA.debugLineNum = 202;BA.debugLine="Private createObjectConfirmButton As Button";
appdialogs._createobjectconfirmbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_createobjectconfirmbutton",appdialogs._createobjectconfirmbutton);
 //BA.debugLineNum = 203;BA.debugLine="Private createObjectCancelButton As Button";
appdialogs._createobjectcancelbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_createobjectcancelbutton",appdialogs._createobjectcancelbutton);
 //BA.debugLineNum = 204;BA.debugLine="Private ObjectTypeListView As CustomListView";
appdialogs._objecttypelistview = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_objecttypelistview",appdialogs._objecttypelistview);
 //BA.debugLineNum = 205;BA.debugLine="Private selectObjectPanel As Panel";
appdialogs._selectobjectpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_selectobjectpanel",appdialogs._selectobjectpanel);
 //BA.debugLineNum = 206;BA.debugLine="Private objectTypePanel As Panel";
appdialogs._objecttypepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_objecttypepanel",appdialogs._objecttypepanel);
 //BA.debugLineNum = 207;BA.debugLine="Private createObjectPanel As Panel";
appdialogs._createobjectpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_createobjectpanel",appdialogs._createobjectpanel);
 //BA.debugLineNum = 208;BA.debugLine="Private lblGroupObjectTitle As Label";
appdialogs._lblgroupobjecttitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgroupobjecttitle",appdialogs._lblgroupobjecttitle);
 //BA.debugLineNum = 209;BA.debugLine="Private ObjectsListIndex As Int = 0";
appdialogs._objectslistindex = BA.numberCast(int.class, 0);__ref.setField("_objectslistindex",appdialogs._objectslistindex);
 //BA.debugLineNum = 211;BA.debugLine="Private OBJ_Types As List";
appdialogs._obj_types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_obj_types",appdialogs._obj_types);
 //BA.debugLineNum = 212;BA.debugLine="Private OBJ_Groups As List";
appdialogs._obj_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_obj_groups",appdialogs._obj_groups);
 //BA.debugLineNum = 219;BA.debugLine="Private ListViewBluetoothDevices As ListView";
appdialogs._listviewbluetoothdevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_listviewbluetoothdevices",appdialogs._listviewbluetoothdevices);
 //BA.debugLineNum = 220;BA.debugLine="Private Printer As BT_Printer";
appdialogs._printer = RemoteObject.createNew ("b4a.example.bt_printer");__ref.setField("_printer",appdialogs._printer);
 //BA.debugLineNum = 221;BA.debugLine="Private rp As RuntimePermissions";
appdialogs._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",appdialogs._rp);
 //BA.debugLineNum = 222;BA.debugLine="Private CurrentPrinterConnected As Object";
appdialogs._currentprinterconnected = RemoteObject.createNew ("Object");__ref.setField("_currentprinterconnected",appdialogs._currentprinterconnected);
 //BA.debugLineNum = 223;BA.debugLine="Private ButtonAssociated As Button";
appdialogs._buttonassociated = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonassociated",appdialogs._buttonassociated);
 //BA.debugLineNum = 224;BA.debugLine="Private ButtonScanPrinter As Button";
appdialogs._buttonscanprinter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonscanprinter",appdialogs._buttonscanprinter);
 //BA.debugLineNum = 225;BA.debugLine="Private ButtonPrint As Button";
appdialogs._buttonprint = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonprint",appdialogs._buttonprint);
 //BA.debugLineNum = 226;BA.debugLine="Private PrinterMessage As String";
appdialogs._printermessage = RemoteObject.createImmutable("");__ref.setField("_printermessage",appdialogs._printermessage);
 //BA.debugLineNum = 227;BA.debugLine="Private DialogDeviceVersion As Label";
appdialogs._dialogdeviceversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dialogdeviceversion",appdialogs._dialogdeviceversion);
 //BA.debugLineNum = 229;BA.debugLine="Private FilterLabelTipoIntervencao As Label";
appdialogs._filterlabeltipointervencao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_filterlabeltipointervencao",appdialogs._filterlabeltipointervencao);
 //BA.debugLineNum = 230;BA.debugLine="Private FilterLabelEntidade As Label";
appdialogs._filterlabelentidade = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_filterlabelentidade",appdialogs._filterlabelentidade);
 //BA.debugLineNum = 231;BA.debugLine="Private FilterLabelEstadosIntervencao As Label";
appdialogs._filterlabelestadosintervencao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_filterlabelestadosintervencao",appdialogs._filterlabelestadosintervencao);
 //BA.debugLineNum = 232;BA.debugLine="Private FilterLabelDataInicio As Label";
appdialogs._filterlabeldatainicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_filterlabeldatainicio",appdialogs._filterlabeldatainicio);
 //BA.debugLineNum = 233;BA.debugLine="Private FilterLabelDataFim As Label";
appdialogs._filterlabeldatafim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_filterlabeldatafim",appdialogs._filterlabeldatafim);
 //BA.debugLineNum = 234;BA.debugLine="Private FilterLabelTipoChecklist As Label";
appdialogs._filterlabeltipochecklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_filterlabeltipochecklist",appdialogs._filterlabeltipochecklist);
 //BA.debugLineNum = 235;BA.debugLine="Private FilterLabelRota As Label";
appdialogs._filterlabelrota = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_filterlabelrota",appdialogs._filterlabelrota);
 //BA.debugLineNum = 240;BA.debugLine="Private DialogReqCause As Spinner";
appdialogs._dialogreqcause = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqcause",appdialogs._dialogreqcause);
 //BA.debugLineNum = 241;BA.debugLine="Private DialogReqDateRMJ As FloatLabeledEditText";
appdialogs._dialogreqdatermj = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogreqdatermj",appdialogs._dialogreqdatermj);
 //BA.debugLineNum = 242;BA.debugLine="Private DialogReqTimeRMJ As FloatLabeledEditText";
appdialogs._dialogreqtimermj = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dialogreqtimermj",appdialogs._dialogreqtimermj);
 //BA.debugLineNum = 243;BA.debugLine="Private butReqDateRMJ As Button";
appdialogs._butreqdatermj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butreqdatermj",appdialogs._butreqdatermj);
 //BA.debugLineNum = 244;BA.debugLine="Private butReqTimeRMJ As Button";
appdialogs._butreqtimermj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butreqtimermj",appdialogs._butreqtimermj);
 //BA.debugLineNum = 245;BA.debugLine="Private textoRMJ As ACEditText";
appdialogs._textormj = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACEditTextWrapper");__ref.setField("_textormj",appdialogs._textormj);
 //BA.debugLineNum = 246;BA.debugLine="Private Painel_Historico_RMJ As Panel";
appdialogs._painel_historico_rmj = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_painel_historico_rmj",appdialogs._painel_historico_rmj);
 //BA.debugLineNum = 247;BA.debugLine="Private DialogReqReasonRMJ As Spinner";
appdialogs._dialogreqreasonrmj = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqreasonrmj",appdialogs._dialogreqreasonrmj);
 //BA.debugLineNum = 248;BA.debugLine="Private DialogReqCauseRMJ As Spinner";
appdialogs._dialogreqcausermj = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dialogreqcausermj",appdialogs._dialogreqcausermj);
 //BA.debugLineNum = 249;BA.debugLine="Private EditTextJustificacaoRMJ As EditText";
appdialogs._edittextjustificacaormj = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittextjustificacaormj",appdialogs._edittextjustificacaormj);
 //BA.debugLineNum = 254;BA.debugLine="Private BoxEditFullText As EditText";
appdialogs._boxeditfulltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_boxeditfulltext",appdialogs._boxeditfulltext);
 //BA.debugLineNum = 260;BA.debugLine="Private BoxEditSearchedValue As EditText";
appdialogs._boxeditsearchedvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_boxeditsearchedvalue",appdialogs._boxeditsearchedvalue);
 //BA.debugLineNum = 261;BA.debugLine="Private PassScript As String";
appdialogs._passscript = RemoteObject.createImmutable("");__ref.setField("_passscript",appdialogs._passscript);
 //BA.debugLineNum = 262;BA.debugLine="Private mapList As Map";
appdialogs._maplist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_maplist",appdialogs._maplist);
 //BA.debugLineNum = 263;BA.debugLine="Private SearchDummy As String";
appdialogs._searchdummy = RemoteObject.createImmutable("");__ref.setField("_searchdummy",appdialogs._searchdummy);
 //BA.debugLineNum = 264;BA.debugLine="Private btnUserFilter As Button";
appdialogs._btnuserfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnuserfilter",appdialogs._btnuserfilter);
 //BA.debugLineNum = 265;BA.debugLine="Private lblSearchChoosenItem As Label";
appdialogs._lblsearchchoosenitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsearchchoosenitem",appdialogs._lblsearchchoosenitem);
 //BA.debugLineNum = 266;BA.debugLine="Private Lista2Search As CustomListView";
appdialogs._lista2search = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_lista2search",appdialogs._lista2search);
 //BA.debugLineNum = 267;BA.debugLine="Private label2search1 As Label";
appdialogs._label2search1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2search1",appdialogs._label2search1);
 //BA.debugLineNum = 268;BA.debugLine="Private PassedAct As Activity";
appdialogs._passedact = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_passedact",appdialogs._passedact);
 //BA.debugLineNum = 269;BA.debugLine="Private StartingRow As Int = 0";
appdialogs._startingrow = BA.numberCast(int.class, 0);__ref.setField("_startingrow",appdialogs._startingrow);
 //BA.debugLineNum = 270;BA.debugLine="Private NextStartingRow As Int = 0";
appdialogs._nextstartingrow = BA.numberCast(int.class, 0);__ref.setField("_nextstartingrow",appdialogs._nextstartingrow);
 //BA.debugLineNum = 271;BA.debugLine="Private ReadRows As Int = 25";
appdialogs._readrows = BA.numberCast(int.class, 25);__ref.setField("_readrows",appdialogs._readrows);
 //BA.debugLineNum = 274;BA.debugLine="Private ListaOutros As CustomListView";
appdialogs._listaoutros = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_listaoutros",appdialogs._listaoutros);
 //BA.debugLineNum = 275;BA.debugLine="Private editTextOutros As EditText";
appdialogs._edittextoutros = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittextoutros",appdialogs._edittextoutros);
 //BA.debugLineNum = 276;BA.debugLine="Private lblTitleOutros As Label";
appdialogs._lbltitleoutros = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitleoutros",appdialogs._lbltitleoutros);
 //BA.debugLineNum = 282;BA.debugLine="Private sync_manual_Btn_edate As Button";
appdialogs._sync_manual_btn_edate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_sync_manual_btn_edate",appdialogs._sync_manual_btn_edate);
 //BA.debugLineNum = 283;BA.debugLine="Private sync_manual_Btn_idate As Button";
appdialogs._sync_manual_btn_idate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_sync_manual_btn_idate",appdialogs._sync_manual_btn_idate);
 //BA.debugLineNum = 284;BA.debugLine="Private sync_manual_chk1 As CheckBox";
appdialogs._sync_manual_chk1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk1",appdialogs._sync_manual_chk1);
 //BA.debugLineNum = 285;BA.debugLine="Private sync_manual_chk10 As CheckBox";
appdialogs._sync_manual_chk10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk10",appdialogs._sync_manual_chk10);
 //BA.debugLineNum = 286;BA.debugLine="Private sync_manual_chk11 As CheckBox";
appdialogs._sync_manual_chk11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk11",appdialogs._sync_manual_chk11);
 //BA.debugLineNum = 287;BA.debugLine="Private sync_manual_chk12 As CheckBox";
appdialogs._sync_manual_chk12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk12",appdialogs._sync_manual_chk12);
 //BA.debugLineNum = 288;BA.debugLine="Private sync_manual_chk2 As CheckBox";
appdialogs._sync_manual_chk2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk2",appdialogs._sync_manual_chk2);
 //BA.debugLineNum = 289;BA.debugLine="Private sync_manual_chk3 As CheckBox";
appdialogs._sync_manual_chk3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk3",appdialogs._sync_manual_chk3);
 //BA.debugLineNum = 290;BA.debugLine="Private sync_manual_chk4 As CheckBox";
appdialogs._sync_manual_chk4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk4",appdialogs._sync_manual_chk4);
 //BA.debugLineNum = 291;BA.debugLine="Private sync_manual_chk5 As CheckBox";
appdialogs._sync_manual_chk5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk5",appdialogs._sync_manual_chk5);
 //BA.debugLineNum = 292;BA.debugLine="Private sync_manual_chk6 As CheckBox";
appdialogs._sync_manual_chk6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk6",appdialogs._sync_manual_chk6);
 //BA.debugLineNum = 293;BA.debugLine="Private sync_manual_chk7 As CheckBox";
appdialogs._sync_manual_chk7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk7",appdialogs._sync_manual_chk7);
 //BA.debugLineNum = 294;BA.debugLine="Private sync_manual_chk8 As CheckBox";
appdialogs._sync_manual_chk8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk8",appdialogs._sync_manual_chk8);
 //BA.debugLineNum = 295;BA.debugLine="Private sync_manual_chk9 As CheckBox";
appdialogs._sync_manual_chk9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk9",appdialogs._sync_manual_chk9);
 //BA.debugLineNum = 296;BA.debugLine="Private sync_manual_edate As FloatLabeledEditText";
appdialogs._sync_manual_edate = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_sync_manual_edate",appdialogs._sync_manual_edate);
 //BA.debugLineNum = 297;BA.debugLine="Private sync_manual_idate As FloatLabeledEditText";
appdialogs._sync_manual_idate = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_sync_manual_idate",appdialogs._sync_manual_idate);
 //BA.debugLineNum = 298;BA.debugLine="Private sync_manual_Radio_diaria As RadioButton";
appdialogs._sync_manual_radio_diaria = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");__ref.setField("_sync_manual_radio_diaria",appdialogs._sync_manual_radio_diaria);
 //BA.debugLineNum = 299;BA.debugLine="Private sync_manual_Radio_seleccao As RadioButton";
appdialogs._sync_manual_radio_seleccao = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");__ref.setField("_sync_manual_radio_seleccao",appdialogs._sync_manual_radio_seleccao);
 //BA.debugLineNum = 300;BA.debugLine="Private sync_manual_Radio_todos As RadioButton";
appdialogs._sync_manual_radio_todos = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");__ref.setField("_sync_manual_radio_todos",appdialogs._sync_manual_radio_todos);
 //BA.debugLineNum = 301;BA.debugLine="Private sync_manual_warning As Label";
appdialogs._sync_manual_warning = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_sync_manual_warning",appdialogs._sync_manual_warning);
 //BA.debugLineNum = 302;BA.debugLine="Private sync_manual_chk_docs_templates As CheckBo";
appdialogs._sync_manual_chk_docs_templates = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_chk_docs_templates",appdialogs._sync_manual_chk_docs_templates);
 //BA.debugLineNum = 303;BA.debugLine="Private BoxEditNumberText As FloatLabeledEditText";
appdialogs._boxeditnumbertext = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_boxeditnumbertext",appdialogs._boxeditnumbertext);
 //BA.debugLineNum = 304;BA.debugLine="Private BoxEditNumberTextEDIT As EditText";
appdialogs._boxeditnumbertextedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_boxeditnumbertextedit",appdialogs._boxeditnumbertextedit);
 //BA.debugLineNum = 305;BA.debugLine="Private DataVazia As Boolean = True";
appdialogs._datavazia = appdialogs.__c.getField(true,"True");__ref.setField("_datavazia",appdialogs._datavazia);
 //BA.debugLineNum = 307;BA.debugLine="Private btnUserFilter As Button";
appdialogs._btnuserfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnuserfilter",appdialogs._btnuserfilter);
 //BA.debugLineNum = 308;BA.debugLine="Private lblSearchChoosenItem As Label";
appdialogs._lblsearchchoosenitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsearchchoosenitem",appdialogs._lblsearchchoosenitem);
 //BA.debugLineNum = 311;BA.debugLine="Private sync_manual_downloadrunfirstintall As Che";
appdialogs._sync_manual_downloadrunfirstintall = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_downloadrunfirstintall",appdialogs._sync_manual_downloadrunfirstintall);
 //BA.debugLineNum = 312;BA.debugLine="Private sync_manual_runfirstintall As CheckBox";
appdialogs._sync_manual_runfirstintall = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_sync_manual_runfirstintall",appdialogs._sync_manual_runfirstintall);
 //BA.debugLineNum = 313;BA.debugLine="Private PanelMestres As Panel";
appdialogs._panelmestres = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panelmestres",appdialogs._panelmestres);
 //BA.debugLineNum = 314;BA.debugLine="Private sync_manual_Radio_mestres As RadioButton";
appdialogs._sync_manual_radio_mestres = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");__ref.setField("_sync_manual_radio_mestres",appdialogs._sync_manual_radio_mestres);
 //BA.debugLineNum = 315;BA.debugLine="Private DisclaimerMestres As Label";
appdialogs._disclaimermestres = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_disclaimermestres",appdialogs._disclaimermestres);
 //BA.debugLineNum = 316;BA.debugLine="Private panel_SyncManual_Upload As Panel";
appdialogs._panel_syncmanual_upload = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel_syncmanual_upload",appdialogs._panel_syncmanual_upload);
 //BA.debugLineNum = 317;BA.debugLine="Private panel_SyncManual_Download As Panel";
appdialogs._panel_syncmanual_download = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel_syncmanual_download",appdialogs._panel_syncmanual_download);
 //BA.debugLineNum = 318;BA.debugLine="Private btn_Upload_SyncManual As Button";
appdialogs._btn_upload_syncmanual = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btn_upload_syncmanual",appdialogs._btn_upload_syncmanual);
 //BA.debugLineNum = 319;BA.debugLine="Private btn_Download_SyncManual As Button";
appdialogs._btn_download_syncmanual = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btn_download_syncmanual",appdialogs._btn_download_syncmanual);
 //BA.debugLineNum = 320;BA.debugLine="Private lstOfflineData As CustomListView";
appdialogs._lstofflinedata = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_lstofflinedata",appdialogs._lstofflinedata);
 //BA.debugLineNum = 321;BA.debugLine="Private ChkReqOffline As CheckBox";
appdialogs._chkreqoffline = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_chkreqoffline",appdialogs._chkreqoffline);
 //BA.debugLineNum = 322;BA.debugLine="Private txtReqOffline As EditText";
appdialogs._txtreqoffline = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtreqoffline",appdialogs._txtreqoffline);
 //BA.debugLineNum = 323;BA.debugLine="Private CurrActiv As Activity";
appdialogs._curractiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_curractiv",appdialogs._curractiv);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvdialog_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVDialog_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2333);
if (RapidSub.canDelegate("clvdialog_itemclick")) { return __ref.runUserSub(false, "appdialogs","clvdialog_itemclick", __ref, _index, _value);}
RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2333;BA.debugLine="Sub CLVDialog_ItemClick (Index As Int, Value As Ob";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2334;BA.debugLine="Dim clv As CustomListView = Sender";
Debug.ShouldStop(536870912);
_clv = (appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("clv", _clv);Debug.locals.put("clv", _clv);
 BA.debugLineNum = 2335;BA.debugLine="Dim pan As Panel = clv.GetPanel(Index)";
Debug.ShouldStop(1073741824);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _clv.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pan", _pan);
 BA.debugLineNum = 2336;BA.debugLine="Log(pan.Tag)";
Debug.ShouldStop(-2147483648);
appdialogs.__c.runVoidMethod ("LogImpl","676152835",BA.ObjectToString(_pan.runMethod(false,"getTag")),0);
 BA.debugLineNum = 2337;BA.debugLine="CurrentTagcode = pan.Tag";
Debug.ShouldStop(1);
__ref.setField ("_currenttagcode" /*RemoteObject*/ ,BA.ObjectToString(_pan.runMethod(false,"getTag")));
 BA.debugLineNum = 2338;BA.debugLine="CallSub3(ThisActivityName, \"ChangeUserEquipment\",";
Debug.ShouldStop(2);
appdialogs.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_thisactivityname" /*RemoteObject*/ )),(Object)(BA.ObjectToString("ChangeUserEquipment")),(Object)((__ref.getField(true,"_mastertagcode" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_currenttagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 2339;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(4);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 BA.debugLineNum = 2341;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcladdgrouplineitemdetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _title,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createCLADDGroupLineItemDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,637);
if (RapidSub.canDelegate("createcladdgrouplineitemdetail")) { return __ref.runUserSub(false, "appdialogs","createcladdgrouplineitemdetail", __ref, _activ, _title, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("title", _title);
Debug.locals.put("height", _height);
 BA.debugLineNum = 637;BA.debugLine="Sub createCLADDGroupLineItemDetail(activ As Activi";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 638;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 639;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 640;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(-2147483648);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 641;BA.debugLine="p.LoadLayout(\"ItemGroupTitle\" )";
Debug.ShouldStop(1);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemGroupTitle")),__ref.getField(false, "ba"));
 BA.debugLineNum = 642;BA.debugLine="p.RemoveView";
Debug.ShouldStop(2);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 643;BA.debugLine="lblGroupTitle.text = Utils.IfNullOrEmpty(title, \"";
Debug.ShouldStop(4);
__ref.getField(false,"_lblgrouptitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_title),(Object)(RemoteObject.createImmutable("(Sem grupo)")))));
 BA.debugLineNum = 644;BA.debugLine="p.Tag = \"\"";
Debug.ShouldStop(8);
_p.runMethod(false,"setTag",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 645;BA.debugLine="Return p";
Debug.ShouldStop(16);
if (true) return _p;
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcladdlineitemdetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _tagcode,RemoteObject _title,RemoteObject _height,RemoteObject _tagitem) throws Exception{
try {
		Debug.PushSubsStack("createCLADDLineItemDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("createcladdlineitemdetail")) { return __ref.runUserSub(false, "appdialogs","createcladdlineitemdetail", __ref, _activ, _tagcode, _title, _height, _tagitem);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
Debug.locals.put("height", _height);
Debug.locals.put("TagItem", _tagitem);
 BA.debugLineNum = 648;BA.debugLine="Sub createCLADDLineItemDetail(activ As Activity, t";
Debug.ShouldStop(128);
 BA.debugLineNum = 649;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 650;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(512);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 651;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(1024);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 653;BA.debugLine="p.LoadLayout(\"ItemGroupLine\" )";
Debug.ShouldStop(4096);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemGroupLine")),__ref.getField(false, "ba"));
 BA.debugLineNum = 654;BA.debugLine="p.RemoveView";
Debug.ShouldStop(8192);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 655;BA.debugLine="lblLineHeader.text = title";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 656;BA.debugLine="lblLineHeader.tag = tagcode";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 657;BA.debugLine="p.tag = TagItem";
Debug.ShouldStop(65536);
_p.runMethod(false,"setTag",(_tagitem));
 BA.debugLineNum = 659;BA.debugLine="Return p";
Debug.ShouldStop(262144);
if (true) return _p;
 BA.debugLineNum = 660;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdoublelineitem(RemoteObject __ref,RemoteObject _activ,RemoteObject _title,RemoteObject _subtitle,RemoteObject _height,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("createDoubleLineItem (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2358);
if (RapidSub.canDelegate("createdoublelineitem")) { return __ref.runUserSub(false, "appdialogs","createdoublelineitem", __ref, _activ, _title, _subtitle, _height, _tag);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("title", _title);
Debug.locals.put("subtitle", _subtitle);
Debug.locals.put("height", _height);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 2358;BA.debugLine="Sub createDoubleLineItem(activ As Activity, title";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 2359;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 2360;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2361;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(16777216);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 2362;BA.debugLine="p.LoadLayout(\"listdoublelineitem\" ) '_device_2\")";
Debug.ShouldStop(33554432);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listdoublelineitem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2363;BA.debugLine="p.RemoveView";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 2364;BA.debugLine="lbltitle.text = title";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 2365;BA.debugLine="lblsubtitle.text = subtitle";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblsubtitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_subtitle));
 BA.debugLineNum = 2366;BA.debugLine="p.Tag = tag";
Debug.ShouldStop(536870912);
_p.runMethod(false,"setTag",(_tag));
 BA.debugLineNum = 2367;BA.debugLine="Return p";
Debug.ShouldStop(1073741824);
if (true) return _p;
 BA.debugLineNum = 2368;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlstofflinedata(RemoteObject __ref,RemoteObject _req,RemoteObject _checkedreq,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreatelstOfflineData (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3982);
if (RapidSub.canDelegate("createlstofflinedata")) { return __ref.runUserSub(false, "appdialogs","createlstofflinedata", __ref, _req, _checkedreq, _height);}
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Req", _req);
Debug.locals.put("checkedReq", _checkedreq);
Debug.locals.put("height", _height);
 BA.debugLineNum = 3982;BA.debugLine="Sub CreatelstOfflineData(Req As String, checkedReq";
Debug.ShouldStop(8192);
 BA.debugLineNum = 3983;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(16384);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 3984;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _xui.runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 3985;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x, height)";
Debug.ShouldStop(65536);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 3986;BA.debugLine="p.LoadLayout(\"ListaOfflineReq\" )";
Debug.ShouldStop(131072);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListaOfflineReq")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3987;BA.debugLine="ChkReqOffline.Checked = checkedReq";
Debug.ShouldStop(262144);
__ref.getField(false,"_chkreqoffline" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",_checkedreq);
 BA.debugLineNum = 3988;BA.debugLine="txtReqOffline.text = Req";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtreqoffline" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_req));
 BA.debugLineNum = 3989;BA.debugLine="p.Tag = $\"${Req}|${Utils.Bool2Int(checkedReq)}\"$";
Debug.ShouldStop(1048576);
_p.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req))),RemoteObject.createImmutable("|"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((appdialogs._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_checkedreq))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3990;BA.debugLine="Return p";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 3991;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjectcancelbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("createObjectCancelButton_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1337);
if (RapidSub.canDelegate("createobjectcancelbutton_click")) { return __ref.runUserSub(false, "appdialogs","createobjectcancelbutton_click", __ref);}
 BA.debugLineNum = 1337;BA.debugLine="Sub createObjectCancelButton_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1338;BA.debugLine="createObjectPanel.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_createobjectpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 1339;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjectconfirmbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("createObjectConfirmButton_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1361);
if (RapidSub.canDelegate("createobjectconfirmbutton_click")) { return __ref.runUserSub(false, "appdialogs","createobjectconfirmbutton_click", __ref);}
 BA.debugLineNum = 1361;BA.debugLine="Sub createObjectConfirmButton_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1362;BA.debugLine="objectTypePanel.Visible = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_objecttypepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 1363;BA.debugLine="selectObjectPanel.Visible = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_selectobjectpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 1364;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjectlineitemdetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _tagcode,RemoteObject _title,RemoteObject _titledesc,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createObjectLineItemDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1225);
if (RapidSub.canDelegate("createobjectlineitemdetail")) { return __ref.runUserSub(false, "appdialogs","createobjectlineitemdetail", __ref, _activ, _tagcode, _title, _titledesc, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
Debug.locals.put("titledesc", _titledesc);
Debug.locals.put("height", _height);
 BA.debugLineNum = 1225;BA.debugLine="Sub createObjectLineItemDetail(activ As Activity,";
Debug.ShouldStop(256);
 BA.debugLineNum = 1226;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1227;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1024);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1228;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(2048);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 1230;BA.debugLine="p.LoadLayout(\"ItemGroupLine\" )";
Debug.ShouldStop(8192);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemGroupLine")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1231;BA.debugLine="p.RemoveView";
Debug.ShouldStop(16384);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1232;BA.debugLine="lblLineHeader.text = title";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1233;BA.debugLine="lblLineHeader.tag = tagcode";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1234;BA.debugLine="p.tag = tagcode";
Debug.ShouldStop(131072);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1236;BA.debugLine="Return p";
Debug.ShouldStop(524288);
if (true) return _p;
 BA.debugLineNum = 1237;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjectlineitemdetailview(RemoteObject __ref,RemoteObject _activ,RemoteObject _tagcode,RemoteObject _title,RemoteObject _titledesc,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createObjectLineItemDetailView (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1300);
if (RapidSub.canDelegate("createobjectlineitemdetailview")) { return __ref.runUserSub(false, "appdialogs","createobjectlineitemdetailview", __ref, _activ, _tagcode, _title, _titledesc, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
Debug.locals.put("titledesc", _titledesc);
Debug.locals.put("height", _height);
 BA.debugLineNum = 1300;BA.debugLine="Sub createObjectLineItemDetailView(activ As Activi";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1301;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1302;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1303;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(4194304);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 1305;BA.debugLine="p.LoadLayout(\"ItemGroupLine\" )";
Debug.ShouldStop(16777216);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemGroupLine")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1306;BA.debugLine="p.RemoveView";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1307;BA.debugLine="lblLineHeader.text = title";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1308;BA.debugLine="lblLineHeader.tag = tagcode";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1309;BA.debugLine="p.Height =  lblLineHeader.Height";
Debug.ShouldStop(268435456);
_p.runMethod(true,"setHeight",__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 1310;BA.debugLine="p.tag = tagcode";
Debug.ShouldStop(536870912);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1312;BA.debugLine="Return p";
Debug.ShouldStop(-2147483648);
if (true) return _p;
 BA.debugLineNum = 1313;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjecttypelineitemdetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _title,RemoteObject _tagcode,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createObjectTypeLineItemDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1276);
if (RapidSub.canDelegate("createobjecttypelineitemdetail")) { return __ref.runUserSub(false, "appdialogs","createobjecttypelineitemdetail", __ref, _activ, _title, _tagcode, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("title", _title);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("height", _height);
 BA.debugLineNum = 1276;BA.debugLine="Sub createObjectTypeLineItemDetail(activ As Activi";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1277;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1278;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1279;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(1073741824);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 1280;BA.debugLine="p.LoadLayout(\"itemobjecttype\")";
Debug.ShouldStop(-2147483648);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("itemobjecttype")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1281;BA.debugLine="p.RemoveView";
Debug.ShouldStop(1);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1282;BA.debugLine="lblGroupObjectTitle.text = title";
Debug.ShouldStop(2);
__ref.getField(false,"_lblgroupobjecttitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1283;BA.debugLine="p.Height = lblGroupObjectTitle.Height";
Debug.ShouldStop(4);
_p.runMethod(true,"setHeight",__ref.getField(false,"_lblgroupobjecttitle" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 1284;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(8);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1285;BA.debugLine="Return p";
Debug.ShouldStop(16);
if (true) return _p;
 BA.debugLineNum = 1286;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjgrouplineitemdetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _title,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createObjGroupLineItemDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1214);
if (RapidSub.canDelegate("createobjgrouplineitemdetail")) { return __ref.runUserSub(false, "appdialogs","createobjgrouplineitemdetail", __ref, _activ, _title, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("title", _title);
Debug.locals.put("height", _height);
 BA.debugLineNum = 1214;BA.debugLine="Sub createObjGroupLineItemDetail(activ As Activity";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1215;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1216;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1217;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(1);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 1218;BA.debugLine="p.LoadLayout(\"ItemGroupTitle\" )";
Debug.ShouldStop(2);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemGroupTitle")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1219;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1220;BA.debugLine="lblGroupTitle.text = title";
Debug.ShouldStop(8);
__ref.getField(false,"_lblgrouptitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1221;BA.debugLine="p.Tag = \"\"";
Debug.ShouldStop(16);
_p.runMethod(false,"setTag",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 1222;BA.debugLine="Return p";
Debug.ShouldStop(32);
if (true) return _p;
 BA.debugLineNum = 1223;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobjgrouplineitemdetailview(RemoteObject __ref,RemoteObject _activ,RemoteObject _title,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createObjGroupLineItemDetailView (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1288);
if (RapidSub.canDelegate("createobjgrouplineitemdetailview")) { return __ref.runUserSub(false, "appdialogs","createobjgrouplineitemdetailview", __ref, _activ, _title, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("title", _title);
Debug.locals.put("height", _height);
 BA.debugLineNum = 1288;BA.debugLine="Sub createObjGroupLineItemDetailView(activ As Acti";
Debug.ShouldStop(128);
 BA.debugLineNum = 1289;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1290;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(512);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1291;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(1024);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 1292;BA.debugLine="p.LoadLayout(\"ItemGroupTitle\")";
Debug.ShouldStop(2048);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemGroupTitle")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1293;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4096);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1294;BA.debugLine="lblGroupTitle.text = title";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblgrouptitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1295;BA.debugLine="p.Height = lblGroupTitle.Height";
Debug.ShouldStop(16384);
_p.runMethod(true,"setHeight",__ref.getField(false,"_lblgrouptitle" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 1296;BA.debugLine="p.Tag = \"\"";
Debug.ShouldStop(32768);
_p.runMethod(false,"setTag",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 1297;BA.debugLine="Return p";
Debug.ShouldStop(65536);
if (true) return _p;
 BA.debugLineNum = 1298;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createoutrosdetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _val2place,RemoteObject _title2place,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateOutrosDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2805);
if (RapidSub.canDelegate("createoutrosdetail")) { return __ref.runUserSub(false, "appdialogs","createoutrosdetail", __ref, _activ, _val2place, _title2place, _height);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("val2place", _val2place);
Debug.locals.put("title2place", _title2place);
Debug.locals.put("height", _height);
 BA.debugLineNum = 2805;BA.debugLine="Sub CreateOutrosDetail(activ As Activity, val2plac";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2806;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(2097152);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 2807;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(4194304);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2808;BA.debugLine="activ.AddView(pnl, 0, 0,100%x, height)";
Debug.ShouldStop(8388608);
_activ.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 2809;BA.debugLine="pnl.LoadLayout(\"detalheOutros\" )";
Debug.ShouldStop(16777216);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("detalheOutros")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2810;BA.debugLine="pnl.RemoveView";
Debug.ShouldStop(33554432);
_pnl.runVoidMethod ("RemoveView");
 BA.debugLineNum = 2811;BA.debugLine="lblTitleOutros.Text=title2place";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbltitleoutros" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title2place));
 BA.debugLineNum = 2812;BA.debugLine="lblTitleOutros.Tag=val2place";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbltitleoutros" /*RemoteObject*/ ).runMethod(false,"setTag",(_val2place));
 BA.debugLineNum = 2813;BA.debugLine="Return pnl";
Debug.ShouldStop(268435456);
if (true) return _pnl;
 BA.debugLineNum = 2814;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createparamlineitem(RemoteObject __ref,RemoteObject _activ,RemoteObject _tagcode,RemoteObject _title,RemoteObject _value_state,RemoteObject _value,RemoteObject _state_in,RemoteObject _height,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("createParamLineItem (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,897);
if (RapidSub.canDelegate("createparamlineitem")) { return __ref.runUserSub(false, "appdialogs","createparamlineitem", __ref, _activ, _tagcode, _title, _value_state, _value, _state_in, _height, _width);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcontrol = RemoteObject.createImmutable("");
RemoteObject _bpan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
Debug.locals.put("value_state", _value_state);
Debug.locals.put("VALUE", _value);
Debug.locals.put("state_in", _state_in);
Debug.locals.put("height", _height);
Debug.locals.put("width", _width);
 BA.debugLineNum = 897;BA.debugLine="Sub createParamLineItem(activ As Activity, tagcode";
Debug.ShouldStop(1);
 BA.debugLineNum = 898;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 899;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 900;BA.debugLine="activ.AddView(p, 0, 0, width, height)";
Debug.ShouldStop(8);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 901;BA.debugLine="p.LoadLayout(\"ParamItmeLine\" )";
Debug.ShouldStop(16);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ParamItmeLine")),__ref.getField(false, "ba"));
 BA.debugLineNum = 902;BA.debugLine="p.RemoveView";
Debug.ShouldStop(32);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 903;BA.debugLine="lblLineHeader.text = title";
Debug.ShouldStop(64);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 904;BA.debugLine="Log(VALUE)";
Debug.ShouldStop(128);
appdialogs.__c.runVoidMethod ("LogImpl","672548359",_value,0);
 BA.debugLineNum = 906;BA.debugLine="ButParamItem.updateButtonState(value_state)";
Debug.ShouldStop(512);
__ref.getField(false,"_butparamitem" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_updatebuttonstate" /*RemoteObject*/ ,(Object)(_value_state));
 BA.debugLineNum = 907;BA.debugLine="ButParamItem.State = value_state";
Debug.ShouldStop(1024);
__ref.getField(false,"_butparamitem" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,_value_state);
 BA.debugLineNum = 908;BA.debugLine="Dim TagControl As String = $\"${tagcode}|${value_s";
Debug.ShouldStop(2048);
_tagcontrol = (RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("|"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value_state))),RemoteObject.createImmutable("|1")));Debug.locals.put("TagControl", _tagcontrol);Debug.locals.put("TagControl", _tagcontrol);
 BA.debugLineNum = 909;BA.debugLine="lblLineHeader.tag = TagControl";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcontrol));
 BA.debugLineNum = 910;BA.debugLine="ButParamItem.tag = TagControl";
Debug.ShouldStop(8192);
__ref.getField(false,"_butparamitem" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,(_tagcontrol));
 BA.debugLineNum = 912;BA.debugLine="If (state_in = 2) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",_state_in,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 913;BA.debugLine="Dim bpan As Panel = lblLineHeader.Parent";
Debug.ShouldStop(65536);
_bpan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_bpan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(false,"getParent"));Debug.locals.put("bpan", _bpan);
 BA.debugLineNum = 914;BA.debugLine="lblLineHeader.Color = Consts.ColorLightSilver";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 915;BA.debugLine="bpan.Color = Consts.ColorLightSilver";
Debug.ShouldStop(262144);
_bpan.runVoidMethod ("setColor",appdialogs._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 916;BA.debugLine="bpan.Enabled = False";
Debug.ShouldStop(524288);
_bpan.runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 917;BA.debugLine="ButParamItem.Enabled = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_butparamitem" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setenabled" /*RemoteObject*/ ,appdialogs.__c.getField(true,"False"));
 };
 BA.debugLineNum = 920;BA.debugLine="p.tag = tagcode";
Debug.ShouldStop(8388608);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 921;BA.debugLine="Return p";
Debug.ShouldStop(16777216);
if (true) return _p;
 BA.debugLineNum = 922;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createparamlineitemedit(RemoteObject __ref,RemoteObject _activ,RemoteObject _tagcode,RemoteObject _title,RemoteObject _value_state,RemoteObject _value,RemoteObject _state_in,RemoteObject _height,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("createParamLineItemEdit (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,925);
if (RapidSub.canDelegate("createparamlineitemedit")) { return __ref.runUserSub(false, "appdialogs","createparamlineitemedit", __ref, _activ, _tagcode, _title, _value_state, _value, _state_in, _height, _width);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcontrol = RemoteObject.createImmutable("");
RemoteObject _bpan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
Debug.locals.put("value_state", _value_state);
Debug.locals.put("VALUE", _value);
Debug.locals.put("state_in", _state_in);
Debug.locals.put("height", _height);
Debug.locals.put("width", _width);
 BA.debugLineNum = 925;BA.debugLine="Sub createParamLineItemEdit(activ As Activity, tag";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 927;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 928;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 929;BA.debugLine="activ.AddView(p, 0, 0, width, height)";
Debug.ShouldStop(1);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 930;BA.debugLine="p.LoadLayout(\"ParamItmeLineEdit\" )";
Debug.ShouldStop(2);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ParamItmeLineEdit")),__ref.getField(false, "ba"));
 BA.debugLineNum = 931;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 932;BA.debugLine="lblLineHeader.text = title";
Debug.ShouldStop(8);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 933;BA.debugLine="EditParamItem.Text = VALUE";
Debug.ShouldStop(16);
__ref.getField(false,"_editparamitem" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 934;BA.debugLine="Log(value_state)";
Debug.ShouldStop(32);
appdialogs.__c.runVoidMethod ("LogImpl","672613897",BA.NumberToString(_value_state),0);
 BA.debugLineNum = 936;BA.debugLine="Dim TagControl As String = $\"${tagcode}|${VALUE}|";
Debug.ShouldStop(128);
_tagcontrol = (RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("|"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("|0")));Debug.locals.put("TagControl", _tagcontrol);Debug.locals.put("TagControl", _tagcontrol);
 BA.debugLineNum = 937;BA.debugLine="lblLineHeader.tag = TagControl";
Debug.ShouldStop(256);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcontrol));
 BA.debugLineNum = 938;BA.debugLine="EditParamItem.tag = TagControl";
Debug.ShouldStop(512);
__ref.getField(false,"_editparamitem" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcontrol));
 BA.debugLineNum = 940;BA.debugLine="If (state_in = 2) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",_state_in,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 941;BA.debugLine="Dim bpan As Panel = lblLineHeader.Parent";
Debug.ShouldStop(4096);
_bpan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_bpan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(false,"getParent"));Debug.locals.put("bpan", _bpan);
 BA.debugLineNum = 942;BA.debugLine="lblLineHeader.Color = Consts.ColorLightSilver";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 943;BA.debugLine="bpan.Color = Consts.ColorLightSilver";
Debug.ShouldStop(16384);
_bpan.runVoidMethod ("setColor",appdialogs._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 944;BA.debugLine="bpan.Enabled = False";
Debug.ShouldStop(32768);
_bpan.runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 945;BA.debugLine="EditParamItem.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_editparamitem" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 };
 BA.debugLineNum = 948;BA.debugLine="p.tag = tagcode";
Debug.ShouldStop(524288);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 949;BA.debugLine="Return p";
Debug.ShouldStop(1048576);
if (true) return _p;
 BA.debugLineNum = 950;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequestlineitemdetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _items,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createRequestLineItemDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("createrequestlineitemdetail")) { return __ref.runUserSub(false, "appdialogs","createrequestlineitemdetail", __ref, _activ, _items, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _route_title = RemoteObject.createImmutable("");
RemoteObject _nameobject = RemoteObject.createImmutable("");
RemoteObject _request_desc = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _sret = RemoteObject.createImmutable("");
Debug.locals.put("activ", _activ);
Debug.locals.put("items", _items);
Debug.locals.put("height", _height);
 BA.debugLineNum = 435;BA.debugLine="Sub createRequestLineItemDetail(activ As Activity,";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 437;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1048576);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 438;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(2097152);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 440;BA.debugLine="p.LoadLayout(\"ItemLineRequest\" )";
Debug.ShouldStop(8388608);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemLineRequest")),__ref.getField(false, "ba"));
 BA.debugLineNum = 441;BA.debugLine="p.RemoveView";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 445;BA.debugLine="Dim route_title As String = items.GetString(\"rout";
Debug.ShouldStop(268435456);
_route_title = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("route_title")));Debug.locals.put("route_title", _route_title);Debug.locals.put("route_title", _route_title);
 BA.debugLineNum = 446;BA.debugLine="Dim nameobject As String = items.GetString(\"nameo";
Debug.ShouldStop(536870912);
_nameobject = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nameobject")));Debug.locals.put("nameobject", _nameobject);Debug.locals.put("nameobject", _nameobject);
 BA.debugLineNum = 447;BA.debugLine="Dim request_desc As String = items.GetString(\"req";
Debug.ShouldStop(1073741824);
_request_desc = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_desc")));Debug.locals.put("request_desc", _request_desc);Debug.locals.put("request_desc", _request_desc);
 BA.debugLineNum = 448;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcode\"";
Debug.ShouldStop(-2147483648);
_tagcode = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 450;BA.debugLine="If Utils.NNE(route_title) Then";
Debug.ShouldStop(2);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_route_title)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 451;BA.debugLine="route_title = $\"${route_title} / \"$";
Debug.ShouldStop(4);
_route_title = (RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_route_title))),RemoteObject.createImmutable(" / ")));Debug.locals.put("route_title", _route_title);
 };
 BA.debugLineNum = 453;BA.debugLine="If Utils.NNE(nameobject) Then";
Debug.ShouldStop(16);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_nameobject)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 454;BA.debugLine="nameobject = $\"${nameobject} / \"$";
Debug.ShouldStop(32);
_nameobject = (RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nameobject))),RemoteObject.createImmutable(" / ")));Debug.locals.put("nameobject", _nameobject);
 };
 BA.debugLineNum = 456;BA.debugLine="If Utils.NNE(request_desc) Then";
Debug.ShouldStop(128);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_request_desc)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 457;BA.debugLine="request_desc = $\"${request_desc} / \"$";
Debug.ShouldStop(256);
_request_desc = (RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_desc))),RemoteObject.createImmutable(" / ")));Debug.locals.put("request_desc", _request_desc);
 };
 BA.debugLineNum = 459;BA.debugLine="Dim sRet As String = $\"${route_title}${nameobject";
Debug.ShouldStop(1024);
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_route_title))),RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nameobject))),RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_desc))),RemoteObject.createImmutable("")));Debug.locals.put("sRet", _sret);Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 461;BA.debugLine="lblLineHeader.text = sRet";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sret));
 BA.debugLineNum = 462;BA.debugLine="lblLineHeader.tag = tagcode";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbllineheader" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 463;BA.debugLine="p.tag = tagcode";
Debug.ShouldStop(16384);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 465;BA.debugLine="Return p";
Debug.ShouldStop(65536);
if (true) return _p;
 BA.debugLineNum = 466;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsearchlinedetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _items,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createSearchLineDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2554);
if (RapidSub.canDelegate("createsearchlinedetail")) { return __ref.runUserSub(false, "appdialogs","createsearchlinedetail", __ref, _activ, _items, _height);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _stext = RemoteObject.createImmutable("");
RemoteObject _stag = RemoteObject.createImmutable("");
RemoteObject _showfield = RemoteObject.createImmutable(0);
RemoteObject _showposition = RemoteObject.createImmutable(0);
RemoteObject _mapofproperties = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _search_field_settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _field_name = RemoteObject.createImmutable("");
RemoteObject _show_inlist = RemoteObject.createImmutable(0);
RemoteObject _show_position = RemoteObject.createImmutable(0);
RemoteObject _props = RemoteObject.createImmutable("");
RemoteObject _listastring = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _inx = 0;
RemoteObject _thename = RemoteObject.createImmutable("");
RemoteObject _thevalue = RemoteObject.createImmutable("");
RemoteObject _keyval = RemoteObject.createImmutable("");
RemoteObject _propfields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _itemlista = RemoteObject.createImmutable("");
RemoteObject _possort = RemoteObject.createImmutable(0);
Debug.locals.put("activ", _activ);
Debug.locals.put("items", _items);
Debug.locals.put("height", _height);
 BA.debugLineNum = 2554;BA.debugLine="Sub createSearchLineDetail(activ As Activity, item";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2556;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(134217728);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 2557;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(268435456);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2558;BA.debugLine="activ.AddView(pnl, 0, 0,98%x, height)";
Debug.ShouldStop(536870912);
_activ.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 2559;BA.debugLine="pnl.LoadLayout(\"linha2search\" )";
Debug.ShouldStop(1073741824);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("linha2search")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2560;BA.debugLine="pnl.RemoveView";
Debug.ShouldStop(-2147483648);
_pnl.runVoidMethod ("RemoveView");
 BA.debugLineNum = 2561;BA.debugLine="Dim sText As String = \"\"";
Debug.ShouldStop(1);
_stext = BA.ObjectToString("");Debug.locals.put("sText", _stext);Debug.locals.put("sText", _stext);
 BA.debugLineNum = 2562;BA.debugLine="Dim sTag As String = \"\"";
Debug.ShouldStop(2);
_stag = BA.ObjectToString("");Debug.locals.put("sTag", _stag);Debug.locals.put("sTag", _stag);
 BA.debugLineNum = 2563;BA.debugLine="label2search1.text = \"\"";
Debug.ShouldStop(4);
__ref.getField(false,"_label2search1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 2564;BA.debugLine="Dim ShowField As Int = 1";
Debug.ShouldStop(8);
_showfield = BA.numberCast(int.class, 1);Debug.locals.put("ShowField", _showfield);Debug.locals.put("ShowField", _showfield);
 BA.debugLineNum = 2565;BA.debugLine="Dim ShowPosition As Int = 1";
Debug.ShouldStop(16);
_showposition = BA.numberCast(int.class, 1);Debug.locals.put("ShowPosition", _showposition);Debug.locals.put("ShowPosition", _showposition);
 BA.debugLineNum = 2566;BA.debugLine="Dim MapOfProperties As Map";
Debug.ShouldStop(32);
_mapofproperties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("MapOfProperties", _mapofproperties);
 BA.debugLineNum = 2567;BA.debugLine="MapOfProperties.Initialize";
Debug.ShouldStop(64);
_mapofproperties.runVoidMethod ("Initialize");
 BA.debugLineNum = 2568;BA.debugLine="Dim search_field_settings As Map = ShareCode.Curr";
Debug.ShouldStop(128);
_search_field_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_field_settings = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), appdialogs._sharecode._current29map /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_field_settings")))));Debug.locals.put("search_field_settings", _search_field_settings);
 BA.debugLineNum = 2569;BA.debugLine="Dim fields As List = search_field_settings.Get(\"f";
Debug.ShouldStop(256);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fields = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_field_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fields")))));Debug.locals.put("fields", _fields);
 BA.debugLineNum = 2570;BA.debugLine="For Each colfields As Map In fields";
Debug.ShouldStop(512);
_colfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group15 = _fields;
final int groupLen15 = group15.runMethod(true,"getSize").<Integer>get()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_colfields = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group15.runMethod(false,"Get",index15));
Debug.locals.put("colfields", _colfields);
 BA.debugLineNum = 2571;BA.debugLine="Dim field_name As String = colfields.Get(\"field_";
Debug.ShouldStop(1024);
_field_name = BA.ObjectToString(_colfields.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field_name")))));Debug.locals.put("field_name", _field_name);Debug.locals.put("field_name", _field_name);
 BA.debugLineNum = 2572;BA.debugLine="Dim show_inlist As Int = colfields.Get(\"show_inl";
Debug.ShouldStop(2048);
_show_inlist = BA.numberCast(int.class, _colfields.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("show_inlist")))));Debug.locals.put("show_inlist", _show_inlist);Debug.locals.put("show_inlist", _show_inlist);
 BA.debugLineNum = 2573;BA.debugLine="Dim show_position As Int = colfields.Get(\"show_p";
Debug.ShouldStop(4096);
_show_position = BA.numberCast(int.class, _colfields.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("show_position")))));Debug.locals.put("show_position", _show_position);Debug.locals.put("show_position", _show_position);
 BA.debugLineNum = 2574;BA.debugLine="Dim Props As String = $\"${show_inlist}|${show_po";
Debug.ShouldStop(8192);
_props = (RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_show_inlist))),RemoteObject.createImmutable("|"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_show_position))),RemoteObject.createImmutable("")));Debug.locals.put("Props", _props);Debug.locals.put("Props", _props);
 BA.debugLineNum = 2575;BA.debugLine="MapOfProperties.Put(field_name,Props)";
Debug.ShouldStop(16384);
_mapofproperties.runVoidMethod ("Put",(Object)((_field_name)),(Object)((_props)));
 }
}Debug.locals.put("colfields", _colfields);
;
 BA.debugLineNum = 2578;BA.debugLine="Dim listaString As List";
Debug.ShouldStop(131072);
_listastring = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaString", _listastring);
 BA.debugLineNum = 2579;BA.debugLine="listaString.Initialize";
Debug.ShouldStop(262144);
_listastring.runVoidMethod ("Initialize");
 BA.debugLineNum = 2581;BA.debugLine="For inx = 0 To items.ColumnCount -1";
Debug.ShouldStop(1048576);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_inx = 0 ;
for (;(step24 > 0 && _inx <= limit24) || (step24 < 0 && _inx >= limit24) ;_inx = ((int)(0 + _inx + step24))  ) {
Debug.locals.put("inx", _inx);
 BA.debugLineNum = 2583;BA.debugLine="Dim theName As String = items.GetColumnName(inx)";
Debug.ShouldStop(4194304);
_thename = _items.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _inx)));Debug.locals.put("theName", _thename);Debug.locals.put("theName", _thename);
 BA.debugLineNum = 2584;BA.debugLine="Dim theValue As String = items.GetString(theName";
Debug.ShouldStop(8388608);
_thevalue = _items.runMethod(true,"GetString",(Object)(_thename));Debug.locals.put("theValue", _thevalue);Debug.locals.put("theValue", _thevalue);
 BA.debugLineNum = 2586;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 2587;BA.debugLine="If MapOfProperties.ContainsKey(theName) Then";
Debug.ShouldStop(67108864);
if (_mapofproperties.runMethod(true,"ContainsKey",(Object)((_thename))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2588;BA.debugLine="Dim KeyVal As String = MapOfProperties.Get(the";
Debug.ShouldStop(134217728);
_keyval = BA.ObjectToString(_mapofproperties.runMethod(false,"Get",(Object)((_thename))));Debug.locals.put("KeyVal", _keyval);Debug.locals.put("KeyVal", _keyval);
 BA.debugLineNum = 2589;BA.debugLine="Dim PropFields As List = Regex.Split(\"\\|\",KeyV";
Debug.ShouldStop(268435456);
_propfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_propfields = appdialogs.__c.runMethod(false, "ArrayToList", (Object)(appdialogs.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_keyval))));Debug.locals.put("PropFields", _propfields);Debug.locals.put("PropFields", _propfields);
 BA.debugLineNum = 2590;BA.debugLine="ShowField = PropFields.Get(0)";
Debug.ShouldStop(536870912);
_showfield = BA.numberCast(int.class, _propfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("ShowField", _showfield);
 BA.debugLineNum = 2591;BA.debugLine="ShowPosition = PropFields.Get(1)";
Debug.ShouldStop(1073741824);
_showposition = BA.numberCast(int.class, _propfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("ShowPosition", _showposition);
 }else {
 BA.debugLineNum = 2593;BA.debugLine="ShowField = 0";
Debug.ShouldStop(1);
_showfield = BA.numberCast(int.class, 0);Debug.locals.put("ShowField", _showfield);
 BA.debugLineNum = 2594;BA.debugLine="ShowPosition = 0";
Debug.ShouldStop(2);
_showposition = BA.numberCast(int.class, 0);Debug.locals.put("ShowPosition", _showposition);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e38.toString()); BA.debugLineNum = 2597;BA.debugLine="ShowField = 0";
Debug.ShouldStop(16);
_showfield = BA.numberCast(int.class, 0);Debug.locals.put("ShowField", _showfield);
 BA.debugLineNum = 2598;BA.debugLine="ShowPosition = 0";
Debug.ShouldStop(32);
_showposition = BA.numberCast(int.class, 0);Debug.locals.put("ShowPosition", _showposition);
 };
 BA.debugLineNum = 2602;BA.debugLine="sTag = sTag & $\"${theName}=${theValue}|\"$";
Debug.ShouldStop(512);
_stag = RemoteObject.concat(_stag,(RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thename))),RemoteObject.createImmutable("="),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thevalue))),RemoteObject.createImmutable("|"))));Debug.locals.put("sTag", _stag);
 BA.debugLineNum = 2603;BA.debugLine="Log(sTag)";
Debug.ShouldStop(1024);
appdialogs.__c.runVoidMethod ("LogImpl","676611633",_stag,0);
 BA.debugLineNum = 2606;BA.debugLine="If theName.ToLowerCase.Contains(\"tagcode\") = Fal";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_thename.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("tagcode"))),appdialogs.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2607;BA.debugLine="If ShowField = 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_showfield,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2608;BA.debugLine="listaString.Add($\"${ShowPosition}-${theValue}\"";
Debug.ShouldStop(32768);
_listastring.runVoidMethod ("Add",(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_showposition))),RemoteObject.createImmutable("-"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thevalue))),RemoteObject.createImmutable(""))))));
 };
 };
 }
}Debug.locals.put("inx", _inx);
;
 BA.debugLineNum = 2613;BA.debugLine="listaString.Sort(True)";
Debug.ShouldStop(1048576);
_listastring.runVoidMethod ("Sort",(Object)(appdialogs.__c.getField(true,"True")));
 BA.debugLineNum = 2615;BA.debugLine="For i=0 To listaString.Size -1";
Debug.ShouldStop(4194304);
{
final int step50 = 1;
final int limit50 = RemoteObject.solve(new RemoteObject[] {_listastring.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50) ;_i = ((int)(0 + _i + step50))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2616;BA.debugLine="Dim ItemLista As String = listaString.Get(i)";
Debug.ShouldStop(8388608);
_itemlista = BA.ObjectToString(_listastring.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ItemLista", _itemlista);Debug.locals.put("ItemLista", _itemlista);
 BA.debugLineNum = 2617;BA.debugLine="Dim PosSort As Int = ItemLista.IndexOf(\"-\")";
Debug.ShouldStop(16777216);
_possort = _itemlista.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("PosSort", _possort);Debug.locals.put("PosSort", _possort);
 BA.debugLineNum = 2618;BA.debugLine="If PosSort > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_possort,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2619;BA.debugLine="ItemLista = ItemLista.SubString2(PosSort+1,Item";
Debug.ShouldStop(67108864);
_itemlista = _itemlista.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_possort,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_itemlista.runMethod(true,"length")));Debug.locals.put("ItemLista", _itemlista);
 };
 BA.debugLineNum = 2621;BA.debugLine="sText = sText & ItemLista & \", \"";
Debug.ShouldStop(268435456);
_stext = RemoteObject.concat(_stext,_itemlista,RemoteObject.createImmutable(", "));Debug.locals.put("sText", _stext);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2625;BA.debugLine="If sText.EndsWith(\", \") Then sText = sText.SubStr";
Debug.ShouldStop(1);
if (_stext.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(", "))).<Boolean>get().booleanValue()) { 
_stext = _stext.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_stext.runMethod(true,"length"),RemoteObject.createImmutable(2)}, "-",1, 1)));Debug.locals.put("sText", _stext);};
 BA.debugLineNum = 2626;BA.debugLine="If sText.StartsWith(\", \") Then sText = sText.SubS";
Debug.ShouldStop(2);
if (_stext.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable(", "))).<Boolean>get().booleanValue()) { 
_stext = _stext.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(_stext.runMethod(true,"length")));Debug.locals.put("sText", _stext);};
 BA.debugLineNum = 2627;BA.debugLine="label2search1.text = sText";
Debug.ShouldStop(4);
__ref.getField(false,"_label2search1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_stext));
 BA.debugLineNum = 2628;BA.debugLine="label2search1.tag = sTag";
Debug.ShouldStop(8);
__ref.getField(false,"_label2search1" /*RemoteObject*/ ).runMethod(false,"setTag",(_stag));
 BA.debugLineNum = 2630;BA.debugLine="Return pnl";
Debug.ShouldStop(32);
if (true) return _pnl;
 BA.debugLineNum = 2631;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtasklineitemdetail(RemoteObject __ref,RemoteObject _activ,RemoteObject _title,RemoteObject _typeitem,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createTaskLineItemDetail (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1694);
if (RapidSub.canDelegate("createtasklineitemdetail")) { return __ref.runUserSub(false, "appdialogs","createtasklineitemdetail", __ref, _activ, _title, _typeitem, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("title", _title);
Debug.locals.put("typeitem", _typeitem);
Debug.locals.put("height", _height);
 BA.debugLineNum = 1694;BA.debugLine="Sub createTaskLineItemDetail(activ As Activity, ti";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1695;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1696;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1697;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(1);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 1698;BA.debugLine="If (typeitem = 1) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_typeitem,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1699;BA.debugLine="p.LoadLayout(\"task_item_detail_groupitem\" ) '_de";
Debug.ShouldStop(4);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("task_item_detail_groupitem")),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 1701;BA.debugLine="p.LoadLayout(\"task_item_detail_lineitem\" ) '_dev";
Debug.ShouldStop(16);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("task_item_detail_lineitem")),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 1703;BA.debugLine="p.RemoveView";
Debug.ShouldStop(64);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1704;BA.debugLine="ListItemDesc.text = title";
Debug.ShouldStop(128);
__ref.getField(false,"_listitemdesc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 1705;BA.debugLine="Return p";
Debug.ShouldStop(256);
if (true) return _p;
 BA.debugLineNum = 1706;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createvehicleitem(RemoteObject __ref,RemoteObject _activ,RemoteObject _vehiclename,RemoteObject _height,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("createVehicleItem (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2370);
if (RapidSub.canDelegate("createvehicleitem")) { return __ref.runUserSub(false, "appdialogs","createvehicleitem", __ref, _activ, _vehiclename, _height, _tag);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("activ", _activ);
Debug.locals.put("vehicleName", _vehiclename);
Debug.locals.put("height", _height);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 2370;BA.debugLine="Sub createVehicleItem(activ As Activity, vehicleNa";
Debug.ShouldStop(2);
 BA.debugLineNum = 2371;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 2372;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(8);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2373;BA.debugLine="activ.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(16);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appdialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
 BA.debugLineNum = 2374;BA.debugLine="p.LoadLayout(\"vehicleItem\" ) '_device_2\")";
Debug.ShouldStop(32);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("vehicleItem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2375;BA.debugLine="p.RemoveView";
Debug.ShouldStop(64);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 2376;BA.debugLine="lblvehicleName.text = vehicleName";
Debug.ShouldStop(128);
__ref.getField(false,"_lblvehiclename" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_vehiclename));
 BA.debugLineNum = 2377;BA.debugLine="p.Tag = tag";
Debug.ShouldStop(256);
_p.runMethod(false,"setTag",(_tag));
 BA.debugLineNum = 2378;BA.debugLine="Return p";
Debug.ShouldStop(512);
if (true) return _p;
 BA.debugLineNum = 2379;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _dialogooutros(RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("DialogoOutros (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2738);
if (RapidSub.canDelegate("dialogooutros")) { __ref.runUserSub(false, "appdialogs","dialogooutros", __ref, _activ, _this, _params); return;}
ResumableSub_DialogoOutros rsub = new ResumableSub_DialogoOutros(null,__ref,_activ,_this,_params);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DialogoOutros extends BA.ResumableSub {
public ResumableSub_DialogoOutros(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _params) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._params = _params;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _this;
RemoteObject _params;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _search_field_settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _returned_field = RemoteObject.createImmutable("");
RemoteObject _fillotherfields_settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mapoutros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _colfillotherfields_settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _field_name = RemoteObject.createImmutable("");
RemoteObject _alt_bookmark = RemoteObject.createImmutable("");
RemoteObject _field_title = RemoteObject.createImmutable("");
RemoteObject _show_position = RemoteObject.createImmutable(0);
RemoteObject _show_inlist = RemoteObject.createImmutable(0);
RemoteObject _is_location = RemoteObject.createImmutable(0);
RemoteObject _is_additional = RemoteObject.createImmutable(0);
RemoteObject _is_contact = RemoteObject.createImmutable(0);
int _x = 0;
RemoteObject _sret = RemoteObject.createImmutable("");
RemoteObject _chave = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbloutrostitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbloutrosvalor = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject group16;
int index16;
int groupLen16;
int step35;
int limit35;
int step42;
int limit42;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DialogoOutros (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2738);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("this", _this);
Debug.locals.put("params", _params);
 BA.debugLineNum = 2739;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Adiciona";
Debug.ShouldStop(262144);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Adicionar Registo")),(Object)(BA.ObjectToString("Actualizar Checklist")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2741;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(1048576);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2742;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2743;BA.debugLine="ApplDialog.SetSize(75%x, 80%y)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2745;BA.debugLine="ApplDialog.SetSize(90%x, 70%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2748;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "dialogooutros"), _sf);
this.state = 34;
return;
case 34:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2749;BA.debugLine="pnl.LoadLayout(\"dialog_search_outros\")";
Debug.ShouldStop(268435456);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_search_outros")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2752;BA.debugLine="Dim search_field_settings As Map = params.Get(\"se";
Debug.ShouldStop(-2147483648);
_search_field_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_field_settings = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_field_settings")))));Debug.locals.put("search_field_settings", _search_field_settings);
 BA.debugLineNum = 2753;BA.debugLine="Dim fields As List = search_field_settings.Get(\"f";
Debug.ShouldStop(1);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fields = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_field_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fields")))));Debug.locals.put("fields", _fields);
 BA.debugLineNum = 2754;BA.debugLine="Dim returned_field As String = search_field_setti";
Debug.ShouldStop(2);
_returned_field = BA.ObjectToString(_search_field_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("returned_field")))));Debug.locals.put("returned_field", _returned_field);Debug.locals.put("returned_field", _returned_field);
 BA.debugLineNum = 2755;BA.debugLine="Dim fillotherfields_settings As List = search_fie";
Debug.ShouldStop(4);
_fillotherfields_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fillotherfields_settings = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_field_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fillotherfields_settings")))));Debug.locals.put("fillotherfields_settings", _fillotherfields_settings);
 BA.debugLineNum = 2757;BA.debugLine="Dim mapOutros As Map";
Debug.ShouldStop(16);
_mapoutros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapOutros", _mapoutros);
 BA.debugLineNum = 2758;BA.debugLine="mapOutros.Initialize";
Debug.ShouldStop(32);
_mapoutros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2763;BA.debugLine="For Each colfillotherfields_settings As Map In fi";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//for
this.state = 21;
_colfillotherfields_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group16 = _fillotherfields_settings;
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colfillotherfields_settings", _colfillotherfields_settings);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 21;
if (index16 < groupLen16) {
this.state = 9;
_colfillotherfields_settings = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group16.runMethod(false,"Get",index16));}
if (true) break;

case 36:
//C
this.state = 35;
index16++;
Debug.locals.put("colfillotherfields_settings", _colfillotherfields_settings);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2764;BA.debugLine="Dim field_name As String = colfillotherfields_se";
Debug.ShouldStop(2048);
_field_name = BA.ObjectToString(_colfillotherfields_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field_name")))));Debug.locals.put("field_name", _field_name);Debug.locals.put("field_name", _field_name);
 BA.debugLineNum = 2766;BA.debugLine="Try";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 2767;BA.debugLine="Dim alt_bookmark As String = colfillotherfields";
Debug.ShouldStop(16384);
_alt_bookmark = BA.ObjectToString(_colfillotherfields_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("alt_bookmark")))));Debug.locals.put("alt_bookmark", _alt_bookmark);Debug.locals.put("alt_bookmark", _alt_bookmark);
 BA.debugLineNum = 2768;BA.debugLine="Dim field_title As String = colfillotherfields_";
Debug.ShouldStop(32768);
_field_title = BA.ObjectToString(_colfillotherfields_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field_title")))));Debug.locals.put("field_title", _field_title);Debug.locals.put("field_title", _field_title);
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 2770;BA.debugLine="Dim alt_bookmark As String = \"\"";
Debug.ShouldStop(131072);
_alt_bookmark = BA.ObjectToString("");Debug.locals.put("alt_bookmark", _alt_bookmark);Debug.locals.put("alt_bookmark", _alt_bookmark);
 BA.debugLineNum = 2771;BA.debugLine="Dim field_title As String = field_name";
Debug.ShouldStop(262144);
_field_title = _field_name;Debug.locals.put("field_title", _field_title);Debug.locals.put("field_title", _field_title);
 BA.debugLineNum = 2772;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","676939298",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2774;BA.debugLine="If field_title = \"\" Then field_title = field_nam";
Debug.ShouldStop(2097152);

case 15:
//if
this.state = 20;
this.catchState = 0;
if (RemoteObject.solveBoolean("=",_field_title,BA.ObjectToString(""))) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
_field_title = _field_name;Debug.locals.put("field_title", _field_title);
if (true) break;

case 20:
//C
this.state = 36;
;
 BA.debugLineNum = 2775;BA.debugLine="Dim show_position As Int = colfillotherfields_se";
Debug.ShouldStop(4194304);
_show_position = BA.numberCast(int.class, _colfillotherfields_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("show_position")))));Debug.locals.put("show_position", _show_position);Debug.locals.put("show_position", _show_position);
 BA.debugLineNum = 2776;BA.debugLine="Dim show_inlist As Int = colfillotherfields_sett";
Debug.ShouldStop(8388608);
_show_inlist = BA.numberCast(int.class, _colfillotherfields_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("show_inlist")))));Debug.locals.put("show_inlist", _show_inlist);Debug.locals.put("show_inlist", _show_inlist);
 BA.debugLineNum = 2777;BA.debugLine="Dim is_location As Int = colfillotherfields_sett";
Debug.ShouldStop(16777216);
_is_location = BA.numberCast(int.class, _colfillotherfields_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_location")))));Debug.locals.put("is_location", _is_location);Debug.locals.put("is_location", _is_location);
 BA.debugLineNum = 2778;BA.debugLine="Dim is_additional As Int = colfillotherfields_se";
Debug.ShouldStop(33554432);
_is_additional = BA.numberCast(int.class, _colfillotherfields_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_additional")))));Debug.locals.put("is_additional", _is_additional);Debug.locals.put("is_additional", _is_additional);
 BA.debugLineNum = 2779;BA.debugLine="Dim is_contact As Int = colfillotherfields_setti";
Debug.ShouldStop(67108864);
_is_contact = BA.numberCast(int.class, _colfillotherfields_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_contact")))));Debug.locals.put("is_contact", _is_contact);Debug.locals.put("is_contact", _is_contact);
 BA.debugLineNum = 2780;BA.debugLine="mapOutros.Put(field_name,field_title)";
Debug.ShouldStop(134217728);
_mapoutros.runVoidMethod ("Put",(Object)((_field_name)),(Object)((_field_title)));
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
Debug.locals.put("colfillotherfields_settings", _colfillotherfields_settings);
;
 BA.debugLineNum = 2782;BA.debugLine="ListaOutros.Clear";
Debug.ShouldStop(536870912);
__ref.getField(false,"_listaoutros" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 2784;BA.debugLine="For x = 0 To mapOutros.Size -1";
Debug.ShouldStop(-2147483648);
if (true) break;

case 22:
//for
this.state = 25;
step35 = 1;
limit35 = RemoteObject.solve(new RemoteObject[] {_mapoutros.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
Debug.locals.put("x", _x);
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
Debug.locals.put("x", _x);
if (true) break;

case 24:
//C
this.state = 38;
 BA.debugLineNum = 2785;BA.debugLine="ListaOutros.Add(CreateOutrosDetail(activ,mapOutr";
Debug.ShouldStop(1);
__ref.getField(false,"_listaoutros" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createoutrosdetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(BA.ObjectToString(_mapoutros.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _x))))),(Object)(BA.ObjectToString(_mapoutros.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _x))))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
Debug.locals.put("x", _x);
;
 BA.debugLineNum = 2787;BA.debugLine="Dim sRet As String = \"\"";
Debug.ShouldStop(4);
_sret = BA.ObjectToString("");Debug.locals.put("sRet", _sret);Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 2788;BA.debugLine="Dim chave As String = \"\"";
Debug.ShouldStop(8);
_chave = BA.ObjectToString("");Debug.locals.put("chave", _chave);Debug.locals.put("chave", _chave);
 BA.debugLineNum = 2789;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "dialogooutros"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 26;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2790;BA.debugLine="If res = DialogResponse.POSITIVE Then 'Actualizar";
Debug.ShouldStop(32);
if (true) break;

case 26:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 2791;BA.debugLine="For i = 0 To ListaOutros.Size -1";
Debug.ShouldStop(64);
if (true) break;

case 29:
//for
this.state = 32;
step42 = 1;
limit42 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listaoutros" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 31:
//C
this.state = 41;
 BA.debugLineNum = 2792;BA.debugLine="Dim p As Panel = ListaOutros.GetPanel(i)";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_listaoutros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 2793;BA.debugLine="Dim lblOutrosTitle As Label = p.GetView(0)";
Debug.ShouldStop(256);
_lbloutrostitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbloutrostitle = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lblOutrosTitle", _lbloutrostitle);
 BA.debugLineNum = 2794;BA.debugLine="Dim lblOutrosValor As EditText = p.GetView(1)";
Debug.ShouldStop(512);
_lbloutrosvalor = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_lbloutrosvalor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lblOutrosValor", _lbloutrosvalor);
 BA.debugLineNum = 2795;BA.debugLine="sRet = sRet & $\"${lblOutrosTitle.Tag}=${lblOutr";
Debug.ShouldStop(1024);
_sret = RemoteObject.concat(_sret,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lbloutrostitle.runMethod(false,"getTag"))),RemoteObject.createImmutable("="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbloutrosvalor.runMethod(true,"getText")))),RemoteObject.createImmutable("|"))));Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 2796;BA.debugLine="chave = chave & $\"${lblOutrosValor.Text}|\"$";
Debug.ShouldStop(2048);
_chave = RemoteObject.concat(_chave,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbloutrosvalor.runMethod(true,"getText")))),RemoteObject.createImmutable("|"))));Debug.locals.put("chave", _chave);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2799;BA.debugLine="ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = chave";
Debug.ShouldStop(16384);
parent._sharecode._item_returned_from_searchlist /*RemoteObject*/  = _chave;
 BA.debugLineNum = 2800;BA.debugLine="ShareCode.TAG_RETURNED_FROM_SEARCHLIST = sRet";
Debug.ShouldStop(32768);
parent._sharecode._tag_returned_from_searchlist /*RemoteObject*/  = _sret;
 BA.debugLineNum = 2801;BA.debugLine="CallSubDelayed3(CheckList3, \"returnfromoutros\",t";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((parent._checklist3.getObject())),(Object)(BA.ObjectToString("returnfromoutros")),(Object)((_this)),(Object)((_params)));
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 2803;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _dialog_ready(RemoteObject __ref,RemoteObject _pnl) throws Exception{
}
public static void  _dialog_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static RemoteObject  _dialogreqcausermj_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DialogReqCauseRMJ_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3001);
if (RapidSub.canDelegate("dialogreqcausermj_itemclick")) { return __ref.runUserSub(false, "appdialogs","dialogreqcausermj_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3001;BA.debugLine="Sub DialogReqCauseRMJ_ItemClick (Position As Int,";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 3002;BA.debugLine="Log (Value)";
Debug.ShouldStop(33554432);
appdialogs.__c.runVoidMethod ("LogImpl","677332481",BA.ObjectToString(_value),0);
 BA.debugLineNum = 3003;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqendtime_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("DialogReqEndTime_FocusChanged (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3443);
if (RapidSub.canDelegate("dialogreqendtime_focuschanged")) { return __ref.runUserSub(false, "appdialogs","dialogreqendtime_focuschanged", __ref, _hasfocus);}
RemoteObject _currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
RemoteObject _tt = RemoteObject.declareNull("de.donmanfred.TimePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 3443;BA.debugLine="Sub DialogReqEndTime_FocusChanged (HasFocus As Boo";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3445;BA.debugLine="If (HasFocus = True) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",_hasfocus,appdialogs.__c.getField(true,"True")))) { 
 BA.debugLineNum = 3446;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = Se";
Debug.ShouldStop(2097152);
_currenttimeedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
_currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("CurrentTimeEdit", _currenttimeedit);
 BA.debugLineNum = 3447;BA.debugLine="Dim tt As TimePickerDialog";
Debug.ShouldStop(4194304);
_tt = RemoteObject.createNew ("de.donmanfred.TimePickerDialogWrapper");Debug.locals.put("tt", _tt);
 BA.debugLineNum = 3448;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(8388608);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3449;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(16777216);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3450;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 3451;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("!",_currenttimeedit.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3452;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.";
Debug.ShouldStop(134217728);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currenttimeedit.runMethod(true,"getText")))),RemoteObject.createImmutable(":00")))));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3455;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHo";
Debug.ShouldStop(1073741824);
_tt.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetTime")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_dnow))),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_dnow))),(Object)(appdialogs.__c.getField(true,"True")));
 BA.debugLineNum = 3457;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
Debug.ShouldStop(1);
_tt.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("CurrentTimeEdit")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 3459;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
appdialogs.__c.runVoidMethod ("LogImpl","678643216",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 };
 BA.debugLineNum = 3462;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqperiodtype_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DialogReqPeriodType_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3356);
if (RapidSub.canDelegate("dialogreqperiodtype_itemclick")) { return __ref.runUserSub(false, "appdialogs","dialogreqperiodtype_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3356;BA.debugLine="Sub DialogReqPeriodType_ItemClick (Position As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 3358;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqreasonrmj_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DialogReqReasonRMJ_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2997);
if (RapidSub.canDelegate("dialogreqreasonrmj_itemclick")) { return __ref.runUserSub(false, "appdialogs","dialogreqreasonrmj_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2997;BA.debugLine="Sub DialogReqReasonRMJ_ItemClick (Position As Int,";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2998;BA.debugLine="Log (Value)";
Debug.ShouldStop(2097152);
appdialogs.__c.runVoidMethod ("LogImpl","677266945",BA.ObjectToString(_value),0);
 BA.debugLineNum = 2999;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqroute_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DialogReqRoute_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3534);
if (RapidSub.canDelegate("dialogreqroute_itemclick")) { return __ref.runUserSub(false, "appdialogs","dialogreqroute_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3534;BA.debugLine="Sub DialogReqRoute_ItemClick (Position As Int, Val";
Debug.ShouldStop(8192);
 BA.debugLineNum = 3536;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqstarttime_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("DialogReqStartTime_FocusChanged (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3423);
if (RapidSub.canDelegate("dialogreqstarttime_focuschanged")) { return __ref.runUserSub(false, "appdialogs","dialogreqstarttime_focuschanged", __ref, _hasfocus);}
RemoteObject _currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
RemoteObject _tt = RemoteObject.declareNull("de.donmanfred.TimePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 3423;BA.debugLine="Sub DialogReqStartTime_FocusChanged (HasFocus As B";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 3424;BA.debugLine="If (HasFocus = True) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_hasfocus,appdialogs.__c.getField(true,"True")))) { 
 BA.debugLineNum = 3425;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = Se";
Debug.ShouldStop(1);
_currenttimeedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
_currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("CurrentTimeEdit", _currenttimeedit);
 BA.debugLineNum = 3426;BA.debugLine="Dim tt As TimePickerDialog";
Debug.ShouldStop(2);
_tt = RemoteObject.createNew ("de.donmanfred.TimePickerDialogWrapper");Debug.locals.put("tt", _tt);
 BA.debugLineNum = 3427;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(4);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3428;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(8);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3429;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 3430;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("!",_currenttimeedit.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3431;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.";
Debug.ShouldStop(64);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currenttimeedit.runMethod(true,"getText")))),RemoteObject.createImmutable(":00")))));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3434;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHo";
Debug.ShouldStop(512);
_tt.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetTime")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_dnow))),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_dnow))),(Object)(appdialogs.__c.getField(true,"True")));
 BA.debugLineNum = 3436;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
Debug.ShouldStop(2048);
_tt.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("CurrentTimeEdit")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 3438;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
appdialogs.__c.runVoidMethod ("LogImpl","678577679",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 };
 BA.debugLineNum = 3441;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqtimermj_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("DialogReqTimeRMJ_FocusChanged (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3464);
if (RapidSub.canDelegate("dialogreqtimermj_focuschanged")) { return __ref.runUserSub(false, "appdialogs","dialogreqtimermj_focuschanged", __ref, _hasfocus);}
RemoteObject _currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
RemoteObject _tt = RemoteObject.declareNull("de.donmanfred.TimePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 3464;BA.debugLine="Sub DialogReqTimeRMJ_FocusChanged (HasFocus As Boo";
Debug.ShouldStop(128);
 BA.debugLineNum = 3466;BA.debugLine="If (HasFocus = True) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",_hasfocus,appdialogs.__c.getField(true,"True")))) { 
 BA.debugLineNum = 3467;BA.debugLine="Dim CurrentTimeEdit As FloatLabeledEditText = Se";
Debug.ShouldStop(1024);
_currenttimeedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
_currenttimeedit = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("CurrentTimeEdit", _currenttimeedit);
 BA.debugLineNum = 3468;BA.debugLine="Dim tt As TimePickerDialog";
Debug.ShouldStop(2048);
_tt = RemoteObject.createNew ("de.donmanfred.TimePickerDialogWrapper");Debug.locals.put("tt", _tt);
 BA.debugLineNum = 3469;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(4096);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3470;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(8192);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3471;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 3472;BA.debugLine="If (CurrentTimeEdit.Text  <> \"\") Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("!",_currenttimeedit.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3473;BA.debugLine="dnow = DateTime.TimeParse($\"${CurrentTimeEdit.";
Debug.ShouldStop(65536);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currenttimeedit.runMethod(true,"getText")))),RemoteObject.createImmutable(":00")))));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3476;BA.debugLine="tt.Initialize(\"CalendarGetTime\", DateTime.GetHo";
Debug.ShouldStop(524288);
_tt.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetTime")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_dnow))),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_dnow))),(Object)(appdialogs.__c.getField(true,"True")));
 BA.debugLineNum = 3478;BA.debugLine="tt.show(\"CurrentTimeEdit\")";
Debug.ShouldStop(2097152);
_tt.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("CurrentTimeEdit")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 3480;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
appdialogs.__c.runVoidMethod ("LogImpl","678708752",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 };
 BA.debugLineNum = 3483;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqtypermj_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DialogReqTypeRMJ_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3351);
if (RapidSub.canDelegate("dialogreqtypermj_itemclick")) { return __ref.runUserSub(false, "appdialogs","dialogreqtypermj_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3351;BA.debugLine="Sub DialogReqTypeRMJ_ItemClick (Position As Int, V";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 3353;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editparamitem_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EditParamItem_FocusChanged (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,968);
if (RapidSub.canDelegate("editparamitem_focuschanged")) { return __ref.runUserSub(false, "appdialogs","editparamitem_focuschanged", __ref, _hasfocus);}
RemoteObject _this = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pan2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 968;BA.debugLine="Sub EditParamItem_FocusChanged (HasFocus As Boolea";
Debug.ShouldStop(128);
 BA.debugLineNum = 969;BA.debugLine="Dim this As EditText = Sender";
Debug.ShouldStop(256);
_this = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_this = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("this", _this);
 BA.debugLineNum = 970;BA.debugLine="Log(HasFocus)";
Debug.ShouldStop(512);
appdialogs.__c.runVoidMethod ("LogImpl","672810498",BA.ObjectToString(_hasfocus),0);
 BA.debugLineNum = 971;BA.debugLine="Dim Pan As Panel = this.Parent";
Debug.ShouldStop(1024);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _this.runMethod(false,"getParent"));Debug.locals.put("Pan", _pan);
 BA.debugLineNum = 972;BA.debugLine="Dim Pan2 As Panel = Pan.Parent";
Debug.ShouldStop(2048);
_pan2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _pan.runMethod(false,"getParent"));Debug.locals.put("Pan2", _pan2);
 BA.debugLineNum = 973;BA.debugLine="Dim sSQL As String = $\"update dta_device_params s";
Debug.ShouldStop(4096);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_device_params set value='"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.runMethod(true,"getText")))),RemoteObject.createImmutable("' where tagcode='"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_pan2.runMethod(false,"getTag"))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 974;BA.debugLine="Utils.SaveSQLToLog(\"ButParamItem_ValueClick\",sSQL";
Debug.ShouldStop(8192);
appdialogs._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ButParamItem_ValueClick")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 976;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findprintersbt(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FindPrintersBT (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3630);
if (RapidSub.canDelegate("findprintersbt")) { return __ref.runUserSub(false, "appdialogs","findprintersbt", __ref);}
 BA.debugLineNum = 3630;BA.debugLine="Sub FindPrintersBT";
Debug.ShouldStop(8192);
 BA.debugLineNum = 3631;BA.debugLine="Printer.SearchNewPrinter";
Debug.ShouldStop(16384);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_vvvv5");
 BA.debugLineNum = 3632;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getaddressdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _typaddress,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("GetAddressDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1931);
if (RapidSub.canDelegate("getaddressdialog")) { __ref.runUserSub(false, "appdialogs","getaddressdialog", __ref, _activ, _curr, _typaddress, _asnew); return;}
ResumableSub_GetAddressDialog rsub = new ResumableSub_GetAddressDialog(null,__ref,_activ,_curr,_typaddress,_asnew);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetAddressDialog extends BA.ResumableSub {
public ResumableSub_GetAddressDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _typaddress,RemoteObject _asnew) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._typaddress = _typaddress;
this._asnew = _asnew;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _typaddress;
RemoteObject _asnew;
RemoteObject _texto = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _settheaddress = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._address");
int step9;
int limit9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetAddressDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1931);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
Debug.locals.put("typAddress", _typaddress);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 1932;BA.debugLine="Dim Texto As String = ShareCode.AppDialogsEdicao";
Debug.ShouldStop(2048);
_texto = parent._sharecode._appdialogsedicao /*RemoteObject*/ ;Debug.locals.put("Texto", _texto);Debug.locals.put("Texto", _texto);
 BA.debugLineNum = 1933;BA.debugLine="If (asNew) Then Texto = ShareCode.AppDialogsnovo";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 6;
if ((_asnew).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_texto = parent._sharecode._appdialogsnovo /*RemoteObject*/ ;Debug.locals.put("Texto", _texto);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1934;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Texto, \"C";
Debug.ShouldStop(8192);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_texto),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1936;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(32768);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1937;BA.debugLine="ApplDialog.SetSize(95%x, 500dip)";
Debug.ShouldStop(65536);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 1938;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getaddressdialog"), _sf);
this.state = 37;
return;
case 37:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 1939;BA.debugLine="pnl.LoadLayout(\"dialog_entityAddress_device_2\")";
Debug.ShouldStop(262144);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_entityAddress_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1941;BA.debugLine="DialogAddressType.DropdownBackgroundColor = Const";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dialogaddresstype" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 1942;BA.debugLine="For i = 0 To typAddress.Size-1";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//for
this.state = 10;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {_typaddress.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 39;
 BA.debugLineNum = 1943;BA.debugLine="DialogAddressType.Add( typAddress.Get(i) )";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialogaddresstype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_typaddress.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1946;BA.debugLine="If Not(asNew) Then";
Debug.ShouldStop(33554432);

case 10:
//if
this.state = 32;
if (parent.__c.runMethod(true,"Not",(Object)(_asnew)).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1947;BA.debugLine="If (curr.AddressName <> \"\") Then";
Debug.ShouldStop(67108864);
if (true) break;

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"AddressName" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1948;BA.debugLine="DialogAddressName.Text = curr.AddressName";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dialogaddressname" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"AddressName" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1950;BA.debugLine="If (curr.AddressName2 <> \"\") Then";
Debug.ShouldStop(536870912);

case 16:
//if
this.state = 19;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"AddressName2" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1951;BA.debugLine="DialogAddressName2.Text = curr.AddressName2";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialogaddressname2" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"AddressName2" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1953;BA.debugLine="If (curr.AddressPostalCode <> \"\") Then";
Debug.ShouldStop(1);

case 19:
//if
this.state = 22;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"AddressPostalCode" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1954;BA.debugLine="DialogAddressPostalCode.Text = curr.AddressPost";
Debug.ShouldStop(2);
__ref.getField(false,"_dialogaddresspostalcode" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"AddressPostalCode" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1956;BA.debugLine="If (curr.AddressCity <> \"\") Then";
Debug.ShouldStop(8);

case 22:
//if
this.state = 25;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"AddressCity" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1957;BA.debugLine="DialogAddressCity.Text = curr.AddressCity";
Debug.ShouldStop(16);
__ref.getField(false,"_dialogaddresscity" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"AddressCity" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1959;BA.debugLine="If (curr.AddressLatitude <> \"\") Then";
Debug.ShouldStop(64);

case 25:
//if
this.state = 28;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"AddressLatitude" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1960;BA.debugLine="DialogAddressLatitude.Text = curr.AddressLatitu";
Debug.ShouldStop(128);
__ref.getField(false,"_dialogaddresslatitude" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"AddressLatitude" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1962;BA.debugLine="If (curr.AddressLongitude <> \"\") Then";
Debug.ShouldStop(512);

case 28:
//if
this.state = 31;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"AddressLongitude" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1963;BA.debugLine="DialogAddressLongitude.Text = curr.AddressLongi";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialogaddresslongitude" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"AddressLongitude" /*RemoteObject*/ )));
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
 BA.debugLineNum = 1967;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getaddressdialog"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 33;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1968;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (true) break;

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1969;BA.debugLine="Dim SetTheAddress As Address = _ 			Types.MakeAd";
Debug.ShouldStop(65536);
_settheaddress = parent._types.runMethod(false,"_makeaddress" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogaddresstype" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogaddressname" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogaddressname2" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogaddresspostalcode" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogaddresscity" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogaddresslatitude" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogaddresslongitude" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_asnew));Debug.locals.put("SetTheAddress", _settheaddress);Debug.locals.put("SetTheAddress", _settheaddress);
 BA.debugLineNum = 1972;BA.debugLine="CallSub2(activ, \"SetTheAddress\", SetTheAddress)";
Debug.ShouldStop(524288);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetTheAddress")),(Object)((_settheaddress)));
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 1974;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static void  _getappauthorizationdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _funccall,RemoteObject _authdata,RemoteObject _versions,RemoteObject _orientation) throws Exception{
try {
		Debug.PushSubsStack("getAppAuthorizationDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1862);
if (RapidSub.canDelegate("getappauthorizationdialog")) { __ref.runUserSub(false, "appdialogs","getappauthorizationdialog", __ref, _activ, _funccall, _authdata, _versions, _orientation); return;}
ResumableSub_getAppAuthorizationDialog rsub = new ResumableSub_getAppAuthorizationDialog(null,__ref,_activ,_funccall,_authdata,_versions,_orientation);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getAppAuthorizationDialog extends BA.ResumableSub {
public ResumableSub_getAppAuthorizationDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _funccall,RemoteObject _authdata,RemoteObject _versions,RemoteObject _orientation) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._funccall = _funccall;
this._authdata = _authdata;
this._versions = _versions;
this._orientation = _orientation;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _funccall;
RemoteObject _authdata;
RemoteObject _versions;
RemoteObject _orientation;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _retdata = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._authorization");
int step11;
int limit11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getAppAuthorizationDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1862);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("funcCall", _funccall);
Debug.locals.put("AuthData", _authdata);
Debug.locals.put("versions", _versions);
Debug.locals.put("orientation", _orientation);
 BA.debugLineNum = 1863;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Definiçõ";
Debug.ShouldStop(64);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Definições de Autorização")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1865;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(256);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1866;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1867;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
Debug.ShouldStop(1024);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1869;BA.debugLine="ApplDialog.SetSize(70%x, 450dip)";
Debug.ShouldStop(4096);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 450)))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1871;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getappauthorizationdialog"), _sf);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 1872;BA.debugLine="pnl.LoadLayout(\"dialog_appAuthorization_device_2\"";
Debug.ShouldStop(32768);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_appAuthorization_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1874;BA.debugLine="ConfigEditVersion.DropdownBackgroundColor = Const";
Debug.ShouldStop(131072);
__ref.getField(false,"_configeditversion" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 1875;BA.debugLine="For i = 0 To versions.Size-1";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//for
this.state = 10;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {_versions.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 29;
 BA.debugLineNum = 1876;BA.debugLine="ConfigEditVersion.Add( versions.Get(i) )";
Debug.ShouldStop(524288);
__ref.getField(false,"_configeditversion" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_versions.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1878;BA.debugLine="If Not(Utils.isNullOrEmpty(AuthData.Instance)) Th";
Debug.ShouldStop(2097152);

case 10:
//if
this.state = 13;
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_authdata.getField(true,"Instance" /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1879;BA.debugLine="ConfigEditInstance.Text = AuthData.Instance";
Debug.ShouldStop(4194304);
__ref.getField(false,"_configeditinstance" /*RemoteObject*/ ).runMethod(true,"setText",(_authdata.getField(true,"Instance" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1882;BA.debugLine="If Not(Utils.isNullOrEmpty(AuthData.Authorization";
Debug.ShouldStop(33554432);

case 13:
//if
this.state = 16;
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_authdata.getField(true,"Authorization" /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1883;BA.debugLine="ConfigEditAuth.Text = AuthData.Authorization";
Debug.ShouldStop(67108864);
__ref.getField(false,"_configeditauth" /*RemoteObject*/ ).runMethod(true,"setText",(_authdata.getField(true,"Authorization" /*RemoteObject*/ )));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1885;BA.debugLine="ConfigEditVersion.SelectedIndex = AuthData.Versio";
Debug.ShouldStop(268435456);
__ref.getField(false,"_configeditversion" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, _authdata.getField(true,"Version" /*RemoteObject*/ )));
 BA.debugLineNum = 1887;BA.debugLine="ConfigEditOrientation.Add(\"Orientação Landscape\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_configeditorientation" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Orientação Landscape")));
 BA.debugLineNum = 1888;BA.debugLine="ConfigEditOrientation.Add(\"Orientação Portrait\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_configeditorientation" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Orientação Portrait")));
 BA.debugLineNum = 1889;BA.debugLine="ConfigEditOrientation.SelectedIndex = orientation";
Debug.ShouldStop(1);
__ref.getField(false,"_configeditorientation" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_orientation);
 BA.debugLineNum = 1890;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(2);
if (true) break;

case 17:
//if
this.state = 20;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1891;BA.debugLine="ConfigEditOrientation.Enabled = False";
Debug.ShouldStop(4);
__ref.getField(false,"_configeditorientation" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1892;BA.debugLine="ConfigEditOrientation.SelectedIndex = 1";
Debug.ShouldStop(8);
__ref.getField(false,"_configeditorientation" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 1));
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 1895;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getappauthorizationdialog"), _sf);
this.state = 30;
return;
case 30:
//C
this.state = 21;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1896;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 1897;BA.debugLine="Dim retData As Authorization = Types.MakeAuthori";
Debug.ShouldStop(256);
_retdata = parent._types.runMethod(false,"_makeauthorization" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_configeditinstance" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_configeditauth" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.NumberToString(__ref.getField(false,"_configeditversion" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))),(Object)(parent._sharecode._app_domain /*RemoteObject*/ ));Debug.locals.put("retData", _retdata);Debug.locals.put("retData", _retdata);
 BA.debugLineNum = 1898;BA.debugLine="ShareCode.DEVICE_ORIENTATION = ConfigEditOrienta";
Debug.ShouldStop(512);
parent._sharecode._device_orientation /*RemoteObject*/  = __ref.getField(false,"_configeditorientation" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");
 BA.debugLineNum = 1899;BA.debugLine="CallSub2(activ, funcCall, retData)  '\"SetAuthori";
Debug.ShouldStop(1024);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(_funccall),(Object)((_retdata)));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1901;BA.debugLine="CallSub(activ, \"prc_AppClose\")";
Debug.ShouldStop(4096);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activ),(Object)(RemoteObject.createImmutable("prc_AppClose")));
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 1903;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static void  _getbluetoothdeviceslistdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("GetBluetoothDevicesListDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3485);
if (RapidSub.canDelegate("getbluetoothdeviceslistdialog")) { __ref.runUserSub(false, "appdialogs","getbluetoothdeviceslistdialog", __ref, _activ, _activname, _title); return;}
ResumableSub_GetBluetoothDevicesListDialog rsub = new ResumableSub_GetBluetoothDevicesListDialog(null,__ref,_activ,_activname,_title);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetBluetoothDevicesListDialog extends BA.ResumableSub {
public ResumableSub_GetBluetoothDevicesListDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetBluetoothDevicesListDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3485);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
 BA.debugLineNum = 3486;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(536870912);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 3487;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(1073741824);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 3491;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
Debug.ShouldStop(4);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3493;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(16);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3494;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3495;BA.debugLine="ApplDialog.SetSize(80%x, 80%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3498;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(512);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 3499;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getbluetoothdeviceslistdialog"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 3500;BA.debugLine="DialogPanel.LoadLayout(\"dialog_bluetooth_devices\"";
Debug.ShouldStop(2048);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_bluetooth_devices")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3501;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.Label.T";
Debug.ShouldStop(4096);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 3502;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.Label.T";
Debug.ShouldStop(8192);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 3503;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.ItemHei";
Debug.ShouldStop(16384);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 3504;BA.debugLine="Printer.Initialize(Me,\"Printer\",Encoding.Windows1";
Debug.ShouldStop(32768);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("Printer")),(Object)(parent._encoding.getField(true,"_v5")));
 BA.debugLineNum = 3505;BA.debugLine="ButtonAssociated.Color = Consts.ColorMain";
Debug.ShouldStop(65536);
__ref.getField(false,"_buttonassociated" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 3506;BA.debugLine="ButtonScanPrinter.Color = Consts.ColorMain";
Debug.ShouldStop(131072);
__ref.getField(false,"_buttonscanprinter" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 3507;BA.debugLine="ButtonPrint.Color = Consts.ColorMain";
Debug.ShouldStop(262144);
__ref.getField(false,"_buttonprint" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 3511;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getbluetoothdeviceslistdialog"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3512;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8388608);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
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
 BA.debugLineNum = 3519;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static void  _getboxeditfulltext(RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _title2show,RemoteObject _txt2edit) throws Exception{
try {
		Debug.PushSubsStack("getBoxEditFullText (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2413);
if (RapidSub.canDelegate("getboxeditfulltext")) { __ref.runUserSub(false, "appdialogs","getboxeditfulltext", __ref, _activ, _this, _title2show, _txt2edit); return;}
ResumableSub_getBoxEditFullText rsub = new ResumableSub_getBoxEditFullText(null,__ref,_activ,_this,_title2show,_txt2edit);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getBoxEditFullText extends BA.ResumableSub {
public ResumableSub_getBoxEditFullText(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _title2show,RemoteObject _txt2edit) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._title2show = _title2show;
this._txt2edit = _txt2edit;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _this;
RemoteObject _title2show;
RemoteObject _txt2edit;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getBoxEditFullText (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2413);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("this", _this);
Debug.locals.put("title2show", _title2show);
Debug.locals.put("txt2edit", _txt2edit);
 BA.debugLineNum = 2415;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sho";
Debug.ShouldStop(16384);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title2show),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2417;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(65536);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2418;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2419;BA.debugLine="ApplDialog.SetSize(60%x, 50%y)";
Debug.ShouldStop(262144);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2421;BA.debugLine="ApplDialog.SetSize(90%x, 70%y)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2424;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditfulltext"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2425;BA.debugLine="pnl.LoadLayout(\"dialog_full_text\")";
Debug.ShouldStop(16777216);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_full_text")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2426;BA.debugLine="BoxEditFullText.Text=this.Text";
Debug.ShouldStop(33554432);
__ref.getField(false,"_boxeditfulltext" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_this.runMethod(true,"getText")));
 BA.debugLineNum = 2427;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditfulltext"), _sf);
this.state = 14;
return;
case 14:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2428;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(134217728);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2429;BA.debugLine="this.Text = BoxEditFullText.Text";
Debug.ShouldStop(268435456);
_this.runMethod(true,"setText",(__ref.getField(false,"_boxeditfulltext" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 2430;BA.debugLine="CallSubDelayed2(activ, \"CLAItemEditValueReturnFr";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("CLAItemEditValueReturnFromFloatEditBox")),(Object)((_this)));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2432;BA.debugLine="CallSubDelayed2(activ, \"CLAItemEditValueReturnFr";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("CLAItemEditValueReturnFromFloatEditBoxCancel")),(Object)((_this)));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2434;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _getboxeditnumbertext(RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _title2show) throws Exception{
try {
		Debug.PushSubsStack("getBoxEditNumberText (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3927);
if (RapidSub.canDelegate("getboxeditnumbertext")) { __ref.runUserSub(false, "appdialogs","getboxeditnumbertext", __ref, _activ, _this, _title2show); return;}
ResumableSub_getBoxEditNumberText rsub = new ResumableSub_getBoxEditNumberText(null,__ref,_activ,_this,_title2show);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getBoxEditNumberText extends BA.ResumableSub {
public ResumableSub_getBoxEditNumberText(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _title2show) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._title2show = _title2show;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _this;
RemoteObject _title2show;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getBoxEditNumberText (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3927);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("this", _this);
Debug.locals.put("title2show", _title2show);
 BA.debugLineNum = 3929;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sho";
Debug.ShouldStop(16777216);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title2show),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3931;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(67108864);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3932;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3933;BA.debugLine="ApplDialog.SetSize(300dip, 200dip)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3935;BA.debugLine="ApplDialog.SetSize(300dip, 200dip)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3937;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditnumbertext"), _sf);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3938;BA.debugLine="pnl.LoadLayout(\"dialog_number_text\")";
Debug.ShouldStop(2);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_number_text")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3939;BA.debugLine="BoxEditNumberText.Text=this.Text";
Debug.ShouldStop(4);
__ref.getField(false,"_boxeditnumbertext" /*RemoteObject*/ ).runMethod(true,"setText",(_this.runMethod(true,"getText")));
 BA.debugLineNum = 3940;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditnumbertext"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3941;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3942;BA.debugLine="this.Text = BoxEditNumberText.Text";
Debug.ShouldStop(32);
_this.runMethod(true,"setText",(__ref.getField(false,"_boxeditnumbertext" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 3943;BA.debugLine="CallSubDelayed2(activ, \"ReturnFromNumberBox\", th";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("ReturnFromNumberBox")),(Object)((_this)));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 3945;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _getboxeditnumbertextedit(RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _title2show) throws Exception{
try {
		Debug.PushSubsStack("getBoxEditNumberTextEDIT (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3947);
if (RapidSub.canDelegate("getboxeditnumbertextedit")) { __ref.runUserSub(false, "appdialogs","getboxeditnumbertextedit", __ref, _activ, _this, _title2show); return;}
ResumableSub_getBoxEditNumberTextEDIT rsub = new ResumableSub_getBoxEditNumberTextEDIT(null,__ref,_activ,_this,_title2show);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getBoxEditNumberTextEDIT extends BA.ResumableSub {
public ResumableSub_getBoxEditNumberTextEDIT(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _title2show) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._title2show = _title2show;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _this;
RemoteObject _title2show;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getBoxEditNumberTextEDIT (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3947);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("this", _this);
Debug.locals.put("title2show", _title2show);
 BA.debugLineNum = 3949;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sho";
Debug.ShouldStop(4096);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title2show),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3951;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3952;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3953;BA.debugLine="ApplDialog.SetSize(300dip, 200dip)";
Debug.ShouldStop(65536);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3955;BA.debugLine="ApplDialog.SetSize(300dip, 200dip)";
Debug.ShouldStop(262144);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3957;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditnumbertextedit"), _sf);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3958;BA.debugLine="pnl.LoadLayout(\"dialog_number_text_edit\")";
Debug.ShouldStop(2097152);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_number_text_edit")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3959;BA.debugLine="BoxEditNumberTextEDIT.Text=this.Text";
Debug.ShouldStop(4194304);
__ref.getField(false,"_boxeditnumbertextedit" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_this.runMethod(true,"getText")));
 BA.debugLineNum = 3960;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditnumbertextedit"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3961;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3962;BA.debugLine="this.Text = BoxEditNumberTextEDIT.Text";
Debug.ShouldStop(33554432);
_this.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_boxeditnumbertextedit" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 3963;BA.debugLine="CallSubDelayed2(activ, \"ReturnFromNumberBoxEDIT\"";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("ReturnFromNumberBoxEDIT")),(Object)((_this)));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 3965;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static void  _getboxeditsearch(RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _inscript,RemoteObject _title2show,RemoteObject _params,RemoteObject _showothers) throws Exception{
try {
		Debug.PushSubsStack("getBoxEditSearch (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2439);
if (RapidSub.canDelegate("getboxeditsearch")) { __ref.runUserSub(false, "appdialogs","getboxeditsearch", __ref, _activ, _this, _inscript, _title2show, _params, _showothers); return;}
ResumableSub_getBoxEditSearch rsub = new ResumableSub_getBoxEditSearch(null,__ref,_activ,_this,_inscript,_title2show,_params,_showothers);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getBoxEditSearch extends BA.ResumableSub {
public ResumableSub_getBoxEditSearch(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _inscript,RemoteObject _title2show,RemoteObject _params,RemoteObject _showothers) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._inscript = _inscript;
this._title2show = _title2show;
this._params = _params;
this._showothers = _showothers;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _this;
RemoteObject _inscript;
RemoteObject _title2show;
RemoteObject _params;
RemoteObject _showothers;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _inscriptwithlimit = RemoteObject.createImmutable("");
RemoteObject _tstfld = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _listacampos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _colname = RemoteObject.createImmutable("");
RemoteObject _sqlpesquisa = RemoteObject.createImmutable("");
int _d = 0;
RemoteObject _lfd = RemoteObject.createImmutable("");
RemoteObject _sqloper = RemoteObject.createImmutable("");
RemoteObject _registos = RemoteObject.createImmutable(0);
RemoteObject _records2search = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _listline_key = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int step30;
int limit30;
int step37;
int limit37;
int step61;
int limit61;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getBoxEditSearch (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2439);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("this", _this);
Debug.locals.put("InScript", _inscript);
Debug.locals.put("title2show", _title2show);
Debug.locals.put("params", _params);
Debug.locals.put("ShowOthers", _showothers);
 BA.debugLineNum = 2441;BA.debugLine="If Utils.Int2Bool(ShowOthers) Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 6;
if (parent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_showothers)).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2442;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sh";
Debug.ShouldStop(512);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title2show),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Outros")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2444;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title2sh";
Debug.ShouldStop(2048);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title2show),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2447;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2448;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2449;BA.debugLine="ApplDialog.SetSize(75%x, 80%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2451;BA.debugLine="ApplDialog.SetSize(90%x, 70%y)";
Debug.ShouldStop(262144);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2454;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditsearch"), _sf);
this.state = 71;
return;
case 71:
//C
this.state = 13;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2456;BA.debugLine="pnl.LoadLayout(\"dialog_search_V2\")";
Debug.ShouldStop(8388608);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_search_V2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2459;BA.debugLine="BoxEditSearchedValue.Text=this.Text";
Debug.ShouldStop(67108864);
__ref.getField(false,"_boxeditsearchedvalue" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_this.runMethod(true,"getText")));
 BA.debugLineNum = 2460;BA.debugLine="Lista2Search.Clear";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lista2search" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 2461;BA.debugLine="PassScript = InScript";
Debug.ShouldStop(268435456);
__ref.setField ("_passscript" /*RemoteObject*/ ,_inscript);
 BA.debugLineNum = 2462;BA.debugLine="PassedAct = activ";
Debug.ShouldStop(536870912);
__ref.setField ("_passedact" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 2464;BA.debugLine="StartingRow = 0";
Debug.ShouldStop(-2147483648);
__ref.setField ("_startingrow" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 2465;BA.debugLine="Dim InScriptwithLimit As String = \"\"";
Debug.ShouldStop(1);
_inscriptwithlimit = BA.ObjectToString("");Debug.locals.put("InScriptwithLimit", _inscriptwithlimit);Debug.locals.put("InScriptwithLimit", _inscriptwithlimit);
 BA.debugLineNum = 2467;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 2468;BA.debugLine="Sleep(100)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditsearch"),BA.numberCast(int.class, 100));
this.state = 72;
return;
case 72:
//C
this.state = 13;
;
 BA.debugLineNum = 2470;BA.debugLine="If ShareCode.SearchFromQuery Then";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 40;
if (parent._sharecode._searchfromquery /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 39;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2472;BA.debugLine="If PassScript.EndsWith(\";\") Then";
Debug.ShouldStop(128);
if (true) break;

case 16:
//if
this.state = 19;
if (__ref.getField(true,"_passscript" /*RemoteObject*/ ).runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))).<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2473;BA.debugLine="PassScript = PassScript.SubString2(0,PassScript";
Debug.ShouldStop(256);
__ref.setField ("_passscript" /*RemoteObject*/ ,__ref.getField(true,"_passscript" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_passscript" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 2476;BA.debugLine="PassScript = $\"select TBL.* from (${PassScript})";
Debug.ShouldStop(2048);
__ref.setField ("_passscript" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("select TBL.* from ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_passscript" /*RemoteObject*/ )))),RemoteObject.createImmutable(") as TBL where 1=1 "))));
 BA.debugLineNum = 2478;BA.debugLine="Dim TstFld As ResultSet = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(8192);
_tstfld = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_tstfld = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(__ref.getField(true,"_passscript" /*RemoteObject*/ ))));Debug.locals.put("TstFld", _tstfld);
 BA.debugLineNum = 2479;BA.debugLine="Dim ListaCampos As List";
Debug.ShouldStop(16384);
_listacampos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListaCampos", _listacampos);
 BA.debugLineNum = 2480;BA.debugLine="ListaCampos.Initialize";
Debug.ShouldStop(32768);
_listacampos.runVoidMethod ("Initialize");
 BA.debugLineNum = 2481;BA.debugLine="For i=0 To TstFld.ColumnCount - 1";
Debug.ShouldStop(65536);
if (true) break;

case 20:
//for
this.state = 27;
step30 = 1;
limit30 = RemoteObject.solve(new RemoteObject[] {_tstfld.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2482;BA.debugLine="Dim ColName As String = TstFld.GetColumnName(i)";
Debug.ShouldStop(131072);
_colname = _tstfld.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("ColName", _colname);Debug.locals.put("ColName", _colname);
 BA.debugLineNum = 2483;BA.debugLine="If Not(ColName.ToLowerCase.Contains(\"tagcode\"))";
Debug.ShouldStop(262144);
if (true) break;

case 23:
//if
this.state = 26;
if (parent.__c.runMethod(true,"Not",(Object)(_colname.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("tagcode"))))).<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2484;BA.debugLine="ListaCampos.Add($\"TBL.${ColName}\"$)";
Debug.ShouldStop(524288);
_listacampos.runVoidMethod ("Add",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("TBL."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colname))),RemoteObject.createImmutable(""))))));
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2488;BA.debugLine="Dim SqlPesquisa As String = \"\"";
Debug.ShouldStop(8388608);
_sqlpesquisa = BA.ObjectToString("");Debug.locals.put("SqlPesquisa", _sqlpesquisa);Debug.locals.put("SqlPesquisa", _sqlpesquisa);
 BA.debugLineNum = 2489;BA.debugLine="For d=0 To ListaCampos.Size -1";
Debug.ShouldStop(16777216);
if (true) break;

case 28:
//for
this.state = 37;
step37 = 1;
limit37 = RemoteObject.solve(new RemoteObject[] {_listacampos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_d = 0 ;
Debug.locals.put("d", _d);
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
Debug.locals.put("d", _d);
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2490;BA.debugLine="Dim LFD As String = ListaCampos.Get(d)";
Debug.ShouldStop(33554432);
_lfd = BA.ObjectToString(_listacampos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _d))));Debug.locals.put("LFD", _lfd);Debug.locals.put("LFD", _lfd);
 BA.debugLineNum = 2491;BA.debugLine="If d=0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_d),BA.numberCast(double.class, 0))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 BA.debugLineNum = 2492;BA.debugLine="Dim SqlOPer As String = \"and\"";
Debug.ShouldStop(134217728);
_sqloper = BA.ObjectToString("and");Debug.locals.put("SqlOPer", _sqloper);Debug.locals.put("SqlOPer", _sqloper);
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 2495;BA.debugLine="Dim SqlOPer As String = \"or\"";
Debug.ShouldStop(1073741824);
_sqloper = BA.ObjectToString("or");Debug.locals.put("SqlOPer", _sqloper);Debug.locals.put("SqlOPer", _sqloper);
 if (true) break;

case 36:
//C
this.state = 76;
;
 BA.debugLineNum = 2498;BA.debugLine="SqlPesquisa = SqlPesquisa & $\" ${SqlOPer} ${LFD";
Debug.ShouldStop(2);
_sqlpesquisa = RemoteObject.concat(_sqlpesquisa,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqloper))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lfd))),RemoteObject.createImmutable(" like '%"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_boxeditsearchedvalue" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("%'"))));Debug.locals.put("SqlPesquisa", _sqlpesquisa);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 40;
Debug.locals.put("d", _d);
;
 BA.debugLineNum = 2501;BA.debugLine="InScript = PassScript & SqlPesquisa";
Debug.ShouldStop(16);
_inscript = RemoteObject.concat(__ref.getField(true,"_passscript" /*RemoteObject*/ ),_sqlpesquisa);Debug.locals.put("InScript", _inscript);
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2503;BA.debugLine="InScript = PassScript.Replace(\":__VALOR\",BoxEdit";
Debug.ShouldStop(64);
_inscript = __ref.getField(true,"_passscript" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString(":__VALOR")),(Object)(__ref.getField(false,"_boxeditsearchedvalue" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("InScript", _inscript);
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 2506;BA.debugLine="ShareCode.CurrentSerchquery = InScript";
Debug.ShouldStop(512);
parent._sharecode._currentserchquery /*RemoteObject*/  = _inscript;
 BA.debugLineNum = 2507;BA.debugLine="InScriptwithLimit = InScript & $\" limit 0, 25\"$";
Debug.ShouldStop(1024);
_inscriptwithlimit = RemoteObject.concat(_inscript,(RemoteObject.createImmutable(" limit 0, 25")));Debug.locals.put("InScriptwithLimit", _inscriptwithlimit);
 BA.debugLineNum = 2508;BA.debugLine="Log(InScriptwithLimit)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","676546117",_inscriptwithlimit,0);
 BA.debugLineNum = 2510;BA.debugLine="Try";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 2511;BA.debugLine="Dim registos As Int = 0";
Debug.ShouldStop(16384);
_registos = BA.numberCast(int.class, 0);Debug.locals.put("registos", _registos);Debug.locals.put("registos", _registos);
 BA.debugLineNum = 2512;BA.debugLine="Private Records2Search As ResultSet = Starter.Lo";
Debug.ShouldStop(32768);
_records2search = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_records2search = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_inscriptwithlimit)));Debug.locals.put("Records2Search", _records2search);
 BA.debugLineNum = 2513;BA.debugLine="Log(Records2Search.RowCount)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","676546122",BA.NumberToString(_records2search.runMethod(true,"getRowCount")),0);
 BA.debugLineNum = 2514;BA.debugLine="Dim ListLine_key As String = \"\"";
Debug.ShouldStop(131072);
_listline_key = BA.ObjectToString("");Debug.locals.put("ListLine_key", _listline_key);Debug.locals.put("ListLine_key", _listline_key);
 BA.debugLineNum = 2515;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 2517;BA.debugLine="Lista2Search.Clear ' xxx - Para nao duplicar ite";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lista2search" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 2519;BA.debugLine="Do While Records2Search.NextRow";
Debug.ShouldStop(4194304);
if (true) break;

case 44:
//do while
this.state = 55;
while (_records2search.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 46;
if (true) break;
}
if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 2520;BA.debugLine="For i=0 To Records2Search.ColumnCount -1";
Debug.ShouldStop(8388608);
if (true) break;

case 47:
//for
this.state = 54;
step61 = 1;
limit61 = RemoteObject.solve(new RemoteObject[] {_records2search.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 2521;BA.debugLine="If Records2Search.GetColumnName(i).ToLowerCase";
Debug.ShouldStop(16777216);
if (true) break;

case 50:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_records2search.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"toLowerCase"),BA.ObjectToString("tagcode"))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 2522;BA.debugLine="ListLine_key =  Records2Search.GetString(Reco";
Debug.ShouldStop(33554432);
_listline_key = _records2search.runMethod(true,"GetString",(Object)(_records2search.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("ListLine_key", _listline_key);
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2525;BA.debugLine="registos = registos +1";
Debug.ShouldStop(268435456);
_registos = RemoteObject.solve(new RemoteObject[] {_registos,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("registos", _registos);
 BA.debugLineNum = 2526;BA.debugLine="Lista2Search.Add(createSearchLineDetail(activ,";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lista2search" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createsearchlinedetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(_records2search),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_listline_key)));
 if (true) break;

case 55:
//C
this.state = 58;
;
 BA.debugLineNum = 2528;BA.debugLine="Records2Search.Close";
Debug.ShouldStop(-2147483648);
_records2search.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
 BA.debugLineNum = 2531;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","676546140",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 58:
//C
this.state = 59;
this.catchState = 0;
;
 BA.debugLineNum = 2533;BA.debugLine="Log($\"Encontrou ${registos} registos!\"$)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","676546142",(RemoteObject.concat(RemoteObject.createImmutable("Encontrou "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_registos))),RemoteObject.createImmutable(" registos!"))),0);
 BA.debugLineNum = 2534;BA.debugLine="If registos <= 0 Then";
Debug.ShouldStop(32);
if (true) break;

case 59:
//if
this.state = 62;
if (RemoteObject.solveBoolean("k",_registos,BA.numberCast(double.class, 0))) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 2535;BA.debugLine="MsgboxAsync(\"Não existem registos para o criteri";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Não existem registos para o criterio definido !")),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalinfotitle /*RemoteObject*/ )),__ref.getField(false, "ba"));
 BA.debugLineNum = 2536;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2537;BA.debugLine="ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = \"\"";
Debug.ShouldStop(256);
parent._sharecode._item_returned_from_searchlist /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 2538;BA.debugLine="ShareCode.TAG_RETURNED_FROM_SEARCHLIST = \"\"";
Debug.ShouldStop(512);
parent._sharecode._tag_returned_from_searchlist /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 2541;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2543;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getboxeditsearch"), _sf);
this.state = 79;
return;
case 79:
//C
this.state = 63;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2544;BA.debugLine="If res = DialogResponse.POSITIVE Then 'Confirmar";
Debug.ShouldStop(32768);
if (true) break;

case 63:
//if
this.state = 70;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 65;
}else 
{ BA.debugLineNum = 2546;BA.debugLine="Else if res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 67;
}else {
this.state = 69;
}}
if (true) break;

case 65:
//C
this.state = 70;
 BA.debugLineNum = 2545;BA.debugLine="CallSubDelayed3(CheckList3, \"returnfromSearchDia";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((parent._checklist3.getObject())),(Object)(BA.ObjectToString("returnfromSearchDialog")),(Object)((_this)),(Object)((_params)));
 if (true) break;

case 67:
//C
this.state = 70;
 BA.debugLineNum = 2547;BA.debugLine="DialogoOutros(activ,this,params)";
Debug.ShouldStop(262144);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_dialogooutros" /*void*/ ,(Object)(_activ),(Object)(_this),(Object)(_params));
 if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 2549;BA.debugLine="ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = \"\"";
Debug.ShouldStop(1048576);
parent._sharecode._item_returned_from_searchlist /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 2550;BA.debugLine="ShareCode.TAG_RETURNED_FROM_SEARCHLIST = \"\"";
Debug.ShouldStop(2097152);
parent._sharecode._tag_returned_from_searchlist /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 70:
//C
this.state = -1;
;
 BA.debugLineNum = 2552;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _getcladdselectdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _colitems,RemoteObject _taglist) throws Exception{
try {
		Debug.PushSubsStack("getCLADDSelectDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,602);
if (RapidSub.canDelegate("getcladdselectdialog")) { __ref.runUserSub(false, "appdialogs","getcladdselectdialog", __ref, _activ, _activname, _title, _colitems, _taglist); return;}
ResumableSub_getCLADDSelectDialog rsub = new ResumableSub_getCLADDSelectDialog(null,__ref,_activ,_activname,_title,_colitems,_taglist);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getCLADDSelectDialog extends BA.ResumableSub {
public ResumableSub_getCLADDSelectDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _colitems,RemoteObject _taglist) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._colitems = _colitems;
this._taglist = _taglist;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _colitems;
RemoteObject _taglist;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lastgroup = RemoteObject.createImmutable("");
int _row = 0;
RemoteObject _tagitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._taglisttype");
RemoteObject _groupitem = RemoteObject.createImmutable("");
RemoteObject _groupdesc = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int step10;
int limit10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getCLADDSelectDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,602);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("TagList", _taglist);
 BA.debugLineNum = 603;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(67108864);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 604;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(134217728);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 605;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, Sh";
Debug.ShouldStop(268435456);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(parent._sharecode._option_confirm /*RemoteObject*/ ),(Object)(parent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 606;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(536870912);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 607;BA.debugLine="ApplDialog.SetSize(70%x, 90%y)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 608;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(-2147483648);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 610;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getcladdselectdialog"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 611;BA.debugLine="DialogPanel.LoadLayout(\"task_item_detail_list_chk";
Debug.ShouldStop(4);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("task_item_detail_list_chk")),__ref.getField(false, "ba"));
 BA.debugLineNum = 612;BA.debugLine="Dim LastGroup As String = \"\"";
Debug.ShouldStop(8);
_lastgroup = BA.ObjectToString("");Debug.locals.put("LastGroup", _lastgroup);Debug.locals.put("LastGroup", _lastgroup);
 BA.debugLineNum = 613;BA.debugLine="For Row = 0 To TagList.size-1";
Debug.ShouldStop(16);
if (true) break;

case 1:
//for
this.state = 8;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {_taglist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
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
Debug.locals.put("Row", _row);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 614;BA.debugLine="Dim TagItem As TagListType = TagList.Get(Row)";
Debug.ShouldStop(32);
_tagitem = (_taglist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _row))));Debug.locals.put("TagItem", _tagitem);Debug.locals.put("TagItem", _tagitem);
 BA.debugLineNum = 616;BA.debugLine="Dim GroupItem As String = TagItem.taggroup";
Debug.ShouldStop(128);
_groupitem = _tagitem.getField(true,"taggroup" /*RemoteObject*/ );Debug.locals.put("GroupItem", _groupitem);Debug.locals.put("GroupItem", _groupitem);
 BA.debugLineNum = 617;BA.debugLine="Dim Groupdesc As String = TagItem.taggroup";
Debug.ShouldStop(256);
_groupdesc = _tagitem.getField(true,"taggroup" /*RemoteObject*/ );Debug.locals.put("Groupdesc", _groupdesc);Debug.locals.put("Groupdesc", _groupdesc);
 BA.debugLineNum = 618;BA.debugLine="Dim title As String = TagItem.tagname";
Debug.ShouldStop(512);
_title = _tagitem.getField(true,"tagname" /*RemoteObject*/ );Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 619;BA.debugLine="Dim tagcode As String = TagItem.tagcode";
Debug.ShouldStop(1024);
_tagcode = _tagitem.getField(true,"tagcode" /*RemoteObject*/ );Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 620;BA.debugLine="If (GroupItem.Trim <> LastGroup.Trim) Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean("!",_groupitem.runMethod(true,"trim"),_lastgroup.runMethod(true,"trim")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 621;BA.debugLine="LastGroup = GroupItem";
Debug.ShouldStop(4096);
_lastgroup = _groupitem;Debug.locals.put("LastGroup", _lastgroup);
 BA.debugLineNum = 622;BA.debugLine="ListItemsListChk.Add( createCLADDGroupLineItemD";
Debug.ShouldStop(8192);
__ref.getField(false,"_listitemslistchk" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createcladdgrouplineitemdetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(_groupdesc),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))).getObject()),(Object)((_groupitem)));
 if (true) break;

case 7:
//C
this.state = 15;
;
 BA.debugLineNum = 624;BA.debugLine="ListItemsListChk.Add( createCLADDLineItemDetail(";
Debug.ShouldStop(32768);
__ref.getField(false,"_listitemslistchk" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createcladdlineitemdetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(_tagcode),(Object)(_title),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(_tagitem)).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 627;BA.debugLine="HiddenListItemLabel = Types.MakeTagListType( \"\",";
Debug.ShouldStop(262144);
__ref.setField ("_hiddenlistitemlabel" /*RemoteObject*/ ,(parent._types.runMethod(false,"_maketaglisttype" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 628;BA.debugLine="HiddenListItemTagList = Types.MakeTagListType( \"\"";
Debug.ShouldStop(524288);
__ref.setField ("_hiddenlistitemtaglist" /*RemoteObject*/ ,parent._types.runMethod(false,"_maketaglisttype" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 629;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
Debug.ShouldStop(1048576);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 631;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getcladdselectdialog"), _sf);
this.state = 16;
return;
case 16:
//C
this.state = 9;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 632;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8388608);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 633;BA.debugLine="CallSub3(ThisActivityName, \"ReturnFromListCLADD\"";
Debug.ShouldStop(16777216);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_thisactivityname" /*RemoteObject*/ )),(Object)(BA.ObjectToString("ReturnFromListCLADD")),(Object)((_colitems)),(Object)((__ref.getField(false,"_hiddenlistitemtaglist" /*RemoteObject*/ ))));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static void  _getcontactdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _typcontacts,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("GetContactDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2003);
if (RapidSub.canDelegate("getcontactdialog")) { __ref.runUserSub(false, "appdialogs","getcontactdialog", __ref, _activ, _curr, _typcontacts, _asnew); return;}
ResumableSub_GetContactDialog rsub = new ResumableSub_GetContactDialog(null,__ref,_activ,_curr,_typcontacts,_asnew);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetContactDialog extends BA.ResumableSub {
public ResumableSub_GetContactDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _typcontacts,RemoteObject _asnew) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._typcontacts = _typcontacts;
this._asnew = _asnew;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _typcontacts;
RemoteObject _asnew;
RemoteObject _texto = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _setthecontact = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._contactrecord");
int step9;
int limit9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetContactDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2003);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
Debug.locals.put("typContacts", _typcontacts);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 2004;BA.debugLine="Dim Texto As String = ShareCode.AppDialogsEdicao";
Debug.ShouldStop(524288);
_texto = parent._sharecode._appdialogsedicao /*RemoteObject*/ ;Debug.locals.put("Texto", _texto);Debug.locals.put("Texto", _texto);
 BA.debugLineNum = 2005;BA.debugLine="If (asNew) Then Texto = ShareCode.AppDialogsnovo";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 6;
if ((_asnew).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_texto = parent._sharecode._appdialogsnovo /*RemoteObject*/ ;Debug.locals.put("Texto", _texto);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2006;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Texto, Sh";
Debug.ShouldStop(2097152);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_texto),(Object)(parent._sharecode._option_confirm /*RemoteObject*/ ),(Object)(parent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2008;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(8388608);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2009;BA.debugLine="ApplDialog.SetSize(95%x, 450dip)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 450)))));
 BA.debugLineNum = 2010;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getcontactdialog"), _sf);
this.state = 32;
return;
case 32:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2011;BA.debugLine="pnl.LoadLayout(\"dialog_ContactEdit_device_2\")";
Debug.ShouldStop(67108864);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_ContactEdit_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2013;BA.debugLine="DialogContactType.DropdownBackgroundColor = Const";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialogcontacttype" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2014;BA.debugLine="For i = 0 To typContacts.Size-1";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//for
this.state = 10;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {_typcontacts.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 34;
 BA.debugLineNum = 2015;BA.debugLine="DialogContactType.Add( typContacts.Get(i) )";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialogcontacttype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_typcontacts.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2017;BA.debugLine="DialogContactType.SelectedIndex = curr.contactTyp";
Debug.ShouldStop(1);
__ref.getField(false,"_dialogcontacttype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"contactType" /*RemoteObject*/ ));
 BA.debugLineNum = 2018;BA.debugLine="If Not(asNew) Then";
Debug.ShouldStop(2);
if (true) break;

case 11:
//if
this.state = 27;
if (parent.__c.runMethod(true,"Not",(Object)(_asnew)).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2019;BA.debugLine="If (curr.contactName <> \"\") Then";
Debug.ShouldStop(4);
if (true) break;

case 14:
//if
this.state = 17;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"contactName" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2020;BA.debugLine="DialogContactName.Text = curr.contactName";
Debug.ShouldStop(8);
__ref.getField(false,"_dialogcontactname" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"contactName" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 2022;BA.debugLine="If (curr.contactTitle <> \"\") Then";
Debug.ShouldStop(32);

case 17:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"contactTitle" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2023;BA.debugLine="DialogContactTitle.Text = curr.contactTitle";
Debug.ShouldStop(64);
__ref.getField(false,"_dialogcontacttitle" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"contactTitle" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 2025;BA.debugLine="If (curr.contactEmail <> \"\") Then";
Debug.ShouldStop(256);

case 20:
//if
this.state = 23;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"contactEmail" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2026;BA.debugLine="DialogContactEmail.Text = curr.contactEmail";
Debug.ShouldStop(512);
__ref.getField(false,"_dialogcontactemail" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"contactEmail" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 2028;BA.debugLine="If (curr.contactPhone <> \"\") Then";
Debug.ShouldStop(2048);

case 23:
//if
this.state = 26;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"contactPhone" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2029;BA.debugLine="DialogContactPhone.Text = curr.contactPhone";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialogcontactphone" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"contactPhone" /*RemoteObject*/ )));
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
 BA.debugLineNum = 2033;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getcontactdialog"), _sf);
this.state = 35;
return;
case 35:
//C
this.state = 28;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2034;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (true) break;

case 28:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2035;BA.debugLine="Dim SetTheContact As ContactRecord = _ 			Types.";
Debug.ShouldStop(262144);
_setthecontact = parent._types.runMethod(false,"_makecontact" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogaddresstype" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogcontactname" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogcontacttitle" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogcontactemail" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogcontactphone" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_curr.getField(true,"tagcode" /*RemoteObject*/ )),(Object)(_asnew));Debug.locals.put("SetTheContact", _setthecontact);Debug.locals.put("SetTheContact", _setthecontact);
 BA.debugLineNum = 2038;BA.debugLine="CallSub2(activ, \"SetTheContact\", SetTheContact)";
Debug.ShouldStop(2097152);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetTheContact")),(Object)((_setthecontact)));
 if (true) break;

case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 2040;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _getdatainfodialog(RemoteObject __ref,RemoteObject _activ) throws Exception{
try {
		Debug.PushSubsStack("GetDataInfoDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,560);
if (RapidSub.canDelegate("getdatainfodialog")) { __ref.runUserSub(false, "appdialogs","getdatainfodialog", __ref, _activ); return;}
ResumableSub_GetDataInfoDialog rsub = new ResumableSub_GetDataInfoDialog(null,__ref,_activ);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetDataInfoDialog extends BA.ResumableSub {
public ResumableSub_GetDataInfoDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetDataInfoDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,560);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
 BA.debugLineNum = 562;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Informaç";
Debug.ShouldStop(131072);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Informação de dados")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 563;BA.debugLine="CurrentCLD = ApplDialog";
Debug.ShouldStop(262144);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 564;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(524288);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 565;BA.debugLine="ApplDialog.SetSize(80%x, 320dip)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320)))));
 BA.debugLineNum = 567;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getdatainfodialog"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 568;BA.debugLine="DialogPanel.LoadLayout(\"dialog_datainfo\")";
Debug.ShouldStop(8388608);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_datainfo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 570;BA.debugLine="Wait For (sf) Dialog_Result(Res As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getdatainfodialog"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 571;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
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
 BA.debugLineNum = 575;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static void  _getdeviceinfodialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr) throws Exception{
try {
		Debug.PushSubsStack("GetDeviceInfoDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1709);
if (RapidSub.canDelegate("getdeviceinfodialog")) { __ref.runUserSub(false, "appdialogs","getdeviceinfodialog", __ref, _activ, _curr); return;}
ResumableSub_GetDeviceInfoDialog rsub = new ResumableSub_GetDeviceInfoDialog(null,__ref,_activ,_curr);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetDeviceInfoDialog extends BA.ResumableSub {
public ResumableSub_GetDeviceInfoDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetDeviceInfoDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1709);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
 BA.debugLineNum = 1710;BA.debugLine="CurrentActivityObject = activ";
Debug.ShouldStop(8192);
__ref.setField ("_currentactivityobject" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 1711;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Informaç";
Debug.ShouldStop(16384);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Informação do dispositivo")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1712;BA.debugLine="CurrentCLD = ApplDialog";
Debug.ShouldStop(32768);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 1714;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1715;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1716;BA.debugLine="ApplDialog.SetSize(680dip, 420dip)";
Debug.ShouldStop(524288);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 680)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 420)))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1718;BA.debugLine="ApplDialog.SetSize(95%x, 65%y)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 65)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1721;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getdeviceinfodialog"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 1722;BA.debugLine="pnl.LoadLayout(\"dialog_deviceInfo_2\")";
Debug.ShouldStop(33554432);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_deviceInfo_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1723;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(butResetA";
Debug.ShouldStop(67108864);
parent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_butresetapplication" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1725;BA.debugLine="DialogDeviceDescription.Text = ShareCode.APP_Inst";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialogdevicedescription" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._app_instance /*RemoteObject*/ ));
 BA.debugLineNum = 1726;BA.debugLine="DialogDeviceDimension.Text = ShareCode.APP_Author";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dialogdevicedimension" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._app_authorization /*RemoteObject*/ ));
 BA.debugLineNum = 1727;BA.debugLine="If (curr.HavePhone) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 7:
//if
this.state = 12;
if ((_curr.getField(true,"HavePhone" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1728;BA.debugLine="DialogDevicePhone.Text = \"Sim\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialogdevicephone" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Sim"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1730;BA.debugLine="DialogDevicePhone.Text = \"Não\"";
Debug.ShouldStop(2);
__ref.getField(false,"_dialogdevicephone" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Não"));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1733;BA.debugLine="DialogDeviceVersion.Text = $\"${Main.AppBuildVersi";
Debug.ShouldStop(16);
__ref.getField(false,"_dialogdeviceversion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._appbuildversion /*RemoteObject*/ ))),RemoteObject.createImmutable(", ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._appbuildversiondate /*RemoteObject*/ ))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 1734;BA.debugLine="SelectOrientation.Add(\"Orientação Landscape\")";
Debug.ShouldStop(32);
__ref.getField(false,"_selectorientation" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Orientação Landscape")));
 BA.debugLineNum = 1735;BA.debugLine="SelectOrientation.Add(\"Orientação Portrait\")";
Debug.ShouldStop(64);
__ref.getField(false,"_selectorientation" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Orientação Portrait")));
 BA.debugLineNum = 1736;BA.debugLine="SelectOrientation.SelectedIndex = ShareCode.DEVIC";
Debug.ShouldStop(128);
__ref.getField(false,"_selectorientation" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",parent._sharecode._device_orientation /*RemoteObject*/ );
 BA.debugLineNum = 1737;BA.debugLine="SelectOrientation.Enabled = False";
Debug.ShouldStop(256);
__ref.getField(false,"_selectorientation" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1747;BA.debugLine="End Sub";
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
public static void  _getdeviceparamsdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("getDeviceParamsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,666);
if (RapidSub.canDelegate("getdeviceparamsdialog")) { __ref.runUserSub(false, "appdialogs","getdeviceparamsdialog", __ref, _activ, _activname, _title); return;}
ResumableSub_getDeviceParamsDialog rsub = new ResumableSub_getDeviceParamsDialog(null,__ref,_activ,_activname,_title);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getDeviceParamsDialog extends BA.ResumableSub {
public ResumableSub_getDeviceParamsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _height = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _value_state = RemoteObject.createImmutable(0);
RemoteObject _state_in = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _active = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
int step23;
int limit23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getDeviceParamsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,666);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
 BA.debugLineNum = 667;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(67108864);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 668;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(134217728);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 669;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
Debug.ShouldStop(268435456);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Aplicar a todos")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 670;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(536870912);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 671;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 672;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 674;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
Debug.ShouldStop(2);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 677;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(16);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 679;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getdeviceparamsdialog"), null);
this.state = 35;
return;
case 35:
//C
this.state = 7;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 680;BA.debugLine="DialogPanel.LoadLayout(\"param_item_list\")";
Debug.ShouldStop(128);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("param_item_list")),__ref.getField(false, "ba"));
 BA.debugLineNum = 683;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalloadingmessage /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 684;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getdeviceparamsdialog"),BA.numberCast(int.class, 100));
this.state = 36;
return;
case 36:
//C
this.state = 7;
;
 BA.debugLineNum = 686;BA.debugLine="Dim items As Cursor";
Debug.ShouldStop(8192);
_items = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("items", _items);
 BA.debugLineNum = 687;BA.debugLine="Dim sSQL As String = $\"select id, tagcode, title,";
Debug.ShouldStop(16384);
_ssql = (RemoteObject.createImmutable("select id, tagcode, title, value_state, value, active, state_in from dta_device_params order by title"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 689;BA.debugLine="Dim height As Int = 60dip";
Debug.ShouldStop(65536);
_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 690;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 691;BA.debugLine="height = 85dip";
Debug.ShouldStop(262144);
_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85)));Debug.locals.put("height", _height);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 695;BA.debugLine="items = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(4194304);
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 696;BA.debugLine="If items.RowCount > 0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 11:
//if
this.state = 28;
if (RemoteObject.solveBoolean(">",_items.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 697;BA.debugLine="For Row = 0 To items.RowCount-1";
Debug.ShouldStop(16777216);
if (true) break;

case 14:
//for
this.state = 27;
step23 = 1;
limit23 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
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
Debug.locals.put("Row", _row);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 698;BA.debugLine="items.Position = Row";
Debug.ShouldStop(33554432);
_items.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 699;BA.debugLine="Dim title As String = items.GetString(\"title\")";
Debug.ShouldStop(67108864);
_title = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 700;BA.debugLine="Dim value_state As Int = items.GetInt(\"value_st";
Debug.ShouldStop(134217728);
_value_state = _items.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("value_state")));Debug.locals.put("value_state", _value_state);Debug.locals.put("value_state", _value_state);
 BA.debugLineNum = 701;BA.debugLine="Dim state_in As Int = items.GetInt(\"state_in\")";
Debug.ShouldStop(268435456);
_state_in = _items.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("state_in")));Debug.locals.put("state_in", _state_in);Debug.locals.put("state_in", _state_in);
 BA.debugLineNum = 702;BA.debugLine="Dim VALUE As String = items.GetString(\"value\")";
Debug.ShouldStop(536870912);
_value = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value")));Debug.locals.put("VALUE", _value);Debug.locals.put("VALUE", _value);
 BA.debugLineNum = 703;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcod";
Debug.ShouldStop(1073741824);
_tagcode = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 704;BA.debugLine="Dim active As Int = items.GetInt(\"active\")";
Debug.ShouldStop(-2147483648);
_active = _items.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("active")));Debug.locals.put("active", _active);Debug.locals.put("active", _active);
 BA.debugLineNum = 705;BA.debugLine="If (active = 1) Then";
Debug.ShouldStop(1);
if (true) break;

case 17:
//if
this.state = 26;
if ((RemoteObject.solveBoolean("=",_active,BA.numberCast(double.class, 1)))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 706;BA.debugLine="If (Utils.NNE(VALUE)) Then";
Debug.ShouldStop(2);
if (true) break;

case 20:
//if
this.state = 25;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_value))).<Boolean>get().booleanValue()) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 707;BA.debugLine="ParamItemsList.Add( createParamLineItemEdit(a";
Debug.ShouldStop(4);
__ref.getField(false,"_paramitemslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createparamlineitemedit" /*RemoteObject*/ ,(Object)(_activ),(Object)(_tagcode),(Object)(_title),(Object)(_value_state),(Object)(_value),(Object)(_state_in),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(_dialogpanel.runMethod(true,"getWidth"))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 709;BA.debugLine="ParamItemsList.Add( createParamLineItem(activ";
Debug.ShouldStop(16);
__ref.getField(false,"_paramitemslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createparamlineitem" /*RemoteObject*/ ,(Object)(_activ),(Object)(_tagcode),(Object)(_title),(Object)(_value_state),(Object)(_value),(Object)(_state_in),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(_dialogpanel.runMethod(true,"getWidth"))).getObject()),(Object)((RemoteObject.createImmutable(""))));
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
Debug.locals.put("Row", _row);
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 714;BA.debugLine="items.Close";
Debug.ShouldStop(512);
_items.runVoidMethod ("Close");
 BA.debugLineNum = 717;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 719;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getdeviceparamsdialog"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 29;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 720;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (true) break;

case 29:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 31;
}else 
{ BA.debugLineNum = 722;BA.debugLine="Else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 33;
}}
if (true) break;

case 31:
//C
this.state = 34;
 BA.debugLineNum = 721;BA.debugLine="updateAllFlags";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_updateallflags" /*RemoteObject*/ );
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 723;BA.debugLine="updateAllFlags";
Debug.ShouldStop(262144);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_updateallflags" /*RemoteObject*/ );
 BA.debugLineNum = 724;BA.debugLine="updatedeAllFlagsServer";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_updatedeallflagsserver" /*void*/ );
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 726;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static void  _getdoublelineequipmentsdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _items,RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("getDoubleLineEquipmentsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2252);
if (RapidSub.canDelegate("getdoublelineequipmentsdialog")) { __ref.runUserSub(false, "appdialogs","getdoublelineequipmentsdialog", __ref, _activ, _activname, _title, _items, _tagcode); return;}
ResumableSub_getDoubleLineEquipmentsDialog rsub = new ResumableSub_getDoubleLineEquipmentsDialog(null,__ref,_activ,_activname,_title,_items,_tagcode);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getDoubleLineEquipmentsDialog extends BA.ResumableSub {
public ResumableSub_getDoubleLineEquipmentsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _items,RemoteObject _tagcode) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._items = _items;
this._tagcode = _tagcode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _items;
RemoteObject _tagcode;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _row = 0;
RemoteObject _equipment = RemoteObject.createImmutable("");
RemoteObject _serial = RemoteObject.createImmutable("");
RemoteObject _valid = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int step12;
int limit12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getDoubleLineEquipmentsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2252);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("items", _items);
Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 2253;BA.debugLine="MasterTagcode = tagcode";
Debug.ShouldStop(4096);
__ref.setField ("_mastertagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 2254;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(8192);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 2255;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(16384);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 2258;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
Debug.ShouldStop(131072);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2260;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(524288);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2261;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2262;BA.debugLine="ApplDialog.SetSize(80%x, 80%y)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2265;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(16777216);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 2266;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getdoublelineequipmentsdialog"), null);
this.state = 15;
return;
case 15:
//C
this.state = 5;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 2267;BA.debugLine="DialogPanel.LoadLayout(\"dialog_listdoublelineitem";
Debug.ShouldStop(67108864);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_listdoublelineitems")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2268;BA.debugLine="For Row = 0 To items.RowCount-1";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//for
this.state = 8;
step12 = 1;
limit12 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
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
Debug.locals.put("Row", _row);
if (true) break;

case 7:
//C
this.state = 17;
 BA.debugLineNum = 2269;BA.debugLine="items.Position = Row";
Debug.ShouldStop(268435456);
_items.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 2271;BA.debugLine="Dim Equipment As String = items.GetString(\"title";
Debug.ShouldStop(1073741824);
_equipment = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("Equipment", _equipment);Debug.locals.put("Equipment", _equipment);
 BA.debugLineNum = 2272;BA.debugLine="Dim Serial As String = Utils.IfNullOrEmpty(items";
Debug.ShouldStop(-2147483648);
_serial = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("serialnumber")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Serial", _serial);Debug.locals.put("Serial", _serial);
 BA.debugLineNum = 2273;BA.debugLine="Dim Valid As String = Utils.IfNullOrEmpty(items.";
Debug.ShouldStop(1);
_valid = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valid_to")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Valid", _valid);Debug.locals.put("Valid", _valid);
 BA.debugLineNum = 2274;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcode";
Debug.ShouldStop(2);
_tagcode = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 2276;BA.debugLine="CLVDialog.Add( createDoubleLineItem(activ, Equip";
Debug.ShouldStop(8);
__ref.getField(false,"_clvdialog" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createdoublelineitem" /*RemoteObject*/ ,(Object)(_activ),(Object)(_equipment),(Object)((RemoteObject.concat(RemoteObject.createImmutable("# "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("   -   s/n: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_serial))),RemoteObject.createImmutable(" ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_valid))),RemoteObject.createImmutable(")")))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(_tagcode)).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 2279;BA.debugLine="items.close";
Debug.ShouldStop(64);
_items.runVoidMethod ("Close");
 BA.debugLineNum = 2282;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getdoublelineequipmentsdialog"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2283;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1024);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
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
 BA.debugLineNum = 2290;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _getentityfilterdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _typentity,RemoteObject _regions,RemoteObject _locals) throws Exception{
try {
		Debug.PushSubsStack("GetEntityFilterDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2042);
if (RapidSub.canDelegate("getentityfilterdialog")) { __ref.runUserSub(false, "appdialogs","getentityfilterdialog", __ref, _activ, _curr, _typentity, _regions, _locals); return;}
ResumableSub_GetEntityFilterDialog rsub = new ResumableSub_GetEntityFilterDialog(null,__ref,_activ,_curr,_typentity,_regions,_locals);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetEntityFilterDialog extends BA.ResumableSub {
public ResumableSub_GetEntityFilterDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _typentity,RemoteObject _regions,RemoteObject _locals) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._typentity = _typentity;
this._regions = _regions;
this._locals = _locals;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _typentity;
RemoteObject _regions;
RemoteObject _locals;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _wreq = RemoteObject.createImmutable(0);
RemoteObject _setthefilters = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._entityfilter");
int step8;
int limit8;
int step17;
int limit17;
int step22;
int limit22;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetEntityFilterDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2042);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
Debug.locals.put("typEntity", _typentity);
Debug.locals.put("Regions", _regions);
Debug.locals.put("Locals", _locals);
 BA.debugLineNum = 2043;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
Debug.ShouldStop(67108864);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Filtros")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Remover filtro")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2045;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(268435456);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2046;BA.debugLine="ApplDialog.SetSize(95%x, 590dip)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 590)))));
 BA.debugLineNum = 2047;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getentityfilterdialog"), _sf);
this.state = 34;
return;
case 34:
//C
this.state = 1;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2048;BA.debugLine="pnl.LoadLayout(\"dialog_filterEntity_device_2\")";
Debug.ShouldStop(-2147483648);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_filterEntity_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2050;BA.debugLine="DialogReqTypeEntity.DropdownBackgroundColor = Con";
Debug.ShouldStop(2);
__ref.getField(false,"_dialogreqtypeentity" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2051;BA.debugLine="DialogReqTypeEntity.Add( \"(Todos)\" )";
Debug.ShouldStop(4);
__ref.getField(false,"_dialogreqtypeentity" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 2052;BA.debugLine="For i = 0 To typEntity.Size-1";
Debug.ShouldStop(8);
if (true) break;

case 1:
//for
this.state = 4;
step8 = 1;
limit8 = RemoteObject.solve(new RemoteObject[] {_typentity.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 36;
 BA.debugLineNum = 2053;BA.debugLine="DialogReqTypeEntity.Add( typEntity.Get(i) )";
Debug.ShouldStop(16);
__ref.getField(false,"_dialogreqtypeentity" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_typentity.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2056;BA.debugLine="DialogReqStatus.DropdownBackgroundColor = Consts.";
Debug.ShouldStop(128);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2057;BA.debugLine="DialogReqStatus.Add( \"(Todos)\" )";
Debug.ShouldStop(256);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 2058;BA.debugLine="DialogReqStatus.Add( \"Activos\" )";
Debug.ShouldStop(512);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Activos")));
 BA.debugLineNum = 2059;BA.debugLine="DialogReqStatus.Add( \"Inactivos\" )";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Inactivos")));
 BA.debugLineNum = 2061;BA.debugLine="DialogReqRegion.DropdownBackgroundColor = Consts.";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2062;BA.debugLine="DialogReqRegion.Add( \"(Todos)\" )";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 2063;BA.debugLine="For i = 0 To Regions.Size-1";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//for
this.state = 8;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {_regions.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 7:
//C
this.state = 38;
 BA.debugLineNum = 2064;BA.debugLine="DialogReqRegion.Add( Regions.Get(i) )";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_regions.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2066;BA.debugLine="DialogReqLocal.DropdownBackgroundColor = Consts.C";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2067;BA.debugLine="DialogReqLocal.Add( \"(Todos)\" )";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 2068;BA.debugLine="For i = 0 To Locals.Size-1";
Debug.ShouldStop(524288);
if (true) break;

case 9:
//for
this.state = 12;
step22 = 1;
limit22 = RemoteObject.solve(new RemoteObject[] {_locals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 11:
//C
this.state = 40;
 BA.debugLineNum = 2069;BA.debugLine="DialogReqLocal.Add( Locals.Get(i) )";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_locals.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2071;BA.debugLine="If (curr.Name <> \"\") Then";
Debug.ShouldStop(4194304);

case 12:
//if
this.state = 15;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"Name" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2072;BA.debugLine="DialogReqName.Text = curr.Name";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialogreqname" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"Name" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 2074;BA.debugLine="If (curr.Address <> \"\") Then";
Debug.ShouldStop(33554432);

case 15:
//if
this.state = 18;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"Address" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2075;BA.debugLine="DialogReqAddress.Text = curr.Address";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dialogreqaddress" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"Address" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 2078;BA.debugLine="If (curr.Request = 1) Then";
Debug.ShouldStop(536870912);

case 18:
//if
this.state = 21;
if ((RemoteObject.solveBoolean("=",_curr.getField(true,"request" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2079;BA.debugLine="DialogReqWithRequests.Checked = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialogreqwithrequests" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 2082;BA.debugLine="DialogReqTypeEntity.SelectedIndex = curr.TypeEnti";
Debug.ShouldStop(2);
__ref.getField(false,"_dialogreqtypeentity" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"TypeEntity" /*RemoteObject*/ ));
 BA.debugLineNum = 2083;BA.debugLine="DialogReqStatus.SelectedIndex = curr.Status";
Debug.ShouldStop(4);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Status" /*RemoteObject*/ ));
 BA.debugLineNum = 2084;BA.debugLine="DialogReqRegion.SelectedIndex = curr.Region";
Debug.ShouldStop(8);
__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Region" /*RemoteObject*/ ));
 BA.debugLineNum = 2085;BA.debugLine="DialogReqLocal.SelectedIndex = curr.Local";
Debug.ShouldStop(16);
__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Local" /*RemoteObject*/ ));
 BA.debugLineNum = 2087;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getentityfilterdialog"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 22;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2088;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 22:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 24;
}else 
{ BA.debugLineNum = 2096;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 32;
}}
if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2089;BA.debugLine="Dim WReq As Int = 0";
Debug.ShouldStop(256);
_wreq = BA.numberCast(int.class, 0);Debug.locals.put("WReq", _wreq);Debug.locals.put("WReq", _wreq);
 BA.debugLineNum = 2090;BA.debugLine="If (DialogReqWithRequests.Checked) Then WReq = 1";
Debug.ShouldStop(512);
if (true) break;

case 25:
//if
this.state = 30;
if ((__ref.getField(false,"_dialogreqwithrequests" /*RemoteObject*/ ).runMethod(true,"getChecked")).<Boolean>get().booleanValue()) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_wreq = BA.numberCast(int.class, 1);Debug.locals.put("WReq", _wreq);
if (true) break;

case 30:
//C
this.state = 33;
;
 BA.debugLineNum = 2091;BA.debugLine="Dim SetTheFilters As EntityFilter = _ 			Types.M";
Debug.ShouldStop(1024);
_setthefilters = parent._types.runMethod(false,"_makeentityfilter" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogreqtypeentity" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqname" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqaddress" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_wreq));Debug.locals.put("SetTheFilters", _setthefilters);Debug.locals.put("SetTheFilters", _setthefilters);
 BA.debugLineNum = 2095;BA.debugLine="CallSub2(activ, \"SetTheFilters\", SetTheFilters)";
Debug.ShouldStop(16384);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetTheFilters")),(Object)((_setthefilters)));
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 2097;BA.debugLine="CallSub2(activ, \"CancelAllFilters\", True)";
Debug.ShouldStop(65536);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("CancelAllFilters")),(Object)((parent.__c.getField(true,"True"))));
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 2099;BA.debugLine="End Sub";
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
public static void  _getgeoreferencedialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("GetGeoReferenceDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1976);
if (RapidSub.canDelegate("getgeoreferencedialog")) { __ref.runUserSub(false, "appdialogs","getgeoreferencedialog", __ref, _activ, _curr, _asnew); return;}
ResumableSub_GetGeoReferenceDialog rsub = new ResumableSub_GetGeoReferenceDialog(null,__ref,_activ,_curr,_asnew);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetGeoReferenceDialog extends BA.ResumableSub {
public ResumableSub_GetGeoReferenceDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _asnew) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._asnew = _asnew;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _asnew;
RemoteObject _texto = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _setthegeorefer = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._georeference");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetGeoReferenceDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1976);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 1977;BA.debugLine="Dim Texto As String = ShareCode.AppDialogsEdicao";
Debug.ShouldStop(16777216);
_texto = parent._sharecode._appdialogsedicao /*RemoteObject*/ ;Debug.locals.put("Texto", _texto);Debug.locals.put("Texto", _texto);
 BA.debugLineNum = 1978;BA.debugLine="If (asNew) Then Texto = ShareCode.AppDialogsnovo";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if ((_asnew).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_texto = parent._sharecode._appdialogsnovo /*RemoteObject*/ ;Debug.locals.put("Texto", _texto);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1979;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Texto, \"C";
Debug.ShouldStop(67108864);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_texto),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1981;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(268435456);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1982;BA.debugLine="ApplDialog.SetSize(755dip, 250dip)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 755)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 1983;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getgeoreferencedialog"), _sf);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 1984;BA.debugLine="pnl.LoadLayout(\"dialog_entityGeoReference_device_";
Debug.ShouldStop(-2147483648);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_entityGeoReference_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1986;BA.debugLine="If Not(asNew) Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 17;
if (parent.__c.runMethod(true,"Not",(Object)(_asnew)).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1987;BA.debugLine="If (curr.Latitude <> \"\") Then";
Debug.ShouldStop(4);
if (true) break;

case 10:
//if
this.state = 13;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"Latitude" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1988;BA.debugLine="DialogAddressLatitude.Text = curr.Latitude";
Debug.ShouldStop(8);
__ref.getField(false,"_dialogaddresslatitude" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"Latitude" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1990;BA.debugLine="If (curr.Longitude <> \"\") Then";
Debug.ShouldStop(32);

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"Longitude" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1991;BA.debugLine="DialogAddressLongitude.Text = curr.Longitude";
Debug.ShouldStop(64);
__ref.getField(false,"_dialogaddresslongitude" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"Longitude" /*RemoteObject*/ )));
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
 BA.debugLineNum = 1995;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getgeoreferencedialog"), _sf);
this.state = 23;
return;
case 23:
//C
this.state = 18;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1996;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1997;BA.debugLine="Dim SetTheGeoRefer As GeoReference = _ 			Types.";
Debug.ShouldStop(4096);
_setthegeorefer = parent._types.runMethod(false,"_makegeoreference" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogaddresslatitude" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogaddresslongitude" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_asnew));Debug.locals.put("SetTheGeoRefer", _setthegeorefer);Debug.locals.put("SetTheGeoRefer", _setthegeorefer);
 BA.debugLineNum = 1999;BA.debugLine="CallSub2(activ, \"SetTheGeoReference\", SetTheGeoR";
Debug.ShouldStop(16384);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetTheGeoReference")),(Object)((_setthegeorefer)));
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 2001;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static void  _getkpifilterdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr) throws Exception{
try {
		Debug.PushSubsStack("GetKPIFilterDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2175);
if (RapidSub.canDelegate("getkpifilterdialog")) { __ref.runUserSub(false, "appdialogs","getkpifilterdialog", __ref, _activ, _curr); return;}
ResumableSub_GetKPIFilterDialog rsub = new ResumableSub_GetKPIFilterDialog(null,__ref,_activ,_curr);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetKPIFilterDialog extends BA.ResumableSub {
public ResumableSub_GetKPIFilterDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _setthefilters = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._kpifilter");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetKPIFilterDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2175);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
 BA.debugLineNum = 2178;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
Debug.ShouldStop(2);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Filtros")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Remover filtro")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2180;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(8);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2181;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2182;BA.debugLine="ApplDialog.SetSize(90%x, 80%y)";
Debug.ShouldStop(32);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2184;BA.debugLine="ApplDialog.SetSize(590dip, 490dip)";
Debug.ShouldStop(128);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 590)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 490)))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2187;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getkpifilterdialog"), _sf);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2188;BA.debugLine="pnl.LoadLayout(\"dialog_filterKPI_device_2\")";
Debug.ShouldStop(2048);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_filterKPI_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2190;BA.debugLine="DialogReqPeriodType.DropdownBackgroundColor = Con";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialogreqperiodtype" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2191;BA.debugLine="DialogReqPeriodType.Add( \"Últimos 30 dias\" )";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialogreqperiodtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Últimos 30 dias")));
 BA.debugLineNum = 2192;BA.debugLine="DialogReqPeriodType.Add( \"Último Trimestre\" )";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialogreqperiodtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Último Trimestre")));
 BA.debugLineNum = 2193;BA.debugLine="DialogReqPeriodType.Add( \"Último Semestre\" )";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialogreqperiodtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Último Semestre")));
 BA.debugLineNum = 2194;BA.debugLine="DialogReqPeriodType.Add( \"Último Ano\" )";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialogreqperiodtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Último Ano")));
 BA.debugLineNum = 2195;BA.debugLine="DialogReqPeriodType.Add( \"Entre datas\" )";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialogreqperiodtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Entre datas")));
 BA.debugLineNum = 2197;BA.debugLine="If (curr.SDate <> \"\") Then";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//if
this.state = 10;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"SDate" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2198;BA.debugLine="DialogReqStartDate.Text = curr.SDate";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"SDate" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 2200;BA.debugLine="If (curr.EDate <> \"\") Then";
Debug.ShouldStop(8388608);

case 10:
//if
this.state = 13;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"EDate" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2201;BA.debugLine="DialogReqEndDate.Text = curr.EDate";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"EDate" /*RemoteObject*/ )));
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 2203;BA.debugLine="DialogReqPeriodType.SelectedIndex = curr.period";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dialogreqperiodtype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"period" /*RemoteObject*/ ));
 BA.debugLineNum = 2205;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getkpifilterdialog"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 14;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2206;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(536870912);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 16;
}else 
{ BA.debugLineNum = 2209;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 18;
}}
if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 2207;BA.debugLine="Dim SetTheFilters As KPIFilter = Types.MakeKPIFi";
Debug.ShouldStop(1073741824);
_setthefilters = parent._types.runMethod(false,"_makekpifilter" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogreqperiodtype" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("SetTheFilters", _setthefilters);Debug.locals.put("SetTheFilters", _setthefilters);
 if (true) break;

case 18:
//C
this.state = 19;
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 2212;BA.debugLine="End Sub";
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
public static void  _getlogindialog(RemoteObject __ref,RemoteObject _activ) throws Exception{
try {
		Debug.PushSubsStack("getLoginDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3078);
if (RapidSub.canDelegate("getlogindialog")) { __ref.runUserSub(false, "appdialogs","getlogindialog", __ref, _activ); return;}
ResumableSub_getLoginDialog rsub = new ResumableSub_getLoginDialog(null,__ref,_activ);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getLoginDialog extends BA.ResumableSub {
public ResumableSub_getLoginDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _xw = RemoteObject.createImmutable(0);
RemoteObject _xh = RemoteObject.createImmutable(0);
RemoteObject _but1 = RemoteObject.createImmutable("");
RemoteObject _but2 = RemoteObject.createImmutable("");
RemoteObject _but3 = RemoteObject.createImmutable("");
RemoteObject _dlayout = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getLoginDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3078);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
 BA.debugLineNum = 3079;BA.debugLine="Dim xW As Int = 70%x, xH As Int = 450dip";
Debug.ShouldStop(64);
_xw = parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"));Debug.locals.put("xW", _xw);Debug.locals.put("xW", _xw);
_xh = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 450)));Debug.locals.put("xH", _xh);Debug.locals.put("xH", _xh);
 BA.debugLineNum = 3080;BA.debugLine="Dim but1 As String = \"Confirmar\", but2 As String";
Debug.ShouldStop(128);
_but1 = BA.ObjectToString("Confirmar");Debug.locals.put("but1", _but1);Debug.locals.put("but1", _but1);
_but2 = BA.ObjectToString("Cancelar");Debug.locals.put("but2", _but2);Debug.locals.put("but2", _but2);
_but3 = BA.ObjectToString("Esqueci password");Debug.locals.put("but3", _but3);Debug.locals.put("but3", _but3);
 BA.debugLineNum = 3081;BA.debugLine="Dim dLayout As String = \"dialog_Login\"";
Debug.ShouldStop(256);
_dlayout = BA.ObjectToString("dialog_Login");Debug.locals.put("dLayout", _dlayout);Debug.locals.put("dLayout", _dlayout);
 BA.debugLineNum = 3082;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3083;BA.debugLine="xW = 95%x";
Debug.ShouldStop(1024);
_xw = parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"));Debug.locals.put("xW", _xw);
 BA.debugLineNum = 3084;BA.debugLine="xH = 400dip";
Debug.ShouldStop(2048);
_xh = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)));Debug.locals.put("xH", _xh);
 BA.debugLineNum = 3085;BA.debugLine="but3 = \"Reset\"";
Debug.ShouldStop(4096);
_but3 = BA.ObjectToString("Reset");Debug.locals.put("but3", _but3);
 BA.debugLineNum = 3086;BA.debugLine="dLayout = \"dialog_Login_device_2\"";
Debug.ShouldStop(8192);
_dlayout = BA.ObjectToString("dialog_Login_device_2");Debug.locals.put("dLayout", _dlayout);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3089;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Controlo";
Debug.ShouldStop(65536);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Controlo de acesso")),(Object)(_but1),(Object)(_but2),(Object)(_but3),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3091;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(262144);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3092;BA.debugLine="ApplDialog.SetSize(xW, xH)";
Debug.ShouldStop(524288);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(_xw),(Object)(_xh));
 BA.debugLineNum = 3095;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getlogindialog"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3096;BA.debugLine="pnl.LoadLayout(dLayout)";
Debug.ShouldStop(8388608);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(_dlayout),__ref.getField(false, "ba"));
 BA.debugLineNum = 3098;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getlogindialog"), _sf);
this.state = 14;
return;
case 14:
//C
this.state = 5;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3100;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 7;
}else 
{ BA.debugLineNum = 3102;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 9;
}else {
this.state = 11;
}}
if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 3101;BA.debugLine="CallSub3(activ, \"SetLogin\", mainEditLoginUser.Te";
Debug.ShouldStop(268435456);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetLogin")),(Object)((__ref.getField(false,"_maineditloginuser" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)((__ref.getField(false,"_maineditloginpassword" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 3104;BA.debugLine="CallSub2(activ, \"SetLoginReset\", mainEditLoginUs";
Debug.ShouldStop(-2147483648);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetLoginReset")),(Object)((__ref.getField(false,"_maineditloginuser" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3106;BA.debugLine="CallSub(activ, \"prc_AppClose\")";
Debug.ShouldStop(2);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activ),(Object)(RemoteObject.createImmutable("prc_AppClose")));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 3109;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _getlogindialog2(RemoteObject __ref,RemoteObject _activ) throws Exception{
try {
		Debug.PushSubsStack("getLoginDialog2 (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3044);
if (RapidSub.canDelegate("getlogindialog2")) { __ref.runUserSub(false, "appdialogs","getlogindialog2", __ref, _activ); return;}
ResumableSub_getLoginDialog2 rsub = new ResumableSub_getLoginDialog2(null,__ref,_activ);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getLoginDialog2 extends BA.ResumableSub {
public ResumableSub_getLoginDialog2(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _xw = RemoteObject.createImmutable(0);
RemoteObject _xh = RemoteObject.createImmutable(0);
RemoteObject _but1 = RemoteObject.createImmutable("");
RemoteObject _but2 = RemoteObject.createImmutable("");
RemoteObject _but3 = RemoteObject.createImmutable("");
RemoteObject _dlayout = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getLoginDialog2 (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3044);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
 BA.debugLineNum = 3045;BA.debugLine="Dim xW As Int = 50%x, xH As Int = 350dip";
Debug.ShouldStop(16);
_xw = parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"));Debug.locals.put("xW", _xw);Debug.locals.put("xW", _xw);
_xh = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350)));Debug.locals.put("xH", _xh);Debug.locals.put("xH", _xh);
 BA.debugLineNum = 3046;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3047;BA.debugLine="xW = 80%x";
Debug.ShouldStop(64);
_xw = parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"));Debug.locals.put("xW", _xw);
 BA.debugLineNum = 3048;BA.debugLine="xH = 80%x";
Debug.ShouldStop(128);
_xh = parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"));Debug.locals.put("xH", _xh);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3051;BA.debugLine="Dim but1 As String = \"Confirmar\", but2 As String";
Debug.ShouldStop(1024);
_but1 = BA.ObjectToString("Confirmar");Debug.locals.put("but1", _but1);Debug.locals.put("but1", _but1);
_but2 = BA.ObjectToString("Cancelar");Debug.locals.put("but2", _but2);Debug.locals.put("but2", _but2);
_but3 = BA.ObjectToString("");Debug.locals.put("but3", _but3);Debug.locals.put("but3", _but3);
 BA.debugLineNum = 3052;BA.debugLine="Dim dLayout As String = \"dialog_login_userregiste";
Debug.ShouldStop(2048);
_dlayout = BA.ObjectToString("dialog_login_userregister");Debug.locals.put("dLayout", _dlayout);Debug.locals.put("dLayout", _dlayout);
 BA.debugLineNum = 3060;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Registo";
Debug.ShouldStop(524288);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Registo de novo utilizador")),(Object)(_but1),(Object)(_but2),(Object)(_but3),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3062;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(2097152);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3063;BA.debugLine="ApplDialog.SetSize(xW, xH)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(_xw),(Object)(_xh));
 BA.debugLineNum = 3065;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getlogindialog2"), _sf);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3066;BA.debugLine="pnl.LoadLayout(dLayout)";
Debug.ShouldStop(33554432);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(_dlayout),__ref.getField(false, "ba"));
 BA.debugLineNum = 3068;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getlogindialog2"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3070;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(536870912);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 3071;BA.debugLine="CallSub3(activ, \"SetLoginRegister\", mainEditLogi";
Debug.ShouldStop(1073741824);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetLoginRegister")),(Object)((__ref.getField(false,"_maineditloginuser" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)((__ref.getField(false,"_maineditloginpassword" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3073;BA.debugLine="CallSub(activ, \"SetLoginRegisterCancel\")";
Debug.ShouldStop(1);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activ),(Object)(RemoteObject.createImmutable("SetLoginRegisterCancel")));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 3076;BA.debugLine="End Sub";
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
public static void  _getobjectfilterdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _typobject,RemoteObject _regions,RemoteObject _locals) throws Exception{
try {
		Debug.PushSubsStack("GetObjectFilterDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2102);
if (RapidSub.canDelegate("getobjectfilterdialog")) { __ref.runUserSub(false, "appdialogs","getobjectfilterdialog", __ref, _activ, _curr, _typobject, _regions, _locals); return;}
ResumableSub_GetObjectFilterDialog rsub = new ResumableSub_GetObjectFilterDialog(null,__ref,_activ,_curr,_typobject,_regions,_locals);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetObjectFilterDialog extends BA.ResumableSub {
public ResumableSub_GetObjectFilterDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _typobject,RemoteObject _regions,RemoteObject _locals) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._typobject = _typobject;
this._regions = _regions;
this._locals = _locals;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _typobject;
RemoteObject _regions;
RemoteObject _locals;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _bt = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objecttypes");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _wreq = RemoteObject.createImmutable(0);
RemoteObject _setthefilters = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objectfilter");
int step11;
int limit11;
int step16;
int limit16;
int step25;
int limit25;
int step30;
int limit30;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetObjectFilterDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2102);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
Debug.locals.put("typObject", _typobject);
Debug.locals.put("Regions", _regions);
Debug.locals.put("Locals", _locals);
 BA.debugLineNum = 2103;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
Debug.ShouldStop(4194304);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Filtros")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Remover filtro")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2105;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(16777216);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2106;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2107;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2109;BA.debugLine="ApplDialog.SetSize(95%x, 90%y)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2112;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getobjectfilterdialog"), _sf);
this.state = 44;
return;
case 44:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2114;BA.debugLine="pnl.LoadLayout(\"dialog_filterObject\") '_device_2\"";
Debug.ShouldStop(2);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_filterObject")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2116;BA.debugLine="DialogReqTypeObject.DropdownBackgroundColor = Con";
Debug.ShouldStop(8);
__ref.getField(false,"_dialogreqtypeobject" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2117;BA.debugLine="For i = 0 To typObject.Size-1";
Debug.ShouldStop(16);
if (true) break;

case 7:
//for
this.state = 10;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {_typobject.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 46;
 BA.debugLineNum = 2118;BA.debugLine="Dim bt As ObjectTypes = typObject.Get(i)   'Type";
Debug.ShouldStop(32);
_bt = (_typobject.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("bt", _bt);Debug.locals.put("bt", _bt);
 BA.debugLineNum = 2119;BA.debugLine="DialogReqTypeObject.Add( bt.title )";
Debug.ShouldStop(64);
__ref.getField(false,"_dialogreqtypeobject" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_bt.getField(true,"title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2122;BA.debugLine="DialogReqZone.DropdownBackgroundColor = Consts.Co";
Debug.ShouldStop(512);
__ref.getField(false,"_dialogreqzone" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2123;BA.debugLine="For i = 0 To Types.ZONEOBJECTSFILTER.Size-1";
Debug.ShouldStop(1024);
if (true) break;

case 11:
//for
this.state = 14;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {parent._types._zoneobjectsfilter /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 48;
 BA.debugLineNum = 2124;BA.debugLine="DialogReqZone.Add( Types.ZONEOBJECTSFILTER.Get(i";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialogreqzone" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(parent._types._zoneobjectsfilter /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2127;BA.debugLine="DialogReqStatus.DropdownBackgroundColor = Consts.";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2128;BA.debugLine="DialogReqStatus.Add( \"(Todos)\" )";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 2129;BA.debugLine="DialogReqStatus.Add( \"Activos\" )";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Activos")));
 BA.debugLineNum = 2130;BA.debugLine="DialogReqStatus.Add( \"Inactivos\" )";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Inactivos")));
 BA.debugLineNum = 2132;BA.debugLine="DialogReqRegion.DropdownBackgroundColor = Consts.";
Debug.ShouldStop(524288);
__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2133;BA.debugLine="DialogReqRegion.Add( \"(Todos)\" )";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 2134;BA.debugLine="For i = 0 To Regions.Size-1";
Debug.ShouldStop(2097152);
if (true) break;

case 15:
//for
this.state = 18;
step25 = 1;
limit25 = RemoteObject.solve(new RemoteObject[] {_regions.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 50;
 BA.debugLineNum = 2135;BA.debugLine="DialogReqRegion.Add( Regions.Get(i) )";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_regions.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2137;BA.debugLine="DialogReqLocal.DropdownBackgroundColor = Consts.C";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2138;BA.debugLine="DialogReqLocal.Add( \"(Todos)\" )";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 2139;BA.debugLine="For i = 0 To Locals.Size-1";
Debug.ShouldStop(67108864);
if (true) break;

case 19:
//for
this.state = 22;
step30 = 1;
limit30 = RemoteObject.solve(new RemoteObject[] {_locals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 21:
//C
this.state = 52;
 BA.debugLineNum = 2140;BA.debugLine="DialogReqLocal.Add( Locals.Get(i) )";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_locals.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2142;BA.debugLine="If (curr.Name <> \"\") Then";
Debug.ShouldStop(536870912);

case 22:
//if
this.state = 25;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"Name" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2143;BA.debugLine="DialogReqName.Text = curr.Name";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialogreqname" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"Name" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 2145;BA.debugLine="If (curr.Address <> \"\") Then";
Debug.ShouldStop(1);

case 25:
//if
this.state = 28;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"Address" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2146;BA.debugLine="DialogReqAddress.Text = curr.Address";
Debug.ShouldStop(2);
__ref.getField(false,"_dialogreqaddress" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"Address" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 2149;BA.debugLine="If (curr.Request = 1) Then";
Debug.ShouldStop(16);

case 28:
//if
this.state = 31;
if ((RemoteObject.solveBoolean("=",_curr.getField(true,"Request" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2150;BA.debugLine="DialogReqWithRequests.Checked = True";
Debug.ShouldStop(32);
__ref.getField(false,"_dialogreqwithrequests" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 2153;BA.debugLine="DialogReqTypeObject.SelectedIndex = curr.TypeObje";
Debug.ShouldStop(256);
__ref.getField(false,"_dialogreqtypeobject" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"TypeObject" /*RemoteObject*/ ));
 BA.debugLineNum = 2154;BA.debugLine="DialogReqZone.SelectedIndex = curr.ZoneObject";
Debug.ShouldStop(512);
__ref.getField(false,"_dialogreqzone" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"ZoneObject" /*RemoteObject*/ ));
 BA.debugLineNum = 2155;BA.debugLine="DialogReqStatus.SelectedIndex = curr.Status";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Status" /*RemoteObject*/ ));
 BA.debugLineNum = 2156;BA.debugLine="DialogReqRegion.SelectedIndex = curr.Region";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Region" /*RemoteObject*/ ));
 BA.debugLineNum = 2157;BA.debugLine="DialogReqLocal.SelectedIndex = curr.Local";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Local" /*RemoteObject*/ ));
 BA.debugLineNum = 2159;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getobjectfilterdialog"), _sf);
this.state = 53;
return;
case 53:
//C
this.state = 32;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2160;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (true) break;

case 32:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 34;
}else 
{ BA.debugLineNum = 2169;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 42;
}}
if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 2161;BA.debugLine="Dim WReq As Int = 0";
Debug.ShouldStop(65536);
_wreq = BA.numberCast(int.class, 0);Debug.locals.put("WReq", _wreq);Debug.locals.put("WReq", _wreq);
 BA.debugLineNum = 2162;BA.debugLine="If (DialogReqWithRequests.Checked) Then WReq = 1";
Debug.ShouldStop(131072);
if (true) break;

case 35:
//if
this.state = 40;
if ((__ref.getField(false,"_dialogreqwithrequests" /*RemoteObject*/ ).runMethod(true,"getChecked")).<Boolean>get().booleanValue()) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
_wreq = BA.numberCast(int.class, 1);Debug.locals.put("WReq", _wreq);
if (true) break;

case 40:
//C
this.state = 43;
;
 BA.debugLineNum = 2163;BA.debugLine="Dim bt As ObjectTypes = typObject.Get(DialogReqT";
Debug.ShouldStop(262144);
_bt = (_typobject.runMethod(false,"Get",(Object)(__ref.getField(false,"_dialogreqtypeobject" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));Debug.locals.put("bt", _bt);Debug.locals.put("bt", _bt);
 BA.debugLineNum = 2164;BA.debugLine="Dim SetTheFilters As ObjectFilter = _ 			Types.M";
Debug.ShouldStop(524288);
_setthefilters = parent._types.runMethod(false,"_makeobjectfilter" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_bt.getField(true,"id" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dialogreqzone" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqregion" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqlocal" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqname" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqaddress" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_wreq));Debug.locals.put("SetTheFilters", _setthefilters);Debug.locals.put("SetTheFilters", _setthefilters);
 BA.debugLineNum = 2168;BA.debugLine="CallSub2(activ, \"SetTheFilters\", SetTheFilters)";
Debug.ShouldStop(8388608);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetTheFilters")),(Object)((_setthefilters)));
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2170;BA.debugLine="CallSub2(activ, \"CancelAllFilters\", True)";
Debug.ShouldStop(33554432);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("CancelAllFilters")),(Object)((parent.__c.getField(true,"True"))));
 if (true) break;

case 43:
//C
this.state = -1;
;
 BA.debugLineNum = 2172;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static void  _getobjectselectdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _local) throws Exception{
try {
		Debug.PushSubsStack("getObjectSelectDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1127);
if (RapidSub.canDelegate("getobjectselectdialog")) { __ref.runUserSub(false, "appdialogs","getobjectselectdialog", __ref, _activ, _activname, _title, _local); return;}
ResumableSub_getObjectSelectDialog rsub = new ResumableSub_getObjectSelectDialog(null,__ref,_activ,_activname,_title,_local);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getObjectSelectDialog extends BA.ResumableSub {
public ResumableSub_getObjectSelectDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _local) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._local = _local;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _local;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _lastgroup = RemoteObject.createImmutable("");
int _row = 0;
RemoteObject _object_type = RemoteObject.createImmutable("");
RemoteObject _objecttype_desc = RemoteObject.createImmutable("");
RemoteObject _title_import = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int step18;
int limit18;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getObjectSelectDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1127);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("local", _local);
 BA.debugLineNum = 1128;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(128);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 1129;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(256);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 1130;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
Debug.ShouldStop(512);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1131;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(1024);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1132;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1133;BA.debugLine="ApplDialog.SetSize(70%x, 90%y)";
Debug.ShouldStop(4096);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1135;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1138;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(131072);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 1140;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getobjectselectdialog"), null);
this.state = 23;
return;
case 23:
//C
this.state = 7;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 1141;BA.debugLine="DialogPanel.LoadLayout(\"task_item_detail_list\") '";
Debug.ShouldStop(1048576);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("task_item_detail_list")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1143;BA.debugLine="Dim items As Cursor";
Debug.ShouldStop(4194304);
_items = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("items", _items);
 BA.debugLineNum = 1144;BA.debugLine="Dim sSQL As String = $\"select a.id, a.tagcode, a.";
Debug.ShouldStop(8388608);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, a.tagcode, a.object_type, a.title_import, a.`status`, ifnull(b.title, '') as objecttype_desc\n"),RemoteObject.createImmutable("				from dta_objects as a inner join dta_objecttypes as b on (b.tagcode=a.object_type)\n"),RemoteObject.createImmutable("				where a.active=1 and b.active=1 and a.`status`<=1 and a.tagcode<>'__NONE__' and a.title_import<>'Insira um descritivo/título'\n"),RemoteObject.createImmutable("				group by b.title, a.id, a.tagcode, a.object_type, a.title_import, a.`status`\n"),RemoteObject.createImmutable("				order by b.title, a.title_import")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1151;BA.debugLine="items = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(1073741824);
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1152;BA.debugLine="If items.RowCount > 0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_items.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1153;BA.debugLine="Dim LastGroup As String = \"\"";
Debug.ShouldStop(1);
_lastgroup = BA.ObjectToString("");Debug.locals.put("LastGroup", _lastgroup);Debug.locals.put("LastGroup", _lastgroup);
 BA.debugLineNum = 1154;BA.debugLine="For Row = 0 To items.RowCount-1";
Debug.ShouldStop(2);
if (true) break;

case 10:
//for
this.state = 17;
step18 = 1;
limit18 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
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
Debug.locals.put("Row", _row);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1155;BA.debugLine="items.Position = Row";
Debug.ShouldStop(4);
_items.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 1156;BA.debugLine="Dim object_type As String = items.GetString(\"ob";
Debug.ShouldStop(8);
_object_type = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("object_type")));Debug.locals.put("object_type", _object_type);Debug.locals.put("object_type", _object_type);
 BA.debugLineNum = 1157;BA.debugLine="Dim objecttype_desc As String = items.GetString";
Debug.ShouldStop(16);
_objecttype_desc = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("objecttype_desc")));Debug.locals.put("objecttype_desc", _objecttype_desc);Debug.locals.put("objecttype_desc", _objecttype_desc);
 BA.debugLineNum = 1158;BA.debugLine="Dim title_import As String = items.GetString(\"t";
Debug.ShouldStop(32);
_title_import = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title_import")));Debug.locals.put("title_import", _title_import);Debug.locals.put("title_import", _title_import);
 BA.debugLineNum = 1159;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcod";
Debug.ShouldStop(64);
_tagcode = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1160;BA.debugLine="If (object_type.Trim <> LastGroup.Trim) Then";
Debug.ShouldStop(128);
if (true) break;

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("!",_object_type.runMethod(true,"trim"),_lastgroup.runMethod(true,"trim")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1161;BA.debugLine="LastGroup = object_type";
Debug.ShouldStop(256);
_lastgroup = _object_type;Debug.locals.put("LastGroup", _lastgroup);
 BA.debugLineNum = 1162;BA.debugLine="ListItemsList.Add( createObjGroupLineItemDetai";
Debug.ShouldStop(512);
__ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createobjgrouplineitemdetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(_objecttype_desc),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))).getObject()),(Object)((_object_type)));
 if (true) break;

case 16:
//C
this.state = 25;
;
 BA.debugLineNum = 1164;BA.debugLine="ListItemsList.Add(createObjectLineItemDetail(ac";
Debug.ShouldStop(2048);
__ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createobjectlineitemdetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(_tagcode),(Object)(_title_import),(Object)(_objecttype_desc),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
Debug.locals.put("Row", _row);
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1167;BA.debugLine="items.Close";
Debug.ShouldStop(16384);
_items.runVoidMethod ("Close");
 BA.debugLineNum = 1168;BA.debugLine="HiddenListItemLabel = \"\"";
Debug.ShouldStop(32768);
__ref.setField ("_hiddenlistitemlabel" /*RemoteObject*/ ,RemoteObject.createImmutable(("")));
 BA.debugLineNum = 1169;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
Debug.ShouldStop(65536);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1171;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getobjectselectdialog"), _sf);
this.state = 26;
return;
case 26:
//C
this.state = 19;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1172;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1173;BA.debugLine="CallSub3(ThisActivityName, \"ObjectSelected\", Hid";
Debug.ShouldStop(1048576);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_thisactivityname" /*RemoteObject*/ )),(Object)(BA.ObjectToString("ObjectSelected")),(Object)(__ref.getField(false,"_hiddenlistitemlabel" /*RemoteObject*/ )),(Object)((_local)));
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 1175;BA.debugLine="End Sub";
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
public static void  _getobjectselectviewdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("getObjectSelectViewDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1243);
if (RapidSub.canDelegate("getobjectselectviewdialog")) { __ref.runUserSub(false, "appdialogs","getobjectselectviewdialog", __ref, _activ, _activname, _title, _pnl); return;}
ResumableSub_getObjectSelectViewDialog rsub = new ResumableSub_getObjectSelectViewDialog(null,__ref,_activ,_activname,_title,_pnl);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getObjectSelectViewDialog extends BA.ResumableSub {
public ResumableSub_getObjectSelectViewDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _pnl) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._pnl = _pnl;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _pnl;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _objectstypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _itc = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._db_itc");
RemoteObject _res = RemoteObject.createImmutable(0);
int step16;
int limit16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getObjectSelectViewDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1243);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 1244;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(134217728);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 1245;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(268435456);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 1246;BA.debugLine="CurrentSelectedCode = \"\"";
Debug.ShouldStop(536870912);
__ref.setField ("_currentselectedcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1247;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
Debug.ShouldStop(1073741824);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1248;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(-2147483648);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1249;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1250;BA.debugLine="ApplDialog.SetSize(85%x, 90%y)";
Debug.ShouldStop(2);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 85)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1252;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
Debug.ShouldStop(8);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1254;BA.debugLine="ObjectsListIndex = 0";
Debug.ShouldStop(32);
__ref.setField ("_objectslistindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1255;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(64);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 1256;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getobjectselectviewdialog"), null);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 1257;BA.debugLine="DialogPanel.LoadLayout(\"ObjectSelectViewDialog\")";
Debug.ShouldStop(256);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ObjectSelectViewDialog")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1259;BA.debugLine="Dim ObjectsTypes As List = DBStructures.getObject";
Debug.ShouldStop(1024);
_objectstypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objectstypes = parent._dbstructures.runMethod(false,"_getobjecttypes" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("ObjectsTypes", _objectstypes);Debug.locals.put("ObjectsTypes", _objectstypes);
 BA.debugLineNum = 1260;BA.debugLine="For n=0 To ObjectsTypes.Size-1";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//for
this.state = 10;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_objectstypes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
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
Debug.locals.put("n", _n);
if (true) break;

case 9:
//C
this.state = 17;
 BA.debugLineNum = 1261;BA.debugLine="Dim itc As DB_ITC = ObjectsTypes.Get(n)";
Debug.ShouldStop(4096);
_itc = (_objectstypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 1262;BA.debugLine="ObjectTypeListView.Add(createObjectTypeLineItemD";
Debug.ShouldStop(8192);
__ref.getField(false,"_objecttypelistview" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createobjecttypelineitemdetail" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_thisactivity" /*RemoteObject*/ )),(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )),(Object)(_itc.getField(true,"TagCode" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))).getObject()),(Object)((_itc.getField(true,"ID" /*RemoteObject*/ ))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 1265;BA.debugLine="OBJ_Types = DBStructures.getObjectTypes";
Debug.ShouldStop(65536);
__ref.setField ("_obj_types" /*RemoteObject*/ ,parent._dbstructures.runMethod(false,"_getobjecttypes" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 1266;BA.debugLine="OBJ_Groups = DBStructures.getObjectGroups";
Debug.ShouldStop(131072);
__ref.setField ("_obj_groups" /*RemoteObject*/ ,parent._dbstructures.runMethod(false,"_getobjectgroups" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 1267;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
Debug.ShouldStop(262144);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_currentselectedcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1269;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getobjectselectviewdialog"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1270;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1271;BA.debugLine="CallSub3(ThisActivityName, \"AlertObjectSelected\"";
Debug.ShouldStop(4194304);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_thisactivityname" /*RemoteObject*/ )),(Object)(BA.ObjectToString("AlertObjectSelected")),(Object)((__ref.getField(true,"_currentselectedcode" /*RemoteObject*/ ))),(Object)((_pnl)));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1273;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _getobjectslist(RemoteObject __ref,RemoteObject _objecttypeindex,RemoteObject _objectgroupindex,RemoteObject _objectdesctext,RemoteObject _newrequest) throws Exception{
try {
		Debug.PushSubsStack("GetObjectsList (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1425);
if (RapidSub.canDelegate("getobjectslist")) { return __ref.runUserSub(false, "appdialogs","getobjectslist", __ref, _objecttypeindex, _objectgroupindex, _objectdesctext, _newrequest);}
ResumableSub_GetObjectsList rsub = new ResumableSub_GetObjectsList(null,__ref,_objecttypeindex,_objectgroupindex,_objectdesctext,_newrequest);
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
public static class ResumableSub_GetObjectsList extends BA.ResumableSub {
public ResumableSub_GetObjectsList(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _objecttypeindex,RemoteObject _objectgroupindex,RemoteObject _objectdesctext,RemoteObject _newrequest) {
this.parent = parent;
this.__ref = __ref;
this._objecttypeindex = _objecttypeindex;
this._objectgroupindex = _objectgroupindex;
this._objectdesctext = _objectdesctext;
this._newrequest = _newrequest;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _objecttypeindex;
RemoteObject _objectgroupindex;
RemoteObject _objectdesctext;
RemoteObject _newrequest;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _stype = RemoteObject.createImmutable("");
RemoteObject _itc = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._db_itc");
RemoteObject _sgroup = RemoteObject.createImmutable("");
RemoteObject _sdesc = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _lastgroup = RemoteObject.createImmutable("");
RemoteObject _recordrowcount = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _object_type = RemoteObject.createImmutable("");
RemoteObject _objecttype_desc = RemoteObject.createImmutable("");
RemoteObject _title_import = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetObjectsList (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1425);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ObjectTypeIndex", _objecttypeindex);
Debug.locals.put("ObjectGroupIndex", _objectgroupindex);
Debug.locals.put("ObjectDescText", _objectdesctext);
Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 1426;BA.debugLine="Dim result As Boolean = False";
Debug.ShouldStop(131072);
_result = parent.__c.getField(true,"False");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 1427;BA.debugLine="If(newRequest) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 4;
if ((_newrequest).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1428;BA.debugLine="CLAObjectList.Clear";
Debug.ShouldStop(524288);
__ref.getField(false,"_claobjectlist" /*RemoteObject*/ ).runVoidMethod ("_clear");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1431;BA.debugLine="Dim sType As String = \"\"";
Debug.ShouldStop(4194304);
_stype = BA.ObjectToString("");Debug.locals.put("sType", _stype);Debug.locals.put("sType", _stype);
 BA.debugLineNum = 1432;BA.debugLine="If ObjectTypeIndex > 0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_objecttypeindex,BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1433;BA.debugLine="Dim itc As DB_ITC = OBJ_Types.Get(ObjectTypeInde";
Debug.ShouldStop(16777216);
_itc = (__ref.getField(false,"_obj_types" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_objecttypeindex)));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 1434;BA.debugLine="sType = $\" and (b.id=${itc.ID}) \"$";
Debug.ShouldStop(33554432);
_stype = (RemoteObject.concat(RemoteObject.createImmutable(" and (b.id="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itc.getField(true,"ID" /*RemoteObject*/ )))),RemoteObject.createImmutable(") ")));Debug.locals.put("sType", _stype);
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1437;BA.debugLine="Dim sGroup As String = \"\"";
Debug.ShouldStop(268435456);
_sgroup = BA.ObjectToString("");Debug.locals.put("sGroup", _sgroup);Debug.locals.put("sGroup", _sgroup);
 BA.debugLineNum = 1438;BA.debugLine="If ObjectGroupIndex > 0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_objectgroupindex,BA.numberCast(double.class, 0))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1439;BA.debugLine="Dim itc As DB_ITC = OBJ_Groups.Get(ObjectGroupIn";
Debug.ShouldStop(1073741824);
_itc = (__ref.getField(false,"_obj_groups" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_objectgroupindex)));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1442;BA.debugLine="Dim sDesc As String = \"\"";
Debug.ShouldStop(2);
_sdesc = BA.ObjectToString("");Debug.locals.put("sDesc", _sdesc);Debug.locals.put("sDesc", _sdesc);
 BA.debugLineNum = 1443;BA.debugLine="If Utils.NNE(ObjectDescText) Then";
Debug.ShouldStop(4);
if (true) break;

case 13:
//if
this.state = 16;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_objectdesctext)).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1444;BA.debugLine="sDesc = $\" and (a.title_import||a.tagcode||a.ref";
Debug.ShouldStop(8);
_sdesc = (RemoteObject.concat(RemoteObject.createImmutable(" and (a.title_import||a.tagcode||a.reference||b.title like '%"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objectdesctext.runMethod(true,"trim")))),RemoteObject.createImmutable("%') ")));Debug.locals.put("sDesc", _sdesc);
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1447;BA.debugLine="Dim sSQL As String = $\"select a.id, a.tagcode, a.";
Debug.ShouldStop(64);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select a.id, a.tagcode, a.object_type, a.title_import, a.`status`, ifnull(b.title, '') as objecttype_desc,\n"),RemoteObject.createImmutable("		a.reference\n"),RemoteObject.createImmutable("		from dta_objects as a inner join dta_objecttypes as b on (b.tagcode=a.object_type)\n"),RemoteObject.createImmutable("		where a.active=1 and b.active=1 and a.`status`<=1 and a.tagcode<>'__NONE__' and a.title_import<>'Insira um descritivo/título'\n"),RemoteObject.createImmutable("		"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stype))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sgroup))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdesc))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		group by b.title, a.id, a.tagcode, a.object_type, a.title_import, a.`status`\n"),RemoteObject.createImmutable("			order by b.title, a.title_import limit "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_objectslistindex" /*RemoteObject*/ )))),RemoteObject.createImmutable(", 10")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1454;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","674645533",_ssql,0);
 BA.debugLineNum = 1456;BA.debugLine="Dim LastGroup As String = \"\"";
Debug.ShouldStop(32768);
_lastgroup = BA.ObjectToString("");Debug.locals.put("LastGroup", _lastgroup);Debug.locals.put("LastGroup", _lastgroup);
 BA.debugLineNum = 1457;BA.debugLine="Dim RecordRowCount As Int = 0";
Debug.ShouldStop(65536);
_recordrowcount = BA.numberCast(int.class, 0);Debug.locals.put("RecordRowCount", _recordrowcount);Debug.locals.put("RecordRowCount", _recordrowcount);
 BA.debugLineNum = 1458;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(131072);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1460;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(524288);
if (true) break;

case 17:
//do while
this.state = 28;
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1461;BA.debugLine="Dim object_type As String = Record.GetString(\"o";
Debug.ShouldStop(1048576);
_object_type = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("object_type")));Debug.locals.put("object_type", _object_type);Debug.locals.put("object_type", _object_type);
 BA.debugLineNum = 1462;BA.debugLine="Dim objecttype_desc As String = Record.GetStrin";
Debug.ShouldStop(2097152);
_objecttype_desc = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("objecttype_desc")));Debug.locals.put("objecttype_desc", _objecttype_desc);Debug.locals.put("objecttype_desc", _objecttype_desc);
 BA.debugLineNum = 1463;BA.debugLine="Dim title_import As String = Record.GetString(\"";
Debug.ShouldStop(4194304);
_title_import = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title_import")));Debug.locals.put("title_import", _title_import);Debug.locals.put("title_import", _title_import);
 BA.debugLineNum = 1464;BA.debugLine="Dim tagcode As String = Record.GetString(\"tagco";
Debug.ShouldStop(8388608);
_tagcode = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1465;BA.debugLine="If(newRequest) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 20:
//if
this.state = 27;
if ((_newrequest).<Boolean>get().booleanValue()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1466;BA.debugLine="If (object_type.Trim <> LastGroup.Trim) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 23:
//if
this.state = 26;
if ((RemoteObject.solveBoolean("!",_object_type.runMethod(true,"trim"),_lastgroup.runMethod(true,"trim")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1467;BA.debugLine="LastGroup = object_type";
Debug.ShouldStop(67108864);
_lastgroup = _object_type;Debug.locals.put("LastGroup", _lastgroup);
 BA.debugLineNum = 1468;BA.debugLine="CLAObjectList.Add( createObjGroupLineItemDeta";
Debug.ShouldStop(134217728);
__ref.getField(false,"_claobjectlist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createobjgrouplineitemdetailview" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_thisactivity" /*RemoteObject*/ )),(Object)(_objecttype_desc),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))).getObject()),(Object)((_object_type)));
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
 BA.debugLineNum = 1472;BA.debugLine="CLAObjectList.Add(createObjectLineItemDetailVie";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_claobjectlist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createobjectlineitemdetailview" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_thisactivity" /*RemoteObject*/ )),(Object)(_tagcode),(Object)(_title_import),(Object)(_objecttype_desc),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1473;BA.debugLine="RecordRowCount = RecordRowCount +1";
Debug.ShouldStop(1);
_recordrowcount = RemoteObject.solve(new RemoteObject[] {_recordrowcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("RecordRowCount", _recordrowcount);
 BA.debugLineNum = 1474;BA.debugLine="result = True";
Debug.ShouldStop(2);
_result = parent.__c.getField(true,"True");Debug.locals.put("result", _result);
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 1476;BA.debugLine="Record.Close";
Debug.ShouldStop(8);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1479;BA.debugLine="Return result";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 1480;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static RemoteObject  _getpicturesmapdialog(RemoteObject __ref,RemoteObject _activname) throws Exception{
try {
		Debug.PushSubsStack("getPicturesMapDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1044);
if (RapidSub.canDelegate("getpicturesmapdialog")) { return __ref.runUserSub(false, "appdialogs","getpicturesmapdialog", __ref, _activname);}
Debug.locals.put("activName", _activname);
 BA.debugLineNum = 1044;BA.debugLine="Sub getPicturesMapDialog(activName As Object)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1087;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getpropertydialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _proptitle,RemoteObject _propvalue,RemoteObject _tagcode,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("GetPropertyDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1905);
if (RapidSub.canDelegate("getpropertydialog")) { __ref.runUserSub(false, "appdialogs","getpropertydialog", __ref, _activ, _proptitle, _propvalue, _tagcode, _asnew); return;}
ResumableSub_GetPropertyDialog rsub = new ResumableSub_GetPropertyDialog(null,__ref,_activ,_proptitle,_propvalue,_tagcode,_asnew);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetPropertyDialog extends BA.ResumableSub {
public ResumableSub_GetPropertyDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _proptitle,RemoteObject _propvalue,RemoteObject _tagcode,RemoteObject _asnew) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._proptitle = _proptitle;
this._propvalue = _propvalue;
this._tagcode = _tagcode;
this._asnew = _asnew;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _proptitle;
RemoteObject _propvalue;
RemoteObject _tagcode;
RemoteObject _asnew;
RemoteObject _texto = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetPropertyDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1905);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("propTitle", _proptitle);
Debug.locals.put("propValue", _propvalue);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 1906;BA.debugLine="Dim Texto As String = ShareCode.AppDialogsEdicao";
Debug.ShouldStop(131072);
_texto = parent._sharecode._appdialogsedicao /*RemoteObject*/ ;Debug.locals.put("Texto", _texto);Debug.locals.put("Texto", _texto);
 BA.debugLineNum = 1907;BA.debugLine="If (asNew) Then Texto = ShareCode.AppDialogsnovo";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if ((_asnew).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_texto = parent._sharecode._appdialogsnovo /*RemoteObject*/ ;Debug.locals.put("Texto", _texto);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1908;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Texto, \"C";
Debug.ShouldStop(524288);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_texto),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1910;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(2097152);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1912;BA.debugLine="ApplDialog.SetSize(85%x, 220dip)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 85)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 220)))));
 BA.debugLineNum = 1913;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getpropertydialog"), _sf);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 1914;BA.debugLine="pnl.LoadLayout(\"dialog_propertyChange_device_2\")";
Debug.ShouldStop(33554432);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_propertyChange_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1916;BA.debugLine="DialogPropertyTitle.Text = propTitle";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dialogpropertytitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_proptitle));
 BA.debugLineNum = 1917;BA.debugLine="DialogPropertyValue.Text = propValue";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialogpropertyvalue" /*RemoteObject*/ ).runMethod(true,"setText",(_propvalue));
 BA.debugLineNum = 1919;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getpropertydialog"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1920;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1921;BA.debugLine="If (asNew) Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 15;
if ((_asnew).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 1922;BA.debugLine="CallSub3(activ, \"SetThePropertyInsert\", tagcode";
Debug.ShouldStop(2);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetThePropertyInsert")),(Object)((_tagcode)),(Object)((__ref.getField(false,"_dialogpropertyvalue" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1924;BA.debugLine="CallSub3(activ, \"SetThePropertyUpdate\", tagcode";
Debug.ShouldStop(8);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetThePropertyUpdate")),(Object)((_tagcode)),(Object)((__ref.getField(false,"_dialogpropertyvalue" /*RemoteObject*/ ).runMethod(true,"getText"))));
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
 BA.debugLineNum = 1927;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _getpushrequestcode(RemoteObject __ref,RemoteObject _activname,RemoteObject _objname,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("getPushRequestCode (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,339);
if (RapidSub.canDelegate("getpushrequestcode")) { __ref.runUserSub(false, "appdialogs","getpushrequestcode", __ref, _activname, _objname, _title); return;}
ResumableSub_getPushRequestCode rsub = new ResumableSub_getPushRequestCode(null,__ref,_activname,_objname,_title);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getPushRequestCode extends BA.ResumableSub {
public ResumableSub_getPushRequestCode(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activname,RemoteObject _objname,RemoteObject _title) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._objname = _objname;
this._title = _title;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activname;
RemoteObject _objname;
RemoteObject _title;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _ss = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getPushRequestCode (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,339);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activName", _activname);
Debug.locals.put("objName", _objname);
Debug.locals.put("title", _title);
 BA.debugLineNum = 340;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(524288);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 341;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
Debug.ShouldStop(1048576);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 342;BA.debugLine="CurrentCLD = ApplDialog";
Debug.ShouldStop(2097152);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 343;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(4194304);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 344;BA.debugLine="ApplDialog.SetSize(60%x, 200dip)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 346;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getpushrequestcode"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 347;BA.debugLine="DialogPanel.LoadLayout(\"dialog_getvalue\")";
Debug.ShouldStop(67108864);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_getvalue")),__ref.getField(false, "ba"));
 BA.debugLineNum = 349;BA.debugLine="Wait For (sf) Dialog_Result(Res As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getpushrequestcode"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 350;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 351;BA.debugLine="If Utils.NNE(PushRequestEdit.Text) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 9;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_pushrequestedit" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 352;BA.debugLine="Dim ss As String = PushRequestEdit.Text";
Debug.ShouldStop(-2147483648);
_ss = __ref.getField(false,"_pushrequestedit" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("ss", _ss);Debug.locals.put("ss", _ss);
 BA.debugLineNum = 354;BA.debugLine="CallSub3(MainMenu, \"ReturnFromPushRequest\", 1,";
Debug.ShouldStop(2);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(BA.ObjectToString("ReturnFromPushRequest")),(Object)(RemoteObject.createImmutable((1))),(Object)((_ss)));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 357;BA.debugLine="CallSub3(MainMenu, \"ReturnFromPushRequest\", 0,";
Debug.ShouldStop(16);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(BA.ObjectToString("ReturnFromPushRequest")),(Object)(RemoteObject.createImmutable((0))),(Object)((RemoteObject.createImmutable(""))));
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
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _getrequestfilterdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _chks,RemoteObject _ents,RemoteObject _sts,RemoteObject _tpreq) throws Exception{
try {
		Debug.PushSubsStack("GetRequestFilterDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3111);
if (RapidSub.canDelegate("getrequestfilterdialog")) { __ref.runUserSub(false, "appdialogs","getrequestfilterdialog", __ref, _activ, _curr, _chks, _ents, _sts, _tpreq); return;}
ResumableSub_GetRequestFilterDialog rsub = new ResumableSub_GetRequestFilterDialog(null,__ref,_activ,_curr,_chks,_ents,_sts,_tpreq);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRequestFilterDialog extends BA.ResumableSub {
public ResumableSub_GetRequestFilterDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _chks,RemoteObject _ents,RemoteObject _sts,RemoteObject _tpreq) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._chks = _chks;
this._ents = _ents;
this._sts = _sts;
this._tpreq = _tpreq;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _chks;
RemoteObject _ents;
RemoteObject _sts;
RemoteObject _tpreq;
RemoteObject _xw = RemoteObject.createImmutable(0);
RemoteObject _xh = RemoteObject.createImmutable(0);
RemoteObject _but1 = RemoteObject.createImmutable("");
RemoteObject _but2 = RemoteObject.createImmutable("");
RemoteObject _but3 = RemoteObject.createImmutable("");
RemoteObject _dlayout = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _routes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _r = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._codenamelist");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _setthefilters = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestfilter");
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
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRequestFilterDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
Debug.locals.put("chks", _chks);
Debug.locals.put("ents", _ents);
Debug.locals.put("sts", _sts);
Debug.locals.put("tpreq", _tpreq);
 BA.debugLineNum = 3113;BA.debugLine="Dim xW As Int = 95%x, xH As Int = 500dip";
Debug.ShouldStop(256);
_xw = parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"));Debug.locals.put("xW", _xw);Debug.locals.put("xW", _xw);
_xh = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)));Debug.locals.put("xH", _xh);Debug.locals.put("xH", _xh);
 BA.debugLineNum = 3114;BA.debugLine="Dim but1 As String = \"Confirmar\", but2 As String";
Debug.ShouldStop(512);
_but1 = BA.ObjectToString("Confirmar");Debug.locals.put("but1", _but1);Debug.locals.put("but1", _but1);
_but2 = BA.ObjectToString("Cancelar");Debug.locals.put("but2", _but2);Debug.locals.put("but2", _but2);
_but3 = BA.ObjectToString("Remover filtro");Debug.locals.put("but3", _but3);Debug.locals.put("but3", _but3);
 BA.debugLineNum = 3115;BA.debugLine="Dim dLayout As String = \"dialog_filterRequest\"";
Debug.ShouldStop(1024);
_dlayout = BA.ObjectToString("dialog_filterRequest");Debug.locals.put("dLayout", _dlayout);Debug.locals.put("dLayout", _dlayout);
 BA.debugLineNum = 3116;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3117;BA.debugLine="xW = 95%x";
Debug.ShouldStop(4096);
_xw = parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"));Debug.locals.put("xW", _xw);
 BA.debugLineNum = 3118;BA.debugLine="xH = 95%y";
Debug.ShouldStop(8192);
_xh = parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"));Debug.locals.put("xH", _xh);
 BA.debugLineNum = 3119;BA.debugLine="but1 = \"Confirmar\"";
Debug.ShouldStop(16384);
_but1 = BA.ObjectToString("Confirmar");Debug.locals.put("but1", _but1);
 BA.debugLineNum = 3120;BA.debugLine="but2 = \"Cancelar\"";
Debug.ShouldStop(32768);
_but2 = BA.ObjectToString("Cancelar");Debug.locals.put("but2", _but2);
 BA.debugLineNum = 3121;BA.debugLine="but3 = \"Remover\"";
Debug.ShouldStop(65536);
_but3 = BA.ObjectToString("Remover");Debug.locals.put("but3", _but3);
 BA.debugLineNum = 3122;BA.debugLine="dLayout = \"dialog_filterRequest_device_2\"";
Debug.ShouldStop(131072);
_dlayout = BA.ObjectToString("dialog_filterRequest_device_2");Debug.locals.put("dLayout", _dlayout);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3125;BA.debugLine="Dim sSQL As String = $\"select distinct id, tagcod";
Debug.ShouldStop(1048576);
_ssql = (RemoteObject.createImmutable("select distinct id, tagcode, title from dta_routes"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3126;BA.debugLine="Private Routes As List";
Debug.ShouldStop(2097152);
_routes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Routes", _routes);
 BA.debugLineNum = 3127;BA.debugLine="Routes.Initialize";
Debug.ShouldStop(4194304);
_routes.runVoidMethod ("Initialize");
 BA.debugLineNum = 3128;BA.debugLine="Routes = DBStructures.GetListOfFromScriptCNLEVC(\"";
Debug.ShouldStop(8388608);
_routes = parent._dbstructures.runMethod(false,"_getlistoffromscriptcnlevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tagcode")),(Object)(BA.ObjectToString("title")),(Object)(_ssql));Debug.locals.put("Routes", _routes);
 BA.debugLineNum = 3131;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
Debug.ShouldStop(67108864);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Filtros")),(Object)(_but1),(Object)(_but2),(Object)(_but3),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3133;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(268435456);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3134;BA.debugLine="ApplDialog.SetSize(xW, xH)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(_xw),(Object)(_xh));
 BA.debugLineNum = 3136;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getrequestfilterdialog"), _sf);
this.state = 66;
return;
case 66:
//C
this.state = 5;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3137;BA.debugLine="pnl.LoadLayout(dLayout)";
Debug.ShouldStop(1);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(_dlayout),__ref.getField(false, "ba"));
 BA.debugLineNum = 3140;BA.debugLine="FilterLabelTipoIntervencao.Text=ShareCode.AppDial";
Debug.ShouldStop(8);
__ref.getField(false,"_filterlabeltipointervencao" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabeltipointervencao /*RemoteObject*/ ));
 BA.debugLineNum = 3141;BA.debugLine="FilterLabelEntidade.Text=ShareCode.AppDialogsFilt";
Debug.ShouldStop(16);
__ref.getField(false,"_filterlabelentidade" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabelentidade /*RemoteObject*/ ));
 BA.debugLineNum = 3142;BA.debugLine="FilterLabelEstadosIntervencao.Text=ShareCode.AppD";
Debug.ShouldStop(32);
__ref.getField(false,"_filterlabelestadosintervencao" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabelestadosintervencao /*RemoteObject*/ ));
 BA.debugLineNum = 3143;BA.debugLine="FilterLabelDataInicio.Text=ShareCode.AppDialogsFi";
Debug.ShouldStop(64);
__ref.getField(false,"_filterlabeldatainicio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabeldatainicio /*RemoteObject*/ ));
 BA.debugLineNum = 3144;BA.debugLine="FilterLabelDataFim.Text=ShareCode.AppDialogsFilte";
Debug.ShouldStop(128);
__ref.getField(false,"_filterlabeldatafim" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabeldatafim /*RemoteObject*/ ));
 BA.debugLineNum = 3145;BA.debugLine="FilterLabelTipoChecklist.Text=ShareCode.AppDialog";
Debug.ShouldStop(256);
__ref.getField(false,"_filterlabeltipochecklist" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabeltipochecklist /*RemoteObject*/ ));
 BA.debugLineNum = 3146;BA.debugLine="FilterLabelRota.Text=ShareCode.AppDialogsFilterLa";
Debug.ShouldStop(512);
__ref.getField(false,"_filterlabelrota" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._sharecode._appdialogsfilterlabelrota /*RemoteObject*/ ));
 BA.debugLineNum = 3148;BA.debugLine="DialogReqChecklist.DropdownBackgroundColor = Cons";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialogreqchecklist" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 3149;BA.debugLine="DialogReqChecklist.Add( \"(Todos)\" )";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialogreqchecklist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 3150;BA.debugLine="For i = 0 To chks.Size-1";
Debug.ShouldStop(8192);
if (true) break;

case 5:
//for
this.state = 8;
step30 = 1;
limit30 = RemoteObject.solve(new RemoteObject[] {_chks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 7:
//C
this.state = 68;
 BA.debugLineNum = 3151;BA.debugLine="Dim r As CodeNameList = chks.Get(i)";
Debug.ShouldStop(16384);
_r = (_chks.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 3152;BA.debugLine="DialogReqChecklist.Add( r.Name )";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialogreqchecklist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_r.getField(true,"Name" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3155;BA.debugLine="DialogReqEntity.DropdownBackgroundColor = Consts.";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialogreqentity" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 3156;BA.debugLine="DialogReqEntity.Add( \"(Todos)\" )";
Debug.ShouldStop(524288);
__ref.getField(false,"_dialogreqentity" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 3157;BA.debugLine="For i = 0 To ents.Size-1";
Debug.ShouldStop(1048576);
if (true) break;

case 9:
//for
this.state = 12;
step36 = 1;
limit36 = RemoteObject.solve(new RemoteObject[] {_ents.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 11:
//C
this.state = 70;
 BA.debugLineNum = 3158;BA.debugLine="Dim r As CodeNameList = ents.Get(i)";
Debug.ShouldStop(2097152);
_r = (_ents.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 3159;BA.debugLine="DialogReqEntity.Add( r.Name )";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialogreqentity" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_r.getField(true,"Name" /*RemoteObject*/ )));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3162;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_ROUTES)";
Debug.ShouldStop(33554432);

case 12:
//if
this.state = 19;
if ((parent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._sharecode._device_param_routes /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 3163;BA.debugLine="DialogReqRoute.DropdownBackgroundColor = Consts.";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dialogreqroute" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 3164;BA.debugLine="DialogReqRoute.Add( \"(Todos)\" )";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dialogreqroute" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 3165;BA.debugLine="For i = 0 To Routes.Size-1";
Debug.ShouldStop(268435456);
if (true) break;

case 15:
//for
this.state = 18;
step43 = 1;
limit43 = RemoteObject.solve(new RemoteObject[] {_routes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 72;
 BA.debugLineNum = 3166;BA.debugLine="Dim r As CodeNameList = Routes.Get(i)";
Debug.ShouldStop(536870912);
_r = (_routes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 3167;BA.debugLine="DialogReqRoute.Add( r.Name )";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialogreqroute" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_r.getField(true,"Name" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("i", _i);
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 3173;BA.debugLine="DialogReqStatus.DropdownBackgroundColor = Consts.";
Debug.ShouldStop(16);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 3174;BA.debugLine="DialogReqStatus.Add( \"(Todos)\" )";
Debug.ShouldStop(32);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 3175;BA.debugLine="For i = 0 To sts.Size-1";
Debug.ShouldStop(64);
if (true) break;

case 20:
//for
this.state = 23;
step50 = 1;
limit50 = RemoteObject.solve(new RemoteObject[] {_sts.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 22:
//C
this.state = 74;
 BA.debugLineNum = 3176;BA.debugLine="DialogReqStatus.Add( sts.Get(i) )";
Debug.ShouldStop(128);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_sts.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3179;BA.debugLine="DialogReqTypeRequest.DropdownBackgroundColor = Co";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialogreqtyperequest" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 3180;BA.debugLine="DialogReqTypeRequest.Add( \"(Todos)\" )";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialogreqtyperequest" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 3181;BA.debugLine="For i = 0 To tpreq.Size-1";
Debug.ShouldStop(4096);
if (true) break;

case 24:
//for
this.state = 27;
step55 = 1;
limit55 = RemoteObject.solve(new RemoteObject[] {_tpreq.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 26:
//C
this.state = 76;
 BA.debugLineNum = 3182;BA.debugLine="Dim r As CodeNameList = tpreq.Get(i)";
Debug.ShouldStop(8192);
_r = (_tpreq.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 3183;BA.debugLine="DialogReqTypeRequest.Add( r.Name )";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialogreqtyperequest" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_r.getField(true,"Name" /*RemoteObject*/ )));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3186;BA.debugLine="If (curr.SDate <> \"\") Then";
Debug.ShouldStop(131072);

case 27:
//if
this.state = 32;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"SDate" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 3187;BA.debugLine="DialogReqStartDate.Text = curr.SDate ' .SetDate(";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"SDate" /*RemoteObject*/ )));
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 3189;BA.debugLine="DialogReqStartDate.Text = ShareCode.APPDATE_STAR";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"setText",(parent._sharecode._appdate_startrange /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 3192;BA.debugLine="If (curr.EDate <> \"\") Then";
Debug.ShouldStop(8388608);

case 32:
//if
this.state = 37;
if ((RemoteObject.solveBoolean("!",_curr.getField(true,"EDate" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
 BA.debugLineNum = 3193;BA.debugLine="DialogReqEndDate.Text = curr.EDate ' .SetDate(Da";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"setText",(_curr.getField(true,"EDate" /*RemoteObject*/ )));
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 3195;BA.debugLine="DialogReqEndDate.Text = ShareCode.APPDATE_ENDRAN";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"setText",(parent._sharecode._appdate_endrange /*RemoteObject*/ ));
 if (true) break;

case 37:
//C
this.state = 38;
;
 BA.debugLineNum = 3198;BA.debugLine="DialogReqChecklist.SelectedIndex = 0";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dialogreqchecklist" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3199;BA.debugLine="If (curr.Task > 0) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 38:
//if
this.state = 41;
if ((RemoteObject.solveBoolean(">",_curr.getField(true,"Task" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 3200;BA.debugLine="DialogReqChecklist.SelectedIndex = curr.Task";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialogreqchecklist" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Task" /*RemoteObject*/ ));
 if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 3203;BA.debugLine="DialogReqEntity.SelectedIndex = 0";
Debug.ShouldStop(4);
__ref.getField(false,"_dialogreqentity" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3204;BA.debugLine="If (curr.Entity > 0) Then";
Debug.ShouldStop(8);
if (true) break;

case 42:
//if
this.state = 45;
if ((RemoteObject.solveBoolean(">",_curr.getField(true,"Entity" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 3205;BA.debugLine="DialogReqEntity.SelectedIndex = curr.Entity";
Debug.ShouldStop(16);
__ref.getField(false,"_dialogreqentity" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Entity" /*RemoteObject*/ ));
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 3208;BA.debugLine="DialogReqTypeRequest.SelectedIndex = 0";
Debug.ShouldStop(128);
__ref.getField(false,"_dialogreqtyperequest" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3209;BA.debugLine="If (curr.TPRequest > 0) Then";
Debug.ShouldStop(256);
if (true) break;

case 46:
//if
this.state = 49;
if ((RemoteObject.solveBoolean(">",_curr.getField(true,"TPRequest" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 3210;BA.debugLine="DialogReqTypeRequest.SelectedIndex = curr.TPRequ";
Debug.ShouldStop(512);
__ref.getField(false,"_dialogreqtyperequest" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"TPRequest" /*RemoteObject*/ ));
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 3213;BA.debugLine="DialogReqStatus.SelectedIndex = 0";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3214;BA.debugLine="If (curr.State > 0) Then";
Debug.ShouldStop(8192);
if (true) break;

case 50:
//if
this.state = 53;
if ((RemoteObject.solveBoolean(">",_curr.getField(true,"State" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 3215;BA.debugLine="DialogReqStatus.SelectedIndex = curr.State";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"State" /*RemoteObject*/ ));
 if (true) break;

case 53:
//C
this.state = 54;
;
 BA.debugLineNum = 3218;BA.debugLine="SetUpdateTBColor(TB001, ShareCode.STS001)";
Debug.ShouldStop(131072);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tb001" /*RemoteObject*/ )),(Object)(parent._sharecode._sts001 /*RemoteObject*/ ));
 BA.debugLineNum = 3219;BA.debugLine="SetUpdateTBColor(TB002, ShareCode.STS002)";
Debug.ShouldStop(262144);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tb002" /*RemoteObject*/ )),(Object)(parent._sharecode._sts002 /*RemoteObject*/ ));
 BA.debugLineNum = 3220;BA.debugLine="SetUpdateTBColor(TB003, ShareCode.STS003)";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tb003" /*RemoteObject*/ )),(Object)(parent._sharecode._sts003 /*RemoteObject*/ ));
 BA.debugLineNum = 3221;BA.debugLine="SetUpdateTBColor(TB004, ShareCode.STS004)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tb004" /*RemoteObject*/ )),(Object)(parent._sharecode._sts004 /*RemoteObject*/ ));
 BA.debugLineNum = 3222;BA.debugLine="SetUpdateTBColor(TB005, ShareCode.STS005)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tb005" /*RemoteObject*/ )),(Object)(parent._sharecode._sts005 /*RemoteObject*/ ));
 BA.debugLineNum = 3225;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getrequestfilterdialog"), _sf);
this.state = 77;
return;
case 77:
//C
this.state = 54;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3230;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(536870912);
if (true) break;

case 54:
//if
this.state = 65;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 56;
}else 
{ BA.debugLineNum = 3248;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 64;
}}
if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 3231;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 3232;BA.debugLine="ShareCode.STS001 = TB001.Checked";
Debug.ShouldStop(-2147483648);
parent._sharecode._sts001 /*RemoteObject*/  = __ref.getField(false,"_tb001" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 3233;BA.debugLine="ShareCode.STS002 = TB002.Checked";
Debug.ShouldStop(1);
parent._sharecode._sts002 /*RemoteObject*/  = __ref.getField(false,"_tb002" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 3234;BA.debugLine="ShareCode.STS003 = TB003.Checked";
Debug.ShouldStop(2);
parent._sharecode._sts003 /*RemoteObject*/  = __ref.getField(false,"_tb003" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 3235;BA.debugLine="ShareCode.STS004 = TB004.Checked";
Debug.ShouldStop(4);
parent._sharecode._sts004 /*RemoteObject*/  = __ref.getField(false,"_tb004" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 3236;BA.debugLine="ShareCode.STS005 = TB005.Checked";
Debug.ShouldStop(8);
parent._sharecode._sts005 /*RemoteObject*/  = __ref.getField(false,"_tb005" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 3238;BA.debugLine="Dim SetTheFilters As RequestFilter = _ 			Types";
Debug.ShouldStop(32);
_setthefilters = parent._types.runMethod(false,"_makerequestfilter" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqchecklist" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqentity" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqroute" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqtyperequest" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")));Debug.locals.put("SetTheFilters", _setthefilters);Debug.locals.put("SetTheFilters", _setthefilters);
 BA.debugLineNum = 3243;BA.debugLine="CallSub2(activ, \"SetTheFilters\", SetTheFilters)";
Debug.ShouldStop(1024);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetTheFilters")),(Object)((_setthefilters)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 61:
//C
this.state = 62;
this.catchState = 0;
 BA.debugLineNum = 3245;BA.debugLine="CallSub2(activ, \"CancelAllFilters\", True)";
Debug.ShouldStop(4096);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("CancelAllFilters")),(Object)((parent.__c.getField(true,"True"))));
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
 BA.debugLineNum = 3249;BA.debugLine="CallSub2(activ, \"CancelAllFilters\", True)";
Debug.ShouldStop(65536);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("CancelAllFilters")),(Object)((parent.__c.getField(true,"True"))));
 if (true) break;

case 65:
//C
this.state = -1;
;
 BA.debugLineNum = 3252;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _getrequestoptionsdialog(RemoteObject __ref,RemoteObject _activname,RemoteObject _title,RemoteObject _activelist,RemoteObject _reqdata) throws Exception{
try {
		Debug.PushSubsStack("GetRequestOptionsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("getrequestoptionsdialog")) { __ref.runUserSub(false, "appdialogs","getrequestoptionsdialog", __ref, _activname, _title, _activelist, _reqdata); return;}
ResumableSub_GetRequestOptionsDialog rsub = new ResumableSub_GetRequestOptionsDialog(null,__ref,_activname,_title,_activelist,_reqdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRequestOptionsDialog extends BA.ResumableSub {
public ResumableSub_GetRequestOptionsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activname,RemoteObject _title,RemoteObject _activelist,RemoteObject _reqdata) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._title = _title;
this._activelist = _activelist;
this._reqdata = _reqdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _activelist;
RemoteObject _reqdata;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _n = 0;
RemoteObject _v = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
int step30;
int limit30;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRequestOptionsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,471);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("activeList", _activelist);
Debug.locals.put("reqData", _reqdata);
 BA.debugLineNum = 472;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(8388608);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 473;BA.debugLine="ThisRequestData = reqData";
Debug.ShouldStop(16777216);
__ref.setField ("_thisrequestdata" /*RemoteObject*/ ,_reqdata);
 BA.debugLineNum = 474;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
Debug.ShouldStop(33554432);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 475;BA.debugLine="CurrentCLD = ApplDialog";
Debug.ShouldStop(67108864);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 476;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(134217728);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 477;BA.debugLine="ApplDialog.SetSize(60%x, 490dip)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 490)))));
 BA.debugLineNum = 479;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getrequestoptionsdialog"), null);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 480;BA.debugLine="DialogPanel.LoadLayout(\"dialog_requestoptions\")";
Debug.ShouldStop(-2147483648);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_requestoptions")),__ref.getField(false, "ba"));
 BA.debugLineNum = 482;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 483;BA.debugLine="ROBut_01.Width = (DialogPanel.Width / 2) - 20";
Debug.ShouldStop(4);
__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_dialogpanel.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),RemoteObject.createImmutable(20)}, "-",1, 0)));
 BA.debugLineNum = 484;BA.debugLine="ROBut_02.Width = ROBut_01.Width";
Debug.ShouldStop(8);
__ref.getField(false,"_robut_02" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 485;BA.debugLine="ROBut_03.Width = ROBut_01.Width";
Debug.ShouldStop(16);
__ref.getField(false,"_robut_03" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 486;BA.debugLine="ROBut_04.Width = ROBut_01.Width";
Debug.ShouldStop(32);
__ref.getField(false,"_robut_04" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 487;BA.debugLine="ROBut_05.Width = ROBut_01.Width";
Debug.ShouldStop(64);
__ref.getField(false,"_robut_05" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 488;BA.debugLine="ROBut_06.Width = ROBut_01.Width";
Debug.ShouldStop(128);
__ref.getField(false,"_robut_06" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 489;BA.debugLine="ROBut_07.Width = ROBut_01.Width";
Debug.ShouldStop(256);
__ref.getField(false,"_robut_07" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 490;BA.debugLine="ROBut_08.Width = ROBut_01.Width";
Debug.ShouldStop(512);
__ref.getField(false,"_robut_08" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 491;BA.debugLine="ROBut_09.Width = ROBut_01.Width";
Debug.ShouldStop(1024);
__ref.getField(false,"_robut_09" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 493;BA.debugLine="ROBut_04.Left = ROBut_01.Left + ROBut_01.Width +";
Debug.ShouldStop(4096);
__ref.getField(false,"_robut_04" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(10)}, "++",2, 1));
 BA.debugLineNum = 494;BA.debugLine="ROBut_03.Left = ROBut_04.Left";
Debug.ShouldStop(8192);
__ref.getField(false,"_robut_03" /*RemoteObject*/ ).runMethod(true,"setLeft",__ref.getField(false,"_robut_04" /*RemoteObject*/ ).runMethod(true,"getLeft"));
 BA.debugLineNum = 495;BA.debugLine="ROBut_05.left = ROBut_04.Left";
Debug.ShouldStop(16384);
__ref.getField(false,"_robut_05" /*RemoteObject*/ ).runMethod(true,"setLeft",__ref.getField(false,"_robut_04" /*RemoteObject*/ ).runMethod(true,"getLeft"));
 BA.debugLineNum = 496;BA.debugLine="ROBut_08.left = ROBut_04.Left";
Debug.ShouldStop(32768);
__ref.getField(false,"_robut_08" /*RemoteObject*/ ).runMethod(true,"setLeft",__ref.getField(false,"_robut_04" /*RemoteObject*/ ).runMethod(true,"getLeft"));
 BA.debugLineNum = 497;BA.debugLine="ROBut_09.left = ROBut_01.Left";
Debug.ShouldStop(65536);
__ref.getField(false,"_robut_09" /*RemoteObject*/ ).runMethod(true,"setLeft",__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"getLeft"));
 if (true) break;
;
 BA.debugLineNum = 501;BA.debugLine="If ((ShareCode.APP_DOMAIN.ToLowerCase = \"devdemo\"";
Debug.ShouldStop(1048576);

case 4:
//if
this.state = 9;
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("devdemo"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("demo"))))))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 502;BA.debugLine="ROBut_09.Visible = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_robut_09" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 504;BA.debugLine="ROBut_09.Visible = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_robut_09" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 507;BA.debugLine="For n=0 To activeList.Size-1";
Debug.ShouldStop(67108864);

case 9:
//for
this.state = 12;
step30 = 1;
limit30 = RemoteObject.solve(new RemoteObject[] {_activelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
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
Debug.locals.put("n", _n);
if (true) break;

case 11:
//C
this.state = 19;
 BA.debugLineNum = 508;BA.debugLine="Dim v As Int = activeList.Get(n)";
Debug.ShouldStop(134217728);
_v = BA.numberCast(int.class, _activelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 509;BA.debugLine="ROButtonstate(n+1, (v = 1))";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_robuttonstate" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_n),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_v,BA.numberCast(double.class, 1))))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 512;BA.debugLine="Wait For (sf) Dialog_Result(Res As Int)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getrequestoptionsdialog"), _sf);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 513;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
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
 BA.debugLineNum = 517;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _getrequestselectdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _local) throws Exception{
try {
		Debug.PushSubsStack("getRequestSelectDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("getrequestselectdialog")) { __ref.runUserSub(false, "appdialogs","getrequestselectdialog", __ref, _activ, _activname, _title, _local); return;}
ResumableSub_getRequestSelectDialog rsub = new ResumableSub_getRequestSelectDialog(null,__ref,_activ,_activname,_title,_local);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getRequestSelectDialog extends BA.ResumableSub {
public ResumableSub_getRequestSelectDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _local) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._local = _local;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _local;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _techuser = RemoteObject.createImmutable("");
RemoteObject _routefilter = RemoteObject.createImmutable("");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _row = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
int step29;
int limit29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getRequestSelectDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,363);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("local", _local);
 BA.debugLineNum = 364;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(2048);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 365;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(4096);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 366;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
Debug.ShouldStop(8192);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 367;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 368;BA.debugLine="ApplDialog.SetSize(70%x, 90%y)";
Debug.ShouldStop(32768);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 369;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(65536);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 371;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getrequestselectdialog"), null);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 372;BA.debugLine="DialogPanel.LoadLayout(\"request_item_list\") 'List";
Debug.ShouldStop(524288);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("request_item_list")),__ref.getField(false, "ba"));
 BA.debugLineNum = 373;BA.debugLine="LastIndexList = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_lastindexlist" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 375;BA.debugLine="ShareCode.SESS_UserTeam = DBStructures.SetUserTea";
Debug.ShouldStop(4194304);
parent._sharecode._sess_userteam /*RemoteObject*/  = parent._dbstructures.runMethod(true,"_setuserteamdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._sharecode._sess_user /*RemoteObject*/ ),(Object)(parent._sharecode._appdate_startrange /*RemoteObject*/ ),(Object)(parent._sharecode._appdate_endrange /*RemoteObject*/ ));
 BA.debugLineNum = 376;BA.debugLine="ShareCode.SESS_UserRoute = DBStructures.SetUserRo";
Debug.ShouldStop(8388608);
parent._sharecode._sess_userroute /*RemoteObject*/  = parent._dbstructures.runMethod(true,"_setuserroutedate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._sharecode._sess_user /*RemoteObject*/ ),(Object)(parent._sharecode._appdate_startrange /*RemoteObject*/ ),(Object)(parent._sharecode._appdate_endrange /*RemoteObject*/ ));
 BA.debugLineNum = 378;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETREQU";
Debug.ShouldStop(33554432);
_ssql = parent._dbstructures._evc_sql_getrequests_data_new /*RemoteObject*/ ;Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 379;BA.debugLine="Dim TechUser As String = \"\"";
Debug.ShouldStop(67108864);
_techuser = BA.ObjectToString("");Debug.locals.put("TechUser", _techuser);Debug.locals.put("TechUser", _techuser);
 BA.debugLineNum = 380;BA.debugLine="Dim RouteFilter As String = \"\"";
Debug.ShouldStop(134217728);
_routefilter = BA.ObjectToString("");Debug.locals.put("RouteFilter", _routefilter);Debug.locals.put("RouteFilter", _routefilter);
 BA.debugLineNum = 382;BA.debugLine="If (Utils.NNE(ShareCode.SESS_UserRoute)) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._sharecode._sess_userroute /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 383;BA.debugLine="RouteFilter = $\" and (a.route_tagcode not in (${";
Debug.ShouldStop(1073741824);
_routefilter = (RemoteObject.concat(RemoteObject.createImmutable(" and (a.route_tagcode not in ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._sess_userroute /*RemoteObject*/ ))),RemoteObject.createImmutable(")) ")));Debug.locals.put("RouteFilter", _routefilter);
 if (true) break;
;
 BA.debugLineNum = 385;BA.debugLine="If Utils.NNE(ShareCode.SESS_UserTeam) Then";
Debug.ShouldStop(1);

case 4:
//if
this.state = 9;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._sharecode._sess_userteam /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 386;BA.debugLine="TechUser = $\" and (((a.technical_tagcode<>'${Sha";
Debug.ShouldStop(2);
_techuser = (RemoteObject.concat(RemoteObject.createImmutable(" and (((a.technical_tagcode<>'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("') and (a.team_tagcode not in ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._sess_userteam /*RemoteObject*/ ))),RemoteObject.createImmutable("))) "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_routefilter))),RemoteObject.createImmutable(")")));Debug.locals.put("TechUser", _techuser);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 388;BA.debugLine="TechUser = $\" and ((a.technical_tagcode<>'${Shar";
Debug.ShouldStop(8);
_techuser = (RemoteObject.concat(RemoteObject.createImmutable(" and ((a.technical_tagcode<>'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("') "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_routefilter))),RemoteObject.createImmutable(") ")));Debug.locals.put("TechUser", _techuser);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 390;BA.debugLine="RouteFilter = Utils.IfNotNullOrEmpty(RouteFilter,";
Debug.ShouldStop(32);
_routefilter = parent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_routefilter),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("RouteFilter", _routefilter);
 BA.debugLineNum = 392;BA.debugLine="sSQL = $\"${sSQL} ${TechUser} ${RouteFilter} 				a";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_techuser))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_routefilter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and ((a.execdate_type>=1) or ((a.execdate_type=0) \n"),RemoteObject.createImmutable("				and (a.execute_date>='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appdate_startrange /*RemoteObject*/ ))),RemoteObject.createImmutable("') \n"),RemoteObject.createImmutable("				and (a.execute_date<='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appdate_endrange /*RemoteObject*/ ))),RemoteObject.createImmutable("'))) \n"),RemoteObject.createImmutable("				order by a.execute_date, a.execute_start")));Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 398;BA.debugLine="Log(\"««««««««««««««««««««««««««««««««««««« ------";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","671630883",RemoteObject.createImmutable("««««««««««««««««««««««««««««««««««««« ------------ »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»"),0);
 BA.debugLineNum = 399;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","671630884",_ssql,0);
 BA.debugLineNum = 401;BA.debugLine="Dim items As Cursor = Starter.LocalSQLEVC.ExecQue";
Debug.ShouldStop(65536);
_items = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("items", _items);
 BA.debugLineNum = 402;BA.debugLine="If items.RowCount > 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 10:
//if
this.state = 17;
if (RemoteObject.solveBoolean(">",_items.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 403;BA.debugLine="For Row = 0 To items.RowCount-1";
Debug.ShouldStop(262144);
if (true) break;

case 13:
//for
this.state = 16;
step29 = 1;
limit29 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
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
Debug.locals.put("Row", _row);
if (true) break;

case 15:
//C
this.state = 24;
 BA.debugLineNum = 404;BA.debugLine="items.Position = Row";
Debug.ShouldStop(524288);
_items.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 405;BA.debugLine="ListItemsRequest.Add(createRequestLineItemDetai";
Debug.ShouldStop(1048576);
__ref.getField(false,"_listitemsrequest" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createrequestlineitemdetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(_items),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("Row", _row);
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 408;BA.debugLine="items.Close";
Debug.ShouldStop(8388608);
_items.runVoidMethod ("Close");
 BA.debugLineNum = 409;BA.debugLine="HiddenListItemLabel = \"\"";
Debug.ShouldStop(16777216);
__ref.setField ("_hiddenlistitemlabel" /*RemoteObject*/ ,RemoteObject.createImmutable(("")));
 BA.debugLineNum = 410;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
Debug.ShouldStop(33554432);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 412;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getrequestselectdialog"), _sf);
this.state = 25;
return;
case 25:
//C
this.state = 18;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 413;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(268435456);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 414;BA.debugLine="CallSub3(MainMenu, \"ReturnFromPushRequestSelect\"";
Debug.ShouldStop(536870912);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(BA.ObjectToString("ReturnFromPushRequestSelect")),(Object)(RemoteObject.createImmutable((1))),(Object)(__ref.getField(false,"_hiddenlistitemlabel" /*RemoteObject*/ )));
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static void  _getrequesttaskdetailsdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _items,RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("getRequestTaskDetailsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1513);
if (RapidSub.canDelegate("getrequesttaskdetailsdialog")) { __ref.runUserSub(false, "appdialogs","getrequesttaskdetailsdialog", __ref, _activ, _activname, _title, _items, _tagcode); return;}
ResumableSub_getRequestTaskDetailsDialog rsub = new ResumableSub_getRequestTaskDetailsDialog(null,__ref,_activ,_activname,_title,_items,_tagcode);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getRequestTaskDetailsDialog extends BA.ResumableSub {
public ResumableSub_getRequestTaskDetailsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _items,RemoteObject _tagcode) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._items = _items;
this._tagcode = _tagcode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _items;
RemoteObject _tagcode;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _height = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _newrequesttype = RemoteObject.createImmutable("");
RemoteObject _sqlevc = RemoteObject.createImmutable("");
RemoteObject _localrecord = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tvals = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _nn = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
int step18;
int limit18;
int step29;
int limit29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getRequestTaskDetailsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1513);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("items", _items);
Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1514;BA.debugLine="MasterTagcode = tagcode";
Debug.ShouldStop(512);
__ref.setField ("_mastertagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 1515;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(1024);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 1516;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(2048);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 1518;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"E";
Debug.ShouldStop(8192);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("Executar")),(Object)(BA.ObjectToString("Voltar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1519;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1520;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1521;BA.debugLine="ApplDialog.SetSize(95%x, 90%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1523;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
Debug.ShouldStop(262144);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1526;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(2097152);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 1527;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getrequesttaskdetailsdialog"), null);
this.state = 26;
return;
case 26:
//C
this.state = 7;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 1528;BA.debugLine="DialogPanel.LoadLayout(\"task_item_detail_list\") '";
Debug.ShouldStop(8388608);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("task_item_detail_list")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1529;BA.debugLine="Dim Height As Int = 45dip";
Debug.ShouldStop(16777216);
_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)));Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 1530;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1531;BA.debugLine="Height = 60dip";
Debug.ShouldStop(67108864);
_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("Height", _height);
 if (true) break;
;
 BA.debugLineNum = 1534;BA.debugLine="For Row = 0 To items.RowCount-1";
Debug.ShouldStop(536870912);

case 10:
//for
this.state = 13;
step18 = 1;
limit18 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
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
Debug.locals.put("Row", _row);
if (true) break;

case 12:
//C
this.state = 28;
 BA.debugLineNum = 1535;BA.debugLine="items.Position = Row";
Debug.ShouldStop(1073741824);
_items.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 1536;BA.debugLine="ListItemsList.Add( createTaskLineItemDetail(acti";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createtasklineitemdetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(_items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(_items.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("item_type")))),(Object)(_height)).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 1538;BA.debugLine="items.close";
Debug.ShouldStop(2);
_items.runVoidMethod ("Close");
 BA.debugLineNum = 1543;BA.debugLine="Dim newRequestType As String = tagcode";
Debug.ShouldStop(64);
_newrequesttype = _tagcode;Debug.locals.put("newRequestType", _newrequesttype);Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 1588;BA.debugLine="Dim SQLEVC As String = $\"select a.task_tagcode fr";
Debug.ShouldStop(524288);
_sqlevc = (RemoteObject.concat(RemoteObject.createImmutable("select a.task_tagcode from dta_typerequests_tasks as a where a.typerequest_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' order by a.position")));Debug.locals.put("SQLEVC", _sqlevc);Debug.locals.put("SQLEVC", _sqlevc);
 BA.debugLineNum = 1589;BA.debugLine="Dim localRecord As Cursor = Starter.LocalSQLEVC.E";
Debug.ShouldStop(1048576);
_localrecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_localrecord = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlevc)));Debug.locals.put("localRecord", _localrecord);
 BA.debugLineNum = 1590;BA.debugLine="Dim TVals As List : TVals.Initialize";
Debug.ShouldStop(2097152);
_tvals = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("TVals", _tvals);
 BA.debugLineNum = 1590;BA.debugLine="Dim TVals As List : TVals.Initialize";
Debug.ShouldStop(2097152);
_tvals.runVoidMethod ("Initialize");
 BA.debugLineNum = 1592;BA.debugLine="If localRecord.RowCount > 0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 14:
//if
this.state = 21;
if (RemoteObject.solveBoolean(">",_localrecord.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1593;BA.debugLine="For nn = 0 To localRecord.RowCount-1";
Debug.ShouldStop(16777216);
if (true) break;

case 17:
//for
this.state = 20;
step29 = 1;
limit29 = RemoteObject.solve(new RemoteObject[] {_localrecord.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nn = 0 ;
Debug.locals.put("nn", _nn);
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
Debug.locals.put("nn", _nn);
if (true) break;

case 19:
//C
this.state = 30;
 BA.debugLineNum = 1594;BA.debugLine="localRecord.Position = nn";
Debug.ShouldStop(33554432);
_localrecord.runMethod(true,"setPosition",BA.numberCast(int.class, _nn));
 BA.debugLineNum = 1595;BA.debugLine="TVals.Add(localRecord.GetString(\"task_tagcode\")";
Debug.ShouldStop(67108864);
_tvals.runVoidMethod ("Add",(Object)((_localrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode"))))));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("nn", _nn);
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 1598;BA.debugLine="localRecord.Close";
Debug.ShouldStop(536870912);
_localrecord.runVoidMethod ("Close");
 BA.debugLineNum = 1600;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getrequesttaskdetailsdialog"), _sf);
this.state = 31;
return;
case 31:
//C
this.state = 22;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1601;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1602;BA.debugLine="CallSubDelayed3(TasksCL2, \"ReturnShowRequestTask";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((parent._taskscl2.getObject())),(Object)(BA.ObjectToString("ReturnShowRequestTaskDetails")),(Object)((_newrequesttype)),(Object)((_tvals)));
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 1606;BA.debugLine="End Sub";
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
public static void  _getshowimageviewdialog(RemoteObject __ref,RemoteObject _activname,RemoteObject _title,RemoteObject _b64image,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("getShowImageViewDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,981);
if (RapidSub.canDelegate("getshowimageviewdialog")) { __ref.runUserSub(false, "appdialogs","getshowimageviewdialog", __ref, _activname, _title, _b64image, _filename); return;}
ResumableSub_getShowImageViewDialog rsub = new ResumableSub_getShowImageViewDialog(null,__ref,_activname,_title,_b64image,_filename);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getShowImageViewDialog extends BA.ResumableSub {
public ResumableSub_getShowImageViewDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activname,RemoteObject _title,RemoteObject _b64image,RemoteObject _filename) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._title = _title;
this._b64image = _b64image;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _b64image;
RemoteObject _filename;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _continuedlg = RemoteObject.createImmutable(false);
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getShowImageViewDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,981);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("b64Image", _b64image);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 982;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(2097152);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 983;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"C";
Debug.ShouldStop(4194304);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 984;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(8388608);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 985;BA.debugLine="ApplDialog.SetSize(780dip, 680dip)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 780)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 680)))));
 BA.debugLineNum = 986;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(33554432);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 987;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getshowimageviewdialog"), null);
this.state = 16;
return;
case 16:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 988;BA.debugLine="DialogPanel.LoadLayout(\"dialog_ShowImageView\")";
Debug.ShouldStop(134217728);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_ShowImageView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 990;BA.debugLine="Dim ContinueDlg As Boolean = True";
Debug.ShouldStop(536870912);
_continuedlg = parent.__c.getField(true,"True");Debug.locals.put("ContinueDlg", _continuedlg);Debug.locals.put("ContinueDlg", _continuedlg);
 BA.debugLineNum = 991;BA.debugLine="If Utils.NNE(b64Image) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 8;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_b64image)).<Boolean>get().booleanValue()) { 
this.state = 3;
}else 
{ BA.debugLineNum = 993;BA.debugLine="Else if Utils.NNE(filename) Then";
Debug.ShouldStop(1);
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 992;BA.debugLine="ShowImageView.SetBackgroundImage(Utils.B64ToBitm";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_showimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((parent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_b64image)).getObject())));
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 994;BA.debugLine="Dim bg As Bitmap = LoadBitmapResize(Starter.Inte";
Debug.ShouldStop(2);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bg = parent.__c.runMethod(false,"LoadBitmapResize",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 480)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 380)))),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("bg", _bg);Debug.locals.put("bg", _bg);
 BA.debugLineNum = 995;BA.debugLine="ShowImageView.SetBackgroundImage(bg)";
Debug.ShouldStop(4);
__ref.getField(false,"_showimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((_bg.getObject())));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 997;BA.debugLine="ContinueDlg = False";
Debug.ShouldStop(16);
_continuedlg = parent.__c.getField(true,"False");Debug.locals.put("ContinueDlg", _continuedlg);
 if (true) break;
;
 BA.debugLineNum = 999;BA.debugLine="If ContinueDlg Then";
Debug.ShouldStop(64);

case 8:
//if
this.state = 15;
if (_continuedlg.<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1000;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getshowimageviewdialog"), _sf);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1001;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(256);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
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
 BA.debugLineNum = 1004;BA.debugLine="End Sub";
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
public static void  _getshowimageviewlistdialog(RemoteObject __ref,RemoteObject _activname,RemoteObject _images) throws Exception{
try {
		Debug.PushSubsStack("getShowImageViewListDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1006);
if (RapidSub.canDelegate("getshowimageviewlistdialog")) { __ref.runUserSub(false, "appdialogs","getshowimageviewlistdialog", __ref, _activname, _images); return;}
ResumableSub_getShowImageViewListDialog rsub = new ResumableSub_getShowImageViewListDialog(null,__ref,_activname,_images);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getShowImageViewListDialog extends BA.ResumableSub {
public ResumableSub_getShowImageViewListDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activname,RemoteObject _images) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
this._images = _images;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activname;
RemoteObject _images;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _continuedlg = RemoteObject.createImmutable(false);
RemoteObject _currentimage = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._imageviewdata");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getShowImageViewListDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1006);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activName", _activname);
Debug.locals.put("images", _images);
 BA.debugLineNum = 1007;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(16384);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 1008;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Informaç";
Debug.ShouldStop(32768);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Informação")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1009;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(65536);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1011;BA.debugLine="ApplDialog.SetSize(70%x, 90%y)";
Debug.ShouldStop(262144);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 1012;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(524288);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 1013;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getshowimageviewlistdialog"), null);
this.state = 16;
return;
case 16:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 1014;BA.debugLine="DialogPanel.LoadLayout(\"dialog_ShowImageView\")";
Debug.ShouldStop(2097152);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_ShowImageView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1016;BA.debugLine="CurrentImagesView = images";
Debug.ShouldStop(8388608);
__ref.setField ("_currentimagesview" /*RemoteObject*/ ,_images);
 BA.debugLineNum = 1017;BA.debugLine="CurrentPosition = 0";
Debug.ShouldStop(16777216);
__ref.setField ("_currentposition" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1019;BA.debugLine="leftPreviewImage.Visible = (CurrentImagesView.Siz";
Debug.ShouldStop(67108864);
__ref.getField(false,"_leftpreviewimage" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(false,"_currentimagesview" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1)))));
 BA.debugLineNum = 1020;BA.debugLine="rightPreviewImage.Visible = (CurrentImagesView.Si";
Debug.ShouldStop(134217728);
__ref.getField(false,"_rightpreviewimage" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(false,"_currentimagesview" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1)))));
 BA.debugLineNum = 1022;BA.debugLine="Dim ContinueDlg As Boolean = True";
Debug.ShouldStop(536870912);
_continuedlg = parent.__c.getField(true,"True");Debug.locals.put("ContinueDlg", _continuedlg);Debug.locals.put("ContinueDlg", _continuedlg);
 BA.debugLineNum = 1023;BA.debugLine="Dim CurrentImage As ImageViewData = CurrentImages";
Debug.ShouldStop(1073741824);
_currentimage = (__ref.getField(false,"_currentimagesview" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentposition" /*RemoteObject*/ ))));Debug.locals.put("CurrentImage", _currentimage);Debug.locals.put("CurrentImage", _currentimage);
 BA.debugLineNum = 1025;BA.debugLine="Utils.SetDialogtitle(sf, CurrentImage.filename)";
Debug.ShouldStop(1);
parent._utils.runVoidMethod ("_setdialogtitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(_currentimage.getField(true,"filename" /*RemoteObject*/ )));
 BA.debugLineNum = 1027;BA.debugLine="If Utils.NNE(CurrentImage.b64) Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 8;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"b64" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else 
{ BA.debugLineNum = 1029;BA.debugLine="Else if Utils.NNE(CurrentImage.filename) Then";
Debug.ShouldStop(16);
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"filename" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 1028;BA.debugLine="ShowImageView.SetBackgroundImage(Utils.B64ToBitm";
Debug.ShouldStop(8);
__ref.getField(false,"_showimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((parent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"b64" /*RemoteObject*/ ))).getObject())));
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 1030;BA.debugLine="Dim bg As Bitmap = LoadBitmapResize(Starter.Inte";
Debug.ShouldStop(32);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bg = parent.__c.runMethod(false,"LoadBitmapResize",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_currentimage.getField(true,"filename" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 780)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 620)))),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("bg", _bg);Debug.locals.put("bg", _bg);
 BA.debugLineNum = 1031;BA.debugLine="ShowImageView.SetBackgroundImage(bg)";
Debug.ShouldStop(64);
__ref.getField(false,"_showimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((_bg.getObject())));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1033;BA.debugLine="ContinueDlg = False";
Debug.ShouldStop(256);
_continuedlg = parent.__c.getField(true,"False");Debug.locals.put("ContinueDlg", _continuedlg);
 if (true) break;
;
 BA.debugLineNum = 1036;BA.debugLine="If ContinueDlg Then";
Debug.ShouldStop(2048);

case 8:
//if
this.state = 15;
if (_continuedlg.<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1037;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getshowimageviewlistdialog"), _sf);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1038;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8192);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
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
 BA.debugLineNum = 1041;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static void  _getsyncmanual(RemoteObject __ref,RemoteObject _activ,RemoteObject _tipodialogo) throws Exception{
try {
		Debug.PushSubsStack("getSyncManual (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2823);
if (RapidSub.canDelegate("getsyncmanual")) { __ref.runUserSub(false, "appdialogs","getsyncmanual", __ref, _activ, _tipodialogo); return;}
ResumableSub_getSyncManual rsub = new ResumableSub_getSyncManual(null,__ref,_activ,_tipodialogo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getSyncManual extends BA.ResumableSub {
public ResumableSub_getSyncManual(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _tipodialogo) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._tipodialogo = _tipodialogo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _tipodialogo;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _reclocaloffline = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _requesttc = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int _a = 0;
RemoteObject _poff = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _tc = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _updfile = RemoteObject.createImmutable("");
int step33;
int limit33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getSyncManual (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2823);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("TipoDialogo", _tipodialogo);
 BA.debugLineNum = 2825;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Sincroni";
Debug.ShouldStop(256);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Sincronização manual")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2828;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(2048);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2830;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getsyncmanual"), _sf);
this.state = 93;
return;
case 93:
//C
this.state = 1;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2831;BA.debugLine="pnl.LoadLayout(\"dialog_sync_manual\")";
Debug.ShouldStop(16384);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_sync_manual")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2832;BA.debugLine="btn_Upload_SyncManual.Color = Colors.LightGray";
Debug.ShouldStop(32768);
__ref.getField(false,"_btn_upload_syncmanual" /*RemoteObject*/ ).runVoidMethod ("setColor",parent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 2833;BA.debugLine="btn_Download_SyncManual.Color = Consts.ColorMain";
Debug.ShouldStop(65536);
__ref.getField(false,"_btn_download_syncmanual" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 2835;BA.debugLine="Dim sSQL As String = $\"select distinct up_tagcode";
Debug.ShouldStop(262144);
_ssql = (RemoteObject.createImmutable("select distinct up_tagcode from loc_updatesrever where up_state=0"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2836;BA.debugLine="Dim RecLocalOffline As ResultSet = Starter.LocalS";
Debug.ShouldStop(524288);
_reclocaloffline = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_reclocaloffline = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecLocalOffline", _reclocaloffline);
 BA.debugLineNum = 2838;BA.debugLine="lstOfflineData.Clear";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lstofflinedata" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 2839;BA.debugLine="If RecLocalOffline.RowCount <= 0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("k",_reclocaloffline.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 14;
 BA.debugLineNum = 2840;BA.debugLine="btn_Upload_SyncManual.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btn_upload_syncmanual" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 2841;BA.debugLine="ShareCode.TCF = \"\"";
Debug.ShouldStop(16777216);
parent._sharecode._tcf /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2843;BA.debugLine="btn_Upload_SyncManual.Enabled = True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btn_upload_syncmanual" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2844;BA.debugLine="btn_Upload_SyncManual.Text = $\"Envio de dados OF";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btn_upload_syncmanual" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Envio de dados OFFLINE ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reclocaloffline.runMethod(true,"getRowCount")))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 2846;BA.debugLine="Do While RecLocalOffline.NextRow";
Debug.ShouldStop(536870912);
if (true) break;

case 6:
//do while
this.state = 13;
while (_reclocaloffline.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 8;
if (true) break;
}
if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2847;BA.debugLine="Dim RequestTC As String = RecLocalOffline.GetSt";
Debug.ShouldStop(1073741824);
_requesttc = _reclocaloffline.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_tagcode"))).runMethod(true,"trim");Debug.locals.put("RequestTC", _requesttc);Debug.locals.put("RequestTC", _requesttc);
 BA.debugLineNum = 2848;BA.debugLine="If Utils.NNE(RequestTC) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//if
this.state = 12;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_requesttc)).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2849;BA.debugLine="lstOfflineData.Add(CreatelstOfflineData(Reques";
Debug.ShouldStop(1);
__ref.getField(false,"_lstofflinedata" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createlstofflinedata" /*RemoteObject*/ ,(Object)(_requesttc),(Object)(parent.__c.getField(true,"True")),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_requesttc)));
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
 BA.debugLineNum = 2855;BA.debugLine="btn_Upload_SyncManual.Enabled = False ' xxx - Ret";
Debug.ShouldStop(64);
__ref.getField(false,"_btn_upload_syncmanual" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 2859;BA.debugLine="sync_manual_warning.Text = $\"ATENÇÃO !!${CRLF}A s";
Debug.ShouldStop(1024);
__ref.getField(false,"_sync_manual_warning" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("ATENÇÃO !!"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("A selecção de um periodo muito alargado irá causar um tempo de espera e um consumo de dados maior.")))));
 BA.debugLineNum = 2860;BA.debugLine="sync_manual_idate.Text = Utils.GetCurrentDate";
Debug.ShouldStop(2048);
__ref.getField(false,"_sync_manual_idate" /*RemoteObject*/ ).runMethod(true,"setText",(parent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,__ref.getField(false, "ba"))));
 BA.debugLineNum = 2861;BA.debugLine="sync_manual_edate.Text = Utils.GetCurrentDate";
Debug.ShouldStop(4096);
__ref.getField(false,"_sync_manual_edate" /*RemoteObject*/ ).runMethod(true,"setText",(parent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,__ref.getField(false, "ba"))));
 BA.debugLineNum = 2863;BA.debugLine="sync_manual_Radio_diaria.Checked = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_sync_manual_radio_diaria" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2864;BA.debugLine="sync_manual_Radio_diaria_CheckedChange(True)";
Debug.ShouldStop(32768);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_sync_manual_radio_diaria_checkedchange" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 2866;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getsyncmanual"), _sf);
this.state = 94;
return;
case 94:
//C
this.state = 15;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2867;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (true) break;

case 15:
//if
this.state = 92;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 17;
}else {
this.state = 91;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2869;BA.debugLine="If lstOfflineData.Size > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 18:
//if
this.state = 34;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstofflinedata" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 20;
}else {
this.state = 33;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2870;BA.debugLine="ShareCode.TCF = \"\"";
Debug.ShouldStop(2097152);
parent._sharecode._tcf /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 2871;BA.debugLine="For a=0 To lstOfflineData.Size -1";
Debug.ShouldStop(4194304);
if (true) break;

case 21:
//for
this.state = 28;
step33 = 1;
limit33 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstofflinedata" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_a = 0 ;
Debug.locals.put("a", _a);
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
Debug.locals.put("a", _a);
if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2872;BA.debugLine="Dim pOff As Panel = lstOfflineData.GetPanel(a)";
Debug.ShouldStop(8388608);
_poff = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_poff = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_lstofflinedata" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _a))).getObject());Debug.locals.put("pOff", _poff);
 BA.debugLineNum = 2873;BA.debugLine="Dim Chk As CheckBox = pnl.GetView(0)";
Debug.ShouldStop(16777216);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_chk = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("Chk", _chk);
 BA.debugLineNum = 2874;BA.debugLine="Dim TC As EditText = pnl.GetView(1)";
Debug.ShouldStop(33554432);
_tc = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_tc = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("TC", _tc);
 BA.debugLineNum = 2875;BA.debugLine="If Chk.Checked Then";
Debug.ShouldStop(67108864);
if (true) break;

case 24:
//if
this.state = 27;
if (_chk.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2876;BA.debugLine="ShareCode.TCF = ShareCode.TCF & $\"'${TC}',\"$";
Debug.ShouldStop(134217728);
parent._sharecode._tcf /*RemoteObject*/  = RemoteObject.concat(parent._sharecode._tcf /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc.getObject()))),RemoteObject.createImmutable("',"))));
 if (true) break;

case 27:
//C
this.state = 96;
;
 if (true) break;
if (true) break;
Debug.locals.put("a", _a);
;
 BA.debugLineNum = 2879;BA.debugLine="If ShareCode.TCF.EndsWith(\",\") Then";
Debug.ShouldStop(1073741824);

case 28:
//if
this.state = 31;
if (parent._sharecode._tcf /*RemoteObject*/ .runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(","))).<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2880;BA.debugLine="ShareCode.TCF = ShareCode.TCF.SubString2(0,Sha";
Debug.ShouldStop(-2147483648);
parent._sharecode._tcf /*RemoteObject*/  = parent._sharecode._tcf /*RemoteObject*/ .runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent._sharecode._tcf /*RemoteObject*/ .runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2883;BA.debugLine="ShareCode.TCF = \"\"";
Debug.ShouldStop(4);
parent._sharecode._tcf /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;
;
 BA.debugLineNum = 2887;BA.debugLine="If sync_manual_downloadrunfirstintall.Checked Th";
Debug.ShouldStop(64);

case 34:
//if
this.state = 89;
if (__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 36;
}else 
{ BA.debugLineNum = 2910;BA.debugLine="else if sync_manual_runfirstintall.Checked Then";
Debug.ShouldStop(536870912);
if (__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 59;
}else {
this.state = 82;
}}
if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 2888;BA.debugLine="Starter.LocalSQLEVC.Close";
Debug.ShouldStop(128);
parent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 2889;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolution";
Debug.ShouldStop(256);
if (true) break;

case 37:
//if
this.state = 40;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))).<Boolean>get().booleanValue()) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2890;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionch";
Debug.ShouldStop(512);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 2892;BA.debugLine="Sleep(250)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getsyncmanual"),BA.numberCast(int.class, 250));
this.state = 97;
return;
case 97:
//C
this.state = 41;
;
 BA.debugLineNum = 2894;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evolu";
Debug.ShouldStop(8192);
if (true) break;

case 41:
//if
this.state = 44;
if (parent.__c.runMethod(true,"Not",(Object)(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))))).<Boolean>get().booleanValue()) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 2895;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\"";
Debug.ShouldStop(16384);
parent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 2897;BA.debugLine="Sleep(250)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getsyncmanual"),BA.numberCast(int.class, 250));
this.state = 98;
return;
case 98:
//C
this.state = 45;
;
 BA.debugLineNum = 2899;BA.debugLine="If File.Exists(Starter.SharedFolder,\"logins.log";
Debug.ShouldStop(262144);
if (true) break;

case 45:
//if
this.state = 52;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("logins.log"))).<Boolean>get().booleanValue()) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 2900;BA.debugLine="File.Delete(Starter.SharedFolder,\"logins.log\")";
Debug.ShouldStop(524288);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("logins.log")));
 BA.debugLineNum = 2901;BA.debugLine="Dim updfile As String = $\"${ShareCode.SESS_OPE";
Debug.ShouldStop(1048576);
_updfile = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_upd.log")));Debug.locals.put("updfile", _updfile);Debug.locals.put("updfile", _updfile);
 BA.debugLineNum = 2902;BA.debugLine="If File.Exists(Starter.InternalFolder,updfile)";
Debug.ShouldStop(2097152);
if (true) break;

case 48:
//if
this.state = 51;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_updfile)).<Boolean>get().booleanValue()) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 2903;BA.debugLine="File.Delete(Starter.InternalFolder,updfile)";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_updfile));
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
 BA.debugLineNum = 2907;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then";
Debug.ShouldStop(67108864);

case 52:
//if
this.state = 57;
if (parent.__c.runMethod(true,"Not",(Object)(parent._starter._localsqlevc /*RemoteObject*/ .runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
parent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.__c.getField(true,"True")));
if (true) break;

case 57:
//C
this.state = 89;
;
 BA.debugLineNum = 2908;BA.debugLine="CallSub2(MainMenu,\"Reinstallation\",True)";
Debug.ShouldStop(134217728);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(BA.ObjectToString("Reinstallation")),(Object)((parent.__c.getField(true,"True"))));
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 2911;BA.debugLine="Starter.LocalSQLEVC.Close";
Debug.ShouldStop(1073741824);
parent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 2912;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolution";
Debug.ShouldStop(-2147483648);
if (true) break;

case 60:
//if
this.state = 63;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))).<Boolean>get().booleanValue()) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 2913;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionch";
Debug.ShouldStop(1);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 63:
//C
this.state = 64;
;
 BA.debugLineNum = 2915;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getsyncmanual"),BA.numberCast(int.class, 250));
this.state = 99;
return;
case 99:
//C
this.state = 64;
;
 BA.debugLineNum = 2917;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evolu";
Debug.ShouldStop(16);
if (true) break;

case 64:
//if
this.state = 67;
if (parent.__c.runMethod(true,"Not",(Object)(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))))).<Boolean>get().booleanValue()) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 2918;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\"";
Debug.ShouldStop(32);
parent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 67:
//C
this.state = 68;
;
 BA.debugLineNum = 2920;BA.debugLine="Sleep(250)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getsyncmanual"),BA.numberCast(int.class, 250));
this.state = 100;
return;
case 100:
//C
this.state = 68;
;
 BA.debugLineNum = 2922;BA.debugLine="If File.Exists(Starter.SharedFolder,\"logins.log";
Debug.ShouldStop(512);
if (true) break;

case 68:
//if
this.state = 75;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("logins.log"))).<Boolean>get().booleanValue()) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 2923;BA.debugLine="File.Delete(Starter.SharedFolder,\"logins.log\")";
Debug.ShouldStop(1024);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("logins.log")));
 BA.debugLineNum = 2924;BA.debugLine="Dim updfile As String = $\"${ShareCode.SESS_OPE";
Debug.ShouldStop(2048);
_updfile = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_upd.log")));Debug.locals.put("updfile", _updfile);Debug.locals.put("updfile", _updfile);
 BA.debugLineNum = 2925;BA.debugLine="If File.Exists(Starter.InternalFolder,updfile)";
Debug.ShouldStop(4096);
if (true) break;

case 71:
//if
this.state = 74;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_updfile)).<Boolean>get().booleanValue()) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 2926;BA.debugLine="File.Delete(Starter.InternalFolder,updfile)";
Debug.ShouldStop(8192);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_updfile));
 if (true) break;

case 74:
//C
this.state = 75;
;
 if (true) break;
;
 BA.debugLineNum = 2930;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then";
Debug.ShouldStop(131072);

case 75:
//if
this.state = 80;
if (parent.__c.runMethod(true,"Not",(Object)(parent._starter._localsqlevc /*RemoteObject*/ .runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 77;
;}if (true) break;

case 77:
//C
this.state = 80;
parent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.__c.getField(true,"True")));
if (true) break;

case 80:
//C
this.state = 89;
;
 BA.debugLineNum = 2931;BA.debugLine="CallSub2(MainMenu,\"Reinstallation\", False)";
Debug.ShouldStop(262144);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(BA.ObjectToString("Reinstallation")),(Object)((parent.__c.getField(true,"False"))));
 if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 2933;BA.debugLine="ShareCode.SyncManualComponents.Clear";
Debug.ShouldStop(1048576);
parent._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 2934;BA.debugLine="SetChecksSyncManual";
Debug.ShouldStop(2097152);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setcheckssyncmanual" /*RemoteObject*/ );
 BA.debugLineNum = 2935;BA.debugLine="ShareCode.SyncManualDates = $\"${sync_manual_ida";
Debug.ShouldStop(4194304);
parent._sharecode._syncmanualdates /*RemoteObject*/  = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_sync_manual_idate" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("|"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_sync_manual_edate" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 2937;BA.debugLine="If sync_manual_chk_docs_templates.Checked Then";
Debug.ShouldStop(16777216);
if (true) break;

case 83:
//if
this.state = 88;
if (__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 85;
}else {
this.state = 87;
}if (true) break;

case 85:
//C
this.state = 88;
 BA.debugLineNum = 2938;BA.debugLine="ShareCode.DownloadDocsFromFTP = True";
Debug.ShouldStop(33554432);
parent._sharecode._downloaddocsfromftp /*RemoteObject*/  = parent.__c.getField(true,"True");
 if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 2940;BA.debugLine="ShareCode.DownloadDocsFromFTP = False";
Debug.ShouldStop(134217728);
parent._sharecode._downloaddocsfromftp /*RemoteObject*/  = parent.__c.getField(true,"False");
 if (true) break;

case 88:
//C
this.state = 89;
;
 BA.debugLineNum = 2943;BA.debugLine="CallSub3(MainMenu,\"RunSyncManual\",ShareCode.Syn";
Debug.ShouldStop(1073741824);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(BA.ObjectToString("RunSyncManual")),(Object)((parent._sharecode._syncmanualdates /*RemoteObject*/ )),(Object)((parent.__c.getField(true,"True"))));
 if (true) break;

case 89:
//C
this.state = 92;
;
 if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 2947;BA.debugLine="Log(res)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","677135996",BA.NumberToString(_res),0);
 if (true) break;

case 92:
//C
this.state = -1;
;
 BA.debugLineNum = 2949;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _gettaskdetailsdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _items,RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("getTaskDetailsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1612);
if (RapidSub.canDelegate("gettaskdetailsdialog")) { __ref.runUserSub(false, "appdialogs","gettaskdetailsdialog", __ref, _activ, _activname, _title, _items, _tagcode); return;}
ResumableSub_getTaskDetailsDialog rsub = new ResumableSub_getTaskDetailsDialog(null,__ref,_activ,_activname,_title,_items,_tagcode);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getTaskDetailsDialog extends BA.ResumableSub {
public ResumableSub_getTaskDetailsDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _items,RemoteObject _tagcode) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._items = _items;
this._tagcode = _tagcode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _items;
RemoteObject _tagcode;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _height = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _typelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _newrequesttype = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _n = 0;
RemoteObject _nrt = RemoteObject.createImmutable("");
RemoteObject _recordw = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _tvals = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._triplevalues");
int step18;
int limit18;
int step31;
int limit31;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getTaskDetailsDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1612);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("items", _items);
Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1613;BA.debugLine="MasterTagcode = tagcode";
Debug.ShouldStop(4096);
__ref.setField ("_mastertagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 1614;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(8192);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 1615;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(16384);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 1617;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"E";
Debug.ShouldStop(65536);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("Executar")),(Object)(BA.ObjectToString("Voltar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1618;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1619;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1620;BA.debugLine="ApplDialog.SetSize(95%x, 90%y)";
Debug.ShouldStop(524288);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1622;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1625;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(16777216);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 1626;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "gettaskdetailsdialog"), null);
this.state = 36;
return;
case 36:
//C
this.state = 7;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 1627;BA.debugLine="DialogPanel.LoadLayout(\"task_item_detail_list\") '";
Debug.ShouldStop(67108864);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("task_item_detail_list")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1628;BA.debugLine="Dim Height As Int = 45dip";
Debug.ShouldStop(134217728);
_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)));Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 1629;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1630;BA.debugLine="Height = 60dip";
Debug.ShouldStop(536870912);
_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("Height", _height);
 if (true) break;
;
 BA.debugLineNum = 1633;BA.debugLine="For Row = 0 To items.RowCount-1";
Debug.ShouldStop(1);

case 10:
//for
this.state = 13;
step18 = 1;
limit18 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
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
Debug.locals.put("Row", _row);
if (true) break;

case 12:
//C
this.state = 38;
 BA.debugLineNum = 1634;BA.debugLine="items.Position = Row";
Debug.ShouldStop(2);
_items.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 1635;BA.debugLine="ListItemsList.Add( createTaskLineItemDetail(acti";
Debug.ShouldStop(4);
__ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createtasklineitemdetail" /*RemoteObject*/ ,(Object)(_activ),(Object)(_items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),(Object)(_items.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("item_type")))),(Object)(_height)).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 1637;BA.debugLine="items.close";
Debug.ShouldStop(16);
_items.runVoidMethod ("Close");
 BA.debugLineNum = 1642;BA.debugLine="Dim TypeList As List : TypeList.Initialize";
Debug.ShouldStop(512);
_typelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("TypeList", _typelist);
 BA.debugLineNum = 1642;BA.debugLine="Dim TypeList As List : TypeList.Initialize";
Debug.ShouldStop(512);
_typelist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1643;BA.debugLine="Dim newRequestType As String = \"\"";
Debug.ShouldStop(1024);
_newrequesttype = BA.ObjectToString("");Debug.locals.put("newRequestType", _newrequesttype);Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 1644;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode, t";
Debug.ShouldStop(2048);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct tagcode, title, tr_is_model\n"),RemoteObject.createImmutable("				from dta_typerequests \n"),RemoteObject.createImmutable("				where tagcode in (select distinct typerequest_tagcode \n"),RemoteObject.createImmutable("					from dta_typerequests_tasks where task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("') and active=1 and tr_is_model=0 \n"),RemoteObject.createImmutable("					ORDER BY created_at desc ")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1649;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","674907685",_ssql,0);
 BA.debugLineNum = 1650;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(131072);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1651;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(262144);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1652;BA.debugLine="If Record.RowCount >= 1 Then";
Debug.ShouldStop(524288);
if (true) break;

case 14:
//if
this.state = 23;
if (RemoteObject.solveBoolean("g",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
this.state = 16;
}else {
this.state = 22;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1653;BA.debugLine="For n=0 To Record.RowCount-1";
Debug.ShouldStop(1048576);
if (true) break;

case 17:
//for
this.state = 20;
step31 = 1;
limit31 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
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
Debug.locals.put("n", _n);
if (true) break;

case 19:
//C
this.state = 40;
 BA.debugLineNum = 1654;BA.debugLine="Record.Position = n";
Debug.ShouldStop(2097152);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 1655;BA.debugLine="newRequestType = Record.GetString(\"tagcode\")";
Debug.ShouldStop(4194304);
_newrequesttype = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 1656;BA.debugLine="TypeList.Add(newRequestType)";
Debug.ShouldStop(8388608);
_typelist.runVoidMethod ("Add",(Object)((_newrequesttype)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
Debug.locals.put("n", _n);
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
 BA.debugLineNum = 1665;BA.debugLine="Record.Close";
Debug.ShouldStop(1);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1668;BA.debugLine="If (TypeList.Size = 0) Then";
Debug.ShouldStop(8);
if (true) break;

case 24:
//if
this.state = 31;
if ((RemoteObject.solveBoolean("=",_typelist.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1669;BA.debugLine="Utils.SetDialogtitle(sf, $\"${title} (Intervenção";
Debug.ShouldStop(16);
parent._utils.runVoidMethod ("_setdialogtitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable(" (Intervenção geral)")))));
 BA.debugLineNum = 1670;BA.debugLine="Dim nrt As String = \"\"";
Debug.ShouldStop(32);
_nrt = BA.ObjectToString("");Debug.locals.put("nrt", _nrt);Debug.locals.put("nrt", _nrt);
 BA.debugLineNum = 1671;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode,";
Debug.ShouldStop(64);
_ssql = (RemoteObject.createImmutable("select distinct tagcode, title from dta_typerequests where id=0 and is_internal=1 limit 1"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1672;BA.debugLine="Private Recordw As Cursor";
Debug.ShouldStop(128);
_recordw = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Recordw", _recordw);
 BA.debugLineNum = 1673;BA.debugLine="Recordw = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(256);
_recordw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1674;BA.debugLine="If Recordw.RowCount > 0 Then";
Debug.ShouldStop(512);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",_recordw.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1675;BA.debugLine="Recordw.Position = 0";
Debug.ShouldStop(1024);
_recordw.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1676;BA.debugLine="nrt = Recordw.GetString(\"tagcode\")";
Debug.ShouldStop(2048);
_nrt = _recordw.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("nrt", _nrt);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 1678;BA.debugLine="Recordw.Close";
Debug.ShouldStop(8192);
_recordw.runVoidMethod ("Close");
 BA.debugLineNum = 1679;BA.debugLine="newRequestType = Utils.IfNullOrEmpty(nrt, \"TSKS_";
Debug.ShouldStop(16384);
_newrequesttype = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_nrt),(Object)(RemoteObject.createImmutable("TSKS_INTERNO_01")));Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 1680;BA.debugLine="TypeList.Add(newRequestType)";
Debug.ShouldStop(32768);
_typelist.runVoidMethod ("Add",(Object)((_newrequesttype)));
 BA.debugLineNum = 1682;BA.debugLine="ApplDialog.GetButton(DialogResponse.POSITIVE).En";
Debug.ShouldStop(131072);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",parent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._sharecode._device_param_runcl_notyperequest /*RemoteObject*/ )));
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 1685;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "gettaskdetailsdialog"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 32;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1686;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1687;BA.debugLine="Dim TVals As TripleValues = Types.MakeTripleValu";
Debug.ShouldStop(4194304);
_tvals = parent._types.runMethod(false,"_maketriplevalues" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tagcode),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("TVals", _tvals);Debug.locals.put("TVals", _tvals);
 BA.debugLineNum = 1688;BA.debugLine="CallSubDelayed3(TasksCL2, \"ReturnShowTaskDetails";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((parent._taskscl2.getObject())),(Object)(BA.ObjectToString("ReturnShowTaskDetails")),(Object)((_typelist)),(Object)((_tvals)));
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 1692;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static void  _gettaskfiltersdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _tabposis,RemoteObject _sft) throws Exception{
try {
		Debug.PushSubsStack("GetTaskFiltersDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1775);
if (RapidSub.canDelegate("gettaskfiltersdialog")) { __ref.runUserSub(false, "appdialogs","gettaskfiltersdialog", __ref, _activ, _curr, _tabposis, _sft); return;}
ResumableSub_GetTaskFiltersDialog rsub = new ResumableSub_GetTaskFiltersDialog(null,__ref,_activ,_curr,_tabposis,_sft);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetTaskFiltersDialog extends BA.ResumableSub {
public ResumableSub_GetTaskFiltersDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _curr,RemoteObject _tabposis,RemoteObject _sft) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._curr = _curr;
this._tabposis = _tabposis;
this._sft = _sft;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _curr;
RemoteObject _tabposis;
RemoteObject _sft;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _wchk = RemoteObject.createImmutable(false);
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _setthefilters = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._taskfilter");
RemoteObject _wreq = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetTaskFiltersDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1775);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("curr", _curr);
Debug.locals.put("tabposis", _tabposis);
Debug.locals.put("sft", _sft);
 BA.debugLineNum = 1776;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Filtros\"";
Debug.ShouldStop(32768);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Filtros")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Remover filtro")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1778;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1779;BA.debugLine="If tabposis = 0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_tabposis,BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1780;BA.debugLine="ApplDialog.SetSize(500dip, 380dip)";
Debug.ShouldStop(524288);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 380)))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1782;BA.debugLine="ApplDialog.SetSize(95%x, 65%y)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 65)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1784;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "gettaskfiltersdialog"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 1786;BA.debugLine="If tabposis = 0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_tabposis,BA.numberCast(double.class, 0))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 1794;BA.debugLine="Else If tabposis = 1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_tabposis,BA.numberCast(double.class, 1))) { 
this.state = 11;
}else {
this.state = 13;
}}
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 1787;BA.debugLine="pnl.LoadLayout(\"dialog_filtertask_typerequest\")";
Debug.ShouldStop(67108864);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_filtertask_typerequest")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1788;BA.debugLine="SetUpdateTBColor(TBSingular, sft.singular)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tbsingular" /*RemoteObject*/ )),(Object)(_sft.getField(true,"singular" /*RemoteObject*/ )));
 BA.debugLineNum = 1789;BA.debugLine="SetUpdateTBColor(TBPlural, sft.plural)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tbplural" /*RemoteObject*/ )),(Object)(_sft.getField(true,"plural" /*RemoteObject*/ )));
 BA.debugLineNum = 1790;BA.debugLine="SetUpdateTBColor(TBActive, sft.active)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tbactive" /*RemoteObject*/ )),(Object)(_sft.getField(true,"active" /*RemoteObject*/ )));
 BA.debugLineNum = 1791;BA.debugLine="SetUpdateTBColor(TBInactive, sft.inactive)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setupdatetbcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tbinactive" /*RemoteObject*/ )),(Object)(_sft.getField(true,"inactive" /*RemoteObject*/ )));
 if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 1795;BA.debugLine="pnl.LoadLayout(\"dialog_filtertask_device_2\")";
Debug.ShouldStop(4);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_filtertask_device_2")),__ref.getField(false, "ba"));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1797;BA.debugLine="pnl.LoadLayout(\"dialog_filtertask_device_2\")";
Debug.ShouldStop(16);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_filtertask_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1798;BA.debugLine="DialogReqType.DropdownBackgroundColor = Consts.C";
Debug.ShouldStop(32);
__ref.getField(false,"_dialogreqtype" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 1799;BA.debugLine="DialogReqType.Add( \"(Todos)\" )";
Debug.ShouldStop(64);
__ref.getField(false,"_dialogreqtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 1800;BA.debugLine="DialogReqType.Add( \"Checklist\" )";
Debug.ShouldStop(128);
__ref.getField(false,"_dialogreqtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Checklist")));
 BA.debugLineNum = 1801;BA.debugLine="DialogReqType.Add( \"Tarefas\" )";
Debug.ShouldStop(256);
__ref.getField(false,"_dialogreqtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Tarefas")));
 BA.debugLineNum = 1803;BA.debugLine="DialogReqStatus.DropdownBackgroundColor = Consts";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 1804;BA.debugLine="DialogReqStatus.Add( \"(Todos)\" )";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 1805;BA.debugLine="DialogReqStatus.Add( \"Activos\" )";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Activos")));
 BA.debugLineNum = 1806;BA.debugLine="DialogReqStatus.Add( \"Inactivos\" )";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Inactivos")));
 BA.debugLineNum = 1808;BA.debugLine="DialogReqUpdated.DropdownBackgroundColor = Const";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialogrequpdated" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 1809;BA.debugLine="DialogReqUpdated.Add( \"(Todos)\" )";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialogrequpdated" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 1810;BA.debugLine="DialogReqUpdated.Add( \"Actualizados\" )";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialogrequpdated" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Actualizados")));
 BA.debugLineNum = 1811;BA.debugLine="DialogReqUpdated.Add( \"Por actualizar\" )";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialogrequpdated" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Por actualizar")));
 BA.debugLineNum = 1813;BA.debugLine="DialogReqType.SelectedIndex = curr.TypeTask";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dialogreqtype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"TypeTask" /*RemoteObject*/ ));
 BA.debugLineNum = 1814;BA.debugLine="DialogReqStatus.SelectedIndex = curr.Status";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Status" /*RemoteObject*/ ));
 BA.debugLineNum = 1815;BA.debugLine="DialogReqUpdated.SelectedIndex = curr.Updated";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialogrequpdated" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_curr.getField(true,"Updated" /*RemoteObject*/ ));
 BA.debugLineNum = 1816;BA.debugLine="Dim wchk As Boolean = True";
Debug.ShouldStop(8388608);
_wchk = parent.__c.getField(true,"True");Debug.locals.put("wchk", _wchk);Debug.locals.put("wchk", _wchk);
 BA.debugLineNum = 1817;BA.debugLine="If curr.WithRequests = 0 Then wchk = False";
Debug.ShouldStop(16777216);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_curr.getField(true,"WithRequests" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_wchk = parent.__c.getField(true,"False");Debug.locals.put("wchk", _wchk);
if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 1818;BA.debugLine="DialogReqWithRequests.Checked = wchk";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialogreqwithrequests" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",_wchk);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 1823;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "gettaskfiltersdialog"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 21;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1824;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 21:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 23;
}else 
{ BA.debugLineNum = 1839;BA.debugLine="else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 37;
}}
if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1825;BA.debugLine="If tabposis = 0 Then";
Debug.ShouldStop(1);
if (true) break;

case 24:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_tabposis,BA.numberCast(double.class, 0))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 35;
 BA.debugLineNum = 1826;BA.debugLine="ShareCode.TaskTPRActive = TBActive.Checked";
Debug.ShouldStop(2);
parent._sharecode._tasktpractive /*RemoteObject*/  = __ref.getField(false,"_tbactive" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 1827;BA.debugLine="ShareCode.TaskTPRInactive = TBInactive.Checked";
Debug.ShouldStop(4);
parent._sharecode._tasktprinactive /*RemoteObject*/  = __ref.getField(false,"_tbinactive" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 1828;BA.debugLine="ShareCode.TaskTPRSingular = TBSingular.Checked";
Debug.ShouldStop(8);
parent._sharecode._tasktprsingular /*RemoteObject*/  = __ref.getField(false,"_tbsingular" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 1829;BA.debugLine="ShareCode.TaskTPRPlural = TBPlural.Checked";
Debug.ShouldStop(16);
parent._sharecode._tasktprplural /*RemoteObject*/  = __ref.getField(false,"_tbplural" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 1831;BA.debugLine="Dim SetTheFilters As TaskFilter =  Types.MakeTa";
Debug.ShouldStop(64);
_setthefilters = parent._types.runMethod(false,"_maketaskfilter" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("SetTheFilters", _setthefilters);Debug.locals.put("SetTheFilters", _setthefilters);
 BA.debugLineNum = 1832;BA.debugLine="CallSub2(TasksCL2, \"SetTheFilters\", SetTheFilte";
Debug.ShouldStop(128);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((parent._taskscl2.getObject())),(Object)(BA.ObjectToString("SetTheFilters")),(Object)((_setthefilters)));
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1834;BA.debugLine="Dim WReq As Int = 0";
Debug.ShouldStop(512);
_wreq = BA.numberCast(int.class, 0);Debug.locals.put("WReq", _wreq);Debug.locals.put("WReq", _wreq);
 BA.debugLineNum = 1835;BA.debugLine="If (DialogReqWithRequests.Checked) Then WReq =";
Debug.ShouldStop(1024);
if (true) break;

case 29:
//if
this.state = 34;
if ((__ref.getField(false,"_dialogreqwithrequests" /*RemoteObject*/ ).runMethod(true,"getChecked")).<Boolean>get().booleanValue()) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_wreq = BA.numberCast(int.class, 1);Debug.locals.put("WReq", _wreq);
if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 1836;BA.debugLine="Dim SetTheFilters As TaskFilter =  Types.MakeTa";
Debug.ShouldStop(2048);
_setthefilters = parent._types.runMethod(false,"_maketaskfilter" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogreqtype" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogreqstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(__ref.getField(false,"_dialogrequpdated" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)(_wreq),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("SetTheFilters", _setthefilters);Debug.locals.put("SetTheFilters", _setthefilters);
 BA.debugLineNum = 1837;BA.debugLine="CallSub2(TasksCL2, \"SetTheFilters\", SetTheFilte";
Debug.ShouldStop(4096);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((parent._taskscl2.getObject())),(Object)(BA.ObjectToString("SetTheFilters")),(Object)((_setthefilters)));
 if (true) break;

case 35:
//C
this.state = 38;
;
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1840;BA.debugLine="CallSub2(TasksCL2, \"CancelAllFilters\", True)";
Debug.ShouldStop(32768);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((parent._taskscl2.getObject())),(Object)(BA.ObjectToString("CancelAllFilters")),(Object)((parent.__c.getField(true,"True"))));
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 1842;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _getuserquantitydialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _code,RemoteObject _qtd) throws Exception{
try {
		Debug.PushSubsStack("GetUserQuantityDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3254);
if (RapidSub.canDelegate("getuserquantitydialog")) { __ref.runUserSub(false, "appdialogs","getuserquantitydialog", __ref, _activ, _code, _qtd); return;}
ResumableSub_GetUserQuantityDialog rsub = new ResumableSub_GetUserQuantityDialog(null,__ref,_activ,_code,_qtd);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetUserQuantityDialog extends BA.ResumableSub {
public ResumableSub_GetUserQuantityDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _code,RemoteObject _qtd) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._code = _code;
this._qtd = _qtd;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _code;
RemoteObject _qtd;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetUserQuantityDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3254);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("code", _code);
Debug.locals.put("qtd", _qtd);
 BA.debugLineNum = 3255;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Quantida";
Debug.ShouldStop(4194304);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Quantidade de produto/peça")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3257;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(16777216);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3258;BA.debugLine="ApplDialog.SetSize(60%x, 300dip)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 3259;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getuserquantitydialog"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3260;BA.debugLine="pnl.LoadLayout(\"dialog_quantity_device_2\")";
Debug.ShouldStop(134217728);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_quantity_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3261;BA.debugLine="DialogQuantityValue.EditText.InputType = DialogQu";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialogquantityvalue" /*RemoteObject*/ ).runMethod(false,"getEditText").runMethod(true,"setInputType",__ref.getField(false,"_dialogquantityvalue" /*RemoteObject*/ ).runMethod(false,"getEditText").getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 3262;BA.debugLine="DialogQuantityValue.EditText.Text = qtd";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dialogquantityvalue" /*RemoteObject*/ ).runMethod(false,"getEditText").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_qtd));
 BA.debugLineNum = 3265;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getuserquantitydialog"), _sf);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3267;BA.debugLine="DialogQuantityValue.EditText.Enabled = False";
Debug.ShouldStop(4);
__ref.getField(false,"_dialogquantityvalue" /*RemoteObject*/ ).runMethod(false,"getEditText").runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 3268;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3269;BA.debugLine="ReturnQuantityValue = DialogQuantityValue.Text";
Debug.ShouldStop(16);
__ref.setField ("_returnquantityvalue" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_dialogquantityvalue" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 3270;BA.debugLine="CallSub3(activ, \"QuantityDialogReturn\", code, Re";
Debug.ShouldStop(32);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("QuantityDialogReturn")),(Object)((_code)),(Object)((__ref.getField(true,"_returnquantityvalue" /*RemoteObject*/ ))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 3273;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _getuserregistomanualjornada(RemoteObject __ref,RemoteObject _activ,RemoteObject _reasons,RemoteObject _causes,RemoteObject _tipodialogo) throws Exception{
try {
		Debug.PushSubsStack("getuserRegistoManualJornada (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2951);
if (RapidSub.canDelegate("getuserregistomanualjornada")) { __ref.runUserSub(false, "appdialogs","getuserregistomanualjornada", __ref, _activ, _reasons, _causes, _tipodialogo); return;}
ResumableSub_getuserRegistoManualJornada rsub = new ResumableSub_getuserRegistoManualJornada(null,__ref,_activ,_reasons,_causes,_tipodialogo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getuserRegistoManualJornada extends BA.ResumableSub {
public ResumableSub_getuserRegistoManualJornada(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _reasons,RemoteObject _causes,RemoteObject _tipodialogo) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._reasons = _reasons;
this._causes = _causes;
this._tipodialogo = _tipodialogo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _reasons;
RemoteObject _causes;
RemoteObject _tipodialogo;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
int step12;
int limit12;
int step16;
int limit16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getuserRegistoManualJornada (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2951);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("reasons", _reasons);
Debug.locals.put("causes", _causes);
Debug.locals.put("TipoDialogo", _tipodialogo);
 BA.debugLineNum = 2953;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Registo";
Debug.ShouldStop(256);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Registo Manual de Jornada")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2955;BA.debugLine="Log(TipoDialogo)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","677201412",BA.NumberToString(_tipodialogo),0);
 BA.debugLineNum = 2957;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(4096);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2958;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2959;BA.debugLine="ApplDialog.SetSize(1000dip, 750dip)";
Debug.ShouldStop(16384);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 750)))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2961;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2963;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getuserregistomanualjornada"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2964;BA.debugLine="pnl.LoadLayout(\"dialog_registo_manual_jornada\")";
Debug.ShouldStop(524288);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_registo_manual_jornada")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2966;BA.debugLine="DialogReqCauseRMJ.DropdownBackgroundColor = Const";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialogreqcausermj" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2967;BA.debugLine="For i = 0 To causes.Size-1";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//for
this.state = 10;
step12 = 1;
limit12 = RemoteObject.solve(new RemoteObject[] {_causes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 23;
 BA.debugLineNum = 2968;BA.debugLine="DialogReqCauseRMJ.Add( causes.Get(i) )";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialogreqcausermj" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_causes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2971;BA.debugLine="DialogReqReasonRMJ.DropdownBackgroundColor = Cons";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dialogreqreasonrmj" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2972;BA.debugLine="For i = 0 To reasons.Size-1";
Debug.ShouldStop(134217728);
if (true) break;

case 11:
//for
this.state = 14;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_reasons.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 25;
 BA.debugLineNum = 2973;BA.debugLine="DialogReqReasonRMJ.Add( reasons.Get(i) )";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialogreqreasonrmj" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_reasons.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2976;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",parent._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 2978;BA.debugLine="DialogReqDateRMJ.text = DateTime.Date(DateTime.No";
Debug.ShouldStop(2);
__ref.getField(false,"_dialogreqdatermj" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 2979;BA.debugLine="DialogReqTimeRMJ.text = DateTime.Time(DateTime.No";
Debug.ShouldStop(4);
__ref.getField(false,"_dialogreqtimermj" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 2981;BA.debugLine="DialogReqStartDate.text = DateTime.Date(DateTime.";
Debug.ShouldStop(16);
__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 2982;BA.debugLine="DialogReqEndDate.text = DateTime.Date(DateTime.No";
Debug.ShouldStop(32);
__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 2984;BA.debugLine="DialogReqStartTime.text = DateTime.Time(DateTime.";
Debug.ShouldStop(128);
__ref.getField(false,"_dialogreqstarttime" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 2985;BA.debugLine="DialogReqEndTime.text = DateTime.Time(DateTime.No";
Debug.ShouldStop(256);
__ref.getField(false,"_dialogreqendtime" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 2987;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getuserregistomanualjornada"), _sf);
this.state = 26;
return;
case 26:
//C
this.state = 15;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2988;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 2989;BA.debugLine="CallSub2(activ, \"MakeUnavailable2\", Types.MakeUn";
Debug.ShouldStop(4096);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("MakeUnavailable2")),(Object)((parent._types.runMethod(false,"_makeunavailable2" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqreasonrmj" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_dialogreqreasonrmj" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")))),(Object)(__ref.getField(false,"_dialogreqcausermj" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_dialogreqcausermj" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))))))));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2992;BA.debugLine="CallSub(activ, \"CancelUnavailable\")";
Debug.ShouldStop(32768);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activ),(Object)(RemoteObject.createImmutable("CancelUnavailable")));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 2994;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _getuserunavailabledialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _durations,RemoteObject _reasons) throws Exception{
try {
		Debug.PushSubsStack("getUserUnavailableDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3005);
if (RapidSub.canDelegate("getuserunavailabledialog")) { __ref.runUserSub(false, "appdialogs","getuserunavailabledialog", __ref, _activ, _durations, _reasons); return;}
ResumableSub_getUserUnavailableDialog rsub = new ResumableSub_getUserUnavailableDialog(null,__ref,_activ,_durations,_reasons);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getUserUnavailableDialog extends BA.ResumableSub {
public ResumableSub_getUserUnavailableDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _durations,RemoteObject _reasons) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._durations = _durations;
this._reasons = _reasons;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _durations;
RemoteObject _reasons;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
int step11;
int limit11;
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getUserUnavailableDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3005);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("durations", _durations);
Debug.locals.put("reasons", _reasons);
 BA.debugLineNum = 3006;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Indispon";
Debug.ShouldStop(536870912);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Indisponibilidade")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3008;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(-2147483648);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3009;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3010;BA.debugLine="ApplDialog.SetSize(1000dip, 430dip)";
Debug.ShouldStop(2);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 430)))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3012;BA.debugLine="ApplDialog.SetSize(95%x, 95%y)";
Debug.ShouldStop(8);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3014;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getuserunavailabledialog"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3015;BA.debugLine="pnl.LoadLayout(\"dialog_userUnavailable\") '_device";
Debug.ShouldStop(64);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_userUnavailable")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3017;BA.debugLine="DialogReqType.DropdownBackgroundColor = Consts.Co";
Debug.ShouldStop(256);
__ref.getField(false,"_dialogreqtype" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 3018;BA.debugLine="For i = 0 To durations.Size-1";
Debug.ShouldStop(512);
if (true) break;

case 7:
//for
this.state = 10;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {_durations.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 23;
 BA.debugLineNum = 3019;BA.debugLine="DialogReqType.Add( durations.Get(i) )";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialogreqtype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_durations.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3021;BA.debugLine="DialogReqReason.DropdownBackgroundColor = Consts.";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialogreqreason" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 3022;BA.debugLine="For i = 0 To reasons.Size-1";
Debug.ShouldStop(8192);
if (true) break;

case 11:
//for
this.state = 14;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_reasons.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 25;
 BA.debugLineNum = 3023;BA.debugLine="DialogReqReason.Add( reasons.Get(i) )";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialogreqreason" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_reasons.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3026;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(131072);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",parent._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3027;BA.debugLine="DialogReqStartDate.text = DateTime.Date(DateTime.";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 3028;BA.debugLine="DialogReqEndDate.text = DateTime.Date(DateTime.No";
Debug.ShouldStop(524288);
__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 3030;BA.debugLine="DialogReqStartTime.text = DateTime.Time(DateTime.";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialogreqstarttime" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 3031;BA.debugLine="DialogReqEndTime.text = DateTime.Time(DateTime.No";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialogreqendtime" /*RemoteObject*/ ).runMethod(true,"setText",(parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 3033;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getuserunavailabledialog"), _sf);
this.state = 26;
return;
case 26:
//C
this.state = 15;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3034;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(33554432);
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 3035;BA.debugLine="CallSub2(activ, \"MakeUnavailable\", _ 				Types.M";
Debug.ShouldStop(67108864);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("MakeUnavailable")),(Object)((parent._types.runMethod(false,"_makeunavailable" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dialogreqstartdate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqenddate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dialogreqreason" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_dialogreqreason" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))))))));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 3039;BA.debugLine="CallSub(activ, \"CancelUnavailable\")";
Debug.ShouldStop(1073741824);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activ),(Object)(RemoteObject.createImmutable("CancelUnavailable")));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 3042;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _getvehicleslistdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("getVehiclesListDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2294);
if (RapidSub.canDelegate("getvehicleslistdialog")) { __ref.runUserSub(false, "appdialogs","getvehicleslistdialog", __ref, _activ, _activname, _title, _items); return;}
ResumableSub_getVehiclesListDialog rsub = new ResumableSub_getVehiclesListDialog(null,__ref,_activ,_activname,_title,_items);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getVehiclesListDialog extends BA.ResumableSub {
public ResumableSub_getVehiclesListDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activname,RemoteObject _title,RemoteObject _items) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activname = _activname;
this._title = _title;
this._items = _items;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _activname;
RemoteObject _title;
RemoteObject _items;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _row = 0;
RemoteObject _vehiclename = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int step11;
int limit11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getVehiclesListDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2294);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("activName", _activname);
Debug.locals.put("title", _title);
Debug.locals.put("items", _items);
 BA.debugLineNum = 2295;BA.debugLine="ThisActivity = activ";
Debug.ShouldStop(4194304);
__ref.setField ("_thisactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 2296;BA.debugLine="ThisActivityName = activName";
Debug.ShouldStop(8388608);
__ref.setField ("_thisactivityname" /*RemoteObject*/ ,_activname);
 BA.debugLineNum = 2299;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
Debug.ShouldStop(67108864);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2301;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(268435456);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2302;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2303;BA.debugLine="ApplDialog.SetSize(80%x, 80%y)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2305;BA.debugLine="CurrentCLD = ApplDialog 'sf";
Debug.ShouldStop(1);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_appldialog" /*RemoteObject*/ ));
 BA.debugLineNum = 2306;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getvehicleslistdialog"), null);
this.state = 15;
return;
case 15:
//C
this.state = 5;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 2307;BA.debugLine="DialogPanel.LoadLayout(\"dialog_vehiclesListltems\"";
Debug.ShouldStop(4);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_vehiclesListltems")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2308;BA.debugLine="For Row = 0 To items.RowCount-1";
Debug.ShouldStop(8);
if (true) break;

case 5:
//for
this.state = 8;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
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
Debug.locals.put("Row", _row);
if (true) break;

case 7:
//C
this.state = 17;
 BA.debugLineNum = 2309;BA.debugLine="items.Position = Row";
Debug.ShouldStop(16);
_items.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 2311;BA.debugLine="Dim VehicleName As String = items.GetString(\"tit";
Debug.ShouldStop(64);
_vehiclename = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title_import")));Debug.locals.put("VehicleName", _vehiclename);Debug.locals.put("VehicleName", _vehiclename);
 BA.debugLineNum = 2312;BA.debugLine="Dim tagcode As String = items.GetString(\"tagcode";
Debug.ShouldStop(128);
_tagcode = _items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 2313;BA.debugLine="VIDialog.Add(createVehicleItem(activ, VehicleNam";
Debug.ShouldStop(256);
__ref.getField(false,"_vidialog" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createvehicleitem" /*RemoteObject*/ ,(Object)(_activ),(Object)(_vehiclename),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(_tagcode)).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 2316;BA.debugLine="items.close";
Debug.ShouldStop(2048);
_items.runVoidMethod ("Close");
 BA.debugLineNum = 2319;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "getvehicleslistdialog"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2320;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
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
 BA.debugLineNum = 2327;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "appdialogs","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 328;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 332;BA.debugLine="ThisStartDate.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_thisstartdate" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2search1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("label2search1_click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2816);
if (RapidSub.canDelegate("label2search1_click")) { return __ref.runUserSub(false, "appdialogs","label2search1_click", __ref);}
RemoteObject _textbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 2816;BA.debugLine="Sub label2search1_click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2817;BA.debugLine="Dim TextBox As B4XView = Sender";
Debug.ShouldStop(1);
_textbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_textbox = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("TextBox", _textbox);
 BA.debugLineNum = 2818;BA.debugLine="lblSearchChoosenItem.Text = TextBox.Text";
Debug.ShouldStop(2);
__ref.getField(false,"_lblsearchchoosenitem" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_textbox.runMethod(true,"getText")));
 BA.debugLineNum = 2819;BA.debugLine="ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = lblSear";
Debug.ShouldStop(4);
appdialogs._sharecode._item_returned_from_searchlist /*RemoteObject*/  = __ref.getField(false,"_lblsearchchoosenitem" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 2820;BA.debugLine="ShareCode.TAG_RETURNED_FROM_SEARCHLIST = TextBox.";
Debug.ShouldStop(8);
appdialogs._sharecode._tag_returned_from_searchlist /*RemoteObject*/  = BA.ObjectToString(_textbox.runMethod(false,"getTag"));
 BA.debugLineNum = 2821;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _leftpreviewimage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("leftPreviewImage_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1090);
if (RapidSub.canDelegate("leftpreviewimage_click")) { return __ref.runUserSub(false, "appdialogs","leftpreviewimage_click", __ref);}
RemoteObject _currentimage = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._imageviewdata");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 1090;BA.debugLine="Sub leftPreviewImage_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1091;BA.debugLine="If (CurrentPosition > 0) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean(">",__ref.getField(true,"_currentposition" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1092;BA.debugLine="CurrentPosition = CurrentPosition -1";
Debug.ShouldStop(8);
__ref.setField ("_currentposition" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentposition" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 1093;BA.debugLine="Dim CurrentImage As ImageViewData = CurrentImage";
Debug.ShouldStop(16);
_currentimage = (__ref.getField(false,"_currentimagesview" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentposition" /*RemoteObject*/ ))));Debug.locals.put("CurrentImage", _currentimage);Debug.locals.put("CurrentImage", _currentimage);
 BA.debugLineNum = 1095;BA.debugLine="If Utils.NNE(CurrentImage.b64) Then";
Debug.ShouldStop(64);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"b64" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1096;BA.debugLine="ShowImageView.SetBackgroundImage(Utils.B64ToBit";
Debug.ShouldStop(128);
__ref.getField(false,"_showimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((appdialogs._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"b64" /*RemoteObject*/ ))).getObject())));
 }else 
{ BA.debugLineNum = 1097;BA.debugLine="Else if Utils.NNE(CurrentImage.filename) Then";
Debug.ShouldStop(256);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"filename" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1098;BA.debugLine="Dim bg As Bitmap = LoadBitmapResize(Starter.Int";
Debug.ShouldStop(512);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bg = appdialogs.__c.runMethod(false,"LoadBitmapResize",(Object)(appdialogs._starter._internalfolder /*RemoteObject*/ ),(Object)(_currentimage.getField(true,"filename" /*RemoteObject*/ )),(Object)(appdialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 780)))),(Object)(appdialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 620)))),(Object)(appdialogs.__c.getField(true,"True")));Debug.locals.put("bg", _bg);Debug.locals.put("bg", _bg);
 BA.debugLineNum = 1099;BA.debugLine="ShowImageView.SetBackgroundImage(bg)";
Debug.ShouldStop(1024);
__ref.getField(false,"_showimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((_bg.getObject())));
 }else {
 BA.debugLineNum = 1101;BA.debugLine="CurrentPosition = CurrentPosition +1";
Debug.ShouldStop(4096);
__ref.setField ("_currentposition" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentposition" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 }}
;
 };
 BA.debugLineNum = 1104;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lista2search_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Lista2Search_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2734);
if (RapidSub.canDelegate("lista2search_itemclick")) { return __ref.runUserSub(false, "appdialogs","lista2search_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2734;BA.debugLine="Sub Lista2Search_ItemClick (Index As Int, Value As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2735;BA.debugLine="lblSearchChoosenItem.Text = Value";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblsearchchoosenitem" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 2736;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lista2search_reachend(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Lista2Search_ReachEnd (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2698);
if (RapidSub.canDelegate("lista2search_reachend")) { return __ref.runUserSub(false, "appdialogs","lista2search_reachend", __ref);}
RemoteObject _passscriptwithlimit = RemoteObject.createImmutable("");
RemoteObject _records2search = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _listline_key = RemoteObject.createImmutable("");
int _i = 0;
 BA.debugLineNum = 2698;BA.debugLine="Sub Lista2Search_ReachEnd";
Debug.ShouldStop(512);
 BA.debugLineNum = 2700;BA.debugLine="Dim PassScriptwithLimit As String = \"\"";
Debug.ShouldStop(2048);
_passscriptwithlimit = BA.ObjectToString("");Debug.locals.put("PassScriptwithLimit", _passscriptwithlimit);Debug.locals.put("PassScriptwithLimit", _passscriptwithlimit);
 BA.debugLineNum = 2701;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
Debug.ShouldStop(4096);
appdialogs.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(appdialogs._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(appdialogs.__c.getField(true,"False")));
 BA.debugLineNum = 2702;BA.debugLine="If Utils.NNE(ShareCode.CurrentSerchquery) Then";
Debug.ShouldStop(8192);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._sharecode._currentserchquery /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2703;BA.debugLine="NextStartingRow = NextStartingRow + 25";
Debug.ShouldStop(16384);
__ref.setField ("_nextstartingrow" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_nextstartingrow" /*RemoteObject*/ ),RemoteObject.createImmutable(25)}, "+",1, 1));
 BA.debugLineNum = 2704;BA.debugLine="PassScriptwithLimit = ShareCode.CurrentSerchquer";
Debug.ShouldStop(32768);
_passscriptwithlimit = RemoteObject.concat(appdialogs._sharecode._currentserchquery /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" limit 25 offset "),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_nextstartingrow" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))));Debug.locals.put("PassScriptwithLimit", _passscriptwithlimit);
 BA.debugLineNum = 2708;BA.debugLine="Private Records2Search As ResultSet = Starter.Lo";
Debug.ShouldStop(524288);
_records2search = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_records2search = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), appdialogs._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_passscriptwithlimit)));Debug.locals.put("Records2Search", _records2search);
 BA.debugLineNum = 2709;BA.debugLine="Dim ListLine_key As String = \"\"";
Debug.ShouldStop(1048576);
_listline_key = BA.ObjectToString("");Debug.locals.put("ListLine_key", _listline_key);Debug.locals.put("ListLine_key", _listline_key);
 BA.debugLineNum = 2711;BA.debugLine="If Records2Search.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_records2search.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2712;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease";
Debug.ShouldStop(8388608);
appdialogs.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(appdialogs._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(appdialogs.__c.getField(true,"False")));
 BA.debugLineNum = 2714;BA.debugLine="Do While Records2Search.NextRow";
Debug.ShouldStop(33554432);
while (_records2search.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2715;BA.debugLine="For i=0 To Records2Search.ColumnCount -1";
Debug.ShouldStop(67108864);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_records2search.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2716;BA.debugLine="If Records2Search.GetColumnName(i).ToLowerCas";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_records2search.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"toLowerCase"),BA.ObjectToString("tagcode"))) { 
 BA.debugLineNum = 2717;BA.debugLine="ListLine_key =  Records2Search.GetString(Rec";
Debug.ShouldStop(268435456);
_listline_key = _records2search.runMethod(true,"GetString",(Object)(_records2search.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("ListLine_key", _listline_key);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2720;BA.debugLine="Lista2Search.Add(createSearchLineDetail(Passed";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lista2search" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_createsearchlinedetail" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_passedact" /*RemoteObject*/ )),(Object)(_records2search),(Object)(appdialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_listline_key)));
 }
;
 };
 BA.debugLineNum = 2723;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
appdialogs.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2724;BA.debugLine="Records2Search.Close";
Debug.ShouldStop(8);
_records2search.runVoidMethod ("Close");
 };
 BA.debugLineNum = 2726;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
appdialogs.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2728;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lista2search_visiblerangechanged(RemoteObject __ref,RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("Lista2Search_VisibleRangeChanged (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2730);
if (RapidSub.canDelegate("lista2search_visiblerangechanged")) { return __ref.runUserSub(false, "appdialogs","lista2search_visiblerangechanged", __ref, _firstindex, _lastindex);}
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 2730;BA.debugLine="Sub Lista2Search_VisibleRangeChanged (FirstIndex A";
Debug.ShouldStop(512);
 BA.debugLineNum = 2732;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemslist_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListItemsList_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1199);
if (RapidSub.canDelegate("listitemslist_itemclick")) { return __ref.runUserSub(false, "appdialogs","listitemslist_itemclick", __ref, _index, _value);}
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _valid = RemoteObject.createImmutable(false);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1199;BA.debugLine="Sub ListItemsList_ItemClick (Index As Int, Value A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1200;BA.debugLine="ListItemsListClearSelection";
Debug.ShouldStop(32768);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_listitemslistclearselection" /*RemoteObject*/ );
 BA.debugLineNum = 1201;BA.debugLine="Dim pan As B4XView = ListItemsList.GetPanel(Index";
Debug.ShouldStop(65536);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = __ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1203;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
Debug.ShouldStop(262144);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1204;BA.debugLine="lbl.Color = 0x9637FF4B";
Debug.ShouldStop(524288);
_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, 0x9637ff4b));
 BA.debugLineNum = 1205;BA.debugLine="HiddenListItemLabel = lbl.Tag";
Debug.ShouldStop(1048576);
__ref.setField ("_hiddenlistitemlabel" /*RemoteObject*/ ,_lbl.runMethod(false,"getTag"));
 BA.debugLineNum = 1206;BA.debugLine="Dim valid As Boolean = Utils.NNE(HiddenListItemLa";
Debug.ShouldStop(2097152);
_valid = appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_hiddenlistitemlabel" /*RemoteObject*/ ))));Debug.locals.put("valid", _valid);Debug.locals.put("valid", _valid);
 BA.debugLineNum = 1207;BA.debugLine="HiddenListItemTagList = Types.MakeTagListType(lbl";
Debug.ShouldStop(4194304);
__ref.setField ("_hiddenlistitemtaglist" /*RemoteObject*/ ,appdialogs._types.runMethod(false,"_maketaglisttype" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_lbl.runMethod(false,"getTag"))),(Object)(_lbl.runMethod(true,"getText")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1212;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemslistchk_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListItemsListChk_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3661);
if (RapidSub.canDelegate("listitemslistchk_itemclick")) { return __ref.runUserSub(false, "appdialogs","listitemslistchk_itemclick", __ref, _index, _value);}
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _valid = RemoteObject.createImmutable(false);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3661;BA.debugLine="Sub ListItemsListChk_ItemClick (Index As Int, Valu";
Debug.ShouldStop(4096);
 BA.debugLineNum = 3662;BA.debugLine="ListItemsListChkClearSelection";
Debug.ShouldStop(8192);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_listitemslistchkclearselection" /*RemoteObject*/ );
 BA.debugLineNum = 3663;BA.debugLine="Dim pan As B4XView = ListItemsListChk.GetPanel(In";
Debug.ShouldStop(16384);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = __ref.getField(false,"_listitemslistchk" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 3665;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
Debug.ShouldStop(65536);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3666;BA.debugLine="lbl.Color = 0x9637FF4B";
Debug.ShouldStop(131072);
_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, 0x9637ff4b));
 BA.debugLineNum = 3667;BA.debugLine="HiddenListItemLabel = lbl.Tag";
Debug.ShouldStop(262144);
__ref.setField ("_hiddenlistitemlabel" /*RemoteObject*/ ,_lbl.runMethod(false,"getTag"));
 BA.debugLineNum = 3668;BA.debugLine="Dim valid As Boolean = Utils.NNE(HiddenListItemLa";
Debug.ShouldStop(524288);
_valid = appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_hiddenlistitemlabel" /*RemoteObject*/ ))));Debug.locals.put("valid", _valid);Debug.locals.put("valid", _valid);
 BA.debugLineNum = 3669;BA.debugLine="HiddenListItemTagList = Types.MakeTagListType(lbl";
Debug.ShouldStop(1048576);
__ref.setField ("_hiddenlistitemtaglist" /*RemoteObject*/ ,appdialogs._types.runMethod(false,"_maketaglisttype" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_lbl.runMethod(false,"getTag"))),(Object)(_lbl.runMethod(true,"getText")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3670;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).En";
Debug.ShouldStop(2097152);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",_valid);
 BA.debugLineNum = 3671;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemslistchkclearselection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListItemsListChkClearSelection (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1188);
if (RapidSub.canDelegate("listitemslistchkclearselection")) { return __ref.runUserSub(false, "appdialogs","listitemslistchkclearselection", __ref);}
int _n = 0;
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1188;BA.debugLine="Sub ListItemsListChkClearSelection";
Debug.ShouldStop(8);
 BA.debugLineNum = 1189;BA.debugLine="For n=0 To ListItemsListChk.Size-1";
Debug.ShouldStop(16);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listitemslistchk" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step1 > 0 && _n <= limit1) || (step1 < 0 && _n >= limit1) ;_n = ((int)(0 + _n + step1))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 1190;BA.debugLine="Dim pan As B4XView = ListItemsListChk.GetPanel(n";
Debug.ShouldStop(32);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = __ref.getField(false,"_listitemslistchk" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _n)));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1191;BA.debugLine="If Utils.NNE(pan.tag) Then";
Debug.ShouldStop(64);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_pan.runMethod(false,"getTag")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1192;BA.debugLine="pan.Color = 0xFFFFFFFF";
Debug.ShouldStop(128);
_pan.runMethod(true,"setColor",BA.numberCast(int.class, 0xffffffff));
 BA.debugLineNum = 1193;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
Debug.ShouldStop(256);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1194;BA.debugLine="lbl.Color = 0xFFFFFFFF";
Debug.ShouldStop(512);
_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffffff));
 };
 }
}Debug.locals.put("n", _n);
;
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
public static RemoteObject  _listitemslistclearselection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListItemsListClearSelection (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1177);
if (RapidSub.canDelegate("listitemslistclearselection")) { return __ref.runUserSub(false, "appdialogs","listitemslistclearselection", __ref);}
int _n = 0;
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1177;BA.debugLine="Sub ListItemsListClearSelection";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1178;BA.debugLine="For n=0 To ListItemsList.Size-1";
Debug.ShouldStop(33554432);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step1 > 0 && _n <= limit1) || (step1 < 0 && _n >= limit1) ;_n = ((int)(0 + _n + step1))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 1179;BA.debugLine="Dim pan As B4XView = ListItemsList.GetPanel(n)";
Debug.ShouldStop(67108864);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = __ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _n)));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1180;BA.debugLine="If Utils.NNE(pan.tag) Then";
Debug.ShouldStop(134217728);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_pan.runMethod(false,"getTag")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1181;BA.debugLine="pan.Color = 0xFFFFFFFF";
Debug.ShouldStop(268435456);
_pan.runMethod(true,"setColor",BA.numberCast(int.class, 0xffffffff));
 BA.debugLineNum = 1182;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
Debug.ShouldStop(536870912);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1183;BA.debugLine="lbl.Color = 0xFFFFFFFF";
Debug.ShouldStop(1073741824);
_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffffff));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 1186;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemslistclearselectionview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListItemsListClearSelectionView (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1315);
if (RapidSub.canDelegate("listitemslistclearselectionview")) { return __ref.runUserSub(false, "appdialogs","listitemslistclearselectionview", __ref);}
int _n = 0;
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1315;BA.debugLine="Sub ListItemsListClearSelectionView";
Debug.ShouldStop(4);
 BA.debugLineNum = 1316;BA.debugLine="For n=0 To ListItemsList.Size-1";
Debug.ShouldStop(8);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step1 > 0 && _n <= limit1) || (step1 < 0 && _n >= limit1) ;_n = ((int)(0 + _n + step1))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 1317;BA.debugLine="Dim pan As B4XView = ListItemsList.GetPanel(n)";
Debug.ShouldStop(16);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = __ref.getField(false,"_listitemslist" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _n)));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1318;BA.debugLine="If Utils.NNE(pan.tag) Then";
Debug.ShouldStop(32);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_pan.runMethod(false,"getTag")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1319;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
Debug.ShouldStop(64);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1320;BA.debugLine="lbl.Color = 0xFFFFFFFF";
Debug.ShouldStop(128);
_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffffff));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 1323;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemsrequest_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListItemsRequest_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("listitemsrequest_itemclick")) { return __ref.runUserSub(false, "appdialogs","listitemsrequest_itemclick", __ref, _index, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _oldpnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _oldlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 418;BA.debugLine="Sub ListItemsRequest_ItemClick (Index As Int, Valu";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="Dim pnl As Panel = ListItemsRequest.GetPanel(Inde";
Debug.ShouldStop(4);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_listitemsrequest" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 420;BA.debugLine="Dim lbl As Label = pnl.GetView(0)";
Debug.ShouldStop(8);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 424;BA.debugLine="lbl.Color = Colors.Green   '.SetColorAnimated(250";
Debug.ShouldStop(128);
_lbl.runVoidMethod ("setColor",appdialogs.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 425;BA.debugLine="lbl.Invalidate";
Debug.ShouldStop(256);
_lbl.runVoidMethod ("Invalidate");
 BA.debugLineNum = 426;BA.debugLine="HiddenListItemLabel = lbl.Tag";
Debug.ShouldStop(512);
__ref.setField ("_hiddenlistitemlabel" /*RemoteObject*/ ,_lbl.runMethod(false,"getTag"));
 BA.debugLineNum = 427;BA.debugLine="Dim oldpnl As Panel = ListItemsRequest.GetPanel(L";
Debug.ShouldStop(1024);
_oldpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_oldpnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_listitemsrequest" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_lastindexlist" /*RemoteObject*/ ))).getObject());Debug.locals.put("oldpnl", _oldpnl);
 BA.debugLineNum = 428;BA.debugLine="Dim oldlbl As Label = oldpnl.GetView(0)";
Debug.ShouldStop(2048);
_oldlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_oldlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _oldpnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("oldlbl", _oldlbl);
 BA.debugLineNum = 429;BA.debugLine="oldlbl.Color = Colors.White";
Debug.ShouldStop(4096);
_oldlbl.runVoidMethod ("setColor",appdialogs.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 430;BA.debugLine="oldlbl.Invalidate";
Debug.ShouldStop(8192);
_oldlbl.runVoidMethod ("Invalidate");
 BA.debugLineNum = 431;BA.debugLine="LastIndexList = Index";
Debug.ShouldStop(16384);
__ref.setField ("_lastindexlist" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 432;BA.debugLine="CurrentCLD.GetButton(DialogResponse.POSITIVE).Ena";
Debug.ShouldStop(32768);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(__ref.getField(false,"_hiddenlistitemlabel" /*RemoteObject*/ )))));
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewbluetoothdevices_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewBluetoothDevices_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3574);
if (RapidSub.canDelegate("listviewbluetoothdevices_itemclick")) { return __ref.runUserSub(false, "appdialogs","listviewbluetoothdevices_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3574;BA.debugLine="Sub ListViewBluetoothDevices_ItemClick (Position A";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 3575;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 3576;BA.debugLine="CurrentPrinterConnected = Value";
Debug.ShouldStop(8388608);
__ref.setField ("_currentprinterconnected" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 3577;BA.debugLine="PrinterMessage = \"Impressora Conectada\"";
Debug.ShouldStop(16777216);
__ref.setField ("_printermessage" /*RemoteObject*/ ,BA.ObjectToString("Impressora Conectada"));
 BA.debugLineNum = 3578;BA.debugLine="Printer.ClearBuffer";
Debug.ShouldStop(33554432);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_vvv3");
 BA.debugLineNum = 3579;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(Starter.Inte";
Debug.ShouldStop(67108864);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_bitmap",(Object)(appdialogs.__c.runMethod(false,"LoadBitmap",(Object)(appdialogs._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("logo_monocromatico_mono.png")))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3580;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.BoldOn & \"ER";
Debug.ShouldStop(134217728);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.concat(appdialogs._esc_pos.getField(true,"_vv1"),RemoteObject.createImmutable("ERGUELOP LDA"),appdialogs._esc_pos.getField(true,"_vv4"))));
 BA.debugLineNum = 3581;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal";
Debug.ShouldStop(268435456);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.concat(appdialogs._esc_pos.getField(true,"_fontb_normal"),RemoteObject.createImmutable("Contribuinte: 507601190"),appdialogs._esc_pos.getField(true,"_fonta_normal"))));
 BA.debugLineNum = 3582;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
Debug.ShouldStop(536870912);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_bitmap",(Object)(appdialogs.__c.runMethod(false,"LoadBitmap",(Object)(appdialogs.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("barra_cinza.png")))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3583;BA.debugLine="Printer.AddBuffer_Writeline(\"GUIA DE REMESSA\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("GUIA DE REMESSA")));
 BA.debugLineNum = 3584;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.concat(appdialogs._esc_pos.getField(true,"_fontb_normal"),RemoteObject.createImmutable("Número: XXXXXX      Data: XXXX-XX-XX"),appdialogs._esc_pos.getField(true,"_fonta_normal"))));
 BA.debugLineNum = 3585;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
Debug.ShouldStop(1);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_bitmap",(Object)(appdialogs.__c.runMethod(false,"LoadBitmap",(Object)(appdialogs.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("barra_cinza.png")))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3586;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
Debug.ShouldStop(2);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3587;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
Debug.ShouldStop(4);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_writeline",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3588;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
Debug.ShouldStop(8);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_addbuffer_bitmap",(Object)(appdialogs.__c.runMethod(false,"LoadBitmap",(Object)(appdialogs.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("barra_cinza.png")))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3589;BA.debugLine="Printer.SelectFromMac(Value)";
Debug.ShouldStop(16);
__ref.getField(false,"_printer" /*RemoteObject*/ ).runVoidMethod ("_vvvv7",(Object)(BA.ObjectToString(_value)));
 BA.debugLineNum = 3590;BA.debugLine="File.WriteString(Starter.InternalFolder,$\"defult";
Debug.ShouldStop(32);
appdialogs.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(appdialogs._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("defultprinter.set"))),(Object)(BA.ObjectToString(_value)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 3592;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
appdialogs.__c.runVoidMethod ("LogImpl","679298578",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 3594;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainbutloginconfig_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mainButLoginConfig_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3346);
if (RapidSub.canDelegate("mainbutloginconfig_click")) { return __ref.runUserSub(false, "appdialogs","mainbutloginconfig_click", __ref);}
 BA.debugLineNum = 3346;BA.debugLine="Sub mainButLoginConfig_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 3348;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainbutloginshowpassword_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mainButLoginShowPassword_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3337);
if (RapidSub.canDelegate("mainbutloginshowpassword_click")) { return __ref.runUserSub(false, "appdialogs","mainbutloginshowpassword_click", __ref);}
 BA.debugLineNum = 3337;BA.debugLine="Sub mainButLoginShowPassword_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 3338;BA.debugLine="If (LGO_PasswordMode) Then";
Debug.ShouldStop(512);
if ((__ref.getField(true,"_lgo_passwordmode" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3339;BA.debugLine="LGO_PasswordMode = False";
Debug.ShouldStop(1024);
__ref.setField ("_lgo_passwordmode" /*RemoteObject*/ ,appdialogs.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 3341;BA.debugLine="LGO_PasswordMode = True";
Debug.ShouldStop(4096);
__ref.setField ("_lgo_passwordmode" /*RemoteObject*/ ,appdialogs.__c.getField(true,"True"));
 };
 BA.debugLineNum = 3343;BA.debugLine="mainEditLoginPassword.PasswordMode = LGO_Password";
Debug.ShouldStop(16384);
__ref.getField(false,"_maineditloginpassword" /*RemoteObject*/ ).runVoidMethod ("setPasswordMode",__ref.getField(true,"_lgo_passwordmode" /*RemoteObject*/ ));
 BA.debugLineNum = 3344;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _makeuseravailable(RemoteObject __ref,RemoteObject _activname) throws Exception{
try {
		Debug.PushSubsStack("MakeUserAvailable (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2215);
if (RapidSub.canDelegate("makeuseravailable")) { __ref.runUserSub(false, "appdialogs","makeuseravailable", __ref, _activname); return;}
ResumableSub_MakeUserAvailable rsub = new ResumableSub_MakeUserAvailable(null,__ref,_activname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MakeUserAvailable extends BA.ResumableSub {
public ResumableSub_MakeUserAvailable(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activname) {
this.parent = parent;
this.__ref = __ref;
this._activname = _activname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activname;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeUserAvailable (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2215);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activName", _activname);
 BA.debugLineNum = 2216;BA.debugLine="ProgressDialogShow(ShareCode.userAguardeumMomento";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._useraguardeummomento /*RemoteObject*/ )));
 BA.debugLineNum = 2218;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","675956227",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 2219;BA.debugLine="Log(\"	GRAVA DISPONIBILIDADE\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","675956228",RemoteObject.createImmutable("	GRAVA DISPONIBILIDADE"),0);
 BA.debugLineNum = 2220;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","675956229",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 2221;BA.debugLine="ShareCode.USR_STATE =  1";
Debug.ShouldStop(4096);
parent._sharecode._usr_state /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 2222;BA.debugLine="DBStructures.updateUserAvailableState(ShareCode.S";
Debug.ShouldStop(8192);
parent._dbstructures.runVoidMethod ("_updateuseravailablestate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(parent._sharecode._usr_state /*RemoteObject*/ ));
 BA.debugLineNum = 2224;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32768);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2225;BA.debugLine="params.Initialize";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2226;BA.debugLine="params.Clear";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2227;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2228;BA.debugLine="params.Put(\"_tagcode\", ShareCode.SESS_OPER_User)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 2229;BA.debugLine="params.Put(\"_state\", 1)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_state"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2230;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2231;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2232;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2233;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2234;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2235;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2236;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2237;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","675956246",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 2238;BA.debugLine="Log(\"	CHAMA API\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","675956247",RemoteObject.createImmutable("	CHAMA API"),0);
 BA.debugLineNum = 2239;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","675956248",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 2240;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(-2147483648);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/mobile/user/unavailable")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2241;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2242;BA.debugLine="Utils.CallApi(0, params, activName, Url, \"Window";
Debug.ShouldStop(2);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(_activname),(Object)(_url),(Object)(BA.ObjectToString("WindowStatusUpdate")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2244;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(8);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2245;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(16);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2247;BA.debugLine="Sleep(250)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "makeuseravailable"),BA.numberCast(int.class, 250));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 2249;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2250;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static void  _objecttypelistview_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ObjectTypeListView_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1341);
if (RapidSub.canDelegate("objecttypelistview_itemclick")) { __ref.runUserSub(false, "appdialogs","objecttypelistview_itemclick", __ref, _index, _value); return;}
ResumableSub_ObjectTypeListView_ItemClick rsub = new ResumableSub_ObjectTypeListView_ItemClick(null,__ref,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ObjectTypeListView_ItemClick extends BA.ResumableSub {
public ResumableSub_ObjectTypeListView_ItemClick(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _index;
RemoteObject _value;
int _n = 0;
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
int step1;
int limit1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObjectTypeListView_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1341);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1342;BA.debugLine="For n=0 To ObjectTypeListView.Size-1";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//for
this.state = 4;
step1 = 1;
limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_objecttypelistview" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
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
Debug.locals.put("n", _n);
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1343;BA.debugLine="Dim pan As B4XView = ObjectTypeListView.GetPanel";
Debug.ShouldStop(1073741824);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = __ref.getField(false,"_objecttypelistview" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _n)));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1344;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1345;BA.debugLine="lbl.Color = 0xFFFFFFFF";
Debug.ShouldStop(1);
_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffffff));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 1348;BA.debugLine="Dim pan As B4XView = ObjectTypeListView.GetPanel(";
Debug.ShouldStop(8);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = __ref.getField(false,"_objecttypelistview" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1349;BA.debugLine="Dim lbl As Label = pan.GetView(0)";
Debug.ShouldStop(16);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1350;BA.debugLine="lbl.Color = 0x9637FF4B";
Debug.ShouldStop(32);
_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, 0x9637ff4b));
 BA.debugLineNum = 1351;BA.debugLine="Dim TagCode As String = pan.Tag";
Debug.ShouldStop(64);
_tagcode = BA.ObjectToString(_pan.runMethod(false,"getTag"));Debug.locals.put("TagCode", _tagcode);Debug.locals.put("TagCode", _tagcode);
 BA.debugLineNum = 1352;BA.debugLine="SelectedObjectTypeTagcode = TagCode";
Debug.ShouldStop(128);
__ref.setField ("_selectedobjecttypetagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 1353;BA.debugLine="Sleep(50)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "objecttypelistview_itemclick"),BA.numberCast(int.class, 50));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 1354;BA.debugLine="SelectObjectType(Index)";
Debug.ShouldStop(512);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_selectobjecttype" /*void*/ ,(Object)(_index));
 BA.debugLineNum = 1355;BA.debugLine="CLAObjectTypeSpinner.SelectedIndex = Index";
Debug.ShouldStop(1024);
__ref.getField(false,"_claobjecttypespinner" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_index);
 BA.debugLineNum = 1357;BA.debugLine="objectTypePanel.Visible = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_objecttypepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1358;BA.debugLine="selectObjectPanel.Visible = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_selectobjectpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1359;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _paramitemslist_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ParamItemsList_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,952);
if (RapidSub.canDelegate("paramitemslist_itemclick")) { return __ref.runUserSub(false, "appdialogs","paramitemslist_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 952;BA.debugLine="Sub ParamItemsList_ItemClick (Index As Int, Value";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 955;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_connectedtoprint(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Printer_ConnectedToPrint (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3557);
if (RapidSub.canDelegate("printer_connectedtoprint")) { return __ref.runUserSub(false, "appdialogs","printer_connectedtoprint", __ref, _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 3557;BA.debugLine="Sub Printer_ConnectedToPrint (Success As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 3559;BA.debugLine="If Success Then";
Debug.ShouldStop(64);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3560;BA.debugLine="ButtonPrint.Visible = True";
Debug.ShouldStop(128);
__ref.getField(false,"_buttonprint" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3561;BA.debugLine="ToastMessageShow(PrinterMessage,False)";
Debug.ShouldStop(256);
appdialogs.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(__ref.getField(true,"_printermessage" /*RemoteObject*/ ))),(Object)(appdialogs.__c.getField(true,"False")));
 BA.debugLineNum = 3562;BA.debugLine="ListViewBluetoothDevices.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 3564;BA.debugLine="ButtonPrint.Visible = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_buttonprint" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3565;BA.debugLine="ToastMessageShow(\"Erro ao conectar a Impressora\"";
Debug.ShouldStop(4096);
appdialogs.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Erro ao conectar a Impressora")),(Object)(appdialogs.__c.getField(true,"False")));
 };
 BA.debugLineNum = 3567;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_discoveryfinished(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Printer_DiscoveryFinished (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3548);
if (RapidSub.canDelegate("printer_discoveryfinished")) { return __ref.runUserSub(false, "appdialogs","printer_discoveryfinished", __ref);}
 BA.debugLineNum = 3548;BA.debugLine="Sub Printer_DiscoveryFinished";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 3549;BA.debugLine="Log(\"Search End\")";
Debug.ShouldStop(268435456);
appdialogs.__c.runVoidMethod ("LogImpl","679036417",RemoteObject.createImmutable("Search End"),0);
 BA.debugLineNum = 3550;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_discoverynewprinter(RemoteObject __ref,RemoteObject _printerfound,RemoteObject _deviceclass) throws Exception{
try {
		Debug.PushSubsStack("Printer_DiscoveryNewPrinter (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3538);
if (RapidSub.canDelegate("printer_discoverynewprinter")) { return __ref.runUserSub(false, "appdialogs","printer_discoverynewprinter", __ref, _printerfound, _deviceclass);}
Debug.locals.put("PrinterFound", _printerfound);
Debug.locals.put("DeviceClass", _deviceclass);
 BA.debugLineNum = 3538;BA.debugLine="Sub Printer_DiscoveryNewPrinter (PrinterFound As M";
Debug.ShouldStop(131072);
 BA.debugLineNum = 3540;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 3541;BA.debugLine="Log(\"DEVICE Class:\" & DeviceClass)";
Debug.ShouldStop(1048576);
appdialogs.__c.runVoidMethod ("LogImpl","678970883",RemoteObject.concat(RemoteObject.createImmutable("DEVICE Class:"),_deviceclass),0);
 BA.debugLineNum = 3542;BA.debugLine="ListViewBluetoothDevices.AddSingleLine2(PrinterF";
Debug.ShouldStop(2097152);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_printerfound.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))))),(Object)(_printerfound.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 3544;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
appdialogs.__c.runVoidMethod ("LogImpl","678970886",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 3546;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_discoverynodevicefound(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Printer_DiscoveryNoDeviceFound (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3552);
if (RapidSub.canDelegate("printer_discoverynodevicefound")) { return __ref.runUserSub(false, "appdialogs","printer_discoverynodevicefound", __ref);}
 BA.debugLineNum = 3552;BA.debugLine="Sub Printer_DiscoveryNoDeviceFound";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3553;BA.debugLine="ToastMessageShow(\"Device not found\",True)";
Debug.ShouldStop(1);
appdialogs.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Device not found")),(Object)(appdialogs.__c.getField(true,"True")));
 BA.debugLineNum = 3554;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_listprinterassociated(RemoteObject __ref,RemoteObject _listnameandmac) throws Exception{
try {
		Debug.PushSubsStack("Printer_ListPrinterAssociated (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3521);
if (RapidSub.canDelegate("printer_listprinterassociated")) { return __ref.runUserSub(false, "appdialogs","printer_listprinterassociated", __ref, _listnameandmac);}
int _i = 0;
Debug.locals.put("ListNameAndMac", _listnameandmac);
 BA.debugLineNum = 3521;BA.debugLine="Sub Printer_ListPrinterAssociated (ListNameAndMac";
Debug.ShouldStop(1);
 BA.debugLineNum = 3523;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 3524;BA.debugLine="ListViewBluetoothDevices.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 3525;BA.debugLine="For I=0 To ListNameAndMac.Size-1";
Debug.ShouldStop(16);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_listnameandmac.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 3526;BA.debugLine="ListViewBluetoothDevices.AddSingleLine2(ListNam";
Debug.ShouldStop(32);
__ref.getField(false,"_listviewbluetoothdevices" /*RemoteObject*/ ).runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_listnameandmac.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))),(Object)(_listnameandmac.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 3527;BA.debugLine="Log($\"${ListNameAndMac.GetKeyAt(I)}, ${ListName";
Debug.ShouldStop(64);
appdialogs.__c.runVoidMethod ("LogImpl","678839814",(RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_listnameandmac.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(", "),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_listnameandmac.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(""))),0);
 }
}Debug.locals.put("I", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 3530;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
appdialogs.__c.runVoidMethod ("LogImpl","678839817",BA.ObjectToString(appdialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 3532;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer_sendterminated(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Printer_SendTerminated (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3569);
if (RapidSub.canDelegate("printer_sendterminated")) { return __ref.runUserSub(false, "appdialogs","printer_sendterminated", __ref);}
 BA.debugLineNum = 3569;BA.debugLine="Sub Printer_SendTerminated";
Debug.ShouldStop(65536);
 BA.debugLineNum = 3570;BA.debugLine="Log(\"Finish!!\")";
Debug.ShouldStop(131072);
appdialogs.__c.runVoidMethod ("LogImpl","679233025",RemoteObject.createImmutable("Finish!!"),0);
 BA.debugLineNum = 3572;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetapplication(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetApplication (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1754);
if (RapidSub.canDelegate("resetapplication")) { return __ref.runUserSub(false, "appdialogs","resetapplication", __ref);}
 BA.debugLineNum = 1754;BA.debugLine="Sub ResetApplication";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1756;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rightpreviewimage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("rightPreviewImage_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1106);
if (RapidSub.canDelegate("rightpreviewimage_click")) { return __ref.runUserSub(false, "appdialogs","rightpreviewimage_click", __ref);}
RemoteObject _currentimage = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._imageviewdata");
RemoteObject _bg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 1106;BA.debugLine="Sub rightPreviewImage_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1108;BA.debugLine="If (CurrentPosition < CurrentImagesView.size-1) T";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("<",__ref.getField(true,"_currentposition" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_currentimagesview" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 1109;BA.debugLine="CurrentPosition = CurrentPosition +1";
Debug.ShouldStop(1048576);
__ref.setField ("_currentposition" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentposition" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1110;BA.debugLine="Dim CurrentImage As ImageViewData = CurrentImage";
Debug.ShouldStop(2097152);
_currentimage = (__ref.getField(false,"_currentimagesview" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentposition" /*RemoteObject*/ ))));Debug.locals.put("CurrentImage", _currentimage);Debug.locals.put("CurrentImage", _currentimage);
 BA.debugLineNum = 1112;BA.debugLine="If Utils.NNE(CurrentImage.b64) Then";
Debug.ShouldStop(8388608);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"b64" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1113;BA.debugLine="ShowImageView.SetBackgroundImage(Utils.B64ToBit";
Debug.ShouldStop(16777216);
__ref.getField(false,"_showimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((appdialogs._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"b64" /*RemoteObject*/ ))).getObject())));
 }else 
{ BA.debugLineNum = 1114;BA.debugLine="Else if Utils.NNE(CurrentImage.filename) Then";
Debug.ShouldStop(33554432);
if (appdialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_currentimage.getField(true,"filename" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1115;BA.debugLine="Dim bg As Bitmap = LoadBitmapResize(Starter.Int";
Debug.ShouldStop(67108864);
_bg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bg = appdialogs.__c.runMethod(false,"LoadBitmapResize",(Object)(appdialogs._starter._internalfolder /*RemoteObject*/ ),(Object)(_currentimage.getField(true,"filename" /*RemoteObject*/ )),(Object)(appdialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 780)))),(Object)(appdialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 620)))),(Object)(appdialogs.__c.getField(true,"True")));Debug.locals.put("bg", _bg);Debug.locals.put("bg", _bg);
 BA.debugLineNum = 1116;BA.debugLine="ShowImageView.SetBackgroundImage(bg)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_showimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((_bg.getObject())));
 }else {
 BA.debugLineNum = 1118;BA.debugLine="CurrentPosition = CurrentPosition -1";
Debug.ShouldStop(536870912);
__ref.setField ("_currentposition" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentposition" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 }}
;
 };
 BA.debugLineNum = 1121;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _robutoption_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ROButOption_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,519);
if (RapidSub.canDelegate("robutoption_click")) { return __ref.runUserSub(false, "appdialogs","robutoption_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _val = RemoteObject.createImmutable(0);
 BA.debugLineNum = 519;BA.debugLine="Sub ROButOption_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 520;BA.debugLine="Dim Btn As Button = Sender";
Debug.ShouldStop(128);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("Btn", _btn);
 BA.debugLineNum = 521;BA.debugLine="Dim val As Int = Btn.Tag";
Debug.ShouldStop(256);
_val = BA.numberCast(int.class, _btn.runMethod(false,"getTag"));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 523;BA.debugLine="CallSubDelayed3(ThisActivityName, \"RunRequestOpti";
Debug.ShouldStop(1024);
appdialogs.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_thisactivityname" /*RemoteObject*/ )),(Object)(BA.ObjectToString("RunRequestOption")),(Object)((_val)),(Object)((__ref.getField(false,"_thisrequestdata" /*RemoteObject*/ ))));
 BA.debugLineNum = 524;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(2048);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 BA.debugLineNum = 525;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _robuttonstate(RemoteObject __ref,RemoteObject _posis,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("ROButtonstate (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,527);
if (RapidSub.canDelegate("robuttonstate")) { return __ref.runUserSub(false, "appdialogs","robuttonstate", __ref, _posis, _state);}
Debug.locals.put("posis", _posis);
Debug.locals.put("state", _state);
 BA.debugLineNum = 527;BA.debugLine="Sub ROButtonstate(posis As Int, state As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 528;BA.debugLine="If (posis = 1) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",_posis,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 529;BA.debugLine="ROBut_01.Enabled = state";
Debug.ShouldStop(65536);
__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 530;BA.debugLine="If (state = False) Then ROBut_01.Color = Consts.";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_state,appdialogs.__c.getField(true,"False")))) { 
__ref.getField(false,"_robut_01" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorgray /*RemoteObject*/ );};
 }else 
{ BA.debugLineNum = 531;BA.debugLine="Else If (posis = 2) Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",_posis,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 532;BA.debugLine="ROBut_02.Enabled = state";
Debug.ShouldStop(524288);
__ref.getField(false,"_robut_02" /*RemoteObject*/ ).runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 533;BA.debugLine="If (state = False) Then ROBut_02.Color = Consts.";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",_state,appdialogs.__c.getField(true,"False")))) { 
__ref.getField(false,"_robut_02" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorgray /*RemoteObject*/ );};
 }else 
{ BA.debugLineNum = 534;BA.debugLine="Else If (posis = 3) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",_posis,BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 535;BA.debugLine="ROBut_03.Enabled = state";
Debug.ShouldStop(4194304);
__ref.getField(false,"_robut_03" /*RemoteObject*/ ).runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 536;BA.debugLine="If (state = False) Then ROBut_03.Color = Consts.";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",_state,appdialogs.__c.getField(true,"False")))) { 
__ref.getField(false,"_robut_03" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorgray /*RemoteObject*/ );};
 }else 
{ BA.debugLineNum = 537;BA.debugLine="Else If (posis = 4) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_posis,BA.numberCast(double.class, 4)))) { 
 BA.debugLineNum = 538;BA.debugLine="ROBut_04.Enabled = state";
Debug.ShouldStop(33554432);
__ref.getField(false,"_robut_04" /*RemoteObject*/ ).runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 539;BA.debugLine="If (state = False) Then ROBut_04.Color = Consts.";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_state,appdialogs.__c.getField(true,"False")))) { 
__ref.getField(false,"_robut_04" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorgray /*RemoteObject*/ );};
 }else 
{ BA.debugLineNum = 540;BA.debugLine="Else If (posis = 5) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",_posis,BA.numberCast(double.class, 5)))) { 
 BA.debugLineNum = 541;BA.debugLine="ROBut_05.Enabled = state";
Debug.ShouldStop(268435456);
__ref.getField(false,"_robut_05" /*RemoteObject*/ ).runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 542;BA.debugLine="If (state = False) Then ROBut_05.Color = Consts.";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("=",_state,appdialogs.__c.getField(true,"False")))) { 
__ref.getField(false,"_robut_05" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorgray /*RemoteObject*/ );};
 }else 
{ BA.debugLineNum = 543;BA.debugLine="Else If (posis = 6) Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",_posis,BA.numberCast(double.class, 6)))) { 
 BA.debugLineNum = 544;BA.debugLine="ROBut_06.Enabled = state";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_robut_06" /*RemoteObject*/ ).runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 545;BA.debugLine="If (state = False) Then ROBut_06.Color = Consts.";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",_state,appdialogs.__c.getField(true,"False")))) { 
__ref.getField(false,"_robut_06" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorgray /*RemoteObject*/ );};
 }else 
{ BA.debugLineNum = 546;BA.debugLine="Else If (posis = 7) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_posis,BA.numberCast(double.class, 7)))) { 
 BA.debugLineNum = 547;BA.debugLine="ROBut_07.Enabled = state";
Debug.ShouldStop(4);
__ref.getField(false,"_robut_07" /*RemoteObject*/ ).runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 548;BA.debugLine="If (state = False) Then ROBut_07.Color = Consts.";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",_state,appdialogs.__c.getField(true,"False")))) { 
__ref.getField(false,"_robut_07" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorgray /*RemoteObject*/ );};
 }else 
{ BA.debugLineNum = 549;BA.debugLine="Else If (posis = 8) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",_posis,BA.numberCast(double.class, 8)))) { 
 BA.debugLineNum = 550;BA.debugLine="ROBut_08.Enabled = state";
Debug.ShouldStop(32);
__ref.getField(false,"_robut_08" /*RemoteObject*/ ).runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 551;BA.debugLine="If (state = False) Then ROBut_08.Color = Consts.";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",_state,appdialogs.__c.getField(true,"False")))) { 
__ref.getField(false,"_robut_08" /*RemoteObject*/ ).runVoidMethod ("setColor",appdialogs._consts._colorgray /*RemoteObject*/ );};
 }}}}}}}}
;
 BA.debugLineNum = 554;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _selectobjecttype(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("SelectObjectType (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1386);
if (RapidSub.canDelegate("selectobjecttype")) { __ref.runUserSub(false, "appdialogs","selectobjecttype", __ref, _index); return;}
ResumableSub_SelectObjectType rsub = new ResumableSub_SelectObjectType(null,__ref,_index);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SelectObjectType extends BA.ResumableSub {
public ResumableSub_SelectObjectType(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _index;
RemoteObject _obtindex = RemoteObject.createImmutable(0);
RemoteObject _obgindex = RemoteObject.createImmutable(0);
RemoteObject _obtext = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SelectObjectType (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1386);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("index", _index);
 BA.debugLineNum = 1387;BA.debugLine="CLAObjectDesc.Text = \"\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_claobjectdesc" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1388;BA.debugLine="CLAObjectGroupSpinner.SelectedIndex = 0";
Debug.ShouldStop(2048);
__ref.getField(false,"_claobjectgroupspinner" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1389;BA.debugLine="Dim obtIndex As Int = index";
Debug.ShouldStop(4096);
_obtindex = _index;Debug.locals.put("obtIndex", _obtindex);Debug.locals.put("obtIndex", _obtindex);
 BA.debugLineNum = 1390;BA.debugLine="Dim obgIndex As Int = CLAObjectGroupSpinner.Sele";
Debug.ShouldStop(8192);
_obgindex = __ref.getField(false,"_claobjectgroupspinner" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex");Debug.locals.put("obgIndex", _obgindex);Debug.locals.put("obgIndex", _obgindex);
 BA.debugLineNum = 1391;BA.debugLine="Dim obtext As String = CLAObjectDesc.Text";
Debug.ShouldStop(16384);
_obtext = __ref.getField(false,"_claobjectdesc" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("obtext", _obtext);Debug.locals.put("obtext", _obtext);
 BA.debugLineNum = 1392;BA.debugLine="Dim res As ResumableSub = GetObjectsList(obtInde";
Debug.ShouldStop(32768);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectslist" /*RemoteObject*/ ,(Object)(_obtindex),(Object)(_obgindex),(Object)(_obtext),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1393;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "selectobjecttype"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 1394;BA.debugLine="If(finish) Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1395;BA.debugLine="Log(finish)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","674383369",BA.ObjectToString(_finish),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1397;BA.debugLine="ObjectsListIndex = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_objectslistindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1398;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _setcheckssyncmanual(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetChecksSyncManual (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3856);
if (RapidSub.canDelegate("setcheckssyncmanual")) { return __ref.runUserSub(false, "appdialogs","setcheckssyncmanual", __ref);}
 BA.debugLineNum = 3856;BA.debugLine="Sub SetChecksSyncManual";
Debug.ShouldStop(32768);
 BA.debugLineNum = 3858;BA.debugLine="ShareCode.SYNC_COMPONENTS=\"\"";
Debug.ShouldStop(131072);
appdialogs._sharecode._sync_components /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 3859;BA.debugLine="If ShareCode.SyncManualComponents.IsInitialized T";
Debug.ShouldStop(262144);
if (appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3860;BA.debugLine="ShareCode.SyncManualComponents.Clear";
Debug.ShouldStop(524288);
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 3862;BA.debugLine="ShareCode.SyncManualComponents.Initialize";
Debug.ShouldStop(2097152);
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 3865;BA.debugLine="If sync_manual_chk1.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("1"))));};
 BA.debugLineNum = 3866;BA.debugLine="If sync_manual_chk2.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(33554432);
if (__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("2"))));};
 BA.debugLineNum = 3867;BA.debugLine="If sync_manual_chk3.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(67108864);
if (__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("3"))));};
 BA.debugLineNum = 3868;BA.debugLine="If sync_manual_chk4.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("4"))));};
 BA.debugLineNum = 3869;BA.debugLine="If sync_manual_chk5.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(268435456);
if (__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("5"))));};
 BA.debugLineNum = 3870;BA.debugLine="If sync_manual_chk6.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(536870912);
if (__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("6"))));};
 BA.debugLineNum = 3871;BA.debugLine="If sync_manual_chk7.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(1073741824);
if (__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("7"))));};
 BA.debugLineNum = 3872;BA.debugLine="If sync_manual_chk8.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(-2147483648);
if (__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("8"))));};
 BA.debugLineNum = 3873;BA.debugLine="If sync_manual_chk9.Checked Then ShareCode.SyncMa";
Debug.ShouldStop(1);
if (__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("9"))));};
 BA.debugLineNum = 3874;BA.debugLine="If sync_manual_chk10.Checked Then ShareCode.SyncM";
Debug.ShouldStop(2);
if (__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("10"))));};
 BA.debugLineNum = 3875;BA.debugLine="If sync_manual_chk11.Checked Then ShareCode.SyncM";
Debug.ShouldStop(4);
if (__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("11"))));};
 BA.debugLineNum = 3876;BA.debugLine="If sync_manual_chk12.Checked Then ShareCode.SyncM";
Debug.ShouldStop(8);
if (__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("12"))));};
 BA.debugLineNum = 3878;BA.debugLine="ShareCode.SYNC_COMPONENTS = Utils.List2Str(ShareC";
Debug.ShouldStop(32);
appdialogs._sharecode._sync_components /*RemoteObject*/  = appdialogs._utils.runMethod(true,"_list2str" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._sharecode._syncmanualcomponents /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("|")));
 BA.debugLineNum = 3880;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setresetpwddialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _oldpwd) throws Exception{
try {
		Debug.PushSubsStack("setResetPwdDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2384);
if (RapidSub.canDelegate("setresetpwddialog")) { __ref.runUserSub(false, "appdialogs","setresetpwddialog", __ref, _activ, _oldpwd); return;}
ResumableSub_setResetPwdDialog rsub = new ResumableSub_setResetPwdDialog(null,__ref,_activ,_oldpwd);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_setResetPwdDialog extends BA.ResumableSub {
public ResumableSub_setResetPwdDialog(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _oldpwd) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._oldpwd = _oldpwd;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _activ;
RemoteObject _oldpwd;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("setResetPwdDialog (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2384);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("activ", _activ);
Debug.locals.put("oldPwd", _oldpwd);
 BA.debugLineNum = 2385;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Reset de";
Debug.ShouldStop(65536);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Reset de password")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2387;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(262144);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2388;BA.debugLine="ApplDialog.SetSize(650dip, 350dip)";
Debug.ShouldStop(524288);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 650)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350)))));
 BA.debugLineNum = 2389;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "setresetpwddialog"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2390;BA.debugLine="pnl.LoadLayout(\"dialog_RestePassword_device_2\")";
Debug.ShouldStop(2097152);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_RestePassword_device_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2392;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "setresetpwddialog"), _sf);
this.state = 14;
return;
case 14:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2393;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2394;BA.debugLine="If (mainEditLoginPassword.Text = mainEditLoginPa";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(false,"_maineditloginpassword" /*RemoteObject*/ ).runMethod(true,"getText"),__ref.getField(false,"_maineditloginpasswordconfirm" /*RemoteObject*/ ).runMethod(true,"getText"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",__ref.getField(false,"_maineditloginpassword" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("")))))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 2398;BA.debugLine="CallSub2(activ, \"SetResetPassword\", mainEditLog";
Debug.ShouldStop(536870912);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("SetResetPassword")),(Object)((__ref.getField(false,"_maineditloginpassword" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2400;BA.debugLine="MsgboxAsync(\"As chaves introduzidas não são coi";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("As chaves introduzidas não são coincidentes! Tente novamente ou cancele a operação.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Erro!"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 2401;BA.debugLine="setResetPwdDialog(activ, oldPwd)";
Debug.ShouldStop(1);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_setresetpwddialog" /*void*/ ,(Object)(_activ),(Object)(_oldpwd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2404;BA.debugLine="MsgboxAsync(\"A palavra chave não foi alterada, s";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("A palavra chave não foi alterada, sendo a mesma obrigatória. A aplicação vai fechar.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta!"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 2405;BA.debugLine="CallSub(activ, \"prc_AppClose\")";
Debug.ShouldStop(16);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activ),(Object)(RemoteObject.createImmutable("prc_AppClose")));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2408;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static RemoteObject  _setupdatetbcolor(RemoteObject __ref,RemoteObject _mbutton,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SetUpdateTBColor (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1844);
if (RapidSub.canDelegate("setupdatetbcolor")) { return __ref.runUserSub(false, "appdialogs","setupdatetbcolor", __ref, _mbutton, _checked);}
Debug.locals.put("mButton", _mbutton);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1844;BA.debugLine="Sub SetUpdateTBColor(mButton As ToggleButton, Chec";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1845;BA.debugLine="mButton.Checked = Checked";
Debug.ShouldStop(1048576);
_mbutton.runMethodAndSync(true,"setChecked",_checked);
 BA.debugLineNum = 1846;BA.debugLine="If Checked Then";
Debug.ShouldStop(2097152);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1847;BA.debugLine="mButton.Color = 0xFF818181";
Debug.ShouldStop(4194304);
_mbutton.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff818181));
 }else {
 BA.debugLineNum = 1849;BA.debugLine="mButton.Color = 0xFFC6C6C6";
Debug.ShouldStop(16777216);
_mbutton.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffc6c6c6));
 };
 BA.debugLineNum = 1851;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _suggestobjectbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("suggestObjectButton_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1400);
if (RapidSub.canDelegate("suggestobjectbutton_click")) { return __ref.runUserSub(false, "appdialogs","suggestobjectbutton_click", __ref);}
 BA.debugLineNum = 1400;BA.debugLine="Sub suggestObjectButton_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1402;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_btn_edate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_Btn_edate_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3911);
if (RapidSub.canDelegate("sync_manual_btn_edate_click")) { return __ref.runUserSub(false, "appdialogs","sync_manual_btn_edate_click", __ref);}
RemoteObject _dd = RemoteObject.declareNull("de.donmanfred.DatePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3911;BA.debugLine="Sub sync_manual_Btn_edate_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 3912;BA.debugLine="Dim dd As DatePickerDialog";
Debug.ShouldStop(128);
_dd = RemoteObject.createNew ("de.donmanfred.DatePickerDialogWrapper");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3913;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(256);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3914;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(512);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3915;BA.debugLine="If (sync_manual_edate.EditText.Text  <> \"\") Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("!",__ref.getField(false,"_sync_manual_edate" /*RemoteObject*/ ).runMethod(false,"getEditText").runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3916;BA.debugLine="dnow = DateTime.DateParse(sync_manual_idate.text";
Debug.ShouldStop(2048);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_sync_manual_idate" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3918;BA.debugLine="dd.Initialize(\"CalSynceDate\", DateTime.GetYear(dn";
Debug.ShouldStop(8192);
_dd.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalSynceDate")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_dnow))),(Object)(RemoteObject.solve(new RemoteObject[] {appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_dnow)),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_dnow))));
 BA.debugLineNum = 3919;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
Debug.ShouldStop(16384);
appdialogs.__c.runVoidMethod ("LogImpl","680412680",BA.NumberToString(_dd.runMethod(true,"getAccentColor")),0);
 BA.debugLineNum = 3920;BA.debugLine="dd.show(\"sync_manual_edate\")";
Debug.ShouldStop(32768);
_dd.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("sync_manual_edate")));
 BA.debugLineNum = 3921;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_btn_idate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_Btn_idate_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3898);
if (RapidSub.canDelegate("sync_manual_btn_idate_click")) { return __ref.runUserSub(false, "appdialogs","sync_manual_btn_idate_click", __ref);}
RemoteObject _dd = RemoteObject.declareNull("de.donmanfred.DatePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3898;BA.debugLine="Sub sync_manual_Btn_idate_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3899;BA.debugLine="Dim dd As DatePickerDialog";
Debug.ShouldStop(67108864);
_dd = RemoteObject.createNew ("de.donmanfred.DatePickerDialogWrapper");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3900;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(134217728);
appdialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appdialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3901;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(268435456);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3902;BA.debugLine="If (sync_manual_idate.EditText.Text  <> \"\") Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("!",__ref.getField(false,"_sync_manual_idate" /*RemoteObject*/ ).runMethod(false,"getEditText").runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3903;BA.debugLine="dnow = DateTime.DateParse(sync_manual_idate.text";
Debug.ShouldStop(1073741824);
_dnow = appdialogs.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_sync_manual_idate" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3905;BA.debugLine="dd.Initialize(\"CalSynciDate\", DateTime.GetYear(dn";
Debug.ShouldStop(1);
_dd.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalSynciDate")),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_dnow))),(Object)(RemoteObject.solve(new RemoteObject[] {appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_dnow)),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(appdialogs.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_dnow))));
 BA.debugLineNum = 3907;BA.debugLine="dd.show(\"sync_manual_idate\")";
Debug.ShouldStop(4);
_dd.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("sync_manual_idate")));
 BA.debugLineNum = 3908;BA.debugLine="DataVazia = False";
Debug.ShouldStop(8);
__ref.setField ("_datavazia" /*RemoteObject*/ ,appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3909;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_downloadrunfirstintall_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_downloadrunfirstintall_CheckedChange (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3740);
if (RapidSub.canDelegate("sync_manual_downloadrunfirstintall_checkedchange")) { return __ref.runUserSub(false, "appdialogs","sync_manual_downloadrunfirstintall_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3740;BA.debugLine="Sub sync_manual_downloadrunfirstintall_CheckedChan";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 3741;BA.debugLine="If Checked Then";
Debug.ShouldStop(268435456);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3742;BA.debugLine="sync_manual_chk1.Checked = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3743;BA.debugLine="sync_manual_chk2.Checked = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3744;BA.debugLine="sync_manual_chk3.Checked = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3745;BA.debugLine="sync_manual_chk4.Checked = False";
Debug.ShouldStop(1);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3746;BA.debugLine="sync_manual_chk5.Checked = False";
Debug.ShouldStop(2);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3747;BA.debugLine="sync_manual_chk6.Checked = False";
Debug.ShouldStop(4);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3748;BA.debugLine="sync_manual_chk7.Checked = False";
Debug.ShouldStop(8);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3749;BA.debugLine="sync_manual_chk8.Checked = False";
Debug.ShouldStop(16);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3750;BA.debugLine="sync_manual_chk9.Checked = False";
Debug.ShouldStop(32);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3751;BA.debugLine="sync_manual_chk10.Checked = False";
Debug.ShouldStop(64);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3752;BA.debugLine="sync_manual_chk11.Checked = False";
Debug.ShouldStop(128);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3753;BA.debugLine="sync_manual_chk12.Checked = False";
Debug.ShouldStop(256);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3754;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
Debug.ShouldStop(512);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3755;BA.debugLine="sync_manual_runfirstintall.Checked = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3757;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_others_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_others_CheckedChange (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3673);
if (RapidSub.canDelegate("sync_manual_others_checkedchange")) { return __ref.runUserSub(false, "appdialogs","sync_manual_others_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3673;BA.debugLine="Sub sync_manual_others_CheckedChange(Checked As Bo";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 3674;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fals";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3675;BA.debugLine="sync_manual_runfirstintall.Checked = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3676;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_radio_diaria_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_Radio_diaria_CheckedChange (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3759);
if (RapidSub.canDelegate("sync_manual_radio_diaria_checkedchange")) { return __ref.runUserSub(false, "appdialogs","sync_manual_radio_diaria_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3759;BA.debugLine="Sub sync_manual_Radio_diaria_CheckedChange(Checked";
Debug.ShouldStop(16384);
 BA.debugLineNum = 3760;BA.debugLine="If Checked Then";
Debug.ShouldStop(32768);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3761;BA.debugLine="sync_manual_chk1.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3762;BA.debugLine="sync_manual_chk2.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3763;BA.debugLine="sync_manual_chk3.Enabled = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3764;BA.debugLine="sync_manual_chk4.Enabled = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3765;BA.debugLine="sync_manual_chk5.Enabled = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3766;BA.debugLine="sync_manual_chk6.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3767;BA.debugLine="sync_manual_chk7.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3768;BA.debugLine="sync_manual_chk8.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3769;BA.debugLine="sync_manual_chk9.Enabled = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3770;BA.debugLine="sync_manual_chk10.Enabled = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3771;BA.debugLine="sync_manual_chk11.Enabled = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3772;BA.debugLine="sync_manual_chk12.Enabled = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3773;BA.debugLine="sync_manual_chk_docs_templates.Enabled = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3775;BA.debugLine="sync_manual_chk1.Checked = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3776;BA.debugLine="sync_manual_chk2.Checked = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3777;BA.debugLine="sync_manual_chk3.Checked = False";
Debug.ShouldStop(1);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3778;BA.debugLine="sync_manual_chk4.Checked = False";
Debug.ShouldStop(2);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3779;BA.debugLine="sync_manual_chk5.Checked = False";
Debug.ShouldStop(4);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3780;BA.debugLine="sync_manual_chk6.Checked = False";
Debug.ShouldStop(8);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3781;BA.debugLine="sync_manual_chk7.Checked = False";
Debug.ShouldStop(16);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3782;BA.debugLine="sync_manual_chk8.Checked = False";
Debug.ShouldStop(32);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3783;BA.debugLine="sync_manual_chk9.Checked = False";
Debug.ShouldStop(64);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3784;BA.debugLine="sync_manual_chk10.Checked = False";
Debug.ShouldStop(128);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3785;BA.debugLine="sync_manual_chk11.Checked = False";
Debug.ShouldStop(256);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3786;BA.debugLine="sync_manual_chk12.Checked = False";
Debug.ShouldStop(512);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3787;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3789;BA.debugLine="PanelMestres.Visible = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_panelmestres" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3790;BA.debugLine="sync_manual_runfirstintall.Checked = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3791;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
Debug.ShouldStop(16384);
__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3793;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_radio_mestres_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_Radio_mestres_CheckedChange (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3831);
if (RapidSub.canDelegate("sync_manual_radio_mestres_checkedchange")) { return __ref.runUserSub(false, "appdialogs","sync_manual_radio_mestres_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3831;BA.debugLine="Sub sync_manual_Radio_mestres_CheckedChange(Checke";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 3832;BA.debugLine="If Checked Then";
Debug.ShouldStop(8388608);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3833;BA.debugLine="sync_manual_chk1.Checked = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3834;BA.debugLine="sync_manual_chk2.Checked = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3835;BA.debugLine="sync_manual_chk3.Checked = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3836;BA.debugLine="sync_manual_chk4.Checked = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3837;BA.debugLine="sync_manual_chk5.Checked = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3838;BA.debugLine="sync_manual_chk6.Checked = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3839;BA.debugLine="sync_manual_chk7.Checked = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3840;BA.debugLine="sync_manual_chk8.Checked = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3841;BA.debugLine="sync_manual_chk9.Checked = False";
Debug.ShouldStop(1);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3842;BA.debugLine="sync_manual_chk10.Checked = False";
Debug.ShouldStop(2);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3843;BA.debugLine="sync_manual_chk11.Checked = False";
Debug.ShouldStop(4);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3844;BA.debugLine="sync_manual_chk12.Checked = False";
Debug.ShouldStop(8);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3845;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
Debug.ShouldStop(16);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3847;BA.debugLine="DisclaimerMestres.text = ShareCode.Sync_Disclaim";
Debug.ShouldStop(64);
__ref.getField(false,"_disclaimermestres" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(appdialogs._sharecode._sync_disclaimermestres /*RemoteObject*/ ));
 BA.debugLineNum = 3848;BA.debugLine="PanelMestres.Visible = True";
Debug.ShouldStop(128);
__ref.getField(false,"_panelmestres" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3849;BA.debugLine="sync_manual_runfirstintall.Enabled = True";
Debug.ShouldStop(256);
__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3850;BA.debugLine="sync_manual_downloadrunfirstintall.Enabled = Tru";
Debug.ShouldStop(512);
__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3851;BA.debugLine="sync_manual_runfirstintall.Checked = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3852;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
Debug.ShouldStop(2048);
__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3854;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_radio_seleccao_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_Radio_seleccao_CheckedChange (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3678);
if (RapidSub.canDelegate("sync_manual_radio_seleccao_checkedchange")) { return __ref.runUserSub(false, "appdialogs","sync_manual_radio_seleccao_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3678;BA.debugLine="Sub sync_manual_Radio_seleccao_CheckedChange(Check";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 3679;BA.debugLine="If Checked Then";
Debug.ShouldStop(1073741824);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3680;BA.debugLine="sync_manual_chk1.Enabled = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3681;BA.debugLine="sync_manual_chk2.Enabled = True";
Debug.ShouldStop(1);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3682;BA.debugLine="sync_manual_chk3.Enabled = True";
Debug.ShouldStop(2);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3683;BA.debugLine="sync_manual_chk4.Enabled = True";
Debug.ShouldStop(4);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3684;BA.debugLine="sync_manual_chk5.Enabled = True";
Debug.ShouldStop(8);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3685;BA.debugLine="sync_manual_chk6.Enabled = True";
Debug.ShouldStop(16);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3686;BA.debugLine="sync_manual_chk7.Enabled = True";
Debug.ShouldStop(32);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3687;BA.debugLine="sync_manual_chk8.Enabled = True";
Debug.ShouldStop(64);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3688;BA.debugLine="sync_manual_chk9.Enabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3689;BA.debugLine="sync_manual_chk10.Enabled = True";
Debug.ShouldStop(256);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3690;BA.debugLine="sync_manual_chk11.Enabled = True";
Debug.ShouldStop(512);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3691;BA.debugLine="sync_manual_chk12.Enabled = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3692;BA.debugLine="sync_manual_chk_docs_templates.Enabled = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3693;BA.debugLine="sync_manual_runfirstintall.Enabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3694;BA.debugLine="sync_manual_downloadrunfirstintall.Enabled = Tru";
Debug.ShouldStop(8192);
__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3696;BA.debugLine="sync_manual_chk1.Checked = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3697;BA.debugLine="sync_manual_chk2.Checked = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3698;BA.debugLine="sync_manual_chk3.Checked = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3699;BA.debugLine="sync_manual_chk4.Checked = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3700;BA.debugLine="sync_manual_chk5.Checked = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3701;BA.debugLine="sync_manual_chk6.Checked = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3702;BA.debugLine="sync_manual_chk7.Checked = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3703;BA.debugLine="sync_manual_chk8.Checked = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3704;BA.debugLine="sync_manual_chk9.Checked = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3705;BA.debugLine="sync_manual_chk10.Checked = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3706;BA.debugLine="sync_manual_chk11.Checked = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3707;BA.debugLine="sync_manual_chk12.Checked = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3708;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3709;BA.debugLine="PanelMestres.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_panelmestres" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3710;BA.debugLine="sync_manual_runfirstintall.Checked = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3711;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3713;BA.debugLine="If DataVazia Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_datavazia" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3714;BA.debugLine="sync_manual_idate.Text = Utils.GetLastWeekDate";
Debug.ShouldStop(2);
__ref.getField(false,"_sync_manual_idate" /*RemoteObject*/ ).runMethod(true,"setText",(appdialogs._utils.runMethod(true,"_getlastweekdate" /*RemoteObject*/ ,__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 3717;BA.debugLine="sync_manual_edate.Text = Utils.GetCurrentDate";
Debug.ShouldStop(16);
__ref.getField(false,"_sync_manual_edate" /*RemoteObject*/ ).runMethod(true,"setText",(appdialogs._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 3719;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_radio_todos_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_Radio_todos_CheckedChange (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3795);
if (RapidSub.canDelegate("sync_manual_radio_todos_checkedchange")) { return __ref.runUserSub(false, "appdialogs","sync_manual_radio_todos_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3795;BA.debugLine="Sub sync_manual_Radio_todos_CheckedChange(Checked";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3796;BA.debugLine="If Checked Then";
Debug.ShouldStop(524288);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3797;BA.debugLine="sync_manual_chk1.Enabled = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3798;BA.debugLine="sync_manual_chk2.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3799;BA.debugLine="sync_manual_chk3.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3800;BA.debugLine="sync_manual_chk4.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3801;BA.debugLine="sync_manual_chk5.Enabled = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3802;BA.debugLine="sync_manual_chk6.Enabled = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3803;BA.debugLine="sync_manual_chk7.Enabled = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3804;BA.debugLine="sync_manual_chk8.Enabled = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3805;BA.debugLine="sync_manual_chk9.Enabled = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3806;BA.debugLine="sync_manual_chk10.Enabled = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3807;BA.debugLine="sync_manual_chk11.Enabled = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3808;BA.debugLine="sync_manual_chk12.Enabled = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3809;BA.debugLine="sync_manual_chk_docs_templates.Enabled = False";
Debug.ShouldStop(1);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethod(true,"setEnabled",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3811;BA.debugLine="sync_manual_chk1.Checked = True";
Debug.ShouldStop(4);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3812;BA.debugLine="sync_manual_chk2.Checked = True";
Debug.ShouldStop(8);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3813;BA.debugLine="sync_manual_chk3.Checked = True";
Debug.ShouldStop(16);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3814;BA.debugLine="sync_manual_chk4.Checked = True";
Debug.ShouldStop(32);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3815;BA.debugLine="sync_manual_chk5.Checked = True";
Debug.ShouldStop(64);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3816;BA.debugLine="sync_manual_chk6.Checked = True";
Debug.ShouldStop(128);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3817;BA.debugLine="sync_manual_chk7.Checked = True";
Debug.ShouldStop(256);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3818;BA.debugLine="sync_manual_chk8.Checked = True";
Debug.ShouldStop(512);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3819;BA.debugLine="sync_manual_chk9.Checked = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3820;BA.debugLine="sync_manual_chk10.Checked = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3821;BA.debugLine="sync_manual_chk11.Checked = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3822;BA.debugLine="sync_manual_chk12.Checked = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3823;BA.debugLine="sync_manual_chk_docs_templates.Checked = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"True"));
 BA.debugLineNum = 3825;BA.debugLine="PanelMestres.Visible = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_panelmestres" /*RemoteObject*/ ).runMethod(true,"setVisible",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3826;BA.debugLine="sync_manual_runfirstintall.Checked = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_sync_manual_runfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3827;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
Debug.ShouldStop(262144);
__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3829;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sync_manual_runfirstintall_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sync_manual_runfirstintall_CheckedChange (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,3721);
if (RapidSub.canDelegate("sync_manual_runfirstintall_checkedchange")) { return __ref.runUserSub(false, "appdialogs","sync_manual_runfirstintall_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 3721;BA.debugLine="Sub sync_manual_runfirstintall_CheckedChange(Check";
Debug.ShouldStop(256);
 BA.debugLineNum = 3722;BA.debugLine="If Checked Then";
Debug.ShouldStop(512);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3723;BA.debugLine="sync_manual_chk1.Checked = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_sync_manual_chk1" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3724;BA.debugLine="sync_manual_chk2.Checked = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_sync_manual_chk2" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3725;BA.debugLine="sync_manual_chk3.Checked = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_sync_manual_chk3" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3726;BA.debugLine="sync_manual_chk4.Checked = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_sync_manual_chk4" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3727;BA.debugLine="sync_manual_chk5.Checked = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_sync_manual_chk5" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3728;BA.debugLine="sync_manual_chk6.Checked = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_sync_manual_chk6" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3729;BA.debugLine="sync_manual_chk7.Checked = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_sync_manual_chk7" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3730;BA.debugLine="sync_manual_chk8.Checked = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_sync_manual_chk8" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3731;BA.debugLine="sync_manual_chk9.Checked = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_sync_manual_chk9" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3732;BA.debugLine="sync_manual_chk10.Checked = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_sync_manual_chk10" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3733;BA.debugLine="sync_manual_chk11.Checked = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sync_manual_chk11" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3734;BA.debugLine="sync_manual_chk12.Checked = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sync_manual_chk12" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3735;BA.debugLine="sync_manual_chk_docs_templates.Checked = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sync_manual_chk_docs_templates" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 BA.debugLineNum = 3736;BA.debugLine="sync_manual_downloadrunfirstintall.Checked = Fal";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sync_manual_downloadrunfirstintall" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",appdialogs.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3738;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbchangecolor_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("TBChangeColor_CheckedChange (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,1853);
if (RapidSub.canDelegate("tbchangecolor_checkedchange")) { return __ref.runUserSub(false, "appdialogs","tbchangecolor_checkedchange", __ref, _checked);}
RemoteObject _mbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1853;BA.debugLine="Sub TBChangeColor_CheckedChange(Checked As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1854;BA.debugLine="Dim mButton As ToggleButton = Sender";
Debug.ShouldStop(536870912);
_mbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
_mbutton = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("mButton", _mbutton);
 BA.debugLineNum = 1855;BA.debugLine="If Checked Then";
Debug.ShouldStop(1073741824);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1856;BA.debugLine="mButton.Color = 0xFF818181";
Debug.ShouldStop(-2147483648);
_mbutton.runVoidMethod ("setColor",BA.numberCast(int.class, 0xff818181));
 }else {
 BA.debugLineNum = 1858;BA.debugLine="mButton.Color = 0xFFC6C6C6";
Debug.ShouldStop(2);
_mbutton.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffc6c6c6));
 };
 BA.debugLineNum = 1860;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateallflags(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("updateAllFlags (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,728);
if (RapidSub.canDelegate("updateallflags")) { return __ref.runUserSub(false, "appdialogs","updateallflags", __ref);}
 BA.debugLineNum = 728;BA.debugLine="Sub updateAllFlags";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 730;BA.debugLine="ShareCode.DEVICE_ONLY_TECHORUSER 			= Utils.IfNul";
Debug.ShouldStop(33554432);
appdialogs._sharecode._device_only_techoruser /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_ONLY_TECHORUSER"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 731;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ID 			= Utils.IfNul";
Debug.ShouldStop(67108864);
appdialogs._sharecode._device_show_request_id /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_SHOW_REQUEST_ID"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 732;BA.debugLine="ShareCode.DEVICE_PARAM_DATA_CONFIRM 		= Utils.IfN";
Debug.ShouldStop(134217728);
appdialogs._sharecode._device_param_data_confirm /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DATA_CONFIRM"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 733;BA.debugLine="ShareCode.DEVICE_PARAM_AVAILABILITY 		= Utils.IfN";
Debug.ShouldStop(268435456);
appdialogs._sharecode._device_param_availability /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_AVAILABILITY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 734;BA.debugLine="ShareCode.DEVICE_PARAM_FAVORITES 			= Utils.IfNul";
Debug.ShouldStop(536870912);
appdialogs._sharecode._device_param_favorites /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_FAVORITES"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 735;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_REQUEST 		= Utils.If";
Debug.ShouldStop(1073741824);
appdialogs._sharecode._device_param_pause_request /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PAUSE_REQUEST"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 736;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_TECH 			= Utils.IfNu";
Debug.ShouldStop(-2147483648);
appdialogs._sharecode._device_param_pause_tech /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PAUSE_TECH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 737;BA.debugLine="ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION = Uti";
Debug.ShouldStop(1);
appdialogs._sharecode._device_request_upload_onexecution /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_UPLOAD_ONEXECUTION"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 738;BA.debugLine="ShareCode.DEVICE_REQUEST_AUTOUPDT_ONALERT 	= Util";
Debug.ShouldStop(2);
appdialogs._sharecode._device_request_autoupdt_onalert /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_AUTOUPDT_ONALERT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 739;BA.debugLine="ShareCode.DEVICE_AS_SEND_IMMEDIATLY 		= Utils.IfN";
Debug.ShouldStop(4);
appdialogs._sharecode._device_as_send_immediatly /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_AS_SEND_IMMEDIATLY"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 740;BA.debugLine="ShareCode.DEVICE_REQUEST_HIDECANCELED 		= Utils.I";
Debug.ShouldStop(8);
appdialogs._sharecode._device_request_hidecanceled /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_HIDECANCELED"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 741;BA.debugLine="ShareCode.DEVICE_AUTOUPDATE_ONLOGIN 		= Utils.IfN";
Debug.ShouldStop(16);
appdialogs._sharecode._device_autoupdate_onlogin /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_AUTOUPDATE_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 742;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_FIRST 			= Utils.IfN";
Debug.ShouldStop(32);
appdialogs._sharecode._device_auto_expand_first /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_AUTO_EXPAND_FIRST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 743;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_CHECKLIST 		= Utils.";
Debug.ShouldStop(64);
appdialogs._sharecode._device_auto_expand_checklist /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_AUTO_EXPAND_CHECKLIST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 744;BA.debugLine="ShareCode.DEVICE_DEFAULT_ROUTE 				= Utils.IfNull";
Debug.ShouldStop(128);
appdialogs._sharecode._device_default_route /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_DEFAULT_ROUTE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 745;BA.debugLine="ShareCode.DEVICE_AS_INCLUDE_OBS_FIRST 		= Utils.I";
Debug.ShouldStop(256);
appdialogs._sharecode._device_as_include_obs_first /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_AS_INCLUDE_OBS_FIRST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 746;BA.debugLine="ShareCode.DEVICE_PARAM_PRINT_DRAFT 			= Utils.IfN";
Debug.ShouldStop(512);
appdialogs._sharecode._device_param_print_draft /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PRINT_DRAFT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 747;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ROUTE 		= Utils.IfN";
Debug.ShouldStop(1024);
appdialogs._sharecode._device_show_request_route /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_SHOW_REQUEST_ROUTE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 748;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER 		= Utils.IfN";
Debug.ShouldStop(2048);
appdialogs._sharecode._device_request_push_other /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_PUSH_OTHER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 749;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_QUALITY 		= Utils.If";
Debug.ShouldStop(4096);
appdialogs._sharecode._device_param_photo_quality /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_QUALITY")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(90))));
 BA.debugLineNum = 750;BA.debugLine="ShareCode.DEVICE_REOPEN_CHECKLISTS 			= Utils.IfN";
Debug.ShouldStop(8192);
appdialogs._sharecode._device_reopen_checklists /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REOPEN_CHECKLISTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 753;BA.debugLine="ShareCode.DEVICE_REQUEST_SIGNATURE_TRG 		= Utils.";
Debug.ShouldStop(65536);
appdialogs._sharecode._device_request_signature_trg /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SIGNATURE_TRG"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 754;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER_AUTH 	= Utils";
Debug.ShouldStop(131072);
appdialogs._sharecode._device_request_push_other_auth /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_PUSH_OTHER_AUTH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 755;BA.debugLine="ShareCode.DEVICE_PARAM_ORIENTATION 			= Utils.IfN";
Debug.ShouldStop(262144);
appdialogs._sharecode._device_param_orientation /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ORIENTATION"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 756;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE 		= Utils.I";
Debug.ShouldStop(524288);
appdialogs._sharecode._device_param_photo_fontsize /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_FONTSIZE")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(12))));
 BA.debugLineNum = 757;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_HEIGHT 		= Utils.IfN";
Debug.ShouldStop(1048576);
appdialogs._sharecode._device_param_photo_height /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_HEIGHT")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(615))));
 BA.debugLineNum = 758;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_WIDTH 			= Utils.IfN";
Debug.ShouldStop(2097152);
appdialogs._sharecode._device_param_photo_width /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_WIDTH")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(820))));
 BA.debugLineNum = 759;BA.debugLine="ShareCode.DEVICE_REQUEST_CAN_DELETE_OWNED 	= Util";
Debug.ShouldStop(4194304);
appdialogs._sharecode._device_request_can_delete_owned /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_CAN_DELETE_OWNED"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 760;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FILETYPE 		= Utils.I";
Debug.ShouldStop(8388608);
appdialogs._sharecode._device_param_photo_filetype /*RemoteObject*/  = appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_FILETYPE")),(Object)(RemoteObject.createImmutable("value")))),(Object)(RemoteObject.createImmutable("PNG")));
 BA.debugLineNum = 761;BA.debugLine="ShareCode.DEVICE_PARAM_PULL 				= Utils.IfNullOrE";
Debug.ShouldStop(16777216);
appdialogs._sharecode._device_param_pull /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PULL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 762;BA.debugLine="ShareCode.DEVICE_PARAM_ROUTES 				= Utils.IfNullO";
Debug.ShouldStop(33554432);
appdialogs._sharecode._device_param_routes /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ROUTES"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 764;BA.debugLine="ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.I";
Debug.ShouldStop(134217728);
appdialogs._sharecode._device_param_generatereport /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_GENERATEREPORT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 766;BA.debugLine="ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.";
Debug.ShouldStop(536870912);
appdialogs._sharecode._device_param_resync_requests /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_RESYNC_REQUESTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 767;BA.debugLine="ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Uti";
Debug.ShouldStop(1073741824);
appdialogs._sharecode._device_param_runcl_notyperequest /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_RUNCL_NOTYPEREQUEST"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 768;BA.debugLine="ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.If";
Debug.ShouldStop(-2147483648);
appdialogs._sharecode._device_param_foto_evidence /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_FOTO_EVIDENCE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 769;BA.debugLine="ShareCode.DEVICE_PARAM_DRAW_EVIDENCE 		= Utils.If";
Debug.ShouldStop(1);
appdialogs._sharecode._device_param_draw_evidence /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DRAW_EVIDENCE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 771;BA.debugLine="ShareCode.DEVICE_PARAM_SENDREPORT 					= Utils.if";
Debug.ShouldStop(4);
appdialogs._sharecode._device_param_sendreport /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_SENDREPORT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 772;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_OBJECT 			= Util";
Debug.ShouldStop(8);
appdialogs._sharecode._device_param_canchange_object /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_CANCHANGE_OBJECT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 773;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_ENTITY 			= Util";
Debug.ShouldStop(16);
appdialogs._sharecode._device_param_canchange_entity /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_CANCHANGE_ENTITY"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 774;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CANDUPLICATE 		= U";
Debug.ShouldStop(32);
appdialogs._sharecode._device_param_request_canduplicate /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_CANDUPLICATE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 775;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSIGNTO 			= Util";
Debug.ShouldStop(64);
appdialogs._sharecode._device_param_request_assignto /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ASSIGNTO"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 776;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT";
Debug.ShouldStop(128);
appdialogs._sharecode._device_param_request_assto_mustaccept /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 777;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANG";
Debug.ShouldStop(256);
appdialogs._sharecode._device_param_request_infotitle_canchange /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 778;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE";
Debug.ShouldStop(512);
appdialogs._sharecode._device_param_request_cltitle_canchange /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 779;BA.debugLine="ShareCode.DEVICE_PARAM_ADDITIONAL_USERS_REGISTER";
Debug.ShouldStop(1024);
appdialogs._sharecode._device_param_additional_users_register /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ADDITIONAL_USERS_REGISTER"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 780;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY";
Debug.ShouldStop(2048);
appdialogs._sharecode._device_param_login_mustselect_comapny /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 781;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONME";
Debug.ShouldStop(4096);
appdialogs._sharecode._device_param_login_mustselect_environment /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 782;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRST";
Debug.ShouldStop(8192);
appdialogs._sharecode._device_param_login_passwordchange_firsttime /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 783;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL";
Debug.ShouldStop(16384);
appdialogs._sharecode._device_param_login_allow_qrcode_control /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 784;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL";
Debug.ShouldStop(32768);
appdialogs._sharecode._device_param_login_allow_facial_control /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 785;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL";
Debug.ShouldStop(65536);
appdialogs._sharecode._device_param_request_enddate_control /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ENDDATE_CONTROL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 786;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW";
Debug.ShouldStop(131072);
appdialogs._sharecode._device_param_request_enddate_inday_show /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 788;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOWNEWICON_ONALERT 		=";
Debug.ShouldStop(524288);
appdialogs._sharecode._device_request_shownewicon_onalert /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SHOWNEWICON_ONALERT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 789;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST";
Debug.ShouldStop(1048576);
appdialogs._sharecode._device_param_object_allow_new_request /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 790;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL 		=";
Debug.ShouldStop(2097152);
appdialogs._sharecode._device_param_object_allow_view_all /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 791;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSO";
Debug.ShouldStop(4194304);
appdialogs._sharecode._device_param_object_allow_evidence_associate /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 792;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB";
Debug.ShouldStop(8388608);
appdialogs._sharecode._device_param_object_allow_requests_tab /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 793;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUM";
Debug.ShouldStop(16777216);
appdialogs._sharecode._device_param_object_allow_relations_jump /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 794;BA.debugLine="ShareCode.DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE";
Debug.ShouldStop(33554432);
appdialogs._sharecode._device_request_update_server_onclose /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 795;BA.debugLine="ShareCode.DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT 		=";
Debug.ShouldStop(67108864);
appdialogs._sharecode._device_checklist_alldocs_in_object /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 796;BA.debugLine="ShareCode.DEVICE_PARAM_DEFAULT_DATE_PERIOD 			= U";
Debug.ShouldStop(134217728);
appdialogs._sharecode._device_param_default_date_period /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DEFAULT_DATE_PERIOD"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 797;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER 			= U";
Debug.ShouldStop(268435456);
appdialogs._sharecode._device_request_show_date_divider /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SHOW_DATE_DIVIDER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 799;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE 		=";
Debug.ShouldStop(1073741824);
appdialogs._sharecode._device_checklist_svrimgudp_onclose /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 800;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGE";
Debug.ShouldStop(-2147483648);
appdialogs._sharecode._device_checklist_svrimgudp_width_trigger /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 801;BA.debugLine="ShareCode.DEVICE_ASKTOUPDATE_ONLOGIN 				= Utils.";
Debug.ShouldStop(1);
appdialogs._sharecode._device_asktoupdate_onlogin /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_ASKTOUPDATE_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 802;BA.debugLine="ShareCode.DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY";
Debug.ShouldStop(2);
appdialogs._sharecode._device_checklist_include_public_gallery /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 803;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REQUESTS 				= Util";
Debug.ShouldStop(4);
appdialogs._sharecode._device_param_access_requests /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_REQUESTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 804;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REPORTS 				= Utils";
Debug.ShouldStop(8);
appdialogs._sharecode._device_param_access_reports /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_REPORTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 805;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_ALERTS 				= Utils.";
Debug.ShouldStop(16);
appdialogs._sharecode._device_param_access_alerts /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_ALERTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 806;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_OBJECTS 				= Utils";
Debug.ShouldStop(32);
appdialogs._sharecode._device_param_access_objects /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_OBJECTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 807;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_TASKS 				= Utils.i";
Debug.ShouldStop(64);
appdialogs._sharecode._device_param_access_tasks /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_TASKS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 808;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_MYDATA 				= Utils.";
Debug.ShouldStop(128);
appdialogs._sharecode._device_param_access_mydata /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_MYDATA"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 809;BA.debugLine="ShareCode.DEVICE_REQUEST_CUSTOMORDER 				= Utils.";
Debug.ShouldStop(256);
appdialogs._sharecode._device_request_customorder /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_CUSTOMORDER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 811;BA.debugLine="ShareCode.DEVICE_CHECKLIST_STARTON_MYDATA 			= Ut";
Debug.ShouldStop(1024);
appdialogs._sharecode._device_checklist_starton_mydata /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_STARTON_MYDATA"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 812;BA.debugLine="ShareCode.DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP 		=";
Debug.ShouldStop(2048);
appdialogs._sharecode._device_checklist_mydata_docs_ontop /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 814;BA.debugLine="ShareCode.DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND";
Debug.ShouldStop(8192);
appdialogs._sharecode._device_checklist_objectmandatory_onend /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 815;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONE";
Debug.ShouldStop(16384);
appdialogs._sharecode._device_checklist_siganturemandatory_onend /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 816;BA.debugLine="ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE 		= U";
Debug.ShouldStop(32768);
appdialogs._sharecode._device_param_activate_printmodule /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACTIVATE_PRINTMODULE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 817;BA.debugLine="ShareCode.DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGI";
Debug.ShouldStop(65536);
appdialogs._sharecode._device_param_testconnected_print_onlogin /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 818;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOS";
Debug.ShouldStop(131072);
appdialogs._sharecode._device_checklist_autoreturn_after_fotoshot /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 819;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSA";
Debug.ShouldStop(262144);
appdialogs._sharecode._device_checklist_autoreturn_after_subsaction /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 820;BA.debugLine="ShareCode.DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS";
Debug.ShouldStop(524288);
appdialogs._sharecode._device_checklist_copy_asdetails_to_obs /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 821;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNA";
Debug.ShouldStop(1048576);
appdialogs._sharecode._device_checklist_autoreturn_after_signature /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 823;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE = Uti";
Debug.ShouldStop(4194304);
appdialogs._sharecode._device_param_inverted_foto_device /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_INVERTED_FOTO_DEVICE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 824;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE";
Debug.ShouldStop(8388608);
appdialogs._sharecode._device_param_inverted_horiz_foto_device /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 826;BA.debugLine="ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = Uti";
Debug.ShouldStop(33554432);
appdialogs._sharecode._device_report_date_from_checklist /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_REPORT_DATE_FROM_CHECKLIST"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 828;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_START_NEWWAY = Utils";
Debug.ShouldStop(134217728);
appdialogs._sharecode._device_typerequest_start_newway /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_TYPEREQUEST_START_NEWWAY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 829;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY";
Debug.ShouldStop(268435456);
appdialogs._sharecode._device_typerequest_define_start_newway /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 831;BA.debugLine="ShareCode.DEVICE_EMAIL_OLD_MODEL = Utils.ifnullor";
Debug.ShouldStop(1073741824);
appdialogs._sharecode._device_email_old_model /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_EMAIL_OLD_MODEL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 832;BA.debugLine="ShareCode.EmailOldModel = Utils.Int2Bool(ShareCod";
Debug.ShouldStop(-2147483648);
appdialogs._sharecode._emailoldmodel /*RemoteObject*/  = appdialogs._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._sharecode._device_email_old_model /*RemoteObject*/ ));
 BA.debugLineNum = 833;BA.debugLine="ShareCode.DEVICE_SHOW_GLOBAL_SEARCH = Utils.ifnul";
Debug.ShouldStop(1);
appdialogs._sharecode._device_show_global_search /*RemoteObject*/  = BA.numberCast(int.class, appdialogs._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(appdialogs._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DEVICE_SHOW_GLOBAL_SEARCH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 840;BA.debugLine="ShareCode.STS005 = Utils.Int2Bool(ShareCode.DEVIC";
Debug.ShouldStop(128);
appdialogs._sharecode._sts005 /*RemoteObject*/  = appdialogs._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(appdialogs._sharecode._device_request_hidecanceled /*RemoteObject*/ ));
 BA.debugLineNum = 842;BA.debugLine="ShareCode.DEVICE_DEF_FONT_SIZE = ShareCode.DEVICE";
Debug.ShouldStop(512);
appdialogs._sharecode._device_def_font_size /*RemoteObject*/  = appdialogs._sharecode._device_param_photo_fontsize /*RemoteObject*/ ;
 BA.debugLineNum = 843;BA.debugLine="ShareCode.DEVICE_DEF_QUALITY = ShareCode.DEVICE_P";
Debug.ShouldStop(1024);
appdialogs._sharecode._device_def_quality /*RemoteObject*/  = appdialogs._sharecode._device_param_photo_quality /*RemoteObject*/ ;
 BA.debugLineNum = 844;BA.debugLine="ShareCode.DEVICE_DEF_IMG_FILETYPE = ShareCode.DEV";
Debug.ShouldStop(2048);
appdialogs._sharecode._device_def_img_filetype /*RemoteObject*/  = appdialogs._sharecode._device_param_photo_filetype /*RemoteObject*/ ;
 BA.debugLineNum = 845;BA.debugLine="ShareCode.DEVICE_DEF_IMG_WIDTH = ShareCode.DEVICE";
Debug.ShouldStop(4096);
appdialogs._sharecode._device_def_img_width /*RemoteObject*/  = appdialogs._sharecode._device_param_photo_width /*RemoteObject*/ ;
 BA.debugLineNum = 846;BA.debugLine="ShareCode.DEVICE_DEF_IMG_HEIGHT = ShareCode.DEVIC";
Debug.ShouldStop(8192);
appdialogs._sharecode._device_def_img_height /*RemoteObject*/  = appdialogs._sharecode._device_param_photo_height /*RemoteObject*/ ;
 BA.debugLineNum = 847;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatedeallflagsserver(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("updatedeAllFlagsServer (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,849);
if (RapidSub.canDelegate("updatedeallflagsserver")) { __ref.runUserSub(false, "appdialogs","updatedeallflagsserver", __ref); return;}
ResumableSub_updatedeAllFlagsServer rsub = new ResumableSub_updatedeAllFlagsServer(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_updatedeAllFlagsServer extends BA.ResumableSub {
public ResumableSub_updatedeAllFlagsServer(xevolution.vrcg.devdemov2400.appdialogs parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appdialogs parent;
RemoteObject _thiscursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _outstring = RemoteObject.createImmutable("");
int _n = 0;
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _value_state = RemoteObject.createImmutable(0);
RemoteObject _valueout = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
int step4;
int limit4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("updatedeAllFlagsServer (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,849);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 850;BA.debugLine="Dim thisCursor As Cursor = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(131072);
_thiscursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_thiscursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("SELECT tagcode, value_state, ifnull(VALUE, '') AS valueout FROM dta_device_params")))));Debug.locals.put("thisCursor", _thiscursor);
 BA.debugLineNum = 851;BA.debugLine="Dim outString As String = \"\"";
Debug.ShouldStop(262144);
_outstring = BA.ObjectToString("");Debug.locals.put("outString", _outstring);Debug.locals.put("outString", _outstring);
 BA.debugLineNum = 852;BA.debugLine="If thisCursor.RowCount >= 1 Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("g",_thiscursor.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 853;BA.debugLine="For n=0 To thisCursor.RowCount-1";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//for
this.state = 11;
step4 = 1;
limit4 = RemoteObject.solve(new RemoteObject[] {_thiscursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
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
Debug.locals.put("n", _n);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 854;BA.debugLine="thisCursor.Position = n";
Debug.ShouldStop(2097152);
_thiscursor.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 855;BA.debugLine="Dim tagcode As String = thisCursor.GetString(\"t";
Debug.ShouldStop(4194304);
_tagcode = _thiscursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 856;BA.debugLine="Dim value_state As Int = thisCursor.GetInt(\"val";
Debug.ShouldStop(8388608);
_value_state = _thiscursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("value_state")));Debug.locals.put("value_state", _value_state);Debug.locals.put("value_state", _value_state);
 BA.debugLineNum = 857;BA.debugLine="Dim valueout As String = thisCursor.GetString(\"";
Debug.ShouldStop(16777216);
_valueout = _thiscursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("valueout")));Debug.locals.put("valueout", _valueout);Debug.locals.put("valueout", _valueout);
 BA.debugLineNum = 858;BA.debugLine="If (Utils.NNE(outString)) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_outstring))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 859;BA.debugLine="outString = $\"${outString}|\"$";
Debug.ShouldStop(67108864);
_outstring = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_outstring))),RemoteObject.createImmutable("|")));Debug.locals.put("outString", _outstring);
 if (true) break;

case 10:
//C
this.state = 29;
;
 BA.debugLineNum = 861;BA.debugLine="outString = $\"${outString}${tagcode},${value_st";
Debug.ShouldStop(268435456);
_outstring = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_outstring))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable(","),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value_state))),RemoteObject.createImmutable(","),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_valueout))),RemoteObject.createImmutable("")));Debug.locals.put("outString", _outstring);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("n", _n);
;
 if (true) break;
;
 BA.debugLineNum = 865;BA.debugLine="If (Utils.NNE(outString)) Then";
Debug.ShouldStop(1);

case 12:
//if
this.state = 27;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_outstring))).<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 866;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 867;BA.debugLine="params.Initialize";
Debug.ShouldStop(4);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 868;BA.debugLine="params.Clear";
Debug.ShouldStop(8);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 869;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 870;BA.debugLine="params.Put(\"outString\", outString)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("outString"))),(Object)((_outstring)));
 BA.debugLineNum = 871;BA.debugLine="params.Put(\"ACLSessUser\", ShareCode.SESS_OPER_Us";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLSessUser"))),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 872;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 873;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 874;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 875;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 876;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 877;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 878;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 879;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(16384);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/device/params/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 880;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLO";
Debug.ShouldStop(32768);
if (true) break;

case 15:
//if
this.state = 26;
if ((parent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 25;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 881;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(65536);
if (true) break;

case 18:
//if
this.state = 23;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 882;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 884;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(524288);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 885;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
Debug.ShouldStop(1048576);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 23:
//C
this.state = 26;
;
 BA.debugLineNum = 887;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "updatedeallflagsserver"),BA.numberCast(int.class, 250));
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
 BA.debugLineNum = 889;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(16777216);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 890;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(33554432);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 892;BA.debugLine="Sleep(250)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appdialogs", "updatedeallflagsserver"),BA.numberCast(int.class, 250));
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
 BA.debugLineNum = 895;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _validationbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ValidationButton_Click (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,577);
if (RapidSub.canDelegate("validationbutton_click")) { return __ref.runUserSub(false, "appdialogs","validationbutton_click", __ref);}
RemoteObject _curr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _edit = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _sstr = RemoteObject.createImmutable("");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _n = 0;
 BA.debugLineNum = 577;BA.debugLine="Sub ValidationButton_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 578;BA.debugLine="Dim curr As Button = Sender";
Debug.ShouldStop(2);
_curr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_curr = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("curr", _curr);
 BA.debugLineNum = 579;BA.debugLine="Dim pnl As Panel = curr.Parent";
Debug.ShouldStop(4);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _curr.runMethod(false,"getParent"));Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 580;BA.debugLine="Dim edit As EditText = pnl.GetView(0)";
Debug.ShouldStop(8);
_edit = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_edit = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("edit", _edit);
 BA.debugLineNum = 581;BA.debugLine="Dim lbl As Label = pnl.GetView(1)";
Debug.ShouldStop(16);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 582;BA.debugLine="lbl.Text = \"\"";
Debug.ShouldStop(32);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 583;BA.debugLine="Dim ssTr As String = $\"select distinct * from dta";
Debug.ShouldStop(64);
_sstr = (RemoteObject.concat(RemoteObject.createImmutable("select distinct * from dta_objects where (title_import||tagcode||reference) like '%"),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_edit.runMethod(true,"getText").runMethod(true,"trim")))),RemoteObject.createImmutable("%' ")));Debug.locals.put("ssTr", _sstr);Debug.locals.put("ssTr", _sstr);
 BA.debugLineNum = 584;BA.debugLine="Log(ssTr)";
Debug.ShouldStop(128);
appdialogs.__c.runVoidMethod ("LogImpl","672089607",_sstr,0);
 BA.debugLineNum = 586;BA.debugLine="Dim Cursor1 As Cursor = Starter.LocalSQLEVC.ExecQ";
Debug.ShouldStop(512);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), appdialogs._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sstr)));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 588;BA.debugLine="If (Cursor1.RowCount >=1) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("g",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 589;BA.debugLine="For n = 0 To Cursor1.RowCount-1";
Debug.ShouldStop(4096);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step10 > 0 && _n <= limit10) || (step10 < 0 && _n >= limit10) ;_n = ((int)(0 + _n + step10))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 590;BA.debugLine="Cursor1.Position = n";
Debug.ShouldStop(8192);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 591;BA.debugLine="lbl.Text = $\"${lbl.text}<br> ${Cursor1.GetStrin";
Debug.ShouldStop(16384);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl.runMethod(true,"getText")))),RemoteObject.createImmutable("<br> "),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))))),RemoteObject.createImmutable(""),appdialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title_import")))))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("n", _n);
;
 };
 BA.debugLineNum = 594;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(131072);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 595;BA.debugLine="edit.Text = \"\"";
Debug.ShouldStop(262144);
_edit.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 596;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vidialog_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("VIDialog_ItemClick (appdialogs) ","appdialogs",15,__ref.getField(false, "ba"),__ref,2345);
if (RapidSub.canDelegate("vidialog_itemclick")) { return __ref.runUserSub(false, "appdialogs","vidialog_itemclick", __ref, _index, _value);}
RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2345;BA.debugLine="Sub VIDialog_ItemClick (Index As Int, Value As Obj";
Debug.ShouldStop(256);
 BA.debugLineNum = 2346;BA.debugLine="Dim clv As CustomListView = Sender";
Debug.ShouldStop(512);
_clv = (appdialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("clv", _clv);Debug.locals.put("clv", _clv);
 BA.debugLineNum = 2347;BA.debugLine="Dim pan As Panel = clv.GetPanel(Index)";
Debug.ShouldStop(1024);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _clv.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pan", _pan);
 BA.debugLineNum = 2348;BA.debugLine="Log(pan.Tag)";
Debug.ShouldStop(2048);
appdialogs.__c.runVoidMethod ("LogImpl","676218371",BA.ObjectToString(_pan.runMethod(false,"getTag")),0);
 BA.debugLineNum = 2349;BA.debugLine="CurrentTagcode = pan.Tag";
Debug.ShouldStop(4096);
__ref.setField ("_currenttagcode" /*RemoteObject*/ ,BA.ObjectToString(_pan.runMethod(false,"getTag")));
 BA.debugLineNum = 2350;BA.debugLine="CallSub3(ThisActivityName, \"ChangeUserVehicle\", M";
Debug.ShouldStop(8192);
appdialogs.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_thisactivityname" /*RemoteObject*/ )),(Object)(BA.ObjectToString("ChangeUserVehicle")),(Object)((__ref.getField(true,"_mastertagcode" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_currenttagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 2351;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(16384);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(appdialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 BA.debugLineNum = 2353;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}