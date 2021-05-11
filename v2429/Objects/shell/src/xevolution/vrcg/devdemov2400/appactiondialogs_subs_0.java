package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class appactiondialogs_subs_0 {


public static void  _addmoreimagestoobject(RemoteObject __ref,RemoteObject _act,RemoteObject _this,RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("AddMoreImagesToObject (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3762);
if (RapidSub.canDelegate("addmoreimagestoobject")) { __ref.runUserSub(false, "appactiondialogs","addmoreimagestoobject", __ref, _act, _this, _list); return;}
ResumableSub_AddMoreImagesToObject rsub = new ResumableSub_AddMoreImagesToObject(null,__ref,_act,_this,_list);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AddMoreImagesToObject extends BA.ResumableSub {
public ResumableSub_AddMoreImagesToObject(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _act,RemoteObject _this,RemoteObject _list) {
this.parent = parent;
this.__ref = __ref;
this._act = _act;
this._this = _this;
this._list = _list;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _act;
RemoteObject _this;
RemoteObject _list;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _photonums0 = RemoteObject.createImmutable(0);
RemoteObject _photonums1 = RemoteObject.createImmutable(0);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _recordrow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _ssqll = RemoteObject.createImmutable("");
RemoteObject _record2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _cdate = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _nrows = RemoteObject.createImmutable(0);
RemoteObject _imagename = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int step31;
int limit31;
int step61;
int limit61;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AddMoreImagesToObject (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3762);
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
Debug.locals.put("act", _act);
Debug.locals.put("this", _this);
Debug.locals.put("list", _list);
 BA.debugLineNum = 3763;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Associar";
Debug.ShouldStop(262144);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Associar Imagens")),(Object)(BA.ObjectToString("Adicionar")),(Object)(parent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3764;BA.debugLine="CurrentActivity = act";
Debug.ShouldStop(524288);
__ref.setField ("_currentactivity" /*RemoteObject*/ ,_act);
 BA.debugLineNum = 3765;BA.debugLine="AssociateImagesCompleteList = list";
Debug.ShouldStop(1048576);
__ref.setField ("_associateimagescompletelist" /*RemoteObject*/ ,_list);
 BA.debugLineNum = 3766;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(2097152);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3767;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 3768;BA.debugLine="ApplDialog.SetSize(100%x, 100%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3770;BA.debugLine="ApplDialog.SetSize(100%x, 100%y)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3773;BA.debugLine="Dim PhotoNums0 As Int = 0";
Debug.ShouldStop(268435456);
_photonums0 = BA.numberCast(int.class, 0);Debug.locals.put("PhotoNums0", _photonums0);Debug.locals.put("PhotoNums0", _photonums0);
 BA.debugLineNum = 3774;BA.debugLine="Dim PhotoNums1 As Int = 1";
Debug.ShouldStop(536870912);
_photonums1 = BA.numberCast(int.class, 1);Debug.locals.put("PhotoNums1", _photonums1);Debug.locals.put("PhotoNums1", _photonums1);
 BA.debugLineNum = 3776;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "addmoreimagestoobject"), _sf);
this.state = 75;
return;
case 75:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3777;BA.debugLine="pnl.LoadLayout(\"dialog_object_image\")";
Debug.ShouldStop(1);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_object_image")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3780;BA.debugLine="Dim RecordRow As Cursor";
Debug.ShouldStop(8);
_recordrow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("RecordRow", _recordrow);
 BA.debugLineNum = 3781;BA.debugLine="Dim tagcode As String = \"\"";
Debug.ShouldStop(16);
_tagcode = BA.ObjectToString("");Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 3782;BA.debugLine="Dim sSQLL As String = $\"select object_tagcode fro";
Debug.ShouldStop(32);
_ssqll = (RemoteObject.concat(RemoteObject.createImmutable("select object_tagcode from dta_requests\n"),RemoteObject.createImmutable("				where tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQLL", _ssqll);Debug.locals.put("sSQLL", _ssqll);
 BA.debugLineNum = 3785;BA.debugLine="AvisoNoImages.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_avisonoimages" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 3787;BA.debugLine="RecordRow = Starter.LocalSQLEVC.ExecQuery(sSQLL)";
Debug.ShouldStop(1024);
_recordrow = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssqll)));
 BA.debugLineNum = 3788;BA.debugLine="Log(sSQLL)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","670975514",_ssqll,0);
 BA.debugLineNum = 3789;BA.debugLine="If RecordRow.RowCount > 0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 38;
if (RemoteObject.solveBoolean(">",_recordrow.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 37;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3791;BA.debugLine="RecordRow.Position = 0";
Debug.ShouldStop(16384);
_recordrow.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3792;BA.debugLine="tagcode = RecordRow.GetString(\"object_tagcode\")";
Debug.ShouldStop(32768);
_tagcode = _recordrow.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("object_tagcode")));Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 3794;BA.debugLine="Private Record2 As Cursor";
Debug.ShouldStop(131072);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 3796;BA.debugLine="Dim SQL As String = $\"select 1 as child, object_";
Debug.ShouldStop(524288);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select 1 as child, object_tagcode as tagcode, image, filename, title, sess_user, created_at\n"),RemoteObject.createImmutable("								from dta_objects_images where object_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and (filename is not null and filename<>'')\n"),RemoteObject.createImmutable("								union\n"),RemoteObject.createImmutable("								select 0 as child, tagcode, image, filename, title_import as title, '' as sess_user, created_at\n"),RemoteObject.createImmutable("								from dta_objects where tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and (filename is not null and filename<>'')\n"),RemoteObject.createImmutable("								order by child")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 3802;BA.debugLine="Log(SQL)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","670975528",_sql,0);
 BA.debugLineNum = 3803;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(67108864);
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 3804;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 10:
//if
this.state = 35;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 34;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3805;BA.debugLine="PhotoNums0 = Record2.RowCount";
Debug.ShouldStop(268435456);
_photonums0 = _record2.runMethod(true,"getRowCount");Debug.locals.put("PhotoNums0", _photonums0);
 BA.debugLineNum = 3806;BA.debugLine="ObjectsImages.Add(CreateAssociateImagesFromObje";
Debug.ShouldStop(536870912);
__ref.getField(false,"_objectsimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createassociateimagesfromobjectpaneltitle" /*RemoteObject*/ ,(Object)(_this),(Object)(RemoteObject.createImmutable("Imagens do Objecto")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3807;BA.debugLine="Dim row As Int = 0";
Debug.ShouldStop(1073741824);
_row = BA.numberCast(int.class, 0);Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 3808;BA.debugLine="For i=0 To Record2.RowCount-1";
Debug.ShouldStop(-2147483648);
if (true) break;

case 13:
//for
this.state = 32;
step31 = 1;
limit31 = RemoteObject.solve(new RemoteObject[] {_record2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 76;
if (true) break;

case 76:
//C
this.state = 32;
if ((step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31)) this.state = 15;
if (true) break;

case 77:
//C
this.state = 76;
_i = ((int)(0 + _i + step31)) ;
Debug.locals.put("i", _i);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3809;BA.debugLine="Record2.Position = i";
Debug.ShouldStop(1);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 3811;BA.debugLine="Dim Filename As String = Utils.IfNullOrEmpty(R";
Debug.ShouldStop(4);
_filename = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("filename")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Filename", _filename);Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 3812;BA.debugLine="If Utils.NNE(Filename) Then";
Debug.ShouldStop(8);
if (true) break;

case 16:
//if
this.state = 31;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 30;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 3813;BA.debugLine="If File.Exists(Starter.InternalFolder, Filena";
Debug.ShouldStop(16);
if (true) break;

case 19:
//if
this.state = 28;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 3814;BA.debugLine="Try";
Debug.ShouldStop(32);
if (true) break;

case 22:
//try
this.state = 27;
this.catchState = 26;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 27;
this.catchState = 26;
 BA.debugLineNum = 3815;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(64);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 3816;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 3817;BA.debugLine="Dim image As String = Base64Con.EncodeFromI";
Debug.ShouldStop(256);
_image = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 3818;BA.debugLine="ObjectsImages.Add(CreateAssociateImagesFrom";
Debug.ShouldStop(512);
__ref.getField(false,"_objectsimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createassociateimagesfromobjectpanel" /*RemoteObject*/ ,(Object)(_this),(Object)(_filename),(Object)(_image),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
 BA.debugLineNum = 3820;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","670975546",parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
 if (true) break;

case 31:
//C
this.state = 77;
;
 if (true) break;
if (true) break;

case 32:
//C
this.state = 35;
Debug.locals.put("i", _i);
;
 if (true) break;

case 34:
//C
this.state = 35;
 if (true) break;

case 35:
//C
this.state = 38;
;
 BA.debugLineNum = 3828;BA.debugLine="Record2.Close";
Debug.ShouldStop(524288);
_record2.runVoidMethod ("Close");
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 3830;BA.debugLine="PhotoNums0 = 0";
Debug.ShouldStop(2097152);
_photonums0 = BA.numberCast(int.class, 0);Debug.locals.put("PhotoNums0", _photonums0);
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 3836;BA.debugLine="Dim cDate As String = Utils.GetLastWeekDate";
Debug.ShouldStop(134217728);
_cdate = parent._utils.runMethod(true,"_getlastweekdate" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("cDate", _cdate);Debug.locals.put("cDate", _cdate);
 BA.debugLineNum = 3838;BA.debugLine="Dim SQL As String = $\"select distinct ifnull(a.ta";
Debug.ShouldStop(536870912);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct ifnull(a.tagcode,'') as tagcode, ifnull(a.title,'') as title,\n"),RemoteObject.createImmutable("			ifnull(a.date_verification,'') as date_verification, a.status_id, a.kind_data, a.id,\n"),RemoteObject.createImmutable("			(select obs from dta_alerts_images where tagcode=a.tagcode) as obs,\n"),RemoteObject.createImmutable("			(select imagename from dta_alerts_images where tagcode=a.tagcode) as imagename\n"),RemoteObject.createImmutable("			from dta_alerts as a\n"),RemoteObject.createImmutable("			where a.alert_visible=1 \n"),RemoteObject.createImmutable("				and a.user_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and a.active=1 \n"),RemoteObject.createImmutable("				and a.date_alert>='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cdate))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 3848;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(128);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 3850;BA.debugLine="Dim nRows As Int = Record.RowCount";
Debug.ShouldStop(512);
_nrows = _record.runMethod(true,"getRowCount");Debug.locals.put("nRows", _nrows);Debug.locals.put("nRows", _nrows);
 BA.debugLineNum = 3851;BA.debugLine="PhotoNums1 = Record.RowCount";
Debug.ShouldStop(1024);
_photonums1 = _record.runMethod(true,"getRowCount");Debug.locals.put("PhotoNums1", _photonums1);
 BA.debugLineNum = 3852;BA.debugLine="If nRows > 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 39:
//if
this.state = 64;
if (RemoteObject.solveBoolean(">",_nrows,BA.numberCast(double.class, 0))) { 
this.state = 41;
}else {
this.state = 63;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 3853;BA.debugLine="ObjectsImages.Add(CreateAssociateImagesFromObjec";
Debug.ShouldStop(4096);
__ref.getField(false,"_objectsimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createassociateimagesfromobjectpaneltitle" /*RemoteObject*/ ,(Object)(_this),(Object)(RemoteObject.createImmutable("Imagens das Tarefas")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3854;BA.debugLine="For row = 0 To Record.RowCount-1";
Debug.ShouldStop(8192);
if (true) break;

case 42:
//for
this.state = 61;
step61 = 1;
limit61 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
Debug.locals.put("row", _row);
this.state = 78;
if (true) break;

case 78:
//C
this.state = 61;
if ((step61 > 0 && _row.<Integer>get().intValue() <= limit61) || (step61 < 0 && _row.<Integer>get().intValue() >= limit61)) this.state = 44;
if (true) break;

case 79:
//C
this.state = 78;
_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step61)) ;
Debug.locals.put("row", _row);
if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 3855;BA.debugLine="Record.Position = row";
Debug.ShouldStop(16384);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 3856;BA.debugLine="Dim imagename As String =  Utils.IfNullOrEmpty(";
Debug.ShouldStop(32768);
_imagename = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("imagename", _imagename);Debug.locals.put("imagename", _imagename);
 BA.debugLineNum = 3857;BA.debugLine="If Utils.NNE(imagename) Then";
Debug.ShouldStop(65536);
if (true) break;

case 45:
//if
this.state = 60;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imagename)).<Boolean>get().booleanValue()) { 
this.state = 47;
}else {
this.state = 59;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 3858;BA.debugLine="If File.Exists(Starter.InternalFolder, imagena";
Debug.ShouldStop(131072);
if (true) break;

case 48:
//if
this.state = 57;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_imagename)).<Boolean>get().booleanValue()) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 3859;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 51:
//try
this.state = 56;
this.catchState = 55;
this.state = 53;
if (true) break;

case 53:
//C
this.state = 56;
this.catchState = 55;
 BA.debugLineNum = 3860;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(524288);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 3861;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 3862;BA.debugLine="Dim image As String = Base64Con.EncodeFromIm";
Debug.ShouldStop(2097152);
_image = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_imagename));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 3863;BA.debugLine="ObjectsImages.Add(CreateAssociateImagesFromO";
Debug.ShouldStop(4194304);
__ref.getField(false,"_objectsimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createassociateimagesfromobjectpanel" /*RemoteObject*/ ,(Object)(_this),(Object)(_imagename),(Object)(_image),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 55:
//C
this.state = 56;
this.catchState = 0;
 BA.debugLineNum = 3865;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","670975591",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 56:
//C
this.state = 57;
this.catchState = 0;
;
 if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
 if (true) break;

case 60:
//C
this.state = 79;
;
 if (true) break;
if (true) break;

case 61:
//C
this.state = 64;
Debug.locals.put("row", _row);
;
 if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 3872;BA.debugLine="PhotoNums1 = 0";
Debug.ShouldStop(-2147483648);
_photonums1 = BA.numberCast(int.class, 0);Debug.locals.put("PhotoNums1", _photonums1);
 if (true) break;

case 64:
//C
this.state = 65;
;
 BA.debugLineNum = 3874;BA.debugLine="Record.Close";
Debug.ShouldStop(2);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 3876;BA.debugLine="If PhotoNums0 = 0 And PhotoNums1 = 0 Then";
Debug.ShouldStop(8);
if (true) break;

case 65:
//if
this.state = 68;
if (RemoteObject.solveBoolean("=",_photonums0,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_photonums1,BA.numberCast(double.class, 0))) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 3877;BA.debugLine="AvisoNoImages.Text = \"Não existem imagens para a";
Debug.ShouldStop(16);
__ref.getField(false,"_avisonoimages" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Não existem imagens para associar !"));
 BA.debugLineNum = 3878;BA.debugLine="AvisoNoImages.Visible = True";
Debug.ShouldStop(32);
__ref.getField(false,"_avisonoimages" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 68:
//C
this.state = 69;
;
 BA.debugLineNum = 3881;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "addmoreimagestoobject"), _sf);
this.state = 80;
return;
case 80:
//C
this.state = 69;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3882;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(512);
if (true) break;

case 69:
//if
this.state = 74;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 71;
}else 
{ BA.debugLineNum = 3884;BA.debugLine="Else If res = DialogResponse.CANCEL Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
this.state = 73;
}}
if (true) break;

case 71:
//C
this.state = 74;
 BA.debugLineNum = 3883;BA.debugLine="SaveImages(this)";
Debug.ShouldStop(1024);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_saveimages" /*RemoteObject*/ ,(Object)(_this));
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 3885;BA.debugLine="CallSub2(CheckList3, \"CamImage2\", this)";
Debug.ShouldStop(4096);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((parent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage2")),(Object)((_this)));
 if (true) break;

case 74:
//C
this.state = -1;
;
 BA.debugLineNum = 3887;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _ashistorylist_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("asHistoryList_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1038);
if (RapidSub.canDelegate("ashistorylist_itemclick")) { return __ref.runUserSub(false, "appactiondialogs","ashistorylist_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1038;BA.debugLine="Sub asHistoryList_ItemClick (Index As Int, Value A";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1039;BA.debugLine="CurrentIndex = Index";
Debug.ShouldStop(16384);
__ref.setField ("_currentindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 1041;BA.debugLine="Log(\"Clicou\")";
Debug.ShouldStop(65536);
appactiondialogs.__c.runVoidMethod ("LogImpl","667436547",RemoteObject.createImmutable("Clicou"),0);
 BA.debugLineNum = 1042;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _associateimageselected(RemoteObject __ref,RemoteObject _imagename) throws Exception{
try {
		Debug.PushSubsStack("AssociateImageSelected (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3913);
if (RapidSub.canDelegate("associateimageselected")) { return __ref.runUserSub(false, "appactiondialogs","associateimageselected", __ref, _imagename);}
Debug.locals.put("imageName", _imagename);
 BA.debugLineNum = 3913;BA.debugLine="Sub AssociateImageSelected(imageName As String) As";
Debug.ShouldStop(256);
 BA.debugLineNum = 3914;BA.debugLine="If AssociateImagesCompleteList.IndexOf(imageName)";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_imagename))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 3915;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return appactiondialogs.__c.getField(true,"True");
 };
 BA.debugLineNum = 3917;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) return appactiondialogs.__c.getField(true,"False");
 BA.debugLineNum = 3918;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _associateobject_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("associateObject_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3573);
if (RapidSub.canDelegate("associateobject_click")) { return __ref.runUserSub(false, "appactiondialogs","associateobject_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _local = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 3573;BA.debugLine="Sub associateObject_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 3574;BA.debugLine="Dim btn As Button = Sender";
Debug.ShouldStop(2097152);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 3575;BA.debugLine="Dim this As RequestCLAItem = btn.tag";
Debug.ShouldStop(4194304);
_this = (_btn.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 3577;BA.debugLine="Dim Local As Int = 1 				'RETORNA AOS ALERTAS TAR";
Debug.ShouldStop(16777216);
_local = BA.numberCast(int.class, 1);Debug.locals.put("Local", _local);Debug.locals.put("Local", _local);
 BA.debugLineNum = 3580;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(134217728);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 3581;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(268435456);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3582;BA.debugLine="Filter.getObjectSelectDialog(CurrentActivity, Thi";
Debug.ShouldStop(536870912);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectselectdialog" /*void*/ ,(Object)(__ref.getField(false,"_currentactivity" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_thisactivityname_tasklistdialog" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Selecção de Objecto")),(Object)(_local));
 BA.debugLineNum = 3584;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnassociateimage_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("btnAssociateImage_StateClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3896);
if (RapidSub.canDelegate("btnassociateimage_stateclick")) { return __ref.runUserSub(false, "appactiondialogs","btnassociateimage_stateclick", __ref, _state);}
RemoteObject _button = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
RemoteObject _imagename = RemoteObject.createImmutable("");
RemoteObject _listviewindex = RemoteObject.createImmutable(0);
RemoteObject _index = RemoteObject.createImmutable(0);
Debug.locals.put("State", _state);
 BA.debugLineNum = 3896;BA.debugLine="Sub btnAssociateImage_StateClick (State As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 3897;BA.debugLine="Dim Button As B4XStateButton = Sender";
Debug.ShouldStop(16777216);
_button = (appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("Button", _button);Debug.locals.put("Button", _button);
 BA.debugLineNum = 3898;BA.debugLine="Dim imageName As String = Button.Tag";
Debug.ShouldStop(33554432);
_imagename = BA.ObjectToString(_button.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ));Debug.locals.put("imageName", _imagename);Debug.locals.put("imageName", _imagename);
 BA.debugLineNum = 3899;BA.debugLine="If State = Consts.ITEM_SELECTED Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_state,BA.numberCast(double.class, appactiondialogs._consts._item_selected /*RemoteObject*/ ))) { 
 BA.debugLineNum = 3900;BA.debugLine="Dim listviewIndex As Int = AssociateImagesComple";
Debug.ShouldStop(134217728);
_listviewindex = __ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_imagename)));Debug.locals.put("listviewIndex", _listviewindex);Debug.locals.put("listviewIndex", _listviewindex);
 BA.debugLineNum = 3901;BA.debugLine="If Not(listviewIndex > -1)  Then";
Debug.ShouldStop(268435456);
if (appactiondialogs.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_listviewindex,BA.numberCast(double.class, -(double) (0 + 1)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3902;BA.debugLine="AssociateImagesList.Add(imageName)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_associateimageslist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_imagename)));
 }else {
 BA.debugLineNum = 3904;BA.debugLine="ToastMessageShow(\"Esta imagem já foi adicionada";
Debug.ShouldStop(-2147483648);
appactiondialogs.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Esta imagem já foi adicionada á lista")),(Object)(appactiondialogs.__c.getField(true,"True")));
 BA.debugLineNum = 3905;BA.debugLine="Button.State = 0";
Debug.ShouldStop(1);
_button.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 };
 }else {
 BA.debugLineNum = 3908;BA.debugLine="Dim index As Int = AssociateImagesList.IndexOf(i";
Debug.ShouldStop(8);
_index = __ref.getField(false,"_associateimageslist" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_imagename)));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 3909;BA.debugLine="AssociateImagesList.RemoveAt(index)";
Debug.ShouldStop(16);
__ref.getField(false,"_associateimageslist" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 };
 BA.debugLineNum = 3911;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancelsign_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCancelSign_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,964);
if (RapidSub.canDelegate("btncancelsign_click")) { return __ref.runUserSub(false, "appactiondialogs","btncancelsign_click", __ref);}
 BA.debugLineNum = 964;BA.debugLine="Sub btnCancelSign_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 965;BA.debugLine="SignatureCapture.Clear(Signature)";
Debug.ShouldStop(16);
appactiondialogs._signaturecapture.runVoidMethod ("_clear" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_signature" /*RemoteObject*/ )));
 BA.debugLineNum = 966;BA.debugLine="SignPanelView.Visible = False";
Debug.ShouldStop(32);
__ref.getField(false,"_signpanelview" /*RemoteObject*/ ).runMethod(true,"setVisible",appactiondialogs.__c.getField(true,"False"));
 BA.debugLineNum = 967;BA.debugLine="PanelSignature.Visible = False";
Debug.ShouldStop(64);
__ref.getField(false,"_panelsignature" /*RemoteObject*/ ).runMethod(true,"setVisible",appactiondialogs.__c.getField(true,"False"));
 BA.debugLineNum = 968;BA.debugLine="takeSignature.Visible = True";
Debug.ShouldStop(128);
__ref.getField(false,"_takesignature" /*RemoteObject*/ ).runMethod(true,"setVisible",appactiondialogs.__c.getField(true,"True"));
 BA.debugLineNum = 969;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclearsign_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnClearSign_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1498);
if (RapidSub.canDelegate("btnclearsign_click")) { return __ref.runUserSub(false, "appactiondialogs","btnclearsign_click", __ref);}
 BA.debugLineNum = 1498;BA.debugLine="Sub btnClearSign_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1499;BA.debugLine="SignatureCapture.Clear(Signature)";
Debug.ShouldStop(67108864);
appactiondialogs._signaturecapture.runVoidMethod ("_clear" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_signature" /*RemoteObject*/ )));
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
public static void  _btnsavesign_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSaveSign_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1368);
if (RapidSub.canDelegate("btnsavesign_click")) { __ref.runUserSub(false, "appactiondialogs","btnsavesign_click", __ref); return;}
ResumableSub_btnSaveSign_Click rsub = new ResumableSub_btnSaveSign_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSaveSign_Click extends BA.ResumableSub {
public ResumableSub_btnSaveSign_Click(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _thisfile = RemoteObject.createImmutable("");
RemoteObject _datetimename = RemoteObject.createImmutable("");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _cvsrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _la = RemoteObject.createImmutable("");
RemoteObject _lo = RemoteObject.createImmutable("");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _drect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _serverlocation = RemoteObject.createImmutable("");
RemoteObject _imginfo = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSaveSign_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1368);
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
 BA.debugLineNum = 1369;BA.debugLine="ProgressDialogShow(\"A processar ...\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("A processar ..."))));
 BA.debugLineNum = 1370;BA.debugLine="Dim thisFile As String = $\"IMG_${CurrentRequestCL";
Debug.ShouldStop(33554432);
_thisfile = (RemoteObject.concat(RemoteObject.createImmutable("IMG_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._utils.runMethod(true,"_getcurrenttimeext2" /*RemoteObject*/ ,__ref.getField(false, "ba"))))),RemoteObject.createImmutable("_Signature.png")));Debug.locals.put("thisFile", _thisfile);Debug.locals.put("thisFile", _thisfile);
 BA.debugLineNum = 1371;BA.debugLine="SignatureCapture.Save(Signature, Starter.Internal";
Debug.ShouldStop(67108864);
parent._signaturecapture.runVoidMethod ("_save" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_signature" /*RemoteObject*/ )),(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_thisfile));
 BA.debugLineNum = 1376;BA.debugLine="Dim DateTimeName As String = Utils.MakeDateTimeSl";
Debug.ShouldStop(-2147483648);
_datetimename = parent._utils.runMethod(true,"_makedatetimeslash2" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("DateTimeName", _datetimename);Debug.locals.put("DateTimeName", _datetimename);
 BA.debugLineNum = 1377;BA.debugLine="Dim cvs As B4XCanvas = CreateCanvas(720dip, 520di";
Debug.ShouldStop(1);
_cvs = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createcanvas" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 720)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 520)))));Debug.locals.put("cvs", _cvs);Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 1378;BA.debugLine="Dim cvsRect As B4XRect";
Debug.ShouldStop(2);
_cvsrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("cvsRect", _cvsrect);
 BA.debugLineNum = 1379;BA.debugLine="cvsRect.Initialize(0,0,720dip, 520dip)";
Debug.ShouldStop(4);
_cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 720))))),(Object)(BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 520))))));
 BA.debugLineNum = 1380;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmap(Starter.InternalFol";
Debug.ShouldStop(8);
_cvs.runVoidMethod ("DrawBitmap",(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmap",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_thisfile)).getObject())),(Object)(_cvsrect));
 BA.debugLineNum = 1381;BA.debugLine="Dim la As String = LocationService.GeoLocal.lat";
Debug.ShouldStop(16);
_la = parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ );Debug.locals.put("la", _la);Debug.locals.put("la", _la);
 BA.debugLineNum = 1382;BA.debugLine="Dim lo As String = LocationService.GeoLocal.lon";
Debug.ShouldStop(32);
_lo = parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ );Debug.locals.put("lo", _lo);Debug.locals.put("lo", _lo);
 BA.debugLineNum = 1383;BA.debugLine="DateTimeName = $\"${DateTimeName}  -  ${la}/${lo}\"";
Debug.ShouldStop(64);
_datetimename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datetimename))),RemoteObject.createImmutable("  -  "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_la))),RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lo))),RemoteObject.createImmutable("")));Debug.locals.put("DateTimeName", _datetimename);
 BA.debugLineNum = 1385;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCod";
Debug.ShouldStop(256);
_f = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, parent._sharecode._device_def_font_size /*RemoteObject*/ )));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 1386;BA.debugLine="Dim dRect As B4XRect";
Debug.ShouldStop(512);
_drect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("dRect", _drect);
 BA.debugLineNum = 1387;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.T";
Debug.ShouldStop(1024);
_drect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350)))}, "+",1, 0))),(Object)(_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight")));
 BA.debugLineNum = 1388;BA.debugLine="Utils.DrawTextWithBorder2(cvs, DateTimeName, f, C";
Debug.ShouldStop(2048);
parent._utils.runVoidMethod ("_drawtextwithborder2" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cvs),(Object)(_datetimename),(Object)(_f),(Object)(parent._consts._colordarkgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getLeft"),_drect.runMethod(true,"getRight")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getTop"),_drect.runMethod(true,"getBottom")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1390;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(8192);
_cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 1391;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(Starter";
Debug.ShouldStop(16384);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_thisfile),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("Out", _out);Debug.locals.put("Out", _out);
 BA.debugLineNum = 1392;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
Debug.ShouldStop(32768);
_cvs.runMethod(false,"CreateBitmap").runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(parent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),parent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 1393;BA.debugLine="cvs.Release";
Debug.ShouldStop(65536);
_cvs.runVoidMethod ("Release");
 BA.debugLineNum = 1394;BA.debugLine="Out.Close";
Debug.ShouldStop(131072);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 1396;BA.debugLine="Private sACLADatetime As String = Utils.GetCurrDa";
Debug.ShouldStop(524288);
_sacladatetime = parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 1397;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
Debug.ShouldStop(1048576);
_saclalatitude = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1398;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
Debug.ShouldStop(2097152);
_saclalongitude = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1400;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(8388608);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 1401;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 1402;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImage(";
Debug.ShouldStop(33554432);
_imgb64 = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_thisfile));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1403;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"dta_";
Debug.ShouldStop(67108864);
_maxid = RemoteObject.solve(new RemoteObject[] {parent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 1404;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_v";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images\n"),RemoteObject.createImmutable("					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"),RemoteObject.createImmutable("					imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, conf_sid_id, execute_datetime, execute_latitude, execute_longitude)\n"),RemoteObject.createImmutable("					values ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thisfile))),RemoteObject.createImmutable("', 1,\n"),RemoteObject.createImmutable("					"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", \n"),RemoteObject.createImmutable("					"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(",\n"),RemoteObject.createImmutable("					"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", 4,\n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sacladatetime))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalatitude))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalongitude))),RemoteObject.createImmutable("' )")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1422;BA.debugLine="Utils.SaveSQLToLog(\"NewSignature\",sSQL, CurrentCL";
Debug.ShouldStop(8192);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("NewSignature")),(Object)(_ssql),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 1424;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32768);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1425;BA.debugLine="params.Initialize";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1426;BA.debugLine="params.Clear";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1427;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1428;BA.debugLine="params.Put(\"ACLARequest\", CurrentRequestCLAItem.R";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 1429;BA.debugLine="params.Put(\"ACLAAction\", CurrentRequestCLAItem.Ac";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 1430;BA.debugLine="params.Put(\"ACLATask\", CurrentRequestCLAItem.Task";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1431;BA.debugLine="params.Put(\"ACLAItem\", CurrentRequestCLAItem.Item";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 1432;BA.debugLine="params.Put(\"ACLAUniqueKey\", CurrentRequestCLAItem";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 1433;BA.debugLine="params.Put(\"ACLATagcode\", CurrentRequestCLAItem.T";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1436;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 1437;BA.debugLine="params.Put(\"ACLAValueFileImage\", thisFile)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_thisfile)));
 BA.debugLineNum = 1438;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAOnReport"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1439;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentRequestCLAIte";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1440;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentRequestCLAIte";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1441;BA.debugLine="params.Put(\"ACLAConfSidId\", 4)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAConfSidId"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 1443;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1444;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1445;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 1446;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1447;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1448;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1449;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1450;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1451;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1452;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1454;BA.debugLine="If (params.IsInitialized) Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 22;
if ((_params.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1455;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(16384);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1456;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1457;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentRe";
Debug.ShouldStop(65536);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1459;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(262144);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1460;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(524288);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 1462;BA.debugLine="Sleep(250)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "btnsavesign_click"),BA.numberCast(int.class, 250));
this.state = 23;
return;
case 23:
//C
this.state = 10;
;
 BA.debugLineNum = 1464;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1465;BA.debugLine="Try";
Debug.ShouldStop(16777216);
if (true) break;

case 13:
//try
this.state = 18;
this.catchState = 17;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 17;
 BA.debugLineNum = 1466;BA.debugLine="UploadFilesWithFTP(thisFile)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_uploadfileswithftp" /*RemoteObject*/ ,(Object)(_thisfile));
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 1468;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","668288612",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 1469;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.";
Debug.ShouldStop(268435456);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 1470;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(536870912);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1471;BA.debugLine="Utils.save2update(ServerLocation, thisFile, 1,";
Debug.ShouldStop(1073741824);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_serverlocation),(Object)(_thisfile),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
this.catchState = 0;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1474;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.A";
Debug.ShouldStop(2);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 1475;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(4);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1476;BA.debugLine="Utils.save2update(ServerLocation, thisFile, 1,";
Debug.ShouldStop(8);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_serverlocation),(Object)(_thisfile),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 1478;BA.debugLine="Sleep(250)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "btnsavesign_click"),BA.numberCast(int.class, 250));
this.state = 24;
return;
case 24:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 1481;BA.debugLine="SignPanelView.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_signpanelview" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1482;BA.debugLine="PanelSignature.Visible = False";
Debug.ShouldStop(512);
__ref.getField(false,"_panelsignature" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1483;BA.debugLine="takeSignature.Visible = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_takesignature" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1484;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1486;BA.debugLine="Dim imgInfo As String = $\"${sACLADatetime} - ${sA";
Debug.ShouldStop(8192);
_imginfo = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sacladatetime))),RemoteObject.createImmutable(" - "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalatitude))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalongitude))),RemoteObject.createImmutable("")));Debug.locals.put("imgInfo", _imginfo);Debug.locals.put("imgInfo", _imginfo);
 BA.debugLineNum = 1487;BA.debugLine="itemSignatures.Add(CreateSignaturePanel(CurrentRe";
Debug.ShouldStop(16384);
__ref.getField(false,"_itemsignatures" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createsignaturepanel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_currentrequestclaitem" /*RemoteObject*/ )),(Object)(_thisfile),(Object)(_imgb64),(Object)(BA.numberCast(int.class, 0)),(Object)(_imginfo))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1488;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _butasduedate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butASDueDate_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3088);
if (RapidSub.canDelegate("butasduedate_click")) { return __ref.runUserSub(false, "appactiondialogs","butasduedate_click", __ref);}
RemoteObject _dd = RemoteObject.declareNull("de.donmanfred.DatePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3088;BA.debugLine="Sub butASDueDate_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 3089;BA.debugLine="Dim dd As DatePickerDialog";
Debug.ShouldStop(65536);
_dd = RemoteObject.createNew ("de.donmanfred.DatePickerDialogWrapper");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3090;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(131072);
appactiondialogs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",appactiondialogs._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3091;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(262144);
_dnow = appactiondialogs.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3092;BA.debugLine="If (dlgASDueDate.Text  <> \"\") Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("!",__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3093;BA.debugLine="dnow = DateTime.DateParse(dlgASDueDate.text)";
Debug.ShouldStop(1048576);
_dnow = appactiondialogs.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3095;BA.debugLine="dd.Initialize(\"CalendarGetStartDate\", DateTime.Ge";
Debug.ShouldStop(4194304);
_dd.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CalendarGetStartDate")),(Object)(appactiondialogs.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_dnow))),(Object)(RemoteObject.solve(new RemoteObject[] {appactiondialogs.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_dnow)),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(appactiondialogs.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_dnow))));
 BA.debugLineNum = 3096;BA.debugLine="dd.show(\"dlgASDueDate\")";
Debug.ShouldStop(8388608);
_dd.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("dlgASDueDate")));
 BA.debugLineNum = 3097;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butgroupexpand_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butGroupExpand_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1144);
if (RapidSub.canDelegate("butgroupexpand_click")) { return __ref.runUserSub(false, "appactiondialogs","butgroupexpand_click", __ref);}
RemoteObject _this = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1144;BA.debugLine="Sub butGroupExpand_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1145;BA.debugLine="Dim this As B4XView = Sender";
Debug.ShouldStop(16777216);
_this = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_this = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("this", _this);
 BA.debugLineNum = 1146;BA.debugLine="If (CurrentIndex <> this.Tag) Then CurrentIndex =";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("!",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, _this.runMethod(false,"getTag"))))) { 
__ref.setField ("_currentindex" /*RemoteObject*/ ,BA.numberCast(int.class, _this.runMethod(false,"getTag")));};
 BA.debugLineNum = 1147;BA.debugLine="Dim p As B4XView = asHistoryList.GetPanel(Current";
Debug.ShouldStop(67108864);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_ashistorylist" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_getpanel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ )));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1148;BA.debugLine="If p.Tag = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),(appactiondialogs.__c.getField(true,"True")))) { 
 BA.debugLineNum = 1149;BA.debugLine="asHistoryList.CollapseItem(CurrentIndex)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_ashistorylist" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_collapseitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 1151;BA.debugLine="asHistoryList.ExpandItem(CurrentIndex)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ashistorylist" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_expanditem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1154;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butgroupexpanditem_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("butGroupExpandItem_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1140);
if (RapidSub.canDelegate("butgroupexpanditem_click")) { return __ref.runUserSub(false, "appactiondialogs","butgroupexpanditem_click", __ref);}
 BA.debugLineNum = 1140;BA.debugLine="Sub butGroupExpandItem_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1142;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("CalendarGetStartDate_onDateSet (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3099);
if (RapidSub.canDelegate("calendargetstartdate_ondateset")) { return __ref.runUserSub(false, "appactiondialogs","calendargetstartdate_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
RemoteObject _moy = RemoteObject.createImmutable("");
RemoteObject _dom = RemoteObject.createImmutable("");
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 3099;BA.debugLine="Sub CalendarGetStartDate_onDateSet(year As Int, mo";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3100;BA.debugLine="Dim moy As String = monthOfYear+1";
Debug.ShouldStop(134217728);
_moy = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_monthofyear,RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("moy", _moy);Debug.locals.put("moy", _moy);
 BA.debugLineNum = 3101;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",_moy.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_moy = RemoteObject.concat(RemoteObject.createImmutable("0"),_moy);Debug.locals.put("moy", _moy);};
 BA.debugLineNum = 3102;BA.debugLine="Dim dom As String = dayOfMonth";
Debug.ShouldStop(536870912);
_dom = BA.NumberToString(_dayofmonth);Debug.locals.put("dom", _dom);Debug.locals.put("dom", _dom);
 BA.debugLineNum = 3103;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",_dom.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_dom = RemoteObject.concat(RemoteObject.createImmutable("0"),_dom);Debug.locals.put("dom", _dom);};
 BA.debugLineNum = 3104;BA.debugLine="dlgASDueDate.Text = $\"${year}-${moy}-${dom}\"$";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable(""),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_year))),RemoteObject.createImmutable("-"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_moy))),RemoteObject.createImmutable("-"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dom))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3105;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _camerareturn(RemoteObject __ref,RemoteObject _filename,RemoteObject _this) throws Exception{
try {
		Debug.PushSubsStack("CameraReturn (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1905);
if (RapidSub.canDelegate("camerareturn")) { __ref.runUserSub(false, "appactiondialogs","camerareturn", __ref, _filename, _this); return;}
ResumableSub_CameraReturn rsub = new ResumableSub_CameraReturn(null,__ref,_filename,_this);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CameraReturn extends BA.ResumableSub {
public ResumableSub_CameraReturn(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _filename,RemoteObject _this) {
this.parent = parent;
this.__ref = __ref;
this._filename = _filename;
this._this = _this;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _filename;
RemoteObject _this;
RemoteObject _obj = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _params33 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable(0);
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _record2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _n = 0;
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _serverlocation = RemoteObject.createImmutable("");
int step71;
int limit71;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CameraReturn (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1905);
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
Debug.locals.put("FileName", _filename);
Debug.locals.put("this", _this);
 BA.debugLineNum = 1908;BA.debugLine="Dim obj As String = ObjectTagcode";
Debug.ShouldStop(524288);
_obj = __ref.getField(true,"_objecttagcode" /*RemoteObject*/ );Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 1909;BA.debugLine="If (Utils.isNullOrEmpty(obj)) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_obj))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1910;BA.debugLine="obj = this.TagObject";
Debug.ShouldStop(2097152);
_obj = _this.getField(true,"TagObject" /*RemoteObject*/ );Debug.locals.put("obj", _obj);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1912;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8388608);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1913;BA.debugLine="Dim params33 As Map";
Debug.ShouldStop(16777216);
_params33 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params33", _params33);
 BA.debugLineNum = 1915;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 5:
//if
this.state = 22;
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1916;BA.debugLine="If Not(FileName.IndexOf(\".png\") >= 0) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 8:
//if
this.state = 11;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_filename.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".png"))),BA.numberCast(double.class, 0))))).<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1917;BA.debugLine="FileName = $\"${FileName}.png\"$";
Debug.ShouldStop(268435456);
_filename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(".png")));Debug.locals.put("FileName", _filename);
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 1919;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(1073741824);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 1920;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 1921;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImage";
Debug.ShouldStop(1);
_imgb64 = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1924;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(8);
_maxid = RemoteObject.solve(new RemoteObject[] {parent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 1925;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(16);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images \n"),RemoteObject.createImmutable("						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"),RemoteObject.createImmutable("						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter)\n"),RemoteObject.createImmutable("						values ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("		'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("', 1, "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(")")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1931;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.Req";
Debug.ShouldStop(1024);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CameraReturn")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 1934;BA.debugLine="If (Utils.NNE(obj)) Then";
Debug.ShouldStop(8192);
if (true) break;

case 12:
//if
this.state = 15;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_obj))).<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1935;BA.debugLine="Dim v As Int = Utils.DBDataCount(Starter.LocalS";
Debug.ShouldStop(16384);
_v = RemoteObject.solve(new RemoteObject[] {parent._utils.runMethod(true,"_dbdatacount" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._starter._localsqlevc /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("select count(0) as COUNTER from dta_objects_images ")))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1936;BA.debugLine="Dim sSQL As String = $\"insert into dta_objects_";
Debug.ShouldStop(32768);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_objects_images (id, object_tagcode, image, filename)\n"),RemoteObject.createImmutable("					values ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_v))),RemoteObject.createImmutable(", '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_obj))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1938;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.Re";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CameraReturn")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 1941;BA.debugLine="params33.Initialize";
Debug.ShouldStop(1048576);
_params33.runVoidMethod ("Initialize");
 BA.debugLineNum = 1942;BA.debugLine="params33.Clear";
Debug.ShouldStop(2097152);
_params33.runVoidMethod ("Clear");
 BA.debugLineNum = 1943;BA.debugLine="params33.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(4194304);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1944;BA.debugLine="params33.Put(\"ACLATagcode\", obj)";
Debug.ShouldStop(8388608);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_obj)));
 BA.debugLineNum = 1945;BA.debugLine="params33.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(16777216);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 1946;BA.debugLine="params33.Put(\"ACLAValueFileImage\", FileName)";
Debug.ShouldStop(33554432);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_filename)));
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 1950;BA.debugLine="Private sACLADatetime As String = Utils.GetCurrD";
Debug.ShouldStop(536870912);
_sacladatetime = parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 1951;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOr";
Debug.ShouldStop(1073741824);
_saclalatitude = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1952;BA.debugLine="Private sACLALongitude As String = Utils.IfNullO";
Debug.ShouldStop(-2147483648);
_saclalongitude = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1954;BA.debugLine="params.Initialize";
Debug.ShouldStop(2);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1955;BA.debugLine="params.Clear";
Debug.ShouldStop(4);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1956;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1957;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 1958;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 1959;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1960;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 1961;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 1962;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1965;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 1966;BA.debugLine="params.Put(\"ACLAValueFileImage\", FileName)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_filename)));
 BA.debugLineNum = 1967;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAOnReport"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1968;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1969;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1970;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1971;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1972;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1973;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1974;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1975;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1976;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1977;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1978;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 16:
//try
this.state = 21;
this.catchState = 20;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 21;
this.catchState = 20;
 BA.debugLineNum = 1979;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1980;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
 BA.debugLineNum = 1982;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1983;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1984;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","669140559",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
;
 if (true) break;
;
 BA.debugLineNum = 1989;BA.debugLine="If Not(this.Value = \"IMG_B64_EDIT\") Then";
Debug.ShouldStop(16);

case 22:
//if
this.state = 51;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Value" /*RemoteObject*/ ),RemoteObject.createImmutable("IMG_B64_EDIT"))))).<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1990;BA.debugLine="If (ItemImages.IsInitialized) Then";
Debug.ShouldStop(32);
if (true) break;

case 25:
//if
this.state = 28;
if ((__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1991;BA.debugLine="ItemImages.Clear";
Debug.ShouldStop(64);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 1992;BA.debugLine="AssociateImagesCompleteList.Clear";
Debug.ShouldStop(128);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Clear");
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 1994;BA.debugLine="Private Record2 As Cursor";
Debug.ShouldStop(512);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 1997;BA.debugLine="Dim sSQL As String = $\"select ifnull(imageb64,''";
Debug.ShouldStop(4096);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report\n"),RemoteObject.createImmutable("		from dta_requests_values_images where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("		task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and \n"),RemoteObject.createImmutable("		tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("		And repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		And repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2003;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(262144);
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 2005;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 29:
//if
this.state = 50;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 2006;BA.debugLine="For n=0 To Record2.RowCount-1";
Debug.ShouldStop(2097152);
if (true) break;

case 32:
//for
this.state = 49;
step71 = 1;
limit71 = RemoteObject.solve(new RemoteObject[] {_record2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 82;
if (true) break;

case 82:
//C
this.state = 49;
if ((step71 > 0 && _n <= limit71) || (step71 < 0 && _n >= limit71)) this.state = 34;
if (true) break;

case 83:
//C
this.state = 82;
_n = ((int)(0 + _n + step71)) ;
Debug.locals.put("n", _n);
if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 2007;BA.debugLine="Record2.Position = n";
Debug.ShouldStop(4194304);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 2008;BA.debugLine="Dim image As String = Record2.GetString(\"image";
Debug.ShouldStop(8388608);
_image = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imageb64")));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 2009;BA.debugLine="Dim FileName As String = Record2.GetString(\"im";
Debug.ShouldStop(16777216);
_filename = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 2010;BA.debugLine="If Not(Utils.isNullOrEmpty(image)) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 35:
//if
this.state = 48;
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_image)))).<Boolean>get().booleanValue()) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 2012;BA.debugLine="If (ItemImages.IsInitialized) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 38:
//if
this.state = 47;
if ((__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 2013;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 41:
//try
this.state = 46;
this.catchState = 45;
this.state = 43;
if (true) break;

case 43:
//C
this.state = 46;
this.catchState = 45;
 BA.debugLineNum = 2014;BA.debugLine="ItemImages.Add(CreateImagePanel(this, FileN";
Debug.ShouldStop(536870912);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createimagepanel" /*RemoteObject*/ ,(Object)(_this),(Object)(_filename),(Object)(_image),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2015;BA.debugLine="AssociateImagesCompleteList.Add(FileName)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
 BA.debugLineNum = 2017;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","669140592",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 0;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = 83;
;
 if (true) break;
if (true) break;

case 49:
//C
this.state = 50;
Debug.locals.put("n", _n);
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 2023;BA.debugLine="Record2.Close";
Debug.ShouldStop(64);
_record2.runVoidMethod ("Close");
 if (true) break;
;
 BA.debugLineNum = 2027;BA.debugLine="If (params.IsInitialized) Then";
Debug.ShouldStop(1024);

case 51:
//if
this.state = 72;
if ((_params.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 2028;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(2048);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2029;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(4096);
if (true) break;

case 54:
//if
this.state = 59;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 56;
}else {
this.state = 58;
}if (true) break;

case 56:
//C
this.state = 59;
 BA.debugLineNum = 2030;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Requ";
Debug.ShouldStop(8192);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 2032;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(32768);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2033;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(65536);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 59:
//C
this.state = 60;
;
 BA.debugLineNum = 2035;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "camerareturn"),BA.numberCast(int.class, 1000));
this.state = 84;
return;
case 84:
//C
this.state = 60;
;
 BA.debugLineNum = 2039;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(4194304);
if (true) break;

case 60:
//if
this.state = 71;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 62;
}else {
this.state = 70;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 2040;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 63:
//try
this.state = 68;
this.catchState = 67;
this.state = 65;
if (true) break;

case 65:
//C
this.state = 68;
this.catchState = 67;
 BA.debugLineNum = 2041;BA.debugLine="UploadFilesWithFTP(FileName)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_uploadfileswithftp" /*RemoteObject*/ ,(Object)(_filename));
 Debug.CheckDeviceExceptions();
if (true) break;

case 67:
//C
this.state = 68;
this.catchState = 0;
 BA.debugLineNum = 2043;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","669140618",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 2044;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.";
Debug.ShouldStop(134217728);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 2045;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(268435456);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2046;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1,";
Debug.ShouldStop(536870912);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;
if (true) break;

case 68:
//C
this.state = 71;
this.catchState = 0;
;
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 2049;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.A";
Debug.ShouldStop(1);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 2050;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(2);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2051;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1,";
Debug.ShouldStop(4);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;

case 71:
//C
this.state = 72;
;
 BA.debugLineNum = 2053;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "camerareturn"),BA.numberCast(int.class, 1000));
this.state = 85;
return;
case 85:
//C
this.state = 72;
;
 if (true) break;
;
 BA.debugLineNum = 2056;BA.debugLine="If (params33.IsInitialized) Then";
Debug.ShouldStop(128);

case 72:
//if
this.state = 81;
if ((_params33.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 2057;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(256);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more2/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2058;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(512);
if (true) break;

case 75:
//if
this.state = 80;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 77;
}else {
this.state = 79;
}if (true) break;

case 77:
//C
this.state = 80;
 BA.debugLineNum = 2059;BA.debugLine="Utils.CallApi(0, params33, Me, Url, \"\", this.Re";
Debug.ShouldStop(1024);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params33),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 2061;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(4096);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2062;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params33";
Debug.ShouldStop(8192);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params33))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 80:
//C
this.state = 81;
;
 BA.debugLineNum = 2064;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "camerareturn"),BA.numberCast(int.class, 1000));
this.state = 86;
return;
case 86:
//C
this.state = 81;
;
 if (true) break;

case 81:
//C
this.state = -1;
;
 BA.debugLineNum = 2067;BA.debugLine="End Sub";
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
public static RemoteObject  _camerareturnnothing(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CameraReturnNothing (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1849);
if (RapidSub.canDelegate("camerareturnnothing")) { return __ref.runUserSub(false, "appactiondialogs","camerareturnnothing", __ref);}
 BA.debugLineNum = 1849;BA.debugLine="Sub CameraReturnNothing";
Debug.ShouldStop(16777216);
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
public static void  _camerareturnshots(RemoteObject __ref,RemoteObject _filelist,RemoteObject _this) throws Exception{
try {
		Debug.PushSubsStack("CameraReturnShots (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2069);
if (RapidSub.canDelegate("camerareturnshots")) { __ref.runUserSub(false, "appactiondialogs","camerareturnshots", __ref, _filelist, _this); return;}
ResumableSub_CameraReturnShots rsub = new ResumableSub_CameraReturnShots(null,__ref,_filelist,_this);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CameraReturnShots extends BA.ResumableSub {
public ResumableSub_CameraReturnShots(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _filelist,RemoteObject _this) {
this.parent = parent;
this.__ref = __ref;
this._filelist = _filelist;
this._this = _this;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _filelist;
RemoteObject _this;
RemoteObject _obj = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _params33 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _nfile = 0;
RemoteObject _thefoto = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._shotfoto");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable(0);
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _record2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _n = 0;
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _upl = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
RemoteObject _serverlocation = RemoteObject.createImmutable("");
int step9;
int limit9;
int step75;
int limit75;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CameraReturnShots (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2069);
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
Debug.locals.put("FileList", _filelist);
Debug.locals.put("this", _this);
 BA.debugLineNum = 2072;BA.debugLine="Dim obj As String = ObjectTagcode";
Debug.ShouldStop(8388608);
_obj = __ref.getField(true,"_objecttagcode" /*RemoteObject*/ );Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 2073;BA.debugLine="If (Utils.isNullOrEmpty(obj)) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_obj))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2074;BA.debugLine="obj = this.TagObject";
Debug.ShouldStop(33554432);
_obj = _this.getField(true,"TagObject" /*RemoteObject*/ );Debug.locals.put("obj", _obj);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2076;BA.debugLine="Dim params As Map";
Debug.ShouldStop(134217728);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2077;BA.debugLine="Dim params33 As Map";
Debug.ShouldStop(268435456);
_params33 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params33", _params33);
 BA.debugLineNum = 2078;BA.debugLine="If (FileList.Size >0) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 5:
//if
this.state = 89;
if ((RemoteObject.solveBoolean(">",_filelist.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2079;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._pg2msgprocessfotos /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 2080;BA.debugLine="For nFile=0 To FileList.Size-1";
Debug.ShouldStop(-2147483648);
if (true) break;

case 8:
//for
this.state = 88;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {_filelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nfile = 0 ;
Debug.locals.put("nFile", _nfile);
this.state = 90;
if (true) break;

case 90:
//C
this.state = 88;
if ((step9 > 0 && _nfile <= limit9) || (step9 < 0 && _nfile >= limit9)) this.state = 10;
if (true) break;

case 91:
//C
this.state = 90;
_nfile = ((int)(0 + _nfile + step9)) ;
Debug.locals.put("nFile", _nfile);
if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2081;BA.debugLine="Dim theFoto  As ShotFoto = FileList.Get(nFile)";
Debug.ShouldStop(1);
_thefoto = (_filelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _nfile))));Debug.locals.put("theFoto", _thefoto);Debug.locals.put("theFoto", _thefoto);
 BA.debugLineNum = 2082;BA.debugLine="Dim FileName As String = theFoto.FileName";
Debug.ShouldStop(2);
_filename = _thefoto.getField(true,"FileName" /*RemoteObject*/ );Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 2083;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
Debug.ShouldStop(4);
if (true) break;

case 11:
//if
this.state = 28;
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)))).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2084;BA.debugLine="If Not(FileName.IndexOf(\".png\") >= 0) Then";
Debug.ShouldStop(8);
if (true) break;

case 14:
//if
this.state = 17;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_filename.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".png"))),BA.numberCast(double.class, 0))))).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2085;BA.debugLine="FileName = $\"${FileName}.png\"$";
Debug.ShouldStop(16);
_filename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(".png")));Debug.locals.put("FileName", _filename);
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 2087;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(64);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 2088;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 2089;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
Debug.ShouldStop(256);
_imgb64 = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 2092;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(2048);
_maxid = RemoteObject.solve(new RemoteObject[] {parent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 2093;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
Debug.ShouldStop(4096);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images\n"),RemoteObject.createImmutable("						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"),RemoteObject.createImmutable("						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, \n"),RemoteObject.createImmutable("						execute_datetime, execute_latitude, execute_longitude)\n"),RemoteObject.createImmutable("						values ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("						'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("', 1, "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", \n"),RemoteObject.createImmutable("						'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_thefoto.getField(true,"DateNTime" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("						'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_thefoto.getField(true,"Latitude" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("						'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_thefoto.getField(true,"Longitude" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2103;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.R";
Debug.ShouldStop(4194304);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CameraReturn")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 2105;BA.debugLine="If (Utils.NNE(obj)) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 18:
//if
this.state = 21;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_obj))).<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2106;BA.debugLine="Dim v As Int = Utils.DBDataCount(Starter.Loca";
Debug.ShouldStop(33554432);
_v = RemoteObject.solve(new RemoteObject[] {parent._utils.runMethod(true,"_dbdatacount" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._starter._localsqlevc /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("select count(0) as COUNTER from dta_objects_images ")))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 2107;BA.debugLine="Dim sSQL As String = $\"insert into dta_object";
Debug.ShouldStop(67108864);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_objects_images (id, object_tagcode, image, filename)\n"),RemoteObject.createImmutable("					values ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_v))),RemoteObject.createImmutable(", '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_obj))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2109;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.";
Debug.ShouldStop(268435456);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CameraReturn")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 2112;BA.debugLine="params33.Initialize";
Debug.ShouldStop(-2147483648);
_params33.runVoidMethod ("Initialize");
 BA.debugLineNum = 2113;BA.debugLine="params33.Clear";
Debug.ShouldStop(1);
_params33.runVoidMethod ("Clear");
 BA.debugLineNum = 2114;BA.debugLine="params33.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(2);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2115;BA.debugLine="params33.Put(\"ACLATagcode\", obj)";
Debug.ShouldStop(4);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_obj)));
 BA.debugLineNum = 2116;BA.debugLine="params33.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(8);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 2117;BA.debugLine="params33.Put(\"ACLAValueFileImage\", FileName)";
Debug.ShouldStop(16);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_filename)));
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 2121;BA.debugLine="Private sACLADatetime As String = Utils.GetCur";
Debug.ShouldStop(256);
_sacladatetime = parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 2122;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
Debug.ShouldStop(512);
_saclalatitude = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 2123;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
Debug.ShouldStop(1024);
_saclalongitude = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 2125;BA.debugLine="params.Initialize";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2126;BA.debugLine="params.Clear";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2127;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2128;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 2129;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 2130;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 2131;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 2132;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 2133;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 2134;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 2135;BA.debugLine="params.Put(\"ACLAValueFileImage\", FileName)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_filename)));
 BA.debugLineNum = 2136;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAOnReport"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2137;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounte";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2138;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCo";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2139;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2140;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2141;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2142;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2143;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2144;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2145;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2146;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 2147;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 22:
//try
this.state = 27;
this.catchState = 26;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 27;
this.catchState = 26;
 BA.debugLineNum = 2148;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 2149;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
 BA.debugLineNum = 2151;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2152;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2153;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","669206100",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 if (true) break;
;
 BA.debugLineNum = 2158;BA.debugLine="If Not(this.Value = \"IMG_B64_EDIT\") Then";
Debug.ShouldStop(8192);

case 28:
//if
this.state = 57;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Value" /*RemoteObject*/ ),RemoteObject.createImmutable("IMG_B64_EDIT"))))).<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2159;BA.debugLine="If (ItemImages.IsInitialized) Then";
Debug.ShouldStop(16384);
if (true) break;

case 31:
//if
this.state = 34;
if ((__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2160;BA.debugLine="ItemImages.Clear";
Debug.ShouldStop(32768);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 2161;BA.debugLine="AssociateImagesCompleteList.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Clear");
 if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 2164;BA.debugLine="Dim sSQL As String = $\"select ifnull(imageb64,";
Debug.ShouldStop(524288);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report\n"),RemoteObject.createImmutable("								from dta_requests_values_images where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("								task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and \n"),RemoteObject.createImmutable("								tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("								And repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2170;BA.debugLine="Private Record2 As Cursor = Starter.LocalSQLEV";
Debug.ShouldStop(33554432);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 2172;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 35:
//if
this.state = 56;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 2173;BA.debugLine="For n=0 To Record2.RowCount-1";
Debug.ShouldStop(268435456);
if (true) break;

case 38:
//for
this.state = 55;
step75 = 1;
limit75 = RemoteObject.solve(new RemoteObject[] {_record2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 92;
if (true) break;

case 92:
//C
this.state = 55;
if ((step75 > 0 && _n <= limit75) || (step75 < 0 && _n >= limit75)) this.state = 40;
if (true) break;

case 93:
//C
this.state = 92;
_n = ((int)(0 + _n + step75)) ;
Debug.locals.put("n", _n);
if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 2174;BA.debugLine="Record2.Position = n";
Debug.ShouldStop(536870912);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 2175;BA.debugLine="Dim image As String = Record2.GetString(\"ima";
Debug.ShouldStop(1073741824);
_image = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imageb64")));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 2176;BA.debugLine="Dim FileName As String = Record2.GetString(\"";
Debug.ShouldStop(-2147483648);
_filename = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 2177;BA.debugLine="If Not(Utils.isNullOrEmpty(image)) Then";
Debug.ShouldStop(1);
if (true) break;

case 41:
//if
this.state = 54;
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_image)))).<Boolean>get().booleanValue()) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 2179;BA.debugLine="If (ItemImages.IsInitialized) Then";
Debug.ShouldStop(4);
if (true) break;

case 44:
//if
this.state = 53;
if ((__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 2180;BA.debugLine="Try";
Debug.ShouldStop(8);
if (true) break;

case 47:
//try
this.state = 52;
this.catchState = 51;
this.state = 49;
if (true) break;

case 49:
//C
this.state = 52;
this.catchState = 51;
 BA.debugLineNum = 2181;BA.debugLine="ItemImages.Add(CreateImagePanel(this, Fil";
Debug.ShouldStop(16);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createimagepanel" /*RemoteObject*/ ,(Object)(_this),(Object)(_filename),(Object)(_image),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2182;BA.debugLine="AssociateImagesCompleteList.Add(FileName)";
Debug.ShouldStop(32);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
 BA.debugLineNum = 2184;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","669206131",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
this.catchState = 0;
;
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 93;
;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
Debug.locals.put("n", _n);
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 2190;BA.debugLine="Record2.Close";
Debug.ShouldStop(8192);
_record2.runVoidMethod ("Close");
 if (true) break;
;
 BA.debugLineNum = 2194;BA.debugLine="If (params.IsInitialized) Then";
Debug.ShouldStop(131072);

case 57:
//if
this.state = 78;
if ((_params.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 2195;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(262144);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2196;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(524288);
if (true) break;

case 60:
//if
this.state = 65;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 65;
 BA.debugLineNum = 2197;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
Debug.ShouldStop(1048576);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 2199;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(4194304);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2200;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(8388608);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 2202;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "camerareturnshots"),BA.numberCast(int.class, 1000));
this.state = 94;
return;
case 94:
//C
this.state = 66;
;
 BA.debugLineNum = 2205;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(268435456);
if (true) break;

case 66:
//if
this.state = 77;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 68;
}else {
this.state = 76;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 2206;BA.debugLine="Try";
Debug.ShouldStop(536870912);
if (true) break;

case 69:
//try
this.state = 74;
this.catchState = 73;
this.state = 71;
if (true) break;

case 71:
//C
this.state = 74;
this.catchState = 73;
 BA.debugLineNum = 2207;BA.debugLine="Dim upl As ResumableSub = UploadFilesWithFTP";
Debug.ShouldStop(1073741824);
_upl = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_upl = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_uploadfileswithftp" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("upl", _upl);Debug.locals.put("upl", _upl);
 BA.debugLineNum = 2208;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "camerareturnshots"), _upl);
this.state = 95;
return;
case 95:
//C
this.state = 74;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("finish", _finish);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 73:
//C
this.state = 74;
this.catchState = 0;
 BA.debugLineNum = 2210;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","669206157",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 2211;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCod";
Debug.ShouldStop(4);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 2212;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWo";
Debug.ShouldStop(8);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2213;BA.debugLine="Utils.save2update(ServerLocation, FileName,";
Debug.ShouldStop(16);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;
if (true) break;

case 74:
//C
this.state = 77;
this.catchState = 0;
;
 if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 2216;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode";
Debug.ShouldStop(128);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 2217;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(256);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2218;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1";
Debug.ShouldStop(512);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;

case 77:
//C
this.state = 78;
;
 BA.debugLineNum = 2220;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "camerareturnshots"),BA.numberCast(int.class, 1000));
this.state = 96;
return;
case 96:
//C
this.state = 78;
;
 if (true) break;
;
 BA.debugLineNum = 2223;BA.debugLine="If (params33.IsInitialized) Then";
Debug.ShouldStop(16384);

case 78:
//if
this.state = 87;
if ((_params33.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 2224;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(32768);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more2/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2225;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(65536);
if (true) break;

case 81:
//if
this.state = 86;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
 BA.debugLineNum = 2226;BA.debugLine="Utils.CallApi(0, params33, Me, Url, \"\", this.";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params33),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 2228;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(524288);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2229;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(1048576);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params33))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 86:
//C
this.state = 87;
;
 BA.debugLineNum = 2231;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "camerareturnshots"),BA.numberCast(int.class, 1000));
this.state = 97;
return;
case 97:
//C
this.state = 87;
;
 if (true) break;

case 87:
//C
this.state = 91;
;
 if (true) break;
if (true) break;

case 88:
//C
this.state = 89;
Debug.locals.put("nFile", _nfile);
;
 BA.debugLineNum = 2236;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 89:
//C
this.state = -1;
;
 BA.debugLineNum = 2238;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static void  _complete(RemoteObject __ref,RemoteObject _finish) throws Exception{
}
public static RemoteObject  _changeas_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("changeAS_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3358);
if (RapidSub.canDelegate("changeas_click")) { return __ref.runUserSub(false, "appactiondialogs","changeas_click", __ref);}
 BA.debugLineNum = 3358;BA.debugLine="Sub changeAS_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 3360;BA.debugLine="If (PanelOnTop = 0) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",__ref.getField(true,"_panelontop" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 3361;BA.debugLine="asHistory.BringToFront";
Debug.ShouldStop(1);
__ref.getField(false,"_ashistory" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 3362;BA.debugLine="PanelOnTop = 1";
Debug.ShouldStop(2);
__ref.setField ("_panelontop" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 }else {
 BA.debugLineNum = 3364;BA.debugLine="asPanel.BringToFront";
Debug.ShouldStop(8);
__ref.getField(false,"_aspanel" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 3365;BA.debugLine="PanelOnTop = 0";
Debug.ShouldStop(16);
__ref.setField ("_panelontop" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 3367;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claitembutton_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAItemButton_StateClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3341);
if (RapidSub.canDelegate("claitembutton_stateclick")) { return __ref.runUserSub(false, "appactiondialogs","claitembutton_stateclick", __ref, _state);}
RemoteObject _btn = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
Debug.locals.put("State", _state);
 BA.debugLineNum = 3341;BA.debugLine="Sub CLAItemButton_StateClick (State As Int)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 3342;BA.debugLine="Dim btn As B4XStateButton = Sender";
Debug.ShouldStop(8192);
_btn = (appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 3343;BA.debugLine="Log(btn.Tag)";
Debug.ShouldStop(16384);
appactiondialogs.__c.runVoidMethod ("LogImpl","670254594",BA.ObjectToString(_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ )),0);
 BA.debugLineNum = 3344;BA.debugLine="FastOptionCheck = 1";
Debug.ShouldStop(32768);
__ref.setField ("_fastoptioncheck" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 3345;BA.debugLine="If ((btn.Tag = \"TSKT-0003\") And (btn.Reference =";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ),(RemoteObject.createImmutable("TSKT-0003")))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getreference" /*RemoteObject*/ ),RemoteObject.createImmutable("2"))))))) { 
 BA.debugLineNum = 3346;BA.debugLine="FastOptionCheck = 2";
Debug.ShouldStop(131072);
__ref.setField ("_fastoptioncheck" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 3347;BA.debugLine="Dim sSQL As String = $\"update alerts set status_";
Debug.ShouldStop(262144);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update alerts set status_id=2, itemstatus="),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_fastoptioncheck" /*RemoteObject*/ )))),RemoteObject.createImmutable(" where tagcode='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3348;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sSQL)";
Debug.ShouldStop(524288);
appactiondialogs._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 3349;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(1048576);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 3350;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(2097152);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3351;BA.debugLine="Filter.GetMoreActionsDialog(CurrentActivity, \"Us";
Debug.ShouldStop(4194304);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getmoreactionsdialog" /*void*/ ,(Object)(__ref.getField(false,"_currentactivity" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(("User"))),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_objecttagcode" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_pressedanswertagcode" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 3353;BA.debugLine="Dim sSQL As String = $\"update alerts set status_";
Debug.ShouldStop(16777216);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update alerts set status_id=2, itemstatus="),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_fastoptioncheck" /*RemoteObject*/ )))),RemoteObject.createImmutable(" where tagcode='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3354;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sSQL)";
Debug.ShouldStop(33554432);
appactiondialogs._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 };
 BA.debugLineNum = 3356;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claitemslist_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAItemsList_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3442);
if (RapidSub.canDelegate("claitemslist_itemclick")) { return __ref.runUserSub(false, "appactiondialogs","claitemslist_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3442;BA.debugLine="Sub CLAItemsList_ItemClick (Index As Int, Value As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 3444;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ApplActionDialog As CustomLayoutDialog";
appactiondialogs._applactiondialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_applactiondialog",appactiondialogs._applactiondialog);
 //BA.debugLineNum = 3;BA.debugLine="Private CurrentCLD As CustomLayoutDialog";
appactiondialogs._currentcld = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_currentcld",appactiondialogs._currentcld);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
appactiondialogs._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",appactiondialogs._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
appactiondialogs._appldialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_appldialog",appactiondialogs._appldialog);
 //BA.debugLineNum = 10;BA.debugLine="Private ACTDLG_ONE_BUTTON As B4XStateButton";
appactiondialogs._actdlg_one_button = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_actdlg_one_button",appactiondialogs._actdlg_one_button);
 //BA.debugLineNum = 11;BA.debugLine="Private ViewSimpleList As CustomListView";
appactiondialogs._viewsimplelist = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_viewsimplelist",appactiondialogs._viewsimplelist);
 //BA.debugLineNum = 12;BA.debugLine="Private ViewSimpleListTitle As Label";
appactiondialogs._viewsimplelisttitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_viewsimplelisttitle",appactiondialogs._viewsimplelisttitle);
 //BA.debugLineNum = 13;BA.debugLine="Private ViewSimpleListInfo As Label";
appactiondialogs._viewsimplelistinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_viewsimplelistinfo",appactiondialogs._viewsimplelistinfo);
 //BA.debugLineNum = 15;BA.debugLine="Private ThisActivityName_TaskListDialog As Object";
appactiondialogs._thisactivityname_tasklistdialog = RemoteObject.createNew ("Object");__ref.setField("_thisactivityname_tasklistdialog",appactiondialogs._thisactivityname_tasklistdialog);
 //BA.debugLineNum = 16;BA.debugLine="Private ViewSimpleListNumber As Label";
appactiondialogs._viewsimplelistnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_viewsimplelistnumber",appactiondialogs._viewsimplelistnumber);
 //BA.debugLineNum = 17;BA.debugLine="Private ColorTabPanel As Panel";
appactiondialogs._colortabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_colortabpanel",appactiondialogs._colortabpanel);
 //BA.debugLineNum = 18;BA.debugLine="Private listsBasePanel As Panel";
appactiondialogs._listsbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_listsbasepanel",appactiondialogs._listsbasepanel);
 //BA.debugLineNum = 19;BA.debugLine="Private listsTabPanel As TabStrip";
appactiondialogs._liststabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");__ref.setField("_liststabpanel",appactiondialogs._liststabpanel);
 //BA.debugLineNum = 20;BA.debugLine="Private obsOptions As Spinner";
appactiondialogs._obsoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_obsoptions",appactiondialogs._obsoptions);
 //BA.debugLineNum = 21;BA.debugLine="Private ItemNotes As EditText";
appactiondialogs._itemnotes = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_itemnotes",appactiondialogs._itemnotes);
 //BA.debugLineNum = 22;BA.debugLine="Private ItemImages As CustomListView";
appactiondialogs._itemimages = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_itemimages",appactiondialogs._itemimages);
 //BA.debugLineNum = 23;BA.debugLine="Private takePhoto As Button";
appactiondialogs._takephoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_takephoto",appactiondialogs._takephoto);
 //BA.debugLineNum = 25;BA.debugLine="Private ActionCode As String = \"\"";
appactiondialogs._actioncode = BA.ObjectToString("");__ref.setField("_actioncode",appactiondialogs._actioncode);
 //BA.debugLineNum = 26;BA.debugLine="Dim Base64Con As Base64Convert";
appactiondialogs._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",appactiondialogs._base64con);
 //BA.debugLineNum = 27;BA.debugLine="Private CurrentActivity As Activity";
appactiondialogs._currentactivity = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_currentactivity",appactiondialogs._currentactivity);
 //BA.debugLineNum = 28;BA.debugLine="Private ShowImage As ImageView";
appactiondialogs._showimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_showimage",appactiondialogs._showimage);
 //BA.debugLineNum = 29;BA.debugLine="Private ImageFilename As Label";
appactiondialogs._imagefilename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imagefilename",appactiondialogs._imagefilename);
 //BA.debugLineNum = 30;BA.debugLine="Private ImageState As Label";
appactiondialogs._imagestate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imagestate",appactiondialogs._imagestate);
 //BA.debugLineNum = 31;BA.debugLine="Private takeObsOption As Button";
appactiondialogs._takeobsoption = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_takeobsoption",appactiondialogs._takeobsoption);
 //BA.debugLineNum = 33;BA.debugLine="Private dlgASType As Spinner";
appactiondialogs._dlgastype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dlgastype",appactiondialogs._dlgastype);
 //BA.debugLineNum = 34;BA.debugLine="Private dlgASEmails As FloatLabeledEditText";
appactiondialogs._dlgasemails = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dlgasemails",appactiondialogs._dlgasemails);
 //BA.debugLineNum = 35;BA.debugLine="Private dlgASPriority As Spinner";
appactiondialogs._dlgaspriority = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dlgaspriority",appactiondialogs._dlgaspriority);
 //BA.debugLineNum = 36;BA.debugLine="Private dlgASUrgency As Spinner";
appactiondialogs._dlgasurgency = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dlgasurgency",appactiondialogs._dlgasurgency);
 //BA.debugLineNum = 38;BA.debugLine="Private dlgASAssign As Spinner";
appactiondialogs._dlgasassign = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dlgasassign",appactiondialogs._dlgasassign);
 //BA.debugLineNum = 39;BA.debugLine="Private dlgASSendEmail As B4XStateButton";
appactiondialogs._dlgassendemail = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_dlgassendemail",appactiondialogs._dlgassendemail);
 //BA.debugLineNum = 40;BA.debugLine="Private ItemASDetails As Label";
appactiondialogs._itemasdetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemasdetails",appactiondialogs._itemasdetails);
 //BA.debugLineNum = 41;BA.debugLine="Private ItemASAssign As Label";
appactiondialogs._itemasassign = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemasassign",appactiondialogs._itemasassign);
 //BA.debugLineNum = 42;BA.debugLine="Private ItemASEmails As Label";
appactiondialogs._itemasemails = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemasemails",appactiondialogs._itemasemails);
 //BA.debugLineNum = 43;BA.debugLine="Private ItemASRelated As Label";
appactiondialogs._itemasrelated = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemasrelated",appactiondialogs._itemasrelated);
 //BA.debugLineNum = 44;BA.debugLine="Private ItemASViewRelated As Label";
appactiondialogs._itemasviewrelated = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemasviewrelated",appactiondialogs._itemasviewrelated);
 //BA.debugLineNum = 45;BA.debugLine="Private ItemASDatetime As Label";
appactiondialogs._itemasdatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemasdatetime",appactiondialogs._itemasdatetime);
 //BA.debugLineNum = 46;BA.debugLine="Private ItemASPriority As Label";
appactiondialogs._itemaspriority = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemaspriority",appactiondialogs._itemaspriority);
 //BA.debugLineNum = 47;BA.debugLine="Private ItemASState As Label";
appactiondialogs._itemasstate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemasstate",appactiondialogs._itemasstate);
 //BA.debugLineNum = 48;BA.debugLine="Private ItemASUrgency As Label";
appactiondialogs._itemasurgency = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemasurgency",appactiondialogs._itemasurgency);
 //BA.debugLineNum = 49;BA.debugLine="Private takeAS As Button";
appactiondialogs._takeas = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_takeas",appactiondialogs._takeas);
 //BA.debugLineNum = 50;BA.debugLine="Private asHistoryList As ExpandedListView";
appactiondialogs._ashistorylist = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.expandedlistview");__ref.setField("_ashistorylist",appactiondialogs._ashistorylist);
 //BA.debugLineNum = 51;BA.debugLine="Private asPanel As Panel";
appactiondialogs._aspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_aspanel",appactiondialogs._aspanel);
 //BA.debugLineNum = 53;BA.debugLine="Private AS_Status As List, AS_Types As List, AS_P";
appactiondialogs._as_status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_as_status",appactiondialogs._as_status);
appactiondialogs._as_types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_as_types",appactiondialogs._as_types);
appactiondialogs._as_priority = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_as_priority",appactiondialogs._as_priority);
appactiondialogs._as_urgency = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_as_urgency",appactiondialogs._as_urgency);
appactiondialogs._as_modes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_as_modes",appactiondialogs._as_modes);
 //BA.debugLineNum = 54;BA.debugLine="Private pnlGroupTitle As Panel";
appactiondialogs._pnlgrouptitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlgrouptitle",appactiondialogs._pnlgrouptitle);
 //BA.debugLineNum = 55;BA.debugLine="Private lblGroupTitle As Label";
appactiondialogs._lblgrouptitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgrouptitle",appactiondialogs._lblgrouptitle);
 //BA.debugLineNum = 56;BA.debugLine="Private butGroupExpand As Button";
appactiondialogs._butgroupexpand = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butgroupexpand",appactiondialogs._butgroupexpand);
 //BA.debugLineNum = 57;BA.debugLine="Private pnlGroupExpanded As Panel";
appactiondialogs._pnlgroupexpanded = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlgroupexpanded",appactiondialogs._pnlgroupexpanded);
 //BA.debugLineNum = 59;BA.debugLine="Private CurrentIndex As Int = 0";
appactiondialogs._currentindex = BA.numberCast(int.class, 0);__ref.setField("_currentindex",appactiondialogs._currentindex);
 //BA.debugLineNum = 60;BA.debugLine="Private dlgASStatus As Spinner";
appactiondialogs._dlgasstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_dlgasstatus",appactiondialogs._dlgasstatus);
 //BA.debugLineNum = 62;BA.debugLine="Private CurrentImageList As List";
appactiondialogs._currentimagelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_currentimagelist",appactiondialogs._currentimagelist);
 //BA.debugLineNum = 63;BA.debugLine="Private EmailSentOnNewAS As Boolean = False";
appactiondialogs._emailsentonnewas = appactiondialogs.__c.getField(true,"False");__ref.setField("_emailsentonnewas",appactiondialogs._emailsentonnewas);
 //BA.debugLineNum = 64;BA.debugLine="Private CurrentCLAItem As RequestCLAItem";
appactiondialogs._currentclaitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");__ref.setField("_currentclaitem",appactiondialogs._currentclaitem);
 //BA.debugLineNum = 65;BA.debugLine="Private CurrentTagcode As String = \"\"";
appactiondialogs._currenttagcode = BA.ObjectToString("");__ref.setField("_currenttagcode",appactiondialogs._currenttagcode);
 //BA.debugLineNum = 66;BA.debugLine="Private sendEmailImages As Button";
appactiondialogs._sendemailimages = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_sendemailimages",appactiondialogs._sendemailimages);
 //BA.debugLineNum = 67;BA.debugLine="Private sendEmail As Button";
appactiondialogs._sendemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_sendemail",appactiondialogs._sendemail);
 //BA.debugLineNum = 68;BA.debugLine="Private dlgASEmailsCC As FloatLabeledEditText";
appactiondialogs._dlgasemailscc = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dlgasemailscc",appactiondialogs._dlgasemailscc);
 //BA.debugLineNum = 69;BA.debugLine="Private dlgASEmailsSubject As FloatLabeledEditTex";
appactiondialogs._dlgasemailssubject = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dlgasemailssubject",appactiondialogs._dlgasemailssubject);
 //BA.debugLineNum = 70;BA.debugLine="Private imageSelected As Label";
appactiondialogs._imageselected = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imageselected",appactiondialogs._imageselected);
 //BA.debugLineNum = 71;BA.debugLine="Private CLAItem_G1 As Label";
appactiondialogs._claitem_g1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_claitem_g1",appactiondialogs._claitem_g1);
 //BA.debugLineNum = 72;BA.debugLine="Private CLAItemButton_1 As B4XStateButton";
appactiondialogs._claitembutton_1 = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_claitembutton_1",appactiondialogs._claitembutton_1);
 //BA.debugLineNum = 73;BA.debugLine="Private CLAItemButton_2 As B4XStateButton";
appactiondialogs._claitembutton_2 = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_claitembutton_2",appactiondialogs._claitembutton_2);
 //BA.debugLineNum = 74;BA.debugLine="Private CLAButtonOptions As Button";
appactiondialogs._clabuttonoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_clabuttonoptions",appactiondialogs._clabuttonoptions);
 //BA.debugLineNum = 76;BA.debugLine="Private Master_OBS As String = \"\"";
appactiondialogs._master_obs = BA.ObjectToString("");__ref.setField("_master_obs",appactiondialogs._master_obs);
 //BA.debugLineNum = 77;BA.debugLine="Private Master_Image As String = \"\"";
appactiondialogs._master_image = BA.ObjectToString("");__ref.setField("_master_image",appactiondialogs._master_image);
 //BA.debugLineNum = 78;BA.debugLine="Private changeAS As Button";
appactiondialogs._changeas = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_changeas",appactiondialogs._changeas);
 //BA.debugLineNum = 79;BA.debugLine="Private PanelOnTop As Int = 0";
appactiondialogs._panelontop = BA.numberCast(int.class, 0);__ref.setField("_panelontop",appactiondialogs._panelontop);
 //BA.debugLineNum = 80;BA.debugLine="Private asHistory As Panel";
appactiondialogs._ashistory = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_ashistory",appactiondialogs._ashistory);
 //BA.debugLineNum = 82;BA.debugLine="Private IsFastOptionCheck As Boolean = False";
appactiondialogs._isfastoptioncheck = appactiondialogs.__c.getField(true,"False");__ref.setField("_isfastoptioncheck",appactiondialogs._isfastoptioncheck);
 //BA.debugLineNum = 83;BA.debugLine="Private FastOptionCheck As Int = 0";
appactiondialogs._fastoptioncheck = BA.numberCast(int.class, 0);__ref.setField("_fastoptioncheck",appactiondialogs._fastoptioncheck);
 //BA.debugLineNum = 84;BA.debugLine="Private imageSelectedOnReport As Label";
appactiondialogs._imageselectedonreport = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imageselectedonreport",appactiondialogs._imageselectedonreport);
 //BA.debugLineNum = 85;BA.debugLine="Private CLAItemsList As CustomListView";
appactiondialogs._claitemslist = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_claitemslist",appactiondialogs._claitemslist);
 //BA.debugLineNum = 86;BA.debugLine="Private CLAItemEditValue As FloatLabeledEditText";
appactiondialogs._claitemeditvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_claitemeditvalue",appactiondialogs._claitemeditvalue);
 //BA.debugLineNum = 87;BA.debugLine="Private CLAItemLabel As Label";
appactiondialogs._claitemlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_claitemlabel",appactiondialogs._claitemlabel);
 //BA.debugLineNum = 89;BA.debugLine="Private ObjectTagcode As String = \"\" 'innerObject";
appactiondialogs._objecttagcode = BA.ObjectToString("");__ref.setField("_objecttagcode",appactiondialogs._objecttagcode);
 //BA.debugLineNum = 90;BA.debugLine="Private ShowImageView As ImageView";
appactiondialogs._showimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_showimageview",appactiondialogs._showimageview);
 //BA.debugLineNum = 91;BA.debugLine="Private CurrentRequestCLAItem As RequestCLAItem";
appactiondialogs._currentrequestclaitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");__ref.setField("_currentrequestclaitem",appactiondialogs._currentrequestclaitem);
 //BA.debugLineNum = 92;BA.debugLine="Private CurrentItemNotes As EditText";
appactiondialogs._currentitemnotes = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_currentitemnotes",appactiondialogs._currentitemnotes);
 //BA.debugLineNum = 93;BA.debugLine="Private dlgASSubject As EditText";
appactiondialogs._dlgassubject = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_dlgassubject",appactiondialogs._dlgassubject);
 //BA.debugLineNum = 94;BA.debugLine="Private dlgASDetails As EditText";
appactiondialogs._dlgasdetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_dlgasdetails",appactiondialogs._dlgasdetails);
 //BA.debugLineNum = 95;BA.debugLine="Private butASDueDate As Button";
appactiondialogs._butasduedate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_butasduedate",appactiondialogs._butasduedate);
 //BA.debugLineNum = 96;BA.debugLine="Private dlgASDueDate As FloatLabeledEditText";
appactiondialogs._dlgasduedate = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dlgasduedate",appactiondialogs._dlgasduedate);
 //BA.debugLineNum = 97;BA.debugLine="Private associateObject As Button";
appactiondialogs._associateobject = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_associateobject",appactiondialogs._associateobject);
 //BA.debugLineNum = 98;BA.debugLine="Private ImageStateName As Label";
appactiondialogs._imagestatename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imagestatename",appactiondialogs._imagestatename);
 //BA.debugLineNum = 99;BA.debugLine="Private CurrentItemNotesText As String";
appactiondialogs._currentitemnotestext = RemoteObject.createImmutable("");__ref.setField("_currentitemnotestext",appactiondialogs._currentitemnotestext);
 //BA.debugLineNum = 100;BA.debugLine="Private takeSignature As Button";
appactiondialogs._takesignature = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_takesignature",appactiondialogs._takesignature);
 //BA.debugLineNum = 101;BA.debugLine="Private itemSignatures As CustomListView";
appactiondialogs._itemsignatures = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_itemsignatures",appactiondialogs._itemsignatures);
 //BA.debugLineNum = 102;BA.debugLine="Private signaturePanel As Panel";
appactiondialogs._signaturepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_signaturepanel",appactiondialogs._signaturepanel);
 //BA.debugLineNum = 103;BA.debugLine="Private InnerSignatureView As ImageView";
appactiondialogs._innersignatureview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_innersignatureview",appactiondialogs._innersignatureview);
 //BA.debugLineNum = 104;BA.debugLine="Private InnerSignatureOnReport As Label";
appactiondialogs._innersignatureonreport = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_innersignatureonreport",appactiondialogs._innersignatureonreport);
 //BA.debugLineNum = 105;BA.debugLine="Private InnerSignatureRemove As Label";
appactiondialogs._innersignatureremove = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_innersignatureremove",appactiondialogs._innersignatureremove);
 //BA.debugLineNum = 106;BA.debugLine="Private InnerSignatureName As Label";
appactiondialogs._innersignaturename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_innersignaturename",appactiondialogs._innersignaturename);
 //BA.debugLineNum = 107;BA.debugLine="Private PanelSignature As Panel";
appactiondialogs._panelsignature = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panelsignature",appactiondialogs._panelsignature);
 //BA.debugLineNum = 108;BA.debugLine="Private SignPanel As Panel";
appactiondialogs._signpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_signpanel",appactiondialogs._signpanel);
 //BA.debugLineNum = 109;BA.debugLine="Private btnClearSign As Button";
appactiondialogs._btnclearsign = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnclearsign",appactiondialogs._btnclearsign);
 //BA.debugLineNum = 110;BA.debugLine="Private btnSaveSign As Button";
appactiondialogs._btnsavesign = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnsavesign",appactiondialogs._btnsavesign);
 //BA.debugLineNum = 111;BA.debugLine="Private SignPerson As Label";
appactiondialogs._signperson = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_signperson",appactiondialogs._signperson);
 //BA.debugLineNum = 112;BA.debugLine="Dim Signature As SignatureData";
appactiondialogs._signature = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.signaturecapture._signaturedata");__ref.setField("_signature",appactiondialogs._signature);
 //BA.debugLineNum = 113;BA.debugLine="Dim SignCanvas As Canvas";
appactiondialogs._signcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_signcanvas",appactiondialogs._signcanvas);
 //BA.debugLineNum = 114;BA.debugLine="Private InnerSignatureInfo As Label";
appactiondialogs._innersignatureinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_innersignatureinfo",appactiondialogs._innersignatureinfo);
 //BA.debugLineNum = 115;BA.debugLine="Private moreActionQuest As Label";
appactiondialogs._moreactionquest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_moreactionquest",appactiondialogs._moreactionquest);
 //BA.debugLineNum = 116;BA.debugLine="Private moreActionQuest2 As Label";
appactiondialogs._moreactionquest2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_moreactionquest2",appactiondialogs._moreactionquest2);
 //BA.debugLineNum = 117;BA.debugLine="Private moreActionQuest3 As Label";
appactiondialogs._moreactionquest3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_moreactionquest3",appactiondialogs._moreactionquest3);
 //BA.debugLineNum = 118;BA.debugLine="Private takeNewDesign As Button";
appactiondialogs._takenewdesign = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_takenewdesign",appactiondialogs._takenewdesign);
 //BA.debugLineNum = 119;BA.debugLine="Public ItemTitle As String";
appactiondialogs._itemtitle = RemoteObject.createImmutable("");__ref.setField("_itemtitle",appactiondialogs._itemtitle);
 //BA.debugLineNum = 121;BA.debugLine="Private PressedAnswerTagCode As String = \"\"";
appactiondialogs._pressedanswertagcode = BA.ObjectToString("");__ref.setField("_pressedanswertagcode",appactiondialogs._pressedanswertagcode);
 //BA.debugLineNum = 122;BA.debugLine="Private ItemHISTNotes As EditText";
appactiondialogs._itemhistnotes = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_itemhistnotes",appactiondialogs._itemhistnotes);
 //BA.debugLineNum = 123;BA.debugLine="Private itemHISTSignatures As CustomListView";
appactiondialogs._itemhistsignatures = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_itemhistsignatures",appactiondialogs._itemhistsignatures);
 //BA.debugLineNum = 124;BA.debugLine="Private ItemHISTImages As CustomListView";
appactiondialogs._itemhistimages = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_itemhistimages",appactiondialogs._itemhistimages);
 //BA.debugLineNum = 125;BA.debugLine="Private SignPanelView As Panel";
appactiondialogs._signpanelview = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_signpanelview",appactiondialogs._signpanelview);
 //BA.debugLineNum = 126;BA.debugLine="Private btnCancelSign As Button";
appactiondialogs._btncancelsign = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btncancelsign",appactiondialogs._btncancelsign);
 //BA.debugLineNum = 127;BA.debugLine="Private dlgASCCEmails As FloatLabeledEditText";
appactiondialogs._dlgasccemails = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");__ref.setField("_dlgasccemails",appactiondialogs._dlgasccemails);
 //BA.debugLineNum = 128;BA.debugLine="Private imageSelectedTrash As Label";
appactiondialogs._imageselectedtrash = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imageselectedtrash",appactiondialogs._imageselectedtrash);
 //BA.debugLineNum = 129;BA.debugLine="Private ObjectsImages As CustomListView";
appactiondialogs._objectsimages = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_objectsimages",appactiondialogs._objectsimages);
 //BA.debugLineNum = 131;BA.debugLine="Private ItemImageView As ImageView";
appactiondialogs._itemimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_itemimageview",appactiondialogs._itemimageview);
 //BA.debugLineNum = 132;BA.debugLine="Private btnAssociateImage As B4XStateButton";
appactiondialogs._btnassociateimage = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_btnassociateimage",appactiondialogs._btnassociateimage);
 //BA.debugLineNum = 133;BA.debugLine="Private AssociateImagesList As List";
appactiondialogs._associateimageslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_associateimageslist",appactiondialogs._associateimageslist);
 //BA.debugLineNum = 134;BA.debugLine="Private AssociateImagesCompleteList As List";
appactiondialogs._associateimagescompletelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_associateimagescompletelist",appactiondialogs._associateimagescompletelist);
 //BA.debugLineNum = 135;BA.debugLine="Private lblObjectImageTitle As Label";
appactiondialogs._lblobjectimagetitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblobjectimagetitle",appactiondialogs._lblobjectimagetitle);
 //BA.debugLineNum = 136;BA.debugLine="Private editAS As Button";
appactiondialogs._editas = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_editas",appactiondialogs._editas);
 //BA.debugLineNum = 137;BA.debugLine="Private CurrentASTagcode As String = \"\"";
appactiondialogs._currentastagcode = BA.ObjectToString("");__ref.setField("_currentastagcode",appactiondialogs._currentastagcode);
 //BA.debugLineNum = 138;BA.debugLine="Private AvisoNoImages As Label";
appactiondialogs._avisonoimages = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_avisonoimages",appactiondialogs._avisonoimages);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createasinneritempanel(RemoteObject __ref,RemoteObject _this,RemoteObject _datarecord) throws Exception{
try {
		Debug.PushSubsStack("CreateASInnerItemPanel (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1010);
if (RapidSub.canDelegate("createasinneritempanel")) { return __ref.runUserSub(false, "appactiondialogs","createasinneritempanel", __ref, _this, _datarecord);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("this", _this);
Debug.locals.put("dataRecord", _datarecord);
 BA.debugLineNum = 1010;BA.debugLine="Sub CreateASInnerItemPanel(this As RequestCLAItem,";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1011;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1012;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(524288);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1013;BA.debugLine="CurrentActivity.AddView(p, 0, 0, pnlGroupExpanded";
Debug.ShouldStop(1048576);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_pnlgroupexpanded" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))));
 BA.debugLineNum = 1014;BA.debugLine="p.LoadLayout(\"ItemList_More_Action\")";
Debug.ShouldStop(2097152);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemList_More_Action")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1015;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4194304);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1016;BA.debugLine="ItemASDetails.Text = dataRecord.GetString(\"detail";
Debug.ShouldStop(8388608);
__ref.getField(false,"_itemasdetails" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")))));
 BA.debugLineNum = 1017;BA.debugLine="ItemASAssign.Text = dataRecord.GetString(\"assigne";
Debug.ShouldStop(16777216);
__ref.getField(false,"_itemasassign" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("assigned_to")))));
 BA.debugLineNum = 1018;BA.debugLine="ItemASEmails.Text = dataRecord.GetString(\"email_t";
Debug.ShouldStop(33554432);
__ref.getField(false,"_itemasemails" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("email_to")))));
 BA.debugLineNum = 1019;BA.debugLine="ItemASRelated.Text = \"\" 'dataRecord.GetString(\"re";
Debug.ShouldStop(67108864);
__ref.getField(false,"_itemasrelated" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1020;BA.debugLine="ItemASPriority.Text = dataRecord.GetString(\"prior";
Debug.ShouldStop(134217728);
__ref.getField(false,"_itemaspriority" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("priority_desc")))));
 BA.debugLineNum = 1021;BA.debugLine="ItemASUrgency.Text = dataRecord.GetString(\"urgenc";
Debug.ShouldStop(268435456);
__ref.getField(false,"_itemasurgency" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("urgency_desc")))));
 BA.debugLineNum = 1022;BA.debugLine="p.Tag = this";
Debug.ShouldStop(536870912);
_p.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1023;BA.debugLine="Return p";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 1024;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createasitempanel(RemoteObject __ref,RemoteObject _this,RemoteObject _id,RemoteObject _datarecord,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("CreateASItemPanel (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,993);
if (RapidSub.canDelegate("createasitempanel")) { return __ref.runUserSub(false, "appactiondialogs","createasitempanel", __ref, _this, _id, _datarecord, _idx);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("this", _this);
Debug.locals.put("id", _id);
Debug.locals.put("dataRecord", _datarecord);
Debug.locals.put("idx", _idx);
 BA.debugLineNum = 993;BA.debugLine="Sub CreateASItemPanel(this As RequestCLAItem, id A";
Debug.ShouldStop(1);
 BA.debugLineNum = 995;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 996;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, asHistoryList.sv.Wid";
Debug.ShouldStop(8);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_ashistorylist" /*RemoteObject*/ ).getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_id.getField(true,"ExpandedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 997;BA.debugLine="p.LoadLayout(\"ItemList_More_GroupAction\")";
Debug.ShouldStop(16);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ItemList_More_GroupAction")),__ref.getField(false, "ba"));
 BA.debugLineNum = 998;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, asHistoryList.sv.Wid";
Debug.ShouldStop(32);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_ashistorylist" /*RemoteObject*/ ).getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_id.getField(true,"CollapsedHeight" /*RemoteObject*/ )));
 BA.debugLineNum = 999;BA.debugLine="lblGroupTitle.Text = $\"${dataRecord.GetString(\"ac";
Debug.ShouldStop(64);
__ref.getField(false,"_lblgrouptitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("actiondatetime")))))),RemoteObject.createImmutable(" - ("),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_desc")))))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 1000;BA.debugLine="pnlGroupExpanded.AddView(CreateASInnerItemPanel(t";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlgroupexpanded" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createasinneritempanel" /*RemoteObject*/ ,(Object)(_this),(Object)(_datarecord)).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appactiondialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))));
 BA.debugLineNum = 1002;BA.debugLine="lblGroupTitle.Tag = idx";
Debug.ShouldStop(512);
__ref.getField(false,"_lblgrouptitle" /*RemoteObject*/ ).runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1003;BA.debugLine="pnlGroupTitle.Tag = idx";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnlgrouptitle" /*RemoteObject*/ ).runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1004;BA.debugLine="butGroupExpand.Tag = idx";
Debug.ShouldStop(2048);
__ref.getField(false,"_butgroupexpand" /*RemoteObject*/ ).runMethod(false,"setTag",(_idx));
 BA.debugLineNum = 1006;BA.debugLine="p.Tag = False";
Debug.ShouldStop(8192);
_p.runMethod(false,"setTag",(appactiondialogs.__c.getField(true,"False")));
 BA.debugLineNum = 1007;BA.debugLine="Return p";
Debug.ShouldStop(16384);
if (true) return _p;
 BA.debugLineNum = 1008;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createaspanel(RemoteObject __ref,RemoteObject _this,RemoteObject _havedata,RemoteObject _datarecord) throws Exception{
try {
		Debug.PushSubsStack("CreateASPanel (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,971);
if (RapidSub.canDelegate("createaspanel")) { return __ref.runUserSub(false, "appactiondialogs","createaspanel", __ref, _this, _havedata, _datarecord);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("this", _this);
Debug.locals.put("haveData", _havedata);
Debug.locals.put("dataRecord", _datarecord);
 BA.debugLineNum = 971;BA.debugLine="Sub CreateASPanel(this As RequestCLAItem, haveData";
Debug.ShouldStop(1024);
 BA.debugLineNum = 972;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 973;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4096);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 974;BA.debugLine="CurrentActivity.AddView(p, 0, 1dip, 100%x,100%y)";
Debug.ShouldStop(8192);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(appactiondialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appactiondialogs.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 975;BA.debugLine="p.LoadLayout(\"ItemList_More_ActionLast\")";
Debug.ShouldStop(16384);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ItemList_More_ActionLast")),__ref.getField(false, "ba"));
 BA.debugLineNum = 976;BA.debugLine="p.RemoveView";
Debug.ShouldStop(32768);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 978;BA.debugLine="If (haveData) Then";
Debug.ShouldStop(131072);
if ((_havedata).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 979;BA.debugLine="ItemASDetails.Text = dataRecord.GetString(\"detai";
Debug.ShouldStop(262144);
__ref.getField(false,"_itemasdetails" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")))));
 BA.debugLineNum = 980;BA.debugLine="ItemASAssign.Text = dataRecord.GetString(\"assign";
Debug.ShouldStop(524288);
__ref.getField(false,"_itemasassign" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("assigned_to")))));
 BA.debugLineNum = 981;BA.debugLine="ItemASEmails.Text = dataRecord.GetString(\"email_";
Debug.ShouldStop(1048576);
__ref.getField(false,"_itemasemails" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("email_to")))));
 BA.debugLineNum = 982;BA.debugLine="ItemASRelated.Text = \"\" 'dataRecord.GetString(\"r";
Debug.ShouldStop(2097152);
__ref.getField(false,"_itemasrelated" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 983;BA.debugLine="ItemASDatetime.Text = dataRecord.GetString(\"due_";
Debug.ShouldStop(4194304);
__ref.getField(false,"_itemasdatetime" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("due_date")))));
 BA.debugLineNum = 984;BA.debugLine="ItemASPriority.Text = dataRecord.GetString(\"prio";
Debug.ShouldStop(8388608);
__ref.getField(false,"_itemaspriority" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("priority_desc")))));
 BA.debugLineNum = 985;BA.debugLine="ItemASUrgency.Text = dataRecord.GetString(\"urgen";
Debug.ShouldStop(16777216);
__ref.getField(false,"_itemasurgency" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("urgency_desc")))));
 BA.debugLineNum = 986;BA.debugLine="ItemASState.Text = dataRecord.GetString(\"status_";
Debug.ShouldStop(33554432);
__ref.getField(false,"_itemasstate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datarecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_desc")))));
 };
 BA.debugLineNum = 989;BA.debugLine="p.Tag = this";
Debug.ShouldStop(268435456);
_p.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 990;BA.debugLine="Return p";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 991;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createassociateimagesfromobjectpanel(RemoteObject __ref,RemoteObject _this,RemoteObject _filename,RemoteObject _btm,RemoteObject _state,RemoteObject _innertag) throws Exception{
try {
		Debug.PushSubsStack("CreateAssociateImagesFromObjectPanel (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3696);
if (RapidSub.canDelegate("createassociateimagesfromobjectpanel")) { return __ref.runUserSub(false, "appactiondialogs","createassociateimagesfromobjectpanel", __ref, _this, _filename, _btm, _state, _innertag);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("this", _this);
Debug.locals.put("filename", _filename);
Debug.locals.put("btm", _btm);
Debug.locals.put("state", _state);
Debug.locals.put("innerTag", _innertag);
 BA.debugLineNum = 3696;BA.debugLine="Sub CreateAssociateImagesFromObjectPanel(this As R";
Debug.ShouldStop(32768);
 BA.debugLineNum = 3697;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(65536);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3698;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
Debug.ShouldStop(131072);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3703;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x,130dip)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appactiondialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 3704;BA.debugLine="p.LoadLayout(\"object_image_item\")";
Debug.ShouldStop(8388608);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("object_image_item")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3705;BA.debugLine="p.RemoveView";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 3707;BA.debugLine="If (Utils.NNE(btm)) Then";
Debug.ShouldStop(67108864);
if ((appactiondialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_btm))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3708;BA.debugLine="ItemImageView.SetBackgroundImage(Utils.B64ToBitm";
Debug.ShouldStop(134217728);
__ref.getField(false,"_itemimageview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((appactiondialogs._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_btm)).getObject())));
 BA.debugLineNum = 3709;BA.debugLine="btnAssociateImage.Tag = filename";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnassociateimage" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,(_filename));
 };
 BA.debugLineNum = 3722;BA.debugLine="ItemImageView.Tag = this";
Debug.ShouldStop(512);
__ref.getField(false,"_itemimageview" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 3727;BA.debugLine="p.Tag = this";
Debug.ShouldStop(16384);
_p.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 3728;BA.debugLine="Return p";
Debug.ShouldStop(32768);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 3729;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createassociateimagesfromobjectpaneltitle(RemoteObject __ref,RemoteObject _this,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("CreateAssociateImagesFromObjectPanelTitle (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3731);
if (RapidSub.canDelegate("createassociateimagesfromobjectpaneltitle")) { return __ref.runUserSub(false, "appactiondialogs","createassociateimagesfromobjectpaneltitle", __ref, _this, _title);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("this", _this);
Debug.locals.put("title", _title);
 BA.debugLineNum = 3731;BA.debugLine="Sub CreateAssociateImagesFromObjectPanelTitle(this";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3732;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3733;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
Debug.ShouldStop(1048576);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3738;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 75dip)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appactiondialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 75)))));
 BA.debugLineNum = 3739;BA.debugLine="p.LoadLayout(\"object_image_title\")";
Debug.ShouldStop(67108864);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("object_image_title")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3740;BA.debugLine="p.RemoveView";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 3741;BA.debugLine="lblObjectImageTitle.Text = title";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblobjectimagetitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 3758;BA.debugLine="p.Tag = this";
Debug.ShouldStop(8192);
_p.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 3759;BA.debugLine="Return p";
Debug.ShouldStop(16384);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 3760;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcanvas(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateCanvas (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1490);
if (RapidSub.canDelegate("createcanvas")) { return __ref.runUserSub(false, "appactiondialogs","createcanvas", __ref, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 1490;BA.debugLine="Private Sub CreateCanvas(width As Int, height As I";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1491;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1492;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, height)";
Debug.ShouldStop(524288);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 1493;BA.debugLine="Dim cvs As B4XCanvas";
Debug.ShouldStop(1048576);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 1494;BA.debugLine="cvs.Initialize(p)";
Debug.ShouldStop(2097152);
_cvs.runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 1495;BA.debugLine="Return cvs";
Debug.ShouldStop(4194304);
if (true) return _cvs;
 BA.debugLineNum = 1496;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimagepanel(RemoteObject __ref,RemoteObject _this,RemoteObject _filename,RemoteObject _btm,RemoteObject _state,RemoteObject _innertag) throws Exception{
try {
		Debug.PushSubsStack("CreateImagePanel (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1159);
if (RapidSub.canDelegate("createimagepanel")) { return __ref.runUserSub(false, "appactiondialogs","createimagepanel", __ref, _this, _filename, _btm, _state, _innertag);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("this", _this);
Debug.locals.put("filename", _filename);
Debug.locals.put("btm", _btm);
Debug.locals.put("state", _state);
Debug.locals.put("innerTag", _innertag);
 BA.debugLineNum = 1159;BA.debugLine="Sub CreateImagePanel(this As RequestCLAItem, filen";
Debug.ShouldStop(64);
 BA.debugLineNum = 1160;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1161;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
Debug.ShouldStop(256);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1162;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)";
Debug.ShouldStop(512);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appactiondialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 1163;BA.debugLine="p.LoadLayout(\"CLA_MORE_IMGAGE_Listview\")";
Debug.ShouldStop(1024);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CLA_MORE_IMGAGE_Listview")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1164;BA.debugLine="p.RemoveView";
Debug.ShouldStop(2048);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1166;BA.debugLine="If (Utils.NNE(btm)) Then";
Debug.ShouldStop(8192);
if ((appactiondialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_btm))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1167;BA.debugLine="ShowImage.SetBackgroundImage(Utils.B64ToBitmap(b";
Debug.ShouldStop(16384);
__ref.getField(false,"_showimage" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((appactiondialogs._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_btm)).getObject())));
 BA.debugLineNum = 1168;BA.debugLine="ShowImage.Tag = innerTag";
Debug.ShouldStop(32768);
__ref.getField(false,"_showimage" /*RemoteObject*/ ).runMethod(false,"setTag",(_innertag));
 };
 BA.debugLineNum = 1172;BA.debugLine="ImageFilename.Text = filename";
Debug.ShouldStop(524288);
__ref.getField(false,"_imagefilename" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_filename));
 BA.debugLineNum = 1173;BA.debugLine="ImageFilename.Tag = innerTag";
Debug.ShouldStop(1048576);
__ref.getField(false,"_imagefilename" /*RemoteObject*/ ).runMethod(false,"setTag",(_innertag));
 BA.debugLineNum = 1174;BA.debugLine="ImageStateName.Text = \"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_imagestatename" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1175;BA.debugLine="ImageStateName.Tag = state";
Debug.ShouldStop(4194304);
__ref.getField(false,"_imagestatename" /*RemoteObject*/ ).runMethod(false,"setTag",(_state));
 BA.debugLineNum = 1176;BA.debugLine="imageSelected.Tag = 0";
Debug.ShouldStop(8388608);
__ref.getField(false,"_imageselected" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1177;BA.debugLine="imageSelected.TextColor = Consts.ColorLightSilver";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imageselected" /*RemoteObject*/ ).runMethod(true,"setTextColor",appactiondialogs._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1178;BA.debugLine="imageSelectedOnReport.TextColor = Consts.ColorLig";
Debug.ShouldStop(33554432);
__ref.getField(false,"_imageselectedonreport" /*RemoteObject*/ ).runMethod(true,"setTextColor",appactiondialogs._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1179;BA.debugLine="imageSelectedOnReport.Tag = this";
Debug.ShouldStop(67108864);
__ref.getField(false,"_imageselectedonreport" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1180;BA.debugLine="If (this.OnReport = 1) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",_this.getField(true,"OnReport" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1181;BA.debugLine="imageSelectedOnReport.TextColor = Consts.ColorGr";
Debug.ShouldStop(268435456);
__ref.getField(false,"_imageselectedonreport" /*RemoteObject*/ ).runMethod(true,"setTextColor",appactiondialogs._consts._colorgreen /*RemoteObject*/ );
 };
 BA.debugLineNum = 1189;BA.debugLine="p.Tag = this";
Debug.ShouldStop(16);
_p.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1190;BA.debugLine="Return p";
Debug.ShouldStop(32);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 1191;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimagepanelbmp(RemoteObject __ref,RemoteObject _this,RemoteObject _filename,RemoteObject _btm,RemoteObject _state,RemoteObject _innertag) throws Exception{
try {
		Debug.PushSubsStack("CreateImagePanelBMP (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1196);
if (RapidSub.canDelegate("createimagepanelbmp")) { return __ref.runUserSub(false, "appactiondialogs","createimagepanelbmp", __ref, _this, _filename, _btm, _state, _innertag);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("this", _this);
Debug.locals.put("filename", _filename);
Debug.locals.put("btm", _btm);
Debug.locals.put("state", _state);
Debug.locals.put("innerTag", _innertag);
 BA.debugLineNum = 1196;BA.debugLine="Sub CreateImagePanelBMP(this As RequestCLAItem, fi";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1197;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1198;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
Debug.ShouldStop(8192);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1199;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)";
Debug.ShouldStop(16384);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appactiondialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 1200;BA.debugLine="p.LoadLayout(\"CLA_MORE_IMGAGE_Listview\")";
Debug.ShouldStop(32768);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CLA_MORE_IMGAGE_Listview")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1201;BA.debugLine="p.RemoveView";
Debug.ShouldStop(65536);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1203;BA.debugLine="ShowImage.SetBackgroundImage(btm)";
Debug.ShouldStop(262144);
__ref.getField(false,"_showimage" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((_btm.getObject())));
 BA.debugLineNum = 1204;BA.debugLine="ShowImage.Tag = innerTag";
Debug.ShouldStop(524288);
__ref.getField(false,"_showimage" /*RemoteObject*/ ).runMethod(false,"setTag",(_innertag));
 BA.debugLineNum = 1206;BA.debugLine="ImageFilename.Text = filename";
Debug.ShouldStop(2097152);
__ref.getField(false,"_imagefilename" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_filename));
 BA.debugLineNum = 1207;BA.debugLine="ImageFilename.Tag = innerTag";
Debug.ShouldStop(4194304);
__ref.getField(false,"_imagefilename" /*RemoteObject*/ ).runMethod(false,"setTag",(_innertag));
 BA.debugLineNum = 1208;BA.debugLine="ImageStateName.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_imagestatename" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1209;BA.debugLine="ImageStateName.Tag = state";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imagestatename" /*RemoteObject*/ ).runMethod(false,"setTag",(_state));
 BA.debugLineNum = 1210;BA.debugLine="imageSelected.Tag = 0";
Debug.ShouldStop(33554432);
__ref.getField(false,"_imageselected" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1211;BA.debugLine="imageSelected.TextColor = Consts.ColorLightSilver";
Debug.ShouldStop(67108864);
__ref.getField(false,"_imageselected" /*RemoteObject*/ ).runMethod(true,"setTextColor",appactiondialogs._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1212;BA.debugLine="imageSelectedOnReport.TextColor = Consts.ColorLig";
Debug.ShouldStop(134217728);
__ref.getField(false,"_imageselectedonreport" /*RemoteObject*/ ).runMethod(true,"setTextColor",appactiondialogs._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1213;BA.debugLine="imageSelectedOnReport.Tag = this";
Debug.ShouldStop(268435456);
__ref.getField(false,"_imageselectedonreport" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1214;BA.debugLine="If (this.OnReport = 1) Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("=",_this.getField(true,"OnReport" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1215;BA.debugLine="imageSelectedOnReport.TextColor = Consts.ColorGr";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_imageselectedonreport" /*RemoteObject*/ ).runMethod(true,"setTextColor",appactiondialogs._consts._colorgreen /*RemoteObject*/ );
 };
 BA.debugLineNum = 1217;BA.debugLine="p.Tag = this";
Debug.ShouldStop(1);
_p.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1218;BA.debugLine="Return p";
Debug.ShouldStop(2);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 1219;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsignaturepanel(RemoteObject __ref,RemoteObject _this,RemoteObject _filename,RemoteObject _btm,RemoteObject _state,RemoteObject _innertag) throws Exception{
try {
		Debug.PushSubsStack("CreateSignaturePanel (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1224);
if (RapidSub.canDelegate("createsignaturepanel")) { return __ref.runUserSub(false, "appactiondialogs","createsignaturepanel", __ref, _this, _filename, _btm, _state, _innertag);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("this", _this);
Debug.locals.put("filename", _filename);
Debug.locals.put("btm", _btm);
Debug.locals.put("state", _state);
Debug.locals.put("innerTag", _innertag);
 BA.debugLineNum = 1224;BA.debugLine="Sub CreateSignaturePanel(this As RequestCLAItem, f";
Debug.ShouldStop(128);
 BA.debugLineNum = 1225;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1226;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
Debug.ShouldStop(512);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1227;BA.debugLine="Dim width As Int = 260dip";
Debug.ShouldStop(1024);
_width = appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 260)));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 1228;BA.debugLine="If (ShareCode.DEVICE_ORIENTATION = 1) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",appactiondialogs._sharecode._device_orientation /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1229;BA.debugLine="width = 200dip";
Debug.ShouldStop(4096);
_width = appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)));Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 1231;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)";
Debug.ShouldStop(16384);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appactiondialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 1232;BA.debugLine="p.LoadLayout(\"CLA_MORE_Signature\")";
Debug.ShouldStop(32768);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CLA_MORE_Signature")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1233;BA.debugLine="p.RemoveView";
Debug.ShouldStop(65536);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1235;BA.debugLine="If (Utils.NNE(btm)) Then";
Debug.ShouldStop(262144);
if ((appactiondialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_btm))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1236;BA.debugLine="InnerSignatureView.SetBackgroundImage(Utils.B64T";
Debug.ShouldStop(524288);
__ref.getField(false,"_innersignatureview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((appactiondialogs._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_btm)).getObject())));
 };
 BA.debugLineNum = 1238;BA.debugLine="InnerSignatureName.Text = filename";
Debug.ShouldStop(2097152);
__ref.getField(false,"_innersignaturename" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_filename));
 BA.debugLineNum = 1239;BA.debugLine="InnerSignatureInfo.Text = innerTag";
Debug.ShouldStop(4194304);
__ref.getField(false,"_innersignatureinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_innertag));
 BA.debugLineNum = 1241;BA.debugLine="If (this.OnReport = 1) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_this.getField(true,"OnReport" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1242;BA.debugLine="InnerSignatureOnReport.TextColor = Consts.ColorG";
Debug.ShouldStop(33554432);
__ref.getField(false,"_innersignatureonreport" /*RemoteObject*/ ).runMethod(true,"setTextColor",appactiondialogs._consts._colorgreen /*RemoteObject*/ );
 };
 BA.debugLineNum = 1244;BA.debugLine="InnerSignatureView.Tag = this";
Debug.ShouldStop(134217728);
__ref.getField(false,"_innersignatureview" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1245;BA.debugLine="InnerSignatureOnReport.Tag = this";
Debug.ShouldStop(268435456);
__ref.getField(false,"_innersignatureonreport" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1246;BA.debugLine="InnerSignatureRemove.Tag = this";
Debug.ShouldStop(536870912);
__ref.getField(false,"_innersignatureremove" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1247;BA.debugLine="InnerSignatureInfo.Tag = this";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_innersignatureinfo" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1249;BA.debugLine="p.Tag = this";
Debug.ShouldStop(1);
_p.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1250;BA.debugLine="Return p";
Debug.ShouldStop(2);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 1251;BA.debugLine="End Sub  'CreateSignaturePanel";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsignaturepanelbmp(RemoteObject __ref,RemoteObject _this,RemoteObject _filename,RemoteObject _btm,RemoteObject _state,RemoteObject _innertag) throws Exception{
try {
		Debug.PushSubsStack("CreateSignaturePanelBMP (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1256);
if (RapidSub.canDelegate("createsignaturepanelbmp")) { return __ref.runUserSub(false, "appactiondialogs","createsignaturepanelbmp", __ref, _this, _filename, _btm, _state, _innertag);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("this", _this);
Debug.locals.put("filename", _filename);
Debug.locals.put("btm", _btm);
Debug.locals.put("state", _state);
Debug.locals.put("innerTag", _innertag);
 BA.debugLineNum = 1256;BA.debugLine="Sub CreateSignaturePanelBMP(this As RequestCLAItem";
Debug.ShouldStop(128);
 BA.debugLineNum = 1257;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1258;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
Debug.ShouldStop(512);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1259;BA.debugLine="Dim width As Int = 260dip";
Debug.ShouldStop(1024);
_width = appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 260)));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 1260;BA.debugLine="If (ShareCode.DEVICE_ORIENTATION = 1) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",appactiondialogs._sharecode._device_orientation /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1261;BA.debugLine="width = 200dip";
Debug.ShouldStop(4096);
_width = appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)));Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 1263;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)";
Debug.ShouldStop(16384);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appactiondialogs.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 1264;BA.debugLine="p.LoadLayout(\"CLA_MORE_Signature\")";
Debug.ShouldStop(32768);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CLA_MORE_Signature")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1265;BA.debugLine="p.RemoveView";
Debug.ShouldStop(65536);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1266;BA.debugLine="InnerSignatureView.SetBackgroundImage(btm)";
Debug.ShouldStop(131072);
__ref.getField(false,"_innersignatureview" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((_btm.getObject())));
 BA.debugLineNum = 1267;BA.debugLine="InnerSignatureName.Text = filename";
Debug.ShouldStop(262144);
__ref.getField(false,"_innersignaturename" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_filename));
 BA.debugLineNum = 1268;BA.debugLine="InnerSignatureInfo.Text = innerTag";
Debug.ShouldStop(524288);
__ref.getField(false,"_innersignatureinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_innertag));
 BA.debugLineNum = 1270;BA.debugLine="If (this.OnReport = 1) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",_this.getField(true,"OnReport" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1271;BA.debugLine="InnerSignatureOnReport.TextColor = Consts.ColorG";
Debug.ShouldStop(4194304);
__ref.getField(false,"_innersignatureonreport" /*RemoteObject*/ ).runMethod(true,"setTextColor",appactiondialogs._consts._colorgreen /*RemoteObject*/ );
 };
 BA.debugLineNum = 1273;BA.debugLine="InnerSignatureView.Tag = this";
Debug.ShouldStop(16777216);
__ref.getField(false,"_innersignatureview" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1274;BA.debugLine="InnerSignatureOnReport.Tag = this";
Debug.ShouldStop(33554432);
__ref.getField(false,"_innersignatureonreport" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1275;BA.debugLine="InnerSignatureRemove.Tag = this";
Debug.ShouldStop(67108864);
__ref.getField(false,"_innersignatureremove" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1276;BA.debugLine="InnerSignatureInfo.Tag = this";
Debug.ShouldStop(134217728);
__ref.getField(false,"_innersignatureinfo" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1278;BA.debugLine="p.Tag = this";
Debug.ShouldStop(536870912);
_p.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1279;BA.debugLine="Return p";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 1280;BA.debugLine="End Sub  'CreateSignaturePanel";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _deleteimagefromlist(RemoteObject __ref,RemoteObject _thispanel,RemoteObject _this,RemoteObject _fname) throws Exception{
try {
		Debug.PushSubsStack("DeleteImageFromList (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3377);
if (RapidSub.canDelegate("deleteimagefromlist")) { __ref.runUserSub(false, "appactiondialogs","deleteimagefromlist", __ref, _thispanel, _this, _fname); return;}
ResumableSub_DeleteImageFromList rsub = new ResumableSub_DeleteImageFromList(null,__ref,_thispanel,_this,_fname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DeleteImageFromList extends BA.ResumableSub {
public ResumableSub_DeleteImageFromList(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _thispanel,RemoteObject _this,RemoteObject _fname) {
this.parent = parent;
this.__ref = __ref;
this._thispanel = _thispanel;
this._this = _this;
this._fname = _fname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _thispanel;
RemoteObject _this;
RemoteObject _fname;
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _listviewindex = RemoteObject.createImmutable(0);
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteImageFromList (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3377);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("thisPanel", _thispanel);
Debug.locals.put("this", _this);
Debug.locals.put("fname", _fname);
 BA.debugLineNum = 3379;BA.debugLine="Dim Index As Int = ItemImages.GetItemFromView(thi";
Debug.ShouldStop(262144);
_index = __ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",(Object)(_thispanel));Debug.locals.put("Index", _index);Debug.locals.put("Index", _index);
 BA.debugLineNum = 3380;BA.debugLine="If (this.BaseImage = 1) Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("=",_this.getField(true,"BaseImage" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 3381;BA.debugLine="MsgboxAsync(\"A imagem seleccionada é uma imagem";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("A imagem seleccionada é uma imagem BASE e não pode ser apagada!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta!"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3384;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.CLAImageRemove,";
Debug.ShouldStop(8388608);
_i = parent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent._sharecode._claimageremove /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))),__ref.getField(false, "ba"));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 3385;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 6:
//if
this.state = 19;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 3387;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
Debug.ShouldStop(67108864);
_this = (_thispanel.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 3388;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
Debug.ShouldStop(134217728);
_fname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _thispanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fname", _fname);
 BA.debugLineNum = 3390;BA.debugLine="Dim sSQL As String = $\"delete from dta_requests";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("									item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and imagename='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fname.runMethod(true,"getText")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									And repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("									And repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("									And repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3396;BA.debugLine="Utils.SaveSQLToLog(\"ItemImages_ItemLongClick\",s";
Debug.ShouldStop(8);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ItemImages_ItemLongClick")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 3398;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","670451221",_ssql,0);
 BA.debugLineNum = 3399;BA.debugLine="ItemImages.RemoveAt(Index)";
Debug.ShouldStop(64);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 3400;BA.debugLine="Dim listviewIndex As Int = AssociateImagesCompl";
Debug.ShouldStop(128);
_listviewindex = __ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_fname.runMethod(true,"getText"))));Debug.locals.put("listviewIndex", _listviewindex);Debug.locals.put("listviewIndex", _listviewindex);
 BA.debugLineNum = 3401;BA.debugLine="AssociateImagesCompleteList.RemoveAt(listviewIn";
Debug.ShouldStop(256);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_listviewindex));
 BA.debugLineNum = 3404;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2048);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3405;BA.debugLine="params.Initialize";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3406;BA.debugLine="params.Clear";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3407;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3408;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 3409;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 3410;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 3411;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 3412;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 3413;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 3414;BA.debugLine="params.Put(\"ACLAValueFileImage\", fname.Text)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_fname.runMethod(true,"getText"))));
 BA.debugLineNum = 3416;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3417;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCou";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3418;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3419;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3420;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3421;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3422;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3423;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3424;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3425;BA.debugLine="If (params.IsInitialized) Then";
Debug.ShouldStop(1);
if (true) break;

case 9:
//if
this.state = 18;
if ((_params.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3428;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(8);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/delete")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3429;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(16);
if (true) break;

case 12:
//if
this.state = 17;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 3430;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
Debug.ShouldStop(32);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 3432;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(128);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3433;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(256);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 3435;BA.debugLine="Sleep(250)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "deleteimagefromlist"),BA.numberCast(int.class, 250));
this.state = 21;
return;
case 21:
//C
this.state = 18;
;
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
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 3440;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _dlgasassign_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("dlgASAssign_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1030);
if (RapidSub.canDelegate("dlgasassign_itemclick")) { return __ref.runUserSub(false, "appactiondialogs","dlgasassign_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1030;BA.debugLine="Sub dlgASAssign_ItemClick (Position As Int, Value";
Debug.ShouldStop(32);
 BA.debugLineNum = 1032;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dlgassendemail_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("dlgASSendEmail_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1026);
if (RapidSub.canDelegate("dlgassendemail_click")) { return __ref.runUserSub(false, "appactiondialogs","dlgassendemail_click", __ref);}
 BA.debugLineNum = 1026;BA.debugLine="Sub dlgASSendEmail_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1028;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dlgastype_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("dlgASType_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3107);
if (RapidSub.canDelegate("dlgastype_itemclick")) { return __ref.runUserSub(false, "appactiondialogs","dlgastype_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3107;BA.debugLine="Sub dlgASType_ItemClick (Position As Int, Value As";
Debug.ShouldStop(4);
 BA.debugLineNum = 3120;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editas_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("editAS_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1049);
if (RapidSub.canDelegate("editas_click")) { return __ref.runUserSub(false, "appactiondialogs","editas_click", __ref);}
RemoteObject _thisbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _mytag = RemoteObject.createImmutable("");
RemoteObject _thetagcode = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
 BA.debugLineNum = 1049;BA.debugLine="Sub editAS_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1050;BA.debugLine="Dim thisButton As Button = Sender";
Debug.ShouldStop(33554432);
_thisbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_thisbutton = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("thisButton", _thisbutton);
 BA.debugLineNum = 1051;BA.debugLine="Dim myTag As String = thisButton.Tag";
Debug.ShouldStop(67108864);
_mytag = BA.ObjectToString(_thisbutton.runMethod(false,"getTag"));Debug.locals.put("myTag", _mytag);Debug.locals.put("myTag", _mytag);
 BA.debugLineNum = 1053;BA.debugLine="Dim theTagcode As String = CurrentCLAItem.Tagcode";
Debug.ShouldStop(268435456);
_thetagcode = __ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim");Debug.locals.put("theTagcode", _thetagcode);Debug.locals.put("theTagcode", _thetagcode);
 BA.debugLineNum = 1054;BA.debugLine="If Utils.NNE(PressedAnswerTagCode) Then";
Debug.ShouldStop(536870912);
if (appactiondialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_pressedanswertagcode" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1055;BA.debugLine="theTagcode = PressedAnswerTagCode";
Debug.ShouldStop(1073741824);
_thetagcode = __ref.getField(true,"_pressedanswertagcode" /*RemoteObject*/ );Debug.locals.put("theTagcode", _thetagcode);
 };
 BA.debugLineNum = 1058;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(2);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1059;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(4);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1060;BA.debugLine="Filter.GetMoreEditActionsDialog(ThisActivityName_";
Debug.ShouldStop(8);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getmoreeditactionsdialog" /*void*/ ,(Object)(__ref.getField(false,"_thisactivityname_tasklistdialog" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ )),(Object)(_mytag),(Object)(__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )),(Object)(appactiondialogs.__c.getField(true,"True")),(Object)(_thetagcode),(Object)(__ref.getField(false,"_currentcld" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1062;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getfastactiondialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _claitem,RemoteObject _title,RemoteObject _quest,RemoteObject _tagcode,RemoteObject _actstate,RemoteObject _disableall,RemoteObject _record) throws Exception{
try {
		Debug.PushSubsStack("GetFastActionDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3179);
if (RapidSub.canDelegate("getfastactiondialog")) { __ref.runUserSub(false, "appactiondialogs","getfastactiondialog", __ref, _activ, _claitem, _title, _quest, _tagcode, _actstate, _disableall, _record); return;}
ResumableSub_GetFastActionDialog rsub = new ResumableSub_GetFastActionDialog(null,__ref,_activ,_claitem,_title,_quest,_tagcode,_actstate,_disableall,_record);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetFastActionDialog extends BA.ResumableSub {
public ResumableSub_GetFastActionDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _claitem,RemoteObject _title,RemoteObject _quest,RemoteObject _tagcode,RemoteObject _actstate,RemoteObject _disableall,RemoteObject _record) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._claitem = _claitem;
this._title = _title;
this._quest = _quest;
this._tagcode = _tagcode;
this._actstate = _actstate;
this._disableall = _disableall;
this._record = _record;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _activ;
RemoteObject _claitem;
RemoteObject _title;
RemoteObject _quest;
RemoteObject _tagcode;
RemoteObject _actstate;
RemoteObject _disableall;
RemoteObject _record;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _yesno_2_height = RemoteObject.createImmutable(0);
RemoteObject _yesno_height = RemoteObject.createImmutable(0);
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _rkm = RemoteObject.createImmutable(0L);
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _istatus = RemoteObject.createImmutable(0);
RemoteObject _currdate = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetFastActionDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3179);
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
Debug.locals.put("CLAItem", _claitem);
Debug.locals.put("title", _title);
Debug.locals.put("quest", _quest);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("actstate", _actstate);
Debug.locals.put("disableAll", _disableall);
Debug.locals.put("Record", _record);
 BA.debugLineNum = 3182;BA.debugLine="FastOptionCheck = actstate";
Debug.ShouldStop(8192);
__ref.setField ("_fastoptioncheck" /*RemoteObject*/ ,_actstate);
 BA.debugLineNum = 3183;BA.debugLine="CurrentActivity = activ";
Debug.ShouldStop(16384);
__ref.setField ("_currentactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 3184;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(32768);
__ref.setField ("_currentclaitem" /*RemoteObject*/ ,_claitem);
 BA.debugLineNum = 3185;BA.debugLine="CurrentCLAItem.Answer = quest";
Debug.ShouldStop(65536);
__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).setField ("Answer" /*RemoteObject*/ ,_quest);
 BA.debugLineNum = 3186;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, Sh";
Debug.ShouldStop(131072);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(parent._sharecode._option_confirm /*RemoteObject*/ ),(Object)(parent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3188;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(524288);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3189;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 3190;BA.debugLine="ApplDialog.SetSize(95%x, 80%x)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3192;BA.debugLine="ApplDialog.SetSize(95%x,40%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3195;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getfastactiondialog"), _sf);
this.state = 45;
return;
case 45:
//C
this.state = 7;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3198;BA.debugLine="pnl.LoadLayout(\"CLA_ITEM_TaskSimple\")";
Debug.ShouldStop(536870912);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CLA_ITEM_TaskSimple")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3199;BA.debugLine="pnl.Tag = tagcode";
Debug.ShouldStop(1073741824);
_pnl.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 3201;BA.debugLine="IsFastOptionCheck = True";
Debug.ShouldStop(1);
__ref.setField ("_isfastoptioncheck" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 3202;BA.debugLine="ObjectTagcode = Record.obj 'Record.GetString(\"obj";
Debug.ShouldStop(2);
__ref.setField ("_objecttagcode" /*RemoteObject*/ ,_record.getField(true,"obj" /*RemoteObject*/ ));
 BA.debugLineNum = 3205;BA.debugLine="Dim YesNO_2_Height As Int = 80dip";
Debug.ShouldStop(16);
_yesno_2_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)));Debug.locals.put("YesNO_2_Height", _yesno_2_height);Debug.locals.put("YesNO_2_Height", _yesno_2_height);
 BA.debugLineNum = 3206;BA.debugLine="Dim YesNO_Height As Int = 60dip";
Debug.ShouldStop(32);
_yesno_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)));Debug.locals.put("YesNO_Height", _yesno_height);Debug.locals.put("YesNO_Height", _yesno_height);
 BA.debugLineNum = 3207;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 3208;BA.debugLine="YesNO_2_Height = 90dip";
Debug.ShouldStop(128);
_yesno_2_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)));Debug.locals.put("YesNO_2_Height", _yesno_2_height);
 BA.debugLineNum = 3209;BA.debugLine="YesNO_Height = 90dip";
Debug.ShouldStop(256);
_yesno_height = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)));Debug.locals.put("YesNO_Height", _yesno_height);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 3212;BA.debugLine="Dim p2 As Panel";
Debug.ShouldStop(2048);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 3213;BA.debugLine="p2.Initialize(\"CLALineClick\")";
Debug.ShouldStop(4096);
_p2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CLALineClick")));
 BA.debugLineNum = 3215;BA.debugLine="CurrentActivity.AddView(p2, 0, 0, 100%x, YesNO_2_";
Debug.ShouldStop(16384);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_yesno_2_height));
 BA.debugLineNum = 3216;BA.debugLine="p2.LoadLayout(\"CLA_ITEM_TaskSimple_YesNO_2\")";
Debug.ShouldStop(32768);
_p2.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CLA_ITEM_TaskSimple_YesNO_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3217;BA.debugLine="p2.RemoveView";
Debug.ShouldStop(65536);
_p2.runVoidMethod ("RemoveView");
 BA.debugLineNum = 3218;BA.debugLine="p2.Tag = tagcode";
Debug.ShouldStop(131072);
_p2.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 3219;BA.debugLine="CLAItemLabel.Text = \"Introduza/actualize os Kilom";
Debug.ShouldStop(262144);
__ref.getField(false,"_claitemlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Introduza/actualize os Kilometros"));
 BA.debugLineNum = 3220;BA.debugLine="Dim rKm As Long = Record.km ' Record.GetInt(\"kilo";
Debug.ShouldStop(524288);
_rkm = _record.getField(true,"km" /*RemoteObject*/ );Debug.locals.put("rKm", _rkm);Debug.locals.put("rKm", _rkm);
 BA.debugLineNum = 3221;BA.debugLine="CLAItemEditValue.EditText.InputType = CLAItemEdit";
Debug.ShouldStop(1048576);
__ref.getField(false,"_claitemeditvalue" /*RemoteObject*/ ).runMethod(false,"getEditText").runMethod(true,"setInputType",__ref.getField(false,"_claitemeditvalue" /*RemoteObject*/ ).runMethod(false,"getEditText").getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 3222;BA.debugLine="CLAItemEditValue.Text = rKm";
Debug.ShouldStop(2097152);
__ref.getField(false,"_claitemeditvalue" /*RemoteObject*/ ).runMethod(true,"setText",(_rkm));
 BA.debugLineNum = 3223;BA.debugLine="CLAItemsList.Add(p2, \"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_claitemslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p2.getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3225;BA.debugLine="Dim p1 As Panel";
Debug.ShouldStop(16777216);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 3226;BA.debugLine="p1.Initialize(\"CLALineClick\")";
Debug.ShouldStop(33554432);
_p1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CLALineClick")));
 BA.debugLineNum = 3227;BA.debugLine="CurrentActivity.AddView(p1, 0, 0, 100%x, YesNO_He";
Debug.ShouldStop(67108864);
__ref.getField(false,"_currentactivity" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_yesno_height));
 BA.debugLineNum = 3228;BA.debugLine="p1.LoadLayout(\"CLA_ITEM_TaskSimple_YesNO\")";
Debug.ShouldStop(134217728);
_p1.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CLA_ITEM_TaskSimple_YesNO")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3229;BA.debugLine="p1.RemoveView";
Debug.ShouldStop(268435456);
_p1.runVoidMethod ("RemoveView");
 BA.debugLineNum = 3230;BA.debugLine="p1.Tag = tagcode";
Debug.ShouldStop(536870912);
_p1.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 3231;BA.debugLine="CLAItem_G1.Text = quest";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_claitem_g1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_quest));
 BA.debugLineNum = 3232;BA.debugLine="If (actstate = 1) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 11:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("=",_actstate,BA.numberCast(double.class, 1)))) { 
this.state = 13;
}else 
{ BA.debugLineNum = 3234;BA.debugLine="Else If (actstate = 2) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_actstate,BA.numberCast(double.class, 2)))) { 
this.state = 15;
}}
if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 3233;BA.debugLine="CLAItemButton_1.State = 1";
Debug.ShouldStop(1);
__ref.getField(false,"_claitembutton_1" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3235;BA.debugLine="CLAItemButton_2.State = 1";
Debug.ShouldStop(4);
__ref.getField(false,"_claitembutton_2" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 3237;BA.debugLine="CLAItemButton_1.Tag = tagcode";
Debug.ShouldStop(16);
__ref.getField(false,"_claitembutton_1" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,(_tagcode));
 BA.debugLineNum = 3238;BA.debugLine="CLAItemButton_2.Tag = tagcode";
Debug.ShouldStop(32);
__ref.getField(false,"_claitembutton_2" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,(_tagcode));
 BA.debugLineNum = 3239;BA.debugLine="If (disableAll) Then";
Debug.ShouldStop(64);
if (true) break;

case 17:
//if
this.state = 20;
if ((_disableall).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 3240;BA.debugLine="CLAItemButton_1.Enabled = False";
Debug.ShouldStop(128);
__ref.getField(false,"_claitembutton_1" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setenabled" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 3241;BA.debugLine="CLAItemButton_2.Enabled = False";
Debug.ShouldStop(256);
__ref.getField(false,"_claitembutton_2" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setenabled" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 3243;BA.debugLine="If (CLAItem.Value = \"GET_MORE_ACTIONS\") Then";
Debug.ShouldStop(1024);

case 20:
//if
this.state = 23;
if ((RemoteObject.solveBoolean("=",_claitem.getField(true,"Value" /*RemoteObject*/ ),RemoteObject.createImmutable("GET_MORE_ACTIONS")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 3244;BA.debugLine="listButMoreActionInner_Click";
Debug.ShouldStop(2048);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_listbutmoreactioninner_click" /*RemoteObject*/ );
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 3246;BA.debugLine="CLAItemsList.Add(p1, \"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_claitemslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p1.getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3249;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getfastactiondialog"), _sf);
this.state = 46;
return;
case 46:
//C
this.state = 24;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3250;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (true) break;

case 24:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 3252;BA.debugLine="Dim istatus As Int = 0";
Debug.ShouldStop(524288);
_istatus = BA.numberCast(int.class, 0);Debug.locals.put("istatus", _istatus);Debug.locals.put("istatus", _istatus);
 BA.debugLineNum = 3253;BA.debugLine="If (CLAItemButton_1.State = 1) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 27:
//if
this.state = 32;
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_claitembutton_1" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getstate" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 29;
}else 
{ BA.debugLineNum = 3255;BA.debugLine="else if (CLAItemButton_2.State = 1) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_claitembutton_2" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getstate" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 31;
}}
if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 3254;BA.debugLine="istatus = 1";
Debug.ShouldStop(2097152);
_istatus = BA.numberCast(int.class, 1);Debug.locals.put("istatus", _istatus);
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 3256;BA.debugLine="istatus = 2";
Debug.ShouldStop(8388608);
_istatus = BA.numberCast(int.class, 2);Debug.locals.put("istatus", _istatus);
 if (true) break;
;
 BA.debugLineNum = 3259;BA.debugLine="Try";
Debug.ShouldStop(67108864);

case 32:
//try
this.state = 37;
this.catchState = 36;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 37;
this.catchState = 36;
 BA.debugLineNum = 3260;BA.debugLine="Dim currdate As String = Utils.GetCurrentDate";
Debug.ShouldStop(134217728);
_currdate = parent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("currdate", _currdate);Debug.locals.put("currdate", _currdate);
 BA.debugLineNum = 3261;BA.debugLine="Dim sSQL As String = $\"update alerts set kilome";
Debug.ShouldStop(268435456);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update alerts set kilometers="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_claitemeditvalue" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable(", verification_date='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currdate))),RemoteObject.createImmutable("', status_id=2, itemstatus="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_istatus))),RemoteObject.createImmutable(", notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_master_obs" /*RemoteObject*/ )))),RemoteObject.createImmutable("', image='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_master_image" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3262;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sSQL)";
Debug.ShouldStop(536870912);
parent._starter._localsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 Debug.CheckDeviceExceptions();
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
 BA.debugLineNum = 3264;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","670123605",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
;
 BA.debugLineNum = 3267;BA.debugLine="Dim currdate As String = Utils.GetCurrentDate";
Debug.ShouldStop(4);
_currdate = parent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("currdate", _currdate);Debug.locals.put("currdate", _currdate);
 BA.debugLineNum = 3268;BA.debugLine="Dim sSQL As String = $\"update dta_objects_fields";
Debug.ShouldStop(8);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_objects_fields set value="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_claitemeditvalue" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable(" where object_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_record.getField(true,"obj" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and field_tagcode='FIELD_KM'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3269;BA.debugLine="Utils.SaveSQLToLog(\"GetFastActionDialog\",sSQL, \"";
Debug.ShouldStop(16);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("GetFastActionDialog")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3271;BA.debugLine="Dim sSQL As String = $\"update dta_objects_fields";
Debug.ShouldStop(64);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_objects_fields set value="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currdate))),RemoteObject.createImmutable(" where object_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_record.getField(true,"obj" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and field_tagcode='FIELD_DATAKM'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3272;BA.debugLine="Utils.SaveSQLToLog(\"GetFastActionDialog\",sSQL, \"";
Debug.ShouldStop(128);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("GetFastActionDialog")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3276;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2048);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3277;BA.debugLine="params.Initialize";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3278;BA.debugLine="params.Clear";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3279;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3280;BA.debugLine="params.Put(\"ACLARequest\", CLAItem.Request)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_claitem.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 3281;BA.debugLine="params.Put(\"ACLAAction\", CLAItem.Action)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_claitem.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 3282;BA.debugLine="params.Put(\"ACLATask\", CLAItem.Task)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_claitem.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 3283;BA.debugLine="params.Put(\"ACLAItem\", CLAItem.Item)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_claitem.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 3284;BA.debugLine="params.Put(\"ACLAObject\", ObjectTagcode)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObject"))),(Object)((__ref.getField(true,"_objecttagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 3285;BA.debugLine="params.Put(\"ACLAKeyKM\", $\"${CLAItemEditValue.Tex";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAKeyKM"))),(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_claitemeditvalue" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 3286;BA.debugLine="params.Put(\"ACLAKeyDate\", currdate)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAKeyDate"))),(Object)((_currdate)));
 BA.debugLineNum = 3287;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3288;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3289;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3290;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3291;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3292;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3293;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3298;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(2);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/cla-md/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3299;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(4);
if (true) break;

case 38:
//if
this.state = 43;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
 BA.debugLineNum = 3300;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLAItem.R";
Debug.ShouldStop(8);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_claitem.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 3302;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(32);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_claitem.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_claitem.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_claitem.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3303;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(64);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 3305;BA.debugLine="Sleep(250)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getfastactiondialog"),BA.numberCast(int.class, 250));
this.state = 47;
return;
case 47:
//C
this.state = 44;
;
 if (true) break;

case 44:
//C
this.state = -1;
;
 BA.debugLineNum = 3323;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static void  _getmoreactionsdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activobj,RemoteObject _this,RemoteObject _tabpos,RemoteObject _innerobject,RemoteObject _tobs,RemoteObject _action,RemoteObject _pressedtag,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _actionforce) throws Exception{
try {
		Debug.PushSubsStack("GetMoreActionsDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("getmoreactionsdialog")) { __ref.runUserSub(false, "appactiondialogs","getmoreactionsdialog", __ref, _activ, _activobj, _this, _tabpos, _innerobject, _tobs, _action, _pressedtag, _tagcodetpa, _grouptpa, _actionforce); return;}
ResumableSub_GetMoreActionsDialog rsub = new ResumableSub_GetMoreActionsDialog(null,__ref,_activ,_activobj,_this,_tabpos,_innerobject,_tobs,_action,_pressedtag,_tagcodetpa,_grouptpa,_actionforce);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetMoreActionsDialog extends BA.ResumableSub {
public ResumableSub_GetMoreActionsDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activobj,RemoteObject _this,RemoteObject _tabpos,RemoteObject _innerobject,RemoteObject _tobs,RemoteObject _action,RemoteObject _pressedtag,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _actionforce) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activobj = _activobj;
this._this = _this;
this._tabpos = _tabpos;
this._innerobject = _innerobject;
this._tobs = _tobs;
this._action = _action;
this._pressedtag = _pressedtag;
this._tagcodetpa = _tagcodetpa;
this._grouptpa = _grouptpa;
this._actionforce = _actionforce;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _activ;
RemoteObject _activobj;
RemoteObject _this;
RemoteObject _tabpos;
RemoteObject _innerobject;
RemoteObject _tobs;
RemoteObject _action;
RemoteObject _pressedtag;
RemoteObject _tagcodetpa;
RemoteObject _grouptpa;
RemoteObject _actionforce;
RemoteObject _widthperc = RemoteObject.createImmutable(0);
RemoteObject _lbwidth = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _countimages = RemoteObject.createImmutable(0);
RemoteObject _first = RemoteObject.createImmutable(false);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _thetagcode = RemoteObject.createImmutable("");
RemoteObject _havetagcode = RemoteObject.createImmutable(false);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _record2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _ithis = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _loaded = RemoteObject.createImmutable(false);
RemoteObject _btm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record33 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _idd = RemoteObject.createImmutable(0);
RemoteObject _conf_sid_id = RemoteObject.createImmutable(0);
RemoteObject _imginfo = RemoteObject.createImmutable("");
RemoteObject _showtheimage = RemoteObject.createImmutable(false);
RemoteObject _email_sent = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.checklist3._itemdata");
RemoteObject _scriptdata = RemoteObject.createImmutable("");
RemoteObject _textoobs = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _evento = RemoteObject.createImmutable("");
RemoteObject _tipoevento = RemoteObject.createImmutable("");
RemoteObject _reccount = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sqlcheck = RemoteObject.createImmutable("");
RemoteObject _astagcode = RemoteObject.createImmutable("");
RemoteObject _dataoper = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _fln = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
RemoteObject group43;
int index43;
int groupLen43;
int step57;
int limit57;
int step185;
int limit185;
int step235;
int limit235;
int step416;
int limit416;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetMoreActionsDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,163);
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
Debug.locals.put("activObj", _activobj);
Debug.locals.put("this", _this);
Debug.locals.put("TabPos", _tabpos);
Debug.locals.put("innerObject", _innerobject);
Debug.locals.put("tobs", _tobs);
Debug.locals.put("action", _action);
Debug.locals.put("pressedtag", _pressedtag);
Debug.locals.put("tagcodeTPA", _tagcodetpa);
Debug.locals.put("groupTPA", _grouptpa);
Debug.locals.put("actionforce", _actionforce);
 BA.debugLineNum = 165;BA.debugLine="ProgressDialogShow2(ShareCode.AvisoAguarde, True)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._avisoaguarde /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 167;BA.debugLine="CurrentRequestCLAItem = this";
Debug.ShouldStop(64);
__ref.setField ("_currentrequestclaitem" /*RemoteObject*/ ,_this);
 BA.debugLineNum = 168;BA.debugLine="Dim WidthPerc As Int = 100%x";
Debug.ShouldStop(128);
_widthperc = parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"));Debug.locals.put("WidthPerc", _widthperc);Debug.locals.put("WidthPerc", _widthperc);
 BA.debugLineNum = 169;BA.debugLine="Dim lbWidth As Int = WidthPerc /3";
Debug.ShouldStop(256);
_lbwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_widthperc,RemoteObject.createImmutable(3)}, "/",0, 0));Debug.locals.put("lbWidth", _lbwidth);Debug.locals.put("lbWidth", _lbwidth);
 BA.debugLineNum = 170;BA.debugLine="PressedAnswerTagCode = pressedtag";
Debug.ShouldStop(512);
__ref.setField ("_pressedanswertagcode" /*RemoteObject*/ ,_pressedtag);
 BA.debugLineNum = 173;BA.debugLine="Dim sf As Object = ApplActionDialog.ShowAsync(thi";
Debug.ShouldStop(4096);
_sf = __ref.getField(false,"_applactiondialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_this.getField(true,"Title" /*RemoteObject*/ )),(Object)(parent._sharecode._option_back /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent._sharecode._option_makealert /*RemoteObject*/ ),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 176;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(32768);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 183;BA.debugLine="ApplActionDialog.SetSize(100%x, 100%y)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_applactiondialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 189;BA.debugLine="ApplActionDialog.GetButton(DialogResponse.negativ";
Debug.ShouldStop(268435456);
__ref.getField(false,"_applactiondialog" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 190;BA.debugLine="ApplActionDialog.GetButton(DialogResponse.negativ";
Debug.ShouldStop(536870912);
__ref.getField(false,"_applactiondialog" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 191;BA.debugLine="ThisActivityName_TaskListDialog = activObj";
Debug.ShouldStop(1073741824);
__ref.setField ("_thisactivityname_tasklistdialog" /*RemoteObject*/ ,_activobj);
 BA.debugLineNum = 192;BA.debugLine="CurrentCLD = ApplActionDialog";
Debug.ShouldStop(-2147483648);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_applactiondialog" /*RemoteObject*/ ));
 BA.debugLineNum = 193;BA.debugLine="CurrentActivity = activ";
Debug.ShouldStop(1);
__ref.setField ("_currentactivity" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 194;BA.debugLine="CurrentCLAItem = this";
Debug.ShouldStop(2);
__ref.setField ("_currentclaitem" /*RemoteObject*/ ,_this);
 BA.debugLineNum = 195;BA.debugLine="ObjectTagcode = innerObject";
Debug.ShouldStop(4);
__ref.setField ("_objecttagcode" /*RemoteObject*/ ,_innerobject);
 BA.debugLineNum = 196;BA.debugLine="ActionCode = \"\"";
Debug.ShouldStop(8);
__ref.setField ("_actioncode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 198;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreactionsdialog"), _sf);
this.state = 339;
return;
case 339:
//C
this.state = 1;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 199;BA.debugLine="pnl.LoadLayout(\"Dialog_MoreActions\")";
Debug.ShouldStop(64);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Dialog_MoreActions")),__ref.getField(false, "ba"));
 BA.debugLineNum = 200;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(128);
parent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_colortabpanel" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 201;BA.debugLine="AssociateImagesCompleteList.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 204;BA.debugLine="If (this.Origin = 7) Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if ((RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7)))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 205;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_Evidence_Aler";
Debug.ShouldStop(4096);
__ref.getField(false,"_liststabpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("CLA_MORE_Evidence_Alerts")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Detalhes"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 207;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_Evidence\", \"D";
Debug.ShouldStop(16384);
__ref.getField(false,"_liststabpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("CLA_MORE_Evidence")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Detalhes"))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 209;BA.debugLine="moreActionQuest.Text = this.Title";
Debug.ShouldStop(65536);
__ref.getField(false,"_moreactionquest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_this.getField(true,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 211;BA.debugLine="If Not(this.Origin = 7) Then";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//if
this.state = 16;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7))))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 212;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(524288);
if (true) break;

case 10:
//if
this.state = 15;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 213;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_Action\", \"Ac";
Debug.ShouldStop(1048576);
__ref.getField(false,"_liststabpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("CLA_MORE_Action")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Acções"))));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 215;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_Action\", \"Ac";
Debug.ShouldStop(4194304);
__ref.getField(false,"_liststabpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("CLA_MORE_Action")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Acções subsequentes"))));
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 217;BA.debugLine="moreActionQuest2.Text = this.Title";
Debug.ShouldStop(16777216);
__ref.getField(false,"_moreactionquest2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_this.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 219;BA.debugLine="If (Not(IsFastOptionCheck) And Not(this.Origin =";
Debug.ShouldStop(67108864);

case 16:
//if
this.state = 19;
if ((RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_isfastoptioncheck" /*RemoteObject*/ )))) && RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7)))))))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 220;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_History\", \"Hi";
Debug.ShouldStop(134217728);
__ref.getField(false,"_liststabpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("CLA_MORE_History")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Histórico"))));
 BA.debugLineNum = 221;BA.debugLine="moreActionQuest3.Text = this.Title";
Debug.ShouldStop(268435456);
__ref.getField(false,"_moreactionquest3" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_this.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 224;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(sendEmail";
Debug.ShouldStop(-2147483648);
parent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_sendemailimages" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 225;BA.debugLine="Dim CountImages As Int = 0";
Debug.ShouldStop(1);
_countimages = BA.numberCast(int.class, 0);Debug.locals.put("CountImages", _countimages);Debug.locals.put("CountImages", _countimages);
 BA.debugLineNum = 227;BA.debugLine="ItemTitle = this.Title";
Debug.ShouldStop(4);
__ref.setField ("_itemtitle" /*RemoteObject*/ ,_this.getField(true,"Title" /*RemoteObject*/ ));
 BA.debugLineNum = 228;BA.debugLine="Dim First As Boolean = True";
Debug.ShouldStop(8);
_first = parent.__c.getField(true,"True");Debug.locals.put("First", _first);Debug.locals.put("First", _first);
 BA.debugLineNum = 229;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
Debug.ShouldStop(16);
if (true) break;

case 20:
//for
this.state = 31;
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
group43 = parent._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_liststabpanel" /*RemoteObject*/ )));
index43 = 0;
groupLen43 = group43.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("lbl", _lbl);
this.state = 340;
if (true) break;

case 340:
//C
this.state = 31;
if (index43 < groupLen43) {
this.state = 22;
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group43.runMethod(false,"Get",index43));}
if (true) break;

case 341:
//C
this.state = 340;
index43++;
Debug.locals.put("lbl", _lbl);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 230;BA.debugLine="If First Then";
Debug.ShouldStop(32);
if (true) break;

case 23:
//if
this.state = 26;
if (_first.<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 231;BA.debugLine="First = False";
Debug.ShouldStop(64);
_first = parent.__c.getField(true,"False");Debug.locals.put("First", _first);
 BA.debugLineNum = 232;BA.debugLine="lbl.TextColor = Colors.Black";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"Black"));
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 234;BA.debugLine="lbl.Width = lbWidth";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setWidth",_lbwidth);
 BA.debugLineNum = 236;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(2048);
if (true) break;

case 27:
//if
this.state = 30;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 237;BA.debugLine="lbl.TextSize = 12.0";
Debug.ShouldStop(4096);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 12.0));
 if (true) break;

case 30:
//C
this.state = 341;
;
 if (true) break;
if (true) break;

case 31:
//C
this.state = 32;
Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 241;BA.debugLine="obsOptions.Add(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_obsoptions" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 242;BA.debugLine="If (Utils.NNE(tobs)) Then";
Debug.ShouldStop(131072);
if (true) break;

case 32:
//if
this.state = 45;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tobs))).<Boolean>get().booleanValue()) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 243;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 35:
//try
this.state = 44;
this.catchState = 43;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 43;
 BA.debugLineNum = 244;BA.debugLine="Dim item As List = Regex.Split(\"\\,\", tobs )";
Debug.ShouldStop(524288);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_item = parent.__c.runMethod(false, "ArrayToList", (Object)(parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\,")),(Object)(_tobs))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 245;BA.debugLine="For n= 0 To item.Size-1";
Debug.ShouldStop(1048576);
if (true) break;

case 38:
//for
this.state = 41;
step57 = 1;
limit57 = RemoteObject.solve(new RemoteObject[] {_item.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 342;
if (true) break;

case 342:
//C
this.state = 41;
if ((step57 > 0 && _n <= limit57) || (step57 < 0 && _n >= limit57)) this.state = 40;
if (true) break;

case 343:
//C
this.state = 342;
_n = ((int)(0 + _n + step57)) ;
Debug.locals.put("n", _n);
if (true) break;

case 40:
//C
this.state = 343;
 BA.debugLineNum = 246;BA.debugLine="obsOptions.Add(item.Get(n))";
Debug.ShouldStop(2097152);
__ref.getField(false,"_obsoptions" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.ObjectToString(_item.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))))));
 if (true) break;
if (true) break;

case 41:
//C
this.state = 44;
Debug.locals.put("n", _n);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 0;
 BA.debugLineNum = 249;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","666715734",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
;
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 253;BA.debugLine="obsOptions.DropdownBackgroundColor = Consts.Color";
Debug.ShouldStop(268435456);
__ref.getField(false,"_obsoptions" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 254;BA.debugLine="obsOptions.DropdownTextColor = Consts.ColorDarkGr";
Debug.ShouldStop(536870912);
__ref.getField(false,"_obsoptions" /*RemoteObject*/ ).runMethod(true,"setDropdownTextColor",parent._consts._colordarkgray /*RemoteObject*/ );
 BA.debugLineNum = 261;BA.debugLine="If Not(this.Origin = 7) Then";
Debug.ShouldStop(16);
if (true) break;

case 46:
//if
this.state = 61;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7))))).<Boolean>get().booleanValue()) { 
this.state = 48;
}else {
this.state = 60;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 263;BA.debugLine="Dim Status As Int = 0";
Debug.ShouldStop(64);
_status = BA.numberCast(int.class, 0);Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 264;BA.debugLine="Dim theTagcode As String = Utils.IfNullOrEmpty(P";
Debug.ShouldStop(128);
_thetagcode = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_pressedanswertagcode" /*RemoteObject*/ )),(Object)(_this.getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("theTagcode", _thetagcode);Debug.locals.put("theTagcode", _thetagcode);
 BA.debugLineNum = 265;BA.debugLine="Dim HaveTagcode As Boolean = (Utils.NNE(theTagco";
Debug.ShouldStop(256);
_havetagcode = (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_thetagcode)));Debug.locals.put("HaveTagcode", _havetagcode);Debug.locals.put("HaveTagcode", _havetagcode);
 BA.debugLineNum = 266;BA.debugLine="If (HaveTagcode) Then";
Debug.ShouldStop(512);
if (true) break;

case 49:
//if
this.state = 54;
if ((_havetagcode).<Boolean>get().booleanValue()) { 
this.state = 51;
}else {
this.state = 53;
}if (true) break;

case 51:
//C
this.state = 54;
 BA.debugLineNum = 270;BA.debugLine="Dim sSQL As String = $\"select ifnull(execute_st";
Debug.ShouldStop(8192);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(execute_status,0) as status, ifnull(execute_action,'') as action, ifnull(execute_notes,'') as notes,\n"),RemoteObject.createImmutable("				ifnull(execute_value,'') as value from dta_requests_values where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("				task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 278;BA.debugLine="Dim sSQL As String = $\"select ifnull(execute_st";
Debug.ShouldStop(2097152);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(execute_status,0) as status, ifnull(execute_action,'') as action, ifnull(execute_notes,'') as notes,\n"),RemoteObject.createImmutable("				ifnull(execute_value,'') as value from dta_requests_values where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("				task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 285;BA.debugLine="Private Record1 As Cursor = Starter.LocalSQLEVC.";
Debug.ShouldStop(268435456);
_record1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(""))))));Debug.locals.put("Record1", _record1);
 BA.debugLineNum = 287;BA.debugLine="If Record1.RowCount > 0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 55:
//if
this.state = 58;
if (RemoteObject.solveBoolean(">",_record1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 288;BA.debugLine="Record1.Position = 0";
Debug.ShouldStop(-2147483648);
_record1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 289;BA.debugLine="ItemNotes.Text = Record1.GetString(\"notes\")";
Debug.ShouldStop(1);
__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_record1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("notes")))));
 BA.debugLineNum = 290;BA.debugLine="ItemNotes.Tag = this 'As RequestCLAItem";
Debug.ShouldStop(2);
__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 291;BA.debugLine="ActionCode = Record1.GetString(\"action\")";
Debug.ShouldStop(4);
__ref.setField ("_actioncode" /*RemoteObject*/ ,_record1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("action"))));
 if (true) break;

case 58:
//C
this.state = 61;
;
 BA.debugLineNum = 293;BA.debugLine="Record1.Close";
Debug.ShouldStop(16);
_record1.runVoidMethod ("Close");
 if (true) break;

case 60:
//C
this.state = 61;
 if (true) break;
;
 BA.debugLineNum = 308;BA.debugLine="If ItemNotes.Text <> \"\" And CurrentItemNotesText";
Debug.ShouldStop(524288);

case 61:
//if
this.state = 64;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 309;BA.debugLine="CurrentItemNotesText = ItemNotes.Text";
Debug.ShouldStop(1048576);
__ref.setField ("_currentitemnotestext" /*RemoteObject*/ ,__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"));
 if (true) break;

case 64:
//C
this.state = 65;
;
 BA.debugLineNum = 312;BA.debugLine="associateObject.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_associateobject" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 313;BA.debugLine="associateObject.tag = this";
Debug.ShouldStop(16777216);
__ref.getField(false,"_associateobject" /*RemoteObject*/ ).runMethod(false,"setTag",(_this));
 BA.debugLineNum = 315;BA.debugLine="If Not(this.Origin = 7) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 65:
//if
this.state = 106;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7))))).<Boolean>get().booleanValue()) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 316;BA.debugLine="Dim Status As Int = 0";
Debug.ShouldStop(134217728);
_status = BA.numberCast(int.class, 0);Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 317;BA.debugLine="Dim sSQL As String = $\"select distinct a.id, ifn";
Debug.ShouldStop(268435456);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.id, ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 0 as base_image, 0 as on_report\n"),RemoteObject.createImmutable("		from dta_tasks_items as a \n"),RemoteObject.createImmutable("		inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode \n"),RemoteObject.createImmutable("				and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)\n"),RemoteObject.createImmutable("		where b.request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and b.inner_request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and b.task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and b.item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and b.unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and b.repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			and b.repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			and b.repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 329;BA.debugLine="Private Record2 As Cursor = Starter.LocalSQLEVC.";
Debug.ShouldStop(256);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 331;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 68:
//if
this.state = 105;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 332;BA.debugLine="CountImages = CountImages + 1";
Debug.ShouldStop(2048);
_countimages = RemoteObject.solve(new RemoteObject[] {_countimages,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CountImages", _countimages);
 BA.debugLineNum = 334;BA.debugLine="Record2.Position = 0";
Debug.ShouldStop(8192);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 335;BA.debugLine="Dim image As String = Record2.GetString(\"imageb";
Debug.ShouldStop(16384);
_image = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imageb64")));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 336;BA.debugLine="Dim filename As String = Record2.GetString(\"ima";
Debug.ShouldStop(32768);
_filename = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 338;BA.debugLine="Dim ithis As RequestCLAItem = this";
Debug.ShouldStop(131072);
_ithis = _this;Debug.locals.put("ithis", _ithis);Debug.locals.put("ithis", _ithis);
 BA.debugLineNum = 339;BA.debugLine="ithis.OnReport = Record2.GetInt(\"on_report\")";
Debug.ShouldStop(262144);
_ithis.setField ("OnReport" /*RemoteObject*/ ,_record2.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("on_report"))));
 BA.debugLineNum = 340;BA.debugLine="ithis.BaseImage = Record2.GetInt(\"base_image\")";
Debug.ShouldStop(524288);
_ithis.setField ("BaseImage" /*RemoteObject*/ ,_record2.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("base_image"))));
 BA.debugLineNum = 343;BA.debugLine="If Utils.NNE(image) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 71:
//if
this.state = 104;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_image)).<Boolean>get().booleanValue()) { 
this.state = 73;
}else 
{ BA.debugLineNum = 367;BA.debugLine="else if Utils.NNE(filename) Then";
Debug.ShouldStop(16384);
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 93;
}}
if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 344;BA.debugLine="Dim loaded As Boolean = True";
Debug.ShouldStop(8388608);
_loaded = parent.__c.getField(true,"True");Debug.locals.put("loaded", _loaded);Debug.locals.put("loaded", _loaded);
 BA.debugLineNum = 345;BA.debugLine="Try";
Debug.ShouldStop(16777216);
if (true) break;

case 74:
//try
this.state = 79;
this.catchState = 78;
this.state = 76;
if (true) break;

case 76:
//C
this.state = 79;
this.catchState = 78;
 BA.debugLineNum = 346;BA.debugLine="ItemImages.Add(CreateImagePanel(ithis, filena";
Debug.ShouldStop(33554432);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createimagepanel" /*RemoteObject*/ ,(Object)(_ithis),(Object)(_filename),(Object)(_image),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 347;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 78:
//C
this.state = 79;
this.catchState = 0;
 BA.debugLineNum = 349;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","666715834",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 350;BA.debugLine="loaded= False";
Debug.ShouldStop(536870912);
_loaded = parent.__c.getField(true,"False");Debug.locals.put("loaded", _loaded);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 353;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,$\"${";
Debug.ShouldStop(1);

case 79:
//if
this.state = 82;
this.catchState = 0;
if (parent.__c.runMethod(true,"Not",(Object)(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""))))))).<Boolean>get().booleanValue()) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 354;BA.debugLine="Utils.SaveImageFromB64ToFile(image, $\"${filen";
Debug.ShouldStop(2);
parent._utils.runVoidMethod ("_saveimagefromb64tofile" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_image),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))),(Object)(parent._sharecode._device_def_img_filetype /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 356;BA.debugLine="If Not(loaded) Then";
Debug.ShouldStop(8);

case 82:
//if
this.state = 91;
if (parent.__c.runMethod(true,"Not",(Object)(_loaded)).<Boolean>get().booleanValue()) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 357;BA.debugLine="Dim btm As B4XBitmap = LoadBitmap(Starter.Int";
Debug.ShouldStop(16);
_btm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_btm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), parent.__c.runMethod(false,"LoadBitmap",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""))))).getObject());Debug.locals.put("btm", _btm);
 BA.debugLineNum = 358;BA.debugLine="Try";
Debug.ShouldStop(32);
if (true) break;

case 85:
//try
this.state = 90;
this.catchState = 89;
this.state = 87;
if (true) break;

case 87:
//C
this.state = 90;
this.catchState = 89;
 BA.debugLineNum = 359;BA.debugLine="ItemImages.Add(CreateImagePanelBMP(ithis, fi";
Debug.ShouldStop(64);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createimagepanelbmp" /*RemoteObject*/ ,(Object)(_ithis),(Object)(_filename),(Object)(_btm),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 360;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
Debug.ShouldStop(128);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 89:
//C
this.state = 90;
this.catchState = 0;
 BA.debugLineNum = 362;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","666715847",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 363;BA.debugLine="loaded= False";
Debug.ShouldStop(1024);
_loaded = parent.__c.getField(true,"False");Debug.locals.put("loaded", _loaded);
 if (true) break;
if (true) break;

case 90:
//C
this.state = 91;
this.catchState = 0;
;
 if (true) break;

case 91:
//C
this.state = 104;
;
 if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 368;BA.debugLine="If (File.Exists(Starter.InternalFolder,$\"${fil";
Debug.ShouldStop(32768);
if (true) break;

case 94:
//if
this.state = 103;
if ((parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))))).<Boolean>get().booleanValue()) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 369;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 97:
//try
this.state = 102;
this.catchState = 101;
this.state = 99;
if (true) break;

case 99:
//C
this.state = 102;
this.catchState = 101;
 BA.debugLineNum = 375;BA.debugLine="ItemImages.Add(CreateImagePanelBMP(ithis, fi";
Debug.ShouldStop(4194304);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createimagepanelbmp" /*RemoteObject*/ ,(Object)(_ithis),(Object)(_filename),(Object)(_btm),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 376;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 101:
//C
this.state = 102;
this.catchState = 0;
 BA.debugLineNum = 378;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","666715863",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 102:
//C
this.state = 103;
this.catchState = 0;
;
 if (true) break;

case 103:
//C
this.state = 104;
;
 if (true) break;

case 104:
//C
this.state = 105;
;
 if (true) break;

case 105:
//C
this.state = 106;
;
 BA.debugLineNum = 384;BA.debugLine="Record2.Close";
Debug.ShouldStop(-2147483648);
_record2.runVoidMethod ("Close");
 if (true) break;
;
 BA.debugLineNum = 388;BA.debugLine="If Not(this.Origin = 7) Then";
Debug.ShouldStop(8);

case 106:
//if
this.state = 145;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7))))).<Boolean>get().booleanValue()) { 
this.state = 108;
}if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 389;BA.debugLine="If (Utils.NNE(innerObject)) Then";
Debug.ShouldStop(16);
if (true) break;

case 109:
//if
this.state = 144;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_innerobject))).<Boolean>get().booleanValue()) { 
this.state = 111;
}if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 390;BA.debugLine="Dim SQL As String = $\"Select a.id, ifnull(a.ima";
Debug.ShouldStop(32);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("Select a.id, ifnull(a.image, '') as image, ifnull(a.filename, '') as filename from  dta_objects as a where a.tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_innerobject))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 391;BA.debugLine="Private Record33 As Cursor = Starter.LocalSQLEV";
Debug.ShouldStop(64);
_record33 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record33 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record33", _record33);
 BA.debugLineNum = 392;BA.debugLine="If Record33.RowCount > 0 Then";
Debug.ShouldStop(128);
if (true) break;

case 112:
//if
this.state = 143;
if (RemoteObject.solveBoolean(">",_record33.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 114;
}if (true) break;

case 114:
//C
this.state = 115;
 BA.debugLineNum = 393;BA.debugLine="Record33.Position = 0";
Debug.ShouldStop(256);
_record33.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 394;BA.debugLine="CountImages = CountImages + 1";
Debug.ShouldStop(512);
_countimages = RemoteObject.solve(new RemoteObject[] {_countimages,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CountImages", _countimages);
 BA.debugLineNum = 395;BA.debugLine="Dim image As String = Record33.GetString(\"imag";
Debug.ShouldStop(1024);
_image = _record33.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("image")));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 396;BA.debugLine="Dim ithis As RequestCLAItem = this";
Debug.ShouldStop(2048);
_ithis = _this;Debug.locals.put("ithis", _ithis);Debug.locals.put("ithis", _ithis);
 BA.debugLineNum = 398;BA.debugLine="Dim filename As String =  Record33.GetString(\"";
Debug.ShouldStop(8192);
_filename = _record33.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("filename")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 399;BA.debugLine="Dim idd As Int = Record33.GetInt(\"id\")";
Debug.ShouldStop(16384);
_idd = _record33.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("idd", _idd);Debug.locals.put("idd", _idd);
 BA.debugLineNum = 401;BA.debugLine="If Utils.isNullOrEmpty(filename) Then";
Debug.ShouldStop(65536);
if (true) break;

case 115:
//if
this.state = 118;
if (parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 117;
}if (true) break;

case 117:
//C
this.state = 118;
 BA.debugLineNum = 402;BA.debugLine="Dim filename As String =  $\"Base_${innerObjec";
Debug.ShouldStop(131072);
_filename = (RemoteObject.concat(RemoteObject.createImmutable("Base_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_innerobject))),RemoteObject.createImmutable(".png")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 if (true) break;
;
 BA.debugLineNum = 405;BA.debugLine="If Not(Utils.isNullOrEmpty(image)) Then";
Debug.ShouldStop(1048576);

case 118:
//if
this.state = 142;
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_image)))).<Boolean>get().booleanValue()) { 
this.state = 120;
}else 
{ BA.debugLineNum = 417;BA.debugLine="else if Not(Utils.isNullOrEmpty(filename)) The";
Debug.ShouldStop(1);
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)))).<Boolean>get().booleanValue()) { 
this.state = 131;
}}
if (true) break;

case 120:
//C
this.state = 121;
 BA.debugLineNum = 406;BA.debugLine="image = image.Replace(\"data:image/png;base64,";
Debug.ShouldStop(2097152);
_image = _image.runMethod(true,"replace",(Object)(BA.ObjectToString("data:image/png;base64,")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("image", _image);
 BA.debugLineNum = 407;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 121:
//try
this.state = 126;
this.catchState = 125;
this.state = 123;
if (true) break;

case 123:
//C
this.state = 126;
this.catchState = 125;
 BA.debugLineNum = 408;BA.debugLine="ItemImages.Add(CreateImagePanel(ithis, filen";
Debug.ShouldStop(8388608);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createimagepanel" /*RemoteObject*/ ,(Object)(_ithis),(Object)(_filename),(Object)(_image),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 409;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 125:
//C
this.state = 126;
this.catchState = 0;
 BA.debugLineNum = 411;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","666715896",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 413;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,$\"$";
Debug.ShouldStop(268435456);

case 126:
//if
this.state = 129;
this.catchState = 0;
if (parent.__c.runMethod(true,"Not",(Object)(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""))))))).<Boolean>get().booleanValue()) { 
this.state = 128;
}if (true) break;

case 128:
//C
this.state = 129;
 BA.debugLineNum = 414;BA.debugLine="Utils.SaveImageFromB64ToFile(image, $\"${file";
Debug.ShouldStop(536870912);
parent._utils.runVoidMethod ("_saveimagefromb64tofile" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_image),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))),(Object)(parent._sharecode._device_def_img_filetype /*RemoteObject*/ ));
 BA.debugLineNum = 415;BA.debugLine="updateThisImageFile2DB(filename, idd)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_updatethisimagefile2db" /*RemoteObject*/ ,(Object)(_filename),(Object)(_idd));
 if (true) break;

case 129:
//C
this.state = 142;
;
 if (true) break;

case 131:
//C
this.state = 132;
 BA.debugLineNum = 418;BA.debugLine="If (File.Exists(Starter.InternalFolder,$\"${fi";
Debug.ShouldStop(2);
if (true) break;

case 132:
//if
this.state = 141;
if ((parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))))).<Boolean>get().booleanValue()) { 
this.state = 134;
}if (true) break;

case 134:
//C
this.state = 135;
 BA.debugLineNum = 419;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 135:
//try
this.state = 140;
this.catchState = 139;
this.state = 137;
if (true) break;

case 137:
//C
this.state = 140;
this.catchState = 139;
 BA.debugLineNum = 420;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(8);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 421;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 422;BA.debugLine="Dim image As String = Base64Con.EncodeFromI";
Debug.ShouldStop(32);
_image = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 423;BA.debugLine="ItemImages.Add(CreateImagePanel(ithis, file";
Debug.ShouldStop(64);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createimagepanel" /*RemoteObject*/ ,(Object)(_ithis),(Object)(_filename),(Object)(_image),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 424;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
Debug.ShouldStop(128);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 139:
//C
this.state = 140;
this.catchState = 0;
 BA.debugLineNum = 426;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","666715911",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 140:
//C
this.state = 141;
this.catchState = 0;
;
 if (true) break;

case 141:
//C
this.state = 142;
;
 if (true) break;

case 142:
//C
this.state = 143;
;
 if (true) break;

case 143:
//C
this.state = 144;
;
 BA.debugLineNum = 432;BA.debugLine="Record33.Close";
Debug.ShouldStop(32768);
_record33.runVoidMethod ("Close");
 if (true) break;

case 144:
//C
this.state = 145;
;
 if (true) break;
;
 BA.debugLineNum = 436;BA.debugLine="If Not(this.Origin = 7) Then";
Debug.ShouldStop(524288);

case 145:
//if
this.state = 189;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7))))).<Boolean>get().booleanValue()) { 
this.state = 147;
}if (true) break;

case 147:
//C
this.state = 148;
 BA.debugLineNum = 437;BA.debugLine="Dim Status As Int = 0";
Debug.ShouldStop(1048576);
_status = BA.numberCast(int.class, 0);Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 438;BA.debugLine="Dim sSQL As String = $\"select ifnull(imageb64,''";
Debug.ShouldStop(2097152);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report, conf_sid_id,\n"),RemoteObject.createImmutable("		ifnull(execute_longitude, '') as execute_longitude, ifnull(execute_latitude, '') as execute_latitude, ifnull(execute_datetime, '') as execute_datetime\n"),RemoteObject.createImmutable("		from dta_requests_values_images where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("		task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("		and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("		and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 446;BA.debugLine="Private Record2 As Cursor = Starter.LocalSQLEVC.";
Debug.ShouldStop(536870912);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 448;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 148:
//if
this.state = 188;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 150;
}if (true) break;

case 150:
//C
this.state = 151;
 BA.debugLineNum = 449;BA.debugLine="For n=0 To Record2.RowCount-1";
Debug.ShouldStop(1);
if (true) break;

case 151:
//for
this.state = 187;
step185 = 1;
limit185 = RemoteObject.solve(new RemoteObject[] {_record2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 344;
if (true) break;

case 344:
//C
this.state = 187;
if ((step185 > 0 && _n <= limit185) || (step185 < 0 && _n >= limit185)) this.state = 153;
if (true) break;

case 345:
//C
this.state = 344;
_n = ((int)(0 + _n + step185)) ;
Debug.locals.put("n", _n);
if (true) break;

case 153:
//C
this.state = 154;
 BA.debugLineNum = 450;BA.debugLine="Record2.Position = n";
Debug.ShouldStop(2);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 451;BA.debugLine="Dim image As String = Record2.GetString(\"image";
Debug.ShouldStop(4);
_image = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imageb64")));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 452;BA.debugLine="Dim filename As String = Record2.GetString(\"im";
Debug.ShouldStop(8);
_filename = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 453;BA.debugLine="Dim conf_sid_id As Int = Record2.GetInt(\"conf_";
Debug.ShouldStop(16);
_conf_sid_id = _record2.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("conf_sid_id")));Debug.locals.put("conf_sid_id", _conf_sid_id);Debug.locals.put("conf_sid_id", _conf_sid_id);
 BA.debugLineNum = 454;BA.debugLine="Dim imgInfo As String = $\"${Record2.GetString(";
Debug.ShouldStop(32);
_imginfo = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("execute_datetime")))))),RemoteObject.createImmutable(" - "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("execute_latitude")))))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("execute_longitude")))))),RemoteObject.createImmutable("")));Debug.locals.put("imgInfo", _imginfo);Debug.locals.put("imgInfo", _imginfo);
 BA.debugLineNum = 455;BA.debugLine="If Utils.isNullOrEmpty(filename) Then";
Debug.ShouldStop(64);
if (true) break;

case 154:
//if
this.state = 157;
if (parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 156;
}if (true) break;

case 156:
//C
this.state = 157;
 BA.debugLineNum = 456;BA.debugLine="Dim filename As String =  $\"IMGNEW_${Utils.Ma";
Debug.ShouldStop(128);
_filename = (RemoteObject.concat(RemoteObject.createImmutable("IMGNEW_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,__ref.getField(false, "ba"))))),RemoteObject.createImmutable(".png")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 if (true) break;

case 157:
//C
this.state = 158;
;
 BA.debugLineNum = 459;BA.debugLine="Dim ithis As RequestCLAItem = this";
Debug.ShouldStop(1024);
_ithis = _this;Debug.locals.put("ithis", _ithis);Debug.locals.put("ithis", _ithis);
 BA.debugLineNum = 460;BA.debugLine="ithis.OnReport = Record2.GetInt(\"on_report\")";
Debug.ShouldStop(2048);
_ithis.setField ("OnReport" /*RemoteObject*/ ,_record2.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("on_report"))));
 BA.debugLineNum = 461;BA.debugLine="ithis.BaseImage = Record2.GetInt(\"base_image\")";
Debug.ShouldStop(4096);
_ithis.setField ("BaseImage" /*RemoteObject*/ ,_record2.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("base_image"))));
 BA.debugLineNum = 463;BA.debugLine="Dim ShowTheImage As Boolean = False";
Debug.ShouldStop(16384);
_showtheimage = parent.__c.getField(true,"False");Debug.locals.put("ShowTheImage", _showtheimage);Debug.locals.put("ShowTheImage", _showtheimage);
 BA.debugLineNum = 464;BA.debugLine="If Utils.NNE(image) Then";
Debug.ShouldStop(32768);
if (true) break;

case 158:
//if
this.state = 171;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_image)).<Boolean>get().booleanValue()) { 
this.state = 160;
}else 
{ BA.debugLineNum = 470;BA.debugLine="else if Utils.NNE(filename) Then";
Debug.ShouldStop(2097152);
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 166;
}}
if (true) break;

case 160:
//C
this.state = 161;
 BA.debugLineNum = 465;BA.debugLine="image = image.Replace(\"data:image/png;base64,";
Debug.ShouldStop(65536);
_image = _image.runMethod(true,"replace",(Object)(BA.ObjectToString("data:image/png;base64,")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("image", _image);
 BA.debugLineNum = 466;BA.debugLine="ShowTheImage = True";
Debug.ShouldStop(131072);
_showtheimage = parent.__c.getField(true,"True");Debug.locals.put("ShowTheImage", _showtheimage);
 BA.debugLineNum = 467;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,$\"$";
Debug.ShouldStop(262144);
if (true) break;

case 161:
//if
this.state = 164;
if (parent.__c.runMethod(true,"Not",(Object)(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""))))))).<Boolean>get().booleanValue()) { 
this.state = 163;
}if (true) break;

case 163:
//C
this.state = 164;
 BA.debugLineNum = 468;BA.debugLine="Utils.SaveImageFromB64ToFile(image, $\"${file";
Debug.ShouldStop(524288);
parent._utils.runVoidMethod ("_saveimagefromb64tofile" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_image),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))),(Object)(parent._sharecode._device_def_img_filetype /*RemoteObject*/ ));
 if (true) break;

case 164:
//C
this.state = 171;
;
 if (true) break;

case 166:
//C
this.state = 167;
 BA.debugLineNum = 471;BA.debugLine="If (File.Exists(Starter.InternalFolder,$\"${fi";
Debug.ShouldStop(4194304);
if (true) break;

case 167:
//if
this.state = 170;
if ((parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))))).<Boolean>get().booleanValue()) { 
this.state = 169;
}if (true) break;

case 169:
//C
this.state = 170;
 BA.debugLineNum = 472;BA.debugLine="ShowTheImage = True";
Debug.ShouldStop(8388608);
_showtheimage = parent.__c.getField(true,"True");Debug.locals.put("ShowTheImage", _showtheimage);
 if (true) break;

case 170:
//C
this.state = 171;
;
 if (true) break;
;
 BA.debugLineNum = 486;BA.debugLine="If ShowTheImage Then";
Debug.ShouldStop(32);

case 171:
//if
this.state = 186;
if (_showtheimage.<Boolean>get().booleanValue()) { 
this.state = 173;
}if (true) break;

case 173:
//C
this.state = 174;
 BA.debugLineNum = 487;BA.debugLine="Dim btm As B4XBitmap = LoadBitmap(Starter.Int";
Debug.ShouldStop(64);
_btm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_btm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), parent.__c.runMethod(false,"LoadBitmap",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""))))).getObject());Debug.locals.put("btm", _btm);
 BA.debugLineNum = 488;BA.debugLine="If (conf_sid_id = 4) Then";
Debug.ShouldStop(128);
if (true) break;

case 174:
//if
this.state = 185;
if ((RemoteObject.solveBoolean("=",_conf_sid_id,BA.numberCast(double.class, 4)))) { 
this.state = 176;
}else {
this.state = 178;
}if (true) break;

case 176:
//C
this.state = 185;
 BA.debugLineNum = 490;BA.debugLine="itemSignatures.Add(CreateSignaturePanelBMP(i";
Debug.ShouldStop(512);
__ref.getField(false,"_itemsignatures" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createsignaturepanelbmp" /*RemoteObject*/ ,(Object)(_ithis),(Object)(_filename),(Object)(_btm),(Object)(BA.numberCast(int.class, 0)),(Object)(_imginfo))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 178:
//C
this.state = 179;
 BA.debugLineNum = 492;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 179:
//try
this.state = 184;
this.catchState = 183;
this.state = 181;
if (true) break;

case 181:
//C
this.state = 184;
this.catchState = 183;
 BA.debugLineNum = 494;BA.debugLine="ItemImages.Add(CreateImagePanelBMP(ithis, f";
Debug.ShouldStop(8192);
__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createimagepanelbmp" /*RemoteObject*/ ,(Object)(_ithis),(Object)(_filename),(Object)(_btm),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 495;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
Debug.ShouldStop(16384);
__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 183:
//C
this.state = 184;
this.catchState = 0;
 BA.debugLineNum = 497;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","666715982",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 184:
//C
this.state = 185;
this.catchState = 0;
;
 if (true) break;

case 185:
//C
this.state = 186;
;
 if (true) break;

case 186:
//C
this.state = 345;
;
 if (true) break;
if (true) break;

case 187:
//C
this.state = 188;
Debug.locals.put("n", _n);
;
 if (true) break;

case 188:
//C
this.state = 189;
;
 BA.debugLineNum = 503;BA.debugLine="Record2.Close";
Debug.ShouldStop(4194304);
_record2.runVoidMethod ("Close");
 if (true) break;
;
 BA.debugLineNum = 510;BA.debugLine="If Not(this.Origin = 7) Then";
Debug.ShouldStop(536870912);

case 189:
//if
this.state = 266;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7))))).<Boolean>get().booleanValue()) { 
this.state = 191;
}if (true) break;

case 191:
//C
this.state = 192;
 BA.debugLineNum = 511;BA.debugLine="Private Record2 As Cursor";
Debug.ShouldStop(1073741824);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 512;BA.debugLine="Dim sSQL As String = $\"${DBStructures.EVC_SQL_GE";
Debug.ShouldStop(-2147483648);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._dbstructures._evc_sql_get_task_more_as /*RemoteObject*/ ))),RemoteObject.createImmutable(" and\n"),RemoteObject.createImmutable("			request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("			action_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and \n"),RemoteObject.createImmutable("			task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and \n"),RemoteObject.createImmutable("			item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and \n"),RemoteObject.createImmutable("			uniquekey='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and \n"),RemoteObject.createImmutable("			iu_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("'  \n"),RemoteObject.createImmutable("			and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("			and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			order by id desc limit 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 524;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery($\"${sSQL";
Debug.ShouldStop(2048);
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 525;BA.debugLine="Log(\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","666716010",RemoteObject.createImmutable("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"),0);
 BA.debugLineNum = 526;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","666716011",_ssql,0);
 BA.debugLineNum = 527;BA.debugLine="editAS.Enabled = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_editas" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 528;BA.debugLine="editAS.Visible = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_editas" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 529;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 192:
//if
this.state = 211;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 194;
}else {
this.state = 210;
}if (true) break;

case 194:
//C
this.state = 195;
 BA.debugLineNum = 530;BA.debugLine="For n=0 To Record2.RowCount-1";
Debug.ShouldStop(131072);
if (true) break;

case 195:
//for
this.state = 208;
step235 = 1;
limit235 = RemoteObject.solve(new RemoteObject[] {_record2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 346;
if (true) break;

case 346:
//C
this.state = 208;
if ((step235 > 0 && _n <= limit235) || (step235 < 0 && _n >= limit235)) this.state = 197;
if (true) break;

case 347:
//C
this.state = 346;
_n = ((int)(0 + _n + step235)) ;
Debug.locals.put("n", _n);
if (true) break;

case 197:
//C
this.state = 198;
 BA.debugLineNum = 531;BA.debugLine="Record2.Position = n";
Debug.ShouldStop(262144);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 532;BA.debugLine="If (n=0) Then";
Debug.ShouldStop(524288);
if (true) break;

case 198:
//if
this.state = 207;
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_n),BA.numberCast(double.class, 0)))) { 
this.state = 200;
}if (true) break;

case 200:
//C
this.state = 201;
 BA.debugLineNum = 533;BA.debugLine="asPanel.AddView(CreateASPanel(this, True, Rec";
Debug.ShouldStop(1048576);
__ref.getField(false,"_aspanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createaspanel" /*RemoteObject*/ ,(Object)(_this),(Object)(parent.__c.getField(true,"True")),(Object)(_record2)).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 534;BA.debugLine="CurrentTagcode = Record2.GetString(\"tagcode\")";
Debug.ShouldStop(2097152);
__ref.setField ("_currenttagcode" /*RemoteObject*/ ,_record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode"))));
 BA.debugLineNum = 535;BA.debugLine="CurrentASTagcode = CurrentTagcode";
Debug.ShouldStop(4194304);
__ref.setField ("_currentastagcode" /*RemoteObject*/ ,__ref.getField(true,"_currenttagcode" /*RemoteObject*/ ));
 BA.debugLineNum = 536;BA.debugLine="Dim email_sent As Int = Record2.GetInt(\"email";
Debug.ShouldStop(8388608);
_email_sent = _record2.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("email_sent")));Debug.locals.put("email_sent", _email_sent);Debug.locals.put("email_sent", _email_sent);
 BA.debugLineNum = 537;BA.debugLine="If Utils.Int2Bool(email_sent) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 201:
//if
this.state = 206;
if (parent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_email_sent)).<Boolean>get().booleanValue()) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
 BA.debugLineNum = 538;BA.debugLine="editAS.Enabled = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_editas" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 539;BA.debugLine="editAS.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_editas" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 205:
//C
this.state = 206;
 BA.debugLineNum = 541;BA.debugLine="editAS.Enabled = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_editas" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 542;BA.debugLine="editAS.Visible = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_editas" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 543;BA.debugLine="editAS.Tag = CurrentASTagcode";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_editas" /*RemoteObject*/ ).runMethod(false,"setTag",(__ref.getField(true,"_currentastagcode" /*RemoteObject*/ )));
 if (true) break;

case 206:
//C
this.state = 207;
;
 if (true) break;

case 207:
//C
this.state = 347;
;
 BA.debugLineNum = 546;BA.debugLine="Dim id As ItemData";
Debug.ShouldStop(2);
_id = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.checklist3._itemdata");Debug.locals.put("id", _id);
 BA.debugLineNum = 547;BA.debugLine="id.Initialize";
Debug.ShouldStop(4);
_id.runVoidMethod ("Initialize");
 BA.debugLineNum = 548;BA.debugLine="id.CollapsedHeight = 50dip";
Debug.ShouldStop(8);
_id.setField ("CollapsedHeight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 549;BA.debugLine="id.ExpandedHeight = 240dip";
Debug.ShouldStop(16);
_id.setField ("ExpandedHeight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240))));
 BA.debugLineNum = 550;BA.debugLine="asHistoryList.Add( CreateASItemPanel(this, id,";
Debug.ShouldStop(32);
__ref.getField(false,"_ashistorylist" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.expandedlistview.class, "_add" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createasitempanel" /*RemoteObject*/ ,(Object)(_this),(Object)(_id),(Object)(_record2),(Object)(BA.numberCast(int.class, _n)))),(Object)((_id)));
 if (true) break;
if (true) break;

case 208:
//C
this.state = 211;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 552;BA.debugLine="takeAS.Enabled = False";
Debug.ShouldStop(128);
__ref.getField(false,"_takeas" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 553;BA.debugLine="takeAS.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_takeas" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 210:
//C
this.state = 211;
 BA.debugLineNum = 556;BA.debugLine="asPanel.AddView(CreateASPanel(this, False, Reco";
Debug.ShouldStop(2048);
__ref.getField(false,"_aspanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_createaspanel" /*RemoteObject*/ ,(Object)(_this),(Object)(parent.__c.getField(true,"False")),(Object)(_record2)).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 if (true) break;

case 211:
//C
this.state = 212;
;
 BA.debugLineNum = 558;BA.debugLine="Record2.Close";
Debug.ShouldStop(8192);
_record2.runVoidMethod ("Close");
 BA.debugLineNum = 560;BA.debugLine="listsTabPanel.ScrollTo(TabPos, True)";
Debug.ShouldStop(32768);
__ref.getField(false,"_liststabpanel" /*RemoteObject*/ ).runVoidMethod ("ScrollTo",(Object)(_tabpos),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 562;BA.debugLine="If (action >= 1) Then";
Debug.ShouldStop(131072);
if (true) break;

case 212:
//if
this.state = 265;
if ((RemoteObject.solveBoolean("g",_action,BA.numberCast(double.class, 1)))) { 
this.state = 214;
}if (true) break;

case 214:
//C
this.state = 215;
 BA.debugLineNum = 563;BA.debugLine="If (action = 1) Then";
Debug.ShouldStop(262144);
if (true) break;

case 215:
//if
this.state = 264;
if ((RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 1)))) { 
this.state = 217;
}else 
{ BA.debugLineNum = 565;BA.debugLine="Else If (action = 2) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 2)))) { 
this.state = 219;
}else 
{ BA.debugLineNum = 600;BA.debugLine="Else If (action = 3) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 3)))) { 
this.state = 239;
}else 
{ BA.debugLineNum = 620;BA.debugLine="Else If (action = 4) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 4)))) { 
this.state = 263;
}}}}
if (true) break;

case 217:
//C
this.state = 264;
 BA.debugLineNum = 564;BA.debugLine="takePhoto_Click";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_takephoto_click" /*void*/ );
 if (true) break;

case 219:
//C
this.state = 220;
 BA.debugLineNum = 570;BA.debugLine="If (this.UniqueKey.Trim = \"b444a024-a05d-5187-";
Debug.ShouldStop(33554432);
if (true) break;

case 220:
//if
this.state = 237;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim"),RemoteObject.createImmutable("b444a024-a05d-5187-8f45-190a32728e6a"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim"),RemoteObject.createImmutable("802a6ecf-3786-5bf1-b85e-76a70cad6b0e")))))) { 
this.state = 222;
}else {
this.state = 228;
}if (true) break;

case 222:
//C
this.state = 223;
 BA.debugLineNum = 571;BA.debugLine="If ItemNotes.Text = \"\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 223:
//if
this.state = 226;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 225;
}if (true) break;

case 225:
//C
this.state = 226;
 BA.debugLineNum = 572;BA.debugLine="ItemNotes.Text = \"Lote: \"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence("Lote: "));
 if (true) break;

case 226:
//C
this.state = 237;
;
 if (true) break;

case 228:
//C
this.state = 229;
 BA.debugLineNum = 575;BA.debugLine="If ItemNotes.Text = \"\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 229:
//if
this.state = 236;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 231;
}if (true) break;

case 231:
//C
this.state = 232;
 BA.debugLineNum = 576;BA.debugLine="Dim scriptData As String = $\"select ifnull(a";
Debug.ShouldStop(-2147483648);
_scriptdata = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(a.do_origin_titlefield, '') as valor\n"),RemoteObject.createImmutable("						from dta_tasks_items_answers as a\n"),RemoteObject.createImmutable("						inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode\n"),RemoteObject.createImmutable("							and b.item_tagcode=a.item_tagcode\n"),RemoteObject.createImmutable("							and b.unique_key=a.unique_key\n"),RemoteObject.createImmutable("							and b.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("						where 1=1\n"),RemoteObject.createImmutable("						and a.force_more=1 \n"),RemoteObject.createImmutable("						and b.request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and b.task_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and b.item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and b.unique_key = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and b.tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and b.repeatcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and b.repeatitemcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and b.repeatfieldcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("scriptData", _scriptdata);Debug.locals.put("scriptData", _scriptdata);
 BA.debugLineNum = 592;BA.debugLine="Dim textoObs As String = DBStructures.GetScr";
Debug.ShouldStop(32768);
_textoobs = parent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_scriptdata),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("textoObs", _textoobs);Debug.locals.put("textoObs", _textoobs);
 BA.debugLineNum = 594;BA.debugLine="If Utils.NE(textoObs) Then";
Debug.ShouldStop(131072);
if (true) break;

case 232:
//if
this.state = 235;
if (parent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_textoobs)).<Boolean>get().booleanValue()) { 
this.state = 234;
}if (true) break;

case 234:
//C
this.state = 235;
 BA.debugLineNum = 595;BA.debugLine="ItemNotes.Text = textoObs";
Debug.ShouldStop(262144);
__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_textoobs));
 if (true) break;

case 235:
//C
this.state = 236;
;
 if (true) break;

case 236:
//C
this.state = 237;
;
 if (true) break;

case 237:
//C
this.state = 264;
;
 BA.debugLineNum = 599;BA.debugLine="ItemNotes.RequestFocus";
Debug.ShouldStop(4194304);
__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 if (true) break;

case 239:
//C
this.state = 240;
 BA.debugLineNum = 601;BA.debugLine="If Utils.NNE(CurrentASTagcode) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 240:
//if
this.state = 261;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_currentastagcode" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 242;
}else {
this.state = 254;
}if (true) break;

case 242:
//C
this.state = 243;
 BA.debugLineNum = 603;BA.debugLine="If (editAS.Enabled) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 243:
//if
this.state = 252;
if ((__ref.getField(false,"_editas" /*RemoteObject*/ ).runMethod(true,"getEnabled")).<Boolean>get().booleanValue()) { 
this.state = 245;
}else {
this.state = 251;
}if (true) break;

case 245:
//C
this.state = 246;
 BA.debugLineNum = 604;BA.debugLine="Msgbox2Async(ShareCode.GeneralAtentionTitle,";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent._sharecode._generalatentiontitle /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent._sharecode._asexistsedititquestion /*RemoteObject*/ )),(Object)(parent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent._sharecode._option_no /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 605;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreactionsdialog"), null);
this.state = 348;
return;
case 348:
//C
this.state = 246;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 606;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(536870912);
if (true) break;

case 246:
//if
this.state = 249;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 248;
}if (true) break;

case 248:
//C
this.state = 249;
 BA.debugLineNum = 607;BA.debugLine="editAS_Click";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_editas_click" /*RemoteObject*/ );
 if (true) break;

case 249:
//C
this.state = 252;
;
 if (true) break;

case 251:
//C
this.state = 252;
 BA.debugLineNum = 610;BA.debugLine="MsgboxAsync(ShareCode.GeneralAtentionTitle,";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent._sharecode._generalatentiontitle /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent._sharecode._asexistsnoeditinformation /*RemoteObject*/ )),__ref.getField(false, "ba"));
 if (true) break;

case 252:
//C
this.state = 261;
;
 if (true) break;

case 254:
//C
this.state = 255;
 BA.debugLineNum = 613;BA.debugLine="If Utils.NNE(tagcodeTPA) Then";
Debug.ShouldStop(16);
if (true) break;

case 255:
//if
this.state = 260;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tagcodetpa)).<Boolean>get().booleanValue()) { 
this.state = 257;
}else {
this.state = 259;
}if (true) break;

case 257:
//C
this.state = 260;
 BA.debugLineNum = 614;BA.debugLine="takeASClick(tagcodeTPA, groupTPA, actionforc";
Debug.ShouldStop(32);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_takeasclick" /*void*/ ,(Object)(_tagcodetpa),(Object)(_grouptpa),(Object)(_actionforce));
 if (true) break;

case 259:
//C
this.state = 260;
 BA.debugLineNum = 616;BA.debugLine="takeAS_Click";
Debug.ShouldStop(128);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_takeas_click" /*RemoteObject*/ );
 if (true) break;

case 260:
//C
this.state = 261;
;
 if (true) break;

case 261:
//C
this.state = 264;
;
 if (true) break;

case 263:
//C
this.state = 264;
 BA.debugLineNum = 623;BA.debugLine="takeSignature_Click";
Debug.ShouldStop(16384);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_takesignature_click" /*RemoteObject*/ );
 if (true) break;

case 264:
//C
this.state = 265;
;
 if (true) break;

case 265:
//C
this.state = 266;
;
 if (true) break;
;
 BA.debugLineNum = 628;BA.debugLine="If ItemNotes.Text = \"\" Then";
Debug.ShouldStop(524288);

case 266:
//if
this.state = 273;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 268;
}if (true) break;

case 268:
//C
this.state = 269;
 BA.debugLineNum = 629;BA.debugLine="Dim scriptData As String = $\"select ifnull(a.do_";
Debug.ShouldStop(1048576);
_scriptdata = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(a.do_origin_titlefield, '') as valor\n"),RemoteObject.createImmutable("						from dta_tasks_items_answers as a\n"),RemoteObject.createImmutable("						inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode\n"),RemoteObject.createImmutable("							and b.item_tagcode=a.item_tagcode\n"),RemoteObject.createImmutable("							and b.unique_key=a.unique_key\n"),RemoteObject.createImmutable("							and b.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("						where 1=1\n"),RemoteObject.createImmutable("						and a.force_more=1 \n"),RemoteObject.createImmutable("						and b.request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and b.task_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and b.item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and b.unique_key = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and b.tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and b.repeatcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and b.repeatitemcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and b.repeatfieldcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("scriptData", _scriptdata);Debug.locals.put("scriptData", _scriptdata);
 BA.debugLineNum = 645;BA.debugLine="Dim textoObs As String = DBStructures.GetScriptC";
Debug.ShouldStop(16);
_textoobs = parent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_scriptdata),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("textoObs", _textoobs);Debug.locals.put("textoObs", _textoobs);
 BA.debugLineNum = 647;BA.debugLine="If Utils.NE(textoObs) Then";
Debug.ShouldStop(64);
if (true) break;

case 269:
//if
this.state = 272;
if (parent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_textoobs)).<Boolean>get().booleanValue()) { 
this.state = 271;
}if (true) break;

case 271:
//C
this.state = 272;
 BA.debugLineNum = 648;BA.debugLine="ItemNotes.Text = textoObs";
Debug.ShouldStop(128);
__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_textoobs));
 if (true) break;

case 272:
//C
this.state = 273;
;
 if (true) break;
;
 BA.debugLineNum = 652;BA.debugLine="If Not(this.Origin = 7) Then";
Debug.ShouldStop(2048);

case 273:
//if
this.state = 284;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_this.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 7))))).<Boolean>get().booleanValue()) { 
this.state = 275;
}if (true) break;

case 275:
//C
this.state = 276;
 BA.debugLineNum = 657;BA.debugLine="If ItemNotes.Text = \"\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 276:
//if
this.state = 283;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 278;
}if (true) break;

case 278:
//C
this.state = 279;
 BA.debugLineNum = 658;BA.debugLine="Dim scriptData As String = $\"select ifnull(a.do";
Debug.ShouldStop(131072);
_scriptdata = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(a.do_origin_titlefield, '') as valor\n"),RemoteObject.createImmutable("					from dta_tasks_items_answers as a\n"),RemoteObject.createImmutable("					inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode\n"),RemoteObject.createImmutable("						and b.item_tagcode=a.item_tagcode\n"),RemoteObject.createImmutable("						and b.unique_key=a.unique_key\n"),RemoteObject.createImmutable("						and b.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("					where 1=1\n"),RemoteObject.createImmutable("					and a.force_more=1 \n"),RemoteObject.createImmutable("					and b.request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and b.task_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("					and b.item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and b.unique_key = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("					and b.tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("					and b.repeatcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("					and b.repeatitemcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("					and b.repeatfieldcounter = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("scriptData", _scriptdata);Debug.locals.put("scriptData", _scriptdata);
 BA.debugLineNum = 674;BA.debugLine="Dim textoObs As String = DBStructures.GetScript";
Debug.ShouldStop(2);
_textoobs = parent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_scriptdata),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("textoObs", _textoobs);Debug.locals.put("textoObs", _textoobs);
 BA.debugLineNum = 676;BA.debugLine="If Utils.NE(textoObs) Then";
Debug.ShouldStop(8);
if (true) break;

case 279:
//if
this.state = 282;
if (parent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_textoobs)).<Boolean>get().booleanValue()) { 
this.state = 281;
}if (true) break;

case 281:
//C
this.state = 282;
 BA.debugLineNum = 677;BA.debugLine="ItemNotes.Text = textoObs";
Debug.ShouldStop(16);
__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_textoobs));
 if (true) break;

case 282:
//C
this.state = 283;
;
 if (true) break;

case 283:
//C
this.state = 284;
;
 BA.debugLineNum = 680;BA.debugLine="ItemNotes.RequestFocus";
Debug.ShouldStop(128);
__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 if (true) break;

case 284:
//C
this.state = 285;
;
 BA.debugLineNum = 683;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 684;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreactionsdialog"), _sf);
this.state = 349;
return;
case 349:
//C
this.state = 285;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 687;BA.debugLine="If res = DialogResponse.POSITIVE Then ' BOTAO VOL";
Debug.ShouldStop(16384);
if (true) break;

case 285:
//if
this.state = 338;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 287;
}else 
{ BA.debugLineNum = 883;BA.debugLine="Else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 337;
}}
if (true) break;

case 287:
//C
this.state = 288;
 BA.debugLineNum = 688;BA.debugLine="CurrentItemNotesText = ItemNotes.Text";
Debug.ShouldStop(32768);
__ref.setField ("_currentitemnotestext" /*RemoteObject*/ ,__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 690;BA.debugLine="If (HaveTagcode) Then";
Debug.ShouldStop(131072);
if (true) break;

case 288:
//if
this.state = 293;
if ((_havetagcode).<Boolean>get().booleanValue()) { 
this.state = 290;
}else {
this.state = 292;
}if (true) break;

case 290:
//C
this.state = 293;
 BA.debugLineNum = 691;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(262144);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("			where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and inner_request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("			and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 292:
//C
this.state = 293;
 BA.debugLineNum = 702;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("			where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and inner_request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("			and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("			and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 293:
//C
this.state = 294;
;
 BA.debugLineNum = 715;BA.debugLine="Dim evento As String = \"\"";
Debug.ShouldStop(1024);
_evento = BA.ObjectToString("");Debug.locals.put("evento", _evento);Debug.locals.put("evento", _evento);
 BA.debugLineNum = 716;BA.debugLine="Dim TipoEvento As String = \"\"";
Debug.ShouldStop(2048);
_tipoevento = BA.ObjectToString("");Debug.locals.put("TipoEvento", _tipoevento);Debug.locals.put("TipoEvento", _tipoevento);
 BA.debugLineNum = 718;BA.debugLine="If (HaveTagcode) Then";
Debug.ShouldStop(8192);
if (true) break;

case 294:
//if
this.state = 297;
if ((_havetagcode).<Boolean>get().booleanValue()) { 
this.state = 296;
}if (true) break;

case 296:
//C
this.state = 297;
 BA.debugLineNum = 719;BA.debugLine="evento  = DBStructures.GetScriptColumnStrEVC($\"";
Debug.ShouldStop(16384);
_evento = parent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(event_tagcode,'') as evento from dta_tasks_items_answers_events where\n"),RemoteObject.createImmutable("								task_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								 AND unique_key = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								 and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								 AND item_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(false,"TaskInfo" /*RemoteObject*/ ).getField(true,"item_tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("evento")));Debug.locals.put("evento", _evento);
 if (true) break;

case 297:
//C
this.state = 298;
;
 BA.debugLineNum = 726;BA.debugLine="Log(evento)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","666716211",_evento,0);
 BA.debugLineNum = 728;BA.debugLine="If evento = \"EVENTTASK_NOTESACTION\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 298:
//if
this.state = 315;
if (RemoteObject.solveBoolean("=",_evento,BA.ObjectToString("EVENTTASK_NOTESACTION"))) { 
this.state = 300;
}if (true) break;

case 300:
//C
this.state = 301;
 BA.debugLineNum = 741;BA.debugLine="TipoEvento  = DBStructures.GetScriptColumnStrEV";
Debug.ShouldStop(16);
_tipoevento = parent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(value,'') as tipoevento from dta_tasks_items_answers_events where\n"),RemoteObject.createImmutable("								task_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								 AND unique_key = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								 and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								 AND item_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(false,"TaskInfo" /*RemoteObject*/ ).getField(true,"item_tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("tipoevento")));Debug.locals.put("TipoEvento", _tipoevento);
 BA.debugLineNum = 746;BA.debugLine="If Utils.NNE(TipoEvento) Then";
Debug.ShouldStop(512);
if (true) break;

case 301:
//if
this.state = 304;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tipoevento)).<Boolean>get().booleanValue()) { 
this.state = 303;
}if (true) break;

case 303:
//C
this.state = 304;
 BA.debugLineNum = 747;BA.debugLine="tagcodeTPA = TipoEvento";
Debug.ShouldStop(1024);
_tagcodetpa = _tipoevento;Debug.locals.put("tagcodeTPA", _tagcodetpa);
 if (true) break;

case 304:
//C
this.state = 305;
;
 BA.debugLineNum = 751;BA.debugLine="Dim RecCount As Cursor";
Debug.ShouldStop(16384);
_reccount = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("RecCount", _reccount);
 BA.debugLineNum = 752;BA.debugLine="Dim SqlCheck As String = $\"SELECT * from dta_ac";
Debug.ShouldStop(32768);
_sqlcheck = (RemoteObject.concat(RemoteObject.createImmutable("SELECT * from dta_actions where request_Tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("			and action_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("			and task_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("			and item_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("			and uniquekey = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")));Debug.locals.put("SqlCheck", _sqlcheck);Debug.locals.put("SqlCheck", _sqlcheck);
 BA.debugLineNum = 757;BA.debugLine="RecCount = Starter.LocalSQLEVC.ExecQuery($\"${Sq";
Debug.ShouldStop(1048576);
_reccount = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqlcheck))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 758;BA.debugLine="If RecCount.RowCount = 0 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 305:
//if
this.state = 314;
if (RemoteObject.solveBoolean("=",_reccount.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 307;
}if (true) break;

case 307:
//C
this.state = 308;
 BA.debugLineNum = 760;BA.debugLine="Dim asTagcode As String = Utils.GenerateTagcod";
Debug.ShouldStop(8388608);
_astagcode = parent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AS0")));Debug.locals.put("asTagcode", _astagcode);Debug.locals.put("asTagcode", _astagcode);
 BA.debugLineNum = 761;BA.debugLine="Dim dataoper As String = Utils.GetCurrDatetime";
Debug.ShouldStop(16777216);
_dataoper = parent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("dataoper", _dataoper);Debug.locals.put("dataoper", _dataoper);
 BA.debugLineNum = 763;BA.debugLine="asTagcode = DBStructures.InsertRequestASEVC(as";
Debug.ShouldStop(67108864);
_astagcode = parent._dbstructures.runMethod(true,"_insertrequestasevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_astagcode),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )),(Object)(_this.getField(true,"Action" /*RemoteObject*/ )),(Object)(_this.getField(true,"Task" /*RemoteObject*/ )),(Object)(_this.getField(true,"Item" /*RemoteObject*/ )),(Object)(_this.getField(true,"UniqueKey" /*RemoteObject*/ )),(Object)(_thetagcode),(Object)(_this.getField(true,"Title" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )),(Object)(BA.ObjectToString("TPRIOT_01")),(Object)(BA.ObjectToString("TGRVT_02")),(Object)(parent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString("TOPERT_01")),(Object)(_dataoper),(Object)(BA.NumberToString(0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"RepeatCounter" /*RemoteObject*/ )),(Object)(_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )),(Object)(_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )),(Object)(_dataoper),(Object)(_tagcodetpa),(Object)(_grouptpa),(Object)(__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("asTagcode", _astagcode);
 BA.debugLineNum = 768;BA.debugLine="Dim params As Map";
Debug.ShouldStop(-2147483648);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 769;BA.debugLine="params.Initialize";
Debug.ShouldStop(1);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 770;BA.debugLine="params.Clear";
Debug.ShouldStop(2);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 771;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 772;BA.debugLine="params.Put(\"ACLRequest\", this.Request.Trim)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 773;BA.debugLine="params.Put(\"ACLAction\", this.Action.Trim)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 774;BA.debugLine="params.Put(\"ACLTask\", this.Task.Trim)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 775;BA.debugLine="params.Put(\"ACLItem\", this.Item.Trim)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 776;BA.debugLine="params.Put(\"ACLUniqueKey\", this.UniqueKey.Trim";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 777;BA.debugLine="params.Put(\"ACLTagcode\", theTagcode)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((_thetagcode)));
 BA.debugLineNum = 778;BA.debugLine="params.Put(\"ACLATitle\", this.Title)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATitle"))),(Object)((_this.getField(true,"Title" /*RemoteObject*/ ))));
 BA.debugLineNum = 779;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ))));
 BA.debugLineNum = 780;BA.debugLine="params.Put(\"ACLAASNC\", asTagcode)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAASNC"))),(Object)((_astagcode)));
 BA.debugLineNum = 781;BA.debugLine="params.Put(\"ACLAType\", tagcodeTPA)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAType"))),(Object)((_tagcodetpa)));
 BA.debugLineNum = 782;BA.debugLine="params.Put(\"ACLADatetime\", dataoper)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_dataoper)));
 BA.debugLineNum = 783;BA.debugLine="params.Put(\"ACLSessUser\", ShareCode.SESS_OPER_";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLSessUser"))),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 784;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounte";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 785;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCo";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 786;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfield";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 787;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 788;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 789;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 790;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 791;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 792;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 793;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 795;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(67108864);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/event/new/asnc")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 796;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(134217728);
if (true) break;

case 308:
//if
this.state = 313;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 310;
}else {
this.state = 312;
}if (true) break;

case 310:
//C
this.state = 313;
 BA.debugLineNum = 797;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
Debug.ShouldStop(268435456);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")));
 if (true) break;

case 312:
//C
this.state = 313;
 BA.debugLineNum = 799;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(1073741824);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 800;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(-2147483648);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 313:
//C
this.state = 314;
;
 BA.debugLineNum = 802;BA.debugLine="Sleep(550)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreactionsdialog"),BA.numberCast(int.class, 550));
this.state = 350;
return;
case 350:
//C
this.state = 314;
;
 BA.debugLineNum = 803;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","666716288",_ssql,0);
 if (true) break;

case 314:
//C
this.state = 315;
;
 if (true) break;

case 315:
//C
this.state = 316;
;
 BA.debugLineNum = 808;BA.debugLine="Utils.SaveSQLToLog(\"GetMoreActionsDialog\",sSQL,";
Debug.ShouldStop(128);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("GetMoreActionsDialog")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 811;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1024);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 812;BA.debugLine="params.Initialize";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 813;BA.debugLine="params.Clear";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 814;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 815;BA.debugLine="params.Put(\"ACLRequest\", this.Request.Trim)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 816;BA.debugLine="params.Put(\"ACLAction\", this.Action.Trim)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 817;BA.debugLine="params.Put(\"ACLTask\", this.Task.Trim)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 818;BA.debugLine="params.Put(\"ACLItem\", this.Item.Trim)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 819;BA.debugLine="params.Put(\"ACLUniqueKey\", this.UniqueKey.Trim)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim"))));
 BA.debugLineNum = 820;BA.debugLine="params.Put(\"ACLTagcode\", theTagcode)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((_thetagcode)));
 BA.debugLineNum = 821;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ))));
 BA.debugLineNum = 822;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 823;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 824;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 825;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 826;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 827;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 828;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 829;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 830;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 831;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 833;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(1);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/obs/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 834;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(2);
if (true) break;

case 316:
//if
this.state = 321;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 318;
}else {
this.state = 320;
}if (true) break;

case 318:
//C
this.state = 321;
 BA.debugLineNum = 835;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Requ";
Debug.ShouldStop(4);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")));
 if (true) break;

case 320:
//C
this.state = 321;
 BA.debugLineNum = 837;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(16);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 838;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(32);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 321:
//C
this.state = 322;
;
 BA.debugLineNum = 840;BA.debugLine="Sleep(550)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreactionsdialog"),BA.numberCast(int.class, 550));
this.state = 351;
return;
case 351:
//C
this.state = 322;
;
 BA.debugLineNum = 842;BA.debugLine="For n=0 To ItemImages.Size-1";
Debug.ShouldStop(512);
if (true) break;

case 322:
//for
this.state = 335;
step416 = 1;
limit416 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 352;
if (true) break;

case 352:
//C
this.state = 335;
if ((step416 > 0 && _n <= limit416) || (step416 < 0 && _n >= limit416)) this.state = 324;
if (true) break;

case 353:
//C
this.state = 352;
_n = ((int)(0 + _n + step416)) ;
Debug.locals.put("n", _n);
if (true) break;

case 324:
//C
this.state = 325;
 BA.debugLineNum = 843;BA.debugLine="Dim pnl As Panel =ItemImages.GetPanel(n)";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _n))).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 844;BA.debugLine="Dim img As ImageView = pnl.GetView(0)";
Debug.ShouldStop(2048);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("img", _img);
 BA.debugLineNum = 845;BA.debugLine="Dim fln As Label = pnl.GetView(1)";
Debug.ShouldStop(4096);
_fln = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fln = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fln", _fln);
 BA.debugLineNum = 846;BA.debugLine="Dim lbl As Label = pnl.GetView(2)";
Debug.ShouldStop(8192);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 847;BA.debugLine="If (lbl.Tag=1) Or (lbl.Tag=2) Then";
Debug.ShouldStop(16384);
if (true) break;

case 325:
//if
this.state = 334;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_lbl.runMethod(false,"getTag"),RemoteObject.createImmutable((1)))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_lbl.runMethod(false,"getTag"),RemoteObject.createImmutable((2))))))) { 
this.state = 327;
}if (true) break;

case 327:
//C
this.state = 328;
 BA.debugLineNum = 849;BA.debugLine="Utils.SaveImageviewToFile(img.Bitmap, $\"${fln.";
Debug.ShouldStop(65536);
parent._utils.runVoidMethod ("_saveimageviewtofile" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _img.runMethod(false,"getBitmap")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fln.runMethod(true,"getText")))),RemoteObject.createImmutable(".png")))),(Object)(parent._sharecode._device_def_img_filetype /*RemoteObject*/ ));
 BA.debugLineNum = 850;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(131072);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 851;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 852;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
Debug.ShouldStop(524288);
_imgb64 = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fln.runMethod(true,"getText")))),RemoteObject.createImmutable(".png")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 853;BA.debugLine="If (lbl.Tag=1) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 328:
//if
this.state = 333;
if ((RemoteObject.solveBoolean("=",_lbl.runMethod(false,"getTag"),RemoteObject.createImmutable((1))))) { 
this.state = 330;
}else {
this.state = 332;
}if (true) break;

case 330:
//C
this.state = 333;
 BA.debugLineNum = 855;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
Debug.ShouldStop(4194304);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values_images set imageb64='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("							where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and inner_request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("							and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and \n"),RemoteObject.createImmutable("							item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' and \n"),RemoteObject.createImmutable("							tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("' and imagename='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fln.runMethod(true,"getText").runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("							and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("							and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("							and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 332:
//C
this.state = 333;
 BA.debugLineNum = 864;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"";
Debug.ShouldStop(-2147483648);
_maxid = RemoteObject.solve(new RemoteObject[] {parent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 865;BA.debugLine="Dim sSQL As String = $\"insert into dta_reques";
Debug.ShouldStop(1);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images \n"),RemoteObject.createImmutable("							(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"),RemoteObject.createImmutable("							imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter)\n"),RemoteObject.createImmutable("							values ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("					'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fln.runMethod(true,"getText").runMethod(true,"trim")))),RemoteObject.createImmutable("', 1, "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(")")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 333:
//C
this.state = 334;
;
 BA.debugLineNum = 872;BA.debugLine="Utils.SaveSQLToLog(\"GetMoreActionsDialog\",sSQL";
Debug.ShouldStop(128);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("GetMoreActionsDialog")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 334:
//C
this.state = 353;
;
 if (true) break;
if (true) break;

case 335:
//C
this.state = 338;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 877;BA.debugLine="Sleep(550)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreactionsdialog"),BA.numberCast(int.class, 550));
this.state = 354;
return;
case 354:
//C
this.state = 338;
;
 BA.debugLineNum = 878;BA.debugLine="CallSub(activObj, \"ReturnFromCLAI\")";
Debug.ShouldStop(8192);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_activobj),(Object)(RemoteObject.createImmutable("ReturnFromCLAI")));
 BA.debugLineNum = 881;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(65536);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 if (true) break;

case 337:
//C
this.state = 338;
 BA.debugLineNum = 884;BA.debugLine="CurrentItemNotesText = ItemNotes.Text";
Debug.ShouldStop(524288);
__ref.setField ("_currentitemnotestext" /*RemoteObject*/ ,__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 885;BA.debugLine="Dim lst As List";
Debug.ShouldStop(1048576);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 886;BA.debugLine="lst.Initialize";
Debug.ShouldStop(2097152);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 887;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(4194304);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 888;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(8388608);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 889;BA.debugLine="Filter.GetMoreSendEmailDialog(CurrentCLAItem, Cu";
Debug.ShouldStop(16777216);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getmoresendemaildialog" /*void*/ ,(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currenttagcode" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_currentcld" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )),(Object)(_lst));
 if (true) break;

case 338:
//C
this.state = -1;
;
 BA.debugLineNum = 891;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _getmoreeditactionsdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _astagcode,RemoteObject _obs,RemoteObject _isnew,RemoteObject _thetagcode,RemoteObject _parentdialog,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _actionforce) throws Exception{
try {
		Debug.PushSubsStack("GetMoreEditActionsDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2756);
if (RapidSub.canDelegate("getmoreeditactionsdialog")) { __ref.runUserSub(false, "appactiondialogs","getmoreeditactionsdialog", __ref, _activ, _this, _astagcode, _obs, _isnew, _thetagcode, _parentdialog, _tagcodetpa, _grouptpa, _actionforce); return;}
ResumableSub_GetMoreEditActionsDialog rsub = new ResumableSub_GetMoreEditActionsDialog(null,__ref,_activ,_this,_astagcode,_obs,_isnew,_thetagcode,_parentdialog,_tagcodetpa,_grouptpa,_actionforce);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetMoreEditActionsDialog extends BA.ResumableSub {
public ResumableSub_GetMoreEditActionsDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _astagcode,RemoteObject _obs,RemoteObject _isnew,RemoteObject _thetagcode,RemoteObject _parentdialog,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _actionforce) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._astagcode = _astagcode;
this._obs = _obs;
this._isnew = _isnew;
this._thetagcode = _thetagcode;
this._parentdialog = _parentdialog;
this._tagcodetpa = _tagcodetpa;
this._grouptpa = _grouptpa;
this._actionforce = _actionforce;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _activ;
RemoteObject _this;
RemoteObject _astagcode;
RemoteObject _obs;
RemoteObject _isnew;
RemoteObject _thetagcode;
RemoteObject _parentdialog;
RemoteObject _tagcodetpa;
RemoteObject _grouptpa;
RemoteObject _actionforce;
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _gravityvalue = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _itc = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._db_itc");
RemoteObject _npos = RemoteObject.createImmutable(0);
RemoteObject _detailstext = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _sendtheemail = RemoteObject.createImmutable(0);
RemoteObject _dtupd = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _newhtml = RemoteObject.createImmutable("");
RemoteObject _recordcount = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _actions_tagcode = RemoteObject.createImmutable("");
RemoteObject _request_tagcode = RemoteObject.createImmutable("");
RemoteObject _reference = RemoteObject.createImmutable("");
RemoteObject _technical_name = RemoteObject.createImmutable("");
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _details = RemoteObject.createImmutable("");
RemoteObject _status_name = RemoteObject.createImmutable("");
RemoteObject _due_date = RemoteObject.createImmutable("");
RemoteObject _priority_name = RemoteObject.createImmutable("");
RemoteObject _gravity_name = RemoteObject.createImmutable("");
RemoteObject _operation_name = RemoteObject.createImmutable("");
RemoteObject _ddate = RemoteObject.createImmutable(0L);
RemoteObject _logo = RemoteObject.createImmutable("");
RemoteObject _logoalt = RemoteObject.createImmutable("");
RemoteObject _logotitle = RemoteObject.createImmutable("");
RemoteObject _suporte = RemoteObject.createImmutable("");
RemoteObject _imglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _actiondatetime = RemoteObject.createImmutable("");
RemoteObject _emailsentdate = RemoteObject.createImmutable("");
int step15;
int limit15;
int step22;
int limit22;
int step40;
int limit40;
int step47;
int limit47;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetMoreEditActionsDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2756);
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
Debug.locals.put("asTagcode", _astagcode);
Debug.locals.put("obs", _obs);
Debug.locals.put("IsNew", _isnew);
Debug.locals.put("theTagcode", _thetagcode);
Debug.locals.put("parentDialog", _parentdialog);
Debug.locals.put("tagcodeTPA", _tagcodetpa);
Debug.locals.put("groupTPA", _grouptpa);
Debug.locals.put("actionforce", _actionforce);
 BA.debugLineNum = 2759;BA.debugLine="Dim Title As String = ShareCode.ActionSubEditTitl";
Debug.ShouldStop(64);
_title = parent._sharecode._actionsubedittitle /*RemoteObject*/ ;Debug.locals.put("Title", _title);Debug.locals.put("Title", _title);
 BA.debugLineNum = 2760;BA.debugLine="If Utils.isNullOrEmpty(asTagcode) Then Title = Sh";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 6;
if (parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_astagcode)).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_title = parent._sharecode._actionsubnewtitle /*RemoteObject*/ ;Debug.locals.put("Title", _title);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2761;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Title, Sh";
Debug.ShouldStop(256);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(parent._sharecode._option_confirm /*RemoteObject*/ ),(Object)(parent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(parent._sharecode._option_sendemail /*RemoteObject*/ ),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2763;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(1024);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2764;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2765;BA.debugLine="ApplDialog.SetSize(100%x,100%y)";
Debug.ShouldStop(4096);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2767;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2771;BA.debugLine="EmailSentOnNewAS = True";
Debug.ShouldStop(262144);
__ref.setField ("_emailsentonnewas" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2772;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreeditactionsdialog"), _sf);
this.state = 122;
return;
case 122:
//C
this.state = 13;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2773;BA.debugLine="pnl.LoadLayout(\"dialog_more_action2\")";
Debug.ShouldStop(1048576);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_more_action2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2777;BA.debugLine="Dim GravityValue As Int = DBStructures.GetScriptC";
Debug.ShouldStop(16777216);
_gravityvalue = parent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT a.points FROM dta_tasks_items_answers AS a\n"),RemoteObject.createImmutable("										 INNER JOIN dta_requests_values AS c ON (c.task_tagcode=a.task_tagcode\n"),RemoteObject.createImmutable("										 	AND c.item_tagcode=a.item_tagcode\n"),RemoteObject.createImmutable("										 	AND c.unique_key=a.unique_key\n"),RemoteObject.createImmutable("										 	AND c.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("											WHERE c.task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("											And c.request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.inner_request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("points")));Debug.locals.put("GravityValue", _gravityvalue);Debug.locals.put("GravityValue", _gravityvalue);
 BA.debugLineNum = 2790;BA.debugLine="dlgASAssign.Add(\"Cliente\")";
Debug.ShouldStop(32);
__ref.getField(false,"_dlgasassign" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Cliente")));
 BA.debugLineNum = 2791;BA.debugLine="For n=0 To AS_Status.Size-1";
Debug.ShouldStop(64);
if (true) break;

case 13:
//for
this.state = 16;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_as_status" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 123;
if (true) break;

case 123:
//C
this.state = 16;
if ((step15 > 0 && _n <= limit15) || (step15 < 0 && _n >= limit15)) this.state = 15;
if (true) break;

case 124:
//C
this.state = 123;
_n = ((int)(0 + _n + step15)) ;
Debug.locals.put("n", _n);
if (true) break;

case 15:
//C
this.state = 124;
 BA.debugLineNum = 2792;BA.debugLine="Dim itc As DB_ITC = AS_Status.Get(n)";
Debug.ShouldStop(128);
_itc = (__ref.getField(false,"_as_status" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 2793;BA.debugLine="dlgASStatus.Add(itc.Title)";
Debug.ShouldStop(256);
__ref.getField(false,"_dlgasstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2796;BA.debugLine="dlgASType.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(2048);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2797;BA.debugLine="dlgASType.DropdownBackgroundColor = Consts.ColorW";
Debug.ShouldStop(4096);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2798;BA.debugLine="dlgASType.Add(\"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2799;BA.debugLine="For n=0 To AS_Types.Size-1";
Debug.ShouldStop(16384);
if (true) break;

case 17:
//for
this.state = 20;
step22 = 1;
limit22 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_as_types" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 125;
if (true) break;

case 125:
//C
this.state = 20;
if ((step22 > 0 && _n <= limit22) || (step22 < 0 && _n >= limit22)) this.state = 19;
if (true) break;

case 126:
//C
this.state = 125;
_n = ((int)(0 + _n + step22)) ;
Debug.locals.put("n", _n);
if (true) break;

case 19:
//C
this.state = 126;
 BA.debugLineNum = 2800;BA.debugLine="Dim itc As DB_ITC = AS_Types.Get(n)";
Debug.ShouldStop(32768);
_itc = (__ref.getField(false,"_as_types" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 2801;BA.debugLine="dlgASType.Add(itc.Title)";
Debug.ShouldStop(65536);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2804;BA.debugLine="If (AS_Types.Size > 0) Then";
Debug.ShouldStop(524288);

case 20:
//if
this.state = 35;
if ((RemoteObject.solveBoolean(">",__ref.getField(false,"_as_types" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2805;BA.debugLine="If (Utils.NNE(tagcodeTPA)) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 23:
//if
this.state = 34;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tagcodetpa))).<Boolean>get().booleanValue()) { 
this.state = 25;
}else {
this.state = 33;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2806;BA.debugLine="Dim nPos As Int = DBStructures.getITCTablePos(D";
Debug.ShouldStop(2097152);
_npos = parent._dbstructures.runMethod(true,"_getitctablepos" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._dbstructures._sql_data_type_astypes /*RemoteObject*/ ),(Object)(_tagcodetpa));Debug.locals.put("nPos", _npos);Debug.locals.put("nPos", _npos);
 BA.debugLineNum = 2807;BA.debugLine="If (nPos > 0) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 26:
//if
this.state = 31;
if ((RemoteObject.solveBoolean(">",_npos,BA.numberCast(double.class, 0)))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 2808;BA.debugLine="dlgASType.SelectedIndex = nPos";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_npos);
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2810;BA.debugLine="dlgASType.SelectedIndex = 1";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 1));
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2813;BA.debugLine="dlgASType.SelectedIndex = 1";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 1));
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 2817;BA.debugLine="dlgASPriority.Color = Consts.ColorWhiteSilverLigh";
Debug.ShouldStop(1);
__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2818;BA.debugLine="dlgASPriority.DropdownBackgroundColor = Consts.Co";
Debug.ShouldStop(2);
__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2819;BA.debugLine="For n=0 To AS_Priority.Size-1";
Debug.ShouldStop(4);
if (true) break;

case 36:
//for
this.state = 39;
step40 = 1;
limit40 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_as_priority" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 127;
if (true) break;

case 127:
//C
this.state = 39;
if ((step40 > 0 && _n <= limit40) || (step40 < 0 && _n >= limit40)) this.state = 38;
if (true) break;

case 128:
//C
this.state = 127;
_n = ((int)(0 + _n + step40)) ;
Debug.locals.put("n", _n);
if (true) break;

case 38:
//C
this.state = 128;
 BA.debugLineNum = 2820;BA.debugLine="Dim itc As DB_ITC = AS_Priority.Get(n)";
Debug.ShouldStop(8);
_itc = (__ref.getField(false,"_as_priority" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 2821;BA.debugLine="dlgASPriority.Add(itc.Title)";
Debug.ShouldStop(16);
__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2824;BA.debugLine="dlgASUrgency.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(128);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2825;BA.debugLine="If (IsNew) Then";
Debug.ShouldStop(256);
if (true) break;

case 40:
//if
this.state = 49;
if ((_isnew).<Boolean>get().booleanValue()) { 
this.state = 42;
}else {
this.state = 48;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2826;BA.debugLine="dlgASUrgency.DropdownBackgroundColor = Consts.Co";
Debug.ShouldStop(512);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2827;BA.debugLine="For n=0 To AS_Urgency.Size-1";
Debug.ShouldStop(1024);
if (true) break;

case 43:
//for
this.state = 46;
step47 = 1;
limit47 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_as_urgency" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 129;
if (true) break;

case 129:
//C
this.state = 46;
if ((step47 > 0 && _n <= limit47) || (step47 < 0 && _n >= limit47)) this.state = 45;
if (true) break;

case 130:
//C
this.state = 129;
_n = ((int)(0 + _n + step47)) ;
Debug.locals.put("n", _n);
if (true) break;

case 45:
//C
this.state = 130;
 BA.debugLineNum = 2828;BA.debugLine="Dim itc As DB_ITC = AS_Urgency.Get(n)";
Debug.ShouldStop(2048);
_itc = (__ref.getField(false,"_as_urgency" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 2829;BA.debugLine="dlgASUrgency.Add(itc.Title)";
Debug.ShouldStop(4096);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 46:
//C
this.state = 49;
Debug.locals.put("n", _n);
;
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 2832;BA.debugLine="dlgASUrgency.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 2835;BA.debugLine="dlgASUrgency.SelectedIndex = GravityValue";
Debug.ShouldStop(262144);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_gravityvalue);
 BA.debugLineNum = 2837;BA.debugLine="dlgASSubject.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2838;BA.debugLine="dlgASSubject.Text = this.Title";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_this.getField(true,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 2839;BA.debugLine="dlgASEmails.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2840;BA.debugLine="dlgASEmails.Text = $\"\"$";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2841;BA.debugLine="dlgASCCEmails.Color = Consts.ColorWhiteSilverLigh";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dlgasccemails" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2842;BA.debugLine="dlgASCCEmails.Text = $\"alertas@${ShareCode.APPL_H";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dlgasccemails" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable("alertas@"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 2843;BA.debugLine="dlgASDueDate.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2845;BA.debugLine="Dim detailsText As String = DBStructures.GetScrip";
Debug.ShouldStop(268435456);
_detailstext = parent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT details from dta_actions WHERE 1=1\n"),RemoteObject.createImmutable("																	AND tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	And iu_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	And request_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	And task_tagcode = '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("details")));Debug.locals.put("detailsText", _detailstext);Debug.locals.put("detailsText", _detailstext);
 BA.debugLineNum = 2853;BA.debugLine="dlgASDetails.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(16);
__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2856;BA.debugLine="dlgASDetails.Text = $\"\"$";
Debug.ShouldStop(128);
__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2858;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"edp\") Th";
Debug.ShouldStop(512);
if (true) break;

case 50:
//if
this.state = 55;
if ((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("edp")))) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 55;
 BA.debugLineNum = 2859;BA.debugLine="dlgASDetails.Text = obs";
Debug.ShouldStop(1024);
__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_obs));
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 2861;BA.debugLine="dlgASDetails.Text = detailsText";
Debug.ShouldStop(4096);
__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_detailstext));
 if (true) break;

case 55:
//C
this.state = 56;
;
 BA.debugLineNum = 2865;BA.debugLine="ApplDialog.GetButton(DialogResponse.NEGATIVE).Ena";
Debug.ShouldStop(65536);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))).runMethod(true,"setEnabled",parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_actionforce)))));
 BA.debugLineNum = 2867;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreeditactionsdialog"), _sf);
this.state = 131;
return;
case 131:
//C
this.state = 56;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2868;BA.debugLine="If (res = DialogResponse.POSITIVE) Or (res = Dial";
Debug.ShouldStop(524288);
if (true) break;

case 56:
//if
this.state = 121;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))))) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 2869;BA.debugLine="Dim sendTheEmail As Int = Utils.Bool2Int(res = D";
Debug.ShouldStop(1048576);
_sendtheemail = parent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))));Debug.locals.put("sendTheEmail", _sendtheemail);Debug.locals.put("sendTheEmail", _sendtheemail);
 BA.debugLineNum = 2870;BA.debugLine="Dim dtupd As String = Utils.GetCurrDatetimeExt";
Debug.ShouldStop(2097152);
_dtupd = parent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("dtupd", _dtupd);Debug.locals.put("dtupd", _dtupd);
 BA.debugLineNum = 2871;BA.debugLine="asTagcode = DBStructures.UpdateRequestASEVC(asTa";
Debug.ShouldStop(4194304);
_astagcode = parent._dbstructures.runMethod(true,"_updaterequestasevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_astagcode),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )),(Object)(_this.getField(true,"Action" /*RemoteObject*/ )),(Object)(_this.getField(true,"Task" /*RemoteObject*/ )),(Object)(_this.getField(true,"Item" /*RemoteObject*/ )),(Object)(_this.getField(true,"UniqueKey" /*RemoteObject*/ )),(Object)(_thetagcode),(Object)(__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(parent._utils.runMethod(true,"_getaspriority" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._utils.runMethod(true,"_getasurgency" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(parent._utils.runMethod(true,"_getasstatus" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"))),(Object)(BA.NumberToString(parent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_emailsentonnewas" /*RemoteObject*/ ))))),(Object)(__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_this.getField(true,"RepeatCounter" /*RemoteObject*/ )),(Object)(_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )),(Object)(_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )),(Object)(_dtupd),(Object)(_tagcodetpa),(Object)(_grouptpa),(Object)(_obs),(Object)(_sendtheemail));Debug.locals.put("asTagcode", _astagcode);
 BA.debugLineNum = 2878;BA.debugLine="Dim sSQL As String = $\"SELECT DISTINCT a.actions";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT a.actions_tagcode,a.operation_type,a.typerequest_type,a.details,a.priority_tagcode,a.gravity_tagcode,\n"),RemoteObject.createImmutable("						a.team_tagcode, a.technical_tagcode, a.commercial_tagcode, a.close_date, a.due_date, a.send_email, a.email_sent,\n"),RemoteObject.createImmutable("						a.email_to, a.email_cc, a.updated_at, a.active,\n"),RemoteObject.createImmutable("						b.request_tagcode, b.title, b.details,\n"),RemoteObject.createImmutable("						c.status_id, c.entity_tagcode, c.object_tagcode,\n"),RemoteObject.createImmutable("						d.title_import, d.reference, ifnull(e.title,'') as technical_name,\n"),RemoteObject.createImmutable("						IFNULL(t1.tagdesc, '') AS priority_name, \n"),RemoteObject.createImmutable("						IFNULL(t2.tagdesc, '') AS gravity_name, \n"),RemoteObject.createImmutable("						IFNULL(t3.tagdesc, '') AS operation_name,  \n"),RemoteObject.createImmutable("						IFNULL(t4.tagdesc, '') AS status_name\n"),RemoteObject.createImmutable("						FROM dta_actions_items AS a\n"),RemoteObject.createImmutable("						INNER JOIN dta_actions AS b ON (b.tagcode=a.actions_tagcode)\n"),RemoteObject.createImmutable("						INNER JOIN dta_requests AS c ON (c.tagcode=b.request_tagcode)\n"),RemoteObject.createImmutable("						INNER JOIN dta_objects AS d ON (d.tagcode=c.object_tagcode)\n"),RemoteObject.createImmutable("						LEFT JOIN dta_technicals AS e ON (e.tagcode=b.technical_tagcode)\n"),RemoteObject.createImmutable("						LEFT JOIN type_prioritytypes AS t1 ON (t1.tagcode=a.priority_tagcode)\n"),RemoteObject.createImmutable("						LEFT JOIN type_gravitytypes AS t2 ON (t2.tagcode=a.gravity_tagcode)\n"),RemoteObject.createImmutable("						LEFT JOIN type_operationtypes AS t3 ON (t3.tagcode=a.operation_type)\n"),RemoteObject.createImmutable("						LEFT JOIN type_statustypes AS t4 ON (t4.id=c.status_id)\n"),RemoteObject.createImmutable("						WHERE a.actions_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						ORDER BY a.id DESC\n"),RemoteObject.createImmutable("						LIMIT 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2901;BA.debugLine="Dim newHTML As String = \"\"";
Debug.ShouldStop(1048576);
_newhtml = BA.ObjectToString("");Debug.locals.put("newHTML", _newhtml);Debug.locals.put("newHTML", _newhtml);
 BA.debugLineNum = 2902;BA.debugLine="Dim RecordCount As Int = 0";
Debug.ShouldStop(2097152);
_recordcount = BA.numberCast(int.class, 0);Debug.locals.put("RecordCount", _recordcount);Debug.locals.put("RecordCount", _recordcount);
 BA.debugLineNum = 2903;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.E";
Debug.ShouldStop(4194304);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2904;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 59:
//if
this.state = 62;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 2905;BA.debugLine="RecordCount = RecordCount + 1";
Debug.ShouldStop(16777216);
_recordcount = RemoteObject.solve(new RemoteObject[] {_recordcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("RecordCount", _recordcount);
 BA.debugLineNum = 2906;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(33554432);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2908;BA.debugLine="Dim actions_tagcode As String = Utils.ifnullore";
Debug.ShouldStop(134217728);
_actions_tagcode = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("actions_tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("actions_tagcode", _actions_tagcode);Debug.locals.put("actions_tagcode", _actions_tagcode);
 BA.debugLineNum = 2909;BA.debugLine="Dim request_tagcode As String = Utils.ifnullore";
Debug.ShouldStop(268435456);
_request_tagcode = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("request_tagcode", _request_tagcode);Debug.locals.put("request_tagcode", _request_tagcode);
 BA.debugLineNum = 2910;BA.debugLine="Dim reference As String = Utils.ifnullorempty(R";
Debug.ShouldStop(536870912);
_reference = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reference")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("reference", _reference);Debug.locals.put("reference", _reference);
 BA.debugLineNum = 2911;BA.debugLine="Dim technical_name As String = Utils.ifnullorem";
Debug.ShouldStop(1073741824);
_technical_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("technical_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("technical_name", _technical_name);Debug.locals.put("technical_name", _technical_name);
 BA.debugLineNum = 2912;BA.debugLine="Dim updated_at As String = Utils.ifnullorempty(";
Debug.ShouldStop(-2147483648);
_updated_at = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("updated_at")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 2913;BA.debugLine="Dim details As String = Utils.ifnullorempty(Rec";
Debug.ShouldStop(1);
_details = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("details", _details);Debug.locals.put("details", _details);
 BA.debugLineNum = 2914;BA.debugLine="Dim status_name As String = Utils.ifnullorempty";
Debug.ShouldStop(2);
_status_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("status_name", _status_name);Debug.locals.put("status_name", _status_name);
 BA.debugLineNum = 2915;BA.debugLine="Dim due_date As String = Utils.ifnullorempty(Re";
Debug.ShouldStop(4);
_due_date = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("due_date")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("due_date", _due_date);Debug.locals.put("due_date", _due_date);
 BA.debugLineNum = 2916;BA.debugLine="Dim priority_name As String = Utils.ifnulloremp";
Debug.ShouldStop(8);
_priority_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("priority_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("priority_name", _priority_name);Debug.locals.put("priority_name", _priority_name);
 BA.debugLineNum = 2917;BA.debugLine="Dim gravity_name As String = Utils.ifnullorempt";
Debug.ShouldStop(16);
_gravity_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("gravity_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("gravity_name", _gravity_name);Debug.locals.put("gravity_name", _gravity_name);
 BA.debugLineNum = 2918;BA.debugLine="Dim operation_name As String = Utils.ifnullorem";
Debug.ShouldStop(32);
_operation_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("operation_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("operation_name", _operation_name);Debug.locals.put("operation_name", _operation_name);
 if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 2921;BA.debugLine="Record.Close";
Debug.ShouldStop(256);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2923;BA.debugLine="If Utils.NNE(due_date) Then";
Debug.ShouldStop(1024);
if (true) break;

case 63:
//if
this.state = 72;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_due_date)).<Boolean>get().booleanValue()) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 2924;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 66:
//try
this.state = 71;
this.catchState = 70;
this.state = 68;
if (true) break;

case 68:
//C
this.state = 71;
this.catchState = 70;
 BA.debugLineNum = 2925;BA.debugLine="Dim ddate As Long = DateTime.DateParse(due_dat";
Debug.ShouldStop(4096);
_ddate = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_due_date));Debug.locals.put("ddate", _ddate);Debug.locals.put("ddate", _ddate);
 BA.debugLineNum = 2926;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(8192);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2927;BA.debugLine="due_date = DateTime.Date(ddate)";
Debug.ShouldStop(16384);
_due_date = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ddate));Debug.locals.put("due_date", _due_date);
 Debug.CheckDeviceExceptions();
if (true) break;

case 70:
//C
this.state = 71;
this.catchState = 0;
 BA.debugLineNum = 2929;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","669796013",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 71:
//C
this.state = 72;
this.catchState = 0;
;
 if (true) break;
;
 BA.debugLineNum = 2933;BA.debugLine="If Utils.NNE(due_date) Then";
Debug.ShouldStop(1048576);

case 72:
//if
this.state = 81;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_due_date)).<Boolean>get().booleanValue()) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 2934;BA.debugLine="Try";
Debug.ShouldStop(2097152);
if (true) break;

case 75:
//try
this.state = 80;
this.catchState = 79;
this.state = 77;
if (true) break;

case 77:
//C
this.state = 80;
this.catchState = 79;
 BA.debugLineNum = 2935;BA.debugLine="due_date = due_date.Replace(\"00:00:00\", \"\").Tr";
Debug.ShouldStop(4194304);
_due_date = _due_date.runMethod(true,"replace",(Object)(BA.ObjectToString("00:00:00")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"trim");Debug.locals.put("due_date", _due_date);
 Debug.CheckDeviceExceptions();
if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 0;
 BA.debugLineNum = 2937;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","669796021",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 80:
//C
this.state = 81;
this.catchState = 0;
;
 if (true) break;

case 81:
//C
this.state = 82;
;
 BA.debugLineNum = 2942;BA.debugLine="Dim LOGO As String = \"\"";
Debug.ShouldStop(536870912);
_logo = BA.ObjectToString("");Debug.locals.put("LOGO", _logo);Debug.locals.put("LOGO", _logo);
 BA.debugLineNum = 2943;BA.debugLine="Dim LOGOALT As String = \"\"";
Debug.ShouldStop(1073741824);
_logoalt = BA.ObjectToString("");Debug.locals.put("LOGOALT", _logoalt);Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2944;BA.debugLine="Dim LOGOTITLE As String = \"\"";
Debug.ShouldStop(-2147483648);
_logotitle = BA.ObjectToString("");Debug.locals.put("LOGOTITLE", _logotitle);Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2945;BA.debugLine="Dim SUPORTE As String = \"\"";
Debug.ShouldStop(1);
_suporte = BA.ObjectToString("");Debug.locals.put("SUPORTE", _suporte);Debug.locals.put("SUPORTE", _suporte);
 BA.debugLineNum = 2947;BA.debugLine="If (Utils.Int2Bool(sendTheEmail)) Then";
Debug.ShouldStop(4);
if (true) break;

case 82:
//if
this.state = 104;
if ((parent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sendtheemail))).<Boolean>get().booleanValue()) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 2949;BA.debugLine="LOGO = $\"data:image/jpeg;base64,${ShareCode.APP";
Debug.ShouldStop(16);
_logo = (RemoteObject.concat(RemoteObject.createImmutable("data:image/jpeg;base64,"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable("")));Debug.locals.put("LOGO", _logo);
 BA.debugLineNum = 2950;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"edp\")";
Debug.ShouldStop(32);
if (true) break;

case 85:
//if
this.state = 94;
if ((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("edp")))) { 
this.state = 87;
}else 
{ BA.debugLineNum = 2954;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase = \"u";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("uber")))) { 
this.state = 89;
}else 
{ BA.debugLineNum = 2958;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase.Cont";
Debug.ShouldStop(8192);
if ((parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("grandative")))).<Boolean>get().booleanValue()) { 
this.state = 91;
}else {
this.state = 93;
}}}
if (true) break;

case 87:
//C
this.state = 94;
 BA.debugLineNum = 2951;BA.debugLine="LOGOALT = \"EDP\"";
Debug.ShouldStop(64);
_logoalt = BA.ObjectToString("EDP");Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2952;BA.debugLine="LOGOTITLE = \"EDP Comercial \"";
Debug.ShouldStop(128);
_logotitle = BA.ObjectToString("EDP Comercial ");Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2953;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>Caso encontre alg";
Debug.ShouldStop(256);
_suporte = BA.ObjectToString("<b>Suporte</b><br>Caso encontre alguma dificuldade, por favor entre em contacto com João Salsa (939395171) ou Pedro Fontoura (936113575).");Debug.locals.put("SUPORTE", _suporte);
 if (true) break;

case 89:
//C
this.state = 94;
 BA.debugLineNum = 2955;BA.debugLine="LOGOALT = \"UBER\"";
Debug.ShouldStop(1024);
_logoalt = BA.ObjectToString("UBER");Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2956;BA.debugLine="LOGOTITLE = \"UBER Desinfestações \"";
Debug.ShouldStop(2048);
_logotitle = BA.ObjectToString("UBER Desinfestações ");Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2957;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
Debug.ShouldStop(4096);
_suporte = BA.ObjectToString("<b>Suporte</b><br>");Debug.locals.put("SUPORTE", _suporte);
 if (true) break;

case 91:
//C
this.state = 94;
 BA.debugLineNum = 2959;BA.debugLine="LOGOALT = \"GrandAtive\"";
Debug.ShouldStop(16384);
_logoalt = BA.ObjectToString("GrandAtive");Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2960;BA.debugLine="LOGOTITLE = \"GrandAtive \"";
Debug.ShouldStop(32768);
_logotitle = BA.ObjectToString("GrandAtive ");Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2961;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
Debug.ShouldStop(65536);
_suporte = BA.ObjectToString("<b>Suporte</b><br>");Debug.locals.put("SUPORTE", _suporte);
 if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 2963;BA.debugLine="LOGOALT = $\"${ShareCode.APP_DOMAIN.ToUpperCase";
Debug.ShouldStop(262144);
_logoalt = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toUpperCase")))),RemoteObject.createImmutable("")));Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2964;BA.debugLine="LOGOTITLE = $\"${ShareCode.APP_DOMAIN.ToUpperCa";
Debug.ShouldStop(524288);
_logotitle = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toUpperCase")))),RemoteObject.createImmutable(" ")));Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2965;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
Debug.ShouldStop(1048576);
_suporte = BA.ObjectToString("<b>Suporte</b><br>");Debug.locals.put("SUPORTE", _suporte);
 if (true) break;
;
 BA.debugLineNum = 2968;BA.debugLine="If RecordCount > 0 Then";
Debug.ShouldStop(8388608);

case 94:
//if
this.state = 97;
if (RemoteObject.solveBoolean(">",_recordcount,BA.numberCast(double.class, 0))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 2969;BA.debugLine="Dim newHTML As String = $\"<!DOCTYPE html>";
Debug.ShouldStop(16777216);
_newhtml = (RemoteObject.concat(RemoteObject.createImmutable("<!DOCTYPE html>\n"),RemoteObject.createImmutable("				<html xmlns=\"http://www.w3.org/1999/xhtml\"> <head>  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"),RemoteObject.createImmutable("				<title>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_logotitle))),RemoteObject.createImmutable("</title>  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/></head><body style=\"margin: 0; padding: 0;\">\n"),RemoteObject.createImmutable("				<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"60%\">    <tr> <td bgcolor=\"f00000\">&nbsp;</td>\n"),RemoteObject.createImmutable("				</tr> <tr><td bgcolor=\"#fff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"),RemoteObject.createImmutable("				<img src=\""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_logo))),RemoteObject.createImmutable("\" alt=\""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_logoalt))),RemoteObject.createImmutable("\">"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_logotitle))),RemoteObject.createImmutable("</td></tr><tr>\n"),RemoteObject.createImmutable("				<td bgcolor=\"#fff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"),RemoteObject.createImmutable("				<p><b>ID de ação:</b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actions_tagcode))),RemoteObject.createImmutable("</p><p><b>Nº Inspecção:</b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_tagcode))),RemoteObject.createImmutable(" &nbsp&nbsp \n"),RemoteObject.createImmutable("				</p> <p> <b>Contrato:</b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reference))),RemoteObject.createImmutable(" </p> </td></tr>technical_tagcode<tr>\n"),RemoteObject.createImmutable("				<td bgcolor=\"#ffffff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"),RemoteObject.createImmutable("				<table border=\"1\" cellpadding=\"10\" > <tr><td style=\"width: 25%\">Modificado por</td>\n"),RemoteObject.createImmutable("				<td style=\"width: 75%\">"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_technical_name))),RemoteObject.createImmutable("</td> </tr><tr><td>Data de Modificação</td><td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updated_at))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("				</tr><tr><td>Descrição da Intervenção</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_details))),RemoteObject.createImmutable("</td> </tr><tr><td>Estado da Ação</td><td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status_name))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("				</tr> <tr> <td>Data Vencimento</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_due_date))),RemoteObject.createImmutable("</td> </tr> <tr> <td>Prioridade</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_priority_name))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("				</tr>  <tr> <td>Gravidade</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_gravity_name))),RemoteObject.createImmutable("</td>  \n"),RemoteObject.createImmutable("				</tr>gravity_name<tr> <td>Tipo Ação</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_operation_name))),RemoteObject.createImmutable("</td> </tr> </table> </td> </tr> <tr>\n"),RemoteObject.createImmutable("				<td bgcolor=\"#ffffff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"),RemoteObject.createImmutable("				"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_suporte))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				</td> </tr> <tr> <td bgcolor=\"f00000\">&nbsp;</td> </tr> </table> </body> </html>")));Debug.locals.put("newHTML", _newhtml);Debug.locals.put("newHTML", _newhtml);
 if (true) break;

case 97:
//C
this.state = 98;
;
 BA.debugLineNum = 2990;BA.debugLine="Log(newHTML)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","669796074",_newhtml,0);
 BA.debugLineNum = 2991;BA.debugLine="Dim imgList As List";
Debug.ShouldStop(16384);
_imglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("imgList", _imglist);
 BA.debugLineNum = 2992;BA.debugLine="imgList.initialize";
Debug.ShouldStop(32768);
_imglist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2994;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 98:
//try
this.state = 103;
this.catchState = 102;
this.state = 100;
if (true) break;

case 100:
//C
this.state = 103;
this.catchState = 102;
 BA.debugLineNum = 2995;BA.debugLine="Utils.SendEmailExt(dlgASEmails.Text, \"\", dlgAS";
Debug.ShouldStop(262144);
parent._utils.runVoidMethod ("_sendemailext" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_newhtml),(Object)(_imglist));
 Debug.CheckDeviceExceptions();
if (true) break;

case 102:
//C
this.state = 103;
this.catchState = 0;
 BA.debugLineNum = 2997;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","669796081",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 103:
//C
this.state = 104;
this.catchState = 0;
;
 BA.debugLineNum = 2999;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreeditactionsdialog"),BA.numberCast(int.class, 250));
this.state = 132;
return;
case 132:
//C
this.state = 104;
;
 if (true) break;

case 104:
//C
this.state = 105;
;
 BA.debugLineNum = 3003;BA.debugLine="Dim params As Map";
Debug.ShouldStop(67108864);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3004;BA.debugLine="params.Initialize";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3005;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3006;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 3007;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 3008;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 3009;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 3010;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 3011;BA.debugLine="params.Put(\"ASUITagcode\", theTagcode)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASUITagcode"))),(Object)((_thetagcode)));
 BA.debugLineNum = 3012;BA.debugLine="params.Put(\"ACLAExecuteAction\", asTagcode)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAExecuteAction"))),(Object)((_astagcode)));
 BA.debugLineNum = 3013;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3014;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3015;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3016;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3017;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3018;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3019;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3020;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3021;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3022;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3023;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(16384);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/as/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3024;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(32768);
if (true) break;

case 105:
//if
this.state = 110;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 107;
}else {
this.state = 109;
}if (true) break;

case 107:
//C
this.state = 110;
 BA.debugLineNum = 3025;BA.debugLine="Utils.CallApi(0, params, activ, Url, \"\", this.R";
Debug.ShouldStop(65536);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(_activ),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 109:
//C
this.state = 110;
 BA.debugLineNum = 3027;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(262144);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3028;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(524288);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 110:
//C
this.state = 111;
;
 BA.debugLineNum = 3030;BA.debugLine="Sleep(550)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreeditactionsdialog"),BA.numberCast(int.class, 550));
this.state = 133;
return;
case 133:
//C
this.state = 111;
;
 BA.debugLineNum = 3032;BA.debugLine="Dim actiondatetime As String = Utils.GetCurrDate";
Debug.ShouldStop(8388608);
_actiondatetime = parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("actiondatetime", _actiondatetime);Debug.locals.put("actiondatetime", _actiondatetime);
 BA.debugLineNum = 3033;BA.debugLine="Dim emailsentdate As String = actiondatetime";
Debug.ShouldStop(16777216);
_emailsentdate = _actiondatetime;Debug.locals.put("emailsentdate", _emailsentdate);Debug.locals.put("emailsentdate", _emailsentdate);
 BA.debugLineNum = 3034;BA.debugLine="Dim params As Map";
Debug.ShouldStop(33554432);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3035;BA.debugLine="params.Initialize";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3036;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3043;BA.debugLine="params.Put(\"ASTagcode\", asTagcode)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASTagcode"))),(Object)((_astagcode)));
 BA.debugLineNum = 3044;BA.debugLine="params.Put(\"ASTitle\", dlgASSubject.Text)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASTitle"))),(Object)((__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 3045;BA.debugLine="params.Put(\"ASDetails\", dlgASDetails.Text)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASDetails"))),(Object)((__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 3046;BA.debugLine="params.Put(\"ASPriority\", Utils.getASPriority(dlg";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASPriority"))),(Object)((parent._utils.runMethod(true,"_getaspriority" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1))))));
 BA.debugLineNum = 3047;BA.debugLine="params.Put(\"ASUrgency\", Utils.getASUrgency(dlgAS";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASUrgency"))),(Object)((parent._utils.runMethod(true,"_getasurgency" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1))))));
 BA.debugLineNum = 3048;BA.debugLine="params.Put(\"ASAssigned\", ShareCode.SESS_OPER_Use";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASAssigned"))),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 3049;BA.debugLine="params.Put(\"ASAssignedType\", 0)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASAssignedType"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3050;BA.debugLine="params.Put(\"ASStatus\", Utils.getASStatus(dlgASSt";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASStatus"))),(Object)((parent._utils.runMethod(true,"_getasstatus" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1))))));
 BA.debugLineNum = 3051;BA.debugLine="params.Put(\"ASEmailDatetime\", emailsentdate)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailDatetime"))),(Object)((_emailsentdate)));
 BA.debugLineNum = 3052;BA.debugLine="params.Put(\"ASEmailSent\", sendTheEmail) ', Utils";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailSent"))),(Object)((_sendtheemail)));
 BA.debugLineNum = 3053;BA.debugLine="params.Put(\"ASEmailTo\", dlgASEmails.Text)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailTo"))),(Object)((__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 3054;BA.debugLine="params.Put(\"ASEmailRelatedTask\", \"\")";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailRelatedTask"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3055;BA.debugLine="params.Put(\"ASEmailRelatedAction\", \"\")";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailRelatedAction"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3056;BA.debugLine="params.Put(\"ASDueDate\", dlgASDueDate.Text)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASDueDate"))),(Object)((__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 3057;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3058;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3059;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3060;BA.debugLine="params.Put(\"ACLACreation\", dtupd)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLACreation"))),(Object)((_dtupd)));
 BA.debugLineNum = 3061;BA.debugLine="params.Put(\"ACLATagcodeTPA\", tagcodeTPA)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcodeTPA"))),(Object)((_tagcodetpa)));
 BA.debugLineNum = 3062;BA.debugLine="params.Put(\"ACLAGroupTPA\", groupTPA)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAGroupTPA"))),(Object)((_grouptpa)));
 BA.debugLineNum = 3063;BA.debugLine="params.Put(\"ACLANew\", Utils.Bool2Int(IsNew))";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLANew"))),(Object)((parent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_isnew)))));
 BA.debugLineNum = 3064;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3065;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3066;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3067;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3068;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3069;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3070;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3071;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(1073741824);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/as/edit")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3072;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(-2147483648);
if (true) break;

case 111:
//if
this.state = 116;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 113;
}else {
this.state = 115;
}if (true) break;

case 113:
//C
this.state = 116;
 BA.debugLineNum = 3073;BA.debugLine="Utils.CallApi(0, params, activ, Url, \"\", this.R";
Debug.ShouldStop(1);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(_activ),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 115:
//C
this.state = 116;
 BA.debugLineNum = 3075;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(4);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3076;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(8);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 116:
//C
this.state = 117;
;
 BA.debugLineNum = 3078;BA.debugLine="Sleep(550)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoreeditactionsdialog"),BA.numberCast(int.class, 550));
this.state = 134;
return;
case 134:
//C
this.state = 117;
;
 BA.debugLineNum = 3081;BA.debugLine="CallSubDelayed3(activ, \"Return2CLAI\", this, 1)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("Return2CLAI")),(Object)((_this)),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 3082;BA.debugLine="If Not(parentDialog = Null) Then";
Debug.ShouldStop(512);
if (true) break;

case 117:
//if
this.state = 120;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("n",_parentdialog)))).<Boolean>get().booleanValue()) { 
this.state = 119;
}if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 3083;BA.debugLine="parentDialog.CloseDialog(DialogResponse.POSITIV";
Debug.ShouldStop(1024);
_parentdialog.runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 if (true) break;

case 120:
//C
this.state = 121;
;
 if (true) break;

case 121:
//C
this.state = -1;
;
 BA.debugLineNum = 3086;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static void  _getmorenewactionsdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _astagcode,RemoteObject _obs,RemoteObject _isnew,RemoteObject _thetagcode,RemoteObject _parentdialog,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _actionforce) throws Exception{
try {
		Debug.PushSubsStack("GetMoreNewActionsDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2406);
if (RapidSub.canDelegate("getmorenewactionsdialog")) { __ref.runUserSub(false, "appactiondialogs","getmorenewactionsdialog", __ref, _activ, _this, _astagcode, _obs, _isnew, _thetagcode, _parentdialog, _tagcodetpa, _grouptpa, _actionforce); return;}
ResumableSub_GetMoreNewActionsDialog rsub = new ResumableSub_GetMoreNewActionsDialog(null,__ref,_activ,_this,_astagcode,_obs,_isnew,_thetagcode,_parentdialog,_tagcodetpa,_grouptpa,_actionforce);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetMoreNewActionsDialog extends BA.ResumableSub {
public ResumableSub_GetMoreNewActionsDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _this,RemoteObject _astagcode,RemoteObject _obs,RemoteObject _isnew,RemoteObject _thetagcode,RemoteObject _parentdialog,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _actionforce) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._this = _this;
this._astagcode = _astagcode;
this._obs = _obs;
this._isnew = _isnew;
this._thetagcode = _thetagcode;
this._parentdialog = _parentdialog;
this._tagcodetpa = _tagcodetpa;
this._grouptpa = _grouptpa;
this._actionforce = _actionforce;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _activ;
RemoteObject _this;
RemoteObject _astagcode;
RemoteObject _obs;
RemoteObject _isnew;
RemoteObject _thetagcode;
RemoteObject _parentdialog;
RemoteObject _tagcodetpa;
RemoteObject _grouptpa;
RemoteObject _actionforce;
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _gravityvalue = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _itc = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._db_itc");
RemoteObject _npos = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _sendtheemail = RemoteObject.createImmutable(0);
RemoteObject _dtupd = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _newhtml = RemoteObject.createImmutable("");
RemoteObject _recordcount = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _actions_tagcode = RemoteObject.createImmutable("");
RemoteObject _request_tagcode = RemoteObject.createImmutable("");
RemoteObject _reference = RemoteObject.createImmutable("");
RemoteObject _technical_name = RemoteObject.createImmutable("");
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _details = RemoteObject.createImmutable("");
RemoteObject _status_name = RemoteObject.createImmutable("");
RemoteObject _due_date = RemoteObject.createImmutable("");
RemoteObject _priority_name = RemoteObject.createImmutable("");
RemoteObject _gravity_name = RemoteObject.createImmutable("");
RemoteObject _operation_name = RemoteObject.createImmutable("");
RemoteObject _ddate = RemoteObject.createImmutable(0L);
RemoteObject _logo = RemoteObject.createImmutable("");
RemoteObject _logoalt = RemoteObject.createImmutable("");
RemoteObject _logotitle = RemoteObject.createImmutable("");
RemoteObject _suporte = RemoteObject.createImmutable("");
RemoteObject _imglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _actiondatetime = RemoteObject.createImmutable("");
RemoteObject _emailsentdate = RemoteObject.createImmutable("");
int step15;
int limit15;
int step22;
int limit22;
int step40;
int limit40;
int step47;
int limit47;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetMoreNewActionsDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2406);
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
Debug.locals.put("asTagcode", _astagcode);
Debug.locals.put("obs", _obs);
Debug.locals.put("IsNew", _isnew);
Debug.locals.put("theTagcode", _thetagcode);
Debug.locals.put("parentDialog", _parentdialog);
Debug.locals.put("tagcodeTPA", _tagcodetpa);
Debug.locals.put("groupTPA", _grouptpa);
Debug.locals.put("actionforce", _actionforce);
 BA.debugLineNum = 2409;BA.debugLine="Dim Title As String = ShareCode.ActionSubEditTitl";
Debug.ShouldStop(256);
_title = parent._sharecode._actionsubedittitle /*RemoteObject*/ ;Debug.locals.put("Title", _title);Debug.locals.put("Title", _title);
 BA.debugLineNum = 2410;BA.debugLine="If Utils.isNullOrEmpty(asTagcode) Then Title = Sh";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_astagcode)).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_title = parent._sharecode._actionsubnewtitle /*RemoteObject*/ ;Debug.locals.put("Title", _title);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2411;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Title, Sh";
Debug.ShouldStop(1024);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(_title),(Object)(parent._sharecode._option_confirm /*RemoteObject*/ ),(Object)(parent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(parent._sharecode._option_sendemail /*RemoteObject*/ ),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2413;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(4096);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2414;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2415;BA.debugLine="ApplDialog.SetSize(100%x,100%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2417;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2421;BA.debugLine="EmailSentOnNewAS = True";
Debug.ShouldStop(1048576);
__ref.setField ("_emailsentonnewas" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 2422;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmorenewactionsdialog"), _sf);
this.state = 130;
return;
case 130:
//C
this.state = 13;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2423;BA.debugLine="pnl.LoadLayout(\"dialog_more_action2\")";
Debug.ShouldStop(4194304);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_more_action2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2427;BA.debugLine="Dim GravityValue As Int = DBStructures.GetScriptC";
Debug.ShouldStop(67108864);
_gravityvalue = parent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT a.points FROM dta_tasks_items_answers AS a\n"),RemoteObject.createImmutable("										 INNER JOIN dta_requests_values AS c ON (c.task_tagcode=a.task_tagcode\n"),RemoteObject.createImmutable("										 	AND c.item_tagcode=a.item_tagcode\n"),RemoteObject.createImmutable("										 	AND c.unique_key=a.unique_key\n"),RemoteObject.createImmutable("										 	AND c.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("											WHERE c.task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("											And c.request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And c.inner_request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("points")));Debug.locals.put("GravityValue", _gravityvalue);Debug.locals.put("GravityValue", _gravityvalue);
 BA.debugLineNum = 2440;BA.debugLine="dlgASAssign.Add(\"Cliente\")";
Debug.ShouldStop(128);
__ref.getField(false,"_dlgasassign" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Cliente")));
 BA.debugLineNum = 2445;BA.debugLine="For n=0 To AS_Status.Size-1";
Debug.ShouldStop(4096);
if (true) break;

case 13:
//for
this.state = 16;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_as_status" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 131;
if (true) break;

case 131:
//C
this.state = 16;
if ((step15 > 0 && _n <= limit15) || (step15 < 0 && _n >= limit15)) this.state = 15;
if (true) break;

case 132:
//C
this.state = 131;
_n = ((int)(0 + _n + step15)) ;
Debug.locals.put("n", _n);
if (true) break;

case 15:
//C
this.state = 132;
 BA.debugLineNum = 2446;BA.debugLine="Dim itc As DB_ITC = AS_Status.Get(n)";
Debug.ShouldStop(8192);
_itc = (__ref.getField(false,"_as_status" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 2447;BA.debugLine="dlgASStatus.Add(itc.Title)";
Debug.ShouldStop(16384);
__ref.getField(false,"_dlgasstatus" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2450;BA.debugLine="dlgASType.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(131072);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2451;BA.debugLine="dlgASType.DropdownBackgroundColor = Consts.ColorW";
Debug.ShouldStop(262144);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2452;BA.debugLine="dlgASType.Add(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2457;BA.debugLine="For n=0 To AS_Types.Size-1";
Debug.ShouldStop(16777216);
if (true) break;

case 17:
//for
this.state = 20;
step22 = 1;
limit22 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_as_types" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 133;
if (true) break;

case 133:
//C
this.state = 20;
if ((step22 > 0 && _n <= limit22) || (step22 < 0 && _n >= limit22)) this.state = 19;
if (true) break;

case 134:
//C
this.state = 133;
_n = ((int)(0 + _n + step22)) ;
Debug.locals.put("n", _n);
if (true) break;

case 19:
//C
this.state = 134;
 BA.debugLineNum = 2458;BA.debugLine="Dim itc As DB_ITC = AS_Types.Get(n)";
Debug.ShouldStop(33554432);
_itc = (__ref.getField(false,"_as_types" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 2459;BA.debugLine="dlgASType.Add(itc.Title)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2462;BA.debugLine="If (AS_Types.Size > 0) Then";
Debug.ShouldStop(536870912);

case 20:
//if
this.state = 35;
if ((RemoteObject.solveBoolean(">",__ref.getField(false,"_as_types" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2463;BA.debugLine="If (Utils.NNE(tagcodeTPA)) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 23:
//if
this.state = 34;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tagcodetpa))).<Boolean>get().booleanValue()) { 
this.state = 25;
}else {
this.state = 33;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2464;BA.debugLine="Dim nPos As Int = DBStructures.getITCTablePos(D";
Debug.ShouldStop(-2147483648);
_npos = parent._dbstructures.runMethod(true,"_getitctablepos" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._dbstructures._sql_data_type_astypes /*RemoteObject*/ ),(Object)(_tagcodetpa));Debug.locals.put("nPos", _npos);Debug.locals.put("nPos", _npos);
 BA.debugLineNum = 2465;BA.debugLine="If (nPos > 0) Then";
Debug.ShouldStop(1);
if (true) break;

case 26:
//if
this.state = 31;
if ((RemoteObject.solveBoolean(">",_npos,BA.numberCast(double.class, 0)))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 2466;BA.debugLine="dlgASType.SelectedIndex = nPos";
Debug.ShouldStop(2);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_npos);
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2468;BA.debugLine="dlgASType.SelectedIndex = 1";
Debug.ShouldStop(8);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 1));
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2471;BA.debugLine="dlgASType.SelectedIndex = 1";
Debug.ShouldStop(64);
__ref.getField(false,"_dlgastype" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 1));
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 2475;BA.debugLine="dlgASPriority.Color = Consts.ColorWhiteSilverLigh";
Debug.ShouldStop(1024);
__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2476;BA.debugLine="dlgASPriority.DropdownBackgroundColor = Consts.Co";
Debug.ShouldStop(2048);
__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2477;BA.debugLine="For n=0 To AS_Priority.Size-1";
Debug.ShouldStop(4096);
if (true) break;

case 36:
//for
this.state = 39;
step40 = 1;
limit40 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_as_priority" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 135;
if (true) break;

case 135:
//C
this.state = 39;
if ((step40 > 0 && _n <= limit40) || (step40 < 0 && _n >= limit40)) this.state = 38;
if (true) break;

case 136:
//C
this.state = 135;
_n = ((int)(0 + _n + step40)) ;
Debug.locals.put("n", _n);
if (true) break;

case 38:
//C
this.state = 136;
 BA.debugLineNum = 2478;BA.debugLine="Dim itc As DB_ITC = AS_Priority.Get(n)";
Debug.ShouldStop(8192);
_itc = (__ref.getField(false,"_as_priority" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 2479;BA.debugLine="dlgASPriority.Add(itc.Title)";
Debug.ShouldStop(16384);
__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2482;BA.debugLine="dlgASUrgency.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(131072);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2483;BA.debugLine="If (IsNew) Then";
Debug.ShouldStop(262144);
if (true) break;

case 40:
//if
this.state = 49;
if ((_isnew).<Boolean>get().booleanValue()) { 
this.state = 42;
}else {
this.state = 48;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2484;BA.debugLine="dlgASUrgency.DropdownBackgroundColor = Consts.Co";
Debug.ShouldStop(524288);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2485;BA.debugLine="For n=0 To AS_Urgency.Size-1";
Debug.ShouldStop(1048576);
if (true) break;

case 43:
//for
this.state = 46;
step47 = 1;
limit47 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_as_urgency" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 137;
if (true) break;

case 137:
//C
this.state = 46;
if ((step47 > 0 && _n <= limit47) || (step47 < 0 && _n >= limit47)) this.state = 45;
if (true) break;

case 138:
//C
this.state = 137;
_n = ((int)(0 + _n + step47)) ;
Debug.locals.put("n", _n);
if (true) break;

case 45:
//C
this.state = 138;
 BA.debugLineNum = 2486;BA.debugLine="Dim itc As DB_ITC = AS_Urgency.Get(n)";
Debug.ShouldStop(2097152);
_itc = (__ref.getField(false,"_as_urgency" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 2487;BA.debugLine="dlgASUrgency.Add(itc.Title)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itc.getField(true,"Title" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 46:
//C
this.state = 49;
Debug.locals.put("n", _n);
;
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 2490;BA.debugLine="dlgASUrgency.Enabled = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 2493;BA.debugLine="dlgASUrgency.SelectedIndex = GravityValue";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_gravityvalue);
 BA.debugLineNum = 2495;BA.debugLine="dlgASSubject.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2496;BA.debugLine="dlgASSubject.Text = this.Title";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_this.getField(true,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 2497;BA.debugLine="dlgASEmails.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(1);
__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2498;BA.debugLine="dlgASEmails.Text = $\"\"$";
Debug.ShouldStop(2);
__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2499;BA.debugLine="dlgASCCEmails.Color = Consts.ColorWhiteSilverLigh";
Debug.ShouldStop(4);
__ref.getField(false,"_dlgasccemails" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2500;BA.debugLine="dlgASCCEmails.Text = $\"alertas@${ShareCode.APPL_H";
Debug.ShouldStop(8);
__ref.getField(false,"_dlgasccemails" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable("alertas@"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 2501;BA.debugLine="dlgASDueDate.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(16);
__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2504;BA.debugLine="dlgASDetails.Color = Consts.ColorWhiteSilverLight";
Debug.ShouldStop(128);
__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runVoidMethod ("setColor",parent._consts._colorwhitesilverlight /*RemoteObject*/ );
 BA.debugLineNum = 2505;BA.debugLine="dlgASDetails.Text = $\"\"$";
Debug.ShouldStop(256);
__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2506;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"edp\") Th";
Debug.ShouldStop(512);
if (true) break;

case 50:
//if
this.state = 53;
if ((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("edp")))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 2507;BA.debugLine="dlgASDetails.Text = obs";
Debug.ShouldStop(1024);
__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_obs));
 if (true) break;

case 53:
//C
this.state = 54;
;
 BA.debugLineNum = 2513;BA.debugLine="ApplDialog.GetButton(DialogResponse.NEGATIVE).Ena";
Debug.ShouldStop(65536);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"GetButton",(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))).runMethod(true,"setEnabled",parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_actionforce)))));
 BA.debugLineNum = 2515;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmorenewactionsdialog"), _sf);
this.state = 139;
return;
case 139:
//C
this.state = 54;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2517;BA.debugLine="If (res = DialogResponse.POSITIVE) Or (res = Dial";
Debug.ShouldStop(1048576);
if (true) break;

case 54:
//if
this.state = 129;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))))) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 2518;BA.debugLine="Dim sendTheEmail As Int = Utils.Bool2Int(res = D";
Debug.ShouldStop(2097152);
_sendtheemail = parent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))));Debug.locals.put("sendTheEmail", _sendtheemail);Debug.locals.put("sendTheEmail", _sendtheemail);
 BA.debugLineNum = 2520;BA.debugLine="If (asTagcode = \"\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 57:
//if
this.state = 60;
if ((RemoteObject.solveBoolean("=",_astagcode,RemoteObject.createImmutable("")))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 2521;BA.debugLine="asTagcode = Utils.GenerateTagcode(\"AS0\")";
Debug.ShouldStop(16777216);
_astagcode = parent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AS0")));Debug.locals.put("asTagcode", _astagcode);
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 2524;BA.debugLine="Dim dtupd As String = Utils.GetCurrDatetimeExt";
Debug.ShouldStop(134217728);
_dtupd = parent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("dtupd", _dtupd);Debug.locals.put("dtupd", _dtupd);
 BA.debugLineNum = 2527;BA.debugLine="If (IsNew) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 61:
//if
this.state = 66;
if ((_isnew).<Boolean>get().booleanValue()) { 
this.state = 63;
}else {
this.state = 65;
}if (true) break;

case 63:
//C
this.state = 66;
 BA.debugLineNum = 2528;BA.debugLine="asTagcode = DBStructures.InsertRequestASEVC(asT";
Debug.ShouldStop(-2147483648);
_astagcode = parent._dbstructures.runMethod(true,"_insertrequestasevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_astagcode),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )),(Object)(_this.getField(true,"Action" /*RemoteObject*/ )),(Object)(_this.getField(true,"Task" /*RemoteObject*/ )),(Object)(_this.getField(true,"Item" /*RemoteObject*/ )),(Object)(_this.getField(true,"UniqueKey" /*RemoteObject*/ )),(Object)(_thetagcode),(Object)(__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(parent._utils.runMethod(true,"_getaspriority" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._utils.runMethod(true,"_getasurgency" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(parent._utils.runMethod(true,"_getasstatus" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"))),(Object)(BA.NumberToString(parent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_emailsentonnewas" /*RemoteObject*/ ))))),(Object)(__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_this.getField(true,"RepeatCounter" /*RemoteObject*/ )),(Object)(_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )),(Object)(_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )),(Object)(_dtupd),(Object)(_tagcodetpa),(Object)(_grouptpa),(Object)(_obs),(Object)(_sendtheemail));Debug.locals.put("asTagcode", _astagcode);
 if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 2535;BA.debugLine="asTagcode = DBStructures.InsertRequestASEVCDeta";
Debug.ShouldStop(64);
_astagcode = parent._dbstructures.runMethod(true,"_insertrequestasevcdetails" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_astagcode),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )),(Object)(_this.getField(true,"Action" /*RemoteObject*/ )),(Object)(_this.getField(true,"Task" /*RemoteObject*/ )),(Object)(_this.getField(true,"Item" /*RemoteObject*/ )),(Object)(_this.getField(true,"UniqueKey" /*RemoteObject*/ )),(Object)(_thetagcode),(Object)(__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(parent._utils.runMethod(true,"_getaspriority" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._utils.runMethod(true,"_getasurgency" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(parent._utils.runMethod(true,"_getasstatus" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"))),(Object)(BA.NumberToString(parent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_emailsentonnewas" /*RemoteObject*/ ))))),(Object)(__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_this.getField(true,"RepeatCounter" /*RemoteObject*/ )),(Object)(_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )),(Object)(_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )),(Object)(_dtupd),(Object)(_sendtheemail));Debug.locals.put("asTagcode", _astagcode);
 if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 2543;BA.debugLine="Dim sSQL As String = $\"SELECT DISTINCT a.actions";
Debug.ShouldStop(16384);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT a.actions_tagcode,a.operation_type,a.typerequest_type,a.details,a.priority_tagcode,a.gravity_tagcode,\n"),RemoteObject.createImmutable("						a.team_tagcode, a.technical_tagcode, a.commercial_tagcode, a.close_date, a.due_date, a.send_email, a.email_sent,\n"),RemoteObject.createImmutable("						a.email_to, a.email_cc, a.updated_at, a.active,\n"),RemoteObject.createImmutable("						b.request_tagcode, b.title, b.details,\n"),RemoteObject.createImmutable("						c.status_id, c.entity_tagcode, c.object_tagcode,\n"),RemoteObject.createImmutable("						d.title_import, d.reference, ifnull(e.title,'') as technical_name,\n"),RemoteObject.createImmutable("						IFNULL(t1.tagdesc, '') AS priority_name, \n"),RemoteObject.createImmutable("						IFNULL(t2.tagdesc, '') AS gravity_name, \n"),RemoteObject.createImmutable("						IFNULL(t3.tagdesc, '') AS operation_name,  \n"),RemoteObject.createImmutable("						IFNULL(t4.tagdesc, '') AS status_name\n"),RemoteObject.createImmutable("						FROM dta_actions_items AS a\n"),RemoteObject.createImmutable("						INNER JOIN dta_actions AS b ON (b.tagcode=a.actions_tagcode)\n"),RemoteObject.createImmutable("						INNER JOIN dta_requests AS c ON (c.tagcode=b.request_tagcode)\n"),RemoteObject.createImmutable("						INNER JOIN dta_objects AS d ON (d.tagcode=c.object_tagcode)\n"),RemoteObject.createImmutable("						LEFT JOIN dta_technicals AS e ON (e.tagcode=b.technical_tagcode)\n"),RemoteObject.createImmutable("						LEFT JOIN type_prioritytypes AS t1 ON (t1.tagcode=a.priority_tagcode)\n"),RemoteObject.createImmutable("						LEFT JOIN type_gravitytypes AS t2 ON (t2.tagcode=a.gravity_tagcode)\n"),RemoteObject.createImmutable("						LEFT JOIN type_operationtypes AS t3 ON (t3.tagcode=a.operation_type)\n"),RemoteObject.createImmutable("						LEFT JOIN type_statustypes AS t4 ON (t4.id=c.status_id)\n"),RemoteObject.createImmutable("						WHERE a.actions_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_astagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						ORDER BY a.id DESC\n"),RemoteObject.createImmutable("						LIMIT 1")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2566;BA.debugLine="Dim newHTML As String = \"\"";
Debug.ShouldStop(32);
_newhtml = BA.ObjectToString("");Debug.locals.put("newHTML", _newhtml);Debug.locals.put("newHTML", _newhtml);
 BA.debugLineNum = 2567;BA.debugLine="Dim RecordCount As Int = 0";
Debug.ShouldStop(64);
_recordcount = BA.numberCast(int.class, 0);Debug.locals.put("RecordCount", _recordcount);Debug.locals.put("RecordCount", _recordcount);
 BA.debugLineNum = 2568;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.E";
Debug.ShouldStop(128);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2569;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(256);
if (true) break;

case 67:
//if
this.state = 70;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 2570;BA.debugLine="RecordCount = RecordCount + 1";
Debug.ShouldStop(512);
_recordcount = RemoteObject.solve(new RemoteObject[] {_recordcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("RecordCount", _recordcount);
 BA.debugLineNum = 2571;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(1024);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2573;BA.debugLine="Dim actions_tagcode As String = Utils.ifnullore";
Debug.ShouldStop(4096);
_actions_tagcode = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("actions_tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("actions_tagcode", _actions_tagcode);Debug.locals.put("actions_tagcode", _actions_tagcode);
 BA.debugLineNum = 2574;BA.debugLine="Dim request_tagcode As String = Utils.ifnullore";
Debug.ShouldStop(8192);
_request_tagcode = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_tagcode")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("request_tagcode", _request_tagcode);Debug.locals.put("request_tagcode", _request_tagcode);
 BA.debugLineNum = 2575;BA.debugLine="Dim reference As String = Utils.ifnullorempty(R";
Debug.ShouldStop(16384);
_reference = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reference")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("reference", _reference);Debug.locals.put("reference", _reference);
 BA.debugLineNum = 2576;BA.debugLine="Dim technical_name As String = Utils.ifnullorem";
Debug.ShouldStop(32768);
_technical_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("technical_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("technical_name", _technical_name);Debug.locals.put("technical_name", _technical_name);
 BA.debugLineNum = 2577;BA.debugLine="Dim updated_at As String = Utils.ifnullorempty(";
Debug.ShouldStop(65536);
_updated_at = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("updated_at")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 2578;BA.debugLine="Dim details As String = Utils.ifnullorempty(Rec";
Debug.ShouldStop(131072);
_details = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("details", _details);Debug.locals.put("details", _details);
 BA.debugLineNum = 2579;BA.debugLine="Dim status_name As String = Utils.ifnullorempty";
Debug.ShouldStop(262144);
_status_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("status_name", _status_name);Debug.locals.put("status_name", _status_name);
 BA.debugLineNum = 2580;BA.debugLine="Dim due_date As String = Utils.ifnullorempty(Re";
Debug.ShouldStop(524288);
_due_date = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("due_date")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("due_date", _due_date);Debug.locals.put("due_date", _due_date);
 BA.debugLineNum = 2581;BA.debugLine="Dim priority_name As String = Utils.ifnulloremp";
Debug.ShouldStop(1048576);
_priority_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("priority_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("priority_name", _priority_name);Debug.locals.put("priority_name", _priority_name);
 BA.debugLineNum = 2582;BA.debugLine="Dim gravity_name As String = Utils.ifnullorempt";
Debug.ShouldStop(2097152);
_gravity_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("gravity_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("gravity_name", _gravity_name);Debug.locals.put("gravity_name", _gravity_name);
 BA.debugLineNum = 2583;BA.debugLine="Dim operation_name As String = Utils.ifnullorem";
Debug.ShouldStop(4194304);
_operation_name = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("operation_name")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("operation_name", _operation_name);Debug.locals.put("operation_name", _operation_name);
 if (true) break;

case 70:
//C
this.state = 71;
;
 BA.debugLineNum = 2586;BA.debugLine="Record.Close";
Debug.ShouldStop(33554432);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2588;BA.debugLine="If Utils.NNE(due_date) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 71:
//if
this.state = 80;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_due_date)).<Boolean>get().booleanValue()) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 2589;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 74:
//try
this.state = 79;
this.catchState = 78;
this.state = 76;
if (true) break;

case 76:
//C
this.state = 79;
this.catchState = 78;
 BA.debugLineNum = 2590;BA.debugLine="Dim ddate As Long = DateTime.DateParse(due_dat";
Debug.ShouldStop(536870912);
_ddate = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_due_date));Debug.locals.put("ddate", _ddate);Debug.locals.put("ddate", _ddate);
 BA.debugLineNum = 2591;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(1073741824);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2592;BA.debugLine="due_date = DateTime.Date(ddate)";
Debug.ShouldStop(-2147483648);
_due_date = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ddate));Debug.locals.put("due_date", _due_date);
 Debug.CheckDeviceExceptions();
if (true) break;

case 78:
//C
this.state = 79;
this.catchState = 0;
 BA.debugLineNum = 2594;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","669730492",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 0;
;
 if (true) break;
;
 BA.debugLineNum = 2598;BA.debugLine="If Utils.NNE(due_date) Then";
Debug.ShouldStop(32);

case 80:
//if
this.state = 89;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_due_date)).<Boolean>get().booleanValue()) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 2599;BA.debugLine="Try";
Debug.ShouldStop(64);
if (true) break;

case 83:
//try
this.state = 88;
this.catchState = 87;
this.state = 85;
if (true) break;

case 85:
//C
this.state = 88;
this.catchState = 87;
 BA.debugLineNum = 2600;BA.debugLine="due_date = due_date.Replace(\"00:00:00\", \"\").Tr";
Debug.ShouldStop(128);
_due_date = _due_date.runMethod(true,"replace",(Object)(BA.ObjectToString("00:00:00")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"trim");Debug.locals.put("due_date", _due_date);
 Debug.CheckDeviceExceptions();
if (true) break;

case 87:
//C
this.state = 88;
this.catchState = 0;
 BA.debugLineNum = 2602;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","669730500",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 88:
//C
this.state = 89;
this.catchState = 0;
;
 if (true) break;

case 89:
//C
this.state = 90;
;
 BA.debugLineNum = 2607;BA.debugLine="Dim LOGO As String = \"\"";
Debug.ShouldStop(16384);
_logo = BA.ObjectToString("");Debug.locals.put("LOGO", _logo);Debug.locals.put("LOGO", _logo);
 BA.debugLineNum = 2608;BA.debugLine="Dim LOGOALT As String = \"\"";
Debug.ShouldStop(32768);
_logoalt = BA.ObjectToString("");Debug.locals.put("LOGOALT", _logoalt);Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2609;BA.debugLine="Dim LOGOTITLE As String = \"\"";
Debug.ShouldStop(65536);
_logotitle = BA.ObjectToString("");Debug.locals.put("LOGOTITLE", _logotitle);Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2610;BA.debugLine="Dim SUPORTE As String = \"\"";
Debug.ShouldStop(131072);
_suporte = BA.ObjectToString("");Debug.locals.put("SUPORTE", _suporte);Debug.locals.put("SUPORTE", _suporte);
 BA.debugLineNum = 2612;BA.debugLine="If (sendTheEmail = 1) Then";
Debug.ShouldStop(524288);
if (true) break;

case 90:
//if
this.state = 112;
if ((RemoteObject.solveBoolean("=",_sendtheemail,BA.numberCast(double.class, 1)))) { 
this.state = 92;
}if (true) break;

case 92:
//C
this.state = 93;
 BA.debugLineNum = 2614;BA.debugLine="LOGO = $\"data:image/jpeg;base64,${ShareCode.APP";
Debug.ShouldStop(2097152);
_logo = (RemoteObject.concat(RemoteObject.createImmutable("data:image/jpeg;base64,"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable("")));Debug.locals.put("LOGO", _logo);
 BA.debugLineNum = 2615;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"edp\")";
Debug.ShouldStop(4194304);
if (true) break;

case 93:
//if
this.state = 102;
if ((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("edp")))) { 
this.state = 95;
}else 
{ BA.debugLineNum = 2619;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase = \"u";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("uber")))) { 
this.state = 97;
}else 
{ BA.debugLineNum = 2623;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase.cont";
Debug.ShouldStop(1073741824);
if ((parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("grandative")))).<Boolean>get().booleanValue()) { 
this.state = 99;
}else {
this.state = 101;
}}}
if (true) break;

case 95:
//C
this.state = 102;
 BA.debugLineNum = 2616;BA.debugLine="LOGOALT = \"EDP\"";
Debug.ShouldStop(8388608);
_logoalt = BA.ObjectToString("EDP");Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2617;BA.debugLine="LOGOTITLE = \"EDP Comercial \"";
Debug.ShouldStop(16777216);
_logotitle = BA.ObjectToString("EDP Comercial ");Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2618;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>Caso encontre alg";
Debug.ShouldStop(33554432);
_suporte = BA.ObjectToString("<b>Suporte</b><br>Caso encontre alguma dificuldade, por favor entre em contacto com João Salsa (939395171) ou Pedro Fontoura (936113575).");Debug.locals.put("SUPORTE", _suporte);
 if (true) break;

case 97:
//C
this.state = 102;
 BA.debugLineNum = 2620;BA.debugLine="LOGOALT = \"UBER\"";
Debug.ShouldStop(134217728);
_logoalt = BA.ObjectToString("UBER");Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2621;BA.debugLine="LOGOTITLE = \"UBER Desinfestações \"";
Debug.ShouldStop(268435456);
_logotitle = BA.ObjectToString("UBER Desinfestações ");Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2622;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
Debug.ShouldStop(536870912);
_suporte = BA.ObjectToString("<b>Suporte</b><br>");Debug.locals.put("SUPORTE", _suporte);
 if (true) break;

case 99:
//C
this.state = 102;
 BA.debugLineNum = 2624;BA.debugLine="LOGOALT = \"GrandAtive\"";
Debug.ShouldStop(-2147483648);
_logoalt = BA.ObjectToString("GrandAtive");Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2625;BA.debugLine="LOGOTITLE = \"GrandAtive \"";
Debug.ShouldStop(1);
_logotitle = BA.ObjectToString("GrandAtive ");Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2626;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
Debug.ShouldStop(2);
_suporte = BA.ObjectToString("<b>Suporte</b><br>");Debug.locals.put("SUPORTE", _suporte);
 if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 2628;BA.debugLine="LOGOALT = $\"${ShareCode.APP_DOMAIN.ToUpperCase";
Debug.ShouldStop(8);
_logoalt = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toUpperCase")))),RemoteObject.createImmutable("")));Debug.locals.put("LOGOALT", _logoalt);
 BA.debugLineNum = 2629;BA.debugLine="LOGOTITLE = $\"${ShareCode.APP_DOMAIN.ToUpperCa";
Debug.ShouldStop(16);
_logotitle = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toUpperCase")))),RemoteObject.createImmutable(" ")));Debug.locals.put("LOGOTITLE", _logotitle);
 BA.debugLineNum = 2630;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
Debug.ShouldStop(32);
_suporte = BA.ObjectToString("<b>Suporte</b><br>");Debug.locals.put("SUPORTE", _suporte);
 if (true) break;
;
 BA.debugLineNum = 2633;BA.debugLine="If RecordCount > 0 Then";
Debug.ShouldStop(256);

case 102:
//if
this.state = 105;
if (RemoteObject.solveBoolean(">",_recordcount,BA.numberCast(double.class, 0))) { 
this.state = 104;
}if (true) break;

case 104:
//C
this.state = 105;
 BA.debugLineNum = 2634;BA.debugLine="Dim newHTML As String = $\"<!DOCTYPE html>";
Debug.ShouldStop(512);
_newhtml = (RemoteObject.concat(RemoteObject.createImmutable("<!DOCTYPE html>\n"),RemoteObject.createImmutable("				<html xmlns=\"http://www.w3.org/1999/xhtml\"> <head>  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"),RemoteObject.createImmutable("				<title>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_logotitle))),RemoteObject.createImmutable("</title>  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/></head><body style=\"margin: 0; padding: 0;\">\n"),RemoteObject.createImmutable("				<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"60%\">    <tr> <td bgcolor=\"f00000\">&nbsp;</td>\n"),RemoteObject.createImmutable("				</tr> <tr><td bgcolor=\"#fff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"),RemoteObject.createImmutable("				<img src=\""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_logo))),RemoteObject.createImmutable("\" alt=\""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_logoalt))),RemoteObject.createImmutable("\">"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_logotitle))),RemoteObject.createImmutable("</td></tr><tr>\n"),RemoteObject.createImmutable("				<td bgcolor=\"#fff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"),RemoteObject.createImmutable("				<p><b>ID de ação:</b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actions_tagcode))),RemoteObject.createImmutable("</p><p><b>Nº Inspecção:</b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_tagcode))),RemoteObject.createImmutable(" &nbsp&nbsp \n"),RemoteObject.createImmutable("				</p> <p> <b>Contrato:</b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reference))),RemoteObject.createImmutable(" </p> </td></tr>technical_tagcode<tr>\n"),RemoteObject.createImmutable("				<td bgcolor=\"#ffffff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"),RemoteObject.createImmutable("				<table border=\"1\" cellpadding=\"10\" > <tr><td style=\"width: 25%\">Modificado por</td>\n"),RemoteObject.createImmutable("				<td style=\"width: 75%\">"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_technical_name))),RemoteObject.createImmutable("</td> </tr><tr><td>Data de Modificação</td><td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updated_at))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("				</tr><tr><td>Descrição da Intervenção</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_details))),RemoteObject.createImmutable("</td> </tr><tr><td>Estado da Ação</td><td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status_name))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("				</tr> <tr> <td>Data Vencimento</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_due_date))),RemoteObject.createImmutable("</td> </tr> <tr> <td>Prioridade</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_priority_name))),RemoteObject.createImmutable("</td>\n"),RemoteObject.createImmutable("				</tr>  <tr> <td>Gravidade</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_gravity_name))),RemoteObject.createImmutable("</td>  \n"),RemoteObject.createImmutable("				</tr>gravity_name<tr> <td>Tipo Ação</td> <td>"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_operation_name))),RemoteObject.createImmutable("</td> </tr> </table> </td> </tr> <tr>\n"),RemoteObject.createImmutable("				<td bgcolor=\"#ffffff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"),RemoteObject.createImmutable("				"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_suporte))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				</td> </tr> <tr> <td bgcolor=\"f00000\">&nbsp;</td> </tr> </table> </body> </html>")));Debug.locals.put("newHTML", _newhtml);Debug.locals.put("newHTML", _newhtml);
 if (true) break;

case 105:
//C
this.state = 106;
;
 BA.debugLineNum = 2655;BA.debugLine="Log(newHTML)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","669730553",_newhtml,0);
 BA.debugLineNum = 2656;BA.debugLine="Dim imgList As List";
Debug.ShouldStop(-2147483648);
_imglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("imgList", _imglist);
 BA.debugLineNum = 2657;BA.debugLine="imgList.initialize";
Debug.ShouldStop(1);
_imglist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2659;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 106:
//try
this.state = 111;
this.catchState = 110;
this.state = 108;
if (true) break;

case 108:
//C
this.state = 111;
this.catchState = 110;
 BA.debugLineNum = 2660;BA.debugLine="Utils.SendEmailExt(dlgASEmails.Text, \"\", dlgAS";
Debug.ShouldStop(8);
parent._utils.runVoidMethod ("_sendemailext" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_newhtml),(Object)(_imglist));
 Debug.CheckDeviceExceptions();
if (true) break;

case 110:
//C
this.state = 111;
this.catchState = 0;
 BA.debugLineNum = 2662;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","669730560",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 111:
//C
this.state = 112;
this.catchState = 0;
;
 BA.debugLineNum = 2664;BA.debugLine="Sleep(250)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmorenewactionsdialog"),BA.numberCast(int.class, 250));
this.state = 140;
return;
case 140:
//C
this.state = 112;
;
 if (true) break;

case 112:
//C
this.state = 113;
;
 BA.debugLineNum = 2668;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2048);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2669;BA.debugLine="params.Initialize";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2670;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2671;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 2672;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 2673;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 2674;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 2675;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 2676;BA.debugLine="params.Put(\"ASUITagcode\", theTagcode)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASUITagcode"))),(Object)((_thetagcode)));
 BA.debugLineNum = 2677;BA.debugLine="params.Put(\"ACLAExecuteAction\", asTagcode)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAExecuteAction"))),(Object)((_astagcode)));
 BA.debugLineNum = 2678;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2679;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2680;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2681;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2682;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2683;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2684;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2685;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2686;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2687;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2688;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(-2147483648);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/as/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2689;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(1);
if (true) break;

case 113:
//if
this.state = 118;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 115;
}else {
this.state = 117;
}if (true) break;

case 115:
//C
this.state = 118;
 BA.debugLineNum = 2690;BA.debugLine="Utils.CallApi(0, params, activ, Url, \"\", this.R";
Debug.ShouldStop(2);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(_activ),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 117:
//C
this.state = 118;
 BA.debugLineNum = 2692;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(8);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2693;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(16);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 118:
//C
this.state = 119;
;
 BA.debugLineNum = 2695;BA.debugLine="Sleep(550)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmorenewactionsdialog"),BA.numberCast(int.class, 550));
this.state = 141;
return;
case 141:
//C
this.state = 119;
;
 BA.debugLineNum = 2697;BA.debugLine="Dim actiondatetime As String = Utils.GetCurrDate";
Debug.ShouldStop(256);
_actiondatetime = parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("actiondatetime", _actiondatetime);Debug.locals.put("actiondatetime", _actiondatetime);
 BA.debugLineNum = 2698;BA.debugLine="Dim emailsentdate As String = actiondatetime";
Debug.ShouldStop(512);
_emailsentdate = _actiondatetime;Debug.locals.put("emailsentdate", _emailsentdate);Debug.locals.put("emailsentdate", _emailsentdate);
 BA.debugLineNum = 2699;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1024);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2700;BA.debugLine="params.Initialize";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2701;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2702;BA.debugLine="params.Put(\"ASRequest\", this.Request)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASRequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 2703;BA.debugLine="params.Put(\"ASAction\", this.Action)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 2704;BA.debugLine="params.Put(\"ASTask\", this.Task)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASTask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 2705;BA.debugLine="params.Put(\"ASItem\", this.Item)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 2706;BA.debugLine="params.Put(\"ASUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 2707;BA.debugLine="params.Put(\"ASUITagcode\", theTagcode)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASUITagcode"))),(Object)((_thetagcode)));
 BA.debugLineNum = 2708;BA.debugLine="params.Put(\"ASTagcode\", asTagcode)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASTagcode"))),(Object)((_astagcode)));
 BA.debugLineNum = 2709;BA.debugLine="params.Put(\"ASTitle\", dlgASSubject.Text)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASTitle"))),(Object)((__ref.getField(false,"_dlgassubject" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 2710;BA.debugLine="params.Put(\"ASDetails\", dlgASDetails.Text)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASDetails"))),(Object)((__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 2711;BA.debugLine="params.Put(\"ASPriority\", Utils.getASPriority(dlg";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASPriority"))),(Object)((parent._utils.runMethod(true,"_getaspriority" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgaspriority" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1))))));
 BA.debugLineNum = 2712;BA.debugLine="params.Put(\"ASUrgency\", Utils.getASUrgency(dlgAS";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASUrgency"))),(Object)((parent._utils.runMethod(true,"_getasurgency" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasurgency" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1))))));
 BA.debugLineNum = 2713;BA.debugLine="params.Put(\"ASAssigned\", ShareCode.SESS_OPER_Use";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASAssigned"))),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 2714;BA.debugLine="params.Put(\"ASAssignedType\", 0)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASAssignedType"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2715;BA.debugLine="params.Put(\"ASStatus\", Utils.getASStatus(dlgASSt";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASStatus"))),(Object)((parent._utils.runMethod(true,"_getasstatus" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dlgasstatus" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "+",1, 1))))));
 BA.debugLineNum = 2716;BA.debugLine="params.Put(\"ASEmailDatetime\", emailsentdate)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailDatetime"))),(Object)((_emailsentdate)));
 BA.debugLineNum = 2717;BA.debugLine="params.Put(\"ASEmailSent\", sendTheEmail) 'Utils.B";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailSent"))),(Object)((_sendtheemail)));
 BA.debugLineNum = 2718;BA.debugLine="params.Put(\"ASEmailTo\", dlgASEmails.Text)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailTo"))),(Object)((__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 2719;BA.debugLine="params.Put(\"ASEmailRelatedTask\", \"\")";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailRelatedTask"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2720;BA.debugLine="params.Put(\"ASEmailRelatedAction\", \"\")";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASEmailRelatedAction"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2721;BA.debugLine="params.Put(\"ASDueDate\", dlgASDueDate.Text)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ASDueDate"))),(Object)((__ref.getField(false,"_dlgasduedate" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 2722;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2723;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2724;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2725;BA.debugLine="params.Put(\"ACLACreation\", dtupd)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLACreation"))),(Object)((_dtupd)));
 BA.debugLineNum = 2726;BA.debugLine="params.Put(\"ACLATagcodeTPA\", tagcodeTPA)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcodeTPA"))),(Object)((_tagcodetpa)));
 BA.debugLineNum = 2727;BA.debugLine="params.Put(\"ACLAGroupTPA\", groupTPA)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAGroupTPA"))),(Object)((_grouptpa)));
 BA.debugLineNum = 2728;BA.debugLine="params.Put(\"ACLANew\", Utils.Bool2Int(IsNew))";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLANew"))),(Object)((parent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_isnew)))));
 BA.debugLineNum = 2729;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2730;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2731;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2732;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2733;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2734;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2735;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2736;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(32768);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/as/insert")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2737;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(65536);
if (true) break;

case 119:
//if
this.state = 124;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 121;
}else {
this.state = 123;
}if (true) break;

case 121:
//C
this.state = 124;
 BA.debugLineNum = 2738;BA.debugLine="Utils.CallApi(0, params, activ, Url, \"\", this.R";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(_activ),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 123:
//C
this.state = 124;
 BA.debugLineNum = 2740;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(524288);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2741;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(1048576);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 124:
//C
this.state = 125;
;
 BA.debugLineNum = 2743;BA.debugLine="Sleep(550)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmorenewactionsdialog"),BA.numberCast(int.class, 550));
this.state = 142;
return;
case 142:
//C
this.state = 125;
;
 BA.debugLineNum = 2746;BA.debugLine="CallSubDelayed3(activ, \"Return2CLAI\", this, 1)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(_activ),(Object)(BA.ObjectToString("Return2CLAI")),(Object)((_this)),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2747;BA.debugLine="If Not(parentDialog = Null) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 125:
//if
this.state = 128;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("n",_parentdialog)))).<Boolean>get().booleanValue()) { 
this.state = 127;
}if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 2748;BA.debugLine="parentDialog.CloseDialog(DialogResponse.POSITIV";
Debug.ShouldStop(134217728);
_parentdialog.runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 if (true) break;

case 128:
//C
this.state = 129;
;
 if (true) break;

case 129:
//C
this.state = -1;
;
 BA.debugLineNum = 2751;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static void  _getmoresendemaildialog(RemoteObject __ref,RemoteObject _this,RemoteObject _astagcode,RemoteObject _origin,RemoteObject _obs,RemoteObject _imglist) throws Exception{
try {
		Debug.PushSubsStack("GetMoreSendEmailDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3130);
if (RapidSub.canDelegate("getmoresendemaildialog")) { __ref.runUserSub(false, "appactiondialogs","getmoresendemaildialog", __ref, _this, _astagcode, _origin, _obs, _imglist); return;}
ResumableSub_GetMoreSendEmailDialog rsub = new ResumableSub_GetMoreSendEmailDialog(null,__ref,_this,_astagcode,_origin,_obs,_imglist);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetMoreSendEmailDialog extends BA.ResumableSub {
public ResumableSub_GetMoreSendEmailDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _this,RemoteObject _astagcode,RemoteObject _origin,RemoteObject _obs,RemoteObject _imglist) {
this.parent = parent;
this.__ref = __ref;
this._this = _this;
this._astagcode = _astagcode;
this._origin = _origin;
this._obs = _obs;
this._imglist = _imglist;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _this;
RemoteObject _astagcode;
RemoteObject _origin;
RemoteObject _obs;
RemoteObject _imglist;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _signaturehtml = RemoteObject.createImmutable("");
RemoteObject _html = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetMoreSendEmailDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3130);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("this", _this);
Debug.locals.put("asTagcode", _astagcode);
Debug.locals.put("origin", _origin);
Debug.locals.put("obs", _obs);
Debug.locals.put("imgList", _imglist);
 BA.debugLineNum = 3131;BA.debugLine="If (imgList.Size = 0) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if ((RemoteObject.solveBoolean("=",_imglist.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3132;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(ShareCod";
Debug.ShouldStop(134217728);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(parent._sharecode._option_makealert /*RemoteObject*/ ),(Object)(parent._sharecode._option_confirm /*RemoteObject*/ ),(Object)(parent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3134;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(ShareCod";
Debug.ShouldStop(536870912);
_sf = __ref.getField(false,"_appldialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(parent._sharecode._option_sendemail /*RemoteObject*/ ),(Object)(parent._sharecode._option_confirm /*RemoteObject*/ ),(Object)(parent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3137;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(1);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3138;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 3139;BA.debugLine="ApplDialog.SetSize(95%x, 80%y)";
Debug.ShouldStop(4);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3141;BA.debugLine="ApplDialog.SetSize(70%x, 430dip)";
Debug.ShouldStop(16);
__ref.getField(false,"_appldialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 430)))));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 3145;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoresendemaildialog"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 13;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3146;BA.debugLine="pnl.LoadLayout(\"dialog_more_action_sendEmail\")";
Debug.ShouldStop(512);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_more_action_sendEmail")),__ref.getField(false, "ba"));
 BA.debugLineNum = 3148;BA.debugLine="dlgASEmailsCC.Text = $\"alertas@${ShareCode.APPL_H";
Debug.ShouldStop(2048);
__ref.getField(false,"_dlgasemailscc" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable("alertas@"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3149;BA.debugLine="dlgASEmailsSubject.Text = $\"Ref: ${this.Request}";
Debug.ShouldStop(4096);
__ref.getField(false,"_dlgasemailssubject" /*RemoteObject*/ ).runMethod(true,"setText",((RemoteObject.concat(RemoteObject.createImmutable("Ref: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable(" - "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Title" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3150;BA.debugLine="dlgASDetails.Text = obs";
Debug.ShouldStop(8192);
__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_obs));
 BA.debugLineNum = 3152;BA.debugLine="dlgASEmails.Text = \"\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 3154;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "getmoresendemaildialog"), _sf);
this.state = 22;
return;
case 22:
//C
this.state = 13;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3155;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3156;BA.debugLine="origin.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(524288);
_origin.runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 BA.debugLineNum = 3158;BA.debugLine="Dim SignatureHtml As String = ShareCode.APP_Comp";
Debug.ShouldStop(2097152);
_signaturehtml = parent._sharecode._app_company_name /*RemoteObject*/ ;Debug.locals.put("SignatureHtml", _signaturehtml);Debug.locals.put("SignatureHtml", _signaturehtml);
 BA.debugLineNum = 3159;BA.debugLine="If (ShareCode.APP_DOMAIN.ToLowerCase = \"brasfone";
Debug.ShouldStop(4194304);
if (true) break;

case 16:
//if
this.state = 19;
if ((RemoteObject.solveBoolean("=",parent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("brasfone")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 3160;BA.debugLine="Dim SignatureHtml As String = \"\"";
Debug.ShouldStop(8388608);
_signaturehtml = BA.ObjectToString("");Debug.locals.put("SignatureHtml", _signaturehtml);Debug.locals.put("SignatureHtml", _signaturehtml);
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 3163;BA.debugLine="Dim HTML As String = $\"<html><body> 		<p><h4><st";
Debug.ShouldStop(67108864);
_html = (RemoteObject.concat(RemoteObject.createImmutable("<html><body>\n"),RemoteObject.createImmutable("		<p><h4><strong>Acção/Informação</strong></h4><br><br>\n"),RemoteObject.createImmutable("		<strong>Detalhe</strong><br>\n"),RemoteObject.createImmutable("		"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_dlgasdetails" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("<br></p>\n"),RemoteObject.createImmutable("		<p>A equipa "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_signaturehtml))),RemoteObject.createImmutable("</>\n"),RemoteObject.createImmutable("		</body></html>")));Debug.locals.put("HTML", _html);Debug.locals.put("HTML", _html);
 BA.debugLineNum = 3169;BA.debugLine="Utils.SendEmailExt(dlgASEmails.Text, dlgASEmails";
Debug.ShouldStop(1);
parent._utils.runVoidMethod ("_sendemailext" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dlgasemails" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dlgasemailscc" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_dlgasemailssubject" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_html),(Object)(_imglist));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 3173;BA.debugLine="End Sub";
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
public static void  _gettasklistdialog(RemoteObject __ref,RemoteObject _activ,RemoteObject _activobj,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("GetTaskListDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2359);
if (RapidSub.canDelegate("gettasklistdialog")) { __ref.runUserSub(false, "appactiondialogs","gettasklistdialog", __ref, _activ, _activobj, _items); return;}
ResumableSub_GetTaskListDialog rsub = new ResumableSub_GetTaskListDialog(null,__ref,_activ,_activobj,_items);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetTaskListDialog extends BA.ResumableSub {
public ResumableSub_GetTaskListDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _activ,RemoteObject _activobj,RemoteObject _items) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activobj = _activobj;
this._items = _items;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _activ;
RemoteObject _activobj;
RemoteObject _items;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _row = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
int step8;
int limit8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetTaskListDialog (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2359);
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
Debug.locals.put("activObj", _activobj);
Debug.locals.put("items", _items);
 BA.debugLineNum = 2360;BA.debugLine="Dim sf As Object = ApplActionDialog.ShowAsync(\"Li";
Debug.ShouldStop(8388608);
_sf = __ref.getField(false,"_applactiondialog" /*RemoteObject*/ ).runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Lista de Tarefas")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.getField(false,"Null"))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2362;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(33554432);
parent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sf),(Object)(parent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 2363;BA.debugLine="ApplActionDialog.SetSize(75%x, 75%y)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_applactiondialog" /*RemoteObject*/ ).runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 2364;BA.debugLine="ThisActivityName_TaskListDialog = activObj";
Debug.ShouldStop(134217728);
__ref.setField ("_thisactivityname_tasklistdialog" /*RemoteObject*/ ,_activobj);
 BA.debugLineNum = 2365;BA.debugLine="CurrentCLD = ApplActionDialog";
Debug.ShouldStop(268435456);
__ref.setField ("_currentcld" /*RemoteObject*/ ,__ref.getField(false,"_applactiondialog" /*RemoteObject*/ ));
 BA.debugLineNum = 2367;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "gettasklistdialog"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 2368;BA.debugLine="pnl.LoadLayout(\"dialog_task_list\")";
Debug.ShouldStop(-2147483648);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialog_task_list")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2370;BA.debugLine="For Row = 0 To items.RowCount-1";
Debug.ShouldStop(2);
if (true) break;

case 1:
//for
this.state = 8;
step8 = 1;
limit8 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if ((step8 > 0 && _row <= limit8) || (step8 < 0 && _row >= limit8)) this.state = 3;
if (true) break;

case 15:
//C
this.state = 14;
_row = ((int)(0 + _row + step8)) ;
Debug.locals.put("Row", _row);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2371;BA.debugLine="items.Position = Row";
Debug.ShouldStop(4);
_items.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 2372;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 2373;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(16);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2374;BA.debugLine="activ.AddView(p, 0, 0, 100%x, 60dip)";
Debug.ShouldStop(32);
_activ.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 2375;BA.debugLine="p.LoadLayout(\"ListItem_ViewSimpleList\")";
Debug.ShouldStop(64);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListItem_ViewSimpleList")),__ref.getField(false, "ba"));
 BA.debugLineNum = 2376;BA.debugLine="p.RemoveView";
Debug.ShouldStop(128);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 2377;BA.debugLine="ViewSimpleListTitle.text = items.GetString(\"name";
Debug.ShouldStop(256);
__ref.getField(false,"_viewsimplelisttitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 2378;BA.debugLine="ViewSimpleListInfo.text = \"\"";
Debug.ShouldStop(512);
__ref.getField(false,"_viewsimplelistinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 2379;BA.debugLine="If (ShareCode.DEVICE_PARAM_AS_OBS2DETAILS = 1) T";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean("=",parent._sharecode._device_param_as_obs2details /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2380;BA.debugLine="ViewSimpleListInfo.text = Utils.IfNullOrEmpty(i";
Debug.ShouldStop(2048);
__ref.getField(false,"_viewsimplelistinfo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")))),(Object)(RemoteObject.createImmutable("")))));
 if (true) break;

case 7:
//C
this.state = 15;
;
 BA.debugLineNum = 2382;BA.debugLine="ViewSimpleListNumber.Text = $\"#${Row+1}\"$";
Debug.ShouldStop(8192);
__ref.getField(false,"_viewsimplelistnumber" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("#"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_row),RemoteObject.createImmutable(1)}, "+",1, 1)))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 2383;BA.debugLine="p.Tag = items.GetString(\"tagcode\")";
Debug.ShouldStop(16384);
_p.runMethod(false,"setTag",(_items.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))));
 BA.debugLineNum = 2384;BA.debugLine="ViewSimpleList.Add(p, \"\") ', 60dip, \"\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_viewsimplelist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 2386;BA.debugLine="items.close";
Debug.ShouldStop(131072);
_items.runVoidMethod ("Close");
 BA.debugLineNum = 2388;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "gettasklistdialog"), _sf);
this.state = 16;
return;
case 16:
//C
this.state = 9;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 2389;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
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
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2392;BA.debugLine="End Sub";
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
public static RemoteObject  _imageselected_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imageSelected_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1701);
if (RapidSub.canDelegate("imageselected_click")) { return __ref.runUserSub(false, "appactiondialogs","imageselected_click", __ref);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _fln = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _ncolor = RemoteObject.createImmutable(0);
RemoteObject _state = RemoteObject.createImmutable(0);
RemoteObject _val = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1701;BA.debugLine="Sub imageSelected_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 1702;BA.debugLine="Dim lbl As Label = Sender";
Debug.ShouldStop(32);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1703;BA.debugLine="Dim pnl As Panel = lbl.Parent";
Debug.ShouldStop(64);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _lbl.runMethod(false,"getParent"));Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1704;BA.debugLine="Dim fln As Label = pnl.GetView(1)";
Debug.ShouldStop(128);
_fln = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fln = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fln", _fln);
 BA.debugLineNum = 1705;BA.debugLine="Dim nColor As Int = Consts.ColorLightSilver";
Debug.ShouldStop(256);
_ncolor = appactiondialogs._consts._colorlightsilver /*RemoteObject*/ ;Debug.locals.put("nColor", _ncolor);Debug.locals.put("nColor", _ncolor);
 BA.debugLineNum = 1706;BA.debugLine="Dim State As Int = 0";
Debug.ShouldStop(512);
_state = BA.numberCast(int.class, 0);Debug.locals.put("State", _state);Debug.locals.put("State", _state);
 BA.debugLineNum = 1707;BA.debugLine="If Not(Utils.isNullOrEmpty(lbl.tag)) Then State =";
Debug.ShouldStop(1024);
if (appactiondialogs.__c.runMethod(true,"Not",(Object)(appactiondialogs._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_lbl.runMethod(false,"getTag")))))).<Boolean>get().booleanValue()) { 
_state = BA.numberCast(int.class, _lbl.runMethod(false,"getTag"));Debug.locals.put("State", _state);};
 BA.debugLineNum = 1708;BA.debugLine="If (State = 0) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",_state,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1709;BA.debugLine="State = 1";
Debug.ShouldStop(4096);
_state = BA.numberCast(int.class, 1);Debug.locals.put("State", _state);
 BA.debugLineNum = 1710;BA.debugLine="nColor = Consts.ColorGreen";
Debug.ShouldStop(8192);
_ncolor = appactiondialogs._consts._colorgreen /*RemoteObject*/ ;Debug.locals.put("nColor", _ncolor);
 BA.debugLineNum = 1711;BA.debugLine="CurrentImageList.Add(fln.Text)";
Debug.ShouldStop(16384);
__ref.getField(false,"_currentimagelist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_fln.runMethod(true,"getText"))));
 }else {
 BA.debugLineNum = 1713;BA.debugLine="State = 0";
Debug.ShouldStop(65536);
_state = BA.numberCast(int.class, 0);Debug.locals.put("State", _state);
 BA.debugLineNum = 1714;BA.debugLine="Dim val As Int = CurrentImageList.IndexOf(fln.Te";
Debug.ShouldStop(131072);
_val = __ref.getField(false,"_currentimagelist" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_fln.runMethod(true,"getText"))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1715;BA.debugLine="If (val >= 0) Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("g",_val,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1716;BA.debugLine="CurrentImageList.RemoveAt(CurrentImageList.Inde";
Debug.ShouldStop(524288);
__ref.getField(false,"_currentimagelist" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(__ref.getField(false,"_currentimagelist" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_fln.runMethod(true,"getText"))))));
 };
 };
 BA.debugLineNum = 1720;BA.debugLine="lbl.Tag = State";
Debug.ShouldStop(8388608);
_lbl.runMethod(false,"setTag",(_state));
 BA.debugLineNum = 1721;BA.debugLine="lbl.TextColor = nColor";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setTextColor",_ncolor);
 BA.debugLineNum = 1722;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageselectedonreport_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imageSelectedOnReport_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1732);
if (RapidSub.canDelegate("imageselectedonreport_click")) { return __ref.runUserSub(false, "appactiondialogs","imageselectedonreport_click", __ref);}
RemoteObject _thisbut = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _thispanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1732;BA.debugLine="Sub imageSelectedOnReport_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1733;BA.debugLine="Dim thisBut As Label = Sender";
Debug.ShouldStop(16);
_thisbut = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_thisbut = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("thisBut", _thisbut);
 BA.debugLineNum = 1734;BA.debugLine="Dim thisPanel As Panel = thisBut.Parent";
Debug.ShouldStop(32);
_thispanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_thispanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _thisbut.runMethod(false,"getParent"));Debug.locals.put("thisPanel", _thispanel);
 BA.debugLineNum = 1735;BA.debugLine="Dim this As RequestCLAItem = thisBut.Tag";
Debug.ShouldStop(64);
_this = (_thisbut.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 1736;BA.debugLine="If (this.OnReport = 1) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",_this.getField(true,"OnReport" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1737;BA.debugLine="this.OnReport = 0";
Debug.ShouldStop(256);
_this.setField ("OnReport" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1738;BA.debugLine="thisBut.TextColor = Consts.ColorLightSilver";
Debug.ShouldStop(512);
_thisbut.runMethod(true,"setTextColor",appactiondialogs._consts._colorlightsilver /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1740;BA.debugLine="this.OnReport = 1";
Debug.ShouldStop(2048);
_this.setField ("OnReport" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 1741;BA.debugLine="thisBut.TextColor = Consts.ColorGreen";
Debug.ShouldStop(4096);
_thisbut.runMethod(true,"setTextColor",appactiondialogs._consts._colorgreen /*RemoteObject*/ );
 };
 BA.debugLineNum = 1743;BA.debugLine="thisBut.Tag = this";
Debug.ShouldStop(16384);
_thisbut.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1744;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
Debug.ShouldStop(32768);
_fname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _thispanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fname", _fname);
 BA.debugLineNum = 1745;BA.debugLine="SetImageSelectedOnReport(this, fname, 0)";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_setimageselectedonreport" /*void*/ ,(Object)(_this),(Object)(_fname),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1746;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageselectedtrash_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imageSelectedTrash_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1724);
if (RapidSub.canDelegate("imageselectedtrash_click")) { return __ref.runUserSub(false, "appactiondialogs","imageselectedtrash_click", __ref);}
RemoteObject _sndr = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _thispanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1724;BA.debugLine="Sub imageSelectedTrash_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1725;BA.debugLine="Dim sndr As Label = Sender";
Debug.ShouldStop(268435456);
_sndr = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_sndr = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("sndr", _sndr);
 BA.debugLineNum = 1726;BA.debugLine="Dim thisPanel As B4XView = sndr.Parent";
Debug.ShouldStop(536870912);
_thispanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_thispanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _sndr.runMethod(false,"getParent"));Debug.locals.put("thisPanel", _thispanel);
 BA.debugLineNum = 1727;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
Debug.ShouldStop(1073741824);
_this = (_thispanel.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 1728;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
Debug.ShouldStop(-2147483648);
_fname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _thispanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fname", _fname);
 BA.debugLineNum = 1729;BA.debugLine="DeleteImageFromList(thisPanel, this, fname)";
Debug.ShouldStop(1);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_deleteimagefromlist" /*void*/ ,(Object)(_thispanel),(Object)(_this),(Object)(_fname));
 BA.debugLineNum = 1730;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "appactiondialogs","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 145;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="AS_Status = DBStructures.getASStatus";
Debug.ShouldStop(131072);
__ref.setField ("_as_status" /*RemoteObject*/ ,appactiondialogs._dbstructures.runMethod(false,"_getasstatus" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 147;BA.debugLine="AS_Types = DBStructures.getASTypes";
Debug.ShouldStop(262144);
__ref.setField ("_as_types" /*RemoteObject*/ ,appactiondialogs._dbstructures.runMethod(false,"_getastypes" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 148;BA.debugLine="AS_Priority = DBStructures.getPriority";
Debug.ShouldStop(524288);
__ref.setField ("_as_priority" /*RemoteObject*/ ,appactiondialogs._dbstructures.runMethod(false,"_getpriority" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 149;BA.debugLine="AS_Urgency = DBStructures.getUrgency";
Debug.ShouldStop(1048576);
__ref.setField ("_as_urgency" /*RemoteObject*/ ,appactiondialogs._dbstructures.runMethod(false,"_geturgency" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 150;BA.debugLine="AS_Modes = DBStructures.getASModes";
Debug.ShouldStop(2097152);
__ref.setField ("_as_modes" /*RemoteObject*/ ,appactiondialogs._dbstructures.runMethod(false,"_getasmodes" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 BA.debugLineNum = 151;BA.debugLine="CurrentImageList.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_currentimagelist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 152;BA.debugLine="AssociateImagesList.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_associateimageslist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 154;BA.debugLine="ObjectTagcode = \"\" 'innerObject";
Debug.ShouldStop(33554432);
__ref.setField ("_objecttagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innersignatureonreport_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InnerSignatureOnReport_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1348);
if (RapidSub.canDelegate("innersignatureonreport_click")) { return __ref.runUserSub(false, "appactiondialogs","innersignatureonreport_click", __ref);}
RemoteObject _thisbut = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _thispanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 1348;BA.debugLine="Sub InnerSignatureOnReport_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1349;BA.debugLine="Dim thisBut As Label = Sender";
Debug.ShouldStop(16);
_thisbut = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_thisbut = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("thisBut", _thisbut);
 BA.debugLineNum = 1350;BA.debugLine="Dim thisPanel As Panel = thisBut.Parent";
Debug.ShouldStop(32);
_thispanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_thispanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _thisbut.runMethod(false,"getParent"));Debug.locals.put("thisPanel", _thispanel);
 BA.debugLineNum = 1351;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
Debug.ShouldStop(64);
_this = (_thispanel.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 1352;BA.debugLine="If (this.OnReport = 1) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",_this.getField(true,"OnReport" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1353;BA.debugLine="this.OnReport = 0";
Debug.ShouldStop(256);
_this.setField ("OnReport" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1354;BA.debugLine="thisBut.TextColor = Consts.ColorLightSilver";
Debug.ShouldStop(512);
_thisbut.runMethod(true,"setTextColor",appactiondialogs._consts._colorlightsilver /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1356;BA.debugLine="this.OnReport = 1";
Debug.ShouldStop(2048);
_this.setField ("OnReport" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 1357;BA.debugLine="thisBut.TextColor = Consts.ColorGreen";
Debug.ShouldStop(4096);
_thisbut.runMethod(true,"setTextColor",appactiondialogs._consts._colorgreen /*RemoteObject*/ );
 };
 BA.debugLineNum = 1359;BA.debugLine="thisBut.Tag = this";
Debug.ShouldStop(16384);
_thisbut.runMethod(false,"setTag",(_this));
 BA.debugLineNum = 1360;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
Debug.ShouldStop(32768);
_fname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _thispanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fname", _fname);
 BA.debugLineNum = 1361;BA.debugLine="SetImageSelectedOnReport(this, fname, 4)";
Debug.ShouldStop(65536);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_setimageselectedonreport" /*void*/ ,(Object)(_this),(Object)(_fname),(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 1362;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _innersignatureremove_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InnerSignatureRemove_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1282);
if (RapidSub.canDelegate("innersignatureremove_click")) { __ref.runUserSub(false, "appactiondialogs","innersignatureremove_click", __ref); return;}
ResumableSub_InnerSignatureRemove_Click rsub = new ResumableSub_InnerSignatureRemove_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InnerSignatureRemove_Click extends BA.ResumableSub {
public ResumableSub_InnerSignatureRemove_Click(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _sndr = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _thispanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InnerSignatureRemove_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1282);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1283;BA.debugLine="Dim sndr As Label = Sender";
Debug.ShouldStop(4);
_sndr = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_sndr = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("sndr", _sndr);
 BA.debugLineNum = 1284;BA.debugLine="Dim thisPanel As B4XView = sndr.Parent";
Debug.ShouldStop(8);
_thispanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_thispanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _sndr.runMethod(false,"getParent"));Debug.locals.put("thisPanel", _thispanel);
 BA.debugLineNum = 1285;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
Debug.ShouldStop(16);
_this = (_thispanel.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 1286;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
Debug.ShouldStop(32);
_fname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _thispanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fname", _fname);
 BA.debugLineNum = 1287;BA.debugLine="Dim Index As Int = itemSignatures.GetItemFromView";
Debug.ShouldStop(64);
_index = __ref.getField(false,"_itemsignatures" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",(Object)(_thispanel));Debug.locals.put("Index", _index);Debug.locals.put("Index", _index);
 BA.debugLineNum = 1290;BA.debugLine="If (this.BaseImage = 1) Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("=",_this.getField(true,"BaseImage" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 1291;BA.debugLine="MsgboxAsync(\"A imagem seleccionada é uma imagem";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("A imagem seleccionada é uma imagem BASE e não pode ser apagada!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta!"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1294;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.CLAImageRemove,";
Debug.ShouldStop(8192);
_i = parent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent._sharecode._claimageremove /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))),__ref.getField(false, "ba"));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1295;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(16384);
if (true) break;

case 6:
//if
this.state = 19;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1300;BA.debugLine="Dim sSQL As String = $\"delete from dta_requests";
Debug.ShouldStop(524288);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("delete from dta_requests_values_images where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("									item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and imagename='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fname.runMethod(true,"getText")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									And repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("									And repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1305;BA.debugLine="Utils.SaveSQLToLog(\"ItemImages_ItemLongClick\",s";
Debug.ShouldStop(16777216);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ItemImages_ItemLongClick")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 1307;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","668091929",_ssql,0);
 BA.debugLineNum = 1308;BA.debugLine="itemSignatures.RemoveAt(Index)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_itemsignatures" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 1310;BA.debugLine="Dim params As Map";
Debug.ShouldStop(536870912);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1311;BA.debugLine="params.Initialize";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1312;BA.debugLine="params.Clear";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1313;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1314;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 1315;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 1316;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1317;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 1318;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 1319;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1320;BA.debugLine="params.Put(\"ACLAValueFileImage\", fname.Text)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_fname.runMethod(true,"getText"))));
 BA.debugLineNum = 1322;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1323;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCou";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1324;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1325;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1326;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1327;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1328;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1329;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1330;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1331;BA.debugLine="If (params.IsInitialized) Then";
Debug.ShouldStop(262144);
if (true) break;

case 9:
//if
this.state = 18;
if ((_params.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1334;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(2097152);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/delete")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1335;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(4194304);
if (true) break;

case 12:
//if
this.state = 17;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 1336;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
Debug.ShouldStop(8388608);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1338;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(33554432);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1339;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(67108864);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 1341;BA.debugLine="Sleep(250)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "innersignatureremove_click"),BA.numberCast(int.class, 250));
this.state = 21;
return;
case 21:
//C
this.state = 18;
;
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
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1346;BA.debugLine="End Sub";
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
public static RemoteObject  _itemasviewrelated_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ItemASViewRelated_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1034);
if (RapidSub.canDelegate("itemasviewrelated_click")) { return __ref.runUserSub(false, "appactiondialogs","itemasviewrelated_click", __ref);}
 BA.debugLineNum = 1034;BA.debugLine="Sub ItemASViewRelated_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 1036;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _itemimages_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ItemImages_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1514);
if (RapidSub.canDelegate("itemimages_itemclick")) { __ref.runUserSub(false, "appactiondialogs","itemimages_itemclick", __ref, _index, _value); return;}
ResumableSub_ItemImages_ItemClick rsub = new ResumableSub_ItemImages_ItemClick(null,__ref,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ItemImages_ItemClick extends BA.ResumableSub {
public ResumableSub_ItemImages_ItemClick(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _imgb64name = RemoteObject.createImmutable("");
RemoteObject _record2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _havebaseimage = RemoteObject.createImmutable(false);
RemoteObject _innertag = RemoteObject.createImmutable("");
RemoteObject _havefileimage = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ItemImages_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1514);
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
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1515;BA.debugLine="Dim pan As Panel = ItemImages.GetPanel(Index)";
Debug.ShouldStop(1024);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pan", _pan);
 BA.debugLineNum = 1516;BA.debugLine="Dim this As RequestCLAItem = pan.Tag";
Debug.ShouldStop(2048);
_this = (_pan.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 1517;BA.debugLine="Dim ImageFilename As Label = pan.GetView(1)";
Debug.ShouldStop(4096);
parent._imagefilename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
parent._imagefilename = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pan.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());__ref.setField("_imagefilename",parent._imagefilename);
 BA.debugLineNum = 1518;BA.debugLine="Dim ImgB64 As String = \"\"";
Debug.ShouldStop(8192);
_imgb64 = BA.ObjectToString("");Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1519;BA.debugLine="Dim ImgB64Name As String = \"\"";
Debug.ShouldStop(16384);
_imgb64name = BA.ObjectToString("");Debug.locals.put("ImgB64Name", _imgb64name);Debug.locals.put("ImgB64Name", _imgb64name);
 BA.debugLineNum = 1520;BA.debugLine="Private Record2 As Cursor";
Debug.ShouldStop(32768);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 1529;BA.debugLine="If (Utils.NNE( this.Tagcode)) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_this.getField(true,"Tagcode" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1530;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1539;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1547;BA.debugLine="Utils.SaveSQLToLog(\"ItemImages_ItemClick\",sSQL, t";
Debug.ShouldStop(1024);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ItemImages_ItemClick")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 1551;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16384);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1552;BA.debugLine="params.Initialize";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1553;BA.debugLine="params.Clear";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1554;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1555;BA.debugLine="params.Put(\"ACLRequest\", this.Request)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 1556;BA.debugLine="params.Put(\"ACLAction\", this.Action)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 1557;BA.debugLine="params.Put(\"ACLTask\", this.Task)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1558;BA.debugLine="params.Put(\"ACLItem\", this.Item)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 1559;BA.debugLine="params.Put(\"ACLUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 1560;BA.debugLine="params.Put(\"ACLTagcode\", this.Tagcode)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1561;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ))));
 BA.debugLineNum = 1562;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1563;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCount";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1564;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1565;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1566;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1567;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1568;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1569;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1570;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1571;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(4);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/obs/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1572;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1573;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Reque";
Debug.ShouldStop(16);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1575;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(64);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1576;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(128);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1578;BA.debugLine="Sleep(500)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "itemimages_itemclick"),BA.numberCast(int.class, 500));
this.state = 86;
return;
case 86:
//C
this.state = 13;
;
 BA.debugLineNum = 1580;BA.debugLine="Dim HaveBaseImage As Boolean = False";
Debug.ShouldStop(2048);
_havebaseimage = parent.__c.getField(true,"False");Debug.locals.put("HaveBaseImage", _havebaseimage);Debug.locals.put("HaveBaseImage", _havebaseimage);
 BA.debugLineNum = 1581;BA.debugLine="If (this.BaseImage = 1) Then";
Debug.ShouldStop(4096);
if (true) break;

case 13:
//if
this.state = 26;
if ((RemoteObject.solveBoolean("=",_this.getField(true,"BaseImage" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 15;
}else {
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1582;BA.debugLine="Private Record2 As Cursor";
Debug.ShouldStop(8192);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 1583;BA.debugLine="Dim sSQL As String = $\"select distinct ifnull(a.";
Debug.ShouldStop(16384);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 1 as base_image, 0 as on_report\n"),RemoteObject.createImmutable("			from dta_tasks_items as a \n"),RemoteObject.createImmutable("			inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode \n"),RemoteObject.createImmutable("					and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)\n"),RemoteObject.createImmutable("			where b.request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.inner_request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and b.repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1594;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(33554432);
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1596;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1597;BA.debugLine="Record2.Position = 0";
Debug.ShouldStop(268435456);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1599;BA.debugLine="ImgB64 = Record2.GetString(\"imageb64\")";
Debug.ShouldStop(1073741824);
_imgb64 = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imageb64")));Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1600;BA.debugLine="ImgB64 = ImgB64.Replace(\"data:image/png;base64,";
Debug.ShouldStop(-2147483648);
_imgb64 = _imgb64.runMethod(true,"replace",(Object)(BA.ObjectToString("data:image/png;base64,")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1601;BA.debugLine="ImgB64Name = Record2.GetString(\"imagename\")";
Debug.ShouldStop(1);
_imgb64name = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")));Debug.locals.put("ImgB64Name", _imgb64name);
 BA.debugLineNum = 1603;BA.debugLine="HaveBaseImage = Utils.NNE(ImgB64) Or Utils.NNE(";
Debug.ShouldStop(4);
_havebaseimage = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgb64))) || RemoteObject.solveBoolean(".",parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgb64name))));Debug.locals.put("HaveBaseImage", _havebaseimage);
 if (true) break;

case 19:
//C
this.state = 26;
;
 BA.debugLineNum = 1606;BA.debugLine="Record2.Close";
Debug.ShouldStop(32);
_record2.runVoidMethod ("Close");
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1608;BA.debugLine="Dim sSQL As String = $\"select distinct ifnull(a.";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 1 as base_image, 0 as on_report\n"),RemoteObject.createImmutable("			from dta_tasks_items as a \n"),RemoteObject.createImmutable("			inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode \n"),RemoteObject.createImmutable("					and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)\n"),RemoteObject.createImmutable("			where b.request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.inner_request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and b.repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and b.repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1619;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(262144);
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1621;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1622;BA.debugLine="Record2.Position = 0";
Debug.ShouldStop(2097152);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 1628;BA.debugLine="Dim innerTag As String = ImageFilename.Tag";
Debug.ShouldStop(134217728);
_innertag = BA.ObjectToString(__ref.getField(false,"_imagefilename" /*RemoteObject*/ ).runMethod(false,"getTag"));Debug.locals.put("innerTag", _innertag);Debug.locals.put("innerTag", _innertag);
 BA.debugLineNum = 1629;BA.debugLine="If Not(HaveBaseImage) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 27:
//if
this.state = 38;
if (parent.__c.runMethod(true,"Not",(Object)(_havebaseimage)).<Boolean>get().booleanValue()) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1630;BA.debugLine="If Utils.NNE(innerTag) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 30:
//if
this.state = 37;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_innertag)).<Boolean>get().booleanValue()) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 1631;BA.debugLine="Dim sSQL As String = $\"Select ifnull(a.image, '";
Debug.ShouldStop(1073741824);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("Select ifnull(a.image, '') as image from  dta_objects as a where a.tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_innertag))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1632;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(-2147483648);
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1633;BA.debugLine="If Record2.RowCount > 0 Then";
Debug.ShouldStop(1);
if (true) break;

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean(">",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1634;BA.debugLine="Record2.Position = 0";
Debug.ShouldStop(2);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1635;BA.debugLine="ImgB64 = Record2.GetString(\"image\")";
Debug.ShouldStop(4);
_imgb64 = _record2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("image")));Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1636;BA.debugLine="ImgB64 = ImgB64.Replace(\"data:image/png;base64";
Debug.ShouldStop(8);
_imgb64 = _imgb64.runMethod(true,"replace",(Object)(BA.ObjectToString("data:image/png;base64,")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1637;BA.debugLine="ImgB64Name = \"\"";
Debug.ShouldStop(16);
_imgb64name = BA.ObjectToString("");Debug.locals.put("ImgB64Name", _imgb64name);
 if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 1643;BA.debugLine="Record2.Close";
Debug.ShouldStop(1024);
_record2.runVoidMethod ("Close");
 BA.debugLineNum = 1645;BA.debugLine="If File.Exists(Starter.InternalFolder, ImageFilen";
Debug.ShouldStop(4096);
if (true) break;

case 39:
//if
this.state = 48;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(__ref.getField(false,"_imagefilename" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 1646;BA.debugLine="Try";
Debug.ShouldStop(8192);
if (true) break;

case 42:
//try
this.state = 47;
this.catchState = 46;
this.state = 44;
if (true) break;

case 44:
//C
this.state = 47;
this.catchState = 46;
 BA.debugLineNum = 1647;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(16384);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 1648;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 1649;BA.debugLine="ImgB64 = Base64Con.EncodeFromImage(Starter.Inte";
Debug.ShouldStop(65536);
_imgb64 = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(__ref.getField(false,"_imagefilename" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1650;BA.debugLine="ImgB64Name = ImageFilename.Text";
Debug.ShouldStop(131072);
_imgb64name = __ref.getField(false,"_imagefilename" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("ImgB64Name", _imgb64name);
 Debug.CheckDeviceExceptions();
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 0;
 BA.debugLineNum = 1652;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","668550794",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 1653;BA.debugLine="ImgB64 = \"\"";
Debug.ShouldStop(1048576);
_imgb64 = BA.ObjectToString("");Debug.locals.put("ImgB64", _imgb64);
 if (true) break;
if (true) break;

case 47:
//C
this.state = 48;
this.catchState = 0;
;
 if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 1658;BA.debugLine="Dim HaveFileImage As Boolean = Utils.NNE(ImgB64)";
Debug.ShouldStop(33554432);
_havefileimage = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgb64))) && RemoteObject.solveBoolean(".",parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgb64name))));Debug.locals.put("HaveFileImage", _havefileimage);Debug.locals.put("HaveFileImage", _havefileimage);
 BA.debugLineNum = 1659;BA.debugLine="If Not(HaveFileImage) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 49:
//if
this.state = 62;
if (parent.__c.runMethod(true,"Not",(Object)(_havefileimage)).<Boolean>get().booleanValue()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1660;BA.debugLine="If File.Exists(Starter.InternalFolder, \"CROQUI.p";
Debug.ShouldStop(134217728);
if (true) break;

case 52:
//if
this.state = 61;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("CROQUI.png"))).<Boolean>get().booleanValue()) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 1661;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 55:
//try
this.state = 60;
this.catchState = 59;
this.state = 57;
if (true) break;

case 57:
//C
this.state = 60;
this.catchState = 59;
 BA.debugLineNum = 1662;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(536870912);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 1663;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 1664;BA.debugLine="ImgB64 = Base64Con.EncodeFromImage(Starter.Int";
Debug.ShouldStop(-2147483648);
_imgb64 = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("CROQUI.png")));Debug.locals.put("ImgB64", _imgb64);
 Debug.CheckDeviceExceptions();
if (true) break;

case 59:
//C
this.state = 60;
this.catchState = 0;
 BA.debugLineNum = 1666;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","668550808",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 1667;BA.debugLine="ImgB64 = \"\"";
Debug.ShouldStop(4);
_imgb64 = BA.ObjectToString("");Debug.locals.put("ImgB64", _imgb64);
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
this.catchState = 0;
;
 if (true) break;

case 61:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 1671;BA.debugLine="HaveFileImage = (Utils.NNE(ImgB64))";
Debug.ShouldStop(64);
_havefileimage = (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgb64)));Debug.locals.put("HaveFileImage", _havefileimage);
 BA.debugLineNum = 1673;BA.debugLine="If Not(HaveFileImage) Then";
Debug.ShouldStop(256);
if (true) break;

case 63:
//if
this.state = 80;
if (parent.__c.runMethod(true,"Not",(Object)(_havefileimage)).<Boolean>get().booleanValue()) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 1674;BA.debugLine="If (Utils.NNE(ImgB64Name)) Then";
Debug.ShouldStop(512);
if (true) break;

case 66:
//if
this.state = 79;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgb64name))).<Boolean>get().booleanValue()) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 1675;BA.debugLine="If File.Exists(Starter.InternalFolder, ImgB64Na";
Debug.ShouldStop(1024);
if (true) break;

case 69:
//if
this.state = 78;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_imgb64name)).<Boolean>get().booleanValue()) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 1676;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 72:
//try
this.state = 77;
this.catchState = 76;
this.state = 74;
if (true) break;

case 74:
//C
this.state = 77;
this.catchState = 76;
 BA.debugLineNum = 1677;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(4096);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 1678;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 1680;BA.debugLine="ImgB64 = Base64Con.EncodeFromImage(Starter.In";
Debug.ShouldStop(32768);
_imgb64 = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_imgb64name));Debug.locals.put("ImgB64", _imgb64);
 Debug.CheckDeviceExceptions();
if (true) break;

case 76:
//C
this.state = 77;
this.catchState = 0;
 BA.debugLineNum = 1682;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","668550824",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 1683;BA.debugLine="ImgB64 = \"\"";
Debug.ShouldStop(262144);
_imgb64 = BA.ObjectToString("");Debug.locals.put("ImgB64", _imgb64);
 if (true) break;
if (true) break;

case 77:
//C
this.state = 78;
this.catchState = 0;
;
 if (true) break;

case 78:
//C
this.state = 79;
;
 if (true) break;

case 79:
//C
this.state = 80;
;
 if (true) break;
;
 BA.debugLineNum = 1690;BA.debugLine="If Utils.NNE(ImgB64) Then";
Debug.ShouldStop(33554432);

case 80:
//if
this.state = 85;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgb64)).<Boolean>get().booleanValue()) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 85;
 BA.debugLineNum = 1691;BA.debugLine="CallSubDelayed3(ImageEdit, \"StartDrawFrom3\", Img";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((parent._imageedit.getObject())),(Object)(BA.ObjectToString("StartDrawFrom3")),(Object)((_imgb64)),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ))));
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 1693;BA.debugLine="MsgboxAsync(\"Erro na identificação da imagem sel";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Erro na identificação da imagem seleccionada!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta!"))),__ref.getField(false, "ba"));
 if (true) break;

case 85:
//C
this.state = -1;
;
 BA.debugLineNum = 1695;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _itemimages_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ItemImages_ItemLongClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3369);
if (RapidSub.canDelegate("itemimages_itemlongclick")) { return __ref.runUserSub(false, "appactiondialogs","itemimages_itemlongclick", __ref, _index, _value);}
RemoteObject _thispanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3369;BA.debugLine="Sub ItemImages_ItemLongClick (Index As Int, Value";
Debug.ShouldStop(256);
 BA.debugLineNum = 3370;BA.debugLine="Log(Value)";
Debug.ShouldStop(512);
appactiondialogs.__c.runVoidMethod ("LogImpl","670385665",BA.ObjectToString(_value),0);
 BA.debugLineNum = 3371;BA.debugLine="Dim thisPanel As B4XView = ItemImages.GetPanel(In";
Debug.ShouldStop(1024);
_thispanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_thispanel = __ref.getField(false,"_itemimages" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("thisPanel", _thispanel);Debug.locals.put("thisPanel", _thispanel);
 BA.debugLineNum = 3372;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
Debug.ShouldStop(2048);
_this = (_thispanel.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 3373;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
Debug.ShouldStop(4096);
_fname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _thispanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fname", _fname);
 BA.debugLineNum = 3374;BA.debugLine="DeleteImageFromList(thisPanel, this, fname)";
Debug.ShouldStop(8192);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_deleteimagefromlist" /*void*/ ,(Object)(_thispanel),(Object)(_this),(Object)(_fname));
 BA.debugLineNum = 3375;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _itemimages_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ItemImages_LongClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1697);
if (RapidSub.canDelegate("itemimages_longclick")) { return __ref.runUserSub(false, "appactiondialogs","itemimages_longclick", __ref);}
 BA.debugLineNum = 1697;BA.debugLine="Sub ItemImages_LongClick";
Debug.ShouldStop(1);
 BA.debugLineNum = 1699;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _itemnotes_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("ItemNotes_FocusChanged (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3446);
if (RapidSub.canDelegate("itemnotes_focuschanged")) { __ref.runUserSub(false, "appactiondialogs","itemnotes_focuschanged", __ref, _hasfocus); return;}
ResumableSub_ItemNotes_FocusChanged rsub = new ResumableSub_ItemNotes_FocusChanged(null,__ref,_hasfocus);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ItemNotes_FocusChanged extends BA.ResumableSub {
public ResumableSub_ItemNotes_FocusChanged(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _hasfocus) {
this.parent = parent;
this.__ref = __ref;
this._hasfocus = _hasfocus;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _hasfocus;
RemoteObject _curr = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ItemNotes_FocusChanged (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3446);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 3447;BA.debugLine="Dim curr As EditText = Sender";
Debug.ShouldStop(4194304);
_curr = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_curr = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("curr", _curr);
 BA.debugLineNum = 3448;BA.debugLine="If Not(HasFocus) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 16;
if (parent.__c.runMethod(true,"Not",(Object)(_hasfocus)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3449;BA.debugLine="Dim this As RequestCLAItem = curr.tag";
Debug.ShouldStop(16777216);
_this = (_curr.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 3451;BA.debugLine="CurrentItemNotesText = Utils.IfNullOrEmpty(Curre";
Debug.ShouldStop(67108864);
__ref.setField ("_currentitemnotestext" /*RemoteObject*/ ,parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 3452;BA.debugLine="Log($\"CurrentItemNotesText:${CurrentItemNotesTex";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","670582278",(RemoteObject.concat(RemoteObject.createImmutable("CurrentItemNotesText:"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3454;BA.debugLine="If (Utils.NNE( this.Tagcode)) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 9;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_this.getField(true,"Tagcode" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 3455;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(1073741824);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 3464;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 3472;BA.debugLine="Utils.SaveSQLToLog(\"ItemNotes_FocusChanged\",sSQL";
Debug.ShouldStop(32768);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ItemNotes_FocusChanged")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 3475;BA.debugLine="Dim params As Map";
Debug.ShouldStop(262144);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3476;BA.debugLine="params.Initialize";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3477;BA.debugLine="params.Clear";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3478;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3479;BA.debugLine="params.Put(\"ACLRequest\", this.Request)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 3480;BA.debugLine="params.Put(\"ACLAction\", this.Action)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 3481;BA.debugLine="params.Put(\"ACLTask\", this.Task)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 3482;BA.debugLine="params.Put(\"ACLItem\", this.Item)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 3483;BA.debugLine="params.Put(\"ACLUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 3484;BA.debugLine="params.Put(\"ACLTagcode\", this.Tagcode)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 3485;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ))));
 BA.debugLineNum = 3486;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3487;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3488;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3489;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3490;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3491;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3492;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3493;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3494;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3497;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(256);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/obs/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3498;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(512);
if (true) break;

case 10:
//if
this.state = 15;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 3499;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Requ";
Debug.ShouldStop(1024);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 3501;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(4096);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3502;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(8192);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 3504;BA.debugLine="Sleep(500)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "itemnotes_focuschanged"),BA.numberCast(int.class, 500));
this.state = 17;
return;
case 17:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 3507;BA.debugLine="End Sub";
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
public static RemoteObject  _itemnotes_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("ItemNotes_TextChanged (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3509);
if (RapidSub.canDelegate("itemnotes_textchanged")) { return __ref.runUserSub(false, "appactiondialogs","itemnotes_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 3509;BA.debugLine="Sub ItemNotes_TextChanged (Old As String, New As S";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 3511;BA.debugLine="CurrentItemNotesText = ItemNotes.Text";
Debug.ShouldStop(4194304);
__ref.setField ("_currentitemnotestext" /*RemoteObject*/ ,__ref.getField(false,"_itemnotes" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 3568;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _itemsignatures_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("itemSignatures_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,893);
if (RapidSub.canDelegate("itemsignatures_itemclick")) { return __ref.runUserSub(false, "appactiondialogs","itemsignatures_itemclick", __ref, _index, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _imgdata = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._imageviewdata");
RemoteObject _imglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _nrows = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 893;BA.debugLine="Sub itemSignatures_ItemClick (Index As Int, Value";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 894;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 897;BA.debugLine="Dim pnl As Panel = itemSignatures.GetPanel(Index";
Debug.ShouldStop(1);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_itemsignatures" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 899;BA.debugLine="Dim this As RequestCLAItem = pnl.Tag";
Debug.ShouldStop(4);
_this = (_pnl.runMethod(false,"getTag"));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 900;BA.debugLine="Dim info As List = Regex.Split(\"\\|\", pnl.tag )";
Debug.ShouldStop(8);
_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_info = appactiondialogs.__c.runMethod(false, "ArrayToList", (Object)(appactiondialogs.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_pnl.runMethod(false,"getTag"))))));Debug.locals.put("info", _info);Debug.locals.put("info", _info);
 BA.debugLineNum = 901;BA.debugLine="Dim fname As Label = pnl.GetView(1)";
Debug.ShouldStop(16);
_fname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_fname = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("fname", _fname);
 BA.debugLineNum = 906;BA.debugLine="Dim imgdata As ImageViewData = Types.MakeImageV";
Debug.ShouldStop(512);
_imgdata = appactiondialogs._types.runMethod(false,"_makeimageviewdataclear" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("imgdata", _imgdata);Debug.locals.put("imgdata", _imgdata);
 BA.debugLineNum = 907;BA.debugLine="Dim imgList As List";
Debug.ShouldStop(1024);
_imglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("imgList", _imglist);
 BA.debugLineNum = 908;BA.debugLine="imgList.Initialize";
Debug.ShouldStop(2048);
_imglist.runVoidMethod ("Initialize");
 BA.debugLineNum = 909;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(4096);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 912;BA.debugLine="Dim SQL As String = $\"select id,tagcode,imageb64";
Debug.ShouldStop(32768);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select id,tagcode,imageb64,imagename from dta_requests_values_images where request_tagcode='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and task_tagcode='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("										item_tagcode='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and unique_key='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and tagcode='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and imagename='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fname.runMethod(true,"getText")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										And repeatcounter="),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("										And repeatitemcounter="),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 916;BA.debugLine="Log(SQL)";
Debug.ShouldStop(524288);
appactiondialogs.__c.runVoidMethod ("LogImpl","666781207",_sql,0);
 BA.debugLineNum = 917;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(1048576);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), appactiondialogs._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 919;BA.debugLine="Dim nRows As Int = Record.RowCount";
Debug.ShouldStop(4194304);
_nrows = _record.runMethod(true,"getRowCount");Debug.locals.put("nRows", _nrows);Debug.locals.put("nRows", _nrows);
 BA.debugLineNum = 920;BA.debugLine="If nRows > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_nrows,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 921;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step15 > 0 && _row <= limit15) || (step15 < 0 && _row >= limit15) ;_row = ((int)(0 + _row + step15))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 923;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(67108864);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 924;BA.debugLine="Dim imgdata As ImageViewData = Types.MakeImag";
Debug.ShouldStop(134217728);
_imgdata = appactiondialogs._types.runMethod(false,"_makeimageviewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imageb64")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")))));Debug.locals.put("imgdata", _imgdata);Debug.locals.put("imgdata", _imgdata);
 BA.debugLineNum = 925;BA.debugLine="imgList.Add(imgdata)";
Debug.ShouldStop(268435456);
_imglist.runVoidMethod ("Add",(Object)((_imgdata)));
 }
}Debug.locals.put("Row", _row);
;
 }else {
 BA.debugLineNum = 928;BA.debugLine="imgList.Add(imgdata)";
Debug.ShouldStop(-2147483648);
_imglist.runVoidMethod ("Add",(Object)((_imgdata)));
 };
 BA.debugLineNum = 930;BA.debugLine="Record.Close";
Debug.ShouldStop(2);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 932;BA.debugLine="If Utils.NNE(imgdata.b64) Then";
Debug.ShouldStop(8);
if (appactiondialogs._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgdata.getField(true,"b64" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 933;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(16);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 934;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(32);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 935;BA.debugLine="Filter.getShowImageViewListDialog(Me, imgList)";
Debug.ShouldStop(64);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getshowimageviewlistdialog" /*void*/ ,(Object)(__ref),(Object)(_imglist));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e30.toString()); BA.debugLineNum = 940;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(2048);
appactiondialogs.__c.runVoidMethod ("LogImpl","666781231",appactiondialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 942;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _itemsignatures_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("itemSignatures_ItemLongClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,944);
if (RapidSub.canDelegate("itemsignatures_itemlongclick")) { return __ref.runUserSub(false, "appactiondialogs","itemsignatures_itemlongclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 944;BA.debugLine="Sub itemSignatures_ItemLongClick (Index As Int, Va";
Debug.ShouldStop(32768);
 BA.debugLineNum = 946;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutmoreactioninner_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listButMoreActionInner_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3325);
if (RapidSub.canDelegate("listbutmoreactioninner_click")) { return __ref.runUserSub(false, "appactiondialogs","listbutmoreactioninner_click", __ref);}
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
 BA.debugLineNum = 3325;BA.debugLine="Sub listButMoreActionInner_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3327;BA.debugLine="Dim filename As String = $\"Base_${ObjectTagcode}.";
Debug.ShouldStop(1073741824);
_filename = (RemoteObject.concat(RemoteObject.createImmutable("Base_"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_objecttagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable(".png")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 3328;BA.debugLine="If File.Exists(Starter.InternalFolder, filename)";
Debug.ShouldStop(-2147483648);
if (appactiondialogs.__c.getField(false,"File").runMethod(true,"Exists",(Object)(appactiondialogs._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3329;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 3330;BA.debugLine="File.Delete(Starter.InternalFolder, filename)";
Debug.ShouldStop(2);
appactiondialogs.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(appactiondialogs._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 3332;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
appactiondialogs.__c.runVoidMethod ("LogImpl","670189063",BA.ObjectToString(appactiondialogs.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 };
 BA.debugLineNum = 3336;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(128);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 3337;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(256);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3338;BA.debugLine="Filter.GetMoreActionsDialog(CurrentActivity, \"Use";
Debug.ShouldStop(512);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getmoreactionsdialog" /*void*/ ,(Object)(__ref.getField(false,"_currentactivity" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(("User"))),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_objecttagcode" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_pressedanswertagcode" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3339;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _liststabpanel_pageselected(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1502);
if (RapidSub.canDelegate("liststabpanel_pageselected")) { return __ref.runUserSub(false, "appactiondialogs","liststabpanel_pageselected", __ref, _position);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1502;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1503;BA.debugLine="Dim lst As List = Utils.GetAllTabLabels(listsTabP";
Debug.ShouldStop(1073741824);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = appactiondialogs._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_liststabpanel" /*RemoteObject*/ )));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1504;BA.debugLine="For Each lbl As Label In lst";
Debug.ShouldStop(-2147483648);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group2 = _lst;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group2.runMethod(false,"Get",index2));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1505;BA.debugLine="lbl.TextColor = Colors.White";
Debug.ShouldStop(1);
_lbl.runMethod(true,"setTextColor",appactiondialogs.__c.getField(false,"Colors").getField(true,"White"));
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 1507;BA.debugLine="Dim lbl As Label = lst.Get(Position)";
Debug.ShouldStop(4);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _lst.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1508;BA.debugLine="lbl.TextColor = Colors.Black";
Debug.ShouldStop(8);
_lbl.runMethod(true,"setTextColor",appactiondialogs.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 1509;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _obsoptions_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("obsOptions_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2263);
if (RapidSub.canDelegate("obsoptions_itemclick")) { __ref.runUserSub(false, "appactiondialogs","obsoptions_itemclick", __ref, _position, _value); return;}
ResumableSub_obsOptions_ItemClick rsub = new ResumableSub_obsOptions_ItemClick(null,__ref,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_obsOptions_ItemClick extends BA.ResumableSub {
public ResumableSub_obsOptions_ItemClick(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("obsOptions_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2263);
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
 BA.debugLineNum = 2264;BA.debugLine="If (Position = 0) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 18;
if ((RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2275;BA.debugLine="If (Utils.NNE( CurrentCLAItem.Tagcode)) Then";
Debug.ShouldStop(4);
if (true) break;

case 6:
//if
this.state = 11;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 2276;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(8);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2285;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(4096);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 2293;BA.debugLine="Utils.SaveSQLToLog(\"obsOptions_ItemClick\",sSQL,";
Debug.ShouldStop(1048576);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("obsOptions_ItemClick")),(Object)(_ssql),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 2297;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16777216);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2298;BA.debugLine="params.Initialize";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2299;BA.debugLine="params.Clear";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2300;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2301;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 2302;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 2303;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 2304;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 2305;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.Unique";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 2306;BA.debugLine="params.Put(\"ACLTagcode\", CurrentCLAItem.Tagcode)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 2307;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ))));
 BA.debugLineNum = 2308;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repe";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2309;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repe";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 2310;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2311;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2312;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2313;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2314;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2315;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2316;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2317;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(4096);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/obs/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2318;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(8192);
if (true) break;

case 12:
//if
this.state = 17;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 2319;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCL";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2321;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(65536);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2322;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 2324;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "obsoptions_itemclick"),BA.numberCast(int.class, 1000));
this.state = 19;
return;
case 19:
//C
this.state = 18;
;
 BA.debugLineNum = 2326;BA.debugLine="obsOptions.SelectedIndex = 0";
Debug.ShouldStop(2097152);
__ref.getField(false,"_obsoptions" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 2328;BA.debugLine="End Sub";
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
public static RemoteObject  _saveimages(RemoteObject __ref,RemoteObject _this) throws Exception{
try {
		Debug.PushSubsStack("SaveImages (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3920);
if (RapidSub.canDelegate("saveimages")) { return __ref.runUserSub(false, "appactiondialogs","saveimages", __ref, _this);}
ResumableSub_SaveImages rsub = new ResumableSub_SaveImages(null,__ref,_this);
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
public static class ResumableSub_SaveImages extends BA.ResumableSub {
public ResumableSub_SaveImages(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _this) {
this.parent = parent;
this.__ref = __ref;
this._this = _this;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _this;
RemoteObject _obj = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _params33 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _nfile = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _upl = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
RemoteObject _serverlocation = RemoteObject.createImmutable("");
int step7;
int limit7;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SaveImages (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3920);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("this", _this);
 BA.debugLineNum = 3922;BA.debugLine="CurrentCLAItem = this";
Debug.ShouldStop(131072);
__ref.setField ("_currentclaitem" /*RemoteObject*/ ,_this);
 BA.debugLineNum = 3923;BA.debugLine="Dim obj As String = this.TagObject";
Debug.ShouldStop(262144);
_obj = _this.getField(true,"TagObject" /*RemoteObject*/ );Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 3924;BA.debugLine="Dim params As Map";
Debug.ShouldStop(524288);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3925;BA.debugLine="Dim params33 As Map";
Debug.ShouldStop(1048576);
_params33 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params33", _params33);
 BA.debugLineNum = 3926;BA.debugLine="If (AssociateImagesList.Size >0) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 52;
if ((RemoteObject.solveBoolean(">",__ref.getField(false,"_associateimageslist" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3927;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._pg2msgprocessfotos /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 3928;BA.debugLine="For nFile=0 To AssociateImagesList.Size-1";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//for
this.state = 51;
step7 = 1;
limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_associateimageslist" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nfile = 0 ;
Debug.locals.put("nFile", _nfile);
this.state = 53;
if (true) break;

case 53:
//C
this.state = 51;
if ((step7 > 0 && _nfile <= limit7) || (step7 < 0 && _nfile >= limit7)) this.state = 6;
if (true) break;

case 54:
//C
this.state = 53;
_nfile = ((int)(0 + _nfile + step7)) ;
Debug.locals.put("nFile", _nfile);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3929;BA.debugLine="Dim FileName As String = AssociateImagesList.Ge";
Debug.ShouldStop(16777216);
_filename = BA.ObjectToString(__ref.getField(false,"_associateimageslist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _nfile))));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 3930;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 16;
if (parent.__c.runMethod(true,"Not",(Object)(parent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_filename)))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3934;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(536870912);
parent._base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");__ref.setField("_base64con",parent._base64con);
 BA.debugLineNum = 3935;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_base64con" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 3936;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
Debug.ShouldStop(-2147483648);
_imgb64 = __ref.getField(false,"_base64con" /*RemoteObject*/ ).runMethod(true,"_v6",(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 3939;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(4);
_maxid = RemoteObject.solve(new RemoteObject[] {parent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 3940;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
Debug.ShouldStop(8);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images\n"),RemoteObject.createImmutable("						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"),RemoteObject.createImmutable("						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, \n"),RemoteObject.createImmutable("						execute_datetime, execute_latitude, execute_longitude)\n"),RemoteObject.createImmutable("						values ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				'"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("', 1, "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(",\n"),RemoteObject.createImmutable("				'',\n"),RemoteObject.createImmutable("				'',\n"),RemoteObject.createImmutable("				'')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3950;BA.debugLine="Utils.SaveSQLToLog(\"SaveImages\",sSQL, this.Req";
Debug.ShouldStop(8192);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("SaveImages")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 3968;BA.debugLine="Private sACLADatetime As String = Utils.GetCur";
Debug.ShouldStop(-2147483648);
_sacladatetime = parent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 3969;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
Debug.ShouldStop(1);
_saclalatitude = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 3970;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
Debug.ShouldStop(2);
_saclalongitude = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 3972;BA.debugLine="params.Initialize";
Debug.ShouldStop(8);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3973;BA.debugLine="params.Clear";
Debug.ShouldStop(16);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3974;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3975;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 3976;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 3977;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 3978;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 3979;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 3980;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 3981;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 3982;BA.debugLine="params.Put(\"ACLAValueFileImage\", FileName)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_filename)));
 BA.debugLineNum = 3983;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAOnReport"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 3984;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounte";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3985;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCo";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3986;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3987;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3988;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3989;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3990;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3991;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3992;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3993;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 3994;BA.debugLine="Try";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 3995;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 3996;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 3998;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3999;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 4000;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","671237712",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 if (true) break;
;
 BA.debugLineNum = 4039;BA.debugLine="If (params.IsInitialized) Then";
Debug.ShouldStop(64);

case 16:
//if
this.state = 41;
if ((_params.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 4040;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(128);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 4041;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(256);
if (true) break;

case 19:
//if
this.state = 24;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 4042;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
Debug.ShouldStop(512);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 4044;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(2048);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 4045;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(4096);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 4047;BA.debugLine="Sleep(250)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "saveimages"),BA.numberCast(int.class, 250));
this.state = 55;
return;
case 55:
//C
this.state = 25;
;
 BA.debugLineNum = 4050;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(131072);
if (true) break;

case 25:
//if
this.state = 40;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 27;
}else {
this.state = 39;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 4051;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 28:
//try
this.state = 37;
this.catchState = 36;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 36;
 BA.debugLineNum = 4052;BA.debugLine="Dim upl As ResumableSub = UploadFilesWithFTP";
Debug.ShouldStop(524288);
_upl = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_upl = __ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_uploadfileswithftpcamimage" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("upl", _upl);Debug.locals.put("upl", _upl);
 BA.debugLineNum = 4053;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "saveimages"), _upl);
this.state = 56;
return;
case 56:
//C
this.state = 31;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 4054;BA.debugLine="If finish Then";
Debug.ShouldStop(2097152);
if (true) break;

case 31:
//if
this.state = 34;
if (_finish.<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 4055;BA.debugLine="Log(\"UploadFilesWithFTP finish \" & finish )";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","671237767",RemoteObject.concat(RemoteObject.createImmutable("UploadFilesWithFTP finish "),_finish),0);
 if (true) break;

case 34:
//C
this.state = 37;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
 BA.debugLineNum = 4059;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","671237771",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 4060;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCod";
Debug.ShouldStop(134217728);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 4061;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWo";
Debug.ShouldStop(268435456);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 4062;BA.debugLine="Utils.save2update(ServerLocation, FileName,";
Debug.ShouldStop(536870912);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;
if (true) break;

case 37:
//C
this.state = 40;
this.catchState = 0;
;
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 4065;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode";
Debug.ShouldStop(1);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 4066;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(2);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 4067;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1";
Debug.ShouldStop(4);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 4069;BA.debugLine="Sleep(250)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "saveimages"),BA.numberCast(int.class, 250));
this.state = 57;
return;
case 57:
//C
this.state = 41;
;
 if (true) break;
;
 BA.debugLineNum = 4072;BA.debugLine="If (params33.IsInitialized) Then";
Debug.ShouldStop(128);

case 41:
//if
this.state = 50;
if ((_params33.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 4074;BA.debugLine="Log(\"33333333333333333333333333333333333333333";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","671237786",RemoteObject.createImmutable("3333333333333333333333333333333333333333333333"),0);
 BA.debugLineNum = 4075;BA.debugLine="Log(Url)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","671237787",_url,0);
 BA.debugLineNum = 4076;BA.debugLine="Log(\"33333333333333333333333333333333333333333";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","671237788",RemoteObject.createImmutable("3333333333333333333333333333333333333333333333"),0);
 BA.debugLineNum = 4077;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(4096);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more2/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 4078;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(8192);
if (true) break;

case 44:
//if
this.state = 49;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
 BA.debugLineNum = 4079;BA.debugLine="Utils.CallApi(0, params33, Me, Url, \"\", this.";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params33),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 4081;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(65536);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 4082;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params33))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 4084;BA.debugLine="Sleep(250)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "saveimages"),BA.numberCast(int.class, 250));
this.state = 58;
return;
case 58:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
Debug.locals.put("nFile", _nfile);
;
 BA.debugLineNum = 4091;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 52:
//C
this.state = -1;
;
 BA.debugLineNum = 4094;BA.debugLine="CallSub2(CheckList3, \"CamImage2\", CurrentCLAItem)";
Debug.ShouldStop(536870912);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((parent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage2")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ))));
 BA.debugLineNum = 4095;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 4096;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _sendemail_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("sendEmail_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2334);
if (RapidSub.canDelegate("sendemail_click")) { return __ref.runUserSub(false, "appactiondialogs","sendemail_click", __ref);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
 BA.debugLineNum = 2334;BA.debugLine="Sub sendEmail_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2336;BA.debugLine="Dim lst As List";
Debug.ShouldStop(-2147483648);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 2337;BA.debugLine="lst.Initialize";
Debug.ShouldStop(1);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 2338;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(2);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 2339;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(4);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2340;BA.debugLine="Filter.GetMoreSendEmailDialog(CurrentCLAItem, Cur";
Debug.ShouldStop(8);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getmoresendemaildialog" /*void*/ ,(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currenttagcode" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_currentcld" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )),(Object)(_lst));
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
public static RemoteObject  _sendemailimages_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("sendEmailImages_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2343);
if (RapidSub.canDelegate("sendemailimages_click")) { return __ref.runUserSub(false, "appactiondialogs","sendemailimages_click", __ref);}
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
 BA.debugLineNum = 2343;BA.debugLine="Sub sendEmailImages_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 2344;BA.debugLine="If (CurrentImageList.Size >= 1) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("g",__ref.getField(false,"_currentimagelist" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 2345;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(256);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 2346;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(512);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2347;BA.debugLine="Filter.GetMoreSendEmailDialog(CurrentCLAItem, Cu";
Debug.ShouldStop(1024);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getmoresendemaildialog" /*void*/ ,(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currenttagcode" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_currentcld" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_currentimagelist" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 2349;BA.debugLine="MsgboxAsync(\"Tem de seleccionar 1 ou mais imagen";
Debug.ShouldStop(4096);
appactiondialogs.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Tem de seleccionar 1 ou mais imagens para poder continuar!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta!"))),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 2351;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setimageselectedonreport(RemoteObject __ref,RemoteObject _this,RemoteObject _fname,RemoteObject _fsid) throws Exception{
try {
		Debug.PushSubsStack("SetImageSelectedOnReport (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1748);
if (RapidSub.canDelegate("setimageselectedonreport")) { __ref.runUserSub(false, "appactiondialogs","setimageselectedonreport", __ref, _this, _fname, _fsid); return;}
ResumableSub_SetImageSelectedOnReport rsub = new ResumableSub_SetImageSelectedOnReport(null,__ref,_this,_fname,_fsid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetImageSelectedOnReport extends BA.ResumableSub {
public ResumableSub_SetImageSelectedOnReport(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _this,RemoteObject _fname,RemoteObject _fsid) {
this.parent = parent;
this.__ref = __ref;
this._this = _this;
this._fname = _fname;
this._fsid = _fsid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _this;
RemoteObject _fname;
RemoteObject _fsid;
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetImageSelectedOnReport (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1748);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("this", _this);
Debug.locals.put("fname", _fname);
Debug.locals.put("fsid", _fsid);
 BA.debugLineNum = 1749;BA.debugLine="Dim sSQL As String = $\"update dta_requests_values";
Debug.ShouldStop(1048576);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values_images set on_report="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"OnReport" /*RemoteObject*/ )))),RemoteObject.createImmutable(" where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and\n"),RemoteObject.createImmutable("							item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' and imagename='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fname.runMethod(true,"getText")))),RemoteObject.createImmutable("' and conf_sid_id="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fsid))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1751;BA.debugLine="Utils.SaveSQLToLog(\"imageSelectedOnReport_Click\",";
Debug.ShouldStop(4194304);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("imageSelectedOnReport_Click")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 1754;BA.debugLine="Dim params As Map";
Debug.ShouldStop(33554432);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1755;BA.debugLine="params.Initialize";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1756;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1757;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 1758;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 1759;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1760;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 1761;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 1762;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1763;BA.debugLine="params.Put(\"ACLAValueFileImage\", fname.Text)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_fname.runMethod(true,"getText"))));
 BA.debugLineNum = 1764;BA.debugLine="params.Put(\"ACLAOnReport\", this.OnReport)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAOnReport"))),(Object)((_this.getField(true,"OnReport" /*RemoteObject*/ ))));
 BA.debugLineNum = 1765;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1766;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCount";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1767;BA.debugLine="params.Put(\"ACLAConfSid\", fsid)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAConfSid"))),(Object)((_fsid)));
 BA.debugLineNum = 1768;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1769;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1770;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1771;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1772;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1773;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1774;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1775;BA.debugLine="If (params.IsInitialized) Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 10;
if ((_params.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1777;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(65536);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/update2")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1778;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1779;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Requ";
Debug.ShouldStop(262144);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1781;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(1048576);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1782;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(2097152);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 1784;BA.debugLine="Sleep(250)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "setimageselectedonreport"),BA.numberCast(int.class, 250));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1786;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _showobjectgallery_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("showObjectGallery_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3889);
if (RapidSub.canDelegate("showobjectgallery_click")) { return __ref.runUserSub(false, "appactiondialogs","showobjectgallery_click", __ref);}
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
 BA.debugLineNum = 3889;BA.debugLine="Sub showObjectGallery_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 3890;BA.debugLine="ApplActionDialog.CloseDialog(DialogResponse.PO";
Debug.ShouldStop(131072);
__ref.getField(false,"_applactiondialog" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(appactiondialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 BA.debugLineNum = 3891;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(262144);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 3892;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(524288);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3893;BA.debugLine="Filter.AddMoreImagesToObject(CurrentActivity,Curr";
Debug.ShouldStop(1048576);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_addmoreimagestoobject" /*void*/ ,(Object)(__ref.getField(false,"_currentactivity" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_associateimagescompletelist" /*RemoteObject*/ )));
 BA.debugLineNum = 3894;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _signpanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SignPanel_Touch (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1364);
if (RapidSub.canDelegate("signpanel_touch")) { return __ref.runUserSub(false, "appactiondialogs","signpanel_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 1364;BA.debugLine="Sub SignPanel_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1365;BA.debugLine="SignatureCapture.Panel_Touch(Signature, x, y, Act";
Debug.ShouldStop(1048576);
appactiondialogs._signaturecapture.runVoidMethod ("_panel_touch" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_signature" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_action));
 BA.debugLineNum = 1366;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takeas_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("takeAS_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1067);
if (RapidSub.canDelegate("takeas_click")) { return __ref.runUserSub(false, "appactiondialogs","takeas_click", __ref);}
 BA.debugLineNum = 1067;BA.debugLine="Sub takeAS_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1068;BA.debugLine="takeASClick(\"\", \"\",0)";
Debug.ShouldStop(2048);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_takeasclick" /*void*/ ,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1069;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _takeasclick(RemoteObject __ref,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _actionforce) throws Exception{
try {
		Debug.PushSubsStack("takeASClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1071);
if (RapidSub.canDelegate("takeasclick")) { __ref.runUserSub(false, "appactiondialogs","takeasclick", __ref, _tagcodetpa, _grouptpa, _actionforce); return;}
ResumableSub_takeASClick rsub = new ResumableSub_takeASClick(null,__ref,_tagcodetpa,_grouptpa,_actionforce);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_takeASClick extends BA.ResumableSub {
public ResumableSub_takeASClick(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _tagcodetpa,RemoteObject _grouptpa,RemoteObject _actionforce) {
this.parent = parent;
this.__ref = __ref;
this._tagcodetpa = _tagcodetpa;
this._grouptpa = _grouptpa;
this._actionforce = _actionforce;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _tagcodetpa;
RemoteObject _grouptpa;
RemoteObject _actionforce;
RemoteObject _thetagcode = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("takeASClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1071);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("tagcodeTPA", _tagcodetpa);
Debug.locals.put("groupTPA", _grouptpa);
Debug.locals.put("actionforce", _actionforce);
 BA.debugLineNum = 1073;BA.debugLine="Dim theTagcode As String = CurrentCLAItem.Tagcode";
Debug.ShouldStop(65536);
_thetagcode = __ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim");Debug.locals.put("theTagcode", _thetagcode);Debug.locals.put("theTagcode", _thetagcode);
 BA.debugLineNum = 1075;BA.debugLine="If Utils.NNE(PressedAnswerTagCode) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_pressedanswertagcode" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1076;BA.debugLine="theTagcode = PressedAnswerTagCode";
Debug.ShouldStop(524288);
_thetagcode = __ref.getField(true,"_pressedanswertagcode" /*RemoteObject*/ );Debug.locals.put("theTagcode", _thetagcode);
 if (true) break;
;
 BA.debugLineNum = 1079;BA.debugLine="If (Utils.NNE(theTagcode)) Then";
Debug.ShouldStop(4194304);

case 4:
//if
this.state = 9;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_thetagcode))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1080;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
Debug.ShouldStop(8388608);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thetagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1090;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
Debug.ShouldStop(2);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 1099;BA.debugLine="Utils.SaveSQLToLog(\"takeAS_Click\",sSQL, CurrentCL";
Debug.ShouldStop(1024);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("takeAS_Click")),(Object)(_ssql),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 1102;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8192);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1103;BA.debugLine="params.Initialize";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1104;BA.debugLine="params.Clear";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1105;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1106;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 1107;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 1108;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1109;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 1110;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.UniqueK";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 1111;BA.debugLine="params.Put(\"ACLTagcode\", theTagcode)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((_thetagcode)));
 BA.debugLineNum = 1112;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ))));
 BA.debugLineNum = 1113;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repea";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1114;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repea";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1115;BA.debugLine="params.Put(\"ACLARepeatField\", CurrentCLAItem.repe";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1116;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1117;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1118;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1119;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1120;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1121;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1122;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1124;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(8);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/obs/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1125;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not";
Debug.ShouldStop(16);
if (true) break;

case 10:
//if
this.state = 15;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 1126;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCLA";
Debug.ShouldStop(32);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1128;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(128);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1129;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(256);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 1131;BA.debugLine="Sleep(250)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "takeasclick"),BA.numberCast(int.class, 250));
this.state = 16;
return;
case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 1133;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(4096);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1134;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(8192);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1136;BA.debugLine="Filter.GetMoreNewActionsDialog(ThisActivityName_T";
Debug.ShouldStop(32768);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getmorenewactionsdialog" /*void*/ ,(Object)(__ref.getField(false,"_thisactivityname_tasklistdialog" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currenttagcode" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")),(Object)(_thetagcode),(Object)(__ref.getField(false,"_currentcld" /*RemoteObject*/ )),(Object)(_tagcodetpa),(Object)(_grouptpa),(Object)(_actionforce));
 BA.debugLineNum = 1138;BA.debugLine="End Sub";
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
public static void  _takegeophoto_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("takeGeoPhoto_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3586);
if (RapidSub.canDelegate("takegeophoto_click")) { __ref.runUserSub(false, "appactiondialogs","takegeophoto_click", __ref); return;}
ResumableSub_takeGeoPhoto_Click rsub = new ResumableSub_takeGeoPhoto_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_takeGeoPhoto_Click extends BA.ResumableSub {
public ResumableSub_takeGeoPhoto_Click(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _recordrow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _latitude = RemoteObject.createImmutable("");
RemoteObject _longitude = RemoteObject.createImmutable("");
RemoteObject _ssqll = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _location = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("takeGeoPhoto_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,3586);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 3593;BA.debugLine="Dim RecordRow As Cursor";
Debug.ShouldStop(256);
_recordrow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("RecordRow", _recordrow);
 BA.debugLineNum = 3594;BA.debugLine="Dim Latitude As String = \"\"";
Debug.ShouldStop(512);
_latitude = BA.ObjectToString("");Debug.locals.put("Latitude", _latitude);Debug.locals.put("Latitude", _latitude);
 BA.debugLineNum = 3595;BA.debugLine="Dim Longitude As String = \"\"";
Debug.ShouldStop(1024);
_longitude = BA.ObjectToString("");Debug.locals.put("Longitude", _longitude);Debug.locals.put("Longitude", _longitude);
 BA.debugLineNum = 3598;BA.debugLine="If(Utils.NNE( CurrentCLAItem.Tagcode)) Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3599;BA.debugLine="Dim sSQLL As String = $\"select execute_latitude,";
Debug.ShouldStop(16384);
_ssqll = (RemoteObject.concat(RemoteObject.createImmutable("select execute_latitude, execute_longitude from dta_requests_values\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQLL", _ssqll);Debug.locals.put("sSQLL", _ssqll);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3609;BA.debugLine="Dim sSQLL As String = $\"select execute_latitude,";
Debug.ShouldStop(16777216);
_ssqll = (RemoteObject.concat(RemoteObject.createImmutable("select execute_latitude, execute_longitude from dta_requests_values\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQLL", _ssqll);Debug.locals.put("sSQLL", _ssqll);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3622;BA.debugLine="RecordRow = Starter.LocalSQLEVC.ExecQuery(sSQLL)";
Debug.ShouldStop(32);
_recordrow = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssqll)));
 BA.debugLineNum = 3623;BA.debugLine="If RecordRow.RowCount > 0 Then";
Debug.ShouldStop(64);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_recordrow.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3624;BA.debugLine="RecordRow.Position = 0";
Debug.ShouldStop(128);
_recordrow.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3625;BA.debugLine="Latitude = RecordRow.GetString(\"execute_latitude";
Debug.ShouldStop(256);
_latitude = _recordrow.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("execute_latitude")));Debug.locals.put("Latitude", _latitude);
 BA.debugLineNum = 3626;BA.debugLine="Longitude = RecordRow.GetString(\"execute_longitu";
Debug.ShouldStop(512);
_longitude = _recordrow.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("execute_longitude")));Debug.locals.put("Longitude", _longitude);
 if (true) break;
;
 BA.debugLineNum = 3630;BA.debugLine="If(Utils.NNE(Latitude) And Utils.NNE(Longitude))";
Debug.ShouldStop(8192);

case 10:
//if
this.state = 27;
if ((RemoteObject.solveBoolean(".",parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_latitude))) && RemoteObject.solveBoolean(".",parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_longitude))))) { 
this.state = 12;
}else {
this.state = 26;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3632;BA.debugLine="If (Utils.NNE( CurrentCLAItem.Tagcode)) Then";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//if
this.state = 18;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 3633;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(65536);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("					where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("					and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 3642;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("					where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("					and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 3650;BA.debugLine="Utils.SaveSQLToLog(\"takePhoto_Click\",sSQL, Curre";
Debug.ShouldStop(2);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("takePhoto_Click")),(Object)(_ssql),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 3652;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","670778946",_ssql,0);
 BA.debugLineNum = 3653;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3654;BA.debugLine="params.Initialize";
Debug.ShouldStop(32);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3655;BA.debugLine="params.Clear";
Debug.ShouldStop(64);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3656;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3657;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 3658;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 3659;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 3660;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 3661;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.Unique";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 3662;BA.debugLine="params.Put(\"ACLTagcode\", CurrentCLAItem.Tagcode)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 3663;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ))));
 BA.debugLineNum = 3664;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repe";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3665;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repe";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 3666;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3667;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3668;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3669;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3670;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3671;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3672;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3673;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(16777216);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/obs/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3674;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
Debug.ShouldStop(33554432);
if (true) break;

case 19:
//if
this.state = 24;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 3675;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCL";
Debug.ShouldStop(67108864);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 3677;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(268435456);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3678;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(536870912);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 24:
//C
this.state = 27;
;
 BA.debugLineNum = 3680;BA.debugLine="Sleep(250)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "takegeophoto_click"),BA.numberCast(int.class, 250));
this.state = 28;
return;
case 28:
//C
this.state = 27;
;
 BA.debugLineNum = 3682;BA.debugLine="Dim location As Map";
Debug.ShouldStop(2);
_location = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("location", _location);
 BA.debugLineNum = 3683;BA.debugLine="location.Initialize";
Debug.ShouldStop(4);
_location.runVoidMethod ("Initialize");
 BA.debugLineNum = 3684;BA.debugLine="location.Put(\"latitude\", Latitude)";
Debug.ShouldStop(8);
_location.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("latitude"))),(Object)((_latitude)));
 BA.debugLineNum = 3685;BA.debugLine="location.Put(\"longitude\", Longitude)";
Debug.ShouldStop(16);
_location.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("longitude"))),(Object)((_longitude)));
 BA.debugLineNum = 3687;BA.debugLine="ShareCode.CalledFromAlerts = False";
Debug.ShouldStop(64);
parent._sharecode._calledfromalerts /*RemoteObject*/  = parent.__c.getField(true,"False");
 BA.debugLineNum = 3688;BA.debugLine="CallSubDelayed3(MapsActivity, \"StartMapsActivity";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((parent._mapsactivity.getObject())),(Object)(BA.ObjectToString("StartMapsActivity")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ))),(Object)((_location)));
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 3691;BA.debugLine="ToastMessageShow(\"Esta pergunta não tem localiza";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Esta pergunta não tem localização disponível")),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 3694;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _takenewdesign_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("takeNewDesign_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1853);
if (RapidSub.canDelegate("takenewdesign_click")) { return __ref.runUserSub(false, "appactiondialogs","takenewdesign_click", __ref);}
 BA.debugLineNum = 1853;BA.debugLine="Sub takeNewDesign_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1900;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takeobsoption_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("takeObsOption_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2330);
if (RapidSub.canDelegate("takeobsoption_click")) { return __ref.runUserSub(false, "appactiondialogs","takeobsoption_click", __ref);}
 BA.debugLineNum = 2330;BA.debugLine="Sub takeObsOption_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2331;BA.debugLine="obsOptions_ItemClick(obsOptions.SelectedIndex, \"\"";
Debug.ShouldStop(67108864);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_obsoptions_itemclick" /*void*/ ,(Object)(__ref.getField(false,"_obsoptions" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2332;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _takephoto_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("takePhoto_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1788);
if (RapidSub.canDelegate("takephoto_click")) { __ref.runUserSub(false, "appactiondialogs","takephoto_click", __ref); return;}
ResumableSub_takePhoto_Click rsub = new ResumableSub_takePhoto_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_takePhoto_Click extends BA.ResumableSub {
public ResumableSub_takePhoto_Click(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("takePhoto_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,1788);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1795;BA.debugLine="If (Utils.NNE( CurrentCLAItem.Tagcode)) Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1796;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
Debug.ShouldStop(8);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1805;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
Debug.ShouldStop(4096);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ )))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1813;BA.debugLine="Utils.SaveSQLToLog(\"takePhoto_Click\",sSQL, Curren";
Debug.ShouldStop(1048576);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("takePhoto_Click")),(Object)(_ssql),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 1816;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8388608);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1817;BA.debugLine="params.Initialize";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1818;BA.debugLine="params.Clear";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1819;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1820;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 1821;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 1822;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1823;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 1824;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.UniqueK";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 1825;BA.debugLine="params.Put(\"ACLTagcode\", CurrentCLAItem.Tagcode)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1826;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((__ref.getField(true,"_currentitemnotestext" /*RemoteObject*/ ))));
 BA.debugLineNum = 1827;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repea";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1828;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repea";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 1829;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1830;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1831;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1832;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1833;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1834;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1835;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1836;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(2048);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/obs/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1837;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1838;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCLA";
Debug.ShouldStop(8192);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1840;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(32768);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1841;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(65536);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1843;BA.debugLine="Sleep(250)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "takephoto_click"),BA.numberCast(int.class, 250));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 1845;BA.debugLine="CallSubDelayed3(CameraActivity2, \"StartCamera2\",";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((parent._cameraactivity2.getObject())),(Object)(BA.ObjectToString("StartCamera2")),(Object)(__ref),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ))));
 BA.debugLineNum = 1847;BA.debugLine="End Sub";
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
public static RemoteObject  _takesignature_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("takeSignature_Click (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,948);
if (RapidSub.canDelegate("takesignature_click")) { return __ref.runUserSub(false, "appactiondialogs","takesignature_click", __ref);}
 BA.debugLineNum = 948;BA.debugLine="Sub takeSignature_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 949;BA.debugLine="SignPanelView.Visible = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_signpanelview" /*RemoteObject*/ ).runMethod(true,"setVisible",appactiondialogs.__c.getField(true,"True"));
 BA.debugLineNum = 950;BA.debugLine="PanelSignature.Visible = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_panelsignature" /*RemoteObject*/ ).runMethod(true,"setVisible",appactiondialogs.__c.getField(true,"True"));
 BA.debugLineNum = 951;BA.debugLine="takeSignature.Visible = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_takesignature" /*RemoteObject*/ ).runMethod(true,"setVisible",appactiondialogs.__c.getField(true,"False"));
 BA.debugLineNum = 952;BA.debugLine="SignPerson.Text = \"Responsável\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_signperson" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Responsável"));
 BA.debugLineNum = 953;BA.debugLine="SignatureCapture.Clear(Signature)";
Debug.ShouldStop(16777216);
appactiondialogs._signaturecapture.runVoidMethod ("_clear" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_signature" /*RemoteObject*/ )));
 BA.debugLineNum = 955;BA.debugLine="SignCanvas.Initialize(SignPanel)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_signcanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_signpanel" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 957;BA.debugLine="Signature.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_signature" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 958;BA.debugLine="Signature.Canvas = SignCanvas";
Debug.ShouldStop(536870912);
__ref.getField(false,"_signature" /*RemoteObject*/ ).setField ("Canvas" /*RemoteObject*/ ,__ref.getField(false,"_signcanvas" /*RemoteObject*/ ));
 BA.debugLineNum = 959;BA.debugLine="Signature.Panel = SignPanel";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_signature" /*RemoteObject*/ ).setField ("Panel" /*RemoteObject*/ ,__ref.getField(false,"_signpanel" /*RemoteObject*/ ));
 BA.debugLineNum = 960;BA.debugLine="Signature.SignatureColor = Colors.Black";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_signature" /*RemoteObject*/ ).setField ("SignatureColor" /*RemoteObject*/ ,appactiondialogs.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 961;BA.debugLine="Signature.SignatureWidth = 3dip";
Debug.ShouldStop(1);
__ref.getField(false,"_signature" /*RemoteObject*/ ).setField ("SignatureWidth" /*RemoteObject*/ ,appactiondialogs.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 962;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatenotestoserver(RemoteObject __ref,RemoteObject _tagcode,RemoteObject _itemnotestext) throws Exception{
try {
		Debug.PushSubsStack("UpdateNotesToServer (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,4130);
if (RapidSub.canDelegate("updatenotestoserver")) { __ref.runUserSub(false, "appactiondialogs","updatenotestoserver", __ref, _tagcode, _itemnotestext); return;}
ResumableSub_UpdateNotesToServer rsub = new ResumableSub_UpdateNotesToServer(null,__ref,_tagcode,_itemnotestext);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateNotesToServer extends BA.ResumableSub {
public ResumableSub_UpdateNotesToServer(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _tagcode,RemoteObject _itemnotestext) {
this.parent = parent;
this.__ref = __ref;
this._tagcode = _tagcode;
this._itemnotestext = _itemnotestext;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _tagcode;
RemoteObject _itemnotestext;
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateNotesToServer (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,4130);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("ItemNotesText", _itemnotestext);
 BA.debugLineNum = 4132;BA.debugLine="If (Utils.NNE(Tagcode)) Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tagcode))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 4133;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
Debug.ShouldStop(16);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemnotestext))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 4143;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
Debug.ShouldStop(16384);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_notes='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemnotestext))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				where request_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and task_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and item_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and unique_key='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and repeatcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatitemcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 4152;BA.debugLine="Utils.SaveSQLToLog(\"takeAS_Click\",sSQL, CurrentCL";
Debug.ShouldStop(8388608);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("takeAS_Click")),(Object)(_ssql),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 4154;BA.debugLine="Dim params As Map";
Debug.ShouldStop(33554432);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 4155;BA.debugLine="params.Initialize";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 4156;BA.debugLine="params.Clear";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 4157;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 4158;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLRequest"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 4159;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAction"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 4160;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTask"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 4161;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 4162;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.UniqueK";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLUniqueKey"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 4163;BA.debugLine="params.Put(\"ACLTagcode\", Tagcode)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLTagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 4164;BA.debugLine="params.Put(\"ACLAObs\", ItemNotesText)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObs"))),(Object)((_itemnotestext)));
 BA.debugLineNum = 4165;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repea";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 4166;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repea";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 4167;BA.debugLine="params.Put(\"ACLARepeatField\", CurrentCLAItem.repe";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"repeatfieldcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 4168;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 4169;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 4170;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 4171;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 4172;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 4173;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 4174;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 4175;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(16384);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/obs/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 4176;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 4177;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCLA";
Debug.ShouldStop(65536);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 4179;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(262144);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(__ref.getField(false,"_currentclaitem" /*RemoteObject*/ ).getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 4180;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(524288);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 4182;BA.debugLine="Sleep(250)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "updatenotestoserver"),BA.numberCast(int.class, 250));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 4183;BA.debugLine="End Sub";
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
public static RemoteObject  _updatethisimagefile2db(RemoteObject __ref,RemoteObject _filename,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("updateThisImageFile2DB (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("updatethisimagefile2db")) { return __ref.runUserSub(false, "appactiondialogs","updatethisimagefile2db", __ref, _filename, _id);}
RemoteObject _ssql = RemoteObject.createImmutable("");
Debug.locals.put("filename", _filename);
Debug.locals.put("id", _id);
 BA.debugLineNum = 157;BA.debugLine="Sub updateThisImageFile2DB(filename As String, id";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Dim sSQL As String = $\"update dta_requests_values";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values_images set imagename='"),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("' where id="),appactiondialogs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 159;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(1073741824);
appactiondialogs._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _uploadfileswithftp(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTP (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2240);
if (RapidSub.canDelegate("uploadfileswithftp")) { return __ref.runUserSub(false, "appactiondialogs","uploadfileswithftp", __ref, _filename);}
ResumableSub_UploadFilesWithFTP rsub = new ResumableSub_UploadFilesWithFTP(null,__ref,_filename);
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
public static class ResumableSub_UploadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTP(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _filename) {
this.parent = parent;
this.__ref = __ref;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _filename;
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTP (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2240);
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
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 2241;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(1);
_ret = parent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2242;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(2);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 2243;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(4);
_myftp.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2244;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(8);
_myftp.runMethod(true,"setPassiveMode",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2248;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(128);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2249;BA.debugLine="Log(filename)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","669271561",_filename,0);
 BA.debugLineNum = 2250;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
Debug.ShouldStop(512);
_sf = _myftp.runMethod(false,"UploadFile",__ref.getField(false, "ba"),(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.__c.getField(true,"False")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_filename)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2251;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "uploadfileswithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2252;BA.debugLine="If Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2253;BA.debugLine="Log(\"file was uploaded successfully\")";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","669271565",RemoteObject.createImmutable("file was uploaded successfully"),0);
 BA.debugLineNum = 2254;BA.debugLine="ret = True";
Debug.ShouldStop(8192);
_ret = parent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2256;BA.debugLine="Log(\"Error uploading file\")";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","669271568",RemoteObject.createImmutable("Error uploading file"),0);
 BA.debugLineNum = 2257;BA.debugLine="ret = False";
Debug.ShouldStop(65536);
_ret = parent.__c.getField(true,"False");Debug.locals.put("ret", _ret);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2259;BA.debugLine="myFTP.Close";
Debug.ShouldStop(262144);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 2260;BA.debugLine="Return ret";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ret));return;};
 BA.debugLineNum = 2261;BA.debugLine="End Sub";
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
public static void  _ftp_uploadcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _uploadfileswithftpcamimage(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTPCamImage (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,4098);
if (RapidSub.canDelegate("uploadfileswithftpcamimage")) { return __ref.runUserSub(false, "appactiondialogs","uploadfileswithftpcamimage", __ref, _filename);}
ResumableSub_UploadFilesWithFTPCamImage rsub = new ResumableSub_UploadFilesWithFTPCamImage(null,__ref,_filename);
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
public static class ResumableSub_UploadFilesWithFTPCamImage extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTPCamImage(xevolution.vrcg.devdemov2400.appactiondialogs parent,RemoteObject __ref,RemoteObject _filename) {
this.parent = parent;
this.__ref = __ref;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
RemoteObject _filename;
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTPCamImage (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,4098);
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
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 4099;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(4);
_ret = parent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 4100;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(8);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 4101;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(16);
_myftp.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 4102;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(32);
_myftp.runMethod(true,"setPassiveMode",parent.__c.getField(true,"True"));
 BA.debugLineNum = 4106;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(512);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 4107;BA.debugLine="Log(filename)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","671303177",_filename,0);
 BA.debugLineNum = 4108;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
Debug.ShouldStop(2048);
_sf = _myftp.runMethod(false,"UploadFile",__ref.getField(false, "ba"),(Object)(parent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.__c.getField(true,"False")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_filename)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 4109;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "uploadfileswithftpcamimage"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 4110;BA.debugLine="If Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 4111;BA.debugLine="Log(\"file was uploaded successfully\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","671303181",RemoteObject.createImmutable("file was uploaded successfully"),0);
 BA.debugLineNum = 4112;BA.debugLine="ret = True";
Debug.ShouldStop(32768);
_ret = parent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 4114;BA.debugLine="Log(\"Error uploading file\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","671303184",RemoteObject.createImmutable("Error uploading file"),0);
 BA.debugLineNum = 4115;BA.debugLine="ret = False";
Debug.ShouldStop(262144);
_ret = parent.__c.getField(true,"False");Debug.locals.put("ret", _ret);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 4117;BA.debugLine="myFTP.Close";
Debug.ShouldStop(1048576);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 4118;BA.debugLine="Sleep(250)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "appactiondialogs", "uploadfileswithftpcamimage"),BA.numberCast(int.class, 250));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 4120;BA.debugLine="Log(\"UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","671303190",RemoteObject.createImmutable("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU"),0);
 BA.debugLineNum = 4121;BA.debugLine="Log(\"upload\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","671303191",RemoteObject.createImmutable("upload"),0);
 BA.debugLineNum = 4122;BA.debugLine="Log(\"UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","671303192",RemoteObject.createImmutable("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU"),0);
 BA.debugLineNum = 4123;BA.debugLine="Return ret";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ret));return;};
 BA.debugLineNum = 4124;BA.debugLine="End Sub";
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
public static RemoteObject  _viewsimplelist_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ViewSimpleList_ItemClick (appactiondialogs) ","appactiondialogs",14,__ref.getField(false, "ba"),__ref,2394);
if (RapidSub.canDelegate("viewsimplelist_itemclick")) { return __ref.runUserSub(false, "appactiondialogs","viewsimplelist_itemclick", __ref, _index, _value);}
RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2394;BA.debugLine="Sub ViewSimpleList_ItemClick (Index As Int, Value";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2395;BA.debugLine="Dim clv As CustomListView = Sender";
Debug.ShouldStop(67108864);
_clv = (appactiondialogs.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("clv", _clv);Debug.locals.put("clv", _clv);
 BA.debugLineNum = 2396;BA.debugLine="Dim pan As Panel = clv.GetPanel(Index)";
Debug.ShouldStop(134217728);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _clv.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pan", _pan);
 BA.debugLineNum = 2397;BA.debugLine="CallSub2(ThisActivityName_TaskListDialog, \"TaskLi";
Debug.ShouldStop(268435456);
appactiondialogs.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_thisactivityname_tasklistdialog" /*RemoteObject*/ )),(Object)(BA.ObjectToString("TaskListItemSelected")),(Object)(_pan.runMethod(false,"getTag")));
 BA.debugLineNum = 2398;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_currentcld" /*RemoteObject*/ ).runVoidMethod ("CloseDialog",__ref.getField(false, "ba"),(Object)(appactiondialogs.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 BA.debugLineNum = 2399;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}